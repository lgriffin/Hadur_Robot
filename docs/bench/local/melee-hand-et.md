# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 319 over 6 battles (53.2 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 87.1 | 43 / 210 | 2.16 | 17.8% | 33360 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.8% | 149 |
| hadur117.Hadur 3.20et | 2.0 | 17.8% | 43 |
| sgp.JollyNinja 3.53 | 3.8 | 11.2% | 11 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 10.7% | 0 |
| lorneswork.Predator 1.0 | 4.5 | 10.7% | 4 |
| mz.MicroGodMelee 1 | 5.3 | 10.2% | 3 |
| adt.Ar2 1.0 | 7.0 | 7.8% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 4.8% | 0 |
| skm.butterfly 1.0 | 9.2 | 3.9% | 0 |
| mym.EdgeStalker 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.7 | 87.3 | 6 / 35 | 5325 |
| 2 | 2 | 67.3 | 85.4 | 9 / 35 | 5145 |
| 3 | 2 | 66.8 | 84.8 | 6 / 35 | 5075 |
| 4 | 2 | 69.4 | 91.1 | 8 / 35 | 6122 |
| 5 | 2 | 67.5 | 85.7 | 7 / 35 | 5351 |
| 6 | 2 | 69.6 | 88.6 | 7 / 35 | 6342 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 139 | 10% |
| sgp.JollyNinja 3.53 | 17 | 71% |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 100% |
| lorneswork.Predator 1.0 | 5 | 100% |
| mz.MicroGodMelee 1 | 5 | 60% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 169 of 210 rounds, at a mean tick of 1243. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 131 | 78% | 149 |
| sgp.JollyNinja 3.53 | 12 | 7% | 21 |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 5% | 16 |
| lorneswork.Predator 1.0 | 9 | 5% | 12 |
| adt.Ar2 1.0 | 4 | 2% | 5 |
| mz.MicroGodMelee 1 | 2 | 1% | 7 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 140425 melee ticks, 102894 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 65 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 44956 sent, 40105 reached their opponent, 8162 virtual hits (20.4% of those reached).

