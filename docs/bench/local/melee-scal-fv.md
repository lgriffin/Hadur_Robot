# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 423 over 6 battles (70.5 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 85.9 | 47 / 210 | 2.27 | 17.5% | 32339 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.7% | 139 |
| hadur117.Hadur 3.20fv | 2.0 | 17.5% | 47 |
| sgp.JollyNinja 3.53 | 3.0 | 11.7% | 15 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.2 | 10.9% | 0 |
| lorneswork.Predator 1.0 | 5.2 | 9.8% | 1 |
| mz.MicroGodMelee 1 | 5.8 | 9.6% | 7 |
| adt.Ar2 1.0 | 7.0 | 7.8% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.5% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.3% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.5 | 86.3 | 8 / 35 | 5209 |
| 2 | 2 | 68.1 | 87.9 | 9 / 35 | 5475 |
| 3 | 2 | 67.0 | 85.7 | 7 / 35 | 4947 |
| 4 | 2 | 67.6 | 84.1 | 8 / 35 | 5676 |
| 5 | 2 | 68.0 | 84.8 | 7 / 35 | 5745 |
| 6 | 2 | 67.5 | 86.7 | 8 / 35 | 5287 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 133 | 10% |
| sgp.JollyNinja 3.53 | 21 | 81% |
| mz.MicroGodMelee 1 | 10 | 70% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 100% |
| lorneswork.Predator 1.0 | 3 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 166 of 210 rounds, at a mean tick of 1207. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 124 | 75% | 137 |
| sgp.JollyNinja 3.53 | 13 | 8% | 30 |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 5% | 15 |
| lorneswork.Predator 1.0 | 8 | 5% | 11 |
| mz.MicroGodMelee 1 | 4 | 2% | 10 |
| adt.Ar2 1.0 | 3 | 2% | 4 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 2 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 137845 melee ticks, 101753 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 80 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 44542 sent, 39507 reached their opponent, 7778 virtual hits (19.7% of those reached).

