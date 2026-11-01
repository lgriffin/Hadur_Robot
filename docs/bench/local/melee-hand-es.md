# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 121 over 6 battles (20.2 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.0 | 54 / 210 | 2.17 | 18.0% | 33933 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.6% | 140 |
| hadur117.Hadur 3.20es | 2.0 | 18.0% | 54 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.7 | 11.5% | 6 |
| sgp.JollyNinja 3.53 | 3.7 | 11.3% | 8 |
| lorneswork.Predator 1.0 | 5.2 | 10.2% | 3 |
| mz.MicroGodMelee 1 | 5.5 | 9.4% | 1 |
| adt.Ar2 1.0 | 7.0 | 7.4% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.3% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.6 | 88.3 | 8 / 35 | 5853 |
| 2 | 2 | 68.1 | 85.7 | 6 / 35 | 5725 |
| 3 | 2 | 67.3 | 85.1 | 11 / 35 | 5308 |
| 4 | 2 | 69.3 | 88.9 | 12 / 35 | 5848 |
| 5 | 2 | 67.1 | 84.8 | 6 / 35 | 5354 |
| 6 | 2 | 69.5 | 89.2 | 11 / 35 | 5845 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 123 | 16% |
| sgp.JollyNinja 3.53 | 21 | 76% |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 82% |
| mz.MicroGodMelee 1 | 5 | 100% |
| lorneswork.Predator 1.0 | 4 | 50% |
| skm.butterfly 1.0 | 1 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 158 of 210 rounds, at a mean tick of 1179. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 116 | 73% | 140 |
| lorneswork.Predator 1.0 | 12 | 8% | 16 |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 7% | 18 |
| sgp.JollyNinja 3.53 | 10 | 6% | 21 |
| adt.Ar2 1.0 | 4 | 3% | 5 |
| mz.MicroGodMelee 1 | 3 | 2% | 9 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 138466 melee ticks, 89404 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 56 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 44410 sent, 39764 reached their opponent, 7836 virtual hits (19.7% of those reached).