## Melee bench: F02

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 364 over 6 battles (60.7 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.3 | 114 / 210 | 2.23 | 19.1% | 31909 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 19.1% | 114 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.2 | 14.1% | 23 |
| pulsar.PulsarMax 0.8.9 | 2.8 | 13.6% | 33 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.9% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.7 | 10.6% | 19 |
| Noran.BitchingElk 0.054 | 6.7 | 7.8% | 12 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 7.9% | 2 |
| sch.Simone 0.3d | 7.3 | 7.2% | 4 |
| stelo.PatternRobot 1.0 | 9.0 | 5.4% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 91.7 | 26 / 35 | 5544 |
| 2 | 1 | 68.2 | 85.7 | 15 / 35 | 5059 |
| 3 | 1 | 67.8 | 83.5 | 17 / 35 | 5032 |
| 4 | 1 | 69.6 | 88.6 | 19 / 35 | 5454 |
| 5 | 1 | 66.4 | 78.7 | 15 / 35 | 4857 |
| 6 | 1 | 70.8 | 89.5 | 22 / 35 | 5963 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 68 | 84% |
| pulsar.PulsarMax 0.8.9 | 45 | 67% |
| com.cohesiva.robocode.ManOwaR 1.0 | 16 | 44% |
| Noran.BitchingElk 0.054 | 11 | 55% |
| sch.Simone 0.3d | 7 | 86% |
| lrem.micro.SpikeSoldier 0.4 | 4 | 75% |
| stelo.PatternRobot 1.0 | 3 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |
| fnc.bandit.Bandit 5.2.0 | 2 | 0% |

Hadur died in 98 of 210 rounds, at a mean tick of 968. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 27 | 28% | 48 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 21 | 21% | 75 |
| com.cohesiva.robocode.ManOwaR 1.0 | 14 | 14% | 26 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 9% | 16 |
| sch.Simone 0.3d | 7 | 7% | 16 |
| Noran.BitchingElk 0.054 | 6 | 6% | 14 |
| stelo.PatternRobot 1.0 | 5 | 5% | 7 |
| fnc.bandit.Bandit 5.2.0 | 5 | 5% | 6 |
| fullsail.SweetTea 1.1 | 2 | 2% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 163499 melee ticks, 44866 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 62 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 57583 sent, 52963 reached their opponent, 8818 virtual hits (16.6% of those reached).

## Melee bench: F03

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 142 over 6 battles (23.7 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 92.8 | 171 / 210 | 1.65 | 20.9% | 38815 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 20.9% | 171 |
| radnor.DoctorBob 1.42 | 2.2 | 13.5% | 12 |
| kawigi.nano.Lib 1.0 | 3.3 | 12.6% | 7 |
| vuen.Cake 2.51 | 3.5 | 12.8% | 19 |
| urdos.URDOS 1.3 | 5.0 | 9.3% | 1 |
| adt.Ar1 2.1 | 6.7 | 7.3% | 0 |
| oa.weak.FlyMk1 0.1 | 6.8 | 7.1% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 6.7% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.5 | 5.0% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 96.2 | 28 / 35 | 6833 |
| 2 | 1 | 72.4 | 96.5 | 29 / 35 | 6798 |
| 3 | 1 | 72.4 | 95.9 | 31 / 35 | 6791 |
| 4 | 1 | 69.8 | 88.6 | 26 / 35 | 5967 |
| 5 | 1 | 71.2 | 92.1 | 29 / 35 | 6439 |
| 6 | 1 | 69.5 | 87.3 | 28 / 35 | 5987 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 72 | 86% |
| radnor.DoctorBob 1.42 | 62 | 97% |
| kawigi.nano.Lib 1.0 | 42 | 98% |
| urdos.URDOS 1.3 | 4 | 100% |
| oa.weak.FlyMk1 0.1 | 3 | 100% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 671. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 13 | 33% | 75 |
| radnor.DoctorBob 1.42 | 7 | 18% | 57 |
| kawigi.nano.Lib 1.0 | 7 | 18% | 40 |
| urdos.URDOS 1.3 | 5 | 13% | 14 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 13% | 6 |
| oa.weak.FlyMk1 0.1 | 1 | 3% | 10 |
| adt.Ar1 2.1 | 1 | 3% | 5 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 3% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 127077 melee ticks, 39914 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 65 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 38130 sent, 33517 reached their opponent, 8752 virtual hits (26.1% of those reached).

## Melee bench: F04

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 718 over 6 battles (119.7 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 85.4 | 25 / 210 | 2.31 | 17.5% | 33393 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.7% | 176 |
| hadur117.Hadur 3.20et | 2.0 | 17.5% | 25 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.9% | 0 |
| TNT.TNT 0.99.1 | 4.0 | 10.8% | 8 |
| josago.Jorgito 0.16 | 5.0 | 8.7% | 1 |
| css.Delitioner 0.11 | 6.2 | 7.4% | 0 |
| tj.zombie1n 1.0.1 | 7.0 | 6.3% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.7% | 0 |
| spin.Bugstard 0.012b | 9.3 | 3.6% | 0 |
| sp.Nanos.Ember 1.1 | 9.7 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.6 | 84.4 | 5 / 35 | 5159 |
| 2 | 2 | 66.8 | 84.1 | 2 / 35 | 4964 |
| 3 | 2 | 69.2 | 87.0 | 6 / 35 | 5981 |
| 4 | 2 | 68.6 | 87.6 | 8 / 35 | 5505 |
| 5 | 2 | 69.1 | 87.0 | 2 / 35 | 6065 |
| 6 | 2 | 67.9 | 82.2 | 2 / 35 | 5719 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 129 | 4% |
| apc.LeeroyJenkins2 1.0 | 13 | 100% |
| TNT.TNT 0.99.1 | 11 | 45% |
| josago.Jorgito 0.16 | 2 | 100% |

Hadur died in 191 of 210 rounds, at a mean tick of 1302. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 144 | 75% | 151 |
| apc.LeeroyJenkins2 1.0 | 20 | 10% | 32 |
| TNT.TNT 0.99.1 | 14 | 7% | 20 |
| josago.Jorgito 0.16 | 3 | 2% | 3 |
| tj.zombie1n 1.0.1 | 2 | 1% | 2 |
| css.Delitioner 0.11 | 2 | 1% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 196180 melee ticks, 69463 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 73 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 59555 sent, 54800 reached their opponent, 8155 virtual hits (14.9% of those reached).

## Melee bench: F05

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 411 over 6 battles (68.5 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 79.3 | 39 / 210 | 2.87 | 15.7% | 25483 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 17.6% | 94 |
| justin.DemonicRage 3.4 | 2.0 | 16.9% | 59 |
| hadur117.Hadur 3.20et | 2.7 | 15.7% | 39 |
| wompi.Numbat 2.1 | 4.0 | 12.6% | 12 |
| axeBots.HataMoto 3.09 | 5.5 | 9.2% | 5 |
| ms.Ares 0.19 | 5.5 | 9.1% | 1 |
| supersample.SuperBoxBot 1.0 | 7.0 | 5.9% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.2 | 5.1% | 0 |
| GarmBox.Oranges 1.0 | 9.2 | 4.1% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.2 | 78.7 | 7 / 35 | 4310 |
| 2 | 2 | 67.1 | 85.1 | 9 / 35 | 4533 |
| 3 | 3 | 63.5 | 74.6 | 6 / 35 | 3950 |
| 4 | 3 | 65.9 | 80.3 | 6 / 35 | 4296 |
| 5 | 3 | 63.5 | 76.5 | 4 / 35 | 4104 |
| 6 | 2 | 65.0 | 80.3 | 7 / 35 | 4290 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 49 | 49% |
| cb.fire.Firestarter 2.0f | 33 | 9% |
| wompi.Numbat 2.1 | 8 | 75% |
| axeBots.HataMoto 3.09 | 5 | 80% |
| ms.Ares 0.19 | 1 | 100% |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 100% |

Hadur died in 174 of 210 rounds, at a mean tick of 921. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 69 | 40% | 89 |
| cb.fire.Firestarter 2.0f | 56 | 32% | 61 |
| wompi.Numbat 2.1 | 28 | 16% | 38 |
| ms.Ares 0.19 | 9 | 5% | 10 |
| axeBots.HataMoto 3.09 | 5 | 3% | 7 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 2% | 3 |
| supersample.SuperBoxBot 1.0 | 1 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 158988 melee ticks, 38258 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 68 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 68 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 48212 sent, 43222 reached their opponent, 7024 virtual hits (16.3% of those reached).

## Melee bench: F06

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 329 over 6 battles (54.8 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 92.7 | 146 / 210 | 1.66 | 20.6% | 33946 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 20.6% | 146 |
| jekl.StoneGhost 0.7 | 2.3 | 14.6% | 18 |
| origin.SleepSiphon 1.7b | 2.7 | 13.3% | 30 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.2% | 10 |
| mld.Wisdom 1.0 | 5.0 | 10.4% | 0 |
| gg.Wolverine 2.0 | 6.2 | 8.1% | 3 |
| spinnercat.Omen 1.0 | 7.8 | 6.3% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 7.8 | 6.3% | 3 |
| DBall.NUKE 0.1 | 8.2 | 5.7% | 0 |
| sample.Fire 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 92.7 | 24 / 35 | 5918 |
| 2 | 1 | 71.3 | 92.1 | 25 / 35 | 5533 |
| 3 | 1 | 70.9 | 91.1 | 24 / 35 | 5537 |
| 4 | 1 | 71.6 | 94.0 | 24 / 35 | 5788 |
| 5 | 1 | 70.4 | 92.4 | 25 / 35 | 5044 |
| 6 | 1 | 72.0 | 94.0 | 24 / 35 | 6126 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 70 | 90% |
| origin.SleepSiphon 1.7b | 46 | 83% |
| pe.minimelee.SandboxMiniMelee 1.1 | 28 | 89% |
| gg.Wolverine 2.0 | 13 | 85% |
| mld.Wisdom 1.0 | 4 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 50% |
| spinnercat.Omen 1.0 | 1 | 100% |
| DBall.NUKE 0.1 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 900. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 24 | 36% | 67 |
| origin.SleepSiphon 1.7b | 19 | 29% | 64 |
| pe.minimelee.SandboxMiniMelee 1.1 | 8 | 12% | 35 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 8% | 12 |
| mld.Wisdom 1.0 | 4 | 6% | 21 |
| gg.Wolverine 2.0 | 4 | 6% | 5 |
| DBall.NUKE 0.1 | 0 | 0% | 3 |
| spinnercat.Omen 1.0 | 0 | 0% | 2 |
| sample.Fire 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 150144 melee ticks, 44444 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 48 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 46418 sent, 41813 reached their opponent, 9383 virtual hits (22.4% of those reached).

## Melee bench: F07

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 625 over 6 battles (104.2 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 92.4 | 111 / 210 | 1.68 | 20.8% | 39731 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 20.8% | 111 |
| rtk.Tachikoma 1.0 | 2.3 | 16.5% | 35 |
| rsalesc.melee.Monk 0.3.6c | 2.7 | 16.8% | 46 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.3% | 7 |
| franzor.Lizt 1.3.1 | 4.8 | 10.6% | 11 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.1% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.2% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.3 | 2.3% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 94.3 | 20 / 35 | 6692 |
| 2 | 1 | 71.8 | 90.8 | 14 / 35 | 6391 |
| 3 | 1 | 72.3 | 91.1 | 18 / 35 | 6747 |
| 4 | 1 | 71.9 | 92.1 | 18 / 35 | 6306 |
| 5 | 1 | 73.0 | 93.7 | 21 / 35 | 6854 |
| 6 | 1 | 72.6 | 92.7 | 20 / 35 | 6741 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 83 | 67% |
| rsalesc.melee.Monk 0.3.6c | 55 | 29% |
| oog.melee.CapuletDroid 1.1 | 27 | 85% |
| franzor.Lizt 1.3.1 | 23 | 70% |

Hadur died in 104 of 210 rounds, at a mean tick of 1404. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 44 | 42% | 66 |
| rtk.Tachikoma 1.0 | 42 | 40% | 98 |
| oog.melee.CapuletDroid 1.1 | 6 | 6% | 32 |
| franzor.Lizt 1.3.1 | 6 | 6% | 3 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 2 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 5 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 184515 melee ticks, 91313 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 25 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 55572 sent, 50905 reached their opponent, 10255 virtual hits (20.1% of those reached).

## Melee bench: F08

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 721 over 6 battles (120.2 per battle, most in one battle 151). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 91.5 | 137 / 210 | 1.76 | 19.8% | 30003 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 19.8% | 137 |
| tm.Yuugao 1.0 | 2.2 | 14.0% | 28 |
| shrub.Vapour v159 | 3.0 | 13.1% | 33 |
| Krabb.sliNk.Garm 0.9u | 3.8 | 11.2% | 9 |
| com.spp.robocode.MostlyHarmless 010 | 5.5 | 9.3% | 1 |
| m3thos.Eva00 1.1 | 6.3 | 8.4% | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.1% | 2 |
| qualidafial.MajorDick 1.0.1 | 7.7 | 6.6% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 4.9% | 0 |
| SHAM.WOW 1.4 | 9.5 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 92.4 | 24 / 35 | 4800 |
| 2 | 1 | 70.4 | 94.3 | 29 / 35 | 4940 |
| 3 | 1 | 69.3 | 89.8 | 20 / 35 | 5059 |
| 4 | 1 | 69.3 | 88.6 | 22 / 35 | 5123 |
| 5 | 1 | 69.1 | 89.8 | 18 / 35 | 5062 |
| 6 | 1 | 70.6 | 94.3 | 24 / 35 | 5019 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 73 | 77% |
| shrub.Vapour v159 | 40 | 63% |
| Krabb.sliNk.Garm 0.9u | 33 | 85% |
| com.spp.robocode.MostlyHarmless 010 | 16 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 100% |
| m3thos.Eva00 1.1 | 3 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 935. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 25 | 32% | 47 |
| tm.Yuugao 1.0 | 22 | 28% | 81 |
| Krabb.sliNk.Garm 0.9u | 12 | 15% | 34 |
| com.spp.robocode.MostlyHarmless 010 | 5 | 6% | 17 |
| m3thos.Eva00 1.1 | 4 | 5% | 7 |
| jwst.DAD.DarkAndDarker 1.1 | 3 | 4% | 15 |
| SHAM.WOW 1.4 | 1 | 1% | 5 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 3 |
| zyx.nano.BacillusComma 1.0 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 149124 melee ticks, 54250 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 642 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 227 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 49457 sent, 44515 reached their opponent, 8086 virtual hits (18.2% of those reached).

## Melee bench: F09

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 322 over 6 battles (53.7 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 77.8 | 63 / 210 | 3.00 | 15.8% | 22427 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 16.9% | 86 |
| hadur117.Hadur 3.20et | 2.0 | 15.8% | 63 |
| kc.micro.Figment 1.0 | 2.8 | 14.5% | 32 |
| yagami.Tidus 0.11 | 4.2 | 11.1% | 6 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.6% | 12 |
| mc2.enemy.Original 0.9 | 6.3 | 8.5% | 10 |
| dft.Calliope 5.6 | 6.7 | 7.9% | 1 |
| step.nanoPri 1.0 | 8.0 | 5.8% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 4.6% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.3 | 76.8 | 11 / 35 | 3813 |
| 2 | 2 | 63.4 | 76.2 | 10 / 35 | 3623 |
| 3 | 2 | 65.1 | 80.0 | 11 / 35 | 3843 |
| 4 | 2 | 66.2 | 82.2 | 11 / 35 | 3955 |
| 5 | 3 | 59.8 | 67.0 | 6 / 35 | 3191 |
| 6 | 1 | 66.9 | 84.4 | 14 / 35 | 4002 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 52 | 37% |
| kc.micro.Figment 1.0 | 36 | 75% |
| mc2.enemy.Original 0.9 | 9 | 56% |
| yagami.Tidus 0.11 | 9 | 78% |
| pedersen.Grishnakh 1.0 | 6 | 0% |
| dft.Calliope 5.6 | 5 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 61 | 41% | 79 |
| kc.micro.Figment 1.0 | 24 | 16% | 50 |
| yagami.Tidus 0.11 | 24 | 16% | 31 |
| mc2.enemy.Original 0.9 | 15 | 10% | 20 |
| pedersen.Grishnakh 1.0 | 14 | 9% | 15 |
| dft.Calliope 5.6 | 3 | 2% | 8 |
| step.nanoPri 1.0 | 3 | 2% | 3 |
| robar.nano.Assertive_Melee 0.2 | 2 | 1% | 3 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 146965 melee ticks, 39466 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 561 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 225 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 48377 sent, 43558 reached their opponent, 6065 virtual hits (13.9% of those reached).

## Melee bench: F10

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 235 over 6 battles (39.2 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 96.0 | 171 / 210 | 1.36 | 21.2% | 35971 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 21.2% | 171 |
| DTF.Kludgy 1.2b | 2.3 | 13.9% | 13 |
| ne.Chimera 1.2 | 3.2 | 13.1% | 9 |
| ejb.Polaris 1.0.1 | 3.5 | 12.7% | 11 |
| tvv.micro.Antares 1.1.1 | 5.5 | 9.9% | 3 |
| vStar.RAFzilla 2.15 | 5.5 | 9.7% | 2 |
| kurios.DOSexe .9b | 7.5 | 5.7% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.2% | 0 |
| sam.Samspin 1.0 | 8.3 | 5.0% | 0 |
| donjezza.Muncho 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 98.4 | 31 / 35 | 6037 |
| 2 | 1 | 72.9 | 98.1 | 31 / 35 | 6279 |
| 3 | 1 | 71.4 | 95.2 | 28 / 35 | 5662 |
| 4 | 1 | 71.2 | 94.9 | 27 / 35 | 5805 |
| 5 | 1 | 71.4 | 95.2 | 27 / 35 | 5873 |
| 6 | 1 | 71.9 | 94.3 | 27 / 35 | 6315 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 68 | 85% |
| ejb.Polaris 1.0.1 | 50 | 90% |
| ne.Chimera 1.2 | 36 | 83% |
| vStar.RAFzilla 2.15 | 15 | 93% |
| tvv.micro.Antares 1.1.1 | 14 | 100% |
| kurios.DOSexe .9b | 5 | 100% |
| sam.Samspin 1.0 | 4 | 100% |
| donjezza.Muncho 1.0 | 1 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 17 | 41% | 65 |
| ne.Chimera 1.2 | 10 | 24% | 42 |
| ejb.Polaris 1.0.1 | 7 | 17% | 52 |
| tvv.micro.Antares 1.1.1 | 3 | 7% | 17 |
| vStar.RAFzilla 2.15 | 1 | 2% | 17 |
| donjezza.Muncho 1.0 | 1 | 2% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 1 |
| kurios.DOSexe .9b | 0 | 0% | 7 |
| sam.Samspin 1.0 | 0 | 0% | 6 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 145628 melee ticks, 57924 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 73 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 47348 sent, 42580 reached their opponent, 8152 virtual hits (19.1% of those reached).

## Melee bench: F11

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 102 over 6 battles (17.0 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 83.8 | 78 / 210 | 2.46 | 17.0% | 24616 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.3 | 17.0% | 78 |
| rz.Aleph 0.34 | 1.7 | 15.9% | 71 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.9% | 22 |
| djc.DynaBot 0.1.1 | 4.0 | 11.0% | 10 |
| rdt199.Warlord 0.73 | 5.7 | 9.1% | 12 |
| br2.MobyDickBot 1.6 | 5.8 | 9.0% | 12 |
| uji.YellohFellah 1.0 | 6.7 | 7.9% | 6 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.2% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.3% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 84.1 | 18 / 35 | 4389 |
| 2 | 2 | 65.5 | 81.3 | 12 / 35 | 4049 |
| 3 | 2 | 65.3 | 83.8 | 9 / 35 | 3950 |
| 4 | 1 | 66.4 | 84.1 | 16 / 35 | 4189 |
| 5 | 1 | 66.3 | 85.7 | 12 / 35 | 4041 |
| 6 | 1 | 65.5 | 83.8 | 11 / 35 | 3998 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 59 | 39% |
| djc.DynaBot 0.1.1 | 25 | 84% |
| cx.mini.Nimrod 0.55 | 15 | 67% |
| uji.YellohFellah 1.0 | 12 | 83% |
| rdt199.Warlord 0.73 | 11 | 64% |
| br2.MobyDickBot 1.6 | 10 | 60% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 911. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 64 | 48% | 87 |
| cx.mini.Nimrod 0.55 | 19 | 14% | 27 |
| rdt199.Warlord 0.73 | 16 | 12% | 33 |
| djc.DynaBot 0.1.1 | 9 | 7% | 26 |
| br2.MobyDickBot 1.6 | 7 | 5% | 10 |
| KiraNL.Chupacabra 0.4 | 6 | 5% | 11 |
| uji.YellohFellah 1.0 | 6 | 5% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 2% | 4 |
| stelo.MirrorNano 1.3 | 2 | 2% | 2 |

Posture (Hadur's M records, 208 rounds): 160394 melee ticks, 41862 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 40 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 51928 sent, 46909 reached their opponent, 6394 virtual hits (13.6% of those reached).

## Melee bench: F12

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 113 over 6 battles (18.8 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 88.5 | 130 / 210 | 2.03 | 18.7% | 25141 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 18.7% | 130 |
| bts.wiki.RipCurl 0.9b | 2.2 | 13.8% | 25 |
| nat.PallasHawk 1.0 | 2.8 | 12.8% | 29 |
| darkcanuck.Leon 1.01 | 4.0 | 12.2% | 11 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.1% | 9 |
| jrm.Test0 1.0 | 6.0 | 8.4% | 2 |
| cs.sheldor.Talon 1.1 | 7.2 | 7.3% | 1 |
| jp.Perpy 16.0 | 8.5 | 6.0% | 2 |
| stuff.Vlad 0.1 | 8.7 | 5.7% | 1 |
| jaybot.bots.Oddball 4.0 | 9.7 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 88.3 | 20 / 35 | 4382 |
| 2 | 1 | 68.9 | 89.8 | 25 / 35 | 4320 |
| 3 | 1 | 67.0 | 86.3 | 16 / 35 | 4003 |
| 4 | 1 | 69.4 | 91.4 | 27 / 35 | 4214 |
| 5 | 1 | 66.8 | 85.7 | 19 / 35 | 3816 |
| 6 | 1 | 69.2 | 89.5 | 23 / 35 | 4406 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 45 | 91% |
| nat.PallasHawk 1.0 | 41 | 73% |
| darkcanuck.Leon 1.01 | 41 | 93% |
| brainfade.melee.Genghis 0.36 | 11 | 73% |
| jrm.Test0 1.0 | 7 | 71% |
| jaybot.bots.Oddball 4.0 | 5 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| jp.Perpy 16.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 0% |

Hadur died in 83 of 210 rounds, at a mean tick of 676. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 22 | 27% | 52 |
| nat.PallasHawk 1.0 | 20 | 24% | 53 |
| brainfade.melee.Genghis 0.36 | 14 | 17% | 20 |
| darkcanuck.Leon 1.01 | 9 | 11% | 53 |
| jrm.Test0 1.0 | 8 | 10% | 13 |
| cs.sheldor.Talon 1.1 | 5 | 6% | 11 |
| stuff.Vlad 0.1 | 3 | 4% | 3 |
| jp.Perpy 16.0 | 1 | 1% | 2 |
| jaybot.bots.Oddball 4.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 130197 melee ticks, 36567 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 75 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 75 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 44661 sent, 39720 reached their opponent, 6782 virtual hits (17.1% of those reached).

## Melee bench: F13

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 90 over 6 battles (15.0 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 83.2 | 62 / 210 | 2.51 | 16.4% | 26248 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.8 | 16.4% | 62 |
| ags.Glacier 0.2.11 | 2.0 | 16.4% | 42 |
| mn.Combat 3.25.0 | 2.2 | 16.4% | 86 |
| shinh.Entangled 0.3 | 4.2 | 12.0% | 12 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.3% | 8 |
| apc.Colossus2 0.17 | 6.0 | 7.8% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.6% | 0 |
| ayk.WallHugger 1.0 | 8.3 | 5.1% | 0 |
| maribo.FollowFire 1 | 8.7 | 5.0% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 85.1 | 14 / 35 | 4334 |
| 2 | 1 | 66.3 | 86.0 | 12 / 35 | 4209 |
| 3 | 3 | 64.1 | 80.6 | 3 / 35 | 4212 |
| 4 | 3 | 65.3 | 78.1 | 10 / 35 | 4639 |
| 5 | 1 | 67.1 | 86.3 | 12 / 35 | 4503 |
| 6 | 2 | 65.9 | 83.2 | 11 / 35 | 4351 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 52 | 63% |
| mn.Combat 3.25.0 | 51 | 20% |
| shinh.Entangled 0.3 | 16 | 69% |
| gh.micro.Gruweltje 0.7 | 10 | 70% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 66 | 45% | 80 |
| ags.Glacier 0.2.11 | 42 | 28% | 75 |
| shinh.Entangled 0.3 | 25 | 17% | 33 |
| gh.micro.Gruweltje 0.7 | 7 | 5% | 13 |
| stelo.Wang 1.0 | 3 | 2% | 4 |
| maribo.FollowFire 1 | 3 | 2% | 3 |
| apc.Colossus2 0.17 | 2 | 1% | 2 |

Posture (Hadur's M records, 202 rounds): 147116 melee ticks, 43673 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 91 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 79 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 42924 sent, 37823 reached their opponent, 6058 virtual hits (16.0% of those reached).

## Melee bench: F14

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 139 over 6 battles (23.2 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 94.7 | 157 / 210 | 1.48 | 21.1% | 36154 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 21.1% | 157 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.1% | 17 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.9% | 27 |
| sanyi.mikrobi.Roberto 1.0 | 4.7 | 9.9% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 5.3 | 9.1% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 5.3 | 9.5% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 7.6% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.7 | 7.5% | 0 |
| pa.Improved 1.0 | 9.0 | 5.6% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 93.0 | 24 / 35 | 5645 |
| 2 | 1 | 72.2 | 94.9 | 24 / 35 | 6415 |
| 3 | 1 | 71.4 | 94.6 | 28 / 35 | 5710 |
| 4 | 1 | 72.0 | 96.2 | 27 / 35 | 6119 |
| 5 | 1 | 72.8 | 96.5 | 28 / 35 | 6220 |
| 6 | 1 | 71.6 | 93.0 | 26 / 35 | 6045 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 70 | 91% |
| catcat20.shape.Theta 0.018 | 62 | 69% |
| sanyi.mikrobi.Roberto 1.0 | 20 | 95% |
| co.edu.usb.rc.LidisTron 1.0 | 15 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 78% |
| Lo_Ian.Gandalf_V4 4.0 | 8 | 88% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 902. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 24 | 45% | 62 |
| simonton.micro.Sprout 1.1.3 | 16 | 30% | 84 |
| sanyi.mikrobi.Roberto 1.0 | 6 | 11% | 26 |
| sheldor.micro.PointInLineRRAL 1.0 | 2 | 4% | 13 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 4% | 10 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 2% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 4 |
| pa.Improved 1.0 | 1 | 2% | 2 |

Posture (Hadur's M records, 203 rounds): 144497 melee ticks, 51589 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 46 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 45376 sent, 40809 reached their opponent, 9834 virtual hits (24.1% of those reached).

## Melee bench: F15

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 769 over 6 battles (128.2 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.7 | 128 / 210 | 2.02 | 19.6% | 32621 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 19.6% | 128 |
| kawigi.micro.Shiz 1.1 | 2.2 | 13.4% | 16 |
| mld.DustBunny 3.8 | 3.3 | 12.6% | 9 |
| emp.Yngwie 1.11 | 3.7 | 12.8% | 43 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.8% | 6 |
| kawigi.robot.Girl 1.2 | 6.0 | 8.9% | 8 |
| Grystrion.TrackerWO 1.0 | 7.3 | 6.8% | 1 |
| lambdaxy.TBot 0.1 | 7.7 | 6.6% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 4.7% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 81.6 | 18 / 35 | 5545 |
| 2 | 1 | 69.7 | 89.5 | 24 / 35 | 5098 |
| 3 | 1 | 69.0 | 88.6 | 18 / 35 | 5242 |
| 4 | 1 | 72.1 | 95.9 | 27 / 35 | 5859 |
| 5 | 1 | 69.7 | 88.6 | 20 / 35 | 5433 |
| 6 | 1 | 69.6 | 87.9 | 21 / 35 | 5444 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 56 | 59% |
| kawigi.micro.Shiz 1.1 | 33 | 91% |
| mld.DustBunny 3.8 | 28 | 93% |
| cb.nano.Insomnia 1.0 | 25 | 96% |
| kawigi.robot.Girl 1.2 | 13 | 100% |
| divineomega.TrialBot 0.003 | 1 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 0% |

Hadur died in 90 of 210 rounds, at a mean tick of 1034. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 40 | 44% | 83 |
| mld.DustBunny 3.8 | 11 | 12% | 45 |
| kawigi.robot.Girl 1.2 | 9 | 10% | 12 |
| kawigi.micro.Shiz 1.1 | 8 | 9% | 33 |
| cb.nano.Insomnia 1.0 | 7 | 8% | 16 |
| divineomega.TrialBot 0.003 | 4 | 4% | 11 |
| lambdaxy.TBot 0.1 | 2 | 2% | 6 |
| Grystrion.TrackerWO 1.0 | 1 | 1% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 2 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 163168 melee ticks, 54531 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 42 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 2.

Targeting waves (203 rounds): 52995 sent, 48168 reached their opponent, 7953 virtual hits (16.5% of those reached).

## Melee bench: F16

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 314 over 6 battles (52.3 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 89.8 | 108 / 210 | 1.92 | 19.8% | 34165 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 19.8% | 108 |
| gh.Griezel 0.5.2 | 2.0 | 16.8% | 65 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.6% | 5 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.4% | 28 |
| bvh.fnr.Fenrir 0.36l | 4.8 | 9.8% | 3 |
| tvv.nano.Polaris 1.2 | 6.3 | 8.0% | 1 |
| stelo.IntrinsicVolatility 1.4 | 6.7 | 7.4% | 1 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 4.6% | 0 |
| asd.Cthulhu 1.3 | 9.0 | 4.7% | 0 |
| repositorio.NanoStep 1.0 | 9.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 93.3 | 23 / 35 | 6089 |
| 2 | 1 | 69.4 | 89.5 | 14 / 35 | 5430 |
| 3 | 1 | 69.2 | 87.9 | 15 / 35 | 5411 |
| 4 | 1 | 70.0 | 89.2 | 16 / 35 | 5624 |
| 5 | 1 | 71.8 | 93.0 | 24 / 35 | 6297 |
| 6 | 1 | 68.9 | 85.7 | 16 / 35 | 5314 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 88 | 57% |
| techdude.forest.FlamingForest 1.1 | 36 | 50% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 26 | 85% |
| bvh.fnr.Fenrir 0.36l | 13 | 85% |
| stelo.IntrinsicVolatility 1.4 | 5 | 80% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 1277. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 48 | 46% | 99 |
| techdude.forest.FlamingForest 1.1 | 23 | 22% | 39 |
| bvh.fnr.Fenrir 0.36l | 15 | 14% | 20 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 11 | 10% | 33 |
| stelo.IntrinsicVolatility 1.4 | 2 | 2% | 7 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 6 |
| repositorio.NanoStep 1.0 | 1 | 1% | 2 |
| tvv.nano.Polaris 1.2 | 1 | 1% | 1 |
| asd.Cthulhu 1.3 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 178831 melee ticks, 75410 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 33 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 57303 sent, 52657 reached their opponent, 8716 virtual hits (16.6% of those reached).

## Melee bench: F17

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 435 over 6 battles (72.5 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 89.9 | 125 / 210 | 1.91 | 20.2% | 36233 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 20.2% | 125 |
| et.Predator 1.8 | 2.7 | 13.3% | 24 |
| oog.melee.Mercutio 1.0 | 2.7 | 13.0% | 25 |
| cx.BlestPain 1.41 | 4.2 | 11.5% | 29 |
| ahf.NanoAndrew .4 | 4.8 | 10.3% | 4 |
| nic.Nicator 2.4 | 6.2 | 9.3% | 2 |
| maribo.melee.BMV 0.1 | 6.5 | 8.8% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.8% | 1 |
| tex.Longbot 0.4 | 8.5 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 88.6 | 15 / 35 | 5636 |
| 2 | 1 | 70.6 | 88.9 | 19 / 35 | 6424 |
| 3 | 1 | 70.8 | 89.5 | 20 / 35 | 6221 |
| 4 | 1 | 71.4 | 91.4 | 26 / 35 | 6176 |
| 5 | 1 | 70.4 | 89.2 | 18 / 35 | 6015 |
| 6 | 1 | 71.3 | 91.7 | 27 / 35 | 5761 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 62 | 82% |
| et.Predator 1.8 | 59 | 75% |
| cx.BlestPain 1.41 | 28 | 32% |
| ahf.NanoAndrew .4 | 12 | 100% |
| maribo.melee.BMV 0.1 | 4 | 100% |
| nic.Nicator 2.4 | 2 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |
| tex.Longbot 0.4 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 1088. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 28 | 31% | 41 |
| et.Predator 1.8 | 22 | 24% | 66 |
| oog.melee.Mercutio 1.0 | 16 | 18% | 56 |
| ahf.NanoAndrew .4 | 12 | 13% | 25 |
| maribo.melee.BMV 0.1 | 6 | 7% | 12 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 4 |
| tex.Longbot 0.4 | 1 | 1% | 2 |
| nic.Nicator 2.4 | 0 | 0% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 160650 melee ticks, 68157 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 55 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 53001 sent, 48291 reached their opponent, 10368 virtual hits (21.5% of those reached).

## Melee bench: F18

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 492 over 6 battles (82.0 per battle, most in one battle 144). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 90.2 | 133 / 210 | 1.88 | 19.5% | 29693 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 19.5% | 133 |
| morbid.MorbidPriest 1.0 | 2.2 | 14.1% | 36 |
| agd.Mooserwirt2 2.7 | 2.8 | 12.0% | 16 |
| uji.DBH 1.1 | 4.2 | 10.4% | 6 |
| ratosh.Nobo 0.21 | 5.5 | 9.0% | 8 |
| spinnercat.Robovirus 2.718 | 6.2 | 8.3% | 0 |
| sigterm.Sigterm 1.0 | 6.3 | 8.2% | 6 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.2% | 1 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.0 | 6.1% | 2 |
| stelo.WangRobot 1.0 | 9.8 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 90.5 | 24 / 35 | 4855 |
| 2 | 1 | 69.3 | 89.8 | 20 / 35 | 5273 |
| 3 | 1 | 70.5 | 94.6 | 26 / 35 | 5042 |
| 4 | 1 | 68.8 | 89.8 | 22 / 35 | 4817 |
| 5 | 1 | 69.1 | 89.2 | 21 / 35 | 4922 |
| 6 | 1 | 67.8 | 87.3 | 20 / 35 | 4784 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 72 | 72% |
| agd.Mooserwirt2 2.7 | 34 | 82% |
| sigterm.Sigterm 1.0 | 20 | 85% |
| uji.DBH 1.1 | 15 | 80% |
| ratosh.Nobo 0.21 | 8 | 63% |
| spinnercat.Robovirus 2.718 | 8 | 100% |
| stelo.WangRobot 1.0 | 6 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 5 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 806. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 32 | 40% | 88 |
| agd.Mooserwirt2 2.7 | 16 | 20% | 40 |
| uji.DBH 1.1 | 8 | 10% | 19 |
| sigterm.Sigterm 1.0 | 5 | 6% | 18 |
| ratosh.Nobo 0.21 | 5 | 6% | 8 |
| spinnercat.Robovirus 2.718 | 4 | 5% | 15 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 5% | 7 |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 2% | 7 |
| stelo.WangRobot 1.0 | 2 | 2% | 7 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 136208 melee ticks, 46645 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 64 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 45579 sent, 40772 reached their opponent, 8640 virtual hits (21.2% of those reached).

## Melee bench: F19

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 293 over 6 battles (48.8 per battle, most in one battle 111). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.0 | 99.0 | 199 / 210 | 1.09 | 22.9% | 38323 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 22.9% | 199 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.9% | 5 |
| mld.Infinity 2.2 | 3.3 | 12.1% | 2 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.3% | 2 |
| erdnis.Rover 0.3 | 4.5 | 10.8% | 0 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.1% | 1 |
| pac.ABC 2.1 | 7.3 | 6.5% | 1 |
| mbh.Mbh 0.1 | 7.3 | 7.0% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.4% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.0 | 98.7 | 33 / 35 | 6449 |
| 2 | 1 | 73.9 | 98.7 | 33 / 35 | 6323 |
| 3 | 1 | 74.3 | 99.7 | 34 / 35 | 6563 |
| 4 | 1 | 73.7 | 98.7 | 32 / 35 | 6279 |
| 5 | 1 | 74.1 | 99.7 | 34 / 35 | 6406 |
| 6 | 1 | 73.8 | 98.7 | 33 / 35 | 6303 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 122 | 98% |
| mld.Infinity 2.2 | 26 | 100% |
| krillr.mini.JointStrike 2.0.0 | 23 | 96% |
| erdnis.Rover 0.3 | 17 | 100% |
| pac.ABC 2.1 | 7 | 100% |
| patson.PatsonTestBot 1.0 | 6 | 83% |
| mbh.Mbh 0.1 | 2 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 15 of 210 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 4 | 27% | 83 |
| erdnis.Rover 0.3 | 3 | 20% | 27 |
| krillr.mini.JointStrike 2.0.0 | 3 | 20% | 21 |
| patson.PatsonTestBot 1.0 | 2 | 13% | 20 |
| mld.Infinity 2.2 | 1 | 7% | 23 |
| pac.ABC 2.1 | 0 | 0% | 12 |
| mbh.Mbh 0.1 | 0 | 0% | 11 |
| pbg.R2D2 1.0 | 0 | 0% | 10 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 131016 melee ticks, 46633 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 40 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 43743 sent, 39051 reached their opponent, 9144 virtual hits (23.4% of those reached).

## Melee bench: F20

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 451 over 6 battles (75.2 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 94.2 | 161 / 210 | 1.52 | 21.8% | 38504 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 21.8% | 161 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.5% | 22 |
| fwb.Nine 1.0.1 | 3.7 | 11.4% | 9 |
| catcat20.Rabbit 0.001 | 4.2 | 10.5% | 15 |
| nz.jdc.nano.GridFu 1.0 | 4.2 | 10.6% | 2 |
| m3thos.mini.Eva01 0.5.5 | 6.2 | 8.3% | 0 |
| bayen.nut.Squirrel 1.615 | 7.2 | 6.9% | 1 |
| djdjdj.NanoSkunk10 1.0 | 7.8 | 6.1% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 5.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 90.5 | 20 / 35 | 5671 |
| 2 | 1 | 73.1 | 95.9 | 28 / 35 | 6635 |
| 3 | 1 | 71.8 | 92.1 | 26 / 35 | 6283 |
| 4 | 1 | 73.6 | 94.6 | 29 / 35 | 7182 |
| 5 | 1 | 73.4 | 96.5 | 30 / 35 | 6535 |
| 6 | 1 | 72.5 | 95.9 | 28 / 35 | 6198 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 78 | 88% |
| fwb.Nine 1.0.1 | 54 | 98% |
| catcat20.Rabbit 0.001 | 30 | 63% |
| nz.jdc.nano.GridFu 1.0 | 13 | 100% |
| bayen.nut.Squirrel 1.615 | 4 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| m3thos.mini.Eva01 0.5.5 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 1054. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 20 | 38% | 95 |
| catcat20.Rabbit 0.001 | 14 | 27% | 42 |
| fwb.Nine 1.0.1 | 10 | 19% | 22 |
| bayen.nut.Squirrel 1.615 | 3 | 6% | 9 |
| nz.jdc.nano.GridFu 1.0 | 1 | 2% | 18 |
| ntc.ControlledChaos 1.1.4 | 1 | 2% | 2 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 12 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 167560 melee ticks, 63152 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 33 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 52231 sent, 47454 reached their opponent, 10646 virtual hits (22.4% of those reached).

## Melee bench: F21

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 650 over 6 battles (108.3 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 93.8 | 152 / 210 | 1.56 | 21.2% | 36247 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 21.2% | 152 |
| eem.EvBot v4.6.16 | 2.0 | 16.1% | 51 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.3% | 3 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.4% | 3 |
| eld.Hmm 1.0 | 5.2 | 8.1% | 3 |
| oa.weak.BotherBot 0.1 | 5.8 | 7.5% | 0 |
| PSW.Relentless 0.1 | 7.5 | 6.0% | 0 |
| fire219.CatBot 1.0 | 8.5 | 5.5% | 0 |
| el.JumpShoot 0.2 | 8.5 | 5.3% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 95.6 | 26 / 35 | 6056 |
| 2 | 1 | 72.9 | 94.3 | 29 / 35 | 6553 |
| 3 | 1 | 70.0 | 88.9 | 21 / 35 | 5766 |
| 4 | 1 | 73.0 | 95.6 | 30 / 35 | 6463 |
| 5 | 1 | 71.8 | 95.2 | 24 / 35 | 5607 |
| 6 | 1 | 71.1 | 93.0 | 22 / 35 | 5802 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 119 | 72% |
| dummy.mini.Scimitar 1.01 | 37 | 95% |
| cf.RiO.RiOx 4.2.1 | 19 | 100% |
| eld.Hmm 1.0 | 8 | 100% |
| oa.weak.BotherBot 0.1 | 2 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 1288. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 38 | 58% | 98 |
| dummy.mini.Scimitar 1.01 | 9 | 14% | 52 |
| cf.RiO.RiOx 4.2.1 | 4 | 6% | 19 |
| eld.Hmm 1.0 | 3 | 5% | 26 |
| fire219.CatBot 1.0 | 2 | 3% | 3 |
| PSW.Relentless 0.1 | 1 | 2% | 2 |
| el.JumpShoot 0.2 | 1 | 2% | 1 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 7 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 175483 melee ticks, 83614 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 56 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 51987 sent, 47217 reached their opponent, 7965 virtual hits (16.9% of those reached).

## Melee bench: F22

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 668 over 6 battles (111.3 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 90.3 | 117 / 210 | 1.88 | 19.5% | 32425 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 19.5% | 117 |
| pe.SandboxDT 2.71m | 2.0 | 16.4% | 64 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.7% | 17 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.6% | 9 |
| bigpete.Stewie 1.0 | 5.0 | 10.3% | 2 |
| yk.JahRoslav 1.1 | 6.0 | 7.2% | 1 |
| gg.Squaraus 0.6 | 7.5 | 6.2% | 0 |
| tad.Dalek98 0.98 | 7.7 | 6.2% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 4.4% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 92.1 | 23 / 35 | 5691 |
| 2 | 1 | 69.0 | 84.1 | 18 / 35 | 5143 |
| 3 | 1 | 71.1 | 94.0 | 21 / 35 | 5535 |
| 4 | 1 | 69.6 | 88.9 | 17 / 35 | 5298 |
| 5 | 1 | 71.2 | 93.3 | 21 / 35 | 5492 |
| 6 | 1 | 69.5 | 89.2 | 17 / 35 | 5266 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 61 | 38% |
| kvk.HebusLeTroll 0.35 | 51 | 86% |
| jlm.javaDisturbance 0.59 | 42 | 93% |
| bigpete.Stewie 1.0 | 10 | 80% |
| tad.Dalek98 0.98 | 2 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |
| yk.JahRoslav 1.1 | 1 | 0% |

Hadur died in 99 of 210 rounds, at a mean tick of 1021. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 55 | 56% | 86 |
| kvk.HebusLeTroll 0.35 | 23 | 23% | 55 |
| jlm.javaDisturbance 0.59 | 9 | 9% | 45 |
| bigpete.Stewie 1.0 | 3 | 3% | 16 |
| tad.Dalek98 0.98 | 2 | 2% | 4 |
| yk.JahRoslav 1.1 | 1 | 1% | 2 |
| gg.Squaraus 0.6 | 1 | 1% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 164356 melee ticks, 52417 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 32 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 51990 sent, 47229 reached their opponent, 7349 virtual hits (15.6% of those reached).

## Melee bench: F23

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 329 over 6 battles (54.8 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.0 | 97.2 | 183 / 210 | 1.25 | 22.6% | 37949 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 22.6% | 183 |
| pe.SandboxLump 1.52 | 2.0 | 16.4% | 18 |
| cre.Karolos 0.32 | 3.0 | 14.5% | 6 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 9.7% | 0 |
| stelo.RamTrackSurfer 1.2 | 5.3 | 8.9% | 3 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.8 | 8.6% | 0 |
| cw.megas.Blade 0.8 | 6.3 | 8.3% | 0 |
| sample.Walls 1.0 | 8.0 | 7.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 2.4% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.2 | 96.5 | 32 / 35 | 6240 |
| 2 | 1 | 74.0 | 97.1 | 30 / 35 | 6084 |
| 3 | 1 | 73.9 | 97.8 | 30 / 35 | 6255 |
| 4 | 1 | 74.1 | 98.7 | 33 / 35 | 6157 |
| 5 | 1 | 74.8 | 97.5 | 31 / 35 | 6914 |
| 6 | 1 | 73.1 | 95.9 | 27 / 35 | 6299 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 108 | 93% |
| cre.Karolos 0.32 | 58 | 95% |
| stelo.RamTrackSurfer 1.2 | 9 | 78% |
| stelo.AreaTargetingBot 1.1 | 9 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 9 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 29 of 210 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 15 | 52% | 99 |
| cre.Karolos 0.32 | 9 | 31% | 68 |
| stelo.RamTrackSurfer 1.2 | 3 | 10% | 16 |
| stelo.AreaTargetingBot 1.1 | 0 | 0% | 11 |
| sample.Walls 1.0 | 0 | 0% | 7 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 5 |
| cw.megas.Blade 0.8 | 0 | 0% | 3 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 125235 melee ticks, 52031 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 65 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 2.

Targeting waves (204 rounds): 38909 sent, 34130 reached their opponent, 9939 virtual hits (29.1% of those reached).

## Melee bench: F24

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 356 over 6 battles (59.3 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 81.5 | 82 / 210 | 2.67 | 16.7% | 24512 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.2 | 16.7% | 82 |
| rz.GlowBlowMelee 1.4 | 2.2 | 14.4% | 40 |
| davidalves.Phoenix 0.54 | 3.3 | 12.8% | 34 |
| florent.XSeries.X2 0.12 | 3.5 | 13.3% | 28 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.8% | 22 |
| oog.melee.Corsair 1.0 | 6.0 | 9.7% | 4 |
| stelo.SoJNanoMelee 1.1 | 7.2 | 6.1% | 1 |
| lunchie.Lunchbox 0.93 | 8.0 | 5.7% | 0 |
| as.FrankTheTank 1.3 | 9.0 | 5.0% | 0 |
| evd.X1 0.01 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 79.4 | 15 / 35 | 4120 |
| 2 | 1 | 68.1 | 87.9 | 17 / 35 | 4520 |
| 3 | 2 | 62.5 | 73.7 | 9 / 35 | 3757 |
| 4 | 1 | 66.8 | 85.1 | 13 / 35 | 4090 |
| 5 | 1 | 65.1 | 81.0 | 13 / 35 | 3842 |
| 6 | 1 | 66.3 | 81.9 | 15 / 35 | 4183 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 45 | 53% |
| davidalves.Phoenix 0.54 | 27 | 56% |
| florent.XSeries.X2 0.12 | 27 | 63% |
| pedersen.Ugluk 1.1.1 | 20 | 70% |
| oog.melee.Corsair 1.0 | 9 | 100% |
| stelo.SoJNanoMelee 1.1 | 2 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 34 | 26% | 50 |
| rz.GlowBlowMelee 1.4 | 33 | 25% | 51 |
| davidalves.Phoenix 0.54 | 30 | 23% | 42 |
| pedersen.Ugluk 1.1.1 | 17 | 13% | 27 |
| oog.melee.Corsair 1.0 | 8 | 6% | 28 |
| lunchie.Lunchbox 0.93 | 2 | 2% | 5 |
| stelo.SoJNanoMelee 1.1 | 2 | 2% | 5 |
| as.FrankTheTank 1.3 | 1 | 1% | 1 |
| evd.X1 0.01 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 137368 melee ticks, 33890 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 33 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 45602 sent, 40696 reached their opponent, 7568 virtual hits (18.6% of those reached).

## Melee bench: F25

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 317 over 6 battles (52.8 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 88.8 | 135 / 210 | 2.00 | 18.8% | 24668 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 18.8% | 135 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.4% | 20 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.6% | 10 |
| jdw.Hurricane 1.4 | 3.7 | 11.4% | 20 |
| ds.Oo 2.2 | 5.3 | 9.4% | 4 |
| gre.svman4.Morfeas 1.4.1 | 5.7 | 9.5% | 8 |
| awesomeness.Elite 1.0 | 7.5 | 7.1% | 4 |
| gjr.Cephalosporin 0.1 | 8.2 | 6.7% | 7 |
| adt.Ar2 1.1 | 8.3 | 6.7% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 94.9 | 24 / 35 | 4896 |
| 2 | 1 | 66.9 | 84.8 | 21 / 35 | 3743 |
| 3 | 1 | 67.9 | 85.7 | 23 / 35 | 4059 |
| 4 | 1 | 69.4 | 93.0 | 25 / 35 | 3981 |
| 5 | 1 | 66.7 | 85.1 | 18 / 35 | 3969 |
| 6 | 1 | 68.6 | 89.5 | 24 / 35 | 4020 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 45 | 84% |
| voidious.micro.BlitzBat 1.05 | 34 | 94% |
| jdw.Hurricane 1.4 | 33 | 82% |
| ds.Oo 2.2 | 19 | 100% |
| gre.svman4.Morfeas 1.4.1 | 13 | 69% |
| gjr.Cephalosporin 0.1 | 6 | 50% |
| adt.Ar2 1.1 | 4 | 100% |
| awesomeness.Elite 1.0 | 3 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 18 | 23% | 38 |
| voidious.micro.BlitzBat 1.05 | 17 | 22% | 45 |
| voidious.mini.BrokenSword 2.0.3 | 13 | 17% | 39 |
| gre.svman4.Morfeas 1.4.1 | 7 | 9% | 23 |
| gjr.Cephalosporin 0.1 | 7 | 9% | 16 |
| adt.Ar2 1.1 | 5 | 6% | 10 |
| ds.Oo 2.2 | 4 | 5% | 24 |
| awesomeness.Elite 1.0 | 4 | 5% | 13 |
| amk.ChumbaMini 0.2 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 129114 melee ticks, 31791 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 42 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 45387 sent, 40455 reached their opponent, 6846 virtual hits (16.9% of those reached).

## Melee bench: F26

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 623 over 6 battles (103.8 per battle, most in one battle 152). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 93.6 | 153 / 210 | 1.58 | 21.4% | 39863 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 21.4% | 153 |
| ak.Fermat 2.0 | 2.0 | 14.6% | 25 |
| lrem.Spectre 0.4.4 | 3.3 | 11.9% | 13 |
| shu.nitro.LENIN .T34 | 4.0 | 12.0% | 13 |
| js.PinBall 1.6 | 4.8 | 10.8% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.5% | 3 |
| gh.mini.GrubbmOne 1.0 | 7.2 | 7.8% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 7.7 | 6.9% | 1 |
| sample.SpinBot 1.0 | 9.0 | 3.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 91.7 | 24 / 35 | 6493 |
| 2 | 1 | 72.2 | 94.6 | 26 / 35 | 6311 |
| 3 | 1 | 72.1 | 92.4 | 26 / 35 | 6448 |
| 4 | 1 | 72.2 | 93.0 | 21 / 35 | 6959 |
| 5 | 1 | 73.1 | 94.6 | 29 / 35 | 6933 |
| 6 | 1 | 73.1 | 95.2 | 27 / 35 | 6719 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 61 | 84% |
| lrem.Spectre 0.4.4 | 41 | 85% |
| shu.nitro.LENIN .T34 | 41 | 98% |
| js.PinBall 1.6 | 16 | 81% |
| fullsail.LaxativeTeaTwo 1.0 | 8 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 100% |
| gh.mini.GrubbmOne 1.0 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 971. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 23 | 37% | 72 |
| shu.nitro.LENIN .T34 | 10 | 16% | 51 |
| lrem.Spectre 0.4.4 | 10 | 16% | 37 |
| js.PinBall 1.6 | 9 | 15% | 26 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 8% | 13 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 2% | 8 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 2 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 159698 melee ticks, 53770 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 32 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 2.

Targeting waves (206 rounds): 51745 sent, 46977 reached their opponent, 11197 virtual hits (23.8% of those reached).

## Melee bench: F27

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 193 over 6 battles (32.2 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 97.1 | 187 / 210 | 1.26 | 21.8% | 33330 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 21.8% | 187 |
| mk.Alpha 0.2.1 | 2.2 | 13.2% | 14 |
| EH.Eagle 1.0.6 | 2.8 | 11.0% | 0 |
| sheldor.melee.nano.TestMelee 0.1 | 4.8 | 9.2% | 2 |
| wee.Gem 1.8.4 | 5.5 | 8.7% | 3 |
| techdude.kombat.FlamingKombat 1.5 | 6.5 | 8.1% | 1 |
| joe.ADinosaur 1.0 | 7.0 | 8.0% | 1 |
| throxbot.ThroxBot 0.1 | 7.0 | 8.4% | 2 |
| caimano.Furia_Ceca 0.22 | 8.5 | 6.9% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 98.1 | 31 / 35 | 5589 |
| 2 | 1 | 72.5 | 98.1 | 34 / 35 | 5351 |
| 3 | 1 | 71.8 | 97.1 | 31 / 35 | 5400 |
| 4 | 1 | 71.8 | 96.2 | 31 / 35 | 5656 |
| 5 | 1 | 70.8 | 95.2 | 27 / 35 | 5080 |
| 6 | 1 | 73.1 | 97.8 | 33 / 35 | 6254 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 111 | 92% |
| EH.Eagle 1.0.6 | 40 | 100% |
| wee.Gem 1.8.4 | 12 | 92% |
| techdude.kombat.FlamingKombat 1.5 | 10 | 100% |
| caimano.Furia_Ceca 0.22 | 7 | 100% |
| throxbot.ThroxBot 0.1 | 6 | 83% |
| joe.ADinosaur 1.0 | 6 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 5 | 100% |

Hadur died in 24 of 210 rounds, at a mean tick of 838. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 13 | 54% | 93 |
| joe.ADinosaur 1.0 | 4 | 17% | 15 |
| EH.Eagle 1.0.6 | 2 | 8% | 41 |
| throxbot.ThroxBot 0.1 | 2 | 8% | 10 |
| sheldor.melee.nano.TestMelee 0.1 | 1 | 4% | 15 |
| wee.Gem 1.8.4 | 1 | 4% | 14 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 4% | 12 |
| caimano.Furia_Ceca 0.22 | 0 | 0% | 9 |

Posture (Hadur's M records, 202 rounds): 131278 melee ticks, 47096 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 457 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 225 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 2.

Targeting waves (202 rounds): 42545 sent, 37818 reached their opponent, 9228 virtual hits (24.4% of those reached).

## Melee bench: F28

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 474 over 6 battles (79.0 per battle, most in one battle 142). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 92.9 | 151 / 210 | 1.64 | 19.5% | 25253 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 19.5% | 151 |
| kid.test.NightFox .2 | 2.0 | 14.5% | 21 |
| uji.Antique 1.0 | 3.7 | 11.4% | 18 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 10.3% | 6 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.1% | 2 |
| ahr.ice.Ice 1.0.2 | 5.8 | 8.9% | 7 |
| amk.ChumbaWumba 0.3 | 6.7 | 8.4% | 4 |
| stelo.Lifestealer 1.0 | 8.8 | 5.6% | 0 |
| matt.advanced.Katana 1.0 | 9.0 | 5.8% | 1 |
| stelo.PianistNano 1.2 | 9.2 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 93.7 | 27 / 35 | 4217 |
| 2 | 1 | 69.3 | 93.3 | 25 / 35 | 4284 |
| 3 | 1 | 68.8 | 90.8 | 25 / 35 | 4113 |
| 4 | 1 | 68.2 | 90.2 | 23 / 35 | 4109 |
| 5 | 1 | 69.5 | 93.3 | 22 / 35 | 4192 |
| 6 | 1 | 70.3 | 95.9 | 29 / 35 | 4338 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 81 | 86% |
| uji.Antique 1.0 | 49 | 90% |
| qohnil.blot.BlotBot 3.61 | 17 | 76% |
| ahr.ice.Ice 1.0.2 | 10 | 90% |
| pfvicm.Sobieski 7.2.3b | 8 | 100% |
| amk.ChumbaWumba 0.3 | 5 | 40% |
| matt.advanced.Katana 1.0 | 3 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 20 | 31% | 57 |
| kid.test.NightFox .2 | 16 | 25% | 60 |
| ahr.ice.Ice 1.0.2 | 7 | 11% | 19 |
| amk.ChumbaWumba 0.3 | 7 | 11% | 15 |
| qohnil.blot.BlotBot 3.61 | 5 | 8% | 32 |
| pfvicm.Sobieski 7.2.3b | 4 | 6% | 13 |
| stelo.PianistNano 1.2 | 1 | 2% | 5 |
| stelo.Lifestealer 1.0 | 1 | 2% | 1 |
| matt.advanced.Katana 1.0 | 0 | 0% | 5 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 134174 melee ticks, 37233 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 42 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 44702 sent, 39907 reached their opponent, 5833 virtual hits (14.6% of those reached).

## Melee bench: F29

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 485 over 6 battles (80.8 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 89.0 | 129 / 210 | 1.99 | 19.6% | 29445 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 19.6% | 129 |
| deewiant.Anomaly 0.2 | 2.3 | 14.8% | 31 |
| zyx.mega.YersiniaPestis 3.1 | 2.7 | 14.6% | 35 |
| myl.micro.Troodon 1.10 | 4.0 | 12.5% | 10 |
| jok.PheonixM 0.1.2 | 5.0 | 10.9% | 6 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.3% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.2 | 6.0% | 0 |
| DBall.Anarchy 0.1 | 8.0 | 5.2% | 0 |
| ap.Frederick 1.1 | 9.2 | 4.3% | 0 |
| jangs.ns51 1.0 | 9.7 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 88.6 | 20 / 35 | 5162 |
| 2 | 1 | 71.6 | 93.7 | 26 / 35 | 5118 |
| 3 | 1 | 69.1 | 86.7 | 17 / 35 | 4879 |
| 4 | 1 | 70.6 | 91.1 | 22 / 35 | 4794 |
| 5 | 1 | 67.6 | 81.3 | 17 / 35 | 4349 |
| 6 | 1 | 71.5 | 93.0 | 27 / 35 | 5143 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 65 | 86% |
| zyx.mega.YersiniaPestis 3.1 | 49 | 76% |
| myl.micro.Troodon 1.10 | 20 | 90% |
| jok.PheonixM 0.1.2 | 14 | 79% |
| jangs.ns51 1.0 | 2 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |
| DBall.Anarchy 0.1 | 1 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 960. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 32 | 38% | 56 |
| zyx.mega.YersiniaPestis 3.1 | 24 | 28% | 74 |
| myl.micro.Troodon 1.10 | 16 | 19% | 39 |
| jok.PheonixM 0.1.2 | 6 | 7% | 26 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 5 |
| DBall.Anarchy 0.1 | 1 | 1% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 164950 melee ticks, 55180 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 40 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 53396 sent, 48723 reached their opponent, 7306 virtual hits (15.0% of those reached).

## Melee bench: F30

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 581 over 6 battles (96.8 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 79.8 | 55 / 210 | 2.81 | 16.0% | 24435 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 16.0% | 55 |
| catcat20.Matcha 0.006 | 2.3 | 14.0% | 44 |
| darkcanuck.B26354 1.06 | 3.5 | 13.1% | 43 |
| stelo.PastFuture 2.3.2 | 4.0 | 12.5% | 17 |
| oog.melee.Capulet 1.2 | 4.2 | 12.7% | 37 |
| intruder.PrairieWolf 2.61 | 6.0 | 8.9% | 8 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 6.6% | 3 |
| ntc.Opposite 1.5 | 8.0 | 6.6% | 0 |
| tripphippy.Alice 1.1 | 8.2 | 6.8% | 3 |
| GarmBox.Anger 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 76.5 | 9 / 35 | 4292 |
| 2 | 1 | 63.2 | 77.1 | 7 / 35 | 3664 |
| 3 | 1 | 64.4 | 81.0 | 8 / 35 | 3897 |
| 4 | 1 | 66.6 | 83.5 | 13 / 35 | 4396 |
| 5 | 1 | 64.6 | 81.6 | 8 / 35 | 4043 |
| 6 | 1 | 64.7 | 79.4 | 10 / 35 | 4143 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 31 | 42% |
| oog.melee.Capulet 1.2 | 29 | 48% |
| darkcanuck.B26354 1.06 | 26 | 35% |
| stelo.PastFuture 2.3.2 | 18 | 67% |
| tripphippy.Alice 1.1 | 6 | 83% |
| intruder.PrairieWolf 2.61 | 4 | 50% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 0% |

Hadur died in 159 of 210 rounds, at a mean tick of 919. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 41 | 26% | 50 |
| catcat20.Matcha 0.006 | 34 | 21% | 47 |
| oog.melee.Capulet 1.2 | 29 | 18% | 44 |
| stelo.PastFuture 2.3.2 | 29 | 18% | 38 |
| fowl3628800.LightningBolt 2.6.0 | 7 | 4% | 7 |
| intruder.PrairieWolf 2.61 | 6 | 4% | 7 |
| ntc.Opposite 1.5 | 5 | 3% | 5 |
| tripphippy.Alice 1.1 | 4 | 3% | 12 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 161805 melee ticks, 36961 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 48 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 51465 sent, 46511 reached their opponent, 7784 virtual hits (16.7% of those reached).

## Melee bench: F31

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 800 over 6 battles (133.3 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 81.9 | 80 / 210 | 2.63 | 16.7% | 23726 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.3 | 16.9% | 79 |
| hadur117.Hadur 3.20et | 1.7 | 16.7% | 80 |
| gh.mini.Griezel 0.2 | 3.0 | 13.5% | 36 |
| spinnercat.micro.Tyger 0.1 | 4.3 | 11.8% | 7 |
| d414.nano.Quantum 1.0.0 | 4.7 | 11.2% | 6 |
| gh.nano.Grofvuil 0.2 | 6.2 | 8.2% | 1 |
| timmit.nano.TimDog 0.33 | 7.0 | 6.8% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 8.5 | 5.3% | 0 |
| fm.mammillarias 1.3 | 8.7 | 5.2% | 0 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 85.7 | 17 / 35 | 4185 |
| 2 | 2 | 64.6 | 79.4 | 9 / 35 | 3852 |
| 3 | 2 | 64.1 | 74.6 | 12 / 35 | 3799 |
| 4 | 2 | 64.7 | 80.0 | 13 / 35 | 3674 |
| 5 | 1 | 69.3 | 91.1 | 20 / 35 | 4457 |
| 6 | 2 | 64.9 | 80.3 | 9 / 35 | 3759 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 52 | 48% |
| gh.mini.Griezel 0.2 | 50 | 64% |
| d414.nano.Quantum 1.0.0 | 17 | 71% |
| spinnercat.micro.Tyger 0.1 | 6 | 83% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |
| timmit.nano.TimDog 0.33 | 2 | 50% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 56 | 41% | 81 |
| gh.mini.Griezel 0.2 | 34 | 25% | 63 |
| spinnercat.micro.Tyger 0.1 | 13 | 9% | 17 |
| d414.nano.Quantum 1.0.0 | 11 | 8% | 23 |
| timmit.nano.TimDog 0.33 | 6 | 4% | 9 |
| gh.nano.Grofvuil 0.2 | 5 | 4% | 10 |
| fm.mammillarias 1.3 | 5 | 4% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 152300 melee ticks, 41421 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 33 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 5.

Targeting waves (205 rounds): 49192 sent, 44393 reached their opponent, 7252 virtual hits (16.3% of those reached).

## Melee bench: F32

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 177 over 6 battles (29.5 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 91.4 | 134 / 210 | 1.77 | 19.4% | 29405 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 19.4% | 134 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.8% | 46 |
| apc.botM 3.0 | 3.2 | 11.3% | 13 |
| lxx.ConceptA 0.8 | 4.5 | 9.8% | 3 |
| bayen.UbaMicro 1.4 | 5.2 | 9.1% | 1 |
| vjik.UnViolation 1.1 | 5.2 | 9.8% | 6 |
| panzer.Panzer 0.2 | 7.7 | 7.3% | 1 |
| yk.JahMicro 1.0 | 7.8 | 7.1% | 5 |
| conscience.Electron 1.3g | 8.5 | 6.5% | 0 |
| donjezza.Jezza 1.0 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 92.1 | 21 / 35 | 4617 |
| 2 | 1 | 67.4 | 85.7 | 20 / 35 | 4661 |
| 3 | 1 | 69.8 | 93.7 | 24 / 35 | 4963 |
| 4 | 1 | 70.0 | 91.4 | 25 / 35 | 5494 |
| 5 | 1 | 69.3 | 92.7 | 23 / 35 | 4975 |
| 6 | 1 | 68.9 | 93.0 | 21 / 35 | 4695 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 94 | 69% |
| apc.botM 3.0 | 31 | 81% |
| lxx.ConceptA 0.8 | 12 | 83% |
| yk.JahMicro 1.0 | 12 | 75% |
| vjik.UnViolation 1.1 | 12 | 92% |
| donjezza.Jezza 1.0 | 5 | 80% |
| bayen.UbaMicro 1.4 | 5 | 100% |
| panzer.Panzer 0.2 | 4 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 35 | 46% | 96 |
| apc.botM 3.0 | 11 | 14% | 38 |
| lxx.ConceptA 0.8 | 8 | 11% | 14 |
| yk.JahMicro 1.0 | 6 | 8% | 9 |
| vjik.UnViolation 1.1 | 5 | 7% | 29 |
| bayen.UbaMicro 1.4 | 5 | 7% | 12 |
| panzer.Panzer 0.2 | 2 | 3% | 5 |
| conscience.Electron 1.3g | 2 | 3% | 4 |
| donjezza.Jezza 1.0 | 2 | 3% | 2 |

Posture (Hadur's M records, 202 rounds): 125108 melee ticks, 51199 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 82 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 82 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 42661 sent, 37859 reached their opponent, 6860 virtual hits (18.1% of those reached).

## Melee bench: F33

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 183 over 6 battles (30.5 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 88.6 | 122 / 210 | 2.03 | 19.5% | 30541 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 19.5% | 122 |
| maribo.Quester 0.3 | 2.0 | 16.2% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.5% | 20 |
| gre.svman4.Leonidas 1.3.2 | 4.0 | 11.3% | 12 |
| labg.Cataclysm 2.05 | 4.7 | 10.4% | 13 |
| baal.nano.N 1.42 | 6.0 | 8.9% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 7.0 | 7.9% | 4 |
| zyx.micro.Ant 1.1 | 8.2 | 5.5% | 0 |
| sanja.First 0.1 | 8.8 | 4.8% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 86.0 | 17 / 35 | 4668 |
| 2 | 1 | 70.6 | 89.8 | 22 / 35 | 5177 |
| 3 | 1 | 70.6 | 90.2 | 20 / 35 | 5481 |
| 4 | 1 | 70.3 | 90.2 | 23 / 35 | 5024 |
| 5 | 1 | 70.3 | 90.8 | 21 / 35 | 5307 |
| 6 | 1 | 69.0 | 84.4 | 19 / 35 | 4884 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 68 | 74% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 36 | 81% |
| gre.svman4.Leonidas 1.3.2 | 20 | 85% |
| labg.Cataclysm 2.05 | 18 | 89% |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 86% |
| baal.nano.N 1.42 | 3 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 977. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 34 | 39% | 91 |
| gre.svman4.Leonidas 1.3.2 | 20 | 23% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 16% | 39 |
| labg.Cataclysm 2.05 | 8 | 9% | 21 |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 6% | 11 |
| baal.nano.N 1.42 | 2 | 2% | 12 |
| sanja.First 0.1 | 2 | 2% | 3 |
| zyx.micro.Ant 1.1 | 2 | 2% | 2 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 203 rounds): 171681 melee ticks, 49917 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 80 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 54550 sent, 49787 reached their opponent, 7259 virtual hits (14.6% of those reached).

## Melee bench: F34

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 320 over 6 battles (53.3 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 89.7 | 112 / 210 | 1.93 | 19.4% | 32514 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 19.4% | 112 |
| kid.Gladiator .7.2 | 2.2 | 16.4% | 42 |
| stelo.Spread 0.9 | 2.8 | 15.4% | 42 |
| jcs.Seth 1.8 | 4.3 | 11.2% | 11 |
| tcf.Reach 3 | 4.8 | 10.6% | 3 |
| cli.Dancer 1.1 | 5.8 | 9.1% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.6% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.2% | 0 |
| sample.RamFire 1.0 | 9.7 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 86.7 | 20 / 35 | 5079 |
| 2 | 1 | 69.7 | 90.2 | 18 / 35 | 4979 |
| 3 | 1 | 70.9 | 90.2 | 21 / 35 | 5626 |
| 4 | 1 | 71.2 | 93.7 | 19 / 35 | 5798 |
| 5 | 1 | 70.0 | 89.8 | 16 / 35 | 5233 |
| 6 | 1 | 70.4 | 87.6 | 18 / 35 | 5799 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 71 | 66% |
| kid.Gladiator .7.2 | 68 | 68% |
| jcs.Seth 1.8 | 20 | 65% |
| tcf.Reach 3 | 8 | 75% |

Hadur died in 102 of 210 rounds, at a mean tick of 1179. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 37 | 36% | 80 |
| stelo.Spread 0.9 | 34 | 33% | 62 |
| jcs.Seth 1.8 | 14 | 14% | 32 |
| tcf.Reach 3 | 9 | 9% | 22 |
| cli.Dancer 1.1 | 1 | 1% | 7 |
| ratosh.Wesco 1.4 | 1 | 1% | 3 |
| sample.VelociRobot 1.0 | 1 | 1% | 2 |
| sample.RamFire 1.0 | 1 | 1% | 1 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 163619 melee ticks, 77375 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 33 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 51168 sent, 46497 reached their opponent, 7808 virtual hits (16.8% of those reached).

## Melee bench: F35

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 753 over 6 battles (125.5 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 83.7 | 48 / 210 | 2.47 | 16.4% | 23625 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.1% | 131 |
| hadur117.Hadur 3.20et | 2.0 | 16.4% | 48 |
| gh.mini.Gruwel 0.9 | 3.2 | 13.0% | 20 |
| rz.HawkOnFire 0.1 | 4.2 | 11.9% | 4 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.7 | 11.3% | 7 |
| wit.Chuliath 1.0 | 6.5 | 6.7% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6.8 | 6.5% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.0 | 5.4% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.7% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.2 | 82.9 | 8 / 35 | 4242 |
| 2 | 2 | 66.0 | 83.2 | 11 / 35 | 3935 |
| 3 | 2 | 65.4 | 83.5 | 6 / 35 | 3767 |
| 4 | 2 | 66.9 | 87.3 | 11 / 35 | 4041 |
| 5 | 2 | 65.7 | 84.4 | 7 / 35 | 3871 |
| 6 | 2 | 64.4 | 80.6 | 5 / 35 | 3769 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 93 | 23% |
| gh.mini.Gruwel 0.9 | 22 | 55% |
| rz.HawkOnFire 0.1 | 9 | 89% |
| dmh.robocode.robot.BlackDeath 9.2 | 7 | 71% |
| wit.Chuliath 1.0 | 1 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 169 of 210 rounds, at a mean tick of 974. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 103 | 61% | 128 |
| gh.mini.Gruwel 0.9 | 28 | 17% | 37 |
| dmh.robocode.robot.BlackDeath 9.2 | 14 | 8% | 19 |
| rz.HawkOnFire 0.1 | 11 | 7% | 16 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 5 | 3% | 6 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |
| wit.Chuliath 1.0 | 0 | 0% | 1 |
| myl.nano.KomoriNinja 1.1 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 148818 melee ticks, 57020 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 32 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 3.

Targeting waves (204 rounds): 45421 sent, 40603 reached their opponent, 6166 virtual hits (15.2% of those reached).

## Melee bench: F36

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 341 over 6 battles (56.8 per battle, most in one battle 155). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 93.6 | 162 / 210 | 1.58 | 21.2% | 33291 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 21.2% | 162 |
| bzdp.Pansy 2.1 | 2.2 | 12.7% | 11 |
| alpha.RainingFire 1.0 | 2.8 | 12.4% | 17 |
| bvh.micro.Freya 0.3 | 4.3 | 11.1% | 8 |
| mz.Cork 0.1 | 5.0 | 10.8% | 8 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.3% | 2 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.3% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 5.5% | 0 |
| dl.BetterWalls 1.0 | 9.0 | 4.3% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 87.0 | 22 / 35 | 5016 |
| 2 | 1 | 71.5 | 93.3 | 27 / 35 | 5145 |
| 3 | 1 | 71.7 | 94.6 | 25 / 35 | 5744 |
| 4 | 1 | 72.6 | 96.5 | 31 / 35 | 5698 |
| 5 | 1 | 72.3 | 95.2 | 28 / 35 | 5826 |
| 6 | 1 | 72.5 | 94.9 | 29 / 35 | 5862 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 52 | 90% |
| bvh.micro.Freya 0.3 | 41 | 85% |
| mz.Cork 0.1 | 30 | 90% |
| alpha.RainingFire 1.0 | 27 | 85% |
| bvh.mini.Fenrir 0.39 | 15 | 93% |
| m3thos.Eva02 0.7.1 | 12 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |
| sample.MyFirstRobot 1.0 | 1 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 15 | 31% | 41 |
| bzdp.Pansy 2.1 | 12 | 24% | 59 |
| bvh.micro.Freya 0.3 | 9 | 18% | 36 |
| mz.Cork 0.1 | 5 | 10% | 33 |
| bvh.mini.Fenrir 0.39 | 4 | 8% | 13 |
| m3thos.Eva02 0.7.1 | 1 | 2% | 19 |
| dl.BetterWalls 1.0 | 1 | 2% | 6 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 142139 melee ticks, 48609 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 47 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 48809 sent, 44278 reached their opponent, 8931 virtual hits (20.2% of those reached).

## Melee bench: F37

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 280 over 6 battles (46.7 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 88.6 | 162 / 210 | 2.02 | 19.7% | 35345 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 19.7% | 162 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.3 | 11.4% | 9 |
| germ.TheMind .2 | 4.8 | 9.4% | 9 |
| agrach.Dalek 1.0 | 5.3 | 9.1% | 11 |
| lmk.ACPFinal 0.1 | 6.0 | 8.7% | 2 |
| EBBU.Sim2 1.02 | 6.2 | 8.8% | 0 |
| mn.nano.perceptual.Impact 1.3.0 | 6.3 | 8.6% | 1 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.6% | 7 |
| mb.Beast 0.1 | 7.0 | 8.4% | 7 |
| skm.Ryubot 1.0 | 9.2 | 7.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 93.7 | 30 / 35 | 5932 |
| 2 | 1 | 69.0 | 88.9 | 26 / 35 | 6056 |
| 3 | 1 | 68.0 | 86.7 | 26 / 35 | 5561 |
| 4 | 1 | 70.1 | 92.4 | 29 / 35 | 6148 |
| 5 | 1 | 70.2 | 92.1 | 30 / 35 | 6152 |
| 6 | 1 | 65.6 | 78.1 | 21 / 35 | 5496 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 30 | 97% |
| stelo.UntouchableNano 1.3 | 23 | 87% |
| lmk.ACPFinal 0.1 | 22 | 100% |
| mb.Beast 0.1 | 21 | 100% |
| germ.TheMind .2 | 21 | 100% |
| agrach.Dalek 1.0 | 19 | 95% |
| skm.Ryubot 1.0 | 18 | 94% |
| EBBU.Sim2 1.02 | 13 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 429. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 13 | 27% | 18 |
| com.syncleus.robocode.Dreadnaught 0.1 | 10 | 20% | 45 |
| stelo.UntouchableNano 1.3 | 8 | 16% | 28 |
| lmk.ACPFinal 0.1 | 5 | 10% | 29 |
| agrach.Dalek 1.0 | 5 | 10% | 28 |
| mb.Beast 0.1 | 3 | 6% | 22 |
| EBBU.Sim2 1.02 | 3 | 6% | 19 |
| skm.Ryubot 1.0 | 1 | 2% | 3 |
| germ.TheMind .2 | 0 | 0% | 16 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 95152 melee ticks, 26147 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 39 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 5.

Targeting waves (200 rounds): 31724 sent, 27293 reached their opponent, 7890 virtual hits (28.9% of those reached).

## Melee bench: F38

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 160 over 6 battles (26.7 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 90.8 | 133 / 210 | 1.82 | 19.4% | 29669 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 19.4% | 133 |
| justin.Mallais 14.0 | 2.0 | 15.5% | 46 |
| bvh.mini.Freya 0.55 | 3.2 | 12.3% | 10 |
| cs.Wren 1.0 | 4.5 | 10.9% | 5 |
| bts.mega.Gnarly 1.4 | 4.7 | 10.4% | 7 |
| kdf.KoulDestroyer 1.0 | 5.8 | 9.2% | 4 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.3 | 7.9% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.5 | 6.8% | 5 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.0% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 92.1 | 21 / 35 | 4822 |
| 2 | 1 | 68.5 | 86.0 | 20 / 35 | 4885 |
| 3 | 1 | 70.4 | 92.4 | 24 / 35 | 5056 |
| 4 | 1 | 68.1 | 87.3 | 18 / 35 | 4818 |
| 5 | 1 | 69.7 | 90.5 | 22 / 35 | 4867 |
| 6 | 1 | 71.5 | 96.8 | 28 / 35 | 5221 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 74 | 72% |
| cs.Wren 1.0 | 23 | 91% |
| bvh.mini.Freya 0.55 | 23 | 78% |
| bts.mega.Gnarly 1.4 | 19 | 84% |
| kdf.KoulDestroyer 1.0 | 15 | 87% |
| kawigi.spare.SpareParts 0.7.6nosnd | 8 | 88% |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 36 | 46% | 86 |
| bvh.mini.Freya 0.55 | 11 | 14% | 31 |
| bts.mega.Gnarly 1.4 | 10 | 13% | 31 |
| cs.Wren 1.0 | 8 | 10% | 25 |
| kdf.KoulDestroyer 1.0 | 8 | 10% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 2 | 3% | 8 |
| matt.UnderDark3 2.4.34 | 2 | 3% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 7 |
| bzdp.BoxCar 2.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 206 rounds): 144027 melee ticks, 43791 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 48 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 46707 sent, 41545 reached their opponent, 8660 virtual hits (20.8% of those reached).

## Melee bench: F39

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 587 over 6 battles (97.8 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.8 | 105 / 210 | 2.01 | 19.1% | 32233 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 19.1% | 105 |
| bvh.fry.Freya 0.82 | 2.0 | 15.1% | 21 |
| az.Ololobot 0.2.4 | 3.0 | 13.0% | 53 |
| catcat20.Lambda 0.024 | 4.0 | 12.0% | 25 |
| gimp.GimpBot 0.1 | 5.7 | 8.3% | 3 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 7.9% | 2 |
| apollokidd.ApolloKidd 0.9 | 6.5 | 7.7% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 8.2 | 6.6% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.3 | 5.4% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 82.9 | 13 / 35 | 5177 |
| 2 | 1 | 68.9 | 89.2 | 18 / 35 | 5451 |
| 3 | 1 | 69.6 | 92.1 | 18 / 35 | 5442 |
| 4 | 1 | 67.1 | 83.5 | 14 / 35 | 4998 |
| 5 | 1 | 70.2 | 91.4 | 20 / 35 | 5614 |
| 6 | 1 | 70.5 | 93.7 | 22 / 35 | 5551 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 62 | 85% |
| az.Ololobot 0.2.4 | 52 | 44% |
| catcat20.Lambda 0.024 | 33 | 58% |
| gimp.GimpBot 0.1 | 6 | 83% |
| winamp32.micro.MicroMacro 1.0 | 5 | 80% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 1064. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 39 | 36% | 65 |
| catcat20.Lambda 0.024 | 26 | 24% | 44 |
| bvh.fry.Freya 0.82 | 24 | 22% | 65 |
| apollokidd.ApolloKidd 0.9 | 6 | 6% | 10 |
| winamp32.micro.MicroMacro 1.0 | 4 | 4% | 11 |
| gimp.GimpBot 0.1 | 3 | 3% | 7 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 2% | 2 |
| stelo.SoRobotNanoMelee 1.2 | 1 | 1% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 167041 melee ticks, 56165 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 597 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 408 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 2.

Targeting waves (205 rounds): 52663 sent, 47928 reached their opponent, 8178 virtual hits (17.1% of those reached).

## Melee bench: F40

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 620 over 6 battles (103.3 per battle, most in one battle 153). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 91.4 | 140 / 210 | 1.77 | 20.3% | 31605 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 20.3% | 140 |
| kawigi.mini.Coriantumr 1.1 | 2.3 | 14.3% | 34 |
| kano.gamma.KanoGamma 1.8 | 2.8 | 12.9% | 14 |
| mz.AntiGrav 1.0 | 4.2 | 11.0% | 5 |
| Polkwane.SmashMelee 1.0 | 5.2 | 10.2% | 7 |
| alpha.BlackIce 1.0 | 6.3 | 8.7% | 2 |
| stelo.Randomness 1.0 | 6.5 | 8.8% | 7 |
| amk.superstrike.SuperStrike 0.3 | 7.7 | 6.8% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 3.9% | 0 |
| sample.Corners 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 91.7 | 25 / 35 | 5070 |
| 2 | 1 | 71.2 | 92.4 | 24 / 35 | 5403 |
| 3 | 1 | 70.8 | 91.7 | 25 / 35 | 5114 |
| 4 | 1 | 71.0 | 91.1 | 20 / 35 | 5808 |
| 5 | 1 | 71.5 | 93.7 | 27 / 35 | 5278 |
| 6 | 1 | 69.3 | 87.9 | 19 / 35 | 4932 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 60 | 75% |
| kano.gamma.KanoGamma 1.8 | 47 | 94% |
| mz.AntiGrav 1.0 | 25 | 96% |
| Polkwane.SmashMelee 1.0 | 13 | 85% |
| stelo.Randomness 1.0 | 12 | 75% |
| amk.superstrike.SuperStrike 0.3 | 5 | 80% |
| alpha.BlackIce 1.0 | 3 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 876. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 26 | 35% | 57 |
| kano.gamma.KanoGamma 1.8 | 13 | 18% | 65 |
| stelo.Randomness 1.0 | 9 | 12% | 23 |
| Polkwane.SmashMelee 1.0 | 9 | 12% | 20 |
| mz.AntiGrav 1.0 | 5 | 7% | 22 |
| amk.superstrike.SuperStrike 0.3 | 4 | 5% | 11 |
| alpha.BlackIce 1.0 | 4 | 5% | 10 |
| sample.Corners 1.0 | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 154904 melee ticks, 43908 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 758 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 404 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 3.

Targeting waves (206 rounds): 51059 sent, 46042 reached their opponent, 9501 virtual hits (20.6% of those reached).

## Melee bench: F41

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 368 over 6 battles (61.3 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 89.1 | 120 / 210 | 1.98 | 18.9% | 27694 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 18.9% | 120 |
| eem.EvBotNG v12.8 | 2.0 | 14.9% | 51 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 13.4% | 18 |
| ary.Swarm 1.1 | 3.7 | 13.2% | 14 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 11.1% | 6 |
| shrub.Silver v048 | 6.0 | 8.9% | 1 |
| zyx.nano.Ant 1.1 | 7.0 | 7.3% | 0 |
| jsal.Jsalbot 1.0 | 8.0 | 5.7% | 0 |
| stelo.Mirror 1.1 | 9.0 | 4.7% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 86.7 | 20 / 35 | 4958 |
| 2 | 1 | 68.1 | 85.7 | 20 / 35 | 4336 |
| 3 | 1 | 70.0 | 89.8 | 22 / 35 | 4768 |
| 4 | 1 | 70.0 | 90.8 | 20 / 35 | 4736 |
| 5 | 1 | 68.0 | 88.3 | 15 / 35 | 4167 |
| 6 | 1 | 70.7 | 93.3 | 23 / 35 | 4729 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 60 | 47% |
| lessonz.robocode.Oz 0.5.0 | 43 | 88% |
| ary.Swarm 1.1 | 35 | 89% |
| simonton.nano.MeleeSeed 1.8 | 18 | 94% |
| shrub.Silver v048 | 5 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 974. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 49 | 53% | 78 |
| lessonz.robocode.Oz 0.5.0 | 20 | 22% | 52 |
| ary.Swarm 1.1 | 14 | 15% | 44 |
| simonton.nano.MeleeSeed 1.8 | 6 | 7% | 25 |
| zyx.nano.Ant 1.1 | 1 | 1% | 3 |
| shrub.Silver v048 | 0 | 0% | 6 |
| stelo.Mirror 1.1 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 157561 melee ticks, 46726 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 90 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 90 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 51348 sent, 46420 reached their opponent, 7126 virtual hits (15.4% of those reached).

## Melee bench: F42

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 797 over 6 battles (132.8 per battle, most in one battle 148). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 92.5 | 143 / 210 | 1.67 | 20.7% | 35944 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 20.7% | 143 |
| wompi.Wallaby 5.1 | 2.0 | 15.1% | 35 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.4% | 10 |
| ara.Shera 0.88 | 3.5 | 13.2% | 21 |
| amz.NanoClone 1.41 | 5.0 | 8.6% | 0 |
| dsw.StaticD 1.0 | 6.5 | 6.7% | 1 |
| maribo.IotaCT 1.1 | 7.0 | 6.5% | 0 |
| stelo.MirrorMicro 1.0 | 7.5 | 6.2% | 0 |
| mme.NikeEnhanced 2.0 | 9.2 | 5.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 93.0 | 26 / 35 | 5673 |
| 2 | 1 | 70.7 | 90.5 | 22 / 35 | 5831 |
| 3 | 1 | 71.4 | 92.4 | 26 / 35 | 6039 |
| 4 | 1 | 72.0 | 95.2 | 26 / 35 | 6039 |
| 5 | 1 | 71.8 | 93.0 | 22 / 35 | 6399 |
| 6 | 1 | 70.6 | 91.1 | 21 / 35 | 5963 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 93 | 86% |
| maribo.mini.MiniQuester 0.1 | 46 | 87% |
| ara.Shera 0.88 | 26 | 62% |
| dsw.StaticD 1.0 | 4 | 100% |
| amz.NanoClone 1.41 | 2 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 1019. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 28 | 38% | 98 |
| ara.Shera 0.88 | 22 | 30% | 43 |
| maribo.mini.MiniQuester 0.1 | 11 | 15% | 49 |
| stelo.MirrorMicro 1.0 | 2 | 3% | 5 |
| mme.NikeEnhanced 2.0 | 2 | 3% | 3 |
| amz.NanoClone 1.41 | 2 | 3% | 2 |
| dsw.StaticD 1.0 | 0 | 0% | 6 |
| maribo.IotaCT 1.1 | 0 | 0% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 163934 melee ticks, 57794 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 33 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 3.

Targeting waves (205 rounds): 51722 sent, 47008 reached their opponent, 9206 virtual hits (19.6% of those reached).

## Melee bench: F43

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 562 over 6 battles (93.7 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 80.3 | 31 / 210 | 2.78 | 15.9% | 25125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.5% | 140 |
| hadur117.Hadur 3.20et | 2.0 | 15.9% | 31 |
| brainfade.melee.Dusk 0.44 | 3.2 | 13.0% | 28 |
| dummy.micro.Sparrow 2.5 | 3.8 | 12.0% | 4 |
| wcsv.melee.EngineerMelee 0.1 | 5.3 | 10.1% | 4 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.6% | 2 |
| jab.DiamondStealer 5 | 7.3 | 7.4% | 0 |
| mz.NanoGod 2.02 | 7.5 | 7.5% | 1 |
| cvt.Firsty 1.0 | 9.0 | 3.5% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.1 | 82.2 | 6 / 35 | 4381 |
| 2 | 2 | 67.2 | 83.2 | 7 / 35 | 4270 |
| 3 | 2 | 67.1 | 84.4 | 6 / 35 | 4363 |
| 4 | 2 | 65.7 | 77.5 | 5 / 35 | 4416 |
| 5 | 2 | 64.7 | 77.1 | 4 / 35 | 3622 |
| 6 | 2 | 65.0 | 77.1 | 3 / 35 | 4073 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 81 | 21% |
| brainfade.melee.Dusk 0.44 | 20 | 35% |
| dummy.micro.Sparrow 2.5 | 5 | 80% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |
| mz.NanoGod 2.02 | 1 | 0% |

Hadur died in 183 of 210 rounds, at a mean tick of 1007. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 107 | 58% | 124 |
| brainfade.melee.Dusk 0.44 | 34 | 19% | 41 |
| dummy.micro.Sparrow 2.5 | 17 | 9% | 20 |
| Krabb.akim2.Akim2 1.1b | 8 | 4% | 11 |
| wcsv.melee.EngineerMelee 0.1 | 8 | 4% | 9 |
| mz.NanoGod 2.02 | 4 | 2% | 4 |
| jab.DiamondStealer 5 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 162468 melee ticks, 45814 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 25 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 50151 sent, 45226 reached their opponent, 7279 virtual hits (16.1% of those reached).

## Melee bench: F44

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 293 over 6 battles (48.8 per battle, most in one battle 144). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 93.8 | 157 / 210 | 1.56 | 21.3% | 35330 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 21.3% | 157 |
| stelo.Liblix 0.3.1 | 2.2 | 15.3% | 34 |
| tzu.TheArtOfWar 1.2 | 2.8 | 13.9% | 10 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.5 | 9.7% | 1 |
| jwirde.Gort 2.0 | 4.7 | 9.4% | 4 |
| wompi.Quokka 1.6 | 6.5 | 7.5% | 3 |
| disan.Chair 2.2.0 | 6.8 | 7.2% | 0 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.6% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.9% | 1 |
| sample.Crazy 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 95.6 | 29 / 35 | 5719 |
| 2 | 1 | 71.6 | 91.1 | 23 / 35 | 6043 |
| 3 | 1 | 72.5 | 96.2 | 29 / 35 | 6069 |
| 4 | 1 | 72.5 | 93.7 | 28 / 35 | 6176 |
| 5 | 1 | 70.5 | 91.7 | 20 / 35 | 5431 |
| 6 | 1 | 71.8 | 94.3 | 28 / 35 | 5892 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 82 | 80% |
| tzu.TheArtOfWar 1.2 | 63 | 94% |
| jwirde.Gort 2.0 | 14 | 86% |
| disan.Chair 2.2.0 | 9 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 88% |
| wompi.Quokka 1.6 | 4 | 75% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 877. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 27 | 50% | 88 |
| tzu.TheArtOfWar 1.2 | 8 | 15% | 59 |
| jwirde.Gort 2.0 | 5 | 9% | 26 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 9% | 16 |
| wompi.Quokka 1.6 | 3 | 6% | 5 |
| stf.PanzerGeneral 0.1 | 2 | 4% | 3 |
| amk.jointstrike.JointStrike 0.2 | 1 | 2% | 6 |
| disan.Chair 2.2.0 | 1 | 2% | 5 |
| sample.Crazy 1.0 | 1 | 2% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 152428 melee ticks, 45029 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 32 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 52767 sent, 48067 reached their opponent, 10064 virtual hits (20.9% of those reached).

## Melee bench: F45

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 511 over 6 battles (85.2 per battle, most in one battle 152). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.0 | 116 / 210 | 2.08 | 19.9% | 33435 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20et | 1.0 | 19.9% | 116 |
| jje.BagPuss 1.2 | 2.5 | 12.6% | 14 |
| eem.IWillFireNoBullet v2.8 | 3.2 | 11.4% | 65 |
| myl.nano.Graviton 1.10 | 4.2 | 10.5% | 3 |
| sul.Lunar 1.1 | 4.3 | 10.8% | 9 |
| hvilela.HVilela 0.9 | 6.3 | 9.0% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.2 | 8.4% | 2 |
| fm.claire 1.7 | 7.3 | 8.4% | 0 |
| wit.Deep7 2.0 | 9.0 | 5.2% | 2 |
| abud.ThirdRobo 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 87.3 | 19 / 35 | 5409 |
| 2 | 1 | 70.8 | 89.5 | 17 / 35 | 6023 |
| 3 | 1 | 69.0 | 85.1 | 19 / 35 | 5348 |
| 4 | 1 | 71.5 | 92.4 | 24 / 35 | 6007 |
| 5 | 1 | 68.9 | 87.6 | 18 / 35 | 5209 |
| 6 | 1 | 68.8 | 86.0 | 19 / 35 | 5439 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 64 | 48% |
| jje.BagPuss 1.2 | 32 | 84% |
| sul.Lunar 1.1 | 25 | 88% |
| myl.nano.Graviton 1.10 | 20 | 95% |
| pez.mini.ChironexFleckeri 0.5 | 10 | 90% |
| wit.Deep7 2.0 | 5 | 100% |
| hvilela.HVilela 0.9 | 2 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 1448. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 42 | 43% | 0 |
| jje.BagPuss 1.2 | 19 | 19% | 71 |
| sul.Lunar 1.1 | 9 | 9% | 49 |
| hvilela.HVilela 0.9 | 8 | 8% | 18 |
| fm.claire 1.7 | 6 | 6% | 14 |
| myl.nano.Graviton 1.10 | 5 | 5% | 34 |
| wit.Deep7 2.0 | 4 | 4% | 7 |
| pez.mini.ChironexFleckeri 0.5 | 1 | 1% | 10 |
| abud.ThirdRobo 1.0 | 0 | 0% | 5 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 191489 melee ticks, 78757 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 50 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 58620 sent, 53856 reached their opponent, 7866 virtual hits (14.6% of those reached).

## Melee bench: F46

hadur117.Hadur 3.20et against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 780 over 6 battles (130.0 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 84.6 | 70 / 210 | 2.39 | 17.1% | 26437 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.5 | 17.2% | 59 |
| hadur117.Hadur 3.20et | 1.8 | 17.1% | 70 |
| rsalesc.melee.Medina 0.4.5 | 2.7 | 15.9% | 67 |
| cx.Princess 1.0 | 4.5 | 10.3% | 10 |
| mz.MicroSheep 1.0 | 4.7 | 10.1% | 0 |
| sadoner.killer 0.2 | 6.0 | 8.8% | 1 |
| arthord.NanoSatanMelee Beta | 6.8 | 7.4% | 3 |
| jeremyreeder.collective.Prophet 5 | 8.3 | 5.5% | 0 |
| kurios.DOSexe .9a | 8.7 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 86.7 | 12 / 35 | 4371 |
| 2 | 2 | 66.7 | 85.7 | 12 / 35 | 4254 |
| 3 | 2 | 66.1 | 83.2 | 9 / 35 | 4369 |
| 4 | 2 | 66.2 | 83.5 | 13 / 35 | 4073 |
| 5 | 2 | 67.4 | 85.1 | 11 / 35 | 4713 |
| 6 | 2 | 67.5 | 83.5 | 13 / 35 | 4657 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 75 | 63% |
| rsalesc.melee.Medina 0.4.5 | 31 | 29% |
| cx.Princess 1.0 | 11 | 64% |
| mz.MicroSheep 1.0 | 4 | 100% |
| arthord.NanoSatanMelee Beta | 2 | 100% |
| jeremyreeder.collective.Prophet 5 | 1 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 976. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 63 | 43% | 101 |
| rsalesc.melee.Medina 0.4.5 | 48 | 33% | 63 |
| cx.Princess 1.0 | 12 | 8% | 18 |
| sadoner.killer 0.2 | 9 | 6% | 12 |
| mz.MicroSheep 1.0 | 4 | 3% | 8 |
| arthord.NanoSatanMelee Beta | 4 | 3% | 7 |
| jeremyreeder.collective.Prophet 5 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 164102 melee ticks, 39545 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 35 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 47066 sent, 42165 reached their opponent, 6306 virtual hits (15.0% of those reached).

