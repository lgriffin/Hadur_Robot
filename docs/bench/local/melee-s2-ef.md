# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 315 over 6 battles (52.5 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 85.9 | 46 / 210 | 2.27 | 16.7% | 27907 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.5% | 133 |
| hadur2.Hadur 3.17.1ef | 2.0 | 16.7% | 46 |
| sgp.JollyNinja 3.53 | 3.5 | 11.5% | 19 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 11.2% | 2 |
| mz.MicroGodMelee 1 | 5.0 | 10.5% | 6 |
| lorneswork.Predator 1.0 | 5.2 | 10.1% | 5 |
| adt.Ar2 1.0 | 7.0 | 7.5% | 0 |
| skm.butterfly 1.0 | 8.5 | 5.0% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.5 | 5.1% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 83.2 | 7 / 35 | 4816 |
| 2 | 2 | 66.5 | 87.9 | 9 / 35 | 4470 |
| 3 | 2 | 66.2 | 84.8 | 7 / 35 | 4838 |
| 4 | 2 | 65.9 | 85.4 | 6 / 35 | 4607 |
| 5 | 2 | 67.0 | 87.3 | 9 / 35 | 4654 |
| 6 | 2 | 66.8 | 87.0 | 8 / 35 | 4522 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 118 | 11% |
| sgp.JollyNinja 3.53 | 16 | 69% |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 85% |
| mz.MicroGodMelee 1 | 9 | 56% |
| lorneswork.Predator 1.0 | 7 | 86% |

Hadur died in 168 of 210 rounds, at a mean tick of 1167. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 115 | 68% | 130 |
| sgp.JollyNinja 3.53 | 18 | 11% | 26 |
| lorneswork.Predator 1.0 | 12 | 7% | 17 |
| mz.MicroGodMelee 1 | 9 | 5% | 15 |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 4% | 17 |
| adt.Ar2 1.0 | 4 | 2% | 4 |
| skm.butterfly 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 144635 melee ticks, 86601 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 60 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 60 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 47365 sent, 42991 reached their opponent, 9345 virtual hits (21.7% of those reached).

