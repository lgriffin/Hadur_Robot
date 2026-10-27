# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 251 over 6 battles (41.8 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 84.4 | 55 / 210 | 2.40 | 16.8% | 28998 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.5% | 131 |
| hadur2.Hadur 3.18bb | 2.0 | 16.8% | 55 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.8 | 11.2% | 3 |
| sgp.JollyNinja 3.53 | 4.0 | 11.1% | 12 |
| lorneswork.Predator 1.0 | 4.8 | 10.8% | 4 |
| mz.MicroGodMelee 1 | 5.3 | 10.1% | 5 |
| adt.Ar2 1.0 | 7.2 | 7.5% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.7% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.5% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.0 | 87.9 | 13 / 35 | 5319 |
| 2 | 2 | 64.8 | 80.6 | 7 / 35 | 4465 |
| 3 | 2 | 67.7 | 88.6 | 11 / 35 | 4911 |
| 4 | 2 | 64.9 | 78.7 | 8 / 35 | 4586 |
| 5 | 2 | 66.6 | 86.0 | 6 / 35 | 4887 |
| 6 | 2 | 66.8 | 84.8 | 10 / 35 | 4830 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 110 | 12% |
| sgp.JollyNinja 3.53 | 14 | 86% |
| mz.MicroGodMelee 1 | 11 | 91% |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 90% |
| lorneswork.Predator 1.0 | 9 | 89% |
| skm.butterfly 1.0 | 2 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 1095. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 113 | 72% | 134 |
| lorneswork.Predator 1.0 | 15 | 10% | 23 |
| sgp.JollyNinja 3.53 | 14 | 9% | 21 |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 4% | 14 |
| mz.MicroGodMelee 1 | 3 | 2% | 12 |
| adt.Ar2 1.0 | 2 | 1% | 2 |
| skm.butterfly 1.0 | 1 | 1% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 135500 melee ticks, 78745 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 49 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 44530 sent, 39728 reached their opponent, 8262 virtual hits (20.8% of those reached).

