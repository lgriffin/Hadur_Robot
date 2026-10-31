# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 457 over 6 battles (76.2 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.9 | 53 / 210 | 2.27 | 17.8% | 33485 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.6% | 139 |
| hadur117.Hadur 3.20ec | 2.0 | 17.8% | 53 |
| sgp.JollyNinja 3.53 | 3.2 | 11.5% | 12 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 10.8% | 1 |
| lorneswork.Predator 1.0 | 5.0 | 10.2% | 4 |
| mz.MicroGodMelee 1 | 5.5 | 10.0% | 0 |
| adt.Ar2 1.0 | 7.0 | 7.6% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.1% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.4% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.3 | 85.7 | 11 / 35 | 5728 |
| 2 | 2 | 68.6 | 87.0 | 10 / 35 | 5678 |
| 3 | 2 | 67.3 | 83.8 | 9 / 35 | 5180 |
| 4 | 2 | 68.1 | 86.7 | 7 / 35 | 5719 |
| 5 | 2 | 67.8 | 86.0 | 8 / 35 | 5694 |
| 6 | 2 | 67.8 | 86.0 | 8 / 35 | 5486 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 119 | 9% |
| sgp.JollyNinja 3.53 | 21 | 62% |
| mz.MicroGodMelee 1 | 14 | 100% |
| lorneswork.Predator 1.0 | 6 | 83% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 100% |
| adt.Ar2 1.0 | 3 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 1149. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 121 | 76% | 137 |
| lorneswork.Predator 1.0 | 10 | 6% | 13 |
| sgp.JollyNinja 3.53 | 9 | 6% | 20 |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 5% | 14 |
| mz.MicroGodMelee 1 | 6 | 4% | 18 |
| adt.Ar2 1.0 | 2 | 1% | 4 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 139891 melee ticks, 88645 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 64 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 43417 sent, 38489 reached their opponent, 7295 virtual hits (19.0% of those reached).

