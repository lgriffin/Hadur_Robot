# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 236 over 6 battles (39.3 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 86.8 | 51 / 210 | 2.19 | 17.9% | 33627 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.8% | 141 |
| hadur117.Hadur 3.20dm | 2.0 | 17.9% | 51 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.5 | 11.4% | 2 |
| sgp.JollyNinja 3.53 | 3.7 | 11.5% | 11 |
| lorneswork.Predator 1.0 | 5.3 | 9.9% | 3 |
| mz.MicroGodMelee 1 | 5.5 | 9.6% | 1 |
| adt.Ar2 1.0 | 7.0 | 7.2% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.5% | 1 |
| skm.butterfly 1.0 | 9.2 | 4.0% | 0 |
| mym.EdgeStalker 1.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.2 | 83.2 | 4 / 35 | 5731 |
| 2 | 2 | 69.1 | 89.2 | 9 / 35 | 5822 |
| 3 | 2 | 68.7 | 89.8 | 8 / 35 | 5446 |
| 4 | 2 | 68.1 | 87.3 | 9 / 35 | 5495 |
| 5 | 2 | 67.6 | 85.4 | 10 / 35 | 5529 |
| 6 | 2 | 68.1 | 86.0 | 11 / 35 | 5604 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 133 | 14% |
| sgp.JollyNinja 3.53 | 14 | 71% |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 100% |
| mz.MicroGodMelee 1 | 5 | 80% |
| lorneswork.Predator 1.0 | 5 | 100% |
| adt.Ar2 1.0 | 3 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 1210. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 128 | 80% | 147 |
| sgp.JollyNinja 3.53 | 12 | 8% | 22 |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 4% | 16 |
| lorneswork.Predator 1.0 | 5 | 3% | 9 |
| mz.MicroGodMelee 1 | 4 | 3% | 8 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 3 |
| adt.Ar2 1.0 | 1 | 1% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 137671 melee ticks, 99406 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 49 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 44286 sent, 39581 reached their opponent, 7920 virtual hits (20.0% of those reached).

