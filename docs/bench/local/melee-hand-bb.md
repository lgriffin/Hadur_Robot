# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 339 over 6 battles (56.5 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 87.1 | 44 / 210 | 2.16 | 17.8% | 33163 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.9% | 150 |
| hadur117.Hadur 3.20bb | 2.0 | 17.8% | 44 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.7 | 11.2% | 1 |
| sgp.JollyNinja 3.53 | 3.7 | 11.1% | 12 |
| mz.MicroGodMelee 1 | 5.2 | 9.9% | 0 |
| lorneswork.Predator 1.0 | 5.5 | 9.9% | 3 |
| adt.Ar2 1.0 | 7.0 | 7.5% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.4% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.9 | 87.0 | 10 / 35 | 5182 |
| 2 | 2 | 67.6 | 87.0 | 6 / 35 | 5228 |
| 3 | 2 | 68.5 | 88.6 | 6 / 35 | 5820 |
| 4 | 2 | 69.5 | 87.3 | 11 / 35 | 6131 |
| 5 | 2 | 67.6 | 87.3 | 7 / 35 | 5208 |
| 6 | 2 | 67.3 | 85.7 | 4 / 35 | 5594 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 129 | 7% |
| sgp.JollyNinja 3.53 | 14 | 64% |
| mz.MicroGodMelee 1 | 11 | 100% |
| lorneswork.Predator 1.0 | 7 | 86% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 83% |
| skm.butterfly 1.0 | 2 | 100% |
| adt.Ar2 1.0 | 2 | 100% |

Hadur died in 168 of 210 rounds, at a mean tick of 1176. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 127 | 76% | 141 |
| sgp.JollyNinja 3.53 | 17 | 10% | 22 |
| lorneswork.Predator 1.0 | 7 | 4% | 11 |
| mz.MicroGodMelee 1 | 6 | 4% | 18 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 3% | 13 |
| adt.Ar2 1.0 | 2 | 1% | 2 |
| skm.butterfly 1.0 | 1 | 1% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 142469 melee ticks, 90031 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 73 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 45429 sent, 40761 reached their opponent, 8272 virtual hits (20.3% of those reached).

