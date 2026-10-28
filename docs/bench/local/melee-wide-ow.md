# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 535 over 8 battles (66.9 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 85.3 | 64 / 280 | 2.32 | 17.4% | 42574 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.2% | 195 |
| hadur2.Hadur 3.18.1ow | 2.0 | 17.4% | 64 |
| sgp.JollyNinja 3.53 | 3.4 | 11.4% | 15 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.4 | 11.0% | 1 |
| mz.MicroGodMelee 1 | 4.4 | 10.6% | 2 |
| lorneswork.Predator 1.0 | 5.9 | 9.6% | 3 |
| adt.Ar2 1.0 | 7.0 | 7.2% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 4.9% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.4% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.8 | 87.0 | 12 / 35 | 5704 |
| 2 | 2 | 68.1 | 84.1 | 6 / 35 | 5679 |
| 3 | 2 | 67.1 | 86.0 | 9 / 35 | 4892 |
| 4 | 2 | 67.9 | 87.3 | 11 / 35 | 5187 |
| 5 | 2 | 67.0 | 84.4 | 5 / 35 | 5306 |
| 6 | 2 | 66.3 | 84.1 | 5 / 35 | 4933 |
| 7 | 2 | 67.0 | 83.8 | 5 / 35 | 5350 |
| 8 | 2 | 68.2 | 85.7 | 11 / 35 | 5523 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 160 | 11% |
| sgp.JollyNinja 3.53 | 22 | 77% |
| mz.MicroGodMelee 1 | 16 | 94% |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 100% |
| lorneswork.Predator 1.0 | 7 | 71% |

Hadur died in 220 of 280 rounds, at a mean tick of 1143. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 156 | 71% | 182 |
| sgp.JollyNinja 3.53 | 21 | 10% | 30 |
| simonton.nano.WeekendObsession_Melee 1.0 | 12 | 5% | 20 |
| lorneswork.Predator 1.0 | 12 | 5% | 16 |
| mz.MicroGodMelee 1 | 8 | 4% | 23 |
| adt.Ar2 1.0 | 4 | 2% | 4 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 3 |
| skm.butterfly 1.0 | 1 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 190238 melee ticks, 117741 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 440 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 395 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 60537 sent, 54064 reached their opponent, 11061 virtual hits (20.5% of those reached).

