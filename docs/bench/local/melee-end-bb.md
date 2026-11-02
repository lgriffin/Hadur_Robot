# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1556498. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 157 over 6 battles (26.2 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 85.9 | 46 / 210 | 2.27 | 17.4% | 31515 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.8% | 146 |
| hadur117.Hadur 3.21bb | 2.0 | 17.4% | 46 |
| sgp.JollyNinja 3.53 | 3.5 | 11.6% | 12 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 11.0% | 1 |
| lorneswork.Predator 1.0 | 5.2 | 10.0% | 4 |
| mz.MicroGodMelee 1 | 5.3 | 9.8% | 1 |
| adt.Ar2 1.0 | 7.0 | 7.4% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.6% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.3% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.5 | 87.3 | 9 / 35 | 5123 |
| 2 | 2 | 67.7 | 86.7 | 11 / 35 | 4924 |
| 3 | 2 | 67.4 | 86.3 | 6 / 35 | 5211 |
| 4 | 2 | 66.5 | 83.5 | 5 / 35 | 5291 |
| 5 | 2 | 68.1 | 89.2 | 9 / 35 | 5357 |
| 6 | 2 | 67.1 | 82.2 | 6 / 35 | 5609 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 135 | 10% |
| sgp.JollyNinja 3.53 | 18 | 83% |
| mz.MicroGodMelee 1 | 7 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 100% |
| lorneswork.Predator 1.0 | 5 | 80% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 1202. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 132 | 80% | 148 |
| sgp.JollyNinja 3.53 | 12 | 7% | 21 |
| lorneswork.Predator 1.0 | 8 | 5% | 11 |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 4% | 12 |
| adt.Ar2 1.0 | 2 | 1% | 2 |
| mz.MicroGodMelee 1 | 1 | 1% | 12 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 3 |
| skm.butterfly 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 199 rounds): 135119 melee ticks, 94747 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 102 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 102 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 43610 sent, 38891 reached their opponent, 7963 virtual hits (20.5% of those reached).

