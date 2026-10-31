# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 122 over 6 battles (20.3 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 85.2 | 55 / 210 | 2.33 | 17.3% | 31122 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.7% | 136 |
| hadur117.Hadur 3.20bs | 2.0 | 17.3% | 55 |
| sgp.JollyNinja 3.53 | 3.8 | 10.8% | 14 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 10.7% | 3 |
| lorneswork.Predator 1.0 | 4.8 | 10.2% | 2 |
| mz.MicroGodMelee 1 | 5.5 | 9.9% | 1 |
| adt.Ar2 1.0 | 7.0 | 7.8% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.8% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.7% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.9 | 86.3 | 8 / 35 | 4900 |
| 2 | 2 | 65.9 | 81.0 | 6 / 35 | 5196 |
| 3 | 2 | 67.9 | 86.3 | 9 / 35 | 5443 |
| 4 | 2 | 67.2 | 84.4 | 8 / 35 | 5334 |
| 5 | 2 | 67.4 | 84.8 | 10 / 35 | 5255 |
| 6 | 2 | 67.6 | 88.6 | 14 / 35 | 4994 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 108 | 12% |
| sgp.JollyNinja 3.53 | 20 | 65% |
| mz.MicroGodMelee 1 | 14 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 88% |
| lorneswork.Predator 1.0 | 4 | 100% |
| adt.Ar2 1.0 | 2 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 1126. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 104 | 66% | 124 |
| sgp.JollyNinja 3.53 | 21 | 13% | 28 |
| lorneswork.Predator 1.0 | 11 | 7% | 16 |
| mz.MicroGodMelee 1 | 9 | 6% | 23 |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 4% | 12 |
| kawigi.sbf.FloodSonnet 0.9 | 3 | 2% | 4 |
| adt.Ar2 1.0 | 1 | 1% | 1 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 134683 melee ticks, 85990 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 58 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 43948 sent, 39082 reached their opponent, 7817 virtual hits (20.0% of those reached).

