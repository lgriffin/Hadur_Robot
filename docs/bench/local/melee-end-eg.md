# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1546243. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 147 over 6 battles (24.5 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 85.8 | 70 / 210 | 2.28 | 17.9% | 32954 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.3% | 118 |
| hadur117.Hadur 3.21eg | 2.0 | 17.9% | 70 |
| sgp.JollyNinja 3.53 | 3.3 | 11.7% | 16 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 10.9% | 2 |
| mz.MicroGodMelee 1 | 5.0 | 10.2% | 3 |
| lorneswork.Predator 1.0 | 5.3 | 9.7% | 1 |
| adt.Ar2 1.0 | 7.2 | 7.4% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.6% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.3% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.1 | 85.1 | 10 / 35 | 5724 |
| 2 | 2 | 69.1 | 87.0 | 12 / 35 | 5710 |
| 3 | 2 | 66.3 | 81.6 | 9 / 35 | 5077 |
| 4 | 2 | 67.1 | 83.2 | 12 / 35 | 5224 |
| 5 | 2 | 69.0 | 88.3 | 14 / 35 | 5618 |
| 6 | 2 | 69.3 | 89.8 | 13 / 35 | 5601 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 119 | 28% |
| sgp.JollyNinja 3.53 | 22 | 77% |
| lorneswork.Predator 1.0 | 9 | 89% |
| mz.MicroGodMelee 1 | 9 | 78% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 1477. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 99 | 71% | 139 |
| sgp.JollyNinja 3.53 | 14 | 10% | 20 |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 6% | 16 |
| lorneswork.Predator 1.0 | 6 | 4% | 14 |
| adt.Ar2 1.0 | 6 | 4% | 6 |
| mz.MicroGodMelee 1 | 5 | 4% | 13 |
| skm.butterfly 1.0 | 1 | 1% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 136112 melee ticks, 143201 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 105 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 105 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 43416 sent, 38592 reached their opponent, 7829 virtual hits (20.3% of those reached).

## Melee bench: F02

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1532840. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 217 over 6 battles (36.2 per battle, most in one battle 47). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 84.6 | 85 / 210 | 2.39 | 18.0% | 29408 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 18.0% | 85 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.8% | 61 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.7% | 24 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 11.2% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.3% | 11 |
| fnc.bandit.Bandit 5.2.0 | 6.0 | 8.4% | 3 |
| sch.Simone 0.3d | 7.5 | 7.4% | 6 |
| Noran.BitchingElk 0.054 | 7.5 | 7.3% | 15 |
| stelo.PatternRobot 1.0 | 9.0 | 5.3% | 3 |
| fullsail.SweetTea 1.1 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 84.1 | 15 / 35 | 5075 |
| 2 | 1 | 67.4 | 83.5 | 14 / 35 | 4918 |
| 3 | 1 | 67.8 | 85.1 | 14 / 35 | 5022 |
| 4 | 1 | 66.6 | 85.1 | 10 / 35 | 4677 |
| 5 | 1 | 66.8 | 81.6 | 16 / 35 | 4825 |
| 6 | 1 | 69.0 | 88.3 | 16 / 35 | 4891 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 54 | 44% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 32 | 66% |
| com.cohesiva.robocode.ManOwaR 1.0 | 18 | 83% |
| sch.Simone 0.3d | 14 | 71% |
| Noran.BitchingElk 0.054 | 11 | 27% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 90% |
| fnc.bandit.Bandit 5.2.0 | 3 | 33% |
| stelo.PatternRobot 1.0 | 3 | 67% |

Hadur died in 125 of 210 rounds, at a mean tick of 1014. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 44 | 35% | 70 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 23 | 18% | 48 |
| Noran.BitchingElk 0.054 | 15 | 12% | 16 |
| fnc.bandit.Bandit 5.2.0 | 11 | 9% | 12 |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 8% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 8% | 18 |
| sch.Simone 0.3d | 9 | 7% | 18 |
| fullsail.SweetTea 1.1 | 2 | 2% | 3 |
| stelo.PatternRobot 1.0 | 1 | 1% | 2 |

