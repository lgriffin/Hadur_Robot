# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 228 over 6 battles (38.0 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 87.4 | 53 / 210 | 2.13 | 17.7% | 32317 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.3% | 133 |
| hadur117.Hadur 3.20wq | 2.0 | 17.7% | 53 |
| sgp.JollyNinja 3.53 | 3.8 | 11.4% | 9 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.2 | 11.0% | 6 |
| lorneswork.Predator 1.0 | 4.2 | 10.9% | 7 |
| mz.MicroGodMelee 1 | 5.8 | 9.8% | 3 |
| adt.Ar2 1.0 | 7.0 | 7.3% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.3% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.3% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.9 | 87.6 | 9 / 35 | 5382 |
| 2 | 2 | 68.3 | 88.3 | 11 / 35 | 5491 |
| 3 | 2 | 67.7 | 85.4 | 6 / 35 | 5712 |
| 4 | 2 | 68.6 | 90.5 | 9 / 35 | 5293 |
| 5 | 2 | 66.9 | 85.4 | 8 / 35 | 5159 |
| 6 | 2 | 67.8 | 87.3 | 10 / 35 | 5280 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 118 | 8% |
| sgp.JollyNinja 3.53 | 19 | 74% |
| mz.MicroGodMelee 1 | 12 | 83% |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 82% |
| lorneswork.Predator 1.0 | 10 | 80% |
| adt.Ar2 1.0 | 1 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 1178. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 116 | 73% | 129 |
| lorneswork.Predator 1.0 | 13 | 8% | 19 |
| simonton.nano.WeekendObsession_Melee 1.0 | 12 | 8% | 19 |
| sgp.JollyNinja 3.53 | 11 | 7% | 19 |
| mz.MicroGodMelee 1 | 4 | 3% | 15 |
| adt.Ar2 1.0 | 2 | 1% | 6 |
| skm.butterfly 1.0 | 0 | 0% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 139322 melee ticks, 89656 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 95 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 95 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 44800 sent, 39915 reached their opponent, 8130 virtual hits (20.4% of those reached).

