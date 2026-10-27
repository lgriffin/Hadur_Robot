# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 708 over 8 battles (88.5 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 85.0 | 58 / 280 | 2.35 | 16.5% | 36551 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.4% | 192 |
| hadur2.Hadur 3.17.1bb | 2.0 | 16.5% | 58 |
| sgp.JollyNinja 3.53 | 3.4 | 11.6% | 18 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.4 | 11.0% | 3 |
| mz.MicroGodMelee 1 | 4.9 | 10.5% | 4 |
| lorneswork.Predator 1.0 | 5.4 | 9.8% | 5 |
| adt.Ar2 1.0 | 7.0 | 7.4% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.1 | 5.3% | 0 |
| skm.butterfly 1.0 | 8.9 | 4.5% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.1 | 86.7 | 7 / 35 | 4183 |
| 2 | 2 | 66.8 | 86.3 | 9 / 35 | 4680 |
| 3 | 2 | 66.7 | 87.3 | 6 / 35 | 4654 |
| 4 | 2 | 66.1 | 84.8 | 6 / 35 | 4548 |
| 5 | 2 | 66.5 | 84.1 | 11 / 35 | 4610 |
| 6 | 2 | 66.7 | 86.0 | 9 / 35 | 4663 |
| 7 | 2 | 66.0 | 84.4 | 4 / 35 | 4516 |
| 8 | 2 | 65.2 | 80.6 | 6 / 35 | 4697 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 156 | 8% |
| sgp.JollyNinja 3.53 | 31 | 71% |
| mz.MicroGodMelee 1 | 14 | 86% |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 86% |
| lorneswork.Predator 1.0 | 2 | 100% |
| skm.butterfly 1.0 | 1 | 100% |
| adt.Ar2 1.0 | 1 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 228 of 280 rounds, at a mean tick of 1155. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 160 | 70% | 188 |
| sgp.JollyNinja 3.53 | 21 | 9% | 30 |
| lorneswork.Predator 1.0 | 16 | 7% | 18 |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 6% | 18 |
| mz.MicroGodMelee 1 | 7 | 3% | 19 |
| adt.Ar2 1.0 | 4 | 2% | 4 |
| skm.butterfly 1.0 | 1 | 0% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 191767 melee ticks, 116211 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 55 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 0.

Targeting waves (272 rounds): 63324 sent, 57284 reached their opponent, 12812 virtual hits (22.4% of those reached).

