# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 99 over 6 battles (16.5 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 85.3 | 48 / 210 | 2.32 | 16.5% | 26917 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.8% | 134 |
| hadur2.Hadur 3.17.1er | 2.0 | 16.5% | 48 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.8 | 11.0% | 3 |
| sgp.JollyNinja 3.53 | 4.0 | 11.2% | 13 |
| mz.MicroGodMelee 1 | 4.2 | 10.9% | 8 |
| lorneswork.Predator 1.0 | 6.0 | 10.0% | 4 |
| adt.Ar2 1.0 | 7.0 | 7.3% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.3% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.5 | 87.3 | 11 / 35 | 4879 |
| 2 | 2 | 66.0 | 85.1 | 10 / 35 | 4431 |
| 3 | 2 | 66.7 | 88.3 | 6 / 35 | 4506 |
| 4 | 2 | 64.9 | 82.5 | 5 / 35 | 4279 |
| 5 | 2 | 65.3 | 85.1 | 7 / 35 | 4399 |
| 6 | 2 | 65.8 | 83.5 | 9 / 35 | 4423 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 117 | 11% |
| mz.MicroGodMelee 1 | 17 | 71% |
| sgp.JollyNinja 3.53 | 15 | 60% |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 89% |
| lorneswork.Predator 1.0 | 5 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 162 of 210 rounds, at a mean tick of 1135. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 115 | 71% | 134 |
| mz.MicroGodMelee 1 | 15 | 9% | 26 |
| sgp.JollyNinja 3.53 | 15 | 9% | 21 |
| lorneswork.Predator 1.0 | 10 | 6% | 13 |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 4% | 11 |
| adt.Ar2 1.0 | 1 | 1% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 2 |