## Melee bench: F02

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 171 over 6 battles (28.5 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 87.8 | 115 / 210 | 2.10 | 19.3% | 31834 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 19.3% | 115 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 14.6% | 48 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 13.3% | 24 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 11.1% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.5 | 10.5% | 8 |
| fnc.bandit.Bandit 5.2.0 | 6.5 | 8.3% | 2 |
| Noran.BitchingElk 0.054 | 6.7 | 7.6% | 7 |
| sch.Simone 0.3d | 8.0 | 6.6% | 1 |
| stelo.PatternRobot 1.0 | 8.8 | 5.8% | 4 |
| fullsail.SweetTea 1.1 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 90.8 | 22 / 35 | 5044 |
| 2 | 1 | 69.3 | 87.3 | 20 / 35 | 5230 |
| 3 | 1 | 68.7 | 87.9 | 14 / 35 | 5319 |
| 4 | 1 | 70.1 | 88.6 | 19 / 35 | 5487 |
| 5 | 1 | 68.6 | 84.4 | 17 / 35 | 5252 |
| 6 | 1 | 70.1 | 87.6 | 23 / 35 | 5502 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 60 | 53% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 45 | 76% |
| com.cohesiva.robocode.ManOwaR 1.0 | 20 | 85% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 100% |
| Noran.BitchingElk 0.054 | 11 | 82% |
| sch.Simone 0.3d | 5 | 100% |
| fnc.bandit.Bandit 5.2.0 | 5 | 100% |
| stelo.PatternRobot 1.0 | 2 | 50% |

Hadur died in 97 of 210 rounds, at a mean tick of 939. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 40 | 41% | 69 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 19 | 20% | 44 |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 11% | 34 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 9% | 19 |
| sch.Simone 0.3d | 6 | 6% | 13 |
| fnc.bandit.Bandit 5.2.0 | 6 | 6% | 12 |
| Noran.BitchingElk 0.054 | 3 | 3% | 13 |
| stelo.PatternRobot 1.0 | 3 | 3% | 6 |

Posture (Hadur's M records, 198 rounds): 159518 melee ticks, 43216 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 58 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 56902 sent, 52323 reached their opponent, 8887 virtual hits (17.0% of those reached).

## Melee bench: F03

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 123 over 6 battles (20.5 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 93.2 | 170 / 210 | 1.61 | 20.8% | 38022 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 20.8% | 170 |
| radnor.DoctorBob 1.42 | 2.2 | 13.6% | 15 |
| kawigi.nano.Lib 1.0 | 3.0 | 13.3% | 9 |
| vuen.Cake 2.51 | 3.8 | 12.5% | 15 |
| urdos.URDOS 1.3 | 5.2 | 8.9% | 0 |
| adt.Ar1 2.1 | 5.8 | 8.2% | 0 |
| oa.weak.FlyMk1 0.1 | 7.7 | 6.3% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 8.0 | 5.9% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.2 | 5.1% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.2 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 94.0 | 29 / 35 | 6044 |
| 2 | 1 | 71.3 | 93.0 | 29 / 35 | 6441 |
| 3 | 1 | 70.7 | 92.1 | 27 / 35 | 6104 |
| 4 | 1 | 69.6 | 89.2 | 23 / 35 | 6145 |
| 5 | 1 | 71.9 | 94.3 | 30 / 35 | 6678 |
| 6 | 1 | 72.5 | 96.8 | 32 / 35 | 6610 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 69 | 86% |
| radnor.DoctorBob 1.42 | 56 | 96% |
| kawigi.nano.Lib 1.0 | 46 | 96% |
| oa.weak.FlyMk1 0.1 | 6 | 83% |
| urdos.URDOS 1.3 | 4 | 100% |
| adt.Ar1 2.1 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 11 | 28% | 68 |
| radnor.DoctorBob 1.42 | 7 | 18% | 57 |
| urdos.URDOS 1.3 | 7 | 18% | 13 |
| kawigi.nano.Lib 1.0 | 6 | 15% | 39 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 13% | 7 |
| adt.Ar1 2.1 | 2 | 5% | 6 |
| oa.weak.FlyMk1 0.1 | 1 | 3% | 12 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 3% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 123433 melee ticks, 47080 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 63 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 37603 sent, 33101 reached their opponent, 8467 virtual hits (25.6% of those reached).

## Melee bench: F04

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 180 over 6 battles (30.0 per battle, most in one battle 111). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 87.7 | 36 / 210 | 2.11 | 18.4% | 36332 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.1% | 157 |
| hadur117.Hadur 3.20es | 2.0 | 18.4% | 36 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.5% | 10 |
| TNT.TNT 0.99.1 | 4.2 | 10.2% | 5 |
| josago.Jorgito 0.16 | 4.8 | 9.3% | 3 |
| css.Delitioner 0.11 | 6.0 | 7.3% | 0 |
| tj.zombie1n 1.0.1 | 7.3 | 6.1% | 0 |
| rampancy.Durandal 2.1d | 7.7 | 5.7% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.8% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.8 | 88.3 | 7 / 35 | 6404 |
| 2 | 2 | 68.4 | 83.8 | 3 / 35 | 6134 |
| 3 | 2 | 70.2 | 89.5 | 6 / 35 | 6466 |
| 4 | 2 | 68.9 | 87.9 | 7 / 35 | 5743 |
| 5 | 2 | 69.7 | 88.6 | 8 / 35 | 5916 |
| 6 | 2 | 68.7 | 87.9 | 5 / 35 | 5669 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 139 | 9% |
| apc.LeeroyJenkins2 1.0 | 14 | 79% |
| TNT.TNT 0.99.1 | 13 | 69% |
| josago.Jorgito 0.16 | 3 | 33% |
| tj.zombie1n 1.0.1 | 1 | 100% |
| css.Delitioner 0.11 | 1 | 100% |

Hadur died in 176 of 210 rounds, at a mean tick of 1372. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 136 | 77% | 151 |
| apc.LeeroyJenkins2 1.0 | 22 | 13% | 32 |
| josago.Jorgito 0.16 | 8 | 5% | 9 |
| TNT.TNT 0.99.1 | 5 | 3% | 13 |
| css.Delitioner 0.11 | 1 | 1% | 2 |
| rampancy.Durandal 2.1d | 1 | 1% | 2 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 190422 melee ticks, 88553 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 82 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 82 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 58098 sent, 53365 reached their opponent, 7993 virtual hits (15.0% of those reached).

## Melee bench: F05

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 605 over 6 battles (100.8 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 78.8 | 30 / 210 | 2.90 | 15.4% | 24840 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.5 | 17.7% | 96 |
| justin.DemonicRage 3.4 | 1.7 | 17.0% | 65 |
| hadur117.Hadur 3.20es | 2.8 | 15.4% | 30 |
| wompi.Numbat 2.1 | 4.0 | 12.3% | 14 |
| ms.Ares 0.19 | 5.3 | 9.7% | 1 |
| axeBots.HataMoto 3.09 | 5.7 | 8.8% | 4 |
| supersample.SuperBoxBot 1.0 | 7.3 | 5.9% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.5% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.1% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.6 | 79.4 | 5 / 35 | 4077 |
| 2 | 3 | 63.5 | 77.1 | 4 / 35 | 3857 |
| 3 | 3 | 65.4 | 80.6 | 6 / 35 | 4337 |
| 4 | 3 | 64.0 | 76.2 | 6 / 35 | 4113 |
| 5 | 3 | 64.6 | 77.8 | 5 / 35 | 4220 |
| 6 | 2 | 65.2 | 81.9 | 4 / 35 | 4236 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 44 | 18% |
| justin.DemonicRage 3.4 | 39 | 28% |
| wompi.Numbat 2.1 | 13 | 54% |
| axeBots.HataMoto 3.09 | 4 | 75% |
| ms.Ares 0.19 | 1 | 100% |

Hadur died in 185 of 210 rounds, at a mean tick of 924. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 70 | 38% | 82 |
| cb.fire.Firestarter 2.0f | 69 | 37% | 77 |
| wompi.Numbat 2.1 | 22 | 12% | 26 |
| axeBots.HataMoto 3.09 | 10 | 5% | 13 |
| ms.Ares 0.19 | 6 | 3% | 9 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 2 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 157111 melee ticks, 37891 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 56 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 47750 sent, 42760 reached their opponent, 7206 virtual hits (16.9% of those reached).

## Melee bench: F06

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 307 over 6 battles (51.2 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 91.9 | 145 / 210 | 1.73 | 20.6% | 34399 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 20.6% | 145 |
| jekl.StoneGhost 0.7 | 2.0 | 15.2% | 24 |
| origin.SleepSiphon 1.7b | 3.2 | 13.0% | 23 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.3 | 11.3% | 9 |
| mld.Wisdom 1.0 | 4.5 | 10.7% | 4 |
| gg.Wolverine 2.0 | 6.0 | 8.5% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 6.5% | 2 |
| DBall.NUKE 0.1 | 8.0 | 5.9% | 0 |
| spinnercat.Omen 1.0 | 8.7 | 5.7% | 1 |
| sample.Fire 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 90.8 | 23 / 35 | 5824 |
| 2 | 1 | 69.6 | 89.5 | 19 / 35 | 5268 |
| 3 | 1 | 71.8 | 92.1 | 26 / 35 | 6060 |
| 4 | 1 | 71.1 | 91.4 | 23 / 35 | 5741 |
| 5 | 1 | 71.4 | 92.4 | 26 / 35 | 5706 |
| 6 | 1 | 72.1 | 94.9 | 28 / 35 | 5800 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 72 | 92% |
| origin.SleepSiphon 1.7b | 53 | 83% |
| pe.minimelee.SandboxMiniMelee 1.1 | 20 | 85% |
| mld.Wisdom 1.0 | 9 | 89% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 71% |
| gg.Wolverine 2.0 | 6 | 67% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 873. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 22 | 33% | 75 |
| origin.SleepSiphon 1.7b | 21 | 31% | 70 |
| pe.minimelee.SandboxMiniMelee 1.1 | 6 | 9% | 21 |
| gg.Wolverine 2.0 | 6 | 9% | 12 |
| mld.Wisdom 1.0 | 5 | 7% | 16 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 4% | 10 |
| spinnercat.Omen 1.0 | 1 | 1% | 3 |
| DBall.NUKE 0.1 | 1 | 1% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 147885 melee ticks, 43724 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 32 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 45700 sent, 41075 reached their opponent, 8826 virtual hits (21.5% of those reached).

## Melee bench: F07

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 274 over 6 battles (45.7 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.1 | 93.9 | 125 / 210 | 1.55 | 21.3% | 41119 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 21.3% | 125 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 16.5% | 38 |
| rtk.Tachikoma 1.0 | 2.8 | 16.5% | 32 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.3% | 7 |
| franzor.Lizt 1.3.1 | 4.8 | 10.4% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 8.3% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.3% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.3% | 0 |
| sample.Target 1.0 | 9.2 | 2.2% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 93.0 | 16 / 35 | 6824 |
| 2 | 1 | 73.4 | 93.0 | 23 / 35 | 7014 |
| 3 | 1 | 74.2 | 96.5 | 25 / 35 | 7069 |
| 4 | 1 | 72.1 | 91.7 | 18 / 35 | 6566 |
| 5 | 1 | 73.6 | 95.6 | 24 / 35 | 6863 |
| 6 | 1 | 72.9 | 93.3 | 19 / 35 | 6783 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 102 | 75% |
| rsalesc.melee.Monk 0.3.6c | 45 | 31% |
| oog.melee.CapuletDroid 1.1 | 31 | 81% |
| franzor.Lizt 1.3.1 | 14 | 64% |

Hadur died in 87 of 210 rounds, at a mean tick of 1388. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 38 | 44% | 63 |
| rtk.Tachikoma 1.0 | 33 | 38% | 103 |
| oog.melee.CapuletDroid 1.1 | 8 | 9% | 39 |
| franzor.Lizt 1.3.1 | 5 | 6% | 1 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 3 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 180629 melee ticks, 88770 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 79 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 54886 sent, 50147 reached their opponent, 10049 virtual hits (20.0% of those reached).

## Melee bench: F08

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 489 over 6 battles (81.5 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 92.8 | 137 / 210 | 1.65 | 20.1% | 30767 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 20.1% | 137 |
| tm.Yuugao 1.0 | 2.2 | 13.3% | 31 |
| shrub.Vapour v159 | 2.8 | 12.4% | 22 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 10.9% | 8 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 9.9% | 6 |
| m3thos.Eva00 1.1 | 6.3 | 8.4% | 2 |
| jwst.DAD.DarkAndDarker 1.1 | 6.7 | 8.2% | 4 |
| qualidafial.MajorDick 1.0.1 | 8.2 | 6.8% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.2 | 4.9% | 0 |
| SHAM.WOW 1.4 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 91.7 | 23 / 35 | 4653 |
| 2 | 1 | 70.5 | 94.0 | 25 / 35 | 5219 |
| 3 | 1 | 71.4 | 95.2 | 26 / 35 | 5589 |
| 4 | 1 | 69.4 | 92.4 | 21 / 35 | 4928 |
| 5 | 1 | 69.0 | 88.9 | 20 / 35 | 5131 |
| 6 | 1 | 70.8 | 94.6 | 22 / 35 | 5247 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 64 | 72% |
| shrub.Vapour v159 | 41 | 63% |
| com.spp.robocode.MostlyHarmless 010 | 31 | 94% |
| Krabb.sliNk.Garm 0.9u | 28 | 75% |
| jwst.DAD.DarkAndDarker 1.1 | 8 | 75% |
| m3thos.Eva00 1.1 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 970. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 24 | 31% | 55 |
| tm.Yuugao 1.0 | 23 | 30% | 71 |
| Krabb.sliNk.Garm 0.9u | 11 | 14% | 29 |
| com.spp.robocode.MostlyHarmless 010 | 5 | 6% | 30 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 6% | 13 |
| qualidafial.MajorDick 1.0.1 | 4 | 5% | 4 |
| m3thos.Eva00 1.1 | 1 | 1% | 3 |
| SHAM.WOW 1.4 | 1 | 1% | 1 |
| zyx.nano.BacillusComma 1.0 | 0 | 0% | 4 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 150183 melee ticks, 51785 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 46 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 3.

Targeting waves (205 rounds): 48886 sent, 43986 reached their opponent, 8020 virtual hits (18.2% of those reached).

## Melee bench: F09

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 692 over 6 battles (115.3 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 78.6 | 65 / 210 | 2.93 | 16.0% | 22916 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 17.2% | 88 |
| hadur117.Hadur 3.20es | 2.0 | 16.0% | 65 |
| kc.micro.Figment 1.0 | 2.7 | 13.9% | 23 |
| pedersen.Grishnakh 1.0 | 4.5 | 10.8% | 19 |
| yagami.Tidus 0.11 | 4.7 | 10.8% | 2 |
| mc2.enemy.Original 0.9 | 6.0 | 9.1% | 10 |
| dft.Calliope 5.6 | 7.0 | 7.7% | 3 |
| step.nanoPri 1.0 | 8.2 | 5.6% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 4.5% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.4 | 70.8 | 7 / 35 | 3321 |
| 2 | 1 | 67.4 | 87.3 | 13 / 35 | 4246 |
| 3 | 2 | 64.4 | 78.1 | 6 / 35 | 3786 |
| 4 | 2 | 66.0 | 81.3 | 13 / 35 | 3941 |
| 5 | 3 | 62.9 | 72.4 | 9 / 35 | 3677 |
| 6 | 1 | 66.3 | 81.6 | 17 / 35 | 3945 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 45 | 36% |
| kc.micro.Figment 1.0 | 32 | 88% |
| pedersen.Grishnakh 1.0 | 13 | 23% |
| yagami.Tidus 0.11 | 12 | 100% |
| mc2.enemy.Original 0.9 | 7 | 29% |
| dft.Calliope 5.6 | 4 | 75% |
| rdm.Dueler 0.4x | 1 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 846. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 49 | 32% | 69 |
| kc.micro.Figment 1.0 | 26 | 17% | 51 |
| pedersen.Grishnakh 1.0 | 21 | 14% | 25 |
| yagami.Tidus 0.11 | 18 | 12% | 29 |
| mc2.enemy.Original 0.9 | 16 | 11% | 18 |
| dft.Calliope 5.6 | 7 | 5% | 9 |
| step.nanoPri 1.0 | 4 | 3% | 4 |
| robar.nano.Assertive_Melee 0.2 | 3 | 2% | 3 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 150439 melee ticks, 36964 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 50 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 49502 sent, 44794 reached their opponent, 6404 virtual hits (14.3% of those reached).

## Melee bench: F10

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 145 over 6 battles (24.2 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 96.8 | 172 / 210 | 1.29 | 21.4% | 36150 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 21.4% | 172 |
| DTF.Kludgy 1.2b | 2.3 | 13.9% | 19 |
| ne.Chimera 1.2 | 2.8 | 12.5% | 6 |
| ejb.Polaris 1.0.1 | 4.0 | 11.5% | 5 |
| vStar.RAFzilla 2.15 | 5.2 | 10.4% | 1 |
| tvv.micro.Antares 1.1.1 | 5.7 | 10.2% | 2 |
| sam.Samspin 1.0 | 7.7 | 5.7% | 1 |
| kurios.DOSexe .9b | 8.2 | 5.5% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 4.9% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 4.1% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 96.8 | 30 / 35 | 5947 |
| 2 | 1 | 72.5 | 97.5 | 29 / 35 | 6365 |
| 3 | 1 | 71.6 | 96.8 | 27 / 35 | 5757 |
| 4 | 1 | 71.9 | 94.3 | 27 / 35 | 6300 |
| 5 | 1 | 71.8 | 98.1 | 31 / 35 | 5501 |
| 6 | 1 | 72.4 | 97.5 | 28 / 35 | 6280 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 67 | 79% |
| ejb.Polaris 1.0.1 | 35 | 91% |
| ne.Chimera 1.2 | 33 | 91% |
| vStar.RAFzilla 2.15 | 25 | 96% |
| tvv.micro.Antares 1.1.1 | 18 | 100% |
| kurios.DOSexe .9b | 10 | 90% |
| sam.Samspin 1.0 | 5 | 80% |
| donjezza.Muncho 1.0 | 2 | 0% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 1078. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 20 | 53% | 67 |
| ne.Chimera 1.2 | 6 | 16% | 33 |
| ejb.Polaris 1.0.1 | 4 | 11% | 41 |
| vStar.RAFzilla 2.15 | 3 | 8% | 22 |
| donjezza.Muncho 1.0 | 2 | 5% | 4 |
| kurios.DOSexe .9b | 1 | 3% | 18 |
| tvv.micro.Antares 1.1.1 | 1 | 3% | 12 |
| sam.Samspin 1.0 | 1 | 3% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 205 rounds): 146367 melee ticks, 67230 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 47 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 48212 sent, 43262 reached their opponent, 8273 virtual hits (19.1% of those reached).

## Melee bench: F11

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 216 over 6 battles (36.0 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 81.6 | 66 / 210 | 2.66 | 16.2% | 22980 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.3 | 16.8% | 73 |
| hadur117.Hadur 3.20es | 1.7 | 16.2% | 66 |
| cx.mini.Nimrod 0.55 | 3.0 | 13.5% | 30 |
| djc.DynaBot 0.1.1 | 4.2 | 10.5% | 12 |
| rdt199.Warlord 0.73 | 5.2 | 9.3% | 16 |
| br2.MobyDickBot 1.6 | 6.7 | 7.6% | 6 |
| KiraNL.Chupacabra 0.4 | 6.8 | 7.5% | 3 |
| uji.YellohFellah 1.0 | 7.3 | 7.6% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.7% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 77.5 | 11 / 35 | 3743 |
| 2 | 2 | 65.3 | 82.5 | 12 / 35 | 3878 |
| 3 | 2 | 64.1 | 80.0 | 9 / 35 | 3825 |
| 4 | 2 | 65.5 | 82.9 | 9 / 35 | 4046 |
| 5 | 1 | 65.4 | 83.5 | 11 / 35 | 3934 |
| 6 | 1 | 64.7 | 83.2 | 14 / 35 | 3554 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 62 | 42% |
| cx.mini.Nimrod 0.55 | 16 | 44% |
| djc.DynaBot 0.1.1 | 16 | 81% |
| rdt199.Warlord 0.73 | 15 | 53% |
| br2.MobyDickBot 1.6 | 8 | 63% |
| uji.YellohFellah 1.0 | 7 | 71% |
| KiraNL.Chupacabra 0.4 | 3 | 67% |

Hadur died in 146 of 210 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 71 | 49% | 94 |
| cx.mini.Nimrod 0.55 | 27 | 18% | 35 |
| rdt199.Warlord 0.73 | 19 | 13% | 28 |
| djc.DynaBot 0.1.1 | 9 | 6% | 21 |
| br2.MobyDickBot 1.6 | 6 | 4% | 12 |
| uji.YellohFellah 1.0 | 5 | 3% | 9 |
| KiraNL.Chupacabra 0.4 | 4 | 3% | 6 |
| stelo.MirrorNano 1.3 | 3 | 2% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 153332 melee ticks, 35440 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 56 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 1.

Targeting waves (208 rounds): 51234 sent, 46239 reached their opponent, 6458 virtual hits (14.0% of those reached).

## Melee bench: F12

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 527 over 6 battles (87.8 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 89.1 | 135 / 210 | 1.98 | 18.8% | 25102 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 18.8% | 135 |
| bts.wiki.RipCurl 0.9b | 2.7 | 13.0% | 21 |
| nat.PallasHawk 1.0 | 3.2 | 12.9% | 30 |
| darkcanuck.Leon 1.01 | 3.3 | 12.6% | 13 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.8% | 9 |
| jrm.Test0 1.0 | 6.2 | 8.4% | 2 |
| cs.sheldor.Talon 1.1 | 7.2 | 6.9% | 0 |
| jp.Perpy 16.0 | 8.2 | 6.2% | 0 |
| stuff.Vlad 0.1 | 8.5 | 5.8% | 0 |
| jaybot.bots.Oddball 4.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 93.7 | 30 / 35 | 4433 |
| 2 | 1 | 68.2 | 88.9 | 21 / 35 | 4141 |
| 3 | 1 | 67.5 | 88.3 | 18 / 35 | 3821 |
| 4 | 1 | 68.9 | 90.2 | 23 / 35 | 4203 |
| 5 | 1 | 69.2 | 90.5 | 24 / 35 | 4413 |
| 6 | 1 | 66.8 | 83.2 | 19 / 35 | 4091 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 49 | 86% |
| nat.PallasHawk 1.0 | 48 | 69% |
| darkcanuck.Leon 1.01 | 41 | 83% |
| brainfade.melee.Genghis 0.36 | 19 | 95% |
| jrm.Test0 1.0 | 5 | 100% |
| jaybot.bots.Oddball 4.0 | 1 | 100% |
| jp.Perpy 16.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 22 | 27% | 57 |
| bts.wiki.RipCurl 0.9b | 18 | 22% | 44 |
| darkcanuck.Leon 1.01 | 13 | 16% | 57 |
| brainfade.melee.Genghis 0.36 | 10 | 12% | 20 |
| jrm.Test0 1.0 | 10 | 12% | 13 |
| jp.Perpy 16.0 | 1 | 1% | 6 |
| stuff.Vlad 0.1 | 1 | 1% | 5 |
| cs.sheldor.Talon 1.1 | 1 | 1% | 5 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 132350 melee ticks, 41004 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 74 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 74 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 45132 sent, 40084 reached their opponent, 6549 virtual hits (16.3% of those reached).

## Melee bench: F13

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 82 over 6 battles (13.7 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 82.4 | 49 / 210 | 2.59 | 16.1% | 26070 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.8 | 16.5% | 84 |
| ags.Glacier 0.2.11 | 2.0 | 16.5% | 48 |
| hadur117.Hadur 3.20es | 2.2 | 16.1% | 49 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.7% | 14 |
| shinh.Entangled 0.3 | 4.5 | 12.0% | 16 |
| apc.Colossus2 0.17 | 6.2 | 8.2% | 0 |
| stelo.Wang 1.0 | 6.8 | 6.7% | 1 |
| ayk.WallHugger 1.0 | 8.3 | 4.6% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.4% | 0 |
| sample.Tracker 1.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.4 | 78.7 | 5 / 35 | 4112 |
| 2 | 1 | 67.3 | 86.7 | 12 / 35 | 4627 |
| 3 | 3 | 64.2 | 80.6 | 5 / 35 | 4105 |
| 4 | 3 | 66.0 | 84.1 | 8 / 35 | 4401 |
| 5 | 2 | 64.2 | 79.7 | 7 / 35 | 4325 |
| 6 | 1 | 66.9 | 84.4 | 12 / 35 | 4500 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 45 | 31% |
| ags.Glacier 0.2.11 | 42 | 43% |
| shinh.Entangled 0.3 | 16 | 56% |
| gh.micro.Gruweltje 0.7 | 13 | 46% |
| stelo.Wang 1.0 | 2 | 100% |

Hadur died in 163 of 210 rounds, at a mean tick of 943. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 55 | 34% | 72 |
| mn.Combat 3.25.0 | 51 | 31% | 70 |
| shinh.Entangled 0.3 | 27 | 17% | 33 |
| gh.micro.Gruweltje 0.7 | 20 | 12% | 25 |
| stelo.Wang 1.0 | 5 | 3% | 7 |
| apc.Colossus2 0.17 | 2 | 1% | 2 |
| sample.Tracker 1.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 153306 melee ticks, 46035 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 54 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 44849 sent, 39822 reached their opponent, 6346 virtual hits (15.9% of those reached).

## Melee bench: F14

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 137 over 6 battles (22.8 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 95.5 | 172 / 210 | 1.40 | 21.5% | 36825 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 21.5% | 172 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.8% | 14 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.6% | 14 |
| sanyi.mikrobi.Roberto 1.0 | 4.8 | 9.7% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 5.3 | 8.9% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 5.5 | 8.8% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 7.9% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.5 | 7.8% | 1 |
| pa.Improved 1.0 | 9.0 | 6.1% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 94.6 | 27 / 35 | 5828 |
| 2 | 1 | 73.8 | 98.4 | 32 / 35 | 6785 |
| 3 | 1 | 71.3 | 92.4 | 29 / 35 | 5966 |
| 4 | 1 | 71.8 | 94.9 | 27 / 35 | 6045 |
| 5 | 1 | 71.7 | 96.2 | 26 / 35 | 5941 |
| 6 | 1 | 72.7 | 96.5 | 31 / 35 | 6260 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 81 | 93% |
| catcat20.shape.Theta 0.018 | 65 | 85% |
| sanyi.mikrobi.Roberto 1.0 | 20 | 95% |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 71% |
| co.edu.usb.rc.LidisTron 1.0 | 7 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |

Hadur died in 39 of 210 rounds, at a mean tick of 941. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 13 | 33% | 86 |
| catcat20.shape.Theta 0.018 | 12 | 31% | 58 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 15% | 21 |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 10% | 8 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 8% | 26 |
| co.edu.usb.rc.LidisTron 1.0 | 0 | 0% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 3 |
| pa.Improved 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 139449 melee ticks, 57753 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 24 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 43583 sent, 39040 reached their opponent, 9447 virtual hits (24.2% of those reached).

## Melee bench: F15

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 449 over 6 battles (74.8 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 90.5 | 139 / 210 | 1.86 | 20.0% | 32749 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 20.0% | 139 |
| kawigi.micro.Shiz 1.1 | 2.3 | 14.1% | 17 |
| emp.Yngwie 1.11 | 3.2 | 12.6% | 37 |
| mld.DustBunny 3.8 | 3.5 | 12.4% | 1 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.8% | 6 |
| kawigi.robot.Girl 1.2 | 6.0 | 8.8% | 9 |
| lambdaxy.TBot 0.1 | 7.3 | 6.9% | 0 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.4% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.3 | 4.6% | 0 |
| divineomega.TrialBot 0.003 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 91.7 | 25 / 35 | 5864 |
| 2 | 1 | 70.4 | 89.2 | 25 / 35 | 5466 |
| 3 | 1 | 70.3 | 92.7 | 21 / 35 | 5386 |
| 4 | 1 | 70.8 | 90.8 | 24 / 35 | 5686 |
| 5 | 1 | 71.1 | 93.0 | 26 / 35 | 5438 |
| 6 | 1 | 67.9 | 85.4 | 18 / 35 | 4909 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 54 | 94% |
| emp.Yngwie 1.11 | 51 | 65% |
| mld.DustBunny 3.8 | 30 | 100% |
| kawigi.robot.Girl 1.2 | 18 | 72% |
| cb.nano.Insomnia 1.0 | 13 | 69% |
| divineomega.TrialBot 0.003 | 1 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 991. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 33 | 44% | 91 |
| cb.nano.Insomnia 1.0 | 13 | 17% | 16 |
| kawigi.robot.Girl 1.2 | 9 | 12% | 12 |
| kawigi.micro.Shiz 1.1 | 8 | 11% | 41 |
| mld.DustBunny 3.8 | 4 | 5% | 30 |
| Grystrion.TrackerWO 1.0 | 3 | 4% | 4 |
| lambdaxy.TBot 0.1 | 2 | 3% | 7 |
| divineomega.TrialBot 0.003 | 0 | 0% | 8 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 160828 melee ticks, 53080 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 47 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 52671 sent, 47881 reached their opponent, 7824 virtual hits (16.3% of those reached).

## Melee bench: F16

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 669 over 6 battles (111.5 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 92.6 | 132 / 210 | 1.67 | 20.9% | 36476 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 20.9% | 132 |
| gh.Griezel 0.5.2 | 2.0 | 15.6% | 38 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.9% | 7 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.2% | 23 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.7% | 7 |
| tvv.nano.Polaris 1.2 | 6.0 | 8.7% | 2 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.6% | 0 |
| repositorio.NanoStep 1.0 | 8.3 | 4.9% | 0 |
| asd.Cthulhu 1.3 | 9.2 | 4.4% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.5 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 93.7 | 26 / 35 | 5997 |
| 2 | 1 | 73.1 | 95.2 | 27 / 35 | 6490 |
| 3 | 1 | 72.8 | 95.9 | 27 / 35 | 6592 |
| 4 | 1 | 70.1 | 91.1 | 19 / 35 | 5440 |
| 5 | 1 | 69.5 | 88.9 | 14 / 35 | 5826 |
| 6 | 1 | 71.1 | 90.8 | 19 / 35 | 6131 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 93 | 70% |
| techdude.forest.FlamingForest 1.1 | 42 | 62% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 26 | 88% |
| bvh.fnr.Fenrir 0.36l | 12 | 58% |
| stelo.IntrinsicVolatility 1.4 | 6 | 100% |
| tvv.nano.Polaris 1.2 | 3 | 100% |
| divineomega.DivineBot 1.9.4.5 | 2 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 1278. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 36 | 43% | 92 |
| techdude.forest.FlamingForest 1.1 | 18 | 21% | 42 |
| bvh.fnr.Fenrir 0.36l | 11 | 13% | 17 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 10 | 12% | 32 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 6 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 6 |
| stelo.IntrinsicVolatility 1.4 | 0 | 0% | 12 |
| asd.Cthulhu 1.3 | 0 | 0% | 1 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 175599 melee ticks, 74986 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 32 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 57050 sent, 52294 reached their opponent, 8749 virtual hits (16.7% of those reached).

## Melee bench: F17

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 739 over 6 battles (123.2 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 88.3 | 113 / 210 | 2.06 | 19.7% | 35573 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 19.7% | 113 |
| oog.melee.Mercutio 1.0 | 2.8 | 13.2% | 29 |
| et.Predator 1.8 | 3.0 | 13.3% | 23 |
| cx.BlestPain 1.41 | 3.2 | 12.6% | 36 |
| ahf.NanoAndrew .4 | 5.7 | 9.7% | 5 |
| nic.Nicator 2.4 | 5.8 | 9.3% | 4 |
| maribo.melee.BMV 0.1 | 6.5 | 8.7% | 0 |
| tex.Longbot 0.4 | 8.5 | 5.6% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.6% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 84.8 | 13 / 35 | 5363 |
| 2 | 1 | 69.7 | 87.0 | 20 / 35 | 5694 |
| 3 | 1 | 70.0 | 88.6 | 19 / 35 | 5877 |
| 4 | 1 | 71.1 | 88.6 | 25 / 35 | 6181 |
| 5 | 1 | 71.3 | 92.7 | 19 / 35 | 6366 |
| 6 | 1 | 70.0 | 87.9 | 17 / 35 | 6092 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 58 | 79% |
| et.Predator 1.8 | 46 | 76% |
| cx.BlestPain 1.41 | 41 | 37% |
| ahf.NanoAndrew .4 | 9 | 100% |
| nic.Nicator 2.4 | 3 | 100% |
| maribo.melee.BMV 0.1 | 3 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 1141. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 35 | 34% | 60 |
| oog.melee.Mercutio 1.0 | 25 | 24% | 70 |
| et.Predator 1.8 | 23 | 22% | 48 |
| ahf.NanoAndrew .4 | 8 | 8% | 17 |
| maribo.melee.BMV 0.1 | 4 | 4% | 7 |
| nic.Nicator 2.4 | 1 | 1% | 4 |
| tex.Longbot 0.4 | 1 | 1% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 164978 melee ticks, 70372 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 49 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 2.

Targeting waves (205 rounds): 54007 sent, 49286 reached their opponent, 10468 virtual hits (21.2% of those reached).

## Melee bench: F18

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 581 over 6 battles (96.8 per battle, most in one battle 149). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 93.3 | 150 / 210 | 1.60 | 20.4% | 30851 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 20.4% | 150 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.4% | 21 |
| agd.Mooserwirt2 2.7 | 3.2 | 12.0% | 10 |
| uji.DBH 1.1 | 3.7 | 11.3% | 16 |
| sigterm.Sigterm 1.0 | 6.0 | 8.5% | 9 |
| spinnercat.Robovirus 2.718 | 6.2 | 8.5% | 1 |
| ratosh.Nobo 0.21 | 6.5 | 8.0% | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 7.3 | 7.0% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 5.5% | 0 |
| stelo.WangRobot 1.0 | 9.5 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 92.7 | 25 / 35 | 4604 |
| 2 | 1 | 71.3 | 95.6 | 29 / 35 | 5252 |
| 3 | 1 | 71.7 | 96.8 | 29 / 35 | 5397 |
| 4 | 1 | 71.2 | 94.6 | 26 / 35 | 5335 |
| 5 | 1 | 68.8 | 88.9 | 18 / 35 | 5134 |
| 6 | 1 | 69.7 | 91.4 | 23 / 35 | 5129 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 69 | 78% |
| agd.Mooserwirt2 2.7 | 36 | 94% |
| uji.DBH 1.1 | 35 | 74% |
| sigterm.Sigterm 1.0 | 16 | 81% |
| spinnercat.Robovirus 2.718 | 9 | 89% |
| ratosh.Nobo 0.21 | 5 | 100% |
| stelo.WangRobot 1.0 | 4 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 23 | 34% | 69 |
| uji.DBH 1.1 | 16 | 24% | 43 |
| sigterm.Sigterm 1.0 | 7 | 10% | 12 |
| agd.Mooserwirt2 2.7 | 6 | 9% | 37 |
| ratosh.Nobo 0.21 | 4 | 6% | 9 |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 3% | 14 |
| spinnercat.Robovirus 2.718 | 2 | 3% | 10 |
| stelo.WangRobot 1.0 | 2 | 3% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 1% | 5 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 138474 melee ticks, 47925 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 49 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 2.

Targeting waves (205 rounds): 46840 sent, 41984 reached their opponent, 9050 virtual hits (21.6% of those reached).

## Melee bench: F19

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 180 over 6 battles (30.0 per battle, most in one battle 97). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.0 | 98.7 | 198 / 210 | 1.11 | 22.9% | 38663 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 22.9% | 198 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.6% | 4 |
| mld.Infinity 2.2 | 3.8 | 11.9% | 4 |
| krillr.mini.JointStrike 2.0.0 | 3.8 | 11.5% | 1 |
| erdnis.Rover 0.3 | 4.3 | 10.7% | 1 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.4% | 2 |
| mbh.Mbh 0.1 | 7.0 | 7.2% | 0 |
| pac.ABC 2.1 | 8.0 | 6.5% | 0 |
| pbg.R2D2 1.0 | 8.8 | 5.3% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.7 | 99.0 | 33 / 35 | 6223 |
| 2 | 1 | 74.1 | 99.4 | 34 / 35 | 6469 |
| 3 | 1 | 74.6 | 99.0 | 34 / 35 | 6699 |
| 4 | 1 | 74.4 | 98.7 | 34 / 35 | 6685 |
| 5 | 1 | 73.8 | 98.7 | 33 / 35 | 6357 |
| 6 | 1 | 73.3 | 97.5 | 30 / 35 | 6230 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 115 | 98% |
| mld.Infinity 2.2 | 31 | 97% |
| krillr.mini.JointStrike 2.0.0 | 28 | 100% |
| erdnis.Rover 0.3 | 15 | 100% |
| patson.PatsonTestBot 1.0 | 6 | 67% |
| pac.ABC 2.1 | 6 | 100% |

Hadur died in 13 of 210 rounds, at a mean tick of 844. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 6 | 46% | 73 |
| patson.PatsonTestBot 1.0 | 3 | 23% | 21 |
| mld.Infinity 2.2 | 2 | 15% | 30 |
| erdnis.Rover 0.3 | 1 | 8% | 26 |
| krillr.mini.JointStrike 2.0.0 | 0 | 0% | 25 |
| pac.ABC 2.1 | 0 | 0% | 11 |
| mbh.Mbh 0.1 | 0 | 0% | 10 |
| pbg.R2D2 1.0 | 0 | 0% | 8 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 128513 melee ticks, 49327 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 42 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 43435 sent, 38740 reached their opponent, 9072 virtual hits (23.4% of those reached).

## Melee bench: F20

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 311 over 6 battles (51.8 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 91.8 | 143 / 210 | 1.74 | 21.1% | 37748 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 21.1% | 143 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.7% | 32 |
| fwb.Nine 1.0.1 | 3.5 | 11.3% | 7 |
| nz.jdc.nano.GridFu 1.0 | 4.2 | 10.2% | 3 |
| catcat20.Rabbit 0.001 | 4.3 | 10.7% | 21 |
| m3thos.mini.Eva01 0.5.5 | 6.2 | 8.3% | 1 |
| bayen.nut.Squirrel 1.615 | 7.3 | 6.8% | 3 |
| ntc.ControlledChaos 1.1.4 | 7.8 | 6.2% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.8 | 5.6% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 93.0 | 25 / 35 | 6329 |
| 2 | 1 | 71.4 | 90.8 | 23 / 35 | 6257 |
| 3 | 1 | 71.8 | 92.7 | 25 / 35 | 6307 |
| 4 | 1 | 71.6 | 93.0 | 23 / 35 | 6002 |
| 5 | 1 | 72.6 | 93.3 | 27 / 35 | 6845 |
| 6 | 1 | 69.9 | 87.9 | 20 / 35 | 6008 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 88 | 77% |
| fwb.Nine 1.0.1 | 44 | 98% |
| catcat20.Rabbit 0.001 | 24 | 67% |
| nz.jdc.nano.GridFu 1.0 | 9 | 100% |
| m3thos.mini.Eva01 0.5.5 | 3 | 100% |
| bayen.nut.Squirrel 1.615 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 933. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 37 | 54% | 108 |
| catcat20.Rabbit 0.001 | 18 | 26% | 46 |
| fwb.Nine 1.0.1 | 4 | 6% | 6 |
| nz.jdc.nano.GridFu 1.0 | 2 | 3% | 16 |
| m3thos.mini.Eva01 0.5.5 | 2 | 3% | 14 |
| bayen.nut.Squirrel 1.615 | 2 | 3% | 12 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 3 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 164202 melee ticks, 57448 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 26 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 51016 sent, 46302 reached their opponent, 10091 virtual hits (21.8% of those reached).

## Melee bench: F21

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 537 over 6 battles (89.5 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 93.9 | 147 / 210 | 1.55 | 21.1% | 35780 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 21.1% | 147 |
| eem.EvBot v4.6.16 | 2.0 | 16.3% | 58 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.1% | 5 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 1 |
| eld.Hmm 1.0 | 5.3 | 7.9% | 2 |
| oa.weak.BotherBot 0.1 | 6.2 | 7.2% | 0 |
| fire219.CatBot 1.0 | 7.2 | 6.5% | 0 |
| PSW.Relentless 0.1 | 8.0 | 5.6% | 0 |
| el.JumpShoot 0.2 | 8.3 | 5.6% | 1 |
| arthord.MannyPacquiao Beta | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 91.4 | 22 / 35 | 5887 |
| 2 | 1 | 72.6 | 95.9 | 27 / 35 | 6098 |
| 3 | 1 | 72.5 | 94.6 | 25 / 35 | 6200 |
| 4 | 1 | 71.6 | 95.2 | 24 / 35 | 5678 |
| 5 | 1 | 72.1 | 94.6 | 25 / 35 | 6135 |
| 6 | 1 | 71.4 | 91.7 | 24 / 35 | 5782 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 131 | 68% |
| dummy.mini.Scimitar 1.01 | 36 | 94% |
| cf.RiO.RiOx 4.2.1 | 21 | 100% |
| eld.Hmm 1.0 | 3 | 67% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 1320. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 45 | 63% | 115 |
| dummy.mini.Scimitar 1.01 | 7 | 10% | 49 |
| cf.RiO.RiOx 4.2.1 | 5 | 7% | 24 |
| eld.Hmm 1.0 | 2 | 3% | 15 |
| PSW.Relentless 0.1 | 2 | 3% | 2 |
| fire219.CatBot 1.0 | 1 | 1% | 3 |
| el.JumpShoot 0.2 | 1 | 1% | 1 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 1 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 175842 melee ticks, 91023 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 41 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 51862 sent, 47084 reached their opponent, 7927 virtual hits (16.8% of those reached).

## Melee bench: F22

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 529 over 6 battles (88.2 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 89.7 | 96 / 210 | 1.92 | 19.1% | 32418 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 19.1% | 96 |
| pe.SandboxDT 2.71m | 2.2 | 16.3% | 55 |
| kvk.HebusLeTroll 0.35 | 2.8 | 14.6% | 27 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.3% | 21 |
| bigpete.Stewie 1.0 | 5.0 | 10.2% | 10 |
| yk.JahRoslav 1.1 | 6.5 | 6.9% | 0 |
| gg.Squaraus 0.6 | 7.2 | 6.5% | 0 |
| tad.Dalek98 0.98 | 7.3 | 6.3% | 1 |
| pbg.NinjaX 1.2 | 9.0 | 4.5% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 90.2 | 19 / 35 | 5525 |
| 2 | 1 | 69.4 | 89.2 | 15 / 35 | 5124 |
| 3 | 1 | 68.8 | 88.6 | 12 / 35 | 5244 |
| 4 | 1 | 70.7 | 91.1 | 17 / 35 | 5641 |
| 5 | 1 | 68.9 | 87.3 | 14 / 35 | 4987 |
| 6 | 1 | 70.9 | 92.1 | 19 / 35 | 5897 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 66 | 50% |
| jlm.javaDisturbance 0.59 | 43 | 74% |
| kvk.HebusLeTroll 0.35 | 39 | 51% |
| bigpete.Stewie 1.0 | 14 | 57% |
| tad.Dalek98 0.98 | 3 | 67% |
| pbg.NinjaX 1.2 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 1100. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 47 | 40% | 79 |
| kvk.HebusLeTroll 0.35 | 28 | 24% | 48 |
| jlm.javaDisturbance 0.59 | 23 | 19% | 53 |
| bigpete.Stewie 1.0 | 12 | 10% | 20 |
| tad.Dalek98 0.98 | 2 | 2% | 5 |
| pbg.NinjaX 1.2 | 2 | 2% | 4 |
| yk.JahRoslav 1.1 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 165956 melee ticks, 54133 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 47 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 51768 sent, 47125 reached their opponent, 7378 virtual hits (15.7% of those reached).

## Melee bench: F23

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 190 over 6 battles (31.7 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.8 | 96.2 | 184 / 210 | 1.34 | 22.5% | 38809 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 22.5% | 184 |
| pe.SandboxLump 1.52 | 2.2 | 16.5% | 17 |
| cre.Karolos 0.32 | 2.8 | 13.7% | 5 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 9.7% | 2 |
| stelo.RamTrackSurfer 1.2 | 5.2 | 9.1% | 1 |
| cw.megas.Blade 0.8 | 5.7 | 8.7% | 1 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.7 | 8.3% | 0 |
| sample.Walls 1.0 | 8.0 | 7.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.2 | 2.4% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.9 | 96.5 | 33 / 35 | 6374 |
| 2 | 1 | 74.3 | 97.1 | 33 / 35 | 6312 |
| 3 | 1 | 74.8 | 98.4 | 31 / 35 | 7010 |
| 4 | 1 | 73.4 | 96.2 | 30 / 35 | 6423 |
| 5 | 1 | 72.3 | 92.7 | 27 / 35 | 6011 |
| 6 | 1 | 74.4 | 96.2 | 30 / 35 | 6679 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 114 | 94% |
| cre.Karolos 0.32 | 48 | 94% |
| stelo.RamTrackSurfer 1.2 | 13 | 100% |
| stelo.AreaTargetingBot 1.1 | 9 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| cw.megas.Blade 0.8 | 5 | 100% |

Hadur died in 27 of 210 rounds, at a mean tick of 714. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 14 | 52% | 107 |
| cre.Karolos 0.32 | 5 | 19% | 45 |
| stelo.RamTrackSurfer 1.2 | 3 | 11% | 23 |
| sample.Walls 1.0 | 2 | 7% | 8 |
| stelo.AreaTargetingBot 1.1 | 1 | 4% | 14 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 4% | 6 |
| cw.megas.Blade 0.8 | 0 | 0% | 4 |
| cli.WasteOfAmmo 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 124997 melee ticks, 51332 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 40 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 38976 sent, 34134 reached their opponent, 9820 virtual hits (28.8% of those reached).

## Melee bench: F24

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 691 over 6 battles (115.2 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 83.7 | 91 / 210 | 2.47 | 17.3% | 25039 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 17.3% | 91 |
| rz.GlowBlowMelee 1.4 | 2.5 | 14.1% | 33 |
| davidalves.Phoenix 0.54 | 3.2 | 12.8% | 36 |
| florent.XSeries.X2 0.12 | 3.7 | 12.7% | 27 |
| pedersen.Ugluk 1.1.1 | 4.7 | 11.6% | 15 |
| oog.melee.Corsair 1.0 | 6.0 | 9.8% | 6 |
| stelo.SoJNanoMelee 1.1 | 7.2 | 7.0% | 2 |
| lunchie.Lunchbox 0.93 | 8.5 | 5.4% | 0 |
| as.FrankTheTank 1.3 | 9.0 | 5.0% | 0 |
| evd.X1 0.01 | 9.3 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 87.3 | 21 / 35 | 4333 |
| 2 | 1 | 65.6 | 81.0 | 14 / 35 | 4002 |
| 3 | 1 | 66.1 | 82.5 | 12 / 35 | 4165 |
| 4 | 1 | 66.8 | 84.4 | 18 / 35 | 4102 |
| 5 | 1 | 65.7 | 81.6 | 10 / 35 | 4199 |
| 6 | 1 | 67.1 | 85.1 | 16 / 35 | 4238 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 46 | 67% |
| davidalves.Phoenix 0.54 | 27 | 37% |
| florent.XSeries.X2 0.12 | 23 | 57% |
| pedersen.Ugluk 1.1.1 | 21 | 90% |
| oog.melee.Corsair 1.0 | 15 | 73% |
| stelo.SoJNanoMelee 1.1 | 4 | 100% |
| as.FrankTheTank 1.3 | 2 | 100% |
| evd.X1 0.01 | 2 | 50% |

Hadur died in 126 of 210 rounds, at a mean tick of 806. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 36 | 29% | 68 |
| florent.XSeries.X2 0.12 | 28 | 22% | 43 |
| davidalves.Phoenix 0.54 | 28 | 22% | 40 |
| pedersen.Ugluk 1.1.1 | 14 | 11% | 24 |
| oog.melee.Corsair 1.0 | 10 | 8% | 21 |
| evd.X1 0.01 | 4 | 3% | 6 |
| stelo.SoJNanoMelee 1.1 | 0 | 0% | 5 |
| as.FrankTheTank 1.3 | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 141290 melee ticks, 41796 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 55 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 47028 sent, 41971 reached their opponent, 7591 virtual hits (18.1% of those reached).

## Melee bench: F25

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 517 over 6 battles (86.2 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 88.1 | 134 / 210 | 2.07 | 18.8% | 24873 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 18.8% | 134 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 13.6% | 15 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 12.7% | 9 |
| jdw.Hurricane 1.4 | 4.0 | 11.7% | 21 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.3% | 13 |
| ds.Oo 2.2 | 5.7 | 8.8% | 8 |
| awesomeness.Elite 1.0 | 7.3 | 7.5% | 5 |
| adt.Ar2 1.1 | 8.0 | 6.9% | 2 |
| gjr.Cephalosporin 0.1 | 8.7 | 6.4% | 3 |
| amk.ChumbaMini 0.2 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 87.3 | 22 / 35 | 4052 |
| 2 | 1 | 68.7 | 89.2 | 23 / 35 | 4180 |
| 3 | 1 | 70.0 | 91.4 | 22 / 35 | 4721 |
| 4 | 1 | 66.0 | 82.9 | 20 / 35 | 3682 |
| 5 | 1 | 66.9 | 85.1 | 21 / 35 | 3578 |
| 6 | 1 | 70.5 | 93.0 | 26 / 35 | 4660 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 52 | 85% |
| voidious.micro.BlitzBat 1.05 | 33 | 97% |
| jdw.Hurricane 1.4 | 32 | 88% |
| ds.Oo 2.2 | 18 | 72% |
| gre.svman4.Morfeas 1.4.1 | 11 | 36% |
| awesomeness.Elite 1.0 | 6 | 100% |
| adt.Ar2 1.1 | 4 | 50% |
| gjr.Cephalosporin 0.1 | 3 | 67% |
| amk.ChumbaMini 0.2 | 3 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 672. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 17 | 21% | 53 |
| voidious.micro.BlitzBat 1.05 | 11 | 14% | 40 |
| gre.svman4.Morfeas 1.4.1 | 11 | 14% | 26 |
| ds.Oo 2.2 | 10 | 12% | 20 |
| awesomeness.Elite 1.0 | 9 | 11% | 16 |
| jdw.Hurricane 1.4 | 8 | 10% | 29 |
| adt.Ar2 1.1 | 5 | 6% | 10 |
| gjr.Cephalosporin 0.1 | 3 | 4% | 12 |
| amk.ChumbaMini 0.2 | 3 | 4% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 127115 melee ticks, 31079 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 42 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 44958 sent, 40158 reached their opponent, 6873 virtual hits (17.1% of those reached).

## Melee bench: F26

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 438 over 6 battles (73.0 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 94.9 | 159 / 210 | 1.46 | 21.7% | 39756 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 21.7% | 159 |
| ak.Fermat 2.0 | 2.0 | 15.1% | 21 |
| lrem.Spectre 0.4.4 | 3.5 | 12.1% | 11 |
| shu.nitro.LENIN .T34 | 3.7 | 12.0% | 17 |
| js.PinBall 1.6 | 5.0 | 10.5% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 5.8 | 9.1% | 0 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 7.6% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.9% | 0 |
| sample.SpinBot 1.0 | 9.0 | 3.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 96.2 | 28 / 35 | 6840 |
| 2 | 1 | 73.3 | 95.6 | 28 / 35 | 6981 |
| 3 | 1 | 72.7 | 95.6 | 26 / 35 | 6404 |
| 4 | 1 | 72.0 | 92.1 | 25 / 35 | 6342 |
| 5 | 1 | 72.5 | 94.0 | 24 / 35 | 6738 |
| 6 | 1 | 73.0 | 96.2 | 28 / 35 | 6451 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 68 | 82% |
| lrem.Spectre 0.4.4 | 44 | 84% |
| shu.nitro.LENIN .T34 | 38 | 92% |
| js.PinBall 1.6 | 16 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 9 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 6 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 1003. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 26 | 47% | 75 |
| lrem.Spectre 0.4.4 | 11 | 20% | 40 |
| shu.nitro.LENIN .T34 | 10 | 18% | 52 |
| js.PinBall 1.6 | 3 | 5% | 25 |
| jaybot.adv.bots.JayBot 2.0 | 1 | 2% | 8 |
| fullsail.LaxativeTeaTwo 1.0 | 0 | 0% | 8 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 157901 melee ticks, 52756 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 40 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 51140 sent, 46314 reached their opponent, 11088 virtual hits (23.9% of those reached).

## Melee bench: F27

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 294 over 6 battles (49.0 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.6 | 160 / 210 | 2.20 | 19.7% | 31909 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.2 | 19.7% | 160 |
| EH.Eagle 1.0.6 | 2.7 | 11.0% | 4 |
| mk.Alpha 0.2.1 | 2.7 | 13.1% | 28 |
| throxbot.ThroxBot 0.1 | 5.5 | 9.2% | 2 |
| sheldor.melee.nano.TestMelee 0.1 | 5.7 | 9.3% | 4 |
| wee.Gem 1.8.4 | 6.0 | 9.1% | 10 |
| techdude.kombat.FlamingKombat 1.5 | 6.3 | 8.9% | 2 |
| joe.ADinosaur 1.0 | 6.5 | 8.2% | 0 |
| caimano.Furia_Ceca 0.22 | 8.7 | 6.8% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 94.6 | 31 / 35 | 5747 |
| 2 | 1 | 70.9 | 94.0 | 31 / 35 | 5152 |
| 3 | 1 | 71.1 | 95.9 | 31 / 35 | 4987 |
| 4 | 1 | 71.3 | 95.2 | 31 / 35 | 5370 |
| 5 | 2 | 58.6 | 53.0 | 12 / 35 | 4662 |
| 6 | 1 | 70.4 | 87.0 | 24 / 35 | 5991 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 78 | 95% |
| EH.Eagle 1.0.6 | 40 | 100% |
| throxbot.ThroxBot 0.1 | 16 | 88% |
| techdude.kombat.FlamingKombat 1.5 | 12 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 89% |
| wee.Gem 1.8.4 | 5 | 80% |
| joe.ADinosaur 1.0 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 505. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cs.Grudge 1.0 | 15 | 29% | 15 |
| mk.Alpha 0.2.1 | 10 | 19% | 67 |
| throxbot.ThroxBot 0.1 | 5 | 10% | 19 |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 8% | 22 |
| joe.ADinosaur 1.0 | 4 | 8% | 9 |
| EH.Eagle 1.0.6 | 3 | 6% | 38 |
| techdude.kombat.FlamingKombat 1.5 | 3 | 6% | 17 |
| wee.Gem 1.8.4 | 3 | 6% | 14 |
| caimano.Furia_Ceca 0.22 | 3 | 6% | 7 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 125765 melee ticks, 39054 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 50 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 41452 sent, 36666 reached their opponent, 9202 virtual hits (25.1% of those reached).

## Melee bench: F28

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 380 over 6 battles (63.3 per battle, most in one battle 117). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 90.8 | 141 / 210 | 1.83 | 18.9% | 24514 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 18.9% | 141 |
| kid.test.NightFox .2 | 2.0 | 14.4% | 26 |
| uji.Antique 1.0 | 3.5 | 11.7% | 22 |
| pfvicm.Sobieski 7.2.3b | 4.2 | 10.6% | 5 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 10.7% | 8 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.1% | 4 |
| ahr.ice.Ice 1.0.2 | 6.5 | 8.2% | 3 |
| matt.advanced.Katana 1.0 | 8.8 | 6.0% | 1 |
| stelo.PianistNano 1.2 | 9.0 | 5.6% | 0 |
| stelo.Lifestealer 1.0 | 9.2 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 89.5 | 25 / 35 | 4132 |
| 2 | 1 | 68.6 | 91.4 | 25 / 35 | 4286 |
| 3 | 1 | 69.0 | 91.4 | 23 / 35 | 4171 |
| 4 | 1 | 67.3 | 88.6 | 20 / 35 | 3986 |
| 5 | 1 | 68.6 | 90.5 | 24 / 35 | 3931 |
| 6 | 1 | 68.8 | 93.3 | 24 / 35 | 4008 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 70 | 83% |
| uji.Antique 1.0 | 46 | 87% |
| pfvicm.Sobieski 7.2.3b | 17 | 88% |
| amk.ChumbaWumba 0.3 | 11 | 82% |
| qohnil.blot.BlotBot 3.61 | 11 | 82% |
| ahr.ice.Ice 1.0.2 | 6 | 83% |
| matt.advanced.Katana 1.0 | 2 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 723. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 15 | 21% | 47 |
| uji.Antique 1.0 | 13 | 18% | 58 |
| pfvicm.Sobieski 7.2.3b | 12 | 16% | 23 |
| qohnil.blot.BlotBot 3.61 | 11 | 15% | 28 |
| ahr.ice.Ice 1.0.2 | 9 | 12% | 20 |
| amk.ChumbaWumba 0.3 | 5 | 7% | 11 |
| matt.advanced.Katana 1.0 | 2 | 3% | 11 |
| stelo.Lifestealer 1.0 | 2 | 3% | 3 |
| stelo.PianistNano 1.2 | 1 | 1% | 7 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 130696 melee ticks, 37634 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 33 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 44441 sent, 39670 reached their opponent, 5744 virtual hits (14.5% of those reached).

## Melee bench: F29

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 252 over 6 battles (42.0 per battle, most in one battle 113). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 90.2 | 116 / 210 | 1.89 | 19.9% | 31062 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 19.9% | 116 |
| deewiant.Anomaly 0.2 | 2.5 | 15.0% | 42 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 15.4% | 43 |
| myl.micro.Troodon 1.10 | 4.2 | 11.4% | 1 |
| jok.PheonixM 0.1.2 | 4.8 | 10.4% | 7 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.2% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.2 | 5.8% | 0 |
| DBall.Anarchy 0.1 | 8.2 | 5.4% | 1 |
| ap.Frederick 1.1 | 9.0 | 4.5% | 0 |
| jangs.ns51 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 88.9 | 15 / 35 | 5170 |
| 2 | 1 | 69.2 | 84.4 | 18 / 35 | 4898 |
| 3 | 1 | 71.2 | 92.1 | 21 / 35 | 5206 |
| 4 | 1 | 71.7 | 94.6 | 23 / 35 | 5282 |
| 5 | 1 | 71.3 | 92.7 | 21 / 35 | 5298 |
| 6 | 1 | 70.3 | 88.3 | 18 / 35 | 5208 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 77 | 65% |
| zyx.mega.YersiniaPestis 3.1 | 56 | 57% |
| myl.micro.Troodon 1.10 | 21 | 95% |
| jok.PheonixM 0.1.2 | 12 | 83% |
| ph.melee.ArcherME 0.3 | 3 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 1047. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 43 | 44% | 95 |
| zyx.mega.YersiniaPestis 3.1 | 34 | 35% | 67 |
| myl.micro.Troodon 1.10 | 7 | 7% | 22 |
| jok.PheonixM 0.1.2 | 7 | 7% | 19 |
| ph.melee.ArcherME 0.3 | 4 | 4% | 6 |
| DBall.Anarchy 0.1 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 166449 melee ticks, 62536 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 32 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 53795 sent, 48962 reached their opponent, 7454 virtual hits (15.2% of those reached).

## Melee bench: F30

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 525 over 6 battles (87.5 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 78.4 | 57 / 210 | 2.95 | 16.0% | 25358 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 16.0% | 57 |
| catcat20.Matcha 0.006 | 2.7 | 14.0% | 57 |
| darkcanuck.B26354 1.06 | 2.7 | 13.9% | 48 |
| oog.melee.Capulet 1.2 | 3.8 | 13.0% | 24 |
| stelo.PastFuture 2.3.2 | 4.8 | 11.8% | 18 |
| intruder.PrairieWolf 2.61 | 6.5 | 8.6% | 3 |
| tripphippy.Alice 1.1 | 7.0 | 7.2% | 3 |
| ntc.Opposite 1.5 | 7.8 | 7.0% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 8.7 | 5.8% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 75.9 | 8 / 35 | 3936 |
| 2 | 1 | 65.5 | 78.7 | 12 / 35 | 4351 |
| 3 | 1 | 65.2 | 80.3 | 9 / 35 | 4236 |
| 4 | 1 | 65.6 | 80.0 | 8 / 35 | 4456 |
| 5 | 1 | 64.9 | 80.6 | 10 / 35 | 4248 |
| 6 | 1 | 63.3 | 74.6 | 10 / 35 | 4131 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 36 | 28% |
| darkcanuck.B26354 1.06 | 34 | 35% |
| oog.melee.Capulet 1.2 | 24 | 63% |
| stelo.PastFuture 2.3.2 | 15 | 67% |
| tripphippy.Alice 1.1 | 5 | 80% |
| intruder.PrairieWolf 2.61 | 5 | 80% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 100% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 48 | 31% | 55 |
| darkcanuck.B26354 1.06 | 40 | 25% | 50 |
| oog.melee.Capulet 1.2 | 22 | 14% | 41 |
| stelo.PastFuture 2.3.2 | 16 | 10% | 25 |
| tripphippy.Alice 1.1 | 10 | 6% | 13 |
| intruder.PrairieWolf 2.61 | 8 | 5% | 13 |
| ntc.Opposite 1.5 | 5 | 3% | 6 |
| fowl3628800.LightningBolt 2.6.0 | 3 | 2% | 5 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 160007 melee ticks, 38741 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 51 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 0.

Targeting waves (209 rounds): 51380 sent, 46400 reached their opponent, 7922 virtual hits (17.1% of those reached).

## Melee bench: F31

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 687 over 6 battles (114.5 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 82.6 | 80 / 210 | 2.57 | 16.9% | 23693 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.2 | 16.9% | 80 |
| abc.Shadow 3.84i | 1.8 | 16.6% | 69 |
| gh.mini.Griezel 0.2 | 3.0 | 13.6% | 41 |
| d414.nano.Quantum 1.0.0 | 4.2 | 11.4% | 9 |
| spinnercat.micro.Tyger 0.1 | 4.8 | 10.6% | 6 |
| gh.nano.Grofvuil 0.2 | 6.3 | 8.6% | 4 |
| timmit.nano.TimDog 0.33 | 7.0 | 6.6% | 1 |
| fm.mammillarias 1.3 | 8.2 | 5.7% | 1 |
| tlp.ThreeLeggedPig 1 | 9.2 | 5.1% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 83.5 | 15 / 35 | 4019 |
| 2 | 2 | 63.4 | 75.6 | 9 / 35 | 3810 |
| 3 | 1 | 67.1 | 85.4 | 18 / 35 | 3887 |
| 4 | 1 | 66.4 | 82.9 | 13 / 35 | 4058 |
| 5 | 1 | 65.6 | 83.2 | 11 / 35 | 3858 |
| 6 | 1 | 66.8 | 85.1 | 14 / 35 | 4061 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 53 | 53% |
| gh.mini.Griezel 0.2 | 44 | 64% |
| d414.nano.Quantum 1.0.0 | 16 | 81% |
| spinnercat.micro.Tyger 0.1 | 6 | 83% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 46 | 34% | 77 |
| gh.mini.Griezel 0.2 | 45 | 33% | 71 |
| spinnercat.micro.Tyger 0.1 | 17 | 13% | 23 |
| d414.nano.Quantum 1.0.0 | 9 | 7% | 20 |
| gh.nano.Grofvuil 0.2 | 7 | 5% | 9 |
| timmit.nano.TimDog 0.33 | 3 | 2% | 4 |
| fm.mammillarias 1.3 | 2 | 1% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 157257 melee ticks, 41229 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 40 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 50361 sent, 45435 reached their opponent, 7419 virtual hits (16.3% of those reached).

## Melee bench: F32

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 309 over 6 battles (51.5 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 92.5 | 140 / 210 | 1.68 | 19.7% | 29638 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 19.7% | 140 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.2% | 45 |
| apc.botM 3.0 | 3.0 | 11.9% | 12 |
| lxx.ConceptA 0.8 | 4.7 | 9.8% | 2 |
| vjik.UnViolation 1.1 | 5.0 | 9.6% | 3 |
| bayen.UbaMicro 1.4 | 5.5 | 8.7% | 3 |
| yk.JahMicro 1.0 | 7.5 | 7.1% | 4 |
| panzer.Panzer 0.2 | 7.5 | 7.3% | 1 |
| conscience.Electron 1.3g | 8.8 | 6.1% | 0 |
| donjezza.Jezza 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 91.7 | 24 / 35 | 5042 |
| 2 | 1 | 70.1 | 94.3 | 22 / 35 | 5129 |
| 3 | 1 | 68.7 | 89.8 | 20 / 35 | 4785 |
| 4 | 1 | 68.8 | 91.7 | 22 / 35 | 4707 |
| 5 | 1 | 70.8 | 96.2 | 27 / 35 | 5022 |
| 6 | 1 | 69.2 | 91.1 | 25 / 35 | 4953 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 104 | 68% |
| apc.botM 3.0 | 36 | 78% |
| vjik.UnViolation 1.1 | 14 | 100% |
| lxx.ConceptA 0.8 | 11 | 91% |
| yk.JahMicro 1.0 | 8 | 75% |
| bayen.UbaMicro 1.4 | 6 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |
| panzer.Panzer 0.2 | 2 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 861. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 36 | 49% | 96 |
| apc.botM 3.0 | 13 | 18% | 45 |
| lxx.ConceptA 0.8 | 7 | 10% | 17 |
| bayen.UbaMicro 1.4 | 6 | 8% | 12 |
| vjik.UnViolation 1.1 | 3 | 4% | 24 |
| yk.JahMicro 1.0 | 2 | 3% | 6 |
| conscience.Electron 1.3g | 2 | 3% | 2 |
| panzer.Panzer 0.2 | 1 | 1% | 5 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 128682 melee ticks, 60476 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 43 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 43748 sent, 38862 reached their opponent, 7029 virtual hits (18.1% of those reached).

## Melee bench: F33

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 724 over 6 battles (120.7 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.3 | 119 / 210 | 2.05 | 19.4% | 30529 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 19.4% | 119 |
| maribo.Quester 0.3 | 2.0 | 15.9% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.2% | 22 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 10.9% | 13 |
| labg.Cataclysm 2.05 | 4.8 | 10.5% | 14 |
| baal.nano.N 1.42 | 6.0 | 8.5% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 8.1% | 4 |
| zyx.micro.Ant 1.1 | 8.3 | 5.4% | 0 |
| sanja.First 0.1 | 8.8 | 4.7% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 91.7 | 20 / 35 | 5272 |
| 2 | 1 | 68.7 | 86.0 | 16 / 35 | 4866 |
| 3 | 1 | 69.4 | 87.0 | 21 / 35 | 4939 |
| 4 | 1 | 70.4 | 89.8 | 21 / 35 | 5318 |
| 5 | 1 | 69.3 | 87.3 | 19 / 35 | 5140 |
| 6 | 1 | 69.6 | 87.9 | 22 / 35 | 4994 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 72 | 81% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 40 | 70% |
| gre.svman4.Leonidas 1.3.2 | 20 | 90% |
| labg.Cataclysm 2.05 | 10 | 60% |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 60% |
| baal.nano.N 1.42 | 5 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 1031. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 34 | 35% | 85 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 20% | 53 |
| gre.svman4.Leonidas 1.3.2 | 16 | 16% | 23 |
| labg.Cataclysm 2.05 | 14 | 14% | 24 |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 5% | 12 |
| zyx.micro.Ant 1.1 | 3 | 3% | 4 |
| baal.nano.N 1.42 | 0 | 0% | 8 |
| sanja.First 0.1 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 173947 melee ticks, 51899 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 57 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 55015 sent, 50239 reached their opponent, 7374 virtual hits (14.7% of those reached).

## Melee bench: F34

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 478 over 6 battles (79.7 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 88.0 | 86 / 210 | 2.08 | 18.7% | 32145 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.2 | 18.7% | 86 |
| stelo.Spread 0.9 | 1.8 | 17.1% | 78 |
| kid.Gladiator .7.2 | 3.0 | 15.3% | 31 |
| jcs.Seth 1.8 | 4.0 | 12.1% | 15 |
| tcf.Reach 3 | 5.0 | 10.5% | 1 |
| cli.Dancer 1.1 | 6.0 | 9.2% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 6.6% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.6% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.3% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 88.6 | 12 / 35 | 5103 |
| 2 | 1 | 70.7 | 90.2 | 19 / 35 | 5683 |
| 3 | 1 | 69.8 | 88.6 | 15 / 35 | 5567 |
| 4 | 1 | 69.1 | 88.3 | 10 / 35 | 5154 |
| 5 | 1 | 70.0 | 89.2 | 16 / 35 | 5482 |
| 6 | 2 | 68.7 | 83.5 | 14 / 35 | 5156 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 86 | 45% |
| kid.Gladiator .7.2 | 56 | 57% |
| jcs.Seth 1.8 | 17 | 59% |
| tcf.Reach 3 | 3 | 100% |
| cli.Dancer 1.1 | 2 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 1142. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 56 | 43% | 100 |
| kid.Gladiator .7.2 | 42 | 33% | 62 |
| jcs.Seth 1.8 | 12 | 9% | 25 |
| tcf.Reach 3 | 8 | 6% | 15 |
| ratosh.Wesco 1.4 | 3 | 2% | 3 |
| cli.Dancer 1.1 | 1 | 1% | 2 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |
| sample.RamFire 1.0 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 175258 melee ticks, 63470 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 57 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 53428 sent, 48681 reached their opponent, 8100 virtual hits (16.6% of those reached).

## Melee bench: F35

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 439 over 6 battles (73.2 per battle, most in one battle 114). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 81.4 | 39 / 210 | 2.67 | 15.8% | 23079 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.7% | 145 |
| hadur117.Hadur 3.20es | 2.0 | 15.8% | 39 |
| gh.mini.Gruwel 0.9 | 3.7 | 12.7% | 16 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.0 | 12.1% | 8 |
| rz.HawkOnFire 0.1 | 4.3 | 12.0% | 3 |
| wit.Chuliath 1.0 | 6.5 | 6.6% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.2 | 6.1% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.7 | 5.7% | 0 |
| dans.Cinnamon 1.2 | 8.8 | 5.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 83.2 | 6 / 35 | 3750 |
| 2 | 2 | 64.0 | 79.7 | 5 / 35 | 3557 |
| 3 | 2 | 62.6 | 74.6 | 6 / 35 | 3564 |
| 4 | 2 | 66.8 | 84.4 | 9 / 35 | 4318 |
| 5 | 2 | 66.0 | 84.4 | 7 / 35 | 3856 |
| 6 | 2 | 65.4 | 82.2 | 6 / 35 | 4034 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 85 | 16% |
| gh.mini.Gruwel 0.9 | 20 | 55% |
| dmh.robocode.robot.BlackDeath 9.2 | 13 | 69% |
| rz.HawkOnFire 0.1 | 3 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 100% |

Hadur died in 176 of 210 rounds, at a mean tick of 935. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 98 | 56% | 117 |
| gh.mini.Gruwel 0.9 | 32 | 18% | 41 |
| dmh.robocode.robot.BlackDeath 9.2 | 23 | 13% | 27 |
| rz.HawkOnFire 0.1 | 11 | 6% | 14 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 2% | 5 |
| wit.Chuliath 1.0 | 2 | 1% | 3 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 2 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 148351 melee ticks, 45105 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 34 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 45631 sent, 40674 reached their opponent, 6259 virtual hits (15.4% of those reached).

## Melee bench: F36

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 310 over 6 battles (51.7 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 91.9 | 156 / 210 | 1.73 | 20.7% | 32726 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 20.7% | 156 |
| alpha.RainingFire 1.0 | 2.3 | 12.6% | 18 |
| bzdp.Pansy 2.1 | 3.2 | 12.3% | 9 |
| mz.Cork 0.1 | 4.5 | 11.2% | 8 |
| bvh.micro.Freya 0.3 | 5.2 | 10.4% | 12 |
| m3thos.Eva02 0.7.1 | 5.3 | 10.2% | 5 |
| bvh.mini.Fenrir 0.39 | 6.5 | 9.5% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 5.1% | 0 |
| dl.BetterWalls 1.0 | 8.5 | 4.8% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 90.5 | 23 / 35 | 5474 |
| 2 | 1 | 70.6 | 88.9 | 26 / 35 | 5271 |
| 3 | 1 | 72.1 | 95.6 | 28 / 35 | 5599 |
| 4 | 1 | 71.1 | 91.1 | 27 / 35 | 5366 |
| 5 | 1 | 71.5 | 92.7 | 26 / 35 | 5545 |
| 6 | 1 | 71.2 | 92.4 | 26 / 35 | 5471 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 46 | 98% |
| alpha.RainingFire 1.0 | 37 | 84% |
| mz.Cork 0.1 | 30 | 93% |
| bvh.micro.Freya 0.3 | 28 | 86% |
| m3thos.Eva02 0.7.1 | 19 | 89% |
| bvh.mini.Fenrir 0.39 | 7 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |
| sample.MyFirstRobot 1.0 | 2 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 16 | 29% | 48 |
| bzdp.Pansy 2.1 | 12 | 21% | 51 |
| m3thos.Eva02 0.7.1 | 9 | 16% | 32 |
| bvh.micro.Freya 0.3 | 8 | 14% | 30 |
| mz.Cork 0.1 | 5 | 9% | 33 |
| bvh.mini.Fenrir 0.39 | 3 | 5% | 9 |
| dl.BetterWalls 1.0 | 1 | 2% | 4 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 144265 melee ticks, 46476 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 49 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 49440 sent, 44723 reached their opponent, 8905 virtual hits (19.9% of those reached).

## Melee bench: F37

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 308 over 6 battles (51.3 per battle, most in one battle 108). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 89.6 | 166 / 210 | 1.93 | 19.5% | 33515 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 19.5% | 166 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.7 | 10.7% | 8 |
| EBBU.Sim2 1.02 | 3.8 | 10.0% | 4 |
| germ.TheMind .2 | 4.7 | 9.6% | 0 |
| lmk.ACPFinal 0.1 | 5.5 | 8.9% | 6 |
| stelo.UntouchableNano 1.3 | 5.5 | 9.2% | 12 |
| agrach.Dalek 1.0 | 6.0 | 8.8% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 7.3 | 8.4% | 0 |
| mb.Beast 0.1 | 9.0 | 7.6% | 4 |
| skm.Ryubot 1.0 | 9.5 | 7.2% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 87.9 | 27 / 35 | 5793 |
| 2 | 1 | 70.2 | 94.6 | 30 / 35 | 5708 |
| 3 | 1 | 66.9 | 84.4 | 23 / 35 | 5407 |
| 4 | 1 | 69.8 | 93.7 | 31 / 35 | 5509 |
| 5 | 1 | 68.9 | 89.8 | 27 / 35 | 5822 |
| 6 | 1 | 68.0 | 87.3 | 28 / 35 | 5276 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| EBBU.Sim2 1.02 | 31 | 100% |
| stelo.UntouchableNano 1.3 | 31 | 87% |
| com.syncleus.robocode.Dreadnaught 0.1 | 24 | 92% |
| agrach.Dalek 1.0 | 22 | 95% |
| germ.TheMind .2 | 21 | 100% |
| skm.Ryubot 1.0 | 15 | 100% |
| mb.Beast 0.1 | 14 | 100% |
| lmk.ACPFinal 0.1 | 14 | 86% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 424. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 10 | 21% | 14 |
| agrach.Dalek 1.0 | 8 | 17% | 40 |
| stelo.UntouchableNano 1.3 | 6 | 13% | 29 |
| lmk.ACPFinal 0.1 | 6 | 13% | 18 |
| com.syncleus.robocode.Dreadnaught 0.1 | 5 | 11% | 33 |
| germ.TheMind .2 | 4 | 9% | 14 |
| EBBU.Sim2 1.02 | 3 | 6% | 31 |
| mb.Beast 0.1 | 2 | 4% | 20 |
| skm.Ryubot 1.0 | 1 | 2% | 5 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 94686 melee ticks, 28685 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 40 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 32205 sent, 27721 reached their opponent, 8099 virtual hits (29.2% of those reached).

## Melee bench: F38

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 574 over 6 battles (95.7 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.9 | 113 / 210 | 2.09 | 18.5% | 28094 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.2 | 18.5% | 113 |
| justin.Mallais 14.0 | 1.8 | 16.2% | 60 |
| bvh.mini.Freya 0.55 | 3.3 | 11.9% | 6 |
| bts.mega.Gnarly 1.4 | 4.7 | 10.6% | 12 |
| kdf.KoulDestroyer 1.0 | 4.8 | 10.2% | 8 |
| cs.Wren 1.0 | 5.2 | 10.0% | 4 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.0 | 8.1% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.9% | 4 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.1% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 88.9 | 20 / 35 | 4600 |
| 2 | 1 | 68.2 | 87.3 | 18 / 35 | 4667 |
| 3 | 1 | 69.4 | 89.8 | 22 / 35 | 4707 |
| 4 | 1 | 67.5 | 86.0 | 18 / 35 | 4579 |
| 5 | 1 | 70.3 | 92.1 | 22 / 35 | 5110 |
| 6 | 2 | 66.5 | 83.5 | 13 / 35 | 4431 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 82 | 65% |
| bts.mega.Gnarly 1.4 | 21 | 67% |
| bvh.mini.Freya 0.55 | 18 | 83% |
| kdf.KoulDestroyer 1.0 | 11 | 82% |
| cs.Wren 1.0 | 11 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 8 | 63% |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 75% |
| matt.UnderDark3 2.4.34 | 3 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 42 | 42% | 93 |
| bts.mega.Gnarly 1.4 | 15 | 15% | 31 |
| bvh.mini.Freya 0.55 | 11 | 11% | 26 |
| kdf.KoulDestroyer 1.0 | 11 | 11% | 17 |
| cs.Wren 1.0 | 9 | 9% | 22 |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 5% | 11 |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 3% | 6 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 138581 melee ticks, 42696 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 26 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 45489 sent, 40431 reached their opponent, 8259 virtual hits (20.4% of those reached).

## Melee bench: F39

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 516 over 6 battles (86.0 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.3 | 108 / 210 | 2.06 | 18.9% | 31293 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 18.9% | 108 |
| bvh.fry.Freya 0.82 | 2.0 | 15.3% | 24 |
| az.Ololobot 0.2.4 | 3.0 | 13.3% | 45 |
| catcat20.Lambda 0.024 | 4.0 | 11.7% | 27 |
| gimp.GimpBot 0.1 | 5.7 | 7.7% | 0 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.4% | 3 |
| apollokidd.ApolloKidd 0.9 | 7.5 | 7.1% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 7.8 | 6.8% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.7% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.2 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 89.2 | 18 / 35 | 4828 |
| 2 | 1 | 68.0 | 87.6 | 14 / 35 | 5039 |
| 3 | 1 | 69.0 | 87.6 | 18 / 35 | 5509 |
| 4 | 1 | 70.0 | 91.7 | 20 / 35 | 5633 |
| 5 | 1 | 66.5 | 82.2 | 15 / 35 | 4871 |
| 6 | 1 | 70.0 | 91.1 | 23 / 35 | 5413 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 53 | 81% |
| az.Ololobot 0.2.4 | 43 | 51% |
| catcat20.Lambda 0.024 | 39 | 59% |
| winamp32.micro.MicroMacro 1.0 | 9 | 89% |
| gimp.GimpBot 0.1 | 6 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 5 | 80% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 1063. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 35 | 33% | 64 |
| bvh.fry.Freya 0.82 | 30 | 28% | 65 |
| catcat20.Lambda 0.024 | 27 | 25% | 47 |
| gimp.GimpBot 0.1 | 3 | 3% | 13 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 2 | 2% | 5 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 2 |
| apollokidd.ApolloKidd 0.9 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 169008 melee ticks, 56329 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 120 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 120 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 53166 sent, 48373 reached their opponent, 8215 virtual hits (17.0% of those reached).

## Melee bench: F40

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 386 over 6 battles (64.3 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 89.9 | 134 / 210 | 1.91 | 19.9% | 31392 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 19.9% | 134 |
| kawigi.mini.Coriantumr 1.1 | 2.2 | 14.8% | 30 |
| kano.gamma.KanoGamma 1.8 | 3.3 | 12.5% | 18 |
| mz.AntiGrav 1.0 | 3.5 | 12.3% | 10 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.5% | 6 |
| stelo.Randomness 1.0 | 6.3 | 8.7% | 9 |
| alpha.BlackIce 1.0 | 6.7 | 8.7% | 3 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.2% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 3.3% | 0 |
| sample.Corners 1.0 | 9.8 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.3 | 17 / 35 | 4985 |
| 2 | 1 | 70.8 | 91.1 | 23 / 35 | 5073 |
| 3 | 1 | 70.4 | 88.3 | 25 / 35 | 5213 |
| 4 | 1 | 70.1 | 90.8 | 21 / 35 | 4966 |
| 5 | 1 | 71.7 | 92.7 | 25 / 35 | 5685 |
| 6 | 1 | 70.7 | 89.2 | 23 / 35 | 5470 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 58 | 86% |
| kano.gamma.KanoGamma 1.8 | 38 | 82% |
| mz.AntiGrav 1.0 | 28 | 100% |
| Polkwane.SmashMelee 1.0 | 13 | 85% |
| stelo.Randomness 1.0 | 10 | 60% |
| alpha.BlackIce 1.0 | 7 | 86% |
| amk.superstrike.SuperStrike 0.3 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 20 | 25% | 62 |
| kano.gamma.KanoGamma 1.8 | 18 | 23% | 48 |
| Polkwane.SmashMelee 1.0 | 13 | 16% | 25 |
| alpha.BlackIce 1.0 | 8 | 10% | 17 |
| stelo.Randomness 1.0 | 8 | 10% | 17 |
| mz.AntiGrav 1.0 | 6 | 8% | 30 |
| amk.superstrike.SuperStrike 0.3 | 4 | 5% | 7 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 2 |
| sample.Corners 1.0 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 153210 melee ticks, 40507 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 97 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 97 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 50183 sent, 45302 reached their opponent, 9227 virtual hits (20.4% of those reached).

## Melee bench: F41

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 276 over 6 battles (46.0 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 88.3 | 108 / 210 | 2.06 | 18.5% | 27363 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.2 | 18.5% | 108 |
| eem.EvBotNG v12.8 | 1.8 | 16.4% | 71 |
| ary.Swarm 1.1 | 3.3 | 12.8% | 5 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.5% | 16 |
| simonton.nano.MeleeSeed 1.8 | 5.2 | 10.4% | 8 |
| shrub.Silver v048 | 5.8 | 9.2% | 1 |
| zyx.nano.Ant 1.1 | 7.0 | 7.5% | 0 |
| jsal.Jsalbot 1.0 | 8.2 | 5.4% | 1 |
| stelo.Mirror 1.1 | 8.8 | 5.0% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 87.6 | 18 / 35 | 4278 |
| 2 | 2 | 66.6 | 82.9 | 11 / 35 | 4429 |
| 3 | 1 | 69.3 | 89.5 | 22 / 35 | 4497 |
| 4 | 1 | 70.1 | 92.7 | 20 / 35 | 4799 |
| 5 | 1 | 70.1 | 90.5 | 22 / 35 | 4776 |
| 6 | 1 | 68.3 | 86.3 | 15 / 35 | 4584 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 78 | 55% |
| ary.Swarm 1.1 | 27 | 85% |
| lessonz.robocode.Oz 0.5.0 | 25 | 92% |
| simonton.nano.MeleeSeed 1.8 | 14 | 93% |
| shrub.Silver v048 | 5 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 945. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 56 | 54% | 96 |
| lessonz.robocode.Oz 0.5.0 | 17 | 16% | 33 |
| ary.Swarm 1.1 | 15 | 14% | 42 |
| simonton.nano.MeleeSeed 1.8 | 7 | 7% | 23 |
| shrub.Silver v048 | 3 | 3% | 8 |
| jsal.Jsalbot 1.0 | 2 | 2% | 5 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
| zyx.nano.Ant 1.1 | 1 | 1% | 1 |
| stelo.Mirror 1.1 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 155647 melee ticks, 44759 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 58 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 50854 sent, 45912 reached their opponent, 6947 virtual hits (15.1% of those reached).

## Melee bench: F42

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 191 over 6 battles (31.8 per battle, most in one battle 116). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 91.5 | 135 / 210 | 1.76 | 20.4% | 35957 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 20.4% | 135 |
| wompi.Wallaby 5.1 | 2.2 | 15.7% | 43 |
| maribo.mini.MiniQuester 0.1 | 3.0 | 13.6% | 9 |
| ara.Shera 0.88 | 3.8 | 12.7% | 22 |
| amz.NanoClone 1.41 | 5.0 | 8.6% | 0 |
| dsw.StaticD 1.0 | 6.5 | 6.7% | 1 |
| maribo.IotaCT 1.1 | 7.3 | 6.4% | 0 |
| stelo.MirrorMicro 1.0 | 7.7 | 6.0% | 0 |
| mme.NikeEnhanced 2.0 | 8.5 | 5.7% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 92.4 | 23 / 35 | 5810 |
| 2 | 1 | 69.8 | 87.0 | 19 / 35 | 5864 |
| 3 | 1 | 72.5 | 94.6 | 27 / 35 | 6345 |
| 4 | 1 | 69.8 | 89.2 | 19 / 35 | 5565 |
| 5 | 1 | 71.5 | 92.4 | 22 / 35 | 6283 |
| 6 | 1 | 71.5 | 93.7 | 25 / 35 | 6090 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 91 | 85% |
| maribo.mini.MiniQuester 0.1 | 42 | 88% |
| ara.Shera 0.88 | 28 | 61% |
| amz.NanoClone 1.41 | 2 | 100% |
| dsw.StaticD 1.0 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 999. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 33 | 42% | 99 |
| ara.Shera 0.88 | 28 | 36% | 52 |
| maribo.mini.MiniQuester 0.1 | 12 | 15% | 48 |
| amz.NanoClone 1.41 | 3 | 4% | 5 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 2 |
| dsw.StaticD 1.0 | 0 | 0% | 3 |
| maribo.IotaCT 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 164904 melee ticks, 50813 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 40 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 51261 sent, 46629 reached their opponent, 9189 virtual hits (19.7% of those reached).

## Melee bench: F43

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 681 over 6 battles (113.5 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 80.2 | 44 / 210 | 2.79 | 16.1% | 25193 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.0% | 131 |
| hadur117.Hadur 3.20es | 2.0 | 16.1% | 44 |
| brainfade.melee.Dusk 0.44 | 3.2 | 13.2% | 30 |
| dummy.micro.Sparrow 2.5 | 3.8 | 12.2% | 5 |
| wcsv.melee.EngineerMelee 0.1 | 5.2 | 10.8% | 2 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.8% | 1 |
| mz.NanoGod 2.02 | 7.5 | 7.1% | 0 |
| jab.DiamondStealer 5 | 7.5 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.2% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 77.8 | 4 / 35 | 3965 |
| 2 | 2 | 66.4 | 78.1 | 6 / 35 | 4380 |
| 3 | 2 | 65.9 | 79.0 | 11 / 35 | 3890 |
| 4 | 2 | 66.4 | 79.7 | 6 / 35 | 4224 |
| 5 | 2 | 67.2 | 81.9 | 10 / 35 | 4364 |
| 6 | 2 | 67.5 | 84.4 | 7 / 35 | 4370 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 80 | 28% |
| brainfade.melee.Dusk 0.44 | 28 | 54% |
| wcsv.melee.EngineerMelee 0.1 | 5 | 60% |
| Krabb.akim2.Akim2 1.1b | 3 | 100% |
| dummy.micro.Sparrow 2.5 | 3 | 33% |

Hadur died in 174 of 210 rounds, at a mean tick of 978. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 91 | 52% | 114 |
| brainfade.melee.Dusk 0.44 | 39 | 22% | 51 |
| dummy.micro.Sparrow 2.5 | 16 | 9% | 20 |
| wcsv.melee.EngineerMelee 0.1 | 7 | 4% | 9 |
| Krabb.akim2.Akim2 1.1b | 6 | 3% | 9 |
| jab.DiamondStealer 5 | 4 | 2% | 4 |
| mz.NanoGod 2.02 | 2 | 1% | 2 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 153619 melee ticks, 55396 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 30 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 30 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 49300 sent, 44276 reached their opponent, 7354 virtual hits (16.6% of those reached).

## Melee bench: F44

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 416 over 6 battles (69.3 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 93.5 | 147 / 210 | 1.58 | 21.0% | 35209 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 21.0% | 147 |
| stelo.Liblix 0.3.1 | 2.0 | 15.9% | 43 |
| tzu.TheArtOfWar 1.2 | 3.0 | 13.8% | 16 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.2 | 9.9% | 0 |
| jwirde.Gort 2.0 | 5.0 | 9.2% | 2 |
| disan.Chair 2.2.0 | 6.5 | 7.4% | 1 |
| stf.PanzerGeneral 0.1 | 7.2 | 6.9% | 0 |
| wompi.Quokka 1.6 | 7.2 | 6.7% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.6% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 93.3 | 26 / 35 | 6022 |
| 2 | 1 | 71.8 | 94.0 | 24 / 35 | 5738 |
| 3 | 1 | 71.5 | 94.6 | 24 / 35 | 5753 |
| 4 | 1 | 70.6 | 89.8 | 21 / 35 | 5768 |
| 5 | 1 | 71.9 | 95.2 | 26 / 35 | 5861 |
| 6 | 1 | 72.1 | 94.3 | 26 / 35 | 6067 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 96 | 73% |
| tzu.TheArtOfWar 1.2 | 55 | 85% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 15 | 100% |
| jwirde.Gort 2.0 | 11 | 100% |
| stf.PanzerGeneral 0.1 | 2 | 100% |
| disan.Chair 2.2.0 | 1 | 100% |
| wompi.Quokka 1.6 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 992. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 41 | 60% | 110 |
| tzu.TheArtOfWar 1.2 | 14 | 21% | 46 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 7% | 17 |
| jwirde.Gort 2.0 | 2 | 3% | 21 |
| stf.PanzerGeneral 0.1 | 2 | 3% | 4 |
| wompi.Quokka 1.6 | 1 | 1% | 4 |
| disan.Chair 2.2.0 | 0 | 0% | 5 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 156342 melee ticks, 49404 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 48 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 52786 sent, 48064 reached their opponent, 9715 virtual hits (20.2% of those reached).

## Melee bench: F45

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 729 over 6 battles (121.5 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 89.0 | 111 / 210 | 1.99 | 19.8% | 32778 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.0 | 19.8% | 111 |
| jje.BagPuss 1.2 | 2.3 | 12.2% | 7 |
| eem.IWillFireNoBullet v2.8 | 3.7 | 11.4% | 64 |
| myl.nano.Graviton 1.10 | 3.8 | 11.2% | 5 |
| sul.Lunar 1.1 | 4.2 | 11.2% | 15 |
| fm.claire 1.7 | 6.8 | 8.7% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 7.8% | 5 |
| hvilela.HVilela 0.9 | 7.2 | 8.4% | 0 |
| wit.Deep7 2.0 | 9.2 | 5.2% | 2 |
| abud.ThirdRobo 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 88.6 | 17 / 35 | 5592 |
| 2 | 1 | 70.9 | 90.8 | 25 / 35 | 5423 |
| 3 | 1 | 70.7 | 93.3 | 20 / 35 | 5400 |
| 4 | 1 | 69.3 | 87.9 | 17 / 35 | 5692 |
| 5 | 1 | 67.9 | 85.7 | 12 / 35 | 5260 |
| 6 | 1 | 69.6 | 87.6 | 20 / 35 | 5411 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 64 | 45% |
| sul.Lunar 1.1 | 29 | 79% |
| myl.nano.Graviton 1.10 | 25 | 92% |
| jje.BagPuss 1.2 | 23 | 78% |
| pez.mini.ChironexFleckeri 0.5 | 10 | 60% |
| wit.Deep7 2.0 | 6 | 100% |
| fm.claire 1.7 | 4 | 75% |
| hvilela.HVilela 0.9 | 2 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 1464. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 40 | 38% | 0 |
| jje.BagPuss 1.2 | 17 | 16% | 61 |
| sul.Lunar 1.1 | 14 | 13% | 58 |
| pez.mini.ChironexFleckeri 0.5 | 11 | 10% | 17 |
| myl.nano.Graviton 1.10 | 8 | 8% | 40 |
| hvilela.HVilela 0.9 | 4 | 4% | 17 |
| fm.claire 1.7 | 4 | 4% | 9 |
| wit.Deep7 2.0 | 1 | 1% | 7 |
| abud.ThirdRobo 1.0 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 201967 melee ticks, 83966 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 40 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 1.

Targeting waves (208 rounds): 61271 sent, 56452 reached their opponent, 8303 virtual hits (14.7% of those reached).

## Melee bench: F46

hadur117.Hadur 3.20es against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 680 over 6 battles (113.3 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 84.6 | 70 / 210 | 2.39 | 17.0% | 26641 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20es | 1.7 | 17.0% | 70 |
| kc.mini.Mirage 0.2 | 2.0 | 16.6% | 52 |
| rsalesc.melee.Medina 0.4.5 | 2.3 | 16.2% | 79 |
| mz.MicroSheep 1.0 | 4.8 | 10.2% | 4 |
| cx.Princess 1.0 | 5.0 | 9.6% | 3 |
| sadoner.killer 0.2 | 5.7 | 9.2% | 0 |
| arthord.NanoSatanMelee Beta | 6.5 | 7.9% | 2 |
| jeremyreeder.collective.Prophet 5 | 8.2 | 5.7% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.0% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 82.9 | 9 / 35 | 4410 |
| 2 | 2 | 66.0 | 82.2 | 9 / 35 | 4451 |
| 3 | 1 | 67.5 | 84.8 | 13 / 35 | 4532 |
| 4 | 2 | 66.5 | 84.1 | 12 / 35 | 4414 |
| 5 | 1 | 68.2 | 89.2 | 15 / 35 | 4663 |
| 6 | 2 | 66.6 | 84.4 | 12 / 35 | 4171 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 70 | 69% |
| rsalesc.melee.Medina 0.4.5 | 42 | 24% |
| mz.MicroSheep 1.0 | 7 | 86% |
| cx.Princess 1.0 | 6 | 83% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 983. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 59 | 40% | 107 |
| rsalesc.melee.Medina 0.4.5 | 50 | 34% | 64 |
| mz.MicroSheep 1.0 | 10 | 7% | 13 |
| sadoner.killer 0.2 | 9 | 6% | 10 |
| cx.Princess 1.0 | 7 | 5% | 10 |
| arthord.NanoSatanMelee Beta | 4 | 3% | 5 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 158252 melee ticks, 53870 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 31 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 0.

Targeting waves (209 rounds): 45804 sent, 40880 reached their opponent, 6186 virtual hits (15.1% of those reached).

