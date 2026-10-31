# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 141 over 6 battles (23.5 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 87.5 | 54 / 210 | 2.12 | 17.9% | 32544 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.5% | 136 |
| hadur117.Hadur 3.20aa | 2.0 | 17.9% | 54 |
| sgp.JollyNinja 3.53 | 3.5 | 11.3% | 11 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.8 | 10.9% | 3 |
| mz.MicroGodMelee 1 | 5.2 | 9.7% | 4 |
| lorneswork.Predator 1.0 | 5.5 | 9.5% | 0 |
| adt.Ar2 1.0 | 7.0 | 7.7% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.9% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.6 | 88.9 | 11 / 35 | 5479 |
| 2 | 2 | 67.5 | 85.1 | 9 / 35 | 5504 |
| 3 | 2 | 69.2 | 89.5 | 10 / 35 | 5696 |
| 4 | 2 | 67.1 | 87.9 | 10 / 35 | 4805 |
| 5 | 2 | 68.4 | 87.3 | 8 / 35 | 5796 |
| 6 | 2 | 67.3 | 86.3 | 6 / 35 | 5264 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 128 | 13% |
| sgp.JollyNinja 3.53 | 22 | 73% |
| mz.MicroGodMelee 1 | 10 | 70% |
| lorneswork.Predator 1.0 | 9 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 156 of 210 rounds, at a mean tick of 1267. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 121 | 78% | 139 |
| sgp.JollyNinja 3.53 | 12 | 8% | 25 |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 6% | 16 |
| mz.MicroGodMelee 1 | 5 | 3% | 13 |
| lorneswork.Predator 1.0 | 4 | 3% | 10 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 2 |
| skm.butterfly 1.0 | 1 | 1% | 2 |
| adt.Ar2 1.0 | 1 | 1% | 2 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 198 rounds): 137743 melee ticks, 104418 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 64 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 44069 sent, 39336 reached their opponent, 7775 virtual hits (19.8% of those reached).

