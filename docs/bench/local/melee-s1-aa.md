# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 101 over 6 battles (16.8 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 85.0 | 42 / 210 | 2.35 | 16.3% | 26362 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.8% | 139 |
| hadur2.Hadur 3.17.1aa | 2.0 | 16.3% | 42 |
| sgp.JollyNinja 3.53 | 3.5 | 11.4% | 17 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.8 | 11.3% | 4 |
| mz.MicroGodMelee 1 | 5.3 | 10.2% | 4 |
| lorneswork.Predator 1.0 | 5.3 | 10.0% | 4 |
| adt.Ar2 1.0 | 7.0 | 7.4% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.4% | 0 |
| skm.butterfly 1.0 | 8.8 | 5.0% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 86.0 | 5 / 35 | 4229 |
| 2 | 2 | 66.4 | 87.3 | 7 / 35 | 4612 |
| 3 | 2 | 65.3 | 83.5 | 5 / 35 | 4360 |
| 4 | 2 | 67.6 | 87.9 | 11 / 35 | 4807 |
| 5 | 2 | 64.1 | 80.6 | 4 / 35 | 4244 |
| 6 | 2 | 65.3 | 84.4 | 10 / 35 | 4110 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 111 | 7% |
| sgp.JollyNinja 3.53 | 22 | 45% |
| mz.MicroGodMelee 1 | 12 | 92% |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 78% |
| lorneswork.Predator 1.0 | 6 | 83% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 168 of 210 rounds, at a mean tick of 1099. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 115 | 68% | 131 |
| sgp.JollyNinja 3.53 | 21 | 13% | 25 |
| lorneswork.Predator 1.0 | 11 | 7% | 17 |
| mz.MicroGodMelee 1 | 10 | 6% | 20 |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 6% | 16 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 1 |

