# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 111 over 6 battles (18.5 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 86.8 | 55 / 210 | 2.19 | 17.4% | 31065 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.2 | 19.4% | 132 |
| hadur117.Hadur 3.19ms | 1.8 | 17.4% | 55 |
| sgp.JollyNinja 3.53 | 3.5 | 11.1% | 13 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 10.8% | 5 |
| lorneswork.Predator 1.0 | 5.2 | 10.2% | 3 |
| mz.MicroGodMelee 1 | 5.3 | 9.8% | 1 |
| adt.Ar2 1.0 | 7.0 | 7.4% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 6.0% | 1 |
| skm.butterfly 1.0 | 9.0 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 88.9 | 14 / 35 | 5515 |
| 2 | 2 | 67.5 | 89.2 | 10 / 35 | 5093 |
| 3 | 2 | 67.0 | 86.7 | 7 / 35 | 5110 |
| 4 | 2 | 67.7 | 87.9 | 10 / 35 | 5276 |
| 5 | 2 | 66.7 | 85.1 | 6 / 35 | 4949 |
| 6 | 2 | 66.5 | 83.2 | 8 / 35 | 5122 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 120 | 14% |
| sgp.JollyNinja 3.53 | 14 | 57% |
| mz.MicroGodMelee 1 | 12 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 91% |
| lorneswork.Predator 1.0 | 8 | 75% |
| adt.Ar2 1.0 | 2 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 0% |

Hadur died in 155 of 210 rounds, at a mean tick of 1165. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 114 | 74% | 135 |
| sgp.JollyNinja 3.53 | 14 | 9% | 20 |
| lorneswork.Predator 1.0 | 11 | 7% | 17 |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 4% | 12 |
| mz.MicroGodMelee 1 | 4 | 3% | 17 |
| adt.Ar2 1.0 | 4 | 3% | 5 |
| skm.butterfly 1.0 | 1 | 1% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 1 |
| mym.EdgeStalker 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 204 rounds): 136631 melee ticks, 94939 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 79 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 45050 sent, 40132 reached their opponent, 7901 virtual hits (19.7% of those reached).

