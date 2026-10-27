# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 354 over 6 battles (59.0 per battle, most in one battle 142). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 84.3 | 57 / 210 | 2.41 | 17.3% | 31361 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.0% | 129 |
| hadur2.Hadur 3.18ow | 2.0 | 17.3% | 57 |
| sgp.JollyNinja 3.53 | 3.2 | 11.7% | 19 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 10.8% | 1 |
| mz.MicroGodMelee 1 | 4.8 | 10.4% | 4 |
| lorneswork.Predator 1.0 | 6.2 | 9.3% | 0 |
| adt.Ar2 1.0 | 7.2 | 7.8% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.7% | 0 |
| skm.butterfly 1.0 | 8.7 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.2 | 84.1 | 10 / 35 | 5384 |
| 2 | 2 | 66.9 | 82.5 | 8 / 35 | 5534 |
| 3 | 2 | 66.7 | 86.0 | 9 / 35 | 4872 |
| 4 | 2 | 66.4 | 82.2 | 11 / 35 | 4974 |
| 5 | 2 | 67.6 | 84.1 | 10 / 35 | 5669 |
| 6 | 2 | 67.0 | 87.0 | 9 / 35 | 4928 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 110 | 11% |
| sgp.JollyNinja 3.53 | 27 | 78% |
| mz.MicroGodMelee 1 | 11 | 91% |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 91% |
| lorneswork.Predator 1.0 | 2 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 155 of 210 rounds, at a mean tick of 1102. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 108 | 70% | 127 |
| sgp.JollyNinja 3.53 | 19 | 12% | 28 |
| lorneswork.Predator 1.0 | 11 | 7% | 13 |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 6% | 20 |
| mz.MicroGodMelee 1 | 4 | 3% | 14 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 2 |
| adt.Ar2 1.0 | 1 | 1% | 1 |
| skm.butterfly 1.0 | 0 | 0% | 2 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 133498 melee ticks, 81673 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 40 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 43372 sent, 38510 reached their opponent, 7729 virtual hits (20.1% of those reached).

## Melee bench: F02

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 160 over 6 battles (26.7 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 84.7 | 88 / 210 | 2.38 | 18.2% | 29900 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 18.2% | 88 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 13.9% | 49 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.0 | 13.0% | 21 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.9% | 0 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.7 | 10.7% | 14 |
| Noran.BitchingElk 0.054 | 6.0 | 8.8% | 24 |
| sch.Simone 0.3d | 7.3 | 7.5% | 11 |
| fnc.bandit.Bandit 5.2.0 | 7.5 | 7.5% | 1 |
| stelo.PatternRobot 1.0 | 9.0 | 5.6% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 86.3 | 18 / 35 | 5201 |
| 2 | 1 | 67.5 | 84.1 | 16 / 35 | 4872 |
| 3 | 1 | 66.4 | 81.9 | 12 / 35 | 5009 |
| 4 | 1 | 69.0 | 88.9 | 15 / 35 | 5289 |
| 5 | 1 | 67.9 | 86.3 | 18 / 35 | 4724 |
| 6 | 1 | 65.9 | 80.6 | 9 / 35 | 4805 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 43 | 84% |
| pulsar.PulsarMax 0.8.9 | 41 | 51% |
| com.cohesiva.robocode.ManOwaR 1.0 | 23 | 52% |
| Noran.BitchingElk 0.054 | 16 | 19% |
| sch.Simone 0.3d | 14 | 64% |
| lrem.micro.SpikeSoldier 0.4 | 5 | 100% |
| fnc.bandit.Bandit 5.2.0 | 2 | 50% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 1019. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 50 | 40% | 66 |
| com.cohesiva.robocode.ManOwaR 1.0 | 16 | 13% | 29 |
| Noran.BitchingElk 0.054 | 16 | 13% | 21 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 12 | 10% | 48 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 10% | 16 |
| sch.Simone 0.3d | 10 | 8% | 15 |
| fnc.bandit.Bandit 5.2.0 | 5 | 4% | 9 |
| fullsail.SweetTea 1.1 | 2 | 2% | 4 |
| stelo.PatternRobot 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 201 rounds): 167047 melee ticks, 47199 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 56 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 59451 sent, 54770 reached their opponent, 9272 virtual hits (16.9% of those reached).

## Melee bench: F03

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 134 over 6 battles (22.3 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 92.0 | 157 / 210 | 1.72 | 20.5% | 37943 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 20.5% | 157 |
| radnor.DoctorBob 1.42 | 2.0 | 14.4% | 29 |
| kawigi.nano.Lib 1.0 | 3.3 | 12.7% | 11 |
| vuen.Cake 2.51 | 3.7 | 12.6% | 13 |
| urdos.URDOS 1.3 | 5.0 | 10.0% | 0 |
| adt.Ar1 2.1 | 6.2 | 7.4% | 0 |
| oa.weak.FlyMk1 0.1 | 7.2 | 6.6% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 8.0 | 5.9% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.1% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 94.9 | 29 / 35 | 6713 |
| 2 | 1 | 69.2 | 87.0 | 23 / 35 | 5958 |
| 3 | 1 | 68.6 | 86.0 | 20 / 35 | 5788 |
| 4 | 1 | 71.8 | 98.1 | 31 / 35 | 6078 |
| 5 | 1 | 71.9 | 94.9 | 28 / 35 | 6735 |
| 6 | 1 | 71.1 | 91.1 | 26 / 35 | 6671 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 68 | 94% |
| radnor.DoctorBob 1.42 | 63 | 94% |
| kawigi.nano.Lib 1.0 | 23 | 96% |
| oa.weak.FlyMk1 0.1 | 10 | 100% |
| urdos.URDOS 1.3 | 2 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 725. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 26 | 48% | 78 |
| vuen.Cake 2.51 | 9 | 17% | 69 |
| kawigi.nano.Lib 1.0 | 9 | 17% | 36 |
| urdos.URDOS 1.3 | 5 | 9% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 3 | 6% | 3 |
| adt.Ar1 2.1 | 2 | 4% | 3 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 200 rounds): 130482 melee ticks, 37949 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 65 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 3.

Targeting waves (200 rounds): 38823 sent, 34266 reached their opponent, 8893 virtual hits (26.0% of those reached).