## Melee bench: F02

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 337 over 6 battles (56.2 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 81.9 | 93 / 210 | 2.63 | 17.8% | 30150 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 17.8% | 93 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 14.0% | 59 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.2 | 12.2% | 11 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 11.5% | 4 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.5% | 19 |
| fnc.bandit.Bandit 5.2.0 | 6.3 | 8.6% | 3 |
| Noran.BitchingElk 0.054 | 6.8 | 8.3% | 14 |
| sch.Simone 0.3d | 7.7 | 7.3% | 6 |
| stelo.PatternRobot 1.0 | 9.0 | 5.7% | 0 |
| fullsail.SweetTea 1.1 | 9.8 | 4.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 79.0 | 14 / 35 | 4999 |
| 2 | 1 | 68.6 | 87.3 | 16 / 35 | 5246 |
| 3 | 1 | 68.3 | 85.7 | 19 / 35 | 5047 |
| 4 | 1 | 66.7 | 79.4 | 17 / 35 | 4848 |
| 5 | 1 | 66.9 | 80.3 | 15 / 35 | 5203 |
| 6 | 1 | 65.5 | 79.4 | 12 / 35 | 4807 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 51 | 47% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 28 | 93% |
| com.cohesiva.robocode.ManOwaR 1.0 | 14 | 64% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 86% |
| sch.Simone 0.3d | 12 | 92% |
| Noran.BitchingElk 0.054 | 12 | 50% |
| stelo.PatternRobot 1.0 | 4 | 100% |
| fullsail.SweetTea 1.1 | 1 | 0% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 907. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 50 | 41% | 72 |
| lrem.micro.SpikeSoldier 0.4 | 17 | 14% | 28 |
| com.cohesiva.robocode.ManOwaR 1.0 | 14 | 12% | 22 |
| Noran.BitchingElk 0.054 | 11 | 9% | 16 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 10 | 8% | 36 |
| fnc.bandit.Bandit 5.2.0 | 9 | 7% | 13 |
| fullsail.SweetTea 1.1 | 3 | 2% | 5 |
| sch.Simone 0.3d | 2 | 2% | 14 |
| stelo.PatternRobot 1.0 | 2 | 2% | 4 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 159695 melee ticks, 40307 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 161 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 145 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 57684 sent, 52706 reached their opponent, 9161 virtual hits (17.4% of those reached).

## Melee bench: F03

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 317 over 6 battles (52.8 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 92.5 | 174 / 210 | 1.68 | 20.9% | 37966 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 20.9% | 174 |
| radnor.DoctorBob 1.42 | 2.3 | 13.7% | 13 |
| kawigi.nano.Lib 1.0 | 3.2 | 12.8% | 9 |
| vuen.Cake 2.51 | 3.5 | 12.7% | 13 |
| urdos.URDOS 1.3 | 5.0 | 8.9% | 1 |
| adt.Ar1 2.1 | 6.3 | 7.8% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.2 | 6.6% | 0 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.4% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.5 | 4.9% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 91.1 | 29 / 35 | 6186 |
| 2 | 1 | 72.0 | 94.9 | 31 / 35 | 6283 |
| 3 | 1 | 70.8 | 92.1 | 29 / 35 | 6085 |
| 4 | 1 | 72.1 | 95.2 | 30 / 35 | 6570 |
| 5 | 1 | 71.1 | 91.1 | 27 / 35 | 6570 |
| 6 | 1 | 70.8 | 90.5 | 28 / 35 | 6272 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 65 | 91% |
| radnor.DoctorBob 1.42 | 62 | 100% |
| kawigi.nano.Lib 1.0 | 38 | 92% |
| urdos.URDOS 1.3 | 6 | 100% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| adt.Ar1 2.1 | 4 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 627. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 8 | 21% | 68 |
| kawigi.nano.Lib 1.0 | 8 | 21% | 43 |
| radnor.DoctorBob 1.42 | 7 | 18% | 61 |
| bwbaugh.nano.Tirunculus 0.0.0a | 7 | 18% | 8 |
| urdos.URDOS 1.3 | 3 | 8% | 10 |
| oa.weak.FlyMk1 0.1 | 2 | 5% | 9 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 3% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 4 |
| adt.Ar1 2.1 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 123833 melee ticks, 43959 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 88 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 88 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 38121 sent, 33276 reached their opponent, 8562 virtual hits (25.7% of those reached).

## Melee bench: F04

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 148 over 6 battles (24.7 per battle, most in one battle 100). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 85.8 | 38 / 210 | 2.28 | 17.9% | 34326 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.0% | 156 |
| hadur117.Hadur 3.20fv | 2.0 | 17.9% | 38 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.8% | 7 |
| TNT.TNT 0.99.1 | 4.0 | 11.0% | 7 |
| josago.Jorgito 0.16 | 5.0 | 9.0% | 0 |
| css.Delitioner 0.11 | 6.2 | 7.0% | 2 |
| tj.zombie1n 1.0.1 | 7.0 | 6.6% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.3% | 0 |
| spin.Bugstard 0.012b | 9.2 | 3.9% | 0 |
| sp.Nanos.Ember 1.1 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.4 | 83.5 | 5 / 35 | 5199 |
| 2 | 2 | 68.8 | 87.6 | 6 / 35 | 5551 |
| 3 | 2 | 68.6 | 85.7 | 7 / 35 | 5734 |
| 4 | 2 | 68.3 | 84.1 | 8 / 35 | 5707 |
| 5 | 2 | 69.6 | 87.9 | 9 / 35 | 5784 |
| 6 | 2 | 69.2 | 86.0 | 3 / 35 | 6351 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 135 | 14% |
| TNT.TNT 0.99.1 | 12 | 75% |
| apc.LeeroyJenkins2 1.0 | 9 | 78% |
| css.Delitioner 0.11 | 3 | 33% |
| josago.Jorgito 0.16 | 2 | 100% |

Hadur died in 173 of 210 rounds, at a mean tick of 1285. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 132 | 76% | 151 |
| apc.LeeroyJenkins2 1.0 | 20 | 12% | 27 |
| TNT.TNT 0.99.1 | 11 | 6% | 21 |
| josago.Jorgito 0.16 | 5 | 3% | 5 |
| css.Delitioner 0.11 | 3 | 2% | 5 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 189346 melee ticks, 78922 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 75 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 71 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 59273 sent, 54288 reached their opponent, 8103 virtual hits (14.9% of those reached).

## Melee bench: F05

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 592 over 6 battles (98.7 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 75.4 | 30 / 210 | 3.21 | 14.6% | 23137 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.5 | 18.1% | 98 |
| justin.DemonicRage 3.4 | 1.7 | 17.1% | 59 |
| hadur117.Hadur 3.20fv | 3.0 | 14.6% | 30 |
| wompi.Numbat 2.1 | 3.8 | 13.2% | 19 |
| ms.Ares 0.19 | 5.5 | 9.1% | 0 |
| axeBots.HataMoto 3.09 | 5.5 | 9.0% | 4 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.2 | 5.6% | 0 |
| supersample.SuperBoxBot 1.0 | 8.0 | 5.0% | 0 |
| GarmBox.Oranges 1.0 | 9.3 | 4.1% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.9 | 76.5 | 7 / 35 | 3832 |
| 2 | 3 | 63.3 | 76.8 | 2 / 35 | 3980 |
| 3 | 3 | 63.8 | 75.9 | 4 / 35 | 3895 |
| 4 | 3 | 61.3 | 68.6 | 2 / 35 | 3827 |
| 5 | 2 | 65.6 | 81.6 | 12 / 35 | 4144 |
| 6 | 4 | 61.9 | 73.3 | 3 / 35 | 3459 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 37 | 46% |
| cb.fire.Firestarter 2.0f | 31 | 13% |
| wompi.Numbat 2.1 | 12 | 42% |
| axeBots.HataMoto 3.09 | 2 | 50% |
| ms.Ares 0.19 | 1 | 100% |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 100% |
| supersample.SuperBoxBot 1.0 | 1 | 100% |

Hadur died in 185 of 210 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 62 | 34% | 71 |
| justin.DemonicRage 3.4 | 53 | 29% | 67 |
| wompi.Numbat 2.1 | 41 | 22% | 45 |
| axeBots.HataMoto 3.09 | 11 | 6% | 11 |
| ms.Ares 0.19 | 9 | 5% | 10 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 3 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 1% | 2 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 153198 melee ticks, 31876 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 86 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 86 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (209 rounds): 47843 sent, 42659 reached their opponent, 7032 virtual hits (16.5% of those reached).

## Melee bench: F06

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 309 over 6 battles (51.5 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 89.9 | 136 / 210 | 1.90 | 19.8% | 32716 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 19.8% | 136 |
| jekl.StoneGhost 0.7 | 2.0 | 14.5% | 22 |
| origin.SleepSiphon 1.7b | 3.0 | 13.4% | 31 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.2 | 11.7% | 16 |
| mld.Wisdom 1.0 | 4.8 | 10.2% | 2 |
| gg.Wolverine 2.0 | 6.0 | 8.5% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 6.7% | 3 |
| spinnercat.Omen 1.0 | 8.2 | 6.2% | 0 |
| DBall.NUKE 0.1 | 8.5 | 6.1% | 0 |
| sample.Fire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 93.7 | 28 / 35 | 5661 |
| 2 | 1 | 70.8 | 92.1 | 25 / 35 | 5518 |
| 3 | 1 | 70.3 | 89.8 | 19 / 35 | 5731 |
| 4 | 1 | 70.8 | 92.1 | 25 / 35 | 5465 |
| 5 | 1 | 68.6 | 86.7 | 18 / 35 | 5309 |
| 6 | 1 | 68.6 | 85.4 | 21 / 35 | 5032 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 65 | 88% |
| origin.SleepSiphon 1.7b | 42 | 83% |
| pe.minimelee.SandboxMiniMelee 1.1 | 28 | 96% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 67% |
| gg.Wolverine 2.0 | 5 | 80% |
| spinnercat.Omen 1.0 | 3 | 100% |
| DBall.NUKE 0.1 | 3 | 100% |
| mld.Wisdom 1.0 | 2 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 25 | 32% | 68 |
| jekl.StoneGhost 0.7 | 24 | 30% | 58 |
| mld.Wisdom 1.0 | 11 | 14% | 23 |
| pe.minimelee.SandboxMiniMelee 1.1 | 6 | 8% | 33 |
| gg.Wolverine 2.0 | 4 | 5% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 4% | 8 |
| spinnercat.Omen 1.0 | 2 | 3% | 6 |
| DBall.NUKE 0.1 | 0 | 0% | 2 |
| sample.Fire 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 144918 melee ticks, 44968 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 73 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 45893 sent, 40886 reached their opponent, 9391 virtual hits (23.0% of those reached).

## Melee bench: F07

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 701 over 6 battles (116.8 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 93.0 | 124 / 210 | 1.63 | 21.0% | 39967 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 21.0% | 124 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 16.8% | 38 |
| rtk.Tachikoma 1.0 | 2.8 | 15.8% | 27 |
| franzor.Lizt 1.3.1 | 4.3 | 11.1% | 11 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 10.9% | 11 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 7.9% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.0 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 92.7 | 19 / 35 | 6656 |
| 2 | 1 | 73.0 | 93.3 | 21 / 35 | 6826 |
| 3 | 1 | 73.0 | 94.6 | 21 / 35 | 6699 |
| 4 | 1 | 73.1 | 93.3 | 24 / 35 | 6672 |
| 5 | 1 | 73.0 | 95.6 | 22 / 35 | 6655 |
| 6 | 1 | 71.3 | 88.3 | 17 / 35 | 6459 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 94 | 81% |
| rsalesc.melee.Monk 0.3.6c | 49 | 39% |
| franzor.Lizt 1.3.1 | 23 | 70% |
| oog.melee.CapuletDroid 1.1 | 19 | 63% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 1414. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 38 | 41% | 70 |
| rtk.Tachikoma 1.0 | 28 | 30% | 104 |
| oog.melee.CapuletDroid 1.1 | 10 | 11% | 29 |
| franzor.Lizt 1.3.1 | 9 | 10% | 1 |
| exauge.GateKeeper 1.1.121g | 2 | 2% | 2 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 184940 melee ticks, 91532 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 79 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 55931 sent, 50880 reached their opponent, 10395 virtual hits (20.4% of those reached).

## Melee bench: F08

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 450 over 6 battles (75.0 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.0 | 122 / 210 | 2.08 | 19.2% | 30809 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 19.2% | 122 |
| tm.Yuugao 1.0 | 2.5 | 13.1% | 33 |
| shrub.Vapour v159 | 2.8 | 12.5% | 25 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 10.7% | 14 |
| com.spp.robocode.MostlyHarmless 010 | 4.7 | 10.1% | 8 |
| m3thos.Eva00 1.1 | 6.3 | 8.7% | 2 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.8% | 6 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 6.5% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 5.2% | 1 |
| SHAM.WOW 1.4 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 83.5 | 19 / 35 | 5059 |
| 2 | 1 | 68.8 | 88.3 | 20 / 35 | 5241 |
| 3 | 1 | 68.7 | 87.9 | 20 / 35 | 4829 |
| 4 | 1 | 69.1 | 87.9 | 21 / 35 | 5249 |
| 5 | 1 | 70.1 | 92.1 | 24 / 35 | 5111 |
| 6 | 1 | 68.9 | 88.6 | 18 / 35 | 5320 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 55 | 75% |
| shrub.Vapour v159 | 35 | 66% |
| Krabb.sliNk.Garm 0.9u | 32 | 72% |
| com.spp.robocode.MostlyHarmless 010 | 21 | 76% |
| jwst.DAD.DarkAndDarker 1.1 | 8 | 88% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| m3thos.Eva00 1.1 | 6 | 83% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 793. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 26 | 29% | 73 |
| shrub.Vapour v159 | 21 | 23% | 41 |
| Krabb.sliNk.Garm 0.9u | 20 | 22% | 36 |
| com.spp.robocode.MostlyHarmless 010 | 12 | 13% | 30 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 5 |
| jwst.DAD.DarkAndDarker 1.1 | 3 | 3% | 12 |
| m3thos.Eva00 1.1 | 1 | 1% | 8 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 1 |
| SHAM.WOW 1.4 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 146975 melee ticks, 36765 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 72 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 48183 sent, 43239 reached their opponent, 8201 virtual hits (19.0% of those reached).

## Melee bench: F09

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 697 over 6 battles (116.2 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 76.9 | 63 / 210 | 3.08 | 15.6% | 22159 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 16.4% | 89 |
| hadur117.Hadur 3.20fv | 2.2 | 15.6% | 63 |
| kc.micro.Figment 1.0 | 2.8 | 14.2% | 25 |
| yagami.Tidus 0.11 | 4.5 | 10.5% | 6 |
| pedersen.Grishnakh 1.0 | 5.0 | 10.5% | 12 |
| mc2.enemy.Original 0.9 | 5.5 | 9.2% | 11 |
| dft.Calliope 5.6 | 7.0 | 8.0% | 4 |
| step.nanoPri 1.0 | 8.3 | 5.8% | 0 |
| rdm.Dueler 0.4x | 9.2 | 5.0% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.2 | 70.8 | 11 / 35 | 3451 |
| 2 | 2 | 63.2 | 75.6 | 9 / 35 | 3556 |
| 3 | 2 | 63.6 | 76.8 | 8 / 35 | 3953 |
| 4 | 2 | 65.4 | 82.5 | 9 / 35 | 3858 |
| 5 | 2 | 65.6 | 81.0 | 15 / 35 | 3718 |
| 6 | 2 | 62.9 | 74.6 | 11 / 35 | 3623 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 40 | 23% |
| kc.micro.Figment 1.0 | 38 | 87% |
| pedersen.Grishnakh 1.0 | 10 | 60% |
| mc2.enemy.Original 0.9 | 9 | 33% |
| dft.Calliope 5.6 | 8 | 88% |
| yagami.Tidus 0.11 | 6 | 67% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 153 of 210 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 60 | 39% | 76 |
| kc.micro.Figment 1.0 | 25 | 16% | 54 |
| mc2.enemy.Original 0.9 | 18 | 12% | 24 |
| yagami.Tidus 0.11 | 13 | 8% | 14 |
| pedersen.Grishnakh 1.0 | 11 | 7% | 15 |
| dft.Calliope 5.6 | 10 | 7% | 16 |
| robar.nano.Assertive_Melee 0.2 | 6 | 4% | 6 |
| step.nanoPri 1.0 | 3 | 2% | 4 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 147065 melee ticks, 39637 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 70 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 48280 sent, 43321 reached their opponent, 6071 virtual hits (14.0% of those reached).

## Melee bench: F10

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 128 over 6 battles (21.3 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 94.3 | 167 / 210 | 1.51 | 20.6% | 34331 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 20.6% | 167 |
| DTF.Kludgy 1.2b | 2.0 | 14.1% | 19 |
| ne.Chimera 1.2 | 3.2 | 13.1% | 8 |
| ejb.Polaris 1.0.1 | 3.8 | 12.0% | 7 |
| tvv.micro.Antares 1.1.1 | 5.3 | 10.2% | 5 |
| vStar.RAFzilla 2.15 | 5.7 | 9.7% | 4 |
| kurios.DOSexe .9b | 7.8 | 5.5% | 0 |
| sam.Samspin 1.0 | 8.0 | 5.5% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 5.2% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 94.0 | 28 / 35 | 5547 |
| 2 | 1 | 71.7 | 96.5 | 28 / 35 | 5766 |
| 3 | 1 | 71.2 | 95.6 | 29 / 35 | 5644 |
| 4 | 1 | 71.0 | 92.7 | 27 / 35 | 5689 |
| 5 | 1 | 71.8 | 95.9 | 29 / 35 | 5994 |
| 6 | 1 | 70.4 | 91.4 | 26 / 35 | 5691 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 56 | 84% |
| ne.Chimera 1.2 | 50 | 90% |
| ejb.Polaris 1.0.1 | 47 | 91% |
| tvv.micro.Antares 1.1.1 | 16 | 94% |
| vStar.RAFzilla 2.15 | 13 | 92% |
| kurios.DOSexe .9b | 2 | 100% |
| donjezza.Muncho 1.0 | 2 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 885. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 23 | 52% | 71 |
| ne.Chimera 1.2 | 9 | 20% | 48 |
| ejb.Polaris 1.0.1 | 7 | 16% | 43 |
| vStar.RAFzilla 2.15 | 2 | 5% | 15 |
| tvv.micro.Antares 1.1.1 | 1 | 2% | 15 |
| donjezza.Muncho 1.0 | 1 | 2% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 2 |
| kurios.DOSexe .9b | 0 | 0% | 11 |
| sam.Samspin 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 200 rounds): 137735 melee ticks, 57129 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 56 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 2.

Targeting waves (200 rounds): 45679 sent, 40827 reached their opponent, 7782 virtual hits (19.1% of those reached).

## Melee bench: F11

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 319 over 6 battles (53.2 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 76.3 | 70 / 210 | 3.13 | 15.6% | 22920 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.2 | 16.9% | 75 |
| hadur117.Hadur 3.20fv | 1.8 | 15.6% | 70 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.7% | 22 |
| djc.DynaBot 0.1.1 | 4.0 | 11.2% | 18 |
| rdt199.Warlord 0.73 | 5.5 | 9.4% | 6 |
| br2.MobyDickBot 1.6 | 5.7 | 9.3% | 12 |
| uji.YellohFellah 1.0 | 7.0 | 8.0% | 9 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.0% | 0 |
| stelo.MirrorNano 1.3 | 9.3 | 4.8% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 76.2 | 9 / 35 | 3989 |
| 2 | 2 | 62.6 | 73.0 | 12 / 35 | 3527 |
| 3 | 2 | 64.5 | 78.1 | 11 / 35 | 3990 |
| 4 | 2 | 64.5 | 77.5 | 13 / 35 | 3855 |
| 5 | 1 | 66.1 | 82.5 | 15 / 35 | 4210 |
| 6 | 2 | 61.0 | 70.8 | 10 / 35 | 3349 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 54 | 50% |
| cx.mini.Nimrod 0.55 | 15 | 67% |
| djc.DynaBot 0.1.1 | 14 | 57% |
| uji.YellohFellah 1.0 | 12 | 92% |
| br2.MobyDickBot 1.6 | 10 | 50% |
| rdt199.Warlord 0.73 | 8 | 75% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 62 | 44% | 78 |
| cx.mini.Nimrod 0.55 | 22 | 15% | 33 |
| djc.DynaBot 0.1.1 | 15 | 11% | 25 |
| rdt199.Warlord 0.73 | 11 | 8% | 19 |
| KiraNL.Chupacabra 0.4 | 11 | 8% | 13 |
| br2.MobyDickBot 1.6 | 8 | 6% | 15 |
| uji.YellohFellah 1.0 | 5 | 4% | 14 |
| stelo.MirrorNano 1.3 | 4 | 3% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 1% | 5 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 147917 melee ticks, 33366 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 98 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 98 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 49500 sent, 44516 reached their opponent, 5966 virtual hits (13.4% of those reached).

## Melee bench: F12

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 438 over 6 battles (73.0 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 87.9 | 125 / 210 | 2.09 | 18.4% | 24382 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 18.4% | 125 |
| nat.PallasHawk 1.0 | 2.7 | 13.4% | 32 |
| bts.wiki.RipCurl 0.9b | 2.8 | 13.0% | 21 |
| darkcanuck.Leon 1.01 | 3.7 | 12.3% | 20 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.3% | 9 |
| jrm.Test0 1.0 | 6.2 | 8.3% | 0 |
| cs.sheldor.Talon 1.1 | 7.3 | 6.8% | 0 |
| jp.Perpy 16.0 | 7.7 | 6.6% | 1 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.6% | 2 |
| stuff.Vlad 0.1 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 87.6 | 23 / 35 | 4462 |
| 2 | 1 | 67.2 | 86.0 | 18 / 35 | 3897 |
| 3 | 1 | 67.2 | 86.3 | 19 / 35 | 3853 |
| 4 | 1 | 69.5 | 92.4 | 26 / 35 | 4250 |
| 5 | 1 | 66.9 | 86.3 | 19 / 35 | 3970 |
| 6 | 1 | 67.6 | 88.9 | 20 / 35 | 3950 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 52 | 67% |
| darkcanuck.Leon 1.01 | 39 | 79% |
| bts.wiki.RipCurl 0.9b | 31 | 90% |
| brainfade.melee.Genghis 0.36 | 15 | 73% |
| jrm.Test0 1.0 | 7 | 100% |
| jp.Perpy 16.0 | 6 | 83% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| jaybot.bots.Oddball 4.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 28 | 32% | 63 |
| darkcanuck.Leon 1.01 | 16 | 18% | 54 |
| bts.wiki.RipCurl 0.9b | 16 | 18% | 45 |
| brainfade.melee.Genghis 0.36 | 10 | 11% | 20 |
| jrm.Test0 1.0 | 8 | 9% | 12 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 7 |
| jp.Perpy 16.0 | 2 | 2% | 2 |
| stuff.Vlad 0.1 | 1 | 1% | 3 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 130614 melee ticks, 40076 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 88 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 88 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 44787 sent, 39627 reached their opponent, 6540 virtual hits (16.5% of those reached).

## Melee bench: F13

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 308 over 6 battles (51.3 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 81.0 | 76 / 210 | 2.71 | 16.3% | 26038 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.7 | 16.3% | 76 |
| ags.Glacier 0.2.11 | 1.8 | 16.3% | 34 |
| mn.Combat 3.25.0 | 2.5 | 15.8% | 70 |
| shinh.Entangled 0.3 | 4.3 | 11.8% | 14 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.5% | 11 |
| apc.Colossus2 0.17 | 6.0 | 8.6% | 2 |
| stelo.Wang 1.0 | 7.2 | 6.6% | 3 |
| maribo.FollowFire 1 | 8.2 | 5.0% | 0 |
| ayk.WallHugger 1.0 | 8.7 | 4.9% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 76.8 | 13 / 35 | 4265 |
| 2 | 1 | 65.7 | 80.6 | 14 / 35 | 4347 |
| 3 | 3 | 64.1 | 79.4 | 9 / 35 | 3936 |
| 4 | 1 | 65.8 | 81.6 | 14 / 35 | 4360 |
| 5 | 1 | 67.4 | 85.7 | 14 / 35 | 4748 |
| 6 | 2 | 65.9 | 81.6 | 12 / 35 | 4382 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 59 | 76% |
| mn.Combat 3.25.0 | 41 | 29% |
| shinh.Entangled 0.3 | 19 | 63% |
| gh.micro.Gruweltje 0.7 | 12 | 58% |

Hadur died in 136 of 210 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 42 | 31% | 57 |
| ags.Glacier 0.2.11 | 33 | 24% | 68 |
| shinh.Entangled 0.3 | 26 | 19% | 37 |
| gh.micro.Gruweltje 0.7 | 14 | 10% | 25 |
| maribo.FollowFire 1 | 9 | 7% | 9 |
| apc.Colossus2 0.17 | 6 | 4% | 8 |
| stelo.Wang 1.0 | 4 | 3% | 4 |
| ayk.WallHugger 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 139213 melee ticks, 47190 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 94 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 94 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 41461 sent, 36244 reached their opponent, 5738 virtual hits (15.8% of those reached).

## Melee bench: F14

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 131 over 6 battles (21.8 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 93.5 | 161 / 210 | 1.58 | 20.7% | 34888 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 20.7% | 161 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.5% | 17 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.0% | 23 |
| Lo_Ian.Gandalf_V4 4.0 | 4.5 | 9.7% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 5.3 | 9.2% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.7 | 9.2% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.8 | 8.3% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 7.8% | 2 |
| pa.Improved 1.0 | 9.0 | 5.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 92.7 | 24 / 35 | 5950 |
| 2 | 1 | 70.6 | 90.2 | 24 / 35 | 5850 |
| 3 | 1 | 72.4 | 95.6 | 30 / 35 | 6186 |
| 4 | 1 | 71.3 | 94.3 | 28 / 35 | 5656 |
| 5 | 1 | 72.1 | 95.6 | 30 / 35 | 5690 |
| 6 | 1 | 70.6 | 93.0 | 25 / 35 | 5556 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 99 | 93% |
| catcat20.shape.Theta 0.018 | 51 | 71% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 83% |
| sanyi.mikrobi.Roberto 1.0 | 10 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 6 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 75% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 870. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 22 | 44% | 54 |
| simonton.micro.Sprout 1.1.3 | 17 | 34% | 99 |
| sanyi.mikrobi.Roberto 1.0 | 4 | 8% | 23 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 6% | 14 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 6% | 11 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 2% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 2 |
| pa.Improved 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 137867 melee ticks, 52588 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 72 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 43695 sent, 38954 reached their opponent, 9505 virtual hits (24.4% of those reached).

## Melee bench: F15

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 364 over 6 battles (60.7 per battle, most in one battle 116). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 84.8 | 111 / 210 | 2.37 | 18.6% | 30997 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 18.6% | 111 |
| kawigi.micro.Shiz 1.1 | 2.3 | 13.7% | 20 |
| emp.Yngwie 1.11 | 2.8 | 13.2% | 49 |
| mld.DustBunny 3.8 | 4.0 | 12.2% | 5 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.6% | 8 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.5% | 15 |
| lambdaxy.TBot 0.1 | 7.2 | 7.0% | 0 |
| Grystrion.TrackerWO 1.0 | 7.8 | 6.5% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 4.6% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.6 | 20 / 35 | 5243 |
| 2 | 1 | 66.7 | 83.2 | 14 / 35 | 4796 |
| 3 | 1 | 68.2 | 83.5 | 18 / 35 | 5086 |
| 4 | 1 | 68.8 | 87.0 | 22 / 35 | 4943 |
| 5 | 1 | 69.6 | 86.3 | 19 / 35 | 5715 |
| 6 | 1 | 67.9 | 81.3 | 18 / 35 | 5214 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 45 | 51% |
| kawigi.micro.Shiz 1.1 | 38 | 89% |
| mld.DustBunny 3.8 | 25 | 96% |
| kawigi.robot.Girl 1.2 | 22 | 73% |
| cb.nano.Insomnia 1.0 | 10 | 90% |
| Grystrion.TrackerWO 1.0 | 3 | 100% |
| divineomega.TrialBot 0.003 | 3 | 67% |

Hadur died in 102 of 210 rounds, at a mean tick of 928. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 38 | 37% | 73 |
| kawigi.robot.Girl 1.2 | 15 | 15% | 21 |
| kawigi.micro.Shiz 1.1 | 13 | 13% | 39 |
| cb.nano.Insomnia 1.0 | 11 | 11% | 15 |
| mld.DustBunny 3.8 | 10 | 10% | 38 |
| lambdaxy.TBot 0.1 | 6 | 6% | 11 |
| divineomega.TrialBot 0.003 | 4 | 4% | 9 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 159639 melee ticks, 44034 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 75 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 70 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 53142 sent, 48215 reached their opponent, 7798 virtual hits (16.2% of those reached).

## Melee bench: F16

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 307 over 6 battles (51.2 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 91.1 | 133 / 210 | 1.80 | 20.3% | 34714 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 20.3% | 133 |
| gh.Griezel 0.5.2 | 2.2 | 16.0% | 51 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.8 | 13.5% | 2 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.2% | 19 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.3% | 1 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.7% | 5 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.8% | 0 |
| repositorio.NanoStep 1.0 | 8.7 | 4.9% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.2 | 4.5% | 0 |
| asd.Cthulhu 1.3 | 9.2 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 94.0 | 25 / 35 | 6152 |
| 2 | 1 | 72.2 | 93.3 | 26 / 35 | 6244 |
| 3 | 1 | 69.5 | 87.3 | 20 / 35 | 5366 |
| 4 | 1 | 70.5 | 90.8 | 21 / 35 | 5621 |
| 5 | 1 | 70.7 | 92.4 | 21 / 35 | 5777 |
| 6 | 1 | 70.1 | 88.9 | 20 / 35 | 5554 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 97 | 72% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 26 | 100% |
| techdude.forest.FlamingForest 1.1 | 23 | 74% |
| bvh.fnr.Fenrir 0.36l | 9 | 89% |
| stelo.IntrinsicVolatility 1.4 | 5 | 100% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |
| tvv.nano.Polaris 1.2 | 3 | 33% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 1171. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 35 | 43% | 105 |
| techdude.forest.FlamingForest 1.1 | 16 | 20% | 35 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 10 | 12% | 31 |
| bvh.fnr.Fenrir 0.36l | 8 | 10% | 14 |
| stelo.IntrinsicVolatility 1.4 | 4 | 5% | 11 |
| tvv.nano.Polaris 1.2 | 4 | 5% | 5 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 6 |
| repositorio.NanoStep 1.0 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 178312 melee ticks, 63397 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 57 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 56373 sent, 51545 reached their opponent, 8676 virtual hits (16.8% of those reached).

## Melee bench: F17

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 423 over 6 battles (70.5 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 86.1 | 100 / 210 | 2.25 | 19.1% | 34863 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 19.1% | 100 |
| et.Predator 1.8 | 2.3 | 14.0% | 29 |
| oog.melee.Mercutio 1.0 | 3.3 | 12.8% | 30 |
| cx.BlestPain 1.41 | 3.3 | 12.5% | 43 |
| ahf.NanoAndrew .4 | 5.3 | 9.8% | 2 |
| nic.Nicator 2.4 | 6.0 | 9.1% | 4 |
| maribo.melee.BMV 0.1 | 6.7 | 8.4% | 1 |
| tex.Longbot 0.4 | 8.5 | 6.0% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.7% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 86.0 | 15 / 35 | 5608 |
| 2 | 1 | 68.4 | 81.9 | 15 / 35 | 5901 |
| 3 | 1 | 70.2 | 90.2 | 17 / 35 | 5785 |
| 4 | 1 | 69.3 | 85.4 | 18 / 35 | 5919 |
| 5 | 1 | 70.1 | 88.3 | 20 / 35 | 6008 |
| 6 | 1 | 68.6 | 85.1 | 15 / 35 | 5642 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 59 | 71% |
| oog.melee.Mercutio 1.0 | 43 | 70% |
| cx.BlestPain 1.41 | 39 | 36% |
| ahf.NanoAndrew .4 | 6 | 100% |
| maribo.melee.BMV 0.1 | 4 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 50% |
| nic.Nicator 2.4 | 2 | 50% |
| goblin.Bender 2.4 | 1 | 100% |
| tex.Longbot 0.4 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 1120. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 37 | 33% | 56 |
| et.Predator 1.8 | 31 | 27% | 62 |
| oog.melee.Mercutio 1.0 | 23 | 20% | 49 |
| ahf.NanoAndrew .4 | 7 | 6% | 20 |
| nic.Nicator 2.4 | 4 | 4% | 8 |
| maribo.melee.BMV 0.1 | 4 | 4% | 6 |
| edu.otg.spr.TheTeacher 1.2 | 3 | 3% | 5 |
| tex.Longbot 0.4 | 1 | 1% | 3 |
| goblin.Bender 2.4 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 167577 melee ticks, 63313 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 87 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 87 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 53764 sent, 48800 reached their opponent, 10372 virtual hits (21.3% of those reached).

## Melee bench: F18

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 507 over 6 battles (84.5 per battle, most in one battle 148). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.3 | 123 / 210 | 2.32 | 18.5% | 28485 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 18.5% | 123 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.9% | 35 |
| agd.Mooserwirt2 2.7 | 3.2 | 12.8% | 23 |
| uji.DBH 1.1 | 3.8 | 11.5% | 13 |
| spinnercat.Robovirus 2.718 | 5.5 | 9.4% | 2 |
| sigterm.Sigterm 1.0 | 6.0 | 8.7% | 8 |
| ratosh.Nobo 0.21 | 7.2 | 8.1% | 1 |
| kawigi.mini.Fhqwhgads 1.1 | 7.5 | 7.0% | 2 |
| stelo.WangRobot 1.0 | 9.2 | 5.3% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 90.5 | 19 / 35 | 4869 |
| 2 | 1 | 68.1 | 85.7 | 19 / 35 | 4941 |
| 3 | 1 | 65.9 | 79.0 | 18 / 35 | 4328 |
| 4 | 1 | 66.6 | 80.0 | 20 / 35 | 4504 |
| 5 | 1 | 70.0 | 90.5 | 25 / 35 | 5041 |
| 6 | 1 | 68.4 | 86.0 | 22 / 35 | 4802 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 55 | 73% |
| agd.Mooserwirt2 2.7 | 37 | 84% |
| uji.DBH 1.1 | 26 | 85% |
| sigterm.Sigterm 1.0 | 13 | 85% |
| spinnercat.Robovirus 2.718 | 8 | 88% |
| stelo.WangRobot 1.0 | 7 | 100% |
| ratosh.Nobo 0.21 | 4 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 0% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 722. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 35 | 39% | 81 |
| agd.Mooserwirt2 2.7 | 18 | 20% | 50 |
| uji.DBH 1.1 | 12 | 13% | 23 |
| sigterm.Sigterm 1.0 | 9 | 10% | 19 |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 7% | 10 |
| ratosh.Nobo 0.21 | 3 | 3% | 6 |
| spinnercat.Robovirus 2.718 | 2 | 2% | 10 |
| stelo.WangRobot 1.0 | 2 | 2% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 136161 melee ticks, 42052 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 657 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 305 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 45782 sent, 40680 reached their opponent, 8750 virtual hits (21.5% of those reached).

## Melee bench: F19

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 208 over 6 battles (34.7 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 95.6 | 182 / 210 | 1.40 | 21.8% | 36047 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 21.8% | 182 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 14.9% | 15 |
| krillr.mini.JointStrike 2.0.0 | 3.3 | 12.1% | 1 |
| mld.Infinity 2.2 | 3.7 | 12.1% | 6 |
| erdnis.Rover 0.3 | 4.8 | 10.7% | 0 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.2% | 4 |
| mbh.Mbh 0.1 | 6.8 | 7.8% | 0 |
| pac.ABC 2.1 | 8.2 | 6.1% | 2 |
| pbg.R2D2 1.0 | 8.8 | 5.2% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 96.2 | 30 / 35 | 5959 |
| 2 | 1 | 70.5 | 88.6 | 25 / 35 | 5499 |
| 3 | 1 | 73.4 | 97.8 | 32 / 35 | 6185 |
| 4 | 1 | 73.1 | 96.2 | 31 / 35 | 6025 |
| 5 | 1 | 73.6 | 96.2 | 31 / 35 | 6550 |
| 6 | 1 | 73.3 | 98.4 | 33 / 35 | 5829 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 118 | 93% |
| krillr.mini.JointStrike 2.0.0 | 36 | 100% |
| mld.Infinity 2.2 | 15 | 100% |
| erdnis.Rover 0.3 | 10 | 100% |
| patson.PatsonTestBot 1.0 | 7 | 86% |
| pac.ABC 2.1 | 4 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 29 of 210 rounds, at a mean tick of 723. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 15 | 52% | 67 |
| erdnis.Rover 0.3 | 4 | 14% | 28 |
| krillr.mini.JointStrike 2.0.0 | 3 | 10% | 44 |
| mld.Infinity 2.2 | 2 | 7% | 32 |
| patson.PatsonTestBot 1.0 | 2 | 7% | 12 |
| mbh.Mbh 0.1 | 1 | 3% | 9 |
| pbg.R2D2 1.0 | 1 | 3% | 5 |
| pac.ABC 2.1 | 0 | 0% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 128927 melee ticks, 40755 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 60 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 60 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 42909 sent, 38127 reached their opponent, 8825 virtual hits (23.1% of those reached).

## Melee bench: F20

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 520 over 6 battles (86.7 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 93.8 | 156 / 210 | 1.56 | 21.5% | 37397 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 21.5% | 156 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.1% | 24 |
| catcat20.Rabbit 0.001 | 4.0 | 11.0% | 15 |
| nz.jdc.nano.GridFu 1.0 | 4.0 | 10.5% | 3 |
| fwb.Nine 1.0.1 | 4.2 | 10.5% | 6 |
| m3thos.mini.Eva01 0.5.5 | 5.8 | 8.8% | 1 |
| bayen.nut.Squirrel 1.615 | 7.2 | 7.0% | 5 |
| djdjdj.NanoSkunk10 1.0 | 8.2 | 6.0% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.7 | 5.6% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 91.1 | 23 / 35 | 5964 |
| 2 | 1 | 71.6 | 93.7 | 27 / 35 | 5977 |
| 3 | 1 | 73.4 | 98.4 | 31 / 35 | 6273 |
| 4 | 1 | 72.0 | 92.1 | 27 / 35 | 6566 |
| 5 | 1 | 72.0 | 94.3 | 24 / 35 | 6301 |
| 6 | 1 | 71.7 | 93.0 | 24 / 35 | 6316 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 89 | 84% |
| catcat20.Rabbit 0.001 | 38 | 82% |
| fwb.Nine 1.0.1 | 33 | 94% |
| m3thos.mini.Eva01 0.5.5 | 8 | 100% |
| bayen.nut.Squirrel 1.615 | 7 | 57% |
| nz.jdc.nano.GridFu 1.0 | 6 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 1054. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 27 | 47% | 80 |
| catcat20.Rabbit 0.001 | 11 | 19% | 49 |
| bayen.nut.Squirrel 1.615 | 5 | 9% | 15 |
| m3thos.mini.Eva01 0.5.5 | 4 | 7% | 17 |
| fwb.Nine 1.0.1 | 4 | 7% | 14 |
| nz.jdc.nano.GridFu 1.0 | 3 | 5% | 20 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 5 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 170033 melee ticks, 58455 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 41 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 0.

Targeting waves (209 rounds): 53274 sent, 48077 reached their opponent, 10694 virtual hits (22.2% of those reached).

## Melee bench: F21

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 559 over 6 battles (93.2 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.4 | 116 / 210 | 2.05 | 19.4% | 32970 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 19.4% | 116 |
| eem.EvBot v4.6.16 | 2.0 | 16.7% | 71 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.1% | 10 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.4% | 7 |
| oa.weak.BotherBot 0.1 | 5.5 | 7.9% | 0 |
| eld.Hmm 1.0 | 5.5 | 8.4% | 7 |
| fire219.CatBot 1.0 | 7.7 | 6.3% | 0 |
| el.JumpShoot 0.2 | 8.2 | 6.0% | 0 |
| PSW.Relentless 0.1 | 8.2 | 6.0% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 87.6 | 20 / 35 | 5226 |
| 2 | 1 | 68.6 | 84.8 | 14 / 35 | 5460 |
| 3 | 1 | 71.5 | 92.1 | 27 / 35 | 5594 |
| 4 | 1 | 70.2 | 90.5 | 19 / 35 | 5848 |
| 5 | 1 | 69.2 | 89.5 | 15 / 35 | 5195 |
| 6 | 1 | 69.8 | 85.7 | 21 / 35 | 5647 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 114 | 62% |
| dummy.mini.Scimitar 1.01 | 35 | 89% |
| cf.RiO.RiOx 4.2.1 | 15 | 73% |
| eld.Hmm 1.0 | 8 | 38% |

Hadur died in 101 of 210 rounds, at a mean tick of 1173. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 54 | 53% | 110 |
| dummy.mini.Scimitar 1.01 | 11 | 11% | 44 |
| cf.RiO.RiOx 4.2.1 | 11 | 11% | 18 |
| eld.Hmm 1.0 | 8 | 8% | 23 |
| PSW.Relentless 0.1 | 8 | 8% | 8 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 2 |
| arthord.MannyPacquiao Beta | 1 | 1% | 2 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 176347 melee ticks, 80038 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 104 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 104 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 52577 sent, 47501 reached their opponent, 8044 virtual hits (16.9% of those reached).

## Melee bench: F22

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 189 over 6 battles (31.5 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 89.3 | 110 / 210 | 1.96 | 19.1% | 31332 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 19.1% | 110 |
| pe.SandboxDT 2.71m | 2.0 | 16.3% | 55 |
| jlm.javaDisturbance 0.59 | 3.5 | 13.2% | 20 |
| kvk.HebusLeTroll 0.35 | 3.5 | 13.8% | 19 |
| bigpete.Stewie 1.0 | 5.0 | 10.5% | 4 |
| yk.JahRoslav 1.1 | 6.8 | 6.9% | 1 |
| gg.Squaraus 0.6 | 7.0 | 6.6% | 0 |
| tad.Dalek98 0.98 | 7.2 | 6.3% | 1 |
| pbg.NinjaX 1.2 | 9.0 | 4.8% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 91.4 | 19 / 35 | 5278 |
| 2 | 1 | 69.7 | 90.2 | 19 / 35 | 5432 |
| 3 | 1 | 69.0 | 87.9 | 17 / 35 | 4969 |
| 4 | 1 | 69.9 | 89.2 | 16 / 35 | 5398 |
| 5 | 1 | 69.3 | 86.3 | 17 / 35 | 5295 |
| 6 | 1 | 70.2 | 90.8 | 22 / 35 | 4960 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 54 | 54% |
| jlm.javaDisturbance 0.59 | 47 | 79% |
| kvk.HebusLeTroll 0.35 | 38 | 76% |
| bigpete.Stewie 1.0 | 12 | 100% |
| tad.Dalek98 0.98 | 3 | 67% |
| yk.JahRoslav 1.1 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 985. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 47 | 47% | 90 |
| jlm.javaDisturbance 0.59 | 26 | 26% | 58 |
| kvk.HebusLeTroll 0.35 | 18 | 18% | 37 |
| bigpete.Stewie 1.0 | 5 | 5% | 13 |
| tad.Dalek98 0.98 | 3 | 3% | 3 |
| yk.JahRoslav 1.1 | 1 | 1% | 4 |
| gg.Squaraus 0.6 | 0 | 0% | 3 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 164957 melee ticks, 45582 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 103 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 103 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 52613 sent, 47560 reached their opponent, 7624 virtual hits (16.0% of those reached).

## Melee bench: F23

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 460 over 6 battles (76.7 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 94.5 | 167 / 210 | 1.50 | 21.6% | 36949 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 21.6% | 167 |
| pe.SandboxLump 1.52 | 2.0 | 16.3% | 26 |
| cre.Karolos 0.32 | 3.0 | 14.2% | 14 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.1% | 0 |
| cw.megas.Blade 0.8 | 5.8 | 8.6% | 0 |
| stelo.RamTrackSurfer 1.2 | 6.2 | 8.8% | 2 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.3 | 8.6% | 1 |
| sample.Walls 1.0 | 7.7 | 7.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 2.8% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 94.9 | 30 / 35 | 6080 |
| 2 | 1 | 73.9 | 98.4 | 31 / 35 | 6401 |
| 3 | 1 | 73.7 | 96.8 | 28 / 35 | 6478 |
| 4 | 1 | 73.6 | 97.5 | 30 / 35 | 6228 |
| 5 | 1 | 72.0 | 90.8 | 25 / 35 | 5971 |
| 6 | 1 | 70.8 | 88.6 | 23 / 35 | 5791 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 92 | 87% |
| cre.Karolos 0.32 | 62 | 87% |
| stelo.RamTrackSurfer 1.2 | 13 | 100% |
| stelo.AreaTargetingBot 1.1 | 10 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 755. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cre.Karolos 0.32 | 19 | 40% | 56 |
| pe.SandboxLump 1.52 | 16 | 34% | 98 |
| stelo.AreaTargetingBot 1.1 | 3 | 6% | 18 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 4% | 8 |
| stelo.RamTrackSurfer 1.2 | 1 | 2% | 21 |
| cw.megas.Blade 0.8 | 1 | 2% | 5 |
| sample.Walls 1.0 | 1 | 2% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 124490 melee ticks, 51162 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 73 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 39130 sent, 34183 reached their opponent, 10277 virtual hits (30.1% of those reached).

## Melee bench: F24

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 679 over 6 battles (113.2 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 81.8 | 83 / 210 | 2.64 | 16.7% | 23785 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 16.7% | 83 |
| davidalves.Phoenix 0.54 | 2.5 | 13.7% | 43 |
| rz.GlowBlowMelee 1.4 | 3.0 | 13.6% | 33 |
| florent.XSeries.X2 0.12 | 3.7 | 12.8% | 28 |
| pedersen.Ugluk 1.1.1 | 4.8 | 12.1% | 16 |
| oog.melee.Corsair 1.0 | 6.0 | 9.0% | 3 |
| stelo.SoJNanoMelee 1.1 | 7.3 | 6.4% | 4 |
| lunchie.Lunchbox 0.93 | 7.8 | 5.9% | 0 |
| as.FrankTheTank 1.3 | 9.0 | 5.2% | 0 |
| evd.X1 0.01 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 80.3 | 10 / 35 | 3966 |
| 2 | 1 | 65.6 | 81.6 | 15 / 35 | 3778 |
| 3 | 1 | 66.6 | 83.8 | 16 / 35 | 4085 |
| 4 | 1 | 66.3 | 82.9 | 17 / 35 | 3958 |
| 5 | 1 | 65.5 | 81.3 | 12 / 35 | 3915 |
| 6 | 1 | 65.6 | 81.0 | 13 / 35 | 4083 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 45 | 64% |
| davidalves.Phoenix 0.54 | 27 | 48% |
| florent.XSeries.X2 0.12 | 23 | 57% |
| pedersen.Ugluk 1.1.1 | 20 | 75% |
| oog.melee.Corsair 1.0 | 13 | 85% |
| stelo.SoJNanoMelee 1.1 | 3 | 67% |

Hadur died in 133 of 210 rounds, at a mean tick of 781. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 33 | 25% | 51 |
| davidalves.Phoenix 0.54 | 30 | 23% | 43 |
| rz.GlowBlowMelee 1.4 | 29 | 22% | 53 |
| pedersen.Ugluk 1.1.1 | 21 | 16% | 28 |
| oog.melee.Corsair 1.0 | 7 | 5% | 23 |
| stelo.SoJNanoMelee 1.1 | 3 | 2% | 4 |
| lunchie.Lunchbox 0.93 | 2 | 2% | 3 |
| as.FrankTheTank 1.3 | 1 | 1% | 2 |
| evd.X1 0.01 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 140592 melee ticks, 37719 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 87 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 87 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 46249 sent, 40992 reached their opponent, 7252 virtual hits (17.7% of those reached).

## Melee bench: F25

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 612 over 6 battles (102.0 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 87.7 | 137 / 210 | 2.11 | 18.9% | 25320 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 18.9% | 137 |
| voidious.mini.BrokenSword 2.0.3 | 2.7 | 13.5% | 21 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 13.2% | 19 |
| jdw.Hurricane 1.4 | 3.7 | 11.6% | 14 |
| gre.svman4.Morfeas 1.4.1 | 5.5 | 9.7% | 6 |
| ds.Oo 2.2 | 5.7 | 9.2% | 7 |
| awesomeness.Elite 1.0 | 7.8 | 6.6% | 2 |
| adt.Ar2 1.1 | 7.8 | 6.9% | 1 |
| gjr.Cephalosporin 0.1 | 8.5 | 6.3% | 3 |
| amk.ChumbaMini 0.2 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.3 | 23 / 35 | 4430 |
| 2 | 1 | 69.4 | 89.8 | 24 / 35 | 4453 |
| 3 | 1 | 68.0 | 85.7 | 23 / 35 | 4088 |
| 4 | 1 | 68.4 | 87.3 | 24 / 35 | 4049 |
| 5 | 1 | 68.2 | 87.9 | 19 / 35 | 4244 |
| 6 | 1 | 68.4 | 87.9 | 24 / 35 | 4056 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 48 | 83% |
| voidious.micro.BlitzBat 1.05 | 39 | 82% |
| jdw.Hurricane 1.4 | 30 | 83% |
| gre.svman4.Morfeas 1.4.1 | 15 | 87% |
| ds.Oo 2.2 | 13 | 100% |
| awesomeness.Elite 1.0 | 10 | 90% |
| gjr.Cephalosporin 0.1 | 3 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |
| adt.Ar2 1.1 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 21 | 27% | 42 |
| jdw.Hurricane 1.4 | 18 | 23% | 35 |
| voidious.mini.BrokenSword 2.0.3 | 12 | 15% | 38 |
| ds.Oo 2.2 | 8 | 10% | 30 |
| gre.svman4.Morfeas 1.4.1 | 8 | 10% | 26 |
| adt.Ar2 1.1 | 4 | 5% | 14 |
| awesomeness.Elite 1.0 | 2 | 3% | 16 |
| gjr.Cephalosporin 0.1 | 0 | 0% | 5 |
| amk.ChumbaMini 0.2 | 0 | 0% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 127313 melee ticks, 30809 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 95 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 95 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 45078 sent, 40002 reached their opponent, 6627 virtual hits (16.6% of those reached).

## Melee bench: F26

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 613 over 6 battles (102.2 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 92.0 | 139 / 210 | 1.72 | 20.6% | 37404 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 20.6% | 139 |
| ak.Fermat 2.0 | 2.0 | 15.3% | 36 |
| shu.nitro.LENIN .T34 | 3.2 | 12.8% | 17 |
| lrem.Spectre 0.4.4 | 3.8 | 11.8% | 12 |
| js.PinBall 1.6 | 5.0 | 10.6% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 6.2 | 9.2% | 1 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 7.5% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 6.7% | 2 |
| sample.SpinBot 1.0 | 9.0 | 4.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 91.1 | 22 / 35 | 6015 |
| 2 | 1 | 71.9 | 92.4 | 24 / 35 | 6505 |
| 3 | 1 | 72.3 | 94.3 | 25 / 35 | 6140 |
| 4 | 1 | 71.5 | 92.1 | 23 / 35 | 6092 |
| 5 | 1 | 70.8 | 89.8 | 21 / 35 | 5992 |
| 6 | 1 | 71.9 | 92.1 | 24 / 35 | 6660 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 63 | 73% |
| shu.nitro.LENIN .T34 | 45 | 89% |
| lrem.Spectre 0.4.4 | 38 | 79% |
| js.PinBall 1.6 | 11 | 91% |
| jaybot.adv.bots.JayBot 2.0 | 8 | 88% |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 100% |
| gh.mini.GrubbmOne 1.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 34 | 45% | 77 |
| shu.nitro.LENIN .T34 | 17 | 22% | 69 |
| lrem.Spectre 0.4.4 | 12 | 16% | 32 |
| js.PinBall 1.6 | 4 | 5% | 13 |
| gh.mini.GrubbmOne 1.0 | 3 | 4% | 6 |
| jaybot.adv.bots.JayBot 2.0 | 1 | 1% | 9 |
| fullsail.LaxativeTeaTwo 1.0 | 0 | 0% | 4 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 160733 melee ticks, 47691 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 66 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 51836 sent, 46806 reached their opponent, 11315 virtual hits (24.2% of those reached).

## Melee bench: F27

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 697 over 6 battles (116.2 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 80.4 | 145 / 210 | 2.76 | 18.5% | 30598 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.5 | 18.5% | 145 |
| mk.Alpha 0.2.1 | 1.7 | 14.1% | 42 |
| EH.Eagle 1.0.6 | 2.8 | 11.4% | 5 |
| sheldor.melee.nano.TestMelee 0.1 | 4.7 | 9.9% | 7 |
| techdude.kombat.FlamingKombat 1.5 | 5.7 | 9.4% | 3 |
| wee.Gem 1.8.4 | 6.2 | 9.0% | 6 |
| throxbot.ThroxBot 0.1 | 6.7 | 8.4% | 1 |
| joe.ADinosaur 1.0 | 7.3 | 8.0% | 0 |
| caimano.Furia_Ceca 0.22 | 8.5 | 7.1% | 1 |
| cs.Grudge 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 93.0 | 26 / 35 | 5152 |
| 2 | 1 | 71.5 | 97.1 | 32 / 35 | 5148 |
| 3 | 1 | 71.3 | 95.9 | 31 / 35 | 5273 |
| 4 | 2 | 62.1 | 58.1 | 15 / 35 | 5138 |
| 5 | 3 | 55.5 | 44.8 | 12 / 35 | 4151 |
| 6 | 1 | 71.5 | 93.7 | 29 / 35 | 5736 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 84 | 88% |
| EH.Eagle 1.0.6 | 29 | 97% |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 100% |
| throxbot.ThroxBot 0.1 | 9 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 8 | 100% |
| wee.Gem 1.8.4 | 6 | 100% |
| joe.ADinosaur 1.0 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 506. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cs.Grudge 1.0 | 23 | 32% | 23 |
| mk.Alpha 0.2.1 | 16 | 22% | 72 |
| EH.Eagle 1.0.6 | 7 | 10% | 37 |
| techdude.kombat.FlamingKombat 1.5 | 6 | 8% | 17 |
| joe.ADinosaur 1.0 | 6 | 8% | 13 |
| caimano.Furia_Ceca 0.22 | 5 | 7% | 6 |
| sheldor.melee.nano.TestMelee 0.1 | 1 | 1% | 15 |
| throxbot.ThroxBot 0.1 | 1 | 1% | 13 |
| wee.Gem 1.8.4 | 1 | 1% | 11 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 120645 melee ticks, 37151 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 70 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 39934 sent, 35026 reached their opponent, 8418 virtual hits (24.0% of those reached).

## Melee bench: F28

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 378 over 6 battles (63.0 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 90.8 | 142 / 210 | 1.82 | 18.9% | 24399 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 18.9% | 142 |
| kid.test.NightFox .2 | 2.0 | 14.7% | 30 |
| uji.Antique 1.0 | 3.5 | 11.7% | 20 |
| pfvicm.Sobieski 7.2.3b | 3.8 | 10.8% | 2 |
| qohnil.blot.BlotBot 3.61 | 4.8 | 10.3% | 8 |
| amk.ChumbaWumba 0.3 | 6.2 | 8.6% | 3 |
| ahr.ice.Ice 1.0.2 | 6.8 | 7.7% | 3 |
| matt.advanced.Katana 1.0 | 8.2 | 6.3% | 2 |
| stelo.PianistNano 1.2 | 9.2 | 5.5% | 0 |
| stelo.Lifestealer 1.0 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 92.4 | 25 / 35 | 4114 |
| 2 | 1 | 68.7 | 92.1 | 23 / 35 | 4063 |
| 3 | 1 | 69.1 | 92.4 | 26 / 35 | 4194 |
| 4 | 1 | 66.9 | 87.9 | 22 / 35 | 3588 |
| 5 | 1 | 69.3 | 92.4 | 25 / 35 | 4331 |
| 6 | 1 | 67.7 | 87.9 | 21 / 35 | 4109 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 82 | 85% |
| uji.Antique 1.0 | 46 | 87% |
| qohnil.blot.BlotBot 3.61 | 14 | 79% |
| pfvicm.Sobieski 7.2.3b | 9 | 89% |
| ahr.ice.Ice 1.0.2 | 8 | 75% |
| amk.ChumbaWumba 0.3 | 7 | 86% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 742. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 21 | 28% | 56 |
| uji.Antique 1.0 | 18 | 24% | 59 |
| pfvicm.Sobieski 7.2.3b | 15 | 20% | 25 |
| amk.ChumbaWumba 0.3 | 8 | 11% | 19 |
| ahr.ice.Ice 1.0.2 | 6 | 8% | 13 |
| qohnil.blot.BlotBot 3.61 | 4 | 5% | 21 |
| stelo.PianistNano 1.2 | 1 | 1% | 6 |
| matt.advanced.Katana 1.0 | 0 | 0% | 6 |
| stelo.Lifestealer 1.0 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 128483 melee ticks, 37754 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 168 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 168 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 43827 sent, 38791 reached their opponent, 5578 virtual hits (14.4% of those reached).

## Melee bench: F29

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 559 over 6 battles (93.2 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 89.3 | 114 / 210 | 1.96 | 19.3% | 28689 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 19.3% | 114 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 15.0% | 52 |
| deewiant.Anomaly 0.2 | 2.7 | 14.2% | 34 |
| myl.micro.Troodon 1.10 | 4.2 | 12.1% | 7 |
| jok.PheonixM 0.1.2 | 4.8 | 10.3% | 3 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.2% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.3 | 6.1% | 0 |
| DBall.Anarchy 0.1 | 8.2 | 5.7% | 1 |
| ap.Frederick 1.1 | 8.5 | 5.0% | 0 |
| jangs.ns51 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 86.0 | 20 / 35 | 4663 |
| 2 | 1 | 69.1 | 87.9 | 19 / 35 | 4698 |
| 3 | 1 | 69.5 | 87.3 | 18 / 35 | 4806 |
| 4 | 1 | 69.6 | 89.5 | 19 / 35 | 4675 |
| 5 | 1 | 70.3 | 92.1 | 19 / 35 | 4908 |
| 6 | 1 | 70.5 | 93.0 | 19 / 35 | 4939 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 56 | 71% |
| zyx.mega.YersiniaPestis 3.1 | 45 | 49% |
| myl.micro.Troodon 1.10 | 30 | 93% |
| jok.PheonixM 0.1.2 | 15 | 93% |
| ap.Frederick 1.1 | 5 | 100% |
| DBall.Anarchy 0.1 | 3 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 1022. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 43 | 42% | 74 |
| deewiant.Anomaly 0.2 | 35 | 34% | 78 |
| jok.PheonixM 0.1.2 | 9 | 9% | 16 |
| myl.micro.Troodon 1.10 | 7 | 7% | 25 |
| ph.melee.ArcherME 0.3 | 3 | 3% | 8 |
| jangs.ns51 1.0 | 1 | 1% | 2 |
| DBall.Anarchy 0.1 | 0 | 0% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 170897 melee ticks, 53207 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 48 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 2.

Targeting waves (205 rounds): 55547 sent, 50551 reached their opponent, 7669 virtual hits (15.2% of those reached).

## Melee bench: F30

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 691 over 6 battles (115.2 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 75.4 | 44 / 210 | 3.21 | 15.2% | 24798 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.3 | 15.2% | 44 |
| catcat20.Matcha 0.006 | 2.2 | 14.6% | 54 |
| darkcanuck.B26354 1.06 | 3.3 | 13.3% | 44 |
| stelo.PastFuture 2.3.2 | 3.7 | 12.8% | 26 |
| oog.melee.Capulet 1.2 | 4.5 | 12.1% | 22 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.3% | 12 |
| tripphippy.Alice 1.1 | 7.3 | 7.6% | 4 |
| ntc.Opposite 1.5 | 8.0 | 6.5% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 8.7 | 6.0% | 3 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.5 | 71.7 | 4 / 35 | 3912 |
| 2 | 1 | 65.8 | 81.0 | 9 / 35 | 4531 |
| 3 | 1 | 63.8 | 76.8 | 10 / 35 | 4184 |
| 4 | 3 | 61.0 | 71.4 | 3 / 35 | 3687 |
| 5 | 1 | 64.4 | 76.8 | 9 / 35 | 4282 |
| 6 | 1 | 63.7 | 74.6 | 9 / 35 | 4202 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 35 | 40% |
| darkcanuck.B26354 1.06 | 27 | 41% |
| oog.melee.Capulet 1.2 | 13 | 54% |
| tripphippy.Alice 1.1 | 7 | 86% |
| stelo.PastFuture 2.3.2 | 6 | 50% |
| intruder.PrairieWolf 2.61 | 4 | 50% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 100% |

Hadur died in 173 of 210 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 43 | 25% | 53 |
| catcat20.Matcha 0.006 | 40 | 23% | 51 |
| stelo.PastFuture 2.3.2 | 31 | 18% | 37 |
| oog.melee.Capulet 1.2 | 29 | 17% | 39 |
| intruder.PrairieWolf 2.61 | 9 | 5% | 13 |
| tripphippy.Alice 1.1 | 6 | 3% | 8 |
| ntc.Opposite 1.5 | 5 | 3% | 5 |
| fowl3628800.LightningBolt 2.6.0 | 3 | 2% | 3 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 159882 melee ticks, 30264 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 80 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 50759 sent, 45573 reached their opponent, 7971 virtual hits (17.5% of those reached).

## Melee bench: F31

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 240 over 6 battles (40.0 per battle, most in one battle 99). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 82.1 | 69 / 210 | 2.61 | 16.5% | 22649 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.2 | 17.6% | 80 |
| hadur117.Hadur 3.20fv | 1.8 | 16.5% | 69 |
| gh.mini.Griezel 0.2 | 3.3 | 12.2% | 37 |
| d414.nano.Quantum 1.0.0 | 4.0 | 11.5% | 8 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 11.1% | 6 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.6% | 5 |
| timmit.nano.TimDog 0.33 | 7.7 | 6.4% | 4 |
| fm.mammillarias 1.3 | 7.8 | 6.1% | 0 |
| tlp.ThreeLeggedPig 1 | 9.0 | 5.1% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 9.5 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 84.8 | 10 / 35 | 3614 |
| 2 | 2 | 65.5 | 83.2 | 11 / 35 | 3890 |
| 3 | 2 | 66.0 | 83.5 | 13 / 35 | 3873 |
| 4 | 2 | 61.8 | 74.0 | 6 / 35 | 3321 |
| 5 | 1 | 66.7 | 83.2 | 17 / 35 | 4133 |
| 6 | 2 | 66.7 | 84.1 | 12 / 35 | 3818 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 64 | 42% |
| gh.mini.Griezel 0.2 | 31 | 61% |
| d414.nano.Quantum 1.0.0 | 15 | 87% |
| spinnercat.micro.Tyger 0.1 | 7 | 86% |
| gh.nano.Grofvuil 0.2 | 5 | 80% |
| tlp.ThreeLeggedPig 1 | 1 | 0% |

Hadur died in 143 of 210 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 73 | 51% | 101 |
| gh.mini.Griezel 0.2 | 29 | 20% | 49 |
| d414.nano.Quantum 1.0.0 | 12 | 8% | 22 |
| gh.nano.Grofvuil 0.2 | 10 | 7% | 13 |
| spinnercat.micro.Tyger 0.1 | 7 | 5% | 12 |
| fm.mammillarias 1.3 | 5 | 3% | 6 |
| timmit.nano.TimDog 0.33 | 3 | 2% | 4 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 1 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 0 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 158846 melee ticks, 36102 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 42 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 50598 sent, 45476 reached their opponent, 7439 virtual hits (16.4% of those reached).

## Melee bench: F32

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 403 over 6 battles (67.2 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 88.3 | 113 / 210 | 2.06 | 18.3% | 27603 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 18.3% | 113 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.1% | 56 |
| apc.botM 3.0 | 3.0 | 12.4% | 19 |
| lxx.ConceptA 0.8 | 4.5 | 9.5% | 3 |
| vjik.UnViolation 1.1 | 4.8 | 9.7% | 9 |
| bayen.UbaMicro 1.4 | 6.0 | 8.6% | 4 |
| panzer.Panzer 0.2 | 7.3 | 7.3% | 1 |
| yk.JahMicro 1.0 | 7.8 | 7.0% | 2 |
| conscience.Electron 1.3g | 9.0 | 6.3% | 0 |
| donjezza.Jezza 1.0 | 9.5 | 5.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 92.1 | 17 / 35 | 4825 |
| 2 | 1 | 66.7 | 84.8 | 16 / 35 | 4704 |
| 3 | 1 | 66.1 | 84.4 | 19 / 35 | 4233 |
| 4 | 1 | 68.4 | 88.6 | 20 / 35 | 4975 |
| 5 | 1 | 66.8 | 86.3 | 19 / 35 | 4126 |
| 6 | 1 | 69.3 | 93.3 | 22 / 35 | 4740 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 88 | 61% |
| apc.botM 3.0 | 38 | 58% |
| vjik.UnViolation 1.1 | 11 | 100% |
| yk.JahMicro 1.0 | 9 | 78% |
| lxx.ConceptA 0.8 | 8 | 88% |
| donjezza.Jezza 1.0 | 6 | 67% |
| bayen.UbaMicro 1.4 | 6 | 83% |
| panzer.Panzer 0.2 | 4 | 75% |

Hadur died in 100 of 210 rounds, at a mean tick of 842. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 45 | 45% | 94 |
| apc.botM 3.0 | 23 | 23% | 45 |
| lxx.ConceptA 0.8 | 11 | 11% | 18 |
| vjik.UnViolation 1.1 | 5 | 5% | 21 |
| panzer.Panzer 0.2 | 4 | 4% | 8 |
| bayen.UbaMicro 1.4 | 3 | 3% | 9 |
| conscience.Electron 1.3g | 2 | 2% | 6 |
| yk.JahMicro 1.0 | 2 | 2% | 6 |
| donjezza.Jezza 1.0 | 2 | 2% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 127698 melee ticks, 53803 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 75 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 75 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 42617 sent, 37618 reached their opponent, 6659 virtual hits (17.7% of those reached).

## Melee bench: F33

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 293 over 6 battles (48.8 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 87.8 | 113 / 210 | 2.10 | 19.0% | 28979 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 19.0% | 113 |
| maribo.Quester 0.3 | 2.0 | 16.0% | 47 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.5% | 24 |
| labg.Cataclysm 2.05 | 4.3 | 10.7% | 14 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 11.0% | 6 |
| baal.nano.N 1.42 | 6.3 | 8.8% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.5% | 7 |
| zyx.micro.Ant 1.1 | 8.2 | 5.3% | 0 |
| sanja.First 0.1 | 9.0 | 4.8% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 90.2 | 22 / 35 | 5222 |
| 2 | 1 | 67.6 | 83.5 | 14 / 35 | 4711 |
| 3 | 1 | 69.7 | 89.5 | 21 / 35 | 4998 |
| 4 | 1 | 70.0 | 90.8 | 22 / 35 | 4911 |
| 5 | 1 | 68.6 | 86.0 | 19 / 35 | 4698 |
| 6 | 1 | 68.2 | 87.0 | 15 / 35 | 4439 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 60 | 72% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 70% |
| labg.Cataclysm 2.05 | 23 | 74% |
| gre.svman4.Leonidas 1.3.2 | 16 | 81% |
| baal.nano.N 1.42 | 8 | 100% |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 83% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 1006. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 34 | 34% | 75 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 21% | 42 |
| gre.svman4.Leonidas 1.3.2 | 19 | 19% | 36 |
| labg.Cataclysm 2.05 | 9 | 9% | 21 |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 8% | 11 |
| baal.nano.N 1.42 | 3 | 3% | 13 |
| sanja.First 0.1 | 2 | 2% | 2 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 3 |
| zyx.micro.Ant 1.1 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 171065 melee ticks, 46839 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 298 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 298 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 54126 sent, 49156 reached their opponent, 7095 virtual hits (14.4% of those reached).

## Melee bench: F34

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 480 over 6 battles (80.0 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 87.2 | 93 / 210 | 2.15 | 18.4% | 30524 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 18.4% | 93 |
| kid.Gladiator .7.2 | 2.3 | 15.7% | 39 |
| stelo.Spread 0.9 | 2.7 | 15.8% | 56 |
| jcs.Seth 1.8 | 4.3 | 11.5% | 17 |
| tcf.Reach 3 | 4.7 | 11.3% | 4 |
| cli.Dancer 1.1 | 6.0 | 9.0% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.2% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.5% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 83.8 | 12 / 35 | 4863 |
| 2 | 1 | 69.7 | 87.9 | 19 / 35 | 5222 |
| 3 | 1 | 69.4 | 88.6 | 15 / 35 | 5256 |
| 4 | 1 | 68.4 | 86.3 | 16 / 35 | 4724 |
| 5 | 1 | 68.1 | 84.8 | 13 / 35 | 5154 |
| 6 | 1 | 70.3 | 92.1 | 18 / 35 | 5305 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 60 | 48% |
| kid.Gladiator .7.2 | 60 | 67% |
| jcs.Seth 1.8 | 22 | 64% |
| tcf.Reach 3 | 12 | 75% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 1057. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 47 | 39% | 82 |
| kid.Gladiator .7.2 | 38 | 31% | 63 |
| jcs.Seth 1.8 | 15 | 12% | 31 |
| tcf.Reach 3 | 11 | 9% | 23 |
| cli.Dancer 1.1 | 5 | 4% | 5 |
| ratosh.Wesco 1.4 | 1 | 1% | 5 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 164586 melee ticks, 58735 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 48 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 51731 sent, 46699 reached their opponent, 7760 virtual hits (16.6% of those reached).

## Melee bench: F35

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 255 over 6 battles (42.5 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 85.6 | 66 / 210 | 2.30 | 17.0% | 23577 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 18.8% | 122 |
| hadur117.Hadur 3.20fv | 2.0 | 17.0% | 66 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.7 | 12.6% | 10 |
| gh.mini.Gruwel 0.9 | 3.7 | 12.1% | 9 |
| rz.HawkOnFire 0.1 | 4.7 | 11.7% | 1 |
| wit.Chuliath 1.0 | 6.5 | 6.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.2 | 5.9% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.7 | 5.6% | 1 |
| dans.Cinnamon 1.2 | 9.2 | 4.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.2 | 88.6 | 11 / 35 | 3827 |
| 2 | 2 | 65.7 | 84.4 | 12 / 35 | 3688 |
| 3 | 2 | 66.0 | 83.5 | 8 / 35 | 3886 |
| 4 | 2 | 66.7 | 83.5 | 12 / 35 | 4085 |
| 5 | 2 | 66.0 | 84.4 | 10 / 35 | 3689 |
| 6 | 2 | 68.2 | 89.2 | 13 / 35 | 4402 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 100 | 26% |
| rz.HawkOnFire 0.1 | 20 | 95% |
| gh.mini.Gruwel 0.9 | 16 | 63% |
| dmh.robocode.robot.BlackDeath 9.2 | 13 | 77% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 971. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 85 | 58% | 115 |
| gh.mini.Gruwel 0.9 | 24 | 16% | 35 |
| dmh.robocode.robot.BlackDeath 9.2 | 19 | 13% | 28 |
| rz.HawkOnFire 0.1 | 11 | 8% | 24 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 2% | 3 |
| dans.Cinnamon 1.2 | 1 | 1% | 2 |
| wit.Chuliath 1.0 | 1 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 146810 melee ticks, 52820 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 41 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 45371 sent, 40361 reached their opponent, 6062 virtual hits (15.0% of those reached).

## Melee bench: F36

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 309 over 6 battles (51.5 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 94.0 | 172 / 210 | 1.54 | 21.4% | 33803 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 21.4% | 172 |
| alpha.RainingFire 1.0 | 2.3 | 12.3% | 12 |
| bzdp.Pansy 2.1 | 3.7 | 11.2% | 3 |
| mz.Cork 0.1 | 4.7 | 10.2% | 7 |
| bvh.micro.Freya 0.3 | 4.7 | 10.6% | 6 |
| m3thos.Eva02 0.7.1 | 5.7 | 10.0% | 4 |
| bvh.mini.Fenrir 0.39 | 6.0 | 9.7% | 4 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 5.5% | 0 |
| dl.BetterWalls 1.0 | 9.0 | 4.9% | 1 |
| sample.MyFirstRobot 1.0 | 9.7 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 91.4 | 28 / 35 | 5383 |
| 2 | 1 | 71.8 | 95.6 | 28 / 35 | 5622 |
| 3 | 1 | 72.8 | 95.9 | 30 / 35 | 6294 |
| 4 | 1 | 71.5 | 92.7 | 29 / 35 | 5387 |
| 5 | 1 | 71.2 | 92.1 | 27 / 35 | 5450 |
| 6 | 1 | 72.3 | 96.2 | 30 / 35 | 5667 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 40 | 100% |
| alpha.RainingFire 1.0 | 36 | 89% |
| bvh.micro.Freya 0.3 | 33 | 94% |
| m3thos.Eva02 0.7.1 | 25 | 92% |
| bvh.mini.Fenrir 0.39 | 25 | 92% |
| mz.Cork 0.1 | 19 | 84% |
| sample.MyFirstRobot 1.0 | 4 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 810. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 16 | 40% | 55 |
| mz.Cork 0.1 | 8 | 20% | 27 |
| bzdp.Pansy 2.1 | 4 | 10% | 41 |
| bvh.micro.Freya 0.3 | 4 | 10% | 26 |
| bvh.mini.Fenrir 0.39 | 3 | 8% | 14 |
| m3thos.Eva02 0.7.1 | 2 | 5% | 32 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 5 |
| dl.BetterWalls 1.0 | 0 | 0% | 7 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 144985 melee ticks, 45361 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 55 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 49774 sent, 44848 reached their opponent, 9254 virtual hits (20.6% of those reached).

## Melee bench: F37

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 265 over 6 battles (44.2 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 89.2 | 165 / 210 | 1.97 | 19.7% | 34650 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 19.7% | 165 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.0 | 10.1% | 9 |
| germ.TheMind .2 | 4.2 | 9.7% | 3 |
| EBBU.Sim2 1.02 | 4.3 | 9.6% | 6 |
| agrach.Dalek 1.0 | 5.3 | 9.0% | 8 |
| stelo.UntouchableNano 1.3 | 6.0 | 8.8% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 6.7 | 8.6% | 3 |
| mb.Beast 0.1 | 7.2 | 8.4% | 7 |
| lmk.ACPFinal 0.1 | 7.8 | 8.2% | 4 |
| skm.Ryubot 1.0 | 8.5 | 7.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 82.2 | 24 / 35 | 5239 |
| 2 | 1 | 68.8 | 88.3 | 28 / 35 | 5764 |
| 3 | 1 | 69.6 | 91.7 | 28 / 35 | 5932 |
| 4 | 1 | 69.5 | 92.1 | 28 / 35 | 5872 |
| 5 | 1 | 69.5 | 91.7 | 29 / 35 | 5793 |
| 6 | 1 | 69.5 | 89.2 | 28 / 35 | 6050 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.UntouchableNano 1.3 | 30 | 93% |
| com.syncleus.robocode.Dreadnaught 0.1 | 24 | 92% |
| mb.Beast 0.1 | 24 | 100% |
| skm.Ryubot 1.0 | 20 | 95% |
| germ.TheMind .2 | 19 | 100% |
| EBBU.Sim2 1.02 | 18 | 89% |
| lmk.ACPFinal 0.1 | 18 | 100% |
| agrach.Dalek 1.0 | 17 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 67% |

Hadur died in 49 of 210 rounds, at a mean tick of 405. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 21 | 43% | 28 |
| com.syncleus.robocode.Dreadnaught 0.1 | 8 | 16% | 34 |
| agrach.Dalek 1.0 | 6 | 12% | 30 |
| stelo.UntouchableNano 1.3 | 4 | 8% | 29 |
| lmk.ACPFinal 0.1 | 4 | 8% | 17 |
| EBBU.Sim2 1.02 | 2 | 4% | 20 |
| skm.Ryubot 1.0 | 2 | 4% | 6 |
| mb.Beast 0.1 | 1 | 2% | 22 |
| germ.TheMind .2 | 0 | 0% | 21 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 93089 melee ticks, 26115 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 78 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 40 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 31340 sent, 26814 reached their opponent, 7780 virtual hits (29.0% of those reached).

## Melee bench: F38

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 402 over 6 battles (67.0 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.6 | 113 / 210 | 2.12 | 18.4% | 28263 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 18.4% | 113 |
| justin.Mallais 14.0 | 2.0 | 15.4% | 45 |
| bvh.mini.Freya 0.55 | 3.0 | 13.0% | 12 |
| bts.mega.Gnarly 1.4 | 4.5 | 10.9% | 20 |
| cs.Wren 1.0 | 5.0 | 9.9% | 2 |
| kdf.KoulDestroyer 1.0 | 5.5 | 9.6% | 7 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.0 | 8.4% | 6 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.5% | 4 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.3% | 1 |
| bzdp.BoxCar 2.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 85.7 | 17 / 35 | 4308 |
| 2 | 1 | 69.5 | 89.8 | 21 / 35 | 4915 |
| 3 | 1 | 68.3 | 88.3 | 19 / 35 | 4825 |
| 4 | 1 | 69.7 | 90.2 | 22 / 35 | 4937 |
| 5 | 1 | 68.1 | 87.0 | 19 / 35 | 4746 |
| 6 | 1 | 66.9 | 84.4 | 15 / 35 | 4532 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 75 | 67% |
| bvh.mini.Freya 0.55 | 25 | 84% |
| bts.mega.Gnarly 1.4 | 18 | 72% |
| cs.Wren 1.0 | 14 | 100% |
| kdf.KoulDestroyer 1.0 | 10 | 80% |
| davidalves.net.DuelistNanoMelee 1.01 | 6 | 83% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 33% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 793. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 45 | 45% | 93 |
| bvh.mini.Freya 0.55 | 16 | 16% | 26 |
| kdf.KoulDestroyer 1.0 | 16 | 16% | 24 |
| bts.mega.Gnarly 1.4 | 11 | 11% | 32 |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 4% | 9 |
| cs.Wren 1.0 | 3 | 3% | 14 |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 3% | 8 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 2 |
| bzdp.BoxCar 2.0 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 140882 melee ticks, 37355 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 62 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 46478 sent, 41136 reached their opponent, 8545 virtual hits (20.8% of those reached).

## Melee bench: F39

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 828 over 6 battles (138.0 per battle, most in one battle 232). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 85.6 | 95 / 210 | 2.30 | 18.1% | 30178 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 18.1% | 95 |
| bvh.fry.Freya 0.82 | 2.0 | 14.8% | 28 |
| az.Ololobot 0.2.4 | 3.2 | 13.0% | 54 |
| catcat20.Lambda 0.024 | 3.8 | 11.8% | 27 |
| winamp32.micro.MicroMacro 1.0 | 5.0 | 8.9% | 4 |
| gimp.GimpBot 0.1 | 6.8 | 7.8% | 0 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 7.8% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 7.5 | 7.2% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.5% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 88.3 | 16 / 35 | 4847 |
| 2 | 1 | 68.9 | 89.5 | 17 / 35 | 5328 |
| 3 | 1 | 67.9 | 85.7 | 16 / 35 | 5226 |
| 4 | 1 | 66.8 | 84.1 | 15 / 35 | 4896 |
| 5 | 1 | 67.5 | 87.0 | 16 / 35 | 4822 |
| 6 | 1 | 65.9 | 78.7 | 15 / 35 | 5059 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 52 | 79% |
| az.Ololobot 0.2.4 | 43 | 44% |
| catcat20.Lambda 0.024 | 38 | 61% |
| stelo.SoRobotNanoMelee 1.2 | 5 | 80% |
| gimp.GimpBot 0.1 | 5 | 100% |
| winamp32.micro.MicroMacro 1.0 | 3 | 67% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 1013. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 38 | 31% | 59 |
| bvh.fry.Freya 0.82 | 34 | 28% | 69 |
| catcat20.Lambda 0.024 | 24 | 20% | 39 |
| apollokidd.ApolloKidd 0.9 | 6 | 5% | 11 |
| winamp32.micro.MicroMacro 1.0 | 4 | 3% | 11 |
| dcs.Eater_of_Worlds 1.1.3-A | 4 | 3% | 5 |
| stelo.SoRobotNanoMelee 1.2 | 3 | 2% | 7 |
| gimp.GimpBot 0.1 | 1 | 1% | 6 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 3 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 163586 melee ticks, 47578 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 322 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 141 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 51727 sent, 46686 reached their opponent, 7862 virtual hits (16.8% of those reached).

## Melee bench: F40

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 316 over 6 battles (52.7 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 88.6 | 125 / 210 | 2.03 | 19.6% | 31502 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 19.6% | 125 |
| kawigi.mini.Coriantumr 1.1 | 2.3 | 14.3% | 31 |
| kano.gamma.KanoGamma 1.8 | 2.8 | 13.1% | 23 |
| mz.AntiGrav 1.0 | 4.2 | 11.4% | 13 |
| Polkwane.SmashMelee 1.0 | 4.8 | 10.5% | 10 |
| stelo.Randomness 1.0 | 6.2 | 9.0% | 6 |
| alpha.BlackIce 1.0 | 6.7 | 8.6% | 2 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.1% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 4.1% | 0 |
| sample.Corners 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 93.3 | 25 / 35 | 5757 |
| 2 | 1 | 69.1 | 84.4 | 20 / 35 | 5145 |
| 3 | 1 | 69.1 | 86.0 | 17 / 35 | 5117 |
| 4 | 1 | 70.1 | 89.8 | 22 / 35 | 5023 |
| 5 | 1 | 70.5 | 90.8 | 21 / 35 | 5524 |
| 6 | 1 | 69.2 | 87.0 | 20 / 35 | 4936 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 55 | 75% |
| kano.gamma.KanoGamma 1.8 | 45 | 76% |
| mz.AntiGrav 1.0 | 23 | 91% |
| stelo.Randomness 1.0 | 13 | 85% |
| Polkwane.SmashMelee 1.0 | 11 | 82% |
| alpha.BlackIce 1.0 | 5 | 100% |
| amk.superstrike.SuperStrike 0.3 | 2 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 871. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 29 | 33% | 56 |
| kano.gamma.KanoGamma 1.8 | 25 | 28% | 60 |
| mz.AntiGrav 1.0 | 12 | 14% | 28 |
| Polkwane.SmashMelee 1.0 | 9 | 10% | 19 |
| stelo.Randomness 1.0 | 5 | 6% | 22 |
| alpha.BlackIce 1.0 | 4 | 5% | 9 |
| amk.superstrike.SuperStrike 0.3 | 2 | 2% | 7 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 6 |
| sample.Corners 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 149726 melee ticks, 39026 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 198 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 198 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 49589 sent, 44496 reached their opponent, 9538 virtual hits (21.4% of those reached).

## Melee bench: F41

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 189 over 6 battles (31.5 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 87.5 | 115 / 210 | 2.13 | 18.6% | 27678 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 18.6% | 115 |
| eem.EvBotNG v12.8 | 2.0 | 15.6% | 61 |
| ary.Swarm 1.1 | 3.3 | 13.2% | 14 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.7% | 12 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 10.4% | 7 |
| shrub.Silver v048 | 6.2 | 8.8% | 1 |
| zyx.nano.Ant 1.1 | 6.8 | 7.6% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 5.6% | 1 |
| stelo.Mirror 1.1 | 8.5 | 5.4% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 89.5 | 20 / 35 | 4730 |
| 2 | 1 | 68.2 | 85.1 | 18 / 35 | 4538 |
| 3 | 1 | 67.8 | 84.1 | 17 / 35 | 4468 |
| 4 | 1 | 69.3 | 88.9 | 20 / 35 | 4596 |
| 5 | 1 | 68.5 | 87.3 | 20 / 35 | 4377 |
| 6 | 1 | 69.8 | 89.8 | 20 / 35 | 4969 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 76 | 61% |
| ary.Swarm 1.1 | 32 | 81% |
| lessonz.robocode.Oz 0.5.0 | 27 | 93% |
| simonton.nano.MeleeSeed 1.8 | 12 | 92% |
| stelo.Mirror 1.1 | 3 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| shrub.Silver v048 | 1 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 49 | 51% | 92 |
| ary.Swarm 1.1 | 22 | 23% | 39 |
| lessonz.robocode.Oz 0.5.0 | 11 | 11% | 28 |
| simonton.nano.MeleeSeed 1.8 | 8 | 8% | 24 |
| jsal.Jsalbot 1.0 | 2 | 2% | 6 |
| zyx.nano.Ant 1.1 | 2 | 2% | 5 |
| acogdev.alpha 0.2 | 1 | 1% | 2 |
| stelo.Mirror 1.1 | 0 | 0% | 6 |
| shrub.Silver v048 | 0 | 0% | 6 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 154339 melee ticks, 47395 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 64 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 50420 sent, 45291 reached their opponent, 6897 virtual hits (15.2% of those reached).

## Melee bench: F42

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 566 over 6 battles (94.3 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 87.1 | 122 / 210 | 2.16 | 19.1% | 33440 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 19.1% | 122 |
| wompi.Wallaby 5.1 | 2.0 | 15.4% | 48 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.4% | 16 |
| ara.Shera 0.88 | 3.7 | 13.3% | 20 |
| amz.NanoClone 1.41 | 5.0 | 9.5% | 0 |
| dsw.StaticD 1.0 | 6.3 | 7.2% | 5 |
| maribo.IotaCT 1.1 | 7.3 | 6.4% | 0 |
| stelo.MirrorMicro 1.0 | 7.8 | 5.7% | 0 |
| mme.NikeEnhanced 2.0 | 8.5 | 5.4% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 87.6 | 20 / 35 | 5527 |
| 2 | 1 | 68.5 | 83.2 | 20 / 35 | 5718 |
| 3 | 1 | 68.7 | 85.1 | 18 / 35 | 5522 |
| 4 | 1 | 69.5 | 88.3 | 20 / 35 | 5480 |
| 5 | 1 | 69.8 | 89.8 | 22 / 35 | 5403 |
| 6 | 1 | 70.1 | 88.9 | 22 / 35 | 5790 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 66 | 86% |
| maribo.mini.MiniQuester 0.1 | 48 | 88% |
| ara.Shera 0.88 | 23 | 78% |
| dsw.StaticD 1.0 | 3 | 67% |
| amz.NanoClone 1.41 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 889. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 36 | 38% | 99 |
| ara.Shera 0.88 | 23 | 24% | 38 |
| maribo.mini.MiniQuester 0.1 | 20 | 21% | 52 |
| dsw.StaticD 1.0 | 5 | 5% | 8 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 4 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 3 |
| amz.NanoClone 1.41 | 1 | 1% | 2 |
| maribo.IotaCT 1.1 | 1 | 1% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 159730 melee ticks, 47903 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 63 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 50670 sent, 45742 reached their opponent, 9023 virtual hits (19.7% of those reached).

## Melee bench: F43

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 698 over 6 battles (116.3 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 79.2 | 40 / 210 | 2.87 | 15.7% | 24131 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.3% | 132 |
| hadur117.Hadur 3.20fv | 2.0 | 15.7% | 40 |
| brainfade.melee.Dusk 0.44 | 3.2 | 13.2% | 27 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.4% | 8 |
| wcsv.melee.EngineerMelee 0.1 | 5.3 | 10.5% | 2 |
| Krabb.akim2.Akim2 1.1b | 5.7 | 9.9% | 2 |
| mz.NanoGod 2.02 | 7.3 | 7.7% | 0 |
| jab.DiamondStealer 5 | 7.7 | 7.4% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.4% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 76.5 | 4 / 35 | 3802 |
| 2 | 2 | 66.0 | 81.6 | 6 / 35 | 3811 |
| 3 | 2 | 65.5 | 78.1 | 7 / 35 | 3982 |
| 4 | 2 | 65.1 | 76.8 | 5 / 35 | 4132 |
| 5 | 2 | 65.7 | 80.0 | 5 / 35 | 4001 |
| 6 | 2 | 67.8 | 82.2 | 13 / 35 | 4403 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 76 | 25% |
| brainfade.melee.Dusk 0.44 | 16 | 56% |
| dummy.micro.Sparrow 2.5 | 11 | 64% |
| Krabb.akim2.Akim2 1.1b | 3 | 67% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 67% |
| cvt.Firsty 1.0 | 1 | 100% |

Hadur died in 177 of 210 rounds, at a mean tick of 952. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 100 | 56% | 118 |
| brainfade.melee.Dusk 0.44 | 27 | 15% | 37 |
| dummy.micro.Sparrow 2.5 | 19 | 11% | 24 |
| wcsv.melee.EngineerMelee 0.1 | 12 | 7% | 15 |
| Krabb.akim2.Akim2 1.1b | 5 | 3% | 7 |
| mz.NanoGod 2.02 | 4 | 2% | 4 |
| jab.DiamondStealer 5 | 2 | 1% | 3 |
| cvt.Firsty 1.0 | 1 | 1% | 2 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 157051 melee ticks, 43243 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 79 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 50038 sent, 44850 reached their opponent, 7372 virtual hits (16.4% of those reached).

## Melee bench: F44

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 319 over 6 battles (53.2 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 91.3 | 141 / 210 | 1.78 | 20.5% | 34252 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 20.5% | 141 |
| stelo.Liblix 0.3.1 | 2.3 | 15.1% | 47 |
| tzu.TheArtOfWar 1.2 | 2.7 | 13.9% | 14 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.3 | 9.9% | 2 |
| jwirde.Gort 2.0 | 4.8 | 9.3% | 4 |
| disan.Chair 2.2.0 | 6.5 | 7.5% | 2 |
| wompi.Quokka 1.6 | 7.0 | 7.2% | 0 |
| stf.PanzerGeneral 0.1 | 7.5 | 6.9% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.8% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 88.6 | 21 / 35 | 5476 |
| 2 | 1 | 71.0 | 91.7 | 26 / 35 | 5623 |
| 3 | 1 | 70.8 | 92.4 | 22 / 35 | 5736 |
| 4 | 1 | 70.6 | 91.1 | 23 / 35 | 5471 |
| 5 | 1 | 71.9 | 94.0 | 27 / 35 | 6006 |
| 6 | 1 | 71.0 | 90.2 | 22 / 35 | 5940 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 79 | 68% |
| tzu.TheArtOfWar 1.2 | 59 | 90% |
| jwirde.Gort 2.0 | 12 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 11 | 91% |
| disan.Chair 2.2.0 | 5 | 60% |
| stf.PanzerGeneral 0.1 | 4 | 100% |
| amk.jointstrike.JointStrike 0.2 | 2 | 100% |
| sample.Crazy 1.0 | 2 | 100% |
| wompi.Quokka 1.6 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 36 | 51% | 95 |
| tzu.TheArtOfWar 1.2 | 16 | 23% | 52 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 7% | 21 |
| jwirde.Gort 2.0 | 3 | 4% | 19 |
| wompi.Quokka 1.6 | 3 | 4% | 4 |
| disan.Chair 2.2.0 | 3 | 4% | 4 |
| stf.PanzerGeneral 0.1 | 2 | 3% | 7 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 4 |
| sample.Crazy 1.0 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 155774 melee ticks, 45647 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 65 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 53108 sent, 48142 reached their opponent, 9925 virtual hits (20.6% of those reached).

## Melee bench: F45

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 672 over 6 battles (112.0 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 88.3 | 108 / 210 | 2.06 | 19.8% | 33037 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20fv | 1.0 | 19.8% | 108 |
| jje.BagPuss 1.2 | 2.2 | 13.1% | 20 |
| sul.Lunar 1.1 | 4.2 | 10.8% | 8 |
| eem.IWillFireNoBullet v2.8 | 4.2 | 10.1% | 60 |
| myl.nano.Graviton 1.10 | 4.3 | 11.2% | 9 |
| pez.mini.ChironexFleckeri 0.5 | 6.5 | 8.7% | 4 |
| hvilela.HVilela 0.9 | 6.7 | 8.3% | 0 |
| fm.claire 1.7 | 7.3 | 8.0% | 1 |
| wit.Deep7 2.0 | 9.2 | 5.4% | 2 |
| abud.ThirdRobo 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 83.5 | 13 / 35 | 5486 |
| 2 | 1 | 70.1 | 88.3 | 18 / 35 | 5900 |
| 3 | 1 | 70.8 | 91.4 | 22 / 35 | 5746 |
| 4 | 1 | 71.1 | 90.2 | 23 / 35 | 4880 |
| 5 | 1 | 69.0 | 86.7 | 15 / 35 | 5579 |
| 6 | 1 | 69.7 | 89.5 | 17 / 35 | 5446 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 78 | 50% |
| jje.BagPuss 1.2 | 32 | 69% |
| sul.Lunar 1.1 | 20 | 90% |
| myl.nano.Graviton 1.10 | 14 | 64% |
| pez.mini.ChironexFleckeri 0.5 | 11 | 91% |
| wit.Deep7 2.0 | 6 | 100% |
| fm.claire 1.7 | 3 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 1441. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 40 | 36% | 0 |
| jje.BagPuss 1.2 | 24 | 22% | 62 |
| myl.nano.Graviton 1.10 | 14 | 13% | 32 |
| sul.Lunar 1.1 | 11 | 10% | 52 |
| fm.claire 1.7 | 5 | 5% | 11 |
| pez.mini.ChironexFleckeri 0.5 | 4 | 4% | 23 |
| hvilela.HVilela 0.9 | 4 | 4% | 16 |
| wit.Deep7 2.0 | 1 | 1% | 8 |
| abud.ThirdRobo 1.0 | 0 | 0% | 3 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 184729 melee ticks, 94091 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 73 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 57457 sent, 52657 reached their opponent, 7833 virtual hits (14.9% of those reached).

## Melee bench: F46

hadur117.Hadur 3.20fv against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 379 over 6 battles (63.2 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 80.2 | 60 / 210 | 2.78 | 16.0% | 24797 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.7 | 16.7% | 55 |
| rsalesc.melee.Medina 0.4.5 | 1.7 | 16.9% | 83 |
| hadur117.Hadur 3.20fv | 2.7 | 16.0% | 60 |
| mz.MicroSheep 1.0 | 4.0 | 10.7% | 1 |
| cx.Princess 1.0 | 5.2 | 9.9% | 9 |
| sadoner.killer 0.2 | 5.8 | 9.3% | 1 |
| arthord.NanoSatanMelee Beta | 7.2 | 6.7% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.3 | 5.5% | 0 |
| kurios.DOSexe .9a | 8.5 | 5.3% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.9 | 80.3 | 10 / 35 | 4251 |
| 2 | 1 | 66.9 | 82.9 | 15 / 35 | 4408 |
| 3 | 3 | 65.0 | 80.0 | 11 / 35 | 3981 |
| 4 | 3 | 65.3 | 81.0 | 8 / 35 | 4052 |
| 5 | 3 | 63.6 | 77.1 | 6 / 35 | 3956 |
| 6 | 3 | 65.0 | 80.0 | 10 / 35 | 4149 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 50 | 68% |
| rsalesc.melee.Medina 0.4.5 | 41 | 20% |
| mz.MicroSheep 1.0 | 8 | 100% |
| cx.Princess 1.0 | 7 | 86% |
| arthord.NanoSatanMelee Beta | 4 | 100% |

Hadur died in 153 of 210 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 59 | 39% | 93 |
| rsalesc.melee.Medina 0.4.5 | 54 | 35% | 67 |
| cx.Princess 1.0 | 10 | 7% | 12 |
| sadoner.killer 0.2 | 10 | 7% | 12 |
| mz.MicroSheep 1.0 | 8 | 5% | 15 |
| kurios.DOSexe .9a | 5 | 3% | 5 |
| arthord.NanoSatanMelee Beta | 2 | 1% | 4 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 150014 melee ticks, 33782 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 78 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 78 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 43761 sent, 38709 reached their opponent, 5777 virtual hits (14.9% of those reached).

