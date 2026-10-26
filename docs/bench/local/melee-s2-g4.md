# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 227 over 6 battles (37.8 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 85.2 | 54 / 210 | 2.33 | 16.6% | 26563 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.8% | 135 |
| hadur2.Hadur 3.17.1g4 | 2.0 | 16.6% | 54 |
| sgp.JollyNinja 3.53 | 3.8 | 11.4% | 16 |
| mz.MicroGodMelee 1 | 4.0 | 11.3% | 3 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 11.0% | 1 |
| lorneswork.Predator 1.0 | 5.8 | 9.5% | 1 |
| adt.Ar2 1.0 | 7.0 | 7.3% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.5% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.2 | 86.7 | 13 / 35 | 4728 |
| 2 | 2 | 66.6 | 86.7 | 8 / 35 | 4614 |
| 3 | 2 | 66.0 | 84.4 | 9 / 35 | 4344 |
| 4 | 2 | 66.3 | 85.4 | 7 / 35 | 4589 |
| 5 | 2 | 65.4 | 85.7 | 8 / 35 | 4031 |
| 6 | 2 | 65.3 | 82.2 | 9 / 35 | 4257 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 109 | 9% |
| mz.MicroGodMelee 1 | 20 | 90% |
| sgp.JollyNinja 3.53 | 18 | 61% |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 100% |
| lorneswork.Predator 1.0 | 5 | 100% |
| adt.Ar2 1.0 | 2 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 1136. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 113 | 72% | 127 |
| sgp.JollyNinja 3.53 | 13 | 8% | 21 |
| mz.MicroGodMelee 1 | 10 | 6% | 27 |
| lorneswork.Predator 1.0 | 9 | 6% | 16 |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 6% | 14 |
| adt.Ar2 1.0 | 2 | 1% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 145718 melee ticks, 77410 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 54 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 47004 sent, 42557 reached their opponent, 9709 virtual hits (22.8% of those reached).

## Melee bench: F02

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 431 over 6 battles (71.8 per battle, most in one battle 152). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 85.7 | 97 / 210 | 2.29 | 17.7% | 25902 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.0 | 17.7% | 97 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 14.5% | 46 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.8% | 36 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.0% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.2 | 10.0% | 13 |
| Noran.BitchingElk 0.054 | 6.3 | 8.1% | 9 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 7.5% | 2 |
| sch.Simone 0.3d | 7.7 | 7.5% | 8 |
| stelo.PatternRobot 1.0 | 8.8 | 5.4% | 1 |
| fullsail.SweetTea 1.1 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 82.2 | 13 / 35 | 4237 |
| 2 | 1 | 65.5 | 82.9 | 12 / 35 | 4117 |
| 3 | 1 | 69.3 | 92.4 | 20 / 35 | 4643 |
| 4 | 1 | 67.7 | 87.3 | 18 / 35 | 4405 |
| 5 | 1 | 65.9 | 83.5 | 15 / 35 | 4065 |
| 6 | 1 | 67.4 | 85.7 | 19 / 35 | 4435 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 43 | 63% |
| pulsar.PulsarMax 0.8.9 | 33 | 45% |
| com.cohesiva.robocode.ManOwaR 1.0 | 23 | 74% |
| sch.Simone 0.3d | 16 | 88% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 93% |
| Noran.BitchingElk 0.054 | 13 | 54% |
| stelo.PatternRobot 1.0 | 2 | 100% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 1003. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 40 | 34% | 70 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 30 | 25% | 55 |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 9% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 9% | 16 |
| Noran.BitchingElk 0.054 | 10 | 8% | 17 |
| sch.Simone 0.3d | 7 | 6% | 18 |
| fullsail.SweetTea 1.1 | 4 | 3% | 5 |
| fnc.bandit.Bandit 5.2.0 | 1 | 1% | 2 |
| stelo.PatternRobot 1.0 | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 172402 melee ticks, 43343 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 54 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 61397 sent, 56923 reached their opponent, 10686 virtual hits (18.8% of those reached).

