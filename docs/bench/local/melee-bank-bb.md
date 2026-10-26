# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 182 over 8 battles (22.8 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 84.5 | 60 / 280 | 2.39 | 16.5% | 36672 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.0% | 190 |
| hadur2.Hadur 3.17.1bb | 2.0 | 16.5% | 60 |
| sgp.JollyNinja 3.53 | 3.4 | 11.4% | 16 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.6 | 10.4% | 1 |
| mz.MicroGodMelee 1 | 4.8 | 10.5% | 8 |
| lorneswork.Predator 1.0 | 5.3 | 9.8% | 3 |
| adt.Ar2 1.0 | 7.0 | 7.6% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.7% | 1 |
| skm.butterfly 1.0 | 8.8 | 5.0% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.3 | 79.7 | 9 / 35 | 4416 |
| 2 | 2 | 64.7 | 83.2 | 5 / 35 | 4067 |
| 3 | 2 | 66.4 | 87.6 | 6 / 35 | 4773 |
| 4 | 2 | 65.7 | 83.8 | 6 / 35 | 4526 |
| 5 | 2 | 66.5 | 85.7 | 10 / 35 | 4709 |
| 6 | 2 | 66.9 | 87.6 | 10 / 35 | 4635 |
| 7 | 2 | 65.7 | 84.4 | 7 / 35 | 4593 |
| 8 | 2 | 66.7 | 84.1 | 7 / 35 | 4953 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 153 | 10% |
| sgp.JollyNinja 3.53 | 28 | 64% |
| mz.MicroGodMelee 1 | 16 | 69% |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 89% |
| lorneswork.Predator 1.0 | 6 | 67% |
| adt.Ar2 1.0 | 2 | 50% |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 50% |
| mym.EdgeStalker 1.0 | 1 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 221 of 280 rounds, at a mean tick of 1126. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 157 | 71% | 173 |
| sgp.JollyNinja 3.53 | 25 | 11% | 36 |
| lorneswork.Predator 1.0 | 12 | 5% | 17 |
| mz.MicroGodMelee 1 | 11 | 5% | 25 |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 4% | 17 |
| kawigi.sbf.FloodSonnet 0.9 | 4 | 2% | 4 |
| adt.Ar2 1.0 | 2 | 1% | 5 |
| skm.butterfly 1.0 | 1 | 0% | 2 |

