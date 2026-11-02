# Bench suite: suite.txt

## Melee bench: F01

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 146 over 6 battles (24.3 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.9 | 54 / 210 | 2.09 | 18.0% | 32923 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.2 | 19.8% | 139 |
| hadur117.Hadur 3.21 | 1.8 | 18.0% | 54 |
| sgp.JollyNinja 3.53 | 3.3 | 11.5% | 11 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.8 | 11.3% | 1 |
| lorneswork.Predator 1.0 | 5.3 | 9.6% | 2 |
| mz.MicroGodMelee 1 | 5.5 | 9.6% | 3 |
| adt.Ar2 1.0 | 7.0 | 7.5% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.4% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.2 | 87.0 | 6 / 35 | 5706 |
| 2 | 2 | 67.1 | 84.1 | 9 / 35 | 5122 |
| 3 | 2 | 68.6 | 88.3 | 10 / 35 | 5565 |
| 4 | 1 | 69.3 | 90.5 | 10 / 35 | 5838 |
| 5 | 2 | 68.2 | 88.3 | 9 / 35 | 5174 |
| 6 | 2 | 68.6 | 89.2 | 10 / 35 | 5518 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 120 | 9% |
| sgp.JollyNinja 3.53 | 23 | 74% |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 100% |
| lorneswork.Predator 1.0 | 9 | 89% |
| mz.MicroGodMelee 1 | 7 | 86% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 156 of 210 rounds, at a mean tick of 1198. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 120 | 77% | 135 |
| sgp.JollyNinja 3.53 | 18 | 12% | 31 |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 6% | 21 |
| mz.MicroGodMelee 1 | 3 | 2% | 9 |
| lorneswork.Predator 1.0 | 3 | 2% | 9 |
| adt.Ar2 1.0 | 2 | 1% | 3 |
| skm.butterfly 1.0 | 1 | 1% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 139013 melee ticks, 86433 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 40 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 44563 sent, 39779 reached their opponent, 7958 virtual hits (20.0% of those reached).

## Melee bench: F02

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 223 over 6 battles (37.2 per battle, most in one battle 63). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 84.7 | 97 / 210 | 2.38 | 18.5% | 30868 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 18.5% | 97 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.3% | 54 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.7% | 21 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.2% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 9.6% | 10 |
| Noran.BitchingElk 0.054 | 6.5 | 8.3% | 15 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 8.0% | 2 |
| sch.Simone 0.3d | 7.7 | 7.7% | 7 |
| stelo.PatternRobot 1.0 | 9.0 | 5.1% | 2 |
| fullsail.SweetTea 1.1 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 80.6 | 11 / 35 | 5228 |
| 2 | 1 | 68.4 | 85.7 | 18 / 35 | 4878 |
| 3 | 1 | 67.9 | 85.7 | 15 / 35 | 4945 |
| 4 | 1 | 68.8 | 82.9 | 17 / 35 | 5622 |
| 5 | 1 | 69.2 | 86.7 | 21 / 35 | 5253 |
| 6 | 1 | 67.9 | 86.7 | 15 / 35 | 4942 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 45 | 47% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 41 | 76% |
| com.cohesiva.robocode.ManOwaR 1.0 | 16 | 50% |
| Noran.BitchingElk 0.054 | 15 | 40% |
| sch.Simone 0.3d | 14 | 93% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 100% |
| stelo.PatternRobot 1.0 | 4 | 100% |
| fnc.bandit.Bandit 5.2.0 | 3 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 949. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 45 | 40% | 64 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 23 | 20% | 57 |
| Noran.BitchingElk 0.054 | 12 | 11% | 20 |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 10% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 9% | 15 |
| sch.Simone 0.3d | 5 | 4% | 16 |
| fnc.bandit.Bandit 5.2.0 | 5 | 4% | 9 |
| stelo.PatternRobot 1.0 | 2 | 2% | 6 |

Posture (Hadur's M records, 198 rounds): 161418 melee ticks, 40747 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 41 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 56891 sent, 52319 reached their opponent, 8990 virtual hits (17.2% of those reached).

## Melee bench: F03

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 164 over 6 battles (27.3 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 95.1 | 173 / 210 | 1.44 | 21.4% | 39460 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 21.4% | 173 |
| radnor.DoctorBob 1.42 | 2.5 | 13.7% | 12 |
| kawigi.nano.Lib 1.0 | 3.2 | 12.8% | 7 |
| vuen.Cake 2.51 | 3.3 | 12.5% | 17 |
| urdos.URDOS 1.3 | 5.3 | 8.7% | 1 |
| adt.Ar1 2.1 | 6.0 | 7.8% | 0 |
| oa.weak.FlyMk1 0.1 | 7.0 | 6.7% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.8 | 6.2% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 5.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 95.2 | 29 / 35 | 6514 |
| 2 | 1 | 71.9 | 94.6 | 29 / 35 | 6814 |
| 3 | 1 | 71.8 | 94.3 | 28 / 35 | 6530 |
| 4 | 1 | 70.5 | 91.7 | 25 / 35 | 6133 |
| 5 | 1 | 72.0 | 96.2 | 29 / 35 | 6655 |
| 6 | 1 | 73.0 | 98.4 | 33 / 35 | 6814 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 71 | 86% |
| radnor.DoctorBob 1.42 | 64 | 98% |
| kawigi.nano.Lib 1.0 | 48 | 90% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| urdos.URDOS 1.3 | 1 | 100% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 12 | 32% | 71 |
| radnor.DoctorBob 1.42 | 9 | 24% | 70 |
| kawigi.nano.Lib 1.0 | 9 | 24% | 37 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 11% | 6 |
| urdos.URDOS 1.3 | 2 | 5% | 8 |
| adt.Ar1 2.1 | 1 | 3% | 7 |
| oa.weak.FlyMk1 0.1 | 1 | 3% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 127159 melee ticks, 41839 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 63 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 38592 sent, 34057 reached their opponent, 8936 virtual hits (26.2% of those reached).

## Melee bench: F04

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 91 over 6 battles (15.2 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 85.2 | 26 / 210 | 2.33 | 17.7% | 35021 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.6% | 168 |
| hadur117.Hadur 3.21 | 2.0 | 17.7% | 26 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.5% | 4 |
| TNT.TNT 0.99.1 | 4.2 | 10.7% | 9 |
| josago.Jorgito 0.16 | 5.0 | 8.8% | 2 |
| css.Delitioner 0.11 | 6.0 | 7.4% | 1 |
| tj.zombie1n 1.0.1 | 7.0 | 6.4% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 3.8% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 82.2 | 1 / 35 | 5307 |
| 2 | 2 | 69.9 | 89.2 | 8 / 35 | 6211 |
| 3 | 2 | 68.6 | 85.1 | 5 / 35 | 5886 |
| 4 | 2 | 69.2 | 86.7 | 6 / 35 | 6074 |
| 5 | 2 | 68.1 | 85.1 | 3 / 35 | 5744 |
| 6 | 2 | 67.8 | 83.2 | 3 / 35 | 5799 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 139 | 9% |
| TNT.TNT 0.99.1 | 12 | 42% |
| apc.LeeroyJenkins2 1.0 | 7 | 71% |
| josago.Jorgito 0.16 | 3 | 67% |
| tj.zombie1n 1.0.1 | 1 | 100% |

Hadur died in 184 of 210 rounds, at a mean tick of 1288. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 141 | 77% | 157 |
| apc.LeeroyJenkins2 1.0 | 17 | 9% | 21 |
| TNT.TNT 0.99.1 | 14 | 8% | 18 |
| josago.Jorgito 0.16 | 7 | 4% | 8 |
| css.Delitioner 0.11 | 2 | 1% | 3 |
| tj.zombie1n 1.0.1 | 2 | 1% | 2 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |

Posture (Hadur's M records, 203 rounds): 186366 melee ticks, 78038 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 88 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 88 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 57247 sent, 52546 reached their opponent, 8040 virtual hits (15.3% of those reached).

## Melee bench: F06

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 127 over 6 battles (21.2 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 92.1 | 137 / 210 | 1.71 | 20.6% | 35149 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 20.6% | 137 |
| jekl.StoneGhost 0.7 | 2.2 | 14.4% | 22 |
| origin.SleepSiphon 1.7b | 2.8 | 13.1% | 30 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 11.9% | 8 |
| mld.Wisdom 1.0 | 5.3 | 9.9% | 5 |
| gg.Wolverine 2.0 | 5.8 | 8.5% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 7.5% | 7 |
| DBall.NUKE 0.1 | 8.3 | 5.8% | 0 |
| spinnercat.Omen 1.0 | 8.7 | 5.7% | 0 |
| sample.Fire 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 91.4 | 23 / 35 | 5767 |
| 2 | 1 | 73.0 | 97.5 | 27 / 35 | 6305 |
| 3 | 1 | 70.4 | 89.8 | 20 / 35 | 5665 |
| 4 | 1 | 71.1 | 91.4 | 27 / 35 | 5620 |
| 5 | 1 | 71.4 | 93.7 | 23 / 35 | 5828 |
| 6 | 1 | 70.2 | 88.6 | 17 / 35 | 5964 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 66 | 88% |
| origin.SleepSiphon 1.7b | 50 | 70% |
| pe.minimelee.SandboxMiniMelee 1.1 | 28 | 89% |
| ers.nano.hawk.HawkLA 3.0m | 13 | 62% |
| gg.Wolverine 2.0 | 7 | 86% |
| DBall.NUKE 0.1 | 3 | 100% |
| mld.Wisdom 1.0 | 2 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 1014. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 25 | 34% | 66 |
| jekl.StoneGhost 0.7 | 21 | 28% | 59 |
| ers.nano.hawk.HawkLA 3.0m | 10 | 14% | 21 |
| pe.minimelee.SandboxMiniMelee 1.1 | 9 | 12% | 30 |
| mld.Wisdom 1.0 | 6 | 8% | 19 |
| gg.Wolverine 2.0 | 1 | 1% | 10 |
| DBall.NUKE 0.1 | 1 | 1% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 150941 melee ticks, 49745 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 50 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 3.

Targeting waves (201 rounds): 45702 sent, 41140 reached their opponent, 8968 virtual hits (21.8% of those reached).

## Melee bench: F07

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 98 over 6 battles (16.3 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 93.5 | 126 / 210 | 1.58 | 21.2% | 40657 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 21.2% | 126 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 16.3% | 35 |
| rtk.Tachikoma 1.0 | 2.7 | 16.2% | 25 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.7% | 14 |
| franzor.Lizt 1.3.1 | 4.7 | 10.9% | 11 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.0% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.3% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.2 | 2.1% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 90.2 | 19 / 35 | 6510 |
| 2 | 1 | 73.8 | 95.6 | 24 / 35 | 7070 |
| 3 | 1 | 73.2 | 94.3 | 22 / 35 | 6730 |
| 4 | 1 | 73.2 | 94.0 | 21 / 35 | 7050 |
| 5 | 1 | 72.0 | 92.7 | 18 / 35 | 6357 |
| 6 | 1 | 73.2 | 94.6 | 22 / 35 | 6940 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 95 | 81% |
| rsalesc.melee.Monk 0.3.6c | 35 | 29% |
| oog.melee.CapuletDroid 1.1 | 30 | 67% |
| franzor.Lizt 1.3.1 | 23 | 78% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 1517. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 34 | 40% | 55 |
| rtk.Tachikoma 1.0 | 30 | 36% | 112 |
| oog.melee.CapuletDroid 1.1 | 12 | 14% | 36 |
| franzor.Lizt 1.3.1 | 7 | 8% | 4 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 2 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 186182 melee ticks, 95498 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 32 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 54919 sent, 50314 reached their opponent, 10051 virtual hits (20.0% of those reached).

## Melee bench: F08

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 163 over 6 battles (27.2 per battle, most in one battle 48). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 89.5 | 132 / 210 | 1.94 | 19.2% | 29103 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 19.2% | 132 |
| Krabb.sliNk.Garm 0.9u | 2.8 | 13.1% | 31 |
| tm.Yuugao 1.0 | 3.0 | 12.6% | 27 |
| shrub.Vapour v159 | 3.3 | 12.2% | 14 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 9.4% | 5 |
| m3thos.Eva00 1.1 | 6.5 | 8.2% | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 6.7 | 8.1% | 2 |
| qualidafial.MajorDick 1.0.1 | 8.2 | 6.5% | 0 |
| SHAM.WOW 1.4 | 9.0 | 5.4% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 88.3 | 22 / 35 | 4524 |
| 2 | 1 | 69.8 | 91.1 | 25 / 35 | 5055 |
| 3 | 1 | 69.7 | 91.4 | 22 / 35 | 5068 |
| 4 | 1 | 68.7 | 89.2 | 22 / 35 | 4653 |
| 5 | 1 | 69.3 | 90.8 | 19 / 35 | 5188 |
| 6 | 1 | 68.0 | 86.3 | 22 / 35 | 4615 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 52 | 73% |
| Krabb.sliNk.Garm 0.9u | 50 | 76% |
| shrub.Vapour v159 | 30 | 87% |
| com.spp.robocode.MostlyHarmless 010 | 15 | 93% |
| m3thos.Eva00 1.1 | 10 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 25 | 31% | 64 |
| Krabb.sliNk.Garm 0.9u | 24 | 30% | 53 |
| shrub.Vapour v159 | 12 | 15% | 38 |
| com.spp.robocode.MostlyHarmless 010 | 7 | 9% | 23 |
| jwst.DAD.DarkAndDarker 1.1 | 7 | 9% | 16 |
| m3thos.Eva00 1.1 | 3 | 4% | 11 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 1 |
| SHAM.WOW 1.4 | 0 | 0% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 146814 melee ticks, 44504 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 57 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 48631 sent, 43617 reached their opponent, 7898 virtual hits (18.1% of those reached).

## Melee bench: F09

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 113 over 6 battles (18.8 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 79.9 | 69 / 210 | 2.80 | 16.3% | 23671 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.6% | 95 |
| hadur117.Hadur 3.21 | 1.8 | 16.3% | 69 |
| kc.micro.Figment 1.0 | 3.0 | 13.9% | 20 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.5% | 13 |
| yagami.Tidus 0.11 | 4.7 | 10.1% | 3 |
| mc2.enemy.Original 0.9 | 5.7 | 9.4% | 10 |
| dft.Calliope 5.6 | 7.0 | 7.6% | 1 |
| step.nanoPri 1.0 | 8.0 | 5.9% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 4.8% | 0 |
| rdm.Dueler 0.4x | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.4 | 82.2 | 14 / 35 | 4223 |
| 2 | 2 | 65.0 | 78.4 | 9 / 35 | 3936 |
| 3 | 2 | 65.9 | 81.3 | 14 / 35 | 3940 |
| 4 | 2 | 63.1 | 74.0 | 8 / 35 | 3761 |
| 5 | 1 | 66.3 | 83.2 | 13 / 35 | 3902 |
| 6 | 2 | 65.4 | 80.6 | 11 / 35 | 3909 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 55 | 31% |
| kc.micro.Figment 1.0 | 38 | 87% |
| pedersen.Grishnakh 1.0 | 12 | 50% |
| mc2.enemy.Original 0.9 | 9 | 56% |
| yagami.Tidus 0.11 | 9 | 78% |
| dft.Calliope 5.6 | 1 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 892. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 63 | 44% | 84 |
| kc.micro.Figment 1.0 | 26 | 18% | 55 |
| mc2.enemy.Original 0.9 | 17 | 12% | 23 |
| pedersen.Grishnakh 1.0 | 11 | 8% | 18 |
| yagami.Tidus 0.11 | 11 | 8% | 16 |
| step.nanoPri 1.0 | 6 | 4% | 6 |
| robar.nano.Assertive_Melee 0.2 | 4 | 3% | 4 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |
| dft.Calliope 5.6 | 1 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 156299 melee ticks, 44668 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 33 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 0.

Targeting waves (209 rounds): 50606 sent, 45928 reached their opponent, 6351 virtual hits (13.8% of those reached).

## Melee bench: F10

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 337 over 6 battles (56.2 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 95.3 | 163 / 210 | 1.42 | 21.0% | 36274 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 21.0% | 163 |
| DTF.Kludgy 1.2b | 2.2 | 14.0% | 16 |
| ejb.Polaris 1.0.1 | 3.3 | 12.5% | 14 |
| ne.Chimera 1.2 | 3.8 | 12.5% | 7 |
| vStar.RAFzilla 2.15 | 5.3 | 9.9% | 3 |
| tvv.micro.Antares 1.1.1 | 5.3 | 10.1% | 4 |
| sam.Samspin 1.0 | 7.5 | 6.0% | 1 |
| kurios.DOSexe .9b | 7.8 | 5.7% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.7 | 4.9% | 0 |
| donjezza.Muncho 1.0 | 10.0 | 3.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 95.2 | 28 / 35 | 6454 |
| 2 | 1 | 71.1 | 94.0 | 25 / 35 | 6090 |
| 3 | 1 | 72.2 | 97.1 | 31 / 35 | 5866 |
| 4 | 1 | 71.0 | 94.9 | 26 / 35 | 5755 |
| 5 | 1 | 72.0 | 95.9 | 27 / 35 | 6346 |
| 6 | 1 | 71.0 | 94.6 | 26 / 35 | 5763 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 64 | 78% |
| ejb.Polaris 1.0.1 | 48 | 90% |
| ne.Chimera 1.2 | 37 | 86% |
| tvv.micro.Antares 1.1.1 | 18 | 94% |
| vStar.RAFzilla 2.15 | 14 | 86% |
| kurios.DOSexe .9b | 6 | 100% |
| sam.Samspin 1.0 | 3 | 100% |
| donjezza.Muncho 1.0 | 2 | 0% |

Hadur died in 52 of 210 rounds, at a mean tick of 1057. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 23 | 44% | 64 |
| ne.Chimera 1.2 | 10 | 19% | 35 |
| ejb.Polaris 1.0.1 | 9 | 17% | 61 |
| vStar.RAFzilla 2.15 | 3 | 6% | 18 |
| donjezza.Muncho 1.0 | 2 | 4% | 2 |
| kurios.DOSexe .9b | 0 | 0% | 12 |
| tvv.micro.Antares 1.1.1 | 0 | 0% | 11 |
| sam.Samspin 1.0 | 0 | 0% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 147835 melee ticks, 65473 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 57 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 48145 sent, 43357 reached their opponent, 8297 virtual hits (19.1% of those reached).

## Melee bench: F11

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 270 over 6 battles (45.0 per battle, most in one battle 109). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 82.2 | 73 / 210 | 2.60 | 16.6% | 23601 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.2 | 16.6% | 77 |
| hadur117.Hadur 3.21 | 1.8 | 16.6% | 73 |
| cx.mini.Nimrod 0.55 | 3.0 | 13.2% | 27 |
| djc.DynaBot 0.1.1 | 4.0 | 11.3% | 13 |
| rdt199.Warlord 0.73 | 5.3 | 9.1% | 7 |
| br2.MobyDickBot 1.6 | 6.0 | 8.3% | 9 |
| uji.YellohFellah 1.0 | 7.2 | 7.7% | 4 |
| KiraNL.Chupacabra 0.4 | 7.5 | 7.2% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.6% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 79.4 | 12 / 35 | 3579 |
| 2 | 1 | 67.2 | 86.7 | 16 / 35 | 4142 |
| 3 | 2 | 64.6 | 80.0 | 11 / 35 | 4010 |
| 4 | 2 | 65.2 | 81.3 | 11 / 35 | 4036 |
| 5 | 2 | 65.3 | 80.3 | 13 / 35 | 3995 |
| 6 | 2 | 65.9 | 85.7 | 10 / 35 | 3839 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 56 | 52% |
| djc.DynaBot 0.1.1 | 23 | 65% |
| cx.mini.Nimrod 0.55 | 20 | 50% |
| rdt199.Warlord 0.73 | 12 | 75% |
| br2.MobyDickBot 1.6 | 7 | 29% |
| uji.YellohFellah 1.0 | 6 | 83% |
| KiraNL.Chupacabra 0.4 | 3 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 54 | 39% | 83 |
| cx.mini.Nimrod 0.55 | 32 | 23% | 39 |
| djc.DynaBot 0.1.1 | 12 | 9% | 26 |
| uji.YellohFellah 1.0 | 10 | 7% | 15 |
| rdt199.Warlord 0.73 | 9 | 6% | 20 |
| br2.MobyDickBot 1.6 | 9 | 6% | 9 |
| KiraNL.Chupacabra 0.4 | 7 | 5% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 3% | 5 |
| stelo.MirrorNano 1.3 | 1 | 1% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 154827 melee ticks, 45697 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 33 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 0.

Targeting waves (209 rounds): 51249 sent, 46207 reached their opponent, 6323 virtual hits (13.7% of those reached).

## Melee bench: F12

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 324 over 6 battles (54.0 per battle, most in one battle 102). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 85.4 | 121 / 210 | 2.31 | 18.0% | 24449 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 18.0% | 121 |
| bts.wiki.RipCurl 0.9b | 2.2 | 14.0% | 29 |
| darkcanuck.Leon 1.01 | 3.2 | 13.0% | 22 |
| nat.PallasHawk 1.0 | 3.7 | 12.8% | 26 |
| brainfade.melee.Genghis 0.36 | 5.2 | 10.4% | 10 |
| jrm.Test0 1.0 | 5.8 | 8.6% | 2 |
| cs.sheldor.Talon 1.1 | 7.2 | 6.8% | 0 |
| jp.Perpy 16.0 | 8.2 | 6.0% | 0 |
| jaybot.bots.Oddball 4.0 | 9.0 | 5.3% | 0 |
| stuff.Vlad 0.1 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 81.6 | 18 / 35 | 3913 |
| 2 | 1 | 67.1 | 85.1 | 20 / 35 | 4009 |
| 3 | 1 | 67.4 | 86.3 | 18 / 35 | 4125 |
| 4 | 1 | 67.6 | 86.3 | 19 / 35 | 4082 |
| 5 | 1 | 67.4 | 85.4 | 20 / 35 | 4040 |
| 6 | 1 | 68.9 | 87.6 | 26 / 35 | 4280 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 46 | 89% |
| bts.wiki.RipCurl 0.9b | 41 | 80% |
| nat.PallasHawk 1.0 | 35 | 71% |
| brainfade.melee.Genghis 0.36 | 18 | 67% |
| jaybot.bots.Oddball 4.0 | 4 | 100% |
| jrm.Test0 1.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| jp.Perpy 16.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 658. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 23 | 25% | 53 |
| nat.PallasHawk 1.0 | 21 | 23% | 46 |
| darkcanuck.Leon 1.01 | 15 | 16% | 62 |
| brainfade.melee.Genghis 0.36 | 13 | 14% | 23 |
| jrm.Test0 1.0 | 8 | 9% | 11 |
| cs.sheldor.Talon 1.1 | 4 | 4% | 7 |
| jp.Perpy 16.0 | 4 | 4% | 5 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 133449 melee ticks, 36845 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 56 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 2.

Targeting waves (209 rounds): 45608 sent, 40500 reached their opponent, 6598 virtual hits (16.3% of those reached).

## Melee bench: F13

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 299 over 6 battles (49.8 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 80.8 | 61 / 210 | 2.72 | 15.9% | 25602 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.5 | 16.4% | 39 |
| mn.Combat 3.25.0 | 2.2 | 16.3% | 81 |
| hadur117.Hadur 3.21 | 2.3 | 15.9% | 61 |
| shinh.Entangled 0.3 | 4.3 | 11.9% | 15 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.8% | 15 |
| apc.Colossus2 0.17 | 6.0 | 8.3% | 0 |
| stelo.Wang 1.0 | 7.2 | 6.7% | 0 |
| maribo.FollowFire 1 | 8.2 | 5.0% | 0 |
| ayk.WallHugger 1.0 | 8.7 | 4.4% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.8 | 81.6 | 7 / 35 | 4351 |
| 2 | 2 | 65.9 | 83.8 | 11 / 35 | 4184 |
| 3 | 3 | 64.1 | 78.1 | 10 / 35 | 4193 |
| 4 | 3 | 64.4 | 80.0 | 7 / 35 | 3980 |
| 5 | 3 | 65.4 | 79.4 | 11 / 35 | 4248 |
| 6 | 1 | 66.9 | 82.2 | 15 / 35 | 4646 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 49 | 69% |
| mn.Combat 3.25.0 | 49 | 29% |
| shinh.Entangled 0.3 | 12 | 67% |
| gh.micro.Gruweltje 0.7 | 9 | 44% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 866. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 49 | 32% | 65 |
| ags.Glacier 0.2.11 | 45 | 30% | 76 |
| shinh.Entangled 0.3 | 18 | 12% | 23 |
| gh.micro.Gruweltje 0.7 | 16 | 11% | 22 |
| maribo.FollowFire 1 | 8 | 5% | 8 |
| apc.Colossus2 0.17 | 6 | 4% | 7 |
| stelo.Wang 1.0 | 5 | 3% | 6 |
| ayk.WallHugger 1.0 | 2 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 146758 melee ticks, 44010 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 89 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 89 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 43215 sent, 38085 reached their opponent, 6074 virtual hits (15.9% of those reached).

## Melee bench: F14

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 226 over 6 battles (37.7 per battle, most in one battle 52). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 94.6 | 150 / 210 | 1.49 | 20.7% | 34880 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 20.7% | 150 |
| catcat20.shape.Theta 0.018 | 2.5 | 14.9% | 48 |
| simonton.micro.Sprout 1.1.3 | 2.5 | 14.8% | 5 |
| sanyi.mikrobi.Roberto 1.0 | 4.0 | 10.0% | 5 |
| Lo_Ian.Gandalf_V4 4.0 | 5.3 | 8.9% | 0 |
| co.edu.usb.rc.LidisTron 1.0 | 5.7 | 8.8% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.4% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.8 | 7.1% | 0 |
| pa.Improved 1.0 | 9.0 | 5.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 93.7 | 25 / 35 | 5758 |
| 2 | 1 | 71.2 | 92.7 | 26 / 35 | 5608 |
| 3 | 1 | 71.7 | 93.7 | 22 / 35 | 5936 |
| 4 | 1 | 72.4 | 96.8 | 29 / 35 | 5934 |
| 5 | 1 | 71.5 | 96.5 | 27 / 35 | 5755 |
| 6 | 1 | 71.2 | 94.3 | 21 / 35 | 5889 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.shape.Theta 0.018 | 94 | 64% |
| simonton.micro.Sprout 1.1.3 | 70 | 96% |
| sanyi.mikrobi.Roberto 1.0 | 13 | 77% |
| co.edu.usb.rc.LidisTron 1.0 | 5 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 5 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 67% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 989. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 41 | 68% | 98 |
| simonton.micro.Sprout 1.1.3 | 9 | 15% | 70 |
| sanyi.mikrobi.Roberto 1.0 | 5 | 8% | 22 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 3% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 2 | 3% | 4 |
| pa.Improved 1.0 | 1 | 2% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 0 | 0% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 3 |

Posture (Hadur's M records, 209 rounds): 148275 melee ticks, 64724 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 24 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 0.

Targeting waves (209 rounds): 46112 sent, 41380 reached their opponent, 9447 virtual hits (22.8% of those reached).

## Melee bench: F15

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 174 over 6 battles (29.0 per battle, most in one battle 54). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 88.5 | 127 / 210 | 2.04 | 19.6% | 32496 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 19.6% | 127 |
| kawigi.micro.Shiz 1.1 | 2.2 | 14.0% | 14 |
| emp.Yngwie 1.11 | 3.3 | 12.9% | 49 |
| mld.DustBunny 3.8 | 3.7 | 12.3% | 5 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.9% | 3 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.2% | 10 |
| lambdaxy.TBot 0.1 | 7.3 | 6.5% | 0 |
| Grystrion.TrackerWO 1.0 | 7.7 | 6.6% | 1 |
| divineomega.TrialBot 0.003 | 9.5 | 3.9% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 89.2 | 22 / 35 | 5808 |
| 2 | 1 | 69.0 | 87.9 | 21 / 35 | 5233 |
| 3 | 1 | 70.8 | 91.7 | 26 / 35 | 5381 |
| 4 | 1 | 68.8 | 84.4 | 18 / 35 | 5338 |
| 5 | 1 | 69.7 | 88.9 | 19 / 35 | 5457 |
| 6 | 1 | 69.9 | 88.6 | 21 / 35 | 5279 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 53 | 57% |
| kawigi.micro.Shiz 1.1 | 45 | 98% |
| mld.DustBunny 3.8 | 26 | 96% |
| kawigi.robot.Girl 1.2 | 14 | 79% |
| cb.nano.Insomnia 1.0 | 12 | 100% |
| Grystrion.TrackerWO 1.0 | 3 | 100% |
| divineomega.TrialBot 0.003 | 2 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 949. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 45 | 54% | 83 |
| mld.DustBunny 3.8 | 12 | 14% | 41 |
| kawigi.robot.Girl 1.2 | 9 | 11% | 18 |
| cb.nano.Insomnia 1.0 | 7 | 8% | 12 |
| kawigi.micro.Shiz 1.1 | 6 | 7% | 40 |
| Grystrion.TrackerWO 1.0 | 3 | 4% | 4 |
| divineomega.TrialBot 0.003 | 1 | 1% | 5 |
| lambdaxy.TBot 0.1 | 0 | 0% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 164880 melee ticks, 49207 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 80 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 54051 sent, 49101 reached their opponent, 7993 virtual hits (16.3% of those reached).

## Melee bench: F16

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 481 over 6 battles (80.2 per battle, most in one battle 151). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 89.8 | 128 / 210 | 1.92 | 20.2% | 34991 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 20.2% | 128 |
| gh.Griezel 0.5.2 | 2.0 | 16.1% | 46 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.8% | 5 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.9% | 26 |
| bvh.fnr.Fenrir 0.36l | 4.8 | 9.6% | 4 |
| tvv.nano.Polaris 1.2 | 6.0 | 8.6% | 3 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 6.9% | 0 |
| repositorio.NanoStep 1.0 | 8.3 | 5.1% | 0 |
| asd.Cthulhu 1.3 | 9.0 | 4.8% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 88.3 | 21 / 35 | 5740 |
| 2 | 1 | 71.8 | 93.0 | 21 / 35 | 6355 |
| 3 | 1 | 70.8 | 88.6 | 21 / 35 | 5873 |
| 4 | 1 | 71.2 | 91.4 | 23 / 35 | 6042 |
| 5 | 1 | 69.8 | 87.3 | 22 / 35 | 5533 |
| 6 | 1 | 70.2 | 90.2 | 20 / 35 | 5448 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 95 | 71% |
| techdude.forest.FlamingForest 1.1 | 37 | 62% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 24 | 92% |
| bvh.fnr.Fenrir 0.36l | 7 | 57% |
| tvv.nano.Polaris 1.2 | 5 | 100% |
| stelo.IntrinsicVolatility 1.4 | 4 | 100% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 1231. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 36 | 40% | 105 |
| techdude.forest.FlamingForest 1.1 | 19 | 21% | 45 |
| bvh.fnr.Fenrir 0.36l | 11 | 12% | 18 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 9 | 10% | 20 |
| divineomega.DivineBot 1.9.4.5 | 3 | 3% | 8 |
| stelo.IntrinsicVolatility 1.4 | 2 | 2% | 8 |
| asd.Cthulhu 1.3 | 1 | 1% | 2 |
| repositorio.NanoStep 1.0 | 1 | 1% | 1 |
| tvv.nano.Polaris 1.2 | 0 | 0% | 3 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 182404 melee ticks, 71267 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 49 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 58088 sent, 53377 reached their opponent, 9008 virtual hits (16.9% of those reached).

## Melee bench: F17

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 394 over 6 battles (65.7 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 90.1 | 117 / 210 | 1.90 | 20.1% | 36113 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 20.1% | 117 |
| et.Predator 1.8 | 2.3 | 13.8% | 20 |
| oog.melee.Mercutio 1.0 | 2.7 | 13.1% | 30 |
| cx.BlestPain 1.41 | 4.3 | 11.8% | 34 |
| ahf.NanoAndrew .4 | 4.8 | 10.4% | 5 |
| maribo.melee.BMV 0.1 | 6.3 | 8.9% | 4 |
| nic.Nicator 2.4 | 6.5 | 8.6% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.0 | 5.9% | 0 |
| tex.Longbot 0.4 | 9.0 | 5.1% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 89.8 | 20 / 35 | 5823 |
| 2 | 1 | 69.3 | 85.4 | 18 / 35 | 5636 |
| 3 | 1 | 70.5 | 91.4 | 21 / 35 | 5831 |
| 4 | 1 | 72.5 | 93.3 | 24 / 35 | 6733 |
| 5 | 1 | 70.3 | 89.8 | 16 / 35 | 6004 |
| 6 | 1 | 70.3 | 90.5 | 18 / 35 | 6086 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 65 | 80% |
| oog.melee.Mercutio 1.0 | 47 | 64% |
| cx.BlestPain 1.41 | 30 | 30% |
| ahf.NanoAndrew .4 | 13 | 100% |
| maribo.melee.BMV 0.1 | 5 | 80% |
| nic.Nicator 2.4 | 4 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 4 | 100% |
| tex.Longbot 0.4 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 1154. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 29 | 31% | 44 |
| oog.melee.Mercutio 1.0 | 24 | 25% | 51 |
| et.Predator 1.8 | 22 | 23% | 68 |
| ahf.NanoAndrew .4 | 8 | 8% | 23 |
| maribo.melee.BMV 0.1 | 7 | 7% | 8 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 7 |
| nic.Nicator 2.4 | 1 | 1% | 7 |
| tex.Longbot 0.4 | 1 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 210 rounds): 170881 melee ticks, 69046 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 126 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (210 rounds): longest scan gap while four or more were alive 126 ticks (210 rounds over 8); rounds whose longest gap at any count was over 8: 210; robots dropped as dead without a death event: 0.

Targeting waves (210 rounds): 55984 sent, 51216 reached their opponent, 10676 virtual hits (20.8% of those reached).

## Melee bench: F18

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 339 over 6 battles (56.5 per battle, most in one battle 97). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 89.9 | 138 / 210 | 1.90 | 19.7% | 29895 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 19.7% | 138 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.2% | 25 |
| agd.Mooserwirt2 2.7 | 3.3 | 12.1% | 20 |
| uji.DBH 1.1 | 3.5 | 11.5% | 9 |
| sigterm.Sigterm 1.0 | 5.3 | 9.2% | 12 |
| spinnercat.Robovirus 2.718 | 6.0 | 8.7% | 4 |
| ratosh.Nobo 0.21 | 7.5 | 7.7% | 2 |
| kawigi.mini.Fhqwhgads 1.1 | 7.7 | 7.5% | 1 |
| stelo.WangRobot 1.0 | 9.0 | 5.5% | 0 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.6 | 20 / 35 | 4726 |
| 2 | 1 | 70.1 | 92.4 | 25 / 35 | 4953 |
| 3 | 1 | 67.3 | 82.9 | 20 / 35 | 4641 |
| 4 | 1 | 70.2 | 91.7 | 25 / 35 | 5146 |
| 5 | 1 | 71.6 | 95.6 | 27 / 35 | 5468 |
| 6 | 1 | 69.4 | 89.5 | 21 / 35 | 4961 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 57 | 75% |
| uji.DBH 1.1 | 39 | 92% |
| agd.Mooserwirt2 2.7 | 31 | 81% |
| sigterm.Sigterm 1.0 | 20 | 65% |
| spinnercat.Robovirus 2.718 | 10 | 60% |
| stelo.WangRobot 1.0 | 6 | 100% |
| ratosh.Nobo 0.21 | 5 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 791. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 26 | 34% | 76 |
| agd.Mooserwirt2 2.7 | 13 | 17% | 37 |
| sigterm.Sigterm 1.0 | 12 | 16% | 20 |
| uji.DBH 1.1 | 10 | 13% | 31 |
| spinnercat.Robovirus 2.718 | 7 | 9% | 19 |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 3% | 7 |
| ratosh.Nobo 0.21 | 2 | 3% | 7 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 1% | 6 |
| stelo.WangRobot 1.0 | 0 | 0% | 5 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 142855 melee ticks, 47630 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 158 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 158 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 47929 sent, 43029 reached their opponent, 9293 virtual hits (21.6% of those reached).

## Melee bench: F19

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 229 over 6 battles (38.2 per battle, most in one battle 59). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.6 | 98.0 | 194 / 210 | 1.18 | 22.5% | 37975 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 22.5% | 194 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.7% | 12 |
| mld.Infinity 2.2 | 3.8 | 11.7% | 1 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.3% | 1 |
| erdnis.Rover 0.3 | 4.2 | 11.0% | 1 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.3% | 1 |
| mbh.Mbh 0.1 | 6.8 | 7.8% | 0 |
| pac.ABC 2.1 | 8.0 | 6.5% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.1% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.0 | 99.4 | 33 / 35 | 6538 |
| 2 | 1 | 73.1 | 97.5 | 32 / 35 | 5974 |
| 3 | 1 | 72.9 | 96.5 | 30 / 35 | 6198 |
| 4 | 1 | 73.3 | 96.8 | 32 / 35 | 6326 |
| 5 | 1 | 74.4 | 99.7 | 34 / 35 | 6682 |
| 6 | 1 | 73.8 | 98.4 | 33 / 35 | 6257 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 118 | 95% |
| krillr.mini.JointStrike 2.0.0 | 28 | 100% |
| mld.Infinity 2.2 | 21 | 100% |
| erdnis.Rover 0.3 | 19 | 95% |
| pac.ABC 2.1 | 7 | 100% |
| patson.PatsonTestBot 1.0 | 5 | 80% |
| mbh.Mbh 0.1 | 3 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 20 of 210 rounds, at a mean tick of 857. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 7 | 35% | 69 |
| patson.PatsonTestBot 1.0 | 5 | 25% | 23 |
| krillr.mini.JointStrike 2.0.0 | 3 | 15% | 36 |
| erdnis.Rover 0.3 | 1 | 5% | 24 |
| mld.Infinity 2.2 | 0 | 0% | 30 |
| mbh.Mbh 0.1 | 0 | 0% | 13 |
| pbg.R2D2 1.0 | 0 | 0% | 5 |
| pac.ABC 2.1 | 0 | 0% | 5 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 124212 melee ticks, 46931 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 42 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 42742 sent, 37968 reached their opponent, 8939 virtual hits (23.5% of those reached).

## Melee bench: F20

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 204 over 6 battles (34.0 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 92.2 | 126 / 210 | 1.70 | 20.5% | 35376 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 20.5% | 126 |
| trm.Wrekt 1.1.6.f | 2.2 | 15.3% | 32 |
| catcat20.Rabbit 0.001 | 2.8 | 14.0% | 44 |
| nz.jdc.nano.GridFu 1.0 | 4.3 | 10.3% | 1 |
| fwb.Nine 1.0.1 | 4.7 | 10.4% | 6 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.0% | 1 |
| bayen.nut.Squirrel 1.615 | 7.5 | 6.4% | 0 |
| ntc.ControlledChaos 1.1.4 | 7.8 | 5.9% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.7 | 5.6% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 92.7 | 24 / 35 | 6308 |
| 2 | 1 | 70.0 | 93.3 | 18 / 35 | 5290 |
| 3 | 1 | 70.3 | 89.8 | 20 / 35 | 5629 |
| 4 | 1 | 69.9 | 88.6 | 19 / 35 | 5604 |
| 5 | 1 | 72.0 | 94.0 | 22 / 35 | 6256 |
| 6 | 1 | 72.0 | 94.6 | 23 / 35 | 6289 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Rabbit 0.001 | 66 | 53% |
| trm.Wrekt 1.1.6.f | 66 | 74% |
| fwb.Nine 1.0.1 | 34 | 97% |
| bayen.nut.Squirrel 1.615 | 4 | 100% |
| nz.jdc.nano.GridFu 1.0 | 4 | 75% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |
| m3thos.mini.Eva01 0.5.5 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 1067. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Rabbit 0.001 | 41 | 49% | 89 |
| trm.Wrekt 1.1.6.f | 34 | 40% | 78 |
| fwb.Nine 1.0.1 | 3 | 4% | 16 |
| bayen.nut.Squirrel 1.615 | 2 | 2% | 8 |
| nz.jdc.nano.GridFu 1.0 | 2 | 2% | 7 |
| ntc.ControlledChaos 1.1.4 | 2 | 2% | 3 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 4 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 209 rounds): 168789 melee ticks, 70783 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 39 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 0.

Targeting waves (209 rounds): 52165 sent, 47285 reached their opponent, 10229 virtual hits (21.6% of those reached).

## Melee bench: F21

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 230 over 6 battles (38.3 per battle, most in one battle 87). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 94.2 | 134 / 210 | 1.52 | 21.2% | 37475 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 21.2% | 134 |
| eem.EvBot v4.6.16 | 2.0 | 16.5% | 61 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.0% | 12 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.5% | 1 |
| eld.Hmm 1.0 | 5.2 | 7.9% | 2 |
| oa.weak.BotherBot 0.1 | 5.8 | 7.6% | 1 |
| fire219.CatBot 1.0 | 7.8 | 5.8% | 0 |
| el.JumpShoot 0.2 | 8.2 | 5.5% | 0 |
| PSW.Relentless 0.1 | 8.5 | 5.3% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 95.2 | 23 / 35 | 6315 |
| 2 | 1 | 72.3 | 94.9 | 23 / 35 | 6409 |
| 3 | 1 | 72.5 | 94.6 | 25 / 35 | 6319 |
| 4 | 1 | 71.8 | 92.7 | 19 / 35 | 6543 |
| 5 | 1 | 71.4 | 93.0 | 23 / 35 | 5872 |
| 6 | 1 | 71.8 | 94.9 | 21 / 35 | 6017 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 136 | 65% |
| dummy.mini.Scimitar 1.01 | 22 | 77% |
| cf.RiO.RiOx 4.2.1 | 22 | 95% |
| eld.Hmm 1.0 | 6 | 67% |
| el.JumpShoot 0.2 | 1 | 100% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 1342. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 52 | 66% | 115 |
| dummy.mini.Scimitar 1.01 | 13 | 16% | 46 |
| cf.RiO.RiOx 4.2.1 | 7 | 9% | 25 |
| eld.Hmm 1.0 | 2 | 3% | 17 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 4 |
| PSW.Relentless 0.1 | 1 | 1% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 177242 melee ticks, 86751 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 87 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 87 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 51972 sent, 47269 reached their opponent, 8152 virtual hits (17.2% of those reached).

## Melee bench: F23

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 165 over 6 battles (27.5 per battle, most in one battle 95). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.6 | 96.3 | 173 / 210 | 1.33 | 22.2% | 38074 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 22.2% | 173 |
| pe.SandboxLump 1.52 | 2.0 | 16.5% | 29 |
| cre.Karolos 0.32 | 3.0 | 13.9% | 4 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.3% | 3 |
| stelo.RamTrackSurfer 1.2 | 5.8 | 8.9% | 0 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.0 | 8.5% | 1 |
| cw.megas.Blade 0.8 | 6.2 | 8.4% | 0 |
| sample.Walls 1.0 | 7.8 | 7.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.3 | 2.3% | 0 |
| rrh.Iwillfindyou 2.0 | 9.7 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.6 | 95.2 | 27 / 35 | 6638 |
| 2 | 1 | 72.8 | 94.9 | 28 / 35 | 6283 |
| 3 | 1 | 73.5 | 96.5 | 29 / 35 | 6141 |
| 4 | 1 | 73.6 | 95.9 | 28 / 35 | 6193 |
| 5 | 1 | 73.8 | 98.1 | 32 / 35 | 6541 |
| 6 | 1 | 74.1 | 97.5 | 29 / 35 | 6278 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 104 | 87% |
| cre.Karolos 0.32 | 49 | 98% |
| stelo.RamTrackSurfer 1.2 | 13 | 100% |
| stelo.AreaTargetingBot 1.1 | 10 | 90% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 86% |
| cw.megas.Blade 0.8 | 4 | 100% |
| sample.Walls 1.0 | 3 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 20 | 53% | 101 |
| cre.Karolos 0.32 | 12 | 32% | 52 |
| stelo.AreaTargetingBot 1.1 | 4 | 11% | 11 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 3% | 12 |
| stelo.RamTrackSurfer 1.2 | 0 | 0% | 21 |
| cw.megas.Blade 0.8 | 0 | 0% | 5 |
| sample.Walls 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 124699 melee ticks, 53386 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 39 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 39054 sent, 34295 reached their opponent, 9967 virtual hits (29.1% of those reached).

## Melee bench: F24

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 106 over 6 battles (17.7 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 83.5 | 90 / 210 | 2.49 | 17.4% | 26128 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 17.4% | 90 |
| rz.GlowBlowMelee 1.4 | 2.2 | 14.6% | 49 |
| florent.XSeries.X2 0.12 | 3.2 | 13.2% | 25 |
| davidalves.Phoenix 0.54 | 4.0 | 12.5% | 25 |
| pedersen.Ugluk 1.1.1 | 5.0 | 11.0% | 13 |
| oog.melee.Corsair 1.0 | 5.7 | 9.3% | 3 |
| stelo.SoJNanoMelee 1.1 | 7.2 | 6.4% | 2 |
| lunchie.Lunchbox 0.93 | 8.3 | 5.7% | 3 |
| as.FrankTheTank 1.3 | 8.8 | 5.4% | 0 |
| evd.X1 0.01 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 82.5 | 13 / 35 | 4041 |
| 2 | 1 | 67.0 | 84.4 | 14 / 35 | 4486 |
| 3 | 1 | 68.1 | 87.6 | 19 / 35 | 4311 |
| 4 | 1 | 65.6 | 80.0 | 12 / 35 | 4260 |
| 5 | 1 | 68.6 | 88.3 | 19 / 35 | 4835 |
| 6 | 1 | 65.1 | 78.1 | 13 / 35 | 4195 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 53 | 57% |
| davidalves.Phoenix 0.54 | 36 | 67% |
| florent.XSeries.X2 0.12 | 26 | 62% |
| pedersen.Ugluk 1.1.1 | 15 | 73% |
| oog.melee.Corsair 1.0 | 4 | 75% |
| as.FrankTheTank 1.3 | 3 | 100% |
| lunchie.Lunchbox 0.93 | 3 | 33% |
| stelo.SoJNanoMelee 1.1 | 2 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 38 | 31% | 64 |
| florent.XSeries.X2 0.12 | 31 | 26% | 54 |
| davidalves.Phoenix 0.54 | 21 | 17% | 46 |
| pedersen.Ugluk 1.1.1 | 13 | 11% | 18 |
| oog.melee.Corsair 1.0 | 8 | 7% | 12 |
| lunchie.Lunchbox 0.93 | 4 | 3% | 6 |
| as.FrankTheTank 1.3 | 3 | 2% | 4 |
| stelo.SoJNanoMelee 1.1 | 2 | 2% | 5 |
| evd.X1 0.01 | 1 | 1% | 1 |

Posture (Hadur's M records, 204 rounds): 136305 melee ticks, 43176 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 65 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 45186 sent, 40346 reached their opponent, 7380 virtual hits (18.3% of those reached).

## Melee bench: F25

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 98 over 6 battles (16.3 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 88.4 | 150 / 210 | 2.05 | 19.2% | 25958 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 19.2% | 150 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 13.0% | 8 |
| voidious.mini.BrokenSword 2.0.3 | 2.8 | 12.9% | 13 |
| jdw.Hurricane 1.4 | 3.3 | 12.4% | 19 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.2% | 6 |
| ds.Oo 2.2 | 5.8 | 8.8% | 8 |
| awesomeness.Elite 1.0 | 7.0 | 7.5% | 2 |
| adt.Ar2 1.1 | 8.2 | 6.6% | 1 |
| gjr.Cephalosporin 0.1 | 8.7 | 6.0% | 3 |
| amk.ChumbaMini 0.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 91.7 | 26 / 35 | 4320 |
| 2 | 1 | 67.7 | 86.0 | 24 / 35 | 3967 |
| 3 | 1 | 69.7 | 89.8 | 24 / 35 | 4600 |
| 4 | 1 | 68.3 | 85.7 | 25 / 35 | 4225 |
| 5 | 1 | 69.2 | 89.2 | 25 / 35 | 4407 |
| 6 | 1 | 69.1 | 87.6 | 26 / 35 | 4439 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 52 | 96% |
| voidious.mini.BrokenSword 2.0.3 | 40 | 95% |
| jdw.Hurricane 1.4 | 28 | 93% |
| ds.Oo 2.2 | 18 | 89% |
| gre.svman4.Morfeas 1.4.1 | 8 | 88% |
| awesomeness.Elite 1.0 | 8 | 100% |
| gjr.Cephalosporin 0.1 | 3 | 100% |
| adt.Ar2 1.1 | 2 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 592. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 16 | 27% | 53 |
| voidious.mini.BrokenSword 2.0.3 | 13 | 22% | 46 |
| jdw.Hurricane 1.4 | 10 | 17% | 35 |
| ds.Oo 2.2 | 9 | 15% | 24 |
| adt.Ar2 1.1 | 5 | 8% | 12 |
| awesomeness.Elite 1.0 | 4 | 7% | 13 |
| gre.svman4.Morfeas 1.4.1 | 2 | 3% | 12 |
| amk.ChumbaMini 0.2 | 1 | 2% | 6 |
| gjr.Cephalosporin 0.1 | 0 | 0% | 8 |

Posture (Hadur's M records, 203 rounds): 123866 melee ticks, 31678 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 57 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 44082 sent, 39334 reached their opponent, 6598 virtual hits (16.8% of those reached).

## Melee bench: F26

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 107 over 6 battles (17.8 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 94.0 | 149 / 210 | 1.54 | 21.5% | 40138 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 21.5% | 149 |
| ak.Fermat 2.0 | 2.2 | 14.5% | 27 |
| shu.nitro.LENIN .T34 | 3.3 | 12.5% | 10 |
| lrem.Spectre 0.4.4 | 3.8 | 12.2% | 19 |
| js.PinBall 1.6 | 4.8 | 10.4% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 5.8 | 9.6% | 3 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 7.9% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.4% | 0 |
| sample.SpinBot 1.0 | 9.0 | 3.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 93.3 | 22 / 35 | 6404 |
| 2 | 1 | 72.0 | 92.1 | 22 / 35 | 6697 |
| 3 | 1 | 73.2 | 94.3 | 29 / 35 | 7033 |
| 4 | 1 | 73.8 | 97.1 | 32 / 35 | 6807 |
| 5 | 1 | 72.3 | 93.3 | 20 / 35 | 6796 |
| 6 | 1 | 72.1 | 94.0 | 24 / 35 | 6401 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 69 | 71% |
| shu.nitro.LENIN .T34 | 54 | 91% |
| lrem.Spectre 0.4.4 | 38 | 82% |
| js.PinBall 1.6 | 9 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 7 | 86% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 100% |
| gh.mini.GrubbmOne 1.0 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 1038. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 27 | 44% | 71 |
| shu.nitro.LENIN .T34 | 18 | 29% | 67 |
| lrem.Spectre 0.4.4 | 12 | 19% | 37 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 6% | 12 |
| js.PinBall 1.6 | 1 | 2% | 16 |
| fullsail.LaxativeTeaTwo 1.0 | 0 | 0% | 4 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 201 rounds): 158201 melee ticks, 51383 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 32 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 50658 sent, 46034 reached their opponent, 11035 virtual hits (24.0% of those reached).

## Melee bench: F27

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 98 over 6 battles (16.3 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 83.7 | 143 / 210 | 2.47 | 19.1% | 31988 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.2 | 19.1% | 143 |
| EH.Eagle 1.0.6 | 2.7 | 11.9% | 6 |
| mk.Alpha 0.2.1 | 2.8 | 12.8% | 35 |
| wee.Gem 1.8.4 | 5.0 | 9.5% | 11 |
| sheldor.melee.nano.TestMelee 0.1 | 5.2 | 9.8% | 8 |
| techdude.kombat.FlamingKombat 1.5 | 6.0 | 9.0% | 2 |
| joe.ADinosaur 1.0 | 6.7 | 8.5% | 2 |
| throxbot.ThroxBot 0.1 | 7.3 | 7.8% | 4 |
| caimano.Furia_Ceca 0.22 | 8.3 | 7.2% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 60.3 | 11 / 35 | 5109 |
| 2 | 1 | 67.6 | 84.8 | 25 / 35 | 4587 |
| 3 | 1 | 72.7 | 96.8 | 31 / 35 | 5998 |
| 4 | 1 | 71.8 | 96.8 | 30 / 35 | 5696 |
| 5 | 1 | 63.6 | 65.7 | 14 / 35 | 5150 |
| 6 | 1 | 72.0 | 97.5 | 32 / 35 | 5448 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 69 | 83% |
| EH.Eagle 1.0.6 | 40 | 100% |
| throxbot.ThroxBot 0.1 | 16 | 94% |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 92% |
| wee.Gem 1.8.4 | 10 | 90% |
| techdude.kombat.FlamingKombat 1.5 | 6 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 527. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 21 | 31% | 65 |
| cs.Grudge 1.0 | 16 | 24% | 15 |
| wee.Gem 1.8.4 | 7 | 10% | 18 |
| EH.Eagle 1.0.6 | 6 | 9% | 46 |
| joe.ADinosaur 1.0 | 6 | 9% | 13 |
| throxbot.ThroxBot 0.1 | 4 | 6% | 17 |
| caimano.Furia_Ceca 0.22 | 4 | 6% | 5 |
| sheldor.melee.nano.TestMelee 0.1 | 3 | 4% | 19 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 1% | 11 |

Posture (Hadur's M records, 200 rounds): 118585 melee ticks, 32446 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 33 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 39480 sent, 34809 reached their opponent, 9045 virtual hits (26.0% of those reached).

## Melee bench: F28

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 117 over 6 battles (19.5 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 91.5 | 147 / 210 | 1.76 | 19.3% | 25665 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 19.3% | 147 |
| kid.test.NightFox .2 | 2.0 | 14.7% | 25 |
| uji.Antique 1.0 | 3.5 | 11.7% | 16 |
| qohnil.blot.BlotBot 3.61 | 3.8 | 10.8% | 12 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.2% | 1 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.0% | 5 |
| ahr.ice.Ice 1.0.2 | 6.5 | 7.7% | 2 |
| matt.advanced.Katana 1.0 | 8.3 | 6.5% | 2 |
| stelo.PianistNano 1.2 | 9.2 | 5.6% | 0 |
| stelo.Lifestealer 1.0 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 91.7 | 25 / 35 | 4025 |
| 2 | 1 | 70.0 | 93.7 | 25 / 35 | 4482 |
| 3 | 1 | 69.7 | 92.7 | 28 / 35 | 4399 |
| 4 | 1 | 69.3 | 91.1 | 24 / 35 | 4417 |
| 5 | 1 | 69.6 | 94.6 | 26 / 35 | 4302 |
| 6 | 1 | 66.6 | 85.4 | 19 / 35 | 4040 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 85 | 87% |
| uji.Antique 1.0 | 53 | 87% |
| qohnil.blot.BlotBot 3.61 | 14 | 64% |
| pfvicm.Sobieski 7.2.3b | 9 | 89% |
| ahr.ice.Ice 1.0.2 | 6 | 83% |
| matt.advanced.Katana 1.0 | 3 | 67% |
| amk.ChumbaWumba 0.3 | 1 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 744. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 20 | 32% | 63 |
| kid.test.NightFox .2 | 12 | 19% | 49 |
| qohnil.blot.BlotBot 3.61 | 10 | 16% | 34 |
| pfvicm.Sobieski 7.2.3b | 10 | 16% | 21 |
| amk.ChumbaWumba 0.3 | 4 | 6% | 13 |
| matt.advanced.Katana 1.0 | 4 | 6% | 9 |
| stelo.PianistNano 1.2 | 2 | 3% | 6 |
| ahr.ice.Ice 1.0.2 | 1 | 2% | 10 |
| stelo.Lifestealer 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 200 rounds): 131068 melee ticks, 36010 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 32 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 43740 sent, 39046 reached their opponent, 5658 virtual hits (14.5% of those reached).

## Melee bench: F29

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 96 over 6 battles (16.0 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 92.4 | 132 / 210 | 1.69 | 20.5% | 30773 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 20.5% | 132 |
| deewiant.Anomaly 0.2 | 2.5 | 14.7% | 35 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 14.4% | 35 |
| myl.micro.Troodon 1.10 | 4.2 | 11.7% | 4 |
| jok.PheonixM 0.1.2 | 4.8 | 10.7% | 3 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.4% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 7.3 | 6.1% | 0 |
| DBall.Anarchy 0.1 | 8.0 | 5.4% | 0 |
| jangs.ns51 1.0 | 9.3 | 4.1% | 0 |
| ap.Frederick 1.1 | 9.3 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 89.2 | 20 / 35 | 4771 |
| 2 | 1 | 70.9 | 92.1 | 21 / 35 | 5143 |
| 3 | 1 | 71.8 | 93.3 | 24 / 35 | 5426 |
| 4 | 1 | 72.0 | 94.3 | 24 / 35 | 5271 |
| 5 | 1 | 71.5 | 93.7 | 21 / 35 | 5144 |
| 6 | 1 | 70.8 | 91.7 | 22 / 35 | 5018 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 84 | 74% |
| zyx.mega.YersiniaPestis 3.1 | 46 | 59% |
| myl.micro.Troodon 1.10 | 26 | 96% |
| jok.PheonixM 0.1.2 | 15 | 80% |
| DBall.Anarchy 0.1 | 3 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |
| ap.Frederick 1.1 | 1 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 1032. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 31 | 39% | 88 |
| zyx.mega.YersiniaPestis 3.1 | 29 | 37% | 64 |
| myl.micro.Troodon 1.10 | 9 | 11% | 24 |
| jok.PheonixM 0.1.2 | 6 | 8% | 19 |
| jangs.ns51 1.0 | 2 | 3% | 2 |
| ph.melee.ArcherME 0.3 | 1 | 1% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 3 |
| DBall.Anarchy 0.1 | 0 | 0% | 4 |

Posture (Hadur's M records, 200 rounds): 167288 melee ticks, 62393 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 25 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 53479 sent, 48778 reached their opponent, 7434 virtual hits (15.2% of those reached).

## Melee bench: F30

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 110 over 6 battles (18.3 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 78.6 | 54 / 210 | 2.93 | 15.7% | 24215 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 15.7% | 54 |
| catcat20.Matcha 0.006 | 2.7 | 13.8% | 56 |
| stelo.PastFuture 2.3.2 | 3.7 | 12.9% | 21 |
| darkcanuck.B26354 1.06 | 3.7 | 12.8% | 39 |
| oog.melee.Capulet 1.2 | 4.0 | 12.7% | 28 |
| intruder.PrairieWolf 2.61 | 6.2 | 8.6% | 4 |
| ntc.Opposite 1.5 | 7.5 | 7.2% | 2 |
| tripphippy.Alice 1.1 | 7.8 | 7.2% | 3 |
| fowl3628800.LightningBolt 2.6.0 | 8.5 | 6.6% | 3 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 79.7 | 11 / 35 | 4044 |
| 2 | 1 | 62.9 | 75.6 | 7 / 35 | 3822 |
| 3 | 1 | 63.3 | 75.9 | 7 / 35 | 4074 |
| 4 | 1 | 64.0 | 77.5 | 11 / 35 | 3999 |
| 5 | 1 | 64.8 | 81.0 | 10 / 35 | 4181 |
| 6 | 1 | 64.8 | 81.9 | 8 / 35 | 4095 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 36 | 33% |
| oog.melee.Capulet 1.2 | 28 | 39% |
| darkcanuck.B26354 1.06 | 27 | 56% |
| stelo.PastFuture 2.3.2 | 19 | 58% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 33% |
| intruder.PrairieWolf 2.61 | 3 | 67% |
| tripphippy.Alice 1.1 | 2 | 100% |
| ntc.Opposite 1.5 | 1 | 0% |

Hadur died in 156 of 210 rounds, at a mean tick of 884. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 37 | 24% | 48 |
| darkcanuck.B26354 1.06 | 34 | 22% | 47 |
| stelo.PastFuture 2.3.2 | 34 | 22% | 44 |
| oog.melee.Capulet 1.2 | 28 | 18% | 42 |
| ntc.Opposite 1.5 | 8 | 5% | 9 |
| intruder.PrairieWolf 2.61 | 7 | 4% | 10 |
| fowl3628800.LightningBolt 2.6.0 | 5 | 3% | 5 |
| tripphippy.Alice 1.1 | 3 | 2% | 5 |

Posture (Hadur's M records, 202 rounds): 153603 melee ticks, 35173 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 132 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 132 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 49262 sent, 44447 reached their opponent, 7746 virtual hits (17.4% of those reached).

## Melee bench: F31

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 114 over 6 battles (19.0 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 79.4 | 67 / 210 | 2.86 | 16.0% | 22665 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.5% | 84 |
| hadur117.Hadur 3.21 | 2.0 | 16.0% | 67 |
| gh.mini.Griezel 0.2 | 3.0 | 13.5% | 43 |
| d414.nano.Quantum 1.0.0 | 4.2 | 11.6% | 10 |
| spinnercat.micro.Tyger 0.1 | 4.8 | 10.8% | 6 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.5% | 1 |
| timmit.nano.TimDog 0.33 | 7.3 | 6.7% | 1 |
| fm.mammillarias 1.3 | 8.0 | 5.7% | 0 |
| tlp.ThreeLeggedPig 1 | 9.3 | 4.7% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.8 | 84.4 | 13 / 35 | 4005 |
| 2 | 2 | 64.5 | 76.8 | 14 / 35 | 3661 |
| 3 | 2 | 64.1 | 78.4 | 10 / 35 | 3576 |
| 4 | 2 | 65.2 | 79.7 | 11 / 35 | 4062 |
| 5 | 2 | 64.1 | 78.4 | 11 / 35 | 3687 |
| 6 | 2 | 64.1 | 78.4 | 8 / 35 | 3674 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 64 | 48% |
| gh.mini.Griezel 0.2 | 39 | 49% |
| d414.nano.Quantum 1.0.0 | 10 | 90% |
| spinnercat.micro.Tyger 0.1 | 7 | 71% |
| gh.nano.Grofvuil 0.2 | 2 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 842. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 55 | 38% | 83 |
| gh.mini.Griezel 0.2 | 33 | 23% | 55 |
| d414.nano.Quantum 1.0.0 | 20 | 14% | 30 |
| spinnercat.micro.Tyger 0.1 | 15 | 10% | 17 |
| fm.mammillarias 1.3 | 6 | 4% | 6 |
| timmit.nano.TimDog 0.33 | 6 | 4% | 6 |
| gh.nano.Grofvuil 0.2 | 5 | 3% | 8 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 3 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 149072 melee ticks, 38135 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 40 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 48255 sent, 43358 reached their opponent, 7055 virtual hits (16.3% of those reached).

## Melee bench: F32

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 117 over 6 battles (19.5 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 90.9 | 136 / 210 | 1.82 | 19.2% | 28708 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 19.2% | 136 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.1% | 38 |
| apc.botM 3.0 | 3.0 | 12.3% | 16 |
| lxx.ConceptA 0.8 | 4.2 | 10.8% | 3 |
| vjik.UnViolation 1.1 | 5.0 | 9.5% | 8 |
| bayen.UbaMicro 1.4 | 6.0 | 8.6% | 2 |
| yk.JahMicro 1.0 | 7.7 | 6.8% | 5 |
| panzer.Panzer 0.2 | 7.7 | 7.1% | 1 |
| conscience.Electron 1.3g | 8.7 | 6.0% | 1 |
| donjezza.Jezza 1.0 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 92.1 | 25 / 35 | 4404 |
| 2 | 1 | 68.0 | 88.9 | 21 / 35 | 4614 |
| 3 | 1 | 67.4 | 86.7 | 18 / 35 | 4724 |
| 4 | 1 | 69.5 | 91.1 | 21 / 35 | 5061 |
| 5 | 1 | 69.8 | 94.3 | 26 / 35 | 4777 |
| 6 | 1 | 69.9 | 92.4 | 25 / 35 | 5128 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 89 | 73% |
| apc.botM 3.0 | 39 | 82% |
| lxx.ConceptA 0.8 | 13 | 92% |
| vjik.UnViolation 1.1 | 11 | 73% |
| yk.JahMicro 1.0 | 8 | 63% |
| bayen.UbaMicro 1.4 | 7 | 100% |
| panzer.Panzer 0.2 | 4 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 814. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 30 | 41% | 90 |
| lxx.ConceptA 0.8 | 13 | 18% | 23 |
| apc.botM 3.0 | 12 | 16% | 44 |
| vjik.UnViolation 1.1 | 7 | 9% | 21 |
| bayen.UbaMicro 1.4 | 4 | 5% | 14 |
| yk.JahMicro 1.0 | 4 | 5% | 11 |
| panzer.Panzer 0.2 | 2 | 3% | 3 |
| conscience.Electron 1.3g | 1 | 1% | 2 |
| donjezza.Jezza 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 199 rounds): 125399 melee ticks, 53536 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 82 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 82 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 41403 sent, 36750 reached their opponent, 6939 virtual hits (18.9% of those reached).

## Melee bench: F33

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 131 over 6 battles (21.8 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 89.8 | 128 / 210 | 1.92 | 19.8% | 30796 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 19.8% | 128 |
| maribo.Quester 0.3 | 2.0 | 16.1% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.0% | 16 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 10.9% | 13 |
| labg.Cataclysm 2.05 | 5.2 | 9.8% | 8 |
| baal.nano.N 1.42 | 6.0 | 9.0% | 2 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 7.9% | 4 |
| sanja.First 0.1 | 8.5 | 5.1% | 0 |
| zyx.micro.Ant 1.1 | 8.5 | 5.1% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 90.5 | 22 / 35 | 5204 |
| 2 | 1 | 69.8 | 89.2 | 22 / 35 | 5044 |
| 3 | 1 | 70.6 | 90.2 | 24 / 35 | 5024 |
| 4 | 1 | 67.0 | 82.5 | 14 / 35 | 4611 |
| 5 | 1 | 71.5 | 93.7 | 22 / 35 | 5395 |
| 6 | 1 | 71.6 | 92.7 | 24 / 35 | 5518 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 79 | 80% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 35 | 86% |
| gre.svman4.Leonidas 1.3.2 | 27 | 85% |
| labg.Cataclysm 2.05 | 6 | 83% |
| baal.nano.N 1.42 | 5 | 80% |
| kinsen.melee.Angsaichmophobia 1.8c | 3 | 67% |

Hadur died in 84 of 210 rounds, at a mean tick of 1000. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 33 | 39% | 93 |
| gre.svman4.Leonidas 1.3.2 | 22 | 26% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 15% | 54 |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 6% | 6 |
| labg.Cataclysm 2.05 | 4 | 5% | 11 |
| baal.nano.N 1.42 | 4 | 5% | 8 |
| zyx.micro.Ant 1.1 | 2 | 2% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 172626 melee ticks, 50594 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 47 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 54335 sent, 49582 reached their opponent, 7071 virtual hits (14.3% of those reached).

## Melee bench: F34

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 101 over 6 battles (16.8 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 89.7 | 96 / 210 | 1.93 | 19.1% | 32688 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 19.1% | 96 |
| kid.Gladiator .7.2 | 2.3 | 16.6% | 42 |
| stelo.Spread 0.9 | 2.7 | 15.9% | 58 |
| tcf.Reach 3 | 4.7 | 10.4% | 7 |
| jcs.Seth 1.8 | 4.7 | 10.5% | 7 |
| cli.Dancer 1.1 | 5.7 | 9.4% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.4% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.3% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.1% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 87.9 | 16 / 35 | 5604 |
| 2 | 1 | 70.2 | 88.6 | 17 / 35 | 5758 |
| 3 | 1 | 70.5 | 91.4 | 17 / 35 | 5524 |
| 4 | 1 | 71.0 | 93.3 | 21 / 35 | 5428 |
| 5 | 1 | 68.8 | 88.6 | 12 / 35 | 5031 |
| 6 | 1 | 69.5 | 88.3 | 13 / 35 | 5343 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 67 | 57% |
| stelo.Spread 0.9 | 65 | 55% |
| jcs.Seth 1.8 | 16 | 69% |
| tcf.Reach 3 | 7 | 71% |
| cli.Dancer 1.1 | 4 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 1112. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 51 | 44% | 88 |
| stelo.Spread 0.9 | 42 | 37% | 74 |
| jcs.Seth 1.8 | 12 | 10% | 26 |
| tcf.Reach 3 | 7 | 6% | 13 |
| cli.Dancer 1.1 | 2 | 2% | 7 |
| ratosh.Wesco 1.4 | 1 | 1% | 2 |

Posture (Hadur's M records, 200 rounds): 168953 melee ticks, 56252 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 41 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 51327 sent, 46620 reached their opponent, 7784 virtual hits (16.7% of those reached).

## Melee bench: F35

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 91 over 6 battles (15.2 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 83.1 | 49 / 210 | 2.52 | 16.3% | 23249 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.5% | 142 |
| hadur117.Hadur 3.21 | 2.0 | 16.3% | 49 |
| gh.mini.Gruwel 0.9 | 3.0 | 12.6% | 16 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.5 | 11.7% | 2 |
| rz.HawkOnFire 0.1 | 4.5 | 11.5% | 1 |
| wit.Chuliath 1.0 | 6.7 | 6.7% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.3 | 6.1% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 6.1% | 0 |
| dans.Cinnamon 1.2 | 9.0 | 4.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 84.1 | 6 / 35 | 4071 |
| 2 | 2 | 65.8 | 83.5 | 8 / 35 | 3975 |
| 3 | 2 | 65.7 | 82.5 | 11 / 35 | 4028 |
| 4 | 2 | 65.7 | 82.9 | 9 / 35 | 3869 |
| 5 | 2 | 64.6 | 81.0 | 6 / 35 | 3673 |
| 6 | 2 | 65.5 | 84.8 | 9 / 35 | 3633 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 103 | 22% |
| gh.mini.Gruwel 0.9 | 15 | 53% |
| dmh.robocode.robot.BlackDeath 9.2 | 9 | 100% |
| rz.HawkOnFire 0.1 | 6 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 100% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 162 of 210 rounds, at a mean tick of 964. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 99 | 61% | 127 |
| gh.mini.Gruwel 0.9 | 28 | 17% | 35 |
| dmh.robocode.robot.BlackDeath 9.2 | 18 | 11% | 24 |
| rz.HawkOnFire 0.1 | 8 | 5% | 12 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 2% | 4 |
| wit.Chuliath 1.0 | 3 | 2% | 4 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 3 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 1 |

Posture (Hadur's M records, 199 rounds): 140351 melee ticks, 52637 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 34 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 43976 sent, 39284 reached their opponent, 6050 virtual hits (15.4% of those reached).

## Melee bench: F36

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 133 over 6 battles (22.2 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 93.2 | 160 / 210 | 1.61 | 21.0% | 32956 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 21.0% | 160 |
| bzdp.Pansy 2.1 | 2.5 | 12.0% | 9 |
| alpha.RainingFire 1.0 | 2.8 | 12.2% | 15 |
| bvh.micro.Freya 0.3 | 3.8 | 11.1% | 8 |
| mz.Cork 0.1 | 5.2 | 10.5% | 9 |
| bvh.mini.Fenrir 0.39 | 6.2 | 9.9% | 2 |
| m3thos.Eva02 0.7.1 | 6.5 | 9.5% | 6 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 5.5% | 0 |
| dl.BetterWalls 1.0 | 8.7 | 4.9% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 93.7 | 28 / 35 | 5439 |
| 2 | 1 | 71.3 | 92.4 | 25 / 35 | 5405 |
| 3 | 1 | 71.2 | 92.7 | 27 / 35 | 5556 |
| 4 | 1 | 71.6 | 92.7 | 27 / 35 | 5760 |
| 5 | 1 | 72.2 | 96.2 | 28 / 35 | 5439 |
| 6 | 1 | 70.9 | 91.4 | 25 / 35 | 5357 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.micro.Freya 0.3 | 43 | 93% |
| bzdp.Pansy 2.1 | 42 | 93% |
| mz.Cork 0.1 | 32 | 81% |
| alpha.RainingFire 1.0 | 29 | 83% |
| bvh.mini.Fenrir 0.39 | 16 | 100% |
| m3thos.Eva02 0.7.1 | 13 | 92% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.MyFirstRobot 1.0 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 19 | 37% | 46 |
| bzdp.Pansy 2.1 | 8 | 16% | 45 |
| mz.Cork 0.1 | 8 | 16% | 38 |
| bvh.micro.Freya 0.3 | 8 | 16% | 35 |
| m3thos.Eva02 0.7.1 | 4 | 8% | 18 |
| bvh.mini.Fenrir 0.39 | 3 | 6% | 13 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 5 |
| dl.BetterWalls 1.0 | 0 | 0% | 7 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 200 rounds): 141381 melee ticks, 45554 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 46 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 49066 sent, 44525 reached their opponent, 9074 virtual hits (20.4% of those reached).

## Melee bench: F37

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 148 over 6 battles (24.7 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 90.8 | 171 / 210 | 1.83 | 19.9% | 34382 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 19.9% | 171 |
| germ.TheMind .2 | 3.8 | 9.8% | 9 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.2 | 10.2% | 7 |
| EBBU.Sim2 1.02 | 4.7 | 9.5% | 6 |
| lmk.ACPFinal 0.1 | 4.8 | 9.4% | 0 |
| mn.nano.perceptual.Impact 1.3.0 | 6.3 | 8.9% | 1 |
| agrach.Dalek 1.0 | 6.5 | 8.6% | 3 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.5% | 6 |
| mb.Beast 0.1 | 7.0 | 8.3% | 5 |
| skm.Ryubot 1.0 | 9.8 | 6.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 91.1 | 29 / 35 | 5395 |
| 2 | 1 | 68.4 | 86.3 | 27 / 35 | 5868 |
| 3 | 1 | 71.0 | 96.2 | 31 / 35 | 5965 |
| 4 | 1 | 69.1 | 91.1 | 28 / 35 | 5593 |
| 5 | 1 | 69.9 | 91.7 | 28 / 35 | 6051 |
| 6 | 1 | 68.2 | 88.3 | 28 / 35 | 5510 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| lmk.ACPFinal 0.1 | 27 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 27 | 96% |
| EBBU.Sim2 1.02 | 24 | 100% |
| germ.TheMind .2 | 23 | 91% |
| stelo.UntouchableNano 1.3 | 22 | 95% |
| agrach.Dalek 1.0 | 22 | 95% |
| mb.Beast 0.1 | 18 | 94% |
| skm.Ryubot 1.0 | 10 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 100% |

Hadur died in 39 of 210 rounds, at a mean tick of 374. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 13 | 33% | 16 |
| com.syncleus.robocode.Dreadnaught 0.1 | 7 | 18% | 37 |
| lmk.ACPFinal 0.1 | 5 | 13% | 29 |
| germ.TheMind .2 | 4 | 10% | 23 |
| EBBU.Sim2 1.02 | 3 | 8% | 32 |
| agrach.Dalek 1.0 | 3 | 8% | 29 |
| mb.Beast 0.1 | 3 | 8% | 18 |
| stelo.UntouchableNano 1.3 | 1 | 3% | 23 |
| skm.Ryubot 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 93440 melee ticks, 27685 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 55 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 31653 sent, 27225 reached their opponent, 7960 virtual hits (29.2% of those reached).

## Melee bench: F38

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 98 over 6 battles (16.3 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 90.1 | 126 / 210 | 1.89 | 19.1% | 29255 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 19.1% | 126 |
| justin.Mallais 14.0 | 2.2 | 15.4% | 45 |
| bvh.mini.Freya 0.55 | 2.8 | 13.0% | 13 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.1% | 14 |
| cs.Wren 1.0 | 5.3 | 10.4% | 3 |
| kdf.KoulDestroyer 1.0 | 5.5 | 9.8% | 7 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.0 | 7.7% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.8 | 6.0% | 1 |
| bzdp.BoxCar 2.0 | 9.3 | 3.7% | 0 |
| matt.UnderDark3 2.4.34 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 88.6 | 18 / 35 | 4422 |
| 2 | 1 | 69.3 | 92.4 | 19 / 35 | 4724 |
| 3 | 1 | 70.9 | 94.6 | 26 / 35 | 5095 |
| 4 | 1 | 68.4 | 86.3 | 21 / 35 | 4675 |
| 5 | 1 | 70.1 | 91.1 | 21 / 35 | 5474 |
| 6 | 1 | 69.0 | 87.6 | 21 / 35 | 4865 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 83 | 67% |
| bvh.mini.Freya 0.55 | 28 | 82% |
| bts.mega.Gnarly 1.4 | 27 | 78% |
| cs.Wren 1.0 | 17 | 94% |
| kdf.KoulDestroyer 1.0 | 7 | 86% |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 80% |

Hadur died in 84 of 210 rounds, at a mean tick of 833. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 41 | 49% | 84 |
| bvh.mini.Freya 0.55 | 19 | 23% | 37 |
| bts.mega.Gnarly 1.4 | 10 | 12% | 39 |
| kdf.KoulDestroyer 1.0 | 8 | 10% | 18 |
| cs.Wren 1.0 | 4 | 5% | 18 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 6 |
| davidalves.net.DuelistNanoMelee 1.01 | 1 | 1% | 5 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 2 |
| bzdp.BoxCar 2.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 137321 melee ticks, 47696 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 40 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 44623 sent, 39697 reached their opponent, 8260 virtual hits (20.8% of those reached).

## Melee bench: F39

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 348 over 6 battles (58.0 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 90.3 | 120 / 210 | 1.87 | 19.6% | 32966 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 19.6% | 120 |
| bvh.fry.Freya 0.82 | 2.2 | 14.5% | 18 |
| az.Ololobot 0.2.4 | 3.2 | 12.9% | 47 |
| catcat20.Lambda 0.024 | 3.7 | 11.8% | 22 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 8.8% | 0 |
| gimp.GimpBot 0.1 | 6.5 | 8.1% | 3 |
| apollokidd.ApolloKidd 0.9 | 6.5 | 7.6% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 8.3 | 6.5% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.8 | 5.6% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 89.8 | 19 / 35 | 5351 |
| 2 | 1 | 69.8 | 92.4 | 21 / 35 | 5414 |
| 3 | 1 | 69.3 | 88.6 | 17 / 35 | 5867 |
| 4 | 1 | 70.6 | 92.7 | 23 / 35 | 5766 |
| 5 | 1 | 70.4 | 91.1 | 23 / 35 | 5698 |
| 6 | 1 | 67.9 | 87.3 | 17 / 35 | 4870 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 56 | 54% |
| bvh.fry.Freya 0.82 | 53 | 92% |
| catcat20.Lambda 0.024 | 37 | 57% |
| winamp32.micro.MicroMacro 1.0 | 10 | 100% |
| gimp.GimpBot 0.1 | 7 | 71% |
| stelo.SoRobotNanoMelee 1.2 | 4 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 1137. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 33 | 36% | 68 |
| catcat20.Lambda 0.024 | 27 | 29% | 45 |
| bvh.fry.Freya 0.82 | 19 | 21% | 56 |
| apollokidd.ApolloKidd 0.9 | 3 | 3% | 6 |
| whitesquare.robots.SkynetAdvanced 1.1 | 3 | 3% | 3 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 18 |
| gimp.GimpBot 0.1 | 2 | 2% | 11 |
| stelo.SoRobotNanoMelee 1.2 | 1 | 1% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 167774 melee ticks, 61628 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 70 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 52298 sent, 47495 reached their opponent, 8425 virtual hits (17.7% of those reached).

## Melee bench: F41

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 74 over 6 battles (12.3 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.7 | 113 / 210 | 1.92 | 18.8% | 27323 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 18.8% | 113 |
| eem.EvBotNG v12.8 | 2.0 | 16.1% | 75 |
| ary.Swarm 1.1 | 3.3 | 12.8% | 7 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.3% | 9 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 11.4% | 3 |
| shrub.Silver v048 | 6.0 | 8.9% | 2 |
| zyx.nano.Ant 1.1 | 7.0 | 7.4% | 1 |
| stelo.Mirror 1.1 | 8.3 | 5.1% | 0 |
| jsal.Jsalbot 1.0 | 8.7 | 4.9% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 88.6 | 19 / 35 | 4750 |
| 2 | 1 | 69.0 | 88.3 | 17 / 35 | 4570 |
| 3 | 1 | 69.5 | 88.6 | 20 / 35 | 4811 |
| 4 | 1 | 68.3 | 87.9 | 15 / 35 | 4547 |
| 5 | 1 | 69.3 | 91.1 | 17 / 35 | 4294 |
| 6 | 1 | 70.4 | 94.0 | 25 / 35 | 4351 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 87 | 51% |
| ary.Swarm 1.1 | 32 | 88% |
| lessonz.robocode.Oz 0.5.0 | 32 | 78% |
| simonton.nano.MeleeSeed 1.8 | 15 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 1007. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 57 | 58% | 98 |
| lessonz.robocode.Oz 0.5.0 | 19 | 19% | 37 |
| ary.Swarm 1.1 | 10 | 10% | 35 |
| simonton.nano.MeleeSeed 1.8 | 9 | 9% | 28 |
| shrub.Silver v048 | 2 | 2% | 7 |
| jsal.Jsalbot 1.0 | 1 | 1% | 3 |
| stelo.Mirror 1.1 | 0 | 0% | 2 |

Posture (Hadur's M records, 200 rounds): 152411 melee ticks, 54629 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 96 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 96 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 49550 sent, 44711 reached their opponent, 6717 virtual hits (15.0% of those reached).

## Melee bench: F42

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 93 over 6 battles (15.5 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 92.4 | 142 / 210 | 1.69 | 20.5% | 35311 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 20.5% | 142 |
| wompi.Wallaby 5.1 | 2.0 | 15.1% | 29 |
| maribo.mini.MiniQuester 0.1 | 3.2 | 13.6% | 16 |
| ara.Shera 0.88 | 3.8 | 12.9% | 19 |
| amz.NanoClone 1.41 | 5.2 | 8.8% | 1 |
| dsw.StaticD 1.0 | 6.8 | 6.7% | 3 |
| stelo.MirrorMicro 1.0 | 7.2 | 6.1% | 0 |
| maribo.IotaCT 1.1 | 7.2 | 6.2% | 0 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 92.1 | 24 / 35 | 6113 |
| 2 | 1 | 70.4 | 90.8 | 24 / 35 | 5589 |
| 3 | 1 | 70.9 | 93.0 | 23 / 35 | 5736 |
| 4 | 1 | 71.7 | 94.3 | 26 / 35 | 6217 |
| 5 | 1 | 71.6 | 93.7 | 23 / 35 | 6034 |
| 6 | 1 | 70.1 | 90.5 | 22 / 35 | 5622 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 93 | 87% |
| maribo.mini.MiniQuester 0.1 | 44 | 84% |
| ara.Shera 0.88 | 29 | 59% |
| dsw.StaticD 1.0 | 4 | 100% |
| stelo.MirrorMicro 1.0 | 2 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 988. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 28 | 41% | 44 |
| wompi.Wallaby 5.1 | 25 | 37% | 100 |
| maribo.mini.MiniQuester 0.1 | 11 | 16% | 48 |
| dsw.StaticD 1.0 | 1 | 1% | 8 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 4 |
| amz.NanoClone 1.41 | 1 | 1% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 2 |

Posture (Hadur's M records, 204 rounds): 166469 melee ticks, 54743 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 30 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 30 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 52003 sent, 47195 reached their opponent, 9177 virtual hits (19.4% of those reached).

## Melee bench: F43

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 74 over 6 battles (12.3 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 82.8 | 47 / 210 | 2.55 | 16.9% | 27181 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.4% | 135 |
| hadur117.Hadur 3.21 | 2.0 | 16.9% | 47 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.7% | 25 |
| dummy.micro.Sparrow 2.5 | 4.3 | 11.3% | 3 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 11.0% | 1 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.2% | 0 |
| jab.DiamondStealer 5 | 7.3 | 7.6% | 0 |
| mz.NanoGod 2.02 | 7.7 | 7.4% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.2% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.8 | 84.8 | 10 / 35 | 4274 |
| 2 | 2 | 66.3 | 79.4 | 5 / 35 | 4199 |
| 3 | 2 | 68.1 | 84.1 | 7 / 35 | 4842 |
| 4 | 2 | 66.8 | 81.9 | 6 / 35 | 4345 |
| 5 | 2 | 67.2 | 81.3 | 10 / 35 | 4471 |
| 6 | 2 | 69.1 | 85.4 | 9 / 35 | 5050 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 89 | 24% |
| brainfade.melee.Dusk 0.44 | 24 | 33% |
| dummy.micro.Sparrow 2.5 | 15 | 100% |
| cvt.Firsty 1.0 | 1 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 1 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 1029. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 96 | 59% | 119 |
| brainfade.melee.Dusk 0.44 | 39 | 24% | 47 |
| dummy.micro.Sparrow 2.5 | 10 | 6% | 22 |
| wcsv.melee.EngineerMelee 0.1 | 8 | 5% | 9 |
| Krabb.akim2.Akim2 1.1b | 4 | 2% | 5 |
| mz.NanoGod 2.02 | 3 | 2% | 4 |
| jab.DiamondStealer 5 | 3 | 2% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 152471 melee ticks, 59061 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 23 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 23 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 48240 sent, 43355 reached their opponent, 7098 virtual hits (16.4% of those reached).

## Melee bench: F44

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 98 over 6 battles (16.3 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 92.6 | 137 / 210 | 1.67 | 20.8% | 35533 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 20.8% | 137 |
| stelo.Liblix 0.3.1 | 2.2 | 15.8% | 49 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.5% | 20 |
| jwirde.Gort 2.0 | 4.3 | 9.3% | 2 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.0 | 9.3% | 1 |
| disan.Chair 2.2.0 | 5.8 | 7.7% | 0 |
| wompi.Quokka 1.6 | 7.3 | 6.9% | 0 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.7% | 1 |
| sample.Crazy 1.0 | 9.3 | 4.6% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 91.4 | 22 / 35 | 6137 |
| 2 | 1 | 73.2 | 97.5 | 29 / 35 | 6136 |
| 3 | 1 | 71.3 | 90.8 | 26 / 35 | 5951 |
| 4 | 1 | 71.5 | 92.4 | 21 / 35 | 6133 |
| 5 | 1 | 70.6 | 91.4 | 20 / 35 | 5629 |
| 6 | 1 | 70.6 | 92.1 | 19 / 35 | 5547 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 88 | 68% |
| tzu.TheArtOfWar 1.2 | 62 | 87% |
| jwirde.Gort 2.0 | 8 | 88% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 88% |
| disan.Chair 2.2.0 | 8 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 977. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 45 | 62% | 104 |
| tzu.TheArtOfWar 1.2 | 16 | 22% | 66 |
| jwirde.Gort 2.0 | 5 | 7% | 18 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 5% | 11 |
| stf.PanzerGeneral 0.1 | 2 | 3% | 2 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 1 |
| disan.Chair 2.2.0 | 0 | 0% | 4 |
| sample.Crazy 1.0 | 0 | 0% | 2 |
| wompi.Quokka 1.6 | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 152304 melee ticks, 46999 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 41 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 51644 sent, 46957 reached their opponent, 9721 virtual hits (20.7% of those reached).

## Melee bench: F45

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 226 over 6 battles (37.7 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 90.4 | 120 / 210 | 1.86 | 20.4% | 33747 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21 | 1.0 | 20.4% | 120 |
| jje.BagPuss 1.2 | 2.2 | 12.2% | 9 |
| eem.IWillFireNoBullet v2.8 | 3.0 | 11.6% | 62 |
| sul.Lunar 1.1 | 4.5 | 10.6% | 11 |
| myl.nano.Graviton 1.10 | 4.5 | 10.6% | 4 |
| fm.claire 1.7 | 6.7 | 8.9% | 0 |
| hvilela.HVilela 0.9 | 6.8 | 8.6% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.3 | 8.2% | 2 |
| wit.Deep7 2.0 | 9.2 | 4.9% | 2 |
| abud.ThirdRobo 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 90.2 | 17 / 35 | 5689 |
| 2 | 1 | 71.4 | 93.3 | 23 / 35 | 5776 |
| 3 | 1 | 70.8 | 91.4 | 21 / 35 | 5806 |
| 4 | 1 | 71.0 | 90.8 | 21 / 35 | 5944 |
| 5 | 1 | 68.5 | 85.7 | 18 / 35 | 5001 |
| 6 | 1 | 70.4 | 91.1 | 20 / 35 | 5531 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 77 | 57% |
| jje.BagPuss 1.2 | 28 | 82% |
| sul.Lunar 1.1 | 25 | 92% |
| myl.nano.Graviton 1.10 | 19 | 89% |
| pez.mini.ChironexFleckeri 0.5 | 10 | 90% |
| wit.Deep7 2.0 | 2 | 100% |
| fm.claire 1.7 | 1 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 1730. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 43 | 47% | 0 |
| jje.BagPuss 1.2 | 17 | 19% | 66 |
| myl.nano.Graviton 1.10 | 12 | 13% | 40 |
| sul.Lunar 1.1 | 9 | 10% | 48 |
| fm.claire 1.7 | 4 | 4% | 15 |
| pez.mini.ChironexFleckeri 0.5 | 2 | 2% | 21 |
| hvilela.HVilela 0.9 | 2 | 2% | 10 |
| wit.Deep7 2.0 | 1 | 1% | 6 |
| abud.ThirdRobo 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 207752 melee ticks, 86336 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 33 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 61987 sent, 57244 reached their opponent, 8305 virtual hits (14.5% of those reached).

## Melee bench: F46

hadur117.Hadur 3.21 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 77 over 6 battles (12.8 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 84.3 | 62 / 210 | 2.41 | 16.7% | 25695 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.7 | 16.8% | 56 |
| rsalesc.melee.Medina 0.4.5 | 2.2 | 16.5% | 79 |
| hadur117.Hadur 3.21 | 2.2 | 16.7% | 62 |
| mz.MicroSheep 1.0 | 4.8 | 10.2% | 4 |
| cx.Princess 1.0 | 5.0 | 10.0% | 9 |
| sadoner.killer 0.2 | 5.2 | 9.6% | 1 |
| arthord.NanoSatanMelee Beta | 7.0 | 6.7% | 0 |
| kurios.DOSexe .9a | 8.5 | 4.9% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.5 | 5.5% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 66.2 | 85.4 | 10 / 35 | 4049 |
| 2 | 2 | 66.5 | 84.1 | 12 / 35 | 4429 |
| 3 | 2 | 67.2 | 85.7 | 14 / 35 | 4344 |
| 4 | 2 | 66.6 | 84.1 | 10 / 35 | 4242 |
| 5 | 3 | 66.0 | 83.5 | 7 / 35 | 4279 |
| 6 | 1 | 66.1 | 82.9 | 9 / 35 | 4352 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 57 | 67% |
| rsalesc.melee.Medina 0.4.5 | 46 | 20% |
| cx.Princess 1.0 | 10 | 70% |
| mz.MicroSheep 1.0 | 7 | 71% |
| sadoner.killer 0.2 | 3 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 989. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 63 | 43% | 75 |
| kc.mini.Mirage 0.2 | 58 | 39% | 97 |
| sadoner.killer 0.2 | 8 | 5% | 12 |
| cx.Princess 1.0 | 8 | 5% | 10 |
| mz.MicroSheep 1.0 | 7 | 5% | 12 |
| arthord.NanoSatanMelee Beta | 2 | 1% | 2 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |
| kurios.DOSexe .9a | 1 | 1% | 1 |

Posture (Hadur's M records, 204 rounds): 157990 melee ticks, 45484 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 25 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 45523 sent, 40783 reached their opponent, 6134 virtual hits (15.0% of those reached).

