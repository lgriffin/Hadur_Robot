# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 314 over 10 battles (31.4 per battle, most in one battle 46). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.7 | 87 / 350 | 2.29 | 17.8% | 56151 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.1 | 19.7% | 235 |
| hadur117.Hadur 3.24bb | 1.9 | 17.8% | 87 |
| sgp.JollyNinja 3.53 | 3.3 | 11.6% | 19 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 10.7% | 3 |
| mz.MicroGodMelee 1 | 4.7 | 10.3% | 6 |
| lorneswork.Predator 1.0 | 5.7 | 9.8% | 1 |
| adt.Ar2 1.0 | 7.0 | 7.8% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.1 | 5.2% | 0 |
| skm.butterfly 1.0 | 8.9 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.9 | 89.8 | 8 / 35 | 5720 |
| 2 | 2 | 66.7 | 83.8 | 7 / 35 | 5075 |
| 3 | 2 | 68.0 | 84.1 | 10 / 35 | 5715 |
| 4 | 2 | 66.9 | 82.2 | 6 / 35 | 5442 |
| 5 | 2 | 67.7 | 86.0 | 7 / 35 | 5583 |
| 6 | 2 | 69.1 | 87.6 | 9 / 35 | 5760 |
| 7 | 2 | 67.6 | 83.5 | 9 / 35 | 5516 |
| 8 | 2 | 68.2 | 87.0 | 10 / 35 | 5505 |
| 9 | 1 | 69.3 | 89.2 | 13 / 35 | 5855 |
| 10 | 2 | 68.1 | 83.8 | 8 / 35 | 5980 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 217 | 13% |
| sgp.JollyNinja 3.53 | 29 | 76% |
| mz.MicroGodMelee 1 | 19 | 89% |
| lorneswork.Predator 1.0 | 10 | 90% |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 90% |
| adt.Ar2 1.0 | 2 | 100% |

Hadur died in 264 of 350 rounds, at a mean tick of 1163. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 201 | 76% | 234 |
| lorneswork.Predator 1.0 | 19 | 7% | 28 |
| sgp.JollyNinja 3.53 | 17 | 6% | 32 |
| simonton.nano.WeekendObsession_Melee 1.0 | 12 | 5% | 21 |
| mz.MicroGodMelee 1 | 10 | 4% | 27 |
| adt.Ar2 1.0 | 4 | 2% | 8 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 332 rounds): 227378 melee ticks, 152418 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 81 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 81 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 1.

Targeting waves (332 rounds): 71017 sent, 62913 reached their opponent, 11973 virtual hits (19.0% of those reached).

## Melee bench: F02

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 434 over 10 battles (43.4 per battle, most in one battle 50). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 88.2 | 187 / 350 | 2.06 | 19.5% | 54615 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 19.5% | 187 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 13.4% | 40 |
| pulsar.PulsarMax 0.8.9 | 2.6 | 13.9% | 69 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 11.3% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.7 | 10.4% | 23 |
| fnc.bandit.Bandit 5.2.0 | 6.9 | 7.6% | 0 |
| sch.Simone 0.3d | 6.9 | 7.8% | 13 |
| Noran.BitchingElk 0.054 | 7.1 | 7.5% | 16 |
| stelo.PatternRobot 1.0 | 9.2 | 4.8% | 1 |
| fullsail.SweetTea 1.1 | 9.8 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 89.2 | 20 / 35 | 5612 |
| 2 | 1 | 69.4 | 88.9 | 20 / 35 | 5297 |
| 3 | 1 | 68.4 | 86.0 | 17 / 35 | 5165 |
| 4 | 1 | 69.3 | 86.7 | 20 / 35 | 5317 |
| 5 | 1 | 68.3 | 85.4 | 16 / 35 | 5235 |
| 6 | 1 | 71.1 | 92.1 | 23 / 35 | 5780 |
| 7 | 1 | 69.8 | 89.2 | 16 / 35 | 5591 |
| 8 | 1 | 70.0 | 89.8 | 19 / 35 | 5503 |
| 9 | 1 | 70.4 | 90.5 | 19 / 35 | 5650 |
| 10 | 1 | 68.4 | 84.1 | 17 / 35 | 5465 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 87 | 54% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 68 | 75% |
| com.cohesiva.robocode.ManOwaR 1.0 | 47 | 70% |
| sch.Simone 0.3d | 26 | 88% |
| Noran.BitchingElk 0.054 | 20 | 45% |
| lrem.micro.SpikeSoldier 0.4 | 17 | 94% |
| fnc.bandit.Bandit 5.2.0 | 5 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |
| stelo.PatternRobot 1.0 | 1 | 100% |

Hadur died in 163 of 350 rounds, at a mean tick of 1004. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 55 | 34% | 94 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 32 | 20% | 92 |
| com.cohesiva.robocode.ManOwaR 1.0 | 23 | 14% | 60 |
| lrem.micro.SpikeSoldier 0.4 | 19 | 12% | 26 |
| Noran.BitchingElk 0.054 | 13 | 8% | 23 |
| sch.Simone 0.3d | 12 | 7% | 36 |
| stelo.PatternRobot 1.0 | 6 | 4% | 6 |
| fnc.bandit.Bandit 5.2.0 | 2 | 1% | 9 |
| fullsail.SweetTea 1.1 | 1 | 1% | 3 |

