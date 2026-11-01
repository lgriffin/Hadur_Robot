# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 267 over 6 battles (44.5 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 87.5 | 54 / 210 | 2.12 | 17.7% | 31611 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.2 | 20.0% | 139 |
| hadur117.Hadur 3.20ed | 1.8 | 17.7% | 54 |
| sgp.JollyNinja 3.53 | 3.2 | 10.9% | 13 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 10.8% | 1 |
| lorneswork.Predator 1.0 | 5.2 | 10.1% | 1 |
| mz.MicroGodMelee 1 | 5.7 | 9.4% | 1 |
| adt.Ar2 1.0 | 7.0 | 8.1% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.6% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 90.8 | 16 / 35 | 5680 |
| 2 | 2 | 66.5 | 85.4 | 5 / 35 | 4997 |
| 3 | 2 | 68.6 | 90.2 | 15 / 35 | 5113 |
| 4 | 2 | 68.5 | 88.9 | 8 / 35 | 5603 |
| 5 | 2 | 66.4 | 83.8 | 6 / 35 | 4979 |
| 6 | 2 | 67.1 | 86.0 | 4 / 35 | 5239 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 129 | 12% |
| sgp.JollyNinja 3.53 | 27 | 67% |
| lorneswork.Predator 1.0 | 7 | 100% |
| mz.MicroGodMelee 1 | 6 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 4 | 100% |
| adt.Ar2 1.0 | 2 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 1243. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 121 | 77% | 143 |
| sgp.JollyNinja 3.53 | 16 | 10% | 27 |
| lorneswork.Predator 1.0 | 9 | 6% | 16 |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 4% | 10 |
| adt.Ar2 1.0 | 2 | 1% | 6 |
| mz.MicroGodMelee 1 | 1 | 1% | 7 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 141290 melee ticks, 101706 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 48 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 44580 sent, 39793 reached their opponent, 7830 virtual hits (19.7% of those reached).

## Melee bench: F02

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 245 over 6 battles (40.8 per battle, most in one battle 49). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 86.2 | 101 / 210 | 2.24 | 18.6% | 30376 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 18.6% | 101 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 14.2% | 47 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.6% | 32 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.3% | 0 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 9.8% | 6 |
| fnc.bandit.Bandit 5.2.0 | 6.7 | 8.0% | 2 |
| sch.Simone 0.3d | 7.2 | 7.5% | 7 |
| Noran.BitchingElk 0.054 | 7.2 | 7.8% | 12 |
| stelo.PatternRobot 1.0 | 9.2 | 5.2% | 3 |
| fullsail.SweetTea 1.1 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 83.2 | 12 / 35 | 4998 |
| 2 | 1 | 68.1 | 84.8 | 16 / 35 | 5092 |
| 3 | 1 | 69.3 | 88.6 | 19 / 35 | 5109 |
| 4 | 1 | 68.5 | 86.7 | 16 / 35 | 5042 |
| 5 | 1 | 68.3 | 85.7 | 19 / 35 | 4902 |
| 6 | 1 | 69.0 | 88.6 | 19 / 35 | 5233 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 58 | 52% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 41 | 63% |
| com.cohesiva.robocode.ManOwaR 1.0 | 16 | 81% |
| sch.Simone 0.3d | 12 | 83% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 100% |
| Noran.BitchingElk 0.054 | 10 | 40% |
| fnc.bandit.Bandit 5.2.0 | 5 | 60% |
| stelo.PatternRobot 1.0 | 3 | 67% |
| fullsail.SweetTea 1.1 | 2 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 978. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 40 | 37% | 61 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 17 | 16% | 45 |
| com.cohesiva.robocode.ManOwaR 1.0 | 15 | 14% | 33 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 9% | 18 |
| sch.Simone 0.3d | 8 | 7% | 19 |
| Noran.BitchingElk 0.054 | 8 | 7% | 15 |
| stelo.PatternRobot 1.0 | 6 | 6% | 8 |
| fnc.bandit.Bandit 5.2.0 | 4 | 4% | 8 |
| fullsail.SweetTea 1.1 | 1 | 1% | 3 |