Posture (Hadur's M records, 200 rounds): 142858 melee ticks, 82337 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 48 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 46161 sent, 41782 reached their opponent, 9179 virtual hits (22.0% of those reached).

## Melee bench: F02

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 135 over 6 battles (22.5 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 85.0 | 92 / 210 | 2.35 | 17.7% | 26810 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.0 | 17.7% | 92 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 13.9% | 44 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.7% | 30 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.6% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.2 | 10.2% | 13 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 7.8% | 1 |
| sch.Simone 0.3d | 6.8 | 8.1% | 7 |
| Noran.BitchingElk 0.054 | 7.2 | 8.3% | 15 |
| stelo.PatternRobot 1.0 | 8.7 | 5.8% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 3.9% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 82.5 | 11 / 35 | 4161 |
| 2 | 1 | 67.5 | 85.7 | 16 / 35 | 4504 |
| 3 | 1 | 66.2 | 81.6 | 16 / 35 | 4373 |
| 4 | 1 | 68.6 | 90.8 | 16 / 35 | 4803 |
| 5 | 1 | 68.7 | 89.2 | 22 / 35 | 4729 |
| 6 | 1 | 65.1 | 80.0 | 11 / 35 | 4240 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 45 | 53% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 35 | 69% |
| com.cohesiva.robocode.ManOwaR 1.0 | 19 | 84% |
| Noran.BitchingElk 0.054 | 18 | 50% |
| sch.Simone 0.3d | 12 | 75% |
| lrem.micro.SpikeSoldier 0.4 | 7 | 100% |
| stelo.PatternRobot 1.0 | 3 | 67% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 1006. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 41 | 34% | 67 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 24 | 20% | 49 |
| Noran.BitchingElk 0.054 | 13 | 11% | 20 |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 9% | 31 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 8% | 13 |
| sch.Simone 0.3d | 8 | 7% | 14 |
| stelo.PatternRobot 1.0 | 6 | 5% | 8 |
| fnc.bandit.Bandit 5.2.0 | 4 | 3% | 5 |
| fullsail.SweetTea 1.1 | 2 | 2% | 2 |

Posture (Hadur's M records, 205 rounds): 174596 melee ticks, 40050 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 82 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 82 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 61770 sent, 57233 reached their opponent, 10659 virtual hits (18.6% of those reached).

## Melee bench: F03

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 200 over 6 battles (33.3 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 91.0 | 156 / 210 | 1.81 | 19.4% | 32637 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.0 | 19.4% | 156 |
| radnor.DoctorBob 1.42 | 2.3 | 14.8% | 28 |
| kawigi.nano.Lib 1.0 | 3.0 | 13.2% | 10 |
| vuen.Cake 2.51 | 3.7 | 12.6% | 14 |
| urdos.URDOS 1.3 | 5.0 | 8.9% | 2 |
| adt.Ar1 2.1 | 6.3 | 7.7% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 6.7% | 0 |
| oa.weak.FlyMk1 0.1 | 7.3 | 6.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.3 | 5.4% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 92.7 | 25 / 35 | 5569 |
| 2 | 1 | 70.0 | 91.7 | 27 / 35 | 5586 |
| 3 | 1 | 71.2 | 97.8 | 31 / 35 | 5608 |
| 4 | 1 | 66.0 | 81.3 | 18 / 35 | 4846 |
| 5 | 1 | 70.2 | 92.4 | 28 / 35 | 5781 |
| 6 | 1 | 68.9 | 90.2 | 27 / 35 | 5247 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 72 | 94% |
| vuen.Cake 2.51 | 56 | 88% |
| kawigi.nano.Lib 1.0 | 33 | 94% |
| ghent.ArthurPanzergon 1.0.0 | 4 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| oa.weak.FlyMk1 0.1 | 1 | 100% |
| urdos.URDOS 1.3 | 1 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 734. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 19 | 33% | 73 |
| vuen.Cake 2.51 | 12 | 21% | 59 |
| kawigi.nano.Lib 1.0 | 9 | 16% | 43 |
| bwbaugh.nano.Tirunculus 0.0.0a | 7 | 12% | 8 |
| urdos.URDOS 1.3 | 5 | 9% | 9 |
| adt.Ar1 2.1 | 3 | 5% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 2% | 4 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 4 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 137573 melee ticks, 37193 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 47 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 42045 sent, 37663 reached their opponent, 10093 virtual hits (26.8% of those reached).

## Melee bench: F04

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 503 over 6 battles (83.8 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 83.6 | 15 / 210 | 2.48 | 16.3% | 28631 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.2% | 171 |
| hadur2.Hadur 3.17.1er | 2.0 | 16.3% | 15 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.6% | 13 |
| TNT.TNT 0.99.1 | 4.0 | 11.2% | 11 |
| josago.Jorgito 0.16 | 5.2 | 9.3% | 1 |
| css.Delitioner 0.11 | 6.0 | 6.9% | 0 |
| tj.zombie1n 1.0.1 | 6.8 | 6.4% | 0 |
| rampancy.Durandal 2.1d | 8.2 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 4.0% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.1 | 81.3 | 2 / 35 | 4842 |
| 2 | 2 | 67.7 | 86.3 | 3 / 35 | 5261 |
| 3 | 2 | 67.0 | 86.7 | 4 / 35 | 4652 |
| 4 | 2 | 65.4 | 80.3 | 3 / 35 | 4635 |
| 5 | 2 | 64.9 | 80.6 | 1 / 35 | 4423 |
| 6 | 2 | 67.0 | 86.3 | 2 / 35 | 4818 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 125 | 6% |
| TNT.TNT 0.99.1 | 10 | 30% |
| josago.Jorgito 0.16 | 4 | 75% |
| apc.LeeroyJenkins2 1.0 | 3 | 67% |

Hadur died in 200 of 210 rounds, at a mean tick of 1246. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 148 | 74% | 154 |
| apc.LeeroyJenkins2 1.0 | 19 | 10% | 21 |
| TNT.TNT 0.99.1 | 14 | 7% | 18 |
| josago.Jorgito 0.16 | 8 | 4% | 11 |
| css.Delitioner 0.11 | 3 | 2% | 3 |
| tj.zombie1n 1.0.1 | 2 | 1% | 2 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 197582 melee ticks, 61464 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 57 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 63236 sent, 58633 reached their opponent, 9457 virtual hits (16.1% of those reached).

## Melee bench: F05

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 483 over 6 battles (80.5 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 76.1 | 25 / 210 | 3.15 | 14.0% | 18821 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.3% | 110 |
| justin.DemonicRage 3.4 | 2.0 | 17.0% | 48 |
| hadur2.Hadur 3.17.1er | 3.3 | 14.0% | 25 |
| wompi.Numbat 2.1 | 3.7 | 13.3% | 25 |
| axeBots.HataMoto 3.09 | 5.3 | 9.1% | 2 |
| ms.Ares 0.19 | 5.7 | 9.0% | 0 |
| supersample.SuperBoxBot 1.0 | 7.0 | 6.3% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.4% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 3.9% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.2 | 72.1 | 1 / 35 | 2912 |
| 2 | 3 | 62.5 | 77.8 | 4 / 35 | 3059 |
| 3 | 3 | 64.4 | 79.0 | 9 / 35 | 3553 |
| 4 | 3 | 61.6 | 74.9 | 3 / 35 | 3019 |
| 5 | 4 | 61.5 | 74.0 | 4 / 35 | 3187 |
| 6 | 3 | 62.7 | 78.7 | 4 / 35 | 3091 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 36 | 8% |
| justin.DemonicRage 3.4 | 34 | 44% |
| wompi.Numbat 2.1 | 13 | 46% |
| axeBots.HataMoto 3.09 | 2 | 0% |
| ms.Ares 0.19 | 1 | 100% |

Hadur died in 189 of 210 rounds, at a mean tick of 892. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 72 | 38% | 76 |
| justin.DemonicRage 3.4 | 63 | 33% | 78 |
| wompi.Numbat 2.1 | 26 | 14% | 29 |
| axeBots.HataMoto 3.09 | 11 | 6% | 12 |
| supersample.SuperBoxBot 1.0 | 5 | 3% | 5 |
| ms.Ares 0.19 | 4 | 2% | 6 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 2% | 3 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 153179 melee ticks, 37149 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 56 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 48853 sent, 44220 reached their opponent, 7832 virtual hits (17.7% of those reached).

## Melee bench: F06

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 215 over 6 battles (35.8 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 89.9 | 127 / 210 | 1.90 | 19.0% | 28625 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.0 | 19.0% | 127 |
| jekl.StoneGhost 0.7 | 2.0 | 14.5% | 21 |
| origin.SleepSiphon 1.7b | 3.2 | 13.7% | 41 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.2% | 17 |
| mld.Wisdom 1.0 | 5.0 | 10.4% | 2 |
| gg.Wolverine 2.0 | 6.2 | 8.4% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 6.6% | 3 |
| spinnercat.Omen 1.0 | 7.8 | 6.4% | 0 |
| DBall.NUKE 0.1 | 8.5 | 5.8% | 1 |
| sample.Fire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 94.0 | 26 / 35 | 4816 |
| 2 | 1 | 67.2 | 84.8 | 16 / 35 | 4477 |
| 3 | 1 | 70.0 | 93.0 | 23 / 35 | 5104 |
| 4 | 1 | 68.3 | 88.3 | 19 / 35 | 4517 |
| 5 | 1 | 67.7 | 85.7 | 18 / 35 | 4765 |
| 6 | 1 | 70.6 | 94.0 | 25 / 35 | 4946 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 55 | 89% |
| origin.SleepSiphon 1.7b | 44 | 64% |
| pe.minimelee.SandboxMiniMelee 1.1 | 30 | 83% |
| gg.Wolverine 2.0 | 11 | 91% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 86% |
| mld.Wisdom 1.0 | 6 | 100% |
| DBall.NUKE 0.1 | 3 | 67% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 937. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 37 | 42% | 72 |
| jekl.StoneGhost 0.7 | 17 | 19% | 59 |
| pe.minimelee.SandboxMiniMelee 1.1 | 13 | 15% | 32 |
| mld.Wisdom 1.0 | 12 | 13% | 22 |
| gg.Wolverine 2.0 | 3 | 3% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 11 |
| DBall.NUKE 0.1 | 1 | 1% | 4 |
| spinnercat.Omen 1.0 | 0 | 0% | 2 |
| sample.Fire 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 154869 melee ticks, 47735 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 34 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 48464 sent, 43999 reached their opponent, 10625 virtual hits (24.1% of those reached).

## Melee bench: F07

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 284 over 6 battles (47.3 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 90.7 | 94 / 210 | 1.84 | 19.1% | 32848 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.2 | 19.1% | 94 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 17.7% | 53 |
| rtk.Tachikoma 1.0 | 2.7 | 16.5% | 41 |
| franzor.Lizt 1.3.1 | 4.3 | 10.9% | 10 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 11.1% | 13 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.6% | 0 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.0% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.3 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 90.2 | 19 / 35 | 5955 |
| 2 | 2 | 69.7 | 88.9 | 11 / 35 | 5278 |
| 3 | 1 | 70.4 | 91.7 | 15 / 35 | 5504 |
| 4 | 1 | 70.2 | 90.2 | 16 / 35 | 5276 |
| 5 | 1 | 70.7 | 92.7 | 17 / 35 | 5416 |
| 6 | 1 | 70.3 | 90.5 | 16 / 35 | 5419 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 74 | 58% |
| rsalesc.melee.Monk 0.3.6c | 58 | 31% |
| franzor.Lizt 1.3.1 | 24 | 75% |
| oog.melee.CapuletDroid 1.1 | 21 | 67% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 1380. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 50 | 42% | 80 |
| rtk.Tachikoma 1.0 | 46 | 39% | 100 |
| oog.melee.CapuletDroid 1.1 | 10 | 8% | 24 |
| franzor.Lizt 1.3.1 | 6 | 5% | 0 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 3 |
| exauge.GateKeeper 1.1.121g | 2 | 2% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 190729 melee ticks, 90408 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 54 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 58366 sent, 53928 reached their opponent, 11623 virtual hits (21.6% of those reached).

## Melee bench: F08

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 235 over 6 battles (39.2 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 88.6 | 113 / 210 | 2.03 | 18.3% | 26298 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.0 | 18.3% | 113 |
| tm.Yuugao 1.0 | 2.5 | 12.6% | 28 |
| shrub.Vapour v159 | 2.8 | 12.9% | 38 |
| Krabb.sliNk.Garm 0.9u | 3.8 | 11.3% | 17 |
| com.spp.robocode.MostlyHarmless 010 | 5.2 | 9.9% | 6 |
| m3thos.Eva00 1.1 | 6.2 | 8.6% | 2 |
| jwst.DAD.DarkAndDarker 1.1 | 6.8 | 8.5% | 5 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 6.8% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.2 | 5.6% | 0 |
| SHAM.WOW 1.4 | 9.5 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 84.8 | 19 / 35 | 4209 |
| 2 | 1 | 67.9 | 89.2 | 19 / 35 | 4637 |
| 3 | 1 | 67.2 | 87.6 | 17 / 35 | 4305 |
| 4 | 1 | 67.5 | 89.2 | 19 / 35 | 4264 |
| 5 | 1 | 67.6 | 90.8 | 19 / 35 | 4283 |
| 6 | 1 | 68.2 | 89.8 | 20 / 35 | 4600 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 44 | 57% |
| shrub.Vapour v159 | 38 | 58% |
| Krabb.sliNk.Garm 0.9u | 34 | 71% |
| com.spp.robocode.MostlyHarmless 010 | 21 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 75% |
| m3thos.Eva00 1.1 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 915. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 27 | 27% | 60 |
| Krabb.sliNk.Garm 0.9u | 25 | 25% | 36 |
| shrub.Vapour v159 | 24 | 24% | 50 |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 9% | 25 |
| com.spp.robocode.MostlyHarmless 010 | 7 | 7% | 24 |
| m3thos.Eva00 1.1 | 4 | 4% | 7 |
| SHAM.WOW 1.4 | 2 | 2% | 4 |
| zyx.nano.BacillusComma 1.0 | 0 | 0% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 154214 melee ticks, 45022 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 80 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 49527 sent, 45054 reached their opponent, 8742 virtual hits (19.4% of those reached).

## Melee bench: F09

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 551 over 6 battles (91.8 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 74.8 | 54 / 210 | 3.27 | 14.6% | 19280 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.2% | 93 |
| kc.micro.Figment 1.0 | 2.5 | 14.6% | 32 |
| hadur2.Hadur 3.17.1er | 2.5 | 14.6% | 54 |
| yagami.Tidus 0.11 | 4.8 | 10.6% | 2 |
| pedersen.Grishnakh 1.0 | 5.0 | 10.2% | 11 |
| mc2.enemy.Original 0.9 | 5.2 | 9.9% | 16 |
| dft.Calliope 5.6 | 7.0 | 7.5% | 1 |
| step.nanoPri 1.0 | 8.2 | 5.9% | 1 |
| rdm.Dueler 0.4x | 9.2 | 4.9% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.9 | 72.1 | 11 / 35 | 3244 |
| 2 | 2 | 63.1 | 79.4 | 7 / 35 | 3176 |
| 3 | 3 | 61.2 | 72.4 | 7 / 35 | 3117 |
| 4 | 2 | 64.4 | 81.3 | 11 / 35 | 3233 |
| 5 | 3 | 60.5 | 67.6 | 7 / 35 | 3237 |
| 6 | 2 | 63.0 | 75.9 | 11 / 35 | 3273 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 47 | 23% |
| kc.micro.Figment 1.0 | 29 | 79% |
| mc2.enemy.Original 0.9 | 12 | 42% |
| pedersen.Grishnakh 1.0 | 9 | 67% |
| yagami.Tidus 0.11 | 7 | 86% |
| dft.Calliope 5.6 | 3 | 100% |
| step.nanoPri 1.0 | 1 | 0% |

Hadur died in 160 of 210 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 56 | 35% | 67 |
| kc.micro.Figment 1.0 | 35 | 22% | 58 |
| mc2.enemy.Original 0.9 | 22 | 14% | 28 |
| yagami.Tidus 0.11 | 15 | 9% | 20 |
| pedersen.Grishnakh 1.0 | 12 | 8% | 19 |
| robar.nano.Assertive_Melee 0.2 | 7 | 4% | 7 |
| step.nanoPri 1.0 | 4 | 3% | 4 |
| dft.Calliope 5.6 | 3 | 2% | 5 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 147612 melee ticks, 35812 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 39 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 49407 sent, 44968 reached their opponent, 6967 virtual hits (15.5% of those reached).

## Melee bench: F10

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 222 over 6 battles (37.0 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 93.5 | 155 / 210 | 1.59 | 19.7% | 30922 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.0 | 19.7% | 155 |
| DTF.Kludgy 1.2b | 2.2 | 14.1% | 28 |
| ne.Chimera 1.2 | 3.0 | 13.2% | 10 |
| ejb.Polaris 1.0.1 | 4.0 | 11.7% | 9 |
| tvv.micro.Antares 1.1.1 | 5.2 | 10.5% | 6 |
| vStar.RAFzilla 2.15 | 5.7 | 10.1% | 1 |
| kurios.DOSexe .9b | 7.5 | 5.8% | 0 |
| sam.Samspin 1.0 | 7.7 | 5.6% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.8 | 5.0% | 0 |
| donjezza.Muncho 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 86.3 | 20 / 35 | 4881 |
| 2 | 1 | 71.3 | 98.4 | 30 / 35 | 5249 |
| 3 | 1 | 69.0 | 90.2 | 22 / 35 | 5249 |
| 4 | 1 | 71.6 | 98.1 | 31 / 35 | 5426 |
| 5 | 1 | 70.1 | 94.3 | 26 / 35 | 5111 |
| 6 | 1 | 69.9 | 93.7 | 26 / 35 | 5006 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 51 | 71% |
| ne.Chimera 1.2 | 45 | 87% |
| ejb.Polaris 1.0.1 | 30 | 97% |
| vStar.RAFzilla 2.15 | 27 | 96% |
| tvv.micro.Antares 1.1.1 | 17 | 100% |
| kurios.DOSexe .9b | 5 | 100% |
| donjezza.Muncho 1.0 | 3 | 67% |

Hadur died in 57 of 210 rounds, at a mean tick of 858. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 30 | 53% | 64 |
| ne.Chimera 1.2 | 12 | 21% | 39 |
| ejb.Polaris 1.0.1 | 6 | 11% | 37 |
| vStar.RAFzilla 2.15 | 4 | 7% | 31 |
| tvv.micro.Antares 1.1.1 | 3 | 5% | 20 |
| donjezza.Muncho 1.0 | 1 | 2% | 4 |
| kurios.DOSexe .9b | 0 | 0% | 12 |
| sam.Samspin 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 145712 melee ticks, 46312 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 183 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 183 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 48294 sent, 43977 reached their opponent, 9015 virtual hits (20.5% of those reached).

## Melee bench: F11

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 464 over 6 battles (77.3 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 80.2 | 67 / 210 | 2.79 | 15.6% | 19913 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.3 | 15.9% | 57 |
| hadur2.Hadur 3.17.1er | 1.7 | 15.6% | 67 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.8% | 25 |
| djc.DynaBot 0.1.1 | 4.3 | 10.7% | 16 |
| rdt199.Warlord 0.73 | 4.7 | 9.9% | 21 |
| br2.MobyDickBot 1.6 | 6.5 | 8.6% | 11 |
| uji.YellohFellah 1.0 | 6.7 | 8.7% | 12 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.5% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.0 | 5.9% | 1 |
| stelo.MirrorNano 1.3 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 86.7 | 12 / 35 | 3320 |
| 2 | 1 | 65.1 | 82.2 | 17 / 35 | 3387 |
| 3 | 2 | 63.9 | 80.6 | 10 / 35 | 3458 |
| 4 | 2 | 62.3 | 75.6 | 13 / 35 | 3289 |
| 5 | 2 | 61.8 | 75.9 | 8 / 35 | 3206 |
| 6 | 2 | 62.8 | 80.0 | 7 / 35 | 3253 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 42 | 48% |
| cx.mini.Nimrod 0.55 | 21 | 62% |
| djc.DynaBot 0.1.1 | 17 | 59% |
| rdt199.Warlord 0.73 | 14 | 50% |
| uji.YellohFellah 1.0 | 13 | 69% |
| br2.MobyDickBot 1.6 | 9 | 56% |
| KiraNL.Chupacabra 0.4 | 3 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 57 | 39% | 74 |
| cx.mini.Nimrod 0.55 | 33 | 23% | 45 |
| djc.DynaBot 0.1.1 | 17 | 12% | 22 |
| rdt199.Warlord 0.73 | 11 | 8% | 27 |
| uji.YellohFellah 1.0 | 9 | 6% | 14 |
| br2.MobyDickBot 1.6 | 7 | 5% | 13 |
| KiraNL.Chupacabra 0.4 | 5 | 3% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 2% | 3 |
| stelo.MirrorNano 1.3 | 1 | 1% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 166641 melee ticks, 33192 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 41 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (209 rounds): 54549 sent, 49890 reached their opponent, 7054 virtual hits (14.1% of those reached).

## Melee bench: F12

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 90 over 6 battles (15.0 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 86.2 | 120 / 210 | 2.24 | 17.6% | 21159 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.0 | 17.6% | 120 |
| nat.PallasHawk 1.0 | 2.8 | 13.4% | 24 |
| bts.wiki.RipCurl 0.9b | 3.0 | 13.6% | 27 |
| darkcanuck.Leon 1.01 | 3.2 | 12.9% | 22 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.7% | 9 |
| jrm.Test0 1.0 | 6.2 | 7.9% | 4 |
| jp.Perpy 16.0 | 7.5 | 6.7% | 2 |
| cs.sheldor.Talon 1.1 | 8.3 | 6.4% | 0 |
| jaybot.bots.Oddball 4.0 | 8.8 | 5.8% | 2 |
| stuff.Vlad 0.1 | 9.2 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 84.4 | 21 / 35 | 3534 |
| 2 | 1 | 67.4 | 90.2 | 22 / 35 | 3466 |
| 3 | 1 | 66.9 | 87.3 | 18 / 35 | 3559 |
| 4 | 1 | 64.8 | 80.3 | 18 / 35 | 3316 |
| 5 | 1 | 67.2 | 85.7 | 21 / 35 | 3754 |
| 6 | 1 | 67.5 | 89.2 | 20 / 35 | 3530 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 46 | 70% |
| darkcanuck.Leon 1.01 | 46 | 87% |
| bts.wiki.RipCurl 0.9b | 41 | 83% |
| brainfade.melee.Genghis 0.36 | 9 | 89% |
| jrm.Test0 1.0 | 4 | 75% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| jaybot.bots.Oddball 4.0 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 714. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 21 | 23% | 48 |
| bts.wiki.RipCurl 0.9b | 19 | 21% | 47 |
| darkcanuck.Leon 1.01 | 16 | 18% | 57 |
| brainfade.melee.Genghis 0.36 | 11 | 12% | 20 |
| jrm.Test0 1.0 | 11 | 12% | 15 |
| cs.sheldor.Talon 1.1 | 6 | 7% | 9 |
| jaybot.bots.Oddball 4.0 | 4 | 4% | 6 |
| jp.Perpy 16.0 | 1 | 1% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 3 |

Posture (Hadur's M records, 204 rounds): 134633 melee ticks, 39359 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 40 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 46365 sent, 41799 reached their opponent, 7174 virtual hits (17.2% of those reached).

## Melee bench: F13

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 198 over 6 battles (33.0 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 80.3 | 51 / 210 | 2.77 | 15.0% | 21120 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.5 | 16.5% | 40 |
| mn.Combat 3.25.0 | 1.7 | 17.1% | 94 |
| hadur2.Hadur 3.17.1er | 2.8 | 15.0% | 51 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.5% | 3 |
| shinh.Entangled 0.3 | 4.5 | 11.8% | 22 |
| apc.Colossus2 0.17 | 6.2 | 8.0% | 0 |
| stelo.Wang 1.0 | 6.8 | 7.2% | 1 |
| ayk.WallHugger 1.0 | 8.3 | 4.8% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.8 | 82.5 | 14 / 35 | 3516 |
| 2 | 3 | 61.8 | 75.9 | 6 / 35 | 3364 |
| 3 | 3 | 62.3 | 77.1 | 6 / 35 | 3160 |
| 4 | 3 | 65.0 | 83.2 | 10 / 35 | 3867 |
| 5 | 2 | 64.5 | 82.2 | 10 / 35 | 3612 |
| 6 | 3 | 63.8 | 81.0 | 5 / 35 | 3601 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 47 | 30% |
| ags.Glacier 0.2.11 | 35 | 66% |
| shinh.Entangled 0.3 | 19 | 47% |
| gh.micro.Gruweltje 0.7 | 3 | 67% |
| stelo.Wang 1.0 | 3 | 67% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 162 of 210 rounds, at a mean tick of 892. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 52 | 32% | 70 |
| mn.Combat 3.25.0 | 49 | 30% | 66 |
| shinh.Entangled 0.3 | 28 | 17% | 38 |
| gh.micro.Gruweltje 0.7 | 15 | 9% | 17 |
| stelo.Wang 1.0 | 11 | 7% | 13 |
| maribo.FollowFire 1 | 3 | 2% | 3 |
| apc.Colossus2 0.17 | 2 | 1% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 151277 melee ticks, 38100 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 64 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 44742 sent, 40099 reached their opponent, 6745 virtual hits (16.8% of those reached).

## Melee bench: F14

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 145 over 6 battles (24.2 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 92.4 | 144 / 210 | 1.69 | 19.3% | 29045 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.0 | 19.3% | 144 |
| catcat20.shape.Theta 0.018 | 2.5 | 13.5% | 31 |
| simonton.micro.Sprout 1.1.3 | 2.5 | 14.4% | 21 |
| sanyi.mikrobi.Roberto 1.0 | 4.2 | 10.0% | 4 |
| co.edu.usb.rc.LidisTron 1.0 | 5.3 | 9.5% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 6.0 | 9.3% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 8.2% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.3 | 8.2% | 0 |
| pa.Improved 1.0 | 9.0 | 5.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 90.2 | 18 / 35 | 4367 |
| 2 | 1 | 71.0 | 96.2 | 29 / 35 | 5153 |
| 3 | 1 | 69.2 | 91.7 | 20 / 35 | 5099 |
| 4 | 1 | 68.7 | 89.5 | 23 / 35 | 4682 |
| 5 | 1 | 70.1 | 93.0 | 26 / 35 | 4927 |
| 6 | 1 | 70.1 | 93.7 | 28 / 35 | 4817 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.shape.Theta 0.018 | 68 | 78% |
| simonton.micro.Sprout 1.1.3 | 56 | 84% |
| sanyi.mikrobi.Roberto 1.0 | 17 | 88% |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 71% |
| co.edu.usb.rc.LidisTron 1.0 | 10 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 5 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 892. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 25 | 38% | 71 |
| catcat20.shape.Theta 0.018 | 25 | 38% | 68 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 8% | 26 |
| sanyi.mikrobi.Roberto 1.0 | 4 | 6% | 23 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 6% | 5 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 5% | 7 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 6 |
| pa.Improved 1.0 | 0 | 0% | 1 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 144551 melee ticks, 54479 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 33 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 45768 sent, 41589 reached their opponent, 10490 virtual hits (25.2% of those reached).

## Melee bench: F15

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 222 over 6 battles (37.0 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 84.0 | 97 / 210 | 2.44 | 17.4% | 26083 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.0 | 17.4% | 97 |
| kawigi.micro.Shiz 1.1 | 2.5 | 14.0% | 18 |
| emp.Yngwie 1.11 | 2.5 | 13.9% | 61 |
| mld.DustBunny 3.8 | 4.3 | 12.3% | 8 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.0% | 5 |
| kawigi.robot.Girl 1.2 | 5.5 | 10.3% | 19 |
| lambdaxy.TBot 0.1 | 7.5 | 6.9% | 0 |
| Grystrion.TrackerWO 1.0 | 7.7 | 6.5% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 4.9% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 83.5 | 14 / 35 | 4152 |
| 2 | 1 | 67.2 | 83.8 | 18 / 35 | 4485 |
| 3 | 1 | 69.1 | 89.5 | 19 / 35 | 4790 |
| 4 | 1 | 65.4 | 79.4 | 15 / 35 | 4390 |
| 5 | 1 | 67.0 | 83.8 | 18 / 35 | 4145 |
| 6 | 1 | 66.0 | 84.1 | 13 / 35 | 4121 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 56 | 55% |
| kawigi.micro.Shiz 1.1 | 29 | 86% |
| mld.DustBunny 3.8 | 24 | 79% |
| kawigi.robot.Girl 1.2 | 15 | 60% |
| cb.nano.Insomnia 1.0 | 12 | 83% |
| divineomega.TrialBot 0.003 | 4 | 75% |

Hadur died in 114 of 210 rounds, at a mean tick of 976. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 40 | 35% | 78 |
| kawigi.micro.Shiz 1.1 | 23 | 20% | 47 |
| mld.DustBunny 3.8 | 15 | 13% | 37 |
| kawigi.robot.Girl 1.2 | 14 | 12% | 14 |
| cb.nano.Insomnia 1.0 | 12 | 11% | 16 |
| Grystrion.TrackerWO 1.0 | 5 | 4% | 6 |
| divineomega.TrialBot 0.003 | 2 | 2% | 10 |
| lambdaxy.TBot 0.1 | 2 | 2% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 168805 melee ticks, 42989 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 51 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 55323 sent, 50872 reached their opponent, 8709 virtual hits (17.1% of those reached).

## Melee bench: F16

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 227 over 6 battles (37.8 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.8 | 101 / 210 | 2.19 | 18.3% | 28880 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.0 | 18.3% | 101 |
| gh.Griezel 0.5.2 | 2.0 | 16.2% | 60 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.8% | 10 |
| techdude.forest.FlamingForest 1.1 | 4.8 | 10.5% | 28 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.6% | 4 |
| tvv.nano.Polaris 1.2 | 5.3 | 9.1% | 7 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.4% | 2 |
| divineomega.DivineBot 1.9.4.5 | 8.3 | 5.2% | 0 |
| repositorio.NanoStep 1.0 | 8.8 | 4.6% | 0 |
| asd.Cthulhu 1.3 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 86.0 | 16 / 35 | 4419 |
| 2 | 1 | 67.7 | 85.1 | 16 / 35 | 4960 |
| 3 | 1 | 68.5 | 88.3 | 14 / 35 | 4881 |
| 4 | 1 | 69.8 | 89.5 | 21 / 35 | 5059 |
| 5 | 1 | 68.6 | 87.3 | 20 / 35 | 4693 |
| 6 | 1 | 67.7 | 84.8 | 14 / 35 | 4868 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 61 | 57% |
| techdude.forest.FlamingForest 1.1 | 44 | 59% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 19 | 89% |
| stelo.IntrinsicVolatility 1.4 | 8 | 88% |
| divineomega.DivineBot 1.9.4.5 | 7 | 100% |
| tvv.nano.Polaris 1.2 | 7 | 86% |
| bvh.fnr.Fenrir 0.36l | 6 | 50% |

Hadur died in 114 of 210 rounds, at a mean tick of 1175. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 45 | 39% | 78 |
| techdude.forest.FlamingForest 1.1 | 25 | 22% | 49 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 13 | 11% | 35 |
| bvh.fnr.Fenrir 0.36l | 13 | 11% | 13 |
| tvv.nano.Polaris 1.2 | 6 | 5% | 10 |
| asd.Cthulhu 1.3 | 4 | 4% | 4 |
| stelo.IntrinsicVolatility 1.4 | 3 | 3% | 13 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 8 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 181357 melee ticks, 61493 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 46 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 58691 sent, 54215 reached their opponent, 9612 virtual hits (17.7% of those reached).

## Melee bench: F17

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 515 over 6 battles (85.8 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 84.2 | 94 / 210 | 2.42 | 17.9% | 30214 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.0 | 17.9% | 94 |
| oog.melee.Mercutio 1.0 | 2.7 | 13.7% | 46 |
| et.Predator 1.8 | 3.0 | 13.1% | 20 |
| cx.BlestPain 1.41 | 3.5 | 12.6% | 41 |
| ahf.NanoAndrew .4 | 5.0 | 10.7% | 3 |
| nic.Nicator 2.4 | 6.3 | 9.3% | 3 |
| maribo.melee.BMV 0.1 | 6.5 | 9.1% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.7% | 2 |
| tex.Longbot 0.4 | 8.7 | 5.5% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 87.0 | 15 / 35 | 5320 |
| 2 | 1 | 67.5 | 83.5 | 16 / 35 | 4682 |
| 3 | 1 | 66.2 | 80.6 | 11 / 35 | 4997 |
| 4 | 1 | 67.6 | 81.0 | 19 / 35 | 5068 |
| 5 | 1 | 67.3 | 84.4 | 17 / 35 | 4892 |
| 6 | 1 | 68.8 | 88.9 | 16 / 35 | 5255 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 45 | 73% |
| et.Predator 1.8 | 41 | 78% |
| cx.BlestPain 1.41 | 32 | 38% |
| ahf.NanoAndrew .4 | 12 | 100% |
| nic.Nicator 2.4 | 3 | 67% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 50% |
| maribo.melee.BMV 0.1 | 2 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 1011. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 37 | 31% | 54 |
| et.Predator 1.8 | 26 | 21% | 56 |
| oog.melee.Mercutio 1.0 | 26 | 21% | 54 |
| ahf.NanoAndrew .4 | 16 | 13% | 27 |
| nic.Nicator 2.4 | 4 | 3% | 7 |
| maribo.melee.BMV 0.1 | 3 | 2% | 7 |
| edu.otg.spr.TheTeacher 1.2 | 3 | 2% | 4 |
| tex.Longbot 0.4 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 164980 melee ticks, 52268 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 34 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 56112 sent, 51545 reached their opponent, 11417 virtual hits (22.1% of those reached).

## Melee bench: F18

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 263 over 6 battles (43.8 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 88.4 | 127 / 210 | 2.04 | 18.5% | 25692 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.0 | 18.5% | 127 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.5% | 32 |
| agd.Mooserwirt2 2.7 | 3.3 | 12.1% | 19 |
| uji.DBH 1.1 | 3.7 | 11.6% | 11 |
| spinnercat.Robovirus 2.718 | 6.0 | 8.6% | 4 |
| ratosh.Nobo 0.21 | 6.2 | 8.8% | 4 |
| sigterm.Sigterm 1.0 | 6.7 | 8.3% | 10 |
| kawigi.mini.Fhqwhgads 1.1 | 7.3 | 7.4% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.2 | 6.0% | 0 |
| stelo.WangRobot 1.0 | 9.7 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 94.3 | 26 / 35 | 4154 |
| 2 | 1 | 66.4 | 83.5 | 19 / 35 | 4250 |
| 3 | 1 | 67.8 | 86.3 | 19 / 35 | 4592 |
| 4 | 1 | 67.6 | 88.9 | 22 / 35 | 4118 |
| 5 | 1 | 67.9 | 88.6 | 20 / 35 | 4316 |
| 6 | 1 | 67.8 | 88.9 | 21 / 35 | 4262 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 50 | 72% |
| uji.DBH 1.1 | 28 | 82% |
| agd.Mooserwirt2 2.7 | 25 | 84% |
| sigterm.Sigterm 1.0 | 18 | 78% |
| spinnercat.Robovirus 2.718 | 12 | 83% |
| ratosh.Nobo 0.21 | 10 | 80% |
| kawigi.mini.Fhqwhgads 1.1 | 9 | 89% |
| stelo.WangRobot 1.0 | 6 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 31 | 37% | 76 |
| uji.DBH 1.1 | 15 | 18% | 35 |
| agd.Mooserwirt2 2.7 | 12 | 14% | 33 |
| ratosh.Nobo 0.21 | 8 | 10% | 19 |
| sigterm.Sigterm 1.0 | 5 | 6% | 18 |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 6% | 11 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 5% | 5 |
| spinnercat.Robovirus 2.718 | 2 | 2% | 8 |
| stelo.WangRobot 1.0 | 1 | 1% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 137540 melee ticks, 42192 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 64 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 46408 sent, 42030 reached their opponent, 9485 virtual hits (22.6% of those reached).

## Melee bench: F19

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 300 over 6 battles (50.0 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 95.4 | 183 / 210 | 1.41 | 21.2% | 33174 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.0 | 21.2% | 183 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.9% | 10 |
| mld.Infinity 2.2 | 3.2 | 13.3% | 12 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.5% | 2 |
| erdnis.Rover 0.3 | 5.0 | 10.0% | 1 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.6% | 1 |
| mbh.Mbh 0.1 | 7.5 | 6.9% | 0 |
| pac.ABC 2.1 | 7.5 | 6.7% | 1 |
| pbg.R2D2 1.0 | 8.8 | 5.8% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 93.3 | 30 / 35 | 5472 |
| 2 | 1 | 72.7 | 98.1 | 32 / 35 | 5564 |
| 3 | 1 | 72.0 | 94.3 | 29 / 35 | 5520 |
| 4 | 1 | 73.3 | 99.0 | 33 / 35 | 5806 |
| 5 | 1 | 72.2 | 96.2 | 31 / 35 | 5552 |
| 6 | 1 | 70.9 | 91.4 | 28 / 35 | 5260 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 107 | 97% |
| mld.Infinity 2.2 | 36 | 94% |
| krillr.mini.JointStrike 2.0.0 | 18 | 94% |
| erdnis.Rover 0.3 | 11 | 91% |
| pac.ABC 2.1 | 7 | 100% |
| patson.PatsonTestBot 1.0 | 6 | 100% |
| pbg.R2D2 1.0 | 4 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 29 of 210 rounds, at a mean tick of 678. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 10 | 34% | 64 |
| mld.Infinity 2.2 | 5 | 17% | 39 |
| krillr.mini.JointStrike 2.0.0 | 5 | 17% | 34 |
| patson.PatsonTestBot 1.0 | 3 | 10% | 20 |
| erdnis.Rover 0.3 | 2 | 7% | 17 |
| pac.ABC 2.1 | 2 | 7% | 14 |
| pbg.R2D2 1.0 | 0 | 0% | 11 |
| mbh.Mbh 0.1 | 0 | 0% | 9 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 130901 melee ticks, 45079 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 34 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 44909 sent, 40656 reached their opponent, 10527 virtual hits (25.9% of those reached).

## Melee bench: F20

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 419 over 6 battles (69.8 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 90.4 | 133 / 210 | 1.87 | 19.7% | 31636 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.0 | 19.7% | 133 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.3% | 33 |
| catcat20.Rabbit 0.001 | 3.7 | 11.4% | 27 |
| fwb.Nine 1.0.1 | 4.0 | 11.0% | 15 |
| nz.jdc.nano.GridFu 1.0 | 4.3 | 10.6% | 2 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 8.6% | 1 |
| bayen.nut.Squirrel 1.615 | 6.8 | 7.4% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.0 | 6.1% | 0 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 93.7 | 26 / 35 | 5430 |
| 2 | 1 | 70.2 | 91.4 | 23 / 35 | 5146 |
| 3 | 1 | 70.4 | 93.0 | 24 / 35 | 5317 |
| 4 | 1 | 68.2 | 87.0 | 20 / 35 | 4866 |
| 5 | 1 | 69.6 | 88.6 | 20 / 35 | 5616 |
| 6 | 1 | 69.0 | 88.6 | 20 / 35 | 5261 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 73 | 82% |
| catcat20.Rabbit 0.001 | 32 | 59% |
| fwb.Nine 1.0.1 | 32 | 100% |
| nz.jdc.nano.GridFu 1.0 | 8 | 88% |
| bayen.nut.Squirrel 1.615 | 6 | 100% |
| m3thos.mini.Eva01 0.5.5 | 4 | 75% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 979. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 34 | 42% | 89 |
| catcat20.Rabbit 0.001 | 20 | 25% | 44 |
| fwb.Nine 1.0.1 | 13 | 16% | 28 |
| bayen.nut.Squirrel 1.615 | 3 | 4% | 15 |
| nz.jdc.nano.GridFu 1.0 | 3 | 4% | 14 |
| m3thos.mini.Eva01 0.5.5 | 2 | 2% | 10 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 3 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 1 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 6 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 169983 melee ticks, 54253 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 71 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 54661 sent, 50130 reached their opponent, 11977 virtual hits (23.9% of those reached).

## Melee bench: F21

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 801 over 6 battles (133.5 per battle, most in one battle 237). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.7 | 107 / 210 | 2.02 | 18.8% | 30075 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.0 | 18.8% | 107 |
| eem.EvBot v4.6.16 | 2.0 | 16.6% | 73 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.2% | 10 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.9% | 6 |
| eld.Hmm 1.0 | 5.2 | 8.9% | 13 |
| oa.weak.BotherBot 0.1 | 5.8 | 7.8% | 1 |
| fire219.CatBot 1.0 | 7.2 | 6.4% | 0 |
| PSW.Relentless 0.1 | 8.0 | 6.1% | 0 |
| el.JumpShoot 0.2 | 8.8 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 86.3 | 17 / 35 | 4869 |
| 2 | 1 | 67.2 | 84.1 | 16 / 35 | 4632 |
| 3 | 1 | 69.2 | 90.5 | 16 / 35 | 5141 |
| 4 | 1 | 70.4 | 90.8 | 21 / 35 | 5515 |
| 5 | 1 | 69.3 | 91.4 | 18 / 35 | 4948 |
| 6 | 1 | 69.1 | 88.9 | 19 / 35 | 4970 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 105 | 59% |
| dummy.mini.Scimitar 1.01 | 27 | 81% |
| cf.RiO.RiOx 4.2.1 | 18 | 78% |
| eld.Hmm 1.0 | 11 | 55% |
| oa.weak.BotherBot 0.1 | 2 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 1258. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 58 | 53% | 101 |
| dummy.mini.Scimitar 1.01 | 19 | 17% | 47 |
| cf.RiO.RiOx 4.2.1 | 12 | 11% | 28 |
| eld.Hmm 1.0 | 8 | 7% | 22 |
| PSW.Relentless 0.1 | 3 | 3% | 3 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 6 |
| fire219.CatBot 1.0 | 1 | 1% | 2 |
| arthord.MannyPacquiao Beta | 1 | 1% | 0 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 183183 melee ticks, 81083 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 42 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 54128 sent, 49830 reached their opponent, 9200 virtual hits (18.5% of those reached).

## Melee bench: F22

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 422 over 6 battles (70.3 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 85.0 | 76 / 210 | 2.35 | 16.9% | 24992 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxDT 2.71m | 1.3 | 17.0% | 72 |
| hadur2.Hadur 3.17.1er | 1.8 | 16.9% | 76 |
| kvk.HebusLeTroll 0.35 | 3.2 | 14.5% | 31 |
| jlm.javaDisturbance 0.59 | 3.7 | 13.5% | 22 |
| bigpete.Stewie 1.0 | 5.0 | 10.5% | 6 |
| yk.JahRoslav 1.1 | 6.3 | 7.5% | 3 |
| tad.Dalek98 0.98 | 7.0 | 6.6% | 0 |
| gg.Squaraus 0.6 | 7.7 | 6.1% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.7% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.6 | 87.3 | 13 / 35 | 4128 |
| 2 | 3 | 62.9 | 77.1 | 4 / 35 | 3562 |
| 3 | 1 | 68.4 | 89.2 | 16 / 35 | 4741 |
| 4 | 2 | 65.3 | 81.0 | 12 / 35 | 3777 |
| 5 | 2 | 67.5 | 87.3 | 14 / 35 | 4276 |
| 6 | 1 | 67.9 | 87.9 | 17 / 35 | 4508 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 48 | 35% |
| jlm.javaDisturbance 0.59 | 39 | 82% |
| kvk.HebusLeTroll 0.35 | 29 | 62% |
| bigpete.Stewie 1.0 | 9 | 78% |
| yk.JahRoslav 1.1 | 3 | 67% |

Hadur died in 140 of 210 rounds, at a mean tick of 949. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 52 | 37% | 72 |
| kvk.HebusLeTroll 0.35 | 41 | 29% | 58 |
| jlm.javaDisturbance 0.59 | 26 | 19% | 49 |
| bigpete.Stewie 1.0 | 10 | 7% | 16 |
| yk.JahRoslav 1.1 | 5 | 4% | 9 |
| tad.Dalek98 0.98 | 3 | 2% | 3 |
| gg.Squaraus 0.6 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 165113 melee ticks, 40824 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 37 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 37 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 53998 sent, 49361 reached their opponent, 8369 virtual hits (17.0% of those reached).

## Melee bench: F23

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 386 over 6 battles (64.3 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 94.7 | 167 / 210 | 1.48 | 20.9% | 32961 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.0 | 20.9% | 167 |
| pe.SandboxLump 1.52 | 2.0 | 16.7% | 30 |
| cre.Karolos 0.32 | 3.0 | 13.4% | 6 |
| stelo.AreaTargetingBot 1.1 | 4.8 | 10.0% | 4 |
| stelo.RamTrackSurfer 1.2 | 5.0 | 9.6% | 1 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.2 | 8.7% | 2 |
| cw.megas.Blade 0.8 | 6.3 | 8.6% | 0 |
| sample.Walls 1.0 | 7.7 | 7.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.3 | 2.8% | 0 |
| rrh.Iwillfindyou 2.0 | 9.7 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 93.0 | 27 / 35 | 5190 |
| 2 | 1 | 72.4 | 95.2 | 28 / 35 | 5800 |
| 3 | 1 | 71.6 | 94.0 | 27 / 35 | 5525 |
| 4 | 1 | 72.3 | 95.2 | 28 / 35 | 5423 |
| 5 | 1 | 73.5 | 97.8 | 30 / 35 | 5877 |
| 6 | 1 | 71.2 | 92.7 | 27 / 35 | 5146 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 99 | 84% |
| cre.Karolos 0.32 | 49 | 96% |
| stelo.RamTrackSurfer 1.2 | 16 | 94% |
| stelo.AreaTargetingBot 1.1 | 9 | 100% |
| cw.megas.Blade 0.8 | 5 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 100% |

Hadur died in 46 of 210 rounds, at a mean tick of 789. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 26 | 57% | 102 |
| cre.Karolos 0.32 | 7 | 15% | 45 |
| stelo.AreaTargetingBot 1.1 | 5 | 11% | 16 |
| stelo.RamTrackSurfer 1.2 | 3 | 7% | 26 |
| cw.megas.Blade 0.8 | 1 | 2% | 9 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 2% | 8 |
| sample.Walls 1.0 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 128751 melee ticks, 47178 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 72 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 41109 sent, 36712 reached their opponent, 11674 virtual hits (31.8% of those reached).

## Melee bench: F24

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 384 over 6 battles (64.0 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 81.2 | 74 / 210 | 2.69 | 15.8% | 20214 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.2 | 15.8% | 74 |
| rz.GlowBlowMelee 1.4 | 2.2 | 14.0% | 42 |
| davidalves.Phoenix 0.54 | 3.3 | 13.1% | 36 |
| florent.XSeries.X2 0.12 | 4.0 | 12.9% | 27 |
| pedersen.Ugluk 1.1.1 | 4.3 | 11.9% | 23 |
| oog.melee.Corsair 1.0 | 6.0 | 9.8% | 8 |
| stelo.SoJNanoMelee 1.1 | 7.3 | 6.8% | 0 |
| lunchie.Lunchbox 0.93 | 7.7 | 6.1% | 1 |
| as.FrankTheTank 1.3 | 9.3 | 4.8% | 0 |
| evd.X1 0.01 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 82.2 | 15 / 35 | 3436 |
| 2 | 1 | 64.7 | 81.9 | 13 / 35 | 3548 |
| 3 | 1 | 63.8 | 80.6 | 9 / 35 | 3232 |
| 4 | 2 | 62.7 | 76.2 | 10 / 35 | 3326 |
| 5 | 1 | 65.4 | 85.4 | 15 / 35 | 3461 |
| 6 | 1 | 63.8 | 81.0 | 12 / 35 | 3211 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 33 | 36% |
| davidalves.Phoenix 0.54 | 30 | 50% |
| florent.XSeries.X2 0.12 | 26 | 69% |
| pedersen.Ugluk 1.1.1 | 18 | 72% |
| oog.melee.Corsair 1.0 | 13 | 69% |
| stelo.SoJNanoMelee 1.1 | 7 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 40 | 28% | 53 |
| davidalves.Phoenix 0.54 | 36 | 26% | 49 |
| florent.XSeries.X2 0.12 | 24 | 17% | 45 |
| pedersen.Ugluk 1.1.1 | 21 | 15% | 30 |
| oog.melee.Corsair 1.0 | 8 | 6% | 18 |
| stelo.SoJNanoMelee 1.1 | 3 | 2% | 10 |
| as.FrankTheTank 1.3 | 3 | 2% | 3 |
| evd.X1 0.01 | 2 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 141956 melee ticks, 35900 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 49 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 47282 sent, 42667 reached their opponent, 8199 virtual hits (19.2% of those reached).

## Melee bench: F25

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 485 over 6 battles (80.8 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 88.4 | 129 / 210 | 2.04 | 18.3% | 22657 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.0 | 18.3% | 129 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.4% | 17 |
| voidious.mini.BrokenSword 2.0.3 | 2.7 | 13.4% | 22 |
| jdw.Hurricane 1.4 | 3.8 | 12.0% | 24 |
| gre.svman4.Morfeas 1.4.1 | 5.7 | 9.2% | 10 |
| ds.Oo 2.2 | 5.8 | 8.8% | 0 |
| awesomeness.Elite 1.0 | 6.8 | 7.5% | 4 |
| adt.Ar2 1.1 | 8.2 | 6.6% | 3 |
| gjr.Cephalosporin 0.1 | 8.5 | 6.3% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 91.1 | 21 / 35 | 4014 |
| 2 | 1 | 67.6 | 88.6 | 23 / 35 | 3704 |
| 3 | 1 | 64.7 | 81.0 | 16 / 35 | 3404 |
| 4 | 1 | 66.4 | 84.4 | 18 / 35 | 3619 |
| 5 | 1 | 70.1 | 94.9 | 29 / 35 | 3897 |
| 6 | 1 | 68.9 | 90.5 | 22 / 35 | 4019 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 47 | 85% |
| voidious.micro.BlitzBat 1.05 | 34 | 97% |
| jdw.Hurricane 1.4 | 33 | 73% |
| ds.Oo 2.2 | 14 | 100% |
| gre.svman4.Morfeas 1.4.1 | 13 | 54% |
| gjr.Cephalosporin 0.1 | 7 | 100% |
| awesomeness.Elite 1.0 | 4 | 75% |
| adt.Ar2 1.1 | 2 | 50% |

Hadur died in 85 of 210 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 19 | 22% | 49 |
| voidious.mini.BrokenSword 2.0.3 | 19 | 22% | 47 |
| jdw.Hurricane 1.4 | 15 | 18% | 36 |
| gre.svman4.Morfeas 1.4.1 | 8 | 9% | 17 |
| awesomeness.Elite 1.0 | 7 | 8% | 14 |
| ds.Oo 2.2 | 6 | 7% | 24 |
| adt.Ar2 1.1 | 6 | 7% | 11 |
| amk.ChumbaMini 0.2 | 1 | 1% | 4 |
| gjr.Cephalosporin 0.1 | 0 | 0% | 8 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 132123 melee ticks, 29544 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 41 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 46599 sent, 42230 reached their opponent, 7377 virtual hits (17.5% of those reached).

## Melee bench: F26

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 568 over 6 battles (94.7 per battle, most in one battle 144). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.3 | 121 / 210 | 1.97 | 18.9% | 31255 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.0 | 18.9% | 121 |
| ak.Fermat 2.0 | 2.0 | 16.2% | 46 |
| lrem.Spectre 0.4.4 | 3.3 | 12.2% | 13 |
| shu.nitro.LENIN .T34 | 3.8 | 11.9% | 23 |
| js.PinBall 1.6 | 5.2 | 10.4% | 4 |
| jaybot.adv.bots.JayBot 2.0 | 5.7 | 9.5% | 3 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 8.0% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 7.0% | 0 |
| sample.SpinBot 1.0 | 9.0 | 4.4% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 90.8 | 20 / 35 | 5323 |
| 2 | 1 | 70.9 | 92.4 | 22 / 35 | 5633 |
| 3 | 1 | 68.0 | 83.8 | 18 / 35 | 5047 |
| 4 | 1 | 69.1 | 88.9 | 22 / 35 | 5151 |
| 5 | 1 | 69.5 | 91.1 | 21 / 35 | 4973 |
| 6 | 1 | 68.9 | 88.6 | 18 / 35 | 5128 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 66 | 68% |
| lrem.Spectre 0.4.4 | 39 | 90% |
| shu.nitro.LENIN .T34 | 30 | 73% |
| jaybot.adv.bots.JayBot 2.0 | 11 | 82% |
| js.PinBall 1.6 | 10 | 90% |
| gh.mini.GrubbmOne 1.0 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 927. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 37 | 40% | 84 |
| lrem.Spectre 0.4.4 | 18 | 19% | 45 |
| shu.nitro.LENIN .T34 | 16 | 17% | 39 |
| js.PinBall 1.6 | 7 | 8% | 17 |
| jaybot.adv.bots.JayBot 2.0 | 7 | 8% | 16 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 2% | 6 |
| gh.mini.GrubbmOne 1.0 | 2 | 2% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 162358 melee ticks, 44249 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 38 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 53873 sent, 49310 reached their opponent, 12945 virtual hits (26.3% of those reached).

## Melee bench: F27

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 418 over 6 battles (69.7 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 79.2 | 133 / 210 | 2.88 | 17.5% | 27075 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.7 | 14.7% | 47 |
| hadur2.Hadur 3.17.1er | 1.7 | 17.5% | 133 |
| EH.Eagle 1.0.6 | 3.0 | 11.5% | 8 |
| wee.Gem 1.8.4 | 4.2 | 10.5% | 12 |
| sheldor.melee.nano.TestMelee 0.1 | 5.8 | 9.3% | 8 |
| techdude.kombat.FlamingKombat 1.5 | 6.2 | 9.0% | 1 |
| joe.ADinosaur 1.0 | 6.7 | 8.6% | 2 |
| throxbot.ThroxBot 0.1 | 7.0 | 8.1% | 2 |
| caimano.Furia_Ceca 0.22 | 9.0 | 6.3% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.6 | 49.2 | 10 / 35 | 4112 |
| 2 | 1 | 69.8 | 93.3 | 29 / 35 | 4596 |
| 3 | 1 | 69.7 | 92.4 | 28 / 35 | 4568 |
| 4 | 1 | 70.4 | 94.9 | 29 / 35 | 4608 |
| 5 | 2 | 58.7 | 53.0 | 12 / 35 | 4491 |
| 6 | 1 | 69.5 | 92.1 | 25 / 35 | 4700 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 68 | 90% |
| EH.Eagle 1.0.6 | 26 | 96% |
| techdude.kombat.FlamingKombat 1.5 | 18 | 100% |
| wee.Gem 1.8.4 | 11 | 91% |
| sheldor.melee.nano.TestMelee 0.1 | 8 | 75% |
| throxbot.ThroxBot 0.1 | 7 | 100% |
| joe.ADinosaur 1.0 | 6 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 537. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 25 | 31% | 74 |
| cs.Grudge 1.0 | 18 | 22% | 17 |
| throxbot.ThroxBot 0.1 | 8 | 10% | 14 |
| joe.ADinosaur 1.0 | 7 | 9% | 17 |
| EH.Eagle 1.0.6 | 5 | 6% | 26 |
| caimano.Furia_Ceca 0.22 | 5 | 6% | 6 |
| wee.Gem 1.8.4 | 4 | 5% | 21 |
| techdude.kombat.FlamingKombat 1.5 | 3 | 4% | 25 |
| sheldor.melee.nano.TestMelee 0.1 | 3 | 4% | 10 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 210 rounds): 130375 melee ticks, 31440 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (210 rounds): longest scan gap while four or more were alive 63 ticks (210 rounds over 8); rounds whose longest gap at any count was over 8: 210; robots dropped as dead without a death event: 0.

Targeting waves (210 rounds): 43276 sent, 38786 reached their opponent, 10358 virtual hits (26.7% of those reached).

## Melee bench: F28

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 190 over 6 battles (31.7 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 90.3 | 132 / 210 | 1.87 | 18.3% | 22284 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.0 | 18.3% | 132 |
| kid.test.NightFox .2 | 2.0 | 14.6% | 33 |
| qohnil.blot.BlotBot 3.61 | 3.5 | 11.9% | 14 |
| uji.Antique 1.0 | 3.7 | 11.8% | 18 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.4% | 3 |
| ahr.ice.Ice 1.0.2 | 6.3 | 7.8% | 3 |
| amk.ChumbaWumba 0.3 | 6.8 | 7.6% | 4 |
| matt.advanced.Katana 1.0 | 8.5 | 6.0% | 2 |
| stelo.PianistNano 1.2 | 8.8 | 6.0% | 1 |
| stelo.Lifestealer 1.0 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 87.9 | 18 / 35 | 3768 |
| 2 | 1 | 67.7 | 91.1 | 23 / 35 | 3442 |
| 3 | 1 | 68.7 | 93.7 | 26 / 35 | 3979 |
| 4 | 1 | 66.9 | 88.3 | 20 / 35 | 3749 |
| 5 | 1 | 67.6 | 89.5 | 23 / 35 | 3689 |
| 6 | 1 | 67.8 | 91.4 | 22 / 35 | 3657 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 68 | 81% |
| uji.Antique 1.0 | 44 | 91% |
| qohnil.blot.BlotBot 3.61 | 21 | 81% |
| pfvicm.Sobieski 7.2.3b | 8 | 88% |
| amk.ChumbaWumba 0.3 | 5 | 100% |
| ahr.ice.Ice 1.0.2 | 4 | 75% |
| stelo.PianistNano 1.2 | 4 | 75% |
| matt.advanced.Katana 1.0 | 2 | 50% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 27 | 33% | 59 |
| uji.Antique 1.0 | 15 | 18% | 52 |
| qohnil.blot.BlotBot 3.61 | 13 | 16% | 43 |
| pfvicm.Sobieski 7.2.3b | 10 | 12% | 17 |
| amk.ChumbaWumba 0.3 | 7 | 9% | 12 |
| ahr.ice.Ice 1.0.2 | 4 | 5% | 10 |
| stelo.PianistNano 1.2 | 3 | 4% | 8 |
| matt.advanced.Katana 1.0 | 2 | 2% | 7 |
| stelo.Lifestealer 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 137494 melee ticks, 38716 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 55 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 46257 sent, 41820 reached their opponent, 6529 virtual hits (15.6% of those reached).

## Melee bench: F29

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 692 over 6 battles (115.3 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.9 | 98 / 210 | 2.27 | 18.1% | 25316 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.0 | 18.1% | 98 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 15.2% | 50 |
| deewiant.Anomaly 0.2 | 2.7 | 15.0% | 46 |
| myl.micro.Troodon 1.10 | 4.2 | 12.0% | 6 |
| jok.PheonixM 0.1.2 | 5.0 | 10.5% | 8 |
| ph.melee.ArcherME 0.3 | 5.8 | 8.2% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 7.5 | 6.0% | 0 |
| DBall.Anarchy 0.1 | 8.2 | 5.8% | 0 |
| jangs.ns51 1.0 | 9.2 | 4.5% | 0 |
| ap.Frederick 1.1 | 9.2 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 86.0 | 19 / 35 | 4209 |
| 2 | 1 | 67.1 | 85.7 | 14 / 35 | 4086 |
| 3 | 1 | 66.7 | 83.2 | 14 / 35 | 4038 |
| 4 | 1 | 66.7 | 81.6 | 14 / 35 | 4119 |
| 5 | 1 | 69.3 | 90.5 | 17 / 35 | 4289 |
| 6 | 1 | 69.4 | 88.6 | 20 / 35 | 4575 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 55 | 62% |
| zyx.mega.YersiniaPestis 3.1 | 48 | 56% |
| jok.PheonixM 0.1.2 | 19 | 79% |
| myl.micro.Troodon 1.10 | 19 | 89% |
| DBall.Anarchy 0.1 | 2 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 992. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 45 | 38% | 82 |
| zyx.mega.YersiniaPestis 3.1 | 33 | 28% | 58 |
| myl.micro.Troodon 1.10 | 16 | 14% | 36 |
| jok.PheonixM 0.1.2 | 15 | 13% | 28 |
| DBall.Anarchy 0.1 | 1 | 1% | 3 |
| jangs.ns51 1.0 | 1 | 1% | 1 |
| ap.Frederick 1.1 | 1 | 1% | 0 |
| ph.melee.ArcherME 0.3 | 0 | 0% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 165787 melee ticks, 55754 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 32 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 55328 sent, 50810 reached their opponent, 8281 virtual hits (16.3% of those reached).

## Melee bench: F30

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 723 over 6 battles (120.5 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 74.7 | 40 / 210 | 3.28 | 14.4% | 20828 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.3 | 14.4% | 40 |
| catcat20.Matcha 0.006 | 2.2 | 14.2% | 51 |
| darkcanuck.B26354 1.06 | 3.5 | 13.2% | 44 |
| oog.melee.Capulet 1.2 | 3.5 | 13.0% | 33 |
| stelo.PastFuture 2.3.2 | 4.5 | 12.2% | 21 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.2% | 9 |
| tripphippy.Alice 1.1 | 8.0 | 7.0% | 2 |
| ntc.Opposite 1.5 | 8.0 | 6.9% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 8.0 | 7.2% | 10 |
| GarmBox.Anger 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.1 | 75.2 | 8 / 35 | 3428 |
| 2 | 2 | 62.2 | 76.2 | 4 / 35 | 3554 |
| 3 | 1 | 61.7 | 73.7 | 7 / 35 | 3433 |
| 4 | 1 | 61.5 | 71.4 | 7 / 35 | 3604 |
| 5 | 2 | 61.5 | 74.3 | 7 / 35 | 3464 |
| 6 | 1 | 62.4 | 77.5 | 7 / 35 | 3345 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 24 | 42% |
| darkcanuck.B26354 1.06 | 21 | 43% |
| catcat20.Matcha 0.006 | 20 | 35% |
| stelo.PastFuture 2.3.2 | 14 | 50% |
| fowl3628800.LightningBolt 2.6.0 | 5 | 60% |
| tripphippy.Alice 1.1 | 4 | 50% |
| intruder.PrairieWolf 2.61 | 2 | 50% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 177 of 210 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 42 | 24% | 50 |
| darkcanuck.B26354 1.06 | 34 | 19% | 44 |
| stelo.PastFuture 2.3.2 | 31 | 18% | 33 |
| oog.melee.Capulet 1.2 | 26 | 15% | 37 |
| fowl3628800.LightningBolt 2.6.0 | 11 | 6% | 14 |
| tripphippy.Alice 1.1 | 10 | 6% | 13 |
| intruder.PrairieWolf 2.61 | 10 | 6% | 11 |
| ntc.Opposite 1.5 | 6 | 3% | 7 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 210 rounds): 165832 melee ticks, 28274 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (210 rounds): longest scan gap while four or more were alive 57 ticks (210 rounds over 8); rounds whose longest gap at any count was over 8: 210; robots dropped as dead without a death event: 0.

Targeting waves (210 rounds): 53795 sent, 49088 reached their opponent, 8804 virtual hits (17.9% of those reached).

## Melee bench: F31

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 504 over 6 battles (84.0 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 76.7 | 56 / 210 | 3.10 | 14.9% | 19234 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.0% | 94 |
| hadur2.Hadur 3.17.1er | 2.2 | 14.9% | 56 |
| gh.mini.Griezel 0.2 | 3.0 | 13.6% | 41 |
| d414.nano.Quantum 1.0.0 | 4.2 | 11.9% | 9 |
| spinnercat.micro.Tyger 0.1 | 4.8 | 10.8% | 9 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.8% | 2 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.8% | 0 |
| fm.mammillarias 1.3 | 7.8 | 5.9% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 5.0% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 77.5 | 11 / 35 | 3308 |
| 2 | 3 | 61.5 | 73.0 | 9 / 35 | 3080 |
| 3 | 2 | 64.8 | 81.9 | 14 / 35 | 3304 |
| 4 | 2 | 63.6 | 77.5 | 10 / 35 | 3324 |
| 5 | 2 | 62.7 | 76.2 | 7 / 35 | 3267 |
| 6 | 2 | 61.3 | 74.3 | 5 / 35 | 2951 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 36 | 44% |
| gh.mini.Griezel 0.2 | 29 | 66% |
| d414.nano.Quantum 1.0.0 | 14 | 86% |
| spinnercat.micro.Tyger 0.1 | 7 | 57% |
| gh.nano.Grofvuil 0.2 | 4 | 50% |
| fm.mammillarias 1.3 | 2 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 817. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 56 | 35% | 69 |
| gh.mini.Griezel 0.2 | 35 | 22% | 54 |
| d414.nano.Quantum 1.0.0 | 20 | 13% | 30 |
| spinnercat.micro.Tyger 0.1 | 17 | 11% | 21 |
| timmit.nano.TimDog 0.33 | 8 | 5% | 9 |
| gh.nano.Grofvuil 0.2 | 7 | 4% | 14 |
| fm.mammillarias 1.3 | 7 | 4% | 7 |
| Gecko.ultimateGeckoBot 1.0 | 4 | 3% | 5 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 153900 melee ticks, 29853 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 45 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 45 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 50951 sent, 46246 reached their opponent, 7813 virtual hits (16.9% of those reached).

## Melee bench: F32

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 612 over 6 battles (102.0 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 88.3 | 110 / 210 | 2.05 | 17.7% | 23953 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.0 | 17.7% | 110 |
| kawigi.sbf.FloodHT 0.9.2 | 2.3 | 14.6% | 48 |
| apc.botM 3.0 | 3.0 | 12.5% | 30 |
| lxx.ConceptA 0.8 | 4.2 | 10.5% | 7 |
| vjik.UnViolation 1.1 | 4.7 | 10.0% | 6 |
| bayen.UbaMicro 1.4 | 6.0 | 8.7% | 2 |
| panzer.Panzer 0.2 | 7.2 | 7.4% | 1 |
| yk.JahMicro 1.0 | 8.2 | 7.0% | 5 |
| conscience.Electron 1.3g | 8.7 | 6.4% | 1 |
| donjezza.Jezza 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 88.9 | 20 / 35 | 4247 |
| 2 | 1 | 65.4 | 87.0 | 16 / 35 | 3574 |
| 3 | 1 | 65.9 | 86.3 | 18 / 35 | 3795 |
| 4 | 1 | 66.4 | 87.0 | 18 / 35 | 4005 |
| 5 | 1 | 67.2 | 89.5 | 16 / 35 | 4310 |
| 6 | 1 | 67.8 | 91.1 | 22 / 35 | 4022 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 82 | 63% |
| apc.botM 3.0 | 31 | 61% |
| vjik.UnViolation 1.1 | 11 | 82% |
| donjezza.Jezza 1.0 | 9 | 100% |
| yk.JahMicro 1.0 | 8 | 75% |
| bayen.UbaMicro 1.4 | 8 | 88% |
| lxx.ConceptA 0.8 | 4 | 75% |
| panzer.Panzer 0.2 | 3 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 41 | 39% | 84 |
| apc.botM 3.0 | 21 | 20% | 43 |
| lxx.ConceptA 0.8 | 12 | 11% | 15 |
| bayen.UbaMicro 1.4 | 10 | 10% | 16 |
| yk.JahMicro 1.0 | 5 | 5% | 10 |
| vjik.UnViolation 1.1 | 4 | 4% | 20 |
| panzer.Panzer 0.2 | 4 | 4% | 7 |
| conscience.Electron 1.3g | 3 | 3% | 7 |
| donjezza.Jezza 1.0 | 0 | 0% | 8 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 130438 melee ticks, 48203 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 82 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 82 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 45102 sent, 40573 reached their opponent, 7797 virtual hits (19.2% of those reached).

## Melee bench: F33

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 205 over 6 battles (34.2 per battle, most in one battle 111). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 85.6 | 104 / 210 | 2.30 | 17.9% | 25631 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.0 | 17.9% | 104 |
| maribo.Quester 0.3 | 2.0 | 16.0% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 12.7% | 26 |
| gre.svman4.Leonidas 1.3.2 | 3.7 | 11.7% | 19 |
| labg.Cataclysm 2.05 | 4.8 | 10.4% | 13 |
| baal.nano.N 1.42 | 6.3 | 8.9% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 8.2% | 4 |
| zyx.micro.Ant 1.1 | 8.3 | 5.4% | 0 |
| sanja.First 0.1 | 9.0 | 4.8% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 91.7 | 19 / 35 | 4671 |
| 2 | 1 | 66.5 | 84.1 | 14 / 35 | 3947 |
| 3 | 1 | 67.6 | 83.5 | 18 / 35 | 4524 |
| 4 | 1 | 67.8 | 86.3 | 20 / 35 | 4152 |
| 5 | 1 | 67.9 | 87.0 | 16 / 35 | 4182 |
| 6 | 1 | 66.3 | 80.6 | 17 / 35 | 4155 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 48 | 73% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 73% |
| labg.Cataclysm 2.05 | 25 | 72% |
| gre.svman4.Leonidas 1.3.2 | 24 | 71% |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 86% |
| baal.nano.N 1.42 | 4 | 100% |
| sanja.First 0.1 | 1 | 0% |
| zyx.micro.Ant 1.1 | 1 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 1025. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 48 | 44% | 85 |
| gre.svman4.Leonidas 1.3.2 | 19 | 17% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 17% | 42 |
| labg.Cataclysm 2.05 | 7 | 6% | 21 |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 6% | 10 |
| zyx.micro.Ant 1.1 | 4 | 4% | 6 |
| baal.nano.N 1.42 | 3 | 3% | 10 |
| sanja.First 0.1 | 1 | 1% | 2 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 173757 melee ticks, 48318 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 57 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 56086 sent, 51580 reached their opponent, 8130 virtual hits (15.8% of those reached).

## Melee bench: F34

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 521 over 6 battles (86.8 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 84.6 | 58 / 210 | 2.39 | 16.7% | 25963 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.8 | 17.0% | 55 |
| hadur2.Hadur 3.17.1er | 2.0 | 16.7% | 58 |
| stelo.Spread 0.9 | 2.2 | 16.6% | 74 |
| jcs.Seth 1.8 | 4.3 | 11.6% | 20 |
| tcf.Reach 3 | 5.0 | 10.6% | 3 |
| cli.Dancer 1.1 | 5.7 | 9.3% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.0% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.6% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 87.3 | 10 / 35 | 4307 |
| 2 | 3 | 65.0 | 82.2 | 7 / 35 | 3757 |
| 3 | 1 | 67.5 | 86.7 | 10 / 35 | 4495 |
| 4 | 2 | 67.2 | 84.4 | 10 / 35 | 4560 |
| 5 | 2 | 67.0 | 82.5 | 11 / 35 | 4572 |
| 6 | 3 | 66.3 | 84.1 | 10 / 35 | 4272 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 58 | 33% |
| kid.Gladiator .7.2 | 45 | 51% |
| jcs.Seth 1.8 | 20 | 30% |
| cli.Dancer 1.1 | 6 | 100% |
| tcf.Reach 3 | 4 | 75% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 158 of 210 rounds, at a mean tick of 1103. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 66 | 42% | 88 |
| kid.Gladiator .7.2 | 51 | 32% | 64 |
| jcs.Seth 1.8 | 22 | 14% | 30 |
| tcf.Reach 3 | 6 | 4% | 11 |
| cli.Dancer 1.1 | 4 | 3% | 13 |
| ratosh.Wesco 1.4 | 2 | 1% | 2 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 180476 melee ticks, 49206 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 42 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 56343 sent, 51799 reached their opponent, 9088 virtual hits (17.5% of those reached).

## Melee bench: F35

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 381 over 6 battles (63.5 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 79.3 | 27 / 210 | 2.87 | 14.7% | 19415 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.0% | 152 |
| hadur2.Hadur 3.17.1er | 2.0 | 14.7% | 27 |
| gh.mini.Gruwel 0.9 | 3.0 | 13.4% | 19 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 12.0% | 6 |
| rz.HawkOnFire 0.1 | 4.7 | 11.6% | 5 |
| wit.Chuliath 1.0 | 6.2 | 7.1% | 1 |
| myl.nano.KomoriNinja 1.1 | 7.5 | 5.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.2 | 5.7% | 0 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.1% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 82.5 | 4 / 35 | 3323 |
| 2 | 2 | 63.0 | 80.0 | 4 / 35 | 3239 |
| 3 | 2 | 62.7 | 77.5 | 7 / 35 | 3093 |
| 4 | 2 | 63.0 | 79.0 | 7 / 35 | 3265 |
| 5 | 2 | 62.0 | 76.5 | 2 / 35 | 3128 |
| 6 | 2 | 63.7 | 80.0 | 3 / 35 | 3367 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 78 | 13% |
| gh.mini.Gruwel 0.9 | 14 | 43% |
| rz.HawkOnFire 0.1 | 13 | 69% |
| dmh.robocode.robot.BlackDeath 9.2 | 3 | 67% |
| wit.Chuliath 1.0 | 1 | 0% |

Hadur died in 186 of 210 rounds, at a mean tick of 917. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 105 | 56% | 116 |
| gh.mini.Gruwel 0.9 | 28 | 15% | 33 |
| dmh.robocode.robot.BlackDeath 9.2 | 23 | 12% | 27 |
| rz.HawkOnFire 0.1 | 19 | 10% | 26 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 2% | 3 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 2 |
| wit.Chuliath 1.0 | 1 | 1% | 1 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 147813 melee ticks, 41610 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 55 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 46151 sent, 41536 reached their opponent, 6965 virtual hits (16.8% of those reached).

## Melee bench: F36

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 318 over 6 battles (53.0 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 91.2 | 144 / 210 | 1.79 | 19.7% | 28225 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.0 | 19.7% | 144 |
| bzdp.Pansy 2.1 | 2.5 | 12.5% | 11 |
| alpha.RainingFire 1.0 | 2.8 | 12.1% | 19 |
| bvh.micro.Freya 0.3 | 4.0 | 11.1% | 11 |
| mz.Cork 0.1 | 5.2 | 10.3% | 12 |
| bvh.mini.Fenrir 0.39 | 6.2 | 9.4% | 2 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.6% | 8 |
| dl.BetterWalls 1.0 | 8.3 | 5.6% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 5.5% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 92.7 | 26 / 35 | 4880 |
| 2 | 1 | 68.6 | 89.5 | 19 / 35 | 4500 |
| 3 | 1 | 69.2 | 91.4 | 24 / 35 | 4416 |
| 4 | 1 | 71.7 | 96.5 | 30 / 35 | 5111 |
| 5 | 1 | 69.1 | 87.0 | 25 / 35 | 4856 |
| 6 | 1 | 68.8 | 90.2 | 20 / 35 | 4462 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 39 | 95% |
| bvh.micro.Freya 0.3 | 34 | 88% |
| alpha.RainingFire 1.0 | 28 | 82% |
| mz.Cork 0.1 | 25 | 72% |
| bvh.mini.Fenrir 0.39 | 14 | 100% |
| m3thos.Eva02 0.7.1 | 9 | 89% |
| sample.MyFirstRobot 1.0 | 8 | 88% |
| dl.BetterWalls 1.0 | 4 | 75% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 831. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.micro.Freya 0.3 | 18 | 26% | 48 |
| alpha.RainingFire 1.0 | 15 | 22% | 36 |
| mz.Cork 0.1 | 10 | 15% | 24 |
| bzdp.Pansy 2.1 | 9 | 13% | 41 |
| bvh.mini.Fenrir 0.39 | 5 | 7% | 16 |
| m3thos.Eva02 0.7.1 | 3 | 4% | 23 |
| dl.BetterWalls 1.0 | 3 | 4% | 9 |
| squidM.TentalceMeleeNano 1.1 | 2 | 3% | 5 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 8 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 153858 melee ticks, 40389 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 49 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 52932 sent, 48556 reached their opponent, 10405 virtual hits (21.4% of those reached).

## Melee bench: F37

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 239 over 6 battles (39.8 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 88.1 | 157 / 210 | 2.07 | 18.8% | 30717 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.0 | 18.8% | 157 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.7 | 10.6% | 6 |
| agrach.Dalek 1.0 | 4.2 | 9.8% | 13 |
| EBBU.Sim2 1.02 | 4.3 | 9.7% | 5 |
| germ.TheMind .2 | 4.5 | 10.0% | 6 |
| stelo.UntouchableNano 1.3 | 6.2 | 8.9% | 7 |
| lmk.ACPFinal 0.1 | 7.0 | 8.3% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 7.3 | 8.2% | 3 |
| mb.Beast 0.1 | 8.0 | 8.0% | 3 |
| skm.Ryubot 1.0 | 8.8 | 7.7% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 92.4 | 28 / 35 | 5390 |
| 2 | 1 | 66.3 | 83.5 | 25 / 35 | 5043 |
| 3 | 1 | 66.3 | 84.8 | 23 / 35 | 4928 |
| 4 | 1 | 68.6 | 90.5 | 28 / 35 | 5188 |
| 5 | 1 | 68.6 | 91.7 | 26 / 35 | 5306 |
| 6 | 1 | 66.7 | 85.7 | 27 / 35 | 4862 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 28 | 93% |
| com.syncleus.robocode.Dreadnaught 0.1 | 23 | 100% |
| germ.TheMind .2 | 22 | 95% |
| stelo.UntouchableNano 1.3 | 22 | 95% |
| EBBU.Sim2 1.02 | 21 | 100% |
| mb.Beast 0.1 | 20 | 100% |
| skm.Ryubot 1.0 | 13 | 100% |
| lmk.ACPFinal 0.1 | 11 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 50% |

Hadur died in 54 of 210 rounds, at a mean tick of 407. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 13 | 24% | 20 |
| agrach.Dalek 1.0 | 8 | 15% | 33 |
| lmk.ACPFinal 0.1 | 8 | 15% | 18 |
| EBBU.Sim2 1.02 | 7 | 13% | 32 |
| stelo.UntouchableNano 1.3 | 6 | 11% | 25 |
| com.syncleus.robocode.Dreadnaught 0.1 | 5 | 9% | 32 |
| mb.Beast 0.1 | 2 | 4% | 21 |
| germ.TheMind .2 | 2 | 4% | 18 |
| skm.Ryubot 1.0 | 2 | 4% | 8 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 98495 melee ticks, 27581 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 32 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 33479 sent, 29404 reached their opponent, 9167 virtual hits (31.2% of those reached).

## Melee bench: F38

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 304 over 6 battles (50.7 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 83.7 | 82 / 210 | 2.47 | 16.7% | 24022 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.5 | 16.5% | 76 |
| hadur2.Hadur 3.17.1er | 1.5 | 16.7% | 82 |
| bvh.mini.Freya 0.55 | 3.7 | 12.1% | 13 |
| cs.Wren 1.0 | 4.3 | 11.2% | 6 |
| bts.mega.Gnarly 1.4 | 4.5 | 10.9% | 17 |
| kdf.KoulDestroyer 1.0 | 6.0 | 9.5% | 10 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.8 | 8.7% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.8 | 6.6% | 5 |
| matt.UnderDark3 2.4.34 | 8.8 | 4.4% | 0 |
| bzdp.BoxCar 2.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 83.8 | 15 / 35 | 3991 |
| 2 | 1 | 65.5 | 81.6 | 13 / 35 | 4165 |
| 3 | 2 | 64.1 | 80.6 | 10 / 35 | 3644 |
| 4 | 1 | 67.0 | 85.1 | 18 / 35 | 4190 |
| 5 | 1 | 66.6 | 85.7 | 16 / 35 | 3931 |
| 6 | 2 | 65.7 | 85.1 | 10 / 35 | 4101 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 58 | 52% |
| bts.mega.Gnarly 1.4 | 19 | 74% |
| cs.Wren 1.0 | 15 | 80% |
| bvh.mini.Freya 0.55 | 14 | 64% |
| kawigi.spare.SpareParts 0.7.6nosnd | 9 | 78% |
| kdf.KoulDestroyer 1.0 | 9 | 56% |
| davidalves.net.DuelistNanoMelee 1.01 | 5 | 80% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 796. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 53 | 41% | 80 |
| bvh.mini.Freya 0.55 | 24 | 18% | 34 |
| bts.mega.Gnarly 1.4 | 15 | 12% | 30 |
| kdf.KoulDestroyer 1.0 | 12 | 9% | 13 |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 8% | 19 |
| cs.Wren 1.0 | 9 | 7% | 22 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 2% | 10 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 144347 melee ticks, 36314 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 36 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 36 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 47622 sent, 42864 reached their opponent, 9915 virtual hits (23.1% of those reached).

## Melee bench: F39

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 289 over 6 battles (48.2 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 85.7 | 95 / 210 | 2.29 | 17.5% | 26328 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.0 | 17.5% | 95 |
| bvh.fry.Freya 0.82 | 2.2 | 14.7% | 23 |
| az.Ololobot 0.2.4 | 2.8 | 13.1% | 52 |
| catcat20.Lambda 0.024 | 4.0 | 11.9% | 29 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 8.7% | 4 |
| apollokidd.ApolloKidd 0.9 | 6.8 | 8.0% | 1 |
| gimp.GimpBot 0.1 | 6.8 | 8.2% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 7.0 | 7.5% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.6% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 84.1 | 19 / 35 | 4715 |
| 2 | 1 | 66.0 | 84.1 | 16 / 35 | 4335 |
| 3 | 1 | 65.0 | 83.8 | 14 / 35 | 3888 |
| 4 | 1 | 66.5 | 86.3 | 13 / 35 | 4330 |
| 5 | 1 | 67.2 | 85.7 | 16 / 35 | 4608 |
| 6 | 1 | 67.4 | 90.2 | 17 / 35 | 4452 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 48 | 50% |
| catcat20.Lambda 0.024 | 43 | 63% |
| bvh.fry.Freya 0.82 | 40 | 85% |
| winamp32.micro.MicroMacro 1.0 | 6 | 50% |
| gimp.GimpBot 0.1 | 4 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 2 | 50% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 1006. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 35 | 30% | 67 |
| az.Ololobot 0.2.4 | 33 | 28% | 60 |
| catcat20.Lambda 0.024 | 26 | 22% | 45 |
| stelo.SoRobotNanoMelee 1.2 | 8 | 7% | 8 |
| winamp32.micro.MicroMacro 1.0 | 6 | 5% | 12 |
| gimp.GimpBot 0.1 | 4 | 3% | 10 |
| apollokidd.ApolloKidd 0.9 | 3 | 3% | 7 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 168440 melee ticks, 48860 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 74 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 74 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 54355 sent, 49783 reached their opponent, 9556 virtual hits (19.2% of those reached).

## Melee bench: F40

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 640 over 6 battles (106.7 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 85.9 | 129 / 210 | 2.27 | 18.6% | 26988 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.0 | 18.6% | 129 |
| kawigi.mini.Coriantumr 1.1 | 2.2 | 14.3% | 32 |
| kano.gamma.KanoGamma 1.8 | 2.8 | 12.7% | 23 |
| mz.AntiGrav 1.0 | 4.5 | 11.0% | 9 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.5% | 7 |
| alpha.BlackIce 1.0 | 6.2 | 9.4% | 2 |
| stelo.Randomness 1.0 | 6.3 | 9.1% | 8 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.3% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 4.5% | 0 |
| sample.Corners 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 79.0 | 20 / 35 | 4739 |
| 2 | 1 | 68.6 | 86.3 | 23 / 35 | 4549 |
| 3 | 1 | 66.6 | 83.5 | 19 / 35 | 3884 |
| 4 | 1 | 69.8 | 91.4 | 20 / 35 | 4821 |
| 5 | 1 | 67.6 | 81.9 | 22 / 35 | 4491 |
| 6 | 1 | 69.9 | 93.3 | 25 / 35 | 4504 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 49 | 86% |
| kano.gamma.KanoGamma 1.8 | 47 | 77% |
| mz.AntiGrav 1.0 | 18 | 94% |
| Polkwane.SmashMelee 1.0 | 16 | 94% |
| stelo.Randomness 1.0 | 12 | 83% |
| alpha.BlackIce 1.0 | 8 | 75% |
| amk.superstrike.SuperStrike 0.3 | 2 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 783. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 24 | 28% | 53 |
| kano.gamma.KanoGamma 1.8 | 20 | 23% | 63 |
| Polkwane.SmashMelee 1.0 | 12 | 14% | 26 |
| mz.AntiGrav 1.0 | 8 | 9% | 22 |
| stelo.Randomness 1.0 | 6 | 7% | 17 |
| amk.superstrike.SuperStrike 0.3 | 5 | 6% | 12 |
| alpha.BlackIce 1.0 | 4 | 5% | 11 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 4 |
| sample.Corners 1.0 | 1 | 1% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 147583 melee ticks, 40135 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 114 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 114 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 50027 sent, 45438 reached their opponent, 10302 virtual hits (22.7% of those reached).

## Melee bench: F41

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 187 over 6 battles (31.2 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 85.0 | 91 / 210 | 2.35 | 17.0% | 22980 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.3 | 17.0% | 91 |
| eem.EvBotNG v12.8 | 1.7 | 16.4% | 82 |
| ary.Swarm 1.1 | 3.3 | 13.1% | 10 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 13.0% | 14 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.9% | 8 |
| shrub.Silver v048 | 6.0 | 9.3% | 4 |
| zyx.nano.Ant 1.1 | 7.0 | 7.3% | 1 |
| jsal.Jsalbot 1.0 | 8.2 | 5.6% | 1 |
| stelo.Mirror 1.1 | 8.8 | 5.3% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 85.4 | 17 / 35 | 3920 |
| 2 | 1 | 67.3 | 86.3 | 15 / 35 | 3921 |
| 3 | 1 | 67.5 | 87.0 | 19 / 35 | 3980 |
| 4 | 1 | 68.0 | 90.5 | 17 / 35 | 3850 |
| 5 | 2 | 65.9 | 82.5 | 11 / 35 | 3984 |
| 6 | 2 | 63.9 | 78.1 | 12 / 35 | 3325 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 65 | 37% |
| lessonz.robocode.Oz 0.5.0 | 31 | 84% |
| ary.Swarm 1.1 | 16 | 94% |
| simonton.nano.MeleeSeed 1.8 | 14 | 100% |
| shrub.Silver v048 | 11 | 91% |
| jsal.Jsalbot 1.0 | 3 | 67% |

Hadur died in 121 of 210 rounds, at a mean tick of 921. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 66 | 55% | 89 |
| ary.Swarm 1.1 | 19 | 16% | 31 |
| lessonz.robocode.Oz 0.5.0 | 13 | 11% | 34 |
| simonton.nano.MeleeSeed 1.8 | 13 | 11% | 28 |
| shrub.Silver v048 | 3 | 2% | 14 |
| zyx.nano.Ant 1.1 | 3 | 2% | 4 |
| jsal.Jsalbot 1.0 | 1 | 1% | 6 |
| stelo.Mirror 1.1 | 1 | 1% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 156331 melee ticks, 43825 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 47 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 52624 sent, 48046 reached their opponent, 8132 virtual hits (16.9% of those reached).

## Melee bench: F42

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 191 over 6 battles (31.8 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.3 | 119 / 210 | 2.05 | 18.6% | 29506 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.0 | 18.6% | 119 |
| wompi.Wallaby 5.1 | 2.0 | 15.8% | 46 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.5% | 12 |
| ara.Shera 0.88 | 3.5 | 13.4% | 30 |
| amz.NanoClone 1.41 | 5.0 | 8.8% | 1 |
| dsw.StaticD 1.0 | 6.2 | 7.0% | 2 |
| maribo.IotaCT 1.1 | 7.3 | 6.6% | 0 |
| stelo.MirrorMicro 1.0 | 8.7 | 5.5% | 0 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 83.5 | 15 / 35 | 4576 |
| 2 | 1 | 70.0 | 92.1 | 25 / 35 | 5005 |
| 3 | 1 | 68.1 | 87.0 | 19 / 35 | 4869 |
| 4 | 1 | 68.4 | 87.6 | 18 / 35 | 5054 |
| 5 | 1 | 68.4 | 87.6 | 18 / 35 | 5026 |
| 6 | 1 | 69.7 | 92.1 | 24 / 35 | 4976 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 86 | 79% |
| maribo.mini.MiniQuester 0.1 | 36 | 92% |
| ara.Shera 0.88 | 21 | 71% |
| dsw.StaticD 1.0 | 3 | 67% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 0% |

Hadur died in 94 of 210 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 36 | 38% | 99 |
| ara.Shera 0.88 | 26 | 28% | 38 |
| maribo.mini.MiniQuester 0.1 | 20 | 21% | 54 |
| amz.NanoClone 1.41 | 6 | 6% | 7 |
| dsw.StaticD 1.0 | 3 | 3% | 6 |
| stelo.MirrorMicro 1.0 | 2 | 2% | 3 |
| maribo.IotaCT 1.1 | 0 | 0% | 2 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 170836 melee ticks, 45266 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 39 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 53691 sent, 49329 reached their opponent, 10354 virtual hits (21.0% of those reached).

## Melee bench: F43

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 718 over 6 battles (119.7 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 77.8 | 27 / 210 | 3.00 | 14.6% | 19857 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.0% | 150 |
| hadur2.Hadur 3.17.1er | 2.0 | 14.6% | 27 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.7% | 21 |
| dummy.micro.Sparrow 2.5 | 4.2 | 11.6% | 4 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 11.4% | 5 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.6% | 0 |
| mz.NanoGod 2.02 | 7.2 | 7.7% | 1 |
| jab.DiamondStealer 5 | 7.8 | 7.0% | 1 |
| cvt.Firsty 1.0 | 9.0 | 3.7% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 82.2 | 7 / 35 | 3513 |
| 2 | 2 | 62.8 | 74.3 | 3 / 35 | 3275 |
| 3 | 2 | 65.5 | 84.4 | 4 / 35 | 3411 |
| 4 | 2 | 63.5 | 75.6 | 5 / 35 | 3263 |
| 5 | 2 | 62.2 | 72.7 | 3 / 35 | 3152 |
| 6 | 2 | 64.2 | 77.5 | 5 / 35 | 3243 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 77 | 16% |
| brainfade.melee.Dusk 0.44 | 17 | 35% |
| wcsv.melee.EngineerMelee 0.1 | 7 | 86% |
| dummy.micro.Sparrow 2.5 | 2 | 50% |
| Krabb.akim2.Akim2 1.1b | 2 | 100% |
| jab.DiamondStealer 5 | 1 | 0% |

Hadur died in 189 of 210 rounds, at a mean tick of 962. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 114 | 60% | 127 |
| brainfade.melee.Dusk 0.44 | 27 | 14% | 34 |
| dummy.micro.Sparrow 2.5 | 19 | 10% | 19 |
| wcsv.melee.EngineerMelee 0.1 | 10 | 5% | 15 |
| Krabb.akim2.Akim2 1.1b | 5 | 3% | 7 |
| mz.NanoGod 2.02 | 5 | 3% | 5 |
| jab.DiamondStealer 5 | 3 | 2% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 161898 melee ticks, 42869 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 66 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 52106 sent, 47383 reached their opponent, 8221 virtual hits (17.4% of those reached).

## Melee bench: F44

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 432 over 6 battles (72.0 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 92.7 | 142 / 210 | 1.66 | 20.2% | 31065 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.0 | 20.2% | 142 |
| stelo.Liblix 0.3.1 | 2.2 | 15.6% | 49 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.1% | 13 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.5 | 9.4% | 0 |
| jwirde.Gort 2.0 | 4.7 | 9.4% | 4 |
| wompi.Quokka 1.6 | 6.5 | 7.7% | 1 |
| disan.Chair 2.2.0 | 6.7 | 7.3% | 0 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.9% | 0 |
| sample.Crazy 1.0 | 9.2 | 4.8% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 91.4 | 21 / 35 | 5061 |
| 2 | 1 | 71.3 | 95.2 | 27 / 35 | 5013 |
| 3 | 1 | 70.5 | 91.1 | 23 / 35 | 5347 |
| 4 | 1 | 70.2 | 91.7 | 24 / 35 | 5006 |
| 5 | 1 | 71.8 | 95.6 | 26 / 35 | 5546 |
| 6 | 1 | 69.7 | 91.1 | 21 / 35 | 5092 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 76 | 67% |
| tzu.TheArtOfWar 1.2 | 74 | 89% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 10 | 100% |
| disan.Chair 2.2.0 | 6 | 100% |
| jwirde.Gort 2.0 | 6 | 100% |
| wompi.Quokka 1.6 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 957. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 34 | 48% | 84 |
| tzu.TheArtOfWar 1.2 | 19 | 27% | 80 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 7% | 10 |
| jwirde.Gort 2.0 | 4 | 6% | 15 |
| stf.PanzerGeneral 0.1 | 3 | 4% | 4 |
| wompi.Quokka 1.6 | 2 | 3% | 7 |
| disan.Chair 2.2.0 | 1 | 1% | 8 |
| sample.Crazy 1.0 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 159587 melee ticks, 49332 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 32 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 55637 sent, 51161 reached their opponent, 11229 virtual hits (21.9% of those reached).

## Melee bench: F45

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 703 over 6 battles (117.2 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 85.0 | 91 / 210 | 2.35 | 18.3% | 28950 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1er | 1.0 | 18.3% | 91 |
| eem.IWillFireNoBullet v2.8 | 2.7 | 12.5% | 87 |
| jje.BagPuss 1.2 | 2.7 | 13.0% | 13 |
| sul.Lunar 1.1 | 4.0 | 11.2% | 11 |
| myl.nano.Graviton 1.10 | 4.8 | 10.2% | 3 |
| fm.claire 1.7 | 6.7 | 8.5% | 0 |
| hvilela.HVilela 0.9 | 7.0 | 8.4% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.2 | 8.7% | 3 |
| wit.Deep7 2.0 | 9.2 | 4.9% | 1 |
| abud.ThirdRobo 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.9 | 19 / 35 | 4936 |
| 2 | 1 | 66.5 | 81.0 | 11 / 35 | 4986 |
| 3 | 1 | 67.0 | 82.9 | 17 / 35 | 4563 |
| 4 | 1 | 68.1 | 86.0 | 15 / 35 | 4812 |
| 5 | 1 | 67.9 | 85.7 | 14 / 35 | 4956 |
| 6 | 1 | 68.1 | 86.7 | 15 / 35 | 4697 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 70 | 41% |
| jje.BagPuss 1.2 | 24 | 63% |
| sul.Lunar 1.1 | 23 | 83% |
| myl.nano.Graviton 1.10 | 15 | 93% |
| pez.mini.ChironexFleckeri 0.5 | 8 | 88% |
| hvilela.HVilela 0.9 | 5 | 80% |
| wit.Deep7 2.0 | 2 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 1562. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 45 | 36% | 0 |
| jje.BagPuss 1.2 | 32 | 25% | 77 |
| myl.nano.Graviton 1.10 | 13 | 10% | 35 |
| sul.Lunar 1.1 | 10 | 8% | 47 |
| pez.mini.ChironexFleckeri 0.5 | 7 | 6% | 20 |
| fm.claire 1.7 | 6 | 5% | 12 |
| hvilela.HVilela 0.9 | 5 | 4% | 11 |
| abud.ThirdRobo 1.0 | 1 | 1% | 4 |
| wit.Deep7 2.0 | 1 | 1% | 4 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 218307 melee ticks, 73717 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 66 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 65362 sent, 60906 reached their opponent, 9591 virtual hits (15.7% of those reached).

## Melee bench: F46

hadur2.Hadur 3.17.1er against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 389 over 6 battles (64.8 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 81.9 | 50 / 210 | 2.63 | 15.6% | 22560 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.1% | 70 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.7% | 79 |
| hadur2.Hadur 3.17.1er | 2.8 | 15.6% | 50 |
| cx.Princess 1.0 | 4.7 | 10.1% | 6 |
| mz.MicroSheep 1.0 | 4.8 | 10.4% | 2 |
| sadoner.killer 0.2 | 5.5 | 9.8% | 2 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.3% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.2 | 5.3% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.6% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.0 | 81.9 | 7 / 35 | 3891 |
| 2 | 3 | 64.1 | 81.3 | 5 / 35 | 3670 |
| 3 | 3 | 63.9 | 81.9 | 7 / 35 | 3403 |
| 4 | 2 | 65.6 | 82.2 | 11 / 35 | 4096 |
| 5 | 3 | 64.4 | 81.3 | 9 / 35 | 3598 |
| 6 | 3 | 65.2 | 82.9 | 11 / 35 | 3902 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 55 | 55% |
| rsalesc.melee.Medina 0.4.5 | 38 | 24% |
| cx.Princess 1.0 | 7 | 71% |
| arthord.NanoSatanMelee Beta | 3 | 67% |
| mz.MicroSheep 1.0 | 3 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 163 of 210 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 66 | 40% | 94 |
| rsalesc.melee.Medina 0.4.5 | 62 | 38% | 71 |
| sadoner.killer 0.2 | 8 | 5% | 9 |
| cx.Princess 1.0 | 7 | 4% | 11 |
| arthord.NanoSatanMelee Beta | 7 | 4% | 8 |
| mz.MicroSheep 1.0 | 6 | 4% | 13 |
| jeremyreeder.collective.Prophet 5 | 2 | 1% | 2 |
| kurios.DOSexe .9a | 2 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 153958 melee ticks, 37813 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 39 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 45918 sent, 41379 reached their opponent, 6702 virtual hits (16.2% of those reached).

