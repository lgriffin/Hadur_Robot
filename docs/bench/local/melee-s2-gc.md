# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 322 over 6 battles (53.7 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 83.4 | 45 / 210 | 2.50 | 16.2% | 26818 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.3% | 146 |
| hadur2.Hadur 3.17.1gc | 2.0 | 16.2% | 45 |
| sgp.JollyNinja 3.53 | 3.5 | 11.3% | 12 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.8 | 11.0% | 2 |
| mz.MicroGodMelee 1 | 5.3 | 10.1% | 3 |
| lorneswork.Predator 1.0 | 5.3 | 10.2% | 1 |
| adt.Ar2 1.0 | 7.0 | 7.3% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.5 | 5.2% | 0 |
| skm.butterfly 1.0 | 8.7 | 5.0% | 0 |
| mym.EdgeStalker 1.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 81.6 | 6 / 35 | 4235 |
| 2 | 2 | 65.5 | 81.3 | 9 / 35 | 4598 |
| 3 | 2 | 65.5 | 83.8 | 6 / 35 | 4354 |
| 4 | 2 | 65.7 | 83.5 | 9 / 35 | 4534 |
| 5 | 2 | 65.1 | 82.5 | 7 / 35 | 4441 |
| 6 | 2 | 66.8 | 87.6 | 8 / 35 | 4656 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 118 | 12% |
| mz.MicroGodMelee 1 | 14 | 86% |
| sgp.JollyNinja 3.53 | 9 | 78% |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 100% |
| lorneswork.Predator 1.0 | 4 | 75% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 167 of 210 rounds, at a mean tick of 1129. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 119 | 71% | 133 |
| lorneswork.Predator 1.0 | 13 | 8% | 17 |
| sgp.JollyNinja 3.53 | 12 | 7% | 15 |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 6% | 15 |
| mz.MicroGodMelee 1 | 4 | 2% | 18 |
| adt.Ar2 1.0 | 4 | 2% | 5 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 5 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |
| skm.butterfly 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 143807 melee ticks, 81518 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 73 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 46941 sent, 42477 reached their opponent, 9372 virtual hits (22.1% of those reached).

## Melee bench: F02

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 286 over 6 battles (47.7 per battle, most in one battle 152). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 84.9 | 98 / 210 | 2.36 | 17.6% | 25819 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.0 | 17.6% | 98 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 14.0% | 31 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 13.9% | 37 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 11.4% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.2 | 9.7% | 16 |
| sch.Simone 0.3d | 6.7 | 7.8% | 6 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 7.8% | 0 |
| Noran.BitchingElk 0.054 | 7.2 | 8.0% | 17 |
| stelo.PatternRobot 1.0 | 8.8 | 6.1% | 2 |
| fullsail.SweetTea 1.1 | 10.0 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 86.0 | 16 / 35 | 4598 |
| 2 | 1 | 64.8 | 79.7 | 12 / 35 | 4168 |
| 3 | 1 | 69.6 | 90.8 | 22 / 35 | 4687 |
| 4 | 1 | 66.9 | 87.3 | 13 / 35 | 4034 |
| 5 | 1 | 67.4 | 87.6 | 18 / 35 | 4205 |
| 6 | 1 | 65.0 | 78.1 | 17 / 35 | 4127 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 43 | 67% |
| pulsar.PulsarMax 0.8.9 | 42 | 55% |
| com.cohesiva.robocode.ManOwaR 1.0 | 15 | 40% |
| Noran.BitchingElk 0.054 | 15 | 33% |
| sch.Simone 0.3d | 14 | 93% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 93% |
| stelo.PatternRobot 1.0 | 4 | 100% |
| fullsail.SweetTea 1.1 | 3 | 100% |
| fnc.bandit.Bandit 5.2.0 | 2 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 998. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 37 | 33% | 66 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 22 | 19% | 52 |
| Noran.BitchingElk 0.054 | 15 | 13% | 22 |
| com.cohesiva.robocode.ManOwaR 1.0 | 14 | 12% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 9% | 15 |
| stelo.PatternRobot 1.0 | 5 | 4% | 8 |
| sch.Simone 0.3d | 4 | 4% | 17 |
| fnc.bandit.Bandit 5.2.0 | 4 | 4% | 5 |
| fullsail.SweetTea 1.1 | 1 | 1% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 168363 melee ticks, 39234 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 41 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 60932 sent, 56481 reached their opponent, 10243 virtual hits (18.1% of those reached).