Posture (Hadur's M records, 200 rounds): 164035 melee ticks, 45101 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 55 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 58096 sent, 53389 reached their opponent, 9167 virtual hits (17.2% of those reached).

## Melee bench: F03

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1538091. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 148 over 6 battles (24.7 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 93.4 | 169 / 210 | 1.60 | 21.2% | 39814 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 21.2% | 169 |
| radnor.DoctorBob 1.42 | 2.3 | 13.9% | 14 |
| kawigi.nano.Lib 1.0 | 2.8 | 13.1% | 10 |
| vuen.Cake 2.51 | 3.8 | 12.3% | 17 |
| urdos.URDOS 1.3 | 5.0 | 9.0% | 1 |
| adt.Ar1 2.1 | 6.0 | 7.7% | 0 |
| oa.weak.FlyMk1 0.1 | 7.7 | 6.3% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.7 | 6.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.5% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 92.7 | 29 / 35 | 6667 |
| 2 | 1 | 70.9 | 90.2 | 29 / 35 | 6503 |
| 3 | 1 | 72.1 | 95.6 | 26 / 35 | 7042 |
| 4 | 1 | 71.2 | 92.1 | 28 / 35 | 6511 |
| 5 | 1 | 72.0 | 96.2 | 28 / 35 | 6429 |
| 6 | 1 | 71.7 | 93.7 | 29 / 35 | 6662 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 73 | 84% |
| radnor.DoctorBob 1.42 | 56 | 95% |
| kawigi.nano.Lib 1.0 | 50 | 96% |
| urdos.URDOS 1.3 | 4 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| oa.weak.FlyMk1 0.1 | 1 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 14 | 34% | 75 |
| radnor.DoctorBob 1.42 | 11 | 27% | 62 |
| kawigi.nano.Lib 1.0 | 5 | 12% | 43 |
| urdos.URDOS 1.3 | 4 | 10% | 10 |
| adt.Ar1 2.1 | 2 | 5% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 5% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 5% | 3 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 128584 melee ticks, 45193 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 33 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 38946 sent, 34393 reached their opponent, 9086 virtual hits (26.4% of those reached).

## Melee bench: F04

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1536264. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 104 over 6 battles (17.3 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 88.9 | 52 / 210 | 2.00 | 18.8% | 36349 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 21.5% | 140 |
| hadur117.Hadur 3.21eg | 2.0 | 18.8% | 52 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.9% | 12 |
| TNT.TNT 0.99.1 | 4.0 | 11.0% | 6 |
| josago.Jorgito 0.16 | 5.2 | 8.8% | 0 |
| css.Delitioner 0.11 | 6.0 | 7.6% | 0 |
| tj.zombie1n 1.0.1 | 7.2 | 6.2% | 0 |
| rampancy.Durandal 2.1d | 7.7 | 5.5% | 0 |
| spin.Bugstard 0.012b | 9.3 | 3.5% | 0 |
| sp.Nanos.Ember 1.1 | 9.7 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.8 | 90.5 | 9 / 35 | 6039 |
| 2 | 2 | 70.4 | 88.9 | 10 / 35 | 6186 |
| 3 | 2 | 70.3 | 87.9 | 10 / 35 | 6258 |
| 4 | 2 | 69.7 | 88.6 | 7 / 35 | 6165 |
| 5 | 2 | 69.4 | 87.3 | 7 / 35 | 6059 |
| 6 | 2 | 69.6 | 90.5 | 9 / 35 | 5642 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 134 | 20% |
| apc.LeeroyJenkins2 1.0 | 25 | 76% |
| TNT.TNT 0.99.1 | 8 | 63% |
| josago.Jorgito 0.16 | 1 | 100% |

Hadur died in 158 of 210 rounds, at a mean tick of 1803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 124 | 78% | 153 |
| apc.LeeroyJenkins2 1.0 | 21 | 13% | 39 |
| TNT.TNT 0.99.1 | 7 | 4% | 12 |
| css.Delitioner 0.11 | 3 | 2% | 3 |
| josago.Jorgito 0.16 | 3 | 2% | 3 |

Posture (Hadur's M records, 198 rounds): 191378 melee ticks, 147829 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 69 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 69 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 57968 sent, 53297 reached their opponent, 7769 virtual hits (14.6% of those reached).

## Melee bench: F05

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1544655. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 136 over 6 battles (22.7 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 78.7 | 35 / 210 | 2.92 | 15.5% | 25355 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.DemonicRage 3.4 | 1.5 | 17.2% | 66 |
| cb.fire.Firestarter 2.0f | 1.5 | 17.3% | 88 |
| hadur117.Hadur 3.21eg | 3.0 | 15.5% | 35 |
| wompi.Numbat 2.1 | 4.0 | 12.4% | 10 |
| ms.Ares 0.19 | 5.3 | 9.3% | 0 |
| axeBots.HataMoto 3.09 | 5.7 | 9.1% | 11 |
| supersample.SuperBoxBot 1.0 | 7.3 | 5.9% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.2% | 0 |
| GarmBox.Oranges 1.0 | 9.2 | 4.1% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.7 | 79.7 | 6 / 35 | 4159 |
| 2 | 3 | 63.9 | 75.6 | 6 / 35 | 4192 |
| 3 | 3 | 65.0 | 79.0 | 4 / 35 | 4333 |
| 4 | 3 | 65.4 | 80.6 | 6 / 35 | 4398 |
| 5 | 3 | 65.1 | 80.6 | 6 / 35 | 4146 |
| 6 | 3 | 64.1 | 76.5 | 7 / 35 | 4127 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 47 | 30% |
| cb.fire.Firestarter 2.0f | 33 | 21% |
| wompi.Numbat 2.1 | 12 | 50% |
| axeBots.HataMoto 3.09 | 7 | 57% |
| ms.Ares 0.19 | 4 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 1086. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 68 | 39% | 81 |
| cb.fire.Firestarter 2.0f | 59 | 34% | 68 |
| wompi.Numbat 2.1 | 28 | 16% | 34 |
| axeBots.HataMoto 3.09 | 11 | 6% | 14 |
| ms.Ares 0.19 | 6 | 3% | 9 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 2 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 203 rounds): 152801 melee ticks, 70581 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 56 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 46720 sent, 41771 reached their opponent, 6989 virtual hits (16.7% of those reached).

## Melee bench: F06

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1564533. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 158 over 6 battles (26.3 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 90.0 | 125 / 210 | 1.90 | 20.0% | 34121 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 20.0% | 125 |
| jekl.StoneGhost 0.7 | 2.2 | 15.0% | 29 |
| origin.SleepSiphon 1.7b | 3.0 | 13.1% | 38 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.2% | 13 |
| mld.Wisdom 1.0 | 5.2 | 10.2% | 2 |
| gg.Wolverine 2.0 | 6.0 | 8.9% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 6.7% | 2 |
| spinnercat.Omen 1.0 | 8.2 | 5.9% | 0 |
| DBall.NUKE 0.1 | 8.7 | 5.3% | 0 |
| sample.Fire 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 90.2 | 23 / 35 | 5568 |
| 2 | 1 | 71.4 | 92.7 | 25 / 35 | 5853 |
| 3 | 1 | 69.9 | 90.5 | 20 / 35 | 5279 |
| 4 | 1 | 70.5 | 90.8 | 18 / 35 | 5790 |
| 5 | 1 | 70.9 | 88.6 | 22 / 35 | 5919 |
| 6 | 1 | 69.8 | 87.3 | 17 / 35 | 5712 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 71 | 80% |
| origin.SleepSiphon 1.7b | 40 | 58% |
| pe.minimelee.SandboxMiniMelee 1.1 | 38 | 79% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 75% |
| mld.Wisdom 1.0 | 4 | 100% |
| DBall.NUKE 0.1 | 4 | 100% |
| gg.Wolverine 2.0 | 3 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 970. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 29 | 33% | 73 |
| origin.SleepSiphon 1.7b | 27 | 31% | 57 |
| pe.minimelee.SandboxMiniMelee 1.1 | 16 | 18% | 42 |
| mld.Wisdom 1.0 | 6 | 7% | 13 |
| gg.Wolverine 2.0 | 5 | 6% | 9 |
| spinnercat.Omen 1.0 | 2 | 2% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 8 |
| DBall.NUKE 0.1 | 1 | 1% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 147614 melee ticks, 48070 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 32 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 45280 sent, 40722 reached their opponent, 9176 virtual hits (22.5% of those reached).

## Melee bench: F07

hadur117.Hadur 3.21eg against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1531533. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 98 over 6 battles (16.3 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 75.1 | 96.2 | 161 / 210 | 1.30 | 25.7% | 45377 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 25.7% | 161 |
| rtk.Tachikoma 1.0 | 2.0 | 18.7% | 28 |
| franzor.Lizt 1.3.1 | 3.5 | 12.5% | 14 |
| oog.melee.CapuletDroid 1.1 | 3.5 | 12.8% | 9 |
| lrem.micro.MoggFanatic 0.2 | 5.0 | 10.3% | 0 |
| exauge.GateKeeper 1.1.121g | 6.2 | 8.3% | 0 |
| skm.PateranBotlock2 1.0 | 6.8 | 6.8% | 0 |
| sample.Target 1.0 | 8.5 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 8.5 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 75.4 | 96.8 | 26 / 35 | 7841 |
| 2 | 1 | 75.1 | 96.4 | 26 / 35 | 7559 |
| 3 | 1 | 75.2 | 96.1 | 29 / 35 | 7554 |
| 4 | 1 | 75.0 | 95.4 | 25 / 35 | 7519 |
| 5 | 1 | 75.3 | 95.7 | 27 / 35 | 7825 |
| 6 | 1 | 74.6 | 96.8 | 28 / 35 | 7079 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 115 | 80% |
| oog.melee.CapuletDroid 1.1 | 51 | 90% |
| franzor.Lizt 1.3.1 | 33 | 67% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 1845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 30 | 60% | 135 |
| franzor.Lizt 1.3.1 | 11 | 22% | 1 |
| oog.melee.CapuletDroid 1.1 | 7 | 14% | 60 |
| lrem.micro.MoggFanatic 0.2 | 1 | 2% | 3 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 6 |
| drd.Dreadknoght 0.9 | 0 | 0% | 3 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 188693 melee ticks, 100193 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 32 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 52721 sent, 48762 reached their opponent, 10455 virtual hits (21.4% of those reached).

## Melee bench: F08

hadur117.Hadur 3.21eg against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1539022. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 277 over 6 battles (46.2 per battle, most in one battle 58). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 93.1 | 138 / 210 | 1.55 | 22.6% | 31650 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 22.6% | 138 |
| tm.Yuugao 1.0 | 2.2 | 15.7% | 44 |
| shrub.Vapour v159 | 2.8 | 14.4% | 19 |
| com.spp.robocode.MostlyHarmless 010 | 4.0 | 10.8% | 4 |
| m3thos.Eva00 1.1 | 5.2 | 9.5% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 6.0 | 8.3% | 2 |
| qualidafial.MajorDick 1.0.1 | 6.8 | 7.5% | 2 |
| zyx.nano.BacillusComma 1.0 | 8.3 | 5.9% | 0 |
| SHAM.WOW 1.4 | 8.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 94.6 | 22 / 35 | 5296 |
| 2 | 1 | 70.9 | 92.5 | 24 / 35 | 5387 |
| 3 | 1 | 71.3 | 92.1 | 21 / 35 | 5692 |
| 4 | 1 | 70.7 | 94.3 | 24 / 35 | 4911 |
| 5 | 1 | 70.2 | 92.5 | 23 / 35 | 4976 |
| 6 | 1 | 70.7 | 92.5 | 24 / 35 | 5388 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 77 | 62% |
| shrub.Vapour v159 | 54 | 74% |
| com.spp.robocode.MostlyHarmless 010 | 28 | 89% |
| jwst.DAD.DarkAndDarker 1.1 | 10 | 90% |
| m3thos.Eva00 1.1 | 10 | 90% |
| qualidafial.MajorDick 1.0.1 | 8 | 88% |

Hadur died in 73 of 210 rounds, at a mean tick of 1088. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 36 | 49% | 91 |
| shrub.Vapour v159 | 23 | 32% | 55 |
| com.spp.robocode.MostlyHarmless 010 | 7 | 10% | 32 |
| jwst.DAD.DarkAndDarker 1.1 | 2 | 3% | 15 |
| m3thos.Eva00 1.1 | 2 | 3% | 6 |
| qualidafial.MajorDick 1.0.1 | 2 | 3% | 4 |
| SHAM.WOW 1.4 | 1 | 1% | 5 |
| zyx.nano.BacillusComma 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 149297 melee ticks, 57117 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 39 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 44450 sent, 40224 reached their opponent, 7572 virtual hits (18.8% of those reached).

## Melee bench: F09

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1535662. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 157 over 6 battles (26.2 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 81.0 | 71 / 210 | 2.71 | 16.3% | 22867 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 17.1% | 90 |
| hadur117.Hadur 3.21eg | 1.8 | 16.3% | 71 |
| kc.micro.Figment 1.0 | 2.8 | 14.3% | 22 |
| yagami.Tidus 0.11 | 4.7 | 10.6% | 3 |
| pedersen.Grishnakh 1.0 | 5.0 | 10.2% | 10 |
| mc2.enemy.Original 0.9 | 5.3 | 9.6% | 14 |
| dft.Calliope 5.6 | 7.0 | 7.2% | 0 |
| step.nanoPri 1.0 | 8.2 | 5.6% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 4.5% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.2 | 84.4 | 15 / 35 | 3981 |
| 2 | 2 | 63.5 | 75.2 | 10 / 35 | 3530 |
| 3 | 1 | 65.8 | 83.8 | 14 / 35 | 3577 |
| 4 | 2 | 66.0 | 81.6 | 12 / 35 | 3989 |
| 5 | 3 | 61.6 | 72.1 | 4 / 35 | 3398 |
| 6 | 1 | 68.5 | 88.6 | 16 / 35 | 4392 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 62 | 27% |
| kc.micro.Figment 1.0 | 45 | 82% |
| mc2.enemy.Original 0.9 | 12 | 33% |
| pedersen.Grishnakh 1.0 | 8 | 50% |
| yagami.Tidus 0.11 | 7 | 86% |
| dft.Calliope 5.6 | 3 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 999. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 59 | 42% | 76 |
| kc.micro.Figment 1.0 | 23 | 17% | 60 |
| mc2.enemy.Original 0.9 | 18 | 13% | 22 |
| yagami.Tidus 0.11 | 14 | 10% | 20 |
| pedersen.Grishnakh 1.0 | 11 | 8% | 15 |
| dft.Calliope 5.6 | 5 | 4% | 8 |
| robar.nano.Assertive_Melee 0.2 | 5 | 4% | 5 |
| step.nanoPri 1.0 | 2 | 1% | 2 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |

Posture (Hadur's M records, 200 rounds): 149300 melee ticks, 56085 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 43 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 47772 sent, 43237 reached their opponent, 6258 virtual hits (14.5% of those reached).

## Melee bench: F10

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1534511. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 203 over 6 battles (33.8 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 93.9 | 165 / 210 | 1.55 | 20.6% | 34417 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 20.6% | 165 |
| DTF.Kludgy 1.2b | 2.8 | 13.5% | 19 |
| ne.Chimera 1.2 | 2.8 | 13.4% | 11 |
| ejb.Polaris 1.0.1 | 3.3 | 12.8% | 7 |
| vStar.RAFzilla 2.15 | 5.5 | 10.0% | 2 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.0% | 3 |
| kurios.DOSexe .9b | 7.8 | 5.6% | 1 |
| sam.Samspin 1.0 | 8.0 | 5.4% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 4.7% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 3.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 88.3 | 28 / 35 | 5473 |
| 2 | 1 | 70.3 | 93.7 | 26 / 35 | 5300 |
| 3 | 1 | 72.9 | 98.1 | 31 / 35 | 6150 |
| 4 | 1 | 71.7 | 96.2 | 28 / 35 | 5869 |
| 5 | 1 | 72.2 | 96.5 | 28 / 35 | 6217 |
| 6 | 1 | 70.0 | 90.5 | 24 / 35 | 5408 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ejb.Polaris 1.0.1 | 59 | 90% |
| DTF.Kludgy 1.2b | 52 | 81% |
| ne.Chimera 1.2 | 45 | 89% |
| tvv.micro.Antares 1.1.1 | 16 | 100% |
| vStar.RAFzilla 2.15 | 11 | 100% |
| kurios.DOSexe .9b | 1 | 100% |
| sam.Samspin 1.0 | 1 | 100% |
| donjezza.Muncho 1.0 | 1 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 17 | 38% | 61 |
| ejb.Polaris 1.0.1 | 12 | 27% | 52 |
| ne.Chimera 1.2 | 11 | 24% | 51 |
| tvv.micro.Antares 1.1.1 | 2 | 4% | 13 |
| vStar.RAFzilla 2.15 | 1 | 2% | 18 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 5 |
| kurios.DOSexe .9b | 1 | 2% | 5 |
| sam.Samspin 1.0 | 0 | 0% | 2 |
| donjezza.Muncho 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 133669 melee ticks, 58341 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 72 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 44570 sent, 39978 reached their opponent, 7536 virtual hits (18.9% of those reached).

## Melee bench: F11

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1584051. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 156 over 6 battles (26.0 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 83.2 | 70 / 210 | 2.51 | 16.7% | 24000 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.3 | 16.7% | 70 |
| rz.Aleph 0.34 | 1.7 | 16.3% | 71 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.8% | 36 |
| djc.DynaBot 0.1.1 | 4.3 | 10.6% | 13 |
| rdt199.Warlord 0.73 | 5.7 | 9.1% | 7 |
| br2.MobyDickBot 1.6 | 6.3 | 8.7% | 9 |
| uji.YellohFellah 1.0 | 6.5 | 8.3% | 6 |
| KiraNL.Chupacabra 0.4 | 7.2 | 7.7% | 1 |
| stelo.MirrorNano 1.3 | 9.2 | 4.9% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 81.6 | 11 / 35 | 4028 |
| 2 | 1 | 66.2 | 86.0 | 11 / 35 | 4092 |
| 3 | 2 | 64.6 | 78.7 | 12 / 35 | 3916 |
| 4 | 1 | 65.0 | 85.4 | 8 / 35 | 3751 |
| 5 | 1 | 66.4 | 85.1 | 14 / 35 | 4208 |
| 6 | 1 | 65.6 | 82.5 | 14 / 35 | 4005 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 61 | 43% |
| cx.mini.Nimrod 0.55 | 24 | 50% |
| br2.MobyDickBot 1.6 | 15 | 73% |
| djc.DynaBot 0.1.1 | 13 | 46% |
| uji.YellohFellah 1.0 | 11 | 91% |
| rdt199.Warlord 0.73 | 6 | 67% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 963. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 65 | 46% | 90 |
| cx.mini.Nimrod 0.55 | 29 | 21% | 43 |
| djc.DynaBot 0.1.1 | 13 | 9% | 19 |
| rdt199.Warlord 0.73 | 11 | 8% | 14 |
| KiraNL.Chupacabra 0.4 | 9 | 6% | 11 |
| uji.YellohFellah 1.0 | 6 | 4% | 16 |
| br2.MobyDickBot 1.6 | 5 | 4% | 12 |
| stelo.MirrorNano 1.3 | 2 | 1% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 1 |

Posture (Hadur's M records, 202 rounds): 158768 melee ticks, 45786 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 55 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 51912 sent, 47082 reached their opponent, 6260 virtual hits (13.3% of those reached).

## Melee bench: F12

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1544008. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 161 over 6 battles (26.8 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 89.0 | 139 / 210 | 1.99 | 19.0% | 25603 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 19.0% | 139 |
| nat.PallasHawk 1.0 | 2.3 | 13.5% | 31 |
| bts.wiki.RipCurl 0.9b | 2.8 | 13.3% | 22 |
| darkcanuck.Leon 1.01 | 3.8 | 12.8% | 13 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.1% | 4 |
| jrm.Test0 1.0 | 6.2 | 7.8% | 1 |
| jp.Perpy 16.0 | 7.7 | 6.2% | 0 |
| cs.sheldor.Talon 1.1 | 8.2 | 6.5% | 0 |
| stuff.Vlad 0.1 | 8.8 | 5.5% | 0 |
| jaybot.bots.Oddball 4.0 | 9.2 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 88.9 | 23 / 35 | 3925 |
| 2 | 1 | 69.3 | 91.1 | 22 / 35 | 4375 |
| 3 | 1 | 67.4 | 84.4 | 22 / 35 | 4127 |
| 4 | 1 | 69.9 | 92.7 | 25 / 35 | 4538 |
| 5 | 1 | 69.3 | 89.2 | 24 / 35 | 4672 |
| 6 | 1 | 68.2 | 87.9 | 23 / 35 | 3966 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 50 | 74% |
| darkcanuck.Leon 1.01 | 48 | 94% |
| nat.PallasHawk 1.0 | 44 | 80% |
| brainfade.melee.Genghis 0.36 | 11 | 91% |
| jaybot.bots.Oddball 4.0 | 7 | 100% |
| jrm.Test0 1.0 | 2 | 50% |
| jp.Perpy 16.0 | 2 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 730. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 20 | 28% | 39 |
| nat.PallasHawk 1.0 | 16 | 22% | 53 |
| darkcanuck.Leon 1.01 | 10 | 14% | 65 |
| brainfade.melee.Genghis 0.36 | 9 | 13% | 18 |
| jrm.Test0 1.0 | 6 | 8% | 7 |
| jaybot.bots.Oddball 4.0 | 4 | 6% | 11 |
| cs.sheldor.Talon 1.1 | 4 | 6% | 6 |
| jp.Perpy 16.0 | 3 | 4% | 9 |
| stuff.Vlad 0.1 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 127425 melee ticks, 57877 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 42 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 43408 sent, 38571 reached their opponent, 6502 virtual hits (16.9% of those reached).

## Melee bench: F13

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1527550. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 149 over 6 battles (24.8 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 79.3 | 49 / 210 | 2.87 | 15.5% | 25020 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.3 | 16.9% | 55 |
| mn.Combat 3.25.0 | 2.2 | 16.3% | 77 |
| hadur117.Hadur 3.21eg | 2.5 | 15.5% | 49 |
| shinh.Entangled 0.3 | 4.5 | 11.8% | 19 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.9% | 10 |
| apc.Colossus2 0.17 | 6.3 | 7.6% | 0 |
| stelo.Wang 1.0 | 6.7 | 6.8% | 0 |
| maribo.FollowFire 1 | 8.5 | 5.1% | 0 |
| ayk.WallHugger 1.0 | 8.5 | 4.9% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.6 | 75.2 | 2 / 35 | 4234 |
| 2 | 3 | 62.6 | 75.2 | 6 / 35 | 3699 |
| 3 | 1 | 67.0 | 85.1 | 13 / 35 | 4496 |
| 4 | 2 | 65.9 | 84.1 | 10 / 35 | 4325 |
| 5 | 3 | 64.4 | 78.4 | 10 / 35 | 3928 |
| 6 | 3 | 64.1 | 77.5 | 8 / 35 | 4338 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 48 | 35% |
| ags.Glacier 0.2.11 | 40 | 50% |
| shinh.Entangled 0.3 | 17 | 24% |
| gh.micro.Gruweltje 0.7 | 10 | 60% |
| stelo.Wang 1.0 | 2 | 100% |

Hadur died in 162 of 210 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 53 | 33% | 74 |
| mn.Combat 3.25.0 | 52 | 32% | 68 |
| shinh.Entangled 0.3 | 19 | 12% | 21 |
| gh.micro.Gruweltje 0.7 | 18 | 11% | 23 |
| stelo.Wang 1.0 | 9 | 6% | 10 |
| apc.Colossus2 0.17 | 5 | 3% | 7 |
| maribo.FollowFire 1 | 5 | 3% | 6 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 200 rounds): 137771 melee ticks, 46205 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 93 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 93 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 40976 sent, 36061 reached their opponent, 5954 virtual hits (16.5% of those reached).

## Melee bench: F14

hadur117.Hadur 3.21eg against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1549803. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 170 over 6 battles (28.3 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 97.0 | 188 / 210 | 1.24 | 24.3% | 37012 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 24.3% | 188 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 16.4% | 12 |
| co.edu.usb.rc.LidisTron 1.0 | 4.3 | 10.2% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 4.7 | 10.4% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 4.8 | 11.1% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.8% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 5.8 | 9.4% | 6 |
| pa.Improved 1.0 | 8.0 | 6.5% | 1 |
| sample.TrackFire 1.0 | 9.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 95.7 | 29 / 35 | 6051 |
| 2 | 1 | 73.4 | 98.9 | 32 / 35 | 6385 |
| 3 | 1 | 72.9 | 96.1 | 32 / 35 | 6068 |
| 4 | 1 | 73.8 | 99.6 | 34 / 35 | 6273 |
| 5 | 1 | 72.6 | 94.3 | 29 / 35 | 6169 |
| 6 | 1 | 73.0 | 97.1 | 32 / 35 | 6066 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 117 | 95% |
| sanyi.mikrobi.Roberto 1.0 | 27 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 23 | 78% |
| co.edu.usb.rc.LidisTron 1.0 | 14 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 13 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 22 of 210 rounds, at a mean tick of 1020. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 11 | 50% | 104 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 32% | 30 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 9% | 8 |
| sanyi.mikrobi.Roberto 1.0 | 1 | 5% | 37 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 5% | 12 |
| co.edu.usb.rc.LidisTron 1.0 | 0 | 0% | 10 |
| pa.Improved 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 199 rounds): 124301 melee ticks, 52188 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 40 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 36974 sent, 33001 reached their opponent, 8391 virtual hits (25.4% of those reached).

## Melee bench: F15

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1527288. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 185 over 6 battles (30.8 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 87.0 | 107 / 210 | 2.17 | 18.8% | 30381 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 18.8% | 107 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.5% | 19 |
| mld.DustBunny 3.8 | 3.0 | 13.2% | 8 |
| emp.Yngwie 1.11 | 3.5 | 12.6% | 49 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.9% | 7 |
| kawigi.robot.Girl 1.2 | 5.7 | 9.4% | 19 |
| Grystrion.TrackerWO 1.0 | 7.3 | 6.9% | 0 |
| lambdaxy.TBot 0.1 | 7.7 | 6.7% | 0 |
| divineomega.TrialBot 0.003 | 9.5 | 4.6% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 88.9 | 22 / 35 | 4816 |
| 2 | 1 | 69.0 | 87.3 | 18 / 35 | 5500 |
| 3 | 1 | 68.5 | 85.7 | 17 / 35 | 5225 |
| 4 | 1 | 68.1 | 87.6 | 14 / 35 | 4909 |
| 5 | 1 | 66.4 | 80.6 | 14 / 35 | 4618 |
| 6 | 1 | 70.2 | 91.7 | 22 / 35 | 5313 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 49 | 47% |
| kawigi.micro.Shiz 1.1 | 35 | 74% |
| mld.DustBunny 3.8 | 30 | 93% |
| kawigi.robot.Girl 1.2 | 26 | 65% |
| cb.nano.Insomnia 1.0 | 10 | 90% |
| divineomega.TrialBot 0.003 | 3 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 1183. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 46 | 45% | 82 |
| kawigi.micro.Shiz 1.1 | 21 | 20% | 37 |
| kawigi.robot.Girl 1.2 | 15 | 15% | 24 |
| mld.DustBunny 3.8 | 10 | 10% | 36 |
| cb.nano.Insomnia 1.0 | 9 | 9% | 9 |
| divineomega.TrialBot 0.003 | 1 | 1% | 15 |
| Grystrion.TrackerWO 1.0 | 1 | 1% | 4 |
| lambdaxy.TBot 0.1 | 0 | 0% | 3 |

Posture (Hadur's M records, 201 rounds): 165046 melee ticks, 66237 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 46 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 52840 sent, 48193 reached their opponent, 7745 virtual hits (16.1% of those reached).

## Melee bench: F16

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1554583. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 175 over 6 battles (29.2 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 91.3 | 124 / 210 | 1.78 | 20.3% | 34722 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 20.3% | 124 |
| gh.Griezel 0.5.2 | 2.0 | 16.0% | 48 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.1% | 9 |
| bvh.fnr.Fenrir 0.36l | 4.7 | 9.7% | 2 |
| techdude.forest.FlamingForest 1.1 | 4.7 | 9.8% | 18 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.5% | 3 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.2% | 5 |
| repositorio.NanoStep 1.0 | 8.7 | 5.1% | 0 |
| asd.Cthulhu 1.3 | 8.8 | 4.9% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.5 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 87.9 | 17 / 35 | 5221 |
| 2 | 1 | 72.0 | 94.6 | 23 / 35 | 6060 |
| 3 | 1 | 70.5 | 88.9 | 18 / 35 | 6224 |
| 4 | 1 | 72.3 | 96.2 | 26 / 35 | 5985 |
| 5 | 1 | 70.7 | 90.5 | 21 / 35 | 5917 |
| 6 | 1 | 69.7 | 89.8 | 19 / 35 | 5315 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 88 | 64% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 31 | 84% |
| techdude.forest.FlamingForest 1.1 | 31 | 68% |
| bvh.fnr.Fenrir 0.36l | 12 | 83% |
| stelo.IntrinsicVolatility 1.4 | 6 | 50% |
| tvv.nano.Polaris 1.2 | 6 | 100% |
| divineomega.DivineBot 1.9.4.5 | 2 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 1573. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 41 | 47% | 102 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 14 | 16% | 34 |
| techdude.forest.FlamingForest 1.1 | 13 | 15% | 38 |
| bvh.fnr.Fenrir 0.36l | 9 | 10% | 15 |
| stelo.IntrinsicVolatility 1.4 | 6 | 7% | 10 |
| repositorio.NanoStep 1.0 | 2 | 2% | 3 |
| asd.Cthulhu 1.3 | 1 | 1% | 2 |
| tvv.nano.Polaris 1.2 | 0 | 0% | 4 |
| divineomega.DivineBot 1.9.4.5 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 172862 melee ticks, 118346 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 57 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 55026 sent, 50378 reached their opponent, 8617 virtual hits (17.1% of those reached).

## Melee bench: F17

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1536192. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 177 over 6 battles (29.5 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 88.0 | 109 / 210 | 2.08 | 19.6% | 35316 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 19.6% | 109 |
| et.Predator 1.8 | 2.5 | 13.7% | 27 |
| oog.melee.Mercutio 1.0 | 2.8 | 13.0% | 31 |
| cx.BlestPain 1.41 | 3.8 | 11.8% | 31 |
| ahf.NanoAndrew .4 | 4.8 | 10.6% | 5 |
| maribo.melee.BMV 0.1 | 6.2 | 9.2% | 2 |
| nic.Nicator 2.4 | 6.8 | 8.4% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.6% | 2 |
| tex.Longbot 0.4 | 8.5 | 5.7% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 85.1 | 19 / 35 | 5719 |
| 2 | 1 | 69.0 | 87.0 | 18 / 35 | 5387 |
| 3 | 1 | 71.0 | 92.4 | 22 / 35 | 5992 |
| 4 | 1 | 70.4 | 90.5 | 18 / 35 | 6081 |
| 5 | 1 | 69.4 | 84.8 | 18 / 35 | 6017 |
| 6 | 1 | 69.8 | 88.6 | 14 / 35 | 6120 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 62 | 73% |
| oog.melee.Mercutio 1.0 | 49 | 69% |
| cx.BlestPain 1.41 | 27 | 37% |
| ahf.NanoAndrew .4 | 11 | 82% |
| maribo.melee.BMV 0.1 | 9 | 78% |
| nic.Nicator 2.4 | 3 | 67% |
| tex.Longbot 0.4 | 2 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 1319. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 30 | 29% | 47 |
| et.Predator 1.8 | 28 | 27% | 71 |
| oog.melee.Mercutio 1.0 | 20 | 20% | 50 |
| maribo.melee.BMV 0.1 | 9 | 9% | 14 |
| ahf.NanoAndrew .4 | 8 | 8% | 15 |
| nic.Nicator 2.4 | 3 | 3% | 8 |
| tex.Longbot 0.4 | 2 | 2% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 2% | 2 |

Posture (Hadur's M records, 199 rounds): 160834 melee ticks, 91273 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 160 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 160 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 52209 sent, 47608 reached their opponent, 9968 virtual hits (20.9% of those reached).

## Melee bench: F18

hadur117.Hadur 3.21eg against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1544101. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 261 over 6 battles (43.5 per battle, most in one battle 52). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 92.7 | 145 / 210 | 1.59 | 22.4% | 29196 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 22.4% | 145 |
| agd.Mooserwirt2 2.7 | 2.2 | 13.7% | 28 |
| uji.DBH 1.1 | 3.0 | 12.8% | 16 |
| sigterm.Sigterm 1.0 | 4.3 | 10.6% | 12 |
| spinnercat.Robovirus 2.718 | 4.8 | 10.7% | 4 |
| ratosh.Nobo 0.21 | 5.7 | 9.7% | 2 |
| kawigi.mini.Fhqwhgads 1.1 | 7.2 | 8.1% | 1 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.3 | 6.2% | 1 |
| stelo.WangRobot 1.0 | 8.5 | 5.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 92.9 | 23 / 35 | 4638 |
| 2 | 1 | 70.1 | 93.6 | 25 / 35 | 4701 |
| 3 | 1 | 70.9 | 93.6 | 26 / 35 | 4948 |
| 4 | 1 | 72.0 | 95.7 | 29 / 35 | 5272 |
| 5 | 1 | 68.3 | 86.4 | 19 / 35 | 4609 |
| 6 | 1 | 70.5 | 93.9 | 23 / 35 | 5028 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| uji.DBH 1.1 | 48 | 75% |
| agd.Mooserwirt2 2.7 | 46 | 67% |
| sigterm.Sigterm 1.0 | 38 | 82% |
| spinnercat.Robovirus 2.718 | 23 | 91% |
| ratosh.Nobo 0.21 | 13 | 85% |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 100% |
| stelo.WangRobot 1.0 | 5 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 67% |

Hadur died in 65 of 210 rounds, at a mean tick of 1009. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 24 | 37% | 62 |
| uji.DBH 1.1 | 17 | 26% | 44 |
| sigterm.Sigterm 1.0 | 10 | 15% | 30 |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 6% | 19 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 6% | 10 |
| spinnercat.Robovirus 2.718 | 3 | 5% | 21 |
| ratosh.Nobo 0.21 | 2 | 3% | 18 |
| stelo.WangRobot 1.0 | 1 | 2% | 5 |

Posture (Hadur's M records, 198 rounds): 129187 melee ticks, 56916 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 48 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 40108 sent, 36041 reached their opponent, 8097 virtual hits (22.5% of those reached).

## Melee bench: F19

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1542788. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 190 over 6 battles (31.7 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.6 | 98.5 | 196 / 210 | 1.14 | 22.6% | 37472 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 22.6% | 196 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.5% | 9 |
| mld.Infinity 2.2 | 3.5 | 11.9% | 3 |
| krillr.mini.JointStrike 2.0.0 | 3.8 | 11.5% | 3 |
| erdnis.Rover 0.3 | 4.7 | 10.8% | 2 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.6% | 0 |
| mbh.Mbh 0.1 | 7.0 | 7.2% | 0 |
| pac.ABC 2.1 | 8.2 | 6.2% | 0 |
| pbg.R2D2 1.0 | 8.7 | 5.7% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.8 | 99.0 | 34 / 35 | 6175 |
| 2 | 1 | 72.9 | 97.5 | 32 / 35 | 5775 |
| 3 | 1 | 74.5 | 100.0 | 35 / 35 | 6757 |
| 4 | 1 | 73.3 | 98.7 | 31 / 35 | 6027 |
| 5 | 1 | 73.1 | 96.8 | 31 / 35 | 6309 |
| 6 | 1 | 73.8 | 98.7 | 33 / 35 | 6429 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 109 | 96% |
| krillr.mini.JointStrike 2.0.0 | 27 | 89% |
| mld.Infinity 2.2 | 25 | 100% |
| erdnis.Rover 0.3 | 19 | 89% |
| patson.PatsonTestBot 1.0 | 10 | 100% |
| pac.ABC 2.1 | 8 | 100% |
| pbg.R2D2 1.0 | 5 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |

Hadur died in 19 of 210 rounds, at a mean tick of 1006. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| krillr.mini.JointStrike 2.0.0 | 8 | 42% | 38 |
| davidalves.net.DuelistMiniMelee 1.2 | 4 | 21% | 72 |
| mld.Infinity 2.2 | 2 | 11% | 32 |
| erdnis.Rover 0.3 | 2 | 11% | 20 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 18 |
| pbg.R2D2 1.0 | 0 | 0% | 9 |
| mbh.Mbh 0.1 | 0 | 0% | 8 |
| pac.ABC 2.1 | 0 | 0% | 7 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 126239 melee ticks, 60678 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 42 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 42612 sent, 38022 reached their opponent, 9065 virtual hits (23.8% of those reached).

## Melee bench: F20

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1531908. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 154 over 6 battles (25.7 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 92.3 | 132 / 210 | 1.70 | 20.9% | 36923 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 20.9% | 132 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.9% | 42 |
| fwb.Nine 1.0.1 | 3.5 | 11.2% | 19 |
| catcat20.Rabbit 0.001 | 4.2 | 10.5% | 15 |
| nz.jdc.nano.GridFu 1.0 | 4.3 | 10.5% | 0 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.7% | 0 |
| bayen.nut.Squirrel 1.615 | 7.0 | 7.2% | 2 |
| djdjdj.NanoSkunk10 1.0 | 8.5 | 5.7% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.5 | 5.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 91.7 | 24 / 35 | 5905 |
| 2 | 1 | 71.5 | 92.4 | 23 / 35 | 6234 |
| 3 | 1 | 71.6 | 91.1 | 21 / 35 | 6411 |
| 4 | 1 | 71.4 | 92.7 | 23 / 35 | 6025 |
| 5 | 1 | 71.4 | 93.7 | 21 / 35 | 6180 |
| 6 | 1 | 71.1 | 92.1 | 20 / 35 | 6168 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 84 | 75% |
| fwb.Nine 1.0.1 | 36 | 81% |
| catcat20.Rabbit 0.001 | 26 | 77% |
| nz.jdc.nano.GridFu 1.0 | 10 | 100% |
| m3thos.mini.Eva01 0.5.5 | 6 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| bayen.nut.Squirrel 1.615 | 1 | 0% |

Hadur died in 78 of 210 rounds, at a mean tick of 1105. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 45 | 58% | 112 |
| fwb.Nine 1.0.1 | 13 | 17% | 19 |
| catcat20.Rabbit 0.001 | 11 | 14% | 33 |
| bayen.nut.Squirrel 1.615 | 4 | 5% | 6 |
| nz.jdc.nano.GridFu 1.0 | 3 | 4% | 16 |
| m3thos.mini.Eva01 0.5.5 | 2 | 3% | 15 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 3 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 200 rounds): 164813 melee ticks, 60375 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 31 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 50861 sent, 46248 reached their opponent, 10222 virtual hits (22.1% of those reached).

## Melee bench: F21

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478075. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 123 over 6 battles (20.5 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 92.4 | 127 / 210 | 1.69 | 20.6% | 36050 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 20.6% | 127 |
| eem.EvBot v4.6.16 | 2.0 | 17.0% | 71 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.5% | 5 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.2% | 3 |
| eld.Hmm 1.0 | 5.5 | 8.1% | 5 |
| oa.weak.BotherBot 0.1 | 5.7 | 7.8% | 0 |
| fire219.CatBot 1.0 | 7.5 | 5.9% | 0 |
| el.JumpShoot 0.2 | 8.2 | 5.6% | 0 |
| PSW.Relentless 0.1 | 8.3 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 94.6 | 25 / 35 | 6329 |
| 2 | 1 | 72.1 | 93.7 | 25 / 35 | 6249 |
| 3 | 1 | 70.8 | 91.1 | 18 / 35 | 5744 |
| 4 | 1 | 71.8 | 91.7 | 23 / 35 | 6142 |
| 5 | 1 | 70.1 | 93.0 | 18 / 35 | 5496 |
| 6 | 1 | 71.0 | 90.2 | 18 / 35 | 6090 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 132 | 60% |
| cf.RiO.RiOx 4.2.1 | 29 | 90% |
| dummy.mini.Scimitar 1.01 | 22 | 82% |
| eld.Hmm 1.0 | 5 | 80% |

Hadur died in 84 of 210 rounds, at a mean tick of 1612. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 56 | 67% | 115 |
| dummy.mini.Scimitar 1.01 | 11 | 13% | 46 |
| cf.RiO.RiOx 4.2.1 | 7 | 8% | 30 |
| eld.Hmm 1.0 | 5 | 6% | 12 |
| PSW.Relentless 0.1 | 3 | 4% | 3 |
| el.JumpShoot 0.2 | 1 | 1% | 1 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 2 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 165619 melee ticks, 119865 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 80 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 49530 sent, 44972 reached their opponent, 8048 virtual hits (17.9% of those reached).

## Melee bench: F22

hadur117.Hadur 3.21eg against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488347. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 181 over 6 battles (30.2 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.1 | 95 / 210 | 2.03 | 20.0% | 26615 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.2 | 20.0% | 95 |
| pe.SandboxDT 2.71m | 2.2 | 17.3% | 61 |
| kvk.HebusLeTroll 0.35 | 2.7 | 15.9% | 30 |
| jlm.javaDisturbance 0.59 | 4.0 | 14.1% | 19 |
| bigpete.Stewie 1.0 | 5.0 | 10.5% | 5 |
| tad.Dalek98 0.98 | 6.8 | 5.9% | 0 |
| yk.JahRoslav 1.1 | 6.8 | 6.4% | 0 |
| gg.Squaraus 0.6 | 7.3 | 5.6% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 87.5 | 12 / 35 | 4574 |
| 2 | 1 | 69.0 | 88.9 | 19 / 35 | 4520 |
| 3 | 1 | 69.5 | 87.5 | 18 / 35 | 4510 |
| 4 | 2 | 65.7 | 80.4 | 10 / 35 | 3875 |
| 5 | 1 | 69.4 | 91.4 | 18 / 35 | 4536 |
| 6 | 1 | 68.2 | 86.8 | 18 / 35 | 4600 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 57 | 35% |
| jlm.javaDisturbance 0.59 | 45 | 73% |
| kvk.HebusLeTroll 0.35 | 43 | 65% |
| bigpete.Stewie 1.0 | 13 | 85% |
| yk.JahRoslav 1.1 | 2 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 1075. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 51 | 44% | 76 |
| jlm.javaDisturbance 0.59 | 29 | 25% | 57 |
| kvk.HebusLeTroll 0.35 | 24 | 21% | 46 |
| bigpete.Stewie 1.0 | 8 | 7% | 18 |
| tad.Dalek98 0.98 | 2 | 2% | 3 |
| yk.JahRoslav 1.1 | 1 | 1% | 4 |
| gg.Squaraus 0.6 | 1 | 1% | 3 |
| pbg.NinjaX 1.2 | 0 | 0% | 3 |

Posture (Hadur's M records, 199 rounds): 154999 melee ticks, 59235 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 35 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 45033 sent, 40979 reached their opponent, 5702 virtual hits (13.9% of those reached).

## Melee bench: F23

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1625427. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 157 over 6 battles (26.2 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.8 | 97.2 | 181 / 210 | 1.25 | 22.6% | 40137 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 22.6% | 181 |
| pe.SandboxLump 1.52 | 2.2 | 16.2% | 22 |
| cre.Karolos 0.32 | 2.8 | 14.0% | 5 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 9.8% | 0 |
| stelo.RamTrackSurfer 1.2 | 5.0 | 9.1% | 2 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.0 | 8.4% | 0 |
| cw.megas.Blade 0.8 | 6.8 | 7.7% | 0 |
| sample.Walls 1.0 | 7.8 | 7.0% | 0 |
| rrh.Iwillfindyou 2.0 | 9.3 | 2.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 96.2 | 30 / 35 | 6464 |
| 2 | 1 | 74.4 | 97.5 | 31 / 35 | 6742 |
| 3 | 1 | 73.2 | 96.5 | 29 / 35 | 6209 |
| 4 | 1 | 73.9 | 97.5 | 30 / 35 | 6798 |
| 5 | 1 | 74.6 | 98.7 | 31 / 35 | 7183 |
| 6 | 1 | 73.8 | 96.8 | 30 / 35 | 6741 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 111 | 88% |
| cre.Karolos 0.32 | 62 | 97% |
| stelo.RamTrackSurfer 1.2 | 11 | 82% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| stelo.AreaTargetingBot 1.1 | 3 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 29 of 210 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 13 | 45% | 97 |
| cre.Karolos 0.32 | 8 | 28% | 61 |
| stelo.RamTrackSurfer 1.2 | 3 | 10% | 18 |
| stelo.AreaTargetingBot 1.1 | 3 | 10% | 13 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 7% | 9 |
| sample.Walls 1.0 | 0 | 0% | 5 |
| cw.megas.Blade 0.8 | 0 | 0% | 3 |

Posture (Hadur's M records, 198 rounds): 122325 melee ticks, 55940 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 34 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 38496 sent, 33838 reached their opponent, 9999 virtual hits (29.5% of those reached).

## Melee bench: F24

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1471824. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 167 over 6 battles (27.8 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 83.4 | 84 / 210 | 2.50 | 17.1% | 25147 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 17.1% | 84 |
| florent.XSeries.X2 0.12 | 2.5 | 13.8% | 34 |
| rz.GlowBlowMelee 1.4 | 2.8 | 13.8% | 31 |
| pedersen.Ugluk 1.1.1 | 4.2 | 12.1% | 19 |
| davidalves.Phoenix 0.54 | 4.5 | 12.0% | 35 |
| oog.melee.Corsair 1.0 | 6.0 | 8.8% | 6 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 6.6% | 1 |
| lunchie.Lunchbox 0.93 | 8.3 | 6.0% | 0 |
| as.FrankTheTank 1.3 | 9.0 | 5.4% | 0 |
| evd.X1 0.01 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 79.0 | 13 / 35 | 3955 |
| 2 | 1 | 66.7 | 86.3 | 13 / 35 | 4053 |
| 3 | 1 | 65.8 | 82.9 | 12 / 35 | 4064 |
| 4 | 1 | 67.4 | 85.4 | 18 / 35 | 4466 |
| 5 | 1 | 67.0 | 84.8 | 14 / 35 | 4393 |
| 6 | 1 | 66.0 | 81.9 | 14 / 35 | 4216 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 46 | 70% |
| florent.XSeries.X2 0.12 | 30 | 60% |
| pedersen.Ugluk 1.1.1 | 26 | 65% |
| davidalves.Phoenix 0.54 | 16 | 31% |
| oog.melee.Corsair 1.0 | 14 | 64% |
| stelo.SoJNanoMelee 1.1 | 2 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 811. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 35 | 28% | 53 |
| rz.GlowBlowMelee 1.4 | 28 | 22% | 57 |
| davidalves.Phoenix 0.54 | 25 | 20% | 35 |
| pedersen.Ugluk 1.1.1 | 24 | 19% | 36 |
| oog.melee.Corsair 1.0 | 7 | 6% | 20 |
| stelo.SoJNanoMelee 1.1 | 3 | 2% | 3 |
| evd.X1 0.01 | 2 | 2% | 2 |
| as.FrankTheTank 1.3 | 1 | 1% | 2 |
| lunchie.Lunchbox 0.93 | 1 | 1% | 2 |

Posture (Hadur's M records, 200 rounds): 135035 melee ticks, 40220 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 137 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 137 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 45016 sent, 40077 reached their opponent, 7215 virtual hits (18.0% of those reached).

## Melee bench: F25

hadur117.Hadur 3.21eg against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1466818. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 146 over 6 battles (24.3 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 88.4 | 143 / 210 | 1.93 | 20.8% | 23175 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 20.8% | 143 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 14.9% | 10 |
| voidious.mini.BrokenSword 2.0.3 | 2.7 | 14.7% | 16 |
| jdw.Hurricane 1.4 | 4.0 | 13.4% | 24 |
| ds.Oo 2.2 | 5.0 | 10.4% | 10 |
| awesomeness.Elite 1.0 | 6.8 | 7.3% | 2 |
| adt.Ar2 1.1 | 6.8 | 7.4% | 1 |
| gjr.Cephalosporin 0.1 | 7.3 | 6.7% | 4 |
| amk.ChumbaMini 0.2 | 9.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 81.1 | 18 / 35 | 3497 |
| 2 | 1 | 68.4 | 85.7 | 22 / 35 | 4035 |
| 3 | 1 | 69.0 | 89.3 | 25 / 35 | 3593 |
| 4 | 1 | 69.9 | 93.2 | 26 / 35 | 3920 |
| 5 | 1 | 69.9 | 88.9 | 26 / 35 | 4195 |
| 6 | 1 | 69.9 | 92.1 | 26 / 35 | 3935 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 48 | 98% |
| jdw.Hurricane 1.4 | 46 | 83% |
| voidious.mini.BrokenSword 2.0.3 | 45 | 84% |
| ds.Oo 2.2 | 8 | 75% |
| gjr.Cephalosporin 0.1 | 5 | 100% |
| adt.Ar2 1.1 | 5 | 80% |
| awesomeness.Elite 1.0 | 4 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 641. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 19 | 28% | 47 |
| voidious.micro.BlitzBat 1.05 | 16 | 24% | 55 |
| jdw.Hurricane 1.4 | 14 | 21% | 47 |
| ds.Oo 2.2 | 8 | 12% | 23 |
| adt.Ar2 1.1 | 7 | 10% | 15 |
| awesomeness.Elite 1.0 | 3 | 4% | 14 |
| gjr.Cephalosporin 0.1 | 0 | 0% | 6 |
| amk.ChumbaMini 0.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 119606 melee ticks, 29304 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 49 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 38725 sent, 34517 reached their opponent, 5713 virtual hits (16.6% of those reached).

## Melee bench: F26

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1479152. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 190 over 6 battles (31.7 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 94.5 | 148 / 210 | 1.50 | 21.7% | 40861 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 21.7% | 148 |
| ak.Fermat 2.0 | 2.2 | 14.4% | 25 |
| shu.nitro.LENIN .T34 | 3.3 | 12.6% | 25 |
| lrem.Spectre 0.4.4 | 3.8 | 12.1% | 9 |
| js.PinBall 1.6 | 4.7 | 10.6% | 0 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.3% | 2 |
| gh.mini.GrubbmOne 1.0 | 7.3 | 7.6% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 7.7 | 6.6% | 1 |
| sample.SpinBot 1.0 | 9.0 | 3.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 93.0 | 22 / 35 | 6493 |
| 2 | 1 | 73.3 | 96.5 | 28 / 35 | 7011 |
| 3 | 1 | 71.6 | 91.7 | 20 / 35 | 6483 |
| 4 | 1 | 73.6 | 94.9 | 28 / 35 | 6992 |
| 5 | 1 | 72.9 | 94.6 | 24 / 35 | 6970 |
| 6 | 1 | 73.4 | 96.2 | 26 / 35 | 6912 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 74 | 82% |
| shu.nitro.LENIN .T34 | 44 | 70% |
| lrem.Spectre 0.4.4 | 40 | 80% |
| js.PinBall 1.6 | 14 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 10 | 80% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 50% |
| gh.mini.GrubbmOne 1.0 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 1120. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 22 | 35% | 75 |
| shu.nitro.LENIN .T34 | 14 | 23% | 51 |
| lrem.Spectre 0.4.4 | 14 | 23% | 47 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 8% | 14 |
| js.PinBall 1.6 | 4 | 6% | 15 |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 5% | 4 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 200 rounds): 154038 melee ticks, 60166 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 28 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 20 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 3.

Targeting waves (200 rounds): 49996 sent, 45367 reached their opponent, 10818 virtual hits (23.8% of those reached).

## Melee bench: F27

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1472184. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 165 over 6 battles (27.5 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 93.1 | 157 / 210 | 1.62 | 20.5% | 31602 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 20.5% | 157 |
| mk.Alpha 0.2.1 | 2.0 | 14.5% | 38 |
| EH.Eagle 1.0.6 | 3.3 | 11.0% | 8 |
| sheldor.melee.nano.TestMelee 0.1 | 5.0 | 9.4% | 1 |
| techdude.kombat.FlamingKombat 1.5 | 5.3 | 8.8% | 3 |
| wee.Gem 1.8.4 | 5.7 | 9.1% | 3 |
| joe.ADinosaur 1.0 | 7.0 | 7.9% | 0 |
| throxbot.ThroxBot 0.1 | 7.3 | 7.8% | 1 |
| caimano.Furia_Ceca 0.22 | 8.3 | 7.2% | 0 |
| cs.Grudge 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 97.8 | 30 / 35 | 5550 |
| 2 | 1 | 69.0 | 88.9 | 24 / 35 | 4867 |
| 3 | 1 | 70.6 | 92.7 | 28 / 35 | 5332 |
| 4 | 1 | 71.3 | 94.9 | 26 / 35 | 5573 |
| 5 | 1 | 70.3 | 92.7 | 24 / 35 | 5100 |
| 6 | 1 | 69.9 | 91.4 | 25 / 35 | 5180 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 111 | 78% |
| EH.Eagle 1.0.6 | 32 | 94% |
| wee.Gem 1.8.4 | 12 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 100% |
| throxbot.ThroxBot 0.1 | 7 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 6 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 818. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 32 | 60% | 104 |
| wee.Gem 1.8.4 | 5 | 9% | 22 |
| EH.Eagle 1.0.6 | 4 | 8% | 35 |
| caimano.Furia_Ceca 0.22 | 4 | 8% | 7 |
| joe.ADinosaur 1.0 | 3 | 6% | 8 |
| sheldor.melee.nano.TestMelee 0.1 | 2 | 4% | 14 |
| throxbot.ThroxBot 0.1 | 2 | 4% | 7 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 2% | 13 |

Posture (Hadur's M records, 199 rounds): 129112 melee ticks, 50761 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 32 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 42098 sent, 37417 reached their opponent, 9354 virtual hits (25.0% of those reached).

## Melee bench: F28

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1468331. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 184 over 6 battles (30.7 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 91.0 | 134 / 210 | 1.81 | 18.9% | 24808 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 18.9% | 134 |
| kid.test.NightFox .2 | 2.0 | 14.5% | 36 |
| uji.Antique 1.0 | 3.0 | 12.5% | 24 |
| pfvicm.Sobieski 7.2.3b | 4.3 | 10.4% | 3 |
| qohnil.blot.BlotBot 3.61 | 4.8 | 10.2% | 6 |
| amk.ChumbaWumba 0.3 | 6.0 | 8.7% | 3 |
| ahr.ice.Ice 1.0.2 | 6.8 | 7.5% | 1 |
| matt.advanced.Katana 1.0 | 8.2 | 6.3% | 3 |
| stelo.Lifestealer 1.0 | 9.2 | 5.6% | 0 |
| stelo.PianistNano 1.2 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 91.1 | 22 / 35 | 4343 |
| 2 | 1 | 67.4 | 88.9 | 21 / 35 | 3612 |
| 3 | 1 | 68.9 | 91.4 | 23 / 35 | 4272 |
| 4 | 1 | 69.0 | 91.7 | 25 / 35 | 4156 |
| 5 | 1 | 68.0 | 90.2 | 20 / 35 | 4145 |
| 6 | 1 | 68.8 | 92.7 | 23 / 35 | 4280 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 69 | 75% |
| uji.Antique 1.0 | 54 | 80% |
| qohnil.blot.BlotBot 3.61 | 20 | 90% |
| amk.ChumbaWumba 0.3 | 9 | 78% |
| pfvicm.Sobieski 7.2.3b | 5 | 100% |
| ahr.ice.Ice 1.0.2 | 5 | 100% |
| matt.advanced.Katana 1.0 | 3 | 67% |
| stelo.PianistNano 1.2 | 1 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 26 | 32% | 47 |
| uji.Antique 1.0 | 24 | 29% | 66 |
| amk.ChumbaWumba 0.3 | 14 | 17% | 21 |
| pfvicm.Sobieski 7.2.3b | 8 | 10% | 14 |
| qohnil.blot.BlotBot 3.61 | 4 | 5% | 30 |
| ahr.ice.Ice 1.0.2 | 3 | 4% | 15 |
| stelo.Lifestealer 1.0 | 1 | 1% | 5 |
| matt.advanced.Katana 1.0 | 1 | 1% | 5 |
| stelo.PianistNano 1.2 | 1 | 1% | 3 |

Posture (Hadur's M records, 200 rounds): 130470 melee ticks, 44617 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 49 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 2.

Targeting waves (200 rounds): 43251 sent, 38528 reached their opponent, 5654 virtual hits (14.7% of those reached).

## Melee bench: F29

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1476204. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 165 over 6 battles (27.5 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 89.8 | 117 / 210 | 1.92 | 19.7% | 30199 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 19.7% | 117 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 15.1% | 42 |
| deewiant.Anomaly 0.2 | 2.5 | 14.8% | 40 |
| myl.micro.Troodon 1.10 | 4.2 | 11.6% | 6 |
| jok.PheonixM 0.1.2 | 4.8 | 10.5% | 5 |
| ph.melee.ArcherME 0.3 | 6.0 | 7.8% | 0 |
| DBall.Anarchy 0.1 | 7.5 | 5.7% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.5 | 6.0% | 0 |
| ap.Frederick 1.1 | 9.2 | 4.8% | 0 |
| jangs.ns51 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 89.2 | 20 / 35 | 4913 |
| 2 | 1 | 69.7 | 87.6 | 18 / 35 | 5103 |
| 3 | 1 | 70.5 | 89.5 | 18 / 35 | 5242 |
| 4 | 1 | 70.0 | 89.5 | 18 / 35 | 4839 |
| 5 | 1 | 70.0 | 89.5 | 19 / 35 | 5118 |
| 6 | 1 | 71.0 | 93.3 | 24 / 35 | 4984 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 65 | 82% |
| zyx.mega.YersiniaPestis 3.1 | 53 | 55% |
| myl.micro.Troodon 1.10 | 17 | 82% |
| jok.PheonixM 0.1.2 | 13 | 100% |
| ap.Frederick 1.1 | 5 | 100% |
| DBall.Anarchy 0.1 | 2 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 1025. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 38 | 40% | 86 |
| zyx.mega.YersiniaPestis 3.1 | 37 | 39% | 69 |
| myl.micro.Troodon 1.10 | 12 | 13% | 24 |
| jok.PheonixM 0.1.2 | 6 | 6% | 18 |
| DBall.Anarchy 0.1 | 1 | 1% | 5 |
| ph.melee.ArcherME 0.3 | 0 | 0% | 5 |
| jangs.ns51 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 167828 melee ticks, 71517 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 63 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 53398 sent, 48737 reached their opponent, 7670 virtual hits (15.7% of those reached).

## Melee bench: F30

hadur117.Hadur 3.21eg against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474182. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 140 over 6 battles (23.3 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 80.9 | 76 / 210 | 2.53 | 18.5% | 25390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.2 | 18.5% | 76 |
| stelo.PastFuture 2.3.2 | 2.7 | 15.1% | 33 |
| darkcanuck.B26354 1.06 | 2.8 | 15.2% | 50 |
| oog.melee.Capulet 1.2 | 3.3 | 14.1% | 25 |
| intruder.PrairieWolf 2.61 | 5.2 | 10.0% | 14 |
| tripphippy.Alice 1.1 | 6.7 | 8.4% | 9 |
| ntc.Opposite 1.5 | 6.8 | 8.4% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 7.3 | 7.2% | 3 |
| GarmBox.Anger 1.0 | 9.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 81.1 | 17 / 35 | 4228 |
| 2 | 1 | 68.0 | 86.4 | 15 / 35 | 4556 |
| 3 | 1 | 66.5 | 82.1 | 12 / 35 | 4470 |
| 4 | 1 | 65.8 | 78.6 | 12 / 35 | 4429 |
| 5 | 1 | 64.6 | 78.6 | 10 / 35 | 4026 |
| 6 | 2 | 64.0 | 78.6 | 10 / 35 | 3681 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 44 | 57% |
| oog.melee.Capulet 1.2 | 35 | 66% |
| stelo.PastFuture 2.3.2 | 26 | 46% |
| fowl3628800.LightningBolt 2.6.0 | 8 | 75% |
| intruder.PrairieWolf 2.61 | 7 | 71% |
| tripphippy.Alice 1.1 | 6 | 67% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 986. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 37 | 28% | 59 |
| stelo.PastFuture 2.3.2 | 36 | 27% | 48 |
| oog.melee.Capulet 1.2 | 29 | 22% | 53 |
| tripphippy.Alice 1.1 | 15 | 11% | 20 |
| intruder.PrairieWolf 2.61 | 9 | 7% | 16 |
| fowl3628800.LightningBolt 2.6.0 | 4 | 3% | 8 |
| ntc.Opposite 1.5 | 4 | 3% | 6 |

Posture (Hadur's M records, 199 rounds): 159160 melee ticks, 44625 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 40 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 46817 sent, 42534 reached their opponent, 7387 virtual hits (17.4% of those reached).

## Melee bench: F31

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1475331. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 136 over 6 battles (22.7 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 80.9 | 62 / 210 | 2.72 | 16.2% | 23247 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.3 | 18.5% | 92 |
| hadur117.Hadur 3.21eg | 1.7 | 16.2% | 62 |
| gh.mini.Griezel 0.2 | 3.3 | 13.0% | 48 |
| d414.nano.Quantum 1.0.0 | 4.2 | 11.1% | 3 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 11.0% | 3 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.6% | 4 |
| timmit.nano.TimDog 0.33 | 7.3 | 6.4% | 0 |
| fm.mammillarias 1.3 | 8.7 | 5.4% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.8 | 4.9% | 0 |
| tlp.ThreeLeggedPig 1 | 9.2 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 87.3 | 16 / 35 | 4263 |
| 2 | 2 | 65.4 | 81.6 | 10 / 35 | 3875 |
| 3 | 2 | 63.0 | 77.5 | 4 / 35 | 3655 |
| 4 | 2 | 64.7 | 79.0 | 10 / 35 | 3526 |
| 5 | 2 | 62.9 | 74.3 | 10 / 35 | 3638 |
| 6 | 1 | 67.4 | 85.7 | 12 / 35 | 4290 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 63 | 48% |
| gh.mini.Griezel 0.2 | 36 | 31% |
| spinnercat.micro.Tyger 0.1 | 11 | 91% |
| d414.nano.Quantum 1.0.0 | 10 | 80% |
| gh.nano.Grofvuil 0.2 | 3 | 33% |
| timmit.nano.TimDog 0.33 | 1 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 0% |

Hadur died in 150 of 210 rounds, at a mean tick of 1030. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 61 | 41% | 92 |
| gh.mini.Griezel 0.2 | 40 | 27% | 55 |
| spinnercat.micro.Tyger 0.1 | 13 | 9% | 19 |
| d414.nano.Quantum 1.0.0 | 10 | 7% | 16 |
| timmit.nano.TimDog 0.33 | 10 | 7% | 12 |
| gh.nano.Grofvuil 0.2 | 6 | 4% | 7 |
| fm.mammillarias 1.3 | 4 | 3% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 153818 melee ticks, 52340 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 36 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 36 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 48801 sent, 43969 reached their opponent, 7235 virtual hits (16.5% of those reached).

## Melee bench: F32

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1475720. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 210 over 6 battles (35.0 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 91.1 | 130 / 210 | 1.80 | 19.2% | 28841 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 19.2% | 130 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.7% | 44 |
| apc.botM 3.0 | 3.2 | 11.5% | 13 |
| lxx.ConceptA 0.8 | 4.5 | 10.2% | 4 |
| vjik.UnViolation 1.1 | 4.7 | 10.1% | 8 |
| bayen.UbaMicro 1.4 | 5.7 | 9.4% | 4 |
| panzer.Panzer 0.2 | 7.7 | 7.2% | 0 |
| yk.JahMicro 1.0 | 8.0 | 6.7% | 5 |
| conscience.Electron 1.3g | 8.3 | 6.2% | 0 |
| donjezza.Jezza 1.0 | 10.0 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 88.6 | 22 / 35 | 4823 |
| 2 | 1 | 68.3 | 91.1 | 21 / 35 | 4555 |
| 3 | 1 | 68.5 | 90.8 | 18 / 35 | 4819 |
| 4 | 1 | 69.2 | 91.4 | 22 / 35 | 4968 |
| 5 | 1 | 69.3 | 91.7 | 21 / 35 | 5057 |
| 6 | 1 | 69.5 | 93.0 | 26 / 35 | 4619 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 96 | 65% |
| apc.botM 3.0 | 26 | 81% |
| vjik.UnViolation 1.1 | 13 | 85% |
| yk.JahMicro 1.0 | 10 | 90% |
| lxx.ConceptA 0.8 | 10 | 80% |
| panzer.Panzer 0.2 | 8 | 100% |
| bayen.UbaMicro 1.4 | 8 | 88% |
| donjezza.Jezza 1.0 | 6 | 67% |

Hadur died in 80 of 210 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 35 | 44% | 88 |
| apc.botM 3.0 | 12 | 15% | 37 |
| lxx.ConceptA 0.8 | 11 | 14% | 19 |
| vjik.UnViolation 1.1 | 8 | 10% | 22 |
| yk.JahMicro 1.0 | 5 | 6% | 13 |
| conscience.Electron 1.3g | 3 | 4% | 6 |
| bayen.UbaMicro 1.4 | 2 | 3% | 14 |
| panzer.Panzer 0.2 | 2 | 3% | 7 |
| donjezza.Jezza 1.0 | 2 | 3% | 3 |

Posture (Hadur's M records, 198 rounds): 120978 melee ticks, 57256 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 55 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 41356 sent, 36662 reached their opponent, 6675 virtual hits (18.2% of those reached).

## Melee bench: F33

hadur117.Hadur 3.21eg against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1468312. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 179 over 6 battles (29.8 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 89.7 | 119 / 210 | 1.82 | 21.6% | 28750 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 21.6% | 119 |
| maribo.Quester 0.3 | 2.0 | 17.8% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 14.1% | 22 |
| labg.Cataclysm 2.05 | 3.8 | 12.6% | 21 |
| baal.nano.N 1.42 | 5.2 | 9.9% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.7 | 9.5% | 7 |
| zyx.micro.Ant 1.1 | 7.3 | 5.9% | 0 |
| sanja.First 0.1 | 7.7 | 5.6% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 86.4 | 19 / 35 | 4764 |
| 2 | 1 | 69.6 | 88.6 | 17 / 35 | 4505 |
| 3 | 1 | 70.6 | 89.3 | 18 / 35 | 5135 |
| 4 | 1 | 71.2 | 92.9 | 25 / 35 | 4612 |
| 5 | 1 | 70.0 | 90.7 | 19 / 35 | 4621 |
| 6 | 1 | 70.9 | 90.4 | 21 / 35 | 5113 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 87 | 75% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 39 | 59% |
| labg.Cataclysm 2.05 | 22 | 77% |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 71% |
| baal.nano.N 1.42 | 6 | 100% |
| sanja.First 0.1 | 3 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 1286. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 47 | 50% | 112 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 20% | 42 |
| kinsen.melee.Angsaichmophobia 1.8c | 12 | 13% | 16 |
| labg.Cataclysm 2.05 | 11 | 12% | 30 |
| baal.nano.N 1.42 | 3 | 3% | 8 |
| sanja.First 0.1 | 1 | 1% | 1 |
| zyx.micro.Ant 1.1 | 1 | 1% | 1 |

Posture (Hadur's M records, 200 rounds): 161812 melee ticks, 82226 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 55 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 47422 sent, 43229 reached their opponent, 6414 virtual hits (14.8% of those reached).

## Melee bench: F34

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1473630. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 162 over 6 battles (27.0 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 88.4 | 77 / 210 | 2.05 | 18.6% | 32051 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.2 | 18.6% | 77 |
| kid.Gladiator .7.2 | 2.0 | 16.9% | 55 |
| stelo.Spread 0.9 | 2.8 | 16.0% | 57 |
| jcs.Seth 1.8 | 4.2 | 11.4% | 13 |
| tcf.Reach 3 | 5.2 | 10.0% | 6 |
| cli.Dancer 1.1 | 5.7 | 9.2% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.1% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.7% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.5% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.7 | 84.4 | 11 / 35 | 5172 |
| 2 | 1 | 69.1 | 88.9 | 16 / 35 | 5034 |
| 3 | 1 | 69.2 | 86.7 | 11 / 35 | 5617 |
| 4 | 1 | 69.1 | 88.9 | 11 / 35 | 5096 |
| 5 | 1 | 69.5 | 89.5 | 12 / 35 | 5347 |
| 6 | 1 | 70.8 | 91.7 | 16 / 35 | 5785 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 71 | 44% |
| kid.Gladiator .7.2 | 67 | 45% |
| jcs.Seth 1.8 | 16 | 63% |
| tcf.Reach 3 | 9 | 67% |
| ratosh.Wesco 1.4 | 1 | 0% |

Hadur died in 133 of 210 rounds, at a mean tick of 1281. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 57 | 43% | 82 |
| stelo.Spread 0.9 | 49 | 37% | 76 |
| jcs.Seth 1.8 | 15 | 11% | 31 |
| tcf.Reach 3 | 6 | 5% | 10 |
| cli.Dancer 1.1 | 2 | 2% | 5 |
| amk.Punbot.Punbot 0.01 | 2 | 2% | 2 |
| ratosh.Wesco 1.4 | 1 | 1% | 3 |
| sample.RamFire 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 198 rounds): 167497 melee ticks, 83295 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 34 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 51348 sent, 46781 reached their opponent, 7615 virtual hits (16.3% of those reached).

## Melee bench: F35

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1469705. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 131 over 6 battles (21.8 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 82.0 | 51 / 210 | 2.62 | 16.0% | 22554 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 18.9% | 128 |
| hadur117.Hadur 3.21eg | 2.0 | 16.0% | 51 |
| gh.mini.Gruwel 0.9 | 3.2 | 13.1% | 23 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 12.0% | 6 |
| rz.HawkOnFire 0.1 | 4.5 | 11.5% | 5 |
| wit.Chuliath 1.0 | 6.0 | 7.0% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 5.8% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.8 | 5.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.9% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 80.3 | 10 / 35 | 3915 |
| 2 | 2 | 65.9 | 82.5 | 9 / 35 | 3736 |
| 3 | 2 | 65.9 | 84.4 | 9 / 35 | 3803 |
| 4 | 2 | 64.2 | 80.6 | 7 / 35 | 3764 |
| 5 | 2 | 64.5 | 80.0 | 7 / 35 | 3779 |
| 6 | 2 | 65.3 | 83.8 | 9 / 35 | 3557 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 75 | 29% |
| gh.mini.Gruwel 0.9 | 26 | 58% |
| dmh.robocode.robot.BlackDeath 9.2 | 10 | 90% |
| rz.HawkOnFire 0.1 | 8 | 50% |
| wit.Chuliath 1.0 | 2 | 50% |

Hadur died in 161 of 210 rounds, at a mean tick of 1052. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 87 | 54% | 107 |
| dmh.robocode.robot.BlackDeath 9.2 | 22 | 14% | 30 |
| gh.mini.Gruwel 0.9 | 21 | 13% | 37 |
| rz.HawkOnFire 0.1 | 19 | 12% | 22 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 2% | 6 |
| wit.Chuliath 1.0 | 3 | 2% | 5 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 145366 melee ticks, 65565 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 50 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 44805 sent, 40028 reached their opponent, 6310 virtual hits (15.8% of those reached).

## Melee bench: F36

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1487182. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 219 over 6 battles (36.5 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 93.3 | 155 / 210 | 1.60 | 20.9% | 32647 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 20.9% | 155 |
| alpha.RainingFire 1.0 | 2.5 | 12.3% | 15 |
| bzdp.Pansy 2.1 | 2.8 | 12.2% | 15 |
| mz.Cork 0.1 | 4.0 | 11.2% | 10 |
| bvh.micro.Freya 0.3 | 5.3 | 10.5% | 10 |
| m3thos.Eva02 0.7.1 | 6.0 | 9.9% | 3 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.8% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 5.2% | 0 |
| dl.BetterWalls 1.0 | 8.7 | 4.8% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 94.9 | 30 / 35 | 5546 |
| 2 | 1 | 70.9 | 91.7 | 26 / 35 | 5297 |
| 3 | 1 | 71.7 | 94.3 | 26 / 35 | 5553 |
| 4 | 1 | 69.9 | 91.4 | 22 / 35 | 4939 |
| 5 | 1 | 71.2 | 93.0 | 24 / 35 | 5550 |
| 6 | 1 | 72.1 | 94.6 | 27 / 35 | 5762 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 40 | 80% |
| mz.Cork 0.1 | 37 | 89% |
| bvh.micro.Freya 0.3 | 36 | 86% |
| alpha.RainingFire 1.0 | 27 | 81% |
| bvh.mini.Fenrir 0.39 | 19 | 95% |
| m3thos.Eva02 0.7.1 | 14 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.MyFirstRobot 1.0 | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 971. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 16 | 29% | 42 |
| bzdp.Pansy 2.1 | 11 | 20% | 46 |
| bvh.mini.Fenrir 0.39 | 9 | 16% | 20 |
| bvh.micro.Freya 0.3 | 8 | 14% | 33 |
| mz.Cork 0.1 | 7 | 13% | 38 |
| m3thos.Eva02 0.7.1 | 3 | 5% | 20 |
| dl.BetterWalls 1.0 | 1 | 2% | 5 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 2 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 143062 melee ticks, 50795 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 67 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 67 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 49047 sent, 44511 reached their opponent, 8775 virtual hits (19.7% of those reached).

## Melee bench: F37

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1469016. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 244 over 6 battles (40.7 per battle, most in one battle 49). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 92.8 | 169 / 210 | 1.65 | 20.4% | 36005 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 20.4% | 169 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.5 | 10.3% | 9 |
| germ.TheMind .2 | 3.7 | 9.8% | 6 |
| EBBU.Sim2 1.02 | 5.0 | 9.2% | 2 |
| agrach.Dalek 1.0 | 5.0 | 9.5% | 7 |
| lmk.ACPFinal 0.1 | 6.3 | 8.4% | 3 |
| mb.Beast 0.1 | 6.7 | 8.5% | 6 |
| stelo.UntouchableNano 1.3 | 7.0 | 8.4% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 7.3 | 8.3% | 2 |
| skm.Ryubot 1.0 | 9.5 | 7.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 94.6 | 27 / 35 | 6100 |
| 2 | 1 | 69.7 | 92.1 | 28 / 35 | 6098 |
| 3 | 1 | 70.8 | 95.9 | 32 / 35 | 5988 |
| 4 | 1 | 69.5 | 92.4 | 28 / 35 | 5859 |
| 5 | 1 | 68.1 | 87.3 | 25 / 35 | 5664 |
| 6 | 1 | 71.0 | 94.6 | 29 / 35 | 6296 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 43 | 100% |
| germ.TheMind .2 | 26 | 88% |
| com.syncleus.robocode.Dreadnaught 0.1 | 25 | 88% |
| mb.Beast 0.1 | 22 | 95% |
| lmk.ACPFinal 0.1 | 21 | 90% |
| stelo.UntouchableNano 1.3 | 18 | 89% |
| EBBU.Sim2 1.02 | 15 | 100% |
| skm.Ryubot 1.0 | 8 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 43 of 210 rounds, at a mean tick of 478. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 8 | 19% | 51 |
| com.syncleus.robocode.Dreadnaught 0.1 | 8 | 19% | 37 |
| lmk.ACPFinal 0.1 | 7 | 16% | 27 |
| stelo.UntouchableNano 1.3 | 7 | 16% | 23 |
| mn.nano.perceptual.Impact 1.3.0 | 5 | 12% | 12 |
| germ.TheMind .2 | 3 | 7% | 16 |
| EBBU.Sim2 1.02 | 3 | 7% | 15 |
| mb.Beast 0.1 | 2 | 5% | 26 |
| skm.Ryubot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 96873 melee ticks, 26484 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 26 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 32365 sent, 28117 reached their opponent, 8260 virtual hits (29.4% of those reached).

## Melee bench: F38

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1470141. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 144 over 6 battles (24.0 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 86.1 | 105 / 210 | 2.25 | 18.1% | 28237 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.2 | 18.1% | 105 |
| justin.Mallais 14.0 | 1.8 | 16.7% | 72 |
| bvh.mini.Freya 0.55 | 3.0 | 12.8% | 6 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.0% | 13 |
| cs.Wren 1.0 | 5.0 | 10.1% | 4 |
| kdf.KoulDestroyer 1.0 | 5.8 | 9.5% | 5 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.0 | 7.9% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.8 | 6.4% | 3 |
| matt.UnderDark3 2.4.34 | 9.2 | 3.9% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 87.3 | 19 / 35 | 4501 |
| 2 | 1 | 69.2 | 87.6 | 20 / 35 | 5143 |
| 3 | 1 | 69.6 | 89.5 | 19 / 35 | 4935 |
| 4 | 1 | 68.7 | 88.9 | 19 / 35 | 4784 |
| 5 | 2 | 65.1 | 78.4 | 10 / 35 | 4342 |
| 6 | 1 | 67.4 | 84.8 | 18 / 35 | 4532 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 81 | 60% |
| bvh.mini.Freya 0.55 | 25 | 92% |
| bts.mega.Gnarly 1.4 | 20 | 75% |
| cs.Wren 1.0 | 12 | 100% |
| kdf.KoulDestroyer 1.0 | 7 | 57% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 817. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 48 | 45% | 93 |
| bts.mega.Gnarly 1.4 | 18 | 17% | 37 |
| bvh.mini.Freya 0.55 | 14 | 13% | 25 |
| kdf.KoulDestroyer 1.0 | 14 | 13% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 6 | 6% | 7 |
| cs.Wren 1.0 | 3 | 3% | 18 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 3% | 5 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 1 |

Posture (Hadur's M records, 200 rounds): 132728 melee ticks, 44489 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 35 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 2.

Targeting waves (200 rounds): 44248 sent, 39227 reached their opponent, 7983 virtual hits (20.4% of those reached).

## Melee bench: F39

hadur117.Hadur 3.21eg against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1477388. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 156 over 6 battles (26.0 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 90.2 | 118 / 210 | 1.78 | 21.8% | 33372 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 21.8% | 118 |
| bvh.fry.Freya 0.82 | 2.3 | 16.2% | 18 |
| az.Ololobot 0.2.4 | 2.7 | 15.5% | 67 |
| winamp32.micro.MicroMacro 1.0 | 4.8 | 9.4% | 2 |
| stelo.SoRobotNanoMelee 1.2 | 5.3 | 8.9% | 4 |
| gimp.GimpBot 0.1 | 5.7 | 8.6% | 0 |
| apollokidd.ApolloKidd 0.9 | 6.2 | 8.1% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.2 | 6.2% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.8 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 88.6 | 18 / 35 | 5535 |
| 2 | 1 | 71.6 | 95.4 | 26 / 35 | 5751 |
| 3 | 1 | 67.6 | 83.2 | 17 / 35 | 5184 |
| 4 | 1 | 68.6 | 87.9 | 17 / 35 | 5250 |
| 5 | 1 | 70.9 | 92.1 | 20 / 35 | 6046 |
| 6 | 1 | 70.8 | 94.3 | 20 / 35 | 5606 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 96 | 45% |
| bvh.fry.Freya 0.82 | 60 | 88% |
| winamp32.micro.MicroMacro 1.0 | 10 | 90% |
| stelo.SoRobotNanoMelee 1.2 | 10 | 100% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| gimp.GimpBot 0.1 | 1 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 0% |

Hadur died in 93 of 210 rounds, at a mean tick of 1687. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 58 | 62% | 112 |
| bvh.fry.Freya 0.82 | 22 | 24% | 59 |
| winamp32.micro.MicroMacro 1.0 | 4 | 4% | 14 |
| gimp.GimpBot 0.1 | 3 | 3% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 2 | 2% | 8 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 2% | 2 |
| apollokidd.ApolloKidd 0.9 | 1 | 1% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 3 |

Posture (Hadur's M records, 198 rounds): 151345 melee ticks, 130249 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 50 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 44892 sent, 40737 reached their opponent, 7741 virtual hits (19.0% of those reached).

## Melee bench: F40

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1482227. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 184 over 6 battles (30.7 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 90.3 | 128 / 210 | 1.87 | 20.1% | 31883 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 20.1% | 128 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.5% | 32 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.3% | 22 |
| mz.AntiGrav 1.0 | 4.2 | 11.3% | 9 |
| Polkwane.SmashMelee 1.0 | 4.7 | 10.5% | 6 |
| stelo.Randomness 1.0 | 6.5 | 9.3% | 12 |
| alpha.BlackIce 1.0 | 6.5 | 8.9% | 1 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.3% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 3.8% | 0 |
| sample.Corners 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 87.6 | 21 / 35 | 4999 |
| 2 | 1 | 72.3 | 95.2 | 27 / 35 | 5800 |
| 3 | 1 | 70.1 | 89.8 | 19 / 35 | 5322 |
| 4 | 1 | 70.2 | 88.9 | 20 / 35 | 5374 |
| 5 | 1 | 70.4 | 90.8 | 19 / 35 | 5141 |
| 6 | 1 | 70.4 | 89.5 | 22 / 35 | 5247 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 60 | 75% |
| kano.gamma.KanoGamma 1.8 | 35 | 83% |
| Polkwane.SmashMelee 1.0 | 29 | 90% |
| mz.AntiGrav 1.0 | 20 | 100% |
| stelo.Randomness 1.0 | 9 | 56% |
| alpha.BlackIce 1.0 | 3 | 67% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 926. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 32 | 39% | 63 |
| kano.gamma.KanoGamma 1.8 | 13 | 16% | 50 |
| stelo.Randomness 1.0 | 12 | 15% | 26 |
| Polkwane.SmashMelee 1.0 | 10 | 12% | 21 |
| mz.AntiGrav 1.0 | 8 | 10% | 27 |
| amk.superstrike.SuperStrike 0.3 | 4 | 5% | 7 |
| alpha.BlackIce 1.0 | 3 | 4% | 11 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 198 rounds): 148940 melee ticks, 45429 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 97 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 97 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 48698 sent, 43991 reached their opponent, 9265 virtual hits (21.1% of those reached).

## Melee bench: F41

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1469260. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 170 over 6 battles (28.3 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.6 | 110 / 210 | 2.02 | 18.6% | 27228 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 18.6% | 110 |
| eem.EvBotNG v12.8 | 2.0 | 16.4% | 71 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 12.4% | 13 |
| ary.Swarm 1.1 | 3.5 | 12.5% | 8 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.6% | 7 |
| shrub.Silver v048 | 6.0 | 9.3% | 2 |
| zyx.nano.Ant 1.1 | 7.0 | 7.7% | 0 |
| stelo.Mirror 1.1 | 8.3 | 5.5% | 0 |
| jsal.Jsalbot 1.0 | 8.7 | 4.9% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 86.7 | 14 / 35 | 4335 |
| 2 | 1 | 70.0 | 91.1 | 21 / 35 | 4684 |
| 3 | 1 | 70.5 | 92.1 | 23 / 35 | 4830 |
| 4 | 1 | 66.6 | 81.6 | 14 / 35 | 4214 |
| 5 | 1 | 68.4 | 88.9 | 17 / 35 | 4342 |
| 6 | 1 | 69.8 | 91.4 | 21 / 35 | 4823 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 86 | 53% |
| ary.Swarm 1.1 | 32 | 91% |
| lessonz.robocode.Oz 0.5.0 | 26 | 69% |
| simonton.nano.MeleeSeed 1.8 | 12 | 75% |
| shrub.Silver v048 | 6 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 1110. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 58 | 57% | 107 |
| lessonz.robocode.Oz 0.5.0 | 15 | 15% | 34 |
| ary.Swarm 1.1 | 11 | 11% | 26 |
| simonton.nano.MeleeSeed 1.8 | 9 | 9% | 25 |
| shrub.Silver v048 | 5 | 5% | 13 |
| zyx.nano.Ant 1.1 | 2 | 2% | 2 |
| stelo.Mirror 1.1 | 0 | 0% | 2 |
| jsal.Jsalbot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 147074 melee ticks, 72811 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 63 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 48315 sent, 43558 reached their opponent, 6758 virtual hits (15.5% of those reached).

## Melee bench: F42

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1480420. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 142 over 6 battles (23.7 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 92.6 | 143 / 210 | 1.67 | 20.6% | 36094 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 20.6% | 143 |
| wompi.Wallaby 5.1 | 2.2 | 15.1% | 25 |
| ara.Shera 0.88 | 3.3 | 13.3% | 21 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.1% | 21 |
| amz.NanoClone 1.41 | 5.0 | 8.9% | 0 |
| maribo.IotaCT 1.1 | 6.8 | 6.7% | 0 |
| dsw.StaticD 1.0 | 7.5 | 6.5% | 0 |
| mme.NikeEnhanced 2.0 | 7.7 | 6.0% | 0 |
| stelo.MirrorMicro 1.0 | 8.2 | 5.8% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 92.1 | 26 / 35 | 5761 |
| 2 | 1 | 72.3 | 95.9 | 26 / 35 | 6275 |
| 3 | 1 | 70.9 | 92.7 | 22 / 35 | 5902 |
| 4 | 1 | 69.1 | 86.0 | 18 / 35 | 5590 |
| 5 | 1 | 72.1 | 95.2 | 25 / 35 | 6320 |
| 6 | 1 | 72.0 | 93.7 | 26 / 35 | 6246 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 98 | 89% |
| maribo.mini.MiniQuester 0.1 | 42 | 76% |
| ara.Shera 0.88 | 29 | 69% |
| dsw.StaticD 1.0 | 3 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 1083. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 23 | 34% | 46 |
| wompi.Wallaby 5.1 | 22 | 32% | 102 |
| maribo.mini.MiniQuester 0.1 | 17 | 25% | 49 |
| amz.NanoClone 1.41 | 3 | 4% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 1 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 1 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 1 |
| dsw.StaticD 1.0 | 0 | 0% | 5 |
| maribo.IotaCT 1.1 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 161397 melee ticks, 60998 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 31 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 50402 sent, 45746 reached their opponent, 9001 virtual hits (19.7% of those reached).

## Melee bench: F43

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1470615. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 170 over 6 battles (28.3 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 82.3 | 43 / 210 | 2.59 | 16.7% | 26924 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.3% | 134 |
| hadur117.Hadur 3.21eg | 2.0 | 16.7% | 43 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.2% | 24 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.8% | 5 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.8% | 3 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.5% | 2 |
| jab.DiamondStealer 5 | 7.3 | 7.6% | 0 |
| mz.NanoGod 2.02 | 7.7 | 7.1% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.7% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.7 | 80.6 | 4 / 35 | 4756 |
| 2 | 2 | 68.1 | 84.1 | 9 / 35 | 4699 |
| 3 | 2 | 66.1 | 80.0 | 5 / 35 | 4069 |
| 4 | 2 | 67.0 | 82.5 | 7 / 35 | 4465 |
| 5 | 2 | 67.2 | 82.9 | 11 / 35 | 4226 |
| 6 | 2 | 67.7 | 83.8 | 7 / 35 | 4709 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 93 | 23% |
| brainfade.melee.Dusk 0.44 | 18 | 28% |
| dummy.micro.Sparrow 2.5 | 12 | 75% |
| wcsv.melee.EngineerMelee 0.1 | 6 | 67% |
| Krabb.akim2.Akim2 1.1b | 3 | 33% |
| mz.NanoGod 2.02 | 1 | 100% |
| jab.DiamondStealer 5 | 1 | 100% |
| cvt.Firsty 1.0 | 1 | 100% |

Hadur died in 168 of 210 rounds, at a mean tick of 1325. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 102 | 61% | 124 |
| brainfade.melee.Dusk 0.44 | 22 | 13% | 30 |
| dummy.micro.Sparrow 2.5 | 19 | 11% | 23 |
| wcsv.melee.EngineerMelee 0.1 | 12 | 7% | 16 |
| Krabb.akim2.Akim2 1.1b | 4 | 2% | 6 |
| mz.NanoGod 2.02 | 4 | 2% | 5 |
| jab.DiamondStealer 5 | 3 | 2% | 4 |
| cvt.Firsty 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 149978 melee ticks, 113951 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 446 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 217 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 47654 sent, 42819 reached their opponent, 7235 virtual hits (16.9% of those reached).

## Melee bench: F44

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474017. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 188 over 6 battles (31.3 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 92.9 | 135 / 210 | 1.64 | 20.9% | 35446 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 20.9% | 135 |
| stelo.Liblix 0.3.1 | 2.2 | 15.5% | 48 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.3% | 19 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.7 | 9.5% | 1 |
| jwirde.Gort 2.0 | 4.7 | 9.7% | 6 |
| disan.Chair 2.2.0 | 6.5 | 7.4% | 1 |
| wompi.Quokka 1.6 | 6.8 | 6.9% | 0 |
| stf.PanzerGeneral 0.1 | 7.3 | 6.8% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 4.7% | 0 |
| sample.Crazy 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 95.9 | 24 / 35 | 5988 |
| 2 | 1 | 69.9 | 88.3 | 20 / 35 | 5648 |
| 3 | 1 | 69.8 | 89.2 | 17 / 35 | 5414 |
| 4 | 1 | 71.3 | 93.0 | 21 / 35 | 5920 |
| 5 | 1 | 74.0 | 98.1 | 30 / 35 | 6723 |
| 6 | 1 | 71.1 | 93.0 | 23 / 35 | 5753 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 92 | 65% |
| tzu.TheArtOfWar 1.2 | 66 | 83% |
| jwirde.Gort 2.0 | 9 | 56% |
| disan.Chair 2.2.0 | 7 | 86% |
| wompi.Quokka 1.6 | 3 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 67% |
| amk.jointstrike.JointStrike 0.2 | 3 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 1041. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 45 | 60% | 106 |
| tzu.TheArtOfWar 1.2 | 15 | 20% | 63 |
| jwirde.Gort 2.0 | 6 | 8% | 15 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 5% | 9 |
| stf.PanzerGeneral 0.1 | 4 | 5% | 6 |
| disan.Chair 2.2.0 | 1 | 1% | 5 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 4 |
| wompi.Quokka 1.6 | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 153182 melee ticks, 54212 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 26 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 51364 sent, 46748 reached their opponent, 9729 virtual hits (20.8% of those reached).

## Melee bench: F45

hadur117.Hadur 3.21eg against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1472664. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 190 over 6 battles (31.7 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 89.7 | 98 / 210 | 1.92 | 19.9% | 33406 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.0 | 19.9% | 98 |
| jje.BagPuss 1.2 | 2.2 | 12.6% | 16 |
| eem.IWillFireNoBullet v2.8 | 3.8 | 11.5% | 69 |
| myl.nano.Graviton 1.10 | 4.0 | 10.8% | 4 |
| sul.Lunar 1.1 | 4.2 | 10.7% | 19 |
| hvilela.HVilela 0.9 | 6.5 | 9.1% | 0 |
| fm.claire 1.7 | 7.0 | 8.6% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.3 | 8.2% | 1 |
| wit.Deep7 2.0 | 9.3 | 4.6% | 3 |
| abud.ThirdRobo 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 90.5 | 18 / 35 | 6106 |
| 2 | 1 | 69.3 | 90.2 | 13 / 35 | 5279 |
| 3 | 1 | 69.8 | 89.5 | 17 / 35 | 5440 |
| 4 | 1 | 70.7 | 92.4 | 18 / 35 | 5836 |
| 5 | 1 | 69.3 | 89.5 | 15 / 35 | 5423 |
| 6 | 1 | 69.3 | 86.3 | 17 / 35 | 5322 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 66 | 29% |
| jje.BagPuss 1.2 | 40 | 65% |
| sul.Lunar 1.1 | 34 | 56% |
| myl.nano.Graviton 1.10 | 17 | 94% |
| pez.mini.ChironexFleckeri 0.5 | 10 | 90% |
| hvilela.HVilela 0.9 | 5 | 100% |
| fm.claire 1.7 | 3 | 100% |
| wit.Deep7 2.0 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 1961. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 53 | 47% | 0 |
| jje.BagPuss 1.2 | 28 | 25% | 76 |
| sul.Lunar 1.1 | 16 | 14% | 54 |
| myl.nano.Graviton 1.10 | 9 | 8% | 29 |
| hvilela.HVilela 0.9 | 3 | 3% | 13 |
| pez.mini.ChironexFleckeri 0.5 | 2 | 2% | 15 |
| fm.claire 1.7 | 1 | 1% | 11 |
| wit.Deep7 2.0 | 1 | 1% | 11 |
| abud.ThirdRobo 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 189875 melee ticks, 131280 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 49 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 58523 sent, 53830 reached their opponent, 8026 virtual hits (14.9% of those reached).

## Melee bench: F46

hadur117.Hadur 3.21eg against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474219. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 116 over 6 battles (19.3 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 90.8 | 106 / 210 | 1.74 | 20.8% | 28424 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21eg | 1.3 | 20.8% | 106 |
| kc.mini.Mirage 0.2 | 1.7 | 19.6% | 84 |
| mz.MicroSheep 1.0 | 3.3 | 12.3% | 2 |
| cx.Princess 1.0 | 3.8 | 11.9% | 15 |
| sadoner.killer 0.2 | 4.8 | 10.9% | 1 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.3% | 2 |
| kurios.DOSexe .9a | 7.3 | 6.2% | 0 |
| jeremyreeder.collective.Prophet 5 | 7.3 | 6.6% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 89.3 | 18 / 35 | 4605 |
| 2 | 2 | 68.1 | 88.6 | 14 / 35 | 4574 |
| 3 | 1 | 69.4 | 89.6 | 16 / 35 | 4897 |
| 4 | 1 | 70.3 | 93.6 | 22 / 35 | 4741 |
| 5 | 1 | 69.4 | 91.1 | 19 / 35 | 4684 |
| 6 | 2 | 69.8 | 92.5 | 17 / 35 | 4923 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 137 | 59% |
| cx.Princess 1.0 | 26 | 50% |
| mz.MicroSheep 1.0 | 11 | 91% |
| arthord.NanoSatanMelee Beta | 2 | 50% |
| jeremyreeder.collective.Prophet 5 | 1 | 100% |
| sadoner.killer 0.2 | 1 | 0% |

Hadur died in 104 of 210 rounds, at a mean tick of 1099. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 70 | 67% | 151 |
| cx.Princess 1.0 | 22 | 21% | 32 |
| mz.MicroSheep 1.0 | 6 | 6% | 15 |
| arthord.NanoSatanMelee Beta | 3 | 3% | 4 |
| sadoner.killer 0.2 | 2 | 2% | 3 |
| kurios.DOSexe .9a | 1 | 1% | 2 |
| jeremyreeder.collective.Prophet 5 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 137801 melee ticks, 81958 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 49 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 38864 sent, 34690 reached their opponent, 5746 virtual hits (16.6% of those reached).