## Melee bench: F02

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 272 over 6 battles (45.3 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 87.4 | 119 / 210 | 2.14 | 19.2% | 31031 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 19.2% | 119 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 13.4% | 36 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.4% | 22 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.5 | 10.1% | 14 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.2% | 3 |
| Noran.BitchingElk 0.054 | 6.8 | 8.4% | 8 |
| sch.Simone 0.3d | 7.0 | 8.1% | 10 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 8.2% | 1 |
| stelo.PatternRobot 1.0 | 9.2 | 5.1% | 0 |
| fullsail.SweetTea 1.1 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 85.7 | 17 / 35 | 5216 |
| 2 | 1 | 69.7 | 88.9 | 22 / 35 | 5319 |
| 3 | 1 | 68.7 | 86.0 | 20 / 35 | 5219 |
| 4 | 1 | 70.1 | 90.8 | 23 / 35 | 5241 |
| 5 | 1 | 68.6 | 86.7 | 20 / 35 | 4764 |
| 6 | 1 | 68.3 | 86.0 | 17 / 35 | 5272 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 45 | 87% |
| pulsar.PulsarMax 0.8.9 | 39 | 51% |
| com.cohesiva.robocode.ManOwaR 1.0 | 27 | 70% |
| sch.Simone 0.3d | 20 | 85% |
| Noran.BitchingElk 0.054 | 16 | 75% |
| lrem.micro.SpikeSoldier 0.4 | 6 | 83% |
| fnc.bandit.Bandit 5.2.0 | 4 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |
| stelo.PatternRobot 1.0 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 960. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 31 | 34% | 57 |
| com.cohesiva.robocode.ManOwaR 1.0 | 14 | 15% | 32 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 13 | 14% | 45 |
| sch.Simone 0.3d | 9 | 10% | 26 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 10% | 15 |
| Noran.BitchingElk 0.054 | 5 | 5% | 19 |
| stelo.PatternRobot 1.0 | 5 | 5% | 5 |
| fullsail.SweetTea 1.1 | 3 | 3% | 4 |
| fnc.bandit.Bandit 5.2.0 | 2 | 2% | 7 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 163716 melee ticks, 51027 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 50 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 58551 sent, 53791 reached their opponent, 9063 virtual hits (16.8% of those reached).

## Melee bench: F03

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 123 over 6 battles (20.5 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 93.0 | 166 / 210 | 1.63 | 20.7% | 37640 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 20.7% | 166 |
| radnor.DoctorBob 1.42 | 2.0 | 14.2% | 22 |
| kawigi.nano.Lib 1.0 | 3.2 | 12.3% | 11 |
| vuen.Cake 2.51 | 3.8 | 12.0% | 7 |
| urdos.URDOS 1.3 | 5.0 | 9.3% | 3 |
| adt.Ar1 2.1 | 6.2 | 7.7% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.0 | 6.9% | 0 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.3 | 5.2% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 91.4 | 25 / 35 | 6021 |
| 2 | 1 | 71.3 | 94.0 | 30 / 35 | 6151 |
| 3 | 1 | 71.2 | 92.4 | 27 / 35 | 6547 |
| 4 | 1 | 70.9 | 92.1 | 29 / 35 | 6363 |
| 5 | 1 | 72.4 | 96.2 | 30 / 35 | 6743 |
| 6 | 1 | 69.9 | 91.7 | 25 / 35 | 5815 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 68 | 93% |
| vuen.Cake 2.51 | 64 | 92% |
| kawigi.nano.Lib 1.0 | 29 | 97% |
| oa.weak.FlyMk1 0.1 | 7 | 100% |
| urdos.URDOS 1.3 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 15 | 34% | 68 |
| kawigi.nano.Lib 1.0 | 9 | 20% | 34 |
| vuen.Cake 2.51 | 8 | 18% | 66 |
| urdos.URDOS 1.3 | 8 | 18% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 3 | 7% | 5 |
| adt.Ar1 2.1 | 1 | 2% | 4 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 9 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 6 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 6 |

Posture (Hadur's M records, 203 rounds): 131149 melee ticks, 42726 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 48 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 39641 sent, 35018 reached their opponent, 8928 virtual hits (25.5% of those reached).

## Melee bench: F04

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 309 over 6 battles (51.5 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 87.1 | 36 / 210 | 2.16 | 17.9% | 33802 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.3% | 155 |
| hadur117.Hadur 3.20bs | 2.0 | 17.9% | 36 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.1% | 10 |
| TNT.TNT 0.99.1 | 4.2 | 10.7% | 4 |
| josago.Jorgito 0.16 | 4.8 | 9.6% | 2 |
| css.Delitioner 0.11 | 6.3 | 6.9% | 2 |
| tj.zombie1n 1.0.1 | 6.7 | 6.3% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.8% | 0 |
| spin.Bugstard 0.012b | 9.2 | 4.0% | 1 |
| sp.Nanos.Ember 1.1 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.8 | 87.6 | 7 / 35 | 5682 |
| 2 | 2 | 69.2 | 87.3 | 5 / 35 | 5945 |
| 3 | 2 | 69.1 | 87.6 | 7 / 35 | 5690 |
| 4 | 2 | 67.4 | 84.1 | 5 / 35 | 5178 |
| 5 | 2 | 69.5 | 90.5 | 10 / 35 | 5556 |
| 6 | 2 | 68.1 | 85.4 | 2 / 35 | 5751 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 138 | 12% |
| apc.LeeroyJenkins2 1.0 | 17 | 65% |
| TNT.TNT 0.99.1 | 10 | 60% |
| josago.Jorgito 0.16 | 2 | 100% |
| css.Delitioner 0.11 | 1 | 0% |
| spin.Bugstard 0.012b | 1 | 0% |

Hadur died in 176 of 210 rounds, at a mean tick of 1362. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 139 | 79% | 162 |
| apc.LeeroyJenkins2 1.0 | 17 | 10% | 23 |
| TNT.TNT 0.99.1 | 11 | 6% | 17 |
| css.Delitioner 0.11 | 4 | 2% | 4 |
| josago.Jorgito 0.16 | 2 | 1% | 3 |
| spin.Bugstard 0.012b | 1 | 1% | 0 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 194057 melee ticks, 82486 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 82 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 82 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 59680 sent, 54762 reached their opponent, 8313 virtual hits (15.2% of those reached).

## Melee bench: F05

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 724 over 6 battles (120.7 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 78.8 | 28 / 210 | 2.91 | 15.1% | 23153 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 18.2% | 111 |
| justin.DemonicRage 3.4 | 2.2 | 16.8% | 49 |
| hadur117.Hadur 3.20bs | 2.8 | 15.1% | 28 |
| wompi.Numbat 2.1 | 3.8 | 12.7% | 14 |
| ms.Ares 0.19 | 5.2 | 9.7% | 0 |
| axeBots.HataMoto 3.09 | 5.8 | 8.9% | 8 |
| supersample.SuperBoxBot 1.0 | 7.3 | 5.2% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.1% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.2 | 4.3% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.1 | 81.0 | 4 / 35 | 4180 |
| 2 | 4 | 61.2 | 72.4 | 2 / 35 | 3332 |
| 3 | 3 | 63.2 | 75.2 | 5 / 35 | 3651 |
| 4 | 3 | 64.5 | 81.3 | 3 / 35 | 3872 |
| 5 | 3 | 63.0 | 75.6 | 4 / 35 | 3628 |
| 6 | 1 | 67.5 | 87.3 | 10 / 35 | 4490 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 46 | 41% |
| cb.fire.Firestarter 2.0f | 36 | 6% |
| wompi.Numbat 2.1 | 13 | 54% |
| axeBots.HataMoto 3.09 | 2 | 0% |

Hadur died in 188 of 210 rounds, at a mean tick of 921. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 71 | 38% | 72 |
| justin.DemonicRage 3.4 | 56 | 30% | 73 |
| wompi.Numbat 2.1 | 36 | 19% | 42 |
| axeBots.HataMoto 3.09 | 10 | 5% | 10 |
| ms.Ares 0.19 | 4 | 2% | 5 |
| GarmBox.Oranges 1.0 | 2 | 1% | 2 |
| supersample.SuperBoxBot 1.0 | 1 | 1% | 3 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 1% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 153907 melee ticks, 39780 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 57 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 48157 sent, 42996 reached their opponent, 7234 virtual hits (16.8% of those reached).

## Melee bench: F06

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 206 over 6 battles (34.3 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 92.9 | 156 / 210 | 1.64 | 20.7% | 33890 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 20.7% | 156 |
| jekl.StoneGhost 0.7 | 2.2 | 14.4% | 14 |
| origin.SleepSiphon 1.7b | 3.5 | 12.7% | 23 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.7 | 11.9% | 10 |
| mld.Wisdom 1.0 | 4.7 | 10.7% | 0 |
| gg.Wolverine 2.0 | 6.2 | 8.0% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 6.3% | 5 |
| DBall.NUKE 0.1 | 8.0 | 6.3% | 0 |
| spinnercat.Omen 1.0 | 8.2 | 6.2% | 0 |
| sample.Fire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 92.1 | 24 / 35 | 5765 |
| 2 | 1 | 70.1 | 89.2 | 22 / 35 | 5431 |
| 3 | 1 | 71.7 | 93.7 | 28 / 35 | 5691 |
| 4 | 1 | 71.3 | 93.7 | 27 / 35 | 5660 |
| 5 | 1 | 72.4 | 95.6 | 29 / 35 | 5910 |
| 6 | 1 | 71.1 | 93.0 | 26 / 35 | 5433 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 64 | 95% |
| origin.SleepSiphon 1.7b | 45 | 80% |
| pe.minimelee.SandboxMiniMelee 1.1 | 44 | 93% |
| mld.Wisdom 1.0 | 7 | 100% |
| gg.Wolverine 2.0 | 7 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 40% |
| spinnercat.Omen 1.0 | 1 | 100% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 19 | 35% | 57 |
| jekl.StoneGhost 0.7 | 16 | 29% | 67 |
| pe.minimelee.SandboxMiniMelee 1.1 | 7 | 13% | 42 |
| mld.Wisdom 1.0 | 7 | 13% | 21 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 7% | 11 |
| gg.Wolverine 2.0 | 1 | 2% | 7 |
| DBall.NUKE 0.1 | 0 | 0% | 2 |
| sample.Fire 1.0 | 0 | 0% | 2 |
| spinnercat.Omen 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 149811 melee ticks, 43114 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 41 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 46824 sent, 41961 reached their opponent, 9284 virtual hits (22.1% of those reached).

## Melee bench: F07

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 610 over 6 battles (101.7 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 93.2 | 124 / 210 | 1.61 | 20.9% | 38682 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 20.9% | 124 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 16.8% | 41 |
| rtk.Tachikoma 1.0 | 2.8 | 16.2% | 25 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.8% | 8 |
| franzor.Lizt 1.3.1 | 4.7 | 10.8% | 12 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.0% | 1 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.8% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.4% | 0 |
| sample.Target 1.0 | 9.2 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 95.2 | 25 / 35 | 6529 |
| 2 | 1 | 73.5 | 93.0 | 22 / 35 | 7000 |
| 3 | 1 | 72.0 | 92.4 | 17 / 35 | 6370 |
| 4 | 1 | 72.4 | 93.7 | 23 / 35 | 6324 |
| 5 | 1 | 71.6 | 91.4 | 19 / 35 | 5975 |
| 6 | 1 | 72.2 | 93.7 | 18 / 35 | 6484 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 73 | 77% |
| rsalesc.melee.Monk 0.3.6c | 51 | 39% |
| franzor.Lizt 1.3.1 | 30 | 70% |
| oog.melee.CapuletDroid 1.1 | 28 | 82% |
| exauge.GateKeeper 1.1.121g | 3 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 1467. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 35 | 38% | 70 |
| rtk.Tachikoma 1.0 | 33 | 36% | 100 |
| franzor.Lizt 1.3.1 | 10 | 11% | 1 |
| oog.melee.CapuletDroid 1.1 | 7 | 8% | 32 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 4 |
| drd.Dreadknoght 0.9 | 0 | 0% | 2 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 191469 melee ticks, 92512 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 56 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 57348 sent, 52468 reached their opponent, 10381 virtual hits (19.8% of those reached).

## Melee bench: F08

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 674 over 6 battles (112.3 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 91.7 | 147 / 210 | 1.74 | 20.1% | 30828 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 20.1% | 147 |
| tm.Yuugao 1.0 | 2.3 | 12.8% | 24 |
| shrub.Vapour v159 | 2.8 | 12.3% | 15 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 10.9% | 14 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 9.9% | 4 |
| m3thos.Eva00 1.1 | 6.2 | 8.9% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 6.7 | 8.3% | 5 |
| qualidafial.MajorDick 1.0.1 | 7.8 | 6.7% | 0 |
| SHAM.WOW 1.4 | 9.2 | 5.5% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 92.1 | 25 / 35 | 5070 |
| 2 | 1 | 70.1 | 93.0 | 25 / 35 | 5098 |
| 3 | 1 | 70.3 | 93.0 | 24 / 35 | 5039 |
| 4 | 1 | 70.7 | 93.3 | 26 / 35 | 5228 |
| 5 | 1 | 69.0 | 90.2 | 22 / 35 | 4921 |
| 6 | 1 | 69.8 | 88.9 | 25 / 35 | 5472 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 55 | 80% |
| shrub.Vapour v159 | 38 | 89% |
| Krabb.sliNk.Garm 0.9u | 25 | 76% |
| com.spp.robocode.MostlyHarmless 010 | 24 | 92% |
| jwst.DAD.DarkAndDarker 1.1 | 15 | 87% |
| m3thos.Eva00 1.1 | 10 | 90% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| SHAM.WOW 1.4 | 3 | 67% |

Hadur died in 70 of 210 rounds, at a mean tick of 876. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 20 | 29% | 65 |
| Krabb.sliNk.Garm 0.9u | 14 | 20% | 34 |
| shrub.Vapour v159 | 13 | 19% | 41 |
| com.spp.robocode.MostlyHarmless 010 | 7 | 10% | 30 |
| jwst.DAD.DarkAndDarker 1.1 | 4 | 6% | 19 |
| m3thos.Eva00 1.1 | 3 | 4% | 11 |
| SHAM.WOW 1.4 | 3 | 4% | 7 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 151704 melee ticks, 45583 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 102 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 102 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 49041 sent, 44183 reached their opponent, 8075 virtual hits (18.3% of those reached).

## Melee bench: F09

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 426 over 6 battles (71.0 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 76.5 | 52 / 210 | 3.11 | 15.1% | 20981 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.2% | 113 |
| hadur117.Hadur 3.20bs | 2.2 | 15.1% | 52 |
| kc.micro.Figment 1.0 | 2.8 | 13.6% | 18 |
| yagami.Tidus 0.11 | 4.7 | 10.5% | 1 |
| mc2.enemy.Original 0.9 | 5.2 | 9.9% | 14 |
| pedersen.Grishnakh 1.0 | 5.2 | 10.3% | 12 |
| dft.Calliope 5.6 | 7.0 | 7.5% | 0 |
| step.nanoPri 1.0 | 8.2 | 5.9% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 4.6% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 81.0 | 8 / 35 | 3659 |
| 2 | 2 | 63.3 | 77.5 | 8 / 35 | 3528 |
| 3 | 2 | 61.5 | 71.4 | 9 / 35 | 3319 |
| 4 | 2 | 62.3 | 73.3 | 7 / 35 | 3556 |
| 5 | 3 | 63.0 | 75.9 | 7 / 35 | 3304 |
| 6 | 2 | 65.0 | 80.0 | 13 / 35 | 3615 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 52 | 27% |
| kc.micro.Figment 1.0 | 27 | 70% |
| mc2.enemy.Original 0.9 | 10 | 40% |
| yagami.Tidus 0.11 | 9 | 89% |
| pedersen.Grishnakh 1.0 | 8 | 63% |
| dft.Calliope 5.6 | 1 | 100% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |

Hadur died in 161 of 210 rounds, at a mean tick of 841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 72 | 45% | 85 |
| kc.micro.Figment 1.0 | 31 | 19% | 52 |
| mc2.enemy.Original 0.9 | 21 | 13% | 25 |
| yagami.Tidus 0.11 | 11 | 7% | 17 |
| pedersen.Grishnakh 1.0 | 9 | 6% | 12 |
| robar.nano.Assertive_Melee 0.2 | 8 | 5% | 10 |
| step.nanoPri 1.0 | 3 | 2% | 4 |
| rdm.Dueler 0.4x | 3 | 2% | 3 |
| dft.Calliope 5.6 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 143926 melee ticks, 38905 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 568 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 162 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 47803 sent, 43009 reached their opponent, 6086 virtual hits (14.2% of those reached).

## Melee bench: F10

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 228 over 6 battles (38.0 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 94.0 | 162 / 210 | 1.54 | 20.5% | 34355 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 20.5% | 162 |
| DTF.Kludgy 1.2b | 2.3 | 14.0% | 19 |
| ne.Chimera 1.2 | 3.2 | 12.9% | 8 |
| ejb.Polaris 1.0.1 | 3.5 | 12.1% | 11 |
| tvv.micro.Antares 1.1.1 | 5.2 | 10.5% | 4 |
| vStar.RAFzilla 2.15 | 5.8 | 9.6% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.8 | 5.5% | 0 |
| kurios.DOSexe .9b | 8.3 | 5.3% | 0 |
| sam.Samspin 1.0 | 8.3 | 5.1% | 0 |
| donjezza.Muncho 1.0 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 93.7 | 28 / 35 | 5333 |
| 2 | 1 | 70.5 | 93.0 | 25 / 35 | 5671 |
| 3 | 1 | 71.5 | 95.2 | 29 / 35 | 5748 |
| 4 | 1 | 70.8 | 93.3 | 25 / 35 | 5808 |
| 5 | 1 | 71.4 | 95.6 | 28 / 35 | 5810 |
| 6 | 1 | 70.9 | 93.0 | 27 / 35 | 5985 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 59 | 81% |
| ne.Chimera 1.2 | 50 | 94% |
| ejb.Polaris 1.0.1 | 38 | 87% |
| tvv.micro.Antares 1.1.1 | 19 | 95% |
| vStar.RAFzilla 2.15 | 11 | 82% |
| kurios.DOSexe .9b | 3 | 100% |
| donjezza.Muncho 1.0 | 2 | 100% |
| sam.Samspin 1.0 | 1 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 15 | 29% | 58 |
| ejb.Polaris 1.0.1 | 11 | 22% | 52 |
| vStar.RAFzilla 2.15 | 9 | 18% | 16 |
| ne.Chimera 1.2 | 8 | 16% | 44 |
| tvv.micro.Antares 1.1.1 | 6 | 12% | 23 |
| sam.Samspin 1.0 | 1 | 2% | 2 |
| kurios.DOSexe .9b | 0 | 0% | 9 |
| donjezza.Muncho 1.0 | 0 | 0% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 139220 melee ticks, 50511 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 50 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 45723 sent, 41067 reached their opponent, 7808 virtual hits (19.0% of those reached).

## Melee bench: F11

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 545 over 6 battles (90.8 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 80.2 | 66 / 210 | 2.79 | 16.1% | 22950 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.5 | 15.9% | 65 |
| hadur117.Hadur 3.20bs | 1.5 | 16.1% | 66 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.3% | 27 |
| djc.DynaBot 0.1.1 | 4.0 | 11.2% | 15 |
| br2.MobyDickBot 1.6 | 5.8 | 9.2% | 12 |
| rdt199.Warlord 0.73 | 6.0 | 9.5% | 15 |
| uji.YellohFellah 1.0 | 6.3 | 8.5% | 10 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.7% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.0% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 80.3 | 12 / 35 | 3564 |
| 2 | 1 | 66.0 | 85.4 | 11 / 35 | 3952 |
| 3 | 2 | 62.3 | 76.5 | 5 / 35 | 3638 |
| 4 | 2 | 63.2 | 74.0 | 9 / 35 | 3973 |
| 5 | 1 | 64.6 | 80.6 | 13 / 35 | 3908 |
| 6 | 1 | 65.8 | 84.1 | 16 / 35 | 3915 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 52 | 50% |
| cx.mini.Nimrod 0.55 | 19 | 37% |
| br2.MobyDickBot 1.6 | 17 | 59% |
| rdt199.Warlord 0.73 | 15 | 60% |
| djc.DynaBot 0.1.1 | 10 | 50% |
| uji.YellohFellah 1.0 | 9 | 89% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 55 | 37% | 80 |
| cx.mini.Nimrod 0.55 | 31 | 21% | 41 |
| rdt199.Warlord 0.73 | 15 | 10% | 25 |
| br2.MobyDickBot 1.6 | 12 | 8% | 19 |
| djc.DynaBot 0.1.1 | 12 | 8% | 17 |
| uji.YellohFellah 1.0 | 6 | 4% | 12 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 4% | 6 |
| KiraNL.Chupacabra 0.4 | 4 | 3% | 7 |
| stelo.MirrorNano 1.3 | 3 | 2% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 159977 melee ticks, 39672 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 113 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 113 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 51421 sent, 46461 reached their opponent, 6331 virtual hits (13.6% of those reached).

## Melee bench: F12

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 747 over 6 battles (124.5 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 86.6 | 118 / 210 | 2.20 | 18.1% | 23867 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 18.1% | 118 |
| nat.PallasHawk 1.0 | 2.5 | 13.7% | 36 |
| bts.wiki.RipCurl 0.9b | 2.8 | 13.4% | 28 |
| darkcanuck.Leon 1.01 | 3.7 | 12.6% | 17 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.1% | 8 |
| jrm.Test0 1.0 | 6.5 | 7.7% | 2 |
| cs.sheldor.Talon 1.1 | 6.8 | 7.0% | 1 |
| jp.Perpy 16.0 | 8.3 | 6.2% | 0 |
| stuff.Vlad 0.1 | 8.8 | 5.7% | 0 |
| jaybot.bots.Oddball 4.0 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 88.9 | 20 / 35 | 4007 |
| 2 | 1 | 67.6 | 87.9 | 21 / 35 | 3759 |
| 3 | 1 | 66.4 | 83.5 | 17 / 35 | 3902 |
| 4 | 1 | 67.4 | 85.4 | 20 / 35 | 3927 |
| 5 | 1 | 68.6 | 88.9 | 21 / 35 | 4530 |
| 6 | 1 | 66.7 | 85.1 | 19 / 35 | 3742 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 52 | 67% |
| bts.wiki.RipCurl 0.9b | 44 | 75% |
| darkcanuck.Leon 1.01 | 33 | 88% |
| brainfade.melee.Genghis 0.36 | 14 | 93% |
| jaybot.bots.Oddball 4.0 | 4 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| jp.Perpy 16.0 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 732. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 31 | 31% | 49 |
| nat.PallasHawk 1.0 | 27 | 27% | 58 |
| brainfade.melee.Genghis 0.36 | 13 | 13% | 25 |
| jrm.Test0 1.0 | 8 | 8% | 10 |
| darkcanuck.Leon 1.01 | 5 | 5% | 48 |
| cs.sheldor.Talon 1.1 | 4 | 4% | 5 |
| stuff.Vlad 0.1 | 3 | 3% | 5 |
| jp.Perpy 16.0 | 2 | 2% | 2 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 4 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 133992 melee ticks, 38299 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 56 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 46034 sent, 40890 reached their opponent, 6818 virtual hits (16.7% of those reached).

## Melee bench: F13

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 82 over 6 battles (13.7 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 84.0 | 63 / 210 | 2.44 | 16.4% | 25440 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.7 | 16.5% | 89 |
| hadur117.Hadur 3.20bs | 2.2 | 16.4% | 63 |
| ags.Glacier 0.2.11 | 2.2 | 16.4% | 37 |
| shinh.Entangled 0.3 | 4.3 | 12.0% | 16 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.3% | 4 |
| apc.Colossus2 0.17 | 6.0 | 7.9% | 1 |
| stelo.Wang 1.0 | 7.0 | 6.5% | 0 |
| maribo.FollowFire 1 | 8.3 | 5.0% | 0 |
| ayk.WallHugger 1.0 | 8.7 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 87.3 | 12 / 35 | 4033 |
| 2 | 2 | 66.3 | 86.0 | 8 / 35 | 4469 |
| 3 | 3 | 64.6 | 81.0 | 7 / 35 | 3934 |
| 4 | 2 | 66.3 | 83.2 | 11 / 35 | 4580 |
| 5 | 3 | 66.1 | 84.4 | 11 / 35 | 4026 |
| 6 | 2 | 66.2 | 82.2 | 14 / 35 | 4398 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 52 | 13% |
| ags.Glacier 0.2.11 | 51 | 69% |
| shinh.Entangled 0.3 | 19 | 68% |
| gh.micro.Gruweltje 0.7 | 8 | 75% |
| stelo.Wang 1.0 | 2 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 946. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 68 | 46% | 76 |
| ags.Glacier 0.2.11 | 40 | 27% | 71 |
| shinh.Entangled 0.3 | 19 | 13% | 33 |
| gh.micro.Gruweltje 0.7 | 12 | 8% | 18 |
| maribo.FollowFire 1 | 4 | 3% | 5 |
| apc.Colossus2 0.17 | 2 | 1% | 2 |
| stelo.Wang 1.0 | 1 | 1% | 4 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 204 rounds): 150710 melee ticks, 48009 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 65 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 43901 sent, 38748 reached their opponent, 6075 virtual hits (15.7% of those reached).

## Melee bench: F14

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 131 over 6 battles (21.8 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 94.7 | 167 / 210 | 1.48 | 20.9% | 34022 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 20.9% | 167 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.8% | 17 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.1% | 17 |
| sanyi.mikrobi.Roberto 1.0 | 4.3 | 10.1% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 5.0 | 9.5% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 6.0 | 8.9% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.2 | 8.0% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 7.7% | 4 |
| pa.Improved 1.0 | 9.0 | 6.1% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 97.5 | 30 / 35 | 5937 |
| 2 | 1 | 71.0 | 93.3 | 30 / 35 | 5560 |
| 3 | 1 | 71.8 | 96.2 | 27 / 35 | 5889 |
| 4 | 1 | 71.0 | 91.7 | 29 / 35 | 5318 |
| 5 | 1 | 71.7 | 96.2 | 27 / 35 | 5858 |
| 6 | 1 | 70.6 | 93.0 | 24 / 35 | 5460 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 80 | 90% |
| catcat20.shape.Theta 0.018 | 66 | 82% |
| sanyi.mikrobi.Roberto 1.0 | 22 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 73% |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 43 of 210 rounds, at a mean tick of 833. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 16 | 37% | 61 |
| simonton.micro.Sprout 1.1.3 | 13 | 30% | 77 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 12% | 22 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 9% | 7 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 7% | 30 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 5% | 6 |
| co.edu.usb.rc.LidisTron 1.0 | 0 | 0% | 3 |
| pa.Improved 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 200 rounds): 138272 melee ticks, 54687 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 485 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 88 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 44172 sent, 39566 reached their opponent, 9325 virtual hits (23.6% of those reached).

## Melee bench: F15

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 465 over 6 battles (77.5 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 84.5 | 112 / 210 | 2.40 | 18.3% | 29274 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 18.3% | 112 |
| kawigi.micro.Shiz 1.1 | 2.7 | 14.0% | 23 |
| emp.Yngwie 1.11 | 2.8 | 13.3% | 49 |
| mld.DustBunny 3.8 | 3.5 | 12.9% | 9 |
| cb.nano.Insomnia 1.0 | 5.3 | 10.4% | 6 |
| kawigi.robot.Girl 1.2 | 5.7 | 9.3% | 10 |
| lambdaxy.TBot 0.1 | 7.5 | 6.6% | 0 |
| Grystrion.TrackerWO 1.0 | 7.8 | 6.2% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 5.1% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 84.4 | 20 / 35 | 4908 |
| 2 | 1 | 67.2 | 82.5 | 19 / 35 | 4700 |
| 3 | 1 | 67.2 | 83.8 | 15 / 35 | 4771 |
| 4 | 1 | 67.7 | 84.1 | 16 / 35 | 5036 |
| 5 | 1 | 68.5 | 83.8 | 19 / 35 | 5077 |
| 6 | 1 | 69.2 | 88.3 | 23 / 35 | 4782 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 44 | 66% |
| kawigi.micro.Shiz 1.1 | 37 | 89% |
| mld.DustBunny 3.8 | 31 | 81% |
| kawigi.robot.Girl 1.2 | 16 | 88% |
| cb.nano.Insomnia 1.0 | 9 | 89% |
| divineomega.TrialBot 0.003 | 3 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 909. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 40 | 40% | 79 |
| kawigi.micro.Shiz 1.1 | 17 | 17% | 46 |
| mld.DustBunny 3.8 | 17 | 17% | 40 |
| cb.nano.Insomnia 1.0 | 12 | 12% | 19 |
| kawigi.robot.Girl 1.2 | 6 | 6% | 8 |
| divineomega.TrialBot 0.003 | 2 | 2% | 10 |
| lambdaxy.TBot 0.1 | 2 | 2% | 4 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 164028 melee ticks, 43257 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 40 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 53065 sent, 48304 reached their opponent, 7648 virtual hits (15.8% of those reached).

## Melee bench: F16

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 461 over 6 battles (76.8 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.6 | 117 / 210 | 2.03 | 19.5% | 33145 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 19.5% | 117 |
| gh.Griezel 0.5.2 | 2.2 | 15.4% | 43 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.8 | 14.1% | 7 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.7% | 26 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 8.9% | 2 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.8% | 4 |
| stelo.IntrinsicVolatility 1.4 | 6.5 | 7.9% | 5 |
| repositorio.NanoStep 1.0 | 8.8 | 5.1% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 4.8% | 6 |
| asd.Cthulhu 1.3 | 9.2 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 90.5 | 20 / 35 | 5525 |
| 2 | 1 | 68.0 | 84.8 | 19 / 35 | 4831 |
| 3 | 1 | 70.2 | 90.8 | 17 / 35 | 5759 |
| 4 | 1 | 69.9 | 89.5 | 19 / 35 | 5499 |
| 5 | 1 | 69.6 | 85.7 | 22 / 35 | 5578 |
| 6 | 1 | 70.6 | 90.2 | 20 / 35 | 5953 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 71 | 63% |
| techdude.forest.FlamingForest 1.1 | 41 | 66% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 33 | 88% |
| divineomega.DivineBot 1.9.4.5 | 5 | 100% |
| stelo.IntrinsicVolatility 1.4 | 4 | 75% |
| tvv.nano.Polaris 1.2 | 4 | 100% |
| bvh.fnr.Fenrir 0.36l | 3 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 1107. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 38 | 40% | 93 |
| techdude.forest.FlamingForest 1.1 | 17 | 18% | 42 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 14 | 15% | 34 |
| bvh.fnr.Fenrir 0.36l | 10 | 10% | 13 |
| stelo.IntrinsicVolatility 1.4 | 8 | 8% | 9 |
| asd.Cthulhu 1.3 | 3 | 3% | 3 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 6 |
| tvv.nano.Polaris 1.2 | 1 | 1% | 8 |
| repositorio.NanoStep 1.0 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 173463 melee ticks, 62800 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 38 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 55954 sent, 51316 reached their opponent, 8719 virtual hits (17.0% of those reached).

## Melee bench: F17

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 571 over 6 battles (95.2 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 85.0 | 104 / 210 | 2.35 | 19.0% | 34682 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 19.0% | 104 |
| cx.BlestPain 1.41 | 2.8 | 13.3% | 45 |
| et.Predator 1.8 | 2.8 | 13.1% | 17 |
| oog.melee.Mercutio 1.0 | 3.3 | 12.8% | 28 |
| ahf.NanoAndrew .4 | 5.3 | 10.3% | 11 |
| maribo.melee.BMV 0.1 | 6.0 | 9.1% | 0 |
| nic.Nicator 2.4 | 6.7 | 8.4% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.0 | 6.2% | 3 |
| tex.Longbot 0.4 | 9.0 | 5.0% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 83.8 | 16 / 35 | 5832 |
| 2 | 1 | 70.8 | 91.4 | 20 / 35 | 6061 |
| 3 | 1 | 67.7 | 81.3 | 17 / 35 | 5502 |
| 4 | 1 | 67.9 | 81.6 | 14 / 35 | 5662 |
| 5 | 1 | 70.5 | 89.5 | 19 / 35 | 5994 |
| 6 | 1 | 68.5 | 82.5 | 18 / 35 | 5631 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 54 | 72% |
| et.Predator 1.8 | 45 | 84% |
| cx.BlestPain 1.41 | 38 | 32% |
| ahf.NanoAndrew .4 | 9 | 89% |
| maribo.melee.BMV 0.1 | 3 | 100% |
| nic.Nicator 2.4 | 2 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 1143. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 40 | 36% | 58 |
| oog.melee.Mercutio 1.0 | 24 | 22% | 59 |
| ahf.NanoAndrew .4 | 15 | 14% | 22 |
| et.Predator 1.8 | 14 | 13% | 45 |
| nic.Nicator 2.4 | 4 | 4% | 10 |
| maribo.melee.BMV 0.1 | 3 | 3% | 7 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 2% | 4 |
| goblin.Bender 2.4 | 2 | 2% | 2 |
| tex.Longbot 0.4 | 2 | 2% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 163186 melee ticks, 71517 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 33 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 53944 sent, 49161 reached their opponent, 10108 virtual hits (20.6% of those reached).

## Melee bench: F18

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 527 over 6 battles (87.8 per battle, most in one battle 151). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 91.5 | 140 / 210 | 1.77 | 19.7% | 29412 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 19.7% | 140 |
| morbid.MorbidPriest 1.0 | 2.3 | 13.3% | 23 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.0% | 16 |
| uji.DBH 1.1 | 3.7 | 10.9% | 11 |
| spinnercat.Robovirus 2.718 | 5.8 | 8.9% | 2 |
| sigterm.Sigterm 1.0 | 5.8 | 8.6% | 7 |
| ratosh.Nobo 0.21 | 6.7 | 8.5% | 4 |
| kawigi.mini.Fhqwhgads 1.1 | 7.7 | 7.7% | 4 |
| stelo.WangRobot 1.0 | 9.5 | 5.0% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 91.1 | 26 / 35 | 4853 |
| 2 | 1 | 68.8 | 88.9 | 22 / 35 | 4809 |
| 3 | 1 | 69.4 | 91.4 | 23 / 35 | 4823 |
| 4 | 1 | 70.1 | 92.4 | 24 / 35 | 5016 |
| 5 | 1 | 69.2 | 92.1 | 21 / 35 | 4829 |
| 6 | 1 | 70.1 | 93.0 | 24 / 35 | 5082 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 54 | 74% |
| uji.DBH 1.1 | 36 | 78% |
| agd.Mooserwirt2 2.7 | 32 | 81% |
| sigterm.Sigterm 1.0 | 21 | 90% |
| ratosh.Nobo 0.21 | 9 | 89% |
| spinnercat.Robovirus 2.718 | 9 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 63% |
| stelo.WangRobot 1.0 | 4 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 24 | 32% | 60 |
| agd.Mooserwirt2 2.7 | 11 | 15% | 40 |
| uji.DBH 1.1 | 10 | 14% | 30 |
| ratosh.Nobo 0.21 | 8 | 11% | 18 |
| sigterm.Sigterm 1.0 | 4 | 5% | 21 |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 5% | 15 |
| spinnercat.Robovirus 2.718 | 4 | 5% | 13 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 5% | 8 |
| stelo.WangRobot 1.0 | 2 | 3% | 5 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 142149 melee ticks, 48512 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 71 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 47046 sent, 42147 reached their opponent, 8947 virtual hits (21.2% of those reached).

## Melee bench: F19

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 206 over 6 battles (34.3 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.6 | 98.0 | 197 / 210 | 1.18 | 22.6% | 37933 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 22.6% | 197 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.1% | 3 |
| mld.Infinity 2.2 | 3.3 | 11.8% | 1 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.3% | 3 |
| erdnis.Rover 0.3 | 4.7 | 11.1% | 3 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.6% | 1 |
| pac.ABC 2.1 | 7.7 | 6.8% | 2 |
| mbh.Mbh 0.1 | 7.8 | 6.9% | 0 |
| pbg.R2D2 1.0 | 8.2 | 6.0% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.8 | 97.8 | 33 / 35 | 6611 |
| 2 | 1 | 74.2 | 99.7 | 34 / 35 | 6531 |
| 3 | 1 | 72.6 | 96.2 | 32 / 35 | 5767 |
| 4 | 1 | 73.2 | 97.1 | 32 / 35 | 6384 |
| 5 | 1 | 73.4 | 97.5 | 31 / 35 | 6261 |
| 6 | 1 | 74.3 | 100.0 | 35 / 35 | 6379 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 108 | 99% |
| krillr.mini.JointStrike 2.0.0 | 27 | 96% |
| erdnis.Rover 0.3 | 23 | 91% |
| mld.Infinity 2.2 | 22 | 100% |
| patson.PatsonTestBot 1.0 | 11 | 91% |
| pac.ABC 2.1 | 9 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 14 of 210 rounds, at a mean tick of 627. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| krillr.mini.JointStrike 2.0.0 | 4 | 29% | 40 |
| erdnis.Rover 0.3 | 4 | 29% | 32 |
| pac.ABC 2.1 | 2 | 14% | 9 |
| davidalves.net.DuelistMiniMelee 1.2 | 1 | 7% | 59 |
| patson.PatsonTestBot 1.0 | 1 | 7% | 19 |
| mbh.Mbh 0.1 | 1 | 7% | 7 |
| mld.Infinity 2.2 | 0 | 0% | 27 |
| pbg.R2D2 1.0 | 0 | 0% | 12 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 125843 melee ticks, 45471 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 64 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 42541 sent, 37885 reached their opponent, 8814 virtual hits (23.3% of those reached).

## Melee bench: F20

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 533 over 6 battles (88.8 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 95.0 | 162 / 210 | 1.45 | 21.8% | 37661 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 21.8% | 162 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.3% | 22 |
| catcat20.Rabbit 0.001 | 3.7 | 10.8% | 13 |
| nz.jdc.nano.GridFu 1.0 | 4.2 | 10.5% | 0 |
| fwb.Nine 1.0.1 | 4.2 | 10.3% | 7 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 8.8% | 1 |
| bayen.nut.Squirrel 1.615 | 6.8 | 7.2% | 3 |
| djdjdj.NanoSkunk10 1.0 | 8.3 | 5.9% | 1 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.3% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.5 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.9 | 98.7 | 32 / 35 | 6747 |
| 2 | 1 | 70.4 | 90.8 | 22 / 35 | 5730 |
| 3 | 1 | 71.8 | 93.3 | 26 / 35 | 6126 |
| 4 | 1 | 72.5 | 95.2 | 27 / 35 | 6169 |
| 5 | 1 | 73.2 | 95.9 | 29 / 35 | 6703 |
| 6 | 1 | 72.0 | 96.2 | 26 / 35 | 6186 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 99 | 83% |
| catcat20.Rabbit 0.001 | 36 | 81% |
| fwb.Nine 1.0.1 | 26 | 96% |
| nz.jdc.nano.GridFu 1.0 | 12 | 100% |
| m3thos.mini.Eva01 0.5.5 | 9 | 100% |
| bayen.nut.Squirrel 1.615 | 3 | 67% |
| djdjdj.NanoSkunk10 1.0 | 3 | 67% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 1051. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 27 | 51% | 92 |
| catcat20.Rabbit 0.001 | 8 | 15% | 41 |
| fwb.Nine 1.0.1 | 8 | 15% | 23 |
| bayen.nut.Squirrel 1.615 | 3 | 6% | 8 |
| djdjdj.NanoSkunk10 1.0 | 2 | 4% | 5 |
| m3thos.mini.Eva01 0.5.5 | 1 | 2% | 14 |
| nz.jdc.nano.GridFu 1.0 | 0 | 0% | 19 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 2 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 167404 melee ticks, 58051 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 33 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 52978 sent, 48043 reached their opponent, 10673 virtual hits (22.2% of those reached).

## Melee bench: F21

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 469 over 6 battles (78.2 per battle, most in one battle 112). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 92.2 | 129 / 210 | 1.70 | 20.3% | 33804 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 20.3% | 129 |
| eem.EvBot v4.6.16 | 2.2 | 16.0% | 54 |
| dummy.mini.Scimitar 1.01 | 2.8 | 13.9% | 9 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.8% | 4 |
| eld.Hmm 1.0 | 5.0 | 9.0% | 15 |
| oa.weak.BotherBot 0.1 | 6.2 | 7.3% | 0 |
| el.JumpShoot 0.2 | 8.0 | 5.8% | 0 |
| fire219.CatBot 1.0 | 8.0 | 6.0% | 0 |
| PSW.Relentless 0.1 | 8.2 | 6.0% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 92.7 | 23 / 35 | 5344 |
| 2 | 1 | 71.8 | 94.3 | 23 / 35 | 5772 |
| 3 | 1 | 71.6 | 92.4 | 23 / 35 | 6144 |
| 4 | 1 | 69.6 | 89.8 | 20 / 35 | 5456 |
| 5 | 1 | 71.4 | 93.7 | 20 / 35 | 5955 |
| 6 | 1 | 69.7 | 90.5 | 20 / 35 | 5133 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 107 | 67% |
| dummy.mini.Scimitar 1.01 | 34 | 85% |
| cf.RiO.RiOx 4.2.1 | 23 | 87% |
| eld.Hmm 1.0 | 14 | 36% |
| oa.weak.BotherBot 0.1 | 3 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 1298. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 43 | 50% | 99 |
| dummy.mini.Scimitar 1.01 | 16 | 19% | 59 |
| eld.Hmm 1.0 | 11 | 13% | 24 |
| cf.RiO.RiOx 4.2.1 | 7 | 8% | 21 |
| PSW.Relentless 0.1 | 2 | 2% | 2 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 3 |
| arthord.MannyPacquiao Beta | 1 | 1% | 1 |
| fire219.CatBot 1.0 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 182220 melee ticks, 80004 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 65 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 53181 sent, 48525 reached their opponent, 8210 virtual hits (16.9% of those reached).

## Melee bench: F22

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 309 over 6 battles (51.5 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 90.5 | 104 / 210 | 1.86 | 19.1% | 31045 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 19.1% | 104 |
| pe.SandboxDT 2.71m | 2.2 | 16.3% | 63 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.5% | 20 |
| jlm.javaDisturbance 0.59 | 3.8 | 12.9% | 16 |
| bigpete.Stewie 1.0 | 5.0 | 10.3% | 6 |
| yk.JahRoslav 1.1 | 6.5 | 7.3% | 1 |
| tad.Dalek98 0.98 | 6.8 | 6.6% | 0 |
| gg.Squaraus 0.6 | 7.8 | 5.9% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 4.7% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 89.2 | 19 / 35 | 5346 |
| 2 | 1 | 69.2 | 89.2 | 14 / 35 | 5078 |
| 3 | 1 | 69.2 | 89.8 | 14 / 35 | 5141 |
| 4 | 1 | 69.5 | 90.8 | 18 / 35 | 4923 |
| 5 | 1 | 70.2 | 91.4 | 20 / 35 | 5140 |
| 6 | 1 | 70.3 | 92.4 | 19 / 35 | 5417 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 64 | 33% |
| kvk.HebusLeTroll 0.35 | 46 | 76% |
| jlm.javaDisturbance 0.59 | 42 | 83% |
| bigpete.Stewie 1.0 | 13 | 92% |
| yk.JahRoslav 1.1 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 1071. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 58 | 54% | 83 |
| kvk.HebusLeTroll 0.35 | 28 | 26% | 67 |
| jlm.javaDisturbance 0.59 | 11 | 10% | 35 |
| bigpete.Stewie 1.0 | 5 | 5% | 16 |
| yk.JahRoslav 1.1 | 2 | 2% | 4 |
| tad.Dalek98 0.98 | 2 | 2% | 2 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 166831 melee ticks, 51238 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 32 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 52703 sent, 47853 reached their opponent, 7558 virtual hits (15.8% of those reached).

## Melee bench: F23

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 274 over 6 battles (45.7 per battle, most in one battle 113). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.3 | 95.9 | 168 / 210 | 1.37 | 22.0% | 38074 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 22.0% | 168 |
| pe.SandboxLump 1.52 | 2.0 | 16.7% | 33 |
| cre.Karolos 0.32 | 3.0 | 13.4% | 5 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 9.9% | 1 |
| stelo.RamTrackSurfer 1.2 | 5.0 | 9.2% | 0 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.8 | 8.8% | 2 |
| cw.megas.Blade 0.8 | 6.8 | 8.2% | 0 |
| sample.Walls 1.0 | 7.8 | 7.4% | 1 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.4% | 0 |
| rrh.Iwillfindyou 2.0 | 9.5 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.1 | 98.1 | 31 / 35 | 6374 |
| 2 | 1 | 73.6 | 96.8 | 27 / 35 | 6560 |
| 3 | 1 | 73.2 | 95.2 | 26 / 35 | 6661 |
| 4 | 1 | 72.4 | 93.3 | 26 / 35 | 6274 |
| 5 | 1 | 72.6 | 94.0 | 28 / 35 | 5837 |
| 6 | 1 | 73.7 | 98.1 | 30 / 35 | 6368 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 107 | 80% |
| cre.Karolos 0.32 | 51 | 94% |
| stelo.AreaTargetingBot 1.1 | 14 | 100% |
| stelo.RamTrackSurfer 1.2 | 13 | 100% |
| sample.Walls 1.0 | 5 | 80% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 67% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 853. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 30 | 67% | 102 |
| stelo.AreaTargetingBot 1.1 | 6 | 13% | 21 |
| cre.Karolos 0.32 | 4 | 9% | 47 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 4% | 4 |
| sample.Walls 1.0 | 1 | 2% | 6 |
| stelo.RamTrackSurfer 1.2 | 0 | 0% | 21 |
| cw.megas.Blade 0.8 | 0 | 0% | 8 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 127149 melee ticks, 54373 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 88 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 88 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 39838 sent, 35059 reached their opponent, 10743 virtual hits (30.6% of those reached).

## Melee bench: F24

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 458 over 6 battles (76.3 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 84.3 | 87 / 210 | 2.41 | 17.2% | 24519 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 17.2% | 87 |
| rz.GlowBlowMelee 1.4 | 2.3 | 14.1% | 43 |
| florent.XSeries.X2 0.12 | 3.0 | 13.2% | 27 |
| davidalves.Phoenix 0.54 | 4.0 | 12.4% | 24 |
| pedersen.Ugluk 1.1.1 | 4.7 | 11.3% | 16 |
| oog.melee.Corsair 1.0 | 6.0 | 9.6% | 5 |
| stelo.SoJNanoMelee 1.1 | 7.2 | 6.9% | 5 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.0% | 0 |
| as.FrankTheTank 1.3 | 9.3 | 4.6% | 1 |
| evd.X1 0.01 | 9.5 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 83.2 | 13 / 35 | 4051 |
| 2 | 1 | 67.9 | 89.5 | 20 / 35 | 4090 |
| 3 | 1 | 66.7 | 84.8 | 16 / 35 | 4421 |
| 4 | 1 | 66.3 | 84.4 | 13 / 35 | 4237 |
| 5 | 1 | 65.5 | 82.5 | 11 / 35 | 3917 |
| 6 | 1 | 65.3 | 81.6 | 14 / 35 | 3803 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 41 | 56% |
| davidalves.Phoenix 0.54 | 33 | 61% |
| pedersen.Ugluk 1.1.1 | 26 | 73% |
| florent.XSeries.X2 0.12 | 25 | 56% |
| oog.melee.Corsair 1.0 | 10 | 70% |
| stelo.SoJNanoMelee 1.1 | 3 | 67% |
| evd.X1 0.01 | 1 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 37 | 29% | 63 |
| florent.XSeries.X2 0.12 | 31 | 24% | 45 |
| davidalves.Phoenix 0.54 | 23 | 18% | 43 |
| pedersen.Ugluk 1.1.1 | 15 | 12% | 28 |
| oog.melee.Corsair 1.0 | 9 | 7% | 17 |
| stelo.SoJNanoMelee 1.1 | 4 | 3% | 8 |
| evd.X1 0.01 | 3 | 2% | 3 |
| lunchie.Lunchbox 0.93 | 1 | 1% | 2 |
| as.FrankTheTank 1.3 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 142050 melee ticks, 40851 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 40 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 46764 sent, 41633 reached their opponent, 7638 virtual hits (18.3% of those reached).

## Melee bench: F25

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 664 over 6 battles (110.7 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 88.7 | 142 / 210 | 2.01 | 18.8% | 23948 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 18.8% | 142 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.2% | 17 |
| voidious.mini.BrokenSword 2.0.3 | 2.7 | 12.9% | 13 |
| jdw.Hurricane 1.4 | 4.0 | 11.8% | 20 |
| ds.Oo 2.2 | 5.5 | 9.1% | 9 |
| gre.svman4.Morfeas 1.4.1 | 5.8 | 9.0% | 6 |
| awesomeness.Elite 1.0 | 7.3 | 7.4% | 2 |
| adt.Ar2 1.1 | 7.3 | 7.1% | 1 |
| gjr.Cephalosporin 0.1 | 9.0 | 6.0% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 88.6 | 22 / 35 | 3808 |
| 2 | 1 | 70.1 | 94.0 | 27 / 35 | 4171 |
| 3 | 1 | 66.2 | 81.9 | 21 / 35 | 3724 |
| 4 | 1 | 66.2 | 82.5 | 19 / 35 | 3600 |
| 5 | 1 | 69.5 | 91.4 | 25 / 35 | 4317 |
| 6 | 1 | 70.0 | 94.0 | 28 / 35 | 4328 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 51 | 94% |
| voidious.micro.BlitzBat 1.05 | 48 | 88% |
| jdw.Hurricane 1.4 | 28 | 79% |
| ds.Oo 2.2 | 14 | 93% |
| gre.svman4.Morfeas 1.4.1 | 12 | 75% |
| gjr.Cephalosporin 0.1 | 4 | 100% |
| adt.Ar2 1.1 | 3 | 67% |
| amk.ChumbaMini 0.2 | 2 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 700. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 18 | 24% | 52 |
| voidious.mini.BrokenSword 2.0.3 | 14 | 18% | 52 |
| jdw.Hurricane 1.4 | 11 | 14% | 25 |
| ds.Oo 2.2 | 9 | 12% | 30 |
| adt.Ar2 1.1 | 5 | 7% | 9 |
| amk.ChumbaMini 0.2 | 5 | 7% | 8 |
| gre.svman4.Morfeas 1.4.1 | 4 | 5% | 15 |
| awesomeness.Elite 1.0 | 3 | 4% | 12 |
| gjr.Cephalosporin 0.1 | 0 | 0% | 7 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 129867 melee ticks, 33043 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 33 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 46080 sent, 41282 reached their opponent, 6668 virtual hits (16.2% of those reached).

## Melee bench: F26

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 626 over 6 battles (104.3 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 93.3 | 153 / 210 | 1.60 | 21.3% | 39293 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 21.3% | 153 |
| ak.Fermat 2.0 | 2.0 | 14.5% | 23 |
| lrem.Spectre 0.4.4 | 3.5 | 12.1% | 10 |
| shu.nitro.LENIN .T34 | 3.8 | 11.9% | 17 |
| jaybot.adv.bots.JayBot 2.0 | 5.0 | 10.0% | 4 |
| js.PinBall 1.6 | 5.7 | 10.3% | 3 |
| gh.mini.GrubbmOne 1.0 | 7.3 | 7.7% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 7.7 | 7.1% | 0 |
| sample.SpinBot 1.0 | 9.0 | 3.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 94.0 | 30 / 35 | 6630 |
| 2 | 1 | 71.9 | 93.3 | 19 / 35 | 6734 |
| 3 | 1 | 71.8 | 92.4 | 23 / 35 | 6422 |
| 4 | 1 | 73.0 | 95.6 | 29 / 35 | 6752 |
| 5 | 1 | 71.8 | 92.4 | 26 / 35 | 6171 |
| 6 | 1 | 72.3 | 92.4 | 26 / 35 | 6584 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 65 | 82% |
| lrem.Spectre 0.4.4 | 46 | 85% |
| shu.nitro.LENIN .T34 | 33 | 85% |
| js.PinBall 1.6 | 12 | 83% |
| fullsail.LaxativeTeaTwo 1.0 | 10 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 9 | 89% |
| gh.mini.GrubbmOne 1.0 | 4 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 947. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 19 | 31% | 70 |
| shu.nitro.LENIN .T34 | 14 | 23% | 44 |
| lrem.Spectre 0.4.4 | 11 | 18% | 44 |
| jaybot.adv.bots.JayBot 2.0 | 7 | 11% | 23 |
| js.PinBall 1.6 | 5 | 8% | 17 |
| sample.SpinBot 1.0 | 1 | 2% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 0 | 0% | 8 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 157994 melee ticks, 51701 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 74 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 74 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 51619 sent, 46724 reached their opponent, 11435 virtual hits (24.5% of those reached).

## Melee bench: F27

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 263 over 6 battles (43.8 per battle, most in one battle 112). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 82.8 | 134 / 210 | 2.55 | 18.8% | 31447 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.2 | 18.8% | 134 |
| mk.Alpha 0.2.1 | 2.0 | 14.0% | 41 |
| EH.Eagle 1.0.6 | 2.8 | 11.3% | 10 |
| sheldor.melee.nano.TestMelee 0.1 | 5.3 | 9.5% | 9 |
| techdude.kombat.FlamingKombat 1.5 | 5.5 | 9.2% | 3 |
| throxbot.ThroxBot 0.1 | 6.5 | 8.3% | 2 |
| joe.ADinosaur 1.0 | 6.8 | 8.6% | 1 |
| wee.Gem 1.8.4 | 7.3 | 8.4% | 9 |
| caimano.Furia_Ceca 0.22 | 7.7 | 7.8% | 3 |
| cs.Grudge 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 94.9 | 29 / 35 | 5129 |
| 2 | 1 | 71.2 | 94.0 | 27 / 35 | 5526 |
| 3 | 1 | 71.6 | 94.6 | 28 / 35 | 5764 |
| 4 | 1 | 63.5 | 67.6 | 13 / 35 | 4986 |
| 5 | 2 | 57.6 | 51.4 | 10 / 35 | 4475 |
| 6 | 1 | 71.1 | 94.3 | 27 / 35 | 5567 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 75 | 85% |
| EH.Eagle 1.0.6 | 34 | 94% |
| throxbot.ThroxBot 0.1 | 12 | 92% |
| sheldor.melee.nano.TestMelee 0.1 | 10 | 80% |
| wee.Gem 1.8.4 | 7 | 86% |
| techdude.kombat.FlamingKombat 1.5 | 6 | 100% |
| joe.ADinosaur 1.0 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 593. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 22 | 28% | 73 |
| cs.Grudge 1.0 | 17 | 22% | 16 |
| EH.Eagle 1.0.6 | 10 | 13% | 38 |
| sheldor.melee.nano.TestMelee 0.1 | 8 | 10% | 19 |
| throxbot.ThroxBot 0.1 | 5 | 6% | 23 |
| joe.ADinosaur 1.0 | 5 | 6% | 8 |
| caimano.Furia_Ceca 0.22 | 4 | 5% | 9 |
| wee.Gem 1.8.4 | 3 | 4% | 12 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 3% | 11 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 126077 melee ticks, 36069 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 49 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 40987 sent, 36282 reached their opponent, 9184 virtual hits (25.3% of those reached).

## Melee bench: F28

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 204 over 6 battles (34.0 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 89.5 | 134 / 210 | 1.94 | 18.5% | 24174 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 18.5% | 134 |
| kid.test.NightFox .2 | 2.0 | 14.3% | 32 |
| uji.Antique 1.0 | 4.0 | 10.6% | 9 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 10.9% | 15 |
| pfvicm.Sobieski 7.2.3b | 4.2 | 10.8% | 7 |
| ahr.ice.Ice 1.0.2 | 6.0 | 8.8% | 7 |
| amk.ChumbaWumba 0.3 | 6.8 | 8.1% | 3 |
| matt.advanced.Katana 1.0 | 8.3 | 6.3% | 2 |
| stelo.Lifestealer 1.0 | 9.0 | 6.2% | 0 |
| stelo.PianistNano 1.2 | 9.7 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 89.2 | 21 / 35 | 4262 |
| 2 | 1 | 66.8 | 87.9 | 22 / 35 | 3491 |
| 3 | 1 | 69.3 | 93.0 | 27 / 35 | 4381 |
| 4 | 1 | 68.3 | 91.1 | 23 / 35 | 4259 |
| 5 | 1 | 67.5 | 87.3 | 20 / 35 | 3896 |
| 6 | 1 | 67.1 | 88.6 | 21 / 35 | 3885 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 80 | 75% |
| uji.Antique 1.0 | 40 | 90% |
| qohnil.blot.BlotBot 3.61 | 17 | 76% |
| pfvicm.Sobieski 7.2.3b | 9 | 100% |
| amk.ChumbaWumba 0.3 | 7 | 71% |
| ahr.ice.Ice 1.0.2 | 7 | 86% |
| stelo.PianistNano 1.2 | 4 | 75% |
| stelo.Lifestealer 1.0 | 2 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 740. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 28 | 36% | 52 |
| pfvicm.Sobieski 7.2.3b | 15 | 19% | 30 |
| qohnil.blot.BlotBot 3.61 | 10 | 13% | 33 |
| uji.Antique 1.0 | 8 | 10% | 53 |
| amk.ChumbaWumba 0.3 | 7 | 9% | 15 |
| ahr.ice.Ice 1.0.2 | 6 | 8% | 18 |
| matt.advanced.Katana 1.0 | 1 | 1% | 3 |
| stelo.PianistNano 1.2 | 1 | 1% | 2 |
| stelo.Lifestealer 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 128204 melee ticks, 36995 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 54 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 2.

Targeting waves (202 rounds): 43333 sent, 38555 reached their opponent, 5599 virtual hits (14.5% of those reached).

## Melee bench: F29

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 507 over 6 battles (84.5 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 88.5 | 102 / 210 | 2.03 | 19.1% | 28954 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 19.1% | 102 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 15.0% | 50 |
| deewiant.Anomaly 0.2 | 2.7 | 14.9% | 43 |
| myl.micro.Troodon 1.10 | 4.0 | 11.9% | 7 |
| jok.PheonixM 0.1.2 | 4.8 | 10.4% | 5 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.4% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 7.3 | 6.0% | 0 |
| DBall.Anarchy 0.1 | 8.5 | 5.3% | 1 |
| ap.Frederick 1.1 | 8.5 | 5.0% | 0 |
| jangs.ns51 1.0 | 9.7 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 90.2 | 21 / 35 | 5202 |
| 2 | 1 | 68.6 | 86.7 | 14 / 35 | 4731 |
| 3 | 1 | 68.7 | 86.7 | 16 / 35 | 4807 |
| 4 | 1 | 68.7 | 86.7 | 17 / 35 | 4512 |
| 5 | 1 | 69.9 | 90.5 | 16 / 35 | 4937 |
| 6 | 1 | 69.7 | 90.5 | 18 / 35 | 4765 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 71 | 63% |
| zyx.mega.YersiniaPestis 3.1 | 53 | 55% |
| myl.micro.Troodon 1.10 | 23 | 87% |
| jok.PheonixM 0.1.2 | 8 | 88% |
| ph.melee.ArcherME 0.3 | 1 | 0% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 1056. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 57 | 50% | 99 |
| zyx.mega.YersiniaPestis 3.1 | 38 | 33% | 70 |
| myl.micro.Troodon 1.10 | 6 | 5% | 19 |
| jok.PheonixM 0.1.2 | 6 | 5% | 16 |
| ph.melee.ArcherME 0.3 | 3 | 3% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 173482 melee ticks, 54110 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 33 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 55611 sent, 50751 reached their opponent, 7600 virtual hits (15.0% of those reached).

## Melee bench: F30

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 608 over 6 battles (101.3 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 79.2 | 54 / 210 | 2.88 | 15.8% | 24082 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 15.8% | 54 |
| catcat20.Matcha 0.006 | 2.7 | 13.6% | 48 |
| darkcanuck.B26354 1.06 | 2.8 | 13.6% | 39 |
| stelo.PastFuture 2.3.2 | 4.2 | 12.1% | 21 |
| oog.melee.Capulet 1.2 | 4.3 | 12.1% | 30 |
| intruder.PrairieWolf 2.61 | 6.2 | 8.9% | 8 |
| tripphippy.Alice 1.1 | 7.7 | 7.8% | 5 |
| fowl3628800.LightningBolt 2.6.0 | 8.0 | 6.7% | 5 |
| ntc.Opposite 1.5 | 8.2 | 7.1% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 83.2 | 9 / 35 | 4018 |
| 2 | 1 | 62.4 | 74.0 | 10 / 35 | 3646 |
| 3 | 1 | 64.9 | 78.4 | 9 / 35 | 4274 |
| 4 | 1 | 64.6 | 80.3 | 8 / 35 | 4028 |
| 5 | 1 | 64.4 | 81.3 | 8 / 35 | 4051 |
| 6 | 1 | 63.9 | 77.8 | 10 / 35 | 4065 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 38 | 39% |
| oog.melee.Capulet 1.2 | 23 | 43% |
| darkcanuck.B26354 1.06 | 23 | 48% |
| stelo.PastFuture 2.3.2 | 13 | 46% |
| tripphippy.Alice 1.1 | 9 | 78% |
| intruder.PrairieWolf 2.61 | 6 | 50% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 67% |

Hadur died in 161 of 210 rounds, at a mean tick of 920. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 36 | 22% | 49 |
| darkcanuck.B26354 1.06 | 35 | 22% | 46 |
| stelo.PastFuture 2.3.2 | 29 | 18% | 36 |
| oog.melee.Capulet 1.2 | 25 | 16% | 37 |
| tripphippy.Alice 1.1 | 13 | 8% | 18 |
| intruder.PrairieWolf 2.61 | 9 | 6% | 13 |
| fowl3628800.LightningBolt 2.6.0 | 6 | 4% | 7 |
| ntc.Opposite 1.5 | 3 | 2% | 4 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 158364 melee ticks, 37634 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 72 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 51049 sent, 46100 reached their opponent, 7766 virtual hits (16.8% of those reached).

## Melee bench: F31

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 697 over 6 battles (116.2 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 81.9 | 62 / 210 | 2.63 | 16.2% | 22007 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.5 | 16.8% | 81 |
| hadur117.Hadur 3.20bs | 1.5 | 16.2% | 62 |
| gh.mini.Griezel 0.2 | 3.3 | 12.6% | 39 |
| d414.nano.Quantum 1.0.0 | 4.0 | 11.9% | 8 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 11.2% | 14 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.9% | 3 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.6% | 2 |
| fm.mammillarias 1.3 | 8.5 | 5.9% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 8.8 | 5.1% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 79.4 | 9 / 35 | 3505 |
| 2 | 1 | 67.0 | 84.4 | 14 / 35 | 4113 |
| 3 | 2 | 62.0 | 76.8 | 4 / 35 | 3256 |
| 4 | 2 | 64.9 | 81.9 | 12 / 35 | 3775 |
| 5 | 1 | 65.6 | 86.0 | 10 / 35 | 3554 |
| 6 | 1 | 65.6 | 82.5 | 13 / 35 | 3804 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 56 | 38% |
| gh.mini.Griezel 0.2 | 48 | 48% |
| d414.nano.Quantum 1.0.0 | 11 | 73% |
| spinnercat.micro.Tyger 0.1 | 10 | 60% |
| gh.nano.Grofvuil 0.2 | 4 | 75% |
| fm.mammillarias 1.3 | 2 | 50% |

Hadur died in 154 of 210 rounds, at a mean tick of 910. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 60 | 39% | 80 |
| gh.mini.Griezel 0.2 | 42 | 27% | 66 |
| d414.nano.Quantum 1.0.0 | 17 | 11% | 25 |
| spinnercat.micro.Tyger 0.1 | 11 | 7% | 14 |
| gh.nano.Grofvuil 0.2 | 7 | 5% | 13 |
| fm.mammillarias 1.3 | 6 | 4% | 6 |
| timmit.nano.TimDog 0.33 | 4 | 3% | 5 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 158030 melee ticks, 40687 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 808 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 445 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 50738 sent, 45724 reached their opponent, 7333 virtual hits (16.0% of those reached).

## Melee bench: F32

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 432 over 6 battles (72.0 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 91.1 | 145 / 210 | 1.80 | 19.3% | 28291 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 19.3% | 145 |
| kawigi.sbf.FloodHT 0.9.2 | 2.2 | 13.8% | 30 |
| apc.botM 3.0 | 3.0 | 12.1% | 22 |
| vjik.UnViolation 1.1 | 4.3 | 10.1% | 7 |
| lxx.ConceptA 0.8 | 4.7 | 10.4% | 1 |
| bayen.UbaMicro 1.4 | 5.8 | 8.6% | 1 |
| panzer.Panzer 0.2 | 7.8 | 7.3% | 0 |
| yk.JahMicro 1.0 | 8.2 | 6.6% | 4 |
| conscience.Electron 1.3g | 8.5 | 6.5% | 0 |
| donjezza.Jezza 1.0 | 9.5 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 92.1 | 24 / 35 | 4562 |
| 2 | 1 | 69.9 | 94.0 | 26 / 35 | 4958 |
| 3 | 1 | 68.6 | 91.1 | 24 / 35 | 4607 |
| 4 | 1 | 69.1 | 91.4 | 27 / 35 | 4813 |
| 5 | 1 | 67.8 | 87.6 | 20 / 35 | 4606 |
| 6 | 1 | 68.9 | 90.5 | 24 / 35 | 4745 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 80 | 81% |
| apc.botM 3.0 | 41 | 71% |
| vjik.UnViolation 1.1 | 23 | 83% |
| lxx.ConceptA 0.8 | 14 | 93% |
| donjezza.Jezza 1.0 | 7 | 100% |
| bayen.UbaMicro 1.4 | 5 | 100% |
| yk.JahMicro 1.0 | 5 | 80% |
| panzer.Panzer 0.2 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 24 | 35% | 84 |
| apc.botM 3.0 | 19 | 28% | 48 |
| vjik.UnViolation 1.1 | 6 | 9% | 30 |
| conscience.Electron 1.3g | 5 | 7% | 6 |
| panzer.Panzer 0.2 | 4 | 6% | 7 |
| bayen.UbaMicro 1.4 | 3 | 4% | 10 |
| lxx.ConceptA 0.8 | 2 | 3% | 13 |
| yk.JahMicro 1.0 | 2 | 3% | 6 |
| donjezza.Jezza 1.0 | 0 | 0% | 6 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 127584 melee ticks, 53769 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 64 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 2.

Targeting waves (206 rounds): 43173 sent, 38313 reached their opponent, 6988 virtual hits (18.2% of those reached).

## Melee bench: F33

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 214 over 6 battles (35.7 per battle, most in one battle 104). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.6 | 119 / 210 | 2.21 | 19.0% | 29212 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 19.0% | 119 |
| maribo.Quester 0.3 | 2.0 | 15.7% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.2% | 20 |
| labg.Cataclysm 2.05 | 4.3 | 10.7% | 14 |
| gre.svman4.Leonidas 1.3.2 | 4.7 | 10.8% | 17 |
| baal.nano.N 1.42 | 6.0 | 9.3% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 8.0% | 6 |
| sanja.First 0.1 | 8.3 | 5.4% | 0 |
| zyx.micro.Ant 1.1 | 8.7 | 5.3% | 2 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 86.7 | 22 / 35 | 4739 |
| 2 | 1 | 68.8 | 83.8 | 18 / 35 | 4922 |
| 3 | 1 | 68.4 | 85.1 | 18 / 35 | 4868 |
| 4 | 1 | 70.6 | 92.1 | 22 / 35 | 5189 |
| 5 | 1 | 69.4 | 88.6 | 21 / 35 | 4899 |
| 6 | 1 | 68.0 | 83.2 | 18 / 35 | 4595 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 60 | 85% |
| gre.svman4.Leonidas 1.3.2 | 28 | 71% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 69% |
| labg.Cataclysm 2.05 | 17 | 88% |
| baal.nano.N 1.42 | 6 | 100% |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 80% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 3 | 100% |
| zyx.micro.Ant 1.1 | 2 | 50% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 937. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 30 | 32% | 87 |
| gre.svman4.Leonidas 1.3.2 | 21 | 23% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 16% | 31 |
| labg.Cataclysm 2.05 | 10 | 11% | 31 |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 10% | 11 |
| zyx.micro.Ant 1.1 | 4 | 4% | 4 |
| baal.nano.N 1.42 | 2 | 2% | 9 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 3 |
| sanja.First 0.1 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 167879 melee ticks, 47470 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 62 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 54364 sent, 49414 reached their opponent, 7374 virtual hits (14.9% of those reached).

## Melee bench: F34

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 508 over 6 battles (84.7 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 87.2 | 91 / 210 | 2.15 | 18.5% | 31117 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.2 | 18.5% | 91 |
| kid.Gladiator .7.2 | 2.2 | 16.6% | 48 |
| stelo.Spread 0.9 | 2.7 | 15.6% | 52 |
| tcf.Reach 3 | 4.3 | 11.3% | 7 |
| jcs.Seth 1.8 | 4.7 | 11.1% | 12 |
| cli.Dancer 1.1 | 6.0 | 8.8% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.0% | 0 |
| amk.Punbot.Punbot 0.01 | 8.2 | 4.6% | 0 |
| sample.VelociRobot 1.0 | 8.8 | 3.7% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 88.6 | 18 / 35 | 5596 |
| 2 | 1 | 68.4 | 85.7 | 15 / 35 | 4973 |
| 3 | 2 | 67.4 | 83.8 | 9 / 35 | 4788 |
| 4 | 1 | 70.2 | 90.2 | 18 / 35 | 5390 |
| 5 | 1 | 68.9 | 87.0 | 15 / 35 | 5121 |
| 6 | 1 | 69.3 | 88.3 | 16 / 35 | 5249 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 59 | 59% |
| kid.Gladiator .7.2 | 57 | 61% |
| jcs.Seth 1.8 | 16 | 50% |
| tcf.Reach 3 | 12 | 83% |
| ratosh.Wesco 1.4 | 3 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 1054. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 46 | 37% | 76 |
| stelo.Spread 0.9 | 44 | 36% | 74 |
| tcf.Reach 3 | 14 | 11% | 25 |
| jcs.Seth 1.8 | 11 | 9% | 19 |
| ratosh.Wesco 1.4 | 3 | 2% | 6 |
| cli.Dancer 1.1 | 1 | 1% | 9 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 172840 melee ticks, 55137 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 39 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 53403 sent, 48538 reached their opponent, 8045 virtual hits (16.6% of those reached).

## Melee bench: F35

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 730 over 6 battles (121.7 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 85.4 | 52 / 210 | 2.31 | 16.6% | 22716 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.2 | 18.5% | 127 |
| hadur117.Hadur 3.20bs | 1.8 | 16.6% | 52 |
| gh.mini.Gruwel 0.9 | 3.3 | 12.8% | 18 |
| rz.HawkOnFire 0.1 | 4.2 | 12.1% | 4 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.5 | 11.5% | 8 |
| wit.Chuliath 1.0 | 6.8 | 6.7% | 2 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.2 | 6.3% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.7 | 5.8% | 0 |
| dans.Cinnamon 1.2 | 9.0 | 5.1% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.0 | 82.9 | 9 / 35 | 3677 |
| 2 | 1 | 66.8 | 87.9 | 12 / 35 | 3780 |
| 3 | 2 | 67.8 | 88.3 | 11 / 35 | 4247 |
| 4 | 2 | 65.0 | 82.9 | 9 / 35 | 3617 |
| 5 | 2 | 66.5 | 89.2 | 8 / 35 | 3697 |
| 6 | 2 | 64.5 | 81.6 | 3 / 35 | 3698 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 99 | 15% |
| gh.mini.Gruwel 0.9 | 21 | 57% |
| dmh.robocode.robot.BlackDeath 9.2 | 18 | 67% |
| rz.HawkOnFire 0.1 | 15 | 80% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 1007. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 106 | 65% | 127 |
| gh.mini.Gruwel 0.9 | 21 | 13% | 34 |
| dmh.robocode.robot.BlackDeath 9.2 | 11 | 7% | 18 |
| rz.HawkOnFire 0.1 | 10 | 6% | 19 |
| wit.Chuliath 1.0 | 4 | 2% | 4 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 2% | 4 |
| stelo.MyAgileRobot 0.2 | 3 | 2% | 3 |
| myl.nano.KomoriNinja 1.1 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 151530 melee ticks, 56684 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 25 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 46213 sent, 41277 reached their opponent, 6273 virtual hits (15.2% of those reached).

## Melee bench: F36

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 311 over 6 battles (51.8 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 92.5 | 156 / 210 | 1.68 | 20.8% | 32296 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 20.8% | 156 |
| bzdp.Pansy 2.1 | 2.8 | 12.1% | 12 |
| alpha.RainingFire 1.0 | 2.8 | 12.1% | 13 |
| mz.Cork 0.1 | 4.5 | 10.9% | 7 |
| bvh.micro.Freya 0.3 | 4.7 | 11.0% | 8 |
| m3thos.Eva02 0.7.1 | 5.5 | 10.1% | 10 |
| bvh.mini.Fenrir 0.39 | 6.7 | 9.4% | 4 |
| dl.BetterWalls 1.0 | 8.5 | 4.9% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.8 | 4.8% | 0 |
| sample.MyFirstRobot 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 94.9 | 27 / 35 | 5487 |
| 2 | 1 | 71.5 | 93.0 | 30 / 35 | 5381 |
| 3 | 1 | 71.5 | 92.7 | 26 / 35 | 5547 |
| 4 | 1 | 68.5 | 86.7 | 19 / 35 | 4661 |
| 5 | 1 | 72.6 | 96.5 | 30 / 35 | 5881 |
| 6 | 1 | 70.5 | 91.1 | 24 / 35 | 5339 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.micro.Freya 0.3 | 42 | 98% |
| bzdp.Pansy 2.1 | 38 | 95% |
| mz.Cork 0.1 | 36 | 89% |
| alpha.RainingFire 1.0 | 29 | 76% |
| m3thos.Eva02 0.7.1 | 17 | 76% |
| bvh.mini.Fenrir 0.39 | 13 | 85% |
| sample.MyFirstRobot 1.0 | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 848. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 15 | 27% | 39 |
| mz.Cork 0.1 | 9 | 16% | 42 |
| bvh.mini.Fenrir 0.39 | 9 | 16% | 19 |
| m3thos.Eva02 0.7.1 | 8 | 14% | 26 |
| bzdp.Pansy 2.1 | 7 | 13% | 39 |
| bvh.micro.Freya 0.3 | 5 | 9% | 38 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 3 |
| dl.BetterWalls 1.0 | 0 | 0% | 2 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 146440 melee ticks, 45533 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 42 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 50239 sent, 45566 reached their opponent, 9365 virtual hits (20.6% of those reached).

## Melee bench: F37

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 150 over 6 battles (25.0 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.7 | 159 / 210 | 2.01 | 19.5% | 34270 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 19.5% | 159 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.8 | 11.2% | 9 |
| germ.TheMind .2 | 4.0 | 10.1% | 6 |
| EBBU.Sim2 1.02 | 4.2 | 9.6% | 5 |
| lmk.ACPFinal 0.1 | 4.5 | 9.3% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 6.7 | 8.6% | 1 |
| stelo.UntouchableNano 1.3 | 7.2 | 8.2% | 8 |
| agrach.Dalek 1.0 | 7.2 | 8.3% | 5 |
| mb.Beast 0.1 | 8.5 | 7.7% | 5 |
| skm.Ryubot 1.0 | 9.0 | 7.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 86.3 | 26 / 35 | 5693 |
| 2 | 1 | 67.1 | 83.5 | 23 / 35 | 5528 |
| 3 | 1 | 70.5 | 94.9 | 29 / 35 | 6137 |
| 4 | 1 | 69.4 | 91.7 | 27 / 35 | 5898 |
| 5 | 1 | 70.9 | 95.9 | 31 / 35 | 6093 |
| 6 | 1 | 65.7 | 80.0 | 23 / 35 | 4921 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 29 | 100% |
| germ.TheMind .2 | 22 | 100% |
| mb.Beast 0.1 | 20 | 95% |
| EBBU.Sim2 1.02 | 20 | 100% |
| stelo.UntouchableNano 1.3 | 20 | 85% |
| lmk.ACPFinal 0.1 | 18 | 100% |
| agrach.Dalek 1.0 | 17 | 100% |
| skm.Ryubot 1.0 | 16 | 94% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 396. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 11 | 21% | 16 |
| com.syncleus.robocode.Dreadnaught 0.1 | 8 | 15% | 44 |
| lmk.ACPFinal 0.1 | 8 | 15% | 25 |
| EBBU.Sim2 1.02 | 8 | 15% | 24 |
| stelo.UntouchableNano 1.3 | 6 | 12% | 26 |
| agrach.Dalek 1.0 | 3 | 6% | 28 |
| germ.TheMind .2 | 3 | 6% | 20 |
| mb.Beast 0.1 | 3 | 6% | 17 |
| skm.Ryubot 1.0 | 2 | 4% | 5 |

Posture (Hadur's M records, 199 rounds): 92274 melee ticks, 25020 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 66 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 31301 sent, 26907 reached their opponent, 7982 virtual hits (29.7% of those reached).

## Melee bench: F38

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 439 over 6 battles (73.2 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.6 | 121 / 210 | 2.02 | 18.7% | 28193 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 18.7% | 121 |
| justin.Mallais 14.0 | 2.0 | 15.5% | 50 |
| bvh.mini.Freya 0.55 | 3.3 | 12.2% | 9 |
| bts.mega.Gnarly 1.4 | 4.7 | 10.6% | 12 |
| cs.Wren 1.0 | 5.0 | 10.7% | 5 |
| kdf.KoulDestroyer 1.0 | 5.2 | 9.7% | 5 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.8 | 8.2% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.4% | 2 |
| bzdp.BoxCar 2.0 | 9.5 | 3.9% | 0 |
| matt.UnderDark3 2.4.34 | 9.5 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 87.3 | 19 / 35 | 4623 |
| 2 | 1 | 66.6 | 81.9 | 19 / 35 | 4351 |
| 3 | 1 | 69.3 | 91.7 | 22 / 35 | 4591 |
| 4 | 1 | 68.3 | 89.8 | 17 / 35 | 4679 |
| 5 | 1 | 70.6 | 92.4 | 26 / 35 | 5157 |
| 6 | 1 | 68.6 | 88.6 | 18 / 35 | 4792 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 65 | 69% |
| bts.mega.Gnarly 1.4 | 24 | 75% |
| bvh.mini.Freya 0.55 | 21 | 81% |
| cs.Wren 1.0 | 21 | 90% |
| kdf.KoulDestroyer 1.0 | 14 | 93% |
| davidalves.net.DuelistNanoMelee 1.01 | 7 | 71% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 783. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 36 | 39% | 84 |
| bts.mega.Gnarly 1.4 | 16 | 17% | 35 |
| bvh.mini.Freya 0.55 | 16 | 17% | 31 |
| kdf.KoulDestroyer 1.0 | 9 | 10% | 20 |
| cs.Wren 1.0 | 8 | 9% | 25 |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 4% | 10 |
| kawigi.spare.SpareParts 0.7.6nosnd | 0 | 0% | 4 |
| bzdp.BoxCar 2.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 139582 melee ticks, 38943 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 41 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 2.

Targeting waves (206 rounds): 45563 sent, 40473 reached their opponent, 8662 virtual hits (21.4% of those reached).

## Melee bench: F39

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 725 over 6 battles (120.8 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 87.0 | 96 / 210 | 2.17 | 18.5% | 31095 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 18.5% | 96 |
| bvh.fry.Freya 0.82 | 2.0 | 14.7% | 15 |
| az.Ololobot 0.2.4 | 3.2 | 13.7% | 58 |
| catcat20.Lambda 0.024 | 3.8 | 11.7% | 32 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.4% | 2 |
| stelo.SoRobotNanoMelee 1.2 | 6.2 | 7.6% | 6 |
| gimp.GimpBot 0.1 | 6.5 | 7.9% | 0 |
| apollokidd.ApolloKidd 0.9 | 7.7 | 7.1% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.4% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 89.8 | 19 / 35 | 5693 |
| 2 | 1 | 70.0 | 92.7 | 21 / 35 | 5477 |
| 3 | 1 | 65.8 | 80.6 | 13 / 35 | 4623 |
| 4 | 1 | 68.9 | 88.9 | 16 / 35 | 5286 |
| 5 | 1 | 66.1 | 82.5 | 9 / 35 | 4900 |
| 6 | 1 | 68.1 | 87.6 | 18 / 35 | 5116 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 58 | 47% |
| bvh.fry.Freya 0.82 | 42 | 90% |
| catcat20.Lambda 0.024 | 33 | 55% |
| winamp32.micro.MicroMacro 1.0 | 7 | 71% |
| gimp.GimpBot 0.1 | 2 | 100% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 2 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 1071. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 47 | 39% | 77 |
| bvh.fry.Freya 0.82 | 38 | 32% | 69 |
| catcat20.Lambda 0.024 | 19 | 16% | 35 |
| winamp32.micro.MicroMacro 1.0 | 6 | 5% | 14 |
| gimp.GimpBot 0.1 | 2 | 2% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 2 | 2% | 4 |
| apollokidd.ApolloKidd 0.9 | 0 | 0% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 169971 melee ticks, 53606 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 48 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 53030 sent, 48137 reached their opponent, 8580 virtual hits (17.8% of those reached).

## Melee bench: F40

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 188 over 6 battles (31.3 per battle, most in one battle 98). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 90.5 | 134 / 210 | 1.86 | 20.0% | 31280 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 20.0% | 134 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.7% | 29 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.1% | 17 |
| mz.AntiGrav 1.0 | 4.0 | 10.8% | 2 |
| Polkwane.SmashMelee 1.0 | 5.7 | 10.0% | 17 |
| stelo.Randomness 1.0 | 6.0 | 9.0% | 9 |
| alpha.BlackIce 1.0 | 6.3 | 9.1% | 1 |
| amk.superstrike.SuperStrike 0.3 | 7.8 | 6.7% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 4.2% | 1 |
| sample.Corners 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 90.5 | 21 / 35 | 4941 |
| 2 | 1 | 70.0 | 90.2 | 22 / 35 | 5161 |
| 3 | 1 | 71.2 | 93.3 | 25 / 35 | 5461 |
| 4 | 1 | 70.6 | 89.8 | 23 / 35 | 5309 |
| 5 | 1 | 69.8 | 90.2 | 21 / 35 | 5124 |
| 6 | 1 | 70.0 | 88.9 | 22 / 35 | 5284 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 67 | 81% |
| kano.gamma.KanoGamma 1.8 | 36 | 72% |
| mz.AntiGrav 1.0 | 22 | 100% |
| Polkwane.SmashMelee 1.0 | 22 | 82% |
| stelo.Randomness 1.0 | 11 | 64% |
| alpha.BlackIce 1.0 | 6 | 83% |
| amk.superstrike.SuperStrike 0.3 | 2 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 877. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 28 | 36% | 67 |
| kano.gamma.KanoGamma 1.8 | 16 | 21% | 46 |
| Polkwane.SmashMelee 1.0 | 11 | 14% | 19 |
| stelo.Randomness 1.0 | 8 | 10% | 26 |
| alpha.BlackIce 1.0 | 7 | 9% | 14 |
| mz.AntiGrav 1.0 | 4 | 5% | 24 |
| amk.superstrike.SuperStrike 0.3 | 3 | 4% | 10 |
| sample.Corners 1.0 | 0 | 0% | 2 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 151577 melee ticks, 42497 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 125 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 125 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 49727 sent, 44805 reached their opponent, 9143 virtual hits (20.4% of those reached).

## Melee bench: F41

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 197 over 6 battles (32.8 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 89.0 | 104 / 210 | 1.99 | 18.5% | 26788 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.2 | 18.5% | 104 |
| eem.EvBotNG v12.8 | 1.8 | 16.1% | 70 |
| ary.Swarm 1.1 | 3.5 | 12.6% | 13 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.5% | 13 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.0% | 7 |
| shrub.Silver v048 | 6.0 | 8.9% | 1 |
| zyx.nano.Ant 1.1 | 7.0 | 7.7% | 0 |
| jsal.Jsalbot 1.0 | 8.2 | 5.7% | 2 |
| stelo.Mirror 1.1 | 8.8 | 4.9% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 91.4 | 18 / 35 | 4372 |
| 2 | 1 | 69.7 | 92.7 | 20 / 35 | 4408 |
| 3 | 2 | 67.6 | 86.7 | 14 / 35 | 4059 |
| 4 | 1 | 68.2 | 87.6 | 17 / 35 | 4252 |
| 5 | 1 | 69.3 | 88.6 | 18 / 35 | 4838 |
| 6 | 1 | 68.8 | 87.0 | 17 / 35 | 4859 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 85 | 44% |
| lessonz.robocode.Oz 0.5.0 | 33 | 94% |
| ary.Swarm 1.1 | 27 | 67% |
| simonton.nano.MeleeSeed 1.8 | 15 | 87% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| shrub.Silver v048 | 3 | 67% |

Hadur died in 107 of 210 rounds, at a mean tick of 1020. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 62 | 58% | 101 |
| ary.Swarm 1.1 | 17 | 16% | 28 |
| simonton.nano.MeleeSeed 1.8 | 11 | 10% | 24 |
| lessonz.robocode.Oz 0.5.0 | 10 | 9% | 36 |
| shrub.Silver v048 | 4 | 4% | 6 |
| stelo.Mirror 1.1 | 1 | 1% | 6 |
| zyx.nano.Ant 1.1 | 1 | 1% | 3 |
| jsal.Jsalbot 1.0 | 0 | 0% | 6 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 158529 melee ticks, 50658 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 104 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 104 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 51493 sent, 46563 reached their opponent, 7198 virtual hits (15.5% of those reached).

## Melee bench: F42

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 320 over 6 battles (53.3 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 91.5 | 139 / 210 | 1.77 | 20.2% | 34694 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 20.2% | 139 |
| wompi.Wallaby 5.1 | 2.0 | 15.3% | 35 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.2% | 11 |
| ara.Shera 0.88 | 3.7 | 13.0% | 23 |
| amz.NanoClone 1.41 | 5.0 | 8.9% | 0 |
| dsw.StaticD 1.0 | 6.5 | 7.2% | 2 |
| stelo.MirrorMicro 1.0 | 7.5 | 6.0% | 0 |
| maribo.IotaCT 1.1 | 7.8 | 6.1% | 0 |
| mme.NikeEnhanced 2.0 | 8.3 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 90.8 | 23 / 35 | 5871 |
| 2 | 1 | 69.3 | 89.2 | 18 / 35 | 5438 |
| 3 | 1 | 71.2 | 93.7 | 26 / 35 | 5808 |
| 4 | 1 | 70.9 | 91.1 | 26 / 35 | 5843 |
| 5 | 1 | 69.4 | 88.3 | 18 / 35 | 5590 |
| 6 | 1 | 72.2 | 95.9 | 28 / 35 | 6144 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 90 | 89% |
| maribo.mini.MiniQuester 0.1 | 36 | 81% |
| ara.Shera 0.88 | 34 | 71% |
| dsw.StaticD 1.0 | 4 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 928. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 27 | 37% | 53 |
| wompi.Wallaby 5.1 | 23 | 32% | 97 |
| maribo.mini.MiniQuester 0.1 | 16 | 22% | 43 |
| dsw.StaticD 1.0 | 2 | 3% | 7 |
| amz.NanoClone 1.41 | 2 | 3% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 2 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 2 |
| maribo.IotaCT 1.1 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 158475 melee ticks, 52761 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 39 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 50849 sent, 46056 reached their opponent, 8827 virtual hits (19.2% of those reached).

## Melee bench: F43

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 567 over 6 battles (94.5 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 79.8 | 34 / 210 | 2.81 | 15.7% | 24014 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.1% | 130 |
| hadur117.Hadur 3.20bs | 2.0 | 15.7% | 34 |
| brainfade.melee.Dusk 0.44 | 3.3 | 13.0% | 32 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.8% | 10 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 11.1% | 4 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.8% | 2 |
| mz.NanoGod 2.02 | 7.5 | 7.2% | 1 |
| jab.DiamondStealer 5 | 7.5 | 7.1% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.8% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 79.7 | 8 / 35 | 3841 |
| 2 | 2 | 65.8 | 79.7 | 6 / 35 | 3953 |
| 3 | 2 | 65.6 | 79.4 | 5 / 35 | 3903 |
| 4 | 2 | 66.1 | 80.6 | 6 / 35 | 4385 |
| 5 | 2 | 65.7 | 80.0 | 5 / 35 | 3921 |
| 6 | 2 | 65.5 | 79.7 | 4 / 35 | 4011 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 84 | 18% |
| brainfade.melee.Dusk 0.44 | 22 | 32% |
| dummy.micro.Sparrow 2.5 | 10 | 50% |
| wcsv.melee.EngineerMelee 0.1 | 7 | 71% |
| Krabb.akim2.Akim2 1.1b | 3 | 67% |
| mz.NanoGod 2.02 | 1 | 0% |

Hadur died in 183 of 210 rounds, at a mean tick of 1022. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 105 | 57% | 120 |
| brainfade.melee.Dusk 0.44 | 27 | 15% | 33 |
| dummy.micro.Sparrow 2.5 | 20 | 11% | 23 |
| wcsv.melee.EngineerMelee 0.1 | 13 | 7% | 21 |
| mz.NanoGod 2.02 | 5 | 3% | 5 |
| Krabb.akim2.Akim2 1.1b | 4 | 2% | 6 |
| jab.DiamondStealer 5 | 2 | 1% | 2 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 156883 melee ticks, 57506 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 36 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 36 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 50217 sent, 45188 reached their opponent, 7264 virtual hits (16.1% of those reached).

## Melee bench: F44

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 304 over 6 battles (50.7 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 91.3 | 141 / 210 | 1.78 | 20.5% | 34242 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 20.5% | 141 |
| stelo.Liblix 0.3.1 | 2.0 | 15.8% | 41 |
| tzu.TheArtOfWar 1.2 | 3.0 | 13.9% | 18 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.5 | 9.7% | 2 |
| jwirde.Gort 2.0 | 5.0 | 9.1% | 4 |
| disan.Chair 2.2.0 | 5.7 | 8.2% | 2 |
| wompi.Quokka 1.6 | 7.3 | 7.2% | 1 |
| stf.PanzerGeneral 0.1 | 7.5 | 6.4% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.7% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 89.8 | 21 / 35 | 5412 |
| 2 | 1 | 72.2 | 94.3 | 29 / 35 | 5879 |
| 3 | 1 | 68.9 | 84.4 | 19 / 35 | 5453 |
| 4 | 1 | 72.3 | 95.6 | 25 / 35 | 6062 |
| 5 | 1 | 70.2 | 88.9 | 22 / 35 | 5484 |
| 6 | 1 | 71.7 | 94.9 | 25 / 35 | 5952 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 90 | 77% |
| tzu.TheArtOfWar 1.2 | 51 | 86% |
| jwirde.Gort 2.0 | 10 | 90% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 10 | 100% |
| disan.Chair 2.2.0 | 5 | 100% |
| wompi.Quokka 1.6 | 2 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 0% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 950. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 40 | 56% | 109 |
| tzu.TheArtOfWar 1.2 | 19 | 27% | 59 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 6% | 14 |
| jwirde.Gort 2.0 | 2 | 3% | 11 |
| disan.Chair 2.2.0 | 2 | 3% | 6 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 2 |
| stf.PanzerGeneral 0.1 | 0 | 0% | 4 |
| wompi.Quokka 1.6 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 159546 melee ticks, 51866 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 63 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 2.

Targeting waves (205 rounds): 53822 sent, 49018 reached their opponent, 10308 virtual hits (21.0% of those reached).

## Melee bench: F45

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 696 over 6 battles (116.0 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.2 | 107 / 210 | 2.06 | 19.6% | 32329 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.0 | 19.6% | 107 |
| jje.BagPuss 1.2 | 2.8 | 12.1% | 2 |
| eem.IWillFireNoBullet v2.8 | 3.5 | 10.5% | 72 |
| myl.nano.Graviton 1.10 | 4.2 | 10.8% | 5 |
| sul.Lunar 1.1 | 4.3 | 10.9% | 18 |
| hvilela.HVilela 0.9 | 6.2 | 9.3% | 2 |
| fm.claire 1.7 | 6.8 | 8.9% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.5 | 8.0% | 1 |
| wit.Deep7 2.0 | 9.0 | 5.4% | 2 |
| abud.ThirdRobo 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 84.1 | 17 / 35 | 5887 |
| 2 | 1 | 70.0 | 90.2 | 14 / 35 | 5906 |
| 3 | 1 | 69.5 | 89.5 | 16 / 35 | 5386 |
| 4 | 1 | 70.3 | 90.8 | 23 / 35 | 4052 |
| 5 | 1 | 69.8 | 89.5 | 19 / 35 | 5537 |
| 6 | 1 | 68.9 | 85.1 | 18 / 35 | 5561 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 73 | 47% |
| jje.BagPuss 1.2 | 26 | 96% |
| sul.Lunar 1.1 | 25 | 72% |
| myl.nano.Graviton 1.10 | 22 | 82% |
| pez.mini.ChironexFleckeri 0.5 | 7 | 86% |
| wit.Deep7 2.0 | 5 | 80% |
| fm.claire 1.7 | 3 | 67% |
| hvilela.HVilela 0.9 | 1 | 0% |

Hadur died in 110 of 210 rounds, at a mean tick of 1450. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 43 | 39% | 0 |
| jje.BagPuss 1.2 | 19 | 17% | 67 |
| myl.nano.Graviton 1.10 | 13 | 12% | 38 |
| sul.Lunar 1.1 | 11 | 10% | 41 |
| fm.claire 1.7 | 7 | 6% | 18 |
| pez.mini.ChironexFleckeri 0.5 | 4 | 4% | 21 |
| hvilela.HVilela 0.9 | 4 | 4% | 14 |
| wit.Deep7 2.0 | 2 | 2% | 6 |
| abud.ThirdRobo 1.0 | 1 | 1% | 4 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 183279 melee ticks, 92342 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 63 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 57763 sent, 52851 reached their opponent, 7956 virtual hits (15.1% of those reached).

## Melee bench: F46

hadur117.Hadur 3.20bs against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 709 over 6 battles (118.2 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 85.8 | 68 / 210 | 2.28 | 16.9% | 24927 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bs | 1.7 | 16.9% | 68 |
| kc.mini.Mirage 0.2 | 2.0 | 16.3% | 50 |
| rsalesc.melee.Medina 0.4.5 | 2.3 | 16.4% | 82 |
| mz.MicroSheep 1.0 | 4.3 | 10.8% | 2 |
| cx.Princess 1.0 | 5.0 | 10.1% | 6 |
| sadoner.killer 0.2 | 5.7 | 9.2% | 1 |
| arthord.NanoSatanMelee Beta | 7.2 | 6.9% | 1 |
| kurios.DOSexe .9a | 8.3 | 5.2% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.5 | 5.4% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.8 | 83.5 | 10 / 35 | 4146 |
| 2 | 1 | 66.4 | 85.4 | 13 / 35 | 3888 |
| 3 | 2 | 65.7 | 84.4 | 9 / 35 | 4041 |
| 4 | 1 | 67.4 | 87.3 | 12 / 35 | 4397 |
| 5 | 1 | 66.8 | 86.3 | 14 / 35 | 4086 |
| 6 | 2 | 67.1 | 87.6 | 10 / 35 | 4369 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 60 | 67% |
| rsalesc.melee.Medina 0.4.5 | 57 | 18% |
| cx.Princess 1.0 | 15 | 73% |
| mz.MicroSheep 1.0 | 5 | 60% |
| sadoner.killer 0.2 | 2 | 100% |
| arthord.NanoSatanMelee Beta | 2 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 997. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 65 | 44% | 75 |
| kc.mini.Mirage 0.2 | 52 | 35% | 93 |
| cx.Princess 1.0 | 8 | 5% | 16 |
| mz.MicroSheep 1.0 | 8 | 5% | 12 |
| sadoner.killer 0.2 | 5 | 3% | 7 |
| arthord.NanoSatanMelee Beta | 2 | 1% | 5 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |
| kurios.DOSexe .9a | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 148501 melee ticks, 57035 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 33 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 44434 sent, 39515 reached their opponent, 5842 virtual hits (14.8% of those reached).

