# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1843637. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 203 over 6 battles (33.8 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.1 | 42 / 210 | 2.25 | 17.7% | 33823 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.8% | 143 |
| hadur117.Hadur 3.21bb | 2.0 | 17.7% | 42 |
| sgp.JollyNinja 3.53 | 3.3 | 11.4% | 19 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.2 | 10.9% | 1 |
| mz.MicroGodMelee 1 | 4.8 | 10.1% | 5 |
| lorneswork.Predator 1.0 | 5.7 | 9.5% | 0 |
| adt.Ar2 1.0 | 7.0 | 7.2% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.7% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.3 | 84.4 | 7 / 35 | 5533 |
| 2 | 2 | 67.6 | 86.7 | 7 / 35 | 5521 |
| 3 | 2 | 67.8 | 85.4 | 8 / 35 | 5575 |
| 4 | 2 | 68.5 | 88.6 | 7 / 35 | 5838 |
| 5 | 2 | 68.5 | 87.6 | 8 / 35 | 5987 |
| 6 | 2 | 67.1 | 84.1 | 5 / 35 | 5369 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 134 | 12% |
| sgp.JollyNinja 3.53 | 12 | 42% |
| mz.MicroGodMelee 1 | 8 | 88% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 100% |
| lorneswork.Predator 1.0 | 5 | 100% |
| adt.Ar2 1.0 | 2 | 50% |
| skm.butterfly 1.0 | 1 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 169 of 210 rounds, at a mean tick of 1197. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 128 | 76% | 148 |
| sgp.JollyNinja 3.53 | 15 | 9% | 16 |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 5% | 15 |
| mz.MicroGodMelee 1 | 5 | 3% | 13 |
| lorneswork.Predator 1.0 | 5 | 3% | 10 |
| adt.Ar2 1.0 | 3 | 2% | 4 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 3 |
| skm.butterfly 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 137403 melee ticks, 93434 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 574 ticks; 4 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 236 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 2.

Targeting waves (199 rounds): 43261 sent, 38348 reached their opponent, 7408 virtual hits (19.3% of those reached).

## Melee bench: F02

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1844429. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 230 over 6 battles (38.3 per battle, most in one battle 51). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.6 | 101 / 210 | 2.21 | 19.1% | 32679 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 19.1% | 101 |
| pulsar.PulsarMax 0.8.9 | 2.0 | 14.5% | 55 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.0 | 13.7% | 29 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 11.0% | 0 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.5 | 10.6% | 12 |
| Noran.BitchingElk 0.054 | 6.8 | 7.4% | 7 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 7.6% | 1 |
| sch.Simone 0.3d | 7.2 | 7.0% | 5 |
| stelo.PatternRobot 1.0 | 9.2 | 5.2% | 0 |
| fullsail.SweetTea 1.1 | 9.8 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 91.7 | 24 / 35 | 5641 |
| 2 | 1 | 69.3 | 89.5 | 17 / 35 | 5478 |
| 3 | 1 | 67.3 | 81.3 | 13 / 35 | 5465 |
| 4 | 1 | 69.2 | 85.4 | 18 / 35 | 5323 |
| 5 | 1 | 67.7 | 84.1 | 11 / 35 | 5182 |
| 6 | 1 | 69.6 | 87.3 | 18 / 35 | 5590 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 48 | 44% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 41 | 76% |
| com.cohesiva.robocode.ManOwaR 1.0 | 26 | 73% |
| Noran.BitchingElk 0.054 | 15 | 53% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 100% |
| sch.Simone 0.3d | 6 | 83% |
| stelo.PatternRobot 1.0 | 4 | 100% |
| fnc.bandit.Bandit 5.2.0 | 1 | 0% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 1034. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 40 | 36% | 61 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 25 | 23% | 64 |
| com.cohesiva.robocode.ManOwaR 1.0 | 16 | 15% | 34 |
| Noran.BitchingElk 0.054 | 7 | 6% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 7 | 6% | 14 |
| sch.Simone 0.3d | 7 | 6% | 12 |
| fnc.bandit.Bandit 5.2.0 | 4 | 4% | 5 |
| stelo.PatternRobot 1.0 | 3 | 3% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 163502 melee ticks, 45765 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 65 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 56264 sent, 51473 reached their opponent, 8357 virtual hits (16.2% of those reached).

