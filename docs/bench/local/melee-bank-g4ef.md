# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 591 over 8 battles (73.9 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 85.8 | 75 / 280 | 2.28 | 16.9% | 37504 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.7% | 182 |
| hadur2.Hadur 3.17.1g4ef | 2.0 | 16.9% | 75 |
| sgp.JollyNinja 3.53 | 3.4 | 11.6% | 11 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.1 | 11.0% | 6 |
| lorneswork.Predator 1.0 | 5.0 | 10.5% | 2 |
| mz.MicroGodMelee 1 | 5.5 | 10.3% | 4 |
| adt.Ar2 1.0 | 7.0 | 7.4% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 4.9% | 0 |
| skm.butterfly 1.0 | 8.9 | 4.5% | 0 |
| mym.EdgeStalker 1.0 | 9.9 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.5 | 87.6 | 8 / 35 | 4480 |
| 2 | 2 | 66.3 | 85.1 | 9 / 35 | 4646 |
| 3 | 2 | 66.2 | 85.4 | 7 / 35 | 4674 |
| 4 | 2 | 66.8 | 86.7 | 12 / 35 | 4671 |
| 5 | 2 | 66.9 | 86.7 | 9 / 35 | 4659 |
| 6 | 2 | 67.4 | 86.7 | 13 / 35 | 4733 |
| 7 | 2 | 66.5 | 83.8 | 9 / 35 | 4798 |
| 8 | 2 | 66.6 | 84.1 | 8 / 35 | 4843 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 153 | 13% |
| mz.MicroGodMelee 1 | 21 | 86% |
| sgp.JollyNinja 3.53 | 19 | 68% |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 79% |
| lorneswork.Predator 1.0 | 12 | 92% |
| adt.Ar2 1.0 | 1 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 209 of 280 rounds, at a mean tick of 1165. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 150 | 72% | 172 |
| sgp.JollyNinja 3.53 | 16 | 8% | 28 |
| lorneswork.Predator 1.0 | 13 | 6% | 24 |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 5% | 22 |
| mz.MicroGodMelee 1 | 9 | 4% | 27 |
| kawigi.sbf.FloodSonnet 0.9 | 3 | 1% | 3 |
| adt.Ar2 1.0 | 2 | 1% | 2 |
| mym.EdgeStalker 1.0 | 1 | 0% | 1 |
| skm.butterfly 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 194842 melee ticks, 116621 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 79 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 0.

Targeting waves (276 rounds): 63798 sent, 57730 reached their opponent, 12920 virtual hits (22.4% of those reached).

