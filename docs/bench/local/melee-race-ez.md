# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 405 over 10 battles (40.5 per battle, most in one battle 55). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 90.6 | 201 / 350 | 1.85 | 19.5% | 57365 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.2 | 19.5% | 201 |
| voidious.Diamond 1.8.28 | 1.8 | 18.2% | 120 |
| sgp.JollyNinja 3.53 | 3.2 | 11.4% | 18 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.6 | 10.8% | 7 |
| mz.MicroGodMelee 1 | 4.9 | 10.2% | 3 |
| lorneswork.Predator 1.0 | 5.3 | 9.5% | 2 |
| adt.Ar2 1.0 | 7.0 | 7.6% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.1 | 5.3% | 1 |
| skm.butterfly 1.0 | 8.9 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 91.4 | 21 / 35 | 5508 |
| 2 | 2 | 67.9 | 85.7 | 15 / 35 | 5200 |
| 3 | 1 | 70.7 | 91.4 | 21 / 35 | 5872 |
| 4 | 1 | 71.3 | 91.7 | 23 / 35 | 6179 |
| 5 | 1 | 70.7 | 93.0 | 24 / 35 | 5627 |
| 6 | 1 | 71.1 | 92.7 | 19 / 35 | 6062 |
| 7 | 2 | 68.7 | 88.9 | 18 / 35 | 5276 |
| 8 | 1 | 69.4 | 87.9 | 18 / 35 | 5861 |
| 9 | 1 | 70.9 | 93.0 | 21 / 35 | 5933 |
| 10 | 1 | 70.3 | 90.2 | 21 / 35 | 5847 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 209 | 65% |
| sgp.JollyNinja 3.53 | 39 | 77% |
| mz.MicroGodMelee 1 | 18 | 94% |
| simonton.nano.WeekendObsession_Melee 1.0 | 12 | 83% |
| lorneswork.Predator 1.0 | 5 | 80% |
| adt.Ar2 1.0 | 2 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 151 of 350 rounds, at a mean tick of 1300. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 88 | 58% | 231 |
| sgp.JollyNinja 3.53 | 25 | 17% | 42 |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 10% | 26 |
| lorneswork.Predator 1.0 | 10 | 7% | 17 |
| mz.MicroGodMelee 1 | 8 | 5% | 26 |
| adt.Ar2 1.0 | 3 | 2% | 4 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 1 |
| skm.butterfly 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 331 rounds): 227002 melee ticks, 399441 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 182 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 128 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 0.

Targeting waves (331 rounds): 71034 sent, 63047 reached their opponent, 12054 virtual hits (19.1% of those reached).

## Melee bench: F02

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 428 over 10 battles (42.8 per battle, most in one battle 47). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.3 | 197 / 350 | 2.24 | 19.1% | 52761 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 19.1% | 197 |
| pulsar.PulsarMax 0.8.9 | 2.4 | 14.3% | 66 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.7% | 45 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.3% | 7 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 9.7% | 10 |
| fnc.bandit.Bandit 5.2.0 | 6.6 | 8.0% | 1 |
| Noran.BitchingElk 0.054 | 7.0 | 7.4% | 15 |
| sch.Simone 0.3d | 7.3 | 7.4% | 6 |
| stelo.PatternRobot 1.0 | 9.1 | 5.4% | 3 |
| fullsail.SweetTea 1.1 | 9.9 | 3.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 84.4 | 15 / 35 | 5116 |
| 2 | 1 | 67.1 | 80.6 | 19 / 35 | 4634 |
| 3 | 1 | 70.1 | 89.5 | 22 / 35 | 5253 |
| 4 | 1 | 70.2 | 89.5 | 20 / 35 | 5646 |
| 5 | 1 | 68.7 | 84.1 | 17 / 35 | 5323 |
| 6 | 1 | 70.9 | 91.1 | 23 / 35 | 5824 |
| 7 | 1 | 70.0 | 89.2 | 24 / 35 | 5542 |
| 8 | 1 | 69.2 | 87.6 | 20 / 35 | 5144 |
| 9 | 1 | 69.5 | 86.7 | 18 / 35 | 5717 |
| 10 | 1 | 66.5 | 79.7 | 19 / 35 | 4562 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 118 | 73% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 61 | 69% |
| com.cohesiva.robocode.ManOwaR 1.0 | 26 | 96% |
| Noran.BitchingElk 0.054 | 19 | 68% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 94% |
| sch.Simone 0.3d | 8 | 100% |
| fnc.bandit.Bandit 5.2.0 | 4 | 75% |
| stelo.PatternRobot 1.0 | 4 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 153 of 350 rounds, at a mean tick of 913. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 48 | 31% | 119 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 39 | 25% | 91 |
| com.cohesiva.robocode.ManOwaR 1.0 | 15 | 10% | 44 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 9% | 26 |
| Noran.BitchingElk 0.054 | 11 | 7% | 27 |
| stelo.PatternRobot 1.0 | 11 | 7% | 14 |
| fnc.bandit.Bandit 5.2.0 | 10 | 7% | 14 |
| sch.Simone 0.3d | 3 | 2% | 12 |
| fullsail.SweetTea 1.1 | 2 | 1% | 3 |