## Melee bench: F02

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 721 over 8 battles (90.1 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 85.5 | 131 / 280 | 2.31 | 18.3% | 38564 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.0 | 18.3% | 131 |
| pulsar.PulsarMax 0.8.9 | 2.4 | 13.7% | 60 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.9 | 13.1% | 33 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.2% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.3% | 15 |
| sch.Simone 0.3d | 6.9 | 8.2% | 14 |
| Noran.BitchingElk 0.054 | 6.9 | 8.2% | 22 |
| fnc.bandit.Bandit 5.2.0 | 7.3 | 7.9% | 1 |
| stelo.PatternRobot 1.0 | 9.1 | 5.4% | 0 |
| fullsail.SweetTea 1.1 | 9.9 | 3.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 83.5 | 17 / 35 | 4616 |
| 2 | 1 | 68.2 | 88.6 | 18 / 35 | 4787 |
| 3 | 1 | 66.7 | 82.5 | 14 / 35 | 4577 |
| 4 | 1 | 68.2 | 84.1 | 17 / 35 | 5327 |
| 5 | 1 | 67.4 | 84.8 | 16 / 35 | 4853 |
| 6 | 1 | 67.8 | 85.7 | 16 / 35 | 4970 |
| 7 | 1 | 68.4 | 87.6 | 17 / 35 | 4619 |
| 8 | 1 | 67.9 | 87.0 | 16 / 35 | 4815 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 61 | 46% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 51 | 75% |
| com.cohesiva.robocode.ManOwaR 1.0 | 28 | 68% |
| sch.Simone 0.3d | 22 | 77% |
| Noran.BitchingElk 0.054 | 21 | 43% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 100% |
| fnc.bandit.Bandit 5.2.0 | 6 | 100% |
| stelo.PatternRobot 1.0 | 1 | 100% |

Hadur died in 154 of 280 rounds, at a mean tick of 997. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 51 | 33% | 79 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 25 | 16% | 68 |
| com.cohesiva.robocode.ManOwaR 1.0 | 19 | 12% | 39 |
| lrem.micro.SpikeSoldier 0.4 | 18 | 12% | 30 |
| Noran.BitchingElk 0.054 | 15 | 10% | 22 |
| sch.Simone 0.3d | 12 | 8% | 24 |
| stelo.PatternRobot 1.0 | 4 | 3% | 6 |
| fnc.bandit.Bandit 5.2.0 | 3 | 2% | 9 |
| fullsail.SweetTea 1.1 | 2 | 1% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 226768 melee ticks, 60961 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 41 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 4.

Targeting waves (275 rounds): 80432 sent, 73859 reached their opponent, 12411 virtual hits (16.8% of those reached).

## Melee bench: F03

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 342 over 8 battles (42.8 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 91.9 | 213 / 280 | 1.73 | 20.5% | 50799 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.0 | 20.5% | 213 |
| radnor.DoctorBob 1.42 | 2.1 | 14.1% | 27 |
| kawigi.nano.Lib 1.0 | 3.4 | 12.8% | 12 |
| vuen.Cake 2.51 | 3.5 | 12.6% | 26 |
| urdos.URDOS 1.3 | 5.0 | 9.4% | 2 |
| adt.Ar1 2.1 | 6.5 | 7.4% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 6.9 | 6.8% | 0 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.4 | 5.1% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 85.7 | 23 / 35 | 6129 |
| 2 | 1 | 71.0 | 92.1 | 29 / 35 | 6259 |
| 3 | 1 | 71.8 | 95.6 | 27 / 35 | 6752 |
| 4 | 1 | 70.8 | 92.7 | 26 / 35 | 6077 |
| 5 | 1 | 70.1 | 92.4 | 26 / 35 | 5908 |
| 6 | 1 | 72.3 | 97.1 | 30 / 35 | 6902 |
| 7 | 1 | 69.4 | 87.0 | 24 / 35 | 6160 |
| 8 | 1 | 71.5 | 92.4 | 28 / 35 | 6612 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 85 | 87% |
| radnor.DoctorBob 1.42 | 68 | 94% |
| kawigi.nano.Lib 1.0 | 53 | 98% |
| oa.weak.FlyMk1 0.1 | 6 | 100% |
| adt.Ar1 2.1 | 6 | 83% |
| urdos.URDOS 1.3 | 6 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 5 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 70 of 280 rounds, at a mean tick of 702. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 27 | 39% | 83 |
| vuen.Cake 2.51 | 14 | 20% | 86 |
| kawigi.nano.Lib 1.0 | 10 | 14% | 58 |
| urdos.URDOS 1.3 | 7 | 10% | 17 |
| bwbaugh.nano.Tirunculus 0.0.0a | 6 | 9% | 8 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 1% | 8 |
| oa.weak.FlyMk1 0.1 | 1 | 1% | 8 |
| adt.Ar1 2.1 | 1 | 1% | 8 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 270 rounds): 169083 melee ticks, 53999 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 484 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (270 rounds): longest scan gap while four or more were alive 316 ticks (270 rounds over 8); rounds whose longest gap at any count was over 8: 270; robots dropped as dead without a death event: 0.

Targeting waves (270 rounds): 50877 sent, 44790 reached their opponent, 11759 virtual hits (26.3% of those reached).

## Melee bench: F04

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 740 over 8 battles (92.5 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.3 | 42 / 280 | 2.33 | 17.4% | 43584 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.5% | 211 |
| hadur2.Hadur 3.18.1ow | 2.0 | 17.4% | 42 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.6% | 11 |
| TNT.TNT 0.99.1 | 4.0 | 11.2% | 12 |
| josago.Jorgito 0.16 | 5.0 | 8.9% | 2 |
| css.Delitioner 0.11 | 6.4 | 7.1% | 1 |
| tj.zombie1n 1.0.1 | 6.9 | 6.3% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.4% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.8% | 1 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.9 | 81.6 | 5 / 35 | 5271 |
| 2 | 2 | 68.9 | 87.9 | 7 / 35 | 5716 |
| 3 | 2 | 66.9 | 82.9 | 3 / 35 | 5208 |
| 4 | 2 | 67.5 | 83.2 | 4 / 35 | 5341 |
| 5 | 2 | 68.8 | 87.6 | 9 / 35 | 5510 |
| 6 | 2 | 68.4 | 86.0 | 4 / 35 | 5449 |
| 7 | 2 | 69.5 | 88.9 | 8 / 35 | 5630 |
| 8 | 2 | 67.1 | 84.1 | 2 / 35 | 5459 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 166 | 10% |
| TNT.TNT 0.99.1 | 18 | 50% |
| apc.LeeroyJenkins2 1.0 | 16 | 69% |
| josago.Jorgito 0.16 | 3 | 67% |
| css.Delitioner 0.11 | 2 | 50% |
| tj.zombie1n 1.0.1 | 1 | 100% |
| sp.Nanos.Ember 1.1 | 1 | 100% |

Hadur died in 244 of 280 rounds, at a mean tick of 1264. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 172 | 70% | 191 |
| apc.LeeroyJenkins2 1.0 | 29 | 12% | 37 |
| TNT.TNT 0.99.1 | 20 | 8% | 30 |
| josago.Jorgito 0.16 | 11 | 5% | 12 |
| rampancy.Durandal 2.1d | 3 | 1% | 5 |
| css.Delitioner 0.11 | 2 | 1% | 3 |
| tj.zombie1n 1.0.1 | 1 | 0% | 1 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 264911 melee ticks, 90823 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 86 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 86 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 0.

Targeting waves (276 rounds): 81400 sent, 74714 reached their opponent, 10922 virtual hits (14.6% of those reached).

## Melee bench: F05

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 969 over 8 battles (121.1 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 75.4 | 37 / 280 | 3.22 | 14.7% | 31176 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.4 | 17.7% | 128 |
| justin.DemonicRage 3.4 | 1.6 | 17.3% | 88 |
| hadur2.Hadur 3.18.1ow | 3.0 | 14.7% | 37 |
| wompi.Numbat 2.1 | 4.0 | 12.8% | 18 |
| axeBots.HataMoto 3.09 | 5.4 | 9.0% | 4 |
| ms.Ares 0.19 | 5.6 | 9.2% | 5 |
| supersample.SuperBoxBot 1.0 | 7.4 | 5.8% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.6% | 0 |
| GarmBox.Oranges 1.0 | 9.0 | 4.3% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.9 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.5 | 76.8 | 5 / 35 | 3819 |
| 2 | 3 | 62.2 | 70.5 | 3 / 35 | 3975 |
| 3 | 3 | 63.3 | 76.5 | 4 / 35 | 3757 |
| 4 | 3 | 62.2 | 73.7 | 5 / 35 | 3560 |
| 5 | 3 | 63.2 | 75.2 | 4 / 35 | 3887 |
| 6 | 3 | 63.7 | 76.5 | 2 / 35 | 4028 |
| 7 | 3 | 63.3 | 75.2 | 5 / 35 | 3939 |
| 8 | 3 | 64.8 | 78.4 | 9 / 35 | 4211 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 41 | 41% |
| cb.fire.Firestarter 2.0f | 29 | 14% |
| wompi.Numbat 2.1 | 15 | 67% |
| ms.Ares 0.19 | 5 | 60% |
| axeBots.HataMoto 3.09 | 3 | 67% |

Hadur died in 251 of 280 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 91 | 36% | 106 |
| cb.fire.Firestarter 2.0f | 74 | 29% | 82 |
| wompi.Numbat 2.1 | 46 | 18% | 52 |
| ms.Ares 0.19 | 14 | 6% | 17 |
| axeBots.HataMoto 3.09 | 9 | 4% | 12 |
| supersample.SuperBoxBot 1.0 | 5 | 2% | 6 |
| GarmBox.Oranges 1.0 | 2 | 1% | 3 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 2 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 279 rounds): 203064 melee ticks, 37133 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 740 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (279 rounds): longest scan gap while four or more were alive 238 ticks (279 rounds over 8); rounds whose longest gap at any count was over 8: 279; robots dropped as dead without a death event: 2.

Targeting waves (279 rounds): 63560 sent, 56715 reached their opponent, 9690 virtual hits (17.1% of those reached).

## Melee bench: F06

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 467 over 8 battles (58.4 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 87.8 | 154 / 280 | 2.10 | 18.9% | 40528 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.0 | 18.9% | 154 |
| jekl.StoneGhost 0.7 | 2.3 | 14.5% | 33 |
| origin.SleepSiphon 1.7b | 3.0 | 13.6% | 50 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 11.9% | 25 |
| mld.Wisdom 1.0 | 4.8 | 10.4% | 2 |
| gg.Wolverine 2.0 | 6.4 | 8.6% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 7.1% | 10 |
| DBall.NUKE 0.1 | 7.8 | 6.4% | 1 |
| spinnercat.Omen 1.0 | 8.9 | 5.7% | 1 |
| sample.Fire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 78.7 | 14 / 35 | 4605 |
| 2 | 1 | 70.5 | 92.7 | 22 / 35 | 5539 |
| 3 | 1 | 67.7 | 83.8 | 15 / 35 | 4854 |
| 4 | 1 | 69.2 | 88.9 | 19 / 35 | 5250 |
| 5 | 1 | 68.9 | 87.9 | 19 / 35 | 5012 |
| 6 | 1 | 70.2 | 92.4 | 21 / 35 | 5216 |
| 7 | 1 | 69.9 | 90.2 | 24 / 35 | 5024 |
| 8 | 1 | 68.9 | 87.9 | 20 / 35 | 5028 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 63 | 89% |
| origin.SleepSiphon 1.7b | 54 | 69% |
| pe.minimelee.SandboxMiniMelee 1.1 | 48 | 79% |
| gg.Wolverine 2.0 | 14 | 79% |
| ers.nano.hawk.HawkLA 3.0m | 11 | 45% |
| mld.Wisdom 1.0 | 6 | 100% |

Hadur died in 131 of 280 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 43 | 33% | 89 |
| jekl.StoneGhost 0.7 | 31 | 24% | 72 |
| pe.minimelee.SandboxMiniMelee 1.1 | 18 | 14% | 52 |
| mld.Wisdom 1.0 | 14 | 11% | 25 |
| ers.nano.hawk.HawkLA 3.0m | 11 | 8% | 18 |
| gg.Wolverine 2.0 | 10 | 8% | 17 |
| spinnercat.Omen 1.0 | 1 | 1% | 3 |
| DBall.NUKE 0.1 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 198683 melee ticks, 57837 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 605 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 315 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 62002 sent, 55611 reached their opponent, 12173 virtual hits (21.9% of those reached).

## Melee bench: F07

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 755 over 8 battles (94.4 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 92.2 | 152 / 280 | 1.70 | 20.4% | 50504 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.0 | 20.4% | 152 |
| rtk.Tachikoma 1.0 | 2.4 | 16.6% | 51 |
| rsalesc.melee.Monk 0.3.6c | 2.6 | 16.2% | 43 |
| oog.melee.CapuletDroid 1.1 | 4.4 | 11.3% | 12 |
| franzor.Lizt 1.3.1 | 4.6 | 11.1% | 22 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.0% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.7% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.2% | 0 |
| sample.Target 1.0 | 9.4 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 9.6 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 92.4 | 18 / 35 | 5974 |
| 2 | 1 | 72.3 | 92.7 | 21 / 35 | 6287 |
| 3 | 1 | 72.1 | 93.0 | 19 / 35 | 6280 |
| 4 | 1 | 71.8 | 91.7 | 18 / 35 | 6411 |
| 5 | 1 | 72.9 | 93.3 | 21 / 35 | 6978 |
| 6 | 1 | 70.7 | 89.2 | 15 / 35 | 6057 |
| 7 | 1 | 72.3 | 92.7 | 21 / 35 | 6408 |
| 8 | 1 | 71.8 | 92.7 | 19 / 35 | 6109 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 117 | 70% |
| rsalesc.melee.Monk 0.3.6c | 47 | 34% |
| franzor.Lizt 1.3.1 | 43 | 70% |
| oog.melee.CapuletDroid 1.1 | 27 | 78% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 134 of 280 rounds, at a mean tick of 1392. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 58 | 43% | 135 |
| rsalesc.melee.Monk 0.3.6c | 42 | 31% | 86 |
| franzor.Lizt 1.3.1 | 15 | 11% | 2 |
| oog.melee.CapuletDroid 1.1 | 10 | 7% | 47 |
| exauge.GateKeeper 1.1.121g | 3 | 2% | 6 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 3 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 253672 melee ticks, 116212 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 55 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 0.

Targeting waves (275 rounds): 76206 sent, 69668 reached their opponent, 14212 virtual hits (20.4% of those reached).

## Melee bench: F08

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1124 over 8 battles (140.5 per battle, most in one battle 154). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 90.6 | 182 / 280 | 1.85 | 19.6% | 40475 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.0 | 19.6% | 182 |
| shrub.Vapour v159 | 2.5 | 12.5% | 25 |
| tm.Yuugao 1.0 | 2.6 | 13.2% | 35 |
| Krabb.sliNk.Garm 0.9u | 4.5 | 10.7% | 13 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 10.1% | 13 |
| jwst.DAD.DarkAndDarker 1.1 | 6.3 | 8.6% | 10 |
| m3thos.Eva00 1.1 | 6.4 | 8.5% | 3 |
| qualidafial.MajorDick 1.0.1 | 8.5 | 6.2% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 5.3% | 0 |
| SHAM.WOW 1.4 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 92.4 | 26 / 35 | 5384 |
| 2 | 1 | 68.9 | 90.8 | 21 / 35 | 4841 |
| 3 | 1 | 69.3 | 88.9 | 24 / 35 | 5096 |
| 4 | 1 | 68.0 | 88.6 | 18 / 35 | 4778 |
| 5 | 1 | 68.6 | 88.3 | 22 / 35 | 4901 |
| 6 | 1 | 70.1 | 92.7 | 25 / 35 | 5152 |
| 7 | 1 | 69.6 | 90.2 | 23 / 35 | 5137 |
| 8 | 1 | 70.3 | 93.0 | 23 / 35 | 5186 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 76 | 79% |
| shrub.Vapour v159 | 57 | 74% |
| com.spp.robocode.MostlyHarmless 010 | 39 | 95% |
| Krabb.sliNk.Garm 0.9u | 32 | 75% |
| m3thos.Eva00 1.1 | 9 | 78% |
| jwst.DAD.DarkAndDarker 1.1 | 8 | 75% |
| SHAM.WOW 1.4 | 4 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |

Hadur died in 106 of 280 rounds, at a mean tick of 895. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 26 | 25% | 56 |
| tm.Yuugao 1.0 | 25 | 24% | 84 |
| Krabb.sliNk.Garm 0.9u | 14 | 13% | 38 |
| com.spp.robocode.MostlyHarmless 010 | 12 | 11% | 51 |
| m3thos.Eva00 1.1 | 9 | 8% | 20 |
| jwst.DAD.DarkAndDarker 1.1 | 8 | 8% | 23 |
| SHAM.WOW 1.4 | 2 | 2% | 4 |
| zyx.nano.BacillusComma 1.0 | 2 | 2% | 2 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 2 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 278 rounds): 200850 melee ticks, 61715 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 441 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (278 rounds): longest scan gap while four or more were alive 179 ticks (278 rounds over 8); rounds whose longest gap at any count was over 8: 278; robots dropped as dead without a death event: 3.

Targeting waves (278 rounds): 65566 sent, 59020 reached their opponent, 11049 virtual hits (18.7% of those reached).

## Melee bench: F09

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 796 over 8 battles (99.5 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 76.8 | 63 / 280 | 3.09 | 15.3% | 29773 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 17.6% | 138 |
| hadur2.Hadur 3.18.1ow | 2.0 | 15.3% | 63 |
| kc.micro.Figment 1.0 | 2.8 | 14.2% | 31 |
| yagami.Tidus 0.11 | 4.3 | 11.0% | 0 |
| pedersen.Grishnakh 1.0 | 4.9 | 10.4% | 24 |
| mc2.enemy.Original 0.9 | 5.9 | 9.4% | 19 |
| dft.Calliope 5.6 | 7.0 | 7.4% | 5 |
| step.nanoPri 1.0 | 8.4 | 5.4% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 4.9% | 0 |
| rdm.Dueler 0.4x | 9.6 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 77.1 | 6 / 35 | 3579 |
| 2 | 2 | 64.9 | 78.4 | 8 / 35 | 3760 |
| 3 | 1 | 65.3 | 80.6 | 11 / 35 | 4017 |
| 4 | 2 | 63.2 | 74.6 | 8 / 35 | 3922 |
| 5 | 3 | 62.0 | 74.3 | 5 / 35 | 3296 |
| 6 | 2 | 61.1 | 68.9 | 8 / 35 | 3346 |
| 7 | 3 | 61.8 | 73.3 | 2 / 35 | 3544 |
| 8 | 1 | 67.7 | 87.0 | 15 / 35 | 4309 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 75 | 20% |
| kc.micro.Figment 1.0 | 41 | 88% |
| pedersen.Grishnakh 1.0 | 11 | 45% |
| mc2.enemy.Original 0.9 | 7 | 29% |
| yagami.Tidus 0.11 | 5 | 100% |
| dft.Calliope 5.6 | 1 | 0% |

Hadur died in 223 of 280 rounds, at a mean tick of 861. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 94 | 42% | 113 |
| kc.micro.Figment 1.0 | 38 | 17% | 71 |
| yagami.Tidus 0.11 | 26 | 12% | 29 |
| mc2.enemy.Original 0.9 | 25 | 11% | 27 |
| pedersen.Grishnakh 1.0 | 19 | 9% | 22 |
| robar.nano.Assertive_Melee 0.2 | 7 | 3% | 8 |
| dft.Calliope 5.6 | 4 | 2% | 4 |
| step.nanoPri 1.0 | 3 | 1% | 3 |
| rdm.Dueler 0.4x | 1 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 198960 melee ticks, 49610 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 56 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 1.

Targeting waves (276 rounds): 65272 sent, 59033 reached their opponent, 8471 virtual hits (14.3% of those reached).

## Melee bench: F10

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 440 over 8 battles (55.0 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 93.3 | 203 / 280 | 1.60 | 20.3% | 46202 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.0 | 20.3% | 203 |
| DTF.Kludgy 1.2b | 2.4 | 14.2% | 25 |
| ne.Chimera 1.2 | 2.8 | 13.5% | 17 |
| ejb.Polaris 1.0.1 | 4.0 | 12.2% | 21 |
| vStar.RAFzilla 2.15 | 5.1 | 10.1% | 7 |
| tvv.micro.Antares 1.1.1 | 5.8 | 9.9% | 4 |
| kurios.DOSexe .9b | 7.5 | 5.7% | 1 |
| sam.Samspin 1.0 | 7.8 | 5.5% | 1 |
| donjezza.Muncho 1.0 | 9.3 | 4.3% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 94.6 | 26 / 35 | 5733 |
| 2 | 1 | 72.6 | 97.5 | 29 / 35 | 6389 |
| 3 | 1 | 71.2 | 93.7 | 26 / 35 | 6165 |
| 4 | 1 | 69.1 | 88.6 | 20 / 35 | 5440 |
| 5 | 1 | 70.6 | 94.0 | 27 / 35 | 5408 |
| 6 | 1 | 70.4 | 92.1 | 25 / 35 | 5830 |
| 7 | 1 | 70.2 | 91.7 | 24 / 35 | 5455 |
| 8 | 1 | 71.2 | 94.6 | 26 / 35 | 5782 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 75 | 84% |
| ne.Chimera 1.2 | 67 | 84% |
| ejb.Polaris 1.0.1 | 52 | 81% |
| vStar.RAFzilla 2.15 | 19 | 79% |
| tvv.micro.Antares 1.1.1 | 17 | 94% |
| kurios.DOSexe .9b | 8 | 100% |
| donjezza.Muncho 1.0 | 2 | 50% |
| sam.Samspin 1.0 | 2 | 100% |

Hadur died in 79 of 280 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 28 | 35% | 83 |
| ejb.Polaris 1.0.1 | 19 | 24% | 69 |
| ne.Chimera 1.2 | 18 | 23% | 61 |
| vStar.RAFzilla 2.15 | 5 | 6% | 23 |
| tvv.micro.Antares 1.1.1 | 4 | 5% | 21 |
| kurios.DOSexe .9b | 1 | 1% | 13 |
| donjezza.Muncho 1.0 | 1 | 1% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 1% | 1 |
| sam.Samspin 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 268 rounds): 191633 melee ticks, 67570 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 104 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (268 rounds): longest scan gap while four or more were alive 104 ticks (268 rounds over 8); rounds whose longest gap at any count was over 8: 268; robots dropped as dead without a death event: 1.

Targeting waves (268 rounds): 62654 sent, 56425 reached their opponent, 10912 virtual hits (19.3% of those reached).

## Melee bench: F11

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 560 over 8 battles (70.0 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 78.3 | 76 / 280 | 2.96 | 15.6% | 29827 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.4 | 16.5% | 94 |
| hadur2.Hadur 3.18.1ow | 1.6 | 15.6% | 76 |
| cx.mini.Nimrod 0.55 | 3.1 | 12.7% | 32 |
| djc.DynaBot 0.1.1 | 4.4 | 10.6% | 17 |
| br2.MobyDickBot 1.6 | 5.6 | 9.5% | 19 |
| rdt199.Warlord 0.73 | 5.9 | 9.2% | 23 |
| uji.YellohFellah 1.0 | 6.0 | 9.2% | 17 |
| KiraNL.Chupacabra 0.4 | 8.0 | 7.1% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.1% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.1 | 77.1 | 11 / 35 | 3365 |
| 2 | 2 | 64.3 | 81.9 | 8 / 35 | 3724 |
| 3 | 2 | 61.8 | 70.8 | 8 / 35 | 3740 |
| 4 | 1 | 65.8 | 83.5 | 12 / 35 | 3905 |
| 5 | 1 | 62.9 | 76.8 | 11 / 35 | 3598 |
| 6 | 2 | 64.1 | 76.5 | 9 / 35 | 4112 |
| 7 | 2 | 62.7 | 78.7 | 7 / 35 | 3186 |
| 8 | 1 | 64.8 | 80.6 | 10 / 35 | 4197 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 59 | 42% |
| uji.YellohFellah 1.0 | 20 | 90% |
| djc.DynaBot 0.1.1 | 20 | 75% |
| cx.mini.Nimrod 0.55 | 16 | 31% |
| rdt199.Warlord 0.73 | 15 | 67% |
| br2.MobyDickBot 1.6 | 9 | 33% |
| KiraNL.Chupacabra 0.4 | 1 | 0% |

Hadur died in 208 of 280 rounds, at a mean tick of 842. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 80 | 38% | 110 |
| cx.mini.Nimrod 0.55 | 50 | 24% | 60 |
| rdt199.Warlord 0.73 | 27 | 13% | 35 |
| br2.MobyDickBot 1.6 | 14 | 7% | 15 |
| uji.YellohFellah 1.0 | 13 | 6% | 24 |
| djc.DynaBot 0.1.1 | 11 | 5% | 24 |
| stelo.MirrorNano 1.3 | 6 | 3% | 7 |
| KiraNL.Chupacabra 0.4 | 3 | 1% | 5 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 211145 melee ticks, 41189 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 40 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 0.

Targeting waves (276 rounds): 68857 sent, 62171 reached their opponent, 8248 virtual hits (13.3% of those reached).

## Melee bench: F12

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 390 over 8 battles (48.8 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 85.3 | 157 / 280 | 2.32 | 17.9% | 32690 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.0 | 17.9% | 157 |
| bts.wiki.RipCurl 0.9b | 2.0 | 14.0% | 41 |
| darkcanuck.Leon 1.01 | 3.5 | 12.5% | 29 |
| nat.PallasHawk 1.0 | 3.6 | 12.3% | 32 |
| brainfade.melee.Genghis 0.36 | 4.9 | 10.2% | 14 |
| jrm.Test0 1.0 | 6.1 | 8.2% | 2 |
| cs.sheldor.Talon 1.1 | 7.6 | 7.0% | 2 |
| jp.Perpy 16.0 | 8.3 | 6.5% | 2 |
| jaybot.bots.Oddball 4.0 | 8.8 | 5.6% | 0 |
| stuff.Vlad 0.1 | 9.3 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.6 | 23 / 35 | 4497 |
| 2 | 1 | 64.6 | 77.1 | 15 / 35 | 3941 |
| 3 | 1 | 65.6 | 81.6 | 16 / 35 | 3937 |
| 4 | 1 | 66.9 | 87.9 | 17 / 35 | 3985 |
| 5 | 1 | 67.5 | 86.0 | 22 / 35 | 3974 |
| 6 | 1 | 67.8 | 87.0 | 22 / 35 | 4244 |
| 7 | 1 | 66.0 | 82.9 | 16 / 35 | 3797 |
| 8 | 1 | 69.7 | 92.4 | 26 / 35 | 4315 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 60 | 75% |
| darkcanuck.Leon 1.01 | 57 | 82% |
| nat.PallasHawk 1.0 | 41 | 68% |
| brainfade.melee.Genghis 0.36 | 27 | 70% |
| jaybot.bots.Oddball 4.0 | 7 | 100% |
| cs.sheldor.Talon 1.1 | 5 | 80% |
| jp.Perpy 16.0 | 3 | 100% |
| stuff.Vlad 0.1 | 3 | 67% |
| jrm.Test0 1.0 | 2 | 100% |

Hadur died in 126 of 280 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 37 | 29% | 70 |
| nat.PallasHawk 1.0 | 28 | 22% | 64 |
| darkcanuck.Leon 1.01 | 17 | 13% | 65 |
| brainfade.melee.Genghis 0.36 | 17 | 13% | 31 |
| jrm.Test0 1.0 | 10 | 8% | 14 |
| cs.sheldor.Talon 1.1 | 6 | 5% | 12 |
| jp.Perpy 16.0 | 6 | 5% | 7 |
| stuff.Vlad 0.1 | 2 | 2% | 6 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 10 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 173208 melee ticks, 48219 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 55 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 58942 sent, 52348 reached their opponent, 8866 virtual hits (16.9% of those reached).

## Melee bench: F13

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 256 over 8 battles (32.0 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 80.1 | 72 / 280 | 2.79 | 15.6% | 32497 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 16.6% | 106 |
| ags.Glacier 0.2.11 | 1.9 | 16.4% | 59 |
| hadur2.Hadur 3.18.1ow | 2.6 | 15.6% | 72 |
| shinh.Entangled 0.3 | 4.3 | 12.3% | 30 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.7% | 12 |
| apc.Colossus2 0.17 | 6.3 | 8.0% | 0 |
| stelo.Wang 1.0 | 6.8 | 7.0% | 1 |
| ayk.WallHugger 1.0 | 8.5 | 4.9% | 0 |
| maribo.FollowFire 1 | 8.5 | 4.4% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.0 | 79.4 | 9 / 35 | 4104 |
| 2 | 3 | 63.5 | 75.2 | 7 / 35 | 4250 |
| 3 | 3 | 64.8 | 81.3 | 6 / 35 | 4080 |
| 4 | 3 | 63.3 | 74.9 | 8 / 35 | 3836 |
| 5 | 3 | 64.1 | 82.5 | 6 / 35 | 3632 |
| 6 | 2 | 66.6 | 85.4 | 12 / 35 | 4252 |
| 7 | 3 | 63.5 | 75.6 | 10 / 35 | 3985 |
| 8 | 2 | 67.3 | 86.7 | 14 / 35 | 4358 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 58 | 29% |
| ags.Glacier 0.2.11 | 58 | 60% |
| shinh.Entangled 0.3 | 25 | 44% |
| gh.micro.Gruweltje 0.7 | 12 | 58% |
| stelo.Wang 1.0 | 2 | 100% |

Hadur died in 209 of 280 rounds, at a mean tick of 861. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 71 | 34% | 94 |
| ags.Glacier 0.2.11 | 62 | 30% | 90 |
| shinh.Entangled 0.3 | 36 | 17% | 46 |
| gh.micro.Gruweltje 0.7 | 24 | 11% | 34 |
| maribo.FollowFire 1 | 6 | 3% | 5 |
| stelo.Wang 1.0 | 4 | 2% | 5 |
| apc.Colossus2 0.17 | 3 | 1% | 4 |
| ayk.WallHugger 1.0 | 2 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 271 rounds): 196460 melee ticks, 52225 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (271 rounds): longest scan gap while four or more were alive 62 ticks (271 rounds over 8); rounds whose longest gap at any count was over 8: 271; robots dropped as dead without a death event: 1.

Targeting waves (271 rounds): 57539 sent, 50950 reached their opponent, 8136 virtual hits (16.0% of those reached).

## Melee bench: F14

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 712 over 8 battles (89.0 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 93.9 | 211 / 280 | 1.55 | 20.8% | 47338 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.0 | 20.8% | 211 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.8% | 20 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.4% | 33 |
| sanyi.mikrobi.Roberto 1.0 | 4.6 | 9.9% | 3 |
| co.edu.usb.rc.LidisTron 1.0 | 4.9 | 9.6% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 5.5 | 9.1% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.1 | 8.2% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.9 | 7.7% | 3 |
| pa.Improved 1.0 | 9.0 | 5.8% | 2 |
| sample.TrackFire 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 96.2 | 30 / 35 | 6091 |
| 2 | 1 | 71.0 | 92.4 | 26 / 35 | 5778 |
| 3 | 1 | 72.0 | 94.9 | 27 / 35 | 6299 |
| 4 | 1 | 71.7 | 95.2 | 26 / 35 | 5780 |
| 5 | 1 | 69.4 | 87.9 | 23 / 35 | 5443 |
| 6 | 1 | 71.1 | 94.0 | 23 / 35 | 5950 |
| 7 | 1 | 71.8 | 95.9 | 28 / 35 | 5970 |
| 8 | 1 | 71.7 | 94.6 | 28 / 35 | 6027 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 101 | 93% |
| catcat20.shape.Theta 0.018 | 71 | 72% |
| sanyi.mikrobi.Roberto 1.0 | 27 | 96% |
| sheldor.micro.PointInLineRRAL 1.0 | 19 | 84% |
| co.edu.usb.rc.LidisTron 1.0 | 16 | 94% |
| pa.Improved 1.0 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 67% |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 100% |

Hadur died in 75 of 280 rounds, at a mean tick of 928. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 30 | 40% | 75 |
| simonton.micro.Sprout 1.1.3 | 19 | 25% | 111 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 8% | 9 |
| sanyi.mikrobi.Roberto 1.0 | 5 | 7% | 36 |
| co.edu.usb.rc.LidisTron 1.0 | 4 | 5% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 4% | 24 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 3% | 6 |
| pa.Improved 1.0 | 1 | 1% | 6 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 198015 melee ticks, 70709 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 494 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 288 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 1.

Targeting waves (276 rounds): 61497 sent, 55116 reached their opponent, 13349 virtual hits (24.2% of those reached).

## Melee bench: F15

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 917 over 8 battles (114.6 per battle, most in one battle 237). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 84.7 | 131 / 280 | 2.38 | 18.2% | 40057 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.0 | 18.2% | 131 |
| kawigi.micro.Shiz 1.1 | 2.6 | 13.8% | 30 |
| emp.Yngwie 1.11 | 2.8 | 13.8% | 81 |
| mld.DustBunny 3.8 | 3.8 | 12.4% | 10 |
| cb.nano.Insomnia 1.0 | 5.3 | 10.0% | 7 |
| kawigi.robot.Girl 1.2 | 5.6 | 9.5% | 20 |
| Grystrion.TrackerWO 1.0 | 7.4 | 6.6% | 1 |
| lambdaxy.TBot 0.1 | 7.6 | 6.5% | 0 |
| divineomega.TrialBot 0.003 | 9.4 | 4.9% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.6 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 83.5 | 18 / 35 | 4681 |
| 2 | 1 | 68.9 | 86.7 | 18 / 35 | 5405 |
| 3 | 1 | 66.5 | 80.6 | 9 / 35 | 4964 |
| 4 | 1 | 67.7 | 84.4 | 16 / 35 | 5037 |
| 5 | 1 | 68.8 | 88.9 | 17 / 35 | 4980 |
| 6 | 1 | 67.3 | 82.5 | 15 / 35 | 4942 |
| 7 | 1 | 68.3 | 84.8 | 17 / 35 | 5099 |
| 8 | 1 | 68.4 | 86.0 | 21 / 35 | 4949 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 76 | 57% |
| mld.DustBunny 3.8 | 32 | 91% |
| kawigi.micro.Shiz 1.1 | 30 | 83% |
| kawigi.robot.Girl 1.2 | 21 | 81% |
| cb.nano.Insomnia 1.0 | 12 | 67% |
| divineomega.TrialBot 0.003 | 6 | 83% |
| Grystrion.TrackerWO 1.0 | 2 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |

Hadur died in 157 of 280 rounds, at a mean tick of 993. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 68 | 43% | 119 |
| mld.DustBunny 3.8 | 24 | 15% | 43 |
| kawigi.micro.Shiz 1.1 | 21 | 13% | 60 |
| cb.nano.Insomnia 1.0 | 16 | 10% | 18 |
| kawigi.robot.Girl 1.2 | 12 | 8% | 17 |
| Grystrion.TrackerWO 1.0 | 4 | 3% | 7 |
| divineomega.TrialBot 0.003 | 3 | 2% | 13 |
| lambdaxy.TBot 0.1 | 2 | 1% | 2 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 222978 melee ticks, 64817 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 82 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 82 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 1.

Targeting waves (275 rounds): 72631 sent, 66226 reached their opponent, 10805 virtual hits (16.3% of those reached).

## Melee bench: F16

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 582 over 8 battles (72.8 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 84.2 | 130 / 280 | 2.42 | 18.5% | 42991 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.1 | 18.5% | 130 |
| gh.Griezel 0.5.2 | 2.0 | 15.6% | 73 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.9 | 14.2% | 12 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 11.0% | 45 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 9.2% | 3 |
| tvv.nano.Polaris 1.2 | 5.9 | 8.6% | 5 |
| stelo.IntrinsicVolatility 1.4 | 6.6 | 8.0% | 4 |
| asd.Cthulhu 1.3 | 8.9 | 5.0% | 1 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 5.0% | 5 |
| repositorio.NanoStep 1.0 | 9.1 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 86.3 | 17 / 35 | 5336 |
| 2 | 1 | 67.9 | 82.2 | 19 / 35 | 5521 |
| 3 | 2 | 67.2 | 82.5 | 12 / 35 | 5013 |
| 4 | 1 | 67.0 | 82.5 | 16 / 35 | 4737 |
| 5 | 1 | 70.7 | 91.4 | 20 / 35 | 5886 |
| 6 | 1 | 69.4 | 85.4 | 20 / 35 | 5730 |
| 7 | 1 | 67.6 | 80.6 | 15 / 35 | 5358 |
| 8 | 1 | 67.5 | 82.5 | 11 / 35 | 5410 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 79 | 56% |
| techdude.forest.FlamingForest 1.1 | 50 | 66% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 35 | 83% |
| tvv.nano.Polaris 1.2 | 11 | 73% |
| bvh.fnr.Fenrir 0.36l | 8 | 88% |
| divineomega.DivineBot 1.9.4.5 | 5 | 100% |
| stelo.IntrinsicVolatility 1.4 | 4 | 100% |
| repositorio.NanoStep 1.0 | 1 | 0% |

Hadur died in 154 of 280 rounds, at a mean tick of 1050. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 49 | 32% | 101 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 30 | 19% | 52 |
| techdude.forest.FlamingForest 1.1 | 25 | 16% | 53 |
| bvh.fnr.Fenrir 0.36l | 19 | 12% | 26 |
| stelo.IntrinsicVolatility 1.4 | 11 | 7% | 17 |
| tvv.nano.Polaris 1.2 | 7 | 5% | 12 |
| divineomega.DivineBot 1.9.4.5 | 4 | 3% | 11 |
| asd.Cthulhu 1.3 | 4 | 3% | 5 |
| repositorio.NanoStep 1.0 | 1 | 1% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 234600 melee ticks, 74378 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 51 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 0.

Targeting waves (276 rounds): 75771 sent, 69446 reached their opponent, 11858 virtual hits (17.1% of those reached).

## Melee bench: F17

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1059 over 8 battles (132.4 per battle, most in one battle 147). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 86.3 | 139 / 280 | 2.23 | 19.1% | 46224 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.0 | 19.1% | 139 |
| oog.melee.Mercutio 1.0 | 2.5 | 13.3% | 47 |
| cx.BlestPain 1.41 | 3.3 | 12.3% | 46 |
| et.Predator 1.8 | 3.3 | 12.9% | 33 |
| ahf.NanoAndrew .4 | 5.0 | 10.5% | 10 |
| nic.Nicator 2.4 | 6.5 | 9.1% | 5 |
| maribo.melee.BMV 0.1 | 6.5 | 9.0% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.4 | 5.9% | 0 |
| tex.Longbot 0.4 | 8.6 | 5.6% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 89.5 | 21 / 35 | 6231 |
| 2 | 1 | 67.9 | 82.5 | 14 / 35 | 5621 |
| 3 | 1 | 67.6 | 82.9 | 13 / 35 | 5455 |
| 4 | 1 | 70.2 | 89.5 | 18 / 35 | 5898 |
| 5 | 1 | 68.9 | 84.8 | 19 / 35 | 5577 |
| 6 | 1 | 69.8 | 87.9 | 17 / 35 | 5885 |
| 7 | 1 | 68.6 | 84.1 | 18 / 35 | 5658 |
| 8 | 1 | 70.4 | 89.2 | 19 / 35 | 5899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 68 | 72% |
| et.Predator 1.8 | 60 | 72% |
| cx.BlestPain 1.41 | 42 | 36% |
| ahf.NanoAndrew .4 | 18 | 100% |
| maribo.melee.BMV 0.1 | 9 | 100% |
| nic.Nicator 2.4 | 5 | 80% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 149 of 280 rounds, at a mean tick of 1077. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 37 | 25% | 61 |
| oog.melee.Mercutio 1.0 | 33 | 22% | 84 |
| et.Predator 1.8 | 33 | 22% | 66 |
| ahf.NanoAndrew .4 | 18 | 12% | 32 |
| maribo.melee.BMV 0.1 | 13 | 9% | 21 |
| tex.Longbot 0.4 | 4 | 3% | 6 |
| nic.Nicator 2.4 | 3 | 2% | 8 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 2 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 216086 melee ticks, 81015 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 63 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 1.

Targeting waves (272 rounds): 71372 sent, 64969 reached their opponent, 13675 virtual hits (21.0% of those reached).

## Melee bench: F18

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 545 over 8 battles (68.1 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 90.6 | 173 / 280 | 1.85 | 19.7% | 40546 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.0 | 19.7% | 173 |
| morbid.MorbidPriest 1.0 | 2.3 | 13.2% | 43 |
| agd.Mooserwirt2 2.7 | 3.3 | 11.8% | 18 |
| uji.DBH 1.1 | 3.5 | 11.7% | 18 |
| sigterm.Sigterm 1.0 | 5.8 | 9.0% | 14 |
| spinnercat.Robovirus 2.718 | 6.1 | 8.7% | 3 |
| ratosh.Nobo 0.21 | 6.4 | 8.3% | 3 |
| kawigi.mini.Fhqwhgads 1.1 | 7.8 | 7.2% | 4 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 5.1% | 0 |
| stelo.WangRobot 1.0 | 9.5 | 5.2% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 90.2 | 21 / 35 | 5566 |
| 2 | 1 | 68.3 | 88.3 | 20 / 35 | 4679 |
| 3 | 1 | 69.0 | 89.2 | 20 / 35 | 4804 |
| 4 | 1 | 70.0 | 93.3 | 24 / 35 | 5075 |
| 5 | 1 | 70.1 | 91.1 | 25 / 35 | 5139 |
| 6 | 1 | 67.9 | 88.6 | 16 / 35 | 4770 |
| 7 | 1 | 70.1 | 92.4 | 24 / 35 | 5402 |
| 8 | 1 | 70.2 | 91.4 | 23 / 35 | 5111 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 67 | 69% |
| agd.Mooserwirt2 2.7 | 47 | 85% |
| uji.DBH 1.1 | 45 | 76% |
| sigterm.Sigterm 1.0 | 23 | 78% |
| stelo.WangRobot 1.0 | 12 | 75% |
| ratosh.Nobo 0.21 | 11 | 91% |
| spinnercat.Robovirus 2.718 | 9 | 89% |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 100% |

Hadur died in 110 of 280 rounds, at a mean tick of 847. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 45 | 41% | 87 |
| uji.DBH 1.1 | 21 | 19% | 50 |
| agd.Mooserwirt2 2.7 | 15 | 14% | 48 |
| sigterm.Sigterm 1.0 | 10 | 9% | 24 |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 5% | 15 |
| ratosh.Nobo 0.21 | 4 | 4% | 20 |
| spinnercat.Robovirus 2.718 | 4 | 4% | 17 |
| stelo.WangRobot 1.0 | 2 | 2% | 12 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 2% | 5 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 185427 melee ticks, 67658 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 57 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 5.

Targeting waves (273 rounds): 62156 sent, 55756 reached their opponent, 12148 virtual hits (21.8% of those reached).

## Melee bench: F19

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 300 over 8 battles (37.5 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.5 | 98.1 | 262 / 280 | 1.17 | 22.6% | 50470 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.0 | 22.6% | 262 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.3% | 7 |
| mld.Infinity 2.2 | 3.5 | 12.0% | 5 |
| krillr.mini.JointStrike 2.0.0 | 3.9 | 11.4% | 3 |
| erdnis.Rover 0.3 | 4.8 | 10.6% | 2 |
| patson.PatsonTestBot 1.0 | 5.9 | 8.6% | 1 |
| mbh.Mbh 0.1 | 7.3 | 7.0% | 0 |
| pac.ABC 2.1 | 7.8 | 6.7% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.5% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 99.0 | 34 / 35 | 5771 |
| 2 | 1 | 73.5 | 97.5 | 32 / 35 | 6651 |
| 3 | 1 | 74.1 | 99.7 | 34 / 35 | 6440 |
| 4 | 1 | 73.1 | 95.9 | 30 / 35 | 6420 |
| 5 | 1 | 73.7 | 99.0 | 33 / 35 | 6244 |
| 6 | 1 | 74.1 | 99.0 | 33 / 35 | 6657 |
| 7 | 1 | 74.3 | 100.0 | 35 / 35 | 6387 |
| 8 | 1 | 72.3 | 94.6 | 31 / 35 | 5900 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 133 | 98% |
| mld.Infinity 2.2 | 49 | 100% |
| krillr.mini.JointStrike 2.0.0 | 40 | 93% |
| erdnis.Rover 0.3 | 17 | 94% |
| patson.PatsonTestBot 1.0 | 14 | 100% |
| pac.ABC 2.1 | 10 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |
| pedersen.Moron 2.0 | 1 | 100% |

Hadur died in 20 of 280 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| krillr.mini.JointStrike 2.0.0 | 6 | 30% | 64 |
| davidalves.net.DuelistMiniMelee 1.2 | 5 | 25% | 99 |
| patson.PatsonTestBot 1.0 | 2 | 10% | 22 |
| pbg.R2D2 1.0 | 2 | 10% | 9 |
| mld.Infinity 2.2 | 1 | 5% | 35 |
| erdnis.Rover 0.3 | 1 | 5% | 31 |
| mbh.Mbh 0.1 | 1 | 5% | 11 |
| pac.ABC 2.1 | 1 | 5% | 7 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 267 rounds): 170427 melee ticks, 63919 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 30 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (267 rounds): longest scan gap while four or more were alive 30 ticks (267 rounds over 8); rounds whose longest gap at any count was over 8: 267; robots dropped as dead without a death event: 1.

Targeting waves (267 rounds): 56757 sent, 50704 reached their opponent, 11697 virtual hits (23.1% of those reached).

## Melee bench: F20

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 648 over 8 battles (81.0 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 90.8 | 179 / 280 | 1.83 | 20.4% | 47115 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.0 | 20.4% | 179 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.4% | 45 |
| fwb.Nine 1.0.1 | 3.5 | 11.7% | 23 |
| nz.jdc.nano.GridFu 1.0 | 3.9 | 10.9% | 5 |
| catcat20.Rabbit 0.001 | 4.6 | 10.3% | 20 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.5% | 5 |
| bayen.nut.Squirrel 1.615 | 7.9 | 6.4% | 2 |
| ntc.ControlledChaos 1.1.4 | 8.3 | 6.0% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.3 | 6.0% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.6 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 93.3 | 23 / 35 | 6132 |
| 2 | 1 | 70.0 | 89.8 | 21 / 35 | 5545 |
| 3 | 1 | 69.9 | 87.3 | 22 / 35 | 5771 |
| 4 | 1 | 71.8 | 93.7 | 24 / 35 | 6240 |
| 5 | 1 | 70.5 | 89.8 | 22 / 35 | 5839 |
| 6 | 1 | 70.2 | 90.2 | 22 / 35 | 5743 |
| 7 | 1 | 70.5 | 90.5 | 22 / 35 | 5804 |
| 8 | 1 | 70.9 | 91.7 | 23 / 35 | 6041 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 106 | 83% |
| fwb.Nine 1.0.1 | 47 | 94% |
| catcat20.Rabbit 0.001 | 32 | 63% |
| nz.jdc.nano.GridFu 1.0 | 13 | 92% |
| m3thos.mini.Eva01 0.5.5 | 6 | 100% |
| bayen.nut.Squirrel 1.615 | 5 | 80% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 107 of 280 rounds, at a mean tick of 992. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 47 | 44% | 126 |
| fwb.Nine 1.0.1 | 27 | 25% | 44 |
| catcat20.Rabbit 0.001 | 15 | 14% | 40 |
| m3thos.mini.Eva01 0.5.5 | 5 | 5% | 12 |
| bayen.nut.Squirrel 1.615 | 4 | 4% | 9 |
| nz.jdc.nano.GridFu 1.0 | 2 | 2% | 32 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 4 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 3 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 225460 melee ticks, 67733 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 32 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 0.

Targeting waves (275 rounds): 70278 sent, 63800 reached their opponent, 14089 virtual hits (22.1% of those reached).

## Melee bench: F21

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 874 over 8 battles (109.3 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 90.5 | 149 / 280 | 1.85 | 19.8% | 45350 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.0 | 19.8% | 149 |
| eem.EvBot v4.6.16 | 2.0 | 16.8% | 97 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.8% | 8 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.0% | 9 |
| eld.Hmm 1.0 | 5.3 | 8.5% | 17 |
| oa.weak.BotherBot 0.1 | 6.1 | 7.3% | 0 |
| PSW.Relentless 0.1 | 7.3 | 6.2% | 0 |
| fire219.CatBot 1.0 | 7.8 | 6.1% | 0 |
| el.JumpShoot 0.2 | 8.6 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 87.6 | 19 / 35 | 5722 |
| 2 | 1 | 68.3 | 87.3 | 13 / 35 | 5104 |
| 3 | 1 | 69.9 | 87.3 | 17 / 35 | 5855 |
| 4 | 1 | 71.3 | 92.1 | 21 / 35 | 5935 |
| 5 | 1 | 70.7 | 95.2 | 22 / 35 | 5263 |
| 6 | 1 | 71.2 | 93.7 | 23 / 35 | 5844 |
| 7 | 1 | 71.3 | 92.4 | 19 / 35 | 5994 |
| 8 | 1 | 69.6 | 88.6 | 15 / 35 | 5633 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 154 | 60% |
| dummy.mini.Scimitar 1.01 | 34 | 85% |
| cf.RiO.RiOx 4.2.1 | 22 | 86% |
| eld.Hmm 1.0 | 15 | 47% |
| oa.weak.BotherBot 0.1 | 2 | 100% |

Hadur died in 139 of 280 rounds, at a mean tick of 1265. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 80 | 58% | 143 |
| dummy.mini.Scimitar 1.01 | 22 | 16% | 63 |
| cf.RiO.RiOx 4.2.1 | 15 | 11% | 35 |
| eld.Hmm 1.0 | 12 | 9% | 34 |
| PSW.Relentless 0.1 | 2 | 1% | 2 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 2 |
| fire219.CatBot 1.0 | 0 | 0% | 1 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 279 rounds): 243880 melee ticks, 105077 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (279 rounds): longest scan gap while four or more were alive 56 ticks (279 rounds over 8); rounds whose longest gap at any count was over 8: 279; robots dropped as dead without a death event: 0.

Targeting waves (279 rounds): 71337 sent, 64874 reached their opponent, 11024 virtual hits (17.0% of those reached).

## Melee bench: F22

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 288 over 8 battles (36.0 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 88.1 | 128 / 280 | 2.07 | 18.6% | 40933 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.0 | 18.6% | 128 |
| pe.SandboxDT 2.71m | 2.0 | 16.4% | 89 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.5% | 35 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.6% | 17 |
| bigpete.Stewie 1.0 | 5.0 | 10.4% | 7 |
| yk.JahRoslav 1.1 | 6.0 | 7.6% | 4 |
| tad.Dalek98 0.98 | 7.4 | 6.4% | 0 |
| gg.Squaraus 0.6 | 7.9 | 6.2% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 5.0% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 85.1 | 14 / 35 | 5322 |
| 2 | 1 | 68.3 | 86.0 | 15 / 35 | 5055 |
| 3 | 1 | 71.0 | 92.1 | 21 / 35 | 5474 |
| 4 | 1 | 69.6 | 88.9 | 17 / 35 | 5299 |
| 5 | 1 | 68.8 | 87.6 | 15 / 35 | 4907 |
| 6 | 1 | 69.0 | 89.2 | 16 / 35 | 4970 |
| 7 | 1 | 67.5 | 84.8 | 13 / 35 | 4808 |
| 8 | 1 | 69.6 | 91.4 | 17 / 35 | 5098 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 90 | 39% |
| kvk.HebusLeTroll 0.35 | 54 | 72% |
| jlm.javaDisturbance 0.59 | 45 | 82% |
| bigpete.Stewie 1.0 | 14 | 86% |
| yk.JahRoslav 1.1 | 3 | 67% |
| pbg.NinjaX 1.2 | 2 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |

Hadur died in 154 of 280 rounds, at a mean tick of 1005. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 68 | 44% | 106 |
| kvk.HebusLeTroll 0.35 | 42 | 27% | 70 |
| jlm.javaDisturbance 0.59 | 28 | 18% | 72 |
| bigpete.Stewie 1.0 | 7 | 5% | 14 |
| yk.JahRoslav 1.1 | 4 | 3% | 9 |
| pbg.NinjaX 1.2 | 1 | 1% | 3 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 1% | 2 |
| tad.Dalek98 0.98 | 1 | 1% | 1 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 269 rounds): 211929 melee ticks, 69540 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (269 rounds): longest scan gap while four or more were alive 57 ticks (269 rounds over 8); rounds whose longest gap at any count was over 8: 269; robots dropped as dead without a death event: 2.

Targeting waves (269 rounds): 67588 sent, 61358 reached their opponent, 9789 virtual hits (16.0% of those reached).

## Melee bench: F23

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 416 over 8 battles (52.0 per battle, most in one battle 223). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.4 | 96.3 | 229 / 280 | 1.34 | 22.1% | 49414 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.0 | 22.1% | 229 |
| pe.SandboxLump 1.52 | 2.0 | 16.4% | 37 |
| cre.Karolos 0.32 | 3.0 | 13.9% | 9 |
| stelo.AreaTargetingBot 1.1 | 4.6 | 9.5% | 2 |
| stelo.RamTrackSurfer 1.2 | 5.3 | 9.1% | 2 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.1 | 8.7% | 1 |
| sample.Walls 1.0 | 6.9 | 8.1% | 0 |
| cw.megas.Blade 0.8 | 7.1 | 8.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 2.6% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.9 | 98.1 | 31 / 35 | 6099 |
| 2 | 1 | 74.2 | 98.7 | 32 / 35 | 6288 |
| 3 | 1 | 72.9 | 95.2 | 26 / 35 | 6109 |
| 4 | 1 | 72.7 | 94.6 | 26 / 35 | 6040 |
| 5 | 1 | 73.5 | 95.9 | 28 / 35 | 6381 |
| 6 | 1 | 73.7 | 95.6 | 30 / 35 | 6348 |
| 7 | 1 | 73.2 | 97.1 | 27 / 35 | 6073 |
| 8 | 1 | 73.2 | 94.9 | 29 / 35 | 6076 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 140 | 84% |
| cre.Karolos 0.32 | 67 | 96% |
| stelo.AreaTargetingBot 1.1 | 15 | 93% |
| stelo.RamTrackSurfer 1.2 | 14 | 93% |
| sample.Walls 1.0 | 10 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 100% |
| cw.megas.Blade 0.8 | 5 | 100% |

Hadur died in 54 of 280 rounds, at a mean tick of 838. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 32 | 59% | 131 |
| cre.Karolos 0.32 | 10 | 19% | 72 |
| stelo.AreaTargetingBot 1.1 | 5 | 9% | 21 |
| stelo.RamTrackSurfer 1.2 | 3 | 6% | 22 |
| sample.Walls 1.0 | 1 | 2% | 12 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 8 |
| cw.megas.Blade 0.8 | 0 | 0% | 5 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 169806 melee ticks, 69246 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 49 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 0.

Targeting waves (275 rounds): 53300 sent, 46970 reached their opponent, 13714 virtual hits (29.2% of those reached).

## Melee bench: F24

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 478 over 8 battles (59.8 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 78.8 | 86 / 280 | 2.91 | 15.9% | 31117 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.1 | 15.9% | 86 |
| rz.GlowBlowMelee 1.4 | 1.9 | 14.6% | 66 |
| davidalves.Phoenix 0.54 | 3.3 | 13.5% | 61 |
| florent.XSeries.X2 0.12 | 4.3 | 12.4% | 36 |
| pedersen.Ugluk 1.1.1 | 4.5 | 11.8% | 23 |
| oog.melee.Corsair 1.0 | 6.0 | 9.6% | 7 |
| stelo.SoJNanoMelee 1.1 | 7.4 | 6.4% | 2 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.3% | 1 |
| as.FrankTheTank 1.3 | 8.6 | 5.4% | 0 |
| evd.X1 0.01 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 80.3 | 11 / 35 | 3894 |
| 2 | 1 | 66.0 | 82.2 | 17 / 35 | 3808 |
| 3 | 1 | 62.1 | 73.0 | 8 / 35 | 3608 |
| 4 | 1 | 62.6 | 72.7 | 11 / 35 | 3834 |
| 5 | 2 | 63.9 | 77.1 | 11 / 35 | 3668 |
| 6 | 1 | 64.6 | 80.3 | 8 / 35 | 4109 |
| 7 | 1 | 64.9 | 81.6 | 9 / 35 | 4037 |
| 8 | 1 | 65.7 | 83.2 | 11 / 35 | 4159 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 56 | 48% |
| davidalves.Phoenix 0.54 | 40 | 40% |
| pedersen.Ugluk 1.1.1 | 27 | 63% |
| florent.XSeries.X2 0.12 | 21 | 57% |
| oog.melee.Corsair 1.0 | 11 | 64% |
| stelo.SoJNanoMelee 1.1 | 8 | 88% |

Hadur died in 197 of 280 rounds, at a mean tick of 774. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 50 | 25% | 78 |
| davidalves.Phoenix 0.54 | 48 | 24% | 64 |
| pedersen.Ugluk 1.1.1 | 43 | 22% | 54 |
| florent.XSeries.X2 0.12 | 32 | 16% | 43 |
| oog.melee.Corsair 1.0 | 11 | 6% | 26 |
| stelo.SoJNanoMelee 1.1 | 4 | 2% | 5 |
| evd.X1 0.01 | 3 | 2% | 4 |
| lunchie.Lunchbox 0.93 | 2 | 1% | 5 |
| as.FrankTheTank 1.3 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 182501 melee ticks, 48967 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 38 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 0.

Targeting waves (273 rounds): 60292 sent, 53653 reached their opponent, 9827 virtual hits (18.3% of those reached).

## Melee bench: F25

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 560 over 8 battles (70.0 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 85.4 | 169 / 280 | 2.32 | 18.1% | 31582 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.0 | 18.1% | 169 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.2% | 23 |
| voidious.micro.BlitzBat 1.05 | 3.3 | 12.5% | 19 |
| jdw.Hurricane 1.4 | 3.5 | 11.9% | 28 |
| ds.Oo 2.2 | 5.4 | 9.9% | 17 |
| gre.svman4.Morfeas 1.4.1 | 5.8 | 9.6% | 11 |
| awesomeness.Elite 1.0 | 7.1 | 7.5% | 5 |
| gjr.Cephalosporin 0.1 | 8.4 | 6.5% | 4 |
| adt.Ar2 1.1 | 8.4 | 6.2% | 2 |
| amk.ChumbaMini 0.2 | 10.0 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 86.7 | 23 / 35 | 4311 |
| 2 | 1 | 66.0 | 81.9 | 18 / 35 | 3642 |
| 3 | 1 | 67.3 | 85.4 | 21 / 35 | 3817 |
| 4 | 1 | 67.2 | 85.4 | 21 / 35 | 3977 |
| 5 | 1 | 67.6 | 85.7 | 21 / 35 | 4139 |
| 6 | 1 | 64.6 | 78.7 | 16 / 35 | 3631 |
| 7 | 1 | 67.4 | 85.1 | 21 / 35 | 4081 |
| 8 | 1 | 69.6 | 94.0 | 28 / 35 | 3984 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 53 | 92% |
| voidious.micro.BlitzBat 1.05 | 49 | 92% |
| jdw.Hurricane 1.4 | 44 | 80% |
| ds.Oo 2.2 | 24 | 71% |
| gre.svman4.Morfeas 1.4.1 | 14 | 71% |
| awesomeness.Elite 1.0 | 8 | 75% |
| gjr.Cephalosporin 0.1 | 5 | 100% |
| amk.ChumbaMini 0.2 | 2 | 50% |
| adt.Ar2 1.1 | 2 | 50% |

Hadur died in 116 of 280 rounds, at a mean tick of 629. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 23 | 20% | 60 |
| voidious.mini.BrokenSword 2.0.3 | 21 | 18% | 61 |
| jdw.Hurricane 1.4 | 19 | 16% | 41 |
| ds.Oo 2.2 | 14 | 12% | 41 |
| adt.Ar2 1.1 | 10 | 9% | 13 |
| gre.svman4.Morfeas 1.4.1 | 9 | 8% | 27 |
| awesomeness.Elite 1.0 | 7 | 6% | 19 |
| amk.ChumbaMini 0.2 | 6 | 5% | 7 |
| gjr.Cephalosporin 0.1 | 3 | 3% | 10 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 167233 melee ticks, 39217 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 35 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 1.

Targeting waves (275 rounds): 59286 sent, 52830 reached their opponent, 8866 virtual hits (16.8% of those reached).

## Melee bench: F26

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 511 over 8 battles (63.9 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 91.9 | 182 / 280 | 1.73 | 20.6% | 50826 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.0 | 20.6% | 182 |
| ak.Fermat 2.0 | 2.0 | 14.7% | 46 |
| lrem.Spectre 0.4.4 | 3.4 | 12.1% | 19 |
| shu.nitro.LENIN .T34 | 3.8 | 12.0% | 21 |
| js.PinBall 1.6 | 5.1 | 10.7% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 5.8 | 9.6% | 4 |
| gh.mini.GrubbmOne 1.0 | 7.1 | 8.2% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 7.9 | 6.7% | 4 |
| sample.SpinBot 1.0 | 9.0 | 4.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 85.7 | 16 / 35 | 5823 |
| 2 | 1 | 71.7 | 92.1 | 22 / 35 | 6355 |
| 3 | 1 | 70.3 | 88.9 | 18 / 35 | 6139 |
| 4 | 1 | 73.5 | 96.8 | 27 / 35 | 7022 |
| 5 | 1 | 72.4 | 95.2 | 27 / 35 | 6278 |
| 6 | 1 | 71.0 | 90.2 | 25 / 35 | 5997 |
| 7 | 1 | 71.8 | 92.7 | 22 / 35 | 6663 |
| 8 | 1 | 72.3 | 93.7 | 25 / 35 | 6549 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 82 | 70% |
| shu.nitro.LENIN .T34 | 64 | 81% |
| lrem.Spectre 0.4.4 | 53 | 81% |
| jaybot.adv.bots.JayBot 2.0 | 11 | 91% |
| js.PinBall 1.6 | 11 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 80% |
| gh.mini.GrubbmOne 1.0 | 4 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 101 of 280 rounds, at a mean tick of 953. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 44 | 44% | 96 |
| shu.nitro.LENIN .T34 | 23 | 23% | 69 |
| lrem.Spectre 0.4.4 | 12 | 12% | 53 |
| jaybot.adv.bots.JayBot 2.0 | 7 | 7% | 17 |
| js.PinBall 1.6 | 6 | 6% | 26 |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 3% | 7 |
| gh.mini.GrubbmOne 1.0 | 2 | 2% | 11 |
| sample.SpinBot 1.0 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 210501 melee ticks, 67667 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 32 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 0.

Targeting waves (273 rounds): 68746 sent, 62297 reached their opponent, 15190 virtual hits (24.4% of those reached).

## Melee bench: F27

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 451 over 8 battles (56.4 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 84.0 | 190 / 280 | 2.44 | 19.1% | 42421 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.5 | 19.1% | 190 |
| mk.Alpha 0.2.1 | 1.9 | 14.1% | 44 |
| EH.Eagle 1.0.6 | 4.0 | 10.6% | 12 |
| sheldor.melee.nano.TestMelee 0.1 | 4.5 | 9.6% | 9 |
| wee.Gem 1.8.4 | 5.4 | 9.2% | 15 |
| techdude.kombat.FlamingKombat 1.5 | 5.8 | 9.0% | 4 |
| throxbot.ThroxBot 0.1 | 6.9 | 8.1% | 3 |
| joe.ADinosaur 1.0 | 7.0 | 8.2% | 2 |
| caimano.Furia_Ceca 0.22 | 8.5 | 6.8% | 1 |
| cs.Grudge 1.0 | 9.6 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 97.1 | 30 / 35 | 5570 |
| 2 | 5 | 50.4 | 36.2 | 8 / 35 | 4023 |
| 3 | 1 | 68.3 | 79.7 | 23 / 35 | 5813 |
| 4 | 1 | 71.0 | 90.8 | 28 / 35 | 5950 |
| 5 | 1 | 70.1 | 91.7 | 27 / 35 | 5231 |
| 6 | 1 | 69.9 | 92.1 | 25 / 35 | 5137 |
| 7 | 1 | 71.1 | 95.2 | 26 / 35 | 5329 |
| 8 | 1 | 69.5 | 89.5 | 23 / 35 | 5368 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 121 | 86% |
| EH.Eagle 1.0.6 | 33 | 97% |
| wee.Gem 1.8.4 | 14 | 93% |
| throxbot.ThroxBot 0.1 | 12 | 92% |
| techdude.kombat.FlamingKombat 1.5 | 12 | 92% |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 100% |
| caimano.Furia_Ceca 0.22 | 6 | 100% |
| joe.ADinosaur 1.0 | 5 | 80% |

Hadur died in 93 of 280 rounds, at a mean tick of 589. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cs.Grudge 1.0 | 26 | 28% | 25 |
| mk.Alpha 0.2.1 | 25 | 27% | 106 |
| EH.Eagle 1.0.6 | 9 | 10% | 49 |
| throxbot.ThroxBot 0.1 | 7 | 8% | 23 |
| joe.ADinosaur 1.0 | 7 | 8% | 12 |
| caimano.Furia_Ceca 0.22 | 6 | 6% | 11 |
| sheldor.melee.nano.TestMelee 0.1 | 5 | 5% | 23 |
| techdude.kombat.FlamingKombat 1.5 | 3 | 3% | 14 |
| wee.Gem 1.8.4 | 2 | 2% | 16 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 168176 melee ticks, 51895 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 94 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 94 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 2.

Targeting waves (275 rounds): 54532 sent, 48191 reached their opponent, 11991 virtual hits (24.9% of those reached).

## Melee bench: F28

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 288 over 8 battles (36.0 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 87.8 | 167 / 280 | 2.10 | 18.3% | 33020 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.0 | 18.3% | 167 |
| kid.test.NightFox .2 | 2.0 | 15.3% | 53 |
| uji.Antique 1.0 | 3.0 | 12.1% | 32 |
| pfvicm.Sobieski 7.2.3b | 4.3 | 10.5% | 9 |
| qohnil.blot.BlotBot 3.61 | 4.9 | 10.1% | 9 |
| ahr.ice.Ice 1.0.2 | 6.0 | 8.4% | 6 |
| amk.ChumbaWumba 0.3 | 6.9 | 7.9% | 2 |
| matt.advanced.Katana 1.0 | 8.3 | 6.6% | 1 |
| stelo.PianistNano 1.2 | 9.3 | 5.6% | 1 |
| stelo.Lifestealer 1.0 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 89.2 | 21 / 35 | 4032 |
| 2 | 1 | 67.9 | 88.3 | 21 / 35 | 4176 |
| 3 | 1 | 65.7 | 79.4 | 16 / 35 | 4241 |
| 4 | 1 | 67.4 | 88.6 | 22 / 35 | 3839 |
| 5 | 1 | 68.5 | 90.8 | 23 / 35 | 4111 |
| 6 | 1 | 69.1 | 91.7 | 23 / 35 | 4402 |
| 7 | 1 | 66.9 | 87.0 | 20 / 35 | 3885 |
| 8 | 1 | 67.9 | 87.6 | 21 / 35 | 4334 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 107 | 78% |
| uji.Antique 1.0 | 47 | 91% |
| qohnil.blot.BlotBot 3.61 | 18 | 83% |
| pfvicm.Sobieski 7.2.3b | 10 | 60% |
| ahr.ice.Ice 1.0.2 | 10 | 60% |
| amk.ChumbaWumba 0.3 | 9 | 89% |
| matt.advanced.Katana 1.0 | 4 | 75% |
| stelo.PianistNano 1.2 | 3 | 100% |

Hadur died in 117 of 280 rounds, at a mean tick of 740. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 38 | 32% | 79 |
| uji.Antique 1.0 | 24 | 21% | 80 |
| pfvicm.Sobieski 7.2.3b | 23 | 20% | 39 |
| qohnil.blot.BlotBot 3.61 | 12 | 10% | 36 |
| ahr.ice.Ice 1.0.2 | 7 | 6% | 19 |
| amk.ChumbaWumba 0.3 | 6 | 5% | 12 |
| matt.advanced.Katana 1.0 | 4 | 3% | 10 |
| stelo.PianistNano 1.2 | 1 | 1% | 4 |
| stelo.Lifestealer 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 177380 melee ticks, 44834 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 41 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 1.

Targeting waves (274 rounds): 58609 sent, 52231 reached their opponent, 7464 virtual hits (14.3% of those reached).

## Melee bench: F29

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 593 over 8 battles (74.1 per battle, most in one battle 142). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 84.3 | 123 / 280 | 2.41 | 18.1% | 36891 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.0 | 18.1% | 123 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 14.6% | 61 |
| deewiant.Anomaly 0.2 | 2.5 | 15.4% | 66 |
| myl.micro.Troodon 1.10 | 4.1 | 12.0% | 10 |
| jok.PheonixM 0.1.2 | 4.9 | 11.0% | 13 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.2% | 2 |
| fullsail.TimbotNoPrediction 1.0 | 7.4 | 5.9% | 0 |
| DBall.Anarchy 0.1 | 7.8 | 5.7% | 3 |
| ap.Frederick 1.1 | 9.3 | 4.9% | 2 |
| jangs.ns51 1.0 | 9.6 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 87.9 | 17 / 35 | 4575 |
| 2 | 1 | 68.5 | 85.7 | 17 / 35 | 4776 |
| 3 | 1 | 68.2 | 86.7 | 14 / 35 | 4523 |
| 4 | 1 | 69.0 | 84.4 | 19 / 35 | 4898 |
| 5 | 1 | 68.7 | 85.4 | 15 / 35 | 4915 |
| 6 | 1 | 66.7 | 80.0 | 14 / 35 | 4417 |
| 7 | 1 | 65.6 | 78.1 | 10 / 35 | 4225 |
| 8 | 1 | 68.8 | 86.0 | 17 / 35 | 4562 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 78 | 60% |
| zyx.mega.YersiniaPestis 3.1 | 46 | 54% |
| jok.PheonixM 0.1.2 | 25 | 80% |
| myl.micro.Troodon 1.10 | 19 | 100% |
| jangs.ns51 1.0 | 4 | 100% |
| DBall.Anarchy 0.1 | 3 | 100% |
| ph.melee.ArcherME 0.3 | 3 | 100% |
| ap.Frederick 1.1 | 2 | 100% |

Hadur died in 163 of 280 rounds, at a mean tick of 917. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 61 | 37% | 109 |
| zyx.mega.YersiniaPestis 3.1 | 40 | 25% | 69 |
| myl.micro.Troodon 1.10 | 28 | 17% | 49 |
| jok.PheonixM 0.1.2 | 23 | 14% | 32 |
| ph.melee.ArcherME 0.3 | 3 | 2% | 10 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 1% | 2 |
| DBall.Anarchy 0.1 | 1 | 1% | 6 |
| jangs.ns51 1.0 | 1 | 1% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 219775 melee ticks, 63991 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 72 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 0.

Targeting waves (276 rounds): 72619 sent, 65969 reached their opponent, 10246 virtual hits (15.5% of those reached).

## Melee bench: F30

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 937 over 8 battles (117.1 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 74.6 | 50 / 280 | 3.28 | 14.7% | 30603 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.6 | 14.7% | 50 |
| darkcanuck.B26354 1.06 | 1.9 | 14.1% | 64 |
| catcat20.Matcha 0.006 | 2.9 | 13.5% | 67 |
| oog.melee.Capulet 1.2 | 3.8 | 12.7% | 52 |
| stelo.PastFuture 2.3.2 | 4.9 | 12.1% | 25 |
| intruder.PrairieWolf 2.61 | 6.3 | 9.1% | 13 |
| tripphippy.Alice 1.1 | 7.8 | 7.5% | 4 |
| ntc.Opposite 1.5 | 7.8 | 7.0% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 8.3 | 6.6% | 6 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 76.5 | 7 / 35 | 3964 |
| 2 | 1 | 62.3 | 73.7 | 7 / 35 | 3889 |
| 3 | 1 | 62.5 | 74.3 | 7 / 35 | 3959 |
| 4 | 1 | 63.5 | 76.8 | 7 / 35 | 4065 |
| 5 | 1 | 63.1 | 77.8 | 6 / 35 | 3769 |
| 6 | 2 | 62.8 | 74.6 | 5 / 35 | 3842 |
| 7 | 2 | 62.2 | 74.6 | 7 / 35 | 3647 |
| 8 | 4 | 60.1 | 68.9 | 4 / 35 | 3468 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 37 | 35% |
| catcat20.Matcha 0.006 | 33 | 30% |
| oog.melee.Capulet 1.2 | 23 | 39% |
| stelo.PastFuture 2.3.2 | 15 | 67% |
| intruder.PrairieWolf 2.61 | 10 | 20% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 75% |
| tripphippy.Alice 1.1 | 4 | 75% |

Hadur died in 238 of 280 rounds, at a mean tick of 865. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 54 | 23% | 65 |
| catcat20.Matcha 0.006 | 52 | 22% | 63 |
| stelo.PastFuture 2.3.2 | 46 | 19% | 57 |
| oog.melee.Capulet 1.2 | 36 | 15% | 45 |
| intruder.PrairieWolf 2.61 | 17 | 7% | 21 |
| tripphippy.Alice 1.1 | 10 | 4% | 14 |
| fowl3628800.LightningBolt 2.6.0 | 8 | 3% | 8 |
| ntc.Opposite 1.5 | 6 | 3% | 6 |
| GarmBox.Anger 1.0 | 1 | 0% | 1 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 209248 melee ticks, 36224 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 56 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 2.

Targeting waves (276 rounds): 68175 sent, 61624 reached their opponent, 10471 virtual hits (17.0% of those reached).

## Melee bench: F31

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 679 over 8 battles (84.9 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 77.3 | 66 / 280 | 3.04 | 15.3% | 29573 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.3 | 17.3% | 117 |
| hadur2.Hadur 3.18.1ow | 1.8 | 15.3% | 66 |
| gh.mini.Griezel 0.2 | 3.1 | 13.6% | 69 |
| spinnercat.micro.Tyger 0.1 | 4.4 | 10.9% | 9 |
| d414.nano.Quantum 1.0.0 | 4.5 | 11.3% | 11 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.7% | 6 |
| timmit.nano.TimDog 0.33 | 7.1 | 7.5% | 1 |
| fm.mammillarias 1.3 | 8.3 | 5.6% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 8.9 | 5.1% | 1 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 74.6 | 9 / 35 | 3339 |
| 2 | 2 | 64.0 | 76.5 | 9 / 35 | 3931 |
| 3 | 1 | 63.5 | 76.5 | 11 / 35 | 3692 |
| 4 | 1 | 65.2 | 82.2 | 8 / 35 | 3981 |
| 5 | 2 | 61.6 | 71.4 | 6 / 35 | 3455 |
| 6 | 2 | 64.7 | 81.0 | 8 / 35 | 3816 |
| 7 | 2 | 64.5 | 79.7 | 10 / 35 | 3789 |
| 8 | 2 | 62.5 | 76.5 | 5 / 35 | 3570 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 70 | 34% |
| gh.mini.Griezel 0.2 | 32 | 38% |
| spinnercat.micro.Tyger 0.1 | 13 | 77% |
| d414.nano.Quantum 1.0.0 | 12 | 92% |
| gh.nano.Grofvuil 0.2 | 5 | 80% |
| timmit.nano.TimDog 0.33 | 3 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 3 | 67% |
| tlp.ThreeLeggedPig 1 | 1 | 0% |

Hadur died in 220 of 280 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 88 | 40% | 111 |
| gh.mini.Griezel 0.2 | 57 | 26% | 73 |
| spinnercat.micro.Tyger 0.1 | 26 | 12% | 32 |
| d414.nano.Quantum 1.0.0 | 25 | 11% | 36 |
| gh.nano.Grofvuil 0.2 | 7 | 3% | 13 |
| timmit.nano.TimDog 0.33 | 5 | 2% | 7 |
| Gecko.ultimateGeckoBot 1.0 | 3 | 1% | 5 |
| fm.mammillarias 1.3 | 2 | 1% | 2 |
| tlp.ThreeLeggedPig 1 | 1 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 203890 melee ticks, 42208 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 40 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 3.

Targeting waves (276 rounds): 65897 sent, 59319 reached their opponent, 9639 virtual hits (16.2% of those reached).

## Melee bench: F32

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 512 over 8 battles (64.0 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 89.2 | 145 / 280 | 1.97 | 18.3% | 36160 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.1 | 18.3% | 145 |
| kawigi.sbf.FloodHT 0.9.2 | 1.9 | 15.1% | 73 |
| apc.botM 3.0 | 3.0 | 12.2% | 34 |
| vjik.UnViolation 1.1 | 4.6 | 10.2% | 7 |
| lxx.ConceptA 0.8 | 4.8 | 10.0% | 5 |
| bayen.UbaMicro 1.4 | 5.6 | 9.1% | 4 |
| panzer.Panzer 0.2 | 7.5 | 7.0% | 1 |
| yk.JahMicro 1.0 | 7.9 | 6.6% | 7 |
| conscience.Electron 1.3g | 8.9 | 6.2% | 1 |
| donjezza.Jezza 1.0 | 9.8 | 5.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.1 | 84.8 | 13 / 35 | 4432 |
| 2 | 1 | 68.0 | 90.8 | 17 / 35 | 4600 |
| 3 | 1 | 68.9 | 90.8 | 19 / 35 | 5081 |
| 4 | 1 | 67.8 | 89.5 | 19 / 35 | 4378 |
| 5 | 1 | 68.1 | 91.1 | 20 / 35 | 4412 |
| 6 | 1 | 67.3 | 87.6 | 18 / 35 | 4410 |
| 7 | 1 | 68.3 | 90.2 | 22 / 35 | 4742 |
| 8 | 1 | 67.1 | 89.2 | 17 / 35 | 4105 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 107 | 54% |
| apc.botM 3.0 | 58 | 69% |
| vjik.UnViolation 1.1 | 17 | 100% |
| lxx.ConceptA 0.8 | 13 | 92% |
| yk.JahMicro 1.0 | 8 | 38% |
| bayen.UbaMicro 1.4 | 8 | 75% |
| donjezza.Jezza 1.0 | 7 | 86% |
| panzer.Panzer 0.2 | 3 | 100% |
| conscience.Electron 1.3g | 1 | 0% |

Hadur died in 139 of 280 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 70 | 50% | 128 |
| apc.botM 3.0 | 23 | 17% | 63 |
| lxx.ConceptA 0.8 | 14 | 10% | 22 |
| bayen.UbaMicro 1.4 | 8 | 6% | 17 |
| yk.JahMicro 1.0 | 8 | 6% | 11 |
| vjik.UnViolation 1.1 | 6 | 4% | 24 |
| panzer.Panzer 0.2 | 4 | 3% | 7 |
| donjezza.Jezza 1.0 | 2 | 1% | 3 |
| conscience.Electron 1.3g | 1 | 1% | 4 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 271 rounds): 168198 melee ticks, 72360 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (271 rounds): longest scan gap while four or more were alive 70 ticks (271 rounds over 8); rounds whose longest gap at any count was over 8: 271; robots dropped as dead without a death event: 1.

Targeting waves (271 rounds): 57050 sent, 50612 reached their opponent, 9240 virtual hits (18.3% of those reached).

## Melee bench: F33

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 598 over 8 battles (74.8 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 85.8 | 150 / 280 | 2.28 | 18.8% | 40077 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.1 | 18.8% | 150 |
| maribo.Quester 0.3 | 1.9 | 15.9% | 45 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.1 | 13.0% | 36 |
| gre.svman4.Leonidas 1.3.2 | 4.4 | 11.4% | 22 |
| labg.Cataclysm 2.05 | 4.9 | 10.7% | 23 |
| baal.nano.N 1.42 | 5.9 | 8.9% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 8.1% | 1 |
| zyx.micro.Ant 1.1 | 8.4 | 5.3% | 1 |
| sanja.First 0.1 | 8.6 | 4.8% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 90.8 | 20 / 35 | 5107 |
| 2 | 1 | 68.5 | 83.2 | 18 / 35 | 4860 |
| 3 | 1 | 70.5 | 89.5 | 22 / 35 | 5260 |
| 4 | 1 | 68.5 | 84.8 | 16 / 35 | 4889 |
| 5 | 1 | 68.1 | 82.2 | 20 / 35 | 4851 |
| 6 | 1 | 69.1 | 86.7 | 19 / 35 | 4948 |
| 7 | 2 | 67.6 | 80.6 | 14 / 35 | 4723 |
| 8 | 1 | 70.0 | 88.6 | 21 / 35 | 5439 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 72 | 83% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 44 | 77% |
| gre.svman4.Leonidas 1.3.2 | 43 | 81% |
| labg.Cataclysm 2.05 | 14 | 64% |
| baal.nano.N 1.42 | 5 | 100% |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 135 of 280 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 45 | 33% | 111 |
| gre.svman4.Leonidas 1.3.2 | 29 | 21% | 54 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 19% | 59 |
| labg.Cataclysm 2.05 | 15 | 11% | 20 |
| baal.nano.N 1.42 | 7 | 5% | 17 |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 4% | 12 |
| zyx.micro.Ant 1.1 | 3 | 2% | 4 |
| sanja.First 0.1 | 1 | 1% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 222727 melee ticks, 65605 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 42 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 1.

Targeting waves (275 rounds): 72117 sent, 65673 reached their opponent, 9722 virtual hits (14.8% of those reached).

## Melee bench: F34

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 768 over 8 battles (96.0 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 87.5 | 114 / 280 | 2.12 | 18.4% | 41113 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.1 | 18.4% | 114 |
| kid.Gladiator .7.2 | 2.4 | 15.7% | 55 |
| stelo.Spread 0.9 | 2.5 | 15.7% | 73 |
| jcs.Seth 1.8 | 4.1 | 11.7% | 29 |
| tcf.Reach 3 | 5.1 | 10.5% | 6 |
| cli.Dancer 1.1 | 5.8 | 9.8% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.8% | 1 |
| sample.VelociRobot 1.0 | 9.4 | 3.2% | 0 |
| sample.RamFire 1.0 | 9.6 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 91.1 | 15 / 35 | 5237 |
| 2 | 1 | 69.8 | 88.9 | 18 / 35 | 5470 |
| 3 | 2 | 67.3 | 84.1 | 9 / 35 | 4739 |
| 4 | 1 | 69.0 | 87.6 | 17 / 35 | 4939 |
| 5 | 1 | 68.3 | 85.4 | 15 / 35 | 4988 |
| 6 | 1 | 69.5 | 90.5 | 11 / 35 | 5345 |
| 7 | 1 | 67.8 | 84.8 | 14 / 35 | 4948 |
| 8 | 1 | 69.5 | 87.9 | 15 / 35 | 5447 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 88 | 55% |
| kid.Gladiator .7.2 | 70 | 53% |
| jcs.Seth 1.8 | 26 | 42% |
| tcf.Reach 3 | 13 | 85% |
| ratosh.Wesco 1.4 | 4 | 50% |
| cli.Dancer 1.1 | 4 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 172 of 280 rounds, at a mean tick of 1097. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 64 | 37% | 99 |
| stelo.Spread 0.9 | 58 | 34% | 105 |
| jcs.Seth 1.8 | 24 | 14% | 36 |
| tcf.Reach 3 | 12 | 7% | 24 |
| cli.Dancer 1.1 | 4 | 2% | 9 |
| ratosh.Wesco 1.4 | 2 | 1% | 5 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |
| sample.RamFire 1.0 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 227312 melee ticks, 81476 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 891 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 321 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 0.

Targeting waves (275 rounds): 70411 sent, 63964 reached their opponent, 10596 virtual hits (16.6% of those reached).

## Melee bench: F35

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 550 over 8 battles (68.8 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 79.8 | 41 / 280 | 2.81 | 15.4% | 30012 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.6% | 190 |
| hadur2.Hadur 3.18.1ow | 2.0 | 15.4% | 41 |
| gh.mini.Gruwel 0.9 | 3.1 | 13.4% | 35 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 12.0% | 9 |
| rz.HawkOnFire 0.1 | 4.6 | 11.7% | 6 |
| wit.Chuliath 1.0 | 6.6 | 6.4% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.3 | 6.0% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.3 | 6.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.7% | 0 |
| dans.Cinnamon 1.2 | 9.6 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.0 | 81.6 | 4 / 35 | 3955 |
| 2 | 2 | 64.3 | 81.3 | 7 / 35 | 3676 |
| 3 | 2 | 64.0 | 79.7 | 4 / 35 | 3732 |
| 4 | 2 | 63.5 | 78.7 | 3 / 35 | 3727 |
| 5 | 2 | 61.9 | 73.7 | 6 / 35 | 3171 |
| 6 | 2 | 65.5 | 81.3 | 7 / 35 | 4134 |
| 7 | 2 | 65.7 | 83.2 | 8 / 35 | 3922 |
| 8 | 2 | 63.9 | 79.4 | 2 / 35 | 3695 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 101 | 14% |
| gh.mini.Gruwel 0.9 | 28 | 36% |
| dmh.robocode.robot.BlackDeath 9.2 | 11 | 55% |
| rz.HawkOnFire 0.1 | 10 | 80% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 100% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 244 of 280 rounds, at a mean tick of 919. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 129 | 53% | 146 |
| gh.mini.Gruwel 0.9 | 41 | 17% | 52 |
| dmh.robocode.robot.BlackDeath 9.2 | 34 | 14% | 40 |
| rz.HawkOnFire 0.1 | 23 | 9% | 27 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 2% | 6 |
| wit.Chuliath 1.0 | 3 | 1% | 3 |
| dans.Cinnamon 1.2 | 2 | 1% | 3 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |
| myl.nano.KomoriNinja 1.1 | 1 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 197411 melee ticks, 56646 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 42 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 0.

Targeting waves (276 rounds): 60532 sent, 53807 reached their opponent, 8401 virtual hits (15.6% of those reached).

## Melee bench: F36

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 611 over 8 battles (76.4 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 92.1 | 205 / 280 | 1.71 | 20.7% | 43847 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.0 | 20.7% | 205 |
| alpha.RainingFire 1.0 | 2.3 | 12.6% | 20 |
| bzdp.Pansy 2.1 | 3.4 | 12.0% | 20 |
| bvh.micro.Freya 0.3 | 4.3 | 11.0% | 14 |
| mz.Cork 0.1 | 4.5 | 10.9% | 11 |
| m3thos.Eva02 0.7.1 | 6.1 | 9.7% | 7 |
| bvh.mini.Fenrir 0.39 | 6.5 | 9.3% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 5.3% | 0 |
| dl.BetterWalls 1.0 | 9.0 | 4.6% | 0 |
| sample.MyFirstRobot 1.0 | 9.8 | 3.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 87.6 | 23 / 35 | 5303 |
| 2 | 1 | 72.3 | 96.5 | 29 / 35 | 5650 |
| 3 | 1 | 71.2 | 93.3 | 27 / 35 | 5386 |
| 4 | 1 | 71.5 | 94.0 | 26 / 35 | 5523 |
| 5 | 1 | 71.1 | 91.1 | 26 / 35 | 5761 |
| 6 | 1 | 71.0 | 92.4 | 26 / 35 | 5362 |
| 7 | 1 | 71.1 | 91.4 | 25 / 35 | 5679 |
| 8 | 1 | 70.2 | 90.5 | 23 / 35 | 5183 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.Cork 0.1 | 50 | 90% |
| bvh.micro.Freya 0.3 | 48 | 85% |
| bzdp.Pansy 2.1 | 46 | 80% |
| alpha.RainingFire 1.0 | 42 | 93% |
| bvh.mini.Fenrir 0.39 | 22 | 100% |
| m3thos.Eva02 0.7.1 | 21 | 86% |
| sample.MyFirstRobot 1.0 | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 80 of 280 rounds, at a mean tick of 848. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.micro.Freya 0.3 | 19 | 24% | 45 |
| alpha.RainingFire 1.0 | 17 | 21% | 56 |
| bzdp.Pansy 2.1 | 15 | 19% | 61 |
| mz.Cork 0.1 | 11 | 14% | 52 |
| m3thos.Eva02 0.7.1 | 9 | 11% | 27 |
| bvh.mini.Fenrir 0.39 | 3 | 4% | 19 |
| squidM.TentalceMeleeNano 1.1 | 1 | 1% | 6 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 6 |
| dl.BetterWalls 1.0 | 0 | 0% | 8 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 194943 melee ticks, 63336 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 48 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 2.

Targeting waves (274 rounds): 66916 sent, 60655 reached their opponent, 12348 virtual hits (20.4% of those reached).

## Melee bench: F37

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 407 over 8 battles (50.9 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 88.7 | 215 / 280 | 2.02 | 19.6% | 46747 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.0 | 19.6% | 215 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.0 | 10.7% | 13 |
| EBBU.Sim2 1.02 | 3.6 | 9.9% | 4 |
| agrach.Dalek 1.0 | 4.5 | 9.6% | 13 |
| germ.TheMind .2 | 4.5 | 9.8% | 9 |
| lmk.ACPFinal 0.1 | 6.8 | 8.5% | 5 |
| stelo.UntouchableNano 1.3 | 6.9 | 8.4% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 7.8 | 8.1% | 1 |
| mb.Beast 0.1 | 7.9 | 8.1% | 7 |
| skm.Ryubot 1.0 | 9.1 | 7.3% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 96.2 | 32 / 35 | 5968 |
| 2 | 1 | 70.1 | 94.0 | 27 / 35 | 6051 |
| 3 | 1 | 70.7 | 93.7 | 29 / 35 | 6298 |
| 4 | 1 | 68.7 | 87.6 | 27 / 35 | 5775 |
| 5 | 1 | 66.1 | 79.7 | 24 / 35 | 5333 |
| 6 | 1 | 67.3 | 84.4 | 24 / 35 | 5612 |
| 7 | 1 | 69.2 | 88.9 | 27 / 35 | 6064 |
| 8 | 1 | 67.5 | 84.8 | 25 / 35 | 5646 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 35 | 100% |
| EBBU.Sim2 1.02 | 32 | 100% |
| stelo.UntouchableNano 1.3 | 31 | 84% |
| com.syncleus.robocode.Dreadnaught 0.1 | 31 | 97% |
| germ.TheMind .2 | 29 | 97% |
| lmk.ACPFinal 0.1 | 29 | 93% |
| mb.Beast 0.1 | 21 | 90% |
| skm.Ryubot 1.0 | 18 | 94% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 50% |

Hadur died in 69 of 280 rounds, at a mean tick of 423. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 14 | 20% | 50 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 20% | 22 |
| lmk.ACPFinal 0.1 | 10 | 14% | 26 |
| agrach.Dalek 1.0 | 7 | 10% | 53 |
| stelo.UntouchableNano 1.3 | 7 | 10% | 31 |
| mb.Beast 0.1 | 5 | 7% | 29 |
| EBBU.Sim2 1.02 | 4 | 6% | 33 |
| germ.TheMind .2 | 3 | 4% | 23 |
| skm.Ryubot 1.0 | 3 | 4% | 10 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 271 rounds): 128767 melee ticks, 33258 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 68 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (271 rounds): longest scan gap while four or more were alive 68 ticks (271 rounds over 8); rounds whose longest gap at any count was over 8: 271; robots dropped as dead without a death event: 1.

Targeting waves (271 rounds): 43026 sent, 37194 reached their opponent, 11119 virtual hits (29.9% of those reached).

## Melee bench: F38

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 173 over 8 battles (21.6 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 85.9 | 137 / 280 | 2.27 | 17.9% | 37150 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.0 | 17.9% | 137 |
| justin.Mallais 14.0 | 2.0 | 15.4% | 72 |
| bvh.mini.Freya 0.55 | 3.0 | 13.2% | 21 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.4% | 30 |
| cs.Wren 1.0 | 5.1 | 10.5% | 5 |
| kdf.KoulDestroyer 1.0 | 6.0 | 9.7% | 9 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.6 | 8.5% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.0% | 3 |
| matt.UnderDark3 2.4.34 | 9.1 | 3.9% | 0 |
| bzdp.BoxCar 2.0 | 9.9 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 84.8 | 19 / 35 | 4547 |
| 2 | 1 | 68.3 | 88.9 | 17 / 35 | 4769 |
| 3 | 1 | 68.2 | 87.6 | 19 / 35 | 4537 |
| 4 | 1 | 66.0 | 79.7 | 14 / 35 | 4521 |
| 5 | 1 | 69.4 | 89.8 | 21 / 35 | 5006 |
| 6 | 1 | 66.2 | 82.2 | 13 / 35 | 4379 |
| 7 | 1 | 67.4 | 84.4 | 16 / 35 | 4719 |
| 8 | 1 | 68.7 | 89.5 | 18 / 35 | 4672 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 87 | 70% |
| bts.mega.Gnarly 1.4 | 34 | 62% |
| bvh.mini.Freya 0.55 | 34 | 71% |
| cs.Wren 1.0 | 19 | 95% |
| kdf.KoulDestroyer 1.0 | 10 | 70% |
| matt.UnderDark3 2.4.34 | 3 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 33% |
| davidalves.net.DuelistNanoMelee 1.01 | 2 | 100% |

Hadur died in 145 of 280 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 46 | 32% | 99 |
| bvh.mini.Freya 0.55 | 36 | 25% | 56 |
| bts.mega.Gnarly 1.4 | 23 | 16% | 48 |
| cs.Wren 1.0 | 17 | 12% | 37 |
| kdf.KoulDestroyer 1.0 | 11 | 8% | 16 |
| davidalves.net.DuelistNanoMelee 1.01 | 5 | 3% | 10 |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 3% | 8 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 3 |
| bzdp.BoxCar 2.0 | 1 | 1% | 3 |

Posture (Hadur's M records, 273 rounds): 184102 melee ticks, 51108 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 40 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 1.

Targeting waves (273 rounds): 60371 sent, 53669 reached their opponent, 11349 virtual hits (21.1% of those reached).

## Melee bench: F39

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 925 over 8 battles (115.6 per battle, most in one battle 142). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 84.2 | 125 / 280 | 2.43 | 17.8% | 39910 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.0 | 17.8% | 125 |
| bvh.fry.Freya 0.82 | 2.0 | 14.8% | 31 |
| az.Ololobot 0.2.4 | 3.1 | 12.9% | 78 |
| catcat20.Lambda 0.024 | 3.9 | 11.9% | 33 |
| winamp32.micro.MicroMacro 1.0 | 5.9 | 8.3% | 3 |
| gimp.GimpBot 0.1 | 6.1 | 8.1% | 4 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 7.9% | 2 |
| stelo.SoRobotNanoMelee 1.2 | 7.3 | 7.2% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.9% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 84.4 | 18 / 35 | 4618 |
| 2 | 1 | 64.1 | 75.9 | 11 / 35 | 4678 |
| 3 | 1 | 67.7 | 88.6 | 14 / 35 | 5099 |
| 4 | 1 | 68.7 | 87.3 | 17 / 35 | 5501 |
| 5 | 1 | 67.6 | 84.1 | 15 / 35 | 5294 |
| 6 | 1 | 68.4 | 87.6 | 21 / 35 | 5120 |
| 7 | 1 | 66.6 | 83.8 | 16 / 35 | 4686 |
| 8 | 1 | 66.0 | 81.6 | 13 / 35 | 4914 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 67 | 84% |
| az.Ololobot 0.2.4 | 52 | 48% |
| catcat20.Lambda 0.024 | 40 | 55% |
| winamp32.micro.MicroMacro 1.0 | 10 | 100% |
| gimp.GimpBot 0.1 | 6 | 83% |
| apollokidd.ApolloKidd 0.9 | 4 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 1 | 100% |

Hadur died in 163 of 280 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 57 | 35% | 102 |
| az.Ololobot 0.2.4 | 38 | 23% | 61 |
| catcat20.Lambda 0.024 | 30 | 18% | 54 |
| stelo.SoRobotNanoMelee 1.2 | 10 | 6% | 12 |
| apollokidd.ApolloKidd 0.9 | 8 | 5% | 12 |
| gimp.GimpBot 0.1 | 6 | 4% | 21 |
| winamp32.micro.MicroMacro 1.0 | 4 | 2% | 12 |
| dcs.Eater_of_Worlds 1.1.3-A | 3 | 2% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 3 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 278 rounds): 219771 melee ticks, 57001 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (278 rounds): longest scan gap while four or more were alive 32 ticks (278 rounds over 8); rounds whose longest gap at any count was over 8: 278; robots dropped as dead without a death event: 0.

Targeting waves (278 rounds): 69326 sent, 62762 reached their opponent, 11019 virtual hits (17.6% of those reached).

## Melee bench: F40

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 361 over 8 battles (45.1 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.6 | 162 / 280 | 2.03 | 19.3% | 40168 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.0 | 19.3% | 162 |
| kawigi.mini.Coriantumr 1.1 | 2.3 | 14.9% | 48 |
| kano.gamma.KanoGamma 1.8 | 3.1 | 12.4% | 26 |
| mz.AntiGrav 1.0 | 4.4 | 11.2% | 19 |
| Polkwane.SmashMelee 1.0 | 5.4 | 10.1% | 6 |
| stelo.Randomness 1.0 | 5.9 | 9.3% | 13 |
| alpha.BlackIce 1.0 | 6.0 | 9.3% | 7 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.6% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 3.9% | 0 |
| sample.Corners 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 87.9 | 20 / 35 | 5194 |
| 2 | 1 | 69.2 | 85.7 | 20 / 35 | 5167 |
| 3 | 1 | 69.7 | 90.5 | 22 / 35 | 4774 |
| 4 | 1 | 69.5 | 89.5 | 24 / 35 | 4572 |
| 5 | 1 | 69.7 | 90.5 | 19 / 35 | 5005 |
| 6 | 1 | 68.4 | 87.6 | 14 / 35 | 5074 |
| 7 | 1 | 69.2 | 85.4 | 21 / 35 | 4998 |
| 8 | 1 | 71.0 | 91.7 | 22 / 35 | 5384 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 67 | 72% |
| kano.gamma.KanoGamma 1.8 | 57 | 82% |
| mz.AntiGrav 1.0 | 26 | 85% |
| Polkwane.SmashMelee 1.0 | 19 | 89% |
| stelo.Randomness 1.0 | 18 | 78% |
| alpha.BlackIce 1.0 | 11 | 91% |
| amk.superstrike.SuperStrike 0.3 | 4 | 100% |

Hadur died in 122 of 280 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 47 | 39% | 93 |
| kano.gamma.KanoGamma 1.8 | 27 | 22% | 76 |
| mz.AntiGrav 1.0 | 19 | 16% | 41 |
| stelo.Randomness 1.0 | 9 | 7% | 21 |
| Polkwane.SmashMelee 1.0 | 8 | 7% | 19 |
| alpha.BlackIce 1.0 | 5 | 4% | 19 |
| amk.superstrike.SuperStrike 0.3 | 4 | 3% | 7 |
| sample.Corners 1.0 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 271 rounds): 204795 melee ticks, 54741 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (271 rounds): longest scan gap while four or more were alive 56 ticks (271 rounds over 8); rounds whose longest gap at any count was over 8: 271; robots dropped as dead without a death event: 0.

Targeting waves (271 rounds): 66074 sent, 59460 reached their opponent, 11899 virtual hits (20.0% of those reached).

## Melee bench: F41

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 984 over 8 battles (123.0 per battle, most in one battle 231). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.9 | 129 / 280 | 2.09 | 18.2% | 36228 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.1 | 18.2% | 129 |
| eem.EvBotNG v12.8 | 1.9 | 16.9% | 110 |
| ary.Swarm 1.1 | 3.5 | 12.6% | 12 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 12.4% | 14 |
| simonton.nano.MeleeSeed 1.8 | 5.3 | 10.3% | 6 |
| shrub.Silver v048 | 6.0 | 8.8% | 4 |
| zyx.nano.Ant 1.1 | 6.9 | 7.8% | 2 |
| stelo.Mirror 1.1 | 8.4 | 5.6% | 1 |
| jsal.Jsalbot 1.0 | 8.5 | 5.4% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 87.9 | 18 / 35 | 4833 |
| 2 | 1 | 66.3 | 84.1 | 13 / 35 | 4161 |
| 3 | 1 | 69.8 | 92.7 | 19 / 35 | 4771 |
| 4 | 1 | 68.2 | 87.3 | 15 / 35 | 4468 |
| 5 | 1 | 69.4 | 91.4 | 19 / 35 | 4619 |
| 6 | 1 | 68.7 | 88.9 | 17 / 35 | 4535 |
| 7 | 1 | 68.4 | 87.3 | 16 / 35 | 4539 |
| 8 | 2 | 67.1 | 83.8 | 12 / 35 | 4302 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 118 | 43% |
| lessonz.robocode.Oz 0.5.0 | 35 | 86% |
| ary.Swarm 1.1 | 28 | 89% |
| simonton.nano.MeleeSeed 1.8 | 17 | 94% |
| shrub.Silver v048 | 9 | 67% |
| zyx.nano.Ant 1.1 | 2 | 50% |
| acogdev.alpha 0.2 | 1 | 0% |

Hadur died in 159 of 280 rounds, at a mean tick of 973. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 86 | 54% | 135 |
| lessonz.robocode.Oz 0.5.0 | 19 | 12% | 41 |
| ary.Swarm 1.1 | 18 | 11% | 46 |
| simonton.nano.MeleeSeed 1.8 | 13 | 8% | 28 |
| shrub.Silver v048 | 9 | 6% | 19 |
| zyx.nano.Ant 1.1 | 3 | 2% | 4 |
| stelo.Mirror 1.1 | 1 | 1% | 3 |
| jsal.Jsalbot 1.0 | 1 | 1% | 2 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 277 rounds): 210788 melee ticks, 68124 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 81 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (277 rounds): longest scan gap while four or more were alive 81 ticks (277 rounds over 8); rounds whose longest gap at any count was over 8: 277; robots dropped as dead without a death event: 1.

Targeting waves (277 rounds): 68699 sent, 62032 reached their opponent, 9533 virtual hits (15.4% of those reached).

## Melee bench: F42

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 614 over 8 battles (76.8 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 90.0 | 176 / 280 | 1.90 | 19.8% | 45476 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.0 | 19.8% | 176 |
| wompi.Wallaby 5.1 | 2.1 | 15.6% | 55 |
| maribo.mini.MiniQuester 0.1 | 3.4 | 13.5% | 23 |
| ara.Shera 0.88 | 3.5 | 12.6% | 24 |
| amz.NanoClone 1.41 | 5.0 | 8.8% | 1 |
| dsw.StaticD 1.0 | 6.6 | 6.9% | 2 |
| maribo.IotaCT 1.1 | 7.4 | 6.5% | 0 |
| stelo.MirrorMicro 1.0 | 7.8 | 5.9% | 0 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 87.0 | 19 / 35 | 5778 |
| 2 | 1 | 70.1 | 90.5 | 24 / 35 | 5528 |
| 3 | 1 | 71.2 | 93.7 | 23 / 35 | 5918 |
| 4 | 1 | 70.4 | 89.5 | 21 / 35 | 5974 |
| 5 | 1 | 70.9 | 94.0 | 25 / 35 | 5709 |
| 6 | 1 | 71.3 | 94.0 | 26 / 35 | 5943 |
| 7 | 1 | 69.7 | 87.3 | 20 / 35 | 5673 |
| 8 | 1 | 67.4 | 84.4 | 18 / 35 | 4953 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 124 | 86% |
| maribo.mini.MiniQuester 0.1 | 48 | 83% |
| ara.Shera 0.88 | 33 | 67% |
| dsw.StaticD 1.0 | 2 | 100% |
| amz.NanoClone 1.41 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 109 of 280 rounds, at a mean tick of 900. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 39 | 36% | 127 |
| ara.Shera 0.88 | 31 | 28% | 55 |
| maribo.mini.MiniQuester 0.1 | 21 | 19% | 72 |
| amz.NanoClone 1.41 | 6 | 6% | 8 |
| dsw.StaticD 1.0 | 4 | 4% | 10 |
| maribo.IotaCT 1.1 | 2 | 2% | 2 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 1 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 268 rounds): 213732 melee ticks, 58689 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (268 rounds): longest scan gap while four or more were alive 54 ticks (268 rounds over 8); rounds whose longest gap at any count was over 8: 268; robots dropped as dead without a death event: 3.

Targeting waves (268 rounds): 67069 sent, 60990 reached their opponent, 11936 virtual hits (19.6% of those reached).

## Melee bench: F43

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 711 over 8 battles (88.9 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 77.4 | 40 / 280 | 3.04 | 15.2% | 31153 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.8% | 193 |
| hadur2.Hadur 3.18.1ow | 2.0 | 15.2% | 40 |
| brainfade.melee.Dusk 0.44 | 3.5 | 12.6% | 31 |
| dummy.micro.Sparrow 2.5 | 3.8 | 12.0% | 9 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 10.8% | 4 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.2% | 2 |
| jab.DiamondStealer 5 | 7.4 | 7.6% | 1 |
| mz.NanoGod 2.02 | 7.6 | 7.4% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.0% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.5 | 76.5 | 3 / 35 | 3886 |
| 2 | 2 | 65.0 | 77.8 | 3 / 35 | 3803 |
| 3 | 2 | 63.9 | 74.0 | 6 / 35 | 3754 |
| 4 | 2 | 65.3 | 79.0 | 5 / 35 | 3956 |
| 5 | 2 | 63.5 | 74.0 | 4 / 35 | 3778 |
| 6 | 2 | 65.6 | 80.3 | 6 / 35 | 3828 |
| 7 | 2 | 64.7 | 74.6 | 6 / 35 | 4090 |
| 8 | 2 | 66.7 | 82.9 | 7 / 35 | 4058 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 98 | 18% |
| brainfade.melee.Dusk 0.44 | 16 | 50% |
| dummy.micro.Sparrow 2.5 | 11 | 82% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 75% |
| Krabb.akim2.Akim2 1.1b | 1 | 0% |
| jab.DiamondStealer 5 | 1 | 100% |

Hadur died in 246 of 280 rounds, at a mean tick of 921. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 149 | 61% | 167 |
| brainfade.melee.Dusk 0.44 | 31 | 13% | 39 |
| dummy.micro.Sparrow 2.5 | 26 | 11% | 33 |
| wcsv.melee.EngineerMelee 0.1 | 15 | 6% | 18 |
| Krabb.akim2.Akim2 1.1b | 7 | 3% | 7 |
| mz.NanoGod 2.02 | 6 | 2% | 8 |
| jab.DiamondStealer 5 | 5 | 2% | 6 |
| cvt.Firsty 1.0 | 1 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 204444 melee ticks, 56429 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 41 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 0.

Targeting waves (276 rounds): 65535 sent, 58937 reached their opponent, 9898 virtual hits (16.8% of those reached).

## Melee bench: F44

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 288 over 8 battles (36.0 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 89.6 | 167 / 280 | 1.93 | 20.1% | 45973 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.0 | 20.1% | 167 |
| stelo.Liblix 0.3.1 | 2.1 | 15.3% | 68 |
| tzu.TheArtOfWar 1.2 | 2.9 | 14.0% | 31 |
| jwirde.Gort 2.0 | 4.5 | 9.8% | 9 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.5 | 9.8% | 2 |
| wompi.Quokka 1.6 | 6.8 | 7.6% | 0 |
| disan.Chair 2.2.0 | 6.9 | 7.5% | 3 |
| stf.PanzerGeneral 0.1 | 7.4 | 7.1% | 2 |
| sample.Crazy 1.0 | 9.5 | 4.5% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 91.1 | 21 / 35 | 6025 |
| 2 | 1 | 70.6 | 88.3 | 20 / 35 | 6084 |
| 3 | 1 | 68.0 | 83.2 | 18 / 35 | 5296 |
| 4 | 1 | 70.8 | 91.1 | 24 / 35 | 5592 |
| 5 | 1 | 70.8 | 91.4 | 22 / 35 | 5863 |
| 6 | 1 | 70.1 | 91.1 | 18 / 35 | 5410 |
| 7 | 1 | 71.2 | 92.7 | 22 / 35 | 5808 |
| 8 | 1 | 70.3 | 88.3 | 22 / 35 | 5895 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 91 | 60% |
| tzu.TheArtOfWar 1.2 | 75 | 84% |
| jwirde.Gort 2.0 | 19 | 84% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 14 | 93% |
| disan.Chair 2.2.0 | 11 | 91% |
| stf.PanzerGeneral 0.1 | 4 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| wompi.Quokka 1.6 | 3 | 100% |

Hadur died in 116 of 280 rounds, at a mean tick of 931. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 61 | 53% | 119 |
| tzu.TheArtOfWar 1.2 | 29 | 25% | 84 |
| jwirde.Gort 2.0 | 9 | 8% | 31 |
| stf.PanzerGeneral 0.1 | 6 | 5% | 10 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 4% | 20 |
| disan.Chair 2.2.0 | 2 | 2% | 9 |
| wompi.Quokka 1.6 | 1 | 1% | 6 |
| sample.Crazy 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 205348 melee ticks, 61787 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 48 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 1.

Targeting waves (272 rounds): 70095 sent, 63894 reached their opponent, 13539 virtual hits (21.2% of those reached).

## Melee bench: F45

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 533 over 8 battles (66.6 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 85.7 | 132 / 280 | 2.29 | 19.2% | 43820 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18.1ow | 1.0 | 19.2% | 132 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 12.6% | 119 |
| jje.BagPuss 1.2 | 3.0 | 11.8% | 9 |
| myl.nano.Graviton 1.10 | 4.1 | 11.1% | 4 |
| sul.Lunar 1.1 | 4.6 | 10.4% | 9 |
| hvilela.HVilela 0.9 | 6.5 | 8.8% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 8.3% | 6 |
| fm.claire 1.7 | 7.6 | 7.9% | 1 |
| wit.Deep7 2.0 | 8.9 | 6.0% | 1 |
| abud.ThirdRobo 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 90.5 | 23 / 35 | 5911 |
| 2 | 1 | 67.8 | 82.2 | 22 / 35 | 4814 |
| 3 | 1 | 64.6 | 76.5 | 9 / 35 | 4548 |
| 4 | 1 | 69.5 | 88.9 | 16 / 35 | 5553 |
| 5 | 1 | 70.7 | 89.5 | 19 / 35 | 6066 |
| 6 | 1 | 67.3 | 82.5 | 10 / 35 | 5455 |
| 7 | 1 | 69.9 | 87.6 | 16 / 35 | 5898 |
| 8 | 1 | 69.0 | 87.9 | 17 / 35 | 5575 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 115 | 57% |
| sul.Lunar 1.1 | 22 | 91% |
| jje.BagPuss 1.2 | 19 | 74% |
| myl.nano.Graviton 1.10 | 16 | 94% |
| pez.mini.ChironexFleckeri 0.5 | 12 | 75% |
| hvilela.HVilela 0.9 | 5 | 100% |
| wit.Deep7 2.0 | 3 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 153 of 280 rounds, at a mean tick of 1478. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 55 | 36% | 0 |
| jje.BagPuss 1.2 | 28 | 18% | 86 |
| myl.nano.Graviton 1.10 | 20 | 13% | 62 |
| sul.Lunar 1.1 | 19 | 12% | 58 |
| pez.mini.ChironexFleckeri 0.5 | 9 | 6% | 24 |
| fm.claire 1.7 | 8 | 5% | 17 |
| hvilela.HVilela 0.9 | 5 | 3% | 15 |
| wit.Deep7 2.0 | 4 | 3% | 13 |
| abud.ThirdRobo 1.0 | 0 | 0% | 4 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 277 rounds): 275638 melee ticks, 121290 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (277 rounds): longest scan gap while four or more were alive 80 ticks (277 rounds over 8); rounds whose longest gap at any count was over 8: 277; robots dropped as dead without a death event: 1.

Targeting waves (277 rounds): 82358 sent, 76059 reached their opponent, 11517 virtual hits (15.1% of those reached).

## Melee bench: F46

hadur2.Hadur 3.18.1ow against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 823 over 8 battles (102.9 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 81.0 | 73 / 280 | 2.71 | 16.0% | 33207 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.5 | 17.3% | 90 |
| rsalesc.melee.Medina 0.4.5 | 1.9 | 16.9% | 103 |
| hadur2.Hadur 3.18.1ow | 2.6 | 16.0% | 73 |
| mz.MicroSheep 1.0 | 4.8 | 10.0% | 2 |
| cx.Princess 1.0 | 5.0 | 9.7% | 7 |
| sadoner.killer 0.2 | 5.3 | 9.5% | 3 |
| arthord.NanoSatanMelee Beta | 7.1 | 7.1% | 2 |
| jeremyreeder.collective.Prophet 5 | 8.4 | 5.5% | 0 |
| kurios.DOSexe .9a | 8.5 | 5.2% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.6 | 81.3 | 7 / 35 | 3814 |
| 2 | 3 | 64.1 | 76.5 | 7 / 35 | 4240 |
| 3 | 3 | 65.8 | 81.0 | 10 / 35 | 4397 |
| 4 | 2 | 65.9 | 83.5 | 9 / 35 | 4151 |
| 5 | 3 | 65.0 | 77.5 | 9 / 35 | 4364 |
| 6 | 3 | 65.0 | 81.6 | 7 / 35 | 3843 |
| 7 | 1 | 67.2 | 85.1 | 14 / 35 | 4501 |
| 8 | 3 | 65.1 | 81.6 | 10 / 35 | 3897 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 79 | 58% |
| rsalesc.melee.Medina 0.4.5 | 49 | 31% |
| cx.Princess 1.0 | 6 | 33% |
| arthord.NanoSatanMelee Beta | 6 | 67% |
| mz.MicroSheep 1.0 | 5 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 214 of 280 rounds, at a mean tick of 924. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 90 | 42% | 134 |
| rsalesc.melee.Medina 0.4.5 | 72 | 34% | 85 |
| cx.Princess 1.0 | 11 | 5% | 16 |
| sadoner.killer 0.2 | 11 | 5% | 16 |
| arthord.NanoSatanMelee Beta | 11 | 5% | 14 |
| mz.MicroSheep 1.0 | 6 | 3% | 9 |
| jeremyreeder.collective.Prophet 5 | 4 | 2% | 4 |
| kurios.DOSexe .9a | 2 | 1% | 2 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 280 rounds): 213219 melee ticks, 54481 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (280 rounds): longest scan gap while four or more were alive 54 ticks (280 rounds over 8); rounds whose longest gap at any count was over 8: 280; robots dropped as dead without a death event: 0.

Targeting waves (280 rounds): 61387 sent, 54707 reached their opponent, 8214 virtual hits (15.0% of those reached).