## Melee bench: F02

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 198 over 6 battles (33.0 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 84.4 | 100 / 210 | 2.40 | 18.0% | 28581 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.0 | 18.0% | 100 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.3% | 26 |
| pulsar.PulsarMax 0.8.9 | 2.7 | 13.5% | 38 |
| lrem.micro.SpikeSoldier 0.4 | 3.8 | 11.6% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 10.1% | 21 |
| Noran.BitchingElk 0.054 | 6.3 | 8.3% | 13 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 8.2% | 1 |
| sch.Simone 0.3d | 7.7 | 7.8% | 9 |
| stelo.PatternRobot 1.0 | 9.0 | 5.4% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 82.9 | 16 / 35 | 4987 |
| 2 | 1 | 69.2 | 89.8 | 21 / 35 | 4951 |
| 3 | 1 | 64.9 | 79.0 | 13 / 35 | 4385 |
| 4 | 1 | 66.0 | 80.6 | 13 / 35 | 4690 |
| 5 | 1 | 67.8 | 85.4 | 18 / 35 | 4569 |
| 6 | 1 | 68.6 | 88.9 | 19 / 35 | 4999 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 43 | 60% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 42 | 74% |
| com.cohesiva.robocode.ManOwaR 1.0 | 21 | 48% |
| Noran.BitchingElk 0.054 | 14 | 50% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 100% |
| sch.Simone 0.3d | 8 | 88% |
| fnc.bandit.Bandit 5.2.0 | 3 | 100% |
| stelo.PatternRobot 1.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 925. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 31 | 28% | 55 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 26 | 24% | 59 |
| com.cohesiva.robocode.ManOwaR 1.0 | 14 | 13% | 25 |
| sch.Simone 0.3d | 11 | 10% | 17 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 7% | 17 |
| Noran.BitchingElk 0.054 | 8 | 7% | 13 |
| stelo.PatternRobot 1.0 | 7 | 6% | 10 |
| fnc.bandit.Bandit 5.2.0 | 5 | 5% | 11 |
| fullsail.SweetTea 1.1 | 0 | 0% | 3 |

Posture (Hadur's M records, 202 rounds): 162927 melee ticks, 41315 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 47 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 59234 sent, 54475 reached their opponent, 9574 virtual hits (17.6% of those reached).

## Melee bench: F03

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 165 over 6 battles (27.5 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 92.4 | 166 / 210 | 1.69 | 20.4% | 36890 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.0 | 20.4% | 166 |
| radnor.DoctorBob 1.42 | 2.3 | 13.9% | 22 |
| vuen.Cake 2.51 | 3.0 | 12.7% | 15 |
| kawigi.nano.Lib 1.0 | 3.7 | 11.9% | 6 |
| urdos.URDOS 1.3 | 5.0 | 9.7% | 2 |
| adt.Ar1 2.1 | 6.2 | 7.6% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 6.8% | 0 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.7% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.3 | 5.3% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 89.2 | 26 / 35 | 6294 |
| 2 | 1 | 70.9 | 94.0 | 28 / 35 | 6132 |
| 3 | 1 | 70.9 | 92.7 | 29 / 35 | 6008 |
| 4 | 1 | 70.9 | 93.7 | 28 / 35 | 6290 |
| 5 | 1 | 70.8 | 94.0 | 28 / 35 | 6080 |
| 6 | 1 | 70.1 | 90.8 | 27 / 35 | 6086 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 61 | 95% |
| radnor.DoctorBob 1.42 | 54 | 96% |
| kawigi.nano.Lib 1.0 | 36 | 100% |
| oa.weak.FlyMk1 0.1 | 7 | 100% |
| urdos.URDOS 1.3 | 7 | 100% |
| adt.Ar1 2.1 | 4 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 673. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 19 | 42% | 64 |
| vuen.Cake 2.51 | 8 | 18% | 69 |
| kawigi.nano.Lib 1.0 | 7 | 16% | 35 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 9% | 5 |
| urdos.URDOS 1.3 | 3 | 7% | 12 |
| adt.Ar1 2.1 | 2 | 4% | 6 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 7 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 199 rounds): 125415 melee ticks, 39329 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 102 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 102 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 2.

Targeting waves (199 rounds): 38674 sent, 34102 reached their opponent, 9126 virtual hits (26.8% of those reached).

## Melee bench: F04

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 599 over 6 battles (99.8 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 84.5 | 28 / 210 | 2.40 | 16.9% | 30948 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.5% | 162 |
| hadur2.Hadur 3.18bb | 2.0 | 16.9% | 28 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.7% | 7 |
| TNT.TNT 0.99.1 | 4.2 | 11.1% | 11 |
| josago.Jorgito 0.16 | 5.0 | 8.8% | 1 |
| css.Delitioner 0.11 | 6.0 | 7.4% | 1 |
| tj.zombie1n 1.0.1 | 7.3 | 6.0% | 0 |
| rampancy.Durandal 2.1d | 7.5 | 5.7% | 0 |
| spin.Bugstard 0.012b | 9.3 | 4.2% | 0 |
| sp.Nanos.Ember 1.1 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 80.3 | 3 / 35 | 4754 |
| 2 | 2 | 67.1 | 82.9 | 4 / 35 | 5324 |
| 3 | 2 | 67.8 | 86.3 | 6 / 35 | 5220 |
| 4 | 2 | 67.3 | 85.4 | 4 / 35 | 5158 |
| 5 | 2 | 67.7 | 85.7 | 3 / 35 | 5297 |
| 6 | 2 | 68.1 | 86.3 | 8 / 35 | 5195 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 121 | 7% |
| apc.LeeroyJenkins2 1.0 | 18 | 72% |
| TNT.TNT 0.99.1 | 13 | 31% |
| josago.Jorgito 0.16 | 2 | 100% |
| spin.Bugstard 0.012b | 1 | 100% |

Hadur died in 187 of 210 rounds, at a mean tick of 1280. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 134 | 72% | 145 |
| apc.LeeroyJenkins2 1.0 | 20 | 11% | 32 |
| TNT.TNT 0.99.1 | 18 | 10% | 22 |
| josago.Jorgito 0.16 | 7 | 4% | 8 |
| css.Delitioner 0.11 | 2 | 1% | 2 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 196966 melee ticks, 66236 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 56 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 61239 sent, 56316 reached their opponent, 8665 virtual hits (15.4% of those reached).

## Melee bench: F05

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 410 over 6 battles (68.3 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 77.9 | 29 / 210 | 2.99 | 14.9% | 22220 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 18.1% | 110 |
| justin.DemonicRage 3.4 | 1.8 | 17.1% | 51 |
| hadur2.Hadur 3.18bb | 3.0 | 14.9% | 29 |
| wompi.Numbat 2.1 | 4.0 | 12.8% | 14 |
| ms.Ares 0.19 | 5.5 | 9.3% | 2 |
| axeBots.HataMoto 3.09 | 5.5 | 9.3% | 5 |
| supersample.SuperBoxBot 1.0 | 7.2 | 5.4% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.1% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.0 | 4.2% | 0 |
| GarmBox.Oranges 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.6 | 74.9 | 5 / 35 | 3588 |
| 2 | 3 | 63.1 | 76.2 | 5 / 35 | 3680 |
| 3 | 3 | 64.6 | 81.0 | 4 / 35 | 3915 |
| 4 | 3 | 65.0 | 81.6 | 6 / 35 | 3660 |
| 5 | 3 | 64.3 | 78.4 | 6 / 35 | 3728 |
| 6 | 3 | 62.8 | 75.6 | 3 / 35 | 3649 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 44 | 36% |
| cb.fire.Firestarter 2.0f | 32 | 3% |
| wompi.Numbat 2.1 | 15 | 73% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 184 of 210 rounds, at a mean tick of 892. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 67 | 36% | 79 |
| cb.fire.Firestarter 2.0f | 66 | 36% | 69 |
| wompi.Numbat 2.1 | 26 | 14% | 35 |
| axeBots.HataMoto 3.09 | 15 | 8% | 17 |
| ms.Ares 0.19 | 4 | 2% | 4 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 3 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 1% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 162995 melee ticks, 29812 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 118 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 118 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 2.

Targeting waves (209 rounds): 50450 sent, 45277 reached their opponent, 7492 virtual hits (16.5% of those reached).

## Melee bench: F06

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 544 over 6 battles (90.7 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 89.7 | 130 / 210 | 1.93 | 19.5% | 31028 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.0 | 19.5% | 130 |
| jekl.StoneGhost 0.7 | 2.2 | 14.4% | 21 |
| origin.SleepSiphon 1.7b | 3.0 | 13.4% | 26 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.1% | 18 |
| mld.Wisdom 1.0 | 5.0 | 10.4% | 6 |
| gg.Wolverine 2.0 | 6.0 | 8.3% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 6.5% | 6 |
| DBall.NUKE 0.1 | 7.7 | 6.4% | 0 |
| spinnercat.Omen 1.0 | 8.8 | 6.0% | 0 |
| sample.Fire 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 90.8 | 23 / 35 | 5054 |
| 2 | 1 | 68.8 | 88.3 | 21 / 35 | 4926 |
| 3 | 1 | 69.8 | 88.9 | 21 / 35 | 5149 |
| 4 | 1 | 70.4 | 93.0 | 23 / 35 | 5301 |
| 5 | 1 | 69.7 | 88.9 | 21 / 35 | 5323 |
| 6 | 1 | 69.4 | 88.3 | 21 / 35 | 5275 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 66 | 86% |
| origin.SleepSiphon 1.7b | 42 | 81% |
| pe.minimelee.SandboxMiniMelee 1.1 | 31 | 68% |
| gg.Wolverine 2.0 | 8 | 75% |
| mld.Wisdom 1.0 | 7 | 86% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 40% |
| DBall.NUKE 0.1 | 4 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 26 | 30% | 67 |
| origin.SleepSiphon 1.7b | 20 | 23% | 63 |
| pe.minimelee.SandboxMiniMelee 1.1 | 18 | 21% | 42 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 8% | 11 |
| gg.Wolverine 2.0 | 4 | 5% | 9 |
| mld.Wisdom 1.0 | 3 | 3% | 11 |
| spinnercat.Omen 1.0 | 3 | 3% | 5 |
| DBall.NUKE 0.1 | 1 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 150367 melee ticks, 42270 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 31 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 46950 sent, 42234 reached their opponent, 9688 virtual hits (22.9% of those reached).

## Melee bench: F07

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 630 over 6 battles (105.0 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 92.5 | 109 / 210 | 1.68 | 20.3% | 37874 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.0 | 20.3% | 109 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 16.6% | 45 |
| rtk.Tachikoma 1.0 | 2.8 | 16.2% | 26 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 11.2% | 15 |
| franzor.Lizt 1.3.1 | 4.5 | 11.1% | 16 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.1% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.0% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.9% | 0 |
| drd.Dreadknoght 0.9 | 9.5 | 2.2% | 0 |
| sample.Target 1.0 | 9.5 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 93.7 | 17 / 35 | 6093 |
| 2 | 1 | 71.7 | 92.1 | 19 / 35 | 6389 |
| 3 | 1 | 70.2 | 88.9 | 10 / 35 | 5950 |
| 4 | 1 | 71.8 | 92.1 | 19 / 35 | 6415 |
| 5 | 1 | 72.5 | 94.0 | 21 / 35 | 6124 |
| 6 | 1 | 73.0 | 94.3 | 23 / 35 | 6903 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 81 | 75% |
| rsalesc.melee.Monk 0.3.6c | 52 | 31% |
| oog.melee.CapuletDroid 1.1 | 24 | 71% |
| franzor.Lizt 1.3.1 | 24 | 58% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 1482. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 44 | 41% | 69 |
| rtk.Tachikoma 1.0 | 32 | 30% | 94 |
| oog.melee.CapuletDroid 1.1 | 12 | 11% | 39 |
| franzor.Lizt 1.3.1 | 12 | 11% | 2 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 5 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 194491 melee ticks, 92449 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 652 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 307 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 57711 sent, 52933 reached their opponent, 11055 virtual hits (20.9% of those reached).

## Melee bench: F08

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 823 over 6 battles (137.2 per battle, most in one battle 144). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 90.5 | 128 / 210 | 1.85 | 19.3% | 28850 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.0 | 19.3% | 128 |
| tm.Yuugao 1.0 | 2.2 | 13.5% | 30 |
| shrub.Vapour v159 | 2.8 | 12.4% | 28 |
| Krabb.sliNk.Garm 0.9u | 4.3 | 10.9% | 16 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 9.7% | 4 |
| m3thos.Eva00 1.1 | 5.8 | 8.8% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 7.0 | 7.6% | 3 |
| qualidafial.MajorDick 1.0.1 | 7.8 | 7.0% | 0 |
| SHAM.WOW 1.4 | 9.2 | 6.0% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 88.3 | 21 / 35 | 4626 |
| 2 | 1 | 68.7 | 90.8 | 18 / 35 | 4775 |
| 3 | 1 | 70.2 | 94.3 | 27 / 35 | 4892 |
| 4 | 1 | 68.9 | 91.1 | 21 / 35 | 4512 |
| 5 | 1 | 67.8 | 86.0 | 20 / 35 | 4754 |
| 6 | 1 | 69.9 | 92.7 | 21 / 35 | 5291 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 68 | 75% |
| shrub.Vapour v159 | 43 | 63% |
| Krabb.sliNk.Garm 0.9u | 18 | 61% |
| com.spp.robocode.MostlyHarmless 010 | 18 | 94% |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 78% |
| m3thos.Eva00 1.1 | 8 | 100% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 956. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 28 | 31% | 77 |
| shrub.Vapour v159 | 22 | 25% | 52 |
| Krabb.sliNk.Garm 0.9u | 18 | 20% | 27 |
| com.spp.robocode.MostlyHarmless 010 | 6 | 7% | 18 |
| jwst.DAD.DarkAndDarker 1.1 | 3 | 3% | 10 |
| m3thos.Eva00 1.1 | 2 | 2% | 14 |
| SHAM.WOW 1.4 | 1 | 1% | 8 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 3 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 150650 melee ticks, 47804 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 48 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 2.

Targeting waves (204 rounds): 50143 sent, 45210 reached their opponent, 8302 virtual hits (18.4% of those reached).

## Melee bench: F09

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 553 over 6 battles (92.2 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 74.7 | 42 / 210 | 3.28 | 14.6% | 20279 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 18.2% | 109 |
| hadur2.Hadur 3.18bb | 2.2 | 14.6% | 42 |
| kc.micro.Figment 1.0 | 2.7 | 13.6% | 23 |
| yagami.Tidus 0.11 | 4.5 | 10.7% | 5 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.5% | 12 |
| mc2.enemy.Original 0.9 | 6.2 | 9.3% | 13 |
| dft.Calliope 5.6 | 6.7 | 8.3% | 6 |
| step.nanoPri 1.0 | 8.3 | 5.5% | 0 |
| rdm.Dueler 0.4x | 9.3 | 4.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.6 | 71.7 | 6 / 35 | 3256 |
| 2 | 2 | 61.1 | 73.0 | 4 / 35 | 3118 |
| 3 | 3 | 60.8 | 69.8 | 6 / 35 | 3172 |
| 4 | 2 | 62.8 | 76.2 | 6 / 35 | 3476 |
| 5 | 2 | 61.9 | 74.6 | 6 / 35 | 3246 |
| 6 | 1 | 66.0 | 82.5 | 14 / 35 | 4011 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 50 | 18% |
| kc.micro.Figment 1.0 | 23 | 78% |
| pedersen.Grishnakh 1.0 | 10 | 50% |
| mc2.enemy.Original 0.9 | 7 | 29% |
| yagami.Tidus 0.11 | 6 | 100% |
| dft.Calliope 5.6 | 3 | 67% |

Hadur died in 172 of 210 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 77 | 45% | 84 |
| kc.micro.Figment 1.0 | 22 | 13% | 42 |
| yagami.Tidus 0.11 | 21 | 12% | 25 |
| mc2.enemy.Original 0.9 | 21 | 12% | 24 |
| pedersen.Grishnakh 1.0 | 11 | 6% | 14 |
| robar.nano.Assertive_Melee 0.2 | 7 | 4% | 7 |
| dft.Calliope 5.6 | 5 | 3% | 10 |
| step.nanoPri 1.0 | 3 | 2% | 3 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 149790 melee ticks, 31421 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 80 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 49645 sent, 44857 reached their opponent, 6559 virtual hits (14.6% of those reached).

## Melee bench: F10

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 565 over 6 battles (94.2 per battle, most in one battle 142). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 94.8 | 166 / 210 | 1.47 | 20.6% | 33902 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.0 | 20.6% | 166 |
| DTF.Kludgy 1.2b | 2.2 | 14.5% | 23 |
| ne.Chimera 1.2 | 3.0 | 12.7% | 1 |
| ejb.Polaris 1.0.1 | 4.0 | 11.7% | 9 |
| tvv.micro.Antares 1.1.1 | 5.2 | 10.3% | 3 |
| vStar.RAFzilla 2.15 | 5.7 | 9.5% | 4 |
| sam.Samspin 1.0 | 7.8 | 5.4% | 0 |
| kurios.DOSexe .9b | 8.3 | 5.6% | 3 |
| donjezza.Muncho 1.0 | 8.8 | 4.9% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 9.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 94.6 | 27 / 35 | 5587 |
| 2 | 1 | 70.8 | 94.0 | 29 / 35 | 5630 |
| 3 | 1 | 71.4 | 96.2 | 27 / 35 | 5904 |
| 4 | 1 | 69.6 | 90.2 | 22 / 35 | 5515 |
| 5 | 1 | 71.5 | 94.9 | 29 / 35 | 5710 |
| 6 | 1 | 72.1 | 98.7 | 32 / 35 | 5556 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 71 | 80% |
| ne.Chimera 1.2 | 36 | 100% |
| ejb.Polaris 1.0.1 | 34 | 85% |
| tvv.micro.Antares 1.1.1 | 22 | 100% |
| vStar.RAFzilla 2.15 | 19 | 89% |
| donjezza.Muncho 1.0 | 3 | 100% |
| sam.Samspin 1.0 | 1 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 937. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 22 | 46% | 79 |
| ejb.Polaris 1.0.1 | 9 | 19% | 43 |
| ne.Chimera 1.2 | 8 | 17% | 37 |
| vStar.RAFzilla 2.15 | 2 | 4% | 21 |
| tvv.micro.Antares 1.1.1 | 2 | 4% | 16 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 2 |
| kurios.DOSexe .9b | 0 | 0% | 6 |
| donjezza.Muncho 1.0 | 0 | 0% | 4 |
| sam.Samspin 1.0 | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 143544 melee ticks, 56559 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 64 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 47783 sent, 43168 reached their opponent, 8493 virtual hits (19.7% of those reached).

## Melee bench: F11

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 255 over 6 battles (42.5 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 81.5 | 75 / 210 | 2.66 | 16.3% | 22420 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.5 | 16.4% | 72 |
| hadur2.Hadur 3.18bb | 1.5 | 16.3% | 75 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.2% | 24 |
| djc.DynaBot 0.1.1 | 4.2 | 11.1% | 18 |
| rdt199.Warlord 0.73 | 5.7 | 9.2% | 10 |
| br2.MobyDickBot 1.6 | 6.0 | 8.7% | 8 |
| uji.YellohFellah 1.0 | 6.8 | 8.1% | 4 |
| KiraNL.Chupacabra 0.4 | 7.3 | 7.6% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.8% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.9 | 81.6 | 14 / 35 | 3655 |
| 2 | 1 | 65.4 | 84.1 | 15 / 35 | 3620 |
| 3 | 1 | 64.9 | 84.4 | 9 / 35 | 3742 |
| 4 | 1 | 64.8 | 79.4 | 11 / 35 | 4004 |
| 5 | 2 | 65.3 | 80.6 | 15 / 35 | 3903 |
| 6 | 2 | 63.5 | 79.0 | 11 / 35 | 3496 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 45 | 40% |
| djc.DynaBot 0.1.1 | 23 | 70% |
| cx.mini.Nimrod 0.55 | 18 | 44% |
| uji.YellohFellah 1.0 | 17 | 100% |
| br2.MobyDickBot 1.6 | 14 | 57% |
| rdt199.Warlord 0.73 | 6 | 50% |
| KiraNL.Chupacabra 0.4 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 60 | 44% | 85 |
| cx.mini.Nimrod 0.55 | 28 | 20% | 39 |
| rdt199.Warlord 0.73 | 15 | 11% | 26 |
| djc.DynaBot 0.1.1 | 12 | 9% | 24 |
| br2.MobyDickBot 1.6 | 7 | 5% | 13 |
| KiraNL.Chupacabra 0.4 | 5 | 4% | 9 |
| uji.YellohFellah 1.0 | 4 | 3% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 2% | 3 |
| stelo.MirrorNano 1.3 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 152225 melee ticks, 36963 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 497 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 235 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 2.

Targeting waves (201 rounds): 50796 sent, 45995 reached their opponent, 6480 virtual hits (14.1% of those reached).

## Melee bench: F12

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 800 over 6 battles (133.3 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 83.2 | 112 / 210 | 2.51 | 17.3% | 22627 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.0 | 17.3% | 112 |
| bts.wiki.RipCurl 0.9b | 2.0 | 14.2% | 32 |
| nat.PallasHawk 1.0 | 3.5 | 12.8% | 26 |
| darkcanuck.Leon 1.01 | 3.8 | 12.8% | 25 |
| brainfade.melee.Genghis 0.36 | 4.7 | 10.8% | 11 |
| jrm.Test0 1.0 | 6.5 | 8.1% | 1 |
| cs.sheldor.Talon 1.1 | 7.5 | 6.9% | 0 |
| jp.Perpy 16.0 | 7.8 | 6.6% | 2 |
| stuff.Vlad 0.1 | 9.0 | 5.4% | 0 |
| jaybot.bots.Oddball 4.0 | 9.2 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 80.3 | 19 / 35 | 3790 |
| 2 | 1 | 67.3 | 87.0 | 20 / 35 | 3748 |
| 3 | 1 | 64.1 | 76.8 | 13 / 35 | 3694 |
| 4 | 1 | 67.8 | 86.3 | 20 / 35 | 4037 |
| 5 | 1 | 66.5 | 83.2 | 22 / 35 | 3780 |
| 6 | 1 | 66.3 | 85.7 | 18 / 35 | 3578 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 51 | 80% |
| darkcanuck.Leon 1.01 | 39 | 85% |
| nat.PallasHawk 1.0 | 29 | 66% |
| brainfade.melee.Genghis 0.36 | 13 | 77% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| jrm.Test0 1.0 | 3 | 100% |
| jaybot.bots.Oddball 4.0 | 2 | 50% |
| jp.Perpy 16.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 27 | 25% | 53 |
| nat.PallasHawk 1.0 | 25 | 23% | 44 |
| darkcanuck.Leon 1.01 | 16 | 15% | 58 |
| jrm.Test0 1.0 | 13 | 12% | 15 |
| brainfade.melee.Genghis 0.36 | 10 | 9% | 19 |
| jp.Perpy 16.0 | 4 | 4% | 5 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 7 |
| stuff.Vlad 0.1 | 2 | 2% | 4 |
| jaybot.bots.Oddball 4.0 | 2 | 2% | 4 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 130690 melee ticks, 37508 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 38 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 45733 sent, 40550 reached their opponent, 6938 virtual hits (17.1% of those reached).

## Melee bench: F13

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 117 over 6 battles (19.5 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 81.1 | 51 / 210 | 2.70 | 15.6% | 24200 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.2 | 16.7% | 50 |
| hadur2.Hadur 3.18bb | 2.3 | 15.6% | 51 |
| mn.Combat 3.25.0 | 2.5 | 15.7% | 72 |
| shinh.Entangled 0.3 | 4.3 | 12.1% | 26 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.7% | 9 |
| apc.Colossus2 0.17 | 6.2 | 8.1% | 0 |
| stelo.Wang 1.0 | 6.8 | 7.3% | 2 |
| maribo.FollowFire 1 | 8.2 | 4.9% | 0 |
| ayk.WallHugger 1.0 | 8.8 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.8 | 83.2 | 8 / 35 | 4420 |
| 2 | 2 | 64.7 | 82.5 | 9 / 35 | 3879 |
| 3 | 2 | 65.4 | 81.0 | 11 / 35 | 4341 |
| 4 | 3 | 62.2 | 76.2 | 7 / 35 | 3572 |
| 5 | 3 | 64.1 | 78.7 | 8 / 35 | 3930 |
| 6 | 1 | 65.7 | 84.8 | 8 / 35 | 4058 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 50 | 60% |
| mn.Combat 3.25.0 | 35 | 14% |
| shinh.Entangled 0.3 | 15 | 33% |
| gh.micro.Gruweltje 0.7 | 13 | 69% |
| stelo.Wang 1.0 | 3 | 67% |

Hadur died in 159 of 210 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 59 | 37% | 88 |
| mn.Combat 3.25.0 | 47 | 30% | 56 |
| shinh.Entangled 0.3 | 27 | 17% | 32 |
| gh.micro.Gruweltje 0.7 | 11 | 7% | 18 |
| stelo.Wang 1.0 | 10 | 6% | 11 |
| apc.Colossus2 0.17 | 2 | 1% | 2 |
| maribo.FollowFire 1 | 2 | 1% | 2 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 204 rounds): 148383 melee ticks, 39201 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 49 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 43842 sent, 38800 reached their opponent, 6395 virtual hits (16.5% of those reached).

## Melee bench: F14

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 406 over 6 battles (67.7 per battle, most in one battle 147). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 93.2 | 153 / 210 | 1.61 | 20.5% | 34588 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.0 | 20.5% | 153 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.2% | 18 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.5% | 28 |
| Lo_Ian.Gandalf_V4 4.0 | 5.3 | 9.5% | 0 |
| co.edu.usb.rc.LidisTron 1.0 | 5.3 | 9.5% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.3 | 9.3% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.5 | 8.4% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 8.0% | 6 |
| pa.Improved 1.0 | 9.0 | 5.1% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 97.1 | 27 / 35 | 5846 |
| 2 | 1 | 71.6 | 94.0 | 27 / 35 | 5989 |
| 3 | 1 | 71.2 | 91.4 | 27 / 35 | 5702 |
| 4 | 1 | 71.0 | 91.1 | 24 / 35 | 5823 |
| 5 | 1 | 70.5 | 94.0 | 25 / 35 | 5393 |
| 6 | 1 | 70.7 | 91.7 | 23 / 35 | 5835 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 84 | 94% |
| catcat20.shape.Theta 0.018 | 58 | 67% |
| sanyi.mikrobi.Roberto 1.0 | 14 | 86% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 67% |
| Lo_Ian.Gandalf_V4 4.0 | 7 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 7 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 941. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 27 | 46% | 58 |
| simonton.micro.Sprout 1.1.3 | 13 | 22% | 90 |
| sanyi.mikrobi.Roberto 1.0 | 6 | 10% | 19 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 10% | 15 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 3% | 9 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 3% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 7 |
| pa.Improved 1.0 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 142454 melee ticks, 52340 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 40 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 3.

Targeting waves (202 rounds): 45524 sent, 40928 reached their opponent, 10366 virtual hits (25.3% of those reached).

## Melee bench: F15

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 628 over 6 battles (104.7 per battle, most in one battle 151). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 85.1 | 108 / 210 | 2.34 | 18.1% | 28541 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.0 | 18.1% | 108 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.6% | 28 |
| emp.Yngwie 1.11 | 2.8 | 13.3% | 49 |
| mld.DustBunny 3.8 | 3.8 | 12.0% | 8 |
| cb.nano.Insomnia 1.0 | 4.7 | 11.2% | 9 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.1% | 6 |
| Grystrion.TrackerWO 1.0 | 7.7 | 6.6% | 1 |
| lambdaxy.TBot 0.1 | 7.8 | 6.3% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 5.3% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 91.7 | 26 / 35 | 5377 |
| 2 | 1 | 65.4 | 80.6 | 13 / 35 | 4297 |
| 3 | 1 | 66.7 | 81.9 | 14 / 35 | 4708 |
| 4 | 1 | 67.7 | 85.4 | 16 / 35 | 4910 |
| 5 | 1 | 67.6 | 82.9 | 19 / 35 | 4693 |
| 6 | 1 | 68.1 | 87.9 | 20 / 35 | 4556 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 51 | 67% |
| kawigi.micro.Shiz 1.1 | 26 | 81% |
| mld.DustBunny 3.8 | 22 | 100% |
| kawigi.robot.Girl 1.2 | 18 | 94% |
| cb.nano.Insomnia 1.0 | 8 | 88% |
| divineomega.TrialBot 0.003 | 5 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 39 | 36% | 79 |
| kawigi.micro.Shiz 1.1 | 19 | 18% | 39 |
| cb.nano.Insomnia 1.0 | 15 | 14% | 18 |
| mld.DustBunny 3.8 | 14 | 13% | 39 |
| kawigi.robot.Girl 1.2 | 6 | 6% | 15 |
| divineomega.TrialBot 0.003 | 4 | 4% | 11 |
| lambdaxy.TBot 0.1 | 4 | 4% | 4 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 166084 melee ticks, 41732 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 35 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 55221 sent, 50353 reached their opponent, 8428 virtual hits (16.7% of those reached).

## Melee bench: F16

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 342 over 6 battles (57.0 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.7 | 114 / 210 | 2.20 | 18.9% | 31384 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.0 | 18.9% | 114 |
| gh.Griezel 0.5.2 | 2.0 | 15.7% | 41 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.0% | 6 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.8% | 35 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.5% | 6 |
| tvv.nano.Polaris 1.2 | 5.8 | 9.1% | 5 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.5% | 2 |
| repositorio.NanoStep 1.0 | 8.7 | 4.9% | 0 |
| asd.Cthulhu 1.3 | 9.2 | 4.7% | 1 |
| divineomega.DivineBot 1.9.4.5 | 9.2 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 83.5 | 17 / 35 | 5099 |
| 2 | 1 | 69.8 | 88.9 | 19 / 35 | 5621 |
| 3 | 1 | 69.5 | 87.6 | 20 / 35 | 5384 |
| 4 | 1 | 68.7 | 86.3 | 18 / 35 | 5010 |
| 5 | 1 | 69.3 | 87.3 | 23 / 35 | 5123 |
| 6 | 1 | 68.8 | 86.7 | 17 / 35 | 5147 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 76 | 74% |
| techdude.forest.FlamingForest 1.1 | 30 | 57% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 20 | 95% |
| tvv.nano.Polaris 1.2 | 10 | 80% |
| bvh.fnr.Fenrir 0.36l | 10 | 60% |
| stelo.IntrinsicVolatility 1.4 | 5 | 60% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 1066. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 34 | 35% | 91 |
| techdude.forest.FlamingForest 1.1 | 22 | 22% | 41 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 19 | 19% | 35 |
| bvh.fnr.Fenrir 0.36l | 12 | 12% | 16 |
| stelo.IntrinsicVolatility 1.4 | 4 | 4% | 9 |
| tvv.nano.Polaris 1.2 | 4 | 4% | 7 |
| asd.Cthulhu 1.3 | 1 | 1% | 1 |
| divineomega.DivineBot 1.9.4.5 | 0 | 0% | 8 |
| repositorio.NanoStep 1.0 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 171768 melee ticks, 63141 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 42 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 57259 sent, 52532 reached their opponent, 9110 virtual hits (17.3% of those reached).

## Melee bench: F17

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 499 over 6 battles (83.2 per battle, most in one battle 146). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 85.2 | 100 / 210 | 2.33 | 18.5% | 32658 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.0 | 18.5% | 100 |
| et.Predator 1.8 | 2.7 | 13.5% | 23 |
| oog.melee.Mercutio 1.0 | 2.8 | 13.3% | 35 |
| cx.BlestPain 1.41 | 3.5 | 12.6% | 40 |
| ahf.NanoAndrew .4 | 5.5 | 10.3% | 8 |
| nic.Nicator 2.4 | 5.8 | 9.4% | 3 |
| maribo.melee.BMV 0.1 | 6.7 | 8.6% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.2 | 5.8% | 0 |
| tex.Longbot 0.4 | 8.8 | 5.2% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 83.8 | 13 / 35 | 5674 |
| 2 | 1 | 67.0 | 82.2 | 13 / 35 | 5223 |
| 3 | 1 | 69.5 | 87.3 | 19 / 35 | 5609 |
| 4 | 1 | 69.8 | 87.9 | 22 / 35 | 5697 |
| 5 | 1 | 68.4 | 87.3 | 17 / 35 | 4997 |
| 6 | 1 | 67.9 | 82.9 | 16 / 35 | 5458 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 51 | 73% |
| et.Predator 1.8 | 47 | 77% |
| cx.BlestPain 1.41 | 31 | 26% |
| ahf.NanoAndrew .4 | 10 | 90% |
| maribo.melee.BMV 0.1 | 8 | 88% |
| nic.Nicator 2.4 | 3 | 67% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 1088. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 36 | 32% | 46 |
| oog.melee.Mercutio 1.0 | 30 | 27% | 63 |
| et.Predator 1.8 | 24 | 21% | 59 |
| ahf.NanoAndrew .4 | 10 | 9% | 17 |
| nic.Nicator 2.4 | 5 | 4% | 10 |
| maribo.melee.BMV 0.1 | 4 | 4% | 9 |
| tex.Longbot 0.4 | 1 | 1% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 2 |
| goblin.Bender 2.4 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 163520 melee ticks, 64189 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 73 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 2.

Targeting waves (206 rounds): 54864 sent, 50029 reached their opponent, 10679 virtual hits (21.3% of those reached).

## Melee bench: F18

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 698 over 6 battles (116.3 per battle, most in one battle 159). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 89.4 | 132 / 210 | 1.95 | 19.3% | 29337 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.0 | 19.3% | 132 |
| agd.Mooserwirt2 2.7 | 2.5 | 12.3% | 24 |
| morbid.MorbidPriest 1.0 | 2.5 | 13.9% | 27 |
| uji.DBH 1.1 | 4.2 | 10.2% | 8 |
| sigterm.Sigterm 1.0 | 6.0 | 8.5% | 7 |
| ratosh.Nobo 0.21 | 6.0 | 8.6% | 2 |
| spinnercat.Robovirus 2.718 | 6.7 | 8.3% | 2 |
| kawigi.mini.Fhqwhgads 1.1 | 7.7 | 7.5% | 3 |
| stelo.WangRobot 1.0 | 9.2 | 5.7% | 4 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.3 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 87.3 | 25 / 35 | 5227 |
| 2 | 1 | 69.4 | 92.1 | 23 / 35 | 4829 |
| 3 | 1 | 69.5 | 90.8 | 24 / 35 | 4957 |
| 4 | 1 | 70.3 | 94.6 | 25 / 35 | 4961 |
| 5 | 1 | 68.0 | 85.1 | 21 / 35 | 4872 |
| 6 | 1 | 66.7 | 86.7 | 14 / 35 | 4491 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 63 | 75% |
| agd.Mooserwirt2 2.7 | 30 | 80% |
| sigterm.Sigterm 1.0 | 20 | 100% |
| uji.DBH 1.1 | 15 | 87% |
| stelo.WangRobot 1.0 | 11 | 91% |
| ratosh.Nobo 0.21 | 9 | 89% |
| spinnercat.Robovirus 2.718 | 6 | 83% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 30 | 36% | 82 |
| agd.Mooserwirt2 2.7 | 14 | 17% | 38 |
| uji.DBH 1.1 | 8 | 10% | 23 |
| sigterm.Sigterm 1.0 | 6 | 7% | 19 |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 7% | 16 |
| ratosh.Nobo 0.21 | 5 | 6% | 12 |
| spinnercat.Robovirus 2.718 | 5 | 6% | 9 |
| stelo.WangRobot 1.0 | 4 | 5% | 10 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 137961 melee ticks, 46506 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 47 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 47249 sent, 42414 reached their opponent, 9399 virtual hits (22.2% of those reached).

## Melee bench: F19

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 149 over 6 battles (24.8 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.2 | 97.7 | 195 / 210 | 1.21 | 22.2% | 36315 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.0 | 22.2% | 195 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.5% | 8 |
| mld.Infinity 2.2 | 3.8 | 11.7% | 4 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.6% | 3 |
| erdnis.Rover 0.3 | 4.2 | 10.7% | 0 |
| patson.PatsonTestBot 1.0 | 6.5 | 7.8% | 0 |
| mbh.Mbh 0.1 | 6.8 | 7.8% | 0 |
| pac.ABC 2.1 | 7.7 | 6.9% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.7% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 96.5 | 33 / 35 | 6275 |
| 2 | 1 | 73.4 | 99.4 | 34 / 35 | 5824 |
| 3 | 1 | 73.7 | 99.4 | 34 / 35 | 6173 |
| 4 | 1 | 73.3 | 98.1 | 33 / 35 | 6150 |
| 5 | 1 | 72.2 | 95.2 | 29 / 35 | 5727 |
| 6 | 1 | 73.3 | 97.5 | 32 / 35 | 6166 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 103 | 100% |
| krillr.mini.JointStrike 2.0.0 | 27 | 100% |
| mld.Infinity 2.2 | 23 | 100% |
| erdnis.Rover 0.3 | 18 | 100% |
| pac.ABC 2.1 | 10 | 100% |
| patson.PatsonTestBot 1.0 | 8 | 100% |
| mbh.Mbh 0.1 | 4 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 15 of 210 rounds, at a mean tick of 600. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| krillr.mini.JointStrike 2.0.0 | 5 | 33% | 35 |
| mld.Infinity 2.2 | 4 | 27% | 30 |
| davidalves.net.DuelistMiniMelee 1.2 | 3 | 20% | 72 |
| erdnis.Rover 0.3 | 2 | 13% | 23 |
| patson.PatsonTestBot 1.0 | 1 | 7% | 16 |
| mbh.Mbh 0.1 | 0 | 0% | 13 |
| pac.ABC 2.1 | 0 | 0% | 8 |
| pbg.R2D2 1.0 | 0 | 0% | 5 |

Posture (Hadur's M records, 200 rounds): 126357 melee ticks, 45214 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 56 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 3.

Targeting waves (200 rounds): 43541 sent, 39046 reached their opponent, 9251 virtual hits (23.7% of those reached).

## Melee bench: F20

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 99 over 6 battles (16.5 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 91.2 | 139 / 210 | 1.80 | 20.5% | 35382 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.0 | 20.5% | 139 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.9% | 34 |
| fwb.Nine 1.0.1 | 3.8 | 11.1% | 17 |
| nz.jdc.nano.GridFu 1.0 | 4.2 | 10.5% | 3 |
| catcat20.Rabbit 0.001 | 4.3 | 10.3% | 10 |
| m3thos.mini.Eva01 0.5.5 | 5.8 | 9.3% | 2 |
| bayen.nut.Squirrel 1.615 | 7.0 | 7.0% | 3 |
| ntc.ControlledChaos 1.1.4 | 8.3 | 5.8% | 1 |
| djdjdj.NanoSkunk10 1.0 | 8.5 | 5.9% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 90.8 | 21 / 35 | 5965 |
| 2 | 1 | 70.5 | 90.2 | 22 / 35 | 5825 |
| 3 | 1 | 70.5 | 91.4 | 21 / 35 | 5733 |
| 4 | 1 | 70.1 | 87.0 | 22 / 35 | 5938 |
| 5 | 1 | 71.9 | 94.3 | 26 / 35 | 6038 |
| 6 | 1 | 71.5 | 93.3 | 27 / 35 | 5883 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 79 | 84% |
| fwb.Nine 1.0.1 | 38 | 89% |
| catcat20.Rabbit 0.001 | 29 | 90% |
| nz.jdc.nano.GridFu 1.0 | 8 | 100% |
| m3thos.mini.Eva01 0.5.5 | 4 | 75% |
| ntc.ControlledChaos 1.1.4 | 2 | 50% |
| bayen.nut.Squirrel 1.615 | 1 | 0% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 919. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 33 | 46% | 100 |
| fwb.Nine 1.0.1 | 22 | 31% | 32 |
| catcat20.Rabbit 0.001 | 7 | 10% | 34 |
| bayen.nut.Squirrel 1.615 | 4 | 6% | 6 |
| ntc.ControlledChaos 1.1.4 | 2 | 3% | 4 |
| nz.jdc.nano.GridFu 1.0 | 1 | 1% | 15 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 13 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 207 rounds): 167041 melee ticks, 51710 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 33 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 53158 sent, 48400 reached their opponent, 11168 virtual hits (23.1% of those reached).

## Melee bench: F21

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 573 over 6 battles (95.5 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 92.2 | 121 / 210 | 1.70 | 20.1% | 33905 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.0 | 20.1% | 121 |
| eem.EvBot v4.6.16 | 2.0 | 17.1% | 71 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.7% | 9 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.9% | 4 |
| eld.Hmm 1.0 | 5.3 | 8.5% | 8 |
| oa.weak.BotherBot 0.1 | 5.7 | 7.6% | 0 |
| fire219.CatBot 1.0 | 7.7 | 6.0% | 0 |
| el.JumpShoot 0.2 | 7.8 | 5.9% | 0 |
| PSW.Relentless 0.1 | 8.5 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 92.4 | 19 / 35 | 5653 |
| 2 | 1 | 72.4 | 94.3 | 21 / 35 | 6305 |
| 3 | 1 | 70.3 | 93.0 | 16 / 35 | 5164 |
| 4 | 1 | 69.8 | 91.1 | 22 / 35 | 5295 |
| 5 | 1 | 71.2 | 92.1 | 22 / 35 | 5980 |
| 6 | 1 | 70.2 | 90.5 | 21 / 35 | 5508 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 137 | 62% |
| dummy.mini.Scimitar 1.01 | 19 | 74% |
| cf.RiO.RiOx 4.2.1 | 14 | 100% |
| eld.Hmm 1.0 | 10 | 50% |
| oa.weak.BotherBot 0.1 | 2 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 1351. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 56 | 58% | 118 |
| dummy.mini.Scimitar 1.01 | 13 | 13% | 40 |
| cf.RiO.RiOx 4.2.1 | 8 | 8% | 26 |
| eld.Hmm 1.0 | 8 | 8% | 18 |
| PSW.Relentless 0.1 | 2 | 2% | 2 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |
| fire219.CatBot 1.0 | 1 | 1% | 2 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 2 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 188347 melee ticks, 90053 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 43 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 1.

Targeting waves (209 rounds): 56014 sent, 51186 reached their opponent, 8914 virtual hits (17.4% of those reached).

## Melee bench: F22

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 520 over 6 battles (86.7 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 88.2 | 89 / 210 | 2.06 | 18.1% | 28822 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.0 | 18.1% | 89 |
| pe.SandboxDT 2.71m | 2.0 | 16.8% | 63 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.7% | 25 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.3% | 25 |
| bigpete.Stewie 1.0 | 5.0 | 10.3% | 7 |
| yk.JahRoslav 1.1 | 6.7 | 6.8% | 1 |
| tad.Dalek98 0.98 | 7.2 | 6.3% | 0 |
| gg.Squaraus 0.6 | 7.3 | 6.1% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 4.8% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 87.0 | 15 / 35 | 4763 |
| 2 | 1 | 68.5 | 88.9 | 14 / 35 | 4632 |
| 3 | 1 | 68.0 | 87.0 | 13 / 35 | 4858 |
| 4 | 1 | 69.1 | 89.5 | 16 / 35 | 4994 |
| 5 | 1 | 68.5 | 87.6 | 16 / 35 | 4860 |
| 6 | 1 | 68.6 | 89.2 | 15 / 35 | 4715 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 58 | 38% |
| jlm.javaDisturbance 0.59 | 44 | 70% |
| kvk.HebusLeTroll 0.35 | 36 | 75% |
| bigpete.Stewie 1.0 | 7 | 71% |
| yk.JahRoslav 1.1 | 3 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 1043. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 55 | 44% | 79 |
| kvk.HebusLeTroll 0.35 | 33 | 26% | 54 |
| jlm.javaDisturbance 0.59 | 26 | 21% | 56 |
| bigpete.Stewie 1.0 | 5 | 4% | 12 |
| yk.JahRoslav 1.1 | 1 | 1% | 4 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 1% | 2 |
| tad.Dalek98 0.98 | 1 | 1% | 1 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 167769 melee ticks, 46545 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 69 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 69 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 3.

Targeting waves (206 rounds): 53779 sent, 48925 reached their opponent, 8155 virtual hits (16.7% of those reached).

## Melee bench: F23

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 657 over 6 battles (109.5 per battle, most in one battle 116). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 95.0 | 166 / 210 | 1.45 | 21.3% | 34969 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.0 | 21.3% | 166 |
| pe.SandboxLump 1.52 | 2.0 | 16.8% | 32 |
| cre.Karolos 0.32 | 3.0 | 13.3% | 9 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.5% | 0 |
| stelo.RamTrackSurfer 1.2 | 5.2 | 9.5% | 3 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.8 | 8.7% | 0 |
| cw.megas.Blade 0.8 | 7.0 | 8.0% | 0 |
| sample.Walls 1.0 | 7.8 | 7.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.2 | 2.5% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 93.3 | 27 / 35 | 5861 |
| 2 | 1 | 72.9 | 96.2 | 27 / 35 | 5885 |
| 3 | 1 | 72.3 | 94.0 | 27 / 35 | 5547 |
| 4 | 1 | 73.1 | 94.9 | 31 / 35 | 5991 |
| 5 | 1 | 73.0 | 95.2 | 27 / 35 | 5887 |
| 6 | 1 | 72.7 | 96.2 | 27 / 35 | 5798 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 106 | 83% |
| cre.Karolos 0.32 | 47 | 96% |
| stelo.RamTrackSurfer 1.2 | 15 | 93% |
| sample.Walls 1.0 | 7 | 100% |
| stelo.AreaTargetingBot 1.1 | 5 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 3 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 826. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 25 | 50% | 104 |
| cre.Karolos 0.32 | 12 | 24% | 55 |
| stelo.RamTrackSurfer 1.2 | 3 | 6% | 25 |
| stelo.AreaTargetingBot 1.1 | 1 | 2% | 7 |
| cw.megas.Blade 0.8 | 1 | 2% | 5 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 2% | 4 |
| sample.Walls 1.0 | 1 | 2% | 3 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 126923 melee ticks, 49971 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 541 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 71 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 40397 sent, 35510 reached their opponent, 10727 virtual hits (30.2% of those reached).

## Melee bench: F24

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 436 over 6 battles (72.7 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 80.1 | 80 / 210 | 2.80 | 16.3% | 23150 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.0 | 16.3% | 80 |
| rz.GlowBlowMelee 1.4 | 2.8 | 13.9% | 48 |
| florent.XSeries.X2 0.12 | 3.0 | 13.4% | 31 |
| pedersen.Ugluk 1.1.1 | 4.0 | 12.6% | 20 |
| davidalves.Phoenix 0.54 | 4.2 | 12.6% | 25 |
| oog.melee.Corsair 1.0 | 6.0 | 9.7% | 6 |
| stelo.SoJNanoMelee 1.1 | 7.2 | 6.6% | 0 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.2% | 0 |
| as.FrankTheTank 1.3 | 9.2 | 4.6% | 0 |
| evd.X1 0.01 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 80.6 | 11 / 35 | 3987 |
| 2 | 1 | 64.5 | 77.5 | 11 / 35 | 3950 |
| 3 | 1 | 66.6 | 84.8 | 15 / 35 | 3884 |
| 4 | 1 | 63.9 | 78.7 | 14 / 35 | 3442 |
| 5 | 1 | 65.3 | 80.0 | 17 / 35 | 3653 |
| 6 | 1 | 65.1 | 78.7 | 12 / 35 | 4234 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 39 | 59% |
| pedersen.Ugluk 1.1.1 | 22 | 77% |
| florent.XSeries.X2 0.12 | 21 | 76% |
| davidalves.Phoenix 0.54 | 20 | 55% |
| oog.melee.Corsair 1.0 | 10 | 50% |
| stelo.SoJNanoMelee 1.1 | 5 | 100% |
| lunchie.Lunchbox 0.93 | 2 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 33 | 25% | 51 |
| florent.XSeries.X2 0.12 | 28 | 21% | 46 |
| davidalves.Phoenix 0.54 | 26 | 20% | 36 |
| pedersen.Ugluk 1.1.1 | 23 | 17% | 37 |
| oog.melee.Corsair 1.0 | 12 | 9% | 23 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 7 |
| stelo.SoJNanoMelee 1.1 | 2 | 2% | 5 |
| as.FrankTheTank 1.3 | 2 | 2% | 3 |
| evd.X1 0.01 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 137724 melee ticks, 33871 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 381 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 381 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 46728 sent, 41764 reached their opponent, 7860 virtual hits (18.8% of those reached).

## Melee bench: F25

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 778 over 6 battles (129.7 per battle, most in one battle 243). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 86.9 | 125 / 210 | 2.18 | 18.2% | 23303 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.0 | 18.2% | 125 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.8% | 26 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 13.3% | 19 |
| jdw.Hurricane 1.4 | 3.8 | 11.6% | 22 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.7% | 8 |
| ds.Oo 2.2 | 5.7 | 9.4% | 7 |
| awesomeness.Elite 1.0 | 7.2 | 7.3% | 1 |
| adt.Ar2 1.1 | 8.3 | 6.3% | 0 |
| gjr.Cephalosporin 0.1 | 8.3 | 6.3% | 2 |
| amk.ChumbaMini 0.2 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 88.9 | 20 / 35 | 4025 |
| 2 | 1 | 66.4 | 82.5 | 23 / 35 | 3684 |
| 3 | 1 | 67.6 | 88.3 | 20 / 35 | 3809 |
| 4 | 1 | 67.6 | 85.7 | 20 / 35 | 4034 |
| 5 | 1 | 66.2 | 83.5 | 18 / 35 | 3640 |
| 6 | 1 | 69.4 | 92.4 | 24 / 35 | 4111 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 44 | 89% |
| voidious.mini.BrokenSword 2.0.3 | 42 | 83% |
| jdw.Hurricane 1.4 | 29 | 62% |
| gre.svman4.Morfeas 1.4.1 | 12 | 67% |
| ds.Oo 2.2 | 12 | 92% |
| gjr.Cephalosporin 0.1 | 7 | 86% |
| awesomeness.Elite 1.0 | 6 | 100% |
| adt.Ar2 1.1 | 2 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 700. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 20 | 22% | 31 |
| voidious.micro.BlitzBat 1.05 | 19 | 21% | 54 |
| voidious.mini.BrokenSword 2.0.3 | 16 | 18% | 47 |
| gre.svman4.Morfeas 1.4.1 | 8 | 9% | 23 |
| ds.Oo 2.2 | 8 | 9% | 21 |
| awesomeness.Elite 1.0 | 5 | 5% | 13 |
| gjr.Cephalosporin 0.1 | 4 | 4% | 10 |
| adt.Ar2 1.1 | 4 | 4% | 7 |
| amk.ChumbaMini 0.2 | 1 | 1% | 4 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 129048 melee ticks, 31618 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 34 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 46369 sent, 41472 reached their opponent, 7117 virtual hits (17.2% of those reached).

## Melee bench: F26

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 324 over 6 battles (54.0 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 89.8 | 122 / 210 | 1.91 | 19.8% | 35876 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.0 | 19.8% | 122 |
| ak.Fermat 2.0 | 2.0 | 15.6% | 47 |
| lrem.Spectre 0.4.4 | 3.3 | 12.9% | 17 |
| shu.nitro.LENIN .T34 | 3.7 | 12.1% | 16 |
| js.PinBall 1.6 | 5.2 | 10.6% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 5.8 | 9.5% | 3 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 7.8% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.6% | 1 |
| sample.SpinBot 1.0 | 9.0 | 3.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 93.3 | 22 / 35 | 6098 |
| 2 | 1 | 69.7 | 87.6 | 19 / 35 | 5729 |
| 3 | 1 | 70.9 | 89.8 | 24 / 35 | 5958 |
| 4 | 1 | 70.9 | 91.1 | 19 / 35 | 6421 |
| 5 | 1 | 70.8 | 91.1 | 21 / 35 | 6023 |
| 6 | 1 | 69.7 | 86.0 | 17 / 35 | 5647 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 70 | 60% |
| lrem.Spectre 0.4.4 | 38 | 76% |
| shu.nitro.LENIN .T34 | 26 | 85% |
| js.PinBall 1.6 | 18 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 9 | 89% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |
| gh.mini.GrubbmOne 1.0 | 2 | 50% |

Hadur died in 90 of 210 rounds, at a mean tick of 937. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 43 | 48% | 89 |
| lrem.Spectre 0.4.4 | 21 | 23% | 40 |
| shu.nitro.LENIN .T34 | 12 | 13% | 37 |
| jaybot.adv.bots.JayBot 2.0 | 6 | 7% | 16 |
| js.PinBall 1.6 | 4 | 4% | 21 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 4 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 1% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 156844 melee ticks, 50278 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 40 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 51587 sent, 46757 reached their opponent, 11718 virtual hits (25.1% of those reached).

## Melee bench: F27

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 409 over 6 battles (68.2 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 93.3 | 156 / 210 | 1.60 | 20.5% | 31520 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.0 | 20.5% | 156 |
| mk.Alpha 0.2.1 | 2.0 | 14.2% | 30 |
| EH.Eagle 1.0.6 | 4.2 | 10.2% | 6 |
| techdude.kombat.FlamingKombat 1.5 | 4.7 | 9.6% | 0 |
| throxbot.ThroxBot 0.1 | 5.8 | 8.9% | 5 |
| sheldor.melee.nano.TestMelee 0.1 | 6.2 | 8.7% | 9 |
| wee.Gem 1.8.4 | 6.2 | 8.9% | 4 |
| joe.ADinosaur 1.0 | 6.8 | 7.8% | 0 |
| caimano.Furia_Ceca 0.22 | 8.7 | 6.4% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 87.3 | 20 / 35 | 4489 |
| 2 | 1 | 72.1 | 96.2 | 29 / 35 | 5770 |
| 3 | 1 | 70.9 | 92.4 | 28 / 35 | 5553 |
| 4 | 1 | 72.2 | 97.5 | 30 / 35 | 5480 |
| 5 | 1 | 68.7 | 88.9 | 20 / 35 | 4895 |
| 6 | 1 | 71.7 | 97.8 | 29 / 35 | 5333 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 98 | 86% |
| EH.Eagle 1.0.6 | 31 | 90% |
| techdude.kombat.FlamingKombat 1.5 | 15 | 100% |
| wee.Gem 1.8.4 | 12 | 92% |
| throxbot.ThroxBot 0.1 | 11 | 82% |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 75% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 29 | 51% | 102 |
| EH.Eagle 1.0.6 | 8 | 14% | 33 |
| throxbot.ThroxBot 0.1 | 4 | 7% | 14 |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 7% | 12 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 4% | 22 |
| joe.ADinosaur 1.0 | 2 | 4% | 6 |
| caimano.Furia_Ceca 0.22 | 2 | 4% | 5 |
| cs.Grudge 1.0 | 2 | 4% | 3 |
| wee.Gem 1.8.4 | 1 | 2% | 13 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 135457 melee ticks, 41819 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 33 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 3.

Targeting waves (203 rounds): 44286 sent, 39512 reached their opponent, 9785 virtual hits (24.8% of those reached).

## Melee bench: F28

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 557 over 6 battles (92.8 per battle, most in one battle 142). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 89.5 | 127 / 210 | 1.94 | 18.4% | 23820 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.0 | 18.4% | 127 |
| kid.test.NightFox .2 | 2.0 | 14.8% | 32 |
| uji.Antique 1.0 | 3.3 | 11.3% | 18 |
| qohnil.blot.BlotBot 3.61 | 4.2 | 10.8% | 13 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.4% | 6 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.8% | 5 |
| ahr.ice.Ice 1.0.2 | 6.5 | 8.7% | 8 |
| stelo.PianistNano 1.2 | 8.8 | 5.8% | 0 |
| stelo.Lifestealer 1.0 | 8.8 | 5.5% | 0 |
| matt.advanced.Katana 1.0 | 9.3 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 88.6 | 16 / 35 | 4044 |
| 2 | 1 | 66.3 | 84.8 | 22 / 35 | 3741 |
| 3 | 1 | 69.3 | 94.0 | 24 / 35 | 4340 |
| 4 | 1 | 67.6 | 88.6 | 23 / 35 | 3762 |
| 5 | 1 | 67.7 | 89.2 | 21 / 35 | 3900 |
| 6 | 1 | 68.4 | 92.1 | 21 / 35 | 4033 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 69 | 75% |
| uji.Antique 1.0 | 49 | 86% |
| qohnil.blot.BlotBot 3.61 | 19 | 68% |
| ahr.ice.Ice 1.0.2 | 13 | 69% |
| amk.ChumbaWumba 0.3 | 8 | 63% |
| pfvicm.Sobieski 7.2.3b | 7 | 71% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 759. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 25 | 28% | 59 |
| pfvicm.Sobieski 7.2.3b | 17 | 19% | 25 |
| uji.Antique 1.0 | 16 | 18% | 50 |
| qohnil.blot.BlotBot 3.61 | 9 | 10% | 28 |
| amk.ChumbaWumba 0.3 | 9 | 10% | 20 |
| ahr.ice.Ice 1.0.2 | 7 | 8% | 21 |
| stelo.Lifestealer 1.0 | 2 | 2% | 3 |
| matt.advanced.Katana 1.0 | 0 | 0% | 2 |
| stelo.PianistNano 1.2 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 130974 melee ticks, 37534 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 33 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 44573 sent, 39845 reached their opponent, 5876 virtual hits (14.7% of those reached).

## Melee bench: F29

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 837 over 6 battles (139.5 per battle, most in one battle 146). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 85.2 | 95 / 210 | 2.33 | 18.2% | 27415 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.2 | 18.2% | 95 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 15.1% | 55 |
| deewiant.Anomaly 0.2 | 2.5 | 15.0% | 44 |
| myl.micro.Troodon 1.10 | 4.0 | 12.3% | 7 |
| jok.PheonixM 0.1.2 | 5.0 | 10.4% | 7 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.4% | 1 |
| DBall.Anarchy 0.1 | 7.5 | 5.8% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 7.7 | 5.9% | 0 |
| ap.Frederick 1.1 | 8.8 | 4.8% | 3 |
| jangs.ns51 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.4 | 79.7 | 13 / 35 | 4266 |
| 2 | 1 | 68.1 | 85.7 | 15 / 35 | 4228 |
| 3 | 1 | 69.4 | 89.5 | 18 / 35 | 4866 |
| 4 | 1 | 67.1 | 80.6 | 15 / 35 | 4715 |
| 5 | 1 | 69.1 | 88.6 | 16 / 35 | 4759 |
| 6 | 1 | 68.8 | 87.0 | 18 / 35 | 4581 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 68 | 62% |
| zyx.mega.YersiniaPestis 3.1 | 35 | 43% |
| myl.micro.Troodon 1.10 | 22 | 95% |
| jok.PheonixM 0.1.2 | 13 | 85% |
| ap.Frederick 1.1 | 3 | 100% |
| DBall.Anarchy 0.1 | 3 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 0% |
| jangs.ns51 1.0 | 1 | 0% |

Hadur died in 122 of 210 rounds, at a mean tick of 1000. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 44 | 36% | 82 |
| zyx.mega.YersiniaPestis 3.1 | 38 | 31% | 51 |
| jok.PheonixM 0.1.2 | 14 | 11% | 26 |
| myl.micro.Troodon 1.10 | 13 | 11% | 34 |
| ph.melee.ArcherME 0.3 | 4 | 3% | 8 |
| DBall.Anarchy 0.1 | 1 | 1% | 6 |
| jangs.ns51 1.0 | 1 | 1% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 0 | 0% | 2 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 167340 melee ticks, 51612 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 48 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 54998 sent, 50126 reached their opponent, 8082 virtual hits (16.1% of those reached).

## Melee bench: F30

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 736 over 6 battles (122.7 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 76.0 | 41 / 210 | 3.16 | 14.8% | 22212 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.3 | 14.8% | 41 |
| catcat20.Matcha 0.006 | 2.2 | 14.1% | 46 |
| darkcanuck.B26354 1.06 | 2.8 | 13.5% | 55 |
| oog.melee.Capulet 1.2 | 4.2 | 12.3% | 29 |
| stelo.PastFuture 2.3.2 | 4.5 | 11.9% | 17 |
| intruder.PrairieWolf 2.61 | 6.3 | 8.7% | 7 |
| fowl3628800.LightningBolt 2.6.0 | 7.3 | 7.7% | 13 |
| tripphippy.Alice 1.1 | 8.0 | 7.0% | 2 |
| ntc.Opposite 1.5 | 8.3 | 7.1% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.3 | 70.2 | 2 / 35 | 3648 |
| 2 | 1 | 61.5 | 75.6 | 6 / 35 | 3349 |
| 3 | 1 | 63.4 | 77.5 | 7 / 35 | 3969 |
| 4 | 1 | 64.9 | 83.2 | 11 / 35 | 3879 |
| 5 | 1 | 62.5 | 75.9 | 9 / 35 | 3632 |
| 6 | 2 | 62.1 | 74.0 | 6 / 35 | 3735 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 30 | 43% |
| darkcanuck.B26354 1.06 | 25 | 28% |
| oog.melee.Capulet 1.2 | 20 | 40% |
| stelo.PastFuture 2.3.2 | 8 | 38% |
| fowl3628800.LightningBolt 2.6.0 | 7 | 29% |
| tripphippy.Alice 1.1 | 5 | 60% |
| intruder.PrairieWolf 2.61 | 5 | 80% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 42 | 24% | 57 |
| darkcanuck.B26354 1.06 | 37 | 21% | 41 |
| oog.melee.Capulet 1.2 | 33 | 19% | 46 |
| stelo.PastFuture 2.3.2 | 30 | 17% | 33 |
| fowl3628800.LightningBolt 2.6.0 | 12 | 7% | 11 |
| intruder.PrairieWolf 2.61 | 8 | 5% | 12 |
| tripphippy.Alice 1.1 | 7 | 4% | 9 |
| ntc.Opposite 1.5 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 160928 melee ticks, 32951 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 46 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 52306 sent, 47538 reached their opponent, 7944 virtual hits (16.7% of those reached).

## Melee bench: F31

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 709 over 6 battles (118.2 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 75.7 | 54 / 210 | 3.19 | 15.0% | 21136 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.2 | 17.4% | 81 |
| hadur2.Hadur 3.18bb | 2.0 | 15.0% | 54 |
| gh.mini.Griezel 0.2 | 3.2 | 13.4% | 51 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.5% | 7 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 11.3% | 7 |
| gh.nano.Grofvuil 0.2 | 5.8 | 8.9% | 8 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.8% | 2 |
| fm.mammillarias 1.3 | 8.5 | 5.5% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.1% | 0 |
| tlp.ThreeLeggedPig 1 | 9.2 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 81.9 | 10 / 35 | 3955 |
| 2 | 3 | 60.9 | 70.5 | 8 / 35 | 3204 |
| 3 | 2 | 64.0 | 78.1 | 11 / 35 | 3744 |
| 4 | 2 | 63.1 | 75.6 | 8 / 35 | 3417 |
| 5 | 1 | 63.5 | 77.1 | 11 / 35 | 3625 |
| 6 | 2 | 60.7 | 70.8 | 6 / 35 | 3191 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 46 | 54% |
| gh.mini.Griezel 0.2 | 27 | 44% |
| d414.nano.Quantum 1.0.0 | 8 | 75% |
| spinnercat.micro.Tyger 0.1 | 4 | 75% |
| gh.nano.Grofvuil 0.2 | 4 | 100% |
| timmit.nano.TimDog 0.33 | 2 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |

Hadur died in 163 of 210 rounds, at a mean tick of 818. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 59 | 36% | 82 |
| gh.mini.Griezel 0.2 | 41 | 25% | 56 |
| spinnercat.micro.Tyger 0.1 | 19 | 12% | 23 |
| d414.nano.Quantum 1.0.0 | 17 | 10% | 24 |
| timmit.nano.TimDog 0.33 | 6 | 4% | 7 |
| gh.nano.Grofvuil 0.2 | 5 | 3% | 9 |
| fm.mammillarias 1.3 | 5 | 3% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 3 | 2% | 3 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 151729 melee ticks, 28133 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 49 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 49959 sent, 44924 reached their opponent, 7452 virtual hits (16.6% of those reached).

## Melee bench: F32

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 164 over 6 battles (27.3 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 88.9 | 122 / 210 | 2.00 | 18.4% | 26960 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.0 | 18.4% | 122 |
| kawigi.sbf.FloodHT 0.9.2 | 2.2 | 14.2% | 41 |
| apc.botM 3.0 | 3.0 | 12.1% | 17 |
| vjik.UnViolation 1.1 | 4.3 | 10.7% | 12 |
| lxx.ConceptA 0.8 | 4.5 | 10.5% | 5 |
| bayen.UbaMicro 1.4 | 6.0 | 8.3% | 4 |
| conscience.Electron 1.3g | 7.8 | 6.8% | 1 |
| yk.JahMicro 1.0 | 7.8 | 6.9% | 4 |
| panzer.Panzer 0.2 | 8.3 | 6.7% | 0 |
| donjezza.Jezza 1.0 | 10.0 | 5.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 87.9 | 18 / 35 | 4294 |
| 2 | 1 | 66.8 | 88.6 | 18 / 35 | 4067 |
| 3 | 1 | 67.7 | 87.0 | 21 / 35 | 4713 |
| 4 | 1 | 67.4 | 87.9 | 21 / 35 | 4472 |
| 5 | 1 | 69.3 | 93.0 | 23 / 35 | 4831 |
| 6 | 1 | 67.9 | 89.2 | 21 / 35 | 4583 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 72 | 63% |
| apc.botM 3.0 | 40 | 75% |
| lxx.ConceptA 0.8 | 17 | 82% |
| vjik.UnViolation 1.1 | 11 | 73% |
| yk.JahMicro 1.0 | 10 | 70% |
| bayen.UbaMicro 1.4 | 10 | 80% |
| donjezza.Jezza 1.0 | 8 | 75% |
| panzer.Panzer 0.2 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 805. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 31 | 35% | 77 |
| apc.botM 3.0 | 19 | 21% | 48 |
| lxx.ConceptA 0.8 | 17 | 19% | 30 |
| bayen.UbaMicro 1.4 | 7 | 8% | 15 |
| vjik.UnViolation 1.1 | 5 | 6% | 22 |
| conscience.Electron 1.3g | 4 | 4% | 6 |
| yk.JahMicro 1.0 | 3 | 3% | 6 |
| donjezza.Jezza 1.0 | 2 | 2% | 4 |
| panzer.Panzer 0.2 | 1 | 1% | 2 |

Posture (Hadur's M records, 204 rounds): 125934 melee ticks, 53070 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 42 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 43559 sent, 38719 reached their opponent, 7169 virtual hits (18.5% of those reached).

## Melee bench: F33

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 504 over 6 battles (84.0 per battle, most in one battle 146). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 90.1 | 120 / 210 | 1.89 | 19.5% | 29185 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.2 | 19.5% | 120 |
| maribo.Quester 0.3 | 1.8 | 16.2% | 45 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.8% | 17 |
| gre.svman4.Leonidas 1.3.2 | 4.2 | 11.1% | 11 |
| labg.Cataclysm 2.05 | 5.2 | 10.2% | 8 |
| baal.nano.N 1.42 | 6.0 | 8.9% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.2% | 7 |
| zyx.micro.Ant 1.1 | 8.2 | 5.4% | 1 |
| sanja.First 0.1 | 8.8 | 4.6% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 91.4 | 20 / 35 | 5110 |
| 2 | 1 | 71.2 | 93.7 | 22 / 35 | 5215 |
| 3 | 1 | 69.8 | 91.1 | 20 / 35 | 4633 |
| 4 | 1 | 69.8 | 90.5 | 21 / 35 | 4876 |
| 5 | 1 | 69.0 | 86.3 | 20 / 35 | 4910 |
| 6 | 2 | 68.7 | 87.6 | 17 / 35 | 4441 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 80 | 75% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 73% |
| gre.svman4.Leonidas 1.3.2 | 18 | 78% |
| labg.Cataclysm 2.05 | 11 | 82% |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 43% |
| baal.nano.N 1.42 | 4 | 100% |
| sanja.First 0.1 | 2 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 1055. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 38 | 40% | 91 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 19% | 49 |
| gre.svman4.Leonidas 1.3.2 | 15 | 16% | 28 |
| labg.Cataclysm 2.05 | 6 | 6% | 15 |
| baal.nano.N 1.42 | 6 | 6% | 11 |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 6% | 11 |
| zyx.micro.Ant 1.1 | 2 | 2% | 3 |
| sanja.First 0.1 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 177510 melee ticks, 53082 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 40 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 57037 sent, 52260 reached their opponent, 7836 virtual hits (15.0% of those reached).

## Melee bench: F34

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 213 over 6 battles (35.5 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 87.8 | 79 / 210 | 2.10 | 18.2% | 30456 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.2 | 18.2% | 79 |
| kid.Gladiator .7.2 | 2.2 | 16.6% | 51 |
| stelo.Spread 0.9 | 2.7 | 15.9% | 57 |
| jcs.Seth 1.8 | 4.2 | 11.7% | 18 |
| tcf.Reach 3 | 5.0 | 10.3% | 5 |
| cli.Dancer 1.1 | 5.8 | 9.3% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.4% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.6% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 2.9% | 0 |
| sample.RamFire 1.0 | 9.7 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 89.5 | 14 / 35 | 4928 |
| 2 | 1 | 69.6 | 89.2 | 15 / 35 | 5279 |
| 3 | 1 | 69.3 | 89.2 | 13 / 35 | 5158 |
| 4 | 2 | 68.2 | 86.0 | 13 / 35 | 4786 |
| 5 | 1 | 68.6 | 86.3 | 11 / 35 | 5176 |
| 6 | 1 | 68.7 | 86.3 | 13 / 35 | 5129 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 62 | 56% |
| stelo.Spread 0.9 | 55 | 51% |
| jcs.Seth 1.8 | 23 | 43% |
| tcf.Reach 3 | 5 | 60% |
| ratosh.Wesco 1.4 | 2 | 50% |
| cli.Dancer 1.1 | 1 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 1109. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 52 | 39% | 81 |
| stelo.Spread 0.9 | 45 | 33% | 80 |
| jcs.Seth 1.8 | 19 | 14% | 28 |
| tcf.Reach 3 | 9 | 7% | 12 |
| cli.Dancer 1.1 | 5 | 4% | 7 |
| ratosh.Wesco 1.4 | 2 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 171717 melee ticks, 58503 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 33 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 53704 sent, 49016 reached their opponent, 8455 virtual hits (17.2% of those reached).

## Melee bench: F35

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 725 over 6 battles (120.8 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 84.0 | 47 / 210 | 2.44 | 16.3% | 23004 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 18.8% | 124 |
| hadur2.Hadur 3.18bb | 2.0 | 16.3% | 47 |
| gh.mini.Gruwel 0.9 | 3.2 | 13.0% | 27 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.2 | 12.2% | 10 |
| rz.HawkOnFire 0.1 | 4.7 | 11.4% | 2 |
| wit.Chuliath 1.0 | 6.3 | 6.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.0 | 6.2% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.0 | 5.9% | 0 |
| dans.Cinnamon 1.2 | 9.2 | 4.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.5 | 81.6 | 6 / 35 | 3751 |
| 2 | 2 | 64.7 | 81.6 | 9 / 35 | 3674 |
| 3 | 2 | 66.6 | 86.7 | 10 / 35 | 3918 |
| 4 | 2 | 65.7 | 84.8 | 6 / 35 | 3905 |
| 5 | 2 | 65.5 | 84.4 | 7 / 35 | 3846 |
| 6 | 2 | 66.4 | 84.8 | 9 / 35 | 3910 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 80 | 23% |
| gh.mini.Gruwel 0.9 | 26 | 31% |
| dmh.robocode.robot.BlackDeath 9.2 | 13 | 62% |
| rz.HawkOnFire 0.1 | 12 | 92% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 169 of 210 rounds, at a mean tick of 953. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 99 | 59% | 118 |
| gh.mini.Gruwel 0.9 | 27 | 16% | 36 |
| dmh.robocode.robot.BlackDeath 9.2 | 24 | 14% | 31 |
| rz.HawkOnFire 0.1 | 10 | 6% | 18 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 1% | 3 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
| wit.Chuliath 1.0 | 0 | 0% | 1 |
| myl.nano.KomoriNinja 1.1 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 153842 melee ticks, 49529 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 50 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 1.

Targeting waves (209 rounds): 47115 sent, 42241 reached their opponent, 6689 virtual hits (15.8% of those reached).

## Melee bench: F36

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 384 over 6 battles (64.0 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 92.0 | 160 / 210 | 1.72 | 20.7% | 32282 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.0 | 20.7% | 160 |
| bzdp.Pansy 2.1 | 2.2 | 12.6% | 9 |
| alpha.RainingFire 1.0 | 3.0 | 12.3% | 15 |
| mz.Cork 0.1 | 4.2 | 11.2% | 12 |
| bvh.micro.Freya 0.3 | 5.2 | 10.4% | 7 |
| m3thos.Eva02 0.7.1 | 5.7 | 9.9% | 5 |
| bvh.mini.Fenrir 0.39 | 6.8 | 8.9% | 0 |
| dl.BetterWalls 1.0 | 8.5 | 5.2% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 5.3% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 88.9 | 29 / 35 | 5561 |
| 2 | 1 | 71.4 | 93.7 | 26 / 35 | 5414 |
| 3 | 1 | 70.9 | 93.0 | 25 / 35 | 5253 |
| 4 | 1 | 71.4 | 92.1 | 27 / 35 | 5534 |
| 5 | 1 | 72.1 | 96.2 | 30 / 35 | 5381 |
| 6 | 1 | 69.4 | 87.9 | 23 / 35 | 5139 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 47 | 94% |
| mz.Cork 0.1 | 36 | 86% |
| alpha.RainingFire 1.0 | 35 | 83% |
| bvh.micro.Freya 0.3 | 31 | 97% |
| m3thos.Eva02 0.7.1 | 14 | 93% |
| bvh.mini.Fenrir 0.39 | 10 | 100% |
| sample.MyFirstRobot 1.0 | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 16 | 30% | 43 |
| bzdp.Pansy 2.1 | 8 | 15% | 51 |
| mz.Cork 0.1 | 8 | 15% | 42 |
| bvh.mini.Fenrir 0.39 | 8 | 15% | 15 |
| m3thos.Eva02 0.7.1 | 5 | 9% | 25 |
| bvh.micro.Freya 0.3 | 3 | 6% | 25 |
| squidM.TentalceMeleeNano 1.1 | 3 | 6% | 4 |
| dl.BetterWalls 1.0 | 0 | 0% | 4 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 142378 melee ticks, 45620 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 128 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 128 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 50115 sent, 45561 reached their opponent, 9469 virtual hits (20.8% of those reached).

## Melee bench: F37

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 161 over 6 battles (26.8 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 88.7 | 166 / 210 | 2.02 | 19.3% | 32484 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.0 | 19.3% | 166 |
| germ.TheMind .2 | 2.7 | 10.8% | 9 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.2 | 10.4% | 9 |
| agrach.Dalek 1.0 | 4.8 | 9.3% | 10 |
| EBBU.Sim2 1.02 | 4.8 | 9.5% | 4 |
| stelo.UntouchableNano 1.3 | 6.0 | 8.8% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 6.3 | 8.6% | 1 |
| mb.Beast 0.1 | 7.3 | 8.2% | 2 |
| lmk.ACPFinal 0.1 | 8.3 | 8.0% | 2 |
| skm.Ryubot 1.0 | 9.5 | 7.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 83.5 | 24 / 35 | 5083 |
| 2 | 1 | 68.6 | 87.9 | 27 / 35 | 5566 |
| 3 | 1 | 69.6 | 93.3 | 30 / 35 | 5574 |
| 4 | 1 | 68.2 | 90.5 | 29 / 35 | 4949 |
| 5 | 1 | 67.6 | 85.7 | 26 / 35 | 5534 |
| 6 | 1 | 69.7 | 91.1 | 30 / 35 | 5778 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.UntouchableNano 1.3 | 27 | 96% |
| germ.TheMind .2 | 26 | 100% |
| agrach.Dalek 1.0 | 24 | 96% |
| com.syncleus.robocode.Dreadnaught 0.1 | 23 | 96% |
| mb.Beast 0.1 | 21 | 100% |
| lmk.ACPFinal 0.1 | 21 | 95% |
| skm.Ryubot 1.0 | 13 | 100% |
| EBBU.Sim2 1.02 | 12 | 92% |
| mn.nano.perceptual.Impact 1.3.0 | 5 | 80% |

Hadur died in 44 of 210 rounds, at a mean tick of 369. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 10 | 23% | 16 |
| agrach.Dalek 1.0 | 7 | 16% | 42 |
| com.syncleus.robocode.Dreadnaught 0.1 | 7 | 16% | 34 |
| germ.TheMind .2 | 6 | 14% | 22 |
| lmk.ACPFinal 0.1 | 5 | 11% | 25 |
| stelo.UntouchableNano 1.3 | 4 | 9% | 30 |
| mb.Beast 0.1 | 4 | 9% | 18 |
| EBBU.Sim2 1.02 | 1 | 2% | 16 |
| skm.Ryubot 1.0 | 0 | 0% | 6 |

Posture (Hadur's M records, 202 rounds): 95184 melee ticks, 26614 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 41 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 32656 sent, 28213 reached their opponent, 8259 virtual hits (29.3% of those reached).

## Melee bench: F38

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 639 over 6 battles (106.5 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 85.1 | 97 / 210 | 2.34 | 17.6% | 26979 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.2 | 17.6% | 97 |
| justin.Mallais 14.0 | 1.8 | 16.2% | 68 |
| bvh.mini.Freya 0.55 | 3.7 | 12.3% | 12 |
| bts.mega.Gnarly 1.4 | 3.8 | 11.4% | 17 |
| cs.Wren 1.0 | 5.0 | 10.4% | 8 |
| kdf.KoulDestroyer 1.0 | 5.7 | 9.6% | 6 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.8 | 8.0% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.6% | 1 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.1% | 1 |
| bzdp.BoxCar 2.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 90.8 | 23 / 35 | 4854 |
| 2 | 2 | 65.7 | 80.0 | 13 / 35 | 4305 |
| 3 | 1 | 68.6 | 86.7 | 18 / 35 | 4969 |
| 4 | 1 | 65.4 | 82.2 | 12 / 35 | 4118 |
| 5 | 1 | 66.7 | 85.7 | 16 / 35 | 4194 |
| 6 | 1 | 67.3 | 85.4 | 15 / 35 | 4539 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 66 | 59% |
| bts.mega.Gnarly 1.4 | 27 | 70% |
| bvh.mini.Freya 0.55 | 19 | 74% |
| cs.Wren 1.0 | 12 | 83% |
| kdf.KoulDestroyer 1.0 | 10 | 80% |
| davidalves.net.DuelistNanoMelee 1.01 | 7 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 0% |

Hadur died in 119 of 210 rounds, at a mean tick of 814. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 49 | 41% | 91 |
| bvh.mini.Freya 0.55 | 23 | 19% | 38 |
| bts.mega.Gnarly 1.4 | 16 | 13% | 32 |
| cs.Wren 1.0 | 10 | 8% | 21 |
| kdf.KoulDestroyer 1.0 | 8 | 7% | 12 |
| davidalves.net.DuelistNanoMelee 1.01 | 2 | 2% | 7 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 2% | 5 |
| matt.UnderDark3 2.4.34 | 2 | 2% | 1 |
| bzdp.BoxCar 2.0 | 1 | 1% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 136579 melee ticks, 42472 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 25 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 45873 sent, 40884 reached their opponent, 8824 virtual hits (21.6% of those reached).

## Melee bench: F39

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 563 over 6 battles (93.8 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 86.2 | 95 / 210 | 2.24 | 17.9% | 28249 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.0 | 17.9% | 95 |
| bvh.fry.Freya 0.82 | 2.2 | 15.0% | 21 |
| az.Ololobot 0.2.4 | 3.0 | 13.0% | 63 |
| catcat20.Lambda 0.024 | 3.8 | 12.1% | 26 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.5% | 1 |
| apollokidd.ApolloKidd 0.9 | 5.8 | 8.1% | 0 |
| gimp.GimpBot 0.1 | 7.0 | 7.6% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 7.5 | 7.2% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.8% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 87.0 | 18 / 35 | 4783 |
| 2 | 1 | 66.5 | 83.2 | 16 / 35 | 4651 |
| 3 | 1 | 65.5 | 83.5 | 11 / 35 | 4442 |
| 4 | 1 | 68.5 | 88.6 | 21 / 35 | 4773 |
| 5 | 1 | 67.2 | 86.3 | 14 / 35 | 4865 |
| 6 | 1 | 67.7 | 88.9 | 15 / 35 | 4735 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 49 | 39% |
| bvh.fry.Freya 0.82 | 47 | 87% |
| catcat20.Lambda 0.024 | 36 | 58% |
| winamp32.micro.MicroMacro 1.0 | 7 | 86% |
| gimp.GimpBot 0.1 | 5 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 2 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 1045. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 44 | 37% | 63 |
| bvh.fry.Freya 0.82 | 32 | 27% | 62 |
| catcat20.Lambda 0.024 | 26 | 22% | 47 |
| apollokidd.ApolloKidd 0.9 | 6 | 5% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 4 | 3% | 6 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 13 |
| gimp.GimpBot 0.1 | 1 | 1% | 7 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 170130 melee ticks, 48036 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 694 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 230 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 53430 sent, 48554 reached their opponent, 8533 virtual hits (17.6% of those reached).

## Melee bench: F40

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 819 over 6 battles (136.5 per battle, most in one battle 146). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 89.9 | 135 / 210 | 1.91 | 19.6% | 29998 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.0 | 19.6% | 135 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.3% | 30 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.4% | 19 |
| mz.AntiGrav 1.0 | 4.3 | 11.3% | 10 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.4% | 5 |
| alpha.BlackIce 1.0 | 5.8 | 9.6% | 6 |
| stelo.Randomness 1.0 | 6.8 | 8.7% | 4 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.5% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 4.3% | 1 |
| sample.Corners 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 92.1 | 23 / 35 | 5219 |
| 2 | 1 | 69.8 | 90.5 | 23 / 35 | 4975 |
| 3 | 1 | 70.0 | 89.5 | 22 / 35 | 4885 |
| 4 | 1 | 70.6 | 89.2 | 26 / 35 | 5347 |
| 5 | 1 | 68.7 | 87.6 | 18 / 35 | 4791 |
| 6 | 1 | 69.7 | 90.5 | 23 / 35 | 4781 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 64 | 77% |
| kano.gamma.KanoGamma 1.8 | 38 | 74% |
| mz.AntiGrav 1.0 | 26 | 96% |
| Polkwane.SmashMelee 1.0 | 19 | 89% |
| stelo.Randomness 1.0 | 8 | 100% |
| alpha.BlackIce 1.0 | 6 | 83% |
| amk.superstrike.SuperStrike 0.3 | 3 | 67% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 21 | 25% | 61 |
| kano.gamma.KanoGamma 1.8 | 18 | 22% | 45 |
| mz.AntiGrav 1.0 | 17 | 20% | 39 |
| alpha.BlackIce 1.0 | 6 | 7% | 18 |
| Polkwane.SmashMelee 1.0 | 5 | 6% | 22 |
| stelo.Randomness 1.0 | 5 | 6% | 11 |
| amk.superstrike.SuperStrike 0.3 | 4 | 5% | 7 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 3 |
| sample.Corners 1.0 | 0 | 0% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 150967 melee ticks, 41403 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 117 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 117 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 2.

Targeting waves (203 rounds): 50744 sent, 45804 reached their opponent, 9718 virtual hits (21.2% of those reached).

## Melee bench: F41

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 511 over 6 battles (85.2 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 85.3 | 89 / 210 | 2.32 | 17.4% | 25116 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.2 | 17.4% | 89 |
| eem.EvBotNG v12.8 | 1.8 | 16.5% | 81 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 12.8% | 15 |
| ary.Swarm 1.1 | 3.8 | 12.4% | 11 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.2% | 11 |
| shrub.Silver v048 | 6.0 | 9.0% | 2 |
| zyx.nano.Ant 1.1 | 7.0 | 7.6% | 0 |
| jsal.Jsalbot 1.0 | 8.2 | 5.7% | 2 |
| stelo.Mirror 1.1 | 8.8 | 5.2% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 76.5 | 8 / 35 | 3844 |
| 2 | 1 | 67.5 | 85.7 | 17 / 35 | 4074 |
| 3 | 1 | 67.8 | 88.6 | 14 / 35 | 4221 |
| 4 | 1 | 67.6 | 85.7 | 17 / 35 | 4331 |
| 5 | 1 | 67.6 | 86.3 | 15 / 35 | 4284 |
| 6 | 1 | 68.5 | 89.2 | 18 / 35 | 4362 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 75 | 44% |
| lessonz.robocode.Oz 0.5.0 | 34 | 79% |
| simonton.nano.MeleeSeed 1.8 | 12 | 83% |
| ary.Swarm 1.1 | 10 | 80% |
| shrub.Silver v048 | 7 | 86% |
| jsal.Jsalbot 1.0 | 3 | 67% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 918. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 58 | 46% | 93 |
| ary.Swarm 1.1 | 27 | 21% | 38 |
| lessonz.robocode.Oz 0.5.0 | 18 | 14% | 32 |
| simonton.nano.MeleeSeed 1.8 | 11 | 9% | 26 |
| shrub.Silver v048 | 6 | 5% | 11 |
| jsal.Jsalbot 1.0 | 2 | 2% | 5 |
| stelo.Mirror 1.1 | 0 | 0% | 2 |
| acogdev.alpha 0.2 | 0 | 0% | 2 |
| zyx.nano.Ant 1.1 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 156861 melee ticks, 44076 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 63 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 51742 sent, 46792 reached their opponent, 7577 virtual hits (16.2% of those reached).

## Melee bench: F42

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 257 over 6 battles (42.8 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.1 | 123 / 210 | 2.07 | 19.2% | 32892 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.0 | 19.2% | 123 |
| wompi.Wallaby 5.1 | 2.0 | 16.0% | 42 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.3% | 13 |
| ara.Shera 0.88 | 3.5 | 12.8% | 28 |
| amz.NanoClone 1.41 | 5.0 | 8.5% | 2 |
| maribo.IotaCT 1.1 | 6.5 | 7.1% | 0 |
| dsw.StaticD 1.0 | 7.5 | 6.5% | 1 |
| stelo.MirrorMicro 1.0 | 7.5 | 6.2% | 1 |
| mme.NikeEnhanced 2.0 | 8.7 | 5.7% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 86.0 | 20 / 35 | 5386 |
| 2 | 1 | 70.0 | 89.8 | 22 / 35 | 5579 |
| 3 | 1 | 69.1 | 87.9 | 20 / 35 | 5432 |
| 4 | 1 | 68.8 | 86.3 | 22 / 35 | 5304 |
| 5 | 1 | 69.2 | 87.9 | 19 / 35 | 5441 |
| 6 | 1 | 69.9 | 90.8 | 20 / 35 | 5750 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 94 | 89% |
| maribo.mini.MiniQuester 0.1 | 32 | 91% |
| ara.Shera 0.88 | 20 | 40% |
| dsw.StaticD 1.0 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 35 | 39% | 48 |
| wompi.Wallaby 5.1 | 32 | 36% | 105 |
| maribo.mini.MiniQuester 0.1 | 15 | 17% | 42 |
| amz.NanoClone 1.41 | 2 | 2% | 2 |
| mme.NikeEnhanced 2.0 | 2 | 2% | 2 |
| maribo.IotaCT 1.1 | 1 | 1% | 4 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 2 |
| dsw.StaticD 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 162393 melee ticks, 47746 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 31 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 51995 sent, 47283 reached their opponent, 9699 virtual hits (20.5% of those reached).

## Melee bench: F43

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 416 over 6 battles (69.3 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 79.0 | 35 / 210 | 2.89 | 15.3% | 22418 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.6% | 144 |
| hadur2.Hadur 3.18bb | 2.0 | 15.3% | 35 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.9% | 21 |
| dummy.micro.Sparrow 2.5 | 4.2 | 11.4% | 8 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 11.0% | 0 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.2% | 1 |
| mz.NanoGod 2.02 | 7.5 | 7.6% | 0 |
| jab.DiamondStealer 5 | 7.5 | 7.6% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.0% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.2 | 81.6 | 6 / 35 | 3914 |
| 2 | 2 | 65.2 | 80.6 | 6 / 35 | 3629 |
| 3 | 2 | 66.0 | 81.6 | 8 / 35 | 3918 |
| 4 | 2 | 64.8 | 77.5 | 7 / 35 | 3692 |
| 5 | 2 | 64.6 | 77.5 | 5 / 35 | 3646 |
| 6 | 2 | 63.7 | 75.2 | 3 / 35 | 3619 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 80 | 19% |
| brainfade.melee.Dusk 0.44 | 15 | 60% |
| wcsv.melee.EngineerMelee 0.1 | 8 | 100% |
| dummy.micro.Sparrow 2.5 | 4 | 75% |

Hadur died in 179 of 210 rounds, at a mean tick of 953. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 105 | 59% | 119 |
| brainfade.melee.Dusk 0.44 | 20 | 11% | 30 |
| wcsv.melee.EngineerMelee 0.1 | 15 | 8% | 21 |
| dummy.micro.Sparrow 2.5 | 15 | 8% | 19 |
| mz.NanoGod 2.02 | 9 | 5% | 9 |
| Krabb.akim2.Akim2 1.1b | 9 | 5% | 9 |
| jab.DiamondStealer 5 | 3 | 2% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 158691 melee ticks, 42159 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 33 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 51266 sent, 46274 reached their opponent, 7757 virtual hits (16.8% of those reached).

## Melee bench: F44

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 357 over 6 battles (59.5 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 91.7 | 144 / 210 | 1.75 | 20.5% | 33893 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.0 | 20.5% | 144 |
| stelo.Liblix 0.3.1 | 2.2 | 15.7% | 42 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.2% | 17 |
| jwirde.Gort 2.0 | 4.3 | 9.7% | 5 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.7 | 9.2% | 1 |
| wompi.Quokka 1.6 | 6.7 | 7.5% | 1 |
| disan.Chair 2.2.0 | 6.7 | 7.3% | 1 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.4% | 0 |
| sample.Crazy 1.0 | 9.3 | 4.8% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 91.4 | 26 / 35 | 5651 |
| 2 | 1 | 70.0 | 89.2 | 22 / 35 | 5422 |
| 3 | 1 | 71.6 | 93.3 | 29 / 35 | 5632 |
| 4 | 1 | 71.6 | 94.3 | 23 / 35 | 5742 |
| 5 | 1 | 71.4 | 92.4 | 25 / 35 | 5874 |
| 6 | 1 | 70.3 | 89.5 | 19 / 35 | 5572 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 86 | 71% |
| tzu.TheArtOfWar 1.2 | 63 | 87% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 9 | 100% |
| disan.Chair 2.2.0 | 9 | 100% |
| jwirde.Gort 2.0 | 6 | 100% |
| stf.PanzerGeneral 0.1 | 3 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 939. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 39 | 57% | 115 |
| tzu.TheArtOfWar 1.2 | 13 | 19% | 56 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 9% | 7 |
| jwirde.Gort 2.0 | 5 | 7% | 16 |
| disan.Chair 2.2.0 | 1 | 1% | 6 |
| wompi.Quokka 1.6 | 1 | 1% | 3 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 2 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 151662 melee ticks, 49579 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 40 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 53158 sent, 48578 reached their opponent, 10613 virtual hits (21.8% of those reached).

## Melee bench: F45

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 758 over 6 battles (126.3 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.3 | 91 / 210 | 2.23 | 19.0% | 31901 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18bb | 1.0 | 19.0% | 91 |
| eem.IWillFireNoBullet v2.8 | 2.5 | 12.7% | 93 |
| jje.BagPuss 1.2 | 2.8 | 12.3% | 11 |
| myl.nano.Graviton 1.10 | 4.2 | 10.5% | 3 |
| sul.Lunar 1.1 | 4.7 | 10.4% | 8 |
| pez.mini.ChironexFleckeri 0.5 | 6.8 | 8.5% | 1 |
| fm.claire 1.7 | 7.0 | 8.4% | 0 |
| hvilela.HVilela 0.9 | 7.0 | 8.1% | 0 |
| wit.Deep7 2.0 | 9.0 | 6.2% | 3 |
| abud.ThirdRobo 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 84.4 | 13 / 35 | 5073 |
| 2 | 1 | 67.3 | 86.0 | 11 / 35 | 4820 |
| 3 | 1 | 70.0 | 88.6 | 18 / 35 | 5989 |
| 4 | 1 | 69.4 | 87.9 | 14 / 35 | 5728 |
| 5 | 1 | 68.0 | 85.1 | 13 / 35 | 4973 |
| 6 | 1 | 69.4 | 86.0 | 22 / 35 | 5318 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 84 | 45% |
| myl.nano.Graviton 1.10 | 17 | 94% |
| sul.Lunar 1.1 | 16 | 75% |
| jje.BagPuss 1.2 | 14 | 64% |
| pez.mini.ChironexFleckeri 0.5 | 9 | 100% |
| wit.Deep7 2.0 | 6 | 83% |
| fm.claire 1.7 | 1 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 1594. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 53 | 42% | 0 |
| jje.BagPuss 1.2 | 32 | 25% | 64 |
| myl.nano.Graviton 1.10 | 10 | 8% | 36 |
| sul.Lunar 1.1 | 9 | 7% | 49 |
| pez.mini.ChironexFleckeri 0.5 | 4 | 3% | 20 |
| hvilela.HVilela 0.9 | 4 | 3% | 15 |
| wit.Deep7 2.0 | 4 | 3% | 11 |
| fm.claire 1.7 | 3 | 2% | 10 |
| abud.ThirdRobo 1.0 | 1 | 1% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 212496 melee ticks, 93446 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 39 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 2.

Targeting waves (204 rounds): 64179 sent, 59436 reached their opponent, 9226 virtual hits (15.5% of those reached).

## Melee bench: F46

hadur2.Hadur 3.18bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 616 over 6 battles (102.7 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 82.4 | 46 / 210 | 2.59 | 16.0% | 24420 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.3 | 17.5% | 89 |
| kc.mini.Mirage 0.2 | 2.0 | 16.8% | 58 |
| hadur2.Hadur 3.18bb | 2.7 | 16.0% | 46 |
| mz.MicroSheep 1.0 | 4.5 | 10.4% | 2 |
| cx.Princess 1.0 | 5.3 | 9.2% | 13 |
| sadoner.killer 0.2 | 5.3 | 9.3% | 2 |
| arthord.NanoSatanMelee Beta | 6.8 | 7.3% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.2 | 5.5% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 66.1 | 85.1 | 6 / 35 | 4273 |
| 2 | 3 | 64.5 | 80.6 | 8 / 35 | 3880 |
| 3 | 3 | 64.6 | 81.0 | 7 / 35 | 3927 |
| 4 | 3 | 65.9 | 82.9 | 8 / 35 | 4172 |
| 5 | 3 | 64.8 | 81.3 | 7 / 35 | 3916 |
| 6 | 1 | 66.3 | 83.5 | 10 / 35 | 4252 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 51 | 57% |
| rsalesc.melee.Medina 0.4.5 | 42 | 14% |
| cx.Princess 1.0 | 8 | 38% |
| mz.MicroSheep 1.0 | 7 | 100% |
| sadoner.killer 0.2 | 1 | 0% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 169 of 210 rounds, at a mean tick of 941. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 69 | 41% | 95 |
| rsalesc.melee.Medina 0.4.5 | 61 | 36% | 68 |
| cx.Princess 1.0 | 13 | 8% | 15 |
| sadoner.killer 0.2 | 8 | 5% | 13 |
| mz.MicroSheep 1.0 | 7 | 4% | 13 |
| arthord.NanoSatanMelee Beta | 5 | 3% | 5 |
| kurios.DOSexe .9a | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 159705 melee ticks, 38540 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 45 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 45 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 46716 sent, 41767 reached their opponent, 6464 virtual hits (15.5% of those reached).