## Melee bench: F02

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 514 over 8 battles (64.3 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 85.2 | 128 / 280 | 2.33 | 17.8% | 35949 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.0 | 17.8% | 128 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 13.9% | 57 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.6 | 14.0% | 39 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.6% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.3% | 19 |
| Noran.BitchingElk 0.054 | 6.5 | 8.2% | 17 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 8.1% | 2 |
| sch.Simone 0.3d | 7.6 | 7.4% | 10 |
| stelo.PatternRobot 1.0 | 8.9 | 5.7% | 4 |
| fullsail.SweetTea 1.1 | 9.9 | 4.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 90.8 | 20 / 35 | 4652 |
| 2 | 1 | 67.1 | 83.5 | 18 / 35 | 4412 |
| 3 | 1 | 65.9 | 82.9 | 13 / 35 | 4324 |
| 4 | 1 | 66.2 | 82.5 | 13 / 35 | 4422 |
| 5 | 1 | 66.9 | 85.1 | 16 / 35 | 4405 |
| 6 | 1 | 66.4 | 82.2 | 16 / 35 | 4311 |
| 7 | 1 | 68.8 | 89.8 | 18 / 35 | 4968 |
| 8 | 1 | 66.5 | 84.8 | 14 / 35 | 4455 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 61 | 67% |
| pulsar.PulsarMax 0.8.9 | 55 | 51% |
| Noran.BitchingElk 0.054 | 26 | 62% |
| com.cohesiva.robocode.ManOwaR 1.0 | 23 | 70% |
| sch.Simone 0.3d | 11 | 73% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 100% |
| fnc.bandit.Bandit 5.2.0 | 7 | 71% |
| stelo.PatternRobot 1.0 | 4 | 100% |
| fullsail.SweetTea 1.1 | 1 | 0% |

Hadur died in 156 of 280 rounds, at a mean tick of 958. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 42 | 27% | 70 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 35 | 22% | 74 |
| com.cohesiva.robocode.ManOwaR 1.0 | 20 | 13% | 36 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 10% | 24 |
| stelo.PatternRobot 1.0 | 12 | 8% | 15 |
| Noran.BitchingElk 0.054 | 11 | 7% | 27 |
| sch.Simone 0.3d | 10 | 6% | 20 |
| fnc.bandit.Bandit 5.2.0 | 7 | 4% | 12 |
| fullsail.SweetTea 1.1 | 1 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 231327 melee ticks, 54149 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 185 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 185 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 1.

Targeting waves (274 rounds): 83137 sent, 77132 reached their opponent, 14701 virtual hits (19.1% of those reached).

## Melee bench: F03

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 254 over 8 battles (31.8 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.5 | 205 / 280 | 1.95 | 19.4% | 44451 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.0 | 19.4% | 205 |
| kawigi.nano.Lib 1.0 | 2.5 | 13.5% | 21 |
| radnor.DoctorBob 1.42 | 2.6 | 13.4% | 23 |
| vuen.Cake 2.51 | 3.9 | 12.7% | 25 |
| urdos.URDOS 1.3 | 5.0 | 9.8% | 3 |
| adt.Ar1 2.1 | 6.1 | 7.8% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 6.7% | 1 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.5% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.6 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 94.0 | 27 / 35 | 5571 |
| 2 | 1 | 68.1 | 84.4 | 25 / 35 | 5264 |
| 3 | 1 | 68.7 | 87.9 | 22 / 35 | 5660 |
| 4 | 1 | 68.8 | 89.2 | 27 / 35 | 5167 |
| 5 | 1 | 69.1 | 89.5 | 25 / 35 | 5479 |
| 6 | 1 | 68.0 | 85.4 | 21 / 35 | 5419 |
| 7 | 1 | 71.8 | 98.4 | 32 / 35 | 6055 |
| 8 | 1 | 69.3 | 87.0 | 26 / 35 | 5836 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 83 | 89% |
| radnor.DoctorBob 1.42 | 70 | 94% |
| kawigi.nano.Lib 1.0 | 50 | 92% |
| oa.weak.FlyMk1 0.1 | 8 | 100% |
| urdos.URDOS 1.3 | 4 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| adt.Ar1 2.1 | 2 | 100% |

Hadur died in 76 of 280 rounds, at a mean tick of 673. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 22 | 29% | 83 |
| kawigi.nano.Lib 1.0 | 15 | 20% | 55 |
| vuen.Cake 2.51 | 13 | 17% | 78 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9 | 12% | 10 |
| urdos.URDOS 1.3 | 7 | 9% | 21 |
| oa.weak.FlyMk1 0.1 | 3 | 4% | 12 |
| adt.Ar1 2.1 | 3 | 4% | 9 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 3% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 1% | 6 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 174986 melee ticks, 51916 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 47 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 54447 sent, 48477 reached their opponent, 13496 virtual hits (27.8% of those reached).

## Melee bench: F04

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 874 over 8 battles (109.3 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 86.0 | 28 / 280 | 2.26 | 16.7% | 38161 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.9% | 218 |
| hadur2.Hadur 3.17.1g4ef | 2.0 | 16.7% | 28 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.5% | 14 |
| TNT.TNT 0.99.1 | 4.0 | 11.2% | 15 |
| josago.Jorgito 0.16 | 5.1 | 9.0% | 4 |
| css.Delitioner 0.11 | 6.1 | 7.1% | 0 |
| tj.zombie1n 1.0.1 | 7.1 | 6.5% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.5% | 0 |
| spin.Bugstard 0.012b | 9.4 | 3.9% | 1 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.9 | 85.4 | 4 / 35 | 4840 |
| 2 | 2 | 66.2 | 86.0 | 1 / 35 | 4470 |
| 3 | 2 | 67.1 | 87.9 | 1 / 35 | 4818 |
| 4 | 2 | 66.7 | 87.0 | 2 / 35 | 4835 |
| 5 | 2 | 66.6 | 84.4 | 3 / 35 | 4689 |
| 6 | 2 | 67.6 | 85.7 | 4 / 35 | 5038 |
| 7 | 2 | 67.7 | 88.3 | 7 / 35 | 4643 |
| 8 | 2 | 66.5 | 82.9 | 6 / 35 | 4828 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 170 | 5% |
| TNT.TNT 0.99.1 | 17 | 35% |
| apc.LeeroyJenkins2 1.0 | 16 | 56% |
| josago.Jorgito 0.16 | 3 | 33% |
| spin.Bugstard 0.012b | 2 | 50% |
| css.Delitioner 0.11 | 1 | 100% |
| tj.zombie1n 1.0.1 | 1 | 100% |

Hadur died in 259 of 280 rounds, at a mean tick of 1375. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 185 | 71% | 195 |
| apc.LeeroyJenkins2 1.0 | 27 | 10% | 36 |
| TNT.TNT 0.99.1 | 25 | 10% | 32 |
| josago.Jorgito 0.16 | 10 | 4% | 11 |
| sp.Nanos.Ember 1.1 | 2 | 1% | 2 |
| css.Delitioner 0.11 | 1 | 0% | 3 |
| rampancy.Durandal 2.1d | 1 | 0% | 1 |
| spin.Bugstard 0.012b | 1 | 0% | 0 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 271 rounds): 276930 melee ticks, 96991 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (271 rounds): longest scan gap while four or more were alive 71 ticks (271 rounds over 8); rounds whose longest gap at any count was over 8: 271; robots dropped as dead without a death event: 0.

Targeting waves (271 rounds): 85115 sent, 78992 reached their opponent, 12818 virtual hits (16.2% of those reached).

## Melee bench: F05

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 425 over 8 battles (53.1 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 76.8 | 32 / 280 | 3.09 | 14.3% | 27558 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.1 | 18.4% | 147 |
| justin.DemonicRage 3.4 | 1.9 | 17.3% | 80 |
| hadur2.Hadur 3.17.1g4ef | 3.0 | 14.3% | 32 |
| wompi.Numbat 2.1 | 4.0 | 12.3% | 11 |
| axeBots.HataMoto 3.09 | 5.4 | 9.3% | 7 |
| ms.Ares 0.19 | 5.6 | 9.2% | 3 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.5 | 5.5% | 0 |
| supersample.SuperBoxBot 1.0 | 7.5 | 5.5% | 0 |
| GarmBox.Oranges 1.0 | 9.4 | 4.2% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.6 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.5 | 80.3 | 3 / 35 | 3404 |
| 2 | 3 | 61.2 | 72.4 | 2 / 35 | 3558 |
| 3 | 3 | 61.2 | 69.5 | 3 / 35 | 3461 |
| 4 | 3 | 61.9 | 74.6 | 5 / 35 | 3182 |
| 5 | 3 | 62.9 | 76.5 | 5 / 35 | 3494 |
| 6 | 3 | 65.1 | 83.2 | 5 / 35 | 3707 |
| 7 | 3 | 62.9 | 76.8 | 7 / 35 | 3520 |
| 8 | 3 | 63.2 | 81.0 | 2 / 35 | 3232 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 46 | 7% |
| justin.DemonicRage 3.4 | 46 | 26% |
| wompi.Numbat 2.1 | 15 | 80% |
| ms.Ares 0.19 | 5 | 60% |
| axeBots.HataMoto 3.09 | 4 | 50% |

Hadur died in 251 of 280 rounds, at a mean tick of 905. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 94 | 37% | 103 |
| cb.fire.Firestarter 2.0f | 89 | 35% | 96 |
| wompi.Numbat 2.1 | 34 | 14% | 44 |
| ms.Ares 0.19 | 12 | 5% | 15 |
| axeBots.HataMoto 3.09 | 9 | 4% | 11 |
| supersample.SuperBoxBot 1.0 | 6 | 2% | 7 |
| GarmBox.Oranges 1.0 | 3 | 1% | 3 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 208413 melee ticks, 44497 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 65 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 0.

Targeting waves (275 rounds): 65758 sent, 59461 reached their opponent, 10556 virtual hits (17.8% of those reached).

## Melee bench: F06

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 335 over 8 battles (41.9 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.0 | 160 / 280 | 2.17 | 18.5% | 37868 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.1 | 18.5% | 160 |
| jekl.StoneGhost 0.7 | 2.3 | 14.9% | 33 |
| origin.SleepSiphon 1.7b | 2.6 | 14.1% | 63 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.1 | 11.7% | 13 |
| mld.Wisdom 1.0 | 4.9 | 10.3% | 4 |
| gg.Wolverine 2.0 | 6.1 | 8.2% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 6.9% | 5 |
| DBall.NUKE 0.1 | 8.3 | 5.9% | 0 |
| spinnercat.Omen 1.0 | 8.4 | 6.2% | 0 |
| sample.Fire 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 84.1 | 19 / 35 | 4643 |
| 2 | 1 | 68.8 | 89.8 | 22 / 35 | 4753 |
| 3 | 1 | 68.8 | 88.6 | 19 / 35 | 4694 |
| 4 | 2 | 65.1 | 76.5 | 15 / 35 | 4512 |
| 5 | 1 | 70.6 | 93.0 | 25 / 35 | 5107 |
| 6 | 1 | 67.6 | 85.1 | 18 / 35 | 4674 |
| 7 | 1 | 69.3 | 90.5 | 21 / 35 | 4843 |
| 8 | 1 | 68.6 | 88.6 | 21 / 35 | 4642 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 78 | 88% |
| origin.SleepSiphon 1.7b | 55 | 65% |
| pe.minimelee.SandboxMiniMelee 1.1 | 38 | 92% |
| ers.nano.hawk.HawkLA 3.0m | 10 | 70% |
| gg.Wolverine 2.0 | 6 | 83% |
| DBall.NUKE 0.1 | 4 | 100% |
| sample.Fire 1.0 | 2 | 100% |
| mld.Wisdom 1.0 | 2 | 100% |

Hadur died in 126 of 280 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 47 | 37% | 96 |
| jekl.StoneGhost 0.7 | 33 | 26% | 80 |
| pe.minimelee.SandboxMiniMelee 1.1 | 18 | 14% | 44 |
| mld.Wisdom 1.0 | 7 | 6% | 18 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 5% | 17 |
| spinnercat.Omen 1.0 | 4 | 3% | 4 |
| gg.Wolverine 2.0 | 3 | 2% | 10 |
| sample.Fire 1.0 | 2 | 2% | 2 |
| DBall.NUKE 0.1 | 0 | 0% | 8 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 202149 melee ticks, 55841 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 49 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 64064 sent, 58195 reached their opponent, 14215 virtual hits (24.4% of those reached).

## Melee bench: F07

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 514 over 8 battles (64.3 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 93.3 | 156 / 280 | 1.61 | 20.0% | 46046 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.0 | 20.0% | 156 |
| rtk.Tachikoma 1.0 | 2.5 | 16.6% | 50 |
| rsalesc.melee.Monk 0.3.6c | 2.5 | 16.2% | 41 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.7% | 14 |
| franzor.Lizt 1.3.1 | 4.8 | 11.2% | 19 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.0% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.4% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.4% | 0 |
| sample.Target 1.0 | 9.3 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 95.2 | 22 / 35 | 6091 |
| 2 | 1 | 71.2 | 92.1 | 16 / 35 | 5637 |
| 3 | 1 | 71.0 | 91.7 | 19 / 35 | 5565 |
| 4 | 1 | 71.8 | 94.9 | 21 / 35 | 5819 |
| 5 | 1 | 70.5 | 91.4 | 18 / 35 | 5459 |
| 6 | 1 | 72.0 | 94.6 | 22 / 35 | 5732 |
| 7 | 1 | 72.2 | 94.3 | 22 / 35 | 5983 |
| 8 | 1 | 70.8 | 91.7 | 16 / 35 | 5760 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 122 | 66% |
| rsalesc.melee.Monk 0.3.6c | 47 | 30% |
| oog.melee.CapuletDroid 1.1 | 43 | 74% |
| franzor.Lizt 1.3.1 | 36 | 78% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |

Hadur died in 128 of 280 rounds, at a mean tick of 1435. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 61 | 48% | 143 |
| rsalesc.melee.Monk 0.3.6c | 40 | 31% | 74 |
| oog.melee.CapuletDroid 1.1 | 12 | 9% | 53 |
| franzor.Lizt 1.3.1 | 9 | 7% | 2 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 5 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 273769 melee ticks, 116899 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 62 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 82323 sent, 76292 reached their opponent, 16644 virtual hits (21.8% of those reached).

## Melee bench: F08

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1140 over 8 battles (142.5 per battle, most in one battle 149). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 91.2 | 187 / 280 | 1.79 | 19.3% | 36394 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.0 | 19.3% | 187 |
| tm.Yuugao 1.0 | 2.8 | 12.7% | 36 |
| shrub.Vapour v159 | 2.8 | 12.1% | 22 |
| Krabb.sliNk.Garm 0.9u | 3.8 | 11.3% | 17 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 10.3% | 8 |
| m3thos.Eva00 1.1 | 6.1 | 8.9% | 4 |
| jwst.DAD.DarkAndDarker 1.1 | 7.1 | 8.0% | 4 |
| qualidafial.MajorDick 1.0.1 | 8.1 | 6.7% | 2 |
| SHAM.WOW 1.4 | 9.1 | 5.6% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 90.8 | 24 / 35 | 4513 |
| 2 | 1 | 69.6 | 93.7 | 25 / 35 | 4284 |
| 3 | 1 | 67.8 | 87.3 | 19 / 35 | 4778 |
| 4 | 1 | 69.3 | 93.3 | 26 / 35 | 4433 |
| 5 | 1 | 69.6 | 92.1 | 23 / 35 | 4834 |
| 6 | 1 | 69.1 | 92.7 | 24 / 35 | 4522 |
| 7 | 1 | 69.1 | 93.0 | 26 / 35 | 4380 |
| 8 | 1 | 67.8 | 87.0 | 20 / 35 | 4650 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 73 | 84% |
| shrub.Vapour v159 | 49 | 76% |
| com.spp.robocode.MostlyHarmless 010 | 36 | 92% |
| Krabb.sliNk.Garm 0.9u | 35 | 71% |
| m3thos.Eva00 1.1 | 15 | 87% |
| jwst.DAD.DarkAndDarker 1.1 | 14 | 79% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 102 of 280 rounds, at a mean tick of 896. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 30 | 29% | 87 |
| Krabb.sliNk.Garm 0.9u | 19 | 19% | 46 |
| shrub.Vapour v159 | 16 | 16% | 53 |
| com.spp.robocode.MostlyHarmless 010 | 16 | 16% | 42 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 5% | 21 |
| m3thos.Eva00 1.1 | 5 | 5% | 19 |
| zyx.nano.BacillusComma 1.0 | 3 | 3% | 6 |
| SHAM.WOW 1.4 | 0 | 0% | 5 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 205642 melee ticks, 58300 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 57 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 1.

Targeting waves (276 rounds): 68403 sent, 62230 reached their opponent, 12569 virtual hits (20.2% of those reached).

## Melee bench: F09

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 478 over 8 battles (59.8 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 76.9 | 78 / 280 | 3.08 | 15.1% | 26913 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.1 | 17.0% | 119 |
| hadur2.Hadur 3.17.1g4ef | 2.1 | 15.1% | 78 |
| kc.micro.Figment 1.0 | 2.8 | 14.2% | 32 |
| yagami.Tidus 0.11 | 4.6 | 10.7% | 3 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.5% | 24 |
| mc2.enemy.Original 0.9 | 5.8 | 9.4% | 20 |
| dft.Calliope 5.6 | 6.9 | 8.0% | 2 |
| robar.nano.Assertive_Melee 0.2 | 8.6 | 5.0% | 0 |
| step.nanoPri 1.0 | 8.6 | 5.5% | 0 |
| rdm.Dueler 0.4x | 9.8 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.6 | 75.6 | 11 / 35 | 3612 |
| 2 | 2 | 64.4 | 79.4 | 11 / 35 | 3708 |
| 3 | 3 | 62.8 | 76.5 | 6 / 35 | 3156 |
| 4 | 2 | 62.9 | 75.6 | 8 / 35 | 3538 |
| 5 | 1 | 63.0 | 76.2 | 12 / 35 | 3436 |
| 6 | 2 | 63.8 | 79.0 | 12 / 35 | 3134 |
| 7 | 2 | 62.4 | 74.9 | 10 / 35 | 3127 |
| 8 | 2 | 63.4 | 78.4 | 8 / 35 | 3202 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 62 | 34% |
| kc.micro.Figment 1.0 | 44 | 84% |
| pedersen.Grishnakh 1.0 | 12 | 58% |
| mc2.enemy.Original 0.9 | 9 | 22% |
| yagami.Tidus 0.11 | 6 | 83% |
| dft.Calliope 5.6 | 6 | 100% |

Hadur died in 205 of 280 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 74 | 36% | 96 |
| kc.micro.Figment 1.0 | 35 | 17% | 71 |
| mc2.enemy.Original 0.9 | 26 | 13% | 29 |
| yagami.Tidus 0.11 | 24 | 12% | 29 |
| pedersen.Grishnakh 1.0 | 22 | 11% | 27 |
| step.nanoPri 1.0 | 8 | 4% | 8 |
| robar.nano.Assertive_Melee 0.2 | 7 | 3% | 8 |
| rdm.Dueler 0.4x | 4 | 2% | 4 |
| dft.Calliope 5.6 | 2 | 1% | 8 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 203671 melee ticks, 49905 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 81 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 81 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 0.

Targeting waves (272 rounds): 66327 sent, 60440 reached their opponent, 9543 virtual hits (15.8% of those reached).

## Melee bench: F10

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 307 over 8 battles (38.4 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 94.5 | 223 / 280 | 1.49 | 20.1% | 41301 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.0 | 20.1% | 223 |
| DTF.Kludgy 1.2b | 2.3 | 14.1% | 24 |
| ejb.Polaris 1.0.1 | 3.4 | 12.8% | 13 |
| ne.Chimera 1.2 | 3.4 | 12.9% | 14 |
| tvv.micro.Antares 1.1.1 | 5.4 | 9.7% | 1 |
| vStar.RAFzilla 2.15 | 5.6 | 9.8% | 1 |
| sam.Samspin 1.0 | 7.5 | 5.6% | 0 |
| kurios.DOSexe .9b | 7.8 | 5.7% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 9.0 | 4.9% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 97.5 | 31 / 35 | 5467 |
| 2 | 1 | 69.1 | 90.2 | 24 / 35 | 4956 |
| 3 | 1 | 70.1 | 93.7 | 27 / 35 | 5081 |
| 4 | 1 | 70.0 | 93.7 | 25 / 35 | 5190 |
| 5 | 1 | 70.5 | 95.6 | 29 / 35 | 5057 |
| 6 | 1 | 70.0 | 92.4 | 28 / 35 | 4924 |
| 7 | 1 | 71.1 | 95.2 | 29 / 35 | 5331 |
| 8 | 1 | 71.5 | 98.1 | 30 / 35 | 5295 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 81 | 84% |
| ejb.Polaris 1.0.1 | 67 | 90% |
| ne.Chimera 1.2 | 53 | 91% |
| vStar.RAFzilla 2.15 | 21 | 95% |
| tvv.micro.Antares 1.1.1 | 16 | 100% |
| kurios.DOSexe .9b | 8 | 88% |
| donjezza.Muncho 1.0 | 5 | 60% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 58 of 280 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 24 | 41% | 83 |
| ejb.Polaris 1.0.1 | 13 | 22% | 76 |
| ne.Chimera 1.2 | 9 | 16% | 39 |
| donjezza.Muncho 1.0 | 4 | 7% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 5% | 8 |
| vStar.RAFzilla 2.15 | 2 | 3% | 22 |
| tvv.micro.Antares 1.1.1 | 1 | 2% | 18 |
| kurios.DOSexe .9b | 1 | 2% | 18 |
| sam.Samspin 1.0 | 0 | 0% | 8 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 192620 melee ticks, 79590 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 61 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 47 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 2.

Targeting waves (273 rounds): 64750 sent, 58991 reached their opponent, 12718 virtual hits (21.6% of those reached).

## Melee bench: F11

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 482 over 8 battles (60.3 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 80.2 | 97 / 280 | 2.79 | 15.8% | 28163 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.4 | 16.2% | 88 |
| hadur2.Hadur 3.17.1g4ef | 1.6 | 15.8% | 97 |
| cx.mini.Nimrod 0.55 | 3.6 | 11.7% | 22 |
| djc.DynaBot 0.1.1 | 3.8 | 10.9% | 20 |
| br2.MobyDickBot 1.6 | 5.4 | 9.6% | 20 |
| rdt199.Warlord 0.73 | 5.6 | 9.4% | 23 |
| uji.YellohFellah 1.0 | 7.0 | 8.6% | 9 |
| KiraNL.Chupacabra 0.4 | 7.6 | 7.6% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.5% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.1 | 80.0 | 9 / 35 | 3376 |
| 2 | 2 | 63.3 | 77.8 | 13 / 35 | 3405 |
| 3 | 2 | 63.1 | 80.3 | 7 / 35 | 3558 |
| 4 | 1 | 65.7 | 81.9 | 17 / 35 | 3973 |
| 5 | 2 | 62.3 | 75.9 | 11 / 35 | 3135 |
| 6 | 1 | 62.8 | 78.1 | 9 / 35 | 3594 |
| 7 | 2 | 64.2 | 82.5 | 12 / 35 | 3429 |
| 8 | 1 | 66.3 | 84.8 | 19 / 35 | 3693 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 58 | 41% |
| uji.YellohFellah 1.0 | 26 | 88% |
| cx.mini.Nimrod 0.55 | 24 | 58% |
| djc.DynaBot 0.1.1 | 21 | 67% |
| br2.MobyDickBot 1.6 | 17 | 71% |
| rdt199.Warlord 0.73 | 15 | 53% |
| stelo.MirrorNano 1.3 | 1 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 186 of 280 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 79 | 42% | 107 |
| cx.mini.Nimrod 0.55 | 28 | 15% | 45 |
| rdt199.Warlord 0.73 | 18 | 10% | 29 |
| djc.DynaBot 0.1.1 | 17 | 9% | 28 |
| br2.MobyDickBot 1.6 | 13 | 7% | 24 |
| uji.YellohFellah 1.0 | 9 | 5% | 25 |
| KiraNL.Chupacabra 0.4 | 8 | 4% | 9 |
| stelo.MirrorNano 1.3 | 7 | 4% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 2% | 5 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 214219 melee ticks, 52960 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 32 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 0.

Targeting waves (275 rounds): 70102 sent, 64026 reached their opponent, 9517 virtual hits (14.9% of those reached).

## Melee bench: F12

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 350 over 8 battles (43.8 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 83.2 | 153 / 280 | 2.51 | 17.0% | 28182 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.0 | 17.0% | 153 |
| nat.PallasHawk 1.0 | 2.8 | 13.1% | 43 |
| bts.wiki.RipCurl 0.9b | 3.0 | 13.4% | 37 |
| darkcanuck.Leon 1.01 | 3.4 | 13.1% | 24 |
| brainfade.melee.Genghis 0.36 | 4.9 | 10.8% | 18 |
| jrm.Test0 1.0 | 6.4 | 8.8% | 2 |
| cs.sheldor.Talon 1.1 | 7.3 | 6.9% | 0 |
| jp.Perpy 16.0 | 7.8 | 6.3% | 0 |
| stuff.Vlad 0.1 | 9.1 | 5.4% | 0 |
| jaybot.bots.Oddball 4.0 | 9.5 | 5.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 77.1 | 15 / 35 | 3351 |
| 2 | 1 | 65.0 | 81.0 | 18 / 35 | 3460 |
| 3 | 1 | 66.3 | 83.8 | 19 / 35 | 3677 |
| 4 | 1 | 64.0 | 77.8 | 16 / 35 | 3356 |
| 5 | 1 | 67.3 | 87.0 | 24 / 35 | 3561 |
| 6 | 1 | 67.2 | 87.0 | 23 / 35 | 3484 |
| 7 | 1 | 67.2 | 87.9 | 19 / 35 | 3479 |
| 8 | 1 | 66.5 | 83.8 | 19 / 35 | 3814 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 58 | 88% |
| nat.PallasHawk 1.0 | 52 | 69% |
| bts.wiki.RipCurl 0.9b | 49 | 82% |
| brainfade.melee.Genghis 0.36 | 18 | 72% |
| jaybot.bots.Oddball 4.0 | 6 | 100% |
| jrm.Test0 1.0 | 4 | 100% |
| jp.Perpy 16.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 131 of 280 rounds, at a mean tick of 659. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 36 | 27% | 65 |
| nat.PallasHawk 1.0 | 25 | 19% | 59 |
| darkcanuck.Leon 1.01 | 21 | 16% | 84 |
| jrm.Test0 1.0 | 21 | 16% | 26 |
| brainfade.melee.Genghis 0.36 | 17 | 13% | 21 |
| cs.sheldor.Talon 1.1 | 4 | 3% | 12 |
| jp.Perpy 16.0 | 3 | 2% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 5 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 179267 melee ticks, 46173 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 47 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 0.

Targeting waves (275 rounds): 61367 sent, 55025 reached their opponent, 10107 virtual hits (18.4% of those reached).

## Melee bench: F13

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 132 over 8 battles (16.5 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 81.0 | 78 / 280 | 2.71 | 15.5% | 30777 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 16.7% | 113 |
| ags.Glacier 0.2.11 | 2.0 | 16.2% | 56 |
| hadur2.Hadur 3.17.1g4ef | 2.5 | 15.5% | 78 |
| gh.micro.Gruweltje 0.7 | 4.4 | 12.0% | 15 |
| shinh.Entangled 0.3 | 4.6 | 11.9% | 20 |
| apc.Colossus2 0.17 | 6.0 | 7.9% | 0 |
| stelo.Wang 1.0 | 7.4 | 6.4% | 0 |
| maribo.FollowFire 1 | 8.1 | 5.0% | 0 |
| ayk.WallHugger 1.0 | 8.5 | 4.9% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.8 | 82.9 | 8 / 35 | 3927 |
| 2 | 3 | 62.9 | 77.8 | 8 / 35 | 3527 |
| 3 | 3 | 63.8 | 78.4 | 9 / 35 | 3682 |
| 4 | 2 | 66.1 | 85.1 | 13 / 35 | 3937 |
| 5 | 3 | 65.3 | 81.0 | 11 / 35 | 4035 |
| 6 | 2 | 64.5 | 80.3 | 11 / 35 | 3860 |
| 7 | 3 | 63.9 | 78.7 | 10 / 35 | 3776 |
| 8 | 1 | 65.0 | 83.5 | 8 / 35 | 4033 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 79 | 34% |
| ags.Glacier 0.2.11 | 59 | 58% |
| shinh.Entangled 0.3 | 20 | 50% |
| gh.micro.Gruweltje 0.7 | 12 | 50% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 205 of 280 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 71 | 35% | 105 |
| ags.Glacier 0.2.11 | 59 | 29% | 88 |
| shinh.Entangled 0.3 | 34 | 17% | 40 |
| gh.micro.Gruweltje 0.7 | 23 | 11% | 30 |
| maribo.FollowFire 1 | 6 | 3% | 6 |
| apc.Colossus2 0.17 | 5 | 2% | 5 |
| ayk.WallHugger 1.0 | 3 | 1% | 3 |
| stelo.Wang 1.0 | 2 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 202284 melee ticks, 62692 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 120 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 120 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 0.

Targeting waves (276 rounds): 59874 sent, 53581 reached their opponent, 9430 virtual hits (17.6% of those reached).

## Melee bench: F14

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 495 over 8 battles (61.9 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 93.3 | 202 / 280 | 1.60 | 19.8% | 40350 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.0 | 19.8% | 202 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.9% | 24 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.6% | 42 |
| Lo_Ian.Gandalf_V4 4.0 | 4.6 | 9.9% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 4.8 | 9.9% | 3 |
| sanyi.mikrobi.Roberto 1.0 | 6.0 | 9.2% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.9 | 8.6% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 7.7% | 2 |
| pa.Improved 1.0 | 9.0 | 5.5% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 90.2 | 21 / 35 | 4975 |
| 2 | 1 | 70.3 | 92.7 | 24 / 35 | 5343 |
| 3 | 1 | 70.2 | 92.4 | 26 / 35 | 5203 |
| 4 | 1 | 69.9 | 89.8 | 25 / 35 | 5083 |
| 5 | 1 | 70.5 | 94.9 | 27 / 35 | 4871 |
| 6 | 1 | 71.1 | 97.5 | 28 / 35 | 5114 |
| 7 | 1 | 70.7 | 96.2 | 27 / 35 | 5024 |
| 8 | 1 | 69.8 | 93.0 | 24 / 35 | 4737 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 99 | 91% |
| catcat20.shape.Theta 0.018 | 84 | 67% |
| co.edu.usb.rc.LidisTron 1.0 | 20 | 95% |
| sanyi.mikrobi.Roberto 1.0 | 17 | 82% |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 93% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 75% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 82 of 280 rounds, at a mean tick of 975. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 37 | 45% | 85 |
| simonton.micro.Sprout 1.1.3 | 19 | 23% | 116 |
| sanyi.mikrobi.Roberto 1.0 | 8 | 10% | 27 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 6% | 25 |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 5% | 7 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 4% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 2% | 6 |
| pa.Improved 1.0 | 0 | 0% | 4 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 199269 melee ticks, 73366 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 57 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 1.

Targeting waves (273 rounds): 64257 sent, 58391 reached their opponent, 15546 virtual hits (26.6% of those reached).

## Melee bench: F15

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 776 over 8 battles (97.0 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 85.6 | 145 / 280 | 2.29 | 18.1% | 36753 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.0 | 18.1% | 145 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.8% | 24 |
| emp.Yngwie 1.11 | 3.0 | 13.1% | 67 |
| mld.DustBunny 3.8 | 3.3 | 13.0% | 16 |
| cb.nano.Insomnia 1.0 | 5.1 | 10.5% | 10 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.1% | 16 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.6% | 0 |
| lambdaxy.TBot 0.1 | 7.5 | 6.6% | 0 |
| divineomega.TrialBot 0.003 | 9.1 | 4.9% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 87.3 | 20 / 35 | 4563 |
| 2 | 1 | 67.5 | 87.0 | 17 / 35 | 4465 |
| 3 | 1 | 68.7 | 87.3 | 19 / 35 | 4825 |
| 4 | 1 | 66.5 | 81.6 | 18 / 35 | 4397 |
| 5 | 1 | 67.3 | 84.1 | 18 / 35 | 4603 |
| 6 | 1 | 69.0 | 88.3 | 20 / 35 | 4959 |
| 7 | 1 | 67.4 | 85.1 | 16 / 35 | 4510 |
| 8 | 1 | 67.0 | 84.4 | 17 / 35 | 4431 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 63 | 62% |
| kawigi.micro.Shiz 1.1 | 34 | 94% |
| mld.DustBunny 3.8 | 30 | 83% |
| kawigi.robot.Girl 1.2 | 26 | 73% |
| cb.nano.Insomnia 1.0 | 23 | 87% |
| divineomega.TrialBot 0.003 | 6 | 83% |
| lambdaxy.TBot 0.1 | 4 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 141 of 280 rounds, at a mean tick of 966. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 41 | 29% | 102 |
| kawigi.micro.Shiz 1.1 | 32 | 23% | 59 |
| mld.DustBunny 3.8 | 23 | 16% | 63 |
| cb.nano.Insomnia 1.0 | 15 | 11% | 18 |
| kawigi.robot.Girl 1.2 | 15 | 11% | 18 |
| divineomega.TrialBot 0.003 | 5 | 4% | 10 |
| lambdaxy.TBot 0.1 | 3 | 2% | 7 |
| Grystrion.TrackerWO 1.0 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 228108 melee ticks, 60736 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 48 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 75202 sent, 69058 reached their opponent, 12289 virtual hits (17.8% of those reached).

## Melee bench: F16

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 315 over 8 battles (39.4 per battle, most in one battle 142). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 86.4 | 141 / 280 | 2.22 | 18.5% | 39483 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.1 | 18.5% | 141 |
| gh.Griezel 0.5.2 | 2.0 | 16.3% | 67 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.9 | 13.9% | 7 |
| techdude.forest.FlamingForest 1.1 | 4.1 | 11.2% | 46 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.5% | 7 |
| tvv.nano.Polaris 1.2 | 5.6 | 9.2% | 7 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.2% | 0 |
| repositorio.NanoStep 1.0 | 8.8 | 4.9% | 0 |
| divineomega.DivineBot 1.9.4.5 | 8.9 | 4.8% | 5 |
| asd.Cthulhu 1.3 | 9.4 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 78.4 | 15 / 35 | 4609 |
| 2 | 1 | 69.3 | 89.2 | 17 / 35 | 5184 |
| 3 | 1 | 69.7 | 89.2 | 22 / 35 | 5336 |
| 4 | 1 | 68.0 | 85.1 | 15 / 35 | 4722 |
| 5 | 1 | 69.3 | 88.6 | 20 / 35 | 4980 |
| 6 | 1 | 68.3 | 85.7 | 19 / 35 | 4813 |
| 7 | 1 | 68.9 | 88.6 | 19 / 35 | 4805 |
| 8 | 1 | 68.3 | 86.7 | 14 / 35 | 5034 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 97 | 69% |
| techdude.forest.FlamingForest 1.1 | 47 | 53% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 28 | 89% |
| bvh.fnr.Fenrir 0.36l | 12 | 75% |
| tvv.nano.Polaris 1.2 | 12 | 67% |
| divineomega.DivineBot 1.9.4.5 | 4 | 75% |
| stelo.IntrinsicVolatility 1.4 | 3 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 140 of 280 rounds, at a mean tick of 1133. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 48 | 34% | 112 |
| techdude.forest.FlamingForest 1.1 | 30 | 21% | 55 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 22 | 16% | 44 |
| bvh.fnr.Fenrir 0.36l | 21 | 15% | 28 |
| tvv.nano.Polaris 1.2 | 8 | 6% | 16 |
| asd.Cthulhu 1.3 | 5 | 4% | 5 |
| stelo.IntrinsicVolatility 1.4 | 4 | 3% | 10 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 8 |
| repositorio.NanoStep 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 241995 melee ticks, 84581 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 35 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 1.

Targeting waves (273 rounds): 78836 sent, 72794 reached their opponent, 13670 virtual hits (18.8% of those reached).

## Melee bench: F17

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 507 over 8 battles (63.4 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 86.6 | 140 / 280 | 2.21 | 18.5% | 41361 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.0 | 18.5% | 140 |
| et.Predator 1.8 | 2.8 | 13.4% | 33 |
| oog.melee.Mercutio 1.0 | 2.9 | 13.2% | 39 |
| cx.BlestPain 1.41 | 3.4 | 12.8% | 54 |
| ahf.NanoAndrew .4 | 5.4 | 10.3% | 10 |
| nic.Nicator 2.4 | 5.9 | 9.4% | 2 |
| maribo.melee.BMV 0.1 | 6.8 | 8.7% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.7% | 0 |
| tex.Longbot 0.4 | 8.8 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 86.3 | 15 / 35 | 5556 |
| 2 | 1 | 67.0 | 82.5 | 15 / 35 | 4739 |
| 3 | 1 | 69.5 | 87.9 | 21 / 35 | 5279 |
| 4 | 1 | 68.5 | 87.0 | 17 / 35 | 5401 |
| 5 | 1 | 70.3 | 93.7 | 23 / 35 | 5161 |
| 6 | 1 | 69.5 | 87.6 | 21 / 35 | 5254 |
| 7 | 1 | 66.9 | 83.5 | 13 / 35 | 4977 |
| 8 | 1 | 67.4 | 84.1 | 15 / 35 | 4994 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 67 | 76% |
| et.Predator 1.8 | 60 | 68% |
| cx.BlestPain 1.41 | 44 | 48% |
| ahf.NanoAndrew .4 | 11 | 100% |
| maribo.melee.BMV 0.1 | 10 | 100% |
| nic.Nicator 2.4 | 6 | 83% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 143 of 280 rounds, at a mean tick of 1048. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 42 | 29% | 76 |
| cx.BlestPain 1.41 | 41 | 29% | 64 |
| oog.melee.Mercutio 1.0 | 25 | 17% | 76 |
| ahf.NanoAndrew .4 | 14 | 10% | 23 |
| maribo.melee.BMV 0.1 | 8 | 6% | 21 |
| nic.Nicator 2.4 | 7 | 5% | 12 |
| tex.Longbot 0.4 | 2 | 1% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 5 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 221159 melee ticks, 78471 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 871 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 409 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 1.

Targeting waves (273 rounds): 74881 sent, 68788 reached their opponent, 15980 virtual hits (23.2% of those reached).

## Melee bench: F18

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 750 over 8 battles (93.8 per battle, most in one battle 156). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 91.5 | 192 / 280 | 1.77 | 19.3% | 35410 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.0 | 19.3% | 192 |
| morbid.MorbidPriest 1.0 | 2.1 | 13.5% | 32 |
| agd.Mooserwirt2 2.7 | 3.1 | 12.2% | 23 |
| uji.DBH 1.1 | 3.8 | 11.2% | 11 |
| spinnercat.Robovirus 2.718 | 5.8 | 8.8% | 8 |
| ratosh.Nobo 0.21 | 6.1 | 8.7% | 4 |
| sigterm.Sigterm 1.0 | 6.1 | 8.5% | 8 |
| kawigi.mini.Fhqwhgads 1.1 | 8.3 | 6.9% | 1 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.4 | 5.4% | 0 |
| stelo.WangRobot 1.0 | 9.4 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 94.9 | 27 / 35 | 4728 |
| 2 | 1 | 69.0 | 89.8 | 27 / 35 | 4442 |
| 3 | 1 | 69.0 | 91.4 | 24 / 35 | 4463 |
| 4 | 1 | 69.2 | 91.7 | 26 / 35 | 4399 |
| 5 | 1 | 67.9 | 87.9 | 19 / 35 | 4344 |
| 6 | 1 | 67.7 | 89.5 | 21 / 35 | 4160 |
| 7 | 1 | 69.3 | 93.3 | 24 / 35 | 4328 |
| 8 | 1 | 69.4 | 93.0 | 24 / 35 | 4546 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 84 | 80% |
| agd.Mooserwirt2 2.7 | 46 | 89% |
| uji.DBH 1.1 | 37 | 86% |
| sigterm.Sigterm 1.0 | 22 | 82% |
| spinnercat.Robovirus 2.718 | 14 | 86% |
| ratosh.Nobo 0.21 | 9 | 89% |
| stelo.WangRobot 1.0 | 6 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 100% |

Hadur died in 94 of 280 rounds, at a mean tick of 814. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 28 | 30% | 102 |
| agd.Mooserwirt2 2.7 | 19 | 20% | 65 |
| uji.DBH 1.1 | 15 | 16% | 31 |
| sigterm.Sigterm 1.0 | 7 | 7% | 25 |
| spinnercat.Robovirus 2.718 | 7 | 7% | 20 |
| ratosh.Nobo 0.21 | 7 | 7% | 14 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 5 | 5% | 6 |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 1% | 9 |
| stelo.WangRobot 1.0 | 1 | 1% | 8 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 269 rounds): 186881 melee ticks, 63325 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 87 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (269 rounds): longest scan gap while four or more were alive 87 ticks (269 rounds over 8); rounds whose longest gap at any count was over 8: 269; robots dropped as dead without a death event: 2.

Targeting waves (269 rounds): 63643 sent, 57598 reached their opponent, 13494 virtual hits (23.4% of those reached).

## Melee bench: F19

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 268 over 8 battles (33.5 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 97.4 | 256 / 280 | 1.23 | 21.8% | 45774 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.0 | 21.8% | 256 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.8% | 6 |
| mld.Infinity 2.2 | 3.1 | 12.6% | 9 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 11.1% | 5 |
| erdnis.Rover 0.3 | 4.6 | 10.8% | 2 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.2% | 0 |
| mbh.Mbh 0.1 | 7.4 | 7.3% | 0 |
| pac.ABC 2.1 | 7.5 | 6.8% | 2 |
| pbg.R2D2 1.0 | 8.9 | 5.4% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 98.1 | 33 / 35 | 5933 |
| 2 | 1 | 72.4 | 96.5 | 32 / 35 | 5440 |
| 3 | 1 | 72.6 | 96.2 | 29 / 35 | 5933 |
| 4 | 1 | 73.4 | 98.4 | 33 / 35 | 6373 |
| 5 | 1 | 72.4 | 96.5 | 32 / 35 | 5553 |
| 6 | 1 | 73.1 | 99.7 | 34 / 35 | 5640 |
| 7 | 1 | 72.4 | 95.9 | 31 / 35 | 5598 |
| 8 | 1 | 72.4 | 98.1 | 32 / 35 | 5304 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 140 | 97% |
| mld.Infinity 2.2 | 49 | 100% |
| krillr.mini.JointStrike 2.0.0 | 28 | 93% |
| erdnis.Rover 0.3 | 22 | 100% |
| pac.ABC 2.1 | 12 | 92% |
| patson.PatsonTestBot 1.0 | 8 | 100% |
| mbh.Mbh 0.1 | 4 | 100% |

Hadur died in 25 of 280 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 10 | 40% | 105 |
| krillr.mini.JointStrike 2.0.0 | 5 | 20% | 42 |
| erdnis.Rover 0.3 | 3 | 12% | 35 |
| patson.PatsonTestBot 1.0 | 2 | 8% | 22 |
| mbh.Mbh 0.1 | 2 | 8% | 11 |
| mld.Infinity 2.2 | 1 | 4% | 36 |
| pac.ABC 2.1 | 1 | 4% | 11 |
| pbg.R2D2 1.0 | 0 | 0% | 10 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 265 rounds): 174209 melee ticks, 64457 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 128 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (265 rounds): longest scan gap while four or more were alive 128 ticks (265 rounds over 8); rounds whose longest gap at any count was over 8: 265; robots dropped as dead without a death event: 0.

Targeting waves (265 rounds): 59593 sent, 53849 reached their opponent, 13897 virtual hits (25.8% of those reached).

## Melee bench: F20

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 382 over 8 battles (47.8 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 92.9 | 193 / 280 | 1.64 | 20.5% | 43887 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.0 | 20.5% | 193 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.3% | 45 |
| fwb.Nine 1.0.1 | 3.4 | 11.5% | 9 |
| catcat20.Rabbit 0.001 | 4.1 | 10.7% | 25 |
| nz.jdc.nano.GridFu 1.0 | 4.5 | 10.1% | 2 |
| m3thos.mini.Eva01 0.5.5 | 6.1 | 8.5% | 1 |
| bayen.nut.Squirrel 1.615 | 7.1 | 7.3% | 3 |
| djdjdj.NanoSkunk10 1.0 | 8.1 | 6.2% | 3 |
| ntc.ControlledChaos 1.1.4 | 8.6 | 5.6% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 94.9 | 24 / 35 | 5328 |
| 2 | 1 | 72.4 | 95.6 | 29 / 35 | 6021 |
| 3 | 1 | 69.0 | 89.2 | 21 / 35 | 5093 |
| 4 | 1 | 71.9 | 95.6 | 27 / 35 | 5779 |
| 5 | 1 | 70.5 | 91.7 | 21 / 35 | 5424 |
| 6 | 1 | 71.6 | 96.2 | 27 / 35 | 5579 |
| 7 | 1 | 68.9 | 89.2 | 19 / 35 | 5034 |
| 8 | 1 | 70.6 | 91.1 | 25 / 35 | 5629 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 105 | 77% |
| fwb.Nine 1.0.1 | 53 | 96% |
| catcat20.Rabbit 0.001 | 50 | 62% |
| nz.jdc.nano.GridFu 1.0 | 11 | 91% |
| bayen.nut.Squirrel 1.615 | 6 | 100% |
| m3thos.mini.Eva01 0.5.5 | 5 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 100% |
| djdjdj.NanoSkunk10 1.0 | 3 | 67% |
| ntc.ControlledChaos 1.1.4 | 2 | 100% |

Hadur died in 89 of 280 rounds, at a mean tick of 1049. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 47 | 53% | 125 |
| catcat20.Rabbit 0.001 | 24 | 27% | 64 |
| fwb.Nine 1.0.1 | 7 | 8% | 24 |
| m3thos.mini.Eva01 0.5.5 | 2 | 2% | 15 |
| bayen.nut.Squirrel 1.615 | 2 | 2% | 14 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 4 |
| nz.jdc.nano.GridFu 1.0 | 1 | 1% | 24 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 6 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 231645 melee ticks, 71249 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 33 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 0.

Targeting waves (273 rounds): 73388 sent, 67360 reached their opponent, 16700 virtual hits (24.8% of those reached).

## Melee bench: F21

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1014 over 8 battles (126.8 per battle, most in one battle 215). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 92.0 | 165 / 280 | 1.72 | 19.8% | 42663 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.0 | 19.8% | 165 |
| eem.EvBot v4.6.16 | 2.0 | 16.8% | 91 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.4% | 7 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.1% | 5 |
| eld.Hmm 1.0 | 5.1 | 8.5% | 14 |
| oa.weak.BotherBot 0.1 | 5.9 | 7.6% | 0 |
| el.JumpShoot 0.2 | 7.9 | 5.8% | 1 |
| fire219.CatBot 1.0 | 8.0 | 5.9% | 0 |
| PSW.Relentless 0.1 | 9.0 | 5.3% | 0 |
| arthord.MannyPacquiao Beta | 9.1 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 92.4 | 21 / 35 | 5506 |
| 2 | 1 | 71.1 | 93.3 | 25 / 35 | 5666 |
| 3 | 1 | 70.8 | 92.7 | 21 / 35 | 5565 |
| 4 | 1 | 71.3 | 95.2 | 26 / 35 | 5446 |
| 5 | 1 | 69.3 | 91.1 | 17 / 35 | 5034 |
| 6 | 1 | 69.8 | 91.1 | 21 / 35 | 4993 |
| 7 | 1 | 67.7 | 85.7 | 14 / 35 | 4898 |
| 8 | 1 | 70.9 | 94.3 | 20 / 35 | 5555 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 156 | 67% |
| cf.RiO.RiOx 4.2.1 | 30 | 93% |
| dummy.mini.Scimitar 1.01 | 28 | 82% |
| eld.Hmm 1.0 | 19 | 37% |
| oa.weak.BotherBot 0.1 | 2 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 126 of 280 rounds, at a mean tick of 1302. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 62 | 49% | 145 |
| dummy.mini.Scimitar 1.01 | 17 | 13% | 48 |
| cf.RiO.RiOx 4.2.1 | 16 | 13% | 42 |
| eld.Hmm 1.0 | 15 | 12% | 32 |
| PSW.Relentless 0.1 | 3 | 2% | 3 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 7 |
| arthord.MannyPacquiao Beta | 1 | 1% | 2 |
11 death(s) with no robot to name.

Posture (Hadur's M records, 278 rounds): 248542 melee ticks, 114527 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 668 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (278 rounds): longest scan gap while four or more were alive 276 ticks (278 rounds over 8); rounds whose longest gap at any count was over 8: 278; robots dropped as dead without a death event: 0.

Targeting waves (278 rounds): 75119 sent, 69077 reached their opponent, 13343 virtual hits (19.3% of those reached).

## Melee bench: F22

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 712 over 8 battles (89.0 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 85.6 | 112 / 280 | 2.29 | 17.4% | 35072 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.3 | 17.4% | 112 |
| pe.SandboxDT 2.71m | 1.8 | 17.0% | 101 |
| kvk.HebusLeTroll 0.35 | 3.0 | 15.0% | 34 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.2% | 28 |
| bigpete.Stewie 1.0 | 5.0 | 10.9% | 4 |
| yk.JahRoslav 1.1 | 6.1 | 6.6% | 2 |
| gg.Squaraus 0.6 | 7.4 | 6.0% | 0 |
| tad.Dalek98 0.98 | 7.9 | 5.9% | 0 |
| pbg.NinjaX 1.2 | 8.6 | 5.3% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.3 | 83.5 | 14 / 35 | 4414 |
| 2 | 1 | 68.1 | 87.6 | 17 / 35 | 4401 |
| 3 | 1 | 68.1 | 89.8 | 15 / 35 | 4144 |
| 4 | 1 | 68.5 | 89.2 | 16 / 35 | 4637 |
| 5 | 1 | 67.5 | 87.0 | 14 / 35 | 4322 |
| 6 | 1 | 67.5 | 85.1 | 13 / 35 | 4466 |
| 7 | 1 | 67.6 | 84.4 | 15 / 35 | 4355 |
| 8 | 2 | 64.9 | 78.4 | 8 / 35 | 4333 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 79 | 42% |
| jlm.javaDisturbance 0.59 | 49 | 65% |
| kvk.HebusLeTroll 0.35 | 41 | 73% |
| bigpete.Stewie 1.0 | 12 | 92% |
| pbg.NinjaX 1.2 | 2 | 100% |
| tad.Dalek98 0.98 | 1 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |

Hadur died in 174 of 280 rounds, at a mean tick of 996. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 83 | 48% | 123 |
| jlm.javaDisturbance 0.59 | 38 | 22% | 73 |
| kvk.HebusLeTroll 0.35 | 34 | 20% | 56 |
| bigpete.Stewie 1.0 | 7 | 4% | 15 |
| yk.JahRoslav 1.1 | 3 | 2% | 6 |
| tad.Dalek98 0.98 | 2 | 1% | 2 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 2 | 1% | 1 |
| pbg.NinjaX 1.2 | 0 | 0% | 2 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 223469 melee ticks, 61817 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 42 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 1.

Targeting waves (273 rounds): 71970 sent, 66142 reached their opponent, 11687 virtual hits (17.7% of those reached).

## Melee bench: F23

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 748 over 8 battles (93.5 per battle, most in one battle 220). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 95.5 | 229 / 280 | 1.40 | 21.1% | 43420 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.0 | 21.1% | 229 |
| pe.SandboxLump 1.52 | 2.0 | 15.9% | 30 |
| cre.Karolos 0.32 | 3.0 | 13.8% | 11 |
| stelo.AreaTargetingBot 1.1 | 4.1 | 10.4% | 6 |
| stelo.RamTrackSurfer 1.2 | 5.0 | 9.5% | 3 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.4 | 8.8% | 0 |
| cw.megas.Blade 0.8 | 6.8 | 8.3% | 0 |
| sample.Walls 1.0 | 7.8 | 7.7% | 1 |
| cli.WasteOfAmmo 1.0 | 9.1 | 2.7% | 0 |
| rrh.Iwillfindyou 2.0 | 9.9 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 97.8 | 29 / 35 | 5916 |
| 2 | 1 | 70.7 | 92.1 | 24 / 35 | 4910 |
| 3 | 1 | 73.0 | 97.1 | 30 / 35 | 5494 |
| 4 | 1 | 71.2 | 91.7 | 28 / 35 | 5205 |
| 5 | 1 | 73.2 | 98.4 | 32 / 35 | 6120 |
| 6 | 1 | 71.8 | 95.2 | 29 / 35 | 5237 |
| 7 | 1 | 71.1 | 93.7 | 25 / 35 | 5173 |
| 8 | 1 | 73.0 | 98.1 | 32 / 35 | 5365 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 118 | 88% |
| cre.Karolos 0.32 | 75 | 93% |
| stelo.AreaTargetingBot 1.1 | 16 | 100% |
| stelo.RamTrackSurfer 1.2 | 15 | 87% |
| sample.Walls 1.0 | 11 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 100% |
| cw.megas.Blade 0.8 | 7 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 57 of 280 rounds, at a mean tick of 805. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 24 | 42% | 120 |
| cre.Karolos 0.32 | 16 | 28% | 74 |
| stelo.RamTrackSurfer 1.2 | 4 | 7% | 29 |
| stelo.AreaTargetingBot 1.1 | 4 | 7% | 26 |
| sample.Walls 1.0 | 1 | 2% | 10 |
| cw.megas.Blade 0.8 | 1 | 2% | 9 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 2% | 8 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 280 rounds): 180217 melee ticks, 63605 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (280 rounds): longest scan gap while four or more were alive 59 ticks (279 rounds over 8); rounds whose longest gap at any count was over 8: 279; robots dropped as dead without a death event: 0.

Targeting waves (280 rounds): 57735 sent, 51556 reached their opponent, 16797 virtual hits (32.6% of those reached).

## Melee bench: F24

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 634 over 8 battles (79.3 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 79.9 | 99 / 280 | 2.81 | 15.7% | 27693 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.1 | 15.7% | 99 |
| rz.GlowBlowMelee 1.4 | 2.1 | 14.3% | 51 |
| florent.XSeries.X2 0.12 | 3.1 | 13.4% | 42 |
| davidalves.Phoenix 0.54 | 4.1 | 12.7% | 50 |
| pedersen.Ugluk 1.1.1 | 4.5 | 12.0% | 27 |
| oog.melee.Corsair 1.0 | 6.0 | 9.6% | 8 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 7.0% | 3 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.0% | 0 |
| as.FrankTheTank 1.3 | 9.3 | 4.9% | 0 |
| evd.X1 0.01 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 82.2 | 13 / 35 | 3774 |
| 2 | 1 | 65.1 | 81.9 | 15 / 35 | 3618 |
| 3 | 1 | 63.1 | 78.1 | 12 / 35 | 3300 |
| 4 | 1 | 64.0 | 78.1 | 15 / 35 | 3429 |
| 5 | 1 | 64.2 | 79.4 | 10 / 35 | 3674 |
| 6 | 1 | 65.7 | 85.4 | 15 / 35 | 3484 |
| 7 | 2 | 62.0 | 74.6 | 10 / 35 | 3117 |
| 8 | 1 | 63.4 | 79.4 | 9 / 35 | 3297 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 40 | 58% |
| davidalves.Phoenix 0.54 | 39 | 44% |
| pedersen.Ugluk 1.1.1 | 33 | 73% |
| florent.XSeries.X2 0.12 | 27 | 67% |
| oog.melee.Corsair 1.0 | 10 | 50% |
| stelo.SoJNanoMelee 1.1 | 7 | 86% |
| lunchie.Lunchbox 0.93 | 3 | 100% |
| as.FrankTheTank 1.3 | 2 | 100% |

Hadur died in 187 of 280 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 43 | 23% | 61 |
| florent.XSeries.X2 0.12 | 43 | 23% | 58 |
| rz.GlowBlowMelee 1.4 | 41 | 22% | 72 |
| pedersen.Ugluk 1.1.1 | 32 | 17% | 47 |
| oog.melee.Corsair 1.0 | 13 | 7% | 20 |
| stelo.SoJNanoMelee 1.1 | 7 | 4% | 12 |
| lunchie.Lunchbox 0.93 | 2 | 1% | 6 |
| as.FrankTheTank 1.3 | 1 | 1% | 3 |
| evd.X1 0.01 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 185775 melee ticks, 44088 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 48 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 62871 sent, 56562 reached their opponent, 11480 virtual hits (20.3% of those reached).

## Melee bench: F25

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 379 over 8 battles (47.4 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 86.3 | 177 / 280 | 2.23 | 18.1% | 29902 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.0 | 18.1% | 177 |
| voidious.micro.BlitzBat 1.05 | 2.4 | 13.4% | 24 |
| voidious.mini.BrokenSword 2.0.3 | 2.8 | 13.4% | 24 |
| jdw.Hurricane 1.4 | 4.4 | 10.9% | 20 |
| gre.svman4.Morfeas 1.4.1 | 5.1 | 9.9% | 17 |
| ds.Oo 2.2 | 5.4 | 9.6% | 8 |
| adt.Ar2 1.1 | 8.0 | 6.9% | 2 |
| awesomeness.Elite 1.0 | 8.0 | 6.8% | 1 |
| gjr.Cephalosporin 0.1 | 8.3 | 6.4% | 6 |
| amk.ChumbaMini 0.2 | 9.8 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 90.5 | 23 / 35 | 3434 |
| 2 | 1 | 69.0 | 90.8 | 24 / 35 | 3974 |
| 3 | 1 | 64.6 | 79.4 | 16 / 35 | 3651 |
| 4 | 1 | 67.1 | 83.8 | 24 / 35 | 3753 |
| 5 | 1 | 64.8 | 80.6 | 18 / 35 | 3378 |
| 6 | 1 | 68.7 | 90.2 | 25 / 35 | 4018 |
| 7 | 1 | 68.2 | 88.3 | 24 / 35 | 3916 |
| 8 | 1 | 68.0 | 87.3 | 23 / 35 | 3778 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 57 | 86% |
| voidious.micro.BlitzBat 1.05 | 54 | 96% |
| jdw.Hurricane 1.4 | 37 | 84% |
| gre.svman4.Morfeas 1.4.1 | 20 | 70% |
| ds.Oo 2.2 | 18 | 89% |
| gjr.Cephalosporin 0.1 | 7 | 100% |
| adt.Ar2 1.1 | 4 | 100% |
| amk.ChumbaMini 0.2 | 2 | 100% |
| awesomeness.Elite 1.0 | 2 | 100% |

Hadur died in 105 of 280 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 24 | 23% | 59 |
| voidious.micro.BlitzBat 1.05 | 21 | 20% | 64 |
| gre.svman4.Morfeas 1.4.1 | 14 | 13% | 31 |
| jdw.Hurricane 1.4 | 12 | 11% | 41 |
| ds.Oo 2.2 | 10 | 10% | 35 |
| awesomeness.Elite 1.0 | 7 | 7% | 12 |
| amk.ChumbaMini 0.2 | 6 | 6% | 11 |
| adt.Ar2 1.1 | 6 | 6% | 10 |
| gjr.Cephalosporin 0.1 | 3 | 3% | 17 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 171174 melee ticks, 40871 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 41 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 0.

Targeting waves (276 rounds): 61892 sent, 55846 reached their opponent, 10256 virtual hits (18.4% of those reached).

## Melee bench: F26

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 272 over 8 battles (34.0 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 92.8 | 191 / 280 | 1.65 | 20.0% | 44795 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.0 | 20.0% | 191 |
| ak.Fermat 2.0 | 2.1 | 14.6% | 41 |
| lrem.Spectre 0.4.4 | 3.5 | 12.5% | 13 |
| shu.nitro.LENIN .T34 | 3.8 | 12.0% | 22 |
| js.PinBall 1.6 | 4.6 | 11.4% | 6 |
| jaybot.adv.bots.JayBot 2.0 | 6.4 | 9.1% | 2 |
| gh.mini.GrubbmOne 1.0 | 6.6 | 8.3% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.8% | 3 |
| sample.SpinBot 1.0 | 9.0 | 3.8% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 90.8 | 18 / 35 | 5829 |
| 2 | 1 | 71.2 | 95.9 | 29 / 35 | 5255 |
| 3 | 1 | 71.1 | 94.6 | 26 / 35 | 5417 |
| 4 | 1 | 70.0 | 93.0 | 21 / 35 | 5448 |
| 5 | 1 | 71.5 | 95.2 | 25 / 35 | 5666 |
| 6 | 1 | 70.4 | 90.8 | 24 / 35 | 5673 |
| 7 | 1 | 70.5 | 89.5 | 25 / 35 | 5599 |
| 8 | 1 | 70.9 | 92.7 | 23 / 35 | 5908 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 81 | 75% |
| lrem.Spectre 0.4.4 | 61 | 90% |
| shu.nitro.LENIN .T34 | 50 | 86% |
| js.PinBall 1.6 | 21 | 81% |
| jaybot.adv.bots.JayBot 2.0 | 10 | 100% |
| gh.mini.GrubbmOne 1.0 | 3 | 100% |
| sample.SpinBot 1.0 | 2 | 50% |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 100% |

Hadur died in 91 of 280 rounds, at a mean tick of 976. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 43 | 47% | 93 |
| shu.nitro.LENIN .T34 | 16 | 18% | 54 |
| lrem.Spectre 0.4.4 | 14 | 15% | 68 |
| js.PinBall 1.6 | 8 | 9% | 35 |
| jaybot.adv.bots.JayBot 2.0 | 3 | 3% | 13 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 2% | 9 |
| gh.mini.GrubbmOne 1.0 | 2 | 2% | 6 |
| sample.SpinBot 1.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 218674 melee ticks, 67370 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 31 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 0.

Targeting waves (272 rounds): 72009 sent, 66063 reached their opponent, 17416 virtual hits (26.4% of those reached).

## Melee bench: F27

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 679 over 8 battles (84.9 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 93.5 | 224 / 280 | 1.58 | 20.2% | 37959 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.0 | 20.2% | 224 |
| mk.Alpha 0.2.1 | 2.3 | 13.6% | 32 |
| EH.Eagle 1.0.6 | 3.4 | 11.1% | 7 |
| sheldor.melee.nano.TestMelee 0.1 | 5.0 | 9.2% | 5 |
| techdude.kombat.FlamingKombat 1.5 | 5.3 | 9.3% | 2 |
| wee.Gem 1.8.4 | 5.6 | 9.5% | 7 |
| joe.ADinosaur 1.0 | 7.0 | 8.0% | 1 |
| throxbot.ThroxBot 0.1 | 7.0 | 8.0% | 2 |
| caimano.Furia_Ceca 0.22 | 8.9 | 6.4% | 0 |
| cs.Grudge 1.0 | 9.6 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 94.0 | 31 / 35 | 4652 |
| 2 | 1 | 67.8 | 87.0 | 24 / 35 | 4289 |
| 3 | 1 | 71.1 | 96.5 | 29 / 35 | 4771 |
| 4 | 1 | 70.1 | 92.1 | 29 / 35 | 4999 |
| 5 | 1 | 69.7 | 92.7 | 27 / 35 | 4455 |
| 6 | 1 | 70.2 | 94.6 | 27 / 35 | 4892 |
| 7 | 1 | 70.5 | 94.9 | 29 / 35 | 4800 |
| 8 | 1 | 71.2 | 96.5 | 28 / 35 | 5101 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 128 | 91% |
| EH.Eagle 1.0.6 | 44 | 95% |
| sheldor.melee.nano.TestMelee 0.1 | 22 | 91% |
| wee.Gem 1.8.4 | 17 | 88% |
| techdude.kombat.FlamingKombat 1.5 | 14 | 100% |
| throxbot.ThroxBot 0.1 | 13 | 92% |
| joe.ADinosaur 1.0 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 61 of 280 rounds, at a mean tick of 746. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 24 | 39% | 118 |
| EH.Eagle 1.0.6 | 8 | 13% | 51 |
| joe.ADinosaur 1.0 | 7 | 11% | 10 |
| throxbot.ThroxBot 0.1 | 5 | 8% | 22 |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 7% | 28 |
| wee.Gem 1.8.4 | 4 | 7% | 26 |
| caimano.Furia_Ceca 0.22 | 3 | 5% | 8 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 2% | 17 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 185282 melee ticks, 59652 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 36 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 36 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 60942 sent, 54869 reached their opponent, 14724 virtual hits (26.8% of those reached).

## Melee bench: F28

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 411 over 8 battles (51.4 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 90.8 | 178 / 280 | 1.83 | 18.4% | 29382 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.0 | 18.4% | 178 |
| kid.test.NightFox .2 | 2.0 | 15.4% | 47 |
| uji.Antique 1.0 | 3.0 | 12.4% | 31 |
| qohnil.blot.BlotBot 3.61 | 4.4 | 10.7% | 10 |
| pfvicm.Sobieski 7.2.3b | 4.6 | 10.3% | 3 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.4% | 1 |
| ahr.ice.Ice 1.0.2 | 6.9 | 7.3% | 3 |
| matt.advanced.Katana 1.0 | 8.1 | 6.3% | 8 |
| stelo.Lifestealer 1.0 | 9.3 | 5.4% | 0 |
| stelo.PianistNano 1.2 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 90.8 | 22 / 35 | 3847 |
| 2 | 1 | 67.9 | 90.2 | 21 / 35 | 3539 |
| 3 | 1 | 68.9 | 93.3 | 26 / 35 | 3962 |
| 4 | 1 | 67.7 | 92.7 | 22 / 35 | 3461 |
| 5 | 1 | 68.6 | 91.4 | 24 / 35 | 3975 |
| 6 | 1 | 68.1 | 92.4 | 23 / 35 | 3416 |
| 7 | 1 | 67.2 | 87.0 | 21 / 35 | 3772 |
| 8 | 1 | 66.9 | 88.9 | 19 / 35 | 3410 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 117 | 79% |
| uji.Antique 1.0 | 64 | 77% |
| pfvicm.Sobieski 7.2.3b | 13 | 85% |
| qohnil.blot.BlotBot 3.61 | 13 | 62% |
| amk.ChumbaWumba 0.3 | 7 | 100% |
| matt.advanced.Katana 1.0 | 5 | 80% |
| ahr.ice.Ice 1.0.2 | 5 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |

Hadur died in 105 of 280 rounds, at a mean tick of 828. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 40 | 38% | 87 |
| uji.Antique 1.0 | 27 | 26% | 92 |
| pfvicm.Sobieski 7.2.3b | 11 | 10% | 31 |
| qohnil.blot.BlotBot 3.61 | 10 | 10% | 25 |
| amk.ChumbaWumba 0.3 | 7 | 7% | 20 |
| ahr.ice.Ice 1.0.2 | 5 | 5% | 10 |
| matt.advanced.Katana 1.0 | 2 | 2% | 11 |
| stelo.Lifestealer 1.0 | 0 | 0% | 3 |
| stelo.PianistNano 1.2 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 269 rounds): 177714 melee ticks, 56504 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 676 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (269 rounds): longest scan gap while four or more were alive 309 ticks (269 rounds over 8); rounds whose longest gap at any count was over 8: 269; robots dropped as dead without a death event: 0.

Targeting waves (269 rounds): 60869 sent, 54836 reached their opponent, 8555 virtual hits (15.6% of those reached).

## Melee bench: F29

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 917 over 8 battles (114.6 per battle, most in one battle 146). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 86.7 | 140 / 280 | 2.20 | 18.3% | 34022 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.0 | 18.3% | 140 |
| deewiant.Anomaly 0.2 | 2.3 | 15.0% | 48 |
| zyx.mega.YersiniaPestis 3.1 | 2.8 | 14.7% | 60 |
| myl.micro.Troodon 1.10 | 4.0 | 12.2% | 9 |
| jok.PheonixM 0.1.2 | 5.0 | 10.8% | 15 |
| ph.melee.ArcherME 0.3 | 6.1 | 8.0% | 2 |
| fullsail.TimbotNoPrediction 1.0 | 7.3 | 6.2% | 0 |
| DBall.Anarchy 0.1 | 7.8 | 5.8% | 2 |
| jangs.ns51 1.0 | 9.1 | 4.7% | 2 |
| ap.Frederick 1.1 | 9.8 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 90.8 | 23 / 35 | 4640 |
| 2 | 1 | 67.7 | 85.7 | 15 / 35 | 4128 |
| 3 | 1 | 67.7 | 85.1 | 16 / 35 | 4255 |
| 4 | 1 | 66.3 | 81.3 | 15 / 35 | 3939 |
| 5 | 1 | 68.5 | 89.2 | 17 / 35 | 4272 |
| 6 | 1 | 66.6 | 82.2 | 13 / 35 | 4019 |
| 7 | 1 | 69.7 | 90.2 | 21 / 35 | 4514 |
| 8 | 1 | 68.9 | 88.9 | 20 / 35 | 4255 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 87 | 67% |
| zyx.mega.YersiniaPestis 3.1 | 48 | 56% |
| myl.micro.Troodon 1.10 | 33 | 91% |
| jok.PheonixM 0.1.2 | 23 | 83% |
| jangs.ns51 1.0 | 2 | 100% |
| DBall.Anarchy 0.1 | 2 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 149 of 280 rounds, at a mean tick of 1011. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 53 | 36% | 109 |
| zyx.mega.YersiniaPestis 3.1 | 47 | 32% | 78 |
| jok.PheonixM 0.1.2 | 20 | 13% | 41 |
| myl.micro.Troodon 1.10 | 17 | 11% | 36 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 2% | 6 |
| ph.melee.ArcherME 0.3 | 2 | 1% | 2 |
| DBall.Anarchy 0.1 | 0 | 0% | 5 |
| jangs.ns51 1.0 | 0 | 0% | 3 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 229711 melee ticks, 68238 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 44 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 39 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 0.

Targeting waves (275 rounds): 75561 sent, 69482 reached their opponent, 12246 virtual hits (17.6% of those reached).

## Melee bench: F30

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 992 over 8 battles (124.0 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 75.2 | 56 / 280 | 3.24 | 14.5% | 27358 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.5 | 14.5% | 56 |
| catcat20.Matcha 0.006 | 2.5 | 13.8% | 63 |
| darkcanuck.B26354 1.06 | 2.9 | 13.4% | 61 |
| stelo.PastFuture 2.3.2 | 4.0 | 12.7% | 26 |
| oog.melee.Capulet 1.2 | 4.1 | 12.7% | 41 |
| intruder.PrairieWolf 2.61 | 6.3 | 9.0% | 17 |
| fowl3628800.LightningBolt 2.6.0 | 7.5 | 7.5% | 12 |
| tripphippy.Alice 1.1 | 7.9 | 6.9% | 4 |
| ntc.Opposite 1.5 | 8.4 | 7.1% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.2 | 74.0 | 8 / 35 | 3377 |
| 2 | 2 | 62.2 | 73.0 | 9 / 35 | 3675 |
| 3 | 1 | 61.7 | 75.2 | 4 / 35 | 3470 |
| 4 | 2 | 61.4 | 72.7 | 7 / 35 | 3426 |
| 5 | 1 | 61.9 | 76.2 | 7 / 35 | 3207 |
| 6 | 3 | 59.6 | 72.1 | 3 / 35 | 2916 |
| 7 | 1 | 64.7 | 81.3 | 12 / 35 | 3986 |
| 8 | 1 | 62.0 | 76.8 | 6 / 35 | 3301 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 32 | 38% |
| oog.melee.Capulet 1.2 | 31 | 48% |
| darkcanuck.B26354 1.06 | 26 | 31% |
| stelo.PastFuture 2.3.2 | 14 | 36% |
| intruder.PrairieWolf 2.61 | 11 | 45% |
| tripphippy.Alice 1.1 | 8 | 75% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 75% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 232 of 280 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 52 | 22% | 61 |
| oog.melee.Capulet 1.2 | 47 | 20% | 62 |
| catcat20.Matcha 0.006 | 44 | 19% | 56 |
| stelo.PastFuture 2.3.2 | 39 | 17% | 46 |
| intruder.PrairieWolf 2.61 | 15 | 6% | 20 |
| tripphippy.Alice 1.1 | 11 | 5% | 16 |
| fowl3628800.LightningBolt 2.6.0 | 10 | 4% | 12 |
| ntc.Opposite 1.5 | 6 | 3% | 7 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 220065 melee ticks, 34953 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 488 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 351 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 1.

Targeting waves (275 rounds): 70986 sent, 64720 reached their opponent, 11415 virtual hits (17.6% of those reached).

## Melee bench: F31

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 676 over 8 battles (84.5 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 76.4 | 64 / 280 | 3.13 | 14.8% | 26070 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.8% | 120 |
| hadur2.Hadur 3.17.1g4ef | 2.3 | 14.8% | 64 |
| gh.mini.Griezel 0.2 | 2.8 | 13.8% | 71 |
| d414.nano.Quantum 1.0.0 | 4.4 | 11.2% | 7 |
| spinnercat.micro.Tyger 0.1 | 4.9 | 11.1% | 11 |
| gh.nano.Grofvuil 0.2 | 5.9 | 8.5% | 5 |
| timmit.nano.TimDog 0.33 | 7.1 | 7.0% | 1 |
| fm.mammillarias 1.3 | 7.9 | 6.1% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.1 | 5.3% | 0 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 77.5 | 7 / 35 | 3444 |
| 2 | 2 | 64.9 | 81.3 | 12 / 35 | 3539 |
| 3 | 3 | 60.2 | 73.0 | 5 / 35 | 2785 |
| 4 | 2 | 62.5 | 74.9 | 9 / 35 | 3334 |
| 5 | 2 | 62.8 | 76.8 | 9 / 35 | 3148 |
| 6 | 3 | 60.9 | 71.7 | 6 / 35 | 2898 |
| 7 | 2 | 63.1 | 76.2 | 10 / 35 | 3586 |
| 8 | 2 | 63.6 | 79.7 | 6 / 35 | 3336 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 50 | 36% |
| gh.mini.Griezel 0.2 | 47 | 45% |
| d414.nano.Quantum 1.0.0 | 11 | 91% |
| spinnercat.micro.Tyger 0.1 | 10 | 80% |
| gh.nano.Grofvuil 0.2 | 6 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 0% |

Hadur died in 222 of 280 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 86 | 39% | 107 |
| gh.mini.Griezel 0.2 | 61 | 27% | 79 |
| spinnercat.micro.Tyger 0.1 | 26 | 12% | 37 |
| d414.nano.Quantum 1.0.0 | 23 | 10% | 30 |
| fm.mammillarias 1.3 | 12 | 5% | 12 |
| gh.nano.Grofvuil 0.2 | 2 | 1% | 9 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 3 |
| timmit.nano.TimDog 0.33 | 2 | 1% | 2 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 206023 melee ticks, 39826 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 40 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 0.

Targeting waves (275 rounds): 67804 sent, 61503 reached their opponent, 10619 virtual hits (17.3% of those reached).

## Melee bench: F32

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 620 over 8 battles (77.5 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 88.4 | 155 / 280 | 2.05 | 17.9% | 33006 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.0 | 17.9% | 155 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.4% | 64 |
| apc.botM 3.0 | 3.0 | 12.2% | 32 |
| vjik.UnViolation 1.1 | 4.9 | 9.7% | 10 |
| lxx.ConceptA 0.8 | 4.9 | 9.8% | 9 |
| bayen.UbaMicro 1.4 | 5.5 | 9.0% | 1 |
| panzer.Panzer 0.2 | 7.4 | 7.5% | 1 |
| conscience.Electron 1.3g | 8.1 | 6.8% | 1 |
| yk.JahMicro 1.0 | 8.4 | 6.6% | 5 |
| donjezza.Jezza 1.0 | 9.9 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 91.1 | 21 / 35 | 4358 |
| 2 | 1 | 66.3 | 87.6 | 16 / 35 | 3788 |
| 3 | 1 | 67.2 | 88.3 | 23 / 35 | 3963 |
| 4 | 1 | 68.6 | 90.8 | 20 / 35 | 4640 |
| 5 | 1 | 67.2 | 89.5 | 19 / 35 | 4102 |
| 6 | 1 | 65.6 | 84.8 | 18 / 35 | 3781 |
| 7 | 1 | 66.9 | 86.7 | 20 / 35 | 4045 |
| 8 | 1 | 67.0 | 88.3 | 18 / 35 | 4329 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 111 | 63% |
| apc.botM 3.0 | 54 | 63% |
| lxx.ConceptA 0.8 | 15 | 80% |
| vjik.UnViolation 1.1 | 12 | 83% |
| bayen.UbaMicro 1.4 | 11 | 100% |
| donjezza.Jezza 1.0 | 10 | 100% |
| yk.JahMicro 1.0 | 7 | 43% |
| panzer.Panzer 0.2 | 5 | 100% |

Hadur died in 130 of 280 rounds, at a mean tick of 810. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 54 | 42% | 121 |
| apc.botM 3.0 | 26 | 20% | 62 |
| lxx.ConceptA 0.8 | 20 | 15% | 31 |
| vjik.UnViolation 1.1 | 9 | 7% | 30 |
| bayen.UbaMicro 1.4 | 7 | 5% | 14 |
| yk.JahMicro 1.0 | 4 | 3% | 6 |
| conscience.Electron 1.3g | 4 | 3% | 5 |
| panzer.Panzer 0.2 | 2 | 2% | 6 |
| donjezza.Jezza 1.0 | 0 | 0% | 5 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 169079 melee ticks, 71444 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 64 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 58381 sent, 52291 reached their opponent, 10753 virtual hits (20.6% of those reached).

## Melee bench: F33

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 373 over 8 battles (46.6 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 85.2 | 138 / 280 | 2.34 | 18.0% | 35013 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.3 | 18.0% | 138 |
| maribo.Quester 0.3 | 1.8 | 16.2% | 58 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.1 | 13.2% | 32 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 11.0% | 20 |
| labg.Cataclysm 2.05 | 4.9 | 10.8% | 25 |
| baal.nano.N 1.42 | 6.0 | 9.0% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 8.2% | 6 |
| zyx.micro.Ant 1.1 | 8.3 | 5.5% | 0 |
| sanja.First 0.1 | 8.8 | 4.9% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 78.4 | 14 / 35 | 4240 |
| 2 | 1 | 67.7 | 86.3 | 15 / 35 | 4365 |
| 3 | 1 | 69.8 | 90.5 | 23 / 35 | 4700 |
| 4 | 2 | 64.9 | 77.8 | 12 / 35 | 3801 |
| 5 | 1 | 67.7 | 86.0 | 19 / 35 | 4214 |
| 6 | 1 | 68.9 | 87.3 | 18 / 35 | 4650 |
| 7 | 1 | 69.4 | 88.9 | 19 / 35 | 4719 |
| 8 | 1 | 67.9 | 86.0 | 18 / 35 | 4324 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 75 | 79% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 48 | 69% |
| gre.svman4.Leonidas 1.3.2 | 29 | 86% |
| labg.Cataclysm 2.05 | 19 | 74% |
| baal.nano.N 1.42 | 6 | 100% |
| sanja.First 0.1 | 1 | 0% |
| kinsen.melee.Angsaichmophobia 1.8c | 1 | 100% |

Hadur died in 145 of 280 rounds, at a mean tick of 1002. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 56 | 39% | 120 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 21% | 60 |
| gre.svman4.Leonidas 1.3.2 | 21 | 14% | 39 |
| labg.Cataclysm 2.05 | 14 | 10% | 27 |
| kinsen.melee.Angsaichmophobia 1.8c | 11 | 8% | 12 |
| baal.nano.N 1.42 | 7 | 5% | 15 |
| sanja.First 0.1 | 2 | 1% | 3 |
| zyx.micro.Ant 1.1 | 1 | 1% | 2 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 239226 melee ticks, 58134 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 55 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 1.

Targeting waves (276 rounds): 77062 sent, 70785 reached their opponent, 11567 virtual hits (16.3% of those reached).

## Melee bench: F34

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 462 over 8 battles (57.8 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 88.3 | 111 / 280 | 2.05 | 17.8% | 36058 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.4 | 17.8% | 111 |
| stelo.Spread 0.9 | 2.3 | 16.1% | 81 |
| kid.Gladiator .7.2 | 2.4 | 15.9% | 55 |
| jcs.Seth 1.8 | 4.1 | 11.4% | 26 |
| tcf.Reach 3 | 4.9 | 11.0% | 5 |
| cli.Dancer 1.1 | 6.0 | 9.7% | 3 |
| ratosh.Wesco 1.4 | 7.1 | 6.8% | 0 |
| amk.Punbot.Punbot 0.01 | 7.9 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.4 | 3.4% | 0 |
| sample.RamFire 1.0 | 9.6 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 84.4 | 11 / 35 | 4096 |
| 2 | 1 | 68.9 | 90.8 | 19 / 35 | 4508 |
| 3 | 1 | 68.4 | 88.3 | 11 / 35 | 4877 |
| 4 | 2 | 67.7 | 87.6 | 12 / 35 | 4287 |
| 5 | 2 | 68.2 | 88.6 | 12 / 35 | 4483 |
| 6 | 1 | 67.6 | 87.6 | 13 / 35 | 4418 |
| 7 | 1 | 69.1 | 89.8 | 17 / 35 | 4873 |
| 8 | 1 | 68.6 | 89.2 | 16 / 35 | 4516 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 92 | 45% |
| kid.Gladiator .7.2 | 73 | 59% |
| jcs.Seth 1.8 | 25 | 44% |
| tcf.Reach 3 | 9 | 78% |
| cli.Dancer 1.1 | 7 | 71% |
| ratosh.Wesco 1.4 | 2 | 100% |
| amk.Punbot.Punbot 0.01 | 2 | 100% |

Hadur died in 174 of 280 rounds, at a mean tick of 1167. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 68 | 39% | 113 |
| kid.Gladiator .7.2 | 65 | 37% | 90 |
| jcs.Seth 1.8 | 19 | 11% | 36 |
| tcf.Reach 3 | 10 | 6% | 22 |
| cli.Dancer 1.1 | 3 | 2% | 12 |
| ratosh.Wesco 1.4 | 3 | 2% | 5 |
| sample.VelociRobot 1.0 | 1 | 1% | 1 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 238726 melee ticks, 83059 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 49 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 74645 sent, 68496 reached their opponent, 12384 virtual hits (18.1% of those reached).

## Melee bench: F35

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 767 over 8 battles (95.9 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 81.6 | 53 / 280 | 2.66 | 15.5% | 27611 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.4% | 183 |
| hadur2.Hadur 3.17.1g4ef | 2.0 | 15.5% | 53 |
| gh.mini.Gruwel 0.9 | 3.3 | 13.0% | 30 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.1 | 12.0% | 12 |
| rz.HawkOnFire 0.1 | 4.6 | 11.3% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6.9 | 6.4% | 0 |
| wit.Chuliath 1.0 | 6.9 | 6.4% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.0 | 5.9% | 0 |
| dans.Cinnamon 1.2 | 8.9 | 5.1% | 0 |
| stelo.MyAgileRobot 0.2 | 9.4 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 81.3 | 8 / 35 | 3981 |
| 2 | 2 | 63.5 | 81.0 | 4 / 35 | 3301 |
| 3 | 2 | 62.0 | 75.2 | 5 / 35 | 3252 |
| 4 | 2 | 64.4 | 81.0 | 8 / 35 | 3379 |
| 5 | 2 | 65.2 | 85.7 | 7 / 35 | 3569 |
| 6 | 2 | 64.1 | 81.3 | 6 / 35 | 3213 |
| 7 | 2 | 64.8 | 86.0 | 7 / 35 | 3333 |
| 8 | 2 | 64.5 | 81.3 | 8 / 35 | 3583 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 110 | 18% |
| gh.mini.Gruwel 0.9 | 27 | 48% |
| dmh.robocode.robot.BlackDeath 9.2 | 15 | 60% |
| rz.HawkOnFire 0.1 | 10 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 0% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 233 of 280 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 140 | 60% | 163 |
| gh.mini.Gruwel 0.9 | 29 | 12% | 41 |
| dmh.robocode.robot.BlackDeath 9.2 | 29 | 12% | 38 |
| rz.HawkOnFire 0.1 | 15 | 6% | 21 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8 | 3% | 10 |
| stelo.MyAgileRobot 0.2 | 3 | 1% | 3 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 3 |
| wit.Chuliath 1.0 | 1 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 201735 melee ticks, 62735 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 58 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 0.

Targeting waves (273 rounds): 62880 sent, 56679 reached their opponent, 9599 virtual hits (16.9% of those reached).

## Melee bench: F36

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 533 over 8 battles (66.6 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 91.5 | 214 / 280 | 1.77 | 20.1% | 39870 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.0 | 20.1% | 214 |
| alpha.RainingFire 1.0 | 2.1 | 12.9% | 25 |
| bzdp.Pansy 2.1 | 3.1 | 12.0% | 11 |
| bvh.micro.Freya 0.3 | 4.3 | 11.0% | 11 |
| mz.Cork 0.1 | 5.1 | 10.4% | 10 |
| m3thos.Eva02 0.7.1 | 6.1 | 9.3% | 7 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.5% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 5.7% | 0 |
| dl.BetterWalls 1.0 | 8.8 | 5.2% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 92.4 | 27 / 35 | 4957 |
| 2 | 1 | 70.8 | 94.0 | 29 / 35 | 4915 |
| 3 | 1 | 70.3 | 89.5 | 28 / 35 | 5341 |
| 4 | 1 | 70.4 | 89.8 | 27 / 35 | 4979 |
| 5 | 1 | 70.4 | 92.7 | 26 / 35 | 4956 |
| 6 | 1 | 70.7 | 93.7 | 27 / 35 | 4849 |
| 7 | 1 | 69.0 | 87.6 | 24 / 35 | 4970 |
| 8 | 1 | 70.0 | 92.1 | 26 / 35 | 4903 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 57 | 96% |
| bvh.micro.Freya 0.3 | 55 | 89% |
| alpha.RainingFire 1.0 | 43 | 79% |
| mz.Cork 0.1 | 34 | 88% |
| bvh.mini.Fenrir 0.39 | 20 | 100% |
| m3thos.Eva02 0.7.1 | 18 | 89% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| dl.BetterWalls 1.0 | 3 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 70 of 280 rounds, at a mean tick of 757. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 23 | 33% | 50 |
| bvh.micro.Freya 0.3 | 14 | 20% | 55 |
| mz.Cork 0.1 | 8 | 11% | 36 |
| bzdp.Pansy 2.1 | 7 | 10% | 77 |
| bvh.mini.Fenrir 0.39 | 7 | 10% | 14 |
| m3thos.Eva02 0.7.1 | 4 | 6% | 22 |
| squidM.TentalceMeleeNano 1.1 | 2 | 3% | 6 |
| dl.BetterWalls 1.0 | 1 | 1% | 13 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 5 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 194873 melee ticks, 57867 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 54 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 1.

Targeting waves (273 rounds): 67953 sent, 62094 reached their opponent, 14188 virtual hits (22.8% of those reached).

## Melee bench: F37

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 284 over 8 battles (35.5 per battle, most in one battle 108). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 88.7 | 206 / 280 | 2.01 | 18.8% | 40824 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.0 | 18.8% | 206 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.3 | 11.2% | 18 |
| germ.TheMind .2 | 3.5 | 10.2% | 10 |
| agrach.Dalek 1.0 | 5.4 | 9.2% | 12 |
| EBBU.Sim2 1.02 | 5.5 | 9.1% | 5 |
| stelo.UntouchableNano 1.3 | 6.6 | 8.9% | 13 |
| mn.nano.perceptual.Impact 1.3.0 | 6.8 | 8.7% | 1 |
| mb.Beast 0.1 | 7.4 | 8.3% | 6 |
| lmk.ACPFinal 0.1 | 7.8 | 8.2% | 5 |
| skm.Ryubot 1.0 | 8.9 | 7.5% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 88.9 | 25 / 35 | 5037 |
| 2 | 1 | 65.5 | 83.5 | 20 / 35 | 4808 |
| 3 | 1 | 68.4 | 88.6 | 28 / 35 | 5474 |
| 4 | 1 | 68.4 | 88.9 | 27 / 35 | 5406 |
| 5 | 1 | 70.6 | 96.8 | 30 / 35 | 5659 |
| 6 | 1 | 68.4 | 93.3 | 27 / 35 | 4974 |
| 7 | 1 | 67.2 | 88.6 | 26 / 35 | 4847 |
| 8 | 1 | 65.1 | 81.3 | 23 / 35 | 4619 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 41 | 90% |
| agrach.Dalek 1.0 | 32 | 97% |
| germ.TheMind .2 | 32 | 91% |
| stelo.UntouchableNano 1.3 | 29 | 86% |
| mb.Beast 0.1 | 28 | 93% |
| EBBU.Sim2 1.02 | 27 | 96% |
| lmk.ACPFinal 0.1 | 16 | 88% |
| skm.Ryubot 1.0 | 16 | 94% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 100% |

Hadur died in 75 of 280 rounds, at a mean tick of 476. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 14 | 19% | 53 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 19% | 21 |
| stelo.UntouchableNano 1.3 | 12 | 16% | 37 |
| lmk.ACPFinal 0.1 | 11 | 15% | 25 |
| agrach.Dalek 1.0 | 8 | 11% | 45 |
| EBBU.Sim2 1.02 | 5 | 7% | 35 |
| germ.TheMind .2 | 5 | 7% | 26 |
| mb.Beast 0.1 | 4 | 5% | 21 |
| skm.Ryubot 1.0 | 1 | 1% | 10 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 265 rounds): 131644 melee ticks, 34893 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (265 rounds): longest scan gap while four or more were alive 40 ticks (265 rounds over 8); rounds whose longest gap at any count was over 8: 265; robots dropped as dead without a death event: 2.

Targeting waves (265 rounds): 44355 sent, 38910 reached their opponent, 12332 virtual hits (31.7% of those reached).

## Melee bench: F38

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 673 over 8 battles (84.1 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 85.0 | 118 / 280 | 2.35 | 17.0% | 31762 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.3 | 17.0% | 118 |
| justin.Mallais 14.0 | 1.8 | 16.5% | 95 |
| bvh.mini.Freya 0.55 | 3.1 | 13.0% | 20 |
| bts.mega.Gnarly 1.4 | 4.0 | 11.2% | 24 |
| cs.Wren 1.0 | 5.1 | 10.5% | 13 |
| kdf.KoulDestroyer 1.0 | 6.4 | 9.2% | 7 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.4 | 9.2% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.1 | 5.7% | 0 |
| matt.UnderDark3 2.4.34 | 9.0 | 4.3% | 1 |
| bzdp.BoxCar 2.0 | 9.9 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 88.9 | 18 / 35 | 3885 |
| 2 | 1 | 68.0 | 88.9 | 16 / 35 | 4543 |
| 3 | 1 | 65.2 | 83.2 | 13 / 35 | 3629 |
| 4 | 1 | 65.3 | 81.6 | 15 / 35 | 3853 |
| 5 | 2 | 66.0 | 82.5 | 12 / 35 | 3973 |
| 6 | 1 | 68.1 | 90.2 | 18 / 35 | 4051 |
| 7 | 2 | 63.8 | 78.4 | 11 / 35 | 3683 |
| 8 | 1 | 67.0 | 86.0 | 15 / 35 | 4145 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 89 | 54% |
| bvh.mini.Freya 0.55 | 36 | 72% |
| bts.mega.Gnarly 1.4 | 26 | 62% |
| cs.Wren 1.0 | 15 | 80% |
| kdf.KoulDestroyer 1.0 | 12 | 83% |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 170 of 280 rounds, at a mean tick of 812. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 70 | 41% | 113 |
| bvh.mini.Freya 0.55 | 37 | 22% | 64 |
| cs.Wren 1.0 | 20 | 12% | 36 |
| bts.mega.Gnarly 1.4 | 19 | 11% | 42 |
| davidalves.net.DuelistNanoMelee 1.01 | 6 | 4% | 9 |
| kdf.KoulDestroyer 1.0 | 6 | 4% | 8 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 1% | 2 |
| bzdp.BoxCar 2.0 | 2 | 1% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 192099 melee ticks, 49266 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 43 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 64249 sent, 57871 reached their opponent, 13170 virtual hits (22.8% of those reached).

## Melee bench: F39

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1001 over 8 battles (125.1 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 86.7 | 138 / 280 | 2.20 | 17.9% | 36346 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.1 | 17.9% | 138 |
| bvh.fry.Freya 0.82 | 1.9 | 15.5% | 35 |
| az.Ololobot 0.2.4 | 3.3 | 12.5% | 70 |
| catcat20.Lambda 0.024 | 3.8 | 11.8% | 27 |
| winamp32.micro.MicroMacro 1.0 | 5.6 | 8.7% | 3 |
| gimp.GimpBot 0.1 | 6.1 | 8.2% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 7.1 | 7.5% | 4 |
| apollokidd.ApolloKidd 0.9 | 7.3 | 7.6% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.1 | 5.4% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 87.3 | 19 / 35 | 4401 |
| 2 | 1 | 65.0 | 84.4 | 7 / 35 | 4255 |
| 3 | 1 | 67.4 | 86.7 | 17 / 35 | 4559 |
| 4 | 1 | 68.0 | 87.9 | 22 / 35 | 4482 |
| 5 | 2 | 65.2 | 81.0 | 14 / 35 | 4273 |
| 6 | 1 | 68.6 | 90.5 | 18 / 35 | 4977 |
| 7 | 1 | 67.9 | 88.6 | 21 / 35 | 4561 |
| 8 | 1 | 68.0 | 87.3 | 20 / 35 | 4838 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 76 | 80% |
| az.Ololobot 0.2.4 | 57 | 47% |
| catcat20.Lambda 0.024 | 38 | 68% |
| stelo.SoRobotNanoMelee 1.2 | 9 | 100% |
| winamp32.micro.MicroMacro 1.0 | 7 | 86% |
| apollokidd.ApolloKidd 0.9 | 4 | 100% |
| gimp.GimpBot 0.1 | 4 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 0% |

Hadur died in 150 of 280 rounds, at a mean tick of 1030. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 54 | 36% | 102 |
| az.Ololobot 0.2.4 | 42 | 28% | 73 |
| catcat20.Lambda 0.024 | 31 | 21% | 54 |
| apollokidd.ApolloKidd 0.9 | 4 | 3% | 13 |
| winamp32.micro.MicroMacro 1.0 | 3 | 2% | 13 |
| stelo.SoRobotNanoMelee 1.2 | 3 | 2% | 11 |
| dcs.Eater_of_Worlds 1.1.3-A | 3 | 2% | 3 |
| gimp.GimpBot 0.1 | 2 | 1% | 11 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 229124 melee ticks, 65722 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 98 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 98 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 0.

Targeting waves (275 rounds): 73435 sent, 67346 reached their opponent, 13162 virtual hits (19.5% of those reached).

## Melee bench: F40

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 506 over 8 battles (63.3 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 86.2 | 156 / 280 | 2.24 | 18.3% | 35037 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.0 | 18.3% | 156 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.8% | 48 |
| kano.gamma.KanoGamma 1.8 | 3.4 | 12.4% | 26 |
| mz.AntiGrav 1.0 | 3.9 | 11.6% | 17 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.5% | 13 |
| stelo.Randomness 1.0 | 6.1 | 9.4% | 14 |
| alpha.BlackIce 1.0 | 6.6 | 8.7% | 5 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.4% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 4.5% | 1 |
| sample.Corners 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 88.9 | 20 / 35 | 4566 |
| 2 | 1 | 68.1 | 87.3 | 20 / 35 | 4278 |
| 3 | 1 | 67.9 | 85.4 | 21 / 35 | 4205 |
| 4 | 1 | 67.1 | 85.7 | 15 / 35 | 4252 |
| 5 | 1 | 68.3 | 86.3 | 19 / 35 | 4682 |
| 6 | 1 | 69.3 | 91.4 | 22 / 35 | 4529 |
| 7 | 1 | 69.0 | 85.7 | 23 / 35 | 4801 |
| 8 | 1 | 65.1 | 78.7 | 16 / 35 | 3724 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 67 | 78% |
| kano.gamma.KanoGamma 1.8 | 46 | 85% |
| mz.AntiGrav 1.0 | 38 | 87% |
| Polkwane.SmashMelee 1.0 | 13 | 77% |
| stelo.Randomness 1.0 | 11 | 64% |
| alpha.BlackIce 1.0 | 10 | 80% |
| amk.superstrike.SuperStrike 0.3 | 5 | 100% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 127 of 280 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 41 | 32% | 80 |
| kano.gamma.KanoGamma 1.8 | 25 | 20% | 64 |
| Polkwane.SmashMelee 1.0 | 17 | 13% | 29 |
| mz.AntiGrav 1.0 | 14 | 11% | 40 |
| stelo.Randomness 1.0 | 12 | 9% | 29 |
| alpha.BlackIce 1.0 | 10 | 8% | 17 |
| amk.superstrike.SuperStrike 0.3 | 3 | 2% | 11 |
| testantiswapgun.AntiSwap 1.0 | 2 | 2% | 5 |
| sample.Corners 1.0 | 0 | 0% | 5 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 270 rounds): 197896 melee ticks, 49522 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (270 rounds): longest scan gap while four or more were alive 64 ticks (270 rounds over 8); rounds whose longest gap at any count was over 8: 270; robots dropped as dead without a death event: 1.

Targeting waves (270 rounds): 68201 sent, 61988 reached their opponent, 14311 virtual hits (23.1% of those reached).

## Melee bench: F41

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 644 over 8 battles (80.5 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 86.3 | 122 / 280 | 2.23 | 17.3% | 30654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.3 | 17.3% | 122 |
| eem.EvBotNG v12.8 | 1.8 | 16.9% | 107 |
| ary.Swarm 1.1 | 3.5 | 12.8% | 11 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.5% | 22 |
| simonton.nano.MeleeSeed 1.8 | 4.9 | 10.7% | 11 |
| shrub.Silver v048 | 5.9 | 9.0% | 4 |
| zyx.nano.Ant 1.1 | 7.0 | 7.6% | 1 |
| jsal.Jsalbot 1.0 | 8.1 | 5.6% | 2 |
| stelo.Mirror 1.1 | 8.9 | 5.2% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 89.8 | 18 / 35 | 4100 |
| 2 | 1 | 67.1 | 86.0 | 16 / 35 | 3928 |
| 3 | 1 | 68.1 | 89.5 | 15 / 35 | 3927 |
| 4 | 1 | 67.9 | 90.2 | 16 / 35 | 3819 |
| 5 | 2 | 67.6 | 88.9 | 15 / 35 | 3758 |
| 6 | 1 | 66.8 | 83.5 | 16 / 35 | 3983 |
| 7 | 1 | 66.6 | 87.0 | 15 / 35 | 3681 |
| 8 | 2 | 63.0 | 75.6 | 11 / 35 | 3458 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 119 | 47% |
| lessonz.robocode.Oz 0.5.0 | 31 | 81% |
| ary.Swarm 1.1 | 23 | 100% |
| simonton.nano.MeleeSeed 1.8 | 14 | 86% |
| shrub.Silver v048 | 4 | 75% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 163 of 280 rounds, at a mean tick of 989. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 93 | 57% | 134 |
| lessonz.robocode.Oz 0.5.0 | 21 | 13% | 39 |
| ary.Swarm 1.1 | 20 | 12% | 50 |
| simonton.nano.MeleeSeed 1.8 | 14 | 9% | 33 |
| shrub.Silver v048 | 7 | 4% | 15 |
| stelo.Mirror 1.1 | 1 | 1% | 3 |
| zyx.nano.Ant 1.1 | 1 | 1% | 1 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
| jsal.Jsalbot 1.0 | 0 | 0% | 3 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 215180 melee ticks, 66332 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 74 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 74 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 1.

Targeting waves (276 rounds): 71439 sent, 65215 reached their opponent, 10967 virtual hits (16.8% of those reached).

## Melee bench: F42

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 375 over 8 battles (46.9 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 90.3 | 186 / 280 | 1.88 | 19.3% | 40923 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.0 | 19.3% | 186 |
| wompi.Wallaby 5.1 | 2.1 | 15.8% | 46 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.0% | 15 |
| ara.Shera 0.88 | 3.6 | 12.8% | 32 |
| amz.NanoClone 1.41 | 5.0 | 9.4% | 0 |
| dsw.StaticD 1.0 | 6.6 | 7.0% | 3 |
| maribo.IotaCT 1.1 | 6.6 | 6.7% | 0 |
| stelo.MirrorMicro 1.0 | 8.6 | 5.3% | 0 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.7% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.4 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 90.5 | 24 / 35 | 5389 |
| 2 | 1 | 68.5 | 87.9 | 21 / 35 | 4951 |
| 3 | 1 | 70.2 | 93.7 | 24 / 35 | 4983 |
| 4 | 1 | 68.7 | 87.0 | 20 / 35 | 5063 |
| 5 | 1 | 69.9 | 92.4 | 24 / 35 | 5216 |
| 6 | 1 | 69.8 | 91.4 | 25 / 35 | 5145 |
| 7 | 1 | 70.4 | 92.4 | 25 / 35 | 5467 |
| 8 | 1 | 68.4 | 87.0 | 23 / 35 | 4709 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 132 | 88% |
| maribo.mini.MiniQuester 0.1 | 44 | 89% |
| ara.Shera 0.88 | 34 | 56% |
| dsw.StaticD 1.0 | 7 | 100% |
| maribo.IotaCT 1.1 | 2 | 100% |
| amz.NanoClone 1.41 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |

Hadur died in 104 of 280 rounds, at a mean tick of 917. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 39 | 38% | 66 |
| wompi.Wallaby 5.1 | 27 | 26% | 126 |
| maribo.mini.MiniQuester 0.1 | 18 | 17% | 59 |
| amz.NanoClone 1.41 | 7 | 7% | 11 |
| dsw.StaticD 1.0 | 4 | 4% | 12 |
| mme.NikeEnhanced 2.0 | 3 | 3% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 2 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 0 |
| maribo.IotaCT 1.1 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 267 rounds): 210117 melee ticks, 66135 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (267 rounds): longest scan gap while four or more were alive 41 ticks (267 rounds over 8); rounds whose longest gap at any count was over 8: 267; robots dropped as dead without a death event: 0.

Targeting waves (267 rounds): 68386 sent, 62632 reached their opponent, 13382 virtual hits (21.4% of those reached).

## Melee bench: F43

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 938 over 8 battles (117.3 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 79.4 | 49 / 280 | 2.86 | 15.1% | 27175 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.8% | 187 |
| hadur2.Hadur 3.17.1g4ef | 2.0 | 15.1% | 49 |
| brainfade.melee.Dusk 0.44 | 3.4 | 12.5% | 31 |
| dummy.micro.Sparrow 2.5 | 3.6 | 12.2% | 8 |
| wcsv.melee.EngineerMelee 0.1 | 5.1 | 10.6% | 2 |
| Krabb.akim2.Akim2 1.1b | 6.1 | 9.4% | 3 |
| mz.NanoGod 2.02 | 7.1 | 7.9% | 0 |
| jab.DiamondStealer 5 | 7.6 | 7.1% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.8% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 84.1 | 9 / 35 | 3485 |
| 2 | 2 | 64.8 | 79.7 | 6 / 35 | 3225 |
| 3 | 2 | 64.3 | 78.4 | 5 / 35 | 3372 |
| 4 | 2 | 65.4 | 80.6 | 5 / 35 | 3668 |
| 5 | 2 | 66.0 | 81.9 | 9 / 35 | 3497 |
| 6 | 2 | 62.7 | 74.6 | 4 / 35 | 3222 |
| 7 | 2 | 64.9 | 79.4 | 8 / 35 | 3322 |
| 8 | 2 | 63.4 | 76.2 | 3 / 35 | 3384 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 104 | 22% |
| brainfade.melee.Dusk 0.44 | 17 | 53% |
| wcsv.melee.EngineerMelee 0.1 | 10 | 90% |
| dummy.micro.Sparrow 2.5 | 9 | 67% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |
| jab.DiamondStealer 5 | 1 | 100% |

Hadur died in 240 of 280 rounds, at a mean tick of 971. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 142 | 59% | 165 |
| brainfade.melee.Dusk 0.44 | 27 | 11% | 35 |
| dummy.micro.Sparrow 2.5 | 25 | 10% | 32 |
| wcsv.melee.EngineerMelee 0.1 | 18 | 8% | 27 |
| Krabb.akim2.Akim2 1.1b | 7 | 3% | 8 |
| mz.NanoGod 2.02 | 7 | 3% | 7 |
| jab.DiamondStealer 5 | 3 | 1% | 4 |
| cvt.Firsty 1.0 | 2 | 1% | 2 |
9 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 213183 melee ticks, 61858 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 40 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 0.

Targeting waves (276 rounds): 69611 sent, 63243 reached their opponent, 11426 virtual hits (18.1% of those reached).

## Melee bench: F44

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 370 over 8 battles (46.3 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 92.5 | 181 / 280 | 1.67 | 20.1% | 41980 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.0 | 20.1% | 181 |
| stelo.Liblix 0.3.1 | 2.1 | 15.5% | 67 |
| tzu.TheArtOfWar 1.2 | 2.9 | 14.2% | 19 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.4 | 9.7% | 3 |
| jwirde.Gort 2.0 | 5.1 | 9.2% | 6 |
| wompi.Quokka 1.6 | 5.8 | 8.5% | 3 |
| disan.Chair 2.2.0 | 7.1 | 7.2% | 3 |
| stf.PanzerGeneral 0.1 | 7.6 | 6.6% | 0 |
| sample.Crazy 1.0 | 9.4 | 4.6% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.6 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 91.4 | 21 / 35 | 5466 |
| 2 | 1 | 69.9 | 90.8 | 21 / 35 | 5083 |
| 3 | 1 | 71.0 | 93.7 | 24 / 35 | 5227 |
| 4 | 1 | 70.4 | 92.4 | 23 / 35 | 5150 |
| 5 | 1 | 70.6 | 92.4 | 24 / 35 | 5326 |
| 6 | 1 | 71.3 | 95.2 | 24 / 35 | 5575 |
| 7 | 1 | 69.9 | 92.4 | 21 / 35 | 4925 |
| 8 | 1 | 70.5 | 92.1 | 23 / 35 | 5228 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 109 | 67% |
| tzu.TheArtOfWar 1.2 | 85 | 88% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 15 | 87% |
| jwirde.Gort 2.0 | 11 | 73% |
| disan.Chair 2.2.0 | 8 | 88% |
| wompi.Quokka 1.6 | 4 | 75% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 102 of 280 rounds, at a mean tick of 1005. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 52 | 51% | 126 |
| tzu.TheArtOfWar 1.2 | 24 | 24% | 89 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 9 | 9% | 24 |
| jwirde.Gort 2.0 | 8 | 8% | 22 |
| wompi.Quokka 1.6 | 3 | 3% | 8 |
| disan.Chair 2.2.0 | 2 | 2% | 7 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 2 |
| sample.Crazy 1.0 | 0 | 0% | 1 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 216965 melee ticks, 65468 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 41 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 1.

Targeting waves (275 rounds): 74720 sent, 68632 reached their opponent, 16153 virtual hits (23.5% of those reached).

## Melee bench: F45

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 873 over 8 battles (109.1 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 87.9 | 137 / 280 | 2.09 | 19.2% | 40955 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4ef | 1.0 | 19.2% | 137 |
| jje.BagPuss 1.2 | 2.3 | 12.7% | 12 |
| eem.IWillFireNoBullet v2.8 | 3.1 | 11.9% | 105 |
| sul.Lunar 1.1 | 4.4 | 10.6% | 12 |
| myl.nano.Graviton 1.10 | 5.1 | 10.4% | 4 |
| hvilela.HVilela 0.9 | 6.3 | 8.7% | 1 |
| fm.claire 1.7 | 6.8 | 8.3% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.1 | 8.0% | 4 |
| wit.Deep7 2.0 | 9.0 | 5.9% | 4 |
| abud.ThirdRobo 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 89.5 | 18 / 35 | 5249 |
| 2 | 1 | 68.6 | 87.6 | 14 / 35 | 5331 |
| 3 | 1 | 69.7 | 88.9 | 17 / 35 | 5591 |
| 4 | 1 | 68.4 | 86.0 | 19 / 35 | 5197 |
| 5 | 1 | 66.8 | 85.7 | 11 / 35 | 4633 |
| 6 | 1 | 69.8 | 89.5 | 19 / 35 | 5384 |
| 7 | 1 | 68.3 | 86.7 | 19 / 35 | 4739 |
| 8 | 1 | 68.9 | 88.9 | 20 / 35 | 4831 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 117 | 45% |
| jje.BagPuss 1.2 | 35 | 77% |
| sul.Lunar 1.1 | 29 | 86% |
| myl.nano.Graviton 1.10 | 14 | 86% |
| pez.mini.ChironexFleckeri 0.5 | 9 | 100% |
| wit.Deep7 2.0 | 9 | 89% |
| fm.claire 1.7 | 2 | 50% |
| hvilela.HVilela 0.9 | 2 | 100% |

Hadur died in 151 of 280 rounds, at a mean tick of 1531. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 64 | 42% | 0 |
| jje.BagPuss 1.2 | 23 | 15% | 96 |
| sul.Lunar 1.1 | 16 | 11% | 65 |
| myl.nano.Graviton 1.10 | 13 | 9% | 41 |
| fm.claire 1.7 | 11 | 7% | 21 |
| pez.mini.ChironexFleckeri 0.5 | 9 | 6% | 27 |
| hvilela.HVilela 0.9 | 5 | 3% | 16 |
| wit.Deep7 2.0 | 2 | 1% | 8 |
| abud.ThirdRobo 1.0 | 1 | 1% | 5 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 264363 melee ticks, 131361 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 49 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 1.

Targeting waves (276 rounds): 83726 sent, 77713 reached their opponent, 12983 virtual hits (16.7% of those reached).

## Melee bench: F46

hadur2.Hadur 3.17.1g4ef against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 972 over 8 battles (121.5 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 80.7 | 72 / 280 | 2.74 | 15.6% | 30333 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.4 | 17.0% | 83 |
| rsalesc.melee.Medina 0.4.5 | 2.0 | 16.7% | 108 |
| hadur2.Hadur 3.17.1g4ef | 2.6 | 15.6% | 72 |
| mz.MicroSheep 1.0 | 4.5 | 10.4% | 2 |
| cx.Princess 1.0 | 4.8 | 10.2% | 13 |
| sadoner.killer 0.2 | 5.9 | 9.1% | 2 |
| arthord.NanoSatanMelee Beta | 6.9 | 7.4% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.1 | 5.9% | 0 |
| kurios.DOSexe .9a | 8.9 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.9 | 79.4 | 6 / 35 | 3643 |
| 2 | 2 | 66.3 | 84.1 | 10 / 35 | 4261 |
| 3 | 3 | 62.0 | 75.2 | 6 / 35 | 3463 |
| 4 | 3 | 65.4 | 82.9 | 9 / 35 | 3785 |
| 5 | 2 | 65.3 | 83.2 | 9 / 35 | 3998 |
| 6 | 3 | 65.1 | 81.0 | 14 / 35 | 3616 |
| 7 | 3 | 63.3 | 78.1 | 7 / 35 | 3562 |
| 8 | 2 | 65.4 | 81.9 | 11 / 35 | 4005 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 82 | 52% |
| rsalesc.melee.Medina 0.4.5 | 38 | 16% |
| cx.Princess 1.0 | 16 | 75% |
| mz.MicroSheep 1.0 | 7 | 100% |
| sadoner.killer 0.2 | 3 | 67% |
| arthord.NanoSatanMelee Beta | 2 | 100% |

Hadur died in 216 of 280 rounds, at a mean tick of 907. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 101 | 47% | 141 |
| rsalesc.melee.Medina 0.4.5 | 71 | 33% | 83 |
| cx.Princess 1.0 | 13 | 6% | 23 |
| sadoner.killer 0.2 | 9 | 4% | 9 |
| mz.MicroSheep 1.0 | 8 | 4% | 13 |
| arthord.NanoSatanMelee Beta | 3 | 1% | 8 |
| kurios.DOSexe .9a | 2 | 1% | 1 |
| jeremyreeder.collective.Prophet 5 | 1 | 0% | 1 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 202896 melee ticks, 49409 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 48 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 1.

Targeting waves (274 rounds): 60456 sent, 54398 reached their opponent, 8957 virtual hits (16.5% of those reached).

