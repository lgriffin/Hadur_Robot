# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474013. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 171 over 6 battles (28.5 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 87.0 | 50 / 210 | 2.17 | 18.0% | 34001 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.3% | 141 |
| hadur117.Hadur 3.21y5 | 2.0 | 18.0% | 50 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.2 | 11.0% | 3 |
| sgp.JollyNinja 3.53 | 4.3 | 11.0% | 14 |
| lorneswork.Predator 1.0 | 4.8 | 10.3% | 3 |
| mz.MicroGodMelee 1 | 5.2 | 9.7% | 0 |
| adt.Ar2 1.0 | 6.5 | 8.2% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.1% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.5% | 0 |
| mym.EdgeStalker 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.5 | 87.9 | 9 / 35 | 5738 |
| 2 | 2 | 68.4 | 87.9 | 11 / 35 | 5448 |
| 3 | 2 | 68.4 | 87.6 | 4 / 35 | 5969 |
| 4 | 2 | 67.8 | 85.4 | 5 / 35 | 5835 |
| 5 | 2 | 67.1 | 84.8 | 9 / 35 | 5256 |
| 6 | 2 | 68.9 | 88.6 | 12 / 35 | 5755 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 128 | 13% |
| sgp.JollyNinja 3.53 | 13 | 38% |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 91% |
| mz.MicroGodMelee 1 | 11 | 100% |
| lorneswork.Predator 1.0 | 6 | 83% |
| adt.Ar2 1.0 | 2 | 100% |

Hadur died in 161 of 210 rounds, at a mean tick of 1186. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 122 | 76% | 143 |
| sgp.JollyNinja 3.53 | 14 | 9% | 16 |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 6% | 17 |
| lorneswork.Predator 1.0 | 10 | 6% | 17 |
| mz.MicroGodMelee 1 | 2 | 1% | 14 |
| adt.Ar2 1.0 | 2 | 1% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 138572 melee ticks, 94816 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 57 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 43700 sent, 38705 reached their opponent, 7385 virtual hits (19.1% of those reached).

