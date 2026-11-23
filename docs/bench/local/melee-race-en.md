# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 517 over 10 battles (51.7 per battle, most in one battle 73). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 90.1 | 196 / 350 | 1.89 | 19.2% | 56094 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.2 | 19.2% | 196 |
| voidious.Diamond 1.8.28 | 1.8 | 18.1% | 116 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.5 | 11.2% | 5 |
| sgp.JollyNinja 3.53 | 4.0 | 11.1% | 26 |
| mz.MicroGodMelee 1 | 5.0 | 10.1% | 5 |
| lorneswork.Predator 1.0 | 5.5 | 9.8% | 4 |
| adt.Ar2 1.0 | 7.1 | 7.6% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.1 | 5.5% | 0 |
| skm.butterfly 1.0 | 8.9 | 4.2% | 0 |
| mym.EdgeStalker 1.0 | 9.9 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.4 | 86.7 | 17 / 35 | 5324 |
| 2 | 1 | 69.8 | 89.8 | 21 / 35 | 5593 |
| 3 | 1 | 69.2 | 87.9 | 17 / 35 | 5541 |
| 4 | 1 | 70.8 | 92.7 | 24 / 35 | 6011 |
| 5 | 2 | 69.1 | 89.5 | 15 / 35 | 5131 |
| 6 | 1 | 69.6 | 90.2 | 20 / 35 | 5682 |
| 7 | 1 | 69.2 | 87.0 | 19 / 35 | 5617 |
| 8 | 1 | 70.2 | 91.4 | 20 / 35 | 5858 |
| 9 | 1 | 70.1 | 90.8 | 19 / 35 | 5860 |
| 10 | 1 | 70.7 | 94.6 | 24 / 35 | 5477 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 204 | 65% |
| sgp.JollyNinja 3.53 | 25 | 60% |
| mz.MicroGodMelee 1 | 22 | 82% |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 76% |
| lorneswork.Predator 1.0 | 11 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 158 of 350 rounds, at a mean tick of 1290. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 87 | 55% | 226 |
| sgp.JollyNinja 3.53 | 24 | 15% | 33 |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 11% | 28 |
| lorneswork.Predator 1.0 | 12 | 8% | 22 |
| mz.MicroGodMelee 1 | 9 | 6% | 28 |
| adt.Ar2 1.0 | 4 | 3% | 6 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 4 |
| skm.butterfly 1.0 | 1 | 1% | 2 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 329 rounds): 223725 melee ticks, 400124 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (329 rounds): longest scan gap while four or more were alive 80 ticks (329 rounds over 8); rounds whose longest gap at any count was over 8: 329; robots dropped as dead without a death event: 0.

Targeting waves (329 rounds): 70060 sent, 61989 reached their opponent, 11735 virtual hits (18.9% of those reached).

## Melee bench: F02

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 450 over 10 battles (45.0 per battle, most in one battle 58). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 87.0 | 195 / 350 | 2.17 | 19.3% | 53704 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 19.3% | 195 |
| pulsar.PulsarMax 0.8.9 | 2.1 | 13.9% | 62 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.1 | 12.7% | 36 |
| lrem.micro.SpikeSoldier 0.4 | 4.4 | 10.9% | 5 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.6 | 10.5% | 19 |
| fnc.bandit.Bandit 5.2.0 | 6.3 | 8.5% | 3 |
| Noran.BitchingElk 0.054 | 7.0 | 7.9% | 14 |
| sch.Simone 0.3d | 7.5 | 7.7% | 14 |
| stelo.PatternRobot 1.0 | 9.1 | 5.3% | 2 |
| fullsail.SweetTea 1.1 | 9.9 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 79.0 | 16 / 35 | 5331 |
| 2 | 1 | 69.0 | 87.3 | 16 / 35 | 5306 |
| 3 | 1 | 69.1 | 85.4 | 19 / 35 | 5344 |
| 4 | 1 | 69.9 | 87.9 | 23 / 35 | 5319 |
| 5 | 1 | 67.2 | 82.9 | 16 / 35 | 4831 |
| 6 | 1 | 70.0 | 89.8 | 20 / 35 | 5469 |
| 7 | 1 | 71.2 | 92.7 | 22 / 35 | 5772 |
| 8 | 1 | 69.4 | 86.7 | 20 / 35 | 5492 |
| 9 | 1 | 70.0 | 89.8 | 23 / 35 | 5232 |
| 10 | 1 | 69.5 | 88.3 | 20 / 35 | 5608 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 83 | 57% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 68 | 78% |
| com.cohesiva.robocode.ManOwaR 1.0 | 44 | 84% |
| Noran.BitchingElk 0.054 | 28 | 79% |
| sch.Simone 0.3d | 17 | 82% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 94% |
| fnc.bandit.Bandit 5.2.0 | 7 | 71% |
| stelo.PatternRobot 1.0 | 1 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 156 of 350 rounds, at a mean tick of 944. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 50 | 32% | 100 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 26 | 17% | 73 |
| com.cohesiva.robocode.ManOwaR 1.0 | 19 | 12% | 53 |
| sch.Simone 0.3d | 19 | 12% | 37 |
| Noran.BitchingElk 0.054 | 13 | 8% | 39 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 8% | 20 |
| stelo.PatternRobot 1.0 | 8 | 5% | 10 |
| fnc.bandit.Bandit 5.2.0 | 7 | 4% | 14 |
| fullsail.SweetTea 1.1 | 2 | 1% | 3 |

