# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1479862. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 169 over 6 battles (28.2 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 88.0 | 60 / 210 | 2.08 | 18.1% | 33153 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.2% | 132 |
| hadur117.Hadur 3.21bb | 2.0 | 18.1% | 60 |
| sgp.JollyNinja 3.53 | 3.5 | 11.1% | 9 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 11.0% | 3 |
| lorneswork.Predator 1.0 | 4.8 | 10.3% | 4 |
| mz.MicroGodMelee 1 | 5.7 | 9.5% | 2 |
| adt.Ar2 1.0 | 7.0 | 7.9% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.2% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.3% | 0 |
| mym.EdgeStalker 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.7 | 90.2 | 12 / 35 | 5223 |
| 2 | 2 | 68.3 | 88.3 | 9 / 35 | 5580 |
| 3 | 2 | 67.7 | 86.3 | 10 / 35 | 5320 |
| 4 | 2 | 69.3 | 88.9 | 14 / 35 | 5905 |
| 5 | 2 | 66.7 | 84.4 | 6 / 35 | 5309 |
| 6 | 2 | 69.0 | 90.2 | 9 / 35 | 5816 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 130 | 18% |
| sgp.JollyNinja 3.53 | 17 | 76% |
| mz.MicroGodMelee 1 | 11 | 91% |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 89% |
| lorneswork.Predator 1.0 | 5 | 60% |
| adt.Ar2 1.0 | 2 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 150 of 210 rounds, at a mean tick of 1238. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 120 | 80% | 146 |
| sgp.JollyNinja 3.53 | 11 | 7% | 16 |
| lorneswork.Predator 1.0 | 8 | 5% | 13 |
| mz.MicroGodMelee 1 | 5 | 3% | 16 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 3% | 10 |
| adt.Ar2 1.0 | 1 | 1% | 6 |
| skm.butterfly 1.0 | 0 | 0% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 136300 melee ticks, 99812 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 50 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 43647 sent, 38968 reached their opponent, 7660 virtual hits (19.7% of those reached).

## Melee bench: F02

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1514168. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 212 over 6 battles (35.3 per battle, most in one battle 49). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.9 | 103 / 210 | 2.27 | 18.9% | 31795 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 18.9% | 103 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 14.7% | 54 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.2 | 12.4% | 14 |
| lrem.micro.SpikeSoldier 0.4 | 3.8 | 11.3% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.3% | 17 |
| fnc.bandit.Bandit 5.2.0 | 6.7 | 8.4% | 0 |
| Noran.BitchingElk 0.054 | 7.0 | 8.1% | 11 |
| sch.Simone 0.3d | 7.3 | 7.9% | 7 |
| stelo.PatternRobot 1.0 | 9.3 | 4.5% | 3 |
| fullsail.SweetTea 1.1 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 89.5 | 17 / 35 | 4773 |
| 2 | 1 | 68.4 | 83.2 | 19 / 35 | 5457 |
| 3 | 1 | 69.0 | 85.7 | 18 / 35 | 5349 |
| 4 | 1 | 69.1 | 85.7 | 16 / 35 | 5514 |
| 5 | 1 | 68.8 | 87.3 | 17 / 35 | 5417 |
| 6 | 1 | 68.5 | 84.1 | 16 / 35 | 5285 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 57 | 49% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 32 | 81% |
| com.cohesiva.robocode.ManOwaR 1.0 | 25 | 60% |
| Noran.BitchingElk 0.054 | 14 | 71% |
| sch.Simone 0.3d | 13 | 69% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 92% |
| fnc.bandit.Bandit 5.2.0 | 3 | 100% |
| stelo.PatternRobot 1.0 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 990. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 42 | 39% | 70 |
| com.cohesiva.robocode.ManOwaR 1.0 | 15 | 14% | 30 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 14 | 13% | 43 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 11% | 19 |
| sch.Simone 0.3d | 10 | 9% | 20 |
| Noran.BitchingElk 0.054 | 8 | 7% | 17 |
| fnc.bandit.Bandit 5.2.0 | 5 | 5% | 9 |
| fullsail.SweetTea 1.1 | 2 | 2% | 2 |