## Melee bench: F02

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 156 over 6 battles (26.0 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.4 | 95 / 210 | 2.31 | 18.4% | 30105 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 18.4% | 95 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 13.8% | 49 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 13.5% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 11.3% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.4% | 16 |
| fnc.bandit.Bandit 5.2.0 | 6.3 | 8.3% | 1 |
| Noran.BitchingElk 0.054 | 7.2 | 7.9% | 14 |
| sch.Simone 0.3d | 7.7 | 7.5% | 3 |
| stelo.PatternRobot 1.0 | 8.8 | 5.6% | 4 |
| fullsail.SweetTea 1.1 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 80.6 | 15 / 35 | 5287 |
| 2 | 1 | 69.2 | 89.8 | 18 / 35 | 4864 |
| 3 | 1 | 66.2 | 80.6 | 11 / 35 | 4719 |
| 4 | 1 | 69.8 | 91.4 | 19 / 35 | 5407 |
| 5 | 1 | 68.3 | 85.1 | 18 / 35 | 5024 |
| 6 | 1 | 67.1 | 84.8 | 14 / 35 | 4804 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 45 | 67% |
| pulsar.PulsarMax 0.8.9 | 45 | 51% |
| com.cohesiva.robocode.ManOwaR 1.0 | 23 | 48% |
| Noran.BitchingElk 0.054 | 15 | 40% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 82% |
| sch.Simone 0.3d | 10 | 100% |
| fnc.bandit.Bandit 5.2.0 | 7 | 86% |

Hadur died in 116 of 210 rounds, at a mean tick of 1013. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 33 | 28% | 55 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 25 | 22% | 56 |
| com.cohesiva.robocode.ManOwaR 1.0 | 22 | 19% | 32 |
| Noran.BitchingElk 0.054 | 12 | 10% | 19 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 9% | 14 |
| stelo.PatternRobot 1.0 | 5 | 4% | 5 |
| sch.Simone 0.3d | 4 | 3% | 16 |
| fnc.bandit.Bandit 5.2.0 | 3 | 3% | 10 |
| fullsail.SweetTea 1.1 | 1 | 1% | 1 |

Posture (Hadur's M records, 205 rounds): 171415 melee ticks, 39923 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 31 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 59967 sent, 55225 reached their opponent, 9455 virtual hits (17.1% of those reached).

## Melee bench: F03

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 153 over 6 battles (25.5 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 93.5 | 176 / 210 | 1.59 | 21.1% | 39197 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 21.1% | 176 |
| radnor.DoctorBob 1.42 | 2.0 | 13.8% | 13 |
| kawigi.nano.Lib 1.0 | 3.5 | 12.0% | 6 |
| vuen.Cake 2.51 | 3.5 | 12.2% | 10 |
| urdos.URDOS 1.3 | 5.2 | 9.2% | 1 |
| adt.Ar1 2.1 | 6.0 | 8.0% | 1 |
| oa.weak.FlyMk1 0.1 | 7.2 | 6.8% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.7 | 6.6% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.5 | 5.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.5 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 90.5 | 28 / 35 | 6556 |
| 2 | 1 | 71.1 | 93.0 | 25 / 35 | 6384 |
| 3 | 1 | 71.7 | 94.3 | 31 / 35 | 6756 |
| 4 | 1 | 71.8 | 93.7 | 31 / 35 | 6467 |
| 5 | 1 | 71.6 | 94.9 | 30 / 35 | 6525 |
| 6 | 1 | 71.8 | 94.6 | 31 / 35 | 6509 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 68 | 94% |
| radnor.DoctorBob 1.42 | 66 | 98% |
| kawigi.nano.Lib 1.0 | 38 | 97% |
| oa.weak.FlyMk1 0.1 | 6 | 83% |
| urdos.URDOS 1.3 | 2 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 34 of 210 rounds, at a mean tick of 573. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 11 | 32% | 54 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 29% | 10 |
| kawigi.nano.Lib 1.0 | 6 | 18% | 46 |
| vuen.Cake 2.51 | 4 | 12% | 76 |
| oa.weak.FlyMk1 0.1 | 1 | 3% | 9 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 3% | 6 |
| urdos.URDOS 1.3 | 1 | 3% | 5 |
| adt.Ar1 2.1 | 0 | 0% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 121145 melee ticks, 42838 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 48 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 37784 sent, 33153 reached their opponent, 8633 virtual hits (26.0% of those reached).

## Melee bench: F04

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 404 over 6 battles (67.3 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 87.1 | 31 / 210 | 2.16 | 18.1% | 35803 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.1% | 158 |
| hadur117.Hadur 3.20dm | 2.0 | 18.1% | 31 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.3% | 12 |
| TNT.TNT 0.99.1 | 4.2 | 10.8% | 8 |
| josago.Jorgito 0.16 | 4.8 | 9.5% | 1 |
| css.Delitioner 0.11 | 6.2 | 7.3% | 0 |
| tj.zombie1n 1.0.1 | 7.0 | 6.2% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.3% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 3.9% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.2 | 84.8 | 6 / 35 | 5673 |
| 2 | 2 | 69.6 | 88.3 | 3 / 35 | 6239 |
| 3 | 2 | 69.7 | 87.9 | 7 / 35 | 6244 |
| 4 | 2 | 68.5 | 87.0 | 4 / 35 | 5811 |
| 5 | 2 | 69.9 | 89.2 | 7 / 35 | 6350 |
| 6 | 2 | 68.0 | 85.7 | 4 / 35 | 5486 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 132 | 10% |
| TNT.TNT 0.99.1 | 14 | 57% |
| apc.LeeroyJenkins2 1.0 | 12 | 42% |
| josago.Jorgito 0.16 | 4 | 75% |
| tj.zombie1n 1.0.1 | 2 | 100% |

Hadur died in 182 of 210 rounds, at a mean tick of 1349. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 137 | 75% | 151 |
| apc.LeeroyJenkins2 1.0 | 21 | 12% | 29 |
| TNT.TNT 0.99.1 | 13 | 7% | 18 |
| josago.Jorgito 0.16 | 6 | 3% | 10 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 194329 melee ticks, 82901 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 64 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 59234 sent, 54459 reached their opponent, 8195 virtual hits (15.0% of those reached).

## Melee bench: F05

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 617 over 6 battles (102.8 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 78.0 | 26 / 210 | 2.98 | 15.2% | 24070 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.7% | 116 |
| justin.DemonicRage 3.4 | 2.2 | 16.7% | 48 |
| hadur117.Hadur 3.20dm | 2.8 | 15.2% | 26 |
| wompi.Numbat 2.1 | 4.0 | 12.3% | 11 |
| axeBots.HataMoto 3.09 | 5.3 | 9.4% | 9 |
| ms.Ares 0.19 | 5.7 | 8.9% | 0 |
| supersample.SuperBoxBot 1.0 | 7.2 | 5.9% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.2 | 4.9% | 0 |
| GarmBox.Oranges 1.0 | 9.2 | 4.2% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.1 | 82.9 | 6 / 35 | 4255 |
| 2 | 3 | 65.3 | 81.6 | 5 / 35 | 4054 |
| 3 | 3 | 63.8 | 75.2 | 6 / 35 | 4073 |
| 4 | 3 | 64.8 | 80.0 | 3 / 35 | 4217 |
| 5 | 3 | 61.8 | 72.1 | 2 / 35 | 3621 |
| 6 | 3 | 63.6 | 76.5 | 4 / 35 | 3850 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 46 | 9% |
| justin.DemonicRage 3.4 | 30 | 37% |
| axeBots.HataMoto 3.09 | 9 | 67% |
| wompi.Numbat 2.1 | 8 | 63% |

Hadur died in 189 of 210 rounds, at a mean tick of 924. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 70 | 37% | 74 |
| justin.DemonicRage 3.4 | 60 | 32% | 72 |
| wompi.Numbat 2.1 | 31 | 16% | 35 |
| axeBots.HataMoto 3.09 | 11 | 6% | 15 |
| ms.Ares 0.19 | 5 | 3% | 5 |
| GarmBox.Oranges 1.0 | 3 | 2% | 3 |
| supersample.SuperBoxBot 1.0 | 3 | 2% | 3 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 1% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 157921 melee ticks, 35745 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 88 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 88 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 48569 sent, 43518 reached their opponent, 7168 virtual hits (16.5% of those reached).

## Melee bench: F06

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 210 over 6 battles (35.0 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 90.7 | 142 / 210 | 1.83 | 20.2% | 33163 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 20.2% | 142 |
| jekl.StoneGhost 0.7 | 2.2 | 14.5% | 15 |
| origin.SleepSiphon 1.7b | 2.8 | 13.8% | 32 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 11.8% | 10 |
| mld.Wisdom 1.0 | 5.0 | 10.4% | 5 |
| gg.Wolverine 2.0 | 6.0 | 8.6% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 6.7% | 6 |
| spinnercat.Omen 1.0 | 8.3 | 5.9% | 0 |
| DBall.NUKE 0.1 | 8.5 | 5.6% | 0 |
| sample.Fire 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 94.6 | 27 / 35 | 5543 |
| 2 | 1 | 71.6 | 92.1 | 24 / 35 | 6006 |
| 3 | 1 | 71.2 | 91.7 | 24 / 35 | 5449 |
| 4 | 1 | 70.0 | 87.6 | 22 / 35 | 5543 |
| 5 | 1 | 69.7 | 89.5 | 20 / 35 | 5041 |
| 6 | 1 | 70.7 | 88.9 | 25 / 35 | 5581 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 70 | 97% |
| origin.SleepSiphon 1.7b | 52 | 81% |
| pe.minimelee.SandboxMiniMelee 1.1 | 20 | 80% |
| gg.Wolverine 2.0 | 10 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 20% |
| DBall.NUKE 0.1 | 3 | 100% |
| mld.Wisdom 1.0 | 3 | 67% |

Hadur died in 71 of 210 rounds, at a mean tick of 885. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 28 | 39% | 67 |
| jekl.StoneGhost 0.7 | 15 | 21% | 71 |
| mld.Wisdom 1.0 | 11 | 15% | 17 |
| pe.minimelee.SandboxMiniMelee 1.1 | 8 | 11% | 34 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 6% | 6 |
| gg.Wolverine 2.0 | 2 | 3% | 9 |
| spinnercat.Omen 1.0 | 1 | 1% | 1 |
| DBall.NUKE 0.1 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 149627 melee ticks, 41793 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 49 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 45841 sent, 41172 reached their opponent, 8790 virtual hits (21.3% of those reached).

## Melee bench: F07

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 538 over 6 battles (89.7 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.1 | 94.1 | 128 / 210 | 1.53 | 21.3% | 40528 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 21.3% | 128 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 16.6% | 45 |
| rtk.Tachikoma 1.0 | 2.7 | 16.0% | 22 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.1% | 8 |
| franzor.Lizt 1.3.1 | 4.7 | 10.5% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.4% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 8.0% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.4% | 0 |
| sample.Target 1.0 | 9.2 | 2.1% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 92.4 | 18 / 35 | 6561 |
| 2 | 1 | 73.4 | 94.9 | 22 / 35 | 6710 |
| 3 | 1 | 73.3 | 94.9 | 22 / 35 | 6912 |
| 4 | 1 | 73.6 | 96.2 | 25 / 35 | 6994 |
| 5 | 1 | 73.0 | 94.0 | 21 / 35 | 6640 |
| 6 | 1 | 72.7 | 92.4 | 20 / 35 | 6711 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 86 | 80% |
| rsalesc.melee.Monk 0.3.6c | 57 | 30% |
| oog.melee.CapuletDroid 1.1 | 27 | 85% |
| franzor.Lizt 1.3.1 | 20 | 85% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 1466. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 44 | 51% | 70 |
| rtk.Tachikoma 1.0 | 24 | 28% | 92 |
| oog.melee.CapuletDroid 1.1 | 9 | 10% | 35 |
| franzor.Lizt 1.3.1 | 3 | 3% | 2 |
| exauge.GateKeeper 1.1.121g | 2 | 2% | 7 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 179959 melee ticks, 101794 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 837 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 319 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 54703 sent, 49889 reached their opponent, 9878 virtual hits (19.8% of those reached).

## Melee bench: F08

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 624 over 6 battles (104.0 per battle, most in one battle 147). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 91.0 | 126 / 210 | 1.81 | 19.6% | 30890 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 19.6% | 126 |
| shrub.Vapour v159 | 2.8 | 12.6% | 23 |
| tm.Yuugao 1.0 | 3.0 | 12.7% | 22 |
| Krabb.sliNk.Garm 0.9u | 3.3 | 12.3% | 25 |
| com.spp.robocode.MostlyHarmless 010 | 5.2 | 9.2% | 9 |
| m3thos.Eva00 1.1 | 5.8 | 9.1% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 6.8 | 7.8% | 4 |
| qualidafial.MajorDick 1.0.1 | 8.2 | 6.7% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.2 | 5.4% | 0 |
| SHAM.WOW 1.4 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 90.5 | 18 / 35 | 4852 |
| 2 | 1 | 68.5 | 87.6 | 17 / 35 | 5083 |
| 3 | 1 | 70.3 | 92.1 | 24 / 35 | 5610 |
| 4 | 1 | 69.8 | 92.7 | 23 / 35 | 4965 |
| 5 | 1 | 69.7 | 90.8 | 24 / 35 | 5222 |
| 6 | 1 | 70.1 | 92.1 | 20 / 35 | 5158 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 48 | 73% |
| Krabb.sliNk.Garm 0.9u | 38 | 68% |
| shrub.Vapour v159 | 36 | 72% |
| jwst.DAD.DarkAndDarker 1.1 | 16 | 81% |
| com.spp.robocode.MostlyHarmless 010 | 14 | 86% |
| m3thos.Eva00 1.1 | 11 | 91% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 902. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| Krabb.sliNk.Garm 0.9u | 27 | 31% | 43 |
| tm.Yuugao 1.0 | 19 | 22% | 59 |
| shrub.Vapour v159 | 19 | 22% | 47 |
| com.spp.robocode.MostlyHarmless 010 | 8 | 9% | 20 |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 7% | 16 |
| m3thos.Eva00 1.1 | 4 | 5% | 13 |
| SHAM.WOW 1.4 | 1 | 1% | 4 |
| zyx.nano.BacillusComma 1.0 | 0 | 0% | 5 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 149145 melee ticks, 46280 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 80 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 48584 sent, 43667 reached their opponent, 7976 virtual hits (18.3% of those reached).

## Melee bench: F09

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 536 over 6 battles (89.3 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 79.2 | 65 / 210 | 2.87 | 16.1% | 23140 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.9% | 97 |
| hadur117.Hadur 3.20dm | 2.0 | 16.1% | 65 |
| kc.micro.Figment 1.0 | 2.8 | 13.9% | 22 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.4% | 9 |
| yagami.Tidus 0.11 | 4.8 | 10.2% | 1 |
| mc2.enemy.Original 0.9 | 5.7 | 9.3% | 14 |
| dft.Calliope 5.6 | 6.8 | 7.7% | 1 |
| step.nanoPri 1.0 | 8.2 | 5.7% | 1 |
| rdm.Dueler 0.4x | 9.3 | 4.4% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 84.8 | 15 / 35 | 4486 |
| 2 | 2 | 63.7 | 74.6 | 9 / 35 | 3570 |
| 3 | 3 | 63.3 | 74.3 | 10 / 35 | 3508 |
| 4 | 2 | 64.7 | 78.4 | 11 / 35 | 3834 |
| 5 | 2 | 64.0 | 78.7 | 8 / 35 | 3701 |
| 6 | 2 | 66.7 | 84.4 | 12 / 35 | 4041 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 63 | 35% |
| kc.micro.Figment 1.0 | 25 | 88% |
| mc2.enemy.Original 0.9 | 10 | 50% |
| dft.Calliope 5.6 | 7 | 100% |
| yagami.Tidus 0.11 | 5 | 100% |
| pedersen.Grishnakh 1.0 | 4 | 50% |
| step.nanoPri 1.0 | 1 | 100% |
| rdm.Dueler 0.4x | 1 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 892. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 64 | 43% | 87 |
| kc.micro.Figment 1.0 | 26 | 17% | 46 |
| mc2.enemy.Original 0.9 | 23 | 15% | 29 |
| yagami.Tidus 0.11 | 9 | 6% | 16 |
| pedersen.Grishnakh 1.0 | 8 | 5% | 10 |
| dft.Calliope 5.6 | 5 | 3% | 11 |
| robar.nano.Assertive_Melee 0.2 | 4 | 3% | 4 |
| step.nanoPri 1.0 | 3 | 2% | 4 |
| rdm.Dueler 0.4x | 3 | 2% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 152863 melee ticks, 44168 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 58 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 49573 sent, 44858 reached their opponent, 6511 virtual hits (14.5% of those reached).

## Melee bench: F10

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 672 over 6 battles (112.0 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 93.3 | 161 / 210 | 1.60 | 20.4% | 34416 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 20.4% | 161 |
| DTF.Kludgy 1.2b | 2.2 | 14.4% | 23 |
| ne.Chimera 1.2 | 3.2 | 13.1% | 7 |
| ejb.Polaris 1.0.1 | 3.8 | 12.2% | 7 |
| vStar.RAFzilla 2.15 | 5.3 | 10.5% | 7 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.2% | 4 |
| kurios.DOSexe .9b | 7.8 | 5.3% | 0 |
| sam.Samspin 1.0 | 8.2 | 5.1% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.3 | 4.8% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 89.2 | 24 / 35 | 5255 |
| 2 | 1 | 71.8 | 96.2 | 29 / 35 | 5741 |
| 3 | 1 | 71.2 | 94.0 | 25 / 35 | 5852 |
| 4 | 1 | 71.2 | 94.0 | 27 / 35 | 5910 |
| 5 | 1 | 70.5 | 92.4 | 27 / 35 | 5536 |
| 6 | 1 | 71.9 | 94.0 | 29 / 35 | 6122 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 58 | 83% |
| ejb.Polaris 1.0.1 | 44 | 93% |
| ne.Chimera 1.2 | 41 | 95% |
| vStar.RAFzilla 2.15 | 20 | 75% |
| tvv.micro.Antares 1.1.1 | 16 | 88% |
| kurios.DOSexe .9b | 3 | 100% |
| donjezza.Muncho 1.0 | 2 | 50% |

Hadur died in 54 of 210 rounds, at a mean tick of 924. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 20 | 37% | 73 |
| ne.Chimera 1.2 | 8 | 15% | 41 |
| vStar.RAFzilla 2.15 | 7 | 13% | 20 |
| ejb.Polaris 1.0.1 | 4 | 7% | 47 |
| tvv.micro.Antares 1.1.1 | 4 | 7% | 14 |
| kurios.DOSexe .9b | 3 | 6% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 4% | 3 |
| donjezza.Muncho 1.0 | 1 | 2% | 1 |
| sam.Samspin 1.0 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 143729 melee ticks, 56901 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 91 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 91 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 46614 sent, 42029 reached their opponent, 7882 virtual hits (18.8% of those reached).

## Melee bench: F11

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 242 over 6 battles (40.3 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 82.9 | 78 / 210 | 2.54 | 16.8% | 24025 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.3 | 16.8% | 78 |
| rz.Aleph 0.34 | 1.7 | 16.3% | 66 |
| cx.mini.Nimrod 0.55 | 3.3 | 12.4% | 19 |
| djc.DynaBot 0.1.1 | 3.8 | 10.9% | 16 |
| rdt199.Warlord 0.73 | 5.5 | 9.0% | 12 |
| br2.MobyDickBot 1.6 | 5.8 | 8.8% | 10 |
| uji.YellohFellah 1.0 | 6.5 | 8.4% | 10 |
| KiraNL.Chupacabra 0.4 | 8.0 | 7.2% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.0 | 5.6% | 0 |
| stelo.MirrorNano 1.3 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 81.9 | 14 / 35 | 4088 |
| 2 | 2 | 63.3 | 77.8 | 9 / 35 | 3618 |
| 3 | 1 | 65.6 | 83.2 | 11 / 35 | 4161 |
| 4 | 1 | 66.4 | 85.7 | 15 / 35 | 3924 |
| 5 | 1 | 66.6 | 83.5 | 17 / 35 | 4281 |
| 6 | 2 | 66.1 | 85.4 | 12 / 35 | 3953 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 55 | 47% |
| cx.mini.Nimrod 0.55 | 18 | 78% |
| djc.DynaBot 0.1.1 | 17 | 76% |
| uji.YellohFellah 1.0 | 13 | 85% |
| rdt199.Warlord 0.73 | 10 | 70% |
| br2.MobyDickBot 1.6 | 9 | 44% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |
| KiraNL.Chupacabra 0.4 | 1 | 0% |

Hadur died in 134 of 210 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 57 | 43% | 79 |
| cx.mini.Nimrod 0.55 | 25 | 19% | 34 |
| br2.MobyDickBot 1.6 | 12 | 9% | 18 |
| rdt199.Warlord 0.73 | 11 | 8% | 19 |
| djc.DynaBot 0.1.1 | 10 | 7% | 25 |
| uji.YellohFellah 1.0 | 8 | 6% | 15 |
| KiraNL.Chupacabra 0.4 | 5 | 4% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 1% | 7 |
| stelo.MirrorNano 1.3 | 2 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 159887 melee ticks, 37592 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 42 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 51310 sent, 46505 reached their opponent, 6383 virtual hits (13.7% of those reached).

## Melee bench: F12

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 460 over 6 battles (76.7 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 86.9 | 118 / 210 | 2.18 | 18.2% | 24433 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 18.2% | 118 |
| bts.wiki.RipCurl 0.9b | 2.5 | 13.5% | 31 |
| nat.PallasHawk 1.0 | 2.8 | 13.5% | 31 |
| darkcanuck.Leon 1.01 | 3.7 | 12.6% | 16 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.8% | 10 |
| jrm.Test0 1.0 | 6.3 | 7.9% | 0 |
| cs.sheldor.Talon 1.1 | 6.8 | 7.0% | 0 |
| jp.Perpy 16.0 | 8.3 | 6.0% | 1 |
| jaybot.bots.Oddball 4.0 | 9.0 | 5.6% | 3 |
| stuff.Vlad 0.1 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 79.0 | 15 / 35 | 4136 |
| 2 | 1 | 67.3 | 85.7 | 17 / 35 | 4093 |
| 3 | 1 | 68.1 | 87.3 | 23 / 35 | 3950 |
| 4 | 1 | 66.9 | 85.7 | 20 / 35 | 3899 |
| 5 | 1 | 68.5 | 91.1 | 19 / 35 | 4180 |
| 6 | 1 | 69.4 | 92.7 | 24 / 35 | 4175 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 42 | 76% |
| darkcanuck.Leon 1.01 | 41 | 80% |
| bts.wiki.RipCurl 0.9b | 41 | 71% |
| brainfade.melee.Genghis 0.36 | 17 | 94% |
| jaybot.bots.Oddball 4.0 | 6 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| jrm.Test0 1.0 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 24 | 25% | 48 |
| darkcanuck.Leon 1.01 | 20 | 21% | 59 |
| nat.PallasHawk 1.0 | 19 | 20% | 54 |
| brainfade.melee.Genghis 0.36 | 13 | 14% | 21 |
| jrm.Test0 1.0 | 9 | 9% | 12 |
| jaybot.bots.Oddball 4.0 | 4 | 4% | 5 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 7 |
| jp.Perpy 16.0 | 1 | 1% | 2 |
| stuff.Vlad 0.1 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 133711 melee ticks, 38262 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 41 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 45219 sent, 40348 reached their opponent, 6855 virtual hits (17.0% of those reached).

## Melee bench: F13

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 97 over 6 battles (16.2 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 82.1 | 63 / 210 | 2.61 | 16.1% | 25608 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.7 | 16.6% | 45 |
| hadur117.Hadur 3.20dm | 2.0 | 16.1% | 63 |
| mn.Combat 3.25.0 | 2.3 | 15.9% | 74 |
| shinh.Entangled 0.3 | 4.3 | 12.1% | 19 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.6% | 8 |
| apc.Colossus2 0.17 | 6.2 | 7.7% | 0 |
| stelo.Wang 1.0 | 6.8 | 6.9% | 2 |
| maribo.FollowFire 1 | 8.5 | 5.0% | 0 |
| ayk.WallHugger 1.0 | 8.5 | 4.9% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 87.9 | 13 / 35 | 4547 |
| 2 | 2 | 65.3 | 81.0 | 10 / 35 | 4212 |
| 3 | 2 | 64.1 | 79.4 | 8 / 35 | 4210 |
| 4 | 3 | 64.6 | 78.4 | 8 / 35 | 4376 |
| 5 | 3 | 65.0 | 81.0 | 11 / 35 | 3998 |
| 6 | 1 | 66.3 | 84.8 | 13 / 35 | 4265 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 56 | 70% |
| mn.Combat 3.25.0 | 46 | 20% |
| shinh.Entangled 0.3 | 12 | 67% |
| gh.micro.Gruweltje 0.7 | 5 | 60% |
| stelo.Wang 1.0 | 3 | 100% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 892. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 51 | 34% | 66 |
| ags.Glacier 0.2.11 | 47 | 32% | 77 |
| shinh.Entangled 0.3 | 22 | 15% | 33 |
| gh.micro.Gruweltje 0.7 | 13 | 9% | 17 |
| stelo.Wang 1.0 | 9 | 6% | 11 |
| maribo.FollowFire 1 | 5 | 3% | 5 |
| apc.Colossus2 0.17 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 148659 melee ticks, 47354 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 156 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 156 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 43556 sent, 38463 reached their opponent, 6048 virtual hits (15.7% of those reached).

## Melee bench: F14

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 142 over 6 battles (23.7 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 94.9 | 162 / 210 | 1.46 | 21.1% | 35986 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 21.1% | 162 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.8% | 8 |
| catcat20.shape.Theta 0.018 | 3.0 | 13.2% | 31 |
| Lo_Ian.Gandalf_V4 4.0 | 4.3 | 9.8% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.5 | 9.1% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 5.5 | 9.1% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 8.0% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.5 | 7.7% | 0 |
| pa.Improved 1.0 | 9.0 | 5.6% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 94.9 | 25 / 35 | 5958 |
| 2 | 1 | 72.6 | 96.8 | 29 / 35 | 5986 |
| 3 | 1 | 71.7 | 95.9 | 26 / 35 | 6008 |
| 4 | 1 | 70.9 | 91.7 | 24 / 35 | 6027 |
| 5 | 1 | 71.8 | 94.9 | 30 / 35 | 5811 |
| 6 | 1 | 72.4 | 95.2 | 28 / 35 | 6196 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 85 | 98% |
| catcat20.shape.Theta 0.018 | 71 | 69% |
| sanyi.mikrobi.Roberto 1.0 | 18 | 94% |
| co.edu.usb.rc.LidisTron 1.0 | 7 | 86% |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 100% |
| pa.Improved 1.0 | 2 | 50% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 50% |

Hadur died in 48 of 210 rounds, at a mean tick of 962. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 25 | 52% | 61 |
| simonton.micro.Sprout 1.1.3 | 12 | 25% | 90 |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 6% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 6% | 9 |
| sanyi.mikrobi.Roberto 1.0 | 2 | 4% | 25 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 2% | 6 |
| pa.Improved 1.0 | 1 | 2% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 3 |

Posture (Hadur's M records, 200 rounds): 139909 melee ticks, 52299 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 32 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 5.

Targeting waves (200 rounds): 43732 sent, 39225 reached their opponent, 9490 virtual hits (24.2% of those reached).

## Melee bench: F15

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 231 over 6 battles (38.5 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 91.7 | 142 / 210 | 1.74 | 20.4% | 33461 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 20.4% | 142 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.4% | 14 |
| mld.DustBunny 3.8 | 3.0 | 13.0% | 4 |
| emp.Yngwie 1.11 | 3.7 | 12.2% | 32 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.2% | 10 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.0% | 8 |
| Grystrion.TrackerWO 1.0 | 7.3 | 6.4% | 0 |
| lambdaxy.TBot 0.1 | 7.7 | 6.3% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 4.6% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 94.9 | 27 / 35 | 5971 |
| 2 | 1 | 72.7 | 96.2 | 30 / 35 | 6111 |
| 3 | 1 | 69.6 | 90.8 | 18 / 35 | 5155 |
| 4 | 1 | 71.6 | 94.3 | 25 / 35 | 5799 |
| 5 | 1 | 70.0 | 90.2 | 23 / 35 | 5355 |
| 6 | 1 | 68.1 | 84.1 | 19 / 35 | 5070 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 53 | 64% |
| kawigi.micro.Shiz 1.1 | 43 | 91% |
| mld.DustBunny 3.8 | 40 | 98% |
| cb.nano.Insomnia 1.0 | 17 | 88% |
| kawigi.robot.Girl 1.2 | 15 | 73% |
| divineomega.TrialBot 0.003 | 3 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 1029. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 31 | 45% | 79 |
| kawigi.micro.Shiz 1.1 | 11 | 16% | 45 |
| cb.nano.Insomnia 1.0 | 8 | 12% | 16 |
| kawigi.robot.Girl 1.2 | 8 | 12% | 15 |
| mld.DustBunny 3.8 | 6 | 9% | 31 |
| divineomega.TrialBot 0.003 | 1 | 1% | 11 |
| Grystrion.TrackerWO 1.0 | 1 | 1% | 5 |
| lambdaxy.TBot 0.1 | 1 | 1% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 163443 melee ticks, 51137 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 135 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 135 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 2.

Targeting waves (201 rounds): 52924 sent, 48272 reached their opponent, 7886 virtual hits (16.3% of those reached).

## Melee bench: F16

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 774 over 6 battles (129.0 per battle, most in one battle 142). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 89.9 | 123 / 210 | 1.91 | 20.1% | 35000 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 20.1% | 123 |
| gh.Griezel 0.5.2 | 2.0 | 16.1% | 46 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.2% | 11 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 10.5% | 23 |
| bvh.fnr.Fenrir 0.36l | 5.2 | 9.0% | 1 |
| tvv.nano.Polaris 1.2 | 5.7 | 8.6% | 2 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.3% | 3 |
| repositorio.NanoStep 1.0 | 8.8 | 4.8% | 0 |
| asd.Cthulhu 1.3 | 8.8 | 4.7% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.3 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 92.4 | 24 / 35 | 6457 |
| 2 | 1 | 71.1 | 91.4 | 23 / 35 | 5995 |
| 3 | 1 | 69.4 | 87.0 | 18 / 35 | 5497 |
| 4 | 1 | 70.5 | 90.8 | 19 / 35 | 5802 |
| 5 | 1 | 70.1 | 90.5 | 18 / 35 | 5716 |
| 6 | 1 | 69.9 | 87.3 | 21 / 35 | 5533 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 91 | 67% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 31 | 87% |
| techdude.forest.FlamingForest 1.1 | 31 | 65% |
| bvh.fnr.Fenrir 0.36l | 6 | 83% |
| tvv.nano.Polaris 1.2 | 5 | 100% |
| divineomega.DivineBot 1.9.4.5 | 3 | 67% |
| stelo.IntrinsicVolatility 1.4 | 3 | 67% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 1199. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 36 | 38% | 102 |
| techdude.forest.FlamingForest 1.1 | 17 | 18% | 38 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 10 | 11% | 28 |
| bvh.fnr.Fenrir 0.36l | 7 | 7% | 11 |
| stelo.IntrinsicVolatility 1.4 | 6 | 6% | 8 |
| tvv.nano.Polaris 1.2 | 4 | 4% | 11 |
| asd.Cthulhu 1.3 | 4 | 4% | 4 |
| divineomega.DivineBot 1.9.4.5 | 3 | 3% | 8 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 177362 melee ticks, 69040 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 48 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 56538 sent, 51779 reached their opponent, 8720 virtual hits (16.8% of those reached).

## Melee bench: F17

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 447 over 6 battles (74.5 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 87.9 | 117 / 210 | 2.09 | 19.6% | 35140 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 19.6% | 117 |
| et.Predator 1.8 | 2.5 | 13.9% | 25 |
| oog.melee.Mercutio 1.0 | 2.7 | 13.4% | 27 |
| cx.BlestPain 1.41 | 4.0 | 12.0% | 34 |
| ahf.NanoAndrew .4 | 4.8 | 10.3% | 5 |
| nic.Nicator 2.4 | 6.2 | 8.6% | 2 |
| maribo.melee.BMV 0.1 | 6.8 | 8.0% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 6.0% | 0 |
| tex.Longbot 0.4 | 8.7 | 5.7% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 89.2 | 17 / 35 | 6199 |
| 2 | 1 | 70.5 | 89.2 | 22 / 35 | 5965 |
| 3 | 1 | 70.0 | 87.9 | 20 / 35 | 5921 |
| 4 | 1 | 69.7 | 87.9 | 21 / 35 | 5713 |
| 5 | 1 | 68.2 | 83.5 | 18 / 35 | 5429 |
| 6 | 1 | 70.3 | 89.5 | 19 / 35 | 5913 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 58 | 84% |
| et.Predator 1.8 | 52 | 75% |
| cx.BlestPain 1.41 | 26 | 31% |
| ahf.NanoAndrew .4 | 14 | 86% |
| nic.Nicator 2.4 | 4 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |
| maribo.melee.BMV 0.1 | 2 | 100% |
| goblin.Bender 2.4 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 1054. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 30 | 31% | 46 |
| et.Predator 1.8 | 26 | 27% | 56 |
| oog.melee.Mercutio 1.0 | 16 | 16% | 64 |
| ahf.NanoAndrew .4 | 12 | 12% | 23 |
| maribo.melee.BMV 0.1 | 6 | 6% | 8 |
| nic.Nicator 2.4 | 3 | 3% | 6 |
| tex.Longbot 0.4 | 1 | 1% | 2 |
| goblin.Bender 2.4 | 0 | 0% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 166564 melee ticks, 59473 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 64 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 54117 sent, 49180 reached their opponent, 10441 virtual hits (21.2% of those reached).

## Melee bench: F18

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 891 over 6 battles (148.5 per battle, most in one battle 160). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 90.1 | 135 / 210 | 1.89 | 19.6% | 30318 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 19.6% | 135 |
| agd.Mooserwirt2 2.7 | 2.5 | 13.0% | 23 |
| morbid.MorbidPriest 1.0 | 2.7 | 13.4% | 26 |
| uji.DBH 1.1 | 3.8 | 11.3% | 13 |
| sigterm.Sigterm 1.0 | 6.0 | 8.6% | 8 |
| spinnercat.Robovirus 2.718 | 6.2 | 8.2% | 2 |
| ratosh.Nobo 0.21 | 6.3 | 8.1% | 1 |
| kawigi.mini.Fhqwhgads 1.1 | 7.5 | 7.4% | 2 |
| stelo.WangRobot 1.0 | 9.3 | 5.3% | 0 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 92.1 | 20 / 35 | 5278 |
| 2 | 1 | 69.9 | 90.2 | 26 / 35 | 5140 |
| 3 | 1 | 70.6 | 91.7 | 25 / 35 | 5365 |
| 4 | 1 | 69.2 | 91.1 | 23 / 35 | 4774 |
| 5 | 1 | 68.5 | 86.7 | 21 / 35 | 4952 |
| 6 | 1 | 68.7 | 88.9 | 20 / 35 | 4809 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 58 | 78% |
| agd.Mooserwirt2 2.7 | 43 | 77% |
| uji.DBH 1.1 | 28 | 79% |
| sigterm.Sigterm 1.0 | 17 | 76% |
| spinnercat.Robovirus 2.718 | 7 | 100% |
| ratosh.Nobo 0.21 | 6 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 80% |
| stelo.WangRobot 1.0 | 4 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 19 | 23% | 70 |
| agd.Mooserwirt2 2.7 | 18 | 22% | 47 |
| uji.DBH 1.1 | 16 | 20% | 35 |
| sigterm.Sigterm 1.0 | 8 | 10% | 19 |
| kawigi.mini.Fhqwhgads 1.1 | 7 | 9% | 11 |
| ratosh.Nobo 0.21 | 4 | 5% | 13 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 2% | 2 |
| spinnercat.Robovirus 2.718 | 1 | 1% | 5 |
| stelo.WangRobot 1.0 | 0 | 0% | 7 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 136208 melee ticks, 52153 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 48 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 3.

Targeting waves (204 rounds): 45559 sent, 40576 reached their opponent, 8594 virtual hits (21.2% of those reached).

## Melee bench: F19

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 207 over 6 battles (34.5 per battle, most in one battle 114). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.7 | 98.7 | 198 / 210 | 1.11 | 22.6% | 37603 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 22.6% | 198 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.7% | 6 |
| mld.Infinity 2.2 | 3.3 | 12.1% | 0 |
| krillr.mini.JointStrike 2.0.0 | 3.8 | 11.3% | 4 |
| erdnis.Rover 0.3 | 4.8 | 10.7% | 2 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.6% | 0 |
| mbh.Mbh 0.1 | 7.0 | 7.3% | 0 |
| pac.ABC 2.1 | 8.3 | 6.1% | 0 |
| pbg.R2D2 1.0 | 8.7 | 5.7% | 0 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 97.8 | 32 / 35 | 5855 |
| 2 | 1 | 74.8 | 100.0 | 35 / 35 | 6905 |
| 3 | 1 | 73.8 | 99.7 | 34 / 35 | 6090 |
| 4 | 1 | 73.9 | 99.4 | 33 / 35 | 6348 |
| 5 | 1 | 72.3 | 95.6 | 29 / 35 | 5685 |
| 6 | 1 | 74.6 | 100.0 | 35 / 35 | 6720 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 116 | 97% |
| mld.Infinity 2.2 | 30 | 100% |
| krillr.mini.JointStrike 2.0.0 | 26 | 85% |
| erdnis.Rover 0.3 | 12 | 100% |
| patson.PatsonTestBot 1.0 | 11 | 100% |
| pac.ABC 2.1 | 7 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 14 of 210 rounds, at a mean tick of 854. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| krillr.mini.JointStrike 2.0.0 | 5 | 36% | 29 |
| davidalves.net.DuelistMiniMelee 1.2 | 4 | 29% | 66 |
| erdnis.Rover 0.3 | 2 | 14% | 24 |
| mld.Infinity 2.2 | 1 | 7% | 27 |
| pac.ABC 2.1 | 1 | 7% | 7 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 24 |
| pbg.R2D2 1.0 | 0 | 0% | 14 |
| mbh.Mbh 0.1 | 0 | 0% | 10 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 127275 melee ticks, 47146 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 33 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 42628 sent, 38049 reached their opponent, 8657 virtual hits (22.8% of those reached).

## Melee bench: F20

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 111 over 6 battles (18.5 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 93.3 | 158 / 210 | 1.60 | 21.5% | 38224 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 21.5% | 158 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.5% | 29 |
| fwb.Nine 1.0.1 | 3.5 | 11.1% | 5 |
| catcat20.Rabbit 0.001 | 3.8 | 10.8% | 11 |
| nz.jdc.nano.GridFu 1.0 | 4.7 | 10.4% | 3 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 8.1% | 0 |
| bayen.nut.Squirrel 1.615 | 7.0 | 7.1% | 2 |
| djdjdj.NanoSkunk10 1.0 | 8.0 | 6.1% | 2 |
| ntc.ControlledChaos 1.1.4 | 8.7 | 5.6% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 94.6 | 26 / 35 | 6222 |
| 2 | 1 | 70.9 | 87.9 | 25 / 35 | 6200 |
| 3 | 1 | 72.7 | 95.6 | 26 / 35 | 6511 |
| 4 | 1 | 72.0 | 93.7 | 27 / 35 | 6220 |
| 5 | 1 | 73.4 | 96.2 | 29 / 35 | 6777 |
| 6 | 1 | 71.6 | 91.7 | 25 / 35 | 6294 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 101 | 83% |
| fwb.Nine 1.0.1 | 34 | 97% |
| catcat20.Rabbit 0.001 | 26 | 85% |
| nz.jdc.nano.GridFu 1.0 | 11 | 100% |
| bayen.nut.Squirrel 1.615 | 3 | 67% |
| m3thos.mini.Eva01 0.5.5 | 3 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 935. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 32 | 62% | 107 |
| catcat20.Rabbit 0.001 | 7 | 13% | 31 |
| nz.jdc.nano.GridFu 1.0 | 4 | 8% | 23 |
| m3thos.mini.Eva01 0.5.5 | 2 | 4% | 19 |
| bayen.nut.Squirrel 1.615 | 2 | 4% | 10 |
| fwb.Nine 1.0.1 | 2 | 4% | 8 |
| djdjdj.NanoSkunk10 1.0 | 2 | 4% | 5 |
| ntc.ControlledChaos 1.1.4 | 1 | 2% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 203 rounds): 162266 melee ticks, 55461 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 1371 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 401 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 50992 sent, 46300 reached their opponent, 10727 virtual hits (23.2% of those reached).

## Melee bench: F21

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 487 over 6 battles (81.2 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 94.4 | 136 / 210 | 1.50 | 21.3% | 37569 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 21.3% | 136 |
| eem.EvBot v4.6.16 | 2.0 | 16.4% | 58 |
| dummy.mini.Scimitar 1.01 | 3.2 | 14.1% | 7 |
| cf.RiO.RiOx 4.2.1 | 3.8 | 11.6% | 2 |
| eld.Hmm 1.0 | 5.2 | 8.3% | 8 |
| oa.weak.BotherBot 0.1 | 5.8 | 7.4% | 0 |
| fire219.CatBot 1.0 | 7.7 | 6.0% | 0 |
| PSW.Relentless 0.1 | 7.7 | 5.7% | 0 |
| el.JumpShoot 0.2 | 9.0 | 5.0% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 97.1 | 26 / 35 | 6257 |
| 2 | 1 | 72.1 | 94.6 | 23 / 35 | 6335 |
| 3 | 1 | 70.9 | 89.8 | 19 / 35 | 5741 |
| 4 | 1 | 73.5 | 95.2 | 26 / 35 | 7064 |
| 5 | 1 | 71.8 | 94.3 | 20 / 35 | 6248 |
| 6 | 1 | 71.6 | 95.2 | 22 / 35 | 5924 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 129 | 66% |
| dummy.mini.Scimitar 1.01 | 27 | 85% |
| cf.RiO.RiOx 4.2.1 | 21 | 100% |
| eld.Hmm 1.0 | 14 | 43% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 1423. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 49 | 63% | 111 |
| eld.Hmm 1.0 | 10 | 13% | 25 |
| dummy.mini.Scimitar 1.01 | 8 | 10% | 36 |
| cf.RiO.RiOx 4.2.1 | 5 | 6% | 28 |
| el.JumpShoot 0.2 | 2 | 3% | 3 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 4 |
| fire219.CatBot 1.0 | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 178864 melee ticks, 94165 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 55 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 52587 sent, 47837 reached their opponent, 8294 virtual hits (17.3% of those reached).

## Melee bench: F22

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 336 over 6 battles (56.0 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 90.7 | 110 / 210 | 1.83 | 19.4% | 31761 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 19.4% | 110 |
| pe.SandboxDT 2.71m | 2.2 | 15.7% | 55 |
| kvk.HebusLeTroll 0.35 | 2.8 | 14.7% | 27 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.0% | 13 |
| bigpete.Stewie 1.0 | 5.0 | 10.4% | 3 |
| tad.Dalek98 0.98 | 6.3 | 7.2% | 0 |
| yk.JahRoslav 1.1 | 7.2 | 6.7% | 2 |
| gg.Squaraus 0.6 | 7.5 | 6.2% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.6% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 92.4 | 19 / 35 | 5189 |
| 2 | 1 | 68.9 | 88.3 | 12 / 35 | 5170 |
| 3 | 1 | 69.7 | 89.2 | 18 / 35 | 5237 |
| 4 | 1 | 70.5 | 92.1 | 22 / 35 | 5258 |
| 5 | 1 | 70.0 | 90.5 | 18 / 35 | 5191 |
| 6 | 1 | 71.1 | 92.1 | 21 / 35 | 5716 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 63 | 51% |
| kvk.HebusLeTroll 0.35 | 47 | 66% |
| jlm.javaDisturbance 0.59 | 44 | 84% |
| bigpete.Stewie 1.0 | 8 | 100% |
| yk.JahRoslav 1.1 | 3 | 33% |
| tad.Dalek98 0.98 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 1085. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 44 | 43% | 75 |
| kvk.HebusLeTroll 0.35 | 25 | 25% | 49 |
| jlm.javaDisturbance 0.59 | 23 | 23% | 61 |
| bigpete.Stewie 1.0 | 6 | 6% | 16 |
| yk.JahRoslav 1.1 | 2 | 2% | 6 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |
| tad.Dalek98 0.98 | 0 | 0% | 1 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 167401 melee ticks, 57230 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 51 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 52487 sent, 47670 reached their opponent, 7471 virtual hits (15.7% of those reached).

## Melee bench: F23

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 188 over 6 battles (31.3 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.1 | 97.7 | 187 / 210 | 1.21 | 22.7% | 38842 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 22.7% | 187 |
| pe.SandboxLump 1.52 | 2.0 | 16.2% | 18 |
| cre.Karolos 0.32 | 3.0 | 13.6% | 5 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.3% | 0 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.7 | 8.8% | 0 |
| cw.megas.Blade 0.8 | 6.2 | 8.3% | 0 |
| stelo.RamTrackSurfer 1.2 | 6.3 | 8.4% | 0 |
| sample.Walls 1.0 | 7.7 | 7.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.3 | 2.3% | 0 |
| rrh.Iwillfindyou 2.0 | 9.7 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 95.2 | 30 / 35 | 6538 |
| 2 | 1 | 74.1 | 97.5 | 31 / 35 | 6050 |
| 3 | 1 | 74.5 | 98.7 | 32 / 35 | 6576 |
| 4 | 1 | 74.7 | 98.7 | 32 / 35 | 7092 |
| 5 | 1 | 73.8 | 98.1 | 32 / 35 | 6366 |
| 6 | 1 | 73.8 | 97.8 | 30 / 35 | 6220 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 103 | 92% |
| cre.Karolos 0.32 | 68 | 97% |
| stelo.RamTrackSurfer 1.2 | 11 | 100% |
| stelo.AreaTargetingBot 1.1 | 6 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 24 of 210 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 13 | 54% | 102 |
| cre.Karolos 0.32 | 10 | 42% | 60 |
| stelo.AreaTargetingBot 1.1 | 0 | 0% | 15 |
| stelo.RamTrackSurfer 1.2 | 0 | 0% | 15 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 7 |
| sample.Walls 1.0 | 0 | 0% | 7 |
| cw.megas.Blade 0.8 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 122125 melee ticks, 54219 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 48 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 38267 sent, 33463 reached their opponent, 9933 virtual hits (29.7% of those reached).

## Melee bench: F24

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 752 over 6 battles (125.3 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 81.0 | 80 / 210 | 2.71 | 16.8% | 25440 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.2 | 16.8% | 80 |
| rz.GlowBlowMelee 1.4 | 2.3 | 14.2% | 46 |
| florent.XSeries.X2 0.12 | 3.2 | 13.4% | 24 |
| davidalves.Phoenix 0.54 | 4.0 | 12.3% | 35 |
| pedersen.Ugluk 1.1.1 | 4.3 | 12.4% | 16 |
| oog.melee.Corsair 1.0 | 6.0 | 9.7% | 7 |
| stelo.SoJNanoMelee 1.1 | 7.3 | 6.6% | 1 |
| lunchie.Lunchbox 0.93 | 7.8 | 5.5% | 2 |
| as.FrankTheTank 1.3 | 9.0 | 4.9% | 1 |
| evd.X1 0.01 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 83.8 | 16 / 35 | 4548 |
| 2 | 1 | 68.1 | 86.3 | 15 / 35 | 4563 |
| 3 | 2 | 63.4 | 74.0 | 10 / 35 | 3805 |
| 4 | 1 | 64.2 | 77.5 | 10 / 35 | 3954 |
| 5 | 1 | 68.1 | 87.6 | 18 / 35 | 4680 |
| 6 | 1 | 63.8 | 76.8 | 11 / 35 | 3890 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 34 | 50% |
| pedersen.Ugluk 1.1.1 | 34 | 76% |
| florent.XSeries.X2 0.12 | 24 | 67% |
| davidalves.Phoenix 0.54 | 16 | 56% |
| oog.melee.Corsair 1.0 | 7 | 86% |
| stelo.SoJNanoMelee 1.1 | 5 | 100% |
| lunchie.Lunchbox 0.93 | 2 | 50% |

Hadur died in 137 of 210 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 34 | 25% | 52 |
| rz.GlowBlowMelee 1.4 | 30 | 22% | 49 |
| davidalves.Phoenix 0.54 | 30 | 22% | 45 |
| pedersen.Ugluk 1.1.1 | 17 | 12% | 31 |
| oog.melee.Corsair 1.0 | 10 | 7% | 20 |
| stelo.SoJNanoMelee 1.1 | 4 | 3% | 5 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 3 |
| as.FrankTheTank 1.3 | 1 | 1% | 2 |
| evd.X1 0.01 | 1 | 1% | 2 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 137250 melee ticks, 36830 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 62 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 46104 sent, 41083 reached their opponent, 7775 virtual hits (18.9% of those reached).

## Melee bench: F25

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 324 over 6 battles (54.0 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 91.7 | 153 / 210 | 1.74 | 19.8% | 25923 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 19.8% | 153 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.2% | 12 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 12.9% | 12 |
| jdw.Hurricane 1.4 | 4.0 | 11.4% | 15 |
| ds.Oo 2.2 | 5.3 | 9.2% | 6 |
| gre.svman4.Morfeas 1.4.1 | 5.8 | 8.8% | 6 |
| awesomeness.Elite 1.0 | 7.3 | 7.5% | 3 |
| gjr.Cephalosporin 0.1 | 8.0 | 6.6% | 2 |
| adt.Ar2 1.1 | 8.5 | 6.4% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 93.0 | 26 / 35 | 4206 |
| 2 | 1 | 70.7 | 95.6 | 28 / 35 | 4493 |
| 3 | 1 | 66.8 | 83.5 | 20 / 35 | 4066 |
| 4 | 1 | 68.9 | 89.2 | 24 / 35 | 4132 |
| 5 | 1 | 70.5 | 94.3 | 27 / 35 | 4357 |
| 6 | 1 | 71.0 | 94.9 | 28 / 35 | 4669 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 53 | 96% |
| voidious.micro.BlitzBat 1.05 | 52 | 90% |
| jdw.Hurricane 1.4 | 36 | 81% |
| ds.Oo 2.2 | 15 | 87% |
| awesomeness.Elite 1.0 | 6 | 83% |
| gre.svman4.Morfeas 1.4.1 | 5 | 80% |
| gjr.Cephalosporin 0.1 | 4 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 730. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 11 | 19% | 46 |
| ds.Oo 2.2 | 10 | 17% | 34 |
| jdw.Hurricane 1.4 | 9 | 15% | 27 |
| voidious.micro.BlitzBat 1.05 | 8 | 14% | 45 |
| gre.svman4.Morfeas 1.4.1 | 7 | 12% | 20 |
| adt.Ar2 1.1 | 6 | 10% | 9 |
| awesomeness.Elite 1.0 | 5 | 8% | 14 |
| gjr.Cephalosporin 0.1 | 1 | 2% | 14 |
| amk.ChumbaMini 0.2 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 129159 melee ticks, 32966 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 72 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 45167 sent, 40415 reached their opponent, 6796 virtual hits (16.8% of those reached).

## Melee bench: F26

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 138 over 6 battles (23.0 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 93.9 | 151 / 210 | 1.55 | 21.6% | 40379 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 21.6% | 151 |
| ak.Fermat 2.0 | 2.0 | 15.3% | 29 |
| lrem.Spectre 0.4.4 | 3.2 | 12.5% | 11 |
| shu.nitro.LENIN .T34 | 3.8 | 11.6% | 11 |
| js.PinBall 1.6 | 5.2 | 10.0% | 1 |
| jaybot.adv.bots.JayBot 2.0 | 6.2 | 9.2% | 5 |
| gh.mini.GrubbmOne 1.0 | 6.7 | 8.3% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.9% | 1 |
| sample.SpinBot 1.0 | 9.0 | 3.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 95.2 | 26 / 35 | 6848 |
| 2 | 1 | 73.1 | 97.1 | 28 / 35 | 6829 |
| 3 | 1 | 72.5 | 92.4 | 22 / 35 | 6897 |
| 4 | 1 | 73.0 | 93.3 | 25 / 35 | 6696 |
| 5 | 1 | 71.8 | 91.1 | 24 / 35 | 6440 |
| 6 | 1 | 72.8 | 94.0 | 26 / 35 | 6669 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 76 | 80% |
| lrem.Spectre 0.4.4 | 44 | 89% |
| shu.nitro.LENIN .T34 | 31 | 90% |
| js.PinBall 1.6 | 14 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |
| gh.mini.GrubbmOne 1.0 | 2 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 941. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 26 | 44% | 76 |
| lrem.Spectre 0.4.4 | 17 | 29% | 52 |
| shu.nitro.LENIN .T34 | 5 | 8% | 44 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 8% | 9 |
| js.PinBall 1.6 | 4 | 7% | 16 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 2% | 5 |
| gh.mini.GrubbmOne 1.0 | 1 | 2% | 4 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 153102 melee ticks, 50775 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 33 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 49428 sent, 44733 reached their opponent, 10789 virtual hits (24.1% of those reached).

## Melee bench: F27

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 198 over 6 battles (33.0 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 95.6 | 181 / 210 | 1.40 | 21.4% | 33160 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 21.4% | 181 |
| mk.Alpha 0.2.1 | 2.0 | 14.1% | 15 |
| EH.Eagle 1.0.6 | 3.3 | 11.2% | 4 |
| sheldor.melee.nano.TestMelee 0.1 | 4.5 | 9.6% | 2 |
| techdude.kombat.FlamingKombat 1.5 | 5.0 | 9.2% | 1 |
| joe.ADinosaur 1.0 | 6.5 | 8.2% | 4 |
| wee.Gem 1.8.4 | 6.5 | 8.2% | 1 |
| throxbot.ThroxBot 0.1 | 8.3 | 6.3% | 2 |
| caimano.Furia_Ceca 0.22 | 8.5 | 6.6% | 0 |
| cs.Grudge 1.0 | 9.3 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 97.1 | 31 / 35 | 5634 |
| 2 | 1 | 70.4 | 93.7 | 28 / 35 | 5110 |
| 3 | 1 | 72.5 | 95.6 | 31 / 35 | 6137 |
| 4 | 1 | 71.4 | 96.8 | 29 / 35 | 5264 |
| 5 | 1 | 71.6 | 95.2 | 31 / 35 | 5391 |
| 6 | 1 | 71.6 | 94.9 | 31 / 35 | 5624 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 124 | 93% |
| EH.Eagle 1.0.6 | 34 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 100% |
| wee.Gem 1.8.4 | 7 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 5 | 100% |
| joe.ADinosaur 1.0 | 5 | 80% |
| throxbot.ThroxBot 0.1 | 5 | 80% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |

Hadur died in 30 of 210 rounds, at a mean tick of 703. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 9 | 30% | 91 |
| joe.ADinosaur 1.0 | 7 | 23% | 14 |
| EH.Eagle 1.0.6 | 5 | 17% | 38 |
| throxbot.ThroxBot 0.1 | 4 | 13% | 13 |
| sheldor.melee.nano.TestMelee 0.1 | 2 | 7% | 26 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 3% | 8 |
| wee.Gem 1.8.4 | 1 | 3% | 7 |
| caimano.Furia_Ceca 0.22 | 0 | 0% | 7 |
| cs.Grudge 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 134333 melee ticks, 47524 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 57 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 43584 sent, 38678 reached their opponent, 9500 virtual hits (24.6% of those reached).

## Melee bench: F28

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 635 over 6 battles (105.8 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 90.4 | 137 / 210 | 1.86 | 18.9% | 25152 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 18.9% | 137 |
| kid.test.NightFox .2 | 2.0 | 15.4% | 31 |
| uji.Antique 1.0 | 3.0 | 12.3% | 20 |
| pfvicm.Sobieski 7.2.3b | 4.3 | 10.3% | 6 |
| qohnil.blot.BlotBot 3.61 | 4.7 | 10.6% | 9 |
| amk.ChumbaWumba 0.3 | 6.5 | 7.7% | 2 |
| ahr.ice.Ice 1.0.2 | 6.7 | 7.8% | 4 |
| matt.advanced.Katana 1.0 | 8.2 | 6.0% | 0 |
| stelo.Lifestealer 1.0 | 9.3 | 5.5% | 0 |
| stelo.PianistNano 1.2 | 9.3 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 88.6 | 22 / 35 | 3808 |
| 2 | 1 | 67.9 | 88.9 | 19 / 35 | 4229 |
| 3 | 1 | 69.1 | 91.4 | 23 / 35 | 4295 |
| 4 | 1 | 70.1 | 93.3 | 25 / 35 | 4631 |
| 5 | 1 | 66.9 | 85.4 | 20 / 35 | 3997 |
| 6 | 1 | 70.0 | 94.9 | 28 / 35 | 4192 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 79 | 86% |
| uji.Antique 1.0 | 46 | 89% |
| qohnil.blot.BlotBot 3.61 | 11 | 73% |
| pfvicm.Sobieski 7.2.3b | 10 | 70% |
| amk.ChumbaWumba 0.3 | 8 | 75% |
| ahr.ice.Ice 1.0.2 | 6 | 50% |
| matt.advanced.Katana 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 1 | 0% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 22 | 28% | 50 |
| uji.Antique 1.0 | 20 | 25% | 64 |
| pfvicm.Sobieski 7.2.3b | 11 | 14% | 18 |
| amk.ChumbaWumba 0.3 | 8 | 10% | 15 |
| qohnil.blot.BlotBot 3.61 | 7 | 9% | 29 |
| ahr.ice.Ice 1.0.2 | 3 | 4% | 13 |
| matt.advanced.Katana 1.0 | 2 | 3% | 11 |
| stelo.PianistNano 1.2 | 1 | 1% | 3 |
| stelo.Lifestealer 1.0 | 0 | 0% | 5 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 134762 melee ticks, 41651 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 26 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 44804 sent, 39997 reached their opponent, 5689 virtual hits (14.2% of those reached).

## Melee bench: F29

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 631 over 6 battles (105.2 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 90.6 | 126 / 210 | 1.84 | 20.2% | 31036 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 20.2% | 126 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 15.0% | 44 |
| deewiant.Anomaly 0.2 | 2.7 | 14.6% | 31 |
| myl.micro.Troodon 1.10 | 4.2 | 12.2% | 4 |
| jok.PheonixM 0.1.2 | 4.8 | 10.3% | 4 |
| ph.melee.ArcherME 0.3 | 6.0 | 7.8% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.2 | 6.1% | 0 |
| DBall.Anarchy 0.1 | 8.0 | 5.5% | 1 |
| ap.Frederick 1.1 | 9.0 | 4.5% | 0 |
| jangs.ns51 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 90.2 | 20 / 35 | 5028 |
| 2 | 1 | 69.9 | 88.3 | 18 / 35 | 5221 |
| 3 | 1 | 71.7 | 93.7 | 24 / 35 | 4974 |
| 4 | 1 | 71.6 | 91.4 | 23 / 35 | 5508 |
| 5 | 1 | 69.9 | 87.6 | 19 / 35 | 4878 |
| 6 | 1 | 71.4 | 92.7 | 22 / 35 | 5427 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 74 | 77% |
| zyx.mega.YersiniaPestis 3.1 | 50 | 66% |
| myl.micro.Troodon 1.10 | 26 | 96% |
| jok.PheonixM 0.1.2 | 10 | 80% |
| DBall.Anarchy 0.1 | 2 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 1073. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 42 | 46% | 98 |
| zyx.mega.YersiniaPestis 3.1 | 28 | 31% | 69 |
| myl.micro.Troodon 1.10 | 9 | 10% | 18 |
| jok.PheonixM 0.1.2 | 3 | 3% | 15 |
| ph.melee.ArcherME 0.3 | 3 | 3% | 6 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 1 |
| DBall.Anarchy 0.1 | 0 | 0% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 174321 melee ticks, 61145 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 32 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 55161 sent, 50419 reached their opponent, 7741 virtual hits (15.4% of those reached).

## Melee bench: F30

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 327 over 6 battles (54.5 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 81.5 | 57 / 210 | 2.67 | 16.6% | 26341 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 16.6% | 57 |
| catcat20.Matcha 0.006 | 2.3 | 13.6% | 49 |
| darkcanuck.B26354 1.06 | 3.7 | 13.3% | 40 |
| stelo.PastFuture 2.3.2 | 3.8 | 12.3% | 19 |
| oog.melee.Capulet 1.2 | 4.2 | 12.2% | 27 |
| intruder.PrairieWolf 2.61 | 6.5 | 8.9% | 6 |
| tripphippy.Alice 1.1 | 6.8 | 8.0% | 8 |
| ntc.Opposite 1.5 | 8.2 | 6.8% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 8.5 | 5.8% | 4 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 77.1 | 7 / 35 | 4107 |
| 2 | 1 | 67.2 | 85.1 | 11 / 35 | 4908 |
| 3 | 1 | 64.2 | 75.9 | 8 / 35 | 4272 |
| 4 | 1 | 65.5 | 81.0 | 8 / 35 | 4472 |
| 5 | 1 | 66.3 | 83.5 | 10 / 35 | 4562 |
| 6 | 1 | 66.3 | 86.3 | 13 / 35 | 4020 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 40 | 38% |
| catcat20.Matcha 0.006 | 37 | 43% |
| oog.melee.Capulet 1.2 | 21 | 48% |
| stelo.PastFuture 2.3.2 | 16 | 50% |
| tripphippy.Alice 1.1 | 8 | 25% |
| intruder.PrairieWolf 2.61 | 6 | 83% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 33% |

Hadur died in 155 of 210 rounds, at a mean tick of 954. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 43 | 28% | 56 |
| catcat20.Matcha 0.006 | 38 | 25% | 52 |
| oog.melee.Capulet 1.2 | 25 | 16% | 37 |
| stelo.PastFuture 2.3.2 | 19 | 12% | 28 |
| tripphippy.Alice 1.1 | 13 | 8% | 17 |
| intruder.PrairieWolf 2.61 | 6 | 4% | 12 |
| fowl3628800.LightningBolt 2.6.0 | 6 | 4% | 5 |
| ntc.Opposite 1.5 | 3 | 2% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 164184 melee ticks, 42605 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 73 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 51866 sent, 46903 reached their opponent, 7793 virtual hits (16.6% of those reached).

## Melee bench: F31

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 659 over 6 battles (109.8 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 80.4 | 80 / 210 | 2.77 | 16.5% | 23515 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.4% | 78 |
| hadur117.Hadur 3.20dm | 2.0 | 16.5% | 80 |
| gh.mini.Griezel 0.2 | 3.0 | 13.3% | 40 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.5% | 12 |
| spinnercat.micro.Tyger 0.1 | 4.8 | 10.4% | 2 |
| gh.nano.Grofvuil 0.2 | 5.8 | 8.7% | 0 |
| timmit.nano.TimDog 0.33 | 7.3 | 6.9% | 0 |
| fm.mammillarias 1.3 | 8.3 | 5.6% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.8 | 5.0% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.8 | 84.1 | 16 / 35 | 4108 |
| 2 | 2 | 63.7 | 76.2 | 13 / 35 | 3495 |
| 3 | 2 | 66.6 | 83.2 | 12 / 35 | 4158 |
| 4 | 2 | 65.7 | 81.0 | 14 / 35 | 3955 |
| 5 | 2 | 64.5 | 77.8 | 13 / 35 | 3754 |
| 6 | 2 | 65.6 | 80.0 | 12 / 35 | 4045 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 60 | 57% |
| gh.mini.Griezel 0.2 | 32 | 63% |
| d414.nano.Quantum 1.0.0 | 11 | 82% |
| spinnercat.micro.Tyger 0.1 | 10 | 100% |
| timmit.nano.TimDog 0.33 | 3 | 100% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 826. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 51 | 37% | 80 |
| gh.mini.Griezel 0.2 | 37 | 27% | 61 |
| d414.nano.Quantum 1.0.0 | 13 | 9% | 22 |
| spinnercat.micro.Tyger 0.1 | 12 | 9% | 21 |
| gh.nano.Grofvuil 0.2 | 6 | 4% | 11 |
| fm.mammillarias 1.3 | 6 | 4% | 6 |
| timmit.nano.TimDog 0.33 | 4 | 3% | 7 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 152616 melee ticks, 36435 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 45 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 45 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 2.

Targeting waves (208 rounds): 50250 sent, 45261 reached their opponent, 7383 virtual hits (16.3% of those reached).

## Melee bench: F32

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 488 over 6 battles (81.3 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 90.8 | 131 / 210 | 1.83 | 19.0% | 28307 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 19.0% | 131 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.5% | 47 |
| apc.botM 3.0 | 3.0 | 11.6% | 12 |
| vjik.UnViolation 1.1 | 4.7 | 10.0% | 9 |
| lxx.ConceptA 0.8 | 4.7 | 10.2% | 3 |
| bayen.UbaMicro 1.4 | 5.8 | 9.1% | 4 |
| panzer.Panzer 0.2 | 7.5 | 7.1% | 0 |
| yk.JahMicro 1.0 | 7.5 | 7.2% | 4 |
| conscience.Electron 1.3g | 9.0 | 6.2% | 0 |
| donjezza.Jezza 1.0 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 86.3 | 19 / 35 | 4457 |
| 2 | 1 | 67.9 | 89.8 | 19 / 35 | 4446 |
| 3 | 1 | 69.6 | 94.0 | 24 / 35 | 4935 |
| 4 | 1 | 70.6 | 97.8 | 28 / 35 | 4727 |
| 5 | 1 | 67.2 | 86.3 | 17 / 35 | 4684 |
| 6 | 1 | 69.1 | 90.5 | 24 / 35 | 5058 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 86 | 62% |
| apc.botM 3.0 | 27 | 78% |
| vjik.UnViolation 1.1 | 23 | 87% |
| lxx.ConceptA 0.8 | 15 | 93% |
| bayen.UbaMicro 1.4 | 9 | 89% |
| yk.JahMicro 1.0 | 7 | 71% |
| donjezza.Jezza 1.0 | 6 | 100% |
| panzer.Panzer 0.2 | 4 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 40 | 48% | 81 |
| apc.botM 3.0 | 13 | 15% | 38 |
| lxx.ConceptA 0.8 | 10 | 12% | 18 |
| vjik.UnViolation 1.1 | 8 | 10% | 34 |
| bayen.UbaMicro 1.4 | 4 | 5% | 14 |
| yk.JahMicro 1.0 | 4 | 5% | 10 |
| donjezza.Jezza 1.0 | 1 | 1% | 7 |
| conscience.Electron 1.3g | 1 | 1% | 5 |
| panzer.Panzer 0.2 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 124253 melee ticks, 55759 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 40 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 42610 sent, 37781 reached their opponent, 6791 virtual hits (18.0% of those reached).

## Melee bench: F33

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 749 over 6 battles (124.8 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 86.1 | 114 / 210 | 2.25 | 18.8% | 29525 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.2 | 18.8% | 114 |
| maribo.Quester 0.3 | 1.8 | 16.3% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.7% | 17 |
| gre.svman4.Leonidas 1.3.2 | 4.0 | 11.8% | 15 |
| labg.Cataclysm 2.05 | 4.8 | 11.2% | 19 |
| baal.nano.N 1.42 | 6.5 | 8.2% | 2 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 7.7% | 2 |
| zyx.micro.Ant 1.1 | 7.8 | 6.0% | 0 |
| sanja.First 0.1 | 9.0 | 4.5% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 89.8 | 22 / 35 | 4924 |
| 2 | 1 | 70.0 | 88.6 | 19 / 35 | 5376 |
| 3 | 1 | 69.7 | 88.6 | 21 / 35 | 4784 |
| 4 | 1 | 69.7 | 87.6 | 20 / 35 | 5244 |
| 5 | 1 | 68.6 | 84.1 | 19 / 35 | 4748 |
| 6 | 2 | 66.2 | 77.8 | 13 / 35 | 4449 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 66 | 79% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 78% |
| gre.svman4.Leonidas 1.3.2 | 24 | 83% |
| labg.Cataclysm 2.05 | 16 | 75% |
| baal.nano.N 1.42 | 5 | 80% |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 943. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 34 | 33% | 78 |
| gre.svman4.Leonidas 1.3.2 | 18 | 18% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 17% | 38 |
| labg.Cataclysm 2.05 | 13 | 13% | 27 |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 7% | 13 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 3 | 3% | 3 |
| baal.nano.N 1.42 | 2 | 2% | 10 |
| sanja.First 0.1 | 1 | 1% | 2 |
| zyx.micro.Ant 1.1 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 170145 melee ticks, 45699 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 40 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 54059 sent, 49181 reached their opponent, 7179 virtual hits (14.6% of those reached).

## Melee bench: F34

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 534 over 6 battles (89.0 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.4 | 89 / 210 | 2.04 | 18.8% | 32572 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 18.8% | 89 |
| kid.Gladiator .7.2 | 2.3 | 16.3% | 49 |
| stelo.Spread 0.9 | 2.7 | 15.9% | 54 |
| jcs.Seth 1.8 | 4.2 | 11.5% | 16 |
| tcf.Reach 3 | 5.0 | 10.3% | 2 |
| cli.Dancer 1.1 | 5.8 | 9.3% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.5% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.3% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.6 | 11 / 35 | 4950 |
| 2 | 1 | 69.5 | 87.9 | 13 / 35 | 5514 |
| 3 | 1 | 68.5 | 85.4 | 12 / 35 | 5341 |
| 4 | 1 | 69.3 | 87.6 | 16 / 35 | 5490 |
| 5 | 1 | 70.6 | 90.8 | 16 / 35 | 5766 |
| 6 | 1 | 70.7 | 91.1 | 21 / 35 | 5511 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 67 | 55% |
| stelo.Spread 0.9 | 64 | 53% |
| jcs.Seth 1.8 | 23 | 52% |
| tcf.Reach 3 | 5 | 80% |
| cli.Dancer 1.1 | 2 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 1107. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 47 | 37% | 75 |
| stelo.Spread 0.9 | 40 | 32% | 78 |
| jcs.Seth 1.8 | 18 | 14% | 32 |
| tcf.Reach 3 | 11 | 9% | 16 |
| cli.Dancer 1.1 | 2 | 2% | 5 |
| amk.Punbot.Punbot 0.01 | 2 | 2% | 2 |
| ratosh.Wesco 1.4 | 1 | 1% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 172300 melee ticks, 64909 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 58 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 52839 sent, 48077 reached their opponent, 8023 virtual hits (16.7% of those reached).

## Melee bench: F35

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 512 over 6 battles (85.3 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 84.4 | 47 / 210 | 2.40 | 16.5% | 23809 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.2 | 19.1% | 136 |
| hadur117.Hadur 3.20dm | 1.8 | 16.5% | 47 |
| gh.mini.Gruwel 0.9 | 3.7 | 12.6% | 17 |
| rz.HawkOnFire 0.1 | 4.0 | 11.9% | 1 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 11.6% | 10 |
| wit.Chuliath 1.0 | 6.7 | 6.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.0 | 6.1% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.2 | 5.6% | 0 |
| dans.Cinnamon 1.2 | 8.7 | 5.2% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 82.5 | 5 / 35 | 3966 |
| 2 | 2 | 65.6 | 86.0 | 6 / 35 | 3707 |
| 3 | 2 | 65.6 | 82.9 | 11 / 35 | 3844 |
| 4 | 2 | 64.9 | 82.2 | 3 / 35 | 3979 |
| 5 | 1 | 67.6 | 87.9 | 11 / 35 | 4273 |
| 6 | 2 | 66.4 | 84.8 | 11 / 35 | 4040 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 96 | 19% |
| gh.mini.Gruwel 0.9 | 17 | 47% |
| rz.HawkOnFire 0.1 | 13 | 92% |
| dmh.robocode.robot.BlackDeath 9.2 | 13 | 54% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 168 of 210 rounds, at a mean tick of 969. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 100 | 60% | 118 |
| gh.mini.Gruwel 0.9 | 30 | 18% | 41 |
| dmh.robocode.robot.BlackDeath 9.2 | 18 | 11% | 24 |
| rz.HawkOnFire 0.1 | 9 | 5% | 17 |
| wit.Chuliath 1.0 | 5 | 3% | 7 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 0 | 0% | 1 |
| myl.nano.KomoriNinja 1.1 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 147260 melee ticks, 52994 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 33 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 45606 sent, 40728 reached their opponent, 6230 virtual hits (15.3% of those reached).

## Melee bench: F36

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 149 over 6 battles (24.8 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 94.7 | 160 / 210 | 1.48 | 21.6% | 35327 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 21.6% | 160 |
| alpha.RainingFire 1.0 | 2.7 | 12.7% | 14 |
| bzdp.Pansy 2.1 | 2.8 | 12.1% | 11 |
| mz.Cork 0.1 | 4.5 | 10.6% | 9 |
| bvh.micro.Freya 0.3 | 5.0 | 10.3% | 9 |
| bvh.mini.Fenrir 0.39 | 6.0 | 9.6% | 1 |
| m3thos.Eva02 0.7.1 | 6.0 | 9.3% | 5 |
| dl.BetterWalls 1.0 | 8.3 | 5.2% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 5.2% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 94.6 | 25 / 35 | 6043 |
| 2 | 1 | 70.7 | 91.7 | 22 / 35 | 5542 |
| 3 | 1 | 73.4 | 98.4 | 31 / 35 | 6249 |
| 4 | 1 | 72.1 | 94.3 | 28 / 35 | 5840 |
| 5 | 1 | 70.9 | 91.7 | 24 / 35 | 5730 |
| 6 | 1 | 73.1 | 97.5 | 30 / 35 | 5923 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 59 | 86% |
| alpha.RainingFire 1.0 | 45 | 80% |
| mz.Cork 0.1 | 34 | 76% |
| bvh.micro.Freya 0.3 | 22 | 100% |
| bvh.mini.Fenrir 0.39 | 13 | 100% |
| m3thos.Eva02 0.7.1 | 9 | 89% |
| sample.MyFirstRobot 1.0 | 2 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 974. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.Cork 0.1 | 13 | 26% | 39 |
| bzdp.Pansy 2.1 | 12 | 24% | 58 |
| alpha.RainingFire 1.0 | 12 | 24% | 48 |
| bvh.mini.Fenrir 0.39 | 5 | 10% | 16 |
| bvh.micro.Freya 0.3 | 3 | 6% | 24 |
| m3thos.Eva02 0.7.1 | 3 | 6% | 15 |
| dl.BetterWalls 1.0 | 1 | 2% | 5 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 2 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 203 rounds): 145007 melee ticks, 52006 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 72 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 49566 sent, 45041 reached their opponent, 9271 virtual hits (20.6% of those reached).

## Melee bench: F37

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 254 over 6 battles (42.3 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 90.1 | 165 / 210 | 1.90 | 19.7% | 33711 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 19.7% | 165 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.2 | 10.4% | 6 |
| agrach.Dalek 1.0 | 4.2 | 9.6% | 10 |
| EBBU.Sim2 1.02 | 4.8 | 9.4% | 3 |
| germ.TheMind .2 | 5.0 | 9.4% | 8 |
| stelo.UntouchableNano 1.3 | 5.2 | 8.9% | 9 |
| lmk.ACPFinal 0.1 | 7.0 | 8.6% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 7.2 | 8.4% | 1 |
| mb.Beast 0.1 | 8.0 | 8.1% | 1 |
| skm.Ryubot 1.0 | 9.5 | 7.5% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 89.5 | 27 / 35 | 5500 |
| 2 | 1 | 68.7 | 89.5 | 29 / 35 | 5513 |
| 3 | 1 | 67.6 | 86.0 | 24 / 35 | 5424 |
| 4 | 1 | 70.6 | 93.7 | 31 / 35 | 6128 |
| 5 | 1 | 69.2 | 90.2 | 27 / 35 | 5816 |
| 6 | 1 | 68.6 | 91.4 | 27 / 35 | 5330 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| lmk.ACPFinal 0.1 | 26 | 96% |
| agrach.Dalek 1.0 | 26 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 24 | 96% |
| stelo.UntouchableNano 1.3 | 24 | 88% |
| EBBU.Sim2 1.02 | 20 | 100% |
| skm.Ryubot 1.0 | 18 | 94% |
| germ.TheMind .2 | 16 | 94% |
| mb.Beast 0.1 | 16 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 46 of 210 rounds, at a mean tick of 429. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 11 | 24% | 13 |
| stelo.UntouchableNano 1.3 | 9 | 20% | 21 |
| com.syncleus.robocode.Dreadnaught 0.1 | 8 | 17% | 32 |
| agrach.Dalek 1.0 | 7 | 15% | 43 |
| lmk.ACPFinal 0.1 | 3 | 7% | 28 |
| skm.Ryubot 1.0 | 3 | 7% | 7 |
| EBBU.Sim2 1.02 | 2 | 4% | 24 |
| mb.Beast 0.1 | 1 | 2% | 21 |
| germ.TheMind .2 | 1 | 2% | 18 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 96615 melee ticks, 26461 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 31 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 32040 sent, 27530 reached their opponent, 8033 virtual hits (29.2% of those reached).

## Melee bench: F38

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 229 over 6 battles (38.2 per battle, most in one battle 117). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 91.7 | 134 / 210 | 1.75 | 19.6% | 30168 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 19.6% | 134 |
| justin.Mallais 14.0 | 2.0 | 15.4% | 42 |
| bvh.mini.Freya 0.55 | 3.2 | 12.5% | 15 |
| bts.mega.Gnarly 1.4 | 3.8 | 11.2% | 9 |
| cs.Wren 1.0 | 5.5 | 10.1% | 7 |
| kdf.KoulDestroyer 1.0 | 6.0 | 9.1% | 2 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.5 | 8.9% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 5.6% | 0 |
| matt.UnderDark3 2.4.34 | 9.3 | 3.9% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 90.8 | 24 / 35 | 4950 |
| 2 | 1 | 68.6 | 87.3 | 17 / 35 | 4900 |
| 3 | 1 | 71.2 | 95.9 | 27 / 35 | 5197 |
| 4 | 1 | 70.3 | 92.4 | 24 / 35 | 4954 |
| 5 | 1 | 69.4 | 88.9 | 19 / 35 | 5237 |
| 6 | 1 | 70.2 | 94.9 | 23 / 35 | 4930 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 78 | 69% |
| bvh.mini.Freya 0.55 | 33 | 70% |
| bts.mega.Gnarly 1.4 | 31 | 84% |
| cs.Wren 1.0 | 18 | 94% |
| kdf.KoulDestroyer 1.0 | 8 | 100% |
| davidalves.net.DuelistNanoMelee 1.01 | 6 | 83% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 33 | 43% | 85 |
| bts.mega.Gnarly 1.4 | 16 | 21% | 45 |
| bvh.mini.Freya 0.55 | 12 | 16% | 25 |
| kdf.KoulDestroyer 1.0 | 6 | 8% | 12 |
| cs.Wren 1.0 | 5 | 6% | 23 |
| matt.UnderDark3 2.4.34 | 2 | 3% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 4 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |
| davidalves.net.DuelistNanoMelee 1.01 | 0 | 0% | 11 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 136928 melee ticks, 44717 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 34 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 44711 sent, 39777 reached their opponent, 8855 virtual hits (22.3% of those reached).

## Melee bench: F39

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 780 over 6 battles (130.0 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 88.1 | 110 / 210 | 2.07 | 19.0% | 32253 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 19.0% | 110 |
| bvh.fry.Freya 0.82 | 2.0 | 15.2% | 22 |
| az.Ololobot 0.2.4 | 3.2 | 13.0% | 50 |
| catcat20.Lambda 0.024 | 3.8 | 11.6% | 23 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.3% | 2 |
| gimp.GimpBot 0.1 | 6.5 | 8.0% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 7.2 | 7.3% | 3 |
| apollokidd.ApolloKidd 0.9 | 7.2 | 7.4% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.6% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 87.6 | 20 / 35 | 5419 |
| 2 | 1 | 66.8 | 82.9 | 14 / 35 | 4985 |
| 3 | 1 | 69.8 | 90.5 | 21 / 35 | 5508 |
| 4 | 1 | 68.2 | 87.6 | 16 / 35 | 5142 |
| 5 | 1 | 70.8 | 94.3 | 22 / 35 | 5709 |
| 6 | 1 | 68.1 | 85.7 | 17 / 35 | 5490 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 65 | 83% |
| az.Ololobot 0.2.4 | 57 | 51% |
| catcat20.Lambda 0.024 | 26 | 54% |
| winamp32.micro.MicroMacro 1.0 | 6 | 100% |
| apollokidd.ApolloKidd 0.9 | 3 | 100% |
| gimp.GimpBot 0.1 | 3 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 2 | 50% |

Hadur died in 107 of 210 rounds, at a mean tick of 1073. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 36 | 34% | 69 |
| bvh.fry.Freya 0.82 | 28 | 26% | 60 |
| catcat20.Lambda 0.024 | 19 | 18% | 33 |
| stelo.SoRobotNanoMelee 1.2 | 8 | 7% | 11 |
| gimp.GimpBot 0.1 | 4 | 4% | 13 |
| apollokidd.ApolloKidd 0.9 | 3 | 3% | 4 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 14 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 4 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 161362 melee ticks, 56861 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 69 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 69 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 51238 sent, 46488 reached their opponent, 8367 virtual hits (18.0% of those reached).

## Melee bench: F40

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 447 over 6 battles (74.5 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 89.9 | 135 / 210 | 1.91 | 20.0% | 31845 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 20.0% | 135 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.1% | 36 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.4% | 10 |
| mz.AntiGrav 1.0 | 4.2 | 11.4% | 9 |
| Polkwane.SmashMelee 1.0 | 5.2 | 10.3% | 9 |
| stelo.Randomness 1.0 | 6.0 | 9.3% | 11 |
| alpha.BlackIce 1.0 | 6.7 | 8.6% | 0 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.2% | 0 |
| sample.Corners 1.0 | 9.5 | 3.1% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.5 | 3.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 86.0 | 20 / 35 | 5421 |
| 2 | 1 | 70.8 | 90.5 | 23 / 35 | 5089 |
| 3 | 1 | 71.3 | 93.3 | 26 / 35 | 5456 |
| 4 | 1 | 69.4 | 86.0 | 19 / 35 | 5027 |
| 5 | 1 | 70.8 | 92.1 | 23 / 35 | 5327 |
| 6 | 1 | 70.9 | 91.4 | 24 / 35 | 5525 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 69 | 81% |
| kano.gamma.KanoGamma 1.8 | 47 | 87% |
| mz.AntiGrav 1.0 | 17 | 82% |
| Polkwane.SmashMelee 1.0 | 14 | 93% |
| stelo.Randomness 1.0 | 9 | 67% |
| alpha.BlackIce 1.0 | 4 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 28 | 35% | 83 |
| kano.gamma.KanoGamma 1.8 | 16 | 20% | 53 |
| stelo.Randomness 1.0 | 12 | 15% | 17 |
| mz.AntiGrav 1.0 | 7 | 9% | 20 |
| Polkwane.SmashMelee 1.0 | 5 | 6% | 16 |
| alpha.BlackIce 1.0 | 3 | 4% | 12 |
| amk.superstrike.SuperStrike 0.3 | 2 | 3% | 4 |
| testantiswapgun.AntiSwap 1.0 | 2 | 3% | 3 |
| sample.Corners 1.0 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 153820 melee ticks, 43271 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 87 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 87 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 49801 sent, 44860 reached their opponent, 8852 virtual hits (19.7% of those reached).

## Melee bench: F41

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 531 over 6 battles (88.5 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 90.1 | 117 / 210 | 1.90 | 18.9% | 28267 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 18.9% | 117 |
| eem.EvBotNG v12.8 | 2.0 | 15.6% | 63 |
| ary.Swarm 1.1 | 3.0 | 13.1% | 10 |
| lessonz.robocode.Oz 0.5.0 | 4.2 | 12.3% | 11 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.8% | 6 |
| shrub.Silver v048 | 5.8 | 9.2% | 3 |
| zyx.nano.Ant 1.1 | 7.0 | 7.8% | 0 |
| stelo.Mirror 1.1 | 8.5 | 5.4% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 5.0% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 86.3 | 14 / 35 | 4732 |
| 2 | 1 | 69.6 | 91.4 | 22 / 35 | 4550 |
| 3 | 1 | 69.0 | 87.0 | 21 / 35 | 4531 |
| 4 | 1 | 69.1 | 89.2 | 18 / 35 | 4827 |
| 5 | 1 | 70.5 | 94.3 | 22 / 35 | 4805 |
| 6 | 1 | 69.7 | 92.1 | 20 / 35 | 4822 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 77 | 48% |
| lessonz.robocode.Oz 0.5.0 | 36 | 94% |
| ary.Swarm 1.1 | 29 | 86% |
| simonton.nano.MeleeSeed 1.8 | 17 | 94% |
| shrub.Silver v048 | 6 | 83% |

Hadur died in 98 of 210 rounds, at a mean tick of 1001. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 50 | 51% | 88 |
| ary.Swarm 1.1 | 14 | 14% | 35 |
| lessonz.robocode.Oz 0.5.0 | 13 | 13% | 40 |
| simonton.nano.MeleeSeed 1.8 | 8 | 8% | 27 |
| shrub.Silver v048 | 5 | 5% | 10 |
| stelo.Mirror 1.1 | 2 | 2% | 4 |
| jsal.Jsalbot 1.0 | 1 | 1% | 5 |
| zyx.nano.Ant 1.1 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 153443 melee ticks, 54147 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 65 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 50454 sent, 45432 reached their opponent, 6948 virtual hits (15.3% of those reached).

## Melee bench: F42

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 432 over 6 battles (72.0 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 92.0 | 145 / 210 | 1.72 | 20.7% | 36830 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 20.7% | 145 |
| wompi.Wallaby 5.1 | 2.2 | 15.3% | 36 |
| maribo.mini.MiniQuester 0.1 | 3.2 | 13.6% | 9 |
| ara.Shera 0.88 | 3.7 | 13.2% | 21 |
| amz.NanoClone 1.41 | 5.0 | 8.6% | 0 |
| dsw.StaticD 1.0 | 6.5 | 6.8% | 0 |
| maribo.IotaCT 1.1 | 7.3 | 6.5% | 0 |
| stelo.MirrorMicro 1.0 | 7.8 | 5.9% | 0 |
| mme.NikeEnhanced 2.0 | 8.5 | 5.0% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 92.4 | 26 / 35 | 5775 |
| 2 | 1 | 70.6 | 90.5 | 24 / 35 | 5750 |
| 3 | 1 | 71.7 | 91.4 | 23 / 35 | 6480 |
| 4 | 1 | 71.7 | 91.1 | 23 / 35 | 6615 |
| 5 | 1 | 71.5 | 92.4 | 24 / 35 | 6085 |
| 6 | 1 | 71.7 | 94.0 | 25 / 35 | 6125 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 97 | 84% |
| maribo.mini.MiniQuester 0.1 | 42 | 98% |
| ara.Shera 0.88 | 28 | 68% |
| amz.NanoClone 1.41 | 2 | 100% |
| dsw.StaticD 1.0 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 922. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 29 | 42% | 50 |
| wompi.Wallaby 5.1 | 21 | 30% | 96 |
| maribo.mini.MiniQuester 0.1 | 10 | 14% | 51 |
| amz.NanoClone 1.41 | 4 | 6% | 4 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 3 |
| dsw.StaticD 1.0 | 0 | 0% | 5 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 157552 melee ticks, 53020 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 56 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 50302 sent, 45639 reached their opponent, 9073 virtual hits (19.9% of those reached).

## Melee bench: F43

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 620 over 6 battles (103.3 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 82.3 | 50 / 210 | 2.59 | 16.7% | 26079 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 19.9% | 125 |
| hadur117.Hadur 3.20dm | 2.0 | 16.7% | 50 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.5% | 27 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.5% | 6 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 10.4% | 2 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.1% | 1 |
| mz.NanoGod 2.02 | 7.3 | 7.9% | 1 |
| jab.DiamondStealer 5 | 7.7 | 7.8% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.9% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.0 | 78.4 | 7 / 35 | 4364 |
| 2 | 2 | 67.2 | 85.1 | 10 / 35 | 4130 |
| 3 | 2 | 67.7 | 83.8 | 7 / 35 | 4469 |
| 4 | 2 | 68.7 | 84.8 | 14 / 35 | 4782 |
| 5 | 2 | 65.4 | 78.4 | 7 / 35 | 3777 |
| 6 | 2 | 67.4 | 83.5 | 5 / 35 | 4557 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 91 | 29% |
| brainfade.melee.Dusk 0.44 | 18 | 50% |
| dummy.micro.Sparrow 2.5 | 13 | 69% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 100% |
| Krabb.akim2.Akim2 1.1b | 2 | 100% |
| cvt.Firsty 1.0 | 1 | 100% |
| mz.NanoGod 2.02 | 1 | 0% |

Hadur died in 166 of 210 rounds, at a mean tick of 1036. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 96 | 58% | 124 |
| brainfade.melee.Dusk 0.44 | 24 | 14% | 35 |
| dummy.micro.Sparrow 2.5 | 17 | 10% | 23 |
| wcsv.melee.EngineerMelee 0.1 | 10 | 6% | 12 |
| mz.NanoGod 2.02 | 8 | 5% | 8 |
| Krabb.akim2.Akim2 1.1b | 3 | 2% | 6 |
| jab.DiamondStealer 5 | 2 | 1% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 160242 melee ticks, 57512 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 38 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 50456 sent, 45456 reached their opponent, 7604 virtual hits (16.7% of those reached).

## Melee bench: F44

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 456 over 6 battles (76.0 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 95.1 | 152 / 210 | 1.44 | 21.7% | 37345 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 21.7% | 152 |
| stelo.Liblix 0.3.1 | 2.0 | 15.6% | 40 |
| tzu.TheArtOfWar 1.2 | 3.0 | 14.0% | 12 |
| jwirde.Gort 2.0 | 4.5 | 9.5% | 2 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.5 | 9.6% | 3 |
| disan.Chair 2.2.0 | 6.3 | 7.2% | 1 |
| wompi.Quokka 1.6 | 7.2 | 6.6% | 0 |
| stf.PanzerGeneral 0.1 | 7.5 | 6.5% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.9% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 94.6 | 23 / 35 | 6511 |
| 2 | 1 | 71.9 | 94.9 | 27 / 35 | 5963 |
| 3 | 1 | 72.5 | 94.9 | 26 / 35 | 6278 |
| 4 | 1 | 72.1 | 93.0 | 22 / 35 | 6313 |
| 5 | 1 | 72.4 | 96.5 | 27 / 35 | 6011 |
| 6 | 1 | 73.0 | 96.8 | 27 / 35 | 6269 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 87 | 69% |
| tzu.TheArtOfWar 1.2 | 72 | 89% |
| jwirde.Gort 2.0 | 11 | 91% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 9 | 78% |
| disan.Chair 2.2.0 | 7 | 86% |
| sample.Crazy 1.0 | 4 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 1004. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 34 | 56% | 102 |
| tzu.TheArtOfWar 1.2 | 13 | 21% | 67 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 8% | 10 |
| jwirde.Gort 2.0 | 4 | 7% | 21 |
| disan.Chair 2.2.0 | 1 | 2% | 5 |
| amk.jointstrike.JointStrike 0.2 | 1 | 2% | 2 |
| sample.Crazy 1.0 | 0 | 0% | 2 |
| stf.PanzerGeneral 0.1 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 155433 melee ticks, 52857 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 41 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 52713 sent, 47973 reached their opponent, 9961 virtual hits (20.8% of those reached).

## Melee bench: F45

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 448 over 6 battles (74.7 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 91.1 | 118 / 210 | 1.80 | 20.4% | 33739 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20dm | 1.0 | 20.4% | 118 |
| jje.BagPuss 1.2 | 2.8 | 12.0% | 7 |
| eem.IWillFireNoBullet v2.8 | 3.3 | 11.4% | 67 |
| sul.Lunar 1.1 | 3.7 | 11.1% | 12 |
| myl.nano.Graviton 1.10 | 4.2 | 10.7% | 3 |
| hvilela.HVilela 0.9 | 6.7 | 8.6% | 0 |
| fm.claire 1.7 | 7.0 | 8.7% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.3 | 8.3% | 1 |
| wit.Deep7 2.0 | 9.2 | 4.8% | 1 |
| abud.ThirdRobo 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 87.9 | 18 / 35 | 5351 |
| 2 | 1 | 71.9 | 94.0 | 23 / 35 | 6166 |
| 3 | 1 | 71.1 | 93.7 | 21 / 35 | 5562 |
| 4 | 1 | 71.5 | 91.7 | 21 / 35 | 6065 |
| 5 | 1 | 69.0 | 89.8 | 15 / 35 | 5139 |
| 6 | 1 | 69.7 | 89.5 | 20 / 35 | 5456 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 68 | 46% |
| sul.Lunar 1.1 | 30 | 80% |
| jje.BagPuss 1.2 | 27 | 81% |
| myl.nano.Graviton 1.10 | 25 | 92% |
| pez.mini.ChironexFleckeri 0.5 | 10 | 90% |
| wit.Deep7 2.0 | 5 | 100% |
| fm.claire 1.7 | 3 | 67% |
| hvilela.HVilela 0.9 | 2 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 1583. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 44 | 46% | 0 |
| jje.BagPuss 1.2 | 20 | 21% | 72 |
| sul.Lunar 1.1 | 11 | 12% | 49 |
| myl.nano.Graviton 1.10 | 8 | 8% | 33 |
| pez.mini.ChironexFleckeri 0.5 | 4 | 4% | 21 |
| fm.claire 1.7 | 2 | 2% | 12 |
| hvilela.HVilela 0.9 | 2 | 2% | 11 |
| abud.ThirdRobo 1.0 | 1 | 1% | 5 |
| wit.Deep7 2.0 | 0 | 0% | 5 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 195468 melee ticks, 77798 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 54 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 58864 sent, 54257 reached their opponent, 7962 virtual hits (14.7% of those reached).

## Melee bench: F46

hadur117.Hadur 3.20dm against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 731 over 6 battles (121.8 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 83.9 | 55 / 210 | 2.45 | 16.6% | 25675 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.8 | 17.0% | 64 |
| rsalesc.melee.Medina 0.4.5 | 2.0 | 16.5% | 75 |
| hadur117.Hadur 3.20dm | 2.2 | 16.6% | 55 |
| mz.MicroSheep 1.0 | 4.0 | 10.9% | 5 |
| sadoner.killer 0.2 | 5.5 | 8.8% | 0 |
| cx.Princess 1.0 | 5.8 | 9.1% | 9 |
| arthord.NanoSatanMelee Beta | 6.7 | 7.7% | 2 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 82.2 | 6 / 35 | 4303 |
| 2 | 1 | 67.5 | 86.3 | 14 / 35 | 4348 |
| 3 | 3 | 65.9 | 81.3 | 10 / 35 | 4297 |
| 4 | 2 | 66.1 | 83.5 | 9 / 35 | 4241 |
| 5 | 3 | 66.0 | 84.4 | 8 / 35 | 4212 |
| 6 | 2 | 66.3 | 85.4 | 8 / 35 | 4274 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 69 | 59% |
| rsalesc.melee.Medina 0.4.5 | 39 | 18% |
| cx.Princess 1.0 | 6 | 67% |
| mz.MicroSheep 1.0 | 4 | 50% |
| arthord.NanoSatanMelee Beta | 3 | 33% |

Hadur died in 161 of 210 rounds, at a mean tick of 979. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 67 | 42% | 80 |
| kc.mini.Mirage 0.2 | 62 | 39% | 97 |
| mz.MicroSheep 1.0 | 8 | 5% | 10 |
| arthord.NanoSatanMelee Beta | 7 | 4% | 9 |
| cx.Princess 1.0 | 4 | 2% | 7 |
| sadoner.killer 0.2 | 4 | 2% | 4 |
| kurios.DOSexe .9a | 2 | 1% | 2 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 160066 melee ticks, 44253 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 32 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 46223 sent, 41207 reached their opponent, 6131 virtual hits (14.9% of those reached).

