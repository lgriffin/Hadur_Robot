# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 244 over 6 battles (40.7 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 85.7 | 51 / 210 | 2.29 | 17.4% | 31791 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.2 | 19.7% | 136 |
| hadur2.Hadur 3.18o2 | 1.8 | 17.4% | 51 |
| sgp.JollyNinja 3.53 | 3.5 | 11.5% | 17 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 11.0% | 2 |
| mz.MicroGodMelee 1 | 5.0 | 10.2% | 2 |
| lorneswork.Predator 1.0 | 5.5 | 9.6% | 3 |
| adt.Ar2 1.0 | 7.0 | 7.7% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.5% | 0 |
| skm.butterfly 1.0 | 8.7 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.7 | 83.5 | 11 / 35 | 5017 |
| 2 | 2 | 67.5 | 85.7 | 7 / 35 | 5338 |
| 3 | 2 | 68.4 | 88.6 | 7 / 35 | 5722 |
| 4 | 2 | 66.5 | 83.8 | 8 / 35 | 5234 |
| 5 | 2 | 66.8 | 84.8 | 6 / 35 | 5002 |
| 6 | 1 | 68.3 | 87.6 | 12 / 35 | 5478 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 120 | 12% |
| sgp.JollyNinja 3.53 | 19 | 63% |
| mz.MicroGodMelee 1 | 10 | 90% |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 100% |
| adt.Ar2 1.0 | 5 | 80% |
| lorneswork.Predator 1.0 | 2 | 100% |

Hadur died in 162 of 210 rounds, at a mean tick of 1181. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 121 | 75% | 140 |
| lorneswork.Predator 1.0 | 12 | 7% | 16 |
| sgp.JollyNinja 3.53 | 11 | 7% | 17 |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 4% | 15 |
| mz.MicroGodMelee 1 | 5 | 3% | 13 |
| adt.Ar2 1.0 | 3 | 2% | 6 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 141081 melee ticks, 89908 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 80 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 45432 sent, 40657 reached their opponent, 8437 virtual hits (20.8% of those reached).

