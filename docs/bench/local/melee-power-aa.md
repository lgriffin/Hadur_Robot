# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 100 over 6 battles (16.7 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 83.5 | 51 / 210 | 2.49 | 16.3% | 26720 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.5% | 134 |
| hadur2.Hadur 3.17.1aa | 2.0 | 16.3% | 51 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.7 | 11.7% | 6 |
| sgp.JollyNinja 3.53 | 4.0 | 11.5% | 13 |
| mz.MicroGodMelee 1 | 4.5 | 10.7% | 5 |
| lorneswork.Predator 1.0 | 5.8 | 9.8% | 2 |
| adt.Ar2 1.0 | 7.2 | 7.0% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.7% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.4 | 83.8 | 11 / 35 | 4657 |
| 2 | 2 | 66.4 | 85.1 | 10 / 35 | 4528 |
| 3 | 2 | 66.4 | 85.7 | 9 / 35 | 4449 |
| 4 | 2 | 65.2 | 81.6 | 9 / 35 | 4470 |
| 5 | 2 | 65.0 | 82.9 | 6 / 35 | 4313 |
| 6 | 2 | 64.7 | 81.9 | 6 / 35 | 4303 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 109 | 13% |
| sgp.JollyNinja 3.53 | 18 | 83% |
| mz.MicroGodMelee 1 | 12 | 92% |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 100% |
| lorneswork.Predator 1.0 | 3 | 67% |
| adt.Ar2 1.0 | 1 | 0% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 162 of 210 rounds, at a mean tick of 1072. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 106 | 65% | 124 |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 10% | 21 |
| sgp.JollyNinja 3.53 | 14 | 9% | 24 |
| lorneswork.Predator 1.0 | 11 | 7% | 13 |
| mz.MicroGodMelee 1 | 6 | 4% | 17 |
| adt.Ar2 1.0 | 5 | 3% | 8 |
| mym.EdgeStalker 1.0 | 1 | 1% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 140249 melee ticks, 74261 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 55 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 45628 sent, 41325 reached their opponent, 9124 virtual hits (22.1% of those reached).

