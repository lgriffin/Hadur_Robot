# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1494705. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 113 over 6 battles (18.8 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 85.9 | 52 / 210 | 2.27 | 17.9% | 34178 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.2 | 19.7% | 135 |
| hadur117.Hadur 3.21z4 | 1.8 | 17.9% | 52 |
| sgp.JollyNinja 3.53 | 3.2 | 11.7% | 18 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 10.9% | 2 |
| mz.MicroGodMelee 1 | 5.3 | 9.6% | 0 |
| lorneswork.Predator 1.0 | 5.5 | 9.4% | 3 |
| adt.Ar2 1.0 | 7.0 | 7.7% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.8% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 83.2 | 8 / 35 | 5325 |
| 2 | 2 | 68.6 | 88.6 | 6 / 35 | 5846 |
| 3 | 2 | 67.9 | 85.7 | 10 / 35 | 5461 |
| 4 | 2 | 67.3 | 83.5 | 9 / 35 | 5313 |
| 5 | 1 | 69.6 | 86.7 | 14 / 35 | 6377 |
| 6 | 2 | 68.4 | 87.6 | 5 / 35 | 5856 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 130 | 15% |
| sgp.JollyNinja 3.53 | 26 | 62% |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 90% |
| mz.MicroGodMelee 1 | 5 | 100% |
| skm.butterfly 1.0 | 1 | 100% |
| adt.Ar2 1.0 | 1 | 100% |
| lorneswork.Predator 1.0 | 1 | 0% |

Hadur died in 158 of 210 rounds, at a mean tick of 1147. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 119 | 75% | 140 |
| sgp.JollyNinja 3.53 | 16 | 10% | 30 |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 5% | 11 |
| lorneswork.Predator 1.0 | 8 | 5% | 9 |
| mz.MicroGodMelee 1 | 4 | 3% | 13 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 4 |
| skm.butterfly 1.0 | 1 | 1% | 1 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |
| adt.Ar2 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 135739 melee ticks, 86316 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 71 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 42613 sent, 37735 reached their opponent, 7186 virtual hits (19.0% of those reached).