Posture (Hadur's M records, 206 rounds): 169885 melee ticks, 48753 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 258 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 239 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 3.

Targeting waves (206 rounds): 59623 sent, 54777 reached their opponent, 9488 virtual hits (17.3% of those reached).

## Melee bench: F03

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 128 over 6 battles (21.3 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 92.2 | 169 / 210 | 1.70 | 20.9% | 38546 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 20.9% | 169 |
| radnor.DoctorBob 1.42 | 2.3 | 13.8% | 12 |
| kawigi.nano.Lib 1.0 | 3.0 | 13.1% | 17 |
| vuen.Cake 2.51 | 3.7 | 12.0% | 11 |
| urdos.URDOS 1.3 | 5.0 | 9.5% | 2 |
| adt.Ar1 2.1 | 6.3 | 7.7% | 0 |
| oa.weak.FlyMk1 0.1 | 7.2 | 6.7% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.7 | 6.4% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.3 | 4.9% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 94.0 | 28 / 35 | 6258 |
| 2 | 1 | 70.9 | 92.4 | 27 / 35 | 6196 |
| 3 | 1 | 72.9 | 98.1 | 32 / 35 | 6689 |
| 4 | 1 | 69.6 | 85.7 | 24 / 35 | 6308 |
| 5 | 1 | 71.0 | 90.2 | 28 / 35 | 6409 |
| 6 | 1 | 71.6 | 92.7 | 30 / 35 | 6686 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 68 | 96% |
| radnor.DoctorBob 1.42 | 63 | 94% |
| kawigi.nano.Lib 1.0 | 40 | 95% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| urdos.URDOS 1.3 | 2 | 50% |
| adt.Ar1 2.1 | 1 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 11 | 27% | 64 |
| kawigi.nano.Lib 1.0 | 7 | 17% | 37 |
| bwbaugh.nano.Tirunculus 0.0.0a | 7 | 17% | 9 |
| urdos.URDOS 1.3 | 6 | 15% | 11 |
| vuen.Cake 2.51 | 5 | 12% | 60 |
| adt.Ar1 2.1 | 2 | 5% | 10 |
| oa.weak.FlyMk1 0.1 | 2 | 5% | 8 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 200 rounds): 126376 melee ticks, 41564 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 57 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 38073 sent, 33492 reached their opponent, 8654 virtual hits (25.8% of those reached).

## Melee bench: F04

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 227 over 6 battles (37.8 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 87.6 | 34 / 210 | 2.12 | 18.2% | 35291 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.3% | 162 |
| hadur117.Hadur 3.20ed | 2.0 | 18.2% | 34 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.2% | 5 |
| TNT.TNT 0.99.1 | 4.0 | 11.1% | 8 |
| josago.Jorgito 0.16 | 5.0 | 9.4% | 0 |
| css.Delitioner 0.11 | 6.2 | 7.0% | 0 |
| tj.zombie1n 1.0.1 | 7.3 | 6.0% | 0 |
| rampancy.Durandal 2.1d | 7.5 | 5.7% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.4% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.7 | 88.3 | 7 / 35 | 6159 |
| 2 | 2 | 70.0 | 89.5 | 8 / 35 | 5920 |
| 3 | 2 | 69.1 | 87.3 | 5 / 35 | 5760 |
| 4 | 2 | 69.1 | 87.0 | 6 / 35 | 6036 |
| 5 | 2 | 67.1 | 84.1 | 1 / 35 | 5294 |
| 6 | 2 | 69.8 | 89.2 | 7 / 35 | 6122 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 135 | 11% |
| TNT.TNT 0.99.1 | 16 | 50% |
| apc.LeeroyJenkins2 1.0 | 8 | 75% |
| josago.Jorgito 0.16 | 3 | 100% |
| css.Delitioner 0.11 | 2 | 100% |
| spin.Bugstard 0.012b | 1 | 0% |

Hadur died in 177 of 210 rounds, at a mean tick of 1365. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 134 | 76% | 150 |
| apc.LeeroyJenkins2 1.0 | 17 | 10% | 23 |
| TNT.TNT 0.99.1 | 14 | 8% | 21 |
| josago.Jorgito 0.16 | 5 | 3% | 8 |
| css.Delitioner 0.11 | 4 | 2% | 7 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |
| spin.Bugstard 0.012b | 1 | 1% | 0 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 193795 melee ticks, 80736 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 56 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 58629 sent, 53920 reached their opponent, 8025 virtual hits (14.9% of those reached).

## Melee bench: F05

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 438 over 6 battles (73.0 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 79.9 | 30 / 210 | 2.80 | 15.5% | 24556 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 18.0% | 104 |
| justin.DemonicRage 3.4 | 2.0 | 16.7% | 54 |
| hadur117.Hadur 3.20ed | 2.8 | 15.5% | 30 |
| wompi.Numbat 2.1 | 4.0 | 12.8% | 13 |
| ms.Ares 0.19 | 5.3 | 9.3% | 2 |
| axeBots.HataMoto 3.09 | 5.7 | 9.2% | 7 |
| supersample.SuperBoxBot 1.0 | 7.3 | 5.7% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.4% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.2 | 3.7% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.7 | 84.1 | 10 / 35 | 4224 |
| 2 | 3 | 64.9 | 80.3 | 4 / 35 | 4220 |
| 3 | 3 | 65.1 | 81.0 | 5 / 35 | 3965 |
| 4 | 3 | 64.8 | 81.6 | 2 / 35 | 3969 |
| 5 | 3 | 63.1 | 74.3 | 3 / 35 | 4045 |
| 6 | 3 | 64.9 | 78.4 | 6 / 35 | 4133 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 47 | 9% |
| justin.DemonicRage 3.4 | 42 | 36% |
| wompi.Numbat 2.1 | 15 | 67% |
| axeBots.HataMoto 3.09 | 4 | 25% |

Hadur died in 183 of 210 rounds, at a mean tick of 990. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 73 | 40% | 79 |
| justin.DemonicRage 3.4 | 54 | 30% | 66 |
| wompi.Numbat 2.1 | 31 | 17% | 40 |
| axeBots.HataMoto 3.09 | 11 | 6% | 14 |
| ms.Ares 0.19 | 8 | 4% | 8 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 161824 melee ticks, 44897 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 63 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 48948 sent, 44002 reached their opponent, 7323 virtual hits (16.6% of those reached).

## Melee bench: F06

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 203 over 6 battles (33.8 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 92.6 | 144 / 210 | 1.66 | 20.6% | 34046 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 20.6% | 144 |
| jekl.StoneGhost 0.7 | 2.2 | 14.5% | 25 |
| origin.SleepSiphon 1.7b | 2.8 | 14.1% | 25 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 11.0% | 9 |
| mld.Wisdom 1.0 | 5.2 | 9.8% | 2 |
| gg.Wolverine 2.0 | 5.8 | 9.1% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 6.4% | 3 |
| DBall.NUKE 0.1 | 8.0 | 6.0% | 1 |
| spinnercat.Omen 1.0 | 8.5 | 5.8% | 0 |
| sample.Fire 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 94.6 | 23 / 35 | 5700 |
| 2 | 1 | 70.4 | 91.1 | 23 / 35 | 5314 |
| 3 | 1 | 71.5 | 92.7 | 27 / 35 | 5509 |
| 4 | 1 | 71.4 | 94.0 | 26 / 35 | 5789 |
| 5 | 1 | 71.2 | 91.4 | 21 / 35 | 6082 |
| 6 | 1 | 71.1 | 92.1 | 24 / 35 | 5652 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 63 | 83% |
| jekl.StoneGhost 0.7 | 56 | 88% |
| pe.minimelee.SandboxMiniMelee 1.1 | 29 | 86% |
| gg.Wolverine 2.0 | 9 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 50% |
| mld.Wisdom 1.0 | 4 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 934. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 21 | 31% | 76 |
| jekl.StoneGhost 0.7 | 21 | 31% | 59 |
| pe.minimelee.SandboxMiniMelee 1.1 | 12 | 18% | 36 |
| gg.Wolverine 2.0 | 5 | 7% | 10 |
| mld.Wisdom 1.0 | 4 | 6% | 16 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 4% | 11 |
| DBall.NUKE 0.1 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 149603 melee ticks, 48929 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 48 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 3.

Targeting waves (202 rounds): 45783 sent, 41166 reached their opponent, 8792 virtual hits (21.4% of those reached).

## Melee bench: F07

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 330 over 6 battles (55.0 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 93.9 | 125 / 210 | 1.55 | 21.2% | 40421 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 21.2% | 125 |
| rtk.Tachikoma 1.0 | 2.3 | 16.6% | 33 |
| rsalesc.melee.Monk 0.3.6c | 2.7 | 16.3% | 38 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.7% | 10 |
| franzor.Lizt 1.3.1 | 5.0 | 10.3% | 4 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.1% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.5% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.4% | 0 |
| sample.Target 1.0 | 9.2 | 2.2% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 94.6 | 21 / 35 | 6435 |
| 2 | 1 | 72.2 | 91.4 | 17 / 35 | 6471 |
| 3 | 1 | 73.1 | 94.6 | 22 / 35 | 6686 |
| 4 | 1 | 73.6 | 95.2 | 21 / 35 | 7263 |
| 5 | 1 | 73.5 | 94.9 | 24 / 35 | 6885 |
| 6 | 1 | 72.8 | 92.4 | 20 / 35 | 6681 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 91 | 71% |
| rsalesc.melee.Monk 0.3.6c | 47 | 32% |
| oog.melee.CapuletDroid 1.1 | 29 | 76% |
| franzor.Lizt 1.3.1 | 23 | 91% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 1455. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 38 | 44% | 61 |
| rtk.Tachikoma 1.0 | 33 | 38% | 103 |
| oog.melee.CapuletDroid 1.1 | 9 | 10% | 34 |
| franzor.Lizt 1.3.1 | 5 | 6% | 3 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 5 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 2 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 190378 melee ticks, 84441 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 55 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 2.

Targeting waves (201 rounds): 56095 sent, 51422 reached their opponent, 10298 virtual hits (20.0% of those reached).

## Melee bench: F08

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 494 over 6 battles (82.3 per battle, most in one battle 161). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 95.0 | 151 / 210 | 1.45 | 20.7% | 31476 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 20.7% | 151 |
| tm.Yuugao 1.0 | 2.3 | 13.1% | 23 |
| shrub.Vapour v159 | 2.7 | 12.8% | 17 |
| Krabb.sliNk.Garm 0.9u | 4.5 | 10.5% | 14 |
| com.spp.robocode.MostlyHarmless 010 | 5.3 | 9.6% | 3 |
| m3thos.Eva00 1.1 | 5.8 | 9.0% | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 6.3 | 8.3% | 2 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 6.4% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 4.8% | 0 |
| SHAM.WOW 1.4 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 96.5 | 28 / 35 | 5325 |
| 2 | 1 | 72.2 | 96.8 | 28 / 35 | 5917 |
| 3 | 1 | 70.1 | 94.0 | 22 / 35 | 5090 |
| 4 | 1 | 70.2 | 94.6 | 24 / 35 | 4980 |
| 5 | 1 | 70.5 | 93.7 | 22 / 35 | 5158 |
| 6 | 1 | 70.6 | 94.6 | 27 / 35 | 5006 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 59 | 71% |
| shrub.Vapour v159 | 40 | 75% |
| com.spp.robocode.MostlyHarmless 010 | 26 | 100% |
| Krabb.sliNk.Garm 0.9u | 26 | 65% |
| m3thos.Eva00 1.1 | 20 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 16 | 94% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 1017. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 22 | 35% | 70 |
| shrub.Vapour v159 | 15 | 24% | 45 |
| Krabb.sliNk.Garm 0.9u | 15 | 24% | 28 |
| com.spp.robocode.MostlyHarmless 010 | 4 | 6% | 19 |
| jwst.DAD.DarkAndDarker 1.1 | 3 | 5% | 20 |
| zyx.nano.BacillusComma 1.0 | 1 | 2% | 5 |
| m3thos.Eva00 1.1 | 0 | 0% | 18 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 2 |
| SHAM.WOW 1.4 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 150315 melee ticks, 48627 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 51 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 48775 sent, 43840 reached their opponent, 7985 virtual hits (18.2% of those reached).

## Melee bench: F09

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 360 over 6 battles (60.0 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 78.0 | 56 / 210 | 2.98 | 15.7% | 22902 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.8% | 105 |
| hadur117.Hadur 3.20ed | 1.8 | 15.7% | 56 |
| kc.micro.Figment 1.0 | 3.0 | 14.3% | 25 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.3% | 13 |
| yagami.Tidus 0.11 | 4.7 | 10.9% | 0 |
| mc2.enemy.Original 0.9 | 5.7 | 9.1% | 10 |
| dft.Calliope 5.6 | 7.0 | 7.6% | 2 |
| step.nanoPri 1.0 | 8.2 | 5.3% | 0 |
| rdm.Dueler 0.4x | 9.2 | 4.6% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 73.0 | 7 / 35 | 3687 |
| 2 | 1 | 65.5 | 80.6 | 12 / 35 | 3894 |
| 3 | 2 | 64.1 | 77.8 | 10 / 35 | 3806 |
| 4 | 2 | 64.7 | 78.1 | 9 / 35 | 3954 |
| 5 | 2 | 64.4 | 78.7 | 7 / 35 | 3640 |
| 6 | 2 | 65.7 | 80.0 | 11 / 35 | 3921 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 58 | 22% |
| kc.micro.Figment 1.0 | 33 | 73% |
| pedersen.Grishnakh 1.0 | 9 | 44% |
| mc2.enemy.Original 0.9 | 8 | 63% |
| yagami.Tidus 0.11 | 6 | 100% |
| dft.Calliope 5.6 | 4 | 75% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 900. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 66 | 42% | 79 |
| kc.micro.Figment 1.0 | 23 | 15% | 46 |
| yagami.Tidus 0.11 | 20 | 13% | 25 |
| mc2.enemy.Original 0.9 | 14 | 9% | 20 |
| pedersen.Grishnakh 1.0 | 14 | 9% | 17 |
| dft.Calliope 5.6 | 6 | 4% | 10 |
| robar.nano.Assertive_Melee 0.2 | 6 | 4% | 7 |
| step.nanoPri 1.0 | 4 | 3% | 4 |
| rdm.Dueler 0.4x | 1 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 150459 melee ticks, 41503 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 210 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 31 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 48549 sent, 43831 reached their opponent, 6204 virtual hits (14.2% of those reached).

## Melee bench: F10

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 281 over 6 battles (46.8 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 95.1 | 171 / 210 | 1.44 | 20.8% | 34481 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 20.8% | 171 |
| DTF.Kludgy 1.2b | 2.0 | 14.6% | 19 |
| ne.Chimera 1.2 | 3.0 | 13.2% | 9 |
| ejb.Polaris 1.0.1 | 4.2 | 12.4% | 5 |
| vStar.RAFzilla 2.15 | 5.0 | 10.3% | 2 |
| tvv.micro.Antares 1.1.1 | 5.8 | 9.6% | 3 |
| kurios.DOSexe .9b | 7.7 | 5.2% | 1 |
| sam.Samspin 1.0 | 7.8 | 5.1% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 9.0 | 4.5% | 0 |
| donjezza.Muncho 1.0 | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 95.9 | 31 / 35 | 6165 |
| 2 | 1 | 71.7 | 95.9 | 28 / 35 | 5814 |
| 3 | 1 | 71.8 | 97.8 | 29 / 35 | 5654 |
| 4 | 1 | 72.6 | 97.1 | 30 / 35 | 6129 |
| 5 | 1 | 70.6 | 94.6 | 28 / 35 | 5123 |
| 6 | 1 | 70.0 | 89.2 | 25 / 35 | 5596 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 77 | 86% |
| ejb.Polaris 1.0.1 | 44 | 95% |
| ne.Chimera 1.2 | 39 | 90% |
| vStar.RAFzilla 2.15 | 18 | 94% |
| tvv.micro.Antares 1.1.1 | 7 | 100% |
| kurios.DOSexe .9b | 2 | 50% |
| sam.Samspin 1.0 | 1 | 100% |
| donjezza.Muncho 1.0 | 1 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 16 | 40% | 79 |
| ejb.Polaris 1.0.1 | 9 | 23% | 54 |
| ne.Chimera 1.2 | 6 | 15% | 40 |
| vStar.RAFzilla 2.15 | 3 | 8% | 20 |
| sam.Samspin 1.0 | 2 | 5% | 2 |
| tvv.micro.Antares 1.1.1 | 1 | 3% | 6 |
| kurios.DOSexe .9b | 1 | 3% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 3% | 1 |
| donjezza.Muncho 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 141034 melee ticks, 55191 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 193 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 117 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 46027 sent, 41327 reached their opponent, 7922 virtual hits (19.2% of those reached).

## Melee bench: F11

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 384 over 6 battles (64.0 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 81.6 | 70 / 210 | 2.66 | 16.5% | 24065 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.3 | 17.0% | 79 |
| hadur117.Hadur 3.20ed | 1.7 | 16.5% | 70 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.9% | 23 |
| djc.DynaBot 0.1.1 | 4.3 | 10.2% | 12 |
| rdt199.Warlord 0.73 | 5.7 | 9.1% | 11 |
| br2.MobyDickBot 1.6 | 5.7 | 9.1% | 10 |
| uji.YellohFellah 1.0 | 6.8 | 8.0% | 6 |
| KiraNL.Chupacabra 0.4 | 7.5 | 7.2% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.3% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.6 | 76.8 | 7 / 35 | 4100 |
| 2 | 1 | 66.6 | 84.8 | 17 / 35 | 3969 |
| 3 | 2 | 63.5 | 75.2 | 11 / 35 | 3945 |
| 4 | 2 | 66.0 | 84.8 | 13 / 35 | 4073 |
| 5 | 1 | 65.5 | 83.5 | 12 / 35 | 3843 |
| 6 | 2 | 65.6 | 84.4 | 10 / 35 | 4135 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 66 | 44% |
| djc.DynaBot 0.1.1 | 17 | 71% |
| cx.mini.Nimrod 0.55 | 16 | 50% |
| rdt199.Warlord 0.73 | 11 | 73% |
| br2.MobyDickBot 1.6 | 9 | 67% |
| uji.YellohFellah 1.0 | 6 | 83% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 62 | 43% | 93 |
| cx.mini.Nimrod 0.55 | 32 | 22% | 41 |
| djc.DynaBot 0.1.1 | 17 | 12% | 26 |
| rdt199.Warlord 0.73 | 15 | 10% | 25 |
| br2.MobyDickBot 1.6 | 5 | 3% | 10 |
| uji.YellohFellah 1.0 | 4 | 3% | 9 |
| stelo.MirrorNano 1.3 | 3 | 2% | 3 |
| KiraNL.Chupacabra 0.4 | 2 | 1% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 157682 melee ticks, 34768 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 260 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 260 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 50412 sent, 45539 reached their opponent, 6204 virtual hits (13.6% of those reached).

## Melee bench: F12

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 152 over 6 battles (25.3 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 89.0 | 126 / 210 | 1.99 | 18.8% | 25578 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 18.8% | 126 |
| bts.wiki.RipCurl 0.9b | 2.7 | 13.5% | 26 |
| darkcanuck.Leon 1.01 | 3.0 | 12.9% | 18 |
| nat.PallasHawk 1.0 | 3.3 | 13.0% | 29 |
| brainfade.melee.Genghis 0.36 | 5.2 | 9.9% | 8 |
| jrm.Test0 1.0 | 5.8 | 8.3% | 1 |
| jp.Perpy 16.0 | 7.7 | 6.5% | 1 |
| cs.sheldor.Talon 1.1 | 7.7 | 6.5% | 1 |
| stuff.Vlad 0.1 | 9.0 | 5.4% | 0 |
| jaybot.bots.Oddball 4.0 | 9.7 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 88.6 | 21 / 35 | 4472 |
| 2 | 1 | 66.7 | 84.4 | 18 / 35 | 3876 |
| 3 | 1 | 70.9 | 95.2 | 28 / 35 | 4731 |
| 4 | 1 | 69.6 | 93.0 | 24 / 35 | 4091 |
| 5 | 1 | 67.8 | 87.9 | 19 / 35 | 4049 |
| 6 | 1 | 67.1 | 84.8 | 16 / 35 | 4359 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 55 | 84% |
| nat.PallasHawk 1.0 | 46 | 67% |
| darkcanuck.Leon 1.01 | 38 | 87% |
| brainfade.melee.Genghis 0.36 | 10 | 70% |
| cs.sheldor.Talon 1.1 | 5 | 80% |
| jp.Perpy 16.0 | 2 | 50% |
| jaybot.bots.Oddball 4.0 | 2 | 100% |
| jrm.Test0 1.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 29 | 34% | 59 |
| nat.PallasHawk 1.0 | 20 | 23% | 53 |
| darkcanuck.Leon 1.01 | 13 | 15% | 57 |
| jrm.Test0 1.0 | 11 | 13% | 17 |
| brainfade.melee.Genghis 0.36 | 10 | 12% | 14 |
| cs.sheldor.Talon 1.1 | 1 | 1% | 3 |
| stuff.Vlad 0.1 | 1 | 1% | 2 |
| jp.Perpy 16.0 | 1 | 1% | 1 |
| jaybot.bots.Oddball 4.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 205 rounds): 135588 melee ticks, 41547 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 39 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 45408 sent, 40459 reached their opponent, 7017 virtual hits (17.3% of those reached).

## Melee bench: F13

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 92 over 6 battles (15.3 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 78.8 | 51 / 210 | 2.90 | 15.5% | 24912 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.5 | 16.6% | 44 |
| mn.Combat 3.25.0 | 2.0 | 16.4% | 86 |
| hadur117.Hadur 3.20ed | 2.5 | 15.5% | 51 |
| shinh.Entangled 0.3 | 4.2 | 12.5% | 21 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.9% | 8 |
| apc.Colossus2 0.17 | 6.0 | 7.8% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.5% | 0 |
| maribo.FollowFire 1 | 8.5 | 4.9% | 0 |
| ayk.WallHugger 1.0 | 8.5 | 4.9% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 83.5 | 9 / 35 | 3932 |
| 2 | 2 | 65.2 | 82.5 | 7 / 35 | 4183 |
| 3 | 3 | 63.3 | 72.1 | 10 / 35 | 4137 |
| 4 | 3 | 63.5 | 75.6 | 8 / 35 | 4065 |
| 5 | 3 | 64.3 | 79.7 | 6 / 35 | 4161 |
| 6 | 2 | 65.5 | 79.7 | 11 / 35 | 4434 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 47 | 21% |
| ags.Glacier 0.2.11 | 40 | 70% |
| shinh.Entangled 0.3 | 20 | 40% |
| gh.micro.Gruweltje 0.7 | 6 | 50% |
| apc.Colossus2 0.17 | 1 | 100% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 56 | 35% | 71 |
| ags.Glacier 0.2.11 | 40 | 25% | 62 |
| shinh.Entangled 0.3 | 37 | 23% | 46 |
| gh.micro.Gruweltje 0.7 | 14 | 9% | 17 |
| stelo.Wang 1.0 | 5 | 3% | 7 |
| maribo.FollowFire 1 | 4 | 3% | 4 |
| apc.Colossus2 0.17 | 2 | 1% | 2 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 206 rounds): 144711 melee ticks, 40228 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 70 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 42903 sent, 37724 reached their opponent, 5988 virtual hits (15.9% of those reached).

## Melee bench: F14

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 135 over 6 battles (22.5 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 94.3 | 162 / 210 | 1.51 | 21.0% | 35691 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 21.0% | 162 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.3% | 17 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.1% | 24 |
| Lo_Ian.Gandalf_V4 4.0 | 5.2 | 9.4% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.2 | 9.6% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 5.5 | 9.0% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.8 | 8.5% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.7% | 5 |
| pa.Improved 1.0 | 9.0 | 5.9% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 92.4 | 26 / 35 | 5923 |
| 2 | 1 | 71.8 | 93.7 | 27 / 35 | 6015 |
| 3 | 1 | 71.5 | 93.0 | 23 / 35 | 6086 |
| 4 | 1 | 71.4 | 94.9 | 27 / 35 | 5820 |
| 5 | 1 | 71.9 | 95.2 | 29 / 35 | 6016 |
| 6 | 1 | 71.9 | 96.8 | 30 / 35 | 5831 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 93 | 94% |
| catcat20.shape.Theta 0.018 | 55 | 73% |
| sanyi.mikrobi.Roberto 1.0 | 19 | 89% |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 71% |
| co.edu.usb.rc.LidisTron 1.0 | 6 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 20 | 41% | 52 |
| simonton.micro.Sprout 1.1.3 | 13 | 27% | 92 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 12% | 17 |
| sanyi.mikrobi.Roberto 1.0 | 4 | 8% | 26 |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 8% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 5 |
| co.edu.usb.rc.LidisTron 1.0 | 0 | 0% | 8 |
| pa.Improved 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 136121 melee ticks, 54774 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 698 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 186 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 43386 sent, 38813 reached their opponent, 9478 virtual hits (24.4% of those reached).

## Melee bench: F15

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 142 over 6 battles (23.7 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.1 | 126 / 210 | 2.07 | 19.6% | 33002 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 19.6% | 126 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.0% | 15 |
| mld.DustBunny 3.8 | 3.2 | 12.5% | 4 |
| emp.Yngwie 1.11 | 3.3 | 12.4% | 38 |
| cb.nano.Insomnia 1.0 | 4.8 | 11.3% | 11 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.5% | 15 |
| Grystrion.TrackerWO 1.0 | 7.3 | 6.7% | 0 |
| lambdaxy.TBot 0.1 | 7.8 | 6.2% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 4.8% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 89.5 | 21 / 35 | 5730 |
| 2 | 1 | 69.3 | 86.7 | 22 / 35 | 5273 |
| 3 | 1 | 71.0 | 90.8 | 23 / 35 | 5862 |
| 4 | 1 | 70.2 | 88.6 | 21 / 35 | 5612 |
| 5 | 1 | 67.4 | 84.4 | 15 / 35 | 4830 |
| 6 | 1 | 70.2 | 88.6 | 24 / 35 | 5695 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 56 | 68% |
| kawigi.micro.Shiz 1.1 | 35 | 91% |
| mld.DustBunny 3.8 | 27 | 100% |
| kawigi.robot.Girl 1.2 | 19 | 74% |
| cb.nano.Insomnia 1.0 | 12 | 75% |
| Grystrion.TrackerWO 1.0 | 3 | 100% |
| divineomega.TrialBot 0.003 | 3 | 67% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 981. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 33 | 39% | 86 |
| kawigi.micro.Shiz 1.1 | 16 | 19% | 34 |
| cb.nano.Insomnia 1.0 | 16 | 19% | 20 |
| kawigi.robot.Girl 1.2 | 11 | 13% | 20 |
| divineomega.TrialBot 0.003 | 4 | 5% | 10 |
| mld.DustBunny 3.8 | 3 | 4% | 31 |
| lambdaxy.TBot 0.1 | 1 | 1% | 5 |
| Grystrion.TrackerWO 1.0 | 1 | 1% | 3 |

Posture (Hadur's M records, 201 rounds): 161164 melee ticks, 48479 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 46 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 52562 sent, 47864 reached their opponent, 8022 virtual hits (16.8% of those reached).

## Melee bench: F16

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 109 over 6 battles (18.2 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 89.8 | 123 / 210 | 1.91 | 20.2% | 35771 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 20.2% | 123 |
| gh.Griezel 0.5.2 | 2.0 | 15.7% | 50 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.2% | 3 |
| techdude.forest.FlamingForest 1.1 | 4.7 | 10.5% | 22 |
| bvh.fnr.Fenrir 0.36l | 5.2 | 9.1% | 3 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.7% | 2 |
| stelo.IntrinsicVolatility 1.4 | 6.3 | 8.1% | 8 |
| asd.Cthulhu 1.3 | 9.0 | 4.5% | 0 |
| repositorio.NanoStep 1.0 | 9.0 | 4.6% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 89.8 | 24 / 35 | 6343 |
| 2 | 1 | 70.1 | 86.7 | 19 / 35 | 5946 |
| 3 | 1 | 69.7 | 88.3 | 20 / 35 | 5500 |
| 4 | 1 | 69.2 | 87.9 | 16 / 35 | 5490 |
| 5 | 1 | 71.8 | 93.7 | 23 / 35 | 6152 |
| 6 | 1 | 72.0 | 92.7 | 21 / 35 | 6340 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 80 | 66% |
| techdude.forest.FlamingForest 1.1 | 44 | 70% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 21 | 100% |
| bvh.fnr.Fenrir 0.36l | 7 | 71% |
| tvv.nano.Polaris 1.2 | 7 | 100% |
| stelo.IntrinsicVolatility 1.4 | 6 | 50% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 1242. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 38 | 43% | 92 |
| techdude.forest.FlamingForest 1.1 | 18 | 20% | 49 |
| bvh.fnr.Fenrir 0.36l | 14 | 16% | 18 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 9 | 10% | 28 |
| stelo.IntrinsicVolatility 1.4 | 5 | 6% | 10 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 7 |
| asd.Cthulhu 1.3 | 1 | 1% | 2 |
| tvv.nano.Polaris 1.2 | 0 | 0% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 174927 melee ticks, 74044 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 77 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 77 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 56731 sent, 52051 reached their opponent, 8949 virtual hits (17.2% of those reached).

## Melee bench: F17

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 402 over 6 battles (67.0 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 88.4 | 116 / 210 | 2.05 | 19.8% | 35873 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 19.8% | 116 |
| et.Predator 1.8 | 2.3 | 13.5% | 21 |
| oog.melee.Mercutio 1.0 | 3.5 | 12.3% | 21 |
| cx.BlestPain 1.41 | 3.5 | 12.1% | 42 |
| ahf.NanoAndrew .4 | 5.0 | 10.3% | 7 |
| nic.Nicator 2.4 | 5.8 | 9.6% | 1 |
| maribo.melee.BMV 0.1 | 6.8 | 8.5% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.2 | 5.8% | 1 |
| tex.Longbot 0.4 | 8.8 | 5.5% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 92.7 | 22 / 35 | 6204 |
| 2 | 1 | 70.2 | 90.8 | 19 / 35 | 5828 |
| 3 | 1 | 68.7 | 81.3 | 21 / 35 | 5838 |
| 4 | 1 | 70.2 | 87.0 | 19 / 35 | 6324 |
| 5 | 1 | 69.4 | 87.3 | 16 / 35 | 5921 |
| 6 | 1 | 70.0 | 91.1 | 19 / 35 | 5758 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 60 | 82% |
| oog.melee.Mercutio 1.0 | 46 | 76% |
| cx.BlestPain 1.41 | 42 | 26% |
| ahf.NanoAndrew .4 | 11 | 73% |
| nic.Nicator 2.4 | 7 | 100% |
| maribo.melee.BMV 0.1 | 5 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 1130. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 37 | 38% | 56 |
| et.Predator 1.8 | 19 | 19% | 62 |
| oog.melee.Mercutio 1.0 | 14 | 14% | 45 |
| ahf.NanoAndrew .4 | 13 | 13% | 20 |
| maribo.melee.BMV 0.1 | 5 | 5% | 9 |
| edu.otg.spr.TheTeacher 1.2 | 3 | 3% | 4 |
| tex.Longbot 0.4 | 2 | 2% | 4 |
| nic.Nicator 2.4 | 1 | 1% | 10 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 158568 melee ticks, 68732 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 40 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 52342 sent, 47697 reached their opponent, 10329 virtual hits (21.7% of those reached).

## Melee bench: F18

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 632 over 6 battles (105.3 per battle, most in one battle 147). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 89.6 | 134 / 210 | 1.94 | 19.5% | 30054 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 19.5% | 134 |
| morbid.MorbidPriest 1.0 | 2.3 | 13.3% | 27 |
| agd.Mooserwirt2 2.7 | 3.2 | 12.5% | 24 |
| uji.DBH 1.1 | 3.5 | 11.8% | 11 |
| ratosh.Nobo 0.21 | 6.0 | 8.4% | 1 |
| spinnercat.Robovirus 2.718 | 6.2 | 8.7% | 3 |
| sigterm.Sigterm 1.0 | 6.3 | 8.5% | 8 |
| kawigi.mini.Fhqwhgads 1.1 | 7.7 | 7.1% | 1 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.3 | 5.1% | 0 |
| stelo.WangRobot 1.0 | 9.5 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 91.1 | 23 / 35 | 4934 |
| 2 | 1 | 68.1 | 85.7 | 18 / 35 | 4986 |
| 3 | 1 | 70.0 | 91.4 | 25 / 35 | 4994 |
| 4 | 1 | 70.5 | 92.7 | 24 / 35 | 5296 |
| 5 | 1 | 67.8 | 86.0 | 20 / 35 | 4652 |
| 6 | 1 | 69.8 | 90.5 | 24 / 35 | 5192 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 56 | 70% |
| uji.DBH 1.1 | 36 | 89% |
| agd.Mooserwirt2 2.7 | 33 | 85% |
| sigterm.Sigterm 1.0 | 16 | 88% |
| ratosh.Nobo 0.21 | 12 | 92% |
| spinnercat.Robovirus 2.718 | 4 | 75% |
| stelo.WangRobot 1.0 | 3 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 26 | 33% | 64 |
| agd.Mooserwirt2 2.7 | 13 | 16% | 37 |
| uji.DBH 1.1 | 12 | 15% | 31 |
| sigterm.Sigterm 1.0 | 8 | 10% | 23 |
| spinnercat.Robovirus 2.718 | 6 | 8% | 13 |
| ratosh.Nobo 0.21 | 4 | 5% | 14 |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 4% | 14 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 3% | 7 |
| stelo.WangRobot 1.0 | 2 | 3% | 7 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 140167 melee ticks, 45254 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 65 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 47485 sent, 42544 reached their opponent, 8826 virtual hits (20.7% of those reached).

## Melee bench: F19

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 201 over 6 battles (33.5 per battle, most in one battle 109). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.8 | 98.3 | 198 / 210 | 1.15 | 22.7% | 38454 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 22.7% | 198 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.5% | 7 |
| mld.Infinity 2.2 | 3.5 | 12.1% | 2 |
| krillr.mini.JointStrike 2.0.0 | 3.7 | 11.6% | 0 |
| erdnis.Rover 0.3 | 4.8 | 10.5% | 2 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.3% | 0 |
| mbh.Mbh 0.1 | 6.7 | 7.5% | 0 |
| pac.ABC 2.1 | 8.2 | 6.3% | 0 |
| pbg.R2D2 1.0 | 8.8 | 5.4% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.7 | 99.0 | 34 / 35 | 6261 |
| 2 | 1 | 74.2 | 99.0 | 33 / 35 | 6626 |
| 3 | 1 | 72.5 | 94.3 | 30 / 35 | 6096 |
| 4 | 1 | 74.1 | 99.0 | 34 / 35 | 6506 |
| 5 | 1 | 74.2 | 98.7 | 33 / 35 | 6609 |
| 6 | 1 | 74.0 | 99.7 | 34 / 35 | 6356 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 113 | 98% |
| krillr.mini.JointStrike 2.0.0 | 30 | 100% |
| mld.Infinity 2.2 | 28 | 100% |
| erdnis.Rover 0.3 | 18 | 89% |
| patson.PatsonTestBot 1.0 | 5 | 100% |
| pac.ABC 2.1 | 5 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 14 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 4 | 29% | 64 |
| erdnis.Rover 0.3 | 3 | 21% | 30 |
| pbg.R2D2 1.0 | 3 | 21% | 10 |
| krillr.mini.JointStrike 2.0.0 | 2 | 14% | 38 |
| patson.PatsonTestBot 1.0 | 1 | 7% | 13 |
| mld.Infinity 2.2 | 0 | 0% | 34 |
| pac.ABC 2.1 | 0 | 0% | 7 |
| mbh.Mbh 0.1 | 0 | 0% | 7 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 128237 melee ticks, 48641 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 47 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 42822 sent, 38230 reached their opponent, 8835 virtual hits (23.1% of those reached).

## Melee bench: F20

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 199 over 6 battles (33.2 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 93.0 | 152 / 210 | 1.63 | 21.3% | 36821 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 21.3% | 152 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.7% | 33 |
| fwb.Nine 1.0.1 | 3.7 | 11.1% | 10 |
| nz.jdc.nano.GridFu 1.0 | 4.2 | 10.5% | 1 |
| catcat20.Rabbit 0.001 | 4.2 | 10.6% | 11 |
| m3thos.mini.Eva01 0.5.5 | 6.2 | 8.6% | 1 |
| bayen.nut.Squirrel 1.615 | 7.2 | 7.1% | 2 |
| ntc.ControlledChaos 1.1.4 | 8.0 | 5.7% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.7 | 5.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 94.0 | 26 / 35 | 6311 |
| 2 | 1 | 72.2 | 93.0 | 26 / 35 | 6380 |
| 3 | 1 | 70.8 | 90.5 | 25 / 35 | 5691 |
| 4 | 1 | 72.6 | 96.2 | 27 / 35 | 6131 |
| 5 | 1 | 70.0 | 87.0 | 19 / 35 | 5926 |
| 6 | 1 | 72.9 | 97.1 | 29 / 35 | 6382 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 99 | 85% |
| catcat20.Rabbit 0.001 | 33 | 82% |
| fwb.Nine 1.0.1 | 30 | 93% |
| m3thos.mini.Eva01 0.5.5 | 5 | 100% |
| nz.jdc.nano.GridFu 1.0 | 5 | 100% |
| bayen.nut.Squirrel 1.615 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 976. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 31 | 53% | 107 |
| catcat20.Rabbit 0.001 | 10 | 17% | 43 |
| fwb.Nine 1.0.1 | 10 | 17% | 19 |
| bayen.nut.Squirrel 1.615 | 3 | 5% | 8 |
| ntc.ControlledChaos 1.1.4 | 2 | 3% | 4 |
| m3thos.mini.Eva01 0.5.5 | 1 | 2% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 2 |
| nz.jdc.nano.GridFu 1.0 | 0 | 0% | 17 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 210 rounds): 168874 melee ticks, 60945 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 97 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (210 rounds): longest scan gap while four or more were alive 97 ticks (210 rounds over 8); rounds whose longest gap at any count was over 8: 210; robots dropped as dead without a death event: 0.

Targeting waves (210 rounds): 52950 sent, 48036 reached their opponent, 10585 virtual hits (22.0% of those reached).

## Melee bench: F21

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 788 over 6 battles (131.3 per battle, most in one battle 223). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 93.2 | 140 / 210 | 1.61 | 21.0% | 36532 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 21.0% | 140 |
| eem.EvBot v4.6.16 | 2.0 | 16.3% | 55 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.9% | 9 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.3% | 6 |
| eld.Hmm 1.0 | 5.3 | 7.9% | 2 |
| oa.weak.BotherBot 0.1 | 5.7 | 7.6% | 1 |
| fire219.CatBot 1.0 | 7.5 | 6.1% | 0 |
| PSW.Relentless 0.1 | 8.0 | 5.7% | 0 |
| el.JumpShoot 0.2 | 8.5 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 96.5 | 26 / 35 | 5951 |
| 2 | 1 | 71.5 | 90.5 | 25 / 35 | 6155 |
| 3 | 1 | 71.3 | 92.4 | 21 / 35 | 5887 |
| 4 | 1 | 70.7 | 90.5 | 20 / 35 | 5830 |
| 5 | 1 | 73.1 | 93.7 | 22 / 35 | 6799 |
| 6 | 1 | 72.1 | 95.6 | 26 / 35 | 5910 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 121 | 70% |
| dummy.mini.Scimitar 1.01 | 28 | 89% |
| cf.RiO.RiOx 4.2.1 | 25 | 88% |
| eld.Hmm 1.0 | 7 | 86% |
| oa.weak.BotherBot 0.1 | 2 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 1259. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 45 | 57% | 110 |
| dummy.mini.Scimitar 1.01 | 13 | 16% | 49 |
| cf.RiO.RiOx 4.2.1 | 8 | 10% | 23 |
| PSW.Relentless 0.1 | 3 | 4% | 3 |
| eld.Hmm 1.0 | 2 | 3% | 17 |
| arthord.MannyPacquiao Beta | 1 | 1% | 1 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 5 |
| fire219.CatBot 1.0 | 0 | 0% | 2 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 178372 melee ticks, 83746 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 73 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 0.

Targeting waves (209 rounds): 52639 sent, 47840 reached their opponent, 8289 virtual hits (17.3% of those reached).

## Melee bench: F22

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 403 over 6 battles (67.2 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 91.6 | 117 / 210 | 1.75 | 19.6% | 31779 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 19.6% | 117 |
| pe.SandboxDT 2.71m | 2.3 | 15.8% | 46 |
| kvk.HebusLeTroll 0.35 | 2.7 | 15.1% | 31 |
| jlm.javaDisturbance 0.59 | 4.2 | 12.4% | 11 |
| bigpete.Stewie 1.0 | 4.8 | 11.1% | 4 |
| yk.JahRoslav 1.1 | 6.5 | 6.8% | 1 |
| tad.Dalek98 0.98 | 7.3 | 6.1% | 0 |
| gg.Squaraus 0.6 | 7.3 | 6.2% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 4.6% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 92.1 | 21 / 35 | 5163 |
| 2 | 1 | 70.5 | 91.4 | 18 / 35 | 5285 |
| 3 | 1 | 70.4 | 92.7 | 21 / 35 | 5356 |
| 4 | 1 | 72.2 | 96.5 | 27 / 35 | 5476 |
| 5 | 1 | 68.3 | 87.0 | 13 / 35 | 4955 |
| 6 | 1 | 70.4 | 90.2 | 17 / 35 | 5544 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 65 | 71% |
| pe.SandboxDT 2.71m | 60 | 52% |
| jlm.javaDisturbance 0.59 | 27 | 74% |
| bigpete.Stewie 1.0 | 20 | 100% |
| yk.JahRoslav 1.1 | 1 | 0% |

Hadur died in 96 of 210 rounds, at a mean tick of 1030. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 38 | 40% | 78 |
| kvk.HebusLeTroll 0.35 | 34 | 35% | 65 |
| jlm.javaDisturbance 0.59 | 15 | 16% | 40 |
| yk.JahRoslav 1.1 | 3 | 3% | 3 |
| tad.Dalek98 0.98 | 2 | 2% | 3 |
| bigpete.Stewie 1.0 | 1 | 1% | 19 |
| gg.Squaraus 0.6 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 163681 melee ticks, 49189 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 33 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 51880 sent, 47057 reached their opponent, 7503 virtual hits (15.9% of those reached).

## Melee bench: F23

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 518 over 6 battles (86.3 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.8 | 97.1 | 186 / 210 | 1.26 | 22.4% | 37477 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 22.4% | 186 |
| pe.SandboxLump 1.52 | 2.0 | 16.1% | 17 |
| cre.Karolos 0.32 | 3.0 | 13.5% | 5 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.2% | 0 |
| stelo.RamTrackSurfer 1.2 | 5.5 | 9.1% | 2 |
| cw.megas.Blade 0.8 | 6.2 | 8.7% | 0 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.3 | 8.5% | 0 |
| sample.Walls 1.0 | 7.8 | 7.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.2 | 2.3% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.5 | 99.0 | 33 / 35 | 6624 |
| 2 | 1 | 73.3 | 96.5 | 28 / 35 | 6082 |
| 3 | 1 | 74.0 | 95.9 | 31 / 35 | 6126 |
| 4 | 1 | 73.6 | 96.8 | 32 / 35 | 6197 |
| 5 | 1 | 74.3 | 98.1 | 31 / 35 | 6659 |
| 6 | 1 | 73.0 | 96.2 | 31 / 35 | 5789 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 103 | 90% |
| cre.Karolos 0.32 | 65 | 98% |
| stelo.RamTrackSurfer 1.2 | 9 | 89% |
| sample.Walls 1.0 | 6 | 100% |
| cw.megas.Blade 0.8 | 6 | 100% |
| stelo.AreaTargetingBot 1.1 | 5 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 100% |

Hadur died in 28 of 210 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 15 | 54% | 93 |
| cre.Karolos 0.32 | 5 | 18% | 58 |
| stelo.RamTrackSurfer 1.2 | 2 | 7% | 21 |
| stelo.AreaTargetingBot 1.1 | 1 | 4% | 12 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 4% | 7 |
| cw.megas.Blade 0.8 | 0 | 0% | 9 |
| sample.Walls 1.0 | 0 | 0% | 5 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 123948 melee ticks, 52950 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 35 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 38889 sent, 34016 reached their opponent, 9982 virtual hits (29.3% of those reached).

## Melee bench: F24

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 647 over 6 battles (107.8 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 82.1 | 84 / 210 | 2.61 | 17.0% | 25173 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 17.0% | 84 |
| rz.GlowBlowMelee 1.4 | 2.2 | 14.0% | 38 |
| florent.XSeries.X2 0.12 | 3.7 | 13.0% | 27 |
| davidalves.Phoenix 0.54 | 3.8 | 12.6% | 35 |
| pedersen.Ugluk 1.1.1 | 4.5 | 11.7% | 17 |
| oog.melee.Corsair 1.0 | 5.8 | 9.7% | 8 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 7.0% | 4 |
| lunchie.Lunchbox 0.93 | 8.3 | 5.7% | 0 |
| as.FrankTheTank 1.3 | 9.2 | 5.0% | 0 |
| evd.X1 0.01 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 79.7 | 9 / 35 | 4025 |
| 2 | 1 | 66.8 | 84.8 | 18 / 35 | 4133 |
| 3 | 1 | 66.0 | 80.6 | 16 / 35 | 4242 |
| 4 | 1 | 65.6 | 78.7 | 15 / 35 | 4251 |
| 5 | 1 | 67.2 | 85.7 | 14 / 35 | 4395 |
| 6 | 1 | 65.9 | 82.9 | 12 / 35 | 4127 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 42 | 57% |
| davidalves.Phoenix 0.54 | 26 | 46% |
| florent.XSeries.X2 0.12 | 26 | 69% |
| pedersen.Ugluk 1.1.1 | 24 | 79% |
| oog.melee.Corsair 1.0 | 13 | 54% |
| stelo.SoJNanoMelee 1.1 | 4 | 75% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 33 | 24% | 58 |
| davidalves.Phoenix 0.54 | 28 | 21% | 42 |
| florent.XSeries.X2 0.12 | 24 | 18% | 39 |
| pedersen.Ugluk 1.1.1 | 19 | 14% | 32 |
| oog.melee.Corsair 1.0 | 13 | 10% | 23 |
| as.FrankTheTank 1.3 | 4 | 3% | 7 |
| evd.X1 0.01 | 3 | 2% | 3 |
| lunchie.Lunchbox 0.93 | 2 | 1% | 4 |
| stelo.SoJNanoMelee 1.1 | 1 | 1% | 2 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 137288 melee ticks, 39893 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 39 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 2.

Targeting waves (205 rounds): 46001 sent, 41006 reached their opponent, 7493 virtual hits (18.3% of those reached).

## Melee bench: F25

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 390 over 6 battles (65.0 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 89.5 | 142 / 210 | 1.94 | 19.2% | 25455 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 19.2% | 142 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.1% | 17 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.9% | 10 |
| jdw.Hurricane 1.4 | 3.8 | 11.6% | 21 |
| gre.svman4.Morfeas 1.4.1 | 5.5 | 9.1% | 8 |
| ds.Oo 2.2 | 5.8 | 9.2% | 11 |
| awesomeness.Elite 1.0 | 7.0 | 7.3% | 0 |
| adt.Ar2 1.1 | 8.3 | 6.7% | 0 |
| gjr.Cephalosporin 0.1 | 8.3 | 6.4% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 91.4 | 26 / 35 | 4501 |
| 2 | 1 | 69.6 | 92.7 | 24 / 35 | 4287 |
| 3 | 1 | 68.9 | 88.9 | 23 / 35 | 4303 |
| 4 | 1 | 66.7 | 83.8 | 20 / 35 | 3899 |
| 5 | 1 | 69.5 | 91.4 | 25 / 35 | 4275 |
| 6 | 1 | 68.6 | 88.9 | 24 / 35 | 4190 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 51 | 88% |
| voidious.micro.BlitzBat 1.05 | 42 | 93% |
| jdw.Hurricane 1.4 | 36 | 86% |
| ds.Oo 2.2 | 16 | 69% |
| gre.svman4.Morfeas 1.4.1 | 7 | 43% |
| gjr.Cephalosporin 0.1 | 5 | 100% |
| awesomeness.Elite 1.0 | 5 | 100% |
| amk.ChumbaMini 0.2 | 2 | 50% |
| adt.Ar2 1.1 | 2 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 675. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 19 | 26% | 57 |
| voidious.micro.BlitzBat 1.05 | 13 | 18% | 45 |
| ds.Oo 2.2 | 10 | 14% | 29 |
| gre.svman4.Morfeas 1.4.1 | 9 | 13% | 13 |
| jdw.Hurricane 1.4 | 7 | 10% | 30 |
| awesomeness.Elite 1.0 | 4 | 6% | 12 |
| amk.ChumbaMini 0.2 | 3 | 4% | 4 |
| gjr.Cephalosporin 0.1 | 2 | 3% | 15 |
| adt.Ar2 1.1 | 1 | 1% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 128890 melee ticks, 30502 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 64 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 45434 sent, 40739 reached their opponent, 6824 virtual hits (16.8% of those reached).

## Melee bench: F26

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 445 over 6 battles (74.2 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 94.7 | 149 / 210 | 1.48 | 21.6% | 40341 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 21.6% | 149 |
| ak.Fermat 2.0 | 2.0 | 15.0% | 33 |
| lrem.Spectre 0.4.4 | 3.5 | 11.7% | 8 |
| shu.nitro.LENIN .T34 | 3.5 | 12.1% | 13 |
| js.PinBall 1.6 | 5.2 | 10.3% | 1 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.4% | 4 |
| gh.mini.GrubbmOne 1.0 | 6.8 | 8.4% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.3% | 2 |
| sample.SpinBot 1.0 | 9.0 | 3.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.7 | 96.2 | 27 / 35 | 7219 |
| 2 | 1 | 72.6 | 96.2 | 26 / 35 | 6286 |
| 3 | 1 | 72.0 | 92.7 | 22 / 35 | 6539 |
| 4 | 1 | 72.0 | 92.7 | 22 / 35 | 6598 |
| 5 | 1 | 73.0 | 94.3 | 27 / 35 | 6925 |
| 6 | 1 | 73.0 | 95.9 | 25 / 35 | 6774 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 80 | 73% |
| lrem.Spectre 0.4.4 | 40 | 85% |
| shu.nitro.LENIN .T34 | 39 | 87% |
| jaybot.adv.bots.JayBot 2.0 | 11 | 100% |
| js.PinBall 1.6 | 9 | 89% |
| gh.mini.GrubbmOne 1.0 | 3 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 33% |

Hadur died in 65 of 210 rounds, at a mean tick of 1102. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 32 | 49% | 78 |
| shu.nitro.LENIN .T34 | 10 | 15% | 56 |
| lrem.Spectre 0.4.4 | 8 | 12% | 34 |
| jaybot.adv.bots.JayBot 2.0 | 6 | 9% | 18 |
| js.PinBall 1.6 | 4 | 6% | 15 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 3% | 3 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 6 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 162171 melee ticks, 54861 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 41 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 51595 sent, 46793 reached their opponent, 11301 virtual hits (24.2% of those reached).

## Melee bench: F27

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 387 over 6 battles (64.5 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 93.4 | 169 / 210 | 1.59 | 20.9% | 32893 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 20.9% | 169 |
| mk.Alpha 0.2.1 | 2.2 | 13.8% | 23 |
| EH.Eagle 1.0.6 | 2.8 | 11.2% | 3 |
| sheldor.melee.nano.TestMelee 0.1 | 5.7 | 8.8% | 5 |
| wee.Gem 1.8.4 | 5.7 | 8.9% | 7 |
| techdude.kombat.FlamingKombat 1.5 | 6.3 | 8.2% | 3 |
| joe.ADinosaur 1.0 | 6.7 | 8.2% | 0 |
| throxbot.ThroxBot 0.1 | 6.8 | 8.3% | 0 |
| caimano.Furia_Ceca 0.22 | 8.0 | 7.1% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 95.9 | 32 / 35 | 5621 |
| 2 | 1 | 71.5 | 95.9 | 31 / 35 | 5564 |
| 3 | 1 | 70.3 | 92.1 | 26 / 35 | 5141 |
| 4 | 1 | 70.4 | 93.0 | 27 / 35 | 5298 |
| 5 | 1 | 71.6 | 97.1 | 30 / 35 | 5430 |
| 6 | 1 | 69.9 | 86.7 | 23 / 35 | 5839 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 100 | 88% |
| EH.Eagle 1.0.6 | 35 | 100% |
| throxbot.ThroxBot 0.1 | 12 | 100% |
| wee.Gem 1.8.4 | 11 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 8 | 88% |
| joe.ADinosaur 1.0 | 7 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 6 | 83% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 23 | 52% | 91 |
| techdude.kombat.FlamingKombat 1.5 | 5 | 11% | 15 |
| joe.ADinosaur 1.0 | 3 | 7% | 11 |
| cs.Grudge 1.0 | 3 | 7% | 3 |
| EH.Eagle 1.0.6 | 2 | 5% | 42 |
| throxbot.ThroxBot 0.1 | 2 | 5% | 13 |
| sheldor.melee.nano.TestMelee 0.1 | 1 | 2% | 15 |
| wee.Gem 1.8.4 | 1 | 2% | 14 |
| caimano.Furia_Ceca 0.22 | 1 | 2% | 6 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 134690 melee ticks, 41386 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 57 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 43465 sent, 38720 reached their opponent, 9484 virtual hits (24.5% of those reached).

## Melee bench: F28

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 179 over 6 battles (29.8 per battle, most in one battle 117). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 93.0 | 151 / 210 | 1.63 | 19.5% | 25664 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 19.5% | 151 |
| kid.test.NightFox .2 | 2.0 | 14.7% | 21 |
| uji.Antique 1.0 | 3.7 | 11.5% | 19 |
| pfvicm.Sobieski 7.2.3b | 4.0 | 11.1% | 5 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.3% | 9 |
| amk.ChumbaWumba 0.3 | 6.2 | 8.1% | 1 |
| ahr.ice.Ice 1.0.2 | 6.7 | 7.8% | 3 |
| matt.advanced.Katana 1.0 | 8.7 | 5.9% | 1 |
| stelo.PianistNano 1.2 | 9.0 | 5.4% | 0 |
| stelo.Lifestealer 1.0 | 9.3 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 93.3 | 26 / 35 | 4335 |
| 2 | 1 | 70.4 | 94.0 | 27 / 35 | 4618 |
| 3 | 1 | 68.2 | 89.2 | 21 / 35 | 4203 |
| 4 | 1 | 70.0 | 95.2 | 26 / 35 | 4203 |
| 5 | 1 | 69.4 | 93.7 | 25 / 35 | 4300 |
| 6 | 1 | 68.7 | 92.4 | 26 / 35 | 4005 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 94 | 91% |
| uji.Antique 1.0 | 43 | 91% |
| qohnil.blot.BlotBot 3.61 | 14 | 64% |
| pfvicm.Sobieski 7.2.3b | 11 | 64% |
| ahr.ice.Ice 1.0.2 | 4 | 100% |
| amk.ChumbaWumba 0.3 | 3 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 739. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 14 | 23% | 58 |
| pfvicm.Sobieski 7.2.3b | 14 | 23% | 22 |
| kid.test.NightFox .2 | 12 | 20% | 48 |
| qohnil.blot.BlotBot 3.61 | 10 | 17% | 31 |
| amk.ChumbaWumba 0.3 | 5 | 8% | 19 |
| ahr.ice.Ice 1.0.2 | 2 | 3% | 15 |
| matt.advanced.Katana 1.0 | 1 | 2% | 9 |
| stelo.Lifestealer 1.0 | 1 | 2% | 2 |
| stelo.PianistNano 1.2 | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 131745 melee ticks, 38875 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 54 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 44594 sent, 39662 reached their opponent, 5701 virtual hits (14.4% of those reached).

## Melee bench: F29

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 448 over 6 battles (74.7 per battle, most in one battle 113). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 90.4 | 113 / 210 | 1.86 | 20.0% | 30666 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 20.0% | 113 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 15.4% | 51 |
| deewiant.Anomaly 0.2 | 2.7 | 14.9% | 40 |
| myl.micro.Troodon 1.10 | 4.0 | 11.7% | 4 |
| jok.PheonixM 0.1.2 | 4.8 | 10.5% | 1 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.0% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.7 | 5.6% | 0 |
| ap.Frederick 1.1 | 8.2 | 5.0% | 1 |
| DBall.Anarchy 0.1 | 8.2 | 5.5% | 0 |
| jangs.ns51 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 92.7 | 22 / 35 | 5349 |
| 2 | 1 | 70.4 | 90.8 | 20 / 35 | 4980 |
| 3 | 1 | 69.6 | 88.9 | 14 / 35 | 4987 |
| 4 | 1 | 70.2 | 89.2 | 14 / 35 | 5312 |
| 5 | 1 | 71.2 | 91.1 | 23 / 35 | 5039 |
| 6 | 1 | 70.6 | 89.8 | 20 / 35 | 4999 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 81 | 63% |
| zyx.mega.YersiniaPestis 3.1 | 57 | 49% |
| myl.micro.Troodon 1.10 | 16 | 94% |
| jok.PheonixM 0.1.2 | 16 | 94% |
| ap.Frederick 1.1 | 2 | 100% |
| ph.melee.ArcherME 0.3 | 2 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 1151. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 46 | 46% | 76 |
| deewiant.Anomaly 0.2 | 40 | 40% | 91 |
| jok.PheonixM 0.1.2 | 4 | 4% | 22 |
| myl.micro.Troodon 1.10 | 4 | 4% | 14 |
| DBall.Anarchy 0.1 | 2 | 2% | 1 |
| jangs.ns51 1.0 | 1 | 1% | 1 |
| ph.melee.ArcherME 0.3 | 0 | 0% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 179197 melee ticks, 63697 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 33 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 56248 sent, 51540 reached their opponent, 7739 virtual hits (15.0% of those reached).

## Melee bench: F30

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 298 over 6 battles (49.7 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 78.7 | 65 / 210 | 2.91 | 15.9% | 23891 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.2 | 15.9% | 65 |
| catcat20.Matcha 0.006 | 2.5 | 13.9% | 47 |
| darkcanuck.B26354 1.06 | 3.2 | 13.2% | 41 |
| stelo.PastFuture 2.3.2 | 4.0 | 12.3% | 16 |
| oog.melee.Capulet 1.2 | 4.2 | 12.2% | 25 |
| intruder.PrairieWolf 2.61 | 6.0 | 8.9% | 6 |
| tripphippy.Alice 1.1 | 7.7 | 7.3% | 5 |
| ntc.Opposite 1.5 | 8.2 | 6.9% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 8.2 | 6.8% | 5 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 80.6 | 12 / 35 | 4630 |
| 2 | 1 | 62.5 | 74.9 | 9 / 35 | 3654 |
| 3 | 2 | 64.8 | 80.6 | 10 / 35 | 4084 |
| 4 | 1 | 64.9 | 81.6 | 11 / 35 | 3958 |
| 5 | 1 | 64.8 | 79.0 | 12 / 35 | 3909 |
| 6 | 1 | 62.9 | 75.6 | 11 / 35 | 3656 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 32 | 56% |
| darkcanuck.B26354 1.06 | 26 | 46% |
| oog.melee.Capulet 1.2 | 19 | 58% |
| stelo.PastFuture 2.3.2 | 17 | 88% |
| tripphippy.Alice 1.1 | 6 | 83% |
| intruder.PrairieWolf 2.61 | 5 | 20% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 75% |

Hadur died in 149 of 210 rounds, at a mean tick of 879. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 36 | 24% | 47 |
| catcat20.Matcha 0.006 | 31 | 21% | 48 |
| oog.melee.Capulet 1.2 | 28 | 19% | 39 |
| stelo.PastFuture 2.3.2 | 20 | 13% | 35 |
| tripphippy.Alice 1.1 | 10 | 7% | 15 |
| fowl3628800.LightningBolt 2.6.0 | 9 | 6% | 9 |
| intruder.PrairieWolf 2.61 | 8 | 5% | 11 |
| ntc.Opposite 1.5 | 4 | 3% | 6 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 157371 melee ticks, 31825 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 55 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 50698 sent, 45835 reached their opponent, 7943 virtual hits (17.3% of those reached).

## Melee bench: F31

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 385 over 6 battles (64.2 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 80.3 | 67 / 210 | 2.77 | 16.3% | 23372 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.2% | 88 |
| hadur117.Hadur 3.20ed | 2.2 | 16.3% | 67 |
| gh.mini.Griezel 0.2 | 3.0 | 13.3% | 43 |
| d414.nano.Quantum 1.0.0 | 3.8 | 11.9% | 7 |
| spinnercat.micro.Tyger 0.1 | 5.2 | 10.4% | 5 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.2% | 1 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.6% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.3 | 5.1% | 0 |
| tlp.ThreeLeggedPig 1 | 9.2 | 4.6% | 0 |
| fm.mammillarias 1.3 | 9.3 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.2 | 82.9 | 11 / 35 | 4014 |
| 2 | 3 | 63.6 | 75.2 | 9 / 35 | 3695 |
| 3 | 2 | 63.8 | 75.2 | 9 / 35 | 3749 |
| 4 | 2 | 64.8 | 78.7 | 11 / 35 | 3680 |
| 5 | 2 | 67.1 | 85.1 | 15 / 35 | 4187 |
| 6 | 2 | 67.1 | 84.8 | 12 / 35 | 4047 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 69 | 49% |
| gh.mini.Griezel 0.2 | 32 | 44% |
| spinnercat.micro.Tyger 0.1 | 10 | 80% |
| d414.nano.Quantum 1.0.0 | 9 | 78% |
| gh.nano.Grofvuil 0.2 | 4 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 62 | 42% | 92 |
| gh.mini.Griezel 0.2 | 39 | 26% | 56 |
| spinnercat.micro.Tyger 0.1 | 16 | 11% | 22 |
| d414.nano.Quantum 1.0.0 | 11 | 7% | 16 |
| gh.nano.Grofvuil 0.2 | 6 | 4% | 11 |
| fm.mammillarias 1.3 | 5 | 3% | 6 |
| timmit.nano.TimDog 0.33 | 5 | 3% | 5 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 156171 melee ticks, 39618 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 39 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 49754 sent, 44865 reached their opponent, 7004 virtual hits (15.6% of those reached).

## Melee bench: F32

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 189 over 6 battles (31.5 per battle, most in one battle 105). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 90.8 | 138 / 210 | 1.83 | 19.3% | 28964 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 19.3% | 138 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.9% | 40 |
| apc.botM 3.0 | 3.3 | 11.4% | 14 |
| lxx.ConceptA 0.8 | 4.0 | 10.4% | 2 |
| bayen.UbaMicro 1.4 | 5.3 | 9.5% | 3 |
| vjik.UnViolation 1.1 | 5.3 | 9.4% | 10 |
| panzer.Panzer 0.2 | 7.2 | 7.7% | 1 |
| yk.JahMicro 1.0 | 8.2 | 6.7% | 0 |
| conscience.Electron 1.3g | 8.7 | 6.3% | 0 |
| donjezza.Jezza 1.0 | 10.0 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 91.7 | 22 / 35 | 4645 |
| 2 | 1 | 69.6 | 92.1 | 24 / 35 | 5113 |
| 3 | 1 | 69.8 | 94.6 | 25 / 35 | 4615 |
| 4 | 1 | 69.1 | 91.7 | 22 / 35 | 4983 |
| 5 | 1 | 68.2 | 87.9 | 21 / 35 | 4781 |
| 6 | 1 | 68.6 | 86.7 | 24 / 35 | 4827 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 92 | 72% |
| apc.botM 3.0 | 34 | 76% |
| vjik.UnViolation 1.1 | 14 | 86% |
| lxx.ConceptA 0.8 | 13 | 92% |
| bayen.UbaMicro 1.4 | 8 | 100% |
| yk.JahMicro 1.0 | 7 | 100% |
| panzer.Panzer 0.2 | 5 | 80% |
| donjezza.Jezza 1.0 | 3 | 67% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 806. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 26 | 35% | 85 |
| lxx.ConceptA 0.8 | 13 | 17% | 22 |
| apc.botM 3.0 | 10 | 13% | 37 |
| bayen.UbaMicro 1.4 | 7 | 9% | 16 |
| vjik.UnViolation 1.1 | 6 | 8% | 29 |
| panzer.Panzer 0.2 | 6 | 8% | 8 |
| yk.JahMicro 1.0 | 3 | 4% | 7 |
| conscience.Electron 1.3g | 2 | 3% | 4 |
| donjezza.Jezza 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 124412 melee ticks, 54314 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 48 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 42371 sent, 37555 reached their opponent, 6871 virtual hits (18.3% of those reached).

## Melee bench: F33

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 404 over 6 battles (67.3 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 89.7 | 127 / 210 | 1.93 | 19.7% | 30149 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 19.7% | 127 |
| maribo.Quester 0.3 | 2.0 | 15.7% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 12.0% | 16 |
| gre.svman4.Leonidas 1.3.2 | 3.8 | 11.4% | 18 |
| labg.Cataclysm 2.05 | 4.8 | 10.2% | 14 |
| baal.nano.N 1.42 | 6.0 | 9.1% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 8.2% | 5 |
| zyx.micro.Ant 1.1 | 8.3 | 5.6% | 0 |
| sanja.First 0.1 | 8.7 | 5.0% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 89.2 | 23 / 35 | 5233 |
| 2 | 1 | 70.7 | 92.1 | 24 / 35 | 4930 |
| 3 | 1 | 70.7 | 93.0 | 21 / 35 | 5178 |
| 4 | 1 | 69.1 | 87.0 | 22 / 35 | 4751 |
| 5 | 1 | 70.8 | 90.5 | 20 / 35 | 5431 |
| 6 | 1 | 68.2 | 86.3 | 17 / 35 | 4626 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 70 | 76% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 84% |
| gre.svman4.Leonidas 1.3.2 | 26 | 73% |
| labg.Cataclysm 2.05 | 16 | 75% |
| kinsen.melee.Angsaichmophobia 1.8c | 14 | 79% |
| baal.nano.N 1.42 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 1053. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 32 | 37% | 78 |
| gre.svman4.Leonidas 1.3.2 | 16 | 18% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 17% | 48 |
| labg.Cataclysm 2.05 | 8 | 9% | 20 |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 7% | 17 |
| zyx.micro.Ant 1.1 | 4 | 5% | 5 |
| baal.nano.N 1.42 | 3 | 3% | 9 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 168291 melee ticks, 54984 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 48 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 54002 sent, 49146 reached their opponent, 7202 virtual hits (14.7% of those reached).

## Melee bench: F34

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 385 over 6 battles (64.2 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.6 | 89 / 210 | 2.02 | 18.9% | 32084 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 18.9% | 89 |
| stelo.Spread 0.9 | 2.2 | 17.1% | 72 |
| kid.Gladiator .7.2 | 2.8 | 15.5% | 34 |
| jcs.Seth 1.8 | 4.3 | 11.1% | 12 |
| tcf.Reach 3 | 5.0 | 10.3% | 3 |
| cli.Dancer 1.1 | 5.7 | 9.2% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 6.8% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.2% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.1% | 0 |
| sample.RamFire 1.0 | 9.7 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 85.1 | 14 / 35 | 5339 |
| 2 | 1 | 69.8 | 89.8 | 18 / 35 | 5126 |
| 3 | 1 | 70.5 | 91.4 | 18 / 35 | 5393 |
| 4 | 1 | 69.4 | 89.2 | 12 / 35 | 5406 |
| 5 | 1 | 70.1 | 89.5 | 15 / 35 | 5464 |
| 6 | 1 | 69.2 | 86.7 | 12 / 35 | 5356 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 93 | 49% |
| kid.Gladiator .7.2 | 54 | 59% |
| jcs.Seth 1.8 | 15 | 40% |
| ratosh.Wesco 1.4 | 2 | 100% |
| tcf.Reach 3 | 2 | 50% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |
| cli.Dancer 1.1 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 1160. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 55 | 44% | 97 |
| kid.Gladiator .7.2 | 43 | 35% | 73 |
| jcs.Seth 1.8 | 14 | 11% | 22 |
| tcf.Reach 3 | 5 | 4% | 8 |
| amk.Punbot.Punbot 0.01 | 3 | 2% | 3 |
| ratosh.Wesco 1.4 | 1 | 1% | 4 |
| cli.Dancer 1.1 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 171502 melee ticks, 69350 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 34 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 52799 sent, 47917 reached their opponent, 7827 virtual hits (16.3% of those reached).

## Melee bench: F35

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 647 over 6 battles (107.8 per battle, most in one battle 114). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 82.8 | 40 / 210 | 2.55 | 16.2% | 23628 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.4% | 142 |
| hadur117.Hadur 3.20ed | 2.0 | 16.2% | 40 |
| gh.mini.Gruwel 0.9 | 3.3 | 12.7% | 11 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.2 | 12.0% | 11 |
| rz.HawkOnFire 0.1 | 4.5 | 11.7% | 5 |
| wit.Chuliath 1.0 | 6.7 | 6.5% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.0 | 6.2% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.3 | 5.7% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.8% | 0 |
| dans.Cinnamon 1.2 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 82.5 | 4 / 35 | 4235 |
| 2 | 2 | 64.8 | 81.0 | 7 / 35 | 3983 |
| 3 | 2 | 64.6 | 79.7 | 6 / 35 | 3759 |
| 4 | 2 | 66.5 | 86.3 | 8 / 35 | 4068 |
| 5 | 2 | 66.1 | 85.1 | 9 / 35 | 3698 |
| 6 | 2 | 65.0 | 81.9 | 6 / 35 | 3885 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 95 | 13% |
| gh.mini.Gruwel 0.9 | 16 | 75% |
| dmh.robocode.robot.BlackDeath 9.2 | 15 | 60% |
| rz.HawkOnFire 0.1 | 11 | 64% |

Hadur died in 176 of 210 rounds, at a mean tick of 963. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 99 | 56% | 114 |
| dmh.robocode.robot.BlackDeath 9.2 | 24 | 14% | 31 |
| gh.mini.Gruwel 0.9 | 22 | 13% | 33 |
| rz.HawkOnFire 0.1 | 16 | 9% | 22 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 2% | 5 |
| wit.Chuliath 1.0 | 3 | 2% | 3 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 1 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 149535 melee ticks, 52389 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 33 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 45850 sent, 40930 reached their opponent, 6359 virtual hits (15.5% of those reached).

## Melee bench: F36

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 446 over 6 battles (74.3 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 95.3 | 168 / 210 | 1.42 | 21.6% | 33855 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 21.6% | 168 |
| bzdp.Pansy 2.1 | 2.7 | 12.1% | 6 |
| alpha.RainingFire 1.0 | 3.0 | 12.3% | 16 |
| bvh.micro.Freya 0.3 | 4.5 | 10.6% | 6 |
| mz.Cork 0.1 | 4.8 | 10.4% | 6 |
| m3thos.Eva02 0.7.1 | 5.8 | 9.7% | 3 |
| bvh.mini.Fenrir 0.39 | 6.2 | 9.3% | 3 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 5.8% | 1 |
| dl.BetterWalls 1.0 | 8.8 | 4.8% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 98.4 | 33 / 35 | 5925 |
| 2 | 1 | 72.2 | 96.5 | 27 / 35 | 5697 |
| 3 | 1 | 72.7 | 96.5 | 30 / 35 | 5514 |
| 4 | 1 | 72.3 | 96.2 | 28 / 35 | 5531 |
| 5 | 1 | 71.2 | 93.3 | 25 / 35 | 5553 |
| 6 | 1 | 71.0 | 90.8 | 25 / 35 | 5635 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.micro.Freya 0.3 | 45 | 89% |
| bzdp.Pansy 2.1 | 43 | 93% |
| alpha.RainingFire 1.0 | 35 | 77% |
| mz.Cork 0.1 | 29 | 90% |
| bvh.mini.Fenrir 0.39 | 17 | 100% |
| m3thos.Eva02 0.7.1 | 14 | 93% |
| sample.MyFirstRobot 1.0 | 3 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 0% |

Hadur died in 45 of 210 rounds, at a mean tick of 879. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 18 | 40% | 47 |
| bvh.micro.Freya 0.3 | 8 | 18% | 42 |
| mz.Cork 0.1 | 6 | 13% | 30 |
| bvh.mini.Fenrir 0.39 | 6 | 13% | 18 |
| bzdp.Pansy 2.1 | 2 | 4% | 43 |
| m3thos.Eva02 0.7.1 | 1 | 2% | 22 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 1 |
| dl.BetterWalls 1.0 | 0 | 0% | 4 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 145471 melee ticks, 51076 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 49 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 50328 sent, 45679 reached their opponent, 9398 virtual hits (20.6% of those reached).

## Melee bench: F37

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 238 over 6 battles (39.7 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.1 | 155 / 210 | 2.16 | 19.3% | 34736 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 19.3% | 155 |
| germ.TheMind .2 | 2.8 | 10.6% | 8 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.8 | 10.3% | 10 |
| EBBU.Sim2 1.02 | 5.2 | 9.3% | 1 |
| agrach.Dalek 1.0 | 5.8 | 9.0% | 8 |
| stelo.UntouchableNano 1.3 | 6.0 | 9.1% | 18 |
| lmk.ACPFinal 0.1 | 6.8 | 8.5% | 7 |
| mb.Beast 0.1 | 7.8 | 8.1% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 7.8 | 8.1% | 0 |
| skm.Ryubot 1.0 | 8.8 | 7.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 80.0 | 23 / 35 | 5386 |
| 2 | 1 | 67.1 | 81.9 | 25 / 35 | 5685 |
| 3 | 1 | 69.6 | 93.3 | 27 / 35 | 5681 |
| 4 | 1 | 69.8 | 90.8 | 28 / 35 | 6164 |
| 5 | 1 | 66.8 | 83.5 | 23 / 35 | 5453 |
| 6 | 1 | 70.3 | 93.0 | 29 / 35 | 6367 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 30 | 93% |
| germ.TheMind .2 | 28 | 96% |
| stelo.UntouchableNano 1.3 | 22 | 73% |
| EBBU.Sim2 1.02 | 22 | 95% |
| com.syncleus.robocode.Dreadnaught 0.1 | 20 | 85% |
| lmk.ACPFinal 0.1 | 18 | 94% |
| mb.Beast 0.1 | 14 | 100% |
| skm.Ryubot 1.0 | 11 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 4 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 433. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 15 | 27% | 21 |
| com.syncleus.robocode.Dreadnaught 0.1 | 10 | 18% | 34 |
| stelo.UntouchableNano 1.3 | 10 | 18% | 28 |
| mb.Beast 0.1 | 5 | 9% | 24 |
| lmk.ACPFinal 0.1 | 5 | 9% | 22 |
| agrach.Dalek 1.0 | 4 | 7% | 34 |
| EBBU.Sim2 1.02 | 4 | 7% | 25 |
| germ.TheMind .2 | 2 | 4% | 20 |
| skm.Ryubot 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 92419 melee ticks, 28998 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 135 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 135 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 31452 sent, 26934 reached their opponent, 7917 virtual hits (29.4% of those reached).

## Melee bench: F38

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 411 over 6 battles (68.5 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 89.0 | 122 / 210 | 1.99 | 18.9% | 28976 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 18.9% | 122 |
| justin.Mallais 14.0 | 2.0 | 15.9% | 53 |
| bvh.mini.Freya 0.55 | 3.2 | 13.0% | 14 |
| bts.mega.Gnarly 1.4 | 4.0 | 11.7% | 16 |
| cs.Wren 1.0 | 5.3 | 10.3% | 4 |
| kdf.KoulDestroyer 1.0 | 5.7 | 9.2% | 1 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.0 | 8.0% | 0 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.8 | 6.1% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 3.3% | 0 |
| matt.UnderDark3 2.4.34 | 9.5 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 89.5 | 20 / 35 | 5303 |
| 2 | 1 | 69.0 | 91.4 | 18 / 35 | 4713 |
| 3 | 1 | 69.2 | 88.6 | 23 / 35 | 4757 |
| 4 | 1 | 70.1 | 90.8 | 24 / 35 | 5022 |
| 5 | 1 | 68.8 | 88.3 | 18 / 35 | 4847 |
| 6 | 1 | 68.1 | 85.7 | 19 / 35 | 4334 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 78 | 68% |
| bvh.mini.Freya 0.55 | 32 | 81% |
| bts.mega.Gnarly 1.4 | 27 | 70% |
| cs.Wren 1.0 | 13 | 100% |
| kdf.KoulDestroyer 1.0 | 7 | 86% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 100% |
| davidalves.net.DuelistNanoMelee 1.01 | 2 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 35 | 38% | 88 |
| bvh.mini.Freya 0.55 | 18 | 20% | 33 |
| bts.mega.Gnarly 1.4 | 14 | 15% | 36 |
| cs.Wren 1.0 | 8 | 9% | 25 |
| kdf.KoulDestroyer 1.0 | 8 | 9% | 12 |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 3% | 6 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 2% | 4 |
| bzdp.BoxCar 2.0 | 1 | 1% | 3 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 140590 melee ticks, 42791 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 105 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 105 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 45672 sent, 40630 reached their opponent, 8545 virtual hits (21.0% of those reached).

## Melee bench: F39

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 531 over 6 battles (88.5 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 88.3 | 108 / 210 | 2.06 | 19.1% | 32845 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 19.1% | 108 |
| bvh.fry.Freya 0.82 | 2.2 | 14.6% | 19 |
| az.Ololobot 0.2.4 | 3.0 | 13.6% | 56 |
| catcat20.Lambda 0.024 | 3.8 | 11.9% | 25 |
| gimp.GimpBot 0.1 | 5.5 | 7.9% | 1 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 8.0% | 1 |
| apollokidd.ApolloKidd 0.9 | 6.3 | 7.6% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 8.0 | 6.7% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.8% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 90.5 | 19 / 35 | 5322 |
| 2 | 1 | 68.9 | 88.9 | 17 / 35 | 5295 |
| 3 | 1 | 68.1 | 84.4 | 16 / 35 | 5496 |
| 4 | 1 | 69.5 | 89.8 | 20 / 35 | 5403 |
| 5 | 1 | 70.0 | 92.4 | 19 / 35 | 5623 |
| 6 | 1 | 68.0 | 83.5 | 17 / 35 | 5706 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 67 | 51% |
| bvh.fry.Freya 0.82 | 48 | 83% |
| catcat20.Lambda 0.024 | 36 | 64% |
| winamp32.micro.MicroMacro 1.0 | 4 | 75% |
| gimp.GimpBot 0.1 | 4 | 100% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 1 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 1115. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 39 | 36% | 78 |
| bvh.fry.Freya 0.82 | 30 | 28% | 56 |
| catcat20.Lambda 0.024 | 20 | 19% | 42 |
| winamp32.micro.MicroMacro 1.0 | 5 | 5% | 10 |
| gimp.GimpBot 0.1 | 4 | 4% | 14 |
| stelo.SoRobotNanoMelee 1.2 | 4 | 4% | 7 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 1 |
| apollokidd.ApolloKidd 0.9 | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 167257 melee ticks, 60922 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 39 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 2.

Targeting waves (204 rounds): 52136 sent, 47279 reached their opponent, 8343 virtual hits (17.6% of those reached).

## Melee bench: F40

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 769 over 6 battles (128.2 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 91.5 | 139 / 210 | 1.77 | 20.3% | 31591 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 20.3% | 139 |
| kawigi.mini.Coriantumr 1.1 | 2.2 | 14.5% | 28 |
| kano.gamma.KanoGamma 1.8 | 2.8 | 13.0% | 16 |
| mz.AntiGrav 1.0 | 4.5 | 10.9% | 8 |
| Polkwane.SmashMelee 1.0 | 4.7 | 10.5% | 7 |
| alpha.BlackIce 1.0 | 6.0 | 9.2% | 4 |
| stelo.Randomness 1.0 | 6.8 | 8.8% | 6 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.0% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 4.0% | 2 |
| sample.Corners 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 94.6 | 28 / 35 | 5360 |
| 2 | 1 | 71.1 | 94.0 | 22 / 35 | 5117 |
| 3 | 1 | 71.4 | 92.4 | 24 / 35 | 5517 |
| 4 | 1 | 70.5 | 89.8 | 21 / 35 | 5479 |
| 5 | 1 | 69.1 | 87.0 | 21 / 35 | 4764 |
| 6 | 1 | 70.8 | 91.1 | 23 / 35 | 5354 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 53 | 77% |
| kano.gamma.KanoGamma 1.8 | 49 | 84% |
| mz.AntiGrav 1.0 | 26 | 92% |
| Polkwane.SmashMelee 1.0 | 18 | 89% |
| stelo.Randomness 1.0 | 13 | 77% |
| alpha.BlackIce 1.0 | 8 | 75% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 871. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 24 | 31% | 60 |
| kano.gamma.KanoGamma 1.8 | 17 | 22% | 58 |
| stelo.Randomness 1.0 | 9 | 12% | 25 |
| mz.AntiGrav 1.0 | 8 | 10% | 29 |
| Polkwane.SmashMelee 1.0 | 7 | 9% | 17 |
| alpha.BlackIce 1.0 | 5 | 6% | 15 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 2 |
| amk.superstrike.SuperStrike 0.3 | 0 | 0% | 3 |
| sample.Corners 1.0 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 155001 melee ticks, 41622 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 88 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 88 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 50284 sent, 45329 reached their opponent, 8990 virtual hits (19.8% of those reached).

## Melee bench: F41

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 165 over 6 battles (27.5 per battle, most in one battle 91). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 89.3 | 116 / 210 | 1.97 | 18.8% | 27490 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 18.8% | 116 |
| eem.EvBotNG v12.8 | 2.0 | 15.8% | 61 |
| ary.Swarm 1.1 | 3.2 | 13.4% | 16 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.3% | 11 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.7% | 4 |
| shrub.Silver v048 | 6.0 | 9.1% | 3 |
| zyx.nano.Ant 1.1 | 7.0 | 7.7% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 5.0% | 0 |
| stelo.Mirror 1.1 | 8.5 | 5.0% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 94.9 | 27 / 35 | 5192 |
| 2 | 1 | 68.7 | 90.8 | 17 / 35 | 4323 |
| 3 | 1 | 68.7 | 87.3 | 17 / 35 | 4565 |
| 4 | 1 | 68.4 | 87.0 | 14 / 35 | 4491 |
| 5 | 1 | 68.4 | 87.0 | 19 / 35 | 4493 |
| 6 | 1 | 69.1 | 88.6 | 22 / 35 | 4426 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 79 | 56% |
| lessonz.robocode.Oz 0.5.0 | 34 | 85% |
| ary.Swarm 1.1 | 25 | 80% |
| simonton.nano.MeleeSeed 1.8 | 15 | 100% |
| shrub.Silver v048 | 6 | 83% |
| zyx.nano.Ant 1.1 | 3 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 937. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 55 | 58% | 98 |
| ary.Swarm 1.1 | 17 | 18% | 34 |
| lessonz.robocode.Oz 0.5.0 | 14 | 15% | 40 |
| simonton.nano.MeleeSeed 1.8 | 4 | 4% | 19 |
| shrub.Silver v048 | 2 | 2% | 9 |
| zyx.nano.Ant 1.1 | 1 | 1% | 4 |
| jsal.Jsalbot 1.0 | 1 | 1% | 3 |
| stelo.Mirror 1.1 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 152474 melee ticks, 49738 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 47 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 49883 sent, 45040 reached their opponent, 6694 virtual hits (14.9% of those reached).

## Melee bench: F42

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 188 over 6 battles (31.3 per battle, most in one battle 117). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 92.6 | 143 / 210 | 1.67 | 20.6% | 35741 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 20.6% | 143 |
| wompi.Wallaby 5.1 | 2.0 | 15.0% | 29 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.3% | 8 |
| ara.Shera 0.88 | 3.7 | 13.1% | 28 |
| amz.NanoClone 1.41 | 5.0 | 9.2% | 0 |
| maribo.IotaCT 1.1 | 6.8 | 6.3% | 0 |
| dsw.StaticD 1.0 | 6.8 | 6.5% | 2 |
| mme.NikeEnhanced 2.0 | 8.0 | 5.6% | 0 |
| stelo.MirrorMicro 1.0 | 8.3 | 5.7% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 93.3 | 25 / 35 | 6081 |
| 2 | 1 | 71.9 | 93.3 | 26 / 35 | 6219 |
| 3 | 1 | 71.1 | 90.5 | 21 / 35 | 6135 |
| 4 | 1 | 68.9 | 89.5 | 20 / 35 | 5328 |
| 5 | 1 | 72.8 | 96.5 | 28 / 35 | 6332 |
| 6 | 1 | 70.4 | 92.4 | 23 / 35 | 5646 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 85 | 85% |
| maribo.mini.MiniQuester 0.1 | 48 | 96% |
| ara.Shera 0.88 | 30 | 53% |
| dsw.StaticD 1.0 | 6 | 67% |
| amz.NanoClone 1.41 | 3 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 961. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 28 | 41% | 51 |
| wompi.Wallaby 5.1 | 22 | 32% | 94 |
| maribo.mini.MiniQuester 0.1 | 11 | 16% | 47 |
| dsw.StaticD 1.0 | 5 | 7% | 9 |
| amz.NanoClone 1.41 | 1 | 1% | 3 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 2 |
| maribo.IotaCT 1.1 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 163727 melee ticks, 54787 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 34 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 52013 sent, 47232 reached their opponent, 9289 virtual hits (19.7% of those reached).

## Melee bench: F43

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 638 over 6 battles (106.3 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 80.3 | 47 / 210 | 2.77 | 16.2% | 25427 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.2% | 133 |
| hadur117.Hadur 3.20ed | 2.0 | 16.2% | 47 |
| brainfade.melee.Dusk 0.44 | 3.5 | 12.1% | 17 |
| dummy.micro.Sparrow 2.5 | 3.8 | 12.2% | 9 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 11.1% | 4 |
| Krabb.akim2.Akim2 1.1b | 6.2 | 9.2% | 1 |
| jab.DiamondStealer 5 | 7.2 | 7.7% | 0 |
| mz.NanoGod 2.02 | 7.7 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.7% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 77.1 | 8 / 35 | 4072 |
| 2 | 2 | 67.2 | 81.9 | 10 / 35 | 4266 |
| 3 | 2 | 66.1 | 80.0 | 6 / 35 | 4125 |
| 4 | 2 | 66.0 | 79.4 | 7 / 35 | 4309 |
| 5 | 2 | 66.3 | 80.3 | 7 / 35 | 4120 |
| 6 | 2 | 67.6 | 83.2 | 9 / 35 | 4535 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 88 | 26% |
| brainfade.melee.Dusk 0.44 | 12 | 50% |
| dummy.micro.Sparrow 2.5 | 12 | 75% |
| wcsv.melee.EngineerMelee 0.1 | 8 | 88% |
| jab.DiamondStealer 5 | 1 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 169 of 210 rounds, at a mean tick of 984. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 96 | 57% | 119 |
| brainfade.melee.Dusk 0.44 | 25 | 15% | 32 |
| dummy.micro.Sparrow 2.5 | 16 | 9% | 23 |
| wcsv.melee.EngineerMelee 0.1 | 14 | 8% | 21 |
| mz.NanoGod 2.02 | 6 | 4% | 6 |
| Krabb.akim2.Akim2 1.1b | 3 | 2% | 5 |
| jab.DiamondStealer 5 | 2 | 1% | 3 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 150387 melee ticks, 57665 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 121 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 121 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 48560 sent, 43568 reached their opponent, 7279 virtual hits (16.7% of those reached).

## Melee bench: F44

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 292 over 6 battles (48.7 per battle, most in one battle 117). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 93.4 | 147 / 210 | 1.60 | 21.3% | 36445 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 21.3% | 147 |
| stelo.Liblix 0.3.1 | 2.2 | 15.7% | 45 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.3% | 12 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.7 | 9.1% | 1 |
| jwirde.Gort 2.0 | 4.7 | 9.2% | 3 |
| wompi.Quokka 1.6 | 6.5 | 7.1% | 0 |
| stf.PanzerGeneral 0.1 | 7.0 | 7.1% | 0 |
| disan.Chair 2.2.0 | 7.2 | 7.2% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.6% | 1 |
| sample.Crazy 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 93.3 | 25 / 35 | 6196 |
| 2 | 1 | 70.8 | 90.5 | 23 / 35 | 5679 |
| 3 | 1 | 72.8 | 96.5 | 28 / 35 | 6100 |
| 4 | 1 | 72.5 | 94.6 | 25 / 35 | 6545 |
| 5 | 1 | 71.2 | 91.7 | 23 / 35 | 5900 |
| 6 | 1 | 71.7 | 93.7 | 23 / 35 | 6025 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 83 | 72% |
| tzu.TheArtOfWar 1.2 | 69 | 94% |
| jwirde.Gort 2.0 | 8 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 83% |
| disan.Chair 2.2.0 | 5 | 80% |
| wompi.Quokka 1.6 | 4 | 100% |
| sample.Crazy 1.0 | 1 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 0% |

Hadur died in 65 of 210 rounds, at a mean tick of 917. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 37 | 57% | 104 |
| tzu.TheArtOfWar 1.2 | 11 | 17% | 60 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 9% | 12 |
| jwirde.Gort 2.0 | 4 | 6% | 17 |
| amk.jointstrike.JointStrike 0.2 | 2 | 3% | 5 |
| disan.Chair 2.2.0 | 1 | 2% | 6 |
| wompi.Quokka 1.6 | 1 | 2% | 3 |
| stf.PanzerGeneral 0.1 | 1 | 2% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 156110 melee ticks, 48890 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 39 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 52624 sent, 47946 reached their opponent, 10110 virtual hits (21.1% of those reached).

## Melee bench: F45

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 332 over 6 battles (55.3 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 89.8 | 118 / 210 | 1.92 | 20.0% | 32677 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.0 | 20.0% | 118 |
| jje.BagPuss 1.2 | 2.3 | 12.8% | 8 |
| eem.IWillFireNoBullet v2.8 | 3.3 | 11.1% | 61 |
| sul.Lunar 1.1 | 4.3 | 10.8% | 10 |
| myl.nano.Graviton 1.10 | 4.5 | 10.7% | 5 |
| fm.claire 1.7 | 6.5 | 8.6% | 0 |
| hvilela.HVilela 0.9 | 7.0 | 8.1% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.2 | 8.1% | 3 |
| wit.Deep7 2.0 | 9.0 | 5.8% | 4 |
| abud.ThirdRobo 1.0 | 9.8 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 91.7 | 20 / 35 | 5591 |
| 2 | 1 | 70.0 | 89.5 | 21 / 35 | 5562 |
| 3 | 1 | 71.6 | 94.3 | 26 / 35 | 5573 |
| 4 | 1 | 67.4 | 82.2 | 16 / 35 | 5205 |
| 5 | 1 | 70.3 | 90.5 | 18 / 35 | 5675 |
| 6 | 1 | 69.4 | 90.5 | 17 / 35 | 5071 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 67 | 49% |
| jje.BagPuss 1.2 | 36 | 86% |
| sul.Lunar 1.1 | 25 | 80% |
| pez.mini.ChironexFleckeri 0.5 | 16 | 94% |
| myl.nano.Graviton 1.10 | 13 | 85% |
| fm.claire 1.7 | 5 | 100% |
| wit.Deep7 2.0 | 3 | 67% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 1414. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 38 | 40% | 0 |
| jje.BagPuss 1.2 | 20 | 21% | 80 |
| myl.nano.Graviton 1.10 | 14 | 15% | 32 |
| sul.Lunar 1.1 | 8 | 8% | 43 |
| fm.claire 1.7 | 5 | 5% | 19 |
| pez.mini.ChironexFleckeri 0.5 | 4 | 4% | 17 |
| wit.Deep7 2.0 | 2 | 2% | 8 |
| hvilela.HVilela 0.9 | 2 | 2% | 7 |
| abud.ThirdRobo 1.0 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 189268 melee ticks, 76992 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 72 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 59411 sent, 54633 reached their opponent, 8183 virtual hits (15.0% of those reached).

## Melee bench: F46

hadur117.Hadur 3.20ed against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 489 over 6 battles (81.5 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 85.6 | 58 / 210 | 2.30 | 16.9% | 26030 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20ed | 1.8 | 16.9% | 58 |
| rsalesc.melee.Medina 0.4.5 | 2.0 | 16.9% | 76 |
| kc.mini.Mirage 0.2 | 2.2 | 16.8% | 65 |
| mz.MicroSheep 1.0 | 4.5 | 10.0% | 1 |
| cx.Princess 1.0 | 5.3 | 9.6% | 9 |
| sadoner.killer 0.2 | 5.7 | 8.9% | 1 |
| arthord.NanoSatanMelee Beta | 6.5 | 7.8% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.3 | 5.3% | 0 |
| kurios.DOSexe .9a | 8.7 | 5.1% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 87.0 | 12 / 35 | 4774 |
| 2 | 1 | 67.1 | 86.0 | 10 / 35 | 4523 |
| 3 | 3 | 66.5 | 86.0 | 7 / 35 | 4188 |
| 4 | 3 | 65.5 | 82.2 | 9 / 35 | 4015 |
| 5 | 1 | 67.3 | 88.3 | 10 / 35 | 4361 |
| 6 | 2 | 66.0 | 84.1 | 10 / 35 | 4169 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 58 | 45% |
| rsalesc.melee.Medina 0.4.5 | 50 | 36% |
| cx.Princess 1.0 | 8 | 75% |
| arthord.NanoSatanMelee Beta | 5 | 80% |
| mz.MicroSheep 1.0 | 4 | 75% |
| sadoner.killer 0.2 | 2 | 50% |

Hadur died in 157 of 210 rounds, at a mean tick of 1003. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 76 | 48% | 103 |
| rsalesc.melee.Medina 0.4.5 | 52 | 33% | 68 |
| cx.Princess 1.0 | 9 | 6% | 14 |
| mz.MicroSheep 1.0 | 5 | 3% | 11 |
| sadoner.killer 0.2 | 5 | 3% | 6 |
| arthord.NanoSatanMelee Beta | 4 | 3% | 7 |
| kurios.DOSexe .9a | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 166586 melee ticks, 43555 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 41 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 47112 sent, 42163 reached their opponent, 6126 virtual hits (14.5% of those reached).