## Melee bench: F02

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 271 over 6 battles (45.2 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.1 | 104 / 210 | 2.25 | 18.6% | 30031 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 18.6% | 104 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 14.4% | 44 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 13.3% | 26 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.9% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 9.9% | 10 |
| fnc.bandit.Bandit 5.2.0 | 6.7 | 8.0% | 1 |
| Noran.BitchingElk 0.054 | 6.8 | 8.2% | 15 |
| sch.Simone 0.3d | 7.7 | 7.4% | 4 |
| stelo.PatternRobot 1.0 | 8.8 | 5.6% | 2 |
| fullsail.SweetTea 1.1 | 9.8 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 86.3 | 18 / 35 | 5167 |
| 2 | 1 | 69.5 | 88.3 | 23 / 35 | 5201 |
| 3 | 1 | 66.2 | 80.0 | 13 / 35 | 4727 |
| 4 | 1 | 68.1 | 86.0 | 17 / 35 | 4948 |
| 5 | 1 | 68.4 | 86.3 | 16 / 35 | 5040 |
| 6 | 1 | 69.0 | 89.5 | 17 / 35 | 4948 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 50 | 50% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 42 | 71% |
| com.cohesiva.robocode.ManOwaR 1.0 | 20 | 80% |
| Noran.BitchingElk 0.054 | 17 | 59% |
| sch.Simone 0.3d | 14 | 93% |
| lrem.micro.SpikeSoldier 0.4 | 7 | 100% |
| stelo.PatternRobot 1.0 | 2 | 50% |
| fnc.bandit.Bandit 5.2.0 | 2 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 952. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 41 | 38% | 62 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 17 | 16% | 45 |
| com.cohesiva.robocode.ManOwaR 1.0 | 16 | 15% | 36 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 11% | 19 |
| Noran.BitchingElk 0.054 | 10 | 9% | 21 |
| fnc.bandit.Bandit 5.2.0 | 6 | 6% | 7 |
| sch.Simone 0.3d | 3 | 3% | 15 |
| stelo.PatternRobot 1.0 | 2 | 2% | 4 |
| fullsail.SweetTea 1.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 166629 melee ticks, 44010 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 33 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 59159 sent, 54342 reached their opponent, 9434 virtual hits (17.4% of those reached).

## Melee bench: F03

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 152 over 6 battles (25.3 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 94.8 | 175 / 210 | 1.47 | 21.2% | 38663 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 21.2% | 175 |
| radnor.DoctorBob 1.42 | 2.2 | 13.8% | 10 |
| kawigi.nano.Lib 1.0 | 2.8 | 13.1% | 9 |
| vuen.Cake 2.51 | 4.0 | 12.3% | 14 |
| urdos.URDOS 1.3 | 5.0 | 9.3% | 2 |
| adt.Ar1 2.1 | 6.3 | 7.6% | 0 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.4% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.8 | 6.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.7 | 5.2% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 96.5 | 29 / 35 | 6934 |
| 2 | 1 | 72.0 | 96.5 | 30 / 35 | 6527 |
| 3 | 1 | 70.0 | 89.5 | 26 / 35 | 6203 |
| 4 | 1 | 71.4 | 94.6 | 29 / 35 | 6278 |
| 5 | 1 | 71.6 | 94.9 | 29 / 35 | 6094 |
| 6 | 1 | 72.1 | 96.5 | 32 / 35 | 6627 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 67 | 93% |
| radnor.DoctorBob 1.42 | 59 | 95% |
| kawigi.nano.Lib 1.0 | 46 | 96% |
| oa.weak.FlyMk1 0.1 | 7 | 100% |
| adt.Ar1 2.1 | 3 | 100% |
| urdos.URDOS 1.3 | 2 | 50% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 35 of 210 rounds, at a mean tick of 741. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 10 | 29% | 47 |
| radnor.DoctorBob 1.42 | 9 | 26% | 61 |
| vuen.Cake 2.51 | 7 | 20% | 70 |
| urdos.URDOS 1.3 | 5 | 14% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 3 | 9% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 3% | 3 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 11 |
| adt.Ar1 2.1 | 0 | 0% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 129398 melee ticks, 39522 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 32 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 39486 sent, 34806 reached their opponent, 8894 virtual hits (25.6% of those reached).

## Melee bench: F04

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 184 over 6 battles (30.7 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 87.8 | 45 / 210 | 2.10 | 18.2% | 33953 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 21.9% | 147 |
| hadur117.Hadur 3.19ms | 2.0 | 18.2% | 45 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.0% | 5 |
| TNT.TNT 0.99.1 | 4.2 | 10.6% | 9 |
| josago.Jorgito 0.16 | 4.8 | 9.5% | 3 |
| css.Delitioner 0.11 | 6.2 | 7.6% | 1 |
| tj.zombie1n 1.0.1 | 7.0 | 6.3% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.7% | 0 |
| spin.Bugstard 0.012b | 9.3 | 3.9% | 0 |
| sp.Nanos.Ember 1.1 | 9.7 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.1 | 85.7 | 6 / 35 | 5446 |
| 2 | 2 | 69.5 | 88.9 | 9 / 35 | 6144 |
| 3 | 2 | 69.1 | 88.3 | 8 / 35 | 5676 |
| 4 | 2 | 67.7 | 85.1 | 5 / 35 | 5184 |
| 5 | 2 | 69.6 | 89.8 | 11 / 35 | 5739 |
| 6 | 2 | 69.4 | 88.9 | 6 / 35 | 5764 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 129 | 16% |
| apc.LeeroyJenkins2 1.0 | 16 | 75% |
| TNT.TNT 0.99.1 | 9 | 33% |
| josago.Jorgito 0.16 | 9 | 67% |
| css.Delitioner 0.11 | 2 | 100% |
| spin.Bugstard 0.012b | 1 | 100% |

Hadur died in 166 of 210 rounds, at a mean tick of 1319. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 122 | 73% | 147 |
| apc.LeeroyJenkins2 1.0 | 20 | 12% | 30 |
| josago.Jorgito 0.16 | 10 | 6% | 14 |
| TNT.TNT 0.99.1 | 9 | 5% | 12 |
| css.Delitioner 0.11 | 3 | 2% | 6 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 191513 melee ticks, 75752 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 64 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 59339 sent, 54417 reached their opponent, 8099 virtual hits (14.9% of those reached).

## Melee bench: F05

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 550 over 6 battles (91.7 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 79.7 | 39 / 210 | 2.82 | 15.4% | 23380 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 17.4% | 87 |
| justin.DemonicRage 3.4 | 2.0 | 17.0% | 61 |
| hadur117.Hadur 3.19ms | 2.7 | 15.4% | 39 |
| wompi.Numbat 2.1 | 4.0 | 12.5% | 14 |
| axeBots.HataMoto 3.09 | 5.3 | 9.1% | 7 |
| ms.Ares 0.19 | 5.7 | 8.9% | 2 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.1% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.6% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 3.9% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.5 | 81.0 | 4 / 35 | 3916 |
| 2 | 3 | 64.2 | 78.7 | 6 / 35 | 3621 |
| 3 | 2 | 64.3 | 80.0 | 5 / 35 | 4052 |
| 4 | 3 | 64.3 | 76.2 | 9 / 35 | 3915 |
| 5 | 3 | 65.5 | 81.9 | 8 / 35 | 3960 |
| 6 | 2 | 64.5 | 80.6 | 7 / 35 | 3916 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 46 | 48% |
| cb.fire.Firestarter 2.0f | 39 | 13% |
| wompi.Numbat 2.1 | 11 | 55% |
| axeBots.HataMoto 3.09 | 9 | 44% |
| ms.Ares 0.19 | 2 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 925. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 64 | 37% | 84 |
| cb.fire.Firestarter 2.0f | 60 | 34% | 69 |
| wompi.Numbat 2.1 | 26 | 15% | 30 |
| axeBots.HataMoto 3.09 | 13 | 7% | 17 |
| ms.Ares 0.19 | 4 | 2% | 6 |
| supersample.SuperBoxBot 1.0 | 3 | 2% | 3 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 157088 melee ticks, 40515 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 80 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 48409 sent, 43418 reached their opponent, 7230 virtual hits (16.7% of those reached).

## Melee bench: F06

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 448 over 6 battles (74.7 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 92.4 | 150 / 210 | 1.68 | 20.5% | 32984 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 20.5% | 150 |
| jekl.StoneGhost 0.7 | 2.2 | 14.3% | 17 |
| origin.SleepSiphon 1.7b | 3.0 | 13.0% | 26 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 11.4% | 9 |
| mld.Wisdom 1.0 | 5.0 | 10.3% | 2 |
| gg.Wolverine 2.0 | 6.5 | 8.2% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 7.4% | 3 |
| DBall.NUKE 0.1 | 8.0 | 5.9% | 1 |
| spinnercat.Omen 1.0 | 8.5 | 6.0% | 0 |
| sample.Fire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 93.0 | 26 / 35 | 5716 |
| 2 | 1 | 69.3 | 86.7 | 19 / 35 | 5243 |
| 3 | 1 | 71.4 | 94.3 | 28 / 35 | 5454 |
| 4 | 1 | 71.0 | 92.4 | 25 / 35 | 5543 |
| 5 | 1 | 72.1 | 97.1 | 29 / 35 | 5679 |
| 6 | 1 | 70.4 | 91.1 | 23 / 35 | 5349 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 66 | 92% |
| origin.SleepSiphon 1.7b | 44 | 82% |
| pe.minimelee.SandboxMiniMelee 1.1 | 27 | 78% |
| gg.Wolverine 2.0 | 10 | 100% |
| mld.Wisdom 1.0 | 10 | 90% |
| ers.nano.hawk.HawkLA 3.0m | 9 | 89% |
| DBall.NUKE 0.1 | 3 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 21 | 33% | 60 |
| origin.SleepSiphon 1.7b | 16 | 25% | 63 |
| pe.minimelee.SandboxMiniMelee 1.1 | 6 | 10% | 32 |
| mld.Wisdom 1.0 | 6 | 10% | 18 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 10% | 17 |
| spinnercat.Omen 1.0 | 2 | 3% | 4 |
| gg.Wolverine 2.0 | 1 | 2% | 9 |
| DBall.NUKE 0.1 | 1 | 2% | 6 |
| sample.Fire 1.0 | 1 | 2% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 155761 melee ticks, 42399 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 109 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 109 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 47731 sent, 42879 reached their opponent, 9251 virtual hits (21.6% of those reached).

## Melee bench: F07

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 289 over 6 battles (48.2 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 93.0 | 126 / 210 | 1.63 | 20.8% | 38102 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 20.8% | 126 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 16.5% | 36 |
| rtk.Tachikoma 1.0 | 2.7 | 16.1% | 27 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.4% | 10 |
| franzor.Lizt 1.3.1 | 4.8 | 10.6% | 11 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.3% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.9% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.5% | 0 |
| sample.Target 1.0 | 9.2 | 2.2% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 89.2 | 16 / 35 | 5699 |
| 2 | 1 | 72.0 | 92.7 | 19 / 35 | 6120 |
| 3 | 1 | 72.7 | 93.0 | 20 / 35 | 6598 |
| 4 | 1 | 73.7 | 96.2 | 27 / 35 | 6553 |
| 5 | 1 | 72.5 | 92.4 | 22 / 35 | 6340 |
| 6 | 1 | 73.2 | 94.6 | 22 / 35 | 6792 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 78 | 74% |
| rsalesc.melee.Monk 0.3.6c | 44 | 36% |
| oog.melee.CapuletDroid 1.1 | 33 | 88% |
| franzor.Lizt 1.3.1 | 30 | 73% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 1425. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 35 | 41% | 102 |
| rsalesc.melee.Monk 0.3.6c | 33 | 38% | 62 |
| franzor.Lizt 1.3.1 | 8 | 9% | 0 |
| oog.melee.CapuletDroid 1.1 | 7 | 8% | 42 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 2 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 183962 melee ticks, 89579 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 51 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 55231 sent, 50454 reached their opponent, 9966 virtual hits (19.8% of those reached).

## Melee bench: F08

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 442 over 6 battles (73.7 per battle, most in one battle 151). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 91.1 | 133 / 210 | 1.80 | 19.8% | 31046 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 19.8% | 133 |
| tm.Yuugao 1.0 | 2.3 | 13.1% | 25 |
| shrub.Vapour v159 | 3.2 | 12.2% | 19 |
| Krabb.sliNk.Garm 0.9u | 3.7 | 11.5% | 16 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 9.8% | 4 |
| m3thos.Eva00 1.1 | 6.2 | 8.6% | 4 |
| jwst.DAD.DarkAndDarker 1.1 | 7.0 | 7.9% | 6 |
| qualidafial.MajorDick 1.0.1 | 7.8 | 6.7% | 1 |
| SHAM.WOW 1.4 | 9.3 | 5.4% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.7 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 88.9 | 20 / 35 | 4814 |
| 2 | 1 | 69.0 | 89.5 | 22 / 35 | 5066 |
| 3 | 1 | 70.7 | 92.4 | 24 / 35 | 5740 |
| 4 | 1 | 70.9 | 95.2 | 26 / 35 | 5275 |
| 5 | 1 | 69.6 | 92.1 | 19 / 35 | 5125 |
| 6 | 1 | 68.8 | 88.3 | 22 / 35 | 5026 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 59 | 76% |
| shrub.Vapour v159 | 36 | 75% |
| Krabb.sliNk.Garm 0.9u | 31 | 74% |
| com.spp.robocode.MostlyHarmless 010 | 17 | 88% |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 83% |
| m3thos.Eva00 1.1 | 8 | 75% |
| zyx.nano.BacillusComma 1.0 | 4 | 75% |
| SHAM.WOW 1.4 | 3 | 67% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 891. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 23 | 29% | 66 |
| Krabb.sliNk.Garm 0.9u | 19 | 24% | 42 |
| shrub.Vapour v159 | 17 | 22% | 43 |
| com.spp.robocode.MostlyHarmless 010 | 10 | 13% | 24 |
| jwst.DAD.DarkAndDarker 1.1 | 3 | 4% | 19 |
| m3thos.Eva00 1.1 | 3 | 4% | 9 |
| zyx.nano.BacillusComma 1.0 | 2 | 3% | 6 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 149443 melee ticks, 46997 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 170 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 48 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 48212 sent, 43453 reached their opponent, 7933 virtual hits (18.3% of those reached).

## Melee bench: F09

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 431 over 6 battles (71.8 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 80.5 | 58 / 210 | 2.76 | 16.2% | 23353 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 17.2% | 98 |
| hadur117.Hadur 3.19ms | 1.7 | 16.2% | 58 |
| kc.micro.Figment 1.0 | 3.0 | 13.7% | 22 |
| yagami.Tidus 0.11 | 4.5 | 10.3% | 3 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.4% | 16 |
| mc2.enemy.Original 0.9 | 5.7 | 9.6% | 10 |
| dft.Calliope 5.6 | 7.0 | 7.4% | 2 |
| step.nanoPri 1.0 | 8.3 | 5.7% | 0 |
| rdm.Dueler 0.4x | 9.3 | 4.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 84.8 | 12 / 35 | 4304 |
| 2 | 1 | 65.5 | 83.2 | 9 / 35 | 3975 |
| 3 | 2 | 64.7 | 81.6 | 10 / 35 | 3555 |
| 4 | 2 | 65.3 | 80.3 | 7 / 35 | 4118 |
| 5 | 2 | 63.2 | 76.5 | 9 / 35 | 3568 |
| 6 | 2 | 64.3 | 76.5 | 11 / 35 | 3833 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 76 | 25% |
| kc.micro.Figment 1.0 | 33 | 76% |
| pedersen.Grishnakh 1.0 | 11 | 45% |
| yagami.Tidus 0.11 | 6 | 83% |
| mc2.enemy.Original 0.9 | 4 | 50% |
| dft.Calliope 5.6 | 3 | 67% |

Hadur died in 155 of 210 rounds, at a mean tick of 950. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 70 | 45% | 92 |
| kc.micro.Figment 1.0 | 24 | 15% | 47 |
| mc2.enemy.Original 0.9 | 17 | 11% | 19 |
| pedersen.Grishnakh 1.0 | 15 | 10% | 17 |
| yagami.Tidus 0.11 | 13 | 8% | 20 |
| robar.nano.Assertive_Melee 0.2 | 6 | 4% | 6 |
| dft.Calliope 5.6 | 4 | 3% | 6 |
| step.nanoPri 1.0 | 2 | 1% | 2 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 151389 melee ticks, 49113 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 72 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 49229 sent, 44504 reached their opponent, 6323 virtual hits (14.2% of those reached).

## Melee bench: F10

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 245 over 6 battles (40.8 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 96.0 | 166 / 210 | 1.36 | 20.9% | 34461 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 20.9% | 166 |
| DTF.Kludgy 1.2b | 2.5 | 14.1% | 20 |
| ne.Chimera 1.2 | 2.8 | 12.9% | 12 |
| ejb.Polaris 1.0.1 | 3.8 | 11.7% | 7 |
| vStar.RAFzilla 2.15 | 5.3 | 10.1% | 1 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.1% | 3 |
| sam.Samspin 1.0 | 7.7 | 5.5% | 0 |
| kurios.DOSexe .9b | 8.2 | 5.4% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 5.0% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 95.9 | 27 / 35 | 5884 |
| 2 | 1 | 72.1 | 97.8 | 29 / 35 | 5939 |
| 3 | 1 | 71.6 | 97.1 | 28 / 35 | 5694 |
| 4 | 1 | 72.1 | 96.5 | 30 / 35 | 6001 |
| 5 | 1 | 69.9 | 92.1 | 25 / 35 | 5274 |
| 6 | 1 | 71.5 | 96.8 | 27 / 35 | 5669 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 78 | 83% |
| ejb.Polaris 1.0.1 | 39 | 85% |
| ne.Chimera 1.2 | 35 | 83% |
| vStar.RAFzilla 2.15 | 17 | 94% |
| tvv.micro.Antares 1.1.1 | 13 | 100% |
| kurios.DOSexe .9b | 4 | 100% |
| donjezza.Muncho 1.0 | 4 | 75% |
| sam.Samspin 1.0 | 2 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 1040. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 21 | 47% | 79 |
| ne.Chimera 1.2 | 12 | 27% | 36 |
| ejb.Polaris 1.0.1 | 8 | 18% | 53 |
| vStar.RAFzilla 2.15 | 1 | 2% | 15 |
| tvv.micro.Antares 1.1.1 | 1 | 2% | 10 |
| donjezza.Muncho 1.0 | 1 | 2% | 2 |
| kurios.DOSexe .9b | 0 | 0% | 10 |
| sam.Samspin 1.0 | 0 | 0% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 146427 melee ticks, 61632 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 88 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 88 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 47730 sent, 42889 reached their opponent, 8096 virtual hits (18.9% of those reached).

## Melee bench: F11

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 430 over 6 battles (71.7 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 81.2 | 65 / 210 | 2.70 | 16.2% | 23073 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.5 | 16.2% | 65 |
| rz.Aleph 0.34 | 1.5 | 16.4% | 78 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.5% | 22 |
| djc.DynaBot 0.1.1 | 4.0 | 11.0% | 15 |
| br2.MobyDickBot 1.6 | 5.5 | 9.3% | 14 |
| rdt199.Warlord 0.73 | 5.7 | 9.3% | 12 |
| uji.YellohFellah 1.0 | 6.8 | 7.9% | 7 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.3% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.3% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 84.8 | 10 / 35 | 3817 |
| 2 | 2 | 65.6 | 83.8 | 11 / 35 | 3928 |
| 3 | 2 | 62.8 | 74.6 | 9 / 35 | 3783 |
| 4 | 1 | 67.3 | 87.3 | 17 / 35 | 4171 |
| 5 | 1 | 64.3 | 80.0 | 12 / 35 | 3767 |
| 6 | 2 | 62.6 | 76.5 | 6 / 35 | 3607 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 63 | 41% |
| cx.mini.Nimrod 0.55 | 15 | 47% |
| uji.YellohFellah 1.0 | 14 | 71% |
| djc.DynaBot 0.1.1 | 13 | 62% |
| rdt199.Warlord 0.73 | 12 | 67% |
| br2.MobyDickBot 1.6 | 9 | 56% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 65 | 44% | 96 |
| cx.mini.Nimrod 0.55 | 27 | 18% | 34 |
| djc.DynaBot 0.1.1 | 17 | 11% | 26 |
| rdt199.Warlord 0.73 | 13 | 9% | 18 |
| br2.MobyDickBot 1.6 | 10 | 7% | 16 |
| uji.YellohFellah 1.0 | 5 | 3% | 10 |
| KiraNL.Chupacabra 0.4 | 4 | 3% | 6 |
| stelo.MirrorNano 1.3 | 2 | 1% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 155231 melee ticks, 36889 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 664 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 538 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 50887 sent, 45879 reached their opponent, 6298 virtual hits (13.7% of those reached).

## Melee bench: F12

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 217 over 6 battles (36.2 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 89.0 | 145 / 210 | 1.99 | 18.8% | 24035 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 18.8% | 145 |
| bts.wiki.RipCurl 0.9b | 2.7 | 13.7% | 26 |
| darkcanuck.Leon 1.01 | 3.0 | 12.7% | 13 |
| nat.PallasHawk 1.0 | 3.3 | 12.4% | 14 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.5% | 7 |
| jrm.Test0 1.0 | 6.2 | 7.9% | 2 |
| cs.sheldor.Talon 1.1 | 7.2 | 7.3% | 0 |
| jp.Perpy 16.0 | 7.7 | 6.6% | 0 |
| stuff.Vlad 0.1 | 9.3 | 5.3% | 0 |
| jaybot.bots.Oddball 4.0 | 9.7 | 4.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 91.7 | 29 / 35 | 3987 |
| 2 | 1 | 67.7 | 83.8 | 22 / 35 | 4281 |
| 3 | 1 | 68.0 | 88.6 | 24 / 35 | 3903 |
| 4 | 1 | 68.7 | 90.8 | 23 / 35 | 3724 |
| 5 | 1 | 67.7 | 87.0 | 23 / 35 | 3952 |
| 6 | 1 | 69.3 | 92.4 | 24 / 35 | 4188 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 57 | 96% |
| bts.wiki.RipCurl 0.9b | 48 | 85% |
| nat.PallasHawk 1.0 | 38 | 82% |
| brainfade.melee.Genghis 0.36 | 7 | 86% |
| jaybot.bots.Oddball 4.0 | 7 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| jp.Perpy 16.0 | 1 | 100% |
| jrm.Test0 1.0 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 589. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 16 | 24% | 44 |
| bts.wiki.RipCurl 0.9b | 15 | 22% | 45 |
| brainfade.melee.Genghis 0.36 | 11 | 16% | 21 |
| jrm.Test0 1.0 | 11 | 16% | 18 |
| darkcanuck.Leon 1.01 | 5 | 7% | 58 |
| cs.sheldor.Talon 1.1 | 5 | 7% | 10 |
| jp.Perpy 16.0 | 2 | 3% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 2 |
| jaybot.bots.Oddball 4.0 | 0 | 0% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 127310 melee ticks, 35884 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 48 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 43968 sent, 38906 reached their opponent, 6422 virtual hits (16.5% of those reached).

## Melee bench: F13

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 89 over 6 battles (14.8 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 82.4 | 73 / 210 | 2.58 | 16.2% | 24539 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.8 | 16.2% | 73 |
| mn.Combat 3.25.0 | 1.8 | 16.2% | 73 |
| ags.Glacier 0.2.11 | 2.3 | 15.8% | 34 |
| shinh.Entangled 0.3 | 4.0 | 12.3% | 21 |
| gh.micro.Gruweltje 0.7 | 5.0 | 11.4% | 6 |
| apc.Colossus2 0.17 | 6.3 | 7.9% | 2 |
| stelo.Wang 1.0 | 6.7 | 7.4% | 1 |
| maribo.FollowFire 1 | 8.3 | 5.0% | 0 |
| ayk.WallHugger 1.0 | 8.7 | 4.5% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 86.0 | 14 / 35 | 3965 |
| 2 | 1 | 66.6 | 85.4 | 12 / 35 | 4352 |
| 3 | 3 | 64.9 | 81.0 | 10 / 35 | 4058 |
| 4 | 3 | 62.9 | 74.3 | 7 / 35 | 3972 |
| 5 | 1 | 67.3 | 85.4 | 18 / 35 | 4342 |
| 6 | 2 | 65.4 | 82.5 | 12 / 35 | 3850 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 51 | 73% |
| mn.Combat 3.25.0 | 42 | 29% |
| shinh.Entangled 0.3 | 27 | 67% |
| gh.micro.Gruweltje 0.7 | 6 | 67% |
| stelo.Wang 1.0 | 2 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 51 | 37% | 63 |
| ags.Glacier 0.2.11 | 35 | 26% | 67 |
| shinh.Entangled 0.3 | 20 | 15% | 38 |
| gh.micro.Gruweltje 0.7 | 13 | 9% | 19 |
| stelo.Wang 1.0 | 11 | 8% | 12 |
| maribo.FollowFire 1 | 4 | 3% | 4 |
| apc.Colossus2 0.17 | 3 | 2% | 5 |
| ayk.WallHugger 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 203 rounds): 146425 melee ticks, 44137 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 82 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 82 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 43508 sent, 38404 reached their opponent, 6187 virtual hits (16.1% of those reached).

## Melee bench: F14

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 186 over 6 battles (31.0 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 94.1 | 153 / 210 | 1.53 | 20.9% | 35521 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 20.9% | 153 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.2% | 18 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.3% | 25 |
| Lo_Ian.Gandalf_V4 4.0 | 4.8 | 9.5% | 0 |
| co.edu.usb.rc.LidisTron 1.0 | 5.3 | 9.1% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.7 | 9.2% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.3 | 8.5% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.8 | 7.8% | 0 |
| pa.Improved 1.0 | 9.0 | 6.0% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 95.6 | 26 / 35 | 6208 |
| 2 | 1 | 71.8 | 94.6 | 27 / 35 | 5936 |
| 3 | 1 | 71.9 | 94.6 | 26 / 35 | 6141 |
| 4 | 1 | 70.5 | 92.1 | 23 / 35 | 5545 |
| 5 | 1 | 71.7 | 93.7 | 26 / 35 | 5938 |
| 6 | 1 | 71.3 | 94.3 | 25 / 35 | 5753 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 80 | 93% |
| catcat20.shape.Theta 0.018 | 51 | 63% |
| sheldor.micro.PointInLineRRAL 1.0 | 17 | 65% |
| sanyi.mikrobi.Roberto 1.0 | 15 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 9 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 6 | 100% |
| pa.Improved 1.0 | 5 | 80% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 979. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 25 | 44% | 54 |
| simonton.micro.Sprout 1.1.3 | 13 | 23% | 81 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 16% | 24 |
| sanyi.mikrobi.Roberto 1.0 | 5 | 9% | 23 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 5% | 6 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 2% | 8 |
| pa.Improved 1.0 | 1 | 2% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 5 |

Posture (Hadur's M records, 200 rounds): 145102 melee ticks, 53143 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 42 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 2.

Targeting waves (200 rounds): 45509 sent, 40904 reached their opponent, 9600 virtual hits (23.5% of those reached).

## Melee bench: F15

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 154 over 6 battles (25.7 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 88.6 | 119 / 210 | 2.02 | 19.1% | 30626 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 19.1% | 119 |
| kawigi.micro.Shiz 1.1 | 2.2 | 13.9% | 18 |
| mld.DustBunny 3.8 | 3.3 | 12.8% | 11 |
| emp.Yngwie 1.11 | 3.5 | 12.5% | 48 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.7% | 4 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.0% | 12 |
| Grystrion.TrackerWO 1.0 | 7.3 | 6.6% | 0 |
| lambdaxy.TBot 0.1 | 8.0 | 6.0% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 4.9% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 88.9 | 19 / 35 | 5038 |
| 2 | 1 | 69.6 | 89.5 | 21 / 35 | 5047 |
| 3 | 1 | 69.5 | 89.5 | 22 / 35 | 5148 |
| 4 | 1 | 70.4 | 93.0 | 22 / 35 | 5527 |
| 5 | 1 | 69.6 | 89.8 | 20 / 35 | 5183 |
| 6 | 1 | 66.3 | 81.0 | 15 / 35 | 4683 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 54 | 44% |
| kawigi.micro.Shiz 1.1 | 38 | 100% |
| mld.DustBunny 3.8 | 30 | 97% |
| kawigi.robot.Girl 1.2 | 16 | 75% |
| cb.nano.Insomnia 1.0 | 14 | 86% |
| divineomega.TrialBot 0.003 | 3 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 1015. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 40 | 43% | 75 |
| mld.DustBunny 3.8 | 15 | 16% | 44 |
| cb.nano.Insomnia 1.0 | 13 | 14% | 17 |
| kawigi.micro.Shiz 1.1 | 9 | 10% | 38 |
| kawigi.robot.Girl 1.2 | 7 | 8% | 14 |
| divineomega.TrialBot 0.003 | 3 | 3% | 11 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 5 |
| lambdaxy.TBot 0.1 | 2 | 2% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 163431 melee ticks, 52295 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 67 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 67 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 53079 sent, 48231 reached their opponent, 8018 virtual hits (16.6% of those reached).

## Melee bench: F16

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 435 over 6 battles (72.5 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 90.4 | 125 / 210 | 1.87 | 20.2% | 34830 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 20.2% | 125 |
| gh.Griezel 0.5.2 | 2.0 | 16.3% | 40 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.9% | 12 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.5% | 17 |
| bvh.fnr.Fenrir 0.36l | 5.2 | 9.3% | 6 |
| tvv.nano.Polaris 1.2 | 5.7 | 8.6% | 5 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.2% | 2 |
| repositorio.NanoStep 1.0 | 8.7 | 4.8% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.2 | 4.7% | 2 |
| asd.Cthulhu 1.3 | 9.2 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 94.3 | 24 / 35 | 6096 |
| 2 | 1 | 72.2 | 95.2 | 24 / 35 | 6120 |
| 3 | 1 | 70.0 | 87.3 | 21 / 35 | 5756 |
| 4 | 1 | 68.2 | 86.3 | 15 / 35 | 5045 |
| 5 | 1 | 69.9 | 87.0 | 20 / 35 | 5739 |
| 6 | 1 | 71.3 | 92.1 | 21 / 35 | 6074 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 89 | 72% |
| techdude.forest.FlamingForest 1.1 | 37 | 73% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 24 | 88% |
| bvh.fnr.Fenrir 0.36l | 10 | 70% |
| tvv.nano.Polaris 1.2 | 6 | 83% |
| divineomega.DivineBot 1.9.4.5 | 1 | 100% |
| stelo.IntrinsicVolatility 1.4 | 1 | 0% |

Hadur died in 88 of 210 rounds, at a mean tick of 1204. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 31 | 35% | 91 |
| techdude.forest.FlamingForest 1.1 | 18 | 20% | 48 |
| bvh.fnr.Fenrir 0.36l | 13 | 15% | 19 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 11 | 13% | 27 |
| tvv.nano.Polaris 1.2 | 4 | 5% | 7 |
| stelo.IntrinsicVolatility 1.4 | 3 | 3% | 9 |
| asd.Cthulhu 1.3 | 3 | 3% | 4 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 3 |
| repositorio.NanoStep 1.0 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 188268 melee ticks, 70740 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 74 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 74 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 58810 sent, 54099 reached their opponent, 9131 virtual hits (16.9% of those reached).

## Melee bench: F17

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 116 over 6 battles (19.3 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 88.6 | 115 / 210 | 2.02 | 19.7% | 35697 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 19.7% | 115 |
| et.Predator 1.8 | 2.7 | 13.1% | 12 |
| oog.melee.Mercutio 1.0 | 2.8 | 13.0% | 37 |
| cx.BlestPain 1.41 | 3.5 | 12.4% | 36 |
| ahf.NanoAndrew .4 | 5.3 | 10.2% | 6 |
| nic.Nicator 2.4 | 6.3 | 8.9% | 4 |
| maribo.melee.BMV 0.1 | 6.3 | 8.9% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.6% | 0 |
| tex.Longbot 0.4 | 8.7 | 5.8% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 90.2 | 19 / 35 | 6060 |
| 2 | 1 | 68.8 | 83.2 | 18 / 35 | 5923 |
| 3 | 1 | 69.9 | 88.6 | 18 / 35 | 5958 |
| 4 | 1 | 71.8 | 93.7 | 25 / 35 | 6159 |
| 5 | 1 | 69.9 | 88.6 | 19 / 35 | 5892 |
| 6 | 1 | 69.3 | 87.6 | 16 / 35 | 5705 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 59 | 69% |
| et.Predator 1.8 | 47 | 85% |
| cx.BlestPain 1.41 | 33 | 27% |
| ahf.NanoAndrew .4 | 11 | 91% |
| maribo.melee.BMV 0.1 | 5 | 100% |
| nic.Nicator 2.4 | 5 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 4 | 100% |
| tex.Longbot 0.4 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 1151. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 31 | 32% | 44 |
| oog.melee.Mercutio 1.0 | 28 | 29% | 64 |
| et.Predator 1.8 | 21 | 22% | 55 |
| ahf.NanoAndrew .4 | 5 | 5% | 15 |
| maribo.melee.BMV 0.1 | 5 | 5% | 15 |
| tex.Longbot 0.4 | 3 | 3% | 4 |
| nic.Nicator 2.4 | 2 | 2% | 6 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 7 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 156691 melee ticks, 67185 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 88 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 88 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 52364 sent, 47667 reached their opponent, 10081 virtual hits (21.1% of those reached).

## Melee bench: F18

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 370 over 6 battles (61.7 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 91.8 | 142 / 210 | 1.74 | 20.0% | 30310 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 20.0% | 142 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.5% | 29 |
| agd.Mooserwirt2 2.7 | 3.5 | 11.3% | 15 |
| uji.DBH 1.1 | 3.7 | 11.0% | 8 |
| spinnercat.Robovirus 2.718 | 5.3 | 9.2% | 3 |
| sigterm.Sigterm 1.0 | 5.8 | 9.3% | 8 |
| ratosh.Nobo 0.21 | 6.7 | 8.1% | 4 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.0% | 1 |
| stelo.WangRobot 1.0 | 9.0 | 5.7% | 0 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 93.0 | 24 / 35 | 5148 |
| 2 | 1 | 69.9 | 92.1 | 24 / 35 | 4974 |
| 3 | 1 | 70.3 | 93.3 | 26 / 35 | 5111 |
| 4 | 1 | 69.9 | 92.1 | 25 / 35 | 4884 |
| 5 | 1 | 68.8 | 87.9 | 20 / 35 | 5065 |
| 6 | 1 | 70.0 | 92.4 | 23 / 35 | 5128 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 62 | 73% |
| uji.DBH 1.1 | 33 | 91% |
| agd.Mooserwirt2 2.7 | 28 | 89% |
| sigterm.Sigterm 1.0 | 17 | 88% |
| ratosh.Nobo 0.21 | 13 | 77% |
| stelo.WangRobot 1.0 | 8 | 100% |
| spinnercat.Robovirus 2.718 | 7 | 71% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 828. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 34 | 48% | 74 |
| agd.Mooserwirt2 2.7 | 7 | 10% | 32 |
| sigterm.Sigterm 1.0 | 7 | 10% | 23 |
| uji.DBH 1.1 | 6 | 8% | 33 |
| ratosh.Nobo 0.21 | 6 | 8% | 16 |
| spinnercat.Robovirus 2.718 | 5 | 7% | 11 |
| stelo.WangRobot 1.0 | 4 | 6% | 10 |
| kawigi.mini.Fhqwhgads 1.1 | 0 | 0% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 138535 melee ticks, 48397 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 49 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 46900 sent, 42052 reached their opponent, 9189 virtual hits (21.9% of those reached).

## Melee bench: F19

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 122 over 6 battles (20.3 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.7 | 98.7 | 199 / 210 | 1.11 | 22.6% | 37667 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 22.6% | 199 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.7% | 5 |
| krillr.mini.JointStrike 2.0.0 | 3.5 | 11.5% | 2 |
| mld.Infinity 2.2 | 3.8 | 11.3% | 1 |
| erdnis.Rover 0.3 | 4.7 | 10.4% | 4 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.5% | 0 |
| mbh.Mbh 0.1 | 6.7 | 8.3% | 0 |
| pac.ABC 2.1 | 8.2 | 6.3% | 0 |
| pbg.R2D2 1.0 | 8.8 | 5.3% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.8 | 99.4 | 34 / 35 | 6213 |
| 2 | 1 | 73.6 | 99.4 | 34 / 35 | 6173 |
| 3 | 1 | 74.0 | 99.0 | 33 / 35 | 6375 |
| 4 | 1 | 72.8 | 96.2 | 32 / 35 | 6090 |
| 5 | 1 | 74.1 | 99.7 | 34 / 35 | 6534 |
| 6 | 1 | 73.8 | 98.7 | 32 / 35 | 6282 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 119 | 98% |
| mld.Infinity 2.2 | 26 | 100% |
| krillr.mini.JointStrike 2.0.0 | 19 | 100% |
| erdnis.Rover 0.3 | 13 | 85% |
| pac.ABC 2.1 | 10 | 100% |
| patson.PatsonTestBot 1.0 | 9 | 100% |
| pbg.R2D2 1.0 | 4 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |

Hadur died in 13 of 210 rounds, at a mean tick of 873. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| krillr.mini.JointStrike 2.0.0 | 4 | 31% | 40 |
| davidalves.net.DuelistMiniMelee 1.2 | 3 | 23% | 68 |
| erdnis.Rover 0.3 | 3 | 23% | 23 |
| patson.PatsonTestBot 1.0 | 1 | 8% | 23 |
| mld.Infinity 2.2 | 1 | 8% | 21 |
| pbg.R2D2 1.0 | 0 | 0% | 12 |
| pac.ABC 2.1 | 0 | 0% | 11 |
| mbh.Mbh 0.1 | 0 | 0% | 7 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 128457 melee ticks, 48399 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 47 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 42817 sent, 38142 reached their opponent, 8895 virtual hits (23.3% of those reached).

## Melee bench: F20

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 644 over 6 battles (107.3 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 94.1 | 153 / 210 | 1.53 | 21.4% | 36901 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 21.4% | 153 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.1% | 25 |
| catcat20.Rabbit 0.001 | 3.7 | 11.1% | 16 |
| fwb.Nine 1.0.1 | 4.0 | 10.7% | 10 |
| nz.jdc.nano.GridFu 1.0 | 4.3 | 10.3% | 2 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.9% | 3 |
| bayen.nut.Squirrel 1.615 | 7.7 | 6.3% | 1 |
| djdjdj.NanoSkunk10 1.0 | 8.0 | 6.0% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.3 | 5.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 96.8 | 31 / 35 | 6093 |
| 2 | 1 | 71.2 | 92.7 | 24 / 35 | 5971 |
| 3 | 1 | 71.7 | 94.6 | 22 / 35 | 6157 |
| 4 | 1 | 70.7 | 89.5 | 25 / 35 | 5813 |
| 5 | 1 | 72.7 | 94.9 | 26 / 35 | 6505 |
| 6 | 1 | 72.3 | 95.9 | 25 / 35 | 6362 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 92 | 79% |
| catcat20.Rabbit 0.001 | 36 | 69% |
| fwb.Nine 1.0.1 | 33 | 94% |
| nz.jdc.nano.GridFu 1.0 | 11 | 91% |
| m3thos.mini.Eva01 0.5.5 | 9 | 100% |
| bayen.nut.Squirrel 1.615 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 1137. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 29 | 47% | 98 |
| catcat20.Rabbit 0.001 | 14 | 23% | 45 |
| nz.jdc.nano.GridFu 1.0 | 5 | 8% | 25 |
| fwb.Nine 1.0.1 | 5 | 8% | 12 |
| bayen.nut.Squirrel 1.615 | 3 | 5% | 7 |
| m3thos.mini.Eva01 0.5.5 | 1 | 2% | 14 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 3 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 3 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 165777 melee ticks, 63434 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 50 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 52897 sent, 47971 reached their opponent, 10638 virtual hits (22.2% of those reached).

## Melee bench: F21

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 599 over 6 battles (99.8 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 92.1 | 126 / 210 | 1.71 | 20.5% | 35888 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 20.5% | 126 |
| eem.EvBot v4.6.16 | 2.0 | 16.4% | 67 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.5% | 6 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.6% | 2 |
| eld.Hmm 1.0 | 5.2 | 8.5% | 10 |
| oa.weak.BotherBot 0.1 | 5.8 | 7.5% | 0 |
| fire219.CatBot 1.0 | 7.7 | 6.1% | 0 |
| el.JumpShoot 0.2 | 8.0 | 5.9% | 1 |
| PSW.Relentless 0.1 | 8.5 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 91.1 | 23 / 35 | 5873 |
| 2 | 1 | 70.3 | 91.4 | 15 / 35 | 5991 |
| 3 | 1 | 70.7 | 91.7 | 19 / 35 | 5762 |
| 4 | 1 | 71.8 | 93.3 | 22 / 35 | 6086 |
| 5 | 1 | 72.2 | 95.9 | 25 / 35 | 6176 |
| 6 | 1 | 70.7 | 89.2 | 22 / 35 | 6000 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 122 | 63% |
| dummy.mini.Scimitar 1.01 | 25 | 84% |
| cf.RiO.RiOx 4.2.1 | 18 | 100% |
| eld.Hmm 1.0 | 15 | 60% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 1336. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 50 | 56% | 107 |
| dummy.mini.Scimitar 1.01 | 16 | 18% | 47 |
| eld.Hmm 1.0 | 10 | 11% | 29 |
| cf.RiO.RiOx 4.2.1 | 5 | 6% | 20 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |
| PSW.Relentless 0.1 | 1 | 1% | 1 |
| arthord.MannyPacquiao Beta | 1 | 1% | 0 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 3 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 184663 melee ticks, 87735 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 802 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 453 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 53608 sent, 48815 reached their opponent, 8391 virtual hits (17.2% of those reached).

## Melee bench: F22

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 327 over 6 battles (54.5 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 88.6 | 99 / 210 | 2.02 | 18.8% | 30900 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 18.8% | 99 |
| pe.SandboxDT 2.71m | 2.2 | 15.7% | 60 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.6% | 18 |
| jlm.javaDisturbance 0.59 | 3.8 | 13.3% | 26 |
| bigpete.Stewie 1.0 | 5.0 | 10.2% | 4 |
| yk.JahRoslav 1.1 | 6.8 | 7.1% | 3 |
| tad.Dalek98 0.98 | 7.2 | 6.4% | 0 |
| gg.Squaraus 0.6 | 7.3 | 6.5% | 0 |
| pbg.NinjaX 1.2 | 8.7 | 4.9% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 91.4 | 19 / 35 | 5288 |
| 2 | 1 | 69.5 | 90.8 | 16 / 35 | 4874 |
| 3 | 1 | 69.7 | 89.2 | 19 / 35 | 5276 |
| 4 | 1 | 68.4 | 86.3 | 15 / 35 | 4918 |
| 5 | 1 | 69.6 | 88.9 | 15 / 35 | 5551 |
| 6 | 1 | 68.1 | 85.1 | 15 / 35 | 4993 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 53 | 36% |
| kvk.HebusLeTroll 0.35 | 40 | 70% |
| jlm.javaDisturbance 0.59 | 39 | 67% |
| bigpete.Stewie 1.0 | 18 | 94% |
| yk.JahRoslav 1.1 | 4 | 50% |
| pbg.NinjaX 1.2 | 4 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 2 | 100% |
| tad.Dalek98 0.98 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 1041. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 55 | 49% | 79 |
| kvk.HebusLeTroll 0.35 | 27 | 24% | 61 |
| jlm.javaDisturbance 0.59 | 20 | 18% | 39 |
| bigpete.Stewie 1.0 | 5 | 4% | 20 |
| tad.Dalek98 0.98 | 2 | 2% | 3 |
| yk.JahRoslav 1.1 | 2 | 2% | 1 |
| pbg.NinjaX 1.2 | 0 | 0% | 4 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 2 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 162190 melee ticks, 52756 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 32 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 51739 sent, 46965 reached their opponent, 7422 virtual hits (15.8% of those reached).

## Melee bench: F23

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 419 over 6 battles (69.8 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.5 | 96.8 | 184 / 210 | 1.29 | 22.2% | 37370 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 22.2% | 184 |
| pe.SandboxLump 1.52 | 2.0 | 16.5% | 19 |
| cre.Karolos 0.32 | 3.0 | 13.3% | 2 |
| stelo.RamTrackSurfer 1.2 | 4.3 | 9.6% | 2 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.3 | 9.1% | 0 |
| stelo.AreaTargetingBot 1.1 | 5.5 | 9.3% | 2 |
| cw.megas.Blade 0.8 | 7.0 | 8.2% | 0 |
| sample.Walls 1.0 | 7.8 | 7.3% | 1 |
| cli.WasteOfAmmo 1.0 | 9.2 | 2.6% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.6 | 98.4 | 32 / 35 | 5995 |
| 2 | 1 | 74.0 | 98.4 | 30 / 35 | 6224 |
| 3 | 1 | 74.2 | 98.7 | 33 / 35 | 6265 |
| 4 | 1 | 73.4 | 95.6 | 31 / 35 | 6393 |
| 5 | 1 | 73.8 | 97.8 | 30 / 35 | 6492 |
| 6 | 1 | 72.0 | 91.7 | 28 / 35 | 6001 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 116 | 91% |
| cre.Karolos 0.32 | 59 | 100% |
| stelo.RamTrackSurfer 1.2 | 8 | 88% |
| stelo.AreaTargetingBot 1.1 | 5 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 100% |
| sample.Walls 1.0 | 4 | 75% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 29 of 210 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 13 | 45% | 105 |
| cre.Karolos 0.32 | 6 | 21% | 56 |
| stelo.AreaTargetingBot 1.1 | 3 | 10% | 13 |
| stelo.RamTrackSurfer 1.2 | 2 | 7% | 14 |
| sample.Walls 1.0 | 1 | 3% | 5 |
| cw.megas.Blade 0.8 | 1 | 3% | 4 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 5 |
| cli.WasteOfAmmo 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 123054 melee ticks, 54707 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 40 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 38897 sent, 34135 reached their opponent, 10408 virtual hits (30.5% of those reached).

## Melee bench: F24

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 510 over 6 battles (85.0 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 82.8 | 77 / 210 | 2.55 | 16.5% | 22823 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 16.5% | 77 |
| rz.GlowBlowMelee 1.4 | 2.8 | 13.9% | 36 |
| florent.XSeries.X2 0.12 | 3.5 | 12.7% | 23 |
| davidalves.Phoenix 0.54 | 3.5 | 12.7% | 37 |
| pedersen.Ugluk 1.1.1 | 4.3 | 12.1% | 22 |
| oog.melee.Corsair 1.0 | 5.8 | 9.8% | 11 |
| stelo.SoJNanoMelee 1.1 | 7.3 | 6.8% | 3 |
| lunchie.Lunchbox 0.93 | 7.8 | 6.0% | 1 |
| as.FrankTheTank 1.3 | 9.2 | 4.8% | 0 |
| evd.X1 0.01 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 82.9 | 15 / 35 | 3983 |
| 2 | 1 | 65.2 | 81.6 | 12 / 35 | 3825 |
| 3 | 1 | 65.8 | 83.5 | 13 / 35 | 3826 |
| 4 | 1 | 65.8 | 85.1 | 14 / 35 | 3800 |
| 5 | 1 | 66.1 | 84.4 | 15 / 35 | 3855 |
| 6 | 1 | 63.5 | 79.0 | 8 / 35 | 3534 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 40 | 50% |
| pedersen.Ugluk 1.1.1 | 32 | 66% |
| davidalves.Phoenix 0.54 | 24 | 54% |
| florent.XSeries.X2 0.12 | 17 | 59% |
| oog.melee.Corsair 1.0 | 11 | 64% |
| stelo.SoJNanoMelee 1.1 | 5 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 32 | 23% | 55 |
| florent.XSeries.X2 0.12 | 32 | 23% | 48 |
| davidalves.Phoenix 0.54 | 32 | 23% | 42 |
| pedersen.Ugluk 1.1.1 | 23 | 17% | 35 |
| oog.melee.Corsair 1.0 | 10 | 7% | 19 |
| lunchie.Lunchbox 0.93 | 2 | 1% | 4 |
| evd.X1 0.01 | 2 | 1% | 3 |
| stelo.SoJNanoMelee 1.1 | 0 | 0% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 144846 melee ticks, 41699 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 47 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 47231 sent, 42050 reached their opponent, 7543 virtual hits (17.9% of those reached).

## Melee bench: F25

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 427 over 6 battles (71.2 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 87.5 | 137 / 210 | 2.13 | 18.5% | 23563 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 18.5% | 137 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.4% | 24 |
| jdw.Hurricane 1.4 | 3.0 | 12.2% | 21 |
| voidious.micro.BlitzBat 1.05 | 3.5 | 12.7% | 11 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.4% | 7 |
| ds.Oo 2.2 | 5.8 | 8.9% | 5 |
| awesomeness.Elite 1.0 | 7.3 | 7.1% | 1 |
| adt.Ar2 1.1 | 8.0 | 6.8% | 2 |
| gjr.Cephalosporin 0.1 | 8.5 | 6.5% | 2 |
| amk.ChumbaMini 0.2 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 78.7 | 16 / 35 | 3479 |
| 2 | 1 | 68.7 | 91.1 | 24 / 35 | 3876 |
| 3 | 1 | 70.1 | 93.7 | 26 / 35 | 4260 |
| 4 | 1 | 69.4 | 93.7 | 25 / 35 | 3974 |
| 5 | 1 | 66.7 | 81.3 | 22 / 35 | 3949 |
| 6 | 1 | 68.3 | 86.3 | 24 / 35 | 4025 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 49 | 80% |
| voidious.micro.BlitzBat 1.05 | 40 | 98% |
| jdw.Hurricane 1.4 | 35 | 77% |
| gre.svman4.Morfeas 1.4.1 | 10 | 80% |
| ds.Oo 2.2 | 9 | 89% |
| gjr.Cephalosporin 0.1 | 6 | 100% |
| awesomeness.Elite 1.0 | 6 | 100% |
| adt.Ar2 1.1 | 3 | 67% |
| amk.ChumbaMini 0.2 | 2 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 663. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 18 | 23% | 40 |
| voidious.mini.BrokenSword 2.0.3 | 17 | 22% | 48 |
| voidious.micro.BlitzBat 1.05 | 12 | 15% | 42 |
| adt.Ar2 1.1 | 9 | 11% | 11 |
| ds.Oo 2.2 | 6 | 8% | 25 |
| awesomeness.Elite 1.0 | 6 | 8% | 15 |
| gre.svman4.Morfeas 1.4.1 | 5 | 6% | 17 |
| amk.ChumbaMini 0.2 | 2 | 3% | 3 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 9 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 127666 melee ticks, 34528 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 33 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 45472 sent, 40511 reached their opponent, 6646 virtual hits (16.4% of those reached).

## Melee bench: F26

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 249 over 6 battles (41.5 per battle, most in one battle 144). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 93.2 | 152 / 210 | 1.61 | 21.0% | 37942 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 21.0% | 152 |
| ak.Fermat 2.0 | 2.0 | 15.1% | 29 |
| shu.nitro.LENIN .T34 | 3.5 | 12.3% | 12 |
| lrem.Spectre 0.4.4 | 3.7 | 11.8% | 9 |
| js.PinBall 1.6 | 5.0 | 10.4% | 4 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.4% | 4 |
| gh.mini.GrubbmOne 1.0 | 6.8 | 8.1% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.5% | 0 |
| sample.SpinBot 1.0 | 9.0 | 4.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 95.6 | 29 / 35 | 6791 |
| 2 | 1 | 71.0 | 91.4 | 23 / 35 | 6014 |
| 3 | 1 | 70.2 | 87.6 | 23 / 35 | 6151 |
| 4 | 1 | 72.9 | 95.2 | 28 / 35 | 6531 |
| 5 | 1 | 72.2 | 94.9 | 26 / 35 | 6110 |
| 6 | 1 | 72.1 | 94.3 | 23 / 35 | 6345 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 65 | 77% |
| shu.nitro.LENIN .T34 | 44 | 86% |
| lrem.Spectre 0.4.4 | 40 | 95% |
| js.PinBall 1.6 | 13 | 85% |
| jaybot.adv.bots.JayBot 2.0 | 9 | 78% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 100% |
| gh.mini.GrubbmOne 1.0 | 4 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 909. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 27 | 46% | 78 |
| shu.nitro.LENIN .T34 | 10 | 17% | 49 |
| lrem.Spectre 0.4.4 | 8 | 14% | 40 |
| js.PinBall 1.6 | 8 | 14% | 19 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 7% | 12 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 2% | 6 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 5 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 152467 melee ticks, 50430 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 32 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 49470 sent, 44731 reached their opponent, 10744 virtual hits (24.0% of those reached).

## Melee bench: F27

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 711 over 6 battles (118.5 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 91.2 | 159 / 210 | 1.79 | 20.3% | 31723 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 20.3% | 159 |
| mk.Alpha 0.2.1 | 2.0 | 14.4% | 30 |
| EH.Eagle 1.0.6 | 3.0 | 11.3% | 5 |
| techdude.kombat.FlamingKombat 1.5 | 4.8 | 9.6% | 3 |
| sheldor.melee.nano.TestMelee 0.1 | 5.8 | 8.9% | 4 |
| joe.ADinosaur 1.0 | 6.7 | 8.2% | 2 |
| wee.Gem 1.8.4 | 6.7 | 8.2% | 4 |
| throxbot.ThroxBot 0.1 | 7.0 | 7.8% | 3 |
| caimano.Furia_Ceca 0.22 | 8.3 | 6.9% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 90.8 | 26 / 35 | 4992 |
| 2 | 1 | 68.5 | 87.3 | 22 / 35 | 4699 |
| 3 | 1 | 70.5 | 87.3 | 25 / 35 | 6050 |
| 4 | 1 | 69.9 | 91.7 | 25 / 35 | 5068 |
| 5 | 1 | 72.1 | 95.9 | 32 / 35 | 5715 |
| 6 | 1 | 71.0 | 94.3 | 29 / 35 | 5199 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 105 | 91% |
| EH.Eagle 1.0.6 | 26 | 100% |
| throxbot.ThroxBot 0.1 | 12 | 83% |
| techdude.kombat.FlamingKombat 1.5 | 11 | 100% |
| wee.Gem 1.8.4 | 6 | 100% |
| joe.ADinosaur 1.0 | 5 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 5 | 80% |

Hadur died in 57 of 210 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 18 | 32% | 102 |
| EH.Eagle 1.0.6 | 8 | 14% | 30 |
| joe.ADinosaur 1.0 | 8 | 14% | 11 |
| throxbot.ThroxBot 0.1 | 6 | 11% | 15 |
| sheldor.melee.nano.TestMelee 0.1 | 3 | 5% | 14 |
| caimano.Furia_Ceca 0.22 | 3 | 5% | 5 |
| cs.Grudge 1.0 | 3 | 5% | 4 |
| wee.Gem 1.8.4 | 1 | 2% | 15 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 2% | 11 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 131427 melee ticks, 44640 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 48 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 43192 sent, 38312 reached their opponent, 8819 virtual hits (23.0% of those reached).

## Melee bench: F28

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 118 over 6 battles (19.7 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 89.9 | 136 / 210 | 1.91 | 18.7% | 24284 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 18.7% | 136 |
| kid.test.NightFox .2 | 2.0 | 14.8% | 30 |
| uji.Antique 1.0 | 3.3 | 11.9% | 22 |
| qohnil.blot.BlotBot 3.61 | 4.2 | 11.0% | 14 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.5% | 3 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.1% | 4 |
| ahr.ice.Ice 1.0.2 | 6.7 | 8.1% | 1 |
| matt.advanced.Katana 1.0 | 8.7 | 6.2% | 0 |
| stelo.Lifestealer 1.0 | 9.0 | 5.3% | 0 |
| stelo.PianistNano 1.2 | 9.2 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 92.7 | 24 / 35 | 4193 |
| 2 | 1 | 67.2 | 87.9 | 19 / 35 | 3856 |
| 3 | 1 | 68.5 | 90.8 | 26 / 35 | 3938 |
| 4 | 1 | 69.1 | 92.4 | 25 / 35 | 4045 |
| 5 | 1 | 67.1 | 85.4 | 19 / 35 | 4041 |
| 6 | 1 | 68.5 | 90.2 | 23 / 35 | 4211 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 75 | 84% |
| uji.Antique 1.0 | 43 | 74% |
| qohnil.blot.BlotBot 3.61 | 23 | 70% |
| pfvicm.Sobieski 7.2.3b | 10 | 90% |
| amk.ChumbaWumba 0.3 | 7 | 86% |
| ahr.ice.Ice 1.0.2 | 6 | 83% |
| matt.advanced.Katana 1.0 | 4 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 739. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 28 | 37% | 62 |
| kid.test.NightFox .2 | 17 | 23% | 47 |
| qohnil.blot.BlotBot 3.61 | 9 | 12% | 34 |
| pfvicm.Sobieski 7.2.3b | 7 | 9% | 21 |
| amk.ChumbaWumba 0.3 | 6 | 8% | 15 |
| ahr.ice.Ice 1.0.2 | 4 | 5% | 10 |
| stelo.PianistNano 1.2 | 2 | 3% | 6 |
| matt.advanced.Katana 1.0 | 1 | 1% | 11 |
| stelo.Lifestealer 1.0 | 1 | 1% | 2 |

Posture (Hadur's M records, 204 rounds): 132185 melee ticks, 36769 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 38 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 44511 sent, 39700 reached their opponent, 5634 virtual hits (14.2% of those reached).

## Melee bench: F29

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 432 over 6 battles (72.0 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 89.5 | 121 / 210 | 1.95 | 19.6% | 28944 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 19.6% | 121 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 14.3% | 38 |
| deewiant.Anomaly 0.2 | 2.5 | 14.4% | 35 |
| myl.micro.Troodon 1.10 | 4.3 | 11.6% | 6 |
| jok.PheonixM 0.1.2 | 4.7 | 11.0% | 6 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.7% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 7.5 | 5.8% | 0 |
| DBall.Anarchy 0.1 | 8.2 | 5.3% | 3 |
| ap.Frederick 1.1 | 8.8 | 4.9% | 0 |
| jangs.ns51 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 92.1 | 25 / 35 | 5257 |
| 2 | 1 | 69.7 | 90.5 | 18 / 35 | 4703 |
| 3 | 1 | 68.8 | 85.7 | 18 / 35 | 4650 |
| 4 | 1 | 69.4 | 89.2 | 17 / 35 | 4576 |
| 5 | 1 | 68.2 | 84.8 | 18 / 35 | 4552 |
| 6 | 1 | 71.5 | 94.6 | 25 / 35 | 5206 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 67 | 67% |
| zyx.mega.YersiniaPestis 3.1 | 55 | 62% |
| myl.micro.Troodon 1.10 | 21 | 86% |
| jok.PheonixM 0.1.2 | 17 | 88% |
| ap.Frederick 1.1 | 4 | 100% |
| ph.melee.ArcherME 0.3 | 4 | 100% |
| DBall.Anarchy 0.1 | 1 | 0% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 1049. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 36 | 38% | 70 |
| deewiant.Anomaly 0.2 | 29 | 31% | 73 |
| myl.micro.Troodon 1.10 | 15 | 16% | 34 |
| jok.PheonixM 0.1.2 | 9 | 10% | 22 |
| DBall.Anarchy 0.1 | 1 | 1% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 2 |
| ph.melee.ArcherME 0.3 | 0 | 0% | 4 |
| jangs.ns51 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 167789 melee ticks, 60711 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 39 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 54418 sent, 49661 reached their opponent, 7657 virtual hits (15.4% of those reached).

## Melee bench: F30

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 430 over 6 battles (71.7 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 77.1 | 54 / 210 | 3.06 | 15.4% | 23345 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.2 | 15.4% | 54 |
| catcat20.Matcha 0.006 | 2.3 | 14.0% | 54 |
| darkcanuck.B26354 1.06 | 2.8 | 13.4% | 46 |
| stelo.PastFuture 2.3.2 | 4.3 | 12.0% | 16 |
| oog.melee.Capulet 1.2 | 4.3 | 12.3% | 22 |
| intruder.PrairieWolf 2.61 | 6.5 | 8.8% | 8 |
| fowl3628800.LightningBolt 2.6.0 | 7.3 | 7.7% | 7 |
| ntc.Opposite 1.5 | 7.8 | 7.4% | 0 |
| tripphippy.Alice 1.1 | 8.3 | 6.6% | 3 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 76.2 | 6 / 35 | 3925 |
| 2 | 1 | 64.7 | 80.6 | 8 / 35 | 4139 |
| 3 | 1 | 65.0 | 80.3 | 11 / 35 | 4185 |
| 4 | 1 | 62.6 | 73.7 | 9 / 35 | 3868 |
| 5 | 1 | 63.8 | 78.7 | 10 / 35 | 3720 |
| 6 | 2 | 62.1 | 73.0 | 10 / 35 | 3508 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 28 | 36% |
| darkcanuck.B26354 1.06 | 26 | 38% |
| oog.melee.Capulet 1.2 | 25 | 64% |
| stelo.PastFuture 2.3.2 | 14 | 71% |
| fowl3628800.LightningBolt 2.6.0 | 6 | 33% |
| intruder.PrairieWolf 2.61 | 5 | 40% |
| tripphippy.Alice 1.1 | 4 | 75% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 41 | 26% | 53 |
| darkcanuck.B26354 1.06 | 38 | 24% | 51 |
| stelo.PastFuture 2.3.2 | 28 | 18% | 38 |
| oog.melee.Capulet 1.2 | 23 | 14% | 35 |
| fowl3628800.LightningBolt 2.6.0 | 10 | 6% | 12 |
| intruder.PrairieWolf 2.61 | 7 | 4% | 7 |
| tripphippy.Alice 1.1 | 6 | 4% | 9 |
| ntc.Opposite 1.5 | 3 | 2% | 5 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 157592 melee ticks, 34774 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 48 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 51140 sent, 46107 reached their opponent, 7727 virtual hits (16.8% of those reached).

## Melee bench: F31

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 209 over 6 battles (34.8 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 81.0 | 63 / 210 | 2.71 | 16.0% | 21859 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.2 | 17.8% | 81 |
| hadur117.Hadur 3.19ms | 1.8 | 16.0% | 63 |
| gh.mini.Griezel 0.2 | 3.0 | 13.6% | 53 |
| d414.nano.Quantum 1.0.0 | 4.5 | 10.9% | 6 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 10.5% | 4 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.2% | 3 |
| timmit.nano.TimDog 0.33 | 7.0 | 6.7% | 1 |
| fm.mammillarias 1.3 | 8.5 | 5.3% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.7 | 5.3% | 1 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 78.7 | 12 / 35 | 3827 |
| 2 | 2 | 64.9 | 81.3 | 9 / 35 | 3637 |
| 3 | 2 | 65.3 | 85.1 | 10 / 35 | 3639 |
| 4 | 1 | 67.1 | 85.4 | 13 / 35 | 4220 |
| 5 | 2 | 63.5 | 77.5 | 11 / 35 | 3285 |
| 6 | 2 | 63.5 | 77.8 | 8 / 35 | 3251 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 58 | 41% |
| gh.mini.Griezel 0.2 | 39 | 41% |
| spinnercat.micro.Tyger 0.1 | 12 | 92% |
| d414.nano.Quantum 1.0.0 | 12 | 83% |
| timmit.nano.TimDog 0.33 | 1 | 100% |
| gh.nano.Grofvuil 0.2 | 1 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 68 | 46% | 93 |
| gh.mini.Griezel 0.2 | 43 | 29% | 62 |
| d414.nano.Quantum 1.0.0 | 13 | 9% | 22 |
| spinnercat.micro.Tyger 0.1 | 8 | 5% | 12 |
| gh.nano.Grofvuil 0.2 | 6 | 4% | 7 |
| timmit.nano.TimDog 0.33 | 5 | 3% | 8 |
| fm.mammillarias 1.3 | 3 | 2% | 3 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 159340 melee ticks, 37449 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 40 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 51063 sent, 45990 reached their opponent, 7350 virtual hits (16.0% of those reached).

## Melee bench: F32

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 307 over 6 battles (51.2 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 89.5 | 123 / 210 | 1.94 | 18.7% | 27921 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 18.7% | 123 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.5% | 55 |
| apc.botM 3.0 | 3.3 | 11.5% | 9 |
| lxx.ConceptA 0.8 | 4.2 | 10.4% | 3 |
| vjik.UnViolation 1.1 | 5.0 | 9.8% | 7 |
| bayen.UbaMicro 1.4 | 5.8 | 8.5% | 4 |
| panzer.Panzer 0.2 | 7.2 | 7.7% | 2 |
| yk.JahMicro 1.0 | 8.2 | 6.8% | 5 |
| conscience.Electron 1.3g | 8.5 | 6.5% | 0 |
| donjezza.Jezza 1.0 | 9.8 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 86.0 | 19 / 35 | 4373 |
| 2 | 1 | 68.4 | 91.4 | 19 / 35 | 4667 |
| 3 | 1 | 68.3 | 88.6 | 22 / 35 | 4868 |
| 4 | 1 | 66.3 | 85.4 | 17 / 35 | 4301 |
| 5 | 1 | 68.8 | 92.1 | 22 / 35 | 4684 |
| 6 | 1 | 69.7 | 93.7 | 24 / 35 | 5028 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 81 | 56% |
| apc.botM 3.0 | 28 | 93% |
| lxx.ConceptA 0.8 | 18 | 100% |
| vjik.UnViolation 1.1 | 15 | 73% |
| donjezza.Jezza 1.0 | 10 | 100% |
| yk.JahMicro 1.0 | 9 | 67% |
| bayen.UbaMicro 1.4 | 6 | 83% |
| panzer.Panzer 0.2 | 2 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 46 | 51% | 86 |
| lxx.ConceptA 0.8 | 12 | 13% | 24 |
| bayen.UbaMicro 1.4 | 7 | 8% | 16 |
| panzer.Panzer 0.2 | 7 | 8% | 9 |
| apc.botM 3.0 | 6 | 7% | 36 |
| vjik.UnViolation 1.1 | 6 | 7% | 23 |
| yk.JahMicro 1.0 | 3 | 3% | 8 |
| donjezza.Jezza 1.0 | 1 | 1% | 4 |
| conscience.Electron 1.3g | 1 | 1% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 124002 melee ticks, 55194 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 71 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 42235 sent, 37337 reached their opponent, 6736 virtual hits (18.0% of those reached).

## Melee bench: F33

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 583 over 6 battles (97.2 per battle, most in one battle 149). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 86.3 | 114 / 210 | 2.23 | 18.7% | 28782 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 18.7% | 114 |
| maribo.Quester 0.3 | 2.0 | 15.3% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.9% | 22 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 11.3% | 18 |
| labg.Cataclysm 2.05 | 4.8 | 10.7% | 10 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.3 | 8.4% | 5 |
| baal.nano.N 1.42 | 6.3 | 9.0% | 2 |
| zyx.micro.Ant 1.1 | 8.3 | 5.2% | 1 |
| sanja.First 0.1 | 8.8 | 5.1% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 84.1 | 15 / 35 | 4627 |
| 2 | 1 | 68.4 | 85.1 | 20 / 35 | 4629 |
| 3 | 1 | 70.2 | 89.8 | 21 / 35 | 5261 |
| 4 | 1 | 68.2 | 84.1 | 19 / 35 | 4556 |
| 5 | 1 | 70.0 | 89.8 | 23 / 35 | 5062 |
| 6 | 1 | 68.0 | 84.8 | 16 / 35 | 4647 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 48 | 79% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 38 | 76% |
| gre.svman4.Leonidas 1.3.2 | 29 | 83% |
| labg.Cataclysm 2.05 | 10 | 80% |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 88% |
| baal.nano.N 1.42 | 5 | 80% |
| zyx.micro.Ant 1.1 | 3 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 985. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 30 | 30% | 72 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 21% | 43 |
| gre.svman4.Leonidas 1.3.2 | 20 | 20% | 40 |
| baal.nano.N 1.42 | 9 | 9% | 15 |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 8% | 12 |
| labg.Cataclysm 2.05 | 5 | 5% | 22 |
| zyx.micro.Ant 1.1 | 2 | 2% | 4 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |
| sanja.First 0.1 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 169407 melee ticks, 50181 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 49 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 54974 sent, 50180 reached their opponent, 7393 virtual hits (14.7% of those reached).

## Melee bench: F34

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 739 over 6 battles (123.2 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 88.0 | 93 / 210 | 2.08 | 18.5% | 30649 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 18.5% | 93 |
| stelo.Spread 0.9 | 2.5 | 16.0% | 56 |
| kid.Gladiator .7.2 | 2.5 | 15.8% | 41 |
| jcs.Seth 1.8 | 4.7 | 11.1% | 15 |
| tcf.Reach 3 | 4.8 | 11.0% | 5 |
| cli.Dancer 1.1 | 5.5 | 9.3% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.4% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.7% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.3% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 91.1 | 17 / 35 | 5066 |
| 2 | 1 | 69.1 | 89.5 | 14 / 35 | 4943 |
| 3 | 1 | 68.2 | 84.8 | 14 / 35 | 5164 |
| 4 | 1 | 69.7 | 89.2 | 16 / 35 | 5228 |
| 5 | 1 | 69.1 | 87.6 | 18 / 35 | 5074 |
| 6 | 1 | 68.7 | 85.7 | 14 / 35 | 5174 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 69 | 54% |
| kid.Gladiator .7.2 | 46 | 59% |
| jcs.Seth 1.8 | 27 | 70% |
| tcf.Reach 3 | 9 | 56% |
| ratosh.Wesco 1.4 | 2 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |
| cli.Dancer 1.1 | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 1080. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 49 | 40% | 84 |
| kid.Gladiator .7.2 | 47 | 38% | 71 |
| jcs.Seth 1.8 | 10 | 8% | 32 |
| tcf.Reach 3 | 6 | 5% | 13 |
| cli.Dancer 1.1 | 2 | 2% | 4 |
| ratosh.Wesco 1.4 | 2 | 2% | 3 |
| sample.VelociRobot 1.0 | 1 | 1% | 2 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 166544 melee ticks, 71162 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 56 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 52682 sent, 47642 reached their opponent, 7928 virtual hits (16.6% of those reached).

## Melee bench: F35

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 720 over 6 battles (120.0 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 84.7 | 55 / 210 | 2.38 | 16.7% | 23689 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 18.8% | 127 |
| hadur117.Hadur 3.19ms | 2.0 | 16.7% | 55 |
| gh.mini.Gruwel 0.9 | 3.0 | 13.4% | 24 |
| rz.HawkOnFire 0.1 | 4.5 | 11.4% | 1 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.5 | 11.1% | 4 |
| wit.Chuliath 1.0 | 6.3 | 6.7% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.3 | 6.3% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.3 | 6.1% | 0 |
| dans.Cinnamon 1.2 | 9.5 | 4.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.7 | 87.6 | 9 / 35 | 3825 |
| 2 | 2 | 64.6 | 81.0 | 8 / 35 | 3920 |
| 3 | 2 | 66.6 | 87.6 | 11 / 35 | 3981 |
| 4 | 2 | 66.5 | 84.8 | 10 / 35 | 4071 |
| 5 | 2 | 66.3 | 86.3 | 8 / 35 | 3843 |
| 6 | 2 | 65.6 | 80.6 | 9 / 35 | 4049 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 96 | 22% |
| gh.mini.Gruwel 0.9 | 30 | 53% |
| dmh.robocode.robot.BlackDeath 9.2 | 12 | 92% |
| rz.HawkOnFire 0.1 | 8 | 88% |

Hadur died in 162 of 210 rounds, at a mean tick of 1019. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 93 | 57% | 114 |
| gh.mini.Gruwel 0.9 | 28 | 17% | 41 |
| dmh.robocode.robot.BlackDeath 9.2 | 14 | 9% | 25 |
| rz.HawkOnFire 0.1 | 11 | 7% | 16 |
| stelo.MyAgileRobot 0.2 | 4 | 2% | 5 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 2 |
| wit.Chuliath 1.0 | 1 | 1% | 3 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 2 |
| dans.Cinnamon 1.2 | 1 | 1% | 2 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 151913 melee ticks, 61762 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 32 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 46599 sent, 41731 reached their opponent, 6467 virtual hits (15.5% of those reached).

## Melee bench: F36

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 358 over 6 battles (59.7 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 93.3 | 157 / 210 | 1.60 | 20.9% | 32798 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 20.9% | 157 |
| bzdp.Pansy 2.1 | 2.3 | 12.4% | 16 |
| alpha.RainingFire 1.0 | 2.8 | 12.6% | 14 |
| bvh.micro.Freya 0.3 | 4.7 | 10.8% | 13 |
| mz.Cork 0.1 | 4.7 | 10.9% | 5 |
| m3thos.Eva02 0.7.1 | 6.2 | 9.4% | 4 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.0% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 5.4% | 0 |
| dl.BetterWalls 1.0 | 8.8 | 4.9% | 0 |
| sample.MyFirstRobot 1.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 93.3 | 25 / 35 | 5311 |
| 2 | 1 | 72.4 | 96.8 | 30 / 35 | 5707 |
| 3 | 1 | 71.3 | 94.0 | 25 / 35 | 5467 |
| 4 | 1 | 72.2 | 95.9 | 28 / 35 | 5767 |
| 5 | 1 | 70.6 | 91.1 | 25 / 35 | 5367 |
| 6 | 1 | 69.9 | 88.9 | 24 / 35 | 5179 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 46 | 87% |
| alpha.RainingFire 1.0 | 38 | 79% |
| mz.Cork 0.1 | 34 | 91% |
| bvh.micro.Freya 0.3 | 27 | 85% |
| m3thos.Eva02 0.7.1 | 17 | 94% |
| bvh.mini.Fenrir 0.39 | 15 | 100% |
| sample.MyFirstRobot 1.0 | 2 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 878. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 17 | 31% | 46 |
| bzdp.Pansy 2.1 | 14 | 25% | 51 |
| bvh.micro.Freya 0.3 | 8 | 15% | 31 |
| mz.Cork 0.1 | 5 | 9% | 31 |
| m3thos.Eva02 0.7.1 | 4 | 7% | 23 |
| bvh.mini.Fenrir 0.39 | 3 | 5% | 16 |
| squidM.TentalceMeleeNano 1.1 | 2 | 4% | 6 |
| dl.BetterWalls 1.0 | 0 | 0% | 4 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 146540 melee ticks, 46274 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 42 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 49532 sent, 44844 reached their opponent, 9132 virtual hits (20.4% of those reached).

## Melee bench: F37

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 149 over 6 battles (24.8 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 90.4 | 162 / 210 | 1.87 | 19.9% | 35219 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 19.9% | 162 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.7 | 10.7% | 8 |
| EBBU.Sim2 1.02 | 3.5 | 9.9% | 4 |
| germ.TheMind .2 | 4.0 | 9.7% | 8 |
| agrach.Dalek 1.0 | 5.5 | 9.0% | 8 |
| stelo.UntouchableNano 1.3 | 6.3 | 8.6% | 10 |
| mb.Beast 0.1 | 7.3 | 8.5% | 5 |
| lmk.ACPFinal 0.1 | 7.5 | 8.1% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 8.0 | 8.2% | 2 |
| skm.Ryubot 1.0 | 9.2 | 7.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 85.4 | 21 / 35 | 5609 |
| 2 | 1 | 68.1 | 87.0 | 24 / 35 | 5771 |
| 3 | 1 | 69.6 | 90.2 | 29 / 35 | 6118 |
| 4 | 1 | 71.2 | 95.6 | 29 / 35 | 6458 |
| 5 | 1 | 70.9 | 97.5 | 32 / 35 | 5910 |
| 6 | 1 | 67.8 | 86.7 | 27 / 35 | 5353 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 27 | 96% |
| stelo.UntouchableNano 1.3 | 25 | 76% |
| mb.Beast 0.1 | 25 | 96% |
| agrach.Dalek 1.0 | 24 | 100% |
| skm.Ryubot 1.0 | 21 | 100% |
| EBBU.Sim2 1.02 | 20 | 100% |
| germ.TheMind .2 | 18 | 89% |
| lmk.ACPFinal 0.1 | 11 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 463. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 14 | 29% | 19 |
| stelo.UntouchableNano 1.3 | 10 | 21% | 28 |
| com.syncleus.robocode.Dreadnaught 0.1 | 7 | 15% | 35 |
| agrach.Dalek 1.0 | 4 | 8% | 39 |
| mb.Beast 0.1 | 4 | 8% | 22 |
| lmk.ACPFinal 0.1 | 3 | 6% | 25 |
| germ.TheMind .2 | 3 | 6% | 12 |
| EBBU.Sim2 1.02 | 2 | 4% | 21 |
| skm.Ryubot 1.0 | 1 | 2% | 6 |

Posture (Hadur's M records, 199 rounds): 96129 melee ticks, 25616 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 331 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 246 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 32474 sent, 27989 reached their opponent, 8323 virtual hits (29.7% of those reached).

## Melee bench: F38

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 554 over 6 battles (92.3 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.9 | 116 / 210 | 2.00 | 18.6% | 27814 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 18.6% | 116 |
| justin.Mallais 14.0 | 2.0 | 15.7% | 54 |
| bvh.mini.Freya 0.55 | 3.0 | 13.1% | 13 |
| bts.mega.Gnarly 1.4 | 4.5 | 10.7% | 17 |
| cs.Wren 1.0 | 4.8 | 10.1% | 2 |
| kdf.KoulDestroyer 1.0 | 5.7 | 9.7% | 4 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.2 | 8.3% | 0 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.8 | 6.4% | 5 |
| matt.UnderDark3 2.4.34 | 9.2 | 3.9% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 90.8 | 19 / 35 | 4589 |
| 2 | 1 | 68.9 | 88.9 | 20 / 35 | 4816 |
| 3 | 1 | 69.6 | 90.8 | 20 / 35 | 5005 |
| 4 | 1 | 69.2 | 88.9 | 21 / 35 | 4834 |
| 5 | 1 | 66.6 | 86.7 | 16 / 35 | 4000 |
| 6 | 1 | 68.3 | 87.3 | 20 / 35 | 4570 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 71 | 61% |
| bvh.mini.Freya 0.55 | 29 | 90% |
| bts.mega.Gnarly 1.4 | 19 | 79% |
| kdf.KoulDestroyer 1.0 | 16 | 88% |
| cs.Wren 1.0 | 10 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 7 | 57% |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 45 | 45% | 86 |
| bts.mega.Gnarly 1.4 | 15 | 15% | 34 |
| bvh.mini.Freya 0.55 | 14 | 14% | 34 |
| kdf.KoulDestroyer 1.0 | 9 | 9% | 14 |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 4% | 6 |
| cs.Wren 1.0 | 3 | 3% | 22 |
| davidalves.net.DuelistNanoMelee 1.01 | 2 | 2% | 10 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 3 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 142843 melee ticks, 43388 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 42 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 46240 sent, 41218 reached their opponent, 8716 virtual hits (21.1% of those reached).

## Melee bench: F39

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 553 over 6 battles (92.2 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 89.8 | 108 / 210 | 1.91 | 19.1% | 31364 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 19.1% | 108 |
| bvh.fry.Freya 0.82 | 2.0 | 14.4% | 21 |
| az.Ololobot 0.2.4 | 3.2 | 12.7% | 49 |
| catcat20.Lambda 0.024 | 3.8 | 11.5% | 24 |
| gimp.GimpBot 0.1 | 5.5 | 8.5% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 6.2 | 7.9% | 6 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.3% | 1 |
| apollokidd.ApolloKidd 0.9 | 8.2 | 6.9% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.8% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 88.9 | 19 / 35 | 4990 |
| 2 | 1 | 68.6 | 91.4 | 15 / 35 | 5135 |
| 3 | 1 | 70.6 | 93.0 | 25 / 35 | 5458 |
| 4 | 1 | 68.8 | 89.2 | 16 / 35 | 5453 |
| 5 | 1 | 67.3 | 85.7 | 15 / 35 | 5033 |
| 6 | 1 | 69.1 | 90.8 | 18 / 35 | 5295 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 59 | 47% |
| bvh.fry.Freya 0.82 | 56 | 75% |
| catcat20.Lambda 0.024 | 31 | 52% |
| gimp.GimpBot 0.1 | 10 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 7 | 86% |
| winamp32.micro.MicroMacro 1.0 | 3 | 100% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 1128. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 37 | 34% | 67 |
| bvh.fry.Freya 0.82 | 31 | 28% | 59 |
| catcat20.Lambda 0.024 | 27 | 25% | 42 |
| winamp32.micro.MicroMacro 1.0 | 4 | 4% | 12 |
| stelo.SoRobotNanoMelee 1.2 | 3 | 3% | 9 |
| gimp.GimpBot 0.1 | 2 | 2% | 14 |
| apollokidd.ApolloKidd 0.9 | 1 | 1% | 4 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 170492 melee ticks, 63571 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 86 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 86 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 1.

Targeting waves (208 rounds): 53695 sent, 48661 reached their opponent, 8514 virtual hits (17.5% of those reached).

## Melee bench: F40

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 493 over 6 battles (82.2 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 87.4 | 122 / 210 | 2.14 | 19.0% | 29668 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 19.0% | 122 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.2% | 39 |
| kano.gamma.KanoGamma 1.8 | 3.5 | 11.9% | 17 |
| mz.AntiGrav 1.0 | 3.8 | 11.5% | 8 |
| Polkwane.SmashMelee 1.0 | 5.2 | 10.4% | 9 |
| alpha.BlackIce 1.0 | 6.0 | 9.5% | 2 |
| stelo.Randomness 1.0 | 6.5 | 9.3% | 11 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.0% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 4.1% | 0 |
| sample.Corners 1.0 | 10.0 | 3.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 87.0 | 21 / 35 | 4700 |
| 2 | 1 | 69.3 | 87.6 | 22 / 35 | 4939 |
| 3 | 1 | 70.1 | 89.8 | 21 / 35 | 5426 |
| 4 | 1 | 70.1 | 90.8 | 24 / 35 | 4863 |
| 5 | 1 | 68.2 | 83.2 | 18 / 35 | 5084 |
| 6 | 1 | 68.3 | 85.7 | 16 / 35 | 4656 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 70 | 81% |
| kano.gamma.KanoGamma 1.8 | 29 | 72% |
| mz.AntiGrav 1.0 | 21 | 100% |
| Polkwane.SmashMelee 1.0 | 17 | 88% |
| stelo.Randomness 1.0 | 11 | 55% |
| alpha.BlackIce 1.0 | 2 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 832. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 27 | 29% | 62 |
| kano.gamma.KanoGamma 1.8 | 18 | 20% | 47 |
| stelo.Randomness 1.0 | 13 | 14% | 25 |
| Polkwane.SmashMelee 1.0 | 12 | 13% | 27 |
| mz.AntiGrav 1.0 | 8 | 9% | 28 |
| alpha.BlackIce 1.0 | 7 | 8% | 13 |
| amk.superstrike.SuperStrike 0.3 | 3 | 3% | 5 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 2 |
| sample.Corners 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 150907 melee ticks, 45548 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 90 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 90 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 49675 sent, 44666 reached their opponent, 9206 virtual hits (20.6% of those reached).

## Melee bench: F41

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 392 over 6 battles (65.3 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.9 | 108 / 210 | 2.00 | 18.3% | 26008 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 18.3% | 108 |
| eem.EvBotNG v12.8 | 2.0 | 16.0% | 74 |
| ary.Swarm 1.1 | 3.5 | 13.2% | 6 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 12.9% | 15 |
| simonton.nano.MeleeSeed 1.8 | 5.3 | 10.4% | 7 |
| shrub.Silver v048 | 5.7 | 9.2% | 1 |
| zyx.nano.Ant 1.1 | 7.0 | 7.4% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 5.1% | 1 |
| stelo.Mirror 1.1 | 8.7 | 5.1% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 87.9 | 16 / 35 | 4038 |
| 2 | 1 | 69.1 | 87.9 | 19 / 35 | 4744 |
| 3 | 1 | 68.7 | 89.2 | 18 / 35 | 4516 |
| 4 | 1 | 69.0 | 89.5 | 20 / 35 | 4414 |
| 5 | 1 | 68.5 | 89.5 | 17 / 35 | 4256 |
| 6 | 1 | 68.5 | 89.5 | 18 / 35 | 4040 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 79 | 46% |
| lessonz.robocode.Oz 0.5.0 | 37 | 84% |
| ary.Swarm 1.1 | 31 | 90% |
| simonton.nano.MeleeSeed 1.8 | 14 | 79% |
| shrub.Silver v048 | 2 | 50% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 980. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 54 | 51% | 88 |
| lessonz.robocode.Oz 0.5.0 | 19 | 18% | 40 |
| simonton.nano.MeleeSeed 1.8 | 13 | 12% | 27 |
| ary.Swarm 1.1 | 7 | 7% | 27 |
| shrub.Silver v048 | 4 | 4% | 11 |
| zyx.nano.Ant 1.1 | 3 | 3% | 4 |
| stelo.Mirror 1.1 | 2 | 2% | 7 |
| jsal.Jsalbot 1.0 | 0 | 0% | 3 |
| acogdev.alpha 0.2 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 153149 melee ticks, 51628 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 71 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 50475 sent, 45385 reached their opponent, 6894 virtual hits (15.2% of those reached).

## Melee bench: F42

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 123 over 6 battles (20.5 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 92.1 | 148 / 210 | 1.71 | 20.3% | 33840 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 20.3% | 148 |
| wompi.Wallaby 5.1 | 2.0 | 15.4% | 35 |
| maribo.mini.MiniQuester 0.1 | 3.2 | 12.9% | 10 |
| ara.Shera 0.88 | 3.8 | 11.8% | 14 |
| amz.NanoClone 1.41 | 5.0 | 9.3% | 0 |
| dsw.StaticD 1.0 | 6.2 | 7.3% | 3 |
| maribo.IotaCT 1.1 | 7.7 | 6.7% | 0 |
| stelo.MirrorMicro 1.0 | 8.2 | 5.7% | 0 |
| mme.NikeEnhanced 2.0 | 8.3 | 5.8% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 89.8 | 24 / 35 | 6017 |
| 2 | 1 | 70.5 | 93.0 | 22 / 35 | 5483 |
| 3 | 1 | 70.0 | 89.8 | 23 / 35 | 5702 |
| 4 | 1 | 70.1 | 91.1 | 25 / 35 | 5225 |
| 5 | 1 | 71.7 | 95.2 | 28 / 35 | 5903 |
| 6 | 1 | 70.6 | 93.7 | 26 / 35 | 5510 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 98 | 89% |
| maribo.mini.MiniQuester 0.1 | 38 | 82% |
| ara.Shera 0.88 | 25 | 80% |
| dsw.StaticD 1.0 | 5 | 80% |
| stelo.MirrorMicro 1.0 | 3 | 100% |
| amz.NanoClone 1.41 | 2 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 964. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 23 | 37% | 98 |
| ara.Shera 0.88 | 16 | 26% | 39 |
| maribo.mini.MiniQuester 0.1 | 15 | 24% | 45 |
| dsw.StaticD 1.0 | 3 | 5% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 3% | 3 |
| amz.NanoClone 1.41 | 1 | 2% | 10 |
| mme.NikeEnhanced 2.0 | 1 | 2% | 3 |
| maribo.IotaCT 1.1 | 1 | 2% | 2 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 200 rounds): 159077 melee ticks, 49513 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 34 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 50937 sent, 46273 reached their opponent, 9093 virtual hits (19.7% of those reached).

## Melee bench: F43

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 379 over 6 battles (63.2 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 79.7 | 39 / 210 | 2.83 | 15.8% | 24011 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.7% | 142 |
| hadur117.Hadur 3.19ms | 2.0 | 15.8% | 39 |
| dummy.micro.Sparrow 2.5 | 3.5 | 12.2% | 3 |
| brainfade.melee.Dusk 0.44 | 3.7 | 12.4% | 23 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 10.7% | 3 |
| Krabb.akim2.Akim2 1.1b | 6.3 | 9.2% | 3 |
| mz.NanoGod 2.02 | 6.8 | 7.8% | 0 |
| jab.DiamondStealer 5 | 7.8 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.5% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.0 | 79.7 | 5 / 35 | 4143 |
| 2 | 2 | 65.8 | 79.4 | 5 / 35 | 4037 |
| 3 | 2 | 66.7 | 82.5 | 9 / 35 | 4157 |
| 4 | 2 | 67.3 | 83.2 | 11 / 35 | 4190 |
| 5 | 2 | 64.8 | 75.9 | 8 / 35 | 3605 |
| 6 | 2 | 64.6 | 77.5 | 1 / 35 | 3879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 78 | 22% |
| brainfade.melee.Dusk 0.44 | 21 | 38% |
| dummy.micro.Sparrow 2.5 | 12 | 92% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 100% |
| Krabb.akim2.Akim2 1.1b | 2 | 50% |

Hadur died in 177 of 210 rounds, at a mean tick of 994. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 101 | 57% | 119 |
| brainfade.melee.Dusk 0.44 | 29 | 16% | 38 |
| wcsv.melee.EngineerMelee 0.1 | 16 | 9% | 18 |
| dummy.micro.Sparrow 2.5 | 11 | 6% | 20 |
| Krabb.akim2.Akim2 1.1b | 8 | 5% | 8 |
| jab.DiamondStealer 5 | 4 | 2% | 4 |
| mz.NanoGod 2.02 | 3 | 2% | 3 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 155903 melee ticks, 53773 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 41 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 50139 sent, 44959 reached their opponent, 7523 virtual hits (16.7% of those reached).

## Melee bench: F44

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 539 over 6 battles (89.8 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 92.9 | 143 / 210 | 1.64 | 20.9% | 34682 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 20.9% | 143 |
| stelo.Liblix 0.3.1 | 2.2 | 15.4% | 40 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.1% | 21 |
| jwirde.Gort 2.0 | 4.3 | 9.5% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.8 | 9.0% | 1 |
| disan.Chair 2.2.0 | 6.2 | 7.9% | 0 |
| stf.PanzerGeneral 0.1 | 7.2 | 7.0% | 0 |
| wompi.Quokka 1.6 | 7.5 | 7.0% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 4.8% | 0 |
| sample.Crazy 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 93.7 | 23 / 35 | 5657 |
| 2 | 1 | 72.3 | 95.2 | 27 / 35 | 5853 |
| 3 | 1 | 70.4 | 89.5 | 18 / 35 | 5824 |
| 4 | 1 | 70.7 | 91.1 | 24 / 35 | 5517 |
| 5 | 1 | 73.1 | 97.1 | 29 / 35 | 6362 |
| 6 | 1 | 70.4 | 90.8 | 22 / 35 | 5469 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 78 | 72% |
| tzu.TheArtOfWar 1.2 | 64 | 84% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 12 | 92% |
| jwirde.Gort 2.0 | 11 | 91% |
| disan.Chair 2.2.0 | 6 | 100% |
| stf.PanzerGeneral 0.1 | 4 | 100% |
| wompi.Quokka 1.6 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 946. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 33 | 46% | 90 |
| tzu.TheArtOfWar 1.2 | 23 | 32% | 72 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 7% | 17 |
| jwirde.Gort 2.0 | 4 | 6% | 16 |
| disan.Chair 2.2.0 | 1 | 1% | 7 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 3 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 3 |
| wompi.Quokka 1.6 | 0 | 0% | 1 |
| sample.Crazy 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 157142 melee ticks, 50587 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 33 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 53301 sent, 48515 reached their opponent, 10065 virtual hits (20.7% of those reached).

## Melee bench: F45

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 558 over 6 battles (93.0 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 90.3 | 107 / 210 | 1.88 | 19.9% | 32372 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19ms | 1.0 | 19.9% | 107 |
| eem.IWillFireNoBullet v2.8 | 2.5 | 11.9% | 77 |
| jje.BagPuss 1.2 | 2.8 | 11.8% | 8 |
| myl.nano.Graviton 1.10 | 3.8 | 11.2% | 3 |
| sul.Lunar 1.1 | 4.8 | 10.0% | 7 |
| fm.claire 1.7 | 6.5 | 8.7% | 1 |
| hvilela.HVilela 0.9 | 6.8 | 8.7% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.7 | 7.7% | 3 |
| wit.Deep7 2.0 | 9.2 | 5.9% | 5 |
| abud.ThirdRobo 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 90.5 | 21 / 35 | 5470 |
| 2 | 1 | 71.0 | 94.3 | 21 / 35 | 5680 |
| 3 | 1 | 69.1 | 87.9 | 13 / 35 | 5701 |
| 4 | 1 | 68.0 | 87.6 | 15 / 35 | 4783 |
| 5 | 1 | 69.9 | 92.1 | 18 / 35 | 5403 |
| 6 | 1 | 69.7 | 89.2 | 19 / 35 | 5335 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 86 | 43% |
| sul.Lunar 1.1 | 23 | 83% |
| jje.BagPuss 1.2 | 21 | 67% |
| myl.nano.Graviton 1.10 | 19 | 89% |
| wit.Deep7 2.0 | 9 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 6 | 83% |
| hvilela.HVilela 0.9 | 4 | 100% |
| fm.claire 1.7 | 3 | 67% |

Hadur died in 109 of 210 rounds, at a mean tick of 1600. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 51 | 47% | 0 |
| jje.BagPuss 1.2 | 22 | 20% | 67 |
| sul.Lunar 1.1 | 10 | 9% | 43 |
| hvilela.HVilela 0.9 | 7 | 6% | 19 |
| myl.nano.Graviton 1.10 | 5 | 5% | 37 |
| pez.mini.ChironexFleckeri 0.5 | 4 | 4% | 21 |
| wit.Deep7 2.0 | 3 | 3% | 8 |
| fm.claire 1.7 | 2 | 2% | 8 |
| abud.ThirdRobo 1.0 | 0 | 0% | 4 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 192385 melee ticks, 109941 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 42 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 59969 sent, 55141 reached their opponent, 8038 virtual hits (14.6% of those reached).

## Melee bench: F46

hadur117.Hadur 3.19ms against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 489 over 6 battles (81.5 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 83.5 | 62 / 210 | 2.48 | 16.5% | 25471 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.7 | 16.9% | 60 |
| hadur117.Hadur 3.19ms | 2.0 | 16.5% | 62 |
| rsalesc.melee.Medina 0.4.5 | 2.3 | 16.6% | 78 |
| mz.MicroSheep 1.0 | 4.7 | 10.1% | 2 |
| cx.Princess 1.0 | 4.8 | 10.0% | 7 |
| sadoner.killer 0.2 | 5.5 | 9.2% | 0 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.1% | 0 |
| kurios.DOSexe .9a | 8.3 | 5.4% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.5 | 5.5% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.1 | 84.1 | 9 / 35 | 4334 |
| 2 | 1 | 68.0 | 87.3 | 13 / 35 | 4621 |
| 3 | 2 | 65.8 | 84.8 | 10 / 35 | 3972 |
| 4 | 2 | 65.3 | 81.9 | 10 / 35 | 4181 |
| 5 | 2 | 65.8 | 84.8 | 9 / 35 | 4016 |
| 6 | 3 | 65.2 | 78.4 | 11 / 35 | 4347 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 65 | 57% |
| rsalesc.melee.Medina 0.4.5 | 42 | 31% |
| cx.Princess 1.0 | 9 | 56% |
| mz.MicroSheep 1.0 | 7 | 86% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 932. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 61 | 40% | 97 |
| rsalesc.melee.Medina 0.4.5 | 50 | 33% | 66 |
| cx.Princess 1.0 | 12 | 8% | 16 |
| sadoner.killer 0.2 | 10 | 7% | 11 |
| mz.MicroSheep 1.0 | 9 | 6% | 12 |
| arthord.NanoSatanMelee Beta | 5 | 3% | 5 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 1 |
| kurios.DOSexe .9a | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 156373 melee ticks, 43197 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 78 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 78 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 46060 sent, 41040 reached their opponent, 6079 virtual hits (14.8% of those reached).

