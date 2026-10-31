# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 292 over 6 battles (48.7 per battle, most in one battle 144). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 84.7 | 50 / 210 | 2.38 | 17.2% | 31219 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.4% | 135 |
| hadur117.Hadur 3.20wm | 2.0 | 17.2% | 50 |
| sgp.JollyNinja 3.53 | 3.8 | 10.8% | 11 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.2 | 10.7% | 6 |
| lorneswork.Predator 1.0 | 5.2 | 10.1% | 4 |
| mz.MicroGodMelee 1 | 5.3 | 10.1% | 3 |
| adt.Ar2 1.0 | 6.5 | 7.9% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 6.0% | 1 |
| skm.butterfly 1.0 | 8.8 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.0 | 85.1 | 7 / 35 | 5450 |
| 2 | 2 | 66.5 | 83.8 | 10 / 35 | 4837 |
| 3 | 2 | 67.2 | 85.7 | 10 / 35 | 5203 |
| 4 | 2 | 66.7 | 82.9 | 8 / 35 | 5460 |
| 5 | 2 | 67.0 | 85.4 | 9 / 35 | 5117 |
| 6 | 2 | 66.9 | 85.1 | 6 / 35 | 5152 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 116 | 8% |
| sgp.JollyNinja 3.53 | 14 | 71% |
| simonton.nano.WeekendObsession_Melee 1.0 | 12 | 92% |
| lorneswork.Predator 1.0 | 9 | 89% |
| mz.MicroGodMelee 1 | 8 | 88% |
| adt.Ar2 1.0 | 2 | 100% |
| skm.butterfly 1.0 | 1 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 161 of 210 rounds, at a mean tick of 1158. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 117 | 73% | 129 |
| lorneswork.Predator 1.0 | 16 | 10% | 24 |
| sgp.JollyNinja 3.53 | 10 | 6% | 15 |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 5% | 19 |
| mz.MicroGodMelee 1 | 4 | 2% | 13 |
| kawigi.sbf.FloodSonnet 0.9 | 3 | 2% | 5 |
| adt.Ar2 1.0 | 2 | 1% | 3 |
| skm.butterfly 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 140489 melee ticks, 86927 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 49 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 44834 sent, 40033 reached their opponent, 8270 virtual hits (20.7% of those reached).

## Melee bench: F02

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 507 over 6 battles (84.5 per battle, most in one battle 97). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 90.3 | 122 / 210 | 1.87 | 19.5% | 30300 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 19.5% | 122 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.3 | 13.5% | 21 |
| pulsar.PulsarMax 0.8.9 | 2.7 | 13.3% | 33 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.4% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.7 | 10.2% | 11 |
| Noran.BitchingElk 0.054 | 6.8 | 8.1% | 11 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 8.2% | 2 |
| sch.Simone 0.3d | 7.3 | 7.6% | 6 |
| stelo.PatternRobot 1.0 | 9.0 | 5.3% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 3.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 91.1 | 22 / 35 | 5538 |
| 2 | 1 | 68.9 | 89.8 | 21 / 35 | 4808 |
| 3 | 1 | 69.5 | 89.2 | 23 / 35 | 4974 |
| 4 | 1 | 69.5 | 90.5 | 17 / 35 | 5184 |
| 5 | 1 | 69.9 | 92.7 | 23 / 35 | 5139 |
| 6 | 1 | 68.1 | 88.6 | 16 / 35 | 4657 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 54 | 80% |
| pulsar.PulsarMax 0.8.9 | 42 | 55% |
| com.cohesiva.robocode.ManOwaR 1.0 | 24 | 75% |
| Noran.BitchingElk 0.054 | 19 | 58% |
| sch.Simone 0.3d | 12 | 75% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 100% |
| fnc.bandit.Bandit 5.2.0 | 4 | 100% |
| stelo.PatternRobot 1.0 | 4 | 100% |
| fullsail.SweetTea 1.1 | 1 | 0% |

Hadur died in 89 of 210 rounds, at a mean tick of 1056. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 35 | 39% | 53 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 16 | 18% | 61 |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 11% | 31 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 10% | 19 |
| Noran.BitchingElk 0.054 | 8 | 9% | 18 |
| sch.Simone 0.3d | 7 | 8% | 17 |
| fullsail.SweetTea 1.1 | 2 | 2% | 3 |
| fnc.bandit.Bandit 5.2.0 | 1 | 1% | 5 |
| stelo.PatternRobot 1.0 | 1 | 1% | 3 |