Posture (Hadur's M records, 331 rounds): 267642 melee ticks, 99869 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 69 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 69 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 0.

Targeting waves (331 rounds): 93584 sent, 85531 reached their opponent, 13656 virtual hits (16.0% of those reached).

## Melee bench: F03

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 358 over 10 battles (35.8 per battle, most in one battle 46). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 95.6 | 306 / 350 | 1.39 | 21.7% | 66504 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 21.7% | 306 |
| radnor.DoctorBob 1.42 | 2.6 | 13.5% | 20 |
| kawigi.nano.Lib 1.0 | 3.0 | 12.7% | 4 |
| vuen.Cake 2.51 | 3.4 | 12.4% | 18 |
| urdos.URDOS 1.3 | 5.2 | 8.8% | 1 |
| adt.Ar1 2.1 | 5.9 | 7.9% | 1 |
| oa.weak.FlyMk1 0.1 | 7.3 | 6.7% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.8 | 6.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.1 | 5.2% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 96.2 | 31 / 35 | 6687 |
| 2 | 1 | 72.3 | 95.2 | 32 / 35 | 6584 |
| 3 | 1 | 73.1 | 99.0 | 34 / 35 | 6852 |
| 4 | 1 | 72.8 | 97.5 | 32 / 35 | 6745 |
| 5 | 1 | 72.4 | 95.6 | 31 / 35 | 6761 |
| 6 | 1 | 72.4 | 96.8 | 29 / 35 | 6863 |
| 7 | 1 | 72.2 | 97.5 | 32 / 35 | 6383 |
| 8 | 1 | 71.0 | 93.0 | 27 / 35 | 6259 |
| 9 | 1 | 71.4 | 94.6 | 29 / 35 | 6386 |
| 10 | 1 | 71.8 | 90.8 | 29 / 35 | 6984 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 122 | 95% |
| radnor.DoctorBob 1.42 | 109 | 97% |
| kawigi.nano.Lib 1.0 | 68 | 100% |
| oa.weak.FlyMk1 0.1 | 7 | 100% |
| adt.Ar1 2.1 | 6 | 100% |
| urdos.URDOS 1.3 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 45 of 350 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 17 | 38% | 94 |
| vuen.Cake 2.51 | 6 | 13% | 118 |
| kawigi.nano.Lib 1.0 | 6 | 13% | 66 |
| urdos.URDOS 1.3 | 6 | 13% | 17 |
| oa.weak.FlyMk1 0.1 | 4 | 9% | 21 |
| adt.Ar1 2.1 | 3 | 7% | 11 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 4% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 7 |

Posture (Hadur's M records, 334 rounds): 211397 melee ticks, 71843 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (334 rounds): longest scan gap while four or more were alive 49 ticks (334 rounds over 8); rounds whose longest gap at any count was over 8: 334; robots dropped as dead without a death event: 0.

Targeting waves (334 rounds): 62893 sent, 54694 reached their opponent, 12931 virtual hits (23.6% of those reached).

## Melee bench: F04

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 269 over 10 battles (26.9 per battle, most in one battle 44). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 87.4 | 89 / 350 | 2.14 | 18.6% | 59801 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 21.8% | 239 |
| hadur117.Hadur 3.24en | 2.0 | 18.6% | 89 |
| apc.LeeroyJenkins2 1.0 | 3.1 | 13.2% | 16 |
| TNT.TNT 0.99.1 | 4.0 | 10.6% | 6 |
| josago.Jorgito 0.16 | 4.9 | 9.6% | 1 |
| css.Delitioner 0.11 | 6.6 | 7.2% | 0 |
| tj.zombie1n 1.0.1 | 6.7 | 6.6% | 0 |
| rampancy.Durandal 2.1d | 7.7 | 5.6% | 0 |
| sp.Nanos.Ember 1.1 | 9.4 | 3.5% | 0 |
| spin.Bugstard 0.012b | 9.6 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.4 | 88.9 | 10 / 35 | 5771 |
| 2 | 2 | 70.2 | 87.3 | 10 / 35 | 6292 |
| 3 | 2 | 70.7 | 90.8 | 12 / 35 | 6305 |
| 4 | 2 | 69.4 | 88.3 | 7 / 35 | 5885 |
| 5 | 2 | 69.4 | 85.7 | 9 / 35 | 6071 |
| 6 | 2 | 69.5 | 87.3 | 7 / 35 | 6084 |
| 7 | 2 | 68.9 | 85.7 | 9 / 35 | 5764 |
| 8 | 2 | 69.0 | 87.0 | 9 / 35 | 5527 |
| 9 | 2 | 69.6 | 87.9 | 10 / 35 | 5872 |
| 10 | 2 | 69.1 | 84.8 | 6 / 35 | 6230 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 228 | 24% |
| apc.LeeroyJenkins2 1.0 | 26 | 65% |
| TNT.TNT 0.99.1 | 15 | 80% |
| css.Delitioner 0.11 | 3 | 100% |
| josago.Jorgito 0.16 | 2 | 100% |

Hadur died in 261 of 350 rounds, at a mean tick of 2261. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 194 | 74% | 252 |
| apc.LeeroyJenkins2 1.0 | 32 | 12% | 45 |
| TNT.TNT 0.99.1 | 14 | 5% | 27 |
| josago.Jorgito 0.16 | 14 | 5% | 17 |
| css.Delitioner 0.11 | 5 | 2% | 7 |
| tj.zombie1n 1.0.1 | 2 | 1% | 2 |

Posture (Hadur's M records, 333 rounds): 304313 melee ticks, 485849 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 79 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 1.

Targeting waves (333 rounds): 92429 sent, 84203 reached their opponent, 11848 virtual hits (14.1% of those reached).

## Melee bench: F05

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 338 over 10 battles (33.8 per battle, most in one battle 45). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 80.0 | 85 / 350 | 2.80 | 16.1% | 43887 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.1 | 17.7% | 158 |
| justin.DemonicRage 3.4 | 2.2 | 16.4% | 74 |
| hadur117.Hadur 3.24en | 2.7 | 16.1% | 85 |
| wompi.Numbat 2.1 | 4.0 | 12.5% | 21 |
| ms.Ares 0.19 | 5.5 | 9.3% | 3 |
| axeBots.HataMoto 3.09 | 5.5 | 9.1% | 10 |
| supersample.SuperBoxBot 1.0 | 7.3 | 5.7% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.9 | 5.3% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.0% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.4 | 76.8 | 7 / 35 | 4274 |
| 2 | 3 | 65.1 | 77.1 | 7 / 35 | 4629 |
| 3 | 3 | 66.0 | 82.5 | 8 / 35 | 4337 |
| 4 | 3 | 63.9 | 74.6 | 9 / 35 | 4018 |
| 5 | 3 | 66.2 | 81.6 | 10 / 35 | 4483 |
| 6 | 3 | 65.3 | 80.6 | 7 / 35 | 4241 |
| 7 | 2 | 66.8 | 84.8 | 10 / 35 | 4485 |
| 8 | 3 | 64.6 | 76.2 | 7 / 35 | 4341 |
| 9 | 1 | 67.2 | 85.1 | 13 / 35 | 4362 |
| 10 | 3 | 66.3 | 81.0 | 7 / 35 | 4717 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 77 | 22% |
| justin.DemonicRage 3.4 | 63 | 63% |
| wompi.Numbat 2.1 | 31 | 74% |
| axeBots.HataMoto 3.09 | 5 | 60% |
| ms.Ares 0.19 | 4 | 50% |

Hadur died in 267 of 350 rounds, at a mean tick of 1069. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 98 | 37% | 117 |
| justin.DemonicRage 3.4 | 85 | 32% | 122 |
| wompi.Numbat 2.1 | 41 | 15% | 60 |
| axeBots.HataMoto 3.09 | 21 | 8% | 23 |
| ms.Ares 0.19 | 11 | 4% | 16 |
| supersample.SuperBoxBot 1.0 | 4 | 1% | 4 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 1% | 4 |
| Queens_teamrobot.UltraRazor 1.0 | 2 | 1% | 3 |
| GarmBox.Oranges 1.0 | 1 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 335 rounds): 248657 melee ticks, 139859 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (335 rounds): longest scan gap while four or more were alive 56 ticks (335 rounds over 8); rounds whose longest gap at any count was over 8: 335; robots dropped as dead without a death event: 1.

Targeting waves (335 rounds): 75591 sent, 67101 reached their opponent, 10581 virtual hits (15.8% of those reached).

## Melee bench: F06

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 413 over 10 battles (41.3 per battle, most in one battle 53). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 93.0 | 261 / 350 | 1.63 | 21.0% | 58577 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 21.0% | 261 |
| jekl.StoneGhost 0.7 | 2.4 | 14.0% | 24 |
| origin.SleepSiphon 1.7b | 3.1 | 13.2% | 35 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.5 | 12.4% | 25 |
| mld.Wisdom 1.0 | 5.1 | 10.3% | 4 |
| gg.Wolverine 2.0 | 5.9 | 8.7% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.6 | 6.6% | 0 |
| DBall.NUKE 0.1 | 8.1 | 5.8% | 1 |
| spinnercat.Omen 1.0 | 8.3 | 5.4% | 0 |
| sample.Fire 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 91.7 | 28 / 35 | 5564 |
| 2 | 1 | 71.8 | 91.7 | 29 / 35 | 5799 |
| 3 | 1 | 71.4 | 91.7 | 24 / 35 | 5979 |
| 4 | 1 | 72.8 | 95.9 | 29 / 35 | 6122 |
| 5 | 1 | 72.5 | 95.9 | 28 / 35 | 5811 |
| 6 | 1 | 72.8 | 95.2 | 28 / 35 | 6189 |
| 7 | 1 | 71.1 | 92.7 | 23 / 35 | 5782 |
| 8 | 1 | 72.3 | 94.3 | 26 / 35 | 6055 |
| 9 | 1 | 70.8 | 89.8 | 23 / 35 | 5789 |
| 10 | 1 | 70.3 | 90.5 | 23 / 35 | 5487 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 97 | 91% |
| origin.SleepSiphon 1.7b | 83 | 89% |
| pe.minimelee.SandboxMiniMelee 1.1 | 71 | 87% |
| gg.Wolverine 2.0 | 15 | 100% |
| mld.Wisdom 1.0 | 12 | 92% |
| ers.nano.hawk.HawkLA 3.0m | 9 | 100% |
| DBall.NUKE 0.1 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 90 of 350 rounds, at a mean tick of 854. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 31 | 34% | 106 |
| pe.minimelee.SandboxMiniMelee 1.1 | 25 | 28% | 87 |
| jekl.StoneGhost 0.7 | 20 | 22% | 90 |
| mld.Wisdom 1.0 | 10 | 11% | 34 |
| gg.Wolverine 2.0 | 2 | 2% | 15 |
| DBall.NUKE 0.1 | 1 | 1% | 5 |
| spinnercat.Omen 1.0 | 1 | 1% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 0 | 0% | 10 |

Posture (Hadur's M records, 334 rounds): 246033 melee ticks, 84906 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (334 rounds): longest scan gap while four or more were alive 64 ticks (334 rounds over 8); rounds whose longest gap at any count was over 8: 334; robots dropped as dead without a death event: 1.

Targeting waves (334 rounds): 74146 sent, 66006 reached their opponent, 13764 virtual hits (20.9% of those reached).

## Melee bench: F07

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 276 over 10 battles (27.6 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.4 | 93.9 | 233 / 350 | 1.55 | 21.6% | 68333 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 21.6% | 233 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 16.8% | 50 |
| rtk.Tachikoma 1.0 | 2.7 | 16.3% | 47 |
| oog.melee.CapuletDroid 1.1 | 4.1 | 11.1% | 5 |
| franzor.Lizt 1.3.1 | 4.9 | 10.2% | 14 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.9% | 0 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 7.9% | 1 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.4% | 0 |
| sample.Target 1.0 | 9.3 | 2.1% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.7 | 95.2 | 24 / 35 | 7094 |
| 2 | 1 | 74.5 | 95.6 | 26 / 35 | 7415 |
| 3 | 1 | 73.0 | 93.7 | 24 / 35 | 6374 |
| 4 | 1 | 72.5 | 90.8 | 19 / 35 | 6814 |
| 5 | 1 | 73.1 | 94.3 | 23 / 35 | 6814 |
| 6 | 1 | 73.0 | 93.7 | 22 / 35 | 6586 |
| 7 | 1 | 74.2 | 96.2 | 26 / 35 | 7086 |
| 8 | 1 | 72.8 | 92.1 | 23 / 35 | 6654 |
| 9 | 1 | 73.3 | 94.3 | 23 / 35 | 6779 |
| 10 | 1 | 73.6 | 93.7 | 23 / 35 | 6717 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 143 | 78% |
| rsalesc.melee.Monk 0.3.6c | 104 | 69% |
| oog.melee.CapuletDroid 1.1 | 32 | 94% |
| franzor.Lizt 1.3.1 | 23 | 70% |
| exauge.GateKeeper 1.1.121g | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 0% |

Hadur died in 117 of 350 rounds, at a mean tick of 1378. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 53 | 45% | 157 |
| rsalesc.melee.Monk 0.3.6c | 43 | 37% | 135 |
| franzor.Lizt 1.3.1 | 11 | 9% | 8 |
| exauge.GateKeeper 1.1.121g | 4 | 3% | 8 |
| oog.melee.CapuletDroid 1.1 | 3 | 3% | 36 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 4 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

Posture (Hadur's M records, 331 rounds): 291745 melee ticks, 226601 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 57 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 1.

Targeting waves (331 rounds): 86565 sent, 78579 reached their opponent, 14769 virtual hits (18.8% of those reached).

## Melee bench: F08

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 544 over 10 battles (54.4 per battle, most in one battle 62). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 91.3 | 240 / 350 | 1.78 | 20.1% | 52307 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 20.1% | 240 |
| tm.Yuugao 1.0 | 2.4 | 12.9% | 38 |
| shrub.Vapour v159 | 2.7 | 12.9% | 30 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 10.8% | 20 |
| com.spp.robocode.MostlyHarmless 010 | 5.7 | 9.4% | 11 |
| m3thos.Eva00 1.1 | 6.0 | 9.0% | 3 |
| jwst.DAD.DarkAndDarker 1.1 | 6.2 | 8.8% | 8 |
| qualidafial.MajorDick 1.0.1 | 8.1 | 6.5% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.4 | 4.9% | 1 |
| SHAM.WOW 1.4 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 91.7 | 23 / 35 | 5220 |
| 2 | 1 | 69.7 | 89.5 | 24 / 35 | 5394 |
| 3 | 1 | 71.0 | 94.0 | 26 / 35 | 5526 |
| 4 | 1 | 69.7 | 90.5 | 20 / 35 | 5284 |
| 5 | 1 | 68.8 | 88.6 | 21 / 35 | 4860 |
| 6 | 1 | 69.5 | 90.5 | 23 / 35 | 4920 |
| 7 | 1 | 70.8 | 94.3 | 26 / 35 | 5188 |
| 8 | 1 | 71.2 | 92.7 | 28 / 35 | 5682 |
| 9 | 1 | 69.5 | 91.1 | 24 / 35 | 5142 |
| 10 | 1 | 69.8 | 90.2 | 25 / 35 | 5091 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 95 | 85% |
| shrub.Vapour v159 | 75 | 79% |
| Krabb.sliNk.Garm 0.9u | 46 | 85% |
| com.spp.robocode.MostlyHarmless 010 | 22 | 91% |
| jwst.DAD.DarkAndDarker 1.1 | 22 | 91% |
| m3thos.Eva00 1.1 | 13 | 92% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 110 of 350 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 29 | 26% | 85 |
| tm.Yuugao 1.0 | 24 | 22% | 108 |
| Krabb.sliNk.Garm 0.9u | 17 | 15% | 51 |
| com.spp.robocode.MostlyHarmless 010 | 15 | 14% | 38 |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 11% | 36 |
| zyx.nano.BacillusComma 1.0 | 6 | 5% | 9 |
| m3thos.Eva00 1.1 | 5 | 5% | 15 |
| SHAM.WOW 1.4 | 1 | 1% | 6 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 1 |

Posture (Hadur's M records, 331 rounds): 236085 melee ticks, 78575 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 63 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 0.

Targeting waves (331 rounds): 76697 sent, 68383 reached their opponent, 11706 virtual hits (17.1% of those reached).

## Melee bench: F09

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 289 over 10 battles (28.9 per battle, most in one battle 44). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 78.2 | 111 / 350 | 2.96 | 15.9% | 37961 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.4 | 17.2% | 151 |
| hadur117.Hadur 3.24en | 1.9 | 15.9% | 111 |
| kc.micro.Figment 1.0 | 2.8 | 14.5% | 40 |
| pedersen.Grishnakh 1.0 | 4.3 | 11.0% | 26 |
| yagami.Tidus 0.11 | 5.2 | 9.8% | 3 |
| mc2.enemy.Original 0.9 | 5.7 | 9.1% | 18 |
| dft.Calliope 5.6 | 6.7 | 7.8% | 1 |
| step.nanoPri 1.0 | 8.3 | 5.8% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.9 | 4.8% | 0 |
| rdm.Dueler 0.4x | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 79.0 | 13 / 35 | 4195 |
| 2 | 1 | 67.1 | 85.4 | 15 / 35 | 3981 |
| 3 | 3 | 63.3 | 74.6 | 7 / 35 | 3718 |
| 4 | 1 | 66.0 | 81.0 | 13 / 35 | 4207 |
| 5 | 3 | 63.1 | 74.6 | 8 / 35 | 3608 |
| 6 | 1 | 67.2 | 84.4 | 14 / 35 | 4260 |
| 7 | 2 | 62.3 | 73.0 | 11 / 35 | 3298 |
| 8 | 1 | 65.7 | 81.3 | 14 / 35 | 3768 |
| 9 | 2 | 64.8 | 79.4 | 11 / 35 | 3744 |
| 10 | 3 | 60.8 | 69.5 | 5 / 35 | 3182 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 85 | 49% |
| kc.micro.Figment 1.0 | 59 | 83% |
| pedersen.Grishnakh 1.0 | 17 | 35% |
| mc2.enemy.Original 0.9 | 10 | 60% |
| yagami.Tidus 0.11 | 6 | 83% |
| dft.Calliope 5.6 | 3 | 100% |

Hadur died in 239 of 350 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 92 | 38% | 134 |
| kc.micro.Figment 1.0 | 45 | 19% | 87 |
| pedersen.Grishnakh 1.0 | 29 | 12% | 37 |
| mc2.enemy.Original 0.9 | 28 | 12% | 34 |
| yagami.Tidus 0.11 | 23 | 10% | 32 |
| dft.Calliope 5.6 | 10 | 4% | 13 |
| robar.nano.Assertive_Melee 0.2 | 6 | 3% | 6 |
| step.nanoPri 1.0 | 5 | 2% | 6 |
| rdm.Dueler 0.4x | 1 | 0% | 1 |

Posture (Hadur's M records, 335 rounds): 246343 melee ticks, 75385 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (335 rounds): longest scan gap while four or more were alive 64 ticks (335 rounds over 8); rounds whose longest gap at any count was over 8: 335; robots dropped as dead without a death event: 0.

Targeting waves (335 rounds): 78859 sent, 70847 reached their opponent, 10022 virtual hits (14.1% of those reached).

## Melee bench: F10

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 503 over 10 battles (50.3 per battle, most in one battle 64). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 95.6 | 293 / 350 | 1.40 | 21.4% | 61298 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 21.4% | 293 |
| DTF.Kludgy 1.2b | 2.3 | 14.4% | 29 |
| ne.Chimera 1.2 | 3.4 | 12.5% | 10 |
| ejb.Polaris 1.0.1 | 3.5 | 12.2% | 9 |
| vStar.RAFzilla 2.15 | 5.2 | 10.3% | 5 |
| tvv.micro.Antares 1.1.1 | 5.6 | 9.6% | 2 |
| kurios.DOSexe .9b | 7.5 | 5.3% | 1 |
| sam.Samspin 1.0 | 8.0 | 5.4% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.7 | 4.9% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 96.5 | 29 / 35 | 6109 |
| 2 | 1 | 71.7 | 94.6 | 30 / 35 | 6176 |
| 3 | 1 | 72.3 | 94.3 | 31 / 35 | 6304 |
| 4 | 1 | 70.3 | 91.7 | 24 / 35 | 5385 |
| 5 | 1 | 71.9 | 95.6 | 29 / 35 | 5991 |
| 6 | 1 | 72.7 | 97.5 | 30 / 35 | 6638 |
| 7 | 1 | 72.8 | 97.5 | 31 / 35 | 6333 |
| 8 | 1 | 71.9 | 95.6 | 29 / 35 | 6166 |
| 9 | 1 | 72.2 | 95.6 | 30 / 35 | 6192 |
| 10 | 1 | 72.1 | 96.8 | 30 / 35 | 6004 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 128 | 85% |
| ejb.Polaris 1.0.1 | 80 | 98% |
| ne.Chimera 1.2 | 39 | 92% |
| vStar.RAFzilla 2.15 | 35 | 91% |
| tvv.micro.Antares 1.1.1 | 25 | 100% |
| kurios.DOSexe .9b | 5 | 100% |
| donjezza.Muncho 1.0 | 4 | 100% |
| sam.Samspin 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 57 of 350 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 26 | 46% | 127 |
| ne.Chimera 1.2 | 12 | 21% | 50 |
| ejb.Polaris 1.0.1 | 7 | 12% | 89 |
| vStar.RAFzilla 2.15 | 4 | 7% | 28 |
| tvv.micro.Antares 1.1.1 | 4 | 7% | 25 |
| kurios.DOSexe .9b | 2 | 4% | 12 |
| sam.Samspin 1.0 | 1 | 2% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 4 |
| donjezza.Muncho 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 330 rounds): 227511 melee ticks, 99101 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 80 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 4.

Targeting waves (330 rounds): 73127 sent, 65047 reached their opponent, 11358 virtual hits (17.5% of those reached).

## Melee bench: F11

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 406 over 10 battles (40.6 per battle, most in one battle 50). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 84.0 | 147 / 350 | 2.44 | 17.3% | 41308 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.3 | 17.3% | 147 |
| rz.Aleph 0.34 | 1.7 | 15.9% | 103 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.7% | 32 |
| djc.DynaBot 0.1.1 | 4.3 | 10.6% | 22 |
| rdt199.Warlord 0.73 | 5.1 | 9.4% | 19 |
| uji.YellohFellah 1.0 | 6.4 | 8.5% | 16 |
| br2.MobyDickBot 1.6 | 6.4 | 8.5% | 11 |
| KiraNL.Chupacabra 0.4 | 7.9 | 7.1% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.3% | 0 |
| stelo.MirrorNano 1.3 | 9.6 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 82.2 | 15 / 35 | 3910 |
| 2 | 1 | 66.7 | 88.3 | 13 / 35 | 4031 |
| 3 | 2 | 66.4 | 84.1 | 16 / 35 | 4062 |
| 4 | 2 | 65.4 | 79.7 | 15 / 35 | 4132 |
| 5 | 1 | 68.8 | 90.5 | 20 / 35 | 4558 |
| 6 | 1 | 66.7 | 85.7 | 15 / 35 | 4093 |
| 7 | 1 | 65.4 | 81.0 | 14 / 35 | 4046 |
| 8 | 1 | 68.0 | 87.6 | 17 / 35 | 4696 |
| 9 | 1 | 65.5 | 83.2 | 13 / 35 | 3973 |
| 10 | 2 | 63.9 | 77.5 | 9 / 35 | 3807 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 95 | 63% |
| cx.mini.Nimrod 0.55 | 34 | 59% |
| rdt199.Warlord 0.73 | 31 | 74% |
| djc.DynaBot 0.1.1 | 27 | 67% |
| uji.YellohFellah 1.0 | 24 | 67% |
| br2.MobyDickBot 1.6 | 12 | 75% |
| stelo.MirrorNano 1.3 | 1 | 100% |
| KiraNL.Chupacabra 0.4 | 1 | 0% |

Hadur died in 203 of 350 rounds, at a mean tick of 889. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 81 | 40% | 142 |
| cx.mini.Nimrod 0.55 | 40 | 20% | 62 |
| rdt199.Warlord 0.73 | 23 | 11% | 48 |
| djc.DynaBot 0.1.1 | 19 | 9% | 33 |
| uji.YellohFellah 1.0 | 19 | 9% | 28 |
| KiraNL.Chupacabra 0.4 | 11 | 5% | 13 |
| br2.MobyDickBot 1.6 | 8 | 4% | 20 |
| stelo.MirrorNano 1.3 | 1 | 0% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 0% | 1 |

Posture (Hadur's M records, 335 rounds): 260079 melee ticks, 71430 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (335 rounds): longest scan gap while four or more were alive 59 ticks (335 rounds over 8); rounds whose longest gap at any count was over 8: 335; robots dropped as dead without a death event: 0.

Targeting waves (335 rounds): 82943 sent, 74680 reached their opponent, 9717 virtual hits (13.0% of those reached).

## Melee bench: F12

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 429 over 10 battles (42.9 per battle, most in one battle 48). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.7 | 210 / 350 | 2.19 | 18.3% | 41499 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 18.3% | 210 |
| bts.wiki.RipCurl 0.9b | 2.2 | 14.2% | 54 |
| nat.PallasHawk 1.0 | 3.1 | 13.1% | 48 |
| darkcanuck.Leon 1.01 | 3.7 | 12.4% | 28 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.0% | 8 |
| jrm.Test0 1.0 | 6.5 | 7.8% | 2 |
| cs.sheldor.Talon 1.1 | 7.1 | 6.9% | 0 |
| jp.Perpy 16.0 | 8.2 | 6.3% | 0 |
| jaybot.bots.Oddball 4.0 | 8.9 | 5.6% | 0 |
| stuff.Vlad 0.1 | 9.3 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 90.8 | 24 / 35 | 4200 |
| 2 | 1 | 66.6 | 83.2 | 21 / 35 | 3980 |
| 3 | 1 | 68.4 | 88.9 | 24 / 35 | 3913 |
| 4 | 1 | 70.6 | 93.7 | 28 / 35 | 4618 |
| 5 | 1 | 68.2 | 87.3 | 22 / 35 | 4277 |
| 6 | 1 | 67.4 | 84.8 | 19 / 35 | 4028 |
| 7 | 1 | 66.1 | 83.2 | 17 / 35 | 3820 |
| 8 | 1 | 67.9 | 87.6 | 17 / 35 | 4426 |
| 9 | 1 | 68.2 | 88.6 | 22 / 35 | 4069 |
| 10 | 1 | 65.9 | 79.4 | 16 / 35 | 4168 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 86 | 76% |
| darkcanuck.Leon 1.01 | 64 | 86% |
| nat.PallasHawk 1.0 | 61 | 79% |
| brainfade.melee.Genghis 0.36 | 21 | 90% |
| jrm.Test0 1.0 | 7 | 86% |
| jaybot.bots.Oddball 4.0 | 6 | 100% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| jp.Perpy 16.0 | 3 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |

Hadur died in 141 of 350 rounds, at a mean tick of 659. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 50 | 35% | 97 |
| nat.PallasHawk 1.0 | 32 | 23% | 77 |
| darkcanuck.Leon 1.01 | 15 | 11% | 84 |
| jrm.Test0 1.0 | 13 | 9% | 19 |
| brainfade.melee.Genghis 0.36 | 11 | 8% | 29 |
| cs.sheldor.Talon 1.1 | 9 | 6% | 18 |
| jp.Perpy 16.0 | 5 | 4% | 7 |
| jaybot.bots.Oddball 4.0 | 4 | 3% | 10 |
| stuff.Vlad 0.1 | 2 | 1% | 6 |

Posture (Hadur's M records, 334 rounds): 209804 melee ticks, 60667 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (334 rounds): longest scan gap while four or more were alive 39 ticks (334 rounds over 8); rounds whose longest gap at any count was over 8: 334; robots dropped as dead without a death event: 1.

Targeting waves (334 rounds): 71181 sent, 62788 reached their opponent, 10044 virtual hits (16.0% of those reached).

## Melee bench: F13

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 369 over 10 battles (36.9 per battle, most in one battle 46). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 82.9 | 135 / 350 | 2.54 | 16.7% | 44875 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.5 | 16.7% | 135 |
| ags.Glacier 0.2.11 | 2.0 | 16.7% | 78 |
| mn.Combat 3.25.0 | 2.5 | 15.8% | 112 |
| shinh.Entangled 0.3 | 4.1 | 12.0% | 13 |
| gh.micro.Gruweltje 0.7 | 4.9 | 11.3% | 12 |
| apc.Colossus2 0.17 | 6.0 | 7.9% | 0 |
| stelo.Wang 1.0 | 7.1 | 6.8% | 1 |
| maribo.FollowFire 1 | 8.3 | 4.9% | 0 |
| ayk.WallHugger 1.0 | 8.7 | 4.5% | 0 |
| sample.Tracker 1.0 | 9.9 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 81.3 | 13 / 35 | 4264 |
| 2 | 2 | 64.4 | 80.3 | 10 / 35 | 4078 |
| 3 | 1 | 68.2 | 87.0 | 15 / 35 | 4778 |
| 4 | 1 | 67.2 | 83.8 | 15 / 35 | 4667 |
| 5 | 3 | 63.7 | 73.3 | 10 / 35 | 4246 |
| 6 | 3 | 65.2 | 79.0 | 12 / 35 | 4398 |
| 7 | 1 | 67.4 | 86.7 | 15 / 35 | 4496 |
| 8 | 1 | 67.9 | 85.4 | 16 / 35 | 4920 |
| 9 | 1 | 67.4 | 86.0 | 17 / 35 | 4581 |
| 10 | 1 | 67.0 | 86.3 | 12 / 35 | 4447 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 93 | 66% |
| mn.Combat 3.25.0 | 79 | 53% |
| shinh.Entangled 0.3 | 25 | 84% |
| gh.micro.Gruweltje 0.7 | 12 | 58% |
| stelo.Wang 1.0 | 4 | 75% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 216 of 350 rounds, at a mean tick of 818. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 76 | 35% | 120 |
| mn.Combat 3.25.0 | 63 | 29% | 109 |
| gh.micro.Gruweltje 0.7 | 26 | 12% | 38 |
| shinh.Entangled 0.3 | 24 | 11% | 51 |
| maribo.FollowFire 1 | 12 | 6% | 12 |
| stelo.Wang 1.0 | 9 | 4% | 13 |
| apc.Colossus2 0.17 | 4 | 2% | 5 |
| ayk.WallHugger 1.0 | 1 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 333 rounds): 235131 melee ticks, 96660 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 64 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 1.

Targeting waves (333 rounds): 68646 sent, 59967 reached their opponent, 9187 virtual hits (15.3% of those reached).

## Melee bench: F14

hadur117.Hadur 3.24en against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 388 over 10 battles (38.8 per battle, most in one battle 45). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.4 | 96.9 | 314 / 350 | 1.25 | 24.7% | 64998 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 24.7% | 314 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 16.4% | 25 |
| sanyi.mikrobi.Roberto 1.0 | 3.8 | 11.0% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 4.3 | 10.7% | 5 |
| co.edu.usb.rc.LidisTron 1.0 | 4.9 | 10.3% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.0 | 9.2% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.4% | 0 |
| pa.Improved 1.0 | 8.0 | 6.6% | 0 |
| sample.TrackFire 1.0 | 9.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 96.8 | 32 / 35 | 6371 |
| 2 | 1 | 73.9 | 97.9 | 32 / 35 | 6499 |
| 3 | 1 | 72.1 | 92.1 | 28 / 35 | 6203 |
| 4 | 1 | 74.5 | 99.3 | 34 / 35 | 7028 |
| 5 | 1 | 74.0 | 97.9 | 31 / 35 | 6670 |
| 6 | 1 | 74.2 | 98.6 | 33 / 35 | 6994 |
| 7 | 1 | 74.0 | 99.3 | 33 / 35 | 6614 |
| 8 | 1 | 72.7 | 96.1 | 28 / 35 | 6267 |
| 9 | 1 | 72.9 | 95.0 | 32 / 35 | 6275 |
| 10 | 1 | 72.9 | 96.1 | 31 / 35 | 6077 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 192 | 95% |
| sanyi.mikrobi.Roberto 1.0 | 45 | 96% |
| sheldor.micro.PointInLineRRAL 1.0 | 36 | 97% |
| co.edu.usb.rc.LidisTron 1.0 | 18 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 13 | 92% |
| pa.Improved 1.0 | 13 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 11 | 100% |

Hadur died in 36 of 350 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 21 | 58% | 182 |
| sanyi.mikrobi.Roberto 1.0 | 5 | 14% | 59 |
| Lo_Ian.Gandalf_V4 4.0 | 5 | 14% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 6% | 18 |
| pa.Improved 1.0 | 2 | 6% | 12 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 3% | 16 |
| sheldor.micro.PointInLineRRAL 1.0 | 0 | 0% | 42 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 331 rounds): 207655 melee ticks, 84644 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 42 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 3.

Targeting waves (331 rounds): 60070 sent, 53206 reached their opponent, 12878 virtual hits (24.2% of those reached).

## Melee bench: F15

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 441 over 10 battles (44.1 per battle, most in one battle 56). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 87.0 | 203 / 350 | 2.17 | 19.3% | 53790 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 19.3% | 203 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.8% | 30 |
| mld.DustBunny 3.8 | 3.3 | 12.3% | 10 |
| emp.Yngwie 1.11 | 3.5 | 12.5% | 73 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.8% | 15 |
| kawigi.robot.Girl 1.2 | 6.0 | 8.9% | 17 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.7% | 1 |
| lambdaxy.TBot 0.1 | 7.9 | 6.3% | 0 |
| divineomega.TrialBot 0.003 | 8.9 | 5.0% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.6 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 83.8 | 21 / 35 | 5227 |
| 2 | 1 | 70.0 | 87.6 | 24 / 35 | 5577 |
| 3 | 1 | 68.2 | 85.1 | 16 / 35 | 5117 |
| 4 | 1 | 68.4 | 83.8 | 18 / 35 | 5331 |
| 5 | 1 | 68.8 | 87.0 | 19 / 35 | 5109 |
| 6 | 1 | 69.9 | 89.5 | 22 / 35 | 5472 |
| 7 | 1 | 69.3 | 86.0 | 19 / 35 | 5653 |
| 8 | 1 | 70.9 | 91.1 | 24 / 35 | 5768 |
| 9 | 1 | 69.4 | 88.3 | 17 / 35 | 5410 |
| 10 | 1 | 69.0 | 87.9 | 23 / 35 | 5126 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 74 | 64% |
| kawigi.micro.Shiz 1.1 | 65 | 94% |
| mld.DustBunny 3.8 | 40 | 93% |
| kawigi.robot.Girl 1.2 | 28 | 82% |
| cb.nano.Insomnia 1.0 | 23 | 87% |
| divineomega.TrialBot 0.003 | 7 | 100% |
| Grystrion.TrackerWO 1.0 | 5 | 80% |
| lambdaxy.TBot 0.1 | 4 | 100% |

Hadur died in 148 of 350 rounds, at a mean tick of 910. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 59 | 40% | 126 |
| mld.DustBunny 3.8 | 24 | 16% | 64 |
| kawigi.micro.Shiz 1.1 | 20 | 14% | 64 |
| kawigi.robot.Girl 1.2 | 16 | 11% | 31 |
| cb.nano.Insomnia 1.0 | 14 | 9% | 23 |
| divineomega.TrialBot 0.003 | 7 | 5% | 22 |
| lambdaxy.TBot 0.1 | 4 | 3% | 11 |
| Grystrion.TrackerWO 1.0 | 4 | 3% | 8 |

Posture (Hadur's M records, 332 rounds): 261976 melee ticks, 77391 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 49 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 0.

Targeting waves (332 rounds): 84924 sent, 76757 reached their opponent, 11967 virtual hits (15.6% of those reached).

## Melee bench: F16

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 417 over 10 battles (41.7 per battle, most in one battle 50). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 91.4 | 231 / 350 | 1.77 | 20.7% | 60466 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 20.7% | 231 |
| gh.Griezel 0.5.2 | 2.0 | 16.2% | 61 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.7% | 8 |
| techdude.forest.FlamingForest 1.1 | 4.4 | 10.7% | 33 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.3% | 4 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.5% | 7 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.6% | 6 |
| asd.Cthulhu 1.3 | 8.7 | 4.5% | 0 |
| repositorio.NanoStep 1.0 | 8.7 | 4.8% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.6 | 4.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 89.5 | 22 / 35 | 6007 |
| 2 | 1 | 71.6 | 92.4 | 23 / 35 | 5957 |
| 3 | 1 | 72.0 | 92.4 | 24 / 35 | 6283 |
| 4 | 1 | 71.0 | 88.9 | 22 / 35 | 6086 |
| 5 | 1 | 71.2 | 92.4 | 24 / 35 | 5905 |
| 6 | 1 | 71.9 | 91.1 | 23 / 35 | 6531 |
| 7 | 1 | 70.2 | 88.3 | 20 / 35 | 5513 |
| 8 | 1 | 70.7 | 90.5 | 18 / 35 | 5767 |
| 9 | 1 | 73.3 | 95.9 | 30 / 35 | 6344 |
| 10 | 1 | 71.8 | 92.7 | 25 / 35 | 6073 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 167 | 84% |
| techdude.forest.FlamingForest 1.1 | 51 | 75% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 29 | 86% |
| bvh.fnr.Fenrir 0.36l | 10 | 80% |
| stelo.IntrinsicVolatility 1.4 | 9 | 78% |
| tvv.nano.Polaris 1.2 | 6 | 100% |
| divineomega.DivineBot 1.9.4.5 | 4 | 75% |
| asd.Cthulhu 1.3 | 1 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 121 of 350 rounds, at a mean tick of 1033. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 42 | 35% | 159 |
| techdude.forest.FlamingForest 1.1 | 25 | 21% | 68 |
| bvh.fnr.Fenrir 0.36l | 20 | 17% | 31 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 15 | 12% | 41 |
| stelo.IntrinsicVolatility 1.4 | 9 | 7% | 23 |
| divineomega.DivineBot 1.9.4.5 | 3 | 2% | 10 |
| tvv.nano.Polaris 1.2 | 3 | 2% | 10 |
| asd.Cthulhu 1.3 | 2 | 2% | 5 |
| repositorio.NanoStep 1.0 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 332 rounds): 286750 melee ticks, 121135 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 40 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 0.

Targeting waves (332 rounds): 90662 sent, 82729 reached their opponent, 13335 virtual hits (16.1% of those reached).

## Melee bench: F17

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 420 over 10 battles (42.0 per battle, most in one battle 55). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 89.0 | 223 / 350 | 1.99 | 20.2% | 60478 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 20.2% | 223 |
| et.Predator 1.8 | 2.4 | 13.6% | 29 |
| oog.melee.Mercutio 1.0 | 3.1 | 13.0% | 46 |
| cx.BlestPain 1.41 | 3.5 | 12.2% | 34 |
| ahf.NanoAndrew .4 | 5.3 | 10.1% | 9 |
| nic.Nicator 2.4 | 6.3 | 9.0% | 5 |
| maribo.melee.BMV 0.1 | 6.4 | 8.9% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.7% | 1 |
| tex.Longbot 0.4 | 8.7 | 5.2% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 91.1 | 24 / 35 | 6356 |
| 2 | 1 | 70.6 | 88.6 | 24 / 35 | 5913 |
| 3 | 1 | 68.7 | 83.2 | 18 / 35 | 5588 |
| 4 | 1 | 71.7 | 91.4 | 22 / 35 | 6600 |
| 5 | 1 | 70.9 | 88.9 | 24 / 35 | 6020 |
| 6 | 1 | 70.2 | 87.9 | 20 / 35 | 5956 |
| 7 | 1 | 69.7 | 86.3 | 21 / 35 | 5737 |
| 8 | 1 | 70.4 | 87.3 | 21 / 35 | 6212 |
| 9 | 1 | 71.6 | 93.7 | 24 / 35 | 5924 |
| 10 | 1 | 71.6 | 92.1 | 25 / 35 | 6172 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 91 | 87% |
| oog.melee.Mercutio 1.0 | 90 | 80% |
| cx.BlestPain 1.41 | 61 | 74% |
| ahf.NanoAndrew .4 | 16 | 88% |
| maribo.melee.BMV 0.1 | 6 | 83% |
| nic.Nicator 2.4 | 5 | 80% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |
| tex.Longbot 0.4 | 1 | 100% |
| goblin.Bender 2.4 | 1 | 100% |

Hadur died in 128 of 350 rounds, at a mean tick of 964. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 34 | 27% | 91 |
| et.Predator 1.8 | 32 | 25% | 98 |
| cx.BlestPain 1.41 | 30 | 23% | 91 |
| ahf.NanoAndrew .4 | 13 | 10% | 29 |
| maribo.melee.BMV 0.1 | 9 | 7% | 14 |
| nic.Nicator 2.4 | 7 | 5% | 13 |
| tex.Longbot 0.4 | 3 | 2% | 6 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 3 |
| goblin.Bender 2.4 | 0 | 0% | 2 |

Posture (Hadur's M records, 333 rounds): 262190 melee ticks, 163868 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 51 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 0.

Targeting waves (333 rounds): 85675 sent, 77660 reached their opponent, 15832 virtual hits (20.4% of those reached).

## Melee bench: F18

hadur117.Hadur 3.24en against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 574 over 10 battles (57.4 per battle, most in one battle 71). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 94.6 | 279 / 350 | 1.43 | 23.3% | 51675 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 23.3% | 279 |
| uji.DBH 1.1 | 2.4 | 13.1% | 16 |
| agd.Mooserwirt2 2.7 | 2.8 | 13.2% | 23 |
| sigterm.Sigterm 1.0 | 4.4 | 10.7% | 13 |
| spinnercat.Robovirus 2.718 | 5.1 | 10.0% | 3 |
| ratosh.Nobo 0.21 | 6.1 | 9.1% | 4 |
| kawigi.mini.Fhqwhgads 1.1 | 6.2 | 8.7% | 5 |
| stelo.WangRobot 1.0 | 8.2 | 6.2% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.8 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 96.4 | 30 / 35 | 5226 |
| 2 | 1 | 70.1 | 91.1 | 24 / 35 | 5032 |
| 3 | 1 | 72.8 | 97.5 | 31 / 35 | 5516 |
| 4 | 1 | 71.3 | 93.2 | 28 / 35 | 5237 |
| 5 | 1 | 70.9 | 94.6 | 28 / 35 | 4874 |
| 6 | 1 | 71.9 | 96.4 | 29 / 35 | 5292 |
| 7 | 1 | 71.0 | 95.0 | 28 / 35 | 4998 |
| 8 | 1 | 71.9 | 96.8 | 30 / 35 | 5090 |
| 9 | 1 | 71.0 | 92.5 | 27 / 35 | 5216 |
| 10 | 1 | 70.6 | 92.5 | 24 / 35 | 5194 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| uji.DBH 1.1 | 95 | 89% |
| agd.Mooserwirt2 2.7 | 85 | 91% |
| sigterm.Sigterm 1.0 | 56 | 88% |
| spinnercat.Robovirus 2.718 | 24 | 92% |
| ratosh.Nobo 0.21 | 18 | 89% |
| stelo.WangRobot 1.0 | 18 | 83% |
| kawigi.mini.Fhqwhgads 1.1 | 12 | 92% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 100% |

Hadur died in 73 of 350 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.DBH 1.1 | 17 | 23% | 92 |
| agd.Mooserwirt2 2.7 | 17 | 23% | 80 |
| sigterm.Sigterm 1.0 | 11 | 15% | 54 |
| ratosh.Nobo 0.21 | 8 | 11% | 34 |
| kawigi.mini.Fhqwhgads 1.1 | 7 | 10% | 27 |
| stelo.WangRobot 1.0 | 7 | 10% | 19 |
| spinnercat.Robovirus 2.718 | 4 | 5% | 31 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 3% | 12 |

Posture (Hadur's M records, 331 rounds): 214635 melee ticks, 92015 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 74 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 74 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 2.

Targeting waves (331 rounds): 65144 sent, 57853 reached their opponent, 12500 virtual hits (21.6% of those reached).

## Melee bench: F19

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 403 over 10 battles (40.3 per battle, most in one battle 46). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.0 | 98.5 | 328 / 350 | 1.13 | 23.0% | 66105 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 23.0% | 328 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.7% | 16 |
| krillr.mini.JointStrike 2.0.0 | 3.6 | 11.9% | 2 |
| mld.Infinity 2.2 | 4.0 | 11.3% | 2 |
| erdnis.Rover 0.3 | 4.6 | 10.5% | 2 |
| patson.PatsonTestBot 1.0 | 6.1 | 8.2% | 0 |
| mbh.Mbh 0.1 | 6.8 | 7.7% | 0 |
| pac.ABC 2.1 | 8.2 | 6.3% | 0 |
| pbg.R2D2 1.0 | 8.7 | 5.3% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.6 | 99.4 | 34 / 35 | 6753 |
| 2 | 1 | 74.0 | 98.7 | 32 / 35 | 6628 |
| 3 | 1 | 73.9 | 98.4 | 32 / 35 | 6572 |
| 4 | 1 | 74.0 | 98.1 | 31 / 35 | 6760 |
| 5 | 1 | 74.2 | 99.4 | 33 / 35 | 6794 |
| 6 | 1 | 74.6 | 99.4 | 34 / 35 | 7043 |
| 7 | 1 | 74.4 | 100.0 | 35 / 35 | 6688 |
| 8 | 1 | 73.4 | 95.6 | 30 / 35 | 6446 |
| 9 | 1 | 73.7 | 96.8 | 33 / 35 | 6386 |
| 10 | 1 | 73.6 | 99.4 | 34 / 35 | 6035 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 201 | 97% |
| krillr.mini.JointStrike 2.0.0 | 48 | 98% |
| mld.Infinity 2.2 | 39 | 100% |
| erdnis.Rover 0.3 | 27 | 93% |
| patson.PatsonTestBot 1.0 | 12 | 100% |
| pac.ABC 2.1 | 6 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 24 of 350 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| krillr.mini.JointStrike 2.0.0 | 8 | 33% | 70 |
| davidalves.net.DuelistMiniMelee 1.2 | 7 | 29% | 88 |
| erdnis.Rover 0.3 | 5 | 21% | 52 |
| patson.PatsonTestBot 1.0 | 2 | 8% | 39 |
| mld.Infinity 2.2 | 1 | 4% | 45 |
| pac.ABC 2.1 | 1 | 4% | 16 |
| mbh.Mbh 0.1 | 0 | 0% | 16 |
| pbg.R2D2 1.0 | 0 | 0% | 9 |

Posture (Hadur's M records, 330 rounds): 203012 melee ticks, 68743 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 33 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 1.

Targeting waves (330 rounds): 67856 sent, 59954 reached their opponent, 12990 virtual hits (21.7% of those reached).

## Melee bench: F20

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 328 over 10 battles (32.8 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 93.0 | 257 / 350 | 1.63 | 21.6% | 64294 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 21.6% | 257 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.5% | 41 |
| fwb.Nine 1.0.1 | 3.9 | 10.9% | 16 |
| catcat20.Rabbit 0.001 | 4.0 | 10.8% | 25 |
| nz.jdc.nano.GridFu 1.0 | 4.2 | 10.8% | 5 |
| m3thos.mini.Eva01 0.5.5 | 5.9 | 8.5% | 2 |
| bayen.nut.Squirrel 1.615 | 7.3 | 6.7% | 4 |
| ntc.ControlledChaos 1.1.4 | 8.2 | 5.9% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.6 | 5.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.9 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 92.7 | 22 / 35 | 6395 |
| 2 | 1 | 72.2 | 93.3 | 26 / 35 | 6500 |
| 3 | 1 | 72.1 | 93.0 | 25 / 35 | 6537 |
| 4 | 1 | 72.7 | 95.2 | 28 / 35 | 6238 |
| 5 | 1 | 72.4 | 91.4 | 25 / 35 | 6731 |
| 6 | 1 | 72.2 | 92.4 | 26 / 35 | 6552 |
| 7 | 1 | 72.8 | 96.5 | 30 / 35 | 6213 |
| 8 | 1 | 71.4 | 90.2 | 26 / 35 | 6205 |
| 9 | 1 | 72.1 | 92.1 | 22 / 35 | 6519 |
| 10 | 1 | 72.3 | 93.3 | 27 / 35 | 6404 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 153 | 88% |
| fwb.Nine 1.0.1 | 56 | 95% |
| catcat20.Rabbit 0.001 | 54 | 74% |
| nz.jdc.nano.GridFu 1.0 | 16 | 94% |
| m3thos.mini.Eva01 0.5.5 | 8 | 100% |
| bayen.nut.Squirrel 1.615 | 4 | 75% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 93 of 350 rounds, at a mean tick of 1014. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 50 | 54% | 174 |
| catcat20.Rabbit 0.001 | 17 | 18% | 73 |
| fwb.Nine 1.0.1 | 10 | 11% | 37 |
| bayen.nut.Squirrel 1.615 | 5 | 5% | 6 |
| djdjdj.NanoSkunk10 1.0 | 4 | 4% | 8 |
| nz.jdc.nano.GridFu 1.0 | 3 | 3% | 24 |
| m3thos.mini.Eva01 0.5.5 | 3 | 3% | 17 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 334 rounds): 268188 melee ticks, 106336 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (334 rounds): longest scan gap while four or more were alive 39 ticks (334 rounds over 8); rounds whose longest gap at any count was over 8: 334; robots dropped as dead without a death event: 0.

Targeting waves (334 rounds): 81842 sent, 73868 reached their opponent, 15833 virtual hits (21.4% of those reached).

## Melee bench: F21

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 267 over 10 battles (26.7 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 95.1 | 285 / 350 | 1.44 | 21.9% | 62533 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 21.9% | 285 |
| eem.EvBot v4.6.16 | 2.0 | 15.5% | 42 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.8% | 10 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 8 |
| eld.Hmm 1.0 | 5.5 | 7.9% | 5 |
| oa.weak.BotherBot 0.1 | 5.6 | 7.9% | 0 |
| fire219.CatBot 1.0 | 7.7 | 6.2% | 0 |
| PSW.Relentless 0.1 | 8.2 | 5.6% | 0 |
| el.JumpShoot 0.2 | 8.4 | 5.3% | 1 |
| arthord.MannyPacquiao Beta | 9.6 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 95.6 | 29 / 35 | 5561 |
| 2 | 1 | 72.7 | 95.9 | 28 / 35 | 6239 |
| 3 | 1 | 73.3 | 97.1 | 29 / 35 | 6397 |
| 4 | 1 | 73.3 | 95.2 | 28 / 35 | 6488 |
| 5 | 1 | 73.0 | 95.6 | 27 / 35 | 6513 |
| 6 | 1 | 73.2 | 94.6 | 30 / 35 | 6680 |
| 7 | 1 | 71.6 | 93.3 | 27 / 35 | 5671 |
| 8 | 1 | 73.4 | 95.2 | 29 / 35 | 6318 |
| 9 | 1 | 71.4 | 90.8 | 27 / 35 | 6413 |
| 10 | 1 | 73.4 | 97.5 | 31 / 35 | 6253 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 205 | 92% |
| dummy.mini.Scimitar 1.01 | 50 | 94% |
| cf.RiO.RiOx 4.2.1 | 36 | 94% |
| eld.Hmm 1.0 | 13 | 85% |
| el.JumpShoot 0.2 | 3 | 100% |
| oa.weak.BotherBot 0.1 | 2 | 100% |

Hadur died in 65 of 350 rounds, at a mean tick of 962. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 25 | 38% | 166 |
| dummy.mini.Scimitar 1.01 | 16 | 25% | 90 |
| cf.RiO.RiOx 4.2.1 | 15 | 23% | 52 |
| PSW.Relentless 0.1 | 4 | 6% | 4 |
| eld.Hmm 1.0 | 3 | 5% | 26 |
| el.JumpShoot 0.2 | 2 | 3% | 5 |
| arthord.MannyPacquiao Beta | 0 | 0% | 4 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 2 |
| fire219.CatBot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 330 rounds): 276451 melee ticks, 162135 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 81 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 81 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 1.

Targeting waves (330 rounds): 80808 sent, 73005 reached their opponent, 11763 virtual hits (16.1% of those reached).

## Melee bench: F22

hadur117.Hadur 3.24en against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 359 over 10 battles (35.9 per battle, most in one battle 51). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 88.9 | 195 / 350 | 1.89 | 20.7% | 45933 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 20.7% | 195 |
| pe.SandboxDT 2.71m | 2.1 | 17.1% | 77 |
| kvk.HebusLeTroll 0.35 | 3.0 | 15.5% | 42 |
| jlm.javaDisturbance 0.59 | 3.9 | 13.2% | 31 |
| bigpete.Stewie 1.0 | 5.0 | 10.6% | 7 |
| yk.JahRoslav 1.1 | 6.4 | 6.8% | 2 |
| gg.Squaraus 0.6 | 7.2 | 6.1% | 0 |
| tad.Dalek98 0.98 | 7.5 | 5.8% | 0 |
| pbg.NinjaX 1.2 | 8.9 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 89.6 | 19 / 35 | 4582 |
| 2 | 1 | 70.9 | 93.2 | 25 / 35 | 4844 |
| 3 | 1 | 69.0 | 86.8 | 20 / 35 | 4560 |
| 4 | 1 | 69.3 | 92.1 | 23 / 35 | 4416 |
| 5 | 1 | 69.6 | 90.7 | 20 / 35 | 4742 |
| 6 | 1 | 70.1 | 90.7 | 21 / 35 | 4648 |
| 7 | 1 | 67.8 | 84.6 | 13 / 35 | 4696 |
| 8 | 1 | 69.2 | 86.1 | 20 / 35 | 4775 |
| 9 | 1 | 68.2 | 86.4 | 20 / 35 | 4429 |
| 10 | 1 | 67.9 | 88.2 | 14 / 35 | 4241 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 103 | 61% |
| kvk.HebusLeTroll 0.35 | 74 | 80% |
| jlm.javaDisturbance 0.59 | 69 | 74% |
| bigpete.Stewie 1.0 | 16 | 81% |
| yk.JahRoslav 1.1 | 4 | 75% |
| pbg.NinjaX 1.2 | 2 | 100% |
| tad.Dalek98 0.98 | 2 | 100% |
| gg.Squaraus 0.6 | 1 | 100% |

Hadur died in 158 of 350 rounds, at a mean tick of 979. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 63 | 40% | 137 |
| kvk.HebusLeTroll 0.35 | 44 | 28% | 82 |
| jlm.javaDisturbance 0.59 | 34 | 22% | 80 |
| bigpete.Stewie 1.0 | 8 | 5% | 25 |
| tad.Dalek98 0.98 | 3 | 2% | 5 |
| gg.Squaraus 0.6 | 2 | 1% | 5 |
| yk.JahRoslav 1.1 | 1 | 1% | 7 |
| pbg.NinjaX 1.2 | 0 | 0% | 5 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 332 rounds): 253080 melee ticks, 98890 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 39 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 0.

Targeting waves (332 rounds): 73674 sent, 66599 reached their opponent, 8699 virtual hits (13.1% of those reached).

## Melee bench: F23

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 347 over 10 battles (34.7 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.8 | 96.8 | 300 / 350 | 1.29 | 22.5% | 66827 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 22.5% | 300 |
| pe.SandboxLump 1.52 | 2.0 | 16.3% | 36 |
| cre.Karolos 0.32 | 3.0 | 13.8% | 11 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.2% | 1 |
| stelo.RamTrackSurfer 1.2 | 5.3 | 9.2% | 1 |
| cw.megas.Blade 0.8 | 6.4 | 8.1% | 1 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.5 | 8.0% | 0 |
| sample.Walls 1.0 | 7.8 | 6.9% | 0 |
| rrh.Iwillfindyou 2.0 | 9.2 | 2.9% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.9 | 99.4 | 34 / 35 | 6893 |
| 2 | 1 | 74.1 | 97.5 | 30 / 35 | 6707 |
| 3 | 1 | 73.6 | 94.6 | 28 / 35 | 6799 |
| 4 | 1 | 73.9 | 96.8 | 30 / 35 | 6635 |
| 5 | 1 | 74.0 | 97.8 | 31 / 35 | 6610 |
| 6 | 1 | 73.5 | 97.1 | 29 / 35 | 6369 |
| 7 | 1 | 72.5 | 93.0 | 27 / 35 | 6508 |
| 8 | 1 | 73.9 | 96.8 | 30 / 35 | 7125 |
| 9 | 1 | 73.9 | 96.8 | 29 / 35 | 6961 |
| 10 | 1 | 73.5 | 97.8 | 32 / 35 | 6220 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 177 | 90% |
| cre.Karolos 0.32 | 94 | 96% |
| stelo.AreaTargetingBot 1.1 | 19 | 100% |
| stelo.RamTrackSurfer 1.2 | 17 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 100% |
| cw.megas.Blade 0.8 | 6 | 100% |
| sample.Walls 1.0 | 3 | 100% |

Hadur died in 50 of 350 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 27 | 54% | 166 |
| cre.Karolos 0.32 | 16 | 32% | 86 |
| stelo.AreaTargetingBot 1.1 | 3 | 6% | 22 |
| stelo.RamTrackSurfer 1.2 | 2 | 4% | 36 |
| cw.megas.Blade 0.8 | 1 | 2% | 13 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 2% | 11 |
| sample.Walls 1.0 | 0 | 0% | 8 |

Posture (Hadur's M records, 330 rounds): 200506 melee ticks, 85539 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 69 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 69 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 1.

Targeting waves (330 rounds): 61956 sent, 53717 reached their opponent, 14774 virtual hits (27.5% of those reached).

## Melee bench: F24

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 351 over 10 battles (35.1 per battle, most in one battle 44). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 84.4 | 174 / 350 | 2.41 | 17.9% | 45466 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 17.9% | 174 |
| rz.GlowBlowMelee 1.4 | 2.4 | 13.9% | 44 |
| florent.XSeries.X2 0.12 | 3.3 | 13.2% | 44 |
| davidalves.Phoenix 0.54 | 3.6 | 12.6% | 49 |
| pedersen.Ugluk 1.1.1 | 4.9 | 11.6% | 28 |
| oog.melee.Corsair 1.0 | 5.9 | 9.5% | 9 |
| stelo.SoJNanoMelee 1.1 | 7.4 | 6.5% | 1 |
| lunchie.Lunchbox 0.93 | 8.0 | 5.6% | 1 |
| as.FrankTheTank 1.3 | 8.7 | 5.0% | 1 |
| evd.X1 0.01 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 86.0 | 20 / 35 | 4661 |
| 2 | 1 | 67.9 | 88.3 | 17 / 35 | 4475 |
| 3 | 1 | 67.9 | 86.0 | 19 / 35 | 4409 |
| 4 | 1 | 67.5 | 83.8 | 16 / 35 | 4619 |
| 5 | 1 | 68.0 | 84.8 | 19 / 35 | 4645 |
| 6 | 1 | 66.4 | 78.4 | 15 / 35 | 4756 |
| 7 | 1 | 67.4 | 85.1 | 19 / 35 | 4415 |
| 8 | 1 | 67.5 | 85.4 | 15 / 35 | 4535 |
| 9 | 1 | 66.0 | 80.3 | 15 / 35 | 4232 |
| 10 | 1 | 68.3 | 85.7 | 19 / 35 | 4719 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 76 | 82% |
| florent.XSeries.X2 0.12 | 45 | 73% |
| davidalves.Phoenix 0.54 | 44 | 68% |
| pedersen.Ugluk 1.1.1 | 36 | 67% |
| oog.melee.Corsair 1.0 | 16 | 81% |
| stelo.SoJNanoMelee 1.1 | 7 | 100% |
| lunchie.Lunchbox 0.93 | 3 | 100% |
| as.FrankTheTank 1.3 | 2 | 100% |

Hadur died in 178 of 350 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 43 | 24% | 97 |
| florent.XSeries.X2 0.12 | 43 | 24% | 76 |
| davidalves.Phoenix 0.54 | 36 | 20% | 66 |
| pedersen.Ugluk 1.1.1 | 27 | 15% | 43 |
| oog.melee.Corsair 1.0 | 13 | 7% | 38 |
| stelo.SoJNanoMelee 1.1 | 5 | 3% | 10 |
| evd.X1 0.01 | 5 | 3% | 5 |
| as.FrankTheTank 1.3 | 3 | 2% | 11 |
| lunchie.Lunchbox 0.93 | 2 | 1% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 332 rounds): 223597 melee ticks, 74804 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 63 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 1.

Targeting waves (332 rounds): 73019 sent, 64510 reached their opponent, 11263 virtual hits (17.5% of those reached).

## Melee bench: F25

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 382 over 10 battles (38.2 per battle, most in one battle 47). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 88.0 | 237 / 350 | 2.08 | 19.0% | 43204 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 19.0% | 237 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.6% | 26 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 13.1% | 21 |
| jdw.Hurricane 1.4 | 4.1 | 11.4% | 32 |
| gre.svman4.Morfeas 1.4.1 | 5.4 | 9.3% | 9 |
| ds.Oo 2.2 | 5.5 | 9.1% | 9 |
| adt.Ar2 1.1 | 7.5 | 7.1% | 7 |
| awesomeness.Elite 1.0 | 7.5 | 7.2% | 5 |
| gjr.Cephalosporin 0.1 | 9.0 | 6.0% | 4 |
| amk.ChumbaMini 0.2 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 86.7 | 21 / 35 | 4360 |
| 2 | 1 | 68.6 | 87.3 | 24 / 35 | 4074 |
| 3 | 1 | 70.5 | 94.9 | 30 / 35 | 4302 |
| 4 | 1 | 67.8 | 84.1 | 23 / 35 | 4243 |
| 5 | 1 | 69.4 | 90.2 | 25 / 35 | 4496 |
| 6 | 1 | 70.8 | 94.0 | 28 / 35 | 4801 |
| 7 | 1 | 68.6 | 88.3 | 22 / 35 | 4246 |
| 8 | 1 | 65.9 | 80.6 | 17 / 35 | 4087 |
| 9 | 1 | 68.4 | 85.7 | 23 / 35 | 4317 |
| 10 | 1 | 68.7 | 88.3 | 24 / 35 | 4278 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 84 | 92% |
| voidious.micro.BlitzBat 1.05 | 70 | 96% |
| jdw.Hurricane 1.4 | 48 | 90% |
| ds.Oo 2.2 | 25 | 96% |
| gre.svman4.Morfeas 1.4.1 | 12 | 83% |
| adt.Ar2 1.1 | 9 | 44% |
| awesomeness.Elite 1.0 | 7 | 86% |
| gjr.Cephalosporin 0.1 | 7 | 86% |

Hadur died in 114 of 350 rounds, at a mean tick of 602. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 26 | 23% | 93 |
| jdw.Hurricane 1.4 | 26 | 23% | 60 |
| voidious.micro.BlitzBat 1.05 | 17 | 15% | 63 |
| adt.Ar2 1.1 | 17 | 15% | 25 |
| ds.Oo 2.2 | 11 | 10% | 43 |
| gre.svman4.Morfeas 1.4.1 | 6 | 5% | 27 |
| awesomeness.Elite 1.0 | 6 | 5% | 21 |
| amk.ChumbaMini 0.2 | 3 | 3% | 4 |
| gjr.Cephalosporin 0.1 | 2 | 2% | 14 |

Posture (Hadur's M records, 331 rounds): 202206 melee ticks, 49000 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 39 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 2.

Targeting waves (331 rounds): 70855 sent, 62741 reached their opponent, 9874 virtual hits (15.7% of those reached).

## Melee bench: F26

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 451 over 10 battles (45.1 per battle, most in one battle 56). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 93.4 | 252 / 350 | 1.59 | 21.8% | 70632 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 21.8% | 252 |
| ak.Fermat 2.0 | 2.2 | 14.5% | 45 |
| shu.nitro.LENIN .T34 | 3.2 | 12.6% | 34 |
| lrem.Spectre 0.4.4 | 3.7 | 12.1% | 11 |
| js.PinBall 1.6 | 4.9 | 10.4% | 4 |
| jaybot.adv.bots.JayBot 2.0 | 6.2 | 9.1% | 1 |
| gh.mini.GrubbmOne 1.0 | 6.8 | 8.1% | 3 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.3% | 0 |
| sample.SpinBot 1.0 | 9.0 | 3.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 92.4 | 25 / 35 | 7300 |
| 2 | 1 | 72.8 | 94.0 | 24 / 35 | 6801 |
| 3 | 1 | 73.1 | 93.0 | 23 / 35 | 7364 |
| 4 | 1 | 72.7 | 93.0 | 25 / 35 | 6903 |
| 5 | 1 | 73.2 | 94.9 | 27 / 35 | 6720 |
| 6 | 1 | 72.6 | 91.7 | 26 / 35 | 6986 |
| 7 | 1 | 73.3 | 93.0 | 25 / 35 | 7401 |
| 8 | 1 | 74.0 | 96.2 | 27 / 35 | 7786 |
| 9 | 1 | 73.0 | 94.3 | 26 / 35 | 6823 |
| 10 | 1 | 71.8 | 91.7 | 24 / 35 | 6548 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 103 | 80% |
| shu.nitro.LENIN .T34 | 90 | 84% |
| lrem.Spectre 0.4.4 | 71 | 92% |
| js.PinBall 1.6 | 12 | 83% |
| jaybot.adv.bots.JayBot 2.0 | 10 | 90% |
| fullsail.LaxativeTeaTwo 1.0 | 6 | 100% |
| gh.mini.GrubbmOne 1.0 | 4 | 100% |

Hadur died in 98 of 350 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 39 | 40% | 106 |
| shu.nitro.LENIN .T34 | 27 | 28% | 120 |
| lrem.Spectre 0.4.4 | 11 | 11% | 65 |
| jaybot.adv.bots.JayBot 2.0 | 10 | 10% | 19 |
| js.PinBall 1.6 | 8 | 8% | 21 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 2% | 10 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 8 |

Posture (Hadur's M records, 330 rounds): 256391 melee ticks, 80735 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 42 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 0.

Targeting waves (330 rounds): 79868 sent, 71932 reached their opponent, 17139 virtual hits (23.8% of those reached).

## Melee bench: F27

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 388 over 10 battles (38.8 per battle, most in one battle 51). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 82.4 | 241 / 350 | 2.59 | 19.1% | 54545 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.2 | 19.1% | 241 |
| mk.Alpha 0.2.1 | 2.0 | 14.2% | 66 |
| EH.Eagle 1.0.6 | 3.0 | 11.3% | 8 |
| techdude.kombat.FlamingKombat 1.5 | 5.4 | 9.3% | 2 |
| wee.Gem 1.8.4 | 5.4 | 9.4% | 22 |
| sheldor.melee.nano.TestMelee 0.1 | 5.9 | 9.1% | 10 |
| joe.ADinosaur 1.0 | 6.9 | 8.0% | 1 |
| throxbot.ThroxBot 0.1 | 7.6 | 7.8% | 1 |
| caimano.Furia_Ceca 0.22 | 8.1 | 6.9% | 0 |
| cs.Grudge 1.0 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 94.9 | 31 / 35 | 5845 |
| 2 | 2 | 61.6 | 57.5 | 14 / 35 | 5170 |
| 3 | 1 | 70.9 | 94.0 | 27 / 35 | 5435 |
| 4 | 1 | 71.0 | 94.3 | 30 / 35 | 5385 |
| 5 | 1 | 72.0 | 96.8 | 32 / 35 | 5544 |
| 6 | 2 | 61.0 | 60.0 | 14 / 35 | 4723 |
| 7 | 1 | 63.1 | 64.4 | 15 / 35 | 5015 |
| 8 | 1 | 72.5 | 98.7 | 32 / 35 | 5917 |
| 9 | 1 | 71.2 | 93.3 | 28 / 35 | 5697 |
| 10 | 1 | 66.1 | 69.8 | 18 / 35 | 5814 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 134 | 90% |
| EH.Eagle 1.0.6 | 49 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 17 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 93% |
| throxbot.ThroxBot 0.1 | 14 | 100% |
| wee.Gem 1.8.4 | 11 | 91% |
| joe.ADinosaur 1.0 | 7 | 100% |
| caimano.Furia_Ceca 0.22 | 7 | 100% |

Hadur died in 109 of 350 rounds, at a mean tick of 486. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cs.Grudge 1.0 | 27 | 25% | 28 |
| mk.Alpha 0.2.1 | 26 | 24% | 128 |
| throxbot.ThroxBot 0.1 | 13 | 12% | 32 |
| EH.Eagle 1.0.6 | 10 | 9% | 56 |
| wee.Gem 1.8.4 | 8 | 7% | 24 |
| joe.ADinosaur 1.0 | 8 | 7% | 20 |
| caimano.Furia_Ceca 0.22 | 7 | 6% | 16 |
| sheldor.melee.nano.TestMelee 0.1 | 6 | 6% | 23 |
| techdude.kombat.FlamingKombat 1.5 | 4 | 4% | 22 |

Posture (Hadur's M records, 334 rounds): 197263 melee ticks, 55023 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (334 rounds): longest scan gap while four or more were alive 54 ticks (334 rounds over 8); rounds whose longest gap at any count was over 8: 334; robots dropped as dead without a death event: 0.

Targeting waves (334 rounds): 63801 sent, 55832 reached their opponent, 13276 virtual hits (23.8% of those reached).

## Melee bench: F28

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 380 over 10 battles (38.0 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 90.7 | 235 / 350 | 1.84 | 19.3% | 44867 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 19.3% | 235 |
| kid.test.NightFox .2 | 2.0 | 14.8% | 51 |
| uji.Antique 1.0 | 3.0 | 12.2% | 31 |
| pfvicm.Sobieski 7.2.3b | 4.4 | 10.4% | 5 |
| qohnil.blot.BlotBot 3.61 | 4.6 | 10.3% | 17 |
| ahr.ice.Ice 1.0.2 | 6.4 | 8.2% | 7 |
| amk.ChumbaWumba 0.3 | 6.7 | 7.9% | 5 |
| matt.advanced.Katana 1.0 | 8.5 | 5.9% | 0 |
| stelo.Lifestealer 1.0 | 8.9 | 5.6% | 0 |
| stelo.PianistNano 1.2 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 90.2 | 24 / 35 | 4457 |
| 2 | 1 | 69.3 | 91.4 | 24 / 35 | 4393 |
| 3 | 1 | 68.2 | 89.2 | 23 / 35 | 4203 |
| 4 | 1 | 69.7 | 93.0 | 25 / 35 | 4541 |
| 5 | 1 | 69.6 | 92.7 | 25 / 35 | 4400 |
| 6 | 1 | 69.5 | 89.8 | 23 / 35 | 4887 |
| 7 | 1 | 69.2 | 92.1 | 24 / 35 | 4403 |
| 8 | 1 | 68.9 | 89.2 | 25 / 35 | 4273 |
| 9 | 1 | 68.5 | 88.6 | 21 / 35 | 4520 |
| 10 | 1 | 69.3 | 90.5 | 21 / 35 | 4790 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 137 | 83% |
| uji.Antique 1.0 | 78 | 90% |
| qohnil.blot.BlotBot 3.61 | 20 | 75% |
| pfvicm.Sobieski 7.2.3b | 13 | 92% |
| amk.ChumbaWumba 0.3 | 12 | 75% |
| ahr.ice.Ice 1.0.2 | 10 | 90% |
| matt.advanced.Katana 1.0 | 5 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 116 of 350 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 31 | 27% | 78 |
| uji.Antique 1.0 | 23 | 20% | 95 |
| pfvicm.Sobieski 7.2.3b | 21 | 18% | 48 |
| amk.ChumbaWumba 0.3 | 18 | 16% | 31 |
| qohnil.blot.BlotBot 3.61 | 13 | 11% | 49 |
| ahr.ice.Ice 1.0.2 | 6 | 5% | 22 |
| stelo.PianistNano 1.2 | 2 | 2% | 7 |
| matt.advanced.Katana 1.0 | 1 | 1% | 15 |
| stelo.Lifestealer 1.0 | 1 | 1% | 3 |

Posture (Hadur's M records, 331 rounds): 214124 melee ticks, 68228 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 70 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 1.

Targeting waves (331 rounds): 70177 sent, 62077 reached their opponent, 8534 virtual hits (13.7% of those reached).

## Melee bench: F29

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 371 over 10 battles (37.1 per battle, most in one battle 44). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 90.5 | 225 / 350 | 1.85 | 20.2% | 51335 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 20.2% | 225 |
| zyx.mega.YersiniaPestis 3.1 | 2.6 | 14.6% | 54 |
| deewiant.Anomaly 0.2 | 2.8 | 14.3% | 47 |
| myl.micro.Troodon 1.10 | 3.7 | 12.1% | 14 |
| jok.PheonixM 0.1.2 | 4.9 | 10.3% | 6 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.4% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 7.2 | 6.1% | 0 |
| DBall.Anarchy 0.1 | 8.0 | 5.6% | 2 |
| ap.Frederick 1.1 | 9.3 | 4.2% | 1 |
| jangs.ns51 1.0 | 9.5 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 93.3 | 23 / 35 | 5246 |
| 2 | 1 | 70.2 | 87.6 | 23 / 35 | 4963 |
| 3 | 1 | 72.1 | 92.1 | 24 / 35 | 5866 |
| 4 | 1 | 71.4 | 91.1 | 24 / 35 | 5451 |
| 5 | 1 | 71.4 | 92.4 | 23 / 35 | 5105 |
| 6 | 1 | 69.5 | 86.7 | 20 / 35 | 4858 |
| 7 | 1 | 70.4 | 89.5 | 22 / 35 | 4832 |
| 8 | 1 | 71.1 | 91.7 | 24 / 35 | 4955 |
| 9 | 1 | 71.4 | 91.7 | 23 / 35 | 5222 |
| 10 | 1 | 69.8 | 88.9 | 19 / 35 | 4837 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 110 | 80% |
| zyx.mega.YersiniaPestis 3.1 | 90 | 79% |
| myl.micro.Troodon 1.10 | 39 | 90% |
| jok.PheonixM 0.1.2 | 24 | 92% |
| DBall.Anarchy 0.1 | 4 | 100% |
| jangs.ns51 1.0 | 2 | 50% |
| ph.melee.ArcherME 0.3 | 2 | 100% |
| ap.Frederick 1.1 | 2 | 100% |

Hadur died in 127 of 350 rounds, at a mean tick of 965. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 52 | 41% | 141 |
| zyx.mega.YersiniaPestis 3.1 | 38 | 30% | 110 |
| myl.micro.Troodon 1.10 | 17 | 13% | 45 |
| ph.melee.ArcherME 0.3 | 7 | 6% | 15 |
| jok.PheonixM 0.1.2 | 6 | 5% | 26 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 2% | 5 |
| jangs.ns51 1.0 | 2 | 2% | 2 |
| DBall.Anarchy 0.1 | 1 | 1% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 333 rounds): 273104 melee ticks, 116389 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 40 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 0.

Targeting waves (333 rounds): 86527 sent, 78530 reached their opponent, 11233 virtual hits (14.3% of those reached).

## Melee bench: F30

hadur117.Hadur 3.24en against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 312 over 10 battles (31.2 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 79.8 | 123 / 350 | 2.61 | 18.4% | 43515 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.1 | 18.4% | 123 |
| darkcanuck.B26354 1.06 | 2.6 | 15.3% | 85 |
| oog.melee.Capulet 1.2 | 2.7 | 15.1% | 68 |
| stelo.PastFuture 2.3.2 | 3.6 | 13.9% | 41 |
| intruder.PrairieWolf 2.61 | 5.2 | 10.2% | 24 |
| tripphippy.Alice 1.1 | 5.8 | 9.1% | 3 |
| ntc.Opposite 1.5 | 7.3 | 8.1% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 7.7 | 7.3% | 4 |
| GarmBox.Anger 1.0 | 9.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 76.1 | 11 / 35 | 4170 |
| 2 | 1 | 65.6 | 80.4 | 16 / 35 | 4108 |
| 3 | 1 | 68.2 | 86.1 | 18 / 35 | 4634 |
| 4 | 1 | 67.6 | 85.4 | 13 / 35 | 4653 |
| 5 | 1 | 67.3 | 84.3 | 16 / 35 | 4417 |
| 6 | 1 | 63.3 | 73.6 | 6 / 35 | 4253 |
| 7 | 1 | 64.0 | 72.9 | 9 / 35 | 4309 |
| 8 | 1 | 67.6 | 84.3 | 14 / 35 | 4662 |
| 9 | 1 | 66.6 | 80.7 | 14 / 35 | 4509 |
| 10 | 2 | 62.8 | 74.6 | 6 / 35 | 3800 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 65 | 48% |
| oog.melee.Capulet 1.2 | 61 | 56% |
| stelo.PastFuture 2.3.2 | 42 | 60% |
| intruder.PrairieWolf 2.61 | 24 | 58% |
| tripphippy.Alice 1.1 | 17 | 94% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 67% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 227 of 350 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 70 | 31% | 102 |
| stelo.PastFuture 2.3.2 | 46 | 20% | 71 |
| oog.melee.Capulet 1.2 | 40 | 18% | 79 |
| intruder.PrairieWolf 2.61 | 24 | 11% | 34 |
| tripphippy.Alice 1.1 | 20 | 9% | 30 |
| fowl3628800.LightningBolt 2.6.0 | 15 | 7% | 18 |
| ntc.Opposite 1.5 | 12 | 5% | 16 |

Posture (Hadur's M records, 333 rounds): 258409 melee ticks, 69673 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 90 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 90 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 0.

Targeting waves (333 rounds): 75299 sent, 68087 reached their opponent, 11244 virtual hits (16.5% of those reached).

## Melee bench: F31

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 301 over 10 battles (30.1 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 80.2 | 121 / 350 | 2.78 | 16.5% | 39930 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.2 | 18.1% | 151 |
| hadur117.Hadur 3.24en | 1.8 | 16.5% | 121 |
| gh.mini.Griezel 0.2 | 3.4 | 12.8% | 54 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.1% | 12 |
| spinnercat.micro.Tyger 0.1 | 4.6 | 10.6% | 6 |
| gh.nano.Grofvuil 0.2 | 5.7 | 9.1% | 5 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.8% | 2 |
| fm.mammillarias 1.3 | 8.3 | 5.3% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.0% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.3 | 83.8 | 14 / 35 | 4452 |
| 2 | 2 | 64.7 | 78.4 | 11 / 35 | 3639 |
| 3 | 2 | 64.2 | 76.2 | 12 / 35 | 3826 |
| 4 | 2 | 64.7 | 79.4 | 9 / 35 | 3742 |
| 5 | 2 | 63.8 | 76.8 | 10 / 35 | 3589 |
| 6 | 2 | 64.8 | 78.7 | 9 / 35 | 3819 |
| 7 | 2 | 65.3 | 78.1 | 14 / 35 | 4071 |
| 8 | 2 | 65.5 | 80.0 | 10 / 35 | 3875 |
| 9 | 1 | 66.7 | 82.9 | 14 / 35 | 4326 |
| 10 | 1 | 68.5 | 87.9 | 18 / 35 | 4591 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 106 | 56% |
| gh.mini.Griezel 0.2 | 44 | 70% |
| d414.nano.Quantum 1.0.0 | 20 | 85% |
| spinnercat.micro.Tyger 0.1 | 10 | 80% |
| gh.nano.Grofvuil 0.2 | 6 | 83% |
| timmit.nano.TimDog 0.33 | 2 | 50% |

Hadur died in 230 of 350 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 88 | 38% | 144 |
| gh.mini.Griezel 0.2 | 54 | 23% | 89 |
| spinnercat.micro.Tyger 0.1 | 30 | 13% | 36 |
| d414.nano.Quantum 1.0.0 | 23 | 10% | 35 |
| gh.nano.Grofvuil 0.2 | 20 | 9% | 26 |
| timmit.nano.TimDog 0.33 | 7 | 3% | 11 |
| fm.mammillarias 1.3 | 4 | 2% | 4 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 3 |
| tlp.ThreeLeggedPig 1 | 1 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 335 rounds): 247844 melee ticks, 61366 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (335 rounds): longest scan gap while four or more were alive 64 ticks (335 rounds over 8); rounds whose longest gap at any count was over 8: 335; robots dropped as dead without a death event: 0.

Targeting waves (335 rounds): 79156 sent, 70655 reached their opponent, 10971 virtual hits (15.5% of those reached).

## Melee bench: F32

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 358 over 10 battles (35.8 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 91.0 | 248 / 350 | 1.81 | 19.6% | 49347 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 19.6% | 248 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.4% | 51 |
| apc.botM 3.0 | 3.4 | 11.5% | 16 |
| lxx.ConceptA 0.8 | 3.9 | 10.5% | 7 |
| vjik.UnViolation 1.1 | 5.0 | 9.7% | 14 |
| bayen.UbaMicro 1.4 | 6.1 | 8.9% | 5 |
| panzer.Panzer 0.2 | 7.4 | 7.3% | 1 |
| yk.JahMicro 1.0 | 7.5 | 7.0% | 6 |
| conscience.Electron 1.3g | 8.7 | 6.4% | 0 |
| donjezza.Jezza 1.0 | 10.0 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 94.6 | 26 / 35 | 5231 |
| 2 | 1 | 68.5 | 89.5 | 24 / 35 | 4637 |
| 3 | 1 | 69.3 | 88.3 | 24 / 35 | 5331 |
| 4 | 1 | 69.7 | 92.1 | 27 / 35 | 4840 |
| 5 | 1 | 70.1 | 94.0 | 27 / 35 | 4858 |
| 6 | 1 | 69.1 | 91.4 | 24 / 35 | 4741 |
| 7 | 1 | 70.0 | 92.4 | 27 / 35 | 4992 |
| 8 | 1 | 68.4 | 90.2 | 21 / 35 | 4650 |
| 9 | 1 | 70.0 | 93.7 | 25 / 35 | 5099 |
| 10 | 1 | 67.6 | 84.4 | 23 / 35 | 4968 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 152 | 78% |
| apc.botM 3.0 | 41 | 88% |
| lxx.ConceptA 0.8 | 37 | 89% |
| vjik.UnViolation 1.1 | 21 | 90% |
| bayen.UbaMicro 1.4 | 20 | 95% |
| yk.JahMicro 1.0 | 10 | 80% |
| donjezza.Jezza 1.0 | 8 | 88% |
| panzer.Panzer 0.2 | 6 | 100% |

Hadur died in 104 of 350 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 38 | 37% | 148 |
| lxx.ConceptA 0.8 | 18 | 17% | 33 |
| apc.botM 3.0 | 16 | 15% | 54 |
| bayen.UbaMicro 1.4 | 14 | 13% | 34 |
| panzer.Panzer 0.2 | 6 | 6% | 12 |
| vjik.UnViolation 1.1 | 4 | 4% | 39 |
| yk.JahMicro 1.0 | 4 | 4% | 16 |
| conscience.Electron 1.3g | 3 | 3% | 5 |
| donjezza.Jezza 1.0 | 1 | 1% | 7 |

Posture (Hadur's M records, 330 rounds): 199682 melee ticks, 91816 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 109 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 109 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 0.

Targeting waves (330 rounds): 66939 sent, 58836 reached their opponent, 10118 virtual hits (17.2% of those reached).

## Melee bench: F33

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 392 over 10 battles (39.2 per battle, most in one battle 48). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 89.8 | 218 / 350 | 1.91 | 19.9% | 52014 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 19.9% | 218 |
| maribo.Quester 0.3 | 2.0 | 15.9% | 57 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.6 | 12.3% | 28 |
| gre.svman4.Leonidas 1.3.2 | 3.7 | 11.5% | 19 |
| labg.Cataclysm 2.05 | 4.7 | 10.5% | 21 |
| baal.nano.N 1.42 | 6.4 | 8.7% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.6 | 8.1% | 6 |
| zyx.micro.Ant 1.1 | 8.5 | 5.3% | 0 |
| sanja.First 0.1 | 8.5 | 4.9% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 92.7 | 25 / 35 | 5269 |
| 2 | 1 | 68.9 | 86.3 | 18 / 35 | 5054 |
| 3 | 1 | 71.8 | 94.3 | 24 / 35 | 5440 |
| 4 | 1 | 72.0 | 94.0 | 26 / 35 | 5438 |
| 5 | 1 | 70.6 | 89.2 | 24 / 35 | 5285 |
| 6 | 1 | 69.5 | 87.3 | 17 / 35 | 4878 |
| 7 | 1 | 69.8 | 88.9 | 19 / 35 | 5051 |
| 8 | 1 | 70.4 | 90.8 | 20 / 35 | 5043 |
| 9 | 1 | 70.4 | 88.6 | 24 / 35 | 5390 |
| 10 | 1 | 69.7 | 86.3 | 21 / 35 | 5166 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 119 | 87% |
| gre.svman4.Leonidas 1.3.2 | 52 | 90% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 47 | 81% |
| labg.Cataclysm 2.05 | 29 | 62% |
| baal.nano.N 1.42 | 4 | 100% |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 100% |
| zyx.micro.Ant 1.1 | 2 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 134 of 350 rounds, at a mean tick of 974. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 48 | 36% | 139 |
| gre.svman4.Leonidas 1.3.2 | 26 | 19% | 51 |
| labg.Cataclysm 2.05 | 21 | 16% | 54 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 14% | 62 |
| kinsen.melee.Angsaichmophobia 1.8c | 11 | 8% | 17 |
| zyx.micro.Ant 1.1 | 4 | 3% | 8 |
| baal.nano.N 1.42 | 2 | 1% | 9 |
| sanja.First 0.1 | 2 | 1% | 6 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 331 rounds): 279233 melee ticks, 97425 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 72 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 1.

Targeting waves (331 rounds): 87450 sent, 79363 reached their opponent, 10825 virtual hits (13.6% of those reached).

## Melee bench: F34

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 287 over 10 battles (28.7 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 89.7 | 191 / 350 | 1.93 | 19.6% | 56274 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 19.6% | 191 |
| stelo.Spread 0.9 | 2.4 | 16.2% | 74 |
| kid.Gladiator .7.2 | 2.6 | 16.2% | 62 |
| jcs.Seth 1.8 | 4.4 | 10.9% | 15 |
| tcf.Reach 3 | 4.6 | 10.8% | 8 |
| cli.Dancer 1.1 | 6.0 | 8.9% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 6.9% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.8% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.1% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 88.3 | 18 / 35 | 5439 |
| 2 | 1 | 70.0 | 87.6 | 14 / 35 | 5728 |
| 3 | 1 | 70.7 | 90.5 | 18 / 35 | 5494 |
| 4 | 1 | 69.3 | 84.8 | 16 / 35 | 5405 |
| 5 | 1 | 70.7 | 89.8 | 18 / 35 | 5621 |
| 6 | 1 | 70.7 | 90.8 | 19 / 35 | 5618 |
| 7 | 1 | 71.5 | 91.4 | 24 / 35 | 5863 |
| 8 | 1 | 71.4 | 92.4 | 21 / 35 | 5882 |
| 9 | 1 | 71.6 | 91.7 | 20 / 35 | 5805 |
| 10 | 1 | 70.6 | 89.2 | 23 / 35 | 5419 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 112 | 70% |
| kid.Gladiator .7.2 | 106 | 73% |
| jcs.Seth 1.8 | 24 | 75% |
| tcf.Reach 3 | 15 | 87% |
| ratosh.Wesco 1.4 | 2 | 100% |
| cli.Dancer 1.1 | 2 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 160 of 350 rounds, at a mean tick of 1013. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 65 | 41% | 131 |
| stelo.Spread 0.9 | 54 | 34% | 133 |
| tcf.Reach 3 | 17 | 11% | 36 |
| jcs.Seth 1.8 | 14 | 9% | 35 |
| cli.Dancer 1.1 | 4 | 3% | 6 |
| amk.Punbot.Punbot 0.01 | 3 | 2% | 3 |
| ratosh.Wesco 1.4 | 2 | 1% | 3 |
| sample.VelociRobot 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 332 rounds): 275860 melee ticks, 136028 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 63 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 0.

Targeting waves (332 rounds): 82738 sent, 74494 reached their opponent, 11766 virtual hits (15.8% of those reached).

## Melee bench: F35

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 278 over 10 battles (27.8 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 84.9 | 117 / 350 | 2.36 | 17.1% | 41734 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.1 | 18.9% | 188 |
| hadur117.Hadur 3.24en | 1.9 | 17.1% | 117 |
| gh.mini.Gruwel 0.9 | 3.2 | 12.9% | 27 |
| rz.HawkOnFire 0.1 | 4.4 | 11.9% | 5 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.4 | 11.6% | 14 |
| wit.Chuliath 1.0 | 6.6 | 6.4% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6.8 | 6.1% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.1 | 5.4% | 0 |
| dans.Cinnamon 1.2 | 9.0 | 4.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.2 | 83.2 | 10 / 35 | 3968 |
| 2 | 2 | 67.4 | 84.8 | 14 / 35 | 4198 |
| 3 | 2 | 66.4 | 85.4 | 10 / 35 | 3936 |
| 4 | 2 | 66.7 | 84.1 | 11 / 35 | 4187 |
| 5 | 2 | 68.0 | 85.7 | 15 / 35 | 4243 |
| 6 | 2 | 66.6 | 84.8 | 8 / 35 | 4214 |
| 7 | 2 | 66.6 | 85.7 | 9 / 35 | 4269 |
| 8 | 2 | 65.5 | 80.6 | 10 / 35 | 3921 |
| 9 | 2 | 66.7 | 83.8 | 12 / 35 | 4301 |
| 10 | 1 | 69.0 | 90.8 | 18 / 35 | 4497 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 163 | 39% |
| gh.mini.Gruwel 0.9 | 35 | 66% |
| dmh.robocode.robot.BlackDeath 9.2 | 20 | 80% |
| rz.HawkOnFire 0.1 | 14 | 93% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 233 of 350 rounds, at a mean tick of 1030. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 140 | 60% | 208 |
| dmh.robocode.robot.BlackDeath 9.2 | 33 | 14% | 43 |
| gh.mini.Gruwel 0.9 | 32 | 14% | 55 |
| rz.HawkOnFire 0.1 | 20 | 9% | 32 |
| wit.Chuliath 1.0 | 3 | 1% | 3 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 3 |
| dans.Cinnamon 1.2 | 2 | 1% | 3 |
| myl.nano.KomoriNinja 1.1 | 1 | 0% | 3 |

Posture (Hadur's M records, 334 rounds): 240346 melee ticks, 160599 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 28 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (334 rounds): longest scan gap while four or more were alive 28 ticks (334 rounds over 8); rounds whose longest gap at any count was over 8: 334; robots dropped as dead without a death event: 0.

Targeting waves (334 rounds): 73037 sent, 64654 reached their opponent, 9524 virtual hits (14.7% of those reached).

## Melee bench: F36

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 425 over 10 battles (42.5 per battle, most in one battle 49). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 92.7 | 273 / 350 | 1.66 | 21.4% | 58695 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 21.4% | 273 |
| bzdp.Pansy 2.1 | 2.5 | 12.2% | 11 |
| alpha.RainingFire 1.0 | 2.9 | 12.3% | 28 |
| bvh.micro.Freya 0.3 | 5.1 | 10.6% | 11 |
| mz.Cork 0.1 | 5.2 | 10.4% | 9 |
| m3thos.Eva02 0.7.1 | 5.6 | 10.0% | 11 |
| bvh.mini.Fenrir 0.39 | 5.7 | 9.7% | 6 |
| dl.BetterWalls 1.0 | 8.2 | 5.3% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.8 | 4.8% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 88.9 | 26 / 35 | 5583 |
| 2 | 1 | 72.8 | 94.9 | 29 / 35 | 6161 |
| 3 | 1 | 71.5 | 93.3 | 26 / 35 | 5559 |
| 4 | 1 | 73.4 | 97.1 | 30 / 35 | 6288 |
| 5 | 1 | 69.9 | 87.0 | 23 / 35 | 5511 |
| 6 | 1 | 71.3 | 89.5 | 27 / 35 | 5872 |
| 7 | 1 | 71.2 | 91.1 | 27 / 35 | 5767 |
| 8 | 1 | 72.8 | 97.5 | 29 / 35 | 6010 |
| 9 | 1 | 72.5 | 94.0 | 28 / 35 | 5877 |
| 10 | 1 | 72.3 | 93.7 | 28 / 35 | 6067 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 82 | 98% |
| bvh.micro.Freya 0.3 | 61 | 93% |
| alpha.RainingFire 1.0 | 50 | 88% |
| mz.Cork 0.1 | 43 | 95% |
| m3thos.Eva02 0.7.1 | 29 | 86% |
| bvh.mini.Fenrir 0.39 | 24 | 92% |
| dl.BetterWalls 1.0 | 3 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 77 of 350 rounds, at a mean tick of 729. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 27 | 35% | 74 |
| bvh.micro.Freya 0.3 | 11 | 14% | 55 |
| m3thos.Eva02 0.7.1 | 11 | 14% | 44 |
| bvh.mini.Fenrir 0.39 | 11 | 14% | 32 |
| bzdp.Pansy 2.1 | 10 | 13% | 71 |
| mz.Cork 0.1 | 5 | 6% | 51 |
| dl.BetterWalls 1.0 | 1 | 1% | 13 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 6 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 3 |

Posture (Hadur's M records, 330 rounds): 228685 melee ticks, 78447 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 42 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 2.

Targeting waves (330 rounds): 77766 sent, 69988 reached their opponent, 13576 virtual hits (19.4% of those reached).

## Melee bench: F37

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 462 over 10 battles (46.2 per battle, most in one battle 54). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 89.8 | 279 / 350 | 1.92 | 20.1% | 60223 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 20.1% | 279 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.4 | 11.0% | 16 |
| germ.TheMind .2 | 4.1 | 9.7% | 8 |
| EBBU.Sim2 1.02 | 4.6 | 9.5% | 6 |
| agrach.Dalek 1.0 | 5.2 | 9.1% | 12 |
| stelo.UntouchableNano 1.3 | 6.4 | 8.7% | 10 |
| mb.Beast 0.1 | 7.3 | 8.2% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 7.4 | 8.1% | 1 |
| lmk.ACPFinal 0.1 | 7.6 | 8.0% | 8 |
| skm.Ryubot 1.0 | 9.0 | 7.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 96.5 | 31 / 35 | 6583 |
| 2 | 1 | 69.2 | 88.6 | 26 / 35 | 6081 |
| 3 | 1 | 70.6 | 94.0 | 30 / 35 | 6358 |
| 4 | 1 | 69.9 | 90.8 | 29 / 35 | 6157 |
| 5 | 1 | 70.0 | 91.1 | 29 / 35 | 6191 |
| 6 | 1 | 68.7 | 87.6 | 26 / 35 | 5863 |
| 7 | 1 | 69.2 | 90.8 | 26 / 35 | 5783 |
| 8 | 1 | 67.9 | 86.0 | 26 / 35 | 5463 |
| 9 | 1 | 67.3 | 81.9 | 25 / 35 | 5693 |
| 10 | 1 | 70.0 | 90.8 | 31 / 35 | 6051 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.UntouchableNano 1.3 | 48 | 92% |
| agrach.Dalek 1.0 | 47 | 98% |
| com.syncleus.robocode.Dreadnaught 0.1 | 44 | 95% |
| EBBU.Sim2 1.02 | 33 | 97% |
| mb.Beast 0.1 | 33 | 97% |
| germ.TheMind .2 | 33 | 100% |
| skm.Ryubot 1.0 | 29 | 97% |
| lmk.ACPFinal 0.1 | 23 | 96% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 0% |

Hadur died in 72 of 350 rounds, at a mean tick of 392. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 18 | 25% | 72 |
| mn.nano.perceptual.Impact 1.3.0 | 17 | 24% | 22 |
| agrach.Dalek 1.0 | 8 | 11% | 67 |
| lmk.ACPFinal 0.1 | 8 | 11% | 33 |
| EBBU.Sim2 1.02 | 7 | 10% | 39 |
| stelo.UntouchableNano 1.3 | 6 | 8% | 44 |
| germ.TheMind .2 | 4 | 6% | 33 |
| mb.Beast 0.1 | 3 | 4% | 33 |
| skm.Ryubot 1.0 | 1 | 1% | 5 |

Posture (Hadur's M records, 331 rounds): 155954 melee ticks, 43505 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 64 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 0.

Targeting waves (331 rounds): 51706 sent, 43969 reached their opponent, 12010 virtual hits (27.3% of those reached).

## Melee bench: F38

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 331 over 10 battles (33.1 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 89.5 | 214 / 350 | 1.95 | 19.2% | 49146 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 19.2% | 214 |
| justin.Mallais 14.0 | 2.1 | 15.6% | 79 |
| bvh.mini.Freya 0.55 | 2.9 | 13.0% | 23 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.5% | 21 |
| cs.Wren 1.0 | 5.0 | 10.3% | 7 |
| kdf.KoulDestroyer 1.0 | 5.8 | 9.3% | 3 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.2 | 7.6% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.7 | 6.3% | 1 |
| matt.UnderDark3 2.4.34 | 9.3 | 3.6% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 95.2 | 28 / 35 | 5363 |
| 2 | 1 | 70.0 | 90.2 | 21 / 35 | 5272 |
| 3 | 1 | 69.1 | 89.2 | 20 / 35 | 4998 |
| 4 | 1 | 68.6 | 86.0 | 19 / 35 | 4691 |
| 5 | 1 | 69.0 | 89.8 | 22 / 35 | 4535 |
| 6 | 1 | 68.7 | 87.0 | 19 / 35 | 4882 |
| 7 | 1 | 70.5 | 92.1 | 23 / 35 | 4861 |
| 8 | 1 | 69.2 | 89.5 | 21 / 35 | 4829 |
| 9 | 1 | 69.0 | 88.3 | 22 / 35 | 4722 |
| 10 | 1 | 69.0 | 87.6 | 19 / 35 | 4993 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 127 | 77% |
| bts.mega.Gnarly 1.4 | 41 | 78% |
| bvh.mini.Freya 0.55 | 40 | 78% |
| cs.Wren 1.0 | 33 | 94% |
| kdf.KoulDestroyer 1.0 | 18 | 94% |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 100% |
| matt.UnderDark3 2.4.34 | 2 | 100% |

Hadur died in 138 of 350 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 63 | 46% | 158 |
| bvh.mini.Freya 0.55 | 24 | 17% | 47 |
| bts.mega.Gnarly 1.4 | 21 | 15% | 72 |
| cs.Wren 1.0 | 11 | 8% | 32 |
| kdf.KoulDestroyer 1.0 | 10 | 7% | 18 |
| matt.UnderDark3 2.4.34 | 4 | 3% | 5 |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 2% | 12 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 3 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 331 rounds): 227199 melee ticks, 73238 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 40 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 1.

Targeting waves (331 rounds): 73025 sent, 64672 reached their opponent, 12567 virtual hits (19.4% of those reached).

## Melee bench: F39

hadur117.Hadur 3.24en against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 314 over 10 battles (31.4 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 93.5 | 255 / 350 | 1.52 | 23.2% | 60045 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 23.2% | 255 |
| bvh.fry.Freya 0.82 | 2.3 | 15.7% | 22 |
| az.Ololobot 0.2.4 | 2.7 | 14.6% | 67 |
| winamp32.micro.MicroMacro 1.0 | 4.5 | 9.7% | 3 |
| apollokidd.ApolloKidd 0.9 | 5.4 | 8.6% | 0 |
| gimp.GimpBot 0.1 | 5.8 | 8.5% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 6.4 | 7.8% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.1 | 6.2% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.8 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 91.4 | 22 / 35 | 5927 |
| 2 | 1 | 71.1 | 91.4 | 26 / 35 | 5916 |
| 3 | 1 | 72.2 | 94.6 | 27 / 35 | 6175 |
| 4 | 1 | 71.1 | 92.5 | 25 / 35 | 5833 |
| 5 | 1 | 72.8 | 97.1 | 29 / 35 | 6360 |
| 6 | 1 | 72.4 | 97.1 | 29 / 35 | 6117 |
| 7 | 1 | 71.7 | 93.2 | 22 / 35 | 6098 |
| 8 | 1 | 71.2 | 92.1 | 23 / 35 | 5985 |
| 9 | 1 | 70.2 | 92.1 | 25 / 35 | 5641 |
| 10 | 1 | 71.8 | 93.6 | 27 / 35 | 5993 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 157 | 77% |
| bvh.fry.Freya 0.82 | 100 | 91% |
| winamp32.micro.MicroMacro 1.0 | 18 | 89% |
| stelo.SoRobotNanoMelee 1.2 | 12 | 92% |
| gimp.GimpBot 0.1 | 9 | 100% |
| apollokidd.ApolloKidd 0.9 | 4 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 95 of 350 rounds, at a mean tick of 1138. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 45 | 47% | 170 |
| bvh.fry.Freya 0.82 | 25 | 26% | 92 |
| winamp32.micro.MicroMacro 1.0 | 11 | 12% | 32 |
| apollokidd.ApolloKidd 0.9 | 4 | 4% | 13 |
| stelo.SoRobotNanoMelee 1.2 | 4 | 4% | 9 |
| gimp.GimpBot 0.1 | 3 | 3% | 24 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 2% | 6 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 4 |

Posture (Hadur's M records, 329 rounds): 259676 melee ticks, 141672 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 104 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (329 rounds): longest scan gap while four or more were alive 104 ticks (329 rounds over 8); rounds whose longest gap at any count was over 8: 329; robots dropped as dead without a death event: 1.

Targeting waves (329 rounds): 73986 sent, 66981 reached their opponent, 12094 virtual hits (18.1% of those reached).

## Melee bench: F40

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 340 over 10 battles (34.0 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 89.6 | 234 / 350 | 1.93 | 20.2% | 54530 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 20.2% | 234 |
| kawigi.mini.Coriantumr 1.1 | 2.1 | 15.0% | 51 |
| kano.gamma.KanoGamma 1.8 | 3.1 | 12.7% | 29 |
| mz.AntiGrav 1.0 | 3.9 | 11.5% | 13 |
| Polkwane.SmashMelee 1.0 | 5.2 | 10.4% | 7 |
| stelo.Randomness 1.0 | 6.2 | 8.7% | 12 |
| alpha.BlackIce 1.0 | 6.5 | 8.4% | 3 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.4% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.1 | 3.9% | 1 |
| sample.Corners 1.0 | 9.9 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 88.6 | 23 / 35 | 5449 |
| 2 | 1 | 72.1 | 92.1 | 28 / 35 | 5585 |
| 3 | 1 | 70.4 | 88.9 | 21 / 35 | 5462 |
| 4 | 1 | 70.4 | 85.7 | 24 / 35 | 5352 |
| 5 | 1 | 69.4 | 87.0 | 17 / 35 | 5187 |
| 6 | 1 | 70.2 | 87.6 | 21 / 35 | 5563 |
| 7 | 1 | 71.8 | 92.4 | 28 / 35 | 5730 |
| 8 | 1 | 71.3 | 92.4 | 25 / 35 | 5312 |
| 9 | 1 | 70.9 | 90.2 | 24 / 35 | 5244 |
| 10 | 1 | 71.3 | 91.4 | 23 / 35 | 5646 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 110 | 86% |
| kano.gamma.KanoGamma 1.8 | 74 | 86% |
| mz.AntiGrav 1.0 | 37 | 92% |
| Polkwane.SmashMelee 1.0 | 29 | 93% |
| stelo.Randomness 1.0 | 9 | 67% |
| alpha.BlackIce 1.0 | 5 | 100% |
| amk.superstrike.SuperStrike 0.3 | 3 | 100% |

Hadur died in 117 of 350 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 44 | 38% | 113 |
| kano.gamma.KanoGamma 1.8 | 20 | 17% | 93 |
| mz.AntiGrav 1.0 | 15 | 13% | 39 |
| stelo.Randomness 1.0 | 13 | 11% | 33 |
| Polkwane.SmashMelee 1.0 | 12 | 10% | 38 |
| alpha.BlackIce 1.0 | 11 | 9% | 23 |
| amk.superstrike.SuperStrike 0.3 | 2 | 2% | 6 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 2 |
| sample.Corners 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 332 rounds): 242635 melee ticks, 66633 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 158 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 158 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 0.

Targeting waves (332 rounds): 78172 sent, 69833 reached their opponent, 13459 virtual hits (19.3% of those reached).

## Melee bench: F41

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 277 over 10 battles (27.7 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 89.0 | 216 / 350 | 1.99 | 19.1% | 47621 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 19.1% | 216 |
| eem.EvBotNG v12.8 | 2.0 | 15.7% | 98 |
| ary.Swarm 1.1 | 3.3 | 13.2% | 9 |
| lessonz.robocode.Oz 0.5.0 | 3.9 | 12.6% | 17 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 10.7% | 8 |
| shrub.Silver v048 | 6.1 | 8.6% | 1 |
| zyx.nano.Ant 1.1 | 7.0 | 7.5% | 0 |
| stelo.Mirror 1.1 | 8.1 | 5.5% | 0 |
| jsal.Jsalbot 1.0 | 8.8 | 5.1% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 84.4 | 21 / 35 | 4765 |
| 2 | 1 | 67.4 | 82.9 | 17 / 35 | 4457 |
| 3 | 1 | 68.2 | 84.8 | 20 / 35 | 4391 |
| 4 | 1 | 70.0 | 92.4 | 24 / 35 | 4724 |
| 5 | 1 | 72.2 | 96.5 | 26 / 35 | 5147 |
| 6 | 1 | 70.2 | 91.1 | 22 / 35 | 5029 |
| 7 | 1 | 69.6 | 89.2 | 19 / 35 | 4846 |
| 8 | 1 | 70.1 | 89.2 | 23 / 35 | 4895 |
| 9 | 1 | 70.1 | 90.8 | 24 / 35 | 4594 |
| 10 | 1 | 69.5 | 88.3 | 20 / 35 | 4773 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 132 | 65% |
| lessonz.robocode.Oz 0.5.0 | 56 | 95% |
| ary.Swarm 1.1 | 52 | 96% |
| simonton.nano.MeleeSeed 1.8 | 21 | 95% |
| shrub.Silver v048 | 4 | 75% |
| stelo.Mirror 1.1 | 2 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 134 of 350 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 62 | 46% | 147 |
| lessonz.robocode.Oz 0.5.0 | 23 | 17% | 57 |
| ary.Swarm 1.1 | 19 | 14% | 66 |
| simonton.nano.MeleeSeed 1.8 | 13 | 10% | 35 |
| shrub.Silver v048 | 6 | 4% | 17 |
| zyx.nano.Ant 1.1 | 6 | 4% | 9 |
| stelo.Mirror 1.1 | 4 | 3% | 12 |
| jsal.Jsalbot 1.0 | 1 | 1% | 6 |

Posture (Hadur's M records, 332 rounds): 249260 melee ticks, 111666 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 80 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 0.

Targeting waves (332 rounds): 80388 sent, 72076 reached their opponent, 10471 virtual hits (14.5% of those reached).

## Melee bench: F42

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 344 over 10 battles (34.4 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 92.6 | 257 / 350 | 1.66 | 21.1% | 62866 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 21.1% | 257 |
| wompi.Wallaby 5.1 | 2.1 | 15.0% | 46 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.2% | 17 |
| ara.Shera 0.88 | 3.6 | 12.8% | 27 |
| amz.NanoClone 1.41 | 5.0 | 8.8% | 1 |
| dsw.StaticD 1.0 | 6.5 | 6.9% | 2 |
| maribo.IotaCT 1.1 | 7.2 | 6.6% | 0 |
| stelo.MirrorMicro 1.0 | 8.1 | 5.7% | 0 |
| mme.NikeEnhanced 2.0 | 8.5 | 5.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 93.3 | 27 / 35 | 6274 |
| 2 | 1 | 70.5 | 88.9 | 20 / 35 | 6244 |
| 3 | 1 | 71.5 | 92.1 | 26 / 35 | 6120 |
| 4 | 1 | 71.8 | 93.3 | 25 / 35 | 6339 |
| 5 | 1 | 71.8 | 93.0 | 25 / 35 | 6246 |
| 6 | 1 | 71.5 | 92.4 | 27 / 35 | 6106 |
| 7 | 1 | 71.6 | 92.1 | 26 / 35 | 6304 |
| 8 | 1 | 72.4 | 95.2 | 28 / 35 | 6404 |
| 9 | 1 | 74.1 | 99.0 | 33 / 35 | 6859 |
| 10 | 1 | 69.9 | 87.0 | 20 / 35 | 5970 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 143 | 94% |
| maribo.mini.MiniQuester 0.1 | 83 | 94% |
| ara.Shera 0.88 | 45 | 76% |
| dsw.StaticD 1.0 | 6 | 100% |
| maribo.IotaCT 1.1 | 2 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 94 of 350 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 38 | 40% | 81 |
| wompi.Wallaby 5.1 | 25 | 27% | 138 |
| maribo.mini.MiniQuester 0.1 | 21 | 22% | 93 |
| amz.NanoClone 1.41 | 5 | 5% | 6 |
| maribo.IotaCT 1.1 | 3 | 3% | 6 |
| dsw.StaticD 1.0 | 2 | 2% | 16 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 5 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 2 |

Posture (Hadur's M records, 330 rounds): 259290 melee ticks, 81937 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 55 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 1.

Targeting waves (330 rounds): 80209 sent, 72237 reached their opponent, 13597 virtual hits (18.8% of those reached).

## Melee bench: F43

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 295 over 10 battles (29.5 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 81.1 | 104 / 350 | 2.70 | 16.9% | 45598 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.2% | 207 |
| hadur117.Hadur 3.24en | 2.0 | 16.9% | 104 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.5% | 23 |
| dummy.micro.Sparrow 2.5 | 4.1 | 11.4% | 9 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 10.8% | 7 |
| Krabb.akim2.Akim2 1.1b | 5.9 | 9.5% | 2 |
| mz.NanoGod 2.02 | 7.2 | 7.6% | 0 |
| jab.DiamondStealer 5 | 7.8 | 7.2% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.6% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.4 | 79.4 | 8 / 35 | 4717 |
| 2 | 2 | 68.6 | 85.1 | 13 / 35 | 4807 |
| 3 | 2 | 66.9 | 79.4 | 8 / 35 | 4354 |
| 4 | 2 | 67.8 | 81.6 | 12 / 35 | 4674 |
| 5 | 2 | 67.6 | 82.5 | 10 / 35 | 4538 |
| 6 | 2 | 68.4 | 84.8 | 10 / 35 | 4673 |
| 7 | 2 | 65.3 | 74.0 | 9 / 35 | 4168 |
| 8 | 2 | 67.6 | 82.5 | 12 / 35 | 4497 |
| 9 | 2 | 68.8 | 83.8 | 13 / 35 | 4888 |
| 10 | 2 | 66.4 | 78.1 | 9 / 35 | 4282 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 151 | 40% |
| brainfade.melee.Dusk 0.44 | 33 | 82% |
| wcsv.melee.EngineerMelee 0.1 | 11 | 73% |
| dummy.micro.Sparrow 2.5 | 3 | 67% |
| Krabb.akim2.Akim2 1.1b | 3 | 67% |
| jab.DiamondStealer 5 | 2 | 100% |
| cvt.Firsty 1.0 | 1 | 100% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 248 of 350 rounds, at a mean tick of 1298. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 148 | 60% | 202 |
| brainfade.melee.Dusk 0.44 | 33 | 13% | 64 |
| dummy.micro.Sparrow 2.5 | 22 | 9% | 26 |
| wcsv.melee.EngineerMelee 0.1 | 18 | 7% | 24 |
| Krabb.akim2.Akim2 1.1b | 10 | 4% | 14 |
| mz.NanoGod 2.02 | 9 | 4% | 10 |
| jab.DiamondStealer 5 | 6 | 2% | 7 |
| cvt.Firsty 1.0 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 333 rounds): 248268 melee ticks, 211141 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 129 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 129 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 1.

Targeting waves (333 rounds): 77728 sent, 69410 reached their opponent, 11079 virtual hits (16.0% of those reached).

## Melee bench: F44

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 344 over 10 battles (34.4 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 94.8 | 268 / 350 | 1.47 | 21.9% | 63199 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 21.9% | 268 |
| stelo.Liblix 0.3.1 | 2.2 | 15.4% | 54 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.3% | 17 |
| jwirde.Gort 2.0 | 4.6 | 9.2% | 2 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.7 | 9.1% | 3 |
| disan.Chair 2.2.0 | 6.7 | 7.0% | 2 |
| stf.PanzerGeneral 0.1 | 6.9 | 7.1% | 1 |
| wompi.Quokka 1.6 | 7.1 | 7.1% | 3 |
| sample.Crazy 1.0 | 9.4 | 4.5% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.6 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 98.1 | 32 / 35 | 6341 |
| 2 | 1 | 72.0 | 94.9 | 22 / 35 | 6125 |
| 3 | 1 | 71.9 | 91.4 | 28 / 35 | 6060 |
| 4 | 1 | 72.7 | 95.2 | 27 / 35 | 6135 |
| 5 | 1 | 72.7 | 95.9 | 27 / 35 | 6290 |
| 6 | 1 | 73.2 | 95.9 | 27 / 35 | 6548 |
| 7 | 1 | 72.3 | 94.0 | 26 / 35 | 6186 |
| 8 | 1 | 72.4 | 93.7 | 25 / 35 | 6606 |
| 9 | 1 | 72.4 | 92.7 | 24 / 35 | 6514 |
| 10 | 1 | 73.3 | 96.5 | 30 / 35 | 6394 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 153 | 81% |
| tzu.TheArtOfWar 1.2 | 112 | 92% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 13 | 92% |
| jwirde.Gort 2.0 | 13 | 100% |
| disan.Chair 2.2.0 | 7 | 100% |
| stf.PanzerGeneral 0.1 | 6 | 100% |
| wompi.Quokka 1.6 | 3 | 67% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 82 of 350 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 40 | 49% | 176 |
| tzu.TheArtOfWar 1.2 | 20 | 24% | 100 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 12 | 15% | 24 |
| jwirde.Gort 2.0 | 5 | 6% | 30 |
| wompi.Quokka 1.6 | 2 | 2% | 5 |
| stf.PanzerGeneral 0.1 | 2 | 2% | 4 |
| disan.Chair 2.2.0 | 1 | 1% | 7 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 332 rounds): 249878 melee ticks, 92914 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 66 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 0.

Targeting waves (332 rounds): 84155 sent, 76105 reached their opponent, 15000 virtual hits (19.7% of those reached).

## Melee bench: F45

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 366 over 10 battles (36.6 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 91.3 | 207 / 350 | 1.78 | 20.8% | 59366 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.0 | 20.8% | 207 |
| jje.BagPuss 1.2 | 2.5 | 12.5% | 14 |
| eem.IWillFireNoBullet v2.8 | 3.6 | 11.4% | 105 |
| myl.nano.Graviton 1.10 | 3.9 | 10.9% | 4 |
| sul.Lunar 1.1 | 4.3 | 10.7% | 13 |
| hvilela.HVilela 0.9 | 6.3 | 9.0% | 2 |
| fm.claire 1.7 | 7.0 | 8.3% | 2 |
| pez.mini.ChironexFleckeri 0.5 | 7.4 | 7.8% | 2 |
| wit.Deep7 2.0 | 9.1 | 4.6% | 0 |
| abud.ThirdRobo 1.0 | 9.9 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 89.2 | 13 / 35 | 5800 |
| 2 | 1 | 71.4 | 93.7 | 24 / 35 | 5833 |
| 3 | 1 | 71.3 | 90.8 | 21 / 35 | 6093 |
| 4 | 1 | 69.0 | 83.5 | 16 / 35 | 5879 |
| 5 | 1 | 71.4 | 94.0 | 22 / 35 | 5792 |
| 6 | 1 | 72.4 | 94.6 | 26 / 35 | 6317 |
| 7 | 1 | 71.4 | 92.1 | 21 / 35 | 6035 |
| 8 | 1 | 70.8 | 90.8 | 20 / 35 | 6051 |
| 9 | 1 | 71.5 | 93.3 | 23 / 35 | 5906 |
| 10 | 1 | 70.5 | 91.4 | 21 / 35 | 5660 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 113 | 46% |
| jje.BagPuss 1.2 | 50 | 84% |
| myl.nano.Graviton 1.10 | 44 | 95% |
| sul.Lunar 1.1 | 37 | 95% |
| pez.mini.ChironexFleckeri 0.5 | 19 | 95% |
| fm.claire 1.7 | 9 | 89% |
| wit.Deep7 2.0 | 8 | 100% |
| hvilela.HVilela 0.9 | 3 | 67% |

Hadur died in 143 of 350 rounds, at a mean tick of 1613. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 72 | 50% | 0 |
| jje.BagPuss 1.2 | 30 | 21% | 114 |
| sul.Lunar 1.1 | 14 | 10% | 80 |
| fm.claire 1.7 | 8 | 6% | 32 |
| pez.mini.ChironexFleckeri 0.5 | 7 | 5% | 30 |
| myl.nano.Graviton 1.10 | 5 | 3% | 53 |
| hvilela.HVilela 0.9 | 5 | 3% | 19 |
| wit.Deep7 2.0 | 1 | 1% | 13 |
| abud.ThirdRobo 1.0 | 1 | 1% | 7 |

Posture (Hadur's M records, 332 rounds): 315665 melee ticks, 151383 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 71 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 0.

Targeting waves (332 rounds): 95135 sent, 87049 reached their opponent, 12009 virtual hits (13.8% of those reached).

## Melee bench: F46

hadur117.Hadur 3.24en against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 247 over 10 battles (24.7 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 86.3 | 140 / 350 | 2.24 | 17.5% | 44822 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24en | 1.5 | 17.5% | 140 |
| kc.mini.Mirage 0.2 | 1.8 | 16.9% | 104 |
| rsalesc.melee.Medina 0.4.5 | 2.7 | 15.7% | 90 |
| mz.MicroSheep 1.0 | 4.5 | 10.4% | 1 |
| cx.Princess 1.0 | 4.8 | 9.9% | 12 |
| sadoner.killer 0.2 | 5.9 | 8.8% | 2 |
| arthord.NanoSatanMelee Beta | 6.8 | 7.2% | 2 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 90.2 | 18 / 35 | 4962 |
| 2 | 1 | 67.9 | 85.4 | 15 / 35 | 4743 |
| 3 | 1 | 67.1 | 85.7 | 14 / 35 | 4362 |
| 4 | 1 | 67.8 | 88.3 | 17 / 35 | 4235 |
| 5 | 1 | 69.2 | 89.5 | 17 / 35 | 4928 |
| 6 | 1 | 68.2 | 88.6 | 13 / 35 | 4637 |
| 7 | 2 | 65.9 | 83.8 | 10 / 35 | 4340 |
| 8 | 2 | 66.5 | 82.5 | 13 / 35 | 4313 |
| 9 | 2 | 66.5 | 83.8 | 11 / 35 | 4260 |
| 10 | 3 | 66.5 | 84.8 | 12 / 35 | 4042 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 131 | 69% |
| rsalesc.melee.Medina 0.4.5 | 61 | 54% |
| cx.Princess 1.0 | 12 | 42% |
| mz.MicroSheep 1.0 | 7 | 86% |
| arthord.NanoSatanMelee Beta | 4 | 75% |
| jeremyreeder.collective.Prophet 5 | 3 | 100% |

Hadur died in 210 of 350 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 105 | 50% | 184 |
| rsalesc.melee.Medina 0.4.5 | 59 | 28% | 98 |
| cx.Princess 1.0 | 13 | 6% | 20 |
| mz.MicroSheep 1.0 | 12 | 6% | 18 |
| sadoner.killer 0.2 | 11 | 5% | 14 |
| arthord.NanoSatanMelee Beta | 6 | 3% | 9 |
| jeremyreeder.collective.Prophet 5 | 3 | 1% | 4 |
| kurios.DOSexe .9a | 1 | 0% | 2 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 335 rounds): 248787 melee ticks, 109381 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (335 rounds): longest scan gap while four or more were alive 51 ticks (335 rounds over 8); rounds whose longest gap at any count was over 8: 335; robots dropped as dead without a death event: 0.

Targeting waves (335 rounds): 71807 sent, 63447 reached their opponent, 9368 virtual hits (14.8% of those reached).