## Melee bench: F02

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 232 over 6 battles (38.7 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 82.8 | 77 / 210 | 2.55 | 17.0% | 25502 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.2 | 17.0% | 77 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.2 | 14.4% | 39 |
| pulsar.PulsarMax 0.8.9 | 2.7 | 14.0% | 47 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.3% | 0 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 9.5% | 10 |
| Noran.BitchingElk 0.054 | 6.8 | 8.8% | 25 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 8.2% | 2 |
| sch.Simone 0.3d | 7.2 | 8.2% | 10 |
| stelo.PatternRobot 1.0 | 9.0 | 5.1% | 0 |
| fullsail.SweetTea 1.1 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 83.8 | 13 / 35 | 4172 |
| 2 | 2 | 62.3 | 73.7 | 8 / 35 | 3822 |
| 3 | 1 | 65.8 | 82.2 | 12 / 35 | 4200 |
| 4 | 1 | 66.1 | 83.8 | 14 / 35 | 4168 |
| 5 | 1 | 68.6 | 89.8 | 17 / 35 | 4754 |
| 6 | 1 | 66.5 | 83.2 | 13 / 35 | 4386 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 45 | 53% |
| pulsar.PulsarMax 0.8.9 | 44 | 50% |
| Noran.BitchingElk 0.054 | 17 | 24% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 100% |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 50% |
| sch.Simone 0.3d | 10 | 70% |
| stelo.PatternRobot 1.0 | 2 | 100% |
| fnc.bandit.Bandit 5.2.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 1014. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 41 | 31% | 61 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 30 | 22% | 60 |
| Noran.BitchingElk 0.054 | 19 | 14% | 20 |
| com.cohesiva.robocode.ManOwaR 1.0 | 12 | 9% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 8% | 19 |
| sch.Simone 0.3d | 7 | 5% | 11 |
| fnc.bandit.Bandit 5.2.0 | 7 | 5% | 9 |
| stelo.PatternRobot 1.0 | 4 | 3% | 5 |
| fullsail.SweetTea 1.1 | 2 | 1% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 172012 melee ticks, 44548 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 41 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 61371 sent, 56877 reached their opponent, 10200 virtual hits (17.9% of those reached).

## Melee bench: F03

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 104 over 6 battles (17.3 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 92.0 | 160 / 210 | 1.72 | 19.6% | 32591 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 19.6% | 160 |
| radnor.DoctorBob 1.42 | 2.3 | 14.2% | 26 |
| vuen.Cake 2.51 | 3.3 | 12.4% | 14 |
| kawigi.nano.Lib 1.0 | 3.5 | 12.9% | 8 |
| urdos.URDOS 1.3 | 4.8 | 9.6% | 1 |
| adt.Ar1 2.1 | 6.7 | 7.7% | 0 |
| oa.weak.FlyMk1 0.1 | 7.2 | 6.4% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.2 | 6.8% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.5% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 91.1 | 26 / 35 | 5417 |
| 2 | 1 | 69.9 | 94.3 | 28 / 35 | 5205 |
| 3 | 1 | 70.1 | 94.0 | 28 / 35 | 5351 |
| 4 | 1 | 69.3 | 90.5 | 26 / 35 | 5447 |
| 5 | 1 | 69.1 | 90.2 | 27 / 35 | 5183 |
| 6 | 1 | 70.2 | 92.1 | 25 / 35 | 5988 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 58 | 91% |
| radnor.DoctorBob 1.42 | 51 | 98% |
| kawigi.nano.Lib 1.0 | 46 | 98% |
| oa.weak.FlyMk1 0.1 | 5 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 50% |
| urdos.URDOS 1.3 | 2 | 50% |
| adt.Ar1 2.1 | 2 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 723. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 22 | 44% | 65 |
| vuen.Cake 2.51 | 10 | 20% | 63 |
| kawigi.nano.Lib 1.0 | 7 | 14% | 47 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 8% | 4 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 4% | 9 |
| urdos.URDOS 1.3 | 2 | 4% | 7 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 11 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 2% | 2 |
| adt.Ar1 2.1 | 1 | 2% | 2 |

Posture (Hadur's M records, 204 rounds): 133583 melee ticks, 40344 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 47 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 41158 sent, 36817 reached their opponent, 10133 virtual hits (27.5% of those reached).

## Melee bench: F04

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 372 over 6 battles (62.0 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 85.1 | 25 / 210 | 2.34 | 16.6% | 28614 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.0% | 167 |
| hadur2.Hadur 3.17.1ef | 2.0 | 16.6% | 25 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.1% | 5 |
| TNT.TNT 0.99.1 | 4.0 | 11.2% | 12 |
| josago.Jorgito 0.16 | 5.0 | 8.7% | 2 |
| css.Delitioner 0.11 | 6.5 | 7.0% | 0 |
| tj.zombie1n 1.0.1 | 6.5 | 6.9% | 0 |
| rampancy.Durandal 2.1d | 8.2 | 5.5% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 4.1% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.8 | 84.8 | 2 / 35 | 5008 |
| 2 | 2 | 65.7 | 83.8 | 3 / 35 | 4401 |
| 3 | 2 | 68.0 | 87.3 | 7 / 35 | 4939 |
| 4 | 2 | 66.5 | 85.4 | 2 / 35 | 4492 |
| 5 | 2 | 67.7 | 88.9 | 6 / 35 | 4876 |
| 6 | 2 | 66.0 | 80.3 | 5 / 35 | 4898 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 125 | 10% |
| TNT.TNT 0.99.1 | 12 | 25% |
| apc.LeeroyJenkins2 1.0 | 10 | 70% |
| josago.Jorgito 0.16 | 2 | 50% |
| tj.zombie1n 1.0.1 | 1 | 100% |
| spin.Bugstard 0.012b | 1 | 100% |

Hadur died in 188 of 210 rounds, at a mean tick of 1289. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 135 | 72% | 152 |
| apc.LeeroyJenkins2 1.0 | 20 | 11% | 24 |
| TNT.TNT 0.99.1 | 17 | 9% | 20 |
| josago.Jorgito 0.16 | 10 | 5% | 11 |
| tj.zombie1n 1.0.1 | 2 | 1% | 2 |
| css.Delitioner 0.11 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 203073 melee ticks, 65204 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 49 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 62976 sent, 58430 reached their opponent, 9171 virtual hits (15.7% of those reached).

## Melee bench: F05

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 619 over 6 battles (103.2 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 77.0 | 17 / 210 | 3.07 | 14.0% | 18970 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.3% | 104 |
| justin.DemonicRage 3.4 | 2.0 | 17.1% | 62 |
| hadur2.Hadur 3.17.1ef | 3.2 | 14.0% | 17 |
| wompi.Numbat 2.1 | 3.8 | 12.7% | 20 |
| ms.Ares 0.19 | 5.2 | 9.4% | 2 |
| axeBots.HataMoto 3.09 | 5.8 | 9.2% | 5 |
| supersample.SuperBoxBot 1.0 | 7.3 | 5.7% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.6% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.0 | 4.3% | 0 |
| GarmBox.Oranges 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.5 | 81.0 | 6 / 35 | 3292 |
| 2 | 3 | 61.2 | 73.3 | 1 / 35 | 3131 |
| 3 | 3 | 63.0 | 80.0 | 2 / 35 | 3270 |
| 4 | 3 | 61.2 | 74.6 | 3 / 35 | 2968 |
| 5 | 3 | 62.0 | 77.1 | 2 / 35 | 3124 |
| 6 | 4 | 62.1 | 75.9 | 3 / 35 | 3185 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 38 | 26% |
| cb.fire.Firestarter 2.0f | 36 | 3% |
| wompi.Numbat 2.1 | 6 | 50% |
| axeBots.HataMoto 3.09 | 3 | 33% |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 100% |
| ms.Ares 0.19 | 1 | 100% |

Hadur died in 198 of 210 rounds, at a mean tick of 954. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 77 | 39% | 86 |
| cb.fire.Firestarter 2.0f | 67 | 34% | 69 |
| wompi.Numbat 2.1 | 25 | 13% | 29 |
| axeBots.HataMoto 3.09 | 13 | 7% | 14 |
| ms.Ares 0.19 | 5 | 3% | 6 |
| GarmBox.Oranges 1.0 | 2 | 1% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 2 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 165260 melee ticks, 34828 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 51 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 50925 sent, 46195 reached their opponent, 8052 virtual hits (17.4% of those reached).

## Melee bench: F06

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 209 over 6 battles (34.8 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.0 | 106 / 210 | 2.26 | 18.0% | 27360 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 18.0% | 106 |
| origin.SleepSiphon 1.7b | 2.5 | 14.5% | 42 |
| jekl.StoneGhost 0.7 | 2.5 | 15.0% | 30 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.2% | 17 |
| mld.Wisdom 1.0 | 5.0 | 10.1% | 3 |
| gg.Wolverine 2.0 | 6.3 | 8.4% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 7.0% | 8 |
| spinnercat.Omen 1.0 | 8.2 | 6.2% | 0 |
| DBall.NUKE 0.1 | 8.7 | 5.7% | 2 |
| sample.Fire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 87.0 | 19 / 35 | 4562 |
| 2 | 1 | 68.0 | 84.1 | 19 / 35 | 4736 |
| 3 | 1 | 68.6 | 88.9 | 17 / 35 | 4917 |
| 4 | 1 | 65.8 | 82.5 | 14 / 35 | 4155 |
| 5 | 1 | 67.9 | 86.7 | 18 / 35 | 4588 |
| 6 | 1 | 67.9 | 86.7 | 19 / 35 | 4402 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 56 | 88% |
| origin.SleepSiphon 1.7b | 39 | 69% |
| pe.minimelee.SandboxMiniMelee 1.1 | 21 | 76% |
| gg.Wolverine 2.0 | 7 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 29% |
| mld.Wisdom 1.0 | 4 | 75% |
| DBall.NUKE 0.1 | 2 | 50% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 846. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 34 | 32% | 65 |
| jekl.StoneGhost 0.7 | 27 | 25% | 66 |
| pe.minimelee.SandboxMiniMelee 1.1 | 18 | 17% | 33 |
| mld.Wisdom 1.0 | 11 | 10% | 20 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 7% | 10 |
| gg.Wolverine 2.0 | 5 | 5% | 12 |
| DBall.NUKE 0.1 | 2 | 2% | 2 |
| spinnercat.Omen 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 153336 melee ticks, 38803 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 40 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 48190 sent, 43755 reached their opponent, 10488 virtual hits (24.0% of those reached).

## Melee bench: F07

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 405 over 6 battles (67.5 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 93.3 | 126 / 210 | 1.60 | 20.2% | 34709 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 20.2% | 126 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 17.0% | 37 |
| rtk.Tachikoma 1.0 | 2.8 | 16.4% | 27 |
| franzor.Lizt 1.3.1 | 4.3 | 10.9% | 10 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 11.2% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.2% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.1% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.4% | 0 |
| sample.Target 1.0 | 9.2 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 95.2 | 24 / 35 | 6144 |
| 2 | 1 | 72.7 | 95.2 | 23 / 35 | 6232 |
| 3 | 1 | 70.1 | 90.2 | 16 / 35 | 5074 |
| 4 | 1 | 71.6 | 91.7 | 21 / 35 | 5965 |
| 5 | 1 | 72.0 | 93.7 | 23 / 35 | 5849 |
| 6 | 1 | 71.6 | 94.0 | 19 / 35 | 5445 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 86 | 76% |
| rsalesc.melee.Monk 0.3.6c | 43 | 30% |
| oog.melee.CapuletDroid 1.1 | 32 | 84% |
| franzor.Lizt 1.3.1 | 27 | 74% |

Hadur died in 87 of 210 rounds, at a mean tick of 1439. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 35 | 40% | 64 |
| rtk.Tachikoma 1.0 | 32 | 37% | 101 |
| franzor.Lizt 1.3.1 | 8 | 9% | 1 |
| oog.melee.CapuletDroid 1.1 | 7 | 8% | 35 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 4 |
| skm.PateranBotlock2 1.0 | 1 | 1% | 1 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 4 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 197734 melee ticks, 96254 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 59 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 59093 sent, 54627 reached their opponent, 11829 virtual hits (21.7% of those reached).

## Melee bench: F08

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 690 over 6 battles (115.0 per battle, most in one battle 244). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 88.1 | 130 / 210 | 2.07 | 18.6% | 26569 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 18.6% | 130 |
| tm.Yuugao 1.0 | 2.5 | 13.0% | 24 |
| shrub.Vapour v159 | 3.0 | 12.7% | 26 |
| Krabb.sliNk.Garm 0.9u | 3.5 | 11.8% | 16 |
| com.spp.robocode.MostlyHarmless 010 | 5.3 | 9.4% | 9 |
| m3thos.Eva00 1.1 | 5.8 | 8.9% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 6.8 | 8.2% | 6 |
| qualidafial.MajorDick 1.0.1 | 8.3 | 6.6% | 0 |
| SHAM.WOW 1.4 | 9.2 | 5.8% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 94.9 | 28 / 35 | 4504 |
| 2 | 1 | 68.6 | 89.5 | 23 / 35 | 4520 |
| 3 | 1 | 68.3 | 89.5 | 23 / 35 | 4479 |
| 4 | 1 | 66.4 | 83.5 | 21 / 35 | 4148 |
| 5 | 1 | 67.6 | 87.3 | 17 / 35 | 4468 |
| 6 | 1 | 66.6 | 84.1 | 18 / 35 | 4450 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 52 | 83% |
| shrub.Vapour v159 | 37 | 59% |
| Krabb.sliNk.Garm 0.9u | 27 | 89% |
| com.spp.robocode.MostlyHarmless 010 | 14 | 93% |
| jwst.DAD.DarkAndDarker 1.1 | 10 | 80% |
| m3thos.Eva00 1.1 | 8 | 100% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| SHAM.WOW 1.4 | 6 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 28 | 33% | 51 |
| tm.Yuugao 1.0 | 17 | 20% | 71 |
| Krabb.sliNk.Garm 0.9u | 14 | 16% | 35 |
| com.spp.robocode.MostlyHarmless 010 | 7 | 8% | 21 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 6% | 13 |
| zyx.nano.BacillusComma 1.0 | 4 | 5% | 4 |
| m3thos.Eva00 1.1 | 3 | 3% | 10 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 2 |
| SHAM.WOW 1.4 | 0 | 0% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 152005 melee ticks, 46382 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 56 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 50077 sent, 45525 reached their opponent, 9087 virtual hits (20.0% of those reached).

## Melee bench: F09

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 185 over 6 battles (30.8 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 75.4 | 53 / 210 | 3.21 | 14.7% | 19607 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.0% | 95 |
| hadur2.Hadur 3.17.1ef | 2.5 | 14.7% | 53 |
| kc.micro.Figment 1.0 | 2.5 | 14.4% | 28 |
| yagami.Tidus 0.11 | 4.5 | 10.6% | 3 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.9% | 14 |
| mc2.enemy.Original 0.9 | 5.8 | 9.7% | 17 |
| dft.Calliope 5.6 | 7.0 | 7.9% | 0 |
| step.nanoPri 1.0 | 8.3 | 5.4% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 5.0% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.6 | 77.1 | 11 / 35 | 3349 |
| 2 | 3 | 60.4 | 71.4 | 6 / 35 | 3156 |
| 3 | 2 | 61.7 | 74.6 | 6 / 35 | 3065 |
| 4 | 3 | 63.1 | 76.8 | 8 / 35 | 3350 |
| 5 | 3 | 64.0 | 76.8 | 12 / 35 | 3517 |
| 6 | 2 | 62.6 | 75.6 | 10 / 35 | 3170 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 43 | 23% |
| kc.micro.Figment 1.0 | 40 | 83% |
| pedersen.Grishnakh 1.0 | 7 | 43% |
| mc2.enemy.Original 0.9 | 4 | 0% |
| yagami.Tidus 0.11 | 3 | 100% |
| dft.Calliope 5.6 | 3 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 158 of 210 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 60 | 38% | 71 |
| kc.micro.Figment 1.0 | 31 | 20% | 60 |
| yagami.Tidus 0.11 | 22 | 14% | 25 |
| mc2.enemy.Original 0.9 | 18 | 11% | 21 |
| pedersen.Grishnakh 1.0 | 10 | 6% | 11 |
| dft.Calliope 5.6 | 7 | 4% | 11 |
| robar.nano.Assertive_Melee 0.2 | 5 | 3% | 6 |
| step.nanoPri 1.0 | 4 | 3% | 4 |
| rdm.Dueler 0.4x | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 148495 melee ticks, 32024 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 31 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 49107 sent, 44712 reached their opponent, 6724 virtual hits (15.0% of those reached).

## Melee bench: F10

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 108 over 6 battles (18.0 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 94.1 | 155 / 210 | 1.53 | 19.8% | 30363 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 19.8% | 155 |
| DTF.Kludgy 1.2b | 2.0 | 14.1% | 18 |
| ejb.Polaris 1.0.1 | 3.5 | 13.1% | 11 |
| ne.Chimera 1.2 | 3.5 | 12.9% | 12 |
| vStar.RAFzilla 2.15 | 5.2 | 10.9% | 10 |
| tvv.micro.Antares 1.1.1 | 5.8 | 9.5% | 1 |
| kurios.DOSexe .9b | 7.5 | 5.7% | 1 |
| sam.Samspin 1.0 | 8.2 | 5.4% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.7 | 4.7% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 3.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 95.9 | 27 / 35 | 5203 |
| 2 | 1 | 68.9 | 91.7 | 21 / 35 | 4719 |
| 3 | 1 | 71.4 | 98.4 | 32 / 35 | 5138 |
| 4 | 1 | 70.3 | 93.3 | 28 / 35 | 5137 |
| 5 | 1 | 68.7 | 91.1 | 20 / 35 | 4630 |
| 6 | 1 | 70.9 | 94.3 | 27 / 35 | 5536 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ejb.Polaris 1.0.1 | 53 | 87% |
| DTF.Kludgy 1.2b | 46 | 85% |
| ne.Chimera 1.2 | 34 | 82% |
| vStar.RAFzilla 2.15 | 26 | 85% |
| tvv.micro.Antares 1.1.1 | 15 | 93% |
| kurios.DOSexe .9b | 5 | 100% |
| sam.Samspin 1.0 | 1 | 100% |
| donjezza.Muncho 1.0 | 1 | 0% |

Hadur died in 56 of 210 rounds, at a mean tick of 929. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 18 | 32% | 57 |
| ne.Chimera 1.2 | 17 | 30% | 42 |
| ejb.Polaris 1.0.1 | 9 | 16% | 53 |
| vStar.RAFzilla 2.15 | 8 | 14% | 31 |
| tvv.micro.Antares 1.1.1 | 2 | 4% | 12 |
| donjezza.Muncho 1.0 | 1 | 2% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 2 |
| kurios.DOSexe .9b | 0 | 0% | 10 |
| sam.Samspin 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 204 rounds): 150644 melee ticks, 52934 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 64 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 49248 sent, 44894 reached their opponent, 9136 virtual hits (20.4% of those reached).

## Melee bench: F11

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 103 over 6 battles (17.2 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 78.0 | 59 / 210 | 2.98 | 15.1% | 19722 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.2 | 16.5% | 65 |
| hadur2.Hadur 3.17.1ef | 1.8 | 15.1% | 59 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.8% | 29 |
| djc.DynaBot 0.1.1 | 3.8 | 11.2% | 20 |
| rdt199.Warlord 0.73 | 5.5 | 9.4% | 18 |
| br2.MobyDickBot 1.6 | 6.2 | 8.8% | 10 |
| uji.YellohFellah 1.0 | 6.7 | 8.5% | 9 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.6% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.0% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 83.8 | 13 / 35 | 3717 |
| 2 | 2 | 61.4 | 74.9 | 6 / 35 | 3252 |
| 3 | 2 | 65.9 | 86.0 | 14 / 35 | 3660 |
| 4 | 2 | 60.1 | 72.1 | 8 / 35 | 2883 |
| 5 | 2 | 62.9 | 79.4 | 10 / 35 | 3042 |
| 6 | 2 | 60.7 | 71.7 | 8 / 35 | 3168 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 41 | 46% |
| djc.DynaBot 0.1.1 | 21 | 67% |
| br2.MobyDickBot 1.6 | 12 | 75% |
| rdt199.Warlord 0.73 | 11 | 27% |
| uji.YellohFellah 1.0 | 9 | 89% |
| cx.mini.Nimrod 0.55 | 8 | 50% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 838. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 59 | 39% | 79 |
| cx.mini.Nimrod 0.55 | 27 | 18% | 35 |
| rdt199.Warlord 0.73 | 18 | 12% | 24 |
| djc.DynaBot 0.1.1 | 14 | 9% | 25 |
| uji.YellohFellah 1.0 | 10 | 7% | 17 |
| stelo.MirrorNano 1.3 | 9 | 6% | 9 |
| br2.MobyDickBot 1.6 | 7 | 5% | 11 |
| KiraNL.Chupacabra 0.4 | 4 | 3% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 2% | 3 |

Posture (Hadur's M records, 209 rounds): 158251 melee ticks, 33759 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 41 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 0.

Targeting waves (209 rounds): 52579 sent, 47956 reached their opponent, 6834 virtual hits (14.3% of those reached).

## Melee bench: F12

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 230 over 6 battles (38.3 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 83.2 | 118 / 210 | 2.51 | 17.0% | 20385 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.2 | 17.0% | 118 |
| bts.wiki.RipCurl 0.9b | 2.3 | 14.0% | 30 |
| darkcanuck.Leon 1.01 | 2.8 | 13.2% | 23 |
| nat.PallasHawk 1.0 | 3.8 | 12.8% | 25 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.6% | 9 |
| jrm.Test0 1.0 | 6.2 | 7.8% | 2 |
| cs.sheldor.Talon 1.1 | 7.5 | 6.8% | 1 |
| jp.Perpy 16.0 | 7.8 | 6.7% | 0 |
| jaybot.bots.Oddball 4.0 | 9.2 | 5.8% | 1 |
| stuff.Vlad 0.1 | 9.3 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 87.0 | 23 / 35 | 3776 |
| 2 | 2 | 63.0 | 73.3 | 15 / 35 | 3304 |
| 3 | 1 | 66.3 | 85.7 | 22 / 35 | 3219 |
| 4 | 1 | 66.1 | 83.8 | 20 / 35 | 3441 |
| 5 | 1 | 65.7 | 85.4 | 18 / 35 | 3284 |
| 6 | 1 | 66.1 | 84.1 | 20 / 35 | 3361 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 40 | 83% |
| nat.PallasHawk 1.0 | 36 | 81% |
| bts.wiki.RipCurl 0.9b | 35 | 83% |
| brainfade.melee.Genghis 0.36 | 17 | 88% |
| cs.sheldor.Talon 1.1 | 6 | 83% |
| jaybot.bots.Oddball 4.0 | 5 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| jrm.Test0 1.0 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 643. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 24 | 26% | 45 |
| nat.PallasHawk 1.0 | 17 | 18% | 47 |
| darkcanuck.Leon 1.01 | 15 | 16% | 55 |
| brainfade.melee.Genghis 0.36 | 14 | 15% | 22 |
| jrm.Test0 1.0 | 12 | 13% | 14 |
| cs.sheldor.Talon 1.1 | 7 | 8% | 16 |
| jp.Perpy 16.0 | 3 | 3% | 5 |
| stuff.Vlad 0.1 | 0 | 0% | 2 |
| jaybot.bots.Oddball 4.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 132318 melee ticks, 32988 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 49 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 45779 sent, 41049 reached their opponent, 7233 virtual hits (17.6% of those reached).

## Melee bench: F13

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 195 over 6 battles (32.5 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 79.1 | 37 / 210 | 2.88 | 14.8% | 21644 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.3 | 17.1% | 94 |
| ags.Glacier 0.2.11 | 1.8 | 16.3% | 44 |
| hadur2.Hadur 3.17.1ef | 2.8 | 14.8% | 37 |
| shinh.Entangled 0.3 | 4.5 | 12.2% | 23 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.8% | 9 |
| apc.Colossus2 0.17 | 6.0 | 7.9% | 1 |
| stelo.Wang 1.0 | 7.0 | 6.7% | 2 |
| ayk.WallHugger 1.0 | 8.5 | 4.9% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.8% | 0 |
| sample.Tracker 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 83.5 | 9 / 35 | 3854 |
| 2 | 3 | 63.8 | 80.6 | 7 / 35 | 3607 |
| 3 | 3 | 64.5 | 81.9 | 10 / 35 | 3677 |
| 4 | 3 | 61.9 | 75.6 | 2 / 35 | 3412 |
| 5 | 3 | 60.3 | 72.4 | 2 / 35 | 3377 |
| 6 | 3 | 63.9 | 80.6 | 7 / 35 | 3717 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 46 | 13% |
| ags.Glacier 0.2.11 | 33 | 39% |
| shinh.Entangled 0.3 | 18 | 50% |
| gh.micro.Gruweltje 0.7 | 9 | 78% |
| stelo.Wang 1.0 | 1 | 100% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 174 of 210 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 73 | 42% | 80 |
| ags.Glacier 0.2.11 | 47 | 27% | 63 |
| shinh.Entangled 0.3 | 24 | 14% | 28 |
| gh.micro.Gruweltje 0.7 | 15 | 9% | 24 |
| apc.Colossus2 0.17 | 5 | 3% | 5 |
| maribo.FollowFire 1 | 4 | 2% | 4 |
| stelo.Wang 1.0 | 4 | 2% | 4 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 210 rounds): 158666 melee ticks, 36611 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (210 rounds): longest scan gap while four or more were alive 50 ticks (210 rounds over 8); rounds whose longest gap at any count was over 8: 210; robots dropped as dead without a death event: 0.

Targeting waves (210 rounds): 46652 sent, 41657 reached their opponent, 7092 virtual hits (17.0% of those reached).

## Melee bench: F14

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 134 over 6 battles (22.3 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 92.2 | 150 / 210 | 1.70 | 19.5% | 29630 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 19.5% | 150 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.0% | 17 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.9% | 29 |
| co.edu.usb.rc.LidisTron 1.0 | 5.2 | 9.4% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 5.5 | 9.3% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.8 | 9.1% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.3 | 8.9% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 7.8% | 6 |
| pa.Improved 1.0 | 8.7 | 6.3% | 2 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 94.0 | 30 / 35 | 5224 |
| 2 | 1 | 69.6 | 91.1 | 25 / 35 | 4996 |
| 3 | 1 | 69.8 | 92.1 | 23 / 35 | 5063 |
| 4 | 1 | 70.8 | 95.6 | 29 / 35 | 5004 |
| 5 | 1 | 68.8 | 90.8 | 23 / 35 | 4542 |
| 6 | 1 | 68.4 | 89.5 | 20 / 35 | 4801 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 67 | 96% |
| catcat20.shape.Theta 0.018 | 54 | 67% |
| sanyi.mikrobi.Roberto 1.0 | 21 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 77% |
| co.edu.usb.rc.LidisTron 1.0 | 10 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| pa.Improved 1.0 | 3 | 33% |

Hadur died in 60 of 210 rounds, at a mean tick of 908. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 24 | 40% | 52 |
| simonton.micro.Sprout 1.1.3 | 14 | 23% | 78 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 8% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 8% | 11 |
| co.edu.usb.rc.LidisTron 1.0 | 4 | 7% | 14 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 5% | 26 |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 5% | 9 |
| pa.Improved 1.0 | 2 | 3% | 4 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 143362 melee ticks, 50862 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 38 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 45496 sent, 41214 reached their opponent, 10667 virtual hits (25.9% of those reached).

## Melee bench: F15

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 196 over 6 battles (32.7 per battle, most in one battle 113). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 82.4 | 90 / 210 | 2.58 | 17.2% | 26633 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 17.2% | 90 |
| kawigi.micro.Shiz 1.1 | 2.5 | 14.0% | 21 |
| emp.Yngwie 1.11 | 3.0 | 13.7% | 59 |
| mld.DustBunny 3.8 | 3.5 | 12.8% | 14 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.6% | 7 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.4% | 16 |
| lambdaxy.TBot 0.1 | 7.2 | 6.6% | 0 |
| Grystrion.TrackerWO 1.0 | 7.8 | 6.2% | 1 |
| divineomega.TrialBot 0.003 | 9.3 | 5.1% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 80.6 | 13 / 35 | 4093 |
| 2 | 1 | 66.6 | 81.9 | 17 / 35 | 4641 |
| 3 | 1 | 67.6 | 84.8 | 17 / 35 | 4695 |
| 4 | 1 | 66.3 | 84.8 | 14 / 35 | 4308 |
| 5 | 1 | 65.1 | 77.5 | 12 / 35 | 4555 |
| 6 | 1 | 67.4 | 85.1 | 17 / 35 | 4341 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 53 | 43% |
| kawigi.micro.Shiz 1.1 | 31 | 87% |
| mld.DustBunny 3.8 | 19 | 79% |
| kawigi.robot.Girl 1.2 | 14 | 71% |
| cb.nano.Insomnia 1.0 | 10 | 90% |
| divineomega.TrialBot 0.003 | 5 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 980. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 46 | 38% | 84 |
| mld.DustBunny 3.8 | 26 | 21% | 43 |
| kawigi.micro.Shiz 1.1 | 21 | 17% | 41 |
| kawigi.robot.Girl 1.2 | 12 | 10% | 17 |
| cb.nano.Insomnia 1.0 | 8 | 7% | 9 |
| divineomega.TrialBot 0.003 | 3 | 2% | 11 |
| lambdaxy.TBot 0.1 | 3 | 2% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 1 |
| Grystrion.TrackerWO 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 169512 melee ticks, 46242 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 41 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 55744 sent, 51131 reached their opponent, 8886 virtual hits (17.4% of those reached).

## Melee bench: F16

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 410 over 6 battles (68.3 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 86.3 | 99 / 210 | 2.23 | 18.2% | 28692 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 18.2% | 99 |
| gh.Griezel 0.5.2 | 2.0 | 16.7% | 61 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.0% | 7 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 10.6% | 30 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.4% | 3 |
| tvv.nano.Polaris 1.2 | 6.0 | 8.8% | 6 |
| stelo.IntrinsicVolatility 1.4 | 6.7 | 7.7% | 0 |
| asd.Cthulhu 1.3 | 8.8 | 4.9% | 0 |
| repositorio.NanoStep 1.0 | 9.0 | 5.1% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.2 | 4.6% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 85.1 | 14 / 35 | 4558 |
| 2 | 1 | 66.7 | 83.5 | 14 / 35 | 4402 |
| 3 | 1 | 69.3 | 89.8 | 20 / 35 | 4739 |
| 4 | 1 | 66.9 | 81.9 | 15 / 35 | 4921 |
| 5 | 1 | 68.9 | 89.5 | 18 / 35 | 4921 |
| 6 | 1 | 69.0 | 87.9 | 18 / 35 | 5151 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 79 | 62% |
| techdude.forest.FlamingForest 1.1 | 30 | 57% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 22 | 91% |
| bvh.fnr.Fenrir 0.36l | 6 | 67% |
| tvv.nano.Polaris 1.2 | 5 | 80% |
| divineomega.DivineBot 1.9.4.5 | 4 | 75% |
| stelo.IntrinsicVolatility 1.4 | 2 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 1173. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 42 | 37% | 102 |
| techdude.forest.FlamingForest 1.1 | 21 | 18% | 34 |
| bvh.fnr.Fenrir 0.36l | 15 | 13% | 16 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 14 | 12% | 30 |
| divineomega.DivineBot 1.9.4.5 | 6 | 5% | 10 |
| stelo.IntrinsicVolatility 1.4 | 6 | 5% | 8 |
| tvv.nano.Polaris 1.2 | 4 | 3% | 5 |
| asd.Cthulhu 1.3 | 3 | 3% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 184589 melee ticks, 66408 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 38 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 59135 sent, 54622 reached their opponent, 9369 virtual hits (17.2% of those reached).

## Melee bench: F17

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 543 over 6 battles (90.5 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 84.7 | 98 / 210 | 2.38 | 18.0% | 29507 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 18.0% | 98 |
| et.Predator 1.8 | 2.8 | 13.4% | 24 |
| oog.melee.Mercutio 1.0 | 2.8 | 13.3% | 35 |
| cx.BlestPain 1.41 | 3.3 | 12.7% | 39 |
| ahf.NanoAndrew .4 | 5.2 | 10.5% | 8 |
| nic.Nicator 2.4 | 6.0 | 9.7% | 5 |
| maribo.melee.BMV 0.1 | 6.8 | 8.5% | 1 |
| tex.Longbot 0.4 | 8.5 | 5.9% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.7% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 81.6 | 13 / 35 | 4834 |
| 2 | 1 | 69.3 | 90.5 | 18 / 35 | 5158 |
| 3 | 1 | 66.1 | 79.4 | 13 / 35 | 4852 |
| 4 | 1 | 67.1 | 80.6 | 18 / 35 | 4925 |
| 5 | 1 | 67.7 | 86.7 | 15 / 35 | 4874 |
| 6 | 1 | 69.3 | 89.5 | 21 / 35 | 4864 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 48 | 77% |
| oog.melee.Mercutio 1.0 | 43 | 74% |
| cx.BlestPain 1.41 | 28 | 39% |
| ahf.NanoAndrew .4 | 9 | 89% |
| maribo.melee.BMV 0.1 | 4 | 100% |
| nic.Nicator 2.4 | 3 | 100% |
| tex.Longbot 0.4 | 2 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 1062. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 32 | 28% | 63 |
| cx.BlestPain 1.41 | 31 | 27% | 45 |
| oog.melee.Mercutio 1.0 | 22 | 19% | 53 |
| ahf.NanoAndrew .4 | 12 | 10% | 23 |
| maribo.melee.BMV 0.1 | 7 | 6% | 8 |
| nic.Nicator 2.4 | 6 | 5% | 12 |
| tex.Longbot 0.4 | 2 | 2% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 3 |
| goblin.Bender 2.4 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 168513 melee ticks, 56657 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 58 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 56816 sent, 52259 reached their opponent, 11521 virtual hits (22.0% of those reached).

## Melee bench: F18

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 245 over 6 battles (40.8 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 88.4 | 114 / 210 | 2.05 | 18.4% | 25720 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 18.4% | 114 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.8% | 31 |
| agd.Mooserwirt2 2.7 | 3.2 | 12.1% | 30 |
| uji.DBH 1.1 | 3.7 | 11.4% | 11 |
| sigterm.Sigterm 1.0 | 5.7 | 8.9% | 8 |
| spinnercat.Robovirus 2.718 | 6.0 | 9.5% | 11 |
| ratosh.Nobo 0.21 | 6.8 | 8.2% | 4 |
| kawigi.mini.Fhqwhgads 1.1 | 7.7 | 7.4% | 0 |
| stelo.WangRobot 1.0 | 9.2 | 5.4% | 1 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 87.9 | 18 / 35 | 4261 |
| 2 | 1 | 66.5 | 85.4 | 17 / 35 | 4144 |
| 3 | 1 | 69.2 | 92.1 | 20 / 35 | 4577 |
| 4 | 1 | 68.4 | 88.3 | 23 / 35 | 4214 |
| 5 | 1 | 67.8 | 88.6 | 18 / 35 | 4403 |
| 6 | 1 | 67.3 | 87.9 | 18 / 35 | 4121 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 55 | 71% |
| agd.Mooserwirt2 2.7 | 32 | 69% |
| uji.DBH 1.1 | 22 | 73% |
| sigterm.Sigterm 1.0 | 17 | 82% |
| spinnercat.Robovirus 2.718 | 13 | 69% |
| ratosh.Nobo 0.21 | 7 | 57% |
| stelo.WangRobot 1.0 | 6 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 30 | 31% | 72 |
| agd.Mooserwirt2 2.7 | 19 | 20% | 46 |
| uji.DBH 1.1 | 13 | 13% | 23 |
| sigterm.Sigterm 1.0 | 11 | 11% | 17 |
| spinnercat.Robovirus 2.718 | 8 | 8% | 18 |
| ratosh.Nobo 0.21 | 5 | 5% | 14 |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 5% | 9 |
| stelo.WangRobot 1.0 | 3 | 3% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 2% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 148577 melee ticks, 43019 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 48 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 1.

Targeting waves (208 rounds): 50096 sent, 45454 reached their opponent, 10253 virtual hits (22.6% of those reached).

## Melee bench: F19

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 107 over 6 battles (17.8 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 97.5 | 190 / 210 | 1.22 | 21.5% | 32831 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 21.5% | 190 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.8% | 13 |
| mld.Infinity 2.2 | 3.3 | 12.2% | 0 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.3% | 2 |
| erdnis.Rover 0.3 | 4.7 | 10.7% | 3 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.4% | 1 |
| pac.ABC 2.1 | 7.3 | 7.3% | 1 |
| mbh.Mbh 0.1 | 7.7 | 7.1% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.6% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 97.5 | 31 / 35 | 5506 |
| 2 | 1 | 72.3 | 97.8 | 32 / 35 | 5218 |
| 3 | 1 | 72.6 | 96.5 | 32 / 35 | 5871 |
| 4 | 1 | 72.7 | 99.4 | 33 / 35 | 5296 |
| 5 | 1 | 71.8 | 95.9 | 29 / 35 | 5454 |
| 6 | 1 | 72.6 | 98.1 | 33 / 35 | 5486 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 100 | 95% |
| mld.Infinity 2.2 | 36 | 100% |
| krillr.mini.JointStrike 2.0.0 | 27 | 93% |
| erdnis.Rover 0.3 | 14 | 79% |
| pac.ABC 2.1 | 14 | 100% |
| patson.PatsonTestBot 1.0 | 6 | 83% |
| pbg.R2D2 1.0 | 2 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |
| pedersen.Moron 2.0 | 1 | 100% |

Hadur died in 22 of 210 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 8 | 36% | 74 |
| erdnis.Rover 0.3 | 6 | 27% | 24 |
| krillr.mini.JointStrike 2.0.0 | 3 | 14% | 38 |
| mld.Infinity 2.2 | 2 | 9% | 32 |
| patson.PatsonTestBot 1.0 | 2 | 9% | 15 |
| mbh.Mbh 0.1 | 1 | 5% | 8 |
| pac.ABC 2.1 | 0 | 0% | 10 |
| pbg.R2D2 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 199 rounds): 133547 melee ticks, 44889 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 47 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 45149 sent, 40856 reached their opponent, 10356 virtual hits (25.3% of those reached).

## Melee bench: F20

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 297 over 6 battles (49.5 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 90.2 | 134 / 210 | 1.89 | 19.7% | 31342 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 19.7% | 134 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.9% | 36 |
| fwb.Nine 1.0.1 | 3.0 | 12.1% | 18 |
| catcat20.Rabbit 0.001 | 4.5 | 10.3% | 17 |
| nz.jdc.nano.GridFu 1.0 | 4.5 | 10.5% | 3 |
| m3thos.mini.Eva01 0.5.5 | 6.2 | 8.5% | 0 |
| bayen.nut.Squirrel 1.615 | 7.2 | 7.1% | 2 |
| djdjdj.NanoSkunk10 1.0 | 8.0 | 5.9% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.7 | 5.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 91.1 | 23 / 35 | 5352 |
| 2 | 1 | 68.4 | 85.7 | 19 / 35 | 4973 |
| 3 | 1 | 69.9 | 90.2 | 24 / 35 | 5361 |
| 4 | 1 | 70.4 | 92.4 | 23 / 35 | 5222 |
| 5 | 1 | 69.7 | 89.5 | 21 / 35 | 5245 |
| 6 | 1 | 70.3 | 92.1 | 24 / 35 | 5189 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 76 | 80% |
| fwb.Nine 1.0.1 | 32 | 97% |
| catcat20.Rabbit 0.001 | 26 | 81% |
| nz.jdc.nano.GridFu 1.0 | 9 | 89% |
| m3thos.mini.Eva01 0.5.5 | 6 | 100% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| bayen.nut.Squirrel 1.615 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 999. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 36 | 46% | 99 |
| catcat20.Rabbit 0.001 | 13 | 16% | 38 |
| fwb.Nine 1.0.1 | 11 | 14% | 18 |
| nz.jdc.nano.GridFu 1.0 | 7 | 9% | 29 |
| bayen.nut.Squirrel 1.615 | 5 | 6% | 9 |
| m3thos.mini.Eva01 0.5.5 | 2 | 3% | 10 |
| ntc.ControlledChaos 1.1.4 | 2 | 3% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 2 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 173418 melee ticks, 55471 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 104 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 104 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 55103 sent, 50552 reached their opponent, 12295 virtual hits (24.3% of those reached).

## Melee bench: F21

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 675 over 6 battles (112.5 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 90.3 | 122 / 210 | 1.88 | 19.3% | 30628 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 19.3% | 122 |
| eem.EvBot v4.6.16 | 2.0 | 16.5% | 68 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.0% | 9 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.3% | 3 |
| eld.Hmm 1.0 | 5.2 | 8.8% | 10 |
| oa.weak.BotherBot 0.1 | 6.0 | 7.7% | 1 |
| fire219.CatBot 1.0 | 7.5 | 6.3% | 0 |
| el.JumpShoot 0.2 | 8.0 | 6.0% | 0 |
| PSW.Relentless 0.1 | 8.8 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 90.2 | 19 / 35 | 4941 |
| 2 | 1 | 70.7 | 92.7 | 22 / 35 | 5419 |
| 3 | 1 | 68.4 | 87.9 | 19 / 35 | 4821 |
| 4 | 1 | 70.5 | 92.4 | 23 / 35 | 5136 |
| 5 | 1 | 68.2 | 87.3 | 18 / 35 | 4870 |
| 6 | 1 | 70.0 | 91.1 | 21 / 35 | 5441 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 120 | 66% |
| dummy.mini.Scimitar 1.01 | 26 | 96% |
| cf.RiO.RiOx 4.2.1 | 12 | 83% |
| eld.Hmm 1.0 | 8 | 63% |
| oa.weak.BotherBot 0.1 | 1 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 1260. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 51 | 53% | 100 |
| dummy.mini.Scimitar 1.01 | 15 | 16% | 51 |
| cf.RiO.RiOx 4.2.1 | 9 | 9% | 19 |
| eld.Hmm 1.0 | 5 | 5% | 23 |
| el.JumpShoot 0.2 | 3 | 3% | 5 |
| arthord.MannyPacquiao Beta | 2 | 2% | 5 |
| PSW.Relentless 0.1 | 2 | 2% | 2 |
| fire219.CatBot 1.0 | 1 | 1% | 2 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 3 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 181241 melee ticks, 88918 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 70 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 54995 sent, 50466 reached their opponent, 9104 virtual hits (18.0% of those reached).

## Melee bench: F22

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 90 over 6 battles (15.0 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 87.4 | 99 / 210 | 2.14 | 17.8% | 26127 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.3 | 17.8% | 99 |
| pe.SandboxDT 2.71m | 1.7 | 16.7% | 61 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.6% | 22 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.3% | 19 |
| bigpete.Stewie 1.0 | 5.0 | 11.0% | 7 |
| tad.Dalek98 0.98 | 6.7 | 6.4% | 0 |
| gg.Squaraus 0.6 | 7.2 | 6.2% | 0 |
| yk.JahRoslav 1.1 | 7.3 | 6.4% | 1 |
| pbg.NinjaX 1.2 | 8.8 | 5.1% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 83.5 | 15 / 35 | 4279 |
| 2 | 1 | 68.7 | 87.9 | 21 / 35 | 4487 |
| 3 | 1 | 67.9 | 88.9 | 14 / 35 | 4398 |
| 4 | 1 | 69.7 | 92.4 | 24 / 35 | 4326 |
| 5 | 2 | 67.2 | 86.0 | 12 / 35 | 4293 |
| 6 | 2 | 67.2 | 85.4 | 13 / 35 | 4344 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 55 | 55% |
| jlm.javaDisturbance 0.59 | 37 | 70% |
| kvk.HebusLeTroll 0.35 | 34 | 79% |
| bigpete.Stewie 1.0 | 15 | 73% |
| pbg.NinjaX 1.2 | 3 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 974. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 48 | 43% | 83 |
| jlm.javaDisturbance 0.59 | 24 | 21% | 51 |
| kvk.HebusLeTroll 0.35 | 24 | 21% | 46 |
| bigpete.Stewie 1.0 | 10 | 9% | 21 |
| tad.Dalek98 0.98 | 5 | 4% | 5 |
| yk.JahRoslav 1.1 | 1 | 1% | 1 |
| pbg.NinjaX 1.2 | 0 | 0% | 2 |

Posture (Hadur's M records, 203 rounds): 166190 melee ticks, 49238 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 54 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 53989 sent, 49558 reached their opponent, 8438 virtual hits (17.0% of those reached).

## Melee bench: F23

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 178 over 6 battles (29.7 per battle, most in one battle 111). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 95.3 | 159 / 210 | 1.42 | 20.8% | 31981 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 20.8% | 159 |
| pe.SandboxLump 1.52 | 2.0 | 16.5% | 39 |
| cre.Karolos 0.32 | 3.0 | 13.3% | 6 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.0% | 0 |
| stelo.RamTrackSurfer 1.2 | 5.2 | 9.5% | 5 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 9.5% | 0 |
| cw.megas.Blade 0.8 | 7.0 | 8.3% | 2 |
| sample.Walls 1.0 | 7.8 | 7.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.3 | 2.8% | 0 |
| rrh.Iwillfindyou 2.0 | 9.7 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 92.7 | 22 / 35 | 5232 |
| 2 | 1 | 71.2 | 94.0 | 25 / 35 | 4896 |
| 3 | 1 | 72.7 | 97.5 | 29 / 35 | 5692 |
| 4 | 1 | 72.5 | 95.9 | 27 / 35 | 5640 |
| 5 | 1 | 72.2 | 97.8 | 30 / 35 | 5418 |
| 6 | 1 | 71.7 | 94.0 | 26 / 35 | 5103 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 103 | 75% |
| cre.Karolos 0.32 | 50 | 94% |
| stelo.RamTrackSurfer 1.2 | 14 | 79% |
| stelo.AreaTargetingBot 1.1 | 10 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| cw.megas.Blade 0.8 | 3 | 67% |

Hadur died in 53 of 210 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 33 | 62% | 104 |
| cre.Karolos 0.32 | 9 | 17% | 47 |
| stelo.RamTrackSurfer 1.2 | 4 | 8% | 22 |
| stelo.AreaTargetingBot 1.1 | 3 | 6% | 10 |
| cw.megas.Blade 0.8 | 2 | 4% | 9 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 9 |
| sample.Walls 1.0 | 0 | 0% | 8 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 131134 melee ticks, 50762 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 74 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 74 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 41347 sent, 37055 reached their opponent, 11666 virtual hits (31.5% of those reached).

## Melee bench: F24

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 470 over 6 battles (78.3 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 79.5 | 66 / 210 | 2.84 | 15.6% | 20689 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 15.6% | 66 |
| rz.GlowBlowMelee 1.4 | 2.5 | 14.6% | 43 |
| davidalves.Phoenix 0.54 | 3.5 | 12.7% | 37 |
| florent.XSeries.X2 0.12 | 3.8 | 13.1% | 29 |
| pedersen.Ugluk 1.1.1 | 4.3 | 12.2% | 23 |
| oog.melee.Corsair 1.0 | 5.8 | 10.0% | 12 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 6.8% | 0 |
| lunchie.Lunchbox 0.93 | 8.5 | 5.3% | 1 |
| evd.X1 0.01 | 9.2 | 4.7% | 0 |
| as.FrankTheTank 1.3 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 81.3 | 8 / 35 | 3381 |
| 2 | 1 | 62.6 | 78.1 | 8 / 35 | 3244 |
| 3 | 1 | 65.2 | 82.2 | 17 / 35 | 3384 |
| 4 | 1 | 64.6 | 81.3 | 11 / 35 | 3514 |
| 5 | 1 | 63.0 | 75.6 | 10 / 35 | 3538 |
| 6 | 1 | 64.4 | 78.7 | 12 / 35 | 3628 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 38 | 50% |
| davidalves.Phoenix 0.54 | 26 | 50% |
| florent.XSeries.X2 0.12 | 23 | 52% |
| pedersen.Ugluk 1.1.1 | 19 | 58% |
| oog.melee.Corsair 1.0 | 11 | 64% |
| stelo.SoJNanoMelee 1.1 | 2 | 100% |
| as.FrankTheTank 1.3 | 2 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 0% |

Hadur died in 148 of 210 rounds, at a mean tick of 789. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 37 | 25% | 53 |
| florent.XSeries.X2 0.12 | 31 | 21% | 44 |
| davidalves.Phoenix 0.54 | 29 | 20% | 41 |
| pedersen.Ugluk 1.1.1 | 26 | 18% | 38 |
| oog.melee.Corsair 1.0 | 12 | 8% | 22 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 4 |
| stelo.SoJNanoMelee 1.1 | 2 | 1% | 3 |
| as.FrankTheTank 1.3 | 2 | 1% | 3 |
| evd.X1 0.01 | 2 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 141521 melee ticks, 33680 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 39 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 48156 sent, 43354 reached their opponent, 8403 virtual hits (19.4% of those reached).

## Melee bench: F25

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 527 over 6 battles (87.8 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 85.3 | 125 / 210 | 2.32 | 17.5% | 21137 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 17.5% | 125 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 14.0% | 24 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 13.1% | 13 |
| jdw.Hurricane 1.4 | 4.0 | 11.6% | 22 |
| ds.Oo 2.2 | 5.0 | 9.6% | 11 |
| gre.svman4.Morfeas 1.4.1 | 6.3 | 9.0% | 8 |
| awesomeness.Elite 1.0 | 7.3 | 7.3% | 2 |
| adt.Ar2 1.1 | 7.8 | 6.8% | 1 |
| gjr.Cephalosporin 0.1 | 8.5 | 6.4% | 4 |
| amk.ChumbaMini 0.2 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 86.3 | 23 / 35 | 3408 |
| 2 | 1 | 67.4 | 86.3 | 23 / 35 | 3730 |
| 3 | 1 | 63.3 | 75.2 | 16 / 35 | 3341 |
| 4 | 1 | 65.8 | 85.4 | 18 / 35 | 3387 |
| 5 | 1 | 69.2 | 91.7 | 26 / 35 | 3755 |
| 6 | 1 | 66.5 | 86.7 | 19 / 35 | 3516 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 52 | 90% |
| voidious.micro.BlitzBat 1.05 | 37 | 92% |
| jdw.Hurricane 1.4 | 24 | 75% |
| ds.Oo 2.2 | 13 | 69% |
| gre.svman4.Morfeas 1.4.1 | 9 | 67% |
| awesomeness.Elite 1.0 | 5 | 80% |
| gjr.Cephalosporin 0.1 | 4 | 75% |
| adt.Ar2 1.1 | 3 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 627. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 20 | 22% | 46 |
| voidious.mini.BrokenSword 2.0.3 | 18 | 20% | 51 |
| ds.Oo 2.2 | 13 | 15% | 29 |
| jdw.Hurricane 1.4 | 11 | 12% | 28 |
| amk.ChumbaMini 0.2 | 6 | 7% | 6 |
| gre.svman4.Morfeas 1.4.1 | 5 | 6% | 17 |
| awesomeness.Elite 1.0 | 5 | 6% | 11 |
| adt.Ar2 1.1 | 4 | 4% | 8 |
| gjr.Cephalosporin 0.1 | 3 | 3% | 12 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 129238 melee ticks, 26954 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 34 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 46129 sent, 41747 reached their opponent, 7397 virtual hits (17.7% of those reached).

## Melee bench: F26

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 430 over 6 battles (71.7 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 90.8 | 125 / 210 | 1.82 | 19.4% | 32639 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 19.4% | 125 |
| ak.Fermat 2.0 | 2.0 | 16.2% | 38 |
| lrem.Spectre 0.4.4 | 3.5 | 12.0% | 13 |
| shu.nitro.LENIN .T34 | 3.7 | 12.2% | 21 |
| js.PinBall 1.6 | 5.2 | 10.2% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 5.7 | 9.7% | 7 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 8.8% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.1% | 3 |
| sample.SpinBot 1.0 | 9.0 | 4.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 88.9 | 20 / 35 | 4949 |
| 2 | 1 | 68.9 | 87.9 | 17 / 35 | 5091 |
| 3 | 1 | 70.2 | 90.8 | 20 / 35 | 5604 |
| 4 | 1 | 71.0 | 92.7 | 23 / 35 | 5676 |
| 5 | 1 | 70.8 | 92.7 | 23 / 35 | 5653 |
| 6 | 1 | 70.6 | 92.1 | 22 / 35 | 5666 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 71 | 72% |
| shu.nitro.LENIN .T34 | 40 | 75% |
| lrem.Spectre 0.4.4 | 36 | 75% |
| jaybot.adv.bots.JayBot 2.0 | 9 | 56% |
| js.PinBall 1.6 | 8 | 88% |
| gh.mini.GrubbmOne 1.0 | 5 | 80% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 50% |

Hadur died in 89 of 210 rounds, at a mean tick of 1005. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 36 | 40% | 80 |
| shu.nitro.LENIN .T34 | 17 | 19% | 47 |
| lrem.Spectre 0.4.4 | 13 | 15% | 40 |
| jaybot.adv.bots.JayBot 2.0 | 9 | 10% | 16 |
| js.PinBall 1.6 | 6 | 7% | 17 |
| gh.mini.GrubbmOne 1.0 | 2 | 2% | 6 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 2% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 164041 melee ticks, 51881 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 18 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 17 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 53640 sent, 49066 reached their opponent, 12745 virtual hits (26.0% of those reached).

## Melee bench: F27

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 178 over 6 battles (29.7 per battle, most in one battle 106). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 92.2 | 161 / 210 | 1.70 | 20.0% | 28768 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 20.0% | 161 |
| mk.Alpha 0.2.1 | 2.0 | 13.7% | 28 |
| EH.Eagle 1.0.6 | 3.0 | 11.5% | 5 |
| wee.Gem 1.8.4 | 5.5 | 9.4% | 10 |
| techdude.kombat.FlamingKombat 1.5 | 5.8 | 8.7% | 1 |
| sheldor.melee.nano.TestMelee 0.1 | 6.2 | 8.9% | 3 |
| joe.ADinosaur 1.0 | 6.5 | 8.7% | 1 |
| throxbot.ThroxBot 0.1 | 7.0 | 7.6% | 2 |
| caimano.Furia_Ceca 0.22 | 8.3 | 7.2% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 89.2 | 24 / 35 | 5081 |
| 2 | 1 | 69.5 | 89.8 | 26 / 35 | 4937 |
| 3 | 1 | 69.0 | 92.1 | 26 / 35 | 4356 |
| 4 | 1 | 70.2 | 93.3 | 26 / 35 | 4952 |
| 5 | 1 | 69.8 | 92.7 | 29 / 35 | 4548 |
| 6 | 1 | 70.9 | 95.9 | 30 / 35 | 4894 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 90 | 89% |
| EH.Eagle 1.0.6 | 38 | 100% |
| wee.Gem 1.8.4 | 15 | 87% |
| techdude.kombat.FlamingKombat 1.5 | 11 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 100% |
| throxbot.ThroxBot 0.1 | 8 | 88% |
| joe.ADinosaur 1.0 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 20 | 39% | 87 |
| throxbot.ThroxBot 0.1 | 10 | 20% | 16 |
| wee.Gem 1.8.4 | 7 | 14% | 22 |
| EH.Eagle 1.0.6 | 4 | 8% | 40 |
| joe.ADinosaur 1.0 | 4 | 8% | 11 |
| sheldor.melee.nano.TestMelee 0.1 | 3 | 6% | 19 |
| caimano.Furia_Ceca 0.22 | 1 | 2% | 4 |
| cs.Grudge 1.0 | 1 | 2% | 1 |
| techdude.kombat.FlamingKombat 1.5 | 0 | 0% | 10 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 138672 melee ticks, 40131 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 58 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 44877 sent, 40454 reached their opponent, 10277 virtual hits (25.4% of those reached).

## Melee bench: F28

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 511 over 6 battles (85.2 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 89.2 | 132 / 210 | 1.98 | 18.1% | 21697 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 18.1% | 132 |
| kid.test.NightFox .2 | 2.0 | 14.5% | 29 |
| uji.Antique 1.0 | 3.2 | 12.5% | 22 |
| pfvicm.Sobieski 7.2.3b | 4.3 | 10.6% | 4 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.7% | 11 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.5% | 1 |
| ahr.ice.Ice 1.0.2 | 6.7 | 8.2% | 11 |
| matt.advanced.Katana 1.0 | 8.0 | 6.6% | 0 |
| stelo.PianistNano 1.2 | 9.5 | 5.3% | 0 |
| stelo.Lifestealer 1.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 90.8 | 22 / 35 | 3661 |
| 2 | 1 | 66.5 | 87.6 | 20 / 35 | 3504 |
| 3 | 1 | 68.5 | 94.0 | 25 / 35 | 3470 |
| 4 | 1 | 67.1 | 88.3 | 21 / 35 | 3637 |
| 5 | 1 | 66.1 | 84.1 | 19 / 35 | 3537 |
| 6 | 1 | 68.3 | 90.2 | 25 / 35 | 3888 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 64 | 91% |
| uji.Antique 1.0 | 44 | 86% |
| qohnil.blot.BlotBot 3.61 | 15 | 73% |
| pfvicm.Sobieski 7.2.3b | 12 | 75% |
| amk.ChumbaWumba 0.3 | 8 | 88% |
| ahr.ice.Ice 1.0.2 | 6 | 50% |
| matt.advanced.Katana 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 21 | 25% | 58 |
| kid.test.NightFox .2 | 15 | 18% | 57 |
| pfvicm.Sobieski 7.2.3b | 12 | 14% | 19 |
| qohnil.blot.BlotBot 3.61 | 10 | 12% | 27 |
| amk.ChumbaWumba 0.3 | 9 | 11% | 20 |
| ahr.ice.Ice 1.0.2 | 8 | 9% | 14 |
| matt.advanced.Katana 1.0 | 2 | 2% | 6 |
| stelo.PianistNano 1.2 | 2 | 2% | 5 |
| stelo.Lifestealer 1.0 | 2 | 2% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 135095 melee ticks, 34539 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 31 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 46098 sent, 41685 reached their opponent, 6466 virtual hits (15.5% of those reached).

## Melee bench: F29

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 405 over 6 battles (67.5 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 85.0 | 94 / 210 | 2.35 | 17.5% | 23654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 17.5% | 94 |
| zyx.mega.YersiniaPestis 3.1 | 2.2 | 15.9% | 66 |
| deewiant.Anomaly 0.2 | 2.8 | 14.4% | 35 |
| myl.micro.Troodon 1.10 | 4.2 | 12.0% | 6 |
| jok.PheonixM 0.1.2 | 4.8 | 10.9% | 7 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.3% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.7 | 6.0% | 0 |
| DBall.Anarchy 0.1 | 7.7 | 6.1% | 1 |
| ap.Frederick 1.1 | 8.8 | 4.9% | 1 |
| jangs.ns51 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 86.3 | 14 / 35 | 3881 |
| 2 | 1 | 68.1 | 87.0 | 15 / 35 | 4164 |
| 3 | 1 | 68.0 | 88.3 | 18 / 35 | 3888 |
| 4 | 1 | 66.4 | 81.9 | 13 / 35 | 4039 |
| 5 | 1 | 66.1 | 80.6 | 15 / 35 | 3902 |
| 6 | 1 | 67.3 | 85.7 | 19 / 35 | 3780 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 50 | 70% |
| zyx.mega.YersiniaPestis 3.1 | 43 | 37% |
| myl.micro.Troodon 1.10 | 19 | 89% |
| jok.PheonixM 0.1.2 | 19 | 79% |
| DBall.Anarchy 0.1 | 5 | 100% |
| ap.Frederick 1.1 | 3 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 971. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 46 | 38% | 67 |
| deewiant.Anomaly 0.2 | 38 | 31% | 78 |
| myl.micro.Troodon 1.10 | 19 | 16% | 33 |
| jok.PheonixM 0.1.2 | 12 | 10% | 21 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 1 |
| DBall.Anarchy 0.1 | 0 | 0% | 5 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 171437 melee ticks, 45710 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 33 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 56259 sent, 51797 reached their opponent, 8603 virtual hits (16.6% of those reached).

## Melee bench: F30

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 294 over 6 battles (49.0 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 76.1 | 54 / 210 | 3.15 | 14.8% | 20894 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.3 | 14.8% | 54 |
| darkcanuck.B26354 1.06 | 2.8 | 13.4% | 39 |
| oog.melee.Capulet 1.2 | 3.0 | 13.2% | 38 |
| catcat20.Matcha 0.006 | 3.2 | 13.4% | 44 |
| stelo.PastFuture 2.3.2 | 4.7 | 11.9% | 18 |
| intruder.PrairieWolf 2.61 | 6.5 | 8.5% | 11 |
| ntc.Opposite 1.5 | 7.3 | 7.7% | 0 |
| tripphippy.Alice 1.1 | 8.0 | 7.3% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 8.2 | 7.1% | 5 |
| GarmBox.Anger 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.7 | 76.5 | 9 / 35 | 3451 |
| 2 | 1 | 63.5 | 79.4 | 13 / 35 | 3517 |
| 3 | 3 | 59.9 | 68.6 | 6 / 35 | 3200 |
| 4 | 1 | 63.7 | 79.4 | 10 / 35 | 3651 |
| 5 | 1 | 63.3 | 76.8 | 11 / 35 | 3606 |
| 6 | 1 | 61.8 | 75.9 | 5 / 35 | 3469 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 26 | 46% |
| oog.melee.Capulet 1.2 | 22 | 45% |
| catcat20.Matcha 0.006 | 20 | 50% |
| stelo.PastFuture 2.3.2 | 14 | 50% |
| fowl3628800.LightningBolt 2.6.0 | 8 | 75% |
| tripphippy.Alice 1.1 | 6 | 100% |
| ntc.Opposite 1.5 | 3 | 100% |
| intruder.PrairieWolf 2.61 | 2 | 0% |

Hadur died in 158 of 210 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 36 | 23% | 50 |
| oog.melee.Capulet 1.2 | 34 | 22% | 46 |
| stelo.PastFuture 2.3.2 | 32 | 20% | 39 |
| catcat20.Matcha 0.006 | 30 | 19% | 40 |
| intruder.PrairieWolf 2.61 | 10 | 6% | 10 |
| ntc.Opposite 1.5 | 5 | 3% | 8 |
| fowl3628800.LightningBolt 2.6.0 | 4 | 3% | 9 |
| tripphippy.Alice 1.1 | 4 | 3% | 7 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 162115 melee ticks, 27779 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 54 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 53116 sent, 48397 reached their opponent, 8209 virtual hits (17.0% of those reached).

## Melee bench: F31

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 273 over 6 battles (45.5 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 75.2 | 44 / 210 | 3.23 | 14.2% | 17441 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.3% | 96 |
| hadur2.Hadur 3.17.1ef | 2.3 | 14.2% | 44 |
| gh.mini.Griezel 0.2 | 2.7 | 13.8% | 51 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 10.9% | 12 |
| d414.nano.Quantum 1.0.0 | 4.7 | 11.4% | 6 |
| gh.nano.Grofvuil 0.2 | 5.7 | 8.8% | 2 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.9% | 3 |
| fm.mammillarias 1.3 | 7.8 | 5.9% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.5 | 4.8% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.6 | 71.4 | 4 / 35 | 2589 |
| 2 | 2 | 62.8 | 76.8 | 12 / 35 | 3159 |
| 3 | 3 | 59.8 | 70.8 | 4 / 35 | 2726 |
| 4 | 2 | 62.0 | 76.5 | 6 / 35 | 2848 |
| 5 | 2 | 62.3 | 75.9 | 7 / 35 | 3118 |
| 6 | 2 | 63.4 | 80.0 | 11 / 35 | 3001 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 43 | 37% |
| gh.mini.Griezel 0.2 | 31 | 35% |
| spinnercat.micro.Tyger 0.1 | 9 | 67% |
| d414.nano.Quantum 1.0.0 | 8 | 88% |
| timmit.nano.TimDog 0.33 | 4 | 75% |
| gh.nano.Grofvuil 0.2 | 1 | 100% |

Hadur died in 169 of 210 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 63 | 37% | 78 |
| gh.mini.Griezel 0.2 | 40 | 24% | 51 |
| d414.nano.Quantum 1.0.0 | 18 | 11% | 25 |
| spinnercat.micro.Tyger 0.1 | 17 | 10% | 22 |
| timmit.nano.TimDog 0.33 | 11 | 7% | 13 |
| gh.nano.Grofvuil 0.2 | 10 | 6% | 13 |
| fm.mammillarias 1.3 | 5 | 3% | 5 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 153068 melee ticks, 27103 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 31 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 50328 sent, 45594 reached their opponent, 7623 virtual hits (16.7% of those reached).

## Melee bench: F32

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 425 over 6 battles (70.8 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 86.5 | 118 / 210 | 2.22 | 17.5% | 23797 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 17.5% | 118 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.8% | 56 |
| apc.botM 3.0 | 3.0 | 12.1% | 17 |
| lxx.ConceptA 0.8 | 4.5 | 10.5% | 4 |
| vjik.UnViolation 1.1 | 5.0 | 9.4% | 6 |
| bayen.UbaMicro 1.4 | 6.2 | 9.0% | 3 |
| yk.JahMicro 1.0 | 7.0 | 7.6% | 4 |
| panzer.Panzer 0.2 | 7.3 | 7.6% | 0 |
| conscience.Electron 1.3g | 9.2 | 6.1% | 0 |
| donjezza.Jezza 1.0 | 9.8 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 88.6 | 24 / 35 | 4397 |
| 2 | 1 | 65.7 | 84.8 | 19 / 35 | 3748 |
| 3 | 1 | 64.3 | 83.2 | 16 / 35 | 3390 |
| 4 | 1 | 66.4 | 85.7 | 18 / 35 | 4218 |
| 5 | 1 | 67.9 | 90.5 | 23 / 35 | 4133 |
| 6 | 1 | 65.9 | 86.0 | 18 / 35 | 3911 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 73 | 56% |
| apc.botM 3.0 | 32 | 78% |
| lxx.ConceptA 0.8 | 14 | 93% |
| vjik.UnViolation 1.1 | 12 | 75% |
| yk.JahMicro 1.0 | 11 | 100% |
| bayen.UbaMicro 1.4 | 8 | 100% |
| donjezza.Jezza 1.0 | 7 | 100% |
| panzer.Panzer 0.2 | 3 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 41 | 43% | 80 |
| apc.botM 3.0 | 14 | 15% | 45 |
| lxx.ConceptA 0.8 | 13 | 14% | 22 |
| bayen.UbaMicro 1.4 | 9 | 9% | 17 |
| vjik.UnViolation 1.1 | 7 | 7% | 22 |
| panzer.Panzer 0.2 | 7 | 7% | 10 |
| yk.JahMicro 1.0 | 2 | 2% | 7 |
| conscience.Electron 1.3g | 0 | 0% | 4 |
| donjezza.Jezza 1.0 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 129799 melee ticks, 48395 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 41 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 44302 sent, 39798 reached their opponent, 7734 virtual hits (19.4% of those reached).

## Melee bench: F33

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 551 over 6 battles (91.8 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 86.9 | 116 / 210 | 2.18 | 18.4% | 26278 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 18.4% | 116 |
| maribo.Quester 0.3 | 2.0 | 16.6% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.3% | 21 |
| gre.svman4.Leonidas 1.3.2 | 3.8 | 11.3% | 10 |
| labg.Cataclysm 2.05 | 5.3 | 10.0% | 13 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.2 | 8.9% | 6 |
| baal.nano.N 1.42 | 6.5 | 8.9% | 2 |
| zyx.micro.Ant 1.1 | 8.2 | 5.3% | 0 |
| sanja.First 0.1 | 9.0 | 4.6% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 82.9 | 18 / 35 | 4431 |
| 2 | 1 | 66.9 | 82.9 | 17 / 35 | 4119 |
| 3 | 1 | 70.0 | 91.4 | 21 / 35 | 4546 |
| 4 | 1 | 69.6 | 90.2 | 23 / 35 | 4314 |
| 5 | 1 | 68.5 | 87.6 | 19 / 35 | 4542 |
| 6 | 1 | 68.1 | 86.7 | 18 / 35 | 4326 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 62 | 77% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 70% |
| gre.svman4.Leonidas 1.3.2 | 29 | 100% |
| kinsen.melee.Angsaichmophobia 1.8c | 12 | 75% |
| labg.Cataclysm 2.05 | 10 | 70% |
| sanja.First 0.1 | 3 | 67% |
| baal.nano.N 1.42 | 1 | 0% |

Hadur died in 98 of 210 rounds, at a mean tick of 1001. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 34 | 35% | 79 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 18% | 47 |
| labg.Cataclysm 2.05 | 14 | 14% | 22 |
| gre.svman4.Leonidas 1.3.2 | 13 | 13% | 32 |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 9% | 18 |
| zyx.micro.Ant 1.1 | 3 | 3% | 4 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 3 |
| baal.nano.N 1.42 | 1 | 1% | 3 |
| sanja.First 0.1 | 1 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 175435 melee ticks, 48039 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 65 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 56572 sent, 52036 reached their opponent, 8387 virtual hits (16.1% of those reached).

## Melee bench: F34

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 301 over 6 battles (50.2 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 87.0 | 87 / 210 | 2.17 | 17.6% | 26926 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.2 | 17.6% | 87 |
| kid.Gladiator .7.2 | 2.2 | 17.0% | 46 |
| stelo.Spread 0.9 | 2.7 | 16.4% | 63 |
| jcs.Seth 1.8 | 4.5 | 11.0% | 9 |
| tcf.Reach 3 | 5.2 | 10.3% | 2 |
| cli.Dancer 1.1 | 5.3 | 9.8% | 3 |
| ratosh.Wesco 1.4 | 7.0 | 6.8% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.7% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.4% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 87.0 | 13 / 35 | 4586 |
| 2 | 2 | 68.2 | 89.5 | 14 / 35 | 4249 |
| 3 | 1 | 67.4 | 84.4 | 13 / 35 | 4481 |
| 4 | 1 | 67.9 | 86.3 | 14 / 35 | 4294 |
| 5 | 1 | 68.7 | 87.9 | 15 / 35 | 4816 |
| 6 | 1 | 68.2 | 87.0 | 18 / 35 | 4500 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 62 | 53% |
| kid.Gladiator .7.2 | 59 | 54% |
| jcs.Seth 1.8 | 16 | 69% |
| cli.Dancer 1.1 | 8 | 88% |
| tcf.Reach 3 | 5 | 60% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 1093. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 57 | 45% | 82 |
| stelo.Spread 0.9 | 50 | 40% | 84 |
| cli.Dancer 1.1 | 8 | 6% | 14 |
| jcs.Seth 1.8 | 6 | 5% | 22 |
| tcf.Reach 3 | 2 | 2% | 7 |
| ratosh.Wesco 1.4 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 176376 melee ticks, 52248 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 77 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 77 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 54906 sent, 50340 reached their opponent, 8871 virtual hits (17.6% of those reached).

## Melee bench: F35

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 488 over 6 battles (81.3 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 81.5 | 37 / 210 | 2.67 | 15.3% | 20278 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.5% | 138 |
| hadur2.Hadur 3.17.1ef | 2.2 | 15.3% | 37 |
| gh.mini.Gruwel 0.9 | 2.8 | 13.3% | 25 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 12.0% | 8 |
| rz.HawkOnFire 0.1 | 4.7 | 11.5% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6.5 | 6.7% | 0 |
| wit.Chuliath 1.0 | 6.7 | 6.6% | 1 |
| myl.nano.KomoriNinja 1.1 | 7.8 | 6.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.5% | 0 |
| dans.Cinnamon 1.2 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.3 | 81.6 | 9 / 35 | 3530 |
| 2 | 2 | 64.1 | 80.0 | 6 / 35 | 3514 |
| 3 | 3 | 61.9 | 74.9 | 4 / 35 | 3133 |
| 4 | 2 | 64.9 | 83.8 | 6 / 35 | 3465 |
| 5 | 2 | 65.1 | 84.4 | 8 / 35 | 3329 |
| 6 | 2 | 64.2 | 84.1 | 4 / 35 | 3307 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 81 | 22% |
| gh.mini.Gruwel 0.9 | 20 | 35% |
| dmh.robocode.robot.BlackDeath 9.2 | 9 | 67% |
| rz.HawkOnFire 0.1 | 6 | 83% |
| wit.Chuliath 1.0 | 2 | 50% |

Hadur died in 177 of 210 rounds, at a mean tick of 944. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 101 | 57% | 122 |
| gh.mini.Gruwel 0.9 | 24 | 14% | 30 |
| dmh.robocode.robot.BlackDeath 9.2 | 20 | 11% | 26 |
| rz.HawkOnFire 0.1 | 18 | 10% | 21 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6 | 3% | 6 |
| wit.Chuliath 1.0 | 2 | 1% | 3 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 1 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 146961 melee ticks, 47838 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 31 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 46844 sent, 42214 reached their opponent, 7196 virtual hits (17.0% of those reached).

## Melee bench: F36

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 219 over 6 battles (36.5 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 91.4 | 146 / 210 | 1.78 | 19.7% | 28309 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 19.7% | 146 |
| alpha.RainingFire 1.0 | 2.8 | 12.5% | 18 |
| bzdp.Pansy 2.1 | 3.0 | 12.1% | 14 |
| mz.Cork 0.1 | 3.7 | 11.6% | 12 |
| bvh.micro.Freya 0.3 | 5.0 | 10.9% | 12 |
| bvh.mini.Fenrir 0.39 | 5.8 | 9.8% | 1 |
| m3thos.Eva02 0.7.1 | 6.7 | 9.3% | 6 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 5.5% | 1 |
| dl.BetterWalls 1.0 | 8.8 | 4.8% | 0 |
| sample.MyFirstRobot 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 91.1 | 24 / 35 | 4568 |
| 2 | 1 | 69.6 | 90.8 | 24 / 35 | 4653 |
| 3 | 1 | 69.6 | 92.4 | 23 / 35 | 4685 |
| 4 | 1 | 69.3 | 88.6 | 21 / 35 | 4880 |
| 5 | 1 | 70.5 | 93.7 | 26 / 35 | 4827 |
| 6 | 1 | 70.3 | 91.7 | 28 / 35 | 4696 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.Cork 0.1 | 42 | 81% |
| bzdp.Pansy 2.1 | 35 | 86% |
| bvh.micro.Freya 0.3 | 34 | 76% |
| alpha.RainingFire 1.0 | 30 | 87% |
| m3thos.Eva02 0.7.1 | 17 | 88% |
| bvh.mini.Fenrir 0.39 | 11 | 100% |
| sample.MyFirstRobot 1.0 | 2 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 871. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.Cork 0.1 | 13 | 20% | 48 |
| alpha.RainingFire 1.0 | 12 | 18% | 38 |
| bvh.micro.Freya 0.3 | 12 | 18% | 33 |
| bzdp.Pansy 2.1 | 11 | 17% | 42 |
| m3thos.Eva02 0.7.1 | 7 | 11% | 27 |
| bvh.mini.Fenrir 0.39 | 7 | 11% | 15 |
| squidM.TentalceMeleeNano 1.1 | 2 | 3% | 2 |
| dl.BetterWalls 1.0 | 0 | 0% | 3 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 150089 melee ticks, 48197 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 40 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 51343 sent, 47084 reached their opponent, 10037 virtual hits (21.3% of those reached).

## Melee bench: F37

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 140 over 6 battles (23.3 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 89.0 | 156 / 210 | 1.99 | 18.9% | 30570 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 18.9% | 156 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.7 | 11.0% | 5 |
| germ.TheMind .2 | 2.8 | 10.6% | 7 |
| EBBU.Sim2 1.02 | 5.0 | 9.7% | 6 |
| agrach.Dalek 1.0 | 5.2 | 9.5% | 15 |
| stelo.UntouchableNano 1.3 | 7.0 | 8.3% | 2 |
| lmk.ACPFinal 0.1 | 7.2 | 8.8% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 7.5 | 7.8% | 0 |
| mb.Beast 0.1 | 7.7 | 8.2% | 9 |
| skm.Ryubot 1.0 | 9.0 | 7.2% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 93.3 | 28 / 35 | 5252 |
| 2 | 1 | 67.8 | 87.9 | 27 / 35 | 4887 |
| 3 | 1 | 68.9 | 90.2 | 27 / 35 | 5623 |
| 4 | 1 | 66.1 | 83.5 | 24 / 35 | 4767 |
| 5 | 1 | 67.6 | 89.8 | 25 / 35 | 4939 |
| 6 | 1 | 68.0 | 89.5 | 25 / 35 | 5102 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 30 | 97% |
| agrach.Dalek 1.0 | 28 | 89% |
| mb.Beast 0.1 | 22 | 91% |
| com.syncleus.robocode.Dreadnaught 0.1 | 20 | 90% |
| lmk.ACPFinal 0.1 | 19 | 89% |
| stelo.UntouchableNano 1.3 | 19 | 100% |
| EBBU.Sim2 1.02 | 17 | 82% |
| skm.Ryubot 1.0 | 13 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 484. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| EBBU.Sim2 1.02 | 11 | 20% | 24 |
| com.syncleus.robocode.Dreadnaught 0.1 | 9 | 17% | 40 |
| mb.Beast 0.1 | 8 | 15% | 28 |
| mn.nano.perceptual.Impact 1.3.0 | 8 | 15% | 9 |
| germ.TheMind .2 | 6 | 11% | 24 |
| agrach.Dalek 1.0 | 4 | 7% | 40 |
| lmk.ACPFinal 0.1 | 4 | 7% | 24 |
| stelo.UntouchableNano 1.3 | 3 | 6% | 15 |
| skm.Ryubot 1.0 | 1 | 2% | 4 |

Posture (Hadur's M records, 200 rounds): 97527 melee ticks, 26418 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 49 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 33180 sent, 29210 reached their opponent, 9261 virtual hits (31.7% of those reached).

## Melee bench: F38

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 329 over 6 battles (54.8 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 82.7 | 93 / 210 | 2.56 | 16.5% | 22558 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.3 | 16.5% | 93 |
| justin.Mallais 14.0 | 1.7 | 15.9% | 59 |
| bvh.mini.Freya 0.55 | 3.0 | 12.9% | 18 |
| bts.mega.Gnarly 1.4 | 4.2 | 11.9% | 24 |
| cs.Wren 1.0 | 5.0 | 10.8% | 4 |
| kdf.KoulDestroyer 1.0 | 6.0 | 9.0% | 6 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.2 | 8.5% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.7 | 6.9% | 5 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.3% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 82.5 | 15 / 35 | 3698 |
| 2 | 2 | 64.3 | 79.7 | 13 / 35 | 3567 |
| 3 | 2 | 65.1 | 82.9 | 14 / 35 | 3588 |
| 4 | 1 | 65.5 | 81.0 | 16 / 35 | 3806 |
| 5 | 1 | 65.9 | 83.8 | 16 / 35 | 3949 |
| 6 | 1 | 67.2 | 86.3 | 19 / 35 | 3950 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 56 | 61% |
| bts.mega.Gnarly 1.4 | 21 | 86% |
| bvh.mini.Freya 0.55 | 18 | 61% |
| cs.Wren 1.0 | 15 | 87% |
| kawigi.spare.SpareParts 0.7.6nosnd | 11 | 73% |
| kdf.KoulDestroyer 1.0 | 6 | 83% |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 67% |
| matt.UnderDark3 2.4.34 | 2 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 746. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 43 | 36% | 80 |
| bts.mega.Gnarly 1.4 | 24 | 20% | 46 |
| bvh.mini.Freya 0.55 | 18 | 15% | 24 |
| cs.Wren 1.0 | 13 | 11% | 24 |
| kdf.KoulDestroyer 1.0 | 9 | 8% | 14 |
| davidalves.net.DuelistNanoMelee 1.01 | 6 | 5% | 8 |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 3% | 13 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 139165 melee ticks, 34410 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 46 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 46493 sent, 41894 reached their opponent, 9360 virtual hits (22.3% of those reached).

## Melee bench: F39

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 422 over 6 battles (70.3 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 86.4 | 104 / 210 | 2.22 | 17.7% | 26140 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 17.7% | 104 |
| bvh.fry.Freya 0.82 | 2.0 | 14.7% | 20 |
| catcat20.Lambda 0.024 | 3.5 | 11.9% | 23 |
| az.Ololobot 0.2.4 | 3.5 | 12.7% | 55 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 8.3% | 2 |
| gimp.GimpBot 0.1 | 6.3 | 7.9% | 2 |
| apollokidd.ApolloKidd 0.9 | 6.7 | 8.0% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 7.0 | 7.6% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 6.1% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 85.1 | 13 / 35 | 4250 |
| 2 | 1 | 67.5 | 88.3 | 19 / 35 | 4455 |
| 3 | 1 | 67.3 | 87.9 | 18 / 35 | 4460 |
| 4 | 1 | 67.5 | 87.6 | 22 / 35 | 4426 |
| 5 | 1 | 66.3 | 85.7 | 16 / 35 | 4265 |
| 6 | 1 | 66.0 | 83.8 | 16 / 35 | 4284 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 50 | 40% |
| bvh.fry.Freya 0.82 | 44 | 91% |
| catcat20.Lambda 0.024 | 34 | 68% |
| winamp32.micro.MicroMacro 1.0 | 9 | 89% |
| gimp.GimpBot 0.1 | 5 | 80% |
| stelo.SoRobotNanoMelee 1.2 | 5 | 80% |
| apollokidd.ApolloKidd 0.9 | 3 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 1048. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 36 | 33% | 64 |
| az.Ololobot 0.2.4 | 35 | 32% | 62 |
| catcat20.Lambda 0.024 | 22 | 20% | 40 |
| gimp.GimpBot 0.1 | 4 | 4% | 11 |
| apollokidd.ApolloKidd 0.9 | 4 | 4% | 7 |
| winamp32.micro.MicroMacro 1.0 | 3 | 3% | 16 |
| stelo.SoRobotNanoMelee 1.2 | 3 | 3% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 5 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 167698 melee ticks, 50875 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 43 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 54062 sent, 49420 reached their opponent, 9405 virtual hits (19.0% of those reached).

## Melee bench: F40

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 193 over 6 battles (32.2 per battle, most in one battle 117). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 87.4 | 115 / 210 | 2.14 | 18.3% | 25534 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 18.3% | 115 |
| kawigi.mini.Coriantumr 1.1 | 2.2 | 14.9% | 42 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.4% | 17 |
| mz.AntiGrav 1.0 | 4.5 | 11.2% | 8 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.8% | 14 |
| stelo.Randomness 1.0 | 5.8 | 9.4% | 9 |
| alpha.BlackIce 1.0 | 6.3 | 8.7% | 5 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.3% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 4.3% | 0 |
| sample.Corners 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 85.1 | 16 / 35 | 4299 |
| 2 | 1 | 69.4 | 89.2 | 23 / 35 | 4483 |
| 3 | 1 | 66.7 | 83.5 | 16 / 35 | 4068 |
| 4 | 1 | 69.1 | 89.2 | 19 / 35 | 4686 |
| 5 | 1 | 69.1 | 90.8 | 23 / 35 | 4329 |
| 6 | 1 | 67.1 | 86.3 | 18 / 35 | 3669 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 48 | 65% |
| kano.gamma.KanoGamma 1.8 | 40 | 85% |
| stelo.Randomness 1.0 | 18 | 78% |
| mz.AntiGrav 1.0 | 18 | 100% |
| Polkwane.SmashMelee 1.0 | 13 | 69% |
| alpha.BlackIce 1.0 | 7 | 71% |
| sample.Corners 1.0 | 2 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 837. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 41 | 42% | 67 |
| kano.gamma.KanoGamma 1.8 | 17 | 18% | 54 |
| stelo.Randomness 1.0 | 13 | 13% | 29 |
| Polkwane.SmashMelee 1.0 | 11 | 11% | 22 |
| mz.AntiGrav 1.0 | 9 | 9% | 18 |
| alpha.BlackIce 1.0 | 3 | 3% | 9 |
| amk.superstrike.SuperStrike 0.3 | 1 | 1% | 4 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 3 |
| sample.Corners 1.0 | 0 | 0% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 157816 melee ticks, 37263 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 74 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 74 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 52705 sent, 47960 reached their opponent, 10612 virtual hits (22.1% of those reached).

## Melee bench: F41

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 409 over 6 battles (68.2 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 85.0 | 86 / 210 | 2.35 | 16.8% | 21882 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.5 | 16.6% | 82 |
| hadur2.Hadur 3.17.1ef | 1.5 | 16.8% | 86 |
| ary.Swarm 1.1 | 3.2 | 13.3% | 16 |
| lessonz.robocode.Oz 0.5.0 | 4.2 | 12.5% | 13 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 11.2% | 10 |
| shrub.Silver v048 | 5.8 | 9.4% | 3 |
| zyx.nano.Ant 1.1 | 7.0 | 7.3% | 0 |
| jsal.Jsalbot 1.0 | 8.0 | 5.8% | 1 |
| stelo.Mirror 1.1 | 9.0 | 5.1% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 83.5 | 15 / 35 | 3516 |
| 2 | 1 | 66.9 | 86.7 | 14 / 35 | 3728 |
| 3 | 1 | 67.7 | 87.3 | 18 / 35 | 3914 |
| 4 | 2 | 65.3 | 82.5 | 11 / 35 | 3510 |
| 5 | 2 | 65.8 | 82.9 | 13 / 35 | 3744 |
| 6 | 1 | 66.5 | 87.0 | 15 / 35 | 3470 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 75 | 37% |
| lessonz.robocode.Oz 0.5.0 | 24 | 83% |
| ary.Swarm 1.1 | 18 | 83% |
| simonton.nano.MeleeSeed 1.8 | 14 | 86% |
| shrub.Silver v048 | 7 | 86% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 956. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 67 | 52% | 96 |
| ary.Swarm 1.1 | 19 | 15% | 29 |
| lessonz.robocode.Oz 0.5.0 | 15 | 12% | 32 |
| simonton.nano.MeleeSeed 1.8 | 12 | 9% | 25 |
| shrub.Silver v048 | 4 | 3% | 10 |
| jsal.Jsalbot 1.0 | 3 | 2% | 6 |
| stelo.Mirror 1.1 | 2 | 2% | 6 |
| zyx.nano.Ant 1.1 | 2 | 2% | 3 |
| acogdev.alpha 0.2 | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 156287 melee ticks, 47773 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 69 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 69 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 52539 sent, 47898 reached their opponent, 7795 virtual hits (16.3% of those reached).

## Melee bench: F42

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 386 over 6 battles (64.3 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.8 | 118 / 210 | 2.10 | 18.5% | 29122 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 18.5% | 118 |
| wompi.Wallaby 5.1 | 2.0 | 16.2% | 52 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.3% | 11 |
| ara.Shera 0.88 | 3.5 | 13.6% | 26 |
| amz.NanoClone 1.41 | 5.0 | 8.9% | 1 |
| maribo.IotaCT 1.1 | 7.2 | 6.4% | 0 |
| dsw.StaticD 1.0 | 7.2 | 6.6% | 2 |
| stelo.MirrorMicro 1.0 | 7.7 | 5.9% | 0 |
| mme.NikeEnhanced 2.0 | 8.0 | 5.9% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 86.7 | 21 / 35 | 4969 |
| 2 | 1 | 68.7 | 90.5 | 18 / 35 | 4992 |
| 3 | 1 | 67.6 | 84.8 | 19 / 35 | 4780 |
| 4 | 1 | 69.4 | 90.8 | 22 / 35 | 4919 |
| 5 | 1 | 67.4 | 84.8 | 19 / 35 | 4550 |
| 6 | 1 | 68.9 | 89.2 | 19 / 35 | 4912 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 89 | 79% |
| maribo.mini.MiniQuester 0.1 | 33 | 88% |
| ara.Shera 0.88 | 24 | 63% |
| dsw.StaticD 1.0 | 2 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 919. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 36 | 37% | 94 |
| ara.Shera 0.88 | 27 | 28% | 47 |
| maribo.mini.MiniQuester 0.1 | 19 | 20% | 48 |
| amz.NanoClone 1.41 | 7 | 7% | 8 |
| dsw.StaticD 1.0 | 3 | 3% | 5 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 2 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 2 |
| maribo.IotaCT 1.1 | 0 | 0% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 166817 melee ticks, 47739 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 55 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 53475 sent, 49095 reached their opponent, 10171 virtual hits (20.7% of those reached).

## Melee bench: F43

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 690 over 6 battles (115.0 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 79.9 | 39 / 210 | 2.80 | 15.2% | 20265 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.6% | 143 |
| hadur2.Hadur 3.17.1ef | 2.0 | 15.2% | 39 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.5% | 21 |
| dummy.micro.Sparrow 2.5 | 4.2 | 11.7% | 3 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.8% | 3 |
| Krabb.akim2.Akim2 1.1b | 5.7 | 9.6% | 0 |
| mz.NanoGod 2.02 | 7.3 | 7.5% | 2 |
| jab.DiamondStealer 5 | 7.7 | 7.6% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.0% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 75.9 | 4 / 35 | 3007 |
| 2 | 2 | 66.1 | 83.8 | 10 / 35 | 3502 |
| 3 | 2 | 64.4 | 77.5 | 7 / 35 | 3407 |
| 4 | 2 | 65.1 | 81.3 | 7 / 35 | 3395 |
| 5 | 2 | 64.7 | 79.4 | 6 / 35 | 3359 |
| 6 | 2 | 65.3 | 81.9 | 5 / 35 | 3595 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 83 | 14% |
| brainfade.melee.Dusk 0.44 | 18 | 56% |
| dummy.micro.Sparrow 2.5 | 7 | 86% |
| Krabb.akim2.Akim2 1.1b | 5 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 100% |
| mz.NanoGod 2.02 | 2 | 50% |
| cvt.Firsty 1.0 | 1 | 100% |

Hadur died in 177 of 210 rounds, at a mean tick of 981. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 102 | 58% | 118 |
| brainfade.melee.Dusk 0.44 | 28 | 16% | 37 |
| wcsv.melee.EngineerMelee 0.1 | 14 | 8% | 17 |
| dummy.micro.Sparrow 2.5 | 12 | 7% | 18 |
| jab.DiamondStealer 5 | 7 | 4% | 8 |
| Krabb.akim2.Akim2 1.1b | 4 | 2% | 5 |
| mz.NanoGod 2.02 | 3 | 2% | 6 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 160215 melee ticks, 49284 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 39 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 51819 sent, 47132 reached their opponent, 8279 virtual hits (17.6% of those reached).

## Melee bench: F44

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 290 over 6 battles (48.3 per battle, most in one battle 117). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 91.5 | 141 / 210 | 1.77 | 20.0% | 31116 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 20.0% | 141 |
| stelo.Liblix 0.3.1 | 2.2 | 15.3% | 39 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.4% | 19 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.5 | 9.6% | 1 |
| jwirde.Gort 2.0 | 4.5 | 9.8% | 3 |
| wompi.Quokka 1.6 | 6.5 | 7.5% | 1 |
| disan.Chair 2.2.0 | 6.7 | 7.9% | 5 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.8% | 0 |
| sample.Crazy 1.0 | 9.0 | 4.9% | 1 |
| amk.jointstrike.JointStrike 0.2 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 89.2 | 23 / 35 | 5262 |
| 2 | 1 | 70.5 | 91.4 | 26 / 35 | 5157 |
| 3 | 1 | 70.8 | 93.3 | 25 / 35 | 5339 |
| 4 | 1 | 69.5 | 87.9 | 24 / 35 | 5064 |
| 5 | 1 | 70.5 | 92.4 | 21 / 35 | 5150 |
| 6 | 1 | 70.7 | 94.6 | 22 / 35 | 5144 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 77 | 66% |
| tzu.TheArtOfWar 1.2 | 62 | 90% |
| jwirde.Gort 2.0 | 16 | 94% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 9 | 89% |
| sample.Crazy 1.0 | 4 | 100% |
| disan.Chair 2.2.0 | 4 | 100% |
| wompi.Quokka 1.6 | 3 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 897. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 36 | 51% | 101 |
| tzu.TheArtOfWar 1.2 | 17 | 24% | 57 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 7% | 10 |
| jwirde.Gort 2.0 | 3 | 4% | 25 |
| disan.Chair 2.2.0 | 3 | 4% | 6 |
| wompi.Quokka 1.6 | 2 | 3% | 5 |
| stf.PanzerGeneral 0.1 | 2 | 3% | 4 |
| sample.Crazy 1.0 | 1 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 160600 melee ticks, 47350 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 48 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 56030 sent, 51577 reached their opponent, 11375 virtual hits (22.1% of those reached).

## Melee bench: F45

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 719 over 6 battles (119.8 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 86.6 | 88 / 210 | 2.21 | 18.6% | 29054 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 18.6% | 88 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 12.5% | 89 |
| jje.BagPuss 1.2 | 2.8 | 11.9% | 8 |
| sul.Lunar 1.1 | 4.3 | 10.9% | 11 |
| myl.nano.Graviton 1.10 | 5.0 | 10.3% | 4 |
| hvilela.HVilela 0.9 | 6.3 | 9.0% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 6.8 | 8.5% | 5 |
| fm.claire 1.7 | 7.3 | 8.3% | 3 |
| wit.Deep7 2.0 | 9.0 | 5.6% | 3 |
| abud.ThirdRobo 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 87.9 | 16 / 35 | 5522 |
| 2 | 1 | 66.3 | 82.9 | 11 / 35 | 4549 |
| 3 | 1 | 66.7 | 82.9 | 15 / 35 | 4525 |
| 4 | 1 | 68.3 | 88.6 | 16 / 35 | 4663 |
| 5 | 1 | 68.1 | 87.9 | 15 / 35 | 4783 |
| 6 | 1 | 68.5 | 89.2 | 15 / 35 | 5012 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 95 | 43% |
| jje.BagPuss 1.2 | 17 | 82% |
| myl.nano.Graviton 1.10 | 14 | 93% |
| sul.Lunar 1.1 | 10 | 70% |
| pez.mini.ChironexFleckeri 0.5 | 7 | 71% |
| fm.claire 1.7 | 6 | 50% |
| wit.Deep7 2.0 | 6 | 83% |

Hadur died in 128 of 210 rounds, at a mean tick of 1589. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 55 | 43% | 0 |
| jje.BagPuss 1.2 | 20 | 16% | 61 |
| sul.Lunar 1.1 | 15 | 12% | 61 |
| myl.nano.Graviton 1.10 | 11 | 9% | 35 |
| pez.mini.ChironexFleckeri 0.5 | 8 | 6% | 19 |
| fm.claire 1.7 | 6 | 5% | 15 |
| wit.Deep7 2.0 | 4 | 3% | 4 |
| abud.ThirdRobo 1.0 | 2 | 2% | 4 |
| hvilela.HVilela 0.9 | 1 | 1% | 10 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 211782 melee ticks, 94121 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 62 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 65203 sent, 60564 reached their opponent, 9783 virtual hits (16.2% of those reached).

## Melee bench: F46

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 712 over 6 battles (118.7 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 82.0 | 60 / 210 | 2.62 | 15.9% | 23102 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.3% | 75 |
| kc.mini.Mirage 0.2 | 2.0 | 16.6% | 54 |
| hadur2.Hadur 3.17.1ef | 2.2 | 15.9% | 60 |
| mz.MicroSheep 1.0 | 4.7 | 10.2% | 2 |
| cx.Princess 1.0 | 4.8 | 10.1% | 15 |
| sadoner.killer 0.2 | 5.5 | 9.6% | 4 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.9% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.3 | 5.6% | 0 |
| kurios.DOSexe .9a | 8.7 | 5.2% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.8 | 81.0 | 10 / 35 | 3598 |
| 2 | 2 | 66.4 | 83.8 | 13 / 35 | 4119 |
| 3 | 2 | 65.0 | 83.5 | 9 / 35 | 3741 |
| 4 | 3 | 64.0 | 80.0 | 5 / 35 | 3923 |
| 5 | 2 | 64.7 | 79.4 | 12 / 35 | 3903 |
| 6 | 1 | 65.4 | 84.1 | 11 / 35 | 3818 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 70 | 57% |
| rsalesc.melee.Medina 0.4.5 | 30 | 27% |
| cx.Princess 1.0 | 14 | 43% |
| mz.MicroSheep 1.0 | 3 | 100% |
| arthord.NanoSatanMelee Beta | 2 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 156 of 210 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 59 | 38% | 97 |
| rsalesc.melee.Medina 0.4.5 | 53 | 34% | 63 |
| cx.Princess 1.0 | 12 | 8% | 18 |
| arthord.NanoSatanMelee Beta | 9 | 6% | 13 |
| sadoner.killer 0.2 | 9 | 6% | 10 |
| mz.MicroSheep 1.0 | 6 | 4% | 7 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |
| kurios.DOSexe .9a | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 152157 melee ticks, 42244 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 32 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 46039 sent, 41419 reached their opponent, 6939 virtual hits (16.8% of those reached).