## Melee bench: F02

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1472174. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 201 over 6 battles (33.5 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 86.6 | 106 / 210 | 2.20 | 19.2% | 33088 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 19.2% | 106 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.3 | 14.1% | 25 |
| pulsar.PulsarMax 0.8.9 | 2.8 | 13.9% | 48 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.4% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.5 | 10.3% | 11 |
| fnc.bandit.Bandit 5.2.0 | 6.3 | 8.6% | 1 |
| sch.Simone 0.3d | 7.3 | 7.0% | 6 |
| Noran.BitchingElk 0.054 | 7.5 | 7.2% | 8 |
| stelo.PatternRobot 1.0 | 8.8 | 5.4% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 3.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 81.9 | 17 / 35 | 5335 |
| 2 | 1 | 68.0 | 84.8 | 18 / 35 | 5200 |
| 3 | 1 | 69.1 | 86.3 | 17 / 35 | 5429 |
| 4 | 1 | 69.0 | 87.9 | 15 / 35 | 5259 |
| 5 | 1 | 69.6 | 87.9 | 18 / 35 | 5634 |
| 6 | 1 | 71.1 | 90.8 | 21 / 35 | 6231 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 57 | 46% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 52 | 77% |
| com.cohesiva.robocode.ManOwaR 1.0 | 22 | 82% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 92% |
| Noran.BitchingElk 0.054 | 7 | 43% |
| sch.Simone 0.3d | 5 | 80% |
| stelo.PatternRobot 1.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |
| fnc.bandit.Bandit 5.2.0 | 1 | 0% |

Hadur died in 106 of 210 rounds, at a mean tick of 972. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 49 | 46% | 78 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 22 | 21% | 57 |
| com.cohesiva.robocode.ManOwaR 1.0 | 8 | 8% | 28 |
| fnc.bandit.Bandit 5.2.0 | 7 | 7% | 9 |
| lrem.micro.SpikeSoldier 0.4 | 7 | 7% | 9 |
| stelo.PatternRobot 1.0 | 5 | 5% | 6 |
| Noran.BitchingElk 0.054 | 4 | 4% | 11 |
| sch.Simone 0.3d | 3 | 3% | 8 |
| fullsail.SweetTea 1.1 | 1 | 1% | 4 |

Posture (Hadur's M records, 199 rounds): 159040 melee ticks, 42084 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 54 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 55507 sent, 50785 reached their opponent, 8438 virtual hits (16.6% of those reached).

## Melee bench: F03

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1470111. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 174 over 6 battles (29.0 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 94.8 | 169 / 210 | 1.47 | 21.5% | 40233 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 21.5% | 169 |
| kawigi.nano.Lib 1.0 | 2.7 | 13.1% | 12 |
| radnor.DoctorBob 1.42 | 3.2 | 13.0% | 7 |
| vuen.Cake 2.51 | 3.2 | 12.6% | 18 |
| urdos.URDOS 1.3 | 5.2 | 9.1% | 3 |
| adt.Ar1 2.1 | 6.0 | 7.9% | 0 |
| oa.weak.FlyMk1 0.1 | 7.0 | 7.1% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.8 | 6.0% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.3 | 4.7% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 96.5 | 31 / 35 | 6966 |
| 2 | 1 | 71.2 | 93.3 | 27 / 35 | 6255 |
| 3 | 1 | 71.2 | 93.3 | 26 / 35 | 6482 |
| 4 | 1 | 72.3 | 95.2 | 29 / 35 | 6845 |
| 5 | 1 | 72.1 | 94.9 | 29 / 35 | 6827 |
| 6 | 1 | 72.0 | 95.2 | 27 / 35 | 6858 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 69 | 87% |
| radnor.DoctorBob 1.42 | 59 | 98% |
| kawigi.nano.Lib 1.0 | 47 | 89% |
| oa.weak.FlyMk1 0.1 | 5 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| urdos.URDOS 1.3 | 1 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 42 of 210 rounds, at a mean tick of 814. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 12 | 29% | 63 |
| kawigi.nano.Lib 1.0 | 11 | 26% | 50 |
| vuen.Cake 2.51 | 10 | 24% | 70 |
| urdos.URDOS 1.3 | 5 | 12% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 5% | 2 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 6 |
| adt.Ar1 2.1 | 1 | 2% | 4 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 129195 melee ticks, 43860 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 75 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 75 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 2.

Targeting waves (200 rounds): 38289 sent, 33444 reached their opponent, 8209 virtual hits (24.5% of those reached).

## Melee bench: F04

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1472668. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 123 over 6 battles (20.5 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 87.4 | 31 / 210 | 2.13 | 18.4% | 36830 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.3% | 163 |
| hadur117.Hadur 3.21y5 | 2.0 | 18.4% | 31 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.1% | 11 |
| TNT.TNT 0.99.1 | 4.0 | 10.8% | 6 |
| josago.Jorgito 0.16 | 5.0 | 9.1% | 0 |
| css.Delitioner 0.11 | 6.0 | 7.1% | 0 |
| tj.zombie1n 1.0.1 | 7.3 | 6.2% | 0 |
| rampancy.Durandal 2.1d | 7.7 | 5.8% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.6% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.4 | 86.0 | 6 / 35 | 6593 |
| 2 | 2 | 68.2 | 87.9 | 2 / 35 | 5435 |
| 3 | 2 | 69.3 | 87.9 | 2 / 35 | 6015 |
| 4 | 2 | 70.1 | 88.6 | 6 / 35 | 6458 |
| 5 | 2 | 69.6 | 87.3 | 8 / 35 | 6075 |
| 6 | 2 | 69.3 | 86.7 | 7 / 35 | 6254 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 146 | 11% |
| apc.LeeroyJenkins2 1.0 | 13 | 31% |
| TNT.TNT 0.99.1 | 12 | 58% |
| josago.Jorgito 0.16 | 2 | 100% |
| tj.zombie1n 1.0.1 | 1 | 100% |
| rampancy.Durandal 2.1d | 1 | 100% |

Hadur died in 180 of 210 rounds, at a mean tick of 1357. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 144 | 80% | 160 |
| apc.LeeroyJenkins2 1.0 | 20 | 11% | 22 |
| TNT.TNT 0.99.1 | 8 | 4% | 17 |
| css.Delitioner 0.11 | 5 | 3% | 5 |
| josago.Jorgito 0.16 | 2 | 1% | 5 |
| rampancy.Durandal 2.1d | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 192571 melee ticks, 80451 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 46 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 57097 sent, 52118 reached their opponent, 7310 virtual hits (14.0% of those reached).

## Melee bench: F05

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1492801. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 128 over 6 battles (21.3 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 79.1 | 31 / 210 | 2.88 | 15.7% | 26404 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.5 | 17.8% | 102 |
| justin.DemonicRage 3.4 | 1.7 | 16.9% | 60 |
| hadur117.Hadur 3.21y5 | 2.8 | 15.7% | 31 |
| wompi.Numbat 2.1 | 4.0 | 12.4% | 12 |
| ms.Ares 0.19 | 5.3 | 9.1% | 1 |
| axeBots.HataMoto 3.09 | 5.7 | 8.6% | 4 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.1% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.1% | 0 |
| GarmBox.Oranges 1.0 | 9.3 | 4.2% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.6 | 78.1 | 4 / 35 | 3762 |
| 2 | 3 | 65.3 | 79.0 | 4 / 35 | 4627 |
| 3 | 3 | 65.0 | 78.1 | 6 / 35 | 4244 |
| 4 | 2 | 66.3 | 83.2 | 7 / 35 | 4828 |
| 5 | 3 | 65.2 | 78.1 | 6 / 35 | 4590 |
| 6 | 3 | 64.7 | 78.1 | 4 / 35 | 4353 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 42 | 26% |
| cb.fire.Firestarter 2.0f | 33 | 6% |
| wompi.Numbat 2.1 | 19 | 79% |
| axeBots.HataMoto 3.09 | 3 | 67% |
| ms.Ares 0.19 | 1 | 100% |

Hadur died in 179 of 210 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 75 | 42% | 87 |
| cb.fire.Firestarter 2.0f | 53 | 30% | 57 |
| wompi.Numbat 2.1 | 31 | 17% | 43 |
| ms.Ares 0.19 | 9 | 5% | 11 |
| axeBots.HataMoto 3.09 | 9 | 5% | 10 |
| supersample.SuperBoxBot 1.0 | 1 | 1% | 1 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 201 rounds): 151901 melee ticks, 34867 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 57 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 46048 sent, 40994 reached their opponent, 6619 virtual hits (16.1% of those reached).

## Melee bench: F06

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1496339. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 181 over 6 battles (30.2 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 92.6 | 152 / 210 | 1.67 | 20.8% | 35024 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 20.8% | 152 |
| jekl.StoneGhost 0.7 | 2.3 | 13.9% | 14 |
| origin.SleepSiphon 1.7b | 3.3 | 13.1% | 29 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.3 | 12.7% | 13 |
| mld.Wisdom 1.0 | 5.2 | 10.0% | 1 |
| gg.Wolverine 2.0 | 6.0 | 8.7% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 6.9% | 4 |
| spinnercat.Omen 1.0 | 8.0 | 6.0% | 0 |
| DBall.NUKE 0.1 | 8.5 | 5.6% | 1 |
| sample.Fire 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 89.8 | 23 / 35 | 5397 |
| 2 | 1 | 72.3 | 94.0 | 28 / 35 | 6115 |
| 3 | 1 | 70.7 | 91.7 | 24 / 35 | 5443 |
| 4 | 1 | 71.7 | 93.7 | 29 / 35 | 5917 |
| 5 | 1 | 71.5 | 92.4 | 25 / 35 | 6050 |
| 6 | 1 | 72.0 | 94.0 | 23 / 35 | 6102 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 59 | 81% |
| jekl.StoneGhost 0.7 | 52 | 96% |
| pe.minimelee.SandboxMiniMelee 1.1 | 41 | 88% |
| ers.nano.hawk.HawkLA 3.0m | 8 | 88% |
| gg.Wolverine 2.0 | 6 | 100% |
| mld.Wisdom 1.0 | 4 | 100% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 905. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 18 | 29% | 76 |
| jekl.StoneGhost 0.7 | 16 | 26% | 55 |
| pe.minimelee.SandboxMiniMelee 1.1 | 9 | 15% | 39 |
| mld.Wisdom 1.0 | 7 | 11% | 12 |
| gg.Wolverine 2.0 | 4 | 6% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 3% | 14 |
| DBall.NUKE 0.1 | 2 | 3% | 3 |
| spinnercat.Omen 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 142770 melee ticks, 50594 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 56 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 43899 sent, 39105 reached their opponent, 8187 virtual hits (20.9% of those reached).

## Melee bench: F07

hadur117.Hadur 3.21y5 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1534774. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 118 over 6 battles (19.7 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 75.8 | 96.8 | 170 / 210 | 1.26 | 26.5% | 48089 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 26.5% | 170 |
| rtk.Tachikoma 1.0 | 2.0 | 18.4% | 24 |
| franzor.Lizt 1.3.1 | 3.3 | 12.7% | 11 |
| oog.melee.CapuletDroid 1.1 | 3.7 | 11.9% | 5 |
| lrem.micro.MoggFanatic 0.2 | 5.0 | 10.5% | 0 |
| exauge.GateKeeper 1.1.121g | 6.0 | 9.1% | 0 |
| skm.PateranBotlock2 1.0 | 7.0 | 5.9% | 0 |
| sample.Target 1.0 | 8.2 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 8.8 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 75.8 | 97.1 | 28 / 35 | 8092 |
| 2 | 1 | 75.4 | 97.5 | 29 / 35 | 7852 |
| 3 | 1 | 75.7 | 96.8 | 27 / 35 | 8041 |
| 4 | 1 | 76.0 | 95.7 | 29 / 35 | 8047 |
| 5 | 1 | 76.5 | 97.9 | 30 / 35 | 8215 |
| 6 | 1 | 75.6 | 95.7 | 27 / 35 | 7842 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 108 | 81% |
| franzor.Lizt 1.3.1 | 46 | 85% |
| oog.melee.CapuletDroid 1.1 | 45 | 93% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 1510. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 27 | 68% | 126 |
| franzor.Lizt 1.3.1 | 8 | 20% | 12 |
| oog.melee.CapuletDroid 1.1 | 4 | 10% | 55 |
| drd.Dreadknoght 0.9 | 1 | 3% | 2 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 7 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 3 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 178664 melee ticks, 92353 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 48 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 49593 sent, 45414 reached their opponent, 9179 virtual hits (20.2% of those reached).

## Melee bench: F08

hadur117.Hadur 3.21y5 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1493763. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 299 over 6 battles (49.8 per battle, most in one battle 56). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 92.9 | 152 / 210 | 1.57 | 23.1% | 32767 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 23.1% | 152 |
| tm.Yuugao 1.0 | 2.5 | 14.6% | 21 |
| shrub.Vapour v159 | 2.5 | 14.8% | 25 |
| com.spp.robocode.MostlyHarmless 010 | 4.0 | 11.5% | 7 |
| jwst.DAD.DarkAndDarker 1.1 | 5.5 | 9.3% | 3 |
| m3thos.Eva00 1.1 | 5.7 | 9.3% | 2 |
| qualidafial.MajorDick 1.0.1 | 6.8 | 7.1% | 0 |
| SHAM.WOW 1.4 | 8.2 | 5.4% | 0 |
| zyx.nano.BacillusComma 1.0 | 8.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 93.2 | 25 / 35 | 5470 |
| 2 | 1 | 70.4 | 87.9 | 23 / 35 | 5439 |
| 3 | 1 | 71.6 | 93.2 | 25 / 35 | 5587 |
| 4 | 1 | 72.1 | 94.6 | 27 / 35 | 5450 |
| 5 | 1 | 71.7 | 93.6 | 25 / 35 | 5440 |
| 6 | 1 | 71.7 | 95.0 | 27 / 35 | 5381 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 63 | 83% |
| shrub.Vapour v159 | 59 | 76% |
| com.spp.robocode.MostlyHarmless 010 | 33 | 91% |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 92% |
| m3thos.Eva00 1.1 | 8 | 88% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 919. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 26 | 45% | 58 |
| tm.Yuugao 1.0 | 14 | 24% | 76 |
| com.spp.robocode.MostlyHarmless 010 | 9 | 16% | 33 |
| m3thos.Eva00 1.1 | 4 | 7% | 11 |
| jwst.DAD.DarkAndDarker 1.1 | 3 | 5% | 21 |
| SHAM.WOW 1.4 | 1 | 2% | 6 |
| qualidafial.MajorDick 1.0.1 | 1 | 2% | 5 |

Posture (Hadur's M records, 201 rounds): 150460 melee ticks, 52118 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 40 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 44424 sent, 39907 reached their opponent, 6874 virtual hits (17.2% of those reached).

## Melee bench: F09

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1490530. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 180 over 6 battles (30.0 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 81.1 | 78 / 210 | 2.70 | 16.9% | 24754 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.5 | 16.9% | 78 |
| positive.Portia 1.26e | 1.5 | 16.8% | 86 |
| kc.micro.Figment 1.0 | 3.0 | 14.2% | 24 |
| yagami.Tidus 0.11 | 4.7 | 10.3% | 1 |
| pedersen.Grishnakh 1.0 | 5.2 | 9.9% | 9 |
| mc2.enemy.Original 0.9 | 5.7 | 8.9% | 12 |
| dft.Calliope 5.6 | 6.7 | 7.6% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.0% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 5.1% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 85.7 | 15 / 35 | 4551 |
| 2 | 1 | 66.3 | 81.6 | 14 / 35 | 4088 |
| 3 | 2 | 65.0 | 80.6 | 9 / 35 | 3882 |
| 4 | 2 | 65.8 | 80.0 | 15 / 35 | 3947 |
| 5 | 1 | 68.0 | 84.8 | 15 / 35 | 4608 |
| 6 | 2 | 62.9 | 73.7 | 10 / 35 | 3678 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 56 | 34% |
| kc.micro.Figment 1.0 | 47 | 79% |
| mc2.enemy.Original 0.9 | 13 | 62% |
| pedersen.Grishnakh 1.0 | 7 | 86% |
| yagami.Tidus 0.11 | 3 | 100% |
| dft.Calliope 5.6 | 2 | 100% |
| rdm.Dueler 0.4x | 1 | 100% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 62 | 47% | 88 |
| kc.micro.Figment 1.0 | 19 | 14% | 48 |
| mc2.enemy.Original 0.9 | 16 | 12% | 24 |
| yagami.Tidus 0.11 | 14 | 11% | 19 |
| pedersen.Grishnakh 1.0 | 10 | 8% | 15 |
| step.nanoPri 1.0 | 6 | 5% | 6 |
| dft.Calliope 5.6 | 3 | 2% | 7 |
| robar.nano.Assertive_Melee 0.2 | 2 | 2% | 2 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |

Posture (Hadur's M records, 200 rounds): 149414 melee ticks, 46944 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 73 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 47322 sent, 42624 reached their opponent, 5893 virtual hits (13.8% of those reached).

## Melee bench: F10

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1494878. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 218 over 6 battles (36.3 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 95.6 | 165 / 210 | 1.40 | 21.2% | 36766 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 21.2% | 165 |
| DTF.Kludgy 1.2b | 2.0 | 14.2% | 19 |
| ne.Chimera 1.2 | 3.5 | 12.6% | 4 |
| ejb.Polaris 1.0.1 | 3.5 | 12.0% | 11 |
| vStar.RAFzilla 2.15 | 5.3 | 10.3% | 7 |
| tvv.micro.Antares 1.1.1 | 5.7 | 10.2% | 3 |
| kurios.DOSexe .9b | 7.7 | 5.2% | 0 |
| sam.Samspin 1.0 | 8.2 | 5.2% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 9.0 | 4.7% | 0 |
| donjezza.Muncho 1.0 | 9.2 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 94.3 | 24 / 35 | 5858 |
| 2 | 1 | 71.7 | 96.2 | 27 / 35 | 6002 |
| 3 | 1 | 72.3 | 97.8 | 30 / 35 | 5946 |
| 4 | 1 | 72.2 | 95.6 | 30 / 35 | 6359 |
| 5 | 1 | 72.8 | 96.2 | 30 / 35 | 6418 |
| 6 | 1 | 71.1 | 93.7 | 24 / 35 | 6183 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 73 | 79% |
| ne.Chimera 1.2 | 41 | 93% |
| ejb.Polaris 1.0.1 | 40 | 88% |
| vStar.RAFzilla 2.15 | 19 | 89% |
| tvv.micro.Antares 1.1.1 | 13 | 100% |
| donjezza.Muncho 1.0 | 3 | 67% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 925. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 18 | 40% | 76 |
| ne.Chimera 1.2 | 12 | 27% | 40 |
| ejb.Polaris 1.0.1 | 8 | 18% | 42 |
| vStar.RAFzilla 2.15 | 3 | 7% | 21 |
| tvv.micro.Antares 1.1.1 | 3 | 7% | 18 |
| donjezza.Muncho 1.0 | 1 | 2% | 2 |
| kurios.DOSexe .9b | 0 | 0% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 136540 melee ticks, 60389 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 48 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 43837 sent, 38944 reached their opponent, 6878 virtual hits (17.7% of those reached).

## Melee bench: F11

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1472523. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 202 over 6 battles (33.7 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 84.3 | 73 / 210 | 2.41 | 17.3% | 26409 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.2 | 17.3% | 73 |
| rz.Aleph 0.34 | 1.8 | 16.3% | 72 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.7% | 26 |
| djc.DynaBot 0.1.1 | 4.2 | 10.5% | 12 |
| br2.MobyDickBot 1.6 | 5.3 | 8.9% | 8 |
| rdt199.Warlord 0.73 | 6.0 | 8.8% | 13 |
| uji.YellohFellah 1.0 | 7.2 | 7.8% | 7 |
| KiraNL.Chupacabra 0.4 | 7.3 | 7.8% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 4.8% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 84.1 | 11 / 35 | 4245 |
| 2 | 1 | 65.9 | 83.2 | 15 / 35 | 4104 |
| 3 | 2 | 65.7 | 82.2 | 12 / 35 | 4347 |
| 4 | 1 | 66.6 | 85.1 | 10 / 35 | 4620 |
| 5 | 1 | 67.8 | 87.9 | 14 / 35 | 4616 |
| 6 | 1 | 66.4 | 83.2 | 11 / 35 | 4477 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 58 | 36% |
| cx.mini.Nimrod 0.55 | 22 | 59% |
| rdt199.Warlord 0.73 | 17 | 76% |
| djc.DynaBot 0.1.1 | 14 | 71% |
| uji.YellohFellah 1.0 | 12 | 75% |
| br2.MobyDickBot 1.6 | 11 | 64% |

Hadur died in 137 of 210 rounds, at a mean tick of 947. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 63 | 46% | 90 |
| cx.mini.Nimrod 0.55 | 28 | 20% | 38 |
| rdt199.Warlord 0.73 | 11 | 8% | 24 |
| uji.YellohFellah 1.0 | 10 | 7% | 19 |
| djc.DynaBot 0.1.1 | 10 | 7% | 19 |
| br2.MobyDickBot 1.6 | 8 | 6% | 11 |
| KiraNL.Chupacabra 0.4 | 5 | 4% | 6 |
| stelo.MirrorNano 1.3 | 1 | 1% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 1 |

Posture (Hadur's M records, 201 rounds): 158194 melee ticks, 41436 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 56 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 49588 sent, 44588 reached their opponent, 5768 virtual hits (12.9% of those reached).

## Melee bench: F12

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1490823. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 193 over 6 battles (32.2 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 89.4 | 139 / 210 | 1.96 | 19.1% | 25893 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 19.1% | 139 |
| bts.wiki.RipCurl 0.9b | 2.5 | 13.4% | 24 |
| nat.PallasHawk 1.0 | 2.7 | 13.1% | 26 |
| darkcanuck.Leon 1.01 | 3.8 | 12.2% | 14 |
| brainfade.melee.Genghis 0.36 | 5.0 | 9.8% | 4 |
| jrm.Test0 1.0 | 6.5 | 7.8% | 1 |
| cs.sheldor.Talon 1.1 | 7.0 | 6.8% | 1 |
| stuff.Vlad 0.1 | 8.3 | 6.2% | 1 |
| jp.Perpy 16.0 | 8.5 | 6.2% | 0 |
| jaybot.bots.Oddball 4.0 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 87.6 | 24 / 35 | 4428 |
| 2 | 1 | 69.5 | 90.5 | 23 / 35 | 4457 |
| 3 | 1 | 68.3 | 88.3 | 23 / 35 | 3950 |
| 4 | 1 | 69.0 | 88.3 | 24 / 35 | 4536 |
| 5 | 1 | 69.3 | 92.7 | 22 / 35 | 4422 |
| 6 | 1 | 68.6 | 88.9 | 23 / 35 | 4100 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 52 | 88% |
| darkcanuck.Leon 1.01 | 45 | 87% |
| nat.PallasHawk 1.0 | 41 | 68% |
| brainfade.melee.Genghis 0.36 | 18 | 89% |
| jrm.Test0 1.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| stuff.Vlad 0.1 | 3 | 67% |
| jaybot.bots.Oddball 4.0 | 2 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 723. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 19 | 26% | 50 |
| bts.wiki.RipCurl 0.9b | 18 | 25% | 48 |
| darkcanuck.Leon 1.01 | 11 | 15% | 56 |
| brainfade.melee.Genghis 0.36 | 10 | 14% | 24 |
| jrm.Test0 1.0 | 4 | 5% | 8 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 8 |
| jaybot.bots.Oddball 4.0 | 3 | 4% | 7 |
| stuff.Vlad 0.1 | 2 | 3% | 5 |
| jp.Perpy 16.0 | 2 | 3% | 4 |

Posture (Hadur's M records, 201 rounds): 129802 melee ticks, 38634 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 32 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 43599 sent, 38541 reached their opponent, 6091 virtual hits (15.8% of those reached).

## Melee bench: F13

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1484487. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 189 over 6 battles (31.5 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 80.7 | 58 / 210 | 2.74 | 16.1% | 26891 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.8 | 16.1% | 58 |
| mn.Combat 3.25.0 | 2.0 | 16.2% | 82 |
| ags.Glacier 0.2.11 | 2.2 | 16.1% | 37 |
| shinh.Entangled 0.3 | 4.2 | 11.9% | 22 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.6% | 9 |
| apc.Colossus2 0.17 | 6.2 | 8.2% | 0 |
| stelo.Wang 1.0 | 6.8 | 6.9% | 3 |
| maribo.FollowFire 1 | 8.3 | 4.9% | 0 |
| ayk.WallHugger 1.0 | 8.7 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 81.6 | 11 / 35 | 4608 |
| 2 | 3 | 64.8 | 78.7 | 7 / 35 | 4413 |
| 3 | 2 | 66.7 | 85.4 | 10 / 35 | 4599 |
| 4 | 1 | 65.6 | 78.4 | 12 / 35 | 4649 |
| 5 | 2 | 64.2 | 77.5 | 10 / 35 | 4200 |
| 6 | 2 | 65.5 | 82.5 | 8 / 35 | 4422 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 46 | 70% |
| mn.Combat 3.25.0 | 42 | 17% |
| shinh.Entangled 0.3 | 22 | 50% |
| gh.micro.Gruweltje 0.7 | 7 | 57% |
| stelo.Wang 1.0 | 4 | 50% |
| apc.Colossus2 0.17 | 2 | 100% |

Hadur died in 153 of 210 rounds, at a mean tick of 875. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 51 | 33% | 62 |
| ags.Glacier 0.2.11 | 44 | 29% | 72 |
| shinh.Entangled 0.3 | 29 | 19% | 39 |
| gh.micro.Gruweltje 0.7 | 9 | 6% | 16 |
| stelo.Wang 1.0 | 8 | 5% | 9 |
| maribo.FollowFire 1 | 7 | 5% | 5 |
| apc.Colossus2 0.17 | 3 | 2% | 5 |
| sample.Tracker 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 138898 melee ticks, 46541 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 89 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 89 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 39896 sent, 34792 reached their opponent, 5345 virtual hits (15.4% of those reached).

## Melee bench: F14

hadur117.Hadur 3.21y5 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1480122. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 201 over 6 battles (33.5 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.2 | 97.0 | 184 / 210 | 1.24 | 24.5% | 38294 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 24.5% | 184 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 16.6% | 17 |
| sanyi.mikrobi.Roberto 1.0 | 4.0 | 10.6% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 4.5 | 10.6% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 4.5 | 10.5% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.3% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.2 | 9.1% | 5 |
| pa.Improved 1.0 | 8.0 | 7.1% | 0 |
| sample.TrackFire 1.0 | 9.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 96.4 | 31 / 35 | 6196 |
| 2 | 1 | 73.4 | 95.0 | 30 / 35 | 6752 |
| 3 | 1 | 73.8 | 98.6 | 32 / 35 | 6719 |
| 4 | 1 | 72.6 | 97.9 | 31 / 35 | 5819 |
| 5 | 1 | 73.9 | 97.9 | 31 / 35 | 6779 |
| 6 | 1 | 72.4 | 96.4 | 29 / 35 | 6029 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 120 | 93% |
| sanyi.mikrobi.Roberto 1.0 | 29 | 97% |
| co.edu.usb.rc.LidisTron 1.0 | 19 | 95% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 92% |
| Lo_Ian.Gandalf_V4 4.0 | 7 | 100% |
| pa.Improved 1.0 | 4 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |

Hadur died in 26 of 210 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 16 | 62% | 127 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 15% | 18 |
| sanyi.mikrobi.Roberto 1.0 | 2 | 8% | 34 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 8% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 4% | 6 |
| pa.Improved 1.0 | 1 | 4% | 4 |
| co.edu.usb.rc.LidisTron 1.0 | 0 | 0% | 7 |

Posture (Hadur's M records, 198 rounds): 123256 melee ticks, 49183 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 50 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 36110 sent, 31900 reached their opponent, 7751 virtual hits (24.3% of those reached).

## Melee bench: F15

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488979. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 218 over 6 battles (36.3 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 86.7 | 111 / 210 | 2.20 | 19.2% | 32910 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 19.2% | 111 |
| kawigi.micro.Shiz 1.1 | 2.3 | 14.0% | 18 |
| emp.Yngwie 1.11 | 3.0 | 13.1% | 53 |
| mld.DustBunny 3.8 | 3.7 | 12.2% | 9 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.3% | 8 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.2% | 11 |
| Grystrion.TrackerWO 1.0 | 7.3 | 7.2% | 0 |
| lambdaxy.TBot 0.1 | 7.8 | 6.5% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 4.5% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.5 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 91.4 | 21 / 35 | 5796 |
| 2 | 1 | 70.6 | 89.8 | 22 / 35 | 5770 |
| 3 | 1 | 69.8 | 87.3 | 21 / 35 | 5582 |
| 4 | 1 | 65.9 | 79.7 | 15 / 35 | 4632 |
| 5 | 1 | 69.2 | 85.7 | 15 / 35 | 5762 |
| 6 | 1 | 68.7 | 86.3 | 17 / 35 | 5368 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 52 | 52% |
| kawigi.micro.Shiz 1.1 | 43 | 95% |
| mld.DustBunny 3.8 | 19 | 89% |
| kawigi.robot.Girl 1.2 | 17 | 82% |
| cb.nano.Insomnia 1.0 | 11 | 91% |
| lambdaxy.TBot 0.1 | 2 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 940. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 42 | 42% | 78 |
| kawigi.micro.Shiz 1.1 | 13 | 13% | 37 |
| mld.DustBunny 3.8 | 12 | 12% | 42 |
| cb.nano.Insomnia 1.0 | 11 | 11% | 16 |
| kawigi.robot.Girl 1.2 | 9 | 9% | 15 |
| Grystrion.TrackerWO 1.0 | 5 | 5% | 7 |
| lambdaxy.TBot 0.1 | 4 | 4% | 8 |
| divineomega.TrialBot 0.003 | 3 | 3% | 7 |

Posture (Hadur's M records, 200 rounds): 157926 melee ticks, 44284 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 65 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 51486 sent, 46505 reached their opponent, 7202 virtual hits (15.5% of those reached).

## Melee bench: F16

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1477073. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 186 over 6 battles (31.0 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 91.8 | 124 / 210 | 1.74 | 20.8% | 38112 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 20.8% | 124 |
| gh.Griezel 0.5.2 | 2.0 | 16.4% | 49 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.4% | 5 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.3% | 29 |
| bvh.fnr.Fenrir 0.36l | 5.2 | 9.1% | 0 |
| tvv.nano.Polaris 1.2 | 6.2 | 8.3% | 1 |
| stelo.IntrinsicVolatility 1.4 | 6.5 | 7.1% | 3 |
| repositorio.NanoStep 1.0 | 8.7 | 4.7% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 4.3% | 2 |
| asd.Cthulhu 1.3 | 9.3 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 90.2 | 16 / 35 | 6210 |
| 2 | 1 | 71.7 | 90.8 | 21 / 35 | 6500 |
| 3 | 1 | 72.5 | 93.0 | 21 / 35 | 6891 |
| 4 | 1 | 70.2 | 88.9 | 17 / 35 | 5897 |
| 5 | 1 | 71.6 | 92.1 | 23 / 35 | 6291 |
| 6 | 1 | 72.7 | 95.9 | 26 / 35 | 6323 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 96 | 70% |
| techdude.forest.FlamingForest 1.1 | 36 | 47% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 23 | 96% |
| tvv.nano.Polaris 1.2 | 7 | 100% |
| bvh.fnr.Fenrir 0.36l | 5 | 100% |
| stelo.IntrinsicVolatility 1.4 | 5 | 80% |
| divineomega.DivineBot 1.9.4.5 | 2 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 1303. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 38 | 42% | 103 |
| techdude.forest.FlamingForest 1.1 | 24 | 27% | 44 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 10 | 11% | 26 |
| bvh.fnr.Fenrir 0.36l | 8 | 9% | 14 |
| stelo.IntrinsicVolatility 1.4 | 5 | 6% | 11 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 6 |
| repositorio.NanoStep 1.0 | 1 | 1% | 3 |
| tvv.nano.Polaris 1.2 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 179358 melee ticks, 70116 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 68 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 68 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 55830 sent, 51076 reached their opponent, 8189 virtual hits (16.0% of those reached).

## Melee bench: F17

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478411. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 201 over 6 battles (33.5 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 86.7 | 105 / 210 | 2.20 | 19.5% | 36133 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 19.5% | 105 |
| cx.BlestPain 1.41 | 2.8 | 13.4% | 50 |
| et.Predator 1.8 | 3.0 | 13.5% | 10 |
| oog.melee.Mercutio 1.0 | 3.2 | 13.0% | 35 |
| ahf.NanoAndrew .4 | 5.8 | 9.6% | 3 |
| nic.Nicator 2.4 | 6.0 | 8.9% | 5 |
| maribo.melee.BMV 0.1 | 6.2 | 9.0% | 1 |
| tex.Longbot 0.4 | 8.5 | 5.3% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.5% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 83.8 | 14 / 35 | 5880 |
| 2 | 1 | 69.7 | 87.9 | 17 / 35 | 5912 |
| 3 | 1 | 70.2 | 90.2 | 14 / 35 | 5879 |
| 4 | 1 | 71.2 | 87.6 | 19 / 35 | 6836 |
| 5 | 1 | 69.6 | 85.7 | 21 / 35 | 5663 |
| 6 | 1 | 69.5 | 85.1 | 20 / 35 | 5963 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 52 | 90% |
| oog.melee.Mercutio 1.0 | 47 | 60% |
| cx.BlestPain 1.41 | 35 | 34% |
| ahf.NanoAndrew .4 | 10 | 100% |
| maribo.melee.BMV 0.1 | 6 | 100% |
| nic.Nicator 2.4 | 3 | 67% |

Hadur died in 105 of 210 rounds, at a mean tick of 1094. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 38 | 36% | 52 |
| oog.melee.Mercutio 1.0 | 33 | 31% | 61 |
| et.Predator 1.8 | 17 | 16% | 56 |
| ahf.NanoAndrew .4 | 6 | 6% | 15 |
| nic.Nicator 2.4 | 5 | 5% | 9 |
| maribo.melee.BMV 0.1 | 4 | 4% | 14 |
| tex.Longbot 0.4 | 1 | 1% | 1 |
| goblin.Bender 2.4 | 1 | 1% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 157490 melee ticks, 63956 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 848 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 148 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 51110 sent, 46265 reached their opponent, 9166 virtual hits (19.8% of those reached).

## Melee bench: F18

hadur117.Hadur 3.21y5 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1487453. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 294 over 6 battles (49.0 per battle, most in one battle 57). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 93.0 | 158 / 210 | 1.56 | 22.9% | 31285 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 22.9% | 158 |
| uji.DBH 1.1 | 2.3 | 13.7% | 13 |
| agd.Mooserwirt2 2.7 | 2.7 | 13.2% | 18 |
| sigterm.Sigterm 1.0 | 4.5 | 10.1% | 12 |
| spinnercat.Robovirus 2.718 | 5.7 | 9.7% | 2 |
| ratosh.Nobo 0.21 | 5.7 | 9.3% | 3 |
| kawigi.mini.Fhqwhgads 1.1 | 6.2 | 9.3% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.2 | 6.1% | 0 |
| stelo.WangRobot 1.0 | 8.8 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 88.6 | 25 / 35 | 4982 |
| 2 | 1 | 71.6 | 94.6 | 27 / 35 | 5476 |
| 3 | 1 | 71.3 | 93.6 | 29 / 35 | 5190 |
| 4 | 1 | 71.1 | 94.3 | 25 / 35 | 5171 |
| 5 | 1 | 71.4 | 94.6 | 27 / 35 | 5256 |
| 6 | 1 | 70.7 | 92.5 | 25 / 35 | 5210 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| uji.DBH 1.1 | 64 | 91% |
| agd.Mooserwirt2 2.7 | 45 | 91% |
| sigterm.Sigterm 1.0 | 28 | 79% |
| kawigi.mini.Fhqwhgads 1.1 | 14 | 79% |
| ratosh.Nobo 0.21 | 12 | 83% |
| spinnercat.Robovirus 2.718 | 11 | 100% |
| stelo.WangRobot 1.0 | 3 | 67% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 13 | 24% | 47 |
| uji.DBH 1.1 | 11 | 20% | 46 |
| kawigi.mini.Fhqwhgads 1.1 | 10 | 19% | 27 |
| sigterm.Sigterm 1.0 | 6 | 11% | 30 |
| ratosh.Nobo 0.21 | 6 | 11% | 22 |
| spinnercat.Robovirus 2.718 | 4 | 7% | 18 |
| stelo.WangRobot 1.0 | 2 | 4% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 4% | 8 |

Posture (Hadur's M records, 199 rounds): 126516 melee ticks, 50050 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 63 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 38941 sent, 34668 reached their opponent, 7452 virtual hits (21.5% of those reached).

## Melee bench: F19

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474165. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 182 over 6 battles (30.3 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.0 | 98.3 | 197 / 210 | 1.16 | 22.9% | 39502 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 22.9% | 197 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 15.0% | 8 |
| mld.Infinity 2.2 | 3.7 | 11.5% | 2 |
| krillr.mini.JointStrike 2.0.0 | 3.8 | 11.5% | 2 |
| erdnis.Rover 0.3 | 4.5 | 10.7% | 0 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.1% | 0 |
| mbh.Mbh 0.1 | 7.0 | 7.4% | 0 |
| pac.ABC 2.1 | 7.8 | 6.5% | 2 |
| pbg.R2D2 1.0 | 9.0 | 5.1% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.3 | 99.7 | 34 / 35 | 6562 |
| 2 | 1 | 74.7 | 99.7 | 34 / 35 | 6978 |
| 3 | 1 | 73.8 | 97.8 | 33 / 35 | 6465 |
| 4 | 1 | 74.6 | 98.4 | 33 / 35 | 6796 |
| 5 | 1 | 73.5 | 98.4 | 33 / 35 | 6097 |
| 6 | 1 | 73.3 | 95.6 | 30 / 35 | 6604 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 137 | 98% |
| krillr.mini.JointStrike 2.0.0 | 22 | 100% |
| mld.Infinity 2.2 | 16 | 100% |
| erdnis.Rover 0.3 | 15 | 100% |
| patson.PatsonTestBot 1.0 | 6 | 100% |
| pac.ABC 2.1 | 3 | 67% |
| mbh.Mbh 0.1 | 2 | 100% |

Hadur died in 15 of 210 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| erdnis.Rover 0.3 | 5 | 33% | 27 |
| davidalves.net.DuelistMiniMelee 1.2 | 4 | 27% | 73 |
| krillr.mini.JointStrike 2.0.0 | 3 | 20% | 34 |
| pac.ABC 2.1 | 2 | 13% | 7 |
| mld.Infinity 2.2 | 0 | 0% | 23 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 21 |
| pbg.R2D2 1.0 | 0 | 0% | 11 |
| mbh.Mbh 0.1 | 0 | 0% | 7 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 121587 melee ticks, 43511 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 446 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 372 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 40967 sent, 36221 reached their opponent, 8071 virtual hits (22.3% of those reached).

## Melee bench: F20

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1484672. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 168 over 6 battles (28.0 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 94.3 | 153 / 210 | 1.51 | 22.0% | 39827 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 22.0% | 153 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.5% | 34 |
| fwb.Nine 1.0.1 | 3.5 | 11.3% | 10 |
| catcat20.Rabbit 0.001 | 3.8 | 10.6% | 12 |
| nz.jdc.nano.GridFu 1.0 | 4.7 | 9.8% | 0 |
| m3thos.mini.Eva01 0.5.5 | 6.2 | 8.1% | 1 |
| bayen.nut.Squirrel 1.615 | 7.5 | 6.5% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.0 | 6.5% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.3 | 6.3% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 96.2 | 28 / 35 | 6892 |
| 2 | 1 | 71.8 | 94.0 | 25 / 35 | 6153 |
| 3 | 1 | 73.5 | 95.6 | 27 / 35 | 7049 |
| 4 | 1 | 72.9 | 95.9 | 27 / 35 | 6594 |
| 5 | 1 | 72.8 | 94.0 | 26 / 35 | 6937 |
| 6 | 1 | 71.0 | 90.2 | 20 / 35 | 6202 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 88 | 75% |
| fwb.Nine 1.0.1 | 49 | 98% |
| catcat20.Rabbit 0.001 | 29 | 83% |
| nz.jdc.nano.GridFu 1.0 | 5 | 100% |
| bayen.nut.Squirrel 1.615 | 3 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| m3thos.mini.Eva01 0.5.5 | 2 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 1066. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 38 | 67% | 108 |
| catcat20.Rabbit 0.001 | 8 | 14% | 46 |
| fwb.Nine 1.0.1 | 6 | 11% | 12 |
| m3thos.mini.Eva01 0.5.5 | 3 | 5% | 10 |
| nz.jdc.nano.GridFu 1.0 | 2 | 4% | 16 |
| bayen.nut.Squirrel 1.615 | 0 | 0% | 8 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 4 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 198 rounds): 158436 melee ticks, 60437 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 26 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 48888 sent, 44148 reached their opponent, 9587 virtual hits (21.7% of those reached).

## Melee bench: F21

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1473340. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 120 over 6 battles (20.0 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 94.6 | 141 / 210 | 1.49 | 21.5% | 38293 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 21.5% | 141 |
| eem.EvBot v4.6.16 | 2.0 | 16.4% | 59 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.9% | 4 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 3 |
| eld.Hmm 1.0 | 5.3 | 7.9% | 3 |
| oa.weak.BotherBot 0.1 | 5.8 | 7.4% | 0 |
| el.JumpShoot 0.2 | 7.5 | 5.9% | 1 |
| fire219.CatBot 1.0 | 7.8 | 6.1% | 0 |
| PSW.Relentless 0.1 | 8.7 | 5.3% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 95.2 | 24 / 35 | 6185 |
| 2 | 1 | 70.9 | 92.7 | 20 / 35 | 5798 |
| 3 | 1 | 73.0 | 95.6 | 25 / 35 | 6544 |
| 4 | 1 | 72.2 | 93.0 | 24 / 35 | 6382 |
| 5 | 1 | 73.1 | 95.6 | 23 / 35 | 6714 |
| 6 | 1 | 72.6 | 95.2 | 25 / 35 | 6670 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 140 | 66% |
| dummy.mini.Scimitar 1.01 | 32 | 94% |
| cf.RiO.RiOx 4.2.1 | 15 | 93% |
| eld.Hmm 1.0 | 3 | 67% |
| el.JumpShoot 0.2 | 2 | 100% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 1396. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 51 | 72% | 120 |
| dummy.mini.Scimitar 1.01 | 8 | 11% | 44 |
| cf.RiO.RiOx 4.2.1 | 5 | 7% | 21 |
| eld.Hmm 1.0 | 4 | 6% | 16 |
| PSW.Relentless 0.1 | 2 | 3% | 2 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |
| fire219.CatBot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 165271 melee ticks, 92663 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 90 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 90 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 48004 sent, 43217 reached their opponent, 6969 virtual hits (16.1% of those reached).

## Melee bench: F22

hadur117.Hadur 3.21y5 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1475646. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 175 over 6 battles (29.2 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.9 | 102 / 210 | 1.89 | 20.7% | 28539 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 20.7% | 102 |
| pe.SandboxDT 2.71m | 2.0 | 17.6% | 62 |
| kvk.HebusLeTroll 0.35 | 3.0 | 15.7% | 27 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.5% | 15 |
| bigpete.Stewie 1.0 | 5.0 | 10.3% | 4 |
| yk.JahRoslav 1.1 | 6.5 | 6.5% | 1 |
| tad.Dalek98 0.98 | 7.2 | 5.8% | 0 |
| gg.Squaraus 0.6 | 7.5 | 5.5% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 91.4 | 17 / 35 | 4388 |
| 2 | 1 | 68.6 | 85.7 | 12 / 35 | 4965 |
| 3 | 1 | 70.3 | 91.4 | 20 / 35 | 4844 |
| 4 | 1 | 69.0 | 85.7 | 15 / 35 | 5028 |
| 5 | 1 | 68.7 | 88.9 | 17 / 35 | 4458 |
| 6 | 1 | 70.1 | 90.4 | 21 / 35 | 4856 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 64 | 39% |
| kvk.HebusLeTroll 0.35 | 49 | 71% |
| jlm.javaDisturbance 0.59 | 39 | 74% |
| bigpete.Stewie 1.0 | 13 | 85% |
| pbg.NinjaX 1.2 | 2 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 995. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 58 | 53% | 83 |
| kvk.HebusLeTroll 0.35 | 28 | 26% | 57 |
| jlm.javaDisturbance 0.59 | 18 | 17% | 48 |
| bigpete.Stewie 1.0 | 4 | 4% | 16 |
| tad.Dalek98 0.98 | 1 | 1% | 1 |
| pbg.NinjaX 1.2 | 0 | 0% | 3 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |
| yk.JahRoslav 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 201 rounds): 154757 melee ticks, 50157 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 33 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 44694 sent, 40381 reached their opponent, 5337 virtual hits (13.2% of those reached).

## Melee bench: F23

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1475753. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 155 over 6 battles (25.8 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.6 | 96.7 | 179 / 210 | 1.30 | 22.4% | 39743 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 22.4% | 179 |
| pe.SandboxLump 1.52 | 2.0 | 16.8% | 21 |
| cre.Karolos 0.32 | 3.0 | 13.1% | 4 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 9.7% | 2 |
| stelo.RamTrackSurfer 1.2 | 5.0 | 9.0% | 3 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.3 | 8.4% | 1 |
| cw.megas.Blade 0.8 | 7.2 | 8.2% | 0 |
| sample.Walls 1.0 | 7.3 | 7.3% | 0 |
| rrh.Iwillfindyou 2.0 | 9.2 | 3.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 97.5 | 31 / 35 | 6574 |
| 2 | 1 | 73.7 | 95.6 | 29 / 35 | 6712 |
| 3 | 1 | 73.9 | 96.2 | 31 / 35 | 6671 |
| 4 | 1 | 72.7 | 95.9 | 28 / 35 | 6207 |
| 5 | 1 | 73.2 | 97.5 | 29 / 35 | 6332 |
| 6 | 1 | 74.3 | 97.8 | 31 / 35 | 7247 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 115 | 90% |
| cre.Karolos 0.32 | 48 | 98% |
| stelo.RamTrackSurfer 1.2 | 13 | 85% |
| stelo.AreaTargetingBot 1.1 | 9 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 75% |

Hadur died in 31 of 210 rounds, at a mean tick of 790. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 16 | 52% | 109 |
| cre.Karolos 0.32 | 7 | 23% | 46 |
| stelo.AreaTargetingBot 1.1 | 4 | 13% | 13 |
| stelo.RamTrackSurfer 1.2 | 3 | 10% | 21 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 3% | 10 |
| sample.Walls 1.0 | 0 | 0% | 5 |
| cw.megas.Blade 0.8 | 0 | 0% | 4 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 119604 melee ticks, 49609 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 57 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 36655 sent, 31635 reached their opponent, 8639 virtual hits (27.3% of those reached).

## Melee bench: F24

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1780940. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 221 over 6 battles (36.8 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 82.3 | 93 / 210 | 2.59 | 17.2% | 25570 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 17.2% | 93 |
| rz.GlowBlowMelee 1.4 | 2.2 | 14.8% | 49 |
| davidalves.Phoenix 0.54 | 3.3 | 12.7% | 34 |
| florent.XSeries.X2 0.12 | 3.8 | 12.6% | 15 |
| pedersen.Ugluk 1.1.1 | 4.7 | 11.4% | 17 |
| oog.melee.Corsair 1.0 | 6.0 | 9.8% | 2 |
| stelo.SoJNanoMelee 1.1 | 7.5 | 6.4% | 0 |
| lunchie.Lunchbox 0.93 | 7.7 | 5.8% | 0 |
| as.FrankTheTank 1.3 | 9.2 | 5.0% | 1 |
| evd.X1 0.01 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 85.7 | 19 / 35 | 4404 |
| 2 | 1 | 64.9 | 78.4 | 12 / 35 | 4003 |
| 3 | 1 | 67.3 | 84.4 | 16 / 35 | 4367 |
| 4 | 1 | 64.9 | 76.2 | 14 / 35 | 4410 |
| 5 | 1 | 66.3 | 81.9 | 16 / 35 | 4168 |
| 6 | 1 | 67.7 | 87.3 | 16 / 35 | 4218 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 49 | 59% |
| davidalves.Phoenix 0.54 | 28 | 61% |
| pedersen.Ugluk 1.1.1 | 26 | 77% |
| florent.XSeries.X2 0.12 | 23 | 83% |
| oog.melee.Corsair 1.0 | 5 | 80% |
| stelo.SoJNanoMelee 1.1 | 3 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 748. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 36 | 31% | 61 |
| davidalves.Phoenix 0.54 | 28 | 24% | 44 |
| florent.XSeries.X2 0.12 | 19 | 16% | 43 |
| pedersen.Ugluk 1.1.1 | 18 | 15% | 30 |
| oog.melee.Corsair 1.0 | 9 | 8% | 20 |
| lunchie.Lunchbox 0.93 | 4 | 3% | 6 |
| evd.X1 0.01 | 2 | 2% | 2 |
| stelo.SoJNanoMelee 1.1 | 1 | 1% | 3 |

Posture (Hadur's M records, 200 rounds): 133530 melee ticks, 37447 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 50 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 43633 sent, 38561 reached their opponent, 6650 virtual hits (17.2% of those reached).

## Melee bench: F25

hadur117.Hadur 3.21y5 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1780078. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 204 over 6 battles (34.0 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 88.0 | 141 / 210 | 1.96 | 20.9% | 23795 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 20.9% | 141 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 14.5% | 19 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 14.3% | 17 |
| jdw.Hurricane 1.4 | 3.7 | 13.3% | 20 |
| ds.Oo 2.2 | 5.0 | 9.8% | 6 |
| awesomeness.Elite 1.0 | 6.8 | 7.7% | 3 |
| adt.Ar2 1.1 | 7.0 | 7.6% | 1 |
| gjr.Cephalosporin 0.1 | 7.2 | 7.3% | 2 |
| amk.ChumbaMini 0.2 | 9.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.5 | 23 / 35 | 4008 |
| 2 | 1 | 68.2 | 86.8 | 23 / 35 | 3803 |
| 3 | 1 | 66.9 | 84.3 | 20 / 35 | 3710 |
| 4 | 1 | 70.2 | 90.7 | 25 / 35 | 4468 |
| 5 | 1 | 69.5 | 91.1 | 27 / 35 | 3940 |
| 6 | 1 | 68.7 | 87.9 | 23 / 35 | 3866 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 52 | 83% |
| jdw.Hurricane 1.4 | 41 | 95% |
| voidious.micro.BlitzBat 1.05 | 34 | 91% |
| ds.Oo 2.2 | 15 | 80% |
| awesomeness.Elite 1.0 | 10 | 80% |
| adt.Ar2 1.1 | 6 | 83% |
| gjr.Cephalosporin 0.1 | 2 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 607. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 15 | 22% | 51 |
| voidious.micro.BlitzBat 1.05 | 15 | 22% | 36 |
| ds.Oo 2.2 | 11 | 16% | 30 |
| adt.Ar2 1.1 | 10 | 14% | 17 |
| jdw.Hurricane 1.4 | 9 | 13% | 44 |
| awesomeness.Elite 1.0 | 5 | 7% | 16 |
| amk.ChumbaMini 0.2 | 3 | 4% | 7 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 8 |

Posture (Hadur's M records, 201 rounds): 119487 melee ticks, 28354 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 41 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 38370 sent, 34151 reached their opponent, 5391 virtual hits (15.8% of those reached).

## Melee bench: F26

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1811833. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 258 over 6 battles (43.0 per battle, most in one battle 49). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 94.0 | 155 / 210 | 1.54 | 21.9% | 42365 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 21.9% | 155 |
| ak.Fermat 2.0 | 2.0 | 14.9% | 30 |
| lrem.Spectre 0.4.4 | 3.5 | 12.4% | 8 |
| shu.nitro.LENIN .T34 | 3.5 | 12.2% | 14 |
| js.PinBall 1.6 | 5.0 | 9.9% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.1% | 1 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 7.8% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.4% | 2 |
| sample.SpinBot 1.0 | 9.0 | 4.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 95.6 | 24 / 35 | 6926 |
| 2 | 1 | 73.0 | 93.0 | 26 / 35 | 7072 |
| 3 | 1 | 74.1 | 97.1 | 31 / 35 | 7276 |
| 4 | 1 | 73.5 | 94.3 | 27 / 35 | 7359 |
| 5 | 1 | 72.7 | 91.7 | 25 / 35 | 6979 |
| 6 | 1 | 71.9 | 92.1 | 22 / 35 | 6753 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 67 | 76% |
| lrem.Spectre 0.4.4 | 50 | 92% |
| shu.nitro.LENIN .T34 | 44 | 91% |
| js.PinBall 1.6 | 11 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 50% |
| jaybot.adv.bots.JayBot 2.0 | 4 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 28 | 50% | 73 |
| shu.nitro.LENIN .T34 | 11 | 20% | 56 |
| lrem.Spectre 0.4.4 | 7 | 13% | 45 |
| js.PinBall 1.6 | 3 | 5% | 16 |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 5% | 10 |
| jaybot.adv.bots.JayBot 2.0 | 2 | 4% | 6 |
| gh.mini.GrubbmOne 1.0 | 1 | 2% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 154381 melee ticks, 50392 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 39 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 48503 sent, 43622 reached their opponent, 10145 virtual hits (23.3% of those reached).

## Melee bench: F27

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1829927. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 253 over 6 battles (42.2 per battle, most in one battle 53). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 94.8 | 173 / 210 | 1.47 | 21.3% | 34027 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 21.3% | 173 |
| mk.Alpha 0.2.1 | 2.7 | 13.2% | 25 |
| EH.Eagle 1.0.6 | 3.0 | 11.1% | 2 |
| wee.Gem 1.8.4 | 5.5 | 8.8% | 2 |
| throxbot.ThroxBot 0.1 | 5.8 | 8.7% | 1 |
| sheldor.melee.nano.TestMelee 0.1 | 6.0 | 8.7% | 3 |
| techdude.kombat.FlamingKombat 1.5 | 6.5 | 8.6% | 3 |
| joe.ADinosaur 1.0 | 6.8 | 8.0% | 2 |
| caimano.Furia_Ceca 0.22 | 8.2 | 6.7% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 95.9 | 29 / 35 | 5174 |
| 2 | 1 | 71.6 | 93.7 | 28 / 35 | 5672 |
| 3 | 1 | 71.6 | 94.6 | 29 / 35 | 6055 |
| 4 | 1 | 71.9 | 96.8 | 30 / 35 | 5678 |
| 5 | 1 | 71.9 | 94.6 | 28 / 35 | 5819 |
| 6 | 1 | 70.8 | 93.3 | 29 / 35 | 5629 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 103 | 85% |
| EH.Eagle 1.0.6 | 33 | 97% |
| throxbot.ThroxBot 0.1 | 16 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 100% |
| wee.Gem 1.8.4 | 10 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 6 | 83% |
| joe.ADinosaur 1.0 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 766. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 19 | 50% | 84 |
| joe.ADinosaur 1.0 | 5 | 13% | 11 |
| EH.Eagle 1.0.6 | 4 | 11% | 39 |
| caimano.Furia_Ceca 0.22 | 3 | 8% | 13 |
| throxbot.ThroxBot 0.1 | 2 | 5% | 19 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 5% | 10 |
| sheldor.melee.nano.TestMelee 0.1 | 1 | 3% | 20 |
| wee.Gem 1.8.4 | 1 | 3% | 12 |
| cs.Grudge 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 129879 melee ticks, 42358 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 32 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 41121 sent, 36145 reached their opponent, 8542 virtual hits (23.6% of those reached).

## Melee bench: F28

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1809498. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 225 over 6 battles (37.5 per battle, most in one battle 49). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 90.9 | 137 / 210 | 1.82 | 19.2% | 26097 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 19.2% | 137 |
| kid.test.NightFox .2 | 2.0 | 14.8% | 29 |
| uji.Antique 1.0 | 3.0 | 12.8% | 25 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.3% | 6 |
| qohnil.blot.BlotBot 3.61 | 4.7 | 9.9% | 5 |
| ahr.ice.Ice 1.0.2 | 6.5 | 8.1% | 7 |
| amk.ChumbaWumba 0.3 | 6.5 | 7.8% | 0 |
| matt.advanced.Katana 1.0 | 8.3 | 6.5% | 1 |
| stelo.Lifestealer 1.0 | 8.5 | 5.8% | 0 |
| stelo.PianistNano 1.2 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 84.1 | 18 / 35 | 4081 |
| 2 | 1 | 70.1 | 93.7 | 25 / 35 | 4786 |
| 3 | 1 | 69.3 | 91.7 | 23 / 35 | 4337 |
| 4 | 1 | 69.6 | 92.1 | 25 / 35 | 4323 |
| 5 | 1 | 68.6 | 91.1 | 21 / 35 | 4284 |
| 6 | 1 | 69.3 | 92.7 | 25 / 35 | 4286 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 70 | 76% |
| uji.Antique 1.0 | 60 | 83% |
| ahr.ice.Ice 1.0.2 | 13 | 77% |
| qohnil.blot.BlotBot 3.61 | 7 | 100% |
| pfvicm.Sobieski 7.2.3b | 7 | 86% |
| amk.ChumbaWumba 0.3 | 6 | 100% |
| matt.advanced.Katana 1.0 | 5 | 80% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 791. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 24 | 32% | 47 |
| uji.Antique 1.0 | 22 | 30% | 70 |
| pfvicm.Sobieski 7.2.3b | 12 | 16% | 22 |
| ahr.ice.Ice 1.0.2 | 6 | 8% | 18 |
| qohnil.blot.BlotBot 3.61 | 5 | 7% | 26 |
| amk.ChumbaWumba 0.3 | 2 | 3% | 13 |
| stelo.PianistNano 1.2 | 2 | 3% | 4 |
| matt.advanced.Katana 1.0 | 1 | 1% | 8 |
| stelo.Lifestealer 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 131254 melee ticks, 37148 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 50 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 3.

Targeting waves (199 rounds): 42855 sent, 37917 reached their opponent, 5140 virtual hits (13.6% of those reached).

## Melee bench: F29

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1776872. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 209 over 6 battles (34.8 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 90.3 | 117 / 210 | 1.87 | 20.0% | 30897 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 20.0% | 117 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 15.0% | 42 |
| deewiant.Anomaly 0.2 | 2.7 | 14.7% | 40 |
| myl.micro.Troodon 1.10 | 4.0 | 11.8% | 3 |
| jok.PheonixM 0.1.2 | 4.8 | 10.8% | 5 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.2% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.3 | 6.0% | 0 |
| DBall.Anarchy 0.1 | 8.5 | 4.9% | 3 |
| ap.Frederick 1.1 | 8.7 | 4.6% | 0 |
| jangs.ns51 1.0 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 89.5 | 22 / 35 | 4864 |
| 2 | 1 | 70.5 | 92.1 | 19 / 35 | 4875 |
| 3 | 1 | 72.0 | 94.6 | 22 / 35 | 5466 |
| 4 | 1 | 70.0 | 87.6 | 18 / 35 | 5003 |
| 5 | 1 | 71.2 | 88.9 | 23 / 35 | 5664 |
| 6 | 1 | 69.6 | 89.2 | 13 / 35 | 5025 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 59 | 61% |
| zyx.mega.YersiniaPestis 3.1 | 49 | 67% |
| myl.micro.Troodon 1.10 | 28 | 89% |
| jok.PheonixM 0.1.2 | 19 | 84% |
| ph.melee.ArcherME 0.3 | 3 | 100% |
| DBall.Anarchy 0.1 | 2 | 100% |
| jangs.ns51 1.0 | 1 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 1038. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 38 | 41% | 81 |
| zyx.mega.YersiniaPestis 3.1 | 29 | 31% | 64 |
| myl.micro.Troodon 1.10 | 12 | 13% | 26 |
| jok.PheonixM 0.1.2 | 12 | 13% | 25 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 5 |
| DBall.Anarchy 0.1 | 0 | 0% | 4 |

Posture (Hadur's M records, 200 rounds): 169276 melee ticks, 46642 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 31 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 52798 sent, 47913 reached their opponent, 6810 virtual hits (14.2% of those reached).

## Melee bench: F30

hadur117.Hadur 3.21y5 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1836164. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 204 over 6 battles (34.0 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 85.2 | 88 / 210 | 2.18 | 19.9% | 27915 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 19.9% | 88 |
| darkcanuck.B26354 1.06 | 2.8 | 15.0% | 50 |
| stelo.PastFuture 2.3.2 | 3.0 | 14.7% | 22 |
| oog.melee.Capulet 1.2 | 3.2 | 14.6% | 34 |
| intruder.PrairieWolf 2.61 | 5.5 | 9.5% | 6 |
| tripphippy.Alice 1.1 | 6.3 | 8.8% | 5 |
| ntc.Opposite 1.5 | 7.0 | 7.6% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 7.2 | 7.3% | 4 |
| GarmBox.Anger 1.0 | 9.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 85.7 | 14 / 35 | 4646 |
| 2 | 1 | 67.5 | 86.4 | 11 / 35 | 4642 |
| 3 | 1 | 66.0 | 79.3 | 11 / 35 | 4440 |
| 4 | 1 | 67.9 | 83.9 | 17 / 35 | 4738 |
| 5 | 1 | 69.4 | 88.9 | 18 / 35 | 4903 |
| 6 | 1 | 68.3 | 87.1 | 17 / 35 | 4546 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 52 | 46% |
| oog.melee.Capulet 1.2 | 50 | 54% |
| stelo.PastFuture 2.3.2 | 32 | 66% |
| tripphippy.Alice 1.1 | 7 | 100% |
| intruder.PrairieWolf 2.61 | 7 | 57% |
| fowl3628800.LightningBolt 2.6.0 | 6 | 83% |
| ntc.Opposite 1.5 | 1 | 0% |

Hadur died in 122 of 210 rounds, at a mean tick of 996. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 44 | 36% | 67 |
| oog.melee.Capulet 1.2 | 29 | 24% | 52 |
| stelo.PastFuture 2.3.2 | 22 | 18% | 45 |
| tripphippy.Alice 1.1 | 10 | 8% | 20 |
| intruder.PrairieWolf 2.61 | 10 | 8% | 16 |
| fowl3628800.LightningBolt 2.6.0 | 6 | 5% | 8 |
| ntc.Opposite 1.5 | 1 | 1% | 2 |

Posture (Hadur's M records, 200 rounds): 161221 melee ticks, 47883 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 64 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 46325 sent, 41767 reached their opponent, 6822 virtual hits (16.3% of those reached).

## Melee bench: F31

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1794190. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 203 over 6 battles (33.8 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 82.1 | 69 / 210 | 2.61 | 16.7% | 24061 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.3 | 17.1% | 81 |
| hadur117.Hadur 3.21y5 | 1.7 | 16.7% | 69 |
| gh.mini.Griezel 0.2 | 3.0 | 13.2% | 48 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.1% | 4 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 11.2% | 4 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.6% | 1 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.6% | 2 |
| fm.mammillarias 1.3 | 8.3 | 5.8% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.8 | 5.1% | 1 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.7 | 81.6 | 10 / 35 | 3938 |
| 2 | 2 | 65.1 | 77.8 | 12 / 35 | 4091 |
| 3 | 2 | 66.5 | 83.5 | 12 / 35 | 4036 |
| 4 | 1 | 66.7 | 85.1 | 15 / 35 | 4124 |
| 5 | 2 | 63.4 | 77.8 | 4 / 35 | 3749 |
| 6 | 1 | 67.3 | 86.7 | 16 / 35 | 4123 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 65 | 40% |
| gh.mini.Griezel 0.2 | 35 | 54% |
| d414.nano.Quantum 1.0.0 | 12 | 83% |
| spinnercat.micro.Tyger 0.1 | 9 | 78% |
| gh.nano.Grofvuil 0.2 | 5 | 100% |
| timmit.nano.TimDog 0.33 | 2 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 857. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 62 | 44% | 83 |
| gh.mini.Griezel 0.2 | 35 | 25% | 64 |
| spinnercat.micro.Tyger 0.1 | 16 | 11% | 23 |
| d414.nano.Quantum 1.0.0 | 15 | 11% | 22 |
| gh.nano.Grofvuil 0.2 | 4 | 3% | 7 |
| timmit.nano.TimDog 0.33 | 4 | 3% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 3 | 2% | 3 |
| fm.mammillarias 1.3 | 2 | 1% | 3 |

Posture (Hadur's M records, 200 rounds): 148362 melee ticks, 34410 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 32 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 47408 sent, 42369 reached their opponent, 6594 virtual hits (15.6% of those reached).

## Melee bench: F32

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1834385. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 273 over 6 battles (45.5 per battle, most in one battle 50). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 91.7 | 134 / 210 | 1.75 | 19.5% | 30075 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 19.5% | 134 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.0% | 45 |
| apc.botM 3.0 | 3.0 | 12.0% | 19 |
| lxx.ConceptA 0.8 | 4.5 | 9.7% | 1 |
| vjik.UnViolation 1.1 | 4.8 | 9.4% | 5 |
| bayen.UbaMicro 1.4 | 6.7 | 8.3% | 3 |
| panzer.Panzer 0.2 | 7.0 | 7.4% | 0 |
| conscience.Electron 1.3g | 7.5 | 7.2% | 1 |
| yk.JahMicro 1.0 | 8.8 | 6.4% | 0 |
| donjezza.Jezza 1.0 | 9.7 | 5.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 91.1 | 23 / 35 | 4681 |
| 2 | 1 | 68.7 | 92.1 | 20 / 35 | 4880 |
| 3 | 1 | 67.9 | 87.9 | 20 / 35 | 4774 |
| 4 | 1 | 70.7 | 94.3 | 24 / 35 | 5467 |
| 5 | 1 | 70.7 | 94.9 | 26 / 35 | 5488 |
| 6 | 1 | 68.2 | 89.8 | 21 / 35 | 4785 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 88 | 69% |
| apc.botM 3.0 | 41 | 73% |
| lxx.ConceptA 0.8 | 14 | 93% |
| vjik.UnViolation 1.1 | 11 | 82% |
| panzer.Panzer 0.2 | 6 | 100% |
| conscience.Electron 1.3g | 5 | 80% |
| bayen.UbaMicro 1.4 | 5 | 80% |
| yk.JahMicro 1.0 | 4 | 100% |
| donjezza.Jezza 1.0 | 4 | 75% |

Hadur died in 76 of 210 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 36 | 47% | 94 |
| apc.botM 3.0 | 14 | 18% | 44 |
| vjik.UnViolation 1.1 | 7 | 9% | 22 |
| lxx.ConceptA 0.8 | 7 | 9% | 15 |
| yk.JahMicro 1.0 | 4 | 5% | 8 |
| bayen.UbaMicro 1.4 | 3 | 4% | 10 |
| conscience.Electron 1.3g | 2 | 3% | 6 |
| panzer.Panzer 0.2 | 2 | 3% | 4 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |

Posture (Hadur's M records, 200 rounds): 119762 melee ticks, 58173 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 63 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 40174 sent, 35292 reached their opponent, 6054 virtual hits (17.2% of those reached).

## Melee bench: F33

hadur117.Hadur 3.21y5 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1830239. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 199 over 6 battles (33.2 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 90.0 | 129 / 210 | 1.80 | 22.2% | 30564 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 22.2% | 129 |
| maribo.Quester 0.3 | 2.0 | 17.1% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 14.4% | 23 |
| labg.Cataclysm 2.05 | 3.8 | 11.7% | 16 |
| baal.nano.N 1.42 | 5.2 | 10.3% | 5 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.8 | 9.7% | 7 |
| zyx.micro.Ant 1.1 | 7.2 | 6.1% | 1 |
| sanja.First 0.1 | 7.8 | 5.5% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 87.9 | 22 / 35 | 5117 |
| 2 | 1 | 70.8 | 88.6 | 19 / 35 | 5192 |
| 3 | 1 | 71.3 | 90.7 | 22 / 35 | 5215 |
| 4 | 1 | 71.5 | 91.8 | 23 / 35 | 5155 |
| 5 | 1 | 70.1 | 87.5 | 19 / 35 | 4989 |
| 6 | 1 | 71.5 | 93.6 | 24 / 35 | 4896 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 83 | 81% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 51 | 75% |
| labg.Cataclysm 2.05 | 15 | 67% |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 80% |
| baal.nano.N 1.42 | 5 | 80% |
| sanja.First 0.1 | 1 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 1045. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 32 | 39% | 94 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 20% | 51 |
| labg.Cataclysm 2.05 | 16 | 20% | 29 |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 9% | 13 |
| baal.nano.N 1.42 | 6 | 7% | 14 |
| zyx.micro.Ant 1.1 | 4 | 5% | 6 |
| sanja.First 0.1 | 1 | 1% | 3 |

Posture (Hadur's M records, 200 rounds): 158415 melee ticks, 58489 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 46 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 46423 sent, 42051 reached their opponent, 6012 virtual hits (14.3% of those reached).

## Melee bench: F34

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1799800. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 170 over 6 battles (28.3 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 87.3 | 91 / 210 | 2.14 | 18.8% | 32735 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.2 | 18.8% | 91 |
| kid.Gladiator .7.2 | 2.2 | 16.8% | 52 |
| stelo.Spread 0.9 | 2.7 | 16.3% | 52 |
| jcs.Seth 1.8 | 4.2 | 11.1% | 12 |
| tcf.Reach 3 | 4.8 | 10.1% | 2 |
| cli.Dancer 1.1 | 6.0 | 9.1% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.4% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.4% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 88.3 | 17 / 35 | 5930 |
| 2 | 1 | 69.5 | 86.3 | 17 / 35 | 5416 |
| 3 | 1 | 69.0 | 87.3 | 13 / 35 | 5150 |
| 4 | 2 | 69.1 | 84.8 | 10 / 35 | 5535 |
| 5 | 1 | 70.2 | 88.9 | 19 / 35 | 5447 |
| 6 | 1 | 69.6 | 88.3 | 15 / 35 | 5257 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 67 | 67% |
| kid.Gladiator .7.2 | 64 | 48% |
| jcs.Seth 1.8 | 16 | 56% |
| tcf.Reach 3 | 5 | 80% |
| ratosh.Wesco 1.4 | 2 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 1054. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 50 | 42% | 77 |
| stelo.Spread 0.9 | 38 | 32% | 79 |
| jcs.Seth 1.8 | 18 | 15% | 28 |
| tcf.Reach 3 | 7 | 6% | 14 |
| ratosh.Wesco 1.4 | 4 | 3% | 7 |
| cli.Dancer 1.1 | 3 | 3% | 4 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 201 rounds): 163019 melee ticks, 55351 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 40 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 50043 sent, 45046 reached their opponent, 7136 virtual hits (15.8% of those reached).

## Melee bench: F35

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1826308. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 188 over 6 battles (31.3 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 85.1 | 59 / 210 | 2.34 | 17.0% | 25480 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.2 | 18.9% | 124 |
| hadur117.Hadur 3.21y5 | 1.8 | 17.0% | 59 |
| gh.mini.Gruwel 0.9 | 3.0 | 13.6% | 23 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.2 | 11.9% | 5 |
| rz.HawkOnFire 0.1 | 4.8 | 11.0% | 1 |
| wit.Chuliath 1.0 | 6.3 | 6.5% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.8 | 5.5% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 5.8% | 0 |
| dans.Cinnamon 1.2 | 8.8 | 5.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.5 | 87.0 | 10 / 35 | 4418 |
| 2 | 2 | 67.0 | 86.3 | 8 / 35 | 4342 |
| 3 | 1 | 68.3 | 86.3 | 16 / 35 | 4509 |
| 4 | 2 | 67.0 | 86.7 | 11 / 35 | 3991 |
| 5 | 2 | 63.6 | 79.0 | 4 / 35 | 3758 |
| 6 | 2 | 67.1 | 85.1 | 10 / 35 | 4462 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 82 | 30% |
| gh.mini.Gruwel 0.9 | 29 | 45% |
| dmh.robocode.robot.BlackDeath 9.2 | 17 | 82% |
| rz.HawkOnFire 0.1 | 7 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 953. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 92 | 60% | 118 |
| gh.mini.Gruwel 0.9 | 30 | 19% | 42 |
| dmh.robocode.robot.BlackDeath 9.2 | 16 | 10% | 25 |
| rz.HawkOnFire 0.1 | 9 | 6% | 18 |
| stelo.MyAgileRobot 0.2 | 3 | 2% | 4 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 2 |
| wit.Chuliath 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 142918 melee ticks, 48274 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 39 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 43344 sent, 38341 reached their opponent, 5844 virtual hits (15.2% of those reached).

## Melee bench: F36

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1797525. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 299 over 6 battles (49.8 per battle, most in one battle 57). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 93.0 | 151 / 210 | 1.63 | 21.3% | 35397 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 21.3% | 151 |
| bzdp.Pansy 2.1 | 2.7 | 12.0% | 14 |
| alpha.RainingFire 1.0 | 3.0 | 12.1% | 15 |
| bvh.micro.Freya 0.3 | 3.7 | 11.3% | 11 |
| mz.Cork 0.1 | 5.3 | 10.4% | 9 |
| m3thos.Eva02 0.7.1 | 5.8 | 10.3% | 9 |
| bvh.mini.Fenrir 0.39 | 6.5 | 9.2% | 2 |
| dl.BetterWalls 1.0 | 8.5 | 5.1% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.8 | 5.0% | 0 |
| sample.MyFirstRobot 1.0 | 9.7 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 92.7 | 22 / 35 | 5537 |
| 2 | 1 | 73.0 | 97.1 | 29 / 35 | 6126 |
| 3 | 1 | 72.1 | 94.6 | 27 / 35 | 5820 |
| 4 | 1 | 71.3 | 89.5 | 25 / 35 | 6126 |
| 5 | 1 | 71.0 | 90.5 | 23 / 35 | 5750 |
| 6 | 1 | 71.9 | 93.7 | 25 / 35 | 6038 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 42 | 90% |
| bvh.micro.Freya 0.3 | 37 | 86% |
| alpha.RainingFire 1.0 | 34 | 79% |
| mz.Cork 0.1 | 26 | 81% |
| bvh.mini.Fenrir 0.39 | 18 | 89% |
| m3thos.Eva02 0.7.1 | 14 | 86% |
| dl.BetterWalls 1.0 | 4 | 100% |
| sample.MyFirstRobot 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 14 | 23% | 41 |
| bvh.micro.Freya 0.3 | 13 | 22% | 41 |
| bzdp.Pansy 2.1 | 9 | 15% | 39 |
| mz.Cork 0.1 | 8 | 13% | 35 |
| m3thos.Eva02 0.7.1 | 8 | 13% | 24 |
| bvh.mini.Fenrir 0.39 | 5 | 8% | 16 |
| squidM.TentalceMeleeNano 1.1 | 3 | 5% | 6 |
| dl.BetterWalls 1.0 | 0 | 0% | 6 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 141448 melee ticks, 44955 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 105 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 105 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 48029 sent, 43341 reached their opponent, 8448 virtual hits (19.5% of those reached).

## Melee bench: F37

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1822884. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 286 over 6 battles (47.7 per battle, most in one battle 53). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 90.5 | 166 / 210 | 1.85 | 20.1% | 36117 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 20.1% | 166 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.0 | 10.1% | 8 |
| agrach.Dalek 1.0 | 3.0 | 9.9% | 8 |
| germ.TheMind .2 | 4.3 | 9.6% | 3 |
| stelo.UntouchableNano 1.3 | 5.5 | 8.9% | 8 |
| EBBU.Sim2 1.02 | 6.7 | 8.7% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 7.0 | 8.5% | 2 |
| lmk.ACPFinal 0.1 | 7.3 | 8.2% | 3 |
| mb.Beast 0.1 | 7.7 | 8.4% | 8 |
| skm.Ryubot 1.0 | 9.5 | 7.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 91.7 | 29 / 35 | 5984 |
| 2 | 1 | 69.7 | 91.4 | 27 / 35 | 6188 |
| 3 | 1 | 70.1 | 90.5 | 29 / 35 | 6384 |
| 4 | 1 | 68.0 | 86.7 | 24 / 35 | 5857 |
| 5 | 1 | 70.4 | 94.0 | 29 / 35 | 6127 |
| 6 | 1 | 68.7 | 88.9 | 28 / 35 | 5577 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 46 | 93% |
| com.syncleus.robocode.Dreadnaught 0.1 | 26 | 92% |
| mb.Beast 0.1 | 25 | 96% |
| stelo.UntouchableNano 1.3 | 22 | 82% |
| lmk.ACPFinal 0.1 | 18 | 94% |
| skm.Ryubot 1.0 | 17 | 100% |
| germ.TheMind .2 | 16 | 88% |
| EBBU.Sim2 1.02 | 8 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 50% |

Hadur died in 44 of 210 rounds, at a mean tick of 444. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 14 | 32% | 18 |
| agrach.Dalek 1.0 | 7 | 16% | 54 |
| mb.Beast 0.1 | 7 | 16% | 28 |
| lmk.ACPFinal 0.1 | 4 | 9% | 20 |
| stelo.UntouchableNano 1.3 | 4 | 9% | 17 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3 | 7% | 33 |
| germ.TheMind .2 | 3 | 7% | 13 |
| EBBU.Sim2 1.02 | 2 | 5% | 20 |
| skm.Ryubot 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 199 rounds): 93987 melee ticks, 24678 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 47 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 30609 sent, 25926 reached their opponent, 7041 virtual hits (27.2% of those reached).

## Melee bench: F38

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1831925. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 221 over 6 battles (36.8 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 87.6 | 109 / 210 | 2.12 | 18.5% | 28805 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 18.5% | 109 |
| justin.Mallais 14.0 | 2.0 | 16.0% | 61 |
| bvh.mini.Freya 0.55 | 3.2 | 13.1% | 13 |
| bts.mega.Gnarly 1.4 | 4.2 | 10.9% | 12 |
| kdf.KoulDestroyer 1.0 | 5.3 | 9.5% | 1 |
| cs.Wren 1.0 | 5.5 | 9.9% | 6 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.3 | 7.3% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.5 | 7.1% | 6 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.1% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 87.3 | 16 / 35 | 5082 |
| 2 | 1 | 69.0 | 89.8 | 20 / 35 | 4869 |
| 3 | 1 | 69.7 | 91.4 | 20 / 35 | 4950 |
| 4 | 1 | 68.9 | 88.9 | 21 / 35 | 4816 |
| 5 | 1 | 66.9 | 85.1 | 17 / 35 | 4177 |
| 6 | 1 | 67.3 | 82.9 | 15 / 35 | 4911 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 75 | 63% |
| bvh.mini.Freya 0.55 | 28 | 82% |
| bts.mega.Gnarly 1.4 | 22 | 68% |
| cs.Wren 1.0 | 15 | 87% |
| kawigi.spare.SpareParts 0.7.6nosnd | 6 | 67% |
| kdf.KoulDestroyer 1.0 | 5 | 80% |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 75% |

Hadur died in 101 of 210 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 44 | 44% | 88 |
| bts.mega.Gnarly 1.4 | 18 | 18% | 38 |
| bvh.mini.Freya 0.55 | 14 | 14% | 33 |
| kdf.KoulDestroyer 1.0 | 8 | 8% | 13 |
| cs.Wren 1.0 | 6 | 6% | 15 |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 5% | 13 |
| davidalves.net.DuelistNanoMelee 1.01 | 5 | 5% | 9 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 1 |

Posture (Hadur's M records, 199 rounds): 137091 melee ticks, 39569 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 35 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 2.

Targeting waves (199 rounds): 44007 sent, 38798 reached their opponent, 7470 virtual hits (19.3% of those reached).

## Melee bench: F39

hadur117.Hadur 3.21y5 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1837471. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 196 over 6 battles (32.7 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 93.6 | 143 / 210 | 1.51 | 23.0% | 35576 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 23.0% | 143 |
| bvh.fry.Freya 0.82 | 2.0 | 16.4% | 14 |
| az.Ololobot 0.2.4 | 3.0 | 14.1% | 50 |
| winamp32.micro.MicroMacro 1.0 | 4.7 | 9.3% | 1 |
| apollokidd.ApolloKidd 0.9 | 5.7 | 8.7% | 1 |
| gimp.GimpBot 0.1 | 5.7 | 8.2% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 6.8 | 7.4% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 7.7 | 6.9% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.5 | 6.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 95.0 | 26 / 35 | 5920 |
| 2 | 1 | 70.6 | 92.5 | 21 / 35 | 5915 |
| 3 | 1 | 71.1 | 93.2 | 22 / 35 | 5821 |
| 4 | 1 | 70.0 | 90.7 | 20 / 35 | 5909 |
| 5 | 1 | 70.7 | 91.4 | 23 / 35 | 5713 |
| 6 | 1 | 73.1 | 98.6 | 31 / 35 | 6298 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 88 | 56% |
| bvh.fry.Freya 0.82 | 79 | 91% |
| winamp32.micro.MicroMacro 1.0 | 11 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 5 | 100% |
| gimp.GimpBot 0.1 | 3 | 100% |
| apollokidd.ApolloKidd 0.9 | 2 | 50% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 1252. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 43 | 63% | 95 |
| bvh.fry.Freya 0.82 | 15 | 22% | 73 |
| apollokidd.ApolloKidd 0.9 | 4 | 6% | 6 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 14 |
| gimp.GimpBot 0.1 | 2 | 3% | 12 |
| stelo.SoRobotNanoMelee 1.2 | 1 | 1% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 3 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 154489 melee ticks, 68435 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 111 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 111 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 44368 sent, 39995 reached their opponent, 6930 virtual hits (17.3% of those reached).

## Melee bench: F40

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1826901. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 246 over 6 battles (41.0 per battle, most in one battle 50). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 91.6 | 143 / 210 | 1.75 | 20.7% | 33660 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 20.7% | 143 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.2% | 27 |
| kano.gamma.KanoGamma 1.8 | 3.5 | 12.2% | 11 |
| mz.AntiGrav 1.0 | 4.0 | 11.2% | 6 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.1% | 5 |
| alpha.BlackIce 1.0 | 6.2 | 9.2% | 5 |
| stelo.Randomness 1.0 | 6.3 | 9.4% | 13 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.2% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 4.0% | 0 |
| sample.Corners 1.0 | 9.8 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 93.7 | 25 / 35 | 5788 |
| 2 | 1 | 70.9 | 91.4 | 23 / 35 | 5330 |
| 3 | 1 | 71.8 | 94.6 | 26 / 35 | 5528 |
| 4 | 1 | 71.1 | 91.4 | 20 / 35 | 5486 |
| 5 | 1 | 70.2 | 88.3 | 23 / 35 | 5501 |
| 6 | 1 | 71.7 | 90.5 | 26 / 35 | 6027 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 61 | 77% |
| kano.gamma.KanoGamma 1.8 | 44 | 82% |
| mz.AntiGrav 1.0 | 24 | 100% |
| stelo.Randomness 1.0 | 16 | 56% |
| Polkwane.SmashMelee 1.0 | 15 | 100% |
| alpha.BlackIce 1.0 | 10 | 70% |
| amk.superstrike.SuperStrike 0.3 | 3 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 24 | 36% | 68 |
| stelo.Randomness 1.0 | 12 | 18% | 30 |
| kano.gamma.KanoGamma 1.8 | 11 | 16% | 43 |
| Polkwane.SmashMelee 1.0 | 9 | 13% | 22 |
| mz.AntiGrav 1.0 | 5 | 7% | 23 |
| alpha.BlackIce 1.0 | 4 | 6% | 11 |
| amk.superstrike.SuperStrike 0.3 | 2 | 3% | 12 |

Posture (Hadur's M records, 198 rounds): 144211 melee ticks, 45678 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 48 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 46896 sent, 41885 reached their opponent, 8075 virtual hits (19.3% of those reached).

## Melee bench: F41

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1820968. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 177 over 6 battles (29.5 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 89.0 | 106 / 210 | 1.99 | 18.8% | 28784 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 18.8% | 106 |
| eem.EvBotNG v12.8 | 2.0 | 15.8% | 67 |
| ary.Swarm 1.1 | 3.7 | 12.9% | 7 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.5% | 17 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.1% | 11 |
| shrub.Silver v048 | 6.0 | 8.7% | 2 |
| zyx.nano.Ant 1.1 | 7.0 | 7.4% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 5.4% | 0 |
| stelo.Mirror 1.1 | 8.7 | 5.1% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 92.4 | 18 / 35 | 5104 |
| 2 | 1 | 67.4 | 85.4 | 17 / 35 | 4361 |
| 3 | 1 | 68.5 | 86.7 | 15 / 35 | 4756 |
| 4 | 1 | 70.0 | 91.1 | 19 / 35 | 4900 |
| 5 | 1 | 69.9 | 89.5 | 21 / 35 | 4957 |
| 6 | 1 | 68.9 | 88.9 | 16 / 35 | 4706 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 75 | 47% |
| lessonz.robocode.Oz 0.5.0 | 35 | 80% |
| ary.Swarm 1.1 | 28 | 89% |
| simonton.nano.MeleeSeed 1.8 | 14 | 100% |
| shrub.Silver v048 | 5 | 60% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 944. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 51 | 49% | 90 |
| lessonz.robocode.Oz 0.5.0 | 22 | 21% | 38 |
| ary.Swarm 1.1 | 16 | 15% | 38 |
| simonton.nano.MeleeSeed 1.8 | 6 | 6% | 25 |
| shrub.Silver v048 | 5 | 5% | 8 |
| stelo.Mirror 1.1 | 3 | 3% | 4 |
| zyx.nano.Ant 1.1 | 2 | 2% | 3 |
| jsal.Jsalbot 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 198 rounds): 150989 melee ticks, 43970 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 41 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 2.

Targeting waves (198 rounds): 47990 sent, 42974 reached their opponent, 6412 virtual hits (14.9% of those reached).

## Melee bench: F42

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1831933. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 197 over 6 battles (32.8 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 92.3 | 149 / 210 | 1.70 | 20.9% | 37392 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 20.9% | 149 |
| wompi.Wallaby 5.1 | 2.0 | 15.4% | 30 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.5% | 15 |
| ara.Shera 0.88 | 3.5 | 13.1% | 14 |
| amz.NanoClone 1.41 | 5.0 | 9.1% | 1 |
| dsw.StaticD 1.0 | 6.8 | 6.3% | 0 |
| mme.NikeEnhanced 2.0 | 7.7 | 5.7% | 1 |
| maribo.IotaCT 1.1 | 7.8 | 5.8% | 0 |
| stelo.MirrorMicro 1.0 | 8.0 | 5.7% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 90.8 | 24 / 35 | 6223 |
| 2 | 1 | 72.3 | 94.3 | 28 / 35 | 6196 |
| 3 | 1 | 71.1 | 90.5 | 23 / 35 | 5904 |
| 4 | 1 | 71.4 | 92.7 | 23 / 35 | 6289 |
| 5 | 1 | 71.7 | 92.7 | 24 / 35 | 6430 |
| 6 | 1 | 71.9 | 92.7 | 27 / 35 | 6350 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 102 | 89% |
| maribo.mini.MiniQuester 0.1 | 39 | 85% |
| ara.Shera 0.88 | 26 | 81% |
| dsw.StaticD 1.0 | 2 | 100% |
| amz.NanoClone 1.41 | 2 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 27 | 44% | 99 |
| ara.Shera 0.88 | 13 | 21% | 44 |
| maribo.mini.MiniQuester 0.1 | 12 | 20% | 45 |
| amz.NanoClone 1.41 | 6 | 10% | 9 |
| dsw.StaticD 1.0 | 2 | 3% | 7 |
| maribo.IotaCT 1.1 | 1 | 2% | 2 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 156311 melee ticks, 48655 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 53 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 53 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 48693 sent, 43861 reached their opponent, 8155 virtual hits (18.6% of those reached).

## Melee bench: F43

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1829078. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 136 over 6 battles (22.7 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 81.3 | 35 / 210 | 2.69 | 16.5% | 27044 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.4% | 137 |
| hadur117.Hadur 3.21y5 | 2.0 | 16.5% | 35 |
| brainfade.melee.Dusk 0.44 | 3.0 | 13.0% | 29 |
| dummy.micro.Sparrow 2.5 | 4.3 | 11.3% | 9 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 10.6% | 2 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.4% | 0 |
| jab.DiamondStealer 5 | 7.2 | 7.6% | 0 |
| mz.NanoGod 2.02 | 7.8 | 7.2% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.7% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.4 | 86.3 | 9 / 35 | 4421 |
| 2 | 2 | 67.6 | 81.9 | 7 / 35 | 4645 |
| 3 | 2 | 65.6 | 77.8 | 3 / 35 | 4196 |
| 4 | 2 | 66.4 | 81.0 | 2 / 35 | 4401 |
| 5 | 2 | 67.2 | 81.3 | 8 / 35 | 4799 |
| 6 | 2 | 66.4 | 79.4 | 6 / 35 | 4582 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 84 | 19% |
| brainfade.melee.Dusk 0.44 | 23 | 57% |
| dummy.micro.Sparrow 2.5 | 5 | 20% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 75% |
| mz.NanoGod 2.02 | 1 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 177 of 210 rounds, at a mean tick of 1029. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 100 | 56% | 117 |
| brainfade.melee.Dusk 0.44 | 31 | 18% | 43 |
| dummy.micro.Sparrow 2.5 | 16 | 9% | 16 |
| wcsv.melee.EngineerMelee 0.1 | 12 | 7% | 15 |
| Krabb.akim2.Akim2 1.1b | 7 | 4% | 9 |
| mz.NanoGod 2.02 | 7 | 4% | 8 |
| jab.DiamondStealer 5 | 2 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 161734 melee ticks, 53573 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 32 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 49043 sent, 43897 reached their opponent, 6732 virtual hits (15.3% of those reached).

## Melee bench: F44

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1784195. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 210 over 6 battles (35.0 per battle, most in one battle 45). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 94.5 | 155 / 210 | 1.50 | 21.7% | 37647 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 21.7% | 155 |
| stelo.Liblix 0.3.1 | 2.2 | 15.1% | 37 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.2% | 14 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.2 | 9.4% | 0 |
| jwirde.Gort 2.0 | 4.8 | 8.9% | 1 |
| disan.Chair 2.2.0 | 6.3 | 7.6% | 2 |
| stf.PanzerGeneral 0.1 | 7.3 | 7.1% | 0 |
| wompi.Quokka 1.6 | 7.5 | 6.9% | 1 |
| sample.Crazy 1.0 | 9.0 | 4.8% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 97.5 | 28 / 35 | 6418 |
| 2 | 1 | 72.6 | 96.2 | 27 / 35 | 6341 |
| 3 | 1 | 70.6 | 88.9 | 22 / 35 | 5979 |
| 4 | 1 | 71.9 | 94.9 | 25 / 35 | 6038 |
| 5 | 1 | 73.0 | 95.9 | 27 / 35 | 6412 |
| 6 | 1 | 72.6 | 93.7 | 26 / 35 | 6459 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 86 | 74% |
| tzu.TheArtOfWar 1.2 | 71 | 90% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 9 | 100% |
| jwirde.Gort 2.0 | 8 | 100% |
| disan.Chair 2.2.0 | 8 | 88% |
| wompi.Quokka 1.6 | 2 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 948. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 32 | 58% | 107 |
| tzu.TheArtOfWar 1.2 | 12 | 22% | 55 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 11% | 13 |
| disan.Chair 2.2.0 | 2 | 4% | 7 |
| stf.PanzerGeneral 0.1 | 2 | 4% | 4 |
| jwirde.Gort 2.0 | 1 | 2% | 13 |
| wompi.Quokka 1.6 | 0 | 0% | 6 |
| sample.Crazy 1.0 | 0 | 0% | 3 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 149352 melee ticks, 46546 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 33 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 49933 sent, 45212 reached their opponent, 9032 virtual hits (20.0% of those reached).

## Melee bench: F45

hadur117.Hadur 3.21y5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1824958. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 279 over 6 battles (46.5 per battle, most in one battle 55). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 90.4 | 125 / 210 | 1.86 | 20.4% | 33276 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 20.4% | 125 |
| jje.BagPuss 1.2 | 2.5 | 12.4% | 13 |
| myl.nano.Graviton 1.10 | 4.0 | 10.8% | 7 |
| sul.Lunar 1.1 | 4.0 | 10.7% | 10 |
| eem.IWillFireNoBullet v2.8 | 4.3 | 9.4% | 46 |
| fm.claire 1.7 | 6.5 | 9.0% | 1 |
| hvilela.HVilela 0.9 | 6.7 | 9.1% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.3 | 8.6% | 4 |
| wit.Deep7 2.0 | 8.8 | 5.5% | 4 |
| abud.ThirdRobo 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 94.0 | 19 / 35 | 5926 |
| 2 | 1 | 72.2 | 93.7 | 26 / 35 | 5013 |
| 3 | 1 | 68.4 | 85.4 | 15 / 35 | 5250 |
| 4 | 1 | 70.1 | 87.9 | 20 / 35 | 5890 |
| 5 | 1 | 70.3 | 88.9 | 22 / 35 | 5749 |
| 6 | 1 | 70.7 | 92.7 | 23 / 35 | 5448 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 58 | 55% |
| jje.BagPuss 1.2 | 39 | 77% |
| sul.Lunar 1.1 | 24 | 92% |
| myl.nano.Graviton 1.10 | 21 | 90% |
| pez.mini.ChironexFleckeri 0.5 | 11 | 82% |
| wit.Deep7 2.0 | 6 | 100% |
| fm.claire 1.7 | 4 | 75% |
| hvilela.HVilela 0.9 | 4 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 1471. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 32 | 37% | 0 |
| jje.BagPuss 1.2 | 18 | 21% | 63 |
| myl.nano.Graviton 1.10 | 11 | 13% | 37 |
| sul.Lunar 1.1 | 9 | 10% | 47 |
| fm.claire 1.7 | 8 | 9% | 18 |
| pez.mini.ChironexFleckeri 0.5 | 4 | 5% | 20 |
| wit.Deep7 2.0 | 2 | 2% | 6 |
| abud.ThirdRobo 1.0 | 1 | 1% | 2 |
| hvilela.HVilela 0.9 | 0 | 0% | 13 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 189307 melee ticks, 65430 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 81 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 81 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 56848 sent, 52039 reached their opponent, 7419 virtual hits (14.3% of those reached).

## Melee bench: F46

hadur117.Hadur 3.21y5 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1820247. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 135 over 6 battles (22.5 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 89.8 | 121 / 210 | 1.82 | 21.2% | 29762 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y5 | 1.0 | 21.2% | 121 |
| kc.mini.Mirage 0.2 | 2.0 | 18.7% | 70 |
| mz.MicroSheep 1.0 | 3.3 | 12.8% | 7 |
| cx.Princess 1.0 | 4.0 | 11.7% | 9 |
| sadoner.killer 0.2 | 5.2 | 10.3% | 2 |
| arthord.NanoSatanMelee Beta | 5.5 | 9.0% | 0 |
| jeremyreeder.collective.Prophet 5 | 7.2 | 7.0% | 1 |
| kurios.DOSexe .9a | 7.8 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 94.3 | 24 / 35 | 5249 |
| 2 | 1 | 69.5 | 90.4 | 19 / 35 | 4924 |
| 3 | 1 | 68.3 | 86.8 | 16 / 35 | 4853 |
| 4 | 1 | 69.4 | 88.6 | 19 / 35 | 4915 |
| 5 | 1 | 69.6 | 90.0 | 21 / 35 | 4736 |
| 6 | 1 | 69.8 | 88.6 | 22 / 35 | 5085 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 123 | 71% |
| cx.Princess 1.0 | 21 | 71% |
| mz.MicroSheep 1.0 | 16 | 81% |
| arthord.NanoSatanMelee Beta | 4 | 100% |
| sadoner.killer 0.2 | 2 | 50% |
| jeremyreeder.collective.Prophet 5 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 872. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 45 | 50% | 127 |
| cx.Princess 1.0 | 13 | 14% | 25 |
| sadoner.killer 0.2 | 13 | 14% | 15 |
| mz.MicroSheep 1.0 | 10 | 11% | 25 |
| arthord.NanoSatanMelee Beta | 7 | 8% | 12 |
| jeremyreeder.collective.Prophet 5 | 2 | 2% | 3 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |
| kurios.DOSexe .9a | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 136945 melee ticks, 51454 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 39 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 38154 sent, 33718 reached their opponent, 5184 virtual hits (15.4% of those reached).