Posture (Hadur's M records, 333 rounds): 266397 melee ticks, 89894 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 47 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 0.

Targeting waves (333 rounds): 92215 sent, 84283 reached their opponent, 13948 virtual hits (16.5% of those reached).

## Melee bench: F03

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 327 over 10 battles (32.7 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 95.0 | 300 / 350 | 1.45 | 21.8% | 68368 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 21.8% | 300 |
| radnor.DoctorBob 1.42 | 2.0 | 14.2% | 23 |
| kawigi.nano.Lib 1.0 | 3.4 | 12.5% | 7 |
| vuen.Cake 2.51 | 3.6 | 12.5% | 19 |
| urdos.URDOS 1.3 | 5.0 | 8.9% | 1 |
| adt.Ar1 2.1 | 6.3 | 7.5% | 0 |
| oa.weak.FlyMk1 0.1 | 7.2 | 6.6% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.8 | 6.1% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.1 | 5.1% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.6 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 95.9 | 29 / 35 | 6651 |
| 2 | 1 | 72.9 | 95.2 | 32 / 35 | 7023 |
| 3 | 1 | 72.3 | 95.6 | 29 / 35 | 6904 |
| 4 | 1 | 72.6 | 97.5 | 33 / 35 | 6618 |
| 5 | 1 | 72.5 | 94.6 | 28 / 35 | 7098 |
| 6 | 1 | 71.8 | 92.7 | 28 / 35 | 6773 |
| 7 | 1 | 71.2 | 92.4 | 29 / 35 | 6432 |
| 8 | 1 | 71.4 | 92.4 | 29 / 35 | 6565 |
| 9 | 1 | 73.6 | 99.4 | 33 / 35 | 7163 |
| 10 | 1 | 72.7 | 94.9 | 30 / 35 | 7141 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 123 | 93% |
| radnor.DoctorBob 1.42 | 111 | 96% |
| kawigi.nano.Lib 1.0 | 66 | 97% |
| urdos.URDOS 1.3 | 7 | 86% |
| oa.weak.FlyMk1 0.1 | 7 | 100% |
| adt.Ar1 2.1 | 2 | 100% |

Hadur died in 50 of 350 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 18 | 36% | 109 |
| vuen.Cake 2.51 | 15 | 30% | 136 |
| bwbaugh.nano.Tirunculus 0.0.0a | 7 | 14% | 7 |
| kawigi.nano.Lib 1.0 | 4 | 8% | 50 |
| urdos.URDOS 1.3 | 2 | 4% | 11 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 4% | 7 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 13 |
| adt.Ar1 2.1 | 1 | 2% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 7 |

Posture (Hadur's M records, 330 rounds): 212110 melee ticks, 77745 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 48 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 1.

Targeting waves (330 rounds): 62605 sent, 54378 reached their opponent, 12895 virtual hits (23.7% of those reached).

## Melee bench: F04

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 248 over 10 battles (24.8 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 87.4 | 88 / 350 | 2.13 | 18.6% | 60900 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.2% | 244 |
| hadur117.Hadur 3.24ez | 2.0 | 18.6% | 88 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.3% | 11 |
| TNT.TNT 0.99.1 | 4.1 | 10.8% | 7 |
| josago.Jorgito 0.16 | 4.9 | 9.7% | 1 |
| css.Delitioner 0.11 | 6.1 | 7.2% | 0 |
| tj.zombie1n 1.0.1 | 7.0 | 6.3% | 0 |
| rampancy.Durandal 2.1d | 7.9 | 5.4% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.5% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 70.4 | 88.9 | 12 / 35 | 6369 |
| 2 | 2 | 70.7 | 92.1 | 12 / 35 | 6179 |
| 3 | 2 | 69.6 | 87.6 | 8 / 35 | 6179 |
| 4 | 2 | 68.3 | 84.1 | 6 / 35 | 5718 |
| 5 | 2 | 69.0 | 86.0 | 7 / 35 | 5931 |
| 6 | 2 | 70.8 | 90.2 | 8 / 35 | 6489 |
| 7 | 2 | 69.8 | 86.7 | 11 / 35 | 6014 |
| 8 | 2 | 71.1 | 89.5 | 12 / 35 | 6488 |
| 9 | 2 | 68.5 | 85.1 | 7 / 35 | 5721 |
| 10 | 2 | 68.2 | 83.8 | 5 / 35 | 5812 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 240 | 24% |
| apc.LeeroyJenkins2 1.0 | 20 | 75% |
| TNT.TNT 0.99.1 | 14 | 79% |
| josago.Jorgito 0.16 | 4 | 100% |

Hadur died in 263 of 350 rounds, at a mean tick of 2088. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 200 | 76% | 259 |
| apc.LeeroyJenkins2 1.0 | 33 | 13% | 45 |
| TNT.TNT 0.99.1 | 17 | 6% | 29 |
| josago.Jorgito 0.16 | 9 | 3% | 13 |
| rampancy.Durandal 2.1d | 3 | 1% | 3 |
| css.Delitioner 0.11 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 333 rounds): 302801 melee ticks, 477628 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 73 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 1.

Targeting waves (333 rounds): 91911 sent, 83948 reached their opponent, 12117 virtual hits (14.4% of those reached).

## Melee bench: F05

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 319 over 10 battles (31.9 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 81.4 | 72 / 350 | 2.68 | 16.3% | 44794 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 17.8% | 160 |
| justin.DemonicRage 3.4 | 2.1 | 16.7% | 97 |
| hadur117.Hadur 3.24ez | 2.6 | 16.3% | 72 |
| wompi.Numbat 2.1 | 4.0 | 12.3% | 13 |
| ms.Ares 0.19 | 5.3 | 9.6% | 1 |
| axeBots.HataMoto 3.09 | 5.7 | 9.0% | 7 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.6 | 5.3% | 0 |
| supersample.SuperBoxBot 1.0 | 7.6 | 5.3% | 0 |
| GarmBox.Oranges 1.0 | 9.3 | 4.0% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.7 | 79.0 | 6 / 35 | 4443 |
| 2 | 2 | 66.3 | 82.2 | 6 / 35 | 4617 |
| 3 | 3 | 66.4 | 82.5 | 6 / 35 | 4578 |
| 4 | 3 | 65.8 | 80.3 | 8 / 35 | 4219 |
| 5 | 3 | 66.0 | 80.3 | 6 / 35 | 4547 |
| 6 | 3 | 64.2 | 77.1 | 5 / 35 | 4183 |
| 7 | 3 | 65.4 | 79.4 | 6 / 35 | 4425 |
| 8 | 3 | 65.4 | 81.0 | 4 / 35 | 4318 |
| 9 | 1 | 67.8 | 85.4 | 14 / 35 | 4585 |
| 10 | 2 | 68.0 | 86.3 | 11 / 35 | 4879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 83 | 47% |
| cb.fire.Firestarter 2.0f | 65 | 18% |
| wompi.Numbat 2.1 | 19 | 74% |
| axeBots.HataMoto 3.09 | 4 | 75% |
| ms.Ares 0.19 | 4 | 100% |

Hadur died in 278 of 350 rounds, at a mean tick of 1071. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 122 | 44% | 155 |
| cb.fire.Firestarter 2.0f | 104 | 37% | 117 |
| wompi.Numbat 2.1 | 28 | 10% | 43 |
| ms.Ares 0.19 | 12 | 4% | 17 |
| axeBots.HataMoto 3.09 | 11 | 4% | 15 |
| supersample.SuperBoxBot 1.0 | 1 | 0% | 2 |

Posture (Hadur's M records, 338 rounds): 265430 melee ticks, 129388 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (338 rounds): longest scan gap while four or more were alive 64 ticks (338 rounds over 8); rounds whose longest gap at any count was over 8: 338; robots dropped as dead without a death event: 1.

Targeting waves (338 rounds): 78268 sent, 69744 reached their opponent, 10951 virtual hits (15.7% of those reached).

## Melee bench: F06

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 375 over 10 battles (37.5 per battle, most in one battle 47). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 93.5 | 261 / 350 | 1.58 | 21.2% | 59939 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 21.2% | 261 |
| jekl.StoneGhost 0.7 | 2.1 | 14.4% | 28 |
| origin.SleepSiphon 1.7b | 3.1 | 13.2% | 37 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 11.8% | 14 |
| mld.Wisdom 1.0 | 5.0 | 10.1% | 1 |
| gg.Wolverine 2.0 | 6.3 | 8.2% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 6.6% | 5 |
| spinnercat.Omen 1.0 | 8.0 | 6.0% | 1 |
| DBall.NUKE 0.1 | 8.2 | 5.9% | 0 |
| sample.Fire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 91.1 | 24 / 35 | 6044 |
| 2 | 1 | 72.7 | 94.0 | 26 / 35 | 6584 |
| 3 | 1 | 71.2 | 91.7 | 26 / 35 | 5433 |
| 4 | 1 | 71.0 | 92.4 | 22 / 35 | 5653 |
| 5 | 1 | 72.2 | 93.7 | 26 / 35 | 6356 |
| 6 | 1 | 71.9 | 94.0 | 27 / 35 | 5896 |
| 7 | 1 | 71.9 | 94.3 | 27 / 35 | 5789 |
| 8 | 1 | 72.0 | 94.9 | 26 / 35 | 5769 |
| 9 | 1 | 72.7 | 95.2 | 29 / 35 | 6210 |
| 10 | 1 | 72.4 | 94.0 | 28 / 35 | 6205 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 110 | 91% |
| origin.SleepSiphon 1.7b | 89 | 89% |
| pe.minimelee.SandboxMiniMelee 1.1 | 47 | 94% |
| gg.Wolverine 2.0 | 14 | 86% |
| mld.Wisdom 1.0 | 11 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 9 | 100% |
| DBall.NUKE 0.1 | 3 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 89 of 350 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 35 | 39% | 112 |
| jekl.StoneGhost 0.7 | 25 | 28% | 106 |
| pe.minimelee.SandboxMiniMelee 1.1 | 10 | 11% | 60 |
| mld.Wisdom 1.0 | 8 | 9% | 29 |
| gg.Wolverine 2.0 | 5 | 6% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 3% | 17 |
| spinnercat.Omen 1.0 | 2 | 2% | 4 |
| DBall.NUKE 0.1 | 1 | 1% | 3 |

Posture (Hadur's M records, 331 rounds): 244367 melee ticks, 81963 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 32 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 0.

Targeting waves (331 rounds): 73458 sent, 65593 reached their opponent, 13954 virtual hits (21.3% of those reached).

## Melee bench: F07

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 234 over 10 battles (23.4 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.7 | 94.9 | 251 / 350 | 1.46 | 21.9% | 69330 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 21.9% | 251 |
| rsalesc.melee.Monk 0.3.6c | 2.4 | 16.5% | 40 |
| rtk.Tachikoma 1.0 | 2.6 | 16.2% | 38 |
| oog.melee.CapuletDroid 1.1 | 4.1 | 11.2% | 9 |
| franzor.Lizt 1.3.1 | 4.9 | 10.3% | 12 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 8.0% | 0 |
| exauge.GateKeeper 1.1.121g | 7.0 | 7.3% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.2 | 2.1% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 93.7 | 24 / 35 | 6729 |
| 2 | 1 | 73.9 | 96.2 | 27 / 35 | 7045 |
| 3 | 1 | 73.6 | 95.6 | 27 / 35 | 6666 |
| 4 | 1 | 73.4 | 94.3 | 24 / 35 | 6687 |
| 5 | 1 | 74.2 | 96.8 | 25 / 35 | 7207 |
| 6 | 1 | 74.0 | 94.9 | 26 / 35 | 6999 |
| 7 | 1 | 74.2 | 94.6 | 26 / 35 | 7486 |
| 8 | 1 | 74.1 | 96.8 | 27 / 35 | 6778 |
| 9 | 1 | 73.6 | 94.9 | 24 / 35 | 6948 |
| 10 | 1 | 72.6 | 91.1 | 21 / 35 | 6785 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 167 | 83% |
| rsalesc.melee.Monk 0.3.6c | 81 | 70% |
| oog.melee.CapuletDroid 1.1 | 41 | 88% |
| franzor.Lizt 1.3.1 | 29 | 66% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 99 of 350 rounds, at a mean tick of 1428. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 46 | 46% | 165 |
| rsalesc.melee.Monk 0.3.6c | 32 | 32% | 105 |
| franzor.Lizt 1.3.1 | 10 | 10% | 6 |
| oog.melee.CapuletDroid 1.1 | 8 | 8% | 60 |
| exauge.GateKeeper 1.1.121g | 2 | 2% | 10 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 4 |

Posture (Hadur's M records, 334 rounds): 294843 melee ticks, 233645 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (334 rounds): longest scan gap while four or more were alive 34 ticks (334 rounds over 8); rounds whose longest gap at any count was over 8: 334; robots dropped as dead without a death event: 0.

Targeting waves (334 rounds): 87344 sent, 79185 reached their opponent, 15125 virtual hits (19.1% of those reached).

## Melee bench: F08

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 510 over 10 battles (51.0 per battle, most in one battle 65). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 94.1 | 272 / 350 | 1.53 | 20.8% | 53150 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 20.8% | 272 |
| tm.Yuugao 1.0 | 2.3 | 13.1% | 35 |
| shrub.Vapour v159 | 2.9 | 12.1% | 18 |
| Krabb.sliNk.Garm 0.9u | 3.8 | 11.2% | 17 |
| com.spp.robocode.MostlyHarmless 010 | 5.6 | 9.1% | 5 |
| m3thos.Eva00 1.1 | 6.0 | 8.9% | 3 |
| jwst.DAD.DarkAndDarker 1.1 | 6.6 | 8.2% | 1 |
| qualidafial.MajorDick 1.0.1 | 7.8 | 6.7% | 0 |
| SHAM.WOW 1.4 | 9.4 | 5.0% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.6 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 94.6 | 30 / 35 | 5431 |
| 2 | 1 | 70.1 | 91.4 | 25 / 35 | 5112 |
| 3 | 1 | 72.3 | 96.2 | 30 / 35 | 5751 |
| 4 | 1 | 70.4 | 94.3 | 25 / 35 | 5100 |
| 5 | 1 | 70.4 | 93.3 | 23 / 35 | 5261 |
| 6 | 1 | 67.6 | 86.0 | 21 / 35 | 4690 |
| 7 | 1 | 71.3 | 95.6 | 29 / 35 | 5292 |
| 8 | 1 | 72.1 | 97.5 | 30 / 35 | 5485 |
| 9 | 1 | 70.8 | 94.9 | 28 / 35 | 5070 |
| 10 | 1 | 72.3 | 97.5 | 31 / 35 | 5958 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 102 | 87% |
| shrub.Vapour v159 | 71 | 90% |
| Krabb.sliNk.Garm 0.9u | 54 | 87% |
| com.spp.robocode.MostlyHarmless 010 | 37 | 92% |
| m3thos.Eva00 1.1 | 17 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 13 | 100% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |

Hadur died in 80 of 350 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 22 | 28% | 114 |
| shrub.Vapour v159 | 17 | 21% | 74 |
| Krabb.sliNk.Garm 0.9u | 17 | 21% | 58 |
| com.spp.robocode.MostlyHarmless 010 | 10 | 13% | 40 |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 8% | 29 |
| m3thos.Eva00 1.1 | 5 | 6% | 21 |
| zyx.nano.BacillusComma 1.0 | 2 | 3% | 4 |
| SHAM.WOW 1.4 | 0 | 0% | 6 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 334 rounds): 245079 melee ticks, 92112 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 537 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (334 rounds): longest scan gap while four or more were alive 187 ticks (334 rounds over 8); rounds whose longest gap at any count was over 8: 334; robots dropped as dead without a death event: 0.

Targeting waves (334 rounds): 78382 sent, 70022 reached their opponent, 12039 virtual hits (17.2% of those reached).

## Melee bench: F09

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 339 over 10 battles (33.9 per battle, most in one battle 48). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 79.5 | 127 / 350 | 2.85 | 16.3% | 39177 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.5 | 16.9% | 135 |
| hadur117.Hadur 3.24ez | 1.8 | 16.3% | 127 |
| kc.micro.Figment 1.0 | 2.7 | 14.3% | 44 |
| pedersen.Grishnakh 1.0 | 4.6 | 10.5% | 27 |
| yagami.Tidus 0.11 | 4.7 | 10.4% | 2 |
| mc2.enemy.Original 0.9 | 5.9 | 8.8% | 14 |
| dft.Calliope 5.6 | 6.9 | 7.8% | 1 |
| step.nanoPri 1.0 | 8.0 | 6.0% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.4 | 4.6% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 79.7 | 15 / 35 | 3691 |
| 2 | 1 | 68.6 | 87.3 | 19 / 35 | 4577 |
| 3 | 3 | 61.9 | 73.0 | 6 / 35 | 3534 |
| 4 | 2 | 65.6 | 81.6 | 11 / 35 | 3957 |
| 5 | 1 | 67.7 | 84.8 | 18 / 35 | 4401 |
| 6 | 1 | 66.5 | 83.5 | 12 / 35 | 4191 |
| 7 | 3 | 59.8 | 67.6 | 6 / 35 | 3064 |
| 8 | 2 | 64.1 | 76.2 | 13 / 35 | 3704 |
| 9 | 1 | 65.9 | 80.6 | 14 / 35 | 4205 |
| 10 | 2 | 65.6 | 80.6 | 13 / 35 | 3853 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 98 | 56% |
| kc.micro.Figment 1.0 | 57 | 77% |
| pedersen.Grishnakh 1.0 | 15 | 47% |
| yagami.Tidus 0.11 | 13 | 92% |
| mc2.enemy.Original 0.9 | 10 | 40% |
| dft.Calliope 5.6 | 5 | 100% |

Hadur died in 224 of 350 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 82 | 37% | 137 |
| kc.micro.Figment 1.0 | 42 | 19% | 84 |
| mc2.enemy.Original 0.9 | 25 | 11% | 33 |
| pedersen.Grishnakh 1.0 | 24 | 11% | 28 |
| yagami.Tidus 0.11 | 23 | 10% | 29 |
| dft.Calliope 5.6 | 9 | 4% | 17 |
| step.nanoPri 1.0 | 9 | 4% | 11 |
| rdm.Dueler 0.4x | 6 | 3% | 7 |
| robar.nano.Assertive_Melee 0.2 | 3 | 1% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 332 rounds): 239512 melee ticks, 85667 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 51 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 0.

Targeting waves (332 rounds): 77371 sent, 69509 reached their opponent, 9801 virtual hits (14.1% of those reached).

## Melee bench: F10

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 439 over 10 battles (43.9 per battle, most in one battle 56). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 95.7 | 295 / 350 | 1.39 | 21.3% | 60143 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 21.3% | 295 |
| DTF.Kludgy 1.2b | 2.2 | 14.3% | 22 |
| ejb.Polaris 1.0.1 | 3.4 | 12.8% | 7 |
| ne.Chimera 1.2 | 3.4 | 12.8% | 16 |
| tvv.micro.Antares 1.1.1 | 5.4 | 9.7% | 7 |
| vStar.RAFzilla 2.15 | 5.6 | 9.6% | 2 |
| kurios.DOSexe .9b | 7.3 | 5.9% | 0 |
| sam.Samspin 1.0 | 8.4 | 5.1% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.4 | 5.0% | 1 |
| donjezza.Muncho 1.0 | 9.9 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 96.8 | 31 / 35 | 6418 |
| 2 | 1 | 69.9 | 88.3 | 26 / 35 | 5446 |
| 3 | 1 | 72.5 | 97.8 | 32 / 35 | 5979 |
| 4 | 1 | 71.5 | 94.0 | 30 / 35 | 6015 |
| 5 | 1 | 72.1 | 97.8 | 32 / 35 | 5857 |
| 6 | 1 | 70.4 | 93.0 | 23 / 35 | 5475 |
| 7 | 1 | 73.4 | 99.0 | 33 / 35 | 6461 |
| 8 | 1 | 71.9 | 94.6 | 28 / 35 | 6238 |
| 9 | 1 | 72.5 | 97.8 | 29 / 35 | 6237 |
| 10 | 1 | 72.8 | 97.8 | 31 / 35 | 6017 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 109 | 89% |
| ejb.Polaris 1.0.1 | 83 | 99% |
| ne.Chimera 1.2 | 69 | 90% |
| vStar.RAFzilla 2.15 | 31 | 94% |
| tvv.micro.Antares 1.1.1 | 18 | 94% |
| kurios.DOSexe .9b | 6 | 100% |
| donjezza.Muncho 1.0 | 1 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 0% |

Hadur died in 58 of 350 rounds, at a mean tick of 858. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 27 | 47% | 109 |
| ne.Chimera 1.2 | 16 | 28% | 76 |
| ejb.Polaris 1.0.1 | 6 | 10% | 90 |
| vStar.RAFzilla 2.15 | 3 | 5% | 32 |
| tvv.micro.Antares 1.1.1 | 3 | 5% | 16 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 5% | 5 |
| kurios.DOSexe .9b | 0 | 0% | 14 |
| sam.Samspin 1.0 | 0 | 0% | 5 |

Posture (Hadur's M records, 331 rounds): 232584 melee ticks, 96306 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 49 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 2.

Targeting waves (331 rounds): 74703 sent, 66580 reached their opponent, 11742 virtual hits (17.6% of those reached).

## Melee bench: F11

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 385 over 10 battles (38.5 per battle, most in one battle 49). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 82.3 | 143 / 350 | 2.59 | 16.9% | 40699 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.1 | 16.9% | 143 |
| rz.Aleph 0.34 | 1.9 | 16.3% | 100 |
| cx.mini.Nimrod 0.55 | 3.1 | 12.6% | 37 |
| djc.DynaBot 0.1.1 | 4.1 | 11.1% | 24 |
| rdt199.Warlord 0.73 | 5.4 | 9.4% | 26 |
| br2.MobyDickBot 1.6 | 6.5 | 8.5% | 11 |
| uji.YellohFellah 1.0 | 6.6 | 8.2% | 11 |
| KiraNL.Chupacabra 0.4 | 7.3 | 7.6% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.1% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 80.3 | 14 / 35 | 3984 |
| 2 | 1 | 64.5 | 78.4 | 15 / 35 | 3912 |
| 3 | 1 | 66.0 | 84.1 | 15 / 35 | 4099 |
| 4 | 1 | 65.9 | 82.5 | 12 / 35 | 4096 |
| 5 | 1 | 66.3 | 84.8 | 12 / 35 | 4133 |
| 6 | 1 | 65.5 | 80.6 | 15 / 35 | 3961 |
| 7 | 1 | 68.0 | 86.7 | 18 / 35 | 4478 |
| 8 | 2 | 63.8 | 77.8 | 10 / 35 | 3767 |
| 9 | 1 | 67.2 | 86.3 | 18 / 35 | 4056 |
| 10 | 1 | 66.0 | 81.9 | 14 / 35 | 4213 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 94 | 70% |
| cx.mini.Nimrod 0.55 | 29 | 72% |
| rdt199.Warlord 0.73 | 28 | 64% |
| djc.DynaBot 0.1.1 | 22 | 73% |
| uji.YellohFellah 1.0 | 13 | 69% |
| br2.MobyDickBot 1.6 | 8 | 100% |
| KiraNL.Chupacabra 0.4 | 4 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 207 of 350 rounds, at a mean tick of 844. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 87 | 42% | 155 |
| cx.mini.Nimrod 0.55 | 40 | 19% | 57 |
| rdt199.Warlord 0.73 | 30 | 14% | 49 |
| djc.DynaBot 0.1.1 | 21 | 10% | 36 |
| uji.YellohFellah 1.0 | 9 | 4% | 16 |
| KiraNL.Chupacabra 0.4 | 9 | 4% | 12 |
| br2.MobyDickBot 1.6 | 8 | 4% | 17 |
| stelo.MirrorNano 1.3 | 3 | 1% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 0 | 0% | 2 |

Posture (Hadur's M records, 336 rounds): 257815 melee ticks, 71149 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (336 rounds): longest scan gap while four or more were alive 55 ticks (336 rounds over 8); rounds whose longest gap at any count was over 8: 336; robots dropped as dead without a death event: 0.

Targeting waves (336 rounds): 82418 sent, 74054 reached their opponent, 9869 virtual hits (13.3% of those reached).

## Melee bench: F12

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 354 over 10 battles (35.4 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 85.9 | 193 / 350 | 2.27 | 18.1% | 41267 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 18.1% | 193 |
| bts.wiki.RipCurl 0.9b | 2.4 | 13.7% | 40 |
| nat.PallasHawk 1.0 | 2.7 | 13.2% | 54 |
| darkcanuck.Leon 1.01 | 4.0 | 12.0% | 28 |
| brainfade.melee.Genghis 0.36 | 4.9 | 10.7% | 29 |
| jrm.Test0 1.0 | 6.2 | 8.3% | 2 |
| cs.sheldor.Talon 1.1 | 6.8 | 7.2% | 1 |
| jp.Perpy 16.0 | 8.3 | 6.2% | 1 |
| stuff.Vlad 0.1 | 9.3 | 5.4% | 0 |
| jaybot.bots.Oddball 4.0 | 9.4 | 5.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 86.0 | 21 / 35 | 3771 |
| 2 | 1 | 68.7 | 90.5 | 19 / 35 | 4552 |
| 3 | 1 | 69.5 | 94.0 | 21 / 35 | 4374 |
| 4 | 1 | 65.0 | 76.8 | 15 / 35 | 4185 |
| 5 | 1 | 66.2 | 82.2 | 18 / 35 | 3866 |
| 6 | 1 | 67.5 | 87.6 | 20 / 35 | 3941 |
| 7 | 1 | 66.5 | 80.6 | 19 / 35 | 4183 |
| 8 | 1 | 68.4 | 89.8 | 19 / 35 | 4195 |
| 9 | 1 | 68.0 | 86.7 | 22 / 35 | 4246 |
| 10 | 1 | 66.7 | 84.8 | 19 / 35 | 3954 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 81 | 63% |
| bts.wiki.RipCurl 0.9b | 80 | 85% |
| darkcanuck.Leon 1.01 | 56 | 89% |
| brainfade.melee.Genghis 0.36 | 23 | 57% |
| jaybot.bots.Oddball 4.0 | 5 | 100% |
| jrm.Test0 1.0 | 4 | 100% |
| jp.Perpy 16.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 158 of 350 rounds, at a mean tick of 706. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 43 | 27% | 95 |
| bts.wiki.RipCurl 0.9b | 37 | 23% | 89 |
| brainfade.melee.Genghis 0.36 | 27 | 17% | 40 |
| darkcanuck.Leon 1.01 | 22 | 14% | 78 |
| jrm.Test0 1.0 | 12 | 8% | 16 |
| cs.sheldor.Talon 1.1 | 8 | 5% | 11 |
| jp.Perpy 16.0 | 6 | 4% | 9 |
| stuff.Vlad 0.1 | 2 | 1% | 6 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 5 |

Posture (Hadur's M records, 332 rounds): 212313 melee ticks, 70474 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 90 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 90 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 0.

Targeting waves (332 rounds): 71292 sent, 62915 reached their opponent, 10018 virtual hits (15.9% of those reached).

## Melee bench: F13

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 345 over 10 battles (34.5 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 83.7 | 141 / 350 | 2.47 | 16.9% | 45402 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.3 | 16.9% | 141 |
| ags.Glacier 0.2.11 | 1.9 | 16.3% | 70 |
| mn.Combat 3.25.0 | 2.8 | 15.6% | 97 |
| shinh.Entangled 0.3 | 4.3 | 12.1% | 31 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.5% | 11 |
| apc.Colossus2 0.17 | 6.0 | 8.0% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.6% | 0 |
| maribo.FollowFire 1 | 8.2 | 5.0% | 0 |
| ayk.WallHugger 1.0 | 8.8 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 89.8 | 17 / 35 | 4996 |
| 2 | 1 | 66.9 | 81.9 | 15 / 35 | 4704 |
| 3 | 1 | 67.7 | 87.0 | 14 / 35 | 4894 |
| 4 | 1 | 66.8 | 84.1 | 15 / 35 | 4305 |
| 5 | 2 | 64.5 | 77.8 | 12 / 35 | 4238 |
| 6 | 1 | 68.1 | 88.6 | 16 / 35 | 4653 |
| 7 | 1 | 66.3 | 80.6 | 14 / 35 | 4755 |
| 8 | 1 | 65.7 | 81.9 | 13 / 35 | 4273 |
| 9 | 2 | 66.4 | 84.4 | 13 / 35 | 4245 |
| 10 | 2 | 65.7 | 80.6 | 12 / 35 | 4339 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 79 | 63% |
| mn.Combat 3.25.0 | 73 | 66% |
| shinh.Entangled 0.3 | 39 | 74% |
| gh.micro.Gruweltje 0.7 | 12 | 83% |
| stelo.Wang 1.0 | 2 | 100% |
| apc.Colossus2 0.17 | 1 | 100% |
| ayk.WallHugger 1.0 | 1 | 100% |

Hadur died in 209 of 350 rounds, at a mean tick of 858. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 77 | 37% | 124 |
| mn.Combat 3.25.0 | 54 | 26% | 111 |
| shinh.Entangled 0.3 | 37 | 18% | 59 |
| gh.micro.Gruweltje 0.7 | 21 | 10% | 30 |
| maribo.FollowFire 1 | 8 | 4% | 8 |
| stelo.Wang 1.0 | 6 | 3% | 8 |
| apc.Colossus2 0.17 | 4 | 2% | 7 |
| sample.Tracker 1.0 | 1 | 0% | 1 |
| ayk.WallHugger 1.0 | 1 | 0% | 1 |

Posture (Hadur's M records, 335 rounds): 248595 melee ticks, 100685 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 116 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (335 rounds): longest scan gap while four or more were alive 116 ticks (335 rounds over 8); rounds whose longest gap at any count was over 8: 335; robots dropped as dead without a death event: 1.

Targeting waves (335 rounds): 69993 sent, 61402 reached their opponent, 9446 virtual hits (15.4% of those reached).

## Melee bench: F14

hadur117.Hadur 3.24ez against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 345 over 10 battles (34.5 per battle, most in one battle 46). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.1 | 95.8 | 312 / 350 | 1.34 | 24.3% | 64055 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 24.3% | 312 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 16.9% | 23 |
| Lo_Ian.Gandalf_V4 4.0 | 4.2 | 10.8% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 4.4 | 10.7% | 3 |
| co.edu.usb.rc.LidisTron 1.0 | 4.4 | 10.4% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.5% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.3 | 9.1% | 7 |
| pa.Improved 1.0 | 7.9 | 6.6% | 1 |
| sample.TrackFire 1.0 | 9.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 97.1 | 31 / 35 | 6402 |
| 2 | 1 | 71.9 | 92.1 | 27 / 35 | 6074 |
| 3 | 1 | 72.6 | 91.4 | 30 / 35 | 6497 |
| 4 | 1 | 73.7 | 98.9 | 33 / 35 | 6584 |
| 5 | 1 | 72.9 | 95.0 | 30 / 35 | 6266 |
| 6 | 1 | 73.2 | 95.7 | 32 / 35 | 6369 |
| 7 | 1 | 73.5 | 96.4 | 33 / 35 | 6480 |
| 8 | 1 | 73.5 | 97.1 | 32 / 35 | 6564 |
| 9 | 1 | 72.9 | 95.4 | 32 / 35 | 6446 |
| 10 | 1 | 73.8 | 98.6 | 32 / 35 | 6373 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 208 | 95% |
| sanyi.mikrobi.Roberto 1.0 | 36 | 97% |
| sheldor.micro.PointInLineRRAL 1.0 | 35 | 97% |
| co.edu.usb.rc.LidisTron 1.0 | 19 | 95% |
| Lo_Ian.Gandalf_V4 4.0 | 17 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| pa.Improved 1.0 | 4 | 100% |

Hadur died in 39 of 350 rounds, at a mean tick of 631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 19 | 49% | 192 |
| sanyi.mikrobi.Roberto 1.0 | 7 | 18% | 57 |
| co.edu.usb.rc.LidisTron 1.0 | 5 | 13% | 21 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 8% | 38 |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 8% | 21 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 5% | 12 |
| pa.Improved 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 330 rounds): 202857 melee ticks, 84585 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 49 ticks (329 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 0.

Targeting waves (330 rounds): 58626 sent, 51854 reached their opponent, 12815 virtual hits (24.7% of those reached).

## Melee bench: F15

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 390 over 10 battles (39.0 per battle, most in one battle 45). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 87.9 | 218 / 350 | 2.09 | 19.7% | 55555 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 19.7% | 218 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.3% | 32 |
| emp.Yngwie 1.11 | 3.1 | 12.7% | 52 |
| mld.DustBunny 3.8 | 3.3 | 12.5% | 10 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.7% | 11 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.2% | 26 |
| lambdaxy.TBot 0.1 | 7.3 | 6.7% | 0 |
| Grystrion.TrackerWO 1.0 | 7.8 | 6.1% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 4.7% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.6 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 83.8 | 18 / 35 | 5639 |
| 2 | 1 | 69.2 | 84.8 | 23 / 35 | 5524 |
| 3 | 1 | 70.1 | 87.6 | 23 / 35 | 5600 |
| 4 | 1 | 69.4 | 86.7 | 19 / 35 | 5593 |
| 5 | 1 | 70.7 | 90.2 | 23 / 35 | 6016 |
| 6 | 1 | 69.5 | 87.3 | 22 / 35 | 5298 |
| 7 | 1 | 70.1 | 90.2 | 22 / 35 | 5305 |
| 8 | 1 | 70.5 | 91.1 | 23 / 35 | 5516 |
| 9 | 1 | 70.0 | 87.9 | 22 / 35 | 5667 |
| 10 | 1 | 70.1 | 89.2 | 23 / 35 | 5397 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 93 | 83% |
| kawigi.micro.Shiz 1.1 | 53 | 94% |
| mld.DustBunny 3.8 | 48 | 96% |
| cb.nano.Insomnia 1.0 | 23 | 83% |
| kawigi.robot.Girl 1.2 | 23 | 78% |
| divineomega.TrialBot 0.003 | 5 | 100% |
| Grystrion.TrackerWO 1.0 | 2 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 132 of 350 rounds, at a mean tick of 884. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 47 | 36% | 146 |
| mld.DustBunny 3.8 | 24 | 18% | 55 |
| kawigi.micro.Shiz 1.1 | 19 | 14% | 53 |
| cb.nano.Insomnia 1.0 | 16 | 12% | 27 |
| kawigi.robot.Girl 1.2 | 14 | 11% | 27 |
| divineomega.TrialBot 0.003 | 5 | 4% | 23 |
| Grystrion.TrackerWO 1.0 | 5 | 4% | 8 |
| lambdaxy.TBot 0.1 | 1 | 1% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 3 |

Posture (Hadur's M records, 333 rounds): 263834 melee ticks, 91746 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 57 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 4.

Targeting waves (333 rounds): 84604 sent, 76628 reached their opponent, 12217 virtual hits (15.9% of those reached).

## Melee bench: F16

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 441 over 10 battles (44.1 per battle, most in one battle 56). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 92.1 | 248 / 350 | 1.71 | 21.1% | 61154 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 21.1% | 248 |
| gh.Griezel 0.5.2 | 2.0 | 15.4% | 48 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.4% | 9 |
| techdude.forest.FlamingForest 1.1 | 4.1 | 10.8% | 32 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.5% | 6 |
| tvv.nano.Polaris 1.2 | 6.0 | 8.3% | 4 |
| stelo.IntrinsicVolatility 1.4 | 6.9 | 7.6% | 3 |
| repositorio.NanoStep 1.0 | 8.5 | 4.9% | 0 |
| asd.Cthulhu 1.3 | 9.1 | 4.7% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.4 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 92.4 | 27 / 35 | 6400 |
| 2 | 1 | 73.2 | 96.8 | 29 / 35 | 6551 |
| 3 | 1 | 72.0 | 91.7 | 26 / 35 | 6265 |
| 4 | 1 | 72.3 | 94.0 | 23 / 35 | 6415 |
| 5 | 1 | 72.5 | 93.3 | 27 / 35 | 6305 |
| 6 | 1 | 70.8 | 89.8 | 24 / 35 | 5617 |
| 7 | 1 | 70.7 | 89.5 | 20 / 35 | 6240 |
| 8 | 1 | 71.3 | 92.1 | 21 / 35 | 5915 |
| 9 | 1 | 70.8 | 89.2 | 26 / 35 | 5685 |
| 10 | 1 | 71.3 | 92.1 | 25 / 35 | 5761 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 155 | 87% |
| techdude.forest.FlamingForest 1.1 | 64 | 80% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 30 | 90% |
| bvh.fnr.Fenrir 0.36l | 15 | 93% |
| stelo.IntrinsicVolatility 1.4 | 8 | 88% |
| tvv.nano.Polaris 1.2 | 8 | 88% |
| divineomega.DivineBot 1.9.4.5 | 5 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 103 of 350 rounds, at a mean tick of 1042. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 35 | 34% | 152 |
| techdude.forest.FlamingForest 1.1 | 25 | 24% | 84 |
| bvh.fnr.Fenrir 0.36l | 18 | 17% | 30 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 8 | 8% | 40 |
| stelo.IntrinsicVolatility 1.4 | 7 | 7% | 17 |
| tvv.nano.Polaris 1.2 | 3 | 3% | 9 |
| asd.Cthulhu 1.3 | 3 | 3% | 4 |
| repositorio.NanoStep 1.0 | 2 | 2% | 4 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 9 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 330 rounds): 288321 melee ticks, 137389 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 57 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 1.

Targeting waves (330 rounds): 91154 sent, 83378 reached their opponent, 13283 virtual hits (15.9% of those reached).

## Melee bench: F17

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 378 over 10 battles (37.8 per battle, most in one battle 45). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 88.4 | 229 / 350 | 2.04 | 20.2% | 60556 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 20.2% | 229 |
| et.Predator 1.8 | 2.5 | 13.5% | 25 |
| oog.melee.Mercutio 1.0 | 2.8 | 13.1% | 53 |
| cx.BlestPain 1.41 | 3.7 | 11.9% | 29 |
| ahf.NanoAndrew .4 | 5.5 | 10.0% | 6 |
| nic.Nicator 2.4 | 5.9 | 9.5% | 6 |
| maribo.melee.BMV 0.1 | 6.6 | 8.4% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.4 | 5.8% | 1 |
| tex.Longbot 0.4 | 8.6 | 5.2% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 81.3 | 21 / 35 | 5993 |
| 2 | 1 | 69.9 | 87.3 | 21 / 35 | 5799 |
| 3 | 1 | 70.6 | 88.9 | 23 / 35 | 5984 |
| 4 | 1 | 71.6 | 90.8 | 27 / 35 | 6120 |
| 5 | 1 | 72.4 | 94.6 | 27 / 35 | 6359 |
| 6 | 1 | 70.8 | 88.6 | 23 / 35 | 6041 |
| 7 | 1 | 68.9 | 82.2 | 20 / 35 | 5830 |
| 8 | 1 | 70.4 | 87.3 | 22 / 35 | 5953 |
| 9 | 1 | 71.3 | 92.1 | 23 / 35 | 6112 |
| 10 | 1 | 71.8 | 91.4 | 22 / 35 | 6365 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 93 | 91% |
| oog.melee.Mercutio 1.0 | 83 | 75% |
| cx.BlestPain 1.41 | 55 | 85% |
| ahf.NanoAndrew .4 | 17 | 100% |
| maribo.melee.BMV 0.1 | 9 | 100% |
| nic.Nicator 2.4 | 6 | 83% |
| edu.otg.spr.TheTeacher 1.2 | 4 | 75% |
| tex.Longbot 0.4 | 1 | 0% |
| goblin.Bender 2.4 | 1 | 100% |

Hadur died in 121 of 350 rounds, at a mean tick of 960. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 33 | 27% | 104 |
| oog.melee.Mercutio 1.0 | 30 | 25% | 86 |
| cx.BlestPain 1.41 | 24 | 20% | 81 |
| ahf.NanoAndrew .4 | 15 | 12% | 36 |
| nic.Nicator 2.4 | 7 | 6% | 18 |
| maribo.melee.BMV 0.1 | 6 | 5% | 14 |
| tex.Longbot 0.4 | 3 | 2% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 2% | 6 |
| goblin.Bender 2.4 | 1 | 1% | 1 |

Posture (Hadur's M records, 332 rounds): 262346 melee ticks, 163376 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 64 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 0.

Targeting waves (332 rounds): 84570 sent, 76611 reached their opponent, 15294 virtual hits (20.0% of those reached).

## Melee bench: F18

hadur117.Hadur 3.24ez against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 525 over 10 battles (52.5 per battle, most in one battle 69). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 94.5 | 280 / 350 | 1.44 | 23.4% | 51988 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 23.4% | 280 |
| agd.Mooserwirt2 2.7 | 2.2 | 13.8% | 21 |
| uji.DBH 1.1 | 2.9 | 12.8% | 20 |
| sigterm.Sigterm 1.0 | 4.9 | 10.0% | 12 |
| spinnercat.Robovirus 2.718 | 5.2 | 9.7% | 6 |
| kawigi.mini.Fhqwhgads 1.1 | 5.7 | 9.2% | 5 |
| ratosh.Nobo 0.21 | 6.1 | 8.9% | 0 |
| stelo.WangRobot 1.0 | 8.4 | 6.2% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.6 | 6.0% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 93.6 | 27 / 35 | 5123 |
| 2 | 1 | 71.6 | 94.6 | 28 / 35 | 5388 |
| 3 | 1 | 71.7 | 95.0 | 31 / 35 | 5078 |
| 4 | 1 | 71.3 | 94.6 | 26 / 35 | 5303 |
| 5 | 1 | 72.4 | 96.1 | 30 / 35 | 5489 |
| 6 | 1 | 71.6 | 96.1 | 29 / 35 | 5023 |
| 7 | 1 | 71.3 | 94.3 | 29 / 35 | 5145 |
| 8 | 1 | 70.5 | 90.7 | 24 / 35 | 4989 |
| 9 | 1 | 71.6 | 96.1 | 28 / 35 | 5113 |
| 10 | 1 | 71.3 | 94.3 | 28 / 35 | 5337 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| uji.DBH 1.1 | 95 | 91% |
| agd.Mooserwirt2 2.7 | 85 | 92% |
| sigterm.Sigterm 1.0 | 58 | 88% |
| kawigi.mini.Fhqwhgads 1.1 | 22 | 86% |
| spinnercat.Robovirus 2.718 | 19 | 84% |
| stelo.WangRobot 1.0 | 14 | 93% |
| ratosh.Nobo 0.21 | 12 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 6 | 67% |

Hadur died in 70 of 350 rounds, at a mean tick of 838. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.DBH 1.1 | 22 | 31% | 92 |
| sigterm.Sigterm 1.0 | 14 | 20% | 53 |
| agd.Mooserwirt2 2.7 | 11 | 16% | 80 |
| kawigi.mini.Fhqwhgads 1.1 | 10 | 14% | 44 |
| spinnercat.Robovirus 2.718 | 7 | 10% | 26 |
| ratosh.Nobo 0.21 | 2 | 3% | 28 |
| stelo.WangRobot 1.0 | 2 | 3% | 14 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 3% | 11 |

Posture (Hadur's M records, 330 rounds): 213378 melee ticks, 97160 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 72 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 0.

Targeting waves (330 rounds): 65270 sent, 58118 reached their opponent, 12544 virtual hits (21.6% of those reached).

## Melee bench: F19

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 386 over 10 battles (38.6 per battle, most in one battle 48). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.1 | 98.3 | 330 / 350 | 1.16 | 23.1% | 66985 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 23.1% | 330 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.5% | 10 |
| krillr.mini.JointStrike 2.0.0 | 3.5 | 11.9% | 2 |
| mld.Infinity 2.2 | 3.8 | 11.5% | 8 |
| erdnis.Rover 0.3 | 4.7 | 10.4% | 0 |
| patson.PatsonTestBot 1.0 | 6.4 | 8.2% | 0 |
| mbh.Mbh 0.1 | 7.0 | 7.4% | 0 |
| pac.ABC 2.1 | 8.2 | 6.4% | 0 |
| pbg.R2D2 1.0 | 8.4 | 5.6% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.9 | 97.8 | 32 / 35 | 6573 |
| 2 | 1 | 73.9 | 96.2 | 32 / 35 | 7005 |
| 3 | 1 | 74.3 | 99.7 | 34 / 35 | 6664 |
| 4 | 1 | 73.7 | 97.1 | 31 / 35 | 6636 |
| 5 | 1 | 73.7 | 96.8 | 33 / 35 | 6418 |
| 6 | 1 | 73.9 | 99.4 | 33 / 35 | 6303 |
| 7 | 1 | 74.2 | 98.4 | 33 / 35 | 6685 |
| 8 | 1 | 74.5 | 98.4 | 34 / 35 | 6929 |
| 9 | 1 | 74.6 | 100.0 | 35 / 35 | 6746 |
| 10 | 1 | 74.7 | 98.7 | 33 / 35 | 7026 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 193 | 98% |
| krillr.mini.JointStrike 2.0.0 | 55 | 98% |
| mld.Infinity 2.2 | 32 | 97% |
| erdnis.Rover 0.3 | 19 | 100% |
| pac.ABC 2.1 | 15 | 100% |
| patson.PatsonTestBot 1.0 | 12 | 100% |
| pbg.R2D2 1.0 | 5 | 100% |
| mbh.Mbh 0.1 | 4 | 100% |

Hadur died in 21 of 350 rounds, at a mean tick of 732. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| krillr.mini.JointStrike 2.0.0 | 6 | 29% | 67 |
| davidalves.net.DuelistMiniMelee 1.2 | 5 | 24% | 83 |
| mld.Infinity 2.2 | 5 | 24% | 51 |
| patson.PatsonTestBot 1.0 | 3 | 14% | 41 |
| erdnis.Rover 0.3 | 1 | 5% | 37 |
| mbh.Mbh 0.1 | 1 | 5% | 30 |
| pbg.R2D2 1.0 | 0 | 0% | 21 |
| pac.ABC 2.1 | 0 | 0% | 11 |

Posture (Hadur's M records, 330 rounds): 206411 melee ticks, 71329 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 39 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 0.

Targeting waves (330 rounds): 67855 sent, 59888 reached their opponent, 13378 virtual hits (22.3% of those reached).

## Melee bench: F20

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 305 over 10 battles (30.5 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 94.1 | 267 / 350 | 1.53 | 21.9% | 64882 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 21.9% | 267 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.2% | 46 |
| fwb.Nine 1.0.1 | 3.7 | 11.2% | 14 |
| catcat20.Rabbit 0.001 | 3.9 | 11.1% | 18 |
| nz.jdc.nano.GridFu 1.0 | 4.5 | 10.2% | 1 |
| m3thos.mini.Eva01 0.5.5 | 6.1 | 8.6% | 1 |
| bayen.nut.Squirrel 1.615 | 7.4 | 6.6% | 0 |
| djdjdj.NanoSkunk10 1.0 | 7.9 | 5.9% | 2 |
| ntc.ControlledChaos 1.1.4 | 8.5 | 5.6% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 94.3 | 27 / 35 | 6542 |
| 2 | 1 | 71.8 | 91.4 | 23 / 35 | 6398 |
| 3 | 1 | 73.1 | 96.5 | 28 / 35 | 6611 |
| 4 | 1 | 71.9 | 92.1 | 24 / 35 | 6285 |
| 5 | 1 | 73.0 | 94.3 | 26 / 35 | 6948 |
| 6 | 1 | 72.3 | 93.7 | 27 / 35 | 6436 |
| 7 | 1 | 72.3 | 92.1 | 28 / 35 | 6443 |
| 8 | 1 | 72.2 | 94.0 | 26 / 35 | 6371 |
| 9 | 1 | 72.7 | 96.5 | 30 / 35 | 6220 |
| 10 | 1 | 73.2 | 96.5 | 28 / 35 | 6628 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 136 | 85% |
| fwb.Nine 1.0.1 | 72 | 97% |
| catcat20.Rabbit 0.001 | 57 | 84% |
| m3thos.mini.Eva01 0.5.5 | 10 | 100% |
| nz.jdc.nano.GridFu 1.0 | 10 | 100% |
| bayen.nut.Squirrel 1.615 | 10 | 100% |
| ntc.ControlledChaos 1.1.4 | 2 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 0% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 83 of 350 rounds, at a mean tick of 974. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 41 | 49% | 155 |
| catcat20.Rabbit 0.001 | 14 | 17% | 77 |
| fwb.Nine 1.0.1 | 14 | 17% | 36 |
| nz.jdc.nano.GridFu 1.0 | 8 | 10% | 39 |
| m3thos.mini.Eva01 0.5.5 | 3 | 4% | 20 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 5 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 3 |
| bayen.nut.Squirrel 1.615 | 0 | 0% | 11 |

Posture (Hadur's M records, 331 rounds): 264315 melee ticks, 100953 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 42 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 1.

Targeting waves (331 rounds): 81520 sent, 73583 reached their opponent, 15965 virtual hits (21.7% of those reached).

## Melee bench: F21

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 265 over 10 battles (26.5 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 95.3 | 286 / 350 | 1.42 | 22.1% | 64560 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 22.1% | 286 |
| eem.EvBot v4.6.16 | 2.0 | 15.8% | 43 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.7% | 7 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.5% | 7 |
| eld.Hmm 1.0 | 5.3 | 8.3% | 8 |
| oa.weak.BotherBot 0.1 | 5.9 | 7.5% | 0 |
| fire219.CatBot 1.0 | 7.3 | 6.1% | 0 |
| PSW.Relentless 0.1 | 8.3 | 5.5% | 0 |
| el.JumpShoot 0.2 | 8.6 | 5.3% | 1 |
| arthord.MannyPacquiao Beta | 9.6 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 94.0 | 25 / 35 | 5987 |
| 2 | 1 | 72.3 | 94.9 | 26 / 35 | 6088 |
| 3 | 1 | 73.8 | 97.8 | 30 / 35 | 6657 |
| 4 | 1 | 73.0 | 94.6 | 30 / 35 | 6303 |
| 5 | 1 | 73.9 | 97.8 | 30 / 35 | 6951 |
| 6 | 1 | 72.8 | 94.9 | 29 / 35 | 6396 |
| 7 | 1 | 73.3 | 94.3 | 27 / 35 | 6835 |
| 8 | 1 | 73.2 | 94.6 | 28 / 35 | 6536 |
| 9 | 1 | 72.7 | 94.9 | 29 / 35 | 6385 |
| 10 | 1 | 73.2 | 95.2 | 32 / 35 | 6422 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 204 | 91% |
| dummy.mini.Scimitar 1.01 | 53 | 94% |
| cf.RiO.RiOx 4.2.1 | 36 | 94% |
| eld.Hmm 1.0 | 18 | 78% |
| oa.weak.BotherBot 0.1 | 2 | 100% |
| el.JumpShoot 0.2 | 1 | 0% |

Hadur died in 67 of 350 rounds, at a mean tick of 1101. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 24 | 36% | 173 |
| dummy.mini.Scimitar 1.01 | 19 | 28% | 76 |
| cf.RiO.RiOx 4.2.1 | 10 | 15% | 44 |
| eld.Hmm 1.0 | 5 | 7% | 37 |
| PSW.Relentless 0.1 | 4 | 6% | 4 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 9 |
| fire219.CatBot 1.0 | 1 | 1% | 2 |
| el.JumpShoot 0.2 | 1 | 1% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 330 rounds): 281637 melee ticks, 162760 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 78 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 78 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 0.

Targeting waves (330 rounds): 81012 sent, 73217 reached their opponent, 11928 virtual hits (16.3% of those reached).

## Melee bench: F22

hadur117.Hadur 3.24ez against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 339 over 10 battles (33.9 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.0 | 203 / 350 | 1.88 | 20.9% | 45974 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 20.9% | 203 |
| pe.SandboxDT 2.71m | 2.2 | 17.3% | 81 |
| kvk.HebusLeTroll 0.35 | 2.8 | 15.9% | 43 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.2% | 22 |
| bigpete.Stewie 1.0 | 5.0 | 10.0% | 2 |
| yk.JahRoslav 1.1 | 6.3 | 6.8% | 1 |
| tad.Dalek98 0.98 | 7.1 | 6.0% | 0 |
| gg.Squaraus 0.6 | 7.7 | 5.6% | 0 |
| pbg.NinjaX 1.2 | 8.9 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 84.3 | 19 / 35 | 4442 |
| 2 | 1 | 68.9 | 90.7 | 15 / 35 | 4520 |
| 3 | 1 | 70.4 | 92.5 | 21 / 35 | 4582 |
| 4 | 1 | 70.5 | 90.0 | 25 / 35 | 5009 |
| 5 | 1 | 66.8 | 84.6 | 14 / 35 | 4102 |
| 6 | 1 | 69.6 | 86.8 | 21 / 35 | 4809 |
| 7 | 1 | 70.4 | 92.5 | 25 / 35 | 4494 |
| 8 | 1 | 67.7 | 85.7 | 16 / 35 | 4373 |
| 9 | 1 | 69.8 | 88.9 | 23 / 35 | 4585 |
| 10 | 1 | 71.3 | 93.6 | 24 / 35 | 5058 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 104 | 64% |
| kvk.HebusLeTroll 0.35 | 86 | 76% |
| jlm.javaDisturbance 0.59 | 66 | 86% |
| bigpete.Stewie 1.0 | 10 | 100% |
| pbg.NinjaX 1.2 | 2 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |
| tad.Dalek98 0.98 | 1 | 100% |

Hadur died in 148 of 350 rounds, at a mean tick of 941. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 65 | 44% | 136 |
| kvk.HebusLeTroll 0.35 | 45 | 30% | 86 |
| jlm.javaDisturbance 0.59 | 28 | 19% | 84 |
| bigpete.Stewie 1.0 | 5 | 3% | 20 |
| tad.Dalek98 0.98 | 2 | 1% | 5 |
| yk.JahRoslav 1.1 | 1 | 1% | 6 |
| pbg.NinjaX 1.2 | 1 | 1% | 5 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 330 rounds): 249905 melee ticks, 89770 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 33 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 0.

Targeting waves (330 rounds): 73138 sent, 66056 reached their opponent, 8598 virtual hits (13.0% of those reached).

## Melee bench: F23

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 308 over 10 battles (30.8 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.9 | 97.0 | 300 / 350 | 1.27 | 22.6% | 67144 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 22.6% | 300 |
| pe.SandboxLump 1.52 | 2.0 | 16.7% | 39 |
| cre.Karolos 0.32 | 3.0 | 13.6% | 6 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 9.9% | 1 |
| stelo.RamTrackSurfer 1.2 | 5.5 | 8.9% | 3 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.7 | 8.6% | 0 |
| cw.megas.Blade 0.8 | 6.9 | 7.9% | 1 |
| sample.Walls 1.0 | 7.6 | 7.1% | 0 |
| rrh.Iwillfindyou 2.0 | 9.1 | 2.8% | 0 |
| cli.WasteOfAmmo 1.0 | 9.9 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.9 | 97.5 | 28 / 35 | 6824 |
| 2 | 1 | 73.5 | 95.6 | 29 / 35 | 6747 |
| 3 | 1 | 74.5 | 99.0 | 33 / 35 | 6949 |
| 4 | 1 | 73.8 | 97.1 | 30 / 35 | 6890 |
| 5 | 1 | 73.8 | 97.1 | 29 / 35 | 6602 |
| 6 | 1 | 74.3 | 97.8 | 32 / 35 | 6933 |
| 7 | 1 | 73.9 | 97.5 | 29 / 35 | 6591 |
| 8 | 1 | 74.1 | 97.8 | 32 / 35 | 6485 |
| 9 | 1 | 72.6 | 93.7 | 28 / 35 | 6163 |
| 10 | 1 | 74.2 | 96.5 | 30 / 35 | 6960 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 202 | 88% |
| cre.Karolos 0.32 | 84 | 96% |
| stelo.RamTrackSurfer 1.2 | 15 | 87% |
| stelo.AreaTargetingBot 1.1 | 11 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 10 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 50 of 350 rounds, at a mean tick of 914. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 32 | 64% | 180 |
| cre.Karolos 0.32 | 11 | 22% | 84 |
| stelo.AreaTargetingBot 1.1 | 4 | 8% | 23 |
| stelo.RamTrackSurfer 1.2 | 2 | 4% | 30 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 2% | 10 |
| sample.Walls 1.0 | 0 | 0% | 8 |
| cw.megas.Blade 0.8 | 0 | 0% | 4 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |
| cli.WasteOfAmmo 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 330 rounds): 200803 melee ticks, 84416 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 602 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 273 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 1.

Targeting waves (330 rounds): 62036 sent, 53769 reached their opponent, 14671 virtual hits (27.3% of those reached).

## Melee bench: F24

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 339 over 10 battles (33.9 per battle, most in one battle 44). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 83.3 | 171 / 350 | 2.50 | 17.6% | 43553 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 17.6% | 171 |
| rz.GlowBlowMelee 1.4 | 2.3 | 14.1% | 50 |
| davidalves.Phoenix 0.54 | 3.3 | 13.2% | 56 |
| florent.XSeries.X2 0.12 | 3.4 | 13.1% | 45 |
| pedersen.Ugluk 1.1.1 | 5.1 | 11.0% | 17 |
| oog.melee.Corsair 1.0 | 5.9 | 9.4% | 4 |
| stelo.SoJNanoMelee 1.1 | 7.4 | 6.7% | 7 |
| lunchie.Lunchbox 0.93 | 7.7 | 5.9% | 1 |
| as.FrankTheTank 1.3 | 9.3 | 4.9% | 1 |
| evd.X1 0.01 | 9.6 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 82.2 | 15 / 35 | 4487 |
| 2 | 1 | 66.9 | 83.2 | 16 / 35 | 4453 |
| 3 | 1 | 68.2 | 84.8 | 20 / 35 | 4498 |
| 4 | 1 | 66.9 | 85.4 | 18 / 35 | 4106 |
| 5 | 1 | 68.0 | 84.1 | 19 / 35 | 4764 |
| 6 | 1 | 66.5 | 83.5 | 18 / 35 | 4040 |
| 7 | 1 | 67.8 | 86.7 | 16 / 35 | 4470 |
| 8 | 1 | 68.0 | 85.1 | 18 / 35 | 4715 |
| 9 | 1 | 64.7 | 77.5 | 15 / 35 | 3907 |
| 10 | 1 | 66.0 | 80.6 | 16 / 35 | 4113 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 69 | 81% |
| davidalves.Phoenix 0.54 | 51 | 69% |
| florent.XSeries.X2 0.12 | 46 | 72% |
| pedersen.Ugluk 1.1.1 | 30 | 90% |
| oog.melee.Corsair 1.0 | 12 | 92% |
| stelo.SoJNanoMelee 1.1 | 8 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 181 of 350 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 45 | 25% | 85 |
| davidalves.Phoenix 0.54 | 41 | 23% | 67 |
| rz.GlowBlowMelee 1.4 | 36 | 20% | 93 |
| pedersen.Ugluk 1.1.1 | 28 | 15% | 46 |
| oog.melee.Corsair 1.0 | 11 | 6% | 36 |
| stelo.SoJNanoMelee 1.1 | 7 | 4% | 9 |
| lunchie.Lunchbox 0.93 | 6 | 3% | 7 |
| evd.X1 0.01 | 3 | 2% | 4 |
| as.FrankTheTank 1.3 | 2 | 1% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 335 rounds): 228473 melee ticks, 72512 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (335 rounds): longest scan gap while four or more were alive 62 ticks (335 rounds over 8); rounds whose longest gap at any count was over 8: 335; robots dropped as dead without a death event: 0.

Targeting waves (335 rounds): 74639 sent, 66173 reached their opponent, 11462 virtual hits (17.3% of those reached).

## Melee bench: F25

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 343 over 10 battles (34.3 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 90.1 | 241 / 350 | 1.89 | 19.6% | 44791 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 19.6% | 241 |
| voidious.mini.BrokenSword 2.0.3 | 2.4 | 13.4% | 30 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 13.2% | 18 |
| jdw.Hurricane 1.4 | 4.0 | 11.4% | 24 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.3% | 16 |
| ds.Oo 2.2 | 5.8 | 9.0% | 13 |
| awesomeness.Elite 1.0 | 7.2 | 7.2% | 2 |
| gjr.Cephalosporin 0.1 | 8.1 | 6.3% | 5 |
| adt.Ar2 1.1 | 8.5 | 6.1% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 83.5 | 21 / 35 | 4522 |
| 2 | 1 | 68.3 | 87.0 | 22 / 35 | 4252 |
| 3 | 1 | 68.7 | 87.6 | 23 / 35 | 4342 |
| 4 | 1 | 70.7 | 93.7 | 26 / 35 | 4733 |
| 5 | 1 | 67.6 | 86.0 | 18 / 35 | 4421 |
| 6 | 1 | 70.7 | 93.0 | 29 / 35 | 4553 |
| 7 | 1 | 69.7 | 92.7 | 23 / 35 | 4495 |
| 8 | 1 | 70.2 | 91.4 | 27 / 35 | 4616 |
| 9 | 1 | 70.2 | 93.0 | 26 / 35 | 4241 |
| 10 | 1 | 70.5 | 93.0 | 26 / 35 | 4616 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 96 | 85% |
| voidious.micro.BlitzBat 1.05 | 75 | 95% |
| jdw.Hurricane 1.4 | 48 | 77% |
| gre.svman4.Morfeas 1.4.1 | 20 | 75% |
| ds.Oo 2.2 | 18 | 83% |
| gjr.Cephalosporin 0.1 | 10 | 100% |
| awesomeness.Elite 1.0 | 8 | 100% |
| adt.Ar2 1.1 | 2 | 100% |

Hadur died in 110 of 350 rounds, at a mean tick of 676. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 25 | 23% | 80 |
| jdw.Hurricane 1.4 | 25 | 23% | 60 |
| gre.svman4.Morfeas 1.4.1 | 17 | 15% | 42 |
| voidious.micro.BlitzBat 1.05 | 16 | 15% | 62 |
| ds.Oo 2.2 | 15 | 14% | 43 |
| awesomeness.Elite 1.0 | 5 | 5% | 18 |
| gjr.Cephalosporin 0.1 | 3 | 3% | 22 |
| adt.Ar2 1.1 | 3 | 3% | 16 |
| amk.ChumbaMini 0.2 | 1 | 1% | 4 |

Posture (Hadur's M records, 332 rounds): 210044 melee ticks, 53410 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 33 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 1.

Targeting waves (332 rounds): 71985 sent, 64070 reached their opponent, 10189 virtual hits (15.9% of those reached).

## Melee bench: F26

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 443 over 10 battles (44.3 per battle, most in one battle 52). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.2 | 94.7 | 269 / 350 | 1.48 | 22.1% | 70760 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 22.1% | 269 |
| ak.Fermat 2.0 | 2.1 | 14.3% | 35 |
| lrem.Spectre 0.4.4 | 3.4 | 12.5% | 18 |
| shu.nitro.LENIN .T34 | 3.7 | 12.2% | 22 |
| js.PinBall 1.6 | 5.1 | 10.2% | 5 |
| jaybot.adv.bots.JayBot 2.0 | 5.7 | 9.5% | 2 |
| gh.mini.GrubbmOne 1.0 | 7.2 | 7.5% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 6.7% | 0 |
| sample.SpinBot 1.0 | 9.0 | 3.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.3 | 97.1 | 31 / 35 | 7527 |
| 2 | 1 | 73.5 | 95.6 | 29 / 35 | 6969 |
| 3 | 1 | 73.3 | 94.9 | 28 / 35 | 6911 |
| 4 | 1 | 72.7 | 94.0 | 25 / 35 | 6972 |
| 5 | 1 | 73.4 | 94.3 | 27 / 35 | 7148 |
| 6 | 1 | 73.5 | 96.2 | 28 / 35 | 7129 |
| 7 | 1 | 73.0 | 92.7 | 27 / 35 | 6984 |
| 8 | 1 | 73.4 | 95.6 | 27 / 35 | 7219 |
| 9 | 1 | 72.5 | 93.7 | 23 / 35 | 6851 |
| 10 | 1 | 72.6 | 92.7 | 24 / 35 | 7050 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 101 | 83% |
| shu.nitro.LENIN .T34 | 79 | 92% |
| lrem.Spectre 0.4.4 | 75 | 89% |
| js.PinBall 1.6 | 23 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 17 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 100% |

Hadur died in 81 of 350 rounds, at a mean tick of 923. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 38 | 47% | 114 |
| shu.nitro.LENIN .T34 | 16 | 20% | 92 |
| lrem.Spectre 0.4.4 | 16 | 20% | 74 |
| js.PinBall 1.6 | 7 | 9% | 36 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 5% | 21 |
| fullsail.LaxativeTeaTwo 1.0 | 0 | 0% | 8 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 3 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 330 rounds): 253977 melee ticks, 83297 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 36 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 36 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 1.

Targeting waves (330 rounds): 79385 sent, 71453 reached their opponent, 16221 virtual hits (22.7% of those reached).

## Melee bench: F27

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 297 over 10 battles (29.7 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 85.9 | 250 / 350 | 2.27 | 19.8% | 56119 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 19.8% | 250 |
| mk.Alpha 0.2.1 | 2.4 | 13.8% | 53 |
| EH.Eagle 1.0.6 | 3.1 | 11.4% | 9 |
| sheldor.melee.nano.TestMelee 0.1 | 4.9 | 9.7% | 16 |
| techdude.kombat.FlamingKombat 1.5 | 5.8 | 8.8% | 7 |
| wee.Gem 1.8.4 | 5.9 | 8.9% | 8 |
| throxbot.ThroxBot 0.1 | 6.1 | 8.7% | 5 |
| joe.ADinosaur 1.0 | 7.5 | 7.8% | 3 |
| caimano.Furia_Ceca 0.22 | 8.5 | 6.6% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 97.1 | 30 / 35 | 5698 |
| 2 | 1 | 70.8 | 93.0 | 28 / 35 | 5202 |
| 3 | 1 | 71.6 | 94.9 | 29 / 35 | 5661 |
| 4 | 1 | 71.5 | 94.0 | 29 / 35 | 5645 |
| 5 | 1 | 70.0 | 91.4 | 24 / 35 | 5184 |
| 6 | 1 | 66.3 | 71.7 | 18 / 35 | 5737 |
| 7 | 1 | 66.9 | 72.4 | 20 / 35 | 5740 |
| 8 | 1 | 72.1 | 95.2 | 30 / 35 | 6126 |
| 9 | 1 | 71.2 | 89.8 | 28 / 35 | 5942 |
| 10 | 1 | 62.1 | 59.4 | 14 / 35 | 5184 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 159 | 94% |
| EH.Eagle 1.0.6 | 55 | 100% |
| throxbot.ThroxBot 0.1 | 16 | 88% |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 75% |
| techdude.kombat.FlamingKombat 1.5 | 10 | 100% |
| joe.ADinosaur 1.0 | 6 | 100% |
| wee.Gem 1.8.4 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |

Hadur died in 100 of 350 rounds, at a mean tick of 549. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 23 | 23% | 130 |
| cs.Grudge 1.0 | 18 | 18% | 20 |
| EH.Eagle 1.0.6 | 16 | 16% | 74 |
| throxbot.ThroxBot 0.1 | 12 | 12% | 28 |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 9% | 33 |
| joe.ADinosaur 1.0 | 9 | 9% | 16 |
| caimano.Furia_Ceca 0.22 | 7 | 7% | 15 |
| wee.Gem 1.8.4 | 4 | 4% | 17 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 2% | 17 |

Posture (Hadur's M records, 333 rounds): 200634 melee ticks, 62191 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 80 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 0.

Targeting waves (333 rounds): 65247 sent, 57213 reached their opponent, 13609 virtual hits (23.8% of those reached).

## Melee bench: F28

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 350 over 10 battles (35.0 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 89.8 | 239 / 350 | 1.91 | 19.1% | 43390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 19.1% | 239 |
| kid.test.NightFox .2 | 2.0 | 14.7% | 43 |
| uji.Antique 1.0 | 3.5 | 12.0% | 36 |
| pfvicm.Sobieski 7.2.3b | 4.1 | 10.8% | 10 |
| qohnil.blot.BlotBot 3.61 | 4.4 | 10.1% | 12 |
| ahr.ice.Ice 1.0.2 | 6.5 | 8.1% | 5 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.4% | 4 |
| matt.advanced.Katana 1.0 | 8.1 | 6.4% | 1 |
| stelo.Lifestealer 1.0 | 9.4 | 5.1% | 0 |
| stelo.PianistNano 1.2 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 91.1 | 28 / 35 | 4701 |
| 2 | 1 | 67.4 | 85.7 | 22 / 35 | 4147 |
| 3 | 1 | 69.0 | 92.4 | 24 / 35 | 4259 |
| 4 | 1 | 68.3 | 88.3 | 22 / 35 | 4329 |
| 5 | 1 | 68.9 | 89.5 | 23 / 35 | 4391 |
| 6 | 1 | 67.5 | 87.3 | 22 / 35 | 4148 |
| 7 | 1 | 69.1 | 90.8 | 25 / 35 | 4378 |
| 8 | 1 | 69.3 | 88.3 | 25 / 35 | 4547 |
| 9 | 1 | 69.4 | 92.4 | 24 / 35 | 4352 |
| 10 | 1 | 69.2 | 92.7 | 24 / 35 | 4138 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 125 | 90% |
| uji.Antique 1.0 | 79 | 89% |
| qohnil.blot.BlotBot 3.61 | 17 | 82% |
| pfvicm.Sobieski 7.2.3b | 15 | 80% |
| amk.ChumbaWumba 0.3 | 14 | 93% |
| ahr.ice.Ice 1.0.2 | 13 | 85% |
| matt.advanced.Katana 1.0 | 5 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 112 of 350 rounds, at a mean tick of 660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 28 | 25% | 95 |
| pfvicm.Sobieski 7.2.3b | 27 | 24% | 50 |
| kid.test.NightFox .2 | 23 | 21% | 75 |
| amk.ChumbaWumba 0.3 | 12 | 11% | 36 |
| qohnil.blot.BlotBot 3.61 | 10 | 9% | 44 |
| ahr.ice.Ice 1.0.2 | 7 | 6% | 23 |
| matt.advanced.Katana 1.0 | 3 | 3% | 15 |
| stelo.PianistNano 1.2 | 2 | 2% | 5 |
| stelo.Lifestealer 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 332 rounds): 209078 melee ticks, 62560 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 73 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 1.

Targeting waves (332 rounds): 69909 sent, 61746 reached their opponent, 8439 virtual hits (13.7% of those reached).

## Melee bench: F29

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 356 over 10 battles (35.6 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 89.4 | 217 / 350 | 1.95 | 20.0% | 51373 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 20.0% | 217 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 15.2% | 65 |
| deewiant.Anomaly 0.2 | 2.7 | 14.9% | 55 |
| myl.micro.Troodon 1.10 | 4.3 | 11.3% | 8 |
| jok.PheonixM 0.1.2 | 4.8 | 10.3% | 3 |
| ph.melee.ArcherME 0.3 | 5.9 | 8.4% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.4 | 5.9% | 0 |
| DBall.Anarchy 0.1 | 7.7 | 5.9% | 1 |
| ap.Frederick 1.1 | 9.0 | 4.5% | 1 |
| jangs.ns51 1.0 | 9.9 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 90.5 | 23 / 35 | 5079 |
| 2 | 1 | 70.6 | 91.4 | 20 / 35 | 5206 |
| 3 | 1 | 71.3 | 91.7 | 25 / 35 | 5151 |
| 4 | 1 | 70.7 | 90.5 | 22 / 35 | 4934 |
| 5 | 1 | 72.1 | 93.7 | 25 / 35 | 5439 |
| 6 | 1 | 70.0 | 85.4 | 18 / 35 | 5436 |
| 7 | 1 | 69.3 | 85.1 | 19 / 35 | 5140 |
| 8 | 1 | 71.0 | 90.5 | 22 / 35 | 5352 |
| 9 | 1 | 70.2 | 87.3 | 20 / 35 | 5079 |
| 10 | 1 | 70.0 | 88.3 | 23 / 35 | 4557 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 112 | 84% |
| zyx.mega.YersiniaPestis 3.1 | 85 | 74% |
| jok.PheonixM 0.1.2 | 27 | 100% |
| myl.micro.Troodon 1.10 | 23 | 96% |
| jangs.ns51 1.0 | 4 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 2 | 100% |
| DBall.Anarchy 0.1 | 2 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 134 of 350 rounds, at a mean tick of 936. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 53 | 40% | 126 |
| deewiant.Anomaly 0.2 | 48 | 36% | 134 |
| myl.micro.Troodon 1.10 | 16 | 12% | 34 |
| jok.PheonixM 0.1.2 | 10 | 7% | 36 |
| ph.melee.ArcherME 0.3 | 4 | 3% | 8 |
| jangs.ns51 1.0 | 1 | 1% | 3 |
| DBall.Anarchy 0.1 | 1 | 1% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 2 |

Posture (Hadur's M records, 333 rounds): 278459 melee ticks, 113645 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 38 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 1.

Targeting waves (333 rounds): 86914 sent, 78878 reached their opponent, 11330 virtual hits (14.4% of those reached).

## Melee bench: F30

hadur117.Hadur 3.24ez against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 315 over 10 battles (31.5 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 81.9 | 151 / 350 | 2.45 | 19.1% | 44692 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 19.1% | 151 |
| darkcanuck.B26354 1.06 | 2.3 | 15.4% | 84 |
| oog.melee.Capulet 1.2 | 3.2 | 14.2% | 47 |
| stelo.PastFuture 2.3.2 | 3.5 | 14.0% | 38 |
| intruder.PrairieWolf 2.61 | 5.4 | 10.0% | 12 |
| tripphippy.Alice 1.1 | 5.8 | 9.6% | 10 |
| ntc.Opposite 1.5 | 7.2 | 7.7% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 7.6 | 7.2% | 8 |
| GarmBox.Anger 1.0 | 9.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 80.4 | 13 / 35 | 4645 |
| 2 | 1 | 64.8 | 77.5 | 12 / 35 | 4233 |
| 3 | 1 | 66.2 | 80.0 | 16 / 35 | 4313 |
| 4 | 1 | 67.1 | 82.5 | 14 / 35 | 4655 |
| 5 | 1 | 66.3 | 83.2 | 13 / 35 | 4057 |
| 6 | 1 | 65.7 | 79.3 | 14 / 35 | 4413 |
| 7 | 1 | 66.6 | 81.4 | 18 / 35 | 4375 |
| 8 | 1 | 66.8 | 80.7 | 14 / 35 | 4526 |
| 9 | 1 | 66.9 | 82.9 | 17 / 35 | 4475 |
| 10 | 1 | 69.6 | 91.1 | 20 / 35 | 5000 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 68 | 66% |
| oog.melee.Capulet 1.2 | 64 | 69% |
| stelo.PastFuture 2.3.2 | 42 | 67% |
| intruder.PrairieWolf 2.61 | 18 | 89% |
| tripphippy.Alice 1.1 | 16 | 75% |
| fowl3628800.LightningBolt 2.6.0 | 8 | 63% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 199 of 350 rounds, at a mean tick of 924. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 60 | 30% | 106 |
| oog.melee.Capulet 1.2 | 46 | 23% | 85 |
| stelo.PastFuture 2.3.2 | 41 | 21% | 71 |
| tripphippy.Alice 1.1 | 18 | 9% | 31 |
| fowl3628800.LightningBolt 2.6.0 | 14 | 7% | 18 |
| intruder.PrairieWolf 2.61 | 13 | 7% | 28 |
| ntc.Opposite 1.5 | 7 | 4% | 10 |
| GarmBox.Anger 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 332 rounds): 261710 melee ticks, 79393 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 57 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 2.

Targeting waves (332 rounds): 75448 sent, 68098 reached their opponent, 11097 virtual hits (16.3% of those reached).

## Melee bench: F31

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 332 over 10 battles (33.2 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 81.9 | 131 / 350 | 2.63 | 16.8% | 40204 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.2 | 17.6% | 133 |
| hadur117.Hadur 3.24ez | 1.8 | 16.8% | 131 |
| gh.mini.Griezel 0.2 | 3.3 | 12.9% | 61 |
| d414.nano.Quantum 1.0.0 | 4.1 | 11.8% | 11 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 10.5% | 13 |
| gh.nano.Grofvuil 0.2 | 5.9 | 8.5% | 3 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.6% | 1 |
| fm.mammillarias 1.3 | 8.7 | 5.3% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.2% | 0 |
| tlp.ThreeLeggedPig 1 | 9.1 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 81.0 | 10 / 35 | 3898 |
| 2 | 2 | 64.6 | 76.8 | 13 / 35 | 3862 |
| 3 | 2 | 67.4 | 84.4 | 14 / 35 | 4233 |
| 4 | 1 | 66.7 | 82.9 | 13 / 35 | 4337 |
| 5 | 2 | 67.2 | 85.7 | 16 / 35 | 4125 |
| 6 | 2 | 66.9 | 84.4 | 12 / 35 | 4098 |
| 7 | 1 | 66.7 | 82.5 | 18 / 35 | 4102 |
| 8 | 2 | 67.5 | 87.6 | 14 / 35 | 4038 |
| 9 | 2 | 65.1 | 79.4 | 14 / 35 | 3861 |
| 10 | 2 | 63.1 | 74.6 | 7 / 35 | 3650 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 106 | 58% |
| gh.mini.Griezel 0.2 | 49 | 61% |
| d414.nano.Quantum 1.0.0 | 25 | 96% |
| spinnercat.micro.Tyger 0.1 | 10 | 60% |
| gh.nano.Grofvuil 0.2 | 4 | 75% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |
| timmit.nano.TimDog 0.33 | 2 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 2 | 100% |

Hadur died in 219 of 350 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 90 | 41% | 156 |
| gh.mini.Griezel 0.2 | 47 | 21% | 79 |
| spinnercat.micro.Tyger 0.1 | 29 | 13% | 33 |
| d414.nano.Quantum 1.0.0 | 27 | 12% | 41 |
| gh.nano.Grofvuil 0.2 | 10 | 5% | 19 |
| timmit.nano.TimDog 0.33 | 5 | 2% | 7 |
| fm.mammillarias 1.3 | 5 | 2% | 6 |
| Gecko.ultimateGeckoBot 1.0 | 4 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 3 |

Posture (Hadur's M records, 336 rounds): 254341 melee ticks, 64840 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (336 rounds): longest scan gap while four or more were alive 43 ticks (336 rounds over 8); rounds whose longest gap at any count was over 8: 336; robots dropped as dead without a death event: 0.

Targeting waves (336 rounds): 79807 sent, 71589 reached their opponent, 11041 virtual hits (15.4% of those reached).

## Melee bench: F32

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 371 over 10 battles (37.1 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 90.9 | 245 / 350 | 1.82 | 19.6% | 50652 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 19.6% | 245 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.1% | 54 |
| apc.botM 3.0 | 3.0 | 12.2% | 26 |
| vjik.UnViolation 1.1 | 4.6 | 10.2% | 7 |
| lxx.ConceptA 0.8 | 4.7 | 9.8% | 6 |
| bayen.UbaMicro 1.4 | 5.7 | 9.1% | 6 |
| panzer.Panzer 0.2 | 7.6 | 7.3% | 2 |
| yk.JahMicro 1.0 | 7.9 | 6.6% | 2 |
| conscience.Electron 1.3g | 8.8 | 6.2% | 0 |
| donjezza.Jezza 1.0 | 9.7 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 89.5 | 24 / 35 | 4864 |
| 2 | 1 | 67.9 | 86.0 | 23 / 35 | 4829 |
| 3 | 1 | 70.2 | 93.7 | 25 / 35 | 5159 |
| 4 | 1 | 70.5 | 93.3 | 27 / 35 | 5432 |
| 5 | 1 | 70.2 | 94.6 | 27 / 35 | 5172 |
| 6 | 1 | 68.5 | 89.2 | 22 / 35 | 4849 |
| 7 | 1 | 69.2 | 91.4 | 24 / 35 | 4959 |
| 8 | 1 | 69.3 | 89.8 | 24 / 35 | 5132 |
| 9 | 1 | 68.3 | 87.9 | 23 / 35 | 4923 |
| 10 | 1 | 70.3 | 93.7 | 26 / 35 | 5333 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 149 | 82% |
| apc.botM 3.0 | 69 | 86% |
| vjik.UnViolation 1.1 | 26 | 88% |
| lxx.ConceptA 0.8 | 18 | 83% |
| bayen.UbaMicro 1.4 | 14 | 79% |
| donjezza.Jezza 1.0 | 7 | 86% |
| panzer.Panzer 0.2 | 6 | 83% |
| yk.JahMicro 1.0 | 4 | 100% |

Hadur died in 105 of 350 rounds, at a mean tick of 702. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 40 | 38% | 138 |
| apc.botM 3.0 | 18 | 17% | 88 |
| lxx.ConceptA 0.8 | 16 | 15% | 32 |
| bayen.UbaMicro 1.4 | 10 | 10% | 20 |
| vjik.UnViolation 1.1 | 7 | 7% | 41 |
| panzer.Panzer 0.2 | 5 | 5% | 8 |
| conscience.Electron 1.3g | 5 | 5% | 6 |
| donjezza.Jezza 1.0 | 2 | 2% | 7 |
| yk.JahMicro 1.0 | 2 | 2% | 7 |

Posture (Hadur's M records, 332 rounds): 197465 melee ticks, 92942 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 79 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 0.

Targeting waves (332 rounds): 66928 sent, 58673 reached their opponent, 10264 virtual hits (17.5% of those reached).

## Melee bench: F33

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 370 over 10 battles (37.0 per battle, most in one battle 48). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 90.0 | 217 / 350 | 1.90 | 19.9% | 51450 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 19.9% | 217 |
| maribo.Quester 0.3 | 2.0 | 15.6% | 60 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.9% | 30 |
| gre.svman4.Leonidas 1.3.2 | 4.2 | 11.2% | 17 |
| labg.Cataclysm 2.05 | 4.9 | 10.1% | 20 |
| baal.nano.N 1.42 | 6.0 | 8.9% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.9 | 7.8% | 5 |
| zyx.micro.Ant 1.1 | 8.3 | 5.2% | 1 |
| sanja.First 0.1 | 8.8 | 5.0% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.9 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 86.0 | 21 / 35 | 4630 |
| 2 | 1 | 71.9 | 94.0 | 27 / 35 | 5423 |
| 3 | 1 | 69.2 | 88.3 | 20 / 35 | 4884 |
| 4 | 1 | 71.8 | 93.3 | 25 / 35 | 5685 |
| 5 | 1 | 70.7 | 91.4 | 21 / 35 | 5325 |
| 6 | 1 | 70.6 | 90.5 | 22 / 35 | 4921 |
| 7 | 1 | 70.1 | 87.3 | 22 / 35 | 5205 |
| 8 | 1 | 70.7 | 90.5 | 23 / 35 | 5335 |
| 9 | 1 | 70.2 | 90.8 | 20 / 35 | 5196 |
| 10 | 1 | 69.0 | 88.3 | 16 / 35 | 4846 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 107 | 80% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 67 | 85% |
| gre.svman4.Leonidas 1.3.2 | 48 | 94% |
| labg.Cataclysm 2.05 | 24 | 75% |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 86% |
| baal.nano.N 1.42 | 4 | 100% |
| zyx.micro.Ant 1.1 | 1 | 0% |

Hadur died in 135 of 350 rounds, at a mean tick of 983. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 44 | 33% | 127 |
| gre.svman4.Leonidas 1.3.2 | 32 | 24% | 64 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 19% | 74 |
| labg.Cataclysm 2.05 | 17 | 13% | 42 |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 4% | 16 |
| baal.nano.N 1.42 | 5 | 4% | 17 |
| zyx.micro.Ant 1.1 | 3 | 2% | 8 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |
| sanja.First 0.1 | 1 | 1% | 1 |

Posture (Hadur's M records, 331 rounds): 287712 melee ticks, 94422 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 65 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 0.

Targeting waves (331 rounds): 88871 sent, 80833 reached their opponent, 10987 virtual hits (13.6% of those reached).

## Melee bench: F34

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 298 over 10 battles (29.8 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 90.5 | 209 / 350 | 1.86 | 19.9% | 56645 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 19.9% | 209 |
| stelo.Spread 0.9 | 2.3 | 16.1% | 79 |
| kid.Gladiator .7.2 | 2.7 | 15.8% | 41 |
| jcs.Seth 1.8 | 4.4 | 11.2% | 16 |
| tcf.Reach 3 | 4.8 | 10.5% | 3 |
| cli.Dancer 1.1 | 5.8 | 9.1% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 6.9% | 2 |
| amk.Punbot.Punbot 0.01 | 8.1 | 4.6% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.2% | 0 |
| sample.RamFire 1.0 | 9.7 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 90.2 | 20 / 35 | 5477 |
| 2 | 1 | 72.4 | 94.0 | 25 / 35 | 6185 |
| 3 | 1 | 70.6 | 88.3 | 18 / 35 | 5780 |
| 4 | 1 | 69.2 | 87.6 | 16 / 35 | 5182 |
| 5 | 1 | 70.3 | 89.2 | 20 / 35 | 5408 |
| 6 | 1 | 72.3 | 93.3 | 26 / 35 | 5945 |
| 7 | 1 | 70.3 | 88.9 | 19 / 35 | 5404 |
| 8 | 1 | 71.6 | 90.5 | 22 / 35 | 6008 |
| 9 | 1 | 71.5 | 92.4 | 20 / 35 | 5732 |
| 10 | 1 | 70.9 | 90.5 | 23 / 35 | 5524 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 121 | 74% |
| kid.Gladiator .7.2 | 91 | 79% |
| jcs.Seth 1.8 | 44 | 82% |
| tcf.Reach 3 | 9 | 100% |
| ratosh.Wesco 1.4 | 3 | 33% |
| cli.Dancer 1.1 | 2 | 100% |

Hadur died in 144 of 350 rounds, at a mean tick of 1057. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 58 | 40% | 121 |
| stelo.Spread 0.9 | 44 | 31% | 125 |
| jcs.Seth 1.8 | 18 | 13% | 58 |
| tcf.Reach 3 | 16 | 11% | 30 |
| cli.Dancer 1.1 | 4 | 3% | 8 |
| ratosh.Wesco 1.4 | 3 | 2% | 6 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 1 |
| sample.RamFire 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 335 rounds): 279639 melee ticks, 163287 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (335 rounds): longest scan gap while four or more were alive 49 ticks (335 rounds over 8); rounds whose longest gap at any count was over 8: 335; robots dropped as dead without a death event: 0.

Targeting waves (335 rounds): 84370 sent, 76206 reached their opponent, 12145 virtual hits (15.9% of those reached).

## Melee bench: F35

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 280 over 10 battles (28.0 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 85.4 | 129 / 350 | 2.31 | 17.2% | 41170 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.2 | 18.6% | 185 |
| hadur117.Hadur 3.24ez | 1.8 | 17.2% | 129 |
| gh.mini.Gruwel 0.9 | 3.6 | 12.6% | 16 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.7 | 12.3% | 14 |
| rz.HawkOnFire 0.1 | 4.7 | 11.5% | 5 |
| wit.Chuliath 1.0 | 6.8 | 6.4% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.2 | 6.2% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.7 | 5.8% | 1 |
| stelo.MyAgileRobot 0.2 | 9.1 | 4.8% | 0 |
| dans.Cinnamon 1.2 | 9.2 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 85.4 | 16 / 35 | 4386 |
| 2 | 2 | 66.8 | 84.1 | 14 / 35 | 4087 |
| 3 | 2 | 67.4 | 87.6 | 13 / 35 | 4086 |
| 4 | 2 | 66.3 | 85.4 | 13 / 35 | 3693 |
| 5 | 2 | 67.0 | 86.0 | 11 / 35 | 4298 |
| 6 | 2 | 65.8 | 81.6 | 10 / 35 | 3978 |
| 7 | 2 | 66.7 | 84.4 | 12 / 35 | 4119 |
| 8 | 2 | 65.9 | 81.3 | 9 / 35 | 4057 |
| 9 | 1 | 68.5 | 89.5 | 16 / 35 | 4422 |
| 10 | 2 | 67.7 | 88.9 | 15 / 35 | 4044 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 141 | 43% |
| dmh.robocode.robot.BlackDeath 9.2 | 32 | 84% |
| gh.mini.Gruwel 0.9 | 32 | 84% |
| rz.HawkOnFire 0.1 | 17 | 88% |
| myl.nano.KomoriNinja 1.1 | 1 | 0% |

Hadur died in 222 of 350 rounds, at a mean tick of 1022. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 125 | 56% | 186 |
| dmh.robocode.robot.BlackDeath 9.2 | 36 | 16% | 60 |
| gh.mini.Gruwel 0.9 | 24 | 11% | 56 |
| rz.HawkOnFire 0.1 | 23 | 10% | 32 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6 | 3% | 6 |
| myl.nano.KomoriNinja 1.1 | 3 | 1% | 4 |
| wit.Chuliath 1.0 | 2 | 1% | 2 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |
| dans.Cinnamon 1.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 333 rounds): 239992 melee ticks, 151468 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 41 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 2.

Targeting waves (333 rounds): 72770 sent, 64353 reached their opponent, 9699 virtual hits (15.1% of those reached).

## Melee bench: F36

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 453 over 10 battles (45.3 per battle, most in one battle 54). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 93.0 | 273 / 350 | 1.63 | 21.4% | 59036 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 21.4% | 273 |
| alpha.RainingFire 1.0 | 2.7 | 12.2% | 21 |
| bzdp.Pansy 2.1 | 2.7 | 12.2% | 15 |
| mz.Cork 0.1 | 4.5 | 10.6% | 12 |
| bvh.micro.Freya 0.3 | 5.0 | 10.6% | 14 |
| m3thos.Eva02 0.7.1 | 5.5 | 9.9% | 9 |
| bvh.mini.Fenrir 0.39 | 6.6 | 9.5% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 5.1% | 0 |
| dl.BetterWalls 1.0 | 8.6 | 5.0% | 1 |
| sample.MyFirstRobot 1.0 | 9.9 | 3.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 88.9 | 24 / 35 | 5513 |
| 2 | 1 | 73.5 | 98.1 | 32 / 35 | 6120 |
| 3 | 1 | 72.0 | 92.7 | 28 / 35 | 6065 |
| 4 | 1 | 71.8 | 91.7 | 25 / 35 | 6094 |
| 5 | 1 | 70.7 | 88.9 | 26 / 35 | 5721 |
| 6 | 1 | 72.5 | 94.3 | 29 / 35 | 5923 |
| 7 | 1 | 72.0 | 94.0 | 25 / 35 | 5741 |
| 8 | 1 | 71.7 | 92.1 | 28 / 35 | 5972 |
| 9 | 1 | 70.9 | 91.4 | 26 / 35 | 5595 |
| 10 | 1 | 73.2 | 97.5 | 30 / 35 | 6292 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 72 | 99% |
| bvh.micro.Freya 0.3 | 58 | 97% |
| alpha.RainingFire 1.0 | 58 | 84% |
| mz.Cork 0.1 | 48 | 96% |
| m3thos.Eva02 0.7.1 | 29 | 86% |
| bvh.mini.Fenrir 0.39 | 22 | 91% |
| sample.MyFirstRobot 1.0 | 4 | 100% |
| dl.BetterWalls 1.0 | 3 | 67% |

Hadur died in 78 of 350 rounds, at a mean tick of 755. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 25 | 32% | 79 |
| bzdp.Pansy 2.1 | 12 | 15% | 79 |
| m3thos.Eva02 0.7.1 | 11 | 14% | 47 |
| bvh.micro.Freya 0.3 | 10 | 13% | 44 |
| mz.Cork 0.1 | 8 | 10% | 47 |
| bvh.mini.Fenrir 0.39 | 8 | 10% | 28 |
| dl.BetterWalls 1.0 | 3 | 4% | 15 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 4 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 5 |

Posture (Hadur's M records, 331 rounds): 231420 melee ticks, 80748 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 58 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 0.

Targeting waves (331 rounds): 78394 sent, 70583 reached their opponent, 13785 virtual hits (19.5% of those reached).

## Melee bench: F37

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 526 over 10 battles (52.6 per battle, most in one battle 70). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 87.3 | 263 / 350 | 2.14 | 19.4% | 58554 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 19.4% | 263 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.3 | 11.1% | 16 |
| germ.TheMind .2 | 4.0 | 9.9% | 12 |
| agrach.Dalek 1.0 | 4.4 | 9.6% | 15 |
| EBBU.Sim2 1.02 | 5.1 | 9.4% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 6.7 | 8.7% | 3 |
| mb.Beast 0.1 | 7.1 | 8.3% | 10 |
| stelo.UntouchableNano 1.3 | 7.3 | 8.2% | 13 |
| lmk.ACPFinal 0.1 | 7.7 | 8.2% | 8 |
| skm.Ryubot 1.0 | 9.4 | 7.2% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 86.0 | 25 / 35 | 5719 |
| 2 | 1 | 66.9 | 82.5 | 23 / 35 | 5551 |
| 3 | 1 | 70.6 | 93.7 | 28 / 35 | 6466 |
| 4 | 1 | 69.2 | 89.8 | 29 / 35 | 6021 |
| 5 | 1 | 69.2 | 91.1 | 28 / 35 | 5627 |
| 6 | 1 | 67.3 | 83.2 | 25 / 35 | 5593 |
| 7 | 1 | 68.2 | 86.0 | 25 / 35 | 5924 |
| 8 | 1 | 67.7 | 84.4 | 26 / 35 | 5688 |
| 9 | 1 | 67.1 | 82.5 | 23 / 35 | 5736 |
| 10 | 1 | 70.7 | 93.7 | 31 / 35 | 6229 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 53 | 96% |
| EBBU.Sim2 1.02 | 37 | 100% |
| agrach.Dalek 1.0 | 37 | 97% |
| germ.TheMind .2 | 32 | 97% |
| mb.Beast 0.1 | 29 | 97% |
| lmk.ACPFinal 0.1 | 27 | 100% |
| stelo.UntouchableNano 1.3 | 26 | 92% |
| skm.Ryubot 1.0 | 22 | 95% |
| mn.nano.perceptual.Impact 1.3.0 | 9 | 89% |

Hadur died in 88 of 350 rounds, at a mean tick of 389. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 25 | 28% | 39 |
| com.syncleus.robocode.Dreadnaught 0.1 | 14 | 16% | 64 |
| agrach.Dalek 1.0 | 10 | 11% | 52 |
| mb.Beast 0.1 | 10 | 11% | 38 |
| lmk.ACPFinal 0.1 | 10 | 11% | 34 |
| germ.TheMind .2 | 8 | 9% | 27 |
| stelo.UntouchableNano 1.3 | 5 | 6% | 34 |
| EBBU.Sim2 1.02 | 3 | 3% | 45 |
| skm.Ryubot 1.0 | 3 | 3% | 13 |

Posture (Hadur's M records, 331 rounds): 152731 melee ticks, 39401 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 102 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 102 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 1.

Targeting waves (331 rounds): 50475 sent, 42808 reached their opponent, 11902 virtual hits (27.8% of those reached).

## Melee bench: F38

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 367 over 10 battles (36.7 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 90.8 | 227 / 350 | 1.83 | 19.7% | 51993 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 19.7% | 227 |
| justin.Mallais 14.0 | 2.0 | 15.4% | 71 |
| bvh.mini.Freya 0.55 | 3.0 | 12.8% | 18 |
| bts.mega.Gnarly 1.4 | 4.6 | 10.7% | 21 |
| cs.Wren 1.0 | 4.7 | 10.3% | 5 |
| kdf.KoulDestroyer 1.0 | 5.8 | 9.1% | 4 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.0 | 8.2% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.9 | 6.1% | 1 |
| bzdp.BoxCar 2.0 | 9.4 | 3.9% | 0 |
| matt.UnderDark3 2.4.34 | 9.6 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 91.4 | 19 / 35 | 5066 |
| 2 | 1 | 71.9 | 96.2 | 28 / 35 | 5615 |
| 3 | 1 | 69.5 | 89.8 | 21 / 35 | 5097 |
| 4 | 1 | 67.8 | 84.4 | 19 / 35 | 4680 |
| 5 | 1 | 69.8 | 88.6 | 20 / 35 | 5603 |
| 6 | 1 | 68.8 | 87.6 | 20 / 35 | 4925 |
| 7 | 1 | 71.3 | 93.0 | 27 / 35 | 5424 |
| 8 | 1 | 70.8 | 91.4 | 27 / 35 | 5333 |
| 9 | 1 | 70.6 | 93.7 | 21 / 35 | 5105 |
| 10 | 1 | 70.2 | 91.4 | 25 / 35 | 5145 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 138 | 75% |
| bts.mega.Gnarly 1.4 | 48 | 77% |
| bvh.mini.Freya 0.55 | 46 | 87% |
| cs.Wren 1.0 | 23 | 91% |
| kdf.KoulDestroyer 1.0 | 17 | 94% |
| davidalves.net.DuelistNanoMelee 1.01 | 5 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 80% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 125 of 350 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 51 | 41% | 138 |
| bvh.mini.Freya 0.55 | 25 | 20% | 56 |
| bts.mega.Gnarly 1.4 | 16 | 13% | 71 |
| kdf.KoulDestroyer 1.0 | 14 | 11% | 28 |
| cs.Wren 1.0 | 6 | 5% | 28 |
| davidalves.net.DuelistNanoMelee 1.01 | 6 | 5% | 12 |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 4% | 14 |
| bzdp.BoxCar 2.0 | 2 | 2% | 1 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 2 |

Posture (Hadur's M records, 330 rounds): 224468 melee ticks, 75435 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 39 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 0.

Targeting waves (330 rounds): 71641 sent, 63051 reached their opponent, 12727 virtual hits (20.2% of those reached).

## Melee bench: F39

hadur117.Hadur 3.24ez against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 317 over 10 battles (31.7 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 92.3 | 255 / 350 | 1.62 | 22.8% | 58213 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 22.8% | 255 |
| bvh.fry.Freya 0.82 | 2.0 | 16.4% | 33 |
| az.Ololobot 0.2.4 | 3.0 | 14.6% | 55 |
| winamp32.micro.MicroMacro 1.0 | 4.6 | 9.4% | 5 |
| gimp.GimpBot 0.1 | 5.4 | 8.8% | 1 |
| apollokidd.ApolloKidd 0.9 | 5.6 | 8.8% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 6.6 | 7.7% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.0 | 6.2% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 94.6 | 26 / 35 | 6070 |
| 2 | 1 | 71.5 | 91.4 | 23 / 35 | 6236 |
| 3 | 1 | 71.3 | 93.9 | 27 / 35 | 5772 |
| 4 | 1 | 71.4 | 92.9 | 26 / 35 | 5768 |
| 5 | 1 | 72.3 | 93.6 | 25 / 35 | 6416 |
| 6 | 1 | 72.2 | 95.0 | 28 / 35 | 6213 |
| 7 | 1 | 70.4 | 90.4 | 27 / 35 | 5468 |
| 8 | 1 | 70.8 | 90.0 | 26 / 35 | 5757 |
| 9 | 1 | 71.2 | 95.7 | 26 / 35 | 5642 |
| 10 | 1 | 67.9 | 85.0 | 21 / 35 | 4871 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 133 | 81% |
| bvh.fry.Freya 0.82 | 131 | 85% |
| winamp32.micro.MicroMacro 1.0 | 18 | 89% |
| stelo.SoRobotNanoMelee 1.2 | 9 | 100% |
| apollokidd.ApolloKidd 0.9 | 6 | 100% |
| gimp.GimpBot 0.1 | 5 | 80% |

Hadur died in 95 of 350 rounds, at a mean tick of 999. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 38 | 40% | 118 |
| az.Ololobot 0.2.4 | 33 | 35% | 149 |
| winamp32.micro.MicroMacro 1.0 | 7 | 7% | 26 |
| stelo.SoRobotNanoMelee 1.2 | 6 | 6% | 14 |
| gimp.GimpBot 0.1 | 5 | 5% | 26 |
| apollokidd.ApolloKidd 0.9 | 3 | 3% | 11 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 2% | 4 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 2 |

Posture (Hadur's M records, 332 rounds): 250154 melee ticks, 142716 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 99 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 99 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 0.

Targeting waves (332 rounds): 72571 sent, 65340 reached their opponent, 11800 virtual hits (18.1% of those reached).

## Melee bench: F40

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 377 over 10 battles (37.7 per battle, most in one battle 45). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 92.0 | 247 / 350 | 1.72 | 20.8% | 55413 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 20.8% | 247 |
| kawigi.mini.Coriantumr 1.1 | 2.1 | 14.5% | 40 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.3% | 27 |
| mz.AntiGrav 1.0 | 3.9 | 11.4% | 14 |
| Polkwane.SmashMelee 1.0 | 4.9 | 10.8% | 9 |
| stelo.Randomness 1.0 | 6.2 | 9.1% | 12 |
| alpha.BlackIce 1.0 | 6.7 | 8.5% | 1 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.1% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.1 | 3.8% | 0 |
| sample.Corners 1.0 | 9.9 | 2.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 92.1 | 24 / 35 | 5430 |
| 2 | 1 | 71.0 | 90.5 | 22 / 35 | 5403 |
| 3 | 1 | 72.4 | 93.7 | 29 / 35 | 5728 |
| 4 | 1 | 70.9 | 90.2 | 21 / 35 | 5552 |
| 5 | 1 | 72.1 | 93.0 | 24 / 35 | 6102 |
| 6 | 1 | 70.5 | 90.5 | 23 / 35 | 5173 |
| 7 | 1 | 70.2 | 90.2 | 21 / 35 | 5416 |
| 8 | 1 | 72.6 | 94.6 | 31 / 35 | 5602 |
| 9 | 1 | 70.8 | 91.1 | 24 / 35 | 5261 |
| 10 | 1 | 72.4 | 94.6 | 28 / 35 | 5746 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 107 | 88% |
| kano.gamma.KanoGamma 1.8 | 69 | 88% |
| mz.AntiGrav 1.0 | 40 | 88% |
| Polkwane.SmashMelee 1.0 | 32 | 94% |
| stelo.Randomness 1.0 | 19 | 89% |
| alpha.BlackIce 1.0 | 9 | 89% |
| amk.superstrike.SuperStrike 0.3 | 2 | 100% |

Hadur died in 104 of 350 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 39 | 38% | 112 |
| kano.gamma.KanoGamma 1.8 | 18 | 17% | 87 |
| mz.AntiGrav 1.0 | 16 | 15% | 45 |
| Polkwane.SmashMelee 1.0 | 13 | 13% | 40 |
| stelo.Randomness 1.0 | 9 | 9% | 35 |
| alpha.BlackIce 1.0 | 5 | 5% | 15 |
| amk.superstrike.SuperStrike 0.3 | 2 | 2% | 6 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 6 |
| sample.Corners 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 333 rounds): 251768 melee ticks, 75790 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 96 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 96 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 3.

Targeting waves (333 rounds): 79424 sent, 71174 reached their opponent, 13579 virtual hits (19.1% of those reached).

## Melee bench: F41

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 280 over 10 battles (28.0 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.8 | 215 / 350 | 2.01 | 19.1% | 48189 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 19.1% | 215 |
| eem.EvBotNG v12.8 | 2.0 | 15.9% | 86 |
| ary.Swarm 1.1 | 3.4 | 12.7% | 13 |
| lessonz.robocode.Oz 0.5.0 | 4.0 | 12.4% | 16 |
| simonton.nano.MeleeSeed 1.8 | 4.6 | 11.4% | 16 |
| shrub.Silver v048 | 6.0 | 9.0% | 1 |
| zyx.nano.Ant 1.1 | 7.0 | 7.1% | 0 |
| stelo.Mirror 1.1 | 8.4 | 5.3% | 2 |
| jsal.Jsalbot 1.0 | 8.6 | 5.1% | 1 |
| acogdev.alpha 0.2 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 92.4 | 23 / 35 | 5287 |
| 2 | 1 | 69.3 | 87.3 | 20 / 35 | 4919 |
| 3 | 1 | 68.9 | 87.3 | 18 / 35 | 4632 |
| 4 | 1 | 69.5 | 87.3 | 19 / 35 | 4842 |
| 5 | 1 | 68.6 | 86.3 | 21 / 35 | 4374 |
| 6 | 1 | 69.5 | 89.2 | 23 / 35 | 4664 |
| 7 | 1 | 70.0 | 89.5 | 24 / 35 | 4950 |
| 8 | 1 | 71.7 | 95.2 | 25 / 35 | 5351 |
| 9 | 1 | 68.5 | 86.3 | 22 / 35 | 4267 |
| 10 | 1 | 69.4 | 87.0 | 20 / 35 | 4903 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 133 | 76% |
| lessonz.robocode.Oz 0.5.0 | 46 | 96% |
| ary.Swarm 1.1 | 45 | 91% |
| simonton.nano.MeleeSeed 1.8 | 22 | 95% |
| shrub.Silver v048 | 7 | 86% |
| jsal.Jsalbot 1.0 | 2 | 100% |

Hadur died in 136 of 350 rounds, at a mean tick of 838. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 58 | 43% | 161 |
| lessonz.robocode.Oz 0.5.0 | 24 | 18% | 55 |
| ary.Swarm 1.1 | 24 | 18% | 54 |
| simonton.nano.MeleeSeed 1.8 | 16 | 12% | 39 |
| shrub.Silver v048 | 10 | 7% | 22 |
| stelo.Mirror 1.1 | 2 | 1% | 8 |
| jsal.Jsalbot 1.0 | 1 | 1% | 6 |
| zyx.nano.Ant 1.1 | 1 | 1% | 3 |

Posture (Hadur's M records, 332 rounds): 248894 melee ticks, 126620 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 107 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 107 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 0.

Targeting waves (332 rounds): 79281 sent, 70966 reached their opponent, 10280 virtual hits (14.5% of those reached).

## Melee bench: F42

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 320 over 10 battles (32.0 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 92.8 | 247 / 350 | 1.65 | 21.0% | 62129 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 21.0% | 247 |
| wompi.Wallaby 5.1 | 2.3 | 14.7% | 37 |
| maribo.mini.MiniQuester 0.1 | 3.0 | 13.7% | 23 |
| ara.Shera 0.88 | 3.7 | 13.0% | 41 |
| amz.NanoClone 1.41 | 5.0 | 8.5% | 1 |
| dsw.StaticD 1.0 | 6.5 | 6.6% | 2 |
| maribo.IotaCT 1.1 | 7.2 | 6.2% | 0 |
| stelo.MirrorMicro 1.0 | 7.7 | 6.1% | 0 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 93.7 | 27 / 35 | 6602 |
| 2 | 1 | 71.5 | 93.7 | 24 / 35 | 6088 |
| 3 | 1 | 73.4 | 99.7 | 34 / 35 | 6432 |
| 4 | 1 | 70.9 | 91.1 | 19 / 35 | 6188 |
| 5 | 1 | 70.8 | 89.5 | 22 / 35 | 6258 |
| 6 | 1 | 72.5 | 95.6 | 28 / 35 | 6428 |
| 7 | 1 | 69.0 | 85.4 | 19 / 35 | 5617 |
| 8 | 1 | 71.3 | 92.1 | 26 / 35 | 6101 |
| 9 | 1 | 71.6 | 93.7 | 26 / 35 | 6192 |
| 10 | 1 | 71.6 | 94.0 | 22 / 35 | 6223 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 155 | 90% |
| maribo.mini.MiniQuester 0.1 | 76 | 93% |
| ara.Shera 0.88 | 53 | 57% |
| dsw.StaticD 1.0 | 3 | 100% |
| amz.NanoClone 1.41 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 103 of 350 rounds, at a mean tick of 998. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 46 | 45% | 89 |
| wompi.Wallaby 5.1 | 30 | 29% | 140 |
| maribo.mini.MiniQuester 0.1 | 16 | 16% | 85 |
| amz.NanoClone 1.41 | 8 | 8% | 12 |
| dsw.StaticD 1.0 | 1 | 1% | 11 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 4 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 3 |
| maribo.IotaCT 1.1 | 0 | 0% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 331 rounds): 264496 melee ticks, 92517 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 34 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 0.

Targeting waves (331 rounds): 81147 sent, 73100 reached their opponent, 13607 virtual hits (18.6% of those reached).

## Melee bench: F43

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 269 over 10 battles (26.9 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 81.7 | 96 / 350 | 2.65 | 16.8% | 44854 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.0% | 210 |
| hadur117.Hadur 3.24ez | 2.0 | 16.8% | 96 |
| brainfade.melee.Dusk 0.44 | 3.5 | 12.2% | 26 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.6% | 10 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 10.7% | 5 |
| Krabb.akim2.Akim2 1.1b | 5.9 | 9.6% | 1 |
| mz.NanoGod 2.02 | 7.5 | 7.6% | 1 |
| jab.DiamondStealer 5 | 7.5 | 7.7% | 1 |
| cvt.Firsty 1.0 | 9.0 | 3.5% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.8 | 83.2 | 8 / 35 | 4555 |
| 2 | 2 | 63.3 | 71.1 | 4 / 35 | 3916 |
| 3 | 2 | 69.9 | 90.2 | 13 / 35 | 4926 |
| 4 | 2 | 67.8 | 81.0 | 12 / 35 | 4562 |
| 5 | 2 | 66.8 | 79.7 | 9 / 35 | 4465 |
| 6 | 2 | 69.2 | 87.3 | 10 / 35 | 4941 |
| 7 | 2 | 66.6 | 80.0 | 6 / 35 | 4359 |
| 8 | 2 | 67.2 | 81.9 | 12 / 35 | 4235 |
| 9 | 2 | 68.1 | 82.5 | 15 / 35 | 4691 |
| 10 | 2 | 66.4 | 79.7 | 7 / 35 | 4204 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 142 | 36% |
| brainfade.melee.Dusk 0.44 | 36 | 72% |
| dummy.micro.Sparrow 2.5 | 15 | 60% |
| wcsv.melee.EngineerMelee 0.1 | 9 | 89% |
| mz.NanoGod 2.02 | 2 | 100% |

Hadur died in 254 of 350 rounds, at a mean tick of 1471. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 149 | 59% | 203 |
| brainfade.melee.Dusk 0.44 | 39 | 15% | 61 |
| dummy.micro.Sparrow 2.5 | 23 | 9% | 29 |
| wcsv.melee.EngineerMelee 0.1 | 17 | 7% | 23 |
| mz.NanoGod 2.02 | 11 | 4% | 14 |
| jab.DiamondStealer 5 | 9 | 4% | 10 |
| Krabb.akim2.Akim2 1.1b | 4 | 2% | 8 |
| cvt.Firsty 1.0 | 2 | 1% | 2 |

Posture (Hadur's M records, 332 rounds): 246272 melee ticks, 277054 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 39 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 0.

Targeting waves (332 rounds): 76942 sent, 68724 reached their opponent, 10923 virtual hits (15.9% of those reached).

## Melee bench: F44

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 359 over 10 battles (35.9 per battle, most in one battle 44). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 94.6 | 270 / 350 | 1.49 | 21.8% | 62720 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 21.8% | 270 |
| stelo.Liblix 0.3.1 | 2.4 | 14.9% | 42 |
| tzu.TheArtOfWar 1.2 | 2.6 | 14.4% | 29 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.2 | 9.6% | 3 |
| jwirde.Gort 2.0 | 4.8 | 9.0% | 5 |
| disan.Chair 2.2.0 | 6.7 | 7.5% | 0 |
| stf.PanzerGeneral 0.1 | 6.9 | 7.3% | 1 |
| wompi.Quokka 1.6 | 7.4 | 6.7% | 1 |
| sample.Crazy 1.0 | 9.4 | 4.5% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.6 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 94.0 | 30 / 35 | 6486 |
| 2 | 1 | 71.1 | 94.0 | 24 / 35 | 5380 |
| 3 | 1 | 72.6 | 93.0 | 27 / 35 | 6431 |
| 4 | 1 | 73.1 | 97.1 | 28 / 35 | 6519 |
| 5 | 1 | 72.7 | 94.0 | 27 / 35 | 6539 |
| 6 | 1 | 72.7 | 95.9 | 29 / 35 | 6205 |
| 7 | 1 | 72.7 | 96.8 | 28 / 35 | 6072 |
| 8 | 1 | 72.2 | 92.7 | 25 / 35 | 6386 |
| 9 | 1 | 71.9 | 93.7 | 24 / 35 | 6231 |
| 10 | 1 | 72.7 | 94.9 | 28 / 35 | 6471 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 141 | 90% |
| tzu.TheArtOfWar 1.2 | 120 | 86% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 15 | 93% |
| jwirde.Gort 2.0 | 13 | 85% |
| disan.Chair 2.2.0 | 7 | 100% |
| stf.PanzerGeneral 0.1 | 4 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| wompi.Quokka 1.6 | 1 | 100% |

Hadur died in 81 of 350 rounds, at a mean tick of 892. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tzu.TheArtOfWar 1.2 | 31 | 38% | 106 |
| stelo.Liblix 0.3.1 | 30 | 37% | 162 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 9% | 21 |
| jwirde.Gort 2.0 | 5 | 6% | 29 |
| stf.PanzerGeneral 0.1 | 4 | 5% | 10 |
| disan.Chair 2.2.0 | 2 | 2% | 9 |
| wompi.Quokka 1.6 | 1 | 1% | 7 |
| sample.Crazy 1.0 | 0 | 0% | 3 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 333 rounds): 248422 melee ticks, 86734 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 97 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 97 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 0.

Targeting waves (333 rounds): 83844 sent, 75768 reached their opponent, 15085 virtual hits (19.9% of those reached).

## Melee bench: F45

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 372 over 10 battles (37.2 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 91.1 | 195 / 350 | 1.80 | 20.6% | 58450 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.0 | 20.6% | 195 |
| jje.BagPuss 1.2 | 2.7 | 12.2% | 11 |
| eem.IWillFireNoBullet v2.8 | 3.5 | 11.3% | 103 |
| myl.nano.Graviton 1.10 | 3.5 | 11.1% | 8 |
| sul.Lunar 1.1 | 4.9 | 10.4% | 18 |
| hvilela.HVilela 0.9 | 6.5 | 8.8% | 0 |
| fm.claire 1.7 | 6.9 | 8.6% | 2 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 8.4% | 8 |
| wit.Deep7 2.0 | 9.2 | 4.7% | 5 |
| abud.ThirdRobo 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 94.6 | 24 / 35 | 5856 |
| 2 | 1 | 71.8 | 93.0 | 18 / 35 | 6533 |
| 3 | 1 | 70.5 | 90.2 | 22 / 35 | 5830 |
| 4 | 1 | 69.8 | 87.9 | 19 / 35 | 5461 |
| 5 | 1 | 70.1 | 90.8 | 17 / 35 | 5642 |
| 6 | 1 | 70.5 | 89.2 | 17 / 35 | 5785 |
| 7 | 1 | 71.3 | 91.7 | 21 / 35 | 6154 |
| 8 | 1 | 70.3 | 91.4 | 20 / 35 | 5611 |
| 9 | 1 | 70.8 | 91.4 | 20 / 35 | 5932 |
| 10 | 1 | 70.5 | 90.8 | 17 / 35 | 5646 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 120 | 48% |
| jje.BagPuss 1.2 | 49 | 88% |
| sul.Lunar 1.1 | 43 | 84% |
| myl.nano.Graviton 1.10 | 34 | 88% |
| pez.mini.ChironexFleckeri 0.5 | 15 | 73% |
| wit.Deep7 2.0 | 10 | 100% |
| hvilela.HVilela 0.9 | 4 | 100% |
| fm.claire 1.7 | 3 | 100% |

Hadur died in 156 of 350 rounds, at a mean tick of 1567. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 68 | 44% | 0 |
| jje.BagPuss 1.2 | 30 | 19% | 119 |
| sul.Lunar 1.1 | 17 | 11% | 70 |
| myl.nano.Graviton 1.10 | 17 | 11% | 61 |
| fm.claire 1.7 | 9 | 6% | 24 |
| pez.mini.ChironexFleckeri 0.5 | 7 | 4% | 37 |
| hvilela.HVilela 0.9 | 7 | 4% | 19 |
| wit.Deep7 2.0 | 1 | 1% | 10 |
| abud.ThirdRobo 1.0 | 0 | 0% | 8 |

Posture (Hadur's M records, 330 rounds): 313512 melee ticks, 161102 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 40 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 1.

Targeting waves (330 rounds): 94688 sent, 86926 reached their opponent, 12305 virtual hits (14.2% of those reached).

## Melee bench: F46

hadur117.Hadur 3.24ez against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 257 over 10 battles (25.7 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.7 | 157 / 350 | 2.19 | 17.8% | 45263 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24ez | 1.3 | 17.8% | 157 |
| rsalesc.melee.Medina 0.4.5 | 2.1 | 16.5% | 113 |
| kc.mini.Mirage 0.2 | 2.6 | 16.2% | 64 |
| cx.Princess 1.0 | 4.6 | 9.6% | 11 |
| mz.MicroSheep 1.0 | 4.7 | 10.2% | 2 |
| sadoner.killer 0.2 | 5.8 | 8.8% | 1 |
| arthord.NanoSatanMelee Beta | 7.1 | 7.2% | 2 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 6.1% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 88.3 | 16 / 35 | 4627 |
| 2 | 3 | 65.6 | 80.0 | 12 / 35 | 4130 |
| 3 | 1 | 68.5 | 88.3 | 17 / 35 | 4420 |
| 4 | 2 | 66.8 | 82.9 | 15 / 35 | 4424 |
| 5 | 1 | 68.1 | 87.3 | 18 / 35 | 4507 |
| 6 | 1 | 68.8 | 90.5 | 16 / 35 | 4571 |
| 7 | 1 | 67.8 | 87.0 | 14 / 35 | 4394 |
| 8 | 1 | 68.3 | 86.7 | 14 / 35 | 4946 |
| 9 | 1 | 67.5 | 86.3 | 16 / 35 | 4322 |
| 10 | 1 | 69.2 | 90.2 | 19 / 35 | 4922 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 114 | 80% |
| rsalesc.melee.Medina 0.4.5 | 89 | 49% |
| cx.Princess 1.0 | 10 | 80% |
| arthord.NanoSatanMelee Beta | 6 | 100% |
| mz.MicroSheep 1.0 | 6 | 100% |
| sadoner.killer 0.2 | 3 | 67% |

Hadur died in 193 of 350 rounds, at a mean tick of 1037. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 80 | 41% | 168 |
| rsalesc.melee.Medina 0.4.5 | 75 | 39% | 124 |
| cx.Princess 1.0 | 13 | 7% | 18 |
| mz.MicroSheep 1.0 | 10 | 5% | 15 |
| arthord.NanoSatanMelee Beta | 7 | 4% | 13 |
| sadoner.killer 0.2 | 6 | 3% | 8 |
| kurios.DOSexe .9a | 2 | 1% | 2 |
| jeremyreeder.collective.Prophet 5 | 0 | 0% | 1 |

Posture (Hadur's M records, 336 rounds): 251755 melee ticks, 149203 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (336 rounds): longest scan gap while four or more were alive 57 ticks (336 rounds over 8); rounds whose longest gap at any count was over 8: 336; robots dropped as dead without a death event: 2.

Targeting waves (336 rounds): 71911 sent, 63539 reached their opponent, 9178 virtual hits (14.4% of those reached).

