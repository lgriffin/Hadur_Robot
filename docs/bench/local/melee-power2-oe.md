# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 249 over 6 battles (41.5 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 85.1 | 51 / 210 | 2.34 | 17.0% | 30164 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.2% | 132 |
| hadur2.Hadur 3.18oe | 2.0 | 17.0% | 51 |
| sgp.JollyNinja 3.53 | 3.2 | 11.5% | 13 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 11.2% | 5 |
| lorneswork.Predator 1.0 | 5.2 | 10.5% | 6 |
| mz.MicroGodMelee 1 | 5.8 | 9.7% | 4 |
| adt.Ar2 1.0 | 6.8 | 7.7% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.8% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.3% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.1 | 81.9 | 9 / 35 | 4897 |
| 2 | 2 | 65.0 | 80.0 | 5 / 35 | 4676 |
| 3 | 2 | 66.6 | 84.1 | 6 / 35 | 5278 |
| 4 | 2 | 67.2 | 87.3 | 11 / 35 | 4967 |
| 5 | 2 | 67.5 | 88.6 | 11 / 35 | 5046 |
| 6 | 2 | 67.9 | 88.9 | 9 / 35 | 5300 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 116 | 9% |
| sgp.JollyNinja 3.53 | 23 | 65% |
| simonton.nano.WeekendObsession_Melee 1.0 | 12 | 75% |
| mz.MicroGodMelee 1 | 10 | 80% |
| lorneswork.Predator 1.0 | 8 | 88% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 162 of 210 rounds, at a mean tick of 1167. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 112 | 69% | 128 |
| sgp.JollyNinja 3.53 | 21 | 13% | 28 |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 6% | 13 |
| lorneswork.Predator 1.0 | 7 | 4% | 17 |
| mz.MicroGodMelee 1 | 3 | 2% | 14 |
| adt.Ar2 1.0 | 3 | 2% | 4 |
| skm.butterfly 1.0 | 2 | 1% | 3 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 134556 melee ticks, 94418 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 58 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 2.

Targeting waves (202 rounds): 44483 sent, 39766 reached their opponent, 8190 virtual hits (20.6% of those reached).