## Melee bench: F02

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 269 over 6 battles (44.8 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 82.0 | 69 / 210 | 2.62 | 18.0% | 32802 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 18.0% | 69 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 13.5% | 29 |
| pulsar.PulsarMax 0.8.9 | 2.7 | 13.6% | 53 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.9% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.4% | 21 |
| Noran.BitchingElk 0.054 | 6.2 | 8.7% | 19 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 7.9% | 0 |
| sch.Simone 0.3d | 7.8 | 7.4% | 15 |
| stelo.PatternRobot 1.0 | 9.0 | 5.8% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 79.0 | 9 / 35 | 5367 |
| 2 | 1 | 66.8 | 80.0 | 10 / 35 | 5461 |
| 3 | 1 | 67.5 | 81.9 | 8 / 35 | 5831 |
| 4 | 1 | 65.7 | 75.9 | 9 / 35 | 5266 |
| 5 | 1 | 69.4 | 88.6 | 20 / 35 | 5396 |
| 6 | 1 | 68.5 | 86.3 | 13 / 35 | 5481 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 45 | 36% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 38 | 63% |
| com.cohesiva.robocode.ManOwaR 1.0 | 17 | 47% |
| Noran.BitchingElk 0.054 | 17 | 35% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 100% |
| sch.Simone 0.3d | 6 | 33% |
| fnc.bandit.Bandit 5.2.0 | 2 | 100% |
| stelo.PatternRobot 1.0 | 1 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 981. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 47 | 33% | 64 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 25 | 18% | 42 |
| com.cohesiva.robocode.ManOwaR 1.0 | 17 | 12% | 25 |
| sch.Simone 0.3d | 15 | 11% | 20 |
| Noran.BitchingElk 0.054 | 13 | 9% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 8% | 19 |
| fnc.bandit.Bandit 5.2.0 | 7 | 5% | 9 |
| stelo.PatternRobot 1.0 | 4 | 3% | 7 |
| fullsail.SweetTea 1.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 163255 melee ticks, 44206 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 56 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 56227 sent, 51424 reached their opponent, 8744 virtual hits (17.0% of those reached).

## Melee bench: F03

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 143 over 6 battles (23.8 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 92.2 | 164 / 210 | 1.70 | 21.1% | 40895 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 21.1% | 164 |
| radnor.DoctorBob 1.42 | 2.0 | 14.0% | 24 |
| kawigi.nano.Lib 1.0 | 3.2 | 12.4% | 5 |
| vuen.Cake 2.51 | 3.8 | 12.0% | 11 |
| urdos.URDOS 1.3 | 5.0 | 9.5% | 4 |
| adt.Ar1 2.1 | 6.2 | 7.8% | 1 |
| oa.weak.FlyMk1 0.1 | 7.0 | 6.9% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.3% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 5.5% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 9.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 87.6 | 23 / 35 | 6634 |
| 2 | 1 | 71.8 | 94.0 | 27 / 35 | 6822 |
| 3 | 1 | 70.7 | 91.1 | 28 / 35 | 6336 |
| 4 | 1 | 70.9 | 89.8 | 27 / 35 | 6738 |
| 5 | 1 | 73.0 | 96.5 | 31 / 35 | 7204 |
| 6 | 1 | 72.0 | 94.0 | 28 / 35 | 7161 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 67 | 91% |
| radnor.DoctorBob 1.42 | 64 | 98% |
| kawigi.nano.Lib 1.0 | 32 | 94% |
| adt.Ar1 2.1 | 4 | 75% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| urdos.URDOS 1.3 | 3 | 100% |

Hadur died in 46 of 210 rounds, at a mean tick of 613. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 13 | 28% | 71 |
| kawigi.nano.Lib 1.0 | 10 | 22% | 38 |
| vuen.Cake 2.51 | 9 | 20% | 62 |
| bwbaugh.nano.Tirunculus 0.0.0a | 7 | 15% | 9 |
| urdos.URDOS 1.3 | 4 | 9% | 8 |
| oa.weak.FlyMk1 0.1 | 2 | 4% | 11 |
| adt.Ar1 2.1 | 1 | 2% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 199 rounds): 120807 melee ticks, 42446 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 71 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 35364 sent, 30724 reached their opponent, 7346 virtual hits (23.9% of those reached).

## Melee bench: F04

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 615 over 6 battles (102.5 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 85.9 | 32 / 210 | 2.27 | 18.1% | 36430 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.4% | 161 |
| hadur117.Hadur 3.20ec | 2.0 | 18.1% | 32 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.2% | 5 |
| TNT.TNT 0.99.1 | 4.2 | 10.9% | 7 |
| josago.Jorgito 0.16 | 5.2 | 9.1% | 4 |
| css.Delitioner 0.11 | 5.8 | 7.6% | 1 |
| tj.zombie1n 1.0.1 | 7.2 | 6.4% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.2% | 0 |
| spin.Bugstard 0.012b | 9.3 | 3.9% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.0 | 86.3 | 4 / 35 | 5907 |
| 2 | 2 | 69.3 | 86.3 | 3 / 35 | 6356 |
| 3 | 2 | 68.4 | 83.2 | 7 / 35 | 5929 |
| 4 | 2 | 68.1 | 85.4 | 3 / 35 | 5707 |
| 5 | 2 | 70.4 | 87.6 | 11 / 35 | 6741 |
| 6 | 2 | 68.5 | 86.7 | 4 / 35 | 5790 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 125 | 10% |
| apc.LeeroyJenkins2 1.0 | 13 | 77% |
| TNT.TNT 0.99.1 | 12 | 58% |
| css.Delitioner 0.11 | 2 | 100% |
| josago.Jorgito 0.16 | 2 | 50% |

Hadur died in 183 of 210 rounds, at a mean tick of 1242. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 137 | 75% | 151 |
| apc.LeeroyJenkins2 1.0 | 20 | 11% | 28 |
| TNT.TNT 0.99.1 | 12 | 7% | 20 |
| josago.Jorgito 0.16 | 7 | 4% | 8 |
| css.Delitioner 0.11 | 2 | 1% | 2 |
| rampancy.Durandal 2.1d | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 187145 melee ticks, 66816 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 99 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 99 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 2.

Targeting waves (204 rounds): 55160 sent, 50448 reached their opponent, 7416 virtual hits (14.7% of those reached).

## Melee bench: F05

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 410 over 6 battles (68.3 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 77.0 | 36 / 210 | 3.07 | 15.3% | 25460 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.DemonicRage 3.4 | 1.5 | 16.9% | 60 |
| cb.fire.Firestarter 2.0f | 1.7 | 17.7% | 93 |
| hadur117.Hadur 3.20ec | 2.8 | 15.3% | 36 |
| wompi.Numbat 2.1 | 4.0 | 12.7% | 11 |
| axeBots.HataMoto 3.09 | 5.2 | 9.6% | 9 |
| ms.Ares 0.19 | 5.8 | 9.0% | 1 |
| supersample.SuperBoxBot 1.0 | 7.3 | 5.5% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.3% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.2 | 4.2% | 0 |
| GarmBox.Oranges 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 81.9 | 7 / 35 | 4772 |
| 2 | 3 | 62.6 | 73.7 | 4 / 35 | 3789 |
| 3 | 3 | 63.8 | 74.9 | 7 / 35 | 4125 |
| 4 | 3 | 64.2 | 77.8 | 6 / 35 | 4136 |
| 5 | 3 | 65.7 | 78.1 | 6 / 35 | 4633 |
| 6 | 3 | 63.8 | 75.6 | 6 / 35 | 4005 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 40 | 43% |
| cb.fire.Firestarter 2.0f | 31 | 10% |
| wompi.Numbat 2.1 | 11 | 82% |
| axeBots.HataMoto 3.09 | 6 | 67% |
| ms.Ares 0.19 | 4 | 75% |

Hadur died in 177 of 210 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 66 | 37% | 71 |
| justin.DemonicRage 3.4 | 65 | 37% | 79 |
| wompi.Numbat 2.1 | 19 | 11% | 26 |
| axeBots.HataMoto 3.09 | 15 | 8% | 20 |
| ms.Ares 0.19 | 5 | 3% | 9 |
| supersample.SuperBoxBot 1.0 | 3 | 2% | 4 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 147255 melee ticks, 36545 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 64 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 43947 sent, 38909 reached their opponent, 5972 virtual hits (15.3% of those reached).

## Melee bench: F06

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 201 over 6 battles (33.5 per battle, most in one battle 109). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 88.1 | 122 / 210 | 2.07 | 19.5% | 32969 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 19.5% | 122 |
| jekl.StoneGhost 0.7 | 2.5 | 14.0% | 17 |
| origin.SleepSiphon 1.7b | 2.5 | 14.2% | 48 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.5 | 11.4% | 11 |
| mld.Wisdom 1.0 | 4.7 | 10.7% | 3 |
| gg.Wolverine 2.0 | 6.0 | 8.5% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 7.3% | 3 |
| DBall.NUKE 0.1 | 8.2 | 6.1% | 1 |
| spinnercat.Omen 1.0 | 8.7 | 5.6% | 1 |
| sample.Fire 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 83.5 | 20 / 35 | 4682 |
| 2 | 1 | 71.7 | 92.7 | 24 / 35 | 6109 |
| 3 | 1 | 69.7 | 88.3 | 18 / 35 | 5457 |
| 4 | 1 | 70.7 | 88.9 | 24 / 35 | 5560 |
| 5 | 1 | 69.4 | 86.7 | 17 / 35 | 5660 |
| 6 | 1 | 69.9 | 88.9 | 19 / 35 | 5501 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 58 | 86% |
| origin.SleepSiphon 1.7b | 45 | 71% |
| pe.minimelee.SandboxMiniMelee 1.1 | 26 | 92% |
| gg.Wolverine 2.0 | 9 | 89% |
| mld.Wisdom 1.0 | 4 | 100% |
| DBall.NUKE 0.1 | 3 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 791. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 37 | 41% | 70 |
| jekl.StoneGhost 0.7 | 20 | 22% | 49 |
| pe.minimelee.SandboxMiniMelee 1.1 | 14 | 16% | 40 |
| mld.Wisdom 1.0 | 13 | 14% | 27 |
| gg.Wolverine 2.0 | 4 | 4% | 14 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 6 |
| DBall.NUKE 0.1 | 0 | 0% | 2 |
| sample.Fire 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 142502 melee ticks, 37205 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 39 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 43178 sent, 38479 reached their opponent, 7914 virtual hits (20.6% of those reached).

## Melee bench: F07

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 524 over 6 battles (87.3 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 92.9 | 109 / 210 | 1.64 | 21.0% | 41204 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 21.0% | 109 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 16.8% | 47 |
| rtk.Tachikoma 1.0 | 2.8 | 16.4% | 39 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.1% | 6 |
| franzor.Lizt 1.3.1 | 4.7 | 10.8% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.0% | 0 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.4% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.4% | 0 |
| sample.Target 1.0 | 9.2 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 92.1 | 15 / 35 | 6693 |
| 2 | 1 | 73.2 | 94.0 | 21 / 35 | 7009 |
| 3 | 1 | 72.8 | 93.0 | 19 / 35 | 6944 |
| 4 | 1 | 72.7 | 93.3 | 17 / 35 | 6819 |
| 5 | 1 | 72.3 | 91.4 | 19 / 35 | 6768 |
| 6 | 1 | 72.6 | 93.7 | 18 / 35 | 6971 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 90 | 64% |
| rsalesc.melee.Monk 0.3.6c | 49 | 29% |
| oog.melee.CapuletDroid 1.1 | 23 | 87% |
| franzor.Lizt 1.3.1 | 22 | 73% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 1332. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 45 | 43% | 107 |
| rsalesc.melee.Monk 0.3.6c | 42 | 40% | 69 |
| franzor.Lizt 1.3.1 | 8 | 8% | 1 |
| oog.melee.CapuletDroid 1.1 | 5 | 5% | 29 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 3 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 177789 melee ticks, 89102 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 72 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 51324 sent, 46592 reached their opponent, 9104 virtual hits (19.5% of those reached).

## Melee bench: F08

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 731 over 6 battles (121.8 per battle, most in one battle 146). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 91.2 | 131 / 210 | 1.79 | 19.9% | 31748 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 19.9% | 131 |
| shrub.Vapour v159 | 2.7 | 12.5% | 23 |
| tm.Yuugao 1.0 | 2.8 | 12.0% | 26 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 10.9% | 19 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 9.9% | 9 |
| m3thos.Eva00 1.1 | 6.0 | 8.8% | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 7.2 | 8.1% | 4 |
| qualidafial.MajorDick 1.0.1 | 7.7 | 7.3% | 0 |
| SHAM.WOW 1.4 | 9.3 | 5.5% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 94.0 | 23 / 35 | 5412 |
| 2 | 1 | 70.2 | 91.4 | 23 / 35 | 5538 |
| 3 | 1 | 69.2 | 89.2 | 20 / 35 | 5119 |
| 4 | 1 | 69.9 | 90.8 | 24 / 35 | 5256 |
| 5 | 1 | 67.8 | 87.9 | 17 / 35 | 4798 |
| 6 | 1 | 70.6 | 94.0 | 24 / 35 | 5625 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 46 | 74% |
| shrub.Vapour v159 | 42 | 69% |
| Krabb.sliNk.Garm 0.9u | 27 | 74% |
| com.spp.robocode.MostlyHarmless 010 | 21 | 90% |
| m3thos.Eva00 1.1 | 10 | 100% |
| qualidafial.MajorDick 1.0.1 | 10 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 10 | 80% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 26 | 31% | 63 |
| shrub.Vapour v159 | 20 | 24% | 46 |
| Krabb.sliNk.Garm 0.9u | 15 | 18% | 31 |
| com.spp.robocode.MostlyHarmless 010 | 10 | 12% | 26 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 6% | 23 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 6 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 2 |
| m3thos.Eva00 1.1 | 0 | 0% | 10 |
| SHAM.WOW 1.4 | 0 | 0% | 3 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 147586 melee ticks, 42152 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 47 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 46620 sent, 41827 reached their opponent, 7231 virtual hits (17.3% of those reached).

## Melee bench: F09

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 518 over 6 battles (86.3 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 76.7 | 50 / 210 | 3.10 | 15.6% | 23437 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 16.9% | 93 |
| hadur117.Hadur 3.20ec | 1.8 | 15.6% | 50 |
| kc.micro.Figment 1.0 | 3.0 | 13.6% | 20 |
| pedersen.Grishnakh 1.0 | 4.5 | 10.8% | 17 |
| yagami.Tidus 0.11 | 5.0 | 10.3% | 2 |
| mc2.enemy.Original 0.9 | 5.7 | 9.7% | 21 |
| dft.Calliope 5.6 | 6.8 | 8.2% | 6 |
| step.nanoPri 1.0 | 8.2 | 5.7% | 0 |
| rdm.Dueler 0.4x | 9.2 | 4.8% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.7 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.6 | 77.8 | 8 / 35 | 3792 |
| 2 | 2 | 65.5 | 79.4 | 12 / 35 | 4095 |
| 3 | 1 | 65.1 | 79.7 | 10 / 35 | 4037 |
| 4 | 2 | 61.9 | 71.4 | 5 / 35 | 3845 |
| 5 | 2 | 63.7 | 75.2 | 8 / 35 | 3805 |
| 6 | 2 | 63.8 | 76.5 | 7 / 35 | 3863 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 49 | 27% |
| kc.micro.Figment 1.0 | 25 | 88% |
| mc2.enemy.Original 0.9 | 10 | 30% |
| pedersen.Grishnakh 1.0 | 9 | 44% |
| yagami.Tidus 0.11 | 6 | 83% |
| dft.Calliope 5.6 | 5 | 60% |

Hadur died in 164 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 52 | 32% | 65 |
| kc.micro.Figment 1.0 | 33 | 20% | 56 |
| mc2.enemy.Original 0.9 | 29 | 18% | 32 |
| pedersen.Grishnakh 1.0 | 17 | 10% | 20 |
| yagami.Tidus 0.11 | 16 | 10% | 21 |
| dft.Calliope 5.6 | 9 | 5% | 12 |
| robar.nano.Assertive_Melee 0.2 | 2 | 1% | 2 |
| step.nanoPri 1.0 | 1 | 1% | 1 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 147589 melee ticks, 36048 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 35 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 46869 sent, 42105 reached their opponent, 5835 virtual hits (13.9% of those reached).

## Melee bench: F10

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 471 over 6 battles (78.5 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 93.5 | 159 / 210 | 1.59 | 20.8% | 36469 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 20.8% | 159 |
| DTF.Kludgy 1.2b | 2.0 | 14.3% | 20 |
| ne.Chimera 1.2 | 3.0 | 12.7% | 7 |
| ejb.Polaris 1.0.1 | 4.2 | 12.2% | 14 |
| tvv.micro.Antares 1.1.1 | 5.2 | 10.3% | 7 |
| vStar.RAFzilla 2.15 | 5.7 | 9.9% | 3 |
| kurios.DOSexe .9b | 7.7 | 5.4% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.3% | 0 |
| sam.Samspin 1.0 | 8.2 | 5.1% | 0 |
| donjezza.Muncho 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 92.7 | 27 / 35 | 6342 |
| 2 | 1 | 71.3 | 92.4 | 28 / 35 | 6206 |
| 3 | 1 | 71.5 | 95.6 | 28 / 35 | 5915 |
| 4 | 1 | 71.7 | 94.6 | 26 / 35 | 6361 |
| 5 | 1 | 71.4 | 94.0 | 25 / 35 | 5964 |
| 6 | 1 | 70.3 | 91.7 | 25 / 35 | 5681 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 68 | 82% |
| ejb.Polaris 1.0.1 | 42 | 90% |
| ne.Chimera 1.2 | 38 | 89% |
| vStar.RAFzilla 2.15 | 17 | 94% |
| tvv.micro.Antares 1.1.1 | 14 | 86% |
| kurios.DOSexe .9b | 2 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 20 | 36% | 74 |
| ne.Chimera 1.2 | 16 | 29% | 49 |
| ejb.Polaris 1.0.1 | 9 | 16% | 47 |
| tvv.micro.Antares 1.1.1 | 4 | 7% | 8 |
| vStar.RAFzilla 2.15 | 1 | 2% | 13 |
| sam.Samspin 1.0 | 1 | 2% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 3 |
| kurios.DOSexe .9b | 0 | 0% | 6 |
| donjezza.Muncho 1.0 | 0 | 0% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 141093 melee ticks, 54400 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 56 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 44269 sent, 39517 reached their opponent, 7130 virtual hits (18.0% of those reached).

## Melee bench: F11

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 232 over 6 battles (38.7 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 81.7 | 63 / 210 | 2.65 | 16.6% | 25151 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.5 | 16.6% | 63 |
| rz.Aleph 0.34 | 1.5 | 16.8% | 79 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.0% | 26 |
| djc.DynaBot 0.1.1 | 4.0 | 10.2% | 11 |
| uji.YellohFellah 1.0 | 6.0 | 9.0% | 10 |
| rdt199.Warlord 0.73 | 6.0 | 8.7% | 12 |
| br2.MobyDickBot 1.6 | 6.2 | 8.9% | 9 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.6% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.5% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 85.4 | 13 / 35 | 4129 |
| 2 | 2 | 66.4 | 85.1 | 11 / 35 | 4210 |
| 3 | 2 | 64.1 | 76.5 | 9 / 35 | 4266 |
| 4 | 2 | 64.2 | 78.1 | 10 / 35 | 4218 |
| 5 | 1 | 65.6 | 82.9 | 11 / 35 | 4068 |
| 6 | 1 | 65.0 | 82.2 | 9 / 35 | 4260 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 52 | 37% |
| cx.mini.Nimrod 0.55 | 16 | 69% |
| uji.YellohFellah 1.0 | 11 | 73% |
| djc.DynaBot 0.1.1 | 10 | 90% |
| rdt199.Warlord 0.73 | 10 | 50% |
| br2.MobyDickBot 1.6 | 9 | 78% |
| stelo.MirrorNano 1.3 | 2 | 50% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 919. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 79 | 53% | 104 |
| cx.mini.Nimrod 0.55 | 25 | 17% | 32 |
| rdt199.Warlord 0.73 | 17 | 11% | 23 |
| djc.DynaBot 0.1.1 | 9 | 6% | 16 |
| br2.MobyDickBot 1.6 | 8 | 5% | 16 |
| uji.YellohFellah 1.0 | 7 | 5% | 12 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 3 |
| stelo.MirrorNano 1.3 | 1 | 1% | 2 |
| KiraNL.Chupacabra 0.4 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 162517 melee ticks, 33611 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 619 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 238 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 49919 sent, 44895 reached their opponent, 5850 virtual hits (13.0% of those reached).

## Melee bench: F12

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 672 over 6 battles (112.0 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.1 | 126 / 210 | 2.16 | 18.7% | 26388 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 18.7% | 126 |
| nat.PallasHawk 1.0 | 2.7 | 13.7% | 30 |
| darkcanuck.Leon 1.01 | 3.2 | 12.8% | 18 |
| bts.wiki.RipCurl 0.9b | 3.2 | 12.7% | 24 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.3% | 9 |
| jrm.Test0 1.0 | 6.0 | 8.2% | 1 |
| cs.sheldor.Talon 1.1 | 7.3 | 6.7% | 0 |
| jp.Perpy 16.0 | 8.7 | 6.0% | 1 |
| jaybot.bots.Oddball 4.0 | 8.8 | 5.4% | 1 |
| stuff.Vlad 0.1 | 9.2 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 84.1 | 19 / 35 | 4114 |
| 2 | 1 | 70.2 | 93.7 | 25 / 35 | 4372 |
| 3 | 1 | 68.2 | 86.7 | 19 / 35 | 4532 |
| 4 | 1 | 66.2 | 81.3 | 19 / 35 | 4113 |
| 5 | 1 | 68.7 | 88.3 | 19 / 35 | 4508 |
| 6 | 1 | 69.4 | 88.6 | 25 / 35 | 4749 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 50 | 76% |
| bts.wiki.RipCurl 0.9b | 40 | 73% |
| darkcanuck.Leon 1.01 | 40 | 90% |
| brainfade.melee.Genghis 0.36 | 14 | 71% |
| jaybot.bots.Oddball 4.0 | 5 | 100% |
| jrm.Test0 1.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 22 | 24% | 45 |
| nat.PallasHawk 1.0 | 19 | 21% | 52 |
| darkcanuck.Leon 1.01 | 13 | 14% | 56 |
| brainfade.melee.Genghis 0.36 | 13 | 14% | 25 |
| jrm.Test0 1.0 | 10 | 11% | 12 |
| cs.sheldor.Talon 1.1 | 5 | 6% | 8 |
| stuff.Vlad 0.1 | 3 | 3% | 5 |
| jaybot.bots.Oddball 4.0 | 0 | 0% | 3 |
| jp.Perpy 16.0 | 0 | 0% | 3 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 129713 melee ticks, 37805 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 40 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 43005 sent, 38028 reached their opponent, 5924 virtual hits (15.6% of those reached).

## Melee bench: F13

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 88 over 6 battles (14.7 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 81.5 | 58 / 210 | 2.67 | 16.2% | 26443 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.8 | 16.2% | 58 |
| ags.Glacier 0.2.11 | 2.0 | 16.3% | 42 |
| mn.Combat 3.25.0 | 2.2 | 16.1% | 79 |
| shinh.Entangled 0.3 | 4.3 | 12.2% | 18 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.8% | 14 |
| apc.Colossus2 0.17 | 6.0 | 7.8% | 0 |
| stelo.Wang 1.0 | 7.0 | 7.0% | 0 |
| ayk.WallHugger 1.0 | 8.3 | 5.0% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 80.0 | 8 / 35 | 4179 |
| 2 | 2 | 66.8 | 85.4 | 11 / 35 | 4448 |
| 3 | 2 | 65.4 | 80.0 | 9 / 35 | 4577 |
| 4 | 3 | 63.3 | 73.7 | 5 / 35 | 4230 |
| 5 | 1 | 67.1 | 87.0 | 16 / 35 | 4454 |
| 6 | 1 | 65.6 | 82.9 | 9 / 35 | 4555 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 45 | 60% |
| mn.Combat 3.25.0 | 41 | 24% |
| gh.micro.Gruweltje 0.7 | 17 | 59% |
| shinh.Entangled 0.3 | 13 | 77% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 153 of 210 rounds, at a mean tick of 842. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 53 | 35% | 75 |
| mn.Combat 3.25.0 | 48 | 31% | 65 |
| shinh.Entangled 0.3 | 19 | 12% | 25 |
| gh.micro.Gruweltje 0.7 | 17 | 11% | 27 |
| stelo.Wang 1.0 | 5 | 3% | 7 |
| apc.Colossus2 0.17 | 5 | 3% | 6 |
| maribo.FollowFire 1 | 5 | 3% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 142535 melee ticks, 40436 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 96 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 96 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 40228 sent, 35286 reached their opponent, 5334 virtual hits (15.1% of those reached).

## Melee bench: F14

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 162 over 6 battles (27.0 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 92.8 | 154 / 210 | 1.65 | 21.1% | 37665 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 21.1% | 154 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.0% | 15 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.7% | 27 |
| Lo_Ian.Gandalf_V4 4.0 | 4.7 | 9.7% | 2 |
| sanyi.mikrobi.Roberto 1.0 | 5.0 | 9.5% | 4 |
| co.edu.usb.rc.LidisTron 1.0 | 5.3 | 9.0% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.5% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.7 | 7.6% | 1 |
| pa.Improved 1.0 | 9.0 | 6.0% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 95.6 | 30 / 35 | 6768 |
| 2 | 1 | 71.9 | 92.7 | 26 / 35 | 6360 |
| 3 | 1 | 72.1 | 92.4 | 26 / 35 | 6446 |
| 4 | 1 | 71.7 | 93.7 | 28 / 35 | 6121 |
| 5 | 1 | 71.3 | 93.0 | 22 / 35 | 6077 |
| 6 | 1 | 70.3 | 89.2 | 22 / 35 | 5893 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 80 | 93% |
| catcat20.shape.Theta 0.018 | 62 | 73% |
| sanyi.mikrobi.Roberto 1.0 | 16 | 94% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 71% |
| co.edu.usb.rc.LidisTron 1.0 | 6 | 83% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 100% |
| pa.Improved 1.0 | 2 | 50% |

Hadur died in 56 of 210 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 20 | 36% | 57 |
| simonton.micro.Sprout 1.1.3 | 19 | 34% | 87 |
| sanyi.mikrobi.Roberto 1.0 | 7 | 13% | 25 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 9% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 7 |
| pa.Improved 1.0 | 2 | 4% | 6 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 2% | 5 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 4 |
| sample.TrackFire 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 202 rounds): 136998 melee ticks, 50601 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 42 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 2.

Targeting waves (202 rounds): 41176 sent, 36460 reached their opponent, 8499 virtual hits (23.3% of those reached).

## Melee bench: F15

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 427 over 6 battles (71.2 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 86.0 | 104 / 210 | 2.26 | 18.9% | 32300 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 18.9% | 104 |
| emp.Yngwie 1.11 | 2.5 | 13.5% | 54 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.3% | 18 |
| mld.DustBunny 3.8 | 3.5 | 12.8% | 12 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.3% | 4 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.5% | 16 |
| lambdaxy.TBot 0.1 | 7.5 | 6.4% | 0 |
| Grystrion.TrackerWO 1.0 | 7.7 | 6.2% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.1% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 83.8 | 17 / 35 | 5434 |
| 2 | 1 | 68.7 | 86.7 | 19 / 35 | 5196 |
| 3 | 1 | 68.6 | 83.2 | 16 / 35 | 5690 |
| 4 | 1 | 68.8 | 86.3 | 19 / 35 | 5199 |
| 5 | 1 | 69.3 | 87.9 | 17 / 35 | 5302 |
| 6 | 1 | 69.2 | 87.9 | 16 / 35 | 5479 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 55 | 53% |
| mld.DustBunny 3.8 | 32 | 91% |
| kawigi.micro.Shiz 1.1 | 30 | 93% |
| kawigi.robot.Girl 1.2 | 15 | 67% |
| cb.nano.Insomnia 1.0 | 4 | 75% |
| divineomega.TrialBot 0.003 | 3 | 67% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 928. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 37 | 34% | 80 |
| mld.DustBunny 3.8 | 20 | 18% | 47 |
| cb.nano.Insomnia 1.0 | 17 | 16% | 18 |
| kawigi.robot.Girl 1.2 | 14 | 13% | 19 |
| kawigi.micro.Shiz 1.1 | 13 | 12% | 29 |
| divineomega.TrialBot 0.003 | 3 | 3% | 9 |
| lambdaxy.TBot 0.1 | 1 | 1% | 3 |
| Grystrion.TrackerWO 1.0 | 1 | 1% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 159411 melee ticks, 44242 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 49 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 4.

Targeting waves (202 rounds): 50691 sent, 45891 reached their opponent, 7154 virtual hits (15.6% of those reached).

## Melee bench: F16

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 748 over 6 battles (124.7 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 89.3 | 111 / 210 | 1.97 | 20.3% | 37390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 20.3% | 111 |
| gh.Griezel 0.5.2 | 2.0 | 15.6% | 49 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.0% | 3 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 11.0% | 34 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.6% | 3 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.7% | 4 |
| stelo.IntrinsicVolatility 1.4 | 7.2 | 7.0% | 3 |
| repositorio.NanoStep 1.0 | 8.5 | 5.1% | 0 |
| divineomega.DivineBot 1.9.4.5 | 8.7 | 5.2% | 3 |
| asd.Cthulhu 1.3 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 90.5 | 19 / 35 | 6584 |
| 2 | 1 | 70.1 | 87.0 | 14 / 35 | 6379 |
| 3 | 1 | 71.8 | 92.7 | 25 / 35 | 6398 |
| 4 | 1 | 70.5 | 88.6 | 17 / 35 | 6264 |
| 5 | 1 | 68.7 | 84.4 | 14 / 35 | 5649 |
| 6 | 1 | 71.6 | 92.4 | 22 / 35 | 6116 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 85 | 64% |
| techdude.forest.FlamingForest 1.1 | 34 | 56% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 16 | 94% |
| bvh.fnr.Fenrir 0.36l | 10 | 70% |
| tvv.nano.Polaris 1.2 | 9 | 89% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |
| stelo.IntrinsicVolatility 1.4 | 3 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 1181. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 45 | 42% | 106 |
| techdude.forest.FlamingForest 1.1 | 20 | 19% | 39 |
| bvh.fnr.Fenrir 0.36l | 16 | 15% | 19 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 10 | 9% | 22 |
| tvv.nano.Polaris 1.2 | 4 | 4% | 9 |
| stelo.IntrinsicVolatility 1.4 | 3 | 3% | 5 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 8 |
| repositorio.NanoStep 1.0 | 1 | 1% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 175277 melee ticks, 66544 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 41 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 54897 sent, 50132 reached their opponent, 8186 virtual hits (16.3% of those reached).

## Melee bench: F17

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 738 over 6 battles (123.0 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 86.0 | 108 / 210 | 2.26 | 19.7% | 37384 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 19.7% | 108 |
| et.Predator 1.8 | 2.2 | 13.8% | 24 |
| cx.BlestPain 1.41 | 3.5 | 12.4% | 39 |
| oog.melee.Mercutio 1.0 | 3.5 | 12.8% | 30 |
| ahf.NanoAndrew .4 | 4.8 | 10.1% | 5 |
| maribo.melee.BMV 0.1 | 6.2 | 8.9% | 1 |
| nic.Nicator 2.4 | 6.8 | 8.4% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.2 | 6.2% | 1 |
| tex.Longbot 0.4 | 8.8 | 5.3% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 88.6 | 17 / 35 | 6379 |
| 2 | 1 | 69.7 | 85.1 | 19 / 35 | 5920 |
| 3 | 1 | 69.8 | 85.1 | 16 / 35 | 6474 |
| 4 | 1 | 70.3 | 87.3 | 23 / 35 | 6049 |
| 5 | 1 | 70.2 | 85.4 | 17 / 35 | 6679 |
| 6 | 1 | 69.1 | 84.4 | 16 / 35 | 5883 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 52 | 79% |
| oog.melee.Mercutio 1.0 | 40 | 78% |
| cx.BlestPain 1.41 | 39 | 49% |
| ahf.NanoAndrew .4 | 12 | 83% |
| maribo.melee.BMV 0.1 | 4 | 100% |
| nic.Nicator 2.4 | 2 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 1018. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 34 | 31% | 58 |
| et.Predator 1.8 | 29 | 26% | 67 |
| oog.melee.Mercutio 1.0 | 19 | 17% | 49 |
| ahf.NanoAndrew .4 | 9 | 8% | 16 |
| maribo.melee.BMV 0.1 | 5 | 5% | 8 |
| tex.Longbot 0.4 | 4 | 4% | 4 |
| nic.Nicator 2.4 | 2 | 2% | 5 |
| goblin.Bender 2.4 | 1 | 1% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 159861 melee ticks, 61309 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 57 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 51036 sent, 46164 reached their opponent, 9270 virtual hits (20.1% of those reached).

## Melee bench: F18

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 543 over 6 battles (90.5 per battle, most in one battle 144). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 91.9 | 136 / 210 | 1.73 | 20.4% | 32676 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 20.4% | 136 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.8% | 34 |
| agd.Mooserwirt2 2.7 | 3.3 | 12.2% | 20 |
| uji.DBH 1.1 | 3.7 | 11.1% | 7 |
| spinnercat.Robovirus 2.718 | 5.7 | 8.7% | 4 |
| ratosh.Nobo 0.21 | 6.2 | 7.8% | 2 |
| sigterm.Sigterm 1.0 | 6.3 | 8.1% | 4 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.0% | 2 |
| stelo.WangRobot 1.0 | 9.0 | 5.9% | 1 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 92.7 | 23 / 35 | 5806 |
| 2 | 1 | 69.9 | 92.1 | 20 / 35 | 5008 |
| 3 | 1 | 72.0 | 96.8 | 31 / 35 | 5322 |
| 4 | 1 | 69.5 | 88.6 | 21 / 35 | 5442 |
| 5 | 1 | 68.7 | 87.6 | 15 / 35 | 5253 |
| 6 | 1 | 71.1 | 93.7 | 26 / 35 | 5845 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 69 | 71% |
| agd.Mooserwirt2 2.7 | 33 | 73% |
| uji.DBH 1.1 | 30 | 83% |
| sigterm.Sigterm 1.0 | 17 | 88% |
| ratosh.Nobo 0.21 | 9 | 89% |
| spinnercat.Robovirus 2.718 | 6 | 67% |
| stelo.WangRobot 1.0 | 5 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 67% |

Hadur died in 77 of 210 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 32 | 42% | 78 |
| agd.Mooserwirt2 2.7 | 18 | 23% | 48 |
| uji.DBH 1.1 | 9 | 12% | 32 |
| ratosh.Nobo 0.21 | 5 | 6% | 12 |
| spinnercat.Robovirus 2.718 | 3 | 4% | 11 |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 4% | 9 |
| sigterm.Sigterm 1.0 | 2 | 3% | 9 |
| stelo.WangRobot 1.0 | 1 | 1% | 5 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 1% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 136394 melee ticks, 51331 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 40 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 44250 sent, 39400 reached their opponent, 8223 virtual hits (20.9% of those reached).

## Melee bench: F19

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 107 over 6 battles (17.8 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.4 | 97.6 | 191 / 210 | 1.22 | 22.5% | 38420 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 22.5% | 191 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.5% | 7 |
| mld.Infinity 2.2 | 3.8 | 10.9% | 4 |
| erdnis.Rover 0.3 | 4.0 | 10.8% | 2 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.3% | 3 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.5% | 2 |
| mbh.Mbh 0.1 | 7.5 | 7.3% | 0 |
| pac.ABC 2.1 | 7.7 | 6.7% | 1 |
| pbg.R2D2 1.0 | 8.8 | 6.0% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 96.8 | 31 / 35 | 6354 |
| 2 | 1 | 73.8 | 98.4 | 33 / 35 | 6587 |
| 3 | 1 | 71.9 | 94.3 | 28 / 35 | 5890 |
| 4 | 1 | 74.1 | 98.7 | 33 / 35 | 6929 |
| 5 | 1 | 73.6 | 98.4 | 33 / 35 | 6408 |
| 6 | 1 | 73.6 | 98.7 | 33 / 35 | 6252 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 118 | 98% |
| krillr.mini.JointStrike 2.0.0 | 23 | 91% |
| mld.Infinity 2.2 | 20 | 100% |
| erdnis.Rover 0.3 | 12 | 100% |
| patson.PatsonTestBot 1.0 | 10 | 90% |
| pac.ABC 2.1 | 6 | 100% |
| pbg.R2D2 1.0 | 4 | 100% |
| mbh.Mbh 0.1 | 3 | 100% |

Hadur died in 19 of 210 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| erdnis.Rover 0.3 | 6 | 32% | 35 |
| davidalves.net.DuelistMiniMelee 1.2 | 5 | 26% | 66 |
| krillr.mini.JointStrike 2.0.0 | 5 | 26% | 40 |
| patson.PatsonTestBot 1.0 | 2 | 11% | 20 |
| mbh.Mbh 0.1 | 1 | 5% | 10 |
| mld.Infinity 2.2 | 0 | 0% | 16 |
| pac.ABC 2.1 | 0 | 0% | 9 |
| pbg.R2D2 1.0 | 0 | 0% | 6 |

Posture (Hadur's M records, 199 rounds): 120766 melee ticks, 45164 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 42 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 39763 sent, 35138 reached their opponent, 7535 virtual hits (21.4% of those reached).

## Melee bench: F20

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 408 over 6 battles (68.0 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 91.5 | 135 / 210 | 1.76 | 21.2% | 39248 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 21.2% | 135 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.8% | 45 |
| fwb.Nine 1.0.1 | 3.5 | 11.6% | 14 |
| catcat20.Rabbit 0.001 | 4.3 | 10.1% | 15 |
| nz.jdc.nano.GridFu 1.0 | 4.5 | 10.1% | 0 |
| m3thos.mini.Eva01 0.5.5 | 5.7 | 8.7% | 1 |
| bayen.nut.Squirrel 1.615 | 7.3 | 6.5% | 1 |
| ntc.ControlledChaos 1.1.4 | 8.5 | 5.7% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.5 | 5.8% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 90.5 | 23 / 35 | 6620 |
| 2 | 1 | 71.1 | 91.1 | 21 / 35 | 6180 |
| 3 | 1 | 71.4 | 92.1 | 17 / 35 | 6552 |
| 4 | 1 | 72.2 | 92.7 | 24 / 35 | 6688 |
| 5 | 1 | 70.8 | 89.2 | 24 / 35 | 6056 |
| 6 | 1 | 73.0 | 93.7 | 26 / 35 | 7152 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 79 | 70% |
| fwb.Nine 1.0.1 | 39 | 92% |
| catcat20.Rabbit 0.001 | 28 | 79% |
| m3thos.mini.Eva01 0.5.5 | 9 | 100% |
| nz.jdc.nano.GridFu 1.0 | 8 | 100% |
| bayen.nut.Squirrel 1.615 | 2 | 100% |
| ntc.ControlledChaos 1.1.4 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 965. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 54 | 68% | 103 |
| catcat20.Rabbit 0.001 | 11 | 14% | 40 |
| fwb.Nine 1.0.1 | 8 | 10% | 19 |
| nz.jdc.nano.GridFu 1.0 | 1 | 1% | 14 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 13 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 4 |
| bayen.nut.Squirrel 1.615 | 0 | 0% | 9 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 159324 melee ticks, 51016 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 33 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 48303 sent, 43624 reached their opponent, 9343 virtual hits (21.4% of those reached).

## Melee bench: F21

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 653 over 6 battles (108.8 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 90.6 | 105 / 210 | 1.84 | 20.3% | 36977 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 20.3% | 105 |
| eem.EvBot v4.6.16 | 2.0 | 16.9% | 74 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.3% | 14 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.3% | 8 |
| eld.Hmm 1.0 | 5.0 | 8.5% | 9 |
| oa.weak.BotherBot 0.1 | 6.0 | 7.8% | 0 |
| PSW.Relentless 0.1 | 8.0 | 5.5% | 0 |
| el.JumpShoot 0.2 | 8.3 | 5.6% | 0 |
| fire219.CatBot 1.0 | 8.3 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 9.3 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 91.1 | 15 / 35 | 6058 |
| 2 | 1 | 70.1 | 87.9 | 16 / 35 | 5915 |
| 3 | 1 | 72.8 | 95.6 | 23 / 35 | 6868 |
| 4 | 1 | 70.1 | 87.9 | 14 / 35 | 5976 |
| 5 | 1 | 70.1 | 89.2 | 18 / 35 | 5889 |
| 6 | 1 | 71.5 | 92.1 | 19 / 35 | 6271 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 121 | 57% |
| cf.RiO.RiOx 4.2.1 | 18 | 78% |
| dummy.mini.Scimitar 1.01 | 16 | 75% |
| eld.Hmm 1.0 | 13 | 62% |
| el.JumpShoot 0.2 | 1 | 100% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 1276. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 62 | 55% | 113 |
| dummy.mini.Scimitar 1.01 | 19 | 17% | 42 |
| cf.RiO.RiOx 4.2.1 | 11 | 10% | 23 |
| eld.Hmm 1.0 | 10 | 9% | 24 |
| PSW.Relentless 0.1 | 3 | 3% | 3 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 182980 melee ticks, 82790 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 48 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 51250 sent, 46376 reached their opponent, 7447 virtual hits (16.1% of those reached).

## Melee bench: F22

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 598 over 6 battles (99.7 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 87.4 | 93 / 210 | 2.13 | 18.7% | 31621 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 18.7% | 93 |
| pe.SandboxDT 2.71m | 2.0 | 16.9% | 66 |
| kvk.HebusLeTroll 0.35 | 3.2 | 14.1% | 23 |
| jlm.javaDisturbance 0.59 | 3.8 | 12.9% | 19 |
| bigpete.Stewie 1.0 | 5.0 | 10.5% | 7 |
| yk.JahRoslav 1.1 | 6.7 | 6.9% | 2 |
| gg.Squaraus 0.6 | 7.2 | 6.4% | 0 |
| tad.Dalek98 0.98 | 7.5 | 6.5% | 0 |
| pbg.NinjaX 1.2 | 8.7 | 5.0% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 91.7 | 19 / 35 | 5763 |
| 2 | 1 | 68.0 | 83.8 | 12 / 35 | 5015 |
| 3 | 1 | 69.5 | 87.9 | 16 / 35 | 5359 |
| 4 | 1 | 67.5 | 84.4 | 12 / 35 | 4698 |
| 5 | 1 | 69.8 | 89.8 | 18 / 35 | 5168 |
| 6 | 1 | 69.6 | 86.7 | 16 / 35 | 5618 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 64 | 44% |
| kvk.HebusLeTroll 0.35 | 37 | 73% |
| jlm.javaDisturbance 0.59 | 33 | 82% |
| bigpete.Stewie 1.0 | 7 | 100% |
| yk.JahRoslav 1.1 | 2 | 50% |
| gg.Squaraus 0.6 | 1 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |
| tad.Dalek98 0.98 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 999. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 54 | 44% | 83 |
| kvk.HebusLeTroll 0.35 | 35 | 29% | 57 |
| jlm.javaDisturbance 0.59 | 18 | 15% | 46 |
| tad.Dalek98 0.98 | 4 | 3% | 5 |
| bigpete.Stewie 1.0 | 3 | 2% | 12 |
| yk.JahRoslav 1.1 | 3 | 2% | 5 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 160046 melee ticks, 52505 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 39 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 49529 sent, 44626 reached their opponent, 6608 virtual hits (14.8% of those reached).

## Melee bench: F23

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 634 over 6 battles (105.7 per battle, most in one battle 113). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.0 | 96.3 | 179 / 210 | 1.33 | 22.7% | 40012 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 22.7% | 179 |
| pe.SandboxLump 1.52 | 2.0 | 16.3% | 18 |
| cre.Karolos 0.32 | 3.0 | 13.4% | 8 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 9.5% | 1 |
| stelo.RamTrackSurfer 1.2 | 5.0 | 9.5% | 4 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.7 | 8.9% | 0 |
| cw.megas.Blade 0.8 | 7.0 | 7.9% | 0 |
| sample.Walls 1.0 | 7.8 | 7.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 2.6% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.8 | 95.6 | 31 / 35 | 6647 |
| 2 | 1 | 74.0 | 95.2 | 31 / 35 | 6663 |
| 3 | 1 | 73.5 | 94.3 | 26 / 35 | 6904 |
| 4 | 1 | 74.1 | 99.0 | 32 / 35 | 6384 |
| 5 | 1 | 74.5 | 98.1 | 31 / 35 | 6814 |
| 6 | 1 | 74.0 | 95.9 | 28 / 35 | 6600 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 113 | 90% |
| cre.Karolos 0.32 | 49 | 98% |
| stelo.AreaTargetingBot 1.1 | 11 | 100% |
| stelo.RamTrackSurfer 1.2 | 10 | 90% |
| sample.Walls 1.0 | 5 | 100% |
| rrh.Iwillfindyou 2.0 | 2 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 100% |

Hadur died in 37 of 210 rounds, at a mean tick of 796. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 19 | 51% | 109 |
| cre.Karolos 0.32 | 8 | 22% | 47 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 5% | 8 |
| stelo.RamTrackSurfer 1.2 | 1 | 3% | 19 |
| stelo.AreaTargetingBot 1.1 | 1 | 3% | 9 |
| cw.megas.Blade 0.8 | 0 | 0% | 7 |
| sample.Walls 1.0 | 0 | 0% | 6 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 120970 melee ticks, 51153 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 53 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 53 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 36361 sent, 31709 reached their opponent, 9155 virtual hits (28.9% of those reached).

## Melee bench: F24

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 600 over 6 battles (100.0 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 84.4 | 84 / 210 | 2.40 | 17.5% | 26532 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 17.5% | 84 |
| rz.GlowBlowMelee 1.4 | 2.8 | 13.8% | 36 |
| florent.XSeries.X2 0.12 | 3.2 | 13.1% | 32 |
| davidalves.Phoenix 0.54 | 3.5 | 13.0% | 35 |
| pedersen.Ugluk 1.1.1 | 4.5 | 11.3% | 16 |
| oog.melee.Corsair 1.0 | 6.0 | 9.8% | 7 |
| stelo.SoJNanoMelee 1.1 | 7.5 | 6.2% | 2 |
| lunchie.Lunchbox 0.93 | 7.7 | 5.9% | 0 |
| as.FrankTheTank 1.3 | 8.8 | 5.1% | 0 |
| evd.X1 0.01 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 85.7 | 12 / 35 | 4850 |
| 2 | 1 | 66.8 | 83.8 | 13 / 35 | 4595 |
| 3 | 1 | 66.9 | 83.2 | 15 / 35 | 4547 |
| 4 | 1 | 67.2 | 86.3 | 15 / 35 | 4278 |
| 5 | 1 | 67.3 | 86.3 | 18 / 35 | 4132 |
| 6 | 1 | 65.0 | 81.3 | 11 / 35 | 4130 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 33 | 52% |
| florent.XSeries.X2 0.12 | 30 | 53% |
| davidalves.Phoenix 0.54 | 27 | 63% |
| pedersen.Ugluk 1.1.1 | 25 | 68% |
| oog.melee.Corsair 1.0 | 12 | 67% |
| stelo.SoJNanoMelee 1.1 | 6 | 100% |
| lunchie.Lunchbox 0.93 | 2 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 814. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 36 | 27% | 49 |
| rz.GlowBlowMelee 1.4 | 30 | 23% | 48 |
| davidalves.Phoenix 0.54 | 25 | 19% | 42 |
| pedersen.Ugluk 1.1.1 | 18 | 14% | 34 |
| oog.melee.Corsair 1.0 | 14 | 11% | 27 |
| stelo.SoJNanoMelee 1.1 | 2 | 2% | 2 |
| evd.X1 0.01 | 1 | 1% | 2 |
| lunchie.Lunchbox 0.93 | 0 | 0% | 4 |
| as.FrankTheTank 1.3 | 0 | 0% | 2 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 141016 melee ticks, 37351 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 70 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 45137 sent, 40038 reached their opponent, 6985 virtual hits (17.4% of those reached).

## Melee bench: F25

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 298 over 6 battles (49.7 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 84.6 | 127 / 210 | 2.39 | 18.3% | 25317 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 18.3% | 127 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.8% | 23 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 13.2% | 17 |
| jdw.Hurricane 1.4 | 3.8 | 11.8% | 20 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.4% | 8 |
| ds.Oo 2.2 | 5.7 | 8.7% | 4 |
| awesomeness.Elite 1.0 | 7.3 | 7.3% | 2 |
| adt.Ar2 1.1 | 8.2 | 6.5% | 4 |
| gjr.Cephalosporin 0.1 | 8.7 | 6.1% | 3 |
| amk.ChumbaMini 0.2 | 9.8 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 81.9 | 21 / 35 | 4152 |
| 2 | 1 | 66.9 | 81.9 | 20 / 35 | 4184 |
| 3 | 1 | 69.2 | 89.8 | 24 / 35 | 4231 |
| 4 | 1 | 66.6 | 82.5 | 20 / 35 | 3970 |
| 5 | 1 | 67.3 | 83.2 | 20 / 35 | 4371 |
| 6 | 1 | 68.8 | 88.3 | 22 / 35 | 4409 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 47 | 85% |
| voidious.micro.BlitzBat 1.05 | 36 | 94% |
| jdw.Hurricane 1.4 | 25 | 84% |
| ds.Oo 2.2 | 12 | 83% |
| gre.svman4.Morfeas 1.4.1 | 9 | 78% |
| gjr.Cephalosporin 0.1 | 7 | 71% |
| awesomeness.Elite 1.0 | 6 | 83% |
| amk.ChumbaMini 0.2 | 4 | 75% |
| adt.Ar2 1.1 | 3 | 67% |

Hadur died in 85 of 210 rounds, at a mean tick of 591. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 19 | 22% | 39 |
| voidious.micro.BlitzBat 1.05 | 16 | 19% | 43 |
| voidious.mini.BrokenSword 2.0.3 | 14 | 16% | 44 |
| ds.Oo 2.2 | 8 | 9% | 19 |
| awesomeness.Elite 1.0 | 6 | 7% | 14 |
| adt.Ar2 1.1 | 6 | 7% | 14 |
| gjr.Cephalosporin 0.1 | 5 | 6% | 10 |
| amk.ChumbaMini 0.2 | 5 | 6% | 9 |
| gre.svman4.Morfeas 1.4.1 | 4 | 5% | 18 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 122326 melee ticks, 29519 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 32 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 42389 sent, 37528 reached their opponent, 5826 virtual hits (15.5% of those reached).

## Melee bench: F26

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 505 over 6 battles (84.2 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 92.4 | 143 / 210 | 1.69 | 21.4% | 41583 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 21.4% | 143 |
| ak.Fermat 2.0 | 2.0 | 14.3% | 34 |
| shu.nitro.LENIN .T34 | 3.3 | 12.3% | 15 |
| lrem.Spectre 0.4.4 | 3.8 | 11.5% | 11 |
| js.PinBall 1.6 | 5.2 | 10.5% | 0 |
| jaybot.adv.bots.JayBot 2.0 | 5.7 | 9.6% | 4 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 8.1% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.9% | 3 |
| sample.SpinBot 1.0 | 9.0 | 4.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 90.5 | 22 / 35 | 6935 |
| 2 | 1 | 72.4 | 92.4 | 25 / 35 | 6763 |
| 3 | 1 | 72.9 | 95.6 | 24 / 35 | 7095 |
| 4 | 1 | 73.2 | 94.9 | 25 / 35 | 7280 |
| 5 | 1 | 72.2 | 93.3 | 23 / 35 | 6614 |
| 6 | 1 | 71.7 | 87.6 | 24 / 35 | 6896 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shu.nitro.LENIN .T34 | 57 | 86% |
| ak.Fermat 2.0 | 53 | 72% |
| lrem.Spectre 0.4.4 | 35 | 83% |
| js.PinBall 1.6 | 14 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 9 | 89% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 50% |
| gh.mini.GrubbmOne 1.0 | 2 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 914. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 30 | 42% | 62 |
| shu.nitro.LENIN .T34 | 16 | 23% | 65 |
| lrem.Spectre 0.4.4 | 8 | 11% | 36 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 7% | 12 |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 6% | 7 |
| js.PinBall 1.6 | 2 | 3% | 20 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 5 |
| sample.SpinBot 1.0 | 1 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 151901 melee ticks, 49673 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 30 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 30 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 47697 sent, 42904 reached their opponent, 10073 virtual hits (23.5% of those reached).

## Melee bench: F27

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 352 over 6 battles (58.7 per battle, most in one battle 107). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 81.9 | 145 / 210 | 2.63 | 19.3% | 34955 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.3 | 19.3% | 145 |
| mk.Alpha 0.2.1 | 2.3 | 13.4% | 34 |
| EH.Eagle 1.0.6 | 2.8 | 11.5% | 12 |
| techdude.kombat.FlamingKombat 1.5 | 4.8 | 9.5% | 2 |
| wee.Gem 1.8.4 | 5.7 | 9.4% | 13 |
| sheldor.melee.nano.TestMelee 0.1 | 6.0 | 8.5% | 3 |
| joe.ADinosaur 1.0 | 6.3 | 8.9% | 1 |
| throxbot.ThroxBot 0.1 | 7.3 | 7.5% | 0 |
| caimano.Furia_Ceca 0.22 | 8.5 | 7.2% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 90.8 | 26 / 35 | 5936 |
| 2 | 1 | 72.3 | 95.6 | 30 / 35 | 6414 |
| 3 | 1 | 72.3 | 95.9 | 30 / 35 | 5920 |
| 4 | 2 | 61.6 | 56.8 | 15 / 35 | 5187 |
| 5 | 2 | 61.9 | 57.5 | 15 / 35 | 5381 |
| 6 | 1 | 71.7 | 94.9 | 29 / 35 | 6117 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 75 | 93% |
| EH.Eagle 1.0.6 | 33 | 91% |
| throxbot.ThroxBot 0.1 | 12 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 11 | 100% |
| wee.Gem 1.8.4 | 9 | 78% |
| sheldor.melee.nano.TestMelee 0.1 | 7 | 86% |
| caimano.Furia_Ceca 0.22 | 5 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 520. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cs.Grudge 1.0 | 19 | 28% | 19 |
| mk.Alpha 0.2.1 | 15 | 22% | 72 |
| EH.Eagle 1.0.6 | 9 | 13% | 45 |
| wee.Gem 1.8.4 | 7 | 10% | 16 |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 6% | 13 |
| joe.ADinosaur 1.0 | 4 | 6% | 9 |
| techdude.kombat.FlamingKombat 1.5 | 3 | 4% | 19 |
| caimano.Furia_Ceca 0.22 | 3 | 4% | 6 |
| throxbot.ThroxBot 0.1 | 1 | 1% | 11 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 116791 melee ticks, 35866 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 56 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 37596 sent, 33007 reached their opponent, 7932 virtual hits (24.0% of those reached).

## Melee bench: F28

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 539 over 6 battles (89.8 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 87.3 | 115 / 210 | 2.14 | 18.2% | 25592 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 18.2% | 115 |
| kid.test.NightFox .2 | 2.0 | 14.9% | 33 |
| uji.Antique 1.0 | 3.0 | 12.4% | 31 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 10.8% | 16 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.5% | 8 |
| ahr.ice.Ice 1.0.2 | 6.7 | 8.1% | 4 |
| amk.ChumbaWumba 0.3 | 6.8 | 7.4% | 2 |
| matt.advanced.Katana 1.0 | 7.8 | 6.6% | 1 |
| stelo.PianistNano 1.2 | 8.7 | 5.9% | 0 |
| stelo.Lifestealer 1.0 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 82.2 | 18 / 35 | 3941 |
| 2 | 1 | 67.9 | 87.6 | 19 / 35 | 4175 |
| 3 | 1 | 67.6 | 87.3 | 19 / 35 | 4190 |
| 4 | 1 | 68.8 | 88.9 | 20 / 35 | 4715 |
| 5 | 1 | 68.4 | 90.8 | 23 / 35 | 4248 |
| 6 | 1 | 67.3 | 87.0 | 16 / 35 | 4323 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 68 | 79% |
| uji.Antique 1.0 | 42 | 74% |
| qohnil.blot.BlotBot 3.61 | 13 | 54% |
| ahr.ice.Ice 1.0.2 | 10 | 100% |
| pfvicm.Sobieski 7.2.3b | 7 | 71% |
| amk.ChumbaWumba 0.3 | 6 | 83% |
| stelo.PianistNano 1.2 | 2 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 759. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 31 | 31% | 59 |
| kid.test.NightFox .2 | 24 | 24% | 55 |
| pfvicm.Sobieski 7.2.3b | 16 | 16% | 27 |
| qohnil.blot.BlotBot 3.61 | 9 | 9% | 27 |
| amk.ChumbaWumba 0.3 | 8 | 8% | 20 |
| ahr.ice.Ice 1.0.2 | 4 | 4% | 13 |
| stelo.PianistNano 1.2 | 2 | 2% | 6 |
| matt.advanced.Katana 1.0 | 1 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 131701 melee ticks, 34268 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 40 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 42438 sent, 37497 reached their opponent, 5179 virtual hits (13.8% of those reached).

## Melee bench: F29

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 483 over 6 battles (80.5 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.2 | 105 / 210 | 2.06 | 19.3% | 29933 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 19.3% | 105 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 15.1% | 48 |
| deewiant.Anomaly 0.2 | 2.5 | 14.6% | 40 |
| myl.micro.Troodon 1.10 | 4.3 | 11.4% | 6 |
| jok.PheonixM 0.1.2 | 4.7 | 10.3% | 8 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.2% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 7.5 | 5.8% | 0 |
| DBall.Anarchy 0.1 | 7.7 | 5.9% | 1 |
| ap.Frederick 1.1 | 8.8 | 5.1% | 3 |
| jangs.ns51 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 92.7 | 26 / 35 | 5096 |
| 2 | 1 | 69.3 | 85.7 | 16 / 35 | 5336 |
| 3 | 1 | 69.6 | 89.8 | 16 / 35 | 4914 |
| 4 | 1 | 68.6 | 82.9 | 13 / 35 | 5206 |
| 5 | 1 | 69.2 | 88.3 | 18 / 35 | 4560 |
| 6 | 1 | 69.4 | 89.8 | 16 / 35 | 4821 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 53 | 60% |
| zyx.mega.YersiniaPestis 3.1 | 50 | 56% |
| jok.PheonixM 0.1.2 | 23 | 87% |
| myl.micro.Troodon 1.10 | 19 | 84% |
| ap.Frederick 1.1 | 6 | 83% |
| ph.melee.ArcherME 0.3 | 2 | 100% |
| DBall.Anarchy 0.1 | 2 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 977. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 42 | 38% | 77 |
| zyx.mega.YersiniaPestis 3.1 | 37 | 34% | 70 |
| myl.micro.Troodon 1.10 | 14 | 13% | 28 |
| jok.PheonixM 0.1.2 | 9 | 8% | 21 |
| ph.melee.ArcherME 0.3 | 1 | 1% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 2 |
| ap.Frederick 1.1 | 1 | 1% | 0 |
| DBall.Anarchy 0.1 | 0 | 0% | 4 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 163770 melee ticks, 53086 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 33 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 51533 sent, 46628 reached their opponent, 6713 virtual hits (14.4% of those reached).

## Melee bench: F30

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 645 over 6 battles (107.5 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 75.3 | 50 / 210 | 3.22 | 15.4% | 25395 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.2 | 15.4% | 50 |
| catcat20.Matcha 0.006 | 3.2 | 13.2% | 47 |
| oog.melee.Capulet 1.2 | 3.5 | 12.5% | 29 |
| stelo.PastFuture 2.3.2 | 3.5 | 12.8% | 25 |
| darkcanuck.B26354 1.06 | 3.7 | 12.6% | 39 |
| intruder.PrairieWolf 2.61 | 6.2 | 8.8% | 8 |
| fowl3628800.LightningBolt 2.6.0 | 7.7 | 7.5% | 8 |
| tripphippy.Alice 1.1 | 8.0 | 7.3% | 4 |
| ntc.Opposite 1.5 | 8.2 | 7.2% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 74.0 | 8 / 35 | 3988 |
| 2 | 1 | 65.6 | 81.0 | 11 / 35 | 4566 |
| 3 | 1 | 62.4 | 73.3 | 6 / 35 | 4047 |
| 4 | 1 | 64.3 | 77.1 | 13 / 35 | 4185 |
| 5 | 1 | 63.1 | 74.9 | 7 / 35 | 4007 |
| 6 | 2 | 62.8 | 71.4 | 5 / 35 | 4602 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 29 | 41% |
| darkcanuck.B26354 1.06 | 25 | 44% |
| stelo.PastFuture 2.3.2 | 17 | 59% |
| oog.melee.Capulet 1.2 | 14 | 57% |
| intruder.PrairieWolf 2.61 | 5 | 60% |
| fowl3628800.LightningBolt 2.6.0 | 5 | 60% |
| tripphippy.Alice 1.1 | 3 | 67% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 165 of 210 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 36 | 22% | 44 |
| catcat20.Matcha 0.006 | 33 | 20% | 45 |
| stelo.PastFuture 2.3.2 | 33 | 20% | 44 |
| oog.melee.Capulet 1.2 | 25 | 15% | 33 |
| fowl3628800.LightningBolt 2.6.0 | 9 | 5% | 12 |
| intruder.PrairieWolf 2.61 | 8 | 5% | 13 |
| tripphippy.Alice 1.1 | 8 | 5% | 10 |
| ntc.Opposite 1.5 | 6 | 4% | 7 |
| GarmBox.Anger 1.0 | 2 | 1% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 150673 melee ticks, 26175 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 121 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 121 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 2.

Targeting waves (207 rounds): 47769 sent, 42779 reached their opponent, 7097 virtual hits (16.6% of those reached).

## Melee bench: F31

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 482 over 6 battles (80.3 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 81.1 | 57 / 210 | 2.70 | 16.6% | 25442 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.5% | 99 |
| hadur117.Hadur 3.20ec | 2.0 | 16.6% | 57 |
| gh.mini.Griezel 0.2 | 3.5 | 12.8% | 37 |
| d414.nano.Quantum 1.0.0 | 3.7 | 12.1% | 11 |
| spinnercat.micro.Tyger 0.1 | 4.8 | 10.8% | 3 |
| gh.nano.Grofvuil 0.2 | 6.2 | 8.5% | 3 |
| timmit.nano.TimDog 0.33 | 6.8 | 6.6% | 1 |
| fm.mammillarias 1.3 | 8.5 | 5.3% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.0% | 0 |
| tlp.ThreeLeggedPig 1 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.0 | 79.7 | 10 / 35 | 4336 |
| 2 | 2 | 65.7 | 80.3 | 11 / 35 | 4202 |
| 3 | 2 | 65.5 | 81.9 | 8 / 35 | 4033 |
| 4 | 2 | 65.8 | 82.2 | 9 / 35 | 4210 |
| 5 | 2 | 65.3 | 80.0 | 8 / 35 | 4148 |
| 6 | 2 | 66.4 | 82.5 | 11 / 35 | 4513 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 60 | 38% |
| gh.mini.Griezel 0.2 | 25 | 48% |
| d414.nano.Quantum 1.0.0 | 17 | 76% |
| spinnercat.micro.Tyger 0.1 | 4 | 100% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |
| timmit.nano.TimDog 0.33 | 3 | 67% |

Hadur died in 157 of 210 rounds, at a mean tick of 840. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 75 | 48% | 99 |
| gh.mini.Griezel 0.2 | 30 | 19% | 44 |
| d414.nano.Quantum 1.0.0 | 21 | 13% | 27 |
| spinnercat.micro.Tyger 0.1 | 12 | 8% | 20 |
| timmit.nano.TimDog 0.33 | 7 | 4% | 8 |
| gh.nano.Grofvuil 0.2 | 4 | 3% | 7 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |
| fm.mammillarias 1.3 | 2 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 150545 melee ticks, 33256 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 31 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 2.

Targeting waves (205 rounds): 47050 sent, 42098 reached their opponent, 6916 virtual hits (16.4% of those reached).

## Melee bench: F32

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 344 over 6 battles (57.3 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 89.8 | 122 / 210 | 1.91 | 19.1% | 29942 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 19.1% | 122 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.3% | 59 |
| apc.botM 3.0 | 3.5 | 11.2% | 11 |
| lxx.ConceptA 0.8 | 4.0 | 10.2% | 1 |
| vjik.UnViolation 1.1 | 4.5 | 9.8% | 5 |
| bayen.UbaMicro 1.4 | 6.0 | 8.4% | 2 |
| panzer.Panzer 0.2 | 7.5 | 7.2% | 1 |
| yk.JahMicro 1.0 | 8.0 | 6.8% | 4 |
| conscience.Electron 1.3g | 9.2 | 6.1% | 1 |
| donjezza.Jezza 1.0 | 9.3 | 5.9% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 85.7 | 21 / 35 | 4953 |
| 2 | 1 | 67.5 | 86.0 | 16 / 35 | 5086 |
| 3 | 1 | 70.5 | 96.8 | 26 / 35 | 5091 |
| 4 | 1 | 68.0 | 88.3 | 19 / 35 | 4680 |
| 5 | 1 | 69.3 | 91.4 | 18 / 35 | 5117 |
| 6 | 1 | 69.1 | 90.8 | 22 / 35 | 5015 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 87 | 54% |
| apc.botM 3.0 | 30 | 83% |
| donjezza.Jezza 1.0 | 12 | 100% |
| lxx.ConceptA 0.8 | 12 | 92% |
| vjik.UnViolation 1.1 | 11 | 91% |
| yk.JahMicro 1.0 | 10 | 80% |
| bayen.UbaMicro 1.4 | 5 | 80% |
| panzer.Panzer 0.2 | 4 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 793. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 47 | 52% | 83 |
| apc.botM 3.0 | 12 | 13% | 43 |
| lxx.ConceptA 0.8 | 12 | 13% | 24 |
| vjik.UnViolation 1.1 | 4 | 4% | 21 |
| bayen.UbaMicro 1.4 | 4 | 4% | 12 |
| yk.JahMicro 1.0 | 4 | 4% | 6 |
| donjezza.Jezza 1.0 | 2 | 2% | 9 |
| panzer.Panzer 0.2 | 2 | 2% | 7 |
| conscience.Electron 1.3g | 1 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 125403 melee ticks, 52877 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 48 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 41672 sent, 36814 reached their opponent, 6292 virtual hits (17.1% of those reached).

## Melee bench: F33

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 790 over 6 battles (131.7 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 84.9 | 95 / 210 | 2.36 | 18.5% | 29775 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 18.5% | 95 |
| maribo.Quester 0.3 | 2.3 | 14.8% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 13.7% | 29 |
| labg.Cataclysm 2.05 | 4.3 | 11.3% | 21 |
| gre.svman4.Leonidas 1.3.2 | 4.7 | 11.2% | 17 |
| baal.nano.N 1.42 | 6.2 | 9.0% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 8.4% | 8 |
| zyx.micro.Ant 1.1 | 8.2 | 5.4% | 0 |
| sanja.First 0.1 | 8.8 | 4.6% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 89.5 | 19 / 35 | 5052 |
| 2 | 1 | 66.7 | 81.0 | 11 / 35 | 4553 |
| 3 | 1 | 68.9 | 86.0 | 19 / 35 | 4873 |
| 4 | 1 | 70.0 | 87.9 | 17 / 35 | 5371 |
| 5 | 1 | 68.6 | 82.9 | 17 / 35 | 5135 |
| 6 | 1 | 67.3 | 82.2 | 12 / 35 | 4791 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 44 | 75% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 73% |
| gre.svman4.Leonidas 1.3.2 | 25 | 72% |
| labg.Cataclysm 2.05 | 17 | 53% |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 33% |
| baal.nano.N 1.42 | 5 | 80% |
| sanja.First 0.1 | 1 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 977. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 35 | 29% | 65 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 17% | 50 |
| gre.svman4.Leonidas 1.3.2 | 19 | 16% | 38 |
| labg.Cataclysm 2.05 | 17 | 14% | 23 |
| kinsen.melee.Angsaichmophobia 1.8c | 17 | 14% | 18 |
| baal.nano.N 1.42 | 4 | 3% | 11 |
| zyx.micro.Ant 1.1 | 2 | 2% | 3 |
| sanja.First 0.1 | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 171767 melee ticks, 44640 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 49 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 53383 sent, 48478 reached their opponent, 6811 virtual hits (14.0% of those reached).

## Melee bench: F34

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 544 over 6 battles (90.7 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 85.7 | 88 / 210 | 2.29 | 18.5% | 33007 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.2 | 18.5% | 88 |
| kid.Gladiator .7.2 | 2.2 | 16.3% | 49 |
| stelo.Spread 0.9 | 2.7 | 15.5% | 53 |
| jcs.Seth 1.8 | 4.3 | 11.0% | 14 |
| tcf.Reach 3 | 5.2 | 10.2% | 4 |
| cli.Dancer 1.1 | 5.5 | 9.3% | 1 |
| ratosh.Wesco 1.4 | 7.2 | 7.8% | 1 |
| amk.Punbot.Punbot 0.01 | 7.8 | 5.1% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.5% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 82.2 | 15 / 35 | 5440 |
| 2 | 1 | 68.6 | 85.7 | 12 / 35 | 5322 |
| 3 | 1 | 70.3 | 88.6 | 19 / 35 | 5689 |
| 4 | 1 | 68.8 | 85.7 | 12 / 35 | 5491 |
| 5 | 1 | 70.6 | 90.5 | 19 / 35 | 5718 |
| 6 | 2 | 67.6 | 81.3 | 11 / 35 | 5347 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 55 | 53% |
| stelo.Spread 0.9 | 51 | 69% |
| jcs.Seth 1.8 | 21 | 67% |
| tcf.Reach 3 | 9 | 67% |
| cli.Dancer 1.1 | 3 | 67% |
| ratosh.Wesco 1.4 | 1 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 965. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 54 | 43% | 76 |
| stelo.Spread 0.9 | 39 | 31% | 75 |
| jcs.Seth 1.8 | 15 | 12% | 29 |
| tcf.Reach 3 | 6 | 5% | 18 |
| ratosh.Wesco 1.4 | 5 | 4% | 5 |
| cli.Dancer 1.1 | 3 | 2% | 6 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 161179 melee ticks, 56608 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 41 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 48870 sent, 43912 reached their opponent, 7141 virtual hits (16.3% of those reached).

## Melee bench: F35

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 671 over 6 battles (111.8 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 81.8 | 42 / 210 | 2.64 | 16.2% | 24417 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.0% | 131 |
| hadur117.Hadur 3.20ec | 2.0 | 16.2% | 42 |
| gh.mini.Gruwel 0.9 | 3.5 | 13.0% | 22 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.0 | 11.7% | 9 |
| rz.HawkOnFire 0.1 | 4.5 | 11.4% | 5 |
| wit.Chuliath 1.0 | 6.3 | 7.0% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.0 | 6.4% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.0 | 5.6% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.0% | 1 |
| dans.Cinnamon 1.2 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 77.5 | 6 / 35 | 3781 |
| 2 | 2 | 63.6 | 78.7 | 5 / 35 | 3749 |
| 3 | 2 | 65.7 | 82.9 | 6 / 35 | 4187 |
| 4 | 2 | 65.5 | 80.3 | 7 / 35 | 4336 |
| 5 | 2 | 67.2 | 85.7 | 13 / 35 | 4399 |
| 6 | 2 | 65.9 | 85.7 | 5 / 35 | 3965 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 94 | 17% |
| gh.mini.Gruwel 0.9 | 23 | 43% |
| dmh.robocode.robot.BlackDeath 9.2 | 11 | 64% |
| rz.HawkOnFire 0.1 | 11 | 73% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 959. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 98 | 56% | 116 |
| gh.mini.Gruwel 0.9 | 34 | 19% | 44 |
| dmh.robocode.robot.BlackDeath 9.2 | 16 | 9% | 22 |
| rz.HawkOnFire 0.1 | 11 | 6% | 18 |
| wit.Chuliath 1.0 | 3 | 2% | 3 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 3 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 2 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 141014 melee ticks, 55360 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 34 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 42447 sent, 37402 reached their opponent, 5489 virtual hits (14.7% of those reached).

## Melee bench: F36

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 229 over 6 battles (38.2 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 94.4 | 158 / 210 | 1.50 | 21.7% | 36103 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 21.7% | 158 |
| alpha.RainingFire 1.0 | 2.5 | 12.5% | 20 |
| bzdp.Pansy 2.1 | 3.5 | 11.5% | 5 |
| mz.Cork 0.1 | 3.8 | 11.2% | 16 |
| bvh.micro.Freya 0.3 | 4.8 | 10.1% | 5 |
| m3thos.Eva02 0.7.1 | 5.7 | 10.0% | 4 |
| bvh.mini.Fenrir 0.39 | 6.7 | 9.1% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 5.2% | 0 |
| dl.BetterWalls 1.0 | 8.8 | 4.8% | 0 |
| sample.MyFirstRobot 1.0 | 9.8 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.7 | 98.4 | 31 / 35 | 6534 |
| 2 | 1 | 71.9 | 94.6 | 25 / 35 | 5799 |
| 3 | 1 | 73.3 | 97.8 | 30 / 35 | 6109 |
| 4 | 1 | 71.0 | 89.8 | 24 / 35 | 5875 |
| 5 | 1 | 71.7 | 94.3 | 25 / 35 | 5843 |
| 6 | 1 | 71.2 | 91.4 | 23 / 35 | 5943 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| alpha.RainingFire 1.0 | 39 | 77% |
| mz.Cork 0.1 | 38 | 74% |
| bzdp.Pansy 2.1 | 37 | 92% |
| bvh.micro.Freya 0.3 | 36 | 89% |
| m3thos.Eva02 0.7.1 | 17 | 100% |
| bvh.mini.Fenrir 0.39 | 14 | 100% |
| sample.MyFirstRobot 1.0 | 2 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 958. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 21 | 40% | 51 |
| mz.Cork 0.1 | 12 | 23% | 35 |
| bvh.micro.Freya 0.3 | 6 | 11% | 27 |
| bzdp.Pansy 2.1 | 5 | 9% | 43 |
| bvh.mini.Fenrir 0.39 | 5 | 9% | 15 |
| m3thos.Eva02 0.7.1 | 2 | 4% | 27 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 4 |
| dl.BetterWalls 1.0 | 0 | 0% | 7 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 143026 melee ticks, 47391 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 53 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 53 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 46468 sent, 41875 reached their opponent, 8230 virtual hits (19.7% of those reached).

## Melee bench: F37

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 226 over 6 battles (37.7 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 89.6 | 159 / 210 | 1.94 | 20.1% | 37224 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 20.1% | 159 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.8 | 10.8% | 10 |
| agrach.Dalek 1.0 | 4.5 | 9.6% | 9 |
| EBBU.Sim2 1.02 | 4.7 | 9.5% | 5 |
| germ.TheMind .2 | 5.0 | 9.3% | 4 |
| stelo.UntouchableNano 1.3 | 6.3 | 8.8% | 8 |
| lmk.ACPFinal 0.1 | 6.8 | 8.5% | 5 |
| mb.Beast 0.1 | 7.0 | 8.4% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 7.3 | 8.2% | 2 |
| skm.Ryubot 1.0 | 9.5 | 7.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 88.3 | 24 / 35 | 6913 |
| 2 | 1 | 68.2 | 86.3 | 25 / 35 | 5746 |
| 3 | 1 | 67.5 | 82.2 | 24 / 35 | 5919 |
| 4 | 1 | 71.4 | 96.2 | 31 / 35 | 6517 |
| 5 | 1 | 71.7 | 98.4 | 31 / 35 | 6485 |
| 6 | 1 | 67.7 | 86.0 | 24 / 35 | 5644 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 33 | 94% |
| agrach.Dalek 1.0 | 26 | 96% |
| stelo.UntouchableNano 1.3 | 26 | 88% |
| mb.Beast 0.1 | 22 | 100% |
| EBBU.Sim2 1.02 | 21 | 100% |
| germ.TheMind .2 | 20 | 95% |
| lmk.ACPFinal 0.1 | 12 | 83% |
| skm.Ryubot 1.0 | 9 | 89% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 0% |

Hadur died in 52 of 210 rounds, at a mean tick of 435. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 11 | 21% | 40 |
| mn.nano.perceptual.Impact 1.3.0 | 10 | 19% | 16 |
| germ.TheMind .2 | 6 | 12% | 23 |
| lmk.ACPFinal 0.1 | 6 | 12% | 14 |
| agrach.Dalek 1.0 | 5 | 10% | 38 |
| EBBU.Sim2 1.02 | 4 | 8% | 31 |
| stelo.UntouchableNano 1.3 | 3 | 6% | 25 |
| mb.Beast 0.1 | 3 | 6% | 14 |
| skm.Ryubot 1.0 | 3 | 6% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 95264 melee ticks, 24479 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 55 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 30993 sent, 26562 reached their opponent, 7176 virtual hits (27.0% of those reached).

## Melee bench: F38

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 441 over 6 battles (73.5 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 85.7 | 106 / 210 | 2.29 | 18.4% | 30215 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 18.4% | 106 |
| justin.Mallais 14.0 | 2.0 | 15.0% | 48 |
| bvh.mini.Freya 0.55 | 3.2 | 12.8% | 12 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.5% | 25 |
| kdf.KoulDestroyer 1.0 | 5.0 | 10.2% | 12 |
| cs.Wren 1.0 | 5.7 | 10.0% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.3 | 7.1% | 2 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.5 | 7.1% | 0 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.3% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 88.9 | 17 / 35 | 5183 |
| 2 | 1 | 70.0 | 89.2 | 22 / 35 | 5547 |
| 3 | 1 | 68.6 | 84.4 | 20 / 35 | 5212 |
| 4 | 1 | 66.9 | 83.2 | 16 / 35 | 4452 |
| 5 | 1 | 66.7 | 82.2 | 13 / 35 | 4732 |
| 6 | 1 | 68.6 | 86.3 | 18 / 35 | 5089 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 54 | 63% |
| bts.mega.Gnarly 1.4 | 27 | 70% |
| bvh.mini.Freya 0.55 | 26 | 81% |
| cs.Wren 1.0 | 16 | 94% |
| kdf.KoulDestroyer 1.0 | 16 | 69% |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 50% |
| matt.UnderDark3 2.4.34 | 2 | 100% |
| davidalves.net.DuelistNanoMelee 1.01 | 2 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 774. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 47 | 44% | 84 |
| bvh.mini.Freya 0.55 | 23 | 21% | 35 |
| bts.mega.Gnarly 1.4 | 15 | 14% | 36 |
| kdf.KoulDestroyer 1.0 | 10 | 9% | 16 |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 4% | 8 |
| cs.Wren 1.0 | 3 | 3% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 1 | 1% | 7 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 134898 melee ticks, 37763 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 42 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 43204 sent, 38238 reached their opponent, 7655 virtual hits (20.0% of those reached).

## Melee bench: F39

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 769 over 6 battles (128.2 per battle, most in one battle 144). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 85.5 | 93 / 210 | 2.30 | 18.4% | 32064 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 18.4% | 93 |
| bvh.fry.Freya 0.82 | 2.0 | 14.9% | 21 |
| az.Ololobot 0.2.4 | 3.0 | 13.6% | 63 |
| catcat20.Lambda 0.024 | 4.0 | 11.1% | 27 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.3% | 1 |
| gimp.GimpBot 0.1 | 5.8 | 7.9% | 2 |
| stelo.SoRobotNanoMelee 1.2 | 7.2 | 7.2% | 2 |
| apollokidd.ApolloKidd 0.9 | 7.2 | 7.4% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 6.0% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 83.5 | 14 / 35 | 5478 |
| 2 | 1 | 68.1 | 87.0 | 14 / 35 | 5332 |
| 3 | 1 | 67.1 | 83.5 | 15 / 35 | 5341 |
| 4 | 1 | 69.3 | 87.6 | 19 / 35 | 5794 |
| 5 | 1 | 67.4 | 86.3 | 13 / 35 | 5034 |
| 6 | 1 | 67.7 | 85.1 | 18 / 35 | 5085 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 51 | 88% |
| az.Ololobot 0.2.4 | 44 | 45% |
| catcat20.Lambda 0.024 | 29 | 55% |
| stelo.SoRobotNanoMelee 1.2 | 5 | 80% |
| apollokidd.ApolloKidd 0.9 | 4 | 75% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| gimp.GimpBot 0.1 | 2 | 50% |

Hadur died in 123 of 210 rounds, at a mean tick of 995. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 36 | 29% | 66 |
| az.Ololobot 0.2.4 | 36 | 29% | 62 |
| catcat20.Lambda 0.024 | 28 | 23% | 45 |
| winamp32.micro.MicroMacro 1.0 | 7 | 6% | 11 |
| stelo.SoRobotNanoMelee 1.2 | 4 | 3% | 10 |
| apollokidd.ApolloKidd 0.9 | 3 | 2% | 8 |
| gimp.GimpBot 0.1 | 2 | 2% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 158709 melee ticks, 47069 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 170 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 170 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 49039 sent, 44138 reached their opponent, 7445 virtual hits (16.9% of those reached).

## Melee bench: F40

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 481 over 6 battles (80.2 per battle, most in one battle 117). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 88.5 | 134 / 210 | 2.03 | 20.1% | 33078 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 20.1% | 134 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.8% | 36 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 13.0% | 22 |
| mz.AntiGrav 1.0 | 4.2 | 11.1% | 4 |
| Polkwane.SmashMelee 1.0 | 4.8 | 10.5% | 4 |
| stelo.Randomness 1.0 | 6.3 | 8.9% | 7 |
| alpha.BlackIce 1.0 | 6.5 | 8.7% | 3 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.2% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 3.8% | 0 |
| sample.Corners 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 83.8 | 21 / 35 | 5199 |
| 2 | 1 | 70.1 | 87.0 | 22 / 35 | 5500 |
| 3 | 1 | 70.7 | 91.1 | 22 / 35 | 5397 |
| 4 | 1 | 70.9 | 89.5 | 23 / 35 | 5528 |
| 5 | 1 | 71.4 | 90.5 | 24 / 35 | 5685 |
| 6 | 1 | 71.2 | 89.2 | 22 / 35 | 5769 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 60 | 77% |
| kano.gamma.KanoGamma 1.8 | 38 | 79% |
| mz.AntiGrav 1.0 | 26 | 100% |
| Polkwane.SmashMelee 1.0 | 18 | 94% |
| stelo.Randomness 1.0 | 10 | 80% |
| alpha.BlackIce 1.0 | 5 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 783. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 31 | 39% | 61 |
| kano.gamma.KanoGamma 1.8 | 20 | 25% | 56 |
| stelo.Randomness 1.0 | 10 | 13% | 23 |
| mz.AntiGrav 1.0 | 8 | 10% | 30 |
| Polkwane.SmashMelee 1.0 | 3 | 4% | 13 |
| alpha.BlackIce 1.0 | 2 | 3% | 13 |
| amk.superstrike.SuperStrike 0.3 | 2 | 3% | 8 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 3 |
| sample.Corners 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 148472 melee ticks, 40320 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 81 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 81 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 46881 sent, 41930 reached their opponent, 8099 virtual hits (19.3% of those reached).

## Melee bench: F41

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 702 over 6 battles (117.0 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 86.1 | 88 / 210 | 2.25 | 18.1% | 28777 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.2 | 18.1% | 88 |
| eem.EvBotNG v12.8 | 1.8 | 16.3% | 83 |
| lessonz.robocode.Oz 0.5.0 | 3.2 | 13.3% | 13 |
| ary.Swarm 1.1 | 3.8 | 12.7% | 15 |
| simonton.nano.MeleeSeed 1.8 | 5.2 | 10.1% | 6 |
| shrub.Silver v048 | 6.2 | 8.5% | 2 |
| zyx.nano.Ant 1.1 | 6.7 | 7.9% | 1 |
| jsal.Jsalbot 1.0 | 8.2 | 5.8% | 2 |
| stelo.Mirror 1.1 | 8.8 | 5.2% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.6 | 14 / 35 | 4896 |
| 2 | 1 | 69.1 | 90.5 | 17 / 35 | 4725 |
| 3 | 1 | 68.5 | 87.6 | 15 / 35 | 4727 |
| 4 | 1 | 69.2 | 87.9 | 18 / 35 | 4942 |
| 5 | 1 | 67.5 | 83.8 | 13 / 35 | 4793 |
| 6 | 2 | 65.7 | 79.4 | 11 / 35 | 4694 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 77 | 42% |
| lessonz.robocode.Oz 0.5.0 | 32 | 88% |
| ary.Swarm 1.1 | 21 | 81% |
| simonton.nano.MeleeSeed 1.8 | 14 | 79% |
| stelo.Mirror 1.1 | 1 | 0% |
| jsal.Jsalbot 1.0 | 1 | 0% |
| zyx.nano.Ant 1.1 | 1 | 0% |

Hadur died in 129 of 210 rounds, at a mean tick of 941. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 64 | 50% | 100 |
| lessonz.robocode.Oz 0.5.0 | 21 | 16% | 37 |
| ary.Swarm 1.1 | 18 | 14% | 32 |
| simonton.nano.MeleeSeed 1.8 | 11 | 9% | 25 |
| shrub.Silver v048 | 5 | 4% | 7 |
| jsal.Jsalbot 1.0 | 1 | 1% | 4 |
| stelo.Mirror 1.1 | 1 | 1% | 2 |
| zyx.nano.Ant 1.1 | 1 | 1% | 1 |
| acogdev.alpha 0.2 | 0 | 0% | 2 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 151835 melee ticks, 48605 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 57 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 48374 sent, 43322 reached their opponent, 6509 virtual hits (15.0% of those reached).

## Melee bench: F42

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 644 over 6 battles (107.3 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 91.4 | 141 / 210 | 1.78 | 20.8% | 38046 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 20.8% | 141 |
| wompi.Wallaby 5.1 | 2.0 | 15.2% | 37 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.3% | 10 |
| ara.Shera 0.88 | 3.7 | 12.5% | 19 |
| amz.NanoClone 1.41 | 5.2 | 8.3% | 0 |
| dsw.StaticD 1.0 | 6.3 | 7.1% | 2 |
| maribo.IotaCT 1.1 | 7.0 | 6.7% | 0 |
| stelo.MirrorMicro 1.0 | 7.7 | 6.2% | 1 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.4% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 90.8 | 22 / 35 | 6480 |
| 2 | 1 | 71.9 | 93.3 | 27 / 35 | 6234 |
| 3 | 1 | 71.9 | 90.5 | 24 / 35 | 6697 |
| 4 | 1 | 71.4 | 91.1 | 26 / 35 | 6172 |
| 5 | 1 | 70.3 | 90.5 | 18 / 35 | 6058 |
| 6 | 1 | 71.2 | 92.1 | 24 / 35 | 6405 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 82 | 83% |
| maribo.mini.MiniQuester 0.1 | 49 | 90% |
| ara.Shera 0.88 | 30 | 63% |
| dsw.StaticD 1.0 | 5 | 100% |
| amz.NanoClone 1.41 | 3 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 944. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 29 | 39% | 51 |
| wompi.Wallaby 5.1 | 27 | 36% | 86 |
| maribo.mini.MiniQuester 0.1 | 8 | 11% | 51 |
| mme.NikeEnhanced 2.0 | 2 | 3% | 5 |
| amz.NanoClone 1.41 | 1 | 1% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 2 |
| maribo.IotaCT 1.1 | 1 | 1% | 2 |
| dsw.StaticD 1.0 | 0 | 0% | 7 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 159317 melee ticks, 53540 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 35 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 48791 sent, 43968 reached their opponent, 8292 virtual hits (18.9% of those reached).

## Melee bench: F43

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 692 over 6 battles (115.3 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 77.2 | 33 / 210 | 3.05 | 15.6% | 25785 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.4% | 142 |
| hadur117.Hadur 3.20ec | 2.0 | 15.6% | 33 |
| brainfade.melee.Dusk 0.44 | 3.5 | 12.3% | 28 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.8% | 4 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 10.8% | 3 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.7% | 2 |
| jab.DiamondStealer 5 | 7.0 | 8.0% | 0 |
| mz.NanoGod 2.02 | 7.8 | 7.2% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.9% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.9 | 74.6 | 7 / 35 | 4197 |
| 2 | 2 | 65.5 | 78.1 | 3 / 35 | 4182 |
| 3 | 2 | 67.3 | 80.6 | 8 / 35 | 4594 |
| 4 | 2 | 64.7 | 74.9 | 6 / 35 | 4144 |
| 5 | 2 | 65.3 | 77.1 | 4 / 35 | 4163 |
| 6 | 2 | 65.9 | 77.8 | 5 / 35 | 4505 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 68 | 21% |
| brainfade.melee.Dusk 0.44 | 15 | 20% |
| dummy.micro.Sparrow 2.5 | 7 | 71% |
| Krabb.akim2.Akim2 1.1b | 7 | 71% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 100% |
| mz.NanoGod 2.02 | 1 | 100% |
| jab.DiamondStealer 5 | 1 | 100% |

Hadur died in 184 of 210 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 101 | 55% | 116 |
| brainfade.melee.Dusk 0.44 | 35 | 19% | 38 |
| dummy.micro.Sparrow 2.5 | 15 | 8% | 19 |
| wcsv.melee.EngineerMelee 0.1 | 13 | 7% | 17 |
| mz.NanoGod 2.02 | 5 | 3% | 6 |
| Krabb.akim2.Akim2 1.1b | 4 | 2% | 9 |
| jab.DiamondStealer 5 | 4 | 2% | 5 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 143557 melee ticks, 37815 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 39 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 45223 sent, 40185 reached their opponent, 6429 virtual hits (16.0% of those reached).

## Melee bench: F44

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 444 over 6 battles (74.0 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 90.6 | 132 / 210 | 1.85 | 20.7% | 36485 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 20.7% | 132 |
| stelo.Liblix 0.3.1 | 2.0 | 16.0% | 53 |
| tzu.TheArtOfWar 1.2 | 3.0 | 13.8% | 16 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.0 | 9.9% | 0 |
| jwirde.Gort 2.0 | 5.2 | 8.9% | 6 |
| stf.PanzerGeneral 0.1 | 6.2 | 7.5% | 0 |
| disan.Chair 2.2.0 | 6.8 | 7.2% | 1 |
| wompi.Quokka 1.6 | 7.8 | 6.8% | 2 |
| sample.Crazy 1.0 | 9.3 | 4.7% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 90.8 | 23 / 35 | 5887 |
| 2 | 1 | 70.3 | 88.9 | 20 / 35 | 5863 |
| 3 | 1 | 71.3 | 90.5 | 23 / 35 | 6021 |
| 4 | 1 | 71.5 | 90.8 | 22 / 35 | 6556 |
| 5 | 1 | 70.8 | 89.5 | 21 / 35 | 5956 |
| 6 | 1 | 72.0 | 93.0 | 23 / 35 | 6202 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 89 | 63% |
| tzu.TheArtOfWar 1.2 | 57 | 95% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 100% |
| sample.Crazy 1.0 | 6 | 100% |
| jwirde.Gort 2.0 | 4 | 50% |
| disan.Chair 2.2.0 | 4 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |
| wompi.Quokka 1.6 | 1 | 0% |

Hadur died in 81 of 210 rounds, at a mean tick of 914. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 43 | 53% | 102 |
| tzu.TheArtOfWar 1.2 | 13 | 16% | 60 |
| jwirde.Gort 2.0 | 10 | 12% | 17 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 6% | 8 |
| wompi.Quokka 1.6 | 4 | 5% | 5 |
| stf.PanzerGeneral 0.1 | 2 | 2% | 7 |
| disan.Chair 2.2.0 | 1 | 1% | 7 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 153720 melee ticks, 47568 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 66 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 50987 sent, 46171 reached their opponent, 9192 virtual hits (19.9% of those reached).

## Melee bench: F45

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 738 over 6 battles (123.0 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 88.4 | 107 / 210 | 2.05 | 20.0% | 33747 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ec | 1.0 | 20.0% | 107 |
| jje.BagPuss 1.2 | 3.3 | 12.0% | 10 |
| eem.IWillFireNoBullet v2.8 | 3.7 | 10.4% | 70 |
| myl.nano.Graviton 1.10 | 3.7 | 10.8% | 5 |
| sul.Lunar 1.1 | 4.3 | 10.9% | 8 |
| pez.mini.ChironexFleckeri 0.5 | 6.2 | 9.0% | 7 |
| fm.claire 1.7 | 6.8 | 8.5% | 0 |
| hvilela.HVilela 0.9 | 7.3 | 8.1% | 0 |
| wit.Deep7 2.0 | 8.8 | 5.9% | 3 |
| abud.ThirdRobo 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 87.6 | 15 / 35 | 5456 |
| 2 | 1 | 68.0 | 83.8 | 11 / 35 | 5691 |
| 3 | 1 | 70.4 | 89.5 | 18 / 35 | 5910 |
| 4 | 1 | 72.4 | 93.3 | 28 / 35 | 4965 |
| 5 | 1 | 68.5 | 82.5 | 14 / 35 | 5764 |
| 6 | 1 | 71.1 | 93.3 | 21 / 35 | 5961 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 72 | 53% |
| myl.nano.Graviton 1.10 | 23 | 96% |
| jje.BagPuss 1.2 | 22 | 73% |
| sul.Lunar 1.1 | 22 | 91% |
| pez.mini.ChironexFleckeri 0.5 | 8 | 50% |
| wit.Deep7 2.0 | 6 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 1304. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 36 | 33% | 0 |
| jje.BagPuss 1.2 | 31 | 28% | 67 |
| sul.Lunar 1.1 | 12 | 11% | 44 |
| myl.nano.Graviton 1.10 | 10 | 9% | 35 |
| pez.mini.ChironexFleckeri 0.5 | 8 | 7% | 26 |
| fm.claire 1.7 | 3 | 3% | 8 |
| hvilela.HVilela 0.9 | 2 | 2% | 9 |
| wit.Deep7 2.0 | 1 | 1% | 13 |
| abud.ThirdRobo 1.0 | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 181172 melee ticks, 81012 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 63 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 55232 sent, 50466 reached their opponent, 7257 virtual hits (14.4% of those reached).

## Melee bench: F46

hadur117.Hadur 3.20ec against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 598 over 6 battles (99.7 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 82.5 | 51 / 210 | 2.57 | 16.4% | 25872 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.7 | 17.2% | 87 |
| kc.mini.Mirage 0.2 | 2.0 | 16.3% | 60 |
| hadur117.Hadur 3.20ec | 2.3 | 16.4% | 51 |
| mz.MicroSheep 1.0 | 4.2 | 10.3% | 1 |
| cx.Princess 1.0 | 5.2 | 9.5% | 9 |
| sadoner.killer 0.2 | 5.8 | 9.0% | 0 |
| arthord.NanoSatanMelee Beta | 6.8 | 7.6% | 2 |
| jeremyreeder.collective.Prophet 5 | 8.2 | 5.6% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.1% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 85.4 | 11 / 35 | 4205 |
| 2 | 1 | 67.9 | 87.0 | 12 / 35 | 4901 |
| 3 | 3 | 65.6 | 82.2 | 6 / 35 | 4261 |
| 4 | 2 | 64.1 | 78.7 | 7 / 35 | 4040 |
| 5 | 3 | 65.8 | 83.2 | 7 / 35 | 4284 |
| 6 | 3 | 64.8 | 78.7 | 8 / 35 | 4181 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 58 | 57% |
| rsalesc.melee.Medina 0.4.5 | 46 | 17% |
| cx.Princess 1.0 | 11 | 73% |
| arthord.NanoSatanMelee Beta | 2 | 50% |
| mz.MicroSheep 1.0 | 1 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 935. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 71 | 43% | 85 |
| kc.mini.Mirage 0.2 | 54 | 33% | 85 |
| cx.Princess 1.0 | 11 | 7% | 10 |
| mz.MicroSheep 1.0 | 8 | 5% | 12 |
| sadoner.killer 0.2 | 8 | 5% | 8 |
| arthord.NanoSatanMelee Beta | 7 | 4% | 8 |
| kurios.DOSexe .9a | 0 | 0% | 1 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 147606 melee ticks, 49032 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 480 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 140 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 43005 sent, 37970 reached their opponent, 5355 virtual hits (14.1% of those reached).