## Melee bench: F02

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 208 over 8 battles (26.0 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 85.8 | 133 / 280 | 2.28 | 18.0% | 35475 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.0% | 133 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 13.6% | 56 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.6 | 13.5% | 37 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 11.2% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.1 | 10.3% | 25 |
| fnc.bandit.Bandit 5.2.0 | 6.5 | 8.3% | 3 |
| Noran.BitchingElk 0.054 | 6.6 | 8.1% | 14 |
| sch.Simone 0.3d | 7.4 | 7.4% | 9 |
| stelo.PatternRobot 1.0 | 9.0 | 5.8% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 89.2 | 21 / 35 | 4298 |
| 2 | 1 | 65.8 | 80.3 | 16 / 35 | 4537 |
| 3 | 1 | 69.7 | 92.1 | 19 / 35 | 4892 |
| 4 | 1 | 69.0 | 92.7 | 20 / 35 | 4350 |
| 5 | 1 | 67.2 | 86.3 | 15 / 35 | 4423 |
| 6 | 1 | 66.9 | 83.8 | 18 / 35 | 4288 |
| 7 | 1 | 66.2 | 83.2 | 14 / 35 | 4310 |
| 8 | 1 | 65.0 | 79.0 | 10 / 35 | 4377 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 65 | 52% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 41 | 73% |
| com.cohesiva.robocode.ManOwaR 1.0 | 35 | 49% |
| sch.Simone 0.3d | 18 | 78% |
| lrem.micro.SpikeSoldier 0.4 | 17 | 100% |
| Noran.BitchingElk 0.054 | 13 | 54% |
| fnc.bandit.Bandit 5.2.0 | 7 | 57% |
| fullsail.SweetTea 1.1 | 6 | 100% |
| stelo.PatternRobot 1.0 | 5 | 80% |

Hadur died in 148 of 280 rounds, at a mean tick of 997. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 50 | 34% | 74 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 33 | 22% | 68 |
| com.cohesiva.robocode.ManOwaR 1.0 | 22 | 15% | 46 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 7% | 22 |
| stelo.PatternRobot 1.0 | 10 | 7% | 12 |
| Noran.BitchingElk 0.054 | 9 | 6% | 19 |
| sch.Simone 0.3d | 7 | 5% | 20 |
| fnc.bandit.Bandit 5.2.0 | 5 | 3% | 11 |
| fullsail.SweetTea 1.1 | 1 | 1% | 8 |

Posture (Hadur's M records, 268 rounds): 225189 melee ticks, 57294 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (268 rounds): longest scan gap while four or more were alive 47 ticks (268 rounds over 8); rounds whose longest gap at any count was over 8: 268; robots dropped as dead without a death event: 1.

Targeting waves (268 rounds): 80592 sent, 74652 reached their opponent, 13993 virtual hits (18.7% of those reached).

## Melee bench: F03

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 133 over 8 battles (16.6 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 92.3 | 219 / 280 | 1.69 | 20.1% | 46703 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 20.1% | 219 |
| radnor.DoctorBob 1.42 | 2.3 | 14.3% | 27 |
| kawigi.nano.Lib 1.0 | 3.1 | 13.2% | 18 |
| vuen.Cake 2.51 | 3.6 | 11.9% | 14 |
| urdos.URDOS 1.3 | 5.0 | 9.5% | 1 |
| adt.Ar1 2.1 | 6.5 | 7.2% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 6.6% | 0 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.5% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.3 | 5.6% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 91.4 | 27 / 35 | 5386 |
| 2 | 1 | 69.2 | 87.0 | 26 / 35 | 5838 |
| 3 | 1 | 70.1 | 90.2 | 27 / 35 | 6069 |
| 4 | 1 | 72.5 | 98.4 | 33 / 35 | 6483 |
| 5 | 1 | 70.0 | 91.7 | 26 / 35 | 5876 |
| 6 | 1 | 70.5 | 94.0 | 26 / 35 | 5675 |
| 7 | 1 | 71.5 | 97.1 | 29 / 35 | 6120 |
| 8 | 1 | 68.6 | 88.6 | 25 / 35 | 5256 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 95 | 94% |
| vuen.Cake 2.51 | 68 | 90% |
| kawigi.nano.Lib 1.0 | 65 | 89% |
| urdos.URDOS 1.3 | 4 | 100% |
| oa.weak.FlyMk1 0.1 | 4 | 75% |
| adt.Ar1 2.1 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |

Hadur died in 63 of 280 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 18 | 29% | 94 |
| vuen.Cake 2.51 | 16 | 25% | 83 |
| kawigi.nano.Lib 1.0 | 14 | 22% | 65 |
| bwbaugh.nano.Tirunculus 0.0.0a | 6 | 10% | 6 |
| urdos.URDOS 1.3 | 4 | 6% | 15 |
| oa.weak.FlyMk1 0.1 | 2 | 3% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 2% | 5 |
| adt.Ar1 2.1 | 1 | 2% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 3 |

Posture (Hadur's M records, 269 rounds): 173880 melee ticks, 54999 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (269 rounds): longest scan gap while four or more were alive 33 ticks (269 rounds over 8); rounds whose longest gap at any count was over 8: 269; robots dropped as dead without a death event: 2.

Targeting waves (269 rounds): 53705 sent, 48004 reached their opponent, 13649 virtual hits (28.4% of those reached).

## Melee bench: F04

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 927 over 8 battles (115.9 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 85.9 | 36 / 280 | 2.27 | 17.0% | 40145 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.9% | 216 |
| hadur2.Hadur 3.17.1bb | 2.0 | 17.0% | 36 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.8% | 17 |
| TNT.TNT 0.99.1 | 4.0 | 11.1% | 9 |
| josago.Jorgito 0.16 | 5.0 | 8.9% | 2 |
| css.Delitioner 0.11 | 6.3 | 6.9% | 0 |
| tj.zombie1n 1.0.1 | 7.3 | 6.3% | 0 |
| rampancy.Durandal 2.1d | 7.5 | 5.8% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.6% | 1 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.4 | 86.7 | 5 / 35 | 4890 |
| 2 | 2 | 67.7 | 85.4 | 5 / 35 | 5251 |
| 3 | 2 | 66.5 | 83.8 | 3 / 35 | 4876 |
| 4 | 2 | 68.6 | 88.3 | 8 / 35 | 5386 |
| 5 | 2 | 66.4 | 85.7 | 2 / 35 | 4500 |
| 6 | 2 | 66.1 | 83.8 | 1 / 35 | 4574 |
| 7 | 2 | 68.9 | 87.9 | 9 / 35 | 5567 |
| 8 | 2 | 67.6 | 85.4 | 3 / 35 | 5101 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 171 | 8% |
| apc.LeeroyJenkins2 1.0 | 18 | 44% |
| TNT.TNT 0.99.1 | 17 | 65% |
| josago.Jorgito 0.16 | 3 | 33% |
| css.Delitioner 0.11 | 2 | 100% |
| spin.Bugstard 0.012b | 1 | 0% |

Hadur died in 253 of 280 rounds, at a mean tick of 1367. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 180 | 71% | 198 |
| apc.LeeroyJenkins2 1.0 | 34 | 13% | 40 |
| TNT.TNT 0.99.1 | 16 | 6% | 25 |
| josago.Jorgito 0.16 | 11 | 4% | 12 |
| css.Delitioner 0.11 | 1 | 0% | 3 |
| tj.zombie1n 1.0.1 | 1 | 0% | 1 |
| spin.Bugstard 0.012b | 1 | 0% | 0 |
| rampancy.Durandal 2.1d | 0 | 0% | 1 |
9 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 268277 melee ticks, 103793 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 57 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 0.

Targeting waves (273 rounds): 83094 sent, 77036 reached their opponent, 12928 virtual hits (16.8% of those reached).

## Melee bench: F05

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 321 over 8 battles (40.1 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 76.7 | 37 / 280 | 3.10 | 14.3% | 26421 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.4 | 17.7% | 129 |
| justin.DemonicRage 3.4 | 1.6 | 17.1% | 86 |
| hadur2.Hadur 3.17.1bb | 3.1 | 14.3% | 37 |
| wompi.Numbat 2.1 | 3.9 | 12.9% | 24 |
| ms.Ares 0.19 | 5.4 | 9.4% | 0 |
| axeBots.HataMoto 3.09 | 5.6 | 8.9% | 4 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.3 | 5.9% | 0 |
| supersample.SuperBoxBot 1.0 | 7.8 | 5.6% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.2% | 0 |
| GarmBox.Oranges 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.9 | 74.0 | 2 / 35 | 2919 |
| 2 | 3 | 64.2 | 81.3 | 5 / 35 | 3615 |
| 3 | 3 | 62.9 | 77.1 | 7 / 35 | 3345 |
| 4 | 3 | 62.1 | 74.9 | 4 / 35 | 3268 |
| 5 | 3 | 61.8 | 73.7 | 4 / 35 | 3293 |
| 6 | 3 | 62.8 | 77.8 | 6 / 35 | 3393 |
| 7 | 3 | 62.1 | 75.2 | 5 / 35 | 3151 |
| 8 | 3 | 63.5 | 79.7 | 4 / 35 | 3437 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 55 | 35% |
| cb.fire.Firestarter 2.0f | 42 | 7% |
| wompi.Numbat 2.1 | 15 | 60% |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 100% |
| axeBots.HataMoto 3.09 | 2 | 50% |
| ms.Ares 0.19 | 2 | 100% |

Hadur died in 245 of 280 rounds, at a mean tick of 900. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 97 | 40% | 110 |
| cb.fire.Firestarter 2.0f | 77 | 31% | 84 |
| wompi.Numbat 2.1 | 42 | 17% | 50 |
| axeBots.HataMoto 3.09 | 10 | 4% | 13 |
| ms.Ares 0.19 | 8 | 3% | 11 |
| GarmBox.Oranges 1.0 | 4 | 2% | 4 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 3 |
| Queens_teamrobot.UltraRazor 1.0 | 2 | 1% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 205722 melee ticks, 46125 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 53 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 53 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 65156 sent, 58905 reached their opponent, 10715 virtual hits (18.2% of those reached).

## Melee bench: F06

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 554 over 8 battles (69.3 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 86.3 | 163 / 280 | 2.23 | 18.4% | 37395 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.4% | 163 |
| jekl.StoneGhost 0.7 | 2.4 | 14.5% | 27 |
| origin.SleepSiphon 1.7b | 2.9 | 13.7% | 61 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.4% | 18 |
| mld.Wisdom 1.0 | 5.1 | 10.1% | 2 |
| gg.Wolverine 2.0 | 6.0 | 8.2% | 2 |
| spinnercat.Omen 1.0 | 7.5 | 6.6% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 7.8 | 6.8% | 5 |
| DBall.NUKE 0.1 | 8.6 | 6.1% | 2 |
| sample.Fire 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 85.7 | 22 / 35 | 4587 |
| 2 | 1 | 68.1 | 88.3 | 18 / 35 | 4422 |
| 3 | 1 | 68.6 | 88.6 | 19 / 35 | 4769 |
| 4 | 1 | 67.0 | 81.3 | 19 / 35 | 4657 |
| 5 | 1 | 68.4 | 85.1 | 24 / 35 | 4718 |
| 6 | 1 | 68.4 | 87.0 | 20 / 35 | 4928 |
| 7 | 1 | 68.1 | 87.3 | 21 / 35 | 4508 |
| 8 | 1 | 68.8 | 87.6 | 20 / 35 | 4806 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 76 | 93% |
| origin.SleepSiphon 1.7b | 50 | 62% |
| pe.minimelee.SandboxMiniMelee 1.1 | 42 | 88% |
| gg.Wolverine 2.0 | 11 | 100% |
| mld.Wisdom 1.0 | 7 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 40% |
| DBall.NUKE 0.1 | 5 | 80% |

Hadur died in 121 of 280 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 48 | 40% | 91 |
| jekl.StoneGhost 0.7 | 24 | 20% | 83 |
| pe.minimelee.SandboxMiniMelee 1.1 | 17 | 14% | 46 |
| mld.Wisdom 1.0 | 10 | 8% | 21 |
| ers.nano.hawk.HawkLA 3.0m | 9 | 7% | 16 |
| gg.Wolverine 2.0 | 7 | 6% | 14 |
| DBall.NUKE 0.1 | 2 | 2% | 8 |
| spinnercat.Omen 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 200549 melee ticks, 52841 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 56 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 63733 sent, 57914 reached their opponent, 14624 virtual hits (25.3% of those reached).

## Melee bench: F07

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 623 over 8 battles (77.9 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 92.4 | 155 / 280 | 1.68 | 19.9% | 46083 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.9% | 155 |
| rsalesc.melee.Monk 0.3.6c | 2.1 | 17.2% | 59 |
| rtk.Tachikoma 1.0 | 2.9 | 16.3% | 40 |
| oog.melee.CapuletDroid 1.1 | 4.4 | 11.6% | 11 |
| franzor.Lizt 1.3.1 | 4.6 | 10.9% | 15 |
| lrem.micro.MoggFanatic 0.2 | 6.4 | 7.8% | 0 |
| exauge.GateKeeper 1.1.121g | 6.6 | 7.7% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.5% | 0 |
| sample.Target 1.0 | 9.1 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 9.9 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 92.4 | 21 / 35 | 5705 |
| 2 | 1 | 72.0 | 93.3 | 21 / 35 | 5958 |
| 3 | 1 | 71.6 | 91.7 | 18 / 35 | 5905 |
| 4 | 1 | 72.1 | 93.0 | 24 / 35 | 5716 |
| 5 | 1 | 70.3 | 89.8 | 13 / 35 | 5585 |
| 6 | 1 | 72.3 | 94.3 | 22 / 35 | 5998 |
| 7 | 1 | 71.8 | 94.0 | 21 / 35 | 5809 |
| 8 | 1 | 70.5 | 90.8 | 15 / 35 | 5407 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 103 | 76% |
| rsalesc.melee.Monk 0.3.6c | 58 | 24% |
| franzor.Lizt 1.3.1 | 43 | 79% |
| oog.melee.CapuletDroid 1.1 | 35 | 80% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 130 of 280 rounds, at a mean tick of 1427. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 58 | 45% | 91 |
| rtk.Tachikoma 1.0 | 45 | 35% | 140 |
| oog.melee.CapuletDroid 1.1 | 12 | 9% | 43 |
| franzor.Lizt 1.3.1 | 9 | 7% | 1 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 2 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 257981 melee ticks, 120569 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 80 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 0.

Targeting waves (273 rounds): 78767 sent, 72747 reached their opponent, 15816 virtual hits (21.7% of those reached).

## Melee bench: F08

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 568 over 8 battles (71.0 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 90.1 | 174 / 280 | 1.89 | 19.1% | 37400 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.1% | 174 |
| tm.Yuugao 1.0 | 2.1 | 13.8% | 53 |
| shrub.Vapour v159 | 2.9 | 12.3% | 33 |
| Krabb.sliNk.Garm 0.9u | 4.3 | 10.4% | 13 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 10.0% | 3 |
| m3thos.Eva00 1.1 | 6.5 | 8.6% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 7.1 | 7.8% | 2 |
| qualidafial.MajorDick 1.0.1 | 7.5 | 7.4% | 1 |
| SHAM.WOW 1.4 | 9.1 | 5.3% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 86.3 | 17 / 35 | 4507 |
| 2 | 1 | 68.0 | 88.9 | 20 / 35 | 4388 |
| 3 | 1 | 69.3 | 92.1 | 28 / 35 | 4469 |
| 4 | 1 | 67.9 | 87.3 | 18 / 35 | 4649 |
| 5 | 1 | 69.3 | 90.8 | 19 / 35 | 5047 |
| 6 | 1 | 69.9 | 93.0 | 26 / 35 | 4694 |
| 7 | 1 | 67.8 | 86.3 | 19 / 35 | 4746 |
| 8 | 1 | 70.4 | 96.2 | 27 / 35 | 4900 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 76 | 62% |
| shrub.Vapour v159 | 54 | 69% |
| Krabb.sliNk.Garm 0.9u | 36 | 86% |
| com.spp.robocode.MostlyHarmless 010 | 35 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 100% |
| m3thos.Eva00 1.1 | 9 | 100% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 109 of 280 rounds, at a mean tick of 915. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 40 | 37% | 89 |
| shrub.Vapour v159 | 30 | 28% | 60 |
| Krabb.sliNk.Garm 0.9u | 14 | 13% | 41 |
| com.spp.robocode.MostlyHarmless 010 | 10 | 9% | 52 |
| jwst.DAD.DarkAndDarker 1.1 | 4 | 4% | 18 |
| m3thos.Eva00 1.1 | 3 | 3% | 12 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 4 |
| SHAM.WOW 1.4 | 2 | 2% | 3 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 277 rounds): 210359 melee ticks, 60999 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (277 rounds): longest scan gap while four or more were alive 65 ticks (277 rounds over 8); rounds whose longest gap at any count was over 8: 277; robots dropped as dead without a death event: 2.

Targeting waves (277 rounds): 68958 sent, 62758 reached their opponent, 12719 virtual hits (20.3% of those reached).

## Melee bench: F09

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 570 over 8 battles (71.3 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 73.5 | 65 / 280 | 3.39 | 14.4% | 26336 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.1 | 17.6% | 134 |
| hadur2.Hadur 3.17.1bb | 2.3 | 14.4% | 65 |
| kc.micro.Figment 1.0 | 2.6 | 14.2% | 37 |
| yagami.Tidus 0.11 | 4.4 | 11.1% | 8 |
| pedersen.Grishnakh 1.0 | 4.9 | 10.7% | 20 |
| mc2.enemy.Original 0.9 | 5.9 | 9.2% | 13 |
| dft.Calliope 5.6 | 6.9 | 7.7% | 3 |
| step.nanoPri 1.0 | 8.4 | 5.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.8 | 5.0% | 0 |
| rdm.Dueler 0.4x | 9.9 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.4 | 74.0 | 4 / 35 | 3090 |
| 2 | 2 | 63.0 | 74.6 | 9 / 35 | 3444 |
| 3 | 3 | 59.3 | 66.7 | 4 / 35 | 2944 |
| 4 | 2 | 61.6 | 72.7 | 8 / 35 | 3219 |
| 5 | 2 | 64.2 | 79.4 | 12 / 35 | 3436 |
| 6 | 3 | 61.6 | 71.7 | 8 / 35 | 3373 |
| 7 | 3 | 61.6 | 71.7 | 8 / 35 | 3221 |
| 8 | 1 | 63.7 | 77.1 | 12 / 35 | 3609 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 50 | 36% |
| kc.micro.Figment 1.0 | 33 | 82% |
| pedersen.Grishnakh 1.0 | 16 | 44% |
| yagami.Tidus 0.11 | 11 | 73% |
| mc2.enemy.Original 0.9 | 11 | 36% |
| dft.Calliope 5.6 | 2 | 50% |

Hadur died in 219 of 280 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 79 | 36% | 98 |
| yagami.Tidus 0.11 | 37 | 17% | 44 |
| kc.micro.Figment 1.0 | 33 | 15% | 61 |
| mc2.enemy.Original 0.9 | 21 | 10% | 24 |
| pedersen.Grishnakh 1.0 | 19 | 9% | 26 |
| robar.nano.Assertive_Melee 0.2 | 15 | 7% | 15 |
| dft.Calliope 5.6 | 9 | 4% | 10 |
| rdm.Dueler 0.4x | 1 | 0% | 1 |
| step.nanoPri 1.0 | 1 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 199727 melee ticks, 40830 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 41 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 0.

Targeting waves (276 rounds): 65829 sent, 59949 reached their opponent, 9417 virtual hits (15.7% of those reached).

## Melee bench: F10

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 307 over 8 battles (38.4 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 95.8 | 229 / 280 | 1.38 | 20.4% | 41550 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 20.4% | 229 |
| DTF.Kludgy 1.2b | 2.3 | 14.1% | 22 |
| ne.Chimera 1.2 | 3.1 | 13.0% | 8 |
| ejb.Polaris 1.0.1 | 3.8 | 12.4% | 11 |
| vStar.RAFzilla 2.15 | 5.1 | 10.4% | 4 |
| tvv.micro.Antares 1.1.1 | 5.8 | 10.0% | 6 |
| sam.Samspin 1.0 | 7.9 | 5.2% | 0 |
| kurios.DOSexe .9b | 7.9 | 5.3% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 5.1% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 95.6 | 28 / 35 | 5387 |
| 2 | 1 | 71.6 | 97.1 | 30 / 35 | 5542 |
| 3 | 1 | 69.6 | 92.1 | 24 / 35 | 4695 |
| 4 | 1 | 72.1 | 99.7 | 34 / 35 | 5247 |
| 5 | 1 | 71.2 | 97.1 | 29 / 35 | 5085 |
| 6 | 1 | 70.2 | 94.3 | 27 / 35 | 5119 |
| 7 | 1 | 71.1 | 96.2 | 28 / 35 | 5198 |
| 8 | 1 | 70.5 | 94.3 | 29 / 35 | 5277 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 83 | 82% |
| ejb.Polaris 1.0.1 | 65 | 89% |
| ne.Chimera 1.2 | 48 | 92% |
| vStar.RAFzilla 2.15 | 28 | 96% |
| tvv.micro.Antares 1.1.1 | 25 | 92% |
| donjezza.Muncho 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 4 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 53 of 280 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 22 | 42% | 84 |
| ejb.Polaris 1.0.1 | 10 | 19% | 62 |
| ne.Chimera 1.2 | 8 | 15% | 49 |
| vStar.RAFzilla 2.15 | 6 | 11% | 34 |
| tvv.micro.Antares 1.1.1 | 4 | 8% | 23 |
| kurios.DOSexe .9b | 1 | 2% | 17 |
| sam.Samspin 1.0 | 1 | 2% | 1 |
| donjezza.Muncho 1.0 | 0 | 0% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 271 rounds): 197376 melee ticks, 77928 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (271 rounds): longest scan gap while four or more were alive 72 ticks (271 rounds over 8); rounds whose longest gap at any count was over 8: 271; robots dropped as dead without a death event: 0.

Targeting waves (271 rounds): 65672 sent, 59724 reached their opponent, 12691 virtual hits (21.2% of those reached).

## Melee bench: F11

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 555 over 8 battles (69.4 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 80.2 | 99 / 280 | 2.78 | 15.9% | 28055 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.4 | 16.5% | 90 |
| hadur2.Hadur 3.17.1bb | 1.6 | 15.9% | 99 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.7% | 32 |
| djc.DynaBot 0.1.1 | 4.0 | 11.1% | 19 |
| rdt199.Warlord 0.73 | 5.6 | 9.1% | 12 |
| br2.MobyDickBot 1.6 | 5.9 | 8.7% | 14 |
| uji.YellohFellah 1.0 | 6.8 | 8.4% | 14 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.5% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.6% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 79.7 | 12 / 35 | 3601 |
| 2 | 2 | 62.0 | 78.1 | 10 / 35 | 3100 |
| 3 | 1 | 64.3 | 78.4 | 16 / 35 | 3629 |
| 4 | 2 | 65.7 | 82.5 | 14 / 35 | 3895 |
| 5 | 1 | 64.7 | 82.9 | 13 / 35 | 3476 |
| 6 | 2 | 64.7 | 81.6 | 12 / 35 | 3548 |
| 7 | 2 | 63.0 | 79.4 | 7 / 35 | 3406 |
| 8 | 1 | 64.0 | 79.4 | 15 / 35 | 3400 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 68 | 51% |
| djc.DynaBot 0.1.1 | 24 | 71% |
| cx.mini.Nimrod 0.55 | 21 | 62% |
| br2.MobyDickBot 1.6 | 19 | 47% |
| uji.YellohFellah 1.0 | 19 | 74% |
| rdt199.Warlord 0.73 | 10 | 80% |
| KiraNL.Chupacabra 0.4 | 3 | 100% |

Hadur died in 187 of 280 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 80 | 43% | 117 |
| cx.mini.Nimrod 0.55 | 37 | 20% | 54 |
| rdt199.Warlord 0.73 | 16 | 9% | 26 |
| djc.DynaBot 0.1.1 | 16 | 9% | 25 |
| br2.MobyDickBot 1.6 | 12 | 6% | 18 |
| uji.YellohFellah 1.0 | 10 | 5% | 26 |
| KiraNL.Chupacabra 0.4 | 5 | 3% | 7 |
| stelo.MirrorNano 1.3 | 3 | 2% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 2% | 3 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 213110 melee ticks, 53898 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 46 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 0.

Targeting waves (275 rounds): 69926 sent, 63770 reached their opponent, 9333 virtual hits (14.6% of those reached).

## Melee bench: F12

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 353 over 8 battles (44.1 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 83.7 | 156 / 280 | 2.46 | 17.2% | 28397 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.2% | 156 |
| bts.wiki.RipCurl 0.9b | 2.5 | 14.0% | 38 |
| nat.PallasHawk 1.0 | 2.9 | 13.4% | 44 |
| darkcanuck.Leon 1.01 | 3.6 | 12.8% | 22 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.0% | 12 |
| jrm.Test0 1.0 | 6.1 | 8.8% | 3 |
| cs.sheldor.Talon 1.1 | 7.0 | 6.8% | 1 |
| jp.Perpy 16.0 | 8.4 | 6.2% | 2 |
| stuff.Vlad 0.1 | 9.1 | 5.5% | 0 |
| jaybot.bots.Oddball 4.0 | 9.4 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 79.7 | 17 / 35 | 3408 |
| 2 | 1 | 62.9 | 74.9 | 12 / 35 | 3359 |
| 3 | 1 | 68.9 | 92.7 | 24 / 35 | 3732 |
| 4 | 1 | 66.4 | 83.5 | 21 / 35 | 3550 |
| 5 | 1 | 64.7 | 78.4 | 20 / 35 | 3435 |
| 6 | 1 | 68.7 | 89.8 | 25 / 35 | 3896 |
| 7 | 1 | 66.6 | 84.4 | 20 / 35 | 3583 |
| 8 | 1 | 66.5 | 86.3 | 17 / 35 | 3434 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 60 | 88% |
| bts.wiki.RipCurl 0.9b | 59 | 85% |
| nat.PallasHawk 1.0 | 56 | 71% |
| brainfade.melee.Genghis 0.36 | 11 | 73% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| jrm.Test0 1.0 | 2 | 0% |
| stuff.Vlad 0.1 | 2 | 100% |

Hadur died in 130 of 280 rounds, at a mean tick of 663. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 36 | 28% | 80 |
| bts.wiki.RipCurl 0.9b | 33 | 25% | 60 |
| jrm.Test0 1.0 | 20 | 15% | 22 |
| darkcanuck.Leon 1.01 | 14 | 11% | 76 |
| brainfade.melee.Genghis 0.36 | 11 | 8% | 18 |
| cs.sheldor.Talon 1.1 | 9 | 7% | 14 |
| jp.Perpy 16.0 | 4 | 3% | 5 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 2 |
| stuff.Vlad 0.1 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 269 rounds): 170623 melee ticks, 49146 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (269 rounds): longest scan gap while four or more were alive 49 ticks (269 rounds over 8); rounds whose longest gap at any count was over 8: 269; robots dropped as dead without a death event: 0.

Targeting waves (269 rounds): 59077 sent, 52910 reached their opponent, 9596 virtual hits (18.1% of those reached).

## Melee bench: F13

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 123 over 8 battles (15.4 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 79.3 | 62 / 280 | 2.86 | 14.9% | 28414 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 16.9% | 127 |
| ags.Glacier 0.2.11 | 1.6 | 16.3% | 57 |
| hadur2.Hadur 3.17.1bb | 2.9 | 14.9% | 62 |
| shinh.Entangled 0.3 | 4.5 | 11.8% | 21 |
| gh.micro.Gruweltje 0.7 | 4.5 | 12.0% | 13 |
| apc.Colossus2 0.17 | 6.0 | 8.1% | 0 |
| stelo.Wang 1.0 | 7.0 | 7.0% | 1 |
| ayk.WallHugger 1.0 | 8.3 | 5.0% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.9% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.0 | 77.5 | 12 / 35 | 3330 |
| 2 | 3 | 63.3 | 79.7 | 6 / 35 | 3488 |
| 3 | 3 | 63.0 | 79.0 | 8 / 35 | 3416 |
| 4 | 3 | 62.8 | 77.1 | 5 / 35 | 3760 |
| 5 | 3 | 61.5 | 76.2 | 6 / 35 | 2956 |
| 6 | 3 | 64.2 | 79.0 | 8 / 35 | 3829 |
| 7 | 2 | 66.2 | 86.0 | 11 / 35 | 4078 |
| 8 | 3 | 63.6 | 80.0 | 6 / 35 | 3557 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 62 | 19% |
| ags.Glacier 0.2.11 | 53 | 58% |
| shinh.Entangled 0.3 | 25 | 40% |
| gh.micro.Gruweltje 0.7 | 10 | 50% |
| stelo.Wang 1.0 | 5 | 80% |

Hadur died in 220 of 280 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 78 | 35% | 106 |
| mn.Combat 3.25.0 | 69 | 31% | 81 |
| shinh.Entangled 0.3 | 25 | 11% | 36 |
| gh.micro.Gruweltje 0.7 | 20 | 9% | 26 |
| stelo.Wang 1.0 | 9 | 4% | 13 |
| maribo.FollowFire 1 | 9 | 4% | 8 |
| apc.Colossus2 0.17 | 7 | 3% | 8 |
| sample.Tracker 1.0 | 2 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 200455 melee ticks, 54968 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 63 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 0.

Targeting waves (275 rounds): 59154 sent, 52886 reached their opponent, 9250 virtual hits (17.5% of those reached).

## Melee bench: F14

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 373 over 8 battles (46.6 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 92.9 | 199 / 280 | 1.64 | 19.7% | 40418 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.7% | 199 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.0% | 24 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.9% | 39 |
| sanyi.mikrobi.Roberto 1.0 | 5.0 | 9.8% | 4 |
| Lo_Ian.Gandalf_V4 4.0 | 5.1 | 9.5% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 5.6 | 9.1% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.0 | 8.5% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 8.3% | 9 |
| pa.Improved 1.0 | 9.0 | 5.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 88.6 | 20 / 35 | 4917 |
| 2 | 1 | 68.4 | 88.3 | 22 / 35 | 4401 |
| 3 | 1 | 69.0 | 90.8 | 21 / 35 | 5030 |
| 4 | 1 | 71.4 | 96.8 | 27 / 35 | 5415 |
| 5 | 1 | 70.5 | 93.7 | 27 / 35 | 4924 |
| 6 | 1 | 71.4 | 95.6 | 28 / 35 | 5525 |
| 7 | 1 | 69.8 | 92.1 | 24 / 35 | 5226 |
| 8 | 1 | 70.8 | 97.1 | 30 / 35 | 4980 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 94 | 96% |
| catcat20.shape.Theta 0.018 | 84 | 71% |
| sanyi.mikrobi.Roberto 1.0 | 20 | 85% |
| sheldor.micro.PointInLineRRAL 1.0 | 18 | 67% |
| co.edu.usb.rc.LidisTron 1.0 | 13 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 6 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 83 of 280 rounds, at a mean tick of 919. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 31 | 37% | 78 |
| simonton.micro.Sprout 1.1.3 | 29 | 35% | 120 |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 14% | 31 |
| sanyi.mikrobi.Roberto 1.0 | 4 | 5% | 24 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 4% | 6 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 1% | 9 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 1% | 7 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |
| pa.Improved 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 277 rounds): 198162 melee ticks, 74430 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (277 rounds): longest scan gap while four or more were alive 57 ticks (277 rounds over 8); rounds whose longest gap at any count was over 8: 277; robots dropped as dead without a death event: 0.

Targeting waves (277 rounds): 63421 sent, 57496 reached their opponent, 14965 virtual hits (26.0% of those reached).

## Melee bench: F15

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 471 over 8 battles (58.9 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 83.8 | 123 / 280 | 2.46 | 17.3% | 34610 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.3% | 123 |
| kawigi.micro.Shiz 1.1 | 2.4 | 14.1% | 33 |
| emp.Yngwie 1.11 | 2.9 | 13.3% | 78 |
| mld.DustBunny 3.8 | 3.9 | 12.5% | 11 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.7% | 4 |
| kawigi.robot.Girl 1.2 | 5.9 | 9.5% | 28 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.7% | 0 |
| lambdaxy.TBot 0.1 | 7.5 | 6.8% | 0 |
| divineomega.TrialBot 0.003 | 9.4 | 5.3% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.6 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 88.9 | 19 / 35 | 4723 |
| 2 | 1 | 66.5 | 81.6 | 17 / 35 | 4535 |
| 3 | 1 | 65.1 | 80.6 | 11 / 35 | 4051 |
| 4 | 1 | 65.3 | 80.6 | 14 / 35 | 4146 |
| 5 | 1 | 67.4 | 84.8 | 18 / 35 | 4483 |
| 6 | 1 | 66.3 | 85.1 | 15 / 35 | 4106 |
| 7 | 1 | 67.0 | 86.3 | 14 / 35 | 4312 |
| 8 | 1 | 66.0 | 82.2 | 15 / 35 | 4254 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 59 | 46% |
| kawigi.micro.Shiz 1.1 | 44 | 86% |
| mld.DustBunny 3.8 | 26 | 100% |
| kawigi.robot.Girl 1.2 | 24 | 75% |
| cb.nano.Insomnia 1.0 | 10 | 90% |
| divineomega.TrialBot 0.003 | 6 | 83% |

Hadur died in 160 of 280 rounds, at a mean tick of 931. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 61 | 38% | 103 |
| kawigi.micro.Shiz 1.1 | 27 | 17% | 53 |
| cb.nano.Insomnia 1.0 | 22 | 14% | 29 |
| mld.DustBunny 3.8 | 20 | 13% | 50 |
| kawigi.robot.Girl 1.2 | 11 | 7% | 17 |
| lambdaxy.TBot 0.1 | 7 | 4% | 8 |
| Grystrion.TrackerWO 1.0 | 5 | 3% | 8 |
| divineomega.TrialBot 0.003 | 3 | 2% | 11 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 271 rounds): 217987 melee ticks, 53025 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (271 rounds): longest scan gap while four or more were alive 56 ticks (271 rounds over 8); rounds whose longest gap at any count was over 8: 271; robots dropped as dead without a death event: 3.

Targeting waves (271 rounds): 72660 sent, 66377 reached their opponent, 11695 virtual hits (17.6% of those reached).

## Melee bench: F16

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 495 over 8 battles (61.9 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.2 | 156 / 280 | 1.97 | 19.1% | 40562 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.1% | 156 |
| gh.Griezel 0.5.2 | 2.0 | 16.4% | 65 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.9% | 9 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 10.4% | 38 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.3% | 2 |
| tvv.nano.Polaris 1.2 | 6.3 | 8.6% | 3 |
| stelo.IntrinsicVolatility 1.4 | 6.5 | 8.1% | 5 |
| repositorio.NanoStep 1.0 | 8.8 | 4.8% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 4.7% | 2 |
| asd.Cthulhu 1.3 | 9.3 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 83.8 | 14 / 35 | 4709 |
| 2 | 1 | 69.0 | 87.6 | 16 / 35 | 5456 |
| 3 | 1 | 70.9 | 93.7 | 23 / 35 | 5352 |
| 4 | 1 | 68.5 | 89.2 | 18 / 35 | 4796 |
| 5 | 1 | 70.5 | 91.4 | 25 / 35 | 5434 |
| 6 | 1 | 68.5 | 87.6 | 19 / 35 | 4705 |
| 7 | 1 | 69.3 | 88.9 | 20 / 35 | 5061 |
| 8 | 1 | 70.0 | 91.4 | 21 / 35 | 5049 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 112 | 68% |
| techdude.forest.FlamingForest 1.1 | 39 | 51% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 31 | 87% |
| bvh.fnr.Fenrir 0.36l | 13 | 100% |
| tvv.nano.Polaris 1.2 | 12 | 83% |
| stelo.IntrinsicVolatility 1.4 | 9 | 78% |
| divineomega.DivineBot 1.9.4.5 | 2 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 127 of 280 rounds, at a mean tick of 1174. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 55 | 43% | 131 |
| techdude.forest.FlamingForest 1.1 | 25 | 20% | 47 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 17 | 13% | 46 |
| bvh.fnr.Fenrir 0.36l | 12 | 9% | 21 |
| stelo.IntrinsicVolatility 1.4 | 10 | 8% | 16 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 10 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 5 |
| asd.Cthulhu 1.3 | 1 | 1% | 2 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 243929 melee ticks, 86540 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 51 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 79001 sent, 73075 reached their opponent, 13542 virtual hits (18.5% of those reached).

## Melee bench: F17

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 607 over 8 battles (75.9 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.2 | 145 / 280 | 2.25 | 18.5% | 40705 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.5% | 145 |
| et.Predator 1.8 | 2.5 | 13.6% | 29 |
| oog.melee.Mercutio 1.0 | 2.9 | 13.0% | 43 |
| cx.BlestPain 1.41 | 3.8 | 12.4% | 49 |
| ahf.NanoAndrew .4 | 5.1 | 10.4% | 11 |
| nic.Nicator 2.4 | 6.0 | 9.2% | 2 |
| maribo.melee.BMV 0.1 | 6.8 | 8.6% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.1 | 6.2% | 1 |
| tex.Longbot 0.4 | 8.9 | 5.5% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 80.6 | 11 / 35 | 4709 |
| 2 | 1 | 69.6 | 90.5 | 24 / 35 | 5061 |
| 3 | 1 | 66.8 | 81.3 | 17 / 35 | 4938 |
| 4 | 1 | 68.5 | 86.7 | 17 / 35 | 5142 |
| 5 | 1 | 69.1 | 87.3 | 19 / 35 | 5313 |
| 6 | 1 | 68.2 | 86.7 | 15 / 35 | 5250 |
| 7 | 1 | 69.9 | 90.2 | 23 / 35 | 5341 |
| 8 | 1 | 68.2 | 86.0 | 19 / 35 | 4951 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 72 | 72% |
| et.Predator 1.8 | 63 | 78% |
| cx.BlestPain 1.41 | 37 | 51% |
| ahf.NanoAndrew .4 | 14 | 93% |
| maribo.melee.BMV 0.1 | 5 | 100% |
| nic.Nicator 2.4 | 5 | 80% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |
| tex.Longbot 0.4 | 1 | 100% |

Hadur died in 139 of 280 rounds, at a mean tick of 1035. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 38 | 27% | 68 |
| et.Predator 1.8 | 35 | 25% | 81 |
| oog.melee.Mercutio 1.0 | 30 | 22% | 73 |
| ahf.NanoAndrew .4 | 15 | 11% | 30 |
| nic.Nicator 2.4 | 8 | 6% | 13 |
| maribo.melee.BMV 0.1 | 5 | 4% | 8 |
| tex.Longbot 0.4 | 3 | 2% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 224146 melee ticks, 77806 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 42 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 1.

Targeting waves (274 rounds): 75880 sent, 69821 reached their opponent, 16076 virtual hits (23.0% of those reached).

## Melee bench: F18

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 397 over 8 battles (49.6 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 92.2 | 181 / 280 | 1.70 | 19.4% | 36010 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.4% | 181 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.6% | 42 |
| agd.Mooserwirt2 2.7 | 3.3 | 12.0% | 20 |
| uji.DBH 1.1 | 4.0 | 11.6% | 12 |
| sigterm.Sigterm 1.0 | 5.8 | 8.7% | 12 |
| ratosh.Nobo 0.21 | 5.9 | 8.5% | 8 |
| spinnercat.Robovirus 2.718 | 6.4 | 8.1% | 4 |
| kawigi.mini.Fhqwhgads 1.1 | 7.9 | 7.2% | 0 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.4 | 5.4% | 1 |
| stelo.WangRobot 1.0 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 90.2 | 19 / 35 | 4228 |
| 2 | 1 | 68.5 | 89.5 | 21 / 35 | 4580 |
| 3 | 1 | 69.7 | 94.3 | 24 / 35 | 4545 |
| 4 | 1 | 69.3 | 92.4 | 22 / 35 | 4570 |
| 5 | 1 | 67.7 | 89.8 | 18 / 35 | 4145 |
| 6 | 1 | 70.0 | 93.3 | 27 / 35 | 4764 |
| 7 | 1 | 70.1 | 94.9 | 26 / 35 | 4577 |
| 8 | 1 | 69.3 | 93.0 | 24 / 35 | 4601 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 83 | 59% |
| uji.DBH 1.1 | 48 | 88% |
| agd.Mooserwirt2 2.7 | 39 | 85% |
| sigterm.Sigterm 1.0 | 23 | 87% |
| stelo.WangRobot 1.0 | 15 | 100% |
| ratosh.Nobo 0.21 | 13 | 77% |
| spinnercat.Robovirus 2.718 | 7 | 86% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |

Hadur died in 100 of 280 rounds, at a mean tick of 885. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 48 | 48% | 117 |
| uji.DBH 1.1 | 15 | 15% | 41 |
| agd.Mooserwirt2 2.7 | 12 | 12% | 41 |
| sigterm.Sigterm 1.0 | 10 | 10% | 27 |
| ratosh.Nobo 0.21 | 9 | 9% | 22 |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 2% | 7 |
| stelo.WangRobot 1.0 | 1 | 1% | 10 |
| spinnercat.Robovirus 2.718 | 1 | 1% | 8 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 1% | 7 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 269 rounds): 187218 melee ticks, 66791 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (269 rounds): longest scan gap while four or more were alive 49 ticks (269 rounds over 8); rounds whose longest gap at any count was over 8: 269; robots dropped as dead without a death event: 2.

Targeting waves (269 rounds): 64111 sent, 58183 reached their opponent, 13627 virtual hits (23.4% of those reached).

## Melee bench: F19

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 383 over 8 battles (47.9 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 96.9 | 250 / 280 | 1.28 | 21.6% | 44713 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 21.6% | 250 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.7% | 16 |
| mld.Infinity 2.2 | 3.5 | 12.3% | 9 |
| krillr.mini.JointStrike 2.0.0 | 3.8 | 11.8% | 2 |
| erdnis.Rover 0.3 | 4.8 | 10.7% | 1 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.5% | 2 |
| mbh.Mbh 0.1 | 7.4 | 7.0% | 0 |
| pac.ABC 2.1 | 7.4 | 7.3% | 1 |
| pbg.R2D2 1.0 | 9.0 | 5.2% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 97.5 | 31 / 35 | 6106 |
| 2 | 1 | 72.4 | 97.1 | 30 / 35 | 5589 |
| 3 | 1 | 71.3 | 92.4 | 27 / 35 | 5422 |
| 4 | 1 | 73.2 | 99.0 | 34 / 35 | 5709 |
| 5 | 1 | 72.2 | 96.5 | 31 / 35 | 5237 |
| 6 | 1 | 72.9 | 97.8 | 32 / 35 | 5854 |
| 7 | 1 | 72.3 | 95.6 | 31 / 35 | 5394 |
| 8 | 1 | 73.1 | 99.7 | 34 / 35 | 5402 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 138 | 95% |
| krillr.mini.JointStrike 2.0.0 | 36 | 97% |
| mld.Infinity 2.2 | 30 | 93% |
| erdnis.Rover 0.3 | 26 | 96% |
| pac.ABC 2.1 | 15 | 100% |
| patson.PatsonTestBot 1.0 | 14 | 93% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 33 of 280 rounds, at a mean tick of 848. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 12 | 36% | 88 |
| krillr.mini.JointStrike 2.0.0 | 7 | 21% | 48 |
| erdnis.Rover 0.3 | 4 | 12% | 39 |
| mld.Infinity 2.2 | 3 | 9% | 43 |
| pac.ABC 2.1 | 2 | 6% | 15 |
| patson.PatsonTestBot 1.0 | 1 | 3% | 27 |
| mbh.Mbh 0.1 | 1 | 3% | 9 |
| pbg.R2D2 1.0 | 0 | 0% | 8 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 266 rounds): 172722 melee ticks, 63738 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (266 rounds): longest scan gap while four or more were alive 50 ticks (266 rounds over 8); rounds whose longest gap at any count was over 8: 266; robots dropped as dead without a death event: 6.

Targeting waves (266 rounds): 59033 sent, 53423 reached their opponent, 13866 virtual hits (26.0% of those reached).

## Melee bench: F20

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 258 over 8 battles (32.3 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 93.1 | 208 / 280 | 1.62 | 20.6% | 43917 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 20.6% | 208 |
| trm.Wrekt 1.1.6.f | 2.0 | 16.0% | 43 |
| fwb.Nine 1.0.1 | 3.8 | 11.1% | 11 |
| catcat20.Rabbit 0.001 | 4.1 | 10.6% | 13 |
| nz.jdc.nano.GridFu 1.0 | 4.3 | 10.5% | 1 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.9% | 3 |
| bayen.nut.Squirrel 1.615 | 7.4 | 6.6% | 2 |
| ntc.ControlledChaos 1.1.4 | 8.1 | 6.0% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.4 | 5.8% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 94.9 | 27 / 35 | 5415 |
| 2 | 1 | 69.6 | 89.2 | 23 / 35 | 5342 |
| 3 | 1 | 70.5 | 91.1 | 25 / 35 | 5283 |
| 4 | 1 | 71.3 | 93.7 | 27 / 35 | 5763 |
| 5 | 1 | 71.3 | 93.7 | 26 / 35 | 5472 |
| 6 | 1 | 70.0 | 90.5 | 22 / 35 | 5306 |
| 7 | 1 | 71.7 | 95.6 | 27 / 35 | 5423 |
| 8 | 1 | 72.3 | 96.2 | 31 / 35 | 5913 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 125 | 87% |
| fwb.Nine 1.0.1 | 46 | 93% |
| catcat20.Rabbit 0.001 | 29 | 86% |
| m3thos.mini.Eva01 0.5.5 | 15 | 93% |
| nz.jdc.nano.GridFu 1.0 | 8 | 100% |
| bayen.nut.Squirrel 1.615 | 4 | 75% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| ntc.ControlledChaos 1.1.4 | 2 | 100% |

Hadur died in 75 of 280 rounds, at a mean tick of 979. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 40 | 53% | 134 |
| catcat20.Rabbit 0.001 | 11 | 15% | 50 |
| fwb.Nine 1.0.1 | 10 | 13% | 30 |
| nz.jdc.nano.GridFu 1.0 | 5 | 7% | 22 |
| m3thos.mini.Eva01 0.5.5 | 3 | 4% | 23 |
| bayen.nut.Squirrel 1.615 | 2 | 3% | 8 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 5 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 270 rounds): 222106 melee ticks, 76064 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (270 rounds): longest scan gap while four or more were alive 31 ticks (270 rounds over 8); rounds whose longest gap at any count was over 8: 270; robots dropped as dead without a death event: 0.

Targeting waves (270 rounds): 71706 sent, 65747 reached their opponent, 16215 virtual hits (24.7% of those reached).

## Melee bench: F21

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 926 over 8 battles (115.8 per battle, most in one battle 223). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 90.4 | 146 / 280 | 1.87 | 19.1% | 40169 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.1% | 146 |
| eem.EvBot v4.6.16 | 2.0 | 17.3% | 102 |
| dummy.mini.Scimitar 1.01 | 3.1 | 13.8% | 10 |
| cf.RiO.RiOx 4.2.1 | 3.9 | 11.8% | 12 |
| eld.Hmm 1.0 | 5.3 | 8.5% | 9 |
| oa.weak.BotherBot 0.1 | 5.8 | 7.8% | 2 |
| fire219.CatBot 1.0 | 7.4 | 6.2% | 0 |
| el.JumpShoot 0.2 | 8.3 | 6.1% | 0 |
| PSW.Relentless 0.1 | 8.5 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 9.9 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 89.2 | 16 / 35 | 5019 |
| 2 | 1 | 69.4 | 92.1 | 18 / 35 | 4835 |
| 3 | 1 | 69.7 | 92.4 | 17 / 35 | 5164 |
| 4 | 1 | 69.6 | 88.6 | 20 / 35 | 5278 |
| 5 | 1 | 68.3 | 85.1 | 18 / 35 | 4764 |
| 6 | 1 | 70.3 | 93.7 | 17 / 35 | 5212 |
| 7 | 1 | 69.5 | 90.5 | 18 / 35 | 4975 |
| 8 | 1 | 69.6 | 91.4 | 22 / 35 | 4922 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 171 | 56% |
| cf.RiO.RiOx 4.2.1 | 27 | 78% |
| dummy.mini.Scimitar 1.01 | 27 | 89% |
| eld.Hmm 1.0 | 10 | 40% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 143 of 280 rounds, at a mean tick of 1320. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 80 | 56% | 142 |
| dummy.mini.Scimitar 1.01 | 25 | 17% | 68 |
| cf.RiO.RiOx 4.2.1 | 16 | 11% | 35 |
| eld.Hmm 1.0 | 7 | 5% | 24 |
| PSW.Relentless 0.1 | 3 | 2% | 3 |
| fire219.CatBot 1.0 | 2 | 1% | 2 |
| el.JumpShoot 0.2 | 1 | 1% | 1 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 4 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
9 death(s) with no robot to name.

Posture (Hadur's M records, 278 rounds): 251250 melee ticks, 110900 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (278 rounds): longest scan gap while four or more were alive 58 ticks (278 rounds over 8); rounds whose longest gap at any count was over 8: 278; robots dropped as dead without a death event: 2.

Targeting waves (278 rounds): 74724 sent, 68660 reached their opponent, 13119 virtual hits (19.1% of those reached).

## Melee bench: F22

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 156 over 8 battles (19.5 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 88.6 | 135 / 280 | 2.03 | 18.0% | 35303 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.0% | 135 |
| pe.SandboxDT 2.71m | 2.1 | 16.3% | 84 |
| kvk.HebusLeTroll 0.35 | 2.9 | 14.6% | 35 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.7% | 22 |
| bigpete.Stewie 1.0 | 5.0 | 10.6% | 5 |
| yk.JahRoslav 1.1 | 6.9 | 7.0% | 1 |
| gg.Squaraus 0.6 | 6.9 | 6.8% | 0 |
| tad.Dalek98 0.98 | 7.4 | 6.5% | 0 |
| pbg.NinjaX 1.2 | 8.9 | 5.0% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 85.4 | 14 / 35 | 4535 |
| 2 | 1 | 68.2 | 88.9 | 18 / 35 | 4427 |
| 3 | 1 | 69.0 | 93.3 | 17 / 35 | 4423 |
| 4 | 1 | 68.6 | 90.2 | 17 / 35 | 4520 |
| 5 | 1 | 68.7 | 88.6 | 23 / 35 | 4442 |
| 6 | 1 | 66.2 | 81.3 | 15 / 35 | 4048 |
| 7 | 1 | 68.3 | 90.2 | 14 / 35 | 4376 |
| 8 | 1 | 69.0 | 90.8 | 17 / 35 | 4532 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 84 | 36% |
| kvk.HebusLeTroll 0.35 | 55 | 80% |
| jlm.javaDisturbance 0.59 | 48 | 75% |
| bigpete.Stewie 1.0 | 21 | 90% |
| yk.JahRoslav 1.1 | 4 | 75% |
| pbg.NinjaX 1.2 | 2 | 100% |
| gg.Squaraus 0.6 | 1 | 100% |

Hadur died in 146 of 280 rounds, at a mean tick of 1029. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 69 | 47% | 107 |
| kvk.HebusLeTroll 0.35 | 36 | 25% | 69 |
| jlm.javaDisturbance 0.59 | 27 | 18% | 65 |
| bigpete.Stewie 1.0 | 7 | 5% | 21 |
| tad.Dalek98 0.98 | 4 | 3% | 5 |
| yk.JahRoslav 1.1 | 2 | 1% | 8 |
| pbg.NinjaX 1.2 | 0 | 0% | 3 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 268 rounds): 214583 melee ticks, 66103 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (268 rounds): longest scan gap while four or more were alive 50 ticks (268 rounds over 8); rounds whose longest gap at any count was over 8: 268; robots dropped as dead without a death event: 0.

Targeting waves (268 rounds): 70305 sent, 64384 reached their opponent, 11382 virtual hits (17.7% of those reached).

## Melee bench: F23

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 556 over 8 battles (69.5 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 94.2 | 223 / 280 | 1.52 | 20.8% | 41741 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 20.8% | 223 |
| pe.SandboxLump 1.52 | 2.0 | 16.9% | 37 |
| cre.Karolos 0.32 | 3.0 | 14.3% | 15 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 9.9% | 2 |
| stelo.RamTrackSurfer 1.2 | 5.3 | 9.2% | 1 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 8.9% | 2 |
| cw.megas.Blade 0.8 | 6.8 | 8.4% | 0 |
| sample.Walls 1.0 | 8.0 | 7.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.1 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 9.9 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 90.2 | 26 / 35 | 5280 |
| 2 | 1 | 72.8 | 97.5 | 30 / 35 | 5200 |
| 3 | 1 | 72.5 | 95.9 | 29 / 35 | 5518 |
| 4 | 1 | 72.3 | 93.7 | 28 / 35 | 5362 |
| 5 | 1 | 73.5 | 98.1 | 31 / 35 | 5616 |
| 6 | 1 | 70.8 | 93.7 | 27 / 35 | 4806 |
| 7 | 1 | 72.3 | 95.9 | 28 / 35 | 4947 |
| 8 | 1 | 70.4 | 89.2 | 24 / 35 | 5012 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 135 | 89% |
| cre.Karolos 0.32 | 66 | 92% |
| stelo.RamTrackSurfer 1.2 | 16 | 94% |
| stelo.AreaTargetingBot 1.1 | 13 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 8 | 75% |
| sample.Walls 1.0 | 6 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 61 of 280 rounds, at a mean tick of 759. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 22 | 36% | 131 |
| cre.Karolos 0.32 | 19 | 31% | 80 |
| stelo.AreaTargetingBot 1.1 | 5 | 8% | 25 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 8% | 13 |
| stelo.RamTrackSurfer 1.2 | 3 | 5% | 17 |
| cw.megas.Blade 0.8 | 2 | 3% | 7 |
| sample.Walls 1.0 | 1 | 2% | 6 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 171983 melee ticks, 62360 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 66 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 3.

Targeting waves (273 rounds): 54816 sent, 48954 reached their opponent, 16020 virtual hits (32.7% of those reached).

## Melee bench: F24

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 786 over 8 battles (98.3 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 79.8 | 102 / 280 | 2.82 | 15.8% | 28083 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.3 | 15.8% | 102 |
| rz.GlowBlowMelee 1.4 | 2.8 | 13.9% | 46 |
| florent.XSeries.X2 0.12 | 3.1 | 13.2% | 43 |
| davidalves.Phoenix 0.54 | 3.5 | 12.7% | 47 |
| pedersen.Ugluk 1.1.1 | 4.5 | 11.6% | 27 |
| oog.melee.Corsair 1.0 | 5.9 | 9.8% | 8 |
| stelo.SoJNanoMelee 1.1 | 7.1 | 7.2% | 5 |
| lunchie.Lunchbox 0.93 | 8.1 | 5.9% | 0 |
| as.FrankTheTank 1.3 | 8.9 | 5.3% | 1 |
| evd.X1 0.01 | 9.9 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.9 | 75.2 | 7 / 35 | 3208 |
| 2 | 1 | 63.4 | 77.5 | 15 / 35 | 3420 |
| 3 | 1 | 62.4 | 77.5 | 11 / 35 | 3169 |
| 4 | 1 | 65.9 | 86.0 | 17 / 35 | 3466 |
| 5 | 1 | 66.1 | 86.0 | 14 / 35 | 3650 |
| 6 | 1 | 64.1 | 77.5 | 12 / 35 | 3952 |
| 7 | 1 | 65.3 | 81.0 | 15 / 35 | 3794 |
| 8 | 1 | 63.3 | 77.8 | 11 / 35 | 3424 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 46 | 65% |
| florent.XSeries.X2 0.12 | 37 | 57% |
| davidalves.Phoenix 0.54 | 26 | 58% |
| pedersen.Ugluk 1.1.1 | 20 | 65% |
| oog.melee.Corsair 1.0 | 16 | 88% |
| as.FrankTheTank 1.3 | 4 | 100% |
| stelo.SoJNanoMelee 1.1 | 4 | 100% |
| evd.X1 0.01 | 1 | 0% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 186 of 280 rounds, at a mean tick of 746. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 45 | 24% | 65 |
| rz.GlowBlowMelee 1.4 | 36 | 19% | 65 |
| davidalves.Phoenix 0.54 | 36 | 19% | 53 |
| pedersen.Ugluk 1.1.1 | 35 | 19% | 43 |
| oog.melee.Corsair 1.0 | 15 | 8% | 36 |
| evd.X1 0.01 | 4 | 2% | 5 |
| stelo.SoJNanoMelee 1.1 | 4 | 2% | 5 |
| as.FrankTheTank 1.3 | 3 | 2% | 4 |
| lunchie.Lunchbox 0.93 | 2 | 1% | 4 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 278 rounds): 190559 melee ticks, 42760 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 60 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (278 rounds): longest scan gap while four or more were alive 60 ticks (278 rounds over 8); rounds whose longest gap at any count was over 8: 278; robots dropped as dead without a death event: 0.

Targeting waves (278 rounds): 64849 sent, 58340 reached their opponent, 11962 virtual hits (20.5% of those reached).

## Melee bench: F25

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 595 over 8 battles (74.4 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 87.2 | 169 / 280 | 2.15 | 18.0% | 28729 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.0% | 169 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.8% | 28 |
| voidious.micro.BlitzBat 1.05 | 2.9 | 13.1% | 20 |
| jdw.Hurricane 1.4 | 3.9 | 11.5% | 25 |
| ds.Oo 2.2 | 5.4 | 9.4% | 13 |
| gre.svman4.Morfeas 1.4.1 | 5.6 | 9.4% | 16 |
| awesomeness.Elite 1.0 | 7.4 | 7.4% | 2 |
| adt.Ar2 1.1 | 8.0 | 6.5% | 3 |
| gjr.Cephalosporin 0.1 | 8.6 | 6.1% | 4 |
| amk.ChumbaMini 0.2 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 82.2 | 16 / 35 | 3081 |
| 2 | 1 | 67.4 | 86.0 | 21 / 35 | 3892 |
| 3 | 1 | 69.0 | 93.3 | 24 / 35 | 3768 |
| 4 | 1 | 68.6 | 91.7 | 25 / 35 | 3774 |
| 5 | 1 | 65.9 | 81.6 | 19 / 35 | 3675 |
| 6 | 1 | 68.0 | 90.2 | 23 / 35 | 3513 |
| 7 | 1 | 67.2 | 87.6 | 22 / 35 | 3582 |
| 8 | 1 | 66.3 | 84.8 | 19 / 35 | 3444 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 66 | 86% |
| voidious.micro.BlitzBat 1.05 | 48 | 94% |
| jdw.Hurricane 1.4 | 38 | 79% |
| ds.Oo 2.2 | 16 | 75% |
| gre.svman4.Morfeas 1.4.1 | 13 | 62% |
| awesomeness.Elite 1.0 | 11 | 91% |
| gjr.Cephalosporin 0.1 | 6 | 50% |
| adt.Ar2 1.1 | 4 | 100% |

Hadur died in 115 of 280 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 23 | 20% | 71 |
| ds.Oo 2.2 | 23 | 20% | 38 |
| voidious.micro.BlitzBat 1.05 | 22 | 19% | 56 |
| jdw.Hurricane 1.4 | 18 | 16% | 45 |
| gjr.Cephalosporin 0.1 | 9 | 8% | 15 |
| gre.svman4.Morfeas 1.4.1 | 8 | 7% | 26 |
| awesomeness.Elite 1.0 | 4 | 3% | 17 |
| adt.Ar2 1.1 | 4 | 3% | 8 |
| amk.ChumbaMini 0.2 | 0 | 0% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 271 rounds): 174441 melee ticks, 37231 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (271 rounds): longest scan gap while four or more were alive 46 ticks (271 rounds over 8); rounds whose longest gap at any count was over 8: 271; robots dropped as dead without a death event: 0.

Targeting waves (271 rounds): 61863 sent, 55983 reached their opponent, 10157 virtual hits (18.1% of those reached).

## Melee bench: F26

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 388 over 8 battles (48.5 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 89.8 | 185 / 280 | 1.92 | 19.4% | 42937 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.4% | 185 |
| ak.Fermat 2.0 | 2.0 | 15.3% | 44 |
| shu.nitro.LENIN .T34 | 3.5 | 12.5% | 26 |
| lrem.Spectre 0.4.4 | 3.6 | 12.0% | 10 |
| js.PinBall 1.6 | 5.3 | 10.6% | 5 |
| jaybot.adv.bots.JayBot 2.0 | 5.8 | 9.8% | 6 |
| gh.mini.GrubbmOne 1.0 | 7.1 | 7.9% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 7.1% | 4 |
| sample.SpinBot 1.0 | 9.0 | 3.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 86.3 | 22 / 35 | 5229 |
| 2 | 1 | 69.6 | 87.9 | 22 / 35 | 5374 |
| 3 | 1 | 71.6 | 94.3 | 29 / 35 | 5502 |
| 4 | 1 | 70.4 | 92.4 | 25 / 35 | 5137 |
| 5 | 1 | 70.2 | 89.2 | 22 / 35 | 5537 |
| 6 | 1 | 71.0 | 93.0 | 26 / 35 | 5661 |
| 7 | 1 | 69.7 | 89.8 | 19 / 35 | 5334 |
| 8 | 1 | 68.3 | 85.4 | 20 / 35 | 5163 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 83 | 81% |
| lrem.Spectre 0.4.4 | 54 | 91% |
| shu.nitro.LENIN .T34 | 49 | 84% |
| js.PinBall 1.6 | 15 | 93% |
| jaybot.adv.bots.JayBot 2.0 | 10 | 70% |
| fullsail.LaxativeTeaTwo 1.0 | 8 | 75% |
| gh.mini.GrubbmOne 1.0 | 1 | 100% |

Hadur died in 98 of 280 rounds, at a mean tick of 858. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 40 | 41% | 103 |
| shu.nitro.LENIN .T34 | 19 | 19% | 64 |
| jaybot.adv.bots.JayBot 2.0 | 15 | 15% | 25 |
| lrem.Spectre 0.4.4 | 12 | 12% | 54 |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 5% | 10 |
| js.PinBall 1.6 | 4 | 4% | 18 |
| sample.SpinBot 1.0 | 1 | 1% | 2 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 269 rounds): 205271 melee ticks, 64881 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (269 rounds): longest scan gap while four or more were alive 33 ticks (269 rounds over 8); rounds whose longest gap at any count was over 8: 269; robots dropped as dead without a death event: 0.

Targeting waves (269 rounds): 69931 sent, 63857 reached their opponent, 17007 virtual hits (26.6% of those reached).

## Melee bench: F27

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 671 over 8 battles (83.9 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 76.0 | 162 / 280 | 3.16 | 17.0% | 36404 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.6 | 14.9% | 65 |
| hadur2.Hadur 3.17.1bb | 1.9 | 17.0% | 162 |
| EH.Eagle 1.0.6 | 4.1 | 10.2% | 7 |
| wee.Gem 1.8.4 | 4.6 | 10.3% | 27 |
| sheldor.melee.nano.TestMelee 0.1 | 4.9 | 9.7% | 10 |
| techdude.kombat.FlamingKombat 1.5 | 5.8 | 9.0% | 2 |
| joe.ADinosaur 1.0 | 6.1 | 8.8% | 4 |
| throxbot.ThroxBot 0.1 | 7.4 | 8.3% | 3 |
| caimano.Furia_Ceca 0.22 | 9.0 | 6.2% | 1 |
| cs.Grudge 1.0 | 9.6 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 92.7 | 27 / 35 | 4688 |
| 2 | 2 | 61.5 | 60.3 | 15 / 35 | 4604 |
| 3 | 6 | 45.7 | 29.5 | 5 / 35 | 3500 |
| 4 | 1 | 69.7 | 91.7 | 25 / 35 | 4817 |
| 5 | 1 | 70.8 | 94.6 | 28 / 35 | 5173 |
| 6 | 2 | 58.6 | 55.2 | 9 / 35 | 4336 |
| 7 | 1 | 70.8 | 94.9 | 30 / 35 | 4879 |
| 8 | 1 | 68.1 | 88.9 | 23 / 35 | 4407 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 109 | 84% |
| EH.Eagle 1.0.6 | 25 | 100% |
| wee.Gem 1.8.4 | 16 | 75% |
| techdude.kombat.FlamingKombat 1.5 | 10 | 100% |
| throxbot.ThroxBot 0.1 | 9 | 89% |
| sheldor.melee.nano.TestMelee 0.1 | 7 | 86% |
| caimano.Furia_Ceca 0.22 | 7 | 86% |
| joe.ADinosaur 1.0 | 4 | 75% |

Hadur died in 124 of 280 rounds, at a mean tick of 499. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 32 | 26% | 110 |
| cs.Grudge 1.0 | 30 | 24% | 31 |
| joe.ADinosaur 1.0 | 17 | 14% | 22 |
| wee.Gem 1.8.4 | 10 | 8% | 24 |
| throxbot.ThroxBot 0.1 | 8 | 6% | 18 |
| caimano.Furia_Ceca 0.22 | 8 | 6% | 14 |
| techdude.kombat.FlamingKombat 1.5 | 6 | 5% | 14 |
| EH.Eagle 1.0.6 | 4 | 3% | 28 |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 3% | 18 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 277 rounds): 161912 melee ticks, 42952 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (277 rounds): longest scan gap while four or more were alive 55 ticks (277 rounds over 8); rounds whose longest gap at any count was over 8: 277; robots dropped as dead without a death event: 0.

Targeting waves (277 rounds): 54416 sent, 48543 reached their opponent, 13303 virtual hits (27.4% of those reached).

## Melee bench: F28

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 257 over 8 battles (32.1 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 90.6 | 181 / 280 | 1.84 | 18.5% | 30358 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.5% | 181 |
| kid.test.NightFox .2 | 2.0 | 14.9% | 41 |
| uji.Antique 1.0 | 3.4 | 11.8% | 28 |
| pfvicm.Sobieski 7.2.3b | 4.4 | 10.4% | 4 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.6% | 16 |
| amk.ChumbaWumba 0.3 | 6.1 | 8.3% | 2 |
| ahr.ice.Ice 1.0.2 | 6.6 | 7.9% | 4 |
| matt.advanced.Katana 1.0 | 8.4 | 6.4% | 3 |
| stelo.Lifestealer 1.0 | 9.3 | 5.6% | 0 |
| stelo.PianistNano 1.2 | 9.4 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 90.8 | 23 / 35 | 3769 |
| 2 | 1 | 67.0 | 87.6 | 21 / 35 | 3626 |
| 3 | 1 | 68.0 | 91.1 | 20 / 35 | 3939 |
| 4 | 1 | 67.8 | 88.9 | 22 / 35 | 3636 |
| 5 | 1 | 68.5 | 92.4 | 24 / 35 | 3815 |
| 6 | 1 | 68.3 | 92.1 | 24 / 35 | 3708 |
| 7 | 1 | 68.1 | 91.1 | 25 / 35 | 3715 |
| 8 | 1 | 68.4 | 91.1 | 22 / 35 | 4150 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 100 | 80% |
| uji.Antique 1.0 | 56 | 89% |
| qohnil.blot.BlotBot 3.61 | 32 | 75% |
| pfvicm.Sobieski 7.2.3b | 14 | 86% |
| amk.ChumbaWumba 0.3 | 9 | 100% |
| ahr.ice.Ice 1.0.2 | 5 | 40% |
| matt.advanced.Katana 1.0 | 4 | 75% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 101 of 280 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 26 | 26% | 68 |
| uji.Antique 1.0 | 21 | 21% | 76 |
| pfvicm.Sobieski 7.2.3b | 19 | 19% | 37 |
| qohnil.blot.BlotBot 3.61 | 12 | 12% | 40 |
| ahr.ice.Ice 1.0.2 | 11 | 11% | 18 |
| amk.ChumbaWumba 0.3 | 6 | 6% | 22 |
| matt.advanced.Katana 1.0 | 3 | 3% | 11 |
| stelo.Lifestealer 1.0 | 2 | 2% | 5 |
| stelo.PianistNano 1.2 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 268 rounds): 175008 melee ticks, 50337 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (268 rounds): longest scan gap while four or more were alive 33 ticks (268 rounds over 8); rounds whose longest gap at any count was over 8: 268; robots dropped as dead without a death event: 1.

Targeting waves (268 rounds): 59861 sent, 54035 reached their opponent, 8779 virtual hits (16.2% of those reached).

## Melee bench: F29

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 360 over 8 battles (45.0 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 85.2 | 127 / 280 | 2.33 | 17.9% | 33474 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.1 | 17.9% | 127 |
| deewiant.Anomaly 0.2 | 2.1 | 15.6% | 66 |
| zyx.mega.YersiniaPestis 3.1 | 2.8 | 15.1% | 63 |
| myl.micro.Troodon 1.10 | 4.1 | 11.5% | 9 |
| jok.PheonixM 0.1.2 | 5.0 | 10.5% | 10 |
| ph.melee.ArcherME 0.3 | 5.9 | 8.5% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 7.5 | 6.1% | 0 |
| DBall.Anarchy 0.1 | 7.6 | 5.9% | 2 |
| ap.Frederick 1.1 | 9.0 | 4.9% | 2 |
| jangs.ns51 1.0 | 9.9 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 86.0 | 14 / 35 | 4144 |
| 2 | 2 | 65.6 | 78.1 | 10 / 35 | 3984 |
| 3 | 1 | 68.0 | 85.1 | 16 / 35 | 4305 |
| 4 | 1 | 67.8 | 85.7 | 15 / 35 | 4469 |
| 5 | 1 | 68.1 | 88.3 | 16 / 35 | 3995 |
| 6 | 1 | 70.2 | 92.1 | 21 / 35 | 4737 |
| 7 | 1 | 65.3 | 78.4 | 14 / 35 | 3818 |
| 8 | 1 | 68.8 | 87.9 | 21 / 35 | 4022 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 90 | 61% |
| zyx.mega.YersiniaPestis 3.1 | 53 | 55% |
| myl.micro.Troodon 1.10 | 20 | 95% |
| jok.PheonixM 0.1.2 | 19 | 79% |
| DBall.Anarchy 0.1 | 4 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| ph.melee.ArcherME 0.3 | 2 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |

Hadur died in 156 of 280 rounds, at a mean tick of 975. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 64 | 41% | 118 |
| zyx.mega.YersiniaPestis 3.1 | 54 | 35% | 88 |
| jok.PheonixM 0.1.2 | 15 | 10% | 28 |
| myl.micro.Troodon 1.10 | 13 | 8% | 32 |
| ph.melee.ArcherME 0.3 | 4 | 3% | 7 |
| DBall.Anarchy 0.1 | 2 | 1% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 2 |
| jangs.ns51 1.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 229844 melee ticks, 64107 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 1023 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 276 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (275 rounds): 75671 sent, 69559 reached their opponent, 11834 virtual hits (17.0% of those reached).

## Melee bench: F30

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1005 over 8 battles (125.6 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 75.8 | 51 / 280 | 3.18 | 14.5% | 27379 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.8 | 14.5% | 51 |
| catcat20.Matcha 0.006 | 2.1 | 14.2% | 78 |
| darkcanuck.B26354 1.06 | 2.8 | 13.4% | 55 |
| oog.melee.Capulet 1.2 | 4.1 | 12.4% | 38 |
| stelo.PastFuture 2.3.2 | 4.3 | 12.1% | 23 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.3% | 19 |
| ntc.Opposite 1.5 | 7.8 | 7.2% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 8.1 | 7.3% | 10 |
| tripphippy.Alice 1.1 | 8.1 | 7.2% | 5 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 81.9 | 9 / 35 | 3599 |
| 2 | 4 | 58.5 | 67.6 | 1 / 35 | 3054 |
| 3 | 1 | 63.4 | 78.1 | 9 / 35 | 3726 |
| 4 | 1 | 61.2 | 73.0 | 7 / 35 | 3255 |
| 5 | 1 | 63.2 | 80.0 | 7 / 35 | 3586 |
| 6 | 2 | 62.6 | 75.9 | 9 / 35 | 3345 |
| 7 | 2 | 61.2 | 73.7 | 6 / 35 | 3365 |
| 8 | 2 | 61.3 | 75.9 | 3 / 35 | 3449 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 38 | 39% |
| darkcanuck.B26354 1.06 | 29 | 28% |
| oog.melee.Capulet 1.2 | 27 | 41% |
| stelo.PastFuture 2.3.2 | 19 | 58% |
| intruder.PrairieWolf 2.61 | 11 | 36% |
| fowl3628800.LightningBolt 2.6.0 | 5 | 20% |
| tripphippy.Alice 1.1 | 2 | 50% |
| ntc.Opposite 1.5 | 1 | 0% |

Hadur died in 239 of 280 rounds, at a mean tick of 925. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 54 | 23% | 63 |
| catcat20.Matcha 0.006 | 53 | 22% | 66 |
| oog.melee.Capulet 1.2 | 40 | 17% | 51 |
| stelo.PastFuture 2.3.2 | 37 | 15% | 50 |
| intruder.PrairieWolf 2.61 | 19 | 8% | 21 |
| tripphippy.Alice 1.1 | 9 | 4% | 10 |
| fowl3628800.LightningBolt 2.6.0 | 9 | 4% | 9 |
| ntc.Opposite 1.5 | 7 | 3% | 7 |
| GarmBox.Anger 1.0 | 3 | 1% | 3 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 221408 melee ticks, 39125 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 72 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 71365 sent, 65313 reached their opponent, 11666 virtual hits (17.9% of those reached).

## Melee bench: F31

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 978 over 8 battles (122.3 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 74.5 | 55 / 280 | 3.29 | 14.2% | 24905 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.6% | 145 |
| hadur2.Hadur 3.17.1bb | 2.1 | 14.2% | 55 |
| gh.mini.Griezel 0.2 | 3.1 | 13.0% | 57 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.4% | 7 |
| spinnercat.micro.Tyger 0.1 | 4.6 | 10.9% | 9 |
| gh.nano.Grofvuil 0.2 | 5.9 | 9.3% | 3 |
| timmit.nano.TimDog 0.33 | 7.4 | 6.6% | 3 |
| fm.mammillarias 1.3 | 7.9 | 6.0% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.9 | 5.1% | 2 |
| tlp.ThreeLeggedPig 1 | 9.9 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.3 | 75.2 | 8 / 35 | 3308 |
| 2 | 2 | 65.0 | 84.4 | 10 / 35 | 3220 |
| 3 | 2 | 62.0 | 74.6 | 8 / 35 | 3167 |
| 4 | 2 | 62.5 | 74.9 | 6 / 35 | 3492 |
| 5 | 3 | 60.5 | 71.7 | 6 / 35 | 3015 |
| 6 | 2 | 60.7 | 70.8 | 6 / 35 | 2981 |
| 7 | 2 | 61.2 | 74.3 | 6 / 35 | 2873 |
| 8 | 2 | 59.5 | 70.2 | 5 / 35 | 2849 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 58 | 33% |
| gh.mini.Griezel 0.2 | 32 | 31% |
| d414.nano.Quantum 1.0.0 | 16 | 81% |
| spinnercat.micro.Tyger 0.1 | 10 | 70% |
| gh.nano.Grofvuil 0.2 | 6 | 83% |
| timmit.nano.TimDog 0.33 | 2 | 50% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 0% |

Hadur died in 233 of 280 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 90 | 39% | 112 |
| gh.mini.Griezel 0.2 | 45 | 19% | 57 |
| d414.nano.Quantum 1.0.0 | 27 | 12% | 37 |
| spinnercat.micro.Tyger 0.1 | 26 | 11% | 30 |
| gh.nano.Grofvuil 0.2 | 11 | 5% | 16 |
| timmit.nano.TimDog 0.33 | 10 | 4% | 12 |
| fm.mammillarias 1.3 | 9 | 4% | 9 |
| Gecko.ultimateGeckoBot 1.0 | 5 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 200599 melee ticks, 34947 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 41 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 1.

Targeting waves (274 rounds): 66311 sent, 60081 reached their opponent, 10502 virtual hits (17.5% of those reached).

## Melee bench: F32

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 383 over 8 battles (47.9 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 89.2 | 157 / 280 | 1.98 | 18.1% | 33265 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.1% | 157 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.5% | 81 |
| apc.botM 3.0 | 3.1 | 11.5% | 20 |
| lxx.ConceptA 0.8 | 4.1 | 10.4% | 4 |
| bayen.UbaMicro 1.4 | 5.4 | 9.2% | 5 |
| vjik.UnViolation 1.1 | 5.5 | 9.2% | 5 |
| yk.JahMicro 1.0 | 7.9 | 7.1% | 4 |
| panzer.Panzer 0.2 | 8.1 | 7.1% | 0 |
| conscience.Electron 1.3g | 8.3 | 6.6% | 1 |
| donjezza.Jezza 1.0 | 9.6 | 5.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 88.3 | 23 / 35 | 4113 |
| 2 | 1 | 67.7 | 87.9 | 20 / 35 | 4353 |
| 3 | 1 | 66.6 | 86.3 | 20 / 35 | 4159 |
| 4 | 1 | 66.4 | 87.6 | 17 / 35 | 3986 |
| 5 | 1 | 67.0 | 89.5 | 17 / 35 | 4209 |
| 6 | 1 | 68.1 | 91.4 | 20 / 35 | 4328 |
| 7 | 1 | 67.3 | 88.9 | 20 / 35 | 4175 |
| 8 | 1 | 67.8 | 93.3 | 20 / 35 | 3942 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 114 | 58% |
| apc.botM 3.0 | 44 | 80% |
| lxx.ConceptA 0.8 | 22 | 91% |
| vjik.UnViolation 1.1 | 13 | 77% |
| yk.JahMicro 1.0 | 13 | 85% |
| bayen.UbaMicro 1.4 | 8 | 63% |
| donjezza.Jezza 1.0 | 6 | 100% |
| panzer.Panzer 0.2 | 4 | 100% |
| conscience.Electron 1.3g | 1 | 0% |

Hadur died in 125 of 280 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 56 | 45% | 115 |
| lxx.ConceptA 0.8 | 22 | 18% | 38 |
| apc.botM 3.0 | 15 | 12% | 52 |
| bayen.UbaMicro 1.4 | 11 | 9% | 21 |
| vjik.UnViolation 1.1 | 9 | 7% | 26 |
| yk.JahMicro 1.0 | 4 | 3% | 15 |
| panzer.Panzer 0.2 | 3 | 2% | 5 |
| conscience.Electron 1.3g | 3 | 2% | 3 |
| donjezza.Jezza 1.0 | 0 | 0% | 5 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 269 rounds): 168742 melee ticks, 65413 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (269 rounds): longest scan gap while four or more were alive 57 ticks (269 rounds over 8); rounds whose longest gap at any count was over 8: 269; robots dropped as dead without a death event: 0.

Targeting waves (269 rounds): 58310 sent, 52435 reached their opponent, 10756 virtual hits (20.5% of those reached).

## Melee bench: F33

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 837 over 8 battles (104.6 per battle, most in one battle 247). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.3 | 152 / 280 | 2.15 | 18.5% | 36089 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.5% | 152 |
| maribo.Quester 0.3 | 2.0 | 15.8% | 51 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.7% | 28 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 10.9% | 17 |
| labg.Cataclysm 2.05 | 4.8 | 10.7% | 27 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.1 | 8.9% | 5 |
| baal.nano.N 1.42 | 6.4 | 8.6% | 0 |
| zyx.micro.Ant 1.1 | 8.5 | 5.2% | 0 |
| sanja.First 0.1 | 8.9 | 5.0% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.6 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 84.4 | 18 / 35 | 4055 |
| 2 | 1 | 69.0 | 88.6 | 21 / 35 | 4577 |
| 3 | 1 | 69.3 | 88.9 | 20 / 35 | 4685 |
| 4 | 1 | 64.6 | 77.1 | 9 / 35 | 3995 |
| 5 | 1 | 69.9 | 92.1 | 23 / 35 | 4643 |
| 6 | 1 | 68.8 | 88.9 | 18 / 35 | 4620 |
| 7 | 1 | 69.1 | 86.7 | 22 / 35 | 4625 |
| 8 | 1 | 69.9 | 91.4 | 21 / 35 | 4889 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 80 | 73% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 45 | 71% |
| gre.svman4.Leonidas 1.3.2 | 39 | 85% |
| labg.Cataclysm 2.05 | 23 | 52% |
| kinsen.melee.Angsaichmophobia 1.8c | 12 | 83% |
| baal.nano.N 1.42 | 5 | 100% |
| sanja.First 0.1 | 2 | 100% |

Hadur died in 134 of 280 rounds, at a mean tick of 1023. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 46 | 34% | 97 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 19% | 66 |
| gre.svman4.Leonidas 1.3.2 | 21 | 16% | 46 |
| labg.Cataclysm 2.05 | 19 | 14% | 36 |
| kinsen.melee.Angsaichmophobia 1.8c | 11 | 8% | 16 |
| baal.nano.N 1.42 | 2 | 1% | 10 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 1% | 2 |
| zyx.micro.Ant 1.1 | 1 | 1% | 3 |
| sanja.First 0.1 | 1 | 1% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 234201 melee ticks, 71615 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 55 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 0.

Targeting waves (273 rounds): 75207 sent, 69090 reached their opponent, 11234 virtual hits (16.3% of those reached).

## Melee bench: F34

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 936 over 8 battles (117.0 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 86.6 | 104 / 280 | 2.20 | 17.7% | 37302 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.7% | 104 |
| stelo.Spread 0.9 | 2.1 | 16.3% | 83 |
| kid.Gladiator .7.2 | 2.9 | 15.9% | 60 |
| jcs.Seth 1.8 | 4.5 | 11.2% | 22 |
| tcf.Reach 3 | 4.5 | 11.2% | 11 |
| cli.Dancer 1.1 | 6.0 | 9.4% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.1% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.3% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.5% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 86.7 | 13 / 35 | 4556 |
| 2 | 1 | 68.6 | 86.7 | 16 / 35 | 4773 |
| 3 | 1 | 67.8 | 87.9 | 11 / 35 | 4617 |
| 4 | 1 | 67.2 | 83.5 | 10 / 35 | 4788 |
| 5 | 1 | 69.2 | 90.2 | 20 / 35 | 4593 |
| 6 | 1 | 68.4 | 89.2 | 14 / 35 | 4507 |
| 7 | 1 | 66.9 | 82.5 | 10 / 35 | 4659 |
| 8 | 1 | 67.8 | 86.3 | 10 / 35 | 4809 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 101 | 51% |
| kid.Gladiator .7.2 | 62 | 45% |
| jcs.Seth 1.8 | 19 | 47% |
| tcf.Reach 3 | 14 | 64% |
| cli.Dancer 1.1 | 5 | 100% |
| ratosh.Wesco 1.4 | 2 | 50% |

Hadur died in 184 of 280 rounds, at a mean tick of 1114. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 80 | 43% | 128 |
| kid.Gladiator .7.2 | 57 | 31% | 81 |
| jcs.Seth 1.8 | 17 | 9% | 31 |
| tcf.Reach 3 | 17 | 9% | 27 |
| ratosh.Wesco 1.4 | 3 | 2% | 6 |
| cli.Dancer 1.1 | 2 | 1% | 7 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 240832 melee ticks, 71531 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 103 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 103 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 0.

Targeting waves (275 rounds): 74628 sent, 68581 reached their opponent, 12535 virtual hits (18.3% of those reached).

## Melee bench: F35

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 879 over 8 battles (109.9 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 78.8 | 48 / 280 | 2.91 | 14.8% | 25478 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.5% | 185 |
| hadur2.Hadur 3.17.1bb | 2.1 | 14.8% | 48 |
| gh.mini.Gruwel 0.9 | 3.3 | 13.0% | 22 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.1 | 12.3% | 19 |
| rz.HawkOnFire 0.1 | 4.5 | 11.9% | 6 |
| wit.Chuliath 1.0 | 6.0 | 7.2% | 1 |
| myl.nano.KomoriNinja 1.1 | 7.3 | 6.2% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.1 | 5.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.7% | 0 |
| dans.Cinnamon 1.2 | 9.4 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.0 | 76.8 | 5 / 35 | 3696 |
| 2 | 2 | 63.8 | 80.3 | 6 / 35 | 3311 |
| 3 | 2 | 63.6 | 78.7 | 7 / 35 | 3382 |
| 4 | 2 | 64.2 | 81.3 | 9 / 35 | 3217 |
| 5 | 2 | 63.7 | 83.5 | 8 / 35 | 2949 |
| 6 | 2 | 60.3 | 71.4 | 3 / 35 | 2802 |
| 7 | 3 | 62.5 | 77.8 | 2 / 35 | 3115 |
| 8 | 2 | 63.3 | 80.6 | 8 / 35 | 3006 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 104 | 14% |
| dmh.robocode.robot.BlackDeath 9.2 | 18 | 89% |
| gh.mini.Gruwel 0.9 | 15 | 40% |
| rz.HawkOnFire 0.1 | 9 | 100% |
| wit.Chuliath 1.0 | 1 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 240 of 280 rounds, at a mean tick of 900. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 133 | 55% | 147 |
| gh.mini.Gruwel 0.9 | 33 | 14% | 39 |
| dmh.robocode.robot.BlackDeath 9.2 | 31 | 13% | 50 |
| rz.HawkOnFire 0.1 | 22 | 9% | 28 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7 | 3% | 8 |
| myl.nano.KomoriNinja 1.1 | 3 | 1% | 3 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |
| wit.Chuliath 1.0 | 1 | 0% | 1 |
| dans.Cinnamon 1.2 | 1 | 0% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 198107 melee ticks, 54593 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 41 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 2.

Targeting waves (274 rounds): 62258 sent, 56116 reached their opponent, 9525 virtual hits (17.0% of those reached).

## Melee bench: F36

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 298 over 8 battles (37.3 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 89.7 | 188 / 280 | 1.93 | 19.5% | 38407 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.5% | 188 |
| bzdp.Pansy 2.1 | 2.6 | 12.3% | 17 |
| alpha.RainingFire 1.0 | 3.0 | 12.5% | 24 |
| bvh.micro.Freya 0.3 | 4.3 | 11.1% | 15 |
| mz.Cork 0.1 | 4.9 | 10.9% | 15 |
| bvh.mini.Fenrir 0.39 | 5.8 | 9.9% | 5 |
| m3thos.Eva02 0.7.1 | 6.5 | 9.3% | 10 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 5.6% | 0 |
| dl.BetterWalls 1.0 | 9.1 | 5.0% | 1 |
| sample.MyFirstRobot 1.0 | 9.9 | 3.9% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 93.0 | 25 / 35 | 5137 |
| 2 | 1 | 70.3 | 92.1 | 25 / 35 | 4764 |
| 3 | 1 | 69.7 | 87.9 | 25 / 35 | 4927 |
| 4 | 1 | 68.7 | 90.2 | 20 / 35 | 4590 |
| 5 | 1 | 68.8 | 85.7 | 25 / 35 | 4666 |
| 6 | 1 | 69.1 | 89.8 | 23 / 35 | 4583 |
| 7 | 1 | 68.7 | 86.7 | 23 / 35 | 4770 |
| 8 | 1 | 69.9 | 92.4 | 22 / 35 | 4970 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 50 | 86% |
| bvh.micro.Freya 0.3 | 48 | 88% |
| mz.Cork 0.1 | 42 | 88% |
| alpha.RainingFire 1.0 | 41 | 71% |
| bvh.mini.Fenrir 0.39 | 19 | 89% |
| m3thos.Eva02 0.7.1 | 16 | 81% |
| sample.MyFirstRobot 1.0 | 7 | 100% |

Hadur died in 95 of 280 rounds, at a mean tick of 842. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 23 | 24% | 62 |
| bzdp.Pansy 2.1 | 17 | 18% | 66 |
| mz.Cork 0.1 | 16 | 17% | 56 |
| bvh.micro.Freya 0.3 | 16 | 17% | 43 |
| m3thos.Eva02 0.7.1 | 10 | 11% | 27 |
| bvh.mini.Fenrir 0.39 | 8 | 8% | 12 |
| sample.MyFirstRobot 1.0 | 3 | 3% | 7 |
| squidM.TentalceMeleeNano 1.1 | 1 | 1% | 3 |
| dl.BetterWalls 1.0 | 0 | 0% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 269 rounds): 194884 melee ticks, 57893 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (269 rounds): longest scan gap while four or more were alive 49 ticks (268 rounds over 8); rounds whose longest gap at any count was over 8: 268; robots dropped as dead without a death event: 0.

Targeting waves (269 rounds): 67504 sent, 61729 reached their opponent, 13945 virtual hits (22.6% of those reached).

## Melee bench: F37

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 511 over 8 battles (63.9 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 86.5 | 208 / 280 | 2.21 | 18.5% | 40849 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.5% | 208 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.5 | 11.1% | 12 |
| EBBU.Sim2 1.02 | 3.8 | 9.8% | 6 |
| germ.TheMind .2 | 4.3 | 9.8% | 14 |
| stelo.UntouchableNano 1.3 | 5.9 | 9.2% | 11 |
| lmk.ACPFinal 0.1 | 5.9 | 8.9% | 7 |
| agrach.Dalek 1.0 | 7.0 | 8.7% | 11 |
| mn.nano.perceptual.Impact 1.3.0 | 7.8 | 8.4% | 2 |
| mb.Beast 0.1 | 8.3 | 8.0% | 7 |
| skm.Ryubot 1.0 | 8.8 | 7.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 86.3 | 26 / 35 | 4861 |
| 2 | 1 | 67.1 | 85.4 | 25 / 35 | 5093 |
| 3 | 1 | 66.3 | 82.9 | 23 / 35 | 5199 |
| 4 | 1 | 67.2 | 85.4 | 28 / 35 | 5039 |
| 5 | 1 | 68.9 | 93.3 | 30 / 35 | 4956 |
| 6 | 1 | 67.0 | 85.1 | 24 / 35 | 5271 |
| 7 | 1 | 66.9 | 85.4 | 24 / 35 | 5167 |
| 8 | 1 | 68.2 | 88.6 | 28 / 35 | 5263 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| EBBU.Sim2 1.02 | 40 | 100% |
| germ.TheMind .2 | 31 | 94% |
| skm.Ryubot 1.0 | 29 | 97% |
| agrach.Dalek 1.0 | 26 | 100% |
| stelo.UntouchableNano 1.3 | 26 | 85% |
| lmk.ACPFinal 0.1 | 24 | 92% |
| com.syncleus.robocode.Dreadnaught 0.1 | 23 | 96% |
| mb.Beast 0.1 | 17 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 67% |

Hadur died in 77 of 280 rounds, at a mean tick of 401. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 17 | 22% | 28 |
| com.syncleus.robocode.Dreadnaught 0.1 | 13 | 17% | 41 |
| stelo.UntouchableNano 1.3 | 11 | 14% | 35 |
| lmk.ACPFinal 0.1 | 9 | 12% | 33 |
| agrach.Dalek 1.0 | 8 | 10% | 41 |
| germ.TheMind .2 | 6 | 8% | 27 |
| EBBU.Sim2 1.02 | 4 | 5% | 42 |
| mb.Beast 0.1 | 4 | 5% | 20 |
| skm.Ryubot 1.0 | 2 | 3% | 10 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 268 rounds): 126005 melee ticks, 33802 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 44 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (268 rounds): longest scan gap while four or more were alive 44 ticks (268 rounds over 8); rounds whose longest gap at any count was over 8: 268; robots dropped as dead without a death event: 0.

Targeting waves (268 rounds): 42941 sent, 37589 reached their opponent, 12551 virtual hits (33.4% of those reached).

## Melee bench: F38

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 363 over 8 battles (45.4 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 85.2 | 134 / 280 | 2.34 | 17.2% | 32777 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.4 | 16.9% | 97 |
| hadur2.Hadur 3.17.1bb | 1.6 | 17.2% | 134 |
| bvh.mini.Freya 0.55 | 3.0 | 12.6% | 14 |
| cs.Wren 1.0 | 4.6 | 10.4% | 8 |
| bts.mega.Gnarly 1.4 | 4.8 | 10.7% | 19 |
| kdf.KoulDestroyer 1.0 | 5.9 | 9.4% | 6 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.8 | 8.8% | 0 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.3 | 5.9% | 1 |
| matt.UnderDark3 2.4.34 | 9.0 | 4.4% | 1 |
| bzdp.BoxCar 2.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.7 | 85.7 | 15 / 35 | 4025 |
| 2 | 1 | 68.9 | 91.1 | 25 / 35 | 4216 |
| 3 | 1 | 67.5 | 88.9 | 20 / 35 | 3860 |
| 4 | 2 | 66.6 | 86.0 | 14 / 35 | 4094 |
| 5 | 2 | 65.3 | 80.6 | 16 / 35 | 3802 |
| 6 | 2 | 66.3 | 82.2 | 17 / 35 | 4204 |
| 7 | 2 | 65.8 | 82.5 | 12 / 35 | 4164 |
| 8 | 1 | 66.7 | 84.1 | 15 / 35 | 4412 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 88 | 64% |
| bvh.mini.Freya 0.55 | 37 | 81% |
| bts.mega.Gnarly 1.4 | 31 | 61% |
| kdf.KoulDestroyer 1.0 | 16 | 88% |
| cs.Wren 1.0 | 13 | 85% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |
| davidalves.net.DuelistNanoMelee 1.01 | 1 | 100% |

Hadur died in 150 of 280 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 65 | 43% | 123 |
| bvh.mini.Freya 0.55 | 25 | 17% | 41 |
| bts.mega.Gnarly 1.4 | 18 | 12% | 40 |
| cs.Wren 1.0 | 18 | 12% | 28 |
| kdf.KoulDestroyer 1.0 | 13 | 9% | 24 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 2% | 8 |
| davidalves.net.DuelistNanoMelee 1.01 | 2 | 1% | 8 |
| bzdp.BoxCar 2.0 | 2 | 1% | 4 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 271 rounds): 189562 melee ticks, 47429 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (271 rounds): longest scan gap while four or more were alive 47 ticks (271 rounds over 8); rounds whose longest gap at any count was over 8: 271; robots dropped as dead without a death event: 0.

Targeting waves (271 rounds): 62936 sent, 56608 reached their opponent, 13205 virtual hits (23.3% of those reached).

## Melee bench: F39

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 519 over 8 battles (64.9 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 86.3 | 136 / 280 | 2.24 | 17.8% | 36159 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.8% | 136 |
| bvh.fry.Freya 0.82 | 2.0 | 14.6% | 23 |
| az.Ololobot 0.2.4 | 3.4 | 12.4% | 66 |
| catcat20.Lambda 0.024 | 3.6 | 11.8% | 40 |
| gimp.GimpBot 0.1 | 6.0 | 8.3% | 3 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.8% | 7 |
| stelo.SoRobotNanoMelee 1.2 | 6.6 | 7.9% | 4 |
| apollokidd.ApolloKidd 0.9 | 7.4 | 7.6% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.1 | 5.8% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.9 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 86.7 | 18 / 35 | 4583 |
| 2 | 1 | 68.1 | 88.3 | 20 / 35 | 4878 |
| 3 | 1 | 68.1 | 88.6 | 21 / 35 | 4700 |
| 4 | 1 | 67.6 | 88.6 | 17 / 35 | 4657 |
| 5 | 1 | 67.0 | 87.6 | 15 / 35 | 4390 |
| 6 | 1 | 63.9 | 78.4 | 12 / 35 | 3996 |
| 7 | 1 | 66.2 | 84.8 | 16 / 35 | 4505 |
| 8 | 1 | 66.6 | 87.3 | 17 / 35 | 4450 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 62 | 52% |
| bvh.fry.Freya 0.82 | 61 | 92% |
| catcat20.Lambda 0.024 | 48 | 54% |
| winamp32.micro.MicroMacro 1.0 | 10 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 7 | 100% |
| gimp.GimpBot 0.1 | 5 | 80% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |

Hadur died in 149 of 280 rounds, at a mean tick of 1036. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 46 | 31% | 86 |
| az.Ololobot 0.2.4 | 46 | 31% | 80 |
| catcat20.Lambda 0.024 | 32 | 21% | 57 |
| winamp32.micro.MicroMacro 1.0 | 6 | 4% | 21 |
| gimp.GimpBot 0.1 | 5 | 3% | 17 |
| apollokidd.ApolloKidd 0.9 | 5 | 3% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 3 | 2% | 8 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 1% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 226392 melee ticks, 65962 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 756 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 144 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 4.

Targeting waves (274 rounds): 72100 sent, 66051 reached their opponent, 13069 virtual hits (19.8% of those reached).

## Melee bench: F40

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 272 over 8 battles (34.0 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.5 | 173 / 280 | 2.04 | 18.9% | 36751 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.9% | 173 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.7% | 46 |
| mz.AntiGrav 1.0 | 3.5 | 11.8% | 14 |
| kano.gamma.KanoGamma 1.8 | 3.6 | 11.8% | 20 |
| Polkwane.SmashMelee 1.0 | 5.5 | 10.1% | 8 |
| alpha.BlackIce 1.0 | 6.1 | 9.0% | 2 |
| stelo.Randomness 1.0 | 6.3 | 9.2% | 14 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.7% | 3 |
| testantiswapgun.AntiSwap 1.0 | 9.4 | 4.2% | 0 |
| sample.Corners 1.0 | 9.6 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 89.5 | 23 / 35 | 4744 |
| 2 | 1 | 69.5 | 90.2 | 24 / 35 | 4717 |
| 3 | 1 | 69.3 | 90.2 | 23 / 35 | 4630 |
| 4 | 1 | 68.7 | 86.7 | 22 / 35 | 4677 |
| 5 | 1 | 67.6 | 87.3 | 16 / 35 | 4203 |
| 6 | 1 | 68.8 | 88.3 | 21 / 35 | 4583 |
| 7 | 1 | 69.9 | 91.7 | 25 / 35 | 4549 |
| 8 | 1 | 67.8 | 83.8 | 19 / 35 | 4648 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 85 | 79% |
| kano.gamma.KanoGamma 1.8 | 38 | 92% |
| mz.AntiGrav 1.0 | 37 | 97% |
| stelo.Randomness 1.0 | 18 | 67% |
| Polkwane.SmashMelee 1.0 | 17 | 94% |
| alpha.BlackIce 1.0 | 7 | 86% |
| amk.superstrike.SuperStrike 0.3 | 3 | 33% |

Hadur died in 109 of 280 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 32 | 29% | 75 |
| kano.gamma.KanoGamma 1.8 | 21 | 19% | 68 |
| Polkwane.SmashMelee 1.0 | 15 | 14% | 30 |
| mz.AntiGrav 1.0 | 14 | 13% | 42 |
| stelo.Randomness 1.0 | 11 | 10% | 27 |
| amk.superstrike.SuperStrike 0.3 | 8 | 7% | 13 |
| alpha.BlackIce 1.0 | 6 | 6% | 12 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 7 |
| sample.Corners 1.0 | 0 | 0% | 6 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 270 rounds): 201816 melee ticks, 54573 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (270 rounds): longest scan gap while four or more were alive 80 ticks (270 rounds over 8); rounds whose longest gap at any count was over 8: 270; robots dropped as dead without a death event: 0.

Targeting waves (270 rounds): 67522 sent, 61381 reached their opponent, 13834 virtual hits (22.5% of those reached).

## Melee bench: F41

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 743 over 8 battles (92.9 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 86.8 | 138 / 280 | 2.19 | 17.5% | 30745 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.1 | 17.5% | 138 |
| eem.EvBotNG v12.8 | 1.9 | 16.2% | 96 |
| ary.Swarm 1.1 | 3.4 | 12.8% | 13 |
| lessonz.robocode.Oz 0.5.0 | 3.9 | 12.3% | 18 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 11.0% | 11 |
| shrub.Silver v048 | 6.0 | 9.4% | 3 |
| zyx.nano.Ant 1.1 | 7.0 | 7.8% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 5.6% | 1 |
| stelo.Mirror 1.1 | 8.8 | 5.0% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 85.7 | 16 / 35 | 3815 |
| 2 | 1 | 67.7 | 88.3 | 19 / 35 | 3734 |
| 3 | 1 | 66.7 | 87.3 | 16 / 35 | 3787 |
| 4 | 1 | 67.4 | 87.0 | 16 / 35 | 3760 |
| 5 | 2 | 65.8 | 81.9 | 11 / 35 | 3659 |
| 6 | 1 | 69.7 | 92.1 | 25 / 35 | 4277 |
| 7 | 1 | 68.2 | 90.2 | 19 / 35 | 3974 |
| 8 | 1 | 65.7 | 82.2 | 16 / 35 | 3739 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 106 | 44% |
| lessonz.robocode.Oz 0.5.0 | 37 | 86% |
| ary.Swarm 1.1 | 33 | 91% |
| simonton.nano.MeleeSeed 1.8 | 23 | 87% |
| shrub.Silver v048 | 5 | 80% |
| jsal.Jsalbot 1.0 | 3 | 67% |
| stelo.Mirror 1.1 | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 150 of 280 rounds, at a mean tick of 964. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 75 | 50% | 120 |
| lessonz.robocode.Oz 0.5.0 | 23 | 15% | 44 |
| simonton.nano.MeleeSeed 1.8 | 19 | 13% | 35 |
| ary.Swarm 1.1 | 18 | 12% | 45 |
| jsal.Jsalbot 1.0 | 4 | 3% | 8 |
| shrub.Silver v048 | 3 | 2% | 20 |
| acogdev.alpha 0.2 | 1 | 1% | 2 |
| zyx.nano.Ant 1.1 | 1 | 1% | 2 |
| stelo.Mirror 1.1 | 0 | 0% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 207939 melee ticks, 69292 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 57 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 0.

Targeting waves (275 rounds): 70382 sent, 64210 reached their opponent, 11017 virtual hits (17.2% of those reached).

## Melee bench: F42

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 533 over 8 battles (66.6 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 91.9 | 187 / 280 | 1.73 | 19.9% | 42781 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.9% | 187 |
| wompi.Wallaby 5.1 | 2.1 | 15.5% | 48 |
| maribo.mini.MiniQuester 0.1 | 3.4 | 13.5% | 12 |
| ara.Shera 0.88 | 3.5 | 13.1% | 31 |
| amz.NanoClone 1.41 | 5.1 | 8.5% | 0 |
| dsw.StaticD 1.0 | 6.4 | 7.2% | 2 |
| maribo.IotaCT 1.1 | 6.9 | 6.7% | 0 |
| stelo.MirrorMicro 1.0 | 8.1 | 5.8% | 1 |
| mme.NikeEnhanced 2.0 | 8.9 | 5.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.6 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 91.4 | 22 / 35 | 5143 |
| 2 | 1 | 70.7 | 94.0 | 26 / 35 | 5491 |
| 3 | 1 | 69.1 | 87.9 | 22 / 35 | 5069 |
| 4 | 1 | 70.8 | 94.3 | 24 / 35 | 5295 |
| 5 | 1 | 71.1 | 94.9 | 25 / 35 | 5461 |
| 6 | 1 | 70.6 | 92.1 | 26 / 35 | 5510 |
| 7 | 1 | 69.8 | 90.5 | 23 / 35 | 5251 |
| 8 | 1 | 69.9 | 90.5 | 19 / 35 | 5561 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 115 | 89% |
| maribo.mini.MiniQuester 0.1 | 58 | 93% |
| ara.Shera 0.88 | 38 | 63% |
| dsw.StaticD 1.0 | 5 | 100% |
| amz.NanoClone 1.41 | 2 | 100% |

Hadur died in 100 of 280 rounds, at a mean tick of 969. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 37 | 37% | 63 |
| maribo.mini.MiniQuester 0.1 | 26 | 26% | 74 |
| wompi.Wallaby 5.1 | 25 | 25% | 121 |
| dsw.StaticD 1.0 | 4 | 4% | 14 |
| amz.NanoClone 1.41 | 3 | 3% | 7 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 269 rounds): 224824 melee ticks, 67257 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (269 rounds): longest scan gap while four or more were alive 62 ticks (269 rounds over 8); rounds whose longest gap at any count was over 8: 269; robots dropped as dead without a death event: 3.

Targeting waves (269 rounds): 71627 sent, 65863 reached their opponent, 14419 virtual hits (21.9% of those reached).

## Melee bench: F43

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 955 over 8 battles (119.4 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 80.3 | 40 / 280 | 2.78 | 15.1% | 27166 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.9% | 192 |
| hadur2.Hadur 3.17.1bb | 2.0 | 15.1% | 40 |
| brainfade.melee.Dusk 0.44 | 3.0 | 13.1% | 40 |
| dummy.micro.Sparrow 2.5 | 4.1 | 11.1% | 4 |
| wcsv.melee.EngineerMelee 0.1 | 4.9 | 10.5% | 5 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.7% | 0 |
| mz.NanoGod 2.02 | 7.5 | 7.7% | 1 |
| jab.DiamondStealer 5 | 7.5 | 7.6% | 1 |
| cvt.Firsty 1.0 | 9.0 | 3.9% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 77.8 | 5 / 35 | 3280 |
| 2 | 2 | 66.5 | 85.4 | 4 / 35 | 3655 |
| 3 | 2 | 65.2 | 81.6 | 5 / 35 | 3490 |
| 4 | 2 | 62.9 | 77.1 | 4 / 35 | 3073 |
| 5 | 2 | 63.5 | 77.5 | 4 / 35 | 3093 |
| 6 | 2 | 65.6 | 80.3 | 6 / 35 | 3781 |
| 7 | 2 | 65.8 | 83.2 | 8 / 35 | 3517 |
| 8 | 2 | 64.5 | 79.4 | 4 / 35 | 3277 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 110 | 17% |
| brainfade.melee.Dusk 0.44 | 31 | 45% |
| wcsv.melee.EngineerMelee 0.1 | 7 | 71% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |
| jab.DiamondStealer 5 | 1 | 0% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 251 of 280 rounds, at a mean tick of 1026. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 153 | 61% | 173 |
| brainfade.melee.Dusk 0.44 | 36 | 14% | 48 |
| dummy.micro.Sparrow 2.5 | 25 | 10% | 26 |
| wcsv.melee.EngineerMelee 0.1 | 17 | 7% | 23 |
| mz.NanoGod 2.02 | 5 | 2% | 5 |
| Krabb.akim2.Akim2 1.1b | 3 | 1% | 4 |
| jab.DiamondStealer 5 | 1 | 0% | 1 |
11 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 220990 melee ticks, 68057 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 35 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 0.

Targeting waves (276 rounds): 70870 sent, 64514 reached their opponent, 11507 virtual hits (17.8% of those reached).

## Melee bench: F44

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 518 over 8 battles (64.8 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 90.5 | 179 / 280 | 1.85 | 19.6% | 40390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.6% | 179 |
| stelo.Liblix 0.3.1 | 2.1 | 15.3% | 60 |
| tzu.TheArtOfWar 1.2 | 2.9 | 13.9% | 30 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.3 | 10.0% | 6 |
| jwirde.Gort 2.0 | 5.0 | 9.5% | 6 |
| wompi.Quokka 1.6 | 6.3 | 8.1% | 1 |
| disan.Chair 2.2.0 | 7.0 | 7.4% | 0 |
| stf.PanzerGeneral 0.1 | 7.5 | 6.7% | 0 |
| sample.Crazy 1.0 | 9.1 | 5.0% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.9 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 95.9 | 25 / 35 | 5212 |
| 2 | 1 | 69.5 | 90.2 | 26 / 35 | 4779 |
| 3 | 1 | 69.8 | 90.5 | 22 / 35 | 5180 |
| 4 | 1 | 70.1 | 91.4 | 22 / 35 | 5238 |
| 5 | 1 | 68.4 | 87.0 | 21 / 35 | 4718 |
| 6 | 1 | 70.5 | 92.4 | 23 / 35 | 5173 |
| 7 | 1 | 69.7 | 90.2 | 24 / 35 | 5051 |
| 8 | 1 | 68.5 | 86.7 | 16 / 35 | 5039 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 109 | 66% |
| tzu.TheArtOfWar 1.2 | 67 | 91% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 18 | 83% |
| jwirde.Gort 2.0 | 15 | 87% |
| disan.Chair 2.2.0 | 9 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| stf.PanzerGeneral 0.1 | 3 | 100% |
| wompi.Quokka 1.6 | 2 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 105 of 280 rounds, at a mean tick of 928. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 53 | 50% | 134 |
| tzu.TheArtOfWar 1.2 | 25 | 24% | 79 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 10 | 10% | 21 |
| jwirde.Gort 2.0 | 7 | 7% | 25 |
| stf.PanzerGeneral 0.1 | 3 | 3% | 8 |
| disan.Chair 2.2.0 | 1 | 1% | 5 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 1 |
| wompi.Quokka 1.6 | 0 | 0% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 208121 melee ticks, 63362 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 66 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 0.

Targeting waves (272 rounds): 73175 sent, 67177 reached their opponent, 15370 virtual hits (22.9% of those reached).

## Melee bench: F45

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1115 over 8 battles (139.4 per battle, most in one battle 241). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 87.2 | 124 / 280 | 2.15 | 19.0% | 41301 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.0% | 124 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 12.7% | 119 |
| jje.BagPuss 1.2 | 3.3 | 11.9% | 9 |
| sul.Lunar 1.1 | 4.4 | 10.8% | 16 |
| myl.nano.Graviton 1.10 | 4.5 | 10.4% | 3 |
| hvilela.HVilela 0.9 | 6.6 | 8.8% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 6.9 | 8.3% | 2 |
| fm.claire 1.7 | 7.4 | 8.1% | 0 |
| wit.Deep7 2.0 | 8.9 | 5.7% | 7 |
| abud.ThirdRobo 1.0 | 9.9 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 86.0 | 17 / 35 | 5343 |
| 2 | 1 | 67.7 | 85.7 | 13 / 35 | 5022 |
| 3 | 1 | 69.3 | 88.6 | 19 / 35 | 5288 |
| 4 | 1 | 70.1 | 91.4 | 21 / 35 | 5268 |
| 5 | 1 | 67.1 | 82.2 | 11 / 35 | 5332 |
| 6 | 1 | 67.7 | 85.4 | 12 / 35 | 5027 |
| 7 | 1 | 68.1 | 89.2 | 14 / 35 | 4645 |
| 8 | 1 | 69.2 | 88.9 | 17 / 35 | 5376 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 121 | 44% |
| jje.BagPuss 1.2 | 27 | 85% |
| sul.Lunar 1.1 | 20 | 85% |
| myl.nano.Graviton 1.10 | 14 | 93% |
| wit.Deep7 2.0 | 9 | 89% |
| pez.mini.ChironexFleckeri 0.5 | 8 | 100% |
| hvilela.HVilela 0.9 | 2 | 100% |

Hadur died in 167 of 280 rounds, at a mean tick of 1715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 74 | 44% | 0 |
| jje.BagPuss 1.2 | 25 | 15% | 84 |
| sul.Lunar 1.1 | 20 | 12% | 76 |
| myl.nano.Graviton 1.10 | 16 | 10% | 56 |
| pez.mini.ChironexFleckeri 0.5 | 7 | 4% | 22 |
| fm.claire 1.7 | 7 | 4% | 14 |
| hvilela.HVilela 0.9 | 6 | 4% | 11 |
| wit.Deep7 2.0 | 1 | 1% | 11 |
| abud.ThirdRobo 1.0 | 1 | 1% | 5 |
10 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 290637 melee ticks, 134349 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 41 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 2.

Targeting waves (274 rounds): 87022 sent, 81217 reached their opponent, 13070 virtual hits (16.1% of those reached).

## Melee bench: F46

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 654 over 8 battles (81.8 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 81.5 | 72 / 280 | 2.66 | 15.7% | 30148 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.2% | 98 |
| rsalesc.melee.Medina 0.4.5 | 2.1 | 16.1% | 93 |
| hadur2.Hadur 3.17.1bb | 2.6 | 15.7% | 72 |
| mz.MicroSheep 1.0 | 4.3 | 10.9% | 7 |
| cx.Princess 1.0 | 5.3 | 9.8% | 6 |
| sadoner.killer 0.2 | 5.5 | 9.7% | 2 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.8% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.4 | 5.3% | 1 |
| kurios.DOSexe .9a | 8.6 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.5 | 84.1 | 9 / 35 | 3706 |
| 2 | 3 | 64.5 | 79.0 | 9 / 35 | 3885 |
| 3 | 3 | 65.1 | 83.2 | 10 / 35 | 3576 |
| 4 | 2 | 65.5 | 81.3 | 9 / 35 | 4229 |
| 5 | 2 | 66.2 | 85.1 | 11 / 35 | 3727 |
| 6 | 3 | 63.1 | 75.2 | 10 / 35 | 3603 |
| 7 | 3 | 63.7 | 82.2 | 6 / 35 | 3411 |
| 8 | 2 | 64.7 | 82.2 | 8 / 35 | 4011 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 89 | 61% |
| rsalesc.melee.Medina 0.4.5 | 47 | 15% |
| mz.MicroSheep 1.0 | 9 | 78% |
| cx.Princess 1.0 | 8 | 38% |
| arthord.NanoSatanMelee Beta | 2 | 50% |
| jeremyreeder.collective.Prophet 5 | 1 | 0% |
| sadoner.killer 0.2 | 1 | 0% |

Hadur died in 213 of 280 rounds, at a mean tick of 928. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 78 | 37% | 121 |
| rsalesc.melee.Medina 0.4.5 | 78 | 37% | 85 |
| mz.MicroSheep 1.0 | 13 | 6% | 19 |
| sadoner.killer 0.2 | 13 | 6% | 18 |
| arthord.NanoSatanMelee Beta | 12 | 6% | 17 |
| cx.Princess 1.0 | 11 | 5% | 15 |
| jeremyreeder.collective.Prophet 5 | 3 | 1% | 3 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 279 rounds): 208764 melee ticks, 58634 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (279 rounds): longest scan gap while four or more were alive 35 ticks (279 rounds over 8); rounds whose longest gap at any count was over 8: 279; robots dropped as dead without a death event: 0.

Targeting waves (279 rounds): 62433 sent, 56279 reached their opponent, 9324 virtual hits (16.6% of those reached).