## Melee bench: F02

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 246 over 6 battles (41.0 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 84.7 | 86 / 210 | 2.38 | 17.4% | 25869 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.4% | 86 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.4% | 42 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.6% | 34 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.6% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 9.8% | 14 |
| sch.Simone 0.3d | 7.0 | 7.9% | 14 |
| Noran.BitchingElk 0.054 | 7.0 | 8.1% | 16 |
| fnc.bandit.Bandit 5.2.0 | 7.2 | 8.1% | 0 |
| stelo.PatternRobot 1.0 | 8.8 | 6.1% | 3 |
| fullsail.SweetTea 1.1 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 80.6 | 12 / 35 | 3965 |
| 2 | 1 | 66.7 | 85.7 | 13 / 35 | 4296 |
| 3 | 1 | 65.4 | 81.6 | 11 / 35 | 4175 |
| 4 | 1 | 67.2 | 85.4 | 19 / 35 | 4250 |
| 5 | 1 | 68.1 | 89.2 | 16 / 35 | 4426 |
| 6 | 1 | 67.0 | 85.4 | 15 / 35 | 4757 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 54 | 61% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 30 | 57% |
| com.cohesiva.robocode.ManOwaR 1.0 | 21 | 52% |
| Noran.BitchingElk 0.054 | 18 | 39% |
| sch.Simone 0.3d | 10 | 60% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 88% |
| fnc.bandit.Bandit 5.2.0 | 3 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |
| stelo.PatternRobot 1.0 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 1010. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 36 | 29% | 67 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 28 | 22% | 43 |
| com.cohesiva.robocode.ManOwaR 1.0 | 17 | 14% | 29 |
| Noran.BitchingElk 0.054 | 13 | 10% | 20 |
| sch.Simone 0.3d | 10 | 8% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 7% | 12 |
| stelo.PatternRobot 1.0 | 7 | 6% | 9 |
| fullsail.SweetTea 1.1 | 2 | 2% | 4 |
| fnc.bandit.Bandit 5.2.0 | 2 | 2% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 171134 melee ticks, 44554 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 33 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 61407 sent, 56895 reached their opponent, 10395 virtual hits (18.3% of those reached).

## Melee bench: F03

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 126 over 6 battles (21.0 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 91.0 | 160 / 210 | 1.81 | 19.5% | 32571 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.5% | 160 |
| radnor.DoctorBob 1.42 | 2.0 | 14.7% | 26 |
| kawigi.nano.Lib 1.0 | 3.3 | 13.0% | 9 |
| vuen.Cake 2.51 | 3.7 | 12.7% | 13 |
| urdos.URDOS 1.3 | 5.0 | 9.7% | 2 |
| adt.Ar1 2.1 | 6.2 | 7.5% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 6.8 | 6.9% | 0 |
| oa.weak.FlyMk1 0.1 | 8.2 | 6.0% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.2 | 5.3% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 88.3 | 28 / 35 | 5436 |
| 2 | 1 | 68.9 | 91.1 | 25 / 35 | 5035 |
| 3 | 1 | 71.0 | 96.2 | 30 / 35 | 5619 |
| 4 | 1 | 69.1 | 90.5 | 25 / 35 | 5388 |
| 5 | 1 | 68.7 | 88.3 | 22 / 35 | 5298 |
| 6 | 1 | 70.3 | 91.7 | 30 / 35 | 5795 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 64 | 95% |
| vuen.Cake 2.51 | 55 | 95% |
| kawigi.nano.Lib 1.0 | 38 | 95% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| urdos.URDOS 1.3 | 3 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 629. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 18 | 36% | 64 |
| vuen.Cake 2.51 | 9 | 18% | 67 |
| kawigi.nano.Lib 1.0 | 9 | 18% | 48 |
| urdos.URDOS 1.3 | 6 | 12% | 12 |
| adt.Ar1 2.1 | 3 | 6% | 6 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 4% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 4% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 2% | 3 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 3 |

Posture (Hadur's M records, 198 rounds): 128173 melee ticks, 34642 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 111 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 111 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 39656 sent, 35383 reached their opponent, 9618 virtual hits (27.2% of those reached).

## Melee bench: F04

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 507 over 6 battles (84.5 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 84.6 | 21 / 210 | 2.39 | 16.6% | 29417 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.3% | 172 |
| hadur2.Hadur 3.17.1aa | 2.0 | 16.6% | 21 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.5% | 9 |
| TNT.TNT 0.99.1 | 4.0 | 10.8% | 6 |
| josago.Jorgito 0.16 | 5.0 | 8.9% | 1 |
| tj.zombie1n 1.0.1 | 6.7 | 6.8% | 1 |
| css.Delitioner 0.11 | 6.8 | 6.7% | 0 |
| rampancy.Durandal 2.1d | 7.5 | 5.7% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.1% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.2 | 84.1 | 2 / 35 | 4720 |
| 2 | 2 | 68.0 | 87.0 | 4 / 35 | 5220 |
| 3 | 2 | 66.8 | 83.8 | 4 / 35 | 4919 |
| 4 | 2 | 65.7 | 82.2 | 2 / 35 | 4597 |
| 5 | 2 | 67.2 | 86.3 | 5 / 35 | 4882 |
| 6 | 2 | 67.2 | 84.1 | 4 / 35 | 5079 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 122 | 7% |
| TNT.TNT 0.99.1 | 12 | 58% |
| apc.LeeroyJenkins2 1.0 | 7 | 57% |
| josago.Jorgito 0.16 | 3 | 67% |
| tj.zombie1n 1.0.1 | 1 | 0% |

Hadur died in 193 of 210 rounds, at a mean tick of 1311. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 143 | 74% | 154 |
| apc.LeeroyJenkins2 1.0 | 19 | 10% | 23 |
| TNT.TNT 0.99.1 | 15 | 8% | 21 |
| josago.Jorgito 0.16 | 7 | 4% | 8 |
| tj.zombie1n 1.0.1 | 3 | 2% | 2 |
| css.Delitioner 0.11 | 2 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 206400 melee ticks, 65140 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 98 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 98 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 63443 sent, 58896 reached their opponent, 9298 virtual hits (15.8% of those reached).

## Melee bench: F05

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 519 over 6 battles (86.5 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 76.1 | 29 / 210 | 3.15 | 14.2% | 19588 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 18.3% | 103 |
| justin.DemonicRage 3.4 | 1.8 | 17.1% | 57 |
| hadur2.Hadur 3.17.1aa | 3.0 | 14.2% | 29 |
| wompi.Numbat 2.1 | 4.0 | 12.5% | 14 |
| axeBots.HataMoto 3.09 | 5.3 | 9.5% | 7 |
| ms.Ares 0.19 | 5.7 | 9.2% | 1 |
| supersample.SuperBoxBot 1.0 | 7.0 | 5.9% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.3 | 5.1% | 0 |
| GarmBox.Oranges 1.0 | 9.0 | 4.4% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.3 | 75.6 | 4 / 35 | 3354 |
| 2 | 3 | 62.2 | 76.2 | 5 / 35 | 3114 |
| 3 | 3 | 60.8 | 71.4 | 1 / 35 | 3110 |
| 4 | 3 | 61.5 | 75.6 | 3 / 35 | 3093 |
| 5 | 3 | 63.7 | 78.7 | 8 / 35 | 3577 |
| 6 | 3 | 63.9 | 79.4 | 8 / 35 | 3340 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 39 | 10% |
| justin.DemonicRage 3.4 | 30 | 40% |
| wompi.Numbat 2.1 | 14 | 64% |
| axeBots.HataMoto 3.09 | 6 | 50% |
| ms.Ares 0.19 | 1 | 100% |

Hadur died in 186 of 210 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 67 | 36% | 75 |
| justin.DemonicRage 3.4 | 60 | 32% | 73 |
| wompi.Numbat 2.1 | 25 | 13% | 30 |
| axeBots.HataMoto 3.09 | 15 | 8% | 17 |
| ms.Ares 0.19 | 5 | 3% | 6 |
| supersample.SuperBoxBot 1.0 | 5 | 3% | 5 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 2 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 156453 melee ticks, 29943 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 41 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 49074 sent, 44422 reached their opponent, 7825 virtual hits (17.6% of those reached).

## Melee bench: F06

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 317 over 6 battles (52.8 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 89.0 | 130 / 210 | 1.99 | 18.9% | 28202 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.9% | 130 |
| jekl.StoneGhost 0.7 | 2.2 | 14.8% | 27 |
| origin.SleepSiphon 1.7b | 3.0 | 13.6% | 29 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 11.4% | 13 |
| mld.Wisdom 1.0 | 4.8 | 10.4% | 3 |
| gg.Wolverine 2.0 | 6.0 | 8.8% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.8 | 6.5% | 6 |
| spinnercat.Omen 1.0 | 8.0 | 6.4% | 0 |
| DBall.NUKE 0.1 | 8.2 | 6.2% | 0 |
| sample.Fire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 94.3 | 27 / 35 | 4890 |
| 2 | 1 | 68.9 | 89.2 | 23 / 35 | 4629 |
| 3 | 1 | 69.7 | 91.4 | 22 / 35 | 4739 |
| 4 | 1 | 67.2 | 83.8 | 18 / 35 | 4633 |
| 5 | 1 | 68.6 | 86.7 | 20 / 35 | 4857 |
| 6 | 1 | 68.5 | 88.6 | 20 / 35 | 4454 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 55 | 84% |
| origin.SleepSiphon 1.7b | 49 | 80% |
| pe.minimelee.SandboxMiniMelee 1.1 | 22 | 91% |
| gg.Wolverine 2.0 | 13 | 92% |
| mld.Wisdom 1.0 | 9 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 40% |
| DBall.NUKE 0.1 | 2 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 36 | 43% | 79 |
| jekl.StoneGhost 0.7 | 17 | 20% | 53 |
| pe.minimelee.SandboxMiniMelee 1.1 | 13 | 15% | 35 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 8% | 11 |
| mld.Wisdom 1.0 | 4 | 5% | 18 |
| gg.Wolverine 2.0 | 2 | 2% | 9 |
| spinnercat.Omen 1.0 | 1 | 1% | 1 |
| DBall.NUKE 0.1 | 0 | 0% | 3 |
| sample.Fire 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 148245 melee ticks, 43716 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 41 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 47137 sent, 42671 reached their opponent, 10130 virtual hits (23.7% of those reached).

## Melee bench: F07

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 404 over 6 battles (67.3 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 92.5 | 112 / 210 | 1.68 | 19.7% | 33764 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.7% | 112 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 17.1% | 44 |
| rtk.Tachikoma 1.0 | 2.7 | 16.2% | 29 |
| franzor.Lizt 1.3.1 | 4.5 | 10.9% | 15 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 11.5% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.1% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.1% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.8% | 0 |
| sample.Target 1.0 | 9.2 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 91.4 | 17 / 35 | 5443 |
| 2 | 1 | 71.6 | 91.1 | 17 / 35 | 6186 |
| 3 | 1 | 71.8 | 93.0 | 20 / 35 | 5874 |
| 4 | 1 | 71.5 | 92.7 | 21 / 35 | 5596 |
| 5 | 1 | 70.9 | 94.0 | 19 / 35 | 5344 |
| 6 | 1 | 70.7 | 92.7 | 18 / 35 | 5321 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 70 | 71% |
| rsalesc.melee.Monk 0.3.6c | 52 | 29% |
| franzor.Lizt 1.3.1 | 38 | 68% |
| oog.melee.CapuletDroid 1.1 | 24 | 88% |

Hadur died in 101 of 210 rounds, at a mean tick of 1495. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 43 | 43% | 69 |
| rtk.Tachikoma 1.0 | 34 | 34% | 101 |
| franzor.Lizt 1.3.1 | 12 | 12% | 1 |
| oog.melee.CapuletDroid 1.1 | 7 | 7% | 33 |
| exauge.GateKeeper 1.1.121g | 2 | 2% | 4 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 199383 melee ticks, 98471 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 40 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 60208 sent, 55779 reached their opponent, 12089 virtual hits (21.7% of those reached).

## Melee bench: F08

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 254 over 6 battles (42.3 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 88.9 | 127 / 210 | 2.00 | 18.4% | 25233 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.4% | 127 |
| tm.Yuugao 1.0 | 2.5 | 12.8% | 34 |
| shrub.Vapour v159 | 3.0 | 12.3% | 21 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 10.8% | 11 |
| com.spp.robocode.MostlyHarmless 010 | 5.2 | 10.1% | 8 |
| m3thos.Eva00 1.1 | 5.5 | 9.3% | 3 |
| jwst.DAD.DarkAndDarker 1.1 | 6.8 | 8.6% | 5 |
| qualidafial.MajorDick 1.0.1 | 8.3 | 6.7% | 0 |
| SHAM.WOW 1.4 | 9.2 | 5.7% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 89.2 | 21 / 35 | 4751 |
| 2 | 1 | 65.4 | 83.5 | 16 / 35 | 3740 |
| 3 | 1 | 67.8 | 89.8 | 23 / 35 | 4032 |
| 4 | 1 | 67.7 | 89.5 | 21 / 35 | 4231 |
| 5 | 1 | 69.1 | 93.7 | 25 / 35 | 4343 |
| 6 | 1 | 67.1 | 87.6 | 21 / 35 | 4136 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shrub.Vapour v159 | 46 | 78% |
| tm.Yuugao 1.0 | 40 | 60% |
| Krabb.sliNk.Garm 0.9u | 26 | 81% |
| com.spp.robocode.MostlyHarmless 010 | 23 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 10 | 80% |
| m3thos.Eva00 1.1 | 9 | 100% |
| SHAM.WOW 1.4 | 3 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 853. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 33 | 38% | 64 |
| shrub.Vapour v159 | 19 | 22% | 50 |
| Krabb.sliNk.Garm 0.9u | 12 | 14% | 28 |
| com.spp.robocode.MostlyHarmless 010 | 11 | 13% | 28 |
| m3thos.Eva00 1.1 | 4 | 5% | 15 |
| jwst.DAD.DarkAndDarker 1.1 | 4 | 5% | 15 |
| SHAM.WOW 1.4 | 1 | 1% | 6 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 151460 melee ticks, 41406 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 48 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 50367 sent, 45786 reached their opponent, 8830 virtual hits (19.3% of those reached).

## Melee bench: F09

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 130 over 6 battles (21.7 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 75.2 | 52 / 210 | 3.23 | 14.6% | 19092 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.9% | 107 |
| hadur2.Hadur 3.17.1aa | 2.5 | 14.6% | 52 |
| kc.micro.Figment 1.0 | 2.5 | 14.5% | 27 |
| yagami.Tidus 0.11 | 4.3 | 10.7% | 3 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.4% | 8 |
| mc2.enemy.Original 0.9 | 5.8 | 9.4% | 12 |
| dft.Calliope 5.6 | 7.0 | 7.5% | 1 |
| step.nanoPri 1.0 | 8.0 | 6.2% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 4.5% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.3 | 80.3 | 11 / 35 | 3287 |
| 2 | 3 | 63.0 | 74.9 | 10 / 35 | 3339 |
| 3 | 2 | 65.9 | 84.1 | 13 / 35 | 3534 |
| 4 | 2 | 63.3 | 76.8 | 10 / 35 | 3258 |
| 5 | 3 | 59.3 | 68.9 | 4 / 35 | 2780 |
| 6 | 3 | 58.8 | 66.3 | 4 / 35 | 2894 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 50 | 26% |
| kc.micro.Figment 1.0 | 26 | 85% |
| mc2.enemy.Original 0.9 | 9 | 78% |
| pedersen.Grishnakh 1.0 | 7 | 57% |
| yagami.Tidus 0.11 | 5 | 80% |
| dft.Calliope 5.6 | 2 | 100% |

Hadur died in 158 of 210 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 69 | 44% | 85 |
| kc.micro.Figment 1.0 | 26 | 16% | 47 |
| mc2.enemy.Original 0.9 | 19 | 12% | 28 |
| yagami.Tidus 0.11 | 19 | 12% | 22 |
| pedersen.Grishnakh 1.0 | 18 | 11% | 19 |
| dft.Calliope 5.6 | 2 | 1% | 4 |
| robar.nano.Assertive_Melee 0.2 | 2 | 1% | 2 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |
| step.nanoPri 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 201 rounds): 147040 melee ticks, 31962 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 40 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 48610 sent, 44259 reached their opponent, 6637 virtual hits (15.0% of those reached).

## Melee bench: F10

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 173 over 6 battles (28.8 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 94.2 | 161 / 210 | 1.52 | 20.0% | 31107 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 20.0% | 161 |
| DTF.Kludgy 1.2b | 2.5 | 14.0% | 19 |
| ne.Chimera 1.2 | 3.2 | 13.3% | 12 |
| ejb.Polaris 1.0.1 | 3.7 | 12.3% | 12 |
| vStar.RAFzilla 2.15 | 5.3 | 10.5% | 4 |
| tvv.micro.Antares 1.1.1 | 5.3 | 10.0% | 2 |
| kurios.DOSexe .9b | 8.0 | 5.4% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.1% | 0 |
| sam.Samspin 1.0 | 8.2 | 5.0% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 94.9 | 29 / 35 | 5493 |
| 2 | 1 | 69.9 | 94.9 | 24 / 35 | 4941 |
| 3 | 1 | 70.0 | 94.0 | 25 / 35 | 5154 |
| 4 | 1 | 71.0 | 94.9 | 29 / 35 | 5402 |
| 5 | 1 | 70.3 | 92.7 | 26 / 35 | 5149 |
| 6 | 1 | 70.3 | 94.0 | 28 / 35 | 4968 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 50 | 86% |
| ejb.Polaris 1.0.1 | 38 | 89% |
| ne.Chimera 1.2 | 34 | 79% |
| vStar.RAFzilla 2.15 | 26 | 96% |
| tvv.micro.Antares 1.1.1 | 20 | 95% |
| kurios.DOSexe .9b | 6 | 100% |
| donjezza.Muncho 1.0 | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 19 | 38% | 60 |
| ne.Chimera 1.2 | 18 | 36% | 43 |
| ejb.Polaris 1.0.1 | 6 | 12% | 47 |
| tvv.micro.Antares 1.1.1 | 3 | 6% | 18 |
| vStar.RAFzilla 2.15 | 2 | 4% | 20 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 4 |
| sam.Samspin 1.0 | 1 | 2% | 2 |
| kurios.DOSexe .9b | 0 | 0% | 12 |
| donjezza.Muncho 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 146294 melee ticks, 52086 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 72 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 48045 sent, 43784 reached their opponent, 8853 virtual hits (20.2% of those reached).

## Melee bench: F11

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 132 over 6 battles (22.0 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 80.1 | 63 / 210 | 2.80 | 15.6% | 19942 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.2 | 16.7% | 72 |
| hadur2.Hadur 3.17.1aa | 1.8 | 15.6% | 63 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.3% | 25 |
| djc.DynaBot 0.1.1 | 3.8 | 11.2% | 20 |
| rdt199.Warlord 0.73 | 5.3 | 9.4% | 15 |
| br2.MobyDickBot 1.6 | 5.8 | 9.2% | 12 |
| uji.YellohFellah 1.0 | 7.2 | 8.3% | 4 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.3% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.1% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 77.8 | 10 / 35 | 3202 |
| 2 | 2 | 62.9 | 78.1 | 9 / 35 | 3291 |
| 3 | 2 | 64.0 | 81.3 | 10 / 35 | 3501 |
| 4 | 2 | 64.4 | 81.6 | 12 / 35 | 3445 |
| 5 | 1 | 64.2 | 83.8 | 11 / 35 | 3129 |
| 6 | 2 | 63.1 | 77.8 | 11 / 35 | 3374 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 58 | 47% |
| djc.DynaBot 0.1.1 | 17 | 59% |
| rdt199.Warlord 0.73 | 16 | 44% |
| cx.mini.Nimrod 0.55 | 11 | 73% |
| uji.YellohFellah 1.0 | 9 | 78% |
| br2.MobyDickBot 1.6 | 6 | 33% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 891. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 61 | 41% | 88 |
| cx.mini.Nimrod 0.55 | 27 | 18% | 37 |
| rdt199.Warlord 0.73 | 18 | 12% | 28 |
| djc.DynaBot 0.1.1 | 15 | 10% | 23 |
| br2.MobyDickBot 1.6 | 11 | 7% | 14 |
| uji.YellohFellah 1.0 | 8 | 5% | 12 |
| KiraNL.Chupacabra 0.4 | 4 | 3% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 1% | 2 |
| stelo.MirrorNano 1.3 | 1 | 1% | 2 |

Posture (Hadur's M records, 200 rounds): 156832 melee ticks, 34240 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 42 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 51387 sent, 46965 reached their opponent, 6548 virtual hits (13.9% of those reached).

## Melee bench: F12

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 104 over 6 battles (17.3 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 84.7 | 108 / 210 | 2.38 | 17.0% | 20470 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.0% | 108 |
| bts.wiki.RipCurl 0.9b | 2.7 | 14.2% | 34 |
| nat.PallasHawk 1.0 | 3.0 | 13.2% | 33 |
| darkcanuck.Leon 1.01 | 3.5 | 12.9% | 17 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.4% | 12 |
| jrm.Test0 1.0 | 6.3 | 7.8% | 0 |
| cs.sheldor.Talon 1.1 | 7.3 | 6.8% | 1 |
| jp.Perpy 16.0 | 8.0 | 6.6% | 2 |
| stuff.Vlad 0.1 | 9.0 | 5.8% | 0 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 82.2 | 15 / 35 | 3217 |
| 2 | 1 | 67.4 | 87.9 | 23 / 35 | 3514 |
| 3 | 1 | 63.9 | 77.8 | 14 / 35 | 3573 |
| 4 | 1 | 65.3 | 84.1 | 17 / 35 | 3129 |
| 5 | 1 | 67.3 | 88.9 | 21 / 35 | 3592 |
| 6 | 1 | 66.4 | 87.3 | 18 / 35 | 3445 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 47 | 89% |
| nat.PallasHawk 1.0 | 47 | 64% |
| bts.wiki.RipCurl 0.9b | 31 | 71% |
| brainfade.melee.Genghis 0.36 | 8 | 75% |
| jaybot.bots.Oddball 4.0 | 4 | 100% |
| jrm.Test0 1.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 50% |

Hadur died in 103 of 210 rounds, at a mean tick of 723. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 31 | 30% | 59 |
| bts.wiki.RipCurl 0.9b | 20 | 19% | 40 |
| brainfade.melee.Genghis 0.36 | 17 | 17% | 24 |
| darkcanuck.Leon 1.01 | 15 | 15% | 57 |
| jrm.Test0 1.0 | 9 | 9% | 11 |
| cs.sheldor.Talon 1.1 | 8 | 8% | 10 |
| jp.Perpy 16.0 | 2 | 2% | 4 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 5 |

Posture (Hadur's M records, 201 rounds): 131617 melee ticks, 34224 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 42 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 45282 sent, 40674 reached their opponent, 7014 virtual hits (17.2% of those reached).

## Melee bench: F13

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 97 over 6 battles (16.2 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 80.2 | 49 / 210 | 2.79 | 15.0% | 21107 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 17.1% | 94 |
| ags.Glacier 0.2.11 | 1.8 | 16.6% | 45 |
| hadur2.Hadur 3.17.1aa | 2.7 | 15.0% | 49 |
| gh.micro.Gruweltje 0.7 | 4.2 | 12.2% | 12 |
| shinh.Entangled 0.3 | 4.8 | 11.5% | 11 |
| apc.Colossus2 0.17 | 6.0 | 7.9% | 0 |
| stelo.Wang 1.0 | 7.3 | 6.2% | 0 |
| ayk.WallHugger 1.0 | 8.3 | 5.2% | 0 |
| maribo.FollowFire 1 | 8.3 | 4.9% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 86.0 | 14 / 35 | 3913 |
| 2 | 3 | 62.8 | 78.4 | 6 / 35 | 3337 |
| 3 | 3 | 62.8 | 78.1 | 6 / 35 | 3326 |
| 4 | 3 | 63.2 | 77.8 | 6 / 35 | 3529 |
| 5 | 3 | 63.5 | 78.7 | 9 / 35 | 3458 |
| 6 | 3 | 64.0 | 81.9 | 8 / 35 | 3544 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 44 | 23% |
| ags.Glacier 0.2.11 | 42 | 62% |
| gh.micro.Gruweltje 0.7 | 14 | 79% |
| shinh.Entangled 0.3 | 9 | 22% |

Hadur died in 161 of 210 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 57 | 35% | 77 |
| mn.Combat 3.25.0 | 52 | 32% | 68 |
| shinh.Entangled 0.3 | 21 | 13% | 24 |
| gh.micro.Gruweltje 0.7 | 18 | 11% | 26 |
| maribo.FollowFire 1 | 5 | 3% | 4 |
| apc.Colossus2 0.17 | 4 | 2% | 5 |
| stelo.Wang 1.0 | 3 | 2% | 4 |
| ayk.WallHugger 1.0 | 1 | 1% | 2 |

Posture (Hadur's M records, 201 rounds): 148411 melee ticks, 35031 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 56 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 44265 sent, 39636 reached their opponent, 6695 virtual hits (16.9% of those reached).

## Melee bench: F14

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 159 over 6 battles (26.5 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 93.1 | 146 / 210 | 1.62 | 19.6% | 29747 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.6% | 146 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 16.1% | 27 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.4% | 25 |
| co.edu.usb.rc.LidisTron 1.0 | 5.0 | 9.9% | 5 |
| sanyi.mikrobi.Roberto 1.0 | 5.0 | 9.4% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 5.7 | 9.5% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.5 | 8.6% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 7.4% | 4 |
| pa.Improved 1.0 | 9.0 | 5.3% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 91.4 | 22 / 35 | 4879 |
| 2 | 1 | 70.1 | 94.0 | 25 / 35 | 4983 |
| 3 | 1 | 69.7 | 93.0 | 24 / 35 | 4821 |
| 4 | 1 | 69.4 | 91.7 | 22 / 35 | 4970 |
| 5 | 1 | 69.7 | 90.8 | 25 / 35 | 4974 |
| 6 | 1 | 71.4 | 97.8 | 28 / 35 | 5120 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 91 | 87% |
| catcat20.shape.Theta 0.018 | 50 | 62% |
| sanyi.mikrobi.Roberto 1.0 | 14 | 86% |
| co.edu.usb.rc.LidisTron 1.0 | 13 | 92% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 63% |
| Lo_Ian.Gandalf_V4 4.0 | 6 | 67% |
| pa.Improved 1.0 | 2 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 914. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 22 | 33% | 51 |
| simonton.micro.Sprout 1.1.3 | 21 | 32% | 96 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 9% | 16 |
| Lo_Ian.Gandalf_V4 4.0 | 5 | 8% | 8 |
| sanyi.mikrobi.Roberto 1.0 | 4 | 6% | 19 |
| co.edu.usb.rc.LidisTron 1.0 | 4 | 6% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 5% | 8 |
| pa.Improved 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 143273 melee ticks, 51751 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 47 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 46344 sent, 42132 reached their opponent, 10751 virtual hits (25.5% of those reached).

## Melee bench: F15

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 119 over 6 battles (19.8 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 84.7 | 99 / 210 | 2.38 | 17.7% | 26508 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.7% | 99 |
| kawigi.micro.Shiz 1.1 | 2.3 | 14.0% | 23 |
| emp.Yngwie 1.11 | 3.3 | 13.2% | 59 |
| mld.DustBunny 3.8 | 3.3 | 12.8% | 8 |
| cb.nano.Insomnia 1.0 | 5.3 | 10.2% | 6 |
| kawigi.robot.Girl 1.2 | 5.7 | 9.7% | 14 |
| Grystrion.TrackerWO 1.0 | 7.3 | 6.7% | 0 |
| lambdaxy.TBot 0.1 | 7.7 | 6.5% | 0 |
| divineomega.TrialBot 0.003 | 9.2 | 4.9% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 81.3 | 16 / 35 | 4474 |
| 2 | 1 | 68.5 | 86.3 | 20 / 35 | 4850 |
| 3 | 1 | 68.0 | 87.9 | 18 / 35 | 4502 |
| 4 | 1 | 64.9 | 81.3 | 11 / 35 | 4084 |
| 5 | 1 | 66.5 | 85.1 | 15 / 35 | 4094 |
| 6 | 1 | 67.7 | 86.3 | 19 / 35 | 4504 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 52 | 58% |
| kawigi.micro.Shiz 1.1 | 32 | 78% |
| mld.DustBunny 3.8 | 17 | 94% |
| kawigi.robot.Girl 1.2 | 16 | 81% |
| cb.nano.Insomnia 1.0 | 11 | 82% |
| divineomega.TrialBot 0.003 | 3 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 923. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 34 | 31% | 68 |
| mld.DustBunny 3.8 | 22 | 20% | 47 |
| kawigi.micro.Shiz 1.1 | 20 | 18% | 40 |
| kawigi.robot.Girl 1.2 | 15 | 14% | 21 |
| cb.nano.Insomnia 1.0 | 14 | 13% | 17 |
| Grystrion.TrackerWO 1.0 | 3 | 3% | 6 |
| divineomega.TrialBot 0.003 | 2 | 2% | 7 |
| lambdaxy.TBot 0.1 | 1 | 1% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 202 rounds): 165999 melee ticks, 39617 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 54 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 54712 sent, 50365 reached their opponent, 8583 virtual hits (17.0% of those reached).

## Melee bench: F16

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 113 over 6 battles (18.8 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 82.8 | 85 / 210 | 2.55 | 17.4% | 27953 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.3 | 17.4% | 85 |
| gh.Griezel 0.5.2 | 1.7 | 17.2% | 62 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.2 | 13.7% | 5 |
| techdude.forest.FlamingForest 1.1 | 3.8 | 11.7% | 43 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 9.0% | 3 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.6% | 5 |
| stelo.IntrinsicVolatility 1.4 | 6.7 | 7.5% | 2 |
| repositorio.NanoStep 1.0 | 8.3 | 5.2% | 0 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 5.2% | 5 |
| asd.Cthulhu 1.3 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 84.8 | 17 / 35 | 4635 |
| 2 | 1 | 67.7 | 82.9 | 18 / 35 | 4860 |
| 3 | 2 | 66.2 | 81.0 | 12 / 35 | 4637 |
| 4 | 1 | 67.6 | 85.4 | 15 / 35 | 4764 |
| 5 | 1 | 67.1 | 83.8 | 12 / 35 | 4668 |
| 6 | 2 | 65.3 | 79.0 | 11 / 35 | 4389 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 67 | 60% |
| techdude.forest.FlamingForest 1.1 | 35 | 51% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 19 | 84% |
| tvv.nano.Polaris 1.2 | 5 | 60% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |
| stelo.IntrinsicVolatility 1.4 | 3 | 67% |
| bvh.fnr.Fenrir 0.36l | 3 | 67% |

Hadur died in 126 of 210 rounds, at a mean tick of 1106. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 40 | 32% | 78 |
| techdude.forest.FlamingForest 1.1 | 34 | 27% | 53 |
| bvh.fnr.Fenrir 0.36l | 21 | 17% | 26 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 16 | 13% | 28 |
| tvv.nano.Polaris 1.2 | 6 | 5% | 7 |
| stelo.IntrinsicVolatility 1.4 | 4 | 3% | 8 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 6 |
| repositorio.NanoStep 1.0 | 2 | 2% | 3 |
| asd.Cthulhu 1.3 | 1 | 1% | 1 |

Posture (Hadur's M records, 204 rounds): 180823 melee ticks, 60081 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 43 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 58175 sent, 53774 reached their opponent, 9577 virtual hits (17.8% of those reached).

## Melee bench: F17

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 151 over 6 battles (25.2 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 82.1 | 91 / 210 | 2.61 | 17.3% | 28129 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.3% | 91 |
| et.Predator 1.8 | 2.5 | 13.8% | 31 |
| oog.melee.Mercutio 1.0 | 3.2 | 12.9% | 29 |
| cx.BlestPain 1.41 | 3.3 | 13.1% | 42 |
| ahf.NanoAndrew .4 | 5.3 | 10.6% | 5 |
| nic.Nicator 2.4 | 5.8 | 9.9% | 7 |
| maribo.melee.BMV 0.1 | 6.8 | 8.8% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 8.2 | 5.7% | 2 |
| tex.Longbot 0.4 | 8.8 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 83.8 | 15 / 35 | 4795 |
| 2 | 1 | 67.0 | 81.9 | 15 / 35 | 4708 |
| 3 | 1 | 68.2 | 87.0 | 19 / 35 | 4875 |
| 4 | 1 | 66.6 | 81.9 | 16 / 35 | 4749 |
| 5 | 1 | 66.6 | 80.3 | 16 / 35 | 4736 |
| 6 | 1 | 64.6 | 77.5 | 10 / 35 | 4266 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 43 | 70% |
| oog.melee.Mercutio 1.0 | 40 | 73% |
| cx.BlestPain 1.41 | 36 | 39% |
| ahf.NanoAndrew .4 | 9 | 100% |
| nic.Nicator 2.4 | 5 | 80% |
| maribo.melee.BMV 0.1 | 3 | 100% |
| tex.Longbot 0.4 | 1 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 989. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 37 | 31% | 58 |
| et.Predator 1.8 | 30 | 25% | 53 |
| oog.melee.Mercutio 1.0 | 20 | 17% | 47 |
| nic.Nicator 2.4 | 11 | 9% | 16 |
| ahf.NanoAndrew .4 | 9 | 8% | 21 |
| maribo.melee.BMV 0.1 | 4 | 3% | 5 |
| edu.otg.spr.TheTeacher 1.2 | 4 | 3% | 5 |
| goblin.Bender 2.4 | 4 | 3% | 4 |
| tex.Longbot 0.4 | 0 | 0% | 1 |

Posture (Hadur's M records, 201 rounds): 157604 melee ticks, 57470 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 55 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 53217 sent, 48826 reached their opponent, 10885 virtual hits (22.3% of those reached).

## Melee bench: F18

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 147 over 6 battles (24.5 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 89.4 | 125 / 210 | 1.96 | 18.7% | 25996 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.7% | 125 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.8% | 38 |
| uji.DBH 1.1 | 3.3 | 11.5% | 12 |
| agd.Mooserwirt2 2.7 | 3.5 | 11.9% | 17 |
| spinnercat.Robovirus 2.718 | 6.0 | 9.0% | 3 |
| ratosh.Nobo 0.21 | 6.2 | 8.4% | 2 |
| sigterm.Sigterm 1.0 | 6.5 | 8.5% | 11 |
| kawigi.mini.Fhqwhgads 1.1 | 7.3 | 7.7% | 1 |
| stelo.WangRobot 1.0 | 9.2 | 5.4% | 1 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 87.3 | 19 / 35 | 4493 |
| 2 | 1 | 68.6 | 92.1 | 21 / 35 | 4293 |
| 3 | 1 | 68.9 | 92.1 | 23 / 35 | 4354 |
| 4 | 1 | 67.4 | 88.3 | 18 / 35 | 4154 |
| 5 | 1 | 66.8 | 85.7 | 19 / 35 | 4096 |
| 6 | 1 | 69.5 | 90.8 | 25 / 35 | 4606 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 65 | 60% |
| agd.Mooserwirt2 2.7 | 33 | 91% |
| uji.DBH 1.1 | 32 | 75% |
| sigterm.Sigterm 1.0 | 16 | 69% |
| spinnercat.Robovirus 2.718 | 7 | 100% |
| stelo.WangRobot 1.0 | 7 | 86% |
| ratosh.Nobo 0.21 | 6 | 83% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 866. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 35 | 41% | 73 |
| uji.DBH 1.1 | 16 | 19% | 32 |
| agd.Mooserwirt2 2.7 | 12 | 14% | 46 |
| sigterm.Sigterm 1.0 | 8 | 9% | 16 |
| ratosh.Nobo 0.21 | 4 | 5% | 10 |
| spinnercat.Robovirus 2.718 | 3 | 4% | 5 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 4% | 5 |
| stelo.WangRobot 1.0 | 2 | 2% | 11 |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 2% | 9 |

Posture (Hadur's M records, 201 rounds): 138701 melee ticks, 49807 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 47 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 47426 sent, 42892 reached their opponent, 9791 virtual hits (22.8% of those reached).

## Melee bench: F19

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 257 over 6 battles (42.8 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 95.0 | 180 / 210 | 1.45 | 21.3% | 34460 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 21.3% | 180 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.9% | 16 |
| mld.Infinity 2.2 | 3.3 | 12.5% | 8 |
| krillr.mini.JointStrike 2.0.0 | 3.8 | 11.3% | 3 |
| erdnis.Rover 0.3 | 4.8 | 10.3% | 2 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.5% | 0 |
| mbh.Mbh 0.1 | 7.0 | 7.5% | 0 |
| pac.ABC 2.1 | 8.0 | 6.5% | 1 |
| pbg.R2D2 1.0 | 8.8 | 5.9% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 92.4 | 30 / 35 | 5016 |
| 2 | 1 | 73.3 | 98.4 | 32 / 35 | 6005 |
| 3 | 1 | 72.1 | 95.6 | 29 / 35 | 5656 |
| 4 | 1 | 72.4 | 94.3 | 29 / 35 | 6134 |
| 5 | 1 | 72.3 | 94.0 | 30 / 35 | 6014 |
| 6 | 1 | 72.1 | 95.6 | 30 / 35 | 5635 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 103 | 92% |
| mld.Infinity 2.2 | 28 | 100% |
| krillr.mini.JointStrike 2.0.0 | 25 | 100% |
| erdnis.Rover 0.3 | 13 | 100% |
| patson.PatsonTestBot 1.0 | 6 | 100% |
| pac.ABC 2.1 | 5 | 100% |
| pbg.R2D2 1.0 | 5 | 100% |
| mbh.Mbh 0.1 | 3 | 100% |

Hadur died in 31 of 210 rounds, at a mean tick of 759. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 13 | 42% | 64 |
| erdnis.Rover 0.3 | 7 | 23% | 20 |
| krillr.mini.JointStrike 2.0.0 | 4 | 13% | 36 |
| patson.PatsonTestBot 1.0 | 4 | 13% | 21 |
| mld.Infinity 2.2 | 1 | 3% | 41 |
| mbh.Mbh 0.1 | 1 | 3% | 15 |
| pbg.R2D2 1.0 | 0 | 0% | 7 |
| pac.ABC 2.1 | 0 | 0% | 6 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 130447 melee ticks, 43935 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 54 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 43692 sent, 39500 reached their opponent, 10087 virtual hits (25.5% of those reached).

## Melee bench: F20

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 97 over 6 battles (16.2 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 91.3 | 132 / 210 | 1.79 | 19.8% | 31545 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.8% | 132 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.8% | 46 |
| fwb.Nine 1.0.1 | 3.3 | 11.7% | 15 |
| catcat20.Rabbit 0.001 | 4.3 | 10.4% | 12 |
| nz.jdc.nano.GridFu 1.0 | 4.3 | 10.2% | 2 |
| m3thos.mini.Eva01 0.5.5 | 6.2 | 8.2% | 1 |
| bayen.nut.Squirrel 1.615 | 7.3 | 7.0% | 1 |
| djdjdj.NanoSkunk10 1.0 | 7.5 | 6.9% | 0 |
| ntc.ControlledChaos 1.1.4 | 9.2 | 5.4% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 86.0 | 17 / 35 | 4748 |
| 2 | 1 | 69.2 | 89.8 | 18 / 35 | 5200 |
| 3 | 1 | 70.1 | 93.3 | 24 / 35 | 5023 |
| 4 | 1 | 71.6 | 95.2 | 27 / 35 | 5651 |
| 5 | 1 | 69.0 | 88.3 | 20 / 35 | 5190 |
| 6 | 1 | 71.5 | 94.9 | 26 / 35 | 5733 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 75 | 76% |
| fwb.Nine 1.0.1 | 35 | 94% |
| catcat20.Rabbit 0.001 | 29 | 72% |
| nz.jdc.nano.GridFu 1.0 | 10 | 90% |
| bayen.nut.Squirrel 1.615 | 6 | 100% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| m3thos.mini.Eva01 0.5.5 | 1 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 0% |

Hadur died in 79 of 210 rounds, at a mean tick of 1034. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 42 | 53% | 95 |
| fwb.Nine 1.0.1 | 16 | 20% | 28 |
| catcat20.Rabbit 0.001 | 15 | 19% | 40 |
| bayen.nut.Squirrel 1.615 | 2 | 3% | 9 |
| m3thos.mini.Eva01 0.5.5 | 2 | 3% | 9 |
| nz.jdc.nano.GridFu 1.0 | 1 | 1% | 17 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 3 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 201 rounds): 171411 melee ticks, 49613 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 47 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 54533 sent, 50094 reached their opponent, 12057 virtual hits (24.1% of those reached).

## Melee bench: F21

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 10 other Robocode JVMs running (hadur.bench.MeleeRunner x10), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 403 over 6 battles (67.2 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 91.2 | 119 / 210 | 1.79 | 19.6% | 31486 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.6% | 119 |
| eem.EvBot v4.6.16 | 2.0 | 16.8% | 73 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.9% | 7 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.4% | 4 |
| eld.Hmm 1.0 | 5.0 | 8.9% | 7 |
| oa.weak.BotherBot 0.1 | 6.0 | 7.9% | 1 |
| fire219.CatBot 1.0 | 7.2 | 6.4% | 0 |
| el.JumpShoot 0.2 | 8.2 | 5.3% | 0 |
| PSW.Relentless 0.1 | 9.0 | 5.1% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 90.2 | 18 / 35 | 5023 |
| 2 | 1 | 69.9 | 91.7 | 21 / 35 | 5012 |
| 3 | 1 | 70.7 | 93.7 | 20 / 35 | 5406 |
| 4 | 1 | 70.3 | 91.1 | 20 / 35 | 5577 |
| 5 | 1 | 69.4 | 87.6 | 20 / 35 | 5326 |
| 6 | 1 | 70.5 | 93.0 | 20 / 35 | 5142 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 128 | 62% |
| dummy.mini.Scimitar 1.01 | 22 | 86% |
| cf.RiO.RiOx 4.2.1 | 18 | 89% |
| eld.Hmm 1.0 | 7 | 43% |
| oa.weak.BotherBot 0.1 | 2 | 50% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 1302. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 53 | 56% | 109 |
| dummy.mini.Scimitar 1.01 | 17 | 18% | 48 |
| cf.RiO.RiOx 4.2.1 | 11 | 12% | 29 |
| eld.Hmm 1.0 | 7 | 7% | 17 |
| PSW.Relentless 0.1 | 2 | 2% | 2 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 180732 melee ticks, 83372 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 57 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 54437 sent, 50149 reached their opponent, 9371 virtual hits (18.7% of those reached).

## Melee bench: F22

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 13 other Robocode JVMs running (hadur.bench.MeleeRunner x13), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 324 over 6 battles (54.0 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 88.7 | 100 / 210 | 2.02 | 17.8% | 25221 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.8% | 100 |
| pe.SandboxDT 2.71m | 2.3 | 16.2% | 55 |
| kvk.HebusLeTroll 0.35 | 2.8 | 15.1% | 30 |
| jlm.javaDisturbance 0.59 | 3.8 | 12.9% | 17 |
| bigpete.Stewie 1.0 | 5.0 | 10.6% | 8 |
| tad.Dalek98 0.98 | 6.7 | 6.6% | 0 |
| yk.JahRoslav 1.1 | 6.7 | 7.0% | 0 |
| gg.Squaraus 0.6 | 7.7 | 6.2% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 5.0% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 89.2 | 17 / 35 | 4042 |
| 2 | 1 | 65.8 | 82.9 | 15 / 35 | 3925 |
| 3 | 1 | 67.9 | 88.9 | 17 / 35 | 4054 |
| 4 | 1 | 68.9 | 89.8 | 18 / 35 | 4746 |
| 5 | 1 | 68.1 | 89.8 | 16 / 35 | 4164 |
| 6 | 1 | 68.7 | 91.4 | 17 / 35 | 4290 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 62 | 53% |
| kvk.HebusLeTroll 0.35 | 48 | 63% |
| jlm.javaDisturbance 0.59 | 34 | 85% |
| bigpete.Stewie 1.0 | 7 | 57% |
| yk.JahRoslav 1.1 | 3 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 1004. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 51 | 45% | 86 |
| kvk.HebusLeTroll 0.35 | 31 | 27% | 54 |
| jlm.javaDisturbance 0.59 | 19 | 17% | 47 |
| bigpete.Stewie 1.0 | 7 | 6% | 13 |
| gg.Squaraus 0.6 | 1 | 1% | 3 |
| tad.Dalek98 0.98 | 1 | 1% | 2 |
| pbg.NinjaX 1.2 | 1 | 1% | 1 |
| yk.JahRoslav 1.1 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 167275 melee ticks, 43961 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 33 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 53591 sent, 49221 reached their opponent, 8212 virtual hits (16.7% of those reached).

## Melee bench: F23

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 477 over 6 battles (79.5 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 94.4 | 158 / 210 | 1.50 | 20.6% | 32027 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 20.6% | 158 |
| pe.SandboxLump 1.52 | 2.0 | 17.2% | 39 |
| cre.Karolos 0.32 | 3.0 | 14.2% | 11 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 9.9% | 0 |
| stelo.RamTrackSurfer 1.2 | 5.2 | 9.2% | 2 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.3 | 8.6% | 0 |
| cw.megas.Blade 0.8 | 6.7 | 8.0% | 0 |
| sample.Walls 1.0 | 7.5 | 7.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.2 | 2.6% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 96.2 | 27 / 35 | 5409 |
| 2 | 1 | 71.4 | 94.6 | 27 / 35 | 4999 |
| 3 | 1 | 71.7 | 94.0 | 25 / 35 | 5354 |
| 4 | 1 | 71.2 | 93.3 | 26 / 35 | 5357 |
| 5 | 1 | 72.6 | 96.8 | 29 / 35 | 5540 |
| 6 | 1 | 71.6 | 91.7 | 24 / 35 | 5368 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 110 | 81% |
| cre.Karolos 0.32 | 45 | 91% |
| stelo.AreaTargetingBot 1.1 | 11 | 100% |
| stelo.RamTrackSurfer 1.2 | 7 | 86% |
| sample.Walls 1.0 | 6 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 34 | 61% | 99 |
| cre.Karolos 0.32 | 15 | 27% | 58 |
| stelo.AreaTargetingBot 1.1 | 2 | 4% | 14 |
| stelo.RamTrackSurfer 1.2 | 1 | 2% | 21 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 8 |
| sample.Walls 1.0 | 0 | 0% | 7 |
| cw.megas.Blade 0.8 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 131579 melee ticks, 51110 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 45 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 45 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 42097 sent, 37656 reached their opponent, 12024 virtual hits (31.9% of those reached).

## Melee bench: F24

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 515 over 6 battles (85.8 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 80.2 | 74 / 210 | 2.79 | 15.7% | 20375 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.2 | 15.7% | 74 |
| rz.GlowBlowMelee 1.4 | 2.0 | 14.2% | 41 |
| florent.XSeries.X2 0.12 | 3.5 | 12.9% | 25 |
| pedersen.Ugluk 1.1.1 | 4.2 | 12.2% | 18 |
| davidalves.Phoenix 0.54 | 4.3 | 12.3% | 34 |
| oog.melee.Corsair 1.0 | 6.0 | 9.5% | 14 |
| stelo.SoJNanoMelee 1.1 | 7.2 | 7.5% | 6 |
| lunchie.Lunchbox 0.93 | 7.7 | 6.4% | 0 |
| as.FrankTheTank 1.3 | 9.5 | 4.8% | 0 |
| evd.X1 0.01 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 81.3 | 16 / 35 | 3467 |
| 2 | 1 | 64.1 | 80.3 | 12 / 35 | 3506 |
| 3 | 2 | 62.0 | 74.6 | 9 / 35 | 3237 |
| 4 | 1 | 65.2 | 82.9 | 13 / 35 | 3689 |
| 5 | 1 | 63.6 | 80.0 | 12 / 35 | 3203 |
| 6 | 1 | 63.9 | 81.9 | 12 / 35 | 3273 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 35 | 63% |
| davidalves.Phoenix 0.54 | 25 | 40% |
| florent.XSeries.X2 0.12 | 24 | 63% |
| pedersen.Ugluk 1.1.1 | 17 | 65% |
| oog.melee.Corsair 1.0 | 16 | 50% |
| stelo.SoJNanoMelee 1.1 | 6 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 781. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 29 | 20% | 55 |
| davidalves.Phoenix 0.54 | 29 | 20% | 38 |
| pedersen.Ugluk 1.1.1 | 25 | 18% | 33 |
| florent.XSeries.X2 0.12 | 23 | 16% | 39 |
| oog.melee.Corsair 1.0 | 16 | 11% | 25 |
| lunchie.Lunchbox 0.93 | 8 | 6% | 10 |
| stelo.SoJNanoMelee 1.1 | 3 | 2% | 6 |
| as.FrankTheTank 1.3 | 2 | 1% | 3 |
| evd.X1 0.01 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 141224 melee ticks, 37949 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 47 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 47919 sent, 43220 reached their opponent, 8536 virtual hits (19.8% of those reached).

## Melee bench: F25

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 318 over 6 battles (53.0 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 85.7 | 123 / 210 | 2.29 | 17.7% | 21269 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.7% | 123 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 14.1% | 20 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 13.3% | 22 |
| jdw.Hurricane 1.4 | 3.7 | 11.7% | 20 |
| gre.svman4.Morfeas 1.4.1 | 5.5 | 9.0% | 8 |
| ds.Oo 2.2 | 5.7 | 9.0% | 9 |
| awesomeness.Elite 1.0 | 7.3 | 7.5% | 4 |
| adt.Ar2 1.1 | 8.0 | 7.0% | 2 |
| gjr.Cephalosporin 0.1 | 8.7 | 6.3% | 2 |
| amk.ChumbaMini 0.2 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 88.9 | 22 / 35 | 3880 |
| 2 | 1 | 68.5 | 92.1 | 24 / 35 | 3527 |
| 3 | 1 | 69.4 | 93.0 | 25 / 35 | 3828 |
| 4 | 1 | 67.8 | 87.0 | 23 / 35 | 3546 |
| 5 | 1 | 62.1 | 73.3 | 12 / 35 | 3161 |
| 6 | 1 | 64.4 | 80.0 | 17 / 35 | 3327 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 54 | 91% |
| voidious.micro.BlitzBat 1.05 | 42 | 83% |
| jdw.Hurricane 1.4 | 28 | 75% |
| ds.Oo 2.2 | 10 | 60% |
| awesomeness.Elite 1.0 | 5 | 80% |
| gre.svman4.Morfeas 1.4.1 | 5 | 60% |
| gjr.Cephalosporin 0.1 | 4 | 75% |
| adt.Ar2 1.1 | 3 | 67% |

Hadur died in 89 of 210 rounds, at a mean tick of 660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 24 | 27% | 49 |
| voidious.micro.BlitzBat 1.05 | 18 | 20% | 45 |
| voidious.mini.BrokenSword 2.0.3 | 17 | 19% | 55 |
| ds.Oo 2.2 | 12 | 13% | 21 |
| gre.svman4.Morfeas 1.4.1 | 6 | 7% | 15 |
| adt.Ar2 1.1 | 5 | 6% | 7 |
| awesomeness.Elite 1.0 | 2 | 2% | 8 |
| amk.ChumbaMini 0.2 | 2 | 2% | 4 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 6 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 128161 melee ticks, 28389 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 39 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 45660 sent, 41257 reached their opponent, 7126 virtual hits (17.3% of those reached).

## Melee bench: F26

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 11 other Robocode JVMs running (hadur.bench.MeleeRunner x11), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 116 over 6 battles (19.3 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 89.0 | 118 / 210 | 1.99 | 19.0% | 32178 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.0% | 118 |
| ak.Fermat 2.0 | 2.0 | 15.3% | 44 |
| lrem.Spectre 0.4.4 | 3.5 | 12.6% | 15 |
| shu.nitro.LENIN .T34 | 3.5 | 12.6% | 28 |
| js.PinBall 1.6 | 5.3 | 10.4% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.3% | 1 |
| gh.mini.GrubbmOne 1.0 | 6.7 | 8.7% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.3% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 85.1 | 19 / 35 | 5285 |
| 2 | 1 | 70.4 | 92.4 | 21 / 35 | 5528 |
| 3 | 1 | 70.7 | 91.1 | 22 / 35 | 5812 |
| 4 | 1 | 68.5 | 87.3 | 16 / 35 | 5060 |
| 5 | 1 | 69.0 | 87.9 | 17 / 35 | 5148 |
| 6 | 1 | 70.0 | 90.5 | 23 / 35 | 5345 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 62 | 66% |
| shu.nitro.LENIN .T34 | 36 | 81% |
| lrem.Spectre 0.4.4 | 35 | 86% |
| js.PinBall 1.6 | 11 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 6 | 83% |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 932. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 41 | 45% | 82 |
| shu.nitro.LENIN .T34 | 22 | 24% | 52 |
| lrem.Spectre 0.4.4 | 13 | 14% | 38 |
| js.PinBall 1.6 | 8 | 9% | 17 |
| jaybot.adv.bots.JayBot 2.0 | 7 | 8% | 14 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 1% | 3 |
| sample.SpinBot 1.0 | 0 | 0% | 2 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 200 rounds): 161292 melee ticks, 43373 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 40 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 52860 sent, 48425 reached their opponent, 12586 virtual hits (26.0% of those reached).

## Melee bench: F27

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 9 other Robocode JVMs running (hadur.bench.MeleeRunner x9), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 627 over 6 battles (104.5 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 76.2 | 126 / 210 | 3.14 | 16.9% | 26426 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.8 | 14.2% | 44 |
| hadur2.Hadur 3.17.1aa | 2.3 | 16.9% | 126 |
| wee.Gem 1.8.4 | 4.0 | 10.5% | 12 |
| techdude.kombat.FlamingKombat 1.5 | 5.0 | 9.4% | 2 |
| EH.Eagle 1.0.6 | 5.3 | 9.0% | 7 |
| sheldor.melee.nano.TestMelee 0.1 | 5.7 | 9.5% | 11 |
| throxbot.ThroxBot 0.1 | 6.0 | 8.9% | 2 |
| joe.ADinosaur 1.0 | 6.8 | 8.8% | 3 |
| caimano.Furia_Ceca 0.22 | 8.3 | 7.3% | 3 |
| cs.Grudge 1.0 | 9.7 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 94.9 | 30 / 35 | 4856 |
| 2 | 1 | 69.1 | 91.1 | 24 / 35 | 4376 |
| 3 | 1 | 70.5 | 95.2 | 30 / 35 | 4743 |
| 4 | 4 | 54.6 | 45.4 | 9 / 35 | 3924 |
| 5 | 1 | 69.9 | 92.1 | 26 / 35 | 5026 |
| 6 | 6 | 49.7 | 38.7 | 7 / 35 | 3501 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 70 | 86% |
| EH.Eagle 1.0.6 | 16 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 14 | 100% |
| wee.Gem 1.8.4 | 11 | 91% |
| throxbot.ThroxBot 0.1 | 10 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 10 | 90% |
| joe.ADinosaur 1.0 | 5 | 80% |
| caimano.Furia_Ceca 0.22 | 4 | 75% |

Hadur died in 89 of 210 rounds, at a mean tick of 484. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cs.Grudge 1.0 | 28 | 31% | 29 |
| mk.Alpha 0.2.1 | 19 | 21% | 71 |
| throxbot.ThroxBot 0.1 | 12 | 13% | 17 |
| sheldor.melee.nano.TestMelee 0.1 | 8 | 9% | 21 |
| joe.ADinosaur 1.0 | 6 | 7% | 10 |
| wee.Gem 1.8.4 | 5 | 6% | 20 |
| EH.Eagle 1.0.6 | 4 | 4% | 22 |
| caimano.Furia_Ceca 0.22 | 1 | 1% | 10 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 1% | 9 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 118319 melee ticks, 30886 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 97 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 97 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 39955 sent, 35601 reached their opponent, 9459 virtual hits (26.6% of those reached).

## Melee bench: F28

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 9 other Robocode JVMs running (hadur.bench.MeleeRunner x9), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 628 over 6 battles (104.7 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 87.3 | 127 / 210 | 2.14 | 17.9% | 22785 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.9% | 127 |
| kid.test.NightFox .2 | 2.2 | 14.3% | 29 |
| uji.Antique 1.0 | 3.0 | 12.4% | 23 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 10.4% | 10 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.1% | 4 |
| ahr.ice.Ice 1.0.2 | 6.7 | 8.6% | 8 |
| amk.ChumbaWumba 0.3 | 6.8 | 8.0% | 5 |
| matt.advanced.Katana 1.0 | 8.5 | 6.5% | 2 |
| stelo.Lifestealer 1.0 | 9.0 | 6.0% | 0 |
| stelo.PianistNano 1.2 | 9.0 | 5.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 82.2 | 17 / 35 | 3679 |
| 2 | 1 | 67.3 | 89.8 | 21 / 35 | 3719 |
| 3 | 1 | 67.0 | 87.3 | 20 / 35 | 3831 |
| 4 | 1 | 65.6 | 83.5 | 22 / 35 | 3381 |
| 5 | 1 | 68.4 | 90.5 | 22 / 35 | 4241 |
| 6 | 1 | 68.4 | 90.5 | 25 / 35 | 3934 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 66 | 85% |
| uji.Antique 1.0 | 47 | 83% |
| qohnil.blot.BlotBot 3.61 | 13 | 62% |
| amk.ChumbaWumba 0.3 | 11 | 73% |
| pfvicm.Sobieski 7.2.3b | 10 | 90% |
| ahr.ice.Ice 1.0.2 | 8 | 63% |
| stelo.Lifestealer 1.0 | 1 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 21 | 24% | 56 |
| pfvicm.Sobieski 7.2.3b | 18 | 20% | 29 |
| uji.Antique 1.0 | 15 | 17% | 55 |
| amk.ChumbaWumba 0.3 | 10 | 11% | 23 |
| qohnil.blot.BlotBot 3.61 | 10 | 11% | 23 |
| ahr.ice.Ice 1.0.2 | 6 | 7% | 12 |
| stelo.PianistNano 1.2 | 2 | 2% | 6 |
| matt.advanced.Katana 1.0 | 1 | 1% | 6 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 128501 melee ticks, 38288 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 56 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 43532 sent, 39180 reached their opponent, 6098 virtual hits (15.6% of those reached).

## Melee bench: F29

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 141 over 6 battles (23.5 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 85.2 | 95 / 210 | 2.33 | 17.9% | 25806 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.9% | 95 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 15.2% | 52 |
| deewiant.Anomaly 0.2 | 2.7 | 15.2% | 46 |
| myl.micro.Troodon 1.10 | 3.8 | 12.5% | 8 |
| jok.PheonixM 0.1.2 | 5.0 | 10.5% | 6 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.4% | 0 |
| DBall.Anarchy 0.1 | 8.0 | 5.5% | 2 |
| fullsail.TimbotNoPrediction 1.0 | 8.2 | 5.4% | 0 |
| ap.Frederick 1.1 | 8.5 | 5.1% | 0 |
| jangs.ns51 1.0 | 9.3 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 84.8 | 19 / 35 | 4271 |
| 2 | 1 | 67.1 | 83.2 | 15 / 35 | 4103 |
| 3 | 1 | 68.4 | 87.0 | 16 / 35 | 4242 |
| 4 | 1 | 66.9 | 81.0 | 11 / 35 | 4372 |
| 5 | 1 | 66.9 | 84.1 | 15 / 35 | 4068 |
| 6 | 1 | 70.1 | 91.1 | 19 / 35 | 4750 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 63 | 65% |
| zyx.mega.YersiniaPestis 3.1 | 47 | 57% |
| myl.micro.Troodon 1.10 | 15 | 73% |
| jok.PheonixM 0.1.2 | 10 | 80% |
| ap.Frederick 1.1 | 5 | 100% |
| jangs.ns51 1.0 | 2 | 50% |
| DBall.Anarchy 0.1 | 2 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 931. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 41 | 36% | 81 |
| zyx.mega.YersiniaPestis 3.1 | 39 | 34% | 69 |
| myl.micro.Troodon 1.10 | 17 | 15% | 28 |
| jok.PheonixM 0.1.2 | 12 | 10% | 19 |
| ph.melee.ArcherME 0.3 | 3 | 3% | 5 |
| jangs.ns51 1.0 | 2 | 2% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 1 |
| DBall.Anarchy 0.1 | 0 | 0% | 4 |

Posture (Hadur's M records, 201 rounds): 162402 melee ticks, 48786 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 34 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 54381 sent, 49929 reached their opponent, 8445 virtual hits (16.9% of those reached).

## Melee bench: F30

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 120 over 6 battles (20.0 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 74.7 | 35 / 210 | 3.28 | 14.2% | 19848 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 1.8 | 13.9% | 48 |
| hadur2.Hadur 3.17.1aa | 2.3 | 14.2% | 35 |
| catcat20.Matcha 0.006 | 3.0 | 13.6% | 46 |
| stelo.PastFuture 2.3.2 | 3.7 | 12.8% | 29 |
| oog.melee.Capulet 1.2 | 4.2 | 12.3% | 28 |
| intruder.PrairieWolf 2.61 | 6.2 | 8.8% | 7 |
| fowl3628800.LightningBolt 2.6.0 | 7.2 | 8.1% | 12 |
| ntc.Opposite 1.5 | 8.3 | 7.0% | 0 |
| tripphippy.Alice 1.1 | 8.3 | 6.8% | 5 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 80.0 | 11 / 35 | 3535 |
| 2 | 2 | 62.7 | 78.4 | 5 / 35 | 3546 |
| 3 | 4 | 57.8 | 64.4 | 4 / 35 | 3164 |
| 4 | 1 | 63.3 | 79.4 | 6 / 35 | 3625 |
| 5 | 4 | 59.6 | 72.1 | 4 / 35 | 2889 |
| 6 | 2 | 60.6 | 73.7 | 5 / 35 | 3089 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 26 | 42% |
| catcat20.Matcha 0.006 | 22 | 45% |
| stelo.PastFuture 2.3.2 | 12 | 42% |
| oog.melee.Capulet 1.2 | 10 | 20% |
| intruder.PrairieWolf 2.61 | 6 | 50% |
| fowl3628800.LightningBolt 2.6.0 | 5 | 80% |
| tripphippy.Alice 1.1 | 1 | 0% |

Hadur died in 175 of 210 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PastFuture 2.3.2 | 39 | 22% | 48 |
| darkcanuck.B26354 1.06 | 39 | 22% | 47 |
| catcat20.Matcha 0.006 | 36 | 21% | 48 |
| oog.melee.Capulet 1.2 | 27 | 15% | 31 |
| fowl3628800.LightningBolt 2.6.0 | 15 | 9% | 14 |
| intruder.PrairieWolf 2.61 | 8 | 5% | 10 |
| ntc.Opposite 1.5 | 6 | 3% | 6 |
| tripphippy.Alice 1.1 | 5 | 3% | 6 |

Posture (Hadur's M records, 203 rounds): 166347 melee ticks, 21805 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 42 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 52875 sent, 48259 reached their opponent, 8235 virtual hits (17.1% of those reached).

## Melee bench: F31

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 13 other Robocode JVMs running (hadur.bench.MeleeRunner x13), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 329 over 6 battles (54.8 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 79.0 | 48 / 210 | 2.89 | 15.0% | 18618 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.0% | 98 |
| hadur2.Hadur 3.17.1aa | 2.0 | 15.0% | 48 |
| gh.mini.Griezel 0.2 | 3.0 | 13.1% | 47 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.7% | 9 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 11.3% | 8 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.6% | 1 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.7% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.3 | 5.4% | 0 |
| fm.mammillarias 1.3 | 8.7 | 5.6% | 0 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 74.6 | 9 / 35 | 2832 |
| 2 | 2 | 63.7 | 80.3 | 8 / 35 | 3152 |
| 3 | 2 | 63.1 | 80.0 | 7 / 35 | 2929 |
| 4 | 2 | 61.8 | 75.6 | 8 / 35 | 2976 |
| 5 | 2 | 64.5 | 81.9 | 9 / 35 | 3448 |
| 6 | 2 | 64.4 | 81.9 | 7 / 35 | 3281 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 52 | 35% |
| gh.mini.Griezel 0.2 | 30 | 40% |
| d414.nano.Quantum 1.0.0 | 13 | 85% |
| spinnercat.micro.Tyger 0.1 | 5 | 100% |
| gh.nano.Grofvuil 0.2 | 2 | 100% |

Hadur died in 165 of 210 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 64 | 39% | 79 |
| gh.mini.Griezel 0.2 | 42 | 25% | 55 |
| d414.nano.Quantum 1.0.0 | 22 | 13% | 31 |
| spinnercat.micro.Tyger 0.1 | 19 | 12% | 25 |
| gh.nano.Grofvuil 0.2 | 5 | 3% | 8 |
| timmit.nano.TimDog 0.33 | 5 | 3% | 7 |
| fm.mammillarias 1.3 | 4 | 2% | 4 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 163121 melee ticks, 30919 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 31 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 52534 sent, 47857 reached their opponent, 8134 virtual hits (17.0% of those reached).

## Melee bench: F32

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 335 over 6 battles (55.8 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 84.8 | 90 / 210 | 2.37 | 16.9% | 23353 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.3 | 16.9% | 90 |
| kawigi.sbf.FloodHT 0.9.2 | 1.7 | 16.1% | 70 |
| apc.botM 3.0 | 3.0 | 12.2% | 25 |
| lxx.ConceptA 0.8 | 4.5 | 10.7% | 4 |
| vjik.UnViolation 1.1 | 5.0 | 9.3% | 6 |
| bayen.UbaMicro 1.4 | 5.5 | 8.7% | 2 |
| panzer.Panzer 0.2 | 7.7 | 7.3% | 1 |
| yk.JahMicro 1.0 | 7.8 | 7.1% | 6 |
| conscience.Electron 1.3g | 9.0 | 6.3% | 1 |
| donjezza.Jezza 1.0 | 9.5 | 5.3% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 83.8 | 17 / 35 | 4142 |
| 2 | 2 | 67.3 | 89.8 | 16 / 35 | 4136 |
| 3 | 1 | 65.1 | 82.5 | 16 / 35 | 3698 |
| 4 | 1 | 64.9 | 82.5 | 14 / 35 | 3866 |
| 5 | 1 | 65.6 | 86.3 | 16 / 35 | 3905 |
| 6 | 2 | 64.4 | 83.8 | 11 / 35 | 3606 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 85 | 53% |
| apc.botM 3.0 | 20 | 45% |
| vjik.UnViolation 1.1 | 14 | 86% |
| lxx.ConceptA 0.8 | 9 | 100% |
| donjezza.Jezza 1.0 | 6 | 50% |
| yk.JahMicro 1.0 | 6 | 83% |
| bayen.UbaMicro 1.4 | 4 | 100% |
| panzer.Panzer 0.2 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 51 | 42% | 88 |
| lxx.ConceptA 0.8 | 23 | 19% | 28 |
| apc.botM 3.0 | 22 | 18% | 36 |
| vjik.UnViolation 1.1 | 5 | 4% | 17 |
| bayen.UbaMicro 1.4 | 5 | 4% | 14 |
| donjezza.Jezza 1.0 | 4 | 3% | 8 |
| panzer.Panzer 0.2 | 4 | 3% | 7 |
| conscience.Electron 1.3g | 4 | 3% | 6 |
| yk.JahMicro 1.0 | 2 | 2% | 5 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 124163 melee ticks, 45143 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 55 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 43165 sent, 38722 reached their opponent, 7518 virtual hits (19.4% of those reached).

## Melee bench: F33

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 223 over 6 battles (37.2 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 83.2 | 90 / 210 | 2.51 | 17.1% | 24161 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.2 | 17.1% | 90 |
| maribo.Quester 0.3 | 1.8 | 16.4% | 47 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 13.0% | 26 |
| gre.svman4.Leonidas 1.3.2 | 4.0 | 11.5% | 18 |
| labg.Cataclysm 2.05 | 4.8 | 10.7% | 21 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.0 | 9.6% | 7 |
| baal.nano.N 1.42 | 6.8 | 8.3% | 1 |
| sanja.First 0.1 | 8.5 | 4.7% | 0 |
| zyx.micro.Ant 1.1 | 8.8 | 5.0% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 85.1 | 18 / 35 | 4310 |
| 2 | 1 | 66.4 | 82.9 | 15 / 35 | 3963 |
| 3 | 1 | 66.4 | 82.2 | 14 / 35 | 4186 |
| 4 | 1 | 67.4 | 85.4 | 17 / 35 | 4219 |
| 5 | 1 | 67.2 | 87.0 | 17 / 35 | 3956 |
| 6 | 2 | 63.8 | 76.8 | 9 / 35 | 3527 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 48 | 71% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 52% |
| gre.svman4.Leonidas 1.3.2 | 24 | 92% |
| labg.Cataclysm 2.05 | 14 | 86% |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 71% |
| baal.nano.N 1.42 | 2 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 934. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 47 | 39% | 84 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 19% | 35 |
| gre.svman4.Leonidas 1.3.2 | 21 | 17% | 36 |
| labg.Cataclysm 2.05 | 11 | 9% | 26 |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 8% | 15 |
| baal.nano.N 1.42 | 5 | 4% | 10 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 2% | 2 |
| zyx.micro.Ant 1.1 | 1 | 1% | 1 |
| sanja.First 0.1 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 169835 melee ticks, 36960 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 57 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 55768 sent, 51189 reached their opponent, 8200 virtual hits (16.0% of those reached).

## Melee bench: F34

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 544 over 6 battles (90.7 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 85.8 | 79 / 210 | 2.28 | 17.3% | 26535 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.5 | 17.3% | 79 |
| stelo.Spread 0.9 | 1.8 | 16.9% | 74 |
| kid.Gladiator .7.2 | 2.7 | 16.1% | 36 |
| jcs.Seth 1.8 | 4.7 | 11.1% | 18 |
| tcf.Reach 3 | 5.0 | 10.1% | 3 |
| cli.Dancer 1.1 | 5.3 | 9.9% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.7% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.6 | 85.4 | 11 / 35 | 4544 |
| 2 | 1 | 67.0 | 86.0 | 13 / 35 | 4092 |
| 3 | 1 | 67.7 | 84.8 | 16 / 35 | 4616 |
| 4 | 1 | 67.7 | 86.7 | 15 / 35 | 4585 |
| 5 | 3 | 66.5 | 84.1 | 7 / 35 | 4392 |
| 6 | 1 | 68.4 | 87.6 | 17 / 35 | 4306 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 66 | 47% |
| kid.Gladiator .7.2 | 42 | 62% |
| jcs.Seth 1.8 | 21 | 57% |
| tcf.Reach 3 | 7 | 71% |
| cli.Dancer 1.1 | 5 | 100% |
| ratosh.Wesco 1.4 | 1 | 0% |

Hadur died in 137 of 210 rounds, at a mean tick of 1088. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 55 | 40% | 87 |
| kid.Gladiator .7.2 | 47 | 34% | 63 |
| jcs.Seth 1.8 | 17 | 12% | 28 |
| tcf.Reach 3 | 6 | 4% | 15 |
| ratosh.Wesco 1.4 | 2 | 1% | 4 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |
| cli.Dancer 1.1 | 1 | 1% | 9 |
| sample.RamFire 1.0 | 1 | 1% | 1 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 181124 melee ticks, 52660 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 61 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 61 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 56401 sent, 51852 reached their opponent, 8942 virtual hits (17.2% of those reached).

## Melee bench: F35

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 198 over 6 battles (33.0 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 79.7 | 35 / 210 | 2.82 | 14.9% | 19487 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.7% | 144 |
| hadur2.Hadur 3.17.1aa | 2.0 | 14.9% | 35 |
| gh.mini.Gruwel 0.9 | 3.3 | 13.1% | 21 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.2 | 12.2% | 7 |
| rz.HawkOnFire 0.1 | 4.5 | 11.8% | 3 |
| wit.Chuliath 1.0 | 6.3 | 6.7% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.0 | 5.6% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.0 | 6.0% | 0 |
| dans.Cinnamon 1.2 | 8.7 | 5.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 79.0 | 4 / 35 | 3119 |
| 2 | 2 | 64.3 | 82.2 | 9 / 35 | 3386 |
| 3 | 2 | 62.7 | 77.1 | 5 / 35 | 3158 |
| 4 | 2 | 63.7 | 81.3 | 7 / 35 | 3133 |
| 5 | 2 | 63.7 | 80.0 | 7 / 35 | 3412 |
| 6 | 2 | 63.3 | 78.7 | 3 / 35 | 3279 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 69 | 9% |
| gh.mini.Gruwel 0.9 | 22 | 45% |
| dmh.robocode.robot.BlackDeath 9.2 | 11 | 91% |
| rz.HawkOnFire 0.1 | 9 | 89% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 176 of 210 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 102 | 58% | 114 |
| gh.mini.Gruwel 0.9 | 24 | 14% | 35 |
| dmh.robocode.robot.BlackDeath 9.2 | 21 | 12% | 28 |
| rz.HawkOnFire 0.1 | 21 | 12% | 24 |
| wit.Chuliath 1.0 | 2 | 1% | 3 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 2 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 2 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
| stelo.MyAgileRobot 0.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 141362 melee ticks, 39524 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 46 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 45228 sent, 40746 reached their opponent, 6825 virtual hits (16.8% of those reached).

## Melee bench: F36

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 145 over 6 battles (24.2 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 92.3 | 156 / 210 | 1.70 | 20.2% | 29570 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 20.2% | 156 |
| bzdp.Pansy 2.1 | 2.0 | 12.3% | 12 |
| alpha.RainingFire 1.0 | 3.8 | 11.4% | 12 |
| bvh.micro.Freya 0.3 | 4.5 | 10.3% | 7 |
| mz.Cork 0.1 | 4.7 | 10.8% | 12 |
| bvh.mini.Fenrir 0.39 | 5.5 | 10.2% | 2 |
| m3thos.Eva02 0.7.1 | 6.5 | 9.4% | 9 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 5.6% | 0 |
| dl.BetterWalls 1.0 | 8.5 | 5.8% | 1 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 93.0 | 27 / 35 | 5404 |
| 2 | 1 | 72.1 | 98.4 | 31 / 35 | 5078 |
| 3 | 1 | 70.7 | 94.3 | 28 / 35 | 4985 |
| 4 | 1 | 69.9 | 93.3 | 23 / 35 | 4590 |
| 5 | 1 | 69.8 | 90.8 | 26 / 35 | 4819 |
| 6 | 1 | 68.0 | 83.8 | 21 / 35 | 4694 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 44 | 91% |
| mz.Cork 0.1 | 34 | 85% |
| bvh.micro.Freya 0.3 | 31 | 87% |
| alpha.RainingFire 1.0 | 27 | 81% |
| bvh.mini.Fenrir 0.39 | 19 | 95% |
| m3thos.Eva02 0.7.1 | 12 | 100% |
| dl.BetterWalls 1.0 | 4 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.MyFirstRobot 1.0 | 2 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 817. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 11 | 20% | 49 |
| mz.Cork 0.1 | 10 | 18% | 37 |
| bvh.micro.Freya 0.3 | 8 | 15% | 34 |
| m3thos.Eva02 0.7.1 | 7 | 13% | 24 |
| bvh.mini.Fenrir 0.39 | 7 | 13% | 20 |
| alpha.RainingFire 1.0 | 6 | 11% | 28 |
| dl.BetterWalls 1.0 | 5 | 9% | 11 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 5 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 202 rounds): 147283 melee ticks, 44221 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 40 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 51057 sent, 46734 reached their opponent, 10364 virtual hits (22.2% of those reached).

## Melee bench: F37

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 176 over 6 battles (29.3 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 89.3 | 159 / 210 | 1.97 | 19.0% | 30845 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.0% | 159 |
| EBBU.Sim2 1.02 | 3.7 | 9.7% | 1 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.8 | 9.9% | 12 |
| germ.TheMind .2 | 4.2 | 9.7% | 5 |
| stelo.UntouchableNano 1.3 | 6.2 | 8.8% | 8 |
| agrach.Dalek 1.0 | 6.5 | 9.1% | 12 |
| lmk.ACPFinal 0.1 | 6.5 | 8.8% | 3 |
| mb.Beast 0.1 | 7.0 | 8.5% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 7.7 | 8.5% | 1 |
| skm.Ryubot 1.0 | 8.5 | 7.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 89.8 | 27 / 35 | 5086 |
| 2 | 1 | 69.4 | 91.7 | 29 / 35 | 5572 |
| 3 | 1 | 68.2 | 91.4 | 27 / 35 | 5089 |
| 4 | 1 | 67.9 | 89.8 | 27 / 35 | 4971 |
| 5 | 1 | 66.3 | 85.1 | 24 / 35 | 4729 |
| 6 | 1 | 67.8 | 87.6 | 25 / 35 | 5398 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 30 | 97% |
| EBBU.Sim2 1.02 | 26 | 96% |
| stelo.UntouchableNano 1.3 | 25 | 100% |
| mb.Beast 0.1 | 22 | 91% |
| germ.TheMind .2 | 20 | 100% |
| lmk.ACPFinal 0.1 | 16 | 94% |
| com.syncleus.robocode.Dreadnaught 0.1 | 14 | 71% |
| skm.Ryubot 1.0 | 14 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 50% |

Hadur died in 51 of 210 rounds, at a mean tick of 427. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 11 | 22% | 32 |
| mn.nano.perceptual.Impact 1.3.0 | 10 | 20% | 17 |
| lmk.ACPFinal 0.1 | 9 | 18% | 29 |
| agrach.Dalek 1.0 | 6 | 12% | 38 |
| mb.Beast 0.1 | 5 | 10% | 25 |
| EBBU.Sim2 1.02 | 5 | 10% | 17 |
| stelo.UntouchableNano 1.3 | 2 | 4% | 23 |
| germ.TheMind .2 | 2 | 4% | 19 |
| skm.Ryubot 1.0 | 1 | 2% | 9 |

Posture (Hadur's M records, 201 rounds): 98573 melee ticks, 27210 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 41 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 33778 sent, 29719 reached their opponent, 9250 virtual hits (31.1% of those reached).

## Melee bench: F38

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 117 over 6 battles (19.5 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 85.2 | 92 / 210 | 2.33 | 16.9% | 23268 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.3 | 16.9% | 92 |
| justin.Mallais 14.0 | 1.7 | 16.5% | 63 |
| bvh.mini.Freya 0.55 | 3.3 | 12.8% | 15 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.2% | 24 |
| cs.Wren 1.0 | 4.5 | 10.7% | 5 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.5 | 9.0% | 4 |
| kdf.KoulDestroyer 1.0 | 6.5 | 8.8% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.8 | 6.0% | 2 |
| matt.UnderDark3 2.4.34 | 9.5 | 4.1% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 87.9 | 17 / 35 | 3771 |
| 2 | 1 | 66.7 | 86.0 | 16 / 35 | 4007 |
| 3 | 1 | 66.6 | 85.1 | 17 / 35 | 3909 |
| 4 | 2 | 65.7 | 84.8 | 13 / 35 | 3782 |
| 5 | 2 | 65.0 | 81.0 | 13 / 35 | 3789 |
| 6 | 1 | 66.8 | 86.3 | 16 / 35 | 4010 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 56 | 64% |
| bts.mega.Gnarly 1.4 | 32 | 50% |
| bvh.mini.Freya 0.55 | 25 | 72% |
| cs.Wren 1.0 | 10 | 90% |
| kdf.KoulDestroyer 1.0 | 10 | 70% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 67% |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 39 | 33% | 75 |
| bvh.mini.Freya 0.55 | 30 | 25% | 51 |
| bts.mega.Gnarly 1.4 | 25 | 21% | 39 |
| cs.Wren 1.0 | 10 | 8% | 19 |
| kdf.KoulDestroyer 1.0 | 10 | 8% | 12 |
| davidalves.net.DuelistNanoMelee 1.01 | 2 | 2% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 7 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 1 |

Posture (Hadur's M records, 204 rounds): 140511 melee ticks, 34777 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 49 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 46659 sent, 41932 reached their opponent, 9456 virtual hits (22.6% of those reached).

## Melee bench: F39

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 10 other Robocode JVMs running (hadur.bench.MeleeRunner x10), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 203 over 6 battles (33.8 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 83.4 | 84 / 210 | 2.50 | 17.0% | 26355 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.0% | 84 |
| bvh.fry.Freya 0.82 | 2.2 | 14.6% | 29 |
| az.Ololobot 0.2.4 | 2.8 | 13.3% | 64 |
| catcat20.Lambda 0.024 | 4.0 | 11.4% | 23 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.6% | 3 |
| gimp.GimpBot 0.1 | 6.0 | 8.6% | 3 |
| stelo.SoRobotNanoMelee 1.2 | 6.5 | 8.1% | 3 |
| apollokidd.ApolloKidd 0.9 | 7.5 | 7.6% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 6.0% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 81.6 | 15 / 35 | 4399 |
| 2 | 1 | 64.9 | 81.9 | 12 / 35 | 4325 |
| 3 | 1 | 66.2 | 84.4 | 17 / 35 | 4553 |
| 4 | 1 | 66.7 | 84.4 | 17 / 35 | 4634 |
| 5 | 1 | 64.0 | 81.3 | 8 / 35 | 3848 |
| 6 | 1 | 66.9 | 86.7 | 15 / 35 | 4596 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 45 | 44% |
| bvh.fry.Freya 0.82 | 37 | 68% |
| catcat20.Lambda 0.024 | 32 | 53% |
| stelo.SoRobotNanoMelee 1.2 | 10 | 100% |
| gimp.GimpBot 0.1 | 9 | 78% |
| winamp32.micro.MicroMacro 1.0 | 5 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 993. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 40 | 31% | 63 |
| az.Ololobot 0.2.4 | 38 | 30% | 63 |
| catcat20.Lambda 0.024 | 23 | 18% | 34 |
| winamp32.micro.MicroMacro 1.0 | 8 | 6% | 18 |
| stelo.SoRobotNanoMelee 1.2 | 6 | 5% | 8 |
| gimp.GimpBot 0.1 | 5 | 4% | 17 |
| apollokidd.ApolloKidd 0.9 | 3 | 2% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 2% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 165950 melee ticks, 43627 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 79 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 52837 sent, 48544 reached their opponent, 9348 virtual hits (19.3% of those reached).

## Melee bench: F40

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 98 over 6 battles (16.3 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 84.8 | 111 / 210 | 2.37 | 17.9% | 25812 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.9% | 111 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.3% | 43 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.7% | 22 |
| mz.AntiGrav 1.0 | 4.2 | 11.6% | 10 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.7% | 8 |
| stelo.Randomness 1.0 | 6.2 | 9.2% | 11 |
| alpha.BlackIce 1.0 | 6.7 | 8.7% | 4 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.2% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 4.3% | 0 |
| sample.Corners 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 83.5 | 14 / 35 | 3987 |
| 2 | 1 | 68.5 | 86.0 | 21 / 35 | 4625 |
| 3 | 1 | 66.8 | 84.4 | 15 / 35 | 4165 |
| 4 | 1 | 68.4 | 86.0 | 24 / 35 | 4343 |
| 5 | 1 | 67.5 | 84.8 | 17 / 35 | 4458 |
| 6 | 1 | 67.4 | 83.8 | 20 / 35 | 4234 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 65 | 75% |
| kano.gamma.KanoGamma 1.8 | 32 | 69% |
| Polkwane.SmashMelee 1.0 | 18 | 89% |
| mz.AntiGrav 1.0 | 11 | 91% |
| stelo.Randomness 1.0 | 9 | 78% |
| alpha.BlackIce 1.0 | 3 | 100% |
| sample.Corners 1.0 | 2 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 33 | 33% | 65 |
| kano.gamma.KanoGamma 1.8 | 16 | 16% | 47 |
| stelo.Randomness 1.0 | 14 | 14% | 25 |
| Polkwane.SmashMelee 1.0 | 14 | 14% | 21 |
| mz.AntiGrav 1.0 | 10 | 10% | 25 |
| alpha.BlackIce 1.0 | 6 | 6% | 11 |
| amk.superstrike.SuperStrike 0.3 | 5 | 5% | 10 |
| sample.Corners 1.0 | 1 | 1% | 3 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 202 rounds): 147915 melee ticks, 37848 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 80 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 50213 sent, 45638 reached their opponent, 10061 virtual hits (22.0% of those reached).

## Melee bench: F41

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 213 over 6 battles (35.5 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 85.1 | 91 / 210 | 2.34 | 17.1% | 23199 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.2 | 17.1% | 91 |
| eem.EvBotNG v12.8 | 1.8 | 16.4% | 78 |
| ary.Swarm 1.1 | 3.2 | 13.2% | 18 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.8% | 15 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.9% | 6 |
| shrub.Silver v048 | 6.0 | 8.7% | 0 |
| zyx.nano.Ant 1.1 | 7.0 | 7.5% | 1 |
| jsal.Jsalbot 1.0 | 8.3 | 5.5% | 1 |
| stelo.Mirror 1.1 | 8.7 | 5.2% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 86.0 | 15 / 35 | 3721 |
| 2 | 1 | 65.4 | 82.2 | 14 / 35 | 3619 |
| 3 | 2 | 66.6 | 84.4 | 13 / 35 | 4020 |
| 4 | 1 | 68.7 | 92.4 | 18 / 35 | 4175 |
| 5 | 1 | 67.0 | 84.1 | 17 / 35 | 3987 |
| 6 | 1 | 65.3 | 81.6 | 14 / 35 | 3677 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 66 | 50% |
| lessonz.robocode.Oz 0.5.0 | 31 | 74% |
| ary.Swarm 1.1 | 20 | 80% |
| simonton.nano.MeleeSeed 1.8 | 13 | 100% |
| shrub.Silver v048 | 3 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 900. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 58 | 48% | 92 |
| lessonz.robocode.Oz 0.5.0 | 26 | 21% | 44 |
| ary.Swarm 1.1 | 22 | 18% | 37 |
| simonton.nano.MeleeSeed 1.8 | 9 | 7% | 23 |
| jsal.Jsalbot 1.0 | 2 | 2% | 6 |
| zyx.nano.Ant 1.1 | 2 | 2% | 3 |
| stelo.Mirror 1.1 | 1 | 1% | 4 |
| shrub.Silver v048 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 151852 melee ticks, 43087 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 150 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 150 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 51014 sent, 46498 reached their opponent, 7812 virtual hits (16.8% of those reached).

## Melee bench: F42

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 108 over 6 battles (18.0 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.9 | 115 / 210 | 2.00 | 18.6% | 29589 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.6% | 115 |
| wompi.Wallaby 5.1 | 2.0 | 16.1% | 55 |
| ara.Shera 0.88 | 3.3 | 12.9% | 21 |
| maribo.mini.MiniQuester 0.1 | 3.7 | 13.3% | 19 |
| amz.NanoClone 1.41 | 5.0 | 9.2% | 0 |
| maribo.IotaCT 1.1 | 6.8 | 6.8% | 0 |
| dsw.StaticD 1.0 | 7.2 | 6.6% | 1 |
| mme.NikeEnhanced 2.0 | 8.3 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 8.8 | 5.4% | 0 |
| stelo.MirrorMicro 1.0 | 8.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 87.3 | 19 / 35 | 4860 |
| 2 | 1 | 69.7 | 91.7 | 20 / 35 | 5156 |
| 3 | 1 | 69.3 | 90.8 | 22 / 35 | 4881 |
| 4 | 1 | 66.9 | 86.3 | 11 / 35 | 4856 |
| 5 | 1 | 68.4 | 87.3 | 18 / 35 | 5038 |
| 6 | 1 | 68.9 | 89.8 | 25 / 35 | 4798 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 86 | 77% |
| maribo.mini.MiniQuester 0.1 | 35 | 74% |
| ara.Shera 0.88 | 22 | 59% |
| dsw.StaticD 1.0 | 7 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 959. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 42 | 43% | 106 |
| ara.Shera 0.88 | 25 | 26% | 42 |
| maribo.mini.MiniQuester 0.1 | 21 | 21% | 45 |
| amz.NanoClone 1.41 | 4 | 4% | 6 |
| dsw.StaticD 1.0 | 2 | 2% | 6 |
| maribo.IotaCT 1.1 | 2 | 2% | 3 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 165489 melee ticks, 42816 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 47 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 52763 sent, 48481 reached their opponent, 10333 virtual hits (21.3% of those reached).

## Melee bench: F43

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 532 over 6 battles (88.7 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 77.3 | 23 / 210 | 3.04 | 14.3% | 19120 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.0% | 150 |
| hadur2.Hadur 3.17.1aa | 2.0 | 14.3% | 23 |
| brainfade.melee.Dusk 0.44 | 3.0 | 12.9% | 23 |
| wcsv.melee.EngineerMelee 0.1 | 4.3 | 11.3% | 3 |
| dummy.micro.Sparrow 2.5 | 4.7 | 11.1% | 7 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.6% | 4 |
| jab.DiamondStealer 5 | 7.2 | 8.0% | 0 |
| mz.NanoGod 2.02 | 7.8 | 7.5% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.9% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 77.5 | 4 / 35 | 3139 |
| 2 | 2 | 64.9 | 80.0 | 8 / 35 | 3333 |
| 3 | 2 | 62.9 | 76.5 | 2 / 35 | 3110 |
| 4 | 2 | 62.2 | 74.0 | 2 / 35 | 3105 |
| 5 | 2 | 64.3 | 80.3 | 3 / 35 | 3300 |
| 6 | 2 | 63.3 | 75.6 | 4 / 35 | 3133 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 76 | 13% |
| brainfade.melee.Dusk 0.44 | 14 | 29% |
| dummy.micro.Sparrow 2.5 | 7 | 43% |
| wcsv.melee.EngineerMelee 0.1 | 6 | 67% |
| Krabb.akim2.Akim2 1.1b | 2 | 0% |
| cvt.Firsty 1.0 | 1 | 100% |
| jab.DiamondStealer 5 | 1 | 100% |

Hadur died in 192 of 210 rounds, at a mean tick of 960. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 104 | 54% | 114 |
| brainfade.melee.Dusk 0.44 | 27 | 14% | 32 |
| dummy.micro.Sparrow 2.5 | 20 | 10% | 23 |
| wcsv.melee.EngineerMelee 0.1 | 17 | 9% | 20 |
| Krabb.akim2.Akim2 1.1b | 9 | 5% | 10 |
| mz.NanoGod 2.02 | 7 | 4% | 7 |
| jab.DiamondStealer 5 | 3 | 2% | 3 |
| cvt.Firsty 1.0 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 158834 melee ticks, 41913 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 32 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 51610 sent, 46890 reached their opponent, 8326 virtual hits (17.8% of those reached).

## Melee bench: F44

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 558 over 6 battles (93.0 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 90.7 | 135 / 210 | 1.84 | 19.7% | 30290 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.7% | 135 |
| stelo.Liblix 0.3.1 | 2.2 | 15.5% | 49 |
| tzu.TheArtOfWar 1.2 | 2.8 | 13.9% | 19 |
| jwirde.Gort 2.0 | 4.5 | 9.7% | 6 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.0 | 9.4% | 1 |
| wompi.Quokka 1.6 | 6.3 | 8.0% | 1 |
| disan.Chair 2.2.0 | 6.5 | 7.7% | 0 |
| stf.PanzerGeneral 0.1 | 7.7 | 7.0% | 0 |
| sample.Crazy 1.0 | 9.3 | 5.0% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.0 | 20 / 35 | 4898 |
| 2 | 1 | 71.0 | 94.3 | 23 / 35 | 5291 |
| 3 | 1 | 70.7 | 91.1 | 24 / 35 | 5411 |
| 4 | 1 | 69.8 | 93.0 | 22 / 35 | 4813 |
| 5 | 1 | 69.9 | 91.4 | 25 / 35 | 5157 |
| 6 | 1 | 68.7 | 87.3 | 21 / 35 | 4720 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 76 | 63% |
| tzu.TheArtOfWar 1.2 | 67 | 88% |
| jwirde.Gort 2.0 | 11 | 91% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 9 | 100% |
| disan.Chair 2.2.0 | 6 | 100% |
| wompi.Quokka 1.6 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 900. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 41 | 51% | 100 |
| tzu.TheArtOfWar 1.2 | 14 | 18% | 58 |
| jwirde.Gort 2.0 | 6 | 8% | 20 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 5% | 9 |
| wompi.Quokka 1.6 | 4 | 5% | 7 |
| disan.Chair 2.2.0 | 3 | 4% | 8 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 4 |
| sample.Crazy 1.0 | 1 | 1% | 3 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 156811 melee ticks, 44066 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 49 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 54970 sent, 50538 reached their opponent, 11171 virtual hits (22.1% of those reached).

## Melee bench: F45

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 766 over 6 battles (127.7 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 84.2 | 83 / 210 | 2.42 | 18.2% | 29580 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.2% | 83 |
| eem.IWillFireNoBullet v2.8 | 2.5 | 12.8% | 92 |
| jje.BagPuss 1.2 | 3.2 | 12.2% | 8 |
| sul.Lunar 1.1 | 4.2 | 11.0% | 10 |
| myl.nano.Graviton 1.10 | 4.2 | 11.1% | 8 |
| pez.mini.ChironexFleckeri 0.5 | 6.8 | 8.7% | 2 |
| fm.claire 1.7 | 7.0 | 8.2% | 2 |
| hvilela.HVilela 0.9 | 7.2 | 8.2% | 1 |
| wit.Deep7 2.0 | 9.0 | 5.3% | 3 |
| abud.ThirdRobo 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 82.2 | 15 / 35 | 5163 |
| 2 | 1 | 69.1 | 88.3 | 17 / 35 | 5372 |
| 3 | 1 | 66.9 | 84.4 | 12 / 35 | 4537 |
| 4 | 1 | 68.2 | 87.6 | 14 / 35 | 4965 |
| 5 | 1 | 67.0 | 82.5 | 15 / 35 | 4839 |
| 6 | 1 | 66.1 | 80.3 | 10 / 35 | 4704 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 80 | 44% |
| sul.Lunar 1.1 | 16 | 94% |
| jje.BagPuss 1.2 | 13 | 77% |
| myl.nano.Graviton 1.10 | 10 | 80% |
| pez.mini.ChironexFleckeri 0.5 | 10 | 90% |
| wit.Deep7 2.0 | 4 | 100% |
| fm.claire 1.7 | 3 | 67% |

Hadur died in 133 of 210 rounds, at a mean tick of 1623. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 56 | 42% | 0 |
| jje.BagPuss 1.2 | 19 | 14% | 61 |
| sul.Lunar 1.1 | 17 | 13% | 50 |
| myl.nano.Graviton 1.10 | 14 | 11% | 39 |
| pez.mini.ChironexFleckeri 0.5 | 9 | 7% | 25 |
| hvilela.HVilela 0.9 | 6 | 5% | 13 |
| fm.claire 1.7 | 6 | 5% | 11 |
| wit.Deep7 2.0 | 0 | 0% | 7 |
| abud.ThirdRobo 1.0 | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 234003 melee ticks, 86929 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 65 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 68430 sent, 63923 reached their opponent, 10072 virtual hits (15.8% of those reached).

## Melee bench: F46

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 417 over 6 battles (69.5 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 80.8 | 49 / 210 | 2.73 | 15.4% | 22072 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 17.0% | 62 |
| rsalesc.melee.Medina 0.4.5 | 2.0 | 16.8% | 76 |
| hadur2.Hadur 3.17.1aa | 2.8 | 15.4% | 49 |
| mz.MicroSheep 1.0 | 4.3 | 10.8% | 4 |
| cx.Princess 1.0 | 5.2 | 9.6% | 15 |
| sadoner.killer 0.2 | 5.7 | 9.2% | 2 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.4% | 2 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 5.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.1 | 73.7 | 1 / 35 | 3372 |
| 2 | 3 | 63.5 | 77.5 | 9 / 35 | 3534 |
| 3 | 3 | 65.0 | 81.9 | 12 / 35 | 3689 |
| 4 | 3 | 65.7 | 85.4 | 8 / 35 | 3900 |
| 5 | 3 | 63.9 | 81.3 | 7 / 35 | 3591 |
| 6 | 2 | 65.9 | 85.1 | 12 / 35 | 3986 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 54 | 63% |
| rsalesc.melee.Medina 0.4.5 | 33 | 12% |
| cx.Princess 1.0 | 10 | 40% |
| mz.MicroSheep 1.0 | 6 | 83% |
| arthord.NanoSatanMelee Beta | 3 | 67% |

Hadur died in 165 of 210 rounds, at a mean tick of 891. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 68 | 41% | 100 |
| rsalesc.melee.Medina 0.4.5 | 51 | 31% | 57 |
| cx.Princess 1.0 | 14 | 8% | 15 |
| arthord.NanoSatanMelee Beta | 10 | 6% | 11 |
| sadoner.killer 0.2 | 10 | 6% | 11 |
| mz.MicroSheep 1.0 | 9 | 5% | 16 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 153940 melee ticks, 36282 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 57 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 45789 sent, 41282 reached their opponent, 6672 virtual hits (16.2% of those reached).