## Melee bench: F02

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 149 over 6 battles (24.8 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 86.0 | 103 / 210 | 2.26 | 18.6% | 30439 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 18.6% | 103 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 13.7% | 49 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.4% | 21 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 11.2% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 10.5% | 14 |
| Noran.BitchingElk 0.054 | 6.0 | 8.8% | 15 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 7.9% | 1 |
| sch.Simone 0.3d | 8.0 | 7.0% | 6 |
| stelo.PatternRobot 1.0 | 8.8 | 5.4% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 90.5 | 19 / 35 | 5313 |
| 2 | 1 | 69.3 | 88.6 | 22 / 35 | 5171 |
| 3 | 1 | 68.6 | 84.1 | 16 / 35 | 5339 |
| 4 | 1 | 66.7 | 82.2 | 15 / 35 | 4829 |
| 5 | 1 | 66.4 | 81.9 | 13 / 35 | 4713 |
| 6 | 1 | 68.8 | 88.9 | 18 / 35 | 5074 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 51 | 47% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 34 | 74% |
| com.cohesiva.robocode.ManOwaR 1.0 | 22 | 77% |
| Noran.BitchingElk 0.054 | 19 | 53% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 100% |
| sch.Simone 0.3d | 11 | 73% |
| fnc.bandit.Bandit 5.2.0 | 3 | 100% |
| stelo.PatternRobot 1.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 994. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 38 | 35% | 57 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 20 | 19% | 48 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 13% | 20 |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 10% | 30 |
| Noran.BitchingElk 0.054 | 11 | 10% | 20 |
| sch.Simone 0.3d | 9 | 8% | 20 |
| fnc.bandit.Bandit 5.2.0 | 2 | 2% | 11 |
| stelo.PatternRobot 1.0 | 2 | 2% | 2 |
| fullsail.SweetTea 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 168242 melee ticks, 46780 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 111 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 111 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 59253 sent, 54408 reached their opponent, 9144 virtual hits (16.8% of those reached).

## Melee bench: F03

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 128 over 6 battles (21.3 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 91.4 | 158 / 210 | 1.78 | 20.4% | 38064 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 20.4% | 158 |
| radnor.DoctorBob 1.42 | 2.2 | 14.1% | 24 |
| vuen.Cake 2.51 | 3.3 | 12.5% | 15 |
| kawigi.nano.Lib 1.0 | 3.5 | 12.6% | 9 |
| urdos.URDOS 1.3 | 5.2 | 9.6% | 1 |
| adt.Ar1 2.1 | 6.2 | 7.4% | 0 |
| oa.weak.FlyMk1 0.1 | 7.2 | 6.5% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 6.5% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.2 | 5.4% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 87.0 | 24 / 35 | 6263 |
| 2 | 1 | 71.7 | 94.3 | 27 / 35 | 6744 |
| 3 | 1 | 71.0 | 93.7 | 26 / 35 | 6488 |
| 4 | 1 | 71.0 | 92.7 | 29 / 35 | 6362 |
| 5 | 1 | 71.1 | 92.7 | 27 / 35 | 6269 |
| 6 | 1 | 69.5 | 87.9 | 25 / 35 | 5938 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 70 | 90% |
| radnor.DoctorBob 1.42 | 53 | 92% |
| kawigi.nano.Lib 1.0 | 31 | 97% |
| oa.weak.FlyMk1 0.1 | 8 | 100% |
| urdos.URDOS 1.3 | 5 | 80% |
| adt.Ar1 2.1 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 692. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 19 | 37% | 58 |
| vuen.Cake 2.51 | 11 | 21% | 68 |
| urdos.URDOS 1.3 | 10 | 19% | 16 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 10% | 6 |
| kawigi.nano.Lib 1.0 | 4 | 8% | 36 |
| oa.weak.FlyMk1 0.1 | 2 | 4% | 10 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 7 |
| adt.Ar1 2.1 | 0 | 0% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 200 rounds): 129854 melee ticks, 38297 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 55 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 39414 sent, 34914 reached their opponent, 9291 virtual hits (26.6% of those reached).

## Melee bench: F04

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 601 over 6 battles (100.2 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 84.9 | 32 / 210 | 2.36 | 17.2% | 31903 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.0% | 148 |
| hadur117.Hadur 3.20wq | 2.0 | 17.2% | 32 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 14.0% | 16 |
| TNT.TNT 0.99.1 | 4.0 | 10.9% | 12 |
| josago.Jorgito 0.16 | 5.0 | 9.4% | 2 |
| css.Delitioner 0.11 | 6.2 | 7.3% | 0 |
| tj.zombie1n 1.0.1 | 7.0 | 6.6% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.2% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.7% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.3 | 84.4 | 6 / 35 | 5089 |
| 2 | 2 | 68.9 | 88.3 | 7 / 35 | 5560 |
| 3 | 2 | 67.3 | 83.5 | 4 / 35 | 5221 |
| 4 | 2 | 66.7 | 82.5 | 4 / 35 | 5160 |
| 5 | 2 | 68.9 | 87.9 | 7 / 35 | 5538 |
| 6 | 2 | 67.0 | 82.5 | 4 / 35 | 5335 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 120 | 11% |
| apc.LeeroyJenkins2 1.0 | 17 | 65% |
| TNT.TNT 0.99.1 | 11 | 27% |
| josago.Jorgito 0.16 | 3 | 67% |
| tj.zombie1n 1.0.1 | 2 | 100% |
| css.Delitioner 0.11 | 1 | 100% |

Hadur died in 183 of 210 rounds, at a mean tick of 1267. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 118 | 64% | 132 |
| apc.LeeroyJenkins2 1.0 | 29 | 16% | 39 |
| TNT.TNT 0.99.1 | 14 | 8% | 17 |
| josago.Jorgito 0.16 | 11 | 6% | 14 |
| rampancy.Durandal 2.1d | 3 | 2% | 3 |
| css.Delitioner 0.11 | 2 | 1% | 2 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 195303 melee ticks, 65134 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 40 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 59640 sent, 54739 reached their opponent, 8052 virtual hits (14.7% of those reached).

## Melee bench: F05

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 498 over 6 battles (83.0 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 79.9 | 29 / 210 | 2.80 | 15.4% | 24250 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 17.8% | 98 |
| justin.DemonicRage 3.4 | 1.8 | 16.8% | 57 |
| hadur117.Hadur 3.20wq | 3.0 | 15.4% | 29 |
| wompi.Numbat 2.1 | 4.0 | 12.7% | 18 |
| ms.Ares 0.19 | 5.5 | 9.1% | 2 |
| axeBots.HataMoto 3.09 | 5.5 | 9.2% | 6 |
| supersample.SuperBoxBot 1.0 | 7.3 | 5.8% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.4% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 3.7% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.5 | 79.4 | 5 / 35 | 4003 |
| 2 | 3 | 64.1 | 76.2 | 4 / 35 | 3973 |
| 3 | 3 | 65.0 | 80.3 | 5 / 35 | 4390 |
| 4 | 3 | 64.8 | 80.6 | 6 / 35 | 3891 |
| 5 | 3 | 66.0 | 84.1 | 6 / 35 | 4172 |
| 6 | 3 | 63.6 | 79.0 | 3 / 35 | 3821 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 43 | 26% |
| cb.fire.Firestarter 2.0f | 42 | 12% |
| wompi.Numbat 2.1 | 13 | 77% |
| axeBots.HataMoto 3.09 | 4 | 75% |
| ms.Ares 0.19 | 1 | 0% |

Hadur died in 185 of 210 rounds, at a mean tick of 949. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 74 | 40% | 85 |
| cb.fire.Firestarter 2.0f | 65 | 35% | 69 |
| wompi.Numbat 2.1 | 26 | 14% | 36 |
| axeBots.HataMoto 3.09 | 7 | 4% | 11 |
| ms.Ares 0.19 | 6 | 3% | 6 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 161866 melee ticks, 35142 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 63 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 48573 sent, 43690 reached their opponent, 7360 virtual hits (16.8% of those reached).

## Melee bench: F06

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 538 over 6 battles (89.7 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 88.9 | 131 / 210 | 2.00 | 19.6% | 32231 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 19.6% | 131 |
| jekl.StoneGhost 0.7 | 2.0 | 14.9% | 27 |
| origin.SleepSiphon 1.7b | 3.2 | 13.0% | 24 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.0% | 15 |
| mld.Wisdom 1.0 | 5.0 | 10.2% | 1 |
| gg.Wolverine 2.0 | 6.0 | 8.6% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 6.7% | 5 |
| DBall.NUKE 0.1 | 8.2 | 6.2% | 1 |
| spinnercat.Omen 1.0 | 8.3 | 6.0% | 0 |
| sample.Fire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 94.6 | 26 / 35 | 5420 |
| 2 | 1 | 70.4 | 89.2 | 26 / 35 | 5442 |
| 3 | 1 | 70.0 | 88.3 | 20 / 35 | 5576 |
| 4 | 1 | 69.9 | 87.6 | 23 / 35 | 5402 |
| 5 | 1 | 70.3 | 91.4 | 21 / 35 | 5455 |
| 6 | 1 | 67.2 | 82.2 | 15 / 35 | 4936 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 61 | 95% |
| origin.SleepSiphon 1.7b | 40 | 68% |
| pe.minimelee.SandboxMiniMelee 1.1 | 34 | 85% |
| gg.Wolverine 2.0 | 10 | 90% |
| mld.Wisdom 1.0 | 5 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 50% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 32 | 38% | 63 |
| jekl.StoneGhost 0.7 | 17 | 20% | 62 |
| pe.minimelee.SandboxMiniMelee 1.1 | 14 | 17% | 42 |
| mld.Wisdom 1.0 | 7 | 8% | 17 |
| gg.Wolverine 2.0 | 6 | 7% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 5% | 9 |
| DBall.NUKE 0.1 | 0 | 0% | 2 |
| spinnercat.Omen 1.0 | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 146295 melee ticks, 41229 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 64 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 46198 sent, 41406 reached their opponent, 9359 virtual hits (22.6% of those reached).

## Melee bench: F07

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 595 over 6 battles (99.2 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 93.4 | 126 / 210 | 1.59 | 21.0% | 39658 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 21.0% | 126 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 16.6% | 43 |
| rtk.Tachikoma 1.0 | 2.7 | 15.7% | 22 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.4% | 7 |
| franzor.Lizt 1.3.1 | 4.7 | 11.0% | 13 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 7.8% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.5% | 0 |
| sample.Target 1.0 | 9.2 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 93.7 | 22 / 35 | 7100 |
| 2 | 1 | 73.0 | 94.6 | 25 / 35 | 6437 |
| 3 | 1 | 72.9 | 94.0 | 18 / 35 | 6765 |
| 4 | 1 | 72.4 | 93.7 | 20 / 35 | 6316 |
| 5 | 1 | 72.1 | 90.5 | 20 / 35 | 6575 |
| 6 | 1 | 72.4 | 94.3 | 21 / 35 | 6465 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 75 | 81% |
| rsalesc.melee.Monk 0.3.6c | 47 | 32% |
| franzor.Lizt 1.3.1 | 35 | 74% |
| oog.melee.CapuletDroid 1.1 | 30 | 80% |

Hadur died in 90 of 210 rounds, at a mean tick of 1490. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 37 | 41% | 65 |
| rtk.Tachikoma 1.0 | 27 | 30% | 94 |
| oog.melee.CapuletDroid 1.1 | 11 | 12% | 47 |
| franzor.Lizt 1.3.1 | 9 | 10% | 1 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 1 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 191114 melee ticks, 93831 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 637 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 170 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 56885 sent, 51986 reached their opponent, 10649 virtual hits (20.5% of those reached).

## Melee bench: F08

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 726 over 6 battles (121.0 per battle, most in one battle 158). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 90.3 | 132 / 210 | 1.87 | 19.5% | 29827 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 19.5% | 132 |
| tm.Yuugao 1.0 | 2.5 | 13.0% | 35 |
| shrub.Vapour v159 | 2.7 | 12.8% | 19 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 10.9% | 12 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 10.1% | 6 |
| m3thos.Eva00 1.1 | 5.8 | 9.1% | 3 |
| jwst.DAD.DarkAndDarker 1.1 | 7.2 | 8.2% | 3 |
| qualidafial.MajorDick 1.0.1 | 7.8 | 6.9% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 5.1% | 0 |
| SHAM.WOW 1.4 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 85.1 | 17 / 35 | 4594 |
| 2 | 1 | 70.5 | 93.3 | 23 / 35 | 5337 |
| 3 | 1 | 70.1 | 93.0 | 25 / 35 | 4986 |
| 4 | 1 | 68.5 | 86.3 | 21 / 35 | 4907 |
| 5 | 1 | 68.7 | 89.8 | 19 / 35 | 4847 |
| 6 | 1 | 70.5 | 94.3 | 27 / 35 | 5156 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 56 | 70% |
| shrub.Vapour v159 | 34 | 74% |
| Krabb.sliNk.Garm 0.9u | 31 | 77% |
| com.spp.robocode.MostlyHarmless 010 | 26 | 85% |
| m3thos.Eva00 1.1 | 10 | 90% |
| jwst.DAD.DarkAndDarker 1.1 | 10 | 90% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 918. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 25 | 30% | 66 |
| shrub.Vapour v159 | 16 | 19% | 42 |
| Krabb.sliNk.Garm 0.9u | 15 | 18% | 32 |
| com.spp.robocode.MostlyHarmless 010 | 10 | 12% | 33 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 6% | 17 |
| m3thos.Eva00 1.1 | 5 | 6% | 13 |
| zyx.nano.BacillusComma 1.0 | 3 | 4% | 3 |
| SHAM.WOW 1.4 | 0 | 0% | 3 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 149457 melee ticks, 46503 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 783 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 460 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 48256 sent, 43332 reached their opponent, 8048 virtual hits (18.6% of those reached).

## Melee bench: F09

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 515 over 6 battles (85.8 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 75.7 | 63 / 210 | 3.19 | 15.4% | 21971 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.2% | 94 |
| hadur117.Hadur 3.20wq | 2.2 | 15.4% | 63 |
| kc.micro.Figment 1.0 | 2.7 | 14.2% | 27 |
| yagami.Tidus 0.11 | 4.2 | 11.1% | 2 |
| pedersen.Grishnakh 1.0 | 5.2 | 9.9% | 9 |
| mc2.enemy.Original 0.9 | 5.7 | 9.4% | 15 |
| dft.Calliope 5.6 | 7.0 | 7.5% | 0 |
| step.nanoPri 1.0 | 8.3 | 5.9% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.7 | 5.2% | 0 |
| rdm.Dueler 0.4x | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.5 | 79.0 | 12 / 35 | 3580 |
| 2 | 2 | 64.2 | 76.2 | 10 / 35 | 3904 |
| 3 | 1 | 65.2 | 79.7 | 14 / 35 | 3818 |
| 4 | 3 | 61.1 | 71.1 | 6 / 35 | 3111 |
| 5 | 3 | 61.1 | 67.6 | 8 / 35 | 3581 |
| 6 | 2 | 65.6 | 80.3 | 13 / 35 | 3977 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 48 | 31% |
| kc.micro.Figment 1.0 | 35 | 80% |
| yagami.Tidus 0.11 | 12 | 92% |
| mc2.enemy.Original 0.9 | 10 | 50% |
| pedersen.Grishnakh 1.0 | 3 | 67% |
| dft.Calliope 5.6 | 1 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 811. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 53 | 35% | 72 |
| kc.micro.Figment 1.0 | 32 | 21% | 58 |
| mc2.enemy.Original 0.9 | 21 | 14% | 27 |
| yagami.Tidus 0.11 | 14 | 9% | 20 |
| robar.nano.Assertive_Melee 0.2 | 10 | 7% | 11 |
| pedersen.Grishnakh 1.0 | 7 | 5% | 9 |
| dft.Calliope 5.6 | 4 | 3% | 6 |
| step.nanoPri 1.0 | 3 | 2% | 4 |
| rdm.Dueler 0.4x | 3 | 2% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 146611 melee ticks, 36030 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 40 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 48220 sent, 43591 reached their opponent, 6228 virtual hits (14.3% of those reached).

## Melee bench: F10

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 114 over 6 battles (19.0 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 96.5 | 178 / 210 | 1.32 | 21.0% | 33771 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 21.0% | 178 |
| DTF.Kludgy 1.2b | 2.5 | 13.8% | 17 |
| ne.Chimera 1.2 | 3.0 | 13.1% | 7 |
| ejb.Polaris 1.0.1 | 3.7 | 12.2% | 5 |
| tvv.micro.Antares 1.1.1 | 5.3 | 10.3% | 2 |
| vStar.RAFzilla 2.15 | 5.5 | 10.2% | 1 |
| kurios.DOSexe .9b | 7.7 | 5.3% | 1 |
| sam.Samspin 1.0 | 8.0 | 5.0% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 5.0% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 97.8 | 31 / 35 | 5639 |
| 2 | 1 | 70.5 | 92.7 | 26 / 35 | 5546 |
| 3 | 1 | 72.4 | 98.4 | 31 / 35 | 5814 |
| 4 | 1 | 71.8 | 96.2 | 29 / 35 | 5662 |
| 5 | 1 | 71.5 | 95.6 | 30 / 35 | 5585 |
| 6 | 1 | 71.7 | 98.1 | 31 / 35 | 5525 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 61 | 85% |
| ejb.Polaris 1.0.1 | 47 | 91% |
| ne.Chimera 1.2 | 44 | 93% |
| vStar.RAFzilla 2.15 | 23 | 100% |
| tvv.micro.Antares 1.1.1 | 16 | 88% |
| kurios.DOSexe .9b | 3 | 100% |
| donjezza.Muncho 1.0 | 1 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 33 of 210 rounds, at a mean tick of 959. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 14 | 42% | 64 |
| ejb.Polaris 1.0.1 | 6 | 18% | 45 |
| ne.Chimera 1.2 | 6 | 18% | 43 |
| tvv.micro.Antares 1.1.1 | 4 | 12% | 12 |
| vStar.RAFzilla 2.15 | 1 | 3% | 25 |
| kurios.DOSexe .9b | 1 | 3% | 13 |
| donjezza.Muncho 1.0 | 0 | 0% | 3 |
| sam.Samspin 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 147083 melee ticks, 59090 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 82 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 82 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 2.

Targeting waves (204 rounds): 47963 sent, 43233 reached their opponent, 8260 virtual hits (19.1% of those reached).

## Melee bench: F11

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 344 over 6 battles (57.3 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 84.0 | 81 / 210 | 2.44 | 17.0% | 23683 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.3 | 17.0% | 81 |
| rz.Aleph 0.34 | 1.7 | 16.6% | 70 |
| cx.mini.Nimrod 0.55 | 3.3 | 11.7% | 15 |
| djc.DynaBot 0.1.1 | 3.7 | 10.8% | 15 |
| br2.MobyDickBot 1.6 | 5.2 | 9.8% | 13 |
| rdt199.Warlord 0.73 | 6.0 | 8.9% | 12 |
| uji.YellohFellah 1.0 | 7.3 | 7.8% | 5 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.3% | 0 |
| stelo.MirrorNano 1.3 | 9.3 | 4.9% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 89.8 | 18 / 35 | 4097 |
| 2 | 2 | 62.4 | 76.2 | 5 / 35 | 3387 |
| 3 | 1 | 66.8 | 86.7 | 15 / 35 | 4228 |
| 4 | 2 | 65.7 | 80.3 | 14 / 35 | 4100 |
| 5 | 1 | 66.2 | 87.0 | 13 / 35 | 3928 |
| 6 | 1 | 66.2 | 84.1 | 16 / 35 | 3943 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 58 | 50% |
| djc.DynaBot 0.1.1 | 22 | 59% |
| uji.YellohFellah 1.0 | 18 | 89% |
| cx.mini.Nimrod 0.55 | 12 | 67% |
| br2.MobyDickBot 1.6 | 11 | 73% |
| rdt199.Warlord 0.73 | 10 | 50% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 878. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 55 | 42% | 79 |
| cx.mini.Nimrod 0.55 | 19 | 14% | 32 |
| rdt199.Warlord 0.73 | 19 | 14% | 28 |
| djc.DynaBot 0.1.1 | 15 | 11% | 26 |
| br2.MobyDickBot 1.6 | 8 | 6% | 18 |
| KiraNL.Chupacabra 0.4 | 5 | 4% | 7 |
| uji.YellohFellah 1.0 | 4 | 3% | 14 |
| stelo.MirrorNano 1.3 | 3 | 2% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 2% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 157946 melee ticks, 41368 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 41 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 51706 sent, 46682 reached their opponent, 6277 virtual hits (13.4% of those reached).

## Melee bench: F12

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 96 over 6 battles (16.0 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 85.9 | 121 / 210 | 2.27 | 18.1% | 24555 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 18.1% | 121 |
| nat.PallasHawk 1.0 | 2.5 | 13.8% | 36 |
| bts.wiki.RipCurl 0.9b | 2.7 | 13.2% | 25 |
| darkcanuck.Leon 1.01 | 3.8 | 12.5% | 21 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.0% | 5 |
| jrm.Test0 1.0 | 6.2 | 8.1% | 1 |
| cs.sheldor.Talon 1.1 | 7.5 | 6.9% | 0 |
| jp.Perpy 16.0 | 8.2 | 6.1% | 0 |
| jaybot.bots.Oddball 4.0 | 9.0 | 5.5% | 1 |
| stuff.Vlad 0.1 | 9.2 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 80.6 | 19 / 35 | 3790 |
| 2 | 1 | 68.6 | 90.2 | 21 / 35 | 4083 |
| 3 | 1 | 66.4 | 82.2 | 18 / 35 | 4016 |
| 4 | 1 | 68.7 | 88.9 | 19 / 35 | 4412 |
| 5 | 1 | 68.7 | 87.9 | 24 / 35 | 4422 |
| 6 | 1 | 66.5 | 85.4 | 20 / 35 | 3832 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 55 | 73% |
| darkcanuck.Leon 1.01 | 38 | 84% |
| bts.wiki.RipCurl 0.9b | 28 | 93% |
| brainfade.melee.Genghis 0.36 | 11 | 82% |
| jaybot.bots.Oddball 4.0 | 5 | 100% |
| jrm.Test0 1.0 | 4 | 75% |
| stuff.Vlad 0.1 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 30 | 33% | 67 |
| bts.wiki.RipCurl 0.9b | 18 | 20% | 35 |
| darkcanuck.Leon 1.01 | 17 | 19% | 61 |
| jrm.Test0 1.0 | 15 | 17% | 19 |
| brainfade.melee.Genghis 0.36 | 5 | 6% | 12 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 9 |
| jp.Perpy 16.0 | 2 | 2% | 2 |
| jaybot.bots.Oddball 4.0 | 0 | 0% | 3 |
| stuff.Vlad 0.1 | 0 | 0% | 2 |

Posture (Hadur's M records, 201 rounds): 130814 melee ticks, 36666 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 70 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 44118 sent, 39192 reached their opponent, 6508 virtual hits (16.6% of those reached).

## Melee bench: F13

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 85 over 6 battles (14.2 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 83.4 | 63 / 210 | 2.49 | 16.1% | 24292 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.8 | 16.1% | 63 |
| ags.Glacier 0.2.11 | 1.8 | 16.0% | 40 |
| mn.Combat 3.25.0 | 2.3 | 15.8% | 74 |
| shinh.Entangled 0.3 | 4.3 | 12.2% | 22 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.5% | 10 |
| apc.Colossus2 0.17 | 6.2 | 7.8% | 0 |
| stelo.Wang 1.0 | 6.8 | 7.4% | 1 |
| maribo.FollowFire 1 | 8.0 | 5.1% | 0 |
| ayk.WallHugger 1.0 | 9.0 | 4.5% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 86.3 | 13 / 35 | 4079 |
| 2 | 1 | 66.6 | 86.7 | 12 / 35 | 4165 |
| 3 | 3 | 62.4 | 75.9 | 6 / 35 | 3812 |
| 4 | 2 | 65.3 | 83.8 | 11 / 35 | 3757 |
| 5 | 1 | 65.7 | 83.8 | 10 / 35 | 4294 |
| 6 | 3 | 65.9 | 84.1 | 11 / 35 | 4185 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 51 | 24% |
| ags.Glacier 0.2.11 | 45 | 71% |
| shinh.Entangled 0.3 | 22 | 55% |
| gh.micro.Gruweltje 0.7 | 9 | 67% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 878. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 58 | 39% | 71 |
| ags.Glacier 0.2.11 | 34 | 23% | 65 |
| shinh.Entangled 0.3 | 30 | 20% | 41 |
| gh.micro.Gruweltje 0.7 | 13 | 9% | 19 |
| stelo.Wang 1.0 | 7 | 5% | 7 |
| maribo.FollowFire 1 | 3 | 2% | 3 |
| apc.Colossus2 0.17 | 2 | 1% | 4 |

Posture (Hadur's M records, 202 rounds): 146736 melee ticks, 42125 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 44 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 40 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 5.

Targeting waves (202 rounds): 42696 sent, 37718 reached their opponent, 5924 virtual hits (15.7% of those reached).

## Melee bench: F14

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 147 over 6 battles (24.5 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 94.9 | 160 / 210 | 1.46 | 20.9% | 34752 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 20.9% | 160 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.0% | 14 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.0% | 25 |
| sanyi.mikrobi.Roberto 1.0 | 5.0 | 9.7% | 4 |
| co.edu.usb.rc.LidisTron 1.0 | 5.2 | 9.3% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 5.8 | 9.1% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 8.1% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.0 | 8.1% | 0 |
| pa.Improved 1.0 | 9.0 | 6.0% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 92.7 | 26 / 35 | 5790 |
| 2 | 1 | 71.8 | 95.6 | 28 / 35 | 5936 |
| 3 | 1 | 70.8 | 95.2 | 23 / 35 | 5567 |
| 4 | 1 | 70.1 | 91.1 | 23 / 35 | 5497 |
| 5 | 1 | 72.8 | 98.4 | 31 / 35 | 6059 |
| 6 | 1 | 72.0 | 96.5 | 29 / 35 | 5903 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 86 | 92% |
| catcat20.shape.Theta 0.018 | 45 | 62% |
| sanyi.mikrobi.Roberto 1.0 | 21 | 90% |
| sheldor.micro.PointInLineRRAL 1.0 | 20 | 90% |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 6 | 83% |

Hadur died in 50 of 210 rounds, at a mean tick of 918. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 22 | 44% | 51 |
| simonton.micro.Sprout 1.1.3 | 17 | 34% | 94 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 8% | 21 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 6% | 24 |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 6% | 9 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 2% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 3 |
| pa.Improved 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 141970 melee ticks, 50758 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 42 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 44539 sent, 39942 reached their opponent, 9605 virtual hits (24.0% of those reached).

## Melee bench: F15

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 134 over 6 battles (22.3 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 87.7 | 118 / 210 | 2.10 | 18.9% | 30072 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 18.9% | 118 |
| kawigi.micro.Shiz 1.1 | 2.2 | 13.7% | 17 |
| emp.Yngwie 1.11 | 3.3 | 12.7% | 43 |
| mld.DustBunny 3.8 | 3.5 | 12.7% | 8 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.7% | 10 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.1% | 13 |
| lambdaxy.TBot 0.1 | 7.2 | 6.8% | 0 |
| Grystrion.TrackerWO 1.0 | 7.8 | 6.4% | 0 |
| divineomega.TrialBot 0.003 | 9.5 | 4.6% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 89.8 | 21 / 35 | 4898 |
| 2 | 1 | 67.1 | 83.5 | 14 / 35 | 4749 |
| 3 | 1 | 69.7 | 90.5 | 20 / 35 | 5253 |
| 4 | 1 | 67.3 | 82.5 | 17 / 35 | 4853 |
| 5 | 1 | 69.9 | 89.8 | 23 / 35 | 5292 |
| 6 | 1 | 69.4 | 90.2 | 23 / 35 | 5027 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 53 | 62% |
| kawigi.micro.Shiz 1.1 | 33 | 97% |
| mld.DustBunny 3.8 | 24 | 96% |
| kawigi.robot.Girl 1.2 | 17 | 76% |
| cb.nano.Insomnia 1.0 | 16 | 81% |
| divineomega.TrialBot 0.003 | 4 | 75% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 958. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 35 | 38% | 81 |
| kawigi.robot.Girl 1.2 | 14 | 15% | 18 |
| cb.nano.Insomnia 1.0 | 13 | 14% | 16 |
| kawigi.micro.Shiz 1.1 | 12 | 13% | 35 |
| mld.DustBunny 3.8 | 11 | 12% | 39 |
| divineomega.TrialBot 0.003 | 3 | 3% | 11 |
| lambdaxy.TBot 0.1 | 3 | 3% | 6 |
| Grystrion.TrackerWO 1.0 | 1 | 1% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 161200 melee ticks, 46775 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 57 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 52764 sent, 48021 reached their opponent, 8077 virtual hits (16.8% of those reached).

## Melee bench: F16

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 109 over 6 battles (18.2 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 90.6 | 130 / 210 | 1.84 | 20.2% | 34816 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 20.2% | 130 |
| gh.Griezel 0.5.2 | 2.0 | 16.3% | 43 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.2 | 13.3% | 1 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 10.8% | 30 |
| bvh.fnr.Fenrir 0.36l | 4.7 | 9.5% | 1 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.4% | 3 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.5% | 2 |
| repositorio.NanoStep 1.0 | 8.8 | 4.7% | 0 |
| asd.Cthulhu 1.3 | 8.8 | 4.7% | 1 |
| divineomega.DivineBot 1.9.4.5 | 9.3 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 90.8 | 18 / 35 | 6246 |
| 2 | 1 | 70.1 | 89.2 | 20 / 35 | 5733 |
| 3 | 1 | 69.9 | 88.6 | 20 / 35 | 5536 |
| 4 | 1 | 69.3 | 87.9 | 19 / 35 | 5357 |
| 5 | 1 | 71.1 | 92.1 | 24 / 35 | 5733 |
| 6 | 1 | 72.8 | 95.2 | 29 / 35 | 6211 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 95 | 75% |
| techdude.forest.FlamingForest 1.1 | 35 | 57% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 19 | 100% |
| tvv.nano.Polaris 1.2 | 7 | 71% |
| divineomega.DivineBot 1.9.4.5 | 6 | 100% |
| bvh.fnr.Fenrir 0.36l | 6 | 83% |
| stelo.IntrinsicVolatility 1.4 | 5 | 80% |
| asd.Cthulhu 1.3 | 1 | 0% |

Hadur died in 82 of 210 rounds, at a mean tick of 1258. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 35 | 43% | 112 |
| techdude.forest.FlamingForest 1.1 | 21 | 26% | 39 |
| bvh.fnr.Fenrir 0.36l | 9 | 11% | 16 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 6 | 7% | 19 |
| stelo.IntrinsicVolatility 1.4 | 4 | 5% | 11 |
| asd.Cthulhu 1.3 | 3 | 4% | 5 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 3 |
| repositorio.NanoStep 1.0 | 1 | 1% | 1 |
| divineomega.DivineBot 1.9.4.5 | 0 | 0% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 182291 melee ticks, 71429 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 32 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 56874 sent, 52292 reached their opponent, 8856 virtual hits (16.9% of those reached).

## Melee bench: F17

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 426 over 6 battles (71.0 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 86.7 | 103 / 210 | 2.20 | 19.0% | 33421 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 19.0% | 103 |
| et.Predator 1.8 | 2.3 | 13.8% | 34 |
| oog.melee.Mercutio 1.0 | 3.0 | 13.1% | 29 |
| cx.BlestPain 1.41 | 3.7 | 12.7% | 36 |
| ahf.NanoAndrew .4 | 5.2 | 10.3% | 4 |
| maribo.melee.BMV 0.1 | 6.3 | 8.7% | 0 |
| nic.Nicator 2.4 | 6.5 | 8.6% | 4 |
| tex.Longbot 0.4 | 8.5 | 5.5% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.8% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 87.9 | 16 / 35 | 5697 |
| 2 | 1 | 68.4 | 86.0 | 15 / 35 | 5366 |
| 3 | 1 | 68.0 | 83.2 | 20 / 35 | 5065 |
| 4 | 1 | 69.9 | 89.5 | 13 / 35 | 6066 |
| 5 | 1 | 70.2 | 88.9 | 21 / 35 | 5831 |
| 6 | 1 | 68.4 | 84.8 | 18 / 35 | 5396 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 57 | 79% |
| et.Predator 1.8 | 48 | 58% |
| cx.BlestPain 1.41 | 30 | 37% |
| ahf.NanoAndrew .4 | 13 | 92% |
| nic.Nicator 2.4 | 5 | 60% |
| maribo.melee.BMV 0.1 | 3 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 1061. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 35 | 32% | 55 |
| cx.BlestPain 1.41 | 28 | 25% | 48 |
| oog.melee.Mercutio 1.0 | 18 | 16% | 55 |
| ahf.NanoAndrew .4 | 10 | 9% | 23 |
| maribo.melee.BMV 0.1 | 8 | 7% | 14 |
| nic.Nicator 2.4 | 4 | 4% | 9 |
| tex.Longbot 0.4 | 2 | 2% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 2% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 163661 melee ticks, 62850 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 54 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 53176 sent, 48438 reached their opponent, 10052 virtual hits (20.8% of those reached).

## Melee bench: F18

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 619 over 6 battles (103.2 per battle, most in one battle 147). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 89.4 | 129 / 210 | 1.96 | 19.3% | 29383 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 19.3% | 129 |
| morbid.MorbidPriest 1.0 | 2.0 | 14.1% | 36 |
| uji.DBH 1.1 | 3.5 | 12.0% | 14 |
| agd.Mooserwirt2 2.7 | 3.5 | 11.9% | 16 |
| sigterm.Sigterm 1.0 | 6.0 | 8.4% | 9 |
| spinnercat.Robovirus 2.718 | 6.3 | 8.0% | 1 |
| ratosh.Nobo 0.21 | 6.3 | 8.3% | 3 |
| kawigi.mini.Fhqwhgads 1.1 | 7.3 | 7.6% | 2 |
| stelo.WangRobot 1.0 | 9.3 | 5.3% | 0 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 91.4 | 23 / 35 | 5121 |
| 2 | 1 | 69.9 | 92.4 | 23 / 35 | 4949 |
| 3 | 1 | 69.1 | 88.9 | 23 / 35 | 5105 |
| 4 | 1 | 68.5 | 87.6 | 19 / 35 | 4738 |
| 5 | 1 | 68.0 | 86.0 | 18 / 35 | 4868 |
| 6 | 1 | 68.9 | 89.8 | 23 / 35 | 4602 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 66 | 65% |
| uji.DBH 1.1 | 39 | 87% |
| agd.Mooserwirt2 2.7 | 31 | 84% |
| sigterm.Sigterm 1.0 | 21 | 57% |
| ratosh.Nobo 0.21 | 6 | 67% |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 67% |
| stelo.WangRobot 1.0 | 4 | 100% |
| spinnercat.Robovirus 2.718 | 2 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 36 | 42% | 76 |
| uji.DBH 1.1 | 14 | 16% | 39 |
| agd.Mooserwirt2 2.7 | 12 | 14% | 41 |
| sigterm.Sigterm 1.0 | 8 | 9% | 13 |
| ratosh.Nobo 0.21 | 6 | 7% | 13 |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 3% | 11 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 3% | 4 |
| stelo.WangRobot 1.0 | 0 | 0% | 6 |
| spinnercat.Robovirus 2.718 | 0 | 0% | 5 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 137817 melee ticks, 47619 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 84 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 84 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 46526 sent, 41678 reached their opponent, 8761 virtual hits (21.0% of those reached).

## Melee bench: F19

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 198 over 6 battles (33.0 per battle, most in one battle 116). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.4 | 97.7 | 193 / 210 | 1.20 | 22.4% | 37233 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 22.4% | 193 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.7% | 8 |
| mld.Infinity 2.2 | 3.7 | 11.6% | 6 |
| krillr.mini.JointStrike 2.0.0 | 3.8 | 11.2% | 0 |
| erdnis.Rover 0.3 | 4.5 | 10.3% | 2 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.5% | 0 |
| mbh.Mbh 0.1 | 7.2 | 7.6% | 0 |
| pac.ABC 2.1 | 7.8 | 6.9% | 1 |
| pbg.R2D2 1.0 | 8.7 | 5.6% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.8 | 99.4 | 34 / 35 | 6287 |
| 2 | 1 | 73.6 | 98.1 | 33 / 35 | 6250 |
| 3 | 1 | 73.2 | 96.5 | 31 / 35 | 6282 |
| 4 | 1 | 72.8 | 96.8 | 32 / 35 | 5744 |
| 5 | 1 | 74.3 | 98.7 | 33 / 35 | 6745 |
| 6 | 1 | 72.6 | 96.8 | 30 / 35 | 5925 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 105 | 99% |
| mld.Infinity 2.2 | 26 | 100% |
| krillr.mini.JointStrike 2.0.0 | 24 | 100% |
| pac.ABC 2.1 | 14 | 100% |
| erdnis.Rover 0.3 | 13 | 100% |
| patson.PatsonTestBot 1.0 | 7 | 100% |
| mbh.Mbh 0.1 | 4 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 20 of 210 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 7 | 35% | 69 |
| krillr.mini.JointStrike 2.0.0 | 6 | 30% | 32 |
| erdnis.Rover 0.3 | 4 | 20% | 28 |
| patson.PatsonTestBot 1.0 | 1 | 5% | 18 |
| pac.ABC 2.1 | 1 | 5% | 11 |
| mld.Infinity 2.2 | 0 | 0% | 31 |
| pbg.R2D2 1.0 | 0 | 0% | 9 |
| mbh.Mbh 0.1 | 0 | 0% | 8 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 128871 melee ticks, 46555 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 33 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 42965 sent, 38228 reached their opponent, 8738 virtual hits (22.9% of those reached).

## Melee bench: F20

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 717 over 6 battles (119.5 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 92.7 | 146 / 210 | 1.66 | 21.0% | 35946 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 21.0% | 146 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.5% | 28 |
| fwb.Nine 1.0.1 | 3.3 | 11.2% | 17 |
| catcat20.Rabbit 0.001 | 4.0 | 10.7% | 13 |
| nz.jdc.nano.GridFu 1.0 | 4.7 | 10.2% | 1 |
| m3thos.mini.Eva01 0.5.5 | 6.2 | 8.4% | 3 |
| bayen.nut.Squirrel 1.615 | 7.3 | 7.1% | 1 |
| ntc.ControlledChaos 1.1.4 | 8.0 | 6.1% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.7 | 5.7% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 95.6 | 25 / 35 | 6220 |
| 2 | 1 | 71.0 | 90.5 | 26 / 35 | 5805 |
| 3 | 1 | 71.1 | 90.5 | 23 / 35 | 6002 |
| 4 | 1 | 71.4 | 94.6 | 27 / 35 | 5810 |
| 5 | 1 | 72.2 | 95.2 | 25 / 35 | 6172 |
| 6 | 1 | 70.4 | 89.8 | 20 / 35 | 5937 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 79 | 80% |
| fwb.Nine 1.0.1 | 42 | 90% |
| catcat20.Rabbit 0.001 | 31 | 71% |
| nz.jdc.nano.GridFu 1.0 | 10 | 100% |
| bayen.nut.Squirrel 1.615 | 7 | 86% |
| m3thos.mini.Eva01 0.5.5 | 5 | 80% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 1035. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 33 | 47% | 98 |
| catcat20.Rabbit 0.001 | 12 | 17% | 36 |
| fwb.Nine 1.0.1 | 11 | 16% | 23 |
| nz.jdc.nano.GridFu 1.0 | 3 | 4% | 19 |
| ntc.ControlledChaos 1.1.4 | 2 | 3% | 2 |
| bayen.nut.Squirrel 1.615 | 1 | 1% | 13 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 9 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 4 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 210 rounds): 171272 melee ticks, 54261 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (210 rounds): longest scan gap while four or more were alive 32 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 0.

Targeting waves (210 rounds): 53830 sent, 48858 reached their opponent, 11151 virtual hits (22.8% of those reached).

## Melee bench: F21

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 664 over 6 battles (110.7 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 90.4 | 116 / 210 | 1.86 | 19.9% | 34589 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 19.9% | 116 |
| eem.EvBot v4.6.16 | 2.0 | 16.5% | 69 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.3% | 10 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.9% | 8 |
| eld.Hmm 1.0 | 5.3 | 8.3% | 9 |
| oa.weak.BotherBot 0.1 | 6.0 | 7.3% | 0 |
| fire219.CatBot 1.0 | 7.0 | 6.4% | 0 |
| PSW.Relentless 0.1 | 8.3 | 5.4% | 0 |
| el.JumpShoot 0.2 | 8.7 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 93.0 | 18 / 35 | 5969 |
| 2 | 1 | 70.9 | 92.4 | 20 / 35 | 5890 |
| 3 | 1 | 69.7 | 89.5 | 18 / 35 | 5479 |
| 4 | 1 | 68.3 | 83.8 | 18 / 35 | 5460 |
| 5 | 1 | 71.2 | 92.1 | 22 / 35 | 5996 |
| 6 | 1 | 70.9 | 91.7 | 20 / 35 | 5795 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 119 | 63% |
| dummy.mini.Scimitar 1.01 | 25 | 92% |
| cf.RiO.RiOx 4.2.1 | 17 | 71% |
| eld.Hmm 1.0 | 5 | 40% |
| oa.weak.BotherBot 0.1 | 3 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 1274. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 53 | 52% | 109 |
| dummy.mini.Scimitar 1.01 | 15 | 15% | 49 |
| cf.RiO.RiOx 4.2.1 | 15 | 15% | 30 |
| eld.Hmm 1.0 | 5 | 5% | 10 |
| PSW.Relentless 0.1 | 3 | 3% | 4 |
| oa.weak.BotherBot 0.1 | 2 | 2% | 6 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 184601 melee ticks, 75723 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 52 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 52 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 53769 sent, 48998 reached their opponent, 8274 virtual hits (16.9% of those reached).

## Melee bench: F22

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 426 over 6 battles (71.0 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 87.9 | 95 / 210 | 2.09 | 18.6% | 30859 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 18.6% | 95 |
| pe.SandboxDT 2.71m | 2.2 | 16.5% | 65 |
| kvk.HebusLeTroll 0.35 | 2.8 | 15.1% | 29 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.8% | 15 |
| bigpete.Stewie 1.0 | 5.0 | 10.6% | 5 |
| tad.Dalek98 0.98 | 6.7 | 6.5% | 1 |
| yk.JahRoslav 1.1 | 6.8 | 6.6% | 0 |
| gg.Squaraus 0.6 | 7.5 | 5.9% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.6% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 89.8 | 20 / 35 | 5216 |
| 2 | 1 | 69.9 | 90.5 | 16 / 35 | 5298 |
| 3 | 1 | 69.2 | 87.6 | 16 / 35 | 5112 |
| 4 | 1 | 67.6 | 85.1 | 11 / 35 | 4927 |
| 5 | 1 | 69.8 | 89.5 | 16 / 35 | 5399 |
| 6 | 1 | 68.3 | 85.1 | 16 / 35 | 4907 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 52 | 38% |
| jlm.javaDisturbance 0.59 | 45 | 82% |
| kvk.HebusLeTroll 0.35 | 44 | 64% |
| bigpete.Stewie 1.0 | 9 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |
| tad.Dalek98 0.98 | 1 | 0% |

Hadur died in 118 of 210 rounds, at a mean tick of 1003. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kvk.HebusLeTroll 0.35 | 43 | 36% | 66 |
| pe.SandboxDT 2.71m | 39 | 33% | 67 |
| jlm.javaDisturbance 0.59 | 19 | 16% | 48 |
| bigpete.Stewie 1.0 | 10 | 8% | 19 |
| tad.Dalek98 0.98 | 4 | 3% | 4 |
| pbg.NinjaX 1.2 | 0 | 0% | 3 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 163984 melee ticks, 50496 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 47 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 52193 sent, 47278 reached their opponent, 7632 virtual hits (16.1% of those reached).

## Melee bench: F23

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 661 over 6 battles (110.2 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.3 | 96.4 | 175 / 210 | 1.32 | 21.9% | 35992 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 21.9% | 175 |
| pe.SandboxLump 1.52 | 2.0 | 16.6% | 23 |
| cre.Karolos 0.32 | 3.0 | 13.6% | 8 |
| stelo.AreaTargetingBot 1.1 | 5.0 | 9.9% | 1 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.3 | 9.1% | 0 |
| stelo.RamTrackSurfer 1.2 | 5.5 | 8.9% | 2 |
| cw.megas.Blade 0.8 | 6.2 | 8.6% | 0 |
| sample.Walls 1.0 | 8.0 | 7.3% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 2.7% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 95.2 | 29 / 35 | 5932 |
| 2 | 1 | 72.8 | 95.6 | 28 / 35 | 5699 |
| 3 | 1 | 73.2 | 96.8 | 28 / 35 | 6015 |
| 4 | 1 | 72.4 | 94.6 | 27 / 35 | 5550 |
| 5 | 1 | 74.0 | 98.1 | 32 / 35 | 6574 |
| 6 | 1 | 74.1 | 98.1 | 31 / 35 | 6222 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 99 | 88% |
| cre.Karolos 0.32 | 63 | 94% |
| stelo.AreaTargetingBot 1.1 | 10 | 100% |
| stelo.RamTrackSurfer 1.2 | 10 | 80% |
| sample.Walls 1.0 | 7 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 16 | 39% | 106 |
| cre.Karolos 0.32 | 14 | 34% | 56 |
| stelo.AreaTargetingBot 1.1 | 2 | 5% | 17 |
| stelo.RamTrackSurfer 1.2 | 2 | 5% | 14 |
| cw.megas.Blade 0.8 | 1 | 2% | 7 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 5 |
| sample.Walls 1.0 | 0 | 0% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 126552 melee ticks, 52096 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 65 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 39986 sent, 35065 reached their opponent, 10296 virtual hits (29.4% of those reached).

## Melee bench: F24

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 722 over 6 battles (120.3 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 83.5 | 94 / 210 | 2.48 | 17.2% | 25073 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 17.2% | 94 |
| rz.GlowBlowMelee 1.4 | 2.3 | 14.4% | 39 |
| davidalves.Phoenix 0.54 | 3.5 | 12.9% | 40 |
| florent.XSeries.X2 0.12 | 3.8 | 12.4% | 16 |
| pedersen.Ugluk 1.1.1 | 4.8 | 10.9% | 12 |
| oog.melee.Corsair 1.0 | 5.5 | 9.7% | 7 |
| stelo.SoJNanoMelee 1.1 | 7.2 | 6.8% | 4 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.0% | 0 |
| as.FrankTheTank 1.3 | 9.2 | 4.8% | 0 |
| evd.X1 0.01 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 81.6 | 14 / 35 | 4387 |
| 2 | 1 | 66.3 | 82.2 | 17 / 35 | 4153 |
| 3 | 1 | 65.2 | 81.3 | 15 / 35 | 3938 |
| 4 | 1 | 67.1 | 86.0 | 16 / 35 | 4305 |
| 5 | 1 | 67.1 | 85.7 | 18 / 35 | 4093 |
| 6 | 1 | 66.2 | 84.4 | 14 / 35 | 4197 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 41 | 66% |
| davidalves.Phoenix 0.54 | 27 | 52% |
| pedersen.Ugluk 1.1.1 | 26 | 77% |
| florent.XSeries.X2 0.12 | 25 | 76% |
| oog.melee.Corsair 1.0 | 12 | 67% |
| stelo.SoJNanoMelee 1.1 | 5 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 812. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 32 | 26% | 48 |
| rz.GlowBlowMelee 1.4 | 26 | 21% | 53 |
| florent.XSeries.X2 0.12 | 21 | 17% | 39 |
| pedersen.Ugluk 1.1.1 | 18 | 15% | 30 |
| oog.melee.Corsair 1.0 | 11 | 9% | 25 |
| stelo.SoJNanoMelee 1.1 | 3 | 2% | 6 |
| evd.X1 0.01 | 3 | 2% | 4 |
| as.FrankTheTank 1.3 | 1 | 1% | 3 |
| lunchie.Lunchbox 0.93 | 1 | 1% | 2 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 141446 melee ticks, 42499 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 40 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 46784 sent, 41695 reached their opponent, 7753 virtual hits (18.6% of those reached).

## Melee bench: F25

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 365 over 6 battles (60.8 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 85.8 | 122 / 210 | 2.28 | 18.1% | 23443 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.2 | 18.1% | 122 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 14.2% | 30 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 13.1% | 14 |
| jdw.Hurricane 1.4 | 4.0 | 11.6% | 21 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.9% | 13 |
| ds.Oo 2.2 | 5.7 | 9.0% | 6 |
| awesomeness.Elite 1.0 | 7.2 | 7.2% | 3 |
| adt.Ar2 1.1 | 8.3 | 6.2% | 0 |
| gjr.Cephalosporin 0.1 | 8.5 | 6.0% | 2 |
| amk.ChumbaMini 0.2 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 84.8 | 17 / 35 | 3844 |
| 2 | 1 | 68.8 | 90.2 | 24 / 35 | 4037 |
| 3 | 1 | 68.9 | 90.5 | 22 / 35 | 4113 |
| 4 | 1 | 68.9 | 88.3 | 25 / 35 | 4269 |
| 5 | 1 | 67.1 | 85.1 | 17 / 35 | 3897 |
| 6 | 2 | 63.9 | 75.9 | 17 / 35 | 3283 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 50 | 80% |
| voidious.micro.BlitzBat 1.05 | 40 | 88% |
| jdw.Hurricane 1.4 | 27 | 78% |
| gre.svman4.Morfeas 1.4.1 | 12 | 67% |
| ds.Oo 2.2 | 10 | 80% |
| awesomeness.Elite 1.0 | 4 | 100% |
| adt.Ar2 1.1 | 3 | 100% |
| gjr.Cephalosporin 0.1 | 2 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 652. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 27 | 29% | 56 |
| jdw.Hurricane 1.4 | 17 | 18% | 43 |
| voidious.micro.BlitzBat 1.05 | 15 | 16% | 34 |
| ds.Oo 2.2 | 12 | 13% | 26 |
| gre.svman4.Morfeas 1.4.1 | 7 | 8% | 22 |
| awesomeness.Elite 1.0 | 5 | 5% | 14 |
| adt.Ar2 1.1 | 3 | 3% | 9 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 4 |
| amk.ChumbaMini 0.2 | 1 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 128841 melee ticks, 26285 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 34 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 45790 sent, 40887 reached their opponent, 6834 virtual hits (16.7% of those reached).

## Melee bench: F26

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 511 over 6 battles (85.2 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 91.5 | 142 / 210 | 1.77 | 20.6% | 37503 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 20.6% | 142 |
| ak.Fermat 2.0 | 2.0 | 15.3% | 36 |
| shu.nitro.LENIN .T34 | 3.3 | 12.2% | 20 |
| lrem.Spectre 0.4.4 | 3.7 | 12.0% | 7 |
| js.PinBall 1.6 | 5.0 | 10.4% | 1 |
| jaybot.adv.bots.JayBot 2.0 | 6.2 | 9.6% | 2 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 8.0% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 6.7% | 1 |
| sample.SpinBot 1.0 | 9.0 | 3.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 93.0 | 22 / 35 | 6495 |
| 2 | 1 | 72.4 | 93.0 | 29 / 35 | 6424 |
| 3 | 1 | 70.9 | 92.1 | 22 / 35 | 5901 |
| 4 | 1 | 71.2 | 89.2 | 23 / 35 | 6312 |
| 5 | 1 | 72.5 | 94.3 | 26 / 35 | 6607 |
| 6 | 1 | 69.9 | 87.3 | 20 / 35 | 5764 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 61 | 75% |
| shu.nitro.LENIN .T34 | 43 | 91% |
| lrem.Spectre 0.4.4 | 31 | 87% |
| jaybot.adv.bots.JayBot 2.0 | 13 | 100% |
| js.PinBall 1.6 | 12 | 92% |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 80% |
| gh.mini.GrubbmOne 1.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 32 | 44% | 77 |
| shu.nitro.LENIN .T34 | 13 | 18% | 50 |
| lrem.Spectre 0.4.4 | 9 | 12% | 35 |
| jaybot.adv.bots.JayBot 2.0 | 6 | 8% | 21 |
| js.PinBall 1.6 | 6 | 8% | 13 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 3% | 8 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 5 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 155810 melee ticks, 42087 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 32 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 51081 sent, 46162 reached their opponent, 11293 virtual hits (24.5% of those reached).

## Melee bench: F27

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 544 over 6 battles (90.7 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 86.6 | 160 / 210 | 2.20 | 19.9% | 32832 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.2 | 19.9% | 160 |
| mk.Alpha 0.2.1 | 2.2 | 13.4% | 27 |
| sheldor.melee.nano.TestMelee 0.1 | 4.3 | 10.2% | 9 |
| EH.Eagle 1.0.6 | 4.5 | 9.6% | 6 |
| techdude.kombat.FlamingKombat 1.5 | 5.2 | 9.2% | 3 |
| wee.Gem 1.8.4 | 6.2 | 9.0% | 3 |
| throxbot.ThroxBot 0.1 | 6.2 | 8.4% | 0 |
| joe.ADinosaur 1.0 | 7.2 | 8.2% | 1 |
| caimano.Furia_Ceca 0.22 | 8.3 | 7.2% | 1 |
| cs.Grudge 1.0 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 97.1 | 31 / 35 | 5831 |
| 2 | 1 | 71.6 | 96.2 | 29 / 35 | 5408 |
| 3 | 1 | 72.8 | 99.4 | 33 / 35 | 5668 |
| 4 | 1 | 67.2 | 74.6 | 21 / 35 | 5618 |
| 5 | 2 | 59.1 | 54.6 | 13 / 35 | 4513 |
| 6 | 1 | 72.2 | 97.8 | 33 / 35 | 5794 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 89 | 93% |
| EH.Eagle 1.0.6 | 19 | 100% |
| throxbot.ThroxBot 0.1 | 18 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 10 | 100% |
| joe.ADinosaur 1.0 | 9 | 89% |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 89% |
| wee.Gem 1.8.4 | 8 | 100% |
| caimano.Furia_Ceca 0.22 | 6 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 527. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cs.Grudge 1.0 | 18 | 33% | 20 |
| mk.Alpha 0.2.1 | 11 | 20% | 64 |
| EH.Eagle 1.0.6 | 6 | 11% | 42 |
| throxbot.ThroxBot 0.1 | 6 | 11% | 21 |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 7% | 20 |
| joe.ADinosaur 1.0 | 2 | 4% | 10 |
| caimano.Furia_Ceca 0.22 | 2 | 4% | 6 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 2% | 13 |
| wee.Gem 1.8.4 | 0 | 0% | 14 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 210 rounds): 127275 melee ticks, 41050 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (210 rounds): longest scan gap while four or more were alive 54 ticks (210 rounds over 8); rounds whose longest gap at any count was over 8: 210; robots dropped as dead without a death event: 0.

Targeting waves (210 rounds): 41919 sent, 37012 reached their opponent, 9454 virtual hits (25.5% of those reached).

## Melee bench: F28

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 196 over 6 battles (32.7 per battle, most in one battle 114). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 90.6 | 148 / 210 | 1.85 | 19.1% | 24790 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 19.1% | 148 |
| kid.test.NightFox .2 | 2.0 | 14.6% | 23 |
| uji.Antique 1.0 | 3.3 | 12.1% | 17 |
| pfvicm.Sobieski 7.2.3b | 4.0 | 10.7% | 4 |
| qohnil.blot.BlotBot 3.61 | 4.7 | 10.2% | 11 |
| amk.ChumbaWumba 0.3 | 6.2 | 8.6% | 0 |
| ahr.ice.Ice 1.0.2 | 7.0 | 7.9% | 5 |
| matt.advanced.Katana 1.0 | 8.0 | 6.2% | 1 |
| stelo.Lifestealer 1.0 | 9.2 | 5.4% | 1 |
| stelo.PianistNano 1.2 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 87.3 | 24 / 35 | 4320 |
| 2 | 1 | 69.4 | 91.7 | 25 / 35 | 4365 |
| 3 | 1 | 70.1 | 94.0 | 30 / 35 | 4289 |
| 4 | 1 | 68.1 | 91.1 | 23 / 35 | 3789 |
| 5 | 1 | 67.4 | 87.6 | 20 / 35 | 3870 |
| 6 | 1 | 69.4 | 91.7 | 26 / 35 | 4157 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 71 | 92% |
| uji.Antique 1.0 | 50 | 88% |
| qohnil.blot.BlotBot 3.61 | 17 | 82% |
| pfvicm.Sobieski 7.2.3b | 9 | 100% |
| amk.ChumbaWumba 0.3 | 8 | 100% |
| ahr.ice.Ice 1.0.2 | 5 | 100% |
| matt.advanced.Katana 1.0 | 2 | 100% |
| stelo.Lifestealer 1.0 | 1 | 0% |

Hadur died in 64 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 15 | 23% | 59 |
| kid.test.NightFox .2 | 13 | 20% | 46 |
| pfvicm.Sobieski 7.2.3b | 10 | 16% | 20 |
| qohnil.blot.BlotBot 3.61 | 8 | 13% | 32 |
| amk.ChumbaWumba 0.3 | 7 | 11% | 18 |
| ahr.ice.Ice 1.0.2 | 4 | 6% | 20 |
| matt.advanced.Katana 1.0 | 3 | 5% | 9 |
| stelo.Lifestealer 1.0 | 2 | 3% | 3 |
| stelo.PianistNano 1.2 | 1 | 2% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 129616 melee ticks, 36723 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 74 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 74 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 43830 sent, 39066 reached their opponent, 5565 virtual hits (14.2% of those reached).

## Melee bench: F29

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 582 over 6 battles (97.0 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 83.2 | 85 / 210 | 2.51 | 17.9% | 27713 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.2 | 17.9% | 85 |
| deewiant.Anomaly 0.2 | 2.3 | 15.2% | 50 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 15.2% | 51 |
| myl.micro.Troodon 1.10 | 4.0 | 12.0% | 13 |
| jok.PheonixM 0.1.2 | 5.0 | 10.0% | 5 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.5% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.2 | 6.4% | 0 |
| ap.Frederick 1.1 | 8.5 | 5.1% | 2 |
| DBall.Anarchy 0.1 | 8.8 | 5.3% | 3 |
| jangs.ns51 1.0 | 9.5 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 76.8 | 10 / 35 | 4365 |
| 2 | 1 | 67.5 | 81.0 | 15 / 35 | 4538 |
| 3 | 1 | 68.5 | 86.7 | 16 / 35 | 4527 |
| 4 | 1 | 67.0 | 81.3 | 16 / 35 | 4578 |
| 5 | 1 | 68.2 | 84.8 | 11 / 35 | 4992 |
| 6 | 1 | 69.5 | 88.9 | 17 / 35 | 4713 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 65 | 60% |
| zyx.mega.YersiniaPestis 3.1 | 45 | 51% |
| myl.micro.Troodon 1.10 | 19 | 84% |
| jok.PheonixM 0.1.2 | 6 | 67% |
| ph.melee.ArcherME 0.3 | 2 | 100% |
| DBall.Anarchy 0.1 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 981. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 54 | 42% | 88 |
| zyx.mega.YersiniaPestis 3.1 | 42 | 32% | 65 |
| myl.micro.Troodon 1.10 | 15 | 12% | 26 |
| jok.PheonixM 0.1.2 | 8 | 6% | 20 |
| ph.melee.ArcherME 0.3 | 3 | 2% | 6 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 2% | 3 |
| jangs.ns51 1.0 | 1 | 1% | 1 |
| DBall.Anarchy 0.1 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 164724 melee ticks, 52839 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 42 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 2.

Targeting waves (206 rounds): 53754 sent, 48925 reached their opponent, 7471 virtual hits (15.3% of those reached).

## Melee bench: F30

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 680 over 6 battles (113.3 per battle, most in one battle 116). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 77.4 | 46 / 210 | 3.03 | 15.4% | 24023 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 15.4% | 46 |
| catcat20.Matcha 0.006 | 2.7 | 14.1% | 55 |
| darkcanuck.B26354 1.06 | 3.2 | 13.1% | 41 |
| stelo.PastFuture 2.3.2 | 3.8 | 12.3% | 17 |
| oog.melee.Capulet 1.2 | 4.3 | 11.9% | 29 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.2% | 13 |
| ntc.Opposite 1.5 | 7.5 | 7.3% | 0 |
| tripphippy.Alice 1.1 | 8.2 | 7.2% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 8.3 | 6.9% | 7 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 81.0 | 9 / 35 | 4051 |
| 2 | 1 | 62.3 | 74.0 | 8 / 35 | 3763 |
| 3 | 1 | 63.5 | 76.8 | 7 / 35 | 4042 |
| 4 | 1 | 62.5 | 75.2 | 4 / 35 | 3985 |
| 5 | 1 | 64.9 | 81.0 | 9 / 35 | 4187 |
| 6 | 1 | 63.9 | 76.5 | 9 / 35 | 3995 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 28 | 21% |
| darkcanuck.B26354 1.06 | 28 | 54% |
| oog.melee.Capulet 1.2 | 20 | 40% |
| stelo.PastFuture 2.3.2 | 11 | 45% |
| intruder.PrairieWolf 2.61 | 7 | 71% |
| fowl3628800.LightningBolt 2.6.0 | 6 | 50% |
| tripphippy.Alice 1.1 | 5 | 80% |

Hadur died in 170 of 210 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 47 | 28% | 52 |
| darkcanuck.B26354 1.06 | 32 | 19% | 48 |
| stelo.PastFuture 2.3.2 | 29 | 17% | 35 |
| oog.melee.Capulet 1.2 | 28 | 16% | 39 |
| tripphippy.Alice 1.1 | 9 | 5% | 11 |
| intruder.PrairieWolf 2.61 | 8 | 5% | 14 |
| fowl3628800.LightningBolt 2.6.0 | 6 | 4% | 6 |
| ntc.Opposite 1.5 | 5 | 3% | 5 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 161610 melee ticks, 29230 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 49 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 1.

Targeting waves (208 rounds): 52035 sent, 46970 reached their opponent, 7998 virtual hits (17.0% of those reached).

## Melee bench: F31

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 492 over 6 battles (82.0 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 79.9 | 62 / 210 | 2.80 | 16.0% | 22955 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.6% | 88 |
| hadur117.Hadur 3.20wq | 2.0 | 16.0% | 62 |
| gh.mini.Griezel 0.2 | 3.0 | 13.4% | 44 |
| d414.nano.Quantum 1.0.0 | 4.5 | 11.0% | 7 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 11.0% | 6 |
| gh.nano.Grofvuil 0.2 | 6.2 | 8.5% | 2 |
| timmit.nano.TimDog 0.33 | 6.8 | 6.8% | 3 |
| fm.mammillarias 1.3 | 8.5 | 5.5% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.1% | 1 |
| tlp.ThreeLeggedPig 1 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 81.6 | 9 / 35 | 3864 |
| 2 | 2 | 63.2 | 77.1 | 11 / 35 | 3375 |
| 3 | 2 | 65.1 | 80.3 | 11 / 35 | 3965 |
| 4 | 2 | 64.1 | 78.4 | 9 / 35 | 3660 |
| 5 | 2 | 64.4 | 77.8 | 11 / 35 | 3986 |
| 6 | 2 | 66.3 | 84.4 | 11 / 35 | 4105 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 52 | 44% |
| gh.mini.Griezel 0.2 | 25 | 64% |
| d414.nano.Quantum 1.0.0 | 12 | 83% |
| spinnercat.micro.Tyger 0.1 | 10 | 90% |
| timmit.nano.TimDog 0.33 | 4 | 50% |
| gh.nano.Grofvuil 0.2 | 1 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 77 | 51% | 105 |
| gh.mini.Griezel 0.2 | 32 | 21% | 48 |
| d414.nano.Quantum 1.0.0 | 14 | 9% | 21 |
| spinnercat.micro.Tyger 0.1 | 13 | 9% | 16 |
| timmit.nano.TimDog 0.33 | 7 | 5% | 9 |
| fm.mammillarias 1.3 | 2 | 1% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |
| gh.nano.Grofvuil 0.2 | 1 | 1% | 7 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 158793 melee ticks, 32779 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 81 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 81 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 50875 sent, 45822 reached their opponent, 7329 virtual hits (16.0% of those reached).

## Melee bench: F32

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 516 over 6 battles (86.0 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 89.8 | 138 / 210 | 1.92 | 19.0% | 28401 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 19.0% | 138 |
| kawigi.sbf.FloodHT 0.9.2 | 2.2 | 14.3% | 34 |
| apc.botM 3.0 | 2.8 | 12.6% | 23 |
| lxx.ConceptA 0.8 | 4.2 | 10.1% | 5 |
| vjik.UnViolation 1.1 | 4.8 | 9.7% | 2 |
| bayen.UbaMicro 1.4 | 6.3 | 8.5% | 2 |
| panzer.Panzer 0.2 | 6.8 | 7.9% | 0 |
| yk.JahMicro 1.0 | 8.0 | 6.9% | 6 |
| conscience.Electron 1.3g | 9.0 | 6.0% | 0 |
| donjezza.Jezza 1.0 | 9.8 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 89.8 | 21 / 35 | 4857 |
| 2 | 1 | 67.2 | 87.0 | 22 / 35 | 4259 |
| 3 | 1 | 69.3 | 91.4 | 25 / 35 | 4827 |
| 4 | 1 | 67.5 | 85.4 | 22 / 35 | 4678 |
| 5 | 1 | 69.9 | 95.9 | 25 / 35 | 4919 |
| 6 | 1 | 68.5 | 89.2 | 23 / 35 | 4861 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 79 | 75% |
| apc.botM 3.0 | 42 | 81% |
| vjik.UnViolation 1.1 | 16 | 94% |
| yk.JahMicro 1.0 | 10 | 60% |
| bayen.UbaMicro 1.4 | 10 | 90% |
| lxx.ConceptA 0.8 | 8 | 100% |
| donjezza.Jezza 1.0 | 4 | 75% |
| panzer.Panzer 0.2 | 3 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 812. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 25 | 32% | 84 |
| lxx.ConceptA 0.8 | 15 | 19% | 22 |
| apc.botM 3.0 | 11 | 14% | 45 |
| yk.JahMicro 1.0 | 8 | 10% | 10 |
| vjik.UnViolation 1.1 | 5 | 6% | 20 |
| bayen.UbaMicro 1.4 | 4 | 5% | 19 |
| conscience.Electron 1.3g | 4 | 5% | 5 |
| donjezza.Jezza 1.0 | 2 | 3% | 2 |
| panzer.Panzer 0.2 | 1 | 1% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 125688 melee ticks, 55355 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 46 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 42534 sent, 37723 reached their opponent, 6963 virtual hits (18.5% of those reached).

## Melee bench: F33

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 316 over 6 battles (52.7 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 87.5 | 117 / 210 | 2.13 | 19.0% | 28921 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 19.0% | 117 |
| maribo.Quester 0.3 | 2.0 | 15.8% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.4% | 23 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 11.0% | 12 |
| labg.Cataclysm 2.05 | 4.7 | 10.5% | 13 |
| baal.nano.N 1.42 | 6.2 | 9.0% | 2 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 8.0% | 4 |
| zyx.micro.Ant 1.1 | 8.2 | 5.7% | 1 |
| sanja.First 0.1 | 8.8 | 4.4% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 88.6 | 22 / 35 | 4991 |
| 2 | 1 | 70.0 | 91.1 | 21 / 35 | 4783 |
| 3 | 1 | 67.3 | 81.6 | 15 / 35 | 4703 |
| 4 | 1 | 68.4 | 85.1 | 16 / 35 | 4590 |
| 5 | 1 | 69.9 | 89.5 | 21 / 35 | 4895 |
| 6 | 1 | 69.7 | 88.9 | 22 / 35 | 4959 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 60 | 85% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 42 | 71% |
| gre.svman4.Leonidas 1.3.2 | 19 | 89% |
| labg.Cataclysm 2.05 | 12 | 67% |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 86% |
| baal.nano.N 1.42 | 3 | 67% |
| zyx.micro.Ant 1.1 | 2 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 974. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 33 | 34% | 77 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 25% | 52 |
| gre.svman4.Leonidas 1.3.2 | 14 | 15% | 28 |
| labg.Cataclysm 2.05 | 12 | 13% | 27 |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 5% | 8 |
| baal.nano.N 1.42 | 4 | 4% | 11 |
| zyx.micro.Ant 1.1 | 2 | 2% | 5 |
| sanja.First 0.1 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 165690 melee ticks, 49579 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 144 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 144 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 53848 sent, 49105 reached their opponent, 7246 virtual hits (14.8% of those reached).

## Melee bench: F34

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 385 over 6 battles (64.2 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 89.4 | 90 / 210 | 1.95 | 18.8% | 31570 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.2 | 18.8% | 90 |
| stelo.Spread 0.9 | 2.2 | 16.2% | 63 |
| kid.Gladiator .7.2 | 2.7 | 15.7% | 37 |
| jcs.Seth 1.8 | 4.5 | 11.4% | 16 |
| tcf.Reach 3 | 4.7 | 10.2% | 4 |
| cli.Dancer 1.1 | 5.8 | 9.5% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 6.9% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.3% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.2% | 0 |
| sample.RamFire 1.0 | 9.7 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 94.3 | 22 / 35 | 5681 |
| 2 | 1 | 69.9 | 90.2 | 15 / 35 | 5384 |
| 3 | 1 | 69.4 | 89.2 | 15 / 35 | 4959 |
| 4 | 2 | 68.2 | 86.0 | 12 / 35 | 4937 |
| 5 | 1 | 68.6 | 87.6 | 13 / 35 | 5039 |
| 6 | 1 | 69.4 | 89.2 | 13 / 35 | 5570 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 76 | 51% |
| kid.Gladiator .7.2 | 59 | 59% |
| jcs.Seth 1.8 | 20 | 55% |
| tcf.Reach 3 | 3 | 67% |
| cli.Dancer 1.1 | 2 | 50% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 1146. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 57 | 46% | 94 |
| kid.Gladiator .7.2 | 39 | 31% | 62 |
| jcs.Seth 1.8 | 15 | 12% | 32 |
| tcf.Reach 3 | 5 | 4% | 9 |
| cli.Dancer 1.1 | 3 | 2% | 10 |
| ratosh.Wesco 1.4 | 1 | 1% | 2 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 171465 melee ticks, 67745 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 51 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 52983 sent, 48092 reached their opponent, 7971 virtual hits (16.6% of those reached).

## Melee bench: F35

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 410 over 6 battles (68.3 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 82.9 | 50 / 210 | 2.54 | 16.1% | 22756 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.2 | 18.9% | 131 |
| hadur117.Hadur 3.20wq | 1.8 | 16.1% | 50 |
| gh.mini.Gruwel 0.9 | 3.2 | 13.0% | 20 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.8 | 12.1% | 7 |
| rz.HawkOnFire 0.1 | 5.0 | 11.1% | 2 |
| wit.Chuliath 1.0 | 6.2 | 7.3% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.0 | 6.6% | 1 |
| myl.nano.KomoriNinja 1.1 | 8.2 | 5.4% | 0 |
| dans.Cinnamon 1.2 | 8.8 | 4.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.0 | 82.9 | 6 / 35 | 3657 |
| 2 | 2 | 65.6 | 82.2 | 11 / 35 | 3863 |
| 3 | 2 | 65.6 | 85.1 | 7 / 35 | 4022 |
| 4 | 2 | 63.4 | 76.8 | 5 / 35 | 3380 |
| 5 | 1 | 67.0 | 88.6 | 15 / 35 | 3837 |
| 6 | 2 | 65.0 | 81.6 | 6 / 35 | 3997 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 82 | 15% |
| gh.mini.Gruwel 0.9 | 25 | 44% |
| rz.HawkOnFire 0.1 | 14 | 93% |
| dmh.robocode.robot.BlackDeath 9.2 | 12 | 92% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 67% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 942. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 100 | 61% | 112 |
| gh.mini.Gruwel 0.9 | 29 | 18% | 42 |
| dmh.robocode.robot.BlackDeath 9.2 | 13 | 8% | 21 |
| rz.HawkOnFire 0.1 | 11 | 7% | 22 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 2% | 4 |
| wit.Chuliath 1.0 | 2 | 1% | 5 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 144355 melee ticks, 50741 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 40 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 44669 sent, 39842 reached their opponent, 6176 virtual hits (15.5% of those reached).

## Melee bench: F36

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 507 over 6 battles (84.5 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 91.6 | 153 / 210 | 1.76 | 20.6% | 32620 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 20.6% | 153 |
| bzdp.Pansy 2.1 | 2.5 | 12.2% | 9 |
| alpha.RainingFire 1.0 | 3.2 | 11.8% | 14 |
| mz.Cork 0.1 | 4.0 | 11.0% | 12 |
| m3thos.Eva02 0.7.1 | 5.3 | 10.3% | 8 |
| bvh.micro.Freya 0.3 | 5.7 | 10.1% | 8 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.6% | 3 |
| dl.BetterWalls 1.0 | 8.3 | 5.3% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 5.3% | 1 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 88.3 | 24 / 35 | 5291 |
| 2 | 1 | 70.6 | 89.5 | 27 / 35 | 5548 |
| 3 | 1 | 70.2 | 90.8 | 24 / 35 | 5181 |
| 4 | 1 | 71.2 | 92.4 | 25 / 35 | 5562 |
| 5 | 1 | 71.7 | 94.9 | 27 / 35 | 5558 |
| 6 | 1 | 71.3 | 93.7 | 26 / 35 | 5480 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 43 | 93% |
| mz.Cork 0.1 | 38 | 87% |
| bvh.micro.Freya 0.3 | 31 | 84% |
| alpha.RainingFire 1.0 | 28 | 75% |
| m3thos.Eva02 0.7.1 | 19 | 95% |
| bvh.mini.Fenrir 0.39 | 13 | 92% |
| sample.MyFirstRobot 1.0 | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 14 | 23% | 32 |
| bzdp.Pansy 2.1 | 12 | 20% | 47 |
| mz.Cork 0.1 | 10 | 16% | 39 |
| m3thos.Eva02 0.7.1 | 9 | 15% | 35 |
| bvh.micro.Freya 0.3 | 7 | 11% | 28 |
| bvh.mini.Fenrir 0.39 | 2 | 3% | 12 |
| squidM.TentalceMeleeNano 1.1 | 2 | 3% | 6 |
| dl.BetterWalls 1.0 | 1 | 2% | 7 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 143844 melee ticks, 47095 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 40 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 49127 sent, 44549 reached their opponent, 9182 virtual hits (20.6% of those reached).

## Melee bench: F37

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 303 over 6 battles (50.5 per battle, most in one battle 108). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 89.4 | 157 / 210 | 1.96 | 19.3% | 33221 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 19.3% | 157 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.8 | 10.5% | 9 |
| EBBU.Sim2 1.02 | 4.2 | 9.7% | 5 |
| germ.TheMind .2 | 4.3 | 9.5% | 6 |
| agrach.Dalek 1.0 | 5.8 | 9.2% | 9 |
| mb.Beast 0.1 | 6.0 | 8.7% | 11 |
| lmk.ACPFinal 0.1 | 6.3 | 8.8% | 2 |
| stelo.UntouchableNano 1.3 | 6.7 | 8.7% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 7.5 | 8.3% | 1 |
| skm.Ryubot 1.0 | 9.3 | 7.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 89.5 | 27 / 35 | 5523 |
| 2 | 1 | 68.6 | 90.2 | 27 / 35 | 5346 |
| 3 | 1 | 68.6 | 90.5 | 24 / 35 | 5622 |
| 4 | 1 | 67.9 | 87.0 | 25 / 35 | 5561 |
| 5 | 1 | 69.0 | 90.2 | 27 / 35 | 5784 |
| 6 | 1 | 68.3 | 88.9 | 27 / 35 | 5385 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 27 | 96% |
| com.syncleus.robocode.Dreadnaught 0.1 | 26 | 92% |
| agrach.Dalek 1.0 | 25 | 96% |
| mb.Beast 0.1 | 23 | 91% |
| EBBU.Sim2 1.02 | 20 | 90% |
| lmk.ACPFinal 0.1 | 19 | 100% |
| stelo.UntouchableNano 1.3 | 13 | 85% |
| skm.Ryubot 1.0 | 10 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 4 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 468. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mb.Beast 0.1 | 10 | 18% | 28 |
| agrach.Dalek 1.0 | 9 | 16% | 40 |
| com.syncleus.robocode.Dreadnaught 0.1 | 9 | 16% | 33 |
| lmk.ACPFinal 0.1 | 8 | 14% | 27 |
| stelo.UntouchableNano 1.3 | 6 | 11% | 15 |
| EBBU.Sim2 1.02 | 5 | 9% | 30 |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 5% | 15 |
| germ.TheMind .2 | 2 | 4% | 16 |
| skm.Ryubot 1.0 | 2 | 4% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 99124 melee ticks, 23219 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 85 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 85 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 33383 sent, 28814 reached their opponent, 8377 virtual hits (29.1% of those reached).

## Melee bench: F38

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 550 over 6 battles (91.7 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 88.8 | 123 / 210 | 2.00 | 18.9% | 28971 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 18.9% | 123 |
| justin.Mallais 14.0 | 2.0 | 15.8% | 51 |
| bvh.mini.Freya 0.55 | 3.2 | 12.4% | 11 |
| bts.mega.Gnarly 1.4 | 4.5 | 10.7% | 14 |
| cs.Wren 1.0 | 4.7 | 10.5% | 4 |
| kdf.KoulDestroyer 1.0 | 5.7 | 9.7% | 5 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.2 | 8.1% | 0 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.8 | 6.0% | 3 |
| matt.UnderDark3 2.4.34 | 9.0 | 4.5% | 0 |
| bzdp.BoxCar 2.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 91.7 | 22 / 35 | 4926 |
| 2 | 1 | 67.7 | 86.7 | 20 / 35 | 4194 |
| 3 | 1 | 69.0 | 89.2 | 17 / 35 | 5006 |
| 4 | 1 | 69.4 | 89.5 | 23 / 35 | 4918 |
| 5 | 1 | 69.0 | 88.3 | 20 / 35 | 4837 |
| 6 | 1 | 68.8 | 87.6 | 21 / 35 | 5090 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 75 | 76% |
| bvh.mini.Freya 0.55 | 23 | 74% |
| bts.mega.Gnarly 1.4 | 20 | 70% |
| cs.Wren 1.0 | 19 | 89% |
| kdf.KoulDestroyer 1.0 | 10 | 70% |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 60% |
| davidalves.net.DuelistNanoMelee 1.01 | 5 | 100% |
| matt.UnderDark3 2.4.34 | 3 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 45 | 49% | 98 |
| bts.mega.Gnarly 1.4 | 13 | 14% | 34 |
| bvh.mini.Freya 0.55 | 13 | 14% | 27 |
| cs.Wren 1.0 | 8 | 9% | 22 |
| kdf.KoulDestroyer 1.0 | 5 | 5% | 12 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 3% | 5 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 3 |
| davidalves.net.DuelistNanoMelee 1.01 | 0 | 0% | 8 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 141857 melee ticks, 45609 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 32 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 45930 sent, 40925 reached their opponent, 8633 virtual hits (21.1% of those reached).

## Melee bench: F39

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 418 over 6 battles (69.7 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 86.8 | 102 / 210 | 2.19 | 18.4% | 30136 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 18.4% | 102 |
| bvh.fry.Freya 0.82 | 2.3 | 14.1% | 17 |
| az.Ololobot 0.2.4 | 2.7 | 13.9% | 61 |
| catcat20.Lambda 0.024 | 4.0 | 12.3% | 26 |
| gimp.GimpBot 0.1 | 5.5 | 8.5% | 0 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 8.1% | 4 |
| apollokidd.ApolloKidd 0.9 | 6.3 | 8.0% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 8.2 | 6.5% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.5% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 84.1 | 16 / 35 | 4842 |
| 2 | 1 | 67.4 | 83.5 | 15 / 35 | 5163 |
| 3 | 1 | 67.4 | 87.9 | 16 / 35 | 4720 |
| 4 | 1 | 69.4 | 91.7 | 17 / 35 | 5390 |
| 5 | 1 | 68.8 | 87.6 | 20 / 35 | 5189 |
| 6 | 1 | 67.6 | 86.0 | 18 / 35 | 4832 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 56 | 57% |
| catcat20.Lambda 0.024 | 40 | 73% |
| bvh.fry.Freya 0.82 | 37 | 76% |
| gimp.GimpBot 0.1 | 5 | 100% |
| winamp32.micro.MicroMacro 1.0 | 5 | 100% |
| apollokidd.ApolloKidd 0.9 | 3 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 1070. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 35 | 32% | 73 |
| bvh.fry.Freya 0.82 | 31 | 28% | 52 |
| catcat20.Lambda 0.024 | 22 | 20% | 45 |
| stelo.SoRobotNanoMelee 1.2 | 10 | 9% | 10 |
| apollokidd.ApolloKidd 0.9 | 5 | 5% | 10 |
| winamp32.micro.MicroMacro 1.0 | 3 | 3% | 11 |
| gimp.GimpBot 0.1 | 1 | 1% | 8 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 166292 melee ticks, 58548 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 52 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 52 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 52272 sent, 47371 reached their opponent, 8077 virtual hits (17.1% of those reached).

## Melee bench: F40

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 314 over 6 battles (52.3 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 91.0 | 143 / 210 | 1.81 | 20.1% | 30972 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 20.1% | 143 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.5% | 27 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.2% | 12 |
| Polkwane.SmashMelee 1.0 | 4.5 | 10.9% | 13 |
| mz.AntiGrav 1.0 | 4.5 | 11.4% | 8 |
| stelo.Randomness 1.0 | 6.3 | 8.7% | 5 |
| alpha.BlackIce 1.0 | 6.7 | 8.6% | 2 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.3% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 4.0% | 0 |
| sample.Corners 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 88.6 | 20 / 35 | 4785 |
| 2 | 1 | 70.7 | 90.5 | 27 / 35 | 5192 |
| 3 | 1 | 70.3 | 90.2 | 23 / 35 | 5200 |
| 4 | 1 | 70.0 | 88.9 | 23 / 35 | 5175 |
| 5 | 1 | 71.7 | 94.3 | 27 / 35 | 5232 |
| 6 | 1 | 71.0 | 93.7 | 23 / 35 | 5388 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 58 | 79% |
| kano.gamma.KanoGamma 1.8 | 37 | 89% |
| mz.AntiGrav 1.0 | 34 | 100% |
| Polkwane.SmashMelee 1.0 | 24 | 83% |
| stelo.Randomness 1.0 | 8 | 75% |
| alpha.BlackIce 1.0 | 3 | 67% |
| amk.superstrike.SuperStrike 0.3 | 2 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 24 | 34% | 56 |
| kano.gamma.KanoGamma 1.8 | 15 | 21% | 58 |
| mz.AntiGrav 1.0 | 8 | 11% | 32 |
| Polkwane.SmashMelee 1.0 | 7 | 10% | 22 |
| stelo.Randomness 1.0 | 4 | 6% | 14 |
| amk.superstrike.SuperStrike 0.3 | 4 | 6% | 12 |
| alpha.BlackIce 1.0 | 4 | 6% | 10 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 4 |
| sample.Corners 1.0 | 1 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 152986 melee ticks, 40419 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 112 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 112 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 50019 sent, 45089 reached their opponent, 9246 virtual hits (20.5% of those reached).

## Melee bench: F41

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 274 over 6 battles (45.7 per battle, most in one battle 116). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 89.9 | 113 / 210 | 1.90 | 18.8% | 27273 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 18.8% | 113 |
| eem.EvBotNG v12.8 | 2.0 | 15.2% | 64 |
| lessonz.robocode.Oz 0.5.0 | 3.3 | 13.0% | 11 |
| ary.Swarm 1.1 | 4.2 | 12.5% | 10 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 11.5% | 10 |
| shrub.Silver v048 | 6.0 | 8.9% | 2 |
| zyx.nano.Ant 1.1 | 7.0 | 7.2% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 5.6% | 0 |
| stelo.Mirror 1.1 | 8.7 | 5.2% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 92.1 | 23 / 35 | 4415 |
| 2 | 1 | 69.6 | 90.2 | 21 / 35 | 4650 |
| 3 | 1 | 69.6 | 92.4 | 19 / 35 | 4377 |
| 4 | 1 | 69.4 | 89.2 | 20 / 35 | 4744 |
| 5 | 1 | 67.5 | 86.3 | 15 / 35 | 4198 |
| 6 | 1 | 69.0 | 89.5 | 15 / 35 | 4889 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 67 | 45% |
| lessonz.robocode.Oz 0.5.0 | 35 | 86% |
| ary.Swarm 1.1 | 34 | 88% |
| simonton.nano.MeleeSeed 1.8 | 21 | 86% |
| stelo.Mirror 1.1 | 3 | 100% |
| shrub.Silver v048 | 2 | 50% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 996. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 49 | 49% | 82 |
| lessonz.robocode.Oz 0.5.0 | 22 | 22% | 45 |
| ary.Swarm 1.1 | 11 | 11% | 40 |
| simonton.nano.MeleeSeed 1.8 | 7 | 7% | 25 |
| shrub.Silver v048 | 6 | 6% | 7 |
| stelo.Mirror 1.1 | 3 | 3% | 7 |
| jsal.Jsalbot 1.0 | 1 | 1% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 156502 melee ticks, 49460 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 652 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 254 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 51201 sent, 46252 reached their opponent, 7108 virtual hits (15.4% of those reached).

## Melee bench: F42

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 523 over 6 battles (87.2 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 91.2 | 142 / 210 | 1.80 | 20.2% | 34798 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 20.2% | 142 |
| wompi.Wallaby 5.1 | 2.2 | 15.1% | 28 |
| maribo.mini.MiniQuester 0.1 | 2.8 | 13.5% | 15 |
| ara.Shera 0.88 | 4.0 | 12.6% | 22 |
| amz.NanoClone 1.41 | 5.0 | 9.2% | 1 |
| dsw.StaticD 1.0 | 6.5 | 7.1% | 2 |
| maribo.IotaCT 1.1 | 7.3 | 6.4% | 0 |
| stelo.MirrorMicro 1.0 | 7.7 | 6.2% | 0 |
| mme.NikeEnhanced 2.0 | 8.7 | 5.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 91.1 | 24 / 35 | 5880 |
| 2 | 1 | 71.8 | 94.6 | 28 / 35 | 5993 |
| 3 | 1 | 70.5 | 88.9 | 27 / 35 | 5846 |
| 4 | 1 | 70.2 | 91.4 | 22 / 35 | 5482 |
| 5 | 1 | 70.0 | 90.2 | 20 / 35 | 5626 |
| 6 | 1 | 70.4 | 90.8 | 21 / 35 | 5971 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 98 | 87% |
| maribo.mini.MiniQuester 0.1 | 39 | 92% |
| ara.Shera 0.88 | 21 | 62% |
| dsw.StaticD 1.0 | 4 | 100% |
| amz.NanoClone 1.41 | 2 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 915. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 26 | 36% | 46 |
| wompi.Wallaby 5.1 | 21 | 29% | 93 |
| maribo.mini.MiniQuester 0.1 | 14 | 19% | 48 |
| dsw.StaticD 1.0 | 4 | 5% | 13 |
| amz.NanoClone 1.41 | 3 | 4% | 6 |
| maribo.IotaCT 1.1 | 1 | 1% | 2 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 1 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 162531 melee ticks, 49029 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 32 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 51591 sent, 46782 reached their opponent, 9433 virtual hits (20.2% of those reached).

## Melee bench: F43

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 705 over 6 battles (117.5 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 80.4 | 42 / 210 | 2.77 | 16.0% | 24449 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.5% | 136 |
| hadur117.Hadur 3.20wq | 2.0 | 16.0% | 42 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.7% | 24 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.9% | 8 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.4% | 0 |
| Krabb.akim2.Akim2 1.1b | 6.2 | 9.2% | 0 |
| mz.NanoGod 2.02 | 7.3 | 7.7% | 0 |
| jab.DiamondStealer 5 | 7.3 | 7.6% | 1 |
| cvt.Firsty 1.0 | 9.0 | 3.5% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.7 | 79.7 | 5 / 35 | 4098 |
| 2 | 2 | 65.5 | 80.6 | 4 / 35 | 3740 |
| 3 | 2 | 68.0 | 85.4 | 12 / 35 | 4432 |
| 4 | 2 | 65.8 | 79.4 | 6 / 35 | 3879 |
| 5 | 2 | 66.6 | 79.7 | 8 / 35 | 4373 |
| 6 | 2 | 65.1 | 77.5 | 7 / 35 | 3927 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 78 | 23% |
| brainfade.melee.Dusk 0.44 | 23 | 39% |
| dummy.micro.Sparrow 2.5 | 10 | 80% |
| wcsv.melee.EngineerMelee 0.1 | 5 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 953. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 106 | 61% | 125 |
| brainfade.melee.Dusk 0.44 | 26 | 15% | 34 |
| dummy.micro.Sparrow 2.5 | 19 | 11% | 25 |
| wcsv.melee.EngineerMelee 0.1 | 11 | 6% | 17 |
| jab.DiamondStealer 5 | 3 | 2% | 4 |
| Krabb.akim2.Akim2 1.1b | 1 | 1% | 2 |
| mz.NanoGod 2.02 | 1 | 1% | 2 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 158614 melee ticks, 44890 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 39 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 50789 sent, 45800 reached their opponent, 7581 virtual hits (16.6% of those reached).

## Melee bench: F44

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 97 over 6 battles (16.2 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 92.6 | 135 / 210 | 1.67 | 20.7% | 34501 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 20.7% | 135 |
| stelo.Liblix 0.3.1 | 2.0 | 15.6% | 52 |
| tzu.TheArtOfWar 1.2 | 3.0 | 13.8% | 17 |
| jwirde.Gort 2.0 | 4.5 | 9.4% | 1 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.7 | 9.7% | 2 |
| disan.Chair 2.2.0 | 6.5 | 7.6% | 2 |
| wompi.Quokka 1.6 | 7.2 | 6.9% | 0 |
| stf.PanzerGeneral 0.1 | 7.2 | 7.0% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.8% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 91.1 | 19 / 35 | 5793 |
| 2 | 1 | 71.5 | 92.1 | 26 / 35 | 6089 |
| 3 | 1 | 70.8 | 91.7 | 21 / 35 | 5696 |
| 4 | 1 | 71.5 | 94.0 | 25 / 35 | 5837 |
| 5 | 1 | 71.4 | 94.0 | 23 / 35 | 5598 |
| 6 | 1 | 70.8 | 92.7 | 21 / 35 | 5488 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 74 | 62% |
| tzu.TheArtOfWar 1.2 | 63 | 83% |
| jwirde.Gort 2.0 | 15 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 11 | 82% |
| disan.Chair 2.2.0 | 9 | 100% |
| wompi.Quokka 1.6 | 3 | 100% |
| stf.PanzerGeneral 0.1 | 2 | 50% |

Hadur died in 75 of 210 rounds, at a mean tick of 963. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 40 | 53% | 92 |
| tzu.TheArtOfWar 1.2 | 22 | 29% | 65 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 7% | 17 |
| jwirde.Gort 2.0 | 3 | 4% | 21 |
| disan.Chair 2.2.0 | 2 | 3% | 4 |
| wompi.Quokka 1.6 | 1 | 1% | 5 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 3 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 1 |
| sample.Crazy 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 205 rounds): 157276 melee ticks, 49376 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 40 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 53482 sent, 48647 reached their opponent, 9906 virtual hits (20.4% of those reached).

## Melee bench: F45

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 687 over 6 battles (114.5 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 88.3 | 117 / 210 | 2.06 | 19.8% | 32498 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20wq | 1.0 | 19.8% | 117 |
| jje.BagPuss 1.2 | 3.2 | 11.8% | 6 |
| eem.IWillFireNoBullet v2.8 | 3.7 | 10.2% | 68 |
| sul.Lunar 1.1 | 3.8 | 11.1% | 12 |
| myl.nano.Graviton 1.10 | 4.2 | 10.8% | 3 |
| fm.claire 1.7 | 6.7 | 9.0% | 1 |
| hvilela.HVilela 0.9 | 6.8 | 8.7% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.2 | 8.3% | 1 |
| wit.Deep7 2.0 | 8.7 | 6.2% | 2 |
| abud.ThirdRobo 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 87.6 | 18 / 35 | 5352 |
| 2 | 1 | 68.5 | 83.5 | 18 / 35 | 5359 |
| 3 | 1 | 70.7 | 90.2 | 20 / 35 | 6061 |
| 4 | 1 | 72.7 | 96.5 | 29 / 35 | 5007 |
| 5 | 1 | 68.7 | 84.4 | 16 / 35 | 5507 |
| 6 | 1 | 68.8 | 87.3 | 16 / 35 | 5212 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 72 | 46% |
| jje.BagPuss 1.2 | 31 | 90% |
| myl.nano.Graviton 1.10 | 20 | 100% |
| sul.Lunar 1.1 | 17 | 88% |
| pez.mini.ChironexFleckeri 0.5 | 9 | 100% |
| fm.claire 1.7 | 5 | 80% |
| wit.Deep7 2.0 | 4 | 100% |
| hvilela.HVilela 0.9 | 3 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 1427. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 41 | 41% | 0 |
| jje.BagPuss 1.2 | 14 | 14% | 60 |
| myl.nano.Graviton 1.10 | 9 | 9% | 41 |
| sul.Lunar 1.1 | 8 | 8% | 47 |
| hvilela.HVilela 0.9 | 7 | 7% | 16 |
| fm.claire 1.7 | 7 | 7% | 14 |
| pez.mini.ChironexFleckeri 0.5 | 6 | 6% | 22 |
| wit.Deep7 2.0 | 1 | 1% | 5 |
| abud.ThirdRobo 1.0 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 175234 melee ticks, 89477 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 58 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 56351 sent, 51542 reached their opponent, 7928 virtual hits (15.4% of those reached).

## Melee bench: F46

hadur117.Hadur 3.20wq against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 265 over 6 battles (44.2 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 84.8 | 67 / 210 | 2.37 | 16.7% | 25019 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.8 | 16.8% | 59 |
| rsalesc.melee.Medina 0.4.5 | 2.0 | 16.9% | 77 |
| hadur117.Hadur 3.20wq | 2.2 | 16.7% | 67 |
| mz.MicroSheep 1.0 | 4.2 | 10.5% | 3 |
| cx.Princess 1.0 | 5.2 | 9.3% | 4 |
| sadoner.killer 0.2 | 5.7 | 8.9% | 0 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.1% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.3 | 5.6% | 0 |
| kurios.DOSexe .9a | 8.5 | 5.3% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.0 | 82.2 | 8 / 35 | 3903 |
| 2 | 1 | 66.9 | 85.7 | 14 / 35 | 4252 |
| 3 | 2 | 66.4 | 84.4 | 14 / 35 | 4093 |
| 4 | 3 | 65.8 | 82.2 | 10 / 35 | 4124 |
| 5 | 1 | 67.7 | 88.6 | 12 / 35 | 4484 |
| 6 | 3 | 66.5 | 85.7 | 9 / 35 | 4163 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 73 | 56% |
| rsalesc.melee.Medina 0.4.5 | 39 | 38% |
| mz.MicroSheep 1.0 | 8 | 75% |
| cx.Princess 1.0 | 5 | 80% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 983. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 68 | 47% | 103 |
| rsalesc.melee.Medina 0.4.5 | 49 | 34% | 72 |
| cx.Princess 1.0 | 10 | 7% | 12 |
| arthord.NanoSatanMelee Beta | 7 | 5% | 10 |
| mz.MicroSheep 1.0 | 7 | 5% | 9 |
| sadoner.killer 0.2 | 1 | 1% | 3 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 158300 melee ticks, 48942 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 103 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 103 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 1.

Targeting waves (209 rounds): 46262 sent, 41302 reached their opponent, 6195 virtual hits (15.0% of those reached).