Posture (Hadur's M records, 201 rounds): 171510 melee ticks, 46429 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 63 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 6.

Targeting waves (201 rounds): 58906 sent, 54078 reached their opponent, 8928 virtual hits (16.5% of those reached).

## Melee bench: F03

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 197 over 6 battles (32.8 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 91.2 | 155 / 210 | 1.79 | 20.3% | 37661 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 20.3% | 155 |
| radnor.DoctorBob 1.42 | 2.0 | 14.4% | 20 |
| kawigi.nano.Lib 1.0 | 3.5 | 12.2% | 11 |
| vuen.Cake 2.51 | 3.5 | 12.5% | 21 |
| urdos.URDOS 1.3 | 5.0 | 9.2% | 1 |
| adt.Ar1 2.1 | 6.2 | 7.8% | 1 |
| oa.weak.FlyMk1 0.1 | 7.2 | 6.9% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.7 | 6.5% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.3 | 5.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 91.7 | 25 / 35 | 6350 |
| 2 | 1 | 67.7 | 85.1 | 22 / 35 | 5406 |
| 3 | 1 | 71.0 | 93.0 | 27 / 35 | 6460 |
| 4 | 1 | 69.9 | 88.9 | 24 / 35 | 6365 |
| 5 | 1 | 71.7 | 94.0 | 28 / 35 | 6603 |
| 6 | 1 | 71.6 | 94.6 | 29 / 35 | 6477 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 65 | 83% |
| radnor.DoctorBob 1.42 | 63 | 97% |
| kawigi.nano.Lib 1.0 | 34 | 88% |
| urdos.URDOS 1.3 | 4 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 718. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 18 | 33% | 68 |
| radnor.DoctorBob 1.42 | 16 | 29% | 66 |
| urdos.URDOS 1.3 | 7 | 13% | 14 |
| bwbaugh.nano.Tirunculus 0.0.0a | 7 | 13% | 9 |
| kawigi.nano.Lib 1.0 | 6 | 11% | 36 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 8 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 2 |
| adt.Ar1 2.1 | 0 | 0% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 122512 melee ticks, 40289 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 702 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 139 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 2.

Targeting waves (199 rounds): 37694 sent, 33085 reached their opponent, 8494 virtual hits (25.7% of those reached).

## Melee bench: F04

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 698 over 6 battles (116.3 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 87.1 | 36 / 210 | 2.16 | 17.8% | 33101 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.5% | 162 |
| hadur117.Hadur 3.20wm | 2.0 | 17.8% | 36 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.5% | 11 |
| TNT.TNT 0.99.1 | 4.0 | 10.8% | 2 |
| josago.Jorgito 0.16 | 5.2 | 8.8% | 0 |
| css.Delitioner 0.11 | 6.3 | 7.3% | 0 |
| tj.zombie1n 1.0.1 | 6.7 | 6.5% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.5% | 0 |
| spin.Bugstard 0.012b | 9.2 | 4.0% | 1 |
| sp.Nanos.Ember 1.1 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.4 | 86.7 | 5 / 35 | 5620 |
| 2 | 2 | 68.8 | 86.7 | 9 / 35 | 5604 |
| 3 | 2 | 68.2 | 86.7 | 7 / 35 | 5140 |
| 4 | 2 | 67.9 | 86.0 | 4 / 35 | 5355 |
| 5 | 2 | 68.7 | 87.6 | 7 / 35 | 5651 |
| 6 | 2 | 69.1 | 89.2 | 4 / 35 | 5731 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 146 | 11% |
| apc.LeeroyJenkins2 1.0 | 14 | 71% |
| TNT.TNT 0.99.1 | 7 | 71% |
| tj.zombie1n 1.0.1 | 3 | 100% |
| spin.Bugstard 0.012b | 1 | 0% |
| josago.Jorgito 0.16 | 1 | 100% |
| css.Delitioner 0.11 | 1 | 100% |

Hadur died in 181 of 210 rounds, at a mean tick of 1352. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 137 | 76% | 156 |
| apc.LeeroyJenkins2 1.0 | 18 | 10% | 27 |
| TNT.TNT 0.99.1 | 7 | 4% | 13 |
| josago.Jorgito 0.16 | 6 | 3% | 8 |
| css.Delitioner 0.11 | 3 | 2% | 4 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |
| spin.Bugstard 0.012b | 1 | 1% | 0 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 193146 melee ticks, 82533 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 80 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 7.

Targeting waves (204 rounds): 59480 sent, 54513 reached their opponent, 8040 virtual hits (14.7% of those reached).

## Melee bench: F05

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 706 over 6 battles (117.7 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 79.3 | 33 / 210 | 2.87 | 15.5% | 24432 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 17.8% | 100 |
| justin.DemonicRage 3.4 | 1.8 | 16.6% | 56 |
| hadur117.Hadur 3.20wm | 2.8 | 15.5% | 33 |
| wompi.Numbat 2.1 | 4.0 | 13.3% | 15 |
| axeBots.HataMoto 3.09 | 5.3 | 9.5% | 5 |
| ms.Ares 0.19 | 5.7 | 8.4% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.5% | 0 |
| supersample.SuperBoxBot 1.0 | 7.8 | 5.2% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 8.5 | 4.4% | 1 |
| GarmBox.Oranges 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.9 | 75.9 | 5 / 35 | 3936 |
| 2 | 3 | 66.4 | 82.5 | 7 / 35 | 4552 |
| 3 | 3 | 64.6 | 79.4 | 7 / 35 | 4041 |
| 4 | 3 | 64.1 | 77.1 | 6 / 35 | 3815 |
| 5 | 2 | 65.1 | 81.3 | 6 / 35 | 4111 |
| 6 | 3 | 64.2 | 79.4 | 2 / 35 | 3977 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 40 | 20% |
| justin.DemonicRage 3.4 | 39 | 38% |
| wompi.Numbat 2.1 | 12 | 67% |
| axeBots.HataMoto 3.09 | 3 | 67% |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 0% |

Hadur died in 182 of 210 rounds, at a mean tick of 911. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 65 | 36% | 74 |
| justin.DemonicRage 3.4 | 58 | 32% | 71 |
| wompi.Numbat 2.1 | 34 | 19% | 44 |
| axeBots.HataMoto 3.09 | 8 | 4% | 9 |
| ms.Ares 0.19 | 7 | 4% | 7 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 2% | 3 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |
| supersample.SuperBoxBot 1.0 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 159036 melee ticks, 34284 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 41 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 2.

Targeting waves (207 rounds): 48771 sent, 43661 reached their opponent, 7201 virtual hits (16.5% of those reached).

## Melee bench: F06

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 513 over 6 battles (85.5 per battle, most in one battle 160). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 90.7 | 140 / 210 | 1.83 | 19.8% | 31604 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 19.8% | 140 |
| jekl.StoneGhost 0.7 | 2.3 | 14.7% | 23 |
| origin.SleepSiphon 1.7b | 2.7 | 13.8% | 35 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.2 | 10.7% | 6 |
| mld.Wisdom 1.0 | 5.0 | 9.8% | 0 |
| gg.Wolverine 2.0 | 5.8 | 8.8% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 7.1% | 4 |
| DBall.NUKE 0.1 | 8.3 | 6.1% | 0 |
| spinnercat.Omen 1.0 | 8.5 | 6.1% | 0 |
| sample.Fire 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 93.3 | 24 / 35 | 5303 |
| 2 | 1 | 69.1 | 87.9 | 23 / 35 | 4943 |
| 3 | 1 | 69.8 | 89.8 | 24 / 35 | 4982 |
| 4 | 1 | 71.4 | 94.9 | 26 / 35 | 5533 |
| 5 | 1 | 69.7 | 89.8 | 23 / 35 | 5162 |
| 6 | 1 | 70.0 | 88.6 | 20 / 35 | 5681 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 61 | 98% |
| origin.SleepSiphon 1.7b | 55 | 78% |
| pe.minimelee.SandboxMiniMelee 1.1 | 20 | 80% |
| gg.Wolverine 2.0 | 10 | 80% |
| ers.nano.hawk.HawkLA 3.0m | 9 | 67% |
| mld.Wisdom 1.0 | 6 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 24 | 32% | 75 |
| jekl.StoneGhost 0.7 | 18 | 24% | 65 |
| pe.minimelee.SandboxMiniMelee 1.1 | 13 | 17% | 31 |
| gg.Wolverine 2.0 | 6 | 8% | 12 |
| mld.Wisdom 1.0 | 5 | 7% | 13 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 4% | 11 |
| spinnercat.Omen 1.0 | 1 | 1% | 1 |
| DBall.NUKE 0.1 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 144980 melee ticks, 50082 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 54 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 6.

Targeting waves (205 rounds): 45679 sent, 40839 reached their opponent, 8956 virtual hits (21.9% of those reached).

## Melee bench: F07

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 455 over 6 battles (75.8 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 93.7 | 125 / 210 | 1.57 | 20.8% | 38273 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 20.8% | 125 |
| rsalesc.melee.Monk 0.3.6c | 2.0 | 17.2% | 48 |
| rtk.Tachikoma 1.0 | 3.0 | 15.6% | 16 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.4% | 5 |
| franzor.Lizt 1.3.1 | 4.7 | 11.1% | 16 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 7.9% | 0 |
| exauge.GateKeeper 1.1.121g | 7.0 | 7.3% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.3 | 2.3% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 95.6 | 22 / 35 | 6425 |
| 2 | 1 | 71.1 | 91.4 | 15 / 35 | 5961 |
| 3 | 1 | 72.9 | 93.7 | 21 / 35 | 6643 |
| 4 | 1 | 71.9 | 92.1 | 19 / 35 | 6321 |
| 5 | 1 | 72.7 | 93.0 | 22 / 35 | 6429 |
| 6 | 1 | 73.5 | 96.2 | 26 / 35 | 6494 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 74 | 82% |
| rsalesc.melee.Monk 0.3.6c | 54 | 31% |
| franzor.Lizt 1.3.1 | 33 | 67% |
| oog.melee.CapuletDroid 1.1 | 25 | 88% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 1546. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 39 | 44% | 71 |
| rtk.Tachikoma 1.0 | 28 | 32% | 97 |
| franzor.Lizt 1.3.1 | 12 | 14% | 4 |
| oog.melee.CapuletDroid 1.1 | 6 | 7% | 32 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 3 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 195313 melee ticks, 94581 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 49 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 5.

Targeting waves (205 rounds): 57434 sent, 52577 reached their opponent, 10300 virtual hits (19.6% of those reached).

## Melee bench: F08

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 865 over 6 battles (144.2 per battle, most in one battle 201). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 90.7 | 142 / 210 | 1.84 | 19.6% | 28824 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 19.6% | 142 |
| tm.Yuugao 1.0 | 2.5 | 12.6% | 21 |
| shrub.Vapour v159 | 2.8 | 12.4% | 21 |
| Krabb.sliNk.Garm 0.9u | 3.8 | 11.6% | 14 |
| com.spp.robocode.MostlyHarmless 010 | 5.3 | 10.0% | 9 |
| m3thos.Eva00 1.1 | 5.8 | 9.0% | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 7.0 | 7.7% | 3 |
| qualidafial.MajorDick 1.0.1 | 7.7 | 6.8% | 0 |
| SHAM.WOW 1.4 | 9.3 | 5.3% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 89.8 | 24 / 35 | 4742 |
| 2 | 1 | 69.5 | 92.4 | 24 / 35 | 4737 |
| 3 | 1 | 69.0 | 89.2 | 21 / 35 | 4848 |
| 4 | 1 | 69.3 | 92.1 | 23 / 35 | 4647 |
| 5 | 1 | 69.3 | 89.5 | 25 / 35 | 4821 |
| 6 | 1 | 69.8 | 91.1 | 25 / 35 | 5029 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 49 | 80% |
| shrub.Vapour v159 | 35 | 66% |
| Krabb.sliNk.Garm 0.9u | 32 | 81% |
| com.spp.robocode.MostlyHarmless 010 | 26 | 88% |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 92% |
| m3thos.Eva00 1.1 | 10 | 100% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 875. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 23 | 32% | 67 |
| shrub.Vapour v159 | 17 | 24% | 42 |
| Krabb.sliNk.Garm 0.9u | 16 | 22% | 37 |
| com.spp.robocode.MostlyHarmless 010 | 6 | 8% | 28 |
| jwst.DAD.DarkAndDarker 1.1 | 3 | 4% | 17 |
| zyx.nano.BacillusComma 1.0 | 2 | 3% | 4 |
| m3thos.Eva00 1.1 | 1 | 1% | 10 |
| SHAM.WOW 1.4 | 0 | 0% | 4 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 151462 melee ticks, 43900 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 64 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 5.

Targeting waves (204 rounds): 48797 sent, 43907 reached their opponent, 7987 virtual hits (18.2% of those reached).

## Melee bench: F09

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 723 over 6 battles (120.5 per battle, most in one battle 202). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 78.1 | 64 / 210 | 2.97 | 15.9% | 22742 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 16.6% | 80 |
| hadur117.Hadur 3.20wm | 1.7 | 15.9% | 64 |
| kc.micro.Figment 1.0 | 3.0 | 14.3% | 34 |
| yagami.Tidus 0.11 | 4.3 | 10.8% | 1 |
| mc2.enemy.Original 0.9 | 5.5 | 9.6% | 17 |
| pedersen.Grishnakh 1.0 | 5.5 | 9.8% | 11 |
| dft.Calliope 5.6 | 6.7 | 8.0% | 2 |
| step.nanoPri 1.0 | 8.2 | 6.0% | 1 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 4.8% | 0 |
| rdm.Dueler 0.4x | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 79.0 | 8 / 35 | 3616 |
| 2 | 2 | 64.3 | 76.8 | 10 / 35 | 3848 |
| 3 | 2 | 63.9 | 75.9 | 10 / 35 | 3657 |
| 4 | 1 | 65.6 | 81.6 | 11 / 35 | 3870 |
| 5 | 1 | 64.9 | 78.7 | 15 / 35 | 3745 |
| 6 | 2 | 64.5 | 76.8 | 10 / 35 | 4006 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 49 | 39% |
| kc.micro.Figment 1.0 | 37 | 70% |
| mc2.enemy.Original 0.9 | 13 | 46% |
| pedersen.Grishnakh 1.0 | 7 | 43% |
| yagami.Tidus 0.11 | 7 | 100% |
| dft.Calliope 5.6 | 2 | 100% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 915. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 53 | 36% | 73 |
| kc.micro.Figment 1.0 | 36 | 24% | 58 |
| mc2.enemy.Original 0.9 | 20 | 13% | 28 |
| yagami.Tidus 0.11 | 14 | 9% | 21 |
| pedersen.Grishnakh 1.0 | 12 | 8% | 15 |
| step.nanoPri 1.0 | 4 | 3% | 5 |
| dft.Calliope 5.6 | 3 | 2% | 5 |
| robar.nano.Assertive_Melee 0.2 | 3 | 2% | 4 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 158818 melee ticks, 39821 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 329 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 62 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 5.

Targeting waves (207 rounds): 50676 sent, 46013 reached their opponent, 6536 virtual hits (14.2% of those reached).

## Melee bench: F10

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 439 over 6 battles (73.2 per battle, most in one battle 157). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 94.7 | 162 / 210 | 1.48 | 20.6% | 34160 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 20.6% | 162 |
| DTF.Kludgy 1.2b | 2.3 | 14.6% | 20 |
| ne.Chimera 1.2 | 3.3 | 12.4% | 9 |
| ejb.Polaris 1.0.1 | 3.3 | 12.2% | 9 |
| tvv.micro.Antares 1.1.1 | 5.5 | 9.9% | 6 |
| vStar.RAFzilla 2.15 | 5.5 | 10.2% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.0 | 5.4% | 0 |
| sam.Samspin 1.0 | 8.0 | 5.3% | 0 |
| kurios.DOSexe .9b | 8.3 | 5.2% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 95.2 | 29 / 35 | 5551 |
| 2 | 1 | 71.3 | 96.5 | 29 / 35 | 5559 |
| 3 | 1 | 71.2 | 94.9 | 27 / 35 | 5480 |
| 4 | 1 | 71.1 | 94.3 | 27 / 35 | 5642 |
| 5 | 1 | 71.4 | 95.6 | 26 / 35 | 5937 |
| 6 | 1 | 70.4 | 91.7 | 24 / 35 | 5991 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 75 | 81% |
| ejb.Polaris 1.0.1 | 45 | 91% |
| ne.Chimera 1.2 | 30 | 87% |
| vStar.RAFzilla 2.15 | 21 | 90% |
| tvv.micro.Antares 1.1.1 | 13 | 85% |
| sam.Samspin 1.0 | 1 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |
| donjezza.Muncho 1.0 | 1 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 21 | 42% | 83 |
| ne.Chimera 1.2 | 10 | 20% | 33 |
| ejb.Polaris 1.0.1 | 7 | 14% | 55 |
| vStar.RAFzilla 2.15 | 4 | 8% | 22 |
| tvv.micro.Antares 1.1.1 | 4 | 8% | 8 |
| kurios.DOSexe .9b | 1 | 2% | 5 |
| sam.Samspin 1.0 | 1 | 2% | 2 |
| donjezza.Muncho 1.0 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 141756 melee ticks, 60259 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 88 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 88 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 2.

Targeting waves (203 rounds): 46372 sent, 41624 reached their opponent, 7764 virtual hits (18.7% of those reached).

## Melee bench: F11

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 959 over 6 battles (159.8 per battle, most in one battle 166). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 84.6 | 81 / 210 | 2.39 | 17.2% | 24374 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.2 | 17.2% | 81 |
| rz.Aleph 0.34 | 1.8 | 16.3% | 68 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.7% | 23 |
| djc.DynaBot 0.1.1 | 3.8 | 10.7% | 14 |
| br2.MobyDickBot 1.6 | 5.5 | 9.2% | 12 |
| rdt199.Warlord 0.73 | 5.7 | 9.3% | 9 |
| uji.YellohFellah 1.0 | 6.8 | 8.2% | 4 |
| KiraNL.Chupacabra 0.4 | 8.0 | 7.1% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 4.9% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 82.9 | 11 / 35 | 3914 |
| 2 | 1 | 68.8 | 89.8 | 17 / 35 | 4706 |
| 3 | 1 | 64.4 | 78.4 | 15 / 35 | 3689 |
| 4 | 1 | 66.5 | 85.7 | 12 / 35 | 4226 |
| 5 | 1 | 66.1 | 86.3 | 15 / 35 | 3830 |
| 6 | 1 | 66.0 | 84.4 | 11 / 35 | 4009 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 51 | 39% |
| rdt199.Warlord 0.73 | 19 | 63% |
| cx.mini.Nimrod 0.55 | 19 | 68% |
| uji.YellohFellah 1.0 | 19 | 95% |
| br2.MobyDickBot 1.6 | 16 | 56% |
| djc.DynaBot 0.1.1 | 12 | 75% |

Hadur died in 135 of 210 rounds, at a mean tick of 960. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 57 | 42% | 86 |
| cx.mini.Nimrod 0.55 | 26 | 19% | 40 |
| rdt199.Warlord 0.73 | 15 | 11% | 25 |
| djc.DynaBot 0.1.1 | 13 | 10% | 20 |
| br2.MobyDickBot 1.6 | 8 | 6% | 15 |
| uji.YellohFellah 1.0 | 6 | 4% | 16 |
| KiraNL.Chupacabra 0.4 | 2 | 1% | 3 |
| stelo.MirrorNano 1.3 | 1 | 1% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 162964 melee ticks, 45013 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 54 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 4.

Targeting waves (205 rounds): 52169 sent, 47200 reached their opponent, 6441 virtual hits (13.6% of those reached).

## Melee bench: F12

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 851 over 6 battles (141.8 per battle, most in one battle 211). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 86.6 | 130 / 210 | 2.21 | 18.1% | 23186 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 18.1% | 130 |
| bts.wiki.RipCurl 0.9b | 2.5 | 13.5% | 28 |
| nat.PallasHawk 1.0 | 3.0 | 13.1% | 29 |
| darkcanuck.Leon 1.01 | 3.5 | 12.5% | 16 |
| brainfade.melee.Genghis 0.36 | 5.0 | 9.9% | 6 |
| jrm.Test0 1.0 | 6.0 | 8.4% | 1 |
| cs.sheldor.Talon 1.1 | 7.5 | 6.7% | 0 |
| jp.Perpy 16.0 | 8.3 | 6.2% | 0 |
| stuff.Vlad 0.1 | 9.0 | 5.8% | 0 |
| jaybot.bots.Oddball 4.0 | 9.2 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 88.9 | 24 / 35 | 3927 |
| 2 | 1 | 66.3 | 83.5 | 21 / 35 | 3672 |
| 3 | 1 | 66.0 | 83.2 | 16 / 35 | 3812 |
| 4 | 1 | 68.9 | 88.9 | 25 / 35 | 4310 |
| 5 | 1 | 66.3 | 84.1 | 21 / 35 | 3651 |
| 6 | 1 | 68.4 | 90.8 | 23 / 35 | 3814 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 51 | 82% |
| nat.PallasHawk 1.0 | 45 | 71% |
| darkcanuck.Leon 1.01 | 34 | 97% |
| brainfade.melee.Genghis 0.36 | 13 | 92% |
| jaybot.bots.Oddball 4.0 | 4 | 100% |
| jp.Perpy 16.0 | 3 | 100% |
| jrm.Test0 1.0 | 3 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 680. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 27 | 32% | 59 |
| bts.wiki.RipCurl 0.9b | 18 | 21% | 46 |
| jrm.Test0 1.0 | 12 | 14% | 14 |
| darkcanuck.Leon 1.01 | 10 | 12% | 54 |
| brainfade.melee.Genghis 0.36 | 9 | 11% | 16 |
| jp.Perpy 16.0 | 2 | 2% | 6 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 6 |
| stuff.Vlad 0.1 | 1 | 1% | 6 |
| jaybot.bots.Oddball 4.0 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 131021 melee ticks, 36178 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 50 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 9.

Targeting waves (202 rounds): 44165 sent, 39275 reached their opponent, 6489 virtual hits (16.5% of those reached).

## Melee bench: F13

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 160 over 6 battles (26.7 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 83.3 | 71 / 210 | 2.50 | 16.4% | 25739 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.7 | 16.2% | 40 |
| hadur117.Hadur 3.20wm | 1.8 | 16.4% | 71 |
| mn.Combat 3.25.0 | 2.5 | 15.4% | 66 |
| gh.micro.Gruweltje 0.7 | 4.3 | 12.0% | 11 |
| shinh.Entangled 0.3 | 4.7 | 11.8% | 21 |
| apc.Colossus2 0.17 | 6.0 | 8.5% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.5% | 1 |
| ayk.WallHugger 1.0 | 8.5 | 4.9% | 0 |
| maribo.FollowFire 1 | 8.5 | 4.9% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 85.1 | 14 / 35 | 4467 |
| 2 | 2 | 65.1 | 79.4 | 11 / 35 | 4203 |
| 3 | 3 | 64.6 | 82.5 | 8 / 35 | 3858 |
| 4 | 1 | 66.2 | 86.0 | 13 / 35 | 4275 |
| 5 | 2 | 67.0 | 84.8 | 15 / 35 | 4467 |
| 6 | 2 | 65.7 | 82.2 | 10 / 35 | 4469 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 50 | 72% |
| mn.Combat 3.25.0 | 40 | 40% |
| shinh.Entangled 0.3 | 17 | 53% |
| gh.micro.Gruweltje 0.7 | 15 | 60% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 844. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 45 | 32% | 80 |
| mn.Combat 3.25.0 | 38 | 27% | 56 |
| shinh.Entangled 0.3 | 22 | 16% | 30 |
| gh.micro.Gruweltje 0.7 | 19 | 14% | 28 |
| apc.Colossus2 0.17 | 7 | 5% | 7 |
| stelo.Wang 1.0 | 4 | 3% | 4 |
| maribo.FollowFire 1 | 3 | 2% | 3 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 206 rounds): 148371 melee ticks, 44031 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 785 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 637 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 43755 sent, 38539 reached their opponent, 6239 virtual hits (16.2% of those reached).

## Melee bench: F14

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 264 over 6 battles (44.0 per battle, most in one battle 51). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 94.8 | 167 / 210 | 1.47 | 21.1% | 35800 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 21.1% | 167 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.2% | 15 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.3% | 23 |
| Lo_Ian.Gandalf_V4 4.0 | 5.0 | 9.3% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.2 | 9.5% | 0 |
| co.edu.usb.rc.LidisTron 1.0 | 5.7 | 9.1% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.5 | 8.3% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 7.8% | 3 |
| pa.Improved 1.0 | 9.0 | 5.9% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 95.2 | 27 / 35 | 6054 |
| 2 | 1 | 71.8 | 95.6 | 27 / 35 | 5926 |
| 3 | 1 | 71.7 | 95.2 | 26 / 35 | 5875 |
| 4 | 1 | 70.7 | 91.4 | 26 / 35 | 5710 |
| 5 | 1 | 72.6 | 96.2 | 30 / 35 | 6246 |
| 6 | 1 | 72.1 | 94.9 | 31 / 35 | 5989 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 81 | 95% |
| catcat20.shape.Theta 0.018 | 65 | 71% |
| sanyi.mikrobi.Roberto 1.0 | 15 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 10 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 88% |
| Lo_Ian.Gandalf_V4 4.0 | 8 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| pa.Improved 1.0 | 2 | 50% |

Hadur died in 43 of 210 rounds, at a mean tick of 924. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 20 | 47% | 63 |
| simonton.micro.Sprout 1.1.3 | 15 | 35% | 90 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 7% | 22 |
| sheldor.micro.PointInLineRRAL 1.0 | 2 | 5% | 13 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 2% | 6 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 2% | 6 |
| pa.Improved 1.0 | 1 | 2% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 7 |

Posture (Hadur's M records, 201 rounds): 140283 melee ticks, 53873 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 378 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 227 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 4.

Targeting waves (201 rounds): 44775 sent, 40049 reached their opponent, 9903 virtual hits (24.7% of those reached).

## Melee bench: F15

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 666 over 6 battles (111.0 per battle, most in one battle 194). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.2 | 120 / 210 | 2.24 | 19.1% | 31800 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 19.1% | 120 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.7% | 23 |
| emp.Yngwie 1.11 | 3.2 | 12.7% | 44 |
| mld.DustBunny 3.8 | 3.8 | 12.3% | 8 |
| cb.nano.Insomnia 1.0 | 4.5 | 11.1% | 7 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.0% | 7 |
| Grystrion.TrackerWO 1.0 | 7.3 | 6.7% | 0 |
| lambdaxy.TBot 0.1 | 7.7 | 6.6% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 4.7% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 89.5 | 21 / 35 | 5269 |
| 2 | 1 | 68.5 | 84.1 | 17 / 35 | 5300 |
| 3 | 1 | 69.2 | 87.6 | 22 / 35 | 5235 |
| 4 | 1 | 67.7 | 81.3 | 16 / 35 | 5328 |
| 5 | 1 | 69.3 | 87.0 | 22 / 35 | 5185 |
| 6 | 1 | 69.8 | 87.9 | 22 / 35 | 5483 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 46 | 65% |
| mld.DustBunny 3.8 | 30 | 93% |
| kawigi.micro.Shiz 1.1 | 30 | 90% |
| kawigi.robot.Girl 1.2 | 18 | 78% |
| cb.nano.Insomnia 1.0 | 14 | 86% |
| divineomega.TrialBot 0.003 | 6 | 100% |
| lambdaxy.TBot 0.1 | 2 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 885. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 36 | 39% | 72 |
| kawigi.micro.Shiz 1.1 | 15 | 16% | 41 |
| cb.nano.Insomnia 1.0 | 15 | 16% | 20 |
| mld.DustBunny 3.8 | 9 | 10% | 38 |
| kawigi.robot.Girl 1.2 | 9 | 10% | 17 |
| lambdaxy.TBot 0.1 | 3 | 3% | 4 |
| divineomega.TrialBot 0.003 | 2 | 2% | 11 |
| Grystrion.TrackerWO 1.0 | 1 | 1% | 6 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 158394 melee ticks, 43443 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 120 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 120 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 6.

Targeting waves (203 rounds): 51698 sent, 47041 reached their opponent, 7773 virtual hits (16.5% of those reached).

## Melee bench: F16

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1030 over 6 battles (171.7 per battle, most in one battle 197). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.0 | 115 / 210 | 2.08 | 19.5% | 33248 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 19.5% | 115 |
| gh.Griezel 0.5.2 | 2.0 | 15.7% | 50 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.1% | 6 |
| techdude.forest.FlamingForest 1.1 | 4.5 | 10.3% | 27 |
| bvh.fnr.Fenrir 0.36l | 4.8 | 9.7% | 3 |
| tvv.nano.Polaris 1.2 | 5.7 | 9.0% | 7 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.2% | 2 |
| divineomega.DivineBot 1.9.4.5 | 8.5 | 5.0% | 0 |
| asd.Cthulhu 1.3 | 9.2 | 4.8% | 0 |
| repositorio.NanoStep 1.0 | 9.3 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 85.4 | 21 / 35 | 5401 |
| 2 | 1 | 71.9 | 94.0 | 22 / 35 | 6003 |
| 3 | 1 | 69.6 | 89.2 | 21 / 35 | 5285 |
| 4 | 1 | 69.1 | 86.0 | 17 / 35 | 5580 |
| 5 | 1 | 66.2 | 80.3 | 10 / 35 | 4901 |
| 6 | 1 | 71.9 | 93.3 | 24 / 35 | 6078 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 77 | 64% |
| techdude.forest.FlamingForest 1.1 | 34 | 62% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 22 | 100% |
| bvh.fnr.Fenrir 0.36l | 11 | 82% |
| stelo.IntrinsicVolatility 1.4 | 6 | 100% |
| divineomega.DivineBot 1.9.4.5 | 6 | 100% |
| tvv.nano.Polaris 1.2 | 2 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 1174. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 43 | 42% | 91 |
| techdude.forest.FlamingForest 1.1 | 18 | 18% | 36 |
| bvh.fnr.Fenrir 0.36l | 16 | 16% | 28 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 5 | 5% | 22 |
| asd.Cthulhu 1.3 | 4 | 4% | 4 |
| stelo.IntrinsicVolatility 1.4 | 3 | 3% | 9 |
| tvv.nano.Polaris 1.2 | 3 | 3% | 8 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 7 |
| repositorio.NanoStep 1.0 | 2 | 2% | 4 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 176687 melee ticks, 70730 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 42 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 4.

Targeting waves (204 rounds): 56777 sent, 52018 reached their opponent, 8900 virtual hits (17.1% of those reached).

## Melee bench: F17

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1193 over 6 battles (198.8 per battle, most in one battle 231). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 86.7 | 107 / 210 | 2.20 | 19.2% | 34611 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 19.2% | 107 |
| et.Predator 1.8 | 2.7 | 13.4% | 22 |
| oog.melee.Mercutio 1.0 | 3.2 | 13.1% | 32 |
| cx.BlestPain 1.41 | 3.2 | 12.8% | 35 |
| ahf.NanoAndrew .4 | 5.2 | 10.6% | 10 |
| maribo.melee.BMV 0.1 | 6.2 | 8.9% | 2 |
| nic.Nicator 2.4 | 6.7 | 8.5% | 2 |
| tex.Longbot 0.4 | 8.3 | 5.8% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 87.9 | 17 / 35 | 6108 |
| 2 | 1 | 70.5 | 89.2 | 21 / 35 | 6028 |
| 3 | 1 | 68.8 | 85.4 | 18 / 35 | 5502 |
| 4 | 1 | 70.2 | 88.6 | 19 / 35 | 5727 |
| 5 | 1 | 69.2 | 87.0 | 17 / 35 | 5656 |
| 6 | 1 | 67.7 | 81.9 | 15 / 35 | 5590 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 47 | 66% |
| et.Predator 1.8 | 42 | 74% |
| cx.BlestPain 1.41 | 40 | 53% |
| ahf.NanoAndrew .4 | 10 | 100% |
| maribo.melee.BMV 0.1 | 8 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 4 | 100% |
| nic.Nicator 2.4 | 2 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 1102. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 29 | 27% | 55 |
| cx.BlestPain 1.41 | 28 | 26% | 50 |
| oog.melee.Mercutio 1.0 | 23 | 21% | 52 |
| ahf.NanoAndrew .4 | 11 | 10% | 23 |
| maribo.melee.BMV 0.1 | 7 | 6% | 14 |
| tex.Longbot 0.4 | 3 | 3% | 5 |
| nic.Nicator 2.4 | 1 | 1% | 4 |
| goblin.Bender 2.4 | 1 | 1% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 7 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 165037 melee ticks, 66529 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 676 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 460 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 7.

Targeting waves (208 rounds): 54270 sent, 49358 reached their opponent, 10105 virtual hits (20.5% of those reached).

## Melee bench: F18

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1196 over 6 battles (199.3 per battle, most in one battle 231). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 88.6 | 122 / 210 | 2.03 | 18.9% | 28721 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 18.9% | 122 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.7% | 29 |
| uji.DBH 1.1 | 3.5 | 11.6% | 16 |
| agd.Mooserwirt2 2.7 | 3.5 | 12.5% | 24 |
| sigterm.Sigterm 1.0 | 5.3 | 9.3% | 9 |
| spinnercat.Robovirus 2.718 | 6.5 | 8.3% | 5 |
| ratosh.Nobo 0.21 | 6.8 | 8.0% | 3 |
| kawigi.mini.Fhqwhgads 1.1 | 7.3 | 7.3% | 1 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.3 | 5.3% | 0 |
| stelo.WangRobot 1.0 | 9.7 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 88.9 | 22 / 35 | 4841 |
| 2 | 1 | 69.4 | 91.7 | 22 / 35 | 4829 |
| 3 | 1 | 66.9 | 84.8 | 18 / 35 | 4490 |
| 4 | 1 | 69.1 | 89.2 | 22 / 35 | 4940 |
| 5 | 1 | 68.5 | 88.6 | 20 / 35 | 4754 |
| 6 | 1 | 68.5 | 88.3 | 18 / 35 | 4867 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 51 | 69% |
| agd.Mooserwirt2 2.7 | 32 | 72% |
| uji.DBH 1.1 | 29 | 90% |
| sigterm.Sigterm 1.0 | 20 | 75% |
| spinnercat.Robovirus 2.718 | 12 | 75% |
| ratosh.Nobo 0.21 | 5 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 100% |
| stelo.WangRobot 1.0 | 3 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 861. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 35 | 37% | 71 |
| agd.Mooserwirt2 2.7 | 20 | 21% | 41 |
| uji.DBH 1.1 | 11 | 12% | 31 |
| sigterm.Sigterm 1.0 | 11 | 12% | 19 |
| spinnercat.Robovirus 2.718 | 5 | 5% | 17 |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 4% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 2% | 8 |
| ratosh.Nobo 0.21 | 1 | 1% | 10 |
| stelo.WangRobot 1.0 | 0 | 0% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 137538 melee ticks, 49675 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 46 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 10.

Targeting waves (204 rounds): 45795 sent, 40918 reached their opponent, 8559 virtual hits (20.9% of those reached).

## Melee bench: F19

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 261 over 6 battles (43.5 per battle, most in one battle 52). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.5 | 98.4 | 196 / 210 | 1.15 | 22.6% | 37749 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 22.6% | 196 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.3% | 8 |
| mld.Infinity 2.2 | 3.8 | 11.6% | 3 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.5% | 1 |
| erdnis.Rover 0.3 | 4.2 | 10.9% | 2 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.5% | 0 |
| mbh.Mbh 0.1 | 7.3 | 7.3% | 0 |
| pac.ABC 2.1 | 8.0 | 6.7% | 0 |
| pbg.R2D2 1.0 | 8.7 | 5.5% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.6 | 98.7 | 33 / 35 | 6121 |
| 2 | 1 | 73.8 | 98.7 | 33 / 35 | 6357 |
| 3 | 1 | 72.6 | 96.5 | 31 / 35 | 5957 |
| 4 | 1 | 73.5 | 98.4 | 32 / 35 | 6411 |
| 5 | 1 | 74.1 | 99.7 | 34 / 35 | 6555 |
| 6 | 1 | 73.6 | 98.1 | 33 / 35 | 6348 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 94 | 97% |
| mld.Infinity 2.2 | 35 | 100% |
| krillr.mini.JointStrike 2.0.0 | 33 | 100% |
| erdnis.Rover 0.3 | 16 | 94% |
| patson.PatsonTestBot 1.0 | 11 | 100% |
| pac.ABC 2.1 | 8 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 15 of 210 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 7 | 47% | 67 |
| erdnis.Rover 0.3 | 6 | 40% | 39 |
| krillr.mini.JointStrike 2.0.0 | 1 | 7% | 36 |
| patson.PatsonTestBot 1.0 | 1 | 7% | 17 |
| mld.Infinity 2.2 | 0 | 0% | 22 |
| pbg.R2D2 1.0 | 0 | 0% | 10 |
| pac.ABC 2.1 | 0 | 0% | 10 |
| mbh.Mbh 0.1 | 0 | 0% | 5 |

Posture (Hadur's M records, 199 rounds): 127001 melee ticks, 46966 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 50 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 3.

Targeting waves (199 rounds): 42440 sent, 37842 reached their opponent, 8795 virtual hits (23.2% of those reached).

## Melee bench: F20

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 694 over 6 battles (115.7 per battle, most in one battle 155). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 93.3 | 160 / 210 | 1.60 | 21.2% | 36003 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 21.2% | 160 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.1% | 25 |
| fwb.Nine 1.0.1 | 3.3 | 11.8% | 8 |
| catcat20.Rabbit 0.001 | 4.2 | 10.5% | 14 |
| nz.jdc.nano.GridFu 1.0 | 4.5 | 10.3% | 2 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 8.6% | 1 |
| bayen.nut.Squirrel 1.615 | 7.0 | 7.3% | 1 |
| djdjdj.NanoSkunk10 1.0 | 8.3 | 5.8% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.5 | 5.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 92.4 | 28 / 35 | 5863 |
| 2 | 1 | 70.8 | 90.5 | 25 / 35 | 5811 |
| 3 | 1 | 71.8 | 94.6 | 25 / 35 | 5974 |
| 4 | 1 | 72.9 | 96.8 | 30 / 35 | 6273 |
| 5 | 1 | 71.3 | 92.4 | 25 / 35 | 5893 |
| 6 | 1 | 71.9 | 93.0 | 27 / 35 | 6189 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 81 | 89% |
| fwb.Nine 1.0.1 | 51 | 94% |
| catcat20.Rabbit 0.001 | 38 | 76% |
| m3thos.mini.Eva01 0.5.5 | 5 | 100% |
| bayen.nut.Squirrel 1.615 | 4 | 75% |
| nz.jdc.nano.GridFu 1.0 | 2 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 987. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 23 | 42% | 99 |
| catcat20.Rabbit 0.001 | 13 | 24% | 49 |
| bayen.nut.Squirrel 1.615 | 5 | 9% | 9 |
| fwb.Nine 1.0.1 | 4 | 7% | 11 |
| m3thos.mini.Eva01 0.5.5 | 3 | 5% | 17 |
| nz.jdc.nano.GridFu 1.0 | 2 | 4% | 15 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 3 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 165747 melee ticks, 60130 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 41 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 3.

Targeting waves (208 rounds): 52369 sent, 47504 reached their opponent, 10529 virtual hits (22.2% of those reached).

## Melee bench: F21

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 567 over 6 battles (94.5 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 93.3 | 139 / 210 | 1.60 | 20.7% | 34984 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 20.7% | 139 |
| eem.EvBot v4.6.16 | 2.0 | 16.6% | 55 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.7% | 5 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.1% | 0 |
| eld.Hmm 1.0 | 5.7 | 8.3% | 9 |
| oa.weak.BotherBot 0.1 | 6.2 | 7.4% | 0 |
| fire219.CatBot 1.0 | 7.3 | 6.4% | 0 |
| el.JumpShoot 0.2 | 7.8 | 5.8% | 1 |
| PSW.Relentless 0.1 | 8.3 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 94.6 | 24 / 35 | 5940 |
| 2 | 1 | 70.6 | 92.7 | 20 / 35 | 5533 |
| 3 | 1 | 71.0 | 91.7 | 23 / 35 | 5888 |
| 4 | 1 | 70.9 | 89.5 | 24 / 35 | 5838 |
| 5 | 1 | 71.4 | 95.9 | 23 / 35 | 5727 |
| 6 | 1 | 72.0 | 95.6 | 25 / 35 | 6058 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 133 | 68% |
| dummy.mini.Scimitar 1.01 | 23 | 96% |
| cf.RiO.RiOx 4.2.1 | 19 | 100% |
| eld.Hmm 1.0 | 9 | 44% |
| oa.weak.BotherBot 0.1 | 2 | 100% |
| el.JumpShoot 0.2 | 2 | 50% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 1331. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 45 | 59% | 120 |
| dummy.mini.Scimitar 1.01 | 14 | 18% | 45 |
| eld.Hmm 1.0 | 6 | 8% | 13 |
| cf.RiO.RiOx 4.2.1 | 3 | 4% | 19 |
| arthord.MannyPacquiao Beta | 2 | 3% | 4 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |
| PSW.Relentless 0.1 | 1 | 1% | 1 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 6 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 177429 melee ticks, 91322 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 71 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 3.

Targeting waves (208 rounds): 52887 sent, 47921 reached their opponent, 8127 virtual hits (17.0% of those reached).

## Melee bench: F22

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 553 over 6 battles (92.2 per battle, most in one battle 148). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 89.5 | 106 / 210 | 1.94 | 18.8% | 29409 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 18.8% | 106 |
| pe.SandboxDT 2.71m | 2.2 | 16.0% | 59 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.6% | 24 |
| jlm.javaDisturbance 0.59 | 3.8 | 12.6% | 17 |
| bigpete.Stewie 1.0 | 5.0 | 10.7% | 3 |
| yk.JahRoslav 1.1 | 6.7 | 7.2% | 0 |
| tad.Dalek98 0.98 | 7.2 | 6.4% | 0 |
| gg.Squaraus 0.6 | 7.2 | 6.4% | 1 |
| pbg.NinjaX 1.2 | 9.0 | 4.8% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 90.5 | 14 / 35 | 4738 |
| 2 | 1 | 68.7 | 87.9 | 15 / 35 | 4968 |
| 3 | 1 | 68.7 | 88.6 | 16 / 35 | 4824 |
| 4 | 1 | 70.3 | 91.4 | 22 / 35 | 5092 |
| 5 | 1 | 69.2 | 87.6 | 20 / 35 | 5023 |
| 6 | 1 | 69.7 | 91.1 | 19 / 35 | 4764 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 65 | 55% |
| kvk.HebusLeTroll 0.35 | 38 | 76% |
| jlm.javaDisturbance 0.59 | 37 | 68% |
| bigpete.Stewie 1.0 | 13 | 92% |
| yk.JahRoslav 1.1 | 2 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |
| gg.Squaraus 0.6 | 1 | 0% |

Hadur died in 107 of 210 rounds, at a mean tick of 1003. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 44 | 41% | 84 |
| kvk.HebusLeTroll 0.35 | 26 | 24% | 51 |
| jlm.javaDisturbance 0.59 | 25 | 23% | 49 |
| bigpete.Stewie 1.0 | 6 | 6% | 14 |
| pbg.NinjaX 1.2 | 1 | 1% | 3 |
| tad.Dalek98 0.98 | 1 | 1% | 2 |
| gg.Squaraus 0.6 | 1 | 1% | 2 |
| yk.JahRoslav 1.1 | 0 | 0% | 4 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 164011 melee ticks, 51138 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 54 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 5.

Targeting waves (205 rounds): 52056 sent, 47204 reached their opponent, 7396 virtual hits (15.7% of those reached).

## Melee bench: F23

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 448 over 6 battles (74.7 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.8 | 97.6 | 185 / 210 | 1.22 | 22.5% | 37201 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 22.5% | 185 |
| pe.SandboxLump 1.52 | 2.2 | 16.0% | 18 |
| cre.Karolos 0.32 | 2.8 | 14.1% | 7 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 9.8% | 0 |
| stelo.RamTrackSurfer 1.2 | 5.3 | 9.1% | 0 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.3 | 8.4% | 0 |
| cw.megas.Blade 0.8 | 6.7 | 8.3% | 0 |
| sample.Walls 1.0 | 7.7 | 7.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.2 | 2.6% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.0 | 98.1 | 33 / 35 | 6320 |
| 2 | 1 | 73.4 | 97.1 | 29 / 35 | 6187 |
| 3 | 1 | 74.1 | 97.8 | 31 / 35 | 6036 |
| 4 | 1 | 73.6 | 96.8 | 30 / 35 | 6098 |
| 5 | 1 | 73.7 | 97.1 | 30 / 35 | 6229 |
| 6 | 1 | 74.0 | 98.4 | 32 / 35 | 6331 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 108 | 93% |
| cre.Karolos 0.32 | 58 | 93% |
| stelo.RamTrackSurfer 1.2 | 9 | 100% |
| sample.Walls 1.0 | 7 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 100% |
| stelo.AreaTargetingBot 1.1 | 7 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 28 of 210 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cre.Karolos 0.32 | 12 | 43% | 56 |
| pe.SandboxLump 1.52 | 11 | 39% | 106 |
| stelo.RamTrackSurfer 1.2 | 1 | 4% | 12 |
| cw.megas.Blade 0.8 | 1 | 4% | 8 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 9 |
| sample.Walls 1.0 | 0 | 0% | 7 |
| stelo.AreaTargetingBot 1.1 | 0 | 0% | 7 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 126595 melee ticks, 54424 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 48 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 39933 sent, 35174 reached their opponent, 10473 virtual hits (29.8% of those reached).

## Melee bench: F24

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1025 over 6 battles (170.8 per battle, most in one battle 189). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 81.1 | 75 / 210 | 2.70 | 16.4% | 23382 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 16.4% | 75 |
| florent.XSeries.X2 0.12 | 2.8 | 13.6% | 31 |
| rz.GlowBlowMelee 1.4 | 3.2 | 13.5% | 34 |
| davidalves.Phoenix 0.54 | 3.2 | 13.4% | 47 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.4% | 16 |
| oog.melee.Corsair 1.0 | 6.0 | 9.1% | 4 |
| stelo.SoJNanoMelee 1.1 | 7.5 | 6.6% | 2 |
| lunchie.Lunchbox 0.93 | 7.7 | 6.1% | 1 |
| evd.X1 0.01 | 9.3 | 4.8% | 0 |
| as.FrankTheTank 1.3 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 79.7 | 13 / 35 | 3691 |
| 2 | 1 | 65.8 | 81.9 | 15 / 35 | 4042 |
| 3 | 1 | 65.8 | 82.5 | 12 / 35 | 4072 |
| 4 | 1 | 64.6 | 81.3 | 10 / 35 | 3695 |
| 5 | 1 | 65.7 | 84.4 | 12 / 35 | 3939 |
| 6 | 1 | 64.2 | 76.8 | 13 / 35 | 3943 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 36 | 69% |
| davidalves.Phoenix 0.54 | 33 | 39% |
| florent.XSeries.X2 0.12 | 28 | 61% |
| pedersen.Ugluk 1.1.1 | 14 | 50% |
| oog.melee.Corsair 1.0 | 10 | 80% |
| stelo.SoJNanoMelee 1.1 | 4 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 790. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 38 | 27% | 49 |
| florent.XSeries.X2 0.12 | 37 | 26% | 53 |
| rz.GlowBlowMelee 1.4 | 26 | 18% | 51 |
| pedersen.Ugluk 1.1.1 | 17 | 12% | 26 |
| oog.melee.Corsair 1.0 | 10 | 7% | 17 |
| lunchie.Lunchbox 0.93 | 4 | 3% | 7 |
| stelo.SoJNanoMelee 1.1 | 2 | 1% | 3 |
| as.FrankTheTank 1.3 | 2 | 1% | 2 |
| evd.X1 0.01 | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 138127 melee ticks, 40376 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 64 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 8.

Targeting waves (207 rounds): 45998 sent, 40883 reached their opponent, 7274 virtual hits (17.8% of those reached).

## Melee bench: F25

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 832 over 6 battles (138.7 per battle, most in one battle 163). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 89.9 | 140 / 210 | 1.90 | 19.2% | 24975 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 19.2% | 140 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.4% | 21 |
| voidious.mini.BrokenSword 2.0.3 | 2.7 | 13.2% | 15 |
| jdw.Hurricane 1.4 | 3.8 | 12.0% | 24 |
| ds.Oo 2.2 | 5.5 | 8.7% | 3 |
| gre.svman4.Morfeas 1.4.1 | 5.8 | 9.2% | 4 |
| adt.Ar2 1.1 | 7.2 | 7.3% | 4 |
| awesomeness.Elite 1.0 | 7.7 | 6.7% | 0 |
| gjr.Cephalosporin 0.1 | 8.8 | 5.9% | 0 |
| amk.ChumbaMini 0.2 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 88.9 | 22 / 35 | 4280 |
| 2 | 1 | 70.7 | 94.0 | 27 / 35 | 4498 |
| 3 | 1 | 67.9 | 87.3 | 22 / 35 | 3937 |
| 4 | 1 | 68.8 | 91.4 | 24 / 35 | 3947 |
| 5 | 1 | 68.5 | 86.7 | 24 / 35 | 4332 |
| 6 | 1 | 68.9 | 91.4 | 21 / 35 | 3981 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 47 | 87% |
| voidious.mini.BrokenSword 2.0.3 | 39 | 90% |
| jdw.Hurricane 1.4 | 34 | 82% |
| gre.svman4.Morfeas 1.4.1 | 15 | 87% |
| ds.Oo 2.2 | 10 | 80% |
| adt.Ar2 1.1 | 8 | 63% |
| gjr.Cephalosporin 0.1 | 5 | 100% |
| awesomeness.Elite 1.0 | 4 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 688. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 20 | 26% | 62 |
| jdw.Hurricane 1.4 | 16 | 21% | 40 |
| voidious.mini.BrokenSword 2.0.3 | 13 | 17% | 44 |
| ds.Oo 2.2 | 8 | 11% | 20 |
| adt.Ar2 1.1 | 5 | 7% | 12 |
| awesomeness.Elite 1.0 | 3 | 4% | 9 |
| gre.svman4.Morfeas 1.4.1 | 2 | 3% | 14 |
| gjr.Cephalosporin 0.1 | 2 | 3% | 7 |
| amk.ChumbaMini 0.2 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 129539 melee ticks, 31923 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 40 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 2.

Targeting waves (206 rounds): 45733 sent, 40824 reached their opponent, 6490 virtual hits (15.9% of those reached).

## Melee bench: F26

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 477 over 6 battles (79.5 per battle, most in one battle 173). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 94.3 | 160 / 210 | 1.51 | 21.5% | 38861 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 21.5% | 160 |
| ak.Fermat 2.0 | 2.0 | 14.7% | 21 |
| lrem.Spectre 0.4.4 | 3.3 | 12.1% | 11 |
| shu.nitro.LENIN .T34 | 4.0 | 11.7% | 15 |
| js.PinBall 1.6 | 4.8 | 10.6% | 0 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.3% | 2 |
| gh.mini.GrubbmOne 1.0 | 6.8 | 8.5% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.4% | 1 |
| sample.SpinBot 1.0 | 9.0 | 3.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 93.0 | 25 / 35 | 6032 |
| 2 | 1 | 71.7 | 91.1 | 22 / 35 | 6613 |
| 3 | 1 | 73.3 | 95.6 | 29 / 35 | 6813 |
| 4 | 1 | 72.7 | 93.3 | 28 / 35 | 6748 |
| 5 | 1 | 72.5 | 95.6 | 26 / 35 | 6319 |
| 6 | 1 | 73.1 | 97.5 | 30 / 35 | 6336 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 73 | 84% |
| lrem.Spectre 0.4.4 | 48 | 92% |
| shu.nitro.LENIN .T34 | 36 | 86% |
| js.PinBall 1.6 | 18 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 75% |
| jaybot.adv.bots.JayBot 2.0 | 3 | 67% |
| gh.mini.GrubbmOne 1.0 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 954. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 20 | 38% | 75 |
| shu.nitro.LENIN .T34 | 12 | 23% | 47 |
| lrem.Spectre 0.4.4 | 6 | 12% | 45 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 10% | 10 |
| js.PinBall 1.6 | 4 | 8% | 25 |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 6% | 5 |
| gh.mini.GrubbmOne 1.0 | 1 | 2% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 158566 melee ticks, 53484 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 33 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 3.

Targeting waves (204 rounds): 50851 sent, 46024 reached their opponent, 11225 virtual hits (24.4% of those reached).

## Melee bench: F27

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 484 over 6 battles (80.7 per battle, most in one battle 159). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 89.0 | 164 / 210 | 1.99 | 20.2% | 32665 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.2 | 20.2% | 164 |
| mk.Alpha 0.2.1 | 2.5 | 13.0% | 23 |
| EH.Eagle 1.0.6 | 3.8 | 10.4% | 4 |
| sheldor.melee.nano.TestMelee 0.1 | 5.3 | 9.2% | 5 |
| wee.Gem 1.8.4 | 5.3 | 9.5% | 9 |
| techdude.kombat.FlamingKombat 1.5 | 5.5 | 9.4% | 1 |
| throxbot.ThroxBot 0.1 | 6.8 | 7.7% | 1 |
| joe.ADinosaur 1.0 | 7.0 | 8.2% | 0 |
| caimano.Furia_Ceca 0.22 | 8.2 | 7.3% | 3 |
| cs.Grudge 1.0 | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 97.1 | 32 / 35 | 5279 |
| 2 | 1 | 71.5 | 97.1 | 30 / 35 | 5540 |
| 3 | 1 | 72.2 | 97.1 | 29 / 35 | 5772 |
| 4 | 2 | 61.3 | 55.6 | 15 / 35 | 5029 |
| 5 | 1 | 71.4 | 94.0 | 29 / 35 | 5681 |
| 6 | 1 | 70.5 | 93.0 | 29 / 35 | 5364 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 76 | 93% |
| EH.Eagle 1.0.6 | 42 | 98% |
| throxbot.ThroxBot 0.1 | 16 | 94% |
| techdude.kombat.FlamingKombat 1.5 | 11 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 82% |
| wee.Gem 1.8.4 | 10 | 80% |
| joe.ADinosaur 1.0 | 6 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 586. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 15 | 31% | 74 |
| cs.Grudge 1.0 | 7 | 15% | 8 |
| sheldor.melee.nano.TestMelee 0.1 | 5 | 10% | 24 |
| joe.ADinosaur 1.0 | 5 | 10% | 10 |
| caimano.Furia_Ceca 0.22 | 4 | 8% | 9 |
| EH.Eagle 1.0.6 | 3 | 6% | 41 |
| throxbot.ThroxBot 0.1 | 3 | 6% | 12 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 4% | 16 |
| wee.Gem 1.8.4 | 2 | 4% | 15 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 123516 melee ticks, 36741 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 48 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 6.

Targeting waves (202 rounds): 40897 sent, 36107 reached their opponent, 9186 virtual hits (25.4% of those reached).

## Melee bench: F28

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 548 over 6 battles (91.3 per battle, most in one battle 179). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 89.8 | 134 / 210 | 1.91 | 18.8% | 25159 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 18.8% | 134 |
| kid.test.NightFox .2 | 2.0 | 14.7% | 27 |
| uji.Antique 1.0 | 3.0 | 12.5% | 26 |
| qohnil.blot.BlotBot 3.61 | 4.2 | 10.7% | 11 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 10.1% | 4 |
| amk.ChumbaWumba 0.3 | 6.2 | 8.1% | 6 |
| ahr.ice.Ice 1.0.2 | 6.5 | 7.8% | 2 |
| matt.advanced.Katana 1.0 | 8.2 | 6.3% | 1 |
| stelo.PianistNano 1.2 | 9.0 | 5.7% | 0 |
| stelo.Lifestealer 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 92.7 | 27 / 35 | 4457 |
| 2 | 1 | 67.4 | 85.7 | 21 / 35 | 4133 |
| 3 | 1 | 68.5 | 89.5 | 21 / 35 | 4275 |
| 4 | 1 | 66.8 | 88.6 | 16 / 35 | 3874 |
| 5 | 1 | 69.0 | 91.1 | 25 / 35 | 4261 |
| 6 | 1 | 68.7 | 91.4 | 24 / 35 | 4159 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 81 | 86% |
| uji.Antique 1.0 | 42 | 69% |
| qohnil.blot.BlotBot 3.61 | 16 | 94% |
| amk.ChumbaWumba 0.3 | 11 | 64% |
| ahr.ice.Ice 1.0.2 | 5 | 80% |
| pfvicm.Sobieski 7.2.3b | 5 | 80% |
| stelo.PianistNano 1.2 | 3 | 100% |
| matt.advanced.Katana 1.0 | 2 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 719. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 23 | 29% | 59 |
| uji.Antique 1.0 | 18 | 23% | 61 |
| pfvicm.Sobieski 7.2.3b | 12 | 15% | 19 |
| amk.ChumbaWumba 0.3 | 10 | 13% | 17 |
| qohnil.blot.BlotBot 3.61 | 6 | 8% | 27 |
| ahr.ice.Ice 1.0.2 | 4 | 5% | 10 |
| matt.advanced.Katana 1.0 | 2 | 3% | 10 |
| stelo.Lifestealer 1.0 | 1 | 1% | 2 |
| stelo.PianistNano 1.2 | 0 | 0% | 5 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 129200 melee ticks, 34881 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 40 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 6.

Targeting waves (202 rounds): 43590 sent, 38886 reached their opponent, 5751 virtual hits (14.8% of those reached).

## Melee bench: F29

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 773 over 6 battles (128.8 per battle, most in one battle 189). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 86.5 | 105 / 210 | 2.22 | 18.7% | 27709 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 18.7% | 105 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 15.0% | 48 |
| deewiant.Anomaly 0.2 | 2.5 | 15.0% | 44 |
| myl.micro.Troodon 1.10 | 4.2 | 11.7% | 5 |
| jok.PheonixM 0.1.2 | 5.0 | 10.3% | 5 |
| ph.melee.ArcherME 0.3 | 5.8 | 8.6% | 0 |
| DBall.Anarchy 0.1 | 7.5 | 6.4% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 7.7 | 5.9% | 0 |
| ap.Frederick 1.1 | 9.2 | 4.4% | 0 |
| jangs.ns51 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 82.9 | 14 / 35 | 4222 |
| 2 | 1 | 70.7 | 91.1 | 19 / 35 | 5296 |
| 3 | 1 | 69.1 | 88.3 | 16 / 35 | 4651 |
| 4 | 1 | 68.2 | 85.1 | 19 / 35 | 4326 |
| 5 | 1 | 69.0 | 85.4 | 21 / 35 | 4635 |
| 6 | 1 | 68.3 | 86.0 | 16 / 35 | 4579 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 57 | 63% |
| zyx.mega.YersiniaPestis 3.1 | 50 | 58% |
| jok.PheonixM 0.1.2 | 18 | 94% |
| myl.micro.Troodon 1.10 | 14 | 93% |
| DBall.Anarchy 0.1 | 4 | 100% |
| ap.Frederick 1.1 | 3 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 962. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 42 | 39% | 80 |
| zyx.mega.YersiniaPestis 3.1 | 41 | 38% | 71 |
| myl.micro.Troodon 1.10 | 13 | 12% | 27 |
| jok.PheonixM 0.1.2 | 6 | 6% | 22 |
| DBall.Anarchy 0.1 | 2 | 2% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 3 |
| ph.melee.ArcherME 0.3 | 0 | 0% | 1 |
| jangs.ns51 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 164057 melee ticks, 53358 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 49 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 13.

Targeting waves (203 rounds): 53499 sent, 48644 reached their opponent, 7412 virtual hits (15.2% of those reached).

## Melee bench: F30

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 918 over 6 battles (153.0 per battle, most in one battle 162). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 78.1 | 57 / 210 | 2.97 | 15.5% | 23143 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.5 | 15.5% | 57 |
| darkcanuck.B26354 1.06 | 2.5 | 13.6% | 51 |
| catcat20.Matcha 0.006 | 3.0 | 13.2% | 45 |
| stelo.PastFuture 2.3.2 | 4.0 | 12.1% | 16 |
| oog.melee.Capulet 1.2 | 4.2 | 12.1% | 21 |
| intruder.PrairieWolf 2.61 | 5.8 | 9.6% | 14 |
| ntc.Opposite 1.5 | 7.7 | 7.5% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 8.0 | 6.9% | 4 |
| tripphippy.Alice 1.1 | 8.3 | 6.7% | 2 |
| GarmBox.Anger 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 81.9 | 9 / 35 | 3808 |
| 2 | 1 | 65.3 | 80.6 | 13 / 35 | 4038 |
| 3 | 1 | 65.5 | 83.5 | 12 / 35 | 4162 |
| 4 | 3 | 61.4 | 70.8 | 5 / 35 | 3696 |
| 5 | 2 | 62.7 | 75.6 | 6 / 35 | 3801 |
| 6 | 1 | 62.6 | 76.2 | 12 / 35 | 3638 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 33 | 52% |
| darkcanuck.B26354 1.06 | 24 | 42% |
| stelo.PastFuture 2.3.2 | 17 | 71% |
| oog.melee.Capulet 1.2 | 14 | 64% |
| intruder.PrairieWolf 2.61 | 6 | 83% |
| tripphippy.Alice 1.1 | 6 | 67% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 0% |

Hadur died in 159 of 210 rounds, at a mean tick of 926. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 40 | 25% | 59 |
| darkcanuck.B26354 1.06 | 40 | 25% | 48 |
| stelo.PastFuture 2.3.2 | 30 | 19% | 41 |
| oog.melee.Capulet 1.2 | 19 | 12% | 30 |
| tripphippy.Alice 1.1 | 9 | 6% | 13 |
| intruder.PrairieWolf 2.61 | 8 | 5% | 11 |
| fowl3628800.LightningBolt 2.6.0 | 5 | 3% | 5 |
| ntc.Opposite 1.5 | 2 | 1% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 165544 melee ticks, 33766 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 55 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 6.

Targeting waves (207 rounds): 51959 sent, 46907 reached their opponent, 7984 virtual hits (17.0% of those reached).

## Melee bench: F31

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 852 over 6 battles (142.0 per battle, most in one battle 200). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 80.7 | 71 / 210 | 2.73 | 16.2% | 22035 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.3 | 17.0% | 76 |
| hadur117.Hadur 3.20wm | 1.7 | 16.2% | 71 |
| gh.mini.Griezel 0.2 | 3.2 | 13.0% | 40 |
| d414.nano.Quantum 1.0.0 | 3.8 | 12.0% | 7 |
| spinnercat.micro.Tyger 0.1 | 5.2 | 10.8% | 8 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.0% | 6 |
| timmit.nano.TimDog 0.33 | 7.7 | 6.3% | 2 |
| fm.mammillarias 1.3 | 8.2 | 5.8% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.7 | 5.2% | 1 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 87.0 | 18 / 35 | 3659 |
| 2 | 2 | 62.5 | 74.9 | 6 / 35 | 3646 |
| 3 | 1 | 67.2 | 85.4 | 14 / 35 | 3981 |
| 4 | 2 | 63.2 | 75.6 | 12 / 35 | 3311 |
| 5 | 2 | 66.7 | 86.7 | 12 / 35 | 3886 |
| 6 | 2 | 62.7 | 74.9 | 9 / 35 | 3552 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 59 | 47% |
| gh.mini.Griezel 0.2 | 38 | 58% |
| d414.nano.Quantum 1.0.0 | 14 | 79% |
| spinnercat.micro.Tyger 0.1 | 7 | 43% |
| gh.nano.Grofvuil 0.2 | 4 | 100% |
| timmit.nano.TimDog 0.33 | 3 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 59 | 42% | 88 |
| gh.mini.Griezel 0.2 | 29 | 20% | 51 |
| d414.nano.Quantum 1.0.0 | 16 | 11% | 25 |
| spinnercat.micro.Tyger 0.1 | 13 | 9% | 17 |
| timmit.nano.TimDog 0.33 | 10 | 7% | 13 |
| gh.nano.Grofvuil 0.2 | 6 | 4% | 7 |
| fm.mammillarias 1.3 | 4 | 3% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 149777 melee ticks, 37042 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 290 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 52 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 14.

Targeting waves (204 rounds): 48644 sent, 43578 reached their opponent, 7000 virtual hits (16.1% of those reached).

## Melee bench: F32

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 538 over 6 battles (89.7 per battle, most in one battle 161). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 87.9 | 123 / 210 | 2.09 | 18.4% | 27260 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 18.4% | 123 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.9% | 46 |
| apc.botM 3.0 | 3.5 | 11.4% | 12 |
| vjik.UnViolation 1.1 | 3.8 | 10.4% | 13 |
| lxx.ConceptA 0.8 | 4.8 | 9.8% | 8 |
| bayen.UbaMicro 1.4 | 6.2 | 8.7% | 1 |
| panzer.Panzer 0.2 | 7.3 | 7.6% | 3 |
| yk.JahMicro 1.0 | 8.0 | 7.0% | 3 |
| conscience.Electron 1.3g | 8.7 | 6.4% | 0 |
| donjezza.Jezza 1.0 | 9.7 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 91.4 | 21 / 35 | 4199 |
| 2 | 1 | 68.4 | 89.5 | 20 / 35 | 4700 |
| 3 | 1 | 66.8 | 85.7 | 16 / 35 | 4500 |
| 4 | 1 | 65.5 | 81.3 | 20 / 35 | 4184 |
| 5 | 1 | 69.1 | 92.1 | 21 / 35 | 4863 |
| 6 | 1 | 68.6 | 87.6 | 25 / 35 | 4814 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 83 | 60% |
| apc.botM 3.0 | 27 | 85% |
| lxx.ConceptA 0.8 | 16 | 94% |
| vjik.UnViolation 1.1 | 13 | 69% |
| donjezza.Jezza 1.0 | 10 | 90% |
| bayen.UbaMicro 1.4 | 10 | 90% |
| yk.JahMicro 1.0 | 8 | 75% |
| panzer.Panzer 0.2 | 3 | 67% |

Hadur died in 90 of 210 rounds, at a mean tick of 746. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 41 | 46% | 88 |
| lxx.ConceptA 0.8 | 13 | 14% | 23 |
| apc.botM 3.0 | 10 | 11% | 38 |
| vjik.UnViolation 1.1 | 7 | 8% | 24 |
| bayen.UbaMicro 1.4 | 7 | 8% | 14 |
| conscience.Electron 1.3g | 4 | 4% | 4 |
| yk.JahMicro 1.0 | 3 | 3% | 7 |
| panzer.Panzer 0.2 | 2 | 2% | 4 |
| donjezza.Jezza 1.0 | 1 | 1% | 6 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 125435 melee ticks, 54340 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 82 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 82 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 42812 sent, 37972 reached their opponent, 6865 virtual hits (18.1% of those reached).

## Melee bench: F33

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 984 over 6 battles (164.0 per battle, most in one battle 207). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.5 | 117 / 210 | 2.04 | 19.1% | 29147 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 19.1% | 117 |
| maribo.Quester 0.3 | 2.0 | 15.6% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.8% | 23 |
| gre.svman4.Leonidas 1.3.2 | 4.2 | 11.3% | 11 |
| labg.Cataclysm 2.05 | 4.8 | 10.7% | 18 |
| baal.nano.N 1.42 | 6.3 | 8.9% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 8.2% | 3 |
| zyx.micro.Ant 1.1 | 8.2 | 5.3% | 0 |
| sanja.First 0.1 | 8.8 | 4.8% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 94.6 | 24 / 35 | 5229 |
| 2 | 1 | 69.0 | 87.6 | 17 / 35 | 4828 |
| 3 | 1 | 66.8 | 81.9 | 14 / 35 | 4443 |
| 4 | 1 | 69.5 | 89.2 | 20 / 35 | 4831 |
| 5 | 1 | 68.7 | 88.3 | 17 / 35 | 4803 |
| 6 | 1 | 70.4 | 89.2 | 25 / 35 | 5013 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 64 | 72% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 34 | 68% |
| gre.svman4.Leonidas 1.3.2 | 23 | 87% |
| labg.Cataclysm 2.05 | 21 | 62% |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 90% |
| baal.nano.N 1.42 | 5 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 1026. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 34 | 35% | 84 |
| gre.svman4.Leonidas 1.3.2 | 19 | 20% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 19% | 43 |
| labg.Cataclysm 2.05 | 12 | 12% | 26 |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 6% | 13 |
| zyx.micro.Ant 1.1 | 3 | 3% | 5 |
| baal.nano.N 1.42 | 1 | 1% | 5 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 177923 melee ticks, 50145 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 443 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 313 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 15.

Targeting waves (207 rounds): 55942 sent, 50907 reached their opponent, 7528 virtual hits (14.8% of those reached).

## Melee bench: F34

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 460 over 6 battles (76.7 per battle, most in one battle 147). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 89.1 | 96 / 210 | 1.98 | 18.7% | 30721 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 18.7% | 96 |
| stelo.Spread 0.9 | 2.3 | 16.3% | 57 |
| kid.Gladiator .7.2 | 2.7 | 16.4% | 42 |
| tcf.Reach 3 | 4.5 | 10.9% | 4 |
| jcs.Seth 1.8 | 4.5 | 11.1% | 11 |
| cli.Dancer 1.1 | 6.0 | 9.0% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.0% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.1% | 0 |
| sample.RamFire 1.0 | 9.7 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 92.1 | 18 / 35 | 5324 |
| 2 | 1 | 67.5 | 84.1 | 12 / 35 | 4574 |
| 3 | 1 | 71.7 | 93.7 | 24 / 35 | 5614 |
| 4 | 1 | 68.7 | 88.3 | 13 / 35 | 4889 |
| 5 | 1 | 68.2 | 85.7 | 12 / 35 | 4898 |
| 6 | 1 | 70.4 | 90.8 | 17 / 35 | 5422 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 68 | 62% |
| kid.Gladiator .7.2 | 59 | 56% |
| jcs.Seth 1.8 | 15 | 47% |
| tcf.Reach 3 | 10 | 80% |
| ratosh.Wesco 1.4 | 5 | 80% |
| cli.Dancer 1.1 | 2 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 1099. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 47 | 40% | 75 |
| stelo.Spread 0.9 | 39 | 33% | 76 |
| jcs.Seth 1.8 | 19 | 16% | 29 |
| tcf.Reach 3 | 6 | 5% | 18 |
| ratosh.Wesco 1.4 | 2 | 2% | 5 |
| cli.Dancer 1.1 | 1 | 1% | 6 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 175452 melee ticks, 56242 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 461 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 296 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 3.

Targeting waves (205 rounds): 53439 sent, 48568 reached their opponent, 8055 virtual hits (16.6% of those reached).

## Melee bench: F35

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 802 over 6 battles (133.7 per battle, most in one battle 163). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 83.4 | 41 / 210 | 2.49 | 16.2% | 22939 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.4% | 134 |
| hadur117.Hadur 3.20wm | 2.0 | 16.2% | 41 |
| gh.mini.Gruwel 0.9 | 3.2 | 13.1% | 19 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 12.0% | 13 |
| rz.HawkOnFire 0.1 | 4.5 | 11.2% | 3 |
| wit.Chuliath 1.0 | 6.3 | 6.8% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.3 | 5.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 5.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.0% | 0 |
| dans.Cinnamon 1.2 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 83.2 | 6 / 35 | 3975 |
| 2 | 2 | 65.2 | 82.9 | 11 / 35 | 3713 |
| 3 | 2 | 65.6 | 82.9 | 5 / 35 | 3842 |
| 4 | 2 | 65.3 | 83.2 | 6 / 35 | 3777 |
| 5 | 2 | 66.4 | 86.0 | 9 / 35 | 3961 |
| 6 | 2 | 64.7 | 82.5 | 4 / 35 | 3671 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 99 | 19% |
| gh.mini.Gruwel 0.9 | 19 | 53% |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 75% |
| rz.HawkOnFire 0.1 | 6 | 100% |

Hadur died in 174 of 210 rounds, at a mean tick of 987. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 106 | 61% | 124 |
| gh.mini.Gruwel 0.9 | 27 | 16% | 38 |
| dmh.robocode.robot.BlackDeath 9.2 | 21 | 12% | 26 |
| rz.HawkOnFire 0.1 | 5 | 3% | 10 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 5 | 3% | 7 |
| wit.Chuliath 1.0 | 2 | 1% | 2 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 150259 melee ticks, 55572 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 828 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 199 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 8.

Targeting waves (205 rounds): 46158 sent, 41133 reached their opponent, 6485 virtual hits (15.8% of those reached).

## Melee bench: F36

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1099 over 6 battles (183.2 per battle, most in one battle 213). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 92.8 | 162 / 210 | 1.65 | 20.8% | 32247 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 20.8% | 162 |
| bzdp.Pansy 2.1 | 2.3 | 12.7% | 9 |
| alpha.RainingFire 1.0 | 2.7 | 12.4% | 12 |
| mz.Cork 0.1 | 4.7 | 10.5% | 11 |
| bvh.micro.Freya 0.3 | 5.0 | 10.3% | 8 |
| m3thos.Eva02 0.7.1 | 5.8 | 9.9% | 5 |
| bvh.mini.Fenrir 0.39 | 6.5 | 9.5% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 5.5% | 1 |
| dl.BetterWalls 1.0 | 8.7 | 5.2% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 93.7 | 27 / 35 | 5350 |
| 2 | 1 | 70.9 | 93.0 | 28 / 35 | 5108 |
| 3 | 1 | 71.3 | 93.3 | 28 / 35 | 5323 |
| 4 | 1 | 72.0 | 92.7 | 30 / 35 | 5642 |
| 5 | 1 | 71.6 | 94.9 | 26 / 35 | 5414 |
| 6 | 1 | 70.1 | 88.9 | 23 / 35 | 5410 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 50 | 96% |
| alpha.RainingFire 1.0 | 31 | 84% |
| mz.Cork 0.1 | 29 | 90% |
| bvh.micro.Freya 0.3 | 26 | 88% |
| m3thos.Eva02 0.7.1 | 21 | 86% |
| bvh.mini.Fenrir 0.39 | 19 | 95% |
| sample.MyFirstRobot 1.0 | 2 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 10 | 19% | 37 |
| bvh.micro.Freya 0.3 | 10 | 19% | 34 |
| bzdp.Pansy 2.1 | 8 | 15% | 49 |
| mz.Cork 0.1 | 7 | 13% | 37 |
| m3thos.Eva02 0.7.1 | 6 | 11% | 26 |
| bvh.mini.Fenrir 0.39 | 5 | 9% | 21 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 2 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 2 |
| dl.BetterWalls 1.0 | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 146542 melee ticks, 46655 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 49 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 8.

Targeting waves (203 rounds): 49182 sent, 44527 reached their opponent, 8761 virtual hits (19.7% of those reached).

## Melee bench: F37

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 365 over 6 battles (60.8 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 88.0 | 159 / 210 | 2.08 | 19.1% | 32936 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 19.1% | 159 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.7 | 10.5% | 7 |
| germ.TheMind .2 | 3.8 | 10.0% | 5 |
| EBBU.Sim2 1.02 | 4.3 | 9.7% | 2 |
| agrach.Dalek 1.0 | 4.7 | 9.6% | 10 |
| mn.nano.perceptual.Impact 1.3.0 | 6.5 | 8.6% | 3 |
| lmk.ACPFinal 0.1 | 6.8 | 8.5% | 7 |
| stelo.UntouchableNano 1.3 | 7.2 | 8.7% | 9 |
| mb.Beast 0.1 | 8.5 | 8.1% | 8 |
| skm.Ryubot 1.0 | 9.5 | 7.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 82.9 | 22 / 35 | 5250 |
| 2 | 1 | 70.4 | 95.2 | 31 / 35 | 5904 |
| 3 | 1 | 69.1 | 90.5 | 28 / 35 | 5638 |
| 4 | 1 | 67.9 | 86.0 | 27 / 35 | 5504 |
| 5 | 1 | 68.0 | 88.6 | 26 / 35 | 5409 |
| 6 | 1 | 66.9 | 85.1 | 25 / 35 | 5231 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 29 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 26 | 96% |
| agrach.Dalek 1.0 | 22 | 100% |
| stelo.UntouchableNano 1.3 | 21 | 81% |
| EBBU.Sim2 1.02 | 20 | 95% |
| skm.Ryubot 1.0 | 17 | 100% |
| mb.Beast 0.1 | 15 | 93% |
| lmk.ACPFinal 0.1 | 14 | 93% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 397. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 12 | 23% | 17 |
| com.syncleus.robocode.Dreadnaught 0.1 | 9 | 17% | 36 |
| EBBU.Sim2 1.02 | 6 | 11% | 26 |
| stelo.UntouchableNano 1.3 | 6 | 11% | 24 |
| lmk.ACPFinal 0.1 | 6 | 11% | 20 |
| agrach.Dalek 1.0 | 5 | 9% | 39 |
| mb.Beast 0.1 | 4 | 8% | 18 |
| germ.TheMind .2 | 3 | 6% | 21 |
| skm.Ryubot 1.0 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 94720 melee ticks, 26491 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 97 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 97 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 32386 sent, 27799 reached their opponent, 8091 virtual hits (29.1% of those reached).

## Melee bench: F38

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 640 over 6 battles (106.7 per battle, most in one battle 187). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 88.1 | 117 / 210 | 2.07 | 18.5% | 27969 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 18.5% | 117 |
| justin.Mallais 14.0 | 2.0 | 16.1% | 54 |
| bvh.mini.Freya 0.55 | 3.3 | 12.2% | 6 |
| bts.mega.Gnarly 1.4 | 4.0 | 11.6% | 19 |
| cs.Wren 1.0 | 4.8 | 10.8% | 6 |
| kdf.KoulDestroyer 1.0 | 6.2 | 8.7% | 5 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.7 | 8.2% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 6.1% | 1 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.1% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 86.3 | 19 / 35 | 4711 |
| 2 | 1 | 68.3 | 85.4 | 19 / 35 | 4819 |
| 3 | 1 | 69.2 | 88.9 | 20 / 35 | 4902 |
| 4 | 1 | 68.3 | 90.8 | 18 / 35 | 4280 |
| 5 | 1 | 68.8 | 88.3 | 22 / 35 | 4752 |
| 6 | 1 | 68.4 | 88.9 | 19 / 35 | 4505 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 81 | 72% |
| bts.mega.Gnarly 1.4 | 23 | 65% |
| bvh.mini.Freya 0.55 | 20 | 90% |
| cs.Wren 1.0 | 16 | 88% |
| kdf.KoulDestroyer 1.0 | 7 | 57% |
| davidalves.net.DuelistNanoMelee 1.01 | 5 | 100% |
| matt.UnderDark3 2.4.34 | 2 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 748. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 34 | 36% | 96 |
| bts.mega.Gnarly 1.4 | 24 | 25% | 46 |
| bvh.mini.Freya 0.55 | 11 | 12% | 18 |
| kdf.KoulDestroyer 1.0 | 11 | 12% | 16 |
| cs.Wren 1.0 | 9 | 9% | 22 |
| davidalves.net.DuelistNanoMelee 1.01 | 2 | 2% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 2% | 5 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 137683 melee ticks, 41686 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 380 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 267 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 9.

Targeting waves (204 rounds): 45123 sent, 40046 reached their opponent, 8438 virtual hits (21.1% of those reached).

## Melee bench: F39

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 903 over 6 battles (150.5 per battle, most in one battle 171). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 86.5 | 102 / 210 | 2.22 | 18.4% | 30406 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 18.4% | 102 |
| bvh.fry.Freya 0.82 | 2.2 | 14.9% | 19 |
| az.Ololobot 0.2.4 | 3.0 | 13.1% | 52 |
| catcat20.Lambda 0.024 | 3.8 | 12.0% | 29 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.6% | 3 |
| apollokidd.ApolloKidd 0.9 | 6.3 | 7.8% | 2 |
| stelo.SoRobotNanoMelee 1.2 | 6.8 | 7.5% | 3 |
| gimp.GimpBot 0.1 | 7.5 | 7.5% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.8 | 5.7% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 91.1 | 18 / 35 | 5552 |
| 2 | 1 | 69.4 | 92.1 | 24 / 35 | 4971 |
| 3 | 1 | 65.7 | 79.4 | 16 / 35 | 4782 |
| 4 | 1 | 67.2 | 84.8 | 14 / 35 | 4886 |
| 5 | 1 | 67.4 | 84.1 | 15 / 35 | 5024 |
| 6 | 1 | 68.2 | 87.3 | 15 / 35 | 5191 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 51 | 88% |
| az.Ololobot 0.2.4 | 49 | 45% |
| catcat20.Lambda 0.024 | 37 | 62% |
| winamp32.micro.MicroMacro 1.0 | 6 | 100% |
| apollokidd.ApolloKidd 0.9 | 3 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 2 | 100% |
| gimp.GimpBot 0.1 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 1074. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 41 | 36% | 68 |
| bvh.fry.Freya 0.82 | 31 | 27% | 65 |
| catcat20.Lambda 0.024 | 24 | 21% | 46 |
| stelo.SoRobotNanoMelee 1.2 | 4 | 4% | 6 |
| gimp.GimpBot 0.1 | 3 | 3% | 8 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 7 |
| apollokidd.ApolloKidd 0.9 | 2 | 2% | 5 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 163531 melee ticks, 55423 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 50 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 8.

Targeting waves (204 rounds): 51321 sent, 46432 reached their opponent, 8003 virtual hits (17.2% of those reached).

## Melee bench: F40

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 749 over 6 battles (124.8 per battle, most in one battle 222). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 89.8 | 128 / 210 | 1.92 | 19.8% | 31167 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 19.8% | 128 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.8% | 33 |
| kano.gamma.KanoGamma 1.8 | 3.5 | 12.1% | 16 |
| mz.AntiGrav 1.0 | 3.8 | 11.5% | 14 |
| Polkwane.SmashMelee 1.0 | 5.2 | 10.3% | 10 |
| stelo.Randomness 1.0 | 5.8 | 9.3% | 5 |
| alpha.BlackIce 1.0 | 6.8 | 8.4% | 3 |
| amk.superstrike.SuperStrike 0.3 | 7.8 | 6.6% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.3 | 4.1% | 0 |
| sample.Corners 1.0 | 9.7 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 91.4 | 21 / 35 | 5435 |
| 2 | 1 | 70.4 | 90.8 | 24 / 35 | 4823 |
| 3 | 1 | 69.9 | 89.8 | 18 / 35 | 5230 |
| 4 | 1 | 69.7 | 88.9 | 20 / 35 | 5071 |
| 5 | 1 | 70.1 | 89.8 | 22 / 35 | 5242 |
| 6 | 1 | 70.2 | 87.9 | 23 / 35 | 5366 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 57 | 74% |
| kano.gamma.KanoGamma 1.8 | 39 | 82% |
| mz.AntiGrav 1.0 | 29 | 86% |
| Polkwane.SmashMelee 1.0 | 23 | 91% |
| stelo.Randomness 1.0 | 6 | 83% |
| alpha.BlackIce 1.0 | 4 | 75% |

Hadur died in 84 of 210 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 23 | 27% | 63 |
| kano.gamma.KanoGamma 1.8 | 16 | 19% | 53 |
| Polkwane.SmashMelee 1.0 | 14 | 17% | 24 |
| stelo.Randomness 1.0 | 9 | 11% | 24 |
| mz.AntiGrav 1.0 | 9 | 11% | 22 |
| alpha.BlackIce 1.0 | 7 | 8% | 13 |
| amk.superstrike.SuperStrike 0.3 | 4 | 5% | 7 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 2 |
| sample.Corners 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 151741 melee ticks, 42806 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 206 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 113 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 14.

Targeting waves (207 rounds): 49909 sent, 44856 reached their opponent, 9332 virtual hits (20.8% of those reached).

## Melee bench: F41

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 719 over 6 battles (119.8 per battle, most in one battle 160). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.8 | 107 / 210 | 2.01 | 18.4% | 25878 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.2 | 18.4% | 107 |
| eem.EvBotNG v12.8 | 1.8 | 15.9% | 71 |
| ary.Swarm 1.1 | 3.3 | 12.8% | 8 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.2% | 15 |
| simonton.nano.MeleeSeed 1.8 | 5.2 | 11.0% | 8 |
| shrub.Silver v048 | 5.8 | 9.5% | 2 |
| zyx.nano.Ant 1.1 | 7.0 | 8.0% | 0 |
| stelo.Mirror 1.1 | 8.3 | 5.1% | 0 |
| jsal.Jsalbot 1.0 | 8.7 | 5.1% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 88.9 | 17 / 35 | 4199 |
| 2 | 1 | 69.9 | 92.7 | 20 / 35 | 4808 |
| 3 | 2 | 67.0 | 84.8 | 11 / 35 | 4206 |
| 4 | 1 | 67.7 | 85.4 | 17 / 35 | 4022 |
| 5 | 1 | 69.4 | 90.5 | 25 / 35 | 4370 |
| 6 | 1 | 68.9 | 90.5 | 17 / 35 | 4273 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 82 | 46% |
| lessonz.robocode.Oz 0.5.0 | 28 | 86% |
| ary.Swarm 1.1 | 23 | 78% |
| simonton.nano.MeleeSeed 1.8 | 18 | 89% |
| shrub.Silver v048 | 9 | 100% |
| stelo.Mirror 1.1 | 2 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 1021. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 62 | 57% | 101 |
| ary.Swarm 1.1 | 13 | 12% | 34 |
| lessonz.robocode.Oz 0.5.0 | 12 | 11% | 25 |
| simonton.nano.MeleeSeed 1.8 | 10 | 9% | 24 |
| shrub.Silver v048 | 4 | 4% | 15 |
| zyx.nano.Ant 1.1 | 1 | 1% | 5 |
| stelo.Mirror 1.1 | 1 | 1% | 5 |
| jsal.Jsalbot 1.0 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 151387 melee ticks, 56259 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 171 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 171 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 49821 sent, 44888 reached their opponent, 6775 virtual hits (15.1% of those reached).

## Melee bench: F42

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 710 over 6 battles (118.3 per battle, most in one battle 194). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 92.5 | 153 / 210 | 1.67 | 20.6% | 34953 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 20.6% | 153 |
| wompi.Wallaby 5.1 | 2.0 | 14.9% | 22 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.2% | 10 |
| ara.Shera 0.88 | 3.7 | 12.7% | 21 |
| amz.NanoClone 1.41 | 5.0 | 8.7% | 0 |
| maribo.IotaCT 1.1 | 6.8 | 6.7% | 1 |
| dsw.StaticD 1.0 | 7.0 | 6.9% | 3 |
| mme.NikeEnhanced 2.0 | 8.3 | 5.8% | 0 |
| stelo.MirrorMicro 1.0 | 8.5 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.3 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 93.3 | 26 / 35 | 5725 |
| 2 | 1 | 72.8 | 97.8 | 30 / 35 | 6214 |
| 3 | 1 | 71.2 | 93.7 | 27 / 35 | 5856 |
| 4 | 1 | 71.0 | 91.7 | 24 / 35 | 5880 |
| 5 | 1 | 71.5 | 93.3 | 25 / 35 | 5987 |
| 6 | 1 | 68.4 | 85.4 | 21 / 35 | 5291 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 89 | 93% |
| maribo.mini.MiniQuester 0.1 | 40 | 85% |
| ara.Shera 0.88 | 32 | 78% |
| dsw.StaticD 1.0 | 5 | 80% |
| mme.NikeEnhanced 2.0 | 2 | 100% |
| stelo.MirrorMicro 1.0 | 2 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 954. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.mini.MiniQuester 0.1 | 22 | 37% | 56 |
| ara.Shera 0.88 | 18 | 30% | 41 |
| wompi.Wallaby 5.1 | 13 | 22% | 92 |
| dsw.StaticD 1.0 | 3 | 5% | 11 |
| amz.NanoClone 1.41 | 1 | 2% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 2% | 1 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 2 |
| maribo.IotaCT 1.1 | 0 | 0% | 2 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 156705 melee ticks, 50318 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 47 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 9.

Targeting waves (201 rounds): 49778 sent, 45090 reached their opponent, 8801 virtual hits (19.5% of those reached).

## Melee bench: F43

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 772 over 6 battles (128.7 per battle, most in one battle 155). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 81.0 | 38 / 210 | 2.71 | 15.9% | 23979 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.7% | 138 |
| hadur117.Hadur 3.20wm | 2.0 | 15.9% | 38 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.6% | 24 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.7% | 7 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.2% | 1 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.4% | 0 |
| mz.NanoGod 2.02 | 7.5 | 7.7% | 1 |
| jab.DiamondStealer 5 | 7.5 | 7.5% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.7% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.0 | 78.4 | 4 / 35 | 3847 |
| 2 | 2 | 65.7 | 80.3 | 6 / 35 | 3903 |
| 3 | 2 | 67.1 | 81.9 | 11 / 35 | 4136 |
| 4 | 2 | 64.2 | 75.9 | 5 / 35 | 3628 |
| 5 | 2 | 66.0 | 81.0 | 5 / 35 | 4042 |
| 6 | 2 | 68.0 | 88.3 | 7 / 35 | 4423 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 94 | 23% |
| brainfade.melee.Dusk 0.44 | 18 | 44% |
| dummy.micro.Sparrow 2.5 | 6 | 67% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 75% |
| cvt.Firsty 1.0 | 1 | 0% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 176 of 210 rounds, at a mean tick of 1008. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 110 | 63% | 129 |
| brainfade.melee.Dusk 0.44 | 24 | 14% | 33 |
| dummy.micro.Sparrow 2.5 | 13 | 7% | 17 |
| wcsv.melee.EngineerMelee 0.1 | 13 | 7% | 17 |
| jab.DiamondStealer 5 | 4 | 2% | 5 |
| Krabb.akim2.Akim2 1.1b | 4 | 2% | 4 |
| mz.NanoGod 2.02 | 3 | 2% | 4 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 158438 melee ticks, 56899 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 32 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 3.

Targeting waves (208 rounds): 50313 sent, 45237 reached their opponent, 7591 virtual hits (16.8% of those reached).

## Melee bench: F44

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 385 over 6 battles (64.2 per battle, most in one battle 82). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 91.1 | 131 / 210 | 1.80 | 20.3% | 34156 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 20.3% | 131 |
| stelo.Liblix 0.3.1 | 2.0 | 15.8% | 52 |
| tzu.TheArtOfWar 1.2 | 3.0 | 14.2% | 20 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.3 | 9.4% | 1 |
| jwirde.Gort 2.0 | 4.7 | 9.2% | 4 |
| disan.Chair 2.2.0 | 6.2 | 8.1% | 0 |
| wompi.Quokka 1.6 | 7.0 | 6.9% | 1 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.6% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.8% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 91.7 | 24 / 35 | 5791 |
| 2 | 1 | 70.6 | 92.1 | 19 / 35 | 5550 |
| 3 | 1 | 70.5 | 91.4 | 21 / 35 | 5853 |
| 4 | 1 | 71.1 | 92.1 | 22 / 35 | 5630 |
| 5 | 1 | 70.2 | 88.6 | 22 / 35 | 5781 |
| 6 | 1 | 70.7 | 90.8 | 23 / 35 | 5551 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 82 | 68% |
| tzu.TheArtOfWar 1.2 | 61 | 79% |
| jwirde.Gort 2.0 | 10 | 90% |
| disan.Chair 2.2.0 | 10 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |
| wompi.Quokka 1.6 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 913. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 39 | 49% | 100 |
| tzu.TheArtOfWar 1.2 | 23 | 29% | 58 |
| jwirde.Gort 2.0 | 5 | 6% | 22 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 6% | 14 |
| disan.Chair 2.2.0 | 4 | 5% | 7 |
| wompi.Quokka 1.6 | 2 | 3% | 2 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 3 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 4 |

Posture (Hadur's M records, 204 rounds): 156884 melee ticks, 47603 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 633 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 531 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 8.

Targeting waves (204 rounds): 53109 sent, 48295 reached their opponent, 9952 virtual hits (20.6% of those reached).

## Melee bench: F45

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 506 over 6 battles (84.3 per battle, most in one battle 174). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 90.0 | 118 / 210 | 1.90 | 20.3% | 33371 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wm | 1.0 | 20.3% | 118 |
| jje.BagPuss 1.2 | 2.7 | 12.2% | 13 |
| eem.IWillFireNoBullet v2.8 | 3.8 | 10.0% | 59 |
| myl.nano.Graviton 1.10 | 4.0 | 10.7% | 6 |
| sul.Lunar 1.1 | 4.3 | 10.8% | 8 |
| hvilela.HVilela 0.9 | 6.7 | 8.8% | 0 |
| fm.claire 1.7 | 6.8 | 8.4% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 8.3% | 3 |
| wit.Deep7 2.0 | 9.0 | 5.8% | 3 |
| abud.ThirdRobo 1.0 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 90.5 | 19 / 35 | 5874 |
| 2 | 1 | 70.1 | 89.2 | 19 / 35 | 5865 |
| 3 | 1 | 70.1 | 90.2 | 20 / 35 | 5737 |
| 4 | 1 | 71.5 | 94.3 | 23 / 35 | 4425 |
| 5 | 1 | 69.0 | 87.0 | 19 / 35 | 5398 |
| 6 | 1 | 70.5 | 88.9 | 18 / 35 | 6072 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 67 | 48% |
| jje.BagPuss 1.2 | 32 | 69% |
| myl.nano.Graviton 1.10 | 24 | 92% |
| sul.Lunar 1.1 | 23 | 87% |
| pez.mini.ChironexFleckeri 0.5 | 15 | 93% |
| wit.Deep7 2.0 | 4 | 100% |
| fm.claire 1.7 | 3 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 1728. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 35 | 37% | 0 |
| jje.BagPuss 1.2 | 24 | 26% | 67 |
| sul.Lunar 1.1 | 15 | 16% | 52 |
| myl.nano.Graviton 1.10 | 9 | 10% | 27 |
| fm.claire 1.7 | 4 | 4% | 17 |
| pez.mini.ChironexFleckeri 0.5 | 3 | 3% | 23 |
| wit.Deep7 2.0 | 2 | 2% | 14 |
| hvilela.HVilela 0.9 | 1 | 1% | 8 |
| abud.ThirdRobo 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 210717 melee ticks, 86930 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 48 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 4.

Targeting waves (202 rounds): 61729 sent, 57119 reached their opponent, 8527 virtual hits (14.9% of those reached).

## Melee bench: F46

hadur117.Hadur 3.20wm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 686 over 6 battles (114.3 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 81.2 | 46 / 210 | 2.69 | 16.0% | 24844 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.3 | 17.2% | 89 |
| kc.mini.Mirage 0.2 | 2.0 | 16.8% | 62 |
| hadur117.Hadur 3.20wm | 2.7 | 16.0% | 46 |
| mz.MicroSheep 1.0 | 4.5 | 10.7% | 2 |
| cx.Princess 1.0 | 5.2 | 9.4% | 11 |
| sadoner.killer 0.2 | 5.5 | 9.2% | 1 |
| arthord.NanoSatanMelee Beta | 6.8 | 7.1% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.5% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.8 | 80.0 | 6 / 35 | 4265 |
| 2 | 2 | 66.0 | 84.4 | 7 / 35 | 4169 |
| 3 | 3 | 65.2 | 81.9 | 7 / 35 | 3926 |
| 4 | 3 | 64.7 | 79.0 | 9 / 35 | 4148 |
| 5 | 2 | 65.9 | 83.2 | 8 / 35 | 4241 |
| 6 | 3 | 65.0 | 78.7 | 9 / 35 | 4095 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 58 | 50% |
| rsalesc.melee.Medina 0.4.5 | 43 | 26% |
| cx.Princess 1.0 | 10 | 50% |
| mz.MicroSheep 1.0 | 1 | 0% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 975. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 67 | 39% | 78 |
| kc.mini.Mirage 0.2 | 63 | 37% | 90 |
| cx.Princess 1.0 | 14 | 8% | 18 |
| mz.MicroSheep 1.0 | 6 | 4% | 9 |
| sadoner.killer 0.2 | 5 | 3% | 6 |
| arthord.NanoSatanMelee Beta | 5 | 3% | 5 |
| kurios.DOSexe .9a | 2 | 1% | 2 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 160162 melee ticks, 46759 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 678 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 209 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 2.

Targeting waves (207 rounds): 45538 sent, 40728 reached their opponent, 6174 virtual hits (15.2% of those reached).