## Melee bench: F02

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 138 over 6 battles (23.0 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 87.8 | 112 / 210 | 2.10 | 19.1% | 31106 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 19.1% | 112 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 15.0% | 54 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.4% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 11.3% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.0% | 8 |
| fnc.bandit.Bandit 5.2.0 | 6.3 | 8.3% | 2 |
| sch.Simone 0.3d | 7.2 | 7.4% | 5 |
| Noran.BitchingElk 0.054 | 7.5 | 7.5% | 7 |
| stelo.PatternRobot 1.0 | 9.0 | 4.7% | 0 |
| fullsail.SweetTea 1.1 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 92.4 | 23 / 35 | 5560 |
| 2 | 1 | 67.9 | 83.5 | 17 / 35 | 4758 |
| 3 | 1 | 68.0 | 84.1 | 16 / 35 | 5107 |
| 4 | 1 | 70.9 | 93.0 | 22 / 35 | 5522 |
| 5 | 1 | 67.9 | 84.8 | 16 / 35 | 5028 |
| 6 | 1 | 69.5 | 88.9 | 18 / 35 | 5131 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 56 | 55% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 52 | 79% |
| com.cohesiva.robocode.ManOwaR 1.0 | 17 | 76% |
| sch.Simone 0.3d | 11 | 82% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 91% |
| Noran.BitchingElk 0.054 | 5 | 40% |
| fnc.bandit.Bandit 5.2.0 | 3 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |
| stelo.PatternRobot 1.0 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 951. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 38 | 39% | 67 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 18 | 18% | 59 |
| com.cohesiva.robocode.ManOwaR 1.0 | 13 | 13% | 29 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 8% | 16 |
| fnc.bandit.Bandit 5.2.0 | 8 | 8% | 14 |
| sch.Simone 0.3d | 6 | 6% | 13 |
| Noran.BitchingElk 0.054 | 5 | 5% | 8 |
| stelo.PatternRobot 1.0 | 2 | 2% | 3 |
| fullsail.SweetTea 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 162612 melee ticks, 43364 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 43 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 58025 sent, 53262 reached their opponent, 8808 virtual hits (16.5% of those reached).

## Melee bench: F03

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 95 over 6 battles (15.8 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 93.7 | 170 / 210 | 1.57 | 21.1% | 39369 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 21.1% | 170 |
| radnor.DoctorBob 1.42 | 2.5 | 13.9% | 6 |
| kawigi.nano.Lib 1.0 | 2.5 | 13.5% | 17 |
| vuen.Cake 2.51 | 4.0 | 12.5% | 16 |
| urdos.URDOS 1.3 | 5.0 | 9.2% | 0 |
| adt.Ar1 2.1 | 6.2 | 7.1% | 0 |
| oa.weak.FlyMk1 0.1 | 7.7 | 6.0% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 8.3 | 5.9% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.7 | 5.6% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.2 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 92.7 | 24 / 35 | 6787 |
| 2 | 1 | 72.5 | 96.8 | 30 / 35 | 6721 |
| 3 | 1 | 72.4 | 96.2 | 32 / 35 | 6629 |
| 4 | 1 | 72.5 | 95.9 | 32 / 35 | 6701 |
| 5 | 1 | 69.2 | 86.7 | 26 / 35 | 5882 |
| 6 | 1 | 71.6 | 93.7 | 26 / 35 | 6649 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 67 | 87% |
| radnor.DoctorBob 1.42 | 67 | 97% |
| kawigi.nano.Lib 1.0 | 46 | 91% |
| urdos.URDOS 1.3 | 4 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 13 | 33% | 65 |
| radnor.DoctorBob 1.42 | 8 | 20% | 66 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 20% | 9 |
| kawigi.nano.Lib 1.0 | 7 | 18% | 44 |
| urdos.URDOS 1.3 | 4 | 10% | 13 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 5 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 3 |
| adt.Ar1 2.1 | 0 | 0% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 124952 melee ticks, 47637 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 64 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 37763 sent, 33242 reached their opponent, 8578 virtual hits (25.8% of those reached).

## Melee bench: F04

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 572 over 6 battles (95.3 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.8 | 36 / 210 | 2.19 | 18.1% | 35315 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.4% | 164 |
| hadur117.Hadur 3.20bb | 2.0 | 18.1% | 36 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.7% | 5 |
| TNT.TNT 0.99.1 | 4.2 | 10.6% | 5 |
| josago.Jorgito 0.16 | 5.2 | 8.7% | 0 |
| css.Delitioner 0.11 | 5.7 | 8.1% | 0 |
| tj.zombie1n 1.0.1 | 7.2 | 6.0% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.3% | 0 |
| spin.Bugstard 0.012b | 9.0 | 3.8% | 0 |
| sp.Nanos.Ember 1.1 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.5 | 87.9 | 7 / 35 | 5498 |
| 2 | 2 | 69.8 | 86.7 | 9 / 35 | 6279 |
| 3 | 2 | 68.2 | 85.4 | 1 / 35 | 5705 |
| 4 | 2 | 69.8 | 87.9 | 9 / 35 | 6235 |
| 5 | 2 | 68.6 | 86.7 | 4 / 35 | 5711 |
| 6 | 2 | 69.0 | 86.3 | 6 / 35 | 5887 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 141 | 13% |
| apc.LeeroyJenkins2 1.0 | 12 | 83% |
| TNT.TNT 0.99.1 | 11 | 55% |
| tj.zombie1n 1.0.1 | 2 | 100% |

Hadur died in 179 of 210 rounds, at a mean tick of 1295. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 130 | 73% | 150 |
| apc.LeeroyJenkins2 1.0 | 18 | 10% | 28 |
| TNT.TNT 0.99.1 | 11 | 6% | 16 |
| josago.Jorgito 0.16 | 9 | 5% | 9 |
| css.Delitioner 0.11 | 5 | 3% | 5 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 1 |
| rampancy.Durandal 2.1d | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 191435 melee ticks, 81143 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 88 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 88 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 58977 sent, 54086 reached their opponent, 8104 virtual hits (15.0% of those reached).

## Melee bench: F05

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 397 over 6 battles (66.2 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 80.4 | 31 / 210 | 2.77 | 15.5% | 24121 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.1% | 104 |
| justin.DemonicRage 3.4 | 2.2 | 16.8% | 57 |
| hadur117.Hadur 3.20bb | 2.8 | 15.5% | 31 |
| wompi.Numbat 2.1 | 4.0 | 12.6% | 15 |
| ms.Ares 0.19 | 5.2 | 9.4% | 1 |
| axeBots.HataMoto 3.09 | 5.8 | 8.8% | 2 |
| supersample.SuperBoxBot 1.0 | 7.3 | 5.6% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.2% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.0% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.9 | 80.0 | 3 / 35 | 3675 |
| 2 | 3 | 65.2 | 80.6 | 4 / 35 | 4163 |
| 3 | 3 | 63.5 | 76.8 | 5 / 35 | 3759 |
| 4 | 3 | 65.2 | 80.6 | 5 / 35 | 4160 |
| 5 | 2 | 66.5 | 85.4 | 9 / 35 | 4225 |
| 6 | 3 | 64.4 | 78.7 | 5 / 35 | 4139 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 46 | 30% |
| cb.fire.Firestarter 2.0f | 45 | 9% |
| wompi.Numbat 2.1 | 15 | 67% |
| axeBots.HataMoto 3.09 | 3 | 67% |
| ms.Ares 0.19 | 1 | 100% |

Hadur died in 182 of 210 rounds, at a mean tick of 946. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 69 | 38% | 82 |
| cb.fire.Firestarter 2.0f | 65 | 36% | 72 |
| wompi.Numbat 2.1 | 24 | 13% | 32 |
| axeBots.HataMoto 3.09 | 13 | 7% | 14 |
| ms.Ares 0.19 | 6 | 3% | 8 |
| supersample.SuperBoxBot 1.0 | 1 | 1% | 1 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 156625 melee ticks, 41323 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 58 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 47799 sent, 42666 reached their opponent, 7111 virtual hits (16.7% of those reached).

## Melee bench: F06

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 405 over 6 battles (67.5 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 93.3 | 144 / 210 | 1.60 | 20.8% | 34608 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 20.8% | 144 |
| jekl.StoneGhost 0.7 | 2.2 | 14.4% | 14 |
| origin.SleepSiphon 1.7b | 3.0 | 13.2% | 29 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.3% | 15 |
| mld.Wisdom 1.0 | 5.2 | 10.0% | 2 |
| gg.Wolverine 2.0 | 5.8 | 8.2% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 6.8% | 3 |
| spinnercat.Omen 1.0 | 8.0 | 6.1% | 0 |
| DBall.NUKE 0.1 | 8.7 | 5.6% | 0 |
| sample.Fire 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 93.0 | 24 / 35 | 5778 |
| 2 | 1 | 70.7 | 92.7 | 21 / 35 | 5479 |
| 3 | 1 | 71.7 | 93.3 | 26 / 35 | 5932 |
| 4 | 1 | 71.7 | 95.2 | 26 / 35 | 5501 |
| 5 | 1 | 72.5 | 96.2 | 27 / 35 | 6027 |
| 6 | 1 | 70.5 | 89.2 | 20 / 35 | 5891 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 71 | 92% |
| origin.SleepSiphon 1.7b | 45 | 78% |
| pe.minimelee.SandboxMiniMelee 1.1 | 37 | 76% |
| gg.Wolverine 2.0 | 10 | 90% |
| mld.Wisdom 1.0 | 6 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 50% |

Hadur died in 69 of 210 rounds, at a mean tick of 990. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 28 | 41% | 76 |
| pe.minimelee.SandboxMiniMelee 1.1 | 15 | 22% | 42 |
| jekl.StoneGhost 0.7 | 14 | 20% | 56 |
| mld.Wisdom 1.0 | 5 | 7% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 3% | 11 |
| gg.Wolverine 2.0 | 2 | 3% | 10 |
| spinnercat.Omen 1.0 | 0 | 0% | 2 |
| DBall.NUKE 0.1 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 154038 melee ticks, 48305 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 32 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 47000 sent, 42380 reached their opponent, 9552 virtual hits (22.5% of those reached).

## Melee bench: F07

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 726 over 6 battles (121.0 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 94.2 | 128 / 210 | 1.52 | 21.3% | 40569 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 21.3% | 128 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 16.2% | 32 |
| rtk.Tachikoma 1.0 | 2.7 | 16.4% | 31 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 10.7% | 8 |
| franzor.Lizt 1.3.1 | 4.5 | 10.8% | 12 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.4% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.7% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.4% | 0 |
| sample.Target 1.0 | 9.3 | 2.1% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.7 | 94.6 | 23 / 35 | 7035 |
| 2 | 1 | 72.4 | 92.4 | 21 / 35 | 6665 |
| 3 | 1 | 72.4 | 93.0 | 15 / 35 | 6733 |
| 4 | 1 | 73.4 | 94.9 | 26 / 35 | 6709 |
| 5 | 1 | 73.9 | 95.6 | 23 / 35 | 7169 |
| 6 | 1 | 72.1 | 94.6 | 20 / 35 | 6258 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 101 | 76% |
| rsalesc.melee.Monk 0.3.6c | 44 | 34% |
| franzor.Lizt 1.3.1 | 24 | 63% |
| oog.melee.CapuletDroid 1.1 | 21 | 81% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |
| skm.PateranBotlock2 1.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 1440. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 33 | 38% | 110 |
| rsalesc.melee.Monk 0.3.6c | 31 | 35% | 61 |
| franzor.Lizt 1.3.1 | 9 | 10% | 2 |
| oog.melee.CapuletDroid 1.1 | 8 | 9% | 29 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 3 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 3 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 185949 melee ticks, 85764 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 32 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 56075 sent, 51337 reached their opponent, 10388 virtual hits (20.2% of those reached).

## Melee bench: F08

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 519 over 6 battles (86.5 per battle, most in one battle 149). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 92.2 | 143 / 210 | 1.70 | 19.9% | 30274 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 19.9% | 143 |
| tm.Yuugao 1.0 | 2.2 | 13.0% | 21 |
| shrub.Vapour v159 | 3.2 | 11.7% | 18 |
| Krabb.sliNk.Garm 0.9u | 3.7 | 11.1% | 20 |
| com.spp.robocode.MostlyHarmless 010 | 5.3 | 9.9% | 4 |
| jwst.DAD.DarkAndDarker 1.1 | 6.3 | 8.6% | 6 |
| m3thos.Eva00 1.1 | 6.3 | 8.8% | 0 |
| qualidafial.MajorDick 1.0.1 | 8.3 | 6.5% | 0 |
| SHAM.WOW 1.4 | 9.3 | 5.4% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 95.6 | 27 / 35 | 5256 |
| 2 | 1 | 69.0 | 90.5 | 23 / 35 | 4868 |
| 3 | 1 | 69.3 | 93.0 | 26 / 35 | 4584 |
| 4 | 1 | 68.9 | 88.3 | 21 / 35 | 5055 |
| 5 | 1 | 69.9 | 94.6 | 23 / 35 | 5081 |
| 6 | 1 | 70.3 | 91.4 | 23 / 35 | 5430 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 50 | 76% |
| Krabb.sliNk.Garm 0.9u | 36 | 75% |
| shrub.Vapour v159 | 31 | 81% |
| com.spp.robocode.MostlyHarmless 010 | 28 | 96% |
| jwst.DAD.DarkAndDarker 1.1 | 16 | 88% |
| m3thos.Eva00 1.1 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 971. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 24 | 34% | 62 |
| Krabb.sliNk.Garm 0.9u | 17 | 24% | 37 |
| shrub.Vapour v159 | 12 | 17% | 41 |
| com.spp.robocode.MostlyHarmless 010 | 7 | 10% | 29 |
| jwst.DAD.DarkAndDarker 1.1 | 3 | 4% | 20 |
| m3thos.Eva00 1.1 | 2 | 3% | 13 |
| qualidafial.MajorDick 1.0.1 | 2 | 3% | 2 |
| SHAM.WOW 1.4 | 0 | 0% | 5 |
| zyx.nano.BacillusComma 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 152403 melee ticks, 44293 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 66 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 49093 sent, 44264 reached their opponent, 7988 virtual hits (18.0% of those reached).

## Melee bench: F09

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 505 over 6 battles (84.2 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 78.0 | 61 / 210 | 2.98 | 15.8% | 22258 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.6% | 106 |
| hadur117.Hadur 3.20bb | 2.2 | 15.8% | 61 |
| kc.micro.Figment 1.0 | 2.8 | 14.0% | 19 |
| pedersen.Grishnakh 1.0 | 4.3 | 10.5% | 12 |
| yagami.Tidus 0.11 | 4.5 | 10.4% | 1 |
| mc2.enemy.Original 0.9 | 6.3 | 8.8% | 7 |
| dft.Calliope 5.6 | 6.8 | 7.8% | 3 |
| step.nanoPri 1.0 | 8.2 | 5.8% | 0 |
| rdm.Dueler 0.4x | 9.2 | 4.6% | 1 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.0 | 72.7 | 7 / 35 | 3370 |
| 2 | 3 | 63.5 | 73.7 | 9 / 35 | 3723 |
| 3 | 2 | 65.1 | 80.3 | 14 / 35 | 3646 |
| 4 | 2 | 63.5 | 76.5 | 8 / 35 | 3568 |
| 5 | 1 | 67.2 | 85.7 | 12 / 35 | 4404 |
| 6 | 2 | 64.6 | 79.4 | 11 / 35 | 3547 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 58 | 28% |
| kc.micro.Figment 1.0 | 33 | 82% |
| pedersen.Grishnakh 1.0 | 12 | 58% |
| dft.Calliope 5.6 | 6 | 67% |
| mc2.enemy.Original 0.9 | 4 | 50% |
| yagami.Tidus 0.11 | 4 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 62 | 40% | 85 |
| kc.micro.Figment 1.0 | 23 | 15% | 46 |
| pedersen.Grishnakh 1.0 | 17 | 11% | 20 |
| yagami.Tidus 0.11 | 16 | 10% | 18 |
| mc2.enemy.Original 0.9 | 15 | 10% | 19 |
| dft.Calliope 5.6 | 8 | 5% | 11 |
| step.nanoPri 1.0 | 4 | 3% | 5 |
| robar.nano.Assertive_Melee 0.2 | 3 | 2% | 3 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 151173 melee ticks, 40304 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 80 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 49327 sent, 44568 reached their opponent, 6394 virtual hits (14.3% of those reached).

## Melee bench: F10

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 303 over 6 battles (50.5 per battle, most in one battle 110). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 94.1 | 160 / 210 | 1.53 | 20.5% | 34153 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 20.5% | 160 |
| DTF.Kludgy 1.2b | 2.0 | 14.7% | 27 |
| ejb.Polaris 1.0.1 | 3.3 | 12.5% | 12 |
| ne.Chimera 1.2 | 3.7 | 12.0% | 3 |
| tvv.micro.Antares 1.1.1 | 5.3 | 10.4% | 2 |
| vStar.RAFzilla 2.15 | 5.7 | 10.3% | 5 |
| kurios.DOSexe .9b | 7.5 | 5.6% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.0 | 5.3% | 0 |
| sam.Samspin 1.0 | 8.7 | 5.2% | 1 |
| donjezza.Muncho 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 91.7 | 24 / 35 | 5546 |
| 2 | 1 | 70.7 | 93.3 | 26 / 35 | 5538 |
| 3 | 1 | 70.8 | 93.7 | 27 / 35 | 5321 |
| 4 | 1 | 71.6 | 94.3 | 30 / 35 | 5895 |
| 5 | 1 | 71.9 | 95.9 | 26 / 35 | 6098 |
| 6 | 1 | 71.4 | 95.9 | 27 / 35 | 5755 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 76 | 74% |
| ejb.Polaris 1.0.1 | 41 | 90% |
| ne.Chimera 1.2 | 23 | 96% |
| tvv.micro.Antares 1.1.1 | 21 | 100% |
| vStar.RAFzilla 2.15 | 21 | 86% |
| kurios.DOSexe .9b | 5 | 100% |
| sam.Samspin 1.0 | 2 | 50% |

Hadur died in 53 of 210 rounds, at a mean tick of 935. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 29 | 55% | 86 |
| ejb.Polaris 1.0.1 | 6 | 11% | 43 |
| ne.Chimera 1.2 | 6 | 11% | 25 |
| vStar.RAFzilla 2.15 | 5 | 9% | 23 |
| sam.Samspin 1.0 | 2 | 4% | 3 |
| tvv.micro.Antares 1.1.1 | 1 | 2% | 16 |
| donjezza.Muncho 1.0 | 1 | 2% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 2 |
| kurios.DOSexe .9b | 0 | 0% | 9 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 145850 melee ticks, 57665 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 48 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 47130 sent, 42394 reached their opponent, 7859 virtual hits (18.5% of those reached).

## Melee bench: F11

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 105 over 6 battles (17.5 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 82.5 | 80 / 210 | 2.57 | 16.9% | 24523 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.5 | 16.3% | 62 |
| hadur117.Hadur 3.20bb | 1.5 | 16.9% | 80 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.9% | 26 |
| djc.DynaBot 0.1.1 | 4.0 | 10.7% | 12 |
| rdt199.Warlord 0.73 | 5.0 | 9.9% | 15 |
| br2.MobyDickBot 1.6 | 6.2 | 8.3% | 8 |
| uji.YellohFellah 1.0 | 7.0 | 8.1% | 5 |
| KiraNL.Chupacabra 0.4 | 7.8 | 6.8% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.5% | 1 |
| stelo.MirrorNano 1.3 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.4 | 82.5 | 16 / 35 | 4157 |
| 2 | 2 | 65.8 | 82.9 | 12 / 35 | 4058 |
| 3 | 1 | 66.0 | 82.9 | 14 / 35 | 4145 |
| 4 | 2 | 65.1 | 82.2 | 11 / 35 | 4009 |
| 5 | 1 | 64.7 | 80.3 | 13 / 35 | 3876 |
| 6 | 1 | 66.8 | 84.4 | 14 / 35 | 4278 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 53 | 62% |
| cx.mini.Nimrod 0.55 | 24 | 54% |
| djc.DynaBot 0.1.1 | 18 | 50% |
| rdt199.Warlord 0.73 | 17 | 59% |
| br2.MobyDickBot 1.6 | 11 | 55% |
| uji.YellohFellah 1.0 | 8 | 100% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 0% |

Hadur died in 130 of 210 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 47 | 36% | 80 |
| rdt199.Warlord 0.73 | 27 | 21% | 35 |
| cx.mini.Nimrod 0.55 | 25 | 19% | 37 |
| djc.DynaBot 0.1.1 | 16 | 12% | 25 |
| br2.MobyDickBot 1.6 | 6 | 5% | 11 |
| uji.YellohFellah 1.0 | 3 | 2% | 11 |
| KiraNL.Chupacabra 0.4 | 3 | 2% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 2% | 5 |

Posture (Hadur's M records, 208 rounds): 158410 melee ticks, 39736 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 49 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 1.

Targeting waves (208 rounds): 51939 sent, 46909 reached their opponent, 6318 virtual hits (13.5% of those reached).

## Melee bench: F12

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 337 over 6 battles (56.2 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 89.3 | 124 / 210 | 1.96 | 18.8% | 25833 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 18.8% | 124 |
| bts.wiki.RipCurl 0.9b | 2.3 | 13.8% | 26 |
| nat.PallasHawk 1.0 | 2.8 | 13.1% | 31 |
| darkcanuck.Leon 1.01 | 3.8 | 12.0% | 13 |
| brainfade.melee.Genghis 0.36 | 5.2 | 10.2% | 10 |
| jrm.Test0 1.0 | 5.8 | 8.4% | 2 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.3% | 1 |
| jp.Perpy 16.0 | 8.2 | 6.0% | 0 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.1% | 1 |
| stuff.Vlad 0.1 | 9.5 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 87.3 | 20 / 35 | 4158 |
| 2 | 1 | 68.8 | 88.9 | 23 / 35 | 4363 |
| 3 | 1 | 69.5 | 91.7 | 21 / 35 | 4779 |
| 4 | 1 | 68.1 | 88.3 | 19 / 35 | 4152 |
| 5 | 1 | 68.0 | 88.3 | 20 / 35 | 4180 |
| 6 | 1 | 68.7 | 91.4 | 21 / 35 | 4201 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 50 | 68% |
| darkcanuck.Leon 1.01 | 47 | 89% |
| bts.wiki.RipCurl 0.9b | 46 | 70% |
| brainfade.melee.Genghis 0.36 | 12 | 58% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| jrm.Test0 1.0 | 3 | 100% |
| jaybot.bots.Oddball 4.0 | 2 | 50% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 776. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 23 | 26% | 54 |
| bts.wiki.RipCurl 0.9b | 23 | 26% | 53 |
| darkcanuck.Leon 1.01 | 17 | 19% | 62 |
| brainfade.melee.Genghis 0.36 | 10 | 11% | 16 |
| jrm.Test0 1.0 | 6 | 7% | 11 |
| jaybot.bots.Oddball 4.0 | 3 | 3% | 2 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 5 |
| jp.Perpy 16.0 | 1 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 132293 melee ticks, 44506 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 34 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 44857 sent, 39861 reached their opponent, 6713 virtual hits (16.8% of those reached).

## Melee bench: F13

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 181 over 6 battles (30.2 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 82.6 | 66 / 210 | 2.56 | 16.4% | 25853 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.8 | 16.4% | 38 |
| mn.Combat 3.25.0 | 1.8 | 16.6% | 80 |
| hadur117.Hadur 3.20bb | 2.3 | 16.4% | 66 |
| shinh.Entangled 0.3 | 4.3 | 11.2% | 17 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.3% | 9 |
| apc.Colossus2 0.17 | 6.0 | 8.1% | 0 |
| stelo.Wang 1.0 | 7.2 | 7.0% | 0 |
| maribo.FollowFire 1 | 7.8 | 5.4% | 0 |
| ayk.WallHugger 1.0 | 9.0 | 4.4% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 81.9 | 13 / 35 | 4342 |
| 2 | 1 | 67.2 | 84.4 | 15 / 35 | 4577 |
| 3 | 3 | 64.8 | 81.6 | 6 / 35 | 4000 |
| 4 | 3 | 64.0 | 78.1 | 9 / 35 | 3927 |
| 5 | 2 | 67.3 | 86.7 | 15 / 35 | 4328 |
| 6 | 3 | 66.3 | 83.2 | 8 / 35 | 4679 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 50 | 72% |
| mn.Combat 3.25.0 | 49 | 31% |
| shinh.Entangled 0.3 | 16 | 44% |
| gh.micro.Gruweltje 0.7 | 12 | 58% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 902. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 55 | 38% | 71 |
| ags.Glacier 0.2.11 | 47 | 32% | 77 |
| shinh.Entangled 0.3 | 18 | 12% | 27 |
| gh.micro.Gruweltje 0.7 | 12 | 8% | 21 |
| stelo.Wang 1.0 | 7 | 5% | 9 |
| maribo.FollowFire 1 | 3 | 2% | 3 |
| apc.Colossus2 0.17 | 2 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 150397 melee ticks, 47624 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 111 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 111 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 44109 sent, 38841 reached their opponent, 6134 virtual hits (15.8% of those reached).

## Melee bench: F14

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 144 over 6 battles (24.0 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 96.4 | 165 / 210 | 1.32 | 21.7% | 38079 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 21.7% | 165 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.8% | 14 |
| catcat20.shape.Theta 0.018 | 2.8 | 12.6% | 26 |
| co.edu.usb.rc.LidisTron 1.0 | 4.7 | 9.4% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 5.3 | 8.9% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 5.3 | 9.3% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.2 | 7.9% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 7.6% | 4 |
| pa.Improved 1.0 | 9.0 | 6.1% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 98.1 | 30 / 35 | 6512 |
| 2 | 1 | 72.7 | 96.8 | 29 / 35 | 6313 |
| 3 | 1 | 73.0 | 97.1 | 28 / 35 | 6626 |
| 4 | 1 | 71.6 | 94.6 | 23 / 35 | 6195 |
| 5 | 1 | 71.8 | 94.9 | 25 / 35 | 6209 |
| 6 | 1 | 72.8 | 96.8 | 30 / 35 | 6224 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 91 | 93% |
| catcat20.shape.Theta 0.018 | 57 | 70% |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 73% |
| sanyi.mikrobi.Roberto 1.0 | 13 | 92% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 5 | 100% |
| pa.Improved 1.0 | 4 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 1022. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 20 | 44% | 59 |
| simonton.micro.Sprout 1.1.3 | 16 | 36% | 90 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 9% | 14 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 7% | 19 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 2% | 7 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 2% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 10 |
| pa.Improved 1.0 | 0 | 0% | 3 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 141867 melee ticks, 53831 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 34 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 44690 sent, 40229 reached their opponent, 9987 virtual hits (24.8% of those reached).

## Melee bench: F15

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 104 over 6 battles (17.3 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 87.6 | 117 / 210 | 2.11 | 19.2% | 32064 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 19.2% | 117 |
| kawigi.micro.Shiz 1.1 | 2.2 | 14.1% | 27 |
| mld.DustBunny 3.8 | 3.3 | 13.1% | 6 |
| emp.Yngwie 1.11 | 3.5 | 12.7% | 41 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.1% | 5 |
| kawigi.robot.Girl 1.2 | 5.8 | 8.7% | 13 |
| Grystrion.TrackerWO 1.0 | 7.2 | 6.7% | 0 |
| lambdaxy.TBot 0.1 | 7.8 | 6.8% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 4.5% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 87.0 | 20 / 35 | 5101 |
| 2 | 1 | 69.4 | 88.6 | 21 / 35 | 5223 |
| 3 | 1 | 69.9 | 89.5 | 21 / 35 | 5464 |
| 4 | 1 | 67.4 | 81.6 | 13 / 35 | 5250 |
| 5 | 1 | 69.7 | 88.6 | 19 / 35 | 5426 |
| 6 | 1 | 70.2 | 90.5 | 23 / 35 | 5600 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 43 | 65% |
| kawigi.micro.Shiz 1.1 | 40 | 85% |
| mld.DustBunny 3.8 | 34 | 94% |
| kawigi.robot.Girl 1.2 | 15 | 67% |
| cb.nano.Insomnia 1.0 | 13 | 92% |

Hadur died in 93 of 210 rounds, at a mean tick of 958. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 36 | 39% | 81 |
| kawigi.micro.Shiz 1.1 | 18 | 19% | 44 |
| mld.DustBunny 3.8 | 17 | 18% | 47 |
| cb.nano.Insomnia 1.0 | 10 | 11% | 13 |
| kawigi.robot.Girl 1.2 | 8 | 9% | 12 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 4 |
| lambdaxy.TBot 0.1 | 1 | 1% | 5 |
| divineomega.TrialBot 0.003 | 1 | 1% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 207 rounds): 168340 melee ticks, 45272 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 47 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 54010 sent, 49226 reached their opponent, 8266 virtual hits (16.8% of those reached).

## Melee bench: F16

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 317 over 6 battles (52.8 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 91.5 | 130 / 210 | 1.77 | 20.7% | 36729 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 20.7% | 130 |
| gh.Griezel 0.5.2 | 2.0 | 15.7% | 35 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.2 | 13.6% | 8 |
| techdude.forest.FlamingForest 1.1 | 4.5 | 10.4% | 24 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.5% | 3 |
| tvv.nano.Polaris 1.2 | 5.3 | 8.9% | 4 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.4% | 3 |
| repositorio.NanoStep 1.0 | 8.2 | 5.0% | 0 |
| asd.Cthulhu 1.3 | 9.2 | 4.8% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.7 | 4.0% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 91.7 | 22 / 35 | 5726 |
| 2 | 1 | 70.5 | 90.2 | 20 / 35 | 5899 |
| 3 | 1 | 71.8 | 93.7 | 20 / 35 | 6426 |
| 4 | 1 | 70.5 | 88.3 | 21 / 35 | 5988 |
| 5 | 1 | 72.3 | 93.3 | 24 / 35 | 6308 |
| 6 | 1 | 71.9 | 91.7 | 23 / 35 | 6382 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 84 | 77% |
| techdude.forest.FlamingForest 1.1 | 44 | 70% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 22 | 86% |
| bvh.fnr.Fenrir 0.36l | 9 | 67% |
| tvv.nano.Polaris 1.2 | 7 | 71% |
| stelo.IntrinsicVolatility 1.4 | 5 | 60% |
| divineomega.DivineBot 1.9.4.5 | 2 | 50% |

Hadur died in 83 of 210 rounds, at a mean tick of 1205. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 31 | 37% | 89 |
| techdude.forest.FlamingForest 1.1 | 19 | 23% | 53 |
| bvh.fnr.Fenrir 0.36l | 12 | 14% | 20 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 9 | 11% | 27 |
| stelo.IntrinsicVolatility 1.4 | 5 | 6% | 7 |
| tvv.nano.Polaris 1.2 | 3 | 4% | 6 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 4 |
| repositorio.NanoStep 1.0 | 0 | 0% | 3 |
| asd.Cthulhu 1.3 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 179690 melee ticks, 71377 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 35 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 57010 sent, 52296 reached their opponent, 8656 virtual hits (16.6% of those reached).

## Melee bench: F17

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 420 over 6 battles (70.0 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 90.8 | 125 / 210 | 1.83 | 20.3% | 36129 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 20.3% | 125 |
| et.Predator 1.8 | 2.8 | 12.9% | 19 |
| oog.melee.Mercutio 1.0 | 3.0 | 13.3% | 28 |
| cx.BlestPain 1.41 | 3.2 | 12.2% | 34 |
| ahf.NanoAndrew .4 | 5.5 | 9.9% | 2 |
| nic.Nicator 2.4 | 6.0 | 9.1% | 0 |
| maribo.melee.BMV 0.1 | 6.5 | 8.6% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.2 | 6.2% | 1 |
| tex.Longbot 0.4 | 8.8 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 93.7 | 25 / 35 | 5902 |
| 2 | 1 | 69.6 | 87.9 | 19 / 35 | 5804 |
| 3 | 1 | 70.7 | 89.8 | 18 / 35 | 6273 |
| 4 | 1 | 71.8 | 93.3 | 23 / 35 | 6354 |
| 5 | 1 | 70.3 | 89.2 | 22 / 35 | 5750 |
| 6 | 1 | 70.6 | 90.8 | 18 / 35 | 6046 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 53 | 83% |
| et.Predator 1.8 | 51 | 82% |
| cx.BlestPain 1.41 | 42 | 40% |
| ahf.NanoAndrew .4 | 11 | 100% |
| maribo.melee.BMV 0.1 | 7 | 86% |
| nic.Nicator 2.4 | 3 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 50% |
| tex.Longbot 0.4 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 1174. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 32 | 36% | 55 |
| et.Predator 1.8 | 22 | 24% | 57 |
| oog.melee.Mercutio 1.0 | 21 | 23% | 62 |
| ahf.NanoAndrew .4 | 5 | 6% | 16 |
| edu.otg.spr.TheTeacher 1.2 | 3 | 3% | 6 |
| maribo.melee.BMV 0.1 | 2 | 2% | 6 |
| nic.Nicator 2.4 | 1 | 1% | 7 |
| tex.Longbot 0.4 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 164976 melee ticks, 71864 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 106 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 106 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 54812 sent, 49994 reached their opponent, 10369 virtual hits (20.7% of those reached).

## Melee bench: F18

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 406 over 6 battles (67.7 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 92.1 | 140 / 210 | 1.71 | 20.1% | 30324 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 20.1% | 140 |
| morbid.MorbidPriest 1.0 | 2.3 | 12.9% | 25 |
| agd.Mooserwirt2 2.7 | 3.2 | 12.4% | 16 |
| uji.DBH 1.1 | 3.5 | 11.4% | 11 |
| ratosh.Nobo 0.21 | 5.7 | 8.6% | 4 |
| sigterm.Sigterm 1.0 | 6.0 | 8.7% | 6 |
| spinnercat.Robovirus 2.718 | 6.3 | 8.5% | 6 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.0% | 2 |
| stelo.WangRobot 1.0 | 9.3 | 5.2% | 0 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 93.0 | 24 / 35 | 5281 |
| 2 | 1 | 69.3 | 93.3 | 21 / 35 | 4591 |
| 3 | 1 | 70.3 | 92.7 | 24 / 35 | 5203 |
| 4 | 1 | 70.2 | 93.0 | 24 / 35 | 5027 |
| 5 | 1 | 68.2 | 86.7 | 21 / 35 | 4755 |
| 6 | 1 | 71.1 | 94.0 | 26 / 35 | 5467 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 53 | 77% |
| agd.Mooserwirt2 2.7 | 43 | 74% |
| uji.DBH 1.1 | 36 | 78% |
| sigterm.Sigterm 1.0 | 21 | 81% |
| spinnercat.Robovirus 2.718 | 9 | 56% |
| ratosh.Nobo 0.21 | 8 | 88% |
| stelo.WangRobot 1.0 | 7 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 984. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 28 | 38% | 68 |
| agd.Mooserwirt2 2.7 | 16 | 22% | 48 |
| uji.DBH 1.1 | 10 | 14% | 31 |
| spinnercat.Robovirus 2.718 | 5 | 7% | 11 |
| sigterm.Sigterm 1.0 | 4 | 5% | 17 |
| ratosh.Nobo 0.21 | 3 | 4% | 16 |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 3% | 9 |
| stelo.WangRobot 1.0 | 2 | 3% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 142289 melee ticks, 53357 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 390 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 152 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 46720 sent, 41847 reached their opponent, 9052 virtual hits (21.6% of those reached).

## Melee bench: F19

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 93 over 6 battles (15.5 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.9 | 98.7 | 200 / 210 | 1.12 | 22.8% | 38983 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 22.8% | 200 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.8% | 6 |
| mld.Infinity 2.2 | 3.2 | 12.5% | 1 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.6% | 1 |
| erdnis.Rover 0.3 | 4.8 | 10.5% | 1 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.2% | 0 |
| mbh.Mbh 0.1 | 7.0 | 6.7% | 0 |
| pac.ABC 2.1 | 7.8 | 6.4% | 1 |
| pbg.R2D2 1.0 | 8.8 | 5.2% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.6 | 97.1 | 32 / 35 | 6386 |
| 2 | 1 | 73.5 | 96.8 | 32 / 35 | 6593 |
| 3 | 1 | 73.4 | 99.0 | 33 / 35 | 6063 |
| 4 | 1 | 73.7 | 99.4 | 34 / 35 | 6263 |
| 5 | 1 | 74.9 | 100.0 | 35 / 35 | 7053 |
| 6 | 1 | 74.4 | 99.7 | 34 / 35 | 6625 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 115 | 98% |
| krillr.mini.JointStrike 2.0.0 | 33 | 97% |
| mld.Infinity 2.2 | 27 | 100% |
| patson.PatsonTestBot 1.0 | 12 | 100% |
| erdnis.Rover 0.3 | 10 | 100% |
| pac.ABC 2.1 | 5 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 11 of 210 rounds, at a mean tick of 701. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| krillr.mini.JointStrike 2.0.0 | 5 | 45% | 40 |
| davidalves.net.DuelistMiniMelee 1.2 | 4 | 36% | 79 |
| mld.Infinity 2.2 | 1 | 9% | 32 |
| erdnis.Rover 0.3 | 1 | 9% | 22 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 21 |
| pbg.R2D2 1.0 | 0 | 0% | 7 |
| mbh.Mbh 0.1 | 0 | 0% | 5 |
| pac.ABC 2.1 | 0 | 0% | 4 |

Posture (Hadur's M records, 199 rounds): 126359 melee ticks, 44155 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 57 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 42082 sent, 37509 reached their opponent, 8903 virtual hits (23.7% of those reached).

## Melee bench: F20

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 293 over 6 battles (48.8 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 92.6 | 150 / 210 | 1.66 | 21.4% | 37750 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 21.4% | 150 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.2% | 24 |
| fwb.Nine 1.0.1 | 3.8 | 10.8% | 9 |
| nz.jdc.nano.GridFu 1.0 | 4.0 | 10.9% | 3 |
| catcat20.Rabbit 0.001 | 4.2 | 11.1% | 21 |
| m3thos.mini.Eva01 0.5.5 | 6.2 | 8.1% | 1 |
| bayen.nut.Squirrel 1.615 | 7.0 | 7.2% | 2 |
| djdjdj.NanoSkunk10 1.0 | 8.0 | 6.3% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 5.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 93.0 | 25 / 35 | 6672 |
| 2 | 1 | 71.5 | 89.5 | 24 / 35 | 6421 |
| 3 | 1 | 72.2 | 93.7 | 25 / 35 | 6227 |
| 4 | 1 | 71.5 | 93.3 | 25 / 35 | 6081 |
| 5 | 1 | 72.0 | 93.7 | 26 / 35 | 6125 |
| 6 | 1 | 72.1 | 92.7 | 25 / 35 | 6224 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 76 | 88% |
| fwb.Nine 1.0.1 | 34 | 88% |
| catcat20.Rabbit 0.001 | 31 | 71% |
| nz.jdc.nano.GridFu 1.0 | 18 | 83% |
| bayen.nut.Squirrel 1.615 | 10 | 80% |
| m3thos.mini.Eva01 0.5.5 | 7 | 86% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 963. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 25 | 40% | 80 |
| catcat20.Rabbit 0.001 | 17 | 27% | 48 |
| fwb.Nine 1.0.1 | 9 | 14% | 20 |
| nz.jdc.nano.GridFu 1.0 | 4 | 6% | 30 |
| m3thos.mini.Eva01 0.5.5 | 2 | 3% | 14 |
| bayen.nut.Squirrel 1.615 | 2 | 3% | 9 |
| djdjdj.NanoSkunk10 1.0 | 1 | 2% | 6 |
| ntc.ControlledChaos 1.1.4 | 1 | 2% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 160300 melee ticks, 56153 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 39 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 50862 sent, 46174 reached their opponent, 10438 virtual hits (22.6% of those reached).

## Melee bench: F21

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 707 over 6 battles (117.8 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 91.6 | 125 / 210 | 1.75 | 20.4% | 35451 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 20.4% | 125 |
| eem.EvBot v4.6.16 | 2.0 | 16.8% | 76 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.4% | 5 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 1 |
| eld.Hmm 1.0 | 5.3 | 7.7% | 5 |
| oa.weak.BotherBot 0.1 | 6.0 | 7.2% | 0 |
| fire219.CatBot 1.0 | 7.0 | 6.2% | 0 |
| PSW.Relentless 0.1 | 7.8 | 5.7% | 0 |
| el.JumpShoot 0.2 | 8.8 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 94.3 | 29 / 35 | 6287 |
| 2 | 1 | 71.5 | 92.7 | 20 / 35 | 6150 |
| 3 | 1 | 71.2 | 91.1 | 19 / 35 | 6110 |
| 4 | 1 | 70.7 | 92.7 | 20 / 35 | 5474 |
| 5 | 1 | 71.5 | 94.0 | 21 / 35 | 5788 |
| 6 | 1 | 68.9 | 85.1 | 16 / 35 | 5642 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 143 | 59% |
| dummy.mini.Scimitar 1.01 | 25 | 92% |
| cf.RiO.RiOx 4.2.1 | 15 | 100% |
| eld.Hmm 1.0 | 5 | 40% |

Hadur died in 93 of 210 rounds, at a mean tick of 1407. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 64 | 69% | 127 |
| dummy.mini.Scimitar 1.01 | 6 | 6% | 38 |
| eld.Hmm 1.0 | 5 | 5% | 12 |
| PSW.Relentless 0.1 | 4 | 4% | 5 |
| cf.RiO.RiOx 4.2.1 | 3 | 3% | 20 |
| arthord.MannyPacquiao Beta | 2 | 2% | 2 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 4 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 179599 melee ticks, 96191 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 71 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 51704 sent, 46947 reached their opponent, 8249 virtual hits (17.6% of those reached).

## Melee bench: F22

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 195 over 6 battles (32.5 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 90.8 | 113 / 210 | 1.83 | 19.3% | 31359 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 19.3% | 113 |
| pe.SandboxDT 2.71m | 2.0 | 16.0% | 51 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.3% | 26 |
| jlm.javaDisturbance 0.59 | 4.2 | 12.7% | 14 |
| bigpete.Stewie 1.0 | 4.8 | 11.2% | 5 |
| yk.JahRoslav 1.1 | 6.5 | 7.0% | 0 |
| tad.Dalek98 0.98 | 7.2 | 6.2% | 0 |
| gg.Squaraus 0.6 | 7.5 | 6.2% | 1 |
| pbg.NinjaX 1.2 | 8.8 | 4.7% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 93.3 | 22 / 35 | 5222 |
| 2 | 1 | 70.1 | 88.3 | 18 / 35 | 5448 |
| 3 | 1 | 70.9 | 93.7 | 23 / 35 | 5261 |
| 4 | 1 | 69.4 | 90.8 | 15 / 35 | 4924 |
| 5 | 1 | 69.9 | 91.7 | 19 / 35 | 5193 |
| 6 | 1 | 69.3 | 87.0 | 16 / 35 | 5311 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 67 | 48% |
| kvk.HebusLeTroll 0.35 | 44 | 73% |
| jlm.javaDisturbance 0.59 | 42 | 83% |
| bigpete.Stewie 1.0 | 11 | 91% |
| tad.Dalek98 0.98 | 1 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |
| gg.Squaraus 0.6 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 1035. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 44 | 44% | 78 |
| kvk.HebusLeTroll 0.35 | 22 | 22% | 45 |
| jlm.javaDisturbance 0.59 | 18 | 18% | 56 |
| bigpete.Stewie 1.0 | 11 | 11% | 21 |
| yk.JahRoslav 1.1 | 2 | 2% | 3 |
| gg.Squaraus 0.6 | 1 | 1% | 2 |
| pbg.NinjaX 1.2 | 0 | 0% | 2 |
| tad.Dalek98 0.98 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 161948 melee ticks, 55041 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 58 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 51271 sent, 46500 reached their opponent, 7272 virtual hits (15.6% of those reached).

## Melee bench: F23

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 321 over 6 battles (53.5 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.7 | 96.5 | 172 / 210 | 1.31 | 22.3% | 38422 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 22.3% | 172 |
| pe.SandboxLump 1.52 | 2.0 | 15.9% | 28 |
| cre.Karolos 0.32 | 3.0 | 13.7% | 5 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.6% | 0 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 9.1% | 1 |
| stelo.RamTrackSurfer 1.2 | 6.2 | 9.0% | 3 |
| cw.megas.Blade 0.8 | 6.7 | 8.2% | 0 |
| sample.Walls 1.0 | 7.7 | 7.4% | 1 |
| cli.WasteOfAmmo 1.0 | 9.2 | 2.2% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.0 | 97.5 | 30 / 35 | 6839 |
| 2 | 1 | 72.7 | 94.0 | 27 / 35 | 6121 |
| 3 | 1 | 74.6 | 98.4 | 31 / 35 | 6615 |
| 4 | 1 | 75.0 | 99.0 | 32 / 35 | 6932 |
| 5 | 1 | 72.1 | 92.7 | 23 / 35 | 5611 |
| 6 | 1 | 73.8 | 97.5 | 29 / 35 | 6304 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 98 | 79% |
| cre.Karolos 0.32 | 65 | 97% |
| stelo.RamTrackSurfer 1.2 | 11 | 73% |
| stelo.AreaTargetingBot 1.1 | 10 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 944. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 27 | 68% | 98 |
| cre.Karolos 0.32 | 6 | 15% | 55 |
| stelo.RamTrackSurfer 1.2 | 4 | 10% | 19 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 3% | 9 |
| stelo.AreaTargetingBot 1.1 | 0 | 0% | 13 |
| sample.Walls 1.0 | 0 | 0% | 7 |
| cw.megas.Blade 0.8 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 127807 melee ticks, 56311 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 55 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 40269 sent, 35290 reached their opponent, 10592 virtual hits (30.0% of those reached).

## Melee bench: F24

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 301 over 6 battles (50.2 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 83.4 | 95 / 210 | 2.50 | 17.2% | 24765 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.2 | 17.2% | 95 |
| rz.GlowBlowMelee 1.4 | 2.7 | 13.8% | 32 |
| florent.XSeries.X2 0.12 | 3.2 | 13.1% | 31 |
| davidalves.Phoenix 0.54 | 3.7 | 12.7% | 29 |
| pedersen.Ugluk 1.1.1 | 4.3 | 11.9% | 15 |
| oog.melee.Corsair 1.0 | 6.0 | 9.4% | 5 |
| stelo.SoJNanoMelee 1.1 | 7.3 | 7.0% | 3 |
| lunchie.Lunchbox 0.93 | 7.7 | 6.0% | 0 |
| evd.X1 0.01 | 9.5 | 4.6% | 0 |
| as.FrankTheTank 1.3 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 87.9 | 22 / 35 | 4304 |
| 2 | 1 | 65.0 | 80.3 | 13 / 35 | 4032 |
| 3 | 1 | 65.9 | 82.2 | 15 / 35 | 3958 |
| 4 | 2 | 64.2 | 78.1 | 9 / 35 | 3832 |
| 5 | 1 | 67.8 | 87.0 | 19 / 35 | 4386 |
| 6 | 1 | 67.2 | 84.8 | 17 / 35 | 4253 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.Phoenix 0.54 | 36 | 72% |
| rz.GlowBlowMelee 1.4 | 35 | 54% |
| florent.XSeries.X2 0.12 | 30 | 73% |
| pedersen.Ugluk 1.1.1 | 20 | 75% |
| oog.melee.Corsair 1.0 | 8 | 63% |
| stelo.SoJNanoMelee 1.1 | 5 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 33 | 28% | 62 |
| rz.GlowBlowMelee 1.4 | 27 | 23% | 48 |
| davidalves.Phoenix 0.54 | 22 | 19% | 36 |
| pedersen.Ugluk 1.1.1 | 21 | 18% | 37 |
| oog.melee.Corsair 1.0 | 8 | 7% | 17 |
| lunchie.Lunchbox 0.93 | 2 | 2% | 3 |
| stelo.SoJNanoMelee 1.1 | 1 | 1% | 3 |
| evd.X1 0.01 | 1 | 1% | 3 |
| as.FrankTheTank 1.3 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 134597 melee ticks, 39410 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 72 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 4.

Targeting waves (204 rounds): 45171 sent, 40132 reached their opponent, 7506 virtual hits (18.7% of those reached).

## Melee bench: F25

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 306 over 6 battles (51.0 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 89.5 | 143 / 210 | 1.95 | 19.1% | 25223 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 19.1% | 143 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.8% | 18 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 13.1% | 18 |
| jdw.Hurricane 1.4 | 4.0 | 11.3% | 19 |
| ds.Oo 2.2 | 5.2 | 9.8% | 8 |
| gre.svman4.Morfeas 1.4.1 | 5.8 | 9.3% | 4 |
| awesomeness.Elite 1.0 | 7.3 | 7.1% | 0 |
| adt.Ar2 1.1 | 8.3 | 6.1% | 0 |
| gjr.Cephalosporin 0.1 | 8.3 | 6.0% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 92.1 | 28 / 35 | 4460 |
| 2 | 1 | 68.2 | 88.9 | 21 / 35 | 4113 |
| 3 | 1 | 68.8 | 88.6 | 23 / 35 | 4239 |
| 4 | 1 | 68.9 | 87.9 | 24 / 35 | 4217 |
| 5 | 1 | 68.3 | 88.6 | 22 / 35 | 4091 |
| 6 | 1 | 69.0 | 90.8 | 25 / 35 | 4103 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 59 | 88% |
| voidious.micro.BlitzBat 1.05 | 42 | 93% |
| jdw.Hurricane 1.4 | 27 | 74% |
| ds.Oo 2.2 | 20 | 75% |
| gre.svman4.Morfeas 1.4.1 | 7 | 86% |
| awesomeness.Elite 1.0 | 6 | 100% |
| gjr.Cephalosporin 0.1 | 2 | 100% |
| adt.Ar2 1.1 | 2 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 674. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 18 | 25% | 53 |
| jdw.Hurricane 1.4 | 18 | 25% | 40 |
| voidious.micro.BlitzBat 1.05 | 11 | 15% | 42 |
| ds.Oo 2.2 | 10 | 14% | 32 |
| gre.svman4.Morfeas 1.4.1 | 5 | 7% | 22 |
| awesomeness.Elite 1.0 | 3 | 4% | 12 |
| adt.Ar2 1.1 | 1 | 1% | 4 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 3 |
| amk.ChumbaMini 0.2 | 1 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 128871 melee ticks, 33224 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 41 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 2.

Targeting waves (208 rounds): 45925 sent, 41084 reached their opponent, 6796 virtual hits (16.5% of those reached).

## Melee bench: F26

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 654 over 6 battles (109.0 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 92.9 | 157 / 210 | 1.64 | 21.3% | 39685 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 21.3% | 157 |
| ak.Fermat 2.0 | 2.2 | 14.6% | 26 |
| lrem.Spectre 0.4.4 | 3.5 | 12.1% | 5 |
| shu.nitro.LENIN .T34 | 3.5 | 12.4% | 14 |
| js.PinBall 1.6 | 4.8 | 10.7% | 6 |
| jaybot.adv.bots.JayBot 2.0 | 6.2 | 9.5% | 0 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 7.9% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 6.7% | 2 |
| sample.SpinBot 1.0 | 9.0 | 3.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 94.9 | 27 / 35 | 6587 |
| 2 | 1 | 72.6 | 92.1 | 27 / 35 | 6617 |
| 3 | 1 | 70.5 | 87.6 | 20 / 35 | 6219 |
| 4 | 1 | 72.0 | 91.7 | 26 / 35 | 6599 |
| 5 | 1 | 73.5 | 96.2 | 29 / 35 | 6803 |
| 6 | 1 | 73.1 | 94.6 | 28 / 35 | 6860 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 70 | 84% |
| shu.nitro.LENIN .T34 | 57 | 93% |
| lrem.Spectre 0.4.4 | 31 | 94% |
| jaybot.adv.bots.JayBot 2.0 | 9 | 100% |
| js.PinBall 1.6 | 9 | 56% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 33% |
| gh.mini.GrubbmOne 1.0 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 944. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 18 | 31% | 68 |
| lrem.Spectre 0.4.4 | 10 | 17% | 35 |
| shu.nitro.LENIN .T34 | 9 | 16% | 64 |
| js.PinBall 1.6 | 8 | 14% | 18 |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 9% | 9 |
| jaybot.adv.bots.JayBot 2.0 | 2 | 3% | 12 |
| gh.mini.GrubbmOne 1.0 | 1 | 2% | 4 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 158095 melee ticks, 50546 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 40 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 51083 sent, 46326 reached their opponent, 11182 virtual hits (24.1% of those reached).

## Melee bench: F27

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 74 over 6 battles (12.3 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 95.9 | 177 / 210 | 1.37 | 21.4% | 32593 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 21.4% | 177 |
| mk.Alpha 0.2.1 | 2.3 | 13.3% | 18 |
| EH.Eagle 1.0.6 | 2.7 | 10.8% | 3 |
| wee.Gem 1.8.4 | 5.7 | 8.7% | 3 |
| techdude.kombat.FlamingKombat 1.5 | 5.7 | 8.9% | 2 |
| throxbot.ThroxBot 0.1 | 6.0 | 8.7% | 1 |
| sheldor.melee.nano.TestMelee 0.1 | 6.5 | 8.6% | 5 |
| joe.ADinosaur 1.0 | 7.2 | 8.4% | 1 |
| caimano.Furia_Ceca 0.22 | 8.0 | 7.3% | 1 |
| cs.Grudge 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 98.1 | 34 / 35 | 5762 |
| 2 | 1 | 70.0 | 92.4 | 26 / 35 | 4958 |
| 3 | 1 | 70.9 | 94.6 | 27 / 35 | 5255 |
| 4 | 1 | 71.8 | 95.9 | 29 / 35 | 5784 |
| 5 | 1 | 71.4 | 96.5 | 30 / 35 | 5148 |
| 6 | 1 | 72.1 | 98.1 | 31 / 35 | 5686 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 105 | 90% |
| EH.Eagle 1.0.6 | 43 | 95% |
| throxbot.ThroxBot 0.1 | 16 | 94% |
| sheldor.melee.nano.TestMelee 0.1 | 8 | 88% |
| techdude.kombat.FlamingKombat 1.5 | 7 | 100% |
| wee.Gem 1.8.4 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 5 | 80% |
| joe.ADinosaur 1.0 | 3 | 100% |

Hadur died in 33 of 210 rounds, at a mean tick of 764. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 14 | 42% | 84 |
| sheldor.melee.nano.TestMelee 0.1 | 5 | 15% | 20 |
| joe.ADinosaur 1.0 | 4 | 12% | 8 |
| techdude.kombat.FlamingKombat 1.5 | 3 | 9% | 16 |
| caimano.Furia_Ceca 0.22 | 3 | 9% | 9 |
| EH.Eagle 1.0.6 | 2 | 6% | 40 |
| throxbot.ThroxBot 0.1 | 1 | 3% | 17 |
| wee.Gem 1.8.4 | 1 | 3% | 15 |

Posture (Hadur's M records, 202 rounds): 128975 melee ticks, 47599 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 41 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 42888 sent, 38019 reached their opponent, 8980 virtual hits (23.6% of those reached).

## Melee bench: F28

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 505 over 6 battles (84.2 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 89.4 | 136 / 210 | 1.95 | 18.7% | 24844 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 18.7% | 136 |
| kid.test.NightFox .2 | 2.0 | 13.9% | 29 |
| uji.Antique 1.0 | 3.3 | 12.5% | 22 |
| pfvicm.Sobieski 7.2.3b | 4.2 | 11.0% | 7 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.7% | 9 |
| ahr.ice.Ice 1.0.2 | 6.5 | 8.2% | 4 |
| amk.ChumbaWumba 0.3 | 6.7 | 7.8% | 2 |
| matt.advanced.Katana 1.0 | 8.5 | 6.0% | 1 |
| stelo.Lifestealer 1.0 | 9.0 | 5.8% | 0 |
| stelo.PianistNano 1.2 | 9.3 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 85.1 | 22 / 35 | 4003 |
| 2 | 1 | 70.5 | 96.8 | 28 / 35 | 4290 |
| 3 | 1 | 67.3 | 90.2 | 19 / 35 | 3973 |
| 4 | 1 | 67.5 | 87.3 | 21 / 35 | 4122 |
| 5 | 1 | 69.4 | 91.1 | 27 / 35 | 4381 |
| 6 | 1 | 67.6 | 86.0 | 19 / 35 | 4075 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| uji.Antique 1.0 | 59 | 92% |
| kid.test.NightFox .2 | 54 | 76% |
| qohnil.blot.BlotBot 3.61 | 21 | 81% |
| pfvicm.Sobieski 7.2.3b | 9 | 78% |
| amk.ChumbaWumba 0.3 | 8 | 88% |
| ahr.ice.Ice 1.0.2 | 7 | 71% |
| matt.advanced.Katana 1.0 | 4 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 27 | 35% | 47 |
| pfvicm.Sobieski 7.2.3b | 17 | 22% | 27 |
| uji.Antique 1.0 | 11 | 14% | 61 |
| qohnil.blot.BlotBot 3.61 | 8 | 10% | 33 |
| ahr.ice.Ice 1.0.2 | 5 | 6% | 12 |
| amk.ChumbaWumba 0.3 | 3 | 4% | 14 |
| stelo.Lifestealer 1.0 | 2 | 3% | 4 |
| stelo.PianistNano 1.2 | 1 | 1% | 5 |
| matt.advanced.Katana 1.0 | 0 | 0% | 6 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 132256 melee ticks, 38495 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 74 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 74 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 44509 sent, 39545 reached their opponent, 5662 virtual hits (14.3% of those reached).

## Melee bench: F29

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 559 over 6 battles (93.2 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 90.6 | 118 / 210 | 1.84 | 20.0% | 30862 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 20.0% | 118 |
| deewiant.Anomaly 0.2 | 2.0 | 15.2% | 45 |
| zyx.mega.YersiniaPestis 3.1 | 3.2 | 14.2% | 33 |
| myl.micro.Troodon 1.10 | 3.8 | 12.3% | 7 |
| jok.PheonixM 0.1.2 | 5.0 | 10.4% | 5 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.1% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.5 | 5.4% | 0 |
| DBall.Anarchy 0.1 | 7.7 | 5.8% | 2 |
| ap.Frederick 1.1 | 9.2 | 4.5% | 0 |
| jangs.ns51 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 88.6 | 16 / 35 | 5138 |
| 2 | 1 | 71.1 | 94.3 | 23 / 35 | 4988 |
| 3 | 1 | 70.9 | 91.4 | 24 / 35 | 4995 |
| 4 | 1 | 69.9 | 88.3 | 15 / 35 | 5156 |
| 5 | 1 | 70.7 | 90.2 | 21 / 35 | 5235 |
| 6 | 1 | 70.9 | 91.1 | 19 / 35 | 5350 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 85 | 62% |
| zyx.mega.YersiniaPestis 3.1 | 47 | 66% |
| myl.micro.Troodon 1.10 | 23 | 96% |
| jok.PheonixM 0.1.2 | 7 | 71% |
| ph.melee.ArcherME 0.3 | 3 | 100% |
| jangs.ns51 1.0 | 3 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 1077. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 50 | 52% | 101 |
| zyx.mega.YersiniaPestis 3.1 | 25 | 26% | 62 |
| myl.micro.Troodon 1.10 | 6 | 6% | 20 |
| jok.PheonixM 0.1.2 | 5 | 5% | 14 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 6 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 2% | 2 |
| DBall.Anarchy 0.1 | 1 | 1% | 3 |
| jangs.ns51 1.0 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 170214 melee ticks, 65380 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 32 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 54982 sent, 50218 reached their opponent, 7781 virtual hits (15.5% of those reached).

## Melee bench: F30

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 746 over 6 battles (124.3 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 78.5 | 57 / 210 | 2.94 | 15.9% | 24971 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.2 | 15.9% | 57 |
| catcat20.Matcha 0.006 | 2.2 | 14.2% | 51 |
| darkcanuck.B26354 1.06 | 3.3 | 13.3% | 40 |
| stelo.PastFuture 2.3.2 | 4.2 | 12.4% | 26 |
| oog.melee.Capulet 1.2 | 4.2 | 12.2% | 27 |
| intruder.PrairieWolf 2.61 | 6.2 | 8.6% | 4 |
| ntc.Opposite 1.5 | 7.5 | 7.5% | 0 |
| tripphippy.Alice 1.1 | 8.0 | 6.9% | 4 |
| fowl3628800.LightningBolt 2.6.0 | 8.3 | 6.4% | 1 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 83.5 | 14 / 35 | 4219 |
| 2 | 1 | 63.5 | 76.2 | 6 / 35 | 4140 |
| 3 | 1 | 64.8 | 81.9 | 10 / 35 | 3962 |
| 4 | 1 | 66.1 | 80.3 | 12 / 35 | 4604 |
| 5 | 2 | 64.1 | 76.5 | 7 / 35 | 4094 |
| 6 | 1 | 62.5 | 72.4 | 8 / 35 | 3952 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 31 | 29% |
| oog.melee.Capulet 1.2 | 25 | 52% |
| darkcanuck.B26354 1.06 | 24 | 42% |
| stelo.PastFuture 2.3.2 | 23 | 52% |
| intruder.PrairieWolf 2.61 | 8 | 75% |
| tripphippy.Alice 1.1 | 7 | 57% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 38 | 24% | 47 |
| catcat20.Matcha 0.006 | 33 | 21% | 44 |
| stelo.PastFuture 2.3.2 | 28 | 18% | 38 |
| oog.melee.Capulet 1.2 | 27 | 17% | 43 |
| intruder.PrairieWolf 2.61 | 7 | 4% | 12 |
| tripphippy.Alice 1.1 | 7 | 4% | 11 |
| ntc.Opposite 1.5 | 7 | 4% | 7 |
| fowl3628800.LightningBolt 2.6.0 | 6 | 4% | 8 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 158973 melee ticks, 35415 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 89 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 89 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 51597 sent, 46625 reached their opponent, 7991 virtual hits (17.1% of those reached).

## Melee bench: F31

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 402 over 6 battles (67.0 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 82.0 | 75 / 210 | 2.62 | 16.8% | 24242 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.5 | 17.3% | 77 |
| hadur117.Hadur 3.20bb | 1.5 | 16.8% | 75 |
| gh.mini.Griezel 0.2 | 3.2 | 13.5% | 41 |
| d414.nano.Quantum 1.0.0 | 4.0 | 11.5% | 6 |
| spinnercat.micro.Tyger 0.1 | 5.0 | 10.7% | 9 |
| gh.nano.Grofvuil 0.2 | 5.8 | 8.8% | 2 |
| timmit.nano.TimDog 0.33 | 7.0 | 6.6% | 2 |
| fm.mammillarias 1.3 | 8.7 | 5.3% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.8 | 5.1% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 77.8 | 10 / 35 | 4043 |
| 2 | 1 | 66.6 | 82.2 | 15 / 35 | 4204 |
| 3 | 1 | 67.2 | 85.7 | 18 / 35 | 3878 |
| 4 | 2 | 64.5 | 78.4 | 7 / 35 | 3750 |
| 5 | 1 | 66.1 | 82.9 | 13 / 35 | 4109 |
| 6 | 2 | 66.9 | 84.8 | 12 / 35 | 4258 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 69 | 46% |
| gh.mini.Griezel 0.2 | 42 | 60% |
| d414.nano.Quantum 1.0.0 | 8 | 88% |
| spinnercat.micro.Tyger 0.1 | 7 | 71% |
| timmit.nano.TimDog 0.33 | 3 | 67% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 913. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 60 | 43% | 94 |
| gh.mini.Griezel 0.2 | 36 | 26% | 61 |
| d414.nano.Quantum 1.0.0 | 18 | 13% | 26 |
| spinnercat.micro.Tyger 0.1 | 8 | 6% | 13 |
| gh.nano.Grofvuil 0.2 | 5 | 4% | 8 |
| fm.mammillarias 1.3 | 3 | 2% | 3 |
| timmit.nano.TimDog 0.33 | 2 | 1% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 156526 melee ticks, 44751 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 31 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 49531 sent, 44668 reached their opponent, 7029 virtual hits (15.7% of those reached).

## Melee bench: F32

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 232 over 6 battles (38.7 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 91.2 | 134 / 210 | 1.79 | 19.1% | 27993 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 19.1% | 134 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.4% | 36 |
| apc.botM 3.0 | 3.2 | 12.1% | 20 |
| lxx.ConceptA 0.8 | 5.0 | 10.2% | 3 |
| bayen.UbaMicro 1.4 | 5.0 | 9.8% | 5 |
| vjik.UnViolation 1.1 | 5.2 | 10.0% | 10 |
| yk.JahMicro 1.0 | 7.8 | 6.5% | 2 |
| panzer.Panzer 0.2 | 7.8 | 6.9% | 0 |
| conscience.Electron 1.3g | 8.0 | 6.4% | 0 |
| donjezza.Jezza 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 85.1 | 18 / 35 | 4500 |
| 2 | 1 | 67.9 | 87.3 | 20 / 35 | 4638 |
| 3 | 1 | 69.6 | 94.0 | 23 / 35 | 4835 |
| 4 | 1 | 69.2 | 93.0 | 26 / 35 | 4615 |
| 5 | 1 | 69.5 | 94.0 | 23 / 35 | 4747 |
| 6 | 1 | 70.0 | 94.0 | 24 / 35 | 4658 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 86 | 70% |
| apc.botM 3.0 | 33 | 79% |
| vjik.UnViolation 1.1 | 19 | 79% |
| bayen.UbaMicro 1.4 | 15 | 67% |
| lxx.ConceptA 0.8 | 15 | 93% |
| yk.JahMicro 1.0 | 9 | 89% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 29 | 38% | 88 |
| lxx.ConceptA 0.8 | 13 | 17% | 23 |
| apc.botM 3.0 | 12 | 16% | 37 |
| bayen.UbaMicro 1.4 | 10 | 13% | 19 |
| vjik.UnViolation 1.1 | 7 | 9% | 25 |
| yk.JahMicro 1.0 | 2 | 3% | 8 |
| conscience.Electron 1.3g | 2 | 3% | 6 |
| panzer.Panzer 0.2 | 1 | 1% | 2 |
| donjezza.Jezza 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 123244 melee ticks, 56565 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 38 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 42201 sent, 37289 reached their opponent, 6703 virtual hits (18.0% of those reached).

## Melee bench: F33

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 534 over 6 battles (89.0 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 88.9 | 131 / 210 | 2.00 | 19.6% | 30621 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 19.6% | 131 |
| maribo.Quester 0.3 | 2.0 | 16.3% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.6% | 17 |
| gre.svman4.Leonidas 1.3.2 | 4.7 | 10.5% | 13 |
| labg.Cataclysm 2.05 | 4.8 | 10.3% | 10 |
| baal.nano.N 1.42 | 6.2 | 8.6% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.3 | 8.7% | 2 |
| zyx.micro.Ant 1.1 | 8.2 | 5.8% | 1 |
| sanja.First 0.1 | 8.8 | 4.5% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 88.6 | 18 / 35 | 4732 |
| 2 | 1 | 70.2 | 89.5 | 24 / 35 | 5051 |
| 3 | 1 | 69.0 | 84.1 | 20 / 35 | 4935 |
| 4 | 1 | 70.2 | 88.3 | 23 / 35 | 5352 |
| 5 | 1 | 70.4 | 90.5 | 22 / 35 | 5312 |
| 6 | 1 | 71.1 | 92.7 | 24 / 35 | 5239 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 74 | 74% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 47 | 85% |
| gre.svman4.Leonidas 1.3.2 | 19 | 79% |
| labg.Cataclysm 2.05 | 10 | 90% |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 100% |
| zyx.micro.Ant 1.1 | 3 | 100% |
| baal.nano.N 1.42 | 2 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 981. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 32 | 39% | 83 |
| gre.svman4.Leonidas 1.3.2 | 17 | 20% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 19% | 57 |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 6% | 12 |
| labg.Cataclysm 2.05 | 3 | 4% | 16 |
| baal.nano.N 1.42 | 3 | 4% | 6 |
| zyx.micro.Ant 1.1 | 2 | 2% | 3 |
| sanja.First 0.1 | 1 | 1% | 5 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 166228 melee ticks, 58395 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 54 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 53769 sent, 48901 reached their opponent, 7201 virtual hits (14.7% of those reached).

## Melee bench: F34

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 738 over 6 battles (123.0 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 89.5 | 97 / 210 | 1.94 | 19.2% | 33447 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 19.2% | 97 |
| kid.Gladiator .7.2 | 2.3 | 16.4% | 36 |
| stelo.Spread 0.9 | 2.7 | 16.1% | 56 |
| jcs.Seth 1.8 | 4.0 | 11.2% | 14 |
| tcf.Reach 3 | 5.3 | 9.7% | 5 |
| cli.Dancer 1.1 | 5.7 | 9.5% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.2% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.9% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.1% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 89.2 | 18 / 35 | 5899 |
| 2 | 1 | 69.6 | 88.3 | 18 / 35 | 5155 |
| 3 | 1 | 70.7 | 91.7 | 17 / 35 | 5641 |
| 4 | 1 | 70.8 | 91.4 | 16 / 35 | 5912 |
| 5 | 1 | 68.8 | 85.4 | 13 / 35 | 5226 |
| 6 | 1 | 70.2 | 91.1 | 15 / 35 | 5614 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 71 | 56% |
| kid.Gladiator .7.2 | 62 | 61% |
| jcs.Seth 1.8 | 21 | 57% |
| tcf.Reach 3 | 5 | 80% |
| ratosh.Wesco 1.4 | 2 | 50% |
| cli.Dancer 1.1 | 2 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 1141. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 43 | 36% | 86 |
| kid.Gladiator .7.2 | 41 | 34% | 69 |
| jcs.Seth 1.8 | 14 | 12% | 29 |
| tcf.Reach 3 | 9 | 8% | 15 |
| cli.Dancer 1.1 | 4 | 3% | 6 |
| ratosh.Wesco 1.4 | 1 | 1% | 4 |
| sample.RamFire 1.0 | 1 | 1% | 0 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 173914 melee ticks, 63718 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 35 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 53095 sent, 48313 reached their opponent, 8151 virtual hits (16.9% of those reached).

## Melee bench: F35

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 500 over 6 battles (83.3 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 83.2 | 45 / 210 | 2.51 | 16.3% | 23426 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.5% | 139 |
| hadur117.Hadur 3.20bb | 2.0 | 16.3% | 45 |
| gh.mini.Gruwel 0.9 | 3.3 | 12.8% | 14 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.2 | 12.3% | 10 |
| rz.HawkOnFire 0.1 | 4.5 | 11.1% | 3 |
| myl.nano.KomoriNinja 1.1 | 6.7 | 6.0% | 0 |
| wit.Chuliath 1.0 | 6.8 | 6.7% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.2 | 5.4% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.0% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 81.6 | 7 / 35 | 3904 |
| 2 | 2 | 67.2 | 87.3 | 11 / 35 | 4169 |
| 3 | 2 | 64.3 | 81.0 | 6 / 35 | 3599 |
| 4 | 2 | 64.9 | 81.9 | 3 / 35 | 3851 |
| 5 | 2 | 66.0 | 84.8 | 10 / 35 | 3777 |
| 6 | 2 | 65.8 | 82.9 | 8 / 35 | 4126 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 106 | 24% |
| gh.mini.Gruwel 0.9 | 18 | 56% |
| dmh.robocode.robot.BlackDeath 9.2 | 11 | 73% |
| rz.HawkOnFire 0.1 | 3 | 67% |

Hadur died in 170 of 210 rounds, at a mean tick of 995. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 99 | 58% | 119 |
| gh.mini.Gruwel 0.9 | 23 | 14% | 34 |
| dmh.robocode.robot.BlackDeath 9.2 | 18 | 11% | 26 |
| rz.HawkOnFire 0.1 | 14 | 8% | 16 |
| wit.Chuliath 1.0 | 4 | 2% | 6 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 2% | 4 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 3 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 146229 melee ticks, 60607 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 519 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 293 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 45570 sent, 40610 reached their opponent, 6412 virtual hits (15.8% of those reached).

## Melee bench: F36

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 433 over 6 battles (72.2 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 94.0 | 162 / 210 | 1.54 | 21.2% | 33166 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 21.2% | 162 |
| alpha.RainingFire 1.0 | 2.7 | 12.3% | 16 |
| bzdp.Pansy 2.1 | 3.3 | 11.8% | 10 |
| mz.Cork 0.1 | 3.5 | 11.0% | 9 |
| bvh.micro.Freya 0.3 | 4.8 | 10.3% | 9 |
| bvh.mini.Fenrir 0.39 | 6.0 | 9.7% | 1 |
| m3thos.Eva02 0.7.1 | 6.7 | 9.3% | 2 |
| dl.BetterWalls 1.0 | 8.7 | 5.3% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 5.5% | 0 |
| sample.MyFirstRobot 1.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 92.4 | 25 / 35 | 5201 |
| 2 | 1 | 71.5 | 94.3 | 26 / 35 | 5451 |
| 3 | 1 | 72.6 | 95.9 | 29 / 35 | 6095 |
| 4 | 1 | 71.3 | 93.0 | 29 / 35 | 5341 |
| 5 | 1 | 71.0 | 92.4 | 26 / 35 | 5401 |
| 6 | 1 | 72.1 | 95.9 | 27 / 35 | 5677 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| alpha.RainingFire 1.0 | 42 | 79% |
| bzdp.Pansy 2.1 | 38 | 89% |
| mz.Cork 0.1 | 37 | 84% |
| bvh.micro.Freya 0.3 | 30 | 90% |
| m3thos.Eva02 0.7.1 | 19 | 100% |
| bvh.mini.Fenrir 0.39 | 13 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |
| sample.MyFirstRobot 1.0 | 2 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 17 | 33% | 45 |
| mz.Cork 0.1 | 11 | 22% | 45 |
| bzdp.Pansy 2.1 | 8 | 16% | 38 |
| bvh.micro.Freya 0.3 | 6 | 12% | 34 |
| bvh.mini.Fenrir 0.39 | 4 | 8% | 14 |
| m3thos.Eva02 0.7.1 | 1 | 2% | 21 |
| dl.BetterWalls 1.0 | 1 | 2% | 7 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 2 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 144392 melee ticks, 47094 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 59 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 49950 sent, 45142 reached their opponent, 9183 virtual hits (20.3% of those reached).

## Melee bench: F37

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 312 over 6 battles (52.0 per battle, most in one battle 108). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 89.1 | 164 / 210 | 1.98 | 19.5% | 33766 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 19.5% | 164 |
| germ.TheMind .2 | 3.0 | 10.5% | 10 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.5 | 10.2% | 4 |
| EBBU.Sim2 1.02 | 4.5 | 9.6% | 1 |
| agrach.Dalek 1.0 | 5.2 | 9.5% | 10 |
| stelo.UntouchableNano 1.3 | 5.7 | 9.0% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 6.8 | 8.8% | 1 |
| mb.Beast 0.1 | 7.8 | 8.1% | 7 |
| lmk.ACPFinal 0.1 | 7.8 | 8.3% | 3 |
| skm.Ryubot 1.0 | 9.7 | 6.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 87.6 | 25 / 35 | 5375 |
| 2 | 1 | 69.3 | 91.4 | 28 / 35 | 5758 |
| 3 | 1 | 69.0 | 88.3 | 28 / 35 | 5832 |
| 4 | 1 | 67.5 | 86.7 | 26 / 35 | 5356 |
| 5 | 1 | 71.7 | 99.0 | 33 / 35 | 6085 |
| 6 | 1 | 66.2 | 81.6 | 24 / 35 | 5360 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 31 | 94% |
| stelo.UntouchableNano 1.3 | 29 | 86% |
| agrach.Dalek 1.0 | 29 | 90% |
| mb.Beast 0.1 | 21 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 21 | 100% |
| EBBU.Sim2 1.02 | 18 | 100% |
| lmk.ACPFinal 0.1 | 16 | 88% |
| skm.Ryubot 1.0 | 9 | 89% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 452. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 16 | 33% | 18 |
| agrach.Dalek 1.0 | 9 | 19% | 44 |
| stelo.UntouchableNano 1.3 | 5 | 10% | 28 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4 | 8% | 33 |
| lmk.ACPFinal 0.1 | 4 | 8% | 23 |
| germ.TheMind .2 | 3 | 6% | 20 |
| EBBU.Sim2 1.02 | 2 | 4% | 19 |
| mb.Beast 0.1 | 2 | 4% | 18 |
| skm.Ryubot 1.0 | 1 | 2% | 5 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 97744 melee ticks, 28622 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 67 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 67 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 32275 sent, 27757 reached their opponent, 8096 virtual hits (29.2% of those reached).

## Melee bench: F38

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 389 over 6 battles (64.8 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 84.7 | 107 / 210 | 2.38 | 17.9% | 27948 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 17.9% | 107 |
| justin.Mallais 14.0 | 2.0 | 15.7% | 54 |
| bvh.mini.Freya 0.55 | 3.3 | 12.9% | 19 |
| bts.mega.Gnarly 1.4 | 4.2 | 11.4% | 18 |
| cs.Wren 1.0 | 5.2 | 10.2% | 5 |
| kdf.KoulDestroyer 1.0 | 5.7 | 9.4% | 3 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.8 | 8.1% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.6% | 3 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.1% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 89.8 | 25 / 35 | 5003 |
| 2 | 1 | 66.6 | 82.5 | 15 / 35 | 4296 |
| 3 | 1 | 65.9 | 79.4 | 16 / 35 | 4641 |
| 4 | 1 | 67.3 | 84.4 | 19 / 35 | 4528 |
| 5 | 1 | 68.6 | 87.6 | 18 / 35 | 4793 |
| 6 | 1 | 67.1 | 84.1 | 14 / 35 | 4687 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 57 | 68% |
| bts.mega.Gnarly 1.4 | 25 | 76% |
| bvh.mini.Freya 0.55 | 21 | 76% |
| cs.Wren 1.0 | 13 | 77% |
| kdf.KoulDestroyer 1.0 | 10 | 90% |
| kawigi.spare.SpareParts 0.7.6nosnd | 8 | 75% |
| davidalves.net.DuelistNanoMelee 1.01 | 6 | 100% |
| matt.UnderDark3 2.4.34 | 2 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 33 | 31% | 83 |
| bvh.mini.Freya 0.55 | 25 | 23% | 32 |
| kdf.KoulDestroyer 1.0 | 15 | 14% | 25 |
| bts.mega.Gnarly 1.4 | 12 | 11% | 28 |
| cs.Wren 1.0 | 10 | 9% | 16 |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 4% | 9 |
| davidalves.net.DuelistNanoMelee 1.01 | 2 | 2% | 13 |
| matt.UnderDark3 2.4.34 | 2 | 2% | 3 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 139618 melee ticks, 42571 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 39 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 45861 sent, 40634 reached their opponent, 8553 virtual hits (21.0% of those reached).

## Melee bench: F39

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 436 over 6 battles (72.7 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 88.8 | 115 / 210 | 2.01 | 19.2% | 32271 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 19.2% | 115 |
| bvh.fry.Freya 0.82 | 2.0 | 14.5% | 18 |
| catcat20.Lambda 0.024 | 3.3 | 12.1% | 28 |
| az.Ololobot 0.2.4 | 3.7 | 12.1% | 45 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 8.6% | 2 |
| stelo.SoRobotNanoMelee 1.2 | 6.5 | 8.1% | 2 |
| gimp.GimpBot 0.1 | 7.0 | 7.7% | 0 |
| apollokidd.ApolloKidd 0.9 | 7.2 | 7.6% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.4% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 91.4 | 21 / 35 | 5831 |
| 2 | 1 | 68.0 | 85.4 | 15 / 35 | 5423 |
| 3 | 1 | 68.8 | 88.6 | 21 / 35 | 5176 |
| 4 | 1 | 69.0 | 87.9 | 19 / 35 | 5665 |
| 5 | 1 | 68.4 | 88.3 | 20 / 35 | 4994 |
| 6 | 1 | 69.5 | 91.1 | 19 / 35 | 5182 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 51 | 53% |
| bvh.fry.Freya 0.82 | 51 | 82% |
| catcat20.Lambda 0.024 | 45 | 64% |
| stelo.SoRobotNanoMelee 1.2 | 6 | 100% |
| winamp32.micro.MicroMacro 1.0 | 6 | 100% |
| gimp.GimpBot 0.1 | 4 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 1050. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 34 | 34% | 67 |
| bvh.fry.Freya 0.82 | 27 | 27% | 56 |
| catcat20.Lambda 0.024 | 24 | 24% | 47 |
| gimp.GimpBot 0.1 | 5 | 5% | 15 |
| apollokidd.ApolloKidd 0.9 | 3 | 3% | 5 |
| stelo.SoRobotNanoMelee 1.2 | 2 | 2% | 8 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 4 |
| winamp32.micro.MicroMacro 1.0 | 0 | 0% | 6 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 161646 melee ticks, 62442 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 81 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 81 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 51899 sent, 47037 reached their opponent, 8658 virtual hits (18.4% of those reached).

## Melee bench: F40

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 226 over 6 battles (37.7 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 92.5 | 153 / 210 | 1.67 | 21.0% | 33752 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 21.0% | 153 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.2% | 23 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.3% | 15 |
| mz.AntiGrav 1.0 | 4.0 | 11.4% | 2 |
| Polkwane.SmashMelee 1.0 | 4.8 | 10.7% | 5 |
| stelo.Randomness 1.0 | 6.3 | 8.9% | 10 |
| alpha.BlackIce 1.0 | 6.7 | 8.2% | 2 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.4% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 3.7% | 0 |
| sample.Corners 1.0 | 9.8 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 93.3 | 25 / 35 | 5818 |
| 2 | 1 | 71.5 | 92.7 | 26 / 35 | 5458 |
| 3 | 1 | 70.9 | 90.8 | 24 / 35 | 5439 |
| 4 | 1 | 71.7 | 91.7 | 23 / 35 | 5726 |
| 5 | 1 | 72.5 | 96.2 | 29 / 35 | 5648 |
| 6 | 1 | 71.6 | 90.5 | 26 / 35 | 5663 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 63 | 83% |
| kano.gamma.KanoGamma 1.8 | 50 | 90% |
| mz.AntiGrav 1.0 | 30 | 100% |
| Polkwane.SmashMelee 1.0 | 19 | 95% |
| stelo.Randomness 1.0 | 6 | 67% |
| alpha.BlackIce 1.0 | 3 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 872. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 17 | 29% | 59 |
| kano.gamma.KanoGamma 1.8 | 15 | 26% | 58 |
| stelo.Randomness 1.0 | 10 | 17% | 25 |
| alpha.BlackIce 1.0 | 6 | 10% | 11 |
| mz.AntiGrav 1.0 | 4 | 7% | 28 |
| Polkwane.SmashMelee 1.0 | 4 | 7% | 23 |
| amk.superstrike.SuperStrike 0.3 | 1 | 2% | 3 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 2 |
| sample.Corners 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 154945 melee ticks, 46319 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 105 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 105 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 49848 sent, 45048 reached their opponent, 8869 virtual hits (19.7% of those reached).

## Melee bench: F41

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 607 over 6 battles (101.2 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 89.0 | 110 / 210 | 1.99 | 18.8% | 28439 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 18.8% | 110 |
| eem.EvBotNG v12.8 | 2.0 | 16.0% | 71 |
| ary.Swarm 1.1 | 3.3 | 13.0% | 10 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.7% | 13 |
| simonton.nano.MeleeSeed 1.8 | 5.2 | 10.6% | 5 |
| shrub.Silver v048 | 5.8 | 8.9% | 1 |
| zyx.nano.Ant 1.1 | 7.0 | 7.2% | 0 |
| stelo.Mirror 1.1 | 8.3 | 5.5% | 1 |
| jsal.Jsalbot 1.0 | 8.7 | 5.3% | 0 |
| acogdev.alpha 0.2 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 92.7 | 21 / 35 | 5006 |
| 2 | 1 | 68.5 | 85.1 | 16 / 35 | 4725 |
| 3 | 1 | 70.4 | 91.4 | 21 / 35 | 4802 |
| 4 | 1 | 69.6 | 91.1 | 19 / 35 | 4740 |
| 5 | 1 | 69.2 | 90.8 | 20 / 35 | 4614 |
| 6 | 1 | 67.2 | 82.9 | 13 / 35 | 4552 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 75 | 45% |
| ary.Swarm 1.1 | 37 | 92% |
| lessonz.robocode.Oz 0.5.0 | 26 | 85% |
| simonton.nano.MeleeSeed 1.8 | 13 | 92% |
| shrub.Silver v048 | 5 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| stelo.Mirror 1.1 | 1 | 0% |

Hadur died in 106 of 210 rounds, at a mean tick of 982. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 56 | 53% | 90 |
| lessonz.robocode.Oz 0.5.0 | 16 | 15% | 36 |
| ary.Swarm 1.1 | 12 | 11% | 36 |
| simonton.nano.MeleeSeed 1.8 | 10 | 9% | 25 |
| shrub.Silver v048 | 2 | 2% | 12 |
| jsal.Jsalbot 1.0 | 1 | 1% | 3 |
| zyx.nano.Ant 1.1 | 1 | 1% | 3 |
| stelo.Mirror 1.1 | 1 | 1% | 3 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 155068 melee ticks, 48882 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 71 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 50686 sent, 45863 reached their opponent, 7173 virtual hits (15.6% of those reached).

## Melee bench: F42

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 427 over 6 battles (71.2 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 94.3 | 159 / 210 | 1.51 | 21.2% | 37054 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 21.2% | 159 |
| wompi.Wallaby 5.1 | 2.0 | 14.9% | 26 |
| ara.Shera 0.88 | 3.5 | 12.9% | 16 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.0% | 7 |
| amz.NanoClone 1.41 | 5.0 | 8.7% | 1 |
| dsw.StaticD 1.0 | 6.8 | 6.8% | 1 |
| maribo.IotaCT 1.1 | 7.0 | 6.3% | 0 |
| stelo.MirrorMicro 1.0 | 7.7 | 6.0% | 0 |
| mme.NikeEnhanced 2.0 | 8.7 | 5.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 90.8 | 22 / 35 | 5880 |
| 2 | 1 | 72.3 | 94.0 | 28 / 35 | 6517 |
| 3 | 1 | 70.8 | 91.1 | 24 / 35 | 6116 |
| 4 | 1 | 71.6 | 96.5 | 28 / 35 | 5703 |
| 5 | 1 | 72.6 | 97.1 | 28 / 35 | 6312 |
| 6 | 1 | 72.7 | 96.5 | 29 / 35 | 6526 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 100 | 93% |
| maribo.mini.MiniQuester 0.1 | 42 | 93% |
| ara.Shera 0.88 | 26 | 65% |
| dsw.StaticD 1.0 | 7 | 86% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 996. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 19 | 35% | 39 |
| wompi.Wallaby 5.1 | 17 | 31% | 99 |
| maribo.mini.MiniQuester 0.1 | 8 | 15% | 46 |
| amz.NanoClone 1.41 | 3 | 6% | 4 |
| dsw.StaticD 1.0 | 2 | 4% | 14 |
| maribo.IotaCT 1.1 | 1 | 2% | 4 |
| mme.NikeEnhanced 2.0 | 1 | 2% | 2 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 168651 melee ticks, 52625 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 84 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 84 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 52434 sent, 47625 reached their opponent, 9294 virtual hits (19.5% of those reached).

## Melee bench: F43

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 694 over 6 battles (115.7 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 79.0 | 38 / 210 | 2.89 | 16.0% | 25722 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.4% | 145 |
| hadur117.Hadur 3.20bb | 2.0 | 16.0% | 38 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.3% | 18 |
| dummy.micro.Sparrow 2.5 | 3.8 | 12.2% | 5 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.5% | 3 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.3% | 0 |
| jab.DiamondStealer 5 | 7.5 | 7.8% | 1 |
| mz.NanoGod 2.02 | 7.5 | 7.6% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.6% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.5 | 78.4 | 7 / 35 | 4562 |
| 2 | 2 | 66.8 | 80.3 | 8 / 35 | 4263 |
| 3 | 2 | 66.2 | 81.0 | 4 / 35 | 4107 |
| 4 | 2 | 65.8 | 77.8 | 7 / 35 | 4302 |
| 5 | 2 | 65.5 | 78.7 | 5 / 35 | 4065 |
| 6 | 2 | 66.3 | 77.8 | 7 / 35 | 4423 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 92 | 18% |
| brainfade.melee.Dusk 0.44 | 17 | 41% |
| dummy.micro.Sparrow 2.5 | 11 | 82% |
| Krabb.akim2.Akim2 1.1b | 3 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 67% |

Hadur died in 178 of 210 rounds, at a mean tick of 1021. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 103 | 58% | 119 |
| brainfade.melee.Dusk 0.44 | 25 | 14% | 34 |
| dummy.micro.Sparrow 2.5 | 17 | 10% | 23 |
| wcsv.melee.EngineerMelee 0.1 | 13 | 7% | 16 |
| mz.NanoGod 2.02 | 6 | 3% | 7 |
| Krabb.akim2.Akim2 1.1b | 4 | 2% | 6 |
| jab.DiamondStealer 5 | 4 | 2% | 4 |
| cvt.Firsty 1.0 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 151830 melee ticks, 59586 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 40 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 2.

Targeting waves (205 rounds): 48634 sent, 43691 reached their opponent, 7317 virtual hits (16.7% of those reached).

## Melee bench: F44

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 296 over 6 battles (49.3 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 91.6 | 148 / 210 | 1.75 | 20.8% | 35355 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 20.8% | 148 |
| stelo.Liblix 0.3.1 | 2.0 | 15.2% | 37 |
| tzu.TheArtOfWar 1.2 | 3.0 | 13.6% | 17 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.0 | 9.8% | 4 |
| jwirde.Gort 2.0 | 5.2 | 8.8% | 2 |
| wompi.Quokka 1.6 | 6.5 | 7.5% | 2 |
| disan.Chair 2.2.0 | 7.0 | 7.3% | 0 |
| stf.PanzerGeneral 0.1 | 7.3 | 7.0% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 5.2% | 0 |
| sample.Crazy 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 90.2 | 24 / 35 | 5798 |
| 2 | 1 | 71.5 | 93.3 | 26 / 35 | 5786 |
| 3 | 1 | 70.1 | 87.9 | 24 / 35 | 5626 |
| 4 | 1 | 71.5 | 93.7 | 23 / 35 | 5906 |
| 5 | 1 | 71.6 | 91.1 | 25 / 35 | 6225 |
| 6 | 1 | 71.7 | 93.7 | 26 / 35 | 6014 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 81 | 74% |
| tzu.TheArtOfWar 1.2 | 64 | 92% |
| jwirde.Gort 2.0 | 14 | 93% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 10 | 80% |
| stf.PanzerGeneral 0.1 | 4 | 100% |
| disan.Chair 2.2.0 | 3 | 100% |
| wompi.Quokka 1.6 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 885. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 28 | 42% | 90 |
| tzu.TheArtOfWar 1.2 | 16 | 24% | 59 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 9 | 14% | 22 |
| jwirde.Gort 2.0 | 6 | 9% | 22 |
| disan.Chair 2.2.0 | 2 | 3% | 5 |
| wompi.Quokka 1.6 | 2 | 3% | 4 |
| stf.PanzerGeneral 0.1 | 1 | 2% | 5 |
| sample.Crazy 1.0 | 0 | 0% | 2 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 150040 melee ticks, 49220 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 46 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 51666 sent, 46972 reached their opponent, 9925 virtual hits (21.1% of those reached).

## Melee bench: F45

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 660 over 6 battles (110.0 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 90.3 | 118 / 210 | 1.88 | 20.3% | 34254 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 20.3% | 118 |
| jje.BagPuss 1.2 | 2.0 | 12.8% | 9 |
| eem.IWillFireNoBullet v2.8 | 3.2 | 11.8% | 68 |
| myl.nano.Graviton 1.10 | 4.2 | 11.1% | 4 |
| sul.Lunar 1.1 | 4.8 | 10.3% | 3 |
| hvilela.HVilela 0.9 | 6.5 | 8.4% | 2 |
| pez.mini.ChironexFleckeri 0.5 | 6.8 | 8.3% | 4 |
| fm.claire 1.7 | 7.5 | 8.3% | 1 |
| wit.Deep7 2.0 | 9.3 | 4.7% | 2 |
| abud.ThirdRobo 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.3 | 16 / 35 | 5370 |
| 2 | 1 | 70.1 | 91.1 | 20 / 35 | 5371 |
| 3 | 1 | 72.3 | 92.7 | 26 / 35 | 6174 |
| 4 | 1 | 69.5 | 86.7 | 18 / 35 | 5671 |
| 5 | 1 | 70.2 | 89.5 | 18 / 35 | 5750 |
| 6 | 1 | 71.4 | 94.3 | 20 / 35 | 5918 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 69 | 55% |
| jje.BagPuss 1.2 | 35 | 80% |
| myl.nano.Graviton 1.10 | 21 | 95% |
| sul.Lunar 1.1 | 21 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 7 | 71% |
| fm.claire 1.7 | 4 | 75% |
| hvilela.HVilela 0.9 | 3 | 33% |
| wit.Deep7 2.0 | 2 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 1514. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 38 | 39% | 0 |
| jje.BagPuss 1.2 | 25 | 26% | 75 |
| myl.nano.Graviton 1.10 | 10 | 10% | 41 |
| pez.mini.ChironexFleckeri 0.5 | 10 | 10% | 28 |
| fm.claire 1.7 | 3 | 3% | 9 |
| sul.Lunar 1.1 | 2 | 2% | 36 |
| hvilela.HVilela 0.9 | 2 | 2% | 14 |
| wit.Deep7 2.0 | 2 | 2% | 4 |
| abud.ThirdRobo 1.0 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 198407 melee ticks, 79022 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 49 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 60770 sent, 55944 reached their opponent, 8278 virtual hits (14.8% of those reached).

## Melee bench: F46

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 722 over 6 battles (120.3 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 84.6 | 69 / 210 | 2.39 | 17.1% | 26827 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.8 | 17.1% | 69 |
| rsalesc.melee.Medina 0.4.5 | 2.0 | 16.7% | 75 |
| kc.mini.Mirage 0.2 | 2.2 | 16.5% | 57 |
| mz.MicroSheep 1.0 | 4.7 | 10.1% | 3 |
| cx.Princess 1.0 | 4.8 | 9.7% | 5 |
| sadoner.killer 0.2 | 5.5 | 9.2% | 1 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.6% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 83.8 | 13 / 35 | 4234 |
| 2 | 3 | 65.0 | 80.6 | 9 / 35 | 4003 |
| 3 | 2 | 67.6 | 85.7 | 12 / 35 | 4478 |
| 4 | 2 | 67.0 | 85.7 | 14 / 35 | 4293 |
| 5 | 1 | 68.5 | 87.3 | 13 / 35 | 5043 |
| 6 | 2 | 66.8 | 84.4 | 8 / 35 | 4776 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 66 | 59% |
| rsalesc.melee.Medina 0.4.5 | 47 | 26% |
| cx.Princess 1.0 | 8 | 75% |
| mz.MicroSheep 1.0 | 7 | 86% |
| arthord.NanoSatanMelee Beta | 4 | 100% |
| sadoner.killer 0.2 | 1 | 100% |
| jeremyreeder.collective.Prophet 5 | 1 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 1007. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 58 | 39% | 73 |
| kc.mini.Mirage 0.2 | 56 | 38% | 92 |
| sadoner.killer 0.2 | 9 | 6% | 12 |
| mz.MicroSheep 1.0 | 7 | 5% | 11 |
| cx.Princess 1.0 | 6 | 4% | 13 |
| arthord.NanoSatanMelee Beta | 4 | 3% | 7 |
| kurios.DOSexe .9a | 1 | 1% | 1 |
| jeremyreeder.collective.Prophet 5 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 159501 melee ticks, 53485 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 33 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (208 rounds): 45897 sent, 41017 reached their opponent, 6109 virtual hits (14.9% of those reached).