Posture (Hadur's M records, 332 rounds): 276671 melee ticks, 75604 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 63 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 0.

Targeting waves (332 rounds): 95118 sent, 87152 reached their opponent, 13944 virtual hits (16.0% of those reached).

## Melee bench: F03

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 362 over 10 battles (36.2 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 95.1 | 298 / 350 | 1.44 | 21.6% | 67570 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 21.6% | 298 |
| radnor.DoctorBob 1.42 | 2.3 | 13.5% | 14 |
| kawigi.nano.Lib 1.0 | 3.0 | 12.9% | 11 |
| vuen.Cake 2.51 | 3.7 | 12.1% | 24 |
| urdos.URDOS 1.3 | 5.0 | 9.1% | 2 |
| adt.Ar1 2.1 | 6.2 | 7.6% | 0 |
| oa.weak.FlyMk1 0.1 | 7.4 | 6.7% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.6 | 6.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.3% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 88.3 | 26 / 35 | 6296 |
| 2 | 1 | 71.1 | 91.4 | 29 / 35 | 6620 |
| 3 | 1 | 73.3 | 98.7 | 32 / 35 | 7024 |
| 4 | 1 | 71.8 | 94.3 | 30 / 35 | 6678 |
| 5 | 1 | 72.2 | 97.1 | 29 / 35 | 6830 |
| 6 | 1 | 73.1 | 99.4 | 33 / 35 | 6761 |
| 7 | 1 | 72.2 | 96.5 | 30 / 35 | 6704 |
| 8 | 1 | 72.2 | 95.6 | 28 / 35 | 6794 |
| 9 | 1 | 73.1 | 97.8 | 32 / 35 | 7095 |
| 10 | 1 | 71.6 | 92.1 | 29 / 35 | 6768 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 109 | 90% |
| radnor.DoctorBob 1.42 | 96 | 98% |
| kawigi.nano.Lib 1.0 | 78 | 95% |
| oa.weak.FlyMk1 0.1 | 13 | 92% |
| urdos.URDOS 1.3 | 9 | 100% |
| adt.Ar1 2.1 | 8 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |

Hadur died in 52 of 350 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 15 | 29% | 96 |
| vuen.Cake 2.51 | 14 | 27% | 107 |
| kawigi.nano.Lib 1.0 | 10 | 19% | 70 |
| urdos.URDOS 1.3 | 5 | 10% | 21 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 8% | 5 |
| oa.weak.FlyMk1 0.1 | 2 | 4% | 19 |
| adt.Ar1 2.1 | 2 | 4% | 15 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 4 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 331 rounds): 203984 melee ticks, 77746 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 71 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 1.

Targeting waves (331 rounds): 61249 sent, 53255 reached their opponent, 13131 virtual hits (24.7% of those reached).

## Melee bench: F04

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 205 over 10 battles (20.5 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.6 | 51 / 350 | 2.20 | 18.1% | 60260 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.3% | 279 |
| hadur117.Hadur 3.24bb | 2.0 | 18.1% | 51 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.7% | 18 |
| TNT.TNT 0.99.1 | 4.2 | 10.3% | 3 |
| josago.Jorgito 0.16 | 4.8 | 9.4% | 1 |
| css.Delitioner 0.11 | 6.6 | 7.0% | 0 |
| tj.zombie1n 1.0.1 | 6.7 | 6.6% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.2% | 0 |
| spin.Bugstard 0.012b | 9.3 | 3.7% | 0 |
| sp.Nanos.Ember 1.1 | 9.6 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.4 | 84.4 | 10 / 35 | 6141 |
| 2 | 2 | 70.0 | 88.3 | 5 / 35 | 6600 |
| 3 | 2 | 69.4 | 88.6 | 5 / 35 | 6006 |
| 4 | 2 | 69.5 | 88.3 | 6 / 35 | 5901 |
| 5 | 2 | 69.1 | 86.7 | 5 / 35 | 6247 |
| 6 | 2 | 68.3 | 82.9 | 6 / 35 | 5964 |
| 7 | 2 | 68.3 | 86.3 | 2 / 35 | 5873 |
| 8 | 2 | 68.4 | 85.7 | 4 / 35 | 5679 |
| 9 | 2 | 68.8 | 86.7 | 3 / 35 | 5859 |
| 10 | 2 | 69.3 | 88.6 | 5 / 35 | 5990 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 237 | 10% |
| apc.LeeroyJenkins2 1.0 | 24 | 58% |
| TNT.TNT 0.99.1 | 11 | 73% |
| css.Delitioner 0.11 | 2 | 100% |
| josago.Jorgito 0.16 | 2 | 100% |
| rampancy.Durandal 2.1d | 1 | 100% |

Hadur died in 302 of 350 rounds, at a mean tick of 1336. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 234 | 77% | 262 |
| apc.LeeroyJenkins2 1.0 | 39 | 13% | 51 |
| TNT.TNT 0.99.1 | 11 | 4% | 18 |
| josago.Jorgito 0.16 | 10 | 3% | 11 |
| css.Delitioner 0.11 | 3 | 1% | 4 |
| rampancy.Durandal 2.1d | 2 | 1% | 3 |
| tj.zombie1n 1.0.1 | 1 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 330 rounds): 309745 melee ticks, 134653 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 65 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 2.

Targeting waves (330 rounds): 92598 sent, 84494 reached their opponent, 11843 virtual hits (14.0% of those reached).

## Melee bench: F05

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 323 over 10 battles (32.3 per battle, most in one battle 44). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 80.4 | 56 / 350 | 2.77 | 16.0% | 44390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.3% | 188 |
| justin.DemonicRage 3.4 | 2.3 | 16.6% | 83 |
| hadur117.Hadur 3.24bb | 2.7 | 16.0% | 56 |
| wompi.Numbat 2.1 | 4.1 | 12.1% | 15 |
| axeBots.HataMoto 3.09 | 5.4 | 9.2% | 7 |
| ms.Ares 0.19 | 5.5 | 9.1% | 1 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.2 | 5.7% | 0 |
| supersample.SuperBoxBot 1.0 | 7.8 | 5.3% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.4 | 3.8% | 0 |
| GarmBox.Oranges 1.0 | 9.6 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.0 | 79.0 | 5 / 35 | 4348 |
| 2 | 3 | 63.9 | 75.9 | 6 / 35 | 3864 |
| 3 | 3 | 64.3 | 78.4 | 3 / 35 | 4202 |
| 4 | 2 | 65.8 | 82.2 | 7 / 35 | 4419 |
| 5 | 3 | 65.2 | 80.0 | 5 / 35 | 4331 |
| 6 | 3 | 66.4 | 81.0 | 6 / 35 | 4618 |
| 7 | 3 | 64.8 | 79.4 | 4 / 35 | 4301 |
| 8 | 2 | 67.7 | 82.9 | 7 / 35 | 5251 |
| 9 | 3 | 66.1 | 81.3 | 5 / 35 | 4699 |
| 10 | 2 | 66.2 | 83.8 | 8 / 35 | 4357 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 75 | 8% |
| justin.DemonicRage 3.4 | 64 | 38% |
| wompi.Numbat 2.1 | 22 | 82% |
| axeBots.HataMoto 3.09 | 10 | 60% |
| ms.Ares 0.19 | 1 | 100% |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 100% |

Hadur died in 294 of 350 rounds, at a mean tick of 940. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 115 | 39% | 129 |
| justin.DemonicRage 3.4 | 106 | 36% | 124 |
| wompi.Numbat 2.1 | 43 | 15% | 55 |
| axeBots.HataMoto 3.09 | 11 | 4% | 17 |
| ms.Ares 0.19 | 11 | 4% | 15 |
| supersample.SuperBoxBot 1.0 | 6 | 2% | 7 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 0% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 0% | 1 |

Posture (Hadur's M records, 335 rounds): 263287 melee ticks, 57416 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (335 rounds): longest scan gap while four or more were alive 63 ticks (335 rounds over 8); rounds whose longest gap at any count was over 8: 335; robots dropped as dead without a death event: 0.

Targeting waves (335 rounds): 77666 sent, 69211 reached their opponent, 10680 virtual hits (15.4% of those reached).

## Melee bench: F06

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 371 over 10 battles (37.1 per battle, most in one battle 44). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 92.6 | 252 / 350 | 1.66 | 20.9% | 58871 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 20.9% | 252 |
| jekl.StoneGhost 0.7 | 2.5 | 13.9% | 30 |
| origin.SleepSiphon 1.7b | 2.6 | 13.3% | 46 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.2 | 11.3% | 16 |
| mld.Wisdom 1.0 | 4.7 | 10.5% | 2 |
| gg.Wolverine 2.0 | 6.0 | 8.8% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 6.7% | 2 |
| DBall.NUKE 0.1 | 8.3 | 6.1% | 2 |
| spinnercat.Omen 1.0 | 8.5 | 6.0% | 0 |
| sample.Fire 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 88.6 | 22 / 35 | 5504 |
| 2 | 1 | 72.0 | 91.4 | 25 / 35 | 6381 |
| 3 | 1 | 70.3 | 90.8 | 24 / 35 | 5292 |
| 4 | 1 | 73.4 | 97.1 | 30 / 35 | 6691 |
| 5 | 1 | 71.9 | 94.9 | 26 / 35 | 5681 |
| 6 | 1 | 70.6 | 92.4 | 23 / 35 | 5364 |
| 7 | 1 | 72.2 | 94.6 | 27 / 35 | 6001 |
| 8 | 1 | 71.1 | 92.1 | 23 / 35 | 6022 |
| 9 | 1 | 71.1 | 91.7 | 23 / 35 | 5796 |
| 10 | 1 | 71.9 | 92.7 | 29 / 35 | 6139 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 97 | 87% |
| jekl.StoneGhost 0.7 | 91 | 92% |
| pe.minimelee.SandboxMiniMelee 1.1 | 52 | 83% |
| gg.Wolverine 2.0 | 22 | 95% |
| ers.nano.hawk.HawkLA 3.0m | 10 | 90% |
| mld.Wisdom 1.0 | 7 | 86% |
| DBall.NUKE 0.1 | 5 | 100% |

Hadur died in 100 of 350 rounds, at a mean tick of 922. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 36 | 36% | 122 |
| jekl.StoneGhost 0.7 | 22 | 22% | 82 |
| pe.minimelee.SandboxMiniMelee 1.1 | 16 | 16% | 64 |
| mld.Wisdom 1.0 | 11 | 11% | 34 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 5% | 24 |
| gg.Wolverine 2.0 | 4 | 4% | 10 |
| spinnercat.Omen 1.0 | 2 | 2% | 6 |
| DBall.NUKE 0.1 | 2 | 2% | 6 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 330 rounds): 241036 melee ticks, 80992 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 41 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 1.

Targeting waves (330 rounds): 72848 sent, 64863 reached their opponent, 13607 virtual hits (21.0% of those reached).

## Melee bench: F07

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 221 over 10 battles (22.1 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.5 | 94.2 | 227 / 350 | 1.53 | 21.7% | 70987 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 21.7% | 227 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 16.8% | 63 |
| rtk.Tachikoma 1.0 | 2.8 | 15.9% | 39 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.2% | 11 |
| franzor.Lizt 1.3.1 | 4.7 | 10.5% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 7.9% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.5% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.5% | 0 |
| sample.Target 1.0 | 9.2 | 2.2% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 93.0 | 20 / 35 | 7541 |
| 2 | 1 | 72.4 | 92.4 | 21 / 35 | 6799 |
| 3 | 1 | 73.6 | 95.6 | 25 / 35 | 6668 |
| 4 | 1 | 73.8 | 94.9 | 24 / 35 | 7149 |
| 5 | 1 | 73.1 | 92.7 | 23 / 35 | 7024 |
| 6 | 1 | 73.8 | 94.0 | 21 / 35 | 7466 |
| 7 | 1 | 74.4 | 96.8 | 27 / 35 | 7285 |
| 8 | 1 | 73.1 | 93.0 | 19 / 35 | 7033 |
| 9 | 1 | 73.0 | 92.7 | 22 / 35 | 6772 |
| 10 | 1 | 74.2 | 96.5 | 25 / 35 | 7250 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 157 | 83% |
| rsalesc.melee.Monk 0.3.6c | 79 | 39% |
| oog.melee.CapuletDroid 1.1 | 41 | 85% |
| franzor.Lizt 1.3.1 | 37 | 78% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 123 of 350 rounds, at a mean tick of 1381. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 60 | 49% | 114 |
| rtk.Tachikoma 1.0 | 41 | 33% | 156 |
| franzor.Lizt 1.3.1 | 11 | 9% | 6 |
| oog.melee.CapuletDroid 1.1 | 9 | 7% | 57 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 3 |
| skm.PateranBotlock2 1.0 | 1 | 1% | 2 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 7 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

Posture (Hadur's M records, 331 rounds): 296032 melee ticks, 143179 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 103 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 103 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 1.

Targeting waves (331 rounds): 86614 sent, 78561 reached their opponent, 15205 virtual hits (19.4% of those reached).

## Melee bench: F08

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 547 over 10 battles (54.7 per battle, most in one battle 64). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 93.3 | 237 / 350 | 1.61 | 20.4% | 53171 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 20.4% | 237 |
| shrub.Vapour v159 | 2.8 | 12.2% | 31 |
| tm.Yuugao 1.0 | 2.9 | 12.7% | 40 |
| Krabb.sliNk.Garm 0.9u | 3.7 | 11.2% | 26 |
| com.spp.robocode.MostlyHarmless 010 | 5.6 | 9.3% | 5 |
| jwst.DAD.DarkAndDarker 1.1 | 5.9 | 8.7% | 7 |
| m3thos.Eva00 1.1 | 6.1 | 8.6% | 2 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 6.6% | 2 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 5.3% | 0 |
| SHAM.WOW 1.4 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 91.4 | 22 / 35 | 5166 |
| 2 | 1 | 70.5 | 91.7 | 24 / 35 | 5367 |
| 3 | 1 | 70.6 | 94.6 | 22 / 35 | 5472 |
| 4 | 1 | 69.9 | 92.7 | 23 / 35 | 5058 |
| 5 | 1 | 70.3 | 93.3 | 23 / 35 | 5349 |
| 6 | 1 | 70.8 | 92.7 | 23 / 35 | 5595 |
| 7 | 1 | 71.3 | 97.5 | 28 / 35 | 5356 |
| 8 | 1 | 71.4 | 95.2 | 28 / 35 | 5532 |
| 9 | 1 | 70.2 | 93.0 | 22 / 35 | 5130 |
| 10 | 1 | 69.7 | 90.5 | 22 / 35 | 5146 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 83 | 76% |
| Krabb.sliNk.Garm 0.9u | 59 | 71% |
| shrub.Vapour v159 | 59 | 68% |
| com.spp.robocode.MostlyHarmless 010 | 38 | 95% |
| jwst.DAD.DarkAndDarker 1.1 | 28 | 89% |
| m3thos.Eva00 1.1 | 17 | 100% |
| qualidafial.MajorDick 1.0.1 | 10 | 80% |
| SHAM.WOW 1.4 | 5 | 100% |

Hadur died in 114 of 350 rounds, at a mean tick of 993. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 32 | 28% | 105 |
| shrub.Vapour v159 | 31 | 27% | 79 |
| Krabb.sliNk.Garm 0.9u | 26 | 23% | 49 |
| jwst.DAD.DarkAndDarker 1.1 | 11 | 10% | 35 |
| com.spp.robocode.MostlyHarmless 010 | 8 | 7% | 45 |
| m3thos.Eva00 1.1 | 3 | 3% | 15 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 5 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 2 |
| SHAM.WOW 1.4 | 0 | 0% | 14 |

Posture (Hadur's M records, 332 rounds): 247861 melee ticks, 78704 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 64 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 0.

Targeting waves (332 rounds): 78595 sent, 70267 reached their opponent, 12059 virtual hits (17.2% of those reached).

## Melee bench: F09

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 329 over 10 battles (32.9 per battle, most in one battle 44). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 78.5 | 108 / 350 | 2.93 | 16.1% | 39345 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.1% | 154 |
| hadur117.Hadur 3.24bb | 1.9 | 16.1% | 108 |
| kc.micro.Figment 1.0 | 2.9 | 13.8% | 32 |
| yagami.Tidus 0.11 | 4.4 | 10.9% | 8 |
| pedersen.Grishnakh 1.0 | 5.2 | 10.3% | 22 |
| mc2.enemy.Original 0.9 | 5.4 | 9.4% | 24 |
| dft.Calliope 5.6 | 7.0 | 7.4% | 2 |
| step.nanoPri 1.0 | 8.2 | 5.8% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 4.6% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 81.3 | 11 / 35 | 3997 |
| 2 | 2 | 64.9 | 79.0 | 10 / 35 | 3794 |
| 3 | 1 | 65.6 | 81.0 | 14 / 35 | 3930 |
| 4 | 1 | 65.3 | 80.6 | 11 / 35 | 4103 |
| 5 | 2 | 66.1 | 80.3 | 15 / 35 | 4151 |
| 6 | 2 | 63.3 | 74.0 | 9 / 35 | 3664 |
| 7 | 2 | 64.4 | 76.8 | 10 / 35 | 3942 |
| 8 | 2 | 65.1 | 78.4 | 10 / 35 | 3981 |
| 9 | 2 | 65.6 | 81.0 | 11 / 35 | 4138 |
| 10 | 3 | 62.4 | 72.7 | 7 / 35 | 3645 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 80 | 29% |
| kc.micro.Figment 1.0 | 55 | 80% |
| yagami.Tidus 0.11 | 20 | 80% |
| mc2.enemy.Original 0.9 | 19 | 58% |
| pedersen.Grishnakh 1.0 | 17 | 47% |
| dft.Calliope 5.6 | 6 | 83% |
| rdm.Dueler 0.4x | 1 | 100% |

Hadur died in 242 of 350 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 97 | 40% | 124 |
| kc.micro.Figment 1.0 | 40 | 17% | 84 |
| mc2.enemy.Original 0.9 | 34 | 14% | 49 |
| yagami.Tidus 0.11 | 22 | 9% | 30 |
| pedersen.Grishnakh 1.0 | 21 | 9% | 25 |
| dft.Calliope 5.6 | 14 | 6% | 20 |
| robar.nano.Assertive_Melee 0.2 | 7 | 3% | 8 |
| step.nanoPri 1.0 | 4 | 2% | 7 |
| rdm.Dueler 0.4x | 3 | 1% | 3 |

Posture (Hadur's M records, 333 rounds): 245898 melee ticks, 61603 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 41 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 1.

Targeting waves (333 rounds): 78012 sent, 70232 reached their opponent, 9675 virtual hits (13.8% of those reached).

## Melee bench: F10

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 462 over 10 battles (46.2 per battle, most in one battle 56). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 95.2 | 284 / 350 | 1.43 | 21.3% | 62086 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 21.3% | 284 |
| DTF.Kludgy 1.2b | 2.0 | 14.3% | 30 |
| ne.Chimera 1.2 | 3.0 | 12.6% | 12 |
| ejb.Polaris 1.0.1 | 4.0 | 12.2% | 16 |
| vStar.RAFzilla 2.15 | 5.4 | 10.3% | 4 |
| tvv.micro.Antares 1.1.1 | 5.6 | 9.8% | 3 |
| kurios.DOSexe .9b | 7.9 | 5.3% | 0 |
| sam.Samspin 1.0 | 8.0 | 5.2% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.7 | 4.8% | 0 |
| donjezza.Muncho 1.0 | 9.4 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 98.4 | 31 / 35 | 7016 |
| 2 | 1 | 71.5 | 94.3 | 27 / 35 | 6102 |
| 3 | 1 | 72.6 | 97.8 | 31 / 35 | 6184 |
| 4 | 1 | 72.1 | 94.3 | 27 / 35 | 6156 |
| 5 | 1 | 71.6 | 95.2 | 29 / 35 | 5980 |
| 6 | 1 | 71.2 | 93.7 | 27 / 35 | 5759 |
| 7 | 1 | 72.2 | 95.9 | 29 / 35 | 6232 |
| 8 | 1 | 72.3 | 93.7 | 27 / 35 | 6536 |
| 9 | 1 | 72.3 | 96.2 | 30 / 35 | 6181 |
| 10 | 1 | 71.0 | 93.0 | 26 / 35 | 5940 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 107 | 84% |
| ejb.Polaris 1.0.1 | 73 | 92% |
| ne.Chimera 1.2 | 67 | 96% |
| vStar.RAFzilla 2.15 | 36 | 97% |
| tvv.micro.Antares 1.1.1 | 16 | 100% |
| kurios.DOSexe .9b | 6 | 100% |
| donjezza.Muncho 1.0 | 5 | 80% |
| sam.Samspin 1.0 | 2 | 100% |

Hadur died in 68 of 350 rounds, at a mean tick of 877. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 32 | 47% | 115 |
| ne.Chimera 1.2 | 15 | 22% | 70 |
| ejb.Polaris 1.0.1 | 8 | 12% | 76 |
| vStar.RAFzilla 2.15 | 4 | 6% | 39 |
| tvv.micro.Antares 1.1.1 | 4 | 6% | 16 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 3% | 2 |
| kurios.DOSexe .9b | 1 | 1% | 17 |
| sam.Samspin 1.0 | 1 | 1% | 6 |
| donjezza.Muncho 1.0 | 1 | 1% | 5 |

Posture (Hadur's M records, 330 rounds): 226236 melee ticks, 95514 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 57 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 0.

Targeting waves (330 rounds): 73636 sent, 65556 reached their opponent, 11621 virtual hits (17.7% of those reached).

## Melee bench: F11

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 385 over 10 battles (38.5 per battle, most in one battle 49). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 82.7 | 114 / 350 | 2.56 | 16.7% | 40256 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.5 | 16.5% | 108 |
| hadur117.Hadur 3.24bb | 1.5 | 16.7% | 114 |
| cx.mini.Nimrod 0.55 | 3.3 | 12.3% | 39 |
| djc.DynaBot 0.1.1 | 4.1 | 11.0% | 24 |
| rdt199.Warlord 0.73 | 5.7 | 9.2% | 28 |
| br2.MobyDickBot 1.6 | 5.7 | 9.0% | 21 |
| uji.YellohFellah 1.0 | 7.0 | 8.1% | 15 |
| KiraNL.Chupacabra 0.4 | 7.2 | 7.5% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.3% | 1 |
| stelo.MirrorNano 1.3 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.3 | 80.3 | 8 / 35 | 3928 |
| 2 | 1 | 65.1 | 80.3 | 11 / 35 | 3932 |
| 3 | 2 | 65.2 | 80.3 | 10 / 35 | 4372 |
| 4 | 2 | 63.3 | 78.1 | 8 / 35 | 3831 |
| 5 | 1 | 66.2 | 84.4 | 13 / 35 | 4001 |
| 6 | 1 | 67.2 | 87.6 | 15 / 35 | 4219 |
| 7 | 2 | 65.1 | 83.5 | 11 / 35 | 3659 |
| 8 | 1 | 64.8 | 82.5 | 11 / 35 | 3924 |
| 9 | 1 | 67.1 | 87.9 | 13 / 35 | 4169 |
| 10 | 2 | 66.2 | 81.9 | 14 / 35 | 4221 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 89 | 47% |
| djc.DynaBot 0.1.1 | 34 | 71% |
| cx.mini.Nimrod 0.55 | 34 | 56% |
| br2.MobyDickBot 1.6 | 19 | 47% |
| rdt199.Warlord 0.73 | 19 | 32% |
| uji.YellohFellah 1.0 | 15 | 87% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 0% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 236 of 350 rounds, at a mean tick of 927. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 93 | 39% | 135 |
| cx.mini.Nimrod 0.55 | 37 | 16% | 57 |
| djc.DynaBot 0.1.1 | 33 | 14% | 53 |
| rdt199.Warlord 0.73 | 28 | 12% | 41 |
| br2.MobyDickBot 1.6 | 20 | 8% | 29 |
| uji.YellohFellah 1.0 | 10 | 4% | 17 |
| KiraNL.Chupacabra 0.4 | 9 | 4% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 2% | 5 |
| stelo.MirrorNano 1.3 | 2 | 1% | 2 |

Posture (Hadur's M records, 335 rounds): 260764 melee ticks, 64921 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (335 rounds): longest scan gap while four or more were alive 56 ticks (335 rounds over 8); rounds whose longest gap at any count was over 8: 335; robots dropped as dead without a death event: 1.

Targeting waves (335 rounds): 83033 sent, 74686 reached their opponent, 9764 virtual hits (13.1% of those reached).

## Melee bench: F12

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 357 over 10 battles (35.7 per battle, most in one battle 45). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 88.0 | 210 / 350 | 2.08 | 18.7% | 42909 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 18.7% | 210 |
| bts.wiki.RipCurl 0.9b | 2.4 | 14.0% | 44 |
| nat.PallasHawk 1.0 | 2.9 | 13.6% | 58 |
| darkcanuck.Leon 1.01 | 3.8 | 12.1% | 21 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.2% | 9 |
| jrm.Test0 1.0 | 6.2 | 8.0% | 1 |
| cs.sheldor.Talon 1.1 | 7.1 | 6.6% | 0 |
| jp.Perpy 16.0 | 8.4 | 5.9% | 2 |
| stuff.Vlad 0.1 | 8.9 | 5.6% | 0 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.3% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 87.6 | 25 / 35 | 4659 |
| 2 | 1 | 69.0 | 91.1 | 21 / 35 | 4465 |
| 3 | 1 | 67.9 | 88.6 | 20 / 35 | 3939 |
| 4 | 1 | 68.3 | 86.7 | 22 / 35 | 4087 |
| 5 | 1 | 66.6 | 82.2 | 16 / 35 | 4336 |
| 6 | 1 | 67.9 | 87.9 | 21 / 35 | 4038 |
| 7 | 1 | 69.5 | 91.7 | 24 / 35 | 4462 |
| 8 | 1 | 69.6 | 91.1 | 22 / 35 | 4475 |
| 9 | 1 | 68.3 | 85.7 | 21 / 35 | 4291 |
| 10 | 1 | 67.7 | 87.0 | 18 / 35 | 4157 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 93 | 82% |
| nat.PallasHawk 1.0 | 86 | 69% |
| darkcanuck.Leon 1.01 | 57 | 88% |
| brainfade.melee.Genghis 0.36 | 14 | 86% |
| jrm.Test0 1.0 | 9 | 89% |
| jaybot.bots.Oddball 4.0 | 4 | 100% |
| jp.Perpy 16.0 | 2 | 50% |

Hadur died in 142 of 350 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 50 | 35% | 109 |
| bts.wiki.RipCurl 0.9b | 40 | 28% | 88 |
| darkcanuck.Leon 1.01 | 18 | 13% | 75 |
| brainfade.melee.Genghis 0.36 | 13 | 9% | 27 |
| jrm.Test0 1.0 | 11 | 8% | 19 |
| cs.sheldor.Talon 1.1 | 4 | 3% | 9 |
| stuff.Vlad 0.1 | 3 | 2% | 10 |
| jp.Perpy 16.0 | 2 | 1% | 3 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 8 |

Posture (Hadur's M records, 332 rounds): 213668 melee ticks, 56460 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 54 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 3.

Targeting waves (332 rounds): 71775 sent, 63391 reached their opponent, 10142 virtual hits (16.0% of those reached).

## Melee bench: F13

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 367 over 10 battles (36.7 per battle, most in one battle 48). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 82.7 | 108 / 350 | 2.56 | 16.6% | 45397 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.7 | 16.6% | 108 |
| mn.Combat 3.25.0 | 2.0 | 16.6% | 138 |
| ags.Glacier 0.2.11 | 2.3 | 15.8% | 56 |
| shinh.Entangled 0.3 | 4.2 | 11.9% | 35 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.3% | 12 |
| apc.Colossus2 0.17 | 6.2 | 7.7% | 0 |
| stelo.Wang 1.0 | 6.8 | 7.1% | 2 |
| ayk.WallHugger 1.0 | 8.4 | 4.9% | 0 |
| maribo.FollowFire 1 | 8.6 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 83.5 | 12 / 35 | 4723 |
| 2 | 2 | 66.7 | 85.1 | 7 / 35 | 4823 |
| 3 | 3 | 65.5 | 80.0 | 10 / 35 | 4446 |
| 4 | 2 | 65.5 | 80.6 | 8 / 35 | 4624 |
| 5 | 2 | 65.6 | 82.9 | 6 / 35 | 4488 |
| 6 | 1 | 66.8 | 84.1 | 13 / 35 | 4797 |
| 7 | 2 | 65.6 | 81.9 | 11 / 35 | 4209 |
| 8 | 1 | 66.1 | 82.9 | 14 / 35 | 4167 |
| 9 | 1 | 67.6 | 86.3 | 14 / 35 | 4691 |
| 10 | 2 | 65.7 | 79.7 | 13 / 35 | 4429 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 83 | 64% |
| mn.Combat 3.25.0 | 79 | 24% |
| shinh.Entangled 0.3 | 25 | 64% |
| gh.micro.Gruweltje 0.7 | 16 | 88% |
| stelo.Wang 1.0 | 3 | 67% |
| apc.Colossus2 0.17 | 3 | 100% |
| ayk.WallHugger 1.0 | 1 | 100% |

Hadur died in 243 of 350 rounds, at a mean tick of 865. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 97 | 40% | 120 |
| ags.Glacier 0.2.11 | 74 | 30% | 120 |
| shinh.Entangled 0.3 | 34 | 14% | 48 |
| gh.micro.Gruweltje 0.7 | 18 | 7% | 34 |
| stelo.Wang 1.0 | 9 | 4% | 12 |
| maribo.FollowFire 1 | 7 | 3% | 7 |
| apc.Colossus2 0.17 | 3 | 1% | 6 |
| ayk.WallHugger 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 334 rounds): 238540 melee ticks, 70213 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 81 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (334 rounds): longest scan gap while four or more were alive 81 ticks (334 rounds over 8); rounds whose longest gap at any count was over 8: 334; robots dropped as dead without a death event: 0.

Targeting waves (334 rounds): 68530 sent, 59990 reached their opponent, 9179 virtual hits (15.3% of those reached).

## Melee bench: F14

hadur117.Hadur 3.24bb against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 364 over 10 battles (36.4 per battle, most in one battle 44). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.7 | 97.9 | 317 / 350 | 1.17 | 24.9% | 65598 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 24.9% | 317 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 16.7% | 17 |
| sanyi.mikrobi.Roberto 1.0 | 3.6 | 11.3% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 4.3 | 10.8% | 3 |
| co.edu.usb.rc.LidisTron 1.0 | 5.2 | 9.8% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.9 | 9.3% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.0 | 9.2% | 10 |
| pa.Improved 1.0 | 8.0 | 6.4% | 0 |
| sample.TrackFire 1.0 | 9.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.9 | 96.4 | 32 / 35 | 6911 |
| 2 | 1 | 74.1 | 99.6 | 34 / 35 | 6676 |
| 3 | 1 | 73.4 | 97.5 | 31 / 35 | 6387 |
| 4 | 1 | 73.3 | 96.4 | 30 / 35 | 6499 |
| 5 | 1 | 73.7 | 98.2 | 32 / 35 | 6471 |
| 6 | 1 | 73.4 | 97.1 | 28 / 35 | 6614 |
| 7 | 1 | 73.5 | 97.9 | 33 / 35 | 6280 |
| 8 | 1 | 74.3 | 100.0 | 35 / 35 | 6789 |
| 9 | 1 | 73.6 | 97.1 | 31 / 35 | 6472 |
| 10 | 1 | 73.7 | 98.2 | 31 / 35 | 6499 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 197 | 95% |
| sanyi.mikrobi.Roberto 1.0 | 56 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 27 | 96% |
| sheldor.micro.PointInLineRRAL 1.0 | 27 | 74% |
| Lo_Ian.Gandalf_V4 4.0 | 15 | 93% |
| pa.Improved 1.0 | 9 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |

Hadur died in 33 of 350 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 15 | 45% | 182 |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 33% | 36 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 9% | 21 |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 9% | 21 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 3% | 11 |
| sanyi.mikrobi.Roberto 1.0 | 0 | 0% | 64 |
| pa.Improved 1.0 | 0 | 0% | 7 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 331 rounds): 203778 melee ticks, 83275 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 33 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 0.

Targeting waves (331 rounds): 59113 sent, 52189 reached their opponent, 12860 virtual hits (24.6% of those reached).

## Melee bench: F15

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 386 over 10 battles (38.6 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 87.5 | 214 / 350 | 2.12 | 19.6% | 55555 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 19.6% | 214 |
| kawigi.micro.Shiz 1.1 | 2.2 | 13.9% | 29 |
| emp.Yngwie 1.11 | 3.3 | 12.8% | 66 |
| mld.DustBunny 3.8 | 3.5 | 12.9% | 12 |
| cb.nano.Insomnia 1.0 | 5.1 | 10.4% | 11 |
| kawigi.robot.Girl 1.2 | 5.9 | 8.9% | 15 |
| lambdaxy.TBot 0.1 | 7.7 | 6.4% | 0 |
| Grystrion.TrackerWO 1.0 | 7.9 | 6.2% | 2 |
| divineomega.TrialBot 0.003 | 9.1 | 4.6% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.3 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 93.7 | 26 / 35 | 5511 |
| 2 | 1 | 69.7 | 87.9 | 20 / 35 | 5666 |
| 3 | 1 | 68.8 | 84.4 | 22 / 35 | 5287 |
| 4 | 1 | 71.5 | 92.4 | 25 / 35 | 5813 |
| 5 | 1 | 68.6 | 83.8 | 19 / 35 | 5346 |
| 6 | 1 | 70.4 | 88.6 | 22 / 35 | 5843 |
| 7 | 1 | 69.9 | 85.4 | 21 / 35 | 5732 |
| 8 | 1 | 68.8 | 84.8 | 21 / 35 | 5300 |
| 9 | 1 | 67.2 | 81.6 | 15 / 35 | 4969 |
| 10 | 1 | 71.3 | 92.7 | 23 / 35 | 6088 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 80 | 93% |
| emp.Yngwie 1.11 | 80 | 66% |
| mld.DustBunny 3.8 | 47 | 98% |
| cb.nano.Insomnia 1.0 | 23 | 87% |
| kawigi.robot.Girl 1.2 | 19 | 84% |
| divineomega.TrialBot 0.003 | 4 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 136 of 350 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 52 | 38% | 125 |
| cb.nano.Insomnia 1.0 | 24 | 18% | 35 |
| kawigi.micro.Shiz 1.1 | 22 | 16% | 57 |
| mld.DustBunny 3.8 | 17 | 13% | 77 |
| kawigi.robot.Girl 1.2 | 9 | 7% | 24 |
| Grystrion.TrackerWO 1.0 | 4 | 3% | 7 |
| lambdaxy.TBot 0.1 | 4 | 3% | 7 |
| divineomega.TrialBot 0.003 | 3 | 2% | 16 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 332 rounds): 259844 melee ticks, 70926 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 73 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 1.

Targeting waves (332 rounds): 84208 sent, 76090 reached their opponent, 11911 virtual hits (15.7% of those reached).

## Melee bench: F16

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 400 over 10 battles (40.0 per battle, most in one battle 50). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 90.3 | 206 / 350 | 1.87 | 20.3% | 59732 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 20.3% | 206 |
| gh.Griezel 0.5.2 | 2.1 | 16.1% | 89 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.9 | 14.1% | 7 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.3% | 34 |
| bvh.fnr.Fenrir 0.36l | 5.2 | 9.4% | 5 |
| tvv.nano.Polaris 1.2 | 5.9 | 8.6% | 6 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.3% | 1 |
| repositorio.NanoStep 1.0 | 8.6 | 4.8% | 1 |
| asd.Cthulhu 1.3 | 9.0 | 4.8% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.3 | 4.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 88.6 | 22 / 35 | 5743 |
| 2 | 1 | 71.0 | 89.2 | 21 / 35 | 5806 |
| 3 | 1 | 70.4 | 89.2 | 20 / 35 | 5879 |
| 4 | 1 | 71.6 | 92.1 | 20 / 35 | 6190 |
| 5 | 1 | 69.9 | 89.2 | 15 / 35 | 5927 |
| 6 | 1 | 70.8 | 89.2 | 19 / 35 | 6018 |
| 7 | 1 | 72.1 | 92.4 | 24 / 35 | 6292 |
| 8 | 1 | 72.2 | 94.0 | 26 / 35 | 6325 |
| 9 | 1 | 69.2 | 87.6 | 16 / 35 | 5283 |
| 10 | 1 | 71.8 | 91.7 | 23 / 35 | 6269 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 147 | 63% |
| techdude.forest.FlamingForest 1.1 | 64 | 72% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 45 | 93% |
| bvh.fnr.Fenrir 0.36l | 15 | 80% |
| tvv.nano.Polaris 1.2 | 7 | 100% |
| stelo.IntrinsicVolatility 1.4 | 5 | 100% |
| divineomega.DivineBot 1.9.4.5 | 1 | 100% |

Hadur died in 146 of 350 rounds, at a mean tick of 1216. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 69 | 47% | 157 |
| techdude.forest.FlamingForest 1.1 | 28 | 19% | 73 |
| bvh.fnr.Fenrir 0.36l | 24 | 16% | 34 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 13 | 9% | 49 |
| stelo.IntrinsicVolatility 1.4 | 4 | 3% | 17 |
| divineomega.DivineBot 1.9.4.5 | 3 | 2% | 9 |
| asd.Cthulhu 1.3 | 3 | 2% | 4 |
| tvv.nano.Polaris 1.2 | 1 | 1% | 6 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 330 rounds): 285545 melee ticks, 111975 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 40 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 0.

Targeting waves (330 rounds): 90804 sent, 82918 reached their opponent, 13572 virtual hits (16.4% of those reached).

## Melee bench: F17

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 403 over 10 battles (40.3 per battle, most in one battle 45). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 88.1 | 188 / 350 | 2.07 | 19.9% | 61434 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 19.9% | 188 |
| et.Predator 1.8 | 2.5 | 13.5% | 29 |
| oog.melee.Mercutio 1.0 | 3.1 | 13.0% | 48 |
| cx.BlestPain 1.41 | 3.5 | 12.3% | 68 |
| ahf.NanoAndrew .4 | 5.1 | 10.3% | 10 |
| nic.Nicator 2.4 | 6.4 | 8.8% | 5 |
| maribo.melee.BMV 0.1 | 6.4 | 8.9% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.1 | 5.7% | 1 |
| tex.Longbot 0.4 | 8.9 | 5.1% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 88.6 | 21 / 35 | 5957 |
| 2 | 1 | 72.2 | 92.7 | 24 / 35 | 6646 |
| 3 | 1 | 70.1 | 88.3 | 21 / 35 | 5797 |
| 4 | 1 | 69.8 | 87.0 | 15 / 35 | 6227 |
| 5 | 1 | 70.0 | 88.3 | 16 / 35 | 6040 |
| 6 | 1 | 70.9 | 88.6 | 22 / 35 | 6393 |
| 7 | 1 | 67.6 | 79.7 | 16 / 35 | 5550 |
| 8 | 1 | 70.3 | 87.9 | 19 / 35 | 6188 |
| 9 | 1 | 70.9 | 91.1 | 16 / 35 | 6435 |
| 10 | 1 | 70.5 | 89.2 | 18 / 35 | 6201 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 88 | 76% |
| et.Predator 1.8 | 83 | 78% |
| cx.BlestPain 1.41 | 71 | 37% |
| ahf.NanoAndrew .4 | 17 | 88% |
| maribo.melee.BMV 0.1 | 8 | 88% |
| nic.Nicator 2.4 | 4 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 3 | 100% |
| goblin.Bender 2.4 | 1 | 100% |

Hadur died in 162 of 350 rounds, at a mean tick of 1109. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 57 | 35% | 87 |
| et.Predator 1.8 | 37 | 23% | 98 |
| oog.melee.Mercutio 1.0 | 35 | 22% | 95 |
| ahf.NanoAndrew .4 | 16 | 10% | 32 |
| maribo.melee.BMV 0.1 | 11 | 7% | 20 |
| tex.Longbot 0.4 | 3 | 2% | 7 |
| nic.Nicator 2.4 | 3 | 2% | 6 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 4 |
| goblin.Bender 2.4 | 0 | 0% | 1 |

Posture (Hadur's M records, 331 rounds): 259512 melee ticks, 112983 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 42 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 0.

Targeting waves (331 rounds): 84392 sent, 76300 reached their opponent, 15016 virtual hits (19.7% of those reached).

## Melee bench: F18

hadur117.Hadur 3.24bb against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 525 over 10 battles (52.5 per battle, most in one battle 65). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 92.3 | 258 / 350 | 1.62 | 22.7% | 50804 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 22.7% | 258 |
| agd.Mooserwirt2 2.7 | 2.5 | 13.7% | 30 |
| uji.DBH 1.1 | 2.5 | 13.7% | 22 |
| sigterm.Sigterm 1.0 | 4.3 | 10.8% | 22 |
| ratosh.Nobo 0.21 | 5.4 | 9.8% | 4 |
| spinnercat.Robovirus 2.718 | 5.6 | 9.6% | 8 |
| kawigi.mini.Fhqwhgads 1.1 | 6.9 | 8.2% | 5 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.1 | 6.1% | 0 |
| stelo.WangRobot 1.0 | 8.7 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 84.3 | 19 / 35 | 4655 |
| 2 | 1 | 70.6 | 91.8 | 23 / 35 | 5041 |
| 3 | 1 | 69.1 | 88.9 | 22 / 35 | 4642 |
| 4 | 1 | 72.0 | 95.7 | 29 / 35 | 5333 |
| 5 | 1 | 70.6 | 90.7 | 26 / 35 | 5232 |
| 6 | 1 | 71.6 | 95.4 | 28 / 35 | 4920 |
| 7 | 1 | 70.9 | 91.8 | 26 / 35 | 5310 |
| 8 | 1 | 71.0 | 91.8 | 25 / 35 | 5237 |
| 9 | 1 | 71.9 | 96.8 | 31 / 35 | 5069 |
| 10 | 1 | 72.1 | 95.4 | 29 / 35 | 5365 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agd.Mooserwirt2 2.7 | 97 | 89% |
| uji.DBH 1.1 | 84 | 90% |
| sigterm.Sigterm 1.0 | 55 | 75% |
| spinnercat.Robovirus 2.718 | 19 | 89% |
| ratosh.Nobo 0.21 | 17 | 88% |
| kawigi.mini.Fhqwhgads 1.1 | 14 | 79% |
| stelo.WangRobot 1.0 | 9 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 100% |

Hadur died in 92 of 350 rounds, at a mean tick of 841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 25 | 27% | 101 |
| sigterm.Sigterm 1.0 | 20 | 22% | 53 |
| uji.DBH 1.1 | 17 | 18% | 72 |
| ratosh.Nobo 0.21 | 11 | 12% | 34 |
| spinnercat.Robovirus 2.718 | 8 | 9% | 31 |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 7% | 34 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 5 | 5% | 14 |
| stelo.WangRobot 1.0 | 0 | 0% | 10 |

Posture (Hadur's M records, 330 rounds): 212180 melee ticks, 79598 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 71 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 3.

Targeting waves (330 rounds): 64976 sent, 57866 reached their opponent, 12485 virtual hits (21.6% of those reached).

## Melee bench: F19

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 392 over 10 battles (39.2 per battle, most in one battle 50). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.2 | 98.9 | 336 / 350 | 1.10 | 23.2% | 66518 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 23.2% | 336 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.8% | 5 |
| mld.Infinity 2.2 | 3.6 | 11.6% | 5 |
| krillr.mini.JointStrike 2.0.0 | 3.9 | 11.4% | 2 |
| erdnis.Rover 0.3 | 4.5 | 10.8% | 1 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.1% | 0 |
| mbh.Mbh 0.1 | 7.3 | 7.1% | 0 |
| pac.ABC 2.1 | 7.7 | 6.6% | 1 |
| pbg.R2D2 1.0 | 8.8 | 5.2% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.7 | 100.0 | 35 / 35 | 6632 |
| 2 | 1 | 74.8 | 99.7 | 34 / 35 | 7157 |
| 3 | 1 | 74.4 | 99.4 | 34 / 35 | 6645 |
| 4 | 1 | 74.7 | 100.0 | 35 / 35 | 6960 |
| 5 | 1 | 74.0 | 97.8 | 32 / 35 | 6691 |
| 6 | 1 | 74.6 | 98.4 | 33 / 35 | 7104 |
| 7 | 1 | 73.7 | 99.0 | 34 / 35 | 6076 |
| 8 | 1 | 74.2 | 98.4 | 33 / 35 | 6820 |
| 9 | 1 | 74.0 | 98.4 | 34 / 35 | 6368 |
| 10 | 1 | 73.4 | 97.5 | 32 / 35 | 6065 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 202 | 99% |
| krillr.mini.JointStrike 2.0.0 | 51 | 98% |
| erdnis.Rover 0.3 | 33 | 97% |
| mld.Infinity 2.2 | 32 | 100% |
| patson.PatsonTestBot 1.0 | 10 | 100% |
| pac.ABC 2.1 | 8 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 14 of 350 rounds, at a mean tick of 748. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 6 | 43% | 99 |
| krillr.mini.JointStrike 2.0.0 | 4 | 29% | 50 |
| erdnis.Rover 0.3 | 3 | 21% | 55 |
| mbh.Mbh 0.1 | 1 | 7% | 16 |
| mld.Infinity 2.2 | 0 | 0% | 55 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 25 |
| pac.ABC 2.1 | 0 | 0% | 21 |
| pbg.R2D2 1.0 | 0 | 0% | 16 |

Posture (Hadur's M records, 330 rounds): 207737 melee ticks, 75193 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 46 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 2.

Targeting waves (330 rounds): 68315 sent, 60383 reached their opponent, 13322 virtual hits (22.1% of those reached).

## Melee bench: F20

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 337 over 10 battles (33.7 per battle, most in one battle 46). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 94.1 | 264 / 350 | 1.53 | 22.0% | 66313 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 22.0% | 264 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.3% | 46 |
| fwb.Nine 1.0.1 | 3.1 | 11.6% | 17 |
| catcat20.Rabbit 0.001 | 4.4 | 10.3% | 18 |
| nz.jdc.nano.GridFu 1.0 | 4.5 | 10.3% | 2 |
| m3thos.mini.Eva01 0.5.5 | 6.1 | 8.3% | 1 |
| bayen.nut.Squirrel 1.615 | 7.5 | 6.6% | 2 |
| djdjdj.NanoSkunk10 1.0 | 8.2 | 6.0% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.2 | 6.2% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 95.9 | 24 / 35 | 6869 |
| 2 | 1 | 73.3 | 95.9 | 27 / 35 | 6901 |
| 3 | 1 | 73.2 | 94.9 | 28 / 35 | 6860 |
| 4 | 1 | 72.9 | 93.0 | 26 / 35 | 6891 |
| 5 | 1 | 71.5 | 90.8 | 23 / 35 | 6369 |
| 6 | 1 | 72.5 | 94.0 | 28 / 35 | 6439 |
| 7 | 1 | 73.1 | 96.2 | 28 / 35 | 6625 |
| 8 | 1 | 72.1 | 91.1 | 25 / 35 | 6566 |
| 9 | 1 | 72.3 | 93.7 | 26 / 35 | 6396 |
| 10 | 1 | 72.8 | 95.2 | 29 / 35 | 6397 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 152 | 82% |
| fwb.Nine 1.0.1 | 77 | 94% |
| catcat20.Rabbit 0.001 | 51 | 78% |
| nz.jdc.nano.GridFu 1.0 | 14 | 100% |
| m3thos.mini.Eva01 0.5.5 | 7 | 86% |
| bayen.nut.Squirrel 1.615 | 7 | 86% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 86 of 350 rounds, at a mean tick of 985. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 47 | 55% | 152 |
| catcat20.Rabbit 0.001 | 16 | 19% | 74 |
| fwb.Nine 1.0.1 | 12 | 14% | 29 |
| nz.jdc.nano.GridFu 1.0 | 4 | 5% | 42 |
| bayen.nut.Squirrel 1.615 | 3 | 3% | 16 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 7 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 2 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 21 |

Posture (Hadur's M records, 330 rounds): 263176 melee ticks, 98889 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 40 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 3.

Targeting waves (330 rounds): 80630 sent, 72723 reached their opponent, 15541 virtual hits (21.4% of those reached).

## Melee bench: F21

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 251 over 10 battles (25.1 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 94.0 | 225 / 350 | 1.54 | 21.4% | 63922 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 21.4% | 225 |
| eem.EvBot v4.6.16 | 2.0 | 16.4% | 104 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.1% | 12 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 4 |
| eld.Hmm 1.0 | 5.4 | 8.0% | 6 |
| oa.weak.BotherBot 0.1 | 5.6 | 7.5% | 0 |
| fire219.CatBot 1.0 | 7.6 | 6.0% | 0 |
| el.JumpShoot 0.2 | 8.2 | 5.6% | 0 |
| PSW.Relentless 0.1 | 8.4 | 5.2% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 97.5 | 27 / 35 | 6538 |
| 2 | 1 | 70.8 | 91.7 | 17 / 35 | 5808 |
| 3 | 1 | 72.3 | 92.7 | 22 / 35 | 6693 |
| 4 | 1 | 72.4 | 93.7 | 21 / 35 | 6808 |
| 5 | 1 | 72.3 | 92.1 | 22 / 35 | 6552 |
| 6 | 1 | 71.8 | 92.7 | 23 / 35 | 6180 |
| 7 | 1 | 72.7 | 94.6 | 24 / 35 | 6322 |
| 8 | 1 | 72.2 | 94.3 | 21 / 35 | 6345 |
| 9 | 1 | 72.2 | 94.6 | 23 / 35 | 6291 |
| 10 | 1 | 73.0 | 96.5 | 25 / 35 | 6385 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 210 | 62% |
| dummy.mini.Scimitar 1.01 | 52 | 90% |
| cf.RiO.RiOx 4.2.1 | 40 | 98% |
| eld.Hmm 1.0 | 11 | 55% |
| el.JumpShoot 0.2 | 1 | 100% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 126 of 350 rounds, at a mean tick of 1381. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 96 | 76% | 194 |
| dummy.mini.Scimitar 1.01 | 18 | 14% | 87 |
| eld.Hmm 1.0 | 6 | 5% | 24 |
| cf.RiO.RiOx 4.2.1 | 3 | 2% | 30 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 9 |
| PSW.Relentless 0.1 | 1 | 1% | 1 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |
| fire219.CatBot 1.0 | 0 | 0% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 332 rounds): 291805 melee ticks, 143886 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 70 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 0.

Targeting waves (332 rounds): 83405 sent, 75564 reached their opponent, 12268 virtual hits (16.2% of those reached).

## Melee bench: F22

hadur117.Hadur 3.24bb against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 388 over 10 battles (38.8 per battle, most in one battle 44). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 90.3 | 202 / 350 | 1.78 | 21.3% | 48418 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 21.3% | 202 |
| pe.SandboxDT 2.71m | 2.4 | 16.0% | 77 |
| kvk.HebusLeTroll 0.35 | 2.8 | 15.4% | 37 |
| jlm.javaDisturbance 0.59 | 3.9 | 13.1% | 23 |
| bigpete.Stewie 1.0 | 4.9 | 10.9% | 6 |
| yk.JahRoslav 1.1 | 6.6 | 6.9% | 5 |
| gg.Squaraus 0.6 | 7.2 | 6.2% | 0 |
| tad.Dalek98 0.98 | 7.2 | 6.2% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 89.3 | 22 / 35 | 4853 |
| 2 | 1 | 69.9 | 90.0 | 19 / 35 | 4928 |
| 3 | 1 | 69.2 | 90.4 | 18 / 35 | 4468 |
| 4 | 1 | 70.3 | 92.9 | 21 / 35 | 4601 |
| 5 | 1 | 70.9 | 92.5 | 25 / 35 | 5079 |
| 6 | 1 | 70.3 | 91.8 | 18 / 35 | 5091 |
| 7 | 1 | 70.7 | 91.1 | 19 / 35 | 5394 |
| 8 | 1 | 66.8 | 81.1 | 13 / 35 | 4462 |
| 9 | 1 | 69.9 | 89.6 | 22 / 35 | 4894 |
| 10 | 1 | 70.3 | 93.9 | 25 / 35 | 4648 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 90 | 51% |
| jlm.javaDisturbance 0.59 | 83 | 83% |
| kvk.HebusLeTroll 0.35 | 79 | 75% |
| bigpete.Stewie 1.0 | 24 | 96% |
| yk.JahRoslav 1.1 | 5 | 20% |
| tad.Dalek98 0.98 | 2 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |
| gg.Squaraus 0.6 | 1 | 100% |

Hadur died in 149 of 350 rounds, at a mean tick of 1021. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 58 | 39% | 107 |
| kvk.HebusLeTroll 0.35 | 46 | 31% | 92 |
| jlm.javaDisturbance 0.59 | 23 | 15% | 80 |
| bigpete.Stewie 1.0 | 12 | 8% | 45 |
| yk.JahRoslav 1.1 | 5 | 3% | 7 |
| tad.Dalek98 0.98 | 2 | 1% | 6 |
| pbg.NinjaX 1.2 | 2 | 1% | 5 |
| gg.Squaraus 0.6 | 0 | 0% | 6 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 333 rounds): 251891 melee ticks, 83993 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 47 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 0.

Targeting waves (333 rounds): 73343 sent, 66243 reached their opponent, 8602 virtual hits (13.0% of those reached).

## Melee bench: F23

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 340 over 10 battles (34.0 per battle, most in one battle 45). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.9 | 97.1 | 303 / 350 | 1.26 | 22.7% | 68023 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 22.7% | 303 |
| pe.SandboxLump 1.52 | 2.0 | 16.2% | 38 |
| cre.Karolos 0.32 | 3.0 | 13.3% | 4 |
| stelo.AreaTargetingBot 1.1 | 4.4 | 9.9% | 1 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.7 | 8.6% | 1 |
| stelo.RamTrackSurfer 1.2 | 5.9 | 8.6% | 2 |
| cw.megas.Blade 0.8 | 6.3 | 8.2% | 1 |
| sample.Walls 1.0 | 7.7 | 7.3% | 0 |
| rrh.Iwillfindyou 2.0 | 9.1 | 3.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.9 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.6 | 97.1 | 29 / 35 | 6703 |
| 2 | 1 | 73.6 | 96.2 | 30 / 35 | 6476 |
| 3 | 1 | 73.7 | 98.1 | 30 / 35 | 6550 |
| 4 | 1 | 73.9 | 96.8 | 31 / 35 | 6777 |
| 5 | 1 | 73.1 | 94.3 | 26 / 35 | 6569 |
| 6 | 1 | 74.7 | 99.4 | 34 / 35 | 6958 |
| 7 | 1 | 73.5 | 95.9 | 28 / 35 | 6444 |
| 8 | 1 | 73.1 | 96.8 | 28 / 35 | 6564 |
| 9 | 1 | 74.9 | 97.5 | 33 / 35 | 7668 |
| 10 | 1 | 74.9 | 99.0 | 34 / 35 | 7314 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 181 | 87% |
| cre.Karolos 0.32 | 91 | 97% |
| stelo.RamTrackSurfer 1.2 | 17 | 94% |
| stelo.AreaTargetingBot 1.1 | 16 | 100% |
| sample.Walls 1.0 | 11 | 100% |
| cw.megas.Blade 0.8 | 9 | 89% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 48 of 350 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 32 | 67% | 162 |
| cre.Karolos 0.32 | 6 | 13% | 87 |
| stelo.RamTrackSurfer 1.2 | 3 | 6% | 37 |
| stelo.AreaTargetingBot 1.1 | 3 | 6% | 23 |
| cw.megas.Blade 0.8 | 3 | 6% | 10 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 2% | 14 |
| sample.Walls 1.0 | 0 | 0% | 9 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 331 rounds): 199927 melee ticks, 81648 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 65 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 0.

Targeting waves (331 rounds): 61646 sent, 53395 reached their opponent, 14801 virtual hits (27.7% of those reached).

## Melee bench: F24

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 298 over 10 battles (29.8 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 83.4 | 143 / 350 | 2.49 | 17.4% | 44110 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 17.4% | 143 |
| rz.GlowBlowMelee 1.4 | 2.7 | 13.7% | 58 |
| florent.XSeries.X2 0.12 | 2.9 | 13.9% | 62 |
| davidalves.Phoenix 0.54 | 3.6 | 13.0% | 55 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.5% | 28 |
| oog.melee.Corsair 1.0 | 6.0 | 9.2% | 2 |
| stelo.SoJNanoMelee 1.1 | 7.1 | 6.8% | 3 |
| lunchie.Lunchbox 0.93 | 8.1 | 5.5% | 0 |
| as.FrankTheTank 1.3 | 9.3 | 4.7% | 0 |
| evd.X1 0.01 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 94.0 | 24 / 35 | 4851 |
| 2 | 1 | 65.7 | 79.0 | 14 / 35 | 4267 |
| 3 | 1 | 66.5 | 83.2 | 13 / 35 | 4400 |
| 4 | 1 | 65.5 | 81.0 | 11 / 35 | 4008 |
| 5 | 1 | 66.6 | 80.3 | 17 / 35 | 4567 |
| 6 | 1 | 68.0 | 86.0 | 18 / 35 | 4478 |
| 7 | 1 | 67.8 | 87.9 | 13 / 35 | 4596 |
| 8 | 1 | 65.3 | 80.6 | 9 / 35 | 4342 |
| 9 | 1 | 64.7 | 76.5 | 12 / 35 | 4193 |
| 10 | 1 | 66.7 | 85.4 | 12 / 35 | 4408 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 67 | 58% |
| florent.XSeries.X2 0.12 | 66 | 58% |
| davidalves.Phoenix 0.54 | 48 | 58% |
| pedersen.Ugluk 1.1.1 | 37 | 68% |
| oog.melee.Corsair 1.0 | 9 | 89% |
| stelo.SoJNanoMelee 1.1 | 4 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 208 of 350 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 60 | 29% | 91 |
| rz.GlowBlowMelee 1.4 | 47 | 23% | 88 |
| davidalves.Phoenix 0.54 | 47 | 23% | 78 |
| pedersen.Ugluk 1.1.1 | 29 | 14% | 43 |
| evd.X1 0.01 | 8 | 4% | 8 |
| oog.melee.Corsair 1.0 | 6 | 3% | 23 |
| stelo.SoJNanoMelee 1.1 | 6 | 3% | 9 |
| lunchie.Lunchbox 0.93 | 2 | 1% | 8 |
| as.FrankTheTank 1.3 | 2 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 331 rounds): 219634 melee ticks, 69990 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 65 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 3.

Targeting waves (331 rounds): 72259 sent, 63733 reached their opponent, 11340 virtual hits (17.8% of those reached).

## Melee bench: F25

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 331 over 10 battles (33.1 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 89.3 | 234 / 350 | 1.96 | 19.3% | 43639 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 19.3% | 234 |
| voidious.mini.BrokenSword 2.0.3 | 2.4 | 13.4% | 28 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.7% | 23 |
| jdw.Hurricane 1.4 | 4.0 | 11.5% | 27 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.3% | 15 |
| ds.Oo 2.2 | 5.6 | 9.3% | 13 |
| awesomeness.Elite 1.0 | 7.6 | 7.1% | 0 |
| adt.Ar2 1.1 | 7.9 | 6.8% | 7 |
| gjr.Cephalosporin 0.1 | 8.5 | 6.3% | 3 |
| amk.ChumbaMini 0.2 | 9.9 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 91.4 | 23 / 35 | 4570 |
| 2 | 1 | 71.9 | 97.8 | 30 / 35 | 4935 |
| 3 | 1 | 68.3 | 87.6 | 22 / 35 | 4260 |
| 4 | 1 | 69.4 | 90.5 | 24 / 35 | 4604 |
| 5 | 1 | 68.9 | 89.5 | 22 / 35 | 4440 |
| 6 | 1 | 67.9 | 86.0 | 20 / 35 | 4210 |
| 7 | 1 | 69.8 | 91.7 | 24 / 35 | 4554 |
| 8 | 1 | 68.9 | 88.9 | 23 / 35 | 4247 |
| 9 | 1 | 68.8 | 88.9 | 25 / 35 | 4228 |
| 10 | 1 | 66.0 | 80.6 | 21 / 35 | 3591 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 79 | 92% |
| voidious.micro.BlitzBat 1.05 | 68 | 93% |
| jdw.Hurricane 1.4 | 58 | 79% |
| ds.Oo 2.2 | 28 | 86% |
| gre.svman4.Morfeas 1.4.1 | 18 | 61% |
| awesomeness.Elite 1.0 | 8 | 100% |
| adt.Ar2 1.1 | 6 | 33% |
| gjr.Cephalosporin 0.1 | 5 | 80% |
| amk.ChumbaMini 0.2 | 3 | 100% |

Hadur died in 116 of 350 rounds, at a mean tick of 665. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 24 | 21% | 78 |
| voidious.mini.BrokenSword 2.0.3 | 20 | 17% | 63 |
| jdw.Hurricane 1.4 | 20 | 17% | 61 |
| ds.Oo 2.2 | 14 | 12% | 45 |
| adt.Ar2 1.1 | 14 | 12% | 25 |
| awesomeness.Elite 1.0 | 9 | 8% | 28 |
| gre.svman4.Morfeas 1.4.1 | 9 | 8% | 28 |
| gjr.Cephalosporin 0.1 | 5 | 4% | 13 |
| amk.ChumbaMini 0.2 | 1 | 1% | 8 |

Posture (Hadur's M records, 334 rounds): 208073 melee ticks, 52733 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (334 rounds): longest scan gap while four or more were alive 40 ticks (334 rounds over 8); rounds whose longest gap at any count was over 8: 334; robots dropped as dead without a death event: 0.

Targeting waves (334 rounds): 71881 sent, 63907 reached their opponent, 10077 virtual hits (15.8% of those reached).

## Melee bench: F26

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 472 over 10 battles (47.2 per battle, most in one battle 52). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 93.3 | 259 / 350 | 1.60 | 21.8% | 70258 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 21.8% | 259 |
| ak.Fermat 2.0 | 2.2 | 14.6% | 41 |
| lrem.Spectre 0.4.4 | 3.4 | 12.4% | 16 |
| shu.nitro.LENIN .T34 | 3.4 | 12.6% | 26 |
| js.PinBall 1.6 | 5.3 | 9.7% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 5.8 | 9.4% | 2 |
| gh.mini.GrubbmOne 1.0 | 7.1 | 7.9% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 6.5% | 1 |
| sample.SpinBot 1.0 | 9.0 | 3.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 92.4 | 26 / 35 | 6884 |
| 2 | 1 | 74.4 | 97.1 | 30 / 35 | 7433 |
| 3 | 1 | 72.3 | 90.5 | 22 / 35 | 7121 |
| 4 | 1 | 72.6 | 93.7 | 25 / 35 | 6945 |
| 5 | 1 | 72.2 | 89.5 | 26 / 35 | 6986 |
| 6 | 1 | 73.9 | 95.6 | 29 / 35 | 7227 |
| 7 | 1 | 72.5 | 91.7 | 24 / 35 | 6494 |
| 8 | 1 | 72.2 | 92.7 | 25 / 35 | 6611 |
| 9 | 1 | 73.9 | 96.2 | 26 / 35 | 7581 |
| 10 | 1 | 72.7 | 93.7 | 26 / 35 | 6976 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 105 | 83% |
| shu.nitro.LENIN .T34 | 78 | 91% |
| lrem.Spectre 0.4.4 | 76 | 89% |
| js.PinBall 1.6 | 15 | 93% |
| jaybot.adv.bots.JayBot 2.0 | 14 | 93% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 100% |
| gh.mini.GrubbmOne 1.0 | 2 | 100% |

Hadur died in 92 of 350 rounds, at a mean tick of 920. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 43 | 47% | 127 |
| shu.nitro.LENIN .T34 | 19 | 21% | 92 |
| lrem.Spectre 0.4.4 | 17 | 18% | 72 |
| js.PinBall 1.6 | 6 | 7% | 26 |
| jaybot.adv.bots.JayBot 2.0 | 6 | 7% | 20 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 5 |
| fullsail.LaxativeTeaTwo 1.0 | 0 | 0% | 7 |

Posture (Hadur's M records, 330 rounds): 255143 melee ticks, 79038 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 56 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 1.

Targeting waves (330 rounds): 80009 sent, 71976 reached their opponent, 16360 virtual hits (22.7% of those reached).

## Melee bench: F27

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 346 over 10 battles (34.6 per battle, most in one battle 48). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 83.6 | 250 / 350 | 2.48 | 19.5% | 55676 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.1 | 19.5% | 250 |
| mk.Alpha 0.2.1 | 2.0 | 14.4% | 56 |
| EH.Eagle 1.0.6 | 3.1 | 11.1% | 9 |
| sheldor.melee.nano.TestMelee 0.1 | 5.1 | 9.8% | 13 |
| wee.Gem 1.8.4 | 5.4 | 9.2% | 17 |
| joe.ADinosaur 1.0 | 6.3 | 8.5% | 2 |
| techdude.kombat.FlamingKombat 1.5 | 6.6 | 8.7% | 1 |
| throxbot.ThroxBot 0.1 | 7.4 | 7.5% | 2 |
| caimano.Furia_Ceca 0.22 | 8.2 | 6.8% | 2 |
| cs.Grudge 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 94.9 | 29 / 35 | 5955 |
| 2 | 1 | 72.3 | 96.8 | 31 / 35 | 5701 |
| 3 | 1 | 71.7 | 93.3 | 30 / 35 | 5736 |
| 4 | 1 | 72.6 | 97.1 | 32 / 35 | 5968 |
| 5 | 1 | 64.5 | 68.6 | 17 / 35 | 5113 |
| 6 | 1 | 64.2 | 65.7 | 17 / 35 | 5236 |
| 7 | 2 | 63.9 | 65.7 | 16 / 35 | 5218 |
| 8 | 1 | 71.5 | 94.0 | 31 / 35 | 5725 |
| 9 | 1 | 71.3 | 93.7 | 30 / 35 | 5590 |
| 10 | 1 | 64.9 | 66.0 | 17 / 35 | 5434 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 162 | 94% |
| EH.Eagle 1.0.6 | 42 | 95% |
| sheldor.melee.nano.TestMelee 0.1 | 17 | 94% |
| wee.Gem 1.8.4 | 13 | 92% |
| throxbot.ThroxBot 0.1 | 12 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 11 | 100% |
| caimano.Furia_Ceca 0.22 | 5 | 60% |
| joe.ADinosaur 1.0 | 4 | 100% |

Hadur died in 100 of 350 rounds, at a mean tick of 439. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cs.Grudge 1.0 | 22 | 22% | 21 |
| EH.Eagle 1.0.6 | 20 | 20% | 67 |
| mk.Alpha 0.2.1 | 19 | 19% | 132 |
| techdude.kombat.FlamingKombat 1.5 | 10 | 10% | 33 |
| joe.ADinosaur 1.0 | 10 | 10% | 18 |
| sheldor.melee.nano.TestMelee 0.1 | 5 | 5% | 30 |
| wee.Gem 1.8.4 | 5 | 5% | 22 |
| throxbot.ThroxBot 0.1 | 5 | 5% | 14 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 12 |

Posture (Hadur's M records, 331 rounds): 191318 melee ticks, 61054 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 35 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 1.

Targeting waves (331 rounds): 62721 sent, 54750 reached their opponent, 13386 virtual hits (24.4% of those reached).

## Melee bench: F28

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 345 over 10 battles (34.5 per battle, most in one battle 44). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 90.2 | 236 / 350 | 1.88 | 19.0% | 42723 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 19.0% | 236 |
| kid.test.NightFox .2 | 2.0 | 14.7% | 46 |
| uji.Antique 1.0 | 3.5 | 11.8% | 32 |
| pfvicm.Sobieski 7.2.3b | 4.4 | 10.5% | 8 |
| qohnil.blot.BlotBot 3.61 | 4.4 | 10.3% | 22 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.0% | 0 |
| ahr.ice.Ice 1.0.2 | 6.6 | 7.9% | 3 |
| matt.advanced.Katana 1.0 | 8.5 | 6.3% | 3 |
| stelo.PianistNano 1.2 | 9.0 | 5.9% | 1 |
| stelo.Lifestealer 1.0 | 9.3 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 91.7 | 24 / 35 | 4414 |
| 2 | 1 | 68.0 | 88.9 | 24 / 35 | 4178 |
| 3 | 1 | 68.3 | 90.2 | 23 / 35 | 4239 |
| 4 | 1 | 68.5 | 89.2 | 24 / 35 | 4226 |
| 5 | 1 | 71.2 | 96.5 | 29 / 35 | 4931 |
| 6 | 1 | 67.0 | 85.4 | 18 / 35 | 4052 |
| 7 | 1 | 66.7 | 83.8 | 21 / 35 | 4301 |
| 8 | 1 | 68.7 | 89.5 | 24 / 35 | 4285 |
| 9 | 1 | 69.1 | 93.0 | 25 / 35 | 4116 |
| 10 | 1 | 69.1 | 94.0 | 24 / 35 | 3981 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 123 | 85% |
| uji.Antique 1.0 | 85 | 87% |
| qohnil.blot.BlotBot 3.61 | 21 | 76% |
| pfvicm.Sobieski 7.2.3b | 17 | 76% |
| amk.ChumbaWumba 0.3 | 13 | 100% |
| ahr.ice.Ice 1.0.2 | 12 | 92% |
| stelo.PianistNano 1.2 | 3 | 67% |
| matt.advanced.Katana 1.0 | 2 | 100% |

Hadur died in 116 of 350 rounds, at a mean tick of 700. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 27 | 23% | 93 |
| pfvicm.Sobieski 7.2.3b | 26 | 22% | 43 |
| kid.test.NightFox .2 | 25 | 22% | 89 |
| qohnil.blot.BlotBot 3.61 | 16 | 14% | 46 |
| amk.ChumbaWumba 0.3 | 5 | 4% | 22 |
| matt.advanced.Katana 1.0 | 5 | 4% | 17 |
| stelo.PianistNano 1.2 | 5 | 4% | 10 |
| ahr.ice.Ice 1.0.2 | 4 | 3% | 19 |
| stelo.Lifestealer 1.0 | 2 | 2% | 6 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 330 rounds): 208941 melee ticks, 57477 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 30 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 30 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 0.

Targeting waves (330 rounds): 69274 sent, 61092 reached their opponent, 8336 virtual hits (13.6% of those reached).

## Melee bench: F29

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 329 over 10 battles (32.9 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 89.3 | 194 / 350 | 1.96 | 19.7% | 49921 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 19.7% | 194 |
| deewiant.Anomaly 0.2 | 2.3 | 15.0% | 62 |
| zyx.mega.YersiniaPestis 3.1 | 2.7 | 14.7% | 73 |
| myl.micro.Troodon 1.10 | 4.1 | 12.2% | 8 |
| jok.PheonixM 0.1.2 | 4.9 | 11.0% | 9 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.0% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.3 | 6.0% | 0 |
| DBall.Anarchy 0.1 | 7.9 | 5.4% | 5 |
| ap.Frederick 1.1 | 8.9 | 4.3% | 1 |
| jangs.ns51 1.0 | 9.9 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 82.2 | 16 / 35 | 4480 |
| 2 | 1 | 68.7 | 84.8 | 17 / 35 | 4579 |
| 3 | 1 | 70.7 | 90.5 | 20 / 35 | 5153 |
| 4 | 1 | 71.5 | 92.4 | 23 / 35 | 5177 |
| 5 | 1 | 69.8 | 88.9 | 17 / 35 | 4815 |
| 6 | 1 | 70.4 | 88.9 | 17 / 35 | 5066 |
| 7 | 1 | 71.9 | 94.3 | 25 / 35 | 5345 |
| 8 | 1 | 70.1 | 89.2 | 20 / 35 | 4882 |
| 9 | 1 | 70.9 | 92.7 | 20 / 35 | 5306 |
| 10 | 1 | 70.2 | 89.2 | 19 / 35 | 5118 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 132 | 70% |
| zyx.mega.YersiniaPestis 3.1 | 73 | 56% |
| myl.micro.Troodon 1.10 | 32 | 100% |
| jok.PheonixM 0.1.2 | 26 | 81% |
| ap.Frederick 1.1 | 6 | 83% |
| DBall.Anarchy 0.1 | 2 | 50% |
| ph.melee.ArcherME 0.3 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 157 of 350 rounds, at a mean tick of 1001. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 68 | 43% | 159 |
| zyx.mega.YersiniaPestis 3.1 | 57 | 36% | 106 |
| jok.PheonixM 0.1.2 | 15 | 10% | 29 |
| myl.micro.Troodon 1.10 | 8 | 5% | 32 |
| ph.melee.ArcherME 0.3 | 3 | 2% | 10 |
| DBall.Anarchy 0.1 | 3 | 2% | 7 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 4 |
| jangs.ns51 1.0 | 1 | 1% | 2 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

Posture (Hadur's M records, 331 rounds): 268051 melee ticks, 102180 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 48 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 0.

Targeting waves (331 rounds): 85929 sent, 77892 reached their opponent, 11216 virtual hits (14.4% of those reached).

## Melee bench: F30

hadur117.Hadur 3.24bb against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 314 over 10 battles (31.4 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 80.5 | 124 / 350 | 2.56 | 18.7% | 45172 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 18.7% | 124 |
| stelo.PastFuture 2.3.2 | 2.6 | 14.8% | 51 |
| darkcanuck.B26354 1.06 | 2.8 | 14.9% | 81 |
| oog.melee.Capulet 1.2 | 3.6 | 13.7% | 53 |
| intruder.PrairieWolf 2.61 | 5.4 | 10.5% | 21 |
| tripphippy.Alice 1.1 | 6.3 | 9.3% | 7 |
| ntc.Opposite 1.5 | 6.7 | 8.0% | 3 |
| fowl3628800.LightningBolt 2.6.0 | 7.6 | 7.1% | 10 |
| GarmBox.Anger 1.0 | 9.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 78.9 | 13 / 35 | 4640 |
| 2 | 1 | 67.8 | 85.4 | 19 / 35 | 4599 |
| 3 | 1 | 65.6 | 81.8 | 12 / 35 | 4160 |
| 4 | 1 | 66.8 | 81.8 | 16 / 35 | 4529 |
| 5 | 1 | 66.4 | 83.6 | 12 / 35 | 4301 |
| 6 | 1 | 65.7 | 80.0 | 11 / 35 | 4409 |
| 7 | 1 | 64.2 | 73.9 | 10 / 35 | 4429 |
| 8 | 1 | 65.5 | 79.6 | 9 / 35 | 4401 |
| 9 | 1 | 67.3 | 81.4 | 13 / 35 | 4954 |
| 10 | 1 | 65.8 | 78.2 | 9 / 35 | 4750 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 58 | 47% |
| stelo.PastFuture 2.3.2 | 53 | 57% |
| oog.melee.Capulet 1.2 | 49 | 61% |
| tripphippy.Alice 1.1 | 19 | 89% |
| intruder.PrairieWolf 2.61 | 19 | 74% |
| fowl3628800.LightningBolt 2.6.0 | 9 | 44% |
| ntc.Opposite 1.5 | 4 | 50% |

Hadur died in 228 of 350 rounds, at a mean tick of 920. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 72 | 32% | 96 |
| stelo.PastFuture 2.3.2 | 49 | 21% | 79 |
| oog.melee.Capulet 1.2 | 46 | 20% | 78 |
| tripphippy.Alice 1.1 | 25 | 11% | 38 |
| intruder.PrairieWolf 2.61 | 16 | 7% | 35 |
| ntc.Opposite 1.5 | 11 | 5% | 14 |
| fowl3628800.LightningBolt 2.6.0 | 5 | 2% | 6 |
| GarmBox.Anger 1.0 | 4 | 2% | 4 |

Posture (Hadur's M records, 334 rounds): 262726 melee ticks, 61736 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (334 rounds): longest scan gap while four or more were alive 41 ticks (334 rounds over 8); rounds whose longest gap at any count was over 8: 334; robots dropped as dead without a death event: 0.

Targeting waves (334 rounds): 75441 sent, 67964 reached their opponent, 11166 virtual hits (16.4% of those reached).

## Melee bench: F31

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 317 over 10 battles (31.7 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 82.4 | 112 / 350 | 2.58 | 16.7% | 40731 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.2 | 17.7% | 146 |
| hadur117.Hadur 3.24bb | 1.8 | 16.7% | 112 |
| gh.mini.Griezel 0.2 | 3.2 | 13.0% | 61 |
| d414.nano.Quantum 1.0.0 | 4.2 | 11.4% | 11 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 11.0% | 17 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.8% | 2 |
| timmit.nano.TimDog 0.33 | 7.0 | 6.7% | 1 |
| fm.mammillarias 1.3 | 8.5 | 5.1% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 4.8% | 0 |
| tlp.ThreeLeggedPig 1 | 9.2 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 84.1 | 12 / 35 | 4152 |
| 2 | 1 | 65.7 | 81.6 | 10 / 35 | 4213 |
| 3 | 2 | 66.4 | 82.5 | 11 / 35 | 4182 |
| 4 | 2 | 66.9 | 84.8 | 12 / 35 | 4199 |
| 5 | 2 | 65.5 | 80.0 | 10 / 35 | 3968 |
| 6 | 2 | 66.1 | 81.6 | 12 / 35 | 4092 |
| 7 | 2 | 67.8 | 87.0 | 15 / 35 | 4315 |
| 8 | 2 | 63.5 | 77.5 | 6 / 35 | 3557 |
| 9 | 2 | 65.7 | 80.0 | 11 / 35 | 4054 |
| 10 | 2 | 66.6 | 85.1 | 13 / 35 | 3999 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 99 | 41% |
| gh.mini.Griezel 0.2 | 59 | 54% |
| d414.nano.Quantum 1.0.0 | 22 | 91% |
| spinnercat.micro.Tyger 0.1 | 13 | 69% |
| timmit.nano.TimDog 0.33 | 4 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |

Hadur died in 239 of 350 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 112 | 47% | 158 |
| gh.mini.Griezel 0.2 | 58 | 24% | 92 |
| spinnercat.micro.Tyger 0.1 | 18 | 8% | 27 |
| d414.nano.Quantum 1.0.0 | 16 | 7% | 26 |
| gh.nano.Grofvuil 0.2 | 16 | 7% | 24 |
| timmit.nano.TimDog 0.33 | 8 | 3% | 11 |
| fm.mammillarias 1.3 | 5 | 2% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 3 | 1% | 4 |
| tlp.ThreeLeggedPig 1 | 3 | 1% | 3 |

Posture (Hadur's M records, 332 rounds): 256636 melee ticks, 57669 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 40 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 1.

Targeting waves (332 rounds): 80331 sent, 72105 reached their opponent, 11238 virtual hits (15.6% of those reached).

## Melee bench: F32

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 360 over 10 battles (36.0 per battle, most in one battle 45). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 91.9 | 233 / 350 | 1.73 | 19.6% | 50299 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 19.6% | 233 |
| kawigi.sbf.FloodHT 0.9.2 | 2.1 | 14.9% | 69 |
| apc.botM 3.0 | 3.0 | 11.8% | 28 |
| lxx.ConceptA 0.8 | 4.4 | 10.3% | 5 |
| vjik.UnViolation 1.1 | 5.0 | 9.7% | 5 |
| bayen.UbaMicro 1.4 | 5.7 | 8.9% | 5 |
| panzer.Panzer 0.2 | 7.3 | 7.1% | 1 |
| yk.JahMicro 1.0 | 8.2 | 6.7% | 2 |
| conscience.Electron 1.3g | 8.7 | 6.2% | 1 |
| donjezza.Jezza 1.0 | 9.6 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 94.3 | 27 / 35 | 4877 |
| 2 | 1 | 68.7 | 91.1 | 21 / 35 | 4687 |
| 3 | 1 | 68.5 | 89.2 | 22 / 35 | 5083 |
| 4 | 1 | 70.0 | 94.6 | 24 / 35 | 4942 |
| 5 | 1 | 68.3 | 87.9 | 20 / 35 | 5059 |
| 6 | 1 | 69.1 | 91.4 | 21 / 35 | 4785 |
| 7 | 1 | 70.1 | 90.8 | 24 / 35 | 5330 |
| 8 | 1 | 68.7 | 89.5 | 22 / 35 | 4809 |
| 9 | 1 | 69.9 | 93.0 | 24 / 35 | 5200 |
| 10 | 1 | 71.1 | 96.8 | 28 / 35 | 5527 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 151 | 69% |
| apc.botM 3.0 | 59 | 81% |
| lxx.ConceptA 0.8 | 28 | 89% |
| vjik.UnViolation 1.1 | 26 | 92% |
| bayen.UbaMicro 1.4 | 12 | 83% |
| yk.JahMicro 1.0 | 11 | 91% |
| donjezza.Jezza 1.0 | 6 | 100% |
| panzer.Panzer 0.2 | 5 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 120 of 350 rounds, at a mean tick of 805. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 55 | 46% | 139 |
| lxx.ConceptA 0.8 | 22 | 18% | 42 |
| apc.botM 3.0 | 15 | 13% | 71 |
| bayen.UbaMicro 1.4 | 10 | 8% | 25 |
| vjik.UnViolation 1.1 | 6 | 5% | 35 |
| conscience.Electron 1.3g | 6 | 5% | 9 |
| yk.JahMicro 1.0 | 3 | 3% | 16 |
| donjezza.Jezza 1.0 | 2 | 2% | 8 |
| panzer.Panzer 0.2 | 1 | 1% | 5 |

Posture (Hadur's M records, 332 rounds): 204670 melee ticks, 84815 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 55 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 0.

Targeting waves (332 rounds): 68495 sent, 60179 reached their opponent, 10585 virtual hits (17.6% of those reached).

## Melee bench: F33

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 421 over 10 battles (42.1 per battle, most in one battle 54). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 89.7 | 209 / 350 | 1.93 | 20.0% | 53145 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 20.0% | 209 |
| maribo.Quester 0.3 | 2.0 | 15.9% | 64 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.1 | 13.0% | 34 |
| gre.svman4.Leonidas 1.3.2 | 4.4 | 11.0% | 21 |
| labg.Cataclysm 2.05 | 4.8 | 10.2% | 17 |
| baal.nano.N 1.42 | 6.1 | 8.7% | 3 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.6 | 8.2% | 3 |
| zyx.micro.Ant 1.1 | 8.4 | 5.1% | 0 |
| sanja.First 0.1 | 8.6 | 4.9% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 85.1 | 18 / 35 | 5353 |
| 2 | 1 | 70.2 | 88.3 | 21 / 35 | 5422 |
| 3 | 1 | 68.5 | 84.1 | 17 / 35 | 4948 |
| 4 | 1 | 70.8 | 92.1 | 24 / 35 | 5191 |
| 5 | 1 | 72.8 | 96.5 | 27 / 35 | 5745 |
| 6 | 1 | 69.9 | 89.5 | 20 / 35 | 4839 |
| 7 | 1 | 71.3 | 91.4 | 20 / 35 | 5656 |
| 8 | 1 | 70.7 | 89.2 | 21 / 35 | 5420 |
| 9 | 1 | 70.9 | 92.7 | 22 / 35 | 5156 |
| 10 | 1 | 70.1 | 87.9 | 19 / 35 | 5415 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 110 | 78% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 59 | 69% |
| gre.svman4.Leonidas 1.3.2 | 45 | 82% |
| labg.Cataclysm 2.05 | 29 | 83% |
| kinsen.melee.Angsaichmophobia 1.8c | 12 | 92% |
| baal.nano.N 1.42 | 7 | 86% |
| sanja.First 0.1 | 3 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 142 of 350 rounds, at a mean tick of 1070. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 59 | 42% | 130 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 19% | 76 |
| gre.svman4.Leonidas 1.3.2 | 24 | 17% | 48 |
| labg.Cataclysm 2.05 | 15 | 11% | 44 |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 6% | 19 |
| baal.nano.N 1.42 | 5 | 4% | 23 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 1% | 2 |
| sanja.First 0.1 | 1 | 1% | 4 |
| zyx.micro.Ant 1.1 | 1 | 1% | 3 |

Posture (Hadur's M records, 333 rounds): 287239 melee ticks, 86379 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 85 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 85 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 0.

Targeting waves (333 rounds): 88680 sent, 80605 reached their opponent, 10985 virtual hits (13.6% of those reached).

## Melee bench: F34

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 284 over 10 battles (28.4 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 89.2 | 159 / 350 | 1.97 | 19.3% | 57242 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 19.3% | 159 |
| kid.Gladiator .7.2 | 2.3 | 16.3% | 69 |
| stelo.Spread 0.9 | 2.7 | 16.0% | 89 |
| jcs.Seth 1.8 | 4.2 | 11.0% | 21 |
| tcf.Reach 3 | 4.9 | 10.5% | 9 |
| cli.Dancer 1.1 | 5.9 | 9.2% | 1 |
| ratosh.Wesco 1.4 | 7.1 | 6.9% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.6% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.3% | 1 |
| sample.RamFire 1.0 | 9.7 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 88.9 | 16 / 35 | 6098 |
| 2 | 1 | 69.0 | 87.0 | 14 / 35 | 5225 |
| 3 | 1 | 70.2 | 88.6 | 18 / 35 | 5507 |
| 4 | 1 | 69.7 | 88.3 | 15 / 35 | 5584 |
| 5 | 1 | 70.3 | 89.2 | 16 / 35 | 5858 |
| 6 | 1 | 70.9 | 89.5 | 18 / 35 | 5979 |
| 7 | 1 | 71.2 | 91.1 | 19 / 35 | 6000 |
| 8 | 1 | 69.3 | 87.9 | 12 / 35 | 5342 |
| 9 | 1 | 70.2 | 91.4 | 14 / 35 | 5753 |
| 10 | 1 | 70.9 | 90.2 | 17 / 35 | 5896 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 117 | 60% |
| kid.Gladiator .7.2 | 105 | 59% |
| jcs.Seth 1.8 | 27 | 56% |
| tcf.Reach 3 | 9 | 67% |
| ratosh.Wesco 1.4 | 5 | 80% |
| cli.Dancer 1.1 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 0% |

Hadur died in 191 of 350 rounds, at a mean tick of 1114. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 78 | 41% | 133 |
| stelo.Spread 0.9 | 66 | 35% | 127 |
| tcf.Reach 3 | 21 | 11% | 30 |
| jcs.Seth 1.8 | 19 | 10% | 40 |
| ratosh.Wesco 1.4 | 4 | 2% | 10 |
| sample.VelociRobot 1.0 | 2 | 1% | 2 |
| cli.Dancer 1.1 | 1 | 1% | 8 |

Posture (Hadur's M records, 330 rounds): 274892 melee ticks, 97815 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 39 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 0.

Targeting waves (330 rounds): 83098 sent, 74841 reached their opponent, 11931 virtual hits (15.9% of those reached).

## Melee bench: F35

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 264 over 10 battles (26.4 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 82.6 | 89 / 350 | 2.56 | 16.4% | 39737 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 18.9% | 207 |
| hadur117.Hadur 3.24bb | 2.0 | 16.4% | 89 |
| gh.mini.Gruwel 0.9 | 3.3 | 13.1% | 35 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.1 | 12.2% | 17 |
| rz.HawkOnFire 0.1 | 4.6 | 11.5% | 5 |
| wit.Chuliath 1.0 | 6.5 | 6.5% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6.7 | 6.4% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.2 | 5.5% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.8% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 78.1 | 5 / 35 | 3761 |
| 2 | 2 | 65.8 | 81.0 | 9 / 35 | 4107 |
| 3 | 2 | 66.4 | 86.0 | 7 / 35 | 4195 |
| 4 | 2 | 66.3 | 85.1 | 9 / 35 | 3936 |
| 5 | 2 | 64.0 | 78.1 | 9 / 35 | 3715 |
| 6 | 2 | 66.3 | 83.8 | 9 / 35 | 4109 |
| 7 | 2 | 68.3 | 88.6 | 15 / 35 | 4453 |
| 8 | 2 | 65.1 | 79.7 | 9 / 35 | 3757 |
| 9 | 2 | 64.6 | 81.6 | 6 / 35 | 3666 |
| 10 | 2 | 66.4 | 84.4 | 11 / 35 | 4038 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 147 | 27% |
| gh.mini.Gruwel 0.9 | 38 | 47% |
| dmh.robocode.robot.BlackDeath 9.2 | 23 | 78% |
| rz.HawkOnFire 0.1 | 15 | 87% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 264 of 350 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 137 | 52% | 182 |
| gh.mini.Gruwel 0.9 | 50 | 19% | 66 |
| dmh.robocode.robot.BlackDeath 9.2 | 35 | 13% | 48 |
| rz.HawkOnFire 0.1 | 20 | 8% | 29 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 12 | 5% | 12 |
| wit.Chuliath 1.0 | 3 | 1% | 6 |
| stelo.MyAgileRobot 0.2 | 3 | 1% | 4 |
| myl.nano.KomoriNinja 1.1 | 1 | 0% | 1 |
| dans.Cinnamon 1.2 | 1 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 333 rounds): 234885 melee ticks, 83159 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 49 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 2.

Targeting waves (333 rounds): 72174 sent, 63900 reached their opponent, 9536 virtual hits (14.9% of those reached).

## Melee bench: F36

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 419 over 10 battles (41.9 per battle, most in one battle 49). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 93.6 | 273 / 350 | 1.58 | 21.4% | 57842 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 21.4% | 273 |
| alpha.RainingFire 1.0 | 2.6 | 12.3% | 21 |
| bzdp.Pansy 2.1 | 2.9 | 12.1% | 16 |
| bvh.micro.Freya 0.3 | 4.3 | 11.0% | 18 |
| mz.Cork 0.1 | 4.6 | 10.7% | 8 |
| m3thos.Eva02 0.7.1 | 5.9 | 10.0% | 10 |
| bvh.mini.Fenrir 0.39 | 6.7 | 9.2% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.4 | 4.9% | 0 |
| dl.BetterWalls 1.0 | 8.6 | 5.3% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 90.5 | 26 / 35 | 5594 |
| 2 | 1 | 72.0 | 94.6 | 27 / 35 | 5700 |
| 3 | 1 | 72.9 | 94.6 | 28 / 35 | 6228 |
| 4 | 1 | 73.1 | 97.8 | 30 / 35 | 6137 |
| 5 | 1 | 71.7 | 93.7 | 27 / 35 | 5667 |
| 6 | 1 | 73.0 | 95.2 | 30 / 35 | 6310 |
| 7 | 1 | 71.1 | 93.7 | 25 / 35 | 5487 |
| 8 | 1 | 70.9 | 89.8 | 27 / 35 | 5440 |
| 9 | 1 | 71.5 | 91.7 | 26 / 35 | 5705 |
| 10 | 1 | 71.9 | 94.3 | 27 / 35 | 5574 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.micro.Freya 0.3 | 68 | 94% |
| bzdp.Pansy 2.1 | 67 | 91% |
| alpha.RainingFire 1.0 | 57 | 84% |
| mz.Cork 0.1 | 51 | 92% |
| m3thos.Eva02 0.7.1 | 32 | 81% |
| bvh.mini.Fenrir 0.39 | 25 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 78 of 350 rounds, at a mean tick of 811. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 24 | 31% | 60 |
| bzdp.Pansy 2.1 | 14 | 18% | 75 |
| bvh.micro.Freya 0.3 | 12 | 15% | 62 |
| m3thos.Eva02 0.7.1 | 12 | 15% | 38 |
| mz.Cork 0.1 | 9 | 12% | 60 |
| bvh.mini.Fenrir 0.39 | 6 | 8% | 36 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 3 |
| dl.BetterWalls 1.0 | 0 | 0% | 8 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 4 |

Posture (Hadur's M records, 335 rounds): 234642 melee ticks, 78010 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (335 rounds): longest scan gap while four or more were alive 51 ticks (335 rounds over 8); rounds whose longest gap at any count was over 8: 335; robots dropped as dead without a death event: 2.

Targeting waves (335 rounds): 79779 sent, 71803 reached their opponent, 13800 virtual hits (19.2% of those reached).

## Melee bench: F37

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 465 over 10 battles (46.5 per battle, most in one battle 51). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 87.3 | 269 / 350 | 2.15 | 19.4% | 58497 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 19.4% | 269 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.9 | 11.0% | 11 |
| germ.TheMind .2 | 3.5 | 10.1% | 18 |
| EBBU.Sim2 1.02 | 4.7 | 9.5% | 4 |
| agrach.Dalek 1.0 | 4.8 | 9.4% | 19 |
| stelo.UntouchableNano 1.3 | 6.6 | 8.7% | 16 |
| mn.nano.perceptual.Impact 1.3.0 | 7.1 | 8.3% | 1 |
| lmk.ACPFinal 0.1 | 7.4 | 8.3% | 5 |
| mb.Beast 0.1 | 7.8 | 8.0% | 6 |
| skm.Ryubot 1.0 | 9.2 | 7.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 77.8 | 22 / 35 | 5485 |
| 2 | 1 | 68.9 | 88.3 | 27 / 35 | 5821 |
| 3 | 1 | 70.0 | 92.1 | 30 / 35 | 6143 |
| 4 | 1 | 69.3 | 88.3 | 28 / 35 | 5965 |
| 5 | 1 | 70.8 | 93.7 | 29 / 35 | 6405 |
| 6 | 1 | 69.9 | 94.0 | 29 / 35 | 5754 |
| 7 | 1 | 68.6 | 87.3 | 28 / 35 | 5779 |
| 8 | 1 | 67.9 | 84.8 | 25 / 35 | 5846 |
| 9 | 1 | 68.3 | 85.4 | 26 / 35 | 5996 |
| 10 | 1 | 66.8 | 81.3 | 25 / 35 | 5303 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 47 | 98% |
| com.syncleus.robocode.Dreadnaught 0.1 | 47 | 100% |
| stelo.UntouchableNano 1.3 | 36 | 89% |
| agrach.Dalek 1.0 | 35 | 97% |
| mb.Beast 0.1 | 30 | 100% |
| EBBU.Sim2 1.02 | 28 | 100% |
| lmk.ACPFinal 0.1 | 28 | 100% |
| skm.Ryubot 1.0 | 20 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 5 | 80% |

Hadur died in 82 of 350 rounds, at a mean tick of 365. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 34 | 41% | 49 |
| com.syncleus.robocode.Dreadnaught 0.1 | 16 | 20% | 64 |
| agrach.Dalek 1.0 | 10 | 12% | 57 |
| stelo.UntouchableNano 1.3 | 8 | 10% | 37 |
| EBBU.Sim2 1.02 | 4 | 5% | 35 |
| germ.TheMind .2 | 4 | 5% | 33 |
| mb.Beast 0.1 | 3 | 4% | 35 |
| lmk.ACPFinal 0.1 | 3 | 4% | 27 |
| skm.Ryubot 1.0 | 0 | 0% | 6 |

Posture (Hadur's M records, 333 rounds): 150742 melee ticks, 42968 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 104 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 104 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 0.

Targeting waves (333 rounds): 49687 sent, 41953 reached their opponent, 11686 virtual hits (27.9% of those reached).

## Melee bench: F38

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 319 over 10 battles (31.9 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 88.3 | 204 / 350 | 2.05 | 19.0% | 50943 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 19.0% | 204 |
| justin.Mallais 14.0 | 2.1 | 15.1% | 85 |
| bvh.mini.Freya 0.55 | 3.0 | 13.0% | 17 |
| bts.mega.Gnarly 1.4 | 4.0 | 11.7% | 30 |
| cs.Wren 1.0 | 5.3 | 10.4% | 6 |
| kdf.KoulDestroyer 1.0 | 5.6 | 9.5% | 6 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.0 | 8.2% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.1 | 5.6% | 1 |
| matt.UnderDark3 2.4.34 | 9.1 | 4.2% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 90.8 | 21 / 35 | 5352 |
| 2 | 1 | 68.9 | 86.7 | 21 / 35 | 5073 |
| 3 | 1 | 68.3 | 83.2 | 19 / 35 | 5083 |
| 4 | 1 | 69.4 | 88.6 | 22 / 35 | 5220 |
| 5 | 1 | 68.2 | 86.7 | 15 / 35 | 4959 |
| 6 | 1 | 70.1 | 88.9 | 23 / 35 | 5442 |
| 7 | 1 | 68.9 | 87.9 | 20 / 35 | 5032 |
| 8 | 1 | 69.2 | 91.4 | 21 / 35 | 4555 |
| 9 | 1 | 70.7 | 94.6 | 22 / 35 | 5248 |
| 10 | 1 | 68.2 | 84.4 | 20 / 35 | 4979 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 109 | 64% |
| bts.mega.Gnarly 1.4 | 58 | 84% |
| bvh.mini.Freya 0.55 | 50 | 84% |
| cs.Wren 1.0 | 27 | 89% |
| kdf.KoulDestroyer 1.0 | 14 | 93% |
| davidalves.net.DuelistNanoMelee 1.01 | 2 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 146 of 350 rounds, at a mean tick of 789. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 67 | 46% | 133 |
| bts.mega.Gnarly 1.4 | 26 | 18% | 73 |
| bvh.mini.Freya 0.55 | 24 | 16% | 61 |
| kdf.KoulDestroyer 1.0 | 13 | 9% | 27 |
| cs.Wren 1.0 | 12 | 8% | 42 |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 2% | 9 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 4 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 1 |

Posture (Hadur's M records, 333 rounds): 223122 melee ticks, 67812 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 41 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 1.

Targeting waves (333 rounds): 72013 sent, 63406 reached their opponent, 12994 virtual hits (20.5% of those reached).

## Melee bench: F39

hadur117.Hadur 3.24bb against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 341 over 10 battles (34.1 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 92.2 | 225 / 350 | 1.63 | 22.5% | 57533 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 22.5% | 225 |
| bvh.fry.Freya 0.82 | 2.3 | 16.1% | 27 |
| az.Ololobot 0.2.4 | 2.7 | 15.2% | 94 |
| winamp32.micro.MicroMacro 1.0 | 4.1 | 10.0% | 1 |
| apollokidd.ApolloKidd 0.9 | 5.4 | 8.5% | 0 |
| gimp.GimpBot 0.1 | 5.7 | 8.5% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 7.1 | 7.5% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 7.8 | 6.3% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.9 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 91.8 | 21 / 35 | 6334 |
| 2 | 1 | 70.0 | 91.1 | 24 / 35 | 5216 |
| 3 | 1 | 71.7 | 94.3 | 27 / 35 | 6033 |
| 4 | 1 | 71.5 | 94.6 | 24 / 35 | 5803 |
| 5 | 1 | 70.5 | 91.8 | 20 / 35 | 5857 |
| 6 | 1 | 70.3 | 91.4 | 23 / 35 | 5592 |
| 7 | 1 | 69.8 | 88.9 | 19 / 35 | 5757 |
| 8 | 1 | 70.5 | 89.3 | 22 / 35 | 5680 |
| 9 | 1 | 70.3 | 92.1 | 20 / 35 | 5482 |
| 10 | 1 | 72.0 | 96.4 | 25 / 35 | 5779 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 152 | 57% |
| bvh.fry.Freya 0.82 | 115 | 87% |
| winamp32.micro.MicroMacro 1.0 | 15 | 100% |
| gimp.GimpBot 0.1 | 12 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 6 | 100% |
| apollokidd.ApolloKidd 0.9 | 4 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 100% |

Hadur died in 125 of 350 rounds, at a mean tick of 1201. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 77 | 62% | 168 |
| bvh.fry.Freya 0.82 | 34 | 27% | 103 |
| apollokidd.ApolloKidd 0.9 | 4 | 3% | 11 |
| gimp.GimpBot 0.1 | 3 | 2% | 20 |
| stelo.SoRobotNanoMelee 1.2 | 3 | 2% | 4 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 31 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 2% | 9 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 2 |

Posture (Hadur's M records, 333 rounds): 255834 melee ticks, 120318 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 106 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 106 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 0.

Targeting waves (333 rounds): 74023 sent, 66807 reached their opponent, 11622 virtual hits (17.4% of those reached).

## Melee bench: F40

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 401 over 10 battles (40.1 per battle, most in one battle 47). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 90.4 | 231 / 350 | 1.86 | 20.5% | 56136 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 20.5% | 231 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.8% | 54 |
| kano.gamma.KanoGamma 1.8 | 3.1 | 12.5% | 27 |
| mz.AntiGrav 1.0 | 4.1 | 10.8% | 8 |
| Polkwane.SmashMelee 1.0 | 4.9 | 10.4% | 7 |
| stelo.Randomness 1.0 | 6.0 | 9.2% | 17 |
| alpha.BlackIce 1.0 | 6.9 | 8.8% | 4 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.5% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.1 | 3.7% | 2 |
| sample.Corners 1.0 | 9.9 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 91.1 | 23 / 35 | 5899 |
| 2 | 1 | 70.1 | 87.3 | 21 / 35 | 5419 |
| 3 | 1 | 69.1 | 85.1 | 19 / 35 | 5064 |
| 4 | 1 | 72.2 | 93.7 | 24 / 35 | 5831 |
| 5 | 1 | 72.0 | 93.0 | 26 / 35 | 5564 |
| 6 | 1 | 71.4 | 92.1 | 25 / 35 | 5397 |
| 7 | 1 | 72.2 | 93.7 | 28 / 35 | 5897 |
| 8 | 1 | 71.3 | 91.7 | 21 / 35 | 5650 |
| 9 | 1 | 71.3 | 89.2 | 25 / 35 | 5633 |
| 10 | 1 | 70.3 | 87.6 | 19 / 35 | 5782 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 115 | 79% |
| kano.gamma.KanoGamma 1.8 | 62 | 82% |
| mz.AntiGrav 1.0 | 41 | 98% |
| Polkwane.SmashMelee 1.0 | 32 | 91% |
| stelo.Randomness 1.0 | 22 | 50% |
| alpha.BlackIce 1.0 | 6 | 100% |
| amk.superstrike.SuperStrike 0.3 | 3 | 100% |

Hadur died in 120 of 350 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 45 | 38% | 94 |
| kano.gamma.KanoGamma 1.8 | 31 | 26% | 102 |
| stelo.Randomness 1.0 | 16 | 13% | 35 |
| Polkwane.SmashMelee 1.0 | 11 | 9% | 37 |
| mz.AntiGrav 1.0 | 6 | 5% | 42 |
| alpha.BlackIce 1.0 | 5 | 4% | 20 |
| amk.superstrike.SuperStrike 0.3 | 5 | 4% | 15 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 2 |
| sample.Corners 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 332 rounds): 248397 melee ticks, 73108 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 88 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 88 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 0.

Targeting waves (332 rounds): 79034 sent, 70640 reached their opponent, 13597 virtual hits (19.2% of those reached).

## Melee bench: F41

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 270 over 10 battles (27.0 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 88.4 | 177 / 350 | 2.04 | 18.8% | 48417 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.1 | 18.8% | 177 |
| eem.EvBotNG v12.8 | 1.9 | 16.6% | 127 |
| ary.Swarm 1.1 | 3.1 | 13.1% | 15 |
| lessonz.robocode.Oz 0.5.0 | 4.0 | 12.1% | 19 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.7% | 8 |
| shrub.Silver v048 | 5.9 | 9.1% | 3 |
| zyx.nano.Ant 1.1 | 7.0 | 7.2% | 1 |
| stelo.Mirror 1.1 | 8.3 | 5.3% | 1 |
| jsal.Jsalbot 1.0 | 8.7 | 5.1% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.0 | 87.0 | 12 / 35 | 4585 |
| 2 | 1 | 68.8 | 87.9 | 18 / 35 | 4718 |
| 3 | 1 | 68.4 | 88.6 | 14 / 35 | 4635 |
| 4 | 1 | 70.7 | 92.1 | 22 / 35 | 5234 |
| 5 | 1 | 68.9 | 86.3 | 17 / 35 | 4810 |
| 6 | 1 | 69.6 | 88.6 | 19 / 35 | 4967 |
| 7 | 1 | 70.0 | 88.3 | 21 / 35 | 5023 |
| 8 | 1 | 69.1 | 89.5 | 13 / 35 | 4623 |
| 9 | 1 | 69.0 | 86.3 | 19 / 35 | 4853 |
| 10 | 1 | 69.9 | 89.5 | 22 / 35 | 4969 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 156 | 49% |
| ary.Swarm 1.1 | 41 | 88% |
| lessonz.robocode.Oz 0.5.0 | 41 | 90% |
| simonton.nano.MeleeSeed 1.8 | 22 | 95% |
| shrub.Silver v048 | 5 | 80% |
| jsal.Jsalbot 1.0 | 2 | 50% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 174 of 350 rounds, at a mean tick of 1012. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 101 | 58% | 175 |
| ary.Swarm 1.1 | 25 | 14% | 51 |
| lessonz.robocode.Oz 0.5.0 | 16 | 9% | 43 |
| simonton.nano.MeleeSeed 1.8 | 12 | 7% | 38 |
| shrub.Silver v048 | 10 | 6% | 26 |
| zyx.nano.Ant 1.1 | 4 | 2% | 7 |
| stelo.Mirror 1.1 | 3 | 2% | 5 |
| jsal.Jsalbot 1.0 | 2 | 1% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 332 rounds): 248358 melee ticks, 101448 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 79 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 0.

Targeting waves (332 rounds): 79897 sent, 71580 reached their opponent, 10482 virtual hits (14.6% of those reached).

## Melee bench: F42

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 339 over 10 battles (33.9 per battle, most in one battle 45). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 92.2 | 251 / 350 | 1.71 | 20.8% | 61413 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 20.8% | 251 |
| wompi.Wallaby 5.1 | 2.2 | 14.9% | 41 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.5% | 16 |
| ara.Shera 0.88 | 3.5 | 13.1% | 41 |
| amz.NanoClone 1.41 | 5.0 | 8.5% | 1 |
| dsw.StaticD 1.0 | 6.9 | 6.4% | 0 |
| maribo.IotaCT 1.1 | 7.2 | 6.4% | 0 |
| stelo.MirrorMicro 1.0 | 7.8 | 6.1% | 0 |
| mme.NikeEnhanced 2.0 | 8.5 | 5.7% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.6 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 89.8 | 22 / 35 | 5572 |
| 2 | 1 | 69.4 | 85.1 | 22 / 35 | 5837 |
| 3 | 1 | 72.1 | 94.0 | 28 / 35 | 5991 |
| 4 | 1 | 71.9 | 94.0 | 28 / 35 | 6288 |
| 5 | 1 | 71.2 | 90.5 | 24 / 35 | 6288 |
| 6 | 1 | 70.4 | 89.5 | 20 / 35 | 6008 |
| 7 | 1 | 73.3 | 97.8 | 31 / 35 | 6821 |
| 8 | 1 | 71.7 | 93.3 | 24 / 35 | 6281 |
| 9 | 1 | 72.2 | 94.3 | 29 / 35 | 6330 |
| 10 | 1 | 71.3 | 93.3 | 23 / 35 | 5997 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 144 | 93% |
| maribo.mini.MiniQuester 0.1 | 78 | 92% |
| ara.Shera 0.88 | 59 | 66% |
| dsw.StaticD 1.0 | 5 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 101 of 350 rounds, at a mean tick of 897. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 42 | 42% | 100 |
| wompi.Wallaby 5.1 | 21 | 21% | 129 |
| maribo.mini.MiniQuester 0.1 | 20 | 20% | 84 |
| amz.NanoClone 1.41 | 8 | 8% | 11 |
| dsw.StaticD 1.0 | 2 | 2% | 9 |
| maribo.IotaCT 1.1 | 2 | 2% | 5 |
| mme.NikeEnhanced 2.0 | 2 | 2% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 2% | 4 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 332 rounds): 261195 melee ticks, 85263 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 50 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 0.

Targeting waves (332 rounds): 81738 sent, 73707 reached their opponent, 13500 virtual hits (18.3% of those reached).

## Melee bench: F43

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 285 over 10 battles (28.5 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 80.9 | 72 / 350 | 2.72 | 16.5% | 45139 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.5% | 235 |
| hadur117.Hadur 3.24bb | 2.0 | 16.5% | 72 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.7% | 36 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.7% | 7 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.4% | 3 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.5% | 1 |
| mz.NanoGod 2.02 | 7.4 | 7.6% | 0 |
| jab.DiamondStealer 5 | 7.6 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.5% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.4 | 85.1 | 12 / 35 | 4783 |
| 2 | 2 | 66.4 | 78.7 | 6 / 35 | 4378 |
| 3 | 2 | 67.7 | 83.2 | 9 / 35 | 4726 |
| 4 | 2 | 67.0 | 79.0 | 9 / 35 | 4507 |
| 5 | 2 | 68.7 | 85.4 | 9 / 35 | 4874 |
| 6 | 2 | 66.8 | 81.6 | 4 / 35 | 4454 |
| 7 | 2 | 65.8 | 75.9 | 5 / 35 | 4367 |
| 8 | 2 | 66.8 | 80.6 | 5 / 35 | 4647 |
| 9 | 2 | 65.8 | 80.0 | 4 / 35 | 4056 |
| 10 | 2 | 66.6 | 79.0 | 9 / 35 | 4347 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 130 | 22% |
| brainfade.melee.Dusk 0.44 | 28 | 57% |
| dummy.micro.Sparrow 2.5 | 19 | 89% |
| wcsv.melee.EngineerMelee 0.1 | 11 | 73% |
| Krabb.akim2.Akim2 1.1b | 3 | 67% |

Hadur died in 281 of 350 rounds, at a mean tick of 975. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 173 | 62% | 200 |
| brainfade.melee.Dusk 0.44 | 45 | 16% | 60 |
| dummy.micro.Sparrow 2.5 | 25 | 9% | 42 |
| wcsv.melee.EngineerMelee 0.1 | 15 | 5% | 24 |
| Krabb.akim2.Akim2 1.1b | 7 | 2% | 9 |
| mz.NanoGod 2.02 | 6 | 2% | 8 |
| jab.DiamondStealer 5 | 6 | 2% | 6 |
| cvt.Firsty 1.0 | 1 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 336 rounds): 258675 melee ticks, 77645 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 175 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (336 rounds): longest scan gap while four or more were alive 175 ticks (336 rounds over 8); rounds whose longest gap at any count was over 8: 336; robots dropped as dead without a death event: 1.

Targeting waves (336 rounds): 79542 sent, 70997 reached their opponent, 10819 virtual hits (15.2% of those reached).

## Melee bench: F44

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 375 over 10 battles (37.5 per battle, most in one battle 50). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 93.5 | 244 / 350 | 1.59 | 21.4% | 62047 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 21.4% | 244 |
| stelo.Liblix 0.3.1 | 2.1 | 15.7% | 74 |
| tzu.TheArtOfWar 1.2 | 2.9 | 14.2% | 30 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.4 | 9.4% | 2 |
| jwirde.Gort 2.0 | 4.6 | 9.2% | 0 |
| disan.Chair 2.2.0 | 6.5 | 7.4% | 1 |
| wompi.Quokka 1.6 | 7.0 | 7.1% | 1 |
| stf.PanzerGeneral 0.1 | 7.5 | 6.8% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.5% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 95.2 | 27 / 35 | 6573 |
| 2 | 1 | 71.4 | 92.4 | 22 / 35 | 5895 |
| 3 | 1 | 72.5 | 95.2 | 27 / 35 | 6159 |
| 4 | 1 | 70.5 | 87.9 | 19 / 35 | 5863 |
| 5 | 1 | 71.8 | 92.7 | 24 / 35 | 6303 |
| 6 | 1 | 71.8 | 94.3 | 24 / 35 | 5728 |
| 7 | 1 | 72.3 | 94.9 | 24 / 35 | 6206 |
| 8 | 1 | 73.8 | 96.5 | 32 / 35 | 6678 |
| 9 | 1 | 71.7 | 93.0 | 22 / 35 | 6343 |
| 10 | 1 | 71.7 | 92.7 | 23 / 35 | 6299 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 141 | 73% |
| tzu.TheArtOfWar 1.2 | 101 | 88% |
| jwirde.Gort 2.0 | 15 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 15 | 100% |
| disan.Chair 2.2.0 | 10 | 100% |
| wompi.Quokka 1.6 | 5 | 100% |
| stf.PanzerGeneral 0.1 | 4 | 100% |
| sample.Crazy 1.0 | 3 | 100% |

Hadur died in 107 of 350 rounds, at a mean tick of 965. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 64 | 60% | 181 |
| tzu.TheArtOfWar 1.2 | 29 | 27% | 106 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 5% | 9 |
| jwirde.Gort 2.0 | 3 | 3% | 29 |
| disan.Chair 2.2.0 | 2 | 2% | 9 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 6 |
| wompi.Quokka 1.6 | 1 | 1% | 5 |
| sample.Crazy 1.0 | 1 | 1% | 4 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 332 rounds): 255686 melee ticks, 81516 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 835 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 433 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 1.

Targeting waves (332 rounds): 84448 sent, 76458 reached their opponent, 15004 virtual hits (19.6% of those reached).

## Melee bench: F45

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 318 over 10 battles (31.8 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 89.4 | 188 / 350 | 1.95 | 20.3% | 58612 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.0 | 20.3% | 188 |
| jje.BagPuss 1.2 | 3.2 | 11.9% | 15 |
| eem.IWillFireNoBullet v2.8 | 3.3 | 11.8% | 114 |
| sul.Lunar 1.1 | 3.8 | 11.3% | 18 |
| myl.nano.Graviton 1.10 | 4.0 | 10.8% | 9 |
| hvilela.HVilela 0.9 | 6.3 | 8.6% | 0 |
| fm.claire 1.7 | 7.1 | 7.9% | 2 |
| pez.mini.ChironexFleckeri 0.5 | 7.3 | 7.9% | 1 |
| wit.Deep7 2.0 | 9.0 | 5.4% | 3 |
| abud.ThirdRobo 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 91.4 | 19 / 35 | 6076 |
| 2 | 1 | 70.9 | 90.5 | 21 / 35 | 5906 |
| 3 | 1 | 70.0 | 90.2 | 16 / 35 | 5659 |
| 4 | 1 | 70.6 | 91.1 | 19 / 35 | 5878 |
| 5 | 1 | 70.5 | 90.5 | 18 / 35 | 6140 |
| 6 | 1 | 70.4 | 88.9 | 18 / 35 | 6107 |
| 7 | 1 | 70.4 | 89.8 | 19 / 35 | 5836 |
| 8 | 1 | 69.6 | 88.3 | 21 / 35 | 5320 |
| 9 | 1 | 69.8 | 87.6 | 19 / 35 | 5740 |
| 10 | 1 | 69.9 | 85.7 | 18 / 35 | 5950 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 124 | 50% |
| jje.BagPuss 1.2 | 50 | 86% |
| sul.Lunar 1.1 | 46 | 87% |
| myl.nano.Graviton 1.10 | 27 | 89% |
| pez.mini.ChironexFleckeri 0.5 | 15 | 93% |
| fm.claire 1.7 | 3 | 67% |
| hvilela.HVilela 0.9 | 2 | 100% |
| wit.Deep7 2.0 | 1 | 100% |

Hadur died in 162 of 350 rounds, at a mean tick of 1611. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 73 | 45% | 0 |
| jje.BagPuss 1.2 | 33 | 20% | 111 |
| sul.Lunar 1.1 | 18 | 11% | 81 |
| myl.nano.Graviton 1.10 | 12 | 7% | 54 |
| fm.claire 1.7 | 11 | 7% | 25 |
| pez.mini.ChironexFleckeri 0.5 | 7 | 4% | 33 |
| hvilela.HVilela 0.9 | 7 | 4% | 25 |
| wit.Deep7 2.0 | 1 | 1% | 12 |
| abud.ThirdRobo 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 334 rounds): 330276 melee ticks, 144341 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (334 rounds): longest scan gap while four or more were alive 54 ticks (334 rounds over 8); rounds whose longest gap at any count was over 8: 334; robots dropped as dead without a death event: 1.

Targeting waves (334 rounds): 99300 sent, 91109 reached their opponent, 12584 virtual hits (13.8% of those reached).

## Melee bench: F46

hadur117.Hadur 3.24bb against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 240 over 10 battles (24.0 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 84.1 | 119 / 350 | 2.43 | 17.1% | 45186 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24bb | 1.6 | 17.1% | 119 |
| kc.mini.Mirage 0.2 | 2.0 | 16.5% | 86 |
| rsalesc.melee.Medina 0.4.5 | 2.4 | 16.2% | 126 |
| cx.Princess 1.0 | 4.4 | 10.1% | 15 |
| mz.MicroSheep 1.0 | 4.7 | 9.9% | 2 |
| sadoner.killer 0.2 | 6.2 | 8.8% | 0 |
| arthord.NanoSatanMelee Beta | 6.8 | 7.9% | 2 |
| jeremyreeder.collective.Prophet 5 | 8.1 | 5.6% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.0% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.2 | 80.6 | 10 / 35 | 3980 |
| 2 | 1 | 67.8 | 86.7 | 12 / 35 | 4710 |
| 3 | 1 | 67.5 | 84.1 | 15 / 35 | 4582 |
| 4 | 1 | 66.7 | 84.1 | 12 / 35 | 4516 |
| 5 | 2 | 66.8 | 82.9 | 12 / 35 | 4709 |
| 6 | 1 | 68.6 | 89.2 | 17 / 35 | 4749 |
| 7 | 3 | 65.8 | 81.9 | 8 / 35 | 4282 |
| 8 | 1 | 67.0 | 84.1 | 8 / 35 | 4809 |
| 9 | 1 | 65.9 | 80.3 | 14 / 35 | 4550 |
| 10 | 2 | 67.1 | 86.7 | 11 / 35 | 4299 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 113 | 64% |
| rsalesc.melee.Medina 0.4.5 | 66 | 23% |
| cx.Princess 1.0 | 18 | 83% |
| arthord.NanoSatanMelee Beta | 7 | 100% |
| mz.MicroSheep 1.0 | 6 | 100% |
| sadoner.killer 0.2 | 4 | 100% |

Hadur died in 231 of 350 rounds, at a mean tick of 937. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 97 | 42% | 169 |
| rsalesc.melee.Medina 0.4.5 | 87 | 38% | 107 |
| arthord.NanoSatanMelee Beta | 14 | 6% | 22 |
| cx.Princess 1.0 | 13 | 6% | 23 |
| mz.MicroSheep 1.0 | 8 | 3% | 11 |
| sadoner.killer 0.2 | 6 | 3% | 9 |
| kurios.DOSexe .9a | 4 | 2% | 5 |
| jeremyreeder.collective.Prophet 5 | 2 | 1% | 4 |

Posture (Hadur's M records, 331 rounds): 245715 melee ticks, 71778 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 55 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 1.

Targeting waves (331 rounds): 70911 sent, 62552 reached their opponent, 9029 virtual hits (14.4% of those reached).