## Melee bench: F02

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 201 over 6 battles (33.5 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 87.2 | 105 / 210 | 2.15 | 18.9% | 30487 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 18.9% | 105 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.6% | 50 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.2% | 21 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.7 | 10.1% | 8 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.7% | 4 |
| Noran.BitchingElk 0.054 | 6.5 | 8.3% | 14 |
| fnc.bandit.Bandit 5.2.0 | 6.7 | 8.2% | 1 |
| sch.Simone 0.3d | 7.5 | 7.5% | 6 |
| stelo.PatternRobot 1.0 | 9.0 | 4.9% | 0 |
| fullsail.SweetTea 1.1 | 10.0 | 3.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 89.2 | 19 / 35 | 5351 |
| 2 | 1 | 67.3 | 84.8 | 16 / 35 | 4536 |
| 3 | 1 | 68.5 | 85.7 | 18 / 35 | 5017 |
| 4 | 1 | 65.9 | 80.6 | 10 / 35 | 4678 |
| 5 | 1 | 70.5 | 92.4 | 22 / 35 | 5558 |
| 6 | 1 | 70.2 | 90.5 | 20 / 35 | 5347 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 48 | 52% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 36 | 83% |
| Noran.BitchingElk 0.054 | 22 | 50% |
| com.cohesiva.robocode.ManOwaR 1.0 | 19 | 84% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 91% |
| sch.Simone 0.3d | 11 | 64% |
| fnc.bandit.Bandit 5.2.0 | 4 | 75% |
| stelo.PatternRobot 1.0 | 3 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 1040. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 35 | 33% | 59 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 20 | 19% | 53 |
| Noran.BitchingElk 0.054 | 14 | 13% | 23 |
| com.cohesiva.robocode.ManOwaR 1.0 | 13 | 12% | 33 |
| sch.Simone 0.3d | 9 | 8% | 12 |
| lrem.micro.SpikeSoldier 0.4 | 7 | 7% | 16 |
| fnc.bandit.Bandit 5.2.0 | 5 | 5% | 9 |
| stelo.PatternRobot 1.0 | 3 | 3% | 5 |

Posture (Hadur's M records, 199 rounds): 166602 melee ticks, 49500 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 41 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 58344 sent, 53771 reached their opponent, 9167 virtual hits (17.0% of those reached).

## Melee bench: F03

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 127 over 6 battles (21.2 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 91.7 | 155 / 210 | 1.75 | 20.4% | 37874 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 20.4% | 155 |
| radnor.DoctorBob 1.42 | 2.2 | 13.9% | 20 |
| vuen.Cake 2.51 | 3.0 | 12.8% | 20 |
| kawigi.nano.Lib 1.0 | 3.8 | 12.1% | 11 |
| urdos.URDOS 1.3 | 5.0 | 9.0% | 0 |
| adt.Ar1 2.1 | 6.3 | 7.6% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.2 | 6.9% | 3 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.7% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.2 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 89.2 | 24 / 35 | 6079 |
| 2 | 1 | 70.2 | 90.8 | 23 / 35 | 6382 |
| 3 | 1 | 71.7 | 94.9 | 31 / 35 | 6453 |
| 4 | 1 | 71.8 | 96.2 | 29 / 35 | 6583 |
| 5 | 1 | 69.6 | 87.3 | 25 / 35 | 6111 |
| 6 | 1 | 70.4 | 91.7 | 23 / 35 | 6266 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 72 | 88% |
| radnor.DoctorBob 1.42 | 59 | 95% |
| kawigi.nano.Lib 1.0 | 31 | 84% |
| adt.Ar1 2.1 | 5 | 100% |
| oa.weak.FlyMk1 0.1 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 50% |
| urdos.URDOS 1.3 | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 16 | 29% | 68 |
| vuen.Cake 2.51 | 14 | 25% | 64 |
| kawigi.nano.Lib 1.0 | 7 | 13% | 31 |
| urdos.URDOS 1.3 | 7 | 13% | 14 |
| bwbaugh.nano.Tirunculus 0.0.0a | 6 | 11% | 8 |
| adt.Ar1 2.1 | 2 | 4% | 8 |
| oa.weak.FlyMk1 0.1 | 2 | 4% | 8 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 2% | 1 |

Posture (Hadur's M records, 202 rounds): 129025 melee ticks, 43096 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 58 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 39230 sent, 34511 reached their opponent, 9153 virtual hits (26.5% of those reached).

## Melee bench: F04

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 728 over 6 battles (121.3 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 87.5 | 35 / 210 | 2.12 | 18.0% | 34035 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.4% | 157 |
| hadur117.Hadur 3.20aa | 2.0 | 18.0% | 35 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.2% | 9 |
| TNT.TNT 0.99.1 | 4.0 | 10.9% | 8 |
| josago.Jorgito 0.16 | 5.0 | 9.3% | 0 |
| css.Delitioner 0.11 | 6.2 | 6.9% | 1 |
| tj.zombie1n 1.0.1 | 7.0 | 6.2% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.2% | 0 |
| spin.Bugstard 0.012b | 9.3 | 4.1% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.3 | 88.6 | 5 / 35 | 5948 |
| 2 | 2 | 68.3 | 85.1 | 5 / 35 | 5657 |
| 3 | 2 | 69.2 | 88.6 | 9 / 35 | 5805 |
| 4 | 2 | 68.0 | 87.0 | 5 / 35 | 5212 |
| 5 | 2 | 68.5 | 87.9 | 6 / 35 | 5441 |
| 6 | 2 | 69.6 | 87.9 | 5 / 35 | 5972 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 142 | 11% |
| TNT.TNT 0.99.1 | 13 | 54% |
| apc.LeeroyJenkins2 1.0 | 12 | 58% |
| css.Delitioner 0.11 | 3 | 100% |
| josago.Jorgito 0.16 | 3 | 100% |

Hadur died in 181 of 210 rounds, at a mean tick of 1381. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 136 | 75% | 152 |
| apc.LeeroyJenkins2 1.0 | 19 | 10% | 26 |
| TNT.TNT 0.99.1 | 12 | 7% | 18 |
| josago.Jorgito 0.16 | 7 | 4% | 10 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |
| css.Delitioner 0.11 | 0 | 0% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 198292 melee ticks, 86093 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 56 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 61147 sent, 56253 reached their opponent, 8261 virtual hits (14.7% of those reached).

## Melee bench: F05

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 735 over 6 battles (122.5 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 80.2 | 31 / 210 | 2.78 | 15.5% | 23980 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 17.7% | 88 |
| justin.DemonicRage 3.4 | 1.7 | 17.2% | 67 |
| hadur117.Hadur 3.20aa | 3.0 | 15.5% | 31 |
| wompi.Numbat 2.1 | 4.2 | 12.1% | 14 |
| axeBots.HataMoto 3.09 | 5.3 | 9.4% | 10 |
| ms.Ares 0.19 | 5.5 | 8.9% | 0 |
| supersample.SuperBoxBot 1.0 | 7.3 | 5.4% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.2% | 0 |
| GarmBox.Oranges 1.0 | 9.3 | 4.3% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.1 | 81.0 | 6 / 35 | 4092 |
| 2 | 3 | 64.6 | 81.0 | 6 / 35 | 3842 |
| 3 | 3 | 64.4 | 79.7 | 5 / 35 | 4110 |
| 4 | 3 | 63.8 | 78.1 | 2 / 35 | 4049 |
| 5 | 3 | 64.7 | 81.3 | 6 / 35 | 3822 |
| 6 | 3 | 65.0 | 80.3 | 6 / 35 | 4065 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 46 | 30% |
| cb.fire.Firestarter 2.0f | 43 | 12% |
| wompi.Numbat 2.1 | 9 | 56% |
| axeBots.HataMoto 3.09 | 9 | 78% |

Hadur died in 185 of 210 rounds, at a mean tick of 963. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 73 | 39% | 80 |
| justin.DemonicRage 3.4 | 67 | 36% | 79 |
| wompi.Numbat 2.1 | 21 | 11% | 27 |
| axeBots.HataMoto 3.09 | 10 | 5% | 15 |
| ms.Ares 0.19 | 8 | 4% | 8 |
| supersample.SuperBoxBot 1.0 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 164265 melee ticks, 39489 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 74 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 74 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 49392 sent, 44382 reached their opponent, 7343 virtual hits (16.5% of those reached).

## Melee bench: F06

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 119 over 6 battles (19.8 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 90.1 | 136 / 210 | 1.89 | 19.9% | 32511 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 19.9% | 136 |
| jekl.StoneGhost 0.7 | 2.2 | 14.6% | 20 |
| origin.SleepSiphon 1.7b | 3.3 | 13.2% | 30 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.1% | 13 |
| mld.Wisdom 1.0 | 4.8 | 10.6% | 0 |
| gg.Wolverine 2.0 | 5.8 | 8.4% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 6.9% | 7 |
| DBall.NUKE 0.1 | 8.0 | 6.1% | 1 |
| spinnercat.Omen 1.0 | 8.7 | 5.5% | 0 |
| sample.Fire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 90.5 | 20 / 35 | 5001 |
| 2 | 1 | 70.3 | 90.8 | 22 / 35 | 5488 |
| 3 | 1 | 70.4 | 91.4 | 24 / 35 | 5132 |
| 4 | 1 | 70.2 | 87.6 | 24 / 35 | 5638 |
| 5 | 1 | 71.4 | 94.0 | 25 / 35 | 5544 |
| 6 | 1 | 69.7 | 86.3 | 21 / 35 | 5708 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 64 | 92% |
| origin.SleepSiphon 1.7b | 44 | 80% |
| pe.minimelee.SandboxMiniMelee 1.1 | 29 | 79% |
| gg.Wolverine 2.0 | 10 | 90% |
| ers.nano.hawk.HawkLA 3.0m | 9 | 33% |
| mld.Wisdom 1.0 | 5 | 100% |
| DBall.NUKE 0.1 | 2 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 21 | 28% | 57 |
| origin.SleepSiphon 1.7b | 20 | 27% | 61 |
| pe.minimelee.SandboxMiniMelee 1.1 | 14 | 19% | 40 |
| mld.Wisdom 1.0 | 7 | 9% | 17 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 9% | 14 |
| spinnercat.Omen 1.0 | 3 | 4% | 3 |
| gg.Wolverine 2.0 | 2 | 3% | 11 |
| DBall.NUKE 0.1 | 0 | 0% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 148147 melee ticks, 45931 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 41 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 45864 sent, 41085 reached their opponent, 8874 virtual hits (21.6% of those reached).

## Melee bench: F07

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 410 over 6 battles (68.3 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 93.5 | 121 / 210 | 1.59 | 21.1% | 40215 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 21.1% | 121 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 16.8% | 42 |
| rtk.Tachikoma 1.0 | 2.7 | 15.8% | 29 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.3% | 10 |
| franzor.Lizt 1.3.1 | 4.7 | 10.8% | 9 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.0% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.5% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.5 | 2.1% | 0 |
| drd.Dreadknoght 0.9 | 9.5 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 91.4 | 15 / 35 | 6728 |
| 2 | 1 | 72.6 | 93.7 | 22 / 35 | 6411 |
| 3 | 1 | 73.4 | 95.9 | 23 / 35 | 6782 |
| 4 | 1 | 73.2 | 93.3 | 24 / 35 | 6934 |
| 5 | 1 | 71.7 | 91.4 | 13 / 35 | 6617 |
| 6 | 1 | 73.4 | 95.2 | 24 / 35 | 6743 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 89 | 74% |
| rsalesc.melee.Monk 0.3.6c | 56 | 30% |
| franzor.Lizt 1.3.1 | 26 | 81% |
| oog.melee.CapuletDroid 1.1 | 21 | 81% |

Hadur died in 92 of 210 rounds, at a mean tick of 1469. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 41 | 45% | 74 |
| rtk.Tachikoma 1.0 | 34 | 37% | 103 |
| oog.melee.CapuletDroid 1.1 | 7 | 8% | 28 |
| franzor.Lizt 1.3.1 | 6 | 7% | 3 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 1 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 190810 melee ticks, 94484 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 49 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 57329 sent, 52491 reached their opponent, 10493 virtual hits (20.0% of those reached).

## Melee bench: F08

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 837 over 6 battles (139.5 per battle, most in one battle 147). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 90.4 | 134 / 210 | 1.86 | 19.4% | 29335 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 19.4% | 134 |
| tm.Yuugao 1.0 | 2.3 | 13.0% | 29 |
| shrub.Vapour v159 | 2.8 | 12.5% | 17 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 11.1% | 14 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 9.6% | 6 |
| m3thos.Eva00 1.1 | 6.0 | 8.5% | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 6.8 | 8.0% | 9 |
| qualidafial.MajorDick 1.0.1 | 8.2 | 7.0% | 2 |
| SHAM.WOW 1.4 | 9.2 | 5.8% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 90.8 | 26 / 35 | 5023 |
| 2 | 1 | 70.0 | 92.7 | 24 / 35 | 5064 |
| 3 | 1 | 67.7 | 85.4 | 21 / 35 | 4641 |
| 4 | 1 | 69.8 | 93.3 | 26 / 35 | 4862 |
| 5 | 1 | 68.6 | 90.5 | 20 / 35 | 4770 |
| 6 | 1 | 68.6 | 89.8 | 17 / 35 | 4975 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 55 | 76% |
| shrub.Vapour v159 | 41 | 76% |
| Krabb.sliNk.Garm 0.9u | 26 | 77% |
| com.spp.robocode.MostlyHarmless 010 | 15 | 93% |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 58% |
| m3thos.Eva00 1.1 | 10 | 100% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| SHAM.WOW 1.4 | 3 | 67% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 21 | 25% | 59 |
| shrub.Vapour v159 | 20 | 24% | 50 |
| Krabb.sliNk.Garm 0.9u | 15 | 18% | 36 |
| com.spp.robocode.MostlyHarmless 010 | 9 | 11% | 26 |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 7% | 16 |
| m3thos.Eva00 1.1 | 4 | 5% | 11 |
| SHAM.WOW 1.4 | 1 | 1% | 6 |
| zyx.nano.BacillusComma 1.0 | 0 | 0% | 4 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 149638 melee ticks, 41779 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 59 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 49113 sent, 44123 reached their opponent, 8023 virtual hits (18.2% of those reached).

## Melee bench: F09

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 621 over 6 battles (103.5 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 78.0 | 58 / 210 | 2.98 | 15.7% | 22243 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.5% | 99 |
| hadur117.Hadur 3.20aa | 2.0 | 15.7% | 58 |
| kc.micro.Figment 1.0 | 2.8 | 13.5% | 22 |
| yagami.Tidus 0.11 | 4.5 | 10.6% | 2 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.8% | 13 |
| mc2.enemy.Original 0.9 | 5.8 | 9.5% | 15 |
| dft.Calliope 5.6 | 7.0 | 7.8% | 1 |
| step.nanoPri 1.0 | 8.3 | 5.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.8 | 5.0% | 0 |
| rdm.Dueler 0.4x | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.4 | 70.5 | 6 / 35 | 3384 |
| 2 | 2 | 66.2 | 82.9 | 15 / 35 | 3880 |
| 3 | 2 | 63.4 | 76.5 | 4 / 35 | 3920 |
| 4 | 1 | 66.4 | 83.5 | 14 / 35 | 4136 |
| 5 | 2 | 63.7 | 78.1 | 10 / 35 | 3291 |
| 6 | 2 | 63.9 | 76.8 | 9 / 35 | 3632 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 61 | 34% |
| kc.micro.Figment 1.0 | 27 | 81% |
| pedersen.Grishnakh 1.0 | 7 | 71% |
| mc2.enemy.Original 0.9 | 7 | 57% |
| dft.Calliope 5.6 | 5 | 80% |
| yagami.Tidus 0.11 | 3 | 67% |

Hadur died in 158 of 210 rounds, at a mean tick of 843. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 71 | 45% | 92 |
| kc.micro.Figment 1.0 | 20 | 13% | 40 |
| yagami.Tidus 0.11 | 19 | 12% | 22 |
| mc2.enemy.Original 0.9 | 18 | 11% | 20 |
| pedersen.Grishnakh 1.0 | 13 | 8% | 18 |
| dft.Calliope 5.6 | 6 | 4% | 9 |
| robar.nano.Assertive_Melee 0.2 | 4 | 3% | 4 |
| rdm.Dueler 0.4x | 2 | 1% | 3 |
| step.nanoPri 1.0 | 0 | 0% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 151716 melee ticks, 35706 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 40 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 1.

Targeting waves (208 rounds): 49544 sent, 44653 reached their opponent, 6320 virtual hits (14.2% of those reached).

## Melee bench: F10

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 345 over 6 battles (57.5 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 94.8 | 167 / 210 | 1.47 | 20.8% | 34898 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 20.8% | 167 |
| DTF.Kludgy 1.2b | 2.0 | 14.1% | 19 |
| ne.Chimera 1.2 | 3.3 | 12.4% | 8 |
| ejb.Polaris 1.0.1 | 3.7 | 12.4% | 10 |
| vStar.RAFzilla 2.15 | 5.5 | 10.0% | 3 |
| tvv.micro.Antares 1.1.1 | 5.5 | 9.9% | 1 |
| kurios.DOSexe .9b | 7.8 | 5.8% | 2 |
| sam.Samspin 1.0 | 8.0 | 5.4% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.8 | 4.9% | 0 |
| donjezza.Muncho 1.0 | 9.3 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 97.8 | 31 / 35 | 6079 |
| 2 | 1 | 70.4 | 92.7 | 26 / 35 | 5454 |
| 3 | 1 | 71.3 | 94.6 | 27 / 35 | 5870 |
| 4 | 1 | 70.4 | 92.1 | 24 / 35 | 5874 |
| 5 | 1 | 71.9 | 97.8 | 31 / 35 | 5921 |
| 6 | 1 | 71.1 | 94.0 | 28 / 35 | 5700 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 56 | 82% |
| ejb.Polaris 1.0.1 | 56 | 91% |
| ne.Chimera 1.2 | 37 | 86% |
| vStar.RAFzilla 2.15 | 15 | 87% |
| tvv.micro.Antares 1.1.1 | 15 | 93% |
| kurios.DOSexe .9b | 8 | 75% |
| donjezza.Muncho 1.0 | 5 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 17 | 38% | 65 |
| ne.Chimera 1.2 | 10 | 22% | 38 |
| ejb.Polaris 1.0.1 | 9 | 20% | 59 |
| kurios.DOSexe .9b | 3 | 7% | 13 |
| vStar.RAFzilla 2.15 | 2 | 4% | 17 |
| tvv.micro.Antares 1.1.1 | 1 | 2% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 2 |
| donjezza.Muncho 1.0 | 0 | 0% | 3 |
| sam.Samspin 1.0 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 143490 melee ticks, 62701 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 66 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 47194 sent, 42482 reached their opponent, 8072 virtual hits (19.0% of those reached).

## Melee bench: F11

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 308 over 6 battles (51.3 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 82.3 | 71 / 210 | 2.59 | 16.6% | 23802 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.5 | 16.6% | 71 |
| rz.Aleph 0.34 | 1.5 | 16.5% | 71 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.5% | 23 |
| djc.DynaBot 0.1.1 | 4.0 | 10.8% | 14 |
| rdt199.Warlord 0.73 | 5.7 | 9.2% | 10 |
| br2.MobyDickBot 1.6 | 6.0 | 8.7% | 13 |
| uji.YellohFellah 1.0 | 6.3 | 8.3% | 8 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.1% | 0 |
| stelo.MirrorNano 1.3 | 9.3 | 5.1% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 84.4 | 12 / 35 | 3767 |
| 2 | 2 | 64.7 | 81.3 | 11 / 35 | 3772 |
| 3 | 1 | 65.3 | 81.9 | 10 / 35 | 4138 |
| 4 | 2 | 65.2 | 82.2 | 10 / 35 | 3911 |
| 5 | 2 | 64.6 | 80.0 | 13 / 35 | 3820 |
| 6 | 1 | 66.5 | 84.1 | 15 / 35 | 4394 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 61 | 46% |
| cx.mini.Nimrod 0.55 | 20 | 70% |
| djc.DynaBot 0.1.1 | 19 | 53% |
| rdt199.Warlord 0.73 | 13 | 77% |
| br2.MobyDickBot 1.6 | 9 | 33% |
| uji.YellohFellah 1.0 | 6 | 83% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 924. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 63 | 45% | 89 |
| cx.mini.Nimrod 0.55 | 23 | 16% | 33 |
| djc.DynaBot 0.1.1 | 15 | 11% | 21 |
| br2.MobyDickBot 1.6 | 12 | 9% | 16 |
| rdt199.Warlord 0.73 | 10 | 7% | 23 |
| KiraNL.Chupacabra 0.4 | 6 | 4% | 7 |
| uji.YellohFellah 1.0 | 5 | 4% | 12 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 2% | 5 |
| stelo.MirrorNano 1.3 | 2 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 161585 melee ticks, 38575 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 49 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 3.

Targeting waves (206 rounds): 52050 sent, 47087 reached their opponent, 6407 virtual hits (13.6% of those reached).

## Melee bench: F12

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 357 over 6 battles (59.5 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 87.3 | 120 / 210 | 2.14 | 18.3% | 24440 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 18.3% | 120 |
| bts.wiki.RipCurl 0.9b | 2.2 | 14.0% | 36 |
| nat.PallasHawk 1.0 | 3.5 | 12.4% | 23 |
| darkcanuck.Leon 1.01 | 3.5 | 12.3% | 12 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.0% | 13 |
| jrm.Test0 1.0 | 6.2 | 8.4% | 3 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.3% | 0 |
| jp.Perpy 16.0 | 8.2 | 6.6% | 0 |
| jaybot.bots.Oddball 4.0 | 9.2 | 5.5% | 3 |
| stuff.Vlad 0.1 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 87.0 | 19 / 35 | 3768 |
| 2 | 1 | 67.2 | 85.7 | 19 / 35 | 4216 |
| 3 | 1 | 68.6 | 89.5 | 21 / 35 | 4356 |
| 4 | 1 | 68.7 | 89.8 | 22 / 35 | 4226 |
| 5 | 1 | 67.0 | 85.7 | 19 / 35 | 3809 |
| 6 | 1 | 67.4 | 86.0 | 20 / 35 | 4065 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 47 | 87% |
| bts.wiki.RipCurl 0.9b | 43 | 67% |
| nat.PallasHawk 1.0 | 41 | 76% |
| brainfade.melee.Genghis 0.36 | 14 | 43% |
| jaybot.bots.Oddball 4.0 | 6 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| jp.Perpy 16.0 | 1 | 100% |
| jrm.Test0 1.0 | 1 | 0% |

Hadur died in 94 of 210 rounds, at a mean tick of 729. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 37 | 39% | 56 |
| nat.PallasHawk 1.0 | 19 | 20% | 53 |
| brainfade.melee.Genghis 0.36 | 16 | 17% | 22 |
| darkcanuck.Leon 1.01 | 8 | 9% | 54 |
| jrm.Test0 1.0 | 7 | 7% | 9 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 4 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 6 |
| stuff.Vlad 0.1 | 1 | 1% | 4 |
| jp.Perpy 16.0 | 1 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 132613 melee ticks, 38370 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 40 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 45429 sent, 40271 reached their opponent, 6731 virtual hits (16.7% of those reached).

## Melee bench: F13

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 96 over 6 battles (16.0 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 83.4 | 68 / 210 | 2.50 | 16.5% | 25853 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.8 | 16.5% | 81 |
| hadur117.Hadur 3.20aa | 2.0 | 16.5% | 68 |
| ags.Glacier 0.2.11 | 2.2 | 16.1% | 37 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.6% | 9 |
| shinh.Entangled 0.3 | 4.5 | 11.7% | 15 |
| apc.Colossus2 0.17 | 6.0 | 7.9% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.7% | 1 |
| maribo.FollowFire 1 | 8.3 | 4.9% | 0 |
| ayk.WallHugger 1.0 | 8.7 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 81.0 | 12 / 35 | 3992 |
| 2 | 2 | 66.0 | 84.4 | 13 / 35 | 3996 |
| 3 | 2 | 65.8 | 79.4 | 11 / 35 | 4575 |
| 4 | 1 | 68.0 | 89.2 | 12 / 35 | 4957 |
| 5 | 2 | 65.4 | 83.8 | 9 / 35 | 4034 |
| 6 | 3 | 65.9 | 82.5 | 11 / 35 | 4299 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 51 | 35% |
| ags.Glacier 0.2.11 | 48 | 60% |
| shinh.Entangled 0.3 | 20 | 50% |
| gh.micro.Gruweltje 0.7 | 15 | 60% |
| stelo.Wang 1.0 | 1 | 100% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 944. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 55 | 38% | 79 |
| ags.Glacier 0.2.11 | 48 | 34% | 74 |
| gh.micro.Gruweltje 0.7 | 16 | 11% | 24 |
| shinh.Entangled 0.3 | 14 | 10% | 21 |
| apc.Colossus2 0.17 | 4 | 3% | 5 |
| stelo.Wang 1.0 | 2 | 1% | 3 |
| maribo.FollowFire 1 | 2 | 1% | 2 |
| sample.Tracker 1.0 | 1 | 1% | 1 |
| ayk.WallHugger 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 150533 melee ticks, 51287 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 51 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 43524 sent, 38439 reached their opponent, 6032 virtual hits (15.7% of those reached).

## Melee bench: F14

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 263 over 6 battles (43.8 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 95.1 | 161 / 210 | 1.44 | 20.9% | 35047 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 20.9% | 161 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 15.1% | 19 |
| catcat20.shape.Theta 0.018 | 2.8 | 12.0% | 24 |
| co.edu.usb.rc.LidisTron 1.0 | 4.2 | 9.8% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 5.5 | 9.2% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 5.8 | 9.0% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.8 | 8.3% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 7.8% | 6 |
| pa.Improved 1.0 | 9.0 | 6.1% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 98.4 | 31 / 35 | 6063 |
| 2 | 1 | 71.6 | 95.6 | 28 / 35 | 5660 |
| 3 | 1 | 71.7 | 94.3 | 25 / 35 | 6206 |
| 4 | 1 | 72.0 | 97.8 | 29 / 35 | 5909 |
| 5 | 1 | 70.8 | 93.7 | 25 / 35 | 5568 |
| 6 | 1 | 70.3 | 91.1 | 23 / 35 | 5641 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 77 | 87% |
| catcat20.shape.Theta 0.018 | 54 | 74% |
| sanyi.mikrobi.Roberto 1.0 | 17 | 94% |
| co.edu.usb.rc.LidisTron 1.0 | 13 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 83% |
| Lo_Ian.Gandalf_V4 4.0 | 6 | 100% |
| pa.Improved 1.0 | 5 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 973. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 22 | 42% | 60 |
| simonton.micro.Sprout 1.1.3 | 16 | 31% | 83 |
| sanyi.mikrobi.Roberto 1.0 | 5 | 10% | 27 |
| sheldor.micro.PointInLineRRAL 1.0 | 2 | 4% | 13 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 4% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 6 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 2% | 4 |
| pa.Improved 1.0 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 143484 melee ticks, 51143 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 65 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 44667 sent, 39993 reached their opponent, 9599 virtual hits (24.0% of those reached).

## Melee bench: F15

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 258 over 6 battles (43.0 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 88.0 | 117 / 210 | 2.08 | 19.1% | 30646 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 19.1% | 117 |
| kawigi.micro.Shiz 1.1 | 2.2 | 13.3% | 17 |
| emp.Yngwie 1.11 | 3.0 | 12.7% | 51 |
| mld.DustBunny 3.8 | 4.2 | 11.8% | 8 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.5% | 3 |
| kawigi.robot.Girl 1.2 | 5.7 | 9.7% | 13 |
| lambdaxy.TBot 0.1 | 7.2 | 7.2% | 1 |
| Grystrion.TrackerWO 1.0 | 8.0 | 6.7% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 4.9% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 84.1 | 19 / 35 | 4942 |
| 2 | 1 | 69.5 | 89.8 | 22 / 35 | 5043 |
| 3 | 1 | 69.9 | 91.4 | 23 / 35 | 5062 |
| 4 | 1 | 69.1 | 88.9 | 17 / 35 | 5437 |
| 5 | 1 | 67.9 | 85.7 | 16 / 35 | 4790 |
| 6 | 1 | 69.4 | 87.9 | 20 / 35 | 5372 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 57 | 51% |
| kawigi.micro.Shiz 1.1 | 43 | 84% |
| mld.DustBunny 3.8 | 24 | 92% |
| kawigi.robot.Girl 1.2 | 17 | 76% |
| cb.nano.Insomnia 1.0 | 12 | 92% |
| divineomega.TrialBot 0.003 | 3 | 100% |
| lambdaxy.TBot 0.1 | 3 | 67% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 979. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 44 | 47% | 81 |
| kawigi.micro.Shiz 1.1 | 13 | 14% | 40 |
| cb.nano.Insomnia 1.0 | 10 | 11% | 14 |
| mld.DustBunny 3.8 | 7 | 7% | 32 |
| kawigi.robot.Girl 1.2 | 7 | 7% | 15 |
| Grystrion.TrackerWO 1.0 | 5 | 5% | 7 |
| divineomega.TrialBot 0.003 | 4 | 4% | 15 |
| lambdaxy.TBot 0.1 | 3 | 3% | 6 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 158377 melee ticks, 50218 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 64 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 51960 sent, 47334 reached their opponent, 7725 virtual hits (16.3% of those reached).

## Melee bench: F16

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 138 over 6 battles (23.0 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 88.3 | 114 / 210 | 2.06 | 19.5% | 33337 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 19.5% | 114 |
| gh.Griezel 0.5.2 | 2.2 | 16.2% | 55 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.8 | 13.7% | 5 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.6% | 24 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.4% | 0 |
| tvv.nano.Polaris 1.2 | 6.2 | 8.6% | 4 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.9% | 3 |
| repositorio.NanoStep 1.0 | 8.8 | 4.9% | 0 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 4.7% | 5 |
| asd.Cthulhu 1.3 | 9.2 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 87.6 | 19 / 35 | 5823 |
| 2 | 1 | 70.0 | 87.9 | 21 / 35 | 5478 |
| 3 | 1 | 68.8 | 87.0 | 18 / 35 | 5070 |
| 4 | 1 | 69.8 | 87.0 | 18 / 35 | 5563 |
| 5 | 1 | 70.6 | 91.7 | 20 / 35 | 5722 |
| 6 | 1 | 69.8 | 88.3 | 18 / 35 | 5681 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 79 | 56% |
| techdude.forest.FlamingForest 1.1 | 37 | 78% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 18 | 94% |
| bvh.fnr.Fenrir 0.36l | 10 | 100% |
| divineomega.DivineBot 1.9.4.5 | 6 | 83% |
| tvv.nano.Polaris 1.2 | 6 | 100% |
| stelo.IntrinsicVolatility 1.4 | 4 | 75% |

Hadur died in 97 of 210 rounds, at a mean tick of 1124. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 52 | 54% | 104 |
| techdude.forest.FlamingForest 1.1 | 16 | 16% | 47 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 10 | 10% | 22 |
| bvh.fnr.Fenrir 0.36l | 10 | 10% | 15 |
| divineomega.DivineBot 1.9.4.5 | 3 | 3% | 8 |
| stelo.IntrinsicVolatility 1.4 | 2 | 2% | 8 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 3 |
| repositorio.NanoStep 1.0 | 1 | 1% | 2 |
| asd.Cthulhu 1.3 | 1 | 1% | 1 |

Posture (Hadur's M records, 200 rounds): 168624 melee ticks, 63204 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 41 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 55388 sent, 50657 reached their opponent, 8496 virtual hits (16.8% of those reached).

## Melee bench: F17

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 354 over 6 battles (59.0 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 87.6 | 123 / 210 | 2.11 | 19.6% | 34323 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 19.6% | 123 |
| et.Predator 1.8 | 2.5 | 13.3% | 20 |
| oog.melee.Mercutio 1.0 | 2.7 | 12.8% | 23 |
| cx.BlestPain 1.41 | 3.8 | 12.1% | 32 |
| ahf.NanoAndrew .4 | 5.0 | 10.4% | 8 |
| maribo.melee.BMV 0.1 | 6.2 | 9.3% | 2 |
| nic.Nicator 2.4 | 6.8 | 8.6% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 6.0% | 0 |
| tex.Longbot 0.4 | 8.7 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 85.7 | 19 / 35 | 5808 |
| 2 | 1 | 69.6 | 88.3 | 19 / 35 | 5641 |
| 3 | 1 | 70.4 | 87.6 | 21 / 35 | 6059 |
| 4 | 1 | 70.3 | 89.5 | 21 / 35 | 5859 |
| 5 | 1 | 69.1 | 85.4 | 20 / 35 | 5514 |
| 6 | 1 | 70.0 | 89.2 | 23 / 35 | 5442 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 51 | 86% |
| oog.melee.Mercutio 1.0 | 46 | 85% |
| cx.BlestPain 1.41 | 30 | 43% |
| ahf.NanoAndrew .4 | 13 | 92% |
| maribo.melee.BMV 0.1 | 8 | 88% |
| nic.Nicator 2.4 | 4 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 4 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 1043. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 32 | 36% | 46 |
| et.Predator 1.8 | 19 | 21% | 61 |
| oog.melee.Mercutio 1.0 | 17 | 19% | 50 |
| ahf.NanoAndrew .4 | 10 | 11% | 21 |
| maribo.melee.BMV 0.1 | 7 | 8% | 15 |
| tex.Longbot 0.4 | 1 | 1% | 2 |
| goblin.Bender 2.4 | 1 | 1% | 1 |
| nic.Nicator 2.4 | 0 | 0% | 8 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 6 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 164340 melee ticks, 58015 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 63 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 54201 sent, 49390 reached their opponent, 10197 virtual hits (20.6% of those reached).

## Melee bench: F18

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 427 over 6 battles (71.2 per battle, most in one battle 147). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 90.7 | 135 / 210 | 1.83 | 19.5% | 28494 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 19.5% | 135 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.4% | 30 |
| agd.Mooserwirt2 2.7 | 2.8 | 12.6% | 23 |
| uji.DBH 1.1 | 4.2 | 11.0% | 6 |
| spinnercat.Robovirus 2.718 | 5.5 | 9.0% | 4 |
| ratosh.Nobo 0.21 | 6.2 | 8.3% | 2 |
| sigterm.Sigterm 1.0 | 6.3 | 8.5% | 7 |
| kawigi.mini.Fhqwhgads 1.1 | 7.8 | 6.8% | 0 |
| stelo.WangRobot 1.0 | 9.5 | 5.4% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 85.1 | 17 / 35 | 4316 |
| 2 | 1 | 69.3 | 91.7 | 22 / 35 | 4765 |
| 3 | 1 | 68.8 | 90.5 | 22 / 35 | 4526 |
| 4 | 1 | 70.4 | 92.7 | 27 / 35 | 5067 |
| 5 | 1 | 70.0 | 92.7 | 24 / 35 | 5028 |
| 6 | 1 | 69.5 | 91.7 | 23 / 35 | 4792 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 50 | 68% |
| agd.Mooserwirt2 2.7 | 39 | 82% |
| uji.DBH 1.1 | 31 | 90% |
| sigterm.Sigterm 1.0 | 21 | 76% |
| spinnercat.Robovirus 2.718 | 14 | 86% |
| ratosh.Nobo 0.21 | 8 | 88% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 100% |
| stelo.WangRobot 1.0 | 2 | 50% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 838. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 29 | 38% | 72 |
| agd.Mooserwirt2 2.7 | 15 | 19% | 48 |
| sigterm.Sigterm 1.0 | 10 | 13% | 20 |
| uji.DBH 1.1 | 9 | 12% | 27 |
| spinnercat.Robovirus 2.718 | 5 | 6% | 13 |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 4% | 8 |
| ratosh.Nobo 0.21 | 2 | 3% | 11 |
| stelo.WangRobot 1.0 | 2 | 3% | 8 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 137424 melee ticks, 47346 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 51 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 46039 sent, 41167 reached their opponent, 8689 virtual hits (21.1% of those reached).

## Melee bench: F19

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 339 over 6 battles (56.5 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.6 | 98.1 | 195 / 210 | 1.17 | 22.5% | 37785 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 22.5% | 195 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.7% | 6 |
| krillr.mini.JointStrike 2.0.0 | 3.3 | 11.8% | 2 |
| erdnis.Rover 0.3 | 4.3 | 10.8% | 2 |
| mld.Infinity 2.2 | 4.3 | 10.9% | 3 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.6% | 1 |
| mbh.Mbh 0.1 | 7.2 | 7.7% | 0 |
| pac.ABC 2.1 | 7.8 | 6.7% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.3% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 97.8 | 32 / 35 | 6571 |
| 2 | 1 | 73.2 | 99.4 | 33 / 35 | 5684 |
| 3 | 1 | 73.6 | 98.4 | 33 / 35 | 6273 |
| 4 | 1 | 73.5 | 96.8 | 31 / 35 | 6583 |
| 5 | 1 | 73.6 | 98.4 | 33 / 35 | 6276 |
| 6 | 1 | 73.9 | 97.8 | 33 / 35 | 6398 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 110 | 98% |
| krillr.mini.JointStrike 2.0.0 | 27 | 96% |
| erdnis.Rover 0.3 | 19 | 95% |
| mld.Infinity 2.2 | 18 | 100% |
| patson.PatsonTestBot 1.0 | 12 | 92% |
| pac.ABC 2.1 | 6 | 100% |
| mbh.Mbh 0.1 | 6 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 18 of 210 rounds, at a mean tick of 796. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 8 | 44% | 73 |
| krillr.mini.JointStrike 2.0.0 | 4 | 22% | 30 |
| erdnis.Rover 0.3 | 2 | 11% | 31 |
| patson.PatsonTestBot 1.0 | 2 | 11% | 19 |
| mld.Infinity 2.2 | 0 | 0% | 24 |
| pac.ABC 2.1 | 0 | 0% | 10 |
| pbg.R2D2 1.0 | 0 | 0% | 9 |
| mbh.Mbh 0.1 | 0 | 0% | 8 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 127554 melee ticks, 42761 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 49 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 43051 sent, 38446 reached their opponent, 8833 virtual hits (23.0% of those reached).

## Melee bench: F20

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 522 over 6 battles (87.0 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 94.0 | 148 / 210 | 1.54 | 21.3% | 36133 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 21.3% | 148 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.2% | 32 |
| fwb.Nine 1.0.1 | 3.3 | 11.0% | 12 |
| nz.jdc.nano.GridFu 1.0 | 4.2 | 10.4% | 3 |
| catcat20.Rabbit 0.001 | 4.5 | 10.4% | 11 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.8% | 1 |
| bayen.nut.Squirrel 1.615 | 7.3 | 7.2% | 4 |
| djdjdj.NanoSkunk10 1.0 | 8.2 | 5.9% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.5 | 5.6% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 95.2 | 25 / 35 | 5782 |
| 2 | 1 | 71.3 | 92.7 | 23 / 35 | 6023 |
| 3 | 1 | 72.7 | 96.5 | 29 / 35 | 6214 |
| 4 | 1 | 71.3 | 93.0 | 24 / 35 | 6008 |
| 5 | 1 | 71.8 | 94.0 | 24 / 35 | 6154 |
| 6 | 1 | 71.5 | 92.4 | 23 / 35 | 5952 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 93 | 78% |
| fwb.Nine 1.0.1 | 34 | 91% |
| catcat20.Rabbit 0.001 | 29 | 83% |
| nz.jdc.nano.GridFu 1.0 | 9 | 89% |
| m3thos.mini.Eva01 0.5.5 | 7 | 100% |
| bayen.nut.Squirrel 1.615 | 5 | 40% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 1110. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 36 | 53% | 98 |
| fwb.Nine 1.0.1 | 12 | 18% | 25 |
| catcat20.Rabbit 0.001 | 7 | 10% | 37 |
| nz.jdc.nano.GridFu 1.0 | 4 | 6% | 16 |
| bayen.nut.Squirrel 1.615 | 4 | 6% | 12 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 16 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 170008 melee ticks, 61309 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 30 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 30 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 53566 sent, 48608 reached their opponent, 11232 virtual hits (23.1% of those reached).

## Melee bench: F21

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 707 over 6 battles (117.8 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 92.0 | 129 / 210 | 1.72 | 20.6% | 35874 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 20.6% | 129 |
| eem.EvBot v4.6.16 | 2.0 | 16.9% | 65 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.6% | 8 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.9% | 2 |
| eld.Hmm 1.0 | 5.3 | 8.2% | 4 |
| oa.weak.BotherBot 0.1 | 5.7 | 7.4% | 2 |
| el.JumpShoot 0.2 | 7.8 | 5.8% | 0 |
| fire219.CatBot 1.0 | 7.8 | 6.1% | 0 |
| PSW.Relentless 0.1 | 8.8 | 5.3% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 91.4 | 21 / 35 | 5736 |
| 2 | 1 | 71.6 | 92.1 | 24 / 35 | 6040 |
| 3 | 1 | 71.5 | 94.3 | 23 / 35 | 5764 |
| 4 | 1 | 71.2 | 90.5 | 20 / 35 | 6304 |
| 5 | 1 | 71.9 | 93.7 | 19 / 35 | 6357 |
| 6 | 1 | 71.0 | 90.2 | 22 / 35 | 5673 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 134 | 65% |
| dummy.mini.Scimitar 1.01 | 24 | 88% |
| cf.RiO.RiOx 4.2.1 | 18 | 94% |
| eld.Hmm 1.0 | 4 | 25% |
| el.JumpShoot 0.2 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 1312. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 53 | 60% | 120 |
| dummy.mini.Scimitar 1.01 | 11 | 12% | 41 |
| cf.RiO.RiOx 4.2.1 | 9 | 10% | 24 |
| eld.Hmm 1.0 | 4 | 4% | 13 |
| PSW.Relentless 0.1 | 3 | 3% | 3 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 5 |
| arthord.MannyPacquiao Beta | 1 | 1% | 2 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 181483 melee ticks, 89474 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 78 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 78 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 1.

Targeting waves (208 rounds): 53383 sent, 48512 reached their opponent, 8506 virtual hits (17.5% of those reached).

## Melee bench: F22

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 188 over 6 battles (31.3 per battle, most in one battle 117). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 89.9 | 111 / 210 | 1.91 | 19.2% | 31450 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 19.2% | 111 |
| pe.SandboxDT 2.71m | 2.0 | 16.2% | 62 |
| kvk.HebusLeTroll 0.35 | 3.2 | 14.4% | 21 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.5% | 13 |
| bigpete.Stewie 1.0 | 4.8 | 10.5% | 4 |
| yk.JahRoslav 1.1 | 6.8 | 6.9% | 0 |
| tad.Dalek98 0.98 | 6.8 | 6.7% | 0 |
| gg.Squaraus 0.6 | 7.3 | 6.2% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.8% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 93.7 | 22 / 35 | 5731 |
| 2 | 1 | 69.3 | 88.9 | 19 / 35 | 5155 |
| 3 | 1 | 69.6 | 89.8 | 19 / 35 | 5163 |
| 4 | 1 | 70.8 | 92.1 | 22 / 35 | 5467 |
| 5 | 1 | 68.3 | 87.3 | 15 / 35 | 4769 |
| 6 | 1 | 69.2 | 87.6 | 14 / 35 | 5165 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 61 | 36% |
| kvk.HebusLeTroll 0.35 | 50 | 84% |
| jlm.javaDisturbance 0.59 | 40 | 85% |
| bigpete.Stewie 1.0 | 11 | 91% |
| gg.Squaraus 0.6 | 2 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 1050. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 52 | 51% | 84 |
| kvk.HebusLeTroll 0.35 | 23 | 23% | 54 |
| jlm.javaDisturbance 0.59 | 15 | 15% | 47 |
| bigpete.Stewie 1.0 | 5 | 5% | 15 |
| yk.JahRoslav 1.1 | 2 | 2% | 4 |
| tad.Dalek98 0.98 | 1 | 1% | 2 |
| pbg.NinjaX 1.2 | 1 | 1% | 1 |
| gg.Squaraus 0.6 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 165694 melee ticks, 53883 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 33 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 52745 sent, 47920 reached their opponent, 7608 virtual hits (15.9% of those reached).

## Melee bench: F23

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 748 over 6 battles (124.7 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 94.8 | 172 / 210 | 1.47 | 21.7% | 36618 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 21.7% | 172 |
| pe.SandboxLump 1.52 | 2.0 | 16.7% | 28 |
| cre.Karolos 0.32 | 3.0 | 13.8% | 7 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 9.8% | 1 |
| cw.megas.Blade 0.8 | 5.7 | 8.9% | 0 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.7 | 8.9% | 1 |
| stelo.RamTrackSurfer 1.2 | 6.3 | 8.5% | 1 |
| sample.Walls 1.0 | 8.0 | 7.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 2.7% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 93.7 | 29 / 35 | 5917 |
| 2 | 1 | 73.3 | 95.2 | 30 / 35 | 6396 |
| 3 | 1 | 73.1 | 95.6 | 27 / 35 | 6011 |
| 4 | 1 | 73.1 | 95.9 | 28 / 35 | 6098 |
| 5 | 1 | 74.0 | 98.4 | 32 / 35 | 6158 |
| 6 | 1 | 72.0 | 89.8 | 26 / 35 | 6038 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 109 | 87% |
| cre.Karolos 0.32 | 53 | 100% |
| stelo.RamTrackSurfer 1.2 | 9 | 100% |
| stelo.AreaTargetingBot 1.1 | 6 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 80% |
| cw.megas.Blade 0.8 | 3 | 100% |
| sample.Walls 1.0 | 2 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 764. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 22 | 50% | 109 |
| cre.Karolos 0.32 | 10 | 23% | 59 |
| stelo.RamTrackSurfer 1.2 | 4 | 9% | 14 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 5% | 8 |
| stelo.AreaTargetingBot 1.1 | 0 | 0% | 9 |
| cw.megas.Blade 0.8 | 0 | 0% | 5 |
| sample.Walls 1.0 | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 122621 melee ticks, 49591 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 45 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 45 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 38303 sent, 33632 reached their opponent, 9966 virtual hits (29.6% of those reached).

## Melee bench: F24

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 323 over 6 battles (53.8 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 82.3 | 78 / 210 | 2.59 | 16.7% | 23975 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 16.7% | 78 |
| rz.GlowBlowMelee 1.4 | 2.5 | 13.7% | 35 |
| florent.XSeries.X2 0.12 | 3.2 | 13.1% | 19 |
| davidalves.Phoenix 0.54 | 3.8 | 13.2% | 43 |
| pedersen.Ugluk 1.1.1 | 4.7 | 12.0% | 25 |
| oog.melee.Corsair 1.0 | 5.8 | 9.6% | 9 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 6.8% | 1 |
| lunchie.Lunchbox 0.93 | 8.2 | 5.9% | 0 |
| as.FrankTheTank 1.3 | 9.0 | 4.9% | 0 |
| evd.X1 0.01 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 84.1 | 14 / 35 | 4139 |
| 2 | 1 | 65.9 | 83.2 | 13 / 35 | 3994 |
| 3 | 1 | 66.0 | 83.8 | 12 / 35 | 4120 |
| 4 | 1 | 66.4 | 84.4 | 13 / 35 | 4043 |
| 5 | 1 | 63.3 | 76.2 | 12 / 35 | 3600 |
| 6 | 1 | 66.0 | 82.2 | 14 / 35 | 4079 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 40 | 50% |
| florent.XSeries.X2 0.12 | 30 | 67% |
| davidalves.Phoenix 0.54 | 29 | 48% |
| pedersen.Ugluk 1.1.1 | 23 | 57% |
| oog.melee.Corsair 1.0 | 8 | 63% |
| stelo.SoJNanoMelee 1.1 | 4 | 100% |
| evd.X1 0.01 | 1 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 33 | 24% | 55 |
| florent.XSeries.X2 0.12 | 30 | 22% | 48 |
| davidalves.Phoenix 0.54 | 30 | 22% | 44 |
| pedersen.Ugluk 1.1.1 | 28 | 21% | 31 |
| oog.melee.Corsair 1.0 | 8 | 6% | 19 |
| lunchie.Lunchbox 0.93 | 2 | 1% | 3 |
| stelo.SoJNanoMelee 1.1 | 1 | 1% | 6 |
| evd.X1 0.01 | 1 | 1% | 1 |
| as.FrankTheTank 1.3 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 140420 melee ticks, 40402 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 42 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 46986 sent, 41801 reached their opponent, 7640 virtual hits (18.3% of those reached).

## Melee bench: F25

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 496 over 6 battles (82.7 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 84.9 | 120 / 210 | 2.36 | 17.8% | 22896 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 17.8% | 120 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 14.0% | 28 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.9% | 15 |
| jdw.Hurricane 1.4 | 4.0 | 11.4% | 21 |
| ds.Oo 2.2 | 5.3 | 9.5% | 14 |
| gre.svman4.Morfeas 1.4.1 | 5.7 | 9.2% | 5 |
| awesomeness.Elite 1.0 | 7.0 | 7.8% | 3 |
| adt.Ar2 1.1 | 8.2 | 7.0% | 1 |
| gjr.Cephalosporin 0.1 | 8.8 | 6.1% | 3 |
| amk.ChumbaMini 0.2 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 87.3 | 22 / 35 | 3723 |
| 2 | 1 | 66.4 | 84.1 | 18 / 35 | 3725 |
| 3 | 1 | 68.0 | 87.3 | 22 / 35 | 3950 |
| 4 | 1 | 67.6 | 86.7 | 19 / 35 | 4078 |
| 5 | 1 | 67.1 | 85.1 | 18 / 35 | 3904 |
| 6 | 1 | 65.2 | 78.7 | 21 / 35 | 3516 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 57 | 75% |
| jdw.Hurricane 1.4 | 32 | 72% |
| voidious.micro.BlitzBat 1.05 | 31 | 90% |
| ds.Oo 2.2 | 16 | 75% |
| gre.svman4.Morfeas 1.4.1 | 7 | 57% |
| awesomeness.Elite 1.0 | 5 | 80% |
| adt.Ar2 1.1 | 4 | 100% |
| gjr.Cephalosporin 0.1 | 3 | 67% |

Hadur died in 94 of 210 rounds, at a mean tick of 672. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 22 | 23% | 53 |
| voidious.micro.BlitzBat 1.05 | 16 | 17% | 40 |
| jdw.Hurricane 1.4 | 15 | 16% | 34 |
| ds.Oo 2.2 | 10 | 11% | 27 |
| adt.Ar2 1.1 | 9 | 10% | 14 |
| gre.svman4.Morfeas 1.4.1 | 8 | 9% | 19 |
| awesomeness.Elite 1.0 | 5 | 5% | 12 |
| amk.ChumbaMini 0.2 | 3 | 3% | 4 |
| gjr.Cephalosporin 0.1 | 2 | 2% | 5 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 128640 melee ticks, 30446 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 32 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 45449 sent, 40655 reached their opponent, 6544 virtual hits (16.1% of those reached).

## Melee bench: F26

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 342 over 6 battles (57.0 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 93.0 | 143 / 210 | 1.63 | 20.9% | 37876 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 20.9% | 143 |
| ak.Fermat 2.0 | 2.0 | 15.0% | 38 |
| lrem.Spectre 0.4.4 | 3.2 | 12.4% | 10 |
| shu.nitro.LENIN .T34 | 4.2 | 11.5% | 11 |
| js.PinBall 1.6 | 5.0 | 10.5% | 4 |
| jaybot.adv.bots.JayBot 2.0 | 6.2 | 9.2% | 2 |
| gh.mini.GrubbmOne 1.0 | 6.5 | 8.2% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.8% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 94.0 | 24 / 35 | 6536 |
| 2 | 1 | 71.7 | 91.7 | 23 / 35 | 6584 |
| 3 | 1 | 72.4 | 94.9 | 27 / 35 | 6347 |
| 4 | 1 | 71.4 | 91.7 | 23 / 35 | 6144 |
| 5 | 1 | 71.4 | 92.4 | 24 / 35 | 6091 |
| 6 | 1 | 71.6 | 93.0 | 22 / 35 | 6174 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 62 | 68% |
| shu.nitro.LENIN .T34 | 51 | 86% |
| lrem.Spectre 0.4.4 | 44 | 86% |
| js.PinBall 1.6 | 15 | 80% |
| jaybot.adv.bots.JayBot 2.0 | 4 | 75% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |
| gh.mini.GrubbmOne 1.0 | 2 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 940. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 35 | 51% | 73 |
| lrem.Spectre 0.4.4 | 12 | 17% | 43 |
| shu.nitro.LENIN .T34 | 10 | 14% | 54 |
| js.PinBall 1.6 | 5 | 7% | 18 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 7% | 13 |
| fullsail.LaxativeTeaTwo 1.0 | 0 | 0% | 5 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 155573 melee ticks, 52871 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 56 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 51460 sent, 46596 reached their opponent, 11509 virtual hits (24.7% of those reached).

## Melee bench: F27

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 269 over 6 battles (44.8 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 94.9 | 175 / 210 | 1.46 | 21.2% | 33247 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 21.2% | 175 |
| mk.Alpha 0.2.1 | 2.0 | 13.4% | 22 |
| EH.Eagle 1.0.6 | 4.2 | 10.1% | 6 |
| techdude.kombat.FlamingKombat 1.5 | 5.2 | 9.5% | 1 |
| sheldor.melee.nano.TestMelee 0.1 | 5.3 | 9.4% | 2 |
| wee.Gem 1.8.4 | 6.0 | 8.7% | 3 |
| joe.ADinosaur 1.0 | 6.3 | 8.2% | 0 |
| throxbot.ThroxBot 0.1 | 7.5 | 7.3% | 0 |
| caimano.Furia_Ceca 0.22 | 8.3 | 7.0% | 0 |
| cs.Grudge 1.0 | 9.2 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 97.1 | 30 / 35 | 5822 |
| 2 | 1 | 71.6 | 96.5 | 30 / 35 | 5421 |
| 3 | 1 | 71.8 | 95.9 | 30 / 35 | 5907 |
| 4 | 1 | 71.5 | 93.7 | 28 / 35 | 5726 |
| 5 | 1 | 70.5 | 93.7 | 30 / 35 | 4843 |
| 6 | 1 | 70.7 | 92.7 | 27 / 35 | 5528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 90 | 87% |
| EH.Eagle 1.0.6 | 28 | 96% |
| techdude.kombat.FlamingKombat 1.5 | 19 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 93% |
| throxbot.ThroxBot 0.1 | 13 | 100% |
| joe.ADinosaur 1.0 | 11 | 100% |
| wee.Gem 1.8.4 | 10 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |

Hadur died in 36 of 210 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 15 | 42% | 87 |
| EH.Eagle 1.0.6 | 8 | 22% | 40 |
| joe.ADinosaur 1.0 | 4 | 11% | 13 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 6% | 21 |
| throxbot.ThroxBot 0.1 | 2 | 6% | 12 |
| sheldor.melee.nano.TestMelee 0.1 | 1 | 3% | 20 |
| wee.Gem 1.8.4 | 1 | 3% | 13 |
| caimano.Furia_Ceca 0.22 | 1 | 3% | 3 |
| cs.Grudge 1.0 | 1 | 3% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 130692 melee ticks, 42575 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 25 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 42930 sent, 38095 reached their opponent, 9615 virtual hits (25.2% of those reached).

## Melee bench: F28

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 231 over 6 battles (38.5 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 89.0 | 138 / 210 | 1.99 | 18.5% | 23927 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 18.5% | 138 |
| kid.test.NightFox .2 | 2.0 | 14.5% | 25 |
| uji.Antique 1.0 | 3.7 | 11.8% | 19 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 10.7% | 12 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.8% | 8 |
| amk.ChumbaWumba 0.3 | 6.2 | 8.4% | 3 |
| ahr.ice.Ice 1.0.2 | 6.7 | 8.1% | 3 |
| matt.advanced.Katana 1.0 | 8.7 | 6.2% | 2 |
| stelo.PianistNano 1.2 | 8.8 | 5.8% | 0 |
| stelo.Lifestealer 1.0 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 92.4 | 26 / 35 | 3794 |
| 2 | 1 | 68.0 | 87.6 | 23 / 35 | 4243 |
| 3 | 1 | 67.6 | 86.3 | 23 / 35 | 3996 |
| 4 | 1 | 68.2 | 88.3 | 23 / 35 | 4261 |
| 5 | 1 | 68.0 | 90.5 | 23 / 35 | 3868 |
| 6 | 1 | 67.3 | 88.9 | 20 / 35 | 3765 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 71 | 85% |
| uji.Antique 1.0 | 42 | 88% |
| qohnil.blot.BlotBot 3.61 | 14 | 71% |
| pfvicm.Sobieski 7.2.3b | 10 | 90% |
| amk.ChumbaWumba 0.3 | 8 | 100% |
| matt.advanced.Katana 1.0 | 6 | 100% |
| ahr.ice.Ice 1.0.2 | 6 | 83% |
| stelo.PianistNano 1.2 | 2 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 22 | 30% | 58 |
| uji.Antique 1.0 | 14 | 19% | 60 |
| pfvicm.Sobieski 7.2.3b | 13 | 18% | 22 |
| amk.ChumbaWumba 0.3 | 8 | 11% | 17 |
| qohnil.blot.BlotBot 3.61 | 7 | 9% | 20 |
| stelo.PianistNano 1.2 | 4 | 5% | 5 |
| ahr.ice.Ice 1.0.2 | 3 | 4% | 12 |
| matt.advanced.Katana 1.0 | 2 | 3% | 11 |
| stelo.Lifestealer 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 129691 melee ticks, 39217 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 87 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 87 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 44155 sent, 39141 reached their opponent, 5595 virtual hits (14.3% of those reached).

## Melee bench: F29

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 222 over 6 battles (37.0 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 87.5 | 105 / 210 | 2.13 | 18.8% | 27543 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 18.8% | 105 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 15.1% | 44 |
| deewiant.Anomaly 0.2 | 2.5 | 15.5% | 49 |
| myl.micro.Troodon 1.10 | 4.2 | 11.2% | 1 |
| jok.PheonixM 0.1.2 | 4.8 | 10.5% | 6 |
| ph.melee.ArcherME 0.3 | 6.2 | 8.4% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.0 | 6.2% | 0 |
| DBall.Anarchy 0.1 | 8.0 | 5.4% | 3 |
| ap.Frederick 1.1 | 9.0 | 4.7% | 1 |
| jangs.ns51 1.0 | 9.8 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 87.6 | 18 / 35 | 4774 |
| 2 | 1 | 69.3 | 89.2 | 16 / 35 | 4558 |
| 3 | 1 | 67.6 | 83.8 | 13 / 35 | 4269 |
| 4 | 1 | 69.5 | 87.3 | 20 / 35 | 4728 |
| 5 | 1 | 68.2 | 84.8 | 16 / 35 | 4417 |
| 6 | 1 | 70.6 | 92.1 | 22 / 35 | 4797 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 70 | 59% |
| zyx.mega.YersiniaPestis 3.1 | 46 | 61% |
| myl.micro.Troodon 1.10 | 16 | 100% |
| jok.PheonixM 0.1.2 | 13 | 85% |
| ph.melee.ArcherME 0.3 | 2 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| DBall.Anarchy 0.1 | 2 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 1024. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 47 | 44% | 86 |
| zyx.mega.YersiniaPestis 3.1 | 42 | 40% | 75 |
| jok.PheonixM 0.1.2 | 5 | 5% | 14 |
| myl.micro.Troodon 1.10 | 4 | 4% | 19 |
| ph.melee.ArcherME 0.3 | 4 | 4% | 9 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 3 |
| DBall.Anarchy 0.1 | 1 | 1% | 3 |
| ap.Frederick 1.1 | 1 | 1% | 0 |
| jangs.ns51 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 169471 melee ticks, 52745 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 46 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 54353 sent, 49570 reached their opponent, 7387 virtual hits (14.9% of those reached).

## Melee bench: F30

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 745 over 6 battles (124.2 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 77.6 | 48 / 210 | 3.01 | 15.4% | 23612 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.3 | 15.4% | 48 |
| darkcanuck.B26354 1.06 | 2.7 | 13.6% | 47 |
| catcat20.Matcha 0.006 | 2.8 | 13.8% | 55 |
| oog.melee.Capulet 1.2 | 4.0 | 12.3% | 23 |
| stelo.PastFuture 2.3.2 | 4.2 | 12.5% | 27 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.2% | 7 |
| tripphippy.Alice 1.1 | 7.7 | 7.2% | 3 |
| ntc.Opposite 1.5 | 7.8 | 7.0% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 8.5 | 6.5% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 79.4 | 7 / 35 | 4104 |
| 2 | 1 | 64.8 | 79.0 | 11 / 35 | 4088 |
| 3 | 1 | 64.6 | 79.7 | 9 / 35 | 3953 |
| 4 | 1 | 63.3 | 77.8 | 6 / 35 | 3895 |
| 5 | 1 | 64.8 | 81.6 | 9 / 35 | 4016 |
| 6 | 3 | 60.3 | 68.3 | 6 / 35 | 3556 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 33 | 30% |
| darkcanuck.B26354 1.06 | 28 | 29% |
| stelo.PastFuture 2.3.2 | 23 | 43% |
| oog.melee.Capulet 1.2 | 17 | 65% |
| intruder.PrairieWolf 2.61 | 6 | 83% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 100% |
| tripphippy.Alice 1.1 | 1 | 100% |

Hadur died in 168 of 210 rounds, at a mean tick of 889. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 46 | 27% | 52 |
| catcat20.Matcha 0.006 | 45 | 27% | 55 |
| stelo.PastFuture 2.3.2 | 31 | 18% | 41 |
| intruder.PrairieWolf 2.61 | 15 | 9% | 19 |
| oog.melee.Capulet 1.2 | 14 | 8% | 26 |
| tripphippy.Alice 1.1 | 4 | 2% | 7 |
| ntc.Opposite 1.5 | 4 | 2% | 4 |
| fowl3628800.LightningBolt 2.6.0 | 3 | 2% | 5 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 162115 melee ticks, 31356 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 63 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 2.

Targeting waves (207 rounds): 52086 sent, 47055 reached their opponent, 8095 virtual hits (17.2% of those reached).

## Melee bench: F31

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 494 over 6 battles (82.3 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 82.8 | 72 / 210 | 2.55 | 16.7% | 23196 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.3 | 17.4% | 77 |
| hadur117.Hadur 3.20aa | 1.7 | 16.7% | 72 |
| gh.mini.Griezel 0.2 | 3.0 | 13.5% | 48 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.4% | 5 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 10.9% | 6 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.7% | 1 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.7% | 1 |
| fm.mammillarias 1.3 | 8.3 | 5.2% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 4.8% | 1 |
| tlp.ThreeLeggedPig 1 | 9.3 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 80.0 | 12 / 35 | 3671 |
| 2 | 2 | 64.1 | 78.7 | 7 / 35 | 3782 |
| 3 | 1 | 66.7 | 85.4 | 13 / 35 | 3954 |
| 4 | 2 | 64.3 | 77.8 | 10 / 35 | 3719 |
| 5 | 2 | 68.4 | 89.5 | 16 / 35 | 4144 |
| 6 | 1 | 66.8 | 85.1 | 14 / 35 | 3926 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 59 | 42% |
| gh.mini.Griezel 0.2 | 40 | 58% |
| spinnercat.micro.Tyger 0.1 | 15 | 73% |
| d414.nano.Quantum 1.0.0 | 7 | 100% |
| gh.nano.Grofvuil 0.2 | 5 | 80% |
| Gecko.ultimateGeckoBot 1.0 | 2 | 50% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 889. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 64 | 45% | 93 |
| gh.mini.Griezel 0.2 | 32 | 22% | 53 |
| d414.nano.Quantum 1.0.0 | 19 | 13% | 26 |
| spinnercat.micro.Tyger 0.1 | 12 | 8% | 20 |
| gh.nano.Grofvuil 0.2 | 5 | 3% | 11 |
| timmit.nano.TimDog 0.33 | 3 | 2% | 3 |
| fm.mammillarias 1.3 | 2 | 1% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 161335 melee ticks, 39046 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 33 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 51492 sent, 46401 reached their opponent, 7390 virtual hits (15.9% of those reached).

## Melee bench: F32

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 136 over 6 battles (22.7 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 92.3 | 141 / 210 | 1.70 | 19.5% | 29378 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 19.5% | 141 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.4% | 35 |
| apc.botM 3.0 | 3.0 | 12.2% | 19 |
| vjik.UnViolation 1.1 | 4.8 | 9.4% | 6 |
| lxx.ConceptA 0.8 | 5.2 | 9.7% | 3 |
| bayen.UbaMicro 1.4 | 6.0 | 8.7% | 0 |
| panzer.Panzer 0.2 | 6.8 | 7.9% | 0 |
| yk.JahMicro 1.0 | 7.5 | 7.1% | 5 |
| conscience.Electron 1.3g | 8.8 | 6.4% | 0 |
| donjezza.Jezza 1.0 | 9.8 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 94.0 | 26 / 35 | 5002 |
| 2 | 1 | 68.0 | 88.6 | 21 / 35 | 4831 |
| 3 | 1 | 68.9 | 90.5 | 24 / 35 | 4658 |
| 4 | 1 | 70.7 | 95.9 | 27 / 35 | 5289 |
| 5 | 1 | 68.4 | 90.5 | 20 / 35 | 4703 |
| 6 | 1 | 69.5 | 94.3 | 23 / 35 | 4895 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 86 | 72% |
| apc.botM 3.0 | 41 | 76% |
| vjik.UnViolation 1.1 | 17 | 88% |
| yk.JahMicro 1.0 | 12 | 67% |
| lxx.ConceptA 0.8 | 11 | 73% |
| bayen.UbaMicro 1.4 | 7 | 100% |
| panzer.Panzer 0.2 | 5 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 31 | 44% | 91 |
| apc.botM 3.0 | 13 | 18% | 42 |
| lxx.ConceptA 0.8 | 7 | 10% | 14 |
| bayen.UbaMicro 1.4 | 6 | 8% | 12 |
| vjik.UnViolation 1.1 | 4 | 6% | 26 |
| yk.JahMicro 1.0 | 4 | 6% | 8 |
| panzer.Panzer 0.2 | 3 | 4% | 9 |
| conscience.Electron 1.3g | 3 | 4% | 6 |
| donjezza.Jezza 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 201 rounds): 124507 melee ticks, 54997 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 56 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 42167 sent, 37383 reached their opponent, 6855 virtual hits (18.3% of those reached).

## Melee bench: F33

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 415 over 6 battles (69.2 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 87.5 | 121 / 210 | 2.13 | 19.0% | 28925 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 19.0% | 121 |
| maribo.Quester 0.3 | 2.0 | 15.7% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.8% | 23 |
| gre.svman4.Leonidas 1.3.2 | 4.0 | 11.9% | 14 |
| labg.Cataclysm 2.05 | 5.0 | 10.4% | 12 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.3 | 8.2% | 5 |
| baal.nano.N 1.42 | 6.5 | 8.8% | 0 |
| zyx.micro.Ant 1.1 | 8.3 | 5.5% | 0 |
| sanja.First 0.1 | 8.7 | 4.9% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 87.0 | 18 / 35 | 5139 |
| 2 | 1 | 68.2 | 85.7 | 19 / 35 | 4331 |
| 3 | 1 | 69.4 | 85.1 | 19 / 35 | 5135 |
| 4 | 1 | 69.7 | 89.2 | 22 / 35 | 4881 |
| 5 | 1 | 70.0 | 90.2 | 26 / 35 | 4599 |
| 6 | 1 | 68.9 | 87.6 | 17 / 35 | 4840 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 67 | 81% |
| gre.svman4.Leonidas 1.3.2 | 37 | 86% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 33 | 70% |
| labg.Cataclysm 2.05 | 9 | 56% |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 50% |
| baal.nano.N 1.42 | 3 | 100% |
| sanja.First 0.1 | 1 | 0% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 976. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 31 | 33% | 82 |
| gre.svman4.Leonidas 1.3.2 | 19 | 20% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 17% | 40 |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 11% | 13 |
| labg.Cataclysm 2.05 | 7 | 8% | 20 |
| baal.nano.N 1.42 | 3 | 3% | 11 |
| zyx.micro.Ant 1.1 | 3 | 3% | 4 |
| sanja.First 0.1 | 1 | 1% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 170385 melee ticks, 53278 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 57 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 54934 sent, 50016 reached their opponent, 7246 virtual hits (14.5% of those reached).

## Melee bench: F34

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 528 over 6 battles (88.0 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 89.2 | 99 / 210 | 1.97 | 18.8% | 30918 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.2 | 18.8% | 99 |
| kid.Gladiator .7.2 | 2.2 | 16.5% | 46 |
| stelo.Spread 0.9 | 2.7 | 16.2% | 56 |
| tcf.Reach 3 | 4.8 | 10.4% | 3 |
| jcs.Seth 1.8 | 4.8 | 10.5% | 6 |
| cli.Dancer 1.1 | 5.3 | 9.8% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.1% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.3% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.0 | 83.5 | 14 / 35 | 4842 |
| 2 | 1 | 70.6 | 91.1 | 18 / 35 | 5403 |
| 3 | 1 | 70.3 | 90.8 | 18 / 35 | 5332 |
| 4 | 1 | 70.2 | 90.2 | 19 / 35 | 5139 |
| 5 | 1 | 69.2 | 90.2 | 16 / 35 | 5033 |
| 6 | 1 | 69.2 | 89.5 | 14 / 35 | 5169 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 71 | 59% |
| stelo.Spread 0.9 | 66 | 50% |
| jcs.Seth 1.8 | 16 | 75% |
| cli.Dancer 1.1 | 6 | 100% |
| tcf.Reach 3 | 6 | 67% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 1122. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 51 | 44% | 87 |
| kid.Gladiator .7.2 | 42 | 37% | 72 |
| jcs.Seth 1.8 | 9 | 8% | 26 |
| tcf.Reach 3 | 6 | 5% | 13 |
| ratosh.Wesco 1.4 | 2 | 2% | 4 |
| cli.Dancer 1.1 | 1 | 1% | 7 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 174861 melee ticks, 61489 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 54 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 53761 sent, 48853 reached their opponent, 8294 virtual hits (17.0% of those reached).

## Melee bench: F35

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 183 over 6 battles (30.5 per battle, most in one battle 113). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 83.3 | 47 / 210 | 2.50 | 16.2% | 22577 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.2 | 18.8% | 125 |
| hadur117.Hadur 3.20aa | 1.8 | 16.2% | 47 |
| gh.mini.Gruwel 0.9 | 3.3 | 13.2% | 26 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.2 | 11.6% | 9 |
| rz.HawkOnFire 0.1 | 4.5 | 11.6% | 2 |
| wit.Chuliath 1.0 | 6.5 | 6.9% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.0 | 6.5% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.8 | 5.6% | 0 |
| dans.Cinnamon 1.2 | 8.8 | 5.1% | 0 |
| stelo.MyAgileRobot 0.2 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 85.1 | 14 / 35 | 3865 |
| 2 | 2 | 64.8 | 83.2 | 5 / 35 | 3730 |
| 3 | 2 | 65.5 | 83.5 | 6 / 35 | 4051 |
| 4 | 2 | 66.2 | 83.8 | 13 / 35 | 3797 |
| 5 | 2 | 64.3 | 81.6 | 2 / 35 | 3613 |
| 6 | 2 | 64.8 | 82.9 | 7 / 35 | 3521 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 87 | 24% |
| gh.mini.Gruwel 0.9 | 26 | 35% |
| dmh.robocode.robot.BlackDeath 9.2 | 15 | 67% |
| rz.HawkOnFire 0.1 | 6 | 83% |
| wit.Chuliath 1.0 | 3 | 67% |

Hadur died in 164 of 210 rounds, at a mean tick of 948. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 87 | 53% | 110 |
| gh.mini.Gruwel 0.9 | 35 | 21% | 43 |
| dmh.robocode.robot.BlackDeath 9.2 | 17 | 10% | 23 |
| rz.HawkOnFire 0.1 | 14 | 9% | 20 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6 | 4% | 6 |
| wit.Chuliath 1.0 | 3 | 2% | 7 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 148227 melee ticks, 48307 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 25 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 45581 sent, 40610 reached their opponent, 6261 virtual hits (15.4% of those reached).

## Melee bench: F36

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 463 over 6 battles (77.2 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 95.0 | 168 / 210 | 1.45 | 21.4% | 33260 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 21.4% | 168 |
| alpha.RainingFire 1.0 | 2.3 | 12.5% | 12 |
| bzdp.Pansy 2.1 | 2.7 | 12.2% | 13 |
| mz.Cork 0.1 | 5.0 | 10.5% | 7 |
| m3thos.Eva02 0.7.1 | 5.2 | 10.0% | 6 |
| bvh.micro.Freya 0.3 | 5.3 | 10.2% | 4 |
| bvh.mini.Fenrir 0.39 | 6.5 | 8.9% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 5.5% | 0 |
| dl.BetterWalls 1.0 | 9.2 | 4.7% | 0 |
| sample.MyFirstRobot 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 94.0 | 26 / 35 | 5501 |
| 2 | 1 | 72.0 | 96.2 | 29 / 35 | 5435 |
| 3 | 1 | 71.4 | 92.7 | 26 / 35 | 5550 |
| 4 | 1 | 71.6 | 94.0 | 28 / 35 | 5716 |
| 5 | 1 | 72.5 | 97.1 | 31 / 35 | 5638 |
| 6 | 1 | 71.7 | 96.2 | 28 / 35 | 5420 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 52 | 87% |
| alpha.RainingFire 1.0 | 39 | 82% |
| bvh.micro.Freya 0.3 | 33 | 100% |
| mz.Cork 0.1 | 24 | 88% |
| m3thos.Eva02 0.7.1 | 16 | 100% |
| bvh.mini.Fenrir 0.39 | 14 | 100% |
| sample.MyFirstRobot 1.0 | 6 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 927. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 13 | 29% | 42 |
| bzdp.Pansy 2.1 | 10 | 22% | 51 |
| mz.Cork 0.1 | 6 | 13% | 38 |
| m3thos.Eva02 0.7.1 | 5 | 11% | 25 |
| bvh.mini.Fenrir 0.39 | 5 | 11% | 20 |
| bvh.micro.Freya 0.3 | 3 | 7% | 23 |
| dl.BetterWalls 1.0 | 0 | 0% | 9 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 1 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 147838 melee ticks, 48302 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 56 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 50692 sent, 45876 reached their opponent, 9325 virtual hits (20.3% of those reached).

## Melee bench: F37

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 364 over 6 battles (60.7 per battle, most in one battle 148). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.5 | 159 / 210 | 2.04 | 19.4% | 34007 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 19.4% | 159 |
| germ.TheMind .2 | 2.7 | 10.6% | 10 |
| EBBU.Sim2 1.02 | 4.2 | 10.1% | 4 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.2 | 10.2% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 5.7 | 8.9% | 1 |
| agrach.Dalek 1.0 | 6.3 | 8.8% | 9 |
| lmk.ACPFinal 0.1 | 6.5 | 8.7% | 8 |
| mb.Beast 0.1 | 7.0 | 8.4% | 5 |
| stelo.UntouchableNano 1.3 | 7.7 | 8.2% | 5 |
| skm.Ryubot 1.0 | 9.8 | 6.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 85.1 | 26 / 35 | 5595 |
| 2 | 1 | 69.0 | 92.4 | 27 / 35 | 5480 |
| 3 | 1 | 69.5 | 91.1 | 28 / 35 | 5935 |
| 4 | 1 | 68.5 | 87.3 | 24 / 35 | 5934 |
| 5 | 1 | 69.2 | 90.2 | 29 / 35 | 5605 |
| 6 | 1 | 67.7 | 84.8 | 25 / 35 | 5458 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 28 | 96% |
| com.syncleus.robocode.Dreadnaught 0.1 | 24 | 92% |
| mb.Beast 0.1 | 24 | 96% |
| EBBU.Sim2 1.02 | 23 | 100% |
| agrach.Dalek 1.0 | 23 | 91% |
| lmk.ACPFinal 0.1 | 18 | 94% |
| stelo.UntouchableNano 1.3 | 14 | 86% |
| skm.Ryubot 1.0 | 10 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 4 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 434. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 15 | 28% | 22 |
| com.syncleus.robocode.Dreadnaught 0.1 | 11 | 21% | 34 |
| stelo.UntouchableNano 1.3 | 8 | 15% | 20 |
| mb.Beast 0.1 | 6 | 11% | 23 |
| agrach.Dalek 1.0 | 4 | 8% | 34 |
| EBBU.Sim2 1.02 | 3 | 6% | 28 |
| lmk.ACPFinal 0.1 | 3 | 6% | 19 |
| germ.TheMind .2 | 1 | 2% | 25 |
| skm.Ryubot 1.0 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 95556 melee ticks, 26738 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 40 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 3.

Targeting waves (205 rounds): 32394 sent, 27892 reached their opponent, 8166 virtual hits (29.3% of those reached).

## Melee bench: F38

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 346 over 6 battles (57.7 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 90.0 | 121 / 210 | 1.90 | 18.9% | 28419 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 18.9% | 121 |
| justin.Mallais 14.0 | 2.2 | 15.2% | 54 |
| bvh.mini.Freya 0.55 | 3.2 | 12.8% | 10 |
| bts.mega.Gnarly 1.4 | 4.2 | 11.0% | 11 |
| cs.Wren 1.0 | 4.8 | 10.5% | 4 |
| kdf.KoulDestroyer 1.0 | 5.8 | 9.3% | 5 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.8 | 8.1% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.0% | 0 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.3% | 1 |
| bzdp.BoxCar 2.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 86.7 | 16 / 35 | 4963 |
| 2 | 1 | 68.8 | 89.5 | 21 / 35 | 4760 |
| 3 | 1 | 69.0 | 90.5 | 17 / 35 | 4808 |
| 4 | 1 | 68.8 | 89.8 | 24 / 35 | 4456 |
| 5 | 1 | 69.9 | 92.7 | 20 / 35 | 4860 |
| 6 | 1 | 69.2 | 90.8 | 23 / 35 | 4572 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 68 | 60% |
| bvh.mini.Freya 0.55 | 30 | 77% |
| bts.mega.Gnarly 1.4 | 21 | 81% |
| cs.Wren 1.0 | 19 | 100% |
| kdf.KoulDestroyer 1.0 | 11 | 100% |
| davidalves.net.DuelistNanoMelee 1.01 | 5 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 100% |
| matt.UnderDark3 2.4.34 | 2 | 50% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 42 | 46% | 85 |
| bvh.mini.Freya 0.55 | 21 | 23% | 35 |
| bts.mega.Gnarly 1.4 | 10 | 11% | 31 |
| kdf.KoulDestroyer 1.0 | 6 | 7% | 11 |
| cs.Wren 1.0 | 5 | 5% | 24 |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 4% | 10 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 0 | 0% | 9 |
| bzdp.BoxCar 2.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 141631 melee ticks, 39802 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 55 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 45939 sent, 40907 reached their opponent, 8826 virtual hits (21.6% of those reached).

## Melee bench: F39

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 511 over 6 battles (85.2 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 87.3 | 103 / 210 | 2.14 | 18.5% | 30071 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 18.5% | 103 |
| bvh.fry.Freya 0.82 | 2.2 | 14.8% | 13 |
| az.Ololobot 0.2.4 | 2.8 | 13.2% | 59 |
| catcat20.Lambda 0.024 | 4.0 | 11.5% | 29 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 8.9% | 3 |
| gimp.GimpBot 0.1 | 6.2 | 8.0% | 1 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 7.4% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 8.0 | 6.9% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 6.0% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 83.5 | 13 / 35 | 4290 |
| 2 | 1 | 67.2 | 85.4 | 16 / 35 | 5015 |
| 3 | 1 | 68.3 | 87.3 | 16 / 35 | 5356 |
| 4 | 1 | 69.1 | 90.5 | 20 / 35 | 5289 |
| 5 | 1 | 68.7 | 86.7 | 19 / 35 | 5232 |
| 6 | 1 | 68.7 | 90.5 | 19 / 35 | 4889 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 59 | 37% |
| bvh.fry.Freya 0.82 | 59 | 90% |
| catcat20.Lambda 0.024 | 31 | 61% |
| winamp32.micro.MicroMacro 1.0 | 5 | 40% |
| stelo.SoRobotNanoMelee 1.2 | 3 | 100% |
| gimp.GimpBot 0.1 | 3 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 1124. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 44 | 40% | 75 |
| bvh.fry.Freya 0.82 | 27 | 24% | 65 |
| catcat20.Lambda 0.024 | 21 | 19% | 37 |
| winamp32.micro.MicroMacro 1.0 | 5 | 5% | 13 |
| apollokidd.ApolloKidd 0.9 | 3 | 3% | 3 |
| gimp.GimpBot 0.1 | 2 | 2% | 6 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 2% | 3 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 2% | 3 |
| stelo.SoRobotNanoMelee 1.2 | 1 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 167656 melee ticks, 60818 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 55 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 2.

Targeting waves (207 rounds): 52754 sent, 47747 reached their opponent, 8137 virtual hits (17.0% of those reached).

## Melee bench: F40

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 393 over 6 battles (65.5 per battle, most in one battle 117). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 89.5 | 130 / 210 | 1.94 | 19.6% | 30558 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 19.6% | 130 |
| kawigi.mini.Coriantumr 1.1 | 2.2 | 14.1% | 26 |
| kano.gamma.KanoGamma 1.8 | 3.3 | 12.5% | 22 |
| mz.AntiGrav 1.0 | 4.0 | 11.6% | 9 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.3% | 7 |
| stelo.Randomness 1.0 | 6.2 | 9.2% | 8 |
| alpha.BlackIce 1.0 | 6.3 | 9.3% | 6 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.3% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 4.0% | 1 |
| sample.Corners 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 90.8 | 22 / 35 | 4751 |
| 2 | 1 | 71.7 | 94.3 | 26 / 35 | 5428 |
| 3 | 1 | 70.7 | 91.1 | 23 / 35 | 5444 |
| 4 | 1 | 69.8 | 88.9 | 23 / 35 | 5042 |
| 5 | 1 | 67.4 | 80.6 | 16 / 35 | 4849 |
| 6 | 1 | 69.9 | 91.4 | 20 / 35 | 5044 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 64 | 77% |
| kano.gamma.KanoGamma 1.8 | 35 | 80% |
| mz.AntiGrav 1.0 | 27 | 93% |
| stelo.Randomness 1.0 | 13 | 69% |
| Polkwane.SmashMelee 1.0 | 12 | 83% |
| alpha.BlackIce 1.0 | 5 | 100% |
| amk.superstrike.SuperStrike 0.3 | 3 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 853. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 34 | 41% | 74 |
| kano.gamma.KanoGamma 1.8 | 16 | 19% | 51 |
| stelo.Randomness 1.0 | 12 | 14% | 23 |
| mz.AntiGrav 1.0 | 6 | 7% | 28 |
| Polkwane.SmashMelee 1.0 | 5 | 6% | 12 |
| alpha.BlackIce 1.0 | 4 | 5% | 12 |
| amk.superstrike.SuperStrike 0.3 | 2 | 2% | 7 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 153980 melee ticks, 41599 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 74 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 74 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 50205 sent, 45133 reached their opponent, 9309 virtual hits (20.6% of those reached).

## Melee bench: F41

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 612 over 6 battles (102.0 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.8 | 118 / 210 | 2.00 | 18.6% | 27081 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 18.6% | 118 |
| eem.EvBotNG v12.8 | 2.0 | 15.4% | 56 |
| ary.Swarm 1.1 | 3.2 | 13.1% | 8 |
| lessonz.robocode.Oz 0.5.0 | 4.0 | 12.6% | 15 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 10.8% | 12 |
| shrub.Silver v048 | 6.0 | 8.7% | 0 |
| zyx.nano.Ant 1.1 | 7.0 | 7.8% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 5.4% | 2 |
| stelo.Mirror 1.1 | 8.7 | 5.4% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 88.3 | 18 / 35 | 4595 |
| 2 | 1 | 69.0 | 88.3 | 20 / 35 | 4735 |
| 3 | 1 | 69.1 | 87.9 | 22 / 35 | 4438 |
| 4 | 1 | 69.2 | 92.1 | 22 / 35 | 4209 |
| 5 | 1 | 69.3 | 88.6 | 19 / 35 | 4736 |
| 6 | 1 | 68.4 | 87.9 | 17 / 35 | 4368 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 81 | 53% |
| lessonz.robocode.Oz 0.5.0 | 32 | 84% |
| ary.Swarm 1.1 | 28 | 96% |
| simonton.nano.MeleeSeed 1.8 | 14 | 100% |
| shrub.Silver v048 | 4 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 985. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 48 | 49% | 90 |
| ary.Swarm 1.1 | 18 | 18% | 44 |
| lessonz.robocode.Oz 0.5.0 | 13 | 13% | 35 |
| simonton.nano.MeleeSeed 1.8 | 7 | 7% | 28 |
| shrub.Silver v048 | 4 | 4% | 8 |
| stelo.Mirror 1.1 | 1 | 1% | 2 |
| zyx.nano.Ant 1.1 | 1 | 1% | 1 |
| jsal.Jsalbot 1.0 | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 154954 melee ticks, 54720 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 65 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 50947 sent, 45979 reached their opponent, 6988 virtual hits (15.2% of those reached).

## Melee bench: F42

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 320 over 6 battles (53.3 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 91.5 | 138 / 210 | 1.77 | 20.3% | 35078 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 20.3% | 138 |
| wompi.Wallaby 5.1 | 2.0 | 15.6% | 32 |
| ara.Shera 0.88 | 3.3 | 12.9% | 27 |
| maribo.mini.MiniQuester 0.1 | 3.7 | 12.6% | 10 |
| amz.NanoClone 1.41 | 5.0 | 9.2% | 1 |
| maribo.IotaCT 1.1 | 6.8 | 6.8% | 0 |
| dsw.StaticD 1.0 | 6.8 | 7.0% | 3 |
| stelo.MirrorMicro 1.0 | 8.0 | 5.8% | 0 |
| mme.NikeEnhanced 2.0 | 8.7 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 92.4 | 24 / 35 | 5838 |
| 2 | 1 | 70.6 | 94.0 | 21 / 35 | 5766 |
| 3 | 1 | 70.0 | 89.2 | 21 / 35 | 5609 |
| 4 | 1 | 69.9 | 89.2 | 19 / 35 | 5766 |
| 5 | 1 | 70.5 | 88.6 | 24 / 35 | 6014 |
| 6 | 1 | 72.0 | 95.6 | 29 / 35 | 6085 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 103 | 86% |
| maribo.mini.MiniQuester 0.1 | 33 | 85% |
| ara.Shera 0.88 | 30 | 60% |
| dsw.StaticD 1.0 | 2 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 996. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 30 | 39% | 56 |
| wompi.Wallaby 5.1 | 27 | 35% | 104 |
| maribo.mini.MiniQuester 0.1 | 14 | 18% | 45 |
| stelo.MirrorMicro 1.0 | 2 | 3% | 2 |
| maribo.IotaCT 1.1 | 1 | 1% | 0 |
| dsw.StaticD 1.0 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 168265 melee ticks, 51790 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 33 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 51650 sent, 46970 reached their opponent, 9268 virtual hits (19.7% of those reached).

## Melee bench: F43

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 183 over 6 battles (30.5 per battle, most in one battle 110). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 82.9 | 54 / 210 | 2.54 | 16.5% | 24600 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 19.6% | 119 |
| hadur117.Hadur 3.20aa | 2.0 | 16.5% | 54 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.9% | 27 |
| wcsv.melee.EngineerMelee 0.1 | 4.5 | 10.7% | 3 |
| dummy.micro.Sparrow 2.5 | 4.5 | 11.1% | 4 |
| Krabb.akim2.Akim2 1.1b | 5.7 | 9.8% | 4 |
| mz.NanoGod 2.02 | 7.2 | 7.8% | 1 |
| jab.DiamondStealer 5 | 7.8 | 7.4% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.8% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 82.5 | 7 / 35 | 3946 |
| 2 | 2 | 66.1 | 83.8 | 6 / 35 | 3746 |
| 3 | 2 | 67.1 | 83.5 | 11 / 35 | 4153 |
| 4 | 2 | 67.4 | 85.1 | 8 / 35 | 4280 |
| 5 | 2 | 66.1 | 79.7 | 9 / 35 | 4172 |
| 6 | 2 | 67.4 | 82.5 | 13 / 35 | 4303 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 83 | 30% |
| brainfade.melee.Dusk 0.44 | 25 | 48% |
| dummy.micro.Sparrow 2.5 | 10 | 70% |
| Krabb.akim2.Akim2 1.1b | 5 | 80% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 100% |
| mz.NanoGod 2.02 | 2 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 1001. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 92 | 58% | 119 |
| brainfade.melee.Dusk 0.44 | 31 | 19% | 41 |
| dummy.micro.Sparrow 2.5 | 13 | 8% | 19 |
| wcsv.melee.EngineerMelee 0.1 | 13 | 8% | 17 |
| Krabb.akim2.Akim2 1.1b | 4 | 3% | 9 |
| mz.NanoGod 2.02 | 4 | 3% | 5 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 158933 melee ticks, 53722 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 38 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 50443 sent, 45342 reached their opponent, 7400 virtual hits (16.3% of those reached).

## Melee bench: F44

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 539 over 6 battles (89.8 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 92.2 | 149 / 210 | 1.70 | 20.7% | 34223 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 20.7% | 149 |
| stelo.Liblix 0.3.1 | 2.3 | 15.1% | 46 |
| tzu.TheArtOfWar 1.2 | 2.7 | 14.0% | 10 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.2 | 9.6% | 0 |
| jwirde.Gort 2.0 | 4.8 | 9.1% | 2 |
| disan.Chair 2.2.0 | 6.3 | 7.8% | 1 |
| wompi.Quokka 1.6 | 7.0 | 7.4% | 0 |
| stf.PanzerGeneral 0.1 | 8.0 | 6.5% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 5.1% | 1 |
| sample.Crazy 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 92.1 | 24 / 35 | 5562 |
| 2 | 1 | 71.9 | 94.6 | 28 / 35 | 6025 |
| 3 | 1 | 70.9 | 91.7 | 24 / 35 | 5883 |
| 4 | 1 | 71.1 | 92.7 | 27 / 35 | 5464 |
| 5 | 1 | 70.0 | 88.3 | 21 / 35 | 5594 |
| 6 | 1 | 71.6 | 93.7 | 25 / 35 | 5695 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 77 | 68% |
| tzu.TheArtOfWar 1.2 | 65 | 95% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 11 | 100% |
| disan.Chair 2.2.0 | 9 | 100% |
| jwirde.Gort 2.0 | 7 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| wompi.Quokka 1.6 | 3 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 908. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 36 | 55% | 94 |
| tzu.TheArtOfWar 1.2 | 10 | 15% | 58 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 9% | 15 |
| jwirde.Gort 2.0 | 4 | 6% | 18 |
| disan.Chair 2.2.0 | 1 | 2% | 8 |
| stf.PanzerGeneral 0.1 | 1 | 2% | 5 |
| amk.jointstrike.JointStrike 0.2 | 1 | 2% | 5 |
| wompi.Quokka 1.6 | 1 | 2% | 4 |
| sample.Crazy 1.0 | 1 | 2% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 151440 melee ticks, 48288 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 49 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 52579 sent, 47775 reached their opponent, 10188 virtual hits (21.3% of those reached).

## Melee bench: F45

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 552 over 6 battles (92.0 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 89.9 | 118 / 210 | 1.91 | 20.2% | 33995 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 20.2% | 118 |
| jje.BagPuss 1.2 | 2.2 | 12.3% | 12 |
| eem.IWillFireNoBullet v2.8 | 3.5 | 11.7% | 61 |
| myl.nano.Graviton 1.10 | 3.8 | 11.0% | 3 |
| sul.Lunar 1.1 | 4.7 | 10.5% | 11 |
| fm.claire 1.7 | 6.8 | 8.4% | 0 |
| hvilela.HVilela 0.9 | 7.0 | 8.3% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 8.1% | 1 |
| wit.Deep7 2.0 | 9.2 | 5.3% | 3 |
| abud.ThirdRobo 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 87.3 | 18 / 35 | 5034 |
| 2 | 1 | 71.9 | 94.6 | 25 / 35 | 6066 |
| 3 | 1 | 69.2 | 87.6 | 16 / 35 | 5406 |
| 4 | 1 | 71.9 | 93.3 | 22 / 35 | 6423 |
| 5 | 1 | 68.9 | 84.8 | 19 / 35 | 5540 |
| 6 | 1 | 70.3 | 91.7 | 18 / 35 | 5526 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 82 | 56% |
| sul.Lunar 1.1 | 26 | 88% |
| jje.BagPuss 1.2 | 25 | 68% |
| myl.nano.Graviton 1.10 | 14 | 93% |
| pez.mini.ChironexFleckeri 0.5 | 7 | 100% |
| wit.Deep7 2.0 | 6 | 100% |
| hvilela.HVilela 0.9 | 5 | 80% |
| fm.claire 1.7 | 2 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 1553. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 36 | 37% | 0 |
| jje.BagPuss 1.2 | 21 | 22% | 71 |
| sul.Lunar 1.1 | 15 | 15% | 51 |
| myl.nano.Graviton 1.10 | 7 | 7% | 39 |
| fm.claire 1.7 | 7 | 7% | 15 |
| pez.mini.ChironexFleckeri 0.5 | 6 | 6% | 19 |
| hvilela.HVilela 0.9 | 1 | 1% | 10 |
| abud.ThirdRobo 1.0 | 0 | 0% | 1 |
| wit.Deep7 2.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 197615 melee ticks, 98776 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 55 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 60864 sent, 56030 reached their opponent, 8436 virtual hits (15.1% of those reached).

## Melee bench: F46

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 739 over 6 battles (123.2 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 83.4 | 65 / 210 | 2.50 | 16.6% | 25108 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.7 | 16.7% | 55 |
| rsalesc.melee.Medina 0.4.5 | 2.0 | 16.8% | 79 |
| hadur117.Hadur 3.20aa | 2.3 | 16.6% | 65 |
| mz.MicroSheep 1.0 | 4.5 | 10.2% | 1 |
| cx.Princess 1.0 | 4.8 | 9.7% | 9 |
| sadoner.killer 0.2 | 6.0 | 9.0% | 1 |
| arthord.NanoSatanMelee Beta | 6.7 | 7.7% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.2 | 5.6% | 1 |
| kurios.DOSexe .9a | 8.8 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.9 | 83.8 | 9 / 35 | 3996 |
| 2 | 3 | 65.2 | 81.0 | 11 / 35 | 3950 |
| 3 | 2 | 66.1 | 82.9 | 11 / 35 | 4356 |
| 4 | 3 | 65.6 | 81.6 | 11 / 35 | 4242 |
| 5 | 1 | 68.0 | 88.9 | 16 / 35 | 4313 |
| 6 | 2 | 65.7 | 82.2 | 7 / 35 | 4251 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 61 | 62% |
| rsalesc.melee.Medina 0.4.5 | 49 | 24% |
| mz.MicroSheep 1.0 | 9 | 100% |
| cx.Princess 1.0 | 9 | 56% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 970. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 58 | 38% | 72 |
| kc.mini.Mirage 0.2 | 52 | 34% | 87 |
| cx.Princess 1.0 | 14 | 9% | 16 |
| sadoner.killer 0.2 | 9 | 6% | 13 |
| arthord.NanoSatanMelee Beta | 5 | 3% | 6 |
| mz.MicroSheep 1.0 | 3 | 2% | 12 |
| jeremyreeder.collective.Prophet 5 | 2 | 1% | 2 |
| kurios.DOSexe .9a | 2 | 1% | 2 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 156817 melee ticks, 46953 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 56 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 45465 sent, 40472 reached their opponent, 6133 virtual hits (15.2% of those reached).

