# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 776 over 8 battles (97.0 per battle, most in one battle 240). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 86.0 | 66 / 280 | 2.26 | 17.0% | 39006 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.8% | 187 |
| hadur2.Hadur 3.18.1bb | 2.0 | 17.0% | 66 |
| sgp.JollyNinja 3.53 | 3.8 | 11.5% | 14 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.8 | 11.0% | 5 |
| mz.MicroGodMelee 1 | 5.0 | 10.3% | 6 |
| lorneswork.Predator 1.0 | 5.5 | 9.7% | 2 |
| adt.Ar2 1.0 | 7.1 | 7.5% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.1 | 5.3% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.9 | 87.9 | 8 / 35 | 4821 |
| 2 | 2 | 67.1 | 83.5 | 8 / 35 | 5323 |
| 3 | 2 | 67.0 | 84.8 | 10 / 35 | 4882 |
| 4 | 2 | 67.1 | 87.0 | 7 / 35 | 4992 |
| 5 | 2 | 67.1 | 88.6 | 8 / 35 | 4750 |
| 6 | 2 | 67.1 | 86.7 | 10 / 35 | 4868 |
| 7 | 2 | 65.5 | 84.4 | 5 / 35 | 4408 |
| 8 | 2 | 66.8 | 85.1 | 10 / 35 | 4962 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 158 | 10% |
| sgp.JollyNinja 3.53 | 25 | 64% |
| mz.MicroGodMelee 1 | 22 | 91% |
| lorneswork.Predator 1.0 | 7 | 71% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 100% |
| adt.Ar2 1.0 | 2 | 100% |
| skm.butterfly 1.0 | 2 | 100% |

Hadur died in 220 of 280 rounds, at a mean tick of 1102. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 160 | 73% | 184 |
| sgp.JollyNinja 3.53 | 19 | 9% | 31 |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 7% | 19 |
| lorneswork.Predator 1.0 | 13 | 6% | 18 |
| mz.MicroGodMelee 1 | 3 | 1% | 22 |
| adt.Ar2 1.0 | 3 | 1% | 4 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 0% | 1 |
| skm.butterfly 1.0 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 278 rounds): 193949 melee ticks, 110296 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (278 rounds): longest scan gap while four or more were alive 50 ticks (278 rounds over 8); rounds whose longest gap at any count was over 8: 278; robots dropped as dead without a death event: 1.

Targeting waves (278 rounds): 62974 sent, 56363 reached their opponent, 11707 virtual hits (20.8% of those reached).

## Melee bench: F02

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 311 over 8 battles (38.9 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 84.9 | 126 / 280 | 2.36 | 18.0% | 37918 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.0 | 18.0% | 126 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 13.1% | 42 |
| pulsar.PulsarMax 0.8.9 | 2.8 | 13.5% | 47 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.3 | 10.7% | 18 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.6% | 3 |
| Noran.BitchingElk 0.054 | 6.6 | 8.5% | 28 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 8.2% | 0 |
| sch.Simone 0.3d | 7.5 | 7.8% | 12 |
| stelo.PatternRobot 1.0 | 8.9 | 6.0% | 3 |
| fullsail.SweetTea 1.1 | 10.0 | 3.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 83.5 | 17 / 35 | 4616 |
| 2 | 1 | 67.3 | 85.4 | 16 / 35 | 4690 |
| 3 | 1 | 67.9 | 86.0 | 18 / 35 | 4674 |
| 4 | 1 | 65.3 | 78.4 | 14 / 35 | 4401 |
| 5 | 1 | 68.3 | 89.2 | 20 / 35 | 4528 |
| 6 | 1 | 67.3 | 84.8 | 15 / 35 | 5004 |
| 7 | 1 | 67.0 | 83.8 | 12 / 35 | 4820 |
| 8 | 1 | 68.4 | 87.9 | 14 / 35 | 5185 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 55 | 56% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 47 | 72% |
| com.cohesiva.robocode.ManOwaR 1.0 | 29 | 72% |
| Noran.BitchingElk 0.054 | 28 | 36% |
| lrem.micro.SpikeSoldier 0.4 | 15 | 100% |
| sch.Simone 0.3d | 14 | 71% |
| fnc.bandit.Bandit 5.2.0 | 3 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |
| stelo.PatternRobot 1.0 | 1 | 100% |

Hadur died in 156 of 280 rounds, at a mean tick of 985. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 44 | 28% | 70 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 25 | 16% | 57 |
| Noran.BitchingElk 0.054 | 23 | 15% | 35 |
| sch.Simone 0.3d | 17 | 11% | 26 |
| com.cohesiva.robocode.ManOwaR 1.0 | 16 | 10% | 44 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 10% | 26 |
| stelo.PatternRobot 1.0 | 7 | 4% | 9 |
| fnc.bandit.Bandit 5.2.0 | 6 | 4% | 10 |
| fullsail.SweetTea 1.1 | 2 | 1% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 271 rounds): 223034 melee ticks, 57133 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 89 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (271 rounds): longest scan gap while four or more were alive 89 ticks (271 rounds over 8); rounds whose longest gap at any count was over 8: 271; robots dropped as dead without a death event: 0.

Targeting waves (271 rounds): 79996 sent, 73586 reached their opponent, 13006 virtual hits (17.7% of those reached).

## Melee bench: F03

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 374 over 8 battles (46.8 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 92.2 | 223 / 280 | 1.70 | 20.5% | 49956 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.0 | 20.5% | 223 |
| radnor.DoctorBob 1.42 | 2.5 | 13.7% | 26 |
| kawigi.nano.Lib 1.0 | 2.9 | 13.1% | 13 |
| vuen.Cake 2.51 | 3.6 | 12.4% | 14 |
| urdos.URDOS 1.3 | 5.0 | 9.2% | 2 |
| adt.Ar1 2.1 | 6.3 | 7.5% | 1 |
| oa.weak.FlyMk1 0.1 | 7.3 | 6.9% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.9 | 6.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.1 | 5.3% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 94.0 | 29 / 35 | 6001 |
| 2 | 1 | 68.7 | 87.6 | 26 / 35 | 5657 |
| 3 | 1 | 69.2 | 87.3 | 23 / 35 | 6052 |
| 4 | 1 | 71.1 | 94.0 | 28 / 35 | 6225 |
| 5 | 1 | 72.2 | 95.6 | 32 / 35 | 6708 |
| 6 | 1 | 71.5 | 94.6 | 28 / 35 | 6328 |
| 7 | 1 | 70.2 | 88.6 | 26 / 35 | 6511 |
| 8 | 1 | 72.1 | 96.2 | 31 / 35 | 6474 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 84 | 96% |
| vuen.Cake 2.51 | 83 | 96% |
| kawigi.nano.Lib 1.0 | 53 | 98% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| urdos.URDOS 1.3 | 3 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 59 of 280 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 22 | 37% | 90 |
| kawigi.nano.Lib 1.0 | 11 | 19% | 67 |
| vuen.Cake 2.51 | 7 | 12% | 79 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 8% | 5 |
| urdos.URDOS 1.3 | 4 | 7% | 12 |
| adt.Ar1 2.1 | 4 | 7% | 6 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 3% | 6 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 11 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 2% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 267 rounds): 166409 melee ticks, 56272 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (267 rounds): longest scan gap while four or more were alive 55 ticks (267 rounds over 8); rounds whose longest gap at any count was over 8: 267; robots dropped as dead without a death event: 1.

Targeting waves (267 rounds): 51922 sent, 45828 reached their opponent, 12195 virtual hits (26.6% of those reached).

