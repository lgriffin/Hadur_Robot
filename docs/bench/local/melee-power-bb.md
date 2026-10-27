# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 128 over 6 battles (21.3 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 85.2 | 44 / 210 | 2.33 | 16.5% | 27385 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.8% | 141 |
| hadur2.Hadur 3.17.1bb | 2.0 | 16.5% | 44 |
| sgp.JollyNinja 3.53 | 3.8 | 11.8% | 15 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 10.8% | 2 |
| mz.MicroGodMelee 1 | 4.5 | 10.6% | 5 |
| lorneswork.Predator 1.0 | 5.3 | 9.9% | 4 |
| adt.Ar2 1.0 | 7.2 | 7.1% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 7.8 | 5.5% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 85.4 | 6 / 35 | 4186 |
| 2 | 2 | 65.4 | 82.9 | 9 / 35 | 4418 |
| 3 | 2 | 65.9 | 86.0 | 7 / 35 | 4491 |
| 4 | 2 | 66.7 | 86.3 | 7 / 35 | 5012 |
| 5 | 2 | 65.4 | 81.6 | 6 / 35 | 4660 |
| 6 | 2 | 67.2 | 89.2 | 9 / 35 | 4618 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 117 | 9% |
| sgp.JollyNinja 3.53 | 19 | 74% |
| mz.MicroGodMelee 1 | 13 | 85% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 80% |
| lorneswork.Predator 1.0 | 3 | 100% |
| adt.Ar2 1.0 | 1 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 168 of 210 rounds, at a mean tick of 1149. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 119 | 71% | 134 |
| sgp.JollyNinja 3.53 | 14 | 8% | 24 |
| simonton.nano.WeekendObsession_Melee 1.0 | 12 | 7% | 15 |
| lorneswork.Predator 1.0 | 10 | 6% | 15 |
| mz.MicroGodMelee 1 | 8 | 5% | 17 |
| kawigi.sbf.FloodSonnet 0.9 | 3 | 2% | 4 |
| adt.Ar2 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 144903 melee ticks, 78193 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 64 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 46178 sent, 41778 reached their opponent, 9191 virtual hits (22.0% of those reached).

