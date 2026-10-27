# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 352 over 8 battles (44.0 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 84.3 | 57 / 280 | 2.41 | 16.3% | 35370 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.4% | 198 |
| hadur2.Hadur 3.17.1aa | 2.0 | 16.3% | 57 |
| sgp.JollyNinja 3.53 | 3.4 | 11.6% | 16 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.4 | 10.7% | 0 |
| mz.MicroGodMelee 1 | 5.0 | 10.0% | 6 |
| lorneswork.Predator 1.0 | 5.6 | 9.6% | 3 |
| adt.Ar2 1.0 | 6.6 | 7.8% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.5 | 5.3% | 0 |
| skm.butterfly 1.0 | 8.5 | 5.0% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 84.8 | 8 / 35 | 4696 |
| 2 | 2 | 65.9 | 85.1 | 5 / 35 | 4692 |
| 3 | 2 | 65.1 | 81.3 | 6 / 35 | 4524 |
| 4 | 2 | 67.7 | 88.9 | 10 / 35 | 4868 |
| 5 | 2 | 66.1 | 86.7 | 8 / 35 | 4137 |
| 6 | 2 | 64.7 | 80.6 | 7 / 35 | 4136 |
| 7 | 2 | 65.9 | 84.1 | 8 / 35 | 4284 |
| 8 | 2 | 64.8 | 83.2 | 5 / 35 | 4033 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 163 | 10% |
| sgp.JollyNinja 3.53 | 24 | 67% |
| mz.MicroGodMelee 1 | 15 | 87% |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 100% |
| skm.butterfly 1.0 | 2 | 100% |
| lorneswork.Predator 1.0 | 2 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 225 of 280 rounds, at a mean tick of 1138. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 164 | 73% | 186 |
| sgp.JollyNinja 3.53 | 19 | 8% | 33 |
| lorneswork.Predator 1.0 | 17 | 8% | 18 |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 5% | 16 |
| mz.MicroGodMelee 1 | 7 | 3% | 17 |
| adt.Ar2 1.0 | 5 | 2% | 6 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 1 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |
| skm.butterfly 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 271 rounds): 193185 melee ticks, 110600 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (271 rounds): longest scan gap while four or more were alive 73 ticks (271 rounds over 8); rounds whose longest gap at any count was over 8: 271; robots dropped as dead without a death event: 0.

Targeting waves (271 rounds): 63085 sent, 57177 reached their opponent, 12329 virtual hits (21.6% of those reached).

## Melee bench: F02

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 276 over 8 battles (34.5 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 83.1 | 119 / 280 | 2.52 | 17.1% | 33431 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.1% | 119 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 13.9% | 38 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 13.9% | 56 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.9% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.6% | 28 |
| Noran.BitchingElk 0.054 | 6.6 | 8.2% | 20 |
| sch.Simone 0.3d | 7.0 | 8.0% | 15 |
| fnc.bandit.Bandit 5.2.0 | 7.4 | 7.5% | 1 |
| stelo.PatternRobot 1.0 | 9.1 | 5.8% | 2 |
| fullsail.SweetTea 1.1 | 9.9 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 84.4 | 13 / 35 | 4131 |
| 2 | 1 | 67.6 | 86.3 | 18 / 35 | 4252 |
| 3 | 1 | 65.7 | 82.2 | 15 / 35 | 3998 |
| 4 | 1 | 66.8 | 85.4 | 16 / 35 | 4208 |
| 5 | 1 | 64.5 | 77.1 | 13 / 35 | 4172 |
| 6 | 1 | 64.0 | 76.5 | 10 / 35 | 4181 |
| 7 | 1 | 67.4 | 88.3 | 17 / 35 | 4233 |
| 8 | 1 | 66.7 | 84.4 | 17 / 35 | 4256 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 62 | 56% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 57 | 65% |
| Noran.BitchingElk 0.054 | 27 | 44% |
| com.cohesiva.robocode.ManOwaR 1.0 | 24 | 54% |
| sch.Simone 0.3d | 13 | 69% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 89% |
| stelo.PatternRobot 1.0 | 3 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |

Hadur died in 164 of 280 rounds, at a mean tick of 974. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 45 | 27% | 78 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 34 | 21% | 71 |
| com.cohesiva.robocode.ManOwaR 1.0 | 23 | 14% | 42 |
| lrem.micro.SpikeSoldier 0.4 | 19 | 12% | 22 |
| Noran.BitchingElk 0.054 | 16 | 10% | 26 |
| sch.Simone 0.3d | 11 | 7% | 21 |
| fnc.bandit.Bandit 5.2.0 | 8 | 5% | 12 |
| stelo.PatternRobot 1.0 | 4 | 2% | 5 |
| fullsail.SweetTea 1.1 | 2 | 1% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 269 rounds): 226331 melee ticks, 55775 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (269 rounds): longest scan gap while four or more were alive 48 ticks (269 rounds over 8); rounds whose longest gap at any count was over 8: 269; robots dropped as dead without a death event: 0.

Targeting waves (269 rounds): 80919 sent, 74944 reached their opponent, 13542 virtual hits (18.1% of those reached).