## Melee bench: F04

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 504 over 8 battles (63.0 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.1 | 55 / 280 | 2.34 | 17.5% | 43355 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 21.9% | 188 |
| hadur2.Hadur 3.18.1bb | 2.0 | 17.5% | 55 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.9% | 15 |
| TNT.TNT 0.99.1 | 4.0 | 10.8% | 15 |
| josago.Jorgito 0.16 | 5.1 | 9.0% | 3 |
| css.Delitioner 0.11 | 6.4 | 7.0% | 4 |
| tj.zombie1n 1.0.1 | 6.6 | 6.7% | 0 |
| rampancy.Durandal 2.1d | 8.1 | 5.4% | 0 |
| spin.Bugstard 0.012b | 8.9 | 4.3% | 1 |
| sp.Nanos.Ember 1.1 | 9.9 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.2 | 81.6 | 6 / 35 | 5465 |
| 2 | 2 | 69.2 | 87.9 | 12 / 35 | 5533 |
| 3 | 2 | 68.1 | 83.5 | 6 / 35 | 5786 |
| 4 | 2 | 66.7 | 84.1 | 3 / 35 | 4971 |
| 5 | 2 | 68.0 | 86.7 | 8 / 35 | 5179 |
| 6 | 2 | 68.0 | 84.8 | 6 / 35 | 5550 |
| 7 | 2 | 68.1 | 86.0 | 6 / 35 | 5328 |
| 8 | 2 | 68.5 | 86.0 | 8 / 35 | 5543 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 140 | 18% |
| TNT.TNT 0.99.1 | 25 | 52% |
| apc.LeeroyJenkins2 1.0 | 17 | 88% |
| tj.zombie1n 1.0.1 | 2 | 100% |
| josago.Jorgito 0.16 | 2 | 0% |
| spin.Bugstard 0.012b | 1 | 0% |
| css.Delitioner 0.11 | 1 | 0% |

Hadur died in 229 of 280 rounds, at a mean tick of 1240. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 149 | 65% | 183 |
| apc.LeeroyJenkins2 1.0 | 31 | 14% | 41 |
| TNT.TNT 0.99.1 | 22 | 10% | 33 |
| josago.Jorgito 0.16 | 15 | 7% | 16 |
| css.Delitioner 0.11 | 6 | 3% | 6 |
| rampancy.Durandal 2.1d | 1 | 0% | 1 |
| spin.Bugstard 0.012b | 1 | 0% | 0 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 265454 melee ticks, 83757 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 95 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 95 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 0.

Targeting waves (273 rounds): 82320 sent, 75864 reached their opponent, 11677 virtual hits (15.4% of those reached).

## Melee bench: F05

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 729 over 8 battles (91.1 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 76.6 | 41 / 280 | 3.10 | 14.7% | 30271 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.4 | 17.7% | 129 |
| justin.DemonicRage 3.4 | 1.6 | 17.4% | 84 |
| hadur2.Hadur 3.18.1bb | 3.0 | 14.7% | 41 |
| wompi.Numbat 2.1 | 4.0 | 12.9% | 20 |
| axeBots.HataMoto 3.09 | 5.4 | 9.1% | 6 |
| ms.Ares 0.19 | 5.6 | 8.9% | 1 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.0% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.5% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.0% | 0 |
| GarmBox.Oranges 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.3 | 75.9 | 5 / 35 | 3718 |
| 2 | 3 | 63.5 | 77.1 | 4 / 35 | 3832 |
| 3 | 3 | 61.6 | 72.4 | 6 / 35 | 3377 |
| 4 | 3 | 64.1 | 76.5 | 6 / 35 | 4135 |
| 5 | 3 | 64.5 | 78.7 | 7 / 35 | 3987 |
| 6 | 3 | 64.3 | 77.5 | 8 / 35 | 3903 |
| 7 | 3 | 64.1 | 79.0 | 4 / 35 | 3646 |
| 8 | 3 | 62.2 | 75.9 | 1 / 35 | 3673 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 46 | 22% |
| justin.DemonicRage 3.4 | 40 | 43% |
| wompi.Numbat 2.1 | 18 | 72% |
| axeBots.HataMoto 3.09 | 4 | 0% |
| ms.Ares 0.19 | 1 | 100% |

Hadur died in 246 of 280 rounds, at a mean tick of 873. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 86 | 35% | 98 |
| justin.DemonicRage 3.4 | 77 | 31% | 94 |
| wompi.Numbat 2.1 | 49 | 20% | 59 |
| axeBots.HataMoto 3.09 | 12 | 5% | 12 |
| ms.Ares 0.19 | 8 | 3% | 10 |
| GarmBox.Oranges 1.0 | 3 | 1% | 3 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 1% | 3 |
| supersample.SuperBoxBot 1.0 | 1 | 0% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 278 rounds): 211089 melee ticks, 39335 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (278 rounds): longest scan gap while four or more were alive 65 ticks (278 rounds over 8); rounds whose longest gap at any count was over 8: 278; robots dropped as dead without a death event: 4.

Targeting waves (278 rounds): 65878 sent, 59237 reached their opponent, 10149 virtual hits (17.1% of those reached).

## Melee bench: F06

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 712 over 8 battles (89.0 per battle, most in one battle 146). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 87.9 | 163 / 280 | 2.09 | 19.0% | 40626 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.0 | 19.0% | 163 |
| jekl.StoneGhost 0.7 | 2.4 | 14.3% | 30 |
| origin.SleepSiphon 1.7b | 2.9 | 13.8% | 51 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.2% | 28 |
| mld.Wisdom 1.0 | 5.0 | 10.7% | 4 |
| gg.Wolverine 2.0 | 6.1 | 8.4% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 6.8% | 5 |
| spinnercat.Omen 1.0 | 8.3 | 5.9% | 0 |
| DBall.NUKE 0.1 | 8.4 | 6.2% | 0 |
| sample.Fire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 85.4 | 20 / 35 | 4908 |
| 2 | 1 | 68.7 | 87.3 | 16 / 35 | 5219 |
| 3 | 1 | 67.8 | 83.2 | 18 / 35 | 4957 |
| 4 | 1 | 69.3 | 88.9 | 20 / 35 | 5135 |
| 5 | 1 | 67.3 | 81.6 | 19 / 35 | 4749 |
| 6 | 1 | 70.7 | 92.7 | 24 / 35 | 5195 |
| 7 | 1 | 70.9 | 94.6 | 26 / 35 | 5405 |
| 8 | 1 | 69.2 | 89.2 | 20 / 35 | 5058 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 73 | 86% |
| origin.SleepSiphon 1.7b | 63 | 73% |
| pe.minimelee.SandboxMiniMelee 1.1 | 36 | 61% |
| gg.Wolverine 2.0 | 12 | 100% |
| DBall.NUKE 0.1 | 8 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 8 | 63% |
| mld.Wisdom 1.0 | 7 | 100% |

Hadur died in 125 of 280 rounds, at a mean tick of 891. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 33 | 26% | 75 |
| jekl.StoneGhost 0.7 | 29 | 23% | 79 |
| pe.minimelee.SandboxMiniMelee 1.1 | 22 | 18% | 57 |
| mld.Wisdom 1.0 | 16 | 13% | 26 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 5% | 15 |
| gg.Wolverine 2.0 | 6 | 5% | 14 |
| spinnercat.Omen 1.0 | 4 | 3% | 6 |
| sample.Fire 1.0 | 1 | 1% | 1 |
| DBall.NUKE 0.1 | 0 | 0% | 7 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 197820 melee ticks, 61002 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 578 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 432 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 2.

Targeting waves (274 rounds): 63087 sent, 56702 reached their opponent, 13023 virtual hits (23.0% of those reached).

## Melee bench: F07

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 532 over 8 battles (66.5 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 92.7 | 155 / 280 | 1.66 | 20.5% | 50087 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.0 | 20.5% | 155 |
| rsalesc.melee.Monk 0.3.6c | 2.4 | 16.9% | 54 |
| rtk.Tachikoma 1.0 | 2.6 | 16.2% | 41 |
| franzor.Lizt 1.3.1 | 4.5 | 11.0% | 23 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 11.0% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.4 | 8.2% | 0 |
| exauge.GateKeeper 1.1.121g | 6.6 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.3% | 0 |
| sample.Target 1.0 | 9.1 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.9 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 89.2 | 14 / 35 | 5488 |
| 2 | 1 | 71.3 | 91.7 | 18 / 35 | 5780 |
| 3 | 1 | 73.3 | 96.2 | 25 / 35 | 6640 |
| 4 | 1 | 71.9 | 92.7 | 17 / 35 | 6452 |
| 5 | 1 | 72.4 | 92.4 | 19 / 35 | 6629 |
| 6 | 1 | 72.3 | 91.1 | 19 / 35 | 6500 |
| 7 | 1 | 72.6 | 94.9 | 23 / 35 | 6210 |
| 8 | 1 | 72.5 | 93.3 | 20 / 35 | 6388 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 99 | 67% |
| rsalesc.melee.Monk 0.3.6c | 68 | 38% |
| franzor.Lizt 1.3.1 | 44 | 70% |
| oog.melee.CapuletDroid 1.1 | 34 | 85% |
| exauge.GateKeeper 1.1.121g | 3 | 100% |

Hadur died in 129 of 280 rounds, at a mean tick of 1443. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 52 | 40% | 98 |
| rtk.Tachikoma 1.0 | 48 | 37% | 124 |
| franzor.Lizt 1.3.1 | 13 | 10% | 1 |
| oog.melee.CapuletDroid 1.1 | 11 | 9% | 47 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 7 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 258953 melee ticks, 122828 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 26 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 0.

Targeting waves (275 rounds): 78024 sent, 71493 reached their opponent, 14329 virtual hits (20.0% of those reached).

## Melee bench: F08

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 862 over 8 battles (107.8 per battle, most in one battle 147). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.8 | 162 / 280 | 2.10 | 18.8% | 38629 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.0 | 18.8% | 162 |
| tm.Yuugao 1.0 | 2.8 | 12.8% | 37 |
| shrub.Vapour v159 | 3.0 | 12.8% | 39 |
| Krabb.sliNk.Garm 0.9u | 3.3 | 12.0% | 24 |
| com.spp.robocode.MostlyHarmless 010 | 5.6 | 9.3% | 8 |
| m3thos.Eva00 1.1 | 5.8 | 9.0% | 3 |
| jwst.DAD.DarkAndDarker 1.1 | 6.6 | 8.2% | 7 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 6.5% | 1 |
| SHAM.WOW 1.4 | 9.1 | 5.6% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.9 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 87.3 | 17 / 35 | 4572 |
| 2 | 1 | 70.0 | 92.1 | 22 / 35 | 5360 |
| 3 | 1 | 68.2 | 88.6 | 20 / 35 | 4697 |
| 4 | 1 | 68.8 | 89.2 | 21 / 35 | 4969 |
| 5 | 1 | 69.4 | 90.5 | 24 / 35 | 4939 |
| 6 | 1 | 67.2 | 82.9 | 20 / 35 | 4723 |
| 7 | 1 | 67.9 | 88.6 | 19 / 35 | 4631 |
| 8 | 1 | 67.7 | 83.5 | 19 / 35 | 4738 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 66 | 71% |
| shrub.Vapour v159 | 55 | 67% |
| Krabb.sliNk.Garm 0.9u | 39 | 77% |
| com.spp.robocode.MostlyHarmless 010 | 23 | 83% |
| m3thos.Eva00 1.1 | 12 | 92% |
| jwst.DAD.DarkAndDarker 1.1 | 11 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| SHAM.WOW 1.4 | 3 | 100% |

Hadur died in 124 of 280 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| Krabb.sliNk.Garm 0.9u | 32 | 26% | 52 |
| tm.Yuugao 1.0 | 31 | 25% | 81 |
| shrub.Vapour v159 | 31 | 25% | 67 |
| com.spp.robocode.MostlyHarmless 010 | 14 | 11% | 33 |
| m3thos.Eva00 1.1 | 5 | 4% | 20 |
| qualidafial.MajorDick 1.0.1 | 3 | 2% | 3 |
| jwst.DAD.DarkAndDarker 1.1 | 1 | 1% | 17 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 3 |
| SHAM.WOW 1.4 | 0 | 0% | 4 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 278 rounds): 202378 melee ticks, 58627 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (278 rounds): longest scan gap while four or more were alive 54 ticks (277 rounds over 8); rounds whose longest gap at any count was over 8: 277; robots dropped as dead without a death event: 3.

Targeting waves (278 rounds): 68007 sent, 61479 reached their opponent, 11677 virtual hits (19.0% of those reached).

## Melee bench: F09

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 990 over 8 battles (123.8 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 72.2 | 60 / 280 | 3.50 | 14.4% | 27702 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.6% | 136 |
| hadur2.Hadur 3.18.1bb | 2.4 | 14.4% | 60 |
| kc.micro.Figment 1.0 | 2.8 | 14.0% | 44 |
| yagami.Tidus 0.11 | 4.5 | 11.0% | 4 |
| pedersen.Grishnakh 1.0 | 4.6 | 10.4% | 14 |
| mc2.enemy.Original 0.9 | 6.0 | 9.3% | 20 |
| dft.Calliope 5.6 | 6.8 | 8.0% | 2 |
| step.nanoPri 1.0 | 8.1 | 5.9% | 0 |
| rdm.Dueler 0.4x | 9.3 | 4.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.6 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 74.6 | 8 / 35 | 3586 |
| 2 | 3 | 59.7 | 67.9 | 4 / 35 | 3052 |
| 3 | 2 | 63.6 | 74.0 | 13 / 35 | 3781 |
| 4 | 3 | 61.9 | 74.0 | 7 / 35 | 3292 |
| 5 | 2 | 61.7 | 73.0 | 6 / 35 | 3357 |
| 6 | 2 | 62.4 | 72.1 | 7 / 35 | 3625 |
| 7 | 2 | 60.6 | 67.9 | 7 / 35 | 3386 |
| 8 | 3 | 62.6 | 74.3 | 8 / 35 | 3623 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 57 | 26% |
| kc.micro.Figment 1.0 | 34 | 74% |
| mc2.enemy.Original 0.9 | 11 | 45% |
| yagami.Tidus 0.11 | 8 | 100% |
| pedersen.Grishnakh 1.0 | 6 | 67% |
| dft.Calliope 5.6 | 4 | 75% |

Hadur died in 228 of 280 rounds, at a mean tick of 791. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 83 | 36% | 99 |
| kc.micro.Figment 1.0 | 45 | 20% | 68 |
| yagami.Tidus 0.11 | 34 | 15% | 40 |
| mc2.enemy.Original 0.9 | 23 | 10% | 28 |
| pedersen.Grishnakh 1.0 | 14 | 6% | 19 |
| dft.Calliope 5.6 | 9 | 4% | 13 |
| robar.nano.Assertive_Melee 0.2 | 7 | 3% | 7 |
| step.nanoPri 1.0 | 5 | 2% | 6 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 190288 melee ticks, 41063 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 88 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 88 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 0.

Targeting waves (276 rounds): 64990 sent, 58684 reached their opponent, 8807 virtual hits (15.0% of those reached).

## Melee bench: F10

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 250 over 8 battles (31.3 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 95.8 | 224 / 280 | 1.38 | 20.8% | 45342 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.0 | 20.8% | 224 |
| DTF.Kludgy 1.2b | 2.4 | 13.5% | 18 |
| ne.Chimera 1.2 | 3.1 | 12.7% | 10 |
| ejb.Polaris 1.0.1 | 3.6 | 12.3% | 15 |
| vStar.RAFzilla 2.15 | 5.4 | 10.2% | 3 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.3% | 6 |
| kurios.DOSexe .9b | 7.0 | 6.2% | 3 |
| sam.Samspin 1.0 | 8.8 | 4.8% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.8 | 4.9% | 0 |
| donjezza.Muncho 1.0 | 9.5 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 92.4 | 21 / 35 | 5622 |
| 2 | 1 | 71.7 | 97.8 | 32 / 35 | 5519 |
| 3 | 1 | 71.2 | 95.2 | 25 / 35 | 5737 |
| 4 | 1 | 71.3 | 95.9 | 28 / 35 | 5706 |
| 5 | 1 | 72.6 | 99.7 | 34 / 35 | 5869 |
| 6 | 1 | 70.0 | 92.4 | 26 / 35 | 5347 |
| 7 | 1 | 71.3 | 94.6 | 27 / 35 | 5768 |
| 8 | 1 | 72.1 | 98.1 | 31 / 35 | 5774 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 64 | 88% |
| ejb.Polaris 1.0.1 | 60 | 78% |
| ne.Chimera 1.2 | 57 | 95% |
| vStar.RAFzilla 2.15 | 32 | 94% |
| tvv.micro.Antares 1.1.1 | 23 | 87% |
| kurios.DOSexe .9b | 10 | 90% |
| donjezza.Muncho 1.0 | 6 | 83% |
| sam.Samspin 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 56 of 280 rounds, at a mean tick of 965. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 16 | 29% | 79 |
| ejb.Polaris 1.0.1 | 13 | 23% | 62 |
| ne.Chimera 1.2 | 12 | 21% | 58 |
| tvv.micro.Antares 1.1.1 | 7 | 13% | 24 |
| vStar.RAFzilla 2.15 | 4 | 7% | 25 |
| kurios.DOSexe .9b | 2 | 4% | 20 |
| donjezza.Muncho 1.0 | 1 | 2% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 2 |
| sam.Samspin 1.0 | 0 | 0% | 5 |

Posture (Hadur's M records, 268 rounds): 192974 melee ticks, 71574 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (268 rounds): longest scan gap while four or more were alive 72 ticks (268 rounds over 8); rounds whose longest gap at any count was over 8: 268; robots dropped as dead without a death event: 1.

Targeting waves (268 rounds): 64601 sent, 58388 reached their opponent, 11407 virtual hits (19.5% of those reached).

## Melee bench: F11

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 593 over 8 battles (74.1 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 80.5 | 87 / 280 | 2.75 | 16.0% | 29789 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.4 | 16.5% | 94 |
| hadur2.Hadur 3.18.1bb | 1.6 | 16.0% | 87 |
| cx.mini.Nimrod 0.55 | 3.3 | 12.3% | 23 |
| djc.DynaBot 0.1.1 | 4.0 | 10.6% | 21 |
| rdt199.Warlord 0.73 | 5.1 | 9.6% | 23 |
| br2.MobyDickBot 1.6 | 6.3 | 8.7% | 16 |
| uji.YellohFellah 1.0 | 6.6 | 8.4% | 16 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.6% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.4 | 5.3% | 0 |
| stelo.MirrorNano 1.3 | 9.6 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 78.4 | 9 / 35 | 3588 |
| 2 | 2 | 64.6 | 80.0 | 13 / 35 | 3778 |
| 3 | 1 | 64.0 | 78.4 | 10 / 35 | 3850 |
| 4 | 1 | 64.5 | 81.6 | 11 / 35 | 3716 |
| 5 | 2 | 63.5 | 78.7 | 8 / 35 | 3767 |
| 6 | 2 | 64.7 | 84.1 | 11 / 35 | 3622 |
| 7 | 2 | 65.0 | 82.9 | 10 / 35 | 3785 |
| 8 | 1 | 64.3 | 80.0 | 15 / 35 | 3683 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 60 | 32% |
| cx.mini.Nimrod 0.55 | 27 | 67% |
| djc.DynaBot 0.1.1 | 22 | 82% |
| uji.YellohFellah 1.0 | 18 | 67% |
| rdt199.Warlord 0.73 | 15 | 60% |
| br2.MobyDickBot 1.6 | 13 | 62% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 199 of 280 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 92 | 46% | 114 |
| cx.mini.Nimrod 0.55 | 35 | 18% | 54 |
| rdt199.Warlord 0.73 | 22 | 11% | 33 |
| uji.YellohFellah 1.0 | 13 | 7% | 19 |
| djc.DynaBot 0.1.1 | 11 | 6% | 26 |
| br2.MobyDickBot 1.6 | 10 | 5% | 17 |
| KiraNL.Chupacabra 0.4 | 5 | 3% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 2% | 7 |
| stelo.MirrorNano 1.3 | 2 | 1% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 271 rounds): 210343 melee ticks, 46314 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (271 rounds): longest scan gap while four or more were alive 49 ticks (271 rounds over 8); rounds whose longest gap at any count was over 8: 271; robots dropped as dead without a death event: 0.

Targeting waves (271 rounds): 69348 sent, 62922 reached their opponent, 8754 virtual hits (13.9% of those reached).

## Melee bench: F12

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 479 over 8 battles (59.9 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 82.6 | 147 / 280 | 2.57 | 17.1% | 30145 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.0 | 17.1% | 147 |
| bts.wiki.RipCurl 0.9b | 2.4 | 13.7% | 32 |
| nat.PallasHawk 1.0 | 2.9 | 13.1% | 47 |
| darkcanuck.Leon 1.01 | 3.8 | 12.4% | 27 |
| brainfade.melee.Genghis 0.36 | 5.1 | 10.4% | 17 |
| jrm.Test0 1.0 | 6.1 | 8.1% | 4 |
| cs.sheldor.Talon 1.1 | 6.9 | 7.3% | 1 |
| jp.Perpy 16.0 | 8.6 | 6.2% | 1 |
| stuff.Vlad 0.1 | 9.0 | 5.8% | 0 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.8% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.2 | 74.3 | 13 / 35 | 3673 |
| 2 | 1 | 66.3 | 84.8 | 20 / 35 | 3771 |
| 3 | 1 | 66.5 | 85.4 | 19 / 35 | 3633 |
| 4 | 1 | 67.4 | 88.3 | 22 / 35 | 3607 |
| 5 | 1 | 65.2 | 79.7 | 18 / 35 | 3722 |
| 6 | 1 | 66.7 | 86.0 | 17 / 35 | 3869 |
| 7 | 1 | 66.3 | 80.0 | 20 / 35 | 4219 |
| 8 | 1 | 65.7 | 82.2 | 18 / 35 | 3651 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 56 | 70% |
| darkcanuck.Leon 1.01 | 55 | 84% |
| bts.wiki.RipCurl 0.9b | 44 | 82% |
| brainfade.melee.Genghis 0.36 | 16 | 75% |
| jrm.Test0 1.0 | 6 | 83% |
| jaybot.bots.Oddball 4.0 | 4 | 100% |
| jp.Perpy 16.0 | 3 | 67% |
| cs.sheldor.Talon 1.1 | 3 | 100% |

Hadur died in 136 of 280 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 35 | 26% | 68 |
| nat.PallasHawk 1.0 | 32 | 24% | 68 |
| darkcanuck.Leon 1.01 | 20 | 15% | 66 |
| brainfade.melee.Genghis 0.36 | 20 | 15% | 31 |
| cs.sheldor.Talon 1.1 | 7 | 5% | 16 |
| jrm.Test0 1.0 | 7 | 5% | 10 |
| jaybot.bots.Oddball 4.0 | 5 | 4% | 9 |
| jp.Perpy 16.0 | 5 | 4% | 6 |
| stuff.Vlad 0.1 | 2 | 1% | 6 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 171096 melee ticks, 51479 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 65 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 0.

Targeting waves (273 rounds): 59901 sent, 53327 reached their opponent, 9144 virtual hits (17.1% of those reached).

## Melee bench: F13

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 118 over 8 battles (14.8 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 79.9 | 69 / 280 | 2.81 | 15.3% | 31365 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 16.5% | 113 |
| ags.Glacier 0.2.11 | 1.8 | 16.5% | 55 |
| hadur2.Hadur 3.18.1bb | 2.8 | 15.3% | 69 |
| shinh.Entangled 0.3 | 4.4 | 12.0% | 23 |
| gh.micro.Gruweltje 0.7 | 4.6 | 11.7% | 18 |
| apc.Colossus2 0.17 | 6.1 | 8.3% | 0 |
| stelo.Wang 1.0 | 7.1 | 6.8% | 3 |
| ayk.WallHugger 1.0 | 8.0 | 4.9% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.5% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 84.1 | 14 / 35 | 4531 |
| 2 | 3 | 63.0 | 77.5 | 7 / 35 | 3626 |
| 3 | 3 | 62.7 | 74.0 | 6 / 35 | 3896 |
| 4 | 3 | 64.2 | 81.3 | 6 / 35 | 4055 |
| 5 | 3 | 63.8 | 80.0 | 9 / 35 | 3663 |
| 6 | 3 | 65.8 | 83.5 | 11 / 35 | 4093 |
| 7 | 3 | 64.6 | 80.6 | 7 / 35 | 3987 |
| 8 | 3 | 63.3 | 78.1 | 9 / 35 | 3514 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 61 | 61% |
| mn.Combat 3.25.0 | 48 | 35% |
| gh.micro.Gruweltje 0.7 | 17 | 47% |
| shinh.Entangled 0.3 | 12 | 33% |
| stelo.Wang 1.0 | 2 | 100% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 212 of 280 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 70 | 33% | 104 |
| mn.Combat 3.25.0 | 66 | 31% | 82 |
| shinh.Entangled 0.3 | 32 | 15% | 37 |
| gh.micro.Gruweltje 0.7 | 31 | 15% | 42 |
| apc.Colossus2 0.17 | 5 | 2% | 6 |
| maribo.FollowFire 1 | 4 | 2% | 4 |
| stelo.Wang 1.0 | 2 | 1% | 4 |
| ayk.WallHugger 1.0 | 1 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 193379 melee ticks, 45761 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 89 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 89 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 1.

Targeting waves (274 rounds): 58327 sent, 51445 reached their opponent, 8690 virtual hits (16.9% of those reached).

## Melee bench: F14

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 696 over 8 battles (87.0 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 94.4 | 214 / 280 | 1.50 | 20.9% | 46521 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.0 | 20.9% | 214 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.6% | 23 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.3% | 31 |
| sanyi.mikrobi.Roberto 1.0 | 4.9 | 9.8% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 5.3 | 9.5% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 5.3 | 9.5% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.0 | 8.3% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 7.9% | 8 |
| pa.Improved 1.0 | 8.9 | 5.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 96.8 | 29 / 35 | 5757 |
| 2 | 1 | 71.4 | 95.9 | 26 / 35 | 5751 |
| 3 | 1 | 71.9 | 95.9 | 28 / 35 | 5882 |
| 4 | 1 | 71.1 | 93.7 | 26 / 35 | 5915 |
| 5 | 1 | 71.5 | 94.3 | 25 / 35 | 5815 |
| 6 | 1 | 72.3 | 94.9 | 29 / 35 | 6075 |
| 7 | 1 | 71.3 | 94.0 | 26 / 35 | 5644 |
| 8 | 1 | 70.4 | 90.2 | 25 / 35 | 5682 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 88 | 91% |
| catcat20.shape.Theta 0.018 | 85 | 74% |
| sanyi.mikrobi.Roberto 1.0 | 29 | 97% |
| sheldor.micro.PointInLineRRAL 1.0 | 22 | 73% |
| co.edu.usb.rc.LidisTron 1.0 | 20 | 95% |
| Lo_Ian.Gandalf_V4 4.0 | 6 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 71 of 280 rounds, at a mean tick of 952. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 30 | 42% | 86 |
| simonton.micro.Sprout 1.1.3 | 21 | 30% | 93 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 10% | 32 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 4% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 3% | 7 |
| sanyi.mikrobi.Roberto 1.0 | 1 | 1% | 34 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 1% | 8 |
| pa.Improved 1.0 | 1 | 1% | 3 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 193119 melee ticks, 77637 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 34 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 3.

Targeting waves (275 rounds): 61683 sent, 55359 reached their opponent, 13800 virtual hits (24.9% of those reached).

## Melee bench: F15

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 730 over 8 battles (91.3 per battle, most in one battle 148). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 86.5 | 145 / 280 | 2.21 | 18.6% | 39453 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.0 | 18.6% | 145 |
| emp.Yngwie 1.11 | 2.5 | 13.4% | 69 |
| mld.DustBunny 3.8 | 3.3 | 12.7% | 12 |
| kawigi.micro.Shiz 1.1 | 3.3 | 13.1% | 22 |
| kawigi.robot.Girl 1.2 | 5.5 | 9.6% | 21 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.7% | 7 |
| lambdaxy.TBot 0.1 | 7.3 | 6.8% | 0 |
| Grystrion.TrackerWO 1.0 | 7.9 | 6.8% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 4.8% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.6 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 86.7 | 18 / 35 | 4828 |
| 2 | 1 | 69.3 | 89.2 | 19 / 35 | 5217 |
| 3 | 1 | 68.3 | 87.3 | 19 / 35 | 4825 |
| 4 | 1 | 66.7 | 84.1 | 13 / 35 | 4583 |
| 5 | 1 | 68.4 | 85.7 | 18 / 35 | 4877 |
| 6 | 1 | 68.8 | 87.3 | 19 / 35 | 5065 |
| 7 | 1 | 68.6 | 85.4 | 23 / 35 | 5055 |
| 8 | 1 | 68.2 | 86.7 | 16 / 35 | 5003 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 71 | 52% |
| kawigi.micro.Shiz 1.1 | 43 | 81% |
| mld.DustBunny 3.8 | 33 | 91% |
| cb.nano.Insomnia 1.0 | 23 | 78% |
| kawigi.robot.Girl 1.2 | 22 | 73% |
| divineomega.TrialBot 0.003 | 6 | 100% |
| Grystrion.TrackerWO 1.0 | 2 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 140 of 280 rounds, at a mean tick of 1007. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 53 | 38% | 107 |
| mld.DustBunny 3.8 | 28 | 20% | 67 |
| cb.nano.Insomnia 1.0 | 21 | 15% | 23 |
| kawigi.micro.Shiz 1.1 | 17 | 12% | 50 |
| kawigi.robot.Girl 1.2 | 13 | 9% | 15 |
| divineomega.TrialBot 0.003 | 2 | 1% | 12 |
| lambdaxy.TBot 0.1 | 1 | 1% | 2 |
| Grystrion.TrackerWO 1.0 | 0 | 0% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 219112 melee ticks, 66435 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 694 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 316 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 1.

Targeting waves (274 rounds): 73503 sent, 67060 reached their opponent, 11263 virtual hits (16.8% of those reached).

## Melee bench: F16

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 814 over 8 battles (101.8 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.6 | 152 / 280 | 2.03 | 19.5% | 44705 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.0 | 19.5% | 152 |
| gh.Griezel 0.5.2 | 2.0 | 16.2% | 64 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.6% | 11 |
| techdude.forest.FlamingForest 1.1 | 4.1 | 10.4% | 34 |
| bvh.fnr.Fenrir 0.36l | 5.1 | 9.3% | 4 |
| tvv.nano.Polaris 1.2 | 6.0 | 8.9% | 4 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.6% | 7 |
| repositorio.NanoStep 1.0 | 8.5 | 5.3% | 0 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 4.9% | 4 |
| asd.Cthulhu 1.3 | 9.8 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 92.4 | 20 / 35 | 6026 |
| 2 | 1 | 68.8 | 87.3 | 17 / 35 | 5301 |
| 3 | 1 | 70.8 | 91.4 | 23 / 35 | 5789 |
| 4 | 1 | 69.8 | 87.0 | 21 / 35 | 5687 |
| 5 | 1 | 69.6 | 87.0 | 18 / 35 | 5654 |
| 6 | 1 | 67.7 | 84.8 | 15 / 35 | 5130 |
| 7 | 1 | 70.4 | 91.4 | 21 / 35 | 5692 |
| 8 | 1 | 69.1 | 87.6 | 17 / 35 | 5426 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 119 | 64% |
| techdude.forest.FlamingForest 1.1 | 42 | 64% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 31 | 97% |
| tvv.nano.Polaris 1.2 | 9 | 78% |
| stelo.IntrinsicVolatility 1.4 | 6 | 67% |
| bvh.fnr.Fenrir 0.36l | 6 | 67% |
| divineomega.DivineBot 1.9.4.5 | 4 | 75% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 136 of 280 rounds, at a mean tick of 1226. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 59 | 43% | 133 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 21 | 15% | 43 |
| techdude.forest.FlamingForest 1.1 | 20 | 15% | 49 |
| bvh.fnr.Fenrir 0.36l | 13 | 10% | 19 |
| stelo.IntrinsicVolatility 1.4 | 7 | 5% | 14 |
| asd.Cthulhu 1.3 | 4 | 3% | 4 |
| divineomega.DivineBot 1.9.4.5 | 3 | 2% | 9 |
| tvv.nano.Polaris 1.2 | 2 | 1% | 6 |
| repositorio.NanoStep 1.0 | 0 | 0% | 3 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 243816 melee ticks, 95414 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 41 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 0.

Targeting waves (275 rounds): 78564 sent, 72143 reached their opponent, 12049 virtual hits (16.7% of those reached).

## Melee bench: F17

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 880 over 8 battles (110.0 per battle, most in one battle 268). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 85.2 | 129 / 280 | 2.34 | 18.5% | 42993 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.0 | 18.5% | 129 |
| et.Predator 1.8 | 2.3 | 14.3% | 48 |
| oog.melee.Mercutio 1.0 | 3.3 | 12.9% | 44 |
| cx.BlestPain 1.41 | 3.6 | 12.1% | 40 |
| ahf.NanoAndrew .4 | 5.0 | 10.7% | 10 |
| nic.Nicator 2.4 | 6.4 | 9.1% | 8 |
| maribo.melee.BMV 0.1 | 6.5 | 8.6% | 0 |
| tex.Longbot 0.4 | 8.4 | 5.8% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.6 | 5.6% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 90.5 | 18 / 35 | 5967 |
| 2 | 1 | 65.7 | 76.8 | 13 / 35 | 4895 |
| 3 | 1 | 67.7 | 83.2 | 14 / 35 | 5261 |
| 4 | 1 | 67.2 | 82.5 | 15 / 35 | 5012 |
| 5 | 1 | 69.7 | 89.5 | 19 / 35 | 5546 |
| 6 | 1 | 68.9 | 89.5 | 17 / 35 | 5071 |
| 7 | 1 | 68.3 | 83.8 | 18 / 35 | 5326 |
| 8 | 1 | 69.0 | 85.4 | 15 / 35 | 5915 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 78 | 73% |
| oog.melee.Mercutio 1.0 | 55 | 65% |
| cx.BlestPain 1.41 | 37 | 32% |
| ahf.NanoAndrew .4 | 11 | 82% |
| maribo.melee.BMV 0.1 | 7 | 100% |
| nic.Nicator 2.4 | 7 | 86% |
| tex.Longbot 0.4 | 2 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 0% |

Hadur died in 157 of 280 rounds, at a mean tick of 1049. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 46 | 29% | 65 |
| et.Predator 1.8 | 44 | 28% | 90 |
| oog.melee.Mercutio 1.0 | 32 | 20% | 66 |
| ahf.NanoAndrew .4 | 15 | 10% | 29 |
| maribo.melee.BMV 0.1 | 8 | 5% | 17 |
| nic.Nicator 2.4 | 3 | 2% | 9 |
| tex.Longbot 0.4 | 2 | 1% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 215641 melee ticks, 79577 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 62 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 2.

Targeting waves (275 rounds): 72622 sent, 66188 reached their opponent, 14494 virtual hits (21.9% of those reached).

## Melee bench: F18

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 623 over 8 battles (77.9 per battle, most in one battle 146). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.5 | 158 / 280 | 2.03 | 18.9% | 38526 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.0 | 18.9% | 158 |
| morbid.MorbidPriest 1.0 | 2.0 | 14.4% | 51 |
| agd.Mooserwirt2 2.7 | 3.1 | 12.7% | 29 |
| uji.DBH 1.1 | 3.9 | 11.3% | 13 |
| spinnercat.Robovirus 2.718 | 5.8 | 8.5% | 4 |
| sigterm.Sigterm 1.0 | 6.3 | 8.4% | 11 |
| kawigi.mini.Fhqwhgads 1.1 | 7.0 | 7.6% | 5 |
| ratosh.Nobo 0.21 | 7.0 | 7.7% | 5 |
| stelo.WangRobot 1.0 | 9.5 | 5.5% | 4 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 90.8 | 20 / 35 | 4943 |
| 2 | 1 | 69.7 | 90.8 | 21 / 35 | 5275 |
| 3 | 1 | 67.8 | 86.0 | 18 / 35 | 4694 |
| 4 | 1 | 66.6 | 84.1 | 15 / 35 | 4564 |
| 5 | 1 | 68.3 | 88.9 | 20 / 35 | 4805 |
| 6 | 1 | 68.2 | 85.7 | 20 / 35 | 4837 |
| 7 | 1 | 68.6 | 90.5 | 21 / 35 | 4517 |
| 8 | 1 | 69.7 | 91.4 | 23 / 35 | 4891 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 92 | 66% |
| agd.Mooserwirt2 2.7 | 48 | 81% |
| uji.DBH 1.1 | 26 | 85% |
| sigterm.Sigterm 1.0 | 19 | 68% |
| spinnercat.Robovirus 2.718 | 8 | 88% |
| ratosh.Nobo 0.21 | 7 | 43% |
| kawigi.mini.Fhqwhgads 1.1 | 7 | 86% |
| stelo.WangRobot 1.0 | 5 | 80% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 100% |

Hadur died in 125 of 280 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 54 | 43% | 115 |
| agd.Mooserwirt2 2.7 | 25 | 20% | 61 |
| sigterm.Sigterm 1.0 | 13 | 10% | 26 |
| uji.DBH 1.1 | 10 | 8% | 29 |
| ratosh.Nobo 0.21 | 7 | 6% | 13 |
| stelo.WangRobot 1.0 | 5 | 4% | 7 |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 3% | 15 |
| spinnercat.Robovirus 2.718 | 3 | 2% | 8 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 1% | 5 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 267 rounds): 184451 melee ticks, 62184 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (267 rounds): longest scan gap while four or more were alive 55 ticks (267 rounds over 8); rounds whose longest gap at any count was over 8: 267; robots dropped as dead without a death event: 0.

Targeting waves (267 rounds): 62441 sent, 56079 reached their opponent, 12618 virtual hits (22.5% of those reached).

## Melee bench: F19

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 406 over 8 battles (50.8 per battle, most in one battle 144). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.3 | 98.1 | 255 / 280 | 1.18 | 22.2% | 48170 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.0 | 22.2% | 255 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 15.1% | 11 |
| mld.Infinity 2.2 | 3.4 | 12.0% | 5 |
| krillr.mini.JointStrike 2.0.0 | 4.1 | 11.4% | 4 |
| erdnis.Rover 0.3 | 4.5 | 10.8% | 3 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.2% | 1 |
| mbh.Mbh 0.1 | 7.0 | 7.5% | 0 |
| pac.ABC 2.1 | 8.1 | 6.3% | 1 |
| pbg.R2D2 1.0 | 8.6 | 5.5% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 96.8 | 32 / 35 | 5939 |
| 2 | 1 | 73.9 | 99.7 | 34 / 35 | 6219 |
| 3 | 1 | 72.7 | 96.5 | 29 / 35 | 6054 |
| 4 | 1 | 73.3 | 98.7 | 33 / 35 | 5923 |
| 5 | 1 | 73.8 | 98.4 | 32 / 35 | 6361 |
| 6 | 1 | 72.9 | 98.1 | 32 / 35 | 5548 |
| 7 | 1 | 72.9 | 97.5 | 31 / 35 | 5754 |
| 8 | 1 | 73.6 | 98.7 | 32 / 35 | 6372 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 156 | 99% |
| mld.Infinity 2.2 | 37 | 95% |
| krillr.mini.JointStrike 2.0.0 | 26 | 92% |
| erdnis.Rover 0.3 | 21 | 86% |
| patson.PatsonTestBot 1.0 | 8 | 88% |
| pac.ABC 2.1 | 7 | 100% |
| pbg.R2D2 1.0 | 6 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |
| pedersen.Moron 2.0 | 1 | 100% |

Hadur died in 27 of 280 rounds, at a mean tick of 805. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 11 | 41% | 88 |
| krillr.mini.JointStrike 2.0.0 | 7 | 26% | 57 |
| erdnis.Rover 0.3 | 4 | 15% | 26 |
| mld.Infinity 2.2 | 2 | 7% | 40 |
| patson.PatsonTestBot 1.0 | 1 | 4% | 22 |
| mbh.Mbh 0.1 | 0 | 0% | 15 |
| pbg.R2D2 1.0 | 0 | 0% | 12 |
| pac.ABC 2.1 | 0 | 0% | 12 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 265 rounds): 171656 melee ticks, 61562 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (265 rounds): longest scan gap while four or more were alive 54 ticks (265 rounds over 8); rounds whose longest gap at any count was over 8: 265; robots dropped as dead without a death event: 1.

Targeting waves (265 rounds): 58403 sent, 52361 reached their opponent, 12390 virtual hits (23.7% of those reached).

## Melee bench: F20

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1114 over 8 battles (139.3 per battle, most in one battle 239). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 91.2 | 181 / 280 | 1.80 | 20.4% | 46235 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.0 | 20.4% | 181 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.3% | 50 |
| fwb.Nine 1.0.1 | 3.9 | 11.0% | 15 |
| nz.jdc.nano.GridFu 1.0 | 4.1 | 10.9% | 6 |
| catcat20.Rabbit 0.001 | 4.1 | 11.0% | 22 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 8.3% | 4 |
| bayen.nut.Squirrel 1.615 | 6.8 | 7.3% | 2 |
| djdjdj.NanoSkunk10 1.0 | 8.4 | 6.0% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.5 | 5.7% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 92.1 | 23 / 35 | 6001 |
| 2 | 1 | 69.7 | 89.5 | 23 / 35 | 5406 |
| 3 | 1 | 71.5 | 92.4 | 25 / 35 | 6124 |
| 4 | 1 | 70.4 | 90.2 | 19 / 35 | 5948 |
| 5 | 1 | 70.4 | 90.5 | 25 / 35 | 5664 |
| 6 | 1 | 70.5 | 89.5 | 21 / 35 | 5747 |
| 7 | 1 | 70.7 | 92.4 | 22 / 35 | 5638 |
| 8 | 1 | 71.1 | 92.7 | 23 / 35 | 5707 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 98 | 72% |
| fwb.Nine 1.0.1 | 49 | 92% |
| catcat20.Rabbit 0.001 | 46 | 80% |
| nz.jdc.nano.GridFu 1.0 | 15 | 87% |
| bayen.nut.Squirrel 1.615 | 6 | 67% |
| m3thos.mini.Eva01 0.5.5 | 6 | 67% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| ntc.ControlledChaos 1.1.4 | 2 | 100% |

Hadur died in 109 of 280 rounds, at a mean tick of 1037. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 52 | 48% | 127 |
| catcat20.Rabbit 0.001 | 14 | 13% | 56 |
| fwb.Nine 1.0.1 | 14 | 13% | 28 |
| nz.jdc.nano.GridFu 1.0 | 7 | 6% | 32 |
| bayen.nut.Squirrel 1.615 | 7 | 6% | 15 |
| m3thos.mini.Eva01 0.5.5 | 3 | 3% | 8 |
| ntc.ControlledChaos 1.1.4 | 2 | 2% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 6 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 4 |
9 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 221403 melee ticks, 79505 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 30 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 30 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 1.

Targeting waves (276 rounds): 70858 sent, 64314 reached their opponent, 14824 virtual hits (23.0% of those reached).

## Melee bench: F21

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 883 over 8 battles (110.4 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 91.3 | 146 / 280 | 1.79 | 19.7% | 44740 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.0 | 19.7% | 146 |
| eem.EvBot v4.6.16 | 2.0 | 17.0% | 101 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.0% | 16 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.1% | 7 |
| eld.Hmm 1.0 | 5.0 | 8.5% | 11 |
| oa.weak.BotherBot 0.1 | 6.1 | 7.3% | 0 |
| fire219.CatBot 1.0 | 7.6 | 6.1% | 0 |
| el.JumpShoot 0.2 | 8.0 | 5.7% | 0 |
| PSW.Relentless 0.1 | 8.4 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 9.9 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 94.9 | 25 / 35 | 6004 |
| 2 | 1 | 70.0 | 91.4 | 18 / 35 | 5486 |
| 3 | 1 | 70.6 | 93.3 | 18 / 35 | 5747 |
| 4 | 1 | 71.2 | 94.9 | 25 / 35 | 5526 |
| 5 | 1 | 70.7 | 91.7 | 16 / 35 | 5714 |
| 6 | 1 | 69.5 | 89.2 | 13 / 35 | 5690 |
| 7 | 1 | 68.8 | 88.6 | 16 / 35 | 5197 |
| 8 | 1 | 69.0 | 86.0 | 15 / 35 | 5376 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 168 | 58% |
| dummy.mini.Scimitar 1.01 | 29 | 76% |
| cf.RiO.RiOx 4.2.1 | 22 | 86% |
| eld.Hmm 1.0 | 16 | 44% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 142 of 280 rounds, at a mean tick of 1325. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 82 | 58% | 164 |
| dummy.mini.Scimitar 1.01 | 24 | 17% | 57 |
| cf.RiO.RiOx 4.2.1 | 13 | 9% | 27 |
| eld.Hmm 1.0 | 11 | 8% | 24 |
| PSW.Relentless 0.1 | 2 | 1% | 2 |
| arthord.MannyPacquiao Beta | 1 | 1% | 2 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 2 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 277 rounds): 244362 melee ticks, 120812 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (277 rounds): longest scan gap while four or more were alive 48 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 1.

Targeting waves (277 rounds): 72183 sent, 65834 reached their opponent, 11207 virtual hits (17.0% of those reached).

## Melee bench: F22

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 481 over 8 battles (60.1 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 86.0 | 112 / 280 | 2.26 | 17.8% | 38438 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.3 | 17.8% | 112 |
| pe.SandboxDT 2.71m | 1.8 | 17.0% | 106 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.5% | 31 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.2% | 21 |
| bigpete.Stewie 1.0 | 5.0 | 10.5% | 6 |
| tad.Dalek98 0.98 | 6.8 | 6.6% | 1 |
| yk.JahRoslav 1.1 | 6.8 | 6.8% | 3 |
| gg.Squaraus 0.6 | 7.6 | 6.0% | 0 |
| pbg.NinjaX 1.2 | 8.9 | 5.1% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.9 | 82.5 | 10 / 35 | 4671 |
| 2 | 1 | 68.6 | 88.6 | 13 / 35 | 4848 |
| 3 | 1 | 68.5 | 86.3 | 17 / 35 | 4724 |
| 4 | 1 | 68.2 | 87.6 | 16 / 35 | 4594 |
| 5 | 1 | 67.8 | 84.8 | 15 / 35 | 4672 |
| 6 | 2 | 67.9 | 86.0 | 13 / 35 | 4762 |
| 7 | 1 | 68.5 | 86.3 | 12 / 35 | 5225 |
| 8 | 1 | 67.8 | 85.4 | 16 / 35 | 4942 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 79 | 32% |
| jlm.javaDisturbance 0.59 | 49 | 86% |
| kvk.HebusLeTroll 0.35 | 40 | 65% |
| bigpete.Stewie 1.0 | 14 | 86% |
| pbg.NinjaX 1.2 | 3 | 100% |
| yk.JahRoslav 1.1 | 3 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |

Hadur died in 172 of 280 rounds, at a mean tick of 977. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 81 | 47% | 106 |
| kvk.HebusLeTroll 0.35 | 45 | 26% | 69 |
| jlm.javaDisturbance 0.59 | 25 | 15% | 67 |
| bigpete.Stewie 1.0 | 7 | 4% | 22 |
| tad.Dalek98 0.98 | 5 | 3% | 6 |
| yk.JahRoslav 1.1 | 2 | 1% | 3 |
| pbg.NinjaX 1.2 | 2 | 1% | 2 |
| gg.Squaraus 0.6 | 1 | 1% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 217181 melee ticks, 60446 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 48 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 2.

Targeting waves (273 rounds): 70648 sent, 64275 reached their opponent, 10689 virtual hits (16.6% of those reached).

## Melee bench: F23

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 554 over 8 battles (69.3 per battle, most in one battle 235). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 94.7 | 225 / 280 | 1.48 | 21.4% | 47204 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.0 | 21.4% | 225 |
| pe.SandboxLump 1.52 | 2.1 | 16.3% | 34 |
| cre.Karolos 0.32 | 2.9 | 14.2% | 15 |
| stelo.AreaTargetingBot 1.1 | 4.1 | 10.0% | 1 |
| stelo.RamTrackSurfer 1.2 | 5.5 | 9.2% | 1 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.0 | 8.8% | 3 |
| cw.megas.Blade 0.8 | 6.5 | 8.4% | 0 |
| sample.Walls 1.0 | 7.9 | 7.3% | 1 |
| cli.WasteOfAmmo 1.0 | 9.1 | 2.6% | 0 |
| rrh.Iwillfindyou 2.0 | 9.9 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 98.1 | 30 / 35 | 5600 |
| 2 | 1 | 71.6 | 92.1 | 25 / 35 | 5740 |
| 3 | 1 | 73.1 | 94.3 | 30 / 35 | 5929 |
| 4 | 1 | 72.9 | 96.2 | 28 / 35 | 5766 |
| 5 | 1 | 73.4 | 96.2 | 30 / 35 | 5783 |
| 6 | 1 | 72.5 | 94.0 | 28 / 35 | 6250 |
| 7 | 1 | 73.4 | 97.8 | 31 / 35 | 6177 |
| 8 | 1 | 71.0 | 89.2 | 23 / 35 | 5959 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 134 | 87% |
| cre.Karolos 0.32 | 65 | 94% |
| stelo.RamTrackSurfer 1.2 | 16 | 100% |
| stelo.AreaTargetingBot 1.1 | 15 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 86% |
| sample.Walls 1.0 | 6 | 100% |
| cw.megas.Blade 0.8 | 4 | 100% |

Hadur died in 60 of 280 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 29 | 48% | 129 |
| cre.Karolos 0.32 | 18 | 30% | 79 |
| stelo.AreaTargetingBot 1.1 | 4 | 7% | 14 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 5% | 13 |
| stelo.RamTrackSurfer 1.2 | 1 | 2% | 23 |
| sample.Walls 1.0 | 1 | 2% | 11 |
| cw.megas.Blade 0.8 | 0 | 0% | 4 |
| cli.WasteOfAmmo 1.0 | 0 | 0% | 1 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 278 rounds): 168653 melee ticks, 66114 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (278 rounds): longest scan gap while four or more were alive 64 ticks (278 rounds over 8); rounds whose longest gap at any count was over 8: 278; robots dropped as dead without a death event: 0.

Targeting waves (278 rounds): 54469 sent, 47957 reached their opponent, 14488 virtual hits (30.2% of those reached).

## Melee bench: F24

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 917 over 8 battles (114.6 per battle, most in one battle 142). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 80.6 | 95 / 280 | 2.75 | 16.1% | 30436 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.1 | 16.1% | 95 |
| rz.GlowBlowMelee 1.4 | 2.4 | 14.3% | 58 |
| davidalves.Phoenix 0.54 | 3.6 | 12.9% | 45 |
| florent.XSeries.X2 0.12 | 3.8 | 12.8% | 41 |
| pedersen.Ugluk 1.1.1 | 4.1 | 12.4% | 32 |
| oog.melee.Corsair 1.0 | 6.0 | 9.1% | 9 |
| stelo.SoJNanoMelee 1.1 | 7.5 | 6.7% | 0 |
| lunchie.Lunchbox 0.93 | 7.8 | 6.1% | 0 |
| as.FrankTheTank 1.3 | 8.9 | 5.0% | 0 |
| evd.X1 0.01 | 9.9 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 91.1 | 17 / 35 | 4079 |
| 2 | 1 | 67.5 | 88.6 | 15 / 35 | 4193 |
| 3 | 1 | 64.7 | 80.6 | 10 / 35 | 3900 |
| 4 | 1 | 62.6 | 76.2 | 9 / 35 | 3589 |
| 5 | 1 | 64.9 | 79.0 | 13 / 35 | 3979 |
| 6 | 1 | 63.2 | 75.9 | 12 / 35 | 3494 |
| 7 | 1 | 64.6 | 80.0 | 12 / 35 | 3779 |
| 8 | 2 | 61.8 | 73.3 | 7 / 35 | 3423 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 64 | 50% |
| pedersen.Ugluk 1.1.1 | 34 | 50% |
| davidalves.Phoenix 0.54 | 30 | 57% |
| florent.XSeries.X2 0.12 | 29 | 52% |
| oog.melee.Corsair 1.0 | 12 | 67% |
| stelo.SoJNanoMelee 1.1 | 3 | 100% |
| as.FrankTheTank 1.3 | 2 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 192 of 280 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 53 | 28% | 78 |
| florent.XSeries.X2 0.12 | 40 | 21% | 60 |
| davidalves.Phoenix 0.54 | 38 | 20% | 54 |
| pedersen.Ugluk 1.1.1 | 32 | 17% | 46 |
| oog.melee.Corsair 1.0 | 11 | 6% | 25 |
| stelo.SoJNanoMelee 1.1 | 5 | 3% | 9 |
| evd.X1 0.01 | 5 | 3% | 5 |
| lunchie.Lunchbox 0.93 | 1 | 1% | 3 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 186962 melee ticks, 49108 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 57 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 0.

Targeting waves (276 rounds): 63140 sent, 56336 reached their opponent, 10536 virtual hits (18.7% of those reached).

## Melee bench: F25

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 568 over 8 battles (71.0 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 85.5 | 153 / 280 | 2.31 | 17.8% | 30644 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.0 | 17.8% | 153 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.9% | 32 |
| voidious.micro.BlitzBat 1.05 | 2.9 | 12.9% | 22 |
| jdw.Hurricane 1.4 | 3.6 | 11.6% | 32 |
| gre.svman4.Morfeas 1.4.1 | 5.4 | 9.5% | 17 |
| ds.Oo 2.2 | 5.6 | 9.2% | 15 |
| adt.Ar2 1.1 | 7.6 | 7.1% | 3 |
| awesomeness.Elite 1.0 | 8.1 | 7.1% | 1 |
| gjr.Cephalosporin 0.1 | 8.5 | 6.2% | 5 |
| amk.ChumbaMini 0.2 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 84.8 | 18 / 35 | 3627 |
| 2 | 1 | 67.4 | 85.7 | 20 / 35 | 4005 |
| 3 | 1 | 67.4 | 87.3 | 18 / 35 | 3982 |
| 4 | 1 | 66.5 | 83.5 | 19 / 35 | 3912 |
| 5 | 1 | 67.6 | 86.3 | 24 / 35 | 3859 |
| 6 | 1 | 67.0 | 86.7 | 20 / 35 | 3640 |
| 7 | 1 | 66.7 | 85.1 | 19 / 35 | 3808 |
| 8 | 1 | 66.0 | 84.4 | 15 / 35 | 3811 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 73 | 82% |
| voidious.micro.BlitzBat 1.05 | 40 | 88% |
| jdw.Hurricane 1.4 | 39 | 72% |
| ds.Oo 2.2 | 18 | 56% |
| gre.svman4.Morfeas 1.4.1 | 12 | 67% |
| awesomeness.Elite 1.0 | 9 | 89% |
| adt.Ar2 1.1 | 3 | 67% |
| gjr.Cephalosporin 0.1 | 2 | 50% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 131 of 280 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 30 | 23% | 80 |
| jdw.Hurricane 1.4 | 26 | 20% | 41 |
| voidious.micro.BlitzBat 1.05 | 24 | 18% | 53 |
| ds.Oo 2.2 | 15 | 11% | 29 |
| gre.svman4.Morfeas 1.4.1 | 12 | 9% | 32 |
| adt.Ar2 1.1 | 10 | 8% | 20 |
| awesomeness.Elite 1.0 | 5 | 4% | 11 |
| amk.ChumbaMini 0.2 | 3 | 2% | 6 |
| gjr.Cephalosporin 0.1 | 2 | 2% | 8 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 170874 melee ticks, 39759 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 533 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 233 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 1.

Targeting waves (275 rounds): 61302 sent, 54871 reached their opponent, 9164 virtual hits (16.7% of those reached).

## Melee bench: F26

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 301 over 8 battles (37.6 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 91.1 | 177 / 280 | 1.80 | 20.1% | 47925 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.0 | 20.1% | 177 |
| ak.Fermat 2.0 | 2.0 | 15.2% | 45 |
| lrem.Spectre 0.4.4 | 3.4 | 12.6% | 25 |
| shu.nitro.LENIN .T34 | 3.8 | 12.1% | 21 |
| js.PinBall 1.6 | 5.1 | 10.5% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.3% | 4 |
| gh.mini.GrubbmOne 1.0 | 7.1 | 7.9% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 7.6 | 7.0% | 3 |
| sample.SpinBot 1.0 | 9.0 | 4.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 93.0 | 22 / 35 | 5973 |
| 2 | 1 | 72.9 | 96.5 | 28 / 35 | 6472 |
| 3 | 1 | 70.5 | 89.8 | 21 / 35 | 5916 |
| 4 | 1 | 70.4 | 88.6 | 22 / 35 | 5839 |
| 5 | 1 | 70.9 | 91.4 | 21 / 35 | 5916 |
| 6 | 1 | 69.7 | 87.9 | 21 / 35 | 5608 |
| 7 | 1 | 71.0 | 90.5 | 23 / 35 | 6050 |
| 8 | 1 | 70.7 | 91.1 | 19 / 35 | 6151 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 81 | 72% |
| lrem.Spectre 0.4.4 | 54 | 80% |
| shu.nitro.LENIN .T34 | 42 | 86% |
| js.PinBall 1.6 | 22 | 95% |
| jaybot.adv.bots.JayBot 2.0 | 14 | 93% |
| gh.mini.GrubbmOne 1.0 | 4 | 75% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 67% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 106 of 280 rounds, at a mean tick of 914. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 43 | 41% | 94 |
| lrem.Spectre 0.4.4 | 25 | 24% | 71 |
| shu.nitro.LENIN .T34 | 17 | 16% | 56 |
| jaybot.adv.bots.JayBot 2.0 | 9 | 8% | 18 |
| js.PinBall 1.6 | 7 | 7% | 28 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 2% | 7 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 5 |
| sample.SpinBot 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 211685 melee ticks, 61172 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 32 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 0.

Targeting waves (272 rounds): 69854 sent, 63374 reached their opponent, 15762 virtual hits (24.9% of those reached).

## Melee bench: F27

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 612 over 8 battles (76.5 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.0 | 212 / 280 | 2.08 | 19.7% | 41506 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.4 | 19.7% | 212 |
| mk.Alpha 0.2.1 | 1.9 | 13.3% | 36 |
| EH.Eagle 1.0.6 | 3.0 | 11.2% | 8 |
| wee.Gem 1.8.4 | 4.9 | 9.9% | 10 |
| sheldor.melee.nano.TestMelee 0.1 | 5.5 | 9.4% | 9 |
| techdude.kombat.FlamingKombat 1.5 | 5.9 | 8.8% | 4 |
| joe.ADinosaur 1.0 | 7.0 | 8.1% | 1 |
| throxbot.ThroxBot 0.1 | 7.8 | 7.3% | 0 |
| caimano.Furia_Ceca 0.22 | 8.4 | 6.9% | 0 |
| cs.Grudge 1.0 | 9.4 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 89.5 | 25 / 35 | 4537 |
| 2 | 1 | 70.1 | 93.0 | 29 / 35 | 5119 |
| 3 | 1 | 72.0 | 96.5 | 31 / 35 | 5698 |
| 4 | 1 | 70.7 | 94.9 | 27 / 35 | 5226 |
| 5 | 1 | 71.3 | 92.7 | 29 / 35 | 5797 |
| 6 | 1 | 71.9 | 95.9 | 30 / 35 | 5664 |
| 7 | 4 | 56.2 | 48.9 | 11 / 35 | 4008 |
| 8 | 1 | 70.9 | 92.7 | 30 / 35 | 5457 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 113 | 87% |
| EH.Eagle 1.0.6 | 49 | 100% |
| wee.Gem 1.8.4 | 19 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 17 | 82% |
| techdude.kombat.FlamingKombat 1.5 | 12 | 100% |
| throxbot.ThroxBot 0.1 | 9 | 100% |
| joe.ADinosaur 1.0 | 7 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |

Hadur died in 72 of 280 rounds, at a mean tick of 582. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 22 | 31% | 108 |
| cs.Grudge 1.0 | 11 | 15% | 11 |
| EH.Eagle 1.0.6 | 7 | 10% | 57 |
| joe.ADinosaur 1.0 | 7 | 10% | 14 |
| sheldor.melee.nano.TestMelee 0.1 | 6 | 8% | 23 |
| techdude.kombat.FlamingKombat 1.5 | 5 | 7% | 15 |
| wee.Gem 1.8.4 | 4 | 6% | 31 |
| throxbot.ThroxBot 0.1 | 3 | 4% | 11 |
| caimano.Furia_Ceca 0.22 | 3 | 4% | 9 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 168780 melee ticks, 52151 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 49 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 0.

Targeting waves (275 rounds): 55336 sent, 48910 reached their opponent, 12849 virtual hits (26.3% of those reached).

## Melee bench: F28

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 306 over 8 battles (38.3 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 89.4 | 169 / 280 | 1.95 | 18.4% | 32101 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.0 | 18.4% | 169 |
| kid.test.NightFox .2 | 2.0 | 14.8% | 48 |
| uji.Antique 1.0 | 3.1 | 12.2% | 32 |
| qohnil.blot.BlotBot 3.61 | 4.4 | 10.6% | 15 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.3% | 6 |
| ahr.ice.Ice 1.0.2 | 6.4 | 8.2% | 5 |
| amk.ChumbaWumba 0.3 | 7.0 | 7.7% | 3 |
| matt.advanced.Katana 1.0 | 8.3 | 6.4% | 1 |
| stelo.PianistNano 1.2 | 9.0 | 5.9% | 1 |
| stelo.Lifestealer 1.0 | 9.4 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 92.1 | 26 / 35 | 3781 |
| 2 | 1 | 66.0 | 86.7 | 16 / 35 | 3802 |
| 3 | 1 | 67.5 | 88.9 | 18 / 35 | 4135 |
| 4 | 1 | 68.4 | 90.8 | 24 / 35 | 3943 |
| 5 | 1 | 67.5 | 87.0 | 22 / 35 | 4053 |
| 6 | 1 | 68.0 | 88.3 | 21 / 35 | 4423 |
| 7 | 1 | 68.1 | 91.4 | 21 / 35 | 3967 |
| 8 | 1 | 68.1 | 90.5 | 21 / 35 | 3997 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 106 | 76% |
| uji.Antique 1.0 | 60 | 85% |
| qohnil.blot.BlotBot 3.61 | 19 | 63% |
| pfvicm.Sobieski 7.2.3b | 12 | 67% |
| ahr.ice.Ice 1.0.2 | 8 | 88% |
| amk.ChumbaWumba 0.3 | 6 | 83% |
| matt.advanced.Katana 1.0 | 4 | 100% |
| stelo.PianistNano 1.2 | 2 | 50% |

Hadur died in 114 of 280 rounds, at a mean tick of 776. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 42 | 37% | 88 |
| uji.Antique 1.0 | 24 | 21% | 73 |
| pfvicm.Sobieski 7.2.3b | 18 | 16% | 32 |
| qohnil.blot.BlotBot 3.61 | 9 | 8% | 38 |
| amk.ChumbaWumba 0.3 | 9 | 8% | 13 |
| ahr.ice.Ice 1.0.2 | 4 | 4% | 15 |
| stelo.PianistNano 1.2 | 4 | 4% | 6 |
| stelo.Lifestealer 1.0 | 2 | 2% | 4 |
| matt.advanced.Katana 1.0 | 1 | 1% | 10 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 269 rounds): 174515 melee ticks, 51903 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (269 rounds): longest scan gap while four or more were alive 33 ticks (269 rounds over 8); rounds whose longest gap at any count was over 8: 269; robots dropped as dead without a death event: 0.

Targeting waves (269 rounds): 59315 sent, 53052 reached their opponent, 7892 virtual hits (14.9% of those reached).

## Melee bench: F29

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1005 over 8 battles (125.6 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.1 | 125 / 280 | 2.34 | 18.1% | 35651 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.0 | 18.1% | 125 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 14.9% | 66 |
| deewiant.Anomaly 0.2 | 2.6 | 15.0% | 60 |
| myl.micro.Troodon 1.10 | 4.0 | 12.5% | 15 |
| jok.PheonixM 0.1.2 | 4.9 | 10.8% | 11 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.3% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.1 | 6.4% | 1 |
| DBall.Anarchy 0.1 | 7.9 | 5.8% | 1 |
| ap.Frederick 1.1 | 9.4 | 4.4% | 1 |
| jangs.ns51 1.0 | 9.6 | 4.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 86.0 | 18 / 35 | 4495 |
| 2 | 1 | 69.6 | 89.2 | 22 / 35 | 4684 |
| 3 | 1 | 68.1 | 86.0 | 15 / 35 | 4366 |
| 4 | 1 | 66.7 | 82.9 | 12 / 35 | 4459 |
| 5 | 1 | 67.1 | 81.3 | 12 / 35 | 4513 |
| 6 | 1 | 68.2 | 85.4 | 17 / 35 | 4342 |
| 7 | 1 | 67.0 | 83.2 | 11 / 35 | 4264 |
| 8 | 1 | 68.7 | 87.0 | 18 / 35 | 4528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 79 | 61% |
| zyx.mega.YersiniaPestis 3.1 | 63 | 49% |
| myl.micro.Troodon 1.10 | 30 | 90% |
| jok.PheonixM 0.1.2 | 16 | 75% |
| DBall.Anarchy 0.1 | 3 | 100% |
| jangs.ns51 1.0 | 3 | 67% |
| ap.Frederick 1.1 | 2 | 50% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |

Hadur died in 164 of 280 rounds, at a mean tick of 974. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 58 | 35% | 109 |
| zyx.mega.YersiniaPestis 3.1 | 50 | 30% | 85 |
| myl.micro.Troodon 1.10 | 20 | 12% | 38 |
| jok.PheonixM 0.1.2 | 18 | 11% | 33 |
| ph.melee.ArcherME 0.3 | 4 | 2% | 6 |
| jangs.ns51 1.0 | 3 | 2% | 3 |
| DBall.Anarchy 0.1 | 1 | 1% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 1 |
| ap.Frederick 1.1 | 1 | 1% | 0 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 223943 melee ticks, 68320 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 32 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 1.

Targeting waves (276 rounds): 73952 sent, 67492 reached their opponent, 10709 virtual hits (15.9% of those reached).

## Melee bench: F30

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1003 over 8 battles (125.4 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 75.3 | 61 / 280 | 3.23 | 14.8% | 29515 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.4 | 14.8% | 61 |
| catcat20.Matcha 0.006 | 2.1 | 14.1% | 63 |
| darkcanuck.B26354 1.06 | 2.9 | 13.5% | 61 |
| stelo.PastFuture 2.3.2 | 4.1 | 12.6% | 26 |
| oog.melee.Capulet 1.2 | 4.5 | 12.1% | 41 |
| intruder.PrairieWolf 2.61 | 6.3 | 9.1% | 12 |
| fowl3628800.LightningBolt 2.6.0 | 7.5 | 7.2% | 9 |
| tripphippy.Alice 1.1 | 7.9 | 7.3% | 4 |
| ntc.Opposite 1.5 | 8.4 | 7.0% | 3 |
| GarmBox.Anger 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.4 | 72.7 | 9 / 35 | 3454 |
| 2 | 2 | 62.0 | 72.7 | 6 / 35 | 3644 |
| 3 | 1 | 63.2 | 77.5 | 8 / 35 | 3613 |
| 4 | 1 | 62.4 | 73.7 | 6 / 35 | 3645 |
| 5 | 1 | 63.8 | 78.7 | 8 / 35 | 3919 |
| 6 | 1 | 64.3 | 78.4 | 11 / 35 | 3924 |
| 7 | 2 | 62.2 | 73.0 | 6 / 35 | 3734 |
| 8 | 2 | 62.5 | 75.6 | 7 / 35 | 3582 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 34 | 38% |
| darkcanuck.B26354 1.06 | 31 | 39% |
| oog.melee.Capulet 1.2 | 23 | 48% |
| stelo.PastFuture 2.3.2 | 20 | 70% |
| intruder.PrairieWolf 2.61 | 12 | 42% |
| fowl3628800.LightningBolt 2.6.0 | 6 | 33% |
| tripphippy.Alice 1.1 | 5 | 60% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 227 of 280 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 59 | 26% | 73 |
| catcat20.Matcha 0.006 | 45 | 20% | 60 |
| stelo.PastFuture 2.3.2 | 39 | 17% | 53 |
| oog.melee.Capulet 1.2 | 31 | 14% | 42 |
| intruder.PrairieWolf 2.61 | 18 | 8% | 21 |
| tripphippy.Alice 1.1 | 11 | 5% | 14 |
| fowl3628800.LightningBolt 2.6.0 | 9 | 4% | 9 |
| ntc.Opposite 1.5 | 7 | 3% | 8 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 210830 melee ticks, 39121 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 100 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 100 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 2.

Targeting waves (276 rounds): 69919 sent, 63341 reached their opponent, 10780 virtual hits (17.0% of those reached).

## Melee bench: F31

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1014 over 8 battles (126.8 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 75.4 | 59 / 280 | 3.22 | 14.7% | 27808 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.5% | 124 |
| hadur2.Hadur 3.18.1bb | 2.4 | 14.7% | 59 |
| gh.mini.Griezel 0.2 | 2.6 | 13.9% | 66 |
| d414.nano.Quantum 1.0.0 | 4.1 | 12.0% | 16 |
| spinnercat.micro.Tyger 0.1 | 4.9 | 10.8% | 8 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.1% | 6 |
| timmit.nano.TimDog 0.33 | 7.1 | 6.6% | 1 |
| fm.mammillarias 1.3 | 8.9 | 5.2% | 0 |
| tlp.ThreeLeggedPig 1 | 9.0 | 5.1% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.5 | 67.6 | 5 / 35 | 3108 |
| 2 | 2 | 65.0 | 81.9 | 10 / 35 | 3848 |
| 3 | 2 | 64.4 | 79.4 | 10 / 35 | 3589 |
| 4 | 2 | 63.0 | 77.5 | 7 / 35 | 3323 |
| 5 | 3 | 62.1 | 74.3 | 5 / 35 | 3540 |
| 6 | 2 | 63.4 | 77.1 | 8 / 35 | 3643 |
| 7 | 3 | 61.1 | 71.1 | 6 / 35 | 3191 |
| 8 | 2 | 62.5 | 74.0 | 8 / 35 | 3566 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.mini.Griezel 0.2 | 44 | 48% |
| abc.Shadow 3.84i | 38 | 37% |
| d414.nano.Quantum 1.0.0 | 11 | 73% |
| spinnercat.micro.Tyger 0.1 | 8 | 88% |
| gh.nano.Grofvuil 0.2 | 6 | 100% |
| timmit.nano.TimDog 0.33 | 2 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 0% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 231 of 280 rounds, at a mean tick of 840. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 83 | 36% | 97 |
| gh.mini.Griezel 0.2 | 61 | 26% | 83 |
| spinnercat.micro.Tyger 0.1 | 29 | 13% | 40 |
| d414.nano.Quantum 1.0.0 | 19 | 8% | 24 |
| gh.nano.Grofvuil 0.2 | 13 | 6% | 17 |
| Gecko.ultimateGeckoBot 1.0 | 6 | 3% | 6 |
| timmit.nano.TimDog 0.33 | 5 | 2% | 8 |
| fm.mammillarias 1.3 | 4 | 2% | 4 |
| tlp.ThreeLeggedPig 1 | 1 | 0% | 1 |
10 death(s) with no robot to name.

Posture (Hadur's M records, 278 rounds): 207024 melee ticks, 38236 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 527 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (278 rounds): longest scan gap while four or more were alive 239 ticks (278 rounds over 8); rounds whose longest gap at any count was over 8: 278; robots dropped as dead without a death event: 2.

Targeting waves (278 rounds): 68120 sent, 61505 reached their opponent, 10148 virtual hits (16.5% of those reached).

## Melee bench: F32

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 494 over 8 battles (61.8 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 85.2 | 146 / 280 | 2.33 | 17.4% | 33229 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.0 | 17.4% | 146 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.8% | 68 |
| apc.botM 3.0 | 3.3 | 12.1% | 33 |
| lxx.ConceptA 0.8 | 4.1 | 10.4% | 7 |
| vjik.UnViolation 1.1 | 4.6 | 9.9% | 10 |
| bayen.UbaMicro 1.4 | 6.4 | 8.6% | 3 |
| panzer.Panzer 0.2 | 7.3 | 7.7% | 1 |
| yk.JahMicro 1.0 | 8.3 | 7.1% | 7 |
| conscience.Electron 1.3g | 8.4 | 6.9% | 1 |
| donjezza.Jezza 1.0 | 9.8 | 5.1% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 86.0 | 20 / 35 | 4139 |
| 2 | 1 | 67.0 | 88.3 | 17 / 35 | 4307 |
| 3 | 1 | 67.5 | 88.6 | 23 / 35 | 4093 |
| 4 | 1 | 62.9 | 75.6 | 14 / 35 | 3707 |
| 5 | 1 | 66.0 | 84.8 | 16 / 35 | 4017 |
| 6 | 1 | 64.9 | 82.2 | 13 / 35 | 4162 |
| 7 | 1 | 68.2 | 90.2 | 23 / 35 | 4581 |
| 8 | 1 | 66.5 | 86.0 | 20 / 35 | 4223 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 104 | 63% |
| apc.botM 3.0 | 38 | 68% |
| vjik.UnViolation 1.1 | 15 | 87% |
| yk.JahMicro 1.0 | 14 | 71% |
| lxx.ConceptA 0.8 | 10 | 70% |
| bayen.UbaMicro 1.4 | 10 | 90% |
| donjezza.Jezza 1.0 | 9 | 78% |
| panzer.Panzer 0.2 | 7 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 138 of 280 rounds, at a mean tick of 744. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 56 | 41% | 111 |
| lxx.ConceptA 0.8 | 25 | 18% | 33 |
| apc.botM 3.0 | 19 | 14% | 47 |
| vjik.UnViolation 1.1 | 11 | 8% | 38 |
| bayen.UbaMicro 1.4 | 7 | 5% | 16 |
| panzer.Panzer 0.2 | 6 | 4% | 8 |
| yk.JahMicro 1.0 | 5 | 4% | 12 |
| conscience.Electron 1.3g | 3 | 2% | 8 |
| donjezza.Jezza 1.0 | 3 | 2% | 6 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 165348 melee ticks, 62838 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 63 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 57469 sent, 50984 reached their opponent, 9460 virtual hits (18.6% of those reached).

## Melee bench: F33

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 754 over 8 battles (94.3 per battle, most in one battle 146). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 87.9 | 155 / 280 | 2.09 | 18.9% | 38055 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.0 | 18.9% | 155 |
| maribo.Quester 0.3 | 2.0 | 16.2% | 52 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.7% | 28 |
| gre.svman4.Leonidas 1.3.2 | 4.6 | 10.5% | 13 |
| labg.Cataclysm 2.05 | 4.8 | 10.4% | 27 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.1 | 8.9% | 2 |
| baal.nano.N 1.42 | 6.5 | 8.9% | 2 |
| zyx.micro.Ant 1.1 | 8.6 | 5.0% | 0 |
| sanja.First 0.1 | 8.8 | 4.9% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.6 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 85.1 | 18 / 35 | 4635 |
| 2 | 1 | 69.0 | 87.6 | 18 / 35 | 4768 |
| 3 | 1 | 68.5 | 87.9 | 18 / 35 | 4569 |
| 4 | 1 | 68.3 | 85.4 | 18 / 35 | 4648 |
| 5 | 1 | 69.1 | 87.3 | 20 / 35 | 4756 |
| 6 | 1 | 70.2 | 90.5 | 22 / 35 | 5152 |
| 7 | 1 | 69.9 | 91.4 | 20 / 35 | 4805 |
| 8 | 1 | 69.3 | 87.9 | 21 / 35 | 4722 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 75 | 76% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 49 | 80% |
| gre.svman4.Leonidas 1.3.2 | 31 | 81% |
| labg.Cataclysm 2.05 | 29 | 69% |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 88% |
| baal.nano.N 1.42 | 5 | 80% |
| sanja.First 0.1 | 3 | 100% |

Hadur died in 130 of 280 rounds, at a mean tick of 998. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 54 | 42% | 118 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 15% | 63 |
| gre.svman4.Leonidas 1.3.2 | 20 | 15% | 39 |
| labg.Cataclysm 2.05 | 14 | 11% | 30 |
| kinsen.melee.Angsaichmophobia 1.8c | 12 | 9% | 14 |
| baal.nano.N 1.42 | 5 | 4% | 13 |
| zyx.micro.Ant 1.1 | 0 | 0% | 2 |
| sanja.First 0.1 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 230361 melee ticks, 70216 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 56 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 2.

Targeting waves (276 rounds): 75448 sent, 68920 reached their opponent, 10491 virtual hits (15.2% of those reached).

## Melee bench: F34

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 739 over 8 battles (92.4 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 85.4 | 103 / 280 | 2.31 | 17.8% | 40221 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.1 | 17.8% | 103 |
| kid.Gladiator .7.2 | 2.3 | 16.5% | 64 |
| stelo.Spread 0.9 | 2.6 | 16.0% | 79 |
| jcs.Seth 1.8 | 4.0 | 11.9% | 22 |
| tcf.Reach 3 | 5.3 | 10.5% | 9 |
| cli.Dancer 1.1 | 5.8 | 9.4% | 1 |
| ratosh.Wesco 1.4 | 7.1 | 6.7% | 1 |
| amk.Punbot.Punbot 0.01 | 7.9 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.1 | 3.5% | 1 |
| sample.RamFire 1.0 | 9.9 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 81.9 | 12 / 35 | 4778 |
| 2 | 1 | 67.9 | 85.7 | 12 / 35 | 4678 |
| 3 | 1 | 68.9 | 86.7 | 12 / 35 | 5352 |
| 4 | 1 | 67.7 | 85.1 | 11 / 35 | 4873 |
| 5 | 2 | 67.9 | 83.8 | 12 / 35 | 5223 |
| 6 | 1 | 68.5 | 84.1 | 17 / 35 | 5015 |
| 7 | 1 | 68.0 | 85.4 | 10 / 35 | 5002 |
| 8 | 1 | 70.2 | 90.5 | 17 / 35 | 5300 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 78 | 53% |
| stelo.Spread 0.9 | 72 | 51% |
| jcs.Seth 1.8 | 28 | 50% |
| tcf.Reach 3 | 6 | 67% |
| amk.Punbot.Punbot 0.01 | 3 | 100% |
| cli.Dancer 1.1 | 3 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 184 of 280 rounds, at a mean tick of 1074. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 77 | 42% | 112 |
| stelo.Spread 0.9 | 60 | 33% | 95 |
| jcs.Seth 1.8 | 28 | 15% | 52 |
| tcf.Reach 3 | 9 | 5% | 11 |
| cli.Dancer 1.1 | 2 | 1% | 6 |
| sample.VelociRobot 1.0 | 1 | 1% | 2 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |
| ratosh.Wesco 1.4 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 230906 melee ticks, 77517 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 49 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 0.

Targeting waves (275 rounds): 72300 sent, 65960 reached their opponent, 11296 virtual hits (17.1% of those reached).

## Melee bench: F35

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 856 over 8 battles (107.0 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 80.0 | 51 / 280 | 2.80 | 15.4% | 29667 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.6% | 192 |
| hadur2.Hadur 3.18.1bb | 2.0 | 15.4% | 51 |
| gh.mini.Gruwel 0.9 | 3.4 | 12.7% | 20 |
| rz.HawkOnFire 0.1 | 4.3 | 12.0% | 7 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.4 | 11.5% | 8 |
| wit.Chuliath 1.0 | 6.5 | 6.8% | 2 |
| myl.nano.KomoriNinja 1.1 | 7.4 | 6.0% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 6.0% | 1 |
| dans.Cinnamon 1.2 | 9.3 | 4.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.4 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 81.9 | 5 / 35 | 3665 |
| 2 | 2 | 64.1 | 79.4 | 7 / 35 | 3686 |
| 3 | 2 | 62.0 | 74.0 | 2 / 35 | 3655 |
| 4 | 2 | 63.7 | 78.1 | 7 / 35 | 3627 |
| 5 | 2 | 66.2 | 85.1 | 9 / 35 | 4108 |
| 6 | 2 | 64.7 | 81.0 | 8 / 35 | 3641 |
| 7 | 2 | 64.8 | 81.6 | 8 / 35 | 3598 |
| 8 | 2 | 63.6 | 79.0 | 5 / 35 | 3687 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 110 | 17% |
| gh.mini.Gruwel 0.9 | 22 | 59% |
| rz.HawkOnFire 0.1 | 12 | 92% |
| dmh.robocode.robot.BlackDeath 9.2 | 10 | 70% |
| wit.Chuliath 1.0 | 2 | 50% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 0% |

Hadur died in 237 of 280 rounds, at a mean tick of 936. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 133 | 56% | 154 |
| rz.HawkOnFire 0.1 | 32 | 14% | 40 |
| dmh.robocode.robot.BlackDeath 9.2 | 27 | 11% | 34 |
| gh.mini.Gruwel 0.9 | 23 | 10% | 36 |
| wit.Chuliath 1.0 | 5 | 2% | 7 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 2% | 4 |
| myl.nano.KomoriNinja 1.1 | 3 | 1% | 3 |
| dans.Cinnamon 1.2 | 2 | 1% | 2 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 197090 melee ticks, 63403 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 40 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (275 rounds): 61399 sent, 54802 reached their opponent, 8887 virtual hits (16.2% of those reached).

## Melee bench: F36

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 504 over 8 battles (63.0 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 91.9 | 201 / 280 | 1.73 | 20.3% | 41228 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.0 | 20.3% | 201 |
| alpha.RainingFire 1.0 | 2.6 | 12.5% | 20 |
| bzdp.Pansy 2.1 | 2.6 | 12.6% | 23 |
| bvh.micro.Freya 0.3 | 4.8 | 10.3% | 12 |
| mz.Cork 0.1 | 4.9 | 10.4% | 10 |
| bvh.mini.Fenrir 0.39 | 5.9 | 9.8% | 5 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.7% | 7 |
| squidM.TentalceMeleeNano 1.1 | 8.1 | 5.8% | 0 |
| dl.BetterWalls 1.0 | 9.0 | 4.7% | 0 |
| sample.MyFirstRobot 1.0 | 9.9 | 3.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 88.6 | 21 / 35 | 5181 |
| 2 | 1 | 70.9 | 93.0 | 24 / 35 | 5353 |
| 3 | 1 | 70.3 | 92.1 | 26 / 35 | 5124 |
| 4 | 1 | 70.5 | 91.4 | 25 / 35 | 5291 |
| 5 | 1 | 70.3 | 91.1 | 25 / 35 | 4888 |
| 6 | 1 | 70.4 | 92.1 | 26 / 35 | 5039 |
| 7 | 1 | 71.8 | 95.2 | 28 / 35 | 5439 |
| 8 | 1 | 70.5 | 92.1 | 26 / 35 | 4913 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 61 | 89% |
| alpha.RainingFire 1.0 | 48 | 81% |
| bvh.micro.Freya 0.3 | 41 | 88% |
| mz.Cork 0.1 | 35 | 83% |
| bvh.mini.Fenrir 0.39 | 25 | 92% |
| m3thos.Eva02 0.7.1 | 18 | 89% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.MyFirstRobot 1.0 | 1 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 83 of 280 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 20 | 24% | 70 |
| alpha.RainingFire 1.0 | 16 | 19% | 55 |
| bvh.micro.Freya 0.3 | 16 | 19% | 43 |
| m3thos.Eva02 0.7.1 | 10 | 12% | 37 |
| mz.Cork 0.1 | 9 | 11% | 40 |
| bvh.mini.Fenrir 0.39 | 9 | 11% | 29 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 3 |
| dl.BetterWalls 1.0 | 0 | 0% | 2 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 270 rounds): 194354 melee ticks, 59856 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (270 rounds): longest scan gap while four or more were alive 49 ticks (270 rounds over 8); rounds whose longest gap at any count was over 8: 270; robots dropped as dead without a death event: 2.

Targeting waves (270 rounds): 67361 sent, 61237 reached their opponent, 12683 virtual hits (20.7% of those reached).

## Melee bench: F37

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 532 over 8 battles (66.5 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 93.1 | 222 / 280 | 1.63 | 20.2% | 45939 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.0 | 20.2% | 222 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.6 | 10.7% | 6 |
| EBBU.Sim2 1.02 | 3.3 | 9.9% | 6 |
| germ.TheMind .2 | 4.6 | 9.6% | 3 |
| agrach.Dalek 1.0 | 5.8 | 9.2% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 6.5 | 8.7% | 2 |
| stelo.UntouchableNano 1.3 | 6.6 | 8.7% | 20 |
| lmk.ACPFinal 0.1 | 7.4 | 8.1% | 6 |
| mb.Beast 0.1 | 8.0 | 8.0% | 6 |
| skm.Ryubot 1.0 | 9.3 | 7.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 89.8 | 27 / 35 | 5606 |
| 2 | 1 | 70.0 | 94.6 | 28 / 35 | 5830 |
| 3 | 1 | 71.0 | 97.1 | 31 / 35 | 5989 |
| 4 | 1 | 70.0 | 94.0 | 27 / 35 | 6042 |
| 5 | 1 | 70.3 | 94.3 | 30 / 35 | 5916 |
| 6 | 1 | 68.0 | 88.3 | 25 / 35 | 5457 |
| 7 | 1 | 68.3 | 89.5 | 25 / 35 | 5442 |
| 8 | 1 | 70.3 | 96.8 | 29 / 35 | 5657 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| EBBU.Sim2 1.02 | 44 | 93% |
| com.syncleus.robocode.Dreadnaught 0.1 | 40 | 93% |
| agrach.Dalek 1.0 | 39 | 100% |
| stelo.UntouchableNano 1.3 | 34 | 65% |
| germ.TheMind .2 | 29 | 100% |
| lmk.ACPFinal 0.1 | 20 | 95% |
| mb.Beast 0.1 | 18 | 100% |
| skm.Ryubot 1.0 | 16 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 33% |

Hadur died in 62 of 280 rounds, at a mean tick of 544. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.UntouchableNano 1.3 | 15 | 24% | 35 |
| mn.nano.perceptual.Impact 1.3.0 | 11 | 18% | 18 |
| com.syncleus.robocode.Dreadnaught 0.1 | 10 | 16% | 49 |
| agrach.Dalek 1.0 | 8 | 13% | 51 |
| EBBU.Sim2 1.02 | 6 | 10% | 38 |
| mb.Beast 0.1 | 4 | 6% | 26 |
| germ.TheMind .2 | 3 | 5% | 22 |
| lmk.ACPFinal 0.1 | 1 | 2% | 27 |
| skm.Ryubot 1.0 | 1 | 2% | 11 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 270 rounds): 131441 melee ticks, 39638 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (270 rounds): longest scan gap while four or more were alive 42 ticks (270 rounds over 8); rounds whose longest gap at any count was over 8: 270; robots dropped as dead without a death event: 3.

Targeting waves (270 rounds): 44623 sent, 38635 reached their opponent, 11685 virtual hits (30.2% of those reached).

## Melee bench: F38

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 987 over 8 battles (123.4 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 84.9 | 134 / 280 | 2.36 | 17.6% | 35257 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.0 | 17.6% | 134 |
| justin.Mallais 14.0 | 2.0 | 16.0% | 91 |
| bvh.mini.Freya 0.55 | 3.1 | 12.8% | 15 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.3% | 23 |
| cs.Wren 1.0 | 4.8 | 10.6% | 8 |
| kdf.KoulDestroyer 1.0 | 6.0 | 9.4% | 7 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.0 | 8.1% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.9 | 6.5% | 0 |
| matt.UnderDark3 2.4.34 | 9.5 | 3.9% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 80.6 | 13 / 35 | 4192 |
| 2 | 1 | 67.2 | 84.1 | 16 / 35 | 4475 |
| 3 | 1 | 68.7 | 90.2 | 19 / 35 | 4580 |
| 4 | 1 | 65.4 | 80.3 | 11 / 35 | 4224 |
| 5 | 1 | 68.7 | 88.6 | 20 / 35 | 4690 |
| 6 | 1 | 68.5 | 87.6 | 20 / 35 | 4701 |
| 7 | 1 | 67.7 | 87.0 | 21 / 35 | 4180 |
| 8 | 1 | 65.5 | 80.6 | 14 / 35 | 4215 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 78 | 67% |
| bts.mega.Gnarly 1.4 | 30 | 77% |
| bvh.mini.Freya 0.55 | 29 | 66% |
| cs.Wren 1.0 | 19 | 89% |
| kdf.KoulDestroyer 1.0 | 14 | 64% |
| davidalves.net.DuelistNanoMelee 1.01 | 9 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 155 of 280 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 53 | 34% | 105 |
| bvh.mini.Freya 0.55 | 31 | 20% | 43 |
| bts.mega.Gnarly 1.4 | 19 | 12% | 49 |
| kdf.KoulDestroyer 1.0 | 19 | 12% | 27 |
| cs.Wren 1.0 | 17 | 11% | 32 |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 3% | 13 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 2% | 8 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 3 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 279 rounds): 187368 melee ticks, 47542 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (279 rounds): longest scan gap while four or more were alive 38 ticks (279 rounds over 8); rounds whose longest gap at any count was over 8: 279; robots dropped as dead without a death event: 0.

Targeting waves (279 rounds): 62801 sent, 55882 reached their opponent, 11935 virtual hits (21.4% of those reached).

## Melee bench: F39

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 953 over 8 battles (119.1 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 83.7 | 121 / 280 | 2.46 | 17.4% | 37407 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.0 | 17.4% | 121 |
| bvh.fry.Freya 0.82 | 2.1 | 14.6% | 24 |
| az.Ololobot 0.2.4 | 3.1 | 12.9% | 74 |
| catcat20.Lambda 0.024 | 3.8 | 12.5% | 46 |
| winamp32.micro.MicroMacro 1.0 | 5.9 | 8.4% | 1 |
| apollokidd.ApolloKidd 0.9 | 6.1 | 8.2% | 3 |
| gimp.GimpBot 0.1 | 6.9 | 7.8% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 7.1 | 7.5% | 9 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.1 | 5.8% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.9 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 81.6 | 14 / 35 | 4667 |
| 2 | 1 | 65.8 | 81.9 | 15 / 35 | 4594 |
| 3 | 1 | 66.0 | 83.8 | 15 / 35 | 4436 |
| 4 | 1 | 67.4 | 86.0 | 17 / 35 | 4881 |
| 5 | 1 | 66.0 | 81.3 | 15 / 35 | 4827 |
| 6 | 1 | 66.8 | 86.3 | 13 / 35 | 4793 |
| 7 | 1 | 65.1 | 80.3 | 14 / 35 | 4363 |
| 8 | 1 | 67.9 | 88.6 | 18 / 35 | 4846 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 62 | 42% |
| bvh.fry.Freya 0.82 | 52 | 87% |
| catcat20.Lambda 0.024 | 43 | 53% |
| gimp.GimpBot 0.1 | 12 | 100% |
| winamp32.micro.MicroMacro 1.0 | 8 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 6 | 67% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 169 of 280 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 49 | 29% | 78 |
| bvh.fry.Freya 0.82 | 47 | 28% | 82 |
| catcat20.Lambda 0.024 | 39 | 23% | 56 |
| stelo.SoRobotNanoMelee 1.2 | 11 | 7% | 16 |
| apollokidd.ApolloKidd 0.9 | 7 | 4% | 13 |
| winamp32.micro.MicroMacro 1.0 | 3 | 2% | 13 |
| whitesquare.robots.SkynetAdvanced 1.1 | 3 | 2% | 4 |
| gimp.GimpBot 0.1 | 1 | 1% | 16 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 2 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 278 rounds): 219478 melee ticks, 64684 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 36 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (278 rounds): longest scan gap while four or more were alive 36 ticks (278 rounds over 8); rounds whose longest gap at any count was over 8: 278; robots dropped as dead without a death event: 0.

Targeting waves (278 rounds): 71388 sent, 64830 reached their opponent, 11610 virtual hits (17.9% of those reached).

## Melee bench: F40

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 736 over 8 battles (92.0 per battle, most in one battle 154). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.9 | 177 / 280 | 2.00 | 19.5% | 39934 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.0 | 19.5% | 177 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.3% | 40 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.7% | 21 |
| mz.AntiGrav 1.0 | 4.3 | 11.1% | 16 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.6% | 12 |
| alpha.BlackIce 1.0 | 6.4 | 8.9% | 5 |
| stelo.Randomness 1.0 | 6.4 | 8.7% | 8 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.7% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.4 | 3.9% | 0 |
| sample.Corners 1.0 | 9.6 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 89.5 | 18 / 35 | 4960 |
| 2 | 1 | 69.6 | 89.5 | 22 / 35 | 4854 |
| 3 | 1 | 66.3 | 79.7 | 20 / 35 | 4440 |
| 4 | 1 | 67.8 | 83.2 | 18 / 35 | 4926 |
| 5 | 1 | 71.1 | 92.1 | 27 / 35 | 5195 |
| 6 | 1 | 72.4 | 95.9 | 27 / 35 | 5462 |
| 7 | 1 | 70.5 | 90.8 | 22 / 35 | 5339 |
| 8 | 1 | 69.6 | 90.5 | 23 / 35 | 4758 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 80 | 81% |
| kano.gamma.KanoGamma 1.8 | 54 | 83% |
| mz.AntiGrav 1.0 | 29 | 90% |
| Polkwane.SmashMelee 1.0 | 23 | 87% |
| stelo.Randomness 1.0 | 15 | 80% |
| alpha.BlackIce 1.0 | 9 | 89% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 108 of 280 rounds, at a mean tick of 837. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 30 | 28% | 87 |
| kano.gamma.KanoGamma 1.8 | 25 | 23% | 73 |
| mz.AntiGrav 1.0 | 15 | 14% | 37 |
| stelo.Randomness 1.0 | 12 | 11% | 29 |
| Polkwane.SmashMelee 1.0 | 10 | 9% | 25 |
| alpha.BlackIce 1.0 | 8 | 7% | 16 |
| amk.superstrike.SuperStrike 0.3 | 3 | 3% | 10 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 201340 melee ticks, 56184 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 121 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 121 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 0.

Targeting waves (273 rounds): 67542 sent, 60817 reached their opponent, 13274 virtual hits (21.8% of those reached).

## Melee bench: F41

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 898 over 8 battles (112.3 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 86.0 | 116 / 280 | 2.26 | 17.5% | 33878 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.3 | 17.5% | 116 |
| eem.EvBotNG v12.8 | 1.8 | 16.4% | 104 |
| ary.Swarm 1.1 | 3.1 | 13.6% | 15 |
| lessonz.robocode.Oz 0.5.0 | 3.9 | 12.4% | 30 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.9% | 14 |
| shrub.Silver v048 | 6.3 | 8.7% | 1 |
| zyx.nano.Ant 1.1 | 6.8 | 7.5% | 0 |
| jsal.Jsalbot 1.0 | 8.4 | 5.5% | 0 |
| stelo.Mirror 1.1 | 8.6 | 5.4% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 88.3 | 15 / 35 | 4358 |
| 2 | 2 | 65.1 | 79.0 | 12 / 35 | 3869 |
| 3 | 1 | 67.9 | 88.9 | 15 / 35 | 4087 |
| 4 | 1 | 68.1 | 87.6 | 16 / 35 | 4460 |
| 5 | 1 | 68.0 | 86.7 | 15 / 35 | 4329 |
| 6 | 1 | 66.9 | 82.9 | 14 / 35 | 4336 |
| 7 | 1 | 68.6 | 90.5 | 17 / 35 | 4333 |
| 8 | 2 | 66.5 | 84.4 | 12 / 35 | 4106 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 101 | 42% |
| ary.Swarm 1.1 | 33 | 85% |
| lessonz.robocode.Oz 0.5.0 | 30 | 63% |
| simonton.nano.MeleeSeed 1.8 | 19 | 95% |
| shrub.Silver v048 | 5 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| stelo.Mirror 1.1 | 1 | 0% |

Hadur died in 172 of 280 rounds, at a mean tick of 987. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 78 | 45% | 115 |
| lessonz.robocode.Oz 0.5.0 | 35 | 20% | 48 |
| ary.Swarm 1.1 | 30 | 17% | 59 |
| simonton.nano.MeleeSeed 1.8 | 9 | 5% | 29 |
| shrub.Silver v048 | 5 | 3% | 14 |
| stelo.Mirror 1.1 | 3 | 2% | 3 |
| zyx.nano.Ant 1.1 | 2 | 1% | 5 |
| acogdev.alpha 0.2 | 2 | 1% | 2 |
| jsal.Jsalbot 1.0 | 0 | 0% | 5 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 211589 melee ticks, 68674 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 75 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 75 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 0.

Targeting waves (276 rounds): 69148 sent, 62474 reached their opponent, 9980 virtual hits (16.0% of those reached).

## Melee bench: F42

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 548 over 8 battles (68.5 per battle, most in one battle 156). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 89.2 | 169 / 280 | 1.97 | 19.4% | 44437 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.0 | 19.4% | 169 |
| wompi.Wallaby 5.1 | 2.0 | 15.6% | 57 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.4% | 18 |
| ara.Shera 0.88 | 3.8 | 13.0% | 33 |
| amz.NanoClone 1.41 | 5.0 | 8.6% | 0 |
| dsw.StaticD 1.0 | 6.4 | 7.0% | 3 |
| maribo.IotaCT 1.1 | 6.9 | 6.7% | 0 |
| stelo.MirrorMicro 1.0 | 8.0 | 6.2% | 1 |
| mme.NikeEnhanced 2.0 | 8.9 | 5.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.9 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 85.7 | 15 / 35 | 5058 |
| 2 | 1 | 68.1 | 84.8 | 16 / 35 | 5343 |
| 3 | 1 | 70.8 | 91.7 | 24 / 35 | 5952 |
| 4 | 1 | 71.0 | 93.0 | 25 / 35 | 5763 |
| 5 | 1 | 69.7 | 88.9 | 24 / 35 | 5408 |
| 6 | 1 | 71.6 | 94.9 | 24 / 35 | 6104 |
| 7 | 1 | 67.9 | 84.4 | 18 / 35 | 5242 |
| 8 | 1 | 70.2 | 90.5 | 23 / 35 | 5567 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 127 | 81% |
| maribo.mini.MiniQuester 0.1 | 43 | 79% |
| ara.Shera 0.88 | 39 | 62% |
| dsw.StaticD 1.0 | 3 | 100% |
| amz.NanoClone 1.41 | 3 | 100% |
| stelo.MirrorMicro 1.0 | 2 | 100% |

Hadur died in 116 of 280 rounds, at a mean tick of 946. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 41 | 35% | 132 |
| ara.Shera 0.88 | 37 | 32% | 65 |
| maribo.mini.MiniQuester 0.1 | 24 | 21% | 59 |
| amz.NanoClone 1.41 | 6 | 5% | 10 |
| dsw.StaticD 1.0 | 1 | 1% | 7 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 3 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 217367 melee ticks, 70155 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 35 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 3.

Targeting waves (276 rounds): 70257 sent, 63947 reached their opponent, 12929 virtual hits (20.2% of those reached).

## Melee bench: F43

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 843 over 8 battles (105.4 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 78.5 | 55 / 280 | 2.94 | 15.5% | 31202 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.6% | 182 |
| hadur2.Hadur 3.18.1bb | 2.0 | 15.5% | 55 |
| brainfade.melee.Dusk 0.44 | 3.0 | 12.6% | 29 |
| dummy.micro.Sparrow 2.5 | 4.1 | 11.8% | 8 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.9% | 4 |
| Krabb.akim2.Akim2 1.1b | 5.9 | 9.6% | 3 |
| jab.DiamondStealer 5 | 7.4 | 7.7% | 0 |
| mz.NanoGod 2.02 | 7.6 | 7.5% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.6% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.7 | 79.0 | 8 / 35 | 4184 |
| 2 | 2 | 65.9 | 81.9 | 5 / 35 | 3842 |
| 3 | 2 | 66.4 | 80.3 | 10 / 35 | 3943 |
| 4 | 2 | 67.0 | 83.2 | 8 / 35 | 4234 |
| 5 | 2 | 65.0 | 76.8 | 8 / 35 | 3681 |
| 6 | 2 | 63.8 | 73.3 | 6 / 35 | 3589 |
| 7 | 2 | 64.6 | 77.5 | 6 / 35 | 3770 |
| 8 | 2 | 64.4 | 75.9 | 4 / 35 | 3959 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 92 | 29% |
| brainfade.melee.Dusk 0.44 | 30 | 63% |
| dummy.micro.Sparrow 2.5 | 6 | 50% |
| wcsv.melee.EngineerMelee 0.1 | 5 | 40% |
| mz.NanoGod 2.02 | 2 | 100% |
| Krabb.akim2.Akim2 1.1b | 2 | 100% |

Hadur died in 234 of 280 rounds, at a mean tick of 943. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 134 | 57% | 159 |
| brainfade.melee.Dusk 0.44 | 30 | 13% | 50 |
| dummy.micro.Sparrow 2.5 | 27 | 12% | 28 |
| wcsv.melee.EngineerMelee 0.1 | 18 | 8% | 21 |
| mz.NanoGod 2.02 | 10 | 4% | 12 |
| Krabb.akim2.Akim2 1.1b | 4 | 2% | 7 |
| jab.DiamondStealer 5 | 2 | 1% | 2 |
9 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 207535 melee ticks, 59116 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 49 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 1.

Targeting waves (275 rounds): 67095 sent, 60319 reached their opponent, 10024 virtual hits (16.6% of those reached).

## Melee bench: F44

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 591 over 8 battles (73.9 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 91.4 | 186 / 280 | 1.77 | 20.4% | 45435 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.0 | 20.4% | 186 |
| stelo.Liblix 0.3.1 | 2.0 | 15.7% | 60 |
| tzu.TheArtOfWar 1.2 | 3.0 | 13.6% | 21 |
| jwirde.Gort 2.0 | 4.3 | 9.8% | 10 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.8 | 9.1% | 1 |
| disan.Chair 2.2.0 | 6.9 | 7.5% | 0 |
| wompi.Quokka 1.6 | 6.9 | 7.6% | 2 |
| stf.PanzerGeneral 0.1 | 7.3 | 7.2% | 0 |
| sample.Crazy 1.0 | 9.4 | 4.6% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.6 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 95.2 | 26 / 35 | 5768 |
| 2 | 1 | 70.8 | 91.1 | 22 / 35 | 5932 |
| 3 | 1 | 71.4 | 91.4 | 26 / 35 | 5846 |
| 4 | 1 | 70.7 | 92.7 | 20 / 35 | 5638 |
| 5 | 1 | 70.8 | 89.8 | 22 / 35 | 5883 |
| 6 | 1 | 71.3 | 94.3 | 25 / 35 | 5502 |
| 7 | 1 | 69.0 | 86.3 | 21 / 35 | 5214 |
| 8 | 1 | 70.5 | 90.5 | 24 / 35 | 5652 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 107 | 70% |
| tzu.TheArtOfWar 1.2 | 72 | 88% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 18 | 94% |
| jwirde.Gort 2.0 | 17 | 82% |
| disan.Chair 2.2.0 | 12 | 100% |
| stf.PanzerGeneral 0.1 | 3 | 100% |
| wompi.Quokka 1.6 | 2 | 0% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 99 of 280 rounds, at a mean tick of 915. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 48 | 48% | 130 |
| tzu.TheArtOfWar 1.2 | 23 | 23% | 75 |
| jwirde.Gort 2.0 | 11 | 11% | 31 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 4% | 19 |
| wompi.Quokka 1.6 | 4 | 4% | 7 |
| disan.Chair 2.2.0 | 2 | 2% | 8 |
| amk.jointstrike.JointStrike 0.2 | 2 | 2% | 5 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 4 |
| sample.Crazy 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 206862 melee ticks, 61824 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 57 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 2.

Targeting waves (272 rounds): 71520 sent, 65306 reached their opponent, 14303 virtual hits (21.9% of those reached).

## Melee bench: F45

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 793 over 8 battles (99.1 per battle, most in one battle 232). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 87.9 | 130 / 280 | 2.09 | 19.6% | 44862 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 1.0 | 19.6% | 130 |
| eem.IWillFireNoBullet v2.8 | 2.4 | 12.7% | 118 |
| jje.BagPuss 1.2 | 2.9 | 12.0% | 9 |
| sul.Lunar 1.1 | 4.0 | 10.9% | 11 |
| myl.nano.Graviton 1.10 | 4.9 | 10.3% | 5 |
| pez.mini.ChironexFleckeri 0.5 | 6.4 | 8.9% | 6 |
| fm.claire 1.7 | 7.1 | 8.2% | 0 |
| hvilela.HVilela 0.9 | 7.4 | 8.1% | 0 |
| wit.Deep7 2.0 | 9.1 | 5.3% | 1 |
| abud.ThirdRobo 1.0 | 9.9 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 88.3 | 18 / 35 | 5662 |
| 2 | 1 | 69.4 | 88.9 | 17 / 35 | 5580 |
| 3 | 1 | 69.2 | 87.3 | 19 / 35 | 5324 |
| 4 | 1 | 68.4 | 86.3 | 13 / 35 | 5317 |
| 5 | 1 | 70.2 | 90.2 | 18 / 35 | 5789 |
| 6 | 1 | 68.4 | 85.1 | 14 / 35 | 5384 |
| 7 | 1 | 69.1 | 87.3 | 14 / 35 | 5707 |
| 8 | 1 | 70.5 | 90.2 | 17 / 35 | 6099 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 118 | 43% |
| sul.Lunar 1.1 | 31 | 81% |
| jje.BagPuss 1.2 | 26 | 85% |
| myl.nano.Graviton 1.10 | 13 | 85% |
| pez.mini.ChironexFleckeri 0.5 | 12 | 75% |
| wit.Deep7 2.0 | 7 | 100% |
| fm.claire 1.7 | 4 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 156 of 280 rounds, at a mean tick of 1597. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 70 | 45% | 0 |
| jje.BagPuss 1.2 | 24 | 15% | 79 |
| sul.Lunar 1.1 | 19 | 12% | 79 |
| myl.nano.Graviton 1.10 | 12 | 8% | 43 |
| pez.mini.ChironexFleckeri 0.5 | 9 | 6% | 31 |
| hvilela.HVilela 0.9 | 7 | 4% | 14 |
| fm.claire 1.7 | 6 | 4% | 17 |
| wit.Deep7 2.0 | 3 | 2% | 11 |
| abud.ThirdRobo 1.0 | 0 | 0% | 5 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 277 rounds): 269235 melee ticks, 136899 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 44 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (277 rounds): longest scan gap while four or more were alive 35 ticks (277 rounds over 8); rounds whose longest gap at any count was over 8: 277; robots dropped as dead without a death event: 0.

Targeting waves (277 rounds): 83786 sent, 77347 reached their opponent, 11924 virtual hits (15.4% of those reached).

## Melee bench: F46

hadur2.Hadur 3.18.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 853 over 8 battles (106.6 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 84.1 | 85 / 280 | 2.43 | 16.6% | 33190 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1bb | 2.0 | 16.6% | 85 |
| rsalesc.melee.Medina 0.4.5 | 2.0 | 16.7% | 106 |
| kc.mini.Mirage 0.2 | 2.0 | 16.7% | 75 |
| mz.MicroSheep 1.0 | 4.5 | 10.3% | 3 |
| cx.Princess 1.0 | 4.5 | 10.3% | 7 |
| sadoner.killer 0.2 | 6.0 | 8.7% | 0 |
| arthord.NanoSatanMelee Beta | 7.1 | 7.4% | 4 |
| jeremyreeder.collective.Prophet 5 | 8.1 | 5.5% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 86.0 | 14 / 35 | 4588 |
| 2 | 2 | 65.7 | 83.5 | 8 / 35 | 4023 |
| 3 | 3 | 65.4 | 81.6 | 8 / 35 | 4134 |
| 4 | 2 | 67.5 | 87.0 | 9 / 35 | 4712 |
| 5 | 3 | 64.4 | 81.9 | 10 / 35 | 3636 |
| 6 | 1 | 67.2 | 87.3 | 15 / 35 | 4071 |
| 7 | 2 | 65.2 | 82.5 | 11 / 35 | 3864 |
| 8 | 2 | 65.7 | 83.2 | 10 / 35 | 4162 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 84 | 64% |
| rsalesc.melee.Medina 0.4.5 | 53 | 23% |
| cx.Princess 1.0 | 11 | 64% |
| mz.MicroSheep 1.0 | 9 | 89% |
| arthord.NanoSatanMelee Beta | 7 | 57% |

Hadur died in 203 of 280 rounds, at a mean tick of 952. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 78 | 38% | 131 |
| rsalesc.melee.Medina 0.4.5 | 72 | 35% | 88 |
| mz.MicroSheep 1.0 | 17 | 8% | 22 |
| arthord.NanoSatanMelee Beta | 14 | 7% | 16 |
| sadoner.killer 0.2 | 8 | 4% | 9 |
| cx.Princess 1.0 | 6 | 3% | 13 |
| jeremyreeder.collective.Prophet 5 | 1 | 0% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 277 rounds): 206206 melee ticks, 63906 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (277 rounds): longest scan gap while four or more were alive 40 ticks (277 rounds over 8); rounds whose longest gap at any count was over 8: 277; robots dropped as dead without a death event: 2.

Targeting waves (277 rounds): 61134 sent, 54610 reached their opponent, 8452 virtual hits (15.5% of those reached).