## Melee bench: F02

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 219 over 6 battles (36.5 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 84.1 | 87 / 210 | 2.43 | 17.8% | 28454 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.0 | 17.8% | 87 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.2% | 47 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.0 | 13.5% | 34 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.1% | 5 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.7 | 10.6% | 10 |
| Noran.BitchingElk 0.054 | 6.8 | 8.0% | 16 |
| sch.Simone 0.3d | 6.8 | 7.7% | 7 |
| fnc.bandit.Bandit 5.2.0 | 7.5 | 7.7% | 0 |
| stelo.PatternRobot 1.0 | 8.8 | 5.5% | 4 |
| fullsail.SweetTea 1.1 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.9 | 18 / 35 | 5005 |
| 2 | 1 | 67.0 | 84.4 | 15 / 35 | 4445 |
| 3 | 1 | 67.0 | 85.1 | 13 / 35 | 4733 |
| 4 | 1 | 66.5 | 81.9 | 12 / 35 | 4884 |
| 5 | 1 | 66.7 | 81.0 | 16 / 35 | 4801 |
| 6 | 1 | 66.9 | 84.1 | 13 / 35 | 4586 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 42 | 45% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 35 | 60% |
| com.cohesiva.robocode.ManOwaR 1.0 | 24 | 79% |
| Noran.BitchingElk 0.054 | 15 | 33% |
| sch.Simone 0.3d | 14 | 64% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 89% |
| fnc.bandit.Bandit 5.2.0 | 3 | 100% |
| stelo.PatternRobot 1.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 988. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 30 | 24% | 49 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 26 | 21% | 52 |
| com.cohesiva.robocode.ManOwaR 1.0 | 17 | 14% | 41 |
| lrem.micro.SpikeSoldier 0.4 | 17 | 14% | 21 |
| Noran.BitchingElk 0.054 | 14 | 11% | 15 |
| sch.Simone 0.3d | 11 | 9% | 17 |
| stelo.PatternRobot 1.0 | 5 | 4% | 6 |
| fnc.bandit.Bandit 5.2.0 | 3 | 2% | 5 |
| fullsail.SweetTea 1.1 | 0 | 0% | 3 |

Posture (Hadur's M records, 202 rounds): 164506 melee ticks, 43381 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 49 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 60107 sent, 55366 reached their opponent, 9492 virtual hits (17.1% of those reached).

## Melee bench: F03

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 175 over 6 battles (29.2 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 91.5 | 164 / 210 | 1.77 | 20.3% | 37040 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.0 | 20.3% | 164 |
| radnor.DoctorBob 1.42 | 2.5 | 14.0% | 18 |
| kawigi.nano.Lib 1.0 | 2.8 | 12.9% | 11 |
| vuen.Cake 2.51 | 3.7 | 12.1% | 15 |
| urdos.URDOS 1.3 | 5.0 | 8.9% | 0 |
| adt.Ar1 2.1 | 6.3 | 7.8% | 0 |
| oa.weak.FlyMk1 0.1 | 7.3 | 6.7% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 6.7% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.3 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.7 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 95.2 | 27 / 35 | 6257 |
| 2 | 1 | 69.9 | 91.7 | 25 / 35 | 5978 |
| 3 | 1 | 69.0 | 86.3 | 27 / 35 | 5815 |
| 4 | 1 | 71.6 | 94.3 | 28 / 35 | 6494 |
| 5 | 1 | 71.0 | 90.8 | 28 / 35 | 6642 |
| 6 | 1 | 70.1 | 90.5 | 29 / 35 | 5854 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 69 | 99% |
| vuen.Cake 2.51 | 57 | 91% |
| kawigi.nano.Lib 1.0 | 36 | 94% |
| oa.weak.FlyMk1 0.1 | 5 | 100% |
| urdos.URDOS 1.3 | 2 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 0% |

Hadur died in 46 of 210 rounds, at a mean tick of 658. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 16 | 35% | 66 |
| kawigi.nano.Lib 1.0 | 9 | 20% | 50 |
| vuen.Cake 2.51 | 7 | 15% | 55 |
| adt.Ar1 2.1 | 5 | 11% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 9% | 4 |
| ghent.ArthurPanzergon 1.0.0 | 3 | 7% | 4 |
| urdos.URDOS 1.3 | 2 | 4% | 7 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 13 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 123368 melee ticks, 37677 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 38 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 38008 sent, 33432 reached their opponent, 8794 virtual hits (26.3% of those reached).

## Melee bench: F04

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 651 over 6 battles (108.5 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 84.2 | 27 / 210 | 2.42 | 17.0% | 31689 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.8% | 166 |
| hadur2.Hadur 3.18o2 | 2.0 | 17.0% | 27 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.5% | 7 |
| TNT.TNT 0.99.1 | 4.0 | 10.9% | 6 |
| josago.Jorgito 0.16 | 5.2 | 9.3% | 2 |
| css.Delitioner 0.11 | 6.2 | 7.4% | 1 |
| tj.zombie1n 1.0.1 | 6.8 | 6.5% | 1 |
| rampancy.Durandal 2.1d | 7.8 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.5% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.8 | 81.6 | 3 / 35 | 5173 |
| 2 | 2 | 67.6 | 82.9 | 5 / 35 | 5304 |
| 3 | 2 | 67.4 | 85.1 | 6 / 35 | 5183 |
| 4 | 2 | 69.1 | 88.6 | 10 / 35 | 5457 |
| 5 | 2 | 67.3 | 83.5 | 2 / 35 | 5495 |
| 6 | 2 | 66.2 | 83.5 | 1 / 35 | 5077 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 117 | 10% |
| apc.LeeroyJenkins2 1.0 | 14 | 71% |
| TNT.TNT 0.99.1 | 8 | 50% |
| spin.Bugstard 0.012b | 1 | 100% |
| css.Delitioner 0.11 | 1 | 0% |
| josago.Jorgito 0.16 | 1 | 0% |
| tj.zombie1n 1.0.1 | 1 | 0% |

Hadur died in 188 of 210 rounds, at a mean tick of 1226. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 123 | 65% | 140 |
| apc.LeeroyJenkins2 1.0 | 26 | 14% | 33 |
| TNT.TNT 0.99.1 | 13 | 7% | 17 |
| josago.Jorgito 0.16 | 10 | 5% | 10 |
| css.Delitioner 0.11 | 8 | 4% | 8 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |
| tj.zombie1n 1.0.1 | 1 | 1% | 0 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 196695 melee ticks, 61780 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 104 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 104 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 2.

Targeting waves (208 rounds): 61230 sent, 56271 reached their opponent, 8700 virtual hits (15.5% of those reached).

## Melee bench: F05

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 641 over 6 battles (106.8 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 76.9 | 26 / 210 | 3.08 | 14.7% | 22618 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.4% | 110 |
| justin.DemonicRage 3.4 | 2.0 | 16.7% | 53 |
| hadur2.Hadur 3.18o2 | 3.0 | 14.7% | 26 |
| wompi.Numbat 2.1 | 4.0 | 12.6% | 11 |
| axeBots.HataMoto 3.09 | 5.3 | 9.3% | 9 |
| ms.Ares 0.19 | 5.7 | 9.2% | 1 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.5 | 5.4% | 0 |
| supersample.SuperBoxBot 1.0 | 7.7 | 5.5% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.0 | 4.3% | 0 |
| GarmBox.Oranges 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.5 | 76.2 | 5 / 35 | 3838 |
| 2 | 3 | 64.1 | 78.7 | 6 / 35 | 3962 |
| 3 | 3 | 63.3 | 78.4 | 3 / 35 | 3691 |
| 4 | 3 | 62.9 | 75.6 | 5 / 35 | 3540 |
| 5 | 3 | 62.4 | 74.9 | 1 / 35 | 3625 |
| 6 | 3 | 63.8 | 77.8 | 6 / 35 | 3962 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 41 | 10% |
| justin.DemonicRage 3.4 | 27 | 33% |
| wompi.Numbat 2.1 | 13 | 69% |
| ms.Ares 0.19 | 4 | 100% |
| axeBots.HataMoto 3.09 | 2 | 0% |

Hadur died in 190 of 210 rounds, at a mean tick of 900. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 70 | 37% | 75 |
| justin.DemonicRage 3.4 | 56 | 29% | 62 |
| wompi.Numbat 2.1 | 34 | 18% | 44 |
| axeBots.HataMoto 3.09 | 10 | 5% | 10 |
| ms.Ares 0.19 | 9 | 5% | 13 |
| supersample.SuperBoxBot 1.0 | 5 | 3% | 5 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 155462 melee ticks, 35729 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 64 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (208 rounds): 49138 sent, 44138 reached their opponent, 7678 virtual hits (17.4% of those reached).

## Melee bench: F06

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 242 over 6 battles (40.3 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 90.6 | 131 / 210 | 1.85 | 19.7% | 31925 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.0 | 19.7% | 131 |
| jekl.StoneGhost 0.7 | 2.0 | 14.7% | 19 |
| origin.SleepSiphon 1.7b | 3.2 | 13.3% | 39 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.4% | 12 |
| mld.Wisdom 1.0 | 5.0 | 9.7% | 1 |
| gg.Wolverine 2.0 | 6.3 | 7.9% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 6.7 | 7.7% | 8 |
| spinnercat.Omen 1.0 | 8.5 | 5.9% | 0 |
| DBall.NUKE 0.1 | 8.5 | 5.8% | 0 |
| sample.Fire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 87.3 | 21 / 35 | 5289 |
| 2 | 1 | 70.4 | 91.7 | 20 / 35 | 5493 |
| 3 | 1 | 70.3 | 93.0 | 23 / 35 | 5395 |
| 4 | 1 | 71.0 | 93.0 | 24 / 35 | 5486 |
| 5 | 1 | 69.7 | 89.2 | 22 / 35 | 5226 |
| 6 | 1 | 69.2 | 89.2 | 21 / 35 | 5036 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 57 | 86% |
| origin.SleepSiphon 1.7b | 42 | 62% |
| pe.minimelee.SandboxMiniMelee 1.1 | 35 | 94% |
| ers.nano.hawk.HawkLA 3.0m | 11 | 73% |
| gg.Wolverine 2.0 | 9 | 100% |
| mld.Wisdom 1.0 | 4 | 75% |
| DBall.NUKE 0.1 | 1 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 30 | 37% | 56 |
| jekl.StoneGhost 0.7 | 26 | 32% | 72 |
| pe.minimelee.SandboxMiniMelee 1.1 | 9 | 11% | 41 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 10% | 15 |
| mld.Wisdom 1.0 | 4 | 5% | 12 |
| gg.Wolverine 2.0 | 1 | 1% | 9 |
| spinnercat.Omen 1.0 | 1 | 1% | 2 |
| DBall.NUKE 0.1 | 1 | 1% | 1 |
| sample.Fire 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 148892 melee ticks, 42131 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 272 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 186 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 46705 sent, 42072 reached their opponent, 9443 virtual hits (22.4% of those reached).

## Melee bench: F07

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 397 over 6 battles (66.2 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 92.6 | 113 / 210 | 1.67 | 20.5% | 38182 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.0 | 20.5% | 113 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 16.8% | 44 |
| rtk.Tachikoma 1.0 | 2.7 | 15.6% | 29 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.5% | 11 |
| franzor.Lizt 1.3.1 | 4.7 | 11.4% | 13 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.0% | 0 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.5% | 0 |
| sample.Target 1.0 | 9.2 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 92.7 | 20 / 35 | 6704 |
| 2 | 1 | 71.2 | 90.5 | 15 / 35 | 6197 |
| 3 | 1 | 72.1 | 94.0 | 19 / 35 | 6327 |
| 4 | 1 | 72.8 | 94.9 | 21 / 35 | 6559 |
| 5 | 1 | 71.4 | 92.1 | 19 / 35 | 5981 |
| 6 | 1 | 72.2 | 91.4 | 19 / 35 | 6414 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 73 | 71% |
| franzor.Lizt 1.3.1 | 42 | 76% |
| rsalesc.melee.Monk 0.3.6c | 37 | 19% |
| oog.melee.CapuletDroid 1.1 | 29 | 76% |

Hadur died in 100 of 210 rounds, at a mean tick of 1385. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 38 | 38% | 109 |
| rsalesc.melee.Monk 0.3.6c | 38 | 38% | 59 |
| oog.melee.CapuletDroid 1.1 | 11 | 11% | 36 |
| franzor.Lizt 1.3.1 | 10 | 10% | 1 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 4 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 195794 melee ticks, 82795 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 38 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 57841 sent, 53085 reached their opponent, 10815 virtual hits (20.4% of those reached).

## Melee bench: F08

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 758 over 6 battles (126.3 per battle, most in one battle 161). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 88.9 | 129 / 210 | 2.00 | 19.1% | 29406 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.0 | 19.1% | 129 |
| shrub.Vapour v159 | 2.2 | 13.1% | 23 |
| tm.Yuugao 1.0 | 2.8 | 12.6% | 27 |
| Krabb.sliNk.Garm 0.9u | 4.3 | 10.7% | 14 |
| com.spp.robocode.MostlyHarmless 010 | 5.2 | 9.6% | 10 |
| m3thos.Eva00 1.1 | 5.5 | 9.5% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 7.0 | 8.3% | 5 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 7.0% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 5.0% | 0 |
| SHAM.WOW 1.4 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 88.9 | 21 / 35 | 5142 |
| 2 | 1 | 69.3 | 90.5 | 22 / 35 | 4814 |
| 3 | 1 | 69.3 | 90.8 | 24 / 35 | 5045 |
| 4 | 1 | 68.3 | 88.6 | 20 / 35 | 4891 |
| 5 | 1 | 68.1 | 86.7 | 21 / 35 | 4848 |
| 6 | 1 | 68.5 | 87.9 | 21 / 35 | 4666 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shrub.Vapour v159 | 46 | 70% |
| tm.Yuugao 1.0 | 42 | 83% |
| com.spp.robocode.MostlyHarmless 010 | 24 | 88% |
| Krabb.sliNk.Garm 0.9u | 22 | 68% |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 92% |
| m3thos.Eva00 1.1 | 8 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 23 | 27% | 59 |
| Krabb.sliNk.Garm 0.9u | 17 | 20% | 29 |
| tm.Yuugao 1.0 | 16 | 19% | 55 |
| com.spp.robocode.MostlyHarmless 010 | 15 | 17% | 33 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 6% | 19 |
| m3thos.Eva00 1.1 | 3 | 3% | 10 |
| zyx.nano.BacillusComma 1.0 | 2 | 2% | 2 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 2 |
| SHAM.WOW 1.4 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 147149 melee ticks, 44502 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 49 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 2.

Targeting waves (207 rounds): 49330 sent, 44437 reached their opponent, 8212 virtual hits (18.5% of those reached).

## Melee bench: F09

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 432 over 6 battles (72.0 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 76.3 | 49 / 210 | 3.13 | 15.0% | 20763 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 16.9% | 93 |
| hadur2.Hadur 3.18o2 | 2.2 | 15.0% | 49 |
| kc.micro.Figment 1.0 | 2.8 | 14.0% | 29 |
| pedersen.Grishnakh 1.0 | 4.5 | 10.5% | 17 |
| mc2.enemy.Original 0.9 | 5.2 | 10.0% | 17 |
| yagami.Tidus 0.11 | 5.3 | 10.0% | 3 |
| dft.Calliope 5.6 | 7.2 | 7.6% | 2 |
| step.nanoPri 1.0 | 7.8 | 6.2% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 5.0% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 75.6 | 5 / 35 | 3509 |
| 2 | 2 | 62.1 | 72.4 | 10 / 35 | 3500 |
| 3 | 2 | 64.5 | 79.0 | 11 / 35 | 3596 |
| 4 | 2 | 63.4 | 77.8 | 9 / 35 | 3506 |
| 5 | 3 | 62.0 | 73.3 | 8 / 35 | 3223 |
| 6 | 2 | 63.2 | 79.7 | 6 / 35 | 3429 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 45 | 38% |
| kc.micro.Figment 1.0 | 23 | 65% |
| pedersen.Grishnakh 1.0 | 16 | 50% |
| mc2.enemy.Original 0.9 | 8 | 13% |
| dft.Calliope 5.6 | 4 | 75% |
| yagami.Tidus 0.11 | 3 | 100% |
| step.nanoPri 1.0 | 1 | 100% |
| rdm.Dueler 0.4x | 1 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 857. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 54 | 33% | 69 |
| kc.micro.Figment 1.0 | 31 | 19% | 44 |
| mc2.enemy.Original 0.9 | 31 | 19% | 32 |
| pedersen.Grishnakh 1.0 | 15 | 9% | 20 |
| yagami.Tidus 0.11 | 15 | 9% | 18 |
| dft.Calliope 5.6 | 6 | 4% | 13 |
| robar.nano.Assertive_Melee 0.2 | 5 | 3% | 6 |
| step.nanoPri 1.0 | 2 | 1% | 5 |
| rdm.Dueler 0.4x | 2 | 1% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 155323 melee ticks, 32757 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 39 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 1.

Targeting waves (208 rounds): 50640 sent, 45902 reached their opponent, 6735 virtual hits (14.7% of those reached).

## Melee bench: F10

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 293 over 6 battles (48.8 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 95.7 | 167 / 210 | 1.39 | 20.8% | 34154 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.0 | 20.8% | 167 |
| DTF.Kludgy 1.2b | 2.5 | 14.2% | 19 |
| ne.Chimera 1.2 | 3.0 | 12.8% | 7 |
| ejb.Polaris 1.0.1 | 3.7 | 12.2% | 13 |
| tvv.micro.Antares 1.1.1 | 5.3 | 10.1% | 3 |
| vStar.RAFzilla 2.15 | 5.5 | 10.0% | 0 |
| kurios.DOSexe .9b | 7.5 | 5.8% | 0 |
| sam.Samspin 1.0 | 7.8 | 5.5% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 9.0 | 4.8% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 96.5 | 28 / 35 | 5586 |
| 2 | 1 | 70.7 | 93.3 | 26 / 35 | 5800 |
| 3 | 1 | 70.9 | 94.6 | 27 / 35 | 5522 |
| 4 | 1 | 71.2 | 94.0 | 26 / 35 | 5898 |
| 5 | 1 | 71.7 | 97.8 | 29 / 35 | 5503 |
| 6 | 1 | 72.1 | 98.1 | 31 / 35 | 5845 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 63 | 78% |
| ejb.Polaris 1.0.1 | 40 | 83% |
| ne.Chimera 1.2 | 37 | 92% |
| vStar.RAFzilla 2.15 | 25 | 100% |
| tvv.micro.Antares 1.1.1 | 18 | 89% |
| kurios.DOSexe .9b | 6 | 100% |
| sam.Samspin 1.0 | 2 | 100% |
| donjezza.Muncho 1.0 | 2 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 909. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 20 | 45% | 60 |
| ejb.Polaris 1.0.1 | 8 | 18% | 52 |
| ne.Chimera 1.2 | 7 | 16% | 35 |
| tvv.micro.Antares 1.1.1 | 4 | 9% | 16 |
| kurios.DOSexe .9b | 2 | 5% | 13 |
| vStar.RAFzilla 2.15 | 1 | 2% | 27 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 3 |
| donjezza.Muncho 1.0 | 0 | 0% | 2 |
| sam.Samspin 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 142744 melee ticks, 56615 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 72 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 47847 sent, 43209 reached their opponent, 8351 virtual hits (19.3% of those reached).

## Melee bench: F11

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 485 over 6 battles (80.8 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 82.4 | 78 / 210 | 2.58 | 16.6% | 23387 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.2 | 16.6% | 78 |
| rz.Aleph 0.34 | 1.8 | 15.9% | 65 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.2% | 17 |
| djc.DynaBot 0.1.1 | 4.0 | 10.8% | 18 |
| br2.MobyDickBot 1.6 | 5.5 | 9.2% | 9 |
| rdt199.Warlord 0.73 | 6.0 | 9.1% | 14 |
| uji.YellohFellah 1.0 | 6.5 | 8.7% | 7 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.4% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 9.0 | 5.9% | 0 |
| stelo.MirrorNano 1.3 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 79.7 | 12 / 35 | 3789 |
| 2 | 1 | 65.5 | 83.5 | 12 / 35 | 3963 |
| 3 | 1 | 65.2 | 82.5 | 13 / 35 | 3794 |
| 4 | 1 | 64.1 | 79.4 | 11 / 35 | 3910 |
| 5 | 1 | 66.4 | 86.0 | 15 / 35 | 3902 |
| 6 | 1 | 65.9 | 83.5 | 15 / 35 | 4029 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 48 | 46% |
| djc.DynaBot 0.1.1 | 25 | 60% |
| uji.YellohFellah 1.0 | 17 | 94% |
| cx.mini.Nimrod 0.55 | 16 | 75% |
| rdt199.Warlord 0.73 | 11 | 55% |
| br2.MobyDickBot 1.6 | 8 | 50% |
| KiraNL.Chupacabra 0.4 | 4 | 75% |

Hadur died in 135 of 210 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 56 | 41% | 83 |
| cx.mini.Nimrod 0.55 | 21 | 16% | 29 |
| djc.DynaBot 0.1.1 | 18 | 13% | 29 |
| rdt199.Warlord 0.73 | 11 | 8% | 24 |
| uji.YellohFellah 1.0 | 7 | 5% | 16 |
| br2.MobyDickBot 1.6 | 7 | 5% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 4% | 8 |
| KiraNL.Chupacabra 0.4 | 3 | 2% | 8 |
| stelo.MirrorNano 1.3 | 3 | 2% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 157326 melee ticks, 38170 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 48 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 52060 sent, 47094 reached their opponent, 6430 virtual hits (13.7% of those reached).

## Melee bench: F12

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 250 over 6 battles (41.7 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 86.4 | 127 / 210 | 2.22 | 18.1% | 23972 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.0 | 18.1% | 127 |
| nat.PallasHawk 1.0 | 2.8 | 13.1% | 24 |
| bts.wiki.RipCurl 0.9b | 2.8 | 13.6% | 22 |
| darkcanuck.Leon 1.01 | 3.3 | 13.2% | 20 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.3% | 13 |
| jrm.Test0 1.0 | 6.0 | 8.4% | 2 |
| cs.sheldor.Talon 1.1 | 7.2 | 6.6% | 0 |
| jp.Perpy 16.0 | 8.2 | 6.3% | 0 |
| stuff.Vlad 0.1 | 9.0 | 5.4% | 0 |
| jaybot.bots.Oddball 4.0 | 9.7 | 5.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 91.1 | 25 / 35 | 4023 |
| 2 | 1 | 66.6 | 82.9 | 19 / 35 | 4027 |
| 3 | 1 | 67.6 | 89.2 | 19 / 35 | 3921 |
| 4 | 1 | 65.0 | 78.7 | 18 / 35 | 3665 |
| 5 | 1 | 68.1 | 88.3 | 21 / 35 | 4203 |
| 6 | 1 | 68.7 | 88.3 | 25 / 35 | 4133 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 49 | 84% |
| darkcanuck.Leon 1.01 | 46 | 91% |
| nat.PallasHawk 1.0 | 38 | 76% |
| brainfade.melee.Genghis 0.36 | 6 | 83% |
| jaybot.bots.Oddball 4.0 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| jrm.Test0 1.0 | 1 | 100% |
| jp.Perpy 16.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 642. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 24 | 28% | 56 |
| nat.PallasHawk 1.0 | 22 | 26% | 51 |
| jrm.Test0 1.0 | 12 | 14% | 15 |
| darkcanuck.Leon 1.01 | 10 | 12% | 56 |
| brainfade.melee.Genghis 0.36 | 6 | 7% | 9 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 11 |
| jp.Perpy 16.0 | 4 | 5% | 5 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 130785 melee ticks, 38658 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 50 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 45261 sent, 40203 reached their opponent, 6784 virtual hits (16.9% of those reached).

## Melee bench: F13

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 208 over 6 battles (34.7 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 78.8 | 41 / 210 | 2.90 | 15.0% | 23329 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.5 | 16.7% | 40 |
| mn.Combat 3.25.0 | 1.7 | 16.6% | 94 |
| hadur2.Hadur 3.18o2 | 2.8 | 15.0% | 41 |
| gh.micro.Gruweltje 0.7 | 4.3 | 12.0% | 12 |
| shinh.Entangled 0.3 | 4.7 | 12.0% | 22 |
| apc.Colossus2 0.17 | 6.2 | 7.8% | 1 |
| stelo.Wang 1.0 | 6.8 | 7.2% | 0 |
| ayk.WallHugger 1.0 | 8.3 | 5.0% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.9% | 0 |
| sample.Tracker 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.4 | 80.0 | 7 / 35 | 3782 |
| 2 | 3 | 63.1 | 77.1 | 6 / 35 | 3805 |
| 3 | 3 | 64.4 | 80.0 | 8 / 35 | 4114 |
| 4 | 2 | 64.8 | 82.5 | 7 / 35 | 4066 |
| 5 | 3 | 63.3 | 77.8 | 6 / 35 | 3821 |
| 6 | 3 | 63.0 | 75.6 | 7 / 35 | 3741 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 43 | 60% |
| mn.Combat 3.25.0 | 38 | 11% |
| shinh.Entangled 0.3 | 16 | 50% |
| gh.micro.Gruweltje 0.7 | 9 | 33% |

Hadur died in 171 of 210 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 64 | 37% | 70 |
| ags.Glacier 0.2.11 | 53 | 31% | 78 |
| shinh.Entangled 0.3 | 25 | 15% | 31 |
| gh.micro.Gruweltje 0.7 | 17 | 10% | 20 |
| stelo.Wang 1.0 | 6 | 4% | 6 |
| maribo.FollowFire 1 | 4 | 2% | 4 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 143674 melee ticks, 33313 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 74 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 74 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 43146 sent, 38058 reached their opponent, 6271 virtual hits (16.5% of those reached).

## Melee bench: F14

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 159 over 6 battles (26.5 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 95.0 | 155 / 210 | 1.45 | 20.8% | 34363 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.0 | 20.8% | 155 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.1% | 19 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.4% | 28 |
| Lo_Ian.Gandalf_V4 4.0 | 5.0 | 9.4% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 5.5 | 8.9% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.5 | 9.5% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.5 | 8.5% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 7.8% | 5 |
| pa.Improved 1.0 | 9.0 | 5.9% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 96.2 | 28 / 35 | 5708 |
| 2 | 1 | 70.9 | 93.7 | 24 / 35 | 5868 |
| 3 | 1 | 71.7 | 96.5 | 27 / 35 | 5552 |
| 4 | 1 | 71.5 | 95.2 | 25 / 35 | 5637 |
| 5 | 1 | 71.0 | 92.7 | 26 / 35 | 5751 |
| 6 | 1 | 71.5 | 95.6 | 25 / 35 | 5847 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 78 | 87% |
| catcat20.shape.Theta 0.018 | 58 | 69% |
| sanyi.mikrobi.Roberto 1.0 | 16 | 94% |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 73% |
| co.edu.usb.rc.LidisTron 1.0 | 10 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| pa.Improved 1.0 | 4 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 945. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 21 | 38% | 84 |
| catcat20.shape.Theta 0.018 | 21 | 38% | 59 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 7% | 23 |
| sanyi.mikrobi.Roberto 1.0 | 4 | 7% | 22 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 5% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 6 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 2% | 4 |
| pa.Improved 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 200 rounds): 144093 melee ticks, 53383 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 41 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 2.

Targeting waves (200 rounds): 45414 sent, 40902 reached their opponent, 10106 virtual hits (24.7% of those reached).

## Melee bench: F15

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 679 over 6 battles (113.2 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 83.7 | 95 / 210 | 2.47 | 18.0% | 29816 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.0 | 18.0% | 95 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.8% | 25 |
| emp.Yngwie 1.11 | 3.2 | 13.2% | 59 |
| mld.DustBunny 3.8 | 3.7 | 12.4% | 5 |
| cb.nano.Insomnia 1.0 | 4.7 | 11.0% | 10 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.5% | 13 |
| lambdaxy.TBot 0.1 | 7.3 | 6.9% | 1 |
| Grystrion.TrackerWO 1.0 | 7.7 | 6.4% | 0 |
| divineomega.TrialBot 0.003 | 9.2 | 4.7% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 87.3 | 19 / 35 | 4827 |
| 2 | 1 | 66.5 | 81.3 | 14 / 35 | 4860 |
| 3 | 1 | 67.6 | 82.9 | 14 / 35 | 5248 |
| 4 | 1 | 67.8 | 85.1 | 16 / 35 | 4969 |
| 5 | 1 | 69.9 | 89.2 | 23 / 35 | 5248 |
| 6 | 1 | 64.8 | 76.5 | 9 / 35 | 4664 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 52 | 58% |
| kawigi.micro.Shiz 1.1 | 28 | 89% |
| kawigi.robot.Girl 1.2 | 20 | 70% |
| mld.DustBunny 3.8 | 14 | 100% |
| cb.nano.Insomnia 1.0 | 11 | 82% |
| divineomega.TrialBot 0.003 | 2 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |
| lambdaxy.TBot 0.1 | 1 | 0% |

Hadur died in 121 of 210 rounds, at a mean tick of 946. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 44 | 36% | 75 |
| mld.DustBunny 3.8 | 24 | 20% | 45 |
| cb.nano.Insomnia 1.0 | 16 | 13% | 18 |
| kawigi.robot.Girl 1.2 | 13 | 11% | 15 |
| kawigi.micro.Shiz 1.1 | 8 | 7% | 34 |
| lambdaxy.TBot 0.1 | 4 | 3% | 5 |
| divineomega.TrialBot 0.003 | 3 | 2% | 11 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 166783 melee ticks, 44729 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 57 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 54565 sent, 49766 reached their opponent, 8401 virtual hits (16.9% of those reached).

## Melee bench: F16

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 141 over 6 battles (23.5 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 85.9 | 103 / 210 | 2.27 | 18.6% | 31280 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.0 | 18.6% | 103 |
| gh.Griezel 0.5.2 | 2.2 | 16.1% | 58 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.8 | 13.5% | 3 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 11.1% | 35 |
| bvh.fnr.Fenrir 0.36l | 5.7 | 9.3% | 3 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.8% | 3 |
| stelo.IntrinsicVolatility 1.4 | 6.5 | 7.7% | 4 |
| repositorio.NanoStep 1.0 | 9.0 | 5.1% | 2 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 4.8% | 1 |
| asd.Cthulhu 1.3 | 9.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 84.8 | 19 / 35 | 5526 |
| 2 | 1 | 67.8 | 83.2 | 17 / 35 | 5016 |
| 3 | 1 | 68.7 | 87.6 | 19 / 35 | 5118 |
| 4 | 1 | 70.0 | 90.2 | 18 / 35 | 5659 |
| 5 | 1 | 68.9 | 88.3 | 16 / 35 | 5067 |
| 6 | 1 | 67.0 | 81.3 | 14 / 35 | 4894 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 66 | 61% |
| techdude.forest.FlamingForest 1.1 | 32 | 50% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 18 | 100% |
| bvh.fnr.Fenrir 0.36l | 9 | 89% |
| tvv.nano.Polaris 1.2 | 9 | 100% |
| stelo.IntrinsicVolatility 1.4 | 7 | 100% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |
| repositorio.NanoStep 1.0 | 3 | 67% |

Hadur died in 109 of 210 rounds, at a mean tick of 1158. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 49 | 45% | 90 |
| techdude.forest.FlamingForest 1.1 | 25 | 23% | 44 |
| bvh.fnr.Fenrir 0.36l | 11 | 10% | 17 |
| stelo.IntrinsicVolatility 1.4 | 9 | 8% | 16 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 6 | 6% | 22 |
| asd.Cthulhu 1.3 | 3 | 3% | 5 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 6 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 5 |
| repositorio.NanoStep 1.0 | 1 | 1% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 177220 melee ticks, 61167 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 56 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 2.

Targeting waves (204 rounds): 57463 sent, 52746 reached their opponent, 9175 virtual hits (17.4% of those reached).

## Melee bench: F17

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 606 over 6 battles (101.0 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.7 | 108 / 210 | 2.20 | 19.0% | 33126 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.0 | 19.0% | 108 |
| oog.melee.Mercutio 1.0 | 2.5 | 13.4% | 38 |
| et.Predator 1.8 | 2.8 | 12.9% | 15 |
| cx.BlestPain 1.41 | 3.7 | 12.4% | 41 |
| ahf.NanoAndrew .4 | 5.0 | 10.3% | 4 |
| nic.Nicator 2.4 | 6.5 | 8.7% | 2 |
| maribo.melee.BMV 0.1 | 6.7 | 8.8% | 1 |
| tex.Longbot 0.4 | 8.3 | 6.0% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.8% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 92.4 | 21 / 35 | 5888 |
| 2 | 1 | 68.1 | 85.4 | 16 / 35 | 5296 |
| 3 | 1 | 66.9 | 81.0 | 16 / 35 | 5096 |
| 4 | 1 | 69.2 | 88.3 | 16 / 35 | 5609 |
| 5 | 1 | 69.2 | 86.7 | 18 / 35 | 5533 |
| 6 | 1 | 69.9 | 86.7 | 21 / 35 | 5704 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 54 | 67% |
| et.Predator 1.8 | 53 | 75% |
| cx.BlestPain 1.41 | 21 | 52% |
| ahf.NanoAndrew .4 | 10 | 100% |
| nic.Nicator 2.4 | 5 | 60% |
| maribo.melee.BMV 0.1 | 5 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 3 | 67% |
| tex.Longbot 0.4 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 1002. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 30 | 28% | 42 |
| oog.melee.Mercutio 1.0 | 25 | 23% | 58 |
| et.Predator 1.8 | 24 | 22% | 62 |
| ahf.NanoAndrew .4 | 13 | 12% | 22 |
| maribo.melee.BMV 0.1 | 4 | 4% | 8 |
| nic.Nicator 2.4 | 3 | 3% | 9 |
| tex.Longbot 0.4 | 3 | 3% | 6 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 161358 melee ticks, 56077 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 37 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 37 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 53447 sent, 48727 reached their opponent, 10501 virtual hits (21.6% of those reached).

## Melee bench: F18

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 270 over 6 battles (45.0 per battle, most in one battle 52). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 89.5 | 137 / 210 | 1.94 | 19.3% | 28483 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.0 | 19.3% | 137 |
| morbid.MorbidPriest 1.0 | 2.2 | 14.0% | 28 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.3% | 15 |
| uji.DBH 1.1 | 3.8 | 11.3% | 14 |
| sigterm.Sigterm 1.0 | 5.7 | 8.7% | 9 |
| ratosh.Nobo 0.21 | 6.0 | 8.3% | 2 |
| spinnercat.Robovirus 2.718 | 6.3 | 8.3% | 2 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.3% | 1 |
| stelo.WangRobot 1.0 | 9.5 | 5.3% | 1 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 90.8 | 22 / 35 | 4946 |
| 2 | 1 | 69.5 | 90.2 | 25 / 35 | 4751 |
| 3 | 1 | 69.1 | 91.1 | 23 / 35 | 4672 |
| 4 | 1 | 66.6 | 83.5 | 17 / 35 | 4419 |
| 5 | 1 | 69.9 | 92.1 | 25 / 35 | 4866 |
| 6 | 1 | 69.2 | 89.5 | 25 / 35 | 4829 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 60 | 90% |
| agd.Mooserwirt2 2.7 | 29 | 83% |
| uji.DBH 1.1 | 24 | 79% |
| sigterm.Sigterm 1.0 | 20 | 80% |
| spinnercat.Robovirus 2.718 | 11 | 82% |
| stelo.WangRobot 1.0 | 7 | 100% |
| ratosh.Nobo 0.21 | 6 | 83% |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 50% |

Hadur died in 74 of 210 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 25 | 34% | 77 |
| uji.DBH 1.1 | 12 | 16% | 24 |
| agd.Mooserwirt2 2.7 | 11 | 15% | 45 |
| ratosh.Nobo 0.21 | 8 | 11% | 14 |
| sigterm.Sigterm 1.0 | 6 | 8% | 15 |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 5% | 12 |
| spinnercat.Robovirus 2.718 | 3 | 4% | 8 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 4% | 6 |
| stelo.WangRobot 1.0 | 2 | 3% | 7 |

Posture (Hadur's M records, 201 rounds): 139867 melee ticks, 45808 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 49 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 3.

Targeting waves (201 rounds): 47156 sent, 42417 reached their opponent, 9235 virtual hits (21.8% of those reached).

## Melee bench: F19

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 238 over 6 battles (39.7 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 97.0 | 191 / 210 | 1.27 | 21.9% | 35272 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.0 | 21.9% | 191 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.9% | 9 |
| mld.Infinity 2.2 | 3.7 | 12.0% | 4 |
| krillr.mini.JointStrike 2.0.0 | 3.7 | 11.7% | 1 |
| erdnis.Rover 0.3 | 4.7 | 10.5% | 1 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.5% | 1 |
| mbh.Mbh 0.1 | 7.3 | 7.4% | 0 |
| pac.ABC 2.1 | 7.8 | 6.3% | 2 |
| pbg.R2D2 1.0 | 8.8 | 5.6% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 90.5 | 29 / 35 | 5708 |
| 2 | 1 | 72.6 | 96.8 | 31 / 35 | 5924 |
| 3 | 1 | 73.5 | 99.7 | 34 / 35 | 5991 |
| 4 | 1 | 73.4 | 98.7 | 33 / 35 | 5977 |
| 5 | 1 | 72.9 | 98.4 | 32 / 35 | 5693 |
| 6 | 1 | 73.3 | 97.8 | 32 / 35 | 5979 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 107 | 96% |
| krillr.mini.JointStrike 2.0.0 | 37 | 100% |
| mld.Infinity 2.2 | 26 | 96% |
| erdnis.Rover 0.3 | 14 | 93% |
| patson.PatsonTestBot 1.0 | 7 | 100% |
| pac.ABC 2.1 | 3 | 67% |
| pbg.R2D2 1.0 | 3 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 20 of 210 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 5 | 25% | 75 |
| krillr.mini.JointStrike 2.0.0 | 5 | 25% | 35 |
| patson.PatsonTestBot 1.0 | 2 | 10% | 20 |
| erdnis.Rover 0.3 | 2 | 10% | 18 |
| pac.ABC 2.1 | 2 | 10% | 11 |
| pbg.R2D2 1.0 | 2 | 10% | 11 |
| mld.Infinity 2.2 | 1 | 5% | 30 |
| mbh.Mbh 0.1 | 0 | 0% | 7 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 126405 melee ticks, 48182 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 50 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 3.

Targeting waves (200 rounds): 42890 sent, 38302 reached their opponent, 9106 virtual hits (23.8% of those reached).

## Melee bench: F20

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 339 over 6 battles (56.5 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 90.1 | 141 / 210 | 1.89 | 20.5% | 36006 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.0 | 20.5% | 141 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.4% | 29 |
| fwb.Nine 1.0.1 | 3.8 | 11.3% | 13 |
| nz.jdc.nano.GridFu 1.0 | 4.0 | 10.7% | 5 |
| catcat20.Rabbit 0.001 | 4.2 | 10.6% | 18 |
| m3thos.mini.Eva01 0.5.5 | 6.2 | 8.4% | 2 |
| bayen.nut.Squirrel 1.615 | 6.8 | 7.5% | 2 |
| djdjdj.NanoSkunk10 1.0 | 8.3 | 6.1% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 5.6% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 87.6 | 21 / 35 | 5847 |
| 2 | 1 | 72.0 | 93.7 | 27 / 35 | 6065 |
| 3 | 1 | 69.7 | 86.7 | 20 / 35 | 5996 |
| 4 | 1 | 70.5 | 89.5 | 24 / 35 | 5965 |
| 5 | 1 | 70.1 | 88.6 | 22 / 35 | 5719 |
| 6 | 1 | 72.4 | 94.6 | 27 / 35 | 6414 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 80 | 88% |
| fwb.Nine 1.0.1 | 36 | 97% |
| catcat20.Rabbit 0.001 | 29 | 62% |
| m3thos.mini.Eva01 0.5.5 | 7 | 100% |
| nz.jdc.nano.GridFu 1.0 | 6 | 83% |
| bayen.nut.Squirrel 1.615 | 5 | 60% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 953. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 36 | 51% | 97 |
| catcat20.Rabbit 0.001 | 12 | 17% | 36 |
| nz.jdc.nano.GridFu 1.0 | 7 | 10% | 24 |
| fwb.Nine 1.0.1 | 5 | 7% | 15 |
| bayen.nut.Squirrel 1.615 | 4 | 6% | 15 |
| m3thos.mini.Eva01 0.5.5 | 2 | 3% | 12 |
| ntc.ControlledChaos 1.1.4 | 2 | 3% | 3 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 5 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 159397 melee ticks, 57073 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 41 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 50794 sent, 46129 reached their opponent, 11110 virtual hits (24.1% of those reached).

## Melee bench: F21

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 314 over 6 battles (52.3 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 90.8 | 114 / 210 | 1.83 | 19.9% | 34325 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.0 | 19.9% | 114 |
| eem.EvBot v4.6.16 | 2.0 | 16.7% | 69 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.6% | 8 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.2% | 3 |
| eld.Hmm 1.0 | 5.2 | 9.0% | 17 |
| oa.weak.BotherBot 0.1 | 5.8 | 8.1% | 0 |
| fire219.CatBot 1.0 | 7.5 | 6.0% | 0 |
| PSW.Relentless 0.1 | 8.2 | 5.8% | 0 |
| el.JumpShoot 0.2 | 8.3 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 83.8 | 14 / 35 | 5581 |
| 2 | 1 | 70.5 | 91.4 | 15 / 35 | 6017 |
| 3 | 1 | 71.0 | 95.2 | 25 / 35 | 5361 |
| 4 | 1 | 68.9 | 88.9 | 13 / 35 | 5408 |
| 5 | 1 | 71.8 | 92.1 | 22 / 35 | 6445 |
| 6 | 1 | 71.1 | 93.3 | 25 / 35 | 5513 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 120 | 61% |
| dummy.mini.Scimitar 1.01 | 21 | 90% |
| eld.Hmm 1.0 | 17 | 41% |
| cf.RiO.RiOx 4.2.1 | 13 | 92% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 1323. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 53 | 54% | 98 |
| dummy.mini.Scimitar 1.01 | 16 | 16% | 45 |
| eld.Hmm 1.0 | 14 | 14% | 31 |
| cf.RiO.RiOx 4.2.1 | 9 | 9% | 24 |
| oa.weak.BotherBot 0.1 | 2 | 2% | 5 |
| arthord.MannyPacquiao Beta | 1 | 1% | 3 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |
| el.JumpShoot 0.2 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 182297 melee ticks, 80717 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 55 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 53893 sent, 49209 reached their opponent, 8624 virtual hits (17.5% of those reached).

## Melee bench: F22

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 241 over 6 battles (40.2 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 86.8 | 89 / 210 | 2.19 | 17.9% | 28216 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.2 | 17.9% | 89 |
| pe.SandboxDT 2.71m | 2.0 | 16.8% | 65 |
| kvk.HebusLeTroll 0.35 | 2.8 | 15.1% | 32 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.9% | 22 |
| bigpete.Stewie 1.0 | 5.0 | 10.6% | 3 |
| yk.JahRoslav 1.1 | 6.5 | 6.8% | 0 |
| tad.Dalek98 0.98 | 7.0 | 6.3% | 0 |
| gg.Squaraus 0.6 | 7.7 | 6.0% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 4.8% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 87.0 | 15 / 35 | 4628 |
| 2 | 1 | 70.1 | 93.0 | 22 / 35 | 4989 |
| 3 | 1 | 67.6 | 84.8 | 12 / 35 | 4882 |
| 4 | 1 | 68.6 | 87.0 | 16 / 35 | 4907 |
| 5 | 2 | 67.1 | 84.1 | 12 / 35 | 4328 |
| 6 | 1 | 67.2 | 84.8 | 12 / 35 | 4482 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 50 | 50% |
| kvk.HebusLeTroll 0.35 | 43 | 58% |
| jlm.javaDisturbance 0.59 | 35 | 77% |
| bigpete.Stewie 1.0 | 9 | 89% |
| pbg.NinjaX 1.2 | 3 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 954. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 48 | 39% | 82 |
| kvk.HebusLeTroll 0.35 | 44 | 36% | 63 |
| jlm.javaDisturbance 0.59 | 22 | 18% | 46 |
| bigpete.Stewie 1.0 | 4 | 3% | 11 |
| gg.Squaraus 0.6 | 1 | 1% | 2 |
| pbg.NinjaX 1.2 | 1 | 1% | 2 |
| yk.JahRoslav 1.1 | 1 | 1% | 1 |
| tad.Dalek98 0.98 | 0 | 0% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 162331 melee ticks, 46630 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 38 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 52174 sent, 47353 reached their opponent, 7727 virtual hits (16.3% of those reached).

## Melee bench: F23

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 706 over 6 battles (117.7 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 94.9 | 165 / 210 | 1.46 | 21.5% | 36237 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.0 | 21.5% | 165 |
| pe.SandboxLump 1.52 | 2.0 | 16.1% | 26 |
| cre.Karolos 0.32 | 3.0 | 13.6% | 13 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.6% | 2 |
| stelo.RamTrackSurfer 1.2 | 5.3 | 9.3% | 4 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.0 | 8.6% | 0 |
| cw.megas.Blade 0.8 | 6.5 | 8.3% | 0 |
| sample.Walls 1.0 | 8.0 | 7.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.2 | 2.6% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 94.9 | 26 / 35 | 5926 |
| 2 | 1 | 74.3 | 99.0 | 33 / 35 | 6508 |
| 3 | 1 | 73.8 | 98.7 | 33 / 35 | 6179 |
| 4 | 1 | 72.4 | 94.0 | 24 / 35 | 6184 |
| 5 | 1 | 71.9 | 92.7 | 25 / 35 | 6311 |
| 6 | 1 | 70.6 | 89.8 | 24 / 35 | 5129 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 99 | 85% |
| cre.Karolos 0.32 | 48 | 88% |
| stelo.RamTrackSurfer 1.2 | 17 | 94% |
| stelo.AreaTargetingBot 1.1 | 11 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 3 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 31 | 58% | 96 |
| cre.Karolos 0.32 | 10 | 19% | 55 |
| stelo.RamTrackSurfer 1.2 | 3 | 6% | 21 |
| stelo.AreaTargetingBot 1.1 | 2 | 4% | 15 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 2% | 5 |
| sample.Walls 1.0 | 0 | 0% | 11 |
| cw.megas.Blade 0.8 | 0 | 0% | 6 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 127586 melee ticks, 47311 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 55 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 40617 sent, 36014 reached their opponent, 11208 virtual hits (31.1% of those reached).

## Melee bench: F24

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 533 over 6 battles (88.8 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 79.4 | 68 / 210 | 2.86 | 15.8% | 22496 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.2 | 15.8% | 68 |
| rz.GlowBlowMelee 1.4 | 2.2 | 14.6% | 48 |
| florent.XSeries.X2 0.12 | 3.2 | 13.5% | 29 |
| davidalves.Phoenix 0.54 | 3.5 | 13.4% | 40 |
| pedersen.Ugluk 1.1.1 | 5.0 | 11.4% | 19 |
| oog.melee.Corsair 1.0 | 6.0 | 9.4% | 7 |
| stelo.SoJNanoMelee 1.1 | 7.2 | 6.5% | 3 |
| lunchie.Lunchbox 0.93 | 8.0 | 5.9% | 0 |
| as.FrankTheTank 1.3 | 9.0 | 5.2% | 0 |
| evd.X1 0.01 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 84.4 | 14 / 35 | 4001 |
| 2 | 1 | 63.6 | 78.7 | 12 / 35 | 3640 |
| 3 | 1 | 64.2 | 77.1 | 12 / 35 | 3606 |
| 4 | 2 | 63.7 | 78.4 | 10 / 35 | 3690 |
| 5 | 1 | 63.4 | 77.8 | 8 / 35 | 3675 |
| 6 | 1 | 64.7 | 79.7 | 12 / 35 | 3884 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 35 | 60% |
| florent.XSeries.X2 0.12 | 27 | 67% |
| davidalves.Phoenix 0.54 | 25 | 48% |
| pedersen.Ugluk 1.1.1 | 18 | 50% |
| oog.melee.Corsair 1.0 | 5 | 80% |
| stelo.SoJNanoMelee 1.1 | 3 | 33% |
| as.FrankTheTank 1.3 | 1 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 751. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 41 | 28% | 56 |
| rz.GlowBlowMelee 1.4 | 31 | 21% | 53 |
| davidalves.Phoenix 0.54 | 28 | 19% | 39 |
| pedersen.Ugluk 1.1.1 | 25 | 17% | 30 |
| oog.melee.Corsair 1.0 | 6 | 4% | 15 |
| stelo.SoJNanoMelee 1.1 | 5 | 3% | 8 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 4 |
| evd.X1 0.01 | 2 | 1% | 2 |
| as.FrankTheTank 1.3 | 1 | 1% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 138149 melee ticks, 31176 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 41 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 47107 sent, 42050 reached their opponent, 7691 virtual hits (18.3% of those reached).

## Melee bench: F25

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 328 over 6 battles (54.7 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 87.5 | 125 / 210 | 2.12 | 18.3% | 23545 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.0 | 18.3% | 125 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 14.3% | 24 |
| voidious.micro.BlitzBat 1.05 | 3.2 | 13.1% | 17 |
| jdw.Hurricane 1.4 | 3.7 | 12.2% | 23 |
| gre.svman4.Morfeas 1.4.1 | 5.5 | 9.0% | 7 |
| ds.Oo 2.2 | 6.0 | 8.4% | 5 |
| awesomeness.Elite 1.0 | 7.2 | 7.0% | 2 |
| adt.Ar2 1.1 | 8.0 | 6.8% | 3 |
| gjr.Cephalosporin 0.1 | 8.3 | 6.3% | 4 |
| amk.ChumbaMini 0.2 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 93.0 | 25 / 35 | 4093 |
| 2 | 1 | 66.4 | 85.1 | 17 / 35 | 3683 |
| 3 | 1 | 66.0 | 82.5 | 19 / 35 | 3665 |
| 4 | 1 | 66.7 | 82.9 | 16 / 35 | 4088 |
| 5 | 1 | 69.0 | 89.8 | 24 / 35 | 4158 |
| 6 | 1 | 68.8 | 91.7 | 24 / 35 | 3858 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 50 | 80% |
| voidious.micro.BlitzBat 1.05 | 43 | 91% |
| jdw.Hurricane 1.4 | 27 | 78% |
| ds.Oo 2.2 | 12 | 75% |
| awesomeness.Elite 1.0 | 6 | 83% |
| gre.svman4.Morfeas 1.4.1 | 6 | 67% |
| gjr.Cephalosporin 0.1 | 4 | 100% |
| adt.Ar2 1.1 | 4 | 50% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 662. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 23 | 26% | 54 |
| jdw.Hurricane 1.4 | 20 | 23% | 44 |
| voidious.micro.BlitzBat 1.05 | 18 | 21% | 46 |
| ds.Oo 2.2 | 9 | 10% | 23 |
| gre.svman4.Morfeas 1.4.1 | 7 | 8% | 15 |
| adt.Ar2 1.1 | 4 | 5% | 7 |
| awesomeness.Elite 1.0 | 3 | 3% | 9 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 8 |
| amk.ChumbaMini 0.2 | 0 | 0% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 126865 melee ticks, 26515 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 32 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 45738 sent, 41022 reached their opponent, 7014 virtual hits (17.1% of those reached).

## Melee bench: F26

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 576 over 6 battles (96.0 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 90.0 | 129 / 210 | 1.90 | 19.9% | 36248 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.0 | 19.9% | 129 |
| ak.Fermat 2.0 | 2.0 | 14.7% | 32 |
| lrem.Spectre 0.4.4 | 3.5 | 12.7% | 17 |
| shu.nitro.LENIN .T34 | 3.7 | 12.3% | 20 |
| js.PinBall 1.6 | 5.2 | 10.4% | 4 |
| jaybot.adv.bots.JayBot 2.0 | 5.7 | 9.6% | 5 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 8.0% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.7% | 3 |
| sample.SpinBot 1.0 | 9.0 | 4.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 91.7 | 22 / 35 | 6270 |
| 2 | 1 | 71.0 | 91.4 | 22 / 35 | 6003 |
| 3 | 1 | 71.1 | 90.5 | 23 / 35 | 6044 |
| 4 | 1 | 70.9 | 90.8 | 24 / 35 | 6068 |
| 5 | 1 | 70.2 | 88.9 | 21 / 35 | 5948 |
| 6 | 1 | 69.4 | 86.7 | 17 / 35 | 5915 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 61 | 77% |
| lrem.Spectre 0.4.4 | 45 | 80% |
| shu.nitro.LENIN .T34 | 32 | 84% |
| js.PinBall 1.6 | 13 | 77% |
| jaybot.adv.bots.JayBot 2.0 | 8 | 63% |
| fullsail.LaxativeTeaTwo 1.0 | 6 | 50% |
| gh.mini.GrubbmOne 1.0 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 933. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 28 | 33% | 73 |
| shu.nitro.LENIN .T34 | 22 | 26% | 50 |
| lrem.Spectre 0.4.4 | 13 | 15% | 41 |
| js.PinBall 1.6 | 9 | 11% | 19 |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 6% | 11 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 5% | 14 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 155141 melee ticks, 50265 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 25 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 51877 sent, 47010 reached their opponent, 11697 virtual hits (24.9% of those reached).

## Melee bench: F27

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 510 over 6 battles (85.0 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 93.0 | 164 / 210 | 1.63 | 20.4% | 31222 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.0 | 20.4% | 164 |
| mk.Alpha 0.2.1 | 2.0 | 14.1% | 28 |
| EH.Eagle 1.0.6 | 3.0 | 11.5% | 7 |
| throxbot.ThroxBot 0.1 | 5.3 | 9.3% | 3 |
| sheldor.melee.nano.TestMelee 0.1 | 5.8 | 8.9% | 0 |
| wee.Gem 1.8.4 | 5.8 | 9.1% | 3 |
| joe.ADinosaur 1.0 | 6.8 | 7.8% | 0 |
| techdude.kombat.FlamingKombat 1.5 | 6.8 | 8.3% | 2 |
| caimano.Furia_Ceca 0.22 | 8.7 | 6.3% | 3 |
| cs.Grudge 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 92.7 | 26 / 35 | 5256 |
| 2 | 1 | 72.0 | 98.1 | 31 / 35 | 5643 |
| 3 | 1 | 69.7 | 91.1 | 25 / 35 | 4892 |
| 4 | 1 | 70.8 | 92.4 | 27 / 35 | 5362 |
| 5 | 1 | 68.9 | 88.6 | 25 / 35 | 4807 |
| 6 | 1 | 71.1 | 94.9 | 30 / 35 | 5262 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 102 | 88% |
| EH.Eagle 1.0.6 | 34 | 100% |
| throxbot.ThroxBot 0.1 | 20 | 85% |
| sheldor.melee.nano.TestMelee 0.1 | 8 | 100% |
| wee.Gem 1.8.4 | 7 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 75% |
| joe.ADinosaur 1.0 | 3 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 2 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 740. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 19 | 38% | 88 |
| EH.Eagle 1.0.6 | 6 | 12% | 41 |
| joe.ADinosaur 1.0 | 6 | 12% | 13 |
| caimano.Furia_Ceca 0.22 | 5 | 10% | 12 |
| throxbot.ThroxBot 0.1 | 4 | 8% | 20 |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 8% | 16 |
| wee.Gem 1.8.4 | 1 | 2% | 11 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 2% | 8 |
| cs.Grudge 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 134287 melee ticks, 38773 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 29 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 29 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 2.

Targeting waves (203 rounds): 43595 sent, 38796 reached their opponent, 9475 virtual hits (24.4% of those reached).

## Melee bench: F28

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 349 over 6 battles (58.2 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 89.0 | 132 / 210 | 1.99 | 18.5% | 24201 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.0 | 18.5% | 132 |
| kid.test.NightFox .2 | 2.2 | 15.0% | 34 |
| uji.Antique 1.0 | 3.0 | 12.2% | 22 |
| pfvicm.Sobieski 7.2.3b | 4.3 | 10.9% | 8 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.6% | 8 |
| ahr.ice.Ice 1.0.2 | 6.3 | 8.2% | 3 |
| amk.ChumbaWumba 0.3 | 6.7 | 8.0% | 1 |
| matt.advanced.Katana 1.0 | 8.8 | 5.7% | 2 |
| stelo.PianistNano 1.2 | 9.0 | 5.4% | 0 |
| stelo.Lifestealer 1.0 | 9.2 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 91.4 | 23 / 35 | 4153 |
| 2 | 1 | 68.4 | 89.8 | 22 / 35 | 4046 |
| 3 | 1 | 67.2 | 86.3 | 20 / 35 | 3835 |
| 4 | 1 | 68.2 | 88.6 | 24 / 35 | 4185 |
| 5 | 1 | 69.3 | 93.0 | 26 / 35 | 4063 |
| 6 | 1 | 66.5 | 85.1 | 17 / 35 | 3919 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 78 | 77% |
| uji.Antique 1.0 | 48 | 94% |
| qohnil.blot.BlotBot 3.61 | 11 | 73% |
| ahr.ice.Ice 1.0.2 | 8 | 88% |
| pfvicm.Sobieski 7.2.3b | 7 | 71% |
| amk.ChumbaWumba 0.3 | 4 | 75% |
| matt.advanced.Katana 1.0 | 2 | 50% |
| stelo.PianistNano 1.2 | 1 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 760. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 28 | 35% | 60 |
| uji.Antique 1.0 | 15 | 19% | 47 |
| pfvicm.Sobieski 7.2.3b | 15 | 19% | 29 |
| ahr.ice.Ice 1.0.2 | 7 | 9% | 18 |
| amk.ChumbaWumba 0.3 | 7 | 9% | 16 |
| qohnil.blot.BlotBot 3.61 | 4 | 5% | 25 |
| stelo.Lifestealer 1.0 | 2 | 3% | 4 |
| stelo.PianistNano 1.2 | 0 | 0% | 6 |
| matt.advanced.Katana 1.0 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 133292 melee ticks, 35795 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 71 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 45273 sent, 40505 reached their opponent, 6015 virtual hits (14.9% of those reached).

## Melee bench: F29

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 643 over 6 battles (107.2 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 85.4 | 93 / 210 | 2.31 | 18.2% | 27077 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.3 | 18.2% | 93 |
| zyx.mega.YersiniaPestis 3.1 | 2.0 | 15.8% | 59 |
| deewiant.Anomaly 0.2 | 2.7 | 15.0% | 44 |
| myl.micro.Troodon 1.10 | 4.0 | 12.1% | 7 |
| jok.PheonixM 0.1.2 | 5.2 | 10.4% | 5 |
| ph.melee.ArcherME 0.3 | 5.8 | 8.2% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.3 | 6.2% | 0 |
| DBall.Anarchy 0.1 | 8.2 | 5.4% | 2 |
| ap.Frederick 1.1 | 8.5 | 4.9% | 1 |
| jangs.ns51 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 81.3 | 14 / 35 | 4268 |
| 2 | 1 | 67.4 | 83.2 | 14 / 35 | 4437 |
| 3 | 1 | 70.0 | 89.2 | 18 / 35 | 4835 |
| 4 | 1 | 69.7 | 90.5 | 16 / 35 | 4792 |
| 5 | 1 | 70.0 | 89.5 | 18 / 35 | 4692 |
| 6 | 2 | 65.5 | 78.7 | 13 / 35 | 4053 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 60 | 58% |
| zyx.mega.YersiniaPestis 3.1 | 52 | 58% |
| myl.micro.Troodon 1.10 | 19 | 84% |
| jok.PheonixM 0.1.2 | 9 | 100% |
| ph.melee.ArcherME 0.3 | 2 | 100% |
| ap.Frederick 1.1 | 2 | 50% |

Hadur died in 122 of 210 rounds, at a mean tick of 957. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 52 | 43% | 84 |
| zyx.mega.YersiniaPestis 3.1 | 40 | 33% | 83 |
| myl.micro.Troodon 1.10 | 16 | 13% | 25 |
| jok.PheonixM 0.1.2 | 8 | 7% | 15 |
| ap.Frederick 1.1 | 1 | 1% | 0 |
| ph.melee.ArcherME 0.3 | 0 | 0% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 162808 melee ticks, 49154 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 39 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 53991 sent, 49218 reached their opponent, 7749 virtual hits (15.7% of those reached).

## Melee bench: F30

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 638 over 6 battles (106.3 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 75.6 | 47 / 210 | 3.20 | 14.9% | 22815 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.5 | 14.9% | 47 |
| darkcanuck.B26354 1.06 | 2.2 | 14.2% | 53 |
| catcat20.Matcha 0.006 | 2.8 | 13.4% | 55 |
| stelo.PastFuture 2.3.2 | 4.2 | 12.5% | 22 |
| oog.melee.Capulet 1.2 | 4.3 | 12.3% | 20 |
| intruder.PrairieWolf 2.61 | 6.8 | 8.6% | 7 |
| tripphippy.Alice 1.1 | 7.3 | 7.5% | 3 |
| ntc.Opposite 1.5 | 7.7 | 7.1% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 8.2 | 6.7% | 3 |
| GarmBox.Anger 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 76.2 | 9 / 35 | 3967 |
| 2 | 2 | 61.6 | 72.4 | 6 / 35 | 3644 |
| 3 | 1 | 63.9 | 77.1 | 9 / 35 | 3994 |
| 4 | 2 | 60.5 | 70.5 | 8 / 35 | 3456 |
| 5 | 2 | 62.4 | 75.6 | 6 / 35 | 3685 |
| 6 | 1 | 64.8 | 81.9 | 9 / 35 | 4069 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 36 | 39% |
| catcat20.Matcha 0.006 | 24 | 33% |
| oog.melee.Capulet 1.2 | 13 | 62% |
| stelo.PastFuture 2.3.2 | 13 | 38% |
| tripphippy.Alice 1.1 | 8 | 75% |
| intruder.PrairieWolf 2.61 | 4 | 75% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 100% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 55 | 32% | 65 |
| stelo.PastFuture 2.3.2 | 35 | 21% | 41 |
| catcat20.Matcha 0.006 | 33 | 19% | 44 |
| oog.melee.Capulet 1.2 | 20 | 12% | 31 |
| tripphippy.Alice 1.1 | 8 | 5% | 11 |
| intruder.PrairieWolf 2.61 | 7 | 4% | 10 |
| ntc.Opposite 1.5 | 4 | 2% | 5 |
| fowl3628800.LightningBolt 2.6.0 | 3 | 2% | 3 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 157685 melee ticks, 28633 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 73 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 0.

Targeting waves (209 rounds): 51748 sent, 46662 reached their opponent, 8095 virtual hits (17.3% of those reached).

## Melee bench: F31

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 738 over 6 battles (123.0 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 76.7 | 52 / 210 | 3.10 | 15.2% | 21195 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.2% | 103 |
| hadur2.Hadur 3.18o2 | 2.0 | 15.2% | 52 |
| gh.mini.Griezel 0.2 | 3.3 | 12.7% | 40 |
| d414.nano.Quantum 1.0.0 | 4.0 | 11.6% | 4 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 10.7% | 7 |
| gh.nano.Grofvuil 0.2 | 6.2 | 9.0% | 1 |
| timmit.nano.TimDog 0.33 | 6.8 | 7.2% | 2 |
| fm.mammillarias 1.3 | 8.3 | 5.8% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 4.7% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.5 | 80.0 | 11 / 35 | 3645 |
| 2 | 2 | 65.7 | 81.6 | 12 / 35 | 4060 |
| 3 | 2 | 62.3 | 73.3 | 9 / 35 | 3358 |
| 4 | 2 | 62.5 | 77.8 | 5 / 35 | 3185 |
| 5 | 2 | 64.0 | 78.1 | 7 / 35 | 3697 |
| 6 | 2 | 60.7 | 69.5 | 8 / 35 | 3250 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 49 | 41% |
| gh.mini.Griezel 0.2 | 23 | 39% |
| d414.nano.Quantum 1.0.0 | 12 | 83% |
| spinnercat.micro.Tyger 0.1 | 9 | 100% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 0% |

Hadur died in 166 of 210 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 62 | 37% | 76 |
| gh.mini.Griezel 0.2 | 41 | 25% | 54 |
| d414.nano.Quantum 1.0.0 | 20 | 12% | 30 |
| spinnercat.micro.Tyger 0.1 | 16 | 10% | 25 |
| gh.nano.Grofvuil 0.2 | 8 | 5% | 10 |
| timmit.nano.TimDog 0.33 | 6 | 4% | 6 |
| fm.mammillarias 1.3 | 5 | 3% | 6 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 152432 melee ticks, 26557 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 56 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 1.

Targeting waves (208 rounds): 50423 sent, 45420 reached their opponent, 7676 virtual hits (16.9% of those reached).

## Melee bench: F32

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 377 over 6 battles (62.8 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 90.5 | 120 / 210 | 1.85 | 18.7% | 27753 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.0 | 18.7% | 120 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.5% | 52 |
| apc.botM 3.0 | 3.0 | 12.7% | 17 |
| lxx.ConceptA 0.8 | 4.7 | 10.4% | 4 |
| vjik.UnViolation 1.1 | 4.7 | 10.6% | 8 |
| bayen.UbaMicro 1.4 | 5.7 | 8.7% | 5 |
| panzer.Panzer 0.2 | 7.3 | 6.7% | 0 |
| yk.JahMicro 1.0 | 8.2 | 6.1% | 2 |
| conscience.Electron 1.3g | 8.5 | 6.3% | 0 |
| donjezza.Jezza 1.0 | 10.0 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 91.7 | 21 / 35 | 4701 |
| 2 | 1 | 69.4 | 94.6 | 22 / 35 | 4715 |
| 3 | 1 | 68.0 | 89.5 | 19 / 35 | 4547 |
| 4 | 1 | 68.0 | 88.6 | 20 / 35 | 4676 |
| 5 | 1 | 68.2 | 88.9 | 20 / 35 | 4553 |
| 6 | 1 | 67.5 | 89.8 | 18 / 35 | 4561 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 80 | 61% |
| apc.botM 3.0 | 37 | 73% |
| lxx.ConceptA 0.8 | 20 | 80% |
| vjik.UnViolation 1.1 | 14 | 100% |
| bayen.UbaMicro 1.4 | 9 | 67% |
| donjezza.Jezza 1.0 | 6 | 67% |
| yk.JahMicro 1.0 | 4 | 75% |
| panzer.Panzer 0.2 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 35 | 38% | 77 |
| apc.botM 3.0 | 18 | 19% | 48 |
| lxx.ConceptA 0.8 | 16 | 17% | 30 |
| bayen.UbaMicro 1.4 | 9 | 10% | 13 |
| vjik.UnViolation 1.1 | 5 | 5% | 25 |
| conscience.Electron 1.3g | 3 | 3% | 4 |
| donjezza.Jezza 1.0 | 2 | 2% | 5 |
| panzer.Panzer 0.2 | 2 | 2% | 3 |
| yk.JahMicro 1.0 | 1 | 1% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 127362 melee ticks, 51353 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 70 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 44190 sent, 39387 reached their opponent, 7305 virtual hits (18.5% of those reached).

## Melee bench: F33

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 810 over 6 battles (135.0 per battle, most in one battle 150). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 85.3 | 101 / 210 | 2.32 | 18.3% | 27902 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.0 | 18.3% | 101 |
| maribo.Quester 0.3 | 2.0 | 16.5% | 51 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.5% | 19 |
| gre.svman4.Leonidas 1.3.2 | 4.2 | 10.9% | 13 |
| labg.Cataclysm 2.05 | 4.7 | 10.7% | 18 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.2 | 9.1% | 5 |
| baal.nano.N 1.42 | 6.7 | 8.8% | 3 |
| zyx.micro.Ant 1.1 | 8.0 | 5.8% | 0 |
| sanja.First 0.1 | 9.0 | 4.5% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 84.4 | 16 / 35 | 4692 |
| 2 | 1 | 67.5 | 84.1 | 14 / 35 | 4376 |
| 3 | 1 | 69.1 | 89.2 | 18 / 35 | 4545 |
| 4 | 1 | 67.9 | 82.9 | 18 / 35 | 4543 |
| 5 | 1 | 68.6 | 87.0 | 16 / 35 | 5072 |
| 6 | 1 | 68.7 | 84.4 | 19 / 35 | 4674 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 65 | 71% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 80% |
| gre.svman4.Leonidas 1.3.2 | 22 | 82% |
| labg.Cataclysm 2.05 | 13 | 54% |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 83% |
| baal.nano.N 1.42 | 5 | 80% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 949. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 45 | 38% | 93 |
| gre.svman4.Leonidas 1.3.2 | 20 | 17% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 15% | 41 |
| labg.Cataclysm 2.05 | 13 | 11% | 20 |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 8% | 12 |
| baal.nano.N 1.42 | 5 | 4% | 10 |
| zyx.micro.Ant 1.1 | 1 | 1% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 170123 melee ticks, 46127 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 42 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 2.

Targeting waves (208 rounds): 55697 sent, 50798 reached their opponent, 7561 virtual hits (14.9% of those reached).

## Melee bench: F34

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 714 over 6 battles (119.0 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.6 | 81 / 210 | 2.20 | 17.9% | 29531 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.0 | 17.9% | 81 |
| stelo.Spread 0.9 | 2.3 | 16.0% | 61 |
| kid.Gladiator .7.2 | 2.7 | 16.1% | 39 |
| jcs.Seth 1.8 | 4.2 | 11.6% | 18 |
| tcf.Reach 3 | 5.2 | 10.4% | 7 |
| cli.Dancer 1.1 | 5.7 | 9.3% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.0% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.3% | 1 |
| sample.VelociRobot 1.0 | 9.0 | 3.6% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 88.6 | 17 / 35 | 4664 |
| 2 | 1 | 71.0 | 91.1 | 20 / 35 | 5736 |
| 3 | 1 | 68.1 | 85.4 | 11 / 35 | 5141 |
| 4 | 1 | 67.1 | 85.4 | 10 / 35 | 4638 |
| 5 | 1 | 67.2 | 84.8 | 9 / 35 | 4624 |
| 6 | 1 | 67.2 | 84.4 | 14 / 35 | 4728 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 57 | 56% |
| stelo.Spread 0.9 | 49 | 45% |
| jcs.Seth 1.8 | 26 | 58% |
| tcf.Reach 3 | 8 | 88% |
| cli.Dancer 1.1 | 3 | 100% |
| ratosh.Wesco 1.4 | 2 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 0% |

Hadur died in 135 of 210 rounds, at a mean tick of 1098. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 51 | 38% | 77 |
| kid.Gladiator .7.2 | 49 | 36% | 70 |
| jcs.Seth 1.8 | 18 | 13% | 34 |
| tcf.Reach 3 | 7 | 5% | 15 |
| cli.Dancer 1.1 | 2 | 1% | 10 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |
| ratosh.Wesco 1.4 | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 173024 melee ticks, 63110 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 42 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 53761 sent, 48913 reached their opponent, 8314 virtual hits (17.0% of those reached).

## Melee bench: F35

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 405 over 6 battles (67.5 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 81.7 | 52 / 210 | 2.65 | 16.0% | 22501 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 18.7% | 128 |
| hadur2.Hadur 3.18o2 | 2.0 | 16.0% | 52 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.8 | 12.7% | 11 |
| gh.mini.Gruwel 0.9 | 4.0 | 12.4% | 14 |
| rz.HawkOnFire 0.1 | 4.2 | 12.0% | 4 |
| wit.Chuliath 1.0 | 6.2 | 6.9% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 5.8% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.2 | 5.6% | 0 |
| dans.Cinnamon 1.2 | 8.8 | 5.1% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 82.2 | 12 / 35 | 3913 |
| 2 | 2 | 64.8 | 81.9 | 9 / 35 | 3693 |
| 3 | 2 | 64.8 | 81.9 | 7 / 35 | 3649 |
| 4 | 2 | 65.8 | 83.5 | 9 / 35 | 3973 |
| 5 | 2 | 65.0 | 82.2 | 8 / 35 | 3807 |
| 6 | 2 | 63.9 | 78.4 | 7 / 35 | 3466 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 77 | 25% |
| gh.mini.Gruwel 0.9 | 22 | 64% |
| dmh.robocode.robot.BlackDeath 9.2 | 15 | 60% |
| rz.HawkOnFire 0.1 | 10 | 90% |
| wit.Chuliath 1.0 | 2 | 50% |

Hadur died in 161 of 210 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 86 | 53% | 101 |
| gh.mini.Gruwel 0.9 | 23 | 14% | 38 |
| rz.HawkOnFire 0.1 | 23 | 14% | 33 |
| dmh.robocode.robot.BlackDeath 9.2 | 20 | 12% | 30 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 5 | 3% | 5 |
| wit.Chuliath 1.0 | 1 | 1% | 2 |
| dans.Cinnamon 1.2 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 142877 melee ticks, 46428 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 865 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 171 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 45650 sent, 40779 reached their opponent, 6534 virtual hits (16.0% of those reached).

## Melee bench: F36

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 265 over 6 battles (44.2 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 93.4 | 157 / 210 | 1.59 | 20.9% | 32618 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.0 | 20.9% | 157 |
| bzdp.Pansy 2.1 | 2.7 | 12.0% | 6 |
| alpha.RainingFire 1.0 | 2.7 | 12.4% | 20 |
| bvh.micro.Freya 0.3 | 4.3 | 10.8% | 10 |
| mz.Cork 0.1 | 5.0 | 10.4% | 9 |
| m3thos.Eva02 0.7.1 | 5.8 | 10.1% | 8 |
| bvh.mini.Fenrir 0.39 | 6.5 | 9.3% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 5.6% | 0 |
| dl.BetterWalls 1.0 | 8.8 | 4.9% | 0 |
| sample.MyFirstRobot 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 94.9 | 27 / 35 | 5705 |
| 2 | 1 | 71.1 | 94.0 | 27 / 35 | 5282 |
| 3 | 1 | 71.6 | 95.2 | 27 / 35 | 5496 |
| 4 | 1 | 68.8 | 86.0 | 22 / 35 | 4997 |
| 5 | 1 | 71.8 | 95.9 | 26 / 35 | 5541 |
| 6 | 1 | 71.7 | 94.6 | 28 / 35 | 5597 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 44 | 91% |
| alpha.RainingFire 1.0 | 39 | 77% |
| mz.Cork 0.1 | 36 | 92% |
| bvh.micro.Freya 0.3 | 27 | 89% |
| m3thos.Eva02 0.7.1 | 17 | 76% |
| bvh.mini.Fenrir 0.39 | 11 | 100% |
| sample.MyFirstRobot 1.0 | 3 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 19 | 35% | 45 |
| bvh.micro.Freya 0.3 | 12 | 22% | 36 |
| bzdp.Pansy 2.1 | 7 | 13% | 39 |
| mz.Cork 0.1 | 5 | 9% | 38 |
| m3thos.Eva02 0.7.1 | 5 | 9% | 23 |
| bvh.mini.Fenrir 0.39 | 5 | 9% | 15 |
| dl.BetterWalls 1.0 | 0 | 0% | 8 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 2 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 146785 melee ticks, 51018 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 60 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 60 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 2.

Targeting waves (205 rounds): 50873 sent, 46288 reached their opponent, 9938 virtual hits (21.5% of those reached).

## Melee bench: F37

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 680 over 6 battles (113.3 per battle, most in one battle 144). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 87.0 | 158 / 210 | 2.17 | 19.1% | 33362 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.0 | 19.1% | 158 |
| germ.TheMind .2 | 2.8 | 10.2% | 13 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.7 | 10.0% | 5 |
| EBBU.Sim2 1.02 | 4.7 | 9.3% | 5 |
| stelo.UntouchableNano 1.3 | 5.8 | 9.0% | 10 |
| lmk.ACPFinal 0.1 | 5.8 | 9.0% | 7 |
| agrach.Dalek 1.0 | 6.5 | 9.0% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 7.5 | 8.6% | 3 |
| mb.Beast 0.1 | 7.7 | 8.0% | 4 |
| skm.Ryubot 1.0 | 9.5 | 7.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 79.0 | 22 / 35 | 5228 |
| 2 | 1 | 69.6 | 91.1 | 28 / 35 | 5972 |
| 3 | 1 | 68.5 | 89.5 | 27 / 35 | 5438 |
| 4 | 1 | 68.6 | 88.6 | 27 / 35 | 5651 |
| 5 | 1 | 66.6 | 81.9 | 24 / 35 | 5512 |
| 6 | 1 | 69.5 | 92.1 | 30 / 35 | 5561 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.UntouchableNano 1.3 | 28 | 82% |
| skm.Ryubot 1.0 | 24 | 96% |
| agrach.Dalek 1.0 | 24 | 100% |
| mb.Beast 0.1 | 24 | 100% |
| germ.TheMind .2 | 23 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 17 | 100% |
| EBBU.Sim2 1.02 | 14 | 86% |
| lmk.ACPFinal 0.1 | 12 | 92% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 420. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 17 | 30% | 22 |
| lmk.ACPFinal 0.1 | 8 | 14% | 22 |
| EBBU.Sim2 1.02 | 7 | 12% | 23 |
| com.syncleus.robocode.Dreadnaught 0.1 | 6 | 11% | 29 |
| stelo.UntouchableNano 1.3 | 6 | 11% | 26 |
| agrach.Dalek 1.0 | 4 | 7% | 36 |
| germ.TheMind .2 | 4 | 7% | 22 |
| mb.Beast 0.1 | 0 | 0% | 23 |
| skm.Ryubot 1.0 | 0 | 0% | 4 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 94877 melee ticks, 26977 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 78 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 78 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 32427 sent, 27841 reached their opponent, 8417 virtual hits (30.2% of those reached).

## Melee bench: F38

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 320 over 6 battles (53.3 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 86.7 | 112 / 210 | 2.20 | 18.2% | 28118 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.0 | 18.2% | 112 |
| justin.Mallais 14.0 | 2.0 | 15.9% | 61 |
| bvh.mini.Freya 0.55 | 3.2 | 12.6% | 17 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.2% | 16 |
| cs.Wren 1.0 | 4.7 | 10.5% | 1 |
| kdf.KoulDestroyer 1.0 | 5.8 | 9.5% | 0 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.0 | 8.3% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.1% | 0 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.1% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 83.2 | 13 / 35 | 4422 |
| 2 | 1 | 69.8 | 90.8 | 21 / 35 | 5052 |
| 3 | 1 | 68.8 | 89.2 | 20 / 35 | 4739 |
| 4 | 1 | 67.8 | 85.4 | 19 / 35 | 4673 |
| 5 | 1 | 68.0 | 85.4 | 20 / 35 | 4628 |
| 6 | 1 | 67.7 | 86.0 | 19 / 35 | 4604 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 64 | 63% |
| bts.mega.Gnarly 1.4 | 34 | 76% |
| bvh.mini.Freya 0.55 | 24 | 83% |
| cs.Wren 1.0 | 15 | 100% |
| kdf.KoulDestroyer 1.0 | 6 | 100% |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 75% |
| matt.UnderDark3 2.4.34 | 1 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 40 | 39% | 75 |
| bts.mega.Gnarly 1.4 | 18 | 18% | 48 |
| bvh.mini.Freya 0.55 | 18 | 18% | 30 |
| cs.Wren 1.0 | 10 | 10% | 28 |
| kdf.KoulDestroyer 1.0 | 8 | 8% | 13 |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 3% | 8 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 2% | 5 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 1 |
| bzdp.BoxCar 2.0 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 131297 melee ticks, 38219 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 49 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 44622 sent, 39597 reached their opponent, 8661 virtual hits (21.9% of those reached).

## Melee bench: F39

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 785 over 6 battles (130.8 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 85.7 | 90 / 210 | 2.29 | 17.9% | 29695 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.0 | 17.9% | 90 |
| bvh.fry.Freya 0.82 | 2.2 | 14.7% | 24 |
| az.Ololobot 0.2.4 | 3.0 | 13.4% | 58 |
| catcat20.Lambda 0.024 | 3.8 | 12.0% | 27 |
| gimp.GimpBot 0.1 | 5.8 | 8.3% | 3 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.0% | 3 |
| apollokidd.ApolloKidd 0.9 | 6.7 | 7.8% | 2 |
| stelo.SoRobotNanoMelee 1.2 | 7.2 | 7.4% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.5% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 87.3 | 15 / 35 | 5080 |
| 2 | 1 | 66.1 | 83.5 | 12 / 35 | 4717 |
| 3 | 1 | 68.7 | 90.8 | 19 / 35 | 4896 |
| 4 | 1 | 66.4 | 83.2 | 13 / 35 | 5002 |
| 5 | 1 | 66.3 | 81.0 | 15 / 35 | 4910 |
| 6 | 1 | 68.4 | 88.6 | 16 / 35 | 5090 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 52 | 54% |
| bvh.fry.Freya 0.82 | 43 | 77% |
| catcat20.Lambda 0.024 | 27 | 52% |
| stelo.SoRobotNanoMelee 1.2 | 5 | 100% |
| gimp.GimpBot 0.1 | 4 | 75% |
| winamp32.micro.MicroMacro 1.0 | 3 | 100% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 1014. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 42 | 33% | 71 |
| az.Ololobot 0.2.4 | 32 | 25% | 64 |
| catcat20.Lambda 0.024 | 28 | 22% | 37 |
| gimp.GimpBot 0.1 | 8 | 6% | 16 |
| winamp32.micro.MicroMacro 1.0 | 3 | 2% | 8 |
| apollokidd.ApolloKidd 0.9 | 3 | 2% | 5 |
| stelo.SoRobotNanoMelee 1.2 | 2 | 2% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 2% | 4 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 164818 melee ticks, 49132 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 59 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 52399 sent, 47521 reached their opponent, 8531 virtual hits (18.0% of those reached).

## Melee bench: F40

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 532 over 6 battles (88.7 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 87.1 | 130 / 210 | 2.16 | 19.1% | 29054 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.0 | 19.1% | 130 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.9% | 32 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.9% | 17 |
| mz.AntiGrav 1.0 | 3.8 | 11.6% | 9 |
| Polkwane.SmashMelee 1.0 | 5.2 | 10.1% | 9 |
| stelo.Randomness 1.0 | 6.2 | 9.0% | 8 |
| alpha.BlackIce 1.0 | 6.7 | 8.7% | 4 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.4% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 4.2% | 0 |
| sample.Corners 1.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 91.4 | 23 / 35 | 5181 |
| 2 | 1 | 68.5 | 85.1 | 20 / 35 | 4687 |
| 3 | 1 | 69.1 | 88.6 | 22 / 35 | 4698 |
| 4 | 1 | 69.2 | 86.0 | 21 / 35 | 4718 |
| 5 | 1 | 68.2 | 82.2 | 20 / 35 | 4861 |
| 6 | 1 | 69.7 | 89.5 | 24 / 35 | 4909 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 55 | 82% |
| kano.gamma.KanoGamma 1.8 | 43 | 91% |
| mz.AntiGrav 1.0 | 20 | 95% |
| Polkwane.SmashMelee 1.0 | 19 | 95% |
| stelo.Randomness 1.0 | 5 | 80% |
| alpha.BlackIce 1.0 | 4 | 75% |
| amk.superstrike.SuperStrike 0.3 | 3 | 67% |

Hadur died in 84 of 210 rounds, at a mean tick of 788. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 31 | 37% | 64 |
| kano.gamma.KanoGamma 1.8 | 14 | 17% | 54 |
| mz.AntiGrav 1.0 | 12 | 14% | 37 |
| Polkwane.SmashMelee 1.0 | 7 | 8% | 20 |
| stelo.Randomness 1.0 | 7 | 8% | 17 |
| alpha.BlackIce 1.0 | 7 | 8% | 9 |
| amk.superstrike.SuperStrike 0.3 | 1 | 1% | 4 |
| sample.Corners 1.0 | 1 | 1% | 3 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 149533 melee ticks, 38840 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 120 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 120 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 50215 sent, 45182 reached their opponent, 9592 virtual hits (21.2% of those reached).

## Melee bench: F41

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 438 over 6 battles (73.0 per battle, most in one battle 146). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 86.1 | 99 / 210 | 2.25 | 17.8% | 26146 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.2 | 17.8% | 99 |
| eem.EvBotNG v12.8 | 1.8 | 15.4% | 67 |
| ary.Swarm 1.1 | 3.2 | 13.3% | 14 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.6% | 15 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 11.1% | 10 |
| shrub.Silver v048 | 6.0 | 9.4% | 1 |
| zyx.nano.Ant 1.1 | 7.2 | 6.8% | 0 |
| jsal.Jsalbot 1.0 | 8.0 | 6.0% | 3 |
| stelo.Mirror 1.1 | 8.8 | 5.3% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 92.1 | 19 / 35 | 4417 |
| 2 | 1 | 66.6 | 82.9 | 16 / 35 | 4212 |
| 3 | 2 | 65.5 | 77.8 | 14 / 35 | 4026 |
| 4 | 1 | 69.1 | 88.9 | 21 / 35 | 4604 |
| 5 | 1 | 67.6 | 87.0 | 11 / 35 | 4497 |
| 6 | 1 | 68.4 | 87.9 | 18 / 35 | 4390 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 61 | 44% |
| ary.Swarm 1.1 | 32 | 88% |
| lessonz.robocode.Oz 0.5.0 | 30 | 73% |
| simonton.nano.MeleeSeed 1.8 | 13 | 77% |
| shrub.Silver v048 | 6 | 83% |
| jsal.Jsalbot 1.0 | 6 | 100% |
| stelo.Mirror 1.1 | 2 | 50% |

Hadur died in 115 of 210 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 49 | 43% | 79 |
| lessonz.robocode.Oz 0.5.0 | 23 | 20% | 41 |
| ary.Swarm 1.1 | 22 | 19% | 45 |
| simonton.nano.MeleeSeed 1.8 | 9 | 8% | 21 |
| shrub.Silver v048 | 6 | 5% | 13 |
| stelo.Mirror 1.1 | 2 | 2% | 4 |
| zyx.nano.Ant 1.1 | 1 | 1% | 1 |
| jsal.Jsalbot 1.0 | 0 | 0% | 6 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 152842 melee ticks, 42993 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 110 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 110 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 50763 sent, 45858 reached their opponent, 7693 virtual hits (16.8% of those reached).

## Melee bench: F42

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 267 over 6 battles (44.5 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 90.7 | 126 / 210 | 1.83 | 19.9% | 34513 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.0 | 19.9% | 126 |
| wompi.Wallaby 5.1 | 2.0 | 15.8% | 46 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.2% | 20 |
| ara.Shera 0.88 | 3.7 | 12.3% | 17 |
| amz.NanoClone 1.41 | 5.0 | 9.1% | 1 |
| dsw.StaticD 1.0 | 6.3 | 7.1% | 0 |
| maribo.IotaCT 1.1 | 6.7 | 6.5% | 0 |
| stelo.MirrorMicro 1.0 | 8.2 | 5.8% | 0 |
| mme.NikeEnhanced 2.0 | 9.3 | 5.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 92.4 | 22 / 35 | 6079 |
| 2 | 1 | 69.5 | 88.3 | 20 / 35 | 5770 |
| 3 | 1 | 70.4 | 92.1 | 19 / 35 | 5614 |
| 4 | 1 | 70.8 | 93.7 | 22 / 35 | 5872 |
| 5 | 1 | 70.3 | 90.8 | 21 / 35 | 5888 |
| 6 | 1 | 69.0 | 87.3 | 22 / 35 | 5290 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 87 | 86% |
| maribo.mini.MiniQuester 0.1 | 38 | 76% |
| ara.Shera 0.88 | 29 | 59% |
| dsw.StaticD 1.0 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 956. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 32 | 38% | 50 |
| wompi.Wallaby 5.1 | 28 | 33% | 93 |
| maribo.mini.MiniQuester 0.1 | 22 | 26% | 55 |
| amz.NanoClone 1.41 | 1 | 1% | 3 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 1 |
| dsw.StaticD 1.0 | 0 | 0% | 6 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 162821 melee ticks, 48849 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 40 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 52166 sent, 47500 reached their opponent, 9707 virtual hits (20.4% of those reached).

## Melee bench: F43

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 525 over 6 battles (87.5 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 78.9 | 33 / 210 | 2.90 | 15.5% | 23299 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.7% | 141 |
| hadur2.Hadur 3.18o2 | 2.2 | 15.5% | 33 |
| brainfade.melee.Dusk 0.44 | 2.8 | 12.8% | 28 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.4% | 4 |
| Krabb.akim2.Akim2 1.1b | 5.5 | 9.9% | 1 |
| wcsv.melee.EngineerMelee 0.1 | 5.5 | 10.2% | 2 |
| mz.NanoGod 2.02 | 7.3 | 7.8% | 1 |
| jab.DiamondStealer 5 | 7.7 | 7.5% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.8% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 80.6 | 8 / 35 | 4128 |
| 2 | 2 | 66.2 | 81.6 | 5 / 35 | 4052 |
| 3 | 2 | 66.0 | 81.6 | 7 / 35 | 3774 |
| 4 | 3 | 62.3 | 71.4 | 3 / 35 | 3356 |
| 5 | 2 | 65.8 | 79.0 | 6 / 35 | 4083 |
| 6 | 2 | 65.3 | 79.4 | 4 / 35 | 3906 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 78 | 24% |
| brainfade.melee.Dusk 0.44 | 22 | 36% |
| dummy.micro.Sparrow 2.5 | 4 | 75% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 50% |
| Krabb.akim2.Akim2 1.1b | 2 | 50% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 181 of 210 rounds, at a mean tick of 948. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 100 | 55% | 118 |
| brainfade.melee.Dusk 0.44 | 32 | 18% | 40 |
| dummy.micro.Sparrow 2.5 | 13 | 7% | 15 |
| wcsv.melee.EngineerMelee 0.1 | 11 | 6% | 12 |
| Krabb.akim2.Akim2 1.1b | 9 | 5% | 11 |
| mz.NanoGod 2.02 | 7 | 4% | 9 |
| jab.DiamondStealer 5 | 4 | 2% | 4 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 152827 melee ticks, 47515 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 39 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 49785 sent, 44752 reached their opponent, 7602 virtual hits (17.0% of those reached).

## Melee bench: F44

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 777 over 6 battles (129.5 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 89.6 | 129 / 210 | 1.94 | 19.9% | 33506 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.0 | 19.9% | 129 |
| stelo.Liblix 0.3.1 | 2.0 | 15.5% | 51 |
| tzu.TheArtOfWar 1.2 | 3.0 | 14.2% | 26 |
| jwirde.Gort 2.0 | 4.3 | 9.9% | 2 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.7 | 9.9% | 1 |
| disan.Chair 2.2.0 | 6.3 | 7.8% | 1 |
| wompi.Quokka 1.6 | 6.8 | 7.6% | 0 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.2% | 0 |
| sample.Crazy 1.0 | 9.0 | 5.0% | 0 |
| amk.jointstrike.JointStrike 0.2 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 90.2 | 18 / 35 | 5505 |
| 2 | 1 | 70.4 | 93.0 | 22 / 35 | 5467 |
| 3 | 1 | 69.6 | 87.0 | 22 / 35 | 5354 |
| 4 | 1 | 69.0 | 84.1 | 18 / 35 | 5566 |
| 5 | 1 | 71.0 | 90.2 | 25 / 35 | 5863 |
| 6 | 1 | 71.3 | 93.0 | 24 / 35 | 5751 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 67 | 57% |
| tzu.TheArtOfWar 1.2 | 63 | 79% |
| jwirde.Gort 2.0 | 14 | 100% |
| disan.Chair 2.2.0 | 12 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 10 | 100% |
| wompi.Quokka 1.6 | 3 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 942. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 39 | 44% | 84 |
| tzu.TheArtOfWar 1.2 | 19 | 22% | 61 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 11 | 13% | 17 |
| jwirde.Gort 2.0 | 7 | 8% | 24 |
| wompi.Quokka 1.6 | 4 | 5% | 7 |
| disan.Chair 2.2.0 | 1 | 1% | 12 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 3 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 1 |
| sample.Crazy 1.0 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 155431 melee ticks, 48571 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 48 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 53627 sent, 48983 reached their opponent, 10656 virtual hits (21.8% of those reached).

## Melee bench: F45

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 774 over 6 battles (129.0 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 88.1 | 97 / 210 | 2.07 | 19.7% | 33538 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2 | 1.0 | 19.7% | 97 |
| jje.BagPuss 1.2 | 2.5 | 12.4% | 5 |
| eem.IWillFireNoBullet v2.8 | 2.5 | 12.7% | 93 |
| sul.Lunar 1.1 | 4.3 | 10.4% | 7 |
| myl.nano.Graviton 1.10 | 4.8 | 10.3% | 4 |
| fm.claire 1.7 | 6.7 | 8.5% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 8.3% | 3 |
| hvilela.HVilela 0.9 | 7.5 | 7.6% | 0 |
| wit.Deep7 2.0 | 8.8 | 5.8% | 2 |
| abud.ThirdRobo 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 86.3 | 15 / 35 | 5306 |
| 2 | 1 | 69.3 | 88.3 | 17 / 35 | 5471 |
| 3 | 1 | 69.3 | 86.3 | 16 / 35 | 5835 |
| 4 | 1 | 69.0 | 88.6 | 15 / 35 | 5318 |
| 5 | 1 | 68.8 | 87.0 | 12 / 35 | 5586 |
| 6 | 1 | 71.4 | 92.4 | 22 / 35 | 6022 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 92 | 42% |
| jje.BagPuss 1.2 | 18 | 94% |
| sul.Lunar 1.1 | 17 | 82% |
| pez.mini.ChironexFleckeri 0.5 | 11 | 82% |
| myl.nano.Graviton 1.10 | 10 | 90% |
| wit.Deep7 2.0 | 7 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 1605. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 58 | 49% | 0 |
| jje.BagPuss 1.2 | 16 | 13% | 65 |
| myl.nano.Graviton 1.10 | 15 | 13% | 43 |
| sul.Lunar 1.1 | 9 | 8% | 44 |
| pez.mini.ChironexFleckeri 0.5 | 5 | 4% | 18 |
| fm.claire 1.7 | 4 | 3% | 12 |
| wit.Deep7 2.0 | 3 | 3% | 10 |
| hvilela.HVilela 0.9 | 2 | 2% | 12 |
| abud.ThirdRobo 1.0 | 1 | 1% | 4 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 203460 melee ticks, 95781 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 34 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 62696 sent, 57897 reached their opponent, 9016 virtual hits (15.6% of those reached).

## Melee bench: F46

hadur2.Hadur 3.18o2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 501 over 6 battles (83.5 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 81.6 | 57 / 210 | 2.65 | 16.2% | 25091 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.7 | 17.0% | 62 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.6% | 75 |
| hadur2.Hadur 3.18o2 | 2.5 | 16.2% | 57 |
| mz.MicroSheep 1.0 | 4.3 | 10.4% | 1 |
| cx.Princess 1.0 | 4.7 | 9.9% | 10 |
| sadoner.killer 0.2 | 6.0 | 9.2% | 3 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.3% | 2 |
| jeremyreeder.collective.Prophet 5 | 8.2 | 5.6% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 66.5 | 82.2 | 10 / 35 | 4640 |
| 2 | 2 | 64.6 | 81.9 | 6 / 35 | 3929 |
| 3 | 1 | 67.0 | 86.3 | 14 / 35 | 4346 |
| 4 | 3 | 65.8 | 81.6 | 12 / 35 | 4142 |
| 5 | 3 | 64.9 | 80.0 | 7 / 35 | 4191 |
| 6 | 3 | 63.9 | 77.8 | 8 / 35 | 3843 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 60 | 63% |
| rsalesc.melee.Medina 0.4.5 | 37 | 27% |
| mz.MicroSheep 1.0 | 5 | 100% |
| cx.Princess 1.0 | 4 | 50% |
| sadoner.killer 0.2 | 2 | 50% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 64 | 41% | 99 |
| rsalesc.melee.Medina 0.4.5 | 53 | 34% | 67 |
| cx.Princess 1.0 | 14 | 9% | 19 |
| mz.MicroSheep 1.0 | 10 | 6% | 12 |
| sadoner.killer 0.2 | 5 | 3% | 6 |
| arthord.NanoSatanMelee Beta | 5 | 3% | 5 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 1 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 149527 melee ticks, 41816 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 81 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 81 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 44846 sent, 39932 reached their opponent, 6127 virtual hits (15.3% of those reached).