## Melee bench: F03

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 178 over 8 battles (22.3 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 91.3 | 207 / 280 | 1.78 | 19.6% | 44113 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.6% | 207 |
| radnor.DoctorBob 1.42 | 2.1 | 14.6% | 36 |
| kawigi.nano.Lib 1.0 | 3.3 | 12.8% | 10 |
| vuen.Cake 2.51 | 3.6 | 12.7% | 21 |
| urdos.URDOS 1.3 | 5.0 | 9.4% | 1 |
| adt.Ar1 2.1 | 6.8 | 7.3% | 1 |
| oa.weak.FlyMk1 0.1 | 7.1 | 6.6% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 6.7% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.3 | 5.4% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.6 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 91.4 | 26 / 35 | 5611 |
| 2 | 1 | 70.0 | 93.0 | 26 / 35 | 5353 |
| 3 | 1 | 70.4 | 93.0 | 28 / 35 | 5918 |
| 4 | 1 | 70.7 | 95.6 | 28 / 35 | 5580 |
| 5 | 1 | 68.5 | 87.6 | 23 / 35 | 5406 |
| 6 | 1 | 69.1 | 92.1 | 23 / 35 | 5234 |
| 7 | 1 | 68.5 | 87.6 | 25 / 35 | 5490 |
| 8 | 1 | 69.9 | 90.5 | 28 / 35 | 5521 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 88 | 91% |
| radnor.DoctorBob 1.42 | 70 | 94% |
| kawigi.nano.Lib 1.0 | 44 | 100% |
| oa.weak.FlyMk1 0.1 | 8 | 88% |
| urdos.URDOS 1.3 | 7 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 74 of 280 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 32 | 43% | 90 |
| vuen.Cake 2.51 | 14 | 19% | 90 |
| kawigi.nano.Lib 1.0 | 12 | 16% | 56 |
| urdos.URDOS 1.3 | 5 | 7% | 14 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 7% | 6 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 3% | 5 |
| adt.Ar1 2.1 | 2 | 3% | 4 |
| oa.weak.FlyMk1 0.1 | 1 | 1% | 8 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 1% | 4 |

Posture (Hadur's M records, 265 rounds): 173285 melee ticks, 52232 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (265 rounds): longest scan gap while four or more were alive 48 ticks (265 rounds over 8); rounds whose longest gap at any count was over 8: 265; robots dropped as dead without a death event: 0.

Targeting waves (265 rounds): 53956 sent, 48220 reached their opponent, 12833 virtual hits (26.6% of those reached).

## Melee bench: F04

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 118 over 8 battles (14.8 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 84.2 | 26 / 280 | 2.42 | 16.4% | 37741 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.1% | 230 |
| hadur2.Hadur 3.17.1aa | 2.0 | 16.4% | 26 |
| apc.LeeroyJenkins2 1.0 | 3.1 | 13.1% | 8 |
| TNT.TNT 0.99.1 | 3.9 | 11.3% | 12 |
| josago.Jorgito 0.16 | 5.0 | 9.5% | 1 |
| css.Delitioner 0.11 | 6.0 | 7.6% | 2 |
| tj.zombie1n 1.0.1 | 7.4 | 6.0% | 0 |
| rampancy.Durandal 2.1d | 7.9 | 5.5% | 0 |
| spin.Bugstard 0.012b | 9.3 | 3.9% | 1 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 81.3 | 2 / 35 | 4514 |
| 2 | 2 | 65.9 | 82.9 | 1 / 35 | 4663 |
| 3 | 2 | 67.4 | 85.4 | 4 / 35 | 5017 |
| 4 | 2 | 66.9 | 84.8 | 4 / 35 | 4727 |
| 5 | 2 | 67.2 | 86.3 | 5 / 35 | 4704 |
| 6 | 2 | 67.6 | 86.3 | 4 / 35 | 5430 |
| 7 | 2 | 66.0 | 85.1 | 3 / 35 | 4235 |
| 8 | 2 | 65.7 | 81.9 | 3 / 35 | 4451 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 157 | 5% |
| TNT.TNT 0.99.1 | 12 | 42% |
| apc.LeeroyJenkins2 1.0 | 9 | 56% |
| josago.Jorgito 0.16 | 3 | 100% |
| tj.zombie1n 1.0.1 | 2 | 100% |
| spin.Bugstard 0.012b | 1 | 100% |
| rampancy.Durandal 2.1d | 1 | 100% |
| css.Delitioner 0.11 | 1 | 100% |

Hadur died in 254 of 280 rounds, at a mean tick of 1292. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 176 | 69% | 184 |
| apc.LeeroyJenkins2 1.0 | 38 | 15% | 45 |
| TNT.TNT 0.99.1 | 22 | 9% | 28 |
| josago.Jorgito 0.16 | 11 | 4% | 13 |
| css.Delitioner 0.11 | 4 | 2% | 6 |
| rampancy.Durandal 2.1d | 2 | 1% | 3 |
| tj.zombie1n 1.0.1 | 1 | 0% | 1 |

Posture (Hadur's M records, 267 rounds): 264506 melee ticks, 80485 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 93 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (267 rounds): longest scan gap while four or more were alive 93 ticks (267 rounds over 8); rounds whose longest gap at any count was over 8: 267; robots dropped as dead without a death event: 0.

Targeting waves (267 rounds): 81846 sent, 75881 reached their opponent, 11762 virtual hits (15.5% of those reached).

## Melee bench: F05

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 255 over 8 battles (31.9 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 75.4 | 33 / 280 | 3.21 | 14.0% | 25866 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.1 | 18.6% | 146 |
| justin.DemonicRage 3.4 | 1.9 | 16.9% | 68 |
| hadur2.Hadur 3.17.1aa | 3.1 | 14.0% | 33 |
| wompi.Numbat 2.1 | 3.9 | 13.1% | 23 |
| ms.Ares 0.19 | 5.3 | 9.0% | 1 |
| axeBots.HataMoto 3.09 | 5.8 | 8.7% | 9 |
| supersample.SuperBoxBot 1.0 | 7.4 | 5.8% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.6 | 5.6% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.3% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.7 | 71.1 | 2 / 35 | 2648 |
| 2 | 3 | 64.0 | 79.4 | 8 / 35 | 3580 |
| 3 | 3 | 64.1 | 78.7 | 7 / 35 | 3478 |
| 4 | 3 | 60.1 | 72.1 | 1 / 35 | 3052 |
| 5 | 3 | 61.6 | 74.0 | 4 / 35 | 3251 |
| 6 | 3 | 61.6 | 75.2 | 4 / 35 | 2981 |
| 7 | 3 | 62.7 | 76.5 | 4 / 35 | 3341 |
| 8 | 3 | 62.5 | 76.2 | 3 / 35 | 3535 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 43 | 5% |
| justin.DemonicRage 3.4 | 37 | 38% |
| wompi.Numbat 2.1 | 16 | 69% |
| axeBots.HataMoto 3.09 | 7 | 29% |
| ms.Ares 0.19 | 4 | 75% |
| supersample.SuperBoxBot 1.0 | 1 | 100% |

Hadur died in 248 of 280 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 89 | 36% | 93 |
| justin.DemonicRage 3.4 | 88 | 35% | 102 |
| wompi.Numbat 2.1 | 43 | 17% | 53 |
| axeBots.HataMoto 3.09 | 14 | 6% | 16 |
| ms.Ares 0.19 | 8 | 3% | 11 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 1% | 3 |
| supersample.SuperBoxBot 1.0 | 1 | 0% | 1 |
| GarmBox.Oranges 1.0 | 1 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 269 rounds): 200446 melee ticks, 40563 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 78 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (269 rounds): longest scan gap while four or more were alive 78 ticks (269 rounds over 8); rounds whose longest gap at any count was over 8: 269; robots dropped as dead without a death event: 0.

Targeting waves (269 rounds): 63209 sent, 57159 reached their opponent, 9961 virtual hits (17.4% of those reached).

## Melee bench: F06

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 384 over 8 battles (48.0 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 87.4 | 162 / 280 | 2.14 | 18.5% | 37363 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.5% | 162 |
| jekl.StoneGhost 0.7 | 2.1 | 14.8% | 33 |
| origin.SleepSiphon 1.7b | 3.0 | 13.7% | 55 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 11.9% | 16 |
| mld.Wisdom 1.0 | 4.9 | 10.3% | 2 |
| gg.Wolverine 2.0 | 6.1 | 8.6% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 7.1% | 9 |
| spinnercat.Omen 1.0 | 7.9 | 6.6% | 0 |
| DBall.NUKE 0.1 | 8.8 | 5.9% | 0 |
| sample.Fire 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 91.7 | 27 / 35 | 4854 |
| 2 | 1 | 67.5 | 85.1 | 18 / 35 | 4546 |
| 3 | 1 | 67.9 | 84.4 | 18 / 35 | 4690 |
| 4 | 1 | 68.4 | 87.6 | 21 / 35 | 4595 |
| 5 | 1 | 68.7 | 88.9 | 21 / 35 | 4628 |
| 6 | 1 | 68.5 | 85.7 | 21 / 35 | 4942 |
| 7 | 1 | 67.9 | 87.0 | 17 / 35 | 4497 |
| 8 | 1 | 68.7 | 88.6 | 19 / 35 | 4611 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 65 | 82% |
| origin.SleepSiphon 1.7b | 52 | 75% |
| pe.minimelee.SandboxMiniMelee 1.1 | 44 | 93% |
| gg.Wolverine 2.0 | 15 | 93% |
| ers.nano.hawk.HawkLA 3.0m | 8 | 50% |
| mld.Wisdom 1.0 | 7 | 86% |
| spinnercat.Omen 1.0 | 3 | 100% |
| DBall.NUKE 0.1 | 2 | 100% |

Hadur died in 124 of 280 rounds, at a mean tick of 846. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 38 | 31% | 88 |
| origin.SleepSiphon 1.7b | 36 | 29% | 83 |
| pe.minimelee.SandboxMiniMelee 1.1 | 18 | 15% | 50 |
| mld.Wisdom 1.0 | 10 | 8% | 23 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 6% | 11 |
| gg.Wolverine 2.0 | 6 | 5% | 16 |
| DBall.NUKE 0.1 | 2 | 2% | 5 |
| spinnercat.Omen 1.0 | 2 | 2% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 198126 melee ticks, 53822 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 49 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 0.

Targeting waves (272 rounds): 63028 sent, 57166 reached their opponent, 13847 virtual hits (24.2% of those reached).

## Melee bench: F07

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 429 over 8 battles (53.6 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 93.3 | 159 / 280 | 1.60 | 19.9% | 44685 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.9% | 159 |
| rsalesc.melee.Monk 0.3.6c | 2.1 | 17.3% | 67 |
| rtk.Tachikoma 1.0 | 2.9 | 16.2% | 34 |
| oog.melee.CapuletDroid 1.1 | 4.4 | 10.8% | 7 |
| franzor.Lizt 1.3.1 | 4.6 | 10.7% | 14 |
| lrem.micro.MoggFanatic 0.2 | 6.1 | 8.7% | 0 |
| exauge.GateKeeper 1.1.121g | 6.9 | 7.4% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.5% | 0 |
| sample.Target 1.0 | 9.3 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 93.7 | 19 / 35 | 5894 |
| 2 | 1 | 72.0 | 93.0 | 24 / 35 | 5882 |
| 3 | 1 | 71.7 | 94.3 | 21 / 35 | 5479 |
| 4 | 1 | 71.6 | 94.3 | 20 / 35 | 5626 |
| 5 | 1 | 71.0 | 91.7 | 19 / 35 | 5380 |
| 6 | 1 | 70.7 | 91.1 | 17 / 35 | 5447 |
| 7 | 1 | 71.5 | 94.6 | 19 / 35 | 5459 |
| 8 | 1 | 71.6 | 94.0 | 20 / 35 | 5518 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 105 | 75% |
| rsalesc.melee.Monk 0.3.6c | 80 | 35% |
| franzor.Lizt 1.3.1 | 41 | 76% |
| oog.melee.CapuletDroid 1.1 | 26 | 77% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 124 of 280 rounds, at a mean tick of 1459. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 63 | 51% | 110 |
| rtk.Tachikoma 1.0 | 36 | 29% | 125 |
| franzor.Lizt 1.3.1 | 10 | 8% | 0 |
| oog.melee.CapuletDroid 1.1 | 8 | 6% | 32 |
| exauge.GateKeeper 1.1.121g | 2 | 2% | 7 |
| lrem.micro.MoggFanatic 0.2 | 2 | 2% | 5 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 270 rounds): 245564 melee ticks, 136384 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (270 rounds): longest scan gap while four or more were alive 42 ticks (270 rounds over 8); rounds whose longest gap at any count was over 8: 270; robots dropped as dead without a death event: 0.

Targeting waves (270 rounds): 76103 sent, 70239 reached their opponent, 14821 virtual hits (21.1% of those reached).

## Melee bench: F08

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 637 over 8 battles (79.6 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 88.5 | 150 / 280 | 2.04 | 18.4% | 35801 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.4% | 150 |
| tm.Yuugao 1.0 | 2.5 | 13.4% | 46 |
| shrub.Vapour v159 | 2.6 | 12.9% | 41 |
| Krabb.sliNk.Garm 0.9u | 3.9 | 11.1% | 24 |
| com.spp.robocode.MostlyHarmless 010 | 5.1 | 9.8% | 12 |
| m3thos.Eva00 1.1 | 5.9 | 9.2% | 4 |
| jwst.DAD.DarkAndDarker 1.1 | 7.3 | 7.3% | 2 |
| qualidafial.MajorDick 1.0.1 | 7.9 | 6.8% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.4 | 5.5% | 0 |
| SHAM.WOW 1.4 | 9.5 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 88.6 | 19 / 35 | 4589 |
| 2 | 1 | 69.5 | 93.0 | 25 / 35 | 4696 |
| 3 | 1 | 67.3 | 85.4 | 17 / 35 | 4741 |
| 4 | 1 | 66.3 | 85.1 | 14 / 35 | 4213 |
| 5 | 1 | 69.0 | 92.4 | 23 / 35 | 4624 |
| 6 | 1 | 67.2 | 88.3 | 19 / 35 | 4201 |
| 7 | 1 | 66.8 | 87.6 | 16 / 35 | 4142 |
| 8 | 1 | 67.7 | 87.6 | 17 / 35 | 4595 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 67 | 60% |
| shrub.Vapour v159 | 63 | 63% |
| com.spp.robocode.MostlyHarmless 010 | 33 | 91% |
| Krabb.sliNk.Garm 0.9u | 32 | 69% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 8 | 100% |
| m3thos.Eva00 1.1 | 2 | 50% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 137 of 280 rounds, at a mean tick of 908. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 48 | 35% | 91 |
| shrub.Vapour v159 | 34 | 25% | 79 |
| Krabb.sliNk.Garm 0.9u | 23 | 17% | 39 |
| com.spp.robocode.MostlyHarmless 010 | 12 | 9% | 34 |
| m3thos.Eva00 1.1 | 12 | 9% | 18 |
| jwst.DAD.DarkAndDarker 1.1 | 3 | 2% | 12 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 3 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 206812 melee ticks, 57710 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 88 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 88 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 68021 sent, 62017 reached their opponent, 12165 virtual hits (19.6% of those reached).

## Melee bench: F09

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 347 over 8 battles (43.4 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 74.5 | 69 / 280 | 3.29 | 14.6% | 26320 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.6% | 136 |
| hadur2.Hadur 3.17.1aa | 2.4 | 14.6% | 69 |
| kc.micro.Figment 1.0 | 2.6 | 14.2% | 31 |
| yagami.Tidus 0.11 | 4.6 | 10.4% | 2 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.2% | 17 |
| mc2.enemy.Original 0.9 | 5.6 | 9.8% | 21 |
| dft.Calliope 5.6 | 7.0 | 7.9% | 4 |
| step.nanoPri 1.0 | 8.3 | 5.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 5.1% | 0 |
| rdm.Dueler 0.4x | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 74.6 | 8 / 35 | 3287 |
| 2 | 2 | 62.9 | 74.3 | 11 / 35 | 3500 |
| 3 | 2 | 62.0 | 74.0 | 9 / 35 | 3227 |
| 4 | 2 | 62.4 | 78.7 | 6 / 35 | 3128 |
| 5 | 3 | 63.1 | 78.7 | 8 / 35 | 3220 |
| 6 | 3 | 62.6 | 73.3 | 11 / 35 | 3307 |
| 7 | 3 | 60.9 | 70.2 | 8 / 35 | 3083 |
| 8 | 2 | 62.3 | 72.4 | 8 / 35 | 3568 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 63 | 17% |
| kc.micro.Figment 1.0 | 40 | 90% |
| pedersen.Grishnakh 1.0 | 12 | 50% |
| dft.Calliope 5.6 | 9 | 89% |
| mc2.enemy.Original 0.9 | 8 | 50% |
| yagami.Tidus 0.11 | 5 | 80% |

Hadur died in 214 of 280 rounds, at a mean tick of 837. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 80 | 37% | 98 |
| kc.micro.Figment 1.0 | 38 | 18% | 73 |
| yagami.Tidus 0.11 | 28 | 13% | 31 |
| mc2.enemy.Original 0.9 | 26 | 12% | 30 |
| pedersen.Grishnakh 1.0 | 20 | 9% | 21 |
| robar.nano.Assertive_Melee 0.2 | 8 | 4% | 8 |
| dft.Calliope 5.6 | 7 | 3% | 14 |
| step.nanoPri 1.0 | 4 | 2% | 4 |
| rdm.Dueler 0.4x | 1 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 202358 melee ticks, 45287 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 34 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 0.

Targeting waves (275 rounds): 67180 sent, 61295 reached their opponent, 9500 virtual hits (15.5% of those reached).

## Melee bench: F10

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 168 over 8 battles (21.0 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 94.3 | 207 / 280 | 1.51 | 19.9% | 41298 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.9% | 207 |
| DTF.Kludgy 1.2b | 2.6 | 13.7% | 28 |
| ne.Chimera 1.2 | 3.0 | 12.9% | 13 |
| ejb.Polaris 1.0.1 | 3.4 | 12.8% | 20 |
| vStar.RAFzilla 2.15 | 5.5 | 9.8% | 2 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.0% | 5 |
| kurios.DOSexe .9b | 7.5 | 5.8% | 2 |
| sam.Samspin 1.0 | 8.0 | 5.4% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.8 | 5.1% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 94.6 | 24 / 35 | 5247 |
| 2 | 1 | 71.4 | 97.8 | 28 / 35 | 5257 |
| 3 | 1 | 69.7 | 93.0 | 25 / 35 | 5124 |
| 4 | 1 | 69.8 | 92.4 | 26 / 35 | 5046 |
| 5 | 1 | 70.0 | 93.0 | 25 / 35 | 5217 |
| 6 | 1 | 71.4 | 98.7 | 31 / 35 | 5149 |
| 7 | 1 | 69.5 | 91.4 | 22 / 35 | 5194 |
| 8 | 1 | 69.9 | 93.7 | 26 / 35 | 5064 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ejb.Polaris 1.0.1 | 71 | 87% |
| DTF.Kludgy 1.2b | 67 | 78% |
| ne.Chimera 1.2 | 51 | 78% |
| tvv.micro.Antares 1.1.1 | 23 | 87% |
| vStar.RAFzilla 2.15 | 22 | 91% |
| kurios.DOSexe .9b | 7 | 86% |
| donjezza.Muncho 1.0 | 6 | 67% |
| sam.Samspin 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 73 of 280 rounds, at a mean tick of 977. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 23 | 32% | 76 |
| ne.Chimera 1.2 | 16 | 22% | 54 |
| ejb.Polaris 1.0.1 | 14 | 19% | 75 |
| tvv.micro.Antares 1.1.1 | 7 | 10% | 23 |
| vStar.RAFzilla 2.15 | 5 | 7% | 23 |
| kurios.DOSexe .9b | 4 | 5% | 15 |
| donjezza.Muncho 1.0 | 2 | 3% | 5 |
| sam.Samspin 1.0 | 1 | 1% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 1% | 2 |

Posture (Hadur's M records, 265 rounds): 195232 melee ticks, 73200 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (265 rounds): longest scan gap while four or more were alive 64 ticks (265 rounds over 8); rounds whose longest gap at any count was over 8: 265; robots dropped as dead without a death event: 0.

Targeting waves (265 rounds): 64852 sent, 59216 reached their opponent, 12313 virtual hits (20.8% of those reached).

## Melee bench: F11

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 9 other Robocode JVMs running (hadur.bench.MeleeRunner x9), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 167 over 8 battles (20.9 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 79.8 | 90 / 280 | 2.82 | 15.5% | 26627 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.3 | 16.5% | 90 |
| hadur2.Hadur 3.17.1aa | 2.0 | 15.5% | 90 |
| cx.mini.Nimrod 0.55 | 2.9 | 12.7% | 31 |
| djc.DynaBot 0.1.1 | 4.0 | 10.6% | 18 |
| rdt199.Warlord 0.73 | 5.6 | 9.5% | 21 |
| br2.MobyDickBot 1.6 | 5.9 | 8.8% | 15 |
| uji.YellohFellah 1.0 | 6.6 | 8.4% | 15 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.6% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.1 | 5.4% | 0 |
| stelo.MirrorNano 1.3 | 9.9 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 80.0 | 12 / 35 | 3224 |
| 2 | 3 | 61.7 | 76.2 | 8 / 35 | 3113 |
| 3 | 2 | 63.0 | 78.4 | 9 / 35 | 3293 |
| 4 | 2 | 63.1 | 79.4 | 10 / 35 | 3231 |
| 5 | 2 | 61.0 | 75.2 | 9 / 35 | 2992 |
| 6 | 2 | 65.5 | 86.3 | 14 / 35 | 3354 |
| 7 | 2 | 65.2 | 83.5 | 15 / 35 | 3628 |
| 8 | 1 | 64.2 | 79.0 | 13 / 35 | 3792 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 62 | 47% |
| cx.mini.Nimrod 0.55 | 26 | 62% |
| djc.DynaBot 0.1.1 | 19 | 74% |
| uji.YellohFellah 1.0 | 18 | 72% |
| br2.MobyDickBot 1.6 | 14 | 50% |
| rdt199.Warlord 0.73 | 13 | 69% |
| stelo.MirrorNano 1.3 | 1 | 100% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 191 of 280 rounds, at a mean tick of 857. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 89 | 47% | 120 |
| cx.mini.Nimrod 0.55 | 35 | 18% | 51 |
| rdt199.Warlord 0.73 | 17 | 9% | 26 |
| br2.MobyDickBot 1.6 | 16 | 8% | 19 |
| djc.DynaBot 0.1.1 | 10 | 5% | 26 |
| uji.YellohFellah 1.0 | 10 | 5% | 22 |
| KiraNL.Chupacabra 0.4 | 7 | 4% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 3% | 5 |
| stelo.MirrorNano 1.3 | 1 | 1% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 271 rounds): 207546 melee ticks, 44412 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (271 rounds): longest scan gap while four or more were alive 46 ticks (271 rounds over 8); rounds whose longest gap at any count was over 8: 271; robots dropped as dead without a death event: 0.

Targeting waves (271 rounds): 69084 sent, 62982 reached their opponent, 8961 virtual hits (14.2% of those reached).

## Melee bench: F12

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 7 other Robocode JVMs running (hadur.bench.MeleeRunner x7), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 461 over 8 battles (57.6 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 83.3 | 141 / 280 | 2.51 | 16.9% | 27680 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 16.9% | 141 |
| bts.wiki.RipCurl 0.9b | 2.6 | 13.7% | 38 |
| nat.PallasHawk 1.0 | 2.6 | 13.7% | 52 |
| darkcanuck.Leon 1.01 | 3.9 | 12.3% | 27 |
| brainfade.melee.Genghis 0.36 | 5.0 | 9.9% | 9 |
| jrm.Test0 1.0 | 5.9 | 8.4% | 3 |
| jp.Perpy 16.0 | 7.3 | 7.0% | 2 |
| cs.sheldor.Talon 1.1 | 8.0 | 6.7% | 2 |
| jaybot.bots.Oddball 4.0 | 9.1 | 6.0% | 5 |
| stuff.Vlad 0.1 | 9.6 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 80.3 | 19 / 35 | 3222 |
| 2 | 1 | 67.0 | 88.3 | 20 / 35 | 3552 |
| 3 | 1 | 65.9 | 82.2 | 19 / 35 | 3746 |
| 4 | 1 | 65.1 | 80.3 | 16 / 35 | 3553 |
| 5 | 1 | 64.6 | 81.6 | 15 / 35 | 3380 |
| 6 | 1 | 64.7 | 84.4 | 14 / 35 | 3066 |
| 7 | 1 | 66.5 | 86.3 | 19 / 35 | 3569 |
| 8 | 1 | 66.2 | 82.5 | 19 / 35 | 3592 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 57 | 79% |
| nat.PallasHawk 1.0 | 56 | 64% |
| darkcanuck.Leon 1.01 | 44 | 89% |
| brainfade.melee.Genghis 0.36 | 15 | 67% |
| jaybot.bots.Oddball 4.0 | 5 | 80% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| jp.Perpy 16.0 | 4 | 50% |
| jrm.Test0 1.0 | 1 | 100% |

Hadur died in 143 of 280 rounds, at a mean tick of 693. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 31 | 22% | 65 |
| bts.wiki.RipCurl 0.9b | 31 | 22% | 65 |
| jrm.Test0 1.0 | 20 | 14% | 25 |
| brainfade.melee.Genghis 0.36 | 18 | 13% | 29 |
| darkcanuck.Leon 1.01 | 17 | 12% | 64 |
| jaybot.bots.Oddball 4.0 | 7 | 5% | 11 |
| cs.sheldor.Talon 1.1 | 7 | 5% | 10 |
| jp.Perpy 16.0 | 6 | 4% | 9 |
| stuff.Vlad 0.1 | 3 | 2% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 271 rounds): 174142 melee ticks, 45411 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (271 rounds): longest scan gap while four or more were alive 40 ticks (271 rounds over 8); rounds whose longest gap at any count was over 8: 271; robots dropped as dead without a death event: 0.

Targeting waves (271 rounds): 59664 sent, 53642 reached their opponent, 9377 virtual hits (17.5% of those reached).

## Melee bench: F13

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 146 over 8 battles (18.3 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 79.5 | 53 / 280 | 2.84 | 14.7% | 27936 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.5 | 16.6% | 65 |
| mn.Combat 3.25.0 | 1.6 | 16.7% | 110 |
| hadur2.Hadur 3.17.1aa | 2.9 | 14.7% | 53 |
| shinh.Entangled 0.3 | 4.1 | 12.4% | 34 |
| gh.micro.Gruweltje 0.7 | 4.9 | 11.7% | 16 |
| apc.Colossus2 0.17 | 6.1 | 7.8% | 1 |
| stelo.Wang 1.0 | 6.9 | 7.0% | 1 |
| ayk.WallHugger 1.0 | 8.1 | 5.0% | 0 |
| maribo.FollowFire 1 | 8.9 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.0 | 81.0 | 5 / 35 | 3275 |
| 2 | 3 | 62.6 | 79.0 | 5 / 35 | 3447 |
| 3 | 2 | 63.7 | 80.0 | 7 / 35 | 3850 |
| 4 | 3 | 64.2 | 81.9 | 8 / 35 | 3538 |
| 5 | 3 | 62.3 | 75.9 | 4 / 35 | 3666 |
| 6 | 3 | 63.1 | 77.8 | 7 / 35 | 3605 |
| 7 | 3 | 63.0 | 79.0 | 6 / 35 | 3394 |
| 8 | 3 | 64.2 | 81.6 | 11 / 35 | 3161 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 50 | 24% |
| ags.Glacier 0.2.11 | 47 | 51% |
| shinh.Entangled 0.3 | 18 | 50% |
| gh.micro.Gruweltje 0.7 | 10 | 50% |
| stelo.Wang 1.0 | 3 | 100% |

Hadur died in 227 of 280 rounds, at a mean tick of 876. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 81 | 36% | 102 |
| mn.Combat 3.25.0 | 74 | 33% | 90 |
| shinh.Entangled 0.3 | 32 | 14% | 39 |
| gh.micro.Gruweltje 0.7 | 22 | 10% | 30 |
| stelo.Wang 1.0 | 12 | 5% | 13 |
| apc.Colossus2 0.17 | 3 | 1% | 3 |
| maribo.FollowFire 1 | 3 | 1% | 3 |

Posture (Hadur's M records, 268 rounds): 203702 melee ticks, 40980 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (268 rounds): longest scan gap while four or more were alive 70 ticks (268 rounds over 8); rounds whose longest gap at any count was over 8: 268; robots dropped as dead without a death event: 0.

Targeting waves (268 rounds): 60029 sent, 53754 reached their opponent, 9025 virtual hits (16.8% of those reached).

## Melee bench: F14

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 166 over 8 battles (20.8 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 91.2 | 187 / 280 | 1.79 | 19.2% | 39407 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.2% | 187 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.8% | 42 |
| catcat20.shape.Theta 0.018 | 3.1 | 12.2% | 31 |
| co.edu.usb.rc.LidisTron 1.0 | 4.8 | 9.7% | 4 |
| Lo_Ian.Gandalf_V4 4.0 | 5.4 | 9.6% | 2 |
| sanyi.mikrobi.Roberto 1.0 | 5.6 | 9.3% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.9 | 8.4% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.3 | 8.0% | 0 |
| pa.Improved 1.0 | 9.0 | 5.9% | 2 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 94.0 | 27 / 35 | 4854 |
| 2 | 1 | 68.6 | 88.9 | 21 / 35 | 4748 |
| 3 | 1 | 68.0 | 87.9 | 21 / 35 | 4763 |
| 4 | 1 | 69.4 | 90.2 | 25 / 35 | 5080 |
| 5 | 1 | 70.2 | 93.7 | 25 / 35 | 5001 |
| 6 | 1 | 68.6 | 89.5 | 17 / 35 | 4894 |
| 7 | 1 | 70.4 | 95.6 | 27 / 35 | 4936 |
| 8 | 1 | 70.0 | 90.2 | 24 / 35 | 5131 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 101 | 88% |
| catcat20.shape.Theta 0.018 | 65 | 68% |
| sheldor.micro.PointInLineRRAL 1.0 | 19 | 74% |
| sanyi.mikrobi.Roberto 1.0 | 18 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 17 | 82% |
| Lo_Ian.Gandalf_V4 4.0 | 6 | 67% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 93 of 280 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 34 | 37% | 130 |
| catcat20.shape.Theta 0.018 | 28 | 30% | 60 |
| sanyi.mikrobi.Roberto 1.0 | 10 | 11% | 37 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 8% | 22 |
| Lo_Ian.Gandalf_V4 4.0 | 5 | 5% | 8 |
| co.edu.usb.rc.LidisTron 1.0 | 4 | 4% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 3% | 7 |
| pa.Improved 1.0 | 1 | 1% | 2 |
| sample.TrackFire 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 268 rounds): 189365 melee ticks, 61626 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (268 rounds): longest scan gap while four or more were alive 32 ticks (268 rounds over 8); rounds whose longest gap at any count was over 8: 268; robots dropped as dead without a death event: 0.

Targeting waves (268 rounds): 61514 sent, 55964 reached their opponent, 14751 virtual hits (26.4% of those reached).

## Melee bench: F15

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 262 over 8 battles (32.8 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 80.2 | 117 / 280 | 2.78 | 16.6% | 33294 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 16.6% | 117 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.8% | 27 |
| emp.Yngwie 1.11 | 3.3 | 13.1% | 74 |
| mld.DustBunny 3.8 | 3.6 | 13.0% | 19 |
| cb.nano.Insomnia 1.0 | 4.8 | 11.1% | 18 |
| kawigi.robot.Girl 1.2 | 5.9 | 9.9% | 23 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.7% | 1 |
| lambdaxy.TBot 0.1 | 7.5 | 6.7% | 0 |
| divineomega.TrialBot 0.003 | 9.1 | 5.1% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.9 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 85.7 | 16 / 35 | 4534 |
| 2 | 1 | 63.4 | 73.3 | 13 / 35 | 4014 |
| 3 | 1 | 65.7 | 81.9 | 16 / 35 | 4022 |
| 4 | 1 | 66.6 | 82.5 | 16 / 35 | 4392 |
| 5 | 1 | 65.1 | 79.7 | 16 / 35 | 4106 |
| 6 | 1 | 66.3 | 81.9 | 14 / 35 | 4405 |
| 7 | 1 | 63.8 | 76.5 | 13 / 35 | 3685 |
| 8 | 1 | 64.8 | 80.0 | 13 / 35 | 4136 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 56 | 55% |
| kawigi.micro.Shiz 1.1 | 34 | 88% |
| cb.nano.Insomnia 1.0 | 24 | 58% |
| mld.DustBunny 3.8 | 22 | 82% |
| kawigi.robot.Girl 1.2 | 20 | 85% |
| divineomega.TrialBot 0.003 | 4 | 100% |
| Grystrion.TrackerWO 1.0 | 2 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 164 of 280 rounds, at a mean tick of 900. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 55 | 34% | 95 |
| mld.DustBunny 3.8 | 30 | 18% | 65 |
| cb.nano.Insomnia 1.0 | 26 | 16% | 25 |
| kawigi.robot.Girl 1.2 | 22 | 13% | 32 |
| kawigi.micro.Shiz 1.1 | 17 | 10% | 38 |
| lambdaxy.TBot 0.1 | 6 | 4% | 9 |
| Grystrion.TrackerWO 1.0 | 5 | 3% | 7 |
| divineomega.TrialBot 0.003 | 1 | 1% | 7 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 270 rounds): 211667 melee ticks, 55995 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (270 rounds): longest scan gap while four or more were alive 64 ticks (270 rounds over 8); rounds whose longest gap at any count was over 8: 270; robots dropped as dead without a death event: 0.

Targeting waves (270 rounds): 70687 sent, 64781 reached their opponent, 11064 virtual hits (17.1% of those reached).

## Melee bench: F16

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 150 over 8 battles (18.8 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 85.9 | 129 / 280 | 2.27 | 18.0% | 37845 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.0% | 129 |
| gh.Griezel 0.5.2 | 2.0 | 16.3% | 66 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.1 | 14.0% | 6 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 11.6% | 58 |
| bvh.fnr.Fenrir 0.36l | 5.1 | 9.6% | 5 |
| tvv.nano.Polaris 1.2 | 6.0 | 8.6% | 6 |
| stelo.IntrinsicVolatility 1.4 | 6.9 | 7.7% | 4 |
| repositorio.NanoStep 1.0 | 8.9 | 4.7% | 1 |
| divineomega.DivineBot 1.9.4.5 | 8.9 | 4.8% | 5 |
| asd.Cthulhu 1.3 | 9.1 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 84.1 | 16 / 35 | 4431 |
| 2 | 1 | 66.7 | 85.7 | 12 / 35 | 4417 |
| 3 | 1 | 67.7 | 85.4 | 17 / 35 | 4574 |
| 4 | 1 | 68.1 | 87.3 | 16 / 35 | 4757 |
| 5 | 1 | 66.0 | 81.6 | 11 / 35 | 4672 |
| 6 | 1 | 69.2 | 88.3 | 20 / 35 | 5176 |
| 7 | 1 | 68.1 | 85.7 | 18 / 35 | 4726 |
| 8 | 1 | 69.4 | 89.2 | 19 / 35 | 5092 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 76 | 64% |
| techdude.forest.FlamingForest 1.1 | 56 | 52% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 31 | 94% |
| tvv.nano.Polaris 1.2 | 9 | 78% |
| bvh.fnr.Fenrir 0.36l | 8 | 88% |
| divineomega.DivineBot 1.9.4.5 | 6 | 100% |
| stelo.IntrinsicVolatility 1.4 | 4 | 50% |

Hadur died in 151 of 280 rounds, at a mean tick of 1189. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 47 | 31% | 102 |
| techdude.forest.FlamingForest 1.1 | 41 | 27% | 66 |
| bvh.fnr.Fenrir 0.36l | 23 | 15% | 30 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 18 | 12% | 46 |
| stelo.IntrinsicVolatility 1.4 | 7 | 5% | 12 |
| tvv.nano.Polaris 1.2 | 7 | 5% | 11 |
| divineomega.DivineBot 1.9.4.5 | 4 | 3% | 9 |
| asd.Cthulhu 1.3 | 3 | 2% | 3 |
| repositorio.NanoStep 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 268 rounds): 246234 melee ticks, 80004 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 559 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (268 rounds): longest scan gap while four or more were alive 370 ticks (268 rounds over 8); rounds whose longest gap at any count was over 8: 268; robots dropped as dead without a death event: 0.

Targeting waves (268 rounds): 79128 sent, 73134 reached their opponent, 12703 virtual hits (17.4% of those reached).

## Melee bench: F17

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 148 over 8 battles (18.5 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 84.8 | 142 / 280 | 2.36 | 18.2% | 40412 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.2% | 142 |
| oog.melee.Mercutio 1.0 | 2.6 | 13.3% | 46 |
| et.Predator 1.8 | 3.1 | 13.0% | 29 |
| cx.BlestPain 1.41 | 3.4 | 12.4% | 57 |
| ahf.NanoAndrew .4 | 5.9 | 9.9% | 2 |
| nic.Nicator 2.4 | 5.9 | 9.9% | 2 |
| maribo.melee.BMV 0.1 | 6.1 | 9.3% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.9% | 1 |
| tex.Longbot 0.4 | 8.8 | 5.5% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 83.8 | 17 / 35 | 5203 |
| 2 | 1 | 69.6 | 89.8 | 19 / 35 | 5396 |
| 3 | 1 | 66.8 | 81.0 | 18 / 35 | 4879 |
| 4 | 1 | 69.8 | 90.5 | 19 / 35 | 5534 |
| 5 | 1 | 66.2 | 80.0 | 13 / 35 | 4898 |
| 6 | 1 | 67.7 | 84.8 | 20 / 35 | 4887 |
| 7 | 1 | 66.9 | 82.5 | 17 / 35 | 4795 |
| 8 | 1 | 68.2 | 86.3 | 19 / 35 | 4820 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 67 | 78% |
| et.Predator 1.8 | 53 | 77% |
| cx.BlestPain 1.41 | 40 | 33% |
| ahf.NanoAndrew .4 | 16 | 94% |
| maribo.melee.BMV 0.1 | 10 | 100% |
| nic.Nicator 2.4 | 10 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 139 of 280 rounds, at a mean tick of 1042. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 40 | 29% | 55 |
| et.Predator 1.8 | 33 | 24% | 69 |
| oog.melee.Mercutio 1.0 | 29 | 21% | 81 |
| ahf.NanoAndrew .4 | 14 | 10% | 28 |
| maribo.melee.BMV 0.1 | 10 | 7% | 18 |
| tex.Longbot 0.4 | 5 | 4% | 5 |
| nic.Nicator 2.4 | 4 | 3% | 16 |
| edu.otg.spr.TheTeacher 1.2 | 4 | 3% | 8 |

Posture (Hadur's M records, 266 rounds): 210656 melee ticks, 80064 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (266 rounds): longest scan gap while four or more were alive 48 ticks (266 rounds over 8); rounds whose longest gap at any count was over 8: 266; robots dropped as dead without a death event: 0.

Targeting waves (266 rounds): 71911 sent, 66077 reached their opponent, 15188 virtual hits (23.0% of those reached).

## Melee bench: F18

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 357 over 8 battles (44.6 per battle, most in one battle 148). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 88.5 | 158 / 280 | 2.03 | 18.4% | 34153 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.4% | 158 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.9% | 49 |
| agd.Mooserwirt2 2.7 | 3.1 | 12.1% | 34 |
| uji.DBH 1.1 | 3.9 | 11.2% | 13 |
| spinnercat.Robovirus 2.718 | 5.9 | 8.7% | 6 |
| sigterm.Sigterm 1.0 | 6.3 | 8.6% | 8 |
| ratosh.Nobo 0.21 | 6.4 | 8.5% | 5 |
| kawigi.mini.Fhqwhgads 1.1 | 7.6 | 7.6% | 3 |
| stelo.WangRobot 1.0 | 9.1 | 5.9% | 4 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 87.3 | 21 / 35 | 4304 |
| 2 | 1 | 67.2 | 89.5 | 19 / 35 | 3905 |
| 3 | 1 | 66.9 | 86.3 | 19 / 35 | 3947 |
| 4 | 1 | 66.7 | 88.3 | 17 / 35 | 4131 |
| 5 | 1 | 67.0 | 84.4 | 19 / 35 | 4532 |
| 6 | 1 | 69.5 | 93.7 | 26 / 35 | 4404 |
| 7 | 1 | 67.9 | 88.6 | 15 / 35 | 4454 |
| 8 | 1 | 68.4 | 90.2 | 22 / 35 | 4476 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 75 | 65% |
| agd.Mooserwirt2 2.7 | 40 | 75% |
| uji.DBH 1.1 | 35 | 74% |
| sigterm.Sigterm 1.0 | 23 | 87% |
| stelo.WangRobot 1.0 | 11 | 73% |
| ratosh.Nobo 0.21 | 10 | 90% |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 100% |
| spinnercat.Robovirus 2.718 | 8 | 88% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 124 of 280 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 45 | 36% | 94 |
| agd.Mooserwirt2 2.7 | 27 | 22% | 55 |
| uji.DBH 1.1 | 17 | 14% | 38 |
| sigterm.Sigterm 1.0 | 8 | 6% | 24 |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 6% | 18 |
| ratosh.Nobo 0.21 | 7 | 6% | 18 |
| stelo.WangRobot 1.0 | 5 | 4% | 12 |
| spinnercat.Robovirus 2.718 | 3 | 2% | 16 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 2% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 270 rounds): 187215 melee ticks, 60600 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (270 rounds): longest scan gap while four or more were alive 59 ticks (270 rounds over 8); rounds whose longest gap at any count was over 8: 270; robots dropped as dead without a death event: 0.

Targeting waves (270 rounds): 63021 sent, 57177 reached their opponent, 13117 virtual hits (22.9% of those reached).

## Melee bench: F19

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 148 over 8 battles (18.5 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 95.4 | 244 / 280 | 1.41 | 21.2% | 44002 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 21.2% | 244 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.1 | 14.4% | 10 |
| mld.Infinity 2.2 | 3.4 | 12.6% | 14 |
| krillr.mini.JointStrike 2.0.0 | 3.9 | 11.8% | 5 |
| erdnis.Rover 0.3 | 4.8 | 10.4% | 4 |
| patson.PatsonTestBot 1.0 | 5.9 | 8.8% | 0 |
| pac.ABC 2.1 | 7.6 | 6.7% | 3 |
| mbh.Mbh 0.1 | 7.9 | 6.8% | 0 |
| pbg.R2D2 1.0 | 8.5 | 6.0% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 95.9 | 32 / 35 | 5451 |
| 2 | 1 | 72.3 | 95.6 | 30 / 35 | 5611 |
| 3 | 1 | 72.4 | 95.9 | 31 / 35 | 5712 |
| 4 | 1 | 72.4 | 95.2 | 30 / 35 | 5716 |
| 5 | 1 | 71.7 | 94.6 | 28 / 35 | 5488 |
| 6 | 1 | 71.3 | 93.7 | 30 / 35 | 5209 |
| 7 | 1 | 72.1 | 95.6 | 31 / 35 | 5550 |
| 8 | 1 | 72.0 | 97.1 | 32 / 35 | 5265 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 119 | 99% |
| mld.Infinity 2.2 | 53 | 96% |
| krillr.mini.JointStrike 2.0.0 | 30 | 100% |
| erdnis.Rover 0.3 | 17 | 88% |
| patson.PatsonTestBot 1.0 | 13 | 100% |
| pac.ABC 2.1 | 11 | 100% |
| pbg.R2D2 1.0 | 4 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |

Hadur died in 37 of 280 rounds, at a mean tick of 651. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 14 | 38% | 104 |
| mld.Infinity 2.2 | 7 | 19% | 38 |
| erdnis.Rover 0.3 | 7 | 19% | 29 |
| patson.PatsonTestBot 1.0 | 5 | 14% | 29 |
| krillr.mini.JointStrike 2.0.0 | 3 | 8% | 41 |
| pac.ABC 2.1 | 1 | 3% | 13 |
| mbh.Mbh 0.1 | 0 | 0% | 13 |
| pbg.R2D2 1.0 | 0 | 0% | 8 |

Posture (Hadur's M records, 264 rounds): 173510 melee ticks, 55457 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (264 rounds): longest scan gap while four or more were alive 49 ticks (264 rounds over 8); rounds whose longest gap at any count was over 8: 264; robots dropped as dead without a death event: 0.

Targeting waves (264 rounds): 59376 sent, 53783 reached their opponent, 13595 virtual hits (25.3% of those reached).

## Melee bench: F20

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 255 over 8 battles (31.9 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 91.7 | 190 / 280 | 1.75 | 20.3% | 43749 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 20.3% | 190 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.6% | 40 |
| nz.jdc.nano.GridFu 1.0 | 3.8 | 10.4% | 3 |
| fwb.Nine 1.0.1 | 3.8 | 11.2% | 18 |
| catcat20.Rabbit 0.001 | 4.5 | 10.0% | 21 |
| m3thos.mini.Eva01 0.5.5 | 6.1 | 8.5% | 2 |
| bayen.nut.Squirrel 1.615 | 7.5 | 7.0% | 4 |
| djdjdj.NanoSkunk10 1.0 | 7.6 | 6.9% | 2 |
| ntc.ControlledChaos 1.1.4 | 8.9 | 5.6% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.9 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 94.6 | 26 / 35 | 5757 |
| 2 | 1 | 70.0 | 91.4 | 24 / 35 | 5150 |
| 3 | 1 | 68.6 | 86.3 | 23 / 35 | 5010 |
| 4 | 1 | 69.7 | 89.2 | 19 / 35 | 5422 |
| 5 | 1 | 70.9 | 93.7 | 24 / 35 | 5708 |
| 6 | 1 | 70.5 | 91.1 | 26 / 35 | 5491 |
| 7 | 1 | 70.6 | 92.7 | 23 / 35 | 5494 |
| 8 | 1 | 71.3 | 94.3 | 25 / 35 | 5717 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 109 | 84% |
| fwb.Nine 1.0.1 | 43 | 98% |
| catcat20.Rabbit 0.001 | 31 | 65% |
| nz.jdc.nano.GridFu 1.0 | 17 | 88% |
| bayen.nut.Squirrel 1.615 | 9 | 78% |
| m3thos.mini.Eva01 0.5.5 | 7 | 86% |
| djdjdj.NanoSkunk10 1.0 | 4 | 75% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| ntc.ControlledChaos 1.1.4 | 2 | 100% |

Hadur died in 91 of 280 rounds, at a mean tick of 981. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 44 | 48% | 123 |
| catcat20.Rabbit 0.001 | 16 | 18% | 43 |
| fwb.Nine 1.0.1 | 12 | 13% | 34 |
| bayen.nut.Squirrel 1.615 | 8 | 9% | 22 |
| nz.jdc.nano.GridFu 1.0 | 5 | 5% | 29 |
| m3thos.mini.Eva01 0.5.5 | 2 | 2% | 14 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 7 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 270 rounds): 224694 melee ticks, 65841 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (270 rounds): longest scan gap while four or more were alive 40 ticks (270 rounds over 8); rounds whose longest gap at any count was over 8: 270; robots dropped as dead without a death event: 0.

Targeting waves (270 rounds): 72266 sent, 66421 reached their opponent, 16686 virtual hits (25.1% of those reached).

## Melee bench: F21

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 339 over 8 battles (42.4 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 91.8 | 152 / 280 | 1.74 | 19.5% | 41098 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.5% | 152 |
| eem.EvBot v4.6.16 | 2.0 | 17.1% | 102 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.0% | 13 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.3% | 2 |
| eld.Hmm 1.0 | 5.3 | 8.3% | 13 |
| oa.weak.BotherBot 0.1 | 6.0 | 7.9% | 0 |
| fire219.CatBot 1.0 | 6.8 | 6.8% | 0 |
| el.JumpShoot 0.2 | 8.4 | 5.7% | 0 |
| PSW.Relentless 0.1 | 9.0 | 5.2% | 0 |
| arthord.MannyPacquiao Beta | 9.6 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 85.7 | 14 / 35 | 5148 |
| 2 | 1 | 69.4 | 91.1 | 19 / 35 | 4873 |
| 3 | 1 | 70.1 | 94.9 | 20 / 35 | 5113 |
| 4 | 1 | 70.9 | 94.0 | 19 / 35 | 5199 |
| 5 | 1 | 69.1 | 87.9 | 16 / 35 | 5226 |
| 6 | 1 | 70.1 | 92.7 | 18 / 35 | 5157 |
| 7 | 1 | 70.6 | 93.0 | 23 / 35 | 5164 |
| 8 | 1 | 70.7 | 95.2 | 23 / 35 | 5218 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 170 | 54% |
| dummy.mini.Scimitar 1.01 | 31 | 84% |
| cf.RiO.RiOx 4.2.1 | 26 | 100% |
| eld.Hmm 1.0 | 10 | 20% |
| oa.weak.BotherBot 0.1 | 6 | 100% |

Hadur died in 132 of 280 rounds, at a mean tick of 1394. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 84 | 64% | 153 |
| dummy.mini.Scimitar 1.01 | 21 | 16% | 66 |
| eld.Hmm 1.0 | 12 | 9% | 19 |
| cf.RiO.RiOx 4.2.1 | 9 | 7% | 27 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 11 |
| PSW.Relentless 0.1 | 1 | 1% | 1 |
| el.JumpShoot 0.2 | 0 | 0% | 2 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 247834 melee ticks, 117088 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 42 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 0.

Targeting waves (272 rounds): 73906 sent, 68196 reached their opponent, 12506 virtual hits (18.3% of those reached).

## Melee bench: F22

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 181 over 8 battles (22.6 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 87.4 | 114 / 280 | 2.14 | 17.4% | 33818 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.3 | 17.4% | 114 |
| pe.SandboxDT 2.71m | 2.1 | 16.2% | 88 |
| kvk.HebusLeTroll 0.35 | 2.6 | 15.2% | 36 |
| jlm.javaDisturbance 0.59 | 4.1 | 13.2% | 33 |
| bigpete.Stewie 1.0 | 4.9 | 11.1% | 7 |
| yk.JahRoslav 1.1 | 6.4 | 7.4% | 1 |
| gg.Squaraus 0.6 | 7.3 | 6.3% | 0 |
| tad.Dalek98 0.98 | 7.5 | 5.9% | 2 |
| pbg.NinjaX 1.2 | 8.9 | 4.7% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.8 | 87.0 | 12 / 35 | 4494 |
| 2 | 1 | 68.1 | 88.6 | 18 / 35 | 4365 |
| 3 | 1 | 67.2 | 88.6 | 15 / 35 | 3797 |
| 4 | 1 | 68.1 | 88.6 | 17 / 35 | 4647 |
| 5 | 2 | 65.5 | 84.1 | 10 / 35 | 3625 |
| 6 | 1 | 67.3 | 88.3 | 12 / 35 | 4111 |
| 7 | 1 | 68.7 | 89.2 | 18 / 35 | 4361 |
| 8 | 1 | 67.4 | 84.8 | 12 / 35 | 4418 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 73 | 34% |
| kvk.HebusLeTroll 0.35 | 56 | 66% |
| jlm.javaDisturbance 0.59 | 48 | 65% |
| bigpete.Stewie 1.0 | 17 | 82% |
| yk.JahRoslav 1.1 | 5 | 80% |
| tad.Dalek98 0.98 | 3 | 33% |
| gg.Squaraus 0.6 | 1 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |

Hadur died in 168 of 280 rounds, at a mean tick of 1021. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 71 | 42% | 100 |
| kvk.HebusLeTroll 0.35 | 42 | 25% | 69 |
| jlm.javaDisturbance 0.59 | 32 | 19% | 66 |
| bigpete.Stewie 1.0 | 13 | 8% | 24 |
| tad.Dalek98 0.98 | 4 | 2% | 5 |
| yk.JahRoslav 1.1 | 3 | 2% | 9 |
| pbg.NinjaX 1.2 | 1 | 1% | 2 |
| gg.Squaraus 0.6 | 0 | 0% | 4 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 269 rounds): 222850 melee ticks, 58522 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (269 rounds): longest scan gap while four or more were alive 41 ticks (269 rounds over 8); rounds whose longest gap at any count was over 8: 269; robots dropped as dead without a death event: 0.

Targeting waves (269 rounds): 72153 sent, 66244 reached their opponent, 11130 virtual hits (16.8% of those reached).

## Melee bench: F23

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 11 other Robocode JVMs running (hadur.bench.MeleeRunner x11), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 268 over 8 battles (33.5 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 94.8 | 217 / 280 | 1.47 | 20.7% | 42612 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 20.7% | 217 |
| pe.SandboxLump 1.52 | 2.0 | 16.6% | 40 |
| cre.Karolos 0.32 | 3.0 | 13.7% | 13 |
| stelo.AreaTargetingBot 1.1 | 4.1 | 10.2% | 2 |
| stelo.RamTrackSurfer 1.2 | 5.1 | 9.3% | 7 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.1 | 8.9% | 1 |
| cw.megas.Blade 0.8 | 6.9 | 8.1% | 0 |
| sample.Walls 1.0 | 7.8 | 7.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.1 | 2.9% | 0 |
| rrh.Iwillfindyou 2.0 | 9.9 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 96.5 | 27 / 35 | 5059 |
| 2 | 1 | 71.7 | 95.2 | 29 / 35 | 5209 |
| 3 | 1 | 72.6 | 95.6 | 29 / 35 | 5419 |
| 4 | 1 | 71.8 | 94.9 | 26 / 35 | 5628 |
| 5 | 1 | 71.7 | 94.9 | 28 / 35 | 5364 |
| 6 | 1 | 71.8 | 94.6 | 27 / 35 | 5387 |
| 7 | 1 | 70.7 | 92.4 | 26 / 35 | 5091 |
| 8 | 1 | 71.4 | 94.3 | 25 / 35 | 5455 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 132 | 83% |
| cre.Karolos 0.32 | 60 | 95% |
| stelo.AreaTargetingBot 1.1 | 19 | 100% |
| stelo.RamTrackSurfer 1.2 | 12 | 83% |
| sample.Walls 1.0 | 10 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 8 | 88% |
| cw.megas.Blade 0.8 | 4 | 100% |

Hadur died in 65 of 280 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 35 | 54% | 127 |
| cre.Karolos 0.32 | 14 | 22% | 63 |
| stelo.AreaTargetingBot 1.1 | 6 | 9% | 31 |
| stelo.RamTrackSurfer 1.2 | 5 | 8% | 26 |
| sample.Walls 1.0 | 2 | 3% | 12 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 2% | 10 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |
| cw.megas.Blade 0.8 | 0 | 0% | 4 |
| cli.WasteOfAmmo 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 269 rounds): 173442 melee ticks, 61284 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (269 rounds): longest scan gap while four or more were alive 47 ticks (269 rounds over 8); rounds whose longest gap at any count was over 8: 269; robots dropped as dead without a death event: 0.

Targeting waves (269 rounds): 55640 sent, 49815 reached their opponent, 16169 virtual hits (32.5% of those reached).

## Melee bench: F24

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 135 over 8 battles (16.9 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 78.8 | 99 / 280 | 2.90 | 15.6% | 28179 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.1 | 15.6% | 99 |
| rz.GlowBlowMelee 1.4 | 2.9 | 14.0% | 63 |
| florent.XSeries.X2 0.12 | 3.4 | 12.9% | 35 |
| davidalves.Phoenix 0.54 | 3.6 | 13.1% | 51 |
| pedersen.Ugluk 1.1.1 | 4.0 | 12.2% | 24 |
| oog.melee.Corsair 1.0 | 6.0 | 9.7% | 7 |
| stelo.SoJNanoMelee 1.1 | 7.3 | 7.1% | 2 |
| lunchie.Lunchbox 0.93 | 7.8 | 6.0% | 0 |
| as.FrankTheTank 1.3 | 9.0 | 5.0% | 0 |
| evd.X1 0.01 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 79.0 | 12 / 35 | 3382 |
| 2 | 1 | 63.7 | 78.1 | 13 / 35 | 3526 |
| 3 | 1 | 63.5 | 79.0 | 9 / 35 | 3385 |
| 4 | 2 | 62.1 | 76.5 | 7 / 35 | 3266 |
| 5 | 1 | 64.5 | 79.0 | 16 / 35 | 3796 |
| 6 | 1 | 65.1 | 81.3 | 15 / 35 | 3696 |
| 7 | 1 | 65.1 | 83.5 | 12 / 35 | 3631 |
| 8 | 1 | 63.2 | 74.3 | 15 / 35 | 3497 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 41 | 51% |
| davidalves.Phoenix 0.54 | 41 | 51% |
| pedersen.Ugluk 1.1.1 | 29 | 62% |
| florent.XSeries.X2 0.12 | 25 | 64% |
| stelo.SoJNanoMelee 1.1 | 10 | 100% |
| oog.melee.Corsair 1.0 | 9 | 89% |
| lunchie.Lunchbox 0.93 | 4 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 182 of 280 rounds, at a mean tick of 760. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 42 | 23% | 63 |
| florent.XSeries.X2 0.12 | 40 | 22% | 62 |
| davidalves.Phoenix 0.54 | 38 | 21% | 59 |
| pedersen.Ugluk 1.1.1 | 28 | 15% | 42 |
| oog.melee.Corsair 1.0 | 13 | 7% | 30 |
| stelo.SoJNanoMelee 1.1 | 10 | 5% | 11 |
| evd.X1 0.01 | 7 | 4% | 6 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 6 |
| as.FrankTheTank 1.3 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 270 rounds): 181162 melee ticks, 46705 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 78 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (270 rounds): longest scan gap while four or more were alive 78 ticks (270 rounds over 8); rounds whose longest gap at any count was over 8: 270; robots dropped as dead without a death event: 0.

Targeting waves (270 rounds): 61354 sent, 55245 reached their opponent, 10884 virtual hits (19.7% of those reached).

## Melee bench: F25

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 183 over 8 battles (22.9 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 84.2 | 161 / 280 | 2.42 | 17.4% | 28115 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.4% | 161 |
| voidious.mini.BrokenSword 2.0.3 | 2.4 | 13.5% | 32 |
| voidious.micro.BlitzBat 1.05 | 2.6 | 12.9% | 19 |
| jdw.Hurricane 1.4 | 4.0 | 11.7% | 31 |
| gre.svman4.Morfeas 1.4.1 | 5.6 | 9.1% | 11 |
| ds.Oo 2.2 | 5.6 | 9.1% | 15 |
| awesomeness.Elite 1.0 | 7.1 | 8.0% | 3 |
| adt.Ar2 1.1 | 8.1 | 7.1% | 4 |
| gjr.Cephalosporin 0.1 | 8.5 | 7.2% | 4 |
| amk.ChumbaMini 0.2 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 81.9 | 17 / 35 | 3645 |
| 2 | 1 | 68.2 | 90.5 | 23 / 35 | 3753 |
| 3 | 1 | 65.7 | 82.9 | 20 / 35 | 3276 |
| 4 | 1 | 67.4 | 86.3 | 25 / 35 | 3624 |
| 5 | 1 | 63.7 | 76.5 | 18 / 35 | 3333 |
| 6 | 1 | 67.1 | 88.3 | 20 / 35 | 3391 |
| 7 | 1 | 65.9 | 83.2 | 17 / 35 | 3712 |
| 8 | 1 | 66.1 | 84.4 | 21 / 35 | 3381 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 63 | 79% |
| voidious.micro.BlitzBat 1.05 | 40 | 95% |
| jdw.Hurricane 1.4 | 34 | 74% |
| ds.Oo 2.2 | 23 | 83% |
| gre.svman4.Morfeas 1.4.1 | 12 | 75% |
| awesomeness.Elite 1.0 | 9 | 100% |
| gjr.Cephalosporin 0.1 | 7 | 86% |
| adt.Ar2 1.1 | 4 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 119 of 280 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 31 | 26% | 46 |
| voidious.mini.BrokenSword 2.0.3 | 25 | 21% | 60 |
| ds.Oo 2.2 | 18 | 15% | 45 |
| voidious.micro.BlitzBat 1.05 | 16 | 13% | 49 |
| awesomeness.Elite 1.0 | 10 | 8% | 22 |
| gre.svman4.Morfeas 1.4.1 | 9 | 8% | 27 |
| adt.Ar2 1.1 | 6 | 5% | 12 |
| gjr.Cephalosporin 0.1 | 4 | 3% | 17 |
| amk.ChumbaMini 0.2 | 0 | 0% | 2 |

Posture (Hadur's M records, 268 rounds): 163972 melee ticks, 38365 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (268 rounds): longest scan gap while four or more were alive 24 ticks (268 rounds over 8); rounds whose longest gap at any count was over 8: 268; robots dropped as dead without a death event: 0.

Targeting waves (268 rounds): 59109 sent, 53228 reached their opponent, 9543 virtual hits (17.9% of those reached).

## Melee bench: F26

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 184 over 8 battles (23.0 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 91.1 | 177 / 280 | 1.80 | 19.5% | 43520 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.5% | 177 |
| ak.Fermat 2.0 | 2.3 | 15.0% | 56 |
| lrem.Spectre 0.4.4 | 3.4 | 12.4% | 17 |
| shu.nitro.LENIN .T34 | 3.5 | 12.3% | 20 |
| js.PinBall 1.6 | 5.0 | 10.6% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.5% | 3 |
| gh.mini.GrubbmOne 1.0 | 6.9 | 8.5% | 4 |
| fullsail.LaxativeTeaTwo 1.0 | 8.1 | 6.5% | 1 |
| sample.SpinBot 1.0 | 8.9 | 4.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 89.8 | 22 / 35 | 5493 |
| 2 | 1 | 69.2 | 88.3 | 23 / 35 | 5226 |
| 3 | 1 | 69.0 | 88.9 | 19 / 35 | 5147 |
| 4 | 1 | 70.3 | 93.3 | 21 / 35 | 5447 |
| 5 | 1 | 71.1 | 94.0 | 25 / 35 | 5782 |
| 6 | 1 | 69.8 | 89.8 | 24 / 35 | 5219 |
| 7 | 1 | 70.1 | 92.1 | 20 / 35 | 5400 |
| 8 | 1 | 71.0 | 92.4 | 23 / 35 | 5806 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 82 | 76% |
| lrem.Spectre 0.4.4 | 55 | 82% |
| shu.nitro.LENIN .T34 | 48 | 88% |
| jaybot.adv.bots.JayBot 2.0 | 10 | 100% |
| js.PinBall 1.6 | 9 | 100% |
| gh.mini.GrubbmOne 1.0 | 7 | 86% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 100% |

Hadur died in 106 of 280 rounds, at a mean tick of 913. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 51 | 48% | 102 |
| shu.nitro.LENIN .T34 | 17 | 16% | 63 |
| lrem.Spectre 0.4.4 | 16 | 15% | 54 |
| jaybot.adv.bots.JayBot 2.0 | 10 | 9% | 20 |
| js.PinBall 1.6 | 5 | 5% | 20 |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 4% | 12 |
| gh.mini.GrubbmOne 1.0 | 3 | 3% | 9 |

Posture (Hadur's M records, 267 rounds): 211289 melee ticks, 58656 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (267 rounds): longest scan gap while four or more were alive 26 ticks (267 rounds over 8); rounds whose longest gap at any count was over 8: 267; robots dropped as dead without a death event: 0.

Targeting waves (267 rounds): 69918 sent, 64020 reached their opponent, 17066 virtual hits (26.7% of those reached).

## Melee bench: F27

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 147 over 8 battles (18.4 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 84.0 | 190 / 280 | 2.44 | 18.5% | 37053 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.3 | 18.5% | 190 |
| mk.Alpha 0.2.1 | 1.9 | 14.1% | 52 |
| EH.Eagle 1.0.6 | 3.6 | 10.9% | 4 |
| sheldor.melee.nano.TestMelee 0.1 | 4.6 | 10.0% | 13 |
| techdude.kombat.FlamingKombat 1.5 | 4.9 | 10.0% | 3 |
| wee.Gem 1.8.4 | 5.5 | 9.4% | 16 |
| throxbot.ThroxBot 0.1 | 7.8 | 7.9% | 1 |
| joe.ADinosaur 1.0 | 7.8 | 7.7% | 1 |
| caimano.Furia_Ceca 0.22 | 8.4 | 6.6% | 0 |
| cs.Grudge 1.0 | 9.4 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 97.1 | 31 / 35 | 5160 |
| 2 | 2 | 60.0 | 56.2 | 13 / 35 | 4424 |
| 3 | 2 | 58.6 | 54.9 | 10 / 35 | 4439 |
| 4 | 1 | 68.7 | 91.1 | 24 / 35 | 4258 |
| 5 | 1 | 70.0 | 93.7 | 26 / 35 | 4990 |
| 6 | 1 | 70.0 | 92.1 | 29 / 35 | 4794 |
| 7 | 1 | 70.3 | 95.2 | 29 / 35 | 4528 |
| 8 | 1 | 69.8 | 92.1 | 28 / 35 | 4460 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 102 | 83% |
| EH.Eagle 1.0.6 | 49 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 18 | 83% |
| wee.Gem 1.8.4 | 13 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 12 | 92% |
| throxbot.ThroxBot 0.1 | 9 | 100% |
| caimano.Furia_Ceca 0.22 | 7 | 100% |

Hadur died in 90 of 280 rounds, at a mean tick of 540. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 29 | 32% | 94 |
| cs.Grudge 1.0 | 19 | 21% | 19 |
| EH.Eagle 1.0.6 | 9 | 10% | 48 |
| sheldor.melee.nano.TestMelee 0.1 | 8 | 9% | 31 |
| wee.Gem 1.8.4 | 6 | 7% | 22 |
| joe.ADinosaur 1.0 | 6 | 7% | 9 |
| throxbot.ThroxBot 0.1 | 5 | 6% | 19 |
| techdude.kombat.FlamingKombat 1.5 | 4 | 4% | 20 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 16 |

Posture (Hadur's M records, 266 rounds): 163361 melee ticks, 45301 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 44 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (266 rounds): longest scan gap while four or more were alive 44 ticks (266 rounds over 8); rounds whose longest gap at any count was over 8: 266; robots dropped as dead without a death event: 0.

Targeting waves (266 rounds): 54622 sent, 48845 reached their opponent, 12859 virtual hits (26.3% of those reached).

## Melee bench: F28

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 254 over 8 battles (31.8 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 88.8 | 163 / 280 | 2.01 | 17.8% | 28904 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.8% | 163 |
| kid.test.NightFox .2 | 2.0 | 14.9% | 48 |
| uji.Antique 1.0 | 3.3 | 12.1% | 34 |
| qohnil.blot.BlotBot 3.61 | 4.4 | 10.8% | 16 |
| pfvicm.Sobieski 7.2.3b | 4.4 | 10.9% | 7 |
| ahr.ice.Ice 1.0.2 | 6.5 | 8.2% | 5 |
| amk.ChumbaWumba 0.3 | 6.8 | 7.9% | 6 |
| matt.advanced.Katana 1.0 | 8.5 | 6.0% | 1 |
| stelo.PianistNano 1.2 | 9.0 | 5.7% | 0 |
| stelo.Lifestealer 1.0 | 9.3 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 94.3 | 27 / 35 | 3897 |
| 2 | 1 | 65.4 | 86.7 | 18 / 35 | 3312 |
| 3 | 1 | 66.6 | 86.3 | 20 / 35 | 3825 |
| 4 | 1 | 65.6 | 84.8 | 17 / 35 | 3414 |
| 5 | 1 | 67.3 | 90.2 | 21 / 35 | 3735 |
| 6 | 1 | 66.8 | 87.9 | 17 / 35 | 3598 |
| 7 | 1 | 68.6 | 93.3 | 23 / 35 | 3666 |
| 8 | 1 | 66.3 | 86.7 | 20 / 35 | 3457 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 98 | 72% |
| uji.Antique 1.0 | 62 | 79% |
| qohnil.blot.BlotBot 3.61 | 24 | 71% |
| pfvicm.Sobieski 7.2.3b | 11 | 91% |
| ahr.ice.Ice 1.0.2 | 9 | 67% |
| amk.ChumbaWumba 0.3 | 6 | 83% |
| matt.advanced.Katana 1.0 | 3 | 67% |
| stelo.Lifestealer 1.0 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 119 of 280 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 36 | 30% | 75 |
| uji.Antique 1.0 | 30 | 25% | 74 |
| pfvicm.Sobieski 7.2.3b | 19 | 16% | 35 |
| qohnil.blot.BlotBot 3.61 | 16 | 13% | 40 |
| ahr.ice.Ice 1.0.2 | 7 | 6% | 18 |
| amk.ChumbaWumba 0.3 | 7 | 6% | 17 |
| stelo.Lifestealer 1.0 | 2 | 2% | 6 |
| matt.advanced.Katana 1.0 | 1 | 1% | 10 |
| stelo.PianistNano 1.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 268 rounds): 173340 melee ticks, 47195 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (268 rounds): longest scan gap while four or more were alive 60 ticks (268 rounds over 8); rounds whose longest gap at any count was over 8: 268; robots dropped as dead without a death event: 0.

Targeting waves (268 rounds): 58984 sent, 53140 reached their opponent, 8154 virtual hits (15.3% of those reached).

## Melee bench: F29

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 137 over 8 battles (17.1 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 84.2 | 118 / 280 | 2.42 | 17.6% | 32805 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.1 | 17.6% | 118 |
| zyx.mega.YersiniaPestis 3.1 | 2.4 | 15.0% | 64 |
| deewiant.Anomaly 0.2 | 2.5 | 14.8% | 67 |
| myl.micro.Troodon 1.10 | 4.1 | 12.0% | 10 |
| jok.PheonixM 0.1.2 | 4.9 | 10.9% | 11 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.0% | 1 |
| DBall.Anarchy 0.1 | 7.3 | 6.4% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 7.8 | 6.0% | 0 |
| ap.Frederick 1.1 | 9.1 | 5.1% | 2 |
| jangs.ns51 1.0 | 9.9 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 83.8 | 15 / 35 | 4161 |
| 2 | 1 | 66.8 | 82.9 | 13 / 35 | 4049 |
| 3 | 1 | 69.6 | 91.1 | 20 / 35 | 4271 |
| 4 | 1 | 66.0 | 80.6 | 13 / 35 | 3978 |
| 5 | 1 | 67.3 | 85.4 | 14 / 35 | 4165 |
| 6 | 2 | 65.0 | 78.7 | 11 / 35 | 3798 |
| 7 | 1 | 66.9 | 84.8 | 13 / 35 | 4079 |
| 8 | 1 | 68.3 | 86.3 | 19 / 35 | 4304 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 74 | 51% |
| zyx.mega.YersiniaPestis 3.1 | 54 | 54% |
| myl.micro.Troodon 1.10 | 26 | 85% |
| jok.PheonixM 0.1.2 | 24 | 79% |
| ph.melee.ArcherME 0.3 | 5 | 80% |
| jangs.ns51 1.0 | 3 | 67% |
| ap.Frederick 1.1 | 3 | 67% |
| DBall.Anarchy 0.1 | 2 | 100% |

Hadur died in 162 of 280 rounds, at a mean tick of 974. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 67 | 41% | 110 |
| zyx.mega.YersiniaPestis 3.1 | 44 | 27% | 77 |
| myl.micro.Troodon 1.10 | 29 | 18% | 44 |
| jok.PheonixM 0.1.2 | 13 | 8% | 32 |
| ph.melee.ArcherME 0.3 | 4 | 2% | 8 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 2% | 5 |
| jangs.ns51 1.0 | 1 | 1% | 1 |
| ap.Frederick 1.1 | 1 | 1% | 0 |
| DBall.Anarchy 0.1 | 0 | 0% | 3 |

Posture (Hadur's M records, 268 rounds): 219693 melee ticks, 63126 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (268 rounds): longest scan gap while four or more were alive 40 ticks (268 rounds over 8); rounds whose longest gap at any count was over 8: 268; robots dropped as dead without a death event: 0.

Targeting waves (268 rounds): 73341 sent, 67401 reached their opponent, 11639 virtual hits (17.3% of those reached).

## Melee bench: F30

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 751 over 8 battles (93.9 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 72.6 | 46 / 280 | 3.47 | 13.9% | 27209 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.8 | 14.3% | 75 |
| hadur2.Hadur 3.17.1aa | 2.4 | 13.9% | 46 |
| darkcanuck.B26354 1.06 | 2.9 | 13.5% | 62 |
| stelo.PastFuture 2.3.2 | 3.3 | 13.1% | 37 |
| oog.melee.Capulet 1.2 | 4.8 | 12.0% | 32 |
| intruder.PrairieWolf 2.61 | 6.1 | 9.2% | 16 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 7.3% | 10 |
| tripphippy.Alice 1.1 | 7.9 | 7.1% | 1 |
| ntc.Opposite 1.5 | 8.3 | 7.0% | 1 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 77.5 | 10 / 35 | 3339 |
| 2 | 3 | 59.8 | 69.8 | 5 / 35 | 3410 |
| 3 | 1 | 61.4 | 73.3 | 5 / 35 | 3543 |
| 4 | 3 | 59.8 | 69.5 | 2 / 35 | 3352 |
| 5 | 1 | 63.2 | 79.4 | 8 / 35 | 3627 |
| 6 | 3 | 60.3 | 70.5 | 4 / 35 | 3415 |
| 7 | 4 | 60.6 | 71.4 | 6 / 35 | 3282 |
| 8 | 3 | 59.8 | 69.2 | 6 / 35 | 3241 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 34 | 24% |
| darkcanuck.B26354 1.06 | 25 | 40% |
| oog.melee.Capulet 1.2 | 21 | 62% |
| stelo.PastFuture 2.3.2 | 15 | 53% |
| intruder.PrairieWolf 2.61 | 6 | 33% |
| fowl3628800.LightningBolt 2.6.0 | 5 | 20% |
| tripphippy.Alice 1.1 | 5 | 80% |

Hadur died in 241 of 280 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 61 | 25% | 70 |
| darkcanuck.B26354 1.06 | 54 | 22% | 63 |
| stelo.PastFuture 2.3.2 | 44 | 18% | 48 |
| oog.melee.Capulet 1.2 | 37 | 15% | 53 |
| intruder.PrairieWolf 2.61 | 15 | 6% | 16 |
| tripphippy.Alice 1.1 | 13 | 5% | 19 |
| fowl3628800.LightningBolt 2.6.0 | 6 | 2% | 5 |
| ntc.Opposite 1.5 | 4 | 2% | 5 |
| GarmBox.Anger 1.0 | 1 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 277 rounds): 211087 melee ticks, 37991 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (277 rounds): longest scan gap while four or more were alive 66 ticks (277 rounds over 8); rounds whose longest gap at any count was over 8: 277; robots dropped as dead without a death event: 0.

Targeting waves (277 rounds): 69546 sent, 63190 reached their opponent, 11051 virtual hits (17.5% of those reached).

## Melee bench: F31

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 11 other Robocode JVMs running (hadur.bench.MeleeRunner x11), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 561 over 8 battles (70.1 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 73.9 | 48 / 280 | 3.35 | 14.0% | 24234 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.4% | 148 |
| hadur2.Hadur 3.17.1aa | 2.3 | 14.0% | 48 |
| gh.mini.Griezel 0.2 | 3.0 | 13.3% | 54 |
| d414.nano.Quantum 1.0.0 | 4.4 | 11.7% | 11 |
| spinnercat.micro.Tyger 0.1 | 4.4 | 11.3% | 11 |
| gh.nano.Grofvuil 0.2 | 6.1 | 8.9% | 4 |
| timmit.nano.TimDog 0.33 | 7.3 | 6.6% | 5 |
| fm.mammillarias 1.3 | 8.1 | 5.7% | 0 |
| tlp.ThreeLeggedPig 1 | 9.1 | 5.2% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.4 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.5 | 72.4 | 5 / 35 | 2974 |
| 2 | 3 | 58.4 | 66.0 | 3 / 35 | 2782 |
| 3 | 2 | 60.9 | 73.3 | 4 / 35 | 2978 |
| 4 | 2 | 62.0 | 74.9 | 8 / 35 | 2993 |
| 5 | 2 | 61.9 | 76.8 | 7 / 35 | 2990 |
| 6 | 2 | 63.3 | 80.3 | 6 / 35 | 3156 |
| 7 | 2 | 62.5 | 74.9 | 9 / 35 | 3296 |
| 8 | 2 | 60.8 | 72.4 | 6 / 35 | 3065 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 59 | 32% |
| gh.mini.Griezel 0.2 | 34 | 26% |
| d414.nano.Quantum 1.0.0 | 10 | 90% |
| spinnercat.micro.Tyger 0.1 | 8 | 75% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |
| timmit.nano.TimDog 0.33 | 2 | 50% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 236 of 280 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 87 | 37% | 105 |
| gh.mini.Griezel 0.2 | 51 | 22% | 62 |
| spinnercat.micro.Tyger 0.1 | 36 | 15% | 40 |
| d414.nano.Quantum 1.0.0 | 29 | 12% | 38 |
| gh.nano.Grofvuil 0.2 | 13 | 6% | 18 |
| fm.mammillarias 1.3 | 9 | 4% | 9 |
| timmit.nano.TimDog 0.33 | 4 | 2% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 3 | 1% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 196619 melee ticks, 30860 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 45 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 45 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 0.

Targeting waves (273 rounds): 65648 sent, 59372 reached their opponent, 9861 virtual hits (16.6% of those reached).

## Melee bench: F32

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 10 other Robocode JVMs running (hadur.bench.MeleeRunner x10), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 456 over 8 battles (57.0 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 84.8 | 137 / 280 | 2.37 | 16.9% | 30498 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 16.9% | 137 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.8% | 75 |
| apc.botM 3.0 | 3.4 | 12.2% | 32 |
| lxx.ConceptA 0.8 | 4.1 | 10.8% | 6 |
| vjik.UnViolation 1.1 | 5.0 | 10.3% | 15 |
| bayen.UbaMicro 1.4 | 5.6 | 9.2% | 3 |
| panzer.Panzer 0.2 | 7.4 | 7.5% | 1 |
| yk.JahMicro 1.0 | 7.9 | 7.0% | 9 |
| conscience.Electron 1.3g | 8.6 | 6.6% | 0 |
| donjezza.Jezza 1.0 | 10.0 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 91.7 | 21 / 35 | 3874 |
| 2 | 1 | 65.6 | 85.7 | 15 / 35 | 3870 |
| 3 | 1 | 65.7 | 87.0 | 17 / 35 | 3572 |
| 4 | 1 | 66.9 | 86.3 | 22 / 35 | 4046 |
| 5 | 1 | 64.6 | 82.9 | 15 / 35 | 3696 |
| 6 | 1 | 62.2 | 75.6 | 13 / 35 | 3501 |
| 7 | 1 | 66.0 | 85.1 | 18 / 35 | 4036 |
| 8 | 1 | 65.4 | 84.1 | 16 / 35 | 3903 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 97 | 59% |
| apc.botM 3.0 | 35 | 74% |
| lxx.ConceptA 0.8 | 18 | 89% |
| vjik.UnViolation 1.1 | 18 | 89% |
| yk.JahMicro 1.0 | 11 | 55% |
| donjezza.Jezza 1.0 | 7 | 71% |
| bayen.UbaMicro 1.4 | 6 | 83% |
| panzer.Panzer 0.2 | 5 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 146 of 280 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 57 | 39% | 109 |
| apc.botM 3.0 | 24 | 16% | 49 |
| lxx.ConceptA 0.8 | 20 | 14% | 34 |
| vjik.UnViolation 1.1 | 14 | 10% | 39 |
| bayen.UbaMicro 1.4 | 9 | 6% | 13 |
| panzer.Panzer 0.2 | 7 | 5% | 12 |
| yk.JahMicro 1.0 | 5 | 3% | 12 |
| conscience.Electron 1.3g | 5 | 3% | 6 |
| donjezza.Jezza 1.0 | 2 | 1% | 5 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 270 rounds): 165981 melee ticks, 56234 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (270 rounds): longest scan gap while four or more were alive 56 ticks (270 rounds over 8); rounds whose longest gap at any count was over 8: 270; robots dropped as dead without a death event: 0.

Targeting waves (270 rounds): 57731 sent, 51695 reached their opponent, 10082 virtual hits (19.5% of those reached).

## Melee bench: F33

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 359 over 8 battles (44.9 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 86.4 | 132 / 280 | 2.23 | 17.9% | 34037 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.1 | 17.9% | 132 |
| maribo.Quester 0.3 | 1.9 | 16.3% | 65 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.1 | 12.5% | 30 |
| labg.Cataclysm 2.05 | 4.5 | 11.0% | 24 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 11.1% | 19 |
| baal.nano.N 1.42 | 6.1 | 9.0% | 2 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 8.6% | 9 |
| zyx.micro.Ant 1.1 | 8.3 | 5.4% | 0 |
| sanja.First 0.1 | 9.1 | 4.5% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.6 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 87.6 | 21 / 35 | 4428 |
| 2 | 1 | 67.2 | 85.1 | 14 / 35 | 4158 |
| 3 | 2 | 66.6 | 83.8 | 12 / 35 | 3980 |
| 4 | 1 | 68.1 | 87.3 | 17 / 35 | 4528 |
| 5 | 1 | 67.6 | 85.7 | 15 / 35 | 4371 |
| 6 | 1 | 67.6 | 88.6 | 16 / 35 | 4066 |
| 7 | 1 | 69.6 | 89.8 | 22 / 35 | 4492 |
| 8 | 1 | 66.6 | 83.2 | 15 / 35 | 4014 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 81 | 72% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 44 | 68% |
| labg.Cataclysm 2.05 | 24 | 71% |
| gre.svman4.Leonidas 1.3.2 | 23 | 70% |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 67% |
| baal.nano.N 1.42 | 6 | 67% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 152 of 280 rounds, at a mean tick of 992. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 56 | 37% | 109 |
| gre.svman4.Leonidas 1.3.2 | 32 | 21% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 16% | 62 |
| labg.Cataclysm 2.05 | 16 | 11% | 34 |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 7% | 13 |
| baal.nano.N 1.42 | 6 | 4% | 11 |
| zyx.micro.Ant 1.1 | 5 | 3% | 7 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 227650 melee ticks, 63371 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 64 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 0.

Targeting waves (272 rounds): 74683 sent, 68507 reached their opponent, 11063 virtual hits (16.1% of those reached).

## Melee bench: F34

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 351 over 8 battles (43.9 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 88.5 | 102 / 280 | 2.04 | 17.7% | 36438 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.1 | 17.7% | 102 |
| stelo.Spread 0.9 | 2.1 | 16.6% | 95 |
| kid.Gladiator .7.2 | 2.8 | 15.8% | 51 |
| jcs.Seth 1.8 | 4.5 | 11.2% | 23 |
| tcf.Reach 3 | 4.8 | 11.1% | 11 |
| cli.Dancer 1.1 | 5.8 | 9.5% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.9% | 0 |
| sample.RamFire 1.0 | 9.4 | 2.8% | 0 |
| sample.VelociRobot 1.0 | 9.6 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 89.2 | 15 / 35 | 4382 |
| 2 | 1 | 68.3 | 88.6 | 13 / 35 | 4690 |
| 3 | 1 | 69.3 | 91.1 | 17 / 35 | 4923 |
| 4 | 1 | 67.0 | 86.7 | 12 / 35 | 4248 |
| 5 | 1 | 67.8 | 87.6 | 10 / 35 | 4547 |
| 6 | 1 | 68.2 | 87.6 | 13 / 35 | 4746 |
| 7 | 1 | 67.7 | 87.6 | 11 / 35 | 4483 |
| 8 | 2 | 68.3 | 89.2 | 11 / 35 | 4419 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 98 | 41% |
| kid.Gladiator .7.2 | 65 | 54% |
| jcs.Seth 1.8 | 31 | 55% |
| tcf.Reach 3 | 16 | 50% |
| cli.Dancer 1.1 | 2 | 100% |
| ratosh.Wesco 1.4 | 1 | 0% |

Hadur died in 184 of 280 rounds, at a mean tick of 1172. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 75 | 41% | 114 |
| kid.Gladiator .7.2 | 61 | 33% | 87 |
| jcs.Seth 1.8 | 20 | 11% | 42 |
| tcf.Reach 3 | 16 | 9% | 27 |
| ratosh.Wesco 1.4 | 4 | 2% | 5 |
| cli.Dancer 1.1 | 2 | 1% | 5 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 270 rounds): 236880 melee ticks, 82417 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (270 rounds): longest scan gap while four or more were alive 80 ticks (270 rounds over 8); rounds whose longest gap at any count was over 8: 270; robots dropped as dead without a death event: 0.

Targeting waves (270 rounds): 73488 sent, 67616 reached their opponent, 11687 virtual hits (17.3% of those reached).

## Melee bench: F35

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 682 over 8 battles (85.3 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 80.2 | 49 / 280 | 2.78 | 15.2% | 27016 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.3% | 181 |
| hadur2.Hadur 3.17.1aa | 2.0 | 15.2% | 49 |
| gh.mini.Gruwel 0.9 | 3.4 | 13.1% | 29 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.0 | 12.1% | 18 |
| rz.HawkOnFire 0.1 | 4.6 | 11.8% | 3 |
| wit.Chuliath 1.0 | 6.0 | 6.8% | 2 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.1 | 6.0% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.5 | 5.6% | 0 |
| stelo.MyAgileRobot 0.2 | 9.1 | 5.0% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 78.1 | 8 / 35 | 3278 |
| 2 | 2 | 64.9 | 86.0 | 8 / 35 | 3124 |
| 3 | 2 | 63.9 | 78.7 | 5 / 35 | 3585 |
| 4 | 2 | 63.2 | 78.4 | 8 / 35 | 3240 |
| 5 | 2 | 63.8 | 80.6 | 6 / 35 | 3327 |
| 6 | 2 | 65.3 | 84.8 | 7 / 35 | 3700 |
| 7 | 2 | 62.0 | 74.6 | 3 / 35 | 3278 |
| 8 | 2 | 63.6 | 80.3 | 4 / 35 | 3484 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 109 | 17% |
| gh.mini.Gruwel 0.9 | 26 | 38% |
| rz.HawkOnFire 0.1 | 17 | 82% |
| dmh.robocode.robot.BlackDeath 9.2 | 14 | 36% |
| wit.Chuliath 1.0 | 2 | 100% |

Hadur died in 236 of 280 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 121 | 51% | 138 |
| gh.mini.Gruwel 0.9 | 40 | 17% | 53 |
| dmh.robocode.robot.BlackDeath 9.2 | 30 | 13% | 35 |
| rz.HawkOnFire 0.1 | 24 | 10% | 34 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7 | 3% | 7 |
| dans.Cinnamon 1.2 | 4 | 2% | 4 |
| wit.Chuliath 1.0 | 3 | 1% | 5 |
| stelo.MyAgileRobot 0.2 | 1 | 0% | 1 |
| myl.nano.KomoriNinja 1.1 | 1 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 199419 melee ticks, 58083 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 33 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 62028 sent, 56033 reached their opponent, 9233 virtual hits (16.5% of those reached).

## Melee bench: F36

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 207 over 8 battles (25.9 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 90.0 | 179 / 280 | 1.90 | 19.4% | 37677 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.4% | 179 |
| bzdp.Pansy 2.1 | 2.6 | 12.8% | 23 |
| alpha.RainingFire 1.0 | 3.0 | 12.3% | 26 |
| mz.Cork 0.1 | 4.1 | 11.1% | 19 |
| bvh.micro.Freya 0.3 | 4.4 | 11.0% | 12 |
| bvh.mini.Fenrir 0.39 | 6.0 | 9.7% | 3 |
| m3thos.Eva02 0.7.1 | 6.9 | 9.2% | 12 |
| squidM.TentalceMeleeNano 1.1 | 8.1 | 6.0% | 1 |
| dl.BetterWalls 1.0 | 9.0 | 5.0% | 4 |
| sample.MyFirstRobot 1.0 | 9.9 | 3.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 91.4 | 21 / 35 | 5030 |
| 2 | 1 | 71.1 | 94.0 | 28 / 35 | 5096 |
| 3 | 1 | 69.3 | 90.8 | 23 / 35 | 4594 |
| 4 | 1 | 69.0 | 90.2 | 20 / 35 | 4836 |
| 5 | 1 | 68.7 | 88.9 | 21 / 35 | 4645 |
| 6 | 1 | 70.1 | 91.7 | 26 / 35 | 4642 |
| 7 | 1 | 67.9 | 86.7 | 19 / 35 | 4490 |
| 8 | 1 | 68.3 | 86.7 | 21 / 35 | 4344 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 55 | 89% |
| mz.Cork 0.1 | 43 | 86% |
| bvh.micro.Freya 0.3 | 39 | 82% |
| alpha.RainingFire 1.0 | 36 | 64% |
| bvh.mini.Fenrir 0.39 | 18 | 94% |
| m3thos.Eva02 0.7.1 | 16 | 75% |
| sample.MyFirstRobot 1.0 | 8 | 100% |
| dl.BetterWalls 1.0 | 2 | 50% |

Hadur died in 102 of 280 rounds, at a mean tick of 847. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 29 | 28% | 51 |
| bzdp.Pansy 2.1 | 21 | 21% | 70 |
| mz.Cork 0.1 | 14 | 14% | 47 |
| bvh.micro.Freya 0.3 | 13 | 13% | 46 |
| bvh.mini.Fenrir 0.39 | 10 | 10% | 26 |
| m3thos.Eva02 0.7.1 | 8 | 8% | 21 |
| dl.BetterWalls 1.0 | 4 | 4% | 9 |
| squidM.TentalceMeleeNano 1.1 | 3 | 3% | 6 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 268 rounds): 196086 melee ticks, 55470 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (268 rounds): longest scan gap while four or more were alive 48 ticks (268 rounds over 8); rounds whose longest gap at any count was over 8: 268; robots dropped as dead without a death event: 1.

Targeting waves (268 rounds): 67992 sent, 62373 reached their opponent, 13604 virtual hits (21.8% of those reached).

## Melee bench: F37

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 220 over 8 battles (27.5 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 90.6 | 223 / 280 | 1.84 | 19.3% | 41342 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.3% | 223 |
| germ.TheMind .2 | 2.8 | 10.3% | 7 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.0 | 10.5% | 6 |
| stelo.UntouchableNano 1.3 | 5.3 | 9.1% | 13 |
| EBBU.Sim2 1.02 | 5.6 | 9.3% | 6 |
| agrach.Dalek 1.0 | 6.0 | 9.0% | 7 |
| lmk.ACPFinal 0.1 | 6.8 | 8.5% | 0 |
| mb.Beast 0.1 | 7.6 | 8.2% | 12 |
| mn.nano.perceptual.Impact 1.3.0 | 7.9 | 8.3% | 3 |
| skm.Ryubot 1.0 | 9.1 | 7.6% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 94.6 | 30 / 35 | 5357 |
| 2 | 1 | 69.4 | 93.7 | 30 / 35 | 5345 |
| 3 | 1 | 67.3 | 88.9 | 26 / 35 | 4909 |
| 4 | 1 | 69.8 | 94.9 | 31 / 35 | 5348 |
| 5 | 1 | 66.3 | 85.1 | 24 / 35 | 4784 |
| 6 | 1 | 65.8 | 81.0 | 24 / 35 | 4913 |
| 7 | 1 | 68.9 | 92.1 | 28 / 35 | 5212 |
| 8 | 1 | 69.8 | 94.9 | 30 / 35 | 5474 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 39 | 100% |
| stelo.UntouchableNano 1.3 | 36 | 81% |
| com.syncleus.robocode.Dreadnaught 0.1 | 34 | 97% |
| germ.TheMind .2 | 26 | 100% |
| EBBU.Sim2 1.02 | 25 | 100% |
| skm.Ryubot 1.0 | 24 | 100% |
| mb.Beast 0.1 | 23 | 100% |
| lmk.ACPFinal 0.1 | 22 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 59 of 280 rounds, at a mean tick of 475. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 11 | 19% | 17 |
| stelo.UntouchableNano 1.3 | 10 | 17% | 41 |
| agrach.Dalek 1.0 | 9 | 15% | 61 |
| mb.Beast 0.1 | 9 | 15% | 31 |
| com.syncleus.robocode.Dreadnaught 0.1 | 7 | 12% | 41 |
| lmk.ACPFinal 0.1 | 7 | 12% | 30 |
| germ.TheMind .2 | 3 | 5% | 23 |
| skm.Ryubot 1.0 | 1 | 2% | 7 |
| EBBU.Sim2 1.02 | 0 | 0% | 28 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 267 rounds): 132645 melee ticks, 37723 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 91 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (267 rounds): longest scan gap while four or more were alive 91 ticks (267 rounds over 8); rounds whose longest gap at any count was over 8: 267; robots dropped as dead without a death event: 0.

Targeting waves (267 rounds): 44872 sent, 39423 reached their opponent, 12152 virtual hits (30.8% of those reached).

## Melee bench: F38

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 271 over 8 battles (33.9 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 85.0 | 124 / 280 | 2.35 | 17.0% | 31714 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.4 | 17.0% | 124 |
| justin.Mallais 14.0 | 1.6 | 16.8% | 96 |
| bvh.mini.Freya 0.55 | 3.1 | 12.8% | 20 |
| bts.mega.Gnarly 1.4 | 4.3 | 10.8% | 21 |
| cs.Wren 1.0 | 5.4 | 10.1% | 6 |
| kdf.KoulDestroyer 1.0 | 5.9 | 9.3% | 8 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.4 | 8.9% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.6% | 2 |
| matt.UnderDark3 2.4.34 | 9.1 | 4.2% | 1 |
| bzdp.BoxCar 2.0 | 9.9 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 86.3 | 18 / 35 | 4053 |
| 2 | 1 | 66.8 | 86.0 | 16 / 35 | 4128 |
| 3 | 1 | 65.3 | 81.3 | 13 / 35 | 4199 |
| 4 | 1 | 66.4 | 85.4 | 19 / 35 | 3970 |
| 5 | 2 | 66.5 | 86.0 | 14 / 35 | 3907 |
| 6 | 2 | 65.9 | 84.1 | 17 / 35 | 3514 |
| 7 | 2 | 64.4 | 79.4 | 7 / 35 | 3982 |
| 8 | 1 | 68.2 | 91.7 | 20 / 35 | 3961 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 87 | 59% |
| bvh.mini.Freya 0.55 | 36 | 75% |
| bts.mega.Gnarly 1.4 | 25 | 68% |
| kdf.KoulDestroyer 1.0 | 14 | 79% |
| cs.Wren 1.0 | 12 | 92% |
| davidalves.net.DuelistNanoMelee 1.01 | 5 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 67% |

Hadur died in 158 of 280 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 59 | 37% | 111 |
| bvh.mini.Freya 0.55 | 31 | 20% | 52 |
| cs.Wren 1.0 | 26 | 16% | 35 |
| bts.mega.Gnarly 1.4 | 18 | 11% | 36 |
| kdf.KoulDestroyer 1.0 | 15 | 9% | 25 |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 2% | 12 |
| bzdp.BoxCar 2.0 | 3 | 2% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 1% | 5 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 267 rounds): 185048 melee ticks, 46371 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 30 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (267 rounds): longest scan gap while four or more were alive 30 ticks (267 rounds over 8); rounds whose longest gap at any count was over 8: 267; robots dropped as dead without a death event: 0.

Targeting waves (267 rounds): 61711 sent, 55560 reached their opponent, 12626 virtual hits (22.7% of those reached).

## Melee bench: F39

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 245 over 8 battles (30.6 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 85.4 | 131 / 280 | 2.31 | 17.6% | 36033 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.6% | 131 |
| bvh.fry.Freya 0.82 | 2.0 | 14.9% | 41 |
| az.Ololobot 0.2.4 | 3.1 | 13.2% | 68 |
| catcat20.Lambda 0.024 | 3.9 | 11.5% | 32 |
| winamp32.micro.MicroMacro 1.0 | 5.9 | 8.6% | 2 |
| gimp.GimpBot 0.1 | 6.6 | 8.0% | 2 |
| apollokidd.ApolloKidd 0.9 | 6.6 | 7.7% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 7.1 | 7.6% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 6.0% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 81.9 | 14 / 35 | 4396 |
| 2 | 1 | 68.8 | 89.5 | 22 / 35 | 5130 |
| 3 | 1 | 67.6 | 87.6 | 17 / 35 | 4600 |
| 4 | 1 | 65.7 | 82.2 | 13 / 35 | 4233 |
| 5 | 1 | 65.2 | 81.9 | 16 / 35 | 4216 |
| 6 | 1 | 66.5 | 85.7 | 14 / 35 | 4425 |
| 7 | 1 | 68.0 | 89.2 | 19 / 35 | 4757 |
| 8 | 1 | 66.0 | 85.4 | 16 / 35 | 4276 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 64 | 52% |
| bvh.fry.Freya 0.82 | 56 | 80% |
| catcat20.Lambda 0.024 | 34 | 62% |
| stelo.SoRobotNanoMelee 1.2 | 12 | 100% |
| winamp32.micro.MicroMacro 1.0 | 11 | 100% |
| gimp.GimpBot 0.1 | 7 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |

Hadur died in 150 of 280 rounds, at a mean tick of 993. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 53 | 35% | 87 |
| bvh.fry.Freya 0.82 | 48 | 32% | 82 |
| catcat20.Lambda 0.024 | 28 | 19% | 50 |
| stelo.SoRobotNanoMelee 1.2 | 9 | 6% | 15 |
| gimp.GimpBot 0.1 | 6 | 4% | 20 |
| apollokidd.ApolloKidd 0.9 | 4 | 3% | 9 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 4 |
| winamp32.micro.MicroMacro 1.0 | 0 | 0% | 13 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 271 rounds): 224289 melee ticks, 58576 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 85 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (271 rounds): longest scan gap while four or more were alive 85 ticks (271 rounds over 8); rounds whose longest gap at any count was over 8: 271; robots dropped as dead without a death event: 0.

Targeting waves (271 rounds): 71794 sent, 65797 reached their opponent, 12839 virtual hits (19.5% of those reached).

## Melee bench: F40

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 388 over 8 battles (48.5 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.7 | 164 / 280 | 2.11 | 18.6% | 35110 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.6% | 164 |
| kawigi.mini.Coriantumr 1.1 | 2.1 | 14.6% | 36 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.9% | 36 |
| mz.AntiGrav 1.0 | 4.3 | 11.1% | 10 |
| Polkwane.SmashMelee 1.0 | 5.1 | 10.5% | 12 |
| stelo.Randomness 1.0 | 6.0 | 9.3% | 15 |
| alpha.BlackIce 1.0 | 6.5 | 8.8% | 6 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.6% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 4.3% | 0 |
| sample.Corners 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 92.4 | 22 / 35 | 4603 |
| 2 | 1 | 66.9 | 83.2 | 18 / 35 | 4279 |
| 3 | 1 | 70.0 | 90.2 | 26 / 35 | 4865 |
| 4 | 1 | 68.4 | 87.6 | 19 / 35 | 4500 |
| 5 | 1 | 68.4 | 86.7 | 21 / 35 | 4219 |
| 6 | 1 | 65.5 | 80.3 | 15 / 35 | 4002 |
| 7 | 1 | 70.2 | 93.7 | 23 / 35 | 4514 |
| 8 | 1 | 68.0 | 87.3 | 20 / 35 | 4128 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 65 | 74% |
| kano.gamma.KanoGamma 1.8 | 55 | 73% |
| mz.AntiGrav 1.0 | 35 | 97% |
| Polkwane.SmashMelee 1.0 | 21 | 81% |
| stelo.Randomness 1.0 | 16 | 63% |
| alpha.BlackIce 1.0 | 7 | 86% |
| amk.superstrike.SuperStrike 0.3 | 6 | 100% |
| sample.Corners 1.0 | 2 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 119 of 280 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 34 | 29% | 88 |
| kano.gamma.KanoGamma 1.8 | 25 | 21% | 60 |
| stelo.Randomness 1.0 | 17 | 14% | 36 |
| Polkwane.SmashMelee 1.0 | 14 | 12% | 25 |
| mz.AntiGrav 1.0 | 12 | 10% | 37 |
| alpha.BlackIce 1.0 | 7 | 6% | 14 |
| amk.superstrike.SuperStrike 0.3 | 4 | 3% | 11 |
| testantiswapgun.AntiSwap 1.0 | 3 | 3% | 5 |
| sample.Corners 1.0 | 1 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 269 rounds): 199141 melee ticks, 55501 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 95 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (269 rounds): longest scan gap while four or more were alive 95 ticks (269 rounds over 8); rounds whose longest gap at any count was over 8: 269; robots dropped as dead without a death event: 0.

Targeting waves (269 rounds): 67892 sent, 61777 reached their opponent, 13771 virtual hits (22.3% of those reached).

## Melee bench: F41

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 118 over 8 battles (14.8 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 85.4 | 130 / 280 | 2.32 | 17.1% | 29905 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.4 | 17.1% | 130 |
| eem.EvBotNG v12.8 | 1.6 | 16.2% | 94 |
| ary.Swarm 1.1 | 3.4 | 12.9% | 12 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.8% | 28 |
| simonton.nano.MeleeSeed 1.8 | 4.9 | 11.2% | 12 |
| shrub.Silver v048 | 6.0 | 9.3% | 5 |
| zyx.nano.Ant 1.1 | 7.0 | 7.7% | 0 |
| jsal.Jsalbot 1.0 | 8.4 | 5.4% | 0 |
| stelo.Mirror 1.1 | 8.6 | 5.2% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.1 | 83.5 | 15 / 35 | 3657 |
| 2 | 1 | 66.8 | 85.1 | 16 / 35 | 4006 |
| 3 | 2 | 64.5 | 78.7 | 11 / 35 | 3408 |
| 4 | 1 | 67.9 | 88.9 | 21 / 35 | 3993 |
| 5 | 1 | 66.5 | 86.0 | 16 / 35 | 3628 |
| 6 | 2 | 66.3 | 83.8 | 14 / 35 | 3703 |
| 7 | 1 | 67.9 | 89.2 | 18 / 35 | 3965 |
| 8 | 1 | 67.6 | 87.6 | 19 / 35 | 3545 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 88 | 42% |
| lessonz.robocode.Oz 0.5.0 | 44 | 82% |
| ary.Swarm 1.1 | 32 | 91% |
| simonton.nano.MeleeSeed 1.8 | 21 | 90% |
| shrub.Silver v048 | 8 | 75% |
| stelo.Mirror 1.1 | 2 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 151 of 280 rounds, at a mean tick of 895. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 69 | 46% | 107 |
| lessonz.robocode.Oz 0.5.0 | 31 | 21% | 59 |
| ary.Swarm 1.1 | 30 | 20% | 59 |
| simonton.nano.MeleeSeed 1.8 | 12 | 8% | 30 |
| shrub.Silver v048 | 5 | 3% | 13 |
| jsal.Jsalbot 1.0 | 1 | 1% | 4 |
| stelo.Mirror 1.1 | 1 | 1% | 4 |
| zyx.nano.Ant 1.1 | 1 | 1% | 2 |
| acogdev.alpha 0.2 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 270 rounds): 202094 melee ticks, 57812 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (270 rounds): longest scan gap while four or more were alive 65 ticks (270 rounds over 8); rounds whose longest gap at any count was over 8: 270; robots dropped as dead without a death event: 0.

Targeting waves (270 rounds): 67939 sent, 61942 reached their opponent, 10315 virtual hits (16.7% of those reached).

## Melee bench: F42

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 248 over 8 battles (31.0 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.9 | 157 / 280 | 1.91 | 19.1% | 41650 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.1% | 157 |
| wompi.Wallaby 5.1 | 2.0 | 15.7% | 63 |
| maribo.mini.MiniQuester 0.1 | 3.1 | 13.8% | 27 |
| ara.Shera 0.88 | 3.9 | 13.0% | 29 |
| amz.NanoClone 1.41 | 5.1 | 8.7% | 1 |
| dsw.StaticD 1.0 | 6.0 | 6.9% | 3 |
| maribo.IotaCT 1.1 | 7.5 | 6.4% | 0 |
| stelo.MirrorMicro 1.0 | 7.8 | 6.0% | 0 |
| mme.NikeEnhanced 2.0 | 8.9 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 90.5 | 20 / 35 | 5254 |
| 2 | 1 | 70.3 | 93.0 | 22 / 35 | 5181 |
| 3 | 1 | 69.0 | 89.2 | 18 / 35 | 5151 |
| 4 | 1 | 68.9 | 88.9 | 20 / 35 | 5147 |
| 5 | 1 | 68.9 | 87.6 | 17 / 35 | 5554 |
| 6 | 1 | 69.4 | 89.5 | 22 / 35 | 5175 |
| 7 | 1 | 69.6 | 92.7 | 22 / 35 | 4969 |
| 8 | 1 | 68.4 | 87.6 | 16 / 35 | 5219 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 115 | 81% |
| maribo.mini.MiniQuester 0.1 | 44 | 77% |
| ara.Shera 0.88 | 38 | 50% |
| dsw.StaticD 1.0 | 6 | 83% |
| amz.NanoClone 1.41 | 3 | 67% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 100% |
| stelo.MirrorMicro 1.0 | 2 | 100% |

Hadur died in 125 of 280 rounds, at a mean tick of 965. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 44 | 35% | 132 |
| ara.Shera 0.88 | 40 | 32% | 58 |
| maribo.mini.MiniQuester 0.1 | 32 | 26% | 65 |
| amz.NanoClone 1.41 | 5 | 4% | 5 |
| dsw.StaticD 1.0 | 1 | 1% | 11 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 3 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 3 |
| maribo.IotaCT 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 268 rounds): 223888 melee ticks, 58017 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (268 rounds): longest scan gap while four or more were alive 42 ticks (268 rounds over 8); rounds whose longest gap at any count was over 8: 268; robots dropped as dead without a death event: 0.

Targeting waves (268 rounds): 70869 sent, 65153 reached their opponent, 13410 virtual hits (20.6% of those reached).

## Melee bench: F43

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 408 over 8 battles (51.0 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 77.6 | 30 / 280 | 3.01 | 14.5% | 26170 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.7% | 212 |
| hadur2.Hadur 3.17.1aa | 2.0 | 14.5% | 30 |
| brainfade.melee.Dusk 0.44 | 3.0 | 12.5% | 24 |
| dummy.micro.Sparrow 2.5 | 4.4 | 11.3% | 8 |
| wcsv.melee.EngineerMelee 0.1 | 4.6 | 11.2% | 5 |
| Krabb.akim2.Akim2 1.1b | 6.1 | 8.8% | 2 |
| mz.NanoGod 2.02 | 7.3 | 7.8% | 0 |
| jab.DiamondStealer 5 | 7.6 | 7.9% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.8% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 79.7 | 8 / 35 | 3435 |
| 2 | 2 | 63.3 | 75.9 | 3 / 35 | 3308 |
| 3 | 2 | 63.4 | 77.5 | 4 / 35 | 3230 |
| 4 | 2 | 64.8 | 79.7 | 5 / 35 | 3364 |
| 5 | 2 | 63.7 | 76.8 | 5 / 35 | 3327 |
| 6 | 2 | 62.9 | 75.6 | 2 / 35 | 2986 |
| 7 | 2 | 63.7 | 78.7 | 0 / 35 | 3240 |
| 8 | 2 | 63.8 | 77.1 | 3 / 35 | 3280 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 113 | 15% |
| brainfade.melee.Dusk 0.44 | 16 | 44% |
| dummy.micro.Sparrow 2.5 | 6 | 33% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 67% |
| Krabb.akim2.Akim2 1.1b | 2 | 100% |

Hadur died in 254 of 280 rounds, at a mean tick of 968. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 151 | 59% | 166 |
| brainfade.melee.Dusk 0.44 | 35 | 14% | 44 |
| dummy.micro.Sparrow 2.5 | 30 | 12% | 31 |
| wcsv.melee.EngineerMelee 0.1 | 19 | 7% | 20 |
| jab.DiamondStealer 5 | 6 | 2% | 6 |
| mz.NanoGod 2.02 | 5 | 2% | 6 |
| Krabb.akim2.Akim2 1.1b | 3 | 1% | 4 |
| cvt.Firsty 1.0 | 2 | 1% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 214127 melee ticks, 56311 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 104 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 104 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 0.

Targeting waves (275 rounds): 68698 sent, 62585 reached their opponent, 10941 virtual hits (17.5% of those reached).

## Melee bench: F44

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 161 over 8 battles (20.1 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 89.5 | 169 / 280 | 1.94 | 19.4% | 40275 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.4% | 169 |
| stelo.Liblix 0.3.1 | 2.0 | 16.0% | 72 |
| tzu.TheArtOfWar 1.2 | 3.0 | 14.6% | 28 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.5 | 9.5% | 1 |
| jwirde.Gort 2.0 | 5.0 | 9.4% | 6 |
| wompi.Quokka 1.6 | 5.6 | 8.3% | 3 |
| disan.Chair 2.2.0 | 7.3 | 7.3% | 1 |
| stf.PanzerGeneral 0.1 | 7.6 | 6.6% | 0 |
| sample.Crazy 1.0 | 9.3 | 4.7% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 88.6 | 20 / 35 | 5039 |
| 2 | 1 | 71.1 | 94.0 | 27 / 35 | 4958 |
| 3 | 1 | 70.8 | 92.4 | 26 / 35 | 5401 |
| 4 | 1 | 70.1 | 91.4 | 22 / 35 | 5148 |
| 5 | 1 | 68.3 | 86.7 | 17 / 35 | 4725 |
| 6 | 1 | 69.4 | 88.9 | 20 / 35 | 5082 |
| 7 | 1 | 70.4 | 91.7 | 22 / 35 | 5264 |
| 8 | 1 | 67.0 | 82.5 | 15 / 35 | 4658 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 104 | 67% |
| tzu.TheArtOfWar 1.2 | 65 | 89% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 14 | 93% |
| jwirde.Gort 2.0 | 13 | 100% |
| wompi.Quokka 1.6 | 7 | 71% |
| disan.Chair 2.2.0 | 6 | 83% |
| stf.PanzerGeneral 0.1 | 2 | 100% |
| sample.Crazy 1.0 | 2 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 111 of 280 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 51 | 46% | 129 |
| tzu.TheArtOfWar 1.2 | 27 | 24% | 74 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 13 | 12% | 22 |
| jwirde.Gort 2.0 | 10 | 9% | 29 |
| disan.Chair 2.2.0 | 5 | 5% | 9 |
| wompi.Quokka 1.6 | 4 | 4% | 8 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 6 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 3 |

Posture (Hadur's M records, 270 rounds): 212257 melee ticks, 54006 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 97 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (270 rounds): longest scan gap while four or more were alive 97 ticks (270 rounds over 8); rounds whose longest gap at any count was over 8: 270; robots dropped as dead without a death event: 0.

Targeting waves (270 rounds): 72994 sent, 67128 reached their opponent, 15136 virtual hits (22.5% of those reached).

## Melee bench: F45

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 128 over 8 battles (16.0 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.9 | 124 / 280 | 2.18 | 19.1% | 41518 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.1% | 124 |
| eem.IWillFireNoBullet v2.8 | 2.6 | 12.9% | 120 |
| jje.BagPuss 1.2 | 3.0 | 12.3% | 9 |
| sul.Lunar 1.1 | 4.3 | 10.7% | 13 |
| myl.nano.Graviton 1.10 | 4.4 | 10.4% | 2 |
| hvilela.HVilela 0.9 | 6.5 | 8.4% | 1 |
| fm.claire 1.7 | 6.9 | 8.4% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.4 | 7.7% | 4 |
| wit.Deep7 2.0 | 9.0 | 5.9% | 7 |
| abud.ThirdRobo 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 88.9 | 14 / 35 | 5284 |
| 2 | 1 | 69.2 | 87.9 | 16 / 35 | 5431 |
| 3 | 1 | 67.9 | 84.4 | 11 / 35 | 5263 |
| 4 | 1 | 68.3 | 83.5 | 14 / 35 | 5480 |
| 5 | 1 | 68.1 | 84.8 | 18 / 35 | 4824 |
| 6 | 1 | 68.8 | 87.6 | 17 / 35 | 5158 |
| 7 | 1 | 69.9 | 92.4 | 20 / 35 | 5066 |
| 8 | 1 | 67.9 | 85.7 | 14 / 35 | 5012 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 124 | 47% |
| sul.Lunar 1.1 | 26 | 85% |
| jje.BagPuss 1.2 | 24 | 71% |
| wit.Deep7 2.0 | 10 | 80% |
| myl.nano.Graviton 1.10 | 10 | 90% |
| pez.mini.ChironexFleckeri 0.5 | 7 | 86% |
| fm.claire 1.7 | 2 | 100% |
| hvilela.HVilela 0.9 | 2 | 100% |

Hadur died in 157 of 280 rounds, at a mean tick of 1658. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 72 | 46% | 0 |
| jje.BagPuss 1.2 | 35 | 22% | 97 |
| sul.Lunar 1.1 | 20 | 13% | 74 |
| myl.nano.Graviton 1.10 | 10 | 6% | 49 |
| fm.claire 1.7 | 10 | 6% | 19 |
| pez.mini.ChironexFleckeri 0.5 | 6 | 4% | 19 |
| wit.Deep7 2.0 | 2 | 1% | 11 |
| hvilela.HVilela 0.9 | 1 | 1% | 7 |
| abud.ThirdRobo 1.0 | 1 | 1% | 2 |

Posture (Hadur's M records, 273 rounds): 286931 melee ticks, 135526 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 65 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 0.

Targeting waves (273 rounds): 86796 sent, 80791 reached their opponent, 12974 virtual hits (16.1% of those reached).

## Melee bench: F46

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 125 over 8 battles (15.6 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 82.4 | 79 / 280 | 2.59 | 15.9% | 30339 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.6 | 16.8% | 83 |
| rsalesc.melee.Medina 0.4.5 | 1.9 | 16.6% | 98 |
| hadur2.Hadur 3.17.1aa | 2.5 | 15.9% | 79 |
| mz.MicroSheep 1.0 | 4.1 | 10.5% | 5 |
| cx.Princess 1.0 | 5.0 | 9.8% | 13 |
| sadoner.killer 0.2 | 5.9 | 9.3% | 0 |
| arthord.NanoSatanMelee Beta | 7.1 | 7.3% | 2 |
| jeremyreeder.collective.Prophet 5 | 8.3 | 5.7% | 0 |
| kurios.DOSexe .9a | 8.6 | 5.1% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.0 | 79.0 | 9 / 35 | 3489 |
| 2 | 2 | 65.8 | 85.1 | 11 / 35 | 3953 |
| 3 | 3 | 64.0 | 79.7 | 5 / 35 | 3890 |
| 4 | 3 | 64.9 | 81.0 | 7 / 35 | 4038 |
| 5 | 1 | 66.7 | 86.0 | 13 / 35 | 4068 |
| 6 | 3 | 64.0 | 80.0 | 10 / 35 | 3663 |
| 7 | 3 | 65.4 | 84.8 | 12 / 35 | 3564 |
| 8 | 2 | 65.1 | 83.5 | 12 / 35 | 3674 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 77 | 64% |
| rsalesc.melee.Medina 0.4.5 | 54 | 26% |
| cx.Princess 1.0 | 8 | 50% |
| mz.MicroSheep 1.0 | 8 | 75% |
| arthord.NanoSatanMelee Beta | 5 | 80% |
| sadoner.killer 0.2 | 2 | 100% |

Hadur died in 202 of 280 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 85 | 42% | 129 |
| rsalesc.melee.Medina 0.4.5 | 68 | 34% | 88 |
| arthord.NanoSatanMelee Beta | 14 | 7% | 16 |
| sadoner.killer 0.2 | 10 | 5% | 12 |
| cx.Princess 1.0 | 10 | 5% | 11 |
| mz.MicroSheep 1.0 | 9 | 4% | 18 |
| jeremyreeder.collective.Prophet 5 | 4 | 2% | 4 |
| kurios.DOSexe .9a | 2 | 1% | 2 |

Posture (Hadur's M records, 273 rounds): 198617 melee ticks, 56834 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 55 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 0.

Targeting waves (273 rounds): 60130 sent, 54095 reached their opponent, 8857 virtual hits (16.4% of those reached).