## Melee bench: F04

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 698 over 6 battles (116.3 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 84.3 | 31 / 210 | 2.41 | 17.2% | 32454 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.2% | 157 |
| hadur2.Hadur 3.18ow | 2.0 | 17.2% | 31 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.7% | 11 |
| TNT.TNT 0.99.1 | 4.2 | 10.6% | 9 |
| josago.Jorgito 0.16 | 4.8 | 9.4% | 2 |
| css.Delitioner 0.11 | 6.5 | 7.0% | 0 |
| tj.zombie1n 1.0.1 | 6.5 | 7.1% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 3.8% | 0 |
| spin.Bugstard 0.012b | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.1 | 85.1 | 6 / 35 | 5621 |
| 2 | 2 | 65.6 | 79.4 | 4 / 35 | 4943 |
| 3 | 2 | 68.6 | 85.4 | 8 / 35 | 5803 |
| 4 | 2 | 67.8 | 85.4 | 4 / 35 | 5449 |
| 5 | 2 | 67.8 | 85.4 | 6 / 35 | 5205 |
| 6 | 2 | 67.6 | 85.1 | 3 / 35 | 5433 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 124 | 15% |
| apc.LeeroyJenkins2 1.0 | 13 | 54% |
| TNT.TNT 0.99.1 | 11 | 36% |
| tj.zombie1n 1.0.1 | 1 | 100% |
| josago.Jorgito 0.16 | 1 | 0% |

Hadur died in 185 of 210 rounds, at a mean tick of 1242. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 125 | 68% | 143 |
| apc.LeeroyJenkins2 1.0 | 24 | 13% | 31 |
| TNT.TNT 0.99.1 | 12 | 6% | 16 |
| josago.Jorgito 0.16 | 10 | 5% | 10 |
| css.Delitioner 0.11 | 3 | 2% | 3 |
| rampancy.Durandal 2.1d | 3 | 2% | 3 |
| tj.zombie1n 1.0.1 | 1 | 1% | 3 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 189018 melee ticks, 66171 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 40 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 58362 sent, 53483 reached their opponent, 8006 virtual hits (15.0% of those reached).

## Melee bench: F05

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 696 over 6 battles (116.0 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 76.0 | 25 / 210 | 3.16 | 14.7% | 23005 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.DemonicRage 3.4 | 1.0 | 18.2% | 78 |
| cb.fire.Firestarter 2.0f | 2.0 | 17.1% | 88 |
| hadur2.Hadur 3.18ow | 3.0 | 14.7% | 25 |
| wompi.Numbat 2.1 | 4.0 | 12.9% | 13 |
| axeBots.HataMoto 3.09 | 5.2 | 9.2% | 6 |
| ms.Ares 0.19 | 5.8 | 8.7% | 0 |
| supersample.SuperBoxBot 1.0 | 7.3 | 5.8% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.6% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.1% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.1 | 76.2 | 4 / 35 | 3690 |
| 2 | 3 | 63.5 | 75.6 | 6 / 35 | 3921 |
| 3 | 3 | 64.0 | 76.5 | 5 / 35 | 4069 |
| 4 | 3 | 62.3 | 73.0 | 3 / 35 | 3782 |
| 5 | 3 | 62.4 | 74.0 | 2 / 35 | 3641 |
| 6 | 3 | 64.8 | 81.0 | 5 / 35 | 3902 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 46 | 33% |
| cb.fire.Firestarter 2.0f | 22 | 0% |
| wompi.Numbat 2.1 | 13 | 69% |
| axeBots.HataMoto 3.09 | 3 | 33% |

Hadur died in 191 of 210 rounds, at a mean tick of 878. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 78 | 41% | 88 |
| cb.fire.Firestarter 2.0f | 57 | 30% | 62 |
| wompi.Numbat 2.1 | 31 | 16% | 40 |
| axeBots.HataMoto 3.09 | 11 | 6% | 12 |
| ms.Ares 0.19 | 4 | 2% | 4 |
| GarmBox.Oranges 1.0 | 2 | 1% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 1% | 1 |
| supersample.SuperBoxBot 1.0 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 154937 melee ticks, 29319 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 376 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 376 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 47752 sent, 42814 reached their opponent, 7187 virtual hits (16.8% of those reached).

## Melee bench: F06

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 737 over 6 battles (122.8 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 89.6 | 123 / 210 | 1.93 | 19.6% | 32375 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 19.6% | 123 |
| jekl.StoneGhost 0.7 | 2.0 | 14.4% | 21 |
| origin.SleepSiphon 1.7b | 3.2 | 13.6% | 37 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.2 | 11.5% | 12 |
| mld.Wisdom 1.0 | 4.8 | 10.4% | 4 |
| gg.Wolverine 2.0 | 6.0 | 8.6% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 7.2% | 10 |
| DBall.NUKE 0.1 | 8.2 | 6.1% | 0 |
| spinnercat.Omen 1.0 | 8.7 | 5.9% | 0 |
| sample.Fire 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 86.7 | 17 / 35 | 5390 |
| 2 | 1 | 70.9 | 92.1 | 23 / 35 | 5648 |
| 3 | 1 | 68.1 | 86.0 | 18 / 35 | 4917 |
| 4 | 1 | 70.1 | 90.2 | 20 / 35 | 5655 |
| 5 | 1 | 71.5 | 94.3 | 25 / 35 | 5583 |
| 6 | 1 | 69.2 | 88.6 | 20 / 35 | 5182 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 51 | 86% |
| origin.SleepSiphon 1.7b | 50 | 66% |
| pe.minimelee.SandboxMiniMelee 1.1 | 31 | 84% |
| gg.Wolverine 2.0 | 12 | 92% |
| ers.nano.hawk.HawkLA 3.0m | 9 | 33% |
| mld.Wisdom 1.0 | 4 | 100% |
| DBall.NUKE 0.1 | 2 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 927. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 28 | 30% | 67 |
| jekl.StoneGhost 0.7 | 23 | 25% | 57 |
| pe.minimelee.SandboxMiniMelee 1.1 | 16 | 17% | 36 |
| ers.nano.hawk.HawkLA 3.0m | 10 | 11% | 14 |
| mld.Wisdom 1.0 | 7 | 8% | 19 |
| gg.Wolverine 2.0 | 1 | 1% | 9 |
| DBall.NUKE 0.1 | 1 | 1% | 5 |
| sample.Fire 1.0 | 1 | 1% | 1 |
| spinnercat.Omen 1.0 | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 152722 melee ticks, 43081 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 33 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 47022 sent, 42288 reached their opponent, 9241 virtual hits (21.9% of those reached).

## Melee bench: F07

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 76 over 6 battles (12.7 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 92.8 | 119 / 210 | 1.65 | 20.7% | 38928 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 20.7% | 119 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 16.7% | 42 |
| rtk.Tachikoma 1.0 | 2.8 | 15.9% | 28 |
| franzor.Lizt 1.3.1 | 4.5 | 10.9% | 11 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 11.2% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 7.8% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.5% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.0 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 93.7 | 22 / 35 | 6758 |
| 2 | 1 | 72.0 | 91.7 | 21 / 35 | 6566 |
| 3 | 1 | 72.4 | 93.0 | 19 / 35 | 6454 |
| 4 | 1 | 72.1 | 93.0 | 18 / 35 | 6453 |
| 5 | 1 | 70.9 | 90.8 | 15 / 35 | 6091 |
| 6 | 1 | 73.2 | 94.6 | 24 / 35 | 6606 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 81 | 74% |
| rsalesc.melee.Monk 0.3.6c | 47 | 26% |
| franzor.Lizt 1.3.1 | 27 | 74% |
| oog.melee.CapuletDroid 1.1 | 26 | 92% |
| exauge.GateKeeper 1.1.121g | 3 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 1328. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 39 | 43% | 71 |
| rtk.Tachikoma 1.0 | 37 | 41% | 102 |
| franzor.Lizt 1.3.1 | 8 | 9% | 2 |
| oog.melee.CapuletDroid 1.1 | 7 | 8% | 30 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 2 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 1 |

Posture (Hadur's M records, 204 rounds): 187394 melee ticks, 83746 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 35 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 56058 sent, 51241 reached their opponent, 10455 virtual hits (20.4% of those reached).

## Melee bench: F08

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 627 over 6 battles (104.5 per battle, most in one battle 144). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 90.5 | 134 / 210 | 1.86 | 19.6% | 30535 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 19.6% | 134 |
| shrub.Vapour v159 | 2.7 | 13.0% | 17 |
| tm.Yuugao 1.0 | 2.8 | 12.6% | 30 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 10.6% | 12 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 9.9% | 11 |
| m3thos.Eva00 1.1 | 6.2 | 8.6% | 3 |
| jwst.DAD.DarkAndDarker 1.1 | 7.2 | 7.8% | 3 |
| qualidafial.MajorDick 1.0.1 | 7.8 | 7.0% | 1 |
| SHAM.WOW 1.4 | 9.2 | 5.5% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 90.5 | 22 / 35 | 5082 |
| 2 | 1 | 70.8 | 94.6 | 25 / 35 | 5189 |
| 3 | 1 | 69.1 | 89.8 | 22 / 35 | 5123 |
| 4 | 1 | 68.7 | 88.6 | 20 / 35 | 4852 |
| 5 | 1 | 68.9 | 90.5 | 21 / 35 | 5014 |
| 6 | 1 | 69.3 | 88.9 | 24 / 35 | 5275 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 51 | 71% |
| shrub.Vapour v159 | 43 | 74% |
| Krabb.sliNk.Garm 0.9u | 28 | 89% |
| com.spp.robocode.MostlyHarmless 010 | 21 | 86% |
| m3thos.Eva00 1.1 | 8 | 88% |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 83% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| SHAM.WOW 1.4 | 5 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 22 | 27% | 64 |
| shrub.Vapour v159 | 22 | 27% | 60 |
| Krabb.sliNk.Garm 0.9u | 14 | 17% | 34 |
| com.spp.robocode.MostlyHarmless 010 | 7 | 8% | 18 |
| m3thos.Eva00 1.1 | 5 | 6% | 8 |
| jwst.DAD.DarkAndDarker 1.1 | 4 | 5% | 13 |
| zyx.nano.BacillusComma 1.0 | 3 | 4% | 5 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 1 |
| SHAM.WOW 1.4 | 0 | 0% | 6 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 144935 melee ticks, 49182 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 79 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 2.

Targeting waves (204 rounds): 47801 sent, 43030 reached their opponent, 8196 virtual hits (19.0% of those reached).

## Melee bench: F09

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 315 over 6 battles (52.5 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 73.5 | 52 / 210 | 3.39 | 14.8% | 21473 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.3% | 101 |
| hadur2.Hadur 3.18ow | 2.2 | 14.8% | 52 |
| kc.micro.Figment 1.0 | 2.8 | 13.5% | 26 |
| yagami.Tidus 0.11 | 4.3 | 11.3% | 6 |
| pedersen.Grishnakh 1.0 | 4.7 | 11.0% | 13 |
| mc2.enemy.Original 0.9 | 6.0 | 9.4% | 9 |
| dft.Calliope 5.6 | 6.8 | 7.9% | 2 |
| step.nanoPri 1.0 | 8.5 | 5.4% | 0 |
| rdm.Dueler 0.4x | 9.0 | 4.8% | 1 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.3 | 72.1 | 10 / 35 | 3357 |
| 2 | 3 | 61.8 | 72.4 | 6 / 35 | 3571 |
| 3 | 2 | 64.3 | 77.5 | 10 / 35 | 3742 |
| 4 | 2 | 62.5 | 75.2 | 7 / 35 | 3459 |
| 5 | 2 | 62.5 | 72.4 | 9 / 35 | 3609 |
| 6 | 2 | 62.8 | 71.4 | 10 / 35 | 3735 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 40 | 35% |
| kc.micro.Figment 1.0 | 34 | 88% |
| mc2.enemy.Original 0.9 | 7 | 57% |
| pedersen.Grishnakh 1.0 | 4 | 25% |
| yagami.Tidus 0.11 | 3 | 67% |
| dft.Calliope 5.6 | 1 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 61 | 38% | 76 |
| yagami.Tidus 0.11 | 27 | 17% | 30 |
| kc.micro.Figment 1.0 | 24 | 15% | 51 |
| mc2.enemy.Original 0.9 | 21 | 13% | 25 |
| pedersen.Grishnakh 1.0 | 11 | 7% | 12 |
| dft.Calliope 5.6 | 6 | 4% | 7 |
| robar.nano.Assertive_Melee 0.2 | 5 | 3% | 5 |
| step.nanoPri 1.0 | 3 | 2% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 145448 melee ticks, 30816 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 33 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 1.

Targeting waves (209 rounds): 48035 sent, 43387 reached their opponent, 6246 virtual hits (14.4% of those reached).

## Melee bench: F10

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 499 over 6 battles (83.2 per battle, most in one battle 148). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 94.6 | 161 / 210 | 1.49 | 20.6% | 34928 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 20.6% | 161 |
| ne.Chimera 1.2 | 2.5 | 13.0% | 6 |
| DTF.Kludgy 1.2b | 2.7 | 13.3% | 20 |
| ejb.Polaris 1.0.1 | 3.8 | 12.4% | 14 |
| vStar.RAFzilla 2.15 | 5.5 | 10.3% | 7 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.2% | 2 |
| kurios.DOSexe .9b | 7.7 | 5.6% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.2% | 0 |
| sam.Samspin 1.0 | 8.3 | 5.2% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 97.8 | 29 / 35 | 6172 |
| 2 | 1 | 70.5 | 93.3 | 28 / 35 | 5643 |
| 3 | 1 | 71.9 | 96.8 | 30 / 35 | 6069 |
| 4 | 1 | 70.1 | 93.0 | 22 / 35 | 5465 |
| 5 | 1 | 69.7 | 90.5 | 24 / 35 | 5469 |
| 6 | 1 | 71.7 | 95.9 | 28 / 35 | 6110 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 52 | 71% |
| ejb.Polaris 1.0.1 | 46 | 89% |
| ne.Chimera 1.2 | 45 | 96% |
| vStar.RAFzilla 2.15 | 21 | 86% |
| tvv.micro.Antares 1.1.1 | 18 | 94% |
| donjezza.Muncho 1.0 | 3 | 67% |
| kurios.DOSexe .9b | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 969. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 23 | 42% | 58 |
| ejb.Polaris 1.0.1 | 10 | 18% | 55 |
| ne.Chimera 1.2 | 8 | 15% | 46 |
| vStar.RAFzilla 2.15 | 5 | 9% | 18 |
| tvv.micro.Antares 1.1.1 | 2 | 4% | 16 |
| donjezza.Muncho 1.0 | 2 | 4% | 2 |
| kurios.DOSexe .9b | 0 | 0% | 10 |
| sam.Samspin 1.0 | 0 | 0% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 141018 melee ticks, 59349 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 111 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 111 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 3.

Targeting waves (204 rounds): 46875 sent, 42179 reached their opponent, 8182 virtual hits (19.4% of those reached).

## Melee bench: F11

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 444 over 6 battles (74.0 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 76.6 | 54 / 210 | 3.11 | 15.2% | 21926 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.2 | 16.5% | 77 |
| hadur2.Hadur 3.18ow | 1.8 | 15.2% | 54 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.7% | 24 |
| djc.DynaBot 0.1.1 | 4.0 | 10.8% | 17 |
| br2.MobyDickBot 1.6 | 5.7 | 9.2% | 15 |
| rdt199.Warlord 0.73 | 5.8 | 9.3% | 11 |
| uji.YellohFellah 1.0 | 6.8 | 8.4% | 11 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.6% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.0 | 5.5% | 1 |
| stelo.MirrorNano 1.3 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 74.3 | 8 / 35 | 3375 |
| 2 | 2 | 61.5 | 70.2 | 9 / 35 | 3671 |
| 3 | 2 | 63.6 | 80.3 | 9 / 35 | 3462 |
| 4 | 2 | 63.3 | 77.1 | 6 / 35 | 4041 |
| 5 | 1 | 65.0 | 82.9 | 13 / 35 | 3813 |
| 6 | 2 | 62.6 | 74.6 | 9 / 35 | 3564 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 41 | 32% |
| djc.DynaBot 0.1.1 | 17 | 53% |
| uji.YellohFellah 1.0 | 14 | 93% |
| cx.mini.Nimrod 0.55 | 13 | 54% |
| rdt199.Warlord 0.73 | 11 | 55% |
| br2.MobyDickBot 1.6 | 9 | 44% |
| KiraNL.Chupacabra 0.4 | 2 | 50% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 65 | 41% | 81 |
| cx.mini.Nimrod 0.55 | 32 | 20% | 41 |
| rdt199.Warlord 0.73 | 16 | 10% | 24 |
| djc.DynaBot 0.1.1 | 12 | 8% | 17 |
| br2.MobyDickBot 1.6 | 12 | 8% | 16 |
| KiraNL.Chupacabra 0.4 | 11 | 7% | 13 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 3% | 3 |
| uji.YellohFellah 1.0 | 2 | 1% | 11 |
| stelo.MirrorNano 1.3 | 2 | 1% | 4 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 154848 melee ticks, 32646 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 38 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 50471 sent, 45459 reached their opponent, 6236 virtual hits (13.7% of those reached).

## Melee bench: F12

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 905 over 6 battles (150.8 per battle, most in one battle 255). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 84.0 | 111 / 210 | 2.44 | 17.3% | 22730 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 17.3% | 111 |
| nat.PallasHawk 1.0 | 2.7 | 13.7% | 43 |
| bts.wiki.RipCurl 0.9b | 2.8 | 13.4% | 29 |
| darkcanuck.Leon 1.01 | 3.5 | 12.6% | 18 |
| brainfade.melee.Genghis 0.36 | 5.0 | 9.8% | 4 |
| jrm.Test0 1.0 | 6.0 | 8.1% | 1 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.0% | 1 |
| jp.Perpy 16.0 | 8.2 | 6.4% | 1 |
| jaybot.bots.Oddball 4.0 | 9.2 | 6.0% | 1 |
| stuff.Vlad 0.1 | 9.3 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 90.8 | 22 / 35 | 4189 |
| 2 | 1 | 66.4 | 83.5 | 22 / 35 | 3774 |
| 3 | 1 | 66.5 | 82.9 | 18 / 35 | 3836 |
| 4 | 1 | 65.6 | 81.0 | 17 / 35 | 3976 |
| 5 | 1 | 66.1 | 85.1 | 16 / 35 | 3535 |
| 6 | 1 | 64.5 | 81.0 | 16 / 35 | 3420 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 46 | 61% |
| darkcanuck.Leon 1.01 | 41 | 88% |
| bts.wiki.RipCurl 0.9b | 30 | 80% |
| brainfade.melee.Genghis 0.36 | 13 | 92% |
| jrm.Test0 1.0 | 4 | 100% |
| jaybot.bots.Oddball 4.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| jp.Perpy 16.0 | 2 | 50% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 688. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 29 | 27% | 47 |
| nat.PallasHawk 1.0 | 25 | 23% | 54 |
| darkcanuck.Leon 1.01 | 14 | 13% | 48 |
| jrm.Test0 1.0 | 10 | 9% | 12 |
| brainfade.melee.Genghis 0.36 | 8 | 7% | 19 |
| jp.Perpy 16.0 | 6 | 6% | 11 |
| cs.sheldor.Talon 1.1 | 6 | 6% | 10 |
| jaybot.bots.Oddball 4.0 | 3 | 3% | 6 |
| stuff.Vlad 0.1 | 1 | 1% | 2 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 129415 melee ticks, 34901 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 42 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 44371 sent, 39236 reached their opponent, 6610 virtual hits (16.8% of those reached).

## Melee bench: F13

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 106 over 6 battles (17.7 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 80.6 | 59 / 210 | 2.74 | 15.8% | 25239 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.8 | 16.5% | 89 |
| hadur2.Hadur 3.18ow | 2.0 | 15.8% | 59 |
| ags.Glacier 0.2.11 | 2.2 | 16.0% | 33 |
| shinh.Entangled 0.3 | 4.5 | 11.9% | 15 |
| gh.micro.Gruweltje 0.7 | 4.5 | 12.2% | 12 |
| apc.Colossus2 0.17 | 6.2 | 8.2% | 1 |
| stelo.Wang 1.0 | 7.0 | 6.5% | 1 |
| maribo.FollowFire 1 | 8.2 | 5.0% | 0 |
| ayk.WallHugger 1.0 | 8.7 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.6 | 80.3 | 10 / 35 | 4041 |
| 2 | 1 | 66.0 | 82.9 | 10 / 35 | 4536 |
| 3 | 2 | 63.6 | 78.4 | 8 / 35 | 3799 |
| 4 | 2 | 65.1 | 80.6 | 11 / 35 | 4204 |
| 5 | 1 | 66.2 | 84.4 | 12 / 35 | 4199 |
| 6 | 3 | 65.0 | 77.1 | 8 / 35 | 4460 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 47 | 72% |
| mn.Combat 3.25.0 | 37 | 16% |
| shinh.Entangled 0.3 | 17 | 53% |
| gh.micro.Gruweltje 0.7 | 13 | 69% |
| stelo.Wang 1.0 | 2 | 50% |

Hadur died in 151 of 210 rounds, at a mean tick of 854. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 54 | 36% | 63 |
| ags.Glacier 0.2.11 | 46 | 30% | 76 |
| shinh.Entangled 0.3 | 19 | 13% | 28 |
| gh.micro.Gruweltje 0.7 | 16 | 11% | 24 |
| apc.Colossus2 0.17 | 8 | 5% | 9 |
| stelo.Wang 1.0 | 6 | 4% | 8 |
| maribo.FollowFire 1 | 1 | 1% | 1 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 203 rounds): 144834 melee ticks, 38594 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 71 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 42282 sent, 37327 reached their opponent, 5942 virtual hits (15.9% of those reached).

## Melee bench: F14

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 301 over 6 battles (50.2 per battle, most in one battle 151). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 94.9 | 166 / 210 | 1.46 | 21.0% | 35102 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 21.0% | 166 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.6% | 14 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.6% | 23 |
| Lo_Ian.Gandalf_V4 4.0 | 4.8 | 9.4% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 5.3 | 9.3% | 4 |
| co.edu.usb.rc.LidisTron 1.0 | 5.8 | 9.0% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.7 | 8.3% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 8.4% | 2 |
| pa.Improved 1.0 | 9.0 | 5.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 91.1 | 27 / 35 | 5504 |
| 2 | 1 | 72.3 | 96.8 | 30 / 35 | 5876 |
| 3 | 1 | 71.8 | 96.5 | 27 / 35 | 5922 |
| 4 | 1 | 72.0 | 95.9 | 27 / 35 | 6082 |
| 5 | 1 | 72.7 | 96.8 | 29 / 35 | 6218 |
| 6 | 1 | 70.9 | 92.1 | 26 / 35 | 5500 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 73 | 95% |
| catcat20.shape.Theta 0.018 | 59 | 73% |
| sanyi.mikrobi.Roberto 1.0 | 21 | 95% |
| sheldor.micro.PointInLineRRAL 1.0 | 16 | 94% |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 5 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 22 | 49% | 60 |
| simonton.micro.Sprout 1.1.3 | 11 | 24% | 74 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 7% | 32 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 7% | 19 |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 7% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 5 |
| co.edu.usb.rc.LidisTron 1.0 | 0 | 0% | 8 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |
| pa.Improved 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 138060 melee ticks, 55870 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 63 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 2.

Targeting waves (200 rounds): 43333 sent, 38880 reached their opponent, 9361 virtual hits (24.1% of those reached).

## Melee bench: F15

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 161 over 6 battles (26.8 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 86.2 | 109 / 210 | 2.24 | 18.7% | 31099 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 18.7% | 109 |
| kawigi.micro.Shiz 1.1 | 2.0 | 14.1% | 23 |
| emp.Yngwie 1.11 | 3.2 | 12.9% | 46 |
| mld.DustBunny 3.8 | 3.8 | 12.4% | 8 |
| kawigi.robot.Girl 1.2 | 5.5 | 9.8% | 18 |
| cb.nano.Insomnia 1.0 | 5.5 | 10.1% | 5 |
| lambdaxy.TBot 0.1 | 7.5 | 6.3% | 0 |
| Grystrion.TrackerWO 1.0 | 7.8 | 6.3% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.3 | 4.5% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 84.8 | 16 / 35 | 4907 |
| 2 | 1 | 69.4 | 87.6 | 18 / 35 | 5441 |
| 3 | 1 | 68.5 | 87.0 | 17 / 35 | 5120 |
| 4 | 1 | 67.7 | 83.5 | 17 / 35 | 5078 |
| 5 | 1 | 69.1 | 87.6 | 21 / 35 | 5172 |
| 6 | 1 | 69.2 | 86.7 | 20 / 35 | 5381 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 45 | 60% |
| kawigi.micro.Shiz 1.1 | 34 | 91% |
| kawigi.robot.Girl 1.2 | 19 | 68% |
| mld.DustBunny 3.8 | 19 | 89% |
| cb.nano.Insomnia 1.0 | 17 | 94% |
| Grystrion.TrackerWO 1.0 | 3 | 67% |
| divineomega.TrialBot 0.003 | 3 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 920. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 40 | 40% | 75 |
| kawigi.micro.Shiz 1.1 | 18 | 18% | 47 |
| mld.DustBunny 3.8 | 18 | 18% | 46 |
| kawigi.robot.Girl 1.2 | 12 | 12% | 11 |
| cb.nano.Insomnia 1.0 | 9 | 9% | 15 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 3 |
| divineomega.TrialBot 0.003 | 1 | 1% | 6 |
| lambdaxy.TBot 0.1 | 1 | 1% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 205 rounds): 164664 melee ticks, 40418 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 48 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 2.

Targeting waves (205 rounds): 53600 sent, 48797 reached their opponent, 8018 virtual hits (16.4% of those reached).

## Melee bench: F16

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 368 over 6 battles (61.3 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.7 | 105 / 210 | 2.20 | 19.0% | 32659 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 19.0% | 105 |
| gh.Griezel 0.5.2 | 2.2 | 15.7% | 47 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.8 | 13.5% | 7 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 11.0% | 32 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.7% | 4 |
| tvv.nano.Polaris 1.2 | 6.0 | 8.8% | 8 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.9% | 2 |
| divineomega.DivineBot 1.9.4.5 | 8.0 | 5.6% | 6 |
| repositorio.NanoStep 1.0 | 9.3 | 4.7% | 0 |
| asd.Cthulhu 1.3 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 89.2 | 17 / 35 | 5536 |
| 2 | 1 | 67.3 | 83.5 | 14 / 35 | 4948 |
| 3 | 1 | 68.0 | 82.2 | 16 / 35 | 5252 |
| 4 | 1 | 70.1 | 88.9 | 21 / 35 | 5753 |
| 5 | 1 | 69.9 | 89.5 | 20 / 35 | 5658 |
| 6 | 1 | 69.2 | 86.7 | 17 / 35 | 5512 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 72 | 72% |
| techdude.forest.FlamingForest 1.1 | 35 | 57% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 17 | 82% |
| bvh.fnr.Fenrir 0.36l | 9 | 56% |
| stelo.IntrinsicVolatility 1.4 | 8 | 88% |
| tvv.nano.Polaris 1.2 | 6 | 67% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 1128. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 36 | 33% | 80 |
| techdude.forest.FlamingForest 1.1 | 25 | 23% | 48 |
| bvh.fnr.Fenrir 0.36l | 21 | 19% | 25 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 12 | 11% | 24 |
| stelo.IntrinsicVolatility 1.4 | 4 | 4% | 12 |
| tvv.nano.Polaris 1.2 | 4 | 4% | 6 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 10 |
| asd.Cthulhu 1.3 | 2 | 2% | 2 |
| repositorio.NanoStep 1.0 | 1 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 174182 melee ticks, 61388 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 42 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 55717 sent, 51013 reached their opponent, 8566 virtual hits (16.8% of those reached).

## Melee bench: F17

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 245 over 6 battles (40.8 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 84.2 | 104 / 210 | 2.42 | 18.8% | 34325 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 18.8% | 104 |
| et.Predator 1.8 | 2.3 | 13.6% | 23 |
| oog.melee.Mercutio 1.0 | 2.7 | 13.4% | 31 |
| cx.BlestPain 1.41 | 4.0 | 12.5% | 38 |
| ahf.NanoAndrew .4 | 5.0 | 10.9% | 10 |
| nic.Nicator 2.4 | 6.3 | 9.2% | 3 |
| maribo.melee.BMV 0.1 | 6.8 | 8.2% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.2 | 5.8% | 0 |
| tex.Longbot 0.4 | 8.7 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 81.6 | 16 / 35 | 5370 |
| 2 | 1 | 69.6 | 85.4 | 17 / 35 | 6197 |
| 3 | 1 | 67.5 | 80.3 | 17 / 35 | 5220 |
| 4 | 1 | 68.6 | 83.8 | 14 / 35 | 5799 |
| 5 | 1 | 70.3 | 86.3 | 19 / 35 | 6276 |
| 6 | 1 | 69.8 | 87.6 | 21 / 35 | 5463 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 56 | 82% |
| et.Predator 1.8 | 42 | 76% |
| cx.BlestPain 1.41 | 24 | 29% |
| ahf.NanoAndrew .4 | 11 | 100% |
| nic.Nicator 2.4 | 4 | 100% |
| maribo.melee.BMV 0.1 | 4 | 75% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 929. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 28 | 26% | 54 |
| cx.BlestPain 1.41 | 27 | 25% | 42 |
| oog.melee.Mercutio 1.0 | 25 | 23% | 69 |
| ahf.NanoAndrew .4 | 14 | 13% | 22 |
| maribo.melee.BMV 0.1 | 8 | 7% | 12 |
| tex.Longbot 0.4 | 2 | 2% | 3 |
| nic.Nicator 2.4 | 1 | 1% | 5 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 155552 melee ticks, 53114 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 667 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 301 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 52310 sent, 47625 reached their opponent, 9959 virtual hits (20.9% of those reached).

## Melee bench: F18

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 468 over 6 battles (78.0 per battle, most in one battle 149). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 90.8 | 128 / 210 | 1.83 | 19.6% | 30209 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 19.6% | 128 |
| morbid.MorbidPriest 1.0 | 2.2 | 14.0% | 36 |
| agd.Mooserwirt2 2.7 | 3.2 | 11.8% | 17 |
| uji.DBH 1.1 | 3.7 | 11.1% | 14 |
| sigterm.Sigterm 1.0 | 5.8 | 8.8% | 4 |
| spinnercat.Robovirus 2.718 | 6.0 | 8.8% | 2 |
| ratosh.Nobo 0.21 | 6.7 | 8.1% | 3 |
| kawigi.mini.Fhqwhgads 1.1 | 7.5 | 7.4% | 3 |
| stelo.WangRobot 1.0 | 9.2 | 5.5% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 92.1 | 19 / 35 | 5058 |
| 2 | 1 | 67.9 | 86.3 | 15 / 35 | 5172 |
| 3 | 1 | 69.6 | 92.1 | 24 / 35 | 4921 |
| 4 | 1 | 71.0 | 94.6 | 27 / 35 | 5357 |
| 5 | 1 | 69.4 | 88.3 | 24 / 35 | 5029 |
| 6 | 1 | 68.9 | 91.4 | 19 / 35 | 4672 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 68 | 68% |
| uji.DBH 1.1 | 34 | 76% |
| agd.Mooserwirt2 2.7 | 21 | 81% |
| sigterm.Sigterm 1.0 | 17 | 94% |
| ratosh.Nobo 0.21 | 9 | 78% |
| stelo.WangRobot 1.0 | 7 | 100% |
| spinnercat.Robovirus 2.718 | 7 | 86% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 60% |

Hadur died in 84 of 210 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 36 | 43% | 86 |
| uji.DBH 1.1 | 15 | 18% | 31 |
| agd.Mooserwirt2 2.7 | 13 | 15% | 27 |
| spinnercat.Robovirus 2.718 | 6 | 7% | 17 |
| ratosh.Nobo 0.21 | 4 | 5% | 11 |
| sigterm.Sigterm 1.0 | 3 | 4% | 16 |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 4% | 11 |
| stelo.WangRobot 1.0 | 1 | 1% | 7 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 1% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 139297 melee ticks, 46539 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 127 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 127 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 2.

Targeting waves (203 rounds): 45801 sent, 41059 reached their opponent, 9022 virtual hits (22.0% of those reached).

## Melee bench: F19

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 146 over 6 battles (24.3 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.4 | 97.7 | 192 / 210 | 1.20 | 22.4% | 37546 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 22.4% | 192 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.5% | 10 |
| krillr.mini.JointStrike 2.0.0 | 3.7 | 12.0% | 3 |
| mld.Infinity 2.2 | 3.8 | 11.6% | 4 |
| erdnis.Rover 0.3 | 4.5 | 11.0% | 1 |
| mbh.Mbh 0.1 | 6.7 | 7.6% | 0 |
| patson.PatsonTestBot 1.0 | 6.8 | 8.0% | 0 |
| pac.ABC 2.1 | 7.7 | 6.8% | 0 |
| pbg.R2D2 1.0 | 8.8 | 5.0% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.6 | 97.1 | 32 / 35 | 6450 |
| 2 | 1 | 73.6 | 98.7 | 33 / 35 | 6073 |
| 3 | 1 | 73.4 | 98.7 | 34 / 35 | 6085 |
| 4 | 1 | 72.6 | 95.9 | 30 / 35 | 6144 |
| 5 | 1 | 73.6 | 98.4 | 31 / 35 | 6325 |
| 6 | 1 | 73.8 | 97.5 | 32 / 35 | 6469 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 100 | 97% |
| mld.Infinity 2.2 | 33 | 97% |
| krillr.mini.JointStrike 2.0.0 | 25 | 96% |
| erdnis.Rover 0.3 | 20 | 95% |
| pac.ABC 2.1 | 8 | 100% |
| patson.PatsonTestBot 1.0 | 5 | 100% |
| pbg.R2D2 1.0 | 4 | 100% |
| mbh.Mbh 0.1 | 3 | 100% |

Hadur died in 18 of 210 rounds, at a mean tick of 764. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 5 | 28% | 75 |
| krillr.mini.JointStrike 2.0.0 | 5 | 28% | 38 |
| erdnis.Rover 0.3 | 5 | 28% | 25 |
| mld.Infinity 2.2 | 1 | 6% | 22 |
| patson.PatsonTestBot 1.0 | 1 | 6% | 17 |
| pbg.R2D2 1.0 | 1 | 6% | 4 |
| mbh.Mbh 0.1 | 0 | 0% | 14 |
| pac.ABC 2.1 | 0 | 0% | 9 |

Posture (Hadur's M records, 198 rounds): 127951 melee ticks, 46235 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 47 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 42305 sent, 37819 reached their opponent, 8851 virtual hits (23.4% of those reached).

## Melee bench: F20

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 459 over 6 battles (76.5 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 90.8 | 150 / 210 | 1.83 | 20.9% | 36485 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 20.9% | 150 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.2% | 22 |
| fwb.Nine 1.0.1 | 3.3 | 11.5% | 12 |
| catcat20.Rabbit 0.001 | 4.0 | 10.6% | 22 |
| nz.jdc.nano.GridFu 1.0 | 4.7 | 9.9% | 1 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 9.0% | 2 |
| bayen.nut.Squirrel 1.615 | 7.2 | 6.8% | 1 |
| djdjdj.NanoSkunk10 1.0 | 8.3 | 6.1% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.5 | 5.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 89.2 | 23 / 35 | 5836 |
| 2 | 1 | 72.0 | 92.1 | 28 / 35 | 6360 |
| 3 | 1 | 71.6 | 93.0 | 27 / 35 | 5841 |
| 4 | 1 | 72.1 | 92.4 | 26 / 35 | 6556 |
| 5 | 1 | 69.5 | 85.7 | 22 / 35 | 5579 |
| 6 | 1 | 71.6 | 92.4 | 24 / 35 | 6313 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 80 | 86% |
| fwb.Nine 1.0.1 | 41 | 90% |
| catcat20.Rabbit 0.001 | 34 | 71% |
| nz.jdc.nano.GridFu 1.0 | 7 | 100% |
| m3thos.mini.Eva01 0.5.5 | 6 | 100% |
| bayen.nut.Squirrel 1.615 | 3 | 100% |
| ntc.ControlledChaos 1.1.4 | 2 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 902. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 31 | 48% | 99 |
| catcat20.Rabbit 0.001 | 16 | 25% | 47 |
| fwb.Nine 1.0.1 | 5 | 8% | 10 |
| m3thos.mini.Eva01 0.5.5 | 3 | 5% | 15 |
| nz.jdc.nano.GridFu 1.0 | 3 | 5% | 15 |
| bayen.nut.Squirrel 1.615 | 1 | 2% | 11 |
| djdjdj.NanoSkunk10 1.0 | 1 | 2% | 6 |
| ntc.ControlledChaos 1.1.4 | 1 | 2% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 160243 melee ticks, 55745 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 30 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 30 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 50567 sent, 45817 reached their opponent, 10262 virtual hits (22.4% of those reached).

## Melee bench: F21

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 667 over 6 battles (111.2 per battle, most in one battle 116). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 90.3 | 106 / 210 | 1.88 | 19.8% | 34889 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 19.8% | 106 |
| eem.EvBot v4.6.16 | 2.0 | 17.3% | 78 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.6% | 13 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.8% | 4 |
| eld.Hmm 1.0 | 5.2 | 8.4% | 10 |
| oa.weak.BotherBot 0.1 | 6.2 | 7.3% | 0 |
| fire219.CatBot 1.0 | 7.3 | 6.4% | 0 |
| el.JumpShoot 0.2 | 7.7 | 5.7% | 0 |
| PSW.Relentless 0.1 | 9.2 | 5.0% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 87.9 | 15 / 35 | 5845 |
| 2 | 1 | 70.1 | 90.5 | 16 / 35 | 5871 |
| 3 | 1 | 71.0 | 91.4 | 17 / 35 | 6157 |
| 4 | 1 | 71.0 | 91.7 | 22 / 35 | 5804 |
| 5 | 1 | 70.6 | 91.4 | 21 / 35 | 5594 |
| 6 | 1 | 69.8 | 88.6 | 15 / 35 | 5618 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 128 | 58% |
| dummy.mini.Scimitar 1.01 | 17 | 88% |
| eld.Hmm 1.0 | 12 | 50% |
| cf.RiO.RiOx 4.2.1 | 11 | 91% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 1337. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 62 | 56% | 119 |
| dummy.mini.Scimitar 1.01 | 20 | 18% | 37 |
| cf.RiO.RiOx 4.2.1 | 11 | 10% | 26 |
| eld.Hmm 1.0 | 9 | 8% | 24 |
| PSW.Relentless 0.1 | 2 | 2% | 3 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 182207 melee ticks, 89922 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 75 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 75 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 52860 sent, 48179 reached their opponent, 8392 virtual hits (17.4% of those reached).

## Melee bench: F22

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 125 over 6 battles (20.8 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 88.4 | 87 / 210 | 2.05 | 18.4% | 30273 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 18.4% | 87 |
| pe.SandboxDT 2.71m | 2.0 | 16.3% | 61 |
| kvk.HebusLeTroll 0.35 | 3.3 | 14.4% | 37 |
| jlm.javaDisturbance 0.59 | 3.7 | 13.4% | 20 |
| bigpete.Stewie 1.0 | 5.0 | 10.4% | 4 |
| yk.JahRoslav 1.1 | 6.8 | 6.7% | 1 |
| gg.Squaraus 0.6 | 7.0 | 6.3% | 0 |
| tad.Dalek98 0.98 | 7.2 | 6.6% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.9% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 89.2 | 16 / 35 | 5244 |
| 2 | 1 | 68.8 | 87.6 | 13 / 35 | 5356 |
| 3 | 1 | 68.9 | 88.6 | 15 / 35 | 5069 |
| 4 | 1 | 67.5 | 87.6 | 12 / 35 | 4553 |
| 5 | 1 | 69.8 | 90.8 | 19 / 35 | 5118 |
| 6 | 1 | 68.1 | 86.3 | 12 / 35 | 4933 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 57 | 42% |
| jlm.javaDisturbance 0.59 | 37 | 68% |
| kvk.HebusLeTroll 0.35 | 34 | 62% |
| bigpete.Stewie 1.0 | 10 | 80% |
| tad.Dalek98 0.98 | 6 | 100% |
| yk.JahRoslav 1.1 | 2 | 50% |
| pbg.NinjaX 1.2 | 2 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 997. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 50 | 40% | 76 |
| kvk.HebusLeTroll 0.35 | 41 | 33% | 56 |
| jlm.javaDisturbance 0.59 | 24 | 19% | 49 |
| bigpete.Stewie 1.0 | 8 | 6% | 18 |
| pbg.NinjaX 1.2 | 1 | 1% | 4 |
| yk.JahRoslav 1.1 | 1 | 1% | 1 |
| tad.Dalek98 0.98 | 0 | 0% | 3 |
| gg.Squaraus 0.6 | 0 | 0% | 2 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 162251 melee ticks, 42123 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 482 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 40 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 51498 sent, 46862 reached their opponent, 7502 virtual hits (16.0% of those reached).

## Melee bench: F23

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 648 over 6 battles (108.0 per battle, most in one battle 117). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 92.3 | 154 / 210 | 1.70 | 21.1% | 36435 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 21.1% | 154 |
| pe.SandboxLump 1.52 | 2.0 | 16.3% | 31 |
| cre.Karolos 0.32 | 3.0 | 14.1% | 16 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.0% | 1 |
| stelo.RamTrackSurfer 1.2 | 5.2 | 9.5% | 6 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.8 | 9.0% | 0 |
| cw.megas.Blade 0.8 | 6.5 | 8.3% | 0 |
| sample.Walls 1.0 | 8.0 | 7.2% | 2 |
| cli.WasteOfAmmo 1.0 | 9.2 | 2.8% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.8 | 95.6 | 30 / 35 | 6362 |
| 2 | 1 | 71.6 | 92.1 | 25 / 35 | 5778 |
| 3 | 1 | 71.9 | 92.4 | 22 / 35 | 6381 |
| 4 | 1 | 72.3 | 92.1 | 27 / 35 | 6193 |
| 5 | 1 | 72.3 | 92.7 | 24 / 35 | 6096 |
| 6 | 1 | 71.5 | 88.9 | 26 / 35 | 5625 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 86 | 86% |
| cre.Karolos 0.32 | 53 | 85% |
| stelo.AreaTargetingBot 1.1 | 17 | 100% |
| stelo.RamTrackSurfer 1.2 | 11 | 64% |
| sample.Walls 1.0 | 6 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 766. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 25 | 40% | 98 |
| cre.Karolos 0.32 | 20 | 32% | 60 |
| stelo.RamTrackSurfer 1.2 | 5 | 8% | 20 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 5% | 8 |
| stelo.AreaTargetingBot 1.1 | 2 | 3% | 15 |
| cw.megas.Blade 0.8 | 1 | 2% | 5 |
| sample.Walls 1.0 | 0 | 0% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 122894 melee ticks, 47163 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 56 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 38375 sent, 33657 reached their opponent, 10118 virtual hits (30.1% of those reached).

## Melee bench: F24

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 528 over 6 battles (88.0 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 82.0 | 68 / 210 | 2.62 | 16.4% | 23989 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 16.4% | 68 |
| davidalves.Phoenix 0.54 | 2.7 | 13.5% | 49 |
| florent.XSeries.X2 0.12 | 3.0 | 13.4% | 35 |
| rz.GlowBlowMelee 1.4 | 3.3 | 13.3% | 31 |
| pedersen.Ugluk 1.1.1 | 5.0 | 11.8% | 18 |
| oog.melee.Corsair 1.0 | 6.0 | 9.4% | 4 |
| lunchie.Lunchbox 0.93 | 7.7 | 5.8% | 0 |
| stelo.SoJNanoMelee 1.1 | 7.8 | 6.5% | 4 |
| as.FrankTheTank 1.3 | 8.8 | 5.3% | 1 |
| evd.X1 0.01 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 83.2 | 12 / 35 | 4091 |
| 2 | 1 | 65.2 | 80.6 | 13 / 35 | 4109 |
| 3 | 1 | 66.2 | 84.1 | 12 / 35 | 4287 |
| 4 | 1 | 65.2 | 81.3 | 10 / 35 | 3815 |
| 5 | 1 | 64.2 | 80.3 | 11 / 35 | 3773 |
| 6 | 1 | 65.3 | 82.2 | 10 / 35 | 3914 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.Phoenix 0.54 | 36 | 39% |
| rz.GlowBlowMelee 1.4 | 28 | 46% |
| pedersen.Ugluk 1.1.1 | 22 | 73% |
| florent.XSeries.X2 0.12 | 22 | 41% |
| oog.melee.Corsair 1.0 | 9 | 67% |
| stelo.SoJNanoMelee 1.1 | 7 | 86% |
| lunchie.Lunchbox 0.93 | 4 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 41 | 28% | 50 |
| davidalves.Phoenix 0.54 | 38 | 26% | 51 |
| rz.GlowBlowMelee 1.4 | 36 | 24% | 57 |
| pedersen.Ugluk 1.1.1 | 18 | 12% | 28 |
| oog.melee.Corsair 1.0 | 5 | 3% | 14 |
| stelo.SoJNanoMelee 1.1 | 2 | 1% | 3 |
| lunchie.Lunchbox 0.93 | 1 | 1% | 5 |
| evd.X1 0.01 | 1 | 1% | 1 |
| as.FrankTheTank 1.3 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 137891 melee ticks, 32089 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 47 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 46175 sent, 41091 reached their opponent, 7445 virtual hits (18.1% of those reached).

## Melee bench: F25

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 443 over 6 battles (73.8 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 87.8 | 131 / 210 | 2.10 | 18.6% | 24075 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 18.6% | 131 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.3% | 18 |
| jdw.Hurricane 1.4 | 3.3 | 12.0% | 23 |
| voidious.micro.BlitzBat 1.05 | 3.3 | 12.6% | 10 |
| gre.svman4.Morfeas 1.4.1 | 5.2 | 9.7% | 9 |
| ds.Oo 2.2 | 6.2 | 9.2% | 9 |
| awesomeness.Elite 1.0 | 7.3 | 7.3% | 4 |
| adt.Ar2 1.1 | 7.8 | 6.9% | 4 |
| gjr.Cephalosporin 0.1 | 8.7 | 6.2% | 2 |
| amk.ChumbaMini 0.2 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 87.6 | 21 / 35 | 3755 |
| 2 | 1 | 69.0 | 88.6 | 27 / 35 | 4105 |
| 3 | 1 | 67.3 | 84.8 | 17 / 35 | 4209 |
| 4 | 1 | 67.8 | 88.3 | 23 / 35 | 3837 |
| 5 | 1 | 67.8 | 87.9 | 20 / 35 | 4055 |
| 6 | 1 | 69.0 | 89.8 | 23 / 35 | 4114 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 55 | 84% |
| voidious.micro.BlitzBat 1.05 | 39 | 97% |
| jdw.Hurricane 1.4 | 20 | 80% |
| ds.Oo 2.2 | 13 | 69% |
| gre.svman4.Morfeas 1.4.1 | 12 | 92% |
| awesomeness.Elite 1.0 | 6 | 50% |
| gjr.Cephalosporin 0.1 | 5 | 100% |
| adt.Ar2 1.1 | 2 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 651. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 22 | 27% | 60 |
| voidious.micro.BlitzBat 1.05 | 15 | 18% | 40 |
| jdw.Hurricane 1.4 | 13 | 16% | 28 |
| ds.Oo 2.2 | 11 | 13% | 24 |
| gre.svman4.Morfeas 1.4.1 | 8 | 10% | 27 |
| awesomeness.Elite 1.0 | 4 | 5% | 13 |
| adt.Ar2 1.1 | 4 | 5% | 7 |
| amk.ChumbaMini 0.2 | 2 | 2% | 3 |
| gjr.Cephalosporin 0.1 | 0 | 0% | 7 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 126037 melee ticks, 29161 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 52 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 52 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 44870 sent, 40084 reached their opponent, 6747 virtual hits (16.8% of those reached).

## Melee bench: F26

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 568 over 6 battles (94.7 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 92.4 | 142 / 210 | 1.68 | 20.7% | 37988 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 20.7% | 142 |
| ak.Fermat 2.0 | 2.0 | 14.8% | 33 |
| shu.nitro.LENIN .T34 | 3.3 | 12.2% | 13 |
| lrem.Spectre 0.4.4 | 3.7 | 12.2% | 17 |
| js.PinBall 1.6 | 5.0 | 10.6% | 4 |
| jaybot.adv.bots.JayBot 2.0 | 6.2 | 9.4% | 1 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 8.1% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 6.7% | 0 |
| sample.SpinBot 1.0 | 9.0 | 3.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 96.8 | 28 / 35 | 6523 |
| 2 | 1 | 70.4 | 89.8 | 20 / 35 | 5914 |
| 3 | 1 | 71.2 | 92.4 | 22 / 35 | 6257 |
| 4 | 1 | 72.5 | 94.3 | 25 / 35 | 6562 |
| 5 | 1 | 70.6 | 88.9 | 24 / 35 | 6131 |
| 6 | 1 | 72.0 | 92.4 | 23 / 35 | 6601 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 60 | 75% |
| shu.nitro.LENIN .T34 | 50 | 90% |
| lrem.Spectre 0.4.4 | 38 | 82% |
| js.PinBall 1.6 | 12 | 83% |
| fullsail.LaxativeTeaTwo 1.0 | 6 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 3 | 100% |
| gh.mini.GrubbmOne 1.0 | 2 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 958. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 32 | 44% | 73 |
| lrem.Spectre 0.4.4 | 14 | 19% | 41 |
| shu.nitro.LENIN .T34 | 11 | 15% | 57 |
| js.PinBall 1.6 | 6 | 8% | 17 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 7% | 10 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 4 |
| fullsail.LaxativeTeaTwo 1.0 | 0 | 0% | 8 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 163677 melee ticks, 47413 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 24 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 3.

Targeting waves (207 rounds): 52523 sent, 47692 reached their opponent, 11517 virtual hits (24.1% of those reached).

## Melee bench: F27

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 717 over 6 battles (119.5 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 91.7 | 156 / 210 | 1.74 | 20.2% | 31694 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 20.2% | 156 |
| mk.Alpha 0.2.1 | 2.0 | 14.2% | 35 |
| EH.Eagle 1.0.6 | 4.2 | 10.4% | 4 |
| wee.Gem 1.8.4 | 4.7 | 9.8% | 6 |
| techdude.kombat.FlamingKombat 1.5 | 5.7 | 9.1% | 2 |
| sheldor.melee.nano.TestMelee 0.1 | 6.2 | 8.8% | 4 |
| throxbot.ThroxBot 0.1 | 6.7 | 8.7% | 2 |
| joe.ADinosaur 1.0 | 7.2 | 7.6% | 1 |
| caimano.Furia_Ceca 0.22 | 8.2 | 5.9% | 0 |
| cs.Grudge 1.0 | 9.3 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 90.5 | 22 / 35 | 4756 |
| 2 | 1 | 70.5 | 91.1 | 27 / 35 | 5597 |
| 3 | 1 | 70.9 | 94.6 | 29 / 35 | 5276 |
| 4 | 1 | 69.6 | 90.8 | 24 / 35 | 5071 |
| 5 | 1 | 69.7 | 92.4 | 25 / 35 | 4900 |
| 6 | 1 | 71.6 | 91.1 | 29 / 35 | 6094 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 101 | 84% |
| EH.Eagle 1.0.6 | 33 | 94% |
| throxbot.ThroxBot 0.1 | 15 | 93% |
| wee.Gem 1.8.4 | 8 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 7 | 86% |
| techdude.kombat.FlamingKombat 1.5 | 7 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 776. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 27 | 45% | 89 |
| EH.Eagle 1.0.6 | 8 | 13% | 44 |
| joe.ADinosaur 1.0 | 5 | 8% | 5 |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 7% | 21 |
| wee.Gem 1.8.4 | 4 | 7% | 12 |
| throxbot.ThroxBot 0.1 | 3 | 5% | 14 |
| caimano.Furia_Ceca 0.22 | 2 | 3% | 5 |
| cs.Grudge 1.0 | 1 | 2% | 1 |
| techdude.kombat.FlamingKombat 1.5 | 0 | 0% | 17 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 133952 melee ticks, 44906 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 38 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 0.

Targeting waves (209 rounds): 43237 sent, 38344 reached their opponent, 9685 virtual hits (25.3% of those reached).

## Melee bench: F28

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 699 over 6 battles (116.5 per battle, most in one battle 146). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 88.3 | 111 / 210 | 2.06 | 18.2% | 24644 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 18.2% | 111 |
| kid.test.NightFox .2 | 2.0 | 15.3% | 43 |
| uji.Antique 1.0 | 3.2 | 12.4% | 28 |
| pfvicm.Sobieski 7.2.3b | 3.8 | 11.0% | 11 |
| qohnil.blot.BlotBot 3.61 | 5.0 | 9.9% | 8 |
| ahr.ice.Ice 1.0.2 | 6.3 | 8.2% | 7 |
| amk.ChumbaWumba 0.3 | 6.7 | 7.9% | 2 |
| matt.advanced.Katana 1.0 | 8.3 | 6.5% | 0 |
| stelo.PianistNano 1.2 | 8.8 | 5.7% | 0 |
| stelo.Lifestealer 1.0 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 90.5 | 21 / 35 | 4363 |
| 2 | 1 | 68.2 | 88.9 | 20 / 35 | 4343 |
| 3 | 1 | 67.5 | 88.6 | 18 / 35 | 4084 |
| 4 | 1 | 65.5 | 84.4 | 15 / 35 | 3696 |
| 5 | 1 | 67.6 | 87.0 | 18 / 35 | 4220 |
| 6 | 1 | 67.8 | 90.2 | 19 / 35 | 3938 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 88 | 70% |
| uji.Antique 1.0 | 37 | 70% |
| ahr.ice.Ice 1.0.2 | 9 | 78% |
| pfvicm.Sobieski 7.2.3b | 9 | 67% |
| qohnil.blot.BlotBot 3.61 | 7 | 86% |
| amk.ChumbaWumba 0.3 | 3 | 67% |
| matt.advanced.Katana 1.0 | 2 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 796. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 41 | 39% | 75 |
| uji.Antique 1.0 | 25 | 24% | 58 |
| pfvicm.Sobieski 7.2.3b | 18 | 17% | 25 |
| amk.ChumbaWumba 0.3 | 8 | 8% | 20 |
| ahr.ice.Ice 1.0.2 | 4 | 4% | 8 |
| qohnil.blot.BlotBot 3.61 | 1 | 1% | 18 |
| matt.advanced.Katana 1.0 | 1 | 1% | 3 |
| stelo.PianistNano 1.2 | 1 | 1% | 2 |
| stelo.Lifestealer 1.0 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 131443 melee ticks, 37862 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 58 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 2.

Targeting waves (206 rounds): 44269 sent, 39401 reached their opponent, 5569 virtual hits (14.1% of those reached).

## Melee bench: F29

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 522 over 6 battles (87.0 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 84.4 | 94 / 210 | 2.40 | 18.3% | 28081 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 18.3% | 94 |
| deewiant.Anomaly 0.2 | 2.5 | 15.4% | 47 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 15.3% | 46 |
| myl.micro.Troodon 1.10 | 4.2 | 12.4% | 11 |
| jok.PheonixM 0.1.2 | 4.8 | 10.6% | 8 |
| ph.melee.ArcherME 0.3 | 6.0 | 7.8% | 0 |
| DBall.Anarchy 0.1 | 7.7 | 5.5% | 2 |
| fullsail.TimbotNoPrediction 1.0 | 7.8 | 5.6% | 0 |
| ap.Frederick 1.1 | 8.8 | 5.0% | 2 |
| jangs.ns51 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 87.0 | 17 / 35 | 4865 |
| 2 | 1 | 67.6 | 81.9 | 14 / 35 | 4581 |
| 3 | 1 | 68.9 | 84.1 | 16 / 35 | 5039 |
| 4 | 1 | 69.0 | 88.3 | 18 / 35 | 4411 |
| 5 | 1 | 68.4 | 83.5 | 17 / 35 | 4620 |
| 6 | 1 | 67.1 | 81.6 | 12 / 35 | 4565 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 70 | 67% |
| zyx.mega.YersiniaPestis 3.1 | 37 | 57% |
| myl.micro.Troodon 1.10 | 15 | 100% |
| jok.PheonixM 0.1.2 | 10 | 90% |
| DBall.Anarchy 0.1 | 1 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |
| ap.Frederick 1.1 | 1 | 0% |

Hadur died in 121 of 210 rounds, at a mean tick of 973. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 54 | 45% | 99 |
| zyx.mega.YersiniaPestis 3.1 | 33 | 27% | 58 |
| myl.micro.Troodon 1.10 | 16 | 13% | 29 |
| jok.PheonixM 0.1.2 | 10 | 8% | 18 |
| DBall.Anarchy 0.1 | 2 | 2% | 2 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 1 |
| ap.Frederick 1.1 | 1 | 1% | 0 |
| ph.melee.ArcherME 0.3 | 0 | 0% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 170808 melee ticks, 46733 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 56 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 54285 sent, 49526 reached their opponent, 7385 virtual hits (14.9% of those reached).

## Melee bench: F30

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 752 over 6 battles (125.3 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 75.6 | 45 / 210 | 3.20 | 15.1% | 23702 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 15.1% | 45 |
| catcat20.Matcha 0.006 | 2.5 | 13.7% | 41 |
| darkcanuck.B26354 1.06 | 2.8 | 13.5% | 47 |
| oog.melee.Capulet 1.2 | 3.8 | 12.9% | 38 |
| stelo.PastFuture 2.3.2 | 4.8 | 11.8% | 19 |
| intruder.PrairieWolf 2.61 | 6.2 | 9.2% | 13 |
| ntc.Opposite 1.5 | 7.3 | 7.5% | 0 |
| tripphippy.Alice 1.1 | 8.2 | 7.2% | 4 |
| fowl3628800.LightningBolt 2.6.0 | 8.3 | 6.4% | 3 |
| GarmBox.Anger 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.2 | 76.2 | 6 / 35 | 3924 |
| 2 | 1 | 60.7 | 69.8 | 6 / 35 | 3724 |
| 3 | 1 | 64.8 | 80.3 | 9 / 35 | 4233 |
| 4 | 1 | 63.8 | 76.2 | 7 / 35 | 4051 |
| 5 | 1 | 62.8 | 74.0 | 6 / 35 | 4070 |
| 6 | 1 | 63.2 | 77.1 | 11 / 35 | 3700 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 29 | 34% |
| darkcanuck.B26354 1.06 | 25 | 36% |
| oog.melee.Capulet 1.2 | 20 | 35% |
| stelo.PastFuture 2.3.2 | 11 | 55% |
| intruder.PrairieWolf 2.61 | 7 | 29% |
| tripphippy.Alice 1.1 | 6 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 6 | 67% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 171 of 210 rounds, at a mean tick of 901. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 42 | 25% | 55 |
| darkcanuck.B26354 1.06 | 36 | 21% | 47 |
| oog.melee.Capulet 1.2 | 31 | 18% | 36 |
| stelo.PastFuture 2.3.2 | 26 | 15% | 35 |
| fowl3628800.LightningBolt 2.6.0 | 9 | 5% | 11 |
| intruder.PrairieWolf 2.61 | 9 | 5% | 10 |
| ntc.Opposite 1.5 | 7 | 4% | 8 |
| tripphippy.Alice 1.1 | 5 | 3% | 8 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 159296 melee ticks, 33926 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 101 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 101 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 50542 sent, 45732 reached their opponent, 7707 virtual hits (16.9% of those reached).

## Melee bench: F31

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 513 over 6 battles (85.5 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 77.3 | 63 / 210 | 3.04 | 15.6% | 22772 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.3% | 88 |
| hadur2.Hadur 3.18ow | 2.0 | 15.6% | 63 |
| gh.mini.Griezel 0.2 | 3.2 | 13.2% | 40 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.6% | 6 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 10.8% | 8 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.1% | 3 |
| timmit.nano.TimDog 0.33 | 8.0 | 6.2% | 2 |
| fm.mammillarias 1.3 | 8.0 | 6.0% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 8.7 | 5.6% | 1 |
| tlp.ThreeLeggedPig 1 | 9.3 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 73.7 | 10 / 35 | 3551 |
| 2 | 2 | 65.9 | 81.6 | 12 / 35 | 3871 |
| 3 | 2 | 64.0 | 76.5 | 9 / 35 | 3891 |
| 4 | 2 | 64.8 | 80.3 | 11 / 35 | 3891 |
| 5 | 2 | 63.9 | 75.9 | 13 / 35 | 3929 |
| 6 | 2 | 62.9 | 75.9 | 8 / 35 | 3639 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 51 | 49% |
| gh.mini.Griezel 0.2 | 31 | 68% |
| spinnercat.micro.Tyger 0.1 | 9 | 78% |
| d414.nano.Quantum 1.0.0 | 4 | 75% |
| gh.nano.Grofvuil 0.2 | 4 | 75% |
| timmit.nano.TimDog 0.33 | 3 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 0% |

Hadur died in 154 of 210 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 59 | 38% | 78 |
| gh.mini.Griezel 0.2 | 38 | 25% | 60 |
| d414.nano.Quantum 1.0.0 | 19 | 12% | 25 |
| spinnercat.micro.Tyger 0.1 | 12 | 8% | 17 |
| gh.nano.Grofvuil 0.2 | 8 | 5% | 13 |
| Gecko.ultimateGeckoBot 1.0 | 7 | 5% | 9 |
| fm.mammillarias 1.3 | 2 | 1% | 3 |
| timmit.nano.TimDog 0.33 | 1 | 1% | 4 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 149479 melee ticks, 30224 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 41 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 48426 sent, 43473 reached their opponent, 7048 virtual hits (16.2% of those reached).

## Melee bench: F32

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 242 over 6 battles (40.3 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 87.6 | 113 / 210 | 2.11 | 18.2% | 27390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 18.2% | 113 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.2% | 47 |
| apc.botM 3.0 | 3.0 | 12.0% | 20 |
| vjik.UnViolation 1.1 | 4.7 | 10.7% | 15 |
| lxx.ConceptA 0.8 | 4.7 | 10.2% | 5 |
| bayen.UbaMicro 1.4 | 5.7 | 9.1% | 2 |
| panzer.Panzer 0.2 | 7.7 | 7.1% | 1 |
| yk.JahMicro 1.0 | 7.8 | 7.2% | 5 |
| conscience.Electron 1.3g | 9.0 | 5.8% | 0 |
| donjezza.Jezza 1.0 | 9.5 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 89.8 | 22 / 35 | 4571 |
| 2 | 1 | 68.5 | 91.4 | 19 / 35 | 4633 |
| 3 | 1 | 66.2 | 82.9 | 19 / 35 | 4654 |
| 4 | 1 | 69.5 | 92.1 | 21 / 35 | 5091 |
| 5 | 1 | 66.3 | 86.0 | 15 / 35 | 4411 |
| 6 | 1 | 65.5 | 83.5 | 17 / 35 | 4030 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 65 | 57% |
| apc.botM 3.0 | 45 | 82% |
| vjik.UnViolation 1.1 | 16 | 63% |
| lxx.ConceptA 0.8 | 8 | 88% |
| donjezza.Jezza 1.0 | 8 | 88% |
| yk.JahMicro 1.0 | 6 | 100% |
| bayen.UbaMicro 1.4 | 5 | 100% |
| panzer.Panzer 0.2 | 4 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 40 | 41% | 70 |
| vjik.UnViolation 1.1 | 16 | 16% | 33 |
| apc.botM 3.0 | 15 | 15% | 54 |
| lxx.ConceptA 0.8 | 13 | 13% | 20 |
| bayen.UbaMicro 1.4 | 4 | 4% | 10 |
| panzer.Panzer 0.2 | 3 | 3% | 8 |
| conscience.Electron 1.3g | 3 | 3% | 3 |
| yk.JahMicro 1.0 | 2 | 2% | 8 |
| donjezza.Jezza 1.0 | 1 | 1% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 128428 melee ticks, 46419 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 50 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 43592 sent, 38739 reached their opponent, 7361 virtual hits (19.0% of those reached).

## Melee bench: F33

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 706 over 6 battles (117.7 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 86.7 | 96 / 210 | 2.20 | 18.6% | 29528 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 18.6% | 96 |
| maribo.Quester 0.3 | 2.0 | 16.2% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 13.2% | 30 |
| labg.Cataclysm 2.05 | 4.5 | 10.4% | 17 |
| gre.svman4.Leonidas 1.3.2 | 4.7 | 10.9% | 19 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.3 | 8.6% | 4 |
| baal.nano.N 1.42 | 6.3 | 8.9% | 2 |
| sanja.First 0.1 | 8.5 | 4.9% | 0 |
| zyx.micro.Ant 1.1 | 8.5 | 5.0% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 87.9 | 15 / 35 | 5132 |
| 2 | 1 | 68.9 | 86.3 | 17 / 35 | 5085 |
| 3 | 1 | 69.7 | 87.3 | 18 / 35 | 5120 |
| 4 | 1 | 69.3 | 89.2 | 19 / 35 | 5039 |
| 5 | 1 | 67.7 | 84.4 | 13 / 35 | 4784 |
| 6 | 1 | 67.5 | 85.1 | 14 / 35 | 4368 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 58 | 74% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 38 | 63% |
| gre.svman4.Leonidas 1.3.2 | 18 | 61% |
| labg.Cataclysm 2.05 | 13 | 69% |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 100% |
| baal.nano.N 1.42 | 4 | 75% |
| sanja.First 0.1 | 1 | 100% |
| zyx.micro.Ant 1.1 | 1 | 0% |

Hadur died in 120 of 210 rounds, at a mean tick of 1012. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 43 | 36% | 82 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 22% | 53 |
| gre.svman4.Leonidas 1.3.2 | 21 | 18% | 28 |
| labg.Cataclysm 2.05 | 9 | 8% | 19 |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 6% | 13 |
| baal.nano.N 1.42 | 5 | 4% | 9 |
| zyx.micro.Ant 1.1 | 4 | 3% | 4 |
| sanja.First 0.1 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 172226 melee ticks, 47482 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 49 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 54585 sent, 49888 reached their opponent, 7346 virtual hits (14.7% of those reached).

## Melee bench: F34

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 319 over 6 battles (53.2 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 86.0 | 85 / 210 | 2.26 | 18.0% | 29790 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.2 | 18.0% | 85 |
| stelo.Spread 0.9 | 2.0 | 16.6% | 69 |
| kid.Gladiator .7.2 | 2.8 | 15.3% | 37 |
| jcs.Seth 1.8 | 4.2 | 11.6% | 14 |
| tcf.Reach 3 | 4.8 | 10.9% | 4 |
| cli.Dancer 1.1 | 6.0 | 9.4% | 2 |
| ratosh.Wesco 1.4 | 7.0 | 7.6% | 0 |
| amk.Punbot.Punbot 0.01 | 8.2 | 4.6% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.3% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 88.6 | 15 / 35 | 4912 |
| 2 | 1 | 67.2 | 83.5 | 16 / 35 | 4496 |
| 3 | 1 | 67.5 | 82.2 | 12 / 35 | 4987 |
| 4 | 1 | 70.8 | 91.7 | 18 / 35 | 5533 |
| 5 | 1 | 67.9 | 84.1 | 14 / 35 | 4923 |
| 6 | 2 | 68.2 | 85.7 | 10 / 35 | 4939 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 64 | 48% |
| kid.Gladiator .7.2 | 42 | 62% |
| jcs.Seth 1.8 | 18 | 67% |
| tcf.Reach 3 | 9 | 78% |
| cli.Dancer 1.1 | 6 | 100% |
| ratosh.Wesco 1.4 | 3 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 1030. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 55 | 43% | 85 |
| kid.Gladiator .7.2 | 39 | 30% | 61 |
| tcf.Reach 3 | 14 | 11% | 21 |
| jcs.Seth 1.8 | 11 | 9% | 25 |
| cli.Dancer 1.1 | 4 | 3% | 11 |
| ratosh.Wesco 1.4 | 2 | 2% | 4 |
| sample.RamFire 1.0 | 1 | 1% | 1 |
| sample.VelociRobot 1.0 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 170337 melee ticks, 49561 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 31 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 52159 sent, 47330 reached their opponent, 7873 virtual hits (16.6% of those reached).

## Melee bench: F35

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 505 over 6 battles (84.2 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 77.9 | 30 / 210 | 2.99 | 15.0% | 22179 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.6% | 143 |
| hadur2.Hadur 3.18ow | 2.2 | 15.0% | 30 |
| gh.mini.Gruwel 0.9 | 3.2 | 13.2% | 21 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.8 | 12.2% | 12 |
| rz.HawkOnFire 0.1 | 4.8 | 11.7% | 4 |
| wit.Chuliath 1.0 | 6.3 | 6.9% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.0 | 6.5% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.5 | 5.3% | 0 |
| dans.Cinnamon 1.2 | 9.0 | 4.6% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.9 | 73.3 | 4 / 35 | 3415 |
| 2 | 2 | 64.7 | 79.4 | 7 / 35 | 3921 |
| 3 | 2 | 63.4 | 76.5 | 4 / 35 | 3573 |
| 4 | 2 | 62.4 | 74.9 | 4 / 35 | 3642 |
| 5 | 2 | 64.8 | 81.3 | 7 / 35 | 3809 |
| 6 | 2 | 64.6 | 81.9 | 4 / 35 | 3819 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 66 | 11% |
| gh.mini.Gruwel 0.9 | 19 | 37% |
| rz.HawkOnFire 0.1 | 12 | 83% |
| dmh.robocode.robot.BlackDeath 9.2 | 6 | 33% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 100% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 185 of 210 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 93 | 50% | 107 |
| dmh.robocode.robot.BlackDeath 9.2 | 36 | 19% | 37 |
| gh.mini.Gruwel 0.9 | 28 | 15% | 34 |
| rz.HawkOnFire 0.1 | 19 | 10% | 23 |
| wit.Chuliath 1.0 | 2 | 1% | 4 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 3 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 140937 melee ticks, 37995 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 48 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 44581 sent, 39578 reached their opponent, 6065 virtual hits (15.3% of those reached).

## Melee bench: F36

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 352 over 6 battles (58.7 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 90.5 | 150 / 210 | 1.86 | 20.3% | 32299 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 20.3% | 150 |
| alpha.RainingFire 1.0 | 2.2 | 12.7% | 19 |
| bzdp.Pansy 2.1 | 3.0 | 12.3% | 13 |
| bvh.micro.Freya 0.3 | 4.8 | 10.4% | 7 |
| mz.Cork 0.1 | 4.8 | 10.3% | 8 |
| bvh.mini.Fenrir 0.39 | 6.0 | 9.7% | 3 |
| m3thos.Eva02 0.7.1 | 6.2 | 9.4% | 8 |
| dl.BetterWalls 1.0 | 8.3 | 5.5% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 5.4% | 1 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 88.9 | 21 / 35 | 5083 |
| 2 | 1 | 71.5 | 94.3 | 28 / 35 | 5503 |
| 3 | 1 | 69.0 | 86.7 | 24 / 35 | 4951 |
| 4 | 1 | 71.1 | 92.4 | 25 / 35 | 5637 |
| 5 | 1 | 70.0 | 88.9 | 27 / 35 | 5213 |
| 6 | 1 | 71.3 | 91.7 | 25 / 35 | 5912 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| alpha.RainingFire 1.0 | 46 | 83% |
| bzdp.Pansy 2.1 | 41 | 90% |
| mz.Cork 0.1 | 34 | 88% |
| bvh.micro.Freya 0.3 | 21 | 86% |
| bvh.mini.Fenrir 0.39 | 15 | 100% |
| m3thos.Eva02 0.7.1 | 11 | 64% |
| dl.BetterWalls 1.0 | 2 | 100% |
| sample.MyFirstRobot 1.0 | 2 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 50% |

Hadur died in 63 of 210 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 17 | 27% | 48 |
| bzdp.Pansy 2.1 | 13 | 21% | 46 |
| bvh.micro.Freya 0.3 | 8 | 13% | 31 |
| mz.Cork 0.1 | 7 | 11% | 37 |
| bvh.mini.Fenrir 0.39 | 7 | 11% | 19 |
| m3thos.Eva02 0.7.1 | 6 | 10% | 19 |
| squidM.TentalceMeleeNano 1.1 | 2 | 3% | 3 |
| dl.BetterWalls 1.0 | 1 | 2% | 3 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 144087 melee ticks, 49346 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 42 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 49588 sent, 44926 reached their opponent, 9392 virtual hits (20.9% of those reached).

## Melee bench: F37

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 363 over 6 battles (60.5 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.8 | 161 / 210 | 2.10 | 19.3% | 33732 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 19.3% | 161 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.3 | 11.2% | 11 |
| germ.TheMind .2 | 3.7 | 9.9% | 7 |
| agrach.Dalek 1.0 | 5.2 | 9.2% | 4 |
| stelo.UntouchableNano 1.3 | 5.3 | 9.3% | 8 |
| lmk.ACPFinal 0.1 | 5.5 | 9.2% | 6 |
| EBBU.Sim2 1.02 | 5.7 | 9.2% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 7.7 | 8.2% | 1 |
| mb.Beast 0.1 | 8.8 | 7.6% | 4 |
| skm.Ryubot 1.0 | 9.8 | 7.0% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 83.8 | 24 / 35 | 5373 |
| 2 | 1 | 68.8 | 89.8 | 28 / 35 | 5624 |
| 3 | 1 | 69.4 | 91.7 | 28 / 35 | 5678 |
| 4 | 1 | 69.6 | 91.7 | 29 / 35 | 5866 |
| 5 | 1 | 68.8 | 89.8 | 27 / 35 | 5832 |
| 6 | 1 | 66.4 | 80.0 | 25 / 35 | 5359 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 27 | 96% |
| agrach.Dalek 1.0 | 26 | 100% |
| stelo.UntouchableNano 1.3 | 24 | 92% |
| lmk.ACPFinal 0.1 | 21 | 90% |
| germ.TheMind .2 | 21 | 100% |
| mb.Beast 0.1 | 18 | 100% |
| EBBU.Sim2 1.02 | 17 | 94% |
| skm.Ryubot 1.0 | 13 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 397. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 14 | 27% | 15 |
| com.syncleus.robocode.Dreadnaught 0.1 | 7 | 13% | 37 |
| lmk.ACPFinal 0.1 | 7 | 13% | 27 |
| agrach.Dalek 1.0 | 6 | 12% | 37 |
| EBBU.Sim2 1.02 | 5 | 10% | 31 |
| germ.TheMind .2 | 5 | 10% | 22 |
| stelo.UntouchableNano 1.3 | 5 | 10% | 21 |
| skm.Ryubot 1.0 | 1 | 2% | 5 |
| mb.Beast 0.1 | 0 | 0% | 12 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 93301 melee ticks, 25607 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 52 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 52 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 2.

Targeting waves (201 rounds): 31449 sent, 27182 reached their opponent, 8161 virtual hits (30.0% of those reached).

## Melee bench: F38

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 550 over 6 battles (91.7 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 88.1 | 106 / 210 | 2.07 | 18.2% | 27223 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.2 | 18.2% | 106 |
| justin.Mallais 14.0 | 2.0 | 16.2% | 63 |
| bvh.mini.Freya 0.55 | 2.8 | 13.2% | 14 |
| cs.Wren 1.0 | 4.5 | 10.6% | 8 |
| bts.mega.Gnarly 1.4 | 4.7 | 10.5% | 14 |
| kdf.KoulDestroyer 1.0 | 6.0 | 9.3% | 3 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.0 | 7.9% | 0 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.2% | 3 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.4% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 91.4 | 22 / 35 | 4909 |
| 2 | 1 | 68.6 | 88.9 | 18 / 35 | 4595 |
| 3 | 2 | 66.7 | 83.5 | 15 / 35 | 4363 |
| 4 | 1 | 66.2 | 85.1 | 12 / 35 | 4140 |
| 5 | 1 | 69.1 | 92.4 | 22 / 35 | 4570 |
| 6 | 1 | 68.2 | 87.6 | 17 / 35 | 4646 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 74 | 65% |
| bts.mega.Gnarly 1.4 | 25 | 64% |
| bvh.mini.Freya 0.55 | 23 | 78% |
| cs.Wren 1.0 | 17 | 71% |
| kdf.KoulDestroyer 1.0 | 9 | 89% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 33% |
| davidalves.net.DuelistNanoMelee 1.01 | 2 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 840. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 37 | 34% | 87 |
| bts.mega.Gnarly 1.4 | 20 | 18% | 41 |
| bvh.mini.Freya 0.55 | 18 | 16% | 33 |
| cs.Wren 1.0 | 13 | 12% | 21 |
| kdf.KoulDestroyer 1.0 | 6 | 5% | 13 |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 5% | 5 |
| matt.UnderDark3 2.4.34 | 3 | 3% | 3 |
| davidalves.net.DuelistNanoMelee 1.01 | 2 | 2% | 6 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 142100 melee ticks, 44084 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 43 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 46092 sent, 40970 reached their opponent, 8493 virtual hits (20.7% of those reached).

## Melee bench: F39

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 782 over 6 battles (130.3 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 86.8 | 98 / 210 | 2.19 | 18.6% | 31983 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 18.6% | 98 |
| bvh.fry.Freya 0.82 | 2.2 | 14.2% | 17 |
| az.Ololobot 0.2.4 | 3.0 | 13.1% | 62 |
| catcat20.Lambda 0.024 | 3.8 | 12.0% | 27 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 8.7% | 2 |
| apollokidd.ApolloKidd 0.9 | 6.5 | 7.8% | 2 |
| gimp.GimpBot 0.1 | 6.5 | 7.9% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 7.8 | 7.0% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.3 | 5.5% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 87.3 | 15 / 35 | 4996 |
| 2 | 1 | 70.1 | 91.7 | 23 / 35 | 5747 |
| 3 | 1 | 68.3 | 88.3 | 16 / 35 | 5346 |
| 4 | 1 | 69.3 | 88.6 | 20 / 35 | 5590 |
| 5 | 1 | 67.6 | 86.7 | 15 / 35 | 5138 |
| 6 | 1 | 65.3 | 78.4 | 9 / 35 | 5166 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 53 | 43% |
| bvh.fry.Freya 0.82 | 39 | 90% |
| catcat20.Lambda 0.024 | 33 | 70% |
| gimp.GimpBot 0.1 | 7 | 100% |
| winamp32.micro.MicroMacro 1.0 | 6 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 3 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 50% |

Hadur died in 118 of 210 rounds, at a mean tick of 1028. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 41 | 35% | 64 |
| bvh.fry.Freya 0.82 | 34 | 29% | 64 |
| catcat20.Lambda 0.024 | 27 | 23% | 45 |
| stelo.SoRobotNanoMelee 1.2 | 3 | 3% | 6 |
| gimp.GimpBot 0.1 | 2 | 2% | 13 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 10 |
| apollokidd.ApolloKidd 0.9 | 2 | 2% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 165886 melee ticks, 50071 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 58 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 2.

Targeting waves (206 rounds): 51874 sent, 46983 reached their opponent, 8429 virtual hits (17.9% of those reached).

## Melee bench: F40

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 647 over 6 battles (107.8 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 87.7 | 126 / 210 | 2.10 | 19.2% | 30023 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 19.2% | 126 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.0% | 37 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.5% | 20 |
| mz.AntiGrav 1.0 | 4.2 | 11.4% | 9 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.2% | 9 |
| alpha.BlackIce 1.0 | 6.2 | 9.2% | 2 |
| stelo.Randomness 1.0 | 6.7 | 8.2% | 5 |
| amk.superstrike.SuperStrike 0.3 | 7.8 | 6.8% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 4.2% | 2 |
| sample.Corners 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 87.6 | 22 / 35 | 5109 |
| 2 | 1 | 71.1 | 90.8 | 25 / 35 | 5568 |
| 3 | 1 | 69.1 | 87.0 | 20 / 35 | 4806 |
| 4 | 1 | 68.1 | 85.1 | 18 / 35 | 4860 |
| 5 | 1 | 69.3 | 87.6 | 22 / 35 | 5003 |
| 6 | 1 | 68.9 | 88.3 | 19 / 35 | 4677 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 67 | 76% |
| kano.gamma.KanoGamma 1.8 | 33 | 70% |
| mz.AntiGrav 1.0 | 26 | 96% |
| Polkwane.SmashMelee 1.0 | 15 | 93% |
| stelo.Randomness 1.0 | 7 | 86% |
| alpha.BlackIce 1.0 | 4 | 100% |
| sample.Corners 1.0 | 2 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 0% |

Hadur died in 89 of 210 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 28 | 31% | 67 |
| kano.gamma.KanoGamma 1.8 | 21 | 24% | 53 |
| mz.AntiGrav 1.0 | 8 | 9% | 33 |
| Polkwane.SmashMelee 1.0 | 7 | 8% | 13 |
| amk.superstrike.SuperStrike 0.3 | 7 | 8% | 10 |
| stelo.Randomness 1.0 | 6 | 7% | 17 |
| alpha.BlackIce 1.0 | 6 | 7% | 12 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 3 |
| sample.Corners 1.0 | 0 | 0% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 149784 melee ticks, 39888 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 81 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 81 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 49463 sent, 44492 reached their opponent, 9419 virtual hits (21.2% of those reached).

## Melee bench: F41

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 602 over 6 battles (100.3 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 84.9 | 89 / 210 | 2.36 | 17.6% | 26793 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.3 | 17.6% | 89 |
| eem.EvBotNG v12.8 | 1.7 | 15.8% | 65 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 13.3% | 20 |
| ary.Swarm 1.1 | 3.5 | 13.1% | 18 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 11.4% | 14 |
| shrub.Silver v048 | 6.0 | 8.9% | 1 |
| zyx.nano.Ant 1.1 | 7.2 | 6.9% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 5.4% | 3 |
| stelo.Mirror 1.1 | 8.5 | 5.3% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 84.8 | 16 / 35 | 4330 |
| 2 | 1 | 68.2 | 87.3 | 14 / 35 | 4508 |
| 3 | 2 | 65.7 | 81.3 | 10 / 35 | 4136 |
| 4 | 1 | 68.3 | 86.0 | 17 / 35 | 4739 |
| 5 | 2 | 64.9 | 77.5 | 9 / 35 | 4305 |
| 6 | 1 | 70.4 | 92.4 | 23 / 35 | 4775 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 61 | 44% |
| lessonz.robocode.Oz 0.5.0 | 38 | 76% |
| ary.Swarm 1.1 | 26 | 73% |
| simonton.nano.MeleeSeed 1.8 | 10 | 90% |
| shrub.Silver v048 | 4 | 75% |
| jsal.Jsalbot 1.0 | 2 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 902. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 48 | 38% | 75 |
| lessonz.robocode.Oz 0.5.0 | 28 | 22% | 46 |
| ary.Swarm 1.1 | 21 | 17% | 42 |
| simonton.nano.MeleeSeed 1.8 | 18 | 14% | 30 |
| shrub.Silver v048 | 3 | 2% | 11 |
| stelo.Mirror 1.1 | 2 | 2% | 2 |
| jsal.Jsalbot 1.0 | 1 | 1% | 4 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 151036 melee ticks, 44850 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 69 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 69 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 49624 sent, 44687 reached their opponent, 7106 virtual hits (15.9% of those reached).

## Melee bench: F42

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 490 over 6 battles (81.7 per battle, most in one battle 149). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 89.8 | 129 / 210 | 1.91 | 19.8% | 34257 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 19.8% | 129 |
| wompi.Wallaby 5.1 | 2.0 | 16.1% | 45 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 12.9% | 14 |
| ara.Shera 0.88 | 3.5 | 12.6% | 19 |
| amz.NanoClone 1.41 | 5.0 | 8.9% | 1 |
| dsw.StaticD 1.0 | 6.3 | 7.0% | 2 |
| maribo.IotaCT 1.1 | 7.0 | 6.6% | 0 |
| stelo.MirrorMicro 1.0 | 8.3 | 5.6% | 0 |
| mme.NikeEnhanced 2.0 | 8.5 | 5.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 84.1 | 17 / 35 | 5091 |
| 2 | 1 | 70.4 | 90.2 | 24 / 35 | 5645 |
| 3 | 1 | 71.6 | 93.3 | 24 / 35 | 6260 |
| 4 | 1 | 70.7 | 92.1 | 21 / 35 | 5780 |
| 5 | 1 | 69.2 | 86.7 | 21 / 35 | 5391 |
| 6 | 1 | 70.9 | 92.7 | 22 / 35 | 6090 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 100 | 84% |
| maribo.mini.MiniQuester 0.1 | 32 | 78% |
| ara.Shera 0.88 | 22 | 64% |
| dsw.StaticD 1.0 | 4 | 100% |
| amz.NanoClone 1.41 | 2 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 901. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 33 | 39% | 115 |
| ara.Shera 0.88 | 25 | 29% | 39 |
| maribo.mini.MiniQuester 0.1 | 15 | 18% | 37 |
| maribo.IotaCT 1.1 | 3 | 4% | 3 |
| dsw.StaticD 1.0 | 2 | 2% | 7 |
| stelo.MirrorMicro 1.0 | 2 | 2% | 2 |
| amz.NanoClone 1.41 | 1 | 1% | 3 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 161395 melee ticks, 47633 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 50 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 50873 sent, 46147 reached their opponent, 9210 virtual hits (20.0% of those reached).

## Melee bench: F43

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 636 over 6 battles (106.0 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 80.0 | 35 / 210 | 2.80 | 15.7% | 23483 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.5% | 140 |
| hadur2.Hadur 3.18ow | 2.0 | 15.7% | 35 |
| brainfade.melee.Dusk 0.44 | 3.5 | 12.0% | 20 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.7% | 8 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 11.1% | 4 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 10.2% | 2 |
| jab.DiamondStealer 5 | 7.5 | 7.1% | 0 |
| mz.NanoGod 2.02 | 7.5 | 7.5% | 1 |
| cvt.Firsty 1.0 | 9.0 | 3.9% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 75.9 | 5 / 35 | 3548 |
| 2 | 2 | 65.5 | 79.0 | 6 / 35 | 4035 |
| 3 | 2 | 65.0 | 77.8 | 3 / 35 | 3705 |
| 4 | 2 | 66.3 | 81.0 | 6 / 35 | 4223 |
| 5 | 2 | 66.1 | 81.6 | 7 / 35 | 3909 |
| 6 | 2 | 67.0 | 84.8 | 8 / 35 | 4063 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 86 | 20% |
| brainfade.melee.Dusk 0.44 | 12 | 33% |
| dummy.micro.Sparrow 2.5 | 10 | 80% |
| Krabb.akim2.Akim2 1.1b | 5 | 60% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 50% |
| cvt.Firsty 1.0 | 1 | 100% |

Hadur died in 180 of 210 rounds, at a mean tick of 949. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 102 | 57% | 121 |
| brainfade.melee.Dusk 0.44 | 24 | 13% | 27 |
| dummy.micro.Sparrow 2.5 | 19 | 11% | 26 |
| wcsv.melee.EngineerMelee 0.1 | 17 | 9% | 21 |
| mz.NanoGod 2.02 | 7 | 4% | 7 |
| Krabb.akim2.Akim2 1.1b | 5 | 3% | 6 |
| jab.DiamondStealer 5 | 1 | 1% | 1 |
| cvt.Firsty 1.0 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 152423 melee ticks, 50549 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 25 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 2.

Targeting waves (207 rounds): 49036 sent, 44011 reached their opponent, 7278 virtual hits (16.5% of those reached).

## Melee bench: F44

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 128 over 6 battles (21.3 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 92.1 | 145 / 210 | 1.71 | 20.7% | 34500 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 20.7% | 145 |
| stelo.Liblix 0.3.1 | 2.0 | 15.3% | 44 |
| tzu.TheArtOfWar 1.2 | 3.0 | 13.7% | 15 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.2 | 9.7% | 1 |
| jwirde.Gort 2.0 | 4.8 | 9.3% | 3 |
| wompi.Quokka 1.6 | 6.7 | 7.5% | 2 |
| disan.Chair 2.2.0 | 6.8 | 7.3% | 0 |
| stf.PanzerGeneral 0.1 | 7.5 | 6.8% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 5.2% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 92.4 | 20 / 35 | 5580 |
| 2 | 1 | 71.5 | 92.4 | 26 / 35 | 5912 |
| 3 | 1 | 71.2 | 93.0 | 24 / 35 | 5846 |
| 4 | 1 | 71.2 | 92.4 | 27 / 35 | 5487 |
| 5 | 1 | 69.0 | 87.3 | 20 / 35 | 5276 |
| 6 | 1 | 72.7 | 94.9 | 28 / 35 | 6399 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 76 | 74% |
| tzu.TheArtOfWar 1.2 | 60 | 87% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 14 | 100% |
| jwirde.Gort 2.0 | 12 | 100% |
| disan.Chair 2.2.0 | 3 | 100% |
| stf.PanzerGeneral 0.1 | 3 | 100% |
| wompi.Quokka 1.6 | 3 | 100% |
| sample.Crazy 1.0 | 1 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 870. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 35 | 53% | 99 |
| tzu.TheArtOfWar 1.2 | 20 | 30% | 65 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 8% | 13 |
| jwirde.Gort 2.0 | 4 | 6% | 19 |
| disan.Chair 2.2.0 | 1 | 2% | 6 |
| wompi.Quokka 1.6 | 1 | 2% | 2 |
| stf.PanzerGeneral 0.1 | 0 | 0% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 2 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 204 rounds): 152531 melee ticks, 44316 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 40 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 52682 sent, 47984 reached their opponent, 10217 virtual hits (21.3% of those reached).

## Melee bench: F45

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 525 over 6 battles (87.5 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 87.7 | 93 / 210 | 2.11 | 19.6% | 33613 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 1.0 | 19.6% | 93 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 12.9% | 92 |
| jje.BagPuss 1.2 | 3.2 | 11.9% | 5 |
| sul.Lunar 1.1 | 4.2 | 10.7% | 9 |
| myl.nano.Graviton 1.10 | 4.3 | 10.7% | 3 |
| hvilela.HVilela 0.9 | 6.8 | 8.0% | 0 |
| fm.claire 1.7 | 7.0 | 8.2% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.2 | 8.1% | 5 |
| wit.Deep7 2.0 | 9.0 | 5.5% | 2 |
| abud.ThirdRobo 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 89.8 | 19 / 35 | 5671 |
| 2 | 1 | 69.3 | 87.9 | 16 / 35 | 5458 |
| 3 | 1 | 67.7 | 83.2 | 11 / 35 | 5527 |
| 4 | 1 | 68.5 | 85.7 | 14 / 35 | 5351 |
| 5 | 1 | 70.3 | 89.5 | 16 / 35 | 6058 |
| 6 | 1 | 69.9 | 89.8 | 17 / 35 | 5548 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 96 | 42% |
| sul.Lunar 1.1 | 17 | 100% |
| myl.nano.Graviton 1.10 | 13 | 100% |
| jje.BagPuss 1.2 | 12 | 67% |
| pez.mini.ChironexFleckeri 0.5 | 8 | 75% |
| wit.Deep7 2.0 | 6 | 100% |
| fm.claire 1.7 | 3 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 1636. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 63 | 52% | 0 |
| jje.BagPuss 1.2 | 24 | 20% | 67 |
| sul.Lunar 1.1 | 12 | 10% | 60 |
| myl.nano.Graviton 1.10 | 8 | 7% | 42 |
| pez.mini.ChironexFleckeri 0.5 | 5 | 4% | 14 |
| fm.claire 1.7 | 3 | 2% | 10 |
| hvilela.HVilela 0.9 | 1 | 1% | 6 |
| abud.ThirdRobo 1.0 | 1 | 1% | 3 |
| wit.Deep7 2.0 | 0 | 0% | 6 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 209193 melee ticks, 101857 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 35 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 62287 sent, 57653 reached their opponent, 8611 virtual hits (14.9% of those reached).

## Melee bench: F46

hadur2.Hadur 3.18ow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 700 over 6 battles (116.7 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 83.3 | 67 / 210 | 2.50 | 16.4% | 24450 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18ow | 2.0 | 16.4% | 67 |
| kc.mini.Mirage 0.2 | 2.0 | 16.7% | 52 |
| rsalesc.melee.Medina 0.4.5 | 2.0 | 16.9% | 84 |
| mz.MicroSheep 1.0 | 4.3 | 10.2% | 3 |
| sadoner.killer 0.2 | 5.5 | 9.3% | 0 |
| cx.Princess 1.0 | 5.7 | 8.9% | 5 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.1% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.9% | 0 |
| kurios.DOSexe .9a | 8.3 | 5.2% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 87.0 | 14 / 35 | 4225 |
| 2 | 3 | 64.7 | 79.4 | 9 / 35 | 3887 |
| 3 | 3 | 65.0 | 82.9 | 11 / 35 | 3750 |
| 4 | 2 | 66.0 | 80.3 | 11 / 35 | 4222 |
| 5 | 2 | 66.2 | 85.1 | 11 / 35 | 4003 |
| 6 | 1 | 66.2 | 85.1 | 11 / 35 | 4363 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 65 | 66% |
| rsalesc.melee.Medina 0.4.5 | 48 | 21% |
| cx.Princess 1.0 | 7 | 86% |
| mz.MicroSheep 1.0 | 4 | 75% |
| sadoner.killer 0.2 | 3 | 100% |
| arthord.NanoSatanMelee Beta | 2 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 61 | 40% | 75 |
| kc.mini.Mirage 0.2 | 52 | 34% | 89 |
| arthord.NanoSatanMelee Beta | 9 | 6% | 10 |
| mz.MicroSheep 1.0 | 7 | 5% | 12 |
| sadoner.killer 0.2 | 7 | 5% | 9 |
| cx.Princess 1.0 | 5 | 3% | 10 |
| jeremyreeder.collective.Prophet 5 | 2 | 1% | 3 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 210 rounds): 153891 melee ticks, 45488 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (210 rounds): longest scan gap while four or more were alive 40 ticks (210 rounds over 8); rounds whose longest gap at any count was over 8: 210; robots dropped as dead without a death event: 1.

Targeting waves (210 rounds): 44809 sent, 39814 reached their opponent, 6026 virtual hits (15.1% of those reached).