## Melee bench: F02

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1533640. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 190 over 6 battles (31.7 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 85.5 | 108 / 210 | 2.30 | 18.7% | 30525 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 18.7% | 108 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 14.5% | 42 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 13.1% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.7% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.2 | 10.1% | 11 |
| fnc.bandit.Bandit 5.2.0 | 6.0 | 8.7% | 3 |
| Noran.BitchingElk 0.054 | 7.2 | 7.8% | 14 |
| sch.Simone 0.3d | 7.5 | 7.7% | 3 |
| stelo.PatternRobot 1.0 | 9.0 | 5.2% | 2 |
| fullsail.SweetTea 1.1 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 89.2 | 21 / 35 | 4942 |
| 2 | 1 | 68.1 | 84.8 | 20 / 35 | 4932 |
| 3 | 1 | 69.2 | 86.0 | 19 / 35 | 5375 |
| 4 | 1 | 66.1 | 82.2 | 10 / 35 | 4824 |
| 5 | 1 | 70.0 | 87.3 | 20 / 35 | 5600 |
| 6 | 1 | 67.8 | 83.5 | 18 / 35 | 4852 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 50 | 70% |
| pulsar.PulsarMax 0.8.9 | 50 | 64% |
| com.cohesiva.robocode.ManOwaR 1.0 | 19 | 68% |
| Noran.BitchingElk 0.054 | 10 | 40% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 100% |
| sch.Simone 0.3d | 9 | 89% |
| fnc.bandit.Bandit 5.2.0 | 5 | 100% |
| stelo.PatternRobot 1.0 | 2 | 50% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 963. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 37 | 36% | 64 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 24 | 24% | 59 |
| com.cohesiva.robocode.ManOwaR 1.0 | 12 | 12% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 10% | 16 |
| Noran.BitchingElk 0.054 | 10 | 10% | 14 |
| sch.Simone 0.3d | 4 | 4% | 20 |
| stelo.PatternRobot 1.0 | 3 | 3% | 4 |
| fnc.bandit.Bandit 5.2.0 | 2 | 2% | 9 |
| fullsail.SweetTea 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 163962 melee ticks, 44019 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 55 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 58233 sent, 53436 reached their opponent, 8786 virtual hits (16.4% of those reached).

## Melee bench: F03

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1536215. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 159 over 6 battles (26.5 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 94.7 | 181 / 210 | 1.48 | 21.3% | 38706 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.3% | 181 |
| radnor.DoctorBob 1.42 | 2.0 | 13.9% | 13 |
| vuen.Cake 2.51 | 3.5 | 12.4% | 9 |
| kawigi.nano.Lib 1.0 | 3.5 | 12.7% | 5 |
| urdos.URDOS 1.3 | 5.0 | 9.1% | 1 |
| adt.Ar1 2.1 | 6.0 | 7.6% | 0 |
| oa.weak.FlyMk1 0.1 | 7.3 | 6.5% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.7 | 6.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.2 | 5.2% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 94.3 | 28 / 35 | 6357 |
| 2 | 1 | 71.8 | 92.7 | 30 / 35 | 6857 |
| 3 | 1 | 71.7 | 96.5 | 29 / 35 | 6331 |
| 4 | 1 | 71.4 | 94.0 | 32 / 35 | 6301 |
| 5 | 1 | 72.0 | 97.5 | 32 / 35 | 6514 |
| 6 | 1 | 71.6 | 93.3 | 30 / 35 | 6346 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 69 | 99% |
| vuen.Cake 2.51 | 64 | 92% |
| kawigi.nano.Lib 1.0 | 48 | 98% |
| adt.Ar1 2.1 | 3 | 100% |
| urdos.URDOS 1.3 | 2 | 100% |
| oa.weak.FlyMk1 0.1 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 30 of 210 rounds, at a mean tick of 719. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 8 | 27% | 75 |
| radnor.DoctorBob 1.42 | 8 | 27% | 66 |
| bwbaugh.nano.Tirunculus 0.0.0a | 6 | 20% | 7 |
| kawigi.nano.Lib 1.0 | 4 | 13% | 41 |
| urdos.URDOS 1.3 | 3 | 10% | 5 |
| adt.Ar1 2.1 | 1 | 3% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 4 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 125571 melee ticks, 42712 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 51 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 38064 sent, 33437 reached their opponent, 8337 virtual hits (24.9% of those reached).

## Melee bench: F04

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1540610. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 111 over 6 battles (18.5 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.9 | 31 / 210 | 2.27 | 18.0% | 35578 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.0% | 158 |
| hadur117.Hadur 3.21bb | 2.0 | 18.0% | 31 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.9% | 12 |
| TNT.TNT 0.99.1 | 4.2 | 10.5% | 5 |
| josago.Jorgito 0.16 | 4.8 | 9.1% | 2 |
| css.Delitioner 0.11 | 6.2 | 7.4% | 1 |
| tj.zombie1n 1.0.1 | 7.0 | 6.3% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.5% | 0 |
| spin.Bugstard 0.012b | 9.3 | 3.8% | 0 |
| sp.Nanos.Ember 1.1 | 9.7 | 3.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.3 | 85.7 | 4 / 35 | 5692 |
| 2 | 2 | 67.5 | 81.9 | 5 / 35 | 5655 |
| 3 | 2 | 68.6 | 84.8 | 4 / 35 | 5891 |
| 4 | 2 | 69.4 | 87.6 | 7 / 35 | 6126 |
| 5 | 2 | 69.6 | 88.6 | 7 / 35 | 6044 |
| 6 | 2 | 69.5 | 86.7 | 4 / 35 | 6170 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 126 | 10% |
| apc.LeeroyJenkins2 1.0 | 16 | 63% |
| TNT.TNT 0.99.1 | 10 | 50% |
| sp.Nanos.Ember 1.1 | 1 | 100% |
| css.Delitioner 0.11 | 1 | 0% |
| josago.Jorgito 0.16 | 1 | 100% |
| tj.zombie1n 1.0.1 | 1 | 100% |

Hadur died in 179 of 210 rounds, at a mean tick of 1328. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 133 | 74% | 146 |
| apc.LeeroyJenkins2 1.0 | 22 | 12% | 29 |
| TNT.TNT 0.99.1 | 10 | 6% | 17 |
| josago.Jorgito 0.16 | 10 | 6% | 11 |
| css.Delitioner 0.11 | 3 | 2% | 4 |
| tj.zombie1n 1.0.1 | 1 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 189114 melee ticks, 78379 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 72 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 3.

Targeting waves (199 rounds): 57717 sent, 53155 reached their opponent, 8031 virtual hits (15.1% of those reached).

## Melee bench: F05

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1544859. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 114 over 6 battles (19.0 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 79.9 | 32 / 210 | 2.81 | 15.8% | 25752 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 17.7% | 93 |
| justin.DemonicRage 3.4 | 2.2 | 17.1% | 68 |
| hadur117.Hadur 3.21bb | 2.5 | 15.8% | 32 |
| wompi.Numbat 2.1 | 4.0 | 12.4% | 14 |
| axeBots.HataMoto 3.09 | 5.5 | 8.9% | 3 |
| ms.Ares 0.19 | 5.5 | 8.7% | 0 |
| supersample.SuperBoxBot 1.0 | 7.2 | 5.9% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.2% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.1% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.0 | 73.7 | 3 / 35 | 4156 |
| 2 | 3 | 64.0 | 78.7 | 6 / 35 | 3900 |
| 3 | 2 | 66.7 | 84.4 | 8 / 35 | 4268 |
| 4 | 2 | 66.2 | 82.9 | 5 / 35 | 4667 |
| 5 | 3 | 64.0 | 78.1 | 2 / 35 | 4056 |
| 6 | 2 | 66.5 | 81.6 | 8 / 35 | 4705 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 48 | 33% |
| cb.fire.Firestarter 2.0f | 44 | 11% |
| wompi.Numbat 2.1 | 14 | 57% |
| ms.Ares 0.19 | 2 | 100% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 178 of 210 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 64 | 36% | 77 |
| cb.fire.Firestarter 2.0f | 59 | 33% | 67 |
| wompi.Numbat 2.1 | 27 | 15% | 35 |
| axeBots.HataMoto 3.09 | 12 | 7% | 13 |
| ms.Ares 0.19 | 10 | 6% | 11 |
| GarmBox.Oranges 1.0 | 2 | 1% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 2 |
| supersample.SuperBoxBot 1.0 | 1 | 1% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 203 rounds): 157206 melee ticks, 41620 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 63 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 47895 sent, 43051 reached their opponent, 7206 virtual hits (16.7% of those reached).

## Melee bench: F06

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1540359. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 167 over 6 battles (27.8 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 92.5 | 147 / 210 | 1.68 | 20.6% | 33789 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.6% | 147 |
| jekl.StoneGhost 0.7 | 2.2 | 14.2% | 17 |
| origin.SleepSiphon 1.7b | 3.2 | 12.9% | 33 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.3% | 10 |
| mld.Wisdom 1.0 | 4.8 | 10.6% | 2 |
| gg.Wolverine 2.0 | 6.0 | 8.9% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 6.4% | 2 |
| spinnercat.Omen 1.0 | 8.0 | 5.8% | 0 |
| DBall.NUKE 0.1 | 8.5 | 5.8% | 0 |
| sample.Fire 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 89.2 | 21 / 35 | 5014 |
| 2 | 1 | 71.9 | 95.2 | 25 / 35 | 5775 |
| 3 | 1 | 72.4 | 96.2 | 28 / 35 | 6059 |
| 4 | 1 | 71.2 | 92.7 | 24 / 35 | 5656 |
| 5 | 1 | 69.8 | 87.6 | 22 / 35 | 5259 |
| 6 | 1 | 72.3 | 94.0 | 27 / 35 | 6026 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 70 | 91% |
| pe.minimelee.SandboxMiniMelee 1.1 | 36 | 92% |
| origin.SleepSiphon 1.7b | 36 | 72% |
| gg.Wolverine 2.0 | 16 | 94% |
| mld.Wisdom 1.0 | 6 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 50% |
| DBall.NUKE 0.1 | 1 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 901. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 24 | 37% | 64 |
| jekl.StoneGhost 0.7 | 14 | 22% | 63 |
| pe.minimelee.SandboxMiniMelee 1.1 | 9 | 14% | 38 |
| mld.Wisdom 1.0 | 7 | 11% | 14 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 9% | 10 |
| gg.Wolverine 2.0 | 2 | 3% | 13 |
| spinnercat.Omen 1.0 | 1 | 2% | 5 |
| DBall.NUKE 0.1 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 147118 melee ticks, 39443 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 57 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 45109 sent, 40592 reached their opponent, 8931 virtual hits (22.0% of those reached).

## Melee bench: F07

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1591347. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 109 over 6 battles (18.2 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 75.2 | 96.4 | 161 / 210 | 1.29 | 25.9% | 46110 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 25.9% | 161 |
| rtk.Tachikoma 1.0 | 2.0 | 18.4% | 22 |
| franzor.Lizt 1.3.1 | 3.5 | 13.0% | 19 |
| oog.melee.CapuletDroid 1.1 | 3.5 | 12.9% | 8 |
| lrem.micro.MoggFanatic 0.2 | 5.0 | 10.4% | 0 |
| exauge.GateKeeper 1.1.121g | 6.0 | 8.0% | 0 |
| skm.PateranBotlock2 1.0 | 7.0 | 6.4% | 0 |
| drd.Dreadknoght 0.9 | 8.3 | 2.6% | 0 |
| sample.Target 1.0 | 8.7 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.8 | 96.4 | 26 / 35 | 7192 |
| 2 | 1 | 75.8 | 97.5 | 28 / 35 | 8058 |
| 3 | 1 | 76.0 | 98.6 | 31 / 35 | 7682 |
| 4 | 1 | 73.9 | 92.9 | 21 / 35 | 7582 |
| 5 | 1 | 74.4 | 94.6 | 25 / 35 | 7393 |
| 6 | 1 | 76.6 | 98.2 | 30 / 35 | 8203 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 111 | 83% |
| franzor.Lizt 1.3.1 | 46 | 65% |
| oog.melee.CapuletDroid 1.1 | 40 | 90% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |
| skm.PateranBotlock2 1.0 | 1 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 1758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 28 | 57% | 130 |
| franzor.Lizt 1.3.1 | 16 | 33% | 6 |
| oog.melee.CapuletDroid 1.1 | 5 | 10% | 58 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 5 |
| drd.Dreadknoght 0.9 | 0 | 0% | 5 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 4 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 200 rounds): 199973 melee ticks, 93551 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 27 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 27 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 55074 sent, 51074 reached their opponent, 10598 virtual hits (20.8% of those reached).

## Melee bench: F08

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1539255. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 261 over 6 battles (43.5 per battle, most in one battle 49). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 94.5 | 154 / 210 | 1.44 | 23.1% | 31645 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 23.1% | 154 |
| shrub.Vapour v159 | 2.5 | 14.7% | 12 |
| tm.Yuugao 1.0 | 2.5 | 14.8% | 34 |
| com.spp.robocode.MostlyHarmless 010 | 4.3 | 11.1% | 4 |
| jwst.DAD.DarkAndDarker 1.1 | 5.2 | 9.7% | 4 |
| m3thos.Eva00 1.1 | 5.5 | 9.7% | 1 |
| qualidafial.MajorDick 1.0.1 | 7.2 | 6.8% | 0 |
| zyx.nano.BacillusComma 1.0 | 7.8 | 5.6% | 1 |
| SHAM.WOW 1.4 | 9.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 92.1 | 22 / 35 | 4740 |
| 2 | 1 | 72.9 | 96.8 | 29 / 35 | 5466 |
| 3 | 1 | 71.2 | 94.6 | 26 / 35 | 5035 |
| 4 | 1 | 71.4 | 92.5 | 22 / 35 | 5464 |
| 5 | 1 | 72.2 | 96.4 | 27 / 35 | 5414 |
| 6 | 1 | 71.7 | 94.3 | 28 / 35 | 5526 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 71 | 66% |
| shrub.Vapour v159 | 57 | 88% |
| com.spp.robocode.MostlyHarmless 010 | 31 | 97% |
| jwst.DAD.DarkAndDarker 1.1 | 14 | 79% |
| m3thos.Eva00 1.1 | 11 | 91% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 936. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 26 | 46% | 75 |
| shrub.Vapour v159 | 17 | 30% | 66 |
| com.spp.robocode.MostlyHarmless 010 | 6 | 11% | 30 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 9% | 17 |
| m3thos.Eva00 1.1 | 2 | 4% | 14 |
| zyx.nano.BacillusComma 1.0 | 1 | 2% | 4 |
| SHAM.WOW 1.4 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 147592 melee ticks, 49510 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 42 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 2.

Targeting waves (199 rounds): 43914 sent, 39757 reached their opponent, 7535 virtual hits (19.0% of those reached).

## Melee bench: F09

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1540132. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 138 over 6 battles (23.0 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 78.5 | 57 / 210 | 2.93 | 15.8% | 22633 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 17.2% | 97 |
| hadur117.Hadur 3.21bb | 2.0 | 15.8% | 57 |
| kc.micro.Figment 1.0 | 2.7 | 14.3% | 26 |
| yagami.Tidus 0.11 | 4.2 | 10.8% | 4 |
| pedersen.Grishnakh 1.0 | 5.3 | 9.9% | 10 |
| mc2.enemy.Original 0.9 | 5.7 | 9.5% | 12 |
| dft.Calliope 5.6 | 6.8 | 7.8% | 4 |
| step.nanoPri 1.0 | 8.2 | 5.8% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 4.9% | 0 |
| rdm.Dueler 0.4x | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.1 | 75.6 | 8 / 35 | 3556 |
| 2 | 2 | 64.8 | 80.3 | 11 / 35 | 3557 |
| 3 | 1 | 67.0 | 83.5 | 14 / 35 | 4300 |
| 4 | 3 | 61.8 | 72.7 | 5 / 35 | 3356 |
| 5 | 1 | 66.5 | 84.8 | 12 / 35 | 4131 |
| 6 | 2 | 63.2 | 74.3 | 7 / 35 | 3733 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 53 | 34% |
| kc.micro.Figment 1.0 | 27 | 81% |
| pedersen.Grishnakh 1.0 | 10 | 60% |
| yagami.Tidus 0.11 | 9 | 78% |
| mc2.enemy.Original 0.9 | 8 | 50% |
| dft.Calliope 5.6 | 1 | 0% |

Hadur died in 154 of 210 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 58 | 38% | 78 |
| kc.micro.Figment 1.0 | 24 | 16% | 46 |
| yagami.Tidus 0.11 | 21 | 14% | 24 |
| mc2.enemy.Original 0.9 | 16 | 10% | 22 |
| pedersen.Grishnakh 1.0 | 15 | 10% | 18 |
| dft.Calliope 5.6 | 8 | 5% | 9 |
| robar.nano.Assertive_Melee 0.2 | 5 | 3% | 5 |
| step.nanoPri 1.0 | 4 | 3% | 5 |
| rdm.Dueler 0.4x | 3 | 2% | 3 |

Posture (Hadur's M records, 200 rounds): 146605 melee ticks, 36457 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 54 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 47977 sent, 43380 reached their opponent, 6272 virtual hits (14.5% of those reached).

## Melee bench: F10

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1548503. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 196 over 6 battles (32.7 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 95.9 | 177 / 210 | 1.37 | 21.2% | 35245 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.2% | 177 |
| DTF.Kludgy 1.2b | 2.3 | 14.2% | 13 |
| ne.Chimera 1.2 | 2.8 | 12.9% | 2 |
| ejb.Polaris 1.0.1 | 3.8 | 12.6% | 12 |
| vStar.RAFzilla 2.15 | 5.3 | 10.1% | 3 |
| tvv.micro.Antares 1.1.1 | 5.7 | 9.8% | 2 |
| sam.Samspin 1.0 | 8.0 | 5.3% | 0 |
| kurios.DOSexe .9b | 8.2 | 5.2% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 4.9% | 0 |
| donjezza.Muncho 1.0 | 9.3 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 91.4 | 30 / 35 | 5857 |
| 2 | 1 | 71.3 | 95.6 | 27 / 35 | 5710 |
| 3 | 1 | 71.8 | 95.9 | 26 / 35 | 5902 |
| 4 | 1 | 72.5 | 98.7 | 31 / 35 | 5890 |
| 5 | 1 | 72.5 | 96.8 | 32 / 35 | 6190 |
| 6 | 1 | 72.0 | 96.8 | 31 / 35 | 5696 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 66 | 86% |
| ejb.Polaris 1.0.1 | 48 | 92% |
| ne.Chimera 1.2 | 41 | 98% |
| vStar.RAFzilla 2.15 | 22 | 91% |
| tvv.micro.Antares 1.1.1 | 14 | 86% |
| kurios.DOSexe .9b | 2 | 100% |
| donjezza.Muncho 1.0 | 1 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 35 of 210 rounds, at a mean tick of 956. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 15 | 43% | 75 |
| ne.Chimera 1.2 | 6 | 17% | 40 |
| ejb.Polaris 1.0.1 | 5 | 14% | 52 |
| vStar.RAFzilla 2.15 | 3 | 9% | 19 |
| tvv.micro.Antares 1.1.1 | 3 | 9% | 12 |
| kurios.DOSexe .9b | 2 | 6% | 5 |
| sam.Samspin 1.0 | 1 | 3% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 1 |
| donjezza.Muncho 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 137908 melee ticks, 59530 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 80 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 45564 sent, 41010 reached their opponent, 7839 virtual hits (19.1% of those reached).

## Melee bench: F11

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1539394. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 174 over 6 battles (29.0 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 83.8 | 79 / 210 | 2.46 | 17.1% | 24858 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.2 | 17.1% | 79 |
| rz.Aleph 0.34 | 1.8 | 16.1% | 67 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.1% | 18 |
| djc.DynaBot 0.1.1 | 4.2 | 10.6% | 12 |
| rdt199.Warlord 0.73 | 5.3 | 9.7% | 11 |
| br2.MobyDickBot 1.6 | 6.2 | 9.2% | 15 |
| uji.YellohFellah 1.0 | 6.8 | 8.2% | 8 |
| KiraNL.Chupacabra 0.4 | 8.0 | 6.6% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.4% | 0 |
| stelo.MirrorNano 1.3 | 9.3 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 75.2 | 8 / 35 | 3667 |
| 2 | 1 | 65.4 | 82.9 | 10 / 35 | 4215 |
| 3 | 1 | 68.2 | 89.8 | 16 / 35 | 4441 |
| 4 | 1 | 65.0 | 81.6 | 12 / 35 | 3830 |
| 5 | 1 | 66.4 | 83.8 | 17 / 35 | 4193 |
| 6 | 1 | 68.3 | 89.2 | 16 / 35 | 4512 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 57 | 46% |
| djc.DynaBot 0.1.1 | 24 | 71% |
| cx.mini.Nimrod 0.55 | 16 | 56% |
| rdt199.Warlord 0.73 | 13 | 77% |
| uji.YellohFellah 1.0 | 13 | 85% |
| br2.MobyDickBot 1.6 | 13 | 46% |

Hadur died in 131 of 210 rounds, at a mean tick of 945. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 55 | 42% | 85 |
| cx.mini.Nimrod 0.55 | 22 | 17% | 34 |
| rdt199.Warlord 0.73 | 18 | 14% | 29 |
| djc.DynaBot 0.1.1 | 13 | 10% | 28 |
| br2.MobyDickBot 1.6 | 12 | 9% | 15 |
| uji.YellohFellah 1.0 | 4 | 3% | 9 |
| KiraNL.Chupacabra 0.4 | 4 | 3% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 2% | 2 |
| stelo.MirrorNano 1.3 | 1 | 1% | 1 |

Posture (Hadur's M records, 201 rounds): 156423 melee ticks, 42916 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 41 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 50268 sent, 45476 reached their opponent, 6248 virtual hits (13.7% of those reached).

## Melee bench: F12

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1570150. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 152 over 6 battles (25.3 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 82.9 | 109 / 210 | 2.54 | 17.3% | 23638 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 17.3% | 109 |
| bts.wiki.RipCurl 0.9b | 2.5 | 13.7% | 31 |
| nat.PallasHawk 1.0 | 3.0 | 13.2% | 30 |
| darkcanuck.Leon 1.01 | 3.5 | 13.0% | 26 |
| brainfade.melee.Genghis 0.36 | 5.2 | 10.2% | 12 |
| jrm.Test0 1.0 | 6.0 | 8.2% | 2 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.3% | 0 |
| jp.Perpy 16.0 | 8.3 | 6.3% | 0 |
| stuff.Vlad 0.1 | 8.7 | 5.8% | 0 |
| jaybot.bots.Oddball 4.0 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 87.0 | 20 / 35 | 4116 |
| 2 | 1 | 66.7 | 81.3 | 18 / 35 | 4140 |
| 3 | 1 | 66.6 | 86.0 | 17 / 35 | 3760 |
| 4 | 1 | 66.3 | 82.9 | 18 / 35 | 3991 |
| 5 | 1 | 63.6 | 74.9 | 16 / 35 | 3627 |
| 6 | 1 | 67.4 | 85.4 | 20 / 35 | 4004 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 45 | 91% |
| bts.wiki.RipCurl 0.9b | 37 | 68% |
| nat.PallasHawk 1.0 | 32 | 75% |
| brainfade.melee.Genghis 0.36 | 15 | 67% |
| jrm.Test0 1.0 | 3 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| jaybot.bots.Oddball 4.0 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 608. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 35 | 34% | 57 |
| darkcanuck.Leon 1.01 | 19 | 19% | 57 |
| nat.PallasHawk 1.0 | 17 | 17% | 47 |
| brainfade.melee.Genghis 0.36 | 12 | 12% | 17 |
| jrm.Test0 1.0 | 7 | 7% | 11 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 7 |
| stuff.Vlad 0.1 | 3 | 3% | 5 |
| jp.Perpy 16.0 | 3 | 3% | 5 |
| jaybot.bots.Oddball 4.0 | 3 | 3% | 4 |

Posture (Hadur's M records, 200 rounds): 121025 melee ticks, 30174 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 56 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 42683 sent, 37790 reached their opponent, 6127 virtual hits (16.2% of those reached).

## Melee bench: F13

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1538448. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 135 over 6 battles (22.5 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 83.9 | 75 / 210 | 2.45 | 16.6% | 25846 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.8 | 16.6% | 38 |
| hadur117.Hadur 3.21bb | 1.8 | 16.6% | 75 |
| mn.Combat 3.25.0 | 2.3 | 16.1% | 77 |
| shinh.Entangled 0.3 | 4.0 | 12.0% | 16 |
| gh.micro.Gruweltje 0.7 | 5.0 | 11.0% | 4 |
| apc.Colossus2 0.17 | 6.0 | 8.3% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.4% | 0 |
| maribo.FollowFire 1 | 8.5 | 5.0% | 0 |
| ayk.WallHugger 1.0 | 8.7 | 4.8% | 0 |
| sample.Tracker 1.0 | 9.8 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.2 | 81.9 | 10 / 35 | 4591 |
| 2 | 3 | 64.7 | 78.4 | 10 / 35 | 4095 |
| 3 | 2 | 66.8 | 86.3 | 9 / 35 | 4447 |
| 4 | 2 | 65.4 | 83.2 | 14 / 35 | 3804 |
| 5 | 1 | 67.9 | 87.0 | 17 / 35 | 4662 |
| 6 | 1 | 66.9 | 86.3 | 15 / 35 | 4247 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 56 | 39% |
| ags.Glacier 0.2.11 | 51 | 63% |
| shinh.Entangled 0.3 | 26 | 50% |
| gh.micro.Gruweltje 0.7 | 6 | 100% |
| stelo.Wang 1.0 | 2 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 49 | 36% | 71 |
| ags.Glacier 0.2.11 | 44 | 33% | 77 |
| shinh.Entangled 0.3 | 24 | 18% | 35 |
| stelo.Wang 1.0 | 5 | 4% | 5 |
| gh.micro.Gruweltje 0.7 | 4 | 3% | 10 |
| apc.Colossus2 0.17 | 4 | 3% | 6 |
| maribo.FollowFire 1 | 4 | 3% | 4 |
| ayk.WallHugger 1.0 | 1 | 1% | 2 |

Posture (Hadur's M records, 201 rounds): 144639 melee ticks, 52316 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 41 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 42395 sent, 37392 reached their opponent, 5831 virtual hits (15.6% of those reached).

## Melee bench: F14

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1529359. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 172 over 6 battles (28.7 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 96.0 | 185 / 210 | 1.32 | 23.9% | 35897 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 23.9% | 185 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 17.0% | 15 |
| Lo_Ian.Gandalf_V4 4.0 | 4.5 | 11.0% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 4.5 | 10.7% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 4.7 | 10.1% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.0 | 10.2% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.3 | 9.2% | 5 |
| pa.Improved 1.0 | 8.0 | 6.2% | 0 |
| sample.TrackFire 1.0 | 9.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 97.5 | 30 / 35 | 6023 |
| 2 | 1 | 72.8 | 96.4 | 32 / 35 | 5870 |
| 3 | 1 | 73.4 | 98.2 | 32 / 35 | 6167 |
| 4 | 1 | 71.9 | 93.2 | 30 / 35 | 5802 |
| 5 | 1 | 72.5 | 95.4 | 31 / 35 | 5994 |
| 6 | 1 | 72.6 | 95.4 | 30 / 35 | 6041 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 115 | 93% |
| sanyi.mikrobi.Roberto 1.0 | 29 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 25 | 84% |
| co.edu.usb.rc.LidisTron 1.0 | 14 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 11 | 91% |
| pa.Improved 1.0 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 50% |

Hadur died in 25 of 210 rounds, at a mean tick of 841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 15 | 60% | 117 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 24% | 27 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 8% | 6 |
| sanyi.mikrobi.Roberto 1.0 | 1 | 4% | 38 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 4% | 7 |
| co.edu.usb.rc.LidisTron 1.0 | 0 | 0% | 13 |
| pa.Improved 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 122504 melee ticks, 54158 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 40 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 36609 sent, 32685 reached their opponent, 8589 virtual hits (26.3% of those reached).

## Melee bench: F15

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1540479. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 178 over 6 battles (29.7 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 88.8 | 116 / 210 | 2.00 | 19.4% | 32649 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 19.4% | 116 |
| kawigi.micro.Shiz 1.1 | 2.2 | 14.0% | 17 |
| mld.DustBunny 3.8 | 3.3 | 12.3% | 11 |
| emp.Yngwie 1.11 | 3.7 | 12.6% | 44 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.4% | 6 |
| kawigi.robot.Girl 1.2 | 5.7 | 9.1% | 14 |
| lambdaxy.TBot 0.1 | 7.2 | 7.0% | 0 |
| Grystrion.TrackerWO 1.0 | 8.0 | 6.2% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 4.5% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 89.8 | 17 / 35 | 5440 |
| 2 | 1 | 70.8 | 90.5 | 23 / 35 | 5921 |
| 3 | 1 | 69.8 | 90.8 | 19 / 35 | 5399 |
| 4 | 1 | 70.3 | 92.1 | 23 / 35 | 5394 |
| 5 | 1 | 68.2 | 84.8 | 17 / 35 | 5109 |
| 6 | 1 | 68.4 | 85.1 | 17 / 35 | 5386 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 46 | 54% |
| kawigi.micro.Shiz 1.1 | 39 | 90% |
| mld.DustBunny 3.8 | 28 | 86% |
| kawigi.robot.Girl 1.2 | 23 | 70% |
| cb.nano.Insomnia 1.0 | 15 | 87% |
| divineomega.TrialBot 0.003 | 2 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 1022. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 36 | 38% | 75 |
| mld.DustBunny 3.8 | 17 | 18% | 44 |
| cb.nano.Insomnia 1.0 | 13 | 14% | 16 |
| kawigi.micro.Shiz 1.1 | 12 | 13% | 40 |
| kawigi.robot.Girl 1.2 | 10 | 11% | 15 |
| divineomega.TrialBot 0.003 | 3 | 3% | 10 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 3 |
| lambdaxy.TBot 0.1 | 1 | 1% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 162577 melee ticks, 44877 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 41 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 52096 sent, 47496 reached their opponent, 7900 virtual hits (16.6% of those reached).

## Melee bench: F16

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1536105. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 194 over 6 battles (32.3 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 91.0 | 129 / 210 | 1.81 | 20.4% | 35876 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.4% | 129 |
| gh.Griezel 0.5.2 | 2.0 | 16.2% | 48 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.5% | 4 |
| techdude.forest.FlamingForest 1.1 | 4.8 | 10.1% | 21 |
| tvv.nano.Polaris 1.2 | 5.2 | 9.2% | 5 |
| bvh.fnr.Fenrir 0.36l | 5.7 | 9.0% | 2 |
| stelo.IntrinsicVolatility 1.4 | 6.3 | 8.1% | 1 |
| repositorio.NanoStep 1.0 | 8.5 | 4.6% | 0 |
| asd.Cthulhu 1.3 | 9.0 | 4.7% | 1 |
| divineomega.DivineBot 1.9.4.5 | 9.5 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 90.8 | 20 / 35 | 6024 |
| 2 | 1 | 71.7 | 93.0 | 24 / 35 | 5980 |
| 3 | 1 | 69.7 | 87.6 | 21 / 35 | 5794 |
| 4 | 1 | 72.8 | 95.6 | 23 / 35 | 6506 |
| 5 | 1 | 69.9 | 85.4 | 19 / 35 | 6047 |
| 6 | 1 | 70.9 | 93.3 | 22 / 35 | 5525 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 96 | 75% |
| techdude.forest.FlamingForest 1.1 | 28 | 46% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 27 | 89% |
| bvh.fnr.Fenrir 0.36l | 11 | 91% |
| tvv.nano.Polaris 1.2 | 7 | 57% |
| stelo.IntrinsicVolatility 1.4 | 4 | 75% |
| divineomega.DivineBot 1.9.4.5 | 2 | 100% |
| asd.Cthulhu 1.3 | 1 | 0% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 1192. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 29 | 35% | 98 |
| techdude.forest.FlamingForest 1.1 | 22 | 27% | 40 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 11 | 13% | 33 |
| bvh.fnr.Fenrir 0.36l | 11 | 13% | 16 |
| tvv.nano.Polaris 1.2 | 4 | 5% | 10 |
| stelo.IntrinsicVolatility 1.4 | 2 | 2% | 5 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 6 |
| asd.Cthulhu 1.3 | 1 | 1% | 1 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 170900 melee ticks, 67961 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 38 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 54478 sent, 49960 reached their opponent, 8636 virtual hits (17.3% of those reached).

## Melee bench: F17

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1541056. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 175 over 6 battles (29.2 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 88.3 | 115 / 210 | 2.06 | 19.7% | 35245 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 19.7% | 115 |
| oog.melee.Mercutio 1.0 | 2.8 | 13.0% | 31 |
| cx.BlestPain 1.41 | 3.0 | 13.0% | 34 |
| et.Predator 1.8 | 3.2 | 13.4% | 21 |
| ahf.NanoAndrew .4 | 5.3 | 10.1% | 6 |
| maribo.melee.BMV 0.1 | 6.2 | 8.9% | 0 |
| nic.Nicator 2.4 | 6.5 | 8.9% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.4% | 0 |
| tex.Longbot 0.4 | 8.7 | 5.1% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 87.0 | 20 / 35 | 5600 |
| 2 | 1 | 70.0 | 90.8 | 16 / 35 | 5767 |
| 3 | 1 | 69.7 | 86.3 | 20 / 35 | 5845 |
| 4 | 1 | 69.1 | 83.8 | 16 / 35 | 5934 |
| 5 | 1 | 70.9 | 89.8 | 21 / 35 | 5939 |
| 6 | 1 | 71.2 | 91.7 | 22 / 35 | 6160 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 52 | 77% |
| oog.melee.Mercutio 1.0 | 52 | 79% |
| cx.BlestPain 1.41 | 37 | 51% |
| ahf.NanoAndrew .4 | 10 | 80% |
| maribo.melee.BMV 0.1 | 5 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |
| nic.Nicator 2.4 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 1057. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 34 | 35% | 53 |
| et.Predator 1.8 | 26 | 27% | 58 |
| oog.melee.Mercutio 1.0 | 18 | 19% | 62 |
| ahf.NanoAndrew .4 | 10 | 10% | 16 |
| nic.Nicator 2.4 | 4 | 4% | 9 |
| maribo.melee.BMV 0.1 | 3 | 3% | 7 |
| tex.Longbot 0.4 | 1 | 1% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 2 |

Posture (Hadur's M records, 200 rounds): 160464 melee ticks, 61309 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 47 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 2.

Targeting waves (200 rounds): 52478 sent, 47840 reached their opponent, 10080 virtual hits (21.1% of those reached).

## Melee bench: F18

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1538463. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 280 over 6 battles (46.7 per battle, most in one battle 56). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 94.2 | 166 / 210 | 1.47 | 22.9% | 29281 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 22.9% | 166 |
| agd.Mooserwirt2 2.7 | 2.2 | 14.0% | 18 |
| uji.DBH 1.1 | 3.3 | 12.2% | 7 |
| sigterm.Sigterm 1.0 | 4.2 | 10.8% | 11 |
| spinnercat.Robovirus 2.718 | 5.0 | 10.4% | 3 |
| ratosh.Nobo 0.21 | 6.0 | 9.1% | 1 |
| kawigi.mini.Fhqwhgads 1.1 | 6.5 | 9.1% | 2 |
| stelo.WangRobot 1.0 | 8.3 | 6.0% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 92.5 | 27 / 35 | 4589 |
| 2 | 1 | 71.5 | 96.1 | 31 / 35 | 4944 |
| 3 | 1 | 70.3 | 92.1 | 27 / 35 | 4772 |
| 4 | 1 | 70.8 | 93.6 | 27 / 35 | 4887 |
| 5 | 1 | 71.5 | 96.4 | 28 / 35 | 4947 |
| 6 | 1 | 71.1 | 94.3 | 26 / 35 | 5142 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agd.Mooserwirt2 2.7 | 59 | 83% |
| uji.DBH 1.1 | 41 | 90% |
| sigterm.Sigterm 1.0 | 41 | 83% |
| spinnercat.Robovirus 2.718 | 16 | 94% |
| kawigi.mini.Fhqwhgads 1.1 | 14 | 93% |
| ratosh.Nobo 0.21 | 11 | 100% |
| stelo.WangRobot 1.0 | 4 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 15 | 33% | 57 |
| sigterm.Sigterm 1.0 | 10 | 22% | 37 |
| uji.DBH 1.1 | 6 | 13% | 29 |
| spinnercat.Robovirus 2.718 | 4 | 9% | 22 |
| ratosh.Nobo 0.21 | 4 | 9% | 18 |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 7% | 23 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 4% | 12 |
| stelo.WangRobot 1.0 | 1 | 2% | 9 |

Posture (Hadur's M records, 197 rounds): 127701 melee ticks, 49765 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 96 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (197 rounds): longest scan gap while four or more were alive 96 ticks (197 rounds over 8); rounds whose longest gap at any count was over 8: 197; robots dropped as dead without a death event: 0.

Targeting waves (197 rounds): 39452 sent, 35326 reached their opponent, 8006 virtual hits (22.7% of those reached).

## Melee bench: F19

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1560409. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 206 over 6 battles (34.3 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.7 | 98.4 | 196 / 210 | 1.15 | 22.7% | 38423 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 22.7% | 196 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.6% | 9 |
| krillr.mini.JointStrike 2.0.0 | 3.3 | 11.9% | 1 |
| mld.Infinity 2.2 | 3.7 | 11.4% | 4 |
| erdnis.Rover 0.3 | 5.0 | 10.3% | 0 |
| mbh.Mbh 0.1 | 6.5 | 7.7% | 0 |
| patson.PatsonTestBot 1.0 | 6.7 | 8.1% | 1 |
| pac.ABC 2.1 | 7.8 | 6.9% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.1% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 97.8 | 32 / 35 | 6294 |
| 2 | 1 | 73.0 | 96.2 | 29 / 35 | 6198 |
| 3 | 1 | 73.8 | 98.1 | 33 / 35 | 6579 |
| 4 | 1 | 73.9 | 99.0 | 34 / 35 | 6318 |
| 5 | 1 | 74.7 | 99.4 | 34 / 35 | 6840 |
| 6 | 1 | 73.7 | 99.7 | 34 / 35 | 6194 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 108 | 95% |
| krillr.mini.JointStrike 2.0.0 | 33 | 100% |
| mld.Infinity 2.2 | 21 | 100% |
| erdnis.Rover 0.3 | 16 | 100% |
| patson.PatsonTestBot 1.0 | 9 | 100% |
| pac.ABC 2.1 | 6 | 100% |
| mbh.Mbh 0.1 | 5 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |
| pedersen.Moron 2.0 | 1 | 100% |

Hadur died in 15 of 210 rounds, at a mean tick of 897. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 9 | 60% | 70 |
| krillr.mini.JointStrike 2.0.0 | 3 | 20% | 39 |
| mld.Infinity 2.2 | 1 | 7% | 26 |
| patson.PatsonTestBot 1.0 | 1 | 7% | 19 |
| erdnis.Rover 0.3 | 1 | 7% | 19 |
| pbg.R2D2 1.0 | 0 | 0% | 12 |
| mbh.Mbh 0.1 | 0 | 0% | 10 |
| pac.ABC 2.1 | 0 | 0% | 10 |

Posture (Hadur's M records, 198 rounds): 124819 melee ticks, 47749 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 32 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 42155 sent, 37611 reached their opponent, 8709 virtual hits (23.2% of those reached).

## Melee bench: F20

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1537932. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 149 over 6 battles (24.8 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 94.6 | 156 / 210 | 1.49 | 21.7% | 38215 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.7% | 156 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.5% | 32 |
| fwb.Nine 1.0.1 | 3.5 | 11.1% | 6 |
| catcat20.Rabbit 0.001 | 4.0 | 11.0% | 15 |
| nz.jdc.nano.GridFu 1.0 | 4.5 | 10.2% | 1 |
| m3thos.mini.Eva01 0.5.5 | 6.2 | 8.3% | 0 |
| bayen.nut.Squirrel 1.615 | 6.8 | 7.1% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.5 | 5.9% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.7 | 5.3% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 97.8 | 31 / 35 | 6334 |
| 2 | 1 | 72.6 | 95.2 | 28 / 35 | 6561 |
| 3 | 1 | 71.7 | 92.7 | 23 / 35 | 6281 |
| 4 | 1 | 72.5 | 94.6 | 26 / 35 | 6495 |
| 5 | 1 | 72.4 | 95.2 | 24 / 35 | 6513 |
| 6 | 1 | 71.4 | 91.7 | 24 / 35 | 6031 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 92 | 77% |
| fwb.Nine 1.0.1 | 42 | 95% |
| catcat20.Rabbit 0.001 | 34 | 74% |
| nz.jdc.nano.GridFu 1.0 | 14 | 100% |
| m3thos.mini.Eva01 0.5.5 | 3 | 100% |
| bayen.nut.Squirrel 1.615 | 2 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 1053. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 35 | 65% | 108 |
| catcat20.Rabbit 0.001 | 12 | 22% | 52 |
| nz.jdc.nano.GridFu 1.0 | 3 | 6% | 20 |
| bayen.nut.Squirrel 1.615 | 2 | 4% | 5 |
| fwb.Nine 1.0.1 | 1 | 2% | 13 |
| ntc.ControlledChaos 1.1.4 | 1 | 2% | 1 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 7 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 161964 melee ticks, 60754 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 32 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 50056 sent, 45604 reached their opponent, 10195 virtual hits (22.4% of those reached).

## Melee bench: F21

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1545218. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 119 over 6 battles (19.8 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 92.8 | 135 / 210 | 1.65 | 20.9% | 36725 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.9% | 135 |
| eem.EvBot v4.6.16 | 2.0 | 16.3% | 56 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.0% | 8 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.1% | 2 |
| eld.Hmm 1.0 | 5.2 | 8.5% | 8 |
| oa.weak.BotherBot 0.1 | 6.3 | 7.2% | 0 |
| fire219.CatBot 1.0 | 7.7 | 6.1% | 0 |
| el.JumpShoot 0.2 | 8.0 | 5.6% | 1 |
| PSW.Relentless 0.1 | 8.3 | 5.9% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 90.2 | 22 / 35 | 5784 |
| 2 | 1 | 71.3 | 93.0 | 23 / 35 | 5935 |
| 3 | 1 | 72.2 | 94.3 | 23 / 35 | 6305 |
| 4 | 1 | 72.2 | 94.6 | 23 / 35 | 6146 |
| 5 | 1 | 71.8 | 92.4 | 22 / 35 | 6645 |
| 6 | 1 | 71.2 | 92.1 | 22 / 35 | 5910 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 130 | 69% |
| dummy.mini.Scimitar 1.01 | 29 | 90% |
| cf.RiO.RiOx 4.2.1 | 17 | 94% |
| eld.Hmm 1.0 | 8 | 38% |

Hadur died in 75 of 210 rounds, at a mean tick of 1313. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 46 | 61% | 111 |
| dummy.mini.Scimitar 1.01 | 11 | 15% | 51 |
| eld.Hmm 1.0 | 8 | 11% | 21 |
| cf.RiO.RiOx 4.2.1 | 4 | 5% | 17 |
| PSW.Relentless 0.1 | 4 | 5% | 4 |
| arthord.MannyPacquiao Beta | 1 | 1% | 2 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |

Posture (Hadur's M records, 200 rounds): 175500 melee ticks, 80484 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 55 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 50926 sent, 46395 reached their opponent, 7827 virtual hits (16.9% of those reached).

## Melee bench: F22

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1543455. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 143 over 6 battles (23.8 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.6 | 108 / 210 | 2.00 | 20.1% | 26324 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.1% | 108 |
| pe.SandboxDT 2.71m | 2.3 | 16.4% | 49 |
| kvk.HebusLeTroll 0.35 | 2.7 | 16.0% | 25 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.3% | 19 |
| bigpete.Stewie 1.0 | 5.0 | 11.4% | 7 |
| yk.JahRoslav 1.1 | 6.0 | 7.1% | 1 |
| gg.Squaraus 0.6 | 7.3 | 5.8% | 0 |
| tad.Dalek98 0.98 | 7.7 | 5.6% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 89.6 | 17 / 35 | 4500 |
| 2 | 1 | 68.0 | 88.2 | 18 / 35 | 4145 |
| 3 | 1 | 69.6 | 90.0 | 19 / 35 | 4550 |
| 4 | 1 | 68.2 | 86.8 | 17 / 35 | 4546 |
| 5 | 1 | 67.1 | 84.3 | 17 / 35 | 4214 |
| 6 | 1 | 68.4 | 86.4 | 20 / 35 | 4369 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 52 | 54% |
| jlm.javaDisturbance 0.59 | 45 | 80% |
| kvk.HebusLeTroll 0.35 | 43 | 79% |
| bigpete.Stewie 1.0 | 12 | 75% |
| pbg.NinjaX 1.2 | 1 | 0% |
| yk.JahRoslav 1.1 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 939. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 38 | 37% | 67 |
| jlm.javaDisturbance 0.59 | 26 | 25% | 58 |
| kvk.HebusLeTroll 0.35 | 23 | 22% | 47 |
| bigpete.Stewie 1.0 | 11 | 11% | 25 |
| tad.Dalek98 0.98 | 2 | 2% | 4 |
| yk.JahRoslav 1.1 | 1 | 1% | 4 |
| gg.Squaraus 0.6 | 1 | 1% | 3 |
| pbg.NinjaX 1.2 | 1 | 1% | 2 |

Posture (Hadur's M records, 200 rounds): 149100 melee ticks, 46556 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 33 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 44620 sent, 40518 reached their opponent, 5428 virtual hits (13.4% of those reached).

## Melee bench: F23

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1521957. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 160 over 6 battles (26.7 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.8 | 98.0 | 186 / 210 | 1.18 | 22.6% | 39508 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 22.6% | 186 |
| pe.SandboxLump 1.52 | 2.0 | 16.2% | 18 |
| cre.Karolos 0.32 | 3.0 | 13.5% | 3 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.0% | 1 |
| stelo.RamTrackSurfer 1.2 | 5.2 | 9.2% | 2 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.8 | 8.6% | 0 |
| cw.megas.Blade 0.8 | 6.8 | 7.9% | 0 |
| sample.Walls 1.0 | 8.0 | 6.7% | 0 |
| rrh.Iwillfindyou 2.0 | 9.2 | 3.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 97.5 | 29 / 35 | 6844 |
| 2 | 1 | 73.7 | 98.4 | 32 / 35 | 6676 |
| 3 | 1 | 73.6 | 97.1 | 32 / 35 | 6433 |
| 4 | 1 | 74.1 | 98.4 | 31 / 35 | 6485 |
| 5 | 1 | 73.8 | 98.1 | 32 / 35 | 6378 |
| 6 | 1 | 74.1 | 98.4 | 30 / 35 | 6692 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 112 | 90% |
| cre.Karolos 0.32 | 52 | 96% |
| stelo.RamTrackSurfer 1.2 | 15 | 87% |
| stelo.AreaTargetingBot 1.1 | 10 | 100% |
| sample.Walls 1.0 | 6 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 24 of 210 rounds, at a mean tick of 946. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 13 | 54% | 103 |
| cre.Karolos 0.32 | 5 | 21% | 44 |
| stelo.RamTrackSurfer 1.2 | 2 | 8% | 26 |
| stelo.AreaTargetingBot 1.1 | 2 | 8% | 18 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 8% | 10 |
| cw.megas.Blade 0.8 | 0 | 0% | 3 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 2 |
| sample.Walls 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 200 rounds): 125402 melee ticks, 50057 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 537 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 154 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 39738 sent, 34963 reached their opponent, 10338 virtual hits (29.6% of those reached).

## Melee bench: F24

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1540912. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 152 over 6 battles (25.3 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 84.1 | 82 / 210 | 2.43 | 17.2% | 25112 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 17.2% | 82 |
| rz.GlowBlowMelee 1.4 | 2.3 | 14.3% | 42 |
| florent.XSeries.X2 0.12 | 2.8 | 13.6% | 35 |
| davidalves.Phoenix 0.54 | 4.0 | 12.6% | 32 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.2% | 14 |
| oog.melee.Corsair 1.0 | 6.0 | 9.1% | 4 |
| stelo.SoJNanoMelee 1.1 | 7.3 | 7.1% | 0 |
| lunchie.Lunchbox 0.93 | 8.0 | 5.5% | 0 |
| as.FrankTheTank 1.3 | 9.2 | 4.7% | 1 |
| evd.X1 0.01 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 85.7 | 14 / 35 | 4196 |
| 2 | 1 | 65.4 | 79.0 | 14 / 35 | 4075 |
| 3 | 1 | 68.3 | 87.9 | 18 / 35 | 4405 |
| 4 | 1 | 67.3 | 85.1 | 13 / 35 | 4543 |
| 5 | 1 | 65.6 | 84.4 | 13 / 35 | 3766 |
| 6 | 1 | 65.6 | 82.5 | 10 / 35 | 4127 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 38 | 45% |
| davidalves.Phoenix 0.54 | 32 | 53% |
| florent.XSeries.X2 0.12 | 30 | 60% |
| pedersen.Ugluk 1.1.1 | 23 | 83% |
| stelo.SoJNanoMelee 1.1 | 6 | 100% |
| oog.melee.Corsair 1.0 | 6 | 83% |

Hadur died in 128 of 210 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 35 | 27% | 64 |
| florent.XSeries.X2 0.12 | 34 | 27% | 47 |
| davidalves.Phoenix 0.54 | 31 | 24% | 50 |
| pedersen.Ugluk 1.1.1 | 15 | 12% | 24 |
| oog.melee.Corsair 1.0 | 9 | 7% | 18 |
| stelo.SoJNanoMelee 1.1 | 2 | 2% | 4 |
| as.FrankTheTank 1.3 | 2 | 2% | 2 |
| lunchie.Lunchbox 0.93 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 136244 melee ticks, 35230 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 56 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 45137 sent, 40157 reached their opponent, 7301 virtual hits (18.2% of those reached).

## Melee bench: F25

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1547012. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 141 over 6 battles (23.5 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 90.4 | 151 / 210 | 1.77 | 21.3% | 22994 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.3% | 151 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 15.1% | 20 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 14.7% | 11 |
| jdw.Hurricane 1.4 | 4.0 | 13.0% | 18 |
| ds.Oo 2.2 | 5.5 | 8.9% | 4 |
| adt.Ar2 1.1 | 6.0 | 8.2% | 2 |
| awesomeness.Elite 1.0 | 6.8 | 7.7% | 2 |
| gjr.Cephalosporin 0.1 | 7.7 | 7.0% | 2 |
| amk.ChumbaMini 0.2 | 9.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 87.9 | 23 / 35 | 3351 |
| 2 | 1 | 70.0 | 92.1 | 28 / 35 | 3734 |
| 3 | 1 | 68.8 | 86.8 | 24 / 35 | 3825 |
| 4 | 1 | 69.3 | 91.1 | 25 / 35 | 3861 |
| 5 | 1 | 69.8 | 91.1 | 24 / 35 | 3924 |
| 6 | 1 | 71.0 | 93.6 | 27 / 35 | 4299 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 57 | 98% |
| voidious.mini.BrokenSword 2.0.3 | 56 | 89% |
| jdw.Hurricane 1.4 | 32 | 81% |
| awesomeness.Elite 1.0 | 11 | 91% |
| ds.Oo 2.2 | 8 | 63% |
| adt.Ar2 1.1 | 5 | 80% |
| gjr.Cephalosporin 0.1 | 1 | 0% |

Hadur died in 59 of 210 rounds, at a mean tick of 622. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 14 | 24% | 63 |
| voidious.micro.BlitzBat 1.05 | 11 | 19% | 50 |
| jdw.Hurricane 1.4 | 11 | 19% | 30 |
| adt.Ar2 1.1 | 9 | 15% | 15 |
| ds.Oo 2.2 | 6 | 10% | 19 |
| awesomeness.Elite 1.0 | 5 | 8% | 23 |
| amk.ChumbaMini 0.2 | 2 | 3% | 6 |
| gjr.Cephalosporin 0.1 | 1 | 2% | 4 |

Posture (Hadur's M records, 198 rounds): 118654 melee ticks, 29158 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 33 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 39111 sent, 34920 reached their opponent, 5917 virtual hits (16.9% of those reached).

## Melee bench: F26

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1553762. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 173 over 6 battles (28.8 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 95.1 | 161 / 210 | 1.44 | 21.8% | 40292 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.8% | 161 |
| ak.Fermat 2.0 | 2.0 | 15.1% | 20 |
| shu.nitro.LENIN .T34 | 3.2 | 12.8% | 15 |
| lrem.Spectre 0.4.4 | 4.0 | 11.9% | 9 |
| js.PinBall 1.6 | 5.2 | 9.8% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 5.7 | 9.5% | 1 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 7.9% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.3% | 1 |
| sample.SpinBot 1.0 | 9.0 | 3.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 95.6 | 25 / 35 | 6962 |
| 2 | 1 | 74.0 | 99.4 | 33 / 35 | 6570 |
| 3 | 1 | 71.7 | 91.7 | 21 / 35 | 6484 |
| 4 | 1 | 73.0 | 94.0 | 27 / 35 | 7180 |
| 5 | 1 | 73.6 | 95.9 | 28 / 35 | 6889 |
| 6 | 1 | 72.3 | 94.3 | 27 / 35 | 6207 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 80 | 86% |
| shu.nitro.LENIN .T34 | 56 | 93% |
| lrem.Spectre 0.4.4 | 30 | 83% |
| jaybot.adv.bots.JayBot 2.0 | 8 | 88% |
| js.PinBall 1.6 | 8 | 88% |
| gh.mini.GrubbmOne 1.0 | 1 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 0% |

Hadur died in 49 of 210 rounds, at a mean tick of 990. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 20 | 41% | 75 |
| shu.nitro.LENIN .T34 | 11 | 22% | 72 |
| lrem.Spectre 0.4.4 | 10 | 20% | 34 |
| js.PinBall 1.6 | 4 | 8% | 18 |
| jaybot.adv.bots.JayBot 2.0 | 2 | 4% | 6 |
| gh.mini.GrubbmOne 1.0 | 1 | 2% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 2% | 2 |

Posture (Hadur's M records, 201 rounds): 159622 melee ticks, 49653 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 24 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 50654 sent, 45962 reached their opponent, 10852 virtual hits (23.6% of those reached).

## Melee bench: F27

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1545259. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 194 over 6 battles (32.3 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 90.6 | 161 / 210 | 1.85 | 20.6% | 33246 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.6% | 161 |
| mk.Alpha 0.2.1 | 2.0 | 14.2% | 27 |
| EH.Eagle 1.0.6 | 4.2 | 10.1% | 6 |
| sheldor.melee.nano.TestMelee 0.1 | 5.0 | 9.0% | 8 |
| techdude.kombat.FlamingKombat 1.5 | 5.2 | 9.2% | 2 |
| wee.Gem 1.8.4 | 6.7 | 8.4% | 2 |
| throxbot.ThroxBot 0.1 | 6.8 | 8.1% | 2 |
| joe.ADinosaur 1.0 | 6.8 | 8.3% | 1 |
| caimano.Furia_Ceca 0.22 | 7.5 | 8.0% | 2 |
| cs.Grudge 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 94.9 | 28 / 35 | 5292 |
| 2 | 1 | 70.5 | 91.1 | 28 / 35 | 5289 |
| 3 | 1 | 73.2 | 98.1 | 32 / 35 | 6330 |
| 4 | 1 | 64.6 | 69.8 | 16 / 35 | 5064 |
| 5 | 1 | 72.1 | 95.9 | 31 / 35 | 5645 |
| 6 | 1 | 71.1 | 93.7 | 26 / 35 | 5626 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 95 | 89% |
| EH.Eagle 1.0.6 | 28 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 16 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 89% |
| throxbot.ThroxBot 0.1 | 9 | 100% |
| caimano.Furia_Ceca 0.22 | 7 | 86% |
| wee.Gem 1.8.4 | 6 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 624. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 17 | 35% | 93 |
| cs.Grudge 1.0 | 8 | 16% | 8 |
| EH.Eagle 1.0.6 | 7 | 14% | 35 |
| throxbot.ThroxBot 0.1 | 6 | 12% | 14 |
| caimano.Furia_Ceca 0.22 | 5 | 10% | 12 |
| sheldor.melee.nano.TestMelee 0.1 | 2 | 4% | 14 |
| joe.ADinosaur 1.0 | 2 | 4% | 6 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 2% | 14 |
| wee.Gem 1.8.4 | 1 | 2% | 14 |

Posture (Hadur's M records, 199 rounds): 124757 melee ticks, 40849 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 42 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 2.

Targeting waves (199 rounds): 41564 sent, 36977 reached their opponent, 8982 virtual hits (24.3% of those reached).

## Melee bench: F28

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1548176. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 175 over 6 battles (29.2 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 91.5 | 137 / 210 | 1.76 | 19.1% | 25268 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 19.1% | 137 |
| kid.test.NightFox .2 | 2.0 | 15.0% | 33 |
| uji.Antique 1.0 | 3.3 | 12.0% | 18 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 11.1% | 11 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.4% | 5 |
| ahr.ice.Ice 1.0.2 | 6.5 | 7.8% | 2 |
| amk.ChumbaWumba 0.3 | 6.8 | 7.6% | 1 |
| matt.advanced.Katana 1.0 | 8.2 | 6.2% | 2 |
| stelo.Lifestealer 1.0 | 9.0 | 5.5% | 1 |
| stelo.PianistNano 1.2 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 94.6 | 28 / 35 | 4415 |
| 2 | 1 | 68.3 | 90.5 | 21 / 35 | 3986 |
| 3 | 1 | 67.6 | 89.2 | 20 / 35 | 3905 |
| 4 | 1 | 69.0 | 92.4 | 24 / 35 | 4257 |
| 5 | 1 | 69.0 | 92.1 | 23 / 35 | 4102 |
| 6 | 1 | 68.6 | 90.5 | 21 / 35 | 4603 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 82 | 82% |
| uji.Antique 1.0 | 41 | 83% |
| qohnil.blot.BlotBot 3.61 | 24 | 71% |
| pfvicm.Sobieski 7.2.3b | 9 | 78% |
| ahr.ice.Ice 1.0.2 | 6 | 83% |
| stelo.PianistNano 1.2 | 4 | 100% |
| amk.ChumbaWumba 0.3 | 3 | 100% |
| stelo.Lifestealer 1.0 | 1 | 0% |

Hadur died in 73 of 210 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 22 | 30% | 58 |
| uji.Antique 1.0 | 18 | 25% | 58 |
| pfvicm.Sobieski 7.2.3b | 11 | 15% | 20 |
| qohnil.blot.BlotBot 3.61 | 10 | 14% | 39 |
| amk.ChumbaWumba 0.3 | 4 | 5% | 11 |
| ahr.ice.Ice 1.0.2 | 4 | 5% | 10 |
| stelo.Lifestealer 1.0 | 2 | 3% | 6 |
| stelo.PianistNano 1.2 | 1 | 1% | 3 |
| matt.advanced.Katana 1.0 | 1 | 1% | 3 |

Posture (Hadur's M records, 198 rounds): 129238 melee ticks, 34575 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 47 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 43706 sent, 38984 reached their opponent, 5409 virtual hits (13.9% of those reached).

## Melee bench: F29

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1549895. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 158 over 6 battles (26.3 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 89.3 | 108 / 210 | 1.96 | 19.5% | 30169 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 19.5% | 108 |
| zyx.mega.YersiniaPestis 3.1 | 2.2 | 15.7% | 49 |
| deewiant.Anomaly 0.2 | 2.8 | 14.6% | 37 |
| myl.micro.Troodon 1.10 | 4.0 | 12.5% | 10 |
| jok.PheonixM 0.1.2 | 5.0 | 10.5% | 4 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.4% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.3 | 5.8% | 0 |
| DBall.Anarchy 0.1 | 8.2 | 5.0% | 2 |
| ap.Frederick 1.1 | 8.8 | 4.2% | 0 |
| jangs.ns51 1.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 92.1 | 23 / 35 | 4805 |
| 2 | 1 | 70.2 | 89.5 | 18 / 35 | 5071 |
| 3 | 1 | 70.2 | 90.5 | 17 / 35 | 4971 |
| 4 | 1 | 68.8 | 85.1 | 15 / 35 | 4922 |
| 5 | 1 | 71.1 | 91.7 | 19 / 35 | 5236 |
| 6 | 1 | 69.8 | 87.0 | 16 / 35 | 5164 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 65 | 63% |
| deewiant.Anomaly 0.2 | 57 | 53% |
| myl.micro.Troodon 1.10 | 20 | 95% |
| jok.PheonixM 0.1.2 | 13 | 92% |
| ph.melee.ArcherME 0.3 | 3 | 100% |
| ap.Frederick 1.1 | 1 | 100% |
| DBall.Anarchy 0.1 | 1 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 1085. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 40 | 39% | 81 |
| zyx.mega.YersiniaPestis 3.1 | 40 | 39% | 80 |
| jok.PheonixM 0.1.2 | 11 | 11% | 21 |
| myl.micro.Troodon 1.10 | 8 | 8% | 19 |
| DBall.Anarchy 0.1 | 1 | 1% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 1 |
| ph.melee.ArcherME 0.3 | 1 | 1% | 1 |

Posture (Hadur's M records, 200 rounds): 169302 melee ticks, 54117 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 64 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 53236 sent, 48662 reached their opponent, 7349 virtual hits (15.1% of those reached).

## Melee bench: F30

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1535861. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 136 over 6 battles (22.7 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 82.3 | 74 / 210 | 2.41 | 18.7% | 26089 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 18.7% | 74 |
| darkcanuck.B26354 1.06 | 2.2 | 16.3% | 64 |
| stelo.PastFuture 2.3.2 | 3.2 | 14.1% | 28 |
| oog.melee.Capulet 1.2 | 3.7 | 13.9% | 26 |
| intruder.PrairieWolf 2.61 | 5.2 | 10.1% | 11 |
| tripphippy.Alice 1.1 | 6.7 | 8.6% | 2 |
| ntc.Opposite 1.5 | 6.8 | 8.2% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 7.3 | 7.0% | 4 |
| GarmBox.Anger 1.0 | 9.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 81.8 | 13 / 35 | 4330 |
| 2 | 1 | 66.9 | 82.9 | 15 / 35 | 4412 |
| 3 | 1 | 64.5 | 81.8 | 9 / 35 | 3813 |
| 4 | 1 | 65.9 | 81.1 | 11 / 35 | 4337 |
| 5 | 1 | 67.7 | 83.6 | 11 / 35 | 4796 |
| 6 | 1 | 67.0 | 82.9 | 15 / 35 | 4401 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 57 | 44% |
| oog.melee.Capulet 1.2 | 32 | 59% |
| stelo.PastFuture 2.3.2 | 27 | 52% |
| intruder.PrairieWolf 2.61 | 13 | 69% |
| tripphippy.Alice 1.1 | 5 | 80% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 75% |

Hadur died in 136 of 210 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 56 | 41% | 78 |
| stelo.PastFuture 2.3.2 | 32 | 24% | 46 |
| oog.melee.Capulet 1.2 | 24 | 18% | 46 |
| intruder.PrairieWolf 2.61 | 11 | 8% | 21 |
| tripphippy.Alice 1.1 | 8 | 6% | 12 |
| fowl3628800.LightningBolt 2.6.0 | 3 | 2% | 5 |
| ntc.Opposite 1.5 | 2 | 1% | 2 |

Posture (Hadur's M records, 199 rounds): 159925 melee ticks, 43467 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 48 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 46285 sent, 42039 reached their opponent, 7206 virtual hits (17.1% of those reached).

## Melee bench: F31

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1532944. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 157 over 6 battles (26.2 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 79.4 | 69 / 210 | 2.85 | 16.0% | 22367 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.4% | 83 |
| hadur117.Hadur 3.21bb | 2.0 | 16.0% | 69 |
| gh.mini.Griezel 0.2 | 3.2 | 12.8% | 36 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.6% | 11 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 11.0% | 5 |
| gh.nano.Grofvuil 0.2 | 6.3 | 8.2% | 2 |
| timmit.nano.TimDog 0.33 | 6.7 | 7.3% | 2 |
| fm.mammillarias 1.3 | 8.5 | 5.7% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.1% | 0 |
| tlp.ThreeLeggedPig 1 | 9.3 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 80.6 | 10 / 35 | 3866 |
| 2 | 2 | 64.3 | 75.2 | 14 / 35 | 3764 |
| 3 | 2 | 64.5 | 79.0 | 8 / 35 | 3870 |
| 4 | 2 | 65.1 | 81.6 | 13 / 35 | 3726 |
| 5 | 2 | 64.6 | 80.6 | 13 / 35 | 3439 |
| 6 | 2 | 64.2 | 79.4 | 11 / 35 | 3702 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 61 | 51% |
| gh.mini.Griezel 0.2 | 32 | 41% |
| d414.nano.Quantum 1.0.0 | 14 | 79% |
| spinnercat.micro.Tyger 0.1 | 9 | 89% |
| gh.nano.Grofvuil 0.2 | 4 | 75% |
| timmit.nano.TimDog 0.33 | 2 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 0% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 798. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 48 | 34% | 77 |
| gh.mini.Griezel 0.2 | 32 | 23% | 50 |
| d414.nano.Quantum 1.0.0 | 17 | 12% | 27 |
| spinnercat.micro.Tyger 0.1 | 16 | 11% | 21 |
| gh.nano.Grofvuil 0.2 | 9 | 6% | 12 |
| timmit.nano.TimDog 0.33 | 8 | 6% | 10 |
| Gecko.ultimateGeckoBot 1.0 | 4 | 3% | 5 |
| fm.mammillarias 1.3 | 4 | 3% | 4 |
| tlp.ThreeLeggedPig 1 | 3 | 2% | 4 |

Posture (Hadur's M records, 200 rounds): 142244 melee ticks, 34703 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 35 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 46392 sent, 41616 reached their opponent, 6753 virtual hits (16.2% of those reached).

## Melee bench: F32

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1537154. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 189 over 6 battles (31.5 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 89.9 | 132 / 210 | 1.90 | 19.0% | 28647 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 19.0% | 132 |
| kawigi.sbf.FloodHT 0.9.2 | 2.2 | 15.1% | 47 |
| apc.botM 3.0 | 2.8 | 12.6% | 18 |
| lxx.ConceptA 0.8 | 4.5 | 10.0% | 5 |
| bayen.UbaMicro 1.4 | 5.3 | 9.0% | 3 |
| vjik.UnViolation 1.1 | 5.5 | 9.3% | 2 |
| yk.JahMicro 1.0 | 7.7 | 7.0% | 3 |
| conscience.Electron 1.3g | 7.8 | 7.0% | 0 |
| panzer.Panzer 0.2 | 8.2 | 6.8% | 1 |
| donjezza.Jezza 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 90.8 | 24 / 35 | 5015 |
| 2 | 1 | 66.9 | 84.8 | 19 / 35 | 4533 |
| 3 | 1 | 68.6 | 89.8 | 20 / 35 | 4916 |
| 4 | 1 | 69.8 | 93.0 | 25 / 35 | 4878 |
| 5 | 1 | 68.2 | 88.9 | 21 / 35 | 4713 |
| 6 | 1 | 69.0 | 92.4 | 23 / 35 | 4592 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 88 | 65% |
| apc.botM 3.0 | 42 | 81% |
| lxx.ConceptA 0.8 | 16 | 81% |
| vjik.UnViolation 1.1 | 11 | 100% |
| bayen.UbaMicro 1.4 | 10 | 80% |
| yk.JahMicro 1.0 | 6 | 100% |
| panzer.Panzer 0.2 | 2 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 740. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 37 | 45% | 86 |
| lxx.ConceptA 0.8 | 18 | 22% | 32 |
| apc.botM 3.0 | 12 | 15% | 46 |
| bayen.UbaMicro 1.4 | 6 | 7% | 12 |
| vjik.UnViolation 1.1 | 3 | 4% | 18 |
| panzer.Panzer 0.2 | 3 | 4% | 4 |
| yk.JahMicro 1.0 | 2 | 2% | 6 |
| conscience.Electron 1.3g | 1 | 1% | 3 |
| donjezza.Jezza 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 199 rounds): 122027 melee ticks, 48916 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 66 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 41244 sent, 36600 reached their opponent, 6780 virtual hits (18.5% of those reached).

## Melee bench: F33

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1537260. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 159 over 6 battles (26.5 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 92.6 | 144 / 210 | 1.60 | 22.8% | 30284 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 22.8% | 144 |
| maribo.Quester 0.3 | 2.0 | 17.3% | 25 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 14.5% | 27 |
| labg.Cataclysm 2.05 | 4.5 | 11.1% | 8 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.2 | 9.9% | 3 |
| baal.nano.N 1.42 | 5.3 | 9.9% | 2 |
| zyx.micro.Ant 1.1 | 7.3 | 6.3% | 0 |
| sanja.First 0.1 | 7.7 | 5.3% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 94.3 | 28 / 35 | 5726 |
| 2 | 1 | 71.8 | 92.1 | 25 / 35 | 5295 |
| 3 | 1 | 70.9 | 91.1 | 21 / 35 | 4983 |
| 4 | 1 | 69.6 | 89.6 | 20 / 35 | 4443 |
| 5 | 1 | 71.7 | 92.5 | 25 / 35 | 4804 |
| 6 | 1 | 72.2 | 95.7 | 25 / 35 | 5033 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 89 | 85% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 45 | 73% |
| labg.Cataclysm 2.05 | 19 | 89% |
| kinsen.melee.Angsaichmophobia 1.8c | 13 | 92% |
| baal.nano.N 1.42 | 5 | 80% |
| sanja.First 0.1 | 2 | 50% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 1101. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 27 | 40% | 91 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 31% | 58 |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 9% | 16 |
| baal.nano.N 1.42 | 6 | 9% | 16 |
| labg.Cataclysm 2.05 | 4 | 6% | 24 |
| sanja.First 0.1 | 2 | 3% | 2 |
| zyx.micro.Ant 1.1 | 1 | 1% | 2 |

Posture (Hadur's M records, 199 rounds): 163906 melee ticks, 59417 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 55 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 47870 sent, 43707 reached their opponent, 6588 virtual hits (15.1% of those reached).

## Melee bench: F34

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1543473. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 155 over 6 battles (25.8 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 90.3 | 109 / 210 | 1.88 | 19.5% | 33937 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 19.5% | 109 |
| kid.Gladiator .7.2 | 2.3 | 16.2% | 42 |
| stelo.Spread 0.9 | 2.7 | 15.7% | 43 |
| jcs.Seth 1.8 | 4.0 | 11.3% | 12 |
| tcf.Reach 3 | 5.0 | 10.6% | 3 |
| cli.Dancer 1.1 | 6.0 | 9.2% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 6.9% | 0 |
| amk.Punbot.Punbot 0.01 | 8.2 | 4.2% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.5% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 90.8 | 15 / 35 | 5414 |
| 2 | 1 | 71.0 | 90.8 | 22 / 35 | 5496 |
| 3 | 1 | 70.5 | 89.8 | 18 / 35 | 5728 |
| 4 | 1 | 72.0 | 94.3 | 22 / 35 | 6125 |
| 5 | 1 | 69.8 | 88.3 | 17 / 35 | 5463 |
| 6 | 1 | 69.7 | 87.6 | 15 / 35 | 5711 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 76 | 64% |
| stelo.Spread 0.9 | 60 | 63% |
| jcs.Seth 1.8 | 15 | 47% |
| tcf.Reach 3 | 12 | 92% |
| ratosh.Wesco 1.4 | 2 | 100% |
| cli.Dancer 1.1 | 2 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 1121. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 43 | 43% | 83 |
| stelo.Spread 0.9 | 35 | 35% | 76 |
| jcs.Seth 1.8 | 16 | 16% | 21 |
| tcf.Reach 3 | 4 | 4% | 17 |
| cli.Dancer 1.1 | 2 | 2% | 5 |
| ratosh.Wesco 1.4 | 1 | 1% | 5 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 165655 melee ticks, 60982 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 32 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 50780 sent, 46188 reached their opponent, 7658 virtual hits (16.6% of those reached).

## Melee bench: F35

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1527600. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 122 over 6 battles (20.3 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 84.6 | 49 / 210 | 2.39 | 16.7% | 24865 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.1% | 133 |
| hadur117.Hadur 3.21bb | 2.0 | 16.7% | 49 |
| gh.mini.Gruwel 0.9 | 3.2 | 12.7% | 18 |
| rz.HawkOnFire 0.1 | 4.0 | 12.0% | 4 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.8 | 11.2% | 6 |
| wit.Chuliath 1.0 | 6.5 | 7.1% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.2 | 6.1% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.5 | 5.1% | 0 |
| dans.Cinnamon 1.2 | 8.7 | 5.2% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.5 | 83.2 | 12 / 35 | 4261 |
| 2 | 2 | 65.6 | 82.2 | 6 / 35 | 4051 |
| 3 | 2 | 67.9 | 89.2 | 10 / 35 | 4320 |
| 4 | 2 | 66.0 | 84.1 | 9 / 35 | 4082 |
| 5 | 2 | 65.7 | 84.1 | 5 / 35 | 4108 |
| 6 | 2 | 66.0 | 84.8 | 7 / 35 | 4043 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 104 | 20% |
| gh.mini.Gruwel 0.9 | 20 | 45% |
| rz.HawkOnFire 0.1 | 16 | 81% |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 75% |

Hadur died in 161 of 210 rounds, at a mean tick of 1004. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 104 | 65% | 125 |
| gh.mini.Gruwel 0.9 | 26 | 16% | 35 |
| rz.HawkOnFire 0.1 | 14 | 9% | 27 |
| dmh.robocode.robot.BlackDeath 9.2 | 14 | 9% | 20 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 2 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |

Posture (Hadur's M records, 200 rounds): 145084 melee ticks, 55122 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 27 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 27 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 44396 sent, 39653 reached their opponent, 6090 virtual hits (15.4% of those reached).

## Melee bench: F36

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1538978. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 207 over 6 battles (34.5 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 95.0 | 168 / 210 | 1.45 | 21.5% | 33999 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.5% | 168 |
| alpha.RainingFire 1.0 | 2.3 | 13.0% | 13 |
| bzdp.Pansy 2.1 | 2.8 | 11.9% | 14 |
| bvh.micro.Freya 0.3 | 4.7 | 10.4% | 6 |
| mz.Cork 0.1 | 5.0 | 10.1% | 3 |
| m3thos.Eva02 0.7.1 | 5.8 | 9.7% | 6 |
| bvh.mini.Fenrir 0.39 | 6.3 | 8.9% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 5.9% | 0 |
| dl.BetterWalls 1.0 | 9.0 | 5.0% | 1 |
| sample.MyFirstRobot 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 93.7 | 27 / 35 | 5507 |
| 2 | 1 | 71.2 | 94.0 | 24 / 35 | 5468 |
| 3 | 1 | 72.3 | 95.9 | 32 / 35 | 5674 |
| 4 | 1 | 71.7 | 94.6 | 29 / 35 | 5687 |
| 5 | 1 | 72.7 | 96.5 | 29 / 35 | 5855 |
| 6 | 1 | 72.2 | 95.2 | 27 / 35 | 5808 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 45 | 82% |
| alpha.RainingFire 1.0 | 40 | 90% |
| bvh.micro.Freya 0.3 | 37 | 95% |
| mz.Cork 0.1 | 30 | 100% |
| bvh.mini.Fenrir 0.39 | 15 | 93% |
| m3thos.Eva02 0.7.1 | 14 | 71% |
| sample.MyFirstRobot 1.0 | 4 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 43 of 210 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 12 | 28% | 50 |
| bzdp.Pansy 2.1 | 12 | 28% | 47 |
| m3thos.Eva02 0.7.1 | 6 | 14% | 28 |
| bvh.mini.Fenrir 0.39 | 5 | 12% | 13 |
| mz.Cork 0.1 | 4 | 9% | 31 |
| bvh.micro.Freya 0.3 | 2 | 5% | 25 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 7 |
| dl.BetterWalls 1.0 | 0 | 0% | 8 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 140628 melee ticks, 48133 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 49 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 48595 sent, 44042 reached their opponent, 9380 virtual hits (21.3% of those reached).

## Melee bench: F37

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1545407. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 234 over 6 battles (39.0 per battle, most in one battle 49). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 83.9 | 142 / 210 | 2.45 | 18.2% | 32083 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 18.2% | 142 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.0 | 11.8% | 13 |
| EBBU.Sim2 1.02 | 4.2 | 9.8% | 6 |
| germ.TheMind .2 | 4.5 | 9.9% | 8 |
| agrach.Dalek 1.0 | 5.5 | 9.5% | 11 |
| mn.nano.perceptual.Impact 1.3.0 | 6.0 | 8.8% | 1 |
| stelo.UntouchableNano 1.3 | 7.2 | 8.5% | 12 |
| mb.Beast 0.1 | 7.5 | 8.0% | 3 |
| lmk.ACPFinal 0.1 | 7.5 | 8.2% | 9 |
| skm.Ryubot 1.0 | 9.7 | 7.2% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 80.0 | 22 / 35 | 5157 |
| 2 | 1 | 67.0 | 85.4 | 23 / 35 | 5338 |
| 3 | 1 | 67.5 | 86.7 | 26 / 35 | 5224 |
| 4 | 1 | 65.1 | 76.5 | 20 / 35 | 5519 |
| 5 | 1 | 67.9 | 86.0 | 25 / 35 | 5399 |
| 6 | 1 | 68.1 | 88.6 | 26 / 35 | 5446 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 29 | 93% |
| germ.TheMind .2 | 24 | 92% |
| agrach.Dalek 1.0 | 23 | 100% |
| stelo.UntouchableNano 1.3 | 18 | 78% |
| EBBU.Sim2 1.02 | 18 | 100% |
| mb.Beast 0.1 | 17 | 100% |
| lmk.ACPFinal 0.1 | 15 | 80% |
| skm.Ryubot 1.0 | 7 | 86% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 408. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 17 | 25% | 22 |
| com.syncleus.robocode.Dreadnaught 0.1 | 14 | 21% | 39 |
| lmk.ACPFinal 0.1 | 11 | 16% | 19 |
| stelo.UntouchableNano 1.3 | 8 | 12% | 29 |
| mb.Beast 0.1 | 7 | 10% | 20 |
| agrach.Dalek 1.0 | 5 | 7% | 40 |
| EBBU.Sim2 1.02 | 3 | 4% | 18 |
| germ.TheMind .2 | 2 | 3% | 16 |
| skm.Ryubot 1.0 | 1 | 1% | 6 |

Posture (Hadur's M records, 199 rounds): 91148 melee ticks, 21651 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 51 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 31231 sent, 26925 reached their opponent, 7874 virtual hits (29.2% of those reached).

## Melee bench: F38

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1535003. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 161 over 6 battles (26.8 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.5 | 120 / 210 | 2.04 | 18.9% | 29379 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 18.9% | 120 |
| justin.Mallais 14.0 | 2.0 | 15.5% | 51 |
| bvh.mini.Freya 0.55 | 3.0 | 12.9% | 14 |
| cs.Wren 1.0 | 4.3 | 10.7% | 5 |
| bts.mega.Gnarly 1.4 | 4.8 | 10.8% | 13 |
| kdf.KoulDestroyer 1.0 | 6.0 | 9.3% | 4 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.8 | 7.5% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.4% | 2 |
| bzdp.BoxCar 2.0 | 9.3 | 4.1% | 0 |
| matt.UnderDark3 2.4.34 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 89.2 | 20 / 35 | 4895 |
| 2 | 1 | 68.3 | 86.3 | 22 / 35 | 4692 |
| 3 | 1 | 69.0 | 90.8 | 20 / 35 | 4876 |
| 4 | 1 | 67.6 | 82.9 | 15 / 35 | 5009 |
| 5 | 1 | 70.2 | 92.4 | 21 / 35 | 5031 |
| 6 | 1 | 69.3 | 89.2 | 22 / 35 | 4876 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 62 | 65% |
| bts.mega.Gnarly 1.4 | 32 | 78% |
| bvh.mini.Freya 0.55 | 28 | 75% |
| cs.Wren 1.0 | 18 | 83% |
| kdf.KoulDestroyer 1.0 | 9 | 89% |
| kawigi.spare.SpareParts 0.7.6nosnd | 6 | 67% |
| davidalves.net.DuelistNanoMelee 1.01 | 5 | 100% |
| matt.UnderDark3 2.4.34 | 2 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 826. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 37 | 41% | 82 |
| bvh.mini.Freya 0.55 | 18 | 20% | 34 |
| bts.mega.Gnarly 1.4 | 13 | 14% | 35 |
| kawigi.spare.SpareParts 0.7.6nosnd | 6 | 7% | 11 |
| kdf.KoulDestroyer 1.0 | 5 | 5% | 15 |
| cs.Wren 1.0 | 4 | 4% | 18 |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 4% | 7 |
| matt.UnderDark3 2.4.34 | 3 | 3% | 5 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |

Posture (Hadur's M records, 198 rounds): 135089 melee ticks, 42354 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 48 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 43785 sent, 38991 reached their opponent, 8270 virtual hits (21.2% of those reached).

## Melee bench: F39

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1536135. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 145 over 6 battles (24.2 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 93.2 | 138 / 210 | 1.55 | 22.7% | 34591 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 22.7% | 138 |
| bvh.fry.Freya 0.82 | 2.2 | 17.0% | 24 |
| az.Ololobot 0.2.4 | 2.8 | 14.0% | 45 |
| winamp32.micro.MicroMacro 1.0 | 4.5 | 9.5% | 1 |
| gimp.GimpBot 0.1 | 5.0 | 9.1% | 1 |
| apollokidd.ApolloKidd 0.9 | 6.2 | 8.3% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 6.3 | 8.1% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.5 | 5.7% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 93.6 | 25 / 35 | 6122 |
| 2 | 1 | 70.7 | 93.6 | 22 / 35 | 5631 |
| 3 | 1 | 71.2 | 91.4 | 23 / 35 | 5978 |
| 4 | 1 | 71.3 | 94.3 | 25 / 35 | 5740 |
| 5 | 1 | 71.5 | 95.4 | 24 / 35 | 5702 |
| 6 | 1 | 69.8 | 90.7 | 19 / 35 | 5418 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 93 | 84% |
| az.Ololobot 0.2.4 | 67 | 55% |
| stelo.SoRobotNanoMelee 1.2 | 8 | 100% |
| gimp.GimpBot 0.1 | 7 | 100% |
| winamp32.micro.MicroMacro 1.0 | 5 | 100% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 1188. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 33 | 46% | 77 |
| bvh.fry.Freya 0.82 | 30 | 42% | 80 |
| dcs.Eater_of_Worlds 1.1.3-A | 3 | 4% | 4 |
| winamp32.micro.MicroMacro 1.0 | 2 | 3% | 16 |
| gimp.GimpBot 0.1 | 1 | 1% | 14 |
| stelo.SoRobotNanoMelee 1.2 | 1 | 1% | 8 |
| apollokidd.ApolloKidd 0.9 | 1 | 1% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 5 |

Posture (Hadur's M records, 199 rounds): 155440 melee ticks, 62946 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 40 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 45280 sent, 41106 reached their opponent, 7878 virtual hits (19.2% of those reached).

## Melee bench: F40

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1558342. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 193 over 6 battles (32.2 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 90.8 | 129 / 210 | 1.83 | 20.1% | 32013 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.1% | 129 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.5% | 34 |
| kano.gamma.KanoGamma 1.8 | 3.3 | 12.8% | 20 |
| mz.AntiGrav 1.0 | 4.2 | 11.1% | 7 |
| Polkwane.SmashMelee 1.0 | 5.2 | 10.0% | 10 |
| stelo.Randomness 1.0 | 6.2 | 8.9% | 8 |
| alpha.BlackIce 1.0 | 6.5 | 8.7% | 2 |
| amk.superstrike.SuperStrike 0.3 | 7.7 | 7.1% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 3.9% | 0 |
| sample.Corners 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 86.3 | 20 / 35 | 5598 |
| 2 | 1 | 70.5 | 92.7 | 20 / 35 | 5137 |
| 3 | 1 | 70.3 | 90.2 | 22 / 35 | 5173 |
| 4 | 1 | 70.1 | 90.2 | 21 / 35 | 5251 |
| 5 | 1 | 70.7 | 93.0 | 20 / 35 | 5218 |
| 6 | 1 | 71.6 | 92.4 | 26 / 35 | 5636 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 63 | 71% |
| kano.gamma.KanoGamma 1.8 | 42 | 83% |
| mz.AntiGrav 1.0 | 22 | 95% |
| Polkwane.SmashMelee 1.0 | 20 | 75% |
| stelo.Randomness 1.0 | 10 | 60% |
| amk.superstrike.SuperStrike 0.3 | 4 | 100% |
| alpha.BlackIce 1.0 | 3 | 67% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 896. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 29 | 36% | 67 |
| kano.gamma.KanoGamma 1.8 | 15 | 19% | 48 |
| Polkwane.SmashMelee 1.0 | 15 | 19% | 24 |
| stelo.Randomness 1.0 | 11 | 14% | 27 |
| alpha.BlackIce 1.0 | 6 | 7% | 10 |
| mz.AntiGrav 1.0 | 4 | 5% | 25 |
| amk.superstrike.SuperStrike 0.3 | 1 | 1% | 7 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 200 rounds): 149707 melee ticks, 42991 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 65 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 48972 sent, 44173 reached their opponent, 9030 virtual hits (20.4% of those reached).

## Melee bench: F41

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1528500. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 146 over 6 battles (24.3 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 88.4 | 115 / 210 | 2.05 | 18.7% | 27729 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 18.7% | 115 |
| eem.EvBotNG v12.8 | 2.0 | 15.9% | 64 |
| ary.Swarm 1.1 | 3.2 | 13.1% | 7 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.4% | 15 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 11.0% | 9 |
| shrub.Silver v048 | 6.0 | 9.0% | 3 |
| zyx.nano.Ant 1.1 | 7.0 | 6.9% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 5.4% | 1 |
| stelo.Mirror 1.1 | 8.7 | 5.3% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 85.1 | 18 / 35 | 4608 |
| 2 | 1 | 69.1 | 89.2 | 19 / 35 | 4411 |
| 3 | 1 | 68.4 | 86.3 | 18 / 35 | 4518 |
| 4 | 1 | 70.1 | 91.7 | 23 / 35 | 4773 |
| 5 | 1 | 70.2 | 90.2 | 20 / 35 | 5100 |
| 6 | 1 | 68.2 | 87.6 | 17 / 35 | 4319 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 75 | 52% |
| lessonz.robocode.Oz 0.5.0 | 36 | 92% |
| ary.Swarm 1.1 | 24 | 96% |
| simonton.nano.MeleeSeed 1.8 | 15 | 93% |
| shrub.Silver v048 | 6 | 83% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 971. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 49 | 49% | 90 |
| lessonz.robocode.Oz 0.5.0 | 20 | 20% | 37 |
| ary.Swarm 1.1 | 12 | 12% | 36 |
| simonton.nano.MeleeSeed 1.8 | 8 | 8% | 25 |
| shrub.Silver v048 | 3 | 3% | 9 |
| stelo.Mirror 1.1 | 2 | 2% | 6 |
| zyx.nano.Ant 1.1 | 2 | 2% | 2 |
| jsal.Jsalbot 1.0 | 0 | 0% | 4 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 150997 melee ticks, 47662 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 103 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 103 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 48839 sent, 44083 reached their opponent, 6664 virtual hits (15.1% of those reached).

## Melee bench: F42

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1528881. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 139 over 6 battles (23.2 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 91.7 | 143 / 210 | 1.75 | 20.4% | 35541 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.4% | 143 |
| wompi.Wallaby 5.1 | 2.0 | 15.1% | 29 |
| maribo.mini.MiniQuester 0.1 | 3.0 | 14.0% | 17 |
| ara.Shera 0.88 | 4.0 | 13.0% | 22 |
| amz.NanoClone 1.41 | 5.0 | 9.1% | 0 |
| maribo.IotaCT 1.1 | 6.5 | 6.6% | 0 |
| dsw.StaticD 1.0 | 6.7 | 6.6% | 0 |
| mme.NikeEnhanced 2.0 | 8.7 | 5.3% | 0 |
| stelo.MirrorMicro 1.0 | 8.7 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 89.5 | 21 / 35 | 5663 |
| 2 | 1 | 71.3 | 93.3 | 28 / 35 | 5724 |
| 3 | 1 | 72.1 | 94.3 | 27 / 35 | 6257 |
| 4 | 1 | 70.3 | 89.5 | 21 / 35 | 5831 |
| 5 | 1 | 71.3 | 92.7 | 24 / 35 | 6059 |
| 6 | 1 | 70.9 | 90.8 | 22 / 35 | 6007 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 82 | 90% |
| maribo.mini.MiniQuester 0.1 | 56 | 86% |
| ara.Shera 0.88 | 25 | 76% |
| mme.NikeEnhanced 2.0 | 1 | 100% |
| dsw.StaticD 1.0 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 968. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 24 | 34% | 81 |
| ara.Shera 0.88 | 23 | 33% | 54 |
| maribo.mini.MiniQuester 0.1 | 18 | 26% | 62 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 3 |
| amz.NanoClone 1.41 | 1 | 1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 1 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 1 |
| dsw.StaticD 1.0 | 0 | 0% | 4 |
| maribo.IotaCT 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 160478 melee ticks, 51595 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 34 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 50691 sent, 45994 reached their opponent, 9186 virtual hits (20.0% of those reached).

## Melee bench: F43

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1561318. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 136 over 6 battles (22.7 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 79.9 | 48 / 210 | 2.80 | 16.2% | 25613 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.0% | 132 |
| hadur117.Hadur 3.21bb | 2.0 | 16.2% | 48 |
| brainfade.melee.Dusk 0.44 | 3.2 | 13.0% | 24 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.7% | 3 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.5% | 3 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.8% | 2 |
| jab.DiamondStealer 5 | 7.2 | 7.9% | 0 |
| mz.NanoGod 2.02 | 7.7 | 7.1% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.1% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 75.9 | 6 / 35 | 4259 |
| 2 | 2 | 68.3 | 84.4 | 8 / 35 | 4640 |
| 3 | 2 | 66.4 | 81.6 | 10 / 35 | 3986 |
| 4 | 2 | 66.0 | 76.2 | 11 / 35 | 4249 |
| 5 | 2 | 67.0 | 83.5 | 6 / 35 | 4198 |
| 6 | 2 | 66.0 | 78.1 | 7 / 35 | 4281 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 76 | 26% |
| brainfade.melee.Dusk 0.44 | 22 | 55% |
| wcsv.melee.EngineerMelee 0.1 | 6 | 100% |
| dummy.micro.Sparrow 2.5 | 5 | 100% |
| Krabb.akim2.Akim2 1.1b | 3 | 67% |
| mz.NanoGod 2.02 | 2 | 100% |
| jab.DiamondStealer 5 | 1 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 940. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 88 | 54% | 109 |
| brainfade.melee.Dusk 0.44 | 30 | 18% | 38 |
| wcsv.melee.EngineerMelee 0.1 | 16 | 10% | 24 |
| dummy.micro.Sparrow 2.5 | 15 | 9% | 24 |
| jab.DiamondStealer 5 | 6 | 4% | 6 |
| Krabb.akim2.Akim2 1.1b | 5 | 3% | 6 |
| mz.NanoGod 2.02 | 2 | 1% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 155042 melee ticks, 44216 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 40 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 48336 sent, 43598 reached their opponent, 7130 virtual hits (16.4% of those reached).

## Melee bench: F44

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1542122. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 152 over 6 battles (25.3 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 94.7 | 147 / 210 | 1.48 | 21.4% | 36296 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.4% | 147 |
| stelo.Liblix 0.3.1 | 2.2 | 15.9% | 47 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.1% | 14 |
| jwirde.Gort 2.0 | 4.2 | 9.4% | 3 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.8 | 8.9% | 0 |
| disan.Chair 2.2.0 | 6.5 | 7.6% | 0 |
| wompi.Quokka 1.6 | 6.8 | 6.9% | 0 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.3% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.0 | 4.8% | 0 |
| sample.Crazy 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 96.2 | 24 / 35 | 5993 |
| 2 | 1 | 72.2 | 94.3 | 24 / 35 | 6168 |
| 3 | 1 | 72.3 | 94.9 | 28 / 35 | 5947 |
| 4 | 1 | 70.9 | 92.7 | 22 / 35 | 5597 |
| 5 | 1 | 72.5 | 94.6 | 25 / 35 | 6423 |
| 6 | 1 | 72.3 | 95.2 | 24 / 35 | 6168 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 103 | 70% |
| tzu.TheArtOfWar 1.2 | 64 | 89% |
| jwirde.Gort 2.0 | 8 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 100% |
| disan.Chair 2.2.0 | 3 | 100% |
| wompi.Quokka 1.6 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 1044. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 40 | 63% | 106 |
| tzu.TheArtOfWar 1.2 | 14 | 22% | 61 |
| jwirde.Gort 2.0 | 6 | 10% | 24 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 2 | 3% | 4 |
| disan.Chair 2.2.0 | 1 | 2% | 6 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 4 |
| stf.PanzerGeneral 0.1 | 0 | 0% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 1 |
| wompi.Quokka 1.6 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 153646 melee ticks, 50369 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 70 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 52143 sent, 47552 reached their opponent, 9892 virtual hits (20.8% of those reached).

## Melee bench: F45

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1550582. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 176 over 6 battles (29.3 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.0 | 108 / 210 | 2.08 | 19.9% | 34278 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 19.9% | 108 |
| jje.BagPuss 1.2 | 2.2 | 12.7% | 15 |
| eem.IWillFireNoBullet v2.8 | 3.8 | 11.3% | 63 |
| sul.Lunar 1.1 | 4.0 | 11.1% | 17 |
| myl.nano.Graviton 1.10 | 4.3 | 10.4% | 1 |
| hvilela.HVilela 0.9 | 6.5 | 8.9% | 0 |
| fm.claire 1.7 | 6.7 | 8.5% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.7 | 7.3% | 0 |
| wit.Deep7 2.0 | 8.8 | 6.2% | 6 |
| abud.ThirdRobo 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 88.6 | 20 / 35 | 5526 |
| 2 | 1 | 69.6 | 87.6 | 18 / 35 | 5665 |
| 3 | 1 | 69.7 | 88.9 | 15 / 35 | 5893 |
| 4 | 1 | 71.2 | 92.1 | 22 / 35 | 5908 |
| 5 | 1 | 68.1 | 81.6 | 14 / 35 | 5560 |
| 6 | 1 | 70.0 | 89.5 | 19 / 35 | 5726 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 65 | 49% |
| jje.BagPuss 1.2 | 46 | 74% |
| sul.Lunar 1.1 | 18 | 89% |
| myl.nano.Graviton 1.10 | 16 | 94% |
| pez.mini.ChironexFleckeri 0.5 | 7 | 100% |
| wit.Deep7 2.0 | 3 | 67% |
| hvilela.HVilela 0.9 | 1 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 1567. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 41 | 40% | 0 |
| jje.BagPuss 1.2 | 20 | 20% | 73 |
| sul.Lunar 1.1 | 11 | 11% | 43 |
| myl.nano.Graviton 1.10 | 10 | 10% | 23 |
| fm.claire 1.7 | 6 | 6% | 19 |
| wit.Deep7 2.0 | 5 | 5% | 13 |
| pez.mini.ChironexFleckeri 0.5 | 4 | 4% | 19 |
| hvilela.HVilela 0.9 | 4 | 4% | 16 |
| abud.ThirdRobo 1.0 | 1 | 1% | 2 |

Posture (Hadur's M records, 200 rounds): 196847 melee ticks, 82846 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 79 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 59515 sent, 54900 reached their opponent, 8216 virtual hits (15.0% of those reached).

## Melee bench: F46

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1542734. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 135 over 6 battles (22.5 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 89.9 | 127 / 210 | 1.80 | 21.3% | 30210 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.3% | 127 |
| kc.mini.Mirage 0.2 | 2.0 | 18.8% | 60 |
| mz.MicroSheep 1.0 | 3.5 | 12.1% | 6 |
| cx.Princess 1.0 | 3.7 | 11.9% | 15 |
| sadoner.killer 0.2 | 4.8 | 10.7% | 2 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.3% | 0 |
| jeremyreeder.collective.Prophet 5 | 7.2 | 7.2% | 0 |
| kurios.DOSexe .9a | 7.7 | 6.1% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 93.9 | 25 / 35 | 4754 |
| 2 | 1 | 69.6 | 88.9 | 20 / 35 | 5068 |
| 3 | 1 | 68.2 | 85.7 | 17 / 35 | 4851 |
| 4 | 1 | 70.6 | 91.1 | 22 / 35 | 5473 |
| 5 | 1 | 68.5 | 87.9 | 18 / 35 | 4667 |
| 6 | 1 | 71.2 | 92.1 | 25 / 35 | 5397 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 129 | 70% |
| cx.Princess 1.0 | 19 | 79% |
| mz.MicroSheep 1.0 | 14 | 86% |
| arthord.NanoSatanMelee Beta | 7 | 100% |
| sadoner.killer 0.2 | 3 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 49 | 59% | 128 |
| cx.Princess 1.0 | 14 | 17% | 27 |
| arthord.NanoSatanMelee Beta | 9 | 11% | 15 |
| mz.MicroSheep 1.0 | 7 | 8% | 26 |
| sadoner.killer 0.2 | 2 | 2% | 7 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 3 |
| kurios.DOSexe .9a | 1 | 1% | 2 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 133731 melee ticks, 53673 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 57 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 38071 sent, 33934 reached their opponent, 5881 virtual hits (17.3% of those reached).