## Melee bench: F02

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 168 over 6 battles (28.0 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 84.6 | 104 / 210 | 2.39 | 18.1% | 28431 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.0 | 18.1% | 104 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 13.6% | 36 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 12.9% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.6% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.2 | 10.1% | 14 |
| Noran.BitchingElk 0.054 | 6.7 | 8.1% | 17 |
| sch.Simone 0.3d | 6.7 | 8.6% | 8 |
| fnc.bandit.Bandit 5.2.0 | 7.3 | 8.0% | 3 |
| stelo.PatternRobot 1.0 | 9.0 | 5.9% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 85.7 | 17 / 35 | 4733 |
| 2 | 1 | 64.5 | 77.5 | 13 / 35 | 4343 |
| 3 | 1 | 67.9 | 86.0 | 17 / 35 | 4791 |
| 4 | 1 | 67.9 | 84.8 | 21 / 35 | 4768 |
| 5 | 1 | 67.5 | 86.3 | 16 / 35 | 4829 |
| 6 | 1 | 68.7 | 87.3 | 20 / 35 | 4967 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 41 | 73% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 32 | 69% |
| com.cohesiva.robocode.ManOwaR 1.0 | 22 | 73% |
| Noran.BitchingElk 0.054 | 20 | 40% |
| sch.Simone 0.3d | 16 | 81% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 100% |
| fnc.bandit.Bandit 5.2.0 | 5 | 60% |
| stelo.PatternRobot 1.0 | 4 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 948. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 29 | 27% | 56 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 18 | 17% | 39 |
| Noran.BitchingElk 0.054 | 14 | 13% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 11% | 22 |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 9% | 32 |
| sch.Simone 0.3d | 9 | 8% | 18 |
| stelo.PatternRobot 1.0 | 7 | 7% | 11 |
| fnc.bandit.Bandit 5.2.0 | 4 | 4% | 9 |
| fullsail.SweetTea 1.1 | 3 | 3% | 3 |

Posture (Hadur's M records, 205 rounds): 168030 melee ticks, 45050 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 53 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 53 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 2.

Targeting waves (205 rounds): 60401 sent, 55595 reached their opponent, 9756 virtual hits (17.5% of those reached).

## Melee bench: F03

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 174 over 6 battles (29.0 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 90.6 | 153 / 210 | 1.84 | 19.9% | 36282 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.0 | 19.9% | 153 |
| radnor.DoctorBob 1.42 | 2.5 | 14.0% | 25 |
| kawigi.nano.Lib 1.0 | 3.0 | 13.0% | 12 |
| vuen.Cake 2.51 | 3.5 | 12.5% | 15 |
| urdos.URDOS 1.3 | 5.0 | 9.7% | 4 |
| adt.Ar1 2.1 | 6.2 | 7.6% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 6.5% | 0 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.5% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 92.4 | 26 / 35 | 6123 |
| 2 | 1 | 68.9 | 88.3 | 22 / 35 | 5980 |
| 3 | 1 | 70.5 | 91.1 | 28 / 35 | 6062 |
| 4 | 1 | 69.1 | 88.3 | 22 / 35 | 5883 |
| 5 | 1 | 69.8 | 89.5 | 27 / 35 | 5965 |
| 6 | 1 | 71.3 | 94.3 | 28 / 35 | 6269 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 67 | 85% |
| radnor.DoctorBob 1.42 | 48 | 98% |
| kawigi.nano.Lib 1.0 | 39 | 90% |
| oa.weak.FlyMk1 0.1 | 7 | 100% |
| urdos.URDOS 1.3 | 4 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 0% |

Hadur died in 57 of 210 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 17 | 30% | 55 |
| kawigi.nano.Lib 1.0 | 13 | 23% | 44 |
| vuen.Cake 2.51 | 12 | 21% | 68 |
| urdos.URDOS 1.3 | 5 | 9% | 12 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 7% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 4% | 6 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 4% | 4 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 10 |
| adt.Ar1 2.1 | 1 | 2% | 3 |

Posture (Hadur's M records, 202 rounds): 127516 melee ticks, 38510 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 512 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 241 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 39543 sent, 34889 reached their opponent, 9277 virtual hits (26.6% of those reached).

## Melee bench: F04

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 497 over 6 battles (82.8 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 86.3 | 39 / 210 | 2.23 | 17.8% | 33721 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 21.9% | 146 |
| hadur2.Hadur 3.18oe | 2.0 | 17.8% | 39 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.4% | 9 |
| TNT.TNT 0.99.1 | 4.0 | 11.2% | 15 |
| josago.Jorgito 0.16 | 5.2 | 9.0% | 1 |
| css.Delitioner 0.11 | 6.3 | 7.4% | 0 |
| tj.zombie1n 1.0.1 | 6.7 | 6.6% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.3% | 0 |
| spin.Bugstard 0.012b | 8.8 | 4.1% | 0 |
| sp.Nanos.Ember 1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.4 | 87.3 | 4 / 35 | 5428 |
| 2 | 2 | 68.4 | 86.0 | 5 / 35 | 5622 |
| 3 | 2 | 69.7 | 88.9 | 10 / 35 | 5996 |
| 4 | 2 | 68.6 | 84.1 | 7 / 35 | 5880 |
| 5 | 2 | 67.7 | 86.3 | 4 / 35 | 5294 |
| 6 | 2 | 68.1 | 85.4 | 9 / 35 | 5501 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 116 | 11% |
| TNT.TNT 0.99.1 | 20 | 55% |
| apc.LeeroyJenkins2 1.0 | 16 | 81% |
| josago.Jorgito 0.16 | 1 | 0% |
| tj.zombie1n 1.0.1 | 1 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 1316. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 114 | 65% | 132 |
| TNT.TNT 0.99.1 | 21 | 12% | 30 |
| apc.LeeroyJenkins2 1.0 | 20 | 11% | 31 |
| josago.Jorgito 0.16 | 13 | 7% | 13 |
| css.Delitioner 0.11 | 2 | 1% | 3 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 0 |
| rampancy.Durandal 2.1d | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 205572 melee ticks, 70584 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 71 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 62238 sent, 57310 reached their opponent, 8797 virtual hits (15.3% of those reached).

## Melee bench: F05

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 497 over 6 battles (82.8 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 77.8 | 31 / 210 | 3.00 | 15.0% | 22904 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.4% | 108 |
| justin.DemonicRage 3.4 | 2.0 | 16.5% | 54 |
| hadur2.Hadur 3.18oe | 3.0 | 15.0% | 31 |
| wompi.Numbat 2.1 | 4.0 | 12.5% | 10 |
| axeBots.HataMoto 3.09 | 5.3 | 9.5% | 5 |
| ms.Ares 0.19 | 5.7 | 9.1% | 2 |
| supersample.SuperBoxBot 1.0 | 7.3 | 5.8% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.3% | 0 |
| GarmBox.Oranges 1.0 | 9.2 | 4.1% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.8 | 81.0 | 6 / 35 | 3819 |
| 2 | 3 | 62.9 | 75.6 | 3 / 35 | 3577 |
| 3 | 3 | 63.5 | 75.6 | 5 / 35 | 3979 |
| 4 | 3 | 63.8 | 78.4 | 4 / 35 | 3882 |
| 5 | 3 | 64.3 | 79.0 | 5 / 35 | 3729 |
| 6 | 3 | 64.0 | 77.5 | 8 / 35 | 3918 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 41 | 7% |
| justin.DemonicRage 3.4 | 30 | 33% |
| wompi.Numbat 2.1 | 14 | 86% |
| axeBots.HataMoto 3.09 | 6 | 83% |
| ms.Ares 0.19 | 2 | 50% |

Hadur died in 184 of 210 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 71 | 39% | 74 |
| justin.DemonicRage 3.4 | 62 | 34% | 75 |
| wompi.Numbat 2.1 | 30 | 16% | 39 |
| axeBots.HataMoto 3.09 | 7 | 4% | 12 |
| ms.Ares 0.19 | 7 | 4% | 7 |
| supersample.SuperBoxBot 1.0 | 3 | 2% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 155723 melee ticks, 33208 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 59 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 49500 sent, 44400 reached their opponent, 7494 virtual hits (16.9% of those reached).

## Melee bench: F06

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 356 over 6 battles (59.3 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.8 | 130 / 210 | 2.00 | 19.1% | 29902 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.0 | 19.1% | 130 |
| jekl.StoneGhost 0.7 | 2.3 | 14.4% | 24 |
| origin.SleepSiphon 1.7b | 2.8 | 13.7% | 35 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.5% | 14 |
| mld.Wisdom 1.0 | 5.0 | 10.5% | 0 |
| gg.Wolverine 2.0 | 6.2 | 8.5% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 7.2% | 7 |
| DBall.NUKE 0.1 | 8.3 | 5.7% | 0 |
| spinnercat.Omen 1.0 | 8.5 | 5.7% | 0 |
| sample.Fire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 90.2 | 24 / 35 | 5195 |
| 2 | 1 | 69.7 | 91.1 | 22 / 35 | 4813 |
| 3 | 1 | 69.2 | 88.3 | 20 / 35 | 5031 |
| 4 | 1 | 70.2 | 91.4 | 20 / 35 | 5253 |
| 5 | 1 | 68.6 | 86.7 | 23 / 35 | 4645 |
| 6 | 1 | 68.1 | 85.4 | 21 / 35 | 4965 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 52 | 88% |
| origin.SleepSiphon 1.7b | 49 | 73% |
| pe.minimelee.SandboxMiniMelee 1.1 | 30 | 83% |
| gg.Wolverine 2.0 | 9 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 8 | 50% |
| mld.Wisdom 1.0 | 7 | 100% |
| DBall.NUKE 0.1 | 2 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 891. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 26 | 30% | 65 |
| jekl.StoneGhost 0.7 | 25 | 29% | 62 |
| pe.minimelee.SandboxMiniMelee 1.1 | 15 | 17% | 41 |
| mld.Wisdom 1.0 | 7 | 8% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 6% | 12 |
| gg.Wolverine 2.0 | 4 | 5% | 10 |
| DBall.NUKE 0.1 | 1 | 1% | 4 |
| spinnercat.Omen 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 143381 melee ticks, 46040 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 40 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 2.

Targeting waves (205 rounds): 46456 sent, 41596 reached their opponent, 9270 virtual hits (22.3% of those reached).

## Melee bench: F07

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 314 over 6 battles (52.3 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 93.4 | 126 / 210 | 1.59 | 21.0% | 39654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.0 | 21.0% | 126 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 16.2% | 37 |
| rtk.Tachikoma 1.0 | 2.8 | 15.5% | 24 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.6% | 8 |
| franzor.Lizt 1.3.1 | 4.7 | 11.5% | 15 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.6% | 0 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 7.7% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.3 | 2.2% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 94.0 | 22 / 35 | 6356 |
| 2 | 1 | 72.4 | 92.7 | 19 / 35 | 6583 |
| 3 | 1 | 73.0 | 94.3 | 24 / 35 | 6748 |
| 4 | 1 | 72.8 | 94.6 | 20 / 35 | 6890 |
| 5 | 1 | 72.1 | 93.7 | 19 / 35 | 6178 |
| 6 | 1 | 72.9 | 91.4 | 22 / 35 | 6899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 70 | 79% |
| rsalesc.melee.Monk 0.3.6c | 48 | 33% |
| franzor.Lizt 1.3.1 | 39 | 69% |
| oog.melee.CapuletDroid 1.1 | 33 | 82% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 1521. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 40 | 47% | 70 |
| rtk.Tachikoma 1.0 | 22 | 26% | 86 |
| franzor.Lizt 1.3.1 | 11 | 13% | 3 |
| oog.melee.CapuletDroid 1.1 | 9 | 10% | 40 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 4 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 3 |
| drd.Dreadknoght 0.9 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 187340 melee ticks, 104128 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 48 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 56631 sent, 51863 reached their opponent, 10659 virtual hits (20.6% of those reached).

## Melee bench: F08

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 661 over 6 battles (110.2 per battle, most in one battle 166). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 89.5 | 113 / 210 | 1.94 | 18.8% | 28323 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.0 | 18.8% | 113 |
| shrub.Vapour v159 | 2.5 | 12.8% | 29 |
| tm.Yuugao 1.0 | 2.8 | 13.0% | 40 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 11.1% | 17 |
| com.spp.robocode.MostlyHarmless 010 | 4.7 | 10.2% | 9 |
| m3thos.Eva00 1.1 | 6.5 | 8.7% | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 6.7 | 8.3% | 3 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 6.8% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 5.3% | 0 |
| SHAM.WOW 1.4 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 90.5 | 18 / 35 | 4564 |
| 2 | 1 | 69.0 | 90.5 | 19 / 35 | 5022 |
| 3 | 1 | 67.5 | 86.7 | 15 / 35 | 4515 |
| 4 | 1 | 68.1 | 88.3 | 19 / 35 | 4810 |
| 5 | 1 | 66.6 | 86.3 | 15 / 35 | 4416 |
| 6 | 1 | 70.5 | 94.9 | 27 / 35 | 4996 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 55 | 51% |
| shrub.Vapour v159 | 37 | 57% |
| com.spp.robocode.MostlyHarmless 010 | 25 | 88% |
| Krabb.sliNk.Garm 0.9u | 24 | 71% |
| jwst.DAD.DarkAndDarker 1.1 | 14 | 93% |
| m3thos.Eva00 1.1 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| SHAM.WOW 1.4 | 3 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 927. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 38 | 37% | 73 |
| shrub.Vapour v159 | 26 | 25% | 45 |
| com.spp.robocode.MostlyHarmless 010 | 14 | 14% | 30 |
| Krabb.sliNk.Garm 0.9u | 13 | 13% | 28 |
| m3thos.Eva00 1.1 | 3 | 3% | 10 |
| jwst.DAD.DarkAndDarker 1.1 | 2 | 2% | 16 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 2 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 2 |
| SHAM.WOW 1.4 | 0 | 0% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 154940 melee ticks, 45371 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 58 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 50932 sent, 46003 reached their opponent, 8665 virtual hits (18.8% of those reached).

## Melee bench: F09

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 664 over 6 battles (110.7 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 72.6 | 46 / 210 | 3.47 | 14.5% | 21121 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.5% | 98 |
| hadur2.Hadur 3.18oe | 2.2 | 14.5% | 46 |
| kc.micro.Figment 1.0 | 2.8 | 14.0% | 28 |
| mc2.enemy.Original 0.9 | 5.0 | 10.1% | 20 |
| pedersen.Grishnakh 1.0 | 5.0 | 10.7% | 13 |
| yagami.Tidus 0.11 | 5.2 | 10.6% | 1 |
| dft.Calliope 5.6 | 6.8 | 7.9% | 3 |
| step.nanoPri 1.0 | 8.3 | 5.7% | 1 |
| robar.nano.Assertive_Melee 0.2 | 8.8 | 4.8% | 0 |
| rdm.Dueler 0.4x | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.9 | 66.3 | 7 / 35 | 3386 |
| 2 | 3 | 60.9 | 69.2 | 6 / 35 | 3296 |
| 3 | 2 | 63.9 | 77.5 | 7 / 35 | 3879 |
| 4 | 2 | 62.5 | 73.0 | 8 / 35 | 3603 |
| 5 | 2 | 63.2 | 76.5 | 9 / 35 | 3384 |
| 6 | 2 | 62.7 | 73.0 | 9 / 35 | 3573 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 44 | 27% |
| kc.micro.Figment 1.0 | 24 | 79% |
| pedersen.Grishnakh 1.0 | 9 | 44% |
| yagami.Tidus 0.11 | 7 | 100% |
| mc2.enemy.Original 0.9 | 7 | 14% |
| dft.Calliope 5.6 | 4 | 75% |
| step.nanoPri 1.0 | 1 | 0% |

Hadur died in 169 of 210 rounds, at a mean tick of 795. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 57 | 34% | 70 |
| mc2.enemy.Original 0.9 | 28 | 17% | 30 |
| kc.micro.Figment 1.0 | 25 | 15% | 45 |
| yagami.Tidus 0.11 | 23 | 14% | 29 |
| pedersen.Grishnakh 1.0 | 15 | 9% | 17 |
| robar.nano.Assertive_Melee 0.2 | 6 | 4% | 6 |
| dft.Calliope 5.6 | 4 | 2% | 7 |
| step.nanoPri 1.0 | 4 | 2% | 4 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 144867 melee ticks, 32085 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 41 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 1.

Targeting waves (209 rounds): 48770 sent, 43938 reached their opponent, 6335 virtual hits (14.4% of those reached).

## Melee bench: F10

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 184 over 6 battles (30.7 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 95.1 | 165 / 210 | 1.44 | 20.4% | 32827 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.0 | 20.4% | 165 |
| DTF.Kludgy 1.2b | 2.3 | 14.5% | 18 |
| ejb.Polaris 1.0.1 | 3.3 | 12.5% | 13 |
| ne.Chimera 1.2 | 3.3 | 12.7% | 4 |
| vStar.RAFzilla 2.15 | 5.3 | 9.8% | 4 |
| tvv.micro.Antares 1.1.1 | 5.7 | 10.0% | 7 |
| kurios.DOSexe .9b | 7.7 | 5.7% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.2% | 0 |
| sam.Samspin 1.0 | 9.0 | 4.8% | 0 |
| donjezza.Muncho 1.0 | 9.2 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 94.0 | 26 / 35 | 5193 |
| 2 | 1 | 71.5 | 95.9 | 27 / 35 | 5731 |
| 3 | 1 | 70.6 | 94.9 | 29 / 35 | 5455 |
| 4 | 1 | 70.8 | 94.9 | 26 / 35 | 5441 |
| 5 | 1 | 70.9 | 93.7 | 28 / 35 | 5508 |
| 6 | 1 | 71.3 | 97.1 | 29 / 35 | 5499 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 69 | 88% |
| ejb.Polaris 1.0.1 | 40 | 90% |
| ne.Chimera 1.2 | 33 | 97% |
| tvv.micro.Antares 1.1.1 | 17 | 100% |
| vStar.RAFzilla 2.15 | 13 | 77% |
| kurios.DOSexe .9b | 7 | 100% |
| donjezza.Muncho 1.0 | 2 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 16 | 36% | 71 |
| ejb.Polaris 1.0.1 | 10 | 22% | 54 |
| ne.Chimera 1.2 | 8 | 18% | 38 |
| tvv.micro.Antares 1.1.1 | 6 | 13% | 12 |
| vStar.RAFzilla 2.15 | 3 | 7% | 18 |
| donjezza.Muncho 1.0 | 1 | 2% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 1 |
| kurios.DOSexe .9b | 0 | 0% | 10 |
| sam.Samspin 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 201 rounds): 145567 melee ticks, 55588 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 46 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 3.

Targeting waves (201 rounds): 48296 sent, 43551 reached their opponent, 8362 virtual hits (19.2% of those reached).

## Melee bench: F11

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 483 over 6 battles (80.5 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 78.5 | 59 / 210 | 2.94 | 15.5% | 22199 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 16.9% | 83 |
| hadur2.Hadur 3.18oe | 2.0 | 15.5% | 59 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.5% | 22 |
| djc.DynaBot 0.1.1 | 4.2 | 11.1% | 14 |
| rdt199.Warlord 0.73 | 5.7 | 9.2% | 10 |
| br2.MobyDickBot 1.6 | 5.8 | 9.2% | 12 |
| uji.YellohFellah 1.0 | 6.3 | 8.7% | 10 |
| KiraNL.Chupacabra 0.4 | 8.0 | 7.2% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.2% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 80.6 | 12 / 35 | 3578 |
| 2 | 2 | 61.8 | 72.7 | 7 / 35 | 3543 |
| 3 | 2 | 63.2 | 78.7 | 8 / 35 | 3681 |
| 4 | 2 | 62.7 | 75.2 | 10 / 35 | 3569 |
| 5 | 2 | 65.0 | 83.5 | 11 / 35 | 3711 |
| 6 | 2 | 64.9 | 80.0 | 11 / 35 | 4117 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 48 | 35% |
| djc.DynaBot 0.1.1 | 17 | 71% |
| cx.mini.Nimrod 0.55 | 14 | 50% |
| uji.YellohFellah 1.0 | 12 | 92% |
| br2.MobyDickBot 1.6 | 10 | 50% |
| rdt199.Warlord 0.73 | 8 | 63% |
| KiraNL.Chupacabra 0.4 | 2 | 50% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 873. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 71 | 46% | 89 |
| cx.mini.Nimrod 0.55 | 29 | 19% | 35 |
| djc.DynaBot 0.1.1 | 14 | 9% | 24 |
| br2.MobyDickBot 1.6 | 11 | 7% | 18 |
| rdt199.Warlord 0.73 | 9 | 6% | 16 |
| KiraNL.Chupacabra 0.4 | 7 | 5% | 7 |
| uji.YellohFellah 1.0 | 6 | 4% | 16 |
| stelo.MirrorNano 1.3 | 2 | 1% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 154046 melee ticks, 35574 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 46 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 51111 sent, 46133 reached their opponent, 6285 virtual hits (13.6% of those reached).

## Melee bench: F12

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 504 over 6 battles (84.0 per battle, most in one battle 146). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 84.7 | 113 / 210 | 2.38 | 17.5% | 22965 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.0 | 17.5% | 113 |
| bts.wiki.RipCurl 0.9b | 2.3 | 13.8% | 36 |
| nat.PallasHawk 1.0 | 3.2 | 12.7% | 30 |
| darkcanuck.Leon 1.01 | 3.5 | 12.5% | 17 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.3% | 9 |
| jrm.Test0 1.0 | 6.2 | 8.2% | 0 |
| cs.sheldor.Talon 1.1 | 8.0 | 6.7% | 0 |
| jp.Perpy 16.0 | 8.2 | 6.5% | 0 |
| stuff.Vlad 0.1 | 8.7 | 6.2% | 3 |
| jaybot.bots.Oddball 4.0 | 9.0 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 84.4 | 21 / 35 | 4027 |
| 2 | 1 | 68.2 | 88.3 | 23 / 35 | 4135 |
| 3 | 1 | 63.8 | 77.8 | 13 / 35 | 3538 |
| 4 | 1 | 66.7 | 86.3 | 16 / 35 | 3926 |
| 5 | 1 | 66.2 | 83.8 | 19 / 35 | 3689 |
| 6 | 1 | 67.2 | 87.6 | 21 / 35 | 3650 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 44 | 73% |
| darkcanuck.Leon 1.01 | 44 | 77% |
| nat.PallasHawk 1.0 | 38 | 71% |
| brainfade.melee.Genghis 0.36 | 10 | 80% |
| jrm.Test0 1.0 | 6 | 100% |
| jaybot.bots.Oddball 4.0 | 4 | 100% |
| stuff.Vlad 0.1 | 2 | 50% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 26 | 26% | 50 |
| nat.PallasHawk 1.0 | 24 | 24% | 45 |
| darkcanuck.Leon 1.01 | 17 | 17% | 59 |
| brainfade.melee.Genghis 0.36 | 15 | 15% | 23 |
| jrm.Test0 1.0 | 5 | 5% | 12 |
| jaybot.bots.Oddball 4.0 | 3 | 3% | 7 |
| jp.Perpy 16.0 | 3 | 3% | 5 |
| stuff.Vlad 0.1 | 3 | 3% | 4 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 5 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 131985 melee ticks, 37440 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 34 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 2.

Targeting waves (207 rounds): 45614 sent, 40621 reached their opponent, 6822 virtual hits (16.8% of those reached).

## Melee bench: F13

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 90 over 6 battles (15.0 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 79.7 | 49 / 210 | 2.83 | 15.4% | 24548 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 16.6% | 84 |
| ags.Glacier 0.2.11 | 2.2 | 15.8% | 42 |
| hadur2.Hadur 3.18oe | 2.3 | 15.4% | 49 |
| shinh.Entangled 0.3 | 4.0 | 12.7% | 24 |
| gh.micro.Gruweltje 0.7 | 5.0 | 11.9% | 10 |
| apc.Colossus2 0.17 | 6.2 | 7.7% | 0 |
| stelo.Wang 1.0 | 6.8 | 7.2% | 1 |
| ayk.WallHugger 1.0 | 8.3 | 4.6% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.4 | 74.0 | 4 / 35 | 3959 |
| 2 | 3 | 64.3 | 80.6 | 8 / 35 | 3999 |
| 3 | 3 | 64.3 | 79.4 | 9 / 35 | 4003 |
| 4 | 2 | 66.1 | 84.8 | 10 / 35 | 4234 |
| 5 | 2 | 64.1 | 78.7 | 8 / 35 | 4036 |
| 6 | 1 | 65.2 | 80.6 | 10 / 35 | 4317 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 41 | 37% |
| ags.Glacier 0.2.11 | 37 | 68% |
| shinh.Entangled 0.3 | 13 | 46% |
| gh.micro.Gruweltje 0.7 | 6 | 33% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 161 of 210 rounds, at a mean tick of 837. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 55 | 34% | 71 |
| ags.Glacier 0.2.11 | 44 | 27% | 69 |
| shinh.Entangled 0.3 | 26 | 16% | 28 |
| gh.micro.Gruweltje 0.7 | 22 | 14% | 24 |
| stelo.Wang 1.0 | 6 | 4% | 10 |
| apc.Colossus2 0.17 | 4 | 2% | 4 |
| maribo.FollowFire 1 | 3 | 2% | 3 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 204 rounds): 147879 melee ticks, 34282 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 71 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 43588 sent, 38587 reached their opponent, 6583 virtual hits (17.1% of those reached).

## Melee bench: F14

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 166 over 6 battles (27.7 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 92.8 | 146 / 210 | 1.65 | 20.2% | 33019 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.0 | 20.2% | 146 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.8% | 26 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.6% | 29 |
| Lo_Ian.Gandalf_V4 4.0 | 4.3 | 9.6% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 5.5 | 9.2% | 3 |
| co.edu.usb.rc.LidisTron 1.0 | 5.5 | 9.1% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.3 | 7.8% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 8.1% | 4 |
| pa.Improved 1.0 | 9.0 | 5.9% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 90.2 | 23 / 35 | 5509 |
| 2 | 1 | 69.6 | 90.8 | 20 / 35 | 5052 |
| 3 | 1 | 71.5 | 94.6 | 27 / 35 | 5738 |
| 4 | 1 | 71.2 | 93.7 | 24 / 35 | 5743 |
| 5 | 1 | 71.4 | 95.2 | 27 / 35 | 5443 |
| 6 | 1 | 70.4 | 92.4 | 25 / 35 | 5534 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 75 | 91% |
| catcat20.shape.Theta 0.018 | 66 | 64% |
| sanyi.mikrobi.Roberto 1.0 | 17 | 94% |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 6 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 31 | 48% | 65 |
| simonton.micro.Sprout 1.1.3 | 20 | 31% | 82 |
| sanyi.mikrobi.Roberto 1.0 | 5 | 8% | 24 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 6% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 2 | 3% | 13 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 3% | 7 |
| co.edu.usb.rc.LidisTron 1.0 | 0 | 0% | 6 |
| pa.Improved 1.0 | 0 | 0% | 6 |

Posture (Hadur's M records, 204 rounds): 146901 melee ticks, 48769 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 74 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 74 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 4.

Targeting waves (204 rounds): 46508 sent, 41950 reached their opponent, 10251 virtual hits (24.4% of those reached).

## Melee bench: F15

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 469 over 6 battles (78.2 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 83.5 | 107 / 210 | 2.48 | 18.1% | 29721 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.0 | 18.1% | 107 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.8% | 24 |
| emp.Yngwie 1.11 | 3.3 | 12.6% | 43 |
| mld.DustBunny 3.8 | 3.5 | 12.5% | 9 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.7% | 4 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.8% | 22 |
| lambdaxy.TBot 0.1 | 7.2 | 6.8% | 0 |
| Grystrion.TrackerWO 1.0 | 8.0 | 6.3% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 5.4% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 87.0 | 25 / 35 | 5351 |
| 2 | 1 | 66.8 | 81.9 | 16 / 35 | 4595 |
| 3 | 1 | 68.1 | 84.4 | 19 / 35 | 5101 |
| 4 | 1 | 67.8 | 82.9 | 16 / 35 | 5119 |
| 5 | 1 | 66.4 | 80.0 | 13 / 35 | 4840 |
| 6 | 1 | 67.4 | 85.1 | 18 / 35 | 4715 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 40 | 63% |
| kawigi.micro.Shiz 1.1 | 33 | 94% |
| kawigi.robot.Girl 1.2 | 21 | 81% |
| mld.DustBunny 3.8 | 18 | 83% |
| cb.nano.Insomnia 1.0 | 13 | 92% |
| divineomega.TrialBot 0.003 | 5 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 38 | 36% | 73 |
| mld.DustBunny 3.8 | 17 | 16% | 42 |
| cb.nano.Insomnia 1.0 | 17 | 16% | 26 |
| kawigi.micro.Shiz 1.1 | 13 | 12% | 34 |
| kawigi.robot.Girl 1.2 | 13 | 12% | 15 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 5 |
| lambdaxy.TBot 0.1 | 2 | 2% | 4 |
| divineomega.TrialBot 0.003 | 1 | 1% | 10 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 161045 melee ticks, 38300 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 56 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 53727 sent, 48921 reached their opponent, 8366 virtual hits (17.1% of those reached).

## Melee bench: F16

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 463 over 6 battles (77.2 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 84.1 | 99 / 210 | 2.43 | 18.4% | 32054 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.0 | 18.4% | 99 |
| gh.Griezel 0.5.2 | 2.0 | 15.7% | 57 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.4% | 7 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 11.1% | 34 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 9.5% | 5 |
| tvv.nano.Polaris 1.2 | 5.7 | 9.1% | 5 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.7% | 3 |
| repositorio.NanoStep 1.0 | 8.5 | 5.1% | 0 |
| asd.Cthulhu 1.3 | 9.2 | 4.5% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.3 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 77.8 | 14 / 35 | 4712 |
| 2 | 1 | 69.6 | 86.7 | 18 / 35 | 5694 |
| 3 | 1 | 68.4 | 84.8 | 17 / 35 | 5236 |
| 4 | 1 | 68.0 | 84.1 | 14 / 35 | 5457 |
| 5 | 1 | 67.5 | 82.2 | 15 / 35 | 5242 |
| 6 | 1 | 70.2 | 88.9 | 21 / 35 | 5713 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 64 | 58% |
| techdude.forest.FlamingForest 1.1 | 35 | 57% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 22 | 95% |
| tvv.nano.Polaris 1.2 | 9 | 100% |
| bvh.fnr.Fenrir 0.36l | 7 | 71% |
| stelo.IntrinsicVolatility 1.4 | 7 | 86% |
| divineomega.DivineBot 1.9.4.5 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 1080. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 38 | 33% | 80 |
| bvh.fnr.Fenrir 0.36l | 23 | 20% | 26 |
| techdude.forest.FlamingForest 1.1 | 22 | 19% | 42 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 17 | 15% | 35 |
| stelo.IntrinsicVolatility 1.4 | 5 | 4% | 10 |
| tvv.nano.Polaris 1.2 | 5 | 4% | 9 |
| repositorio.NanoStep 1.0 | 1 | 1% | 2 |
| divineomega.DivineBot 1.9.4.5 | 0 | 0% | 6 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 173727 melee ticks, 61344 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 30 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 30 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 57285 sent, 52528 reached their opponent, 9042 virtual hits (17.2% of those reached).

## Melee bench: F17

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 941 over 6 battles (156.8 per battle, most in one battle 253). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.3 | 102 / 210 | 2.32 | 18.8% | 34024 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.0 | 18.8% | 102 |
| et.Predator 1.8 | 2.5 | 13.8% | 34 |
| oog.melee.Mercutio 1.0 | 2.8 | 13.2% | 28 |
| cx.BlestPain 1.41 | 4.0 | 11.6% | 26 |
| ahf.NanoAndrew .4 | 4.8 | 10.4% | 8 |
| nic.Nicator 2.4 | 6.2 | 9.3% | 9 |
| maribo.melee.BMV 0.1 | 6.7 | 9.1% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.2 | 6.0% | 2 |
| tex.Longbot 0.4 | 8.8 | 5.3% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 81.0 | 12 / 35 | 5404 |
| 2 | 1 | 69.5 | 87.6 | 21 / 35 | 5571 |
| 3 | 1 | 69.0 | 85.7 | 18 / 35 | 5802 |
| 4 | 1 | 69.8 | 86.3 | 19 / 35 | 5973 |
| 5 | 1 | 69.9 | 89.2 | 18 / 35 | 5898 |
| 6 | 1 | 67.3 | 81.9 | 14 / 35 | 5376 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 60 | 72% |
| et.Predator 1.8 | 40 | 63% |
| cx.BlestPain 1.41 | 28 | 50% |
| ahf.NanoAndrew .4 | 12 | 100% |
| maribo.melee.BMV 0.1 | 5 | 80% |
| edu.otg.spr.TheTeacher 1.2 | 3 | 67% |
| nic.Nicator 2.4 | 3 | 67% |

Hadur died in 115 of 210 rounds, at a mean tick of 1029. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 28 | 24% | 56 |
| cx.BlestPain 1.41 | 28 | 24% | 42 |
| oog.melee.Mercutio 1.0 | 25 | 22% | 61 |
| ahf.NanoAndrew .4 | 11 | 10% | 18 |
| nic.Nicator 2.4 | 6 | 5% | 14 |
| maribo.melee.BMV 0.1 | 6 | 5% | 11 |
| tex.Longbot 0.4 | 3 | 3% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 5 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 160546 melee ticks, 58505 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 50 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 53946 sent, 49110 reached their opponent, 10511 virtual hits (21.4% of those reached).

## Melee bench: F18

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 587 over 6 battles (97.8 per battle, most in one battle 157). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 89.4 | 129 / 210 | 1.95 | 19.3% | 29171 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.0 | 19.3% | 129 |
| morbid.MorbidPriest 1.0 | 2.0 | 14.1% | 28 |
| agd.Mooserwirt2 2.7 | 3.2 | 12.4% | 17 |
| uji.DBH 1.1 | 3.8 | 11.7% | 10 |
| sigterm.Sigterm 1.0 | 5.5 | 8.8% | 15 |
| spinnercat.Robovirus 2.718 | 6.0 | 8.3% | 2 |
| ratosh.Nobo 0.21 | 6.7 | 8.1% | 4 |
| kawigi.mini.Fhqwhgads 1.1 | 7.8 | 7.3% | 2 |
| stelo.WangRobot 1.0 | 9.2 | 5.5% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 92.4 | 23 / 35 | 4879 |
| 2 | 1 | 68.3 | 87.3 | 18 / 35 | 4833 |
| 3 | 1 | 67.5 | 84.8 | 21 / 35 | 4571 |
| 4 | 1 | 69.2 | 90.8 | 21 / 35 | 4868 |
| 5 | 1 | 68.8 | 87.9 | 23 / 35 | 4818 |
| 6 | 1 | 70.5 | 93.3 | 23 / 35 | 5202 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 57 | 77% |
| agd.Mooserwirt2 2.7 | 34 | 85% |
| sigterm.Sigterm 1.0 | 26 | 69% |
| uji.DBH 1.1 | 26 | 85% |
| stelo.WangRobot 1.0 | 9 | 89% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 100% |
| spinnercat.Robovirus 2.718 | 4 | 75% |
| ratosh.Nobo 0.21 | 3 | 33% |

Hadur died in 84 of 210 rounds, at a mean tick of 829. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 27 | 32% | 77 |
| agd.Mooserwirt2 2.7 | 14 | 17% | 41 |
| uji.DBH 1.1 | 13 | 15% | 28 |
| sigterm.Sigterm 1.0 | 10 | 12% | 30 |
| ratosh.Nobo 0.21 | 7 | 8% | 12 |
| stelo.WangRobot 1.0 | 3 | 4% | 9 |
| spinnercat.Robovirus 2.718 | 3 | 4% | 7 |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 4% | 5 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 138030 melee ticks, 43590 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 47 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 5.

Targeting waves (199 rounds): 46550 sent, 41851 reached their opponent, 9236 virtual hits (22.1% of those reached).

## Melee bench: F19

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 137 over 6 battles (22.8 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 96.5 | 188 / 210 | 1.32 | 22.0% | 36884 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.0 | 22.0% | 188 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.6% | 9 |
| mld.Infinity 2.2 | 3.3 | 12.2% | 6 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.6% | 4 |
| erdnis.Rover 0.3 | 4.7 | 10.4% | 2 |
| patson.PatsonTestBot 1.0 | 6.0 | 9.1% | 0 |
| mbh.Mbh 0.1 | 7.2 | 7.2% | 0 |
| pac.ABC 2.1 | 7.8 | 6.4% | 1 |
| pbg.R2D2 1.0 | 9.0 | 5.3% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.9 | 99.7 | 34 / 35 | 6386 |
| 2 | 1 | 71.9 | 93.0 | 30 / 35 | 5687 |
| 3 | 1 | 74.0 | 98.7 | 32 / 35 | 6770 |
| 4 | 1 | 72.6 | 94.9 | 31 / 35 | 5871 |
| 5 | 1 | 73.6 | 98.4 | 32 / 35 | 6198 |
| 6 | 1 | 72.1 | 94.0 | 29 / 35 | 5972 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 101 | 97% |
| mld.Infinity 2.2 | 30 | 97% |
| krillr.mini.JointStrike 2.0.0 | 22 | 91% |
| erdnis.Rover 0.3 | 21 | 100% |
| patson.PatsonTestBot 1.0 | 11 | 100% |
| pac.ABC 2.1 | 4 | 100% |
| mbh.Mbh 0.1 | 4 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 22 of 210 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 9 | 41% | 73 |
| krillr.mini.JointStrike 2.0.0 | 6 | 27% | 36 |
| erdnis.Rover 0.3 | 3 | 14% | 21 |
| patson.PatsonTestBot 1.0 | 2 | 9% | 26 |
| mld.Infinity 2.2 | 1 | 5% | 24 |
| mbh.Mbh 0.1 | 1 | 5% | 7 |
| pac.ABC 2.1 | 0 | 0% | 8 |
| pbg.R2D2 1.0 | 0 | 0% | 8 |

Posture (Hadur's M records, 200 rounds): 124819 melee ticks, 47944 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 57 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 42637 sent, 38087 reached their opponent, 9328 virtual hits (24.5% of those reached).

## Melee bench: F20

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 742 over 6 battles (123.7 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 91.7 | 145 / 210 | 1.74 | 20.7% | 35275 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.0 | 20.7% | 145 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.3% | 33 |
| fwb.Nine 1.0.1 | 3.5 | 11.3% | 8 |
| catcat20.Rabbit 0.001 | 4.3 | 10.1% | 14 |
| nz.jdc.nano.GridFu 1.0 | 4.7 | 10.3% | 1 |
| m3thos.mini.Eva01 0.5.5 | 5.5 | 9.0% | 1 |
| bayen.nut.Squirrel 1.615 | 7.3 | 7.4% | 5 |
| ntc.ControlledChaos 1.1.4 | 8.5 | 5.7% | 1 |
| djdjdj.NanoSkunk10 1.0 | 8.5 | 6.2% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 9.7 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 88.6 | 23 / 35 | 5606 |
| 2 | 1 | 69.9 | 88.3 | 20 / 35 | 6031 |
| 3 | 1 | 71.9 | 95.6 | 27 / 35 | 6085 |
| 4 | 1 | 70.2 | 89.8 | 25 / 35 | 5414 |
| 5 | 1 | 72.1 | 95.9 | 25 / 35 | 6223 |
| 6 | 1 | 71.6 | 92.4 | 25 / 35 | 5916 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 82 | 80% |
| fwb.Nine 1.0.1 | 40 | 93% |
| catcat20.Rabbit 0.001 | 30 | 73% |
| m3thos.mini.Eva01 0.5.5 | 9 | 89% |
| nz.jdc.nano.GridFu 1.0 | 8 | 100% |
| bayen.nut.Squirrel 1.615 | 4 | 75% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 0% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 993. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 36 | 51% | 99 |
| catcat20.Rabbit 0.001 | 9 | 13% | 30 |
| fwb.Nine 1.0.1 | 7 | 10% | 19 |
| nz.jdc.nano.GridFu 1.0 | 4 | 6% | 25 |
| bayen.nut.Squirrel 1.615 | 3 | 4% | 9 |
| m3thos.mini.Eva01 0.5.5 | 2 | 3% | 17 |
| ntc.ControlledChaos 1.1.4 | 2 | 3% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 4 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 163598 melee ticks, 58668 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 33 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 52160 sent, 47318 reached their opponent, 10906 virtual hits (23.0% of those reached).

## Melee bench: F21

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 482 over 6 battles (80.3 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 90.5 | 113 / 210 | 1.85 | 19.9% | 34285 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.2 | 19.9% | 113 |
| eem.EvBot v4.6.16 | 1.8 | 16.9% | 77 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.7% | 6 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.8% | 3 |
| eld.Hmm 1.0 | 5.0 | 9.1% | 14 |
| oa.weak.BotherBot 0.1 | 6.0 | 7.4% | 0 |
| el.JumpShoot 0.2 | 7.5 | 6.1% | 0 |
| fire219.CatBot 1.0 | 8.2 | 5.7% | 0 |
| PSW.Relentless 0.1 | 8.3 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 91.7 | 21 / 35 | 5349 |
| 2 | 1 | 71.8 | 94.9 | 23 / 35 | 5740 |
| 3 | 1 | 71.4 | 91.4 | 22 / 35 | 6009 |
| 4 | 1 | 70.1 | 87.9 | 19 / 35 | 5855 |
| 5 | 2 | 68.5 | 87.9 | 13 / 35 | 5431 |
| 6 | 1 | 70.3 | 89.2 | 15 / 35 | 5901 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 117 | 57% |
| dummy.mini.Scimitar 1.01 | 21 | 86% |
| eld.Hmm 1.0 | 17 | 65% |
| cf.RiO.RiOx 4.2.1 | 14 | 100% |
| oa.weak.BotherBot 0.1 | 3 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 1322. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 63 | 61% | 110 |
| dummy.mini.Scimitar 1.01 | 20 | 19% | 44 |
| eld.Hmm 1.0 | 6 | 6% | 27 |
| cf.RiO.RiOx 4.2.1 | 4 | 4% | 20 |
| PSW.Relentless 0.1 | 2 | 2% | 2 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 4 |
| el.JumpShoot 0.2 | 1 | 1% | 1 |
| fire219.CatBot 1.0 | 0 | 0% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 187439 melee ticks, 83070 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 47 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 1.

Targeting waves (208 rounds): 55382 sent, 50615 reached their opponent, 8991 virtual hits (17.8% of those reached).

## Melee bench: F22

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 447 over 6 battles (74.5 per battle, most in one battle 142). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 88.0 | 90 / 210 | 2.08 | 18.2% | 29196 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.3 | 18.2% | 90 |
| pe.SandboxDT 2.71m | 1.7 | 16.7% | 73 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.7% | 28 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.8% | 16 |
| bigpete.Stewie 1.0 | 5.0 | 10.7% | 2 |
| yk.JahRoslav 1.1 | 6.5 | 6.8% | 1 |
| gg.Squaraus 0.6 | 7.2 | 6.5% | 0 |
| tad.Dalek98 0.98 | 7.3 | 6.2% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.8% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.1 | 84.1 | 12 / 35 | 4531 |
| 2 | 1 | 68.9 | 88.9 | 18 / 35 | 4793 |
| 3 | 1 | 68.7 | 87.6 | 15 / 35 | 5224 |
| 4 | 1 | 70.8 | 94.3 | 22 / 35 | 5323 |
| 5 | 2 | 67.2 | 84.4 | 11 / 35 | 4551 |
| 6 | 1 | 68.2 | 88.9 | 12 / 35 | 4774 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 73 | 34% |
| kvk.HebusLeTroll 0.35 | 41 | 73% |
| jlm.javaDisturbance 0.59 | 30 | 80% |
| bigpete.Stewie 1.0 | 9 | 89% |
| yk.JahRoslav 1.1 | 2 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 1013. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 58 | 47% | 89 |
| kvk.HebusLeTroll 0.35 | 34 | 28% | 54 |
| jlm.javaDisturbance 0.59 | 19 | 15% | 42 |
| bigpete.Stewie 1.0 | 6 | 5% | 17 |
| yk.JahRoslav 1.1 | 2 | 2% | 3 |
| tad.Dalek98 0.98 | 1 | 1% | 2 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 2 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 162941 melee ticks, 51005 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 40 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 53579 sent, 48711 reached their opponent, 8055 virtual hits (16.5% of those reached).

## Melee bench: F23

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 473 over 6 battles (78.8 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 94.9 | 169 / 210 | 1.46 | 21.5% | 35577 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.0 | 21.5% | 169 |
| pe.SandboxLump 1.52 | 2.0 | 16.6% | 25 |
| cre.Karolos 0.32 | 3.0 | 13.9% | 10 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.0% | 0 |
| stelo.RamTrackSurfer 1.2 | 5.3 | 9.2% | 4 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.0 | 8.6% | 1 |
| cw.megas.Blade 0.8 | 6.5 | 8.5% | 0 |
| sample.Walls 1.0 | 7.8 | 7.5% | 1 |
| cli.WasteOfAmmo 1.0 | 9.2 | 2.6% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 95.6 | 27 / 35 | 6032 |
| 2 | 1 | 72.5 | 94.6 | 30 / 35 | 5825 |
| 3 | 1 | 72.9 | 96.5 | 27 / 35 | 5995 |
| 4 | 1 | 73.0 | 94.0 | 32 / 35 | 5945 |
| 5 | 1 | 72.2 | 94.6 | 26 / 35 | 5560 |
| 6 | 1 | 73.2 | 94.0 | 27 / 35 | 6220 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 103 | 87% |
| cre.Karolos 0.32 | 59 | 95% |
| stelo.RamTrackSurfer 1.2 | 10 | 70% |
| stelo.AreaTargetingBot 1.1 | 6 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 83% |
| sample.Walls 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 25 | 56% | 105 |
| cre.Karolos 0.32 | 11 | 24% | 57 |
| stelo.RamTrackSurfer 1.2 | 4 | 9% | 14 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 2% | 7 |
| stelo.AreaTargetingBot 1.1 | 0 | 0% | 17 |
| cw.megas.Blade 0.8 | 0 | 0% | 4 |
| sample.Walls 1.0 | 0 | 0% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 123940 melee ticks, 52024 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 95 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 95 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 39478 sent, 34639 reached their opponent, 10334 virtual hits (29.8% of those reached).

## Melee bench: F24

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 527 over 6 battles (87.8 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 80.7 | 72 / 210 | 2.74 | 16.4% | 23693 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.0 | 16.4% | 72 |
| rz.GlowBlowMelee 1.4 | 2.5 | 14.1% | 44 |
| florent.XSeries.X2 0.12 | 3.2 | 13.0% | 27 |
| davidalves.Phoenix 0.54 | 3.7 | 12.7% | 45 |
| pedersen.Ugluk 1.1.1 | 4.7 | 11.6% | 12 |
| oog.melee.Corsair 1.0 | 6.0 | 9.9% | 7 |
| stelo.SoJNanoMelee 1.1 | 7.2 | 6.8% | 3 |
| lunchie.Lunchbox 0.93 | 8.3 | 5.8% | 0 |
| as.FrankTheTank 1.3 | 9.0 | 5.1% | 0 |
| evd.X1 0.01 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 80.3 | 10 / 35 | 3765 |
| 2 | 1 | 64.7 | 76.5 | 12 / 35 | 4142 |
| 3 | 1 | 65.7 | 82.9 | 13 / 35 | 4076 |
| 4 | 1 | 67.0 | 85.4 | 16 / 35 | 4132 |
| 5 | 1 | 64.1 | 79.7 | 8 / 35 | 3806 |
| 6 | 1 | 64.6 | 79.4 | 13 / 35 | 3772 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.Phoenix 0.54 | 27 | 26% |
| rz.GlowBlowMelee 1.4 | 27 | 56% |
| florent.XSeries.X2 0.12 | 27 | 70% |
| pedersen.Ugluk 1.1.1 | 17 | 76% |
| oog.melee.Corsair 1.0 | 16 | 88% |
| stelo.SoJNanoMelee 1.1 | 2 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 752. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 32 | 23% | 38 |
| rz.GlowBlowMelee 1.4 | 31 | 22% | 50 |
| florent.XSeries.X2 0.12 | 30 | 21% | 48 |
| pedersen.Ugluk 1.1.1 | 23 | 16% | 34 |
| oog.melee.Corsair 1.0 | 10 | 7% | 24 |
| stelo.SoJNanoMelee 1.1 | 4 | 3% | 5 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 5 |
| evd.X1 0.01 | 3 | 2% | 4 |
| as.FrankTheTank 1.3 | 2 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 139905 melee ticks, 33510 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 55 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 47535 sent, 42425 reached their opponent, 8041 virtual hits (19.0% of those reached).

## Melee bench: F25

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 410 over 6 battles (68.3 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 88.0 | 131 / 210 | 2.08 | 18.6% | 24427 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.0 | 18.6% | 131 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 13.2% | 13 |
| voidious.mini.BrokenSword 2.0.3 | 3.0 | 13.2% | 16 |
| jdw.Hurricane 1.4 | 3.7 | 12.1% | 19 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.3% | 12 |
| ds.Oo 2.2 | 5.5 | 9.0% | 10 |
| awesomeness.Elite 1.0 | 7.3 | 7.1% | 2 |
| gjr.Cephalosporin 0.1 | 7.8 | 6.7% | 4 |
| adt.Ar2 1.1 | 8.7 | 6.3% | 3 |
| amk.ChumbaMini 0.2 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 86.3 | 21 / 35 | 3978 |
| 2 | 1 | 67.5 | 87.9 | 19 / 35 | 3858 |
| 3 | 1 | 68.6 | 89.8 | 23 / 35 | 4173 |
| 4 | 1 | 68.3 | 87.3 | 24 / 35 | 4195 |
| 5 | 1 | 68.1 | 86.0 | 22 / 35 | 4241 |
| 6 | 1 | 68.7 | 90.8 | 22 / 35 | 3982 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 49 | 90% |
| jdw.Hurricane 1.4 | 35 | 80% |
| voidious.micro.BlitzBat 1.05 | 35 | 86% |
| gre.svman4.Morfeas 1.4.1 | 18 | 72% |
| ds.Oo 2.2 | 14 | 86% |
| gjr.Cephalosporin 0.1 | 3 | 67% |
| adt.Ar2 1.1 | 2 | 0% |
| awesomeness.Elite 1.0 | 2 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 26 | 32% | 48 |
| voidious.mini.BrokenSword 2.0.3 | 14 | 17% | 55 |
| jdw.Hurricane 1.4 | 13 | 16% | 32 |
| ds.Oo 2.2 | 9 | 11% | 26 |
| gre.svman4.Morfeas 1.4.1 | 7 | 9% | 25 |
| adt.Ar2 1.1 | 6 | 7% | 11 |
| awesomeness.Elite 1.0 | 2 | 2% | 6 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 5 |
| amk.ChumbaMini 0.2 | 1 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 129821 melee ticks, 31947 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 32 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 46862 sent, 42064 reached their opponent, 7176 virtual hits (17.1% of those reached).

## Melee bench: F26

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 452 over 6 battles (75.3 per battle, most in one battle 144). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 91.5 | 139 / 210 | 1.77 | 20.3% | 36704 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.0 | 20.3% | 139 |
| ak.Fermat 2.0 | 2.0 | 14.9% | 35 |
| lrem.Spectre 0.4.4 | 3.5 | 12.0% | 8 |
| shu.nitro.LENIN .T34 | 3.5 | 11.9% | 18 |
| js.PinBall 1.6 | 5.3 | 10.5% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 5.7 | 9.7% | 5 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 8.4% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.4% | 2 |
| sample.SpinBot 1.0 | 9.0 | 4.4% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 93.7 | 26 / 35 | 6307 |
| 2 | 1 | 71.6 | 92.7 | 25 / 35 | 6275 |
| 3 | 1 | 71.4 | 92.7 | 23 / 35 | 6130 |
| 4 | 1 | 70.9 | 90.5 | 21 / 35 | 6030 |
| 5 | 1 | 68.4 | 84.4 | 17 / 35 | 5571 |
| 6 | 1 | 72.2 | 94.9 | 27 / 35 | 6391 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 65 | 72% |
| shu.nitro.LENIN .T34 | 37 | 97% |
| lrem.Spectre 0.4.4 | 37 | 89% |
| js.PinBall 1.6 | 10 | 90% |
| jaybot.adv.bots.JayBot 2.0 | 9 | 78% |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 100% |
| gh.mini.GrubbmOne 1.0 | 2 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 29 | 39% | 72 |
| lrem.Spectre 0.4.4 | 13 | 18% | 43 |
| jaybot.adv.bots.JayBot 2.0 | 8 | 11% | 16 |
| shu.nitro.LENIN .T34 | 7 | 9% | 45 |
| js.PinBall 1.6 | 7 | 9% | 16 |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 5% | 13 |
| gh.mini.GrubbmOne 1.0 | 2 | 3% | 4 |
| sample.SpinBot 1.0 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 153757 melee ticks, 46823 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 23 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 23 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 2.

Targeting waves (204 rounds): 51111 sent, 46225 reached their opponent, 11809 virtual hits (25.5% of those reached).

## Melee bench: F27

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 428 over 6 battles (71.3 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 96.1 | 173 / 210 | 1.35 | 21.4% | 33155 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.0 | 21.4% | 173 |
| mk.Alpha 0.2.1 | 2.0 | 14.2% | 22 |
| EH.Eagle 1.0.6 | 3.7 | 10.5% | 1 |
| sheldor.melee.nano.TestMelee 0.1 | 4.7 | 9.6% | 6 |
| techdude.kombat.FlamingKombat 1.5 | 5.5 | 9.0% | 2 |
| wee.Gem 1.8.4 | 5.7 | 8.9% | 2 |
| throxbot.ThroxBot 0.1 | 7.0 | 8.1% | 2 |
| joe.ADinosaur 1.0 | 8.2 | 6.4% | 1 |
| cs.Grudge 1.0 | 8.7 | 6.4% | 0 |
| caimano.Furia_Ceca 0.22 | 8.7 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 94.3 | 25 / 35 | 5520 |
| 2 | 1 | 72.1 | 97.5 | 31 / 35 | 5721 |
| 3 | 1 | 71.3 | 95.2 | 28 / 35 | 5473 |
| 4 | 1 | 71.2 | 95.9 | 28 / 35 | 5336 |
| 5 | 1 | 71.4 | 97.8 | 30 / 35 | 5141 |
| 6 | 1 | 72.4 | 96.2 | 31 / 35 | 5964 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 118 | 92% |
| EH.Eagle 1.0.6 | 26 | 96% |
| throxbot.ThroxBot 0.1 | 14 | 86% |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 75% |
| techdude.kombat.FlamingKombat 1.5 | 10 | 80% |
| wee.Gem 1.8.4 | 7 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 50% |

Hadur died in 40 of 210 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 17 | 43% | 94 |
| sheldor.melee.nano.TestMelee 0.1 | 5 | 13% | 24 |
| throxbot.ThroxBot 0.1 | 5 | 13% | 17 |
| EH.Eagle 1.0.6 | 4 | 10% | 43 |
| techdude.kombat.FlamingKombat 1.5 | 3 | 8% | 12 |
| joe.ADinosaur 1.0 | 2 | 5% | 6 |
| caimano.Furia_Ceca 0.22 | 1 | 3% | 3 |
| wee.Gem 1.8.4 | 0 | 0% | 10 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 137902 melee ticks, 51962 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 41 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 44394 sent, 39486 reached their opponent, 9661 virtual hits (24.5% of those reached).

## Melee bench: F28

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 558 over 6 battles (93.0 per battle, most in one battle 146). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 88.6 | 134 / 210 | 2.02 | 18.5% | 24129 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.0 | 18.5% | 134 |
| kid.test.NightFox .2 | 2.0 | 15.3% | 37 |
| uji.Antique 1.0 | 3.0 | 13.1% | 23 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.3% | 2 |
| qohnil.blot.BlotBot 3.61 | 4.8 | 9.9% | 6 |
| amk.ChumbaWumba 0.3 | 6.0 | 8.0% | 3 |
| ahr.ice.Ice 1.0.2 | 6.5 | 8.0% | 4 |
| matt.advanced.Katana 1.0 | 8.7 | 6.1% | 1 |
| stelo.PianistNano 1.2 | 9.0 | 5.4% | 0 |
| stelo.Lifestealer 1.0 | 9.3 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 82.2 | 18 / 35 | 3993 |
| 2 | 1 | 68.3 | 90.2 | 21 / 35 | 4068 |
| 3 | 1 | 67.7 | 88.9 | 21 / 35 | 3736 |
| 4 | 1 | 69.4 | 91.4 | 27 / 35 | 4332 |
| 5 | 1 | 68.6 | 90.2 | 24 / 35 | 4151 |
| 6 | 1 | 67.8 | 88.9 | 23 / 35 | 3849 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| uji.Antique 1.0 | 60 | 85% |
| kid.test.NightFox .2 | 60 | 90% |
| qohnil.blot.BlotBot 3.61 | 12 | 83% |
| ahr.ice.Ice 1.0.2 | 8 | 88% |
| pfvicm.Sobieski 7.2.3b | 8 | 75% |
| amk.ChumbaWumba 0.3 | 4 | 100% |
| matt.advanced.Katana 1.0 | 2 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 674. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 26 | 32% | 71 |
| kid.test.NightFox .2 | 24 | 30% | 59 |
| pfvicm.Sobieski 7.2.3b | 10 | 12% | 18 |
| stelo.Lifestealer 1.0 | 5 | 6% | 5 |
| ahr.ice.Ice 1.0.2 | 4 | 5% | 16 |
| amk.ChumbaWumba 0.3 | 4 | 5% | 8 |
| qohnil.blot.BlotBot 3.61 | 3 | 4% | 26 |
| matt.advanced.Katana 1.0 | 1 | 1% | 5 |
| stelo.PianistNano 1.2 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 130214 melee ticks, 31827 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 23 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 23 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 2.

Targeting waves (203 rounds): 44125 sent, 39354 reached their opponent, 5687 virtual hits (14.5% of those reached).

## Melee bench: F29

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 246 over 6 battles (41.0 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 88.2 | 100 / 210 | 2.06 | 18.8% | 27932 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.0 | 18.8% | 100 |
| zyx.mega.YersiniaPestis 3.1 | 2.2 | 15.5% | 52 |
| deewiant.Anomaly 0.2 | 2.8 | 14.5% | 40 |
| jok.PheonixM 0.1.2 | 4.5 | 11.2% | 10 |
| myl.micro.Troodon 1.10 | 4.5 | 11.6% | 7 |
| ph.melee.ArcherME 0.3 | 6.0 | 7.8% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.3 | 6.4% | 1 |
| DBall.Anarchy 0.1 | 8.2 | 5.3% | 1 |
| ap.Frederick 1.1 | 9.0 | 4.7% | 0 |
| jangs.ns51 1.0 | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 88.6 | 20 / 35 | 4654 |
| 2 | 1 | 69.5 | 89.2 | 15 / 35 | 4896 |
| 3 | 1 | 69.6 | 90.8 | 17 / 35 | 4537 |
| 4 | 1 | 68.1 | 85.7 | 14 / 35 | 4534 |
| 5 | 1 | 68.6 | 87.6 | 16 / 35 | 4727 |
| 6 | 1 | 68.8 | 87.3 | 18 / 35 | 4584 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 55 | 58% |
| deewiant.Anomaly 0.2 | 52 | 54% |
| jok.PheonixM 0.1.2 | 20 | 90% |
| myl.micro.Troodon 1.10 | 19 | 84% |
| ap.Frederick 1.1 | 4 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 1007. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 46 | 41% | 80 |
| zyx.mega.YersiniaPestis 3.1 | 36 | 32% | 65 |
| myl.micro.Troodon 1.10 | 14 | 13% | 27 |
| jok.PheonixM 0.1.2 | 12 | 11% | 29 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 2% | 2 |
| ph.melee.ArcherME 0.3 | 1 | 1% | 3 |
| DBall.Anarchy 0.1 | 0 | 0% | 2 |
| jangs.ns51 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 175402 melee ticks, 48835 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 586 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 319 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 57031 sent, 52215 reached their opponent, 8206 virtual hits (15.7% of those reached).

## Melee bench: F30

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 663 over 6 battles (110.5 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 77.8 | 51 / 210 | 3.00 | 15.5% | 24251 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.2 | 15.5% | 51 |
| catcat20.Matcha 0.006 | 2.7 | 13.7% | 47 |
| darkcanuck.B26354 1.06 | 2.7 | 13.8% | 53 |
| oog.melee.Capulet 1.2 | 4.2 | 12.5% | 30 |
| stelo.PastFuture 2.3.2 | 4.3 | 11.6% | 13 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.3% | 7 |
| tripphippy.Alice 1.1 | 7.5 | 7.6% | 5 |
| fowl3628800.LightningBolt 2.6.0 | 8.2 | 6.8% | 5 |
| ntc.Opposite 1.5 | 8.3 | 6.7% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 80.0 | 9 / 35 | 4229 |
| 2 | 1 | 64.0 | 79.0 | 10 / 35 | 3883 |
| 3 | 1 | 63.9 | 76.2 | 9 / 35 | 4246 |
| 4 | 2 | 62.5 | 75.9 | 4 / 35 | 3853 |
| 5 | 1 | 64.2 | 79.7 | 8 / 35 | 3991 |
| 6 | 1 | 63.6 | 75.9 | 11 / 35 | 4049 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 29 | 34% |
| darkcanuck.B26354 1.06 | 27 | 33% |
| oog.melee.Capulet 1.2 | 24 | 42% |
| stelo.PastFuture 2.3.2 | 13 | 54% |
| intruder.PrairieWolf 2.61 | 7 | 57% |
| tripphippy.Alice 1.1 | 6 | 83% |
| fowl3628800.LightningBolt 2.6.0 | 5 | 100% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 910. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 41 | 25% | 50 |
| catcat20.Matcha 0.006 | 36 | 22% | 50 |
| oog.melee.Capulet 1.2 | 31 | 19% | 44 |
| stelo.PastFuture 2.3.2 | 29 | 18% | 39 |
| intruder.PrairieWolf 2.61 | 10 | 6% | 10 |
| tripphippy.Alice 1.1 | 7 | 4% | 10 |
| fowl3628800.LightningBolt 2.6.0 | 3 | 2% | 5 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |
| ntc.Opposite 1.5 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 162582 melee ticks, 34464 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 48 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 52720 sent, 47736 reached their opponent, 8204 virtual hits (17.2% of those reached).

## Melee bench: F31

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 734 over 6 battles (122.3 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 79.1 | 57 / 210 | 2.88 | 15.7% | 22254 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.2 | 17.3% | 92 |
| hadur2.Hadur 3.18oe | 1.8 | 15.7% | 57 |
| gh.mini.Griezel 0.2 | 3.0 | 13.5% | 43 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.3% | 8 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 10.5% | 5 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.8% | 4 |
| timmit.nano.TimDog 0.33 | 7.2 | 7.0% | 1 |
| fm.mammillarias 1.3 | 8.5 | 5.6% | 0 |
| tlp.ThreeLeggedPig 1 | 9.2 | 5.1% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.2 | 75.6 | 2 / 35 | 3280 |
| 2 | 2 | 63.8 | 78.7 | 8 / 35 | 3697 |
| 3 | 2 | 63.4 | 75.2 | 6 / 35 | 3849 |
| 4 | 2 | 66.2 | 84.8 | 12 / 35 | 3941 |
| 5 | 2 | 65.5 | 82.2 | 16 / 35 | 3580 |
| 6 | 1 | 64.8 | 78.1 | 13 / 35 | 3907 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 45 | 36% |
| gh.mini.Griezel 0.2 | 37 | 51% |
| d414.nano.Quantum 1.0.0 | 14 | 79% |
| spinnercat.micro.Tyger 0.1 | 8 | 88% |
| gh.nano.Grofvuil 0.2 | 4 | 50% |
| timmit.nano.TimDog 0.33 | 2 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 55 | 35% | 71 |
| gh.mini.Griezel 0.2 | 49 | 31% | 72 |
| d414.nano.Quantum 1.0.0 | 20 | 13% | 25 |
| spinnercat.micro.Tyger 0.1 | 13 | 8% | 22 |
| gh.nano.Grofvuil 0.2 | 7 | 4% | 10 |
| timmit.nano.TimDog 0.33 | 5 | 3% | 6 |
| fm.mammillarias 1.3 | 3 | 2% | 3 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 154482 melee ticks, 34002 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 40 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 51154 sent, 46026 reached their opponent, 7505 virtual hits (16.3% of those reached).

## Melee bench: F32

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 457 over 6 battles (76.2 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 88.6 | 114 / 210 | 2.03 | 18.2% | 26758 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.0 | 18.2% | 114 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.2% | 59 |
| apc.botM 3.0 | 3.3 | 11.7% | 15 |
| vjik.UnViolation 1.1 | 3.8 | 10.3% | 9 |
| lxx.ConceptA 0.8 | 5.0 | 9.4% | 1 |
| bayen.UbaMicro 1.4 | 6.2 | 8.4% | 1 |
| yk.JahMicro 1.0 | 7.5 | 7.3% | 4 |
| panzer.Panzer 0.2 | 8.0 | 7.3% | 1 |
| conscience.Electron 1.3g | 8.3 | 6.6% | 1 |
| donjezza.Jezza 1.0 | 9.8 | 5.5% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 89.8 | 21 / 35 | 4604 |
| 2 | 1 | 67.3 | 89.5 | 17 / 35 | 4427 |
| 3 | 1 | 67.7 | 87.0 | 22 / 35 | 4648 |
| 4 | 1 | 67.4 | 89.5 | 19 / 35 | 4389 |
| 5 | 1 | 66.5 | 88.9 | 15 / 35 | 4252 |
| 6 | 1 | 67.2 | 86.7 | 20 / 35 | 4438 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 86 | 55% |
| apc.botM 3.0 | 30 | 87% |
| vjik.UnViolation 1.1 | 13 | 69% |
| bayen.UbaMicro 1.4 | 11 | 100% |
| lxx.ConceptA 0.8 | 9 | 89% |
| yk.JahMicro 1.0 | 6 | 67% |
| donjezza.Jezza 1.0 | 6 | 67% |
| panzer.Panzer 0.2 | 5 | 80% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 828. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 42 | 42% | 85 |
| lxx.ConceptA 0.8 | 16 | 16% | 27 |
| apc.botM 3.0 | 13 | 13% | 39 |
| vjik.UnViolation 1.1 | 7 | 7% | 24 |
| yk.JahMicro 1.0 | 7 | 7% | 11 |
| conscience.Electron 1.3g | 4 | 4% | 5 |
| bayen.UbaMicro 1.4 | 3 | 3% | 12 |
| donjezza.Jezza 1.0 | 3 | 3% | 4 |
| panzer.Panzer 0.2 | 2 | 2% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 126533 melee ticks, 50640 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 48 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 43330 sent, 38517 reached their opponent, 6844 virtual hits (17.8% of those reached).

## Melee bench: F33

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 686 over 6 battles (114.3 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 84.8 | 100 / 210 | 2.37 | 18.1% | 27230 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.2 | 18.1% | 100 |
| maribo.Quester 0.3 | 2.0 | 15.7% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.9% | 23 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 11.0% | 17 |
| labg.Cataclysm 2.05 | 4.8 | 10.8% | 21 |
| baal.nano.N 1.42 | 6.0 | 9.2% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 8.8% | 3 |
| zyx.micro.Ant 1.1 | 8.2 | 5.6% | 2 |
| sanja.First 0.1 | 8.8 | 4.9% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 85.7 | 17 / 35 | 4441 |
| 2 | 1 | 67.9 | 85.1 | 16 / 35 | 4545 |
| 3 | 1 | 67.9 | 85.4 | 16 / 35 | 4462 |
| 4 | 1 | 70.7 | 91.1 | 26 / 35 | 5280 |
| 5 | 2 | 65.5 | 80.3 | 9 / 35 | 4117 |
| 6 | 1 | 66.9 | 81.3 | 16 / 35 | 4385 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 40 | 68% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 34 | 71% |
| gre.svman4.Leonidas 1.3.2 | 25 | 96% |
| labg.Cataclysm 2.05 | 14 | 86% |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 75% |
| baal.nano.N 1.42 | 3 | 100% |
| zyx.micro.Ant 1.1 | 2 | 50% |
| sanja.First 0.1 | 2 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 988. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 41 | 35% | 71 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 19% | 46 |
| gre.svman4.Leonidas 1.3.2 | 19 | 16% | 34 |
| kinsen.melee.Angsaichmophobia 1.8c | 14 | 12% | 17 |
| labg.Cataclysm 2.05 | 10 | 8% | 24 |
| baal.nano.N 1.42 | 4 | 3% | 12 |
| zyx.micro.Ant 1.1 | 3 | 3% | 3 |
| sanja.First 0.1 | 0 | 0% | 3 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 175086 melee ticks, 43765 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 82 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 82 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 55862 sent, 51085 reached their opponent, 7702 virtual hits (15.1% of those reached).

## Melee bench: F34

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 334 over 6 battles (55.7 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 86.5 | 80 / 210 | 2.21 | 17.9% | 29528 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.0 | 17.9% | 80 |
| stelo.Spread 0.9 | 2.3 | 15.9% | 56 |
| kid.Gladiator .7.2 | 2.7 | 16.0% | 50 |
| jcs.Seth 1.8 | 4.3 | 11.0% | 16 |
| tcf.Reach 3 | 4.7 | 10.8% | 5 |
| cli.Dancer 1.1 | 6.0 | 9.4% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 8.0% | 3 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.8% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.5% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 86.7 | 15 / 35 | 4821 |
| 2 | 1 | 69.7 | 89.8 | 19 / 35 | 5101 |
| 3 | 1 | 65.7 | 82.5 | 11 / 35 | 4256 |
| 4 | 1 | 67.5 | 84.4 | 9 / 35 | 4950 |
| 5 | 1 | 68.8 | 87.9 | 14 / 35 | 5047 |
| 6 | 1 | 68.5 | 87.6 | 12 / 35 | 5353 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 57 | 44% |
| kid.Gladiator .7.2 | 46 | 59% |
| jcs.Seth 1.8 | 19 | 63% |
| tcf.Reach 3 | 10 | 90% |
| ratosh.Wesco 1.4 | 5 | 40% |
| cli.Dancer 1.1 | 5 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 1061. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 57 | 43% | 82 |
| kid.Gladiator .7.2 | 46 | 35% | 70 |
| jcs.Seth 1.8 | 14 | 11% | 27 |
| tcf.Reach 3 | 8 | 6% | 16 |
| cli.Dancer 1.1 | 3 | 2% | 9 |
| ratosh.Wesco 1.4 | 2 | 2% | 5 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 170511 melee ticks, 54392 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 86 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 86 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 53716 sent, 48842 reached their opponent, 8522 virtual hits (17.4% of those reached).

## Melee bench: F35

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 698 over 6 battles (116.3 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 82.2 | 37 / 210 | 2.60 | 15.8% | 22982 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.5% | 143 |
| hadur2.Hadur 3.18oe | 2.0 | 15.8% | 37 |
| gh.mini.Gruwel 0.9 | 3.5 | 12.3% | 21 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.2 | 12.1% | 6 |
| rz.HawkOnFire 0.1 | 4.3 | 11.4% | 1 |
| wit.Chuliath 1.0 | 6.0 | 7.1% | 2 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.3 | 6.1% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.7 | 6.1% | 1 |
| stelo.MyAgileRobot 0.2 | 9.2 | 4.8% | 0 |
| dans.Cinnamon 1.2 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.8 | 81.6 | 9 / 35 | 3868 |
| 2 | 2 | 64.2 | 80.6 | 4 / 35 | 3819 |
| 3 | 2 | 64.0 | 79.4 | 6 / 35 | 3800 |
| 4 | 2 | 66.0 | 86.0 | 8 / 35 | 3937 |
| 5 | 2 | 65.5 | 84.8 | 4 / 35 | 4006 |
| 6 | 2 | 64.1 | 81.0 | 6 / 35 | 3552 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 94 | 20% |
| gh.mini.Gruwel 0.9 | 12 | 50% |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 75% |
| rz.HawkOnFire 0.1 | 3 | 67% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 100% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |
| wit.Chuliath 1.0 | 1 | 0% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 180 of 210 rounds, at a mean tick of 921. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 102 | 57% | 123 |
| gh.mini.Gruwel 0.9 | 23 | 13% | 29 |
| dmh.robocode.robot.BlackDeath 9.2 | 22 | 12% | 25 |
| rz.HawkOnFire 0.1 | 20 | 11% | 24 |
| wit.Chuliath 1.0 | 3 | 2% | 3 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 3 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 2 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 1% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 145932 melee ticks, 45187 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 35 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 45919 sent, 40939 reached their opponent, 6655 virtual hits (16.3% of those reached).

## Melee bench: F36

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 235 over 6 battles (39.2 per battle, most in one battle 112). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 92.3 | 167 / 210 | 1.70 | 20.7% | 31864 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.0 | 20.7% | 167 |
| alpha.RainingFire 1.0 | 2.3 | 12.4% | 9 |
| bzdp.Pansy 2.1 | 3.3 | 11.9% | 11 |
| mz.Cork 0.1 | 3.5 | 11.7% | 9 |
| bvh.micro.Freya 0.3 | 5.5 | 10.1% | 6 |
| m3thos.Eva02 0.7.1 | 6.0 | 9.6% | 4 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.4% | 3 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 5.4% | 0 |
| dl.BetterWalls 1.0 | 9.0 | 5.0% | 1 |
| sample.MyFirstRobot 1.0 | 9.7 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 87.0 | 26 / 35 | 5229 |
| 2 | 1 | 71.6 | 93.0 | 31 / 35 | 5544 |
| 3 | 1 | 70.6 | 91.7 | 28 / 35 | 5019 |
| 4 | 1 | 71.0 | 91.4 | 27 / 35 | 5253 |
| 5 | 1 | 72.1 | 97.8 | 29 / 35 | 5517 |
| 6 | 1 | 70.8 | 92.7 | 26 / 35 | 5302 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.Cork 0.1 | 44 | 89% |
| alpha.RainingFire 1.0 | 43 | 91% |
| bzdp.Pansy 2.1 | 41 | 95% |
| bvh.micro.Freya 0.3 | 25 | 92% |
| bvh.mini.Fenrir 0.39 | 12 | 92% |
| m3thos.Eva02 0.7.1 | 8 | 88% |
| sample.MyFirstRobot 1.0 | 7 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 46 of 210 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 9 | 20% | 46 |
| bvh.micro.Freya 0.3 | 9 | 20% | 26 |
| mz.Cork 0.1 | 7 | 15% | 41 |
| bzdp.Pansy 2.1 | 6 | 13% | 46 |
| bvh.mini.Fenrir 0.39 | 6 | 13% | 17 |
| m3thos.Eva02 0.7.1 | 3 | 7% | 18 |
| squidM.TentalceMeleeNano 1.1 | 3 | 7% | 4 |
| dl.BetterWalls 1.0 | 2 | 4% | 8 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 138590 melee ticks, 48589 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 63 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 48893 sent, 44338 reached their opponent, 9465 virtual hits (21.3% of those reached).

## Melee bench: F37

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 675 over 6 battles (112.5 per battle, most in one battle 147). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 88.3 | 161 / 210 | 2.05 | 19.2% | 33088 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.0 | 19.2% | 161 |
| germ.TheMind .2 | 3.5 | 9.9% | 3 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.2 | 9.9% | 5 |
| agrach.Dalek 1.0 | 4.2 | 9.6% | 9 |
| EBBU.Sim2 1.02 | 4.7 | 9.4% | 8 |
| stelo.UntouchableNano 1.3 | 5.2 | 9.4% | 17 |
| lmk.ACPFinal 0.1 | 7.3 | 8.5% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 7.7 | 8.4% | 1 |
| mb.Beast 0.1 | 8.3 | 8.0% | 2 |
| skm.Ryubot 1.0 | 9.0 | 7.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 90.5 | 28 / 35 | 5291 |
| 2 | 1 | 67.9 | 87.0 | 27 / 35 | 5497 |
| 3 | 1 | 70.1 | 93.7 | 29 / 35 | 6064 |
| 4 | 1 | 69.1 | 92.1 | 29 / 35 | 5378 |
| 5 | 1 | 67.0 | 84.1 | 24 / 35 | 5428 |
| 6 | 1 | 66.9 | 82.5 | 24 / 35 | 5430 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 34 | 94% |
| stelo.UntouchableNano 1.3 | 27 | 81% |
| com.syncleus.robocode.Dreadnaught 0.1 | 22 | 100% |
| germ.TheMind .2 | 22 | 95% |
| mb.Beast 0.1 | 17 | 100% |
| lmk.ACPFinal 0.1 | 16 | 100% |
| EBBU.Sim2 1.02 | 15 | 100% |
| skm.Ryubot 1.0 | 15 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 455. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 18 | 33% | 22 |
| stelo.UntouchableNano 1.3 | 7 | 13% | 24 |
| com.syncleus.robocode.Dreadnaught 0.1 | 6 | 11% | 30 |
| lmk.ACPFinal 0.1 | 6 | 11% | 28 |
| agrach.Dalek 1.0 | 5 | 9% | 49 |
| germ.TheMind .2 | 4 | 7% | 18 |
| EBBU.Sim2 1.02 | 1 | 2% | 17 |
| mb.Beast 0.1 | 1 | 2% | 12 |
| skm.Ryubot 1.0 | 1 | 2% | 8 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 95244 melee ticks, 28439 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 49 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 32618 sent, 28139 reached their opponent, 8358 virtual hits (29.7% of those reached).

## Melee bench: F38

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 133 over 6 battles (22.2 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 87.2 | 103 / 210 | 2.15 | 18.1% | 27387 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.0 | 18.1% | 103 |
| justin.Mallais 14.0 | 2.0 | 16.1% | 64 |
| bvh.mini.Freya 0.55 | 3.2 | 12.7% | 13 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.3% | 18 |
| cs.Wren 1.0 | 4.5 | 10.7% | 4 |
| kdf.KoulDestroyer 1.0 | 6.2 | 9.3% | 7 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.0 | 7.5% | 0 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.8 | 6.2% | 1 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.6% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 87.3 | 19 / 35 | 4675 |
| 2 | 1 | 66.7 | 85.1 | 13 / 35 | 4403 |
| 3 | 1 | 67.7 | 85.1 | 20 / 35 | 4434 |
| 4 | 1 | 67.7 | 87.6 | 17 / 35 | 4638 |
| 5 | 1 | 67.1 | 85.7 | 13 / 35 | 4493 |
| 6 | 1 | 69.4 | 92.4 | 21 / 35 | 4744 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 68 | 63% |
| bts.mega.Gnarly 1.4 | 24 | 63% |
| bvh.mini.Freya 0.55 | 22 | 73% |
| cs.Wren 1.0 | 17 | 100% |
| kdf.KoulDestroyer 1.0 | 13 | 69% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 36 | 34% | 80 |
| bvh.mini.Freya 0.55 | 27 | 25% | 39 |
| bts.mega.Gnarly 1.4 | 15 | 14% | 30 |
| cs.Wren 1.0 | 11 | 10% | 30 |
| kdf.KoulDestroyer 1.0 | 11 | 10% | 15 |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 4% | 6 |
| bzdp.BoxCar 2.0 | 2 | 2% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 6 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 2 |

Posture (Hadur's M records, 200 rounds): 135977 melee ticks, 39647 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 453 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 241 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 45541 sent, 40395 reached their opponent, 8600 virtual hits (21.3% of those reached).

## Melee bench: F39

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 690 over 6 battles (115.0 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 85.7 | 92 / 210 | 2.29 | 17.9% | 29111 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.0 | 17.9% | 92 |
| bvh.fry.Freya 0.82 | 2.3 | 14.8% | 17 |
| az.Ololobot 0.2.4 | 2.7 | 13.9% | 65 |
| catcat20.Lambda 0.024 | 4.0 | 11.4% | 28 |
| winamp32.micro.MicroMacro 1.0 | 5.0 | 8.9% | 3 |
| gimp.GimpBot 0.1 | 6.8 | 7.6% | 2 |
| stelo.SoRobotNanoMelee 1.2 | 7.0 | 7.4% | 2 |
| apollokidd.ApolloKidd 0.9 | 7.2 | 7.4% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.8% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 84.8 | 15 / 35 | 4859 |
| 2 | 1 | 67.7 | 86.3 | 21 / 35 | 4775 |
| 3 | 1 | 67.6 | 88.3 | 14 / 35 | 4914 |
| 4 | 1 | 68.1 | 89.2 | 16 / 35 | 4916 |
| 5 | 1 | 65.8 | 81.9 | 11 / 35 | 4756 |
| 6 | 1 | 67.0 | 83.8 | 15 / 35 | 4891 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 51 | 41% |
| bvh.fry.Freya 0.82 | 48 | 83% |
| catcat20.Lambda 0.024 | 25 | 76% |
| winamp32.micro.MicroMacro 1.0 | 6 | 83% |
| stelo.SoRobotNanoMelee 1.2 | 6 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 0% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 1026. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 41 | 33% | 71 |
| bvh.fry.Freya 0.82 | 41 | 33% | 68 |
| catcat20.Lambda 0.024 | 21 | 17% | 40 |
| apollokidd.ApolloKidd 0.9 | 5 | 4% | 8 |
| gimp.GimpBot 0.1 | 5 | 4% | 5 |
| stelo.SoRobotNanoMelee 1.2 | 2 | 2% | 6 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 6 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 2% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 4 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 169660 melee ticks, 45610 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 62 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 53838 sent, 48938 reached their opponent, 8594 virtual hits (17.6% of those reached).

## Melee bench: F40

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 758 over 6 battles (126.3 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 87.1 | 123 / 210 | 2.16 | 19.0% | 29147 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.0 | 19.0% | 123 |
| kawigi.mini.Coriantumr 1.1 | 2.2 | 14.7% | 34 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 13.1% | 26 |
| mz.AntiGrav 1.0 | 4.3 | 11.1% | 8 |
| Polkwane.SmashMelee 1.0 | 4.7 | 10.9% | 13 |
| alpha.BlackIce 1.0 | 6.3 | 8.7% | 2 |
| stelo.Randomness 1.0 | 6.5 | 8.6% | 5 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.4% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 4.2% | 0 |
| sample.Corners 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 88.3 | 23 / 35 | 5008 |
| 2 | 1 | 69.1 | 88.9 | 20 / 35 | 4660 |
| 3 | 1 | 68.2 | 83.2 | 16 / 35 | 4809 |
| 4 | 1 | 70.2 | 89.5 | 23 / 35 | 5121 |
| 5 | 1 | 69.4 | 87.6 | 23 / 35 | 4893 |
| 6 | 1 | 68.1 | 85.1 | 18 / 35 | 4656 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 55 | 75% |
| kano.gamma.KanoGamma 1.8 | 41 | 76% |
| mz.AntiGrav 1.0 | 24 | 96% |
| Polkwane.SmashMelee 1.0 | 19 | 89% |
| stelo.Randomness 1.0 | 8 | 63% |
| amk.superstrike.SuperStrike 0.3 | 4 | 100% |
| alpha.BlackIce 1.0 | 2 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 35 | 38% | 63 |
| kano.gamma.KanoGamma 1.8 | 24 | 26% | 60 |
| mz.AntiGrav 1.0 | 9 | 10% | 30 |
| Polkwane.SmashMelee 1.0 | 8 | 9% | 21 |
| stelo.Randomness 1.0 | 6 | 6% | 17 |
| alpha.BlackIce 1.0 | 5 | 5% | 12 |
| amk.superstrike.SuperStrike 0.3 | 0 | 0% | 5 |
| sample.Corners 1.0 | 0 | 0% | 1 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 154562 melee ticks, 40329 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 96 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 96 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 2.

Targeting waves (208 rounds): 50651 sent, 45668 reached their opponent, 9496 virtual hits (20.8% of those reached).

## Melee bench: F41

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 629 over 6 battles (104.8 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 85.9 | 93 / 210 | 2.27 | 17.5% | 25137 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.3 | 17.5% | 93 |
| eem.EvBotNG v12.8 | 1.7 | 16.6% | 80 |
| ary.Swarm 1.1 | 3.3 | 13.2% | 13 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.7% | 17 |
| simonton.nano.MeleeSeed 1.8 | 5.2 | 10.3% | 5 |
| shrub.Silver v048 | 5.8 | 8.6% | 2 |
| zyx.nano.Ant 1.1 | 7.0 | 7.5% | 1 |
| stelo.Mirror 1.1 | 8.2 | 5.7% | 1 |
| jsal.Jsalbot 1.0 | 8.8 | 5.5% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.4 | 84.4 | 13 / 35 | 3993 |
| 2 | 1 | 68.4 | 89.2 | 17 / 35 | 4455 |
| 3 | 1 | 68.3 | 87.9 | 19 / 35 | 4151 |
| 4 | 1 | 66.4 | 82.5 | 15 / 35 | 4069 |
| 5 | 1 | 68.9 | 89.5 | 20 / 35 | 4465 |
| 6 | 2 | 65.9 | 81.6 | 9 / 35 | 4004 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 76 | 39% |
| lessonz.robocode.Oz 0.5.0 | 26 | 92% |
| ary.Swarm 1.1 | 25 | 96% |
| simonton.nano.MeleeSeed 1.8 | 8 | 100% |
| shrub.Silver v048 | 6 | 83% |
| stelo.Mirror 1.1 | 2 | 50% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 958. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 65 | 52% | 93 |
| ary.Swarm 1.1 | 14 | 11% | 41 |
| lessonz.robocode.Oz 0.5.0 | 14 | 11% | 25 |
| simonton.nano.MeleeSeed 1.8 | 8 | 6% | 19 |
| shrub.Silver v048 | 6 | 5% | 12 |
| stelo.Mirror 1.1 | 5 | 4% | 6 |
| zyx.nano.Ant 1.1 | 4 | 3% | 7 |
| jsal.Jsalbot 1.0 | 2 | 2% | 5 |
| acogdev.alpha 0.2 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 151880 melee ticks, 51736 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 56 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 50764 sent, 45778 reached their opponent, 7260 virtual hits (15.9% of those reached).

## Melee bench: F42

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 530 over 6 battles (88.3 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 91.6 | 136 / 210 | 1.76 | 20.3% | 35035 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.0 | 20.3% | 136 |
| wompi.Wallaby 5.1 | 2.2 | 15.0% | 38 |
| ara.Shera 0.88 | 3.3 | 13.4% | 21 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 12.9% | 12 |
| amz.NanoClone 1.41 | 5.0 | 9.1% | 1 |
| maribo.IotaCT 1.1 | 6.5 | 6.6% | 0 |
| dsw.StaticD 1.0 | 6.8 | 6.8% | 2 |
| mme.NikeEnhanced 2.0 | 8.3 | 5.6% | 0 |
| stelo.MirrorMicro 1.0 | 8.7 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 95.6 | 30 / 35 | 6101 |
| 2 | 1 | 71.2 | 94.3 | 24 / 35 | 5738 |
| 3 | 1 | 70.3 | 90.2 | 20 / 35 | 5896 |
| 4 | 1 | 70.2 | 90.2 | 19 / 35 | 5730 |
| 5 | 1 | 69.3 | 88.3 | 20 / 35 | 5635 |
| 6 | 1 | 70.9 | 91.1 | 23 / 35 | 5935 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 89 | 83% |
| maribo.mini.MiniQuester 0.1 | 42 | 88% |
| ara.Shera 0.88 | 29 | 69% |
| dsw.StaticD 1.0 | 3 | 67% |
| amz.NanoClone 1.41 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 959. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 33 | 42% | 100 |
| ara.Shera 0.88 | 22 | 28% | 41 |
| maribo.mini.MiniQuester 0.1 | 15 | 19% | 50 |
| dsw.StaticD 1.0 | 2 | 3% | 8 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 5 |
| amz.NanoClone 1.41 | 1 | 1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 2 |
| maribo.IotaCT 1.1 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 162469 melee ticks, 52119 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 40 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 52541 sent, 47878 reached their opponent, 9897 virtual hits (20.7% of those reached).

## Melee bench: F43

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 492 over 6 battles (82.0 per battle, most in one battle 117). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 78.5 | 23 / 210 | 2.93 | 15.0% | 22336 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.7% | 146 |
| hadur2.Hadur 3.18oe | 2.0 | 15.0% | 23 |
| brainfade.melee.Dusk 0.44 | 3.0 | 13.1% | 31 |
| dummy.micro.Sparrow 2.5 | 4.2 | 11.4% | 7 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.9% | 2 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 10.0% | 2 |
| mz.NanoGod 2.02 | 7.2 | 7.6% | 0 |
| jab.DiamondStealer 5 | 7.8 | 7.0% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.8% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 76.8 | 4 / 35 | 3473 |
| 2 | 2 | 66.1 | 80.0 | 6 / 35 | 4154 |
| 3 | 2 | 64.5 | 78.1 | 3 / 35 | 3878 |
| 4 | 2 | 64.4 | 77.5 | 3 / 35 | 3684 |
| 5 | 2 | 64.8 | 79.4 | 4 / 35 | 3582 |
| 6 | 2 | 64.5 | 79.4 | 3 / 35 | 3565 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 80 | 13% |
| brainfade.melee.Dusk 0.44 | 18 | 39% |
| dummy.micro.Sparrow 2.5 | 6 | 33% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 100% |
| Krabb.akim2.Akim2 1.1b | 2 | 0% |
| cvt.Firsty 1.0 | 1 | 0% |
| jab.DiamondStealer 5 | 1 | 100% |

Hadur died in 192 of 210 rounds, at a mean tick of 988. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 117 | 61% | 126 |
| brainfade.melee.Dusk 0.44 | 24 | 13% | 30 |
| dummy.micro.Sparrow 2.5 | 21 | 11% | 24 |
| wcsv.melee.EngineerMelee 0.1 | 13 | 7% | 18 |
| Krabb.akim2.Akim2 1.1b | 5 | 3% | 5 |
| mz.NanoGod 2.02 | 4 | 2% | 4 |
| cvt.Firsty 1.0 | 3 | 2% | 3 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 156413 melee ticks, 46700 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 33 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 50796 sent, 45797 reached their opponent, 7801 virtual hits (17.0% of those reached).

## Melee bench: F44

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 334 over 6 battles (55.7 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 90.8 | 132 / 210 | 1.82 | 20.0% | 32603 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.0 | 20.0% | 132 |
| stelo.Liblix 0.3.1 | 2.2 | 16.1% | 53 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.4% | 23 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.5 | 9.4% | 0 |
| jwirde.Gort 2.0 | 4.7 | 9.3% | 2 |
| disan.Chair 2.2.0 | 6.7 | 7.6% | 0 |
| wompi.Quokka 1.6 | 7.0 | 7.3% | 0 |
| stf.PanzerGeneral 0.1 | 7.2 | 6.9% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.6% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 90.5 | 21 / 35 | 5273 |
| 2 | 1 | 69.5 | 88.6 | 21 / 35 | 5361 |
| 3 | 1 | 69.9 | 88.6 | 21 / 35 | 5388 |
| 4 | 1 | 71.3 | 93.3 | 24 / 35 | 5591 |
| 5 | 1 | 70.5 | 91.7 | 23 / 35 | 5484 |
| 6 | 1 | 70.7 | 92.4 | 22 / 35 | 5506 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 83 | 65% |
| tzu.TheArtOfWar 1.2 | 64 | 83% |
| disan.Chair 2.2.0 | 8 | 100% |
| jwirde.Gort 2.0 | 7 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 100% |
| wompi.Quokka 1.6 | 3 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 909. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 45 | 56% | 103 |
| tzu.TheArtOfWar 1.2 | 22 | 28% | 62 |
| jwirde.Gort 2.0 | 4 | 5% | 19 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 5% | 9 |
| amk.jointstrike.JointStrike 0.2 | 2 | 3% | 4 |
| disan.Chair 2.2.0 | 1 | 1% | 9 |
| stf.PanzerGeneral 0.1 | 0 | 0% | 2 |
| wompi.Quokka 1.6 | 0 | 0% | 1 |
| sample.Crazy 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 153046 melee ticks, 44686 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 72 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 53431 sent, 48751 reached their opponent, 10700 virtual hits (21.9% of those reached).

## Melee bench: F45

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 569 over 6 battles (94.8 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 89.0 | 107 / 210 | 1.99 | 19.8% | 33178 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18oe | 1.0 | 19.8% | 107 |
| jje.BagPuss 1.2 | 2.3 | 12.2% | 6 |
| eem.IWillFireNoBullet v2.8 | 2.7 | 12.3% | 76 |
| myl.nano.Graviton 1.10 | 4.5 | 10.2% | 2 |
| sul.Lunar 1.1 | 4.7 | 10.5% | 8 |
| pez.mini.ChironexFleckeri 0.5 | 6.8 | 8.8% | 7 |
| hvilela.HVilela 0.9 | 6.8 | 8.6% | 2 |
| fm.claire 1.7 | 7.2 | 8.1% | 0 |
| wit.Deep7 2.0 | 9.2 | 5.2% | 2 |
| abud.ThirdRobo 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 88.3 | 16 / 35 | 5439 |
| 2 | 1 | 70.0 | 90.2 | 17 / 35 | 5623 |
| 3 | 1 | 68.8 | 86.7 | 18 / 35 | 5203 |
| 4 | 1 | 69.1 | 89.5 | 16 / 35 | 5323 |
| 5 | 1 | 71.3 | 93.7 | 22 / 35 | 6031 |
| 6 | 1 | 69.1 | 85.7 | 18 / 35 | 5559 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 88 | 52% |
| jje.BagPuss 1.2 | 23 | 78% |
| sul.Lunar 1.1 | 16 | 94% |
| pez.mini.ChironexFleckeri 0.5 | 12 | 67% |
| myl.nano.Graviton 1.10 | 10 | 100% |
| wit.Deep7 2.0 | 6 | 100% |
| fm.claire 1.7 | 3 | 100% |
| hvilela.HVilela 0.9 | 2 | 50% |

Hadur died in 108 of 210 rounds, at a mean tick of 1680. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 51 | 47% | 0 |
| jje.BagPuss 1.2 | 17 | 16% | 66 |
| sul.Lunar 1.1 | 10 | 9% | 50 |
| myl.nano.Graviton 1.10 | 9 | 8% | 28 |
| pez.mini.ChironexFleckeri 0.5 | 8 | 7% | 29 |
| hvilela.HVilela 0.9 | 5 | 5% | 12 |
| fm.claire 1.7 | 2 | 2% | 12 |
| wit.Deep7 2.0 | 1 | 1% | 9 |
| abud.ThirdRobo 1.0 | 1 | 1% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 216001 melee ticks, 90691 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 43 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 2.

Targeting waves (205 rounds): 64236 sent, 59501 reached their opponent, 8869 virtual hits (14.9% of those reached).

## Melee bench: F46

hadur2.Hadur 3.18oe against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 699 over 6 battles (116.5 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 80.7 | 41 / 210 | 2.73 | 15.7% | 24569 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.5 | 16.9% | 86 |
| kc.mini.Mirage 0.2 | 1.7 | 16.8% | 66 |
| hadur2.Hadur 3.18oe | 2.8 | 15.7% | 41 |
| mz.MicroSheep 1.0 | 4.5 | 10.6% | 3 |
| cx.Princess 1.0 | 4.5 | 10.6% | 13 |
| sadoner.killer 0.2 | 6.0 | 8.8% | 1 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.0% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.3 | 5.4% | 0 |
| kurios.DOSexe .9a | 8.7 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.9 | 79.0 | 6 / 35 | 3866 |
| 2 | 3 | 65.0 | 82.5 | 8 / 35 | 3890 |
| 3 | 2 | 65.7 | 83.5 | 8 / 35 | 4211 |
| 4 | 3 | 63.6 | 78.1 | 3 / 35 | 4140 |
| 5 | 3 | 66.8 | 84.1 | 11 / 35 | 4375 |
| 6 | 3 | 63.6 | 77.1 | 5 / 35 | 4087 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 51 | 47% |
| rsalesc.melee.Medina 0.4.5 | 40 | 15% |
| cx.Princess 1.0 | 16 | 44% |
| mz.MicroSheep 1.0 | 4 | 75% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 952. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 67 | 38% | 77 |
| kc.mini.Mirage 0.2 | 65 | 37% | 85 |
| cx.Princess 1.0 | 13 | 7% | 18 |
| mz.MicroSheep 1.0 | 12 | 7% | 16 |
| sadoner.killer 0.2 | 7 | 4% | 8 |
| arthord.NanoSatanMelee Beta | 3 | 2% | 3 |
| kurios.DOSexe .9a | 1 | 1% | 1 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 159003 melee ticks, 42727 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 37 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 37 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 3.

Targeting waves (209 rounds): 46927 sent, 41852 reached their opponent, 6551 virtual hits (15.7% of those reached).