Posture (Hadur's M records, 203 rounds): 145375 melee ticks, 75417 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 57 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 46969 sent, 42578 reached their opponent, 9032 virtual hits (21.2% of those reached).

## Melee bench: F02

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 122 over 6 battles (20.3 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 83.5 | 77 / 210 | 2.49 | 17.1% | 25329 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.1% | 77 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 14.7% | 56 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 13.4% | 29 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.9% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.4% | 19 |
| Noran.BitchingElk 0.054 | 6.5 | 8.5% | 13 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 8.2% | 4 |
| sch.Simone 0.3d | 7.3 | 7.4% | 8 |
| stelo.PatternRobot 1.0 | 9.0 | 5.5% | 0 |
| fullsail.SweetTea 1.1 | 10.0 | 3.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 87.6 | 17 / 35 | 4720 |
| 2 | 1 | 66.3 | 85.4 | 13 / 35 | 4096 |
| 3 | 1 | 65.0 | 79.7 | 11 / 35 | 4393 |
| 4 | 1 | 64.7 | 80.0 | 11 / 35 | 3818 |
| 5 | 1 | 67.3 | 86.7 | 15 / 35 | 4390 |
| 6 | 1 | 65.0 | 81.6 | 10 / 35 | 3912 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 54 | 44% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 30 | 67% |
| com.cohesiva.robocode.ManOwaR 1.0 | 20 | 50% |
| Noran.BitchingElk 0.054 | 17 | 53% |
| sch.Simone 0.3d | 11 | 45% |
| lrem.micro.SpikeSoldier 0.4 | 6 | 83% |
| stelo.PatternRobot 1.0 | 4 | 100% |
| fullsail.SweetTea 1.1 | 1 | 0% |
| fnc.bandit.Bandit 5.2.0 | 1 | 0% |

Hadur died in 133 of 210 rounds, at a mean tick of 1024. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 47 | 35% | 66 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 24 | 18% | 49 |
| com.cohesiva.robocode.ManOwaR 1.0 | 15 | 11% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 11% | 20 |
| sch.Simone 0.3d | 11 | 8% | 13 |
| Noran.BitchingElk 0.054 | 10 | 8% | 18 |
| fnc.bandit.Bandit 5.2.0 | 6 | 5% | 8 |
| stelo.PatternRobot 1.0 | 4 | 3% | 6 |
| fullsail.SweetTea 1.1 | 2 | 2% | 3 |

Posture (Hadur's M records, 198 rounds): 164058 melee ticks, 48219 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 39 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 59082 sent, 54651 reached their opponent, 9848 virtual hits (18.0% of those reached).

## Melee bench: F03

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 209 over 6 battles (34.8 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 92.2 | 162 / 210 | 1.70 | 19.8% | 33259 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.8% | 162 |
| radnor.DoctorBob 1.42 | 2.5 | 14.1% | 22 |
| kawigi.nano.Lib 1.0 | 3.0 | 13.1% | 9 |
| vuen.Cake 2.51 | 3.5 | 12.9% | 15 |
| urdos.URDOS 1.3 | 5.0 | 9.3% | 1 |
| adt.Ar1 2.1 | 6.5 | 7.0% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 6.6% | 0 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.6% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.6% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 92.1 | 27 / 35 | 5712 |
| 2 | 1 | 69.4 | 89.8 | 29 / 35 | 5329 |
| 3 | 1 | 69.2 | 89.2 | 26 / 35 | 5437 |
| 4 | 1 | 70.2 | 94.0 | 25 / 35 | 5586 |
| 5 | 1 | 70.3 | 94.0 | 25 / 35 | 5726 |
| 6 | 1 | 70.5 | 94.3 | 30 / 35 | 5469 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 67 | 88% |
| radnor.DoctorBob 1.42 | 58 | 95% |
| kawigi.nano.Lib 1.0 | 43 | 93% |
| oa.weak.FlyMk1 0.1 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 50% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| adt.Ar1 2.1 | 1 | 100% |
| urdos.URDOS 1.3 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 776. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 22 | 43% | 69 |
| vuen.Cake 2.51 | 10 | 20% | 78 |
| kawigi.nano.Lib 1.0 | 6 | 12% | 35 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 10% | 7 |
| adt.Ar1 2.1 | 3 | 6% | 6 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 2% | 2 |
| urdos.URDOS 1.3 | 1 | 2% | 2 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 5 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 134769 melee ticks, 43204 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 80 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 41030 sent, 36715 reached their opponent, 10091 virtual hits (27.5% of those reached).

## Melee bench: F04

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 510 over 6 battles (85.0 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 84.3 | 30 / 210 | 2.41 | 16.6% | 28611 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.8% | 161 |
| hadur2.Hadur 3.17.1aa | 2.0 | 16.6% | 30 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.5% | 9 |
| TNT.TNT 0.99.1 | 4.0 | 10.7% | 7 |
| josago.Jorgito 0.16 | 5.3 | 9.4% | 2 |
| css.Delitioner 0.11 | 6.0 | 7.5% | 0 |
| tj.zombie1n 1.0.1 | 6.7 | 6.8% | 2 |
| rampancy.Durandal 2.1d | 8.0 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 3.7% | 0 |
| spin.Bugstard 0.012b | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 81.9 | 3 / 35 | 4235 |
| 2 | 2 | 66.6 | 86.0 | 4 / 35 | 4676 |
| 3 | 2 | 67.0 | 85.1 | 8 / 35 | 4681 |
| 4 | 2 | 68.3 | 85.4 | 5 / 35 | 5480 |
| 5 | 2 | 67.0 | 84.8 | 5 / 35 | 4711 |
| 6 | 2 | 66.4 | 82.5 | 5 / 35 | 4828 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 114 | 9% |
| apc.LeeroyJenkins2 1.0 | 16 | 63% |
| TNT.TNT 0.99.1 | 10 | 60% |
| tj.zombie1n 1.0.1 | 2 | 50% |
| josago.Jorgito 0.16 | 2 | 100% |
| sp.Nanos.Ember 1.1 | 1 | 100% |

Hadur died in 185 of 210 rounds, at a mean tick of 1256. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 119 | 64% | 131 |
| apc.LeeroyJenkins2 1.0 | 27 | 15% | 37 |
| TNT.TNT 0.99.1 | 16 | 9% | 20 |
| josago.Jorgito 0.16 | 14 | 8% | 18 |
| tj.zombie1n 1.0.1 | 3 | 2% | 3 |
| css.Delitioner 0.11 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 201982 melee ticks, 59375 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 50 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 61963 sent, 57447 reached their opponent, 9293 virtual hits (16.2% of those reached).

## Melee bench: F05

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 507 over 6 battles (84.5 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 73.2 | 16 / 210 | 3.41 | 13.5% | 19017 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 18.4% | 107 |
| justin.DemonicRage 3.4 | 1.8 | 17.2% | 67 |
| hadur2.Hadur 3.17.1aa | 3.2 | 13.5% | 16 |
| wompi.Numbat 2.1 | 3.8 | 12.8% | 12 |
| axeBots.HataMoto 3.09 | 5.2 | 9.8% | 7 |
| ms.Ares 0.19 | 5.8 | 9.4% | 1 |
| supersample.SuperBoxBot 1.0 | 7.3 | 5.5% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.2% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.1% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.7 | 69.2 | 1 / 35 | 3072 |
| 2 | 4 | 59.4 | 69.2 | 2 / 35 | 2893 |
| 3 | 3 | 61.1 | 71.7 | 1 / 35 | 3294 |
| 4 | 3 | 63.3 | 80.3 | 3 / 35 | 3389 |
| 5 | 3 | 61.1 | 73.0 | 5 / 35 | 3109 |
| 6 | 3 | 62.5 | 75.9 | 4 / 35 | 3260 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 35 | 3% |
| justin.DemonicRage 3.4 | 25 | 32% |
| wompi.Numbat 2.1 | 7 | 71% |
| axeBots.HataMoto 3.09 | 4 | 25% |
| ms.Ares 0.19 | 2 | 50% |

Hadur died in 198 of 210 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 69 | 35% | 70 |
| justin.DemonicRage 3.4 | 62 | 31% | 69 |
| wompi.Numbat 2.1 | 31 | 16% | 37 |
| axeBots.HataMoto 3.09 | 14 | 7% | 14 |
| ms.Ares 0.19 | 11 | 6% | 12 |
| davidalves.net.DuelistMicroMelee 1.4 | 5 | 3% | 5 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 156359 melee ticks, 23240 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 72 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 48763 sent, 44202 reached their opponent, 7873 virtual hits (17.8% of those reached).

## Melee bench: F06

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 517 over 6 battles (86.2 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 86.2 | 105 / 210 | 2.24 | 17.9% | 27118 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.9% | 105 |
| jekl.StoneGhost 0.7 | 2.3 | 15.2% | 31 |
| origin.SleepSiphon 1.7b | 2.7 | 14.5% | 47 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 11.7% | 14 |
| mld.Wisdom 1.0 | 5.0 | 10.2% | 1 |
| gg.Wolverine 2.0 | 6.0 | 8.2% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 7.0% | 10 |
| DBall.NUKE 0.1 | 8.3 | 5.8% | 1 |
| spinnercat.Omen 1.0 | 8.3 | 6.2% | 1 |
| sample.Fire 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 87.0 | 17 / 35 | 4532 |
| 2 | 1 | 67.0 | 82.2 | 17 / 35 | 4498 |
| 3 | 1 | 66.2 | 84.4 | 13 / 35 | 4194 |
| 4 | 1 | 68.8 | 89.8 | 20 / 35 | 4676 |
| 5 | 1 | 68.7 | 87.6 | 19 / 35 | 4692 |
| 6 | 1 | 68.0 | 86.0 | 19 / 35 | 4526 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 55 | 67% |
| jekl.StoneGhost 0.7 | 43 | 86% |
| pe.minimelee.SandboxMiniMelee 1.1 | 27 | 81% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 33% |
| mld.Wisdom 1.0 | 2 | 100% |
| gg.Wolverine 2.0 | 2 | 100% |
| DBall.NUKE 0.1 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 44 | 40% | 72 |
| jekl.StoneGhost 0.7 | 31 | 28% | 58 |
| pe.minimelee.SandboxMiniMelee 1.1 | 10 | 9% | 37 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 7% | 12 |
| mld.Wisdom 1.0 | 7 | 6% | 15 |
| gg.Wolverine 2.0 | 4 | 4% | 11 |
| spinnercat.Omen 1.0 | 1 | 1% | 1 |
| DBall.NUKE 0.1 | 0 | 0% | 3 |
| sample.Fire 1.0 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 149139 melee ticks, 41812 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 53 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 53 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 47728 sent, 43261 reached their opponent, 10259 virtual hits (23.7% of those reached).

## Melee bench: F07

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 185 over 6 battles (30.8 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 92.2 | 105 / 210 | 1.70 | 19.7% | 33994 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.7% | 105 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 17.5% | 51 |
| rtk.Tachikoma 1.0 | 2.8 | 16.2% | 33 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.5% | 6 |
| franzor.Lizt 1.3.1 | 4.8 | 10.8% | 16 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.3% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.3% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.3% | 0 |
| sample.Target 1.0 | 9.2 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 92.1 | 18 / 35 | 6010 |
| 2 | 1 | 71.4 | 93.3 | 17 / 35 | 5862 |
| 3 | 1 | 70.9 | 91.4 | 17 / 35 | 5431 |
| 4 | 1 | 70.9 | 91.4 | 15 / 35 | 5710 |
| 5 | 1 | 69.9 | 89.2 | 16 / 35 | 5025 |
| 6 | 1 | 72.3 | 95.6 | 22 / 35 | 5956 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 68 | 65% |
| rsalesc.melee.Monk 0.3.6c | 59 | 31% |
| franzor.Lizt 1.3.1 | 29 | 59% |
| oog.melee.CapuletDroid 1.1 | 26 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 1445. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 52 | 49% | 83 |
| rtk.Tachikoma 1.0 | 38 | 36% | 94 |
| franzor.Lizt 1.3.1 | 14 | 13% | 2 |
| oog.melee.CapuletDroid 1.1 | 2 | 2% | 27 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 3 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 194315 melee ticks, 90614 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 41 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 58810 sent, 54464 reached their opponent, 11783 virtual hits (21.6% of those reached).

## Melee bench: F08

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 595 over 6 battles (99.2 per battle, most in one battle 142). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 89.7 | 121 / 210 | 1.92 | 18.5% | 25954 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.5% | 121 |
| tm.Yuugao 1.0 | 2.3 | 13.5% | 36 |
| shrub.Vapour v159 | 2.7 | 12.7% | 22 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 9.7% | 6 |
| Krabb.sliNk.Garm 0.9u | 4.8 | 10.2% | 11 |
| m3thos.Eva00 1.1 | 6.2 | 8.8% | 3 |
| jwst.DAD.DarkAndDarker 1.1 | 6.3 | 8.3% | 8 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 7.0% | 2 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 5.8% | 0 |
| SHAM.WOW 1.4 | 9.5 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 85.4 | 20 / 35 | 4087 |
| 2 | 1 | 68.3 | 90.8 | 22 / 35 | 4214 |
| 3 | 1 | 68.6 | 92.4 | 19 / 35 | 4596 |
| 4 | 1 | 67.6 | 90.5 | 21 / 35 | 4092 |
| 5 | 1 | 68.4 | 92.1 | 20 / 35 | 4540 |
| 6 | 1 | 67.3 | 87.3 | 19 / 35 | 4425 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 53 | 68% |
| shrub.Vapour v159 | 37 | 65% |
| Krabb.sliNk.Garm 0.9u | 25 | 68% |
| com.spp.robocode.MostlyHarmless 010 | 19 | 89% |
| m3thos.Eva00 1.1 | 14 | 79% |
| jwst.DAD.DarkAndDarker 1.1 | 10 | 50% |
| qualidafial.MajorDick 1.0.1 | 7 | 86% |
| SHAM.WOW 1.4 | 6 | 83% |

Hadur died in 94 of 210 rounds, at a mean tick of 931. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 23 | 24% | 69 |
| shrub.Vapour v159 | 20 | 21% | 42 |
| Krabb.sliNk.Garm 0.9u | 15 | 16% | 26 |
| com.spp.robocode.MostlyHarmless 010 | 13 | 14% | 30 |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 10% | 16 |
| m3thos.Eva00 1.1 | 5 | 5% | 14 |
| SHAM.WOW 1.4 | 2 | 2% | 5 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 4 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 150440 melee ticks, 48822 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 43 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 49494 sent, 44985 reached their opponent, 8812 virtual hits (19.6% of those reached).

## Melee bench: F09

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 416 over 6 battles (69.3 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 75.9 | 53 / 210 | 3.17 | 14.9% | 19780 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.3% | 96 |
| hadur2.Hadur 3.17.1aa | 2.3 | 14.9% | 53 |
| kc.micro.Figment 1.0 | 2.7 | 14.8% | 30 |
| yagami.Tidus 0.11 | 4.3 | 10.7% | 2 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.1% | 13 |
| mc2.enemy.Original 0.9 | 5.8 | 9.0% | 14 |
| dft.Calliope 5.6 | 7.0 | 7.8% | 2 |
| step.nanoPri 1.0 | 8.2 | 5.7% | 0 |
| rdm.Dueler 0.4x | 9.3 | 4.9% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.0 | 68.9 | 8 / 35 | 3153 |
| 2 | 2 | 62.7 | 77.1 | 8 / 35 | 2917 |
| 3 | 2 | 63.5 | 78.1 | 9 / 35 | 3384 |
| 4 | 2 | 63.2 | 76.2 | 10 / 35 | 3377 |
| 5 | 2 | 64.5 | 80.3 | 11 / 35 | 3634 |
| 6 | 3 | 62.3 | 74.6 | 7 / 35 | 3315 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 49 | 20% |
| kc.micro.Figment 1.0 | 38 | 84% |
| mc2.enemy.Original 0.9 | 10 | 50% |
| pedersen.Grishnakh 1.0 | 6 | 33% |
| yagami.Tidus 0.11 | 3 | 100% |
| dft.Calliope 5.6 | 1 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 844. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 58 | 36% | 71 |
| kc.micro.Figment 1.0 | 37 | 23% | 68 |
| yagami.Tidus 0.11 | 20 | 13% | 24 |
| mc2.enemy.Original 0.9 | 19 | 12% | 22 |
| pedersen.Grishnakh 1.0 | 10 | 6% | 10 |
| robar.nano.Assertive_Melee 0.2 | 7 | 4% | 7 |
| dft.Calliope 5.6 | 5 | 3% | 7 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 152103 melee ticks, 35361 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 32 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 50282 sent, 45960 reached their opponent, 6924 virtual hits (15.1% of those reached).

## Melee bench: F10

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 234 over 6 battles (39.0 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 93.1 | 149 / 210 | 1.62 | 19.5% | 30174 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.5% | 149 |
| DTF.Kludgy 1.2b | 2.0 | 14.9% | 26 |
| ne.Chimera 1.2 | 3.2 | 13.0% | 11 |
| ejb.Polaris 1.0.1 | 3.8 | 12.0% | 14 |
| tvv.micro.Antares 1.1.1 | 5.5 | 9.7% | 4 |
| vStar.RAFzilla 2.15 | 5.5 | 10.0% | 4 |
| kurios.DOSexe .9b | 7.5 | 6.0% | 0 |
| sam.Samspin 1.0 | 8.3 | 5.6% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.3 | 5.0% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 92.4 | 24 / 35 | 4937 |
| 2 | 1 | 70.7 | 97.1 | 27 / 35 | 5211 |
| 3 | 1 | 70.9 | 95.6 | 28 / 35 | 5374 |
| 4 | 1 | 69.5 | 92.1 | 26 / 35 | 5050 |
| 5 | 1 | 67.5 | 86.0 | 19 / 35 | 4759 |
| 6 | 1 | 70.2 | 95.6 | 25 / 35 | 4843 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 53 | 74% |
| ejb.Polaris 1.0.1 | 42 | 83% |
| ne.Chimera 1.2 | 39 | 90% |
| vStar.RAFzilla 2.15 | 21 | 81% |
| tvv.micro.Antares 1.1.1 | 13 | 100% |
| kurios.DOSexe .9b | 6 | 100% |
| donjezza.Muncho 1.0 | 4 | 75% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 23 | 37% | 55 |
| ne.Chimera 1.2 | 15 | 24% | 37 |
| ejb.Polaris 1.0.1 | 11 | 17% | 62 |
| vStar.RAFzilla 2.15 | 5 | 8% | 20 |
| tvv.micro.Antares 1.1.1 | 3 | 5% | 17 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 5% | 4 |
| kurios.DOSexe .9b | 1 | 2% | 9 |
| donjezza.Muncho 1.0 | 1 | 2% | 3 |
| sam.Samspin 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 150937 melee ticks, 59058 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 64 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 49420 sent, 45057 reached their opponent, 9200 virtual hits (20.4% of those reached).

## Melee bench: F11

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 112 over 6 battles (18.7 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 79.0 | 62 / 210 | 2.89 | 15.4% | 20157 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.3 | 16.3% | 73 |
| hadur2.Hadur 3.17.1aa | 1.7 | 15.4% | 62 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.6% | 26 |
| djc.DynaBot 0.1.1 | 4.3 | 10.9% | 8 |
| br2.MobyDickBot 1.6 | 5.2 | 9.9% | 22 |
| rdt199.Warlord 0.73 | 6.0 | 9.0% | 11 |
| uji.YellohFellah 1.0 | 6.8 | 8.2% | 7 |
| KiraNL.Chupacabra 0.4 | 8.0 | 7.3% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 8.8 | 5.7% | 1 |
| stelo.MirrorNano 1.3 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 83.8 | 13 / 35 | 3664 |
| 2 | 1 | 64.0 | 83.2 | 12 / 35 | 3159 |
| 3 | 2 | 61.1 | 71.7 | 8 / 35 | 3221 |
| 4 | 2 | 62.7 | 77.5 | 9 / 35 | 3252 |
| 5 | 2 | 63.1 | 77.5 | 11 / 35 | 3500 |
| 6 | 2 | 63.5 | 80.6 | 9 / 35 | 3361 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 48 | 40% |
| cx.mini.Nimrod 0.55 | 18 | 67% |
| br2.MobyDickBot 1.6 | 17 | 47% |
| uji.YellohFellah 1.0 | 12 | 83% |
| djc.DynaBot 0.1.1 | 10 | 70% |
| rdt199.Warlord 0.73 | 10 | 60% |

Hadur died in 148 of 210 rounds, at a mean tick of 902. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 61 | 41% | 82 |
| cx.mini.Nimrod 0.55 | 31 | 21% | 41 |
| djc.DynaBot 0.1.1 | 14 | 9% | 20 |
| rdt199.Warlord 0.73 | 12 | 8% | 21 |
| br2.MobyDickBot 1.6 | 12 | 8% | 15 |
| uji.YellohFellah 1.0 | 9 | 6% | 19 |
| stelo.MirrorNano 1.3 | 4 | 3% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 2% | 3 |
| KiraNL.Chupacabra 0.4 | 2 | 1% | 2 |

Posture (Hadur's M records, 204 rounds): 157109 melee ticks, 36975 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 39 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 51436 sent, 46980 reached their opponent, 6631 virtual hits (14.1% of those reached).

## Melee bench: F12

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 747 over 6 battles (124.5 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 83.4 | 106 / 210 | 2.50 | 17.0% | 21484 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.2 | 17.0% | 106 |
| bts.wiki.RipCurl 0.9b | 2.5 | 13.9% | 39 |
| nat.PallasHawk 1.0 | 2.8 | 13.6% | 33 |
| darkcanuck.Leon 1.01 | 3.5 | 12.8% | 17 |
| brainfade.melee.Genghis 0.36 | 5.0 | 9.7% | 9 |
| jrm.Test0 1.0 | 6.0 | 8.3% | 4 |
| cs.sheldor.Talon 1.1 | 7.8 | 6.7% | 1 |
| jp.Perpy 16.0 | 8.0 | 6.8% | 1 |
| jaybot.bots.Oddball 4.0 | 8.8 | 5.6% | 1 |
| stuff.Vlad 0.1 | 9.3 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 82.9 | 19 / 35 | 3637 |
| 2 | 2 | 64.6 | 81.3 | 10 / 35 | 3544 |
| 3 | 1 | 65.1 | 79.4 | 20 / 35 | 3413 |
| 4 | 1 | 65.2 | 80.6 | 14 / 35 | 3691 |
| 5 | 1 | 67.8 | 89.5 | 21 / 35 | 3739 |
| 6 | 1 | 66.8 | 86.7 | 22 / 35 | 3460 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 43 | 86% |
| bts.wiki.RipCurl 0.9b | 37 | 70% |
| nat.PallasHawk 1.0 | 37 | 65% |
| brainfade.melee.Genghis 0.36 | 12 | 83% |
| jaybot.bots.Oddball 4.0 | 3 | 100% |
| jp.Perpy 16.0 | 3 | 100% |
| jrm.Test0 1.0 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 712. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 32 | 29% | 54 |
| nat.PallasHawk 1.0 | 24 | 22% | 51 |
| jrm.Test0 1.0 | 17 | 15% | 21 |
| darkcanuck.Leon 1.01 | 13 | 12% | 52 |
| brainfade.melee.Genghis 0.36 | 9 | 8% | 13 |
| jp.Perpy 16.0 | 5 | 5% | 8 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 3 |
| jaybot.bots.Oddball 4.0 | 2 | 2% | 6 |
| stuff.Vlad 0.1 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 134719 melee ticks, 36539 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 33 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 45917 sent, 41410 reached their opponent, 7208 virtual hits (17.4% of those reached).

## Melee bench: F13

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 92 over 6 battles (15.3 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 80.4 | 59 / 210 | 2.76 | 15.2% | 21730 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.7 | 16.6% | 44 |
| mn.Combat 3.25.0 | 1.8 | 16.3% | 75 |
| hadur2.Hadur 3.17.1aa | 2.5 | 15.2% | 59 |
| shinh.Entangled 0.3 | 4.3 | 12.6% | 17 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.8% | 13 |
| apc.Colossus2 0.17 | 6.2 | 8.0% | 0 |
| stelo.Wang 1.0 | 6.8 | 6.9% | 3 |
| ayk.WallHugger 1.0 | 8.5 | 4.9% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.6% | 0 |
| sample.Tracker 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.9 | 76.5 | 10 / 35 | 3622 |
| 2 | 2 | 65.8 | 85.1 | 12 / 35 | 3695 |
| 3 | 3 | 63.9 | 81.0 | 8 / 35 | 3399 |
| 4 | 2 | 64.6 | 81.6 | 11 / 35 | 3709 |
| 5 | 2 | 65.1 | 81.6 | 11 / 35 | 3925 |
| 6 | 3 | 62.4 | 76.8 | 7 / 35 | 3380 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 47 | 21% |
| ags.Glacier 0.2.11 | 44 | 80% |
| shinh.Entangled 0.3 | 13 | 77% |
| gh.micro.Gruweltje 0.7 | 9 | 22% |
| stelo.Wang 1.0 | 5 | 40% |

Hadur died in 154 of 210 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 54 | 35% | 68 |
| ags.Glacier 0.2.11 | 38 | 25% | 65 |
| gh.micro.Gruweltje 0.7 | 20 | 13% | 26 |
| shinh.Entangled 0.3 | 19 | 12% | 28 |
| stelo.Wang 1.0 | 9 | 6% | 11 |
| maribo.FollowFire 1 | 8 | 5% | 7 |
| apc.Colossus2 0.17 | 3 | 2% | 3 |
| ayk.WallHugger 1.0 | 2 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 150295 melee ticks, 37255 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 126 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 126 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 44915 sent, 40236 reached their opponent, 6933 virtual hits (17.2% of those reached).

## Melee bench: F14

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 248 over 6 battles (41.3 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 91.6 | 143 / 210 | 1.76 | 19.2% | 28837 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.2% | 143 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.8% | 17 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.5% | 27 |
| co.edu.usb.rc.LidisTron 1.0 | 4.8 | 9.8% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.0 | 9.7% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.5 | 8.5% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 6.5 | 9.1% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 8.8% | 13 |
| pa.Improved 1.0 | 9.0 | 5.7% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 90.2 | 23 / 35 | 4770 |
| 2 | 1 | 70.4 | 95.2 | 27 / 35 | 4874 |
| 3 | 1 | 67.2 | 86.7 | 19 / 35 | 4449 |
| 4 | 1 | 70.5 | 93.7 | 28 / 35 | 5212 |
| 5 | 1 | 68.9 | 90.2 | 24 / 35 | 4692 |
| 6 | 1 | 69.8 | 93.7 | 22 / 35 | 4840 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 76 | 86% |
| catcat20.shape.Theta 0.018 | 57 | 72% |
| sheldor.micro.PointInLineRRAL 1.0 | 19 | 47% |
| sanyi.mikrobi.Roberto 1.0 | 15 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 6 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 982. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 28 | 41% | 57 |
| simonton.micro.Sprout 1.1.3 | 20 | 29% | 82 |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 17% | 26 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 4% | 23 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 3% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 3% | 5 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 1% | 10 |
| pa.Improved 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 144491 melee ticks, 56435 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 56 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 45999 sent, 41790 reached their opponent, 10724 virtual hits (25.7% of those reached).

## Melee bench: F15

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 263 over 6 battles (43.8 per battle, most in one battle 102). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 82.4 | 85 / 210 | 2.59 | 17.0% | 25829 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.0% | 85 |
| emp.Yngwie 1.11 | 2.8 | 13.5% | 53 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.2% | 22 |
| mld.DustBunny 3.8 | 3.5 | 13.0% | 13 |
| kawigi.robot.Girl 1.2 | 5.3 | 10.2% | 21 |
| cb.nano.Insomnia 1.0 | 5.5 | 10.6% | 14 |
| lambdaxy.TBot 0.1 | 7.2 | 7.1% | 0 |
| Grystrion.TrackerWO 1.0 | 8.0 | 6.4% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.3 | 4.5% | 0 |
| divineomega.TrialBot 0.003 | 9.5 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 84.8 | 10 / 35 | 4350 |
| 2 | 1 | 67.3 | 85.1 | 18 / 35 | 4610 |
| 3 | 1 | 66.6 | 81.0 | 16 / 35 | 4547 |
| 4 | 1 | 64.1 | 79.4 | 11 / 35 | 3780 |
| 5 | 1 | 66.1 | 81.6 | 15 / 35 | 4407 |
| 6 | 1 | 65.9 | 82.5 | 15 / 35 | 4135 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 43 | 51% |
| kawigi.micro.Shiz 1.1 | 30 | 90% |
| mld.DustBunny 3.8 | 15 | 93% |
| cb.nano.Insomnia 1.0 | 14 | 86% |
| kawigi.robot.Girl 1.2 | 13 | 31% |
| divineomega.TrialBot 0.003 | 3 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 922. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 41 | 32% | 75 |
| mld.DustBunny 3.8 | 23 | 18% | 45 |
| kawigi.micro.Shiz 1.1 | 23 | 18% | 42 |
| kawigi.robot.Girl 1.2 | 16 | 13% | 18 |
| cb.nano.Insomnia 1.0 | 14 | 11% | 17 |
| divineomega.TrialBot 0.003 | 4 | 3% | 5 |
| lambdaxy.TBot 0.1 | 2 | 2% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 2% | 2 |
| Grystrion.TrackerWO 1.0 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 168652 melee ticks, 35495 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 58 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 54853 sent, 50246 reached their opponent, 8535 virtual hits (17.0% of those reached).

## Melee bench: F16

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 426 over 6 battles (71.0 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 84.2 | 93 / 210 | 2.42 | 17.8% | 28903 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.2 | 17.8% | 93 |
| gh.Griezel 0.5.2 | 1.8 | 16.5% | 60 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.2% | 6 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 11.0% | 31 |
| bvh.fnr.Fenrir 0.36l | 5.2 | 9.7% | 6 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.6% | 3 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.1% | 3 |
| divineomega.DivineBot 1.9.4.5 | 8.3 | 5.5% | 7 |
| repositorio.NanoStep 1.0 | 9.3 | 4.4% | 1 |
| asd.Cthulhu 1.3 | 9.3 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 81.3 | 14 / 35 | 4340 |
| 2 | 1 | 66.5 | 80.3 | 14 / 35 | 4738 |
| 3 | 1 | 67.9 | 83.2 | 16 / 35 | 5140 |
| 4 | 1 | 70.1 | 91.1 | 19 / 35 | 5296 |
| 5 | 1 | 66.7 | 82.9 | 15 / 35 | 4720 |
| 6 | 1 | 67.7 | 86.3 | 15 / 35 | 4669 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 75 | 60% |
| techdude.forest.FlamingForest 1.1 | 34 | 53% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 15 | 100% |
| divineomega.DivineBot 1.9.4.5 | 6 | 100% |
| bvh.fnr.Fenrir 0.36l | 5 | 100% |
| stelo.IntrinsicVolatility 1.4 | 3 | 67% |
| tvv.nano.Polaris 1.2 | 3 | 67% |

Hadur died in 121 of 210 rounds, at a mean tick of 1139. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 42 | 35% | 89 |
| techdude.forest.FlamingForest 1.1 | 30 | 25% | 45 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 18 | 15% | 33 |
| bvh.fnr.Fenrir 0.36l | 13 | 11% | 16 |
| stelo.IntrinsicVolatility 1.4 | 4 | 3% | 7 |
| asd.Cthulhu 1.3 | 4 | 3% | 5 |
| tvv.nano.Polaris 1.2 | 3 | 2% | 6 |
| repositorio.NanoStep 1.0 | 2 | 2% | 3 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 6 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 181860 melee ticks, 58250 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 39 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 58976 sent, 54528 reached their opponent, 9744 virtual hits (17.9% of those reached).

## Melee bench: F17

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 324 over 6 battles (54.0 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.0 | 96 / 210 | 2.17 | 18.4% | 30614 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.4% | 96 |
| oog.melee.Mercutio 1.0 | 2.8 | 13.2% | 34 |
| et.Predator 1.8 | 3.0 | 13.0% | 21 |
| cx.BlestPain 1.41 | 3.2 | 13.0% | 46 |
| ahf.NanoAndrew .4 | 5.3 | 10.3% | 8 |
| nic.Nicator 2.4 | 6.3 | 9.5% | 3 |
| maribo.melee.BMV 0.1 | 6.3 | 9.1% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.6% | 0 |
| tex.Longbot 0.4 | 8.7 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 89.8 | 19 / 35 | 5163 |
| 2 | 1 | 69.1 | 90.8 | 19 / 35 | 4947 |
| 3 | 1 | 66.8 | 81.9 | 11 / 35 | 5142 |
| 4 | 1 | 68.5 | 86.7 | 15 / 35 | 5492 |
| 5 | 1 | 67.2 | 82.9 | 13 / 35 | 4989 |
| 6 | 1 | 69.2 | 89.8 | 19 / 35 | 4881 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 51 | 63% |
| et.Predator 1.8 | 44 | 68% |
| cx.BlestPain 1.41 | 44 | 34% |
| ahf.NanoAndrew .4 | 12 | 83% |
| nic.Nicator 2.4 | 7 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 1140. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 37 | 32% | 57 |
| et.Predator 1.8 | 27 | 23% | 51 |
| oog.melee.Mercutio 1.0 | 26 | 22% | 57 |
| ahf.NanoAndrew .4 | 12 | 10% | 21 |
| maribo.melee.BMV 0.1 | 7 | 6% | 8 |
| nic.Nicator 2.4 | 4 | 3% | 11 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 4 |
| goblin.Bender 2.4 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 168023 melee ticks, 68939 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 49 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 56918 sent, 52438 reached their opponent, 12004 virtual hits (22.9% of those reached).

## Melee bench: F18

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 472 over 6 battles (78.7 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 89.6 | 124 / 210 | 1.94 | 18.7% | 26219 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.7% | 124 |
| morbid.MorbidPriest 1.0 | 2.3 | 13.6% | 34 |
| agd.Mooserwirt2 2.7 | 2.8 | 12.6% | 27 |
| uji.DBH 1.1 | 3.8 | 11.0% | 11 |
| spinnercat.Robovirus 2.718 | 5.5 | 9.2% | 6 |
| sigterm.Sigterm 1.0 | 6.2 | 8.8% | 7 |
| ratosh.Nobo 0.21 | 6.3 | 8.5% | 1 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 6.8% | 0 |
| stelo.WangRobot 1.0 | 9.3 | 5.3% | 0 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 86.7 | 19 / 35 | 4077 |
| 2 | 1 | 67.4 | 87.6 | 18 / 35 | 4339 |
| 3 | 1 | 68.0 | 87.6 | 21 / 35 | 4576 |
| 4 | 1 | 69.2 | 93.3 | 22 / 35 | 4493 |
| 5 | 1 | 67.5 | 87.6 | 21 / 35 | 4248 |
| 6 | 1 | 69.5 | 94.6 | 23 / 35 | 4486 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 59 | 68% |
| agd.Mooserwirt2 2.7 | 37 | 70% |
| uji.DBH 1.1 | 25 | 80% |
| sigterm.Sigterm 1.0 | 14 | 79% |
| spinnercat.Robovirus 2.718 | 11 | 73% |
| ratosh.Nobo 0.21 | 8 | 88% |
| stelo.WangRobot 1.0 | 6 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 910. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 29 | 33% | 71 |
| agd.Mooserwirt2 2.7 | 18 | 20% | 45 |
| uji.DBH 1.1 | 11 | 12% | 23 |
| sigterm.Sigterm 1.0 | 9 | 10% | 19 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 6 | 7% | 6 |
| ratosh.Nobo 0.21 | 5 | 6% | 14 |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 4% | 12 |
| spinnercat.Robovirus 2.718 | 4 | 4% | 11 |
| stelo.WangRobot 1.0 | 0 | 0% | 8 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 143351 melee ticks, 51208 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 65 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 48328 sent, 43840 reached their opponent, 10164 virtual hits (23.2% of those reached).

## Melee bench: F19

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 331 over 6 battles (55.2 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 95.6 | 185 / 210 | 1.40 | 21.4% | 33442 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 21.4% | 185 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 15.0% | 10 |
| mld.Infinity 2.2 | 3.3 | 12.3% | 8 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.4% | 3 |
| erdnis.Rover 0.3 | 4.5 | 10.7% | 1 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.3% | 0 |
| mbh.Mbh 0.1 | 7.3 | 7.2% | 0 |
| pac.ABC 2.1 | 7.7 | 7.0% | 3 |
| pbg.R2D2 1.0 | 8.8 | 5.8% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 96.5 | 31 / 35 | 5853 |
| 2 | 1 | 72.4 | 96.5 | 30 / 35 | 5632 |
| 3 | 1 | 73.1 | 97.1 | 31 / 35 | 5984 |
| 4 | 1 | 72.5 | 97.8 | 33 / 35 | 5389 |
| 5 | 1 | 71.0 | 92.4 | 29 / 35 | 5036 |
| 6 | 1 | 71.9 | 93.3 | 31 / 35 | 5548 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 103 | 96% |
| mld.Infinity 2.2 | 34 | 100% |
| erdnis.Rover 0.3 | 18 | 94% |
| krillr.mini.JointStrike 2.0.0 | 17 | 94% |
| pac.ABC 2.1 | 12 | 92% |
| pbg.R2D2 1.0 | 4 | 100% |
| patson.PatsonTestBot 1.0 | 2 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |

Hadur died in 27 of 210 rounds, at a mean tick of 733. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 9 | 33% | 77 |
| krillr.mini.JointStrike 2.0.0 | 8 | 30% | 29 |
| erdnis.Rover 0.3 | 5 | 19% | 35 |
| mld.Infinity 2.2 | 2 | 7% | 34 |
| pac.ABC 2.1 | 1 | 4% | 11 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 11 |
| mbh.Mbh 0.1 | 0 | 0% | 7 |
| pbg.R2D2 1.0 | 0 | 0% | 5 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 135417 melee ticks, 44220 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 34 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 45586 sent, 41431 reached their opponent, 10500 virtual hits (25.3% of those reached).

## Melee bench: F20

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 528 over 6 battles (88.0 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.3 | 126 / 210 | 1.96 | 19.3% | 30805 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.3% | 126 |
| trm.Wrekt 1.1.6.f | 2.0 | 16.1% | 32 |
| catcat20.Rabbit 0.001 | 3.8 | 11.0% | 26 |
| fwb.Nine 1.0.1 | 3.8 | 11.1% | 16 |
| nz.jdc.nano.GridFu 1.0 | 4.3 | 10.6% | 4 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.2% | 0 |
| bayen.nut.Squirrel 1.615 | 7.5 | 6.9% | 4 |
| djdjdj.NanoSkunk10 1.0 | 7.8 | 6.3% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 5.8% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 86.7 | 21 / 35 | 4945 |
| 2 | 1 | 70.1 | 91.7 | 23 / 35 | 5153 |
| 3 | 1 | 69.3 | 88.3 | 20 / 35 | 5351 |
| 4 | 1 | 69.9 | 91.1 | 20 / 35 | 5536 |
| 5 | 1 | 68.5 | 89.5 | 21 / 35 | 4672 |
| 6 | 1 | 69.4 | 88.6 | 21 / 35 | 5148 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 81 | 83% |
| fwb.Nine 1.0.1 | 27 | 93% |
| catcat20.Rabbit 0.001 | 26 | 62% |
| nz.jdc.nano.GridFu 1.0 | 9 | 100% |
| bayen.nut.Squirrel 1.615 | 7 | 86% |
| m3thos.mini.Eva01 0.5.5 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 0% |

Hadur died in 88 of 210 rounds, at a mean tick of 981. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 35 | 40% | 87 |
| catcat20.Rabbit 0.001 | 18 | 20% | 41 |
| fwb.Nine 1.0.1 | 16 | 18% | 26 |
| bayen.nut.Squirrel 1.615 | 5 | 6% | 15 |
| sample.MyFirstJuniorRobot 1.0 | 5 | 6% | 7 |
| m3thos.mini.Eva01 0.5.5 | 3 | 3% | 9 |
| nz.jdc.nano.GridFu 1.0 | 2 | 2% | 19 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 6 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 169756 melee ticks, 47654 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 33 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 54298 sent, 49765 reached their opponent, 12049 virtual hits (24.2% of those reached).

## Melee bench: F21

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 170 over 6 battles (28.3 per battle, most in one battle 116). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 92.5 | 129 / 210 | 1.68 | 19.8% | 31089 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.8% | 129 |
| eem.EvBot v4.6.16 | 2.0 | 16.9% | 64 |
| dummy.mini.Scimitar 1.01 | 3.2 | 13.9% | 5 |
| cf.RiO.RiOx 4.2.1 | 3.8 | 11.6% | 7 |
| oa.weak.BotherBot 0.1 | 5.5 | 7.5% | 0 |
| eld.Hmm 1.0 | 5.5 | 8.5% | 7 |
| el.JumpShoot 0.2 | 7.8 | 6.0% | 0 |
| fire219.CatBot 1.0 | 7.8 | 5.9% | 0 |
| PSW.Relentless 0.1 | 8.5 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 94.0 | 24 / 35 | 5341 |
| 2 | 1 | 70.2 | 90.8 | 22 / 35 | 5294 |
| 3 | 1 | 68.9 | 90.2 | 17 / 35 | 4862 |
| 4 | 1 | 70.3 | 92.4 | 19 / 35 | 5610 |
| 5 | 1 | 70.8 | 94.0 | 22 / 35 | 5158 |
| 6 | 1 | 70.4 | 93.7 | 25 / 35 | 4824 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 123 | 65% |
| dummy.mini.Scimitar 1.01 | 23 | 91% |
| cf.RiO.RiOx 4.2.1 | 21 | 95% |
| eld.Hmm 1.0 | 9 | 44% |
| el.JumpShoot 0.2 | 3 | 100% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 1364. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 49 | 59% | 111 |
| dummy.mini.Scimitar 1.01 | 12 | 14% | 46 |
| cf.RiO.RiOx 4.2.1 | 11 | 13% | 27 |
| eld.Hmm 1.0 | 5 | 6% | 15 |
| PSW.Relentless 0.1 | 4 | 5% | 4 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 5 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 183974 melee ticks, 80699 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 82 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 82 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 55083 sent, 50660 reached their opponent, 9362 virtual hits (18.5% of those reached).

## Melee bench: F22

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 205 over 6 battles (34.2 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 86.5 | 84 / 210 | 2.22 | 17.3% | 25681 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.2 | 17.3% | 84 |
| pe.SandboxDT 2.71m | 1.8 | 16.6% | 68 |
| kvk.HebusLeTroll 0.35 | 3.2 | 14.6% | 31 |
| jlm.javaDisturbance 0.59 | 3.8 | 13.4% | 19 |
| bigpete.Stewie 1.0 | 5.0 | 10.7% | 8 |
| yk.JahRoslav 1.1 | 6.5 | 7.0% | 0 |
| tad.Dalek98 0.98 | 6.7 | 6.7% | 0 |
| gg.Squaraus 0.6 | 8.2 | 6.1% | 0 |
| pbg.NinjaX 1.2 | 8.7 | 5.2% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 85.7 | 10 / 35 | 4128 |
| 2 | 1 | 66.9 | 85.7 | 15 / 35 | 4236 |
| 3 | 1 | 68.2 | 88.3 | 17 / 35 | 4402 |
| 4 | 1 | 66.4 | 84.8 | 10 / 35 | 4336 |
| 5 | 1 | 68.3 | 89.8 | 17 / 35 | 4255 |
| 6 | 2 | 67.0 | 84.4 | 15 / 35 | 4324 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 46 | 41% |
| kvk.HebusLeTroll 0.35 | 40 | 63% |
| jlm.javaDisturbance 0.59 | 33 | 73% |
| bigpete.Stewie 1.0 | 13 | 77% |
| yk.JahRoslav 1.1 | 2 | 100% |
| tad.Dalek98 0.98 | 2 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 969. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 46 | 36% | 69 |
| kvk.HebusLeTroll 0.35 | 37 | 29% | 55 |
| jlm.javaDisturbance 0.59 | 30 | 24% | 55 |
| bigpete.Stewie 1.0 | 10 | 8% | 17 |
| gg.Squaraus 0.6 | 2 | 2% | 4 |
| yk.JahRoslav 1.1 | 1 | 1% | 6 |
| tad.Dalek98 0.98 | 0 | 0% | 2 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 166377 melee ticks, 40687 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 25 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 53672 sent, 49296 reached their opponent, 8420 virtual hits (17.1% of those reached).

## Melee bench: F23

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 675 over 6 battles (112.5 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 94.0 | 165 / 210 | 1.54 | 20.6% | 31910 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 20.6% | 165 |
| pe.SandboxLump 1.52 | 2.0 | 16.5% | 23 |
| cre.Karolos 0.32 | 3.0 | 14.5% | 13 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.1% | 7 |
| stelo.RamTrackSurfer 1.2 | 5.0 | 9.5% | 2 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.2 | 8.7% | 0 |
| cw.megas.Blade 0.8 | 7.0 | 8.0% | 0 |
| sample.Walls 1.0 | 7.7 | 7.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 2.8% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 94.0 | 26 / 35 | 5438 |
| 2 | 1 | 70.3 | 87.9 | 23 / 35 | 5072 |
| 3 | 1 | 71.5 | 91.7 | 28 / 35 | 5388 |
| 4 | 1 | 72.4 | 97.5 | 29 / 35 | 5575 |
| 5 | 1 | 72.1 | 96.5 | 29 / 35 | 5023 |
| 6 | 1 | 72.7 | 96.5 | 30 / 35 | 5414 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 91 | 88% |
| cre.Karolos 0.32 | 64 | 92% |
| stelo.RamTrackSurfer 1.2 | 8 | 88% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 8 | 100% |
| stelo.AreaTargetingBot 1.1 | 5 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 19 | 37% | 90 |
| cre.Karolos 0.32 | 12 | 24% | 56 |
| stelo.AreaTargetingBot 1.1 | 7 | 14% | 25 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 8% | 7 |
| cw.megas.Blade 0.8 | 2 | 4% | 6 |
| stelo.RamTrackSurfer 1.2 | 1 | 2% | 14 |
| sample.Walls 1.0 | 0 | 0% | 5 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 133390 melee ticks, 44713 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 42 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 42075 sent, 37597 reached their opponent, 11681 virtual hits (31.1% of those reached).

## Melee bench: F24

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 285 over 6 battles (47.5 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 80.1 | 69 / 210 | 2.80 | 15.7% | 20978 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.2 | 15.7% | 69 |
| rz.GlowBlowMelee 1.4 | 2.2 | 14.0% | 43 |
| davidalves.Phoenix 0.54 | 3.8 | 12.5% | 34 |
| pedersen.Ugluk 1.1.1 | 4.0 | 12.4% | 26 |
| florent.XSeries.X2 0.12 | 4.0 | 12.8% | 29 |
| oog.melee.Corsair 1.0 | 5.8 | 9.6% | 4 |
| stelo.SoJNanoMelee 1.1 | 7.5 | 6.9% | 2 |
| lunchie.Lunchbox 0.93 | 7.8 | 6.3% | 0 |
| as.FrankTheTank 1.3 | 8.7 | 5.3% | 2 |
| evd.X1 0.01 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 80.3 | 11 / 35 | 3574 |
| 2 | 1 | 63.2 | 78.7 | 9 / 35 | 3419 |
| 3 | 1 | 65.9 | 84.1 | 14 / 35 | 3747 |
| 4 | 1 | 64.5 | 80.0 | 10 / 35 | 3610 |
| 5 | 2 | 61.5 | 73.7 | 10 / 35 | 3107 |
| 6 | 1 | 64.9 | 83.5 | 15 / 35 | 3521 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 33 | 48% |
| pedersen.Ugluk 1.1.1 | 25 | 72% |
| davidalves.Phoenix 0.54 | 23 | 39% |
| florent.XSeries.X2 0.12 | 22 | 59% |
| stelo.SoJNanoMelee 1.1 | 5 | 100% |
| oog.melee.Corsair 1.0 | 5 | 60% |
| as.FrankTheTank 1.3 | 2 | 100% |
| lunchie.Lunchbox 0.93 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 32 | 22% | 46 |
| florent.XSeries.X2 0.12 | 29 | 20% | 40 |
| davidalves.Phoenix 0.54 | 28 | 20% | 41 |
| pedersen.Ugluk 1.1.1 | 24 | 17% | 31 |
| oog.melee.Corsair 1.0 | 15 | 10% | 24 |
| stelo.SoJNanoMelee 1.1 | 7 | 5% | 13 |
| lunchie.Lunchbox 0.93 | 4 | 3% | 9 |
| as.FrankTheTank 1.3 | 1 | 1% | 4 |
| evd.X1 0.01 | 1 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 142522 melee ticks, 32422 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 40 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 48633 sent, 43844 reached their opponent, 8736 virtual hits (19.9% of those reached).

## Melee bench: F25

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 202 over 6 battles (33.7 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 83.6 | 117 / 210 | 2.48 | 17.2% | 20857 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.2% | 117 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.3% | 16 |
| voidious.mini.BrokenSword 2.0.3 | 2.7 | 13.5% | 22 |
| jdw.Hurricane 1.4 | 3.8 | 11.9% | 23 |
| ds.Oo 2.2 | 5.3 | 9.5% | 13 |
| gre.svman4.Morfeas 1.4.1 | 5.8 | 9.1% | 12 |
| awesomeness.Elite 1.0 | 7.0 | 7.6% | 4 |
| gjr.Cephalosporin 0.1 | 8.0 | 7.0% | 3 |
| adt.Ar2 1.1 | 8.8 | 6.7% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 81.6 | 19 / 35 | 3472 |
| 2 | 1 | 65.7 | 83.2 | 18 / 35 | 3546 |
| 3 | 1 | 68.0 | 88.3 | 24 / 35 | 3457 |
| 4 | 1 | 64.6 | 80.0 | 18 / 35 | 3259 |
| 5 | 1 | 66.6 | 86.0 | 19 / 35 | 3636 |
| 6 | 1 | 65.7 | 82.5 | 19 / 35 | 3487 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 42 | 81% |
| voidious.micro.BlitzBat 1.05 | 36 | 97% |
| jdw.Hurricane 1.4 | 25 | 80% |
| ds.Oo 2.2 | 12 | 75% |
| gre.svman4.Morfeas 1.4.1 | 10 | 70% |
| gjr.Cephalosporin 0.1 | 6 | 100% |
| awesomeness.Elite 1.0 | 4 | 75% |
| adt.Ar2 1.1 | 3 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 615. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 26 | 28% | 62 |
| jdw.Hurricane 1.4 | 18 | 19% | 31 |
| voidious.micro.BlitzBat 1.05 | 15 | 16% | 47 |
| ds.Oo 2.2 | 15 | 16% | 25 |
| gre.svman4.Morfeas 1.4.1 | 7 | 7% | 17 |
| awesomeness.Elite 1.0 | 5 | 5% | 9 |
| adt.Ar2 1.1 | 3 | 3% | 9 |
| gjr.Cephalosporin 0.1 | 2 | 2% | 8 |
| amk.ChumbaMini 0.2 | 2 | 2% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 127453 melee ticks, 28543 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 45 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 45 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 45838 sent, 41291 reached their opponent, 7214 virtual hits (17.5% of those reached).

## Melee bench: F26

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 114 over 6 battles (19.0 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 90.3 | 122 / 210 | 1.87 | 19.2% | 31982 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.2% | 122 |
| ak.Fermat 2.0 | 2.0 | 15.0% | 36 |
| lrem.Spectre 0.4.4 | 3.5 | 12.4% | 19 |
| shu.nitro.LENIN .T34 | 3.8 | 12.4% | 23 |
| js.PinBall 1.6 | 5.0 | 10.2% | 4 |
| jaybot.adv.bots.JayBot 2.0 | 5.8 | 9.6% | 2 |
| gh.mini.GrubbmOne 1.0 | 6.8 | 8.6% | 3 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.9% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 90.2 | 20 / 35 | 4872 |
| 2 | 1 | 70.1 | 92.7 | 22 / 35 | 5188 |
| 3 | 1 | 68.7 | 87.3 | 18 / 35 | 5232 |
| 4 | 1 | 70.4 | 92.7 | 23 / 35 | 5469 |
| 5 | 1 | 69.8 | 88.9 | 18 / 35 | 5639 |
| 6 | 1 | 69.9 | 90.2 | 21 / 35 | 5582 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 60 | 70% |
| shu.nitro.LENIN .T34 | 40 | 75% |
| lrem.Spectre 0.4.4 | 33 | 79% |
| jaybot.adv.bots.JayBot 2.0 | 10 | 80% |
| js.PinBall 1.6 | 10 | 90% |
| fullsail.LaxativeTeaTwo 1.0 | 6 | 83% |
| gh.mini.GrubbmOne 1.0 | 2 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 945. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 36 | 41% | 76 |
| shu.nitro.LENIN .T34 | 18 | 20% | 46 |
| lrem.Spectre 0.4.4 | 14 | 16% | 38 |
| js.PinBall 1.6 | 11 | 13% | 23 |
| jaybot.adv.bots.JayBot 2.0 | 7 | 8% | 19 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 1% | 6 |
| sample.SpinBot 1.0 | 1 | 1% | 1 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 206 rounds): 164917 melee ticks, 46422 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 24 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 54372 sent, 49822 reached their opponent, 13003 virtual hits (26.1% of those reached).

## Melee bench: F27

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 414 over 6 battles (69.0 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 72.0 | 115 / 210 | 3.52 | 16.3% | 26830 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.5 | 14.7% | 58 |
| hadur2.Hadur 3.17.1aa | 1.5 | 16.3% | 115 |
| EH.Eagle 1.0.6 | 3.2 | 11.7% | 9 |
| wee.Gem 1.8.4 | 5.0 | 10.0% | 17 |
| sheldor.melee.nano.TestMelee 0.1 | 5.5 | 9.7% | 6 |
| techdude.kombat.FlamingKombat 1.5 | 5.8 | 9.1% | 3 |
| throxbot.ThroxBot 0.1 | 6.8 | 8.4% | 2 |
| joe.ADinosaur 1.0 | 7.5 | 8.2% | 0 |
| caimano.Furia_Ceca 0.22 | 8.2 | 7.5% | 1 |
| cs.Grudge 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 57.4 | 50.8 | 9 / 35 | 4411 |
| 2 | 2 | 56.9 | 48.9 | 11 / 35 | 4333 |
| 3 | 1 | 68.6 | 87.9 | 26 / 35 | 4723 |
| 4 | 1 | 70.2 | 94.3 | 28 / 35 | 4730 |
| 5 | 2 | 59.6 | 56.5 | 13 / 35 | 4335 |
| 6 | 1 | 69.6 | 93.7 | 28 / 35 | 4298 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 66 | 85% |
| EH.Eagle 1.0.6 | 23 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 100% |
| caimano.Furia_Ceca 0.22 | 8 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 8 | 88% |
| throxbot.ThroxBot 0.1 | 5 | 80% |
| wee.Gem 1.8.4 | 4 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 473. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cs.Grudge 1.0 | 28 | 28% | 29 |
| mk.Alpha 0.2.1 | 23 | 23% | 70 |
| EH.Eagle 1.0.6 | 13 | 13% | 27 |
| caimano.Furia_Ceca 0.22 | 8 | 8% | 17 |
| techdude.kombat.FlamingKombat 1.5 | 6 | 6% | 17 |
| wee.Gem 1.8.4 | 6 | 6% | 12 |
| throxbot.ThroxBot 0.1 | 6 | 6% | 11 |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 4% | 20 |
| joe.ADinosaur 1.0 | 2 | 2% | 7 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 117428 melee ticks, 27632 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 66 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 38918 sent, 34735 reached their opponent, 9126 virtual hits (26.3% of those reached).

## Melee bench: F28

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 309 over 6 battles (51.5 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 88.1 | 122 / 210 | 2.07 | 17.6% | 20918 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.6% | 122 |
| kid.test.NightFox .2 | 2.0 | 14.8% | 34 |
| uji.Antique 1.0 | 3.3 | 12.3% | 24 |
| pfvicm.Sobieski 7.2.3b | 4.2 | 11.1% | 6 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.7% | 8 |
| ahr.ice.Ice 1.0.2 | 6.2 | 7.9% | 6 |
| amk.ChumbaWumba 0.3 | 6.8 | 8.0% | 8 |
| matt.advanced.Katana 1.0 | 8.2 | 6.4% | 2 |
| stelo.PianistNano 1.2 | 9.3 | 5.6% | 0 |
| stelo.Lifestealer 1.0 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 82.5 | 15 / 35 | 3366 |
| 2 | 1 | 65.5 | 83.5 | 16 / 35 | 3562 |
| 3 | 1 | 69.3 | 94.3 | 26 / 35 | 4077 |
| 4 | 1 | 67.7 | 92.4 | 22 / 35 | 3471 |
| 5 | 1 | 66.8 | 88.6 | 20 / 35 | 3316 |
| 6 | 1 | 66.1 | 87.3 | 23 / 35 | 3126 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 70 | 79% |
| uji.Antique 1.0 | 46 | 80% |
| qohnil.blot.BlotBot 3.61 | 14 | 71% |
| ahr.ice.Ice 1.0.2 | 9 | 67% |
| amk.ChumbaWumba 0.3 | 7 | 57% |
| pfvicm.Sobieski 7.2.3b | 6 | 83% |
| matt.advanced.Katana 1.0 | 3 | 67% |
| stelo.PianistNano 1.2 | 2 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 25 | 28% | 47 |
| uji.Antique 1.0 | 18 | 20% | 55 |
| pfvicm.Sobieski 7.2.3b | 15 | 17% | 25 |
| qohnil.blot.BlotBot 3.61 | 10 | 11% | 32 |
| amk.ChumbaWumba 0.3 | 10 | 11% | 20 |
| ahr.ice.Ice 1.0.2 | 6 | 7% | 15 |
| matt.advanced.Katana 1.0 | 3 | 3% | 7 |
| stelo.Lifestealer 1.0 | 1 | 1% | 3 |
| stelo.PianistNano 1.2 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 132930 melee ticks, 33016 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 25 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 45427 sent, 40942 reached their opponent, 6321 virtual hits (15.4% of those reached).

## Melee bench: F29

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 381 over 6 battles (63.5 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 83.3 | 87 / 210 | 2.50 | 17.4% | 24284 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.4% | 87 |
| deewiant.Anomaly 0.2 | 2.3 | 15.6% | 53 |
| zyx.mega.YersiniaPestis 3.1 | 2.7 | 14.8% | 42 |
| myl.micro.Troodon 1.10 | 4.2 | 12.3% | 9 |
| jok.PheonixM 0.1.2 | 4.8 | 10.8% | 9 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.1% | 2 |
| DBall.Anarchy 0.1 | 7.3 | 6.5% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 7.7 | 6.1% | 0 |
| ap.Frederick 1.1 | 9.0 | 4.7% | 3 |
| jangs.ns51 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 82.5 | 11 / 35 | 3897 |
| 2 | 1 | 67.2 | 85.7 | 13 / 35 | 3710 |
| 3 | 1 | 67.6 | 83.8 | 17 / 35 | 4336 |
| 4 | 1 | 68.5 | 86.0 | 18 / 35 | 4386 |
| 5 | 1 | 66.2 | 81.0 | 13 / 35 | 3952 |
| 6 | 1 | 66.4 | 81.0 | 15 / 35 | 4003 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 61 | 61% |
| zyx.mega.YersiniaPestis 3.1 | 36 | 61% |
| myl.micro.Troodon 1.10 | 20 | 80% |
| jok.PheonixM 0.1.2 | 12 | 75% |
| DBall.Anarchy 0.1 | 2 | 100% |
| ph.melee.ArcherME 0.3 | 2 | 50% |
| ap.Frederick 1.1 | 1 | 0% |

Hadur died in 126 of 210 rounds, at a mean tick of 947. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 55 | 44% | 97 |
| zyx.mega.YersiniaPestis 3.1 | 32 | 25% | 54 |
| myl.micro.Troodon 1.10 | 14 | 11% | 24 |
| jok.PheonixM 0.1.2 | 10 | 8% | 18 |
| ph.melee.ArcherME 0.3 | 6 | 5% | 7 |
| DBall.Anarchy 0.1 | 2 | 2% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 2% | 3 |
| jangs.ns51 1.0 | 1 | 1% | 3 |
| ap.Frederick 1.1 | 1 | 1% | 0 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 169489 melee ticks, 46828 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 48 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 54886 sent, 50496 reached their opponent, 8359 virtual hits (16.6% of those reached).

## Melee bench: F30

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 397 over 6 battles (66.2 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 74.4 | 43 / 210 | 3.30 | 14.4% | 20744 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.2 | 14.4% | 43 |
| catcat20.Matcha 0.006 | 2.7 | 13.7% | 45 |
| darkcanuck.B26354 1.06 | 2.8 | 13.6% | 43 |
| oog.melee.Capulet 1.2 | 4.2 | 12.8% | 31 |
| stelo.PastFuture 2.3.2 | 4.2 | 12.6% | 26 |
| intruder.PrairieWolf 2.61 | 6.3 | 8.9% | 7 |
| tripphippy.Alice 1.1 | 7.5 | 7.3% | 4 |
| ntc.Opposite 1.5 | 7.8 | 7.4% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 8.3 | 6.6% | 10 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.5 | 71.1 | 6 / 35 | 3345 |
| 2 | 1 | 62.0 | 74.6 | 5 / 35 | 3698 |
| 3 | 1 | 62.0 | 74.6 | 7 / 35 | 3313 |
| 4 | 1 | 60.7 | 70.8 | 5 / 35 | 3490 |
| 5 | 1 | 62.9 | 76.2 | 9 / 35 | 3534 |
| 6 | 1 | 63.5 | 79.0 | 11 / 35 | 3364 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 28 | 39% |
| oog.melee.Capulet 1.2 | 26 | 54% |
| darkcanuck.B26354 1.06 | 15 | 47% |
| stelo.PastFuture 2.3.2 | 10 | 40% |
| fowl3628800.LightningBolt 2.6.0 | 7 | 14% |
| intruder.PrairieWolf 2.61 | 5 | 40% |
| tripphippy.Alice 1.1 | 3 | 67% |
| ntc.Opposite 1.5 | 2 | 100% |

Hadur died in 171 of 210 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 39 | 23% | 47 |
| catcat20.Matcha 0.006 | 35 | 20% | 46 |
| oog.melee.Capulet 1.2 | 28 | 16% | 42 |
| stelo.PastFuture 2.3.2 | 28 | 16% | 35 |
| fowl3628800.LightningBolt 2.6.0 | 11 | 6% | 7 |
| intruder.PrairieWolf 2.61 | 10 | 6% | 12 |
| tripphippy.Alice 1.1 | 9 | 5% | 11 |
| ntc.Opposite 1.5 | 5 | 3% | 7 |
| GarmBox.Anger 1.0 | 3 | 2% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 160789 melee ticks, 31764 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 62 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 52064 sent, 47421 reached their opponent, 8543 virtual hits (18.0% of those reached).

## Melee bench: F31

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 489 over 6 battles (81.5 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 76.6 | 36 / 210 | 3.11 | 14.5% | 18779 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.7% | 106 |
| hadur2.Hadur 3.17.1aa | 2.3 | 14.5% | 36 |
| gh.mini.Griezel 0.2 | 2.8 | 13.7% | 49 |
| d414.nano.Quantum 1.0.0 | 4.2 | 11.7% | 8 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 10.2% | 6 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.8% | 2 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.9% | 1 |
| fm.mammillarias 1.3 | 8.2 | 5.9% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.1% | 1 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 73.3 | 7 / 35 | 3230 |
| 2 | 2 | 63.6 | 80.3 | 4 / 35 | 3262 |
| 3 | 3 | 61.6 | 74.6 | 4 / 35 | 3226 |
| 4 | 2 | 61.8 | 75.9 | 5 / 35 | 3021 |
| 5 | 2 | 63.3 | 80.0 | 10 / 35 | 3087 |
| 6 | 3 | 61.7 | 75.2 | 6 / 35 | 2953 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 51 | 33% |
| gh.mini.Griezel 0.2 | 21 | 24% |
| spinnercat.micro.Tyger 0.1 | 8 | 75% |
| d414.nano.Quantum 1.0.0 | 6 | 67% |
| timmit.nano.TimDog 0.33 | 3 | 67% |
| tlp.ThreeLeggedPig 1 | 1 | 0% |
| gh.nano.Grofvuil 0.2 | 1 | 100% |

Hadur died in 178 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 75 | 42% | 94 |
| gh.mini.Griezel 0.2 | 45 | 25% | 52 |
| d414.nano.Quantum 1.0.0 | 20 | 11% | 23 |
| spinnercat.micro.Tyger 0.1 | 16 | 9% | 20 |
| gh.nano.Grofvuil 0.2 | 7 | 4% | 7 |
| fm.mammillarias 1.3 | 5 | 3% | 6 |
| timmit.nano.TimDog 0.33 | 4 | 2% | 6 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 158867 melee ticks, 26173 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 39 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 51534 sent, 46842 reached their opponent, 7727 virtual hits (16.5% of those reached).

## Melee bench: F32

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 208 over 6 battles (34.7 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 87.6 | 101 / 210 | 2.11 | 17.4% | 23885 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.4% | 101 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.8% | 51 |
| apc.botM 3.0 | 3.3 | 12.4% | 27 |
| lxx.ConceptA 0.8 | 3.8 | 11.3% | 7 |
| vjik.UnViolation 1.1 | 5.0 | 9.9% | 9 |
| bayen.UbaMicro 1.4 | 5.8 | 8.7% | 7 |
| panzer.Panzer 0.2 | 7.3 | 7.1% | 1 |
| yk.JahMicro 1.0 | 7.7 | 6.9% | 3 |
| conscience.Electron 1.3g | 9.3 | 6.0% | 0 |
| donjezza.Jezza 1.0 | 9.7 | 5.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 82.5 | 14 / 35 | 3753 |
| 2 | 1 | 66.5 | 87.3 | 18 / 35 | 4020 |
| 3 | 1 | 65.4 | 86.0 | 15 / 35 | 3841 |
| 4 | 1 | 67.7 | 90.8 | 18 / 35 | 4343 |
| 5 | 1 | 67.3 | 91.1 | 17 / 35 | 4047 |
| 6 | 1 | 66.7 | 87.9 | 19 / 35 | 3881 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 72 | 57% |
| apc.botM 3.0 | 31 | 68% |
| lxx.ConceptA 0.8 | 16 | 63% |
| vjik.UnViolation 1.1 | 10 | 70% |
| donjezza.Jezza 1.0 | 10 | 80% |
| yk.JahMicro 1.0 | 8 | 75% |
| bayen.UbaMicro 1.4 | 7 | 86% |
| conscience.Electron 1.3g | 1 | 100% |
| panzer.Panzer 0.2 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 788. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 43 | 39% | 76 |
| lxx.ConceptA 0.8 | 26 | 24% | 39 |
| apc.botM 3.0 | 18 | 16% | 39 |
| bayen.UbaMicro 1.4 | 7 | 6% | 16 |
| vjik.UnViolation 1.1 | 5 | 5% | 15 |
| panzer.Panzer 0.2 | 4 | 4% | 5 |
| donjezza.Jezza 1.0 | 3 | 3% | 9 |
| conscience.Electron 1.3g | 2 | 2% | 5 |
| yk.JahMicro 1.0 | 1 | 1% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 130906 melee ticks, 48924 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 71 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 45175 sent, 40614 reached their opponent, 8191 virtual hits (20.2% of those reached).

## Melee bench: F33

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 483 over 6 battles (80.5 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 85.8 | 106 / 210 | 2.28 | 17.9% | 25481 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.9% | 106 |
| maribo.Quester 0.3 | 2.0 | 16.2% | 47 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.8% | 19 |
| gre.svman4.Leonidas 1.3.2 | 3.8 | 11.7% | 19 |
| labg.Cataclysm 2.05 | 5.3 | 10.5% | 17 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.2 | 9.0% | 3 |
| baal.nano.N 1.42 | 6.5 | 8.6% | 0 |
| zyx.micro.Ant 1.1 | 8.3 | 5.4% | 1 |
| sanja.First 0.1 | 9.0 | 4.3% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.7 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 92.7 | 24 / 35 | 4401 |
| 2 | 1 | 66.8 | 83.5 | 15 / 35 | 4154 |
| 3 | 1 | 65.7 | 81.6 | 13 / 35 | 4011 |
| 4 | 1 | 67.0 | 84.4 | 17 / 35 | 4055 |
| 5 | 1 | 67.7 | 84.4 | 17 / 35 | 4359 |
| 6 | 1 | 68.9 | 87.9 | 20 / 35 | 4501 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 54 | 72% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 77% |
| gre.svman4.Leonidas 1.3.2 | 27 | 89% |
| labg.Cataclysm 2.05 | 11 | 82% |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 100% |
| baal.nano.N 1.42 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 941. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 42 | 38% | 87 |
| gre.svman4.Leonidas 1.3.2 | 21 | 19% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 15% | 41 |
| labg.Cataclysm 2.05 | 9 | 8% | 21 |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 7% | 12 |
| zyx.micro.Ant 1.1 | 5 | 5% | 5 |
| baal.nano.N 1.42 | 2 | 2% | 6 |
| sanja.First 0.1 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 173375 melee ticks, 44053 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 80 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 56726 sent, 52198 reached their opponent, 8281 virtual hits (15.9% of those reached).

## Melee bench: F34

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 683 over 6 battles (113.8 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 86.7 | 77 / 210 | 2.20 | 17.4% | 26402 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.7 | 17.4% | 77 |
| stelo.Spread 0.9 | 1.8 | 16.8% | 74 |
| kid.Gladiator .7.2 | 2.5 | 16.4% | 38 |
| jcs.Seth 1.8 | 4.3 | 11.7% | 16 |
| tcf.Reach 3 | 4.7 | 10.8% | 4 |
| cli.Dancer 1.1 | 6.0 | 9.1% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 6.7% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.5% | 1 |
| sample.RamFire 1.0 | 9.8 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 89.8 | 15 / 35 | 4452 |
| 2 | 2 | 67.0 | 85.7 | 11 / 35 | 4039 |
| 3 | 2 | 67.3 | 84.4 | 10 / 35 | 4586 |
| 4 | 2 | 66.1 | 81.9 | 12 / 35 | 4006 |
| 5 | 1 | 69.7 | 91.4 | 19 / 35 | 4754 |
| 6 | 2 | 67.6 | 87.0 | 10 / 35 | 4565 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 57 | 35% |
| kid.Gladiator .7.2 | 55 | 62% |
| jcs.Seth 1.8 | 24 | 58% |
| tcf.Reach 3 | 7 | 57% |
| amk.Punbot.Punbot 0.01 | 3 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |
| cli.Dancer 1.1 | 1 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 1105. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 60 | 43% | 86 |
| kid.Gladiator .7.2 | 46 | 33% | 70 |
| jcs.Seth 1.8 | 18 | 13% | 34 |
| tcf.Reach 3 | 5 | 4% | 11 |
| ratosh.Wesco 1.4 | 3 | 2% | 6 |
| cli.Dancer 1.1 | 1 | 1% | 2 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 177640 melee ticks, 60738 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 32 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 55174 sent, 50642 reached their opponent, 8628 virtual hits (17.0% of those reached).

## Melee bench: F35

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 396 over 6 battles (66.0 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 80.7 | 37 / 210 | 2.74 | 15.1% | 19345 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.7% | 148 |
| hadur2.Hadur 3.17.1aa | 2.0 | 15.1% | 37 |
| gh.mini.Gruwel 0.9 | 3.3 | 13.0% | 17 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.2 | 11.9% | 8 |
| rz.HawkOnFire 0.1 | 4.5 | 11.9% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6.7 | 6.6% | 0 |
| wit.Chuliath 1.0 | 6.8 | 6.5% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.0 | 5.5% | 0 |
| dans.Cinnamon 1.2 | 9.2 | 4.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 80.0 | 8 / 35 | 3288 |
| 2 | 2 | 64.6 | 83.2 | 9 / 35 | 3243 |
| 3 | 2 | 63.1 | 79.0 | 3 / 35 | 3352 |
| 4 | 2 | 64.7 | 82.9 | 8 / 35 | 3235 |
| 5 | 2 | 64.4 | 82.5 | 7 / 35 | 3347 |
| 6 | 2 | 61.3 | 76.5 | 2 / 35 | 2880 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 77 | 13% |
| gh.mini.Gruwel 0.9 | 17 | 59% |
| dmh.robocode.robot.BlackDeath 9.2 | 11 | 73% |
| rz.HawkOnFire 0.1 | 8 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 176 of 210 rounds, at a mean tick of 911. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 101 | 57% | 113 |
| gh.mini.Gruwel 0.9 | 25 | 14% | 34 |
| dmh.robocode.robot.BlackDeath 9.2 | 25 | 14% | 33 |
| rz.HawkOnFire 0.1 | 16 | 9% | 24 |
| wit.Chuliath 1.0 | 4 | 2% | 4 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 144508 melee ticks, 44019 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 48 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 45808 sent, 41334 reached their opponent, 6780 virtual hits (16.4% of those reached).

## Melee bench: F36

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 327 over 6 battles (54.5 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 91.1 | 142 / 210 | 1.80 | 19.6% | 28116 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.6% | 142 |
| alpha.RainingFire 1.0 | 2.3 | 12.6% | 21 |
| bzdp.Pansy 2.1 | 2.7 | 12.2% | 18 |
| bvh.micro.Freya 0.3 | 4.8 | 10.7% | 11 |
| mz.Cork 0.1 | 4.8 | 10.8% | 6 |
| m3thos.Eva02 0.7.1 | 5.7 | 9.9% | 7 |
| bvh.mini.Fenrir 0.39 | 6.7 | 9.2% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 5.9% | 0 |
| dl.BetterWalls 1.0 | 8.7 | 5.2% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.8% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 94.0 | 26 / 35 | 4988 |
| 2 | 1 | 67.9 | 87.9 | 19 / 35 | 4480 |
| 3 | 1 | 67.1 | 84.8 | 20 / 35 | 4314 |
| 4 | 1 | 70.4 | 93.3 | 25 / 35 | 4825 |
| 5 | 1 | 70.4 | 94.3 | 26 / 35 | 4772 |
| 6 | 1 | 70.2 | 92.4 | 26 / 35 | 4737 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.micro.Freya 0.3 | 35 | 83% |
| bzdp.Pansy 2.1 | 33 | 82% |
| mz.Cork 0.1 | 31 | 94% |
| alpha.RainingFire 1.0 | 31 | 81% |
| m3thos.Eva02 0.7.1 | 16 | 81% |
| bvh.mini.Fenrir 0.39 | 11 | 100% |
| sample.MyFirstRobot 1.0 | 4 | 100% |
| dl.BetterWalls 1.0 | 3 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 861. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 21 | 29% | 48 |
| alpha.RainingFire 1.0 | 16 | 22% | 39 |
| bvh.micro.Freya 0.3 | 16 | 22% | 33 |
| m3thos.Eva02 0.7.1 | 7 | 10% | 27 |
| bvh.mini.Fenrir 0.39 | 5 | 7% | 15 |
| mz.Cork 0.1 | 3 | 4% | 34 |
| squidM.TentalceMeleeNano 1.1 | 2 | 3% | 4 |
| dl.BetterWalls 1.0 | 0 | 0% | 6 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 149868 melee ticks, 45177 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 49 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 52662 sent, 48190 reached their opponent, 10485 virtual hits (21.8% of those reached).

## Melee bench: F37

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 206 over 6 battles (34.3 per battle, most in one battle 103). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 88.2 | 155 / 210 | 2.06 | 18.6% | 29780 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.6% | 155 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.8 | 10.4% | 4 |
| germ.TheMind .2 | 2.8 | 10.8% | 7 |
| EBBU.Sim2 1.02 | 4.2 | 9.7% | 2 |
| agrach.Dalek 1.0 | 5.5 | 9.2% | 15 |
| lmk.ACPFinal 0.1 | 6.7 | 8.8% | 9 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.7% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 7.7 | 8.6% | 2 |
| mb.Beast 0.1 | 7.7 | 8.2% | 8 |
| skm.Ryubot 1.0 | 9.8 | 7.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 91.7 | 30 / 35 | 5470 |
| 2 | 1 | 66.8 | 88.3 | 24 / 35 | 4842 |
| 3 | 1 | 64.7 | 80.0 | 23 / 35 | 4538 |
| 4 | 1 | 66.8 | 85.4 | 23 / 35 | 5040 |
| 5 | 1 | 67.8 | 90.8 | 26 / 35 | 4755 |
| 6 | 1 | 68.8 | 93.0 | 29 / 35 | 5135 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 30 | 93% |
| EBBU.Sim2 1.02 | 23 | 100% |
| mb.Beast 0.1 | 22 | 100% |
| stelo.UntouchableNano 1.3 | 22 | 95% |
| germ.TheMind .2 | 20 | 95% |
| lmk.ACPFinal 0.1 | 17 | 76% |
| com.syncleus.robocode.Dreadnaught 0.1 | 17 | 100% |
| skm.Ryubot 1.0 | 11 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 50% |

Hadur died in 57 of 210 rounds, at a mean tick of 436. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 17 | 30% | 25 |
| lmk.ACPFinal 0.1 | 13 | 23% | 24 |
| EBBU.Sim2 1.02 | 8 | 14% | 29 |
| agrach.Dalek 1.0 | 6 | 11% | 35 |
| germ.TheMind .2 | 5 | 9% | 19 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4 | 7% | 28 |
| mb.Beast 0.1 | 2 | 4% | 18 |
| stelo.UntouchableNano 1.3 | 1 | 2% | 25 |
| skm.Ryubot 1.0 | 0 | 0% | 6 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 100908 melee ticks, 27876 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 74 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 74 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 34289 sent, 30022 reached their opponent, 9200 virtual hits (30.6% of those reached).

## Melee bench: F38

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 401 over 6 battles (66.8 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 83.3 | 94 / 210 | 2.50 | 16.7% | 23003 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.5 | 16.3% | 65 |
| hadur2.Hadur 3.17.1aa | 1.5 | 16.7% | 94 |
| bvh.mini.Freya 0.55 | 3.3 | 12.7% | 15 |
| bts.mega.Gnarly 1.4 | 4.2 | 11.6% | 18 |
| cs.Wren 1.0 | 4.8 | 11.1% | 8 |
| kdf.KoulDestroyer 1.0 | 6.2 | 9.5% | 7 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.5 | 9.0% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.3 | 5.5% | 0 |
| matt.UnderDark3 2.4.34 | 9.0 | 4.0% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.5 | 80.3 | 14 / 35 | 3416 |
| 2 | 1 | 67.0 | 87.0 | 19 / 35 | 3959 |
| 3 | 2 | 64.7 | 79.0 | 13 / 35 | 3741 |
| 4 | 1 | 67.7 | 88.9 | 21 / 35 | 4017 |
| 5 | 1 | 65.8 | 84.1 | 14 / 35 | 3986 |
| 6 | 2 | 65.7 | 80.6 | 13 / 35 | 3884 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 51 | 61% |
| bts.mega.Gnarly 1.4 | 26 | 77% |
| cs.Wren 1.0 | 18 | 83% |
| bvh.mini.Freya 0.55 | 16 | 69% |
| kdf.KoulDestroyer 1.0 | 13 | 85% |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 52 | 43% | 82 |
| bvh.mini.Freya 0.55 | 17 | 14% | 30 |
| bts.mega.Gnarly 1.4 | 16 | 13% | 33 |
| cs.Wren 1.0 | 12 | 10% | 28 |
| kdf.KoulDestroyer 1.0 | 12 | 10% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 3% | 10 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 2% | 4 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 1 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 141268 melee ticks, 31602 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 58 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 47270 sent, 42472 reached their opponent, 9706 virtual hits (22.9% of those reached).

## Melee bench: F39

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 522 over 6 battles (87.0 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 84.8 | 85 / 210 | 2.37 | 17.2% | 26381 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.2% | 85 |
| bvh.fry.Freya 0.82 | 2.2 | 14.9% | 26 |
| az.Ololobot 0.2.4 | 2.8 | 13.1% | 62 |
| catcat20.Lambda 0.024 | 4.0 | 11.4% | 28 |
| gimp.GimpBot 0.1 | 5.8 | 8.3% | 2 |
| apollokidd.ApolloKidd 0.9 | 6.7 | 8.1% | 1 |
| winamp32.micro.MicroMacro 1.0 | 6.7 | 8.2% | 2 |
| stelo.SoRobotNanoMelee 1.2 | 6.8 | 7.7% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.9% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 81.6 | 13 / 35 | 4098 |
| 2 | 1 | 67.2 | 87.9 | 17 / 35 | 4700 |
| 3 | 1 | 67.9 | 88.6 | 18 / 35 | 4735 |
| 4 | 1 | 64.9 | 83.2 | 11 / 35 | 4106 |
| 5 | 1 | 66.5 | 86.0 | 15 / 35 | 4415 |
| 6 | 1 | 64.8 | 81.3 | 11 / 35 | 4327 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 50 | 42% |
| bvh.fry.Freya 0.82 | 46 | 74% |
| catcat20.Lambda 0.024 | 29 | 48% |
| stelo.SoRobotNanoMelee 1.2 | 7 | 100% |
| winamp32.micro.MicroMacro 1.0 | 5 | 100% |
| gimp.GimpBot 0.1 | 3 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 1031. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 48 | 37% | 76 |
| az.Ololobot 0.2.4 | 41 | 32% | 63 |
| catcat20.Lambda 0.024 | 18 | 14% | 26 |
| stelo.SoRobotNanoMelee 1.2 | 7 | 5% | 11 |
| gimp.GimpBot 0.1 | 4 | 3% | 13 |
| apollokidd.ApolloKidd 0.9 | 3 | 2% | 6 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 8 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 4 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 167079 melee ticks, 49338 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 63 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 53761 sent, 49266 reached their opponent, 9544 virtual hits (19.4% of those reached).

## Melee bench: F40

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 206 over 6 battles (34.3 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 87.5 | 113 / 210 | 2.13 | 18.2% | 25535 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.2% | 113 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.3% | 35 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.4% | 24 |
| mz.AntiGrav 1.0 | 4.2 | 11.3% | 12 |
| Polkwane.SmashMelee 1.0 | 4.7 | 10.7% | 10 |
| stelo.Randomness 1.0 | 6.3 | 9.3% | 9 |
| alpha.BlackIce 1.0 | 6.7 | 8.6% | 4 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.4% | 2 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 4.5% | 1 |
| sample.Corners 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 88.6 | 24 / 35 | 4539 |
| 2 | 1 | 68.9 | 89.2 | 20 / 35 | 4429 |
| 3 | 1 | 69.5 | 90.5 | 20 / 35 | 4737 |
| 4 | 1 | 67.1 | 87.3 | 19 / 35 | 3996 |
| 5 | 1 | 66.3 | 83.5 | 14 / 35 | 3866 |
| 6 | 1 | 67.0 | 85.7 | 16 / 35 | 3968 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 69 | 83% |
| kano.gamma.KanoGamma 1.8 | 27 | 63% |
| mz.AntiGrav 1.0 | 23 | 74% |
| Polkwane.SmashMelee 1.0 | 12 | 83% |
| stelo.Randomness 1.0 | 9 | 44% |
| alpha.BlackIce 1.0 | 9 | 67% |
| sample.Corners 1.0 | 2 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 0% |

Hadur died in 98 of 210 rounds, at a mean tick of 847. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 38 | 39% | 81 |
| kano.gamma.KanoGamma 1.8 | 17 | 17% | 44 |
| mz.AntiGrav 1.0 | 15 | 15% | 33 |
| Polkwane.SmashMelee 1.0 | 8 | 8% | 17 |
| stelo.Randomness 1.0 | 8 | 8% | 16 |
| alpha.BlackIce 1.0 | 7 | 7% | 12 |
| amk.superstrike.SuperStrike 0.3 | 4 | 4% | 4 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 155217 melee ticks, 39739 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 56 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 51610 sent, 46941 reached their opponent, 10242 virtual hits (21.8% of those reached).

## Melee bench: F41

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 620 over 6 battles (103.3 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 84.2 | 82 / 210 | 2.42 | 16.6% | 22284 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.3 | 16.6% | 82 |
| eem.EvBotNG v12.8 | 1.7 | 16.3% | 84 |
| lessonz.robocode.Oz 0.5.0 | 3.2 | 13.2% | 24 |
| ary.Swarm 1.1 | 4.0 | 12.8% | 11 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.8% | 7 |
| shrub.Silver v048 | 5.8 | 9.1% | 3 |
| zyx.nano.Ant 1.1 | 7.0 | 7.7% | 0 |
| stelo.Mirror 1.1 | 8.3 | 5.6% | 1 |
| jsal.Jsalbot 1.0 | 8.7 | 5.6% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 88.3 | 18 / 35 | 3950 |
| 2 | 1 | 65.2 | 80.6 | 15 / 35 | 3654 |
| 3 | 2 | 64.9 | 81.6 | 10 / 35 | 3628 |
| 4 | 1 | 66.1 | 86.3 | 13 / 35 | 3580 |
| 5 | 2 | 65.8 | 84.4 | 12 / 35 | 3590 |
| 6 | 1 | 66.8 | 84.1 | 14 / 35 | 3882 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 80 | 43% |
| ary.Swarm 1.1 | 23 | 87% |
| lessonz.robocode.Oz 0.5.0 | 21 | 62% |
| simonton.nano.MeleeSeed 1.8 | 12 | 100% |
| stelo.Mirror 1.1 | 2 | 100% |
| shrub.Silver v048 | 1 | 0% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 949. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 66 | 50% | 95 |
| lessonz.robocode.Oz 0.5.0 | 21 | 16% | 30 |
| ary.Swarm 1.1 | 20 | 15% | 44 |
| simonton.nano.MeleeSeed 1.8 | 11 | 8% | 24 |
| shrub.Silver v048 | 6 | 5% | 9 |
| stelo.Mirror 1.1 | 2 | 2% | 4 |
| jsal.Jsalbot 1.0 | 2 | 2% | 3 |
| zyx.nano.Ant 1.1 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 154661 melee ticks, 48506 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 70 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 51861 sent, 47238 reached their opponent, 7803 virtual hits (16.5% of those reached).

## Melee bench: F42

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 198 over 6 battles (33.0 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 90.1 | 126 / 210 | 1.90 | 19.1% | 30541 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.1% | 126 |
| wompi.Wallaby 5.1 | 2.0 | 15.6% | 43 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.4% | 15 |
| ara.Shera 0.88 | 3.7 | 13.0% | 23 |
| amz.NanoClone 1.41 | 5.0 | 9.3% | 0 |
| dsw.StaticD 1.0 | 6.0 | 7.4% | 3 |
| maribo.IotaCT 1.1 | 7.7 | 6.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 8.5 | 5.3% | 0 |
| stelo.MirrorMicro 1.0 | 8.8 | 5.3% | 0 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 90.8 | 18 / 35 | 4917 |
| 2 | 1 | 68.6 | 89.5 | 21 / 35 | 4686 |
| 3 | 1 | 70.4 | 90.8 | 23 / 35 | 5650 |
| 4 | 1 | 70.1 | 92.4 | 23 / 35 | 5344 |
| 5 | 1 | 69.6 | 90.2 | 24 / 35 | 4993 |
| 6 | 1 | 67.9 | 86.7 | 17 / 35 | 4951 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 86 | 84% |
| maribo.mini.MiniQuester 0.1 | 37 | 84% |
| ara.Shera 0.88 | 29 | 52% |
| dsw.StaticD 1.0 | 6 | 83% |
| amz.NanoClone 1.41 | 2 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 933. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 31 | 36% | 49 |
| wompi.Wallaby 5.1 | 28 | 33% | 99 |
| maribo.mini.MiniQuester 0.1 | 18 | 21% | 46 |
| amz.NanoClone 1.41 | 4 | 5% | 5 |
| dsw.StaticD 1.0 | 2 | 2% | 8 |
| maribo.IotaCT 1.1 | 1 | 1% | 2 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 166135 melee ticks, 46497 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 55 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 53839 sent, 49377 reached their opponent, 10364 virtual hits (21.0% of those reached).

## Melee bench: F43

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 707 over 6 battles (117.8 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 80.2 | 38 / 210 | 2.78 | 15.2% | 20604 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.8% | 140 |
| hadur2.Hadur 3.17.1aa | 2.0 | 15.2% | 38 |
| brainfade.melee.Dusk 0.44 | 3.0 | 12.6% | 24 |
| dummy.micro.Sparrow 2.5 | 4.3 | 11.2% | 6 |
| wcsv.melee.EngineerMelee 0.1 | 5.2 | 10.5% | 3 |
| Krabb.akim2.Akim2 1.1b | 5.5 | 10.1% | 0 |
| jab.DiamondStealer 5 | 7.3 | 7.5% | 0 |
| mz.NanoGod 2.02 | 7.7 | 7.5% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.0% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.0 | 81.0 | 4 / 35 | 3518 |
| 2 | 2 | 66.8 | 85.7 | 7 / 35 | 3862 |
| 3 | 2 | 65.4 | 81.9 | 9 / 35 | 3518 |
| 4 | 2 | 64.2 | 78.4 | 6 / 35 | 3240 |
| 5 | 2 | 62.9 | 74.9 | 4 / 35 | 3118 |
| 6 | 2 | 64.7 | 79.4 | 8 / 35 | 3348 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 79 | 22% |
| brainfade.melee.Dusk 0.44 | 20 | 45% |
| dummy.micro.Sparrow 2.5 | 7 | 57% |
| Krabb.akim2.Akim2 1.1b | 5 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 100% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 179 of 210 rounds, at a mean tick of 1010. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 103 | 58% | 122 |
| brainfade.melee.Dusk 0.44 | 27 | 15% | 35 |
| dummy.micro.Sparrow 2.5 | 20 | 11% | 23 |
| wcsv.melee.EngineerMelee 0.1 | 11 | 6% | 12 |
| Krabb.akim2.Akim2 1.1b | 5 | 3% | 9 |
| mz.NanoGod 2.02 | 4 | 2% | 6 |
| cvt.Firsty 1.0 | 1 | 1% | 2 |
| jab.DiamondStealer 5 | 1 | 1% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 162673 melee ticks, 54021 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 66 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 0.

Targeting waves (209 rounds): 52468 sent, 47793 reached their opponent, 8218 virtual hits (17.2% of those reached).

## Melee bench: F44

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 268 over 6 battles (44.7 per battle, most in one battle 109). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 91.3 | 134 / 210 | 1.78 | 19.9% | 31690 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.9% | 134 |
| stelo.Liblix 0.3.1 | 2.0 | 15.6% | 48 |
| tzu.TheArtOfWar 1.2 | 3.0 | 14.1% | 23 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.3 | 9.5% | 1 |
| jwirde.Gort 2.0 | 5.0 | 9.3% | 4 |
| disan.Chair 2.2.0 | 6.7 | 7.7% | 1 |
| wompi.Quokka 1.6 | 6.8 | 7.7% | 1 |
| stf.PanzerGeneral 0.1 | 7.2 | 7.2% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.4% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 94.9 | 23 / 35 | 5477 |
| 2 | 1 | 71.9 | 95.2 | 27 / 35 | 5751 |
| 3 | 1 | 68.5 | 87.0 | 21 / 35 | 5083 |
| 4 | 1 | 69.5 | 87.9 | 17 / 35 | 5442 |
| 5 | 1 | 70.6 | 94.0 | 25 / 35 | 5048 |
| 6 | 1 | 69.1 | 88.9 | 21 / 35 | 4889 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 76 | 63% |
| tzu.TheArtOfWar 1.2 | 60 | 85% |
| jwirde.Gort 2.0 | 13 | 92% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 9 | 100% |
| disan.Chair 2.2.0 | 9 | 100% |
| wompi.Quokka 1.6 | 2 | 100% |
| sample.Crazy 1.0 | 2 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 944. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 39 | 48% | 95 |
| tzu.TheArtOfWar 1.2 | 22 | 27% | 63 |
| jwirde.Gort 2.0 | 6 | 7% | 23 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 6% | 13 |
| disan.Chair 2.2.0 | 2 | 2% | 6 |
| wompi.Quokka 1.6 | 2 | 2% | 4 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 2 |
| sample.Crazy 1.0 | 0 | 0% | 2 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 160606 melee ticks, 46364 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 33 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 55724 sent, 51292 reached their opponent, 11533 virtual hits (22.5% of those reached).

## Melee bench: F45

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 248 over 6 battles (41.3 per battle, most in one battle 98). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 87.0 | 100 / 210 | 2.17 | 19.1% | 30794 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.1% | 100 |
| eem.IWillFireNoBullet v2.8 | 2.5 | 12.9% | 85 |
| jje.BagPuss 1.2 | 3.2 | 12.3% | 6 |
| myl.nano.Graviton 1.10 | 3.8 | 10.8% | 6 |
| sul.Lunar 1.1 | 4.5 | 10.5% | 7 |
| pez.mini.ChironexFleckeri 0.5 | 6.7 | 8.5% | 5 |
| hvilela.HVilela 0.9 | 7.2 | 8.2% | 0 |
| fm.claire 1.7 | 7.2 | 7.8% | 0 |
| wit.Deep7 2.0 | 9.0 | 5.7% | 2 |
| abud.ThirdRobo 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 88.3 | 16 / 35 | 4980 |
| 2 | 1 | 67.5 | 83.2 | 14 / 35 | 4885 |
| 3 | 1 | 69.5 | 85.7 | 18 / 35 | 5632 |
| 4 | 1 | 69.7 | 90.2 | 20 / 35 | 5189 |
| 5 | 1 | 68.4 | 87.9 | 13 / 35 | 5009 |
| 6 | 1 | 68.5 | 86.7 | 19 / 35 | 5099 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 90 | 53% |
| jje.BagPuss 1.2 | 20 | 90% |
| myl.nano.Graviton 1.10 | 16 | 81% |
| sul.Lunar 1.1 | 15 | 80% |
| pez.mini.ChironexFleckeri 0.5 | 7 | 86% |
| wit.Deep7 2.0 | 2 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 1612. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 47 | 42% | 0 |
| jje.BagPuss 1.2 | 24 | 21% | 61 |
| sul.Lunar 1.1 | 13 | 12% | 50 |
| myl.nano.Graviton 1.10 | 13 | 12% | 41 |
| pez.mini.ChironexFleckeri 0.5 | 6 | 5% | 24 |
| fm.claire 1.7 | 5 | 4% | 13 |
| hvilela.HVilela 0.9 | 2 | 2% | 9 |
| wit.Deep7 2.0 | 1 | 1% | 7 |
| abud.ThirdRobo 1.0 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 208449 melee ticks, 104230 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 65 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 63922 sent, 59550 reached their opponent, 9370 virtual hits (15.7% of those reached).

## Melee bench: F46

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 805 over 6 battles (134.2 per battle, most in one battle 223). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 80.7 | 46 / 210 | 2.73 | 15.3% | 22257 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 17.5% | 75 |
| rsalesc.melee.Medina 0.4.5 | 2.5 | 15.7% | 70 |
| hadur2.Hadur 3.17.1aa | 2.5 | 15.3% | 46 |
| cx.Princess 1.0 | 4.7 | 10.2% | 13 |
| mz.MicroSheep 1.0 | 4.7 | 10.4% | 2 |
| sadoner.killer 0.2 | 5.7 | 9.3% | 2 |
| arthord.NanoSatanMelee Beta | 7.3 | 7.6% | 2 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 6.0% | 0 |
| kurios.DOSexe .9a | 8.7 | 5.0% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.9 | 81.3 | 7 / 35 | 3446 |
| 2 | 3 | 64.3 | 82.9 | 5 / 35 | 3733 |
| 3 | 3 | 62.4 | 76.2 | 5 / 35 | 3469 |
| 4 | 2 | 64.3 | 80.6 | 10 / 35 | 3728 |
| 5 | 2 | 65.2 | 82.2 | 9 / 35 | 4190 |
| 6 | 2 | 64.4 | 81.3 | 10 / 35 | 3691 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 63 | 44% |
| rsalesc.melee.Medina 0.4.5 | 28 | 29% |
| mz.MicroSheep 1.0 | 7 | 86% |
| cx.Princess 1.0 | 5 | 80% |
| arthord.NanoSatanMelee Beta | 1 | 0% |
| sadoner.killer 0.2 | 1 | 0% |

Hadur died in 171 of 210 rounds, at a mean tick of 892. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 82 | 48% | 111 |
| rsalesc.melee.Medina 0.4.5 | 49 | 29% | 57 |
| sadoner.killer 0.2 | 11 | 6% | 11 |
| cx.Princess 1.0 | 8 | 5% | 13 |
| mz.MicroSheep 1.0 | 7 | 4% | 10 |
| arthord.NanoSatanMelee Beta | 3 | 2% | 3 |
| jeremyreeder.collective.Prophet 5 | 2 | 1% | 2 |
| kurios.DOSexe .9a | 2 | 1% | 2 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 149411 melee ticks, 36266 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 39 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 45037 sent, 40503 reached their opponent, 6710 virtual hits (16.6% of those reached).

