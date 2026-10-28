# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 667 over 8 battles (83.4 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 85.4 | 72 / 280 | 2.31 | 17.0% | 39294 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.7% | 185 |
| hadur2.Hadur 3.18.1aa | 2.0 | 17.0% | 72 |
| sgp.JollyNinja 3.53 | 3.5 | 11.3% | 15 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.6 | 11.6% | 6 |
| mz.MicroGodMelee 1 | 5.1 | 10.0% | 3 |
| lorneswork.Predator 1.0 | 5.8 | 9.4% | 0 |
| adt.Ar2 1.0 | 7.1 | 7.4% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.9% | 0 |
| skm.butterfly 1.0 | 8.9 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.7 | 84.1 | 13 / 35 | 5031 |
| 2 | 2 | 66.5 | 84.8 | 7 / 35 | 4727 |
| 3 | 2 | 67.3 | 87.0 | 11 / 35 | 5070 |
| 4 | 2 | 66.6 | 84.8 | 7 / 35 | 4861 |
| 5 | 2 | 66.3 | 85.7 | 5 / 35 | 4746 |
| 6 | 2 | 68.4 | 89.8 | 10 / 35 | 5409 |
| 7 | 2 | 67.0 | 86.0 | 10 / 35 | 4876 |
| 8 | 2 | 65.3 | 81.0 | 9 / 35 | 4574 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 150 | 9% |
| sgp.JollyNinja 3.53 | 29 | 76% |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 79% |
| mz.MicroGodMelee 1 | 11 | 100% |
| lorneswork.Predator 1.0 | 11 | 100% |
| skm.butterfly 1.0 | 2 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 214 of 280 rounds, at a mean tick of 1157. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 148 | 69% | 167 |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 10% | 35 |
| sgp.JollyNinja 3.53 | 16 | 7% | 33 |
| lorneswork.Predator 1.0 | 13 | 6% | 22 |
| mz.MicroGodMelee 1 | 5 | 2% | 15 |
| adt.Ar2 1.0 | 2 | 1% | 4 |
| mym.EdgeStalker 1.0 | 1 | 0% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 0% | 1 |
| skm.butterfly 1.0 | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 186324 melee ticks, 118239 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 71 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 61264 sent, 54785 reached their opponent, 11236 virtual hits (20.5% of those reached).