## Melee bench: F03

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1847994. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 178 over 6 battles (29.7 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 94.1 | 172 / 210 | 1.53 | 21.3% | 40021 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.3% | 172 |
| radnor.DoctorBob 1.42 | 2.5 | 13.6% | 14 |
| kawigi.nano.Lib 1.0 | 3.2 | 12.7% | 6 |
| vuen.Cake 2.51 | 3.3 | 12.5% | 15 |
| urdos.URDOS 1.3 | 5.2 | 8.8% | 1 |
| adt.Ar1 2.1 | 5.8 | 7.9% | 1 |
| oa.weak.FlyMk1 0.1 | 7.3 | 6.8% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 8.2 | 5.9% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.3% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 97.5 | 32 / 35 | 6843 |
| 2 | 1 | 71.6 | 92.7 | 25 / 35 | 6855 |
| 3 | 1 | 69.3 | 87.6 | 25 / 35 | 5899 |
| 4 | 1 | 70.7 | 91.1 | 27 / 35 | 6531 |
| 5 | 1 | 72.5 | 97.1 | 31 / 35 | 6714 |
| 6 | 1 | 73.0 | 98.7 | 32 / 35 | 7179 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 74 | 89% |
| radnor.DoctorBob 1.42 | 56 | 98% |
| kawigi.nano.Lib 1.0 | 40 | 98% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| adt.Ar1 2.1 | 3 | 67% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| urdos.URDOS 1.3 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 0% |

Hadur died in 38 of 210 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 11 | 29% | 66 |
| vuen.Cake 2.51 | 10 | 26% | 79 |
| kawigi.nano.Lib 1.0 | 5 | 13% | 36 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 13% | 5 |
| urdos.URDOS 1.3 | 4 | 11% | 7 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 3% | 4 |
| adt.Ar1 2.1 | 1 | 3% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 3% | 1 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 9 |

Posture (Hadur's M records, 198 rounds): 123012 melee ticks, 45018 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 55 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 36806 sent, 31906 reached their opponent, 7736 virtual hits (24.2% of those reached).

## Melee bench: F04

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1843642. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 127 over 6 battles (21.2 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 86.9 | 37 / 210 | 2.18 | 18.3% | 36175 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 21.9% | 155 |
| hadur117.Hadur 3.21bb | 2.0 | 18.3% | 37 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.4% | 11 |
| TNT.TNT 0.99.1 | 4.2 | 10.9% | 7 |
| josago.Jorgito 0.16 | 5.0 | 9.1% | 1 |
| css.Delitioner 0.11 | 6.0 | 7.5% | 0 |
| tj.zombie1n 1.0.1 | 7.0 | 6.4% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.3% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 3.5% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 70.1 | 90.2 | 8 / 35 | 6187 |
| 2 | 2 | 69.4 | 89.2 | 8 / 35 | 5785 |
| 3 | 2 | 69.3 | 87.0 | 4 / 35 | 6121 |
| 4 | 2 | 69.6 | 86.7 | 7 / 35 | 6323 |
| 5 | 2 | 68.9 | 85.7 | 6 / 35 | 6054 |
| 6 | 2 | 67.7 | 82.9 | 4 / 35 | 5705 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 137 | 12% |
| apc.LeeroyJenkins2 1.0 | 15 | 87% |
| TNT.TNT 0.99.1 | 9 | 33% |
| josago.Jorgito 0.16 | 2 | 100% |
| spin.Bugstard 0.012b | 1 | 100% |
| css.Delitioner 0.11 | 1 | 100% |

Hadur died in 174 of 210 rounds, at a mean tick of 1291. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 137 | 79% | 155 |
| apc.LeeroyJenkins2 1.0 | 19 | 11% | 32 |
| TNT.TNT 0.99.1 | 11 | 6% | 14 |
| josago.Jorgito 0.16 | 3 | 2% | 4 |
| css.Delitioner 0.11 | 2 | 1% | 3 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |
| rampancy.Durandal 2.1d | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 188590 melee ticks, 71014 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 59 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 56406 sent, 51609 reached their opponent, 7381 virtual hits (14.3% of those reached).

## Melee bench: F05

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1819236. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 127 over 6 battles (21.2 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 78.9 | 35 / 210 | 2.90 | 15.7% | 26221 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.5 | 17.3% | 95 |
| justin.DemonicRage 3.4 | 1.7 | 17.3% | 67 |
| hadur117.Hadur 3.21bb | 2.8 | 15.7% | 35 |
| wompi.Numbat 2.1 | 4.0 | 12.8% | 7 |
| axeBots.HataMoto 3.09 | 5.3 | 8.7% | 5 |
| ms.Ares 0.19 | 5.7 | 8.7% | 1 |
| supersample.SuperBoxBot 1.0 | 7.2 | 5.9% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.5% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.1% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.4 | 76.8 | 5 / 35 | 4106 |
| 2 | 2 | 66.0 | 82.2 | 6 / 35 | 4571 |
| 3 | 3 | 65.3 | 81.0 | 6 / 35 | 4420 |
| 4 | 3 | 65.8 | 79.4 | 7 / 35 | 4560 |
| 5 | 3 | 65.2 | 80.0 | 4 / 35 | 4347 |
| 6 | 3 | 63.6 | 74.0 | 7 / 35 | 4217 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 51 | 25% |
| cb.fire.Firestarter 2.0f | 29 | 7% |
| wompi.Numbat 2.1 | 18 | 100% |
| axeBots.HataMoto 3.09 | 2 | 50% |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 100% |
| ms.Ares 0.19 | 1 | 0% |

Hadur died in 175 of 210 rounds, at a mean tick of 925. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 69 | 39% | 82 |
| cb.fire.Firestarter 2.0f | 54 | 31% | 56 |
| wompi.Numbat 2.1 | 26 | 15% | 44 |
| ms.Ares 0.19 | 12 | 7% | 11 |
| axeBots.HataMoto 3.09 | 11 | 6% | 13 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 3 |
| supersample.SuperBoxBot 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 202 rounds): 153454 melee ticks, 36470 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 79 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 45883 sent, 40746 reached their opponent, 6491 virtual hits (15.9% of those reached).

## Melee bench: F06

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1824999. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 225 over 6 battles (37.5 per battle, most in one battle 51). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 91.4 | 141 / 210 | 1.78 | 20.5% | 34557 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.5% | 141 |
| jekl.StoneGhost 0.7 | 2.0 | 14.5% | 26 |
| origin.SleepSiphon 1.7b | 3.2 | 13.0% | 26 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 11.9% | 11 |
| mld.Wisdom 1.0 | 4.8 | 11.1% | 2 |
| gg.Wolverine 2.0 | 6.3 | 8.0% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 7.0% | 2 |
| spinnercat.Omen 1.0 | 8.3 | 6.1% | 0 |
| DBall.NUKE 0.1 | 8.5 | 5.4% | 0 |
| sample.Fire 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 89.5 | 24 / 35 | 5987 |
| 2 | 1 | 71.2 | 92.4 | 23 / 35 | 5870 |
| 3 | 1 | 70.2 | 89.5 | 21 / 35 | 5468 |
| 4 | 1 | 71.6 | 94.6 | 23 / 35 | 5965 |
| 5 | 1 | 71.4 | 90.8 | 26 / 35 | 5737 |
| 6 | 1 | 70.9 | 91.4 | 24 / 35 | 5530 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 64 | 84% |
| origin.SleepSiphon 1.7b | 41 | 83% |
| pe.minimelee.SandboxMiniMelee 1.1 | 34 | 88% |
| gg.Wolverine 2.0 | 10 | 100% |
| mld.Wisdom 1.0 | 7 | 71% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 71% |
| DBall.NUKE 0.1 | 2 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 26 | 38% | 62 |
| jekl.StoneGhost 0.7 | 23 | 33% | 58 |
| mld.Wisdom 1.0 | 7 | 10% | 13 |
| pe.minimelee.SandboxMiniMelee 1.1 | 6 | 9% | 41 |
| gg.Wolverine 2.0 | 4 | 6% | 13 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 4% | 17 |
| spinnercat.Omen 1.0 | 0 | 0% | 3 |
| DBall.NUKE 0.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 144119 melee ticks, 39881 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 26 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 2.

Targeting waves (199 rounds): 43194 sent, 38400 reached their opponent, 7901 virtual hits (20.6% of those reached).

## Melee bench: F07

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1833207. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 107 over 6 battles (17.8 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 75.8 | 96.8 | 163 / 210 | 1.25 | 26.5% | 48684 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 26.5% | 163 |
| rtk.Tachikoma 1.0 | 2.0 | 18.5% | 28 |
| franzor.Lizt 1.3.1 | 3.5 | 12.7% | 14 |
| oog.melee.CapuletDroid 1.1 | 3.5 | 12.4% | 6 |
| lrem.micro.MoggFanatic 0.2 | 5.0 | 10.6% | 0 |
| exauge.GateKeeper 1.1.121g | 6.0 | 8.1% | 0 |
| skm.PateranBotlock2 1.0 | 7.0 | 6.3% | 0 |
| sample.Target 1.0 | 8.2 | 2.7% | 0 |
| drd.Dreadknoght 0.9 | 8.8 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 75.4 | 97.1 | 27 / 35 | 7729 |
| 2 | 1 | 75.3 | 96.4 | 27 / 35 | 7569 |
| 3 | 1 | 76.1 | 97.1 | 27 / 35 | 8435 |
| 4 | 1 | 76.1 | 96.1 | 27 / 35 | 8239 |
| 5 | 1 | 75.6 | 96.8 | 26 / 35 | 8255 |
| 6 | 1 | 76.4 | 97.5 | 29 / 35 | 8457 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 111 | 77% |
| oog.melee.CapuletDroid 1.1 | 48 | 92% |
| franzor.Lizt 1.3.1 | 41 | 71% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |
| skm.PateranBotlock2 1.0 | 1 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 1776. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 29 | 62% | 128 |
| franzor.Lizt 1.3.1 | 14 | 30% | 4 |
| oog.melee.CapuletDroid 1.1 | 4 | 9% | 59 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 7 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 6 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 189242 melee ticks, 102051 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 34 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 51207 sent, 47050 reached their opponent, 9323 virtual hits (19.8% of those reached).

## Melee bench: F08

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1828731. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 317 over 6 battles (52.8 per battle, most in one battle 58). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 93.0 | 156 / 210 | 1.56 | 23.1% | 32971 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 23.1% | 156 |
| tm.Yuugao 1.0 | 2.0 | 15.5% | 28 |
| shrub.Vapour v159 | 3.0 | 14.1% | 18 |
| com.spp.robocode.MostlyHarmless 010 | 4.3 | 11.0% | 7 |
| m3thos.Eva00 1.1 | 4.8 | 9.9% | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 5.8 | 9.2% | 1 |
| qualidafial.MajorDick 1.0.1 | 7.0 | 7.2% | 0 |
| zyx.nano.BacillusComma 1.0 | 8.5 | 5.0% | 0 |
| SHAM.WOW 1.4 | 8.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 93.9 | 27 / 35 | 5441 |
| 2 | 1 | 70.9 | 90.0 | 24 / 35 | 5511 |
| 3 | 1 | 72.9 | 97.5 | 29 / 35 | 5624 |
| 4 | 1 | 71.8 | 95.0 | 27 / 35 | 5400 |
| 5 | 1 | 69.4 | 86.8 | 23 / 35 | 5032 |
| 6 | 1 | 72.3 | 94.6 | 26 / 35 | 5963 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 78 | 78% |
| shrub.Vapour v159 | 51 | 84% |
| com.spp.robocode.MostlyHarmless 010 | 24 | 92% |
| m3thos.Eva00 1.1 | 14 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 11 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 947. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 19 | 35% | 78 |
| shrub.Vapour v159 | 16 | 29% | 54 |
| com.spp.robocode.MostlyHarmless 010 | 14 | 25% | 33 |
| jwst.DAD.DarkAndDarker 1.1 | 3 | 5% | 18 |
| m3thos.Eva00 1.1 | 2 | 4% | 16 |
| qualidafial.MajorDick 1.0.1 | 1 | 2% | 1 |
| SHAM.WOW 1.4 | 0 | 0% | 4 |
| zyx.nano.BacillusComma 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 198 rounds): 140200 melee ticks, 52478 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 56 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 2.

Targeting waves (198 rounds): 42247 sent, 37914 reached their opponent, 6551 virtual hits (17.3% of those reached).

## Melee bench: F09

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1828616. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 203 over 6 battles (33.8 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 79.3 | 68 / 210 | 2.87 | 16.2% | 23751 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 16.8% | 90 |
| hadur117.Hadur 3.21bb | 1.8 | 16.2% | 68 |
| kc.micro.Figment 1.0 | 3.0 | 14.3% | 23 |
| yagami.Tidus 0.11 | 4.7 | 10.6% | 5 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.3% | 9 |
| mc2.enemy.Original 0.9 | 5.5 | 9.8% | 14 |
| dft.Calliope 5.6 | 7.0 | 7.4% | 1 |
| step.nanoPri 1.0 | 8.2 | 5.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 4.7% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 78.1 | 9 / 35 | 3894 |
| 2 | 2 | 66.1 | 81.6 | 14 / 35 | 4038 |
| 3 | 2 | 64.6 | 77.8 | 10 / 35 | 3771 |
| 4 | 2 | 64.9 | 77.8 | 10 / 35 | 4152 |
| 5 | 2 | 63.5 | 74.9 | 11 / 35 | 3617 |
| 6 | 1 | 67.4 | 85.4 | 14 / 35 | 4279 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 48 | 25% |
| kc.micro.Figment 1.0 | 45 | 84% |
| yagami.Tidus 0.11 | 9 | 100% |
| mc2.enemy.Original 0.9 | 7 | 29% |
| dft.Calliope 5.6 | 6 | 83% |
| pedersen.Grishnakh 1.0 | 3 | 67% |

Hadur died in 142 of 210 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 65 | 46% | 82 |
| kc.micro.Figment 1.0 | 22 | 15% | 58 |
| mc2.enemy.Original 0.9 | 19 | 13% | 21 |
| yagami.Tidus 0.11 | 17 | 12% | 23 |
| pedersen.Grishnakh 1.0 | 9 | 6% | 12 |
| robar.nano.Assertive_Melee 0.2 | 6 | 4% | 6 |
| step.nanoPri 1.0 | 3 | 2% | 3 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |
| dft.Calliope 5.6 | 0 | 0% | 4 |

Posture (Hadur's M records, 201 rounds): 143074 melee ticks, 37222 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 40 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 46181 sent, 41463 reached their opponent, 5738 virtual hits (13.8% of those reached).

## Melee bench: F10

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1821341. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 271 over 6 battles (45.2 per battle, most in one battle 57). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 95.8 | 175 / 210 | 1.38 | 21.5% | 37361 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.5% | 175 |
| DTF.Kludgy 1.2b | 2.3 | 14.2% | 21 |
| ne.Chimera 1.2 | 3.2 | 13.1% | 3 |
| ejb.Polaris 1.0.1 | 3.7 | 12.0% | 4 |
| vStar.RAFzilla 2.15 | 5.0 | 10.1% | 4 |
| tvv.micro.Antares 1.1.1 | 5.8 | 9.3% | 2 |
| kurios.DOSexe .9b | 7.7 | 5.5% | 2 |
| sam.Samspin 1.0 | 8.0 | 5.4% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 4.9% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 97.5 | 32 / 35 | 5877 |
| 2 | 1 | 72.5 | 95.2 | 29 / 35 | 6429 |
| 3 | 1 | 72.9 | 97.5 | 31 / 35 | 6680 |
| 4 | 1 | 71.7 | 95.2 | 28 / 35 | 6106 |
| 5 | 1 | 72.0 | 95.9 | 28 / 35 | 6288 |
| 6 | 1 | 71.5 | 93.7 | 27 / 35 | 5981 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 64 | 89% |
| ejb.Polaris 1.0.1 | 46 | 98% |
| ne.Chimera 1.2 | 34 | 97% |
| vStar.RAFzilla 2.15 | 20 | 95% |
| tvv.micro.Antares 1.1.1 | 13 | 100% |
| kurios.DOSexe .9b | 6 | 83% |
| sam.Samspin 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 36 of 210 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 17 | 47% | 67 |
| ne.Chimera 1.2 | 8 | 22% | 43 |
| kurios.DOSexe .9b | 3 | 8% | 15 |
| tvv.micro.Antares 1.1.1 | 3 | 8% | 11 |
| ejb.Polaris 1.0.1 | 2 | 6% | 44 |
| vStar.RAFzilla 2.15 | 2 | 6% | 18 |
| sam.Samspin 1.0 | 0 | 0% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 1 |
| donjezza.Muncho 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 136404 melee ticks, 55116 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 54 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 44451 sent, 39572 reached their opponent, 7009 virtual hits (17.7% of those reached).

## Melee bench: F11

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1862907. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 199 over 6 battles (33.2 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 81.6 | 76 / 210 | 2.66 | 16.7% | 25031 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.5 | 16.7% | 76 |
| rz.Aleph 0.34 | 1.5 | 16.3% | 66 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.9% | 22 |
| djc.DynaBot 0.1.1 | 4.0 | 10.9% | 15 |
| rdt199.Warlord 0.73 | 5.5 | 9.0% | 12 |
| br2.MobyDickBot 1.6 | 5.7 | 8.7% | 9 |
| uji.YellohFellah 1.0 | 7.3 | 7.7% | 9 |
| KiraNL.Chupacabra 0.4 | 7.5 | 7.3% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.6% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 82.5 | 15 / 35 | 3957 |
| 2 | 2 | 64.3 | 78.7 | 10 / 35 | 4061 |
| 3 | 1 | 66.0 | 83.2 | 16 / 35 | 4103 |
| 4 | 1 | 67.6 | 87.9 | 14 / 35 | 4612 |
| 5 | 2 | 63.8 | 78.1 | 9 / 35 | 4051 |
| 6 | 2 | 65.3 | 79.0 | 12 / 35 | 4247 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 56 | 57% |
| djc.DynaBot 0.1.1 | 19 | 58% |
| cx.mini.Nimrod 0.55 | 18 | 61% |
| rdt199.Warlord 0.73 | 13 | 69% |
| br2.MobyDickBot 1.6 | 13 | 54% |
| uji.YellohFellah 1.0 | 9 | 67% |

Hadur died in 136 of 210 rounds, at a mean tick of 877. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 46 | 34% | 79 |
| cx.mini.Nimrod 0.55 | 28 | 21% | 35 |
| djc.DynaBot 0.1.1 | 16 | 12% | 25 |
| rdt199.Warlord 0.73 | 13 | 10% | 27 |
| br2.MobyDickBot 1.6 | 9 | 7% | 16 |
| uji.YellohFellah 1.0 | 8 | 6% | 11 |
| KiraNL.Chupacabra 0.4 | 8 | 6% | 9 |
| stelo.MirrorNano 1.3 | 4 | 3% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 2% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 147976 melee ticks, 39166 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 44 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 44 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 47954 sent, 43027 reached their opponent, 5611 virtual hits (13.0% of those reached).

## Melee bench: F12

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1772820. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 196 over 6 battles (32.7 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 88.1 | 129 / 210 | 2.07 | 18.8% | 26348 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 18.8% | 129 |
| nat.PallasHawk 1.0 | 2.5 | 13.7% | 38 |
| bts.wiki.RipCurl 0.9b | 2.7 | 13.2% | 24 |
| darkcanuck.Leon 1.01 | 3.8 | 12.0% | 14 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.2% | 5 |
| jrm.Test0 1.0 | 6.0 | 8.7% | 0 |
| cs.sheldor.Talon 1.1 | 7.2 | 6.8% | 0 |
| jp.Perpy 16.0 | 8.2 | 6.1% | 0 |
| stuff.Vlad 0.1 | 9.0 | 5.8% | 0 |
| jaybot.bots.Oddball 4.0 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 92.7 | 24 / 35 | 4465 |
| 2 | 1 | 68.1 | 87.0 | 21 / 35 | 4503 |
| 3 | 1 | 68.7 | 87.3 | 24 / 35 | 4288 |
| 4 | 1 | 67.9 | 86.7 | 21 / 35 | 4314 |
| 5 | 1 | 67.1 | 84.8 | 18 / 35 | 4193 |
| 6 | 1 | 69.3 | 90.2 | 21 / 35 | 4585 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 55 | 60% |
| bts.wiki.RipCurl 0.9b | 49 | 82% |
| darkcanuck.Leon 1.01 | 37 | 84% |
| brainfade.melee.Genghis 0.36 | 12 | 100% |
| jrm.Test0 1.0 | 5 | 100% |
| jaybot.bots.Oddball 4.0 | 4 | 100% |
| jp.Perpy 16.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 27 | 33% | 58 |
| bts.wiki.RipCurl 0.9b | 19 | 23% | 46 |
| darkcanuck.Leon 1.01 | 14 | 17% | 54 |
| brainfade.melee.Genghis 0.36 | 7 | 8% | 19 |
| jrm.Test0 1.0 | 5 | 6% | 11 |
| cs.sheldor.Talon 1.1 | 5 | 6% | 6 |
| jp.Perpy 16.0 | 3 | 4% | 8 |
| stuff.Vlad 0.1 | 2 | 2% | 3 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 5 |

Posture (Hadur's M records, 199 rounds): 125659 melee ticks, 38511 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 36 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 36 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 42848 sent, 37844 reached their opponent, 5963 virtual hits (15.8% of those reached).

## Melee bench: F13

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1848293. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 167 over 6 battles (27.8 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 82.3 | 57 / 210 | 2.59 | 16.1% | 25453 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.8 | 16.1% | 39 |
| mn.Combat 3.25.0 | 1.8 | 16.4% | 85 |
| hadur117.Hadur 3.21bb | 2.3 | 16.1% | 57 |
| shinh.Entangled 0.3 | 4.5 | 11.8% | 23 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.7% | 5 |
| apc.Colossus2 0.17 | 6.0 | 8.2% | 1 |
| stelo.Wang 1.0 | 7.2 | 7.1% | 0 |
| ayk.WallHugger 1.0 | 8.3 | 4.7% | 0 |
| maribo.FollowFire 1 | 8.5 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 82.2 | 9 / 35 | 4247 |
| 2 | 3 | 65.2 | 80.6 | 8 / 35 | 4183 |
| 3 | 1 | 67.5 | 85.7 | 15 / 35 | 4701 |
| 4 | 3 | 64.8 | 81.9 | 7 / 35 | 4123 |
| 5 | 3 | 64.2 | 79.7 | 9 / 35 | 3923 |
| 6 | 2 | 65.9 | 83.8 | 9 / 35 | 4276 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 52 | 17% |
| ags.Glacier 0.2.11 | 48 | 65% |
| shinh.Entangled 0.3 | 19 | 37% |
| gh.micro.Gruweltje 0.7 | 10 | 100% |
| apc.Colossus2 0.17 | 1 | 0% |

Hadur died in 153 of 210 rounds, at a mean tick of 909. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 59 | 39% | 71 |
| ags.Glacier 0.2.11 | 41 | 27% | 71 |
| shinh.Entangled 0.3 | 28 | 18% | 35 |
| gh.micro.Gruweltje 0.7 | 14 | 9% | 20 |
| maribo.FollowFire 1 | 4 | 3% | 4 |
| apc.Colossus2 0.17 | 3 | 2% | 3 |
| stelo.Wang 1.0 | 2 | 1% | 2 |
| ayk.WallHugger 1.0 | 2 | 1% | 2 |

Posture (Hadur's M records, 198 rounds): 143897 melee ticks, 43579 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 56 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 41569 sent, 36326 reached their opponent, 5495 virtual hits (15.1% of those reached).

## Melee bench: F14

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1846960. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 194 over 6 battles (32.3 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.5 | 97.1 | 190 / 210 | 1.23 | 24.7% | 39171 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 24.7% | 190 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 17.0% | 15 |
| Lo_Ian.Gandalf_V4 4.0 | 3.8 | 11.0% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 3.8 | 10.9% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 4.8 | 9.9% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.2 | 9.0% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.3 | 9.1% | 0 |
| pa.Improved 1.0 | 8.0 | 6.6% | 0 |
| sample.TrackFire 1.0 | 9.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.9 | 98.9 | 33 / 35 | 6562 |
| 2 | 1 | 72.8 | 96.8 | 29 / 35 | 6220 |
| 3 | 1 | 74.0 | 96.1 | 33 / 35 | 6606 |
| 4 | 1 | 73.1 | 96.4 | 31 / 35 | 6553 |
| 5 | 1 | 73.3 | 96.8 | 33 / 35 | 6470 |
| 6 | 1 | 73.9 | 97.5 | 31 / 35 | 6760 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 117 | 95% |
| sanyi.mikrobi.Roberto 1.0 | 26 | 92% |
| sheldor.micro.PointInLineRRAL 1.0 | 20 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 13 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 13 | 92% |
| pa.Improved 1.0 | 5 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |

Hadur died in 21 of 210 rounds, at a mean tick of 738. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 11 | 52% | 109 |
| sanyi.mikrobi.Roberto 1.0 | 4 | 19% | 35 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 14% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 1 | 5% | 25 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 5% | 8 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 10 |
| pa.Improved 1.0 | 0 | 0% | 6 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 121141 melee ticks, 51185 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 65 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 35342 sent, 31127 reached their opponent, 7682 virtual hits (24.7% of those reached).

## Melee bench: F15

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1611230. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 252 over 6 battles (42.0 per battle, most in one battle 51). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 87.5 | 120 / 210 | 2.12 | 19.4% | 32779 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 19.4% | 120 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.3% | 18 |
| emp.Yngwie 1.11 | 3.2 | 13.1% | 44 |
| mld.DustBunny 3.8 | 4.0 | 12.2% | 8 |
| cb.nano.Insomnia 1.0 | 4.3 | 10.7% | 4 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.5% | 16 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.8% | 0 |
| lambdaxy.TBot 0.1 | 7.5 | 6.9% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.3 | 4.2% | 0 |
| divineomega.TrialBot 0.003 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 92.4 | 21 / 35 | 6108 |
| 2 | 1 | 68.7 | 86.0 | 18 / 35 | 5197 |
| 3 | 1 | 69.6 | 87.6 | 20 / 35 | 5450 |
| 4 | 1 | 69.2 | 86.3 | 21 / 35 | 5250 |
| 5 | 1 | 69.5 | 87.3 | 22 / 35 | 5554 |
| 6 | 1 | 68.6 | 85.4 | 18 / 35 | 5220 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 53 | 51% |
| kawigi.micro.Shiz 1.1 | 38 | 95% |
| mld.DustBunny 3.8 | 27 | 96% |
| kawigi.robot.Girl 1.2 | 18 | 61% |
| cb.nano.Insomnia 1.0 | 14 | 86% |
| divineomega.TrialBot 0.003 | 3 | 100% |
| Grystrion.TrackerWO 1.0 | 3 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 948. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 37 | 41% | 83 |
| cb.nano.Insomnia 1.0 | 18 | 20% | 23 |
| mld.DustBunny 3.8 | 11 | 12% | 36 |
| kawigi.micro.Shiz 1.1 | 9 | 10% | 41 |
| kawigi.robot.Girl 1.2 | 9 | 10% | 13 |
| divineomega.TrialBot 0.003 | 3 | 3% | 7 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 5 |
| lambdaxy.TBot 0.1 | 1 | 1% | 1 |

Posture (Hadur's M records, 199 rounds): 151965 melee ticks, 50327 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 61 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 61 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 50135 sent, 45191 reached their opponent, 7068 virtual hits (15.6% of those reached).

## Melee bench: F16

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1668709. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 179 over 6 battles (29.8 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 93.3 | 133 / 210 | 1.60 | 21.1% | 37291 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.1% | 133 |
| gh.Griezel 0.5.2 | 2.0 | 16.2% | 52 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.9% | 6 |
| techdude.forest.FlamingForest 1.1 | 4.5 | 9.9% | 16 |
| bvh.fnr.Fenrir 0.36l | 4.8 | 9.2% | 3 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.7% | 1 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.0% | 0 |
| asd.Cthulhu 1.3 | 8.7 | 4.9% | 0 |
| repositorio.NanoStep 1.0 | 8.8 | 4.7% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 94.9 | 22 / 35 | 6279 |
| 2 | 1 | 71.7 | 92.1 | 21 / 35 | 6222 |
| 3 | 1 | 71.5 | 91.4 | 21 / 35 | 6148 |
| 4 | 1 | 72.4 | 95.9 | 25 / 35 | 6126 |
| 5 | 1 | 72.0 | 93.3 | 26 / 35 | 6187 |
| 6 | 1 | 71.4 | 92.1 | 18 / 35 | 6329 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 102 | 64% |
| techdude.forest.FlamingForest 1.1 | 39 | 72% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 22 | 95% |
| bvh.fnr.Fenrir 0.36l | 12 | 83% |
| tvv.nano.Polaris 1.2 | 5 | 80% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |
| stelo.IntrinsicVolatility 1.4 | 2 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 1277. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 44 | 56% | 108 |
| techdude.forest.FlamingForest 1.1 | 13 | 17% | 40 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 7 | 9% | 22 |
| bvh.fnr.Fenrir 0.36l | 4 | 5% | 15 |
| asd.Cthulhu 1.3 | 4 | 5% | 5 |
| stelo.IntrinsicVolatility 1.4 | 3 | 4% | 9 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 5 |
| tvv.nano.Polaris 1.2 | 1 | 1% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 175308 melee ticks, 73808 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 41 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 54777 sent, 49994 reached their opponent, 8018 virtual hits (16.0% of those reached).

## Melee bench: F17

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1646407. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 206 over 6 battles (34.3 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 87.6 | 116 / 210 | 2.11 | 20.0% | 37432 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.0% | 116 |
| et.Predator 1.8 | 2.3 | 13.8% | 23 |
| oog.melee.Mercutio 1.0 | 3.3 | 13.0% | 26 |
| cx.BlestPain 1.41 | 3.5 | 11.9% | 32 |
| ahf.NanoAndrew .4 | 5.0 | 10.3% | 9 |
| maribo.melee.BMV 0.1 | 6.2 | 8.7% | 0 |
| nic.Nicator 2.4 | 6.7 | 8.4% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 8.0 | 6.1% | 1 |
| tex.Longbot 0.4 | 9.0 | 5.1% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 88.3 | 18 / 35 | 6204 |
| 2 | 1 | 70.9 | 89.2 | 21 / 35 | 6445 |
| 3 | 1 | 68.2 | 81.0 | 17 / 35 | 5735 |
| 4 | 1 | 71.0 | 90.2 | 20 / 35 | 6283 |
| 5 | 1 | 70.0 | 86.0 | 17 / 35 | 6345 |
| 6 | 1 | 71.5 | 91.1 | 23 / 35 | 6420 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 57 | 72% |
| et.Predator 1.8 | 54 | 72% |
| cx.BlestPain 1.41 | 28 | 50% |
| ahf.NanoAndrew .4 | 13 | 92% |
| nic.Nicator 2.4 | 5 | 80% |
| maribo.melee.BMV 0.1 | 5 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 1074. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 28 | 29% | 67 |
| cx.BlestPain 1.41 | 22 | 23% | 39 |
| oog.melee.Mercutio 1.0 | 21 | 22% | 57 |
| ahf.NanoAndrew .4 | 12 | 13% | 20 |
| maribo.melee.BMV 0.1 | 6 | 6% | 9 |
| nic.Nicator 2.4 | 5 | 5% | 13 |
| tex.Longbot 0.4 | 1 | 1% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 3 |

Posture (Hadur's M records, 199 rounds): 159857 melee ticks, 60542 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 32 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 51099 sent, 46289 reached their opponent, 9303 virtual hits (20.1% of those reached).

## Melee bench: F18

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1747357. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 303 over 6 battles (50.5 per battle, most in one battle 55). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 90.9 | 148 / 210 | 1.73 | 22.2% | 30233 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 22.2% | 148 |
| agd.Mooserwirt2 2.7 | 2.0 | 14.6% | 27 |
| uji.DBH 1.1 | 3.2 | 12.9% | 13 |
| sigterm.Sigterm 1.0 | 4.7 | 10.4% | 11 |
| spinnercat.Robovirus 2.718 | 5.2 | 9.8% | 5 |
| kawigi.mini.Fhqwhgads 1.1 | 6.0 | 8.7% | 1 |
| ratosh.Nobo 0.21 | 6.2 | 9.4% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.3 | 6.3% | 0 |
| stelo.WangRobot 1.0 | 8.5 | 5.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 86.4 | 21 / 35 | 4995 |
| 2 | 1 | 70.2 | 92.9 | 26 / 35 | 4843 |
| 3 | 1 | 70.2 | 92.9 | 26 / 35 | 4795 |
| 4 | 1 | 69.5 | 88.9 | 22 / 35 | 5171 |
| 5 | 1 | 70.8 | 90.4 | 26 / 35 | 5251 |
| 6 | 1 | 71.3 | 93.9 | 27 / 35 | 5178 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agd.Mooserwirt2 2.7 | 51 | 86% |
| uji.DBH 1.1 | 40 | 88% |
| sigterm.Sigterm 1.0 | 34 | 82% |
| spinnercat.Robovirus 2.718 | 17 | 88% |
| ratosh.Nobo 0.21 | 11 | 82% |
| kawigi.mini.Fhqwhgads 1.1 | 9 | 100% |
| stelo.WangRobot 1.0 | 9 | 78% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 754. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sigterm.Sigterm 1.0 | 15 | 24% | 29 |
| agd.Mooserwirt2 2.7 | 13 | 21% | 61 |
| uji.DBH 1.1 | 11 | 18% | 37 |
| ratosh.Nobo 0.21 | 10 | 16% | 20 |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 13% | 25 |
| spinnercat.Robovirus 2.718 | 2 | 3% | 17 |
| stelo.WangRobot 1.0 | 2 | 3% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 2% | 11 |

Posture (Hadur's M records, 198 rounds): 124945 melee ticks, 44358 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 68 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 68 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 38517 sent, 34222 reached their opponent, 7408 virtual hits (21.6% of those reached).

## Melee bench: F19

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1662875. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 209 over 6 battles (34.8 per battle, most in one battle 45). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.1 | 98.7 | 202 / 210 | 1.11 | 23.0% | 39214 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 23.0% | 202 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.8% | 5 |
| mld.Infinity 2.2 | 3.2 | 11.8% | 1 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.0% | 1 |
| erdnis.Rover 0.3 | 4.7 | 10.6% | 1 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.2% | 0 |
| mbh.Mbh 0.1 | 6.8 | 7.6% | 0 |
| pac.ABC 2.1 | 8.2 | 6.2% | 0 |
| pbg.R2D2 1.0 | 8.7 | 5.4% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.0 | 98.7 | 34 / 35 | 6498 |
| 2 | 1 | 74.5 | 100.0 | 35 / 35 | 6597 |
| 3 | 1 | 74.3 | 99.7 | 34 / 35 | 6714 |
| 4 | 1 | 74.0 | 99.0 | 33 / 35 | 6383 |
| 5 | 1 | 73.5 | 95.9 | 32 / 35 | 6538 |
| 6 | 1 | 73.9 | 99.0 | 34 / 35 | 6484 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 119 | 98% |
| krillr.mini.JointStrike 2.0.0 | 27 | 100% |
| mld.Infinity 2.2 | 26 | 100% |
| erdnis.Rover 0.3 | 19 | 95% |
| pac.ABC 2.1 | 8 | 100% |
| patson.PatsonTestBot 1.0 | 4 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 8 of 210 rounds, at a mean tick of 615. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 3 | 38% | 76 |
| krillr.mini.JointStrike 2.0.0 | 2 | 25% | 30 |
| erdnis.Rover 0.3 | 2 | 25% | 30 |
| mbh.Mbh 0.1 | 1 | 13% | 10 |
| mld.Infinity 2.2 | 0 | 0% | 28 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 19 |
| pbg.R2D2 1.0 | 0 | 0% | 7 |
| pac.ABC 2.1 | 0 | 0% | 4 |

Posture (Hadur's M records, 199 rounds): 123894 melee ticks, 43718 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 27 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 27 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 2.

Targeting waves (199 rounds): 41178 sent, 36310 reached their opponent, 7923 virtual hits (21.8% of those reached).

## Melee bench: F20

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1688600. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 152 over 6 battles (25.3 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 93.0 | 143 / 210 | 1.63 | 21.6% | 39549 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.6% | 143 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.2% | 31 |
| fwb.Nine 1.0.1 | 3.2 | 11.7% | 11 |
| nz.jdc.nano.GridFu 1.0 | 4.5 | 10.2% | 2 |
| catcat20.Rabbit 0.001 | 4.5 | 10.7% | 16 |
| m3thos.mini.Eva01 0.5.5 | 5.8 | 9.1% | 4 |
| bayen.nut.Squirrel 1.615 | 7.2 | 6.6% | 3 |
| ntc.ControlledChaos 1.1.4 | 8.3 | 5.5% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.5 | 5.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 93.7 | 25 / 35 | 7013 |
| 2 | 1 | 73.3 | 95.9 | 28 / 35 | 6792 |
| 3 | 1 | 70.5 | 88.6 | 19 / 35 | 6330 |
| 4 | 1 | 71.6 | 91.7 | 23 / 35 | 6364 |
| 5 | 1 | 73.0 | 96.5 | 28 / 35 | 6469 |
| 6 | 1 | 71.7 | 91.4 | 20 / 35 | 6581 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 85 | 73% |
| fwb.Nine 1.0.1 | 43 | 91% |
| catcat20.Rabbit 0.001 | 28 | 71% |
| nz.jdc.nano.GridFu 1.0 | 13 | 100% |
| m3thos.mini.Eva01 0.5.5 | 5 | 80% |
| bayen.nut.Squirrel 1.615 | 4 | 50% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 1073. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 36 | 53% | 102 |
| catcat20.Rabbit 0.001 | 16 | 24% | 50 |
| fwb.Nine 1.0.1 | 9 | 13% | 15 |
| nz.jdc.nano.GridFu 1.0 | 3 | 4% | 20 |
| bayen.nut.Squirrel 1.615 | 3 | 4% | 8 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 11 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 1 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 160122 melee ticks, 62796 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 32 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 49564 sent, 44828 reached their opponent, 9323 virtual hits (20.8% of those reached).

## Melee bench: F21

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1706688. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 116 over 6 battles (19.3 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 91.0 | 131 / 210 | 1.81 | 20.7% | 36705 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.7% | 131 |
| eem.EvBot v4.6.16 | 2.0 | 16.2% | 56 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.3% | 13 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.6% | 2 |
| eld.Hmm 1.0 | 5.3 | 8.4% | 6 |
| oa.weak.BotherBot 0.1 | 6.2 | 7.6% | 1 |
| fire219.CatBot 1.0 | 7.7 | 5.9% | 0 |
| el.JumpShoot 0.2 | 8.2 | 5.6% | 1 |
| PSW.Relentless 0.1 | 8.3 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 9.3 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 88.6 | 21 / 35 | 6648 |
| 2 | 1 | 71.0 | 90.5 | 24 / 35 | 5795 |
| 3 | 1 | 71.5 | 90.8 | 21 / 35 | 6093 |
| 4 | 1 | 71.3 | 90.8 | 23 / 35 | 6119 |
| 5 | 1 | 72.0 | 94.9 | 23 / 35 | 5997 |
| 6 | 1 | 70.6 | 90.2 | 19 / 35 | 6053 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 121 | 70% |
| dummy.mini.Scimitar 1.01 | 29 | 76% |
| cf.RiO.RiOx 4.2.1 | 19 | 100% |
| eld.Hmm 1.0 | 6 | 50% |
| el.JumpShoot 0.2 | 2 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 1219. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 44 | 56% | 114 |
| dummy.mini.Scimitar 1.01 | 19 | 24% | 48 |
| cf.RiO.RiOx 4.2.1 | 7 | 9% | 26 |
| eld.Hmm 1.0 | 3 | 4% | 10 |
| PSW.Relentless 0.1 | 3 | 4% | 3 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |
| arthord.MannyPacquiao Beta | 1 | 1% | 1 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 5 |

Posture (Hadur's M records, 199 rounds): 169294 melee ticks, 74353 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 63 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 48441 sent, 43631 reached their opponent, 7123 virtual hits (16.3% of those reached).

## Melee bench: F22

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474231. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 137 over 6 battles (22.8 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 90.4 | 105 / 210 | 1.77 | 21.1% | 29078 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.1% | 105 |
| pe.SandboxDT 2.71m | 2.5 | 16.6% | 51 |
| kvk.HebusLeTroll 0.35 | 2.7 | 15.8% | 32 |
| jlm.javaDisturbance 0.59 | 3.8 | 13.4% | 17 |
| bigpete.Stewie 1.0 | 5.0 | 10.5% | 4 |
| tad.Dalek98 0.98 | 6.5 | 6.6% | 1 |
| yk.JahRoslav 1.1 | 7.0 | 6.6% | 1 |
| gg.Squaraus 0.6 | 7.7 | 5.4% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 92.9 | 17 / 35 | 5149 |
| 2 | 1 | 69.4 | 89.3 | 16 / 35 | 4809 |
| 3 | 1 | 68.0 | 87.1 | 10 / 35 | 4518 |
| 4 | 1 | 69.2 | 90.0 | 19 / 35 | 4531 |
| 5 | 1 | 70.2 | 91.1 | 20 / 35 | 4928 |
| 6 | 1 | 70.9 | 91.8 | 23 / 35 | 5143 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 62 | 42% |
| kvk.HebusLeTroll 0.35 | 59 | 61% |
| jlm.javaDisturbance 0.59 | 44 | 77% |
| bigpete.Stewie 1.0 | 5 | 80% |
| yk.JahRoslav 1.1 | 4 | 75% |
| pbg.NinjaX 1.2 | 1 | 100% |
| tad.Dalek98 0.98 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 1045. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 42 | 40% | 74 |
| kvk.HebusLeTroll 0.35 | 34 | 32% | 56 |
| jlm.javaDisturbance 0.59 | 23 | 22% | 57 |
| bigpete.Stewie 1.0 | 3 | 3% | 10 |
| yk.JahRoslav 1.1 | 2 | 2% | 4 |
| tad.Dalek98 0.98 | 1 | 1% | 6 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 154316 melee ticks, 53568 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 25 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 44726 sent, 40416 reached their opponent, 5176 virtual hits (12.8% of those reached).

## Melee bench: F23

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1476791. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 141 over 6 battles (23.5 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.8 | 97.1 | 183 / 210 | 1.26 | 22.6% | 40548 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 22.6% | 183 |
| pe.SandboxLump 1.52 | 2.0 | 16.7% | 21 |
| cre.Karolos 0.32 | 3.0 | 13.3% | 3 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.0% | 1 |
| stelo.RamTrackSurfer 1.2 | 5.0 | 8.9% | 1 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.3 | 8.3% | 0 |
| cw.megas.Blade 0.8 | 6.8 | 7.7% | 1 |
| sample.Walls 1.0 | 7.7 | 7.0% | 0 |
| rrh.Iwillfindyou 2.0 | 9.2 | 3.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 95.9 | 28 / 35 | 6506 |
| 2 | 1 | 73.4 | 96.5 | 30 / 35 | 6528 |
| 3 | 1 | 74.8 | 98.7 | 32 / 35 | 7168 |
| 4 | 1 | 73.8 | 98.1 | 32 / 35 | 6704 |
| 5 | 1 | 74.0 | 97.5 | 31 / 35 | 6720 |
| 6 | 1 | 73.8 | 96.2 | 30 / 35 | 6922 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 114 | 93% |
| cre.Karolos 0.32 | 51 | 98% |
| stelo.RamTrackSurfer 1.2 | 12 | 92% |
| stelo.AreaTargetingBot 1.1 | 7 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 2 | 50% |

Hadur died in 27 of 210 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 14 | 52% | 98 |
| cre.Karolos 0.32 | 8 | 30% | 50 |
| stelo.RamTrackSurfer 1.2 | 2 | 7% | 25 |
| stelo.AreaTargetingBot 1.1 | 1 | 4% | 16 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 4% | 7 |
| cw.megas.Blade 0.8 | 1 | 4% | 4 |
| sample.Walls 1.0 | 0 | 0% | 6 |

Posture (Hadur's M records, 198 rounds): 121554 melee ticks, 48833 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 49 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 37369 sent, 32444 reached their opponent, 9160 virtual hits (28.2% of those reached).

## Melee bench: F24

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1475171. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 148 over 6 battles (24.7 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 83.5 | 80 / 210 | 2.49 | 17.3% | 26442 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 17.3% | 80 |
| davidalves.Phoenix 0.54 | 2.3 | 13.9% | 46 |
| rz.GlowBlowMelee 1.4 | 3.2 | 13.5% | 34 |
| florent.XSeries.X2 0.12 | 3.8 | 13.0% | 25 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.0% | 13 |
| oog.melee.Corsair 1.0 | 5.8 | 9.6% | 6 |
| stelo.SoJNanoMelee 1.1 | 7.2 | 6.4% | 4 |
| lunchie.Lunchbox 0.93 | 8.7 | 5.4% | 2 |
| as.FrankTheTank 1.3 | 8.8 | 5.1% | 0 |
| evd.X1 0.01 | 9.3 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 83.5 | 13 / 35 | 4615 |
| 2 | 1 | 64.9 | 78.4 | 10 / 35 | 4203 |
| 3 | 1 | 68.6 | 89.2 | 19 / 35 | 4643 |
| 4 | 1 | 66.9 | 85.7 | 12 / 35 | 4328 |
| 5 | 1 | 67.3 | 85.7 | 15 / 35 | 4444 |
| 6 | 1 | 65.1 | 78.4 | 11 / 35 | 4209 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.Phoenix 0.54 | 44 | 39% |
| rz.GlowBlowMelee 1.4 | 41 | 66% |
| florent.XSeries.X2 0.12 | 27 | 67% |
| pedersen.Ugluk 1.1.1 | 14 | 64% |
| oog.melee.Corsair 1.0 | 8 | 75% |
| stelo.SoJNanoMelee 1.1 | 3 | 67% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 796. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 38 | 29% | 51 |
| rz.GlowBlowMelee 1.4 | 29 | 22% | 54 |
| florent.XSeries.X2 0.12 | 25 | 19% | 44 |
| pedersen.Ugluk 1.1.1 | 16 | 12% | 23 |
| oog.melee.Corsair 1.0 | 12 | 9% | 21 |
| stelo.SoJNanoMelee 1.1 | 7 | 5% | 10 |
| evd.X1 0.01 | 3 | 2% | 3 |
| as.FrankTheTank 1.3 | 1 | 1% | 2 |
| lunchie.Lunchbox 0.93 | 0 | 0% | 2 |

Posture (Hadur's M records, 201 rounds): 136310 melee ticks, 40638 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 47 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 44399 sent, 39276 reached their opponent, 6841 virtual hits (17.4% of those reached).

## Melee bench: F25

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1485267. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 145 over 6 battles (24.2 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 87.9 | 140 / 210 | 1.97 | 20.8% | 23286 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.8% | 140 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 15.1% | 20 |
| voidious.micro.BlitzBat 1.05 | 3.3 | 13.6% | 14 |
| jdw.Hurricane 1.4 | 3.7 | 12.7% | 15 |
| ds.Oo 2.2 | 4.8 | 10.2% | 11 |
| awesomeness.Elite 1.0 | 6.2 | 8.2% | 3 |
| adt.Ar2 1.1 | 7.0 | 7.7% | 2 |
| gjr.Cephalosporin 0.1 | 7.8 | 6.8% | 4 |
| amk.ChumbaMini 0.2 | 9.0 | 5.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 90.0 | 23 / 35 | 3868 |
| 2 | 1 | 65.4 | 80.7 | 16 / 35 | 3701 |
| 3 | 1 | 69.2 | 89.3 | 26 / 35 | 3968 |
| 4 | 1 | 68.4 | 86.4 | 23 / 35 | 3773 |
| 5 | 1 | 69.9 | 91.8 | 26 / 35 | 3996 |
| 6 | 1 | 69.2 | 88.9 | 26 / 35 | 3980 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 52 | 81% |
| voidious.micro.BlitzBat 1.05 | 40 | 90% |
| jdw.Hurricane 1.4 | 40 | 90% |
| ds.Oo 2.2 | 17 | 76% |
| adt.Ar2 1.1 | 6 | 83% |
| awesomeness.Elite 1.0 | 5 | 80% |
| gjr.Cephalosporin 0.1 | 2 | 100% |
| amk.ChumbaMini 0.2 | 2 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 634. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 16 | 23% | 59 |
| voidious.micro.BlitzBat 1.05 | 14 | 20% | 34 |
| ds.Oo 2.2 | 13 | 19% | 24 |
| jdw.Hurricane 1.4 | 9 | 13% | 41 |
| adt.Ar2 1.1 | 6 | 9% | 16 |
| awesomeness.Elite 1.0 | 6 | 9% | 16 |
| gjr.Cephalosporin 0.1 | 3 | 4% | 10 |
| amk.ChumbaMini 0.2 | 3 | 4% | 4 |

Posture (Hadur's M records, 201 rounds): 118948 melee ticks, 31301 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 42 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 38154 sent, 33868 reached their opponent, 5339 virtual hits (15.8% of those reached).

## Melee bench: F26

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474425. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 192 over 6 battles (32.0 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 93.8 | 145 / 210 | 1.56 | 21.7% | 41880 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.7% | 145 |
| ak.Fermat 2.0 | 2.0 | 14.7% | 31 |
| lrem.Spectre 0.4.4 | 3.5 | 12.0% | 10 |
| shu.nitro.LENIN .T34 | 3.5 | 12.4% | 15 |
| js.PinBall 1.6 | 5.3 | 10.2% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 5.8 | 9.3% | 4 |
| gh.mini.GrubbmOne 1.0 | 7.3 | 7.5% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 7.5 | 7.0% | 2 |
| sample.SpinBot 1.0 | 9.0 | 3.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 94.6 | 22 / 35 | 7261 |
| 2 | 1 | 73.9 | 97.1 | 28 / 35 | 7188 |
| 3 | 1 | 72.5 | 92.1 | 23 / 35 | 6945 |
| 4 | 1 | 72.2 | 91.4 | 23 / 35 | 6719 |
| 5 | 1 | 72.5 | 92.4 | 23 / 35 | 7086 |
| 6 | 1 | 72.8 | 95.2 | 26 / 35 | 6681 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 77 | 71% |
| shu.nitro.LENIN .T34 | 44 | 89% |
| lrem.Spectre 0.4.4 | 38 | 84% |
| js.PinBall 1.6 | 10 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 9 | 56% |
| gh.mini.GrubbmOne 1.0 | 3 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 50% |

Hadur died in 65 of 210 rounds, at a mean tick of 1045. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 35 | 54% | 85 |
| lrem.Spectre 0.4.4 | 12 | 18% | 40 |
| shu.nitro.LENIN .T34 | 8 | 12% | 49 |
| jaybot.adv.bots.JayBot 2.0 | 6 | 9% | 15 |
| js.PinBall 1.6 | 3 | 5% | 15 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 2% | 2 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 3 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 156809 melee ticks, 51960 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 46 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 48956 sent, 44006 reached their opponent, 9977 virtual hits (22.7% of those reached).

## Melee bench: F27

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1477291. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 162 over 6 battles (27.0 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 82.9 | 140 / 210 | 2.54 | 19.2% | 33582 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.2 | 19.2% | 140 |
| mk.Alpha 0.2.1 | 2.0 | 14.5% | 45 |
| EH.Eagle 1.0.6 | 2.8 | 11.6% | 7 |
| sheldor.melee.nano.TestMelee 0.1 | 4.7 | 9.7% | 4 |
| techdude.kombat.FlamingKombat 1.5 | 5.3 | 9.0% | 3 |
| throxbot.ThroxBot 0.1 | 6.0 | 8.6% | 2 |
| joe.ADinosaur 1.0 | 7.0 | 8.4% | 2 |
| wee.Gem 1.8.4 | 7.2 | 8.6% | 7 |
| caimano.Furia_Ceca 0.22 | 9.2 | 5.3% | 1 |
| cs.Grudge 1.0 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 87.0 | 26 / 35 | 5829 |
| 2 | 1 | 71.4 | 94.3 | 27 / 35 | 5761 |
| 3 | 1 | 72.0 | 94.0 | 29 / 35 | 6212 |
| 4 | 1 | 70.3 | 91.1 | 25 / 35 | 5509 |
| 5 | 1 | 63.9 | 65.7 | 17 / 35 | 5020 |
| 6 | 2 | 63.8 | 65.4 | 16 / 35 | 5251 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 81 | 86% |
| EH.Eagle 1.0.6 | 31 | 90% |
| throxbot.ThroxBot 0.1 | 10 | 90% |
| techdude.kombat.FlamingKombat 1.5 | 10 | 90% |
| wee.Gem 1.8.4 | 10 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 10 | 100% |
| joe.ADinosaur 1.0 | 4 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 524. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 20 | 28% | 73 |
| cs.Grudge 1.0 | 17 | 24% | 20 |
| joe.ADinosaur 1.0 | 10 | 14% | 14 |
| EH.Eagle 1.0.6 | 8 | 11% | 44 |
| caimano.Furia_Ceca 0.22 | 5 | 7% | 5 |
| sheldor.melee.nano.TestMelee 0.1 | 3 | 4% | 17 |
| techdude.kombat.FlamingKombat 1.5 | 3 | 4% | 12 |
| wee.Gem 1.8.4 | 2 | 3% | 13 |
| throxbot.ThroxBot 0.1 | 2 | 3% | 9 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 117885 melee ticks, 33453 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 57 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 37945 sent, 33318 reached their opponent, 8192 virtual hits (24.6% of those reached).

## Melee bench: F28

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1489048. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 178 over 6 battles (29.7 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 89.5 | 138 / 210 | 1.95 | 19.0% | 25986 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 19.0% | 138 |
| kid.test.NightFox .2 | 2.0 | 15.0% | 28 |
| uji.Antique 1.0 | 3.2 | 12.4% | 27 |
| pfvicm.Sobieski 7.2.3b | 4.0 | 11.1% | 2 |
| qohnil.blot.BlotBot 3.61 | 5.0 | 10.0% | 8 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.0% | 1 |
| ahr.ice.Ice 1.0.2 | 6.8 | 7.6% | 3 |
| matt.advanced.Katana 1.0 | 7.7 | 6.4% | 3 |
| stelo.PianistNano 1.2 | 9.2 | 5.4% | 0 |
| stelo.Lifestealer 1.0 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 88.9 | 18 / 35 | 4105 |
| 2 | 1 | 68.2 | 87.9 | 21 / 35 | 4415 |
| 3 | 1 | 69.5 | 90.8 | 25 / 35 | 4476 |
| 4 | 1 | 69.9 | 92.7 | 26 / 35 | 4347 |
| 5 | 1 | 68.0 | 87.6 | 24 / 35 | 4228 |
| 6 | 1 | 68.8 | 88.9 | 24 / 35 | 4415 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 86 | 85% |
| uji.Antique 1.0 | 47 | 77% |
| qohnil.blot.BlotBot 3.61 | 11 | 82% |
| pfvicm.Sobieski 7.2.3b | 10 | 100% |
| ahr.ice.Ice 1.0.2 | 6 | 83% |
| amk.ChumbaWumba 0.3 | 4 | 75% |
| matt.advanced.Katana 1.0 | 2 | 50% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 749. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 22 | 30% | 65 |
| uji.Antique 1.0 | 22 | 30% | 59 |
| pfvicm.Sobieski 7.2.3b | 13 | 18% | 21 |
| ahr.ice.Ice 1.0.2 | 6 | 8% | 14 |
| qohnil.blot.BlotBot 3.61 | 4 | 5% | 25 |
| amk.ChumbaWumba 0.3 | 2 | 3% | 9 |
| matt.advanced.Katana 1.0 | 2 | 3% | 6 |
| stelo.Lifestealer 1.0 | 2 | 3% | 3 |
| stelo.PianistNano 1.2 | 0 | 0% | 3 |

Posture (Hadur's M records, 200 rounds): 128079 melee ticks, 37059 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 48 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 42642 sent, 37688 reached their opponent, 5189 virtual hits (13.8% of those reached).

## Melee bench: F29

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1477298. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 156 over 6 battles (26.0 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 90.0 | 115 / 210 | 1.90 | 19.8% | 30439 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 19.8% | 115 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 15.2% | 44 |
| deewiant.Anomaly 0.2 | 2.7 | 14.4% | 37 |
| myl.micro.Troodon 1.10 | 4.3 | 11.7% | 8 |
| jok.PheonixM 0.1.2 | 4.7 | 10.9% | 3 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.3% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.5 | 5.9% | 0 |
| DBall.Anarchy 0.1 | 7.8 | 5.4% | 3 |
| ap.Frederick 1.1 | 8.8 | 4.5% | 1 |
| jangs.ns51 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 85.4 | 15 / 35 | 4771 |
| 2 | 1 | 71.0 | 93.0 | 23 / 35 | 4926 |
| 3 | 1 | 71.2 | 92.4 | 20 / 35 | 5486 |
| 4 | 1 | 69.9 | 88.6 | 17 / 35 | 4962 |
| 5 | 1 | 70.8 | 90.5 | 21 / 35 | 5321 |
| 6 | 1 | 70.1 | 90.2 | 19 / 35 | 4973 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 67 | 61% |
| zyx.mega.YersiniaPestis 3.1 | 54 | 56% |
| myl.micro.Troodon 1.10 | 29 | 90% |
| jok.PheonixM 0.1.2 | 17 | 88% |
| ap.Frederick 1.1 | 2 | 50% |
| ph.melee.ArcherME 0.3 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |
| DBall.Anarchy 0.1 | 1 | 0% |

Hadur died in 96 of 210 rounds, at a mean tick of 1059. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 46 | 48% | 84 |
| zyx.mega.YersiniaPestis 3.1 | 33 | 34% | 67 |
| myl.micro.Troodon 1.10 | 7 | 7% | 24 |
| jok.PheonixM 0.1.2 | 6 | 6% | 27 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 4 |
| DBall.Anarchy 0.1 | 1 | 1% | 2 |
| ap.Frederick 1.1 | 1 | 1% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 159728 melee ticks, 57009 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 32 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 51325 sent, 46596 reached their opponent, 6794 virtual hits (14.6% of those reached).

## Melee bench: F30

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1471939. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 148 over 6 battles (24.7 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 79.4 | 60 / 210 | 2.65 | 18.2% | 26463 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 18.2% | 60 |
| darkcanuck.B26354 1.06 | 2.5 | 15.9% | 60 |
| oog.melee.Capulet 1.2 | 3.0 | 15.5% | 39 |
| stelo.PastFuture 2.3.2 | 3.5 | 14.4% | 30 |
| intruder.PrairieWolf 2.61 | 5.3 | 9.6% | 9 |
| tripphippy.Alice 1.1 | 5.8 | 8.9% | 7 |
| ntc.Opposite 1.5 | 7.2 | 7.4% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 7.7 | 7.2% | 5 |
| GarmBox.Anger 1.0 | 9.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 82.9 | 13 / 35 | 4721 |
| 2 | 1 | 65.5 | 79.3 | 8 / 35 | 4301 |
| 3 | 1 | 66.1 | 80.0 | 13 / 35 | 4444 |
| 4 | 1 | 64.9 | 76.1 | 12 / 35 | 4205 |
| 5 | 1 | 66.6 | 82.9 | 9 / 35 | 4590 |
| 6 | 1 | 64.0 | 75.4 | 5 / 35 | 4202 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 43 | 23% |
| oog.melee.Capulet 1.2 | 41 | 59% |
| stelo.PastFuture 2.3.2 | 28 | 57% |
| intruder.PrairieWolf 2.61 | 7 | 43% |
| fowl3628800.LightningBolt 2.6.0 | 6 | 67% |
| tripphippy.Alice 1.1 | 3 | 100% |

Hadur died in 150 of 210 rounds, at a mean tick of 953. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 55 | 37% | 65 |
| oog.melee.Capulet 1.2 | 33 | 22% | 59 |
| stelo.PastFuture 2.3.2 | 27 | 18% | 39 |
| tripphippy.Alice 1.1 | 14 | 9% | 16 |
| intruder.PrairieWolf 2.61 | 11 | 7% | 14 |
| fowl3628800.LightningBolt 2.6.0 | 8 | 5% | 12 |
| ntc.Opposite 1.5 | 2 | 1% | 5 |

Posture (Hadur's M records, 201 rounds): 157122 melee ticks, 45611 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 47 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 45497 sent, 41037 reached their opponent, 6663 virtual hits (16.2% of those reached).

## Melee bench: F31

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1477639. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 140 over 6 battles (23.3 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 84.1 | 76 / 210 | 2.43 | 17.3% | 25450 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.3 | 17.3% | 76 |
| abc.Shadow 3.84i | 1.7 | 16.8% | 73 |
| gh.mini.Griezel 0.2 | 3.2 | 13.0% | 46 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.3% | 8 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 11.1% | 7 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.7% | 0 |
| timmit.nano.TimDog 0.33 | 7.2 | 7.0% | 1 |
| fm.mammillarias 1.3 | 8.7 | 5.0% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.8 | 5.1% | 0 |
| tlp.ThreeLeggedPig 1 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 81.6 | 11 / 35 | 3992 |
| 2 | 1 | 68.1 | 86.7 | 14 / 35 | 4570 |
| 3 | 2 | 66.3 | 80.6 | 11 / 35 | 4510 |
| 4 | 1 | 65.6 | 80.3 | 12 / 35 | 4089 |
| 5 | 1 | 68.7 | 90.8 | 16 / 35 | 4545 |
| 6 | 1 | 65.8 | 84.4 | 12 / 35 | 3744 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 51 | 49% |
| gh.mini.Griezel 0.2 | 46 | 52% |
| d414.nano.Quantum 1.0.0 | 22 | 77% |
| spinnercat.micro.Tyger 0.1 | 10 | 70% |
| timmit.nano.TimDog 0.33 | 2 | 100% |
| gh.nano.Grofvuil 0.2 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 917. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 59 | 44% | 90 |
| gh.mini.Griezel 0.2 | 35 | 26% | 58 |
| spinnercat.micro.Tyger 0.1 | 15 | 11% | 18 |
| d414.nano.Quantum 1.0.0 | 9 | 7% | 22 |
| gh.nano.Grofvuil 0.2 | 7 | 5% | 11 |
| Gecko.ultimateGeckoBot 1.0 | 4 | 3% | 4 |
| fm.mammillarias 1.3 | 2 | 1% | 3 |
| timmit.nano.TimDog 0.33 | 2 | 1% | 3 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 153651 melee ticks, 37702 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 40 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 48062 sent, 43093 reached their opponent, 6563 virtual hits (15.2% of those reached).

## Melee bench: F32

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1490605. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 183 over 6 battles (30.5 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 89.6 | 129 / 210 | 1.93 | 19.2% | 29734 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 19.2% | 129 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.1% | 51 |
| apc.botM 3.0 | 3.2 | 11.7% | 13 |
| vjik.UnViolation 1.1 | 4.5 | 9.9% | 8 |
| lxx.ConceptA 0.8 | 4.7 | 10.2% | 1 |
| bayen.UbaMicro 1.4 | 5.7 | 9.3% | 2 |
| yk.JahMicro 1.0 | 7.7 | 6.9% | 5 |
| panzer.Panzer 0.2 | 7.8 | 6.9% | 1 |
| conscience.Electron 1.3g | 8.5 | 6.3% | 0 |
| donjezza.Jezza 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 92.1 | 19 / 35 | 5127 |
| 2 | 1 | 67.6 | 85.4 | 20 / 35 | 4716 |
| 3 | 1 | 68.8 | 89.2 | 24 / 35 | 4877 |
| 4 | 1 | 68.3 | 88.3 | 22 / 35 | 4732 |
| 5 | 1 | 68.7 | 88.9 | 22 / 35 | 5197 |
| 6 | 1 | 70.1 | 94.0 | 22 / 35 | 5085 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 90 | 62% |
| apc.botM 3.0 | 34 | 85% |
| vjik.UnViolation 1.1 | 20 | 80% |
| bayen.UbaMicro 1.4 | 9 | 89% |
| lxx.ConceptA 0.8 | 8 | 100% |
| yk.JahMicro 1.0 | 7 | 57% |
| panzer.Panzer 0.2 | 4 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 35 | 43% | 85 |
| apc.botM 3.0 | 12 | 15% | 40 |
| lxx.ConceptA 0.8 | 9 | 11% | 18 |
| bayen.UbaMicro 1.4 | 7 | 9% | 15 |
| vjik.UnViolation 1.1 | 6 | 7% | 28 |
| yk.JahMicro 1.0 | 5 | 6% | 8 |
| panzer.Panzer 0.2 | 3 | 4% | 7 |
| conscience.Electron 1.3g | 3 | 4% | 5 |
| donjezza.Jezza 1.0 | 1 | 1% | 4 |

Posture (Hadur's M records, 198 rounds): 122243 melee ticks, 54186 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 46 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 40448 sent, 35588 reached their opponent, 6120 virtual hits (17.2% of those reached).

## Melee bench: F33

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478255. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 137 over 6 battles (22.8 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 92.8 | 145 / 210 | 1.58 | 23.2% | 32222 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 23.2% | 145 |
| maribo.Quester 0.3 | 2.0 | 17.7% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 14.5% | 17 |
| labg.Cataclysm 2.05 | 4.7 | 11.1% | 9 |
| baal.nano.N 1.42 | 5.0 | 10.0% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.3 | 9.1% | 4 |
| zyx.micro.Ant 1.1 | 7.2 | 6.2% | 0 |
| sanja.First 0.1 | 7.8 | 5.1% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 95.4 | 27 / 35 | 5819 |
| 2 | 1 | 71.5 | 89.6 | 21 / 35 | 5483 |
| 3 | 1 | 71.7 | 92.1 | 25 / 35 | 4955 |
| 4 | 1 | 71.4 | 91.4 | 21 / 35 | 5316 |
| 5 | 1 | 72.0 | 92.5 | 24 / 35 | 5159 |
| 6 | 1 | 73.1 | 95.7 | 27 / 35 | 5490 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 90 | 84% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 55 | 85% |
| labg.Cataclysm 2.05 | 13 | 62% |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 86% |
| baal.nano.N 1.42 | 5 | 100% |
| sanja.First 0.1 | 2 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 1087. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 36 | 53% | 99 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 19% | 61 |
| labg.Cataclysm 2.05 | 10 | 15% | 29 |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 9% | 11 |
| baal.nano.N 1.42 | 2 | 3% | 6 |
| zyx.micro.Ant 1.1 | 1 | 1% | 2 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 164958 melee ticks, 58284 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 494 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 116 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 47334 sent, 42982 reached their opponent, 5924 virtual hits (13.8% of those reached).

## Melee bench: F34

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1476173. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 136 over 6 battles (22.7 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 88.5 | 105 / 210 | 2.03 | 19.4% | 35022 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 19.4% | 105 |
| kid.Gladiator .7.2 | 2.3 | 16.3% | 44 |
| stelo.Spread 0.9 | 2.7 | 15.7% | 45 |
| jcs.Seth 1.8 | 4.5 | 10.6% | 13 |
| tcf.Reach 3 | 4.7 | 10.6% | 3 |
| cli.Dancer 1.1 | 5.8 | 9.4% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.0% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.7% | 0 |
| sample.RamFire 1.0 | 9.3 | 3.0% | 0 |
| sample.VelociRobot 1.0 | 9.7 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 90.2 | 20 / 35 | 5728 |
| 2 | 1 | 71.3 | 89.8 | 20 / 35 | 6247 |
| 3 | 1 | 69.1 | 84.4 | 19 / 35 | 5347 |
| 4 | 1 | 70.2 | 88.9 | 13 / 35 | 5870 |
| 5 | 1 | 69.3 | 86.0 | 15 / 35 | 5639 |
| 6 | 1 | 71.4 | 91.7 | 18 / 35 | 6191 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 62 | 68% |
| kid.Gladiator .7.2 | 54 | 65% |
| jcs.Seth 1.8 | 19 | 58% |
| tcf.Reach 3 | 10 | 80% |
| cli.Dancer 1.1 | 6 | 100% |
| ratosh.Wesco 1.4 | 2 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 1080. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 46 | 43% | 74 |
| stelo.Spread 0.9 | 39 | 36% | 78 |
| jcs.Seth 1.8 | 13 | 12% | 24 |
| tcf.Reach 3 | 4 | 4% | 16 |
| ratosh.Wesco 1.4 | 3 | 3% | 7 |
| cli.Dancer 1.1 | 2 | 2% | 10 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 161298 melee ticks, 59432 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 31 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 49224 sent, 44404 reached their opponent, 6942 virtual hits (15.6% of those reached).

## Melee bench: F35

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478700. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 134 over 6 battles (22.3 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 83.8 | 47 / 210 | 2.46 | 16.5% | 24124 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 18.8% | 122 |
| hadur117.Hadur 3.21bb | 2.0 | 16.5% | 47 |
| gh.mini.Gruwel 0.9 | 3.8 | 12.8% | 24 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.8 | 12.2% | 11 |
| rz.HawkOnFire 0.1 | 4.3 | 11.6% | 6 |
| wit.Chuliath 1.0 | 6.5 | 6.7% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.3 | 6.3% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.8 | 5.7% | 0 |
| dans.Cinnamon 1.2 | 9.0 | 4.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.0 | 84.8 | 10 / 35 | 4283 |
| 2 | 2 | 65.2 | 81.6 | 7 / 35 | 3867 |
| 3 | 2 | 66.2 | 84.8 | 10 / 35 | 3977 |
| 4 | 2 | 66.6 | 85.1 | 9 / 35 | 4098 |
| 5 | 2 | 66.3 | 85.7 | 6 / 35 | 4091 |
| 6 | 2 | 64.4 | 81.0 | 5 / 35 | 3808 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 80 | 21% |
| gh.mini.Gruwel 0.9 | 31 | 39% |
| rz.HawkOnFire 0.1 | 13 | 77% |
| dmh.robocode.robot.BlackDeath 9.2 | 10 | 70% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |
| wit.Chuliath 1.0 | 1 | 0% |

Hadur died in 163 of 210 rounds, at a mean tick of 952. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 84 | 52% | 99 |
| gh.mini.Gruwel 0.9 | 30 | 18% | 44 |
| dmh.robocode.robot.BlackDeath 9.2 | 28 | 17% | 36 |
| rz.HawkOnFire 0.1 | 12 | 7% | 19 |
| wit.Chuliath 1.0 | 3 | 2% | 4 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 2% | 3 |
| dans.Cinnamon 1.2 | 2 | 1% | 3 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 2 |

Posture (Hadur's M records, 201 rounds): 148090 melee ticks, 47003 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 33 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 44232 sent, 39194 reached their opponent, 5786 virtual hits (14.8% of those reached).

## Melee bench: F36

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1483177. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 206 over 6 battles (34.3 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 93.0 | 160 / 210 | 1.63 | 21.4% | 35518 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.4% | 160 |
| bzdp.Pansy 2.1 | 2.5 | 12.5% | 14 |
| alpha.RainingFire 1.0 | 2.8 | 12.4% | 15 |
| mz.Cork 0.1 | 4.2 | 10.8% | 11 |
| bvh.micro.Freya 0.3 | 4.7 | 10.5% | 6 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.4% | 2 |
| m3thos.Eva02 0.7.1 | 6.5 | 9.3% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 5.5% | 0 |
| dl.BetterWalls 1.0 | 9.0 | 4.7% | 0 |
| sample.MyFirstRobot 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 89.8 | 21 / 35 | 5564 |
| 2 | 1 | 70.8 | 89.8 | 28 / 35 | 5610 |
| 3 | 1 | 71.1 | 90.8 | 25 / 35 | 5775 |
| 4 | 1 | 73.2 | 98.1 | 30 / 35 | 6183 |
| 5 | 1 | 73.0 | 94.9 | 27 / 35 | 6350 |
| 6 | 1 | 72.5 | 94.6 | 29 / 35 | 6036 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 48 | 85% |
| bvh.micro.Freya 0.3 | 39 | 90% |
| alpha.RainingFire 1.0 | 30 | 87% |
| mz.Cork 0.1 | 26 | 85% |
| bvh.mini.Fenrir 0.39 | 15 | 100% |
| m3thos.Eva02 0.7.1 | 13 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.MyFirstRobot 1.0 | 3 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 889. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 15 | 29% | 40 |
| bzdp.Pansy 2.1 | 14 | 27% | 54 |
| mz.Cork 0.1 | 7 | 13% | 36 |
| bvh.mini.Fenrir 0.39 | 7 | 13% | 17 |
| bvh.micro.Freya 0.3 | 6 | 12% | 33 |
| m3thos.Eva02 0.7.1 | 2 | 4% | 21 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 2 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 3 |
| dl.BetterWalls 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 201 rounds): 144113 melee ticks, 45581 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 120 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 120 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 48076 sent, 43334 reached their opponent, 8467 virtual hits (19.5% of those reached).

## Melee bench: F37

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1490286. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 224 over 6 battles (37.3 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 92.8 | 170 / 210 | 1.65 | 20.5% | 36381 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.5% | 170 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.2 | 11.3% | 10 |
| germ.TheMind .2 | 4.3 | 9.5% | 6 |
| EBBU.Sim2 1.02 | 4.7 | 9.4% | 3 |
| stelo.UntouchableNano 1.3 | 5.3 | 9.0% | 9 |
| agrach.Dalek 1.0 | 5.7 | 9.0% | 5 |
| lmk.ACPFinal 0.1 | 7.3 | 7.9% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 7.5 | 8.3% | 1 |
| mb.Beast 0.1 | 8.3 | 7.8% | 2 |
| skm.Ryubot 1.0 | 8.7 | 7.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 88.9 | 27 / 35 | 5826 |
| 2 | 1 | 69.7 | 91.7 | 28 / 35 | 5895 |
| 3 | 1 | 68.4 | 89.5 | 25 / 35 | 5816 |
| 4 | 1 | 72.0 | 99.4 | 34 / 35 | 6421 |
| 5 | 1 | 71.4 | 96.5 | 32 / 35 | 6433 |
| 6 | 1 | 69.4 | 90.8 | 24 / 35 | 5990 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 32 | 97% |
| germ.TheMind .2 | 31 | 90% |
| stelo.UntouchableNano 1.3 | 30 | 87% |
| com.syncleus.robocode.Dreadnaught 0.1 | 27 | 93% |
| EBBU.Sim2 1.02 | 21 | 95% |
| mb.Beast 0.1 | 16 | 100% |
| skm.Ryubot 1.0 | 13 | 85% |
| lmk.ACPFinal 0.1 | 12 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 50% |

Hadur died in 40 of 210 rounds, at a mean tick of 479. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 9 | 23% | 43 |
| mn.nano.perceptual.Impact 1.3.0 | 9 | 23% | 12 |
| stelo.UntouchableNano 1.3 | 7 | 18% | 31 |
| lmk.ACPFinal 0.1 | 5 | 13% | 23 |
| agrach.Dalek 1.0 | 3 | 8% | 31 |
| EBBU.Sim2 1.02 | 3 | 8% | 19 |
| germ.TheMind .2 | 2 | 5% | 18 |
| skm.Ryubot 1.0 | 2 | 5% | 6 |
| mb.Beast 0.1 | 0 | 0% | 18 |

Posture (Hadur's M records, 197 rounds): 92955 melee ticks, 26576 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (197 rounds): longest scan gap while four or more were alive 54 ticks (197 rounds over 8); rounds whose longest gap at any count was over 8: 197; robots dropped as dead without a death event: 0.

Targeting waves (197 rounds): 30868 sent, 26285 reached their opponent, 7222 virtual hits (27.5% of those reached).

## Melee bench: F38

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1504041. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 148 over 6 battles (24.7 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 88.8 | 111 / 210 | 2.00 | 18.9% | 29820 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.2 | 18.9% | 111 |
| justin.Mallais 14.0 | 1.8 | 16.2% | 63 |
| bvh.mini.Freya 0.55 | 3.2 | 12.4% | 9 |
| bts.mega.Gnarly 1.4 | 4.5 | 11.1% | 13 |
| cs.Wren 1.0 | 4.8 | 10.2% | 6 |
| kdf.KoulDestroyer 1.0 | 5.7 | 9.5% | 5 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.8 | 8.0% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.6% | 1 |
| matt.UnderDark3 2.4.34 | 9.2 | 3.9% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 88.3 | 18 / 35 | 4615 |
| 2 | 1 | 69.0 | 89.5 | 19 / 35 | 4864 |
| 3 | 2 | 67.3 | 82.2 | 15 / 35 | 4685 |
| 4 | 1 | 68.8 | 87.9 | 16 / 35 | 5199 |
| 5 | 1 | 70.0 | 91.1 | 20 / 35 | 5198 |
| 6 | 1 | 71.0 | 94.0 | 23 / 35 | 5259 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 88 | 58% |
| bts.mega.Gnarly 1.4 | 25 | 72% |
| bvh.mini.Freya 0.55 | 20 | 75% |
| cs.Wren 1.0 | 16 | 88% |
| kdf.KoulDestroyer 1.0 | 9 | 78% |
| davidalves.net.DuelistNanoMelee 1.01 | 5 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 50% |

Hadur died in 99 of 210 rounds, at a mean tick of 832. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 50 | 51% | 98 |
| bts.mega.Gnarly 1.4 | 14 | 14% | 37 |
| kdf.KoulDestroyer 1.0 | 10 | 10% | 12 |
| bvh.mini.Freya 0.55 | 9 | 9% | 22 |
| cs.Wren 1.0 | 8 | 8% | 24 |
| davidalves.net.DuelistNanoMelee 1.01 | 5 | 5% | 12 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 3% | 3 |
| bzdp.BoxCar 2.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 135234 melee ticks, 44008 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 46 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 43295 sent, 38262 reached their opponent, 7652 virtual hits (20.0% of those reached).

## Melee bench: F39

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1466279. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 125 over 6 battles (20.8 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 94.0 | 145 / 210 | 1.48 | 23.3% | 35778 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 23.3% | 145 |
| bvh.fry.Freya 0.82 | 2.2 | 16.3% | 13 |
| az.Ololobot 0.2.4 | 2.8 | 14.9% | 51 |
| winamp32.micro.MicroMacro 1.0 | 4.5 | 9.7% | 0 |
| apollokidd.ApolloKidd 0.9 | 5.3 | 8.5% | 0 |
| gimp.GimpBot 0.1 | 5.5 | 8.4% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 7.3 | 6.8% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 7.8 | 6.3% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.5 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 94.3 | 24 / 35 | 5994 |
| 2 | 1 | 72.0 | 94.6 | 24 / 35 | 6179 |
| 3 | 1 | 70.6 | 92.9 | 22 / 35 | 5621 |
| 4 | 1 | 71.8 | 96.1 | 26 / 35 | 5647 |
| 5 | 1 | 72.0 | 93.6 | 25 / 35 | 6098 |
| 6 | 1 | 71.7 | 92.9 | 24 / 35 | 6239 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 93 | 61% |
| bvh.fry.Freya 0.82 | 76 | 91% |
| winamp32.micro.MicroMacro 1.0 | 13 | 100% |
| gimp.GimpBot 0.1 | 3 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 2 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 1294. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 41 | 63% | 107 |
| bvh.fry.Freya 0.82 | 18 | 28% | 59 |
| stelo.SoRobotNanoMelee 1.2 | 4 | 6% | 8 |
| winamp32.micro.MicroMacro 1.0 | 1 | 2% | 16 |
| apollokidd.ApolloKidd 0.9 | 1 | 2% | 2 |
| gimp.GimpBot 0.1 | 0 | 0% | 11 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 154043 melee ticks, 77046 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 50 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 44561 sent, 40255 reached their opponent, 6802 virtual hits (16.9% of those reached).

## Melee bench: F40

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478229. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 148 over 6 battles (24.7 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 91.5 | 148 / 210 | 1.76 | 20.9% | 34360 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.9% | 148 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.0% | 34 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.5% | 12 |
| mz.AntiGrav 1.0 | 4.5 | 10.8% | 2 |
| Polkwane.SmashMelee 1.0 | 4.7 | 10.3% | 8 |
| stelo.Randomness 1.0 | 6.0 | 9.0% | 4 |
| alpha.BlackIce 1.0 | 6.7 | 8.2% | 2 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.7% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 3.8% | 0 |
| sample.Corners 1.0 | 9.8 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 92.1 | 24 / 35 | 5582 |
| 2 | 1 | 72.6 | 95.2 | 28 / 35 | 5795 |
| 3 | 1 | 70.1 | 87.9 | 20 / 35 | 5362 |
| 4 | 1 | 71.1 | 88.3 | 26 / 35 | 5616 |
| 5 | 1 | 72.1 | 93.7 | 23 / 35 | 5963 |
| 6 | 1 | 72.4 | 92.1 | 27 / 35 | 6042 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 80 | 80% |
| kano.gamma.KanoGamma 1.8 | 42 | 86% |
| mz.AntiGrav 1.0 | 21 | 100% |
| Polkwane.SmashMelee 1.0 | 18 | 89% |
| stelo.Randomness 1.0 | 6 | 100% |
| alpha.BlackIce 1.0 | 4 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 26 | 42% | 76 |
| kano.gamma.KanoGamma 1.8 | 19 | 31% | 52 |
| mz.AntiGrav 1.0 | 5 | 8% | 25 |
| Polkwane.SmashMelee 1.0 | 5 | 8% | 21 |
| stelo.Randomness 1.0 | 4 | 6% | 20 |
| alpha.BlackIce 1.0 | 2 | 3% | 9 |
| amk.superstrike.SuperStrike 0.3 | 1 | 2% | 2 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 3 |
| sample.Corners 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 146278 melee ticks, 45037 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 128 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 128 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 46874 sent, 41991 reached their opponent, 8042 virtual hits (19.2% of those reached).

## Melee bench: F41

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1485890. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 153 over 6 battles (25.5 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 89.6 | 113 / 210 | 1.94 | 19.1% | 29550 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 19.1% | 113 |
| eem.EvBotNG v12.8 | 2.0 | 15.4% | 64 |
| ary.Swarm 1.1 | 3.5 | 12.6% | 9 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.5% | 15 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 11.1% | 7 |
| shrub.Silver v048 | 6.2 | 8.9% | 2 |
| zyx.nano.Ant 1.1 | 6.8 | 8.0% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 5.2% | 0 |
| stelo.Mirror 1.1 | 8.7 | 4.9% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 92.7 | 24 / 35 | 4918 |
| 2 | 1 | 69.5 | 91.1 | 17 / 35 | 4887 |
| 3 | 1 | 69.9 | 89.2 | 18 / 35 | 5249 |
| 4 | 1 | 68.3 | 84.8 | 17 / 35 | 4865 |
| 5 | 1 | 68.8 | 87.0 | 16 / 35 | 5010 |
| 6 | 1 | 69.9 | 92.7 | 21 / 35 | 4621 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 74 | 46% |
| lessonz.robocode.Oz 0.5.0 | 29 | 76% |
| ary.Swarm 1.1 | 29 | 83% |
| simonton.nano.MeleeSeed 1.8 | 23 | 96% |
| shrub.Silver v048 | 7 | 100% |
| stelo.Mirror 1.1 | 3 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 953. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 55 | 56% | 90 |
| lessonz.robocode.Oz 0.5.0 | 18 | 18% | 33 |
| ary.Swarm 1.1 | 15 | 15% | 32 |
| simonton.nano.MeleeSeed 1.8 | 5 | 5% | 27 |
| shrub.Silver v048 | 2 | 2% | 13 |
| stelo.Mirror 1.1 | 1 | 1% | 3 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
| zyx.nano.Ant 1.1 | 0 | 0% | 6 |
| jsal.Jsalbot 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 149484 melee ticks, 46862 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 47 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 47590 sent, 42654 reached their opponent, 6331 virtual hits (14.8% of those reached).

## Melee bench: F42

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1486040. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 163 over 6 battles (27.2 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 91.6 | 144 / 210 | 1.75 | 20.8% | 37265 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.8% | 144 |
| wompi.Wallaby 5.1 | 2.0 | 15.1% | 33 |
| maribo.mini.MiniQuester 0.1 | 3.2 | 13.6% | 12 |
| ara.Shera 0.88 | 3.8 | 12.6% | 20 |
| amz.NanoClone 1.41 | 5.0 | 9.0% | 1 |
| maribo.IotaCT 1.1 | 6.7 | 6.4% | 0 |
| dsw.StaticD 1.0 | 7.3 | 6.6% | 0 |
| stelo.MirrorMicro 1.0 | 7.5 | 6.2% | 0 |
| mme.NikeEnhanced 2.0 | 8.5 | 5.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 93.7 | 25 / 35 | 6298 |
| 2 | 1 | 70.8 | 91.4 | 23 / 35 | 6020 |
| 3 | 1 | 71.7 | 91.1 | 25 / 35 | 6502 |
| 4 | 1 | 72.2 | 93.0 | 26 / 35 | 6534 |
| 5 | 1 | 71.4 | 91.4 | 24 / 35 | 6090 |
| 6 | 1 | 70.0 | 89.2 | 21 / 35 | 5821 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 83 | 86% |
| maribo.mini.MiniQuester 0.1 | 49 | 92% |
| ara.Shera 0.88 | 24 | 71% |
| dsw.StaticD 1.0 | 4 | 100% |
| amz.NanoClone 1.41 | 4 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 25 | 37% | 46 |
| wompi.Wallaby 5.1 | 23 | 34% | 94 |
| maribo.mini.MiniQuester 0.1 | 14 | 21% | 53 |
| amz.NanoClone 1.41 | 4 | 6% | 8 |
| maribo.IotaCT 1.1 | 1 | 1% | 2 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 2 |
| dsw.StaticD 1.0 | 0 | 0% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 201 rounds): 159765 melee ticks, 53865 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 40 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 49512 sent, 44611 reached their opponent, 8240 virtual hits (18.5% of those reached).

## Melee bench: F43

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1486544. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 111 over 6 battles (18.5 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 80.1 | 44 / 210 | 2.79 | 16.5% | 27550 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.1% | 137 |
| hadur117.Hadur 3.21bb | 2.0 | 16.5% | 44 |
| brainfade.melee.Dusk 0.44 | 3.5 | 12.7% | 21 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.8% | 8 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 10.9% | 1 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.1% | 0 |
| jab.DiamondStealer 5 | 7.5 | 7.5% | 0 |
| mz.NanoGod 2.02 | 7.5 | 7.4% | 1 |
| cvt.Firsty 1.0 | 9.0 | 3.6% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 75.2 | 3 / 35 | 4369 |
| 2 | 2 | 69.0 | 84.4 | 13 / 35 | 4932 |
| 3 | 2 | 68.1 | 83.8 | 11 / 35 | 4713 |
| 4 | 2 | 66.0 | 77.8 | 5 / 35 | 4357 |
| 5 | 2 | 66.7 | 79.0 | 7 / 35 | 4723 |
| 6 | 2 | 66.7 | 80.3 | 5 / 35 | 4456 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 73 | 29% |
| brainfade.melee.Dusk 0.44 | 16 | 50% |
| dummy.micro.Sparrow 2.5 | 11 | 64% |
| wcsv.melee.EngineerMelee 0.1 | 8 | 100% |
| mz.NanoGod 2.02 | 1 | 0% |

Hadur died in 168 of 210 rounds, at a mean tick of 989. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 90 | 54% | 111 |
| brainfade.melee.Dusk 0.44 | 28 | 17% | 37 |
| dummy.micro.Sparrow 2.5 | 26 | 15% | 33 |
| mz.NanoGod 2.02 | 9 | 5% | 9 |
| wcsv.melee.EngineerMelee 0.1 | 7 | 4% | 14 |
| Krabb.akim2.Akim2 1.1b | 5 | 3% | 5 |
| jab.DiamondStealer 5 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 151790 melee ticks, 52987 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 40 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 47181 sent, 42143 reached their opponent, 6849 virtual hits (16.3% of those reached).

## Melee bench: F44

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1501813. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 138 over 6 battles (23.0 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 92.9 | 147 / 210 | 1.64 | 21.4% | 37419 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.4% | 147 |
| stelo.Liblix 0.3.1 | 2.3 | 15.5% | 42 |
| tzu.TheArtOfWar 1.2 | 2.7 | 14.9% | 16 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.3 | 9.4% | 1 |
| jwirde.Gort 2.0 | 5.0 | 8.8% | 2 |
| disan.Chair 2.2.0 | 6.2 | 7.5% | 2 |
| stf.PanzerGeneral 0.1 | 7.3 | 6.7% | 0 |
| wompi.Quokka 1.6 | 7.5 | 6.1% | 0 |
| sample.Crazy 1.0 | 9.2 | 4.8% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 92.1 | 24 / 35 | 6095 |
| 2 | 1 | 72.3 | 95.2 | 24 / 35 | 6184 |
| 3 | 1 | 72.9 | 95.9 | 27 / 35 | 6386 |
| 4 | 1 | 71.3 | 90.2 | 22 / 35 | 6152 |
| 5 | 1 | 71.6 | 92.1 | 26 / 35 | 6033 |
| 6 | 1 | 72.2 | 92.1 | 24 / 35 | 6569 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 80 | 74% |
| tzu.TheArtOfWar 1.2 | 72 | 90% |
| disan.Chair 2.2.0 | 10 | 80% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 100% |
| jwirde.Gort 2.0 | 5 | 80% |
| stf.PanzerGeneral 0.1 | 3 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 948. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 33 | 52% | 105 |
| tzu.TheArtOfWar 1.2 | 17 | 27% | 69 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 6% | 12 |
| disan.Chair 2.2.0 | 3 | 5% | 8 |
| jwirde.Gort 2.0 | 3 | 5% | 8 |
| stf.PanzerGeneral 0.1 | 2 | 3% | 4 |
| amk.jointstrike.JointStrike 0.2 | 1 | 2% | 2 |
| sample.Crazy 1.0 | 0 | 0% | 1 |
| wompi.Quokka 1.6 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 149739 melee ticks, 48557 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 47 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 50045 sent, 45291 reached their opponent, 8795 virtual hits (19.4% of those reached).

## Melee bench: F45

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478555. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 161 over 6 battles (26.8 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 88.4 | 107 / 210 | 2.04 | 19.9% | 34128 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 19.9% | 107 |
| jje.BagPuss 1.2 | 2.5 | 12.7% | 8 |
| eem.IWillFireNoBullet v2.8 | 3.2 | 11.7% | 73 |
| myl.nano.Graviton 1.10 | 4.0 | 10.8% | 5 |
| sul.Lunar 1.1 | 4.7 | 10.5% | 10 |
| pez.mini.ChironexFleckeri 0.5 | 6.7 | 8.4% | 3 |
| fm.claire 1.7 | 6.7 | 8.5% | 2 |
| hvilela.HVilela 0.9 | 7.3 | 7.9% | 1 |
| wit.Deep7 2.0 | 9.0 | 5.4% | 1 |
| abud.ThirdRobo 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 90.5 | 19 / 35 | 5891 |
| 2 | 1 | 70.9 | 92.7 | 24 / 35 | 5534 |
| 3 | 1 | 68.1 | 83.5 | 13 / 35 | 5369 |
| 4 | 1 | 68.7 | 84.1 | 16 / 35 | 5725 |
| 5 | 1 | 71.0 | 93.3 | 20 / 35 | 5828 |
| 6 | 1 | 69.2 | 86.3 | 15 / 35 | 5781 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 78 | 40% |
| jje.BagPuss 1.2 | 35 | 83% |
| sul.Lunar 1.1 | 20 | 90% |
| myl.nano.Graviton 1.10 | 16 | 94% |
| pez.mini.ChironexFleckeri 0.5 | 10 | 80% |
| wit.Deep7 2.0 | 4 | 100% |
| fm.claire 1.7 | 2 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 1568. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 53 | 51% | 0 |
| jje.BagPuss 1.2 | 20 | 19% | 74 |
| myl.nano.Graviton 1.10 | 10 | 10% | 33 |
| sul.Lunar 1.1 | 6 | 6% | 43 |
| pez.mini.ChironexFleckeri 0.5 | 5 | 5% | 19 |
| fm.claire 1.7 | 5 | 5% | 14 |
| wit.Deep7 2.0 | 2 | 2% | 13 |
| hvilela.HVilela 0.9 | 2 | 2% | 9 |
| abud.ThirdRobo 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 201 rounds): 190418 melee ticks, 85233 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 48 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 57878 sent, 52936 reached their opponent, 7316 virtual hits (13.8% of those reached).

## Melee bench: F46

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1484664. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 109 over 6 battles (18.2 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 90.4 | 131 / 210 | 1.77 | 21.5% | 30396 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.5% | 131 |
| kc.mini.Mirage 0.2 | 2.0 | 19.1% | 62 |
| cx.Princess 1.0 | 3.5 | 12.0% | 12 |
| mz.MicroSheep 1.0 | 3.5 | 12.0% | 3 |
| sadoner.killer 0.2 | 5.0 | 10.6% | 1 |
| arthord.NanoSatanMelee Beta | 6.0 | 9.2% | 0 |
| jeremyreeder.collective.Prophet 5 | 7.0 | 7.0% | 1 |
| kurios.DOSexe .9a | 8.0 | 5.6% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 91.4 | 20 / 35 | 5090 |
| 2 | 1 | 72.0 | 94.6 | 25 / 35 | 5534 |
| 3 | 1 | 68.6 | 87.9 | 20 / 35 | 4583 |
| 4 | 1 | 68.6 | 86.4 | 21 / 35 | 4718 |
| 5 | 1 | 69.9 | 89.6 | 22 / 35 | 5158 |
| 6 | 1 | 71.0 | 92.5 | 23 / 35 | 5313 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 136 | 76% |
| cx.Princess 1.0 | 15 | 67% |
| mz.MicroSheep 1.0 | 8 | 100% |
| arthord.NanoSatanMelee Beta | 5 | 100% |
| sadoner.killer 0.2 | 3 | 100% |
| jeremyreeder.collective.Prophet 5 | 2 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 46 | 58% | 133 |
| sadoner.killer 0.2 | 10 | 13% | 16 |
| cx.Princess 1.0 | 9 | 11% | 23 |
| mz.MicroSheep 1.0 | 7 | 9% | 19 |
| arthord.NanoSatanMelee Beta | 5 | 6% | 10 |
| kurios.DOSexe .9a | 2 | 3% | 4 |
| jeremyreeder.collective.Prophet 5 | 0 | 0% | 2 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 134107 melee ticks, 55334 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 34 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 37293 sent, 32820 reached their opponent, 4940 virtual hits (15.1% of those reached).