## Melee bench: F03

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 121 over 6 battles (20.2 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 89.5 | 143 / 210 | 1.95 | 19.3% | 33999 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.0 | 19.3% | 143 |
| radnor.DoctorBob 1.42 | 2.0 | 14.5% | 32 |
| kawigi.nano.Lib 1.0 | 3.2 | 13.3% | 12 |
| vuen.Cake 2.51 | 3.8 | 12.4% | 19 |
| urdos.URDOS 1.3 | 5.2 | 9.2% | 1 |
| adt.Ar1 2.1 | 6.8 | 7.5% | 2 |
| oa.weak.FlyMk1 0.1 | 7.3 | 6.6% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.7 | 6.2% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.7 | 5.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.3 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 91.1 | 27 / 35 | 5627 |
| 2 | 1 | 67.8 | 87.3 | 18 / 35 | 5453 |
| 3 | 1 | 67.4 | 83.8 | 20 / 35 | 5404 |
| 4 | 1 | 70.8 | 94.6 | 27 / 35 | 5912 |
| 5 | 1 | 68.5 | 87.0 | 24 / 35 | 5483 |
| 6 | 1 | 70.4 | 93.0 | 27 / 35 | 6120 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 68 | 88% |
| radnor.DoctorBob 1.42 | 46 | 98% |
| kawigi.nano.Lib 1.0 | 32 | 91% |
| urdos.URDOS 1.3 | 4 | 75% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |
| adt.Ar1 2.1 | 1 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 22 | 33% | 57 |
| kawigi.nano.Lib 1.0 | 19 | 28% | 55 |
| vuen.Cake 2.51 | 14 | 21% | 69 |
| urdos.URDOS 1.3 | 6 | 9% | 14 |
| bwbaugh.nano.Tirunculus 0.0.0a | 3 | 4% | 3 |
| adt.Ar1 2.1 | 2 | 3% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 1% | 2 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 133633 melee ticks, 39216 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 49 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 40761 sent, 36524 reached their opponent, 9756 virtual hits (26.7% of those reached).

## Melee bench: F04

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 290 over 6 battles (48.3 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 84.4 | 27 / 210 | 2.40 | 16.7% | 29484 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.7% | 169 |
| hadur2.Hadur 3.17.1gc | 2.0 | 16.7% | 27 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.4% | 6 |
| TNT.TNT 0.99.1 | 4.2 | 10.7% | 9 |
| josago.Jorgito 0.16 | 4.8 | 9.8% | 0 |
| css.Delitioner 0.11 | 6.5 | 6.7% | 0 |
| tj.zombie1n 1.0.1 | 6.8 | 6.4% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.5% | 0 |
| spin.Bugstard 0.012b | 9.2 | 4.2% | 0 |
| sp.Nanos.Ember 1.1 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.0 | 86.0 | 9 / 35 | 5179 |
| 2 | 2 | 66.7 | 82.2 | 5 / 35 | 5031 |
| 3 | 2 | 67.1 | 85.7 | 5 / 35 | 4918 |
| 4 | 2 | 66.5 | 85.1 | 0 / 35 | 4827 |
| 5 | 2 | 66.6 | 84.8 | 2 / 35 | 4878 |
| 6 | 2 | 66.3 | 82.9 | 6 / 35 | 4651 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 122 | 9% |
| TNT.TNT 0.99.1 | 12 | 42% |
| apc.LeeroyJenkins2 1.0 | 11 | 73% |
| josago.Jorgito 0.16 | 3 | 100% |

Hadur died in 186 of 210 rounds, at a mean tick of 1285. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 137 | 74% | 149 |
| apc.LeeroyJenkins2 1.0 | 21 | 11% | 28 |
| TNT.TNT 0.99.1 | 12 | 6% | 17 |
| josago.Jorgito 0.16 | 7 | 4% | 10 |
| css.Delitioner 0.11 | 5 | 3% | 5 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 198939 melee ticks, 67973 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 56 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 61687 sent, 57124 reached their opponent, 9325 virtual hits (16.3% of those reached).

## Melee bench: F05

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 384 over 6 battles (64.0 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 74.3 | 18 / 210 | 3.31 | 13.8% | 19626 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 18.6% | 115 |
| justin.DemonicRage 3.4 | 1.7 | 17.8% | 62 |
| hadur2.Hadur 3.17.1gc | 3.2 | 13.8% | 18 |
| wompi.Numbat 2.1 | 3.8 | 12.6% | 9 |
| ms.Ares 0.19 | 5.2 | 9.4% | 2 |
| axeBots.HataMoto 3.09 | 5.8 | 8.9% | 4 |
| supersample.SuperBoxBot 1.0 | 7.2 | 5.8% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.2% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.0% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.8 | 75.2 | 2 / 35 | 3373 |
| 2 | 3 | 63.5 | 78.7 | 4 / 35 | 3479 |
| 3 | 3 | 60.7 | 71.1 | 3 / 35 | 3070 |
| 4 | 3 | 61.5 | 72.7 | 3 / 35 | 3270 |
| 5 | 4 | 61.2 | 72.4 | 0 / 35 | 3340 |
| 6 | 3 | 62.2 | 75.6 | 6 / 35 | 3094 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 44 | 18% |
| cb.fire.Firestarter 2.0f | 29 | 3% |
| wompi.Numbat 2.1 | 10 | 70% |
| axeBots.HataMoto 3.09 | 2 | 100% |

Hadur died in 195 of 210 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 90 | 46% | 97 |
| cb.fire.Firestarter 2.0f | 67 | 34% | 71 |
| wompi.Numbat 2.1 | 22 | 11% | 27 |
| ms.Ares 0.19 | 7 | 4% | 7 |
| axeBots.HataMoto 3.09 | 5 | 3% | 7 |
| supersample.SuperBoxBot 1.0 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 210 rounds): 153612 melee ticks, 31398 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (210 rounds): longest scan gap while four or more were alive 70 ticks (210 rounds over 8); rounds whose longest gap at any count was over 8: 210; robots dropped as dead without a death event: 1.

Targeting waves (210 rounds): 48947 sent, 44181 reached their opponent, 7781 virtual hits (17.6% of those reached).

## Melee bench: F06

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 116 over 6 battles (19.3 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 91.2 | 130 / 210 | 1.80 | 19.4% | 29307 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.0 | 19.4% | 130 |
| jekl.StoneGhost 0.7 | 2.2 | 14.4% | 13 |
| origin.SleepSiphon 1.7b | 3.3 | 12.9% | 37 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.5 | 12.4% | 16 |
| mld.Wisdom 1.0 | 5.0 | 10.2% | 3 |
| gg.Wolverine 2.0 | 6.0 | 8.8% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 6.9% | 6 |
| spinnercat.Omen 1.0 | 8.2 | 6.0% | 0 |
| DBall.NUKE 0.1 | 8.5 | 6.1% | 1 |
| sample.Fire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 91.4 | 20 / 35 | 5107 |
| 2 | 1 | 69.7 | 90.5 | 22 / 35 | 4871 |
| 3 | 1 | 70.5 | 93.7 | 25 / 35 | 5193 |
| 4 | 1 | 69.2 | 89.5 | 22 / 35 | 4938 |
| 5 | 1 | 68.9 | 89.8 | 21 / 35 | 4609 |
| 6 | 1 | 69.3 | 92.1 | 20 / 35 | 4589 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 50 | 90% |
| pe.minimelee.SandboxMiniMelee 1.1 | 40 | 85% |
| origin.SleepSiphon 1.7b | 32 | 66% |
| gg.Wolverine 2.0 | 18 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 9 | 67% |
| mld.Wisdom 1.0 | 6 | 50% |
| DBall.NUKE 0.1 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 915. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 27 | 34% | 64 |
| jekl.StoneGhost 0.7 | 21 | 26% | 59 |
| pe.minimelee.SandboxMiniMelee 1.1 | 18 | 23% | 43 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 9% | 14 |
| mld.Wisdom 1.0 | 5 | 6% | 12 |
| gg.Wolverine 2.0 | 2 | 3% | 13 |
| DBall.NUKE 0.1 | 0 | 0% | 4 |
| spinnercat.Omen 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 153817 melee ticks, 42054 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 40 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 47956 sent, 43634 reached their opponent, 10577 virtual hits (24.2% of those reached).

## Melee bench: F07

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 394 over 6 battles (65.7 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 92.1 | 102 / 210 | 1.71 | 19.5% | 33472 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.3 | 19.5% | 102 |
| rsalesc.melee.Monk 0.3.6c | 1.8 | 18.1% | 59 |
| rtk.Tachikoma 1.0 | 2.8 | 16.3% | 29 |
| franzor.Lizt 1.3.1 | 4.5 | 10.9% | 14 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 10.9% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 7.7% | 0 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.2 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 70.3 | 90.2 | 14 / 35 | 5392 |
| 2 | 1 | 70.9 | 91.4 | 19 / 35 | 5291 |
| 3 | 2 | 70.0 | 91.1 | 13 / 35 | 5316 |
| 4 | 1 | 71.7 | 93.3 | 19 / 35 | 5899 |
| 5 | 1 | 72.1 | 93.7 | 21 / 35 | 6002 |
| 6 | 1 | 70.9 | 92.7 | 16 / 35 | 5572 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 77 | 75% |
| rsalesc.melee.Monk 0.3.6c | 66 | 24% |
| franzor.Lizt 1.3.1 | 21 | 67% |
| oog.melee.CapuletDroid 1.1 | 18 | 78% |

Hadur died in 111 of 210 rounds, at a mean tick of 1486. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 58 | 52% | 87 |
| rtk.Tachikoma 1.0 | 35 | 32% | 90 |
| franzor.Lizt 1.3.1 | 9 | 8% | 5 |
| oog.melee.CapuletDroid 1.1 | 4 | 4% | 24 |
| exauge.GateKeeper 1.1.121g | 2 | 2% | 3 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 198226 melee ticks, 94754 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 32 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 59679 sent, 55243 reached their opponent, 11592 virtual hits (21.0% of those reached).

## Melee bench: F08

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 801 over 6 battles (133.5 per battle, most in one battle 142). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 89.0 | 130 / 210 | 1.99 | 18.7% | 27030 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.0 | 18.7% | 130 |
| tm.Yuugao 1.0 | 2.2 | 13.3% | 30 |
| shrub.Vapour v159 | 3.0 | 12.6% | 26 |
| Krabb.sliNk.Garm 0.9u | 4.7 | 10.4% | 14 |
| com.spp.robocode.MostlyHarmless 010 | 5.3 | 9.6% | 6 |
| jwst.DAD.DarkAndDarker 1.1 | 5.7 | 8.6% | 5 |
| m3thos.Eva00 1.1 | 6.2 | 8.8% | 1 |
| qualidafial.MajorDick 1.0.1 | 8.3 | 6.7% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.2 | 5.8% | 0 |
| SHAM.WOW 1.4 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 87.9 | 20 / 35 | 4585 |
| 2 | 1 | 68.5 | 91.1 | 22 / 35 | 4490 |
| 3 | 1 | 69.0 | 90.5 | 24 / 35 | 4618 |
| 4 | 1 | 68.3 | 89.5 | 20 / 35 | 4654 |
| 5 | 1 | 67.1 | 86.7 | 24 / 35 | 4143 |
| 6 | 1 | 68.0 | 88.3 | 20 / 35 | 4540 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 57 | 82% |
| shrub.Vapour v159 | 32 | 66% |
| Krabb.sliNk.Garm 0.9u | 27 | 70% |
| com.spp.robocode.MostlyHarmless 010 | 21 | 95% |
| jwst.DAD.DarkAndDarker 1.1 | 16 | 88% |
| m3thos.Eva00 1.1 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 884. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 23 | 26% | 43 |
| tm.Yuugao 1.0 | 22 | 25% | 65 |
| Krabb.sliNk.Garm 0.9u | 16 | 18% | 30 |
| com.spp.robocode.MostlyHarmless 010 | 6 | 7% | 26 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 6% | 22 |
| m3thos.Eva00 1.1 | 3 | 3% | 14 |
| SHAM.WOW 1.4 | 3 | 3% | 4 |
| zyx.nano.BacillusComma 1.0 | 2 | 2% | 5 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 150475 melee ticks, 44407 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 55 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 49814 sent, 45296 reached their opponent, 9286 virtual hits (20.5% of those reached).

## Melee bench: F09

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 400 over 6 battles (66.7 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 75.8 | 55 / 210 | 3.18 | 14.9% | 20167 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.2% | 93 |
| hadur2.Hadur 3.17.1gc | 2.3 | 14.9% | 55 |
| kc.micro.Figment 1.0 | 2.5 | 15.1% | 38 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.0% | 8 |
| yagami.Tidus 0.11 | 5.0 | 10.2% | 1 |
| mc2.enemy.Original 0.9 | 5.3 | 9.7% | 14 |
| dft.Calliope 5.6 | 6.8 | 7.8% | 1 |
| step.nanoPri 1.0 | 8.0 | 5.8% | 0 |
| rdm.Dueler 0.4x | 9.3 | 4.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 78.7 | 10 / 35 | 3327 |
| 2 | 3 | 62.2 | 72.7 | 9 / 35 | 3328 |
| 3 | 2 | 63.3 | 77.5 | 7 / 35 | 3456 |
| 4 | 3 | 62.2 | 74.0 | 10 / 35 | 3358 |
| 5 | 1 | 64.7 | 80.0 | 14 / 35 | 3466 |
| 6 | 3 | 61.4 | 71.7 | 5 / 35 | 3232 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 50 | 32% |
| kc.micro.Figment 1.0 | 30 | 73% |
| mc2.enemy.Original 0.9 | 10 | 60% |
| pedersen.Grishnakh 1.0 | 7 | 43% |
| yagami.Tidus 0.11 | 6 | 100% |
| dft.Calliope 5.6 | 2 | 100% |

Hadur died in 158 of 210 rounds, at a mean tick of 832. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 62 | 39% | 81 |
| kc.micro.Figment 1.0 | 30 | 19% | 50 |
| mc2.enemy.Original 0.9 | 21 | 13% | 25 |
| yagami.Tidus 0.11 | 15 | 9% | 19 |
| pedersen.Grishnakh 1.0 | 13 | 8% | 16 |
| robar.nano.Assertive_Melee 0.2 | 5 | 3% | 5 |
| dft.Calliope 5.6 | 4 | 3% | 9 |
| step.nanoPri 1.0 | 3 | 2% | 3 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 155274 melee ticks, 35441 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 483 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 240 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 51187 sent, 46654 reached their opponent, 7162 virtual hits (15.4% of those reached).

## Melee bench: F10

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 331 over 6 battles (55.2 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 95.2 | 168 / 210 | 1.43 | 20.2% | 31129 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.0 | 20.2% | 168 |
| DTF.Kludgy 1.2b | 2.0 | 13.7% | 21 |
| ne.Chimera 1.2 | 3.3 | 12.6% | 7 |
| ejb.Polaris 1.0.1 | 3.7 | 12.2% | 4 |
| vStar.RAFzilla 2.15 | 5.5 | 10.5% | 5 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.5% | 4 |
| kurios.DOSexe .9b | 7.5 | 6.0% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 5.1% | 0 |
| donjezza.Muncho 1.0 | 9.0 | 4.3% | 0 |
| sam.Samspin 1.0 | 9.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 94.3 | 28 / 35 | 5084 |
| 2 | 1 | 70.5 | 94.6 | 27 / 35 | 5247 |
| 3 | 1 | 70.3 | 94.9 | 27 / 35 | 5130 |
| 4 | 1 | 70.0 | 92.7 | 26 / 35 | 5267 |
| 5 | 1 | 71.4 | 98.4 | 31 / 35 | 5386 |
| 6 | 1 | 70.9 | 96.2 | 29 / 35 | 5015 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 50 | 82% |
| ne.Chimera 1.2 | 44 | 89% |
| ejb.Polaris 1.0.1 | 37 | 95% |
| vStar.RAFzilla 2.15 | 25 | 96% |
| tvv.micro.Antares 1.1.1 | 21 | 95% |
| kurios.DOSexe .9b | 5 | 80% |
| sam.Samspin 1.0 | 3 | 100% |
| donjezza.Muncho 1.0 | 1 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 46 of 210 rounds, at a mean tick of 915. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 20 | 43% | 57 |
| ne.Chimera 1.2 | 8 | 17% | 45 |
| ejb.Polaris 1.0.1 | 5 | 11% | 47 |
| vStar.RAFzilla 2.15 | 5 | 11% | 23 |
| tvv.micro.Antares 1.1.1 | 4 | 9% | 23 |
| kurios.DOSexe .9b | 2 | 4% | 8 |
| donjezza.Muncho 1.0 | 0 | 0% | 3 |
| sam.Samspin 1.0 | 0 | 0% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 148202 melee ticks, 53976 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 54 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 49296 sent, 44979 reached their opponent, 9127 virtual hits (20.3% of those reached).

## Melee bench: F11

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 426 over 6 battles (71.0 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 76.8 | 67 / 210 | 3.09 | 15.1% | 19989 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.2 | 17.2% | 81 |
| hadur2.Hadur 3.17.1gc | 1.8 | 15.1% | 67 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.7% | 16 |
| djc.DynaBot 0.1.1 | 4.2 | 10.8% | 15 |
| rdt199.Warlord 0.73 | 5.3 | 9.3% | 17 |
| br2.MobyDickBot 1.6 | 6.2 | 8.7% | 9 |
| uji.YellohFellah 1.0 | 6.8 | 8.3% | 5 |
| KiraNL.Chupacabra 0.4 | 7.3 | 7.5% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.0 | 5.7% | 0 |
| stelo.MirrorNano 1.3 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.3 | 73.3 | 10 / 35 | 3122 |
| 2 | 2 | 60.7 | 71.4 | 7 / 35 | 3168 |
| 3 | 2 | 61.2 | 72.7 | 9 / 35 | 3041 |
| 4 | 2 | 64.3 | 81.3 | 12 / 35 | 3498 |
| 5 | 1 | 65.1 | 81.9 | 18 / 35 | 3664 |
| 6 | 2 | 63.9 | 80.3 | 11 / 35 | 3496 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 42 | 48% |
| cx.mini.Nimrod 0.55 | 18 | 72% |
| djc.DynaBot 0.1.1 | 17 | 82% |
| rdt199.Warlord 0.73 | 11 | 64% |
| br2.MobyDickBot 1.6 | 10 | 30% |
| uji.YellohFellah 1.0 | 10 | 90% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 64 | 44% | 86 |
| cx.mini.Nimrod 0.55 | 33 | 22% | 48 |
| rdt199.Warlord 0.73 | 14 | 10% | 22 |
| br2.MobyDickBot 1.6 | 10 | 7% | 12 |
| uji.YellohFellah 1.0 | 9 | 6% | 17 |
| djc.DynaBot 0.1.1 | 7 | 5% | 16 |
| KiraNL.Chupacabra 0.4 | 3 | 2% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 2% | 3 |
| stelo.MirrorNano 1.3 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 154485 melee ticks, 31306 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 49 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 51855 sent, 47299 reached their opponent, 6965 virtual hits (14.7% of those reached).

## Melee bench: F12

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 315 over 6 battles (52.5 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 83.6 | 102 / 210 | 2.48 | 16.7% | 19799 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.2 | 16.7% | 102 |
| bts.wiki.RipCurl 0.9b | 2.3 | 13.9% | 32 |
| nat.PallasHawk 1.0 | 3.2 | 12.9% | 37 |
| darkcanuck.Leon 1.01 | 3.3 | 13.0% | 21 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.4% | 11 |
| jrm.Test0 1.0 | 6.2 | 8.2% | 1 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.4% | 0 |
| jp.Perpy 16.0 | 7.8 | 6.6% | 2 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.6% | 4 |
| stuff.Vlad 0.1 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 88.9 | 18 / 35 | 3523 |
| 2 | 1 | 62.7 | 76.5 | 14 / 35 | 3114 |
| 3 | 1 | 63.4 | 78.7 | 16 / 35 | 3191 |
| 4 | 1 | 68.2 | 90.5 | 20 / 35 | 3709 |
| 5 | 2 | 63.6 | 80.3 | 13 / 35 | 2937 |
| 6 | 1 | 66.3 | 86.7 | 21 / 35 | 3325 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 40 | 50% |
| bts.wiki.RipCurl 0.9b | 38 | 66% |
| darkcanuck.Leon 1.01 | 35 | 91% |
| brainfade.melee.Genghis 0.36 | 18 | 83% |
| jrm.Test0 1.0 | 4 | 100% |
| jaybot.bots.Oddball 4.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| jp.Perpy 16.0 | 1 | 0% |

Hadur died in 110 of 210 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 33 | 30% | 58 |
| bts.wiki.RipCurl 0.9b | 33 | 30% | 52 |
| darkcanuck.Leon 1.01 | 13 | 12% | 54 |
| brainfade.melee.Genghis 0.36 | 13 | 12% | 18 |
| jrm.Test0 1.0 | 10 | 9% | 13 |
| jp.Perpy 16.0 | 3 | 3% | 5 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 4 |
| cs.sheldor.Talon 1.1 | 1 | 1% | 3 |
| stuff.Vlad 0.1 | 1 | 1% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 132670 melee ticks, 32704 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 41 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 45927 sent, 41176 reached their opponent, 7203 virtual hits (17.5% of those reached).

## Melee bench: F13

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 202 over 6 battles (33.7 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 78.5 | 47 / 210 | 2.94 | 14.9% | 22017 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.5 | 17.0% | 55 |
| mn.Combat 3.25.0 | 1.7 | 16.6% | 86 |
| hadur2.Hadur 3.17.1gc | 2.8 | 14.9% | 47 |
| shinh.Entangled 0.3 | 4.3 | 12.2% | 11 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.9% | 10 |
| apc.Colossus2 0.17 | 6.0 | 7.9% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.9% | 1 |
| ayk.WallHugger 1.0 | 8.2 | 5.1% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.5% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 78.4 | 10 / 35 | 3774 |
| 2 | 3 | 63.1 | 80.3 | 6 / 35 | 3393 |
| 3 | 3 | 64.0 | 79.0 | 8 / 35 | 3546 |
| 4 | 3 | 62.6 | 74.3 | 8 / 35 | 3823 |
| 5 | 3 | 63.8 | 78.4 | 9 / 35 | 3698 |
| 6 | 3 | 64.3 | 80.3 | 6 / 35 | 3783 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 48 | 54% |
| mn.Combat 3.25.0 | 38 | 16% |
| shinh.Entangled 0.3 | 12 | 67% |
| gh.micro.Gruweltje 0.7 | 5 | 100% |
| apc.Colossus2 0.17 | 1 | 100% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 833. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 56 | 34% | 77 |
| mn.Combat 3.25.0 | 51 | 31% | 61 |
| shinh.Entangled 0.3 | 25 | 15% | 34 |
| gh.micro.Gruweltje 0.7 | 14 | 9% | 19 |
| stelo.Wang 1.0 | 7 | 4% | 8 |
| apc.Colossus2 0.17 | 5 | 3% | 6 |
| maribo.FollowFire 1 | 5 | 3% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 149279 melee ticks, 32399 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 80 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 44253 sent, 39593 reached their opponent, 6901 virtual hits (17.4% of those reached).

## Melee bench: F14

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 259 over 6 battles (43.2 per battle, most in one battle 142). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 93.0 | 151 / 210 | 1.63 | 19.8% | 30355 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.0 | 19.8% | 151 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.0% | 19 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.6% | 26 |
| co.edu.usb.rc.LidisTron 1.0 | 4.7 | 10.1% | 3 |
| sanyi.mikrobi.Roberto 1.0 | 5.3 | 9.4% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 5.5 | 9.1% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 8.2% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.3 | 8.2% | 0 |
| pa.Improved 1.0 | 9.0 | 5.9% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 91.7 | 25 / 35 | 4845 |
| 2 | 1 | 71.1 | 95.2 | 26 / 35 | 5448 |
| 3 | 1 | 70.6 | 96.2 | 27 / 35 | 5013 |
| 4 | 1 | 69.9 | 90.5 | 25 / 35 | 5084 |
| 5 | 1 | 68.5 | 87.9 | 19 / 35 | 4817 |
| 6 | 1 | 71.4 | 96.5 | 29 / 35 | 5148 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 69 | 87% |
| catcat20.shape.Theta 0.018 | 53 | 70% |
| sanyi.mikrobi.Roberto 1.0 | 17 | 94% |
| co.edu.usb.rc.LidisTron 1.0 | 15 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 79% |
| Lo_Ian.Gandalf_V4 4.0 | 7 | 86% |
| pa.Improved 1.0 | 4 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 23 | 38% | 62 |
| simonton.micro.Sprout 1.1.3 | 17 | 28% | 75 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 13% | 22 |
| sanyi.mikrobi.Roberto 1.0 | 4 | 7% | 20 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 3% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 3% | 8 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 3% | 7 |
| sample.TrackFire 1.0 | 1 | 2% | 2 |
| pa.Improved 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 148035 melee ticks, 48491 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 32 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 47293 sent, 43062 reached their opponent, 11534 virtual hits (26.8% of those reached).

## Melee bench: F15

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 508 over 6 battles (84.7 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 85.9 | 102 / 210 | 2.27 | 18.0% | 27143 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.0 | 18.0% | 102 |
| emp.Yngwie 1.11 | 2.3 | 14.0% | 64 |
| kawigi.micro.Shiz 1.1 | 2.7 | 14.1% | 18 |
| mld.DustBunny 3.8 | 4.0 | 12.3% | 8 |
| cb.nano.Insomnia 1.0 | 5.3 | 10.1% | 1 |
| kawigi.robot.Girl 1.2 | 5.7 | 8.9% | 15 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.6% | 0 |
| lambdaxy.TBot 0.1 | 7.5 | 6.8% | 0 |
| divineomega.TrialBot 0.003 | 9.2 | 4.8% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 89.2 | 17 / 35 | 4532 |
| 2 | 1 | 67.1 | 83.2 | 15 / 35 | 4467 |
| 3 | 1 | 67.2 | 84.4 | 16 / 35 | 4593 |
| 4 | 1 | 66.8 | 82.9 | 17 / 35 | 4529 |
| 5 | 1 | 67.4 | 84.8 | 17 / 35 | 4552 |
| 6 | 1 | 68.3 | 90.8 | 20 / 35 | 4470 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 64 | 47% |
| kawigi.micro.Shiz 1.1 | 41 | 85% |
| mld.DustBunny 3.8 | 18 | 83% |
| cb.nano.Insomnia 1.0 | 10 | 90% |
| kawigi.robot.Girl 1.2 | 9 | 67% |
| divineomega.TrialBot 0.003 | 4 | 100% |
| lambdaxy.TBot 0.1 | 2 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 1021. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 51 | 46% | 94 |
| kawigi.micro.Shiz 1.1 | 13 | 12% | 37 |
| cb.nano.Insomnia 1.0 | 12 | 11% | 16 |
| mld.DustBunny 3.8 | 11 | 10% | 27 |
| kawigi.robot.Girl 1.2 | 8 | 7% | 12 |
| Grystrion.TrackerWO 1.0 | 6 | 5% | 6 |
| lambdaxy.TBot 0.1 | 4 | 4% | 6 |
| divineomega.TrialBot 0.003 | 3 | 3% | 11 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 170057 melee ticks, 49015 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 40 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 55257 sent, 50850 reached their opponent, 8857 virtual hits (17.4% of those reached).

## Melee bench: F16

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 534 over 6 battles (89.0 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 85.4 | 93 / 210 | 2.31 | 18.1% | 29238 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.0 | 18.1% | 93 |
| gh.Griezel 0.5.2 | 2.0 | 16.2% | 51 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.9% | 8 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 11.8% | 44 |
| tvv.nano.Polaris 1.2 | 5.5 | 8.6% | 4 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 9.1% | 4 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.6% | 1 |
| divineomega.DivineBot 1.9.4.5 | 8.7 | 5.1% | 4 |
| repositorio.NanoStep 1.0 | 9.2 | 4.9% | 0 |
| asd.Cthulhu 1.3 | 9.2 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 84.1 | 14 / 35 | 4826 |
| 2 | 1 | 65.8 | 79.7 | 15 / 35 | 4414 |
| 3 | 1 | 67.8 | 87.0 | 15 / 35 | 4766 |
| 4 | 1 | 66.1 | 79.7 | 11 / 35 | 4537 |
| 5 | 1 | 70.3 | 92.1 | 21 / 35 | 5278 |
| 6 | 1 | 69.6 | 89.8 | 17 / 35 | 5417 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 70 | 64% |
| techdude.forest.FlamingForest 1.1 | 44 | 48% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 17 | 82% |
| tvv.nano.Polaris 1.2 | 5 | 80% |
| bvh.fnr.Fenrir 0.36l | 5 | 60% |
| divineomega.DivineBot 1.9.4.5 | 4 | 75% |
| asd.Cthulhu 1.3 | 1 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |
| stelo.IntrinsicVolatility 1.4 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 1207. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 41 | 33% | 92 |
| techdude.forest.FlamingForest 1.1 | 30 | 24% | 51 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 21 | 17% | 32 |
| bvh.fnr.Fenrir 0.36l | 13 | 11% | 15 |
| divineomega.DivineBot 1.9.4.5 | 5 | 4% | 8 |
| tvv.nano.Polaris 1.2 | 3 | 2% | 5 |
| asd.Cthulhu 1.3 | 3 | 2% | 3 |
| stelo.IntrinsicVolatility 1.4 | 2 | 2% | 4 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 184980 melee ticks, 64288 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 49 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 59868 sent, 55414 reached their opponent, 9909 virtual hits (17.9% of those reached).

## Melee bench: F17

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 439 over 6 battles (73.2 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 83.8 | 94 / 210 | 2.46 | 17.7% | 29534 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.0 | 17.7% | 94 |
| et.Predator 1.8 | 2.8 | 13.2% | 24 |
| oog.melee.Mercutio 1.0 | 3.2 | 12.9% | 31 |
| cx.BlestPain 1.41 | 3.7 | 12.5% | 42 |
| ahf.NanoAndrew .4 | 4.8 | 10.8% | 12 |
| nic.Nicator 2.4 | 6.0 | 9.7% | 5 |
| maribo.melee.BMV 0.1 | 6.5 | 9.4% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.7% | 0 |
| tex.Longbot 0.4 | 8.7 | 5.6% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 89.5 | 16 / 35 | 5323 |
| 2 | 1 | 67.4 | 83.2 | 16 / 35 | 4986 |
| 3 | 1 | 66.1 | 80.6 | 17 / 35 | 4559 |
| 4 | 1 | 65.8 | 80.3 | 12 / 35 | 4924 |
| 5 | 1 | 67.6 | 83.5 | 18 / 35 | 4829 |
| 6 | 1 | 67.7 | 85.4 | 15 / 35 | 4913 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 46 | 72% |
| et.Predator 1.8 | 35 | 77% |
| cx.BlestPain 1.41 | 31 | 32% |
| ahf.NanoAndrew .4 | 15 | 87% |
| maribo.melee.BMV 0.1 | 7 | 86% |
| nic.Nicator 2.4 | 5 | 80% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 1036. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 34 | 29% | 46 |
| oog.melee.Mercutio 1.0 | 29 | 24% | 58 |
| et.Predator 1.8 | 19 | 16% | 43 |
| ahf.NanoAndrew .4 | 15 | 13% | 28 |
| nic.Nicator 2.4 | 8 | 7% | 15 |
| maribo.melee.BMV 0.1 | 7 | 6% | 12 |
| tex.Longbot 0.4 | 3 | 3% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 3 |
| goblin.Bender 2.4 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 165388 melee ticks, 56997 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 63 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 56155 sent, 51634 reached their opponent, 11861 virtual hits (23.0% of those reached).

## Melee bench: F18

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 361 over 6 battles (60.2 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 89.9 | 132 / 210 | 1.90 | 18.9% | 26182 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.0 | 18.9% | 132 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.4% | 30 |
| agd.Mooserwirt2 2.7 | 3.5 | 11.7% | 23 |
| uji.DBH 1.1 | 3.5 | 11.4% | 5 |
| spinnercat.Robovirus 2.718 | 5.5 | 9.2% | 4 |
| sigterm.Sigterm 1.0 | 5.8 | 8.9% | 10 |
| ratosh.Nobo 0.21 | 6.7 | 8.5% | 1 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.1% | 3 |
| stelo.WangRobot 1.0 | 9.3 | 5.8% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 88.3 | 23 / 35 | 4417 |
| 2 | 1 | 68.7 | 91.7 | 25 / 35 | 4107 |
| 3 | 1 | 67.4 | 87.0 | 19 / 35 | 4494 |
| 4 | 1 | 68.5 | 91.7 | 20 / 35 | 4239 |
| 5 | 1 | 68.2 | 88.9 | 20 / 35 | 4494 |
| 6 | 1 | 69.0 | 92.1 | 25 / 35 | 4431 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 54 | 70% |
| uji.DBH 1.1 | 38 | 97% |
| agd.Mooserwirt2 2.7 | 27 | 67% |
| sigterm.Sigterm 1.0 | 14 | 79% |
| spinnercat.Robovirus 2.718 | 11 | 91% |
| stelo.WangRobot 1.0 | 10 | 90% |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 83% |
| ratosh.Nobo 0.21 | 4 | 75% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 830. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 30 | 37% | 70 |
| agd.Mooserwirt2 2.7 | 12 | 15% | 32 |
| uji.DBH 1.1 | 9 | 11% | 30 |
| sigterm.Sigterm 1.0 | 6 | 7% | 19 |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 6% | 14 |
| stelo.WangRobot 1.0 | 5 | 6% | 13 |
| spinnercat.Robovirus 2.718 | 5 | 6% | 13 |
| ratosh.Nobo 0.21 | 3 | 4% | 11 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 4% | 6 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 141867 melee ticks, 47442 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 111 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 111 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 48493 sent, 44017 reached their opponent, 10141 virtual hits (23.0% of those reached).

## Melee bench: F19

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 302 over 6 battles (50.3 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 96.7 | 183 / 210 | 1.30 | 21.4% | 33648 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.0 | 21.4% | 183 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.5% | 16 |
| mld.Infinity 2.2 | 3.5 | 12.4% | 6 |
| krillr.mini.JointStrike 2.0.0 | 3.8 | 11.6% | 0 |
| erdnis.Rover 0.3 | 4.7 | 10.7% | 0 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.2% | 1 |
| mbh.Mbh 0.1 | 7.0 | 7.4% | 0 |
| pac.ABC 2.1 | 8.2 | 6.5% | 3 |
| pbg.R2D2 1.0 | 8.7 | 6.1% | 2 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 97.1 | 31 / 35 | 5321 |
| 2 | 1 | 72.6 | 97.1 | 31 / 35 | 5672 |
| 3 | 1 | 71.9 | 95.9 | 29 / 35 | 5613 |
| 4 | 1 | 71.9 | 95.6 | 30 / 35 | 5452 |
| 5 | 1 | 72.7 | 96.5 | 31 / 35 | 5818 |
| 6 | 1 | 73.0 | 97.8 | 31 / 35 | 5772 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 93 | 94% |
| mld.Infinity 2.2 | 34 | 100% |
| krillr.mini.JointStrike 2.0.0 | 25 | 100% |
| erdnis.Rover 0.3 | 15 | 100% |
| patson.PatsonTestBot 1.0 | 9 | 100% |
| pac.ABC 2.1 | 6 | 83% |
| pbg.R2D2 1.0 | 5 | 100% |
| mbh.Mbh 0.1 | 3 | 100% |

Hadur died in 30 of 210 rounds, at a mean tick of 831. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 11 | 37% | 65 |
| krillr.mini.JointStrike 2.0.0 | 6 | 20% | 38 |
| patson.PatsonTestBot 1.0 | 3 | 10% | 13 |
| mld.Infinity 2.2 | 2 | 7% | 35 |
| erdnis.Rover 0.3 | 2 | 7% | 24 |
| pac.ABC 2.1 | 2 | 7% | 12 |
| pbg.R2D2 1.0 | 1 | 3% | 9 |
| mbh.Mbh 0.1 | 0 | 0% | 8 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 136659 melee ticks, 44879 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 32 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 45936 sent, 41579 reached their opponent, 10338 virtual hits (24.9% of those reached).

## Melee bench: F20

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 313 over 6 battles (52.2 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 91.8 | 138 / 210 | 1.74 | 20.0% | 31777 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.0 | 20.0% | 138 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.5% | 33 |
| fwb.Nine 1.0.1 | 3.8 | 11.7% | 8 |
| catcat20.Rabbit 0.001 | 4.0 | 11.1% | 21 |
| nz.jdc.nano.GridFu 1.0 | 4.2 | 11.1% | 7 |
| m3thos.mini.Eva01 0.5.5 | 6.2 | 8.2% | 1 |
| bayen.nut.Squirrel 1.615 | 7.0 | 6.6% | 2 |
| djdjdj.NanoSkunk10 1.0 | 8.0 | 6.4% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 5.8% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 88.9 | 23 / 35 | 5322 |
| 2 | 1 | 70.7 | 92.7 | 23 / 35 | 5537 |
| 3 | 1 | 70.7 | 91.7 | 23 / 35 | 5532 |
| 4 | 1 | 70.5 | 93.7 | 25 / 35 | 5107 |
| 5 | 1 | 70.5 | 93.7 | 23 / 35 | 5254 |
| 6 | 1 | 69.5 | 90.2 | 21 / 35 | 5025 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 67 | 76% |
| fwb.Nine 1.0.1 | 51 | 96% |
| catcat20.Rabbit 0.001 | 29 | 69% |
| nz.jdc.nano.GridFu 1.0 | 10 | 80% |
| m3thos.mini.Eva01 0.5.5 | 6 | 100% |
| bayen.nut.Squirrel 1.615 | 3 | 67% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 986. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 40 | 54% | 93 |
| catcat20.Rabbit 0.001 | 15 | 20% | 49 |
| nz.jdc.nano.GridFu 1.0 | 7 | 9% | 27 |
| fwb.Nine 1.0.1 | 4 | 5% | 15 |
| m3thos.mini.Eva01 0.5.5 | 2 | 3% | 14 |
| bayen.nut.Squirrel 1.615 | 2 | 3% | 5 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 4 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 172079 melee ticks, 52672 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 34 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 54985 sent, 50454 reached their opponent, 12124 virtual hits (24.0% of those reached).

## Melee bench: F21

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 673 over 6 battles (112.2 per battle, most in one battle 117). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 91.2 | 114 / 210 | 1.80 | 19.4% | 31088 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.0 | 19.4% | 114 |
| eem.EvBot v4.6.16 | 2.0 | 17.1% | 73 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.6% | 7 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.0% | 9 |
| eld.Hmm 1.0 | 5.2 | 8.5% | 9 |
| oa.weak.BotherBot 0.1 | 6.0 | 7.4% | 0 |
| el.JumpShoot 0.2 | 7.7 | 6.1% | 0 |
| fire219.CatBot 1.0 | 7.7 | 5.9% | 0 |
| PSW.Relentless 0.1 | 8.7 | 5.2% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 94.9 | 21 / 35 | 5557 |
| 2 | 1 | 69.7 | 90.5 | 18 / 35 | 5147 |
| 3 | 1 | 69.9 | 91.1 | 19 / 35 | 5373 |
| 4 | 1 | 68.6 | 87.3 | 20 / 35 | 4802 |
| 5 | 1 | 69.5 | 91.7 | 16 / 35 | 5054 |
| 6 | 1 | 69.7 | 91.4 | 20 / 35 | 5155 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 125 | 58% |
| cf.RiO.RiOx 4.2.1 | 20 | 85% |
| dummy.mini.Scimitar 1.01 | 18 | 89% |
| eld.Hmm 1.0 | 14 | 57% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 1330. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 64 | 62% | 107 |
| dummy.mini.Scimitar 1.01 | 12 | 12% | 43 |
| cf.RiO.RiOx 4.2.1 | 12 | 12% | 33 |
| eld.Hmm 1.0 | 7 | 7% | 19 |
| PSW.Relentless 0.1 | 1 | 1% | 1 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 6 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 190318 melee ticks, 83009 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 73 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (209 rounds): 56036 sent, 51552 reached their opponent, 9610 virtual hits (18.6% of those reached).

## Melee bench: F22

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 198 over 6 battles (33.0 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 86.6 | 89 / 210 | 2.21 | 17.3% | 25402 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.3 | 17.3% | 89 |
| pe.SandboxDT 2.71m | 1.7 | 17.0% | 69 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.7% | 25 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.8% | 21 |
| bigpete.Stewie 1.0 | 5.0 | 10.9% | 7 |
| yk.JahRoslav 1.1 | 6.5 | 7.1% | 0 |
| gg.Squaraus 0.6 | 7.0 | 6.7% | 0 |
| tad.Dalek98 0.98 | 7.7 | 6.1% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 4.9% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.8 | 85.7 | 14 / 35 | 4012 |
| 2 | 1 | 67.3 | 87.0 | 16 / 35 | 4253 |
| 3 | 1 | 68.1 | 88.9 | 17 / 35 | 4326 |
| 4 | 1 | 66.9 | 85.1 | 13 / 35 | 4260 |
| 5 | 1 | 68.4 | 89.2 | 18 / 35 | 4404 |
| 6 | 2 | 66.4 | 83.5 | 11 / 35 | 4147 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 52 | 44% |
| kvk.HebusLeTroll 0.35 | 37 | 68% |
| jlm.javaDisturbance 0.59 | 36 | 81% |
| bigpete.Stewie 1.0 | 8 | 88% |
| pbg.NinjaX 1.2 | 4 | 75% |
| yk.JahRoslav 1.1 | 2 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 958. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 59 | 48% | 87 |
| kvk.HebusLeTroll 0.35 | 27 | 22% | 49 |
| jlm.javaDisturbance 0.59 | 20 | 16% | 46 |
| bigpete.Stewie 1.0 | 11 | 9% | 20 |
| tad.Dalek98 0.98 | 2 | 2% | 2 |
| pbg.NinjaX 1.2 | 1 | 1% | 3 |
| yk.JahRoslav 1.1 | 1 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 165601 melee ticks, 40408 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 55 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 53617 sent, 49087 reached their opponent, 8344 virtual hits (17.0% of those reached).

## Melee bench: F23

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 701 over 6 battles (116.8 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 93.5 | 160 / 210 | 1.58 | 20.5% | 32186 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.0 | 20.5% | 160 |
| pe.SandboxLump 1.52 | 2.0 | 16.7% | 34 |
| cre.Karolos 0.32 | 3.0 | 13.9% | 12 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.7% | 2 |
| stelo.RamTrackSurfer 1.2 | 5.3 | 9.3% | 2 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.2 | 8.6% | 0 |
| cw.megas.Blade 0.8 | 6.5 | 8.3% | 0 |
| sample.Walls 1.0 | 7.8 | 7.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.3 | 2.6% | 0 |
| rrh.Iwillfindyou 2.0 | 9.7 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 93.3 | 26 / 35 | 5253 |
| 2 | 1 | 72.7 | 95.9 | 27 / 35 | 5386 |
| 3 | 1 | 72.1 | 96.2 | 28 / 35 | 5442 |
| 4 | 1 | 71.2 | 90.5 | 26 / 35 | 5415 |
| 5 | 1 | 71.2 | 90.8 | 27 / 35 | 5451 |
| 6 | 1 | 71.4 | 94.6 | 26 / 35 | 5239 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 99 | 81% |
| cre.Karolos 0.32 | 53 | 96% |
| stelo.AreaTargetingBot 1.1 | 13 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 100% |
| stelo.RamTrackSurfer 1.2 | 6 | 83% |
| sample.Walls 1.0 | 3 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 29 | 51% | 97 |
| cre.Karolos 0.32 | 15 | 26% | 52 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 5% | 12 |
| stelo.RamTrackSurfer 1.2 | 2 | 4% | 14 |
| stelo.AreaTargetingBot 1.1 | 1 | 2% | 16 |
| cw.megas.Blade 0.8 | 1 | 2% | 6 |
| sample.Walls 1.0 | 0 | 0% | 9 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 131617 melee ticks, 46038 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 33 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 41659 sent, 37386 reached their opponent, 11413 virtual hits (30.5% of those reached).

## Melee bench: F24

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 499 over 6 battles (83.2 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 78.4 | 62 / 210 | 2.94 | 15.1% | 18949 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.7 | 15.1% | 62 |
| rz.GlowBlowMelee 1.4 | 2.0 | 14.4% | 48 |
| florent.XSeries.X2 0.12 | 3.2 | 13.7% | 38 |
| davidalves.Phoenix 0.54 | 3.8 | 12.9% | 30 |
| pedersen.Ugluk 1.1.1 | 4.5 | 12.2% | 23 |
| oog.melee.Corsair 1.0 | 5.8 | 9.6% | 5 |
| stelo.SoJNanoMelee 1.1 | 7.3 | 7.1% | 2 |
| lunchie.Lunchbox 0.93 | 7.8 | 5.8% | 2 |
| as.FrankTheTank 1.3 | 9.0 | 5.0% | 0 |
| evd.X1 0.01 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 83.8 | 14 / 35 | 3358 |
| 2 | 1 | 64.1 | 79.4 | 11 / 35 | 3461 |
| 3 | 1 | 62.2 | 77.5 | 8 / 35 | 3076 |
| 4 | 4 | 59.5 | 70.2 | 7 / 35 | 2679 |
| 5 | 2 | 63.4 | 79.4 | 12 / 35 | 3133 |
| 6 | 1 | 63.8 | 80.3 | 10 / 35 | 3242 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 29 | 48% |
| florent.XSeries.X2 0.12 | 24 | 50% |
| davidalves.Phoenix 0.54 | 23 | 52% |
| pedersen.Ugluk 1.1.1 | 19 | 53% |
| stelo.SoJNanoMelee 1.1 | 9 | 89% |
| oog.melee.Corsair 1.0 | 6 | 67% |
| lunchie.Lunchbox 0.93 | 1 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 774. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 40 | 26% | 55 |
| florent.XSeries.X2 0.12 | 39 | 26% | 55 |
| davidalves.Phoenix 0.54 | 25 | 16% | 36 |
| pedersen.Ugluk 1.1.1 | 25 | 16% | 30 |
| oog.melee.Corsair 1.0 | 6 | 4% | 16 |
| evd.X1 0.01 | 5 | 3% | 5 |
| stelo.SoJNanoMelee 1.1 | 4 | 3% | 5 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 5 |
| as.FrankTheTank 1.3 | 1 | 1% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 142984 melee ticks, 30484 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 50 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 47794 sent, 43282 reached their opponent, 8361 virtual hits (19.3% of those reached).

## Melee bench: F25

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 563 over 6 battles (93.8 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 85.2 | 129 / 210 | 2.33 | 17.9% | 22442 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.0 | 17.9% | 129 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.0% | 15 |
| voidious.micro.BlitzBat 1.05 | 3.2 | 12.3% | 9 |
| jdw.Hurricane 1.4 | 3.3 | 12.2% | 27 |
| gre.svman4.Morfeas 1.4.1 | 5.5 | 9.7% | 12 |
| ds.Oo 2.2 | 5.7 | 9.2% | 11 |
| awesomeness.Elite 1.0 | 7.0 | 8.0% | 2 |
| adt.Ar2 1.1 | 8.2 | 6.9% | 1 |
| gjr.Cephalosporin 0.1 | 8.7 | 6.4% | 3 |
| amk.ChumbaMini 0.2 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 85.7 | 24 / 35 | 3509 |
| 2 | 1 | 67.9 | 86.0 | 22 / 35 | 4138 |
| 3 | 1 | 66.0 | 83.2 | 19 / 35 | 3531 |
| 4 | 1 | 67.7 | 86.3 | 22 / 35 | 4100 |
| 5 | 1 | 66.5 | 85.4 | 20 / 35 | 3472 |
| 6 | 1 | 67.0 | 84.4 | 22 / 35 | 3692 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 43 | 93% |
| voidious.micro.BlitzBat 1.05 | 33 | 91% |
| jdw.Hurricane 1.4 | 32 | 78% |
| ds.Oo 2.2 | 13 | 85% |
| gre.svman4.Morfeas 1.4.1 | 11 | 45% |
| awesomeness.Elite 1.0 | 7 | 100% |
| gjr.Cephalosporin 0.1 | 7 | 71% |
| adt.Ar2 1.1 | 5 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 644. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 23 | 27% | 45 |
| voidious.mini.BrokenSword 2.0.3 | 21 | 25% | 52 |
| voidious.micro.BlitzBat 1.05 | 11 | 13% | 38 |
| ds.Oo 2.2 | 10 | 12% | 23 |
| gre.svman4.Morfeas 1.4.1 | 7 | 8% | 15 |
| awesomeness.Elite 1.0 | 4 | 5% | 15 |
| gjr.Cephalosporin 0.1 | 2 | 2% | 14 |
| amk.ChumbaMini 0.2 | 2 | 2% | 2 |
| adt.Ar2 1.1 | 1 | 1% | 5 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 129113 melee ticks, 30762 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 48 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 45423 sent, 40864 reached their opponent, 7313 virtual hits (17.9% of those reached).

## Melee bench: F26

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 213 over 6 battles (35.5 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 90.6 | 130 / 210 | 1.84 | 19.5% | 33021 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.0 | 19.5% | 130 |
| ak.Fermat 2.0 | 2.0 | 14.7% | 36 |
| shu.nitro.LENIN .T34 | 3.5 | 12.5% | 16 |
| lrem.Spectre 0.4.4 | 3.5 | 12.4% | 18 |
| js.PinBall 1.6 | 5.2 | 10.8% | 7 |
| jaybot.adv.bots.JayBot 2.0 | 6.2 | 9.8% | 1 |
| gh.mini.GrubbmOne 1.0 | 6.8 | 8.6% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 6.3% | 0 |
| sample.SpinBot 1.0 | 9.0 | 3.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 91.1 | 24 / 35 | 5693 |
| 2 | 1 | 69.2 | 87.3 | 20 / 35 | 5428 |
| 3 | 1 | 69.8 | 89.2 | 21 / 35 | 5416 |
| 4 | 1 | 70.9 | 92.7 | 21 / 35 | 5769 |
| 5 | 1 | 69.4 | 89.5 | 20 / 35 | 5238 |
| 6 | 1 | 70.8 | 94.0 | 24 / 35 | 5477 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 48 | 71% |
| shu.nitro.LENIN .T34 | 38 | 89% |
| lrem.Spectre 0.4.4 | 38 | 87% |
| js.PinBall 1.6 | 18 | 83% |
| jaybot.adv.bots.JayBot 2.0 | 11 | 100% |
| gh.mini.GrubbmOne 1.0 | 3 | 33% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 960. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 33 | 41% | 71 |
| shu.nitro.LENIN .T34 | 15 | 19% | 47 |
| lrem.Spectre 0.4.4 | 13 | 16% | 44 |
| js.PinBall 1.6 | 8 | 10% | 22 |
| jaybot.adv.bots.JayBot 2.0 | 8 | 10% | 18 |
| gh.mini.GrubbmOne 1.0 | 2 | 2% | 4 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 1% | 2 |
| sample.SpinBot 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 167202 melee ticks, 46314 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 25 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 54635 sent, 50080 reached their opponent, 13429 virtual hits (26.8% of those reached).

## Melee bench: F27

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 503 over 6 battles (83.8 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 92.3 | 162 / 210 | 1.70 | 19.7% | 27020 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.0 | 19.7% | 162 |
| mk.Alpha 0.2.1 | 2.0 | 14.3% | 30 |
| EH.Eagle 1.0.6 | 3.2 | 11.2% | 3 |
| techdude.kombat.FlamingKombat 1.5 | 5.5 | 9.1% | 2 |
| wee.Gem 1.8.4 | 6.0 | 9.0% | 5 |
| sheldor.melee.nano.TestMelee 0.1 | 6.0 | 8.7% | 2 |
| throxbot.ThroxBot 0.1 | 6.3 | 8.3% | 5 |
| joe.ADinosaur 1.0 | 6.8 | 8.4% | 0 |
| caimano.Furia_Ceca 0.22 | 8.2 | 7.3% | 1 |
| cs.Grudge 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 95.2 | 28 / 35 | 4731 |
| 2 | 1 | 69.7 | 94.9 | 29 / 35 | 4123 |
| 3 | 1 | 67.8 | 87.0 | 25 / 35 | 4072 |
| 4 | 1 | 70.3 | 94.9 | 29 / 35 | 4479 |
| 5 | 1 | 67.9 | 88.6 | 22 / 35 | 4296 |
| 6 | 1 | 71.0 | 93.0 | 29 / 35 | 5319 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 108 | 89% |
| EH.Eagle 1.0.6 | 30 | 97% |
| wee.Gem 1.8.4 | 15 | 100% |
| throxbot.ThroxBot 0.1 | 12 | 92% |
| techdude.kombat.FlamingKombat 1.5 | 5 | 80% |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 21 | 40% | 93 |
| EH.Eagle 1.0.6 | 7 | 13% | 42 |
| throxbot.ThroxBot 0.1 | 7 | 13% | 16 |
| joe.ADinosaur 1.0 | 4 | 8% | 6 |
| sheldor.melee.nano.TestMelee 0.1 | 3 | 6% | 15 |
| wee.Gem 1.8.4 | 2 | 4% | 17 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 4% | 11 |
| caimano.Furia_Ceca 0.22 | 2 | 4% | 7 |
| cs.Grudge 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 138534 melee ticks, 42998 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 33 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 45593 sent, 41142 reached their opponent, 9850 virtual hits (23.9% of those reached).

## Melee bench: F28

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 375 over 6 battles (62.5 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 90.0 | 136 / 210 | 1.90 | 18.5% | 23241 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.0 | 18.5% | 136 |
| kid.test.NightFox .2 | 2.0 | 14.9% | 24 |
| uji.Antique 1.0 | 3.2 | 12.0% | 20 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 11.1% | 16 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.6% | 1 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.4% | 6 |
| ahr.ice.Ice 1.0.2 | 6.7 | 7.7% | 4 |
| matt.advanced.Katana 1.0 | 8.0 | 6.3% | 3 |
| stelo.Lifestealer 1.0 | 9.3 | 5.2% | 0 |
| stelo.PianistNano 1.2 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 85.1 | 18 / 35 | 3843 |
| 2 | 1 | 68.4 | 91.7 | 22 / 35 | 3924 |
| 3 | 1 | 67.9 | 89.2 | 23 / 35 | 3834 |
| 4 | 1 | 67.1 | 87.6 | 20 / 35 | 3827 |
| 5 | 1 | 69.2 | 92.7 | 28 / 35 | 3903 |
| 6 | 1 | 69.2 | 93.7 | 25 / 35 | 3910 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 80 | 88% |
| uji.Antique 1.0 | 42 | 81% |
| qohnil.blot.BlotBot 3.61 | 21 | 67% |
| pfvicm.Sobieski 7.2.3b | 9 | 100% |
| amk.ChumbaWumba 0.3 | 8 | 50% |
| ahr.ice.Ice 1.0.2 | 7 | 71% |

Hadur died in 79 of 210 rounds, at a mean tick of 759. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 19 | 24% | 57 |
| kid.test.NightFox .2 | 16 | 20% | 62 |
| qohnil.blot.BlotBot 3.61 | 14 | 18% | 31 |
| pfvicm.Sobieski 7.2.3b | 8 | 10% | 21 |
| ahr.ice.Ice 1.0.2 | 7 | 9% | 15 |
| amk.ChumbaWumba 0.3 | 7 | 9% | 14 |
| stelo.Lifestealer 1.0 | 2 | 3% | 3 |
| stelo.PianistNano 1.2 | 2 | 3% | 3 |
| matt.advanced.Katana 1.0 | 1 | 1% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 133777 melee ticks, 38800 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 58 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 45750 sent, 41210 reached their opponent, 6499 virtual hits (15.8% of those reached).

## Melee bench: F29

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 706 over 6 battles (117.7 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 84.4 | 98 / 210 | 2.40 | 17.8% | 25259 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.0 | 17.8% | 98 |
| deewiant.Anomaly 0.2 | 2.3 | 15.4% | 49 |
| zyx.mega.YersiniaPestis 3.1 | 2.7 | 14.5% | 43 |
| myl.micro.Troodon 1.10 | 4.3 | 12.6% | 9 |
| jok.PheonixM 0.1.2 | 4.8 | 11.2% | 5 |
| ph.melee.ArcherME 0.3 | 5.8 | 7.8% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.7 | 5.8% | 0 |
| DBall.Anarchy 0.1 | 7.8 | 5.7% | 3 |
| jangs.ns51 1.0 | 9.0 | 4.6% | 0 |
| ap.Frederick 1.1 | 9.5 | 4.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 87.9 | 16 / 35 | 4604 |
| 2 | 1 | 69.3 | 89.8 | 21 / 35 | 4373 |
| 3 | 1 | 65.9 | 79.0 | 12 / 35 | 3961 |
| 4 | 1 | 66.8 | 81.0 | 15 / 35 | 4191 |
| 5 | 1 | 67.4 | 84.8 | 16 / 35 | 4086 |
| 6 | 1 | 67.2 | 84.1 | 18 / 35 | 4044 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 65 | 60% |
| zyx.mega.YersiniaPestis 3.1 | 36 | 58% |
| myl.micro.Troodon 1.10 | 20 | 95% |
| jok.PheonixM 0.1.2 | 14 | 86% |
| DBall.Anarchy 0.1 | 3 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 954. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 53 | 45% | 88 |
| zyx.mega.YersiniaPestis 3.1 | 33 | 28% | 64 |
| myl.micro.Troodon 1.10 | 11 | 9% | 26 |
| jok.PheonixM 0.1.2 | 10 | 8% | 20 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 2% | 3 |
| DBall.Anarchy 0.1 | 1 | 1% | 3 |
| jangs.ns51 1.0 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 162478 melee ticks, 50100 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 78 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 78 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 55256 sent, 50646 reached their opponent, 8617 virtual hits (17.0% of those reached).

## Melee bench: F30

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 504 over 6 battles (84.0 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 73.6 | 31 / 210 | 3.38 | 14.0% | 20082 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.8 | 14.0% | 31 |
| catcat20.Matcha 0.006 | 2.2 | 13.9% | 48 |
| oog.melee.Capulet 1.2 | 3.3 | 12.9% | 37 |
| darkcanuck.B26354 1.06 | 3.5 | 13.6% | 51 |
| stelo.PastFuture 2.3.2 | 4.2 | 12.6% | 23 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.3% | 12 |
| ntc.Opposite 1.5 | 7.5 | 7.7% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 8.2 | 7.0% | 6 |
| tripphippy.Alice 1.1 | 8.3 | 6.6% | 1 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.5 | 65.7 | 4 / 35 | 3196 |
| 2 | 1 | 63.2 | 78.1 | 6 / 35 | 3551 |
| 3 | 3 | 60.0 | 73.0 | 4 / 35 | 3023 |
| 4 | 1 | 61.3 | 74.6 | 5 / 35 | 3267 |
| 5 | 1 | 61.1 | 73.7 | 4 / 35 | 3348 |
| 6 | 1 | 62.7 | 76.5 | 8 / 35 | 3697 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 27 | 37% |
| catcat20.Matcha 0.006 | 20 | 25% |
| oog.melee.Capulet 1.2 | 15 | 33% |
| stelo.PastFuture 2.3.2 | 13 | 38% |
| intruder.PrairieWolf 2.61 | 9 | 33% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 50% |
| tripphippy.Alice 1.1 | 1 | 100% |

Hadur died in 183 of 210 rounds, at a mean tick of 895. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 47 | 26% | 53 |
| catcat20.Matcha 0.006 | 44 | 24% | 52 |
| oog.melee.Capulet 1.2 | 31 | 17% | 36 |
| stelo.PastFuture 2.3.2 | 28 | 15% | 34 |
| intruder.PrairieWolf 2.61 | 11 | 6% | 14 |
| fowl3628800.LightningBolt 2.6.0 | 8 | 4% | 10 |
| ntc.Opposite 1.5 | 6 | 3% | 6 |
| tripphippy.Alice 1.1 | 4 | 2% | 5 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 165540 melee ticks, 23631 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 646 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 574 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 53426 sent, 48771 reached their opponent, 8592 virtual hits (17.6% of those reached).

## Melee bench: F31

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 519 over 6 battles (86.5 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 77.1 | 49 / 210 | 3.06 | 14.7% | 18637 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.3% | 86 |
| hadur2.Hadur 3.17.1gc | 2.3 | 14.7% | 49 |
| gh.mini.Griezel 0.2 | 2.8 | 14.0% | 52 |
| d414.nano.Quantum 1.0.0 | 4.2 | 11.4% | 7 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 11.2% | 11 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.3% | 1 |
| timmit.nano.TimDog 0.33 | 7.3 | 6.7% | 2 |
| fm.mammillarias 1.3 | 7.8 | 5.7% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 4.8% | 1 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 79.4 | 8 / 35 | 3361 |
| 2 | 3 | 62.5 | 76.8 | 8 / 35 | 3031 |
| 3 | 2 | 63.8 | 78.1 | 9 / 35 | 3547 |
| 4 | 2 | 63.6 | 80.3 | 10 / 35 | 3074 |
| 5 | 3 | 60.9 | 74.0 | 6 / 35 | 2770 |
| 6 | 2 | 61.3 | 74.3 | 8 / 35 | 2854 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 41 | 34% |
| gh.mini.Griezel 0.2 | 29 | 45% |
| d414.nano.Quantum 1.0.0 | 13 | 100% |
| spinnercat.micro.Tyger 0.1 | 11 | 45% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |
| tlp.ThreeLeggedPig 1 | 2 | 50% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 0% |
| timmit.nano.TimDog 0.33 | 1 | 0% |

Hadur died in 165 of 210 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 52 | 32% | 67 |
| gh.mini.Griezel 0.2 | 50 | 30% | 62 |
| spinnercat.micro.Tyger 0.1 | 21 | 13% | 27 |
| d414.nano.Quantum 1.0.0 | 15 | 9% | 24 |
| gh.nano.Grofvuil 0.2 | 9 | 5% | 15 |
| timmit.nano.TimDog 0.33 | 6 | 4% | 6 |
| tlp.ThreeLeggedPig 1 | 3 | 2% | 3 |
| fm.mammillarias 1.3 | 3 | 2% | 3 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 155953 melee ticks, 34128 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 56 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 51148 sent, 46530 reached their opponent, 8157 virtual hits (17.5% of those reached).

## Melee bench: F32

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 431 over 6 battles (71.8 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 85.0 | 102 / 210 | 2.35 | 17.0% | 23519 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.2 | 17.0% | 102 |
| kawigi.sbf.FloodHT 0.9.2 | 1.8 | 15.3% | 55 |
| apc.botM 3.0 | 3.3 | 12.5% | 28 |
| vjik.UnViolation 1.1 | 4.5 | 10.0% | 8 |
| lxx.ConceptA 0.8 | 4.5 | 10.2% | 2 |
| bayen.UbaMicro 1.4 | 5.8 | 8.9% | 4 |
| panzer.Panzer 0.2 | 7.2 | 7.6% | 2 |
| conscience.Electron 1.3g | 8.2 | 6.8% | 2 |
| yk.JahMicro 1.0 | 8.5 | 6.8% | 5 |
| donjezza.Jezza 1.0 | 10.0 | 5.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 86.3 | 16 / 35 | 3734 |
| 2 | 1 | 65.5 | 84.1 | 19 / 35 | 3771 |
| 3 | 1 | 66.1 | 84.4 | 18 / 35 | 4192 |
| 4 | 1 | 67.8 | 90.2 | 21 / 35 | 4284 |
| 5 | 1 | 65.5 | 83.2 | 17 / 35 | 3903 |
| 6 | 2 | 64.1 | 81.9 | 11 / 35 | 3635 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 77 | 53% |
| apc.botM 3.0 | 30 | 73% |
| lxx.ConceptA 0.8 | 12 | 92% |
| vjik.UnViolation 1.1 | 11 | 100% |
| yk.JahMicro 1.0 | 7 | 57% |
| bayen.UbaMicro 1.4 | 6 | 83% |
| donjezza.Jezza 1.0 | 5 | 80% |
| panzer.Panzer 0.2 | 3 | 100% |
| conscience.Electron 1.3g | 2 | 50% |

Hadur died in 111 of 210 rounds, at a mean tick of 744. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 49 | 44% | 87 |
| lxx.ConceptA 0.8 | 18 | 16% | 32 |
| apc.botM 3.0 | 14 | 13% | 38 |
| vjik.UnViolation 1.1 | 7 | 6% | 21 |
| bayen.UbaMicro 1.4 | 7 | 6% | 12 |
| panzer.Panzer 0.2 | 5 | 5% | 7 |
| yk.JahMicro 1.0 | 4 | 4% | 7 |
| conscience.Electron 1.3g | 3 | 3% | 4 |
| donjezza.Jezza 1.0 | 1 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 124925 melee ticks, 42784 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 36 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 36 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 43631 sent, 39149 reached their opponent, 7467 virtual hits (19.1% of those reached).

## Melee bench: F33

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 104 over 6 battles (17.3 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 84.7 | 96 / 210 | 2.38 | 17.6% | 25502 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.0 | 17.6% | 96 |
| maribo.Quester 0.3 | 2.0 | 15.7% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 13.3% | 34 |
| gre.svman4.Leonidas 1.3.2 | 4.0 | 11.5% | 19 |
| labg.Cataclysm 2.05 | 5.0 | 10.8% | 18 |
| baal.nano.N 1.42 | 6.3 | 8.7% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.5% | 5 |
| zyx.micro.Ant 1.1 | 8.5 | 5.1% | 1 |
| sanja.First 0.1 | 8.8 | 5.1% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.7 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 81.6 | 15 / 35 | 4209 |
| 2 | 1 | 67.2 | 85.1 | 17 / 35 | 4133 |
| 3 | 1 | 68.5 | 87.0 | 18 / 35 | 4455 |
| 4 | 1 | 67.0 | 86.0 | 17 / 35 | 4026 |
| 5 | 1 | 67.2 | 85.4 | 12 / 35 | 4233 |
| 6 | 1 | 67.5 | 82.9 | 17 / 35 | 4446 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 53 | 74% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 33 | 58% |
| gre.svman4.Leonidas 1.3.2 | 25 | 72% |
| labg.Cataclysm 2.05 | 14 | 79% |
| kinsen.melee.Angsaichmophobia 1.8c | 3 | 100% |
| baal.nano.N 1.42 | 2 | 100% |
| zyx.micro.Ant 1.1 | 2 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 985. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 40 | 35% | 80 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 26% | 47 |
| gre.svman4.Leonidas 1.3.2 | 18 | 16% | 30 |
| kinsen.melee.Angsaichmophobia 1.8c | 12 | 10% | 16 |
| labg.Cataclysm 2.05 | 8 | 7% | 21 |
| baal.nano.N 1.42 | 3 | 3% | 7 |
| zyx.micro.Ant 1.1 | 2 | 2% | 6 |
| sanja.First 0.1 | 2 | 2% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 205 rounds): 172874 melee ticks, 48396 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 48 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 55398 sent, 50908 reached their opponent, 8463 virtual hits (16.6% of those reached).

## Melee bench: F34

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 413 over 6 battles (68.8 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 85.3 | 74 / 210 | 2.32 | 17.1% | 25876 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.5 | 17.1% | 74 |
| stelo.Spread 0.9 | 2.0 | 16.5% | 59 |
| kid.Gladiator .7.2 | 2.5 | 16.2% | 46 |
| jcs.Seth 1.8 | 4.3 | 11.4% | 25 |
| tcf.Reach 3 | 4.8 | 10.8% | 4 |
| cli.Dancer 1.1 | 5.8 | 9.4% | 1 |
| ratosh.Wesco 1.4 | 7.2 | 6.8% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.3% | 0 |
| sample.VelociRobot 1.0 | 8.8 | 4.0% | 1 |
| sample.RamFire 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.3 | 86.0 | 11 / 35 | 4361 |
| 2 | 2 | 67.3 | 86.3 | 11 / 35 | 4370 |
| 3 | 2 | 66.3 | 82.5 | 11 / 35 | 4365 |
| 4 | 1 | 67.4 | 86.0 | 14 / 35 | 4233 |
| 5 | 1 | 67.6 | 85.7 | 15 / 35 | 4319 |
| 6 | 1 | 67.0 | 85.4 | 12 / 35 | 4228 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 60 | 48% |
| kid.Gladiator .7.2 | 43 | 63% |
| jcs.Seth 1.8 | 21 | 38% |
| tcf.Reach 3 | 11 | 64% |
| sample.VelociRobot 1.0 | 2 | 50% |
| cli.Dancer 1.1 | 1 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 1065. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 56 | 40% | 85 |
| kid.Gladiator .7.2 | 45 | 32% | 68 |
| jcs.Seth 1.8 | 22 | 16% | 31 |
| tcf.Reach 3 | 6 | 4% | 16 |
| cli.Dancer 1.1 | 3 | 2% | 4 |
| ratosh.Wesco 1.4 | 2 | 1% | 2 |
| sample.VelociRobot 1.0 | 1 | 1% | 2 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 172035 melee ticks, 49642 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 45 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 45 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 54046 sent, 49585 reached their opponent, 8824 virtual hits (17.8% of those reached).

## Melee bench: F35

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 618 over 6 battles (103.0 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 79.7 | 31 / 210 | 2.82 | 14.7% | 18602 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.4% | 138 |
| hadur2.Hadur 3.17.1gc | 2.3 | 14.7% | 31 |
| gh.mini.Gruwel 0.9 | 3.0 | 13.2% | 28 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.2 | 12.3% | 10 |
| rz.HawkOnFire 0.1 | 4.5 | 12.1% | 3 |
| wit.Chuliath 1.0 | 6.5 | 6.4% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.3 | 6.1% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.3 | 6.1% | 0 |
| dans.Cinnamon 1.2 | 9.0 | 5.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 83.8 | 7 / 35 | 3066 |
| 2 | 2 | 63.7 | 80.6 | 7 / 35 | 3258 |
| 3 | 4 | 59.8 | 71.1 | 3 / 35 | 2646 |
| 4 | 2 | 62.9 | 79.4 | 3 / 35 | 3222 |
| 5 | 2 | 64.1 | 81.9 | 8 / 35 | 3226 |
| 6 | 2 | 63.3 | 81.6 | 3 / 35 | 3184 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 68 | 12% |
| gh.mini.Gruwel 0.9 | 22 | 32% |
| dmh.robocode.robot.BlackDeath 9.2 | 10 | 70% |
| rz.HawkOnFire 0.1 | 10 | 80% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 184 of 210 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 88 | 48% | 98 |
| gh.mini.Gruwel 0.9 | 30 | 16% | 36 |
| dmh.robocode.robot.BlackDeath 9.2 | 28 | 15% | 33 |
| rz.HawkOnFire 0.1 | 26 | 14% | 35 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 2% | 4 |
| wit.Chuliath 1.0 | 2 | 1% | 2 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 1 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 150864 melee ticks, 39787 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 48 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 47805 sent, 43136 reached their opponent, 7003 virtual hits (16.2% of those reached).

## Melee bench: F36

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 232 over 6 battles (38.7 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 93.9 | 159 / 210 | 1.55 | 20.4% | 28731 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.0 | 20.4% | 159 |
| alpha.RainingFire 1.0 | 2.5 | 12.1% | 11 |
| bzdp.Pansy 2.1 | 3.3 | 11.7% | 10 |
| bvh.micro.Freya 0.3 | 4.2 | 10.9% | 7 |
| mz.Cork 0.1 | 5.3 | 10.4% | 9 |
| m3thos.Eva02 0.7.1 | 5.3 | 10.2% | 8 |
| bvh.mini.Fenrir 0.39 | 6.3 | 10.0% | 4 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 5.3% | 0 |
| dl.BetterWalls 1.0 | 9.0 | 4.9% | 1 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 92.1 | 22 / 35 | 4630 |
| 2 | 1 | 71.7 | 97.8 | 31 / 35 | 4706 |
| 3 | 1 | 70.1 | 92.4 | 27 / 35 | 4685 |
| 4 | 1 | 70.1 | 93.7 | 25 / 35 | 4799 |
| 5 | 1 | 70.6 | 93.3 | 27 / 35 | 4752 |
| 6 | 1 | 71.1 | 94.3 | 27 / 35 | 5159 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.Cork 0.1 | 38 | 82% |
| bzdp.Pansy 2.1 | 35 | 89% |
| alpha.RainingFire 1.0 | 33 | 85% |
| bvh.micro.Freya 0.3 | 28 | 93% |
| m3thos.Eva02 0.7.1 | 24 | 88% |
| bvh.mini.Fenrir 0.39 | 17 | 82% |
| sample.MyFirstRobot 1.0 | 8 | 88% |
| dl.BetterWalls 1.0 | 2 | 50% |

Hadur died in 53 of 210 rounds, at a mean tick of 905. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 11 | 21% | 34 |
| m3thos.Eva02 0.7.1 | 9 | 17% | 35 |
| bvh.mini.Fenrir 0.39 | 9 | 17% | 17 |
| bzdp.Pansy 2.1 | 8 | 15% | 49 |
| mz.Cork 0.1 | 7 | 13% | 37 |
| bvh.micro.Freya 0.3 | 7 | 13% | 28 |
| dl.BetterWalls 1.0 | 1 | 2% | 4 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 3 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 146841 melee ticks, 48131 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 50 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 51211 sent, 46938 reached their opponent, 10192 virtual hits (21.7% of those reached).

## Melee bench: F37

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 255 over 6 battles (42.5 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 87.4 | 156 / 210 | 2.13 | 18.5% | 29618 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.0 | 18.5% | 156 |
| germ.TheMind .2 | 2.8 | 10.3% | 5 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.2 | 10.8% | 10 |
| EBBU.Sim2 1.02 | 3.8 | 10.0% | 5 |
| agrach.Dalek 1.0 | 6.8 | 8.7% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 6.8 | 8.6% | 0 |
| mb.Beast 0.1 | 7.0 | 8.4% | 11 |
| lmk.ACPFinal 0.1 | 7.2 | 8.7% | 7 |
| stelo.UntouchableNano 1.3 | 7.2 | 8.4% | 6 |
| skm.Ryubot 1.0 | 9.2 | 7.6% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 90.2 | 28 / 35 | 5394 |
| 2 | 1 | 68.5 | 88.9 | 29 / 35 | 5286 |
| 3 | 1 | 68.4 | 92.4 | 27 / 35 | 4942 |
| 4 | 1 | 66.0 | 85.1 | 24 / 35 | 4634 |
| 5 | 1 | 64.8 | 80.3 | 21 / 35 | 4714 |
| 6 | 1 | 67.0 | 87.6 | 27 / 35 | 4648 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| EBBU.Sim2 1.02 | 28 | 100% |
| germ.TheMind .2 | 23 | 91% |
| stelo.UntouchableNano 1.3 | 22 | 86% |
| mb.Beast 0.1 | 21 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 20 | 95% |
| agrach.Dalek 1.0 | 19 | 95% |
| skm.Ryubot 1.0 | 17 | 100% |
| lmk.ACPFinal 0.1 | 12 | 92% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 419. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 15 | 27% | 19 |
| com.syncleus.robocode.Dreadnaught 0.1 | 8 | 14% | 26 |
| agrach.Dalek 1.0 | 7 | 13% | 34 |
| EBBU.Sim2 1.02 | 6 | 11% | 33 |
| germ.TheMind .2 | 5 | 9% | 24 |
| mb.Beast 0.1 | 5 | 9% | 21 |
| lmk.ACPFinal 0.1 | 5 | 9% | 20 |
| stelo.UntouchableNano 1.3 | 4 | 7% | 23 |
| skm.Ryubot 1.0 | 0 | 0% | 6 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 99177 melee ticks, 26359 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 39 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 34050 sent, 29975 reached their opponent, 9496 virtual hits (31.7% of those reached).

## Melee bench: F38

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 722 over 6 battles (120.3 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 84.7 | 83 / 210 | 2.38 | 16.8% | 23077 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.3 | 16.9% | 82 |
| hadur2.Hadur 3.17.1gc | 1.7 | 16.8% | 83 |
| bvh.mini.Freya 0.55 | 3.5 | 12.4% | 10 |
| bts.mega.Gnarly 1.4 | 4.0 | 11.6% | 21 |
| cs.Wren 1.0 | 5.0 | 10.5% | 4 |
| kdf.KoulDestroyer 1.0 | 6.2 | 9.0% | 4 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.5 | 8.8% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.8 | 6.9% | 3 |
| matt.UnderDark3 2.4.34 | 9.3 | 3.8% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 84.1 | 16 / 35 | 4099 |
| 2 | 2 | 64.9 | 81.6 | 11 / 35 | 3777 |
| 3 | 2 | 65.2 | 83.2 | 12 / 35 | 3591 |
| 4 | 2 | 64.6 | 82.9 | 10 / 35 | 3576 |
| 5 | 1 | 68.4 | 90.8 | 19 / 35 | 4174 |
| 6 | 2 | 66.5 | 85.7 | 15 / 35 | 3860 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 78 | 42% |
| bts.mega.Gnarly 1.4 | 29 | 62% |
| bvh.mini.Freya 0.55 | 16 | 63% |
| kdf.KoulDestroyer 1.0 | 8 | 88% |
| cs.Wren 1.0 | 7 | 100% |
| davidalves.net.DuelistNanoMelee 1.01 | 6 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 50% |

Hadur died in 133 of 210 rounds, at a mean tick of 840. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 58 | 44% | 90 |
| bts.mega.Gnarly 1.4 | 25 | 19% | 47 |
| bvh.mini.Freya 0.55 | 17 | 13% | 24 |
| cs.Wren 1.0 | 9 | 7% | 19 |
| kdf.KoulDestroyer 1.0 | 9 | 7% | 14 |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 3% | 8 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 2% | 6 |
| bzdp.BoxCar 2.0 | 2 | 2% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 143624 melee ticks, 41062 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 72 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 47709 sent, 43019 reached their opponent, 9327 virtual hits (21.7% of those reached).

## Melee bench: F39

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 729 over 6 battles (121.5 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 83.2 | 74 / 210 | 2.51 | 16.8% | 26041 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.0 | 16.8% | 74 |
| bvh.fry.Freya 0.82 | 2.0 | 15.5% | 29 |
| az.Ololobot 0.2.4 | 3.2 | 13.8% | 70 |
| catcat20.Lambda 0.024 | 3.8 | 11.7% | 35 |
| gimp.GimpBot 0.1 | 5.8 | 8.2% | 0 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 8.2% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 6.8 | 7.5% | 0 |
| apollokidd.ApolloKidd 0.9 | 7.2 | 7.8% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.7% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 87.0 | 13 / 35 | 4230 |
| 2 | 1 | 65.9 | 83.8 | 10 / 35 | 4575 |
| 3 | 1 | 64.5 | 80.3 | 10 / 35 | 4259 |
| 4 | 1 | 66.1 | 82.5 | 16 / 35 | 4404 |
| 5 | 1 | 64.6 | 80.3 | 12 / 35 | 4218 |
| 6 | 1 | 66.0 | 85.1 | 13 / 35 | 4355 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 52 | 42% |
| bvh.fry.Freya 0.82 | 39 | 67% |
| catcat20.Lambda 0.024 | 24 | 42% |
| stelo.SoRobotNanoMelee 1.2 | 7 | 100% |
| gimp.GimpBot 0.1 | 4 | 100% |
| apollokidd.ApolloKidd 0.9 | 3 | 67% |
| winamp32.micro.MicroMacro 1.0 | 3 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 1021. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 57 | 40% | 79 |
| az.Ololobot 0.2.4 | 35 | 25% | 57 |
| catcat20.Lambda 0.024 | 31 | 22% | 39 |
| apollokidd.ApolloKidd 0.9 | 6 | 4% | 8 |
| gimp.GimpBot 0.1 | 5 | 4% | 11 |
| stelo.SoRobotNanoMelee 1.2 | 1 | 1% | 8 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 6 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 174242 melee ticks, 45875 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 58 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 55364 sent, 50757 reached their opponent, 9985 virtual hits (19.7% of those reached).

## Melee bench: F40

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 606 over 6 battles (101.0 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 86.2 | 100 / 210 | 2.24 | 17.9% | 25744 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.0 | 17.9% | 100 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.7% | 48 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.4% | 31 |
| mz.AntiGrav 1.0 | 4.3 | 11.6% | 9 |
| Polkwane.SmashMelee 1.0 | 4.7 | 10.7% | 7 |
| alpha.BlackIce 1.0 | 6.3 | 9.2% | 5 |
| stelo.Randomness 1.0 | 6.5 | 8.8% | 10 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.1% | 0 |
| sample.Corners 1.0 | 9.5 | 3.7% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.5 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 88.9 | 18 / 35 | 4191 |
| 2 | 1 | 67.8 | 86.3 | 15 / 35 | 4623 |
| 3 | 1 | 67.2 | 86.7 | 18 / 35 | 3902 |
| 4 | 1 | 67.5 | 85.4 | 17 / 35 | 4364 |
| 5 | 1 | 68.9 | 89.2 | 20 / 35 | 4343 |
| 6 | 1 | 65.9 | 80.6 | 12 / 35 | 4321 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 64 | 69% |
| kano.gamma.KanoGamma 1.8 | 29 | 62% |
| Polkwane.SmashMelee 1.0 | 19 | 79% |
| mz.AntiGrav 1.0 | 15 | 93% |
| stelo.Randomness 1.0 | 9 | 67% |
| alpha.BlackIce 1.0 | 7 | 43% |

Hadur died in 115 of 210 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 40 | 35% | 81 |
| kano.gamma.KanoGamma 1.8 | 23 | 20% | 47 |
| mz.AntiGrav 1.0 | 16 | 14% | 25 |
| stelo.Randomness 1.0 | 11 | 10% | 17 |
| Polkwane.SmashMelee 1.0 | 9 | 8% | 20 |
| alpha.BlackIce 1.0 | 8 | 7% | 12 |
| amk.superstrike.SuperStrike 0.3 | 2 | 2% | 6 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 155917 melee ticks, 41393 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 121 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 121 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 51583 sent, 46989 reached their opponent, 10424 virtual hits (22.2% of those reached).

## Melee bench: F41

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 400 over 6 battles (66.7 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 84.7 | 86 / 210 | 2.38 | 16.9% | 22500 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.3 | 16.6% | 79 |
| hadur2.Hadur 3.17.1gc | 1.7 | 16.9% | 86 |
| ary.Swarm 1.1 | 3.2 | 13.5% | 18 |
| lessonz.robocode.Oz 0.5.0 | 4.2 | 12.0% | 12 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.3% | 9 |
| shrub.Silver v048 | 6.0 | 9.1% | 4 |
| zyx.nano.Ant 1.1 | 7.0 | 7.4% | 0 |
| stelo.Mirror 1.1 | 8.5 | 5.4% | 1 |
| jsal.Jsalbot 1.0 | 8.5 | 5.5% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 87.9 | 15 / 35 | 3566 |
| 2 | 2 | 66.6 | 84.8 | 16 / 35 | 3681 |
| 3 | 1 | 67.2 | 85.4 | 18 / 35 | 3860 |
| 4 | 2 | 65.0 | 80.0 | 10 / 35 | 3905 |
| 5 | 2 | 66.9 | 87.6 | 14 / 35 | 3663 |
| 6 | 2 | 66.2 | 82.5 | 13 / 35 | 3825 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 80 | 48% |
| lessonz.robocode.Oz 0.5.0 | 23 | 87% |
| ary.Swarm 1.1 | 15 | 73% |
| simonton.nano.MeleeSeed 1.8 | 6 | 100% |
| shrub.Silver v048 | 5 | 80% |
| jsal.Jsalbot 1.0 | 5 | 100% |
| stelo.Mirror 1.1 | 2 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 923. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 65 | 51% | 94 |
| ary.Swarm 1.1 | 25 | 20% | 39 |
| lessonz.robocode.Oz 0.5.0 | 14 | 11% | 28 |
| simonton.nano.MeleeSeed 1.8 | 10 | 8% | 23 |
| shrub.Silver v048 | 7 | 6% | 12 |
| stelo.Mirror 1.1 | 2 | 2% | 6 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
| jsal.Jsalbot 1.0 | 0 | 0% | 6 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 157137 melee ticks, 45961 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 74 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 74 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 53340 sent, 48638 reached their opponent, 8140 virtual hits (16.7% of those reached).

## Melee bench: F42

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 187 over 6 battles (31.2 per battle, most in one battle 117). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 87.9 | 113 / 210 | 2.09 | 18.6% | 30176 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.0 | 18.6% | 113 |
| wompi.Wallaby 5.1 | 2.0 | 16.3% | 59 |
| ara.Shera 0.88 | 3.5 | 13.1% | 22 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.2% | 16 |
| amz.NanoClone 1.41 | 5.0 | 8.6% | 0 |
| dsw.StaticD 1.0 | 6.8 | 6.6% | 0 |
| maribo.IotaCT 1.1 | 7.2 | 6.5% | 0 |
| stelo.MirrorMicro 1.0 | 7.5 | 6.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.2 | 5.4% | 0 |
| mme.NikeEnhanced 2.0 | 9.3 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 85.7 | 19 / 35 | 4778 |
| 2 | 1 | 68.1 | 87.9 | 16 / 35 | 5047 |
| 3 | 1 | 68.8 | 89.2 | 18 / 35 | 5337 |
| 4 | 1 | 69.3 | 89.2 | 21 / 35 | 5221 |
| 5 | 1 | 68.1 | 87.0 | 18 / 35 | 4867 |
| 6 | 1 | 68.7 | 88.3 | 21 / 35 | 4926 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 89 | 75% |
| maribo.mini.MiniQuester 0.1 | 30 | 80% |
| ara.Shera 0.88 | 28 | 61% |
| dsw.StaticD 1.0 | 3 | 100% |
| amz.NanoClone 1.41 | 2 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 948. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 38 | 39% | 95 |
| ara.Shera 0.88 | 30 | 31% | 51 |
| maribo.mini.MiniQuester 0.1 | 17 | 17% | 41 |
| amz.NanoClone 1.41 | 7 | 7% | 9 |
| dsw.StaticD 1.0 | 2 | 2% | 4 |
| mme.NikeEnhanced 2.0 | 2 | 2% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 4 |
| maribo.IotaCT 1.1 | 0 | 0% | 2 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 166145 melee ticks, 43528 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 30 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 30 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 53453 sent, 49025 reached their opponent, 10283 virtual hits (21.0% of those reached).

## Melee bench: F43

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 683 over 6 battles (113.8 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 78.9 | 38 / 210 | 2.90 | 15.0% | 20369 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.0% | 147 |
| hadur2.Hadur 3.17.1gc | 2.0 | 15.0% | 38 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.5% | 16 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.9% | 5 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 11.0% | 2 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.7% | 2 |
| mz.NanoGod 2.02 | 7.5 | 7.4% | 1 |
| jab.DiamondStealer 5 | 7.5 | 7.4% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.8% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.3 | 76.5 | 5 / 35 | 3568 |
| 2 | 2 | 66.1 | 82.9 | 9 / 35 | 3576 |
| 3 | 2 | 64.4 | 77.8 | 7 / 35 | 3300 |
| 4 | 2 | 64.6 | 78.4 | 8 / 35 | 3284 |
| 5 | 2 | 63.1 | 76.2 | 5 / 35 | 3181 |
| 6 | 2 | 65.2 | 81.6 | 4 / 35 | 3460 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 91 | 22% |
| brainfade.melee.Dusk 0.44 | 13 | 62% |
| dummy.micro.Sparrow 2.5 | 7 | 86% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 179 of 210 rounds, at a mean tick of 972. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 104 | 58% | 127 |
| brainfade.melee.Dusk 0.44 | 22 | 12% | 28 |
| dummy.micro.Sparrow 2.5 | 16 | 9% | 22 |
| wcsv.melee.EngineerMelee 0.1 | 15 | 8% | 16 |
| mz.NanoGod 2.02 | 7 | 4% | 8 |
| Krabb.akim2.Akim2 1.1b | 6 | 3% | 7 |
| jab.DiamondStealer 5 | 2 | 1% | 2 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 157238 melee ticks, 50173 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 25 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 51324 sent, 46751 reached their opponent, 8422 virtual hits (18.0% of those reached).

## Melee bench: F44

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 502 over 6 battles (83.7 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 90.1 | 128 / 210 | 1.90 | 19.4% | 29732 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.0 | 19.4% | 128 |
| stelo.Liblix 0.3.1 | 2.2 | 15.2% | 51 |
| tzu.TheArtOfWar 1.2 | 2.8 | 13.9% | 20 |
| jwirde.Gort 2.0 | 4.2 | 10.0% | 3 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.3 | 9.0% | 2 |
| disan.Chair 2.2.0 | 6.7 | 8.0% | 2 |
| wompi.Quokka 1.6 | 6.7 | 8.1% | 3 |
| stf.PanzerGeneral 0.1 | 7.2 | 7.2% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.8% | 1 |
| sample.Crazy 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 91.4 | 19 / 35 | 5355 |
| 2 | 1 | 68.9 | 88.9 | 22 / 35 | 4955 |
| 3 | 1 | 69.8 | 91.1 | 22 / 35 | 4922 |
| 4 | 1 | 69.4 | 90.5 | 23 / 35 | 4737 |
| 5 | 1 | 68.3 | 87.3 | 18 / 35 | 4721 |
| 6 | 1 | 69.9 | 91.1 | 24 / 35 | 5042 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 77 | 62% |
| tzu.TheArtOfWar 1.2 | 66 | 83% |
| disan.Chair 2.2.0 | 10 | 100% |
| wompi.Quokka 1.6 | 9 | 78% |
| jwirde.Gort 2.0 | 4 | 75% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 100% |
| sample.Crazy 1.0 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 950. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 45 | 52% | 98 |
| tzu.TheArtOfWar 1.2 | 16 | 19% | 57 |
| jwirde.Gort 2.0 | 5 | 6% | 19 |
| wompi.Quokka 1.6 | 5 | 6% | 12 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 6% | 10 |
| stf.PanzerGeneral 0.1 | 3 | 3% | 8 |
| disan.Chair 2.2.0 | 3 | 3% | 4 |
| sample.Crazy 1.0 | 0 | 0% | 1 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 158890 melee ticks, 50576 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 53 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 53 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 55723 sent, 51312 reached their opponent, 11325 virtual hits (22.1% of those reached).

## Melee bench: F45

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 685 over 6 battles (114.2 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.9 | 103 / 210 | 2.18 | 19.0% | 30619 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1gc | 1.0 | 19.0% | 103 |
| jje.BagPuss 1.2 | 2.3 | 12.7% | 10 |
| eem.IWillFireNoBullet v2.8 | 3.0 | 12.4% | 80 |
| sul.Lunar 1.1 | 3.8 | 10.6% | 11 |
| myl.nano.Graviton 1.10 | 4.8 | 10.0% | 2 |
| hvilela.HVilela 0.9 | 7.0 | 8.5% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 8.5% | 2 |
| fm.claire 1.7 | 7.0 | 8.3% | 0 |
| wit.Deep7 2.0 | 9.2 | 5.4% | 2 |
| abud.ThirdRobo 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 91.7 | 22 / 35 | 5286 |
| 2 | 1 | 69.5 | 88.9 | 18 / 35 | 5436 |
| 3 | 1 | 68.0 | 84.4 | 18 / 35 | 4684 |
| 4 | 1 | 69.6 | 90.2 | 18 / 35 | 5497 |
| 5 | 1 | 66.9 | 82.9 | 14 / 35 | 4863 |
| 6 | 1 | 67.0 | 83.2 | 13 / 35 | 4853 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 91 | 53% |
| jje.BagPuss 1.2 | 22 | 91% |
| sul.Lunar 1.1 | 16 | 75% |
| myl.nano.Graviton 1.10 | 12 | 92% |
| pez.mini.ChironexFleckeri 0.5 | 9 | 89% |
| wit.Deep7 2.0 | 3 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 1570. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 46 | 40% | 0 |
| jje.BagPuss 1.2 | 27 | 23% | 72 |
| sul.Lunar 1.1 | 11 | 10% | 47 |
| myl.nano.Graviton 1.10 | 11 | 10% | 37 |
| fm.claire 1.7 | 5 | 4% | 10 |
| hvilela.HVilela 0.9 | 4 | 3% | 16 |
| pez.mini.ChironexFleckeri 0.5 | 3 | 3% | 15 |
| wit.Deep7 2.0 | 1 | 1% | 9 |
| abud.ThirdRobo 1.0 | 1 | 1% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 206037 melee ticks, 92845 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 46 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 62578 sent, 58270 reached their opponent, 9483 virtual hits (16.3% of those reached).

## Melee bench: F46

hadur2.Hadur 3.17.1gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 284 over 6 battles (47.3 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 81.8 | 57 / 210 | 2.64 | 15.6% | 21534 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.5 | 16.8% | 47 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.8% | 90 |
| hadur2.Hadur 3.17.1gc | 2.7 | 15.6% | 57 |
| mz.MicroSheep 1.0 | 4.2 | 10.6% | 3 |
| cx.Princess 1.0 | 5.2 | 9.4% | 10 |
| sadoner.killer 0.2 | 5.8 | 9.0% | 2 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.4% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.2 | 6.0% | 0 |
| kurios.DOSexe .9a | 8.7 | 5.2% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.6 | 80.0 | 10 / 35 | 3853 |
| 2 | 3 | 62.6 | 79.4 | 7 / 35 | 3231 |
| 3 | 3 | 63.7 | 77.1 | 9 / 35 | 3735 |
| 4 | 1 | 67.1 | 89.5 | 14 / 35 | 3660 |
| 5 | 3 | 64.5 | 83.5 | 7 / 35 | 3557 |
| 6 | 3 | 64.3 | 81.3 | 10 / 35 | 3498 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 60 | 68% |
| rsalesc.melee.Medina 0.4.5 | 42 | 19% |
| cx.Princess 1.0 | 8 | 25% |
| mz.MicroSheep 1.0 | 5 | 80% |
| arthord.NanoSatanMelee Beta | 2 | 50% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 155 of 210 rounds, at a mean tick of 923. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 66 | 43% | 104 |
| rsalesc.melee.Medina 0.4.5 | 51 | 33% | 60 |
| sadoner.killer 0.2 | 10 | 6% | 14 |
| cx.Princess 1.0 | 10 | 6% | 11 |
| mz.MicroSheep 1.0 | 7 | 5% | 12 |
| arthord.NanoSatanMelee Beta | 6 | 4% | 7 |
| kurios.DOSexe .9a | 3 | 2% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 155822 melee ticks, 41837 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 47 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 45910 sent, 41265 reached their opponent, 6813 virtual hits (16.5% of those reached).