## Melee bench: F02

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1068 over 8 battles (133.5 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 85.1 | 121 / 280 | 2.34 | 18.2% | 39234 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.0 | 18.2% | 121 |
| pulsar.PulsarMax 0.8.9 | 2.4 | 14.3% | 64 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.6 | 13.3% | 41 |
| lrem.micro.SpikeSoldier 0.4 | 4.4 | 11.0% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.5% | 23 |
| sch.Simone 0.3d | 6.8 | 7.9% | 14 |
| Noran.BitchingElk 0.054 | 6.9 | 8.0% | 15 |
| fnc.bandit.Bandit 5.2.0 | 7.3 | 8.0% | 3 |
| stelo.PatternRobot 1.0 | 9.0 | 5.4% | 2 |
| fullsail.SweetTea 1.1 | 10.0 | 3.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 84.1 | 15 / 35 | 5030 |
| 2 | 1 | 68.0 | 85.4 | 22 / 35 | 4687 |
| 3 | 1 | 68.3 | 86.7 | 16 / 35 | 4897 |
| 4 | 1 | 68.6 | 88.6 | 15 / 35 | 5222 |
| 5 | 1 | 63.7 | 75.6 | 9 / 35 | 4215 |
| 6 | 1 | 66.7 | 82.9 | 8 / 35 | 5021 |
| 7 | 1 | 69.1 | 88.9 | 19 / 35 | 5005 |
| 8 | 1 | 69.3 | 88.9 | 17 / 35 | 5157 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 66 | 52% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 48 | 69% |
| sch.Simone 0.3d | 26 | 62% |
| com.cohesiva.robocode.ManOwaR 1.0 | 19 | 42% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 94% |
| Noran.BitchingElk 0.054 | 13 | 46% |
| stelo.PatternRobot 1.0 | 5 | 100% |
| fnc.bandit.Bandit 5.2.0 | 4 | 75% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 167 of 280 rounds, at a mean tick of 1009. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 56 | 34% | 82 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 35 | 21% | 76 |
| com.cohesiva.robocode.ManOwaR 1.0 | 24 | 14% | 39 |
| sch.Simone 0.3d | 16 | 10% | 28 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 7% | 20 |
| Noran.BitchingElk 0.054 | 10 | 6% | 19 |
| stelo.PatternRobot 1.0 | 3 | 2% | 7 |
| fnc.bandit.Bandit 5.2.0 | 2 | 1% | 5 |
| fullsail.SweetTea 1.1 | 2 | 1% | 3 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 230453 melee ticks, 55982 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 51 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 2.

Targeting waves (272 rounds): 81696 sent, 75155 reached their opponent, 12985 virtual hits (17.3% of those reached).

## Melee bench: F03

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 377 over 8 battles (47.1 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 91.7 | 215 / 280 | 1.75 | 20.4% | 49019 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.0 | 20.4% | 215 |
| radnor.DoctorBob 1.42 | 2.4 | 13.9% | 23 |
| kawigi.nano.Lib 1.0 | 3.0 | 13.0% | 14 |
| vuen.Cake 2.51 | 3.6 | 12.6% | 25 |
| urdos.URDOS 1.3 | 5.3 | 9.0% | 3 |
| adt.Ar1 2.1 | 6.1 | 7.6% | 0 |
| oa.weak.FlyMk1 0.1 | 7.1 | 6.7% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.8 | 6.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.9 | 5.6% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.9 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 95.2 | 32 / 35 | 6166 |
| 2 | 1 | 71.0 | 93.0 | 27 / 35 | 6339 |
| 3 | 1 | 69.7 | 91.1 | 22 / 35 | 5890 |
| 4 | 1 | 72.2 | 97.5 | 31 / 35 | 6534 |
| 5 | 1 | 69.8 | 89.8 | 25 / 35 | 5786 |
| 6 | 1 | 70.1 | 90.5 | 26 / 35 | 6051 |
| 7 | 1 | 70.1 | 89.8 | 26 / 35 | 5932 |
| 8 | 1 | 69.8 | 86.7 | 26 / 35 | 6321 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 98 | 90% |
| radnor.DoctorBob 1.42 | 71 | 97% |
| kawigi.nano.Lib 1.0 | 46 | 96% |
| oa.weak.FlyMk1 0.1 | 8 | 100% |
| urdos.URDOS 1.3 | 3 | 67% |
| adt.Ar1 2.1 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 67 of 280 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 20 | 30% | 79 |
| vuen.Cake 2.51 | 16 | 24% | 97 |
| kawigi.nano.Lib 1.0 | 15 | 22% | 59 |
| urdos.URDOS 1.3 | 9 | 13% | 15 |
| bwbaugh.nano.Tirunculus 0.0.0a | 3 | 4% | 2 |
| adt.Ar1 2.1 | 2 | 3% | 10 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 11 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 4 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 268 rounds): 168443 melee ticks, 51891 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (268 rounds): longest scan gap while four or more were alive 48 ticks (268 rounds over 8); rounds whose longest gap at any count was over 8: 268; robots dropped as dead without a death event: 1.

Targeting waves (268 rounds): 51986 sent, 45928 reached their opponent, 12109 virtual hits (26.4% of those reached).

## Melee bench: F04

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 512 over 8 battles (64.0 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 85.5 | 35 / 280 | 2.30 | 17.3% | 43072 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.4% | 217 |
| hadur2.Hadur 3.18.1aa | 2.0 | 17.3% | 35 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.6% | 14 |
| TNT.TNT 0.99.1 | 4.0 | 11.2% | 11 |
| josago.Jorgito 0.16 | 5.0 | 8.8% | 3 |
| css.Delitioner 0.11 | 6.4 | 7.4% | 0 |
| tj.zombie1n 1.0.1 | 6.8 | 6.8% | 0 |
| rampancy.Durandal 2.1d | 7.9 | 5.4% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.6% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.9 | 81.6 | 4 / 35 | 5437 |
| 2 | 2 | 67.6 | 85.4 | 5 / 35 | 5289 |
| 3 | 2 | 67.4 | 85.1 | 2 / 35 | 5204 |
| 4 | 2 | 68.8 | 87.6 | 6 / 35 | 5617 |
| 5 | 2 | 68.4 | 86.3 | 7 / 35 | 5500 |
| 6 | 2 | 67.0 | 83.2 | 3 / 35 | 5245 |
| 7 | 2 | 68.0 | 88.3 | 5 / 35 | 5258 |
| 8 | 2 | 68.3 | 86.7 | 3 / 35 | 5522 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 166 | 7% |
| apc.LeeroyJenkins2 1.0 | 18 | 67% |
| TNT.TNT 0.99.1 | 16 | 50% |
| josago.Jorgito 0.16 | 3 | 67% |
| tj.zombie1n 1.0.1 | 1 | 100% |

Hadur died in 249 of 280 rounds, at a mean tick of 1320. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 177 | 71% | 191 |
| apc.LeeroyJenkins2 1.0 | 32 | 13% | 43 |
| TNT.TNT 0.99.1 | 22 | 9% | 30 |
| josago.Jorgito 0.16 | 10 | 4% | 12 |
| tj.zombie1n 1.0.1 | 2 | 1% | 2 |
| css.Delitioner 0.11 | 2 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 266160 melee ticks, 93798 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 78 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 78 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 3.

Targeting waves (273 rounds): 82355 sent, 75921 reached their opponent, 11638 virtual hits (15.3% of those reached).

## Melee bench: F05

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 964 over 8 battles (120.5 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 76.2 | 25 / 280 | 3.14 | 14.4% | 29123 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.1 | 18.6% | 152 |
| justin.DemonicRage 3.4 | 2.0 | 16.7% | 65 |
| hadur2.Hadur 3.18.1aa | 3.0 | 14.4% | 25 |
| wompi.Numbat 2.1 | 3.9 | 13.1% | 32 |
| ms.Ares 0.19 | 5.1 | 9.3% | 1 |
| axeBots.HataMoto 3.09 | 5.9 | 8.9% | 5 |
| supersample.SuperBoxBot 1.0 | 7.1 | 5.7% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.1 | 5.2% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.4 | 4.2% | 0 |
| GarmBox.Oranges 1.0 | 9.4 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.5 | 76.2 | 4 / 35 | 3517 |
| 2 | 3 | 62.8 | 73.7 | 3 / 35 | 3810 |
| 3 | 3 | 63.3 | 77.8 | 2 / 35 | 3833 |
| 4 | 4 | 61.6 | 74.0 | 2 / 35 | 3369 |
| 5 | 3 | 62.8 | 75.9 | 3 / 35 | 3445 |
| 6 | 3 | 62.3 | 74.6 | 4 / 35 | 3469 |
| 7 | 3 | 62.3 | 75.2 | 2 / 35 | 3590 |
| 8 | 2 | 65.4 | 82.5 | 5 / 35 | 4090 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 54 | 9% |
| justin.DemonicRage 3.4 | 43 | 26% |
| wompi.Numbat 2.1 | 12 | 50% |
| ms.Ares 0.19 | 2 | 100% |
| axeBots.HataMoto 3.09 | 2 | 50% |

Hadur died in 264 of 280 rounds, at a mean tick of 915. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 97 | 37% | 107 |
| cb.fire.Firestarter 2.0f | 93 | 35% | 101 |
| wompi.Numbat 2.1 | 44 | 17% | 46 |
| ms.Ares 0.19 | 10 | 4% | 13 |
| axeBots.HataMoto 3.09 | 7 | 3% | 7 |
| supersample.SuperBoxBot 1.0 | 3 | 1% | 3 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 3 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 277 rounds): 209835 melee ticks, 43964 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (277 rounds): longest scan gap while four or more were alive 72 ticks (277 rounds over 8); rounds whose longest gap at any count was over 8: 277; robots dropped as dead without a death event: 0.

Targeting waves (277 rounds): 65887 sent, 59128 reached their opponent, 10100 virtual hits (17.1% of those reached).

## Melee bench: F06

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 506 over 8 battles (63.3 per battle, most in one battle 144). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 88.7 | 170 / 280 | 2.01 | 19.2% | 41482 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.0 | 19.2% | 170 |
| jekl.StoneGhost 0.7 | 2.1 | 14.9% | 35 |
| origin.SleepSiphon 1.7b | 3.1 | 13.1% | 48 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.1 | 11.7% | 13 |
| mld.Wisdom 1.0 | 4.8 | 10.5% | 5 |
| gg.Wolverine 2.0 | 5.9 | 8.7% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 6.7% | 5 |
| spinnercat.Omen 1.0 | 8.1 | 6.4% | 0 |
| DBall.NUKE 0.1 | 8.4 | 6.0% | 0 |
| sample.Fire 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 89.2 | 22 / 35 | 5088 |
| 2 | 1 | 69.4 | 89.5 | 19 / 35 | 5113 |
| 3 | 1 | 67.0 | 82.2 | 17 / 35 | 4622 |
| 4 | 1 | 70.5 | 92.7 | 23 / 35 | 5346 |
| 5 | 1 | 69.7 | 87.9 | 23 / 35 | 5400 |
| 6 | 1 | 70.9 | 92.1 | 25 / 35 | 5670 |
| 7 | 1 | 69.8 | 89.8 | 22 / 35 | 5262 |
| 8 | 1 | 68.7 | 86.3 | 19 / 35 | 4981 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 85 | 80% |
| origin.SleepSiphon 1.7b | 50 | 72% |
| pe.minimelee.SandboxMiniMelee 1.1 | 34 | 82% |
| gg.Wolverine 2.0 | 21 | 90% |
| ers.nano.hawk.HawkLA 3.0m | 11 | 73% |
| mld.Wisdom 1.0 | 9 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 115 of 280 rounds, at a mean tick of 853. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 44 | 38% | 92 |
| origin.SleepSiphon 1.7b | 35 | 30% | 82 |
| pe.minimelee.SandboxMiniMelee 1.1 | 11 | 10% | 38 |
| mld.Wisdom 1.0 | 10 | 9% | 23 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 4% | 18 |
| gg.Wolverine 2.0 | 5 | 4% | 17 |
| spinnercat.Omen 1.0 | 1 | 1% | 4 |
| DBall.NUKE 0.1 | 0 | 0% | 6 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 194347 melee ticks, 57487 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 48 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 2.

Targeting waves (274 rounds): 62403 sent, 56065 reached their opponent, 12715 virtual hits (22.7% of those reached).

## Melee bench: F07

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 682 over 8 battles (85.3 per battle, most in one battle 207). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 92.0 | 144 / 280 | 1.72 | 20.2% | 50063 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.1 | 20.2% | 144 |
| rsalesc.melee.Monk 0.3.6c | 2.1 | 16.9% | 62 |
| rtk.Tachikoma 1.0 | 2.8 | 16.1% | 38 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.4% | 14 |
| franzor.Lizt 1.3.1 | 4.8 | 10.9% | 22 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.3% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.4% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.4 | 2.2% | 0 |
| drd.Dreadknoght 0.9 | 9.6 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 92.1 | 20 / 35 | 6238 |
| 2 | 1 | 73.3 | 94.9 | 21 / 35 | 6605 |
| 3 | 1 | 72.5 | 95.2 | 22 / 35 | 5978 |
| 4 | 1 | 71.3 | 90.2 | 17 / 35 | 6212 |
| 5 | 2 | 70.5 | 89.2 | 11 / 35 | 5782 |
| 6 | 1 | 71.5 | 90.8 | 17 / 35 | 6289 |
| 7 | 1 | 71.4 | 91.7 | 16 / 35 | 6326 |
| 8 | 1 | 72.3 | 92.1 | 20 / 35 | 6633 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 100 | 70% |
| rsalesc.melee.Monk 0.3.6c | 65 | 18% |
| oog.melee.CapuletDroid 1.1 | 43 | 79% |
| franzor.Lizt 1.3.1 | 39 | 69% |

Hadur died in 142 of 280 rounds, at a mean tick of 1452. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 58 | 41% | 91 |
| rtk.Tachikoma 1.0 | 46 | 32% | 132 |
| oog.melee.CapuletDroid 1.1 | 17 | 12% | 55 |
| franzor.Lizt 1.3.1 | 15 | 11% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 260280 melee ticks, 122348 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 607 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 295 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 1.

Targeting waves (274 rounds): 78182 sent, 71748 reached their opponent, 14764 virtual hits (20.6% of those reached).

## Melee bench: F08

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1139 over 8 battles (142.4 per battle, most in one battle 152). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 87.9 | 163 / 280 | 2.09 | 18.7% | 38349 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.0 | 18.7% | 163 |
| tm.Yuugao 1.0 | 2.4 | 13.4% | 48 |
| shrub.Vapour v159 | 2.8 | 12.8% | 32 |
| Krabb.sliNk.Garm 0.9u | 3.9 | 11.3% | 23 |
| com.spp.robocode.MostlyHarmless 010 | 5.4 | 9.7% | 11 |
| m3thos.Eva00 1.1 | 5.6 | 8.9% | 4 |
| jwst.DAD.DarkAndDarker 1.1 | 7.4 | 7.5% | 1 |
| qualidafial.MajorDick 1.0.1 | 7.8 | 6.8% | 0 |
| SHAM.WOW 1.4 | 9.1 | 5.8% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 88.9 | 21 / 35 | 4769 |
| 2 | 1 | 68.1 | 87.3 | 20 / 35 | 4704 |
| 3 | 1 | 69.4 | 90.5 | 22 / 35 | 5102 |
| 4 | 1 | 67.8 | 86.3 | 21 / 35 | 4741 |
| 5 | 1 | 69.5 | 89.8 | 25 / 35 | 5064 |
| 6 | 1 | 67.1 | 84.4 | 17 / 35 | 4635 |
| 7 | 1 | 66.9 | 85.7 | 17 / 35 | 4404 |
| 8 | 1 | 68.8 | 89.8 | 20 / 35 | 4930 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 73 | 73% |
| shrub.Vapour v159 | 45 | 67% |
| Krabb.sliNk.Garm 0.9u | 33 | 79% |
| com.spp.robocode.MostlyHarmless 010 | 32 | 88% |
| jwst.DAD.DarkAndDarker 1.1 | 10 | 90% |
| m3thos.Eva00 1.1 | 9 | 100% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 126 of 280 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 37 | 29% | 90 |
| shrub.Vapour v159 | 30 | 24% | 61 |
| Krabb.sliNk.Garm 0.9u | 24 | 19% | 53 |
| com.spp.robocode.MostlyHarmless 010 | 14 | 11% | 35 |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 5% | 15 |
| m3thos.Eva00 1.1 | 4 | 3% | 13 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 3 |
| SHAM.WOW 1.4 | 1 | 1% | 5 |
| zyx.nano.BacillusComma 1.0 | 0 | 0% | 2 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 197600 melee ticks, 59668 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 67 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 67 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 0.

Targeting waves (276 rounds): 66114 sent, 59584 reached their opponent, 11322 virtual hits (19.0% of those reached).

## Melee bench: F09

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 773 over 8 battles (96.6 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 72.7 | 59 / 280 | 3.46 | 14.3% | 26831 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.0% | 148 |
| hadur2.Hadur 3.18.1aa | 2.4 | 14.3% | 59 |
| kc.micro.Figment 1.0 | 2.6 | 14.1% | 40 |
| yagami.Tidus 0.11 | 4.6 | 10.7% | 2 |
| pedersen.Grishnakh 1.0 | 5.0 | 10.2% | 16 |
| mc2.enemy.Original 0.9 | 5.6 | 9.2% | 13 |
| dft.Calliope 5.6 | 6.8 | 8.1% | 2 |
| step.nanoPri 1.0 | 8.3 | 5.9% | 0 |
| rdm.Dueler 0.4x | 9.3 | 4.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 78.4 | 8 / 35 | 3607 |
| 2 | 3 | 61.0 | 70.8 | 9 / 35 | 3224 |
| 3 | 3 | 61.6 | 71.1 | 5 / 35 | 3496 |
| 4 | 2 | 61.9 | 73.3 | 6 / 35 | 3285 |
| 5 | 2 | 63.9 | 76.5 | 9 / 35 | 3668 |
| 6 | 2 | 62.4 | 73.7 | 8 / 35 | 3568 |
| 7 | 2 | 62.4 | 74.3 | 10 / 35 | 3027 |
| 8 | 3 | 57.4 | 63.2 | 4 / 35 | 2956 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 57 | 18% |
| kc.micro.Figment 1.0 | 34 | 76% |
| mc2.enemy.Original 0.9 | 16 | 63% |
| pedersen.Grishnakh 1.0 | 6 | 50% |
| yagami.Tidus 0.11 | 6 | 83% |
| dft.Calliope 5.6 | 4 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 227 of 280 rounds, at a mean tick of 809. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 87 | 38% | 102 |
| kc.micro.Figment 1.0 | 37 | 16% | 62 |
| yagami.Tidus 0.11 | 33 | 15% | 38 |
| mc2.enemy.Original 0.9 | 26 | 11% | 34 |
| pedersen.Grishnakh 1.0 | 16 | 7% | 17 |
| dft.Calliope 5.6 | 8 | 4% | 12 |
| robar.nano.Assertive_Melee 0.2 | 8 | 4% | 8 |
| step.nanoPri 1.0 | 3 | 1% | 4 |
| rdm.Dueler 0.4x | 3 | 1% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 278 rounds): 193812 melee ticks, 48444 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (278 rounds): longest scan gap while four or more were alive 54 ticks (278 rounds over 8); rounds whose longest gap at any count was over 8: 278; robots dropped as dead without a death event: 0.

Targeting waves (278 rounds): 65394 sent, 58862 reached their opponent, 8518 virtual hits (14.5% of those reached).

## Melee bench: F10

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 232 over 8 battles (29.0 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 94.8 | 225 / 280 | 1.47 | 20.7% | 45700 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.0 | 20.7% | 225 |
| DTF.Kludgy 1.2b | 2.3 | 14.1% | 28 |
| ne.Chimera 1.2 | 3.3 | 12.3% | 7 |
| ejb.Polaris 1.0.1 | 3.5 | 12.0% | 10 |
| vStar.RAFzilla 2.15 | 5.4 | 10.5% | 7 |
| tvv.micro.Antares 1.1.1 | 5.6 | 10.1% | 3 |
| kurios.DOSexe .9b | 7.9 | 5.7% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.1 | 5.3% | 0 |
| sam.Samspin 1.0 | 8.6 | 4.9% | 0 |
| donjezza.Muncho 1.0 | 9.4 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 94.9 | 28 / 35 | 5242 |
| 2 | 1 | 71.2 | 97.1 | 28 / 35 | 5681 |
| 3 | 1 | 70.7 | 93.3 | 26 / 35 | 5417 |
| 4 | 1 | 72.5 | 98.4 | 32 / 35 | 5945 |
| 5 | 1 | 71.4 | 93.3 | 30 / 35 | 5901 |
| 6 | 1 | 71.2 | 93.7 | 25 / 35 | 5966 |
| 7 | 1 | 70.3 | 91.7 | 26 / 35 | 5434 |
| 8 | 1 | 71.8 | 95.9 | 30 / 35 | 6114 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 76 | 86% |
| ejb.Polaris 1.0.1 | 64 | 97% |
| ne.Chimera 1.2 | 39 | 90% |
| vStar.RAFzilla 2.15 | 35 | 94% |
| tvv.micro.Antares 1.1.1 | 20 | 95% |
| donjezza.Muncho 1.0 | 5 | 100% |
| kurios.DOSexe .9b | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 56 of 280 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 23 | 41% | 80 |
| ejb.Polaris 1.0.1 | 9 | 16% | 74 |
| ne.Chimera 1.2 | 8 | 14% | 38 |
| vStar.RAFzilla 2.15 | 6 | 11% | 38 |
| kurios.DOSexe .9b | 2 | 4% | 18 |
| donjezza.Muncho 1.0 | 2 | 4% | 9 |
| sam.Samspin 1.0 | 2 | 4% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 4% | 5 |
| tvv.micro.Antares 1.1.1 | 1 | 2% | 13 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 270 rounds): 192566 melee ticks, 80108 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (270 rounds): longest scan gap while four or more were alive 47 ticks (270 rounds over 8); rounds whose longest gap at any count was over 8: 270; robots dropped as dead without a death event: 4.

Targeting waves (270 rounds): 64176 sent, 57921 reached their opponent, 11350 virtual hits (19.6% of those reached).

## Melee bench: F11

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 486 over 8 battles (60.8 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 79.3 | 92 / 280 | 2.86 | 15.9% | 29899 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.5 | 15.9% | 92 |
| rz.Aleph 0.34 | 1.6 | 16.1% | 82 |
| cx.mini.Nimrod 0.55 | 2.9 | 12.6% | 36 |
| djc.DynaBot 0.1.1 | 4.1 | 10.9% | 19 |
| rdt199.Warlord 0.73 | 5.3 | 9.9% | 21 |
| br2.MobyDickBot 1.6 | 6.5 | 8.7% | 19 |
| uji.YellohFellah 1.0 | 6.8 | 8.2% | 12 |
| KiraNL.Chupacabra 0.4 | 7.4 | 7.5% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.3% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 77.5 | 11 / 35 | 3578 |
| 2 | 1 | 65.0 | 81.3 | 14 / 35 | 3691 |
| 3 | 1 | 63.6 | 78.7 | 11 / 35 | 3804 |
| 4 | 1 | 64.6 | 80.0 | 13 / 35 | 3774 |
| 5 | 2 | 63.8 | 78.4 | 9 / 35 | 3721 |
| 6 | 2 | 64.1 | 77.8 | 11 / 35 | 3900 |
| 7 | 1 | 66.0 | 86.3 | 14 / 35 | 3854 |
| 8 | 2 | 62.2 | 74.6 | 9 / 35 | 3577 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 61 | 48% |
| cx.mini.Nimrod 0.55 | 24 | 58% |
| djc.DynaBot 0.1.1 | 22 | 64% |
| rdt199.Warlord 0.73 | 22 | 64% |
| br2.MobyDickBot 1.6 | 17 | 53% |
| uji.YellohFellah 1.0 | 9 | 89% |
| KiraNL.Chupacabra 0.4 | 4 | 75% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 192 of 280 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 69 | 36% | 111 |
| cx.mini.Nimrod 0.55 | 48 | 25% | 60 |
| rdt199.Warlord 0.73 | 20 | 10% | 31 |
| djc.DynaBot 0.1.1 | 17 | 9% | 27 |
| uji.YellohFellah 1.0 | 16 | 8% | 25 |
| br2.MobyDickBot 1.6 | 10 | 5% | 14 |
| KiraNL.Chupacabra 0.4 | 6 | 3% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 1% | 2 |
| stelo.MirrorNano 1.3 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 277 rounds): 206329 melee ticks, 53262 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (277 rounds): longest scan gap while four or more were alive 38 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 1.

Targeting waves (277 rounds): 69575 sent, 62943 reached their opponent, 8879 virtual hits (14.1% of those reached).

## Melee bench: F12

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 928 over 8 battles (116.0 per battle, most in one battle 146). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 86.2 | 156 / 280 | 2.25 | 18.0% | 31773 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.0 | 18.0% | 156 |
| bts.wiki.RipCurl 0.9b | 2.8 | 13.3% | 35 |
| nat.PallasHawk 1.0 | 2.9 | 13.1% | 34 |
| darkcanuck.Leon 1.01 | 3.6 | 12.7% | 30 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.7% | 16 |
| jrm.Test0 1.0 | 6.3 | 8.3% | 3 |
| jp.Perpy 16.0 | 7.5 | 6.6% | 1 |
| cs.sheldor.Talon 1.1 | 7.9 | 6.4% | 0 |
| stuff.Vlad 0.1 | 9.0 | 5.6% | 2 |
| jaybot.bots.Oddball 4.0 | 9.4 | 5.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 88.3 | 23 / 35 | 4018 |
| 2 | 1 | 67.0 | 82.9 | 19 / 35 | 4387 |
| 3 | 1 | 68.2 | 91.7 | 19 / 35 | 3786 |
| 4 | 1 | 68.6 | 89.8 | 21 / 35 | 4138 |
| 5 | 1 | 67.3 | 85.7 | 17 / 35 | 4118 |
| 6 | 1 | 65.4 | 79.4 | 19 / 35 | 3654 |
| 7 | 1 | 67.9 | 88.3 | 21 / 35 | 3906 |
| 8 | 1 | 66.0 | 83.2 | 17 / 35 | 3766 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 63 | 70% |
| darkcanuck.Leon 1.01 | 57 | 84% |
| bts.wiki.RipCurl 0.9b | 48 | 79% |
| brainfade.melee.Genghis 0.36 | 19 | 74% |
| jaybot.bots.Oddball 4.0 | 10 | 80% |
| jrm.Test0 1.0 | 3 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 131 of 280 rounds, at a mean tick of 713. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 32 | 24% | 58 |
| nat.PallasHawk 1.0 | 30 | 23% | 87 |
| darkcanuck.Leon 1.01 | 18 | 14% | 68 |
| brainfade.melee.Genghis 0.36 | 17 | 13% | 28 |
| jrm.Test0 1.0 | 16 | 12% | 19 |
| cs.sheldor.Talon 1.1 | 3 | 2% | 6 |
| jaybot.bots.Oddball 4.0 | 3 | 2% | 6 |
| jp.Perpy 16.0 | 3 | 2% | 5 |
| stuff.Vlad 0.1 | 2 | 2% | 3 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 176679 melee ticks, 50216 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 92 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 92 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 1.

Targeting waves (276 rounds): 61983 sent, 55254 reached their opponent, 9378 virtual hits (17.0% of those reached).

## Melee bench: F13

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 222 over 8 battles (27.8 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 79.7 | 62 / 280 | 2.83 | 15.4% | 32633 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.3 | 17.3% | 128 |
| ags.Glacier 0.2.11 | 2.0 | 16.3% | 54 |
| hadur2.Hadur 3.18.1aa | 2.8 | 15.4% | 62 |
| shinh.Entangled 0.3 | 4.4 | 11.8% | 23 |
| gh.micro.Gruweltje 0.7 | 4.6 | 11.8% | 13 |
| apc.Colossus2 0.17 | 6.1 | 8.2% | 0 |
| stelo.Wang 1.0 | 7.1 | 6.6% | 1 |
| ayk.WallHugger 1.0 | 8.0 | 5.0% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.5% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.1 | 76.8 | 10 / 35 | 4020 |
| 2 | 3 | 64.6 | 80.3 | 6 / 35 | 4177 |
| 3 | 3 | 63.5 | 76.8 | 8 / 35 | 3847 |
| 4 | 2 | 65.3 | 82.2 | 6 / 35 | 4312 |
| 5 | 3 | 64.4 | 79.7 | 8 / 35 | 4004 |
| 6 | 3 | 65.1 | 83.5 | 9 / 35 | 3892 |
| 7 | 2 | 64.3 | 79.4 | 8 / 35 | 4110 |
| 8 | 3 | 64.2 | 79.0 | 7 / 35 | 4271 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 75 | 19% |
| ags.Glacier 0.2.11 | 52 | 60% |
| shinh.Entangled 0.3 | 21 | 43% |
| gh.micro.Gruweltje 0.7 | 16 | 44% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 220 of 280 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 81 | 37% | 96 |
| ags.Glacier 0.2.11 | 65 | 30% | 95 |
| shinh.Entangled 0.3 | 27 | 12% | 32 |
| gh.micro.Gruweltje 0.7 | 26 | 12% | 35 |
| stelo.Wang 1.0 | 8 | 4% | 10 |
| maribo.FollowFire 1 | 5 | 2% | 5 |
| apc.Colossus2 0.17 | 4 | 2% | 5 |
| ayk.WallHugger 1.0 | 2 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 277 rounds): 196883 melee ticks, 58997 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (277 rounds): longest scan gap while four or more were alive 79 ticks (277 rounds over 8); rounds whose longest gap at any count was over 8: 277; robots dropped as dead without a death event: 2.

Targeting waves (277 rounds): 58448 sent, 51666 reached their opponent, 8548 virtual hits (16.5% of those reached).

## Melee bench: F14

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 580 over 8 battles (72.5 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 93.7 | 211 / 280 | 1.57 | 20.6% | 45754 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.0 | 20.6% | 211 |
| simonton.micro.Sprout 1.1.3 | 2.1 | 14.3% | 14 |
| catcat20.shape.Theta 0.018 | 2.9 | 12.4% | 32 |
| sanyi.mikrobi.Roberto 1.0 | 4.6 | 10.0% | 8 |
| Lo_Ian.Gandalf_V4 4.0 | 5.5 | 9.4% | 4 |
| co.edu.usb.rc.LidisTron 1.0 | 5.6 | 9.2% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.8 | 8.4% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 7.7% | 8 |
| pa.Improved 1.0 | 9.0 | 6.1% | 2 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 98.7 | 31 / 35 | 5591 |
| 2 | 1 | 70.4 | 91.1 | 26 / 35 | 5569 |
| 3 | 1 | 69.1 | 86.3 | 21 / 35 | 5452 |
| 4 | 1 | 70.6 | 92.7 | 27 / 35 | 5493 |
| 5 | 1 | 71.6 | 94.3 | 27 / 35 | 5888 |
| 6 | 1 | 72.3 | 97.1 | 28 / 35 | 6163 |
| 7 | 1 | 70.3 | 91.7 | 22 / 35 | 5796 |
| 8 | 1 | 72.0 | 97.5 | 29 / 35 | 5802 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 95 | 94% |
| catcat20.shape.Theta 0.018 | 81 | 74% |
| sanyi.mikrobi.Roberto 1.0 | 22 | 86% |
| sheldor.micro.PointInLineRRAL 1.0 | 20 | 75% |
| co.edu.usb.rc.LidisTron 1.0 | 14 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 6 | 83% |
| pa.Improved 1.0 | 5 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |

Hadur died in 73 of 280 rounds, at a mean tick of 943. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 26 | 36% | 79 |
| simonton.micro.Sprout 1.1.3 | 18 | 25% | 97 |
| sanyi.mikrobi.Roberto 1.0 | 9 | 12% | 41 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 11% | 25 |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 4% | 15 |
| pa.Improved 1.0 | 2 | 3% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 3% | 4 |
| sample.TrackFire 1.0 | 1 | 1% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 0 | 0% | 8 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 192066 melee ticks, 72130 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 50 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 3.

Targeting waves (274 rounds): 61188 sent, 54961 reached their opponent, 13664 virtual hits (24.9% of those reached).

## Melee bench: F15

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 593 over 8 battles (74.1 per battle, most in one battle 152). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 85.1 | 139 / 280 | 2.34 | 18.2% | 39604 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.0 | 18.2% | 139 |
| kawigi.micro.Shiz 1.1 | 2.3 | 13.8% | 28 |
| emp.Yngwie 1.11 | 3.0 | 13.0% | 61 |
| mld.DustBunny 3.8 | 3.9 | 12.4% | 18 |
| cb.nano.Insomnia 1.0 | 4.9 | 10.7% | 14 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.3% | 18 |
| lambdaxy.TBot 0.1 | 7.5 | 6.5% | 0 |
| Grystrion.TrackerWO 1.0 | 7.6 | 6.6% | 2 |
| divineomega.TrialBot 0.003 | 9.0 | 5.1% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.9 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 87.6 | 18 / 35 | 5223 |
| 2 | 1 | 68.7 | 88.9 | 18 / 35 | 4787 |
| 3 | 1 | 67.8 | 84.4 | 20 / 35 | 4666 |
| 4 | 1 | 65.1 | 78.1 | 12 / 35 | 4599 |
| 5 | 1 | 67.9 | 84.8 | 18 / 35 | 4910 |
| 6 | 1 | 68.4 | 83.5 | 19 / 35 | 5253 |
| 7 | 1 | 67.3 | 84.8 | 15 / 35 | 4992 |
| 8 | 1 | 68.6 | 88.6 | 19 / 35 | 5174 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 66 | 62% |
| mld.DustBunny 3.8 | 40 | 93% |
| kawigi.micro.Shiz 1.1 | 33 | 88% |
| kawigi.robot.Girl 1.2 | 21 | 76% |
| cb.nano.Insomnia 1.0 | 14 | 71% |
| divineomega.TrialBot 0.003 | 3 | 100% |
| Grystrion.TrackerWO 1.0 | 2 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 146 of 280 rounds, at a mean tick of 952. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 50 | 34% | 105 |
| mld.DustBunny 3.8 | 24 | 16% | 59 |
| cb.nano.Insomnia 1.0 | 24 | 16% | 28 |
| kawigi.micro.Shiz 1.1 | 18 | 12% | 46 |
| kawigi.robot.Girl 1.2 | 13 | 9% | 16 |
| Grystrion.TrackerWO 1.0 | 7 | 5% | 10 |
| divineomega.TrialBot 0.003 | 3 | 2% | 10 |
| lambdaxy.TBot 0.1 | 2 | 1% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 277 rounds): 223681 melee ticks, 58007 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (277 rounds): longest scan gap while four or more were alive 62 ticks (277 rounds over 8); rounds whose longest gap at any count was over 8: 277; robots dropped as dead without a death event: 1.

Targeting waves (277 rounds): 74263 sent, 67674 reached their opponent, 11420 virtual hits (16.9% of those reached).

## Melee bench: F16

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 580 over 8 battles (72.5 per battle, most in one battle 147). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 86.6 | 142 / 280 | 2.21 | 18.8% | 42361 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.0 | 18.8% | 142 |
| gh.Griezel 0.5.2 | 2.0 | 16.1% | 71 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.0% | 5 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 11.1% | 48 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.0% | 6 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 9.3% | 3 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.3% | 2 |
| divineomega.DivineBot 1.9.4.5 | 8.9 | 4.8% | 5 |
| asd.Cthulhu 1.3 | 9.0 | 4.8% | 0 |
| repositorio.NanoStep 1.0 | 9.1 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 88.6 | 19 / 35 | 5059 |
| 2 | 1 | 71.7 | 94.9 | 22 / 35 | 5827 |
| 3 | 1 | 68.8 | 84.4 | 16 / 35 | 5329 |
| 4 | 1 | 69.3 | 88.6 | 17 / 35 | 5410 |
| 5 | 1 | 67.8 | 84.1 | 20 / 35 | 4753 |
| 6 | 1 | 67.3 | 81.9 | 14 / 35 | 5239 |
| 7 | 1 | 68.8 | 86.0 | 18 / 35 | 5354 |
| 8 | 1 | 68.7 | 84.1 | 16 / 35 | 5390 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 96 | 64% |
| techdude.forest.FlamingForest 1.1 | 52 | 54% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 33 | 94% |
| divineomega.DivineBot 1.9.4.5 | 9 | 89% |
| tvv.nano.Polaris 1.2 | 7 | 71% |
| bvh.fnr.Fenrir 0.36l | 7 | 100% |
| stelo.IntrinsicVolatility 1.4 | 2 | 50% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 143 of 280 rounds, at a mean tick of 1118. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 52 | 36% | 118 |
| techdude.forest.FlamingForest 1.1 | 33 | 23% | 66 |
| bvh.fnr.Fenrir 0.36l | 21 | 15% | 27 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 11 | 8% | 31 |
| tvv.nano.Polaris 1.2 | 7 | 5% | 10 |
| stelo.IntrinsicVolatility 1.4 | 6 | 4% | 10 |
| divineomega.DivineBot 1.9.4.5 | 4 | 3% | 11 |
| asd.Cthulhu 1.3 | 4 | 3% | 7 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 241322 melee ticks, 83722 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 39 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 1.

Targeting waves (276 rounds): 78098 sent, 71611 reached their opponent, 12398 virtual hits (17.3% of those reached).

## Melee bench: F17

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1038 over 8 battles (129.8 per battle, most in one battle 148). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 86.3 | 135 / 280 | 2.24 | 18.9% | 44343 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.0 | 18.9% | 135 |
| et.Predator 1.8 | 2.9 | 13.6% | 39 |
| oog.melee.Mercutio 1.0 | 2.9 | 13.5% | 48 |
| cx.BlestPain 1.41 | 3.3 | 12.5% | 48 |
| ahf.NanoAndrew .4 | 5.1 | 10.1% | 4 |
| nic.Nicator 2.4 | 6.4 | 9.0% | 4 |
| maribo.melee.BMV 0.1 | 6.5 | 8.9% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.6% | 1 |
| tex.Longbot 0.4 | 8.5 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 83.8 | 13 / 35 | 4843 |
| 2 | 1 | 70.7 | 89.2 | 20 / 35 | 6078 |
| 3 | 1 | 70.1 | 87.9 | 20 / 35 | 5865 |
| 4 | 1 | 67.9 | 85.1 | 13 / 35 | 5294 |
| 5 | 1 | 68.1 | 83.2 | 15 / 35 | 5553 |
| 6 | 1 | 69.9 | 89.2 | 18 / 35 | 5719 |
| 7 | 1 | 68.6 | 86.0 | 19 / 35 | 5308 |
| 8 | 1 | 69.2 | 85.7 | 17 / 35 | 5683 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 70 | 70% |
| et.Predator 1.8 | 66 | 68% |
| cx.BlestPain 1.41 | 40 | 33% |
| ahf.NanoAndrew .4 | 16 | 88% |
| nic.Nicator 2.4 | 10 | 90% |
| maribo.melee.BMV 0.1 | 4 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 153 of 280 rounds, at a mean tick of 1067. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 45 | 29% | 93 |
| cx.BlestPain 1.41 | 36 | 24% | 58 |
| oog.melee.Mercutio 1.0 | 31 | 20% | 69 |
| ahf.NanoAndrew .4 | 21 | 14% | 33 |
| maribo.melee.BMV 0.1 | 5 | 3% | 8 |
| nic.Nicator 2.4 | 3 | 2% | 13 |
| tex.Longbot 0.4 | 3 | 2% | 3 |
| goblin.Bender 2.4 | 1 | 1% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 2 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 221900 melee ticks, 79516 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 40 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 0.

Targeting waves (275 rounds): 74023 sent, 67749 reached their opponent, 14563 virtual hits (21.5% of those reached).

## Melee bench: F18

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 664 over 8 battles (83.0 per battle, most in one battle 161). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 88.8 | 160 / 280 | 2.00 | 18.8% | 37318 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.0 | 18.8% | 160 |
| morbid.MorbidPriest 1.0 | 2.0 | 14.1% | 46 |
| agd.Mooserwirt2 2.7 | 3.4 | 12.5% | 29 |
| uji.DBH 1.1 | 3.6 | 11.5% | 18 |
| spinnercat.Robovirus 2.718 | 5.3 | 9.2% | 7 |
| sigterm.Sigterm 1.0 | 6.0 | 8.4% | 11 |
| ratosh.Nobo 0.21 | 6.8 | 8.3% | 4 |
| kawigi.mini.Fhqwhgads 1.1 | 8.1 | 6.8% | 0 |
| stelo.WangRobot 1.0 | 9.1 | 5.4% | 4 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 87.9 | 18 / 35 | 4794 |
| 2 | 1 | 67.7 | 87.9 | 21 / 35 | 4440 |
| 3 | 1 | 69.1 | 90.5 | 21 / 35 | 4745 |
| 4 | 1 | 68.3 | 89.2 | 16 / 35 | 4777 |
| 5 | 1 | 69.6 | 91.7 | 25 / 35 | 4738 |
| 6 | 1 | 67.1 | 85.1 | 17 / 35 | 4661 |
| 7 | 1 | 67.9 | 87.9 | 19 / 35 | 4606 |
| 8 | 1 | 68.9 | 90.5 | 23 / 35 | 4557 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 85 | 71% |
| uji.DBH 1.1 | 38 | 79% |
| agd.Mooserwirt2 2.7 | 36 | 78% |
| sigterm.Sigterm 1.0 | 23 | 87% |
| spinnercat.Robovirus 2.718 | 14 | 79% |
| stelo.WangRobot 1.0 | 6 | 83% |
| ratosh.Nobo 0.21 | 5 | 40% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 50% |

Hadur died in 123 of 280 rounds, at a mean tick of 798. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 43 | 35% | 103 |
| uji.DBH 1.1 | 19 | 15% | 42 |
| agd.Mooserwirt2 2.7 | 16 | 13% | 49 |
| sigterm.Sigterm 1.0 | 11 | 9% | 25 |
| ratosh.Nobo 0.21 | 9 | 7% | 16 |
| spinnercat.Robovirus 2.718 | 7 | 6% | 19 |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 5% | 10 |
| stelo.WangRobot 1.0 | 5 | 4% | 11 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 3% | 5 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 182994 melee ticks, 58185 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 57 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 1.

Targeting waves (272 rounds): 61792 sent, 55334 reached their opponent, 12172 virtual hits (22.0% of those reached).

## Melee bench: F19

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 290 over 8 battles (36.3 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.4 | 98.2 | 263 / 280 | 1.16 | 22.4% | 48834 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.0 | 22.4% | 263 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.5% | 7 |
| mld.Infinity 2.2 | 3.3 | 12.3% | 7 |
| krillr.mini.JointStrike 2.0.0 | 4.1 | 11.1% | 0 |
| erdnis.Rover 0.3 | 4.6 | 10.9% | 1 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.7% | 1 |
| mbh.Mbh 0.1 | 7.1 | 7.2% | 0 |
| pac.ABC 2.1 | 8.4 | 6.3% | 1 |
| pbg.R2D2 1.0 | 8.5 | 5.5% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 98.1 | 33 / 35 | 6031 |
| 2 | 1 | 73.2 | 97.1 | 32 / 35 | 6086 |
| 3 | 1 | 73.2 | 98.4 | 33 / 35 | 5813 |
| 4 | 1 | 72.3 | 95.6 | 31 / 35 | 5776 |
| 5 | 1 | 73.9 | 99.0 | 33 / 35 | 6352 |
| 6 | 1 | 73.9 | 100.0 | 35 / 35 | 6423 |
| 7 | 1 | 73.5 | 97.8 | 33 / 35 | 6230 |
| 8 | 1 | 73.6 | 99.4 | 33 / 35 | 6123 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 150 | 97% |
| mld.Infinity 2.2 | 36 | 97% |
| krillr.mini.JointStrike 2.0.0 | 26 | 100% |
| erdnis.Rover 0.3 | 24 | 100% |
| patson.PatsonTestBot 1.0 | 15 | 100% |
| pac.ABC 2.1 | 9 | 89% |
| pbg.R2D2 1.0 | 5 | 100% |
| mbh.Mbh 0.1 | 4 | 100% |

Hadur died in 18 of 280 rounds, at a mean tick of 748. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 4 | 22% | 103 |
| krillr.mini.JointStrike 2.0.0 | 3 | 17% | 38 |
| patson.PatsonTestBot 1.0 | 3 | 17% | 31 |
| erdnis.Rover 0.3 | 2 | 11% | 42 |
| mld.Infinity 2.2 | 2 | 11% | 27 |
| pac.ABC 2.1 | 2 | 11% | 8 |
| mbh.Mbh 0.1 | 1 | 6% | 15 |
| pbg.R2D2 1.0 | 0 | 0% | 12 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 269 rounds): 173850 melee ticks, 60748 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (269 rounds): longest scan gap while four or more were alive 43 ticks (269 rounds over 8); rounds whose longest gap at any count was over 8: 269; robots dropped as dead without a death event: 2.

Targeting waves (269 rounds): 58716 sent, 52561 reached their opponent, 12523 virtual hits (23.8% of those reached).

## Melee bench: F20

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 783 over 8 battles (97.9 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 90.6 | 173 / 280 | 1.85 | 20.4% | 47452 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.0 | 20.4% | 173 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.6% | 44 |
| fwb.Nine 1.0.1 | 3.4 | 11.5% | 23 |
| catcat20.Rabbit 0.001 | 4.4 | 10.8% | 30 |
| nz.jdc.nano.GridFu 1.0 | 4.4 | 10.6% | 4 |
| m3thos.mini.Eva01 0.5.5 | 5.9 | 8.8% | 3 |
| bayen.nut.Squirrel 1.615 | 7.5 | 6.5% | 1 |
| djdjdj.NanoSkunk10 1.0 | 8.3 | 5.8% | 1 |
| ntc.ControlledChaos 1.1.4 | 8.4 | 5.7% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.9 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 93.3 | 23 / 35 | 6020 |
| 2 | 1 | 70.8 | 91.1 | 20 / 35 | 5978 |
| 3 | 1 | 68.8 | 86.0 | 20 / 35 | 5446 |
| 4 | 1 | 70.5 | 92.4 | 19 / 35 | 5776 |
| 5 | 1 | 72.0 | 94.9 | 23 / 35 | 6351 |
| 6 | 1 | 70.8 | 89.5 | 25 / 35 | 5917 |
| 7 | 1 | 71.7 | 93.0 | 25 / 35 | 6342 |
| 8 | 1 | 68.8 | 84.4 | 18 / 35 | 5622 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 95 | 82% |
| fwb.Nine 1.0.1 | 46 | 85% |
| catcat20.Rabbit 0.001 | 41 | 66% |
| nz.jdc.nano.GridFu 1.0 | 13 | 92% |
| m3thos.mini.Eva01 0.5.5 | 10 | 80% |
| bayen.nut.Squirrel 1.615 | 5 | 80% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| ntc.ControlledChaos 1.1.4 | 2 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 113 of 280 rounds, at a mean tick of 1049. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 47 | 42% | 127 |
| fwb.Nine 1.0.1 | 25 | 22% | 38 |
| catcat20.Rabbit 0.001 | 21 | 19% | 49 |
| nz.jdc.nano.GridFu 1.0 | 6 | 5% | 19 |
| m3thos.mini.Eva01 0.5.5 | 4 | 4% | 21 |
| bayen.nut.Squirrel 1.615 | 4 | 4% | 16 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 4 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 277 rounds): 230438 melee ticks, 70335 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 519 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (277 rounds): longest scan gap while four or more were alive 415 ticks (277 rounds over 8); rounds whose longest gap at any count was over 8: 277; robots dropped as dead without a death event: 1.

Targeting waves (277 rounds): 72494 sent, 65923 reached their opponent, 15286 virtual hits (23.2% of those reached).

## Melee bench: F21

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 930 over 8 battles (116.3 per battle, most in one battle 210). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 92.1 | 179 / 280 | 1.71 | 20.4% | 46140 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.0 | 20.4% | 179 |
| eem.EvBot v4.6.16 | 2.0 | 16.6% | 77 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.6% | 6 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.5% | 6 |
| eld.Hmm 1.0 | 5.0 | 8.7% | 13 |
| oa.weak.BotherBot 0.1 | 6.3 | 7.3% | 1 |
| fire219.CatBot 1.0 | 7.3 | 6.6% | 0 |
| el.JumpShoot 0.2 | 7.6 | 6.2% | 0 |
| PSW.Relentless 0.1 | 8.9 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 86.7 | 21 / 35 | 5681 |
| 2 | 1 | 71.6 | 93.7 | 21 / 35 | 6092 |
| 3 | 1 | 70.0 | 89.2 | 21 / 35 | 5400 |
| 4 | 1 | 70.2 | 89.5 | 23 / 35 | 5476 |
| 5 | 1 | 70.9 | 91.4 | 23 / 35 | 5851 |
| 6 | 1 | 71.0 | 93.7 | 20 / 35 | 5685 |
| 7 | 1 | 71.8 | 96.5 | 25 / 35 | 5712 |
| 8 | 1 | 72.4 | 95.9 | 25 / 35 | 6243 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 167 | 71% |
| dummy.mini.Scimitar 1.01 | 32 | 94% |
| cf.RiO.RiOx 4.2.1 | 21 | 100% |
| eld.Hmm 1.0 | 17 | 53% |
| oa.weak.BotherBot 0.1 | 2 | 50% |

Hadur died in 111 of 280 rounds, at a mean tick of 1241. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 61 | 55% | 154 |
| dummy.mini.Scimitar 1.01 | 17 | 15% | 62 |
| eld.Hmm 1.0 | 9 | 8% | 30 |
| cf.RiO.RiOx 4.2.1 | 7 | 6% | 25 |
| arthord.MannyPacquiao Beta | 3 | 3% | 3 |
| PSW.Relentless 0.1 | 3 | 3% | 3 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 3 |
10 death(s) with no robot to name.

Posture (Hadur's M records, 278 rounds): 241708 melee ticks, 108099 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 120 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (278 rounds): longest scan gap while four or more were alive 120 ticks (278 rounds over 8); rounds whose longest gap at any count was over 8: 278; robots dropped as dead without a death event: 2.

Targeting waves (278 rounds): 72282 sent, 65861 reached their opponent, 11699 virtual hits (17.8% of those reached).

## Melee bench: F22

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 604 over 8 battles (75.5 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 86.7 | 124 / 280 | 2.20 | 18.0% | 38533 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.3 | 18.0% | 124 |
| pe.SandboxDT 2.71m | 1.9 | 16.4% | 86 |
| kvk.HebusLeTroll 0.35 | 2.9 | 14.8% | 41 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.7% | 20 |
| bigpete.Stewie 1.0 | 5.0 | 10.5% | 8 |
| yk.JahRoslav 1.1 | 6.4 | 7.1% | 1 |
| tad.Dalek98 0.98 | 7.1 | 6.4% | 0 |
| gg.Squaraus 0.6 | 7.6 | 6.0% | 0 |
| pbg.NinjaX 1.2 | 8.9 | 5.2% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.2 | 80.3 | 11 / 35 | 4610 |
| 2 | 1 | 69.6 | 90.5 | 20 / 35 | 5207 |
| 3 | 1 | 69.1 | 89.8 | 17 / 35 | 4932 |
| 4 | 1 | 67.7 | 85.1 | 12 / 35 | 4869 |
| 5 | 1 | 68.2 | 87.9 | 15 / 35 | 4713 |
| 6 | 2 | 67.8 | 86.3 | 16 / 35 | 4556 |
| 7 | 1 | 68.7 | 87.3 | 14 / 35 | 5068 |
| 8 | 1 | 68.1 | 86.0 | 19 / 35 | 4578 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 73 | 48% |
| jlm.javaDisturbance 0.59 | 48 | 85% |
| kvk.HebusLeTroll 0.35 | 46 | 57% |
| bigpete.Stewie 1.0 | 20 | 80% |
| pbg.NinjaX 1.2 | 3 | 100% |
| yk.JahRoslav 1.1 | 2 | 100% |
| tad.Dalek98 0.98 | 1 | 100% |

Hadur died in 162 of 280 rounds, at a mean tick of 988. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 68 | 42% | 107 |
| kvk.HebusLeTroll 0.35 | 46 | 28% | 71 |
| jlm.javaDisturbance 0.59 | 26 | 16% | 65 |
| bigpete.Stewie 1.0 | 12 | 7% | 24 |
| tad.Dalek98 0.98 | 2 | 1% | 4 |
| gg.Squaraus 0.6 | 2 | 1% | 3 |
| yk.JahRoslav 1.1 | 2 | 1% | 2 |
| pbg.NinjaX 1.2 | 0 | 0% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 212470 melee ticks, 66603 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 48 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 69446 sent, 62995 reached their opponent, 10518 virtual hits (16.7% of those reached).

## Melee bench: F23

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 315 over 8 battles (39.4 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 95.2 | 224 / 280 | 1.43 | 21.4% | 47226 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.0 | 21.4% | 224 |
| pe.SandboxLump 1.52 | 2.0 | 16.3% | 38 |
| cre.Karolos 0.32 | 3.0 | 13.8% | 9 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.1% | 5 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.6 | 8.9% | 1 |
| stelo.RamTrackSurfer 1.2 | 5.6 | 9.1% | 3 |
| cw.megas.Blade 0.8 | 6.5 | 8.6% | 0 |
| sample.Walls 1.0 | 7.8 | 7.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 2.6% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 94.3 | 27 / 35 | 5497 |
| 2 | 1 | 74.0 | 98.7 | 33 / 35 | 6141 |
| 3 | 1 | 72.3 | 92.4 | 25 / 35 | 6031 |
| 4 | 1 | 72.3 | 94.3 | 26 / 35 | 5791 |
| 5 | 1 | 71.7 | 93.7 | 27 / 35 | 5709 |
| 6 | 1 | 73.3 | 96.2 | 30 / 35 | 5805 |
| 7 | 1 | 73.1 | 96.2 | 28 / 35 | 6014 |
| 8 | 1 | 72.9 | 96.2 | 28 / 35 | 6238 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 129 | 86% |
| cre.Karolos 0.32 | 76 | 93% |
| stelo.RamTrackSurfer 1.2 | 15 | 93% |
| stelo.AreaTargetingBot 1.1 | 9 | 78% |
| cw.megas.Blade 0.8 | 8 | 100% |
| sample.Walls 1.0 | 8 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |

Hadur died in 58 of 280 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 27 | 47% | 137 |
| cre.Karolos 0.32 | 18 | 31% | 78 |
| stelo.AreaTargetingBot 1.1 | 6 | 10% | 15 |
| stelo.RamTrackSurfer 1.2 | 2 | 3% | 20 |
| cw.megas.Blade 0.8 | 2 | 3% | 12 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 2% | 6 |
| sample.Walls 1.0 | 0 | 0% | 6 |
| cli.WasteOfAmmo 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 166938 melee ticks, 63026 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 54 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 1.

Targeting waves (272 rounds): 53373 sent, 47029 reached their opponent, 14216 virtual hits (30.2% of those reached).

## Melee bench: F24

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 586 over 8 battles (73.3 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 79.4 | 92 / 280 | 2.86 | 15.9% | 30486 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.0 | 15.9% | 92 |
| rz.GlowBlowMelee 1.4 | 2.4 | 14.0% | 56 |
| davidalves.Phoenix 0.54 | 3.3 | 13.2% | 57 |
| florent.XSeries.X2 0.12 | 3.8 | 12.8% | 38 |
| pedersen.Ugluk 1.1.1 | 4.6 | 11.8% | 31 |
| oog.melee.Corsair 1.0 | 6.0 | 9.6% | 4 |
| stelo.SoJNanoMelee 1.1 | 7.3 | 6.9% | 1 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.2% | 0 |
| as.FrankTheTank 1.3 | 8.9 | 5.4% | 1 |
| evd.X1 0.01 | 9.9 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 79.0 | 10 / 35 | 4109 |
| 2 | 1 | 64.4 | 79.7 | 11 / 35 | 3900 |
| 3 | 1 | 62.6 | 75.2 | 10 / 35 | 3447 |
| 4 | 1 | 65.5 | 83.2 | 15 / 35 | 3763 |
| 5 | 1 | 65.5 | 83.2 | 13 / 35 | 3845 |
| 6 | 1 | 64.1 | 80.3 | 13 / 35 | 3431 |
| 7 | 1 | 63.1 | 75.2 | 8 / 35 | 3959 |
| 8 | 1 | 65.0 | 79.0 | 12 / 35 | 4032 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 46 | 48% |
| florent.XSeries.X2 0.12 | 38 | 55% |
| davidalves.Phoenix 0.54 | 32 | 53% |
| pedersen.Ugluk 1.1.1 | 24 | 50% |
| oog.melee.Corsair 1.0 | 10 | 90% |
| stelo.SoJNanoMelee 1.1 | 6 | 100% |
| as.FrankTheTank 1.3 | 2 | 100% |
| lunchie.Lunchbox 0.93 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 192 of 280 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pedersen.Ugluk 1.1.1 | 44 | 23% | 54 |
| rz.GlowBlowMelee 1.4 | 41 | 21% | 66 |
| davidalves.Phoenix 0.54 | 38 | 20% | 50 |
| florent.XSeries.X2 0.12 | 34 | 18% | 58 |
| oog.melee.Corsair 1.0 | 16 | 8% | 26 |
| stelo.SoJNanoMelee 1.1 | 6 | 3% | 11 |
| lunchie.Lunchbox 0.93 | 4 | 2% | 8 |
| as.FrankTheTank 1.3 | 3 | 2% | 5 |
| evd.X1 0.01 | 2 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 277 rounds): 185127 melee ticks, 47316 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (277 rounds): longest scan gap while four or more were alive 43 ticks (277 rounds over 8); rounds whose longest gap at any count was over 8: 277; robots dropped as dead without a death event: 1.

Targeting waves (277 rounds): 62636 sent, 55847 reached their opponent, 10430 virtual hits (18.7% of those reached).

## Melee bench: F25

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 347 over 8 battles (43.4 per battle, most in one battle 114). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 87.5 | 165 / 280 | 2.13 | 18.4% | 32002 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.0 | 18.4% | 165 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 14.0% | 36 |
| voidious.micro.BlitzBat 1.05 | 3.3 | 12.6% | 9 |
| jdw.Hurricane 1.4 | 3.6 | 11.9% | 36 |
| ds.Oo 2.2 | 5.3 | 9.0% | 16 |
| gre.svman4.Morfeas 1.4.1 | 5.4 | 9.4% | 10 |
| awesomeness.Elite 1.0 | 7.0 | 7.6% | 7 |
| adt.Ar2 1.1 | 8.1 | 6.6% | 2 |
| gjr.Cephalosporin 0.1 | 8.9 | 6.0% | 0 |
| amk.ChumbaMini 0.2 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 86.7 | 22 / 35 | 4033 |
| 2 | 1 | 68.6 | 89.2 | 22 / 35 | 4193 |
| 3 | 1 | 69.1 | 91.4 | 23 / 35 | 4159 |
| 4 | 1 | 65.8 | 84.1 | 18 / 35 | 3567 |
| 5 | 1 | 68.2 | 88.6 | 19 / 35 | 4193 |
| 6 | 1 | 68.1 | 87.6 | 22 / 35 | 3970 |
| 7 | 1 | 66.6 | 85.1 | 15 / 35 | 3925 |
| 8 | 1 | 68.1 | 87.3 | 24 / 35 | 3962 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 65 | 94% |
| voidious.mini.BrokenSword 2.0.3 | 55 | 85% |
| jdw.Hurricane 1.4 | 33 | 70% |
| gre.svman4.Morfeas 1.4.1 | 15 | 73% |
| ds.Oo 2.2 | 9 | 67% |
| awesomeness.Elite 1.0 | 8 | 75% |
| gjr.Cephalosporin 0.1 | 6 | 100% |
| adt.Ar2 1.1 | 5 | 100% |

Hadur died in 117 of 280 rounds, at a mean tick of 685. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 31 | 26% | 76 |
| jdw.Hurricane 1.4 | 25 | 21% | 39 |
| voidious.micro.BlitzBat 1.05 | 20 | 17% | 71 |
| ds.Oo 2.2 | 11 | 9% | 20 |
| gre.svman4.Morfeas 1.4.1 | 10 | 9% | 28 |
| awesomeness.Elite 1.0 | 8 | 7% | 16 |
| adt.Ar2 1.1 | 7 | 6% | 17 |
| gjr.Cephalosporin 0.1 | 2 | 2% | 10 |
| amk.ChumbaMini 0.2 | 1 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 277 rounds): 176890 melee ticks, 35463 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 37 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (277 rounds): longest scan gap while four or more were alive 37 ticks (277 rounds over 8); rounds whose longest gap at any count was over 8: 277; robots dropped as dead without a death event: 3.

Targeting waves (277 rounds): 62703 sent, 56192 reached their opponent, 9606 virtual hits (17.1% of those reached).

## Melee bench: F26

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 292 over 8 battles (36.5 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 92.1 | 182 / 280 | 1.71 | 20.4% | 49169 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.0 | 20.4% | 182 |
| ak.Fermat 2.0 | 2.0 | 15.2% | 53 |
| lrem.Spectre 0.4.4 | 3.6 | 11.9% | 15 |
| shu.nitro.LENIN .T34 | 3.6 | 12.3% | 20 |
| js.PinBall 1.6 | 4.8 | 10.8% | 4 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.5% | 5 |
| gh.mini.GrubbmOne 1.0 | 7.1 | 7.6% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 7.9 | 6.4% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 92.1 | 22 / 35 | 6083 |
| 2 | 1 | 71.7 | 92.4 | 23 / 35 | 6327 |
| 3 | 1 | 70.9 | 91.1 | 21 / 35 | 5971 |
| 4 | 1 | 71.2 | 91.1 | 22 / 35 | 6200 |
| 5 | 1 | 69.8 | 87.6 | 21 / 35 | 5757 |
| 6 | 1 | 71.9 | 94.0 | 25 / 35 | 6300 |
| 7 | 1 | 71.9 | 93.7 | 25 / 35 | 6279 |
| 8 | 1 | 71.8 | 94.6 | 23 / 35 | 6252 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 94 | 64% |
| shu.nitro.LENIN .T34 | 53 | 89% |
| lrem.Spectre 0.4.4 | 49 | 94% |
| js.PinBall 1.6 | 14 | 93% |
| jaybot.adv.bots.JayBot 2.0 | 13 | 69% |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |
| gh.mini.GrubbmOne 1.0 | 1 | 100% |

Hadur died in 99 of 280 rounds, at a mean tick of 972. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 60 | 61% | 113 |
| shu.nitro.LENIN .T34 | 11 | 11% | 65 |
| js.PinBall 1.6 | 11 | 11% | 26 |
| lrem.Spectre 0.4.4 | 8 | 8% | 53 |
| jaybot.adv.bots.JayBot 2.0 | 6 | 6% | 12 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 3 |
| sample.SpinBot 1.0 | 1 | 1% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 0 | 0% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 212391 melee ticks, 64877 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 27 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 27 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 5.

Targeting waves (272 rounds): 70275 sent, 63869 reached their opponent, 15999 virtual hits (25.0% of those reached).

## Melee bench: F27

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 541 over 8 battles (67.6 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 88.0 | 201 / 280 | 2.08 | 19.7% | 42221 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.1 | 19.7% | 201 |
| mk.Alpha 0.2.1 | 1.9 | 14.4% | 48 |
| EH.Eagle 1.0.6 | 4.1 | 10.4% | 8 |
| wee.Gem 1.8.4 | 5.0 | 9.5% | 10 |
| sheldor.melee.nano.TestMelee 0.1 | 5.5 | 9.2% | 7 |
| techdude.kombat.FlamingKombat 1.5 | 5.8 | 8.9% | 1 |
| throxbot.ThroxBot 0.1 | 6.3 | 8.4% | 3 |
| joe.ADinosaur 1.0 | 7.4 | 7.7% | 0 |
| caimano.Furia_Ceca 0.22 | 8.6 | 6.6% | 2 |
| cs.Grudge 1.0 | 9.4 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 94.9 | 30 / 35 | 5662 |
| 2 | 1 | 69.7 | 89.5 | 24 / 35 | 5283 |
| 3 | 1 | 70.8 | 93.3 | 29 / 35 | 5501 |
| 4 | 2 | 59.1 | 56.2 | 10 / 35 | 4425 |
| 5 | 1 | 70.0 | 90.5 | 25 / 35 | 5228 |
| 6 | 1 | 70.9 | 94.3 | 30 / 35 | 5418 |
| 7 | 1 | 69.6 | 91.7 | 25 / 35 | 4725 |
| 8 | 1 | 71.5 | 93.3 | 28 / 35 | 5979 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 135 | 90% |
| EH.Eagle 1.0.6 | 37 | 100% |
| wee.Gem 1.8.4 | 12 | 92% |
| throxbot.ThroxBot 0.1 | 11 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 10 | 80% |
| techdude.kombat.FlamingKombat 1.5 | 8 | 100% |
| joe.ADinosaur 1.0 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 83 of 280 rounds, at a mean tick of 632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 27 | 33% | 127 |
| EH.Eagle 1.0.6 | 13 | 16% | 49 |
| cs.Grudge 1.0 | 8 | 10% | 10 |
| throxbot.ThroxBot 0.1 | 7 | 8% | 20 |
| techdude.kombat.FlamingKombat 1.5 | 6 | 7% | 16 |
| caimano.Furia_Ceca 0.22 | 6 | 7% | 10 |
| wee.Gem 1.8.4 | 5 | 6% | 18 |
| joe.ADinosaur 1.0 | 4 | 5% | 10 |
| sheldor.melee.nano.TestMelee 0.1 | 3 | 4% | 18 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 171595 melee ticks, 53343 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 32 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 1.

Targeting waves (275 rounds): 56965 sent, 50561 reached their opponent, 12601 virtual hits (24.9% of those reached).

## Melee bench: F28

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 292 over 8 battles (36.5 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 88.7 | 173 / 280 | 2.01 | 18.4% | 32039 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.0 | 18.4% | 173 |
| kid.test.NightFox .2 | 2.0 | 15.0% | 42 |
| uji.Antique 1.0 | 3.0 | 13.0% | 38 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.8% | 20 |
| pfvicm.Sobieski 7.2.3b | 4.6 | 10.6% | 3 |
| ahr.ice.Ice 1.0.2 | 6.4 | 8.0% | 1 |
| amk.ChumbaWumba 0.3 | 6.5 | 7.6% | 3 |
| matt.advanced.Katana 1.0 | 8.5 | 6.0% | 0 |
| stelo.Lifestealer 1.0 | 9.1 | 5.4% | 0 |
| stelo.PianistNano 1.2 | 9.4 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 91.4 | 21 / 35 | 4004 |
| 2 | 1 | 68.8 | 90.5 | 24 / 35 | 4247 |
| 3 | 1 | 69.5 | 92.1 | 26 / 35 | 4209 |
| 4 | 1 | 64.8 | 81.3 | 15 / 35 | 3522 |
| 5 | 1 | 69.3 | 93.0 | 24 / 35 | 4036 |
| 6 | 1 | 66.6 | 83.2 | 21 / 35 | 3809 |
| 7 | 1 | 68.9 | 91.7 | 21 / 35 | 4244 |
| 8 | 1 | 67.4 | 86.7 | 21 / 35 | 3968 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 98 | 86% |
| uji.Antique 1.0 | 69 | 83% |
| qohnil.blot.BlotBot 3.61 | 23 | 65% |
| pfvicm.Sobieski 7.2.3b | 8 | 88% |
| amk.ChumbaWumba 0.3 | 5 | 40% |
| ahr.ice.Ice 1.0.2 | 4 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |

Hadur died in 108 of 280 rounds, at a mean tick of 703. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 27 | 25% | 86 |
| kid.test.NightFox .2 | 27 | 25% | 72 |
| pfvicm.Sobieski 7.2.3b | 17 | 16% | 34 |
| qohnil.blot.BlotBot 3.61 | 15 | 14% | 40 |
| amk.ChumbaWumba 0.3 | 13 | 12% | 22 |
| stelo.Lifestealer 1.0 | 4 | 4% | 4 |
| ahr.ice.Ice 1.0.2 | 2 | 2% | 16 |
| matt.advanced.Katana 1.0 | 2 | 2% | 6 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 265 rounds): 170046 melee ticks, 44398 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (265 rounds): longest scan gap while four or more were alive 42 ticks (265 rounds over 8); rounds whose longest gap at any count was over 8: 265; robots dropped as dead without a death event: 1.

Targeting waves (265 rounds): 57609 sent, 51478 reached their opponent, 7602 virtual hits (14.8% of those reached).

## Melee bench: F29

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 639 over 8 battles (79.9 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 85.9 | 123 / 280 | 2.27 | 18.4% | 36895 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.0 | 18.4% | 123 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 15.1% | 62 |
| deewiant.Anomaly 0.2 | 2.8 | 14.7% | 65 |
| jok.PheonixM 0.1.2 | 4.5 | 11.3% | 11 |
| myl.micro.Troodon 1.10 | 4.5 | 11.8% | 11 |
| ph.melee.ArcherME 0.3 | 6.0 | 7.9% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 7.1 | 6.3% | 0 |
| DBall.Anarchy 0.1 | 8.1 | 5.6% | 4 |
| ap.Frederick 1.1 | 9.1 | 4.8% | 2 |
| jangs.ns51 1.0 | 9.6 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 82.9 | 16 / 35 | 4415 |
| 2 | 1 | 69.8 | 88.6 | 17 / 35 | 4877 |
| 3 | 1 | 68.5 | 85.7 | 16 / 35 | 4555 |
| 4 | 1 | 68.6 | 86.7 | 15 / 35 | 4776 |
| 5 | 1 | 68.9 | 87.0 | 15 / 35 | 4796 |
| 6 | 1 | 66.4 | 81.9 | 12 / 35 | 4246 |
| 7 | 1 | 69.0 | 88.6 | 17 / 35 | 4883 |
| 8 | 1 | 68.0 | 86.0 | 15 / 35 | 4347 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 79 | 52% |
| zyx.mega.YersiniaPestis 3.1 | 66 | 68% |
| myl.micro.Troodon 1.10 | 17 | 82% |
| jok.PheonixM 0.1.2 | 16 | 94% |
| ap.Frederick 1.1 | 4 | 75% |
| DBall.Anarchy 0.1 | 3 | 100% |
| ph.melee.ArcherME 0.3 | 2 | 100% |

Hadur died in 162 of 280 rounds, at a mean tick of 985. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 65 | 40% | 103 |
| zyx.mega.YersiniaPestis 3.1 | 46 | 28% | 91 |
| myl.micro.Troodon 1.10 | 24 | 15% | 40 |
| jok.PheonixM 0.1.2 | 15 | 9% | 33 |
| jangs.ns51 1.0 | 3 | 2% | 3 |
| ph.melee.ArcherME 0.3 | 2 | 1% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 2 |
| ap.Frederick 1.1 | 1 | 1% | 0 |
| DBall.Anarchy 0.1 | 0 | 0% | 4 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 225665 melee ticks, 69417 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 40 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 0.

Targeting waves (275 rounds): 74267 sent, 67758 reached their opponent, 10855 virtual hits (16.0% of those reached).

## Melee bench: F30

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 978 over 8 battles (122.3 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 76.4 | 59 / 280 | 3.12 | 15.0% | 30396 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.8 | 15.0% | 59 |
| catcat20.Matcha 0.006 | 2.1 | 14.0% | 65 |
| darkcanuck.B26354 1.06 | 2.4 | 14.0% | 67 |
| oog.melee.Capulet 1.2 | 4.1 | 12.5% | 37 |
| stelo.PastFuture 2.3.2 | 4.6 | 11.6% | 21 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.4% | 23 |
| fowl3628800.LightningBolt 2.6.0 | 7.9 | 7.0% | 3 |
| ntc.Opposite 1.5 | 8.0 | 7.0% | 0 |
| tripphippy.Alice 1.1 | 8.1 | 7.0% | 5 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 75.9 | 8 / 35 | 4082 |
| 2 | 1 | 64.5 | 81.9 | 7 / 35 | 4060 |
| 3 | 2 | 60.8 | 70.2 | 6 / 35 | 3383 |
| 4 | 1 | 63.8 | 77.5 | 9 / 35 | 4174 |
| 5 | 2 | 62.3 | 75.2 | 5 / 35 | 3676 |
| 6 | 3 | 63.3 | 77.8 | 10 / 35 | 3564 |
| 7 | 3 | 60.7 | 72.4 | 5 / 35 | 3309 |
| 8 | 1 | 64.8 | 80.6 | 9 / 35 | 4148 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 44 | 36% |
| darkcanuck.B26354 1.06 | 34 | 35% |
| oog.melee.Capulet 1.2 | 28 | 43% |
| stelo.PastFuture 2.3.2 | 14 | 64% |
| intruder.PrairieWolf 2.61 | 13 | 38% |
| tripphippy.Alice 1.1 | 5 | 60% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 100% |

Hadur died in 229 of 280 rounds, at a mean tick of 879. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 59 | 26% | 76 |
| oog.melee.Capulet 1.2 | 44 | 19% | 59 |
| darkcanuck.B26354 1.06 | 43 | 19% | 55 |
| stelo.PastFuture 2.3.2 | 36 | 16% | 45 |
| intruder.PrairieWolf 2.61 | 18 | 8% | 22 |
| tripphippy.Alice 1.1 | 7 | 3% | 8 |
| ntc.Opposite 1.5 | 7 | 3% | 7 |
| fowl3628800.LightningBolt 2.6.0 | 6 | 3% | 7 |
| GarmBox.Anger 1.0 | 1 | 0% | 1 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 214421 melee ticks, 38839 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 59 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 4.

Targeting waves (275 rounds): 69926 sent, 63273 reached their opponent, 10750 virtual hits (17.0% of those reached).

## Melee bench: F31

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 785 over 8 battles (98.1 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 78.1 | 77 / 280 | 2.97 | 15.5% | 28769 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.4% | 115 |
| hadur2.Hadur 3.18.1aa | 2.0 | 15.5% | 77 |
| gh.mini.Griezel 0.2 | 3.1 | 13.3% | 53 |
| d414.nano.Quantum 1.0.0 | 4.1 | 11.8% | 15 |
| spinnercat.micro.Tyger 0.1 | 4.9 | 10.9% | 12 |
| gh.nano.Grofvuil 0.2 | 5.9 | 8.7% | 7 |
| timmit.nano.TimDog 0.33 | 7.5 | 6.4% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 8.0 | 5.7% | 0 |
| fm.mammillarias 1.3 | 9.0 | 5.4% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.3 | 79.7 | 10 / 35 | 3423 |
| 2 | 2 | 65.6 | 80.6 | 12 / 35 | 4127 |
| 3 | 2 | 62.9 | 74.0 | 11 / 35 | 3502 |
| 4 | 2 | 63.4 | 75.6 | 12 / 35 | 3512 |
| 5 | 2 | 63.3 | 77.5 | 9 / 35 | 3401 |
| 6 | 2 | 64.4 | 80.3 | 9 / 35 | 3581 |
| 7 | 2 | 63.0 | 77.1 | 4 / 35 | 3624 |
| 8 | 2 | 64.5 | 80.3 | 10 / 35 | 3599 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 61 | 43% |
| gh.mini.Griezel 0.2 | 37 | 59% |
| d414.nano.Quantum 1.0.0 | 16 | 75% |
| spinnercat.micro.Tyger 0.1 | 7 | 71% |
| timmit.nano.TimDog 0.33 | 6 | 83% |
| Gecko.ultimateGeckoBot 1.0 | 3 | 100% |
| gh.nano.Grofvuil 0.2 | 3 | 67% |
| fm.mammillarias 1.3 | 2 | 100% |

Hadur died in 209 of 280 rounds, at a mean tick of 833. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 90 | 43% | 115 |
| gh.mini.Griezel 0.2 | 44 | 21% | 68 |
| d414.nano.Quantum 1.0.0 | 25 | 12% | 33 |
| spinnercat.micro.Tyger 0.1 | 19 | 9% | 27 |
| gh.nano.Grofvuil 0.2 | 11 | 5% | 13 |
| fm.mammillarias 1.3 | 6 | 3% | 6 |
| timmit.nano.TimDog 0.33 | 4 | 2% | 11 |
| Gecko.ultimateGeckoBot 1.0 | 3 | 1% | 6 |
| tlp.ThreeLeggedPig 1 | 1 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 278 rounds): 210136 melee ticks, 38799 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (278 rounds): longest scan gap while four or more were alive 39 ticks (278 rounds over 8); rounds whose longest gap at any count was over 8: 278; robots dropped as dead without a death event: 1.

Targeting waves (278 rounds): 68864 sent, 62250 reached their opponent, 10282 virtual hits (16.5% of those reached).

## Melee bench: F32

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 626 over 8 battles (78.3 per battle, most in one battle 150). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 87.3 | 162 / 280 | 2.14 | 18.0% | 34693 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.0 | 18.0% | 162 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.0% | 74 |
| apc.botM 3.0 | 3.3 | 12.0% | 19 |
| lxx.ConceptA 0.8 | 4.5 | 9.8% | 6 |
| vjik.UnViolation 1.1 | 5.0 | 9.9% | 11 |
| bayen.UbaMicro 1.4 | 5.8 | 8.9% | 3 |
| panzer.Panzer 0.2 | 7.4 | 7.3% | 0 |
| yk.JahMicro 1.0 | 7.9 | 6.8% | 5 |
| conscience.Electron 1.3g | 8.4 | 6.7% | 0 |
| donjezza.Jezza 1.0 | 9.9 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 88.3 | 22 / 35 | 4273 |
| 2 | 1 | 68.0 | 89.2 | 21 / 35 | 4494 |
| 3 | 1 | 65.8 | 82.9 | 18 / 35 | 4269 |
| 4 | 1 | 66.6 | 84.4 | 20 / 35 | 4154 |
| 5 | 1 | 66.3 | 85.1 | 18 / 35 | 4298 |
| 6 | 1 | 66.9 | 88.3 | 20 / 35 | 4180 |
| 7 | 1 | 68.5 | 90.5 | 23 / 35 | 4520 |
| 8 | 1 | 67.8 | 89.8 | 20 / 35 | 4505 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 105 | 57% |
| apc.botM 3.0 | 45 | 80% |
| vjik.UnViolation 1.1 | 20 | 85% |
| lxx.ConceptA 0.8 | 18 | 83% |
| yk.JahMicro 1.0 | 13 | 69% |
| donjezza.Jezza 1.0 | 9 | 100% |
| bayen.UbaMicro 1.4 | 9 | 78% |
| panzer.Panzer 0.2 | 6 | 100% |
| conscience.Electron 1.3g | 3 | 100% |

Hadur died in 122 of 280 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 59 | 48% | 112 |
| lxx.ConceptA 0.8 | 21 | 17% | 33 |
| apc.botM 3.0 | 12 | 10% | 45 |
| panzer.Panzer 0.2 | 7 | 6% | 10 |
| vjik.UnViolation 1.1 | 6 | 5% | 40 |
| bayen.UbaMicro 1.4 | 5 | 4% | 16 |
| yk.JahMicro 1.0 | 4 | 3% | 10 |
| conscience.Electron 1.3g | 4 | 3% | 8 |
| donjezza.Jezza 1.0 | 0 | 0% | 6 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 165455 melee ticks, 67832 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 70 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 2.

Targeting waves (275 rounds): 58057 sent, 51567 reached their opponent, 9418 virtual hits (18.3% of those reached).

## Melee bench: F33

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 696 over 8 battles (87.0 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 85.6 | 138 / 280 | 2.29 | 18.3% | 37087 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.0 | 18.3% | 138 |
| maribo.Quester 0.3 | 2.1 | 15.6% | 53 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.9 | 13.2% | 34 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 11.4% | 20 |
| labg.Cataclysm 2.05 | 4.8 | 10.6% | 26 |
| baal.nano.N 1.42 | 6.1 | 8.8% | 2 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.6 | 8.4% | 6 |
| zyx.micro.Ant 1.1 | 8.3 | 5.6% | 1 |
| sanja.First 0.1 | 8.9 | 5.0% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.9 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 83.5 | 20 / 35 | 4652 |
| 2 | 1 | 66.3 | 80.3 | 12 / 35 | 4309 |
| 3 | 1 | 68.7 | 87.6 | 16 / 35 | 4640 |
| 4 | 1 | 67.9 | 85.1 | 18 / 35 | 4522 |
| 5 | 1 | 67.9 | 83.2 | 17 / 35 | 4635 |
| 6 | 1 | 67.7 | 84.1 | 15 / 35 | 4657 |
| 7 | 1 | 68.8 | 89.5 | 15 / 35 | 4660 |
| 8 | 1 | 70.6 | 91.7 | 25 / 35 | 5012 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 78 | 76% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 53 | 68% |
| gre.svman4.Leonidas 1.3.2 | 28 | 96% |
| labg.Cataclysm 2.05 | 23 | 52% |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 25% |
| baal.nano.N 1.42 | 3 | 67% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 147 of 280 rounds, at a mean tick of 985. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 43 | 29% | 97 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 36 | 24% | 77 |
| labg.Cataclysm 2.05 | 20 | 14% | 36 |
| gre.svman4.Leonidas 1.3.2 | 18 | 12% | 37 |
| baal.nano.N 1.42 | 10 | 7% | 12 |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 5% | 10 |
| sanja.First 0.1 | 4 | 3% | 5 |
| zyx.micro.Ant 1.1 | 2 | 1% | 4 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 1% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 230390 melee ticks, 66673 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 57 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 1.

Targeting waves (274 rounds): 74761 sent, 68297 reached their opponent, 10611 virtual hits (15.5% of those reached).

## Melee bench: F34

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 660 over 8 battles (82.5 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.1 | 116 / 280 | 2.25 | 18.1% | 40376 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.1 | 18.1% | 116 |
| stelo.Spread 0.9 | 2.4 | 16.0% | 75 |
| kid.Gladiator .7.2 | 2.5 | 15.8% | 51 |
| jcs.Seth 1.8 | 4.1 | 11.8% | 31 |
| tcf.Reach 3 | 5.3 | 10.5% | 4 |
| cli.Dancer 1.1 | 5.8 | 9.7% | 2 |
| ratosh.Wesco 1.4 | 6.9 | 7.6% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.1 | 3.0% | 0 |
| sample.RamFire 1.0 | 9.9 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 86.0 | 16 / 35 | 4841 |
| 2 | 1 | 68.8 | 89.8 | 10 / 35 | 5032 |
| 3 | 1 | 69.6 | 89.2 | 16 / 35 | 4979 |
| 4 | 2 | 65.5 | 77.1 | 10 / 35 | 4711 |
| 5 | 1 | 68.7 | 84.4 | 15 / 35 | 5285 |
| 6 | 1 | 70.4 | 90.8 | 20 / 35 | 5352 |
| 7 | 1 | 69.1 | 86.7 | 15 / 35 | 5182 |
| 8 | 1 | 68.3 | 84.4 | 14 / 35 | 4994 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 81 | 59% |
| kid.Gladiator .7.2 | 72 | 57% |
| jcs.Seth 1.8 | 27 | 52% |
| tcf.Reach 3 | 9 | 67% |
| cli.Dancer 1.1 | 6 | 83% |
| ratosh.Wesco 1.4 | 1 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 169 of 280 rounds, at a mean tick of 1062. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 64 | 38% | 99 |
| stelo.Spread 0.9 | 59 | 35% | 109 |
| jcs.Seth 1.8 | 23 | 14% | 38 |
| tcf.Reach 3 | 9 | 5% | 17 |
| ratosh.Wesco 1.4 | 5 | 3% | 7 |
| cli.Dancer 1.1 | 4 | 2% | 9 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 232902 melee ticks, 77926 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 50 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 1.

Targeting waves (275 rounds): 72397 sent, 65848 reached their opponent, 11103 virtual hits (16.9% of those reached).

## Melee bench: F35

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 533 over 8 battles (66.6 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 80.9 | 50 / 280 | 2.72 | 15.5% | 29603 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.5% | 181 |
| hadur2.Hadur 3.18.1aa | 2.0 | 15.5% | 50 |
| gh.mini.Gruwel 0.9 | 3.6 | 12.8% | 28 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.0 | 12.0% | 19 |
| rz.HawkOnFire 0.1 | 4.4 | 11.8% | 2 |
| wit.Chuliath 1.0 | 6.4 | 6.8% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.0 | 6.4% | 1 |
| myl.nano.KomoriNinja 1.1 | 7.6 | 5.8% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.7% | 0 |
| stelo.MyAgileRobot 0.2 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 79.0 | 3 / 35 | 3477 |
| 2 | 2 | 63.8 | 79.4 | 8 / 35 | 3605 |
| 3 | 2 | 63.8 | 78.1 | 8 / 35 | 3639 |
| 4 | 2 | 64.9 | 81.3 | 7 / 35 | 3906 |
| 5 | 2 | 65.2 | 81.3 | 6 / 35 | 3874 |
| 6 | 2 | 65.8 | 84.4 | 9 / 35 | 3856 |
| 7 | 2 | 64.0 | 80.6 | 4 / 35 | 3613 |
| 8 | 2 | 64.9 | 82.9 | 5 / 35 | 3633 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 103 | 18% |
| gh.mini.Gruwel 0.9 | 25 | 36% |
| dmh.robocode.robot.BlackDeath 9.2 | 21 | 57% |
| rz.HawkOnFire 0.1 | 11 | 91% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 0% |
| wit.Chuliath 1.0 | 1 | 0% |

Hadur died in 236 of 280 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 122 | 52% | 143 |
| gh.mini.Gruwel 0.9 | 34 | 14% | 44 |
| rz.HawkOnFire 0.1 | 33 | 14% | 40 |
| dmh.robocode.robot.BlackDeath 9.2 | 27 | 11% | 36 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 9 | 4% | 9 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 3 |
| wit.Chuliath 1.0 | 2 | 1% | 2 |
| stelo.MyAgileRobot 0.2 | 1 | 0% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 195553 melee ticks, 57314 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 51 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 1.

Targeting waves (275 rounds): 61553 sent, 54979 reached their opponent, 8902 virtual hits (16.2% of those reached).

## Melee bench: F36

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 508 over 8 battles (63.5 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 92.4 | 201 / 280 | 1.69 | 20.5% | 42484 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.0 | 20.5% | 201 |
| bzdp.Pansy 2.1 | 2.4 | 12.7% | 14 |
| alpha.RainingFire 1.0 | 2.8 | 12.5% | 23 |
| mz.Cork 0.1 | 4.1 | 11.4% | 21 |
| bvh.micro.Freya 0.3 | 5.4 | 10.1% | 9 |
| m3thos.Eva02 0.7.1 | 5.5 | 9.8% | 9 |
| bvh.mini.Fenrir 0.39 | 6.9 | 9.3% | 4 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 5.1% | 0 |
| dl.BetterWalls 1.0 | 9.0 | 4.8% | 0 |
| sample.MyFirstRobot 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 92.4 | 25 / 35 | 5238 |
| 2 | 1 | 70.0 | 90.5 | 22 / 35 | 5145 |
| 3 | 1 | 71.2 | 92.7 | 26 / 35 | 5533 |
| 4 | 1 | 72.2 | 95.2 | 28 / 35 | 5870 |
| 5 | 1 | 69.7 | 88.3 | 25 / 35 | 4952 |
| 6 | 1 | 69.4 | 90.2 | 22 / 35 | 4833 |
| 7 | 1 | 72.3 | 96.2 | 27 / 35 | 5736 |
| 8 | 1 | 70.7 | 93.7 | 26 / 35 | 5177 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 61 | 97% |
| bvh.micro.Freya 0.3 | 43 | 91% |
| mz.Cork 0.1 | 39 | 85% |
| alpha.RainingFire 1.0 | 38 | 71% |
| m3thos.Eva02 0.7.1 | 22 | 82% |
| bvh.mini.Fenrir 0.39 | 19 | 100% |
| sample.MyFirstRobot 1.0 | 6 | 100% |

Hadur died in 82 of 280 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 24 | 29% | 58 |
| bzdp.Pansy 2.1 | 14 | 17% | 67 |
| mz.Cork 0.1 | 13 | 16% | 43 |
| bvh.micro.Freya 0.3 | 12 | 15% | 44 |
| m3thos.Eva02 0.7.1 | 10 | 12% | 34 |
| bvh.mini.Fenrir 0.39 | 5 | 6% | 20 |
| dl.BetterWalls 1.0 | 1 | 1% | 6 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 7 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 270 rounds): 194498 melee ticks, 63853 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (270 rounds): longest scan gap while four or more were alive 48 ticks (270 rounds over 8); rounds whose longest gap at any count was over 8: 270; robots dropped as dead without a death event: 0.

Targeting waves (270 rounds): 67623 sent, 61575 reached their opponent, 13042 virtual hits (21.2% of those reached).

## Melee bench: F37

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 227 over 8 battles (28.4 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 89.5 | 222 / 280 | 1.95 | 19.7% | 45868 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.0 | 19.7% | 222 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.8 | 10.4% | 13 |
| germ.TheMind .2 | 4.1 | 10.1% | 4 |
| EBBU.Sim2 1.02 | 4.1 | 9.9% | 5 |
| agrach.Dalek 1.0 | 5.1 | 9.3% | 8 |
| stelo.UntouchableNano 1.3 | 6.4 | 8.6% | 11 |
| lmk.ACPFinal 0.1 | 7.0 | 8.4% | 8 |
| mb.Beast 0.1 | 7.9 | 8.0% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 7.9 | 8.2% | 2 |
| skm.Ryubot 1.0 | 8.8 | 7.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 88.9 | 28 / 35 | 5349 |
| 2 | 1 | 67.9 | 85.4 | 26 / 35 | 5741 |
| 3 | 1 | 67.3 | 85.1 | 26 / 35 | 5395 |
| 4 | 1 | 71.0 | 95.9 | 32 / 35 | 6108 |
| 5 | 1 | 69.6 | 92.7 | 27 / 35 | 5789 |
| 6 | 1 | 69.3 | 89.2 | 28 / 35 | 6004 |
| 7 | 1 | 68.6 | 87.9 | 26 / 35 | 5693 |
| 8 | 1 | 69.6 | 90.8 | 29 / 35 | 5789 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 40 | 100% |
| EBBU.Sim2 1.02 | 35 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 32 | 97% |
| germ.TheMind .2 | 28 | 100% |
| stelo.UntouchableNano 1.3 | 26 | 88% |
| skm.Ryubot 1.0 | 22 | 95% |
| mb.Beast 0.1 | 22 | 100% |
| lmk.ACPFinal 0.1 | 21 | 95% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 67% |

Hadur died in 61 of 280 rounds, at a mean tick of 393. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| lmk.ACPFinal 0.1 | 14 | 23% | 40 |
| mn.nano.perceptual.Impact 1.3.0 | 12 | 20% | 18 |
| com.syncleus.robocode.Dreadnaught 0.1 | 9 | 15% | 43 |
| stelo.UntouchableNano 1.3 | 7 | 11% | 30 |
| mb.Beast 0.1 | 6 | 10% | 27 |
| EBBU.Sim2 1.02 | 5 | 8% | 42 |
| germ.TheMind .2 | 5 | 8% | 30 |
| agrach.Dalek 1.0 | 3 | 5% | 39 |
| skm.Ryubot 1.0 | 0 | 0% | 6 |

Posture (Hadur's M records, 268 rounds): 128464 melee ticks, 36448 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 423 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (268 rounds): longest scan gap while four or more were alive 252 ticks (268 rounds over 8); rounds whose longest gap at any count was over 8: 268; robots dropped as dead without a death event: 1.

Targeting waves (268 rounds): 43481 sent, 37563 reached their opponent, 11753 virtual hits (31.3% of those reached).

## Melee bench: F38

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 714 over 8 battles (89.3 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 85.3 | 132 / 280 | 2.33 | 17.6% | 35407 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.0 | 17.6% | 132 |
| justin.Mallais 14.0 | 2.0 | 15.9% | 89 |
| bvh.mini.Freya 0.55 | 3.1 | 13.0% | 23 |
| bts.mega.Gnarly 1.4 | 4.5 | 10.9% | 15 |
| cs.Wren 1.0 | 4.5 | 11.1% | 8 |
| kdf.KoulDestroyer 1.0 | 6.3 | 9.0% | 9 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.8 | 8.4% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.1 | 6.3% | 2 |
| matt.UnderDark3 2.4.34 | 9.0 | 4.4% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 89.2 | 16 / 35 | 4587 |
| 2 | 1 | 66.3 | 82.2 | 13 / 35 | 4646 |
| 3 | 1 | 66.1 | 81.3 | 17 / 35 | 4467 |
| 4 | 1 | 67.6 | 84.8 | 17 / 35 | 4573 |
| 5 | 1 | 69.9 | 93.0 | 24 / 35 | 4611 |
| 6 | 1 | 67.1 | 84.8 | 17 / 35 | 4257 |
| 7 | 1 | 66.2 | 83.5 | 15 / 35 | 4115 |
| 8 | 1 | 66.1 | 83.5 | 13 / 35 | 4151 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 92 | 60% |
| bvh.mini.Freya 0.55 | 32 | 66% |
| bts.mega.Gnarly 1.4 | 29 | 76% |
| cs.Wren 1.0 | 21 | 100% |
| kdf.KoulDestroyer 1.0 | 6 | 50% |
| davidalves.net.DuelistNanoMelee 1.01 | 6 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 50% |
| matt.UnderDark3 2.4.34 | 2 | 100% |

Hadur died in 154 of 280 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 59 | 38% | 113 |
| bvh.mini.Freya 0.55 | 35 | 23% | 48 |
| bts.mega.Gnarly 1.4 | 21 | 14% | 41 |
| kdf.KoulDestroyer 1.0 | 14 | 9% | 19 |
| cs.Wren 1.0 | 9 | 6% | 30 |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 3% | 13 |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 3% | 10 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 4 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 185972 melee ticks, 51848 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 40 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 2.

Targeting waves (275 rounds): 62078 sent, 55317 reached their opponent, 11927 virtual hits (21.6% of those reached).

## Melee bench: F39

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 806 over 8 battles (100.8 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 85.7 | 114 / 280 | 2.29 | 17.6% | 37396 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.0 | 17.6% | 114 |
| bvh.fry.Freya 0.82 | 2.3 | 14.6% | 33 |
| az.Ololobot 0.2.4 | 2.9 | 13.2% | 81 |
| catcat20.Lambda 0.024 | 3.9 | 11.9% | 37 |
| gimp.GimpBot 0.1 | 5.5 | 8.5% | 2 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.2% | 7 |
| apollokidd.ApolloKidd 0.9 | 6.6 | 7.9% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 7.9 | 6.9% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.9 | 6.0% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.9 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 83.2 | 12 / 35 | 4676 |
| 2 | 1 | 65.2 | 81.6 | 11 / 35 | 4620 |
| 3 | 1 | 66.0 | 83.5 | 11 / 35 | 4775 |
| 4 | 1 | 67.1 | 87.6 | 14 / 35 | 4616 |
| 5 | 1 | 67.6 | 86.3 | 18 / 35 | 4923 |
| 6 | 1 | 66.8 | 86.7 | 14 / 35 | 4488 |
| 7 | 1 | 66.9 | 87.3 | 17 / 35 | 4459 |
| 8 | 1 | 68.1 | 89.2 | 17 / 35 | 4839 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 68 | 38% |
| bvh.fry.Freya 0.82 | 50 | 78% |
| catcat20.Lambda 0.024 | 48 | 63% |
| gimp.GimpBot 0.1 | 9 | 89% |
| stelo.SoRobotNanoMelee 1.2 | 5 | 100% |
| winamp32.micro.MicroMacro 1.0 | 4 | 75% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 173 of 280 rounds, at a mean tick of 1031. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 55 | 32% | 89 |
| bvh.fry.Freya 0.82 | 52 | 30% | 82 |
| catcat20.Lambda 0.024 | 33 | 19% | 56 |
| apollokidd.ApolloKidd 0.9 | 8 | 5% | 12 |
| gimp.GimpBot 0.1 | 7 | 4% | 15 |
| winamp32.micro.MicroMacro 1.0 | 5 | 3% | 11 |
| stelo.SoRobotNanoMelee 1.2 | 4 | 2% | 7 |
| dcs.Eater_of_Worlds 1.1.3-A | 3 | 2% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 223986 melee ticks, 63714 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 55 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 1.

Targeting waves (276 rounds): 71474 sent, 64929 reached their opponent, 11500 virtual hits (17.7% of those reached).

## Melee bench: F40

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 384 over 8 battles (48.0 per battle, most in one battle 144). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 89.2 | 180 / 280 | 1.97 | 19.6% | 39896 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.0 | 19.6% | 180 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.9% | 38 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.7% | 19 |
| Polkwane.SmashMelee 1.0 | 4.4 | 10.7% | 16 |
| mz.AntiGrav 1.0 | 4.6 | 11.1% | 15 |
| stelo.Randomness 1.0 | 6.5 | 8.6% | 8 |
| alpha.BlackIce 1.0 | 6.6 | 8.8% | 4 |
| amk.superstrike.SuperStrike 0.3 | 7.9 | 6.5% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.1 | 4.0% | 0 |
| sample.Corners 1.0 | 9.9 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 88.3 | 23 / 35 | 4747 |
| 2 | 1 | 69.7 | 88.3 | 24 / 35 | 4982 |
| 3 | 1 | 69.1 | 86.3 | 22 / 35 | 4941 |
| 4 | 1 | 69.5 | 87.6 | 19 / 35 | 5062 |
| 5 | 1 | 70.7 | 91.7 | 24 / 35 | 5124 |
| 6 | 1 | 69.5 | 89.8 | 20 / 35 | 4880 |
| 7 | 1 | 71.0 | 91.4 | 25 / 35 | 5270 |
| 8 | 1 | 70.0 | 90.5 | 23 / 35 | 4890 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 78 | 83% |
| kano.gamma.KanoGamma 1.8 | 49 | 86% |
| mz.AntiGrav 1.0 | 29 | 97% |
| Polkwane.SmashMelee 1.0 | 25 | 88% |
| stelo.Randomness 1.0 | 16 | 75% |
| alpha.BlackIce 1.0 | 9 | 89% |
| amk.superstrike.SuperStrike 0.3 | 3 | 100% |

Hadur died in 104 of 280 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 31 | 30% | 85 |
| kano.gamma.KanoGamma 1.8 | 24 | 23% | 64 |
| Polkwane.SmashMelee 1.0 | 16 | 15% | 39 |
| stelo.Randomness 1.0 | 13 | 13% | 29 |
| mz.AntiGrav 1.0 | 9 | 9% | 38 |
| alpha.BlackIce 1.0 | 5 | 5% | 14 |
| amk.superstrike.SuperStrike 0.3 | 3 | 3% | 4 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 2 |
| sample.Corners 1.0 | 0 | 0% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 202411 melee ticks, 53834 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 62 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 1.

Targeting waves (273 rounds): 67224 sent, 60617 reached their opponent, 13018 virtual hits (21.5% of those reached).

## Melee bench: F41

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 553 over 8 battles (69.1 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 85.7 | 124 / 280 | 2.29 | 17.7% | 34905 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.1 | 17.7% | 124 |
| eem.EvBotNG v12.8 | 1.9 | 16.5% | 116 |
| ary.Swarm 1.1 | 3.4 | 13.0% | 12 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.5% | 15 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.5% | 10 |
| shrub.Silver v048 | 6.0 | 9.0% | 3 |
| zyx.nano.Ant 1.1 | 6.9 | 7.9% | 0 |
| stelo.Mirror 1.1 | 8.5 | 5.4% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 5.5% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 84.4 | 19 / 35 | 4185 |
| 2 | 2 | 67.0 | 82.5 | 13 / 35 | 4456 |
| 3 | 1 | 67.7 | 87.0 | 13 / 35 | 4299 |
| 4 | 1 | 66.7 | 83.8 | 14 / 35 | 4297 |
| 5 | 1 | 67.8 | 86.0 | 15 / 35 | 4445 |
| 6 | 1 | 68.3 | 87.9 | 17 / 35 | 4722 |
| 7 | 1 | 68.1 | 86.3 | 17 / 35 | 4242 |
| 8 | 1 | 68.0 | 87.3 | 16 / 35 | 4259 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 94 | 41% |
| lessonz.robocode.Oz 0.5.0 | 37 | 92% |
| ary.Swarm 1.1 | 28 | 89% |
| simonton.nano.MeleeSeed 1.8 | 17 | 94% |
| shrub.Silver v048 | 7 | 71% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 161 of 280 rounds, at a mean tick of 921. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 81 | 50% | 121 |
| ary.Swarm 1.1 | 27 | 17% | 57 |
| lessonz.robocode.Oz 0.5.0 | 22 | 14% | 42 |
| simonton.nano.MeleeSeed 1.8 | 10 | 6% | 27 |
| shrub.Silver v048 | 7 | 4% | 16 |
| zyx.nano.Ant 1.1 | 4 | 2% | 9 |
| jsal.Jsalbot 1.0 | 2 | 1% | 4 |
| stelo.Mirror 1.1 | 2 | 1% | 3 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 278 rounds): 208226 melee ticks, 61575 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (278 rounds): longest scan gap while four or more were alive 58 ticks (278 rounds over 8); rounds whose longest gap at any count was over 8: 278; robots dropped as dead without a death event: 1.

Targeting waves (278 rounds): 69329 sent, 62650 reached their opponent, 10079 virtual hits (16.1% of those reached).

## Melee bench: F42

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 657 over 8 battles (82.1 per battle, most in one battle 144). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 91.2 | 184 / 280 | 1.79 | 19.9% | 44402 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.0 | 19.9% | 184 |
| wompi.Wallaby 5.1 | 2.1 | 15.7% | 52 |
| maribo.mini.MiniQuester 0.1 | 3.1 | 13.5% | 13 |
| ara.Shera 0.88 | 3.8 | 13.1% | 27 |
| amz.NanoClone 1.41 | 5.1 | 8.4% | 0 |
| dsw.StaticD 1.0 | 6.5 | 6.8% | 4 |
| maribo.IotaCT 1.1 | 7.1 | 6.5% | 0 |
| stelo.MirrorMicro 1.0 | 8.3 | 5.7% | 0 |
| mme.NikeEnhanced 2.0 | 8.3 | 5.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 89.2 | 20 / 35 | 5459 |
| 2 | 1 | 70.8 | 91.4 | 26 / 35 | 5580 |
| 3 | 1 | 69.5 | 87.9 | 23 / 35 | 5384 |
| 4 | 1 | 70.5 | 92.4 | 24 / 35 | 5516 |
| 5 | 1 | 70.4 | 92.4 | 23 / 35 | 5529 |
| 6 | 1 | 70.3 | 93.0 | 22 / 35 | 5540 |
| 7 | 1 | 70.7 | 93.0 | 24 / 35 | 5594 |
| 8 | 1 | 70.5 | 90.5 | 22 / 35 | 5800 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 124 | 85% |
| maribo.mini.MiniQuester 0.1 | 53 | 92% |
| ara.Shera 0.88 | 31 | 71% |
| dsw.StaticD 1.0 | 9 | 78% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 101 of 280 rounds, at a mean tick of 919. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 36 | 36% | 133 |
| ara.Shera 0.88 | 34 | 34% | 59 |
| maribo.mini.MiniQuester 0.1 | 15 | 15% | 67 |
| amz.NanoClone 1.41 | 5 | 5% | 6 |
| dsw.StaticD 1.0 | 4 | 4% | 11 |
| mme.NikeEnhanced 2.0 | 2 | 2% | 2 |
| maribo.IotaCT 1.1 | 1 | 1% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 219475 melee ticks, 70789 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 26 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 2.

Targeting waves (273 rounds): 70317 sent, 63969 reached their opponent, 12763 virtual hits (20.0% of those reached).

## Melee bench: F43

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 551 over 8 battles (68.9 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 78.8 | 42 / 280 | 2.91 | 15.3% | 29997 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.6% | 187 |
| hadur2.Hadur 3.18.1aa | 2.0 | 15.3% | 42 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.8% | 37 |
| dummy.micro.Sparrow 2.5 | 4.4 | 11.9% | 9 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 10.7% | 4 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.7% | 2 |
| mz.NanoGod 2.02 | 7.3 | 7.4% | 0 |
| jab.DiamondStealer 5 | 7.6 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.8% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 80.6 | 4 / 35 | 3790 |
| 2 | 2 | 66.1 | 80.3 | 5 / 35 | 4100 |
| 3 | 2 | 61.8 | 70.2 | 3 / 35 | 3177 |
| 4 | 2 | 65.5 | 81.6 | 5 / 35 | 4025 |
| 5 | 2 | 66.1 | 79.4 | 8 / 35 | 3950 |
| 6 | 2 | 65.0 | 80.0 | 5 / 35 | 3657 |
| 7 | 2 | 64.6 | 77.5 | 7 / 35 | 3709 |
| 8 | 2 | 65.3 | 80.6 | 5 / 35 | 3589 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 108 | 22% |
| brainfade.melee.Dusk 0.44 | 20 | 40% |
| dummy.micro.Sparrow 2.5 | 7 | 57% |
| wcsv.melee.EngineerMelee 0.1 | 5 | 80% |
| Krabb.akim2.Akim2 1.1b | 3 | 33% |
| jab.DiamondStealer 5 | 1 | 100% |

Hadur died in 243 of 280 rounds, at a mean tick of 950. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 136 | 56% | 158 |
| brainfade.melee.Dusk 0.44 | 36 | 15% | 46 |
| dummy.micro.Sparrow 2.5 | 26 | 11% | 30 |
| wcsv.melee.EngineerMelee 0.1 | 16 | 7% | 20 |
| mz.NanoGod 2.02 | 12 | 5% | 12 |
| Krabb.akim2.Akim2 1.1b | 8 | 3% | 9 |
| jab.DiamondStealer 5 | 4 | 2% | 5 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 205984 melee ticks, 61404 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 38 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 67065 sent, 60295 reached their opponent, 10369 virtual hits (17.2% of those reached).

## Melee bench: F44

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 283 over 8 battles (35.4 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 90.3 | 178 / 280 | 1.88 | 20.1% | 45033 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.0 | 20.1% | 178 |
| stelo.Liblix 0.3.1 | 2.1 | 15.1% | 54 |
| tzu.TheArtOfWar 1.2 | 2.9 | 14.1% | 29 |
| jwirde.Gort 2.0 | 4.3 | 9.7% | 12 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.9 | 9.2% | 2 |
| wompi.Quokka 1.6 | 6.8 | 7.8% | 3 |
| disan.Chair 2.2.0 | 6.9 | 7.3% | 2 |
| stf.PanzerGeneral 0.1 | 7.3 | 7.6% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.3% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 88.6 | 22 / 35 | 5393 |
| 2 | 1 | 70.7 | 89.8 | 24 / 35 | 5791 |
| 3 | 1 | 69.8 | 89.8 | 19 / 35 | 5310 |
| 4 | 1 | 69.7 | 88.6 | 24 / 35 | 5490 |
| 5 | 1 | 71.3 | 92.7 | 24 / 35 | 5982 |
| 6 | 1 | 70.6 | 90.5 | 22 / 35 | 5677 |
| 7 | 1 | 69.7 | 87.9 | 20 / 35 | 5599 |
| 8 | 1 | 71.6 | 94.3 | 23 / 35 | 5791 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 95 | 65% |
| tzu.TheArtOfWar 1.2 | 77 | 87% |
| jwirde.Gort 2.0 | 18 | 78% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 16 | 100% |
| disan.Chair 2.2.0 | 11 | 91% |
| wompi.Quokka 1.6 | 5 | 80% |
| sample.Crazy 1.0 | 3 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 104 of 280 rounds, at a mean tick of 905. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 51 | 49% | 118 |
| tzu.TheArtOfWar 1.2 | 26 | 25% | 91 |
| jwirde.Gort 2.0 | 10 | 10% | 29 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 6% | 17 |
| stf.PanzerGeneral 0.1 | 5 | 5% | 8 |
| disan.Chair 2.2.0 | 2 | 2% | 8 |
| wompi.Quokka 1.6 | 2 | 2% | 3 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 267 rounds): 202688 melee ticks, 62158 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 618 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (267 rounds): longest scan gap while four or more were alive 382 ticks (267 rounds over 8); rounds whose longest gap at any count was over 8: 267; robots dropped as dead without a death event: 0.

Targeting waves (267 rounds): 70130 sent, 63956 reached their opponent, 13986 virtual hits (21.9% of those reached).

## Melee bench: F45

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 999 over 8 battles (124.9 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 86.1 | 117 / 280 | 2.25 | 19.0% | 43273 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1aa | 1.0 | 19.0% | 117 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 12.9% | 124 |
| jje.BagPuss 1.2 | 3.5 | 11.8% | 10 |
| sul.Lunar 1.1 | 4.1 | 11.0% | 9 |
| myl.nano.Graviton 1.10 | 4.1 | 10.8% | 8 |
| fm.claire 1.7 | 6.6 | 8.2% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.1 | 7.9% | 4 |
| hvilela.HVilela 0.9 | 7.4 | 7.9% | 1 |
| wit.Deep7 2.0 | 8.9 | 6.2% | 6 |
| abud.ThirdRobo 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 82.5 | 13 / 35 | 5702 |
| 2 | 1 | 67.4 | 83.2 | 8 / 35 | 5584 |
| 3 | 1 | 69.6 | 86.7 | 20 / 35 | 5670 |
| 4 | 1 | 68.3 | 85.4 | 13 / 35 | 5349 |
| 5 | 1 | 68.7 | 87.3 | 16 / 35 | 5172 |
| 6 | 1 | 69.2 | 87.9 | 17 / 35 | 5482 |
| 7 | 1 | 67.7 | 85.7 | 13 / 35 | 4901 |
| 8 | 1 | 69.6 | 90.2 | 17 / 35 | 5413 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 125 | 43% |
| jje.BagPuss 1.2 | 23 | 78% |
| sul.Lunar 1.1 | 22 | 91% |
| myl.nano.Graviton 1.10 | 14 | 93% |
| pez.mini.ChironexFleckeri 0.5 | 8 | 63% |
| wit.Deep7 2.0 | 5 | 100% |
| fm.claire 1.7 | 2 | 50% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 171 of 280 rounds, at a mean tick of 1565. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 71 | 42% | 0 |
| jje.BagPuss 1.2 | 28 | 16% | 87 |
| myl.nano.Graviton 1.10 | 21 | 12% | 54 |
| sul.Lunar 1.1 | 17 | 10% | 65 |
| pez.mini.ChironexFleckeri 0.5 | 11 | 6% | 30 |
| fm.claire 1.7 | 8 | 5% | 18 |
| hvilela.HVilela 0.9 | 5 | 3% | 10 |
| wit.Deep7 2.0 | 2 | 1% | 8 |
| abud.ThirdRobo 1.0 | 0 | 0% | 4 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 273792 melee ticks, 133788 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 41 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 1.

Targeting waves (275 rounds): 84421 sent, 78153 reached their opponent, 12097 virtual hits (15.5% of those reached).

## Melee bench: F46

hadur2.Hadur 3.18.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 553 over 8 battles (69.1 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 83.3 | 82 / 280 | 2.50 | 16.4% | 33286 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.7% | 110 |
| kc.mini.Mirage 0.2 | 2.1 | 16.4% | 70 |
| hadur2.Hadur 3.18.1aa | 2.1 | 16.4% | 82 |
| mz.MicroSheep 1.0 | 4.5 | 10.5% | 5 |
| cx.Princess 1.0 | 5.0 | 10.2% | 13 |
| sadoner.killer 0.2 | 5.5 | 9.4% | 1 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.5% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.1 | 5.0% | 0 |
| kurios.DOSexe .9a | 8.9 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.5 | 81.3 | 9 / 35 | 4134 |
| 2 | 1 | 65.9 | 83.5 | 13 / 35 | 4123 |
| 3 | 3 | 66.5 | 84.4 | 8 / 35 | 4443 |
| 4 | 1 | 67.0 | 86.3 | 13 / 35 | 4120 |
| 5 | 3 | 64.9 | 82.2 | 11 / 35 | 3932 |
| 6 | 2 | 65.9 | 82.2 | 8 / 35 | 4361 |
| 7 | 2 | 65.5 | 84.1 | 10 / 35 | 3797 |
| 8 | 2 | 65.7 | 82.5 | 10 / 35 | 4376 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 74 | 66% |
| rsalesc.melee.Medina 0.4.5 | 57 | 19% |
| cx.Princess 1.0 | 17 | 76% |
| mz.MicroSheep 1.0 | 6 | 67% |
| sadoner.killer 0.2 | 3 | 100% |
| arthord.NanoSatanMelee Beta | 2 | 100% |

Hadur died in 203 of 280 rounds, at a mean tick of 946. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 84 | 41% | 100 |
| kc.mini.Mirage 0.2 | 73 | 36% | 120 |
| mz.MicroSheep 1.0 | 11 | 5% | 17 |
| arthord.NanoSatanMelee Beta | 11 | 5% | 12 |
| cx.Princess 1.0 | 10 | 5% | 18 |
| sadoner.killer 0.2 | 5 | 2% | 8 |
| jeremyreeder.collective.Prophet 5 | 3 | 1% | 3 |
| kurios.DOSexe .9a | 1 | 0% | 1 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 277 rounds): 204951 melee ticks, 61918 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (277 rounds): longest scan gap while four or more were alive 58 ticks (277 rounds over 8); rounds whose longest gap at any count was over 8: 277; robots dropped as dead without a death event: 0.

Targeting waves (277 rounds): 61609 sent, 54961 reached their opponent, 8726 virtual hits (15.9% of those reached).