Posture (Hadur's M records, 266 rounds): 187256 melee ticks, 105138 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (266 rounds): longest scan gap while four or more were alive 58 ticks (266 rounds over 8); rounds whose longest gap at any count was over 8: 266; robots dropped as dead without a death event: 0.

Targeting waves (266 rounds): 60926 sent, 55188 reached their opponent, 11850 virtual hits (21.5% of those reached).

## Melee bench: F02

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 181 over 8 battles (22.6 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 79.5 | 102 / 280 | 2.84 | 16.3% | 33019 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 16.3% | 102 |
| pulsar.PulsarMax 0.8.9 | 2.4 | 14.2% | 65 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 13.8% | 42 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 11.0% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.1 | 10.2% | 21 |
| Noran.BitchingElk 0.054 | 6.4 | 8.7% | 26 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 8.3% | 8 |
| sch.Simone 0.3d | 7.4 | 7.9% | 12 |
| stelo.PatternRobot 1.0 | 9.0 | 5.9% | 3 |
| fullsail.SweetTea 1.1 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 81.6 | 15 / 35 | 4448 |
| 2 | 1 | 65.5 | 81.6 | 13 / 35 | 4025 |
| 3 | 1 | 64.3 | 79.0 | 11 / 35 | 3994 |
| 4 | 1 | 64.7 | 76.8 | 12 / 35 | 4281 |
| 5 | 1 | 62.6 | 76.5 | 9 / 35 | 3608 |
| 6 | 1 | 65.5 | 80.6 | 18 / 35 | 4068 |
| 7 | 1 | 65.5 | 80.6 | 11 / 35 | 4376 |
| 8 | 1 | 64.7 | 79.4 | 13 / 35 | 4219 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 53 | 49% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 47 | 70% |
| com.cohesiva.robocode.ManOwaR 1.0 | 23 | 70% |
| Noran.BitchingElk 0.054 | 20 | 30% |
| sch.Simone 0.3d | 15 | 60% |
| lrem.micro.SpikeSoldier 0.4 | 7 | 100% |
| fnc.bandit.Bandit 5.2.0 | 3 | 67% |
| stelo.PatternRobot 1.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 179 of 280 rounds, at a mean tick of 925. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 53 | 30% | 82 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 38 | 21% | 69 |
| Noran.BitchingElk 0.054 | 17 | 9% | 23 |
| fnc.bandit.Bandit 5.2.0 | 17 | 9% | 20 |
| com.cohesiva.robocode.ManOwaR 1.0 | 16 | 9% | 33 |
| lrem.micro.SpikeSoldier 0.4 | 16 | 9% | 18 |
| sch.Simone 0.3d | 14 | 8% | 23 |
| stelo.PatternRobot 1.0 | 7 | 4% | 10 |
| fullsail.SweetTea 1.1 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 217959 melee ticks, 55668 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 101 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 101 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 0.

Targeting waves (272 rounds): 79731 sent, 73779 reached their opponent, 13439 virtual hits (18.2% of those reached).

## Melee bench: F03

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 175 over 8 battles (21.9 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 89.8 | 204 / 280 | 1.91 | 19.3% | 43675 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.3% | 204 |
| radnor.DoctorBob 1.42 | 2.3 | 14.2% | 28 |
| kawigi.nano.Lib 1.0 | 2.9 | 13.1% | 17 |
| vuen.Cake 2.51 | 4.0 | 12.1% | 28 |
| urdos.URDOS 1.3 | 5.0 | 9.3% | 3 |
| adt.Ar1 2.1 | 6.0 | 8.1% | 0 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.8% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 6.9% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.1 | 5.3% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 90.5 | 26 / 35 | 5684 |
| 2 | 1 | 70.4 | 94.6 | 27 / 35 | 5501 |
| 3 | 1 | 69.8 | 89.8 | 26 / 35 | 5628 |
| 4 | 1 | 69.9 | 94.0 | 26 / 35 | 5451 |
| 5 | 1 | 68.2 | 85.7 | 23 / 35 | 5649 |
| 6 | 1 | 68.2 | 87.3 | 24 / 35 | 5329 |
| 7 | 1 | 69.5 | 91.7 | 27 / 35 | 5279 |
| 8 | 1 | 68.2 | 85.1 | 25 / 35 | 5154 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 81 | 98% |
| vuen.Cake 2.51 | 64 | 88% |
| kawigi.nano.Lib 1.0 | 58 | 91% |
| oa.weak.FlyMk1 0.1 | 6 | 100% |
| adt.Ar1 2.1 | 3 | 100% |
| urdos.URDOS 1.3 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 76 of 280 rounds, at a mean tick of 650. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 25 | 33% | 89 |
| kawigi.nano.Lib 1.0 | 22 | 29% | 60 |
| vuen.Cake 2.51 | 9 | 12% | 74 |
| urdos.URDOS 1.3 | 9 | 12% | 19 |
| bwbaugh.nano.Tirunculus 0.0.0a | 6 | 8% | 7 |
| adt.Ar1 2.1 | 3 | 4% | 8 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 3% | 6 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 10 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 268 rounds): 168638 melee ticks, 54694 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 69 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (268 rounds): longest scan gap while four or more were alive 69 ticks (268 rounds over 8); rounds whose longest gap at any count was over 8: 268; robots dropped as dead without a death event: 0.

Targeting waves (268 rounds): 52801 sent, 47239 reached their opponent, 13001 virtual hits (27.5% of those reached).

## Melee bench: F04

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 104 over 8 battles (13.0 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 84.7 | 36 / 280 | 2.38 | 16.6% | 37993 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.7% | 216 |
| hadur2.Hadur 3.17.1bb | 2.0 | 16.6% | 36 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.6% | 12 |
| TNT.TNT 0.99.1 | 4.1 | 10.9% | 11 |
| josago.Jorgito 0.16 | 5.0 | 9.1% | 5 |
| css.Delitioner 0.11 | 6.1 | 7.4% | 0 |
| tj.zombie1n 1.0.1 | 6.9 | 6.7% | 0 |
| rampancy.Durandal 2.1d | 7.9 | 5.4% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.7% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.7 | 83.8 | 4 / 35 | 4802 |
| 2 | 2 | 66.0 | 83.8 | 1 / 35 | 4407 |
| 3 | 2 | 66.7 | 84.8 | 4 / 35 | 4838 |
| 4 | 2 | 66.1 | 84.1 | 4 / 35 | 4578 |
| 5 | 2 | 66.3 | 82.9 | 4 / 35 | 4708 |
| 6 | 2 | 68.2 | 89.2 | 7 / 35 | 4823 |
| 7 | 2 | 66.6 | 84.8 | 3 / 35 | 4863 |
| 8 | 2 | 67.2 | 84.4 | 9 / 35 | 4974 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 160 | 9% |
| TNT.TNT 0.99.1 | 20 | 60% |
| apc.LeeroyJenkins2 1.0 | 11 | 36% |
| josago.Jorgito 0.16 | 5 | 80% |
| css.Delitioner 0.11 | 2 | 100% |

Hadur died in 244 of 280 rounds, at a mean tick of 1291. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 172 | 70% | 188 |
| apc.LeeroyJenkins2 1.0 | 37 | 15% | 40 |
| TNT.TNT 0.99.1 | 17 | 7% | 29 |
| josago.Jorgito 0.16 | 9 | 4% | 12 |
| css.Delitioner 0.11 | 3 | 1% | 5 |
| tj.zombie1n 1.0.1 | 3 | 1% | 3 |
| sp.Nanos.Ember 1.1 | 2 | 1% | 2 |
| rampancy.Durandal 2.1d | 1 | 0% | 1 |

Posture (Hadur's M records, 267 rounds): 262868 melee ticks, 81618 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (267 rounds): longest scan gap while four or more were alive 80 ticks (267 rounds over 8); rounds whose longest gap at any count was over 8: 267; robots dropped as dead without a death event: 0.

Targeting waves (267 rounds): 81237 sent, 75371 reached their opponent, 11831 virtual hits (15.7% of those reached).

## Melee bench: F05

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 353 over 8 battles (44.1 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 74.8 | 29 / 280 | 3.27 | 13.8% | 25885 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.1 | 18.6% | 145 |
| justin.DemonicRage 3.4 | 1.9 | 17.0% | 80 |
| hadur2.Hadur 3.17.1bb | 3.0 | 13.8% | 29 |
| wompi.Numbat 2.1 | 4.0 | 12.6% | 19 |
| axeBots.HataMoto 3.09 | 5.4 | 9.2% | 5 |
| ms.Ares 0.19 | 5.6 | 9.2% | 2 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.0% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.9 | 5.4% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.4 | 4.1% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.8 | 74.6 | 6 / 35 | 3565 |
| 2 | 3 | 62.2 | 75.6 | 4 / 35 | 3341 |
| 3 | 3 | 59.7 | 70.5 | 3 / 35 | 2882 |
| 4 | 3 | 60.9 | 74.0 | 2 / 35 | 2981 |
| 5 | 3 | 62.0 | 74.6 | 3 / 35 | 3372 |
| 6 | 3 | 62.1 | 74.9 | 4 / 35 | 3333 |
| 7 | 3 | 63.4 | 79.7 | 4 / 35 | 3521 |
| 8 | 3 | 60.6 | 74.3 | 3 / 35 | 2890 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 51 | 6% |
| justin.DemonicRage 3.4 | 38 | 13% |
| wompi.Numbat 2.1 | 18 | 83% |
| axeBots.HataMoto 3.09 | 6 | 67% |
| ms.Ares 0.19 | 3 | 33% |
| supersample.SuperBoxBot 1.0 | 1 | 100% |

Hadur died in 253 of 280 rounds, at a mean tick of 858. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 101 | 40% | 106 |
| justin.DemonicRage 3.4 | 84 | 33% | 92 |
| wompi.Numbat 2.1 | 36 | 14% | 49 |
| ms.Ares 0.19 | 16 | 6% | 16 |
| axeBots.HataMoto 3.09 | 8 | 3% | 10 |
| GarmBox.Oranges 1.0 | 3 | 1% | 3 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 2 |
| supersample.SuperBoxBot 1.0 | 1 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 278 rounds): 204095 melee ticks, 39601 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (278 rounds): longest scan gap while four or more were alive 54 ticks (278 rounds over 8); rounds whose longest gap at any count was over 8: 278; robots dropped as dead without a death event: 0.

Targeting waves (278 rounds): 65224 sent, 58905 reached their opponent, 10418 virtual hits (17.7% of those reached).

## Melee bench: F06

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 10 other Robocode JVMs running (hadur.bench.MeleeRunner x10), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 122 over 8 battles (15.3 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 83.8 | 134 / 280 | 2.45 | 17.6% | 36425 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.6% | 134 |
| jekl.StoneGhost 0.7 | 2.4 | 14.9% | 36 |
| origin.SleepSiphon 1.7b | 2.8 | 14.0% | 68 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.0% | 27 |
| mld.Wisdom 1.0 | 4.9 | 10.5% | 4 |
| gg.Wolverine 2.0 | 6.0 | 9.2% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.6 | 6.6% | 5 |
| spinnercat.Omen 1.0 | 7.9 | 6.4% | 1 |
| DBall.NUKE 0.1 | 8.5 | 6.0% | 2 |
| sample.Fire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 81.6 | 16 / 35 | 4026 |
| 2 | 1 | 66.3 | 81.0 | 18 / 35 | 4264 |
| 3 | 1 | 67.9 | 85.7 | 17 / 35 | 4724 |
| 4 | 1 | 66.7 | 82.2 | 15 / 35 | 4602 |
| 5 | 1 | 67.2 | 82.9 | 17 / 35 | 4742 |
| 6 | 1 | 68.8 | 89.5 | 19 / 35 | 4750 |
| 7 | 1 | 67.1 | 83.2 | 17 / 35 | 4652 |
| 8 | 1 | 67.6 | 84.8 | 15 / 35 | 4665 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 58 | 86% |
| origin.SleepSiphon 1.7b | 46 | 65% |
| pe.minimelee.SandboxMiniMelee 1.1 | 35 | 69% |
| gg.Wolverine 2.0 | 17 | 88% |
| ers.nano.hawk.HawkLA 3.0m | 11 | 73% |
| mld.Wisdom 1.0 | 4 | 100% |
| DBall.NUKE 0.1 | 3 | 100% |

Hadur died in 147 of 280 rounds, at a mean tick of 799. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 48 | 33% | 85 |
| jekl.StoneGhost 0.7 | 39 | 27% | 75 |
| pe.minimelee.SandboxMiniMelee 1.1 | 28 | 19% | 46 |
| gg.Wolverine 2.0 | 12 | 8% | 23 |
| mld.Wisdom 1.0 | 11 | 7% | 23 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 4% | 18 |
| DBall.NUKE 0.1 | 1 | 1% | 6 |
| spinnercat.Omen 1.0 | 1 | 1% | 3 |
| sample.Fire 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 274 rounds): 198836 melee ticks, 45644 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 55 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 62925 sent, 57003 reached their opponent, 13986 virtual hits (24.5% of those reached).

## Melee bench: F07

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 9 other Robocode JVMs running (hadur.bench.MeleeRunner x9), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 538 over 8 battles (67.3 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 92.2 | 141 / 280 | 1.70 | 19.5% | 43970 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.5% | 141 |
| rsalesc.melee.Monk 0.3.6c | 2.4 | 17.3% | 58 |
| rtk.Tachikoma 1.0 | 2.6 | 16.8% | 55 |
| oog.melee.CapuletDroid 1.1 | 4.1 | 11.4% | 11 |
| franzor.Lizt 1.3.1 | 4.9 | 10.7% | 15 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 7.9% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.2% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.3 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 90.2 | 14 / 35 | 5493 |
| 2 | 1 | 70.7 | 91.4 | 16 / 35 | 5364 |
| 3 | 1 | 70.2 | 91.7 | 16 / 35 | 5179 |
| 4 | 1 | 72.1 | 94.6 | 23 / 35 | 5921 |
| 5 | 1 | 71.0 | 92.1 | 17 / 35 | 5442 |
| 6 | 1 | 71.8 | 94.9 | 21 / 35 | 5726 |
| 7 | 1 | 71.1 | 92.7 | 18 / 35 | 5464 |
| 8 | 1 | 70.3 | 89.8 | 16 / 35 | 5381 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 113 | 62% |
| rsalesc.melee.Monk 0.3.6c | 60 | 20% |
| oog.melee.CapuletDroid 1.1 | 41 | 80% |
| franzor.Lizt 1.3.1 | 34 | 74% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 144 of 280 rounds, at a mean tick of 1441. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 61 | 42% | 133 |
| rsalesc.melee.Monk 0.3.6c | 55 | 38% | 91 |
| oog.melee.CapuletDroid 1.1 | 12 | 8% | 50 |
| franzor.Lizt 1.3.1 | 8 | 6% | 1 |
| exauge.GateKeeper 1.1.121g | 2 | 1% | 3 |
| lrem.micro.MoggFanatic 0.2 | 2 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 271 rounds): 257500 melee ticks, 118851 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (271 rounds): longest scan gap while four or more were alive 57 ticks (271 rounds over 8); rounds whose longest gap at any count was over 8: 271; robots dropped as dead without a death event: 0.

Targeting waves (271 rounds): 78473 sent, 72553 reached their opponent, 15398 virtual hits (21.2% of those reached).

## Melee bench: F08

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 7 other Robocode JVMs running (hadur.bench.MeleeRunner x7), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 626 over 8 battles (78.3 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 88.5 | 155 / 280 | 2.04 | 18.3% | 34883 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.3% | 155 |
| tm.Yuugao 1.0 | 2.3 | 13.2% | 49 |
| shrub.Vapour v159 | 3.1 | 12.9% | 31 |
| Krabb.sliNk.Garm 0.9u | 4.1 | 11.1% | 22 |
| com.spp.robocode.MostlyHarmless 010 | 4.5 | 10.6% | 13 |
| m3thos.Eva00 1.1 | 6.4 | 8.5% | 2 |
| jwst.DAD.DarkAndDarker 1.1 | 6.8 | 8.2% | 8 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 6.4% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 5.4% | 1 |
| SHAM.WOW 1.4 | 9.6 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 93.3 | 24 / 35 | 4500 |
| 2 | 1 | 67.4 | 88.6 | 19 / 35 | 4331 |
| 3 | 1 | 69.6 | 92.7 | 24 / 35 | 4642 |
| 4 | 1 | 64.8 | 80.3 | 14 / 35 | 3978 |
| 5 | 1 | 68.1 | 87.6 | 19 / 35 | 4563 |
| 6 | 1 | 67.9 | 90.8 | 23 / 35 | 4081 |
| 7 | 1 | 67.0 | 87.6 | 18 / 35 | 4340 |
| 8 | 1 | 67.3 | 86.7 | 14 / 35 | 4448 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shrub.Vapour v159 | 58 | 72% |
| tm.Yuugao 1.0 | 56 | 57% |
| com.spp.robocode.MostlyHarmless 010 | 32 | 84% |
| Krabb.sliNk.Garm 0.9u | 29 | 55% |
| jwst.DAD.DarkAndDarker 1.1 | 17 | 94% |
| m3thos.Eva00 1.1 | 13 | 100% |
| SHAM.WOW 1.4 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |

Hadur died in 131 of 280 rounds, at a mean tick of 934. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 38 | 29% | 79 |
| Krabb.sliNk.Garm 0.9u | 28 | 21% | 51 |
| shrub.Vapour v159 | 27 | 21% | 64 |
| com.spp.robocode.MostlyHarmless 010 | 18 | 14% | 39 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 4% | 19 |
| m3thos.Eva00 1.1 | 4 | 3% | 15 |
| zyx.nano.BacillusComma 1.0 | 4 | 3% | 6 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 2 |
| SHAM.WOW 1.4 | 0 | 0% | 4 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 205397 melee ticks, 57756 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 50 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 66818 sent, 60818 reached their opponent, 12052 virtual hits (19.8% of those reached).

## Melee bench: F09

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 471 over 8 battles (58.9 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 73.5 | 56 / 280 | 3.39 | 14.1% | 24748 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.4% | 135 |
| hadur2.Hadur 3.17.1bb | 2.4 | 14.1% | 56 |
| kc.micro.Figment 1.0 | 2.6 | 13.9% | 32 |
| yagami.Tidus 0.11 | 4.3 | 11.3% | 5 |
| pedersen.Grishnakh 1.0 | 4.9 | 10.6% | 19 |
| mc2.enemy.Original 0.9 | 5.9 | 9.6% | 29 |
| dft.Calliope 5.6 | 7.0 | 7.9% | 4 |
| step.nanoPri 1.0 | 8.4 | 5.5% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 5.1% | 0 |
| rdm.Dueler 0.4x | 9.6 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 79.4 | 5 / 35 | 3059 |
| 2 | 3 | 59.7 | 67.9 | 7 / 35 | 2913 |
| 3 | 2 | 60.9 | 73.0 | 6 / 35 | 3114 |
| 4 | 2 | 63.2 | 77.5 | 9 / 35 | 3404 |
| 5 | 2 | 60.2 | 68.3 | 9 / 35 | 3054 |
| 6 | 2 | 62.7 | 76.8 | 7 / 35 | 3155 |
| 7 | 3 | 60.6 | 70.2 | 5 / 35 | 3187 |
| 8 | 3 | 61.4 | 74.9 | 8 / 35 | 2862 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 62 | 21% |
| kc.micro.Figment 1.0 | 30 | 77% |
| mc2.enemy.Original 0.9 | 14 | 21% |
| pedersen.Grishnakh 1.0 | 11 | 55% |
| yagami.Tidus 0.11 | 10 | 80% |
| dft.Calliope 5.6 | 2 | 100% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |

Hadur died in 227 of 280 rounds, at a mean tick of 832. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 96 | 42% | 104 |
| mc2.enemy.Original 0.9 | 34 | 15% | 36 |
| kc.micro.Figment 1.0 | 32 | 14% | 57 |
| yagami.Tidus 0.11 | 30 | 13% | 38 |
| pedersen.Grishnakh 1.0 | 17 | 7% | 24 |
| dft.Calliope 5.6 | 6 | 3% | 9 |
| robar.nano.Assertive_Melee 0.2 | 5 | 2% | 6 |
| step.nanoPri 1.0 | 2 | 1% | 2 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 197717 melee ticks, 41002 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 33 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 0.

Targeting waves (275 rounds): 65974 sent, 60132 reached their opponent, 9119 virtual hits (15.2% of those reached).

## Melee bench: F10

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 11 other Robocode JVMs running (hadur.bench.MeleeRunner x11), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 206 over 8 battles (25.8 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 94.2 | 205 / 280 | 1.52 | 19.6% | 39674 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.6% | 205 |
| DTF.Kludgy 1.2b | 2.4 | 14.1% | 28 |
| ne.Chimera 1.2 | 3.0 | 13.2% | 13 |
| ejb.Polaris 1.0.1 | 3.9 | 12.6% | 19 |
| vStar.RAFzilla 2.15 | 5.0 | 10.5% | 6 |
| tvv.micro.Antares 1.1.1 | 5.8 | 9.7% | 4 |
| kurios.DOSexe .9b | 7.4 | 5.9% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.4 | 4.9% | 1 |
| sam.Samspin 1.0 | 8.5 | 5.2% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 94.9 | 27 / 35 | 4726 |
| 2 | 1 | 70.7 | 96.5 | 27 / 35 | 5043 |
| 3 | 1 | 68.5 | 90.5 | 21 / 35 | 4822 |
| 4 | 1 | 70.4 | 95.2 | 26 / 35 | 5078 |
| 5 | 1 | 71.0 | 97.1 | 30 / 35 | 5192 |
| 6 | 1 | 68.7 | 90.2 | 25 / 35 | 4662 |
| 7 | 1 | 69.8 | 94.0 | 25 / 35 | 4954 |
| 8 | 1 | 70.4 | 95.2 | 24 / 35 | 5197 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 70 | 81% |
| ejb.Polaris 1.0.1 | 59 | 88% |
| ne.Chimera 1.2 | 49 | 84% |
| vStar.RAFzilla 2.15 | 28 | 86% |
| tvv.micro.Antares 1.1.1 | 20 | 95% |
| donjezza.Muncho 1.0 | 8 | 75% |
| kurios.DOSexe .9b | 3 | 67% |
| sam.Samspin 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 50% |

Hadur died in 75 of 280 rounds, at a mean tick of 925. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 22 | 29% | 76 |
| ne.Chimera 1.2 | 20 | 27% | 63 |
| ejb.Polaris 1.0.1 | 15 | 20% | 70 |
| vStar.RAFzilla 2.15 | 6 | 8% | 29 |
| tvv.micro.Antares 1.1.1 | 6 | 8% | 19 |
| kurios.DOSexe .9b | 2 | 3% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 3% | 5 |
| donjezza.Muncho 1.0 | 2 | 3% | 3 |
| sam.Samspin 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 265 rounds): 195480 melee ticks, 68779 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (265 rounds): longest scan gap while four or more were alive 56 ticks (265 rounds over 8); rounds whose longest gap at any count was over 8: 265; robots dropped as dead without a death event: 0.

Targeting waves (265 rounds): 63964 sent, 58263 reached their opponent, 11712 virtual hits (20.1% of those reached).

## Melee bench: F11

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 9 other Robocode JVMs running (hadur.bench.MeleeRunner x9), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 282 over 8 battles (35.3 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 76.7 | 72 / 280 | 3.09 | 14.9% | 26443 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.1 | 16.3% | 101 |
| hadur2.Hadur 3.17.1bb | 1.9 | 14.9% | 72 |
| cx.mini.Nimrod 0.55 | 3.4 | 11.9% | 26 |
| djc.DynaBot 0.1.1 | 4.0 | 11.0% | 23 |
| br2.MobyDickBot 1.6 | 4.8 | 10.4% | 29 |
| rdt199.Warlord 0.73 | 6.1 | 9.3% | 17 |
| uji.YellohFellah 1.0 | 6.9 | 8.6% | 13 |
| KiraNL.Chupacabra 0.4 | 7.9 | 7.3% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.7% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 78.4 | 7 / 35 | 3659 |
| 2 | 1 | 63.6 | 81.0 | 11 / 35 | 3393 |
| 3 | 2 | 59.9 | 70.8 | 7 / 35 | 3053 |
| 4 | 2 | 63.0 | 76.8 | 10 / 35 | 3768 |
| 5 | 2 | 60.3 | 71.1 | 10 / 35 | 3070 |
| 6 | 2 | 62.3 | 77.1 | 8 / 35 | 3211 |
| 7 | 2 | 62.8 | 78.7 | 10 / 35 | 3180 |
| 8 | 2 | 62.9 | 80.0 | 9 / 35 | 3109 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 47 | 32% |
| djc.DynaBot 0.1.1 | 24 | 71% |
| br2.MobyDickBot 1.6 | 22 | 36% |
| cx.mini.Nimrod 0.55 | 14 | 64% |
| uji.YellohFellah 1.0 | 14 | 100% |
| rdt199.Warlord 0.73 | 12 | 58% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |

Hadur died in 210 of 280 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 76 | 36% | 94 |
| cx.mini.Nimrod 0.55 | 36 | 17% | 48 |
| djc.DynaBot 0.1.1 | 28 | 13% | 46 |
| br2.MobyDickBot 1.6 | 23 | 11% | 27 |
| rdt199.Warlord 0.73 | 20 | 10% | 30 |
| uji.YellohFellah 1.0 | 11 | 5% | 18 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 3% | 6 |
| stelo.MirrorNano 1.3 | 5 | 2% | 5 |
| KiraNL.Chupacabra 0.4 | 3 | 1% | 6 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 271 rounds): 206777 melee ticks, 42407 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (271 rounds): longest scan gap while four or more were alive 47 ticks (271 rounds over 8); rounds whose longest gap at any count was over 8: 271; robots dropped as dead without a death event: 0.

Targeting waves (271 rounds): 67981 sent, 61956 reached their opponent, 8805 virtual hits (14.2% of those reached).

## Melee bench: F12

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 268 over 8 battles (33.5 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 83.5 | 137 / 280 | 2.49 | 16.7% | 26774 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 16.7% | 137 |
| bts.wiki.RipCurl 0.9b | 2.5 | 13.9% | 45 |
| nat.PallasHawk 1.0 | 3.0 | 13.5% | 53 |
| darkcanuck.Leon 1.01 | 3.6 | 12.6% | 24 |
| brainfade.melee.Genghis 0.36 | 4.9 | 10.6% | 14 |
| jrm.Test0 1.0 | 6.4 | 7.9% | 2 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.1% | 4 |
| jp.Perpy 16.0 | 7.9 | 6.5% | 2 |
| jaybot.bots.Oddball 4.0 | 8.9 | 5.6% | 1 |
| stuff.Vlad 0.1 | 9.6 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 84.8 | 19 / 35 | 3488 |
| 2 | 1 | 65.0 | 83.8 | 15 / 35 | 3296 |
| 3 | 1 | 64.9 | 83.2 | 14 / 35 | 3271 |
| 4 | 1 | 66.0 | 86.0 | 17 / 35 | 3398 |
| 5 | 1 | 64.2 | 81.3 | 14 / 35 | 3359 |
| 6 | 1 | 66.0 | 82.5 | 21 / 35 | 3419 |
| 7 | 1 | 64.5 | 80.6 | 17 / 35 | 3180 |
| 8 | 1 | 66.2 | 85.7 | 20 / 35 | 3363 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 52 | 65% |
| darkcanuck.Leon 1.01 | 51 | 92% |
| bts.wiki.RipCurl 0.9b | 45 | 69% |
| brainfade.melee.Genghis 0.36 | 20 | 70% |
| cs.sheldor.Talon 1.1 | 4 | 75% |
| jrm.Test0 1.0 | 4 | 75% |
| jaybot.bots.Oddball 4.0 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| jp.Perpy 16.0 | 1 | 0% |

Hadur died in 145 of 280 rounds, at a mean tick of 672. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 40 | 28% | 61 |
| nat.PallasHawk 1.0 | 37 | 26% | 77 |
| brainfade.melee.Genghis 0.36 | 18 | 12% | 27 |
| darkcanuck.Leon 1.01 | 15 | 10% | 63 |
| jrm.Test0 1.0 | 13 | 9% | 19 |
| jp.Perpy 16.0 | 8 | 6% | 10 |
| cs.sheldor.Talon 1.1 | 6 | 4% | 10 |
| jaybot.bots.Oddball 4.0 | 5 | 3% | 9 |
| stuff.Vlad 0.1 | 1 | 1% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 270 rounds): 171250 melee ticks, 46561 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (270 rounds): longest scan gap while four or more were alive 42 ticks (270 rounds over 8); rounds whose longest gap at any count was over 8: 270; robots dropped as dead without a death event: 0.

Targeting waves (270 rounds): 60454 sent, 54325 reached their opponent, 9628 virtual hits (17.7% of those reached).

## Melee bench: F13

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 162 over 8 battles (20.3 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 80.6 | 75 / 280 | 2.75 | 15.1% | 28071 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.5 | 16.6% | 50 |
| mn.Combat 3.25.0 | 1.9 | 16.5% | 118 |
| hadur2.Hadur 3.17.1bb | 2.6 | 15.1% | 75 |
| shinh.Entangled 0.3 | 4.3 | 12.3% | 20 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.8% | 16 |
| apc.Colossus2 0.17 | 6.0 | 8.4% | 0 |
| stelo.Wang 1.0 | 7.1 | 6.5% | 1 |
| ayk.WallHugger 1.0 | 8.1 | 5.0% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.7 | 73.7 | 7 / 35 | 3444 |
| 2 | 2 | 65.2 | 82.2 | 10 / 35 | 3976 |
| 3 | 3 | 62.9 | 78.4 | 6 / 35 | 3519 |
| 4 | 3 | 64.2 | 79.7 | 11 / 35 | 3603 |
| 5 | 3 | 64.1 | 81.3 | 9 / 35 | 3460 |
| 6 | 2 | 64.2 | 82.2 | 10 / 35 | 3481 |
| 7 | 2 | 64.9 | 85.4 | 11 / 35 | 3490 |
| 8 | 3 | 63.5 | 81.6 | 11 / 35 | 3098 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 52 | 71% |
| mn.Combat 3.25.0 | 52 | 27% |
| shinh.Entangled 0.3 | 21 | 62% |
| gh.micro.Gruweltje 0.7 | 14 | 64% |
| stelo.Wang 1.0 | 1 | 100% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 205 of 280 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 78 | 38% | 92 |
| ags.Glacier 0.2.11 | 64 | 31% | 96 |
| shinh.Entangled 0.3 | 31 | 15% | 43 |
| gh.micro.Gruweltje 0.7 | 18 | 9% | 32 |
| apc.Colossus2 0.17 | 6 | 3% | 6 |
| stelo.Wang 1.0 | 5 | 2% | 7 |
| ayk.WallHugger 1.0 | 2 | 1% | 3 |
| maribo.FollowFire 1 | 1 | 0% | 1 |

Posture (Hadur's M records, 269 rounds): 199584 melee ticks, 49073 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 98 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (269 rounds): longest scan gap while four or more were alive 98 ticks (269 rounds over 8); rounds whose longest gap at any count was over 8: 269; robots dropped as dead without a death event: 0.

Targeting waves (269 rounds): 59378 sent, 53191 reached their opponent, 8942 virtual hits (16.8% of those reached).

## Melee bench: F14

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 385 over 8 battles (48.1 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 93.5 | 199 / 280 | 1.58 | 19.9% | 41176 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.9% | 199 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.1% | 27 |
| catcat20.shape.Theta 0.018 | 3.5 | 12.1% | 35 |
| co.edu.usb.rc.LidisTron 1.0 | 4.1 | 9.9% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 5.4 | 9.7% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.9 | 9.4% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.0 | 8.3% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.1 | 8.0% | 11 |
| pa.Improved 1.0 | 9.0 | 5.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 94.6 | 26 / 35 | 5144 |
| 2 | 1 | 69.8 | 92.1 | 23 / 35 | 5177 |
| 3 | 1 | 71.3 | 96.5 | 26 / 35 | 5453 |
| 4 | 1 | 71.0 | 96.5 | 26 / 35 | 5201 |
| 5 | 1 | 69.5 | 89.8 | 25 / 35 | 5073 |
| 6 | 1 | 70.3 | 94.9 | 22 / 35 | 5342 |
| 7 | 1 | 70.4 | 93.3 | 28 / 35 | 5091 |
| 8 | 1 | 69.0 | 90.5 | 23 / 35 | 4695 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 109 | 85% |
| catcat20.shape.Theta 0.018 | 79 | 70% |
| sheldor.micro.PointInLineRRAL 1.0 | 20 | 70% |
| sanyi.mikrobi.Roberto 1.0 | 16 | 88% |
| co.edu.usb.rc.LidisTron 1.0 | 15 | 93% |
| Lo_Ian.Gandalf_V4 4.0 | 7 | 86% |
| pa.Improved 1.0 | 2 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 84 of 280 rounds, at a mean tick of 950. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 30 | 36% | 118 |
| catcat20.shape.Theta 0.018 | 28 | 33% | 76 |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 12% | 30 |
| sanyi.mikrobi.Roberto 1.0 | 6 | 7% | 20 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 4% | 8 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 2% | 10 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 1% | 10 |
| pa.Improved 1.0 | 1 | 1% | 7 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 269 rounds): 190442 melee ticks, 71456 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (269 rounds): longest scan gap while four or more were alive 40 ticks (269 rounds over 8); rounds whose longest gap at any count was over 8: 269; robots dropped as dead without a death event: 0.

Targeting waves (269 rounds): 61432 sent, 55845 reached their opponent, 14818 virtual hits (26.5% of those reached).

## Melee bench: F15

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 146 over 8 battles (18.3 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 83.1 | 123 / 280 | 2.52 | 17.3% | 34965 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.3% | 123 |
| emp.Yngwie 1.11 | 2.6 | 13.5% | 76 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.8% | 32 |
| mld.DustBunny 3.8 | 3.8 | 12.6% | 11 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.8% | 15 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.4% | 16 |
| lambdaxy.TBot 0.1 | 7.4 | 6.6% | 0 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.4% | 1 |
| divineomega.TrialBot 0.003 | 9.0 | 5.2% | 6 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 87.9 | 19 / 35 | 4577 |
| 2 | 1 | 67.5 | 84.4 | 20 / 35 | 4508 |
| 3 | 1 | 66.2 | 83.2 | 14 / 35 | 4541 |
| 4 | 1 | 65.9 | 82.5 | 17 / 35 | 4003 |
| 5 | 1 | 65.8 | 81.6 | 12 / 35 | 4318 |
| 6 | 1 | 65.8 | 78.4 | 14 / 35 | 4549 |
| 7 | 1 | 65.1 | 83.2 | 11 / 35 | 3851 |
| 8 | 1 | 67.4 | 83.5 | 16 / 35 | 4618 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 67 | 48% |
| kawigi.micro.Shiz 1.1 | 42 | 86% |
| mld.DustBunny 3.8 | 24 | 96% |
| kawigi.robot.Girl 1.2 | 22 | 64% |
| cb.nano.Insomnia 1.0 | 18 | 67% |
| divineomega.TrialBot 0.003 | 6 | 83% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |

Hadur died in 157 of 280 rounds, at a mean tick of 995. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 61 | 39% | 101 |
| cb.nano.Insomnia 1.0 | 25 | 16% | 27 |
| kawigi.micro.Shiz 1.1 | 24 | 15% | 55 |
| mld.DustBunny 3.8 | 23 | 15% | 55 |
| kawigi.robot.Girl 1.2 | 15 | 10% | 18 |
| Grystrion.TrackerWO 1.0 | 5 | 3% | 9 |
| divineomega.TrialBot 0.003 | 4 | 3% | 13 |
| lambdaxy.TBot 0.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 274 rounds): 228049 melee ticks, 55784 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 64 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 73764 sent, 67715 reached their opponent, 11692 virtual hits (17.3% of those reached).

## Melee bench: F16

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 281 over 8 battles (35.1 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 84.8 | 132 / 280 | 2.37 | 17.9% | 37901 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.3 | 17.9% | 132 |
| gh.Griezel 0.5.2 | 1.8 | 16.4% | 70 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.2% | 8 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 11.6% | 51 |
| bvh.fnr.Fenrir 0.36l | 5.4 | 9.2% | 4 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.9% | 7 |
| stelo.IntrinsicVolatility 1.4 | 6.9 | 7.7% | 3 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 4.9% | 5 |
| repositorio.NanoStep 1.0 | 8.9 | 4.7% | 0 |
| asd.Cthulhu 1.3 | 9.4 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.4 | 87.0 | 16 / 35 | 4630 |
| 2 | 2 | 66.7 | 82.5 | 14 / 35 | 4478 |
| 3 | 1 | 68.9 | 87.6 | 18 / 35 | 5018 |
| 4 | 1 | 68.2 | 85.7 | 18 / 35 | 4788 |
| 5 | 1 | 65.7 | 80.3 | 14 / 35 | 4491 |
| 6 | 1 | 66.0 | 80.0 | 16 / 35 | 4340 |
| 7 | 1 | 70.0 | 89.2 | 19 / 35 | 5402 |
| 8 | 1 | 68.1 | 85.7 | 17 / 35 | 4754 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 89 | 64% |
| techdude.forest.FlamingForest 1.1 | 51 | 65% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 20 | 95% |
| tvv.nano.Polaris 1.2 | 9 | 89% |
| bvh.fnr.Fenrir 0.36l | 8 | 75% |
| stelo.IntrinsicVolatility 1.4 | 5 | 80% |
| divineomega.DivineBot 1.9.4.5 | 5 | 100% |

Hadur died in 149 of 280 rounds, at a mean tick of 1073. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 51 | 34% | 105 |
| techdude.forest.FlamingForest 1.1 | 36 | 24% | 71 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 23 | 15% | 43 |
| bvh.fnr.Fenrir 0.36l | 16 | 11% | 22 |
| stelo.IntrinsicVolatility 1.4 | 8 | 5% | 14 |
| divineomega.DivineBot 1.9.4.5 | 6 | 4% | 10 |
| tvv.nano.Polaris 1.2 | 4 | 3% | 10 |
| asd.Cthulhu 1.3 | 4 | 3% | 4 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 243937 melee ticks, 77606 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 41 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 0.

Targeting waves (272 rounds): 78317 sent, 72219 reached their opponent, 12687 virtual hits (17.6% of those reached).

## Melee bench: F17

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 385 over 8 battles (48.1 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 85.0 | 133 / 280 | 2.35 | 18.1% | 39944 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.1% | 133 |
| et.Predator 1.8 | 2.8 | 13.6% | 29 |
| oog.melee.Mercutio 1.0 | 2.8 | 13.4% | 49 |
| cx.BlestPain 1.41 | 3.8 | 12.6% | 53 |
| ahf.NanoAndrew .4 | 5.4 | 10.3% | 12 |
| nic.Nicator 2.4 | 5.6 | 10.0% | 5 |
| maribo.melee.BMV 0.1 | 6.8 | 8.7% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.6% | 0 |
| tex.Longbot 0.4 | 8.5 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 86.3 | 20 / 35 | 5197 |
| 2 | 1 | 66.2 | 82.9 | 15 / 35 | 4379 |
| 3 | 1 | 67.8 | 84.4 | 16 / 35 | 4941 |
| 4 | 1 | 65.8 | 79.7 | 12 / 35 | 4668 |
| 5 | 1 | 68.8 | 87.9 | 19 / 35 | 4892 |
| 6 | 1 | 68.8 | 86.3 | 18 / 35 | 5408 |
| 7 | 1 | 65.7 | 80.0 | 11 / 35 | 4680 |
| 8 | 1 | 70.8 | 92.1 | 22 / 35 | 5779 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 67 | 67% |
| et.Predator 1.8 | 56 | 77% |
| cx.BlestPain 1.41 | 44 | 39% |
| nic.Nicator 2.4 | 12 | 100% |
| ahf.NanoAndrew .4 | 10 | 80% |
| maribo.melee.BMV 0.1 | 6 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |

Hadur died in 152 of 280 rounds, at a mean tick of 1035. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 43 | 28% | 61 |
| oog.melee.Mercutio 1.0 | 38 | 25% | 73 |
| et.Predator 1.8 | 29 | 19% | 68 |
| ahf.NanoAndrew .4 | 17 | 11% | 26 |
| maribo.melee.BMV 0.1 | 8 | 5% | 16 |
| nic.Nicator 2.4 | 6 | 4% | 25 |
| tex.Longbot 0.4 | 6 | 4% | 7 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 4 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 269 rounds): 217242 melee ticks, 72331 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (269 rounds): longest scan gap while four or more were alive 49 ticks (269 rounds over 8); rounds whose longest gap at any count was over 8: 269; robots dropped as dead without a death event: 0.

Targeting waves (269 rounds): 73390 sent, 67495 reached their opponent, 15548 virtual hits (23.0% of those reached).

## Melee bench: F18

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 227 over 8 battles (28.4 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 86.7 | 167 / 280 | 2.19 | 18.3% | 34847 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.3% | 167 |
| morbid.MorbidPriest 1.0 | 2.4 | 13.7% | 37 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.5% | 34 |
| uji.DBH 1.1 | 3.6 | 11.7% | 21 |
| spinnercat.Robovirus 2.718 | 5.9 | 8.6% | 4 |
| sigterm.Sigterm 1.0 | 6.3 | 8.4% | 8 |
| ratosh.Nobo 0.21 | 6.5 | 8.6% | 2 |
| kawigi.mini.Fhqwhgads 1.1 | 7.4 | 7.8% | 4 |
| stelo.WangRobot 1.0 | 9.5 | 5.1% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 85.7 | 21 / 35 | 4532 |
| 2 | 1 | 67.4 | 84.8 | 21 / 35 | 4358 |
| 3 | 1 | 68.4 | 89.2 | 23 / 35 | 4489 |
| 4 | 1 | 67.0 | 84.8 | 19 / 35 | 4245 |
| 5 | 1 | 66.3 | 84.4 | 17 / 35 | 4239 |
| 6 | 1 | 67.9 | 90.5 | 19 / 35 | 4181 |
| 7 | 1 | 68.3 | 88.9 | 24 / 35 | 4385 |
| 8 | 1 | 68.0 | 85.7 | 23 / 35 | 4418 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 73 | 78% |
| agd.Mooserwirt2 2.7 | 45 | 78% |
| uji.DBH 1.1 | 31 | 81% |
| sigterm.Sigterm 1.0 | 22 | 95% |
| spinnercat.Robovirus 2.718 | 10 | 80% |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 88% |
| ratosh.Nobo 0.21 | 8 | 88% |
| stelo.WangRobot 1.0 | 7 | 86% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 113 of 280 rounds, at a mean tick of 759. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 41 | 36% | 88 |
| agd.Mooserwirt2 2.7 | 26 | 23% | 63 |
| uji.DBH 1.1 | 16 | 14% | 39 |
| kawigi.mini.Fhqwhgads 1.1 | 7 | 6% | 23 |
| ratosh.Nobo 0.21 | 7 | 6% | 23 |
| sigterm.Sigterm 1.0 | 6 | 5% | 21 |
| spinnercat.Robovirus 2.718 | 5 | 4% | 12 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 3% | 5 |
| stelo.WangRobot 1.0 | 2 | 2% | 6 |

Posture (Hadur's M records, 268 rounds): 179990 melee ticks, 58882 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (268 rounds): longest scan gap while four or more were alive 48 ticks (268 rounds over 8); rounds whose longest gap at any count was over 8: 268; robots dropped as dead without a death event: 0.

Targeting waves (268 rounds): 61894 sent, 56019 reached their opponent, 12918 virtual hits (23.1% of those reached).

## Melee bench: F19

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 150 over 8 battles (18.8 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 97.5 | 256 / 280 | 1.22 | 21.8% | 45582 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 21.8% | 256 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.6% | 7 |
| mld.Infinity 2.2 | 3.5 | 12.2% | 8 |
| krillr.mini.JointStrike 2.0.0 | 3.8 | 12.0% | 3 |
| erdnis.Rover 0.3 | 4.8 | 10.6% | 4 |
| patson.PatsonTestBot 1.0 | 6.5 | 8.0% | 1 |
| mbh.Mbh 0.1 | 7.4 | 7.1% | 0 |
| pac.ABC 2.1 | 7.5 | 6.9% | 1 |
| pbg.R2D2 1.0 | 8.6 | 5.6% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 97.8 | 30 / 35 | 5655 |
| 2 | 1 | 72.4 | 98.1 | 33 / 35 | 5325 |
| 3 | 1 | 72.6 | 97.8 | 32 / 35 | 5483 |
| 4 | 1 | 72.6 | 96.8 | 32 / 35 | 5560 |
| 5 | 1 | 72.9 | 97.5 | 32 / 35 | 6008 |
| 6 | 1 | 71.9 | 94.0 | 30 / 35 | 5645 |
| 7 | 1 | 73.5 | 99.7 | 34 / 35 | 5857 |
| 8 | 1 | 73.3 | 98.7 | 33 / 35 | 6049 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 131 | 97% |
| mld.Infinity 2.2 | 49 | 100% |
| krillr.mini.JointStrike 2.0.0 | 41 | 98% |
| erdnis.Rover 0.3 | 20 | 90% |
| pac.ABC 2.1 | 10 | 100% |
| patson.PatsonTestBot 1.0 | 8 | 88% |
| pbg.R2D2 1.0 | 4 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 25 of 280 rounds, at a mean tick of 748. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 10 | 40% | 102 |
| krillr.mini.JointStrike 2.0.0 | 5 | 20% | 43 |
| erdnis.Rover 0.3 | 4 | 16% | 31 |
| patson.PatsonTestBot 1.0 | 3 | 12% | 22 |
| pbg.R2D2 1.0 | 2 | 8% | 15 |
| mld.Infinity 2.2 | 1 | 4% | 43 |
| pac.ABC 2.1 | 0 | 0% | 12 |
| mbh.Mbh 0.1 | 0 | 0% | 9 |

Posture (Hadur's M records, 264 rounds): 171811 melee ticks, 61920 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (264 rounds): longest scan gap while four or more were alive 47 ticks (264 rounds over 8); rounds whose longest gap at any count was over 8: 264; robots dropped as dead without a death event: 0.

Targeting waves (264 rounds): 58514 sent, 53047 reached their opponent, 13457 virtual hits (25.4% of those reached).

## Melee bench: F20

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 131 over 8 battles (16.4 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 89.6 | 179 / 280 | 1.93 | 19.7% | 42732 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.7% | 179 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.8% | 54 |
| fwb.Nine 1.0.1 | 3.6 | 11.1% | 14 |
| nz.jdc.nano.GridFu 1.0 | 4.0 | 10.5% | 4 |
| catcat20.Rabbit 0.001 | 4.4 | 10.5% | 22 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 8.8% | 3 |
| bayen.nut.Squirrel 1.615 | 7.0 | 7.4% | 5 |
| djdjdj.NanoSkunk10 1.0 | 8.3 | 6.2% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.5 | 5.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 88.6 | 22 / 35 | 5432 |
| 2 | 1 | 69.4 | 86.7 | 23 / 35 | 5346 |
| 3 | 1 | 69.1 | 86.0 | 19 / 35 | 5467 |
| 4 | 1 | 69.2 | 89.8 | 20 / 35 | 5083 |
| 5 | 1 | 69.8 | 89.5 | 22 / 35 | 5342 |
| 6 | 1 | 71.8 | 95.2 | 27 / 35 | 5825 |
| 7 | 1 | 70.6 | 93.3 | 26 / 35 | 5326 |
| 8 | 1 | 68.8 | 87.9 | 20 / 35 | 4911 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 100 | 80% |
| fwb.Nine 1.0.1 | 52 | 88% |
| catcat20.Rabbit 0.001 | 30 | 73% |
| nz.jdc.nano.GridFu 1.0 | 14 | 93% |
| bayen.nut.Squirrel 1.615 | 8 | 75% |
| m3thos.mini.Eva01 0.5.5 | 6 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |

Hadur died in 102 of 280 rounds, at a mean tick of 918. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 54 | 53% | 135 |
| catcat20.Rabbit 0.001 | 16 | 16% | 47 |
| fwb.Nine 1.0.1 | 9 | 9% | 19 |
| nz.jdc.nano.GridFu 1.0 | 7 | 7% | 29 |
| bayen.nut.Squirrel 1.615 | 6 | 6% | 20 |
| ntc.ControlledChaos 1.1.4 | 5 | 5% | 8 |
| m3thos.mini.Eva01 0.5.5 | 2 | 2% | 13 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 268 rounds): 212263 melee ticks, 70785 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (268 rounds): longest scan gap while four or more were alive 42 ticks (268 rounds over 8); rounds whose longest gap at any count was over 8: 268; robots dropped as dead without a death event: 0.

Targeting waves (268 rounds): 69081 sent, 63318 reached their opponent, 15760 virtual hits (24.9% of those reached).

## Melee bench: F21

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 343 over 8 battles (42.9 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 90.9 | 144 / 280 | 1.82 | 19.1% | 39830 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.1 | 19.1% | 144 |
| eem.EvBot v4.6.16 | 1.9 | 16.9% | 102 |
| dummy.mini.Scimitar 1.01 | 3.3 | 13.4% | 11 |
| cf.RiO.RiOx 4.2.1 | 3.8 | 12.2% | 12 |
| eld.Hmm 1.0 | 5.1 | 8.7% | 12 |
| oa.weak.BotherBot 0.1 | 6.0 | 7.7% | 0 |
| fire219.CatBot 1.0 | 7.4 | 6.3% | 0 |
| PSW.Relentless 0.1 | 8.3 | 5.8% | 0 |
| el.JumpShoot 0.2 | 8.4 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 9.9 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 91.7 | 18 / 35 | 5094 |
| 2 | 1 | 70.6 | 94.3 | 23 / 35 | 4957 |
| 3 | 1 | 69.9 | 91.1 | 17 / 35 | 5196 |
| 4 | 1 | 69.8 | 93.0 | 21 / 35 | 4991 |
| 5 | 2 | 68.5 | 87.6 | 14 / 35 | 4796 |
| 6 | 1 | 68.9 | 89.2 | 17 / 35 | 4897 |
| 7 | 1 | 68.5 | 90.2 | 17 / 35 | 5007 |
| 8 | 1 | 68.7 | 89.8 | 17 / 35 | 4892 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 164 | 52% |
| cf.RiO.RiOx 4.2.1 | 31 | 94% |
| dummy.mini.Scimitar 1.01 | 20 | 80% |
| eld.Hmm 1.0 | 16 | 50% |
| oa.weak.BotherBot 0.1 | 3 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| arthord.MannyPacquiao Beta | 2 | 50% |

Hadur died in 140 of 280 rounds, at a mean tick of 1394. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 93 | 66% | 160 |
| dummy.mini.Scimitar 1.01 | 16 | 11% | 46 |
| eld.Hmm 1.0 | 11 | 8% | 27 |
| cf.RiO.RiOx 4.2.1 | 9 | 6% | 29 |
| PSW.Relentless 0.1 | 4 | 3% | 4 |
| fire219.CatBot 1.0 | 2 | 1% | 3 |
| arthord.MannyPacquiao Beta | 1 | 1% | 2 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 5 |
| el.JumpShoot 0.2 | 0 | 0% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 271 rounds): 247857 melee ticks, 114952 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (271 rounds): longest scan gap while four or more were alive 72 ticks (271 rounds over 8); rounds whose longest gap at any count was over 8: 271; robots dropped as dead without a death event: 0.

Targeting waves (271 rounds): 73062 sent, 67340 reached their opponent, 12083 virtual hits (17.9% of those reached).

## Melee bench: F22

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 136 over 8 battles (17.0 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 87.8 | 116 / 280 | 2.10 | 17.7% | 35324 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.4 | 17.7% | 116 |
| pe.SandboxDT 2.71m | 1.6 | 17.0% | 87 |
| kvk.HebusLeTroll 0.35 | 3.1 | 14.4% | 37 |
| jlm.javaDisturbance 0.59 | 3.9 | 13.2% | 31 |
| bigpete.Stewie 1.0 | 5.0 | 10.7% | 9 |
| yk.JahRoslav 1.1 | 6.4 | 6.7% | 2 |
| gg.Squaraus 0.6 | 7.1 | 6.3% | 0 |
| tad.Dalek98 0.98 | 7.5 | 6.3% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.8% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 88.3 | 15 / 35 | 4452 |
| 2 | 1 | 68.7 | 90.5 | 20 / 35 | 4374 |
| 3 | 2 | 65.2 | 80.3 | 10 / 35 | 4087 |
| 4 | 1 | 68.5 | 89.8 | 17 / 35 | 4671 |
| 5 | 2 | 67.9 | 87.6 | 12 / 35 | 4324 |
| 6 | 2 | 66.2 | 82.5 | 9 / 35 | 4267 |
| 7 | 1 | 68.4 | 89.5 | 14 / 35 | 4674 |
| 8 | 1 | 69.5 | 93.7 | 19 / 35 | 4475 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 85 | 46% |
| jlm.javaDisturbance 0.59 | 61 | 70% |
| kvk.HebusLeTroll 0.35 | 37 | 62% |
| bigpete.Stewie 1.0 | 11 | 64% |
| yk.JahRoslav 1.1 | 2 | 0% |
| pbg.NinjaX 1.2 | 2 | 100% |
| tad.Dalek98 0.98 | 1 | 100% |
| gg.Squaraus 0.6 | 1 | 100% |

Hadur died in 166 of 280 rounds, at a mean tick of 1058. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 79 | 48% | 120 |
| kvk.HebusLeTroll 0.35 | 42 | 25% | 55 |
| jlm.javaDisturbance 0.59 | 33 | 20% | 72 |
| bigpete.Stewie 1.0 | 6 | 4% | 16 |
| yk.JahRoslav 1.1 | 3 | 2% | 3 |
| pbg.NinjaX 1.2 | 1 | 1% | 6 |
| tad.Dalek98 0.98 | 1 | 1% | 4 |
| gg.Squaraus 0.6 | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 268 rounds): 222411 melee ticks, 64254 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (268 rounds): longest scan gap while four or more were alive 39 ticks (268 rounds over 8); rounds whose longest gap at any count was over 8: 268; robots dropped as dead without a death event: 0.

Targeting waves (268 rounds): 71249 sent, 65422 reached their opponent, 11264 virtual hits (17.2% of those reached).

## Melee bench: F23

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 139 over 8 battles (17.4 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 93.9 | 210 / 280 | 1.55 | 20.3% | 41722 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 20.3% | 210 |
| pe.SandboxLump 1.52 | 2.0 | 16.6% | 48 |
| cre.Karolos 0.32 | 3.0 | 14.0% | 8 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.7% | 6 |
| stelo.RamTrackSurfer 1.2 | 5.3 | 9.3% | 7 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.0 | 9.0% | 0 |
| cw.megas.Blade 0.8 | 7.0 | 7.8% | 0 |
| sample.Walls 1.0 | 7.8 | 7.3% | 1 |
| cli.WasteOfAmmo 1.0 | 9.3 | 2.7% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 98.4 | 31 / 35 | 5084 |
| 2 | 1 | 71.2 | 94.0 | 27 / 35 | 5092 |
| 3 | 1 | 70.9 | 92.7 | 27 / 35 | 5511 |
| 4 | 1 | 70.2 | 89.8 | 25 / 35 | 5007 |
| 5 | 1 | 70.9 | 91.7 | 23 / 35 | 5046 |
| 6 | 1 | 72.7 | 97.5 | 29 / 35 | 5511 |
| 7 | 1 | 71.5 | 93.7 | 25 / 35 | 5426 |
| 8 | 1 | 70.6 | 93.3 | 23 / 35 | 5045 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 133 | 80% |
| cre.Karolos 0.32 | 60 | 97% |
| stelo.AreaTargetingBot 1.1 | 22 | 86% |
| stelo.RamTrackSurfer 1.2 | 17 | 82% |
| sample.Walls 1.0 | 6 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 70 of 280 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 37 | 53% | 139 |
| cre.Karolos 0.32 | 11 | 16% | 58 |
| stelo.AreaTargetingBot 1.1 | 9 | 13% | 28 |
| stelo.RamTrackSurfer 1.2 | 6 | 9% | 27 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 7% | 11 |
| sample.Walls 1.0 | 1 | 1% | 11 |
| cw.megas.Blade 0.8 | 1 | 1% | 2 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 267 rounds): 171844 melee ticks, 59842 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (267 rounds): longest scan gap while four or more were alive 41 ticks (267 rounds over 8); rounds whose longest gap at any count was over 8: 267; robots dropped as dead without a death event: 0.

Targeting waves (267 rounds): 54521 sent, 48677 reached their opponent, 15699 virtual hits (32.3% of those reached).

## Melee bench: F24

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 487 over 8 battles (60.9 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 79.4 | 100 / 280 | 2.85 | 15.7% | 27902 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.1 | 15.7% | 100 |
| rz.GlowBlowMelee 1.4 | 2.5 | 14.0% | 49 |
| florent.XSeries.X2 0.12 | 3.1 | 13.2% | 38 |
| davidalves.Phoenix 0.54 | 3.3 | 13.2% | 58 |
| pedersen.Ugluk 1.1.1 | 5.3 | 11.3% | 15 |
| oog.melee.Corsair 1.0 | 5.8 | 10.1% | 11 |
| stelo.SoJNanoMelee 1.1 | 7.1 | 7.0% | 5 |
| lunchie.Lunchbox 0.93 | 8.4 | 5.8% | 2 |
| as.FrankTheTank 1.3 | 9.0 | 5.2% | 1 |
| evd.X1 0.01 | 9.5 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 82.2 | 12 / 35 | 3778 |
| 2 | 1 | 65.1 | 81.9 | 15 / 35 | 3788 |
| 3 | 1 | 65.4 | 82.9 | 15 / 35 | 3662 |
| 4 | 1 | 64.5 | 78.7 | 14 / 35 | 3586 |
| 5 | 1 | 62.6 | 78.1 | 9 / 35 | 3152 |
| 6 | 1 | 63.3 | 78.4 | 13 / 35 | 3273 |
| 7 | 1 | 64.2 | 81.3 | 12 / 35 | 3413 |
| 8 | 2 | 61.6 | 72.1 | 10 / 35 | 3250 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 46 | 63% |
| davidalves.Phoenix 0.54 | 37 | 43% |
| florent.XSeries.X2 0.12 | 29 | 62% |
| pedersen.Ugluk 1.1.1 | 20 | 70% |
| oog.melee.Corsair 1.0 | 18 | 67% |
| stelo.SoJNanoMelee 1.1 | 9 | 100% |
| as.FrankTheTank 1.3 | 2 | 100% |

Hadur died in 183 of 280 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 46 | 25% | 64 |
| rz.GlowBlowMelee 1.4 | 40 | 22% | 69 |
| florent.XSeries.X2 0.12 | 35 | 19% | 50 |
| pedersen.Ugluk 1.1.1 | 31 | 17% | 47 |
| oog.melee.Corsair 1.0 | 19 | 10% | 33 |
| stelo.SoJNanoMelee 1.1 | 3 | 2% | 8 |
| evd.X1 0.01 | 3 | 2% | 3 |
| lunchie.Lunchbox 0.93 | 2 | 1% | 4 |
| as.FrankTheTank 1.3 | 1 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 181497 melee ticks, 42701 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 39 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 0.

Targeting waves (273 rounds): 62467 sent, 56196 reached their opponent, 11067 virtual hits (19.7% of those reached).

## Melee bench: F25

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 143 over 8 battles (17.9 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 86.4 | 163 / 280 | 2.22 | 17.7% | 28773 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.7% | 163 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.4% | 28 |
| voidious.micro.BlitzBat 1.05 | 2.6 | 13.3% | 22 |
| jdw.Hurricane 1.4 | 4.0 | 11.3% | 26 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.5% | 14 |
| ds.Oo 2.2 | 5.8 | 8.9% | 12 |
| awesomeness.Elite 1.0 | 7.0 | 7.9% | 11 |
| gjr.Cephalosporin 0.1 | 8.1 | 6.7% | 1 |
| adt.Ar2 1.1 | 8.8 | 6.5% | 4 |
| amk.ChumbaMini 0.2 | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 92.1 | 27 / 35 | 4005 |
| 2 | 1 | 64.8 | 83.8 | 17 / 35 | 3380 |
| 3 | 1 | 67.0 | 86.0 | 20 / 35 | 3665 |
| 4 | 1 | 66.8 | 87.3 | 19 / 35 | 3632 |
| 5 | 1 | 67.0 | 87.3 | 20 / 35 | 3574 |
| 6 | 1 | 66.6 | 86.0 | 19 / 35 | 3593 |
| 7 | 1 | 64.8 | 82.2 | 17 / 35 | 3210 |
| 8 | 1 | 67.7 | 86.7 | 24 / 35 | 3714 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 59 | 86% |
| voidious.mini.BrokenSword 2.0.3 | 57 | 82% |
| jdw.Hurricane 1.4 | 35 | 77% |
| gre.svman4.Morfeas 1.4.1 | 14 | 86% |
| ds.Oo 2.2 | 11 | 73% |
| awesomeness.Elite 1.0 | 11 | 64% |
| gjr.Cephalosporin 0.1 | 8 | 100% |
| adt.Ar2 1.1 | 6 | 50% |

Hadur died in 120 of 280 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 28 | 23% | 63 |
| voidious.mini.BrokenSword 2.0.3 | 23 | 19% | 64 |
| jdw.Hurricane 1.4 | 21 | 18% | 44 |
| awesomeness.Elite 1.0 | 16 | 13% | 26 |
| ds.Oo 2.2 | 9 | 8% | 26 |
| gre.svman4.Morfeas 1.4.1 | 8 | 7% | 24 |
| amk.ChumbaMini 0.2 | 6 | 5% | 7 |
| adt.Ar2 1.1 | 4 | 3% | 10 |
| gjr.Cephalosporin 0.1 | 3 | 3% | 13 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 268 rounds): 168853 melee ticks, 37152 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (268 rounds): longest scan gap while four or more were alive 49 ticks (268 rounds over 8); rounds whose longest gap at any count was over 8: 268; robots dropped as dead without a death event: 0.

Targeting waves (268 rounds): 60139 sent, 54212 reached their opponent, 9765 virtual hits (18.0% of those reached).

## Melee bench: F26

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 412 over 8 battles (51.5 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 89.8 | 170 / 280 | 1.92 | 19.2% | 42744 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.2% | 170 |
| ak.Fermat 2.0 | 2.0 | 15.6% | 50 |
| lrem.Spectre 0.4.4 | 3.5 | 12.5% | 18 |
| shu.nitro.LENIN .T34 | 3.8 | 12.0% | 24 |
| js.PinBall 1.6 | 5.0 | 10.8% | 5 |
| jaybot.adv.bots.JayBot 2.0 | 5.9 | 9.8% | 11 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 8.4% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 7.9 | 6.6% | 1 |
| sample.SpinBot 1.0 | 9.0 | 3.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 89.8 | 21 / 35 | 5622 |
| 2 | 1 | 70.8 | 89.2 | 24 / 35 | 5605 |
| 3 | 1 | 70.0 | 89.8 | 21 / 35 | 5306 |
| 4 | 1 | 70.1 | 90.5 | 21 / 35 | 5269 |
| 5 | 1 | 69.3 | 88.3 | 19 / 35 | 5447 |
| 6 | 1 | 68.5 | 87.3 | 18 / 35 | 5164 |
| 7 | 1 | 69.1 | 90.2 | 20 / 35 | 5049 |
| 8 | 1 | 70.5 | 93.0 | 26 / 35 | 5282 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 89 | 69% |
| shu.nitro.LENIN .T34 | 46 | 91% |
| lrem.Spectre 0.4.4 | 41 | 85% |
| js.PinBall 1.6 | 16 | 88% |
| jaybot.adv.bots.JayBot 2.0 | 13 | 54% |
| fullsail.LaxativeTeaTwo 1.0 | 8 | 100% |
| gh.mini.GrubbmOne 1.0 | 2 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 113 of 280 rounds, at a mean tick of 939. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 49 | 43% | 110 |
| lrem.Spectre 0.4.4 | 17 | 15% | 47 |
| js.PinBall 1.6 | 15 | 13% | 30 |
| shu.nitro.LENIN .T34 | 13 | 12% | 54 |
| jaybot.adv.bots.JayBot 2.0 | 12 | 11% | 22 |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 3% | 12 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 3 |
| sample.SpinBot 1.0 | 1 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 214856 melee ticks, 62863 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 41 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 0.

Targeting waves (272 rounds): 71325 sent, 65299 reached their opponent, 16509 virtual hits (25.3% of those reached).

## Melee bench: F27

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 11 other Robocode JVMs running (hadur.bench.MeleeRunner x11), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 149 over 8 battles (18.6 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 94.6 | 235 / 280 | 1.49 | 20.5% | 38025 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 20.5% | 235 |
| mk.Alpha 0.2.1 | 2.1 | 13.4% | 23 |
| EH.Eagle 1.0.6 | 2.9 | 11.9% | 11 |
| wee.Gem 1.8.4 | 5.4 | 9.2% | 4 |
| techdude.kombat.FlamingKombat 1.5 | 5.4 | 9.2% | 3 |
| sheldor.melee.nano.TestMelee 0.1 | 6.0 | 8.9% | 3 |
| joe.ADinosaur 1.0 | 6.8 | 7.9% | 0 |
| throxbot.ThroxBot 0.1 | 7.4 | 7.7% | 1 |
| caimano.Furia_Ceca 0.22 | 8.6 | 6.7% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 96.8 | 31 / 35 | 4816 |
| 2 | 1 | 70.2 | 95.2 | 29 / 35 | 4636 |
| 3 | 1 | 71.0 | 95.2 | 31 / 35 | 4898 |
| 4 | 1 | 70.3 | 94.9 | 28 / 35 | 4817 |
| 5 | 1 | 71.3 | 96.2 | 32 / 35 | 4863 |
| 6 | 1 | 69.6 | 91.1 | 27 / 35 | 4752 |
| 7 | 1 | 69.2 | 92.4 | 27 / 35 | 4365 |
| 8 | 1 | 70.8 | 94.9 | 30 / 35 | 4878 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 122 | 92% |
| EH.Eagle 1.0.6 | 63 | 95% |
| wee.Gem 1.8.4 | 23 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 93% |
| techdude.kombat.FlamingKombat 1.5 | 13 | 100% |
| throxbot.ThroxBot 0.1 | 7 | 100% |
| joe.ADinosaur 1.0 | 6 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 46 of 280 rounds, at a mean tick of 715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 17 | 37% | 109 |
| EH.Eagle 1.0.6 | 9 | 20% | 65 |
| throxbot.ThroxBot 0.1 | 7 | 15% | 13 |
| joe.ADinosaur 1.0 | 4 | 9% | 15 |
| caimano.Furia_Ceca 0.22 | 3 | 7% | 8 |
| wee.Gem 1.8.4 | 2 | 4% | 31 |
| sheldor.melee.nano.TestMelee 0.1 | 2 | 4% | 21 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 2% | 16 |
| cs.Grudge 1.0 | 1 | 2% | 2 |

Posture (Hadur's M records, 266 rounds): 181794 melee ticks, 57322 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (266 rounds): longest scan gap while four or more were alive 39 ticks (266 rounds over 8); rounds whose longest gap at any count was over 8: 266; robots dropped as dead without a death event: 0.

Targeting waves (266 rounds): 59265 sent, 53433 reached their opponent, 13818 virtual hits (25.9% of those reached).

## Melee bench: F28

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 343 over 8 battles (42.9 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 88.5 | 166 / 280 | 2.03 | 17.9% | 29419 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.9% | 166 |
| kid.test.NightFox .2 | 2.0 | 15.1% | 49 |
| uji.Antique 1.0 | 3.3 | 12.6% | 35 |
| pfvicm.Sobieski 7.2.3b | 4.4 | 10.4% | 5 |
| qohnil.blot.BlotBot 3.61 | 4.6 | 10.3% | 13 |
| ahr.ice.Ice 1.0.2 | 6.3 | 8.2% | 5 |
| amk.ChumbaWumba 0.3 | 6.9 | 7.6% | 5 |
| matt.advanced.Katana 1.0 | 7.6 | 6.9% | 2 |
| stelo.PianistNano 1.2 | 9.5 | 5.6% | 0 |
| stelo.Lifestealer 1.0 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 92.1 | 22 / 35 | 3850 |
| 2 | 1 | 66.3 | 86.7 | 19 / 35 | 3512 |
| 3 | 1 | 67.2 | 88.6 | 24 / 35 | 3497 |
| 4 | 1 | 68.2 | 92.4 | 22 / 35 | 3705 |
| 5 | 1 | 66.6 | 87.3 | 19 / 35 | 3717 |
| 6 | 1 | 68.1 | 91.1 | 22 / 35 | 3874 |
| 7 | 1 | 65.0 | 82.2 | 16 / 35 | 3498 |
| 8 | 1 | 67.4 | 87.9 | 22 / 35 | 3766 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 91 | 78% |
| uji.Antique 1.0 | 65 | 83% |
| qohnil.blot.BlotBot 3.61 | 18 | 61% |
| pfvicm.Sobieski 7.2.3b | 13 | 92% |
| ahr.ice.Ice 1.0.2 | 9 | 89% |
| amk.ChumbaWumba 0.3 | 8 | 75% |
| matt.advanced.Katana 1.0 | 4 | 75% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 117 of 280 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 32 | 27% | 76 |
| uji.Antique 1.0 | 27 | 23% | 79 |
| pfvicm.Sobieski 7.2.3b | 20 | 17% | 34 |
| qohnil.blot.BlotBot 3.61 | 12 | 10% | 28 |
| amk.ChumbaWumba 0.3 | 10 | 9% | 18 |
| ahr.ice.Ice 1.0.2 | 8 | 7% | 22 |
| matt.advanced.Katana 1.0 | 3 | 3% | 15 |
| stelo.PianistNano 1.2 | 2 | 2% | 5 |
| stelo.Lifestealer 1.0 | 1 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 270 rounds): 177730 melee ticks, 49339 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (270 rounds): longest scan gap while four or more were alive 47 ticks (270 rounds over 8); rounds whose longest gap at any count was over 8: 270; robots dropped as dead without a death event: 0.

Targeting waves (270 rounds): 59841 sent, 53969 reached their opponent, 8185 virtual hits (15.2% of those reached).

## Melee bench: F29

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 228 over 8 battles (28.5 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 84.6 | 117 / 280 | 2.38 | 17.6% | 33073 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.3 | 17.6% | 117 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 15.2% | 76 |
| deewiant.Anomaly 0.2 | 2.6 | 15.0% | 52 |
| myl.micro.Troodon 1.10 | 4.3 | 12.0% | 10 |
| jok.PheonixM 0.1.2 | 4.6 | 11.3% | 16 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.1% | 1 |
| DBall.Anarchy 0.1 | 7.4 | 6.0% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 7.6 | 5.9% | 0 |
| ap.Frederick 1.1 | 9.0 | 4.7% | 2 |
| jangs.ns51 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 89.2 | 17 / 35 | 4361 |
| 2 | 1 | 69.3 | 88.3 | 22 / 35 | 4545 |
| 3 | 2 | 66.2 | 83.5 | 13 / 35 | 3533 |
| 4 | 1 | 66.7 | 81.9 | 13 / 35 | 4252 |
| 5 | 1 | 66.5 | 81.9 | 16 / 35 | 4045 |
| 6 | 1 | 65.7 | 81.0 | 11 / 35 | 3917 |
| 7 | 1 | 68.6 | 87.9 | 15 / 35 | 4610 |
| 8 | 2 | 66.1 | 83.5 | 10 / 35 | 3810 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 66 | 64% |
| zyx.mega.YersiniaPestis 3.1 | 51 | 39% |
| myl.micro.Troodon 1.10 | 28 | 96% |
| jok.PheonixM 0.1.2 | 19 | 84% |
| DBall.Anarchy 0.1 | 5 | 100% |
| ph.melee.ArcherME 0.3 | 4 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 167 of 280 rounds, at a mean tick of 943. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 59 | 35% | 103 |
| zyx.mega.YersiniaPestis 3.1 | 59 | 35% | 84 |
| myl.micro.Troodon 1.10 | 23 | 14% | 38 |
| jok.PheonixM 0.1.2 | 20 | 12% | 35 |
| jangs.ns51 1.0 | 2 | 1% | 2 |
| ph.melee.ArcherME 0.3 | 1 | 1% | 9 |
| DBall.Anarchy 0.1 | 1 | 1% | 7 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 269 rounds): 222160 melee ticks, 55427 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (269 rounds): longest scan gap while four or more were alive 34 ticks (269 rounds over 8); rounds whose longest gap at any count was over 8: 269; robots dropped as dead without a death event: 0.

Targeting waves (269 rounds): 73188 sent, 67275 reached their opponent, 11430 virtual hits (17.0% of those reached).

## Melee bench: F30

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 998 over 8 battles (124.8 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 73.7 | 53 / 280 | 3.37 | 14.3% | 28059 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 2.0 | 14.3% | 53 |
| catcat20.Matcha 0.006 | 2.1 | 14.3% | 69 |
| darkcanuck.B26354 1.06 | 2.6 | 13.6% | 64 |
| stelo.PastFuture 2.3.2 | 3.8 | 12.4% | 32 |
| oog.melee.Capulet 1.2 | 4.5 | 12.1% | 37 |
| intruder.PrairieWolf 2.61 | 6.3 | 8.9% | 11 |
| tripphippy.Alice 1.1 | 7.5 | 7.5% | 10 |
| fowl3628800.LightningBolt 2.6.0 | 7.9 | 7.2% | 4 |
| ntc.Opposite 1.5 | 8.4 | 7.2% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.7 | 74.3 | 7 / 35 | 3364 |
| 2 | 2 | 62.7 | 76.8 | 5 / 35 | 3764 |
| 3 | 1 | 61.4 | 73.3 | 8 / 35 | 3341 |
| 4 | 1 | 60.8 | 70.8 | 6 / 35 | 3617 |
| 5 | 2 | 63.3 | 76.2 | 8 / 35 | 3813 |
| 6 | 1 | 61.9 | 75.9 | 5 / 35 | 3509 |
| 7 | 1 | 61.8 | 75.2 | 9 / 35 | 3357 |
| 8 | 5 | 59.4 | 67.0 | 5 / 35 | 3294 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 34 | 35% |
| darkcanuck.B26354 1.06 | 28 | 36% |
| oog.melee.Capulet 1.2 | 21 | 43% |
| stelo.PastFuture 2.3.2 | 16 | 44% |
| tripphippy.Alice 1.1 | 8 | 63% |
| intruder.PrairieWolf 2.61 | 7 | 57% |
| fowl3628800.LightningBolt 2.6.0 | 6 | 83% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 235 of 280 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 59 | 25% | 74 |
| catcat20.Matcha 0.006 | 55 | 23% | 70 |
| stelo.PastFuture 2.3.2 | 36 | 15% | 44 |
| oog.melee.Capulet 1.2 | 34 | 14% | 43 |
| intruder.PrairieWolf 2.61 | 14 | 6% | 16 |
| tripphippy.Alice 1.1 | 13 | 6% | 16 |
| ntc.Opposite 1.5 | 9 | 4% | 10 |
| fowl3628800.LightningBolt 2.6.0 | 7 | 3% | 7 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 277 rounds): 213481 melee ticks, 33228 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 60 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (277 rounds): longest scan gap while four or more were alive 60 ticks (277 rounds over 8); rounds whose longest gap at any count was over 8: 277; robots dropped as dead without a death event: 0.

Targeting waves (277 rounds): 70483 sent, 64327 reached their opponent, 11206 virtual hits (17.4% of those reached).

## Melee bench: F31

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 463 over 8 battles (57.9 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 77.8 | 74 / 280 | 3.00 | 14.9% | 25071 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.1 | 17.9% | 127 |
| hadur2.Hadur 3.17.1bb | 1.9 | 14.9% | 74 |
| gh.mini.Griezel 0.2 | 3.4 | 13.1% | 57 |
| d414.nano.Quantum 1.0.0 | 4.1 | 11.5% | 8 |
| spinnercat.micro.Tyger 0.1 | 4.6 | 10.7% | 7 |
| gh.nano.Grofvuil 0.2 | 5.9 | 8.2% | 3 |
| timmit.nano.TimDog 0.33 | 7.0 | 7.3% | 4 |
| fm.mammillarias 1.3 | 8.4 | 6.0% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.9 | 5.4% | 0 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.0 | 79.0 | 11 / 35 | 3048 |
| 2 | 2 | 65.0 | 83.2 | 14 / 35 | 3386 |
| 3 | 2 | 61.1 | 74.0 | 6 / 35 | 2889 |
| 4 | 1 | 65.1 | 83.5 | 12 / 35 | 3537 |
| 5 | 2 | 62.9 | 79.0 | 9 / 35 | 3108 |
| 6 | 2 | 61.5 | 72.1 | 9 / 35 | 2989 |
| 7 | 2 | 61.5 | 76.2 | 6 / 35 | 2967 |
| 8 | 2 | 62.2 | 75.6 | 7 / 35 | 3147 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 62 | 42% |
| gh.mini.Griezel 0.2 | 46 | 43% |
| spinnercat.micro.Tyger 0.1 | 13 | 77% |
| d414.nano.Quantum 1.0.0 | 12 | 100% |
| timmit.nano.TimDog 0.33 | 4 | 75% |
| gh.nano.Grofvuil 0.2 | 1 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 211 of 280 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 81 | 38% | 105 |
| gh.mini.Griezel 0.2 | 51 | 24% | 77 |
| spinnercat.micro.Tyger 0.1 | 25 | 12% | 35 |
| d414.nano.Quantum 1.0.0 | 20 | 9% | 27 |
| gh.nano.Grofvuil 0.2 | 11 | 5% | 13 |
| timmit.nano.TimDog 0.33 | 9 | 4% | 13 |
| fm.mammillarias 1.3 | 6 | 3% | 6 |
| tlp.ThreeLeggedPig 1 | 3 | 1% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 205162 melee ticks, 42635 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 49 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 0.

Targeting waves (272 rounds): 68153 sent, 61954 reached their opponent, 10575 virtual hits (17.1% of those reached).

## Melee bench: F32

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 164 over 8 battles (20.5 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 86.8 | 149 / 280 | 2.19 | 17.5% | 32025 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.5% | 149 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.1% | 71 |
| apc.botM 3.0 | 3.4 | 12.2% | 26 |
| lxx.ConceptA 0.8 | 4.3 | 10.6% | 5 |
| vjik.UnViolation 1.1 | 5.0 | 9.6% | 11 |
| bayen.UbaMicro 1.4 | 5.5 | 9.1% | 9 |
| panzer.Panzer 0.2 | 7.3 | 7.8% | 2 |
| yk.JahMicro 1.0 | 8.3 | 6.4% | 4 |
| conscience.Electron 1.3g | 8.5 | 6.3% | 1 |
| donjezza.Jezza 1.0 | 9.9 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 87.3 | 20 / 35 | 4005 |
| 2 | 1 | 67.6 | 91.7 | 22 / 35 | 3785 |
| 3 | 1 | 65.4 | 85.4 | 16 / 35 | 3653 |
| 4 | 1 | 67.4 | 87.3 | 19 / 35 | 4445 |
| 5 | 1 | 65.0 | 84.8 | 15 / 35 | 3627 |
| 6 | 1 | 66.7 | 85.4 | 21 / 35 | 4262 |
| 7 | 1 | 66.2 | 85.4 | 17 / 35 | 4070 |
| 8 | 1 | 66.6 | 87.3 | 19 / 35 | 4178 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 93 | 59% |
| apc.botM 3.0 | 42 | 81% |
| vjik.UnViolation 1.1 | 22 | 73% |
| lxx.ConceptA 0.8 | 19 | 95% |
| bayen.UbaMicro 1.4 | 11 | 82% |
| donjezza.Jezza 1.0 | 8 | 100% |
| panzer.Panzer 0.2 | 7 | 71% |
| yk.JahMicro 1.0 | 4 | 75% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 132 of 280 rounds, at a mean tick of 726. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 56 | 42% | 113 |
| lxx.ConceptA 0.8 | 23 | 17% | 39 |
| apc.botM 3.0 | 18 | 14% | 50 |
| vjik.UnViolation 1.1 | 11 | 8% | 27 |
| bayen.UbaMicro 1.4 | 11 | 8% | 20 |
| panzer.Panzer 0.2 | 10 | 8% | 13 |
| yk.JahMicro 1.0 | 2 | 2% | 6 |
| conscience.Electron 1.3g | 1 | 1% | 5 |
| donjezza.Jezza 1.0 | 0 | 0% | 7 |

Posture (Hadur's M records, 266 rounds): 164757 melee ticks, 57194 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (266 rounds): longest scan gap while four or more were alive 71 ticks (266 rounds over 8); rounds whose longest gap at any count was over 8: 266; robots dropped as dead without a death event: 0.

Targeting waves (266 rounds): 57068 sent, 51229 reached their opponent, 9888 virtual hits (19.3% of those reached).

## Melee bench: F33

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 233 over 8 battles (29.1 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 85.0 | 140 / 280 | 2.35 | 17.9% | 34540 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.3 | 17.9% | 140 |
| maribo.Quester 0.3 | 1.8 | 16.5% | 67 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 13.1% | 29 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 11.2% | 19 |
| labg.Cataclysm 2.05 | 4.5 | 10.7% | 22 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.3 | 8.4% | 2 |
| baal.nano.N 1.42 | 6.8 | 8.3% | 1 |
| zyx.micro.Ant 1.1 | 8.4 | 5.6% | 0 |
| sanja.First 0.1 | 8.8 | 4.7% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.9 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 85.4 | 19 / 35 | 4313 |
| 2 | 1 | 68.8 | 89.2 | 21 / 35 | 4344 |
| 3 | 2 | 66.3 | 83.5 | 15 / 35 | 3787 |
| 4 | 1 | 66.9 | 81.6 | 18 / 35 | 4390 |
| 5 | 1 | 68.7 | 86.0 | 18 / 35 | 4799 |
| 6 | 2 | 65.1 | 78.1 | 12 / 35 | 3940 |
| 7 | 1 | 68.7 | 88.6 | 17 / 35 | 4641 |
| 8 | 1 | 68.6 | 87.9 | 20 / 35 | 4326 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 85 | 78% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 45 | 73% |
| gre.svman4.Leonidas 1.3.2 | 24 | 92% |
| labg.Cataclysm 2.05 | 20 | 55% |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 100% |
| baal.nano.N 1.42 | 3 | 67% |

Hadur died in 143 of 280 rounds, at a mean tick of 991. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 57 | 40% | 124 |
| gre.svman4.Leonidas 1.3.2 | 26 | 18% | 40 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 17% | 58 |
| labg.Cataclysm 2.05 | 16 | 11% | 26 |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 6% | 16 |
| baal.nano.N 1.42 | 6 | 4% | 11 |
| zyx.micro.Ant 1.1 | 3 | 2% | 4 |
| sanja.First 0.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 233408 melee ticks, 60592 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 48 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 0.

Targeting waves (272 rounds): 74696 sent, 68707 reached their opponent, 10701 virtual hits (15.6% of those reached).

## Melee bench: F34

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 693 over 8 battles (86.6 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 85.1 | 104 / 280 | 2.34 | 17.2% | 35398 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.6 | 17.2% | 104 |
| kid.Gladiator .7.2 | 2.1 | 16.6% | 60 |
| stelo.Spread 0.9 | 2.3 | 16.5% | 89 |
| jcs.Seth 1.8 | 4.4 | 11.1% | 22 |
| tcf.Reach 3 | 5.1 | 10.3% | 4 |
| cli.Dancer 1.1 | 5.5 | 9.7% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.0% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.5% | 0 |
| sample.RamFire 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.4 | 89.8 | 13 / 35 | 4282 |
| 2 | 2 | 67.7 | 85.4 | 12 / 35 | 4566 |
| 3 | 2 | 67.5 | 84.8 | 14 / 35 | 4543 |
| 4 | 1 | 67.1 | 84.1 | 13 / 35 | 4495 |
| 5 | 2 | 65.6 | 81.9 | 8 / 35 | 4255 |
| 6 | 1 | 67.7 | 83.5 | 17 / 35 | 4493 |
| 7 | 1 | 67.7 | 87.0 | 13 / 35 | 4577 |
| 8 | 2 | 67.0 | 84.4 | 14 / 35 | 4187 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 92 | 54% |
| kid.Gladiator .7.2 | 56 | 45% |
| jcs.Seth 1.8 | 16 | 44% |
| tcf.Reach 3 | 13 | 100% |
| cli.Dancer 1.1 | 4 | 75% |
| ratosh.Wesco 1.4 | 3 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |

Hadur died in 181 of 280 rounds, at a mean tick of 1057. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 74 | 41% | 93 |
| stelo.Spread 0.9 | 61 | 34% | 112 |
| jcs.Seth 1.8 | 20 | 11% | 30 |
| tcf.Reach 3 | 11 | 6% | 24 |
| cli.Dancer 1.1 | 4 | 2% | 10 |
| ratosh.Wesco 1.4 | 3 | 2% | 4 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |
| sample.VelociRobot 1.0 | 1 | 1% | 5 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 227979 melee ticks, 74078 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 38 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 0.

Targeting waves (275 rounds): 72120 sent, 66111 reached their opponent, 11744 virtual hits (17.8% of those reached).

## Melee bench: F35

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 9 other Robocode JVMs running (hadur.bench.MeleeRunner x9), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 115 over 8 battles (14.4 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 80.3 | 45 / 280 | 2.78 | 14.9% | 25592 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.8% | 196 |
| hadur2.Hadur 3.17.1bb | 2.0 | 14.9% | 45 |
| gh.mini.Gruwel 0.9 | 3.1 | 13.3% | 20 |
| rz.HawkOnFire 0.1 | 4.1 | 12.0% | 9 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.8 | 11.3% | 9 |
| wit.Chuliath 1.0 | 6.8 | 6.7% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.1 | 6.1% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.0 | 6.0% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 4.8% | 0 |
| dans.Cinnamon 1.2 | 9.1 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 74.3 | 5 / 35 | 3170 |
| 2 | 2 | 65.1 | 85.1 | 8 / 35 | 3214 |
| 3 | 2 | 62.4 | 78.7 | 5 / 35 | 2872 |
| 4 | 2 | 63.2 | 79.7 | 5 / 35 | 3414 |
| 5 | 2 | 63.5 | 78.4 | 8 / 35 | 3289 |
| 6 | 2 | 63.0 | 80.0 | 4 / 35 | 3035 |
| 7 | 2 | 64.8 | 84.4 | 4 / 35 | 3598 |
| 8 | 2 | 63.3 | 81.6 | 6 / 35 | 3000 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 108 | 18% |
| gh.mini.Gruwel 0.9 | 19 | 47% |
| rz.HawkOnFire 0.1 | 14 | 57% |
| dmh.robocode.robot.BlackDeath 9.2 | 13 | 62% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |
| wit.Chuliath 1.0 | 1 | 0% |

Hadur died in 236 of 280 rounds, at a mean tick of 908. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 127 | 54% | 150 |
| gh.mini.Gruwel 0.9 | 44 | 19% | 54 |
| rz.HawkOnFire 0.1 | 30 | 13% | 34 |
| dmh.robocode.robot.BlackDeath 9.2 | 23 | 10% | 30 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 5 | 2% | 5 |
| stelo.MyAgileRobot 0.2 | 3 | 1% | 3 |
| wit.Chuliath 1.0 | 2 | 1% | 3 |
| dans.Cinnamon 1.2 | 1 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 270 rounds): 194214 melee ticks, 52662 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (270 rounds): longest scan gap while four or more were alive 40 ticks (270 rounds over 8); rounds whose longest gap at any count was over 8: 270; robots dropped as dead without a death event: 0.

Targeting waves (270 rounds): 61056 sent, 55057 reached their opponent, 8970 virtual hits (16.3% of those reached).

## Melee bench: F36

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 171 over 8 battles (21.4 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 91.6 | 196 / 280 | 1.75 | 19.8% | 37981 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.8% | 196 |
| alpha.RainingFire 1.0 | 3.4 | 11.7% | 18 |
| bzdp.Pansy 2.1 | 3.5 | 12.0% | 18 |
| mz.Cork 0.1 | 3.6 | 11.3% | 16 |
| bvh.micro.Freya 0.3 | 4.3 | 10.6% | 12 |
| m3thos.Eva02 0.7.1 | 5.8 | 9.9% | 13 |
| bvh.mini.Fenrir 0.39 | 6.5 | 9.6% | 5 |
| squidM.TentalceMeleeNano 1.1 | 8.4 | 5.6% | 1 |
| dl.BetterWalls 1.0 | 8.8 | 5.5% | 1 |
| sample.MyFirstRobot 1.0 | 9.9 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.9 | 23 / 35 | 4555 |
| 2 | 1 | 70.2 | 93.7 | 25 / 35 | 4841 |
| 3 | 1 | 70.1 | 92.4 | 27 / 35 | 4788 |
| 4 | 1 | 70.2 | 94.9 | 25 / 35 | 4748 |
| 5 | 1 | 70.1 | 90.8 | 27 / 35 | 5011 |
| 6 | 1 | 67.6 | 86.7 | 18 / 35 | 4589 |
| 7 | 1 | 69.2 | 92.1 | 23 / 35 | 4398 |
| 8 | 1 | 71.2 | 94.6 | 28 / 35 | 5051 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 53 | 85% |
| mz.Cork 0.1 | 46 | 87% |
| bvh.micro.Freya 0.3 | 42 | 90% |
| alpha.RainingFire 1.0 | 31 | 90% |
| m3thos.Eva02 0.7.1 | 26 | 85% |
| bvh.mini.Fenrir 0.39 | 22 | 91% |
| sample.MyFirstRobot 1.0 | 2 | 100% |
| dl.BetterWalls 1.0 | 2 | 50% |

Hadur died in 86 of 280 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 18 | 21% | 58 |
| alpha.RainingFire 1.0 | 17 | 20% | 44 |
| bvh.micro.Freya 0.3 | 15 | 17% | 43 |
| mz.Cork 0.1 | 13 | 15% | 54 |
| bvh.mini.Fenrir 0.39 | 11 | 13% | 28 |
| m3thos.Eva02 0.7.1 | 7 | 8% | 29 |
| dl.BetterWalls 1.0 | 2 | 2% | 12 |
| squidM.TentalceMeleeNano 1.1 | 2 | 2% | 4 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 7 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 269 rounds): 196133 melee ticks, 56828 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 52 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (269 rounds): longest scan gap while four or more were alive 52 ticks (269 rounds over 8); rounds whose longest gap at any count was over 8: 269; robots dropped as dead without a death event: 0.

Targeting waves (269 rounds): 68542 sent, 62732 reached their opponent, 13811 virtual hits (22.0% of those reached).

## Melee bench: F37

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 184 over 8 battles (23.0 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 87.3 | 206 / 280 | 2.14 | 18.7% | 41325 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.7% | 206 |
| EBBU.Sim2 1.02 | 4.1 | 9.7% | 6 |
| germ.TheMind .2 | 4.1 | 10.1% | 10 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.4 | 9.8% | 9 |
| agrach.Dalek 1.0 | 4.8 | 9.7% | 20 |
| lmk.ACPFinal 0.1 | 6.1 | 8.9% | 6 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.9% | 12 |
| mb.Beast 0.1 | 7.1 | 8.5% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 8.0 | 7.8% | 1 |
| skm.Ryubot 1.0 | 8.6 | 7.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 83.5 | 21 / 35 | 5332 |
| 2 | 1 | 70.3 | 96.2 | 29 / 35 | 5596 |
| 3 | 1 | 67.8 | 88.9 | 25 / 35 | 5335 |
| 4 | 1 | 68.4 | 90.5 | 27 / 35 | 5289 |
| 5 | 1 | 67.2 | 85.7 | 26 / 35 | 4954 |
| 6 | 1 | 66.9 | 86.0 | 26 / 35 | 4895 |
| 7 | 1 | 67.3 | 85.4 | 29 / 35 | 4962 |
| 8 | 1 | 66.0 | 82.2 | 23 / 35 | 4962 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 37 | 95% |
| skm.Ryubot 1.0 | 30 | 97% |
| com.syncleus.robocode.Dreadnaught 0.1 | 29 | 93% |
| mb.Beast 0.1 | 28 | 100% |
| stelo.UntouchableNano 1.3 | 25 | 76% |
| germ.TheMind .2 | 24 | 96% |
| EBBU.Sim2 1.02 | 22 | 100% |
| lmk.ACPFinal 0.1 | 21 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 74 of 280 rounds, at a mean tick of 411. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 19 | 26% | 24 |
| stelo.UntouchableNano 1.3 | 10 | 14% | 30 |
| agrach.Dalek 1.0 | 9 | 12% | 55 |
| com.syncleus.robocode.Dreadnaught 0.1 | 8 | 11% | 35 |
| mb.Beast 0.1 | 7 | 9% | 30 |
| germ.TheMind .2 | 7 | 9% | 25 |
| lmk.ACPFinal 0.1 | 6 | 8% | 35 |
| EBBU.Sim2 1.02 | 6 | 8% | 32 |
| skm.Ryubot 1.0 | 2 | 3% | 12 |

Posture (Hadur's M records, 265 rounds): 130004 melee ticks, 31244 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (265 rounds): longest scan gap while four or more were alive 31 ticks (265 rounds over 8); rounds whose longest gap at any count was over 8: 265; robots dropped as dead without a death event: 0.

Targeting waves (265 rounds): 43719 sent, 38329 reached their opponent, 11989 virtual hits (31.3% of those reached).

## Melee bench: F38

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 611 over 8 battles (76.4 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 83.6 | 122 / 280 | 2.48 | 16.7% | 31033 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.3 | 16.7% | 122 |
| justin.Mallais 14.0 | 1.8 | 15.7% | 78 |
| bvh.mini.Freya 0.55 | 3.1 | 13.5% | 30 |
| bts.mega.Gnarly 1.4 | 4.5 | 11.5% | 24 |
| cs.Wren 1.0 | 4.8 | 11.1% | 10 |
| kdf.KoulDestroyer 1.0 | 5.9 | 9.8% | 10 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.8 | 8.9% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.4 | 5.1% | 1 |
| matt.UnderDark3 2.4.34 | 8.9 | 4.3% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 74.6 | 9 / 35 | 3324 |
| 2 | 1 | 66.4 | 85.1 | 16 / 35 | 3981 |
| 3 | 1 | 65.7 | 84.4 | 17 / 35 | 3724 |
| 4 | 1 | 67.5 | 87.3 | 19 / 35 | 4070 |
| 5 | 2 | 66.0 | 81.9 | 14 / 35 | 3944 |
| 6 | 1 | 65.9 | 84.4 | 14 / 35 | 3928 |
| 7 | 1 | 67.7 | 88.3 | 19 / 35 | 4080 |
| 8 | 1 | 65.8 | 82.5 | 14 / 35 | 3982 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 77 | 62% |
| bvh.mini.Freya 0.55 | 31 | 65% |
| bts.mega.Gnarly 1.4 | 29 | 66% |
| cs.Wren 1.0 | 21 | 90% |
| kdf.KoulDestroyer 1.0 | 15 | 73% |
| davidalves.net.DuelistNanoMelee 1.01 | 6 | 83% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 0% |

Hadur died in 163 of 280 rounds, at a mean tick of 748. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 57 | 35% | 108 |
| bvh.mini.Freya 0.55 | 36 | 22% | 45 |
| bts.mega.Gnarly 1.4 | 21 | 13% | 39 |
| kdf.KoulDestroyer 1.0 | 19 | 12% | 26 |
| cs.Wren 1.0 | 15 | 9% | 34 |
| davidalves.net.DuelistNanoMelee 1.01 | 7 | 4% | 20 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 2% | 5 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 185049 melee ticks, 46529 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 65 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 61673 sent, 55393 reached their opponent, 12482 virtual hits (22.5% of those reached).

## Melee bench: F39

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 820 over 8 battles (102.5 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 85.3 | 117 / 280 | 2.33 | 17.4% | 35366 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.4% | 117 |
| bvh.fry.Freya 0.82 | 2.1 | 14.3% | 32 |
| az.Ololobot 0.2.4 | 3.0 | 13.2% | 73 |
| catcat20.Lambda 0.024 | 3.9 | 11.8% | 45 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.4% | 2 |
| gimp.GimpBot 0.1 | 6.1 | 8.1% | 3 |
| stelo.SoRobotNanoMelee 1.2 | 6.9 | 7.8% | 5 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 7.9% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.3 | 5.8% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 89.2 | 18 / 35 | 4511 |
| 2 | 1 | 67.3 | 88.6 | 19 / 35 | 4368 |
| 3 | 1 | 66.5 | 87.0 | 12 / 35 | 4430 |
| 4 | 1 | 68.4 | 89.5 | 17 / 35 | 4969 |
| 5 | 1 | 62.9 | 77.1 | 10 / 35 | 4124 |
| 6 | 1 | 67.4 | 88.3 | 18 / 35 | 4436 |
| 7 | 1 | 64.0 | 76.8 | 11 / 35 | 4336 |
| 8 | 1 | 65.7 | 85.7 | 12 / 35 | 4192 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 73 | 48% |
| bvh.fry.Freya 0.82 | 48 | 85% |
| catcat20.Lambda 0.024 | 47 | 40% |
| gimp.GimpBot 0.1 | 9 | 89% |
| winamp32.micro.MicroMacro 1.0 | 7 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 6 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 170 of 280 rounds, at a mean tick of 1058. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 49 | 29% | 86 |
| catcat20.Lambda 0.024 | 46 | 27% | 64 |
| bvh.fry.Freya 0.82 | 40 | 24% | 72 |
| stelo.SoRobotNanoMelee 1.2 | 10 | 6% | 16 |
| apollokidd.ApolloKidd 0.9 | 10 | 6% | 13 |
| gimp.GimpBot 0.1 | 4 | 2% | 14 |
| winamp32.micro.MicroMacro 1.0 | 3 | 2% | 11 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 1% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 271 rounds): 221079 melee ticks, 72563 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (271 rounds): longest scan gap while four or more were alive 63 ticks (271 rounds over 8); rounds whose longest gap at any count was over 8: 271; robots dropped as dead without a death event: 1.

Targeting waves (271 rounds): 70959 sent, 64960 reached their opponent, 12151 virtual hits (18.7% of those reached).

## Melee bench: F40

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 352 over 8 battles (44.0 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.2 | 147 / 280 | 2.24 | 18.1% | 34695 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.1% | 147 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.9% | 51 |
| kano.gamma.KanoGamma 1.8 | 3.1 | 12.5% | 35 |
| Polkwane.SmashMelee 1.0 | 4.8 | 10.9% | 15 |
| mz.AntiGrav 1.0 | 4.9 | 10.6% | 12 |
| stelo.Randomness 1.0 | 6.0 | 9.3% | 8 |
| alpha.BlackIce 1.0 | 6.5 | 9.2% | 9 |
| amk.superstrike.SuperStrike 0.3 | 7.8 | 6.7% | 3 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 4.6% | 0 |
| sample.Corners 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 85.4 | 19 / 35 | 4791 |
| 2 | 1 | 67.5 | 85.1 | 16 / 35 | 4369 |
| 3 | 1 | 66.0 | 81.0 | 15 / 35 | 4115 |
| 4 | 1 | 68.4 | 87.9 | 21 / 35 | 4335 |
| 5 | 1 | 68.3 | 87.0 | 19 / 35 | 4344 |
| 6 | 1 | 67.5 | 84.1 | 18 / 35 | 4422 |
| 7 | 1 | 68.4 | 89.2 | 21 / 35 | 4104 |
| 8 | 1 | 68.1 | 89.8 | 18 / 35 | 4215 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 73 | 75% |
| kano.gamma.KanoGamma 1.8 | 41 | 71% |
| mz.AntiGrav 1.0 | 28 | 93% |
| Polkwane.SmashMelee 1.0 | 23 | 87% |
| alpha.BlackIce 1.0 | 13 | 38% |
| stelo.Randomness 1.0 | 7 | 100% |
| amk.superstrike.SuperStrike 0.3 | 3 | 67% |
| testantiswapgun.AntiSwap 1.0 | 2 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 137 of 280 rounds, at a mean tick of 831. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 40 | 29% | 83 |
| kano.gamma.KanoGamma 1.8 | 27 | 20% | 63 |
| alpha.BlackIce 1.0 | 19 | 14% | 27 |
| Polkwane.SmashMelee 1.0 | 17 | 12% | 32 |
| mz.AntiGrav 1.0 | 15 | 11% | 38 |
| stelo.Randomness 1.0 | 12 | 9% | 25 |
| amk.superstrike.SuperStrike 0.3 | 5 | 4% | 8 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 3 |
| sample.Corners 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 269 rounds): 204134 melee ticks, 47431 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (269 rounds): longest scan gap while four or more were alive 48 ticks (269 rounds over 8); rounds whose longest gap at any count was over 8: 269; robots dropped as dead without a death event: 0.

Targeting waves (269 rounds): 67926 sent, 61831 reached their opponent, 13505 virtual hits (21.8% of those reached).

## Melee bench: F41

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 10 other Robocode JVMs running (hadur.bench.MeleeRunner x10), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 589 over 8 battles (73.6 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 86.3 | 124 / 280 | 2.23 | 17.2% | 30409 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.3 | 17.2% | 124 |
| eem.EvBotNG v12.8 | 1.8 | 16.3% | 100 |
| ary.Swarm 1.1 | 3.6 | 13.0% | 11 |
| lessonz.robocode.Oz 0.5.0 | 3.6 | 12.8% | 22 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 11.0% | 15 |
| shrub.Silver v048 | 6.0 | 9.2% | 3 |
| zyx.nano.Ant 1.1 | 7.0 | 7.3% | 1 |
| jsal.Jsalbot 1.0 | 8.4 | 5.8% | 3 |
| stelo.Mirror 1.1 | 8.6 | 5.5% | 2 |
| acogdev.alpha 0.2 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 82.5 | 12 / 35 | 3718 |
| 2 | 1 | 67.5 | 86.7 | 19 / 35 | 3810 |
| 3 | 1 | 67.9 | 89.5 | 13 / 35 | 4158 |
| 4 | 1 | 66.8 | 84.1 | 17 / 35 | 3581 |
| 5 | 1 | 67.7 | 90.2 | 19 / 35 | 3737 |
| 6 | 1 | 66.7 | 86.7 | 15 / 35 | 3498 |
| 7 | 2 | 66.6 | 85.1 | 14 / 35 | 3874 |
| 8 | 1 | 67.2 | 86.0 | 15 / 35 | 4033 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 99 | 44% |
| ary.Swarm 1.1 | 41 | 90% |
| lessonz.robocode.Oz 0.5.0 | 33 | 76% |
| simonton.nano.MeleeSeed 1.8 | 14 | 100% |
| shrub.Silver v048 | 3 | 67% |
| stelo.Mirror 1.1 | 3 | 33% |
| jsal.Jsalbot 1.0 | 2 | 50% |
| zyx.nano.Ant 1.1 | 1 | 0% |

Hadur died in 161 of 280 rounds, at a mean tick of 966. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 73 | 45% | 120 |
| lessonz.robocode.Oz 0.5.0 | 30 | 19% | 48 |
| ary.Swarm 1.1 | 28 | 17% | 56 |
| simonton.nano.MeleeSeed 1.8 | 11 | 7% | 27 |
| zyx.nano.Ant 1.1 | 7 | 4% | 7 |
| shrub.Silver v048 | 4 | 2% | 10 |
| jsal.Jsalbot 1.0 | 2 | 1% | 6 |
| stelo.Mirror 1.1 | 2 | 1% | 5 |
| acogdev.alpha 0.2 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 209428 melee ticks, 64984 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 48 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 0.

Targeting waves (273 rounds): 69867 sent, 63822 reached their opponent, 10683 virtual hits (16.7% of those reached).

## Melee bench: F42

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 465 over 8 battles (58.1 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 88.7 | 166 / 280 | 2.01 | 19.0% | 40981 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.0% | 166 |
| wompi.Wallaby 5.1 | 2.0 | 15.7% | 56 |
| maribo.mini.MiniQuester 0.1 | 3.1 | 13.7% | 21 |
| ara.Shera 0.88 | 3.9 | 13.2% | 33 |
| amz.NanoClone 1.41 | 5.3 | 8.4% | 1 |
| dsw.StaticD 1.0 | 6.3 | 7.1% | 3 |
| maribo.IotaCT 1.1 | 7.3 | 6.5% | 0 |
| mme.NikeEnhanced 2.0 | 8.4 | 5.6% | 1 |
| stelo.MirrorMicro 1.0 | 8.6 | 5.7% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 90.8 | 21 / 35 | 5211 |
| 2 | 1 | 69.8 | 90.8 | 24 / 35 | 5265 |
| 3 | 1 | 67.5 | 82.9 | 18 / 35 | 5005 |
| 4 | 1 | 69.5 | 89.8 | 22 / 35 | 5105 |
| 5 | 1 | 70.8 | 93.3 | 26 / 35 | 5512 |
| 6 | 1 | 69.4 | 88.6 | 22 / 35 | 5283 |
| 7 | 1 | 67.4 | 87.9 | 17 / 35 | 4428 |
| 8 | 1 | 68.1 | 85.7 | 16 / 35 | 5172 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 115 | 88% |
| maribo.mini.MiniQuester 0.1 | 39 | 85% |
| ara.Shera 0.88 | 31 | 65% |
| dsw.StaticD 1.0 | 9 | 89% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |

Hadur died in 118 of 280 rounds, at a mean tick of 917. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 41 | 35% | 123 |
| ara.Shera 0.88 | 40 | 34% | 68 |
| maribo.mini.MiniQuester 0.1 | 21 | 18% | 59 |
| amz.NanoClone 1.41 | 8 | 7% | 11 |
| dsw.StaticD 1.0 | 1 | 1% | 13 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 2 |
| maribo.IotaCT 1.1 | 1 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 269 rounds): 220960 melee ticks, 61676 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (269 rounds): longest scan gap while four or more were alive 59 ticks (269 rounds over 8); rounds whose longest gap at any count was over 8: 269; robots dropped as dead without a death event: 0.

Targeting waves (269 rounds): 70378 sent, 64552 reached their opponent, 13700 virtual hits (21.2% of those reached).

## Melee bench: F43

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 633 over 8 battles (79.1 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 77.7 | 32 / 280 | 3.00 | 14.6% | 26710 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.9% | 199 |
| hadur2.Hadur 3.17.1bb | 2.1 | 14.6% | 32 |
| brainfade.melee.Dusk 0.44 | 3.0 | 12.9% | 39 |
| wcsv.melee.EngineerMelee 0.1 | 4.6 | 11.1% | 3 |
| dummy.micro.Sparrow 2.5 | 4.8 | 11.3% | 5 |
| Krabb.akim2.Akim2 1.1b | 5.5 | 9.9% | 2 |
| mz.NanoGod 2.02 | 7.4 | 7.6% | 0 |
| jab.DiamondStealer 5 | 7.6 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.8% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 77.5 | 4 / 35 | 3688 |
| 2 | 2 | 64.2 | 78.7 | 4 / 35 | 3216 |
| 3 | 2 | 64.5 | 79.7 | 4 / 35 | 3317 |
| 4 | 2 | 63.4 | 75.9 | 5 / 35 | 3204 |
| 5 | 3 | 63.7 | 76.8 | 0 / 35 | 3355 |
| 6 | 2 | 64.0 | 77.5 | 5 / 35 | 3309 |
| 7 | 2 | 63.5 | 77.1 | 4 / 35 | 3364 |
| 8 | 2 | 64.2 | 78.7 | 6 / 35 | 3257 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 96 | 11% |
| brainfade.melee.Dusk 0.44 | 20 | 25% |
| dummy.micro.Sparrow 2.5 | 10 | 70% |
| wcsv.melee.EngineerMelee 0.1 | 5 | 100% |
| Krabb.akim2.Akim2 1.1b | 2 | 100% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 254 of 280 rounds, at a mean tick of 965. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 142 | 56% | 154 |
| brainfade.melee.Dusk 0.44 | 38 | 15% | 46 |
| dummy.micro.Sparrow 2.5 | 29 | 11% | 35 |
| wcsv.melee.EngineerMelee 0.1 | 24 | 9% | 26 |
| mz.NanoGod 2.02 | 11 | 4% | 12 |
| Krabb.akim2.Akim2 1.1b | 4 | 2% | 6 |
| jab.DiamondStealer 5 | 1 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 278 rounds): 214605 melee ticks, 57773 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (278 rounds): longest scan gap while four or more were alive 33 ticks (278 rounds over 8); rounds whose longest gap at any count was over 8: 278; robots dropped as dead without a death event: 0.

Targeting waves (278 rounds): 69747 sent, 63446 reached their opponent, 11222 virtual hits (17.7% of those reached).

## Melee bench: F44

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 384 over 8 battles (48.0 per battle, most in one battle 116). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.4 | 165 / 280 | 1.96 | 19.2% | 39647 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.2% | 165 |
| stelo.Liblix 0.3.1 | 2.1 | 15.8% | 69 |
| tzu.TheArtOfWar 1.2 | 2.9 | 14.5% | 33 |
| jwirde.Gort 2.0 | 4.1 | 10.2% | 8 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.1 | 9.2% | 1 |
| disan.Chair 2.2.0 | 6.6 | 7.6% | 1 |
| wompi.Quokka 1.6 | 6.8 | 7.7% | 1 |
| stf.PanzerGeneral 0.1 | 7.4 | 7.1% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.4% | 2 |
| sample.Crazy 1.0 | 9.5 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 94.9 | 23 / 35 | 5166 |
| 2 | 1 | 68.3 | 86.0 | 19 / 35 | 4745 |
| 3 | 1 | 68.3 | 86.7 | 20 / 35 | 4612 |
| 4 | 1 | 69.4 | 89.2 | 24 / 35 | 4865 |
| 5 | 1 | 69.1 | 88.9 | 17 / 35 | 4961 |
| 6 | 1 | 69.0 | 87.9 | 22 / 35 | 4854 |
| 7 | 1 | 71.1 | 95.6 | 26 / 35 | 5256 |
| 8 | 1 | 68.0 | 85.7 | 14 / 35 | 5188 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 104 | 63% |
| tzu.TheArtOfWar 1.2 | 78 | 82% |
| jwirde.Gort 2.0 | 20 | 90% |
| disan.Chair 2.2.0 | 7 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 100% |
| stf.PanzerGeneral 0.1 | 3 | 67% |
| wompi.Quokka 1.6 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 0% |

Hadur died in 120 of 280 rounds, at a mean tick of 933. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 50 | 42% | 131 |
| tzu.TheArtOfWar 1.2 | 29 | 24% | 80 |
| jwirde.Gort 2.0 | 12 | 10% | 31 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 10 | 8% | 16 |
| disan.Chair 2.2.0 | 5 | 4% | 6 |
| stf.PanzerGeneral 0.1 | 4 | 3% | 8 |
| wompi.Quokka 1.6 | 2 | 2% | 3 |
| amk.jointstrike.JointStrike 0.2 | 2 | 2% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 210063 melee ticks, 64094 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 33 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 73253 sent, 67294 reached their opponent, 15058 virtual hits (22.4% of those reached).

## Melee bench: F45

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 333 over 8 battles (41.6 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 86.9 | 123 / 280 | 2.18 | 18.7% | 39688 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.7% | 123 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 12.5% | 113 |
| jje.BagPuss 1.2 | 2.8 | 12.2% | 14 |
| sul.Lunar 1.1 | 4.3 | 10.8% | 12 |
| myl.nano.Graviton 1.10 | 4.8 | 10.6% | 4 |
| pez.mini.ChironexFleckeri 0.5 | 6.6 | 8.6% | 7 |
| fm.claire 1.7 | 6.8 | 8.7% | 0 |
| hvilela.HVilela 0.9 | 7.6 | 8.2% | 0 |
| wit.Deep7 2.0 | 9.1 | 5.5% | 7 |
| abud.ThirdRobo 1.0 | 9.9 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 85.4 | 12 / 35 | 5089 |
| 2 | 1 | 69.6 | 91.4 | 22 / 35 | 4813 |
| 3 | 1 | 69.0 | 87.0 | 19 / 35 | 5129 |
| 4 | 1 | 69.3 | 91.1 | 17 / 35 | 4979 |
| 5 | 1 | 63.2 | 75.2 | 6 / 35 | 4304 |
| 6 | 1 | 67.7 | 85.4 | 13 / 35 | 4969 |
| 7 | 1 | 69.1 | 88.9 | 18 / 35 | 5154 |
| 8 | 1 | 69.4 | 90.5 | 16 / 35 | 5251 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 110 | 45% |
| sul.Lunar 1.1 | 31 | 94% |
| jje.BagPuss 1.2 | 23 | 65% |
| myl.nano.Graviton 1.10 | 17 | 94% |
| pez.mini.ChironexFleckeri 0.5 | 7 | 71% |
| wit.Deep7 2.0 | 6 | 83% |
| fm.claire 1.7 | 2 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 159 of 280 rounds, at a mean tick of 1492. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 65 | 41% | 0 |
| jje.BagPuss 1.2 | 39 | 25% | 91 |
| sul.Lunar 1.1 | 15 | 9% | 67 |
| myl.nano.Graviton 1.10 | 13 | 8% | 45 |
| pez.mini.ChironexFleckeri 0.5 | 12 | 8% | 28 |
| fm.claire 1.7 | 7 | 4% | 16 |
| wit.Deep7 2.0 | 3 | 2% | 12 |
| hvilela.HVilela 0.9 | 2 | 1% | 13 |
| abud.ThirdRobo 1.0 | 1 | 1% | 7 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 276354 melee ticks, 124081 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 56 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 0.

Targeting waves (275 rounds): 85266 sent, 79273 reached their opponent, 12698 virtual hits (16.0% of those reached).

## Melee bench: F46

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 744 over 8 battles (93.0 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 81.4 | 69 / 280 | 2.67 | 15.7% | 30467 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.5 | 17.0% | 88 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.9% | 112 |
| hadur2.Hadur 3.17.1bb | 2.8 | 15.7% | 69 |
| mz.MicroSheep 1.0 | 4.3 | 10.3% | 2 |
| cx.Princess 1.0 | 5.1 | 9.7% | 6 |
| sadoner.killer 0.2 | 5.8 | 9.2% | 1 |
| arthord.NanoSatanMelee Beta | 6.9 | 7.4% | 2 |
| jeremyreeder.collective.Prophet 5 | 8.1 | 5.9% | 0 |
| kurios.DOSexe .9a | 8.9 | 5.0% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.7 | 80.6 | 6 / 35 | 4048 |
| 2 | 3 | 63.5 | 79.7 | 6 / 35 | 3642 |
| 3 | 2 | 65.8 | 84.1 | 12 / 35 | 3954 |
| 4 | 3 | 65.4 | 83.8 | 9 / 35 | 3836 |
| 5 | 2 | 65.9 | 84.8 | 9 / 35 | 4013 |
| 6 | 3 | 65.2 | 81.3 | 10 / 35 | 3843 |
| 7 | 3 | 62.1 | 75.9 | 8 / 35 | 3191 |
| 8 | 3 | 64.7 | 81.3 | 9 / 35 | 3940 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 81 | 57% |
| rsalesc.melee.Medina 0.4.5 | 48 | 23% |
| cx.Princess 1.0 | 9 | 78% |
| mz.MicroSheep 1.0 | 5 | 80% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 217 of 280 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 88 | 41% | 96 |
| kc.mini.Mirage 0.2 | 83 | 38% | 128 |
| sadoner.killer 0.2 | 13 | 6% | 14 |
| mz.MicroSheep 1.0 | 9 | 4% | 14 |
| cx.Princess 1.0 | 8 | 4% | 16 |
| arthord.NanoSatanMelee Beta | 7 | 3% | 8 |
| kurios.DOSexe .9a | 3 | 1% | 3 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 277 rounds): 205459 melee ticks, 52018 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (277 rounds): longest scan gap while four or more were alive 33 ticks (277 rounds over 8); rounds whose longest gap at any count was over 8: 277; robots dropped as dead without a death event: 0.

Targeting waves (277 rounds): 61394 sent, 55391 reached their opponent, 8882 virtual hits (16.0% of those reached).