## Melee bench: F02

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 13 other Robocode JVMs running (hadur.bench.MeleeRunner x13), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 176 over 6 battles (29.3 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 84.4 | 85 / 210 | 2.40 | 17.3% | 25238 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.3% | 85 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.3 | 14.1% | 36 |
| pulsar.PulsarMax 0.8.9 | 2.7 | 13.5% | 40 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.3 | 10.7% | 19 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.6% | 1 |
| Noran.BitchingElk 0.054 | 6.8 | 8.3% | 18 |
| sch.Simone 0.3d | 7.0 | 8.0% | 9 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 7.9% | 1 |
| stelo.PatternRobot 1.0 | 9.0 | 5.5% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 81.3 | 14 / 35 | 4128 |
| 2 | 1 | 66.5 | 85.7 | 15 / 35 | 4127 |
| 3 | 1 | 65.9 | 85.1 | 9 / 35 | 4218 |
| 4 | 1 | 67.0 | 85.7 | 17 / 35 | 4300 |
| 5 | 1 | 66.5 | 84.1 | 13 / 35 | 4280 |
| 6 | 1 | 67.0 | 84.8 | 17 / 35 | 4185 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 45 | 47% |
| pulsar.PulsarMax 0.8.9 | 40 | 58% |
| com.cohesiva.robocode.ManOwaR 1.0 | 24 | 63% |
| Noran.BitchingElk 0.054 | 12 | 42% |
| sch.Simone 0.3d | 10 | 70% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 88% |
| fnc.bandit.Bandit 5.2.0 | 5 | 80% |
| stelo.PatternRobot 1.0 | 1 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 1005. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 40 | 32% | 62 |
| pulsar.PulsarMax 0.8.9 | 31 | 25% | 54 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 12% | 22 |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 9% | 26 |
| Noran.BitchingElk 0.054 | 9 | 7% | 13 |
| stelo.PatternRobot 1.0 | 8 | 6% | 8 |
| sch.Simone 0.3d | 7 | 6% | 13 |
| fnc.bandit.Bandit 5.2.0 | 4 | 3% | 10 |
| fullsail.SweetTea 1.1 | 0 | 0% | 2 |

Posture (Hadur's M records, 202 rounds): 175960 melee ticks, 40432 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 69 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 69 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 61704 sent, 57277 reached their opponent, 10271 virtual hits (17.9% of those reached).

## Melee bench: F03

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 7 other Robocode JVMs running (hadur.bench.MeleeRunner x7), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 174 over 6 battles (29.0 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 93.1 | 163 / 210 | 1.62 | 20.0% | 33428 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 20.0% | 163 |
| radnor.DoctorBob 1.42 | 2.3 | 14.6% | 20 |
| vuen.Cake 2.51 | 3.3 | 12.5% | 13 |
| kawigi.nano.Lib 1.0 | 3.3 | 12.6% | 11 |
| urdos.URDOS 1.3 | 5.0 | 9.1% | 1 |
| adt.Ar1 2.1 | 6.0 | 7.9% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.7 | 6.8% | 0 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.7% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.0% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 91.7 | 26 / 35 | 5300 |
| 2 | 1 | 70.2 | 93.7 | 29 / 35 | 5464 |
| 3 | 1 | 70.5 | 94.3 | 28 / 35 | 5727 |
| 4 | 1 | 70.7 | 94.9 | 28 / 35 | 5622 |
| 5 | 1 | 70.2 | 92.1 | 27 / 35 | 5858 |
| 6 | 1 | 69.8 | 92.1 | 25 / 35 | 5457 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 76 | 99% |
| vuen.Cake 2.51 | 57 | 93% |
| kawigi.nano.Lib 1.0 | 29 | 93% |
| oa.weak.FlyMk1 0.1 | 5 | 80% |
| urdos.URDOS 1.3 | 3 | 67% |
| adt.Ar1 2.1 | 2 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 20 | 42% | 73 |
| kawigi.nano.Lib 1.0 | 9 | 19% | 45 |
| vuen.Cake 2.51 | 8 | 17% | 60 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 8% | 5 |
| urdos.URDOS 1.3 | 3 | 6% | 6 |
| oa.weak.FlyMk1 0.1 | 2 | 4% | 12 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 2% | 1 |
| adt.Ar1 2.1 | 0 | 0% | 5 |

Posture (Hadur's M records, 198 rounds): 133792 melee ticks, 35370 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 55 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 40687 sent, 36369 reached their opponent, 9749 virtual hits (26.8% of those reached).

## Melee bench: F04

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 289 over 6 battles (48.2 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 83.4 | 20 / 210 | 2.49 | 16.0% | 27233 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.1% | 171 |
| hadur2.Hadur 3.17.1bb | 2.0 | 16.0% | 20 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.5% | 10 |
| TNT.TNT 0.99.1 | 4.3 | 10.6% | 9 |
| josago.Jorgito 0.16 | 4.7 | 9.7% | 1 |
| css.Delitioner 0.11 | 6.3 | 7.1% | 1 |
| tj.zombie1n 1.0.1 | 6.8 | 6.8% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.8% | 0 |
| spin.Bugstard 0.012b | 9.3 | 3.8% | 0 |
| sp.Nanos.Ember 1.1 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 81.3 | 4 / 35 | 4543 |
| 2 | 2 | 66.6 | 84.4 | 6 / 35 | 4702 |
| 3 | 2 | 66.2 | 85.4 | 2 / 35 | 4473 |
| 4 | 2 | 67.0 | 86.7 | 5 / 35 | 4738 |
| 5 | 2 | 65.6 | 81.9 | 3 / 35 | 4553 |
| 6 | 2 | 64.6 | 81.0 | 0 / 35 | 4224 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 117 | 6% |
| apc.LeeroyJenkins2 1.0 | 9 | 56% |
| TNT.TNT 0.99.1 | 8 | 50% |
| josago.Jorgito 0.16 | 2 | 100% |
| tj.zombie1n 1.0.1 | 1 | 100% |
| rampancy.Durandal 2.1d | 1 | 100% |

Hadur died in 195 of 210 rounds, at a mean tick of 1259. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 135 | 69% | 142 |
| apc.LeeroyJenkins2 1.0 | 23 | 12% | 27 |
| josago.Jorgito 0.16 | 14 | 7% | 16 |
| TNT.TNT 0.99.1 | 12 | 6% | 16 |
| tj.zombie1n 1.0.1 | 5 | 3% | 6 |
| css.Delitioner 0.11 | 2 | 1% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 200141 melee ticks, 59970 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 73 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 62931 sent, 58280 reached their opponent, 9092 virtual hits (15.6% of those reached).

## Melee bench: F05

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 398 over 6 battles (66.3 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 76.5 | 21 / 210 | 3.11 | 14.1% | 19647 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 19.3% | 122 |
| justin.DemonicRage 3.4 | 2.0 | 16.7% | 49 |
| hadur2.Hadur 3.17.1bb | 3.0 | 14.1% | 21 |
| wompi.Numbat 2.1 | 4.0 | 12.1% | 9 |
| axeBots.HataMoto 3.09 | 5.3 | 9.0% | 7 |
| ms.Ares 0.19 | 5.7 | 9.2% | 2 |
| supersample.SuperBoxBot 1.0 | 7.3 | 5.7% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.3% | 0 |
| GarmBox.Oranges 1.0 | 9.2 | 4.2% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.0 | 76.2 | 6 / 35 | 3103 |
| 2 | 3 | 63.6 | 79.0 | 4 / 35 | 3481 |
| 3 | 3 | 63.9 | 79.7 | 5 / 35 | 3522 |
| 4 | 3 | 60.7 | 71.4 | 3 / 35 | 3234 |
| 5 | 3 | 62.7 | 79.4 | 2 / 35 | 3197 |
| 6 | 3 | 61.0 | 73.3 | 1 / 35 | 3110 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 42 | 7% |
| justin.DemonicRage 3.4 | 28 | 36% |
| wompi.Numbat 2.1 | 8 | 63% |
| ms.Ares 0.19 | 3 | 67% |
| axeBots.HataMoto 3.09 | 2 | 50% |

Hadur died in 192 of 210 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 79 | 41% | 84 |
| justin.DemonicRage 3.4 | 67 | 35% | 75 |
| wompi.Numbat 2.1 | 17 | 9% | 22 |
| axeBots.HataMoto 3.09 | 15 | 8% | 17 |
| ms.Ares 0.19 | 7 | 4% | 8 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 2 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 155357 melee ticks, 32193 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 64 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 48431 sent, 43914 reached their opponent, 7758 virtual hits (17.7% of those reached).

## Melee bench: F06

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 114 over 6 battles (19.0 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 87.9 | 118 / 210 | 2.09 | 18.4% | 27429 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.4% | 118 |
| jekl.StoneGhost 0.7 | 2.2 | 14.5% | 19 |
| origin.SleepSiphon 1.7b | 2.8 | 13.5% | 39 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.2 | 12.7% | 20 |
| mld.Wisdom 1.0 | 5.0 | 10.2% | 2 |
| gg.Wolverine 2.0 | 6.2 | 8.3% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 7.3% | 9 |
| spinnercat.Omen 1.0 | 8.3 | 6.3% | 0 |
| DBall.NUKE 0.1 | 8.3 | 5.7% | 0 |
| sample.Fire 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 86.0 | 14 / 35 | 4276 |
| 2 | 1 | 66.3 | 84.1 | 16 / 35 | 4228 |
| 3 | 1 | 68.7 | 87.0 | 22 / 35 | 4908 |
| 4 | 1 | 68.8 | 88.3 | 21 / 35 | 4734 |
| 5 | 1 | 69.0 | 90.8 | 22 / 35 | 4506 |
| 6 | 1 | 69.3 | 91.4 | 23 / 35 | 4777 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 53 | 87% |
| origin.SleepSiphon 1.7b | 43 | 67% |
| pe.minimelee.SandboxMiniMelee 1.1 | 27 | 78% |
| gg.Wolverine 2.0 | 15 | 87% |
| ers.nano.hawk.HawkLA 3.0m | 8 | 63% |
| mld.Wisdom 1.0 | 4 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 31 | 33% | 64 |
| jekl.StoneGhost 0.7 | 26 | 27% | 60 |
| pe.minimelee.SandboxMiniMelee 1.1 | 14 | 15% | 35 |
| mld.Wisdom 1.0 | 8 | 8% | 16 |
| gg.Wolverine 2.0 | 7 | 7% | 17 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 6% | 13 |
| spinnercat.Omen 1.0 | 1 | 1% | 4 |
| DBall.NUKE 0.1 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 153197 melee ticks, 40753 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 34 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 47901 sent, 43566 reached their opponent, 10206 virtual hits (23.4% of those reached).

## Melee bench: F07

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 88 over 6 battles (14.7 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 91.6 | 105 / 210 | 1.76 | 19.5% | 33922 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.5% | 105 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 17.6% | 48 |
| rtk.Tachikoma 1.0 | 2.8 | 16.2% | 30 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 11.1% | 10 |
| franzor.Lizt 1.3.1 | 4.7 | 11.2% | 18 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 7.8% | 0 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.8% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.2 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 92.1 | 17 / 35 | 5685 |
| 2 | 1 | 71.2 | 93.3 | 21 / 35 | 5474 |
| 3 | 1 | 71.7 | 93.7 | 20 / 35 | 5821 |
| 4 | 1 | 70.6 | 92.4 | 16 / 35 | 5305 |
| 5 | 1 | 70.9 | 89.8 | 17 / 35 | 5948 |
| 6 | 1 | 70.1 | 88.3 | 14 / 35 | 5689 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 70 | 71% |
| rsalesc.melee.Monk 0.3.6c | 56 | 30% |
| franzor.Lizt 1.3.1 | 30 | 67% |
| oog.melee.CapuletDroid 1.1 | 24 | 71% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 1438. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 47 | 45% | 82 |
| rtk.Tachikoma 1.0 | 34 | 32% | 94 |
| franzor.Lizt 1.3.1 | 12 | 11% | 0 |
| oog.melee.CapuletDroid 1.1 | 10 | 10% | 27 |
| lrem.micro.MoggFanatic 0.2 | 2 | 2% | 4 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 3 |

Posture (Hadur's M records, 203 rounds): 193088 melee ticks, 90888 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 32 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 58829 sent, 54425 reached their opponent, 11691 virtual hits (21.5% of those reached).

## Melee bench: F08

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 610 over 6 battles (101.7 per battle, most in one battle 144). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 88.5 | 120 / 210 | 2.03 | 18.3% | 26235 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.3% | 120 |
| tm.Yuugao 1.0 | 2.5 | 13.1% | 34 |
| shrub.Vapour v159 | 2.7 | 12.6% | 22 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 11.4% | 15 |
| m3thos.Eva00 1.1 | 5.2 | 9.3% | 0 |
| com.spp.robocode.MostlyHarmless 010 | 5.8 | 9.5% | 12 |
| jwst.DAD.DarkAndDarker 1.1 | 7.0 | 8.0% | 7 |
| qualidafial.MajorDick 1.0.1 | 8.2 | 7.0% | 2 |
| SHAM.WOW 1.4 | 9.3 | 5.5% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 84.4 | 16 / 35 | 4379 |
| 2 | 1 | 68.7 | 93.7 | 22 / 35 | 4463 |
| 3 | 1 | 67.4 | 88.6 | 21 / 35 | 4329 |
| 4 | 1 | 67.6 | 88.9 | 20 / 35 | 4279 |
| 5 | 1 | 67.7 | 87.6 | 20 / 35 | 4347 |
| 6 | 1 | 67.6 | 87.9 | 21 / 35 | 4438 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 48 | 65% |
| shrub.Vapour v159 | 45 | 73% |
| Krabb.sliNk.Garm 0.9u | 30 | 77% |
| com.spp.robocode.MostlyHarmless 010 | 17 | 71% |
| jwst.DAD.DarkAndDarker 1.1 | 10 | 80% |
| m3thos.Eva00 1.1 | 7 | 100% |
| qualidafial.MajorDick 1.0.1 | 5 | 80% |
| SHAM.WOW 1.4 | 3 | 67% |

Hadur died in 97 of 210 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 25 | 26% | 59 |
| Krabb.sliNk.Garm 0.9u | 20 | 21% | 38 |
| shrub.Vapour v159 | 18 | 19% | 52 |
| com.spp.robocode.MostlyHarmless 010 | 15 | 15% | 25 |
| jwst.DAD.DarkAndDarker 1.1 | 8 | 8% | 18 |
| zyx.nano.BacillusComma 1.0 | 2 | 2% | 4 |
| m3thos.Eva00 1.1 | 1 | 1% | 9 |
| SHAM.WOW 1.4 | 1 | 1% | 4 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 147479 melee ticks, 44562 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 65 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 48979 sent, 44502 reached their opponent, 8821 virtual hits (19.8% of those reached).

## Melee bench: F09

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 307 over 6 battles (51.2 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 74.5 | 44 / 210 | 3.30 | 14.3% | 18550 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.7% | 106 |
| hadur2.Hadur 3.17.1bb | 2.2 | 14.3% | 44 |
| kc.micro.Figment 1.0 | 2.8 | 14.2% | 25 |
| yagami.Tidus 0.11 | 4.3 | 10.9% | 5 |
| pedersen.Grishnakh 1.0 | 5.0 | 10.5% | 14 |
| mc2.enemy.Original 0.9 | 5.7 | 9.6% | 13 |
| dft.Calliope 5.6 | 7.0 | 7.8% | 3 |
| step.nanoPri 1.0 | 8.3 | 5.4% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 4.9% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 77.5 | 6 / 35 | 3213 |
| 2 | 2 | 61.6 | 72.1 | 7 / 35 | 3188 |
| 3 | 2 | 62.0 | 74.3 | 10 / 35 | 3107 |
| 4 | 2 | 62.4 | 73.7 | 11 / 35 | 3209 |
| 5 | 2 | 63.4 | 80.3 | 8 / 35 | 3161 |
| 6 | 3 | 58.9 | 69.2 | 2 / 35 | 2672 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 53 | 28% |
| kc.micro.Figment 1.0 | 21 | 81% |
| pedersen.Grishnakh 1.0 | 8 | 63% |
| mc2.enemy.Original 0.9 | 7 | 29% |
| yagami.Tidus 0.11 | 6 | 67% |
| dft.Calliope 5.6 | 1 | 100% |

Hadur died in 168 of 210 rounds, at a mean tick of 833. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 71 | 42% | 84 |
| kc.micro.Figment 1.0 | 34 | 20% | 47 |
| yagami.Tidus 0.11 | 21 | 13% | 27 |
| mc2.enemy.Original 0.9 | 15 | 9% | 20 |
| pedersen.Grishnakh 1.0 | 13 | 8% | 18 |
| robar.nano.Assertive_Melee 0.2 | 6 | 4% | 7 |
| dft.Calliope 5.6 | 4 | 2% | 4 |
| step.nanoPri 1.0 | 1 | 1% | 1 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 148505 melee ticks, 33893 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 40 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 49752 sent, 45264 reached their opponent, 6780 virtual hits (15.0% of those reached).

## Melee bench: F10

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 121 over 6 battles (20.2 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 95.2 | 167 / 210 | 1.43 | 20.1% | 30571 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 20.1% | 167 |
| DTF.Kludgy 1.2b | 2.2 | 14.4% | 27 |
| ne.Chimera 1.2 | 3.2 | 12.7% | 4 |
| ejb.Polaris 1.0.1 | 3.8 | 11.7% | 8 |
| vStar.RAFzilla 2.15 | 5.3 | 10.4% | 2 |
| tvv.micro.Antares 1.1.1 | 5.5 | 9.7% | 1 |
| sam.Samspin 1.0 | 7.3 | 6.1% | 0 |
| kurios.DOSexe .9b | 8.5 | 5.4% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.8 | 4.8% | 0 |
| donjezza.Muncho 1.0 | 9.3 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 93.0 | 25 / 35 | 5236 |
| 2 | 1 | 70.5 | 95.9 | 28 / 35 | 4930 |
| 3 | 1 | 70.6 | 96.8 | 27 / 35 | 4992 |
| 4 | 1 | 71.7 | 98.7 | 31 / 35 | 5578 |
| 5 | 1 | 70.5 | 96.2 | 30 / 35 | 4832 |
| 6 | 1 | 69.6 | 90.8 | 26 / 35 | 5003 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 64 | 75% |
| ejb.Polaris 1.0.1 | 44 | 91% |
| ne.Chimera 1.2 | 31 | 97% |
| vStar.RAFzilla 2.15 | 29 | 97% |
| tvv.micro.Antares 1.1.1 | 13 | 100% |
| donjezza.Muncho 1.0 | 4 | 75% |
| kurios.DOSexe .9b | 3 | 100% |
| sam.Samspin 1.0 | 2 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 951. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 26 | 59% | 68 |
| ne.Chimera 1.2 | 7 | 16% | 35 |
| ejb.Polaris 1.0.1 | 5 | 11% | 47 |
| vStar.RAFzilla 2.15 | 2 | 5% | 24 |
| tvv.micro.Antares 1.1.1 | 2 | 5% | 16 |
| kurios.DOSexe .9b | 1 | 2% | 12 |
| donjezza.Muncho 1.0 | 1 | 2% | 4 |
| sam.Samspin 1.0 | 0 | 0% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 144839 melee ticks, 57832 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 67 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 67 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 48507 sent, 44216 reached their opponent, 9090 virtual hits (20.6% of those reached).

## Melee bench: F11

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 431 over 6 battles (71.8 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 79.7 | 66 / 210 | 2.82 | 15.7% | 20944 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.3 | 16.2% | 60 |
| hadur2.Hadur 3.17.1bb | 1.7 | 15.7% | 66 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.3% | 24 |
| djc.DynaBot 0.1.1 | 4.2 | 11.0% | 12 |
| br2.MobyDickBot 1.6 | 5.3 | 9.7% | 17 |
| rdt199.Warlord 0.73 | 5.7 | 9.2% | 20 |
| uji.YellohFellah 1.0 | 7.2 | 8.3% | 11 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.5% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.3% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 83.8 | 13 / 35 | 3604 |
| 2 | 2 | 63.3 | 78.7 | 7 / 35 | 3521 |
| 3 | 2 | 65.5 | 84.8 | 13 / 35 | 3661 |
| 4 | 1 | 65.8 | 84.8 | 16 / 35 | 3730 |
| 5 | 2 | 62.7 | 77.5 | 10 / 35 | 3295 |
| 6 | 2 | 59.9 | 68.9 | 7 / 35 | 3133 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 44 | 59% |
| cx.mini.Nimrod 0.55 | 17 | 53% |
| rdt199.Warlord 0.73 | 17 | 41% |
| br2.MobyDickBot 1.6 | 13 | 46% |
| uji.YellohFellah 1.0 | 12 | 75% |
| djc.DynaBot 0.1.1 | 12 | 58% |
| KiraNL.Chupacabra 0.4 | 2 | 50% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 902. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 54 | 36% | 81 |
| cx.mini.Nimrod 0.55 | 27 | 18% | 35 |
| rdt199.Warlord 0.73 | 19 | 13% | 28 |
| djc.DynaBot 0.1.1 | 15 | 10% | 24 |
| br2.MobyDickBot 1.6 | 13 | 9% | 16 |
| KiraNL.Chupacabra 0.4 | 8 | 5% | 10 |
| uji.YellohFellah 1.0 | 4 | 3% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 2% | 3 |
| stelo.MirrorNano 1.3 | 2 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 162201 melee ticks, 33961 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 40 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 52795 sent, 48233 reached their opponent, 6786 virtual hits (14.1% of those reached).

## Melee bench: F12

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 201 over 6 battles (33.5 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 81.7 | 100 / 210 | 2.64 | 16.4% | 20151 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 16.4% | 100 |
| bts.wiki.RipCurl 0.9b | 2.5 | 13.9% | 32 |
| darkcanuck.Leon 1.01 | 2.8 | 13.5% | 28 |
| nat.PallasHawk 1.0 | 3.7 | 13.0% | 28 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.2% | 15 |
| jrm.Test0 1.0 | 6.3 | 8.2% | 0 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.4% | 4 |
| jp.Perpy 16.0 | 7.7 | 6.7% | 1 |
| jaybot.bots.Oddball 4.0 | 9.5 | 5.2% | 2 |
| stuff.Vlad 0.1 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 82.5 | 16 / 35 | 3362 |
| 2 | 1 | 63.5 | 77.1 | 16 / 35 | 3211 |
| 3 | 1 | 64.5 | 80.3 | 18 / 35 | 3202 |
| 4 | 1 | 66.9 | 86.3 | 20 / 35 | 3745 |
| 5 | 1 | 64.1 | 81.0 | 13 / 35 | 3362 |
| 6 | 1 | 65.0 | 83.2 | 17 / 35 | 3269 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 40 | 73% |
| bts.wiki.RipCurl 0.9b | 38 | 79% |
| nat.PallasHawk 1.0 | 37 | 76% |
| brainfade.melee.Genghis 0.36 | 12 | 67% |
| jrm.Test0 1.0 | 2 | 100% |
| jp.Perpy 16.0 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 0% |
| stuff.Vlad 0.1 | 1 | 100% |
| jaybot.bots.Oddball 4.0 | 1 | 0% |

Hadur died in 111 of 210 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.Leon 1.01 | 28 | 25% | 61 |
| bts.wiki.RipCurl 0.9b | 25 | 23% | 44 |
| nat.PallasHawk 1.0 | 16 | 14% | 49 |
| brainfade.melee.Genghis 0.36 | 15 | 14% | 20 |
| jrm.Test0 1.0 | 12 | 11% | 13 |
| jp.Perpy 16.0 | 5 | 5% | 8 |
| cs.sheldor.Talon 1.1 | 4 | 4% | 4 |
| jaybot.bots.Oddball 4.0 | 3 | 3% | 4 |
| stuff.Vlad 0.1 | 2 | 2% | 6 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 132725 melee ticks, 30530 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 41 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 45003 sent, 40585 reached their opponent, 7238 virtual hits (17.8% of those reached).

## Melee bench: F13

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 85 over 6 battles (14.2 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 79.6 | 51 / 210 | 2.83 | 14.9% | 21250 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.5 | 16.7% | 39 |
| mn.Combat 3.25.0 | 1.8 | 16.8% | 87 |
| hadur2.Hadur 3.17.1bb | 2.7 | 14.9% | 51 |
| shinh.Entangled 0.3 | 4.2 | 12.5% | 20 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.6% | 12 |
| apc.Colossus2 0.17 | 6.0 | 8.0% | 1 |
| stelo.Wang 1.0 | 7.2 | 6.8% | 0 |
| ayk.WallHugger 1.0 | 8.3 | 4.8% | 0 |
| maribo.FollowFire 1 | 8.5 | 4.8% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.6 | 77.1 | 10 / 35 | 3684 |
| 2 | 3 | 62.3 | 76.5 | 3 / 35 | 3533 |
| 3 | 3 | 63.7 | 80.3 | 6 / 35 | 3474 |
| 4 | 1 | 66.1 | 86.0 | 14 / 35 | 3925 |
| 5 | 3 | 62.2 | 75.9 | 6 / 35 | 3323 |
| 6 | 3 | 64.2 | 81.9 | 12 / 35 | 3311 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 42 | 29% |
| ags.Glacier 0.2.11 | 29 | 72% |
| shinh.Entangled 0.3 | 19 | 58% |
| gh.micro.Gruweltje 0.7 | 11 | 55% |
| apc.Colossus2 0.17 | 1 | 0% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 50 | 31% | 67 |
| ags.Glacier 0.2.11 | 49 | 31% | 70 |
| shinh.Entangled 0.3 | 23 | 14% | 30 |
| gh.micro.Gruweltje 0.7 | 17 | 11% | 23 |
| stelo.Wang 1.0 | 10 | 6% | 10 |
| apc.Colossus2 0.17 | 6 | 4% | 6 |
| maribo.FollowFire 1 | 3 | 2% | 3 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 204 rounds): 146447 melee ticks, 36583 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 85 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 85 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 44004 sent, 39280 reached their opponent, 6675 virtual hits (17.0% of those reached).

## Melee bench: F14

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 145 over 6 battles (24.2 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 93.4 | 155 / 210 | 1.59 | 19.8% | 30368 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.8% | 155 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.3% | 22 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.4% | 19 |
| Lo_Ian.Gandalf_V4 4.0 | 5.0 | 9.8% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 5.2 | 9.5% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.5 | 9.1% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.0 | 8.4% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.7% | 4 |
| pa.Improved 1.0 | 9.0 | 5.8% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 92.7 | 27 / 35 | 5293 |
| 2 | 1 | 70.2 | 93.3 | 26 / 35 | 5160 |
| 3 | 1 | 69.7 | 93.0 | 26 / 35 | 5001 |
| 4 | 1 | 70.4 | 94.6 | 29 / 35 | 5013 |
| 5 | 1 | 69.8 | 93.3 | 23 / 35 | 4980 |
| 6 | 1 | 70.3 | 93.7 | 24 / 35 | 4921 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 79 | 91% |
| catcat20.shape.Theta 0.018 | 56 | 75% |
| sanyi.mikrobi.Roberto 1.0 | 16 | 88% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 83% |
| co.edu.usb.rc.LidisTron 1.0 | 9 | 89% |
| Lo_Ian.Gandalf_V4 4.0 | 5 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 858. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 18 | 33% | 85 |
| catcat20.shape.Theta 0.018 | 17 | 31% | 57 |
| co.edu.usb.rc.LidisTron 1.0 | 6 | 11% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 7% | 18 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 5% | 18 |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 5% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 8 |
| pa.Improved 1.0 | 2 | 4% | 3 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 201 rounds): 142399 melee ticks, 53162 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 40 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 45827 sent, 41614 reached their opponent, 10906 virtual hits (26.2% of those reached).

## Melee bench: F15

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 7 other Robocode JVMs running (hadur.bench.MeleeRunner x7), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 114 over 6 battles (19.0 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 84.2 | 102 / 210 | 2.42 | 17.7% | 27283 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.7% | 102 |
| kawigi.micro.Shiz 1.1 | 2.3 | 14.3% | 23 |
| emp.Yngwie 1.11 | 3.2 | 13.6% | 52 |
| mld.DustBunny 3.8 | 3.7 | 12.7% | 9 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.4% | 10 |
| kawigi.robot.Girl 1.2 | 5.8 | 8.9% | 11 |
| lambdaxy.TBot 0.1 | 7.5 | 6.7% | 0 |
| Grystrion.TrackerWO 1.0 | 8.0 | 6.3% | 1 |
| divineomega.TrialBot 0.003 | 8.8 | 5.0% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 86.0 | 21 / 35 | 4833 |
| 2 | 1 | 67.2 | 86.0 | 17 / 35 | 4416 |
| 3 | 1 | 67.5 | 85.4 | 19 / 35 | 4547 |
| 4 | 1 | 66.8 | 83.5 | 14 / 35 | 4495 |
| 5 | 1 | 66.3 | 80.3 | 16 / 35 | 4570 |
| 6 | 1 | 66.6 | 84.1 | 15 / 35 | 4422 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 55 | 53% |
| kawigi.micro.Shiz 1.1 | 30 | 97% |
| cb.nano.Insomnia 1.0 | 17 | 82% |
| kawigi.robot.Girl 1.2 | 17 | 82% |
| mld.DustBunny 3.8 | 14 | 86% |
| Grystrion.TrackerWO 1.0 | 2 | 100% |
| divineomega.TrialBot 0.003 | 2 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 957. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 48 | 44% | 88 |
| mld.DustBunny 3.8 | 14 | 13% | 35 |
| kawigi.micro.Shiz 1.1 | 12 | 11% | 41 |
| cb.nano.Insomnia 1.0 | 12 | 11% | 13 |
| kawigi.robot.Girl 1.2 | 10 | 9% | 16 |
| divineomega.TrialBot 0.003 | 4 | 4% | 8 |
| Grystrion.TrackerWO 1.0 | 4 | 4% | 5 |
| lambdaxy.TBot 0.1 | 4 | 4% | 4 |

Posture (Hadur's M records, 204 rounds): 167208 melee ticks, 43814 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 42 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 54717 sent, 50274 reached their opponent, 8728 virtual hits (17.4% of those reached).

## Melee bench: F16

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 107 over 6 battles (17.8 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 88.9 | 114 / 210 | 2.00 | 19.0% | 29929 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.0% | 114 |
| gh.Griezel 0.5.2 | 2.0 | 16.6% | 51 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.8% | 8 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 11.0% | 30 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.2% | 2 |
| tvv.nano.Polaris 1.2 | 6.2 | 8.7% | 1 |
| stelo.IntrinsicVolatility 1.4 | 6.5 | 7.3% | 1 |
| asd.Cthulhu 1.3 | 8.8 | 4.9% | 2 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 4.9% | 1 |
| repositorio.NanoStep 1.0 | 9.2 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 86.3 | 18 / 35 | 4522 |
| 2 | 1 | 69.1 | 88.3 | 20 / 35 | 4759 |
| 3 | 1 | 70.4 | 93.0 | 21 / 35 | 5016 |
| 4 | 1 | 70.2 | 90.2 | 21 / 35 | 5413 |
| 5 | 1 | 70.0 | 91.7 | 20 / 35 | 5309 |
| 6 | 1 | 67.5 | 83.8 | 14 / 35 | 4910 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 84 | 68% |
| techdude.forest.FlamingForest 1.1 | 41 | 68% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 14 | 93% |
| stelo.IntrinsicVolatility 1.4 | 6 | 83% |
| bvh.fnr.Fenrir 0.36l | 6 | 67% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |
| tvv.nano.Polaris 1.2 | 3 | 100% |
| asd.Cthulhu 1.3 | 1 | 0% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 1185. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 48 | 50% | 100 |
| techdude.forest.FlamingForest 1.1 | 20 | 21% | 51 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 10 | 10% | 23 |
| bvh.fnr.Fenrir 0.36l | 10 | 10% | 14 |
| stelo.IntrinsicVolatility 1.4 | 3 | 3% | 9 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 5 |
| asd.Cthulhu 1.3 | 2 | 2% | 2 |
| tvv.nano.Polaris 1.2 | 1 | 1% | 4 |
| repositorio.NanoStep 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 207 rounds): 190419 melee ticks, 64384 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 50 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 61120 sent, 56662 reached their opponent, 9996 virtual hits (17.6% of those reached).

## Melee bench: F17

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 447 over 6 battles (74.5 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 83.3 | 85 / 210 | 2.50 | 17.6% | 29279 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.6% | 85 |
| et.Predator 1.8 | 2.8 | 13.9% | 26 |
| cx.BlestPain 1.41 | 2.8 | 13.5% | 50 |
| oog.melee.Mercutio 1.0 | 3.3 | 13.4% | 37 |
| ahf.NanoAndrew .4 | 5.7 | 10.0% | 5 |
| nic.Nicator 2.4 | 5.8 | 9.7% | 5 |
| maribo.melee.BMV 0.1 | 6.5 | 8.9% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 8.2 | 5.5% | 0 |
| tex.Longbot 0.4 | 8.8 | 5.1% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 84.8 | 10 / 35 | 4934 |
| 2 | 1 | 69.0 | 87.3 | 17 / 35 | 5177 |
| 3 | 1 | 66.0 | 78.7 | 14 / 35 | 4747 |
| 4 | 1 | 68.5 | 87.3 | 20 / 35 | 4818 |
| 5 | 1 | 65.1 | 79.0 | 10 / 35 | 4570 |
| 6 | 1 | 67.5 | 82.9 | 14 / 35 | 5033 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 48 | 65% |
| et.Predator 1.8 | 37 | 70% |
| cx.BlestPain 1.41 | 32 | 22% |
| nic.Nicator 2.4 | 9 | 89% |
| maribo.melee.BMV 0.1 | 6 | 83% |
| ahf.NanoAndrew .4 | 6 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |
| goblin.Bender 2.4 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 1022. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 42 | 33% | 52 |
| et.Predator 1.8 | 29 | 22% | 56 |
| oog.melee.Mercutio 1.0 | 26 | 20% | 52 |
| ahf.NanoAndrew .4 | 12 | 9% | 18 |
| nic.Nicator 2.4 | 7 | 5% | 14 |
| maribo.melee.BMV 0.1 | 7 | 5% | 12 |
| tex.Longbot 0.4 | 2 | 2% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 3 |
| goblin.Bender 2.4 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 170996 melee ticks, 51712 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 41 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 57214 sent, 52654 reached their opponent, 12024 virtual hits (22.8% of those reached).

## Melee bench: F18

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 151 over 6 battles (25.2 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 89.6 | 133 / 210 | 1.93 | 18.8% | 26392 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.8% | 133 |
| morbid.MorbidPriest 1.0 | 2.3 | 13.5% | 30 |
| agd.Mooserwirt2 2.7 | 3.2 | 12.0% | 20 |
| uji.DBH 1.1 | 3.5 | 11.4% | 12 |
| spinnercat.Robovirus 2.718 | 6.0 | 9.0% | 4 |
| sigterm.Sigterm 1.0 | 6.0 | 8.7% | 7 |
| ratosh.Nobo 0.21 | 6.3 | 8.4% | 2 |
| kawigi.mini.Fhqwhgads 1.1 | 7.7 | 7.4% | 2 |
| stelo.WangRobot 1.0 | 9.5 | 5.5% | 1 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 86.7 | 19 / 35 | 3793 |
| 2 | 1 | 66.7 | 84.4 | 18 / 35 | 4349 |
| 3 | 1 | 68.9 | 91.1 | 23 / 35 | 4587 |
| 4 | 1 | 68.7 | 91.1 | 24 / 35 | 4399 |
| 5 | 1 | 69.4 | 91.4 | 25 / 35 | 4704 |
| 6 | 1 | 69.6 | 93.0 | 24 / 35 | 4560 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 58 | 74% |
| uji.DBH 1.1 | 33 | 82% |
| agd.Mooserwirt2 2.7 | 32 | 81% |
| sigterm.Sigterm 1.0 | 14 | 93% |
| spinnercat.Robovirus 2.718 | 10 | 80% |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 88% |
| ratosh.Nobo 0.21 | 6 | 83% |
| stelo.WangRobot 1.0 | 4 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 26 | 33% | 68 |
| agd.Mooserwirt2 2.7 | 19 | 24% | 40 |
| uji.DBH 1.1 | 13 | 16% | 33 |
| spinnercat.Robovirus 2.718 | 7 | 9% | 14 |
| sigterm.Sigterm 1.0 | 4 | 5% | 20 |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 5% | 12 |
| ratosh.Nobo 0.21 | 3 | 4% | 14 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 3% | 4 |
| stelo.WangRobot 1.0 | 0 | 0% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 136506 melee ticks, 42411 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 51 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 46554 sent, 42170 reached their opponent, 9855 virtual hits (23.4% of those reached).

## Melee bench: F19

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 118 over 6 battles (19.7 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 96.7 | 188 / 210 | 1.30 | 21.4% | 33026 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 21.4% | 188 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 14.6% | 8 |
| mld.Infinity 2.2 | 3.2 | 12.9% | 7 |
| krillr.mini.JointStrike 2.0.0 | 3.8 | 11.6% | 2 |
| erdnis.Rover 0.3 | 4.8 | 10.3% | 2 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.6% | 0 |
| mbh.Mbh 0.1 | 7.2 | 7.1% | 0 |
| pac.ABC 2.1 | 7.7 | 6.9% | 3 |
| pbg.R2D2 1.0 | 9.0 | 5.5% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 95.6 | 28 / 35 | 5198 |
| 2 | 1 | 72.9 | 97.8 | 32 / 35 | 5583 |
| 3 | 1 | 72.4 | 95.9 | 31 / 35 | 5633 |
| 4 | 1 | 71.9 | 94.6 | 32 / 35 | 5416 |
| 5 | 1 | 72.5 | 97.1 | 31 / 35 | 5504 |
| 6 | 1 | 73.1 | 99.4 | 34 / 35 | 5692 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 97 | 97% |
| mld.Infinity 2.2 | 37 | 100% |
| krillr.mini.JointStrike 2.0.0 | 23 | 96% |
| erdnis.Rover 0.3 | 18 | 94% |
| pac.ABC 2.1 | 9 | 100% |
| patson.PatsonTestBot 1.0 | 8 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 22 of 210 rounds, at a mean tick of 722. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| krillr.mini.JointStrike 2.0.0 | 7 | 32% | 30 |
| davidalves.net.DuelistMiniMelee 1.2 | 6 | 27% | 72 |
| erdnis.Rover 0.3 | 6 | 27% | 32 |
| mld.Infinity 2.2 | 2 | 9% | 29 |
| patson.PatsonTestBot 1.0 | 1 | 5% | 18 |
| pac.ABC 2.1 | 0 | 0% | 10 |
| pbg.R2D2 1.0 | 0 | 0% | 9 |
| mbh.Mbh 0.1 | 0 | 0% | 6 |

Posture (Hadur's M records, 199 rounds): 129642 melee ticks, 45609 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 48 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 44181 sent, 40027 reached their opponent, 9938 virtual hits (24.8% of those reached).

## Melee bench: F20

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 113 over 6 battles (18.8 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 91.2 | 141 / 210 | 1.80 | 20.0% | 31933 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 20.0% | 141 |
| trm.Wrekt 1.1.6.f | 2.0 | 16.1% | 36 |
| fwb.Nine 1.0.1 | 3.2 | 11.3% | 14 |
| nz.jdc.nano.GridFu 1.0 | 4.2 | 10.5% | 2 |
| catcat20.Rabbit 0.001 | 4.8 | 9.7% | 12 |
| m3thos.mini.Eva01 0.5.5 | 5.8 | 8.4% | 1 |
| bayen.nut.Squirrel 1.615 | 7.3 | 7.7% | 2 |
| djdjdj.NanoSkunk10 1.0 | 8.2 | 6.7% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.5 | 5.6% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 89.2 | 23 / 35 | 5434 |
| 2 | 1 | 69.4 | 88.6 | 23 / 35 | 5249 |
| 3 | 1 | 70.8 | 93.7 | 25 / 35 | 5480 |
| 4 | 1 | 69.6 | 91.1 | 22 / 35 | 5009 |
| 5 | 1 | 69.8 | 90.2 | 22 / 35 | 5369 |
| 6 | 1 | 71.1 | 94.3 | 26 / 35 | 5392 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 82 | 80% |
| fwb.Nine 1.0.1 | 36 | 94% |
| catcat20.Rabbit 0.001 | 23 | 78% |
| nz.jdc.nano.GridFu 1.0 | 13 | 85% |
| bayen.nut.Squirrel 1.615 | 6 | 83% |
| m3thos.mini.Eva01 0.5.5 | 4 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 0% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 991. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 39 | 56% | 92 |
| fwb.Nine 1.0.1 | 12 | 17% | 25 |
| catcat20.Rabbit 0.001 | 8 | 11% | 33 |
| nz.jdc.nano.GridFu 1.0 | 5 | 7% | 27 |
| bayen.nut.Squirrel 1.615 | 2 | 3% | 10 |
| ntc.ControlledChaos 1.1.4 | 2 | 3% | 2 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 12 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 201 rounds): 166472 melee ticks, 53219 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 32 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 53434 sent, 48996 reached their opponent, 12181 virtual hits (24.9% of those reached).

## Melee bench: F21

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 522 over 6 battles (87.0 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 91.7 | 120 / 210 | 1.75 | 19.6% | 31464 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.6% | 120 |
| eem.EvBot v4.6.16 | 2.0 | 16.5% | 63 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.7% | 10 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.3% | 7 |
| eld.Hmm 1.0 | 5.2 | 8.8% | 13 |
| oa.weak.BotherBot 0.1 | 5.8 | 7.7% | 0 |
| el.JumpShoot 0.2 | 8.0 | 5.9% | 0 |
| fire219.CatBot 1.0 | 8.0 | 6.1% | 0 |
| PSW.Relentless 0.1 | 8.3 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 92.1 | 20 / 35 | 5298 |
| 2 | 1 | 69.8 | 92.7 | 21 / 35 | 4924 |
| 3 | 1 | 70.5 | 91.1 | 19 / 35 | 5877 |
| 4 | 1 | 69.8 | 91.4 | 21 / 35 | 5123 |
| 5 | 1 | 70.7 | 93.7 | 23 / 35 | 5433 |
| 6 | 1 | 68.3 | 89.2 | 16 / 35 | 4809 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 131 | 66% |
| cf.RiO.RiOx 4.2.1 | 15 | 80% |
| dummy.mini.Scimitar 1.01 | 15 | 80% |
| eld.Hmm 1.0 | 15 | 40% |
| el.JumpShoot 0.2 | 2 | 100% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 1319. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 49 | 52% | 104 |
| dummy.mini.Scimitar 1.01 | 15 | 16% | 39 |
| eld.Hmm 1.0 | 11 | 12% | 28 |
| cf.RiO.RiOx 4.2.1 | 11 | 12% | 25 |
| PSW.Relentless 0.1 | 3 | 3% | 3 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 8 |
| el.JumpShoot 0.2 | 0 | 0% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 183931 melee ticks, 78905 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 81 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 81 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 54815 sent, 50491 reached their opponent, 8991 virtual hits (17.8% of those reached).

## Melee bench: F22

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 113 over 6 battles (18.8 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 86.9 | 90 / 210 | 2.18 | 17.4% | 25397 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.2 | 17.4% | 90 |
| pe.SandboxDT 2.71m | 2.0 | 16.7% | 62 |
| kvk.HebusLeTroll 0.35 | 2.8 | 15.0% | 32 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.3% | 19 |
| bigpete.Stewie 1.0 | 5.0 | 10.9% | 7 |
| yk.JahRoslav 1.1 | 6.2 | 6.8% | 0 |
| tad.Dalek98 0.98 | 7.2 | 6.3% | 0 |
| gg.Squaraus 0.6 | 7.7 | 6.2% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.6% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 84.4 | 11 / 35 | 3869 |
| 2 | 1 | 68.0 | 86.0 | 16 / 35 | 4592 |
| 3 | 1 | 68.1 | 88.3 | 14 / 35 | 4418 |
| 4 | 1 | 67.4 | 86.7 | 17 / 35 | 4132 |
| 5 | 1 | 69.2 | 91.4 | 19 / 35 | 4369 |
| 6 | 1 | 66.4 | 84.4 | 13 / 35 | 4017 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 50 | 42% |
| jlm.javaDisturbance 0.59 | 41 | 78% |
| kvk.HebusLeTroll 0.35 | 32 | 66% |
| bigpete.Stewie 1.0 | 13 | 77% |
| pbg.NinjaX 1.2 | 3 | 100% |
| tad.Dalek98 0.98 | 2 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 966. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 49 | 40% | 77 |
| kvk.HebusLeTroll 0.35 | 36 | 30% | 55 |
| jlm.javaDisturbance 0.59 | 27 | 22% | 58 |
| bigpete.Stewie 1.0 | 6 | 5% | 13 |
| tad.Dalek98 0.98 | 1 | 1% | 2 |
| pbg.NinjaX 1.2 | 1 | 1% | 2 |
| yk.JahRoslav 1.1 | 1 | 1% | 1 |
| gg.Squaraus 0.6 | 0 | 0% | 2 |

Posture (Hadur's M records, 203 rounds): 167075 melee ticks, 43088 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 25 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 53290 sent, 48764 reached their opponent, 8200 virtual hits (16.8% of those reached).

## Melee bench: F23

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 386 over 6 battles (64.3 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 93.7 | 161 / 210 | 1.57 | 20.4% | 31280 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 20.4% | 161 |
| pe.SandboxLump 1.52 | 2.0 | 17.3% | 32 |
| cre.Karolos 0.32 | 3.0 | 14.1% | 12 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.2% | 2 |
| stelo.RamTrackSurfer 1.2 | 5.3 | 9.2% | 1 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.7 | 8.9% | 0 |
| cw.megas.Blade 0.8 | 6.7 | 8.1% | 0 |
| sample.Walls 1.0 | 7.8 | 7.3% | 2 |
| cli.WasteOfAmmo 1.0 | 9.2 | 2.5% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 93.0 | 26 / 35 | 5396 |
| 2 | 1 | 72.4 | 96.5 | 29 / 35 | 5559 |
| 3 | 1 | 71.6 | 93.3 | 26 / 35 | 5309 |
| 4 | 1 | 73.1 | 98.4 | 31 / 35 | 5254 |
| 5 | 1 | 70.8 | 89.2 | 24 / 35 | 4953 |
| 6 | 1 | 70.4 | 91.4 | 25 / 35 | 4809 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 101 | 86% |
| cre.Karolos 0.32 | 46 | 89% |
| stelo.AreaTargetingBot 1.1 | 13 | 100% |
| stelo.RamTrackSurfer 1.2 | 12 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 100% |
| sample.Walls 1.0 | 2 | 50% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 29 | 56% | 107 |
| cre.Karolos 0.32 | 12 | 23% | 49 |
| stelo.AreaTargetingBot 1.1 | 3 | 6% | 19 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 4% | 7 |
| sample.Walls 1.0 | 2 | 4% | 7 |
| cw.megas.Blade 0.8 | 1 | 2% | 1 |
| stelo.RamTrackSurfer 1.2 | 0 | 0% | 20 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 129824 melee ticks, 51266 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 40 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 41056 sent, 36697 reached their opponent, 11453 virtual hits (31.2% of those reached).

## Melee bench: F24

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 11 other Robocode JVMs running (hadur.bench.MeleeRunner x11), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 211 over 6 battles (35.2 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 78.4 | 61 / 210 | 2.94 | 15.3% | 20361 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.3 | 15.3% | 61 |
| rz.GlowBlowMelee 1.4 | 2.0 | 14.7% | 46 |
| florent.XSeries.X2 0.12 | 3.5 | 13.1% | 31 |
| davidalves.Phoenix 0.54 | 3.5 | 12.6% | 39 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.5% | 21 |
| oog.melee.Corsair 1.0 | 5.8 | 9.9% | 4 |
| stelo.SoJNanoMelee 1.1 | 7.5 | 6.8% | 7 |
| lunchie.Lunchbox 0.93 | 7.8 | 6.0% | 1 |
| as.FrankTheTank 1.3 | 8.8 | 5.5% | 0 |
| evd.X1 0.01 | 9.8 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.4 | 75.2 | 10 / 35 | 3386 |
| 2 | 2 | 63.5 | 78.7 | 11 / 35 | 3346 |
| 3 | 1 | 63.7 | 80.6 | 10 / 35 | 3390 |
| 4 | 1 | 63.1 | 79.0 | 9 / 35 | 3392 |
| 5 | 2 | 62.4 | 76.5 | 10 / 35 | 3238 |
| 6 | 1 | 64.3 | 80.3 | 11 / 35 | 3609 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 38 | 45% |
| pedersen.Ugluk 1.1.1 | 22 | 64% |
| davidalves.Phoenix 0.54 | 22 | 41% |
| florent.XSeries.X2 0.12 | 20 | 40% |
| stelo.SoJNanoMelee 1.1 | 11 | 73% |
| oog.melee.Corsair 1.0 | 6 | 83% |
| evd.X1 0.01 | 1 | 0% |

Hadur died in 153 of 210 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 42 | 27% | 68 |
| florent.XSeries.X2 0.12 | 34 | 22% | 40 |
| davidalves.Phoenix 0.54 | 28 | 18% | 41 |
| pedersen.Ugluk 1.1.1 | 21 | 14% | 27 |
| oog.melee.Corsair 1.0 | 15 | 10% | 19 |
| stelo.SoJNanoMelee 1.1 | 7 | 5% | 10 |
| evd.X1 0.01 | 2 | 1% | 2 |
| lunchie.Lunchbox 0.93 | 1 | 1% | 2 |
| as.FrankTheTank 1.3 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 139836 melee ticks, 31259 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 55 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 47467 sent, 42737 reached their opponent, 8405 virtual hits (19.7% of those reached).

## Melee bench: F25

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 95 over 6 battles (15.8 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 87.1 | 126 / 210 | 2.16 | 17.8% | 20928 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.8% | 126 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 14.0% | 28 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.8% | 16 |
| jdw.Hurricane 1.4 | 4.0 | 11.4% | 13 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.8% | 8 |
| ds.Oo 2.2 | 5.8 | 9.1% | 10 |
| gjr.Cephalosporin 0.1 | 7.3 | 7.4% | 5 |
| awesomeness.Elite 1.0 | 7.7 | 7.2% | 4 |
| adt.Ar2 1.1 | 8.7 | 6.2% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 84.8 | 19 / 35 | 3276 |
| 2 | 1 | 66.4 | 85.7 | 21 / 35 | 3334 |
| 3 | 1 | 68.3 | 92.7 | 23 / 35 | 3437 |
| 4 | 1 | 67.4 | 87.9 | 19 / 35 | 3718 |
| 5 | 1 | 66.3 | 83.5 | 22 / 35 | 3453 |
| 6 | 1 | 67.5 | 88.3 | 22 / 35 | 3710 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 56 | 79% |
| voidious.micro.BlitzBat 1.05 | 33 | 88% |
| jdw.Hurricane 1.4 | 28 | 89% |
| ds.Oo 2.2 | 16 | 63% |
| gre.svman4.Morfeas 1.4.1 | 13 | 92% |
| awesomeness.Elite 1.0 | 3 | 67% |
| adt.Ar2 1.1 | 2 | 100% |
| gjr.Cephalosporin 0.1 | 2 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 677. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 25 | 30% | 62 |
| voidious.micro.BlitzBat 1.05 | 18 | 21% | 42 |
| jdw.Hurricane 1.4 | 12 | 14% | 32 |
| ds.Oo 2.2 | 11 | 13% | 26 |
| gre.svman4.Morfeas 1.4.1 | 6 | 7% | 23 |
| gjr.Cephalosporin 0.1 | 6 | 7% | 9 |
| awesomeness.Elite 1.0 | 4 | 5% | 9 |
| adt.Ar2 1.1 | 2 | 2% | 4 |
| amk.ChumbaMini 0.2 | 0 | 0% | 3 |

Posture (Hadur's M records, 206 rounds): 131101 melee ticks, 31179 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 34 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 46864 sent, 42267 reached their opponent, 7518 virtual hits (17.8% of those reached).

## Melee bench: F26

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 13 other Robocode JVMs running (hadur.bench.MeleeRunner x13), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 339 over 6 battles (56.5 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 92.1 | 135 / 210 | 1.71 | 19.8% | 33390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.8% | 135 |
| ak.Fermat 2.0 | 2.2 | 14.1% | 30 |
| lrem.Spectre 0.4.4 | 3.3 | 12.3% | 15 |
| shu.nitro.LENIN .T34 | 3.8 | 11.8% | 17 |
| js.PinBall 1.6 | 4.7 | 11.0% | 6 |
| jaybot.adv.bots.JayBot 2.0 | 6.2 | 9.5% | 2 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 8.4% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 7.3% | 2 |
| sample.SpinBot 1.0 | 9.0 | 4.5% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 93.0 | 22 / 35 | 5854 |
| 2 | 1 | 68.8 | 89.2 | 20 / 35 | 4998 |
| 3 | 1 | 70.9 | 92.1 | 22 / 35 | 5910 |
| 4 | 1 | 70.1 | 91.4 | 22 / 35 | 5387 |
| 5 | 1 | 71.1 | 94.0 | 25 / 35 | 5683 |
| 6 | 1 | 70.6 | 93.0 | 24 / 35 | 5558 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 52 | 75% |
| lrem.Spectre 0.4.4 | 39 | 85% |
| shu.nitro.LENIN .T34 | 33 | 85% |
| js.PinBall 1.6 | 18 | 78% |
| jaybot.adv.bots.JayBot 2.0 | 12 | 92% |
| fullsail.LaxativeTeaTwo 1.0 | 9 | 78% |
| gh.mini.GrubbmOne 1.0 | 4 | 75% |

Hadur died in 78 of 210 rounds, at a mean tick of 992. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 25 | 32% | 66 |
| shu.nitro.LENIN .T34 | 16 | 21% | 47 |
| lrem.Spectre 0.4.4 | 15 | 19% | 44 |
| js.PinBall 1.6 | 9 | 12% | 25 |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 5% | 10 |
| jaybot.adv.bots.JayBot 2.0 | 3 | 4% | 11 |
| gh.mini.GrubbmOne 1.0 | 2 | 3% | 4 |
| sample.SpinBot 1.0 | 2 | 3% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 163085 melee ticks, 46393 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 24 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 53586 sent, 49186 reached their opponent, 12802 virtual hits (26.0% of those reached).

## Melee bench: F27

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 372 over 6 battles (62.0 per battle, most in one battle 113). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 92.6 | 164 / 210 | 1.66 | 20.2% | 29267 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 20.2% | 164 |
| mk.Alpha 0.2.1 | 2.8 | 13.5% | 22 |
| EH.Eagle 1.0.6 | 4.2 | 10.3% | 6 |
| techdude.kombat.FlamingKombat 1.5 | 4.7 | 9.5% | 3 |
| wee.Gem 1.8.4 | 5.0 | 9.1% | 7 |
| sheldor.melee.nano.TestMelee 0.1 | 6.0 | 8.9% | 1 |
| joe.ADinosaur 1.0 | 6.3 | 8.7% | 1 |
| throxbot.ThroxBot 0.1 | 6.8 | 8.7% | 5 |
| caimano.Furia_Ceca 0.22 | 8.5 | 6.6% | 1 |
| cs.Grudge 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 93.0 | 28 / 35 | 5074 |
| 2 | 1 | 69.8 | 92.4 | 28 / 35 | 4530 |
| 3 | 1 | 70.2 | 89.8 | 27 / 35 | 5243 |
| 4 | 1 | 68.0 | 87.6 | 22 / 35 | 4497 |
| 5 | 1 | 70.5 | 95.9 | 30 / 35 | 4474 |
| 6 | 1 | 71.4 | 97.1 | 29 / 35 | 5449 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 95 | 93% |
| EH.Eagle 1.0.6 | 31 | 97% |
| wee.Gem 1.8.4 | 16 | 94% |
| throxbot.ThroxBot 0.1 | 14 | 79% |
| techdude.kombat.FlamingKombat 1.5 | 9 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 7 | 86% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 732. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 14 | 29% | 86 |
| throxbot.ThroxBot 0.1 | 10 | 20% | 22 |
| EH.Eagle 1.0.6 | 6 | 12% | 33 |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 8% | 18 |
| joe.ADinosaur 1.0 | 4 | 8% | 13 |
| caimano.Furia_Ceca 0.22 | 3 | 6% | 5 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 4% | 15 |
| cs.Grudge 1.0 | 2 | 4% | 2 |
| wee.Gem 1.8.4 | 1 | 2% | 15 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 134992 melee ticks, 40314 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 42 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 44647 sent, 40161 reached their opponent, 10528 virtual hits (26.2% of those reached).

## Melee bench: F28

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 11 other Robocode JVMs running (hadur.bench.MeleeRunner x11), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 103 over 6 battles (17.2 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 88.0 | 126 / 210 | 2.08 | 17.9% | 22130 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.9% | 126 |
| kid.test.NightFox .2 | 2.0 | 14.9% | 29 |
| uji.Antique 1.0 | 3.2 | 12.6% | 30 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 10.4% | 9 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 10.0% | 4 |
| ahr.ice.Ice 1.0.2 | 6.0 | 8.4% | 6 |
| amk.ChumbaWumba 0.3 | 6.8 | 8.1% | 4 |
| stelo.Lifestealer 1.0 | 8.7 | 5.9% | 1 |
| matt.advanced.Katana 1.0 | 9.2 | 6.1% | 1 |
| stelo.PianistNano 1.2 | 9.2 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 86.0 | 18 / 35 | 3614 |
| 2 | 1 | 68.5 | 92.4 | 25 / 35 | 3898 |
| 3 | 1 | 68.1 | 92.4 | 23 / 35 | 3807 |
| 4 | 1 | 65.6 | 83.2 | 19 / 35 | 3597 |
| 5 | 1 | 66.9 | 87.3 | 19 / 35 | 3754 |
| 6 | 1 | 66.5 | 86.7 | 22 / 35 | 3460 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 70 | 79% |
| uji.Antique 1.0 | 46 | 83% |
| qohnil.blot.BlotBot 3.61 | 13 | 69% |
| matt.advanced.Katana 1.0 | 7 | 86% |
| ahr.ice.Ice 1.0.2 | 7 | 71% |
| pfvicm.Sobieski 7.2.3b | 6 | 100% |
| amk.ChumbaWumba 0.3 | 5 | 80% |
| stelo.PianistNano 1.2 | 2 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 27 | 32% | 59 |
| uji.Antique 1.0 | 22 | 26% | 62 |
| qohnil.blot.BlotBot 3.61 | 11 | 13% | 32 |
| amk.ChumbaWumba 0.3 | 8 | 10% | 15 |
| pfvicm.Sobieski 7.2.3b | 5 | 6% | 13 |
| ahr.ice.Ice 1.0.2 | 5 | 6% | 13 |
| matt.advanced.Katana 1.0 | 2 | 2% | 6 |
| stelo.PianistNano 1.2 | 2 | 2% | 5 |
| stelo.Lifestealer 1.0 | 2 | 2% | 3 |

Posture (Hadur's M records, 199 rounds): 131131 melee ticks, 36726 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 42 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 43618 sent, 39233 reached their opponent, 6147 virtual hits (15.7% of those reached).

## Melee bench: F29

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 521 over 6 battles (86.8 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.1 | 91 / 210 | 2.25 | 17.8% | 24530 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.8% | 91 |
| deewiant.Anomaly 0.2 | 2.3 | 15.2% | 46 |
| zyx.mega.YersiniaPestis 3.1 | 2.7 | 15.3% | 55 |
| myl.micro.Troodon 1.10 | 4.3 | 12.2% | 7 |
| jok.PheonixM 0.1.2 | 4.7 | 10.8% | 6 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.3% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.7 | 6.2% | 0 |
| DBall.Anarchy 0.1 | 8.0 | 5.6% | 2 |
| ap.Frederick 1.1 | 8.5 | 5.0% | 3 |
| jangs.ns51 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 88.9 | 18 / 35 | 3951 |
| 2 | 1 | 66.2 | 81.6 | 13 / 35 | 3801 |
| 3 | 1 | 68.4 | 87.9 | 17 / 35 | 4206 |
| 4 | 1 | 67.4 | 87.0 | 16 / 35 | 3750 |
| 5 | 1 | 67.3 | 83.5 | 13 / 35 | 4208 |
| 6 | 1 | 68.6 | 87.6 | 14 / 35 | 4614 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 59 | 54% |
| zyx.mega.YersiniaPestis 3.1 | 40 | 50% |
| myl.micro.Troodon 1.10 | 22 | 86% |
| jok.PheonixM 0.1.2 | 15 | 93% |
| DBall.Anarchy 0.1 | 4 | 100% |
| ap.Frederick 1.1 | 2 | 50% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 1014. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 48 | 39% | 85 |
| zyx.mega.YersiniaPestis 3.1 | 46 | 37% | 70 |
| myl.micro.Troodon 1.10 | 15 | 12% | 27 |
| jok.PheonixM 0.1.2 | 9 | 7% | 23 |
| ap.Frederick 1.1 | 1 | 1% | 0 |
| ph.melee.ArcherME 0.3 | 0 | 0% | 2 |
| DBall.Anarchy 0.1 | 0 | 0% | 2 |
| fullsail.TimbotNoPrediction 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 178762 melee ticks, 45065 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 26 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 57967 sent, 53414 reached their opponent, 8847 virtual hits (16.6% of those reached).

## Melee bench: F30

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 10 other Robocode JVMs running (hadur.bench.MeleeRunner x10), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 328 over 6 battles (54.7 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 75.5 | 42 / 210 | 3.20 | 14.6% | 21227 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.7 | 14.6% | 42 |
| darkcanuck.B26354 1.06 | 2.0 | 14.0% | 43 |
| catcat20.Matcha 0.006 | 2.7 | 13.6% | 50 |
| stelo.PastFuture 2.3.2 | 4.2 | 12.4% | 22 |
| oog.melee.Capulet 1.2 | 4.5 | 12.3% | 31 |
| intruder.PrairieWolf 2.61 | 6.2 | 8.7% | 10 |
| fowl3628800.LightningBolt 2.6.0 | 7.7 | 7.3% | 7 |
| ntc.Opposite 1.5 | 8.0 | 7.2% | 1 |
| tripphippy.Alice 1.1 | 8.2 | 7.2% | 4 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.2 | 77.8 | 11 / 35 | 3521 |
| 2 | 1 | 61.3 | 72.1 | 7 / 35 | 3464 |
| 3 | 3 | 61.9 | 73.3 | 7 / 35 | 3645 |
| 4 | 2 | 61.2 | 73.7 | 5 / 35 | 3447 |
| 5 | 1 | 63.3 | 80.6 | 6 / 35 | 3516 |
| 6 | 2 | 62.3 | 75.6 | 6 / 35 | 3634 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 29 | 24% |
| darkcanuck.B26354 1.06 | 21 | 48% |
| stelo.PastFuture 2.3.2 | 16 | 56% |
| oog.melee.Capulet 1.2 | 13 | 38% |
| fowl3628800.LightningBolt 2.6.0 | 7 | 100% |
| intruder.PrairieWolf 2.61 | 6 | 50% |
| tripphippy.Alice 1.1 | 2 | 50% |

Hadur died in 170 of 210 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 45 | 26% | 55 |
| catcat20.Matcha 0.006 | 35 | 21% | 45 |
| stelo.PastFuture 2.3.2 | 30 | 18% | 39 |
| oog.melee.Capulet 1.2 | 27 | 16% | 34 |
| intruder.PrairieWolf 2.61 | 14 | 8% | 19 |
| tripphippy.Alice 1.1 | 7 | 4% | 8 |
| fowl3628800.LightningBolt 2.6.0 | 7 | 4% | 7 |
| ntc.Opposite 1.5 | 3 | 2% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 159670 melee ticks, 27170 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 63 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 52435 sent, 47944 reached their opponent, 8493 virtual hits (17.7% of those reached).

## Melee bench: F31

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 311 over 6 battles (51.8 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 75.0 | 42 / 210 | 3.25 | 14.2% | 17978 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.7% | 93 |
| hadur2.Hadur 3.17.1bb | 2.3 | 14.2% | 42 |
| gh.mini.Griezel 0.2 | 2.8 | 13.5% | 50 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.6% | 7 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 10.9% | 11 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.3% | 6 |
| timmit.nano.TimDog 0.33 | 7.0 | 7.1% | 3 |
| Gecko.ultimateGeckoBot 1.0 | 8.3 | 5.5% | 0 |
| fm.mammillarias 1.3 | 8.7 | 5.6% | 0 |
| tlp.ThreeLeggedPig 1 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 75.2 | 7 / 35 | 3061 |
| 2 | 2 | 62.9 | 78.1 | 12 / 35 | 3033 |
| 3 | 2 | 62.7 | 77.5 | 7 / 35 | 3148 |
| 4 | 2 | 60.9 | 75.2 | 5 / 35 | 2747 |
| 5 | 3 | 61.8 | 74.3 | 6 / 35 | 3018 |
| 6 | 3 | 59.7 | 69.8 | 5 / 35 | 2971 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.mini.Griezel 0.2 | 32 | 41% |
| abc.Shadow 3.84i | 29 | 31% |
| d414.nano.Quantum 1.0.0 | 9 | 89% |
| spinnercat.micro.Tyger 0.1 | 8 | 63% |
| gh.nano.Grofvuil 0.2 | 8 | 63% |
| timmit.nano.TimDog 0.33 | 2 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 831. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 58 | 34% | 67 |
| gh.mini.Griezel 0.2 | 46 | 27% | 58 |
| d414.nano.Quantum 1.0.0 | 22 | 13% | 29 |
| spinnercat.micro.Tyger 0.1 | 16 | 9% | 19 |
| gh.nano.Grofvuil 0.2 | 10 | 6% | 14 |
| fm.mammillarias 1.3 | 7 | 4% | 8 |
| timmit.nano.TimDog 0.33 | 5 | 3% | 10 |
| Gecko.ultimateGeckoBot 1.0 | 3 | 2% | 3 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 154041 melee ticks, 26459 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 42 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 50793 sent, 46007 reached their opponent, 7636 virtual hits (16.6% of those reached).

## Melee bench: F32

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 484 over 6 battles (80.7 per battle, most in one battle 142). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 88.3 | 125 / 210 | 2.05 | 18.0% | 24557 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.0% | 125 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.9% | 49 |
| lxx.ConceptA 0.8 | 4.0 | 10.4% | 2 |
| apc.botM 3.0 | 4.0 | 11.2% | 14 |
| vjik.UnViolation 1.1 | 4.5 | 9.9% | 7 |
| bayen.UbaMicro 1.4 | 6.3 | 8.4% | 4 |
| panzer.Panzer 0.2 | 7.3 | 7.6% | 0 |
| yk.JahMicro 1.0 | 7.5 | 7.5% | 5 |
| conscience.Electron 1.3g | 8.7 | 6.4% | 0 |
| donjezza.Jezza 1.0 | 9.7 | 5.8% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 87.6 | 17 / 35 | 4227 |
| 2 | 1 | 68.5 | 93.3 | 24 / 35 | 4079 |
| 3 | 1 | 65.9 | 87.6 | 20 / 35 | 3503 |
| 4 | 1 | 66.7 | 86.3 | 20 / 35 | 4304 |
| 5 | 1 | 67.0 | 86.3 | 22 / 35 | 4243 |
| 6 | 1 | 67.4 | 88.6 | 22 / 35 | 4201 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 73 | 66% |
| apc.botM 3.0 | 27 | 85% |
| lxx.ConceptA 0.8 | 22 | 95% |
| yk.JahMicro 1.0 | 10 | 80% |
| vjik.UnViolation 1.1 | 9 | 78% |
| donjezza.Jezza 1.0 | 9 | 67% |
| bayen.UbaMicro 1.4 | 9 | 78% |
| panzer.Panzer 0.2 | 5 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 36 | 40% | 76 |
| lxx.ConceptA 0.8 | 10 | 11% | 29 |
| apc.botM 3.0 | 9 | 10% | 34 |
| bayen.UbaMicro 1.4 | 8 | 9% | 12 |
| vjik.UnViolation 1.1 | 6 | 7% | 24 |
| yk.JahMicro 1.0 | 6 | 7% | 14 |
| panzer.Panzer 0.2 | 5 | 6% | 7 |
| conscience.Electron 1.3g | 4 | 4% | 5 |
| donjezza.Jezza 1.0 | 2 | 2% | 8 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 128883 melee ticks, 48631 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 71 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 44400 sent, 39916 reached their opponent, 7576 virtual hits (19.0% of those reached).

## Melee bench: F33

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 219 over 6 battles (36.5 per battle, most in one battle 105). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 86.0 | 99 / 210 | 2.26 | 18.0% | 25872 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.0% | 99 |
| maribo.Quester 0.3 | 2.0 | 15.8% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.9% | 25 |
| gre.svman4.Leonidas 1.3.2 | 3.8 | 12.0% | 21 |
| labg.Cataclysm 2.05 | 5.0 | 10.6% | 19 |
| baal.nano.N 1.42 | 6.2 | 9.0% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 8.2% | 8 |
| sanja.First 0.1 | 8.3 | 5.2% | 0 |
| zyx.micro.Ant 1.1 | 8.7 | 4.7% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 86.3 | 18 / 35 | 4568 |
| 2 | 1 | 66.7 | 84.4 | 14 / 35 | 4123 |
| 3 | 1 | 65.0 | 78.4 | 13 / 35 | 3997 |
| 4 | 1 | 68.8 | 89.2 | 19 / 35 | 4349 |
| 5 | 1 | 69.6 | 92.1 | 19 / 35 | 4699 |
| 6 | 1 | 67.8 | 85.4 | 16 / 35 | 4136 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 59 | 75% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 55% |
| gre.svman4.Leonidas 1.3.2 | 27 | 70% |
| labg.Cataclysm 2.05 | 16 | 50% |
| baal.nano.N 1.42 | 7 | 100% |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 40% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 1028. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 39 | 35% | 84 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 24% | 46 |
| gre.svman4.Leonidas 1.3.2 | 24 | 21% | 39 |
| labg.Cataclysm 2.05 | 10 | 9% | 21 |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 6% | 9 |
| sanja.First 0.1 | 2 | 2% | 3 |
| zyx.micro.Ant 1.1 | 2 | 2% | 3 |
| baal.nano.N 1.42 | 1 | 1% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 172292 melee ticks, 45865 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 58 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 55589 sent, 51157 reached their opponent, 7982 virtual hits (15.6% of those reached).

## Melee bench: F34

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 106 over 6 battles (17.7 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 84.0 | 73 / 210 | 2.44 | 16.8% | 25857 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.7 | 17.0% | 49 |
| hadur2.Hadur 3.17.1bb | 1.8 | 16.8% | 73 |
| stelo.Spread 0.9 | 2.5 | 16.0% | 63 |
| jcs.Seth 1.8 | 4.0 | 11.9% | 21 |
| tcf.Reach 3 | 5.3 | 10.3% | 4 |
| cli.Dancer 1.1 | 5.7 | 9.4% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.5% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.9% | 1 |
| sample.VelociRobot 1.0 | 9.3 | 3.2% | 0 |
| sample.RamFire 1.0 | 9.7 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 80.0 | 12 / 35 | 4257 |
| 2 | 2 | 67.7 | 86.3 | 14 / 35 | 4242 |
| 3 | 1 | 68.4 | 88.6 | 14 / 35 | 4708 |
| 4 | 1 | 68.2 | 88.3 | 14 / 35 | 4704 |
| 5 | 2 | 65.6 | 80.0 | 11 / 35 | 4141 |
| 6 | 3 | 65.3 | 80.6 | 8 / 35 | 3805 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 53 | 57% |
| stelo.Spread 0.9 | 53 | 43% |
| jcs.Seth 1.8 | 16 | 44% |
| tcf.Reach 3 | 8 | 100% |
| cli.Dancer 1.1 | 3 | 100% |
| ratosh.Wesco 1.4 | 2 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 1035. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 51 | 37% | 76 |
| stelo.Spread 0.9 | 49 | 35% | 67 |
| jcs.Seth 1.8 | 23 | 17% | 34 |
| tcf.Reach 3 | 7 | 5% | 16 |
| ratosh.Wesco 1.4 | 4 | 3% | 5 |
| cli.Dancer 1.1 | 2 | 1% | 9 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 167327 melee ticks, 48957 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 43 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 53307 sent, 48771 reached their opponent, 8420 virtual hits (17.3% of those reached).

## Melee bench: F35

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 318 over 6 battles (53.0 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 79.5 | 28 / 210 | 2.85 | 14.7% | 19060 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.3% | 158 |
| hadur2.Hadur 3.17.1bb | 2.0 | 14.7% | 28 |
| gh.mini.Gruwel 0.9 | 3.3 | 13.0% | 17 |
| rz.HawkOnFire 0.1 | 4.3 | 11.5% | 1 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 11.7% | 4 |
| wit.Chuliath 1.0 | 6.5 | 6.8% | 2 |
| myl.nano.KomoriNinja 1.1 | 7.2 | 6.1% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 6.2% | 0 |
| dans.Cinnamon 1.2 | 9.0 | 5.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 76.5 | 2 / 35 | 2794 |
| 2 | 2 | 62.9 | 78.1 | 6 / 35 | 3224 |
| 3 | 2 | 63.1 | 80.0 | 5 / 35 | 3165 |
| 4 | 2 | 63.4 | 80.3 | 5 / 35 | 3175 |
| 5 | 2 | 62.5 | 75.9 | 5 / 35 | 3367 |
| 6 | 2 | 65.0 | 86.0 | 5 / 35 | 3335 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 85 | 11% |
| dmh.robocode.robot.BlackDeath 9.2 | 14 | 79% |
| gh.mini.Gruwel 0.9 | 11 | 18% |
| rz.HawkOnFire 0.1 | 6 | 100% |

Hadur died in 184 of 210 rounds, at a mean tick of 932. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 109 | 59% | 120 |
| gh.mini.Gruwel 0.9 | 27 | 15% | 28 |
| dmh.robocode.robot.BlackDeath 9.2 | 23 | 13% | 30 |
| rz.HawkOnFire 0.1 | 15 | 8% | 24 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 2% | 3 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 2 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
| wit.Chuliath 1.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 144166 melee ticks, 42618 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 38 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 45276 sent, 40841 reached their opponent, 6744 virtual hits (16.5% of those reached).

## Melee bench: F36

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 145 over 6 battles (24.2 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 90.8 | 145 / 210 | 1.83 | 19.7% | 28985 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.7% | 145 |
| alpha.RainingFire 1.0 | 2.7 | 12.2% | 13 |
| bzdp.Pansy 2.1 | 2.8 | 12.1% | 16 |
| bvh.micro.Freya 0.3 | 4.3 | 11.0% | 10 |
| mz.Cork 0.1 | 4.7 | 10.6% | 12 |
| m3thos.Eva02 0.7.1 | 5.8 | 9.7% | 8 |
| bvh.mini.Fenrir 0.39 | 6.7 | 9.4% | 4 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 6.0% | 1 |
| dl.BetterWalls 1.0 | 8.5 | 5.3% | 1 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 94.6 | 28 / 35 | 5093 |
| 2 | 1 | 70.4 | 92.7 | 27 / 35 | 4929 |
| 3 | 1 | 67.7 | 85.1 | 17 / 35 | 4758 |
| 4 | 1 | 69.0 | 88.9 | 23 / 35 | 4783 |
| 5 | 1 | 69.9 | 91.7 | 26 / 35 | 4826 |
| 6 | 1 | 69.6 | 91.7 | 24 / 35 | 4596 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.micro.Freya 0.3 | 39 | 87% |
| bzdp.Pansy 2.1 | 31 | 84% |
| mz.Cork 0.1 | 30 | 77% |
| alpha.RainingFire 1.0 | 28 | 75% |
| bvh.mini.Fenrir 0.39 | 17 | 88% |
| m3thos.Eva02 0.7.1 | 16 | 88% |
| sample.MyFirstRobot 1.0 | 7 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| dl.BetterWalls 1.0 | 2 | 50% |

Hadur died in 66 of 210 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 15 | 23% | 47 |
| alpha.RainingFire 1.0 | 15 | 23% | 42 |
| mz.Cork 0.1 | 12 | 18% | 38 |
| bvh.micro.Freya 0.3 | 9 | 14% | 31 |
| m3thos.Eva02 0.7.1 | 5 | 8% | 21 |
| squidM.TentalceMeleeNano 1.1 | 5 | 8% | 7 |
| bvh.mini.Fenrir 0.39 | 3 | 5% | 12 |
| dl.BetterWalls 1.0 | 1 | 2% | 5 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 7 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 142610 melee ticks, 46531 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 47 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 50315 sent, 46016 reached their opponent, 10192 virtual hits (22.1% of those reached).

## Melee bench: F37

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 171 over 6 battles (28.5 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 88.1 | 158 / 210 | 2.07 | 18.8% | 30963 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.8% | 158 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.5 | 10.8% | 12 |
| germ.TheMind .2 | 3.0 | 10.5% | 7 |
| EBBU.Sim2 1.02 | 5.0 | 9.7% | 4 |
| agrach.Dalek 1.0 | 5.3 | 9.4% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 6.8 | 8.4% | 3 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.7% | 9 |
| lmk.ACPFinal 0.1 | 7.8 | 7.9% | 5 |
| mb.Beast 0.1 | 8.3 | 7.8% | 6 |
| skm.Ryubot 1.0 | 8.3 | 7.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 84.4 | 25 / 35 | 5204 |
| 2 | 1 | 66.9 | 83.8 | 24 / 35 | 5387 |
| 3 | 1 | 68.7 | 91.7 | 30 / 35 | 5094 |
| 4 | 1 | 68.4 | 92.7 | 25 / 35 | 5005 |
| 5 | 1 | 67.7 | 85.7 | 26 / 35 | 5362 |
| 6 | 1 | 67.9 | 90.2 | 28 / 35 | 4911 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 34 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 26 | 92% |
| stelo.UntouchableNano 1.3 | 23 | 78% |
| germ.TheMind .2 | 19 | 95% |
| skm.Ryubot 1.0 | 18 | 100% |
| EBBU.Sim2 1.02 | 17 | 100% |
| lmk.ACPFinal 0.1 | 14 | 100% |
| mb.Beast 0.1 | 13 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 67% |

Hadur died in 52 of 210 rounds, at a mean tick of 394. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 13 | 25% | 18 |
| com.syncleus.robocode.Dreadnaught 0.1 | 12 | 23% | 46 |
| stelo.UntouchableNano 1.3 | 8 | 15% | 20 |
| agrach.Dalek 1.0 | 5 | 10% | 50 |
| lmk.ACPFinal 0.1 | 4 | 8% | 19 |
| mb.Beast 0.1 | 4 | 8% | 12 |
| germ.TheMind .2 | 3 | 6% | 20 |
| EBBU.Sim2 1.02 | 3 | 6% | 18 |
| skm.Ryubot 1.0 | 0 | 0% | 7 |

Posture (Hadur's M records, 200 rounds): 98034 melee ticks, 26520 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 40 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 33217 sent, 29074 reached their opponent, 8945 virtual hits (30.8% of those reached).

## Melee bench: F38

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 233 over 6 battles (38.8 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 81.5 | 82 / 210 | 2.66 | 16.3% | 23306 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.3 | 16.3% | 71 |
| hadur2.Hadur 3.17.1bb | 1.7 | 16.3% | 82 |
| bvh.mini.Freya 0.55 | 3.2 | 13.0% | 17 |
| cs.Wren 1.0 | 4.7 | 10.9% | 16 |
| bts.mega.Gnarly 1.4 | 4.7 | 10.8% | 17 |
| kdf.KoulDestroyer 1.0 | 5.7 | 9.7% | 5 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.8 | 9.0% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 5.7% | 0 |
| matt.UnderDark3 2.4.34 | 9.0 | 4.6% | 1 |
| bzdp.BoxCar 2.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 88.9 | 15 / 35 | 4142 |
| 2 | 2 | 63.9 | 78.1 | 11 / 35 | 3757 |
| 3 | 2 | 66.5 | 86.0 | 16 / 35 | 3817 |
| 4 | 1 | 64.3 | 78.7 | 12 / 35 | 4055 |
| 5 | 2 | 65.2 | 80.3 | 15 / 35 | 3928 |
| 6 | 2 | 63.7 | 77.1 | 13 / 35 | 3607 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 48 | 56% |
| bvh.mini.Freya 0.55 | 23 | 78% |
| cs.Wren 1.0 | 17 | 82% |
| bts.mega.Gnarly 1.4 | 14 | 57% |
| davidalves.net.DuelistNanoMelee 1.01 | 9 | 100% |
| kdf.KoulDestroyer 1.0 | 5 | 80% |
| matt.UnderDark3 2.4.34 | 2 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 49 | 37% | 78 |
| bvh.mini.Freya 0.55 | 23 | 18% | 34 |
| bts.mega.Gnarly 1.4 | 18 | 14% | 32 |
| cs.Wren 1.0 | 12 | 9% | 25 |
| kdf.KoulDestroyer 1.0 | 12 | 9% | 16 |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 8% | 18 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 2% | 2 |
| bzdp.BoxCar 2.0 | 2 | 2% | 2 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 139383 melee ticks, 30207 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 32 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 46374 sent, 41654 reached their opponent, 9459 virtual hits (22.7% of those reached).

## Melee bench: F39

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 111 over 6 battles (18.5 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 86.5 | 97 / 210 | 2.21 | 17.7% | 26892 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.2 | 17.7% | 97 |
| bvh.fry.Freya 0.82 | 2.0 | 15.2% | 26 |
| az.Ololobot 0.2.4 | 2.8 | 13.2% | 55 |
| catcat20.Lambda 0.024 | 4.2 | 11.0% | 20 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 8.4% | 3 |
| gimp.GimpBot 0.1 | 6.3 | 8.3% | 2 |
| stelo.SoRobotNanoMelee 1.2 | 6.3 | 8.1% | 4 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 7.6% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.3 | 5.6% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 88.3 | 15 / 35 | 4289 |
| 2 | 1 | 66.9 | 85.4 | 18 / 35 | 4463 |
| 3 | 2 | 64.7 | 80.6 | 12 / 35 | 4337 |
| 4 | 1 | 66.9 | 85.7 | 14 / 35 | 4809 |
| 5 | 1 | 67.1 | 87.6 | 17 / 35 | 4395 |
| 6 | 1 | 68.4 | 91.4 | 21 / 35 | 4599 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 51 | 51% |
| bvh.fry.Freya 0.82 | 50 | 80% |
| catcat20.Lambda 0.024 | 23 | 61% |
| gimp.GimpBot 0.1 | 6 | 83% |
| stelo.SoRobotNanoMelee 1.2 | 5 | 80% |
| winamp32.micro.MicroMacro 1.0 | 5 | 60% |
| apollokidd.ApolloKidd 0.9 | 5 | 80% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 1045. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 40 | 35% | 66 |
| az.Ololobot 0.2.4 | 38 | 33% | 67 |
| catcat20.Lambda 0.024 | 20 | 18% | 32 |
| apollokidd.ApolloKidd 0.9 | 5 | 4% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 5 | 4% | 8 |
| winamp32.micro.MicroMacro 1.0 | 3 | 3% | 9 |
| gimp.GimpBot 0.1 | 1 | 1% | 15 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 2 |

Posture (Hadur's M records, 206 rounds): 166794 melee ticks, 52607 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 46 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 54060 sent, 49528 reached their opponent, 9805 virtual hits (19.8% of those reached).

## Melee bench: F40

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 213 over 6 battles (35.5 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 85.1 | 108 / 210 | 2.34 | 17.9% | 25612 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.2 | 17.9% | 108 |
| kawigi.mini.Coriantumr 1.1 | 1.8 | 15.2% | 42 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.3% | 18 |
| mz.AntiGrav 1.0 | 4.2 | 11.1% | 12 |
| Polkwane.SmashMelee 1.0 | 5.2 | 10.5% | 9 |
| stelo.Randomness 1.0 | 6.0 | 9.7% | 11 |
| alpha.BlackIce 1.0 | 6.7 | 8.7% | 7 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.5% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.3 | 4.4% | 2 |
| sample.Corners 1.0 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 75.2 | 12 / 35 | 3751 |
| 2 | 1 | 69.0 | 90.5 | 19 / 35 | 4519 |
| 3 | 1 | 69.0 | 90.5 | 23 / 35 | 4460 |
| 4 | 1 | 67.6 | 84.8 | 17 / 35 | 4380 |
| 5 | 1 | 67.4 | 84.8 | 18 / 35 | 4345 |
| 6 | 1 | 67.6 | 85.1 | 19 / 35 | 4157 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 54 | 72% |
| kano.gamma.KanoGamma 1.8 | 33 | 82% |
| mz.AntiGrav 1.0 | 17 | 82% |
| Polkwane.SmashMelee 1.0 | 16 | 88% |
| stelo.Randomness 1.0 | 14 | 57% |
| alpha.BlackIce 1.0 | 5 | 60% |
| amk.superstrike.SuperStrike 0.3 | 4 | 75% |

Hadur died in 104 of 210 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 34 | 33% | 75 |
| kano.gamma.KanoGamma 1.8 | 18 | 17% | 47 |
| stelo.Randomness 1.0 | 17 | 16% | 26 |
| mz.AntiGrav 1.0 | 15 | 14% | 26 |
| amk.superstrike.SuperStrike 0.3 | 9 | 9% | 14 |
| Polkwane.SmashMelee 1.0 | 6 | 6% | 12 |
| alpha.BlackIce 1.0 | 4 | 4% | 7 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 2 |
| sample.Corners 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 151136 melee ticks, 40464 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 73 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 51493 sent, 46842 reached their opponent, 10498 virtual hits (22.4% of those reached).

## Melee bench: F41

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 202 over 6 battles (33.7 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 86.9 | 95 / 210 | 2.18 | 17.3% | 22646 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.2 | 17.3% | 95 |
| eem.EvBotNG v12.8 | 1.8 | 16.4% | 77 |
| ary.Swarm 1.1 | 3.3 | 13.0% | 9 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.3% | 16 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 11.2% | 11 |
| shrub.Silver v048 | 6.0 | 8.9% | 1 |
| zyx.nano.Ant 1.1 | 7.0 | 7.7% | 0 |
| stelo.Mirror 1.1 | 8.3 | 5.6% | 0 |
| jsal.Jsalbot 1.0 | 8.7 | 5.3% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 87.9 | 15 / 35 | 3733 |
| 2 | 1 | 67.3 | 87.3 | 16 / 35 | 3792 |
| 3 | 1 | 67.3 | 87.9 | 15 / 35 | 3944 |
| 4 | 1 | 66.9 | 88.6 | 16 / 35 | 3542 |
| 5 | 1 | 67.0 | 86.7 | 18 / 35 | 3669 |
| 6 | 2 | 66.4 | 83.2 | 15 / 35 | 3966 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 78 | 46% |
| lessonz.robocode.Oz 0.5.0 | 29 | 86% |
| ary.Swarm 1.1 | 20 | 90% |
| simonton.nano.MeleeSeed 1.8 | 13 | 69% |
| shrub.Silver v048 | 3 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| stelo.Mirror 1.1 | 2 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 958. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 57 | 49% | 90 |
| lessonz.robocode.Oz 0.5.0 | 20 | 17% | 39 |
| ary.Swarm 1.1 | 17 | 15% | 33 |
| simonton.nano.MeleeSeed 1.8 | 17 | 15% | 29 |
| shrub.Silver v048 | 3 | 3% | 10 |
| jsal.Jsalbot 1.0 | 1 | 1% | 6 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
| stelo.Mirror 1.1 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 158220 melee ticks, 40727 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 80 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 52113 sent, 47660 reached their opponent, 7823 virtual hits (16.4% of those reached).

## Melee bench: F42

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 440 over 6 battles (73.3 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 89.4 | 129 / 210 | 1.95 | 18.8% | 29143 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.8% | 129 |
| wompi.Wallaby 5.1 | 2.2 | 15.6% | 42 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.4% | 13 |
| ara.Shera 0.88 | 3.5 | 12.8% | 25 |
| amz.NanoClone 1.41 | 5.0 | 9.0% | 0 |
| dsw.StaticD 1.0 | 6.5 | 7.1% | 2 |
| maribo.IotaCT 1.1 | 7.0 | 6.6% | 0 |
| stelo.MirrorMicro 1.0 | 8.5 | 5.9% | 0 |
| mme.NikeEnhanced 2.0 | 8.5 | 5.7% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 91.1 | 24 / 35 | 4710 |
| 2 | 1 | 66.0 | 83.5 | 16 / 35 | 4242 |
| 3 | 1 | 67.3 | 85.1 | 19 / 35 | 4490 |
| 4 | 1 | 70.3 | 94.0 | 22 / 35 | 5397 |
| 5 | 1 | 70.3 | 92.4 | 26 / 35 | 5209 |
| 6 | 1 | 69.4 | 90.5 | 22 / 35 | 5095 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 87 | 86% |
| maribo.mini.MiniQuester 0.1 | 32 | 75% |
| ara.Shera 0.88 | 29 | 69% |
| dsw.StaticD 1.0 | 4 | 100% |
| amz.NanoClone 1.41 | 3 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 951. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 28 | 33% | 53 |
| wompi.Wallaby 5.1 | 25 | 29% | 86 |
| maribo.mini.MiniQuester 0.1 | 18 | 21% | 47 |
| dsw.StaticD 1.0 | 4 | 5% | 10 |
| mme.NikeEnhanced 2.0 | 4 | 5% | 6 |
| amz.NanoClone 1.41 | 2 | 2% | 4 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 2 |
| maribo.IotaCT 1.1 | 0 | 0% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 162982 melee ticks, 48348 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 38 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 52161 sent, 47807 reached their opponent, 10102 virtual hits (21.1% of those reached).

## Melee bench: F43

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 645 over 6 battles (107.5 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 78.2 | 29 / 210 | 2.96 | 14.8% | 20270 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.0% | 156 |
| hadur2.Hadur 3.17.1bb | 2.0 | 14.8% | 29 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.6% | 18 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.9% | 7 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 10.8% | 0 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.8% | 1 |
| mz.NanoGod 2.02 | 7.2 | 7.7% | 0 |
| jab.DiamondStealer 5 | 7.8 | 7.1% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.8% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.9 | 80.0 | 6 / 35 | 3406 |
| 2 | 2 | 64.0 | 77.5 | 4 / 35 | 3463 |
| 3 | 2 | 63.4 | 76.8 | 6 / 35 | 3122 |
| 4 | 2 | 63.8 | 76.2 | 3 / 35 | 3454 |
| 5 | 2 | 66.2 | 83.5 | 6 / 35 | 3555 |
| 6 | 2 | 63.1 | 75.2 | 4 / 35 | 3270 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 74 | 11% |
| brainfade.melee.Dusk 0.44 | 12 | 42% |
| dummy.micro.Sparrow 2.5 | 11 | 73% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 100% |
| Krabb.akim2.Akim2 1.1b | 3 | 100% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 187 of 210 rounds, at a mean tick of 965. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 112 | 60% | 123 |
| brainfade.melee.Dusk 0.44 | 27 | 14% | 31 |
| dummy.micro.Sparrow 2.5 | 21 | 11% | 27 |
| wcsv.melee.EngineerMelee 0.1 | 10 | 5% | 15 |
| Krabb.akim2.Akim2 1.1b | 5 | 3% | 7 |
| mz.NanoGod 2.02 | 4 | 2% | 5 |
| jab.DiamondStealer 5 | 2 | 1% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 160691 melee ticks, 43613 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 29 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 29 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 1.

Targeting waves (208 rounds): 51462 sent, 46817 reached their opponent, 8265 virtual hits (17.7% of those reached).

## Melee bench: F44

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 434 over 6 battles (72.3 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 92.4 | 135 / 210 | 1.69 | 19.9% | 30880 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.9% | 135 |
| stelo.Liblix 0.3.1 | 2.2 | 16.0% | 57 |
| tzu.TheArtOfWar 1.2 | 2.8 | 13.7% | 13 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.5 | 9.8% | 3 |
| jwirde.Gort 2.0 | 4.7 | 9.3% | 3 |
| wompi.Quokka 1.6 | 6.3 | 7.6% | 0 |
| disan.Chair 2.2.0 | 6.5 | 7.5% | 0 |
| stf.PanzerGeneral 0.1 | 8.0 | 6.6% | 1 |
| sample.Crazy 1.0 | 9.5 | 4.7% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 94.6 | 25 / 35 | 5103 |
| 2 | 1 | 70.2 | 93.0 | 21 / 35 | 5154 |
| 3 | 1 | 70.1 | 93.0 | 22 / 35 | 5361 |
| 4 | 1 | 69.8 | 89.2 | 20 / 35 | 5289 |
| 5 | 1 | 69.6 | 91.7 | 22 / 35 | 4811 |
| 6 | 1 | 70.5 | 92.7 | 25 / 35 | 5162 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 83 | 57% |
| tzu.TheArtOfWar 1.2 | 63 | 87% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 13 | 92% |
| jwirde.Gort 2.0 | 11 | 100% |
| wompi.Quokka 1.6 | 5 | 100% |
| disan.Chair 2.2.0 | 4 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 979. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 46 | 57% | 102 |
| tzu.TheArtOfWar 1.2 | 16 | 20% | 60 |
| jwirde.Gort 2.0 | 5 | 6% | 16 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 5% | 16 |
| amk.jointstrike.JointStrike 0.2 | 3 | 4% | 3 |
| wompi.Quokka 1.6 | 1 | 1% | 5 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 2 |
| disan.Chair 2.2.0 | 0 | 0% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 3 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 157829 melee ticks, 47205 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 39 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 54309 sent, 49892 reached their opponent, 11059 virtual hits (22.2% of those reached).

## Melee bench: F45

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 564 over 6 battles (94.0 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 86.2 | 84 / 210 | 2.24 | 18.6% | 30276 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.6% | 84 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 13.2% | 103 |
| jje.BagPuss 1.2 | 3.2 | 12.2% | 8 |
| sul.Lunar 1.1 | 4.3 | 11.1% | 10 |
| myl.nano.Graviton 1.10 | 4.5 | 10.9% | 2 |
| pez.mini.ChironexFleckeri 0.5 | 6.7 | 8.1% | 0 |
| hvilela.HVilela 0.9 | 6.8 | 7.9% | 0 |
| fm.claire 1.7 | 7.5 | 7.7% | 0 |
| wit.Deep7 2.0 | 9.3 | 5.6% | 2 |
| abud.ThirdRobo 1.0 | 9.7 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 89.2 | 14 / 35 | 5439 |
| 2 | 1 | 69.4 | 89.8 | 18 / 35 | 5217 |
| 3 | 1 | 66.7 | 81.9 | 10 / 35 | 5195 |
| 4 | 1 | 69.4 | 88.6 | 16 / 35 | 5313 |
| 5 | 1 | 66.8 | 82.5 | 13 / 35 | 4847 |
| 6 | 1 | 66.5 | 85.4 | 13 / 35 | 4265 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 79 | 38% |
| sul.Lunar 1.1 | 22 | 86% |
| jje.BagPuss 1.2 | 16 | 75% |
| myl.nano.Graviton 1.10 | 15 | 93% |
| pez.mini.ChironexFleckeri 0.5 | 4 | 100% |
| wit.Deep7 2.0 | 3 | 100% |
| fm.claire 1.7 | 2 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 1624. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 55 | 42% | 0 |
| jje.BagPuss 1.2 | 28 | 22% | 69 |
| sul.Lunar 1.1 | 18 | 14% | 59 |
| myl.nano.Graviton 1.10 | 15 | 12% | 39 |
| pez.mini.ChironexFleckeri 0.5 | 4 | 3% | 17 |
| fm.claire 1.7 | 2 | 2% | 11 |
| wit.Deep7 2.0 | 2 | 2% | 9 |
| hvilela.HVilela 0.9 | 2 | 2% | 6 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 222955 melee ticks, 89012 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 57 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 66603 sent, 62072 reached their opponent, 9951 virtual hits (16.0% of those reached).

## Melee bench: F46

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 302 over 6 battles (50.3 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 81.8 | 54 / 210 | 2.64 | 15.6% | 21749 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 17.5% | 71 |
| rsalesc.melee.Medina 0.4.5 | 2.0 | 16.4% | 71 |
| hadur2.Hadur 3.17.1bb | 2.8 | 15.6% | 54 |
| cx.Princess 1.0 | 4.3 | 10.3% | 12 |
| mz.MicroSheep 1.0 | 5.0 | 10.2% | 0 |
| sadoner.killer 0.2 | 5.7 | 9.7% | 1 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.4% | 1 |
| kurios.DOSexe .9a | 8.5 | 4.9% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.5 | 5.3% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.8 | 82.2 | 8 / 35 | 2983 |
| 2 | 3 | 64.7 | 80.6 | 8 / 35 | 3855 |
| 3 | 3 | 64.5 | 79.0 | 10 / 35 | 3642 |
| 4 | 3 | 64.4 | 81.6 | 5 / 35 | 3761 |
| 5 | 2 | 66.1 | 85.1 | 12 / 35 | 4057 |
| 6 | 3 | 64.8 | 82.2 | 11 / 35 | 3451 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 68 | 59% |
| rsalesc.melee.Medina 0.4.5 | 28 | 25% |
| cx.Princess 1.0 | 7 | 57% |
| mz.MicroSheep 1.0 | 1 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 158 of 210 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 72 | 46% | 109 |
| rsalesc.melee.Medina 0.4.5 | 53 | 34% | 64 |
| sadoner.killer 0.2 | 10 | 6% | 11 |
| mz.MicroSheep 1.0 | 7 | 4% | 10 |
| cx.Princess 1.0 | 7 | 4% | 9 |
| arthord.NanoSatanMelee Beta | 6 | 4% | 6 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 155084 melee ticks, 35033 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 30 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 30 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 45756 sent, 41177 reached their opponent, 6742 virtual hits (16.4% of those reached).