## Melee bench: F02

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1485683. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 193 over 6 battles (32.2 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 87.2 | 106 / 210 | 2.15 | 19.1% | 32047 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 19.1% | 106 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 13.6% | 37 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.0 | 13.0% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 11.2% | 6 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 10.3% | 16 |
| fnc.bandit.Bandit 5.2.0 | 6.7 | 8.3% | 2 |
| sch.Simone 0.3d | 6.8 | 8.0% | 8 |
| Noran.BitchingElk 0.054 | 7.3 | 7.9% | 11 |
| stelo.PatternRobot 1.0 | 9.0 | 4.9% | 1 |
| fullsail.SweetTea 1.1 | 9.8 | 3.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 83.2 | 15 / 35 | 5521 |
| 2 | 1 | 69.1 | 88.9 | 15 / 35 | 5014 |
| 3 | 1 | 68.8 | 87.3 | 19 / 35 | 4994 |
| 4 | 1 | 68.8 | 86.3 | 18 / 35 | 5449 |
| 5 | 1 | 70.1 | 90.5 | 22 / 35 | 5352 |
| 6 | 1 | 69.3 | 87.0 | 17 / 35 | 5717 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 50 | 70% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 36 | 78% |
| com.cohesiva.robocode.ManOwaR 1.0 | 20 | 50% |
| sch.Simone 0.3d | 14 | 79% |
| Noran.BitchingElk 0.054 | 14 | 57% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 82% |
| fnc.bandit.Bandit 5.2.0 | 4 | 50% |
| stelo.PatternRobot 1.0 | 4 | 75% |

Hadur died in 104 of 210 rounds, at a mean tick of 971. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 26 | 25% | 64 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 16 | 15% | 45 |
| com.cohesiva.robocode.ManOwaR 1.0 | 15 | 14% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 13% | 20 |
| sch.Simone 0.3d | 10 | 10% | 19 |
| Noran.BitchingElk 0.054 | 9 | 9% | 22 |
| fnc.bandit.Bandit 5.2.0 | 7 | 7% | 8 |
| stelo.PatternRobot 1.0 | 6 | 6% | 6 |
| fullsail.SweetTea 1.1 | 1 | 1% | 1 |

Posture (Hadur's M records, 198 rounds): 161664 melee ticks, 45594 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 57 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 2.

Targeting waves (198 rounds): 55519 sent, 50710 reached their opponent, 8039 virtual hits (15.9% of those reached).

## Melee bench: F03

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1489744. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 137 over 6 battles (22.8 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 94.5 | 178 / 210 | 1.50 | 21.5% | 39948 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 21.5% | 178 |
| radnor.DoctorBob 1.42 | 2.2 | 13.8% | 14 |
| vuen.Cake 2.51 | 3.3 | 12.5% | 11 |
| kawigi.nano.Lib 1.0 | 3.5 | 12.4% | 7 |
| urdos.URDOS 1.3 | 5.0 | 9.2% | 0 |
| adt.Ar1 2.1 | 6.0 | 8.1% | 0 |
| oa.weak.FlyMk1 0.1 | 7.3 | 6.4% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.8 | 5.8% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.3% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 93.7 | 28 / 35 | 6338 |
| 2 | 1 | 72.7 | 96.5 | 31 / 35 | 6855 |
| 3 | 1 | 71.5 | 95.2 | 30 / 35 | 6387 |
| 4 | 1 | 72.0 | 93.7 | 29 / 35 | 6874 |
| 5 | 1 | 71.8 | 91.1 | 28 / 35 | 6815 |
| 6 | 1 | 72.6 | 96.8 | 32 / 35 | 6679 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 75 | 99% |
| vuen.Cake 2.51 | 70 | 90% |
| kawigi.nano.Lib 1.0 | 32 | 94% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| urdos.URDOS 1.3 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 32 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 11 | 34% | 77 |
| kawigi.nano.Lib 1.0 | 8 | 25% | 35 |
| radnor.DoctorBob 1.42 | 6 | 19% | 65 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 13% | 4 |
| adt.Ar1 2.1 | 1 | 3% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 3% | 4 |
| urdos.URDOS 1.3 | 1 | 3% | 4 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 13 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 124237 melee ticks, 41650 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 54 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 37048 sent, 32079 reached their opponent, 7699 virtual hits (24.0% of those reached).

## Melee bench: F04

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1480118. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 102 over 6 battles (17.0 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 86.0 | 29 / 210 | 2.26 | 18.0% | 35746 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.4% | 165 |
| hadur117.Hadur 3.21z4 | 2.0 | 18.0% | 29 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.6% | 9 |
| TNT.TNT 0.99.1 | 4.0 | 10.9% | 5 |
| josago.Jorgito 0.16 | 5.0 | 9.2% | 2 |
| css.Delitioner 0.11 | 6.5 | 7.1% | 0 |
| tj.zombie1n 1.0.1 | 6.8 | 6.7% | 0 |
| rampancy.Durandal 2.1d | 7.7 | 5.5% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.7 | 85.1 | 4 / 35 | 5925 |
| 2 | 2 | 69.5 | 88.3 | 5 / 35 | 6232 |
| 3 | 2 | 68.6 | 84.4 | 7 / 35 | 5654 |
| 4 | 2 | 69.7 | 87.3 | 6 / 35 | 6246 |
| 5 | 2 | 69.2 | 86.7 | 4 / 35 | 5949 |
| 6 | 2 | 68.0 | 84.4 | 3 / 35 | 5740 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 135 | 7% |
| apc.LeeroyJenkins2 1.0 | 13 | 77% |
| TNT.TNT 0.99.1 | 9 | 67% |
| josago.Jorgito 0.16 | 3 | 67% |
| tj.zombie1n 1.0.1 | 1 | 100% |

Hadur died in 181 of 210 rounds, at a mean tick of 1295. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 138 | 76% | 151 |
| apc.LeeroyJenkins2 1.0 | 22 | 12% | 29 |
| TNT.TNT 0.99.1 | 11 | 6% | 17 |
| josago.Jorgito 0.16 | 5 | 3% | 7 |
| css.Delitioner 0.11 | 4 | 2% | 4 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 1 |
| tj.zombie1n 1.0.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 186074 melee ticks, 72274 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 96 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 96 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 55549 sent, 50553 reached their opponent, 7171 virtual hits (14.2% of those reached).

## Melee bench: F05

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1489565. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 114 over 6 battles (19.0 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 78.5 | 36 / 210 | 2.94 | 15.6% | 25772 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 18.1% | 100 |
| justin.DemonicRage 3.4 | 1.8 | 17.0% | 58 |
| hadur117.Hadur 3.21z4 | 2.8 | 15.6% | 36 |
| wompi.Numbat 2.1 | 4.0 | 12.3% | 12 |
| axeBots.HataMoto 3.09 | 5.5 | 8.7% | 3 |
| ms.Ares 0.19 | 5.5 | 8.9% | 0 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.0% | 1 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.2 | 5.3% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.2 | 4.1% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.1 | 74.9 | 6 / 35 | 4263 |
| 2 | 3 | 63.3 | 74.9 | 2 / 35 | 4102 |
| 3 | 3 | 64.9 | 80.0 | 5 / 35 | 4105 |
| 4 | 3 | 66.5 | 81.6 | 10 / 35 | 4627 |
| 5 | 2 | 65.9 | 81.3 | 8 / 35 | 4539 |
| 6 | 3 | 64.3 | 78.1 | 5 / 35 | 4136 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 36 | 28% |
| cb.fire.Firestarter 2.0f | 35 | 20% |
| wompi.Numbat 2.1 | 16 | 75% |
| axeBots.HataMoto 3.09 | 8 | 88% |

Hadur died in 174 of 210 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 60 | 34% | 70 |
| justin.DemonicRage 3.4 | 59 | 34% | 69 |
| wompi.Numbat 2.1 | 32 | 18% | 41 |
| axeBots.HataMoto 3.09 | 10 | 6% | 16 |
| ms.Ares 0.19 | 7 | 4% | 7 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 3 |
| Queens_teamrobot.UltraRazor 1.0 | 2 | 1% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 2 |

Posture (Hadur's M records, 200 rounds): 148607 melee ticks, 30524 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 62 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 44672 sent, 39620 reached their opponent, 6274 virtual hits (15.8% of those reached).

## Melee bench: F06

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1476341. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 156 over 6 battles (26.0 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 91.4 | 145 / 210 | 1.78 | 20.6% | 35013 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 20.6% | 145 |
| jekl.StoneGhost 0.7 | 2.2 | 14.3% | 16 |
| origin.SleepSiphon 1.7b | 2.8 | 13.8% | 36 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 11.5% | 8 |
| mld.Wisdom 1.0 | 5.0 | 10.5% | 2 |
| gg.Wolverine 2.0 | 6.3 | 8.1% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 6.7% | 2 |
| DBall.NUKE 0.1 | 8.0 | 6.0% | 0 |
| spinnercat.Omen 1.0 | 8.3 | 5.8% | 0 |
| sample.Fire 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 92.4 | 25 / 35 | 5770 |
| 2 | 1 | 69.0 | 83.8 | 18 / 35 | 5586 |
| 3 | 1 | 71.0 | 92.4 | 25 / 35 | 5645 |
| 4 | 1 | 72.3 | 93.3 | 26 / 35 | 6367 |
| 5 | 1 | 71.0 | 93.3 | 25 / 35 | 5458 |
| 6 | 1 | 72.3 | 93.0 | 26 / 35 | 6187 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 58 | 83% |
| jekl.StoneGhost 0.7 | 58 | 97% |
| pe.minimelee.SandboxMiniMelee 1.1 | 30 | 90% |
| mld.Wisdom 1.0 | 10 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 60% |
| gg.Wolverine 2.0 | 1 | 0% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 27 | 40% | 80 |
| jekl.StoneGhost 0.7 | 12 | 18% | 57 |
| mld.Wisdom 1.0 | 11 | 16% | 27 |
| pe.minimelee.SandboxMiniMelee 1.1 | 10 | 15% | 34 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 4% | 7 |
| gg.Wolverine 2.0 | 3 | 4% | 4 |
| spinnercat.Omen 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 143512 melee ticks, 43232 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 26 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 43327 sent, 38504 reached their opponent, 8033 virtual hits (20.9% of those reached).

## Melee bench: F07

hadur117.Hadur 3.21z4 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1467859. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 78 over 6 battles (13.0 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 75.5 | 95.8 | 156 / 210 | 1.33 | 26.1% | 48005 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 26.1% | 156 |
| rtk.Tachikoma 1.0 | 2.0 | 19.2% | 35 |
| oog.melee.CapuletDroid 1.1 | 3.3 | 12.5% | 9 |
| franzor.Lizt 1.3.1 | 3.7 | 12.3% | 10 |
| lrem.micro.MoggFanatic 0.2 | 5.0 | 10.1% | 0 |
| exauge.GateKeeper 1.1.121g | 6.0 | 8.5% | 0 |
| skm.PateranBotlock2 1.0 | 7.0 | 6.2% | 0 |
| sample.Target 1.0 | 8.3 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 8.7 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 76.4 | 97.5 | 30 / 35 | 8416 |
| 2 | 1 | 73.9 | 92.9 | 20 / 35 | 7542 |
| 3 | 1 | 75.7 | 96.1 | 26 / 35 | 7863 |
| 4 | 1 | 74.9 | 94.6 | 24 / 35 | 7840 |
| 5 | 1 | 75.9 | 96.4 | 27 / 35 | 8126 |
| 6 | 1 | 76.3 | 97.5 | 29 / 35 | 8218 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 123 | 76% |
| franzor.Lizt 1.3.1 | 37 | 84% |
| oog.melee.CapuletDroid 1.1 | 36 | 86% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 1623. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 38 | 70% | 139 |
| franzor.Lizt 1.3.1 | 9 | 17% | 5 |
| oog.melee.CapuletDroid 1.1 | 7 | 13% | 57 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 6 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 194036 melee ticks, 87216 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 38 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 51937 sent, 47727 reached their opponent, 9665 virtual hits (20.3% of those reached).

## Melee bench: F08

hadur117.Hadur 3.21z4 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1482071. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 289 over 6 battles (48.2 per battle, most in one battle 63). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 92.9 | 146 / 210 | 1.57 | 22.9% | 32662 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 22.9% | 146 |
| tm.Yuugao 1.0 | 2.3 | 14.8% | 23 |
| shrub.Vapour v159 | 2.8 | 13.8% | 22 |
| com.spp.robocode.MostlyHarmless 010 | 3.8 | 12.1% | 11 |
| jwst.DAD.DarkAndDarker 1.1 | 5.2 | 10.2% | 7 |
| m3thos.Eva00 1.1 | 5.8 | 9.0% | 1 |
| qualidafial.MajorDick 1.0.1 | 7.2 | 6.9% | 0 |
| SHAM.WOW 1.4 | 8.3 | 5.3% | 0 |
| zyx.nano.BacillusComma 1.0 | 8.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 93.6 | 24 / 35 | 5392 |
| 2 | 1 | 72.0 | 94.3 | 25 / 35 | 5759 |
| 3 | 1 | 70.7 | 91.8 | 24 / 35 | 5179 |
| 4 | 1 | 70.1 | 89.3 | 22 / 35 | 5106 |
| 5 | 1 | 72.9 | 95.4 | 29 / 35 | 5863 |
| 6 | 1 | 70.5 | 93.2 | 22 / 35 | 5363 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 58 | 78% |
| shrub.Vapour v159 | 49 | 78% |
| com.spp.robocode.MostlyHarmless 010 | 39 | 87% |
| jwst.DAD.DarkAndDarker 1.1 | 24 | 88% |
| m3thos.Eva00 1.1 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 928. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 21 | 33% | 67 |
| shrub.Vapour v159 | 21 | 33% | 55 |
| com.spp.robocode.MostlyHarmless 010 | 13 | 20% | 39 |
| jwst.DAD.DarkAndDarker 1.1 | 8 | 13% | 32 |
| qualidafial.MajorDick 1.0.1 | 1 | 2% | 4 |
| m3thos.Eva00 1.1 | 0 | 0% | 8 |
| SHAM.WOW 1.4 | 0 | 0% | 4 |
| zyx.nano.BacillusComma 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 146011 melee ticks, 47746 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 61 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 61 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 43238 sent, 38814 reached their opponent, 6606 virtual hits (17.0% of those reached).

## Melee bench: F09

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1496286. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 162 over 6 battles (27.0 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 80.3 | 67 / 210 | 2.78 | 16.6% | 25109 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.5 | 16.6% | 67 |
| positive.Portia 1.26e | 1.7 | 16.8% | 84 |
| kc.micro.Figment 1.0 | 2.8 | 14.5% | 25 |
| pedersen.Grishnakh 1.0 | 4.3 | 10.9% | 14 |
| yagami.Tidus 0.11 | 5.0 | 10.1% | 4 |
| mc2.enemy.Original 0.9 | 5.7 | 9.4% | 12 |
| dft.Calliope 5.6 | 7.0 | 7.3% | 4 |
| step.nanoPri 1.0 | 8.8 | 5.1% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.8 | 4.8% | 0 |
| rdm.Dueler 0.4x | 9.3 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 81.9 | 14 / 35 | 3964 |
| 2 | 2 | 66.3 | 78.7 | 11 / 35 | 4715 |
| 3 | 2 | 64.2 | 75.2 | 7 / 35 | 4110 |
| 4 | 1 | 66.9 | 83.5 | 13 / 35 | 4355 |
| 5 | 1 | 64.9 | 80.3 | 10 / 35 | 4017 |
| 6 | 2 | 65.8 | 81.9 | 12 / 35 | 3948 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 48 | 35% |
| kc.micro.Figment 1.0 | 42 | 83% |
| pedersen.Grishnakh 1.0 | 8 | 50% |
| mc2.enemy.Original 0.9 | 7 | 29% |
| yagami.Tidus 0.11 | 7 | 100% |
| dft.Calliope 5.6 | 3 | 33% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 858. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 54 | 38% | 76 |
| kc.micro.Figment 1.0 | 28 | 20% | 59 |
| mc2.enemy.Original 0.9 | 18 | 13% | 22 |
| pedersen.Grishnakh 1.0 | 14 | 10% | 17 |
| yagami.Tidus 0.11 | 14 | 10% | 17 |
| dft.Calliope 5.6 | 10 | 7% | 12 |
| robar.nano.Assertive_Melee 0.2 | 3 | 2% | 4 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |
| step.nanoPri 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 147917 melee ticks, 36481 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 49 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 46839 sent, 42173 reached their opponent, 5929 virtual hits (14.1% of those reached).

## Melee bench: F10

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488147. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 184 over 6 battles (30.7 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 96.0 | 168 / 210 | 1.36 | 21.2% | 36400 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 21.2% | 168 |
| DTF.Kludgy 1.2b | 2.2 | 14.4% | 20 |
| ne.Chimera 1.2 | 3.0 | 13.2% | 7 |
| ejb.Polaris 1.0.1 | 3.8 | 12.3% | 10 |
| vStar.RAFzilla 2.15 | 5.3 | 10.1% | 4 |
| tvv.micro.Antares 1.1.1 | 5.7 | 9.6% | 2 |
| sam.Samspin 1.0 | 7.3 | 5.5% | 0 |
| kurios.DOSexe .9b | 8.2 | 5.0% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.7 | 5.0% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 95.6 | 26 / 35 | 6176 |
| 2 | 1 | 72.0 | 95.6 | 27 / 35 | 6202 |
| 3 | 1 | 71.7 | 94.6 | 30 / 35 | 6072 |
| 4 | 1 | 72.7 | 97.8 | 30 / 35 | 6108 |
| 5 | 1 | 71.8 | 95.9 | 27 / 35 | 5985 |
| 6 | 1 | 71.6 | 96.5 | 28 / 35 | 5857 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 62 | 81% |
| ne.Chimera 1.2 | 51 | 88% |
| ejb.Polaris 1.0.1 | 44 | 89% |
| vStar.RAFzilla 2.15 | 17 | 94% |
| tvv.micro.Antares 1.1.1 | 14 | 100% |
| kurios.DOSexe .9b | 2 | 100% |
| donjezza.Muncho 1.0 | 1 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 959. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 16 | 36% | 63 |
| ne.Chimera 1.2 | 14 | 32% | 57 |
| ejb.Polaris 1.0.1 | 9 | 20% | 48 |
| vStar.RAFzilla 2.15 | 2 | 5% | 18 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 5% | 2 |
| tvv.micro.Antares 1.1.1 | 0 | 0% | 8 |
| kurios.DOSexe .9b | 0 | 0% | 8 |
| sam.Samspin 1.0 | 0 | 0% | 3 |
| donjezza.Muncho 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 140453 melee ticks, 56062 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 71 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 44510 sent, 39666 reached their opponent, 7101 virtual hits (17.9% of those reached).

## Melee bench: F11

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478297. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 165 over 6 battles (27.5 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 82.8 | 69 / 210 | 2.55 | 17.0% | 25591 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.3 | 16.4% | 69 |
| hadur117.Hadur 3.21z4 | 1.7 | 17.0% | 69 |
| cx.mini.Nimrod 0.55 | 3.0 | 13.0% | 25 |
| djc.DynaBot 0.1.1 | 4.0 | 11.1% | 16 |
| rdt199.Warlord 0.73 | 5.3 | 9.0% | 12 |
| br2.MobyDickBot 1.6 | 6.2 | 8.5% | 13 |
| KiraNL.Chupacabra 0.4 | 7.2 | 7.4% | 1 |
| uji.YellohFellah 1.0 | 7.3 | 7.6% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.0% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 82.2 | 11 / 35 | 4580 |
| 2 | 2 | 65.6 | 82.5 | 11 / 35 | 4134 |
| 3 | 1 | 68.3 | 87.0 | 18 / 35 | 4679 |
| 4 | 2 | 65.3 | 82.2 | 10 / 35 | 4070 |
| 5 | 2 | 63.8 | 79.0 | 9 / 35 | 3913 |
| 6 | 2 | 66.0 | 83.8 | 10 / 35 | 4215 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 61 | 44% |
| djc.DynaBot 0.1.1 | 19 | 63% |
| rdt199.Warlord 0.73 | 15 | 53% |
| cx.mini.Nimrod 0.55 | 13 | 54% |
| uji.YellohFellah 1.0 | 11 | 91% |
| br2.MobyDickBot 1.6 | 10 | 40% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 900. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 65 | 46% | 90 |
| cx.mini.Nimrod 0.55 | 21 | 15% | 31 |
| rdt199.Warlord 0.73 | 18 | 13% | 28 |
| djc.DynaBot 0.1.1 | 17 | 12% | 29 |
| br2.MobyDickBot 1.6 | 8 | 6% | 10 |
| uji.YellohFellah 1.0 | 5 | 4% | 12 |
| KiraNL.Chupacabra 0.4 | 3 | 2% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 1% | 3 |
| stelo.MirrorNano 1.3 | 2 | 1% | 3 |

Posture (Hadur's M records, 202 rounds): 153444 melee ticks, 38908 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 53 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 53 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 49458 sent, 44464 reached their opponent, 5781 virtual hits (13.0% of those reached).

## Melee bench: F12

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1473280. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 171 over 6 battles (28.5 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 85.9 | 123 / 210 | 2.27 | 18.3% | 25817 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 18.3% | 123 |
| bts.wiki.RipCurl 0.9b | 2.3 | 14.2% | 24 |
| darkcanuck.Leon 1.01 | 3.2 | 13.0% | 20 |
| nat.PallasHawk 1.0 | 3.7 | 12.4% | 31 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.2% | 9 |
| jrm.Test0 1.0 | 6.5 | 7.7% | 2 |
| cs.sheldor.Talon 1.1 | 6.8 | 7.3% | 0 |
| jp.Perpy 16.0 | 7.8 | 6.6% | 0 |
| stuff.Vlad 0.1 | 9.3 | 5.4% | 0 |
| jaybot.bots.Oddball 4.0 | 9.5 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 88.9 | 21 / 35 | 4474 |
| 2 | 1 | 65.8 | 79.4 | 15 / 35 | 4221 |
| 3 | 1 | 66.3 | 83.5 | 16 / 35 | 3875 |
| 4 | 1 | 67.4 | 84.1 | 21 / 35 | 4179 |
| 5 | 1 | 70.4 | 92.7 | 28 / 35 | 4534 |
| 6 | 1 | 68.6 | 86.7 | 22 / 35 | 4534 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 52 | 81% |
| darkcanuck.Leon 1.01 | 43 | 88% |
| nat.PallasHawk 1.0 | 34 | 65% |
| brainfade.melee.Genghis 0.36 | 14 | 93% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| jrm.Test0 1.0 | 3 | 33% |
| jaybot.bots.Oddball 4.0 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 678. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 21 | 24% | 58 |
| darkcanuck.Leon 1.01 | 17 | 19% | 60 |
| nat.PallasHawk 1.0 | 17 | 19% | 37 |
| jrm.Test0 1.0 | 14 | 16% | 15 |
| brainfade.melee.Genghis 0.36 | 9 | 10% | 21 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 8 |
| jaybot.bots.Oddball 4.0 | 2 | 2% | 4 |
| jp.Perpy 16.0 | 2 | 2% | 4 |
| stuff.Vlad 0.1 | 2 | 2% | 2 |

Posture (Hadur's M records, 200 rounds): 126059 melee ticks, 36827 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 47 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 42539 sent, 37453 reached their opponent, 5960 virtual hits (15.9% of those reached).

## Melee bench: F13

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1494047. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 128 over 6 battles (21.3 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 80.5 | 57 / 210 | 2.75 | 16.0% | 26345 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.8 | 16.7% | 88 |
| hadur117.Hadur 3.21z4 | 2.0 | 16.0% | 57 |
| ags.Glacier 0.2.11 | 2.2 | 16.5% | 43 |
| shinh.Entangled 0.3 | 4.2 | 11.8% | 13 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.2% | 9 |
| apc.Colossus2 0.17 | 6.0 | 8.4% | 1 |
| stelo.Wang 1.0 | 7.0 | 6.6% | 0 |
| ayk.WallHugger 1.0 | 8.2 | 5.0% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 80.6 | 10 / 35 | 4382 |
| 2 | 1 | 67.1 | 85.7 | 11 / 35 | 4820 |
| 3 | 2 | 65.0 | 79.4 | 9 / 35 | 4325 |
| 4 | 1 | 66.9 | 84.4 | 14 / 35 | 4515 |
| 5 | 3 | 64.3 | 80.0 | 7 / 35 | 3967 |
| 6 | 3 | 63.5 | 73.0 | 6 / 35 | 4336 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 49 | 29% |
| ags.Glacier 0.2.11 | 48 | 63% |
| shinh.Entangled 0.3 | 15 | 47% |
| gh.micro.Gruweltje 0.7 | 5 | 60% |
| apc.Colossus2 0.17 | 2 | 100% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 57 | 37% | 81 |
| ags.Glacier 0.2.11 | 48 | 31% | 70 |
| shinh.Entangled 0.3 | 17 | 11% | 20 |
| gh.micro.Gruweltje 0.7 | 12 | 8% | 15 |
| stelo.Wang 1.0 | 8 | 5% | 10 |
| apc.Colossus2 0.17 | 7 | 5% | 9 |
| maribo.FollowFire 1 | 4 | 3% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 138437 melee ticks, 36297 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 49 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 40436 sent, 35280 reached their opponent, 5405 virtual hits (15.3% of those reached).

## Melee bench: F14

hadur117.Hadur 3.21z4 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1481846. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 177 over 6 battles (29.5 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.6 | 96.7 | 189 / 210 | 1.26 | 24.7% | 39614 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 24.7% | 189 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 16.5% | 11 |
| Lo_Ian.Gandalf_V4 4.0 | 3.3 | 11.5% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 4.2 | 10.9% | 4 |
| co.edu.usb.rc.LidisTron 1.0 | 4.8 | 10.6% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.3% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 8.7% | 2 |
| pa.Improved 1.0 | 8.0 | 6.3% | 1 |
| sample.TrackFire 1.0 | 9.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.4 | 98.6 | 31 / 35 | 6839 |
| 2 | 1 | 72.7 | 92.9 | 28 / 35 | 6858 |
| 3 | 1 | 73.2 | 97.5 | 32 / 35 | 6152 |
| 4 | 1 | 73.5 | 95.7 | 32 / 35 | 6708 |
| 5 | 1 | 73.8 | 98.6 | 32 / 35 | 6398 |
| 6 | 1 | 73.7 | 97.1 | 34 / 35 | 6659 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 112 | 95% |
| sanyi.mikrobi.Roberto 1.0 | 27 | 96% |
| sheldor.micro.PointInLineRRAL 1.0 | 21 | 95% |
| co.edu.usb.rc.LidisTron 1.0 | 17 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 14 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |

Hadur died in 21 of 210 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 11 | 52% | 106 |
| sanyi.mikrobi.Roberto 1.0 | 4 | 19% | 37 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 14% | 21 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 10% | 18 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 5% | 16 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 5 |
| pa.Improved 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 198 rounds): 123396 melee ticks, 49933 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 30 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 30 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 35487 sent, 31299 reached their opponent, 7736 virtual hits (24.7% of those reached).

## Melee bench: F15

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1490156. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 195 over 6 battles (32.5 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 87.7 | 124 / 210 | 2.10 | 19.5% | 32678 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 19.5% | 124 |
| mld.DustBunny 3.8 | 2.7 | 13.0% | 8 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.4% | 10 |
| emp.Yngwie 1.11 | 3.5 | 12.5% | 45 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.2% | 6 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.0% | 13 |
| lambdaxy.TBot 0.1 | 7.2 | 7.1% | 0 |
| Grystrion.TrackerWO 1.0 | 7.7 | 6.9% | 1 |
| divineomega.TrialBot 0.003 | 9.5 | 4.0% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.5 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 90.2 | 22 / 35 | 5711 |
| 2 | 1 | 70.6 | 89.5 | 25 / 35 | 5483 |
| 3 | 1 | 66.3 | 78.4 | 16 / 35 | 4761 |
| 4 | 1 | 71.8 | 92.7 | 25 / 35 | 6052 |
| 5 | 1 | 70.1 | 89.5 | 18 / 35 | 5744 |
| 6 | 1 | 68.5 | 86.0 | 18 / 35 | 4927 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 52 | 67% |
| kawigi.micro.Shiz 1.1 | 37 | 97% |
| mld.DustBunny 3.8 | 33 | 97% |
| kawigi.robot.Girl 1.2 | 16 | 56% |
| cb.nano.Insomnia 1.0 | 6 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 3 | 67% |
| lambdaxy.TBot 0.1 | 2 | 100% |
| divineomega.TrialBot 0.003 | 1 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 918. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 33 | 38% | 76 |
| cb.nano.Insomnia 1.0 | 14 | 16% | 23 |
| kawigi.robot.Girl 1.2 | 13 | 15% | 18 |
| kawigi.micro.Shiz 1.1 | 10 | 12% | 39 |
| mld.DustBunny 3.8 | 10 | 12% | 34 |
| divineomega.TrialBot 0.003 | 3 | 3% | 8 |
| lambdaxy.TBot 0.1 | 1 | 1% | 6 |
| Grystrion.TrackerWO 1.0 | 1 | 1% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 198 rounds): 157417 melee ticks, 43188 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 73 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 50650 sent, 45855 reached their opponent, 7027 virtual hits (15.3% of those reached).

## Melee bench: F16

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1482109. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 169 over 6 battles (28.2 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 90.1 | 129 / 210 | 1.90 | 20.6% | 36969 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 20.6% | 129 |
| gh.Griezel 0.5.2 | 2.0 | 15.8% | 44 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.2 | 13.8% | 5 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 11.3% | 27 |
| bvh.fnr.Fenrir 0.36l | 4.8 | 9.2% | 3 |
| tvv.nano.Polaris 1.2 | 6.3 | 8.2% | 1 |
| stelo.IntrinsicVolatility 1.4 | 6.7 | 7.4% | 0 |
| asd.Cthulhu 1.3 | 8.8 | 4.6% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 4.8% | 1 |
| repositorio.NanoStep 1.0 | 9.2 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 91.7 | 20 / 35 | 6514 |
| 2 | 1 | 69.4 | 87.3 | 18 / 35 | 5448 |
| 3 | 1 | 72.0 | 91.1 | 23 / 35 | 6585 |
| 4 | 1 | 71.0 | 90.5 | 21 / 35 | 5972 |
| 5 | 1 | 72.3 | 91.7 | 24 / 35 | 6590 |
| 6 | 1 | 70.5 | 87.9 | 23 / 35 | 5860 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 78 | 71% |
| techdude.forest.FlamingForest 1.1 | 51 | 69% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 20 | 100% |
| bvh.fnr.Fenrir 0.36l | 10 | 80% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |
| tvv.nano.Polaris 1.2 | 4 | 75% |
| stelo.IntrinsicVolatility 1.4 | 4 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 1167. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 36 | 44% | 93 |
| techdude.forest.FlamingForest 1.1 | 20 | 25% | 54 |
| bvh.fnr.Fenrir 0.36l | 9 | 11% | 16 |
| divineomega.DivineBot 1.9.4.5 | 6 | 7% | 14 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 4 | 5% | 13 |
| asd.Cthulhu 1.3 | 3 | 4% | 3 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 5 |
| stelo.IntrinsicVolatility 1.4 | 1 | 1% | 9 |
| repositorio.NanoStep 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 198 rounds): 171857 melee ticks, 66443 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 53 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 53 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 53962 sent, 49103 reached their opponent, 7886 virtual hits (16.1% of those reached).

## Melee bench: F17

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1483067. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 172 over 6 battles (28.7 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 89.4 | 120 / 210 | 1.95 | 20.5% | 38460 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 20.5% | 120 |
| et.Predator 1.8 | 2.5 | 13.4% | 21 |
| oog.melee.Mercutio 1.0 | 2.8 | 13.1% | 30 |
| cx.BlestPain 1.41 | 3.7 | 12.3% | 33 |
| ahf.NanoAndrew .4 | 5.2 | 9.7% | 4 |
| nic.Nicator 2.4 | 6.2 | 9.0% | 0 |
| maribo.melee.BMV 0.1 | 6.7 | 8.6% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.7% | 0 |
| tex.Longbot 0.4 | 8.7 | 5.5% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 94.6 | 26 / 35 | 7132 |
| 2 | 1 | 71.4 | 91.7 | 20 / 35 | 6348 |
| 3 | 1 | 70.6 | 88.6 | 19 / 35 | 6213 |
| 4 | 1 | 70.1 | 87.3 | 18 / 35 | 6361 |
| 5 | 1 | 71.4 | 90.5 | 19 / 35 | 6603 |
| 6 | 1 | 69.1 | 83.8 | 18 / 35 | 5803 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 58 | 81% |
| oog.melee.Mercutio 1.0 | 56 | 73% |
| cx.BlestPain 1.41 | 34 | 44% |
| ahf.NanoAndrew .4 | 6 | 100% |
| nic.Nicator 2.4 | 5 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 3 | 100% |
| maribo.melee.BMV 0.1 | 3 | 67% |

Hadur died in 91 of 210 rounds, at a mean tick of 1164. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 30 | 33% | 55 |
| oog.melee.Mercutio 1.0 | 24 | 26% | 56 |
| et.Predator 1.8 | 20 | 22% | 62 |
| maribo.melee.BMV 0.1 | 9 | 10% | 10 |
| ahf.NanoAndrew .4 | 5 | 5% | 11 |
| nic.Nicator 2.4 | 2 | 2% | 9 |
| tex.Longbot 0.4 | 1 | 1% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 5 |

Posture (Hadur's M records, 199 rounds): 157520 melee ticks, 68232 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 48 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 50431 sent, 45610 reached their opponent, 9220 virtual hits (20.2% of those reached).

## Melee bench: F18

hadur117.Hadur 3.21z4 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1485158. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 264 over 6 battles (44.0 per battle, most in one battle 51). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 92.4 | 153 / 210 | 1.60 | 22.7% | 30578 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 22.7% | 153 |
| agd.Mooserwirt2 2.7 | 2.3 | 13.8% | 22 |
| uji.DBH 1.1 | 2.7 | 13.3% | 10 |
| ratosh.Nobo 0.21 | 5.0 | 10.0% | 5 |
| sigterm.Sigterm 1.0 | 5.2 | 9.9% | 9 |
| spinnercat.Robovirus 2.718 | 5.5 | 9.5% | 5 |
| kawigi.mini.Fhqwhgads 1.1 | 6.3 | 8.6% | 1 |
| stelo.WangRobot 1.0 | 8.3 | 6.5% | 4 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.7 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 92.5 | 25 / 35 | 4993 |
| 2 | 1 | 70.1 | 90.0 | 26 / 35 | 5089 |
| 3 | 1 | 70.3 | 91.8 | 24 / 35 | 4911 |
| 4 | 1 | 70.4 | 93.6 | 25 / 35 | 4927 |
| 5 | 1 | 71.2 | 93.2 | 27 / 35 | 5255 |
| 6 | 1 | 71.2 | 93.6 | 26 / 35 | 5403 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| uji.DBH 1.1 | 51 | 96% |
| agd.Mooserwirt2 2.7 | 40 | 70% |
| sigterm.Sigterm 1.0 | 31 | 87% |
| ratosh.Nobo 0.21 | 15 | 100% |
| stelo.WangRobot 1.0 | 15 | 93% |
| spinnercat.Robovirus 2.718 | 13 | 62% |
| kawigi.mini.Fhqwhgads 1.1 | 12 | 92% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 828. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 21 | 37% | 66 |
| spinnercat.Robovirus 2.718 | 7 | 12% | 14 |
| uji.DBH 1.1 | 6 | 11% | 37 |
| sigterm.Sigterm 1.0 | 6 | 11% | 30 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 6 | 11% | 11 |
| ratosh.Nobo 0.21 | 4 | 7% | 21 |
| stelo.WangRobot 1.0 | 4 | 7% | 13 |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 5% | 15 |

Posture (Hadur's M records, 198 rounds): 127642 melee ticks, 44273 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 50 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 38847 sent, 34528 reached their opponent, 7343 virtual hits (21.3% of those reached).

## Melee bench: F19

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1491980. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 183 over 6 battles (30.5 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.0 | 98.5 | 199 / 210 | 1.13 | 23.0% | 39797 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 23.0% | 199 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.5% | 7 |
| mld.Infinity 2.2 | 3.3 | 11.7% | 3 |
| krillr.mini.JointStrike 2.0.0 | 3.8 | 11.2% | 0 |
| erdnis.Rover 0.3 | 4.8 | 10.4% | 1 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.4% | 0 |
| mbh.Mbh 0.1 | 7.3 | 7.1% | 0 |
| pac.ABC 2.1 | 7.8 | 6.5% | 0 |
| pbg.R2D2 1.0 | 8.5 | 6.1% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.1 | 98.7 | 32 / 35 | 6889 |
| 2 | 1 | 73.7 | 97.5 | 34 / 35 | 6458 |
| 3 | 1 | 73.6 | 98.7 | 33 / 35 | 6232 |
| 4 | 1 | 74.4 | 99.0 | 34 / 35 | 6979 |
| 5 | 1 | 73.9 | 98.1 | 33 / 35 | 6431 |
| 6 | 1 | 74.5 | 99.0 | 33 / 35 | 6808 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 117 | 97% |
| mld.Infinity 2.2 | 34 | 100% |
| krillr.mini.JointStrike 2.0.0 | 17 | 100% |
| erdnis.Rover 0.3 | 15 | 93% |
| patson.PatsonTestBot 1.0 | 10 | 100% |
| pac.ABC 2.1 | 7 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 11 of 210 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 5 | 45% | 82 |
| mld.Infinity 2.2 | 2 | 18% | 27 |
| patson.PatsonTestBot 1.0 | 2 | 18% | 21 |
| erdnis.Rover 0.3 | 1 | 9% | 28 |
| krillr.mini.JointStrike 2.0.0 | 1 | 9% | 23 |
| mbh.Mbh 0.1 | 0 | 0% | 10 |
| pbg.R2D2 1.0 | 0 | 0% | 6 |
| pac.ABC 2.1 | 0 | 0% | 5 |

Posture (Hadur's M records, 198 rounds): 123702 melee ticks, 48347 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 34 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 41105 sent, 36381 reached their opponent, 8152 virtual hits (22.4% of those reached).

## Melee bench: F20

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1484891. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 144 over 6 battles (24.0 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 92.5 | 143 / 210 | 1.67 | 21.6% | 39806 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 21.6% | 143 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.5% | 37 |
| fwb.Nine 1.0.1 | 3.3 | 11.3% | 9 |
| catcat20.Rabbit 0.001 | 3.8 | 10.7% | 16 |
| nz.jdc.nano.GridFu 1.0 | 5.0 | 10.1% | 3 |
| m3thos.mini.Eva01 0.5.5 | 6.2 | 8.8% | 0 |
| bayen.nut.Squirrel 1.615 | 7.0 | 7.0% | 2 |
| ntc.ControlledChaos 1.1.4 | 8.2 | 5.4% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.5 | 5.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 93.0 | 23 / 35 | 6495 |
| 2 | 1 | 72.6 | 94.0 | 25 / 35 | 6676 |
| 3 | 1 | 72.8 | 93.3 | 26 / 35 | 6837 |
| 4 | 1 | 70.7 | 88.9 | 20 / 35 | 6285 |
| 5 | 1 | 72.1 | 91.4 | 23 / 35 | 6769 |
| 6 | 1 | 72.6 | 94.6 | 26 / 35 | 6744 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 86 | 74% |
| fwb.Nine 1.0.1 | 37 | 100% |
| catcat20.Rabbit 0.001 | 36 | 72% |
| nz.jdc.nano.GridFu 1.0 | 8 | 88% |
| bayen.nut.Squirrel 1.615 | 4 | 75% |
| m3thos.mini.Eva01 0.5.5 | 4 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 38 | 55% | 92 |
| catcat20.Rabbit 0.001 | 15 | 22% | 41 |
| fwb.Nine 1.0.1 | 10 | 14% | 24 |
| bayen.nut.Squirrel 1.615 | 4 | 6% | 14 |
| nz.jdc.nano.GridFu 1.0 | 1 | 1% | 21 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 14 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 1 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 158714 melee ticks, 54764 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 25 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 49155 sent, 44418 reached their opponent, 9639 virtual hits (21.7% of those reached).

## Melee bench: F21

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1485901. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 103 over 6 battles (17.2 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 91.2 | 120 / 210 | 1.80 | 20.5% | 36744 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 20.5% | 120 |
| eem.EvBot v4.6.16 | 2.0 | 16.7% | 70 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.3% | 5 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.5% | 3 |
| eld.Hmm 1.0 | 5.3 | 8.5% | 11 |
| oa.weak.BotherBot 0.1 | 6.0 | 7.5% | 1 |
| el.JumpShoot 0.2 | 7.8 | 5.6% | 0 |
| PSW.Relentless 0.1 | 7.8 | 5.7% | 0 |
| fire219.CatBot 1.0 | 8.0 | 5.8% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 87.6 | 16 / 35 | 5906 |
| 2 | 1 | 71.5 | 92.7 | 21 / 35 | 6193 |
| 3 | 1 | 70.2 | 89.5 | 17 / 35 | 5701 |
| 4 | 1 | 70.8 | 88.9 | 18 / 35 | 6262 |
| 5 | 1 | 72.6 | 94.3 | 24 / 35 | 6481 |
| 6 | 1 | 71.8 | 94.0 | 24 / 35 | 6201 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 114 | 59% |
| dummy.mini.Scimitar 1.01 | 38 | 89% |
| cf.RiO.RiOx 4.2.1 | 16 | 94% |
| eld.Hmm 1.0 | 11 | 36% |
| oa.weak.BotherBot 0.1 | 1 | 0% |

Hadur died in 90 of 210 rounds, at a mean tick of 1254. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 53 | 59% | 109 |
| dummy.mini.Scimitar 1.01 | 12 | 13% | 48 |
| cf.RiO.RiOx 4.2.1 | 11 | 12% | 22 |
| eld.Hmm 1.0 | 9 | 10% | 23 |
| PSW.Relentless 0.1 | 3 | 3% | 3 |
| oa.weak.BotherBot 0.1 | 2 | 2% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 162489 melee ticks, 81990 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 57 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 47829 sent, 43002 reached their opponent, 6899 virtual hits (16.0% of those reached).

## Melee bench: F22

hadur117.Hadur 3.21z4 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488732. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 148 over 6 battles (24.7 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 88.2 | 106 / 210 | 1.95 | 20.5% | 27895 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 20.5% | 106 |
| pe.SandboxDT 2.71m | 2.2 | 17.3% | 58 |
| kvk.HebusLeTroll 0.35 | 3.0 | 15.1% | 24 |
| jlm.javaDisturbance 0.59 | 3.8 | 13.5% | 17 |
| bigpete.Stewie 1.0 | 5.0 | 10.9% | 4 |
| yk.JahRoslav 1.1 | 6.5 | 6.4% | 0 |
| tad.Dalek98 0.98 | 6.8 | 6.5% | 0 |
| gg.Squaraus 0.6 | 7.8 | 5.5% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 86.4 | 16 / 35 | 4571 |
| 2 | 1 | 70.1 | 90.7 | 21 / 35 | 4894 |
| 3 | 1 | 68.1 | 86.4 | 15 / 35 | 4526 |
| 4 | 1 | 70.6 | 91.1 | 23 / 35 | 4999 |
| 5 | 1 | 66.6 | 84.6 | 13 / 35 | 4138 |
| 6 | 1 | 69.3 | 89.6 | 18 / 35 | 4767 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 67 | 45% |
| jlm.javaDisturbance 0.59 | 41 | 80% |
| kvk.HebusLeTroll 0.35 | 37 | 76% |
| bigpete.Stewie 1.0 | 10 | 90% |
| yk.JahRoslav 1.1 | 3 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |
| tad.Dalek98 0.98 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 945. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 51 | 49% | 83 |
| kvk.HebusLeTroll 0.35 | 28 | 27% | 48 |
| jlm.javaDisturbance 0.59 | 15 | 14% | 51 |
| bigpete.Stewie 1.0 | 5 | 5% | 14 |
| tad.Dalek98 0.98 | 3 | 3% | 3 |
| pbg.NinjaX 1.2 | 1 | 1% | 5 |
| yk.JahRoslav 1.1 | 1 | 1% | 4 |
| gg.Squaraus 0.6 | 1 | 1% | 1 |

Posture (Hadur's M records, 199 rounds): 147201 melee ticks, 50321 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 39 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 43376 sent, 39025 reached their opponent, 5120 virtual hits (13.1% of those reached).

## Melee bench: F23

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1470221. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 134 over 6 battles (22.3 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.5 | 96.8 | 176 / 210 | 1.29 | 22.4% | 40070 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 22.4% | 176 |
| pe.SandboxLump 1.52 | 2.0 | 16.3% | 25 |
| cre.Karolos 0.32 | 3.0 | 13.4% | 8 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 9.7% | 0 |
| stelo.RamTrackSurfer 1.2 | 5.3 | 9.1% | 1 |
| cw.megas.Blade 0.8 | 6.3 | 8.3% | 0 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.3 | 8.4% | 0 |
| sample.Walls 1.0 | 7.7 | 7.1% | 0 |
| rrh.Iwillfindyou 2.0 | 9.3 | 3.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.0 | 97.8 | 30 / 35 | 6647 |
| 2 | 1 | 73.5 | 97.8 | 31 / 35 | 6444 |
| 3 | 1 | 73.0 | 94.0 | 30 / 35 | 6725 |
| 4 | 1 | 73.4 | 97.5 | 31 / 35 | 6476 |
| 5 | 1 | 73.8 | 96.2 | 26 / 35 | 7186 |
| 6 | 1 | 73.5 | 97.5 | 28 / 35 | 6592 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 113 | 86% |
| cre.Karolos 0.32 | 52 | 88% |
| stelo.AreaTargetingBot 1.1 | 12 | 100% |
| stelo.RamTrackSurfer 1.2 | 12 | 92% |
| sample.Walls 1.0 | 7 | 100% |
| cw.megas.Blade 0.8 | 3 | 100% |

Hadur died in 34 of 210 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 22 | 65% | 98 |
| cre.Karolos 0.32 | 9 | 26% | 56 |
| stelo.RamTrackSurfer 1.2 | 2 | 6% | 17 |
| sample.Walls 1.0 | 1 | 3% | 12 |
| stelo.AreaTargetingBot 1.1 | 0 | 0% | 14 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 7 |
| cw.megas.Blade 0.8 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 120391 melee ticks, 48414 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 65 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 36808 sent, 31871 reached their opponent, 8748 virtual hits (27.4% of those reached).

## Melee bench: F24

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1468878. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 168 over 6 battles (28.0 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 82.4 | 84 / 210 | 2.58 | 17.1% | 25422 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 17.1% | 84 |
| rz.GlowBlowMelee 1.4 | 2.5 | 13.8% | 36 |
| davidalves.Phoenix 0.54 | 2.8 | 13.7% | 43 |
| florent.XSeries.X2 0.12 | 4.2 | 12.4% | 21 |
| pedersen.Ugluk 1.1.1 | 4.5 | 11.8% | 19 |
| oog.melee.Corsair 1.0 | 6.0 | 9.3% | 4 |
| stelo.SoJNanoMelee 1.1 | 7.5 | 6.2% | 1 |
| as.FrankTheTank 1.3 | 8.3 | 5.4% | 0 |
| lunchie.Lunchbox 0.93 | 8.3 | 5.9% | 2 |
| evd.X1 0.01 | 9.8 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 81.9 | 12 / 35 | 4146 |
| 2 | 1 | 65.4 | 79.4 | 13 / 35 | 3963 |
| 3 | 1 | 67.6 | 86.0 | 15 / 35 | 4755 |
| 4 | 1 | 66.5 | 82.9 | 16 / 35 | 4316 |
| 5 | 1 | 67.5 | 86.3 | 18 / 35 | 4147 |
| 6 | 1 | 64.4 | 78.1 | 10 / 35 | 4095 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.Phoenix 0.54 | 41 | 54% |
| rz.GlowBlowMelee 1.4 | 33 | 48% |
| pedersen.Ugluk 1.1.1 | 24 | 71% |
| florent.XSeries.X2 0.12 | 21 | 57% |
| oog.melee.Corsair 1.0 | 10 | 90% |
| as.FrankTheTank 1.3 | 4 | 100% |
| stelo.SoJNanoMelee 1.1 | 4 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 37 | 29% | 50 |
| davidalves.Phoenix 0.54 | 35 | 28% | 54 |
| florent.XSeries.X2 0.12 | 27 | 21% | 45 |
| pedersen.Ugluk 1.1.1 | 14 | 11% | 27 |
| oog.melee.Corsair 1.0 | 4 | 3% | 18 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 5 |
| evd.X1 0.01 | 3 | 2% | 3 |
| as.FrankTheTank 1.3 | 2 | 2% | 3 |
| stelo.SoJNanoMelee 1.1 | 1 | 1% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 133813 melee ticks, 36441 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 137 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 137 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 3.

Targeting waves (199 rounds): 43521 sent, 38496 reached their opponent, 6503 virtual hits (16.9% of those reached).

## Melee bench: F25

hadur117.Hadur 3.21z4 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1469492. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 157 over 6 battles (26.2 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 87.7 | 140 / 210 | 1.98 | 20.5% | 22374 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 20.5% | 140 |
| voidious.mini.BrokenSword 2.0.3 | 2.7 | 14.2% | 20 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 14.1% | 12 |
| jdw.Hurricane 1.4 | 3.7 | 12.4% | 26 |
| ds.Oo 2.2 | 5.3 | 10.0% | 5 |
| adt.Ar2 1.1 | 6.5 | 8.1% | 3 |
| awesomeness.Elite 1.0 | 6.5 | 8.6% | 2 |
| gjr.Cephalosporin 0.1 | 7.7 | 7.7% | 2 |
| amk.ChumbaMini 0.2 | 9.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 84.3 | 23 / 35 | 3322 |
| 2 | 1 | 67.2 | 86.1 | 18 / 35 | 3665 |
| 3 | 1 | 68.6 | 87.9 | 25 / 35 | 3800 |
| 4 | 1 | 70.1 | 92.5 | 27 / 35 | 4007 |
| 5 | 1 | 67.0 | 83.9 | 19 / 35 | 3701 |
| 6 | 1 | 69.7 | 91.8 | 28 / 35 | 3879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 44 | 93% |
| voidious.mini.BrokenSword 2.0.3 | 42 | 86% |
| jdw.Hurricane 1.4 | 34 | 71% |
| ds.Oo 2.2 | 12 | 83% |
| gjr.Cephalosporin 0.1 | 11 | 100% |
| adt.Ar2 1.1 | 10 | 90% |
| awesomeness.Elite 1.0 | 10 | 80% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 629. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 18 | 25% | 44 |
| voidious.micro.BlitzBat 1.05 | 14 | 20% | 48 |
| voidious.mini.BrokenSword 2.0.3 | 13 | 18% | 37 |
| ds.Oo 2.2 | 9 | 13% | 24 |
| adt.Ar2 1.1 | 9 | 13% | 17 |
| awesomeness.Elite 1.0 | 5 | 7% | 20 |
| amk.ChumbaMini 0.2 | 2 | 3% | 3 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 15 |

Posture (Hadur's M records, 199 rounds): 119665 melee ticks, 26050 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 33 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 37970 sent, 33603 reached their opponent, 5350 virtual hits (15.9% of those reached).

## Melee bench: F26

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474688. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 198 over 6 battles (33.0 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 93.9 | 149 / 210 | 1.55 | 21.8% | 42032 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 21.8% | 149 |
| ak.Fermat 2.0 | 2.0 | 14.7% | 28 |
| lrem.Spectre 0.4.4 | 3.5 | 12.5% | 14 |
| shu.nitro.LENIN .T34 | 3.5 | 12.4% | 12 |
| js.PinBall 1.6 | 5.2 | 10.2% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 5.8 | 9.4% | 4 |
| gh.mini.GrubbmOne 1.0 | 7.2 | 7.5% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 6.9% | 0 |
| sample.SpinBot 1.0 | 9.0 | 3.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 91.7 | 23 / 35 | 6725 |
| 2 | 1 | 72.4 | 92.1 | 23 / 35 | 6834 |
| 3 | 1 | 73.3 | 93.7 | 26 / 35 | 7239 |
| 4 | 1 | 72.8 | 94.3 | 25 / 35 | 6840 |
| 5 | 1 | 72.5 | 94.3 | 23 / 35 | 6783 |
| 6 | 1 | 74.5 | 97.5 | 29 / 35 | 7611 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 64 | 66% |
| shu.nitro.LENIN .T34 | 52 | 92% |
| lrem.Spectre 0.4.4 | 43 | 84% |
| jaybot.adv.bots.JayBot 2.0 | 11 | 100% |
| js.PinBall 1.6 | 9 | 100% |
| gh.mini.GrubbmOne 1.0 | 2 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 963. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 30 | 49% | 73 |
| shu.nitro.LENIN .T34 | 12 | 20% | 62 |
| lrem.Spectre 0.4.4 | 9 | 15% | 38 |
| js.PinBall 1.6 | 5 | 8% | 20 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 7% | 11 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 2% | 3 |
| sample.SpinBot 1.0 | 0 | 0% | 2 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 152287 melee ticks, 49333 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 20 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 20 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 48221 sent, 43417 reached their opponent, 9865 virtual hits (22.7% of those reached).

## Melee bench: F27

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1467384. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 175 over 6 battles (29.2 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 79.8 | 137 / 210 | 2.82 | 18.8% | 33970 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.2 | 18.8% | 137 |
| mk.Alpha 0.2.1 | 1.8 | 14.3% | 48 |
| EH.Eagle 1.0.6 | 3.5 | 11.0% | 6 |
| techdude.kombat.FlamingKombat 1.5 | 5.0 | 9.6% | 2 |
| wee.Gem 1.8.4 | 5.3 | 9.3% | 9 |
| throxbot.ThroxBot 0.1 | 6.0 | 8.7% | 1 |
| sheldor.melee.nano.TestMelee 0.1 | 6.2 | 9.3% | 5 |
| joe.ADinosaur 1.0 | 7.0 | 8.2% | 1 |
| caimano.Furia_Ceca 0.22 | 9.2 | 6.2% | 1 |
| cs.Grudge 1.0 | 9.8 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 92.1 | 27 / 35 | 6292 |
| 2 | 1 | 65.0 | 65.7 | 18 / 35 | 5671 |
| 3 | 1 | 71.8 | 98.4 | 32 / 35 | 5428 |
| 4 | 1 | 71.9 | 95.9 | 30 / 35 | 5840 |
| 5 | 1 | 64.6 | 66.3 | 17 / 35 | 5386 |
| 6 | 2 | 62.5 | 60.3 | 13 / 35 | 5353 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 73 | 86% |
| EH.Eagle 1.0.6 | 32 | 97% |
| wee.Gem 1.8.4 | 11 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 89% |
| throxbot.ThroxBot 0.1 | 9 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 8 | 100% |
| joe.ADinosaur 1.0 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 75% |

Hadur died in 73 of 210 rounds, at a mean tick of 475. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cs.Grudge 1.0 | 19 | 26% | 18 |
| mk.Alpha 0.2.1 | 18 | 25% | 71 |
| EH.Eagle 1.0.6 | 12 | 16% | 36 |
| sheldor.melee.nano.TestMelee 0.1 | 6 | 8% | 20 |
| wee.Gem 1.8.4 | 4 | 5% | 16 |
| throxbot.ThroxBot 0.1 | 4 | 5% | 14 |
| joe.ADinosaur 1.0 | 4 | 5% | 9 |
| techdude.kombat.FlamingKombat 1.5 | 3 | 4% | 16 |
| caimano.Furia_Ceca 0.22 | 3 | 4% | 8 |

Posture (Hadur's M records, 199 rounds): 111608 melee ticks, 34576 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 55 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 36923 sent, 32292 reached their opponent, 7771 virtual hits (24.1% of those reached).

## Melee bench: F28

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1463467. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 165 over 6 battles (27.5 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 90.8 | 149 / 210 | 1.83 | 19.5% | 27329 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 19.5% | 149 |
| kid.test.NightFox .2 | 2.2 | 13.9% | 22 |
| uji.Antique 1.0 | 3.2 | 12.3% | 18 |
| qohnil.blot.BlotBot 3.61 | 4.2 | 10.7% | 12 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 9.8% | 2 |
| ahr.ice.Ice 1.0.2 | 6.0 | 8.5% | 4 |
| amk.ChumbaWumba 0.3 | 6.3 | 7.8% | 0 |
| matt.advanced.Katana 1.0 | 8.0 | 6.7% | 1 |
| stelo.Lifestealer 1.0 | 9.3 | 5.8% | 1 |
| stelo.PianistNano 1.2 | 9.7 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 91.7 | 23 / 35 | 4640 |
| 2 | 1 | 69.6 | 92.4 | 28 / 35 | 4509 |
| 3 | 1 | 69.2 | 90.8 | 23 / 35 | 4645 |
| 4 | 1 | 67.6 | 85.4 | 23 / 35 | 4215 |
| 5 | 1 | 71.1 | 95.9 | 29 / 35 | 4742 |
| 6 | 1 | 68.4 | 88.6 | 23 / 35 | 4578 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 66 | 86% |
| uji.Antique 1.0 | 56 | 93% |
| ahr.ice.Ice 1.0.2 | 13 | 77% |
| pfvicm.Sobieski 7.2.3b | 13 | 100% |
| qohnil.blot.BlotBot 3.61 | 12 | 83% |
| amk.ChumbaWumba 0.3 | 5 | 100% |
| matt.advanced.Katana 1.0 | 3 | 67% |

Hadur died in 62 of 210 rounds, at a mean tick of 676. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 18 | 29% | 32 |
| kid.test.NightFox .2 | 16 | 26% | 58 |
| uji.Antique 1.0 | 10 | 16% | 53 |
| amk.ChumbaWumba 0.3 | 6 | 10% | 11 |
| ahr.ice.Ice 1.0.2 | 5 | 8% | 18 |
| qohnil.blot.BlotBot 3.61 | 4 | 6% | 23 |
| stelo.Lifestealer 1.0 | 3 | 5% | 4 |
| matt.advanced.Katana 1.0 | 0 | 0% | 8 |
| stelo.PianistNano 1.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 124290 melee ticks, 36600 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 75 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 41 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 41759 sent, 36881 reached their opponent, 5044 virtual hits (13.7% of those reached).

## Melee bench: F29

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1472803. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 120 over 6 battles (20.0 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 91.0 | 118 / 210 | 1.81 | 20.1% | 31572 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 20.1% | 118 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 15.4% | 43 |
| deewiant.Anomaly 0.2 | 2.7 | 14.7% | 39 |
| myl.micro.Troodon 1.10 | 4.2 | 11.6% | 6 |
| jok.PheonixM 0.1.2 | 4.8 | 10.2% | 3 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.5% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.2 | 6.4% | 0 |
| DBall.Anarchy 0.1 | 8.0 | 5.1% | 1 |
| ap.Frederick 1.1 | 9.2 | 4.2% | 0 |
| jangs.ns51 1.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 89.5 | 20 / 35 | 5431 |
| 2 | 1 | 69.3 | 87.6 | 15 / 35 | 5158 |
| 3 | 1 | 72.2 | 95.6 | 23 / 35 | 5320 |
| 4 | 1 | 72.0 | 94.6 | 25 / 35 | 5389 |
| 5 | 1 | 69.6 | 87.3 | 15 / 35 | 5111 |
| 6 | 1 | 70.8 | 91.1 | 20 / 35 | 5163 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 66 | 62% |
| zyx.mega.YersiniaPestis 3.1 | 63 | 56% |
| myl.micro.Troodon 1.10 | 25 | 96% |
| jok.PheonixM 0.1.2 | 16 | 94% |
| DBall.Anarchy 0.1 | 2 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 1082. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 39 | 41% | 85 |
| zyx.mega.YersiniaPestis 3.1 | 39 | 41% | 74 |
| myl.micro.Troodon 1.10 | 9 | 10% | 27 |
| jok.PheonixM 0.1.2 | 4 | 4% | 17 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 1 |
| DBall.Anarchy 0.1 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 167943 melee ticks, 55310 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 38 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 52121 sent, 47212 reached their opponent, 6733 virtual hits (14.3% of those reached).

## Melee bench: F30

hadur117.Hadur 3.21z4 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1490337. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 145 over 6 battles (24.2 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 78.3 | 68 / 210 | 2.74 | 18.0% | 25852 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.2 | 18.0% | 68 |
| darkcanuck.B26354 1.06 | 2.2 | 15.7% | 59 |
| stelo.PastFuture 2.3.2 | 3.0 | 14.7% | 33 |
| oog.melee.Capulet 1.2 | 3.7 | 14.2% | 30 |
| intruder.PrairieWolf 2.61 | 5.3 | 10.2% | 9 |
| tripphippy.Alice 1.1 | 6.0 | 9.4% | 9 |
| ntc.Opposite 1.5 | 7.2 | 7.8% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 7.5 | 7.0% | 2 |
| GarmBox.Anger 1.0 | 9.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 87.1 | 14 / 35 | 4453 |
| 2 | 1 | 64.9 | 78.6 | 12 / 35 | 4224 |
| 3 | 1 | 66.6 | 82.5 | 14 / 35 | 4519 |
| 4 | 1 | 64.9 | 75.7 | 11 / 35 | 4340 |
| 5 | 1 | 62.8 | 72.1 | 9 / 35 | 4065 |
| 6 | 2 | 63.6 | 73.6 | 8 / 35 | 4251 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 44 | 36% |
| oog.melee.Capulet 1.2 | 33 | 61% |
| stelo.PastFuture 2.3.2 | 25 | 56% |
| intruder.PrairieWolf 2.61 | 12 | 83% |
| tripphippy.Alice 1.1 | 7 | 86% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 51 | 36% | 63 |
| stelo.PastFuture 2.3.2 | 34 | 24% | 49 |
| oog.melee.Capulet 1.2 | 26 | 18% | 45 |
| fowl3628800.LightningBolt 2.6.0 | 9 | 6% | 11 |
| tripphippy.Alice 1.1 | 8 | 6% | 16 |
| intruder.PrairieWolf 2.61 | 8 | 6% | 16 |
| ntc.Opposite 1.5 | 7 | 5% | 9 |
| GarmBox.Anger 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 202 rounds): 150584 melee ticks, 35664 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 42 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 44306 sent, 39887 reached their opponent, 6656 virtual hits (16.7% of those reached).

## Melee bench: F31

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1475641. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 133 over 6 battles (22.2 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 79.6 | 54 / 210 | 2.84 | 16.1% | 24373 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.4% | 99 |
| hadur117.Hadur 3.21z4 | 2.0 | 16.1% | 54 |
| gh.mini.Griezel 0.2 | 3.0 | 13.6% | 42 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.8% | 10 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 10.9% | 6 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.4% | 2 |
| timmit.nano.TimDog 0.33 | 7.0 | 6.7% | 0 |
| fm.mammillarias 1.3 | 8.3 | 4.8% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 4.9% | 0 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 81.6 | 11 / 35 | 4291 |
| 2 | 2 | 67.0 | 83.8 | 12 / 35 | 4307 |
| 3 | 2 | 63.9 | 75.9 | 5 / 35 | 3993 |
| 4 | 2 | 64.1 | 78.1 | 10 / 35 | 3752 |
| 5 | 2 | 65.2 | 78.1 | 7 / 35 | 4379 |
| 6 | 2 | 64.8 | 80.0 | 9 / 35 | 3651 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 56 | 38% |
| gh.mini.Griezel 0.2 | 37 | 54% |
| d414.nano.Quantum 1.0.0 | 11 | 73% |
| spinnercat.micro.Tyger 0.1 | 6 | 50% |
| gh.nano.Grofvuil 0.2 | 2 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 72 | 46% | 89 |
| gh.mini.Griezel 0.2 | 41 | 26% | 61 |
| spinnercat.micro.Tyger 0.1 | 15 | 10% | 20 |
| d414.nano.Quantum 1.0.0 | 14 | 9% | 21 |
| timmit.nano.TimDog 0.33 | 6 | 4% | 7 |
| gh.nano.Grofvuil 0.2 | 6 | 4% | 7 |
| fm.mammillarias 1.3 | 1 | 1% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 1 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 153847 melee ticks, 32872 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 34 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 47785 sent, 42728 reached their opponent, 6396 virtual hits (15.0% of those reached).

## Melee bench: F32

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488969. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 186 over 6 battles (31.0 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 90.5 | 133 / 210 | 1.85 | 19.3% | 29830 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 19.3% | 133 |
| kawigi.sbf.FloodHT 0.9.2 | 2.3 | 13.9% | 41 |
| apc.botM 3.0 | 3.0 | 11.9% | 19 |
| lxx.ConceptA 0.8 | 4.2 | 10.8% | 1 |
| vjik.UnViolation 1.1 | 5.0 | 9.5% | 8 |
| bayen.UbaMicro 1.4 | 5.5 | 9.3% | 4 |
| yk.JahMicro 1.0 | 7.7 | 7.2% | 4 |
| panzer.Panzer 0.2 | 7.7 | 7.0% | 0 |
| conscience.Electron 1.3g | 8.7 | 6.4% | 0 |
| donjezza.Jezza 1.0 | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 92.4 | 22 / 35 | 5090 |
| 2 | 1 | 69.1 | 91.7 | 22 / 35 | 4962 |
| 3 | 1 | 69.2 | 92.4 | 22 / 35 | 4963 |
| 4 | 1 | 70.0 | 91.1 | 26 / 35 | 5379 |
| 5 | 1 | 67.4 | 86.0 | 21 / 35 | 4657 |
| 6 | 1 | 68.5 | 89.5 | 20 / 35 | 4779 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 77 | 65% |
| apc.botM 3.0 | 46 | 74% |
| vjik.UnViolation 1.1 | 15 | 80% |
| lxx.ConceptA 0.8 | 14 | 100% |
| bayen.UbaMicro 1.4 | 9 | 78% |
| yk.JahMicro 1.0 | 8 | 88% |
| donjezza.Jezza 1.0 | 6 | 83% |
| panzer.Panzer 0.2 | 4 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 32 | 41% | 77 |
| apc.botM 3.0 | 14 | 18% | 47 |
| lxx.ConceptA 0.8 | 9 | 12% | 25 |
| vjik.UnViolation 1.1 | 8 | 10% | 28 |
| bayen.UbaMicro 1.4 | 7 | 9% | 17 |
| conscience.Electron 1.3g | 3 | 4% | 5 |
| panzer.Panzer 0.2 | 2 | 3% | 3 |
| donjezza.Jezza 1.0 | 1 | 1% | 4 |
| yk.JahMicro 1.0 | 1 | 1% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 117202 melee ticks, 55874 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 48 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 39848 sent, 34832 reached their opponent, 5900 virtual hits (16.9% of those reached).

## Melee bench: F33

hadur117.Hadur 3.21z4 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478307. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 156 over 6 battles (26.0 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 88.9 | 125 / 210 | 1.89 | 21.9% | 29907 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 21.9% | 125 |
| maribo.Quester 0.3 | 2.2 | 17.2% | 25 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 14.7% | 31 |
| labg.Cataclysm 2.05 | 4.2 | 12.2% | 17 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.3 | 10.1% | 8 |
| baal.nano.N 1.42 | 5.5 | 10.2% | 3 |
| zyx.micro.Ant 1.1 | 7.2 | 6.2% | 0 |
| sanja.First 0.1 | 7.8 | 4.6% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.0 | 2.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 90.4 | 24 / 35 | 5308 |
| 2 | 1 | 69.4 | 86.1 | 18 / 35 | 4597 |
| 3 | 1 | 71.6 | 90.0 | 23 / 35 | 5018 |
| 4 | 1 | 71.4 | 92.5 | 22 / 35 | 5057 |
| 5 | 1 | 70.1 | 86.8 | 19 / 35 | 4871 |
| 6 | 1 | 70.6 | 87.9 | 19 / 35 | 5056 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 78 | 83% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 47 | 70% |
| labg.Cataclysm 2.05 | 19 | 68% |
| baal.nano.N 1.42 | 8 | 88% |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 1026. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 35 | 40% | 89 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 23% | 55 |
| labg.Cataclysm 2.05 | 12 | 14% | 29 |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 10% | 14 |
| baal.nano.N 1.42 | 7 | 8% | 16 |
| sanja.First 0.1 | 2 | 2% | 3 |
| zyx.micro.Ant 1.1 | 2 | 2% | 3 |

Posture (Hadur's M records, 200 rounds): 165775 melee ticks, 49319 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 56 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 47177 sent, 42864 reached their opponent, 5983 virtual hits (14.0% of those reached).

## Melee bench: F34

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1494954. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 147 over 6 battles (24.5 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 88.7 | 103 / 210 | 2.01 | 19.2% | 33334 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 19.2% | 103 |
| stelo.Spread 0.9 | 2.5 | 16.0% | 49 |
| kid.Gladiator .7.2 | 2.5 | 16.2% | 35 |
| jcs.Seth 1.8 | 4.3 | 10.7% | 19 |
| tcf.Reach 3 | 4.7 | 10.9% | 4 |
| cli.Dancer 1.1 | 6.0 | 9.0% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 6.9% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.9% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.5% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 91.4 | 17 / 35 | 5640 |
| 2 | 1 | 69.9 | 87.9 | 18 / 35 | 5597 |
| 3 | 1 | 68.3 | 82.9 | 14 / 35 | 5118 |
| 4 | 1 | 70.4 | 89.5 | 17 / 35 | 5643 |
| 5 | 1 | 71.2 | 91.7 | 18 / 35 | 5869 |
| 6 | 1 | 70.0 | 88.9 | 19 / 35 | 5467 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 69 | 61% |
| kid.Gladiator .7.2 | 61 | 67% |
| jcs.Seth 1.8 | 18 | 50% |
| cli.Dancer 1.1 | 5 | 100% |
| tcf.Reach 3 | 4 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 1068. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 39 | 36% | 71 |
| stelo.Spread 0.9 | 38 | 36% | 81 |
| jcs.Seth 1.8 | 18 | 17% | 29 |
| tcf.Reach 3 | 9 | 8% | 17 |
| ratosh.Wesco 1.4 | 2 | 2% | 3 |
| cli.Dancer 1.1 | 1 | 1% | 8 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 162617 melee ticks, 54790 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 34 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 49173 sent, 44290 reached their opponent, 6867 virtual hits (15.5% of those reached).

## Melee bench: F35

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1480191. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 121 over 6 battles (20.2 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 84.2 | 47 / 210 | 2.42 | 16.7% | 25165 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 18.9% | 127 |
| hadur117.Hadur 3.21z4 | 2.0 | 16.7% | 47 |
| gh.mini.Gruwel 0.9 | 3.3 | 13.0% | 18 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.8 | 12.4% | 15 |
| rz.HawkOnFire 0.1 | 4.8 | 11.8% | 3 |
| wit.Chuliath 1.0 | 6.2 | 6.9% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.2 | 5.4% | 0 |
| dans.Cinnamon 1.2 | 8.2 | 5.3% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.8 | 5.2% | 1 |
| stelo.MyAgileRobot 0.2 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 83.8 | 6 / 35 | 4044 |
| 2 | 2 | 65.1 | 80.3 | 7 / 35 | 4096 |
| 3 | 2 | 66.9 | 87.0 | 7 / 35 | 4260 |
| 4 | 2 | 65.8 | 80.0 | 8 / 35 | 4358 |
| 5 | 2 | 67.4 | 87.9 | 8 / 35 | 4270 |
| 6 | 2 | 66.8 | 86.0 | 11 / 35 | 4137 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 104 | 23% |
| gh.mini.Gruwel 0.9 | 21 | 38% |
| dmh.robocode.robot.BlackDeath 9.2 | 12 | 58% |
| rz.HawkOnFire 0.1 | 10 | 80% |

Hadur died in 164 of 210 rounds, at a mean tick of 1005. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 99 | 60% | 124 |
| gh.mini.Gruwel 0.9 | 25 | 15% | 32 |
| dmh.robocode.robot.BlackDeath 9.2 | 17 | 10% | 26 |
| rz.HawkOnFire 0.1 | 14 | 9% | 18 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 2% | 3 |
| wit.Chuliath 1.0 | 2 | 1% | 2 |
| dans.Cinnamon 1.2 | 2 | 1% | 1 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 144773 melee ticks, 55147 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 40 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 43414 sent, 38440 reached their opponent, 5577 virtual hits (14.5% of those reached).

## Melee bench: F36

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1490393. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 210 over 6 battles (35.0 per battle, most in one battle 44). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 90.8 | 146 / 210 | 1.82 | 20.8% | 34896 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 20.8% | 146 |
| alpha.RainingFire 1.0 | 2.5 | 12.8% | 17 |
| bzdp.Pansy 2.1 | 3.0 | 12.4% | 12 |
| mz.Cork 0.1 | 4.7 | 11.0% | 16 |
| bvh.micro.Freya 0.3 | 4.8 | 10.4% | 12 |
| bvh.mini.Fenrir 0.39 | 5.7 | 9.6% | 3 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.5% | 4 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 5.6% | 0 |
| dl.BetterWalls 1.0 | 9.0 | 4.8% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 91.4 | 26 / 35 | 5979 |
| 2 | 1 | 71.4 | 92.7 | 26 / 35 | 5611 |
| 3 | 1 | 71.8 | 92.1 | 26 / 35 | 5875 |
| 4 | 1 | 71.0 | 91.1 | 22 / 35 | 5943 |
| 5 | 1 | 69.7 | 87.0 | 21 / 35 | 5436 |
| 6 | 1 | 71.5 | 90.8 | 25 / 35 | 6052 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 41 | 88% |
| mz.Cork 0.1 | 35 | 74% |
| bvh.micro.Freya 0.3 | 31 | 94% |
| alpha.RainingFire 1.0 | 29 | 76% |
| bvh.mini.Fenrir 0.39 | 15 | 100% |
| m3thos.Eva02 0.7.1 | 15 | 93% |
| sample.MyFirstRobot 1.0 | 3 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 17 | 26% | 47 |
| mz.Cork 0.1 | 13 | 20% | 37 |
| bvh.mini.Fenrir 0.39 | 12 | 18% | 25 |
| bzdp.Pansy 2.1 | 8 | 12% | 47 |
| bvh.micro.Freya 0.3 | 8 | 12% | 21 |
| m3thos.Eva02 0.7.1 | 4 | 6% | 19 |
| squidM.TentalceMeleeNano 1.1 | 3 | 5% | 7 |
| dl.BetterWalls 1.0 | 0 | 0% | 6 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 197 rounds): 137677 melee ticks, 43546 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (197 rounds): longest scan gap while four or more were alive 40 ticks (197 rounds over 8); rounds whose longest gap at any count was over 8: 197; robots dropped as dead without a death event: 0.

Targeting waves (197 rounds): 46405 sent, 41734 reached their opponent, 8245 virtual hits (19.8% of those reached).

## Melee bench: F37

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1484943. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 227 over 6 battles (37.8 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.7 | 164 / 210 | 1.92 | 19.9% | 36028 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 19.9% | 164 |
| agrach.Dalek 1.0 | 3.2 | 10.3% | 10 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.5 | 10.1% | 9 |
| germ.TheMind .2 | 4.0 | 9.7% | 3 |
| EBBU.Sim2 1.02 | 4.7 | 9.8% | 4 |
| lmk.ACPFinal 0.1 | 6.8 | 8.3% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 6.8 | 8.2% | 0 |
| mb.Beast 0.1 | 7.8 | 8.2% | 9 |
| stelo.UntouchableNano 1.3 | 7.8 | 8.1% | 7 |
| skm.Ryubot 1.0 | 9.3 | 7.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 89.5 | 28 / 35 | 5863 |
| 2 | 1 | 69.4 | 90.2 | 28 / 35 | 5829 |
| 3 | 1 | 70.6 | 94.0 | 30 / 35 | 6379 |
| 4 | 1 | 68.9 | 87.9 | 26 / 35 | 6255 |
| 5 | 1 | 70.0 | 91.1 | 28 / 35 | 6178 |
| 6 | 1 | 67.4 | 85.7 | 24 / 35 | 5524 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 37 | 100% |
| germ.TheMind .2 | 24 | 100% |
| stelo.UntouchableNano 1.3 | 21 | 86% |
| lmk.ACPFinal 0.1 | 20 | 100% |
| mb.Beast 0.1 | 20 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 19 | 95% |
| skm.Ryubot 1.0 | 15 | 93% |
| EBBU.Sim2 1.02 | 12 | 92% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 46 of 210 rounds, at a mean tick of 412. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 12 | 26% | 18 |
| lmk.ACPFinal 0.1 | 8 | 17% | 26 |
| agrach.Dalek 1.0 | 7 | 15% | 50 |
| com.syncleus.robocode.Dreadnaught 0.1 | 7 | 15% | 26 |
| mb.Beast 0.1 | 6 | 13% | 25 |
| stelo.UntouchableNano 1.3 | 4 | 9% | 22 |
| EBBU.Sim2 1.02 | 2 | 4% | 19 |
| germ.TheMind .2 | 0 | 0% | 16 |
| skm.Ryubot 1.0 | 0 | 0% | 6 |

Posture (Hadur's M records, 199 rounds): 95099 melee ticks, 25143 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 42 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 31175 sent, 26597 reached their opponent, 7466 virtual hits (28.1% of those reached).

## Melee bench: F38

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1477379. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 129 over 6 battles (21.5 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 89.6 | 122 / 210 | 1.94 | 19.2% | 29974 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 19.2% | 122 |
| justin.Mallais 14.0 | 2.0 | 15.8% | 52 |
| bvh.mini.Freya 0.55 | 3.3 | 12.1% | 11 |
| bts.mega.Gnarly 1.4 | 4.5 | 11.1% | 17 |
| cs.Wren 1.0 | 4.5 | 10.7% | 4 |
| kdf.KoulDestroyer 1.0 | 5.8 | 9.4% | 3 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.2 | 7.7% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.7 | 6.6% | 0 |
| matt.UnderDark3 2.4.34 | 9.3 | 3.9% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 89.8 | 20 / 35 | 4710 |
| 2 | 1 | 69.4 | 90.5 | 21 / 35 | 5042 |
| 3 | 1 | 66.7 | 82.9 | 15 / 35 | 4533 |
| 4 | 1 | 69.7 | 91.1 | 21 / 35 | 4900 |
| 5 | 1 | 69.8 | 89.5 | 21 / 35 | 5087 |
| 6 | 1 | 71.6 | 93.7 | 24 / 35 | 5702 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 83 | 71% |
| bvh.mini.Freya 0.55 | 29 | 76% |
| bts.mega.Gnarly 1.4 | 28 | 64% |
| cs.Wren 1.0 | 18 | 89% |
| kdf.KoulDestroyer 1.0 | 5 | 80% |
| davidalves.net.DuelistNanoMelee 1.01 | 2 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 809. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 36 | 41% | 87 |
| bts.mega.Gnarly 1.4 | 18 | 20% | 41 |
| bvh.mini.Freya 0.55 | 17 | 19% | 30 |
| cs.Wren 1.0 | 6 | 7% | 23 |
| kdf.KoulDestroyer 1.0 | 4 | 5% | 11 |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 5% | 8 |
| matt.UnderDark3 2.4.34 | 2 | 2% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 5 |

Posture (Hadur's M records, 199 rounds): 136670 melee ticks, 42536 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 34 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 43391 sent, 38276 reached their opponent, 7635 virtual hits (19.9% of those reached).

## Melee bench: F39

hadur117.Hadur 3.21z4 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1483737. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 153 over 6 battles (25.5 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 92.3 | 136 / 210 | 1.62 | 22.7% | 35501 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 22.7% | 136 |
| bvh.fry.Freya 0.82 | 2.0 | 16.5% | 19 |
| az.Ololobot 0.2.4 | 3.0 | 14.4% | 50 |
| winamp32.micro.MicroMacro 1.0 | 4.5 | 9.6% | 1 |
| gimp.GimpBot 0.1 | 5.2 | 8.9% | 0 |
| apollokidd.ApolloKidd 0.9 | 5.7 | 8.5% | 2 |
| stelo.SoRobotNanoMelee 1.2 | 6.7 | 7.9% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.5 | 6.0% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 94.6 | 27 / 35 | 5653 |
| 2 | 1 | 71.1 | 92.9 | 21 / 35 | 5982 |
| 3 | 1 | 70.9 | 91.8 | 21 / 35 | 5914 |
| 4 | 1 | 69.4 | 88.6 | 17 / 35 | 5619 |
| 5 | 1 | 70.2 | 89.3 | 23 / 35 | 5809 |
| 6 | 1 | 72.9 | 96.4 | 27 / 35 | 6524 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 84 | 58% |
| bvh.fry.Freya 0.82 | 70 | 91% |
| winamp32.micro.MicroMacro 1.0 | 10 | 90% |
| stelo.SoRobotNanoMelee 1.2 | 6 | 100% |
| gimp.GimpBot 0.1 | 4 | 100% |
| apollokidd.ApolloKidd 0.9 | 4 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 1167. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 37 | 48% | 94 |
| bvh.fry.Freya 0.82 | 28 | 36% | 70 |
| stelo.SoRobotNanoMelee 1.2 | 6 | 8% | 11 |
| winamp32.micro.MicroMacro 1.0 | 2 | 3% | 12 |
| apollokidd.ApolloKidd 0.9 | 2 | 3% | 6 |
| gimp.GimpBot 0.1 | 1 | 1% | 9 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 3 |

Posture (Hadur's M records, 200 rounds): 155872 melee ticks, 71917 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 64 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 45193 sent, 40706 reached their opponent, 7099 virtual hits (17.4% of those reached).

## Melee bench: F40

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1476982. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 161 over 6 battles (26.8 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 89.4 | 138 / 210 | 1.95 | 20.3% | 33239 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 20.3% | 138 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.9% | 32 |
| kano.gamma.KanoGamma 1.8 | 3.3 | 12.9% | 14 |
| mz.AntiGrav 1.0 | 4.2 | 11.4% | 7 |
| Polkwane.SmashMelee 1.0 | 4.7 | 10.5% | 10 |
| alpha.BlackIce 1.0 | 6.3 | 8.9% | 1 |
| stelo.Randomness 1.0 | 6.5 | 8.7% | 8 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 5.7% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 3.9% | 0 |
| sample.Corners 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 86.0 | 20 / 35 | 5305 |
| 2 | 1 | 72.5 | 92.7 | 26 / 35 | 6089 |
| 3 | 1 | 72.4 | 93.0 | 27 / 35 | 5865 |
| 4 | 1 | 69.1 | 85.1 | 18 / 35 | 5158 |
| 5 | 1 | 72.0 | 94.3 | 27 / 35 | 5739 |
| 6 | 1 | 69.4 | 85.4 | 20 / 35 | 5083 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 66 | 82% |
| kano.gamma.KanoGamma 1.8 | 39 | 90% |
| mz.AntiGrav 1.0 | 20 | 95% |
| Polkwane.SmashMelee 1.0 | 17 | 100% |
| stelo.Randomness 1.0 | 10 | 50% |
| alpha.BlackIce 1.0 | 5 | 80% |
| testantiswapgun.AntiSwap 1.0 | 2 | 100% |
| amk.superstrike.SuperStrike 0.3 | 2 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 769. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 22 | 30% | 61 |
| kano.gamma.KanoGamma 1.8 | 15 | 21% | 59 |
| stelo.Randomness 1.0 | 11 | 15% | 23 |
| Polkwane.SmashMelee 1.0 | 8 | 11% | 28 |
| mz.AntiGrav 1.0 | 8 | 11% | 19 |
| alpha.BlackIce 1.0 | 5 | 7% | 10 |
| amk.superstrike.SuperStrike 0.3 | 4 | 5% | 6 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 200 rounds): 147231 melee ticks, 39232 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 103 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 103 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 46513 sent, 41579 reached their opponent, 8103 virtual hits (19.5% of those reached).

## Melee bench: F41

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1484597. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 127 over 6 battles (21.2 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 87.5 | 98 / 210 | 2.12 | 18.5% | 28724 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 18.5% | 98 |
| eem.EvBotNG v12.8 | 2.0 | 16.4% | 78 |
| ary.Swarm 1.1 | 3.3 | 12.8% | 9 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.6% | 10 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.5% | 10 |
| shrub.Silver v048 | 6.0 | 8.8% | 1 |
| zyx.nano.Ant 1.1 | 7.2 | 7.1% | 0 |
| stelo.Mirror 1.1 | 7.8 | 6.0% | 3 |
| jsal.Jsalbot 1.0 | 9.0 | 5.0% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 91.4 | 17 / 35 | 5066 |
| 2 | 1 | 69.1 | 89.5 | 19 / 35 | 4633 |
| 3 | 1 | 69.5 | 88.9 | 19 / 35 | 4941 |
| 4 | 1 | 67.1 | 84.1 | 13 / 35 | 4647 |
| 5 | 1 | 67.6 | 83.8 | 13 / 35 | 4582 |
| 6 | 1 | 69.0 | 87.3 | 17 / 35 | 4855 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 87 | 44% |
| lessonz.robocode.Oz 0.5.0 | 32 | 81% |
| ary.Swarm 1.1 | 24 | 92% |
| simonton.nano.MeleeSeed 1.8 | 10 | 90% |
| shrub.Silver v048 | 3 | 100% |
| jsal.Jsalbot 1.0 | 1 | 0% |
| stelo.Mirror 1.1 | 1 | 0% |

Hadur died in 112 of 210 rounds, at a mean tick of 986. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 66 | 59% | 99 |
| lessonz.robocode.Oz 0.5.0 | 18 | 16% | 36 |
| ary.Swarm 1.1 | 15 | 13% | 37 |
| simonton.nano.MeleeSeed 1.8 | 9 | 8% | 19 |
| shrub.Silver v048 | 1 | 1% | 11 |
| stelo.Mirror 1.1 | 1 | 1% | 5 |
| jsal.Jsalbot 1.0 | 1 | 1% | 1 |
| zyx.nano.Ant 1.1 | 1 | 1% | 1 |
| acogdev.alpha 0.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 151799 melee ticks, 48255 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 72 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 48303 sent, 43249 reached their opponent, 6286 virtual hits (14.5% of those reached).

## Melee bench: F42

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478778. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 138 over 6 battles (23.0 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 92.9 | 147 / 210 | 1.64 | 21.1% | 38244 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 21.1% | 147 |
| wompi.Wallaby 5.1 | 2.0 | 15.2% | 32 |
| maribo.mini.MiniQuester 0.1 | 3.2 | 13.3% | 11 |
| ara.Shera 0.88 | 3.8 | 12.4% | 17 |
| amz.NanoClone 1.41 | 5.0 | 9.5% | 1 |
| dsw.StaticD 1.0 | 6.3 | 6.6% | 3 |
| maribo.IotaCT 1.1 | 7.5 | 6.3% | 0 |
| stelo.MirrorMicro 1.0 | 7.5 | 6.3% | 0 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.1% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 88.9 | 22 / 35 | 6095 |
| 2 | 1 | 72.5 | 94.9 | 27 / 35 | 6498 |
| 3 | 1 | 71.4 | 91.1 | 23 / 35 | 6521 |
| 4 | 1 | 72.5 | 94.9 | 27 / 35 | 6594 |
| 5 | 1 | 71.7 | 93.7 | 22 / 35 | 6370 |
| 6 | 1 | 71.6 | 94.0 | 26 / 35 | 6166 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 92 | 83% |
| maribo.mini.MiniQuester 0.1 | 49 | 94% |
| ara.Shera 0.88 | 26 | 73% |
| amz.NanoClone 1.41 | 4 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |
| dsw.StaticD 1.0 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 1008. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 28 | 43% | 94 |
| ara.Shera 0.88 | 17 | 26% | 43 |
| maribo.mini.MiniQuester 0.1 | 13 | 20% | 57 |
| maribo.IotaCT 1.1 | 2 | 3% | 2 |
| mme.NikeEnhanced 2.0 | 2 | 3% | 2 |
| amz.NanoClone 1.41 | 1 | 2% | 6 |
| dsw.StaticD 1.0 | 1 | 2% | 4 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 158743 melee ticks, 51709 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 33 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 48519 sent, 43757 reached their opponent, 7960 virtual hits (18.2% of those reached).

## Melee bench: F43

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1485132. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 112 over 6 battles (18.7 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 81.7 | 44 / 210 | 2.65 | 16.8% | 27778 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.3% | 142 |
| hadur117.Hadur 3.21z4 | 2.0 | 16.8% | 44 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.2% | 15 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.7% | 5 |
| wcsv.melee.EngineerMelee 0.1 | 5.2 | 10.4% | 3 |
| Krabb.akim2.Akim2 1.1b | 5.7 | 9.6% | 1 |
| jab.DiamondStealer 5 | 7.2 | 7.7% | 1 |
| mz.NanoGod 2.02 | 7.8 | 7.6% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.5% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.3 | 84.8 | 8 / 35 | 5008 |
| 2 | 2 | 68.7 | 83.8 | 12 / 35 | 4818 |
| 3 | 2 | 67.4 | 81.0 | 6 / 35 | 4790 |
| 4 | 2 | 66.2 | 79.7 | 6 / 35 | 4317 |
| 5 | 2 | 66.1 | 78.7 | 6 / 35 | 4471 |
| 6 | 2 | 67.2 | 82.2 | 6 / 35 | 4374 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 90 | 22% |
| brainfade.melee.Dusk 0.44 | 17 | 65% |
| dummy.micro.Sparrow 2.5 | 14 | 79% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 50% |
| Krabb.akim2.Akim2 1.1b | 1 | 0% |

Hadur died in 167 of 210 rounds, at a mean tick of 976. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 100 | 60% | 120 |
| brainfade.melee.Dusk 0.44 | 26 | 16% | 39 |
| dummy.micro.Sparrow 2.5 | 20 | 12% | 26 |
| wcsv.melee.EngineerMelee 0.1 | 9 | 5% | 12 |
| mz.NanoGod 2.02 | 5 | 3% | 5 |
| Krabb.akim2.Akim2 1.1b | 4 | 2% | 5 |
| jab.DiamondStealer 5 | 2 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 149258 melee ticks, 52739 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 26 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 46504 sent, 41508 reached their opponent, 6609 virtual hits (15.9% of those reached).

## Melee bench: F44

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1479793. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 141 over 6 battles (23.5 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 95.3 | 159 / 210 | 1.42 | 22.2% | 39330 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 22.2% | 159 |
| stelo.Liblix 0.3.1 | 2.2 | 15.2% | 41 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.0% | 7 |
| jwirde.Gort 2.0 | 4.3 | 9.3% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.0 | 9.0% | 0 |
| disan.Chair 2.2.0 | 6.7 | 7.2% | 0 |
| wompi.Quokka 1.6 | 6.8 | 7.1% | 0 |
| stf.PanzerGeneral 0.1 | 7.2 | 6.8% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 4.7% | 0 |
| sample.Crazy 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 95.6 | 28 / 35 | 6676 |
| 2 | 1 | 73.6 | 97.1 | 28 / 35 | 6809 |
| 3 | 1 | 73.5 | 97.5 | 28 / 35 | 6572 |
| 4 | 1 | 72.6 | 95.2 | 26 / 35 | 6441 |
| 5 | 1 | 71.7 | 91.7 | 24 / 35 | 6206 |
| 6 | 1 | 72.9 | 94.9 | 25 / 35 | 6626 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tzu.TheArtOfWar 1.2 | 85 | 93% |
| stelo.Liblix 0.3.1 | 81 | 70% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 9 | 100% |
| jwirde.Gort 2.0 | 8 | 75% |
| disan.Chair 2.2.0 | 5 | 100% |
| sample.Crazy 1.0 | 1 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 983. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 33 | 63% | 96 |
| tzu.TheArtOfWar 1.2 | 10 | 19% | 74 |
| jwirde.Gort 2.0 | 5 | 10% | 14 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 6% | 10 |
| disan.Chair 2.2.0 | 0 | 0% | 5 |
| wompi.Quokka 1.6 | 0 | 0% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 3 |
| stf.PanzerGeneral 0.1 | 0 | 0% | 3 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 147621 melee ticks, 52282 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 50 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 49504 sent, 44766 reached their opponent, 8839 virtual hits (19.7% of those reached).

## Melee bench: F45

hadur117.Hadur 3.21z4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1477722. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 165 over 6 battles (27.5 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 88.6 | 113 / 210 | 2.03 | 20.2% | 35305 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 20.2% | 113 |
| jje.BagPuss 1.2 | 2.7 | 12.2% | 11 |
| eem.IWillFireNoBullet v2.8 | 3.5 | 11.5% | 70 |
| myl.nano.Graviton 1.10 | 3.8 | 11.1% | 1 |
| sul.Lunar 1.1 | 4.0 | 10.8% | 8 |
| hvilela.HVilela 0.9 | 6.7 | 8.7% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 6.8 | 8.4% | 2 |
| fm.claire 1.7 | 7.5 | 7.9% | 0 |
| wit.Deep7 2.0 | 9.2 | 5.3% | 5 |
| abud.ThirdRobo 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 87.3 | 19 / 35 | 6226 |
| 2 | 1 | 71.9 | 91.7 | 23 / 35 | 6454 |
| 3 | 1 | 69.5 | 88.6 | 17 / 35 | 5487 |
| 4 | 1 | 70.1 | 86.0 | 18 / 35 | 6066 |
| 5 | 1 | 69.7 | 88.9 | 18 / 35 | 5548 |
| 6 | 1 | 69.6 | 88.9 | 18 / 35 | 5524 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 70 | 51% |
| jje.BagPuss 1.2 | 27 | 81% |
| sul.Lunar 1.1 | 21 | 86% |
| myl.nano.Graviton 1.10 | 17 | 94% |
| pez.mini.ChironexFleckeri 0.5 | 11 | 100% |
| wit.Deep7 2.0 | 6 | 83% |
| hvilela.HVilela 0.9 | 3 | 100% |
| fm.claire 1.7 | 2 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 1572. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 39 | 40% | 0 |
| jje.BagPuss 1.2 | 21 | 22% | 54 |
| sul.Lunar 1.1 | 14 | 14% | 49 |
| hvilela.HVilela 0.9 | 8 | 8% | 23 |
| myl.nano.Graviton 1.10 | 5 | 5% | 37 |
| pez.mini.ChironexFleckeri 0.5 | 4 | 4% | 23 |
| wit.Deep7 2.0 | 4 | 4% | 12 |
| fm.claire 1.7 | 2 | 2% | 10 |
| abud.ThirdRobo 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 198694 melee ticks, 78331 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 63 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 58287 sent, 53463 reached their opponent, 7421 virtual hits (13.9% of those reached).

## Melee bench: F46

hadur117.Hadur 3.21z4 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1475534. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 110 over 6 battles (18.3 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 91.0 | 131 / 210 | 1.72 | 21.9% | 31511 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z4 | 1.0 | 21.9% | 131 |
| kc.mini.Mirage 0.2 | 2.0 | 19.0% | 63 |
| mz.MicroSheep 1.0 | 3.2 | 12.3% | 5 |
| cx.Princess 1.0 | 4.0 | 11.4% | 8 |
| sadoner.killer 0.2 | 4.8 | 10.7% | 1 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.6% | 1 |
| kurios.DOSexe .9a | 7.2 | 6.2% | 0 |
| jeremyreeder.collective.Prophet 5 | 7.5 | 6.6% | 1 |
| mbro.Detektor3 0.1.1 | 9.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 84.6 | 18 / 35 | 4639 |
| 2 | 1 | 71.0 | 91.8 | 21 / 35 | 5735 |
| 3 | 1 | 70.0 | 90.0 | 21 / 35 | 5321 |
| 4 | 1 | 70.1 | 89.6 | 19 / 35 | 5172 |
| 5 | 1 | 71.7 | 95.0 | 25 / 35 | 5346 |
| 6 | 1 | 72.0 | 95.0 | 27 / 35 | 5298 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 137 | 76% |
| cx.Princess 1.0 | 14 | 64% |
| mz.MicroSheep 1.0 | 13 | 85% |
| arthord.NanoSatanMelee Beta | 4 | 100% |
| sadoner.killer 0.2 | 3 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 49 | 62% | 149 |
| cx.Princess 1.0 | 13 | 16% | 20 |
| mz.MicroSheep 1.0 | 7 | 9% | 20 |
| sadoner.killer 0.2 | 7 | 9% | 11 |
| arthord.NanoSatanMelee Beta | 2 | 3% | 4 |
| kurios.DOSexe .9a | 1 | 1% | 2 |
| jeremyreeder.collective.Prophet 5 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 132734 melee ticks, 59017 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 22 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 22 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 37035 sent, 32683 reached their opponent, 5040 virtual hits (15.4% of those reached).

