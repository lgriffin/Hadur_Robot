# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 334 over 6 battles (55.7 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 86.2 | 46 / 210 | 2.24 | 17.6% | 32652 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.3% | 150 |
| hadur117.Hadur 3.20aa | 2.0 | 17.6% | 46 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.5 | 11.1% | 1 |
| sgp.JollyNinja 3.53 | 4.0 | 10.7% | 5 |
| lorneswork.Predator 1.0 | 5.2 | 9.6% | 3 |
| mz.MicroGodMelee 1 | 5.5 | 9.8% | 3 |
| adt.Ar2 1.0 | 6.8 | 7.5% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.7% | 1 |
| skm.butterfly 1.0 | 8.8 | 4.9% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.5 | 86.0 | 5 / 35 | 5321 |
| 2 | 2 | 67.8 | 86.7 | 9 / 35 | 5376 |
| 3 | 2 | 68.3 | 87.0 | 9 / 35 | 5803 |
| 4 | 2 | 68.5 | 87.6 | 10 / 35 | 5666 |
| 5 | 2 | 67.5 | 84.4 | 8 / 35 | 5423 |
| 6 | 2 | 66.8 | 85.7 | 5 / 35 | 5063 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 133 | 11% |
| sgp.JollyNinja 3.53 | 16 | 94% |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 89% |
| mz.MicroGodMelee 1 | 6 | 67% |
| lorneswork.Predator 1.0 | 5 | 80% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |
| adt.Ar2 1.0 | 1 | 0% |

Hadur died in 167 of 210 rounds, at a mean tick of 1222. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 125 | 75% | 146 |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 8% | 16 |
| sgp.JollyNinja 3.53 | 9 | 5% | 20 |
| mz.MicroGodMelee 1 | 5 | 3% | 11 |
| lorneswork.Predator 1.0 | 5 | 3% | 8 |
| adt.Ar2 1.0 | 5 | 3% | 6 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 2 |
| skm.butterfly 1.0 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 138598 melee ticks, 100940 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 72 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 44692 sent, 39935 reached their opponent, 8016 virtual hits (20.1% of those reached).