Posture (Hadur's M records, 198 rounds): 161774 melee ticks, 43834 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 47 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 56949 sent, 52388 reached their opponent, 8734 virtual hits (16.7% of those reached).

## Melee bench: F03

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1505576. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 166 over 6 battles (27.7 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 93.8 | 174 / 210 | 1.56 | 21.2% | 39517 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.2% | 174 |
| radnor.DoctorBob 1.42 | 2.3 | 13.4% | 13 |
| kawigi.nano.Lib 1.0 | 3.2 | 12.7% | 7 |
| vuen.Cake 2.51 | 3.5 | 12.8% | 15 |
| urdos.URDOS 1.3 | 5.0 | 9.3% | 1 |
| adt.Ar1 2.1 | 6.5 | 7.4% | 0 |
| oa.weak.FlyMk1 0.1 | 7.0 | 6.9% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.7 | 6.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.3 | 5.1% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 97.5 | 32 / 35 | 6835 |
| 2 | 1 | 70.8 | 91.4 | 26 / 35 | 6570 |
| 3 | 1 | 71.8 | 94.0 | 32 / 35 | 6833 |
| 4 | 1 | 72.1 | 95.9 | 29 / 35 | 6404 |
| 5 | 1 | 70.6 | 91.1 | 27 / 35 | 6362 |
| 6 | 1 | 71.3 | 93.0 | 28 / 35 | 6513 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 67 | 87% |
| radnor.DoctorBob 1.42 | 66 | 97% |
| kawigi.nano.Lib 1.0 | 42 | 95% |
| oa.weak.FlyMk1 0.1 | 7 | 100% |
| urdos.URDOS 1.3 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 770. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 11 | 29% | 69 |
| radnor.DoctorBob 1.42 | 9 | 24% | 69 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 21% | 8 |
| kawigi.nano.Lib 1.0 | 5 | 13% | 37 |
| oa.weak.FlyMk1 0.1 | 2 | 5% | 12 |
| urdos.URDOS 1.3 | 2 | 5% | 8 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 3 |
| adt.Ar1 2.1 | 0 | 0% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 124765 melee ticks, 46799 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 41 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 37986 sent, 33425 reached their opponent, 8699 virtual hits (26.0% of those reached).

## Melee bench: F04

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1475239. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 106 over 6 battles (17.7 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.9 | 35 / 210 | 2.18 | 18.1% | 35433 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.2% | 158 |
| hadur117.Hadur 3.21bb | 2.0 | 18.1% | 35 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.2% | 12 |
| TNT.TNT 0.99.1 | 4.2 | 10.7% | 5 |
| josago.Jorgito 0.16 | 4.8 | 9.3% | 0 |
| css.Delitioner 0.11 | 6.3 | 7.5% | 0 |
| tj.zombie1n 1.0.1 | 6.8 | 6.5% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.7% | 0 |
| spin.Bugstard 0.012b | 9.3 | 3.6% | 0 |
| sp.Nanos.Ember 1.1 | 9.7 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 70.5 | 89.5 | 9 / 35 | 6370 |
| 2 | 2 | 69.8 | 87.9 | 8 / 35 | 6045 |
| 3 | 2 | 67.4 | 84.1 | 1 / 35 | 5620 |
| 4 | 2 | 68.9 | 86.0 | 6 / 35 | 5966 |
| 5 | 2 | 68.6 | 86.3 | 5 / 35 | 5841 |
| 6 | 2 | 68.7 | 87.3 | 6 / 35 | 5591 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 133 | 11% |
| apc.LeeroyJenkins2 1.0 | 17 | 65% |
| TNT.TNT 0.99.1 | 9 | 56% |
| tj.zombie1n 1.0.1 | 2 | 100% |
| css.Delitioner 0.11 | 1 | 100% |
| josago.Jorgito 0.16 | 1 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 1313. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 131 | 75% | 148 |
| apc.LeeroyJenkins2 1.0 | 22 | 13% | 32 |
| TNT.TNT 0.99.1 | 11 | 6% | 15 |
| josago.Jorgito 0.16 | 10 | 6% | 12 |
| css.Delitioner 0.11 | 1 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 186555 melee ticks, 75971 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 60 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 59 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 57544 sent, 53002 reached their opponent, 7954 virtual hits (15.0% of those reached).

## Melee bench: F05

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1475673. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 132 over 6 battles (22.0 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 78.7 | 27 / 210 | 2.92 | 15.3% | 24363 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.5 | 17.7% | 99 |
| justin.DemonicRage 3.4 | 1.5 | 17.1% | 61 |
| hadur117.Hadur 3.21bb | 3.0 | 15.3% | 27 |
| wompi.Numbat 2.1 | 4.0 | 12.5% | 15 |
| axeBots.HataMoto 3.09 | 5.3 | 9.3% | 7 |
| ms.Ares 0.19 | 5.7 | 8.8% | 1 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.3 | 5.8% | 0 |
| supersample.SuperBoxBot 1.0 | 7.7 | 5.5% | 0 |
| GarmBox.Oranges 1.0 | 9.2 | 4.3% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.5 | 78.1 | 5 / 35 | 3986 |
| 2 | 3 | 65.3 | 82.5 | 5 / 35 | 4197 |
| 3 | 3 | 64.5 | 78.7 | 3 / 35 | 4245 |
| 4 | 3 | 63.8 | 77.5 | 4 / 35 | 3928 |
| 5 | 3 | 64.4 | 78.7 | 5 / 35 | 4108 |
| 6 | 3 | 63.5 | 76.5 | 5 / 35 | 3899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 46 | 33% |
| cb.fire.Firestarter 2.0f | 33 | 3% |
| wompi.Numbat 2.1 | 12 | 42% |
| axeBots.HataMoto 3.09 | 7 | 86% |
| ms.Ares 0.19 | 1 | 0% |

Hadur died in 183 of 210 rounds, at a mean tick of 918. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 69 | 38% | 86 |
| cb.fire.Firestarter 2.0f | 63 | 34% | 64 |
| wompi.Numbat 2.1 | 27 | 15% | 31 |
| axeBots.HataMoto 3.09 | 12 | 7% | 17 |
| ms.Ares 0.19 | 9 | 5% | 9 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 1% | 1 |

Posture (Hadur's M records, 199 rounds): 150465 melee ticks, 35064 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 65 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 45915 sent, 41128 reached their opponent, 6750 virtual hits (16.4% of those reached).

## Melee bench: F06

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488411. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 161 over 6 battles (26.8 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 92.7 | 150 / 210 | 1.66 | 20.7% | 34330 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.7% | 150 |
| jekl.StoneGhost 0.7 | 2.2 | 14.0% | 12 |
| origin.SleepSiphon 1.7b | 3.0 | 13.2% | 27 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.0% | 12 |
| mld.Wisdom 1.0 | 5.0 | 10.5% | 3 |
| gg.Wolverine 2.0 | 5.8 | 8.8% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 6.5% | 5 |
| DBall.NUKE 0.1 | 8.2 | 5.8% | 0 |
| spinnercat.Omen 1.0 | 8.5 | 5.6% | 0 |
| sample.Fire 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 92.1 | 23 / 35 | 6092 |
| 2 | 1 | 72.5 | 95.6 | 29 / 35 | 5928 |
| 3 | 1 | 70.5 | 90.5 | 24 / 35 | 5400 |
| 4 | 1 | 71.7 | 94.0 | 24 / 35 | 5996 |
| 5 | 1 | 71.0 | 93.0 | 25 / 35 | 5464 |
| 6 | 1 | 70.9 | 91.1 | 25 / 35 | 5450 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 75 | 96% |
| origin.SleepSiphon 1.7b | 44 | 73% |
| pe.minimelee.SandboxMiniMelee 1.1 | 33 | 79% |
| gg.Wolverine 2.0 | 8 | 100% |
| mld.Wisdom 1.0 | 8 | 88% |
| ers.nano.hawk.HawkLA 3.0m | 8 | 63% |

Hadur died in 61 of 210 rounds, at a mean tick of 917. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 21 | 34% | 61 |
| pe.minimelee.SandboxMiniMelee 1.1 | 13 | 21% | 40 |
| jekl.StoneGhost 0.7 | 11 | 18% | 58 |
| mld.Wisdom 1.0 | 7 | 11% | 25 |
| gg.Wolverine 2.0 | 4 | 7% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 7% | 10 |
| sample.Fire 1.0 | 1 | 2% | 1 |
| DBall.NUKE 0.1 | 0 | 0% | 2 |

Posture (Hadur's M records, 200 rounds): 143976 melee ticks, 48751 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 44 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 44 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 44912 sent, 40268 reached their opponent, 9356 virtual hits (23.2% of those reached).

## Melee bench: F07

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1477538. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 96 over 6 battles (16.0 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 75.2 | 96.8 | 168 / 210 | 1.25 | 25.9% | 45140 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 25.9% | 168 |
| rtk.Tachikoma 1.0 | 2.0 | 18.8% | 25 |
| franzor.Lizt 1.3.1 | 3.3 | 12.7% | 11 |
| oog.melee.CapuletDroid 1.1 | 3.7 | 12.7% | 6 |
| lrem.micro.MoggFanatic 0.2 | 5.0 | 10.0% | 0 |
| exauge.GateKeeper 1.1.121g | 6.0 | 8.3% | 0 |
| skm.PateranBotlock2 1.0 | 7.0 | 6.2% | 0 |
| sample.Target 1.0 | 8.5 | 2.7% | 0 |
| drd.Dreadknoght 0.9 | 8.5 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 75.4 | 95.4 | 26 / 35 | 7804 |
| 2 | 1 | 76.3 | 98.2 | 30 / 35 | 8289 |
| 3 | 1 | 75.3 | 97.5 | 30 / 35 | 7271 |
| 4 | 1 | 73.7 | 93.9 | 23 / 35 | 6912 |
| 5 | 1 | 75.4 | 97.5 | 28 / 35 | 7740 |
| 6 | 1 | 75.3 | 98.6 | 31 / 35 | 7124 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 117 | 79% |
| franzor.Lizt 1.3.1 | 42 | 90% |
| oog.melee.CapuletDroid 1.1 | 40 | 93% |

Hadur died in 42 of 210 rounds, at a mean tick of 1544. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 33 | 79% | 133 |
| franzor.Lizt 1.3.1 | 6 | 14% | 3 |
| oog.melee.CapuletDroid 1.1 | 3 | 7% | 52 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 10 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 7 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 189384 melee ticks, 85756 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 54 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 53266 sent, 49257 reached their opponent, 10560 virtual hits (21.4% of those reached).

## Melee bench: F08

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1477624. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 264 over 6 battles (44.0 per battle, most in one battle 51). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 92.1 | 145 / 210 | 1.63 | 22.5% | 31540 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 22.5% | 145 |
| tm.Yuugao 1.0 | 2.5 | 14.9% | 27 |
| shrub.Vapour v159 | 2.5 | 14.2% | 20 |
| com.spp.robocode.MostlyHarmless 010 | 4.3 | 11.2% | 8 |
| jwst.DAD.DarkAndDarker 1.1 | 5.3 | 9.6% | 4 |
| m3thos.Eva00 1.1 | 5.3 | 9.8% | 3 |
| qualidafial.MajorDick 1.0.1 | 7.3 | 6.5% | 1 |
| SHAM.WOW 1.4 | 8.0 | 5.8% | 2 |
| zyx.nano.BacillusComma 1.0 | 8.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 90.7 | 21 / 35 | 5093 |
| 2 | 1 | 71.0 | 92.1 | 25 / 35 | 5369 |
| 3 | 1 | 70.7 | 92.1 | 25 / 35 | 5181 |
| 4 | 1 | 70.3 | 91.4 | 20 / 35 | 5181 |
| 5 | 1 | 70.6 | 92.5 | 25 / 35 | 5040 |
| 6 | 1 | 71.8 | 93.9 | 29 / 35 | 5676 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 69 | 78% |
| shrub.Vapour v159 | 52 | 81% |
| com.spp.robocode.MostlyHarmless 010 | 25 | 84% |
| jwst.DAD.DarkAndDarker 1.1 | 16 | 75% |
| m3thos.Eva00 1.1 | 14 | 86% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| SHAM.WOW 1.4 | 2 | 50% |

Hadur died in 65 of 210 rounds, at a mean tick of 870. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 22 | 34% | 70 |
| shrub.Vapour v159 | 18 | 28% | 61 |
| com.spp.robocode.MostlyHarmless 010 | 10 | 15% | 31 |
| jwst.DAD.DarkAndDarker 1.1 | 7 | 11% | 19 |
| m3thos.Eva00 1.1 | 6 | 9% | 19 |
| SHAM.WOW 1.4 | 1 | 2% | 4 |
| zyx.nano.BacillusComma 1.0 | 1 | 2% | 2 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 141927 melee ticks, 48148 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 67 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 67 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 43406 sent, 39241 reached their opponent, 7373 virtual hits (18.8% of those reached).

## Melee bench: F09

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1476457. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 146 over 6 battles (24.3 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 81.7 | 78 / 210 | 2.65 | 16.7% | 23812 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 17.2% | 96 |
| hadur117.Hadur 3.21bb | 1.7 | 16.7% | 78 |
| kc.micro.Figment 1.0 | 3.0 | 14.3% | 19 |
| yagami.Tidus 0.11 | 4.3 | 10.8% | 0 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.3% | 14 |
| mc2.enemy.Original 0.9 | 6.3 | 8.2% | 3 |
| dft.Calliope 5.6 | 6.7 | 7.7% | 0 |
| step.nanoPri 1.0 | 8.3 | 5.6% | 0 |
| rdm.Dueler 0.4x | 9.3 | 4.5% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 87.3 | 15 / 35 | 4235 |
| 2 | 2 | 64.4 | 77.1 | 8 / 35 | 3971 |
| 3 | 2 | 65.2 | 79.0 | 11 / 35 | 3922 |
| 4 | 1 | 67.7 | 85.7 | 20 / 35 | 4352 |
| 5 | 2 | 66.1 | 83.2 | 12 / 35 | 3977 |
| 6 | 2 | 63.9 | 77.8 | 12 / 35 | 3355 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 56 | 32% |
| kc.micro.Figment 1.0 | 42 | 83% |
| pedersen.Grishnakh 1.0 | 14 | 57% |
| yagami.Tidus 0.11 | 8 | 100% |
| mc2.enemy.Original 0.9 | 6 | 83% |
| dft.Calliope 5.6 | 4 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 60 | 45% | 80 |
| kc.micro.Figment 1.0 | 26 | 20% | 59 |
| pedersen.Grishnakh 1.0 | 13 | 10% | 20 |
| mc2.enemy.Original 0.9 | 11 | 8% | 16 |
| yagami.Tidus 0.11 | 10 | 8% | 16 |
| step.nanoPri 1.0 | 5 | 4% | 5 |
| dft.Calliope 5.6 | 4 | 3% | 10 |
| robar.nano.Assertive_Melee 0.2 | 2 | 2% | 2 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |

Posture (Hadur's M records, 200 rounds): 146678 melee ticks, 41637 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 64 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 47736 sent, 43084 reached their opponent, 6214 virtual hits (14.4% of those reached).

## Melee bench: F10

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1497383. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 202 over 6 battles (33.7 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 97.0 | 179 / 210 | 1.27 | 21.4% | 35662 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.4% | 179 |
| DTF.Kludgy 1.2b | 2.7 | 13.5% | 14 |
| ejb.Polaris 1.0.1 | 3.2 | 12.7% | 5 |
| ne.Chimera 1.2 | 3.2 | 12.6% | 6 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.1% | 3 |
| vStar.RAFzilla 2.15 | 5.5 | 9.9% | 2 |
| kurios.DOSexe .9b | 7.8 | 5.6% | 1 |
| sam.Samspin 1.0 | 8.3 | 5.3% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 4.9% | 0 |
| donjezza.Muncho 1.0 | 9.3 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 93.7 | 27 / 35 | 5940 |
| 2 | 1 | 71.4 | 96.5 | 30 / 35 | 5576 |
| 3 | 1 | 72.4 | 97.8 | 31 / 35 | 6142 |
| 4 | 1 | 73.1 | 98.7 | 32 / 35 | 6316 |
| 5 | 1 | 72.5 | 98.7 | 32 / 35 | 6004 |
| 6 | 1 | 71.7 | 96.5 | 27 / 35 | 5684 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 57 | 82% |
| ejb.Polaris 1.0.1 | 55 | 95% |
| ne.Chimera 1.2 | 42 | 93% |
| vStar.RAFzilla 2.15 | 24 | 96% |
| tvv.micro.Antares 1.1.1 | 10 | 90% |
| kurios.DOSexe .9b | 5 | 100% |
| sam.Samspin 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 31 of 210 rounds, at a mean tick of 965. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 14 | 45% | 62 |
| ejb.Polaris 1.0.1 | 6 | 19% | 55 |
| ne.Chimera 1.2 | 6 | 19% | 40 |
| vStar.RAFzilla 2.15 | 3 | 10% | 27 |
| tvv.micro.Antares 1.1.1 | 2 | 6% | 8 |
| kurios.DOSexe .9b | 0 | 0% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 3 |
| sam.Samspin 1.0 | 0 | 0% | 2 |
| donjezza.Muncho 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 197 rounds): 140483 melee ticks, 61776 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (197 rounds): longest scan gap while four or more were alive 49 ticks (197 rounds over 8); rounds whose longest gap at any count was over 8: 197; robots dropped as dead without a death event: 0.

Targeting waves (197 rounds): 46135 sent, 41516 reached their opponent, 7968 virtual hits (19.2% of those reached).

## Melee bench: F11

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1510823. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 179 over 6 battles (29.8 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 85.0 | 84 / 210 | 2.35 | 17.3% | 24847 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.2 | 17.3% | 84 |
| rz.Aleph 0.34 | 1.8 | 16.2% | 67 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.9% | 20 |
| djc.DynaBot 0.1.1 | 4.2 | 10.6% | 12 |
| rdt199.Warlord 0.73 | 5.3 | 9.2% | 11 |
| uji.YellohFellah 1.0 | 6.7 | 8.1% | 10 |
| KiraNL.Chupacabra 0.4 | 6.8 | 7.8% | 1 |
| br2.MobyDickBot 1.6 | 7.0 | 7.7% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.4% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 86.3 | 11 / 35 | 4252 |
| 2 | 1 | 67.6 | 87.3 | 18 / 35 | 4207 |
| 3 | 1 | 65.9 | 82.5 | 12 / 35 | 4277 |
| 4 | 1 | 66.5 | 84.8 | 17 / 35 | 3956 |
| 5 | 1 | 66.2 | 84.1 | 13 / 35 | 4290 |
| 6 | 1 | 66.0 | 84.8 | 13 / 35 | 3865 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 68 | 47% |
| cx.mini.Nimrod 0.55 | 26 | 69% |
| djc.DynaBot 0.1.1 | 17 | 71% |
| rdt199.Warlord 0.73 | 12 | 67% |
| br2.MobyDickBot 1.6 | 12 | 50% |
| uji.YellohFellah 1.0 | 10 | 60% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 60 | 48% | 93 |
| cx.mini.Nimrod 0.55 | 18 | 14% | 30 |
| rdt199.Warlord 0.73 | 15 | 12% | 22 |
| uji.YellohFellah 1.0 | 8 | 6% | 17 |
| br2.MobyDickBot 1.6 | 8 | 6% | 14 |
| djc.DynaBot 0.1.1 | 7 | 6% | 16 |
| KiraNL.Chupacabra 0.4 | 6 | 5% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 2% | 3 |
| stelo.MirrorNano 1.3 | 2 | 2% | 3 |

Posture (Hadur's M records, 200 rounds): 157528 melee ticks, 40562 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 32 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 50451 sent, 45612 reached their opponent, 6032 virtual hits (13.2% of those reached).

## Melee bench: F12

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1477476. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 172 over 6 battles (28.7 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 85.5 | 119 / 210 | 2.30 | 17.8% | 23529 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 17.8% | 119 |
| bts.wiki.RipCurl 0.9b | 2.5 | 14.2% | 34 |
| nat.PallasHawk 1.0 | 3.2 | 13.2% | 31 |
| darkcanuck.Leon 1.01 | 3.3 | 12.8% | 13 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.1% | 10 |
| jrm.Test0 1.0 | 6.2 | 8.2% | 1 |
| cs.sheldor.Talon 1.1 | 7.2 | 6.9% | 1 |
| jp.Perpy 16.0 | 8.0 | 6.2% | 0 |
| stuff.Vlad 0.1 | 8.8 | 5.7% | 1 |
| jaybot.bots.Oddball 4.0 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 85.7 | 20 / 35 | 3545 |
| 2 | 1 | 66.3 | 81.9 | 22 / 35 | 3640 |
| 3 | 1 | 67.3 | 84.8 | 20 / 35 | 3962 |
| 4 | 1 | 67.9 | 88.9 | 19 / 35 | 4095 |
| 5 | 1 | 69.6 | 93.0 | 24 / 35 | 4365 |
| 6 | 1 | 65.2 | 78.7 | 14 / 35 | 3922 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 57 | 74% |
| nat.PallasHawk 1.0 | 37 | 76% |
| darkcanuck.Leon 1.01 | 32 | 100% |
| brainfade.melee.Genghis 0.36 | 10 | 70% |
| stuff.Vlad 0.1 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| jp.Perpy 16.0 | 2 | 100% |
| jrm.Test0 1.0 | 2 | 50% |
| jaybot.bots.Oddball 4.0 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 678. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 29 | 31% | 59 |
| nat.PallasHawk 1.0 | 21 | 23% | 46 |
| brainfade.melee.Genghis 0.36 | 16 | 17% | 23 |
| darkcanuck.Leon 1.01 | 10 | 11% | 43 |
| jrm.Test0 1.0 | 8 | 9% | 13 |
| cs.sheldor.Talon 1.1 | 5 | 5% | 13 |
| stuff.Vlad 0.1 | 2 | 2% | 4 |
| jp.Perpy 16.0 | 2 | 2% | 4 |
| jaybot.bots.Oddball 4.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 200 rounds): 125611 melee ticks, 32576 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 33 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 42900 sent, 37996 reached their opponent, 6200 virtual hits (16.3% of those reached).

## Melee bench: F13

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1472155. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 145 over 6 battles (24.2 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 83.8 | 65 / 210 | 2.46 | 16.6% | 26761 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.7 | 16.6% | 65 |
| ags.Glacier 0.2.11 | 2.0 | 16.5% | 45 |
| mn.Combat 3.25.0 | 2.3 | 16.2% | 81 |
| shinh.Entangled 0.3 | 4.0 | 11.9% | 13 |
| gh.micro.Gruweltje 0.7 | 5.0 | 11.2% | 7 |
| apc.Colossus2 0.17 | 6.2 | 8.0% | 0 |
| stelo.Wang 1.0 | 6.8 | 6.9% | 0 |
| maribo.FollowFire 1 | 8.2 | 5.2% | 0 |
| ayk.WallHugger 1.0 | 8.8 | 4.4% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 85.4 | 12 / 35 | 4589 |
| 2 | 2 | 65.4 | 82.9 | 9 / 35 | 4263 |
| 3 | 2 | 66.7 | 84.8 | 12 / 35 | 4441 |
| 4 | 1 | 66.7 | 84.8 | 14 / 35 | 4571 |
| 5 | 2 | 66.4 | 83.5 | 9 / 35 | 4587 |
| 6 | 2 | 65.4 | 81.6 | 9 / 35 | 4310 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 55 | 64% |
| mn.Combat 3.25.0 | 51 | 20% |
| shinh.Entangled 0.3 | 20 | 60% |
| gh.micro.Gruweltje 0.7 | 8 | 63% |
| stelo.Wang 1.0 | 3 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 907. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 59 | 41% | 73 |
| ags.Glacier 0.2.11 | 44 | 30% | 74 |
| shinh.Entangled 0.3 | 18 | 12% | 30 |
| gh.micro.Gruweltje 0.7 | 11 | 8% | 18 |
| stelo.Wang 1.0 | 5 | 3% | 7 |
| maribo.FollowFire 1 | 5 | 3% | 5 |
| apc.Colossus2 0.17 | 3 | 2% | 3 |

Posture (Hadur's M records, 198 rounds): 145572 melee ticks, 43152 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 64 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 42088 sent, 37204 reached their opponent, 5870 virtual hits (15.8% of those reached).

## Melee bench: F14

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1479654. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 160 over 6 battles (26.7 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 95.3 | 186 / 210 | 1.38 | 24.1% | 37103 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 24.1% | 186 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 16.7% | 13 |
| sanyi.mikrobi.Roberto 1.0 | 3.7 | 11.4% | 4 |
| Lo_Ian.Gandalf_V4 4.0 | 4.2 | 10.9% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 4.7 | 10.5% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.9% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 8.6% | 3 |
| pa.Improved 1.0 | 8.0 | 6.3% | 0 |
| sample.TrackFire 1.0 | 9.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.7 | 98.6 | 32 / 35 | 6324 |
| 2 | 1 | 73.7 | 98.6 | 31 / 35 | 6377 |
| 3 | 1 | 71.7 | 90.0 | 30 / 35 | 6146 |
| 4 | 1 | 72.3 | 93.9 | 30 / 35 | 6111 |
| 5 | 1 | 71.1 | 91.4 | 30 / 35 | 5576 |
| 6 | 1 | 74.5 | 99.3 | 33 / 35 | 6569 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 124 | 94% |
| sanyi.mikrobi.Roberto 1.0 | 31 | 97% |
| sheldor.micro.PointInLineRRAL 1.0 | 18 | 89% |
| co.edu.usb.rc.LidisTron 1.0 | 13 | 92% |
| Lo_Ian.Gandalf_V4 4.0 | 5 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 24 of 210 rounds, at a mean tick of 738. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 14 | 58% | 111 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 13% | 46 |
| sheldor.micro.PointInLineRRAL 1.0 | 2 | 8% | 20 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 8% | 12 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 4% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 4% | 7 |
| sample.TrackFire 1.0 | 1 | 4% | 1 |
| pa.Improved 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 120649 melee ticks, 49214 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 80 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 35845 sent, 31934 reached their opponent, 8456 virtual hits (26.5% of those reached).

## Melee bench: F15

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1473365. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 190 over 6 battles (31.7 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 88.5 | 126 / 210 | 2.04 | 19.4% | 31960 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 19.4% | 126 |
| kawigi.micro.Shiz 1.1 | 2.2 | 14.2% | 17 |
| emp.Yngwie 1.11 | 3.3 | 12.5% | 46 |
| mld.DustBunny 3.8 | 3.7 | 12.6% | 7 |
| kawigi.robot.Girl 1.2 | 5.3 | 9.0% | 12 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.9% | 2 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.6% | 1 |
| lambdaxy.TBot 0.1 | 7.7 | 6.6% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.3 | 4.7% | 0 |
| divineomega.TrialBot 0.003 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 87.9 | 22 / 35 | 5476 |
| 2 | 1 | 69.0 | 87.3 | 20 / 35 | 5166 |
| 3 | 1 | 69.9 | 90.2 | 22 / 35 | 5271 |
| 4 | 1 | 69.5 | 89.8 | 22 / 35 | 5206 |
| 5 | 1 | 69.2 | 86.7 | 20 / 35 | 5434 |
| 6 | 1 | 69.9 | 88.9 | 20 / 35 | 5407 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 48 | 52% |
| kawigi.micro.Shiz 1.1 | 41 | 95% |
| mld.DustBunny 3.8 | 27 | 93% |
| kawigi.robot.Girl 1.2 | 24 | 71% |
| cb.nano.Insomnia 1.0 | 13 | 100% |
| divineomega.TrialBot 0.003 | 5 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 969. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 35 | 41% | 79 |
| cb.nano.Insomnia 1.0 | 14 | 16% | 20 |
| mld.DustBunny 3.8 | 10 | 12% | 39 |
| kawigi.robot.Girl 1.2 | 10 | 12% | 17 |
| kawigi.micro.Shiz 1.1 | 8 | 9% | 32 |
| Grystrion.TrackerWO 1.0 | 3 | 4% | 5 |
| divineomega.TrialBot 0.003 | 2 | 2% | 12 |
| lambdaxy.TBot 0.1 | 2 | 2% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 160958 melee ticks, 48112 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 63 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 52072 sent, 47404 reached their opponent, 7471 virtual hits (15.8% of those reached).

## Melee bench: F16

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1487315. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 154 over 6 battles (25.7 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 91.6 | 133 / 210 | 1.76 | 20.7% | 36613 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.7% | 133 |
| gh.Griezel 0.5.2 | 2.0 | 16.0% | 45 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.2% | 5 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 10.5% | 21 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.3% | 3 |
| tvv.nano.Polaris 1.2 | 5.7 | 8.6% | 4 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.2% | 2 |
| asd.Cthulhu 1.3 | 8.7 | 4.8% | 0 |
| repositorio.NanoStep 1.0 | 8.7 | 5.0% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 86.3 | 22 / 35 | 5807 |
| 2 | 1 | 72.1 | 92.7 | 24 / 35 | 6407 |
| 3 | 1 | 71.9 | 93.7 | 23 / 35 | 6520 |
| 4 | 1 | 72.7 | 94.6 | 25 / 35 | 6485 |
| 5 | 1 | 70.2 | 90.5 | 22 / 35 | 5401 |
| 6 | 1 | 70.9 | 91.7 | 17 / 35 | 5993 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 87 | 69% |
| techdude.forest.FlamingForest 1.1 | 38 | 71% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 35 | 94% |
| stelo.IntrinsicVolatility 1.4 | 6 | 100% |
| asd.Cthulhu 1.3 | 3 | 100% |
| bvh.fnr.Fenrir 0.36l | 3 | 100% |
| tvv.nano.Polaris 1.2 | 2 | 50% |

Hadur died in 80 of 210 rounds, at a mean tick of 1278. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 35 | 44% | 103 |
| techdude.forest.FlamingForest 1.1 | 18 | 23% | 47 |
| bvh.fnr.Fenrir 0.36l | 11 | 14% | 13 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 7 | 9% | 26 |
| divineomega.DivineBot 1.9.4.5 | 3 | 4% | 7 |
| stelo.IntrinsicVolatility 1.4 | 2 | 3% | 7 |
| asd.Cthulhu 1.3 | 1 | 1% | 2 |
| tvv.nano.Polaris 1.2 | 0 | 0% | 3 |
| repositorio.NanoStep 1.0 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 173432 melee ticks, 76676 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 32 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 55009 sent, 50493 reached their opponent, 8751 virtual hits (17.3% of those reached).

## Melee bench: F17

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1470627. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 189 over 6 battles (31.5 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 90.7 | 123 / 210 | 1.83 | 20.2% | 35446 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.2% | 123 |
| et.Predator 1.8 | 2.8 | 13.1% | 19 |
| oog.melee.Mercutio 1.0 | 3.2 | 12.7% | 23 |
| cx.BlestPain 1.41 | 3.2 | 12.4% | 34 |
| ahf.NanoAndrew .4 | 4.8 | 10.4% | 7 |
| maribo.melee.BMV 0.1 | 6.5 | 8.9% | 1 |
| nic.Nicator 2.4 | 6.5 | 9.1% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 8.2 | 5.7% | 0 |
| tex.Longbot 0.4 | 8.8 | 4.9% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 95.9 | 26 / 35 | 6630 |
| 2 | 1 | 71.4 | 93.0 | 23 / 35 | 6121 |
| 3 | 1 | 69.8 | 88.3 | 16 / 35 | 5807 |
| 4 | 1 | 69.6 | 88.3 | 16 / 35 | 5580 |
| 5 | 1 | 70.5 | 89.8 | 22 / 35 | 5912 |
| 6 | 1 | 69.7 | 89.2 | 20 / 35 | 5396 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 51 | 78% |
| et.Predator 1.8 | 51 | 86% |
| cx.BlestPain 1.41 | 37 | 43% |
| ahf.NanoAndrew .4 | 15 | 87% |
| maribo.melee.BMV 0.1 | 6 | 83% |
| nic.Nicator 2.4 | 4 | 50% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |
| goblin.Bender 2.4 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 1129. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 35 | 40% | 65 |
| et.Predator 1.8 | 17 | 20% | 47 |
| oog.melee.Mercutio 1.0 | 16 | 18% | 54 |
| ahf.NanoAndrew .4 | 8 | 9% | 23 |
| maribo.melee.BMV 0.1 | 7 | 8% | 9 |
| nic.Nicator 2.4 | 3 | 3% | 6 |
| tex.Longbot 0.4 | 1 | 1% | 1 |
| goblin.Bender 2.4 | 0 | 0% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 166549 melee ticks, 62321 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 63 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 54398 sent, 49679 reached their opponent, 10438 virtual hits (21.0% of those reached).

## Melee bench: F18

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474255. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 271 over 6 battles (45.2 per battle, most in one battle 53). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 92.7 | 157 / 210 | 1.58 | 22.4% | 28661 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 22.4% | 157 |
| agd.Mooserwirt2 2.7 | 2.0 | 14.5% | 20 |
| uji.DBH 1.1 | 3.5 | 11.9% | 6 |
| sigterm.Sigterm 1.0 | 4.2 | 10.6% | 13 |
| ratosh.Nobo 0.21 | 4.7 | 10.5% | 4 |
| spinnercat.Robovirus 2.718 | 5.8 | 9.8% | 5 |
| kawigi.mini.Fhqwhgads 1.1 | 6.8 | 8.2% | 1 |
| stelo.WangRobot 1.0 | 8.2 | 6.1% | 4 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.8 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 94.6 | 24 / 35 | 4485 |
| 2 | 1 | 71.6 | 95.0 | 28 / 35 | 5138 |
| 3 | 1 | 70.9 | 92.9 | 27 / 35 | 5090 |
| 4 | 1 | 69.6 | 89.3 | 24 / 35 | 4747 |
| 5 | 1 | 70.6 | 95.4 | 30 / 35 | 4529 |
| 6 | 1 | 69.4 | 89.3 | 24 / 35 | 4672 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agd.Mooserwirt2 2.7 | 57 | 93% |
| uji.DBH 1.1 | 40 | 95% |
| sigterm.Sigterm 1.0 | 35 | 83% |
| ratosh.Nobo 0.21 | 18 | 83% |
| spinnercat.Robovirus 2.718 | 15 | 80% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 100% |
| stelo.WangRobot 1.0 | 4 | 50% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 788. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.DBH 1.1 | 12 | 23% | 43 |
| spinnercat.Robovirus 2.718 | 10 | 19% | 17 |
| sigterm.Sigterm 1.0 | 9 | 17% | 37 |
| agd.Mooserwirt2 2.7 | 8 | 15% | 60 |
| ratosh.Nobo 0.21 | 7 | 13% | 23 |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 8% | 15 |
| stelo.WangRobot 1.0 | 3 | 6% | 5 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 0 | 0% | 6 |

Posture (Hadur's M records, 199 rounds): 129108 melee ticks, 44984 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 120 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 120 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 40306 sent, 36076 reached their opponent, 8159 virtual hits (22.6% of those reached).

## Melee bench: F19

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1485545. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 186 over 6 battles (31.0 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.1 | 99.1 | 205 / 210 | 1.08 | 23.0% | 38891 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 23.0% | 205 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.2% | 0 |
| mld.Infinity 2.2 | 3.3 | 12.3% | 2 |
| krillr.mini.JointStrike 2.0.0 | 3.7 | 11.6% | 1 |
| erdnis.Rover 0.3 | 5.0 | 10.3% | 1 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.5% | 0 |
| pac.ABC 2.1 | 7.3 | 6.8% | 1 |
| mbh.Mbh 0.1 | 7.5 | 7.0% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.4% | 0 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.8 | 99.7 | 34 / 35 | 6262 |
| 2 | 1 | 73.9 | 98.7 | 34 / 35 | 6507 |
| 3 | 1 | 74.0 | 99.4 | 34 / 35 | 6313 |
| 4 | 1 | 73.6 | 96.8 | 33 / 35 | 6393 |
| 5 | 1 | 74.5 | 100.0 | 35 / 35 | 6550 |
| 6 | 1 | 75.0 | 100.0 | 35 / 35 | 6866 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 116 | 100% |
| krillr.mini.JointStrike 2.0.0 | 36 | 97% |
| mld.Infinity 2.2 | 27 | 100% |
| erdnis.Rover 0.3 | 12 | 92% |
| patson.PatsonTestBot 1.0 | 9 | 100% |
| pac.ABC 2.1 | 3 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 5 of 210 rounds, at a mean tick of 580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 2 | 40% | 68 |
| krillr.mini.JointStrike 2.0.0 | 2 | 40% | 37 |
| erdnis.Rover 0.3 | 1 | 20% | 15 |
| mld.Infinity 2.2 | 0 | 0% | 34 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 16 |
| mbh.Mbh 0.1 | 0 | 0% | 11 |
| pbg.R2D2 1.0 | 0 | 0% | 10 |
| pac.ABC 2.1 | 0 | 0% | 7 |

Posture (Hadur's M records, 198 rounds): 121896 melee ticks, 44238 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 448 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 272 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 41381 sent, 36870 reached their opponent, 8891 virtual hits (24.1% of those reached).

## Melee bench: F20

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478362. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 147 over 6 battles (24.5 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 94.3 | 157 / 210 | 1.51 | 21.7% | 38461 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.7% | 157 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.4% | 26 |
| fwb.Nine 1.0.1 | 3.7 | 10.9% | 10 |
| catcat20.Rabbit 0.001 | 4.2 | 10.4% | 14 |
| nz.jdc.nano.GridFu 1.0 | 4.5 | 10.0% | 2 |
| m3thos.mini.Eva01 0.5.5 | 5.7 | 8.8% | 1 |
| bayen.nut.Squirrel 1.615 | 7.5 | 7.1% | 1 |
| ntc.ControlledChaos 1.1.4 | 8.2 | 5.8% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.3 | 5.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 91.1 | 24 / 35 | 6078 |
| 2 | 1 | 72.5 | 95.2 | 26 / 35 | 6587 |
| 3 | 1 | 71.9 | 92.7 | 24 / 35 | 6348 |
| 4 | 1 | 73.4 | 97.1 | 30 / 35 | 6717 |
| 5 | 1 | 71.6 | 93.3 | 25 / 35 | 6146 |
| 6 | 1 | 72.9 | 96.5 | 28 / 35 | 6585 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 93 | 80% |
| fwb.Nine 1.0.1 | 41 | 93% |
| catcat20.Rabbit 0.001 | 36 | 81% |
| m3thos.mini.Eva01 0.5.5 | 8 | 100% |
| nz.jdc.nano.GridFu 1.0 | 4 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |
| bayen.nut.Squirrel 1.615 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 1053. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 32 | 59% | 104 |
| catcat20.Rabbit 0.001 | 12 | 22% | 48 |
| nz.jdc.nano.GridFu 1.0 | 3 | 6% | 24 |
| fwb.Nine 1.0.1 | 2 | 4% | 8 |
| m3thos.mini.Eva01 0.5.5 | 1 | 2% | 12 |
| bayen.nut.Squirrel 1.615 | 1 | 2% | 7 |
| ntc.ControlledChaos 1.1.4 | 1 | 2% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 1 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 157289 melee ticks, 62889 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 49 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 49412 sent, 44851 reached their opponent, 10311 virtual hits (23.0% of those reached).

## Melee bench: F21

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1473403. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 114 over 6 battles (19.0 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 95.6 | 150 / 210 | 1.40 | 21.9% | 38599 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.9% | 150 |
| eem.EvBot v4.6.16 | 2.0 | 16.0% | 48 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.1% | 4 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.6% | 3 |
| eld.Hmm 1.0 | 5.2 | 8.1% | 6 |
| oa.weak.BotherBot 0.1 | 5.8 | 7.4% | 0 |
| fire219.CatBot 1.0 | 7.8 | 5.8% | 0 |
| PSW.Relentless 0.1 | 7.8 | 5.8% | 0 |
| el.JumpShoot 0.2 | 8.3 | 5.8% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.6 | 96.8 | 26 / 35 | 6688 |
| 2 | 1 | 72.5 | 95.2 | 22 / 35 | 6201 |
| 3 | 1 | 72.7 | 94.6 | 26 / 35 | 6483 |
| 4 | 1 | 73.5 | 95.2 | 28 / 35 | 6612 |
| 5 | 1 | 72.7 | 96.2 | 25 / 35 | 6604 |
| 6 | 1 | 71.9 | 95.2 | 23 / 35 | 6011 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 131 | 67% |
| dummy.mini.Scimitar 1.01 | 33 | 97% |
| cf.RiO.RiOx 4.2.1 | 22 | 91% |
| eld.Hmm 1.0 | 9 | 56% |
| el.JumpShoot 0.2 | 2 | 100% |
| oa.weak.BotherBot 0.1 | 2 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 1405. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 41 | 68% | 117 |
| eld.Hmm 1.0 | 7 | 12% | 20 |
| cf.RiO.RiOx 4.2.1 | 6 | 10% | 22 |
| dummy.mini.Scimitar 1.01 | 5 | 8% | 42 |
| PSW.Relentless 0.1 | 1 | 2% | 1 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 5 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 172169 melee ticks, 86743 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 56 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 51229 sent, 46610 reached their opponent, 8207 virtual hits (17.6% of those reached).

## Melee bench: F22

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1485905. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 155 over 6 battles (25.8 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.4 | 94 / 210 | 1.93 | 20.2% | 27011 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.2% | 94 |
| pe.SandboxDT 2.71m | 2.0 | 17.3% | 62 |
| kvk.HebusLeTroll 0.35 | 3.0 | 15.5% | 27 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.7% | 17 |
| bigpete.Stewie 1.0 | 5.0 | 10.9% | 8 |
| yk.JahRoslav 1.1 | 6.3 | 6.7% | 1 |
| tad.Dalek98 0.98 | 7.2 | 5.8% | 1 |
| gg.Squaraus 0.6 | 7.8 | 5.3% | 0 |
| pbg.NinjaX 1.2 | 8.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 88.2 | 19 / 35 | 4201 |
| 2 | 1 | 67.5 | 86.1 | 15 / 35 | 4293 |
| 3 | 1 | 68.3 | 87.5 | 12 / 35 | 4547 |
| 4 | 1 | 69.5 | 91.1 | 19 / 35 | 4603 |
| 5 | 1 | 69.3 | 90.7 | 16 / 35 | 4695 |
| 6 | 1 | 68.3 | 86.8 | 13 / 35 | 4672 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 62 | 35% |
| kvk.HebusLeTroll 0.35 | 49 | 61% |
| jlm.javaDisturbance 0.59 | 43 | 74% |
| bigpete.Stewie 1.0 | 11 | 73% |
| yk.JahRoslav 1.1 | 2 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 1029. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 56 | 48% | 80 |
| kvk.HebusLeTroll 0.35 | 32 | 27% | 55 |
| jlm.javaDisturbance 0.59 | 19 | 16% | 52 |
| bigpete.Stewie 1.0 | 7 | 6% | 14 |
| yk.JahRoslav 1.1 | 2 | 2% | 5 |
| tad.Dalek98 0.98 | 1 | 1% | 1 |
| gg.Squaraus 0.6 | 0 | 0% | 2 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 201 rounds): 155078 melee ticks, 51053 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 40 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 45858 sent, 41731 reached their opponent, 5798 virtual hits (13.9% of those reached).

## Melee bench: F23

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1581701. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 182 over 6 battles (30.3 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.7 | 97.8 | 184 / 210 | 1.20 | 22.5% | 38950 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 22.5% | 184 |
| pe.SandboxLump 1.52 | 2.0 | 16.1% | 18 |
| cre.Karolos 0.32 | 3.0 | 13.5% | 4 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 9.9% | 1 |
| stelo.RamTrackSurfer 1.2 | 5.0 | 9.3% | 3 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.0 | 8.9% | 0 |
| cw.megas.Blade 0.8 | 6.7 | 8.0% | 0 |
| sample.Walls 1.0 | 8.0 | 6.7% | 0 |
| rrh.Iwillfindyou 2.0 | 9.3 | 2.8% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 97.5 | 29 / 35 | 6744 |
| 2 | 1 | 73.6 | 97.1 | 30 / 35 | 6473 |
| 3 | 1 | 73.9 | 97.8 | 30 / 35 | 6362 |
| 4 | 1 | 74.3 | 99.4 | 33 / 35 | 6582 |
| 5 | 1 | 73.6 | 97.8 | 31 / 35 | 6467 |
| 6 | 1 | 73.4 | 97.5 | 31 / 35 | 6322 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 107 | 92% |
| cre.Karolos 0.32 | 44 | 95% |
| stelo.AreaTargetingBot 1.1 | 15 | 100% |
| stelo.RamTrackSurfer 1.2 | 14 | 86% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 9 | 100% |
| sample.Walls 1.0 | 6 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 27 of 210 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 14 | 52% | 99 |
| cre.Karolos 0.32 | 9 | 33% | 54 |
| stelo.RamTrackSurfer 1.2 | 3 | 11% | 21 |
| stelo.AreaTargetingBot 1.1 | 1 | 4% | 12 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 10 |
| sample.Walls 1.0 | 0 | 0% | 6 |
| cw.megas.Blade 0.8 | 0 | 0% | 6 |

Posture (Hadur's M records, 198 rounds): 122652 melee ticks, 51405 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 40 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 38437 sent, 33755 reached their opponent, 9857 virtual hits (29.2% of those reached).

## Melee bench: F24

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474398. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 143 over 6 battles (23.8 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 84.8 | 90 / 210 | 2.37 | 17.5% | 25390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 17.5% | 90 |
| rz.GlowBlowMelee 1.4 | 2.2 | 14.6% | 43 |
| florent.XSeries.X2 0.12 | 3.0 | 13.5% | 25 |
| davidalves.Phoenix 0.54 | 4.2 | 12.3% | 34 |
| pedersen.Ugluk 1.1.1 | 4.7 | 11.8% | 16 |
| oog.melee.Corsair 1.0 | 6.0 | 9.6% | 4 |
| stelo.SoJNanoMelee 1.1 | 7.2 | 6.1% | 1 |
| as.FrankTheTank 1.3 | 8.3 | 5.3% | 0 |
| lunchie.Lunchbox 0.93 | 8.7 | 5.1% | 0 |
| evd.X1 0.01 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 81.3 | 15 / 35 | 3789 |
| 2 | 1 | 65.8 | 80.0 | 12 / 35 | 4266 |
| 3 | 1 | 68.2 | 87.6 | 16 / 35 | 4500 |
| 4 | 1 | 69.6 | 91.4 | 19 / 35 | 4710 |
| 5 | 1 | 65.7 | 82.5 | 13 / 35 | 4057 |
| 6 | 1 | 67.2 | 86.0 | 15 / 35 | 4068 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 53 | 68% |
| davidalves.Phoenix 0.54 | 28 | 57% |
| florent.XSeries.X2 0.12 | 26 | 62% |
| pedersen.Ugluk 1.1.1 | 18 | 67% |
| oog.melee.Corsair 1.0 | 7 | 71% |
| stelo.SoJNanoMelee 1.1 | 5 | 80% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 817. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 39 | 32% | 61 |
| rz.GlowBlowMelee 1.4 | 31 | 26% | 63 |
| davidalves.Phoenix 0.54 | 20 | 17% | 31 |
| pedersen.Ugluk 1.1.1 | 16 | 13% | 24 |
| oog.melee.Corsair 1.0 | 6 | 5% | 15 |
| stelo.SoJNanoMelee 1.1 | 6 | 5% | 9 |
| as.FrankTheTank 1.3 | 1 | 1% | 4 |
| evd.X1 0.01 | 1 | 1% | 1 |
| lunchie.Lunchbox 0.93 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 139545 melee ticks, 42227 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 39 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 45725 sent, 40835 reached their opponent, 7282 virtual hits (17.8% of those reached).

## Melee bench: F25

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474137. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 146 over 6 battles (24.3 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.6 | 148 / 210 | 1.91 | 20.9% | 22784 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.9% | 148 |
| voidious.mini.BrokenSword 2.0.3 | 2.7 | 14.7% | 13 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 14.5% | 18 |
| jdw.Hurricane 1.4 | 3.3 | 13.5% | 22 |
| ds.Oo 2.2 | 5.0 | 9.5% | 5 |
| adt.Ar2 1.1 | 6.5 | 7.8% | 2 |
| awesomeness.Elite 1.0 | 6.7 | 7.9% | 2 |
| gjr.Cephalosporin 0.1 | 7.8 | 6.7% | 2 |
| amk.ChumbaMini 0.2 | 9.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 91.8 | 24 / 35 | 3604 |
| 2 | 1 | 67.8 | 85.4 | 24 / 35 | 3438 |
| 3 | 1 | 67.7 | 86.1 | 22 / 35 | 3721 |
| 4 | 1 | 70.4 | 92.1 | 28 / 35 | 3974 |
| 5 | 1 | 68.5 | 86.1 | 25 / 35 | 3793 |
| 6 | 1 | 69.9 | 90.4 | 25 / 35 | 4254 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 51 | 96% |
| voidious.micro.BlitzBat 1.05 | 44 | 95% |
| jdw.Hurricane 1.4 | 35 | 83% |
| ds.Oo 2.2 | 10 | 90% |
| awesomeness.Elite 1.0 | 8 | 100% |
| gjr.Cephalosporin 0.1 | 6 | 83% |
| adt.Ar2 1.1 | 6 | 83% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 597. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 17 | 27% | 40 |
| voidious.micro.BlitzBat 1.05 | 15 | 24% | 57 |
| voidious.mini.BrokenSword 2.0.3 | 11 | 18% | 51 |
| ds.Oo 2.2 | 7 | 11% | 24 |
| awesomeness.Elite 1.0 | 4 | 6% | 11 |
| amk.ChumbaMini 0.2 | 4 | 6% | 5 |
| adt.Ar2 1.1 | 3 | 5% | 13 |
| gjr.Cephalosporin 0.1 | 1 | 2% | 7 |

Posture (Hadur's M records, 199 rounds): 121074 melee ticks, 29228 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 48 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 39764 sent, 35435 reached their opponent, 5845 virtual hits (16.5% of those reached).

## Melee bench: F26

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1468295. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 180 over 6 battles (30.0 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 94.1 | 145 / 210 | 1.53 | 21.3% | 39213 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.3% | 145 |
| ak.Fermat 2.0 | 2.0 | 14.9% | 32 |
| lrem.Spectre 0.4.4 | 3.3 | 12.2% | 11 |
| shu.nitro.LENIN .T34 | 3.8 | 12.1% | 17 |
| js.PinBall 1.6 | 5.0 | 10.7% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.2% | 1 |
| gh.mini.GrubbmOne 1.0 | 6.8 | 8.0% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.7% | 1 |
| sample.SpinBot 1.0 | 9.0 | 3.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 93.7 | 25 / 35 | 6654 |
| 2 | 1 | 73.6 | 97.5 | 28 / 35 | 6953 |
| 3 | 1 | 72.0 | 93.3 | 24 / 35 | 6333 |
| 4 | 1 | 71.9 | 94.3 | 22 / 35 | 6274 |
| 5 | 1 | 71.9 | 91.7 | 23 / 35 | 6445 |
| 6 | 1 | 72.6 | 94.3 | 23 / 35 | 6554 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 82 | 71% |
| shu.nitro.LENIN .T34 | 42 | 83% |
| lrem.Spectre 0.4.4 | 38 | 82% |
| jaybot.adv.bots.JayBot 2.0 | 10 | 100% |
| js.PinBall 1.6 | 8 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 1051. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 33 | 51% | 81 |
| shu.nitro.LENIN .T34 | 14 | 22% | 51 |
| lrem.Spectre 0.4.4 | 11 | 17% | 44 |
| js.PinBall 1.6 | 3 | 5% | 13 |
| jaybot.adv.bots.JayBot 2.0 | 2 | 3% | 12 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 2% | 6 |
| gh.mini.GrubbmOne 1.0 | 1 | 2% | 1 |

Posture (Hadur's M records, 199 rounds): 153741 melee ticks, 56530 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 43 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 49922 sent, 45242 reached their opponent, 10699 virtual hits (23.6% of those reached).

## Melee bench: F27

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1489757. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 170 over 6 battles (28.3 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 95.8 | 184 / 210 | 1.38 | 21.7% | 33859 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.7% | 184 |
| mk.Alpha 0.2.1 | 2.0 | 13.5% | 17 |
| sheldor.melee.nano.TestMelee 0.1 | 4.7 | 9.3% | 2 |
| throxbot.ThroxBot 0.1 | 5.2 | 9.0% | 3 |
| EH.Eagle 1.0.6 | 5.3 | 9.1% | 0 |
| wee.Gem 1.8.4 | 6.0 | 8.7% | 3 |
| joe.ADinosaur 1.0 | 6.2 | 8.6% | 1 |
| techdude.kombat.FlamingKombat 1.5 | 6.7 | 8.2% | 0 |
| caimano.Furia_Ceca 0.22 | 8.8 | 6.2% | 0 |
| cs.Grudge 1.0 | 9.2 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 91.4 | 28 / 35 | 5346 |
| 2 | 1 | 72.6 | 99.0 | 33 / 35 | 5767 |
| 3 | 1 | 71.9 | 94.9 | 31 / 35 | 5697 |
| 4 | 1 | 72.1 | 97.5 | 31 / 35 | 5659 |
| 5 | 1 | 72.2 | 97.8 | 31 / 35 | 5789 |
| 6 | 1 | 71.7 | 94.0 | 30 / 35 | 5601 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 106 | 92% |
| EH.Eagle 1.0.6 | 34 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 100% |
| throxbot.ThroxBot 0.1 | 12 | 100% |
| wee.Gem 1.8.4 | 10 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 7 | 100% |
| joe.ADinosaur 1.0 | 6 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |

Hadur died in 26 of 210 rounds, at a mean tick of 661. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 14 | 54% | 84 |
| joe.ADinosaur 1.0 | 5 | 19% | 20 |
| sheldor.melee.nano.TestMelee 0.1 | 2 | 8% | 24 |
| caimano.Furia_Ceca 0.22 | 2 | 8% | 8 |
| throxbot.ThroxBot 0.1 | 1 | 4% | 18 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 4% | 11 |
| cs.Grudge 1.0 | 1 | 4% | 3 |
| EH.Eagle 1.0.6 | 0 | 0% | 26 |
| wee.Gem 1.8.4 | 0 | 0% | 16 |

Posture (Hadur's M records, 198 rounds): 123603 melee ticks, 44423 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 49 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 40556 sent, 35977 reached their opponent, 9266 virtual hits (25.8% of those reached).

## Melee bench: F28

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1494932. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 181 over 6 battles (30.2 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 94.1 | 154 / 210 | 1.53 | 19.8% | 25322 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 19.8% | 154 |
| kid.test.NightFox .2 | 2.0 | 14.4% | 25 |
| uji.Antique 1.0 | 3.2 | 11.7% | 17 |
| pfvicm.Sobieski 7.2.3b | 4.2 | 10.4% | 1 |
| qohnil.blot.BlotBot 3.61 | 4.7 | 10.0% | 5 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.1% | 3 |
| ahr.ice.Ice 1.0.2 | 6.7 | 8.0% | 3 |
| matt.advanced.Katana 1.0 | 8.0 | 6.6% | 2 |
| stelo.PianistNano 1.2 | 9.3 | 5.7% | 1 |
| stelo.Lifestealer 1.0 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 93.7 | 23 / 35 | 4652 |
| 2 | 1 | 70.0 | 96.5 | 27 / 35 | 4164 |
| 3 | 1 | 69.9 | 94.9 | 26 / 35 | 4185 |
| 4 | 1 | 70.3 | 95.6 | 30 / 35 | 4321 |
| 5 | 1 | 68.6 | 90.2 | 25 / 35 | 3859 |
| 6 | 1 | 69.0 | 94.0 | 23 / 35 | 4141 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 81 | 78% |
| uji.Antique 1.0 | 52 | 88% |
| qohnil.blot.BlotBot 3.61 | 20 | 90% |
| pfvicm.Sobieski 7.2.3b | 10 | 100% |
| ahr.ice.Ice 1.0.2 | 9 | 89% |
| amk.ChumbaWumba 0.3 | 9 | 67% |
| matt.advanced.Katana 1.0 | 2 | 100% |
| stelo.PianistNano 1.2 | 2 | 50% |

Hadur died in 58 of 210 rounds, at a mean tick of 838. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 22 | 38% | 64 |
| uji.Antique 1.0 | 10 | 17% | 47 |
| pfvicm.Sobieski 7.2.3b | 9 | 16% | 22 |
| qohnil.blot.BlotBot 3.61 | 6 | 10% | 28 |
| amk.ChumbaWumba 0.3 | 5 | 9% | 14 |
| ahr.ice.Ice 1.0.2 | 3 | 5% | 14 |
| stelo.PianistNano 1.2 | 2 | 3% | 10 |
| matt.advanced.Katana 1.0 | 1 | 2% | 9 |
| stelo.Lifestealer 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 129032 melee ticks, 44867 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 64 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 43524 sent, 38857 reached their opponent, 5567 virtual hits (14.3% of those reached).

## Melee bench: F29

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1490086. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 162 over 6 battles (27.0 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 90.3 | 122 / 210 | 1.88 | 19.8% | 29826 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 19.8% | 122 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 14.9% | 39 |
| deewiant.Anomaly 0.2 | 2.7 | 15.0% | 41 |
| myl.micro.Troodon 1.10 | 4.3 | 11.9% | 2 |
| jok.PheonixM 0.1.2 | 4.8 | 10.2% | 7 |
| ph.melee.ArcherME 0.3 | 5.8 | 8.2% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.2 | 6.2% | 0 |
| DBall.Anarchy 0.1 | 8.2 | 5.1% | 0 |
| ap.Frederick 1.1 | 9.0 | 4.5% | 0 |
| jangs.ns51 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 88.6 | 16 / 35 | 4525 |
| 2 | 1 | 70.6 | 88.9 | 22 / 35 | 4945 |
| 3 | 1 | 69.9 | 90.5 | 17 / 35 | 4918 |
| 4 | 1 | 71.4 | 94.0 | 23 / 35 | 4923 |
| 5 | 1 | 71.2 | 92.4 | 24 / 35 | 5231 |
| 6 | 1 | 70.1 | 87.3 | 20 / 35 | 5284 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 71 | 66% |
| zyx.mega.YersiniaPestis 3.1 | 47 | 66% |
| jok.PheonixM 0.1.2 | 22 | 77% |
| myl.micro.Troodon 1.10 | 20 | 100% |
| jangs.ns51 1.0 | 3 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |
| DBall.Anarchy 0.1 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 1057. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 40 | 45% | 89 |
| zyx.mega.YersiniaPestis 3.1 | 34 | 38% | 73 |
| jok.PheonixM 0.1.2 | 9 | 10% | 21 |
| myl.micro.Troodon 1.10 | 2 | 2% | 17 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 5 |
| DBall.Anarchy 0.1 | 1 | 1% | 2 |
| jangs.ns51 1.0 | 1 | 1% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 201 rounds): 170516 melee ticks, 58375 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 55 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 54131 sent, 49490 reached their opponent, 7548 virtual hits (15.3% of those reached).

## Melee bench: F30

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1475262. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 139 over 6 battles (23.2 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 81.8 | 79 / 210 | 2.45 | 18.7% | 26139 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 18.7% | 79 |
| darkcanuck.B26354 1.06 | 2.0 | 16.2% | 66 |
| stelo.PastFuture 2.3.2 | 3.3 | 14.8% | 22 |
| oog.melee.Capulet 1.2 | 3.7 | 14.2% | 31 |
| intruder.PrairieWolf 2.61 | 5.0 | 10.1% | 6 |
| tripphippy.Alice 1.1 | 6.7 | 8.0% | 3 |
| ntc.Opposite 1.5 | 6.7 | 8.0% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 7.7 | 7.0% | 3 |
| GarmBox.Anger 1.0 | 9.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 86.4 | 13 / 35 | 4772 |
| 2 | 1 | 68.0 | 84.6 | 16 / 35 | 4672 |
| 3 | 1 | 63.7 | 75.4 | 8 / 35 | 3950 |
| 4 | 1 | 66.4 | 83.2 | 15 / 35 | 4119 |
| 5 | 1 | 65.8 | 80.0 | 14 / 35 | 4249 |
| 6 | 1 | 66.4 | 81.4 | 13 / 35 | 4377 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 44 | 48% |
| oog.melee.Capulet 1.2 | 42 | 60% |
| stelo.PastFuture 2.3.2 | 25 | 68% |
| intruder.PrairieWolf 2.61 | 9 | 89% |
| tripphippy.Alice 1.1 | 5 | 80% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 75% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 943. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 41 | 31% | 65 |
| stelo.PastFuture 2.3.2 | 31 | 24% | 47 |
| oog.melee.Capulet 1.2 | 28 | 21% | 54 |
| tripphippy.Alice 1.1 | 12 | 9% | 17 |
| intruder.PrairieWolf 2.61 | 10 | 8% | 17 |
| fowl3628800.LightningBolt 2.6.0 | 7 | 5% | 7 |
| ntc.Opposite 1.5 | 2 | 2% | 3 |

Posture (Hadur's M records, 200 rounds): 161582 melee ticks, 40584 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 42 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 46953 sent, 42683 reached their opponent, 7437 virtual hits (17.4% of those reached).

## Melee bench: F31

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1514551. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 154 over 6 battles (25.7 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 83.0 | 76 / 210 | 2.53 | 16.8% | 23744 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.3 | 17.9% | 87 |
| hadur117.Hadur 3.21bb | 1.7 | 16.8% | 76 |
| gh.mini.Griezel 0.2 | 3.0 | 13.1% | 34 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.4% | 4 |
| spinnercat.micro.Tyger 0.1 | 5.0 | 10.4% | 5 |
| gh.nano.Grofvuil 0.2 | 5.7 | 9.7% | 2 |
| timmit.nano.TimDog 0.33 | 7.3 | 6.5% | 2 |
| fm.mammillarias 1.3 | 7.8 | 5.3% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 4.5% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 86.7 | 16 / 35 | 4196 |
| 2 | 2 | 65.5 | 82.2 | 8 / 35 | 3837 |
| 3 | 1 | 68.4 | 88.6 | 17 / 35 | 4310 |
| 4 | 2 | 64.7 | 78.1 | 14 / 35 | 3632 |
| 5 | 2 | 64.0 | 78.4 | 6 / 35 | 3890 |
| 6 | 2 | 66.7 | 84.1 | 15 / 35 | 3879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 70 | 44% |
| gh.mini.Griezel 0.2 | 39 | 51% |
| d414.nano.Quantum 1.0.0 | 12 | 100% |
| spinnercat.micro.Tyger 0.1 | 10 | 80% |
| gh.nano.Grofvuil 0.2 | 4 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 891. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 56 | 42% | 86 |
| gh.mini.Griezel 0.2 | 33 | 25% | 55 |
| d414.nano.Quantum 1.0.0 | 15 | 11% | 22 |
| spinnercat.micro.Tyger 0.1 | 14 | 10% | 19 |
| gh.nano.Grofvuil 0.2 | 9 | 7% | 18 |
| timmit.nano.TimDog 0.33 | 4 | 3% | 6 |
| fm.mammillarias 1.3 | 2 | 1% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 199 rounds): 152078 melee ticks, 38543 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 32 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 48394 sent, 43666 reached their opponent, 6971 virtual hits (16.0% of those reached).

## Melee bench: F32

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1486931. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 171 over 6 battles (28.5 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 90.6 | 128 / 210 | 1.84 | 19.2% | 29816 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 19.2% | 128 |
| kawigi.sbf.FloodHT 0.9.2 | 2.2 | 14.6% | 44 |
| apc.botM 3.0 | 3.2 | 12.0% | 18 |
| lxx.ConceptA 0.8 | 3.8 | 11.1% | 4 |
| vjik.UnViolation 1.1 | 5.0 | 9.7% | 9 |
| bayen.UbaMicro 1.4 | 6.0 | 8.3% | 2 |
| panzer.Panzer 0.2 | 6.8 | 7.6% | 1 |
| yk.JahMicro 1.0 | 8.0 | 6.6% | 3 |
| conscience.Electron 1.3g | 9.2 | 5.9% | 0 |
| donjezza.Jezza 1.0 | 9.8 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 87.3 | 20 / 35 | 4988 |
| 2 | 1 | 70.3 | 95.2 | 25 / 35 | 5218 |
| 3 | 1 | 69.6 | 92.4 | 26 / 35 | 4747 |
| 4 | 1 | 68.9 | 92.4 | 19 / 35 | 4901 |
| 5 | 1 | 68.3 | 87.6 | 20 / 35 | 5067 |
| 6 | 1 | 68.4 | 88.9 | 18 / 35 | 4895 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 86 | 69% |
| apc.botM 3.0 | 42 | 71% |
| vjik.UnViolation 1.1 | 17 | 65% |
| lxx.ConceptA 0.8 | 16 | 88% |
| donjezza.Jezza 1.0 | 5 | 100% |
| yk.JahMicro 1.0 | 4 | 75% |
| bayen.UbaMicro 1.4 | 4 | 75% |
| panzer.Panzer 0.2 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 811. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 37 | 45% | 92 |
| apc.botM 3.0 | 17 | 20% | 44 |
| lxx.ConceptA 0.8 | 10 | 12% | 21 |
| vjik.UnViolation 1.1 | 7 | 8% | 26 |
| panzer.Panzer 0.2 | 4 | 5% | 7 |
| bayen.UbaMicro 1.4 | 4 | 5% | 5 |
| yk.JahMicro 1.0 | 2 | 2% | 7 |
| conscience.Electron 1.3g | 1 | 1% | 4 |
| donjezza.Jezza 1.0 | 1 | 1% | 4 |

Posture (Hadur's M records, 198 rounds): 119904 melee ticks, 54803 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 58 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 2.

Targeting waves (198 rounds): 41028 sent, 36292 reached their opponent, 6681 virtual hits (18.4% of those reached).

## Melee bench: F33

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1484311. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 146 over 6 battles (24.3 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 90.0 | 131 / 210 | 1.80 | 22.2% | 30479 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 22.2% | 131 |
| maribo.Quester 0.3 | 2.0 | 17.1% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 14.7% | 24 |
| labg.Cataclysm 2.05 | 4.2 | 11.8% | 12 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.3 | 9.9% | 6 |
| baal.nano.N 1.42 | 5.5 | 9.9% | 1 |
| zyx.micro.Ant 1.1 | 7.3 | 6.1% | 1 |
| sanja.First 0.1 | 7.7 | 5.6% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 92.9 | 25 / 35 | 5207 |
| 2 | 1 | 71.2 | 90.7 | 24 / 35 | 5202 |
| 3 | 1 | 70.2 | 87.1 | 20 / 35 | 4913 |
| 4 | 1 | 71.0 | 91.4 | 20 / 35 | 4857 |
| 5 | 1 | 70.2 | 87.9 | 20 / 35 | 5040 |
| 6 | 1 | 71.1 | 90.0 | 22 / 35 | 5260 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 81 | 75% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 53 | 75% |
| labg.Cataclysm 2.05 | 21 | 81% |
| kinsen.melee.Angsaichmophobia 1.8c | 11 | 73% |
| baal.nano.N 1.42 | 4 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 1071. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 31 | 39% | 96 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 25% | 57 |
| labg.Cataclysm 2.05 | 11 | 14% | 27 |
| kinsen.melee.Angsaichmophobia 1.8c | 11 | 14% | 18 |
| baal.nano.N 1.42 | 6 | 8% | 9 |
| zyx.micro.Ant 1.1 | 1 | 1% | 3 |

Posture (Hadur's M records, 198 rounds): 160155 melee ticks, 58743 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 63 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 46601 sent, 42533 reached their opponent, 6317 virtual hits (14.9% of those reached).

## Melee bench: F34

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488213. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 127 over 6 battles (21.2 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.4 | 92 / 210 | 2.04 | 18.9% | 32797 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 18.9% | 92 |
| kid.Gladiator .7.2 | 2.3 | 17.0% | 50 |
| stelo.Spread 0.9 | 2.7 | 15.8% | 50 |
| jcs.Seth 1.8 | 4.2 | 11.3% | 17 |
| tcf.Reach 3 | 4.8 | 10.4% | 2 |
| cli.Dancer 1.1 | 6.0 | 9.2% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 6.5% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.1% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.2% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 90.2 | 16 / 35 | 5773 |
| 2 | 1 | 69.8 | 87.6 | 15 / 35 | 5489 |
| 3 | 1 | 69.1 | 86.7 | 14 / 35 | 5381 |
| 4 | 1 | 69.4 | 89.5 | 16 / 35 | 5096 |
| 5 | 1 | 70.2 | 90.5 | 18 / 35 | 5415 |
| 6 | 1 | 69.4 | 86.0 | 13 / 35 | 5643 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 68 | 56% |
| stelo.Spread 0.9 | 65 | 62% |
| jcs.Seth 1.8 | 17 | 41% |
| tcf.Reach 3 | 5 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |
| cli.Dancer 1.1 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 1143. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 56 | 47% | 85 |
| stelo.Spread 0.9 | 39 | 33% | 81 |
| jcs.Seth 1.8 | 14 | 12% | 22 |
| tcf.Reach 3 | 7 | 6% | 14 |
| cli.Dancer 1.1 | 1 | 1% | 4 |
| ratosh.Wesco 1.4 | 1 | 1% | 2 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 173308 melee ticks, 59610 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 65 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 52055 sent, 47357 reached their opponent, 7826 virtual hits (16.5% of those reached).

## Melee bench: F35

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1491816. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 134 over 6 battles (22.3 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 84.0 | 44 / 210 | 2.44 | 16.3% | 23151 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.6% | 138 |
| hadur117.Hadur 3.21bb | 2.0 | 16.3% | 44 |
| gh.mini.Gruwel 0.9 | 3.5 | 12.8% | 20 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.8 | 12.1% | 7 |
| rz.HawkOnFire 0.1 | 4.7 | 11.4% | 2 |
| wit.Chuliath 1.0 | 6.0 | 6.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 5.7% | 1 |
| myl.nano.KomoriNinja 1.1 | 8.0 | 5.5% | 0 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.0% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 77.1 | 7 / 35 | 3555 |
| 2 | 2 | 66.3 | 84.4 | 9 / 35 | 3796 |
| 3 | 2 | 66.4 | 86.3 | 6 / 35 | 4126 |
| 4 | 2 | 66.1 | 84.4 | 9 / 35 | 3958 |
| 5 | 2 | 66.6 | 86.0 | 8 / 35 | 3938 |
| 6 | 2 | 65.4 | 85.7 | 5 / 35 | 3778 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 96 | 16% |
| gh.mini.Gruwel 0.9 | 19 | 42% |
| dmh.robocode.robot.BlackDeath 9.2 | 13 | 69% |
| rz.HawkOnFire 0.1 | 11 | 91% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 168 of 210 rounds, at a mean tick of 1017. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 103 | 61% | 120 |
| gh.mini.Gruwel 0.9 | 30 | 18% | 42 |
| dmh.robocode.robot.BlackDeath 9.2 | 20 | 12% | 31 |
| rz.HawkOnFire 0.1 | 8 | 5% | 10 |
| wit.Chuliath 1.0 | 2 | 1% | 3 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 2 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 1 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 149952 melee ticks, 52645 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 34 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 45337 sent, 40441 reached their opponent, 6011 virtual hits (14.9% of those reached).

## Melee bench: F36

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1487733. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 201 over 6 battles (33.5 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 93.0 | 157 / 210 | 1.63 | 21.0% | 33441 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.0% | 157 |
| alpha.RainingFire 1.0 | 2.7 | 12.1% | 15 |
| bzdp.Pansy 2.1 | 3.0 | 12.1% | 14 |
| bvh.micro.Freya 0.3 | 4.0 | 11.3% | 10 |
| mz.Cork 0.1 | 4.8 | 10.6% | 7 |
| m3thos.Eva02 0.7.1 | 6.2 | 9.3% | 4 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.6% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 5.2% | 0 |
| dl.BetterWalls 1.0 | 8.7 | 5.0% | 1 |
| sample.MyFirstRobot 1.0 | 9.8 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 91.4 | 26 / 35 | 5294 |
| 2 | 1 | 71.4 | 93.7 | 26 / 35 | 5358 |
| 3 | 1 | 72.2 | 94.0 | 27 / 35 | 6026 |
| 4 | 1 | 71.3 | 92.4 | 26 / 35 | 5621 |
| 5 | 1 | 71.6 | 93.7 | 25 / 35 | 5732 |
| 6 | 1 | 71.1 | 93.0 | 27 / 35 | 5410 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 45 | 82% |
| bvh.micro.Freya 0.3 | 43 | 86% |
| mz.Cork 0.1 | 33 | 85% |
| alpha.RainingFire 1.0 | 26 | 81% |
| m3thos.Eva02 0.7.1 | 15 | 87% |
| bvh.mini.Fenrir 0.39 | 15 | 100% |
| dl.BetterWalls 1.0 | 3 | 100% |
| sample.MyFirstRobot 1.0 | 2 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 865. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 14 | 26% | 41 |
| bzdp.Pansy 2.1 | 13 | 24% | 57 |
| mz.Cork 0.1 | 8 | 15% | 39 |
| bvh.micro.Freya 0.3 | 8 | 15% | 31 |
| m3thos.Eva02 0.7.1 | 3 | 6% | 17 |
| bvh.mini.Fenrir 0.39 | 3 | 6% | 11 |
| dl.BetterWalls 1.0 | 3 | 6% | 8 |
| squidM.TentalceMeleeNano 1.1 | 2 | 4% | 5 |

Posture (Hadur's M records, 198 rounds): 140967 melee ticks, 47777 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 65 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 48601 sent, 44143 reached their opponent, 9227 virtual hits (20.9% of those reached).

## Melee bench: F37

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1479948. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 221 over 6 battles (36.8 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.5 | 163 / 210 | 2.04 | 19.5% | 34663 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 19.5% | 163 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.3 | 10.2% | 6 |
| germ.TheMind .2 | 3.3 | 10.3% | 6 |
| EBBU.Sim2 1.02 | 4.2 | 9.8% | 5 |
| agrach.Dalek 1.0 | 5.3 | 9.4% | 10 |
| mn.nano.perceptual.Impact 1.3.0 | 5.5 | 9.2% | 2 |
| stelo.UntouchableNano 1.3 | 7.0 | 8.4% | 7 |
| lmk.ACPFinal 0.1 | 7.8 | 8.1% | 3 |
| mb.Beast 0.1 | 8.5 | 7.8% | 7 |
| skm.Ryubot 1.0 | 9.0 | 7.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 89.5 | 28 / 35 | 5796 |
| 2 | 1 | 68.8 | 88.6 | 27 / 35 | 5851 |
| 3 | 1 | 68.4 | 88.6 | 27 / 35 | 5438 |
| 4 | 1 | 67.7 | 84.8 | 27 / 35 | 5549 |
| 5 | 1 | 70.0 | 92.1 | 30 / 35 | 6137 |
| 6 | 1 | 68.1 | 87.3 | 24 / 35 | 5892 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 35 | 94% |
| EBBU.Sim2 1.02 | 27 | 100% |
| germ.TheMind .2 | 26 | 100% |
| mb.Beast 0.1 | 20 | 95% |
| com.syncleus.robocode.Dreadnaught 0.1 | 20 | 95% |
| stelo.UntouchableNano 1.3 | 19 | 89% |
| skm.Ryubot 1.0 | 10 | 100% |
| lmk.ACPFinal 0.1 | 9 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 375. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 18 | 38% | 26 |
| com.syncleus.robocode.Dreadnaught 0.1 | 7 | 15% | 29 |
| lmk.ACPFinal 0.1 | 7 | 15% | 20 |
| agrach.Dalek 1.0 | 5 | 11% | 41 |
| EBBU.Sim2 1.02 | 5 | 11% | 30 |
| stelo.UntouchableNano 1.3 | 2 | 4% | 17 |
| mb.Beast 0.1 | 2 | 4% | 16 |
| germ.TheMind .2 | 1 | 2% | 24 |
| skm.Ryubot 1.0 | 0 | 0% | 5 |

Posture (Hadur's M records, 198 rounds): 93074 melee ticks, 25168 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 41 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 31400 sent, 27007 reached their opponent, 8223 virtual hits (30.4% of those reached).

## Melee bench: F38

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488171. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 153 over 6 battles (25.5 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 89.7 | 116 / 210 | 1.92 | 18.8% | 28261 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.2 | 18.8% | 116 |
| justin.Mallais 14.0 | 1.8 | 16.2% | 57 |
| bvh.mini.Freya 0.55 | 3.5 | 12.1% | 10 |
| bts.mega.Gnarly 1.4 | 3.8 | 11.3% | 18 |
| cs.Wren 1.0 | 4.8 | 10.3% | 3 |
| kdf.KoulDestroyer 1.0 | 5.8 | 9.5% | 3 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.0 | 7.8% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.4% | 2 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.0% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.0 | 85.4 | 15 / 35 | 4228 |
| 2 | 1 | 68.9 | 89.2 | 19 / 35 | 5006 |
| 3 | 1 | 70.1 | 93.0 | 22 / 35 | 4782 |
| 4 | 1 | 69.3 | 91.4 | 19 / 35 | 4819 |
| 5 | 1 | 68.8 | 89.5 | 21 / 35 | 4579 |
| 6 | 1 | 69.2 | 89.8 | 20 / 35 | 4847 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 76 | 66% |
| bts.mega.Gnarly 1.4 | 29 | 69% |
| bvh.mini.Freya 0.55 | 25 | 80% |
| cs.Wren 1.0 | 14 | 86% |
| kdf.KoulDestroyer 1.0 | 8 | 75% |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 100% |
| matt.UnderDark3 2.4.34 | 2 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 45 | 48% | 99 |
| bts.mega.Gnarly 1.4 | 17 | 18% | 40 |
| bvh.mini.Freya 0.55 | 15 | 16% | 27 |
| kdf.KoulDestroyer 1.0 | 10 | 11% | 16 |
| cs.Wren 1.0 | 6 | 6% | 17 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 6 |
| davidalves.net.DuelistNanoMelee 1.01 | 0 | 0% | 4 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 1 |

Posture (Hadur's M records, 203 rounds): 142008 melee ticks, 44208 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 50 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 45834 sent, 40789 reached their opponent, 8619 virtual hits (21.1% of those reached).

## Melee bench: F39

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1481646. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 144 over 6 battles (24.0 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 91.7 | 131 / 210 | 1.67 | 22.1% | 33113 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 22.1% | 131 |
| bvh.fry.Freya 0.82 | 2.0 | 16.8% | 24 |
| az.Ololobot 0.2.4 | 3.0 | 14.5% | 51 |
| winamp32.micro.MicroMacro 1.0 | 4.7 | 9.6% | 0 |
| apollokidd.ApolloKidd 0.9 | 5.2 | 8.9% | 1 |
| gimp.GimpBot 0.1 | 5.8 | 8.7% | 2 |
| stelo.SoRobotNanoMelee 1.2 | 6.3 | 8.0% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.2 | 6.0% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 92.1 | 25 / 35 | 5608 |
| 2 | 1 | 70.7 | 92.1 | 23 / 35 | 5550 |
| 3 | 1 | 69.9 | 91.1 | 20 / 35 | 5386 |
| 4 | 1 | 70.5 | 93.6 | 20 / 35 | 5585 |
| 5 | 1 | 69.9 | 91.8 | 18 / 35 | 5415 |
| 6 | 1 | 70.2 | 89.3 | 25 / 35 | 5569 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 83 | 84% |
| az.Ololobot 0.2.4 | 74 | 54% |
| winamp32.micro.MicroMacro 1.0 | 11 | 100% |
| gimp.GimpBot 0.1 | 6 | 67% |
| stelo.SoRobotNanoMelee 1.2 | 4 | 100% |
| apollokidd.ApolloKidd 0.9 | 3 | 67% |

Hadur died in 79 of 210 rounds, at a mean tick of 1147. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 44 | 56% | 89 |
| bvh.fry.Freya 0.82 | 25 | 32% | 68 |
| gimp.GimpBot 0.1 | 4 | 5% | 11 |
| winamp32.micro.MicroMacro 1.0 | 2 | 3% | 18 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 3% | 3 |
| apollokidd.ApolloKidd 0.9 | 1 | 1% | 11 |
| stelo.SoRobotNanoMelee 1.2 | 1 | 1% | 9 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 153075 melee ticks, 65673 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 47 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 45034 sent, 40859 reached their opponent, 7775 virtual hits (19.0% of those reached).

## Melee bench: F40

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1476714. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 181 over 6 battles (30.2 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 92.0 | 142 / 210 | 1.72 | 20.4% | 31818 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.4% | 142 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.9% | 39 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.8% | 15 |
| mz.AntiGrav 1.0 | 4.2 | 11.1% | 6 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.0% | 4 |
| stelo.Randomness 1.0 | 5.7 | 9.2% | 3 |
| alpha.BlackIce 1.0 | 7.0 | 8.5% | 1 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.2% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.3 | 3.7% | 0 |
| sample.Corners 1.0 | 9.7 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 94.9 | 28 / 35 | 5235 |
| 2 | 1 | 70.2 | 90.2 | 20 / 35 | 5228 |
| 3 | 1 | 72.1 | 96.2 | 27 / 35 | 5592 |
| 4 | 1 | 70.2 | 89.2 | 22 / 35 | 5234 |
| 5 | 1 | 70.4 | 89.8 | 23 / 35 | 5195 |
| 6 | 1 | 70.8 | 91.7 | 22 / 35 | 5334 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 67 | 73% |
| kano.gamma.KanoGamma 1.8 | 40 | 83% |
| mz.AntiGrav 1.0 | 28 | 89% |
| Polkwane.SmashMelee 1.0 | 19 | 89% |
| stelo.Randomness 1.0 | 15 | 87% |
| alpha.BlackIce 1.0 | 4 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 29 | 43% | 66 |
| kano.gamma.KanoGamma 1.8 | 13 | 19% | 50 |
| stelo.Randomness 1.0 | 7 | 10% | 28 |
| Polkwane.SmashMelee 1.0 | 6 | 9% | 22 |
| mz.AntiGrav 1.0 | 6 | 9% | 22 |
| amk.superstrike.SuperStrike 0.3 | 5 | 7% | 8 |
| alpha.BlackIce 1.0 | 2 | 3% | 8 |
| sample.Corners 1.0 | 0 | 0% | 4 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 152043 melee ticks, 44534 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 78 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 78 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 49068 sent, 44290 reached their opponent, 8964 virtual hits (20.2% of those reached).

## Melee bench: F41

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1496162. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 140 over 6 battles (23.3 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 88.4 | 106 / 210 | 2.05 | 18.5% | 27883 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 18.5% | 106 |
| eem.EvBotNG v12.8 | 2.0 | 16.1% | 77 |
| ary.Swarm 1.1 | 3.5 | 12.8% | 7 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.8% | 13 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.2% | 5 |
| shrub.Silver v048 | 6.0 | 8.9% | 0 |
| zyx.nano.Ant 1.1 | 6.8 | 7.7% | 1 |
| stelo.Mirror 1.1 | 8.5 | 5.5% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 5.3% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 85.1 | 19 / 35 | 4639 |
| 2 | 1 | 70.6 | 93.7 | 22 / 35 | 4779 |
| 3 | 1 | 69.7 | 90.5 | 18 / 35 | 4783 |
| 4 | 1 | 68.9 | 90.8 | 15 / 35 | 4762 |
| 5 | 1 | 67.5 | 84.1 | 17 / 35 | 4648 |
| 6 | 1 | 67.7 | 86.0 | 15 / 35 | 4272 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 75 | 39% |
| lessonz.robocode.Oz 0.5.0 | 38 | 95% |
| ary.Swarm 1.1 | 30 | 93% |
| simonton.nano.MeleeSeed 1.8 | 11 | 91% |
| shrub.Silver v048 | 3 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 972. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 64 | 62% | 95 |
| lessonz.robocode.Oz 0.5.0 | 18 | 17% | 44 |
| ary.Swarm 1.1 | 8 | 8% | 27 |
| simonton.nano.MeleeSeed 1.8 | 6 | 6% | 20 |
| shrub.Silver v048 | 4 | 4% | 12 |
| stelo.Mirror 1.1 | 2 | 2% | 5 |
| jsal.Jsalbot 1.0 | 1 | 1% | 6 |
| zyx.nano.Ant 1.1 | 1 | 1% | 1 |

Posture (Hadur's M records, 198 rounds): 151951 melee ticks, 46470 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 81 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 81 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 48914 sent, 44269 reached their opponent, 6919 virtual hits (15.6% of those reached).

## Melee bench: F42

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1490327. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 160 over 6 battles (26.7 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 93.3 | 150 / 210 | 1.60 | 20.9% | 36211 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.9% | 150 |
| wompi.Wallaby 5.1 | 2.0 | 15.0% | 22 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.4% | 13 |
| ara.Shera 0.88 | 3.7 | 12.8% | 24 |
| amz.NanoClone 1.41 | 5.0 | 8.5% | 0 |
| dsw.StaticD 1.0 | 6.5 | 7.1% | 1 |
| maribo.IotaCT 1.1 | 6.8 | 6.6% | 0 |
| stelo.MirrorMicro 1.0 | 8.0 | 5.9% | 0 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 94.0 | 27 / 35 | 6570 |
| 2 | 1 | 70.7 | 94.3 | 23 / 35 | 5669 |
| 3 | 1 | 71.6 | 94.9 | 27 / 35 | 5811 |
| 4 | 1 | 71.2 | 91.1 | 23 / 35 | 6088 |
| 5 | 1 | 71.8 | 95.2 | 26 / 35 | 6084 |
| 6 | 1 | 70.8 | 90.5 | 24 / 35 | 5989 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 87 | 90% |
| maribo.mini.MiniQuester 0.1 | 51 | 92% |
| ara.Shera 0.88 | 31 | 61% |
| dsw.StaticD 1.0 | 3 | 100% |
| mme.NikeEnhanced 2.0 | 2 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 1004. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 25 | 42% | 51 |
| wompi.Wallaby 5.1 | 19 | 32% | 84 |
| maribo.mini.MiniQuester 0.1 | 10 | 17% | 54 |
| amz.NanoClone 1.41 | 4 | 7% | 5 |
| dsw.StaticD 1.0 | 2 | 3% | 11 |
| maribo.IotaCT 1.1 | 0 | 0% | 3 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 162180 melee ticks, 51769 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 33 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 50196 sent, 45522 reached their opponent, 8779 virtual hits (19.3% of those reached).

## Melee bench: F43

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1480405. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 155 over 6 battles (25.8 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 83.3 | 40 / 210 | 2.50 | 16.7% | 26493 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.2% | 133 |
| hadur117.Hadur 3.21bb | 2.0 | 16.7% | 40 |
| brainfade.melee.Dusk 0.44 | 3.0 | 12.9% | 26 |
| wcsv.melee.EngineerMelee 0.1 | 4.5 | 11.4% | 6 |
| dummy.micro.Sparrow 2.5 | 4.5 | 11.1% | 3 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.1% | 1 |
| mz.NanoGod 2.02 | 7.5 | 7.4% | 1 |
| jab.DiamondStealer 5 | 7.5 | 7.4% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.3% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.4 | 84.1 | 7 / 35 | 4397 |
| 2 | 2 | 68.0 | 85.4 | 10 / 35 | 4509 |
| 3 | 2 | 68.5 | 85.4 | 9 / 35 | 4544 |
| 4 | 2 | 65.0 | 76.5 | 2 / 35 | 4162 |
| 5 | 2 | 67.0 | 82.5 | 6 / 35 | 4246 |
| 6 | 2 | 68.1 | 85.7 | 6 / 35 | 4635 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 96 | 24% |
| brainfade.melee.Dusk 0.44 | 23 | 39% |
| wcsv.melee.EngineerMelee 0.1 | 7 | 43% |
| dummy.micro.Sparrow 2.5 | 7 | 57% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 1044. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 104 | 61% | 128 |
| brainfade.melee.Dusk 0.44 | 35 | 21% | 45 |
| dummy.micro.Sparrow 2.5 | 15 | 9% | 18 |
| wcsv.melee.EngineerMelee 0.1 | 7 | 4% | 10 |
| mz.NanoGod 2.02 | 5 | 3% | 5 |
| Krabb.akim2.Akim2 1.1b | 2 | 1% | 2 |
| jab.DiamondStealer 5 | 2 | 1% | 2 |

Posture (Hadur's M records, 199 rounds): 155613 melee ticks, 58224 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 48 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 48955 sent, 44107 reached their opponent, 7108 virtual hits (16.1% of those reached).

## Melee bench: F44

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1480149. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 153 over 6 battles (25.5 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 93.7 | 146 / 210 | 1.57 | 21.2% | 35971 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.2% | 146 |
| stelo.Liblix 0.3.1 | 2.0 | 15.9% | 41 |
| tzu.TheArtOfWar 1.2 | 3.0 | 14.6% | 17 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.3 | 9.4% | 0 |
| jwirde.Gort 2.0 | 5.3 | 8.7% | 3 |
| stf.PanzerGeneral 0.1 | 6.8 | 7.1% | 1 |
| disan.Chair 2.2.0 | 6.8 | 7.1% | 0 |
| wompi.Quokka 1.6 | 6.8 | 7.2% | 2 |
| sample.Crazy 1.0 | 9.3 | 4.5% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 91.4 | 28 / 35 | 5987 |
| 2 | 1 | 71.3 | 93.0 | 23 / 35 | 5743 |
| 3 | 1 | 71.9 | 94.6 | 22 / 35 | 5940 |
| 4 | 1 | 72.3 | 94.3 | 22 / 35 | 6190 |
| 5 | 1 | 71.8 | 93.7 | 25 / 35 | 6007 |
| 6 | 1 | 72.3 | 94.9 | 26 / 35 | 6104 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 93 | 75% |
| tzu.TheArtOfWar 1.2 | 68 | 82% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 100% |
| jwirde.Gort 2.0 | 8 | 88% |
| stf.PanzerGeneral 0.1 | 2 | 50% |
| disan.Chair 2.2.0 | 2 | 100% |
| wompi.Quokka 1.6 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 949. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 32 | 50% | 100 |
| tzu.TheArtOfWar 1.2 | 19 | 30% | 65 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 8% | 12 |
| jwirde.Gort 2.0 | 4 | 6% | 17 |
| wompi.Quokka 1.6 | 2 | 3% | 6 |
| disan.Chair 2.2.0 | 1 | 2% | 5 |
| stf.PanzerGeneral 0.1 | 1 | 2% | 2 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 2 |
| sample.Crazy 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 150713 melee ticks, 49978 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 32 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 51460 sent, 46840 reached their opponent, 9651 virtual hits (20.6% of those reached).

## Melee bench: F45

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1500572. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 152 over 6 battles (25.3 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 91.0 | 117 / 210 | 1.81 | 20.4% | 33728 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.4% | 117 |
| jje.BagPuss 1.2 | 3.0 | 12.1% | 7 |
| eem.IWillFireNoBullet v2.8 | 3.2 | 11.5% | 67 |
| sul.Lunar 1.1 | 3.8 | 11.1% | 12 |
| myl.nano.Graviton 1.10 | 4.7 | 10.5% | 0 |
| hvilela.HVilela 0.9 | 6.3 | 8.6% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 6.8 | 8.5% | 4 |
| fm.claire 1.7 | 7.2 | 8.3% | 0 |
| wit.Deep7 2.0 | 9.2 | 5.0% | 2 |
| abud.ThirdRobo 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 91.1 | 20 / 35 | 5822 |
| 2 | 1 | 71.1 | 91.7 | 22 / 35 | 5969 |
| 3 | 1 | 69.1 | 89.8 | 17 / 35 | 4987 |
| 4 | 1 | 70.2 | 90.5 | 19 / 35 | 5429 |
| 5 | 1 | 70.4 | 89.5 | 17 / 35 | 5876 |
| 6 | 1 | 71.1 | 93.0 | 22 / 35 | 5645 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 82 | 43% |
| sul.Lunar 1.1 | 28 | 82% |
| jje.BagPuss 1.2 | 27 | 85% |
| myl.nano.Graviton 1.10 | 22 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 13 | 92% |
| hvilela.HVilela 0.9 | 1 | 0% |
| fm.claire 1.7 | 1 | 100% |
| wit.Deep7 2.0 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 1702. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 51 | 54% | 0 |
| sul.Lunar 1.1 | 12 | 13% | 55 |
| jje.BagPuss 1.2 | 11 | 12% | 66 |
| myl.nano.Graviton 1.10 | 7 | 7% | 34 |
| hvilela.HVilela 0.9 | 5 | 5% | 11 |
| pez.mini.ChironexFleckeri 0.5 | 4 | 4% | 28 |
| fm.claire 1.7 | 2 | 2% | 10 |
| wit.Deep7 2.0 | 2 | 2% | 5 |

Posture (Hadur's M records, 198 rounds): 192847 melee ticks, 92793 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 55 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 59024 sent, 54330 reached their opponent, 8069 virtual hits (14.9% of those reached).

## Melee bench: F46

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488314. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 114 over 6 battles (19.0 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 91.6 | 130 / 210 | 1.67 | 21.7% | 30152 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.7% | 130 |
| kc.mini.Mirage 0.2 | 2.0 | 19.3% | 65 |
| mz.MicroSheep 1.0 | 3.5 | 12.1% | 3 |
| cx.Princess 1.0 | 3.8 | 11.7% | 12 |
| sadoner.killer 0.2 | 5.0 | 10.6% | 0 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.8% | 0 |
| jeremyreeder.collective.Prophet 5 | 6.7 | 7.2% | 0 |
| kurios.DOSexe .9a | 8.2 | 5.1% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 93.6 | 25 / 35 | 5131 |
| 2 | 1 | 70.3 | 92.1 | 20 / 35 | 4789 |
| 3 | 1 | 71.1 | 94.6 | 22 / 35 | 5205 |
| 4 | 1 | 69.2 | 89.3 | 21 / 35 | 4582 |
| 5 | 1 | 70.9 | 92.1 | 23 / 35 | 5160 |
| 6 | 1 | 69.7 | 87.9 | 19 / 35 | 5285 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 136 | 72% |
| cx.Princess 1.0 | 15 | 73% |
| mz.MicroSheep 1.0 | 14 | 93% |
| arthord.NanoSatanMelee Beta | 6 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 964. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 54 | 67% | 147 |
| cx.Princess 1.0 | 12 | 15% | 18 |
| mz.MicroSheep 1.0 | 6 | 7% | 18 |
| arthord.NanoSatanMelee Beta | 4 | 5% | 11 |
| sadoner.killer 0.2 | 2 | 2% | 7 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 4 |
| kurios.DOSexe .9a | 1 | 1% | 3 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 1 |

Posture (Hadur's M records, 199 rounds): 142481 melee ticks, 58829 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 24 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 39550 sent, 35237 reached their opponent, 5719 virtual hits (16.2% of those reached).