## Melee bench: F03

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 158 over 6 battles (26.3 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 93.0 | 151 / 210 | 1.63 | 20.0% | 35017 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.0 | 20.0% | 151 |
| radnor.DoctorBob 1.42 | 2.0 | 14.7% | 22 |
| kawigi.nano.Lib 1.0 | 3.5 | 12.7% | 12 |
| vuen.Cake 2.51 | 3.5 | 12.8% | 22 |
| urdos.URDOS 1.3 | 5.0 | 9.2% | 3 |
| adt.Ar1 2.1 | 6.8 | 7.2% | 0 |
| oa.weak.FlyMk1 0.1 | 7.0 | 6.7% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 6.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.3% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 93.0 | 25 / 35 | 5656 |
| 2 | 1 | 68.3 | 87.6 | 22 / 35 | 5475 |
| 3 | 1 | 70.8 | 93.0 | 27 / 35 | 6004 |
| 4 | 1 | 70.1 | 92.1 | 21 / 35 | 5991 |
| 5 | 1 | 70.8 | 95.2 | 26 / 35 | 6038 |
| 6 | 1 | 71.3 | 97.1 | 30 / 35 | 5853 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 65 | 86% |
| radnor.DoctorBob 1.42 | 55 | 95% |
| kawigi.nano.Lib 1.0 | 37 | 89% |
| urdos.URDOS 1.3 | 4 | 75% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 846. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 28 | 47% | 79 |
| kawigi.nano.Lib 1.0 | 14 | 24% | 39 |
| vuen.Cake 2.51 | 9 | 15% | 61 |
| urdos.URDOS 1.3 | 3 | 5% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 3% | 3 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 9 |
| adt.Ar1 2.1 | 1 | 2% | 4 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 5 |

Posture (Hadur's M records, 198 rounds): 134660 melee ticks, 37254 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 44 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 44 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 40730 sent, 36486 reached their opponent, 10316 virtual hits (28.3% of those reached).

## Melee bench: F04

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 776 over 6 battles (129.3 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 85.4 | 27 / 210 | 2.31 | 16.7% | 29154 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.0% | 170 |
| hadur2.Hadur 3.17.1g4 | 2.0 | 16.7% | 27 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.3% | 9 |
| TNT.TNT 0.99.1 | 4.0 | 10.9% | 4 |
| josago.Jorgito 0.16 | 5.0 | 9.1% | 0 |
| css.Delitioner 0.11 | 6.0 | 7.6% | 0 |
| tj.zombie1n 1.0.1 | 7.0 | 6.7% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.1% | 0 |
| spin.Bugstard 0.012b | 9.2 | 4.0% | 0 |
| sp.Nanos.Ember 1.1 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.7 | 86.0 | 2 / 35 | 4736 |
| 2 | 2 | 66.4 | 83.8 | 3 / 35 | 4661 |
| 3 | 2 | 66.9 | 84.8 | 5 / 35 | 4874 |
| 4 | 2 | 67.7 | 87.3 | 9 / 35 | 4849 |
| 5 | 2 | 66.9 | 85.1 | 4 / 35 | 4874 |
| 6 | 2 | 67.3 | 85.7 | 4 / 35 | 5160 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 128 | 11% |
| apc.LeeroyJenkins2 1.0 | 15 | 60% |
| TNT.TNT 0.99.1 | 6 | 33% |
| css.Delitioner 0.11 | 1 | 100% |
| josago.Jorgito 0.16 | 1 | 100% |

Hadur died in 189 of 210 rounds, at a mean tick of 1321. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 143 | 76% | 160 |
| apc.LeeroyJenkins2 1.0 | 20 | 11% | 28 |
| TNT.TNT 0.99.1 | 9 | 5% | 11 |
| josago.Jorgito 0.16 | 6 | 3% | 6 |
| css.Delitioner 0.11 | 4 | 2% | 4 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 199590 melee ticks, 70421 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 85 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 66 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 62818 sent, 58301 reached their opponent, 9756 virtual hits (16.7% of those reached).

## Melee bench: F05

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 625 over 6 battles (104.2 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 76.2 | 17 / 210 | 3.14 | 13.9% | 19491 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 18.7% | 112 |
| justin.DemonicRage 3.4 | 1.8 | 17.8% | 68 |
| hadur2.Hadur 3.17.1g4 | 3.0 | 13.9% | 17 |
| wompi.Numbat 2.1 | 4.0 | 12.4% | 7 |
| ms.Ares 0.19 | 5.3 | 9.0% | 0 |
| axeBots.HataMoto 3.09 | 5.7 | 8.8% | 6 |
| supersample.SuperBoxBot 1.0 | 7.5 | 5.5% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.5% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.3% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.2 | 75.9 | 4 / 35 | 3157 |
| 2 | 3 | 63.1 | 79.7 | 2 / 35 | 3226 |
| 3 | 3 | 61.4 | 74.9 | 2 / 35 | 3213 |
| 4 | 3 | 63.2 | 78.7 | 2 / 35 | 3543 |
| 5 | 3 | 61.8 | 74.6 | 3 / 35 | 3310 |
| 6 | 3 | 61.1 | 73.7 | 4 / 35 | 3042 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 37 | 5% |
| justin.DemonicRage 3.4 | 35 | 26% |
| wompi.Numbat 2.1 | 7 | 71% |
| axeBots.HataMoto 3.09 | 2 | 50% |

Hadur died in 198 of 210 rounds, at a mean tick of 911. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 77 | 39% | 84 |
| cb.fire.Firestarter 2.0f | 67 | 34% | 72 |
| wompi.Numbat 2.1 | 25 | 13% | 29 |
| axeBots.HataMoto 3.09 | 13 | 7% | 14 |
| ms.Ares 0.19 | 8 | 4% | 8 |
| supersample.SuperBoxBot 1.0 | 1 | 1% | 1 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 155379 melee ticks, 33487 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 64 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 49066 sent, 44368 reached their opponent, 7941 virtual hits (17.9% of those reached).

## Melee bench: F06

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 257 over 6 battles (42.8 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.8 | 118 / 210 | 2.10 | 18.4% | 27824 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.0 | 18.4% | 118 |
| origin.SleepSiphon 1.7b | 2.2 | 14.8% | 45 |
| jekl.StoneGhost 0.7 | 2.8 | 14.1% | 25 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.3 | 12.1% | 14 |
| mld.Wisdom 1.0 | 4.7 | 10.7% | 3 |
| gg.Wolverine 2.0 | 6.0 | 8.5% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 6.7% | 5 |
| spinnercat.Omen 1.0 | 8.2 | 6.3% | 0 |
| DBall.NUKE 0.1 | 8.7 | 5.6% | 0 |
| sample.Fire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 88.9 | 20 / 35 | 4598 |
| 2 | 1 | 69.6 | 92.7 | 23 / 35 | 4619 |
| 3 | 1 | 66.9 | 83.8 | 15 / 35 | 4447 |
| 4 | 1 | 69.2 | 88.3 | 23 / 35 | 4925 |
| 5 | 1 | 68.7 | 87.6 | 20 / 35 | 4752 |
| 6 | 1 | 67.7 | 85.7 | 17 / 35 | 4483 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 57 | 74% |
| jekl.StoneGhost 0.7 | 46 | 78% |
| pe.minimelee.SandboxMiniMelee 1.1 | 25 | 80% |
| ers.nano.hawk.HawkLA 3.0m | 8 | 75% |
| gg.Wolverine 2.0 | 8 | 88% |
| mld.Wisdom 1.0 | 5 | 80% |
| sample.Fire 1.0 | 2 | 100% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 870. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 38 | 40% | 83 |
| jekl.StoneGhost 0.7 | 25 | 26% | 57 |
| mld.Wisdom 1.0 | 10 | 11% | 19 |
| pe.minimelee.SandboxMiniMelee 1.1 | 9 | 9% | 26 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 4% | 8 |
| gg.Wolverine 2.0 | 2 | 2% | 11 |
| spinnercat.Omen 1.0 | 2 | 2% | 2 |
| DBall.NUKE 0.1 | 1 | 1% | 3 |
| sample.Fire 1.0 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 152909 melee ticks, 45388 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 413 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 271 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 48296 sent, 43873 reached their opponent, 10712 virtual hits (24.4% of those reached).

## Melee bench: F07

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 528 over 6 battles (88.0 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 92.7 | 110 / 210 | 1.66 | 19.9% | 34547 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.0 | 19.9% | 110 |
| rsalesc.melee.Monk 0.3.6c | 2.0 | 17.4% | 48 |
| rtk.Tachikoma 1.0 | 3.0 | 16.0% | 30 |
| franzor.Lizt 1.3.1 | 4.5 | 11.0% | 13 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 11.3% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 7.7% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.8% | 1 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.5% | 0 |
| sample.Target 1.0 | 9.3 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 93.3 | 21 / 35 | 6250 |
| 2 | 1 | 70.4 | 90.2 | 13 / 35 | 5543 |
| 3 | 1 | 71.8 | 93.0 | 21 / 35 | 5543 |
| 4 | 1 | 72.1 | 95.2 | 21 / 35 | 5723 |
| 5 | 1 | 70.7 | 91.1 | 15 / 35 | 5661 |
| 6 | 1 | 71.2 | 93.3 | 19 / 35 | 5827 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 76 | 71% |
| rsalesc.melee.Monk 0.3.6c | 52 | 25% |
| franzor.Lizt 1.3.1 | 36 | 72% |
| oog.melee.CapuletDroid 1.1 | 20 | 80% |
| exauge.GateKeeper 1.1.121g | 2 | 50% |

Hadur died in 104 of 210 rounds, at a mean tick of 1475. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 48 | 46% | 81 |
| rtk.Tachikoma 1.0 | 31 | 30% | 90 |
| franzor.Lizt 1.3.1 | 10 | 10% | 1 |
| oog.melee.CapuletDroid 1.1 | 9 | 9% | 34 |
| exauge.GateKeeper 1.1.121g | 2 | 2% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 193088 melee ticks, 94631 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 94 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 94 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 59579 sent, 55060 reached their opponent, 12179 virtual hits (22.1% of those reached).

## Melee bench: F08

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 329 over 6 battles (54.8 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 91.5 | 137 / 210 | 1.76 | 19.2% | 26641 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.0 | 19.2% | 137 |
| shrub.Vapour v159 | 2.7 | 12.4% | 24 |
| tm.Yuugao 1.0 | 2.8 | 13.1% | 31 |
| com.spp.robocode.MostlyHarmless 010 | 3.8 | 10.4% | 5 |
| Krabb.sliNk.Garm 0.9u | 4.8 | 10.3% | 8 |
| m3thos.Eva00 1.1 | 6.0 | 8.9% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 7.0 | 8.1% | 4 |
| qualidafial.MajorDick 1.0.1 | 8.2 | 6.6% | 0 |
| SHAM.WOW 1.4 | 8.8 | 5.9% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 93.0 | 27 / 35 | 4426 |
| 2 | 1 | 68.2 | 89.8 | 21 / 35 | 4533 |
| 3 | 1 | 67.9 | 89.2 | 21 / 35 | 4173 |
| 4 | 1 | 70.2 | 95.2 | 27 / 35 | 4777 |
| 5 | 1 | 67.6 | 89.5 | 19 / 35 | 4055 |
| 6 | 1 | 69.0 | 92.4 | 22 / 35 | 4677 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 50 | 74% |
| shrub.Vapour v159 | 42 | 67% |
| com.spp.robocode.MostlyHarmless 010 | 24 | 100% |
| Krabb.sliNk.Garm 0.9u | 23 | 83% |
| m3thos.Eva00 1.1 | 16 | 94% |
| jwst.DAD.DarkAndDarker 1.1 | 7 | 86% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 23 | 30% | 54 |
| tm.Yuugao 1.0 | 21 | 28% | 64 |
| Krabb.sliNk.Garm 0.9u | 13 | 17% | 33 |
| com.spp.robocode.MostlyHarmless 010 | 8 | 11% | 29 |
| jwst.DAD.DarkAndDarker 1.1 | 3 | 4% | 12 |
| qualidafial.MajorDick 1.0.1 | 3 | 4% | 4 |
| SHAM.WOW 1.4 | 2 | 3% | 6 |
| m3thos.Eva00 1.1 | 1 | 1% | 7 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 155807 melee ticks, 43316 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 56 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 50478 sent, 45956 reached their opponent, 9177 virtual hits (20.0% of those reached).

## Melee bench: F09

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 761 over 6 battles (126.8 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 78.4 | 62 / 210 | 2.95 | 15.4% | 20466 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.1% | 94 |
| hadur2.Hadur 3.17.1g4 | 2.0 | 15.4% | 62 |
| kc.micro.Figment 1.0 | 2.8 | 14.2% | 25 |
| yagami.Tidus 0.11 | 4.3 | 10.8% | 0 |
| pedersen.Grishnakh 1.0 | 5.2 | 9.8% | 9 |
| mc2.enemy.Original 0.9 | 5.5 | 9.5% | 15 |
| dft.Calliope 5.6 | 7.0 | 7.9% | 5 |
| step.nanoPri 1.0 | 8.5 | 5.7% | 0 |
| rdm.Dueler 0.4x | 9.2 | 4.8% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 80.0 | 9 / 35 | 3359 |
| 2 | 2 | 63.6 | 79.0 | 12 / 35 | 3209 |
| 3 | 2 | 64.2 | 78.4 | 10 / 35 | 3582 |
| 4 | 2 | 62.7 | 75.6 | 11 / 35 | 3325 |
| 5 | 1 | 64.3 | 78.4 | 13 / 35 | 3710 |
| 6 | 3 | 63.4 | 78.7 | 7 / 35 | 3281 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 48 | 38% |
| kc.micro.Figment 1.0 | 34 | 82% |
| mc2.enemy.Original 0.9 | 12 | 50% |
| pedersen.Grishnakh 1.0 | 11 | 45% |
| dft.Calliope 5.6 | 4 | 50% |
| yagami.Tidus 0.11 | 3 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 57 | 37% | 77 |
| mc2.enemy.Original 0.9 | 25 | 16% | 32 |
| kc.micro.Figment 1.0 | 24 | 16% | 49 |
| yagami.Tidus 0.11 | 17 | 11% | 22 |
| pedersen.Grishnakh 1.0 | 14 | 9% | 17 |
| dft.Calliope 5.6 | 4 | 3% | 6 |
| step.nanoPri 1.0 | 4 | 3% | 4 |
| rdm.Dueler 0.4x | 3 | 2% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 157299 melee ticks, 39775 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 49 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 0.

Targeting waves (209 rounds): 51244 sent, 46824 reached their opponent, 7376 virtual hits (15.8% of those reached).

## Melee bench: F10

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 463 over 6 battles (77.2 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 94.1 | 158 / 210 | 1.53 | 20.0% | 31504 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.0 | 20.0% | 158 |
| DTF.Kludgy 1.2b | 2.2 | 14.2% | 22 |
| ne.Chimera 1.2 | 3.0 | 13.0% | 8 |
| ejb.Polaris 1.0.1 | 3.8 | 12.8% | 16 |
| tvv.micro.Antares 1.1.1 | 5.3 | 10.4% | 2 |
| vStar.RAFzilla 2.15 | 5.7 | 9.9% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.2 | 5.6% | 0 |
| kurios.DOSexe .9b | 8.2 | 5.3% | 1 |
| sam.Samspin 1.0 | 9.0 | 4.8% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 94.0 | 25 / 35 | 4868 |
| 2 | 1 | 70.0 | 92.1 | 23 / 35 | 5256 |
| 3 | 1 | 69.5 | 89.8 | 26 / 35 | 5259 |
| 4 | 1 | 70.3 | 94.3 | 25 / 35 | 5233 |
| 5 | 1 | 71.9 | 98.1 | 30 / 35 | 5631 |
| 6 | 1 | 71.0 | 96.2 | 29 / 35 | 5257 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 58 | 84% |
| ejb.Polaris 1.0.1 | 49 | 86% |
| ne.Chimera 1.2 | 31 | 90% |
| vStar.RAFzilla 2.15 | 20 | 90% |
| tvv.micro.Antares 1.1.1 | 19 | 95% |
| kurios.DOSexe .9b | 2 | 100% |
| donjezza.Muncho 1.0 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 909. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 19 | 35% | 65 |
| ne.Chimera 1.2 | 11 | 20% | 39 |
| ejb.Polaris 1.0.1 | 10 | 18% | 57 |
| tvv.micro.Antares 1.1.1 | 4 | 7% | 18 |
| vStar.RAFzilla 2.15 | 4 | 7% | 17 |
| kurios.DOSexe .9b | 2 | 4% | 5 |
| sam.Samspin 1.0 | 2 | 4% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 4 |
| donjezza.Muncho 1.0 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 149234 melee ticks, 55118 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 586 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 269 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 3.

Targeting waves (205 rounds): 49393 sent, 45001 reached their opponent, 9475 virtual hits (21.1% of those reached).

## Melee bench: F11

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 134 over 6 battles (22.3 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 79.9 | 58 / 210 | 2.80 | 15.5% | 20533 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.2 | 16.9% | 76 |
| hadur2.Hadur 3.17.1g4 | 1.8 | 15.5% | 58 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.5% | 24 |
| djc.DynaBot 0.1.1 | 4.2 | 11.1% | 16 |
| br2.MobyDickBot 1.6 | 5.8 | 9.3% | 16 |
| rdt199.Warlord 0.73 | 6.0 | 8.8% | 12 |
| uji.YellohFellah 1.0 | 6.5 | 8.3% | 9 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.2% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.0 | 5.6% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 77.1 | 8 / 35 | 3272 |
| 2 | 2 | 62.7 | 75.9 | 9 / 35 | 3621 |
| 3 | 1 | 64.6 | 84.1 | 13 / 35 | 3338 |
| 4 | 2 | 63.8 | 79.7 | 9 / 35 | 3689 |
| 5 | 2 | 63.8 | 81.3 | 9 / 35 | 3317 |
| 6 | 2 | 63.7 | 81.6 | 10 / 35 | 3296 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 49 | 45% |
| djc.DynaBot 0.1.1 | 19 | 58% |
| cx.mini.Nimrod 0.55 | 15 | 40% |
| br2.MobyDickBot 1.6 | 12 | 42% |
| rdt199.Warlord 0.73 | 11 | 55% |
| uji.YellohFellah 1.0 | 9 | 78% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 879. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 66 | 43% | 91 |
| cx.mini.Nimrod 0.55 | 35 | 23% | 38 |
| rdt199.Warlord 0.73 | 16 | 11% | 21 |
| djc.DynaBot 0.1.1 | 13 | 9% | 26 |
| br2.MobyDickBot 1.6 | 12 | 8% | 15 |
| uji.YellohFellah 1.0 | 7 | 5% | 14 |
| KiraNL.Chupacabra 0.4 | 2 | 1% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 1 |

Posture (Hadur's M records, 208 rounds): 162050 melee ticks, 33444 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 40 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 53181 sent, 48547 reached their opponent, 7075 virtual hits (14.6% of those reached).

## Melee bench: F12

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 384 over 6 battles (64.0 per battle, most in one battle 146). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 85.0 | 120 / 210 | 2.35 | 17.4% | 21228 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.0 | 17.4% | 120 |
| bts.wiki.RipCurl 0.9b | 2.7 | 13.2% | 23 |
| nat.PallasHawk 1.0 | 2.8 | 13.3% | 35 |
| darkcanuck.Leon 1.01 | 3.5 | 12.8% | 19 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.3% | 10 |
| jrm.Test0 1.0 | 6.0 | 8.8% | 0 |
| cs.sheldor.Talon 1.1 | 8.2 | 6.7% | 2 |
| jp.Perpy 16.0 | 8.2 | 6.1% | 1 |
| jaybot.bots.Oddball 4.0 | 8.8 | 5.5% | 1 |
| stuff.Vlad 0.1 | 8.8 | 6.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 83.5 | 19 / 35 | 3362 |
| 2 | 1 | 67.1 | 87.0 | 23 / 35 | 3544 |
| 3 | 1 | 66.4 | 84.8 | 19 / 35 | 3440 |
| 4 | 1 | 66.0 | 82.9 | 20 / 35 | 3770 |
| 5 | 1 | 67.4 | 87.9 | 20 / 35 | 3679 |
| 6 | 1 | 65.7 | 83.8 | 19 / 35 | 3433 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 45 | 84% |
| nat.PallasHawk 1.0 | 44 | 66% |
| bts.wiki.RipCurl 0.9b | 38 | 84% |
| brainfade.melee.Genghis 0.36 | 11 | 64% |
| jaybot.bots.Oddball 4.0 | 6 | 100% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| jrm.Test0 1.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 701. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 27 | 29% | 62 |
| bts.wiki.RipCurl 0.9b | 18 | 19% | 40 |
| brainfade.melee.Genghis 0.36 | 17 | 18% | 22 |
| darkcanuck.Leon 1.01 | 15 | 16% | 58 |
| jrm.Test0 1.0 | 9 | 10% | 13 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 6 |
| stuff.Vlad 0.1 | 2 | 2% | 3 |
| jp.Perpy 16.0 | 1 | 1% | 1 |
| jaybot.bots.Oddball 4.0 | 0 | 0% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 129101 melee ticks, 42843 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 40 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 44989 sent, 40400 reached their opponent, 7305 virtual hits (18.1% of those reached).

## Melee bench: F13

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 213 over 6 battles (35.5 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 79.6 | 45 / 210 | 2.84 | 14.9% | 21684 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.3 | 16.6% | 54 |
| mn.Combat 3.25.0 | 1.8 | 16.2% | 71 |
| hadur2.Hadur 3.17.1g4 | 2.8 | 14.9% | 45 |
| shinh.Entangled 0.3 | 4.5 | 12.2% | 21 |
| gh.micro.Gruweltje 0.7 | 4.5 | 12.4% | 20 |
| apc.Colossus2 0.17 | 6.0 | 8.6% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.3% | 0 |
| maribo.FollowFire 1 | 8.5 | 4.9% | 0 |
| ayk.WallHugger 1.0 | 8.5 | 4.9% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 81.9 | 9 / 35 | 3609 |
| 2 | 3 | 63.5 | 80.3 | 7 / 35 | 3685 |
| 3 | 3 | 64.2 | 81.9 | 7 / 35 | 3454 |
| 4 | 3 | 63.2 | 80.3 | 7 / 35 | 3632 |
| 5 | 3 | 63.0 | 75.2 | 7 / 35 | 3668 |
| 6 | 3 | 63.5 | 77.8 | 8 / 35 | 3636 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 47 | 51% |
| mn.Combat 3.25.0 | 36 | 25% |
| gh.micro.Gruweltje 0.7 | 17 | 29% |
| shinh.Entangled 0.3 | 12 | 58% |

Hadur died in 167 of 210 rounds, at a mean tick of 865. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 56 | 34% | 77 |
| mn.Combat 3.25.0 | 49 | 29% | 62 |
| shinh.Entangled 0.3 | 26 | 16% | 30 |
| gh.micro.Gruweltje 0.7 | 24 | 14% | 28 |
| stelo.Wang 1.0 | 4 | 2% | 4 |
| apc.Colossus2 0.17 | 3 | 2% | 4 |
| maribo.FollowFire 1 | 2 | 1% | 2 |
| ayk.WallHugger 1.0 | 1 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 145904 melee ticks, 40246 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 82 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 82 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 44597 sent, 39866 reached their opponent, 6987 virtual hits (17.5% of those reached).

## Melee bench: F14

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 163 over 6 battles (27.2 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 94.2 | 158 / 210 | 1.52 | 20.1% | 30782 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.0 | 20.1% | 158 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.4% | 12 |
| catcat20.shape.Theta 0.018 | 3.3 | 11.9% | 26 |
| co.edu.usb.rc.LidisTron 1.0 | 4.5 | 10.2% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.3 | 9.7% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 5.7 | 9.4% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 9.0% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.3 | 8.0% | 1 |
| pa.Improved 1.0 | 9.0 | 5.6% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 92.7 | 26 / 35 | 5155 |
| 2 | 1 | 69.7 | 94.3 | 24 / 35 | 4816 |
| 3 | 1 | 70.7 | 95.2 | 27 / 35 | 5144 |
| 4 | 1 | 70.3 | 93.0 | 25 / 35 | 5308 |
| 5 | 1 | 71.7 | 95.9 | 31 / 35 | 5451 |
| 6 | 1 | 70.0 | 94.3 | 25 / 35 | 4908 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 77 | 95% |
| catcat20.shape.Theta 0.018 | 53 | 66% |
| sheldor.micro.PointInLineRRAL 1.0 | 23 | 78% |
| sanyi.mikrobi.Roberto 1.0 | 15 | 87% |
| Lo_Ian.Gandalf_V4 4.0 | 10 | 90% |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 0% |

Hadur died in 52 of 210 rounds, at a mean tick of 961. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 20 | 38% | 49 |
| simonton.micro.Sprout 1.1.3 | 10 | 19% | 86 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 17% | 28 |
| sanyi.mikrobi.Roberto 1.0 | 6 | 12% | 22 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 4% | 10 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 4% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 3 |
| pa.Improved 1.0 | 1 | 2% | 2 |

Posture (Hadur's M records, 200 rounds): 139913 melee ticks, 57407 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 56 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 45357 sent, 41166 reached their opponent, 10843 virtual hits (26.3% of those reached).

## Melee bench: F15

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 355 over 6 battles (59.2 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 83.5 | 98 / 210 | 2.49 | 17.3% | 25881 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.0 | 17.3% | 98 |
| kawigi.micro.Shiz 1.1 | 2.0 | 14.5% | 28 |
| emp.Yngwie 1.11 | 3.3 | 13.5% | 56 |
| mld.DustBunny 3.8 | 3.7 | 13.0% | 12 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.6% | 8 |
| kawigi.robot.Girl 1.2 | 6.2 | 8.6% | 8 |
| lambdaxy.TBot 0.1 | 7.2 | 7.1% | 0 |
| Grystrion.TrackerWO 1.0 | 7.8 | 6.4% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 4.9% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 78.7 | 16 / 35 | 4341 |
| 2 | 1 | 67.7 | 87.9 | 19 / 35 | 4194 |
| 3 | 1 | 68.0 | 85.7 | 19 / 35 | 4542 |
| 4 | 1 | 64.2 | 76.5 | 11 / 35 | 4128 |
| 5 | 1 | 67.4 | 85.7 | 15 / 35 | 4382 |
| 6 | 1 | 67.1 | 86.3 | 18 / 35 | 4294 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 57 | 53% |
| kawigi.micro.Shiz 1.1 | 27 | 89% |
| mld.DustBunny 3.8 | 21 | 81% |
| kawigi.robot.Girl 1.2 | 17 | 94% |
| cb.nano.Insomnia 1.0 | 10 | 90% |
| divineomega.TrialBot 0.003 | 2 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 921. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 43 | 37% | 85 |
| kawigi.micro.Shiz 1.1 | 19 | 17% | 45 |
| mld.DustBunny 3.8 | 19 | 17% | 37 |
| cb.nano.Insomnia 1.0 | 16 | 14% | 16 |
| divineomega.TrialBot 0.003 | 5 | 4% | 10 |
| lambdaxy.TBot 0.1 | 5 | 4% | 5 |
| kawigi.robot.Girl 1.2 | 3 | 3% | 7 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 4 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 165796 melee ticks, 45742 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 47 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 2.

Targeting waves (209 rounds): 55591 sent, 50832 reached their opponent, 9001 virtual hits (17.7% of those reached).

## Melee bench: F16

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 774 over 6 battles (129.0 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 85.2 | 93 / 210 | 2.33 | 17.9% | 28290 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.0 | 17.9% | 93 |
| gh.Griezel 0.5.2 | 2.2 | 16.1% | 53 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.8 | 14.7% | 9 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.8% | 44 |
| tvv.nano.Polaris 1.2 | 5.3 | 9.4% | 4 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 9.2% | 2 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.5% | 0 |
| divineomega.DivineBot 1.9.4.5 | 8.7 | 4.9% | 4 |
| asd.Cthulhu 1.3 | 9.0 | 4.9% | 0 |
| repositorio.NanoStep 1.0 | 9.3 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 86.7 | 17 / 35 | 4882 |
| 2 | 1 | 66.7 | 81.0 | 16 / 35 | 4754 |
| 3 | 1 | 66.5 | 82.2 | 15 / 35 | 4293 |
| 4 | 1 | 68.6 | 87.6 | 16 / 35 | 4796 |
| 5 | 1 | 68.5 | 88.3 | 16 / 35 | 4760 |
| 6 | 1 | 67.1 | 85.4 | 13 / 35 | 4805 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 76 | 62% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 26 | 88% |
| techdude.forest.FlamingForest 1.1 | 24 | 50% |
| tvv.nano.Polaris 1.2 | 7 | 86% |
| stelo.IntrinsicVolatility 1.4 | 3 | 100% |
| divineomega.DivineBot 1.9.4.5 | 2 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 1174. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 45 | 37% | 90 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 25 | 20% | 46 |
| techdude.forest.FlamingForest 1.1 | 25 | 20% | 37 |
| bvh.fnr.Fenrir 0.36l | 8 | 7% | 8 |
| stelo.IntrinsicVolatility 1.4 | 5 | 4% | 14 |
| tvv.nano.Polaris 1.2 | 4 | 3% | 5 |
| asd.Cthulhu 1.3 | 3 | 2% | 3 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 6 |
| repositorio.NanoStep 1.0 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 192237 melee ticks, 53220 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 41 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 61263 sent, 56794 reached their opponent, 10743 virtual hits (18.9% of those reached).

## Melee bench: F17

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 608 over 6 battles (101.3 per battle, most in one battle 144). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 84.6 | 98 / 210 | 2.39 | 18.0% | 29934 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.0 | 18.0% | 98 |
| et.Predator 1.8 | 2.3 | 14.3% | 31 |
| oog.melee.Mercutio 1.0 | 3.0 | 13.1% | 34 |
| cx.BlestPain 1.41 | 3.7 | 12.3% | 40 |
| ahf.NanoAndrew .4 | 5.2 | 10.4% | 7 |
| nic.Nicator 2.4 | 6.2 | 9.2% | 2 |
| maribo.melee.BMV 0.1 | 6.7 | 8.7% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.9% | 0 |
| tex.Longbot 0.4 | 8.7 | 5.5% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 81.9 | 15 / 35 | 4959 |
| 2 | 1 | 67.9 | 84.4 | 18 / 35 | 5017 |
| 3 | 1 | 67.7 | 85.1 | 18 / 35 | 4617 |
| 4 | 1 | 68.2 | 85.1 | 15 / 35 | 5286 |
| 5 | 1 | 68.4 | 87.6 | 16 / 35 | 5013 |
| 6 | 1 | 67.5 | 83.5 | 16 / 35 | 5042 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 48 | 67% |
| oog.melee.Mercutio 1.0 | 41 | 76% |
| cx.BlestPain 1.41 | 26 | 38% |
| ahf.NanoAndrew .4 | 11 | 100% |
| nic.Nicator 2.4 | 8 | 100% |
| maribo.melee.BMV 0.1 | 4 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 988. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 37 | 32% | 52 |
| et.Predator 1.8 | 33 | 28% | 60 |
| oog.melee.Mercutio 1.0 | 20 | 17% | 51 |
| ahf.NanoAndrew .4 | 11 | 9% | 21 |
| maribo.melee.BMV 0.1 | 5 | 4% | 9 |
| tex.Longbot 0.4 | 3 | 3% | 4 |
| nic.Nicator 2.4 | 2 | 2% | 10 |
| goblin.Bender 2.4 | 1 | 1% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 164917 melee ticks, 51340 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 47 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 55990 sent, 51508 reached their opponent, 11889 virtual hits (23.1% of those reached).

## Melee bench: F18

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 401 over 6 battles (66.8 per battle, most in one battle 161). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 90.2 | 123 / 210 | 1.88 | 18.9% | 26758 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.0 | 18.9% | 123 |
| morbid.MorbidPriest 1.0 | 2.0 | 14.1% | 41 |
| agd.Mooserwirt2 2.7 | 3.2 | 12.3% | 22 |
| uji.DBH 1.1 | 3.8 | 11.1% | 11 |
| spinnercat.Robovirus 2.718 | 5.3 | 9.5% | 8 |
| ratosh.Nobo 0.21 | 6.3 | 8.5% | 0 |
| sigterm.Sigterm 1.0 | 6.8 | 7.8% | 1 |
| kawigi.mini.Fhqwhgads 1.1 | 7.7 | 6.9% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.3 | 5.4% | 1 |
| stelo.WangRobot 1.0 | 9.5 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 94.0 | 24 / 35 | 4789 |
| 2 | 1 | 66.2 | 85.4 | 16 / 35 | 4045 |
| 3 | 1 | 68.6 | 90.8 | 20 / 35 | 4446 |
| 4 | 1 | 69.0 | 92.4 | 22 / 35 | 4593 |
| 5 | 1 | 67.9 | 89.5 | 19 / 35 | 4174 |
| 6 | 1 | 68.6 | 89.2 | 22 / 35 | 4711 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 61 | 66% |
| agd.Mooserwirt2 2.7 | 30 | 67% |
| uji.DBH 1.1 | 27 | 81% |
| sigterm.Sigterm 1.0 | 18 | 94% |
| stelo.WangRobot 1.0 | 9 | 89% |
| spinnercat.Robovirus 2.718 | 8 | 63% |
| ratosh.Nobo 0.21 | 6 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 80% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 50% |

Hadur died in 88 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 37 | 42% | 78 |
| agd.Mooserwirt2 2.7 | 17 | 19% | 38 |
| uji.DBH 1.1 | 14 | 16% | 36 |
| spinnercat.Robovirus 2.718 | 5 | 6% | 11 |
| ratosh.Nobo 0.21 | 4 | 5% | 11 |
| sigterm.Sigterm 1.0 | 3 | 3% | 16 |
| stelo.WangRobot 1.0 | 3 | 3% | 8 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 3% | 6 |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 1% | 6 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 141248 melee ticks, 50691 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 65 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 7.

Targeting waves (202 rounds): 47864 sent, 43431 reached their opponent, 10270 virtual hits (23.6% of those reached).

## Melee bench: F19

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 332 over 6 battles (55.3 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 97.7 | 191 / 210 | 1.21 | 21.8% | 34027 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.0 | 21.8% | 191 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 15.0% | 9 |
| mld.Infinity 2.2 | 3.2 | 12.1% | 4 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.5% | 3 |
| erdnis.Rover 0.3 | 4.7 | 10.3% | 2 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.1% | 0 |
| mbh.Mbh 0.1 | 7.0 | 7.4% | 0 |
| pac.ABC 2.1 | 7.8 | 6.8% | 2 |
| pbg.R2D2 1.0 | 9.0 | 5.7% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 98.7 | 33 / 35 | 5739 |
| 2 | 1 | 72.9 | 98.7 | 34 / 35 | 5664 |
| 3 | 1 | 71.7 | 94.3 | 27 / 35 | 5466 |
| 4 | 1 | 72.0 | 96.5 | 31 / 35 | 5323 |
| 5 | 1 | 73.6 | 99.0 | 32 / 35 | 6165 |
| 6 | 1 | 72.9 | 98.7 | 34 / 35 | 5670 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 107 | 95% |
| mld.Infinity 2.2 | 38 | 100% |
| krillr.mini.JointStrike 2.0.0 | 25 | 92% |
| erdnis.Rover 0.3 | 11 | 100% |
| pac.ABC 2.1 | 8 | 88% |
| patson.PatsonTestBot 1.0 | 7 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 21 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 8 | 38% | 78 |
| krillr.mini.JointStrike 2.0.0 | 4 | 19% | 28 |
| erdnis.Rover 0.3 | 3 | 14% | 19 |
| mbh.Mbh 0.1 | 2 | 10% | 12 |
| pac.ABC 2.1 | 2 | 10% | 10 |
| mld.Infinity 2.2 | 0 | 0% | 30 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 21 |
| pbg.R2D2 1.0 | 0 | 0% | 9 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 133177 melee ticks, 43077 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 80 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 44734 sent, 40551 reached their opponent, 10449 virtual hits (25.8% of those reached).

## Melee bench: F20

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 576 over 6 battles (96.0 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 92.1 | 144 / 210 | 1.71 | 20.2% | 32147 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.0 | 20.2% | 144 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.6% | 31 |
| fwb.Nine 1.0.1 | 3.8 | 10.9% | 9 |
| catcat20.Rabbit 0.001 | 4.2 | 10.8% | 18 |
| nz.jdc.nano.GridFu 1.0 | 4.2 | 10.9% | 3 |
| m3thos.mini.Eva01 0.5.5 | 5.8 | 8.3% | 0 |
| bayen.nut.Squirrel 1.615 | 7.3 | 7.0% | 5 |
| djdjdj.NanoSkunk10 1.0 | 7.8 | 6.2% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 5.7% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 90.5 | 25 / 35 | 5123 |
| 2 | 1 | 69.3 | 89.2 | 18 / 35 | 5323 |
| 3 | 1 | 71.9 | 95.2 | 26 / 35 | 5895 |
| 4 | 1 | 71.1 | 94.0 | 28 / 35 | 5328 |
| 5 | 1 | 71.2 | 95.6 | 28 / 35 | 5326 |
| 6 | 1 | 69.0 | 87.9 | 19 / 35 | 5152 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 86 | 80% |
| fwb.Nine 1.0.1 | 31 | 100% |
| catcat20.Rabbit 0.001 | 23 | 78% |
| nz.jdc.nano.GridFu 1.0 | 12 | 92% |
| m3thos.mini.Eva01 0.5.5 | 7 | 100% |
| bayen.nut.Squirrel 1.615 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 67% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 1008. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 33 | 46% | 88 |
| catcat20.Rabbit 0.001 | 16 | 23% | 43 |
| fwb.Nine 1.0.1 | 9 | 13% | 24 |
| nz.jdc.nano.GridFu 1.0 | 4 | 6% | 22 |
| bayen.nut.Squirrel 1.615 | 2 | 3% | 10 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 4 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 1 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 14 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 4 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 210 rounds): 172194 melee ticks, 51978 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 77 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (210 rounds): longest scan gap while four or more were alive 77 ticks (210 rounds over 8); rounds whose longest gap at any count was over 8: 210; robots dropped as dead without a death event: 0.

Targeting waves (210 rounds): 56214 sent, 51590 reached their opponent, 12794 virtual hits (24.8% of those reached).

## Melee bench: F21

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 312 over 6 battles (52.0 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 89.3 | 105 / 210 | 1.97 | 18.8% | 30125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.2 | 18.8% | 105 |
| eem.EvBot v4.6.16 | 1.8 | 16.9% | 75 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.6% | 12 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 7 |
| eld.Hmm 1.0 | 5.0 | 8.8% | 12 |
| oa.weak.BotherBot 0.1 | 6.0 | 7.5% | 0 |
| fire219.CatBot 1.0 | 8.0 | 5.8% | 0 |
| PSW.Relentless 0.1 | 8.0 | 5.7% | 0 |
| el.JumpShoot 0.2 | 8.2 | 5.8% | 1 |
| arthord.MannyPacquiao Beta | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 94.0 | 20 / 35 | 4912 |
| 2 | 1 | 69.2 | 90.2 | 14 / 35 | 5086 |
| 3 | 2 | 65.8 | 78.7 | 14 / 35 | 4405 |
| 4 | 1 | 70.3 | 93.3 | 20 / 35 | 5387 |
| 5 | 1 | 69.9 | 90.8 | 21 / 35 | 5418 |
| 6 | 1 | 68.6 | 88.6 | 16 / 35 | 4917 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 115 | 61% |
| dummy.mini.Scimitar 1.01 | 20 | 80% |
| eld.Hmm 1.0 | 15 | 40% |
| cf.RiO.RiOx 4.2.1 | 15 | 73% |
| oa.weak.BotherBot 0.1 | 2 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 1285. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 56 | 51% | 107 |
| dummy.mini.Scimitar 1.01 | 20 | 18% | 42 |
| cf.RiO.RiOx 4.2.1 | 13 | 12% | 26 |
| eld.Hmm 1.0 | 9 | 8% | 24 |
| PSW.Relentless 0.1 | 4 | 4% | 4 |
| el.JumpShoot 0.2 | 2 | 2% | 2 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 3 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 183893 melee ticks, 87682 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 62 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 1.

Targeting waves (209 rounds): 55229 sent, 50754 reached their opponent, 9520 virtual hits (18.8% of those reached).

## Melee bench: F22

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 676 over 6 battles (112.7 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 86.3 | 78 / 210 | 2.23 | 17.4% | 26455 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.3 | 17.4% | 78 |
| pe.SandboxDT 2.71m | 1.7 | 16.8% | 79 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.6% | 24 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.3% | 20 |
| bigpete.Stewie 1.0 | 5.0 | 10.8% | 7 |
| yk.JahRoslav 1.1 | 6.3 | 7.3% | 1 |
| tad.Dalek98 0.98 | 7.2 | 6.6% | 0 |
| gg.Squaraus 0.6 | 7.8 | 5.9% | 1 |
| pbg.NinjaX 1.2 | 8.7 | 4.6% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.0 | 86.0 | 11 / 35 | 4240 |
| 2 | 2 | 66.3 | 82.5 | 14 / 35 | 4094 |
| 3 | 1 | 67.4 | 86.7 | 14 / 35 | 4570 |
| 4 | 1 | 68.7 | 88.9 | 16 / 35 | 4542 |
| 5 | 1 | 67.2 | 87.0 | 11 / 35 | 4327 |
| 6 | 1 | 67.8 | 86.7 | 12 / 35 | 4682 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 50 | 30% |
| kvk.HebusLeTroll 0.35 | 39 | 74% |
| jlm.javaDisturbance 0.59 | 32 | 72% |
| bigpete.Stewie 1.0 | 13 | 69% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 2 | 50% |
| yk.JahRoslav 1.1 | 2 | 50% |

Hadur died in 138 of 210 rounds, at a mean tick of 1022. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 65 | 47% | 83 |
| kvk.HebusLeTroll 0.35 | 28 | 20% | 49 |
| jlm.javaDisturbance 0.59 | 26 | 19% | 48 |
| bigpete.Stewie 1.0 | 8 | 6% | 21 |
| yk.JahRoslav 1.1 | 2 | 1% | 4 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 2 | 1% | 2 |
| gg.Squaraus 0.6 | 1 | 1% | 2 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 170166 melee ticks, 46086 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 39 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 54668 sent, 50178 reached their opponent, 8780 virtual hits (17.5% of those reached).

## Melee bench: F23

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 720 over 6 battles (120.0 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 94.6 | 163 / 210 | 1.49 | 20.7% | 32330 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.0 | 20.7% | 163 |
| pe.SandboxLump 1.52 | 2.0 | 16.9% | 28 |
| cre.Karolos 0.32 | 3.0 | 14.2% | 14 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.1% | 1 |
| stelo.RamTrackSurfer 1.2 | 4.8 | 9.4% | 3 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.5 | 8.6% | 0 |
| cw.megas.Blade 0.8 | 6.8 | 8.0% | 1 |
| sample.Walls 1.0 | 7.5 | 7.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.2 | 2.7% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 95.2 | 27 / 35 | 5284 |
| 2 | 1 | 72.0 | 94.6 | 26 / 35 | 5385 |
| 3 | 1 | 70.5 | 90.8 | 25 / 35 | 4802 |
| 4 | 1 | 71.0 | 92.7 | 26 / 35 | 4830 |
| 5 | 1 | 72.6 | 97.1 | 29 / 35 | 6009 |
| 6 | 1 | 73.1 | 96.8 | 30 / 35 | 6020 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 98 | 88% |
| cre.Karolos 0.32 | 52 | 92% |
| stelo.RamTrackSurfer 1.2 | 11 | 82% |
| stelo.AreaTargetingBot 1.1 | 9 | 89% |
| sample.Walls 1.0 | 7 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 28 | 53% | 105 |
| cre.Karolos 0.32 | 10 | 19% | 55 |
| stelo.RamTrackSurfer 1.2 | 4 | 8% | 21 |
| stelo.AreaTargetingBot 1.1 | 2 | 4% | 13 |
| sample.Walls 1.0 | 1 | 2% | 5 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 2% | 5 |
| cw.megas.Blade 0.8 | 1 | 2% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 130738 melee ticks, 48844 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 42 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 41731 sent, 37358 reached their opponent, 12258 virtual hits (32.8% of those reached).

## Melee bench: F24

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 738 over 6 battles (123.0 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 77.6 | 57 / 210 | 3.01 | 14.9% | 19502 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.8 | 14.5% | 44 |
| hadur2.Hadur 3.17.1g4 | 2.0 | 14.9% | 57 |
| florent.XSeries.X2 0.12 | 2.8 | 13.5% | 40 |
| davidalves.Phoenix 0.54 | 3.5 | 13.2% | 39 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.4% | 20 |
| oog.melee.Corsair 1.0 | 6.0 | 9.6% | 9 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 7.5% | 1 |
| lunchie.Lunchbox 0.93 | 8.3 | 6.1% | 0 |
| as.FrankTheTank 1.3 | 8.7 | 5.1% | 1 |
| evd.X1 0.01 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 80.6 | 9 / 35 | 3141 |
| 2 | 1 | 65.2 | 84.1 | 13 / 35 | 3612 |
| 3 | 2 | 63.4 | 80.6 | 9 / 35 | 3256 |
| 4 | 3 | 60.0 | 70.8 | 7 / 35 | 3024 |
| 5 | 1 | 63.6 | 79.7 | 10 / 35 | 3474 |
| 6 | 4 | 60.3 | 69.8 | 9 / 35 | 2995 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 33 | 48% |
| florent.XSeries.X2 0.12 | 29 | 38% |
| davidalves.Phoenix 0.54 | 20 | 50% |
| oog.melee.Corsair 1.0 | 11 | 73% |
| pedersen.Ugluk 1.1.1 | 10 | 60% |
| stelo.SoJNanoMelee 1.1 | 5 | 80% |
| lunchie.Lunchbox 0.93 | 2 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 40 | 25% | 51 |
| rz.GlowBlowMelee 1.4 | 39 | 24% | 54 |
| davidalves.Phoenix 0.54 | 30 | 19% | 43 |
| pedersen.Ugluk 1.1.1 | 18 | 11% | 21 |
| oog.melee.Corsair 1.0 | 12 | 8% | 19 |
| stelo.SoJNanoMelee 1.1 | 7 | 4% | 12 |
| evd.X1 0.01 | 3 | 2% | 3 |
| lunchie.Lunchbox 0.93 | 2 | 1% | 5 |
| as.FrankTheTank 1.3 | 2 | 1% | 2 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 138358 melee ticks, 33737 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 37 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 37 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 47251 sent, 42489 reached their opponent, 8422 virtual hits (19.8% of those reached).

## Melee bench: F25

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 560 over 6 battles (93.3 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 87.5 | 126 / 210 | 2.12 | 18.0% | 21875 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.0 | 18.0% | 126 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 13.7% | 20 |
| voidious.micro.BlitzBat 1.05 | 3.2 | 12.9% | 13 |
| jdw.Hurricane 1.4 | 3.8 | 11.9% | 25 |
| gre.svman4.Morfeas 1.4.1 | 5.5 | 9.7% | 10 |
| ds.Oo 2.2 | 5.8 | 9.0% | 7 |
| awesomeness.Elite 1.0 | 7.3 | 7.2% | 4 |
| adt.Ar2 1.1 | 7.5 | 6.7% | 5 |
| gjr.Cephalosporin 0.1 | 8.8 | 6.2% | 2 |
| amk.ChumbaMini 0.2 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 82.5 | 17 / 35 | 3372 |
| 2 | 1 | 67.4 | 89.2 | 23 / 35 | 3507 |
| 3 | 1 | 67.4 | 87.0 | 21 / 35 | 3875 |
| 4 | 1 | 67.6 | 86.7 | 21 / 35 | 3980 |
| 5 | 1 | 67.9 | 89.2 | 20 / 35 | 3628 |
| 6 | 1 | 68.1 | 90.5 | 24 / 35 | 3513 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 44 | 84% |
| voidious.micro.BlitzBat 1.05 | 34 | 88% |
| jdw.Hurricane 1.4 | 30 | 77% |
| gre.svman4.Morfeas 1.4.1 | 14 | 79% |
| ds.Oo 2.2 | 13 | 85% |
| awesomeness.Elite 1.0 | 9 | 78% |
| adt.Ar2 1.1 | 4 | 50% |
| gjr.Cephalosporin 0.1 | 3 | 100% |
| amk.ChumbaMini 0.2 | 2 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 675. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 17 | 19% | 40 |
| voidious.mini.BrokenSword 2.0.3 | 15 | 17% | 47 |
| jdw.Hurricane 1.4 | 14 | 16% | 39 |
| gre.svman4.Morfeas 1.4.1 | 13 | 15% | 27 |
| ds.Oo 2.2 | 11 | 12% | 28 |
| awesomeness.Elite 1.0 | 6 | 7% | 13 |
| adt.Ar2 1.1 | 5 | 6% | 6 |
| amk.ChumbaMini 0.2 | 2 | 2% | 3 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 6 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 129826 melee ticks, 28593 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 64 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 46404 sent, 41996 reached their opponent, 7756 virtual hits (18.5% of those reached).

## Melee bench: F26

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 335 over 6 battles (55.8 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 92.1 | 141 / 210 | 1.71 | 20.0% | 33714 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.0 | 20.0% | 141 |
| ak.Fermat 2.0 | 2.0 | 15.2% | 39 |
| lrem.Spectre 0.4.4 | 3.2 | 12.3% | 11 |
| shu.nitro.LENIN .T34 | 4.0 | 11.5% | 12 |
| js.PinBall 1.6 | 5.0 | 10.8% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 5.8 | 9.9% | 2 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 8.1% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.5% | 2 |
| sample.SpinBot 1.0 | 9.0 | 3.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 94.6 | 25 / 35 | 5607 |
| 2 | 1 | 71.1 | 93.0 | 23 / 35 | 5947 |
| 3 | 1 | 70.2 | 88.9 | 22 / 35 | 5671 |
| 4 | 1 | 69.6 | 88.3 | 21 / 35 | 5196 |
| 5 | 1 | 70.7 | 93.3 | 24 / 35 | 5604 |
| 6 | 1 | 71.2 | 94.3 | 26 / 35 | 5689 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 65 | 77% |
| lrem.Spectre 0.4.4 | 45 | 89% |
| shu.nitro.LENIN .T34 | 37 | 89% |
| js.PinBall 1.6 | 8 | 88% |
| jaybot.adv.bots.JayBot 2.0 | 7 | 86% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |
| gh.mini.GrubbmOne 1.0 | 1 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 948. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 33 | 46% | 72 |
| shu.nitro.LENIN .T34 | 10 | 14% | 44 |
| js.PinBall 1.6 | 10 | 14% | 24 |
| lrem.Spectre 0.4.4 | 9 | 13% | 48 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 7% | 13 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 1% | 6 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 166414 melee ticks, 46310 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 40 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 4.

Targeting waves (207 rounds): 55185 sent, 50719 reached their opponent, 13561 virtual hits (26.7% of those reached).

## Melee bench: F27

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 520 over 6 battles (86.7 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 94.0 | 168 / 210 | 1.54 | 20.4% | 29627 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.0 | 20.4% | 168 |
| mk.Alpha 0.2.1 | 2.0 | 13.8% | 25 |
| EH.Eagle 1.0.6 | 3.0 | 11.5% | 3 |
| sheldor.melee.nano.TestMelee 0.1 | 5.5 | 9.1% | 2 |
| techdude.kombat.FlamingKombat 1.5 | 5.5 | 9.0% | 3 |
| wee.Gem 1.8.4 | 6.2 | 8.8% | 8 |
| throxbot.ThroxBot 0.1 | 7.3 | 7.4% | 1 |
| joe.ADinosaur 1.0 | 7.3 | 7.6% | 0 |
| caimano.Furia_Ceca 0.22 | 7.7 | 7.4% | 0 |
| cs.Grudge 1.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 94.9 | 29 / 35 | 5004 |
| 2 | 1 | 69.3 | 91.7 | 23 / 35 | 4747 |
| 3 | 1 | 69.2 | 90.2 | 25 / 35 | 4731 |
| 4 | 1 | 70.9 | 95.9 | 30 / 35 | 5120 |
| 5 | 1 | 71.5 | 96.5 | 31 / 35 | 5257 |
| 6 | 1 | 70.4 | 94.6 | 30 / 35 | 4768 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 102 | 91% |
| EH.Eagle 1.0.6 | 37 | 97% |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 92% |
| wee.Gem 1.8.4 | 13 | 77% |
| techdude.kombat.FlamingKombat 1.5 | 11 | 100% |
| throxbot.ThroxBot 0.1 | 5 | 80% |
| joe.ADinosaur 1.0 | 1 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 46 of 210 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 17 | 37% | 92 |
| EH.Eagle 1.0.6 | 9 | 20% | 46 |
| wee.Gem 1.8.4 | 4 | 9% | 14 |
| joe.ADinosaur 1.0 | 3 | 7% | 9 |
| sheldor.melee.nano.TestMelee 0.1 | 2 | 4% | 16 |
| throxbot.ThroxBot 0.1 | 2 | 4% | 9 |
| caimano.Furia_Ceca 0.22 | 2 | 4% | 4 |
| cs.Grudge 1.0 | 2 | 4% | 2 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 2% | 17 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 140649 melee ticks, 42956 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 33 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 45355 sent, 40922 reached their opponent, 10910 virtual hits (26.7% of those reached).

## Melee bench: F28

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 529 over 6 battles (88.2 per battle, most in one battle 159). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 89.8 | 136 / 210 | 1.91 | 18.3% | 22264 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.0 | 18.3% | 136 |
| kid.test.NightFox .2 | 2.0 | 14.4% | 25 |
| uji.Antique 1.0 | 3.0 | 13.0% | 22 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.5% | 3 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.7% | 15 |
| ahr.ice.Ice 1.0.2 | 6.3 | 8.2% | 4 |
| amk.ChumbaWumba 0.3 | 6.7 | 8.0% | 2 |
| matt.advanced.Katana 1.0 | 8.2 | 6.2% | 2 |
| stelo.PianistNano 1.2 | 9.2 | 5.4% | 1 |
| stelo.Lifestealer 1.0 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 88.9 | 25 / 35 | 3640 |
| 2 | 1 | 67.4 | 89.8 | 20 / 35 | 3596 |
| 3 | 1 | 67.6 | 88.6 | 23 / 35 | 3918 |
| 4 | 1 | 66.8 | 87.9 | 21 / 35 | 3698 |
| 5 | 1 | 67.9 | 90.5 | 23 / 35 | 3600 |
| 6 | 1 | 68.9 | 93.3 | 24 / 35 | 3812 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 63 | 87% |
| uji.Antique 1.0 | 55 | 84% |
| qohnil.blot.BlotBot 3.61 | 18 | 67% |
| pfvicm.Sobieski 7.2.3b | 9 | 100% |
| amk.ChumbaWumba 0.3 | 7 | 86% |
| ahr.ice.Ice 1.0.2 | 5 | 100% |
| matt.advanced.Katana 1.0 | 3 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 26 | 33% | 63 |
| kid.test.NightFox .2 | 20 | 25% | 64 |
| qohnil.blot.BlotBot 3.61 | 12 | 15% | 30 |
| pfvicm.Sobieski 7.2.3b | 6 | 8% | 16 |
| amk.ChumbaWumba 0.3 | 6 | 8% | 13 |
| ahr.ice.Ice 1.0.2 | 3 | 4% | 11 |
| stelo.Lifestealer 1.0 | 2 | 3% | 4 |
| matt.advanced.Katana 1.0 | 1 | 1% | 6 |
| stelo.PianistNano 1.2 | 1 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 133520 melee ticks, 30597 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 48 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 45360 sent, 40849 reached their opponent, 6526 virtual hits (16.0% of those reached).

## Melee bench: F29

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 659 over 6 battles (109.8 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.1 | 102 / 210 | 2.07 | 18.5% | 25719 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.0 | 18.5% | 102 |
| deewiant.Anomaly 0.2 | 2.2 | 15.3% | 49 |
| zyx.mega.YersiniaPestis 3.1 | 2.8 | 14.5% | 40 |
| myl.micro.Troodon 1.10 | 4.3 | 12.0% | 10 |
| jok.PheonixM 0.1.2 | 4.7 | 11.3% | 7 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.1% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.3 | 6.0% | 0 |
| DBall.Anarchy 0.1 | 8.0 | 5.6% | 1 |
| ap.Frederick 1.1 | 8.7 | 5.1% | 1 |
| jangs.ns51 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 87.6 | 18 / 35 | 4182 |
| 2 | 1 | 69.0 | 87.3 | 20 / 35 | 4462 |
| 3 | 1 | 69.6 | 90.5 | 19 / 35 | 4412 |
| 4 | 1 | 68.7 | 87.0 | 16 / 35 | 4411 |
| 5 | 1 | 67.8 | 87.3 | 13 / 35 | 4213 |
| 6 | 1 | 68.2 | 88.9 | 16 / 35 | 4039 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 75 | 60% |
| zyx.mega.YersiniaPestis 3.1 | 39 | 59% |
| myl.micro.Troodon 1.10 | 18 | 83% |
| jok.PheonixM 0.1.2 | 15 | 80% |
| ap.Frederick 1.1 | 4 | 100% |
| jangs.ns51 1.0 | 1 | 100% |
| DBall.Anarchy 0.1 | 1 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 1024. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 57 | 50% | 98 |
| zyx.mega.YersiniaPestis 3.1 | 28 | 25% | 58 |
| myl.micro.Troodon 1.10 | 14 | 12% | 26 |
| jok.PheonixM 0.1.2 | 7 | 6% | 20 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 4 |
| DBall.Anarchy 0.1 | 0 | 0% | 2 |
| fullsail.TimbotNoPrediction 1.0 | 0 | 0% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 169178 melee ticks, 53514 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 31 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 56083 sent, 51598 reached their opponent, 8840 virtual hits (17.1% of those reached).

## Melee bench: F30

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 664 over 6 battles (110.7 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 73.0 | 37 / 210 | 3.43 | 14.1% | 20577 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.8 | 14.1% | 37 |
| catcat20.Matcha 0.006 | 1.8 | 14.4% | 55 |
| darkcanuck.B26354 1.06 | 3.3 | 13.5% | 43 |
| stelo.PastFuture 2.3.2 | 3.8 | 13.0% | 26 |
| oog.melee.Capulet 1.2 | 4.2 | 12.8% | 32 |
| intruder.PrairieWolf 2.61 | 6.2 | 9.0% | 7 |
| ntc.Opposite 1.5 | 7.7 | 6.8% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 7.7% | 10 |
| tripphippy.Alice 1.1 | 8.3 | 6.5% | 1 |
| GarmBox.Anger 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 76.2 | 7 / 35 | 3705 |
| 2 | 2 | 61.6 | 72.1 | 6 / 35 | 3519 |
| 3 | 3 | 61.3 | 73.3 | 5 / 35 | 3209 |
| 4 | 2 | 60.5 | 71.4 | 8 / 35 | 3126 |
| 5 | 2 | 61.0 | 72.1 | 4 / 35 | 3551 |
| 6 | 1 | 61.5 | 72.7 | 7 / 35 | 3467 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 24 | 33% |
| catcat20.Matcha 0.006 | 19 | 26% |
| oog.melee.Capulet 1.2 | 15 | 47% |
| stelo.PastFuture 2.3.2 | 14 | 50% |
| intruder.PrairieWolf 2.61 | 7 | 86% |
| fowl3628800.LightningBolt 2.6.0 | 5 | 40% |
| tripphippy.Alice 1.1 | 2 | 100% |

Hadur died in 178 of 210 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 41 | 23% | 46 |
| stelo.PastFuture 2.3.2 | 40 | 22% | 51 |
| catcat20.Matcha 0.006 | 37 | 21% | 45 |
| oog.melee.Capulet 1.2 | 19 | 11% | 25 |
| fowl3628800.LightningBolt 2.6.0 | 12 | 7% | 11 |
| intruder.PrairieWolf 2.61 | 10 | 6% | 17 |
| tripphippy.Alice 1.1 | 8 | 4% | 9 |
| ntc.Opposite 1.5 | 6 | 3% | 6 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 155297 melee ticks, 26652 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 56 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 51641 sent, 47093 reached their opponent, 8401 virtual hits (17.8% of those reached).

## Melee bench: F31

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 720 over 6 battles (120.0 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 77.8 | 53 / 210 | 3.00 | 15.0% | 19260 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.4% | 90 |
| hadur2.Hadur 3.17.1g4 | 2.2 | 15.0% | 53 |
| gh.mini.Griezel 0.2 | 2.8 | 13.7% | 44 |
| d414.nano.Quantum 1.0.0 | 4.5 | 11.1% | 4 |
| spinnercat.micro.Tyger 0.1 | 4.8 | 11.4% | 14 |
| gh.nano.Grofvuil 0.2 | 5.7 | 9.1% | 2 |
| timmit.nano.TimDog 0.33 | 7.0 | 7.1% | 2 |
| fm.mammillarias 1.3 | 8.0 | 6.1% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 4.8% | 1 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 75.6 | 7 / 35 | 3105 |
| 2 | 2 | 64.2 | 79.0 | 12 / 35 | 3248 |
| 3 | 2 | 63.3 | 79.0 | 9 / 35 | 3124 |
| 4 | 2 | 63.6 | 79.7 | 5 / 35 | 3401 |
| 5 | 2 | 65.3 | 82.5 | 13 / 35 | 3522 |
| 6 | 3 | 60.0 | 71.1 | 7 / 35 | 2860 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 44 | 48% |
| gh.mini.Griezel 0.2 | 35 | 43% |
| d414.nano.Quantum 1.0.0 | 9 | 100% |
| spinnercat.micro.Tyger 0.1 | 5 | 80% |
| timmit.nano.TimDog 0.33 | 3 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 0% |
| gh.nano.Grofvuil 0.2 | 1 | 100% |

Hadur died in 163 of 210 rounds, at a mean tick of 831. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 58 | 36% | 76 |
| gh.mini.Griezel 0.2 | 47 | 29% | 66 |
| spinnercat.micro.Tyger 0.1 | 26 | 16% | 28 |
| d414.nano.Quantum 1.0.0 | 7 | 4% | 14 |
| timmit.nano.TimDog 0.33 | 6 | 4% | 8 |
| gh.nano.Grofvuil 0.2 | 5 | 3% | 10 |
| fm.mammillarias 1.3 | 3 | 2% | 3 |
| Gecko.ultimateGeckoBot 1.0 | 3 | 2% | 3 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 156137 melee ticks, 28026 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 42 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 2.

Targeting waves (207 rounds): 51402 sent, 46710 reached their opponent, 8094 virtual hits (17.3% of those reached).

## Melee bench: F32

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 428 over 6 battles (71.3 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 88.0 | 115 / 210 | 2.08 | 17.8% | 24761 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.0 | 17.8% | 115 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.0% | 50 |
| apc.botM 3.0 | 3.5 | 11.4% | 14 |
| lxx.ConceptA 0.8 | 4.2 | 10.5% | 6 |
| vjik.UnViolation 1.1 | 4.7 | 10.3% | 14 |
| bayen.UbaMicro 1.4 | 6.2 | 8.6% | 2 |
| yk.JahMicro 1.0 | 7.5 | 7.3% | 7 |
| panzer.Panzer 0.2 | 7.5 | 7.1% | 0 |
| conscience.Electron 1.3g | 8.7 | 6.4% | 0 |
| donjezza.Jezza 1.0 | 9.8 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 90.5 | 18 / 35 | 4032 |
| 2 | 1 | 65.2 | 83.2 | 17 / 35 | 4033 |
| 3 | 1 | 67.9 | 89.5 | 22 / 35 | 4430 |
| 4 | 1 | 68.6 | 90.8 | 23 / 35 | 4421 |
| 5 | 1 | 66.1 | 85.4 | 20 / 35 | 3848 |
| 6 | 1 | 66.4 | 88.9 | 15 / 35 | 3997 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 78 | 60% |
| apc.botM 3.0 | 25 | 68% |
| lxx.ConceptA 0.8 | 21 | 95% |
| vjik.UnViolation 1.1 | 14 | 79% |
| yk.JahMicro 1.0 | 10 | 60% |
| bayen.UbaMicro 1.4 | 6 | 100% |
| donjezza.Jezza 1.0 | 5 | 80% |
| conscience.Electron 1.3g | 2 | 100% |
| panzer.Panzer 0.2 | 2 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 818. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 43 | 43% | 84 |
| apc.botM 3.0 | 12 | 12% | 36 |
| lxx.ConceptA 0.8 | 12 | 12% | 26 |
| bayen.UbaMicro 1.4 | 9 | 9% | 14 |
| vjik.UnViolation 1.1 | 7 | 7% | 23 |
| yk.JahMicro 1.0 | 7 | 7% | 15 |
| conscience.Electron 1.3g | 3 | 3% | 3 |
| donjezza.Jezza 1.0 | 2 | 2% | 7 |
| panzer.Panzer 0.2 | 1 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 128243 melee ticks, 50431 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 53 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 53 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 44298 sent, 39662 reached their opponent, 7945 virtual hits (20.0% of those reached).

## Melee bench: F33

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 250 over 6 battles (41.7 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 85.8 | 104 / 210 | 2.28 | 17.9% | 25381 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.0 | 17.9% | 104 |
| maribo.Quester 0.3 | 2.0 | 16.2% | 40 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.7% | 21 |
| labg.Cataclysm 2.05 | 4.0 | 11.5% | 26 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 11.2% | 14 |
| baal.nano.N 1.42 | 6.2 | 8.9% | 3 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 7.9% | 3 |
| sanja.First 0.1 | 8.5 | 5.0% | 0 |
| zyx.micro.Ant 1.1 | 8.5 | 5.2% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 88.3 | 18 / 35 | 4399 |
| 2 | 1 | 67.3 | 85.4 | 14 / 35 | 4337 |
| 3 | 1 | 67.1 | 82.9 | 17 / 35 | 4322 |
| 4 | 1 | 66.6 | 83.2 | 18 / 35 | 3834 |
| 5 | 1 | 69.8 | 91.4 | 21 / 35 | 4521 |
| 6 | 1 | 67.1 | 83.8 | 16 / 35 | 3968 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 55 | 84% |
| gre.svman4.Leonidas 1.3.2 | 25 | 80% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 74% |
| labg.Cataclysm 2.05 | 11 | 73% |
| baal.nano.N 1.42 | 7 | 86% |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 100% |
| zyx.micro.Ant 1.1 | 3 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 45 | 42% | 91 |
| gre.svman4.Leonidas 1.3.2 | 22 | 20% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 16% | 32 |
| labg.Cataclysm 2.05 | 15 | 14% | 25 |
| baal.nano.N 1.42 | 3 | 3% | 10 |
| zyx.micro.Ant 1.1 | 2 | 2% | 6 |
| kinsen.melee.Angsaichmophobia 1.8c | 2 | 2% | 5 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |
| sanja.First 0.1 | 0 | 0% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 177044 melee ticks, 40714 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 54 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 2.

Targeting waves (205 rounds): 56962 sent, 52403 reached their opponent, 8641 virtual hits (16.5% of those reached).

## Melee bench: F34

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 540 over 6 battles (90.0 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 86.8 | 81 / 210 | 2.19 | 17.6% | 27881 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.3 | 17.6% | 81 |
| kid.Gladiator .7.2 | 2.0 | 16.7% | 45 |
| stelo.Spread 0.9 | 2.7 | 15.8% | 55 |
| jcs.Seth 1.8 | 4.2 | 11.5% | 22 |
| cli.Dancer 1.1 | 5.3 | 9.8% | 2 |
| tcf.Reach 3 | 5.5 | 9.8% | 4 |
| ratosh.Wesco 1.4 | 7.0 | 7.6% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.1% | 1 |
| sample.VelociRobot 1.0 | 9.3 | 3.3% | 0 |
| sample.RamFire 1.0 | 9.7 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 87.3 | 13 / 35 | 4421 |
| 2 | 1 | 68.2 | 86.0 | 16 / 35 | 4815 |
| 3 | 1 | 68.0 | 88.9 | 13 / 35 | 4444 |
| 4 | 1 | 67.6 | 85.7 | 13 / 35 | 4639 |
| 5 | 3 | 66.3 | 81.3 | 9 / 35 | 4264 |
| 6 | 1 | 69.8 | 91.7 | 17 / 35 | 5298 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 66 | 52% |
| kid.Gladiator .7.2 | 61 | 56% |
| jcs.Seth 1.8 | 17 | 29% |
| tcf.Reach 3 | 5 | 80% |
| cli.Dancer 1.1 | 4 | 75% |

Hadur died in 133 of 210 rounds, at a mean tick of 1107. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 55 | 41% | 81 |
| stelo.Spread 0.9 | 48 | 36% | 84 |
| jcs.Seth 1.8 | 18 | 14% | 23 |
| tcf.Reach 3 | 4 | 3% | 10 |
| ratosh.Wesco 1.4 | 3 | 2% | 3 |
| cli.Dancer 1.1 | 1 | 1% | 9 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 173081 melee ticks, 62183 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 49 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 55080 sent, 50561 reached their opponent, 9364 virtual hits (18.5% of those reached).

## Melee bench: F35

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 495 over 6 battles (82.5 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 78.3 | 31 / 210 | 2.95 | 14.7% | 19692 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.2% | 155 |
| hadur2.Hadur 3.17.1g4 | 2.0 | 14.7% | 31 |
| gh.mini.Gruwel 0.9 | 3.7 | 12.2% | 15 |
| rz.HawkOnFire 0.1 | 3.8 | 12.1% | 3 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.5 | 11.6% | 4 |
| wit.Chuliath 1.0 | 6.0 | 7.2% | 1 |
| myl.nano.KomoriNinja 1.1 | 7.5 | 6.4% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 5.9% | 1 |
| dans.Cinnamon 1.2 | 9.2 | 4.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 79.0 | 4 / 35 | 3402 |
| 2 | 2 | 62.8 | 77.1 | 5 / 35 | 3235 |
| 3 | 2 | 63.4 | 79.7 | 6 / 35 | 3485 |
| 4 | 2 | 63.1 | 78.1 | 6 / 35 | 3198 |
| 5 | 2 | 62.5 | 76.5 | 5 / 35 | 3204 |
| 6 | 2 | 63.0 | 79.4 | 5 / 35 | 3168 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 76 | 21% |
| gh.mini.Gruwel 0.9 | 13 | 38% |
| rz.HawkOnFire 0.1 | 6 | 67% |
| dmh.robocode.robot.BlackDeath 9.2 | 5 | 100% |
| wit.Chuliath 1.0 | 2 | 50% |

Hadur died in 184 of 210 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 99 | 54% | 113 |
| dmh.robocode.robot.BlackDeath 9.2 | 25 | 14% | 28 |
| gh.mini.Gruwel 0.9 | 22 | 12% | 28 |
| rz.HawkOnFire 0.1 | 18 | 10% | 22 |
| wit.Chuliath 1.0 | 8 | 4% | 10 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6 | 3% | 7 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 1 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 147990 melee ticks, 37666 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 41 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 46882 sent, 42263 reached their opponent, 7337 virtual hits (17.4% of those reached).

## Melee bench: F36

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 390 over 6 battles (65.0 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 90.4 | 139 / 210 | 1.86 | 19.5% | 28657 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.0 | 19.5% | 139 |
| alpha.RainingFire 1.0 | 2.3 | 12.7% | 25 |
| bzdp.Pansy 2.1 | 3.0 | 12.0% | 11 |
| mz.Cork 0.1 | 4.5 | 11.0% | 15 |
| bvh.micro.Freya 0.3 | 4.8 | 10.7% | 7 |
| bvh.mini.Fenrir 0.39 | 5.8 | 9.5% | 3 |
| m3thos.Eva02 0.7.1 | 6.5 | 9.7% | 6 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 5.7% | 1 |
| dl.BetterWalls 1.0 | 8.8 | 4.9% | 0 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.1% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 92.1 | 24 / 35 | 4364 |
| 2 | 1 | 68.7 | 89.2 | 22 / 35 | 4677 |
| 3 | 1 | 68.2 | 86.3 | 22 / 35 | 4729 |
| 4 | 1 | 68.6 | 88.3 | 21 / 35 | 4631 |
| 5 | 1 | 70.8 | 92.4 | 27 / 35 | 5298 |
| 6 | 1 | 70.5 | 94.3 | 23 / 35 | 4958 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 40 | 93% |
| alpha.RainingFire 1.0 | 35 | 60% |
| bvh.micro.Freya 0.3 | 33 | 91% |
| mz.Cork 0.1 | 31 | 81% |
| bvh.mini.Fenrir 0.39 | 16 | 81% |
| m3thos.Eva02 0.7.1 | 7 | 100% |
| sample.MyFirstRobot 1.0 | 4 | 75% |
| squidM.TentalceMeleeNano 1.1 | 2 | 50% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 23 | 31% | 45 |
| mz.Cork 0.1 | 13 | 18% | 42 |
| bvh.mini.Fenrir 0.39 | 11 | 15% | 17 |
| m3thos.Eva02 0.7.1 | 8 | 11% | 21 |
| bvh.micro.Freya 0.3 | 7 | 9% | 32 |
| bzdp.Pansy 2.1 | 5 | 7% | 42 |
| squidM.TentalceMeleeNano 1.1 | 3 | 4% | 4 |
| dl.BetterWalls 1.0 | 1 | 1% | 4 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 148884 melee ticks, 44982 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 41 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 51682 sent, 47342 reached their opponent, 10969 virtual hits (23.2% of those reached).

## Melee bench: F37

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 294 over 6 battles (49.0 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 85.7 | 152 / 210 | 2.29 | 18.2% | 29689 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.0 | 18.2% | 152 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.5 | 11.0% | 12 |
| germ.TheMind .2 | 3.7 | 10.2% | 9 |
| EBBU.Sim2 1.02 | 4.5 | 9.5% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 5.3 | 9.5% | 3 |
| lmk.ACPFinal 0.1 | 6.5 | 8.8% | 5 |
| agrach.Dalek 1.0 | 6.7 | 9.0% | 12 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.5% | 2 |
| mb.Beast 0.1 | 8.8 | 7.8% | 4 |
| skm.Ryubot 1.0 | 9.2 | 7.5% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 87.9 | 27 / 35 | 5101 |
| 2 | 1 | 65.3 | 82.2 | 21 / 35 | 4871 |
| 3 | 1 | 64.7 | 79.7 | 22 / 35 | 4626 |
| 4 | 1 | 66.8 | 83.8 | 27 / 35 | 5050 |
| 5 | 1 | 67.8 | 90.5 | 27 / 35 | 4937 |
| 6 | 1 | 68.5 | 89.8 | 28 / 35 | 5104 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 27 | 96% |
| com.syncleus.robocode.Dreadnaught 0.1 | 26 | 88% |
| agrach.Dalek 1.0 | 24 | 88% |
| stelo.UntouchableNano 1.3 | 21 | 95% |
| mb.Beast 0.1 | 20 | 100% |
| skm.Ryubot 1.0 | 16 | 94% |
| EBBU.Sim2 1.02 | 12 | 100% |
| lmk.ACPFinal 0.1 | 11 | 91% |
| mn.nano.perceptual.Impact 1.3.0 | 5 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 392. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 20 | 34% | 27 |
| com.syncleus.robocode.Dreadnaught 0.1 | 10 | 17% | 37 |
| agrach.Dalek 1.0 | 6 | 10% | 31 |
| EBBU.Sim2 1.02 | 6 | 10% | 26 |
| mb.Beast 0.1 | 4 | 7% | 23 |
| stelo.UntouchableNano 1.3 | 4 | 7% | 18 |
| lmk.ACPFinal 0.1 | 3 | 5% | 22 |
| germ.TheMind .2 | 3 | 5% | 16 |
| skm.Ryubot 1.0 | 2 | 3% | 9 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 93936 melee ticks, 22708 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 61 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 61 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 32197 sent, 28151 reached their opponent, 9151 virtual hits (32.5% of those reached).

## Melee bench: F38

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 446 over 6 battles (74.3 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 84.1 | 88 / 210 | 2.43 | 16.9% | 23901 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.5 | 16.9% | 88 |
| justin.Mallais 14.0 | 1.5 | 16.6% | 72 |
| bvh.mini.Freya 0.55 | 3.2 | 12.7% | 16 |
| bts.mega.Gnarly 1.4 | 3.8 | 11.5% | 16 |
| cs.Wren 1.0 | 5.5 | 10.4% | 6 |
| kdf.KoulDestroyer 1.0 | 6.0 | 9.7% | 8 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.5 | 8.3% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.2% | 1 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.1% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 84.8 | 15 / 35 | 4022 |
| 2 | 1 | 67.0 | 85.4 | 15 / 35 | 4304 |
| 3 | 1 | 67.7 | 88.3 | 18 / 35 | 4079 |
| 4 | 2 | 66.0 | 83.2 | 15 / 35 | 3978 |
| 5 | 2 | 66.1 | 83.8 | 15 / 35 | 3810 |
| 6 | 2 | 64.0 | 79.0 | 10 / 35 | 3708 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 64 | 58% |
| bts.mega.Gnarly 1.4 | 28 | 57% |
| bvh.mini.Freya 0.55 | 15 | 80% |
| kdf.KoulDestroyer 1.0 | 11 | 73% |
| cs.Wren 1.0 | 9 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 75% |
| davidalves.net.DuelistNanoMelee 1.01 | 2 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 53 | 42% | 91 |
| bvh.mini.Freya 0.55 | 20 | 16% | 28 |
| bts.mega.Gnarly 1.4 | 18 | 14% | 38 |
| kdf.KoulDestroyer 1.0 | 13 | 10% | 18 |
| davidalves.net.DuelistNanoMelee 1.01 | 8 | 6% | 12 |
| cs.Wren 1.0 | 6 | 5% | 17 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 2% | 5 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 138463 melee ticks, 34721 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 32 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 46395 sent, 41751 reached their opponent, 9520 virtual hits (22.8% of those reached).

## Melee bench: F39

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 794 over 6 battles (132.3 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 86.1 | 101 / 210 | 2.25 | 17.7% | 27128 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.0 | 17.7% | 101 |
| bvh.fry.Freya 0.82 | 2.0 | 14.7% | 13 |
| az.Ololobot 0.2.4 | 3.2 | 13.3% | 59 |
| catcat20.Lambda 0.024 | 3.8 | 12.0% | 30 |
| stelo.SoRobotNanoMelee 1.2 | 6.3 | 7.8% | 3 |
| gimp.GimpBot 0.1 | 6.3 | 8.0% | 0 |
| winamp32.micro.MicroMacro 1.0 | 6.7 | 8.2% | 3 |
| apollokidd.ApolloKidd 0.9 | 6.7 | 7.8% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.9% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 82.2 | 13 / 35 | 4789 |
| 2 | 1 | 66.7 | 84.1 | 16 / 35 | 4569 |
| 3 | 1 | 67.1 | 87.0 | 20 / 35 | 4320 |
| 4 | 1 | 66.3 | 84.8 | 18 / 35 | 4396 |
| 5 | 1 | 67.9 | 88.3 | 17 / 35 | 4931 |
| 6 | 1 | 67.2 | 90.5 | 17 / 35 | 4123 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 45 | 47% |
| bvh.fry.Freya 0.82 | 45 | 89% |
| catcat20.Lambda 0.024 | 39 | 59% |
| stelo.SoRobotNanoMelee 1.2 | 6 | 100% |
| gimp.GimpBot 0.1 | 5 | 100% |
| winamp32.micro.MicroMacro 1.0 | 5 | 80% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 1060. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 35 | 30% | 54 |
| bvh.fry.Freya 0.82 | 30 | 26% | 66 |
| catcat20.Lambda 0.024 | 24 | 21% | 39 |
| apollokidd.ApolloKidd 0.9 | 10 | 9% | 12 |
| winamp32.micro.MicroMacro 1.0 | 3 | 3% | 13 |
| gimp.GimpBot 0.1 | 3 | 3% | 12 |
| stelo.SoRobotNanoMelee 1.2 | 3 | 3% | 11 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 168850 melee ticks, 49740 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 65 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 54080 sent, 49581 reached their opponent, 9838 virtual hits (19.8% of those reached).

## Melee bench: F40

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 487 over 6 battles (81.2 per battle, most in one battle 142). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.4 | 121 / 210 | 2.14 | 18.4% | 26038 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.0 | 18.4% | 121 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.2% | 39 |
| kano.gamma.KanoGamma 1.8 | 3.5 | 12.6% | 20 |
| mz.AntiGrav 1.0 | 3.7 | 12.0% | 11 |
| Polkwane.SmashMelee 1.0 | 5.3 | 10.0% | 8 |
| stelo.Randomness 1.0 | 6.2 | 9.4% | 8 |
| alpha.BlackIce 1.0 | 6.3 | 8.7% | 3 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.3% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 4.1% | 0 |
| sample.Corners 1.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 91.4 | 24 / 35 | 4181 |
| 2 | 1 | 69.5 | 91.1 | 22 / 35 | 4570 |
| 3 | 1 | 68.8 | 87.9 | 21 / 35 | 4429 |
| 4 | 1 | 66.2 | 81.6 | 14 / 35 | 4181 |
| 5 | 1 | 67.9 | 84.4 | 21 / 35 | 4459 |
| 6 | 1 | 68.1 | 87.6 | 19 / 35 | 4218 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 59 | 78% |
| kano.gamma.KanoGamma 1.8 | 37 | 81% |
| mz.AntiGrav 1.0 | 27 | 85% |
| stelo.Randomness 1.0 | 13 | 85% |
| Polkwane.SmashMelee 1.0 | 7 | 71% |
| alpha.BlackIce 1.0 | 6 | 67% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 831. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 34 | 37% | 69 |
| kano.gamma.KanoGamma 1.8 | 16 | 17% | 46 |
| mz.AntiGrav 1.0 | 13 | 14% | 28 |
| stelo.Randomness 1.0 | 9 | 10% | 26 |
| Polkwane.SmashMelee 1.0 | 7 | 8% | 19 |
| alpha.BlackIce 1.0 | 7 | 8% | 11 |
| amk.superstrike.SuperStrike 0.3 | 2 | 2% | 7 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 3 |
| sample.Corners 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 155759 melee ticks, 38279 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 82 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 82 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 52305 sent, 47624 reached their opponent, 10642 virtual hits (22.3% of those reached).

## Melee bench: F41

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 419 over 6 battles (69.8 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 87.5 | 98 / 210 | 2.12 | 17.5% | 22924 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.2 | 17.5% | 98 |
| eem.EvBotNG v12.8 | 1.8 | 16.5% | 70 |
| ary.Swarm 1.1 | 3.7 | 12.4% | 12 |
| lessonz.robocode.Oz 0.5.0 | 4.0 | 12.3% | 12 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 11.4% | 12 |
| shrub.Silver v048 | 6.0 | 9.0% | 5 |
| zyx.nano.Ant 1.1 | 7.0 | 7.4% | 0 |
| jsal.Jsalbot 1.0 | 8.2 | 5.8% | 1 |
| stelo.Mirror 1.1 | 8.8 | 5.3% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 89.5 | 21 / 35 | 4037 |
| 2 | 1 | 67.3 | 87.3 | 17 / 35 | 3669 |
| 3 | 1 | 66.4 | 85.7 | 15 / 35 | 3713 |
| 4 | 2 | 66.5 | 86.0 | 9 / 35 | 4015 |
| 5 | 1 | 67.8 | 90.5 | 17 / 35 | 3799 |
| 6 | 1 | 66.9 | 86.0 | 19 / 35 | 3691 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 83 | 48% |
| lessonz.robocode.Oz 0.5.0 | 27 | 78% |
| ary.Swarm 1.1 | 18 | 83% |
| simonton.nano.MeleeSeed 1.8 | 17 | 88% |
| shrub.Silver v048 | 8 | 75% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 980. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 54 | 47% | 98 |
| ary.Swarm 1.1 | 19 | 17% | 30 |
| lessonz.robocode.Oz 0.5.0 | 18 | 16% | 34 |
| simonton.nano.MeleeSeed 1.8 | 13 | 11% | 26 |
| shrub.Silver v048 | 4 | 3% | 13 |
| zyx.nano.Ant 1.1 | 2 | 2% | 2 |
| jsal.Jsalbot 1.0 | 1 | 1% | 4 |
| stelo.Mirror 1.1 | 1 | 1% | 1 |
| acogdev.alpha 0.2 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 161136 melee ticks, 51571 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 55 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 53724 sent, 49117 reached their opponent, 8392 virtual hits (17.1% of those reached).

## Melee bench: F42

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 681 over 6 battles (113.5 per battle, most in one battle 146). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 90.1 | 127 / 210 | 1.89 | 19.1% | 29952 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.0 | 19.1% | 127 |
| wompi.Wallaby 5.1 | 2.0 | 15.6% | 40 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.3% | 16 |
| ara.Shera 0.88 | 3.7 | 12.7% | 23 |
| amz.NanoClone 1.41 | 5.0 | 9.1% | 2 |
| maribo.IotaCT 1.1 | 6.7 | 7.2% | 0 |
| dsw.StaticD 1.0 | 6.8 | 6.8% | 2 |
| stelo.MirrorMicro 1.0 | 8.0 | 5.8% | 0 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 93.3 | 25 / 35 | 4890 |
| 2 | 1 | 70.2 | 91.7 | 24 / 35 | 5297 |
| 3 | 1 | 67.6 | 85.7 | 18 / 35 | 4834 |
| 4 | 1 | 68.5 | 89.5 | 19 / 35 | 4721 |
| 5 | 1 | 68.5 | 87.6 | 19 / 35 | 4879 |
| 6 | 1 | 70.0 | 92.7 | 22 / 35 | 5331 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 85 | 84% |
| maribo.mini.MiniQuester 0.1 | 39 | 82% |
| ara.Shera 0.88 | 29 | 62% |
| dsw.StaticD 1.0 | 3 | 67% |
| amz.NanoClone 1.41 | 2 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 969. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 30 | 33% | 94 |
| ara.Shera 0.88 | 28 | 31% | 50 |
| maribo.mini.MiniQuester 0.1 | 21 | 23% | 52 |
| dsw.StaticD 1.0 | 3 | 3% | 5 |
| maribo.IotaCT 1.1 | 2 | 2% | 3 |
| amz.NanoClone 1.41 | 1 | 1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 1 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 162780 melee ticks, 50296 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 40 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 53101 sent, 48702 reached their opponent, 10677 virtual hits (21.9% of those reached).

## Melee bench: F43

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 404 over 6 battles (67.3 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 79.3 | 28 / 210 | 2.87 | 14.8% | 19407 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.3% | 149 |
| hadur2.Hadur 3.17.1g4 | 2.0 | 14.8% | 28 |
| dummy.micro.Sparrow 2.5 | 3.7 | 12.0% | 10 |
| brainfade.melee.Dusk 0.44 | 3.7 | 12.0% | 16 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.8% | 4 |
| Krabb.akim2.Akim2 1.1b | 5.7 | 9.8% | 3 |
| jab.DiamondStealer 5 | 7.3 | 7.5% | 0 |
| mz.NanoGod 2.02 | 7.7 | 7.6% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.8% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.8 | 80.6 | 4 / 35 | 3453 |
| 2 | 2 | 63.4 | 77.5 | 4 / 35 | 3200 |
| 3 | 2 | 63.5 | 78.1 | 4 / 35 | 2923 |
| 4 | 2 | 63.8 | 78.7 | 5 / 35 | 3078 |
| 5 | 2 | 64.2 | 78.4 | 5 / 35 | 3142 |
| 6 | 2 | 65.9 | 82.2 | 6 / 35 | 3611 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 82 | 12% |
| brainfade.melee.Dusk 0.44 | 11 | 45% |
| dummy.micro.Sparrow 2.5 | 9 | 78% |
| wcsv.melee.EngineerMelee 0.1 | 6 | 67% |
| Krabb.akim2.Akim2 1.1b | 2 | 100% |

Hadur died in 186 of 210 rounds, at a mean tick of 973. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 116 | 62% | 126 |
| dummy.micro.Sparrow 2.5 | 21 | 11% | 29 |
| brainfade.melee.Dusk 0.44 | 20 | 11% | 25 |
| wcsv.melee.EngineerMelee 0.1 | 13 | 7% | 16 |
| Krabb.akim2.Akim2 1.1b | 6 | 3% | 6 |
| mz.NanoGod 2.02 | 4 | 2% | 4 |
| jab.DiamondStealer 5 | 3 | 2% | 4 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 157414 melee ticks, 49856 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 33 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 52076 sent, 47251 reached their opponent, 8470 virtual hits (17.9% of those reached).

## Melee bench: F44

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 677 over 6 battles (112.8 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 91.5 | 129 / 210 | 1.76 | 19.7% | 30776 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.0 | 19.7% | 129 |
| stelo.Liblix 0.3.1 | 2.0 | 15.9% | 58 |
| tzu.TheArtOfWar 1.2 | 3.0 | 14.4% | 17 |
| jwirde.Gort 2.0 | 4.3 | 9.7% | 5 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.7 | 9.4% | 0 |
| wompi.Quokka 1.6 | 6.5 | 7.7% | 0 |
| disan.Chair 2.2.0 | 6.7 | 7.4% | 0 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.8% | 1 |
| sample.Crazy 1.0 | 9.3 | 4.7% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.9 | 18 / 35 | 5042 |
| 2 | 1 | 70.6 | 92.7 | 21 / 35 | 5261 |
| 3 | 1 | 69.0 | 90.8 | 20 / 35 | 4781 |
| 4 | 1 | 71.8 | 96.8 | 27 / 35 | 5400 |
| 5 | 1 | 69.5 | 90.2 | 21 / 35 | 4999 |
| 6 | 1 | 69.8 | 90.8 | 22 / 35 | 5293 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 78 | 60% |
| tzu.TheArtOfWar 1.2 | 63 | 87% |
| jwirde.Gort 2.0 | 9 | 89% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 9 | 100% |
| disan.Chair 2.2.0 | 3 | 100% |
| stf.PanzerGeneral 0.1 | 3 | 100% |
| wompi.Quokka 1.6 | 3 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 968. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 46 | 53% | 99 |
| tzu.TheArtOfWar 1.2 | 15 | 17% | 60 |
| jwirde.Gort 2.0 | 9 | 10% | 19 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 7% | 13 |
| amk.jointstrike.JointStrike 0.2 | 3 | 3% | 4 |
| wompi.Quokka 1.6 | 2 | 2% | 4 |
| disan.Chair 2.2.0 | 1 | 1% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 4 |
| stf.PanzerGeneral 0.1 | 0 | 0% | 3 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 157213 melee ticks, 51031 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 48 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 2.

Targeting waves (205 rounds): 55521 sent, 51012 reached their opponent, 11692 virtual hits (22.9% of those reached).

## Melee bench: F45

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 751 over 6 battles (125.2 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 88.1 | 103 / 210 | 2.07 | 19.4% | 31613 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4 | 1.0 | 19.4% | 103 |
| eem.IWillFireNoBullet v2.8 | 2.5 | 12.3% | 78 |
| jje.BagPuss 1.2 | 3.2 | 11.9% | 7 |
| sul.Lunar 1.1 | 3.8 | 10.9% | 15 |
| myl.nano.Graviton 1.10 | 4.5 | 10.7% | 4 |
| hvilela.HVilela 0.9 | 6.7 | 8.6% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 6.8 | 8.2% | 1 |
| fm.claire 1.7 | 7.5 | 7.7% | 0 |
| wit.Deep7 2.0 | 9.0 | 5.8% | 1 |
| abud.ThirdRobo 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 90.8 | 19 / 35 | 5630 |
| 2 | 1 | 67.8 | 85.1 | 16 / 35 | 4878 |
| 3 | 1 | 69.9 | 92.4 | 21 / 35 | 5177 |
| 4 | 1 | 70.4 | 92.7 | 20 / 35 | 5424 |
| 5 | 1 | 68.5 | 86.0 | 14 / 35 | 5250 |
| 6 | 1 | 67.3 | 81.9 | 13 / 35 | 5254 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 87 | 52% |
| sul.Lunar 1.1 | 25 | 92% |
| jje.BagPuss 1.2 | 14 | 79% |
| myl.nano.Graviton 1.10 | 10 | 80% |
| pez.mini.ChironexFleckeri 0.5 | 8 | 100% |
| wit.Deep7 2.0 | 5 | 100% |
| hvilela.HVilela 0.9 | 3 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 1668. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 47 | 42% | 0 |
| jje.BagPuss 1.2 | 20 | 18% | 63 |
| sul.Lunar 1.1 | 16 | 14% | 55 |
| myl.nano.Graviton 1.10 | 13 | 12% | 32 |
| hvilela.HVilela 0.9 | 5 | 4% | 11 |
| fm.claire 1.7 | 3 | 3% | 15 |
| pez.mini.ChironexFleckeri 0.5 | 2 | 2% | 20 |
| wit.Deep7 2.0 | 1 | 1% | 10 |
| abud.ThirdRobo 1.0 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 220561 melee ticks, 99626 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 57 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 66472 sent, 62011 reached their opponent, 10294 virtual hits (16.6% of those reached).

## Melee bench: F46

hadur2.Hadur 3.17.1g4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 411 over 6 battles (68.5 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 83.0 | 60 / 210 | 2.53 | 16.1% | 22892 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.5 | 17.0% | 57 |
| rsalesc.melee.Medina 0.4.5 | 2.2 | 16.2% | 70 |
| hadur2.Hadur 3.17.1g4 | 2.3 | 16.1% | 60 |
| cx.Princess 1.0 | 4.3 | 10.9% | 17 |
| mz.MicroSheep 1.0 | 4.7 | 10.7% | 4 |
| sadoner.killer 0.2 | 6.2 | 9.4% | 1 |
| arthord.NanoSatanMelee Beta | 7.0 | 6.8% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.7% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.5% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.8 | 82.2 | 8 / 35 | 3805 |
| 2 | 3 | 65.2 | 83.5 | 8 / 35 | 3717 |
| 3 | 3 | 65.4 | 83.8 | 9 / 35 | 3650 |
| 4 | 2 | 65.2 | 81.6 | 13 / 35 | 3608 |
| 5 | 1 | 67.0 | 84.8 | 15 / 35 | 4180 |
| 6 | 3 | 64.9 | 82.2 | 7 / 35 | 3932 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 65 | 60% |
| rsalesc.melee.Medina 0.4.5 | 38 | 29% |
| cx.Princess 1.0 | 13 | 15% |
| mz.MicroSheep 1.0 | 3 | 100% |
| sadoner.killer 0.2 | 3 | 100% |
| arthord.NanoSatanMelee Beta | 3 | 67% |

Hadur died in 153 of 210 rounds, at a mean tick of 968. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 65 | 42% | 104 |
| rsalesc.melee.Medina 0.4.5 | 55 | 36% | 69 |
| cx.Princess 1.0 | 13 | 8% | 14 |
| sadoner.killer 0.2 | 7 | 5% | 8 |
| mz.MicroSheep 1.0 | 4 | 3% | 7 |
| jeremyreeder.collective.Prophet 5 | 2 | 1% | 3 |
| arthord.NanoSatanMelee Beta | 2 | 1% | 3 |
| kurios.DOSexe .9a | 2 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 160219 melee ticks, 47917 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 32 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 1.

Targeting waves (209 rounds): 47530 sent, 42870 reached their opponent, 7249 virtual hits (16.9% of those reached).