## Melee bench: F02

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 378 over 6 battles (63.0 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 85.9 | 93 / 210 | 2.27 | 18.6% | 30523 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 18.6% | 93 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.6% | 51 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.6% | 30 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.5 | 10.2% | 12 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.8% | 2 |
| Noran.BitchingElk 0.054 | 6.7 | 8.3% | 10 |
| fnc.bandit.Bandit 5.2.0 | 6.7 | 8.2% | 2 |
| sch.Simone 0.3d | 7.7 | 7.1% | 8 |
| stelo.PatternRobot 1.0 | 9.0 | 5.1% | 2 |
| fullsail.SweetTea 1.1 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 88.3 | 20 / 35 | 5709 |
| 2 | 1 | 67.2 | 82.5 | 13 / 35 | 4816 |
| 3 | 1 | 68.5 | 86.0 | 13 / 35 | 5418 |
| 4 | 1 | 70.0 | 90.2 | 16 / 35 | 5409 |
| 5 | 1 | 66.7 | 83.5 | 14 / 35 | 4533 |
| 6 | 1 | 67.7 | 84.8 | 17 / 35 | 4638 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 50 | 48% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 44 | 64% |
| com.cohesiva.robocode.ManOwaR 1.0 | 19 | 79% |
| Noran.BitchingElk 0.054 | 17 | 65% |
| sch.Simone 0.3d | 8 | 50% |
| lrem.micro.SpikeSoldier 0.4 | 6 | 83% |
| fnc.bandit.Bandit 5.2.0 | 4 | 100% |
| stelo.PatternRobot 1.0 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 989. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 44 | 37% | 66 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 27 | 23% | 59 |
| sch.Simone 0.3d | 12 | 10% | 15 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 10% | 14 |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 9% | 24 |
| Noran.BitchingElk 0.054 | 7 | 6% | 21 |
| stelo.PatternRobot 1.0 | 2 | 2% | 4 |
| fnc.bandit.Bandit 5.2.0 | 1 | 1% | 6 |
| fullsail.SweetTea 1.1 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 165934 melee ticks, 45252 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 571 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 359 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 58856 sent, 54154 reached their opponent, 9240 virtual hits (17.1% of those reached).

## Melee bench: F03

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 121 over 6 battles (20.2 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 93.1 | 174 / 210 | 1.62 | 21.0% | 38655 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 21.0% | 174 |
| radnor.DoctorBob 1.42 | 2.2 | 13.8% | 15 |
| kawigi.nano.Lib 1.0 | 3.2 | 12.7% | 6 |
| vuen.Cake 2.51 | 3.7 | 12.4% | 13 |
| urdos.URDOS 1.3 | 5.0 | 9.7% | 2 |
| adt.Ar1 2.1 | 6.3 | 7.4% | 0 |
| oa.weak.FlyMk1 0.1 | 7.0 | 6.8% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 8.0 | 6.1% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.2% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 96.2 | 30 / 35 | 6253 |
| 2 | 1 | 72.0 | 95.6 | 30 / 35 | 6560 |
| 3 | 1 | 72.0 | 94.3 | 29 / 35 | 6613 |
| 4 | 1 | 72.2 | 93.7 | 30 / 35 | 6972 |
| 5 | 1 | 70.0 | 88.9 | 28 / 35 | 6081 |
| 6 | 1 | 70.3 | 90.2 | 27 / 35 | 6176 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 76 | 88% |
| radnor.DoctorBob 1.42 | 65 | 97% |
| kawigi.nano.Lib 1.0 | 38 | 95% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| urdos.URDOS 1.3 | 2 | 100% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 36 of 210 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 10 | 28% | 76 |
| radnor.DoctorBob 1.42 | 6 | 17% | 48 |
| kawigi.nano.Lib 1.0 | 6 | 17% | 45 |
| urdos.URDOS 1.3 | 5 | 14% | 11 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 14% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 6% | 5 |
| adt.Ar1 2.1 | 1 | 3% | 8 |
| oa.weak.FlyMk1 0.1 | 1 | 3% | 6 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 198 rounds): 127406 melee ticks, 40434 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 51 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 2.

Targeting waves (198 rounds): 38433 sent, 33825 reached their opponent, 8645 virtual hits (25.6% of those reached).

## Melee bench: F04

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 483 over 6 battles (80.5 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 87.9 | 38 / 210 | 2.09 | 18.4% | 35759 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.5% | 158 |
| hadur117.Hadur 3.20aa | 2.0 | 18.4% | 38 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.6% | 8 |
| TNT.TNT 0.99.1 | 4.2 | 10.5% | 3 |
| josago.Jorgito 0.16 | 5.0 | 8.9% | 3 |
| css.Delitioner 0.11 | 6.2 | 7.0% | 0 |
| tj.zombie1n 1.0.1 | 6.8 | 6.5% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.0% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 3.8% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.8 | 86.7 | 6 / 35 | 5749 |
| 2 | 2 | 69.6 | 88.6 | 8 / 35 | 6124 |
| 3 | 2 | 70.2 | 89.5 | 7 / 35 | 6400 |
| 4 | 2 | 69.1 | 87.6 | 7 / 35 | 5918 |
| 5 | 2 | 68.6 | 87.0 | 4 / 35 | 5543 |
| 6 | 2 | 69.6 | 87.9 | 6 / 35 | 6025 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 150 | 18% |
| apc.LeeroyJenkins2 1.0 | 14 | 57% |
| TNT.TNT 0.99.1 | 4 | 50% |
| josago.Jorgito 0.16 | 1 | 100% |

Hadur died in 176 of 210 rounds, at a mean tick of 1348. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 129 | 73% | 157 |
| apc.LeeroyJenkins2 1.0 | 27 | 15% | 34 |
| TNT.TNT 0.99.1 | 9 | 5% | 11 |
| josago.Jorgito 0.16 | 5 | 3% | 6 |
| css.Delitioner 0.11 | 2 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 190654 melee ticks, 84881 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 110 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 110 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 58418 sent, 53677 reached their opponent, 7938 virtual hits (14.8% of those reached).

## Melee bench: F05

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 523 over 6 battles (87.2 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 79.7 | 39 / 210 | 2.82 | 15.7% | 25153 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 17.8% | 93 |
| justin.DemonicRage 3.4 | 2.0 | 17.3% | 65 |
| hadur117.Hadur 3.20aa | 2.8 | 15.7% | 39 |
| wompi.Numbat 2.1 | 4.0 | 12.7% | 11 |
| axeBots.HataMoto 3.09 | 5.3 | 9.2% | 1 |
| ms.Ares 0.19 | 5.7 | 9.2% | 1 |
| supersample.SuperBoxBot 1.0 | 7.3 | 5.4% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.0% | 0 |
| GarmBox.Oranges 1.0 | 9.3 | 3.9% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 66.3 | 83.5 | 5 / 35 | 4486 |
| 2 | 3 | 66.0 | 81.9 | 9 / 35 | 4228 |
| 3 | 2 | 66.4 | 81.3 | 11 / 35 | 4517 |
| 4 | 3 | 64.0 | 74.9 | 3 / 35 | 4177 |
| 5 | 3 | 65.1 | 81.0 | 6 / 35 | 3670 |
| 6 | 3 | 63.6 | 75.9 | 5 / 35 | 4075 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 41 | 29% |
| cb.fire.Firestarter 2.0f | 36 | 8% |
| wompi.Numbat 2.1 | 19 | 84% |
| axeBots.HataMoto 3.09 | 4 | 75% |
| ms.Ares 0.19 | 3 | 100% |
| supersample.SuperBoxBot 1.0 | 2 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 70 | 40% | 81 |
| cb.fire.Firestarter 2.0f | 61 | 35% | 66 |
| wompi.Numbat 2.1 | 23 | 13% | 37 |
| axeBots.HataMoto 3.09 | 9 | 5% | 13 |
| ms.Ares 0.19 | 6 | 3% | 9 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 165187 melee ticks, 34561 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 72 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 0.

Targeting waves (209 rounds): 49779 sent, 44791 reached their opponent, 7172 virtual hits (16.0% of those reached).

## Melee bench: F06

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 342 over 6 battles (57.0 per battle, most in one battle 142). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 90.3 | 140 / 210 | 1.88 | 20.0% | 33507 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 20.0% | 140 |
| jekl.StoneGhost 0.7 | 2.3 | 14.4% | 16 |
| origin.SleepSiphon 1.7b | 2.8 | 13.9% | 32 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 11.8% | 14 |
| mld.Wisdom 1.0 | 5.2 | 9.8% | 1 |
| gg.Wolverine 2.0 | 5.8 | 8.7% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 6.6% | 5 |
| spinnercat.Omen 1.0 | 8.2 | 5.8% | 1 |
| DBall.NUKE 0.1 | 8.3 | 5.9% | 0 |
| sample.Fire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 92.1 | 26 / 35 | 5651 |
| 2 | 1 | 70.0 | 90.2 | 22 / 35 | 5399 |
| 3 | 1 | 71.7 | 93.7 | 27 / 35 | 5615 |
| 4 | 1 | 70.2 | 89.5 | 22 / 35 | 5550 |
| 5 | 1 | 68.4 | 85.4 | 19 / 35 | 5336 |
| 6 | 1 | 71.3 | 90.8 | 24 / 35 | 5956 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 57 | 81% |
| jekl.StoneGhost 0.7 | 52 | 90% |
| pe.minimelee.SandboxMiniMelee 1.1 | 29 | 83% |
| gg.Wolverine 2.0 | 12 | 100% |
| mld.Wisdom 1.0 | 7 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 50% |
| DBall.NUKE 0.1 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 25 | 33% | 65 |
| jekl.StoneGhost 0.7 | 20 | 26% | 57 |
| pe.minimelee.SandboxMiniMelee 1.1 | 13 | 17% | 35 |
| mld.Wisdom 1.0 | 5 | 7% | 18 |
| gg.Wolverine 2.0 | 3 | 4% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 3% | 10 |
| spinnercat.Omen 1.0 | 2 | 3% | 4 |
| sample.Fire 1.0 | 1 | 1% | 1 |
| DBall.NUKE 0.1 | 0 | 0% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 147107 melee ticks, 43456 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 55 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 44999 sent, 40438 reached their opponent, 8751 virtual hits (21.6% of those reached).

## Melee bench: F07

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 513 over 6 battles (85.5 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.1 | 94.0 | 120 / 210 | 1.54 | 21.3% | 40977 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 21.3% | 120 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 16.8% | 43 |
| rtk.Tachikoma 1.0 | 2.7 | 16.5% | 31 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.4% | 4 |
| franzor.Lizt 1.3.1 | 4.7 | 10.5% | 12 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 7.9% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.3% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.2% | 0 |
| sample.Target 1.0 | 9.0 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 94.6 | 22 / 35 | 6729 |
| 2 | 1 | 73.3 | 94.0 | 20 / 35 | 7102 |
| 3 | 1 | 72.5 | 92.7 | 17 / 35 | 6628 |
| 4 | 1 | 73.0 | 94.6 | 19 / 35 | 6623 |
| 5 | 1 | 73.3 | 94.0 | 22 / 35 | 7022 |
| 6 | 1 | 73.1 | 94.3 | 20 / 35 | 6873 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 97 | 74% |
| rsalesc.melee.Monk 0.3.6c | 54 | 30% |
| franzor.Lizt 1.3.1 | 24 | 58% |
| oog.melee.CapuletDroid 1.1 | 19 | 89% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 1481. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 44 | 47% | 71 |
| rtk.Tachikoma 1.0 | 30 | 32% | 105 |
| franzor.Lizt 1.3.1 | 11 | 12% | 3 |
| oog.melee.CapuletDroid 1.1 | 4 | 4% | 27 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 1 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 188320 melee ticks, 91608 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 72 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 56184 sent, 51466 reached their opponent, 10199 virtual hits (19.8% of those reached).

## Melee bench: F08

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 540 over 6 battles (90.0 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 91.3 | 143 / 210 | 1.78 | 19.9% | 30792 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 19.9% | 143 |
| tm.Yuugao 1.0 | 2.2 | 13.3% | 24 |
| shrub.Vapour v159 | 3.2 | 12.3% | 19 |
| Krabb.sliNk.Garm 0.9u | 3.7 | 11.1% | 14 |
| com.spp.robocode.MostlyHarmless 010 | 5.3 | 9.4% | 3 |
| jwst.DAD.DarkAndDarker 1.1 | 6.2 | 8.7% | 8 |
| m3thos.Eva00 1.1 | 6.5 | 8.8% | 0 |
| qualidafial.MajorDick 1.0.1 | 8.2 | 6.2% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 5.0% | 0 |
| SHAM.WOW 1.4 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 90.5 | 23 / 35 | 5333 |
| 2 | 1 | 68.8 | 87.9 | 23 / 35 | 4806 |
| 3 | 1 | 68.3 | 87.9 | 19 / 35 | 4814 |
| 4 | 1 | 70.5 | 94.6 | 25 / 35 | 5111 |
| 5 | 1 | 70.0 | 92.1 | 26 / 35 | 5152 |
| 6 | 1 | 71.3 | 94.9 | 27 / 35 | 5576 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 68 | 84% |
| shrub.Vapour v159 | 34 | 74% |
| Krabb.sliNk.Garm 0.9u | 30 | 67% |
| com.spp.robocode.MostlyHarmless 010 | 17 | 88% |
| jwst.DAD.DarkAndDarker 1.1 | 15 | 87% |
| m3thos.Eva00 1.1 | 9 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 892. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 19 | 27% | 69 |
| Krabb.sliNk.Garm 0.9u | 17 | 24% | 38 |
| shrub.Vapour v159 | 13 | 19% | 33 |
| com.spp.robocode.MostlyHarmless 010 | 11 | 16% | 29 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 7% | 19 |
| qualidafial.MajorDick 1.0.1 | 2 | 3% | 4 |
| m3thos.Eva00 1.1 | 0 | 0% | 9 |
| SHAM.WOW 1.4 | 0 | 0% | 5 |
| zyx.nano.BacillusComma 1.0 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 145224 melee ticks, 46431 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 46 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 47482 sent, 42641 reached their opponent, 7926 virtual hits (18.6% of those reached).

## Melee bench: F09

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 505 over 6 battles (84.2 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 79.5 | 59 / 210 | 2.84 | 16.0% | 22820 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.6% | 102 |
| hadur117.Hadur 3.20aa | 1.8 | 16.0% | 59 |
| kc.micro.Figment 1.0 | 3.0 | 13.9% | 19 |
| mc2.enemy.Original 0.9 | 4.8 | 10.4% | 16 |
| yagami.Tidus 0.11 | 4.8 | 10.3% | 1 |
| pedersen.Grishnakh 1.0 | 5.3 | 9.6% | 12 |
| dft.Calliope 5.6 | 7.0 | 7.6% | 1 |
| step.nanoPri 1.0 | 8.0 | 5.8% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 4.8% | 0 |
| rdm.Dueler 0.4x | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 78.4 | 10 / 35 | 3663 |
| 2 | 2 | 64.2 | 78.4 | 8 / 35 | 3730 |
| 3 | 2 | 61.7 | 72.7 | 6 / 35 | 3396 |
| 4 | 2 | 65.5 | 80.0 | 13 / 35 | 3924 |
| 5 | 2 | 64.9 | 80.0 | 9 / 35 | 3875 |
| 6 | 1 | 67.7 | 87.6 | 13 / 35 | 4232 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 57 | 25% |
| kc.micro.Figment 1.0 | 33 | 85% |
| pedersen.Grishnakh 1.0 | 11 | 55% |
| mc2.enemy.Original 0.9 | 9 | 44% |
| yagami.Tidus 0.11 | 4 | 100% |
| dft.Calliope 5.6 | 3 | 100% |

Hadur died in 155 of 210 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 63 | 41% | 80 |
| kc.micro.Figment 1.0 | 33 | 21% | 53 |
| mc2.enemy.Original 0.9 | 15 | 10% | 20 |
| pedersen.Grishnakh 1.0 | 13 | 8% | 19 |
| yagami.Tidus 0.11 | 12 | 8% | 19 |
| dft.Calliope 5.6 | 6 | 4% | 8 |
| rdm.Dueler 0.4x | 6 | 4% | 6 |
| robar.nano.Assertive_Melee 0.2 | 3 | 2% | 4 |
| step.nanoPri 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 154239 melee ticks, 39417 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 41 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 50123 sent, 45364 reached their opponent, 6496 virtual hits (14.3% of those reached).

## Melee bench: F10

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 224 over 6 battles (37.3 per battle, most in one battle 117). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 95.4 | 169 / 210 | 1.41 | 21.0% | 35234 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 21.0% | 169 |
| DTF.Kludgy 1.2b | 2.3 | 14.7% | 21 |
| ne.Chimera 1.2 | 3.3 | 12.4% | 4 |
| ejb.Polaris 1.0.1 | 3.3 | 11.8% | 8 |
| tvv.micro.Antares 1.1.1 | 5.3 | 10.1% | 3 |
| vStar.RAFzilla 2.15 | 5.7 | 9.9% | 4 |
| kurios.DOSexe .9b | 7.5 | 5.8% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.0 | 5.5% | 0 |
| sam.Samspin 1.0 | 8.5 | 5.1% | 0 |
| donjezza.Muncho 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 93.0 | 24 / 35 | 5647 |
| 2 | 1 | 70.8 | 92.7 | 26 / 35 | 5741 |
| 3 | 1 | 72.1 | 97.8 | 30 / 35 | 5998 |
| 4 | 1 | 71.9 | 94.0 | 28 / 35 | 6312 |
| 5 | 1 | 72.3 | 97.8 | 32 / 35 | 5813 |
| 6 | 1 | 71.9 | 97.5 | 29 / 35 | 5723 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 74 | 86% |
| ejb.Polaris 1.0.1 | 35 | 89% |
| ne.Chimera 1.2 | 30 | 93% |
| vStar.RAFzilla 2.15 | 21 | 95% |
| tvv.micro.Antares 1.1.1 | 16 | 100% |
| kurios.DOSexe .9b | 9 | 89% |
| donjezza.Muncho 1.0 | 1 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 913. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 23 | 52% | 83 |
| ne.Chimera 1.2 | 8 | 18% | 33 |
| ejb.Polaris 1.0.1 | 6 | 14% | 39 |
| kurios.DOSexe .9b | 3 | 7% | 21 |
| vStar.RAFzilla 2.15 | 2 | 5% | 20 |
| tvv.micro.Antares 1.1.1 | 1 | 2% | 11 |
| donjezza.Muncho 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 142163 melee ticks, 65470 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 48 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 46633 sent, 41923 reached their opponent, 8103 virtual hits (19.3% of those reached).

## Melee bench: F11

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 119 over 6 battles (19.8 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 83.4 | 81 / 210 | 2.49 | 16.9% | 23950 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.5 | 16.5% | 68 |
| hadur117.Hadur 3.20aa | 1.5 | 16.9% | 81 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.9% | 21 |
| djc.DynaBot 0.1.1 | 4.5 | 10.5% | 14 |
| rdt199.Warlord 0.73 | 4.7 | 9.8% | 13 |
| uji.YellohFellah 1.0 | 6.8 | 7.9% | 8 |
| KiraNL.Chupacabra 0.4 | 7.0 | 7.7% | 2 |
| br2.MobyDickBot 1.6 | 7.0 | 7.7% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.5% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 78.1 | 11 / 35 | 3648 |
| 2 | 1 | 67.0 | 86.0 | 17 / 35 | 4241 |
| 3 | 1 | 64.9 | 82.5 | 14 / 35 | 3872 |
| 4 | 2 | 66.1 | 83.2 | 12 / 35 | 4009 |
| 5 | 1 | 67.5 | 88.3 | 15 / 35 | 4205 |
| 6 | 2 | 65.7 | 82.5 | 12 / 35 | 3975 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 55 | 56% |
| cx.mini.Nimrod 0.55 | 24 | 67% |
| djc.DynaBot 0.1.1 | 20 | 60% |
| rdt199.Warlord 0.73 | 15 | 53% |
| uji.YellohFellah 1.0 | 7 | 100% |
| br2.MobyDickBot 1.6 | 6 | 50% |
| KiraNL.Chupacabra 0.4 | 4 | 75% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 877. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 61 | 47% | 93 |
| cx.mini.Nimrod 0.55 | 21 | 16% | 35 |
| djc.DynaBot 0.1.1 | 14 | 11% | 30 |
| rdt199.Warlord 0.73 | 12 | 9% | 18 |
| br2.MobyDickBot 1.6 | 7 | 5% | 9 |
| uji.YellohFellah 1.0 | 6 | 5% | 11 |
| KiraNL.Chupacabra 0.4 | 5 | 4% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 2% | 4 |
| stelo.MirrorNano 1.3 | 1 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 159825 melee ticks, 35264 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 47 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 52500 sent, 47395 reached their opponent, 6434 virtual hits (13.6% of those reached).

## Melee bench: F12

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 525 over 6 battles (87.5 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 85.5 | 119 / 210 | 2.30 | 17.9% | 24260 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 17.9% | 119 |
| bts.wiki.RipCurl 0.9b | 2.7 | 13.2% | 26 |
| nat.PallasHawk 1.0 | 3.2 | 13.3% | 29 |
| darkcanuck.Leon 1.01 | 3.3 | 12.6% | 22 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.4% | 7 |
| jrm.Test0 1.0 | 6.0 | 8.5% | 3 |
| cs.sheldor.Talon 1.1 | 7.3 | 6.6% | 1 |
| jp.Perpy 16.0 | 8.2 | 6.2% | 1 |
| stuff.Vlad 0.1 | 8.7 | 6.0% | 0 |
| jaybot.bots.Oddball 4.0 | 9.8 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 87.6 | 19 / 35 | 4266 |
| 2 | 1 | 66.5 | 84.1 | 18 / 35 | 3762 |
| 3 | 1 | 66.7 | 82.5 | 19 / 35 | 4053 |
| 4 | 1 | 67.7 | 87.0 | 22 / 35 | 4002 |
| 5 | 1 | 68.8 | 90.5 | 24 / 35 | 4168 |
| 6 | 1 | 65.8 | 81.3 | 17 / 35 | 4009 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 48 | 71% |
| darkcanuck.Leon 1.01 | 39 | 82% |
| bts.wiki.RipCurl 0.9b | 37 | 81% |
| brainfade.melee.Genghis 0.36 | 18 | 83% |
| jrm.Test0 1.0 | 5 | 80% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 725. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 27 | 28% | 48 |
| nat.PallasHawk 1.0 | 24 | 25% | 63 |
| jrm.Test0 1.0 | 15 | 16% | 21 |
| darkcanuck.Leon 1.01 | 12 | 13% | 49 |
| brainfade.melee.Genghis 0.36 | 4 | 4% | 13 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 7 |
| jaybot.bots.Oddball 4.0 | 3 | 3% | 4 |
| stuff.Vlad 0.1 | 3 | 3% | 3 |
| jp.Perpy 16.0 | 1 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 134764 melee ticks, 37506 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 42 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 45124 sent, 40057 reached their opponent, 6608 virtual hits (16.5% of those reached).

## Melee bench: F13

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 209 over 6 battles (34.8 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 81.7 | 62 / 210 | 2.64 | 16.0% | 25450 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 16.2% | 82 |
| ags.Glacier 0.2.11 | 2.2 | 15.9% | 29 |
| hadur117.Hadur 3.20aa | 2.3 | 16.0% | 62 |
| shinh.Entangled 0.3 | 4.0 | 12.8% | 30 |
| gh.micro.Gruweltje 0.7 | 5.0 | 11.4% | 7 |
| apc.Colossus2 0.17 | 6.3 | 8.0% | 1 |
| stelo.Wang 1.0 | 6.7 | 7.1% | 0 |
| ayk.WallHugger 1.0 | 8.3 | 4.8% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.8% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.6 | 83.5 | 9 / 35 | 4063 |
| 2 | 3 | 64.7 | 79.7 | 8 / 35 | 4201 |
| 3 | 1 | 66.6 | 87.0 | 14 / 35 | 4079 |
| 4 | 3 | 66.1 | 83.8 | 11 / 35 | 4287 |
| 5 | 1 | 66.3 | 81.9 | 13 / 35 | 4705 |
| 6 | 3 | 63.0 | 74.6 | 7 / 35 | 4115 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 47 | 28% |
| ags.Glacier 0.2.11 | 41 | 68% |
| shinh.Entangled 0.3 | 28 | 50% |
| gh.micro.Gruweltje 0.7 | 6 | 83% |
| apc.Colossus2 0.17 | 2 | 50% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 150 of 210 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 59 | 39% | 79 |
| ags.Glacier 0.2.11 | 39 | 26% | 61 |
| shinh.Entangled 0.3 | 26 | 17% | 37 |
| gh.micro.Gruweltje 0.7 | 12 | 8% | 18 |
| apc.Colossus2 0.17 | 5 | 3% | 8 |
| maribo.FollowFire 1 | 4 | 3% | 4 |
| stelo.Wang 1.0 | 2 | 1% | 2 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 143876 melee ticks, 43500 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 65 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 42266 sent, 37393 reached their opponent, 6034 virtual hits (16.1% of those reached).

## Melee bench: F14

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 124 over 6 battles (20.7 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 97.3 | 176 / 210 | 1.24 | 21.9% | 37173 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 21.9% | 176 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.3% | 10 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.9% | 20 |
| Lo_Ian.Gandalf_V4 4.0 | 4.5 | 9.6% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 5.0 | 9.3% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 5.7 | 8.9% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.4% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.5 | 7.5% | 0 |
| pa.Improved 1.0 | 9.0 | 5.9% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 96.8 | 30 / 35 | 6399 |
| 2 | 1 | 72.6 | 97.1 | 30 / 35 | 6045 |
| 3 | 1 | 72.2 | 96.5 | 27 / 35 | 5996 |
| 4 | 1 | 73.0 | 98.4 | 30 / 35 | 6323 |
| 5 | 1 | 72.3 | 95.9 | 27 / 35 | 6131 |
| 6 | 1 | 73.3 | 99.0 | 32 / 35 | 6279 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 92 | 91% |
| catcat20.shape.Theta 0.018 | 80 | 81% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 85% |
| sanyi.mikrobi.Roberto 1.0 | 11 | 91% |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 34 of 210 rounds, at a mean tick of 1003. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 17 | 50% | 69 |
| simonton.micro.Sprout 1.1.3 | 14 | 41% | 91 |
| sheldor.micro.PointInLineRRAL 1.0 | 2 | 6% | 16 |
| sanyi.mikrobi.Roberto 1.0 | 1 | 3% | 17 |
| co.edu.usb.rc.LidisTron 1.0 | 0 | 0% | 7 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 1 |

Posture (Hadur's M records, 202 rounds): 143169 melee ticks, 61011 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 56 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 45083 sent, 40510 reached their opponent, 9516 virtual hits (23.5% of those reached).

## Melee bench: F15

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 519 over 6 battles (86.5 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 87.9 | 120 / 210 | 2.09 | 19.2% | 31538 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 19.2% | 120 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.2% | 13 |
| emp.Yngwie 1.11 | 3.0 | 13.1% | 49 |
| mld.DustBunny 3.8 | 3.2 | 12.7% | 7 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.5% | 8 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.3% | 14 |
| lambdaxy.TBot 0.1 | 7.3 | 6.9% | 0 |
| Grystrion.TrackerWO 1.0 | 7.8 | 6.3% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 4.4% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 91.1 | 23 / 35 | 5119 |
| 2 | 1 | 68.6 | 85.1 | 18 / 35 | 5327 |
| 3 | 1 | 70.2 | 90.8 | 21 / 35 | 5485 |
| 4 | 1 | 68.0 | 86.3 | 16 / 35 | 5037 |
| 5 | 1 | 69.0 | 87.3 | 21 / 35 | 5237 |
| 6 | 1 | 69.3 | 86.7 | 21 / 35 | 5333 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 53 | 60% |
| mld.DustBunny 3.8 | 36 | 94% |
| kawigi.micro.Shiz 1.1 | 29 | 86% |
| kawigi.robot.Girl 1.2 | 15 | 60% |
| cb.nano.Insomnia 1.0 | 15 | 87% |
| divineomega.TrialBot 0.003 | 6 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 1031. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 36 | 37% | 84 |
| kawigi.robot.Girl 1.2 | 16 | 16% | 23 |
| mld.DustBunny 3.8 | 12 | 12% | 39 |
| kawigi.micro.Shiz 1.1 | 12 | 12% | 31 |
| cb.nano.Insomnia 1.0 | 7 | 7% | 9 |
| divineomega.TrialBot 0.003 | 3 | 3% | 15 |
| lambdaxy.TBot 0.1 | 2 | 2% | 5 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 165016 melee ticks, 50222 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 53 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 53 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 53374 sent, 48530 reached their opponent, 8123 virtual hits (16.7% of those reached).

## Melee bench: F16

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 530 over 6 battles (88.3 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 91.4 | 133 / 210 | 1.78 | 20.6% | 35968 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 20.6% | 133 |
| gh.Griezel 0.5.2 | 2.0 | 16.2% | 44 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.7% | 4 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 10.8% | 23 |
| bvh.fnr.Fenrir 0.36l | 5.2 | 9.2% | 0 |
| tvv.nano.Polaris 1.2 | 6.0 | 8.5% | 3 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.7% | 3 |
| asd.Cthulhu 1.3 | 8.2 | 5.0% | 0 |
| repositorio.NanoStep 1.0 | 9.3 | 4.3% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.5 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 94.0 | 24 / 35 | 6340 |
| 2 | 1 | 70.9 | 91.1 | 22 / 35 | 5817 |
| 3 | 1 | 69.2 | 87.6 | 15 / 35 | 5265 |
| 4 | 1 | 70.7 | 88.6 | 22 / 35 | 5963 |
| 5 | 1 | 72.9 | 94.3 | 27 / 35 | 6561 |
| 6 | 1 | 71.2 | 92.7 | 23 / 35 | 6022 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 96 | 74% |
| techdude.forest.FlamingForest 1.1 | 36 | 67% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 24 | 100% |
| stelo.IntrinsicVolatility 1.4 | 8 | 75% |
| bvh.fnr.Fenrir 0.36l | 4 | 100% |
| tvv.nano.Polaris 1.2 | 3 | 100% |
| divineomega.DivineBot 1.9.4.5 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 1207. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 32 | 39% | 101 |
| techdude.forest.FlamingForest 1.1 | 17 | 20% | 43 |
| bvh.fnr.Fenrir 0.36l | 13 | 16% | 20 |
| stelo.IntrinsicVolatility 1.4 | 6 | 7% | 11 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 5 | 6% | 21 |
| tvv.nano.Polaris 1.2 | 3 | 4% | 7 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 5 |
| asd.Cthulhu 1.3 | 0 | 0% | 1 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 174558 melee ticks, 77544 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 37 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 37 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 55924 sent, 51219 reached their opponent, 8665 virtual hits (16.9% of those reached).

## Melee bench: F17

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 634 over 6 battles (105.7 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 88.7 | 109 / 210 | 2.02 | 19.8% | 35818 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 19.8% | 109 |
| et.Predator 1.8 | 2.5 | 13.7% | 20 |
| oog.melee.Mercutio 1.0 | 3.0 | 13.7% | 37 |
| cx.BlestPain 1.41 | 3.5 | 12.5% | 40 |
| ahf.NanoAndrew .4 | 5.5 | 9.6% | 1 |
| nic.Nicator 2.4 | 6.2 | 8.9% | 3 |
| maribo.melee.BMV 0.1 | 6.3 | 8.4% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.2 | 6.1% | 0 |
| tex.Longbot 0.4 | 8.8 | 4.9% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 87.9 | 19 / 35 | 5763 |
| 2 | 1 | 69.4 | 86.0 | 14 / 35 | 5926 |
| 3 | 1 | 69.9 | 87.3 | 19 / 35 | 6000 |
| 4 | 1 | 72.3 | 94.0 | 26 / 35 | 6234 |
| 5 | 1 | 70.2 | 88.3 | 16 / 35 | 6212 |
| 6 | 1 | 69.5 | 88.6 | 15 / 35 | 5683 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 62 | 77% |
| oog.melee.Mercutio 1.0 | 49 | 69% |
| cx.BlestPain 1.41 | 39 | 41% |
| maribo.melee.BMV 0.1 | 4 | 100% |
| ahf.NanoAndrew .4 | 3 | 100% |
| nic.Nicator 2.4 | 2 | 50% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |
| tex.Longbot 0.4 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 1158. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 39 | 36% | 63 |
| et.Predator 1.8 | 28 | 26% | 64 |
| oog.melee.Mercutio 1.0 | 26 | 24% | 51 |
| maribo.melee.BMV 0.1 | 5 | 5% | 7 |
| ahf.NanoAndrew .4 | 3 | 3% | 12 |
| nic.Nicator 2.4 | 1 | 1% | 8 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 5 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 167752 melee ticks, 67350 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 66 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 55117 sent, 50329 reached their opponent, 10636 virtual hits (21.1% of those reached).

## Melee bench: F18

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 176 over 6 battles (29.3 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 93.1 | 148 / 210 | 1.62 | 20.5% | 31211 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 20.5% | 148 |
| morbid.MorbidPriest 1.0 | 2.3 | 13.7% | 29 |
| agd.Mooserwirt2 2.7 | 2.7 | 12.8% | 15 |
| uji.DBH 1.1 | 4.0 | 11.0% | 6 |
| sigterm.Sigterm 1.0 | 6.0 | 8.4% | 10 |
| ratosh.Nobo 0.21 | 6.7 | 8.0% | 1 |
| kawigi.mini.Fhqwhgads 1.1 | 6.7 | 7.8% | 1 |
| spinnercat.Robovirus 2.718 | 6.8 | 7.6% | 0 |
| stelo.WangRobot 1.0 | 9.3 | 4.9% | 0 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 94.3 | 25 / 35 | 5383 |
| 2 | 1 | 70.3 | 92.4 | 24 / 35 | 5133 |
| 3 | 1 | 70.6 | 95.2 | 24 / 35 | 4880 |
| 4 | 1 | 70.8 | 93.0 | 26 / 35 | 5207 |
| 5 | 1 | 70.6 | 92.7 | 25 / 35 | 5407 |
| 6 | 1 | 70.2 | 91.1 | 24 / 35 | 5201 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 72 | 75% |
| agd.Mooserwirt2 2.7 | 45 | 80% |
| uji.DBH 1.1 | 30 | 87% |
| sigterm.Sigterm 1.0 | 17 | 65% |
| kawigi.mini.Fhqwhgads 1.1 | 7 | 86% |
| spinnercat.Robovirus 2.718 | 6 | 100% |
| stelo.WangRobot 1.0 | 4 | 100% |
| ratosh.Nobo 0.21 | 4 | 75% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 902. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 26 | 41% | 77 |
| agd.Mooserwirt2 2.7 | 15 | 24% | 52 |
| uji.DBH 1.1 | 9 | 14% | 30 |
| sigterm.Sigterm 1.0 | 7 | 11% | 16 |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 5% | 9 |
| spinnercat.Robovirus 2.718 | 1 | 2% | 10 |
| ratosh.Nobo 0.21 | 1 | 2% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 2% | 5 |
| stelo.WangRobot 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 202 rounds): 137755 melee ticks, 51291 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 55 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 45612 sent, 40924 reached their opponent, 8674 virtual hits (21.2% of those reached).

## Melee bench: F19

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 201 over 6 battles (33.5 per battle, most in one battle 113). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.8 | 98.6 | 201 / 210 | 1.12 | 22.8% | 37871 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 22.8% | 201 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 14.6% | 5 |
| krillr.mini.JointStrike 2.0.0 | 3.3 | 12.0% | 1 |
| mld.Infinity 2.2 | 3.5 | 11.8% | 3 |
| erdnis.Rover 0.3 | 5.0 | 10.1% | 0 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.0% | 0 |
| mbh.Mbh 0.1 | 7.2 | 7.0% | 0 |
| pac.ABC 2.1 | 8.0 | 6.7% | 0 |
| pbg.R2D2 1.0 | 8.7 | 5.8% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 97.5 | 32 / 35 | 6023 |
| 2 | 1 | 74.0 | 100.0 | 35 / 35 | 6392 |
| 3 | 1 | 73.8 | 98.7 | 33 / 35 | 6451 |
| 4 | 1 | 74.7 | 100.0 | 35 / 35 | 6858 |
| 5 | 1 | 74.2 | 99.7 | 34 / 35 | 6270 |
| 6 | 1 | 72.8 | 95.9 | 32 / 35 | 5877 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 114 | 99% |
| krillr.mini.JointStrike 2.0.0 | 38 | 97% |
| mld.Infinity 2.2 | 20 | 100% |
| erdnis.Rover 0.3 | 15 | 100% |
| pac.ABC 2.1 | 10 | 100% |
| patson.PatsonTestBot 1.0 | 4 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 10 of 210 rounds, at a mean tick of 742. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| krillr.mini.JointStrike 2.0.0 | 4 | 40% | 39 |
| davidalves.net.DuelistMiniMelee 1.2 | 3 | 30% | 63 |
| mld.Infinity 2.2 | 1 | 10% | 33 |
| erdnis.Rover 0.3 | 1 | 10% | 23 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 20 |
| pac.ABC 2.1 | 0 | 0% | 10 |
| mbh.Mbh 0.1 | 0 | 0% | 9 |
| pbg.R2D2 1.0 | 0 | 0% | 9 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 129212 melee ticks, 46480 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 39 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 43399 sent, 38650 reached their opponent, 8660 virtual hits (22.4% of those reached).

## Melee bench: F20

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 101 over 6 battles (16.8 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 90.7 | 126 / 210 | 1.84 | 20.5% | 36258 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 20.5% | 126 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.6% | 43 |
| catcat20.Rabbit 0.001 | 3.5 | 11.2% | 21 |
| fwb.Nine 1.0.1 | 3.7 | 11.6% | 17 |
| nz.jdc.nano.GridFu 1.0 | 4.8 | 10.0% | 1 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.4% | 0 |
| bayen.nut.Squirrel 1.615 | 7.5 | 6.5% | 1 |
| ntc.ControlledChaos 1.1.4 | 8.2 | 5.6% | 1 |
| djdjdj.NanoSkunk10 1.0 | 8.3 | 6.0% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 94.3 | 24 / 35 | 6242 |
| 2 | 1 | 70.5 | 89.5 | 22 / 35 | 5887 |
| 3 | 1 | 68.2 | 85.1 | 15 / 35 | 5350 |
| 4 | 1 | 69.9 | 88.9 | 17 / 35 | 5818 |
| 5 | 1 | 72.9 | 96.5 | 28 / 35 | 6511 |
| 6 | 1 | 71.2 | 89.8 | 20 / 35 | 6450 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 81 | 72% |
| catcat20.Rabbit 0.001 | 35 | 63% |
| fwb.Nine 1.0.1 | 33 | 82% |
| nz.jdc.nano.GridFu 1.0 | 11 | 100% |
| m3thos.mini.Eva01 0.5.5 | 5 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 1053. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 44 | 52% | 94 |
| catcat20.Rabbit 0.001 | 18 | 21% | 49 |
| fwb.Nine 1.0.1 | 14 | 17% | 26 |
| m3thos.mini.Eva01 0.5.5 | 3 | 4% | 11 |
| ntc.ControlledChaos 1.1.4 | 2 | 2% | 3 |
| nz.jdc.nano.GridFu 1.0 | 1 | 1% | 18 |
| bayen.nut.Squirrel 1.615 | 1 | 1% | 5 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 200 rounds): 166055 melee ticks, 50990 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 33 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 51195 sent, 46586 reached their opponent, 10478 virtual hits (22.5% of those reached).

## Melee bench: F21

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 303 over 6 battles (50.5 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 95.1 | 152 / 210 | 1.44 | 21.5% | 36745 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 21.5% | 152 |
| eem.EvBot v4.6.16 | 2.0 | 15.9% | 40 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.4% | 7 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.3% | 5 |
| eld.Hmm 1.0 | 5.2 | 8.5% | 7 |
| oa.weak.BotherBot 0.1 | 5.8 | 7.4% | 0 |
| fire219.CatBot 1.0 | 7.5 | 5.9% | 0 |
| el.JumpShoot 0.2 | 7.7 | 5.8% | 0 |
| PSW.Relentless 0.1 | 8.8 | 5.2% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 94.9 | 27 / 35 | 6061 |
| 2 | 1 | 71.5 | 94.0 | 24 / 35 | 5943 |
| 3 | 1 | 72.7 | 94.6 | 26 / 35 | 6304 |
| 4 | 1 | 72.0 | 95.2 | 25 / 35 | 5805 |
| 5 | 1 | 72.6 | 96.2 | 24 / 35 | 6398 |
| 6 | 1 | 72.6 | 95.6 | 26 / 35 | 6234 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 131 | 77% |
| dummy.mini.Scimitar 1.01 | 34 | 88% |
| cf.RiO.RiOx 4.2.1 | 14 | 86% |
| eld.Hmm 1.0 | 11 | 36% |
| oa.weak.BotherBot 0.1 | 3 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 1347. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 33 | 54% | 105 |
| dummy.mini.Scimitar 1.01 | 11 | 18% | 62 |
| eld.Hmm 1.0 | 7 | 11% | 18 |
| cf.RiO.RiOx 4.2.1 | 5 | 8% | 17 |
| el.JumpShoot 0.2 | 1 | 2% | 2 |
| PSW.Relentless 0.1 | 1 | 2% | 1 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 5 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 176658 melee ticks, 80769 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 118 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 118 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 52349 sent, 47635 reached their opponent, 8093 virtual hits (17.0% of those reached).

## Melee bench: F22

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 204 over 6 battles (34.0 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 93.2 | 122 / 210 | 1.61 | 20.1% | 32588 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 20.1% | 122 |
| pe.SandboxDT 2.71m | 2.0 | 16.5% | 54 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.8% | 26 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.3% | 7 |
| bigpete.Stewie 1.0 | 5.0 | 10.4% | 0 |
| yk.JahRoslav 1.1 | 6.3 | 7.2% | 1 |
| gg.Squaraus 0.6 | 7.0 | 6.2% | 0 |
| tad.Dalek98 0.98 | 7.7 | 5.8% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.4% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 95.6 | 25 / 35 | 5504 |
| 2 | 1 | 70.1 | 91.4 | 16 / 35 | 5103 |
| 3 | 1 | 72.1 | 96.2 | 23 / 35 | 5703 |
| 4 | 1 | 70.4 | 90.2 | 17 / 35 | 5545 |
| 5 | 1 | 71.8 | 93.7 | 23 / 35 | 5777 |
| 6 | 1 | 70.1 | 92.4 | 18 / 35 | 4956 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 68 | 50% |
| kvk.HebusLeTroll 0.35 | 50 | 60% |
| jlm.javaDisturbance 0.59 | 46 | 87% |
| bigpete.Stewie 1.0 | 16 | 100% |
| yk.JahRoslav 1.1 | 2 | 50% |
| tad.Dalek98 0.98 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 1094. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 45 | 50% | 89 |
| kvk.HebusLeTroll 0.35 | 31 | 34% | 56 |
| jlm.javaDisturbance 0.59 | 12 | 13% | 43 |
| yk.JahRoslav 1.1 | 1 | 1% | 3 |
| bigpete.Stewie 1.0 | 0 | 0% | 15 |
| tad.Dalek98 0.98 | 0 | 0% | 2 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 165051 melee ticks, 55693 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 41 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 51824 sent, 47091 reached their opponent, 7270 virtual hits (15.4% of those reached).

## Melee bench: F23

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 286 over 6 battles (47.7 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.4 | 98.2 | 188 / 210 | 1.16 | 23.0% | 40211 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 23.0% | 188 |
| pe.SandboxLump 1.52 | 2.0 | 16.4% | 13 |
| cre.Karolos 0.32 | 3.0 | 13.9% | 5 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 9.5% | 2 |
| stelo.RamTrackSurfer 1.2 | 5.0 | 9.3% | 2 |
| cw.megas.Blade 0.8 | 6.3 | 8.4% | 0 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.3 | 8.5% | 0 |
| sample.Walls 1.0 | 8.0 | 6.8% | 0 |
| cli.WasteOfAmmo 1.0 | 9.2 | 2.4% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.6 | 97.1 | 27 / 35 | 6582 |
| 2 | 1 | 74.6 | 99.0 | 33 / 35 | 6755 |
| 3 | 1 | 74.6 | 99.7 | 34 / 35 | 6593 |
| 4 | 1 | 73.9 | 95.6 | 27 / 35 | 6604 |
| 5 | 1 | 74.6 | 99.4 | 34 / 35 | 6648 |
| 6 | 1 | 74.9 | 98.4 | 33 / 35 | 7029 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 114 | 93% |
| cre.Karolos 0.32 | 63 | 95% |
| stelo.RamTrackSurfer 1.2 | 12 | 92% |
| stelo.AreaTargetingBot 1.1 | 7 | 86% |
| sample.Walls 1.0 | 3 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 24 of 210 rounds, at a mean tick of 870. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 10 | 42% | 96 |
| cre.Karolos 0.32 | 7 | 29% | 58 |
| stelo.RamTrackSurfer 1.2 | 2 | 8% | 19 |
| stelo.AreaTargetingBot 1.1 | 2 | 8% | 11 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 4% | 10 |
| cw.megas.Blade 0.8 | 0 | 0% | 4 |
| sample.Walls 1.0 | 0 | 0% | 4 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 124777 melee ticks, 53397 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 41 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 39003 sent, 34269 reached their opponent, 10028 virtual hits (29.3% of those reached).

## Melee bench: F24

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 405 over 6 battles (67.5 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 82.6 | 94 / 210 | 2.56 | 17.1% | 24859 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 17.1% | 94 |
| rz.GlowBlowMelee 1.4 | 2.3 | 14.2% | 36 |
| davidalves.Phoenix 0.54 | 3.5 | 12.9% | 33 |
| florent.XSeries.X2 0.12 | 4.0 | 12.7% | 19 |
| pedersen.Ugluk 1.1.1 | 4.2 | 12.4% | 19 |
| oog.melee.Corsair 1.0 | 6.0 | 9.4% | 7 |
| lunchie.Lunchbox 0.93 | 7.5 | 6.0% | 1 |
| stelo.SoJNanoMelee 1.1 | 7.5 | 6.1% | 3 |
| as.FrankTheTank 1.3 | 9.5 | 4.6% | 0 |
| evd.X1 0.01 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 79.0 | 12 / 35 | 3972 |
| 2 | 1 | 65.9 | 80.6 | 16 / 35 | 4263 |
| 3 | 1 | 66.8 | 83.8 | 16 / 35 | 4241 |
| 4 | 1 | 67.2 | 86.3 | 16 / 35 | 4238 |
| 5 | 1 | 66.6 | 83.2 | 17 / 35 | 3928 |
| 6 | 1 | 66.7 | 82.9 | 17 / 35 | 4217 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 42 | 67% |
| davidalves.Phoenix 0.54 | 32 | 63% |
| florent.XSeries.X2 0.12 | 24 | 75% |
| pedersen.Ugluk 1.1.1 | 23 | 70% |
| oog.melee.Corsair 1.0 | 8 | 75% |
| stelo.SoJNanoMelee 1.1 | 3 | 100% |
| as.FrankTheTank 1.3 | 3 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 34 | 28% | 59 |
| davidalves.Phoenix 0.54 | 24 | 20% | 46 |
| florent.XSeries.X2 0.12 | 21 | 17% | 38 |
| pedersen.Ugluk 1.1.1 | 19 | 16% | 32 |
| oog.melee.Corsair 1.0 | 7 | 6% | 18 |
| evd.X1 0.01 | 4 | 3% | 4 |
| stelo.SoJNanoMelee 1.1 | 3 | 2% | 6 |
| as.FrankTheTank 1.3 | 3 | 2% | 3 |
| lunchie.Lunchbox 0.93 | 2 | 2% | 4 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 140487 melee ticks, 42841 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 48 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 46778 sent, 41751 reached their opponent, 7494 virtual hits (17.9% of those reached).

## Melee bench: F25

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 509 over 6 battles (84.8 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.1 | 137 / 210 | 2.07 | 18.9% | 25578 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 18.9% | 137 |
| voidious.mini.BrokenSword 2.0.3 | 2.7 | 13.5% | 17 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 12.6% | 13 |
| jdw.Hurricane 1.4 | 3.3 | 12.3% | 26 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.4% | 10 |
| ds.Oo 2.2 | 5.7 | 9.1% | 5 |
| adt.Ar2 1.1 | 7.3 | 7.1% | 1 |
| awesomeness.Elite 1.0 | 8.0 | 6.6% | 1 |
| gjr.Cephalosporin 0.1 | 8.7 | 5.9% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 88.9 | 26 / 35 | 4569 |
| 2 | 1 | 69.6 | 90.2 | 23 / 35 | 4428 |
| 3 | 1 | 69.1 | 90.8 | 24 / 35 | 4225 |
| 4 | 1 | 68.6 | 86.7 | 23 / 35 | 4566 |
| 5 | 1 | 67.3 | 84.4 | 23 / 35 | 3916 |
| 6 | 1 | 67.5 | 87.9 | 18 / 35 | 3874 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 48 | 90% |
| jdw.Hurricane 1.4 | 40 | 83% |
| voidious.micro.BlitzBat 1.05 | 34 | 82% |
| gre.svman4.Morfeas 1.4.1 | 16 | 56% |
| ds.Oo 2.2 | 11 | 73% |
| awesomeness.Elite 1.0 | 7 | 100% |
| gjr.Cephalosporin 0.1 | 5 | 100% |
| adt.Ar2 1.1 | 2 | 100% |
| amk.ChumbaMini 0.2 | 2 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 17 | 22% | 53 |
| jdw.Hurricane 1.4 | 14 | 18% | 42 |
| ds.Oo 2.2 | 11 | 14% | 23 |
| voidious.micro.BlitzBat 1.05 | 10 | 13% | 45 |
| gre.svman4.Morfeas 1.4.1 | 8 | 10% | 19 |
| adt.Ar2 1.1 | 7 | 9% | 10 |
| awesomeness.Elite 1.0 | 5 | 6% | 9 |
| amk.ChumbaMini 0.2 | 1 | 1% | 4 |
| gjr.Cephalosporin 0.1 | 0 | 0% | 4 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 126591 melee ticks, 33197 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 32 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 44568 sent, 39752 reached their opponent, 6752 virtual hits (17.0% of those reached).

## Melee bench: F26

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 830 over 6 battles (138.3 per battle, most in one battle 238). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 94.5 | 160 / 210 | 1.50 | 21.8% | 40495 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 21.8% | 160 |
| ak.Fermat 2.0 | 2.0 | 14.6% | 28 |
| lrem.Spectre 0.4.4 | 3.3 | 12.4% | 9 |
| shu.nitro.LENIN .T34 | 3.7 | 11.8% | 9 |
| js.PinBall 1.6 | 5.0 | 10.3% | 4 |
| jaybot.adv.bots.JayBot 2.0 | 6.2 | 9.3% | 1 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 8.2% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 6.8% | 1 |
| sample.SpinBot 1.0 | 9.0 | 3.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 93.0 | 25 / 35 | 6353 |
| 2 | 1 | 73.2 | 94.0 | 27 / 35 | 6939 |
| 3 | 1 | 74.2 | 98.7 | 31 / 35 | 6876 |
| 4 | 1 | 73.2 | 96.5 | 29 / 35 | 6666 |
| 5 | 1 | 72.0 | 91.4 | 22 / 35 | 6648 |
| 6 | 1 | 72.6 | 93.3 | 26 / 35 | 7013 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 71 | 77% |
| lrem.Spectre 0.4.4 | 46 | 85% |
| shu.nitro.LENIN .T34 | 40 | 90% |
| js.PinBall 1.6 | 13 | 92% |
| jaybot.adv.bots.JayBot 2.0 | 8 | 100% |
| gh.mini.GrubbmOne 1.0 | 4 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |
| logiblocs.SittingDroid 1.0 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 1027. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 22 | 38% | 70 |
| shu.nitro.LENIN .T34 | 10 | 17% | 57 |
| lrem.Spectre 0.4.4 | 8 | 14% | 41 |
| js.PinBall 1.6 | 5 | 9% | 16 |
| jaybot.adv.bots.JayBot 2.0 | 3 | 5% | 14 |
| gh.mini.GrubbmOne 1.0 | 1 | 2% | 5 |
| sample.SpinBot 1.0 | 1 | 2% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 0 | 0% | 6 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 158511 melee ticks, 56260 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 24 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 50972 sent, 46197 reached their opponent, 11148 virtual hits (24.1% of those reached).

## Melee bench: F27

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 103 over 6 battles (17.2 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 94.7 | 176 / 210 | 1.48 | 21.2% | 32619 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 21.2% | 176 |
| mk.Alpha 0.2.1 | 2.2 | 13.7% | 22 |
| EH.Eagle 1.0.6 | 2.8 | 11.0% | 2 |
| sheldor.melee.nano.TestMelee 0.1 | 5.5 | 9.0% | 3 |
| throxbot.ThroxBot 0.1 | 5.5 | 8.9% | 4 |
| wee.Gem 1.8.4 | 6.3 | 8.5% | 1 |
| techdude.kombat.FlamingKombat 1.5 | 6.3 | 8.4% | 1 |
| joe.ADinosaur 1.0 | 7.0 | 8.3% | 0 |
| caimano.Furia_Ceca 0.22 | 8.3 | 6.9% | 1 |
| cs.Grudge 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 95.2 | 32 / 35 | 5544 |
| 2 | 1 | 71.6 | 94.9 | 29 / 35 | 5709 |
| 3 | 1 | 70.6 | 92.7 | 30 / 35 | 5000 |
| 4 | 1 | 71.7 | 97.5 | 30 / 35 | 5587 |
| 5 | 1 | 68.9 | 88.6 | 21 / 35 | 5024 |
| 6 | 1 | 72.7 | 99.4 | 34 / 35 | 5755 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 107 | 94% |
| EH.Eagle 1.0.6 | 40 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 92% |
| throxbot.ThroxBot 0.1 | 9 | 89% |
| techdude.kombat.FlamingKombat 1.5 | 5 | 100% |
| wee.Gem 1.8.4 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 75% |
| joe.ADinosaur 1.0 | 3 | 100% |

Hadur died in 34 of 210 rounds, at a mean tick of 655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 13 | 38% | 94 |
| throxbot.ThroxBot 0.1 | 7 | 21% | 18 |
| joe.ADinosaur 1.0 | 6 | 18% | 16 |
| EH.Eagle 1.0.6 | 4 | 12% | 38 |
| sheldor.melee.nano.TestMelee 0.1 | 2 | 6% | 12 |
| wee.Gem 1.8.4 | 1 | 3% | 10 |
| caimano.Furia_Ceca 0.22 | 1 | 3% | 10 |
| techdude.kombat.FlamingKombat 1.5 | 0 | 0% | 9 |
| cs.Grudge 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 202 rounds): 132307 melee ticks, 41311 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 34 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 42669 sent, 37795 reached their opponent, 8994 virtual hits (23.8% of those reached).

## Melee bench: F28

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 712 over 6 battles (118.7 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 91.0 | 137 / 210 | 1.81 | 19.0% | 24988 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 19.0% | 137 |
| kid.test.NightFox .2 | 2.2 | 14.6% | 25 |
| uji.Antique 1.0 | 3.0 | 12.7% | 29 |
| pfvicm.Sobieski 7.2.3b | 4.0 | 10.9% | 6 |
| qohnil.blot.BlotBot 3.61 | 4.8 | 10.2% | 8 |
| ahr.ice.Ice 1.0.2 | 6.7 | 8.3% | 4 |
| amk.ChumbaWumba 0.3 | 6.8 | 7.2% | 0 |
| matt.advanced.Katana 1.0 | 8.7 | 6.0% | 1 |
| stelo.Lifestealer 1.0 | 8.7 | 5.8% | 0 |
| stelo.PianistNano 1.2 | 9.2 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 90.5 | 21 / 35 | 4143 |
| 2 | 1 | 67.8 | 89.2 | 18 / 35 | 4037 |
| 3 | 1 | 66.1 | 83.2 | 21 / 35 | 3833 |
| 4 | 1 | 69.2 | 95.2 | 24 / 35 | 4169 |
| 5 | 1 | 70.4 | 94.9 | 28 / 35 | 4559 |
| 6 | 1 | 69.6 | 92.7 | 25 / 35 | 4247 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 75 | 79% |
| uji.Antique 1.0 | 51 | 84% |
| qohnil.blot.BlotBot 3.61 | 16 | 69% |
| pfvicm.Sobieski 7.2.3b | 8 | 88% |
| ahr.ice.Ice 1.0.2 | 7 | 71% |
| amk.ChumbaWumba 0.3 | 7 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| matt.advanced.Katana 1.0 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 810. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 23 | 29% | 50 |
| uji.Antique 1.0 | 15 | 19% | 60 |
| qohnil.blot.BlotBot 3.61 | 10 | 13% | 27 |
| pfvicm.Sobieski 7.2.3b | 10 | 13% | 25 |
| ahr.ice.Ice 1.0.2 | 6 | 8% | 21 |
| stelo.Lifestealer 1.0 | 4 | 5% | 7 |
| amk.ChumbaWumba 0.3 | 2 | 3% | 10 |
| matt.advanced.Katana 1.0 | 2 | 3% | 6 |
| stelo.PianistNano 1.2 | 2 | 3% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 136414 melee ticks, 41895 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 49 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 46008 sent, 41125 reached their opponent, 5992 virtual hits (14.6% of those reached).

## Melee bench: F29

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 607 over 6 battles (101.2 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 87.7 | 104 / 210 | 2.10 | 19.1% | 28737 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 19.1% | 104 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 15.5% | 55 |
| deewiant.Anomaly 0.2 | 2.7 | 15.0% | 42 |
| myl.micro.Troodon 1.10 | 4.5 | 11.7% | 3 |
| jok.PheonixM 0.1.2 | 4.5 | 11.2% | 5 |
| ph.melee.ArcherME 0.3 | 6.2 | 8.0% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.2 | 6.1% | 0 |
| DBall.Anarchy 0.1 | 7.7 | 5.7% | 1 |
| ap.Frederick 1.1 | 9.3 | 4.1% | 0 |
| jangs.ns51 1.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 91.4 | 19 / 35 | 4889 |
| 2 | 1 | 69.8 | 87.6 | 17 / 35 | 4747 |
| 3 | 1 | 69.5 | 87.3 | 20 / 35 | 4666 |
| 4 | 1 | 67.8 | 83.2 | 11 / 35 | 4649 |
| 5 | 1 | 70.2 | 89.8 | 20 / 35 | 5021 |
| 6 | 1 | 69.5 | 87.0 | 17 / 35 | 4765 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 64 | 64% |
| zyx.mega.YersiniaPestis 3.1 | 52 | 58% |
| jok.PheonixM 0.1.2 | 15 | 100% |
| myl.micro.Troodon 1.10 | 13 | 92% |
| ph.melee.ArcherME 0.3 | 2 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |
| DBall.Anarchy 0.1 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 998. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 49 | 44% | 88 |
| zyx.mega.YersiniaPestis 3.1 | 36 | 32% | 69 |
| myl.micro.Troodon 1.10 | 14 | 13% | 28 |
| jok.PheonixM 0.1.2 | 3 | 3% | 12 |
| DBall.Anarchy 0.1 | 2 | 2% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 2% | 4 |
| ph.melee.ArcherME 0.3 | 1 | 1% | 3 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 169179 melee ticks, 54286 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 34 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 54999 sent, 50147 reached their opponent, 7618 virtual hits (15.2% of those reached).

## Melee bench: F30

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 648 over 6 battles (108.0 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 79.8 | 63 / 210 | 2.82 | 16.2% | 25259 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 16.2% | 63 |
| catcat20.Matcha 0.006 | 2.5 | 14.3% | 44 |
| darkcanuck.B26354 1.06 | 3.3 | 13.4% | 44 |
| oog.melee.Capulet 1.2 | 3.5 | 13.1% | 34 |
| stelo.PastFuture 2.3.2 | 4.7 | 12.0% | 16 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.0% | 5 |
| ntc.Opposite 1.5 | 7.5 | 6.9% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 8.0 | 6.4% | 3 |
| tripphippy.Alice 1.1 | 8.5 | 6.2% | 1 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 83.5 | 14 / 35 | 4095 |
| 2 | 1 | 64.8 | 78.4 | 9 / 35 | 4309 |
| 3 | 1 | 66.4 | 83.5 | 10 / 35 | 4383 |
| 4 | 1 | 64.8 | 81.3 | 11 / 35 | 4019 |
| 5 | 1 | 64.6 | 77.8 | 9 / 35 | 4266 |
| 6 | 1 | 63.9 | 74.3 | 10 / 35 | 4187 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 43 | 47% |
| oog.melee.Capulet 1.2 | 26 | 50% |
| darkcanuck.B26354 1.06 | 25 | 48% |
| stelo.PastFuture 2.3.2 | 14 | 79% |
| intruder.PrairieWolf 2.61 | 7 | 57% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 50% |
| tripphippy.Alice 1.1 | 1 | 100% |

Hadur died in 153 of 210 rounds, at a mean tick of 913. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 50 | 33% | 71 |
| darkcanuck.B26354 1.06 | 35 | 23% | 46 |
| oog.melee.Capulet 1.2 | 26 | 17% | 41 |
| stelo.PastFuture 2.3.2 | 22 | 14% | 30 |
| intruder.PrairieWolf 2.61 | 6 | 4% | 10 |
| fowl3628800.LightningBolt 2.6.0 | 5 | 3% | 6 |
| ntc.Opposite 1.5 | 2 | 1% | 3 |
| tripphippy.Alice 1.1 | 2 | 1% | 2 |
| GarmBox.Anger 1.0 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 168297 melee ticks, 36944 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 42 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 0.

Targeting waves (209 rounds): 52933 sent, 48050 reached their opponent, 7973 virtual hits (16.6% of those reached).

## Melee bench: F31

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 385 over 6 battles (64.2 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 82.0 | 68 / 210 | 2.62 | 16.6% | 24116 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.3 | 16.8% | 78 |
| hadur117.Hadur 3.20aa | 1.7 | 16.6% | 68 |
| gh.mini.Griezel 0.2 | 3.0 | 13.8% | 47 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 11.2% | 7 |
| d414.nano.Quantum 1.0.0 | 4.5 | 11.4% | 7 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.9% | 4 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.6% | 1 |
| fm.mammillarias 1.3 | 8.2 | 5.4% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.7 | 5.1% | 0 |
| tlp.ThreeLeggedPig 1 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.3 | 87.0 | 13 / 35 | 4063 |
| 2 | 2 | 65.5 | 80.0 | 10 / 35 | 4009 |
| 3 | 1 | 66.2 | 82.5 | 10 / 35 | 4421 |
| 4 | 2 | 64.0 | 77.5 | 8 / 35 | 3778 |
| 5 | 2 | 63.7 | 77.1 | 9 / 35 | 3460 |
| 6 | 1 | 68.1 | 87.6 | 18 / 35 | 4385 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 54 | 44% |
| gh.mini.Griezel 0.2 | 49 | 57% |
| spinnercat.micro.Tyger 0.1 | 9 | 100% |
| d414.nano.Quantum 1.0.0 | 7 | 71% |
| gh.nano.Grofvuil 0.2 | 3 | 67% |

Hadur died in 146 of 210 rounds, at a mean tick of 909. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 54 | 37% | 76 |
| gh.mini.Griezel 0.2 | 46 | 32% | 77 |
| d414.nano.Quantum 1.0.0 | 12 | 8% | 17 |
| spinnercat.micro.Tyger 0.1 | 10 | 7% | 15 |
| gh.nano.Grofvuil 0.2 | 9 | 6% | 13 |
| timmit.nano.TimDog 0.33 | 7 | 5% | 8 |
| fm.mammillarias 1.3 | 4 | 3% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 159549 melee ticks, 42196 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 34 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 50582 sent, 45698 reached their opponent, 7240 virtual hits (15.8% of those reached).

## Melee bench: F32

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 212 over 6 battles (35.3 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 89.6 | 118 / 210 | 1.93 | 18.7% | 28325 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 18.7% | 118 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.6% | 49 |
| apc.botM 3.0 | 3.7 | 11.9% | 23 |
| lxx.ConceptA 0.8 | 4.0 | 10.2% | 2 |
| vjik.UnViolation 1.1 | 5.2 | 9.8% | 6 |
| bayen.UbaMicro 1.4 | 5.5 | 8.8% | 4 |
| panzer.Panzer 0.2 | 7.0 | 7.5% | 2 |
| yk.JahMicro 1.0 | 7.8 | 7.0% | 3 |
| conscience.Electron 1.3g | 9.0 | 6.2% | 0 |
| donjezza.Jezza 1.0 | 9.8 | 5.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 87.3 | 16 / 35 | 4577 |
| 2 | 1 | 67.6 | 89.5 | 20 / 35 | 4616 |
| 3 | 1 | 69.0 | 91.4 | 22 / 35 | 4986 |
| 4 | 1 | 70.8 | 96.2 | 27 / 35 | 4968 |
| 5 | 1 | 67.0 | 86.3 | 16 / 35 | 4725 |
| 6 | 1 | 67.2 | 87.0 | 17 / 35 | 4453 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 92 | 60% |
| apc.botM 3.0 | 32 | 66% |
| vjik.UnViolation 1.1 | 16 | 88% |
| lxx.ConceptA 0.8 | 13 | 100% |
| yk.JahMicro 1.0 | 6 | 67% |
| bayen.UbaMicro 1.4 | 6 | 67% |
| panzer.Panzer 0.2 | 5 | 80% |
| donjezza.Jezza 1.0 | 4 | 50% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 45 | 48% | 91 |
| apc.botM 3.0 | 15 | 16% | 37 |
| lxx.ConceptA 0.8 | 11 | 12% | 20 |
| bayen.UbaMicro 1.4 | 7 | 7% | 11 |
| vjik.UnViolation 1.1 | 6 | 6% | 32 |
| yk.JahMicro 1.0 | 3 | 3% | 7 |
| panzer.Panzer 0.2 | 3 | 3% | 7 |
| donjezza.Jezza 1.0 | 2 | 2% | 3 |
| conscience.Electron 1.3g | 1 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 123648 melee ticks, 56165 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 47 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 2.

Targeting waves (204 rounds): 42473 sent, 37651 reached their opponent, 6790 virtual hits (18.0% of those reached).

## Melee bench: F33

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 292 over 6 battles (48.7 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 91.4 | 133 / 210 | 1.78 | 20.0% | 30413 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 20.0% | 133 |
| maribo.Quester 0.3 | 2.0 | 15.9% | 30 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.2% | 15 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 11.2% | 17 |
| labg.Cataclysm 2.05 | 4.8 | 10.2% | 12 |
| baal.nano.N 1.42 | 6.0 | 9.0% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 8.2% | 2 |
| zyx.micro.Ant 1.1 | 8.5 | 5.3% | 0 |
| sanja.First 0.1 | 8.5 | 5.0% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 93.0 | 23 / 35 | 4936 |
| 2 | 1 | 70.6 | 89.8 | 22 / 35 | 5223 |
| 3 | 1 | 69.9 | 90.2 | 21 / 35 | 4916 |
| 4 | 1 | 70.3 | 91.1 | 20 / 35 | 5113 |
| 5 | 1 | 72.0 | 95.2 | 26 / 35 | 5263 |
| 6 | 1 | 69.6 | 88.9 | 21 / 35 | 4962 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 80 | 80% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 35 | 83% |
| gre.svman4.Leonidas 1.3.2 | 32 | 84% |
| labg.Cataclysm 2.05 | 10 | 80% |
| baal.nano.N 1.42 | 4 | 100% |
| kinsen.melee.Angsaichmophobia 1.8c | 3 | 33% |

Hadur died in 81 of 210 rounds, at a mean tick of 1077. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 28 | 35% | 87 |
| gre.svman4.Leonidas 1.3.2 | 20 | 25% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 17% | 48 |
| labg.Cataclysm 2.05 | 10 | 12% | 18 |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 6% | 6 |
| baal.nano.N 1.42 | 1 | 1% | 10 |
| zyx.micro.Ant 1.1 | 1 | 1% | 2 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 179341 melee ticks, 56650 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 48 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 56442 sent, 51550 reached their opponent, 7290 virtual hits (14.1% of those reached).

## Melee bench: F34

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 678 over 6 battles (113.0 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 88.1 | 99 / 210 | 2.07 | 19.0% | 32690 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 19.0% | 99 |
| kid.Gladiator .7.2 | 2.3 | 16.6% | 42 |
| stelo.Spread 0.9 | 2.7 | 16.1% | 56 |
| jcs.Seth 1.8 | 4.2 | 11.1% | 12 |
| tcf.Reach 3 | 4.8 | 10.3% | 1 |
| cli.Dancer 1.1 | 6.2 | 8.9% | 0 |
| ratosh.Wesco 1.4 | 6.8 | 7.1% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.8% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.3% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 86.7 | 14 / 35 | 5337 |
| 2 | 1 | 69.8 | 88.6 | 19 / 35 | 5422 |
| 3 | 1 | 68.8 | 85.4 | 15 / 35 | 5306 |
| 4 | 1 | 69.9 | 87.9 | 18 / 35 | 5434 |
| 5 | 1 | 70.2 | 88.6 | 16 / 35 | 5614 |
| 6 | 1 | 70.7 | 91.4 | 17 / 35 | 5577 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 71 | 63% |
| kid.Gladiator .7.2 | 61 | 64% |
| jcs.Seth 1.8 | 21 | 62% |
| cli.Dancer 1.1 | 2 | 100% |
| tcf.Reach 3 | 1 | 0% |
| ratosh.Wesco 1.4 | 1 | 0% |

Hadur died in 117 of 210 rounds, at a mean tick of 1060. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 45 | 38% | 80 |
| kid.Gladiator .7.2 | 35 | 30% | 71 |
| jcs.Seth 1.8 | 16 | 14% | 34 |
| tcf.Reach 3 | 7 | 6% | 10 |
| ratosh.Wesco 1.4 | 4 | 3% | 4 |
| cli.Dancer 1.1 | 2 | 2% | 8 |
| sample.VelociRobot 1.0 | 1 | 1% | 1 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 164956 melee ticks, 62276 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 39 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 51579 sent, 46776 reached their opponent, 7928 virtual hits (16.9% of those reached).

## Melee bench: F35

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 477 over 6 battles (79.5 per battle, most in one battle 116). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 83.6 | 46 / 210 | 2.48 | 16.4% | 23657 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.2% | 136 |
| hadur117.Hadur 3.20aa | 2.0 | 16.4% | 46 |
| gh.mini.Gruwel 0.9 | 3.3 | 12.9% | 13 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.8 | 12.0% | 12 |
| rz.HawkOnFire 0.1 | 4.8 | 11.6% | 4 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6.7 | 6.2% | 0 |
| wit.Chuliath 1.0 | 7.3 | 6.2% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.5 | 6.0% | 0 |
| dans.Cinnamon 1.2 | 9.2 | 4.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 81.0 | 4 / 35 | 3527 |
| 2 | 2 | 65.9 | 84.8 | 7 / 35 | 3813 |
| 3 | 2 | 67.4 | 87.0 | 12 / 35 | 4299 |
| 4 | 2 | 65.8 | 84.8 | 6 / 35 | 3871 |
| 5 | 2 | 65.5 | 82.5 | 8 / 35 | 3910 |
| 6 | 2 | 65.7 | 81.6 | 9 / 35 | 4237 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 101 | 25% |
| dmh.robocode.robot.BlackDeath 9.2 | 16 | 75% |
| gh.mini.Gruwel 0.9 | 12 | 33% |
| rz.HawkOnFire 0.1 | 8 | 63% |

Hadur died in 169 of 210 rounds, at a mean tick of 976. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 95 | 56% | 119 |
| gh.mini.Gruwel 0.9 | 27 | 16% | 34 |
| dmh.robocode.robot.BlackDeath 9.2 | 19 | 11% | 29 |
| rz.HawkOnFire 0.1 | 15 | 9% | 20 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 2% | 3 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |
| dans.Cinnamon 1.2 | 2 | 1% | 2 |
| wit.Chuliath 1.0 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 150743 melee ticks, 55560 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 38 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 46392 sent, 41376 reached their opponent, 6454 virtual hits (15.6% of those reached).

## Melee bench: F36

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 680 over 6 battles (113.3 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 93.3 | 165 / 210 | 1.60 | 21.3% | 34126 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 21.3% | 165 |
| alpha.RainingFire 1.0 | 2.7 | 12.5% | 12 |
| bzdp.Pansy 2.1 | 3.0 | 12.3% | 11 |
| mz.Cork 0.1 | 4.2 | 11.0% | 5 |
| bvh.micro.Freya 0.3 | 5.0 | 10.6% | 6 |
| m3thos.Eva02 0.7.1 | 5.8 | 9.5% | 7 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.2% | 3 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 5.7% | 0 |
| dl.BetterWalls 1.0 | 9.0 | 4.8% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 87.6 | 25 / 35 | 5287 |
| 2 | 1 | 70.2 | 89.8 | 23 / 35 | 5262 |
| 3 | 1 | 72.5 | 94.0 | 29 / 35 | 6139 |
| 4 | 1 | 72.9 | 98.1 | 32 / 35 | 5752 |
| 5 | 1 | 72.8 | 95.6 | 29 / 35 | 6143 |
| 6 | 1 | 71.9 | 94.9 | 27 / 35 | 5543 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 44 | 89% |
| alpha.RainingFire 1.0 | 40 | 100% |
| mz.Cork 0.1 | 32 | 91% |
| bvh.micro.Freya 0.3 | 28 | 96% |
| bvh.mini.Fenrir 0.39 | 19 | 100% |
| m3thos.Eva02 0.7.1 | 9 | 100% |
| sample.MyFirstRobot 1.0 | 2 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 870. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 10 | 20% | 45 |
| bvh.micro.Freya 0.3 | 9 | 18% | 30 |
| bzdp.Pansy 2.1 | 8 | 16% | 48 |
| mz.Cork 0.1 | 7 | 14% | 44 |
| bvh.mini.Fenrir 0.39 | 7 | 14% | 20 |
| m3thos.Eva02 0.7.1 | 4 | 8% | 16 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 1 |
| dl.BetterWalls 1.0 | 0 | 0% | 5 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 146748 melee ticks, 44205 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 63 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 49644 sent, 45038 reached their opponent, 9275 virtual hits (20.6% of those reached).

## Melee bench: F37

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 352 over 6 battles (58.7 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 89.0 | 161 / 210 | 1.99 | 19.6% | 35163 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 19.6% | 161 |
| germ.TheMind .2 | 3.2 | 10.3% | 8 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.3 | 10.4% | 8 |
| EBBU.Sim2 1.02 | 4.7 | 9.5% | 2 |
| agrach.Dalek 1.0 | 5.8 | 9.1% | 9 |
| stelo.UntouchableNano 1.3 | 6.0 | 9.1% | 9 |
| lmk.ACPFinal 0.1 | 6.3 | 8.7% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 6.7 | 8.4% | 1 |
| mb.Beast 0.1 | 8.3 | 7.6% | 6 |
| skm.Ryubot 1.0 | 9.7 | 7.2% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 92.7 | 27 / 35 | 5995 |
| 2 | 1 | 71.0 | 95.6 | 31 / 35 | 6321 |
| 3 | 1 | 69.2 | 91.4 | 29 / 35 | 5652 |
| 4 | 1 | 69.0 | 89.8 | 26 / 35 | 5734 |
| 5 | 1 | 66.7 | 80.0 | 24 / 35 | 5714 |
| 6 | 1 | 67.5 | 84.4 | 24 / 35 | 5747 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 31 | 94% |
| stelo.UntouchableNano 1.3 | 28 | 86% |
| com.syncleus.robocode.Dreadnaught 0.1 | 24 | 96% |
| germ.TheMind .2 | 24 | 92% |
| EBBU.Sim2 1.02 | 19 | 95% |
| skm.Ryubot 1.0 | 17 | 94% |
| mb.Beast 0.1 | 15 | 93% |
| lmk.ACPFinal 0.1 | 14 | 93% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 452. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 17 | 33% | 26 |
| com.syncleus.robocode.Dreadnaught 0.1 | 7 | 14% | 39 |
| stelo.UntouchableNano 1.3 | 7 | 14% | 25 |
| agrach.Dalek 1.0 | 4 | 8% | 32 |
| lmk.ACPFinal 0.1 | 4 | 8% | 21 |
| germ.TheMind .2 | 4 | 8% | 20 |
| mb.Beast 0.1 | 4 | 8% | 16 |
| EBBU.Sim2 1.02 | 2 | 4% | 26 |
| skm.Ryubot 1.0 | 0 | 0% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 97680 melee ticks, 26959 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 50 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 3.

Targeting waves (206 rounds): 32912 sent, 28385 reached their opponent, 8271 virtual hits (29.1% of those reached).

## Melee bench: F38

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 715 over 6 battles (119.2 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 84.6 | 104 / 210 | 2.39 | 17.8% | 27566 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.2 | 17.8% | 104 |
| justin.Mallais 14.0 | 1.8 | 16.5% | 66 |
| bvh.mini.Freya 0.55 | 3.5 | 12.0% | 11 |
| bts.mega.Gnarly 1.4 | 3.8 | 11.7% | 17 |
| cs.Wren 1.0 | 5.2 | 10.2% | 1 |
| kdf.KoulDestroyer 1.0 | 5.5 | 10.0% | 7 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.2 | 8.0% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.8 | 6.5% | 2 |
| matt.UnderDark3 2.4.34 | 9.3 | 3.9% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 88.3 | 16 / 35 | 4858 |
| 2 | 1 | 68.3 | 85.7 | 20 / 35 | 4652 |
| 3 | 1 | 68.5 | 87.6 | 20 / 35 | 4649 |
| 4 | 2 | 66.1 | 79.4 | 13 / 35 | 4555 |
| 5 | 1 | 66.4 | 79.0 | 17 / 35 | 4577 |
| 6 | 1 | 67.7 | 87.6 | 18 / 35 | 4275 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 73 | 67% |
| bts.mega.Gnarly 1.4 | 30 | 80% |
| bvh.mini.Freya 0.55 | 18 | 94% |
| kdf.KoulDestroyer 1.0 | 8 | 88% |
| cs.Wren 1.0 | 6 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 48 | 43% | 96 |
| kdf.KoulDestroyer 1.0 | 20 | 18% | 25 |
| bvh.mini.Freya 0.55 | 16 | 14% | 23 |
| bts.mega.Gnarly 1.4 | 13 | 12% | 41 |
| cs.Wren 1.0 | 6 | 5% | 16 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 2% | 3 |
| davidalves.net.DuelistNanoMelee 1.01 | 1 | 1% | 4 |
| bzdp.BoxCar 2.0 | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 141310 melee ticks, 36577 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 39 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 46591 sent, 41433 reached their opponent, 8790 virtual hits (21.2% of those reached).

## Melee bench: F39

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 435 over 6 battles (72.5 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.2 | 100 / 210 | 2.15 | 18.6% | 31330 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 18.6% | 100 |
| bvh.fry.Freya 0.82 | 2.3 | 14.7% | 15 |
| az.Ololobot 0.2.4 | 2.8 | 13.6% | 59 |
| catcat20.Lambda 0.024 | 3.8 | 12.2% | 30 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 7.9% | 2 |
| apollokidd.ApolloKidd 0.9 | 6.2 | 7.8% | 0 |
| gimp.GimpBot 0.1 | 6.5 | 7.9% | 3 |
| stelo.SoRobotNanoMelee 1.2 | 7.3 | 7.1% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.7% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 87.6 | 16 / 35 | 5175 |
| 2 | 1 | 69.1 | 89.8 | 17 / 35 | 5423 |
| 3 | 1 | 69.0 | 90.2 | 18 / 35 | 5115 |
| 4 | 1 | 69.4 | 89.2 | 22 / 35 | 5501 |
| 5 | 1 | 66.8 | 82.9 | 16 / 35 | 4735 |
| 6 | 1 | 67.1 | 83.8 | 11 / 35 | 5381 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 48 | 46% |
| bvh.fry.Freya 0.82 | 46 | 83% |
| catcat20.Lambda 0.024 | 33 | 64% |
| winamp32.micro.MicroMacro 1.0 | 7 | 86% |
| gimp.GimpBot 0.1 | 5 | 80% |
| stelo.SoRobotNanoMelee 1.2 | 4 | 100% |
| apollokidd.ApolloKidd 0.9 | 3 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 1058. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 38 | 34% | 63 |
| bvh.fry.Freya 0.82 | 37 | 33% | 68 |
| catcat20.Lambda 0.024 | 20 | 18% | 39 |
| gimp.GimpBot 0.1 | 4 | 4% | 12 |
| apollokidd.ApolloKidd 0.9 | 4 | 4% | 7 |
| winamp32.micro.MicroMacro 1.0 | 3 | 3% | 9 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 2% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 2 | 2% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 166292 melee ticks, 51109 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 41 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 52099 sent, 47318 reached their opponent, 8301 virtual hits (17.5% of those reached).

## Melee bench: F40

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 299 over 6 battles (49.8 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 91.1 | 142 / 210 | 1.80 | 20.2% | 31731 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 20.2% | 142 |
| kawigi.mini.Coriantumr 1.1 | 2.2 | 14.8% | 28 |
| kano.gamma.KanoGamma 1.8 | 2.8 | 13.4% | 23 |
| mz.AntiGrav 1.0 | 4.2 | 11.3% | 7 |
| Polkwane.SmashMelee 1.0 | 4.8 | 10.1% | 3 |
| stelo.Randomness 1.0 | 6.2 | 8.7% | 6 |
| alpha.BlackIce 1.0 | 6.8 | 8.0% | 2 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.4% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 4.0% | 0 |
| sample.Corners 1.0 | 9.8 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 88.3 | 21 / 35 | 5036 |
| 2 | 1 | 72.4 | 95.9 | 29 / 35 | 5571 |
| 3 | 1 | 70.8 | 92.4 | 24 / 35 | 5271 |
| 4 | 1 | 69.7 | 87.6 | 21 / 35 | 5307 |
| 5 | 1 | 72.4 | 95.2 | 27 / 35 | 5549 |
| 6 | 1 | 69.4 | 87.0 | 20 / 35 | 4997 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 60 | 82% |
| kano.gamma.KanoGamma 1.8 | 48 | 85% |
| mz.AntiGrav 1.0 | 24 | 92% |
| Polkwane.SmashMelee 1.0 | 19 | 95% |
| stelo.Randomness 1.0 | 9 | 78% |
| alpha.BlackIce 1.0 | 4 | 75% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 837. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 33 | 47% | 71 |
| kano.gamma.KanoGamma 1.8 | 14 | 20% | 58 |
| mz.AntiGrav 1.0 | 7 | 10% | 30 |
| stelo.Randomness 1.0 | 5 | 7% | 14 |
| Polkwane.SmashMelee 1.0 | 4 | 6% | 16 |
| alpha.BlackIce 1.0 | 3 | 4% | 7 |
| amk.superstrike.SuperStrike 0.3 | 1 | 1% | 9 |
| sample.Corners 1.0 | 1 | 1% | 3 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 155029 melee ticks, 45605 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 139 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 139 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 50146 sent, 45128 reached their opponent, 9223 virtual hits (20.4% of those reached).

## Melee bench: F41

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 593 over 6 battles (98.8 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 91.0 | 110 / 210 | 1.81 | 19.2% | 29135 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 19.2% | 110 |
| eem.EvBotNG v12.8 | 2.0 | 16.4% | 79 |
| ary.Swarm 1.1 | 3.7 | 12.6% | 9 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.4% | 4 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 10.4% | 6 |
| shrub.Silver v048 | 5.8 | 9.4% | 1 |
| zyx.nano.Ant 1.1 | 7.0 | 7.3% | 0 |
| stelo.Mirror 1.1 | 8.0 | 5.1% | 1 |
| jsal.Jsalbot 1.0 | 9.0 | 4.8% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 92.7 | 18 / 35 | 4799 |
| 2 | 1 | 70.5 | 92.7 | 19 / 35 | 5074 |
| 3 | 1 | 68.2 | 87.0 | 15 / 35 | 4483 |
| 4 | 1 | 69.4 | 89.2 | 18 / 35 | 4954 |
| 5 | 1 | 70.5 | 93.0 | 23 / 35 | 4869 |
| 6 | 1 | 69.9 | 91.4 | 17 / 35 | 4956 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 99 | 47% |
| lessonz.robocode.Oz 0.5.0 | 26 | 92% |
| ary.Swarm 1.1 | 25 | 84% |
| simonton.nano.MeleeSeed 1.8 | 16 | 94% |
| zyx.nano.Ant 1.1 | 1 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |
| shrub.Silver v048 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 1134. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 67 | 64% | 111 |
| ary.Swarm 1.1 | 12 | 11% | 33 |
| simonton.nano.MeleeSeed 1.8 | 9 | 9% | 24 |
| lessonz.robocode.Oz 0.5.0 | 8 | 8% | 29 |
| shrub.Silver v048 | 2 | 2% | 6 |
| zyx.nano.Ant 1.1 | 1 | 1% | 3 |
| stelo.Mirror 1.1 | 1 | 1% | 3 |
| jsal.Jsalbot 1.0 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 159616 melee ticks, 67169 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 72 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 51372 sent, 46325 reached their opponent, 7108 virtual hits (15.3% of those reached).

## Melee bench: F42

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 405 over 6 battles (67.5 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 91.5 | 139 / 210 | 1.77 | 20.3% | 35393 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 20.3% | 139 |
| wompi.Wallaby 5.1 | 2.0 | 15.3% | 36 |
| maribo.mini.MiniQuester 0.1 | 3.2 | 14.0% | 14 |
| ara.Shera 0.88 | 3.8 | 12.9% | 18 |
| amz.NanoClone 1.41 | 5.0 | 8.7% | 1 |
| dsw.StaticD 1.0 | 7.2 | 6.3% | 1 |
| maribo.IotaCT 1.1 | 7.3 | 6.1% | 0 |
| stelo.MirrorMicro 1.0 | 7.5 | 5.9% | 1 |
| mme.NikeEnhanced 2.0 | 8.2 | 5.8% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 91.1 | 25 / 35 | 5975 |
| 2 | 1 | 69.9 | 90.5 | 19 / 35 | 5609 |
| 3 | 1 | 70.2 | 90.8 | 20 / 35 | 5599 |
| 4 | 1 | 70.3 | 89.2 | 24 / 35 | 5861 |
| 5 | 1 | 71.6 | 93.3 | 24 / 35 | 6216 |
| 6 | 1 | 72.1 | 94.0 | 27 / 35 | 6133 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 84 | 85% |
| maribo.mini.MiniQuester 0.1 | 48 | 90% |
| ara.Shera 0.88 | 28 | 71% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |
| dsw.StaticD 1.0 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 936. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 27 | 36% | 93 |
| ara.Shera 0.88 | 23 | 31% | 47 |
| maribo.mini.MiniQuester 0.1 | 15 | 20% | 49 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 3% | 8 |
| dsw.StaticD 1.0 | 2 | 3% | 6 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 2 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 2 |
| amz.NanoClone 1.41 | 1 | 1% | 2 |
| maribo.IotaCT 1.1 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 165924 melee ticks, 49663 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 26 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 52380 sent, 47532 reached their opponent, 9258 virtual hits (19.5% of those reached).

## Melee bench: F43

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 660 over 6 battles (110.0 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 79.8 | 42 / 210 | 2.81 | 16.2% | 26180 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.3% | 138 |
| hadur117.Hadur 3.20aa | 2.0 | 16.2% | 42 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.6% | 23 |
| dummy.micro.Sparrow 2.5 | 4.3 | 11.7% | 6 |
| wcsv.melee.EngineerMelee 0.1 | 4.5 | 11.3% | 2 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.4% | 0 |
| mz.NanoGod 2.02 | 7.2 | 7.9% | 0 |
| jab.DiamondStealer 5 | 7.8 | 6.9% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.1% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.3 | 81.0 | 7 / 35 | 4415 |
| 2 | 2 | 66.5 | 81.3 | 5 / 35 | 4371 |
| 3 | 2 | 67.5 | 82.2 | 9 / 35 | 4571 |
| 4 | 2 | 66.7 | 78.4 | 8 / 35 | 4490 |
| 5 | 2 | 65.9 | 77.5 | 6 / 35 | 4275 |
| 6 | 2 | 65.6 | 78.7 | 7 / 35 | 4058 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 78 | 24% |
| brainfade.melee.Dusk 0.44 | 20 | 50% |
| dummy.micro.Sparrow 2.5 | 10 | 90% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 67% |
| cvt.Firsty 1.0 | 1 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 1005. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 90 | 51% | 107 |
| brainfade.melee.Dusk 0.44 | 26 | 15% | 38 |
| dummy.micro.Sparrow 2.5 | 24 | 14% | 34 |
| wcsv.melee.EngineerMelee 0.1 | 15 | 9% | 17 |
| mz.NanoGod 2.02 | 5 | 3% | 5 |
| Krabb.akim2.Akim2 1.1b | 4 | 2% | 5 |
| jab.DiamondStealer 5 | 4 | 2% | 4 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 156646 melee ticks, 55783 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 47 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 49184 sent, 44314 reached their opponent, 7407 virtual hits (16.7% of those reached).

## Melee bench: F44

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 406 over 6 battles (67.7 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 94.7 | 148 / 210 | 1.48 | 21.5% | 36578 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 21.5% | 148 |
| stelo.Liblix 0.3.1 | 2.0 | 15.5% | 42 |
| tzu.TheArtOfWar 1.2 | 3.0 | 14.3% | 15 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.2 | 9.6% | 0 |
| jwirde.Gort 2.0 | 5.0 | 8.9% | 4 |
| disan.Chair 2.2.0 | 6.5 | 7.4% | 0 |
| wompi.Quokka 1.6 | 6.8 | 7.1% | 0 |
| stf.PanzerGeneral 0.1 | 7.5 | 6.8% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 4.7% | 1 |
| sample.Crazy 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 93.3 | 21 / 35 | 5923 |
| 2 | 1 | 72.0 | 94.9 | 26 / 35 | 5806 |
| 3 | 1 | 72.8 | 95.9 | 26 / 35 | 6257 |
| 4 | 1 | 72.6 | 94.3 | 25 / 35 | 6606 |
| 5 | 1 | 71.7 | 94.9 | 25 / 35 | 5813 |
| 6 | 1 | 72.2 | 94.6 | 25 / 35 | 6173 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 89 | 67% |
| tzu.TheArtOfWar 1.2 | 70 | 87% |
| jwirde.Gort 2.0 | 9 | 67% |
| disan.Chair 2.2.0 | 7 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 100% |
| wompi.Quokka 1.6 | 3 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 1022. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 34 | 52% | 105 |
| tzu.TheArtOfWar 1.2 | 15 | 23% | 59 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 11% | 13 |
| jwirde.Gort 2.0 | 3 | 5% | 17 |
| disan.Chair 2.2.0 | 1 | 2% | 7 |
| stf.PanzerGeneral 0.1 | 1 | 2% | 4 |
| amk.jointstrike.JointStrike 0.2 | 1 | 2% | 1 |
| wompi.Quokka 1.6 | 0 | 0% | 2 |
| sample.Crazy 1.0 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 154170 melee ticks, 55997 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 32 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 52591 sent, 47932 reached their opponent, 10162 virtual hits (21.2% of those reached).

## Melee bench: F45

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 733 over 6 battles (122.2 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 87.1 | 108 / 210 | 2.16 | 19.5% | 32670 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 19.5% | 108 |
| jje.BagPuss 1.2 | 2.7 | 12.2% | 10 |
| eem.IWillFireNoBullet v2.8 | 3.3 | 11.4% | 62 |
| sul.Lunar 1.1 | 3.8 | 11.0% | 18 |
| myl.nano.Graviton 1.10 | 4.2 | 10.9% | 6 |
| fm.claire 1.7 | 6.5 | 8.7% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.2 | 8.3% | 0 |
| hvilela.HVilela 0.9 | 7.3 | 8.1% | 0 |
| wit.Deep7 2.0 | 9.2 | 5.5% | 5 |
| abud.ThirdRobo 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 88.3 | 19 / 35 | 5232 |
| 2 | 1 | 70.5 | 90.8 | 21 / 35 | 5868 |
| 3 | 1 | 69.8 | 87.0 | 21 / 35 | 5806 |
| 4 | 1 | 68.5 | 86.3 | 18 / 35 | 5063 |
| 5 | 1 | 67.8 | 85.4 | 15 / 35 | 4992 |
| 6 | 1 | 69.0 | 84.8 | 14 / 35 | 5709 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 69 | 52% |
| jje.BagPuss 1.2 | 28 | 82% |
| myl.nano.Graviton 1.10 | 20 | 90% |
| sul.Lunar 1.1 | 18 | 78% |
| pez.mini.ChironexFleckeri 0.5 | 10 | 100% |
| wit.Deep7 2.0 | 5 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 1476. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 41 | 38% | 0 |
| jje.BagPuss 1.2 | 19 | 18% | 60 |
| sul.Lunar 1.1 | 12 | 11% | 47 |
| myl.nano.Graviton 1.10 | 12 | 11% | 38 |
| fm.claire 1.7 | 7 | 6% | 17 |
| pez.mini.ChironexFleckeri 0.5 | 5 | 5% | 27 |
| hvilela.HVilela 0.9 | 4 | 4% | 12 |
| wit.Deep7 2.0 | 2 | 2% | 5 |
| abud.ThirdRobo 1.0 | 0 | 0% | 4 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 200712 melee ticks, 79116 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 46 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 61620 sent, 56767 reached their opponent, 8794 virtual hits (15.5% of those reached).

## Melee bench: F46

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 592 over 6 battles (98.7 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 85.2 | 62 / 210 | 2.33 | 16.9% | 25909 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.5 | 16.9% | 62 |
| kc.mini.Mirage 0.2 | 2.0 | 16.7% | 62 |
| rsalesc.melee.Medina 0.4.5 | 2.5 | 16.3% | 74 |
| sadoner.killer 0.2 | 4.7 | 9.9% | 0 |
| mz.MicroSheep 1.0 | 4.8 | 10.0% | 3 |
| cx.Princess 1.0 | 5.5 | 9.5% | 9 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.3% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.2 | 5.6% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.3% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 87.0 | 11 / 35 | 4423 |
| 2 | 1 | 67.3 | 87.0 | 11 / 35 | 4454 |
| 3 | 2 | 65.7 | 81.9 | 11 / 35 | 4146 |
| 4 | 2 | 66.6 | 86.7 | 9 / 35 | 4118 |
| 5 | 1 | 66.4 | 85.4 | 10 / 35 | 4238 |
| 6 | 2 | 66.7 | 83.5 | 10 / 35 | 4530 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 72 | 56% |
| rsalesc.melee.Medina 0.4.5 | 36 | 14% |
| mz.MicroSheep 1.0 | 9 | 78% |
| cx.Princess 1.0 | 7 | 29% |
| arthord.NanoSatanMelee Beta | 5 | 100% |
| sadoner.killer 0.2 | 3 | 100% |

Hadur died in 153 of 210 rounds, at a mean tick of 966. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 63 | 41% | 100 |
| rsalesc.melee.Medina 0.4.5 | 50 | 33% | 58 |
| cx.Princess 1.0 | 11 | 7% | 13 |
| mz.MicroSheep 1.0 | 8 | 5% | 14 |
| arthord.NanoSatanMelee Beta | 8 | 5% | 10 |
| sadoner.killer 0.2 | 6 | 4% | 10 |
| kurios.DOSexe .9a | 1 | 1% | 3 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 153438 melee ticks, 47893 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 40 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 2.

Targeting waves (206 rounds): 45296 sent, 40347 reached their opponent, 5935 virtual hits (14.7% of those reached).

